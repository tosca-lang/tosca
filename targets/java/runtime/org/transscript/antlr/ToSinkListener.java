// Copyright (c) 2015 IBM Corporation.

package org.transscript.antlr;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.transscript.compiler.parser.TransScript.TransScript_term_sort;
import org.transscript.runtime.BufferSink;
import org.transscript.runtime.ConstructionDescriptor;
import org.transscript.runtime.Sink;
import org.transscript.runtime.StringTerm;
import org.transscript.runtime.Variable;
import org.transscript.runtime.utils.Pair;
import org.transscript.runtime.utils.Scoping;
import org.transscript.runtime.utils.StringUtils;
import org.transscript.tool.MetaBufferSink;
import org.transscript.tool.MetaSink;
import org.transscript.tool.MutableInt;
import org.transscript.tool.TermBufferSink;

/**
 * Convert custom ANTLR parse tree events to {@link Sink} events.
 * 
 * <p>Works with meta parsers annotated with special actions driving
 * the mapping between grammar and terms.
 * 
 * <p>This listener supports two kinds of sink: {@link Sink} and {@link MetaSink}.
 * {@link MetaSink} support is only needed for parsing embedded terms during meta-compilation.
 * Non-Java runtimes don't need to support {@link MetaSink}.
 * 
 * @author Lionel Villard
 */
public class ToSinkListener implements ParseTreeListener
{
	// Static helper

	public static void fireEnterZOM(List<ParseTreeListener> listeners, ParserRuleContext _ctx)
	{
		fire(listeners, _ctx, l -> ((ToSinkListener) l).enterZOM(_ctx));
	}

	public static void fireExitZOM(List<ParseTreeListener> listeners, ParserRuleContext _ctx)
	{
		fire(listeners, _ctx, l -> ((ToSinkListener) l).exitZOM(_ctx));
	}

	public static void fireEnterOPT(List<ParseTreeListener> listeners, ParserRuleContext _ctx)
	{
		fire(listeners, _ctx, l -> ((ToSinkListener) l).enterOPT(_ctx));
	}

	public static void fireExitOPT(List<ParseTreeListener> listeners, ParserRuleContext _ctx)
	{
		fire(listeners, _ctx, l -> ((ToSinkListener) l).exitOPT(_ctx));
	}

	public static void fireEnterAlt(List<ParseTreeListener> listeners, ParserRuleContext _ctx)
	{
		fire(listeners, _ctx, l -> ((ToSinkListener) l).enterAlt(_ctx));
	}

	public static void fireEnterAlt(List<ParseTreeListener> listeners, ParserRuleContext _ctx, String name)
	{
		fire(listeners, _ctx, l -> ((ToSinkListener) l).enterAlt(_ctx, name));
	}

	public static void fireExitAlt(List<ParseTreeListener> listeners, ParserRuleContext _ctx)
	{
		fire(listeners, _ctx, l -> ((ToSinkListener) l).exitAlt(_ctx));
	}

	public static void fireHide(List<ParseTreeListener> listeners, ParserRuleContext _ctx)
	{
		fire(listeners, _ctx, l -> ((ToSinkListener) l).hide(_ctx));
	}

	public static void fireTerm(List<ParseTreeListener> listeners, ParserRuleContext _ctx, String type)
	{
		fire(listeners, _ctx, l -> ((ToSinkListener) l).term(_ctx, type));
	}

	public static void fireTail(List<ParseTreeListener> listeners, ParserRuleContext _ctx)
	{
		fire(listeners, _ctx, l -> ((ToSinkListener) l).tail(_ctx));
	}

	public static void fireEmbed(List<ParseTreeListener> listeners, ParserRuleContext _ctx)
	{
		fire(listeners, _ctx, l -> ((ToSinkListener) l).embed(_ctx));
	}

	public static void fireEnterSymbol(List<ParseTreeListener> listeners, ParserRuleContext _ctx, String type)
	{
		fire(listeners, _ctx, l -> ((ToSinkListener) l).enterSymbol(_ctx, type));
	}

	public static void fireEnterSymbol(List<ParseTreeListener> listeners, ParserRuleContext _ctx)
	{
		fire(listeners, _ctx, l -> ((ToSinkListener) l).enterSymbol(_ctx, "String"));
	}

	public static void fireExitSymbol(List<ParseTreeListener> listeners, ParserRuleContext _ctx)
	{
		fire(listeners, _ctx, l -> ((ToSinkListener) l).exitSymbol(_ctx));
	}

	public static void fireEnterBinder(List<ParseTreeListener> listeners, ParserRuleContext _ctx, String name, String type)
	{
		fire(listeners, _ctx, l -> ((ToSinkListener) l).enterBinder(_ctx, name, type));
	}

	public static void fireEnterBinder(List<ParseTreeListener> listeners, ParserRuleContext _ctx, String name)
	{
		fire(listeners, _ctx, l -> ((ToSinkListener) l).enterBinder(_ctx, name, "String"));
	}

	public static void fireExitBinder(List<ParseTreeListener> listeners, ParserRuleContext _ctx)
	{
		fire(listeners, _ctx, l -> ((ToSinkListener) l).exitBinder(_ctx));
	}

	public static void fireEnterBinds(List<ParseTreeListener> listeners, ParserRuleContext _ctx, String names)
	{
		fire(listeners, _ctx, l -> ((ToSinkListener) l).enterBinds(_ctx, names));
	}

	public static void fireExitBinds(List<ParseTreeListener> listeners, ParserRuleContext _ctx)
	{
		fire(listeners, _ctx, l -> ((ToSinkListener) l).exitBinds(_ctx));
	}

	private static void fire(List<ParseTreeListener> listeners, ParserRuleContext _ctx, Consumer<ParseTreeListener> apply)
	{
		if (listeners != null)
			listeners.stream().filter(l -> l instanceof ToSinkListener).forEach(apply);
	}

	// Some enums

	enum State {
		PARSE, START_EMBED, PARSE_EMBED, NAME, CONCRETE, END_CONCRETE, END_CONCRETE_TERM, SKIP
	}

	enum TokenKind {
		STRING, NUMERIC, METAVAR
	}

	// The state.

	/** TransScript sink */
	private Sink sink;

	/** The List construction descriptors */
	final protected ConstructionDescriptor nilDesc;
	final protected ConstructionDescriptor consDesc;

	private ArrayDeque<Pair<MutableInt, String>> consCount;
	private ArrayDeque<ParserRuleContext> ruleContext;

	/** The ANTLR4 parser */
	private TSParser parser;

	/** Parsing transscript? */
	final private boolean parsets;

	/** Constructor name prefix */
	private String prefix;

	/** Language specific meta variable prefix */
	private String metachar;

	/** Whether the next token represent the tail of a list. */
	private boolean tail;

	/** When non-null, indicates received tokens are parts of a name, to associate to this id */
	private String binderId;

	/** Name being constructed. Whitespace are ignored. */
	private String binderName;

	/** Type of the name being constructed. Whitespace are ignored. */
	private String binderType;

	/** Pending bound variable. See enterBinder/enterBounds */
	private ArrayDeque<Pair<String, Pair<String, String>>> pendingBounds;

	/** In scope bound variables. */
	private Scoping bounds;

	/** In scope free/fresh variables. */
	private Scoping freshes;

	/** Current token sort */
	private TokenKind kind;

	/** Meta term type */
	private String termType;

	/** Listener state */
	private State state;

	/**
	 * Create an TS ANTLR listener 
	 * @param sink      where to send events
	 * @param prefix    prefix to apply to constructor names
	 * @param metachar  language specific meta variable prefix
	 * @param parser    using this listener
	 * @param bounds    bound variables. Modifiable.      
	 * @param freshes   global fresh variables. Modifiable.
	 */
	public ToSinkListener(Sink sink, String prefix, String metachar, TSParser parser, Scoping bounds, Scoping freshes)
	{
		this.sink = sink;
		this.consCount = new ArrayDeque<>();
		this.ruleContext = new ArrayDeque<>();

		this.parser = parser;
		this.prefix = prefix;
		this.metachar = metachar;
		this.state = State.PARSE;
		this.kind = TokenKind.STRING;

		this.pendingBounds = new ArrayDeque<>();
		this.bounds = bounds;
		this.freshes = freshes;

		this.nilDesc = sink.context().lookupDescriptor("Nil");
		this.consDesc = sink.context().lookupDescriptor("Cons");
		this.parsets = prefix.equals("TransScript_");
	}

	/**
	 *  Send location properties 
	 */
	protected void sendLocation(Token token)
	{
		// TODO
		//		int column = token.getCharPositionInLine();
		//		int line = token.getLine();
		//		return Util.wrapWithLocation(sink, c, parser.getInputStream().getSourceName(), line, column);
	}

	/**
	 * Receive the notification the next sequence of tokens are list items.
	 * 
	 * <p>Constructs nested Cons(..., ...) and Nil terms. 
	 * 
	 * @param context
	 */
	public void enterZOM(ParserRuleContext context)
	{
		if (parser.getNumberOfSyntaxErrors() > 0)
			return;

		ParserRuleContext parentCtx = ruleContext.peek();
		String ruleName = parser.getRuleNames()[parentCtx.getRuleIndex()];
		String type = fixupType(ruleName);

		consCount.push(new Pair<>(new MutableInt(0), type));
		tail = false;
	}

	/**
	 * Closing list.
	 * @param context
	 */
	public void exitZOM(ParserRuleContext context)
	{
		if (parser.getNumberOfSyntaxErrors() > 0)
			return;

		if (!tail)
			sink.start(nilDesc).end();

		int count = consCount.pop().fst.v;
		while (count-- > 0)
		{
			sink.end();
		}
		tail = false;
	}

	/**
	 * Receive the notification the next token is optional.
	 * @param context
	 */
	public void enterOPT(ParserRuleContext context)
	{
		enterZOM(context);
	}

	/**
	 * Closing optional token
	 * @param context
	 */
	public void exitOPT(ParserRuleContext context)
	{
		exitZOM(context);
	}

	/**
	 * Start a rule alternative
	 * 
	 * Generate a constructor of the form <prefix><rulename>
	 *
	 * @param context
	 * @deprecated
	 */
	public void enterAlt(ParserRuleContext context)
	{
		if (parser.getNumberOfSyntaxErrors() > 0)
			return;
		switch (state)
		{
			case CONCRETE :
				break;
			default :
				ParserRuleContext parentCtx = ruleContext.peek();
				String ruleName = parser.getRuleNames()[parentCtx.getRuleIndex()];

				sendLocation(parentCtx.getStart());
				sink = sink.start(sink.context().lookupDescriptor(prefix + ruleName));
		}
	}

	/**
	 * Start a rule alternative of a given name
	 *
	 * Generate a constructor of the form <prefix><name>
	 * 
	 * @param context
	 * @param name
	 */
	public void enterAlt(ParserRuleContext context, String name)
	{
		if (parser.getNumberOfSyntaxErrors() > 0)
			return;
		if (state == State.CONCRETE)
			return;

		ParserRuleContext parentCtx = ruleContext.peek();
		String ruleName = parser.getRuleNames()[parentCtx.getRuleIndex()];
		if (isConcrete(ruleName, name))
			state = State.CONCRETE;
		else
		{
			sendLocation(parentCtx.getStart());

			// TEMPORARY BC BEHAVIOR
			if (name.length() > 0 && Character.isDigit(name.charAt(0)))
			{
				// Old behavior
				sink.start(sink.context().lookupDescriptor(prefix + ruleName + "_A" + name));
			}
			else
			{
				if (name.equals("tsc_nil"))
					sink.start(nilDesc);
				else
				{
					ConstructionDescriptor desc = sink.context().lookupDescriptor(prefix + name);
					if (desc == null)
						throw new RuntimeException("Fatal error: construction symbol not defined: " + prefix + name);
					sink.start(desc);
				}
			}
		}
	}

	/**
	 * Closing alternative
	 * @param context
	 */
	public void exitAlt(ParserRuleContext context)
	{
		if (parser.getNumberOfSyntaxErrors() > 0)
			return;
		switch (state)
		{
			case END_CONCRETE :
				state = State.END_CONCRETE_TERM;
				break;
			case END_CONCRETE_TERM :
				state = State.PARSE;
				break;
			default :
				sink.end();// end construction
		}
	}

	/**
	 * Receive the notification the next token is an embedded program.
	 * @param context
	 */
	public void embed(ParserRuleContext context)
	{
		state = State.START_EMBED;
	}

	/** 
	 * Receive the notification the next token is a metavariable of the given type 
	 * Only needed when parsing meta-terms.
	 */
	public void term(ParserRuleContext _ctx, String type)
	{
		kind = TokenKind.METAVAR;
	}

	/** 
	 * Receive the notification the next token matches list tail
	 * Only needed when parsing meta-terms.
	 */
	public void tail(ParserRuleContext context)
	{
		tail = true;
	}

	/**
	 * Hide next terminal
	 * @param context
	 */
	public void hide(ParserRuleContext context)
	{
		state = State.SKIP;
	}

	/**
	 * Receive the notification the next tokens are part of a binder name
	 * @param context
	 * @param name to associate to the binder
	 * @param type 
	 */
	public void enterBinder(ParserRuleContext context, String name, String type)
	{
		assert !tail : "Cannot declare a binder is a list tail";
		assert binderId == null : "Cannot nest binders";

		state = State.NAME;
		binderId = name.trim();
		binderName = "";
		binderType = type.trim();
	}

	/**
	 * Receive the notification the binder name is complete
	 * @param context
	 */
	public void exitBinder(ParserRuleContext context)
	{
		if (parser.getNumberOfSyntaxErrors() > 0)
			return;
		assert state == State.NAME;
		assert !tail : "Cannot declare a binder is a list tail";
		assert binderId != null : "Missing enterBinder notification";

		pendingBounds.push(new Pair<>(binderId, new Pair<>(binderName, binderType)));
		binderId = null;
		binderName = null;
		binderType = null;
		state = State.PARSE;
	}

	/**
	 * Receive the notification the next tokens declare a binder
	 * @param context
	 * @param type 
	 */
	public void enterSymbol(ParserRuleContext context, String type)
	{
		if (parser.getNumberOfSyntaxErrors() > 0)
			return;
		assert !tail : "Cannot declare a binder is a list tail";
		assert binderId == null : "Cannot nest binders";

		binderName = "";
		binderType = type;
		state = State.NAME;
	}

	/**
	 * Receive the notification all tokens parts of a binder name have been received
	 * @param context
	 */
	public void exitSymbol(ParserRuleContext context)
	{
		if (parser.getNumberOfSyntaxErrors() > 0)
			return;
		assert state == State.NAME;
		assert !tail : "Cannot declare a name in a list tail";
		assert !"".equals(binderName) : "Expected a symbol but got nothing";

		if (kind == TokenKind.METAVAR)
		{
			// received a metavariable matching a syntactic variable.

			String metaname = fixupMetachar(binderName);
			metasink().startMetaApplication(metaname);

			if (termType != null && parser.sendTypes())
				metasink().type(termType);
			metasink().endMetaApplication();

			kind = TokenKind.STRING;
		}
		else
		{
			// This is a binder occurrence. Resolve and emit
			assert bounds != null;
			Optional<Pair<String, Variable>> variable = findBinder(binderName);

			if (!variable.isPresent())
				variable = findFreshVar(binderName);

			if (!variable.isPresent())
			{
				// Create new fresh variable.
				// For now all variables are of type String
				//variable = Optional.of(new Pair<>(binderName, StringTerm.varStringTerm(sink.context(), binderName)));
				variable = Optional.of(new Pair<>(binderName, makeVariable(binderType, binderName)));

				freshes.push(variable.get());
			}

			// Can now emit variable
			sink = sink.use(variable.get().snd);
		}
		binderName = null;
		binderType = null;

		state = State.PARSE;

	}

	/* Look for a fresh variable corresponding to the given variable occurrence */
	private Optional<Pair<String, Variable>> findFreshVar(String var)
	{
		return freshes.findVarDecl(var);
	}

	/* Look for the binder for the given variable occurrence */
	private Optional<Pair<String, Variable>> findBinder(String var)
	{
		return bounds.findVarDecl(var);
	}

	/**
	 * Binds the name associated to the given identifier
	 * @param context
	 * @param id space-separated ids.
	 */
	public void enterBinds(ParserRuleContext context, String names)
	{
		if (parser.getNumberOfSyntaxErrors() > 0)
			return;
		String[] snames = names.trim().split(" ");
		Variable[] binders = new Variable[snames.length];

		bounds.push(Scoping.MARKER);
		for (int i = 0; i < snames.length; i++)
		{
			String id = snames[i];

			// Search for a variable in the pending list, fifo.
			// Only support consuming pending bound variable *once*.
			Optional<Pair<String, Pair<String, String>>> pairo = pendingBounds.stream().filter(pair -> {
				return pair.fst.equals(id);
			}).findFirst();

			if (!pairo.isPresent())
				throw new RuntimeException("Invalid grammar: undeclared bound variable " + id);

			Pair<String, Pair<String, String>> pair = pairo.get();
			String name = pair.snd.fst;
			String type = pair.snd.snd;

			// bind typed variable
			binders[i] = makeVariable(type, name);

			bounds.push(new Pair<>(name, binders[i]));

			// and consume.
			pendingBounds.remove(pair);
		}

		for (int i = 0; i < binders.length; i++)
			sink.bind(binders[i]);
	}

	/**
	 * Unbinds last bound group of binders.
	 * @param context
	 */
	public void exitBinds(ParserRuleContext context)
	{
		if (parser.getNumberOfSyntaxErrors() > 0)
			return;

		assert !bounds.isEmpty() : "Unbalanced use of enterBinds/exitBinds";

		while (bounds.pop() != Scoping.MARKER);
	}

	// Overrides

	@Override
	public void enterEveryRule(ParserRuleContext context)
	{
		if (parser.getNumberOfSyntaxErrors() > 0)
			return;

		// Is that a rule part of a list?
		if (!consCount.isEmpty() && consCount.peek().fst != MutableInt.MARKER)
		{
			if (!tail)
			{
				if (metasink() != null && parser.sendTypes())
					metasink().type(consCount.peek().snd);
				sink.start(consDesc);

				consCount.peek().fst.v++;
			}
			else
			{
				// Following events fill the second Cons argument
			}
		}

		consCount.push(new Pair<>(MutableInt.MARKER, null));
		ruleContext.push(context);
	}

	@Override
	public void exitEveryRule(ParserRuleContext context)
	{
		if (parser.getNumberOfSyntaxErrors() > 0)
			return;
		consCount.pop();
		ruleContext.pop();
	}

	@Override
	public void visitErrorNode(ErrorNode arg0)
	{}

	@Override
	public void visitTerminal(TerminalNode context)
	{
		if (parser.getNumberOfSyntaxErrors() > 0)
			return;
		switch (state)
		{
			case SKIP :
				state = State.PARSE;
				break;
			case PARSE :
				if (context.getSymbol().getType() != -1)
				{
					// Is that a terminal part of a list?
					if (!consCount.isEmpty() && consCount.peek().fst != MutableInt.MARKER)
					{
						if (!tail)
						{
							if (metasink() != null && parser.sendTypes())
								metasink().type(consCount.peek().snd);

							sink.start(consDesc);
							consCount.peek().fst.v++;
						}
					}

					switch (kind)
					{
						case NUMERIC :
						case STRING :
							sendLocation(context.getSymbol());

							String t = context.getText();

							// TODO: SHOULD FIND A BETTER WAY, like another sort case.
							if (t.length() >= 2 && t.startsWith("\"") && t.endsWith("\""))
								t = StringUtils.unquoteJava(t);

							sink = sink.literal(t);
							break;
						case METAVAR :
							assert metasink() != null;
							String rawMeta = context.getText();
							String metaname = fixupMetachar(rawMeta);

							metasink().startMetaApplication(metaname);
							metasink().startSubstitutes();

							String[] metaargs = null;

							int si = rawMeta.indexOf('[');
							if (si != -1)
							{
								// parsing a meta variable inside some concrete syntax, with some substitution arguments.
								// All arguments must be variables (for now).

								metaargs = rawMeta.substring(si + 1, rawMeta.length() - 1).split(",");
								if (metaargs.length > 1 || !metaargs[0].trim().equals(""))
								{
									for (int i = 0; i < metaargs.length; i++)
									{
										String metaarg = metaargs[i].trim();
										if (metaarg.equals(""))
											throw new RuntimeException(
													"Fatal error: Invalid empty meta-variable argument in " + rawMeta);

										Optional<Pair<String, Variable>> variable = findBinder(metaarg);

										if (!variable.isPresent())
											variable = findFreshVar(metaarg);

										if (!variable.isPresent())
										{
											// Create new fresh variable.
											variable = Optional.of(new Pair<>(metaarg, makeVariable("", metaarg)));

											freshes.push(variable.get());
										}

										sink.use(variable.get().snd);
									}
								}
							}

							metasink().endSubstitutes();

							if (termType != null && parser.sendTypes())
								metasink().type(termType);
							metasink().endMetaApplication();
							break;
						default :
							break;
					}

					kind = TokenKind.STRING;
				}
				break;
			case START_EMBED :
				// Just the category/sort name. Ignore
				state = State.PARSE_EMBED;
				break;
			case PARSE_EMBED : {
				// Recursively parse this token
				Token token = context.getSymbol();
				String text = context.getText();
				if (text.length() > 1)
				{
					// Last character is closing the embedded section: trim it.
					text = text.trim();
					text = text.substring(0, text.length() - 1);
					parseTSTerm(text, token.getLine(), token.getCharPositionInLine());
				}
				state = State.PARSE;
				break;
			}
			case NAME :
				// Receive a symbol or a bound variable
				binderName += context.getText().trim();
				break;
			case CONCRETE : {
				if (kind == TokenKind.METAVAR)
				{
					// Cancel parsing concrete. Produce skipped start events and resume normal parsing.
					if (parser.sendTypes())
						metasink().type("TransScript_aterm_sort");
					sink.start(sink.context().lookupDescriptor("TransScript_aterm_A8"));
					if (parser.sendTypes())
						metasink().type("TransScript_concrete_sort");
					sink.start(sink.context().lookupDescriptor("TransScript_concrete"));
					String metaname = fixupMetachar(context.getText());
					metasink().startMetaApplication(metaname);
					if (termType != null && parser.sendTypes())
						metasink().type(termType);
					metasink().endMetaApplication();
					state = State.PARSE;
				}
				else
				{
					Token token = context.getSymbol();
					parseConcrete(context.getText(), token.getLine(), token.getCharPositionInLine());
					state = State.END_CONCRETE;
				}
				break;
			}
			case END_CONCRETE :
			case END_CONCRETE_TERM :
				break;

		}
	}

	// Parse concrete syntax. Only applies when parsing Tosca source files.
	private void parseConcrete(String text, int line, int column)
	{
		String category = text.substring(0, text.indexOf("⟦"));
		String program = text.substring(text.indexOf("⟦") + 1);
		program = program.substring(0, program.lastIndexOf("⟧"));

		org.transscript.runtime.Parser parser = sink.context().getParser(category, true); // Get latest boot parser.
		if (parser == null)
			throw new RuntimeException("Fatal error: no parser found for category " + category);

		try (Reader reader = new StringReader(program))
		{
			// Use MetaBufferSink to construct a meta-representation of the concrete syntax.
			// As such, construct a Tosca term following the Tosca grammar.

			MetaBufferSink innersink = new MetaBufferSink(sink.context());
			parser.parse(innersink, category, reader, null, line, column, bounds, freshes);

			// The meta buffer sink produces a 'term', but a concrete term is actually a 'aterm'. Just unwrap!
			sink.copy(
					innersink.metaterm().asTransScript_term(sink.context()).getField1(sink.context(), false).asTransScript_annoterm(
							sink.context()).getField2(sink.context(), false));
		}
		catch (RuntimeException e)
		{
			System.err.println("Error while parsing: " + program);
			throw e;
		}
		catch (IOException e)
		{} // can't happen.
	}

	// Parse embedded TS term. 
	private void parseTSTerm(String text, int line, int column)
	{
		try (Reader reader = new StringReader(text))
		{
			org.transscript.runtime.Parser innerParser = sink.context().getParser("term", false);
			if (innerParser == null)
				throw new RuntimeException("Internal Error: missing Tosca metaparser.");

			if (isMeta())
			{
				BufferSink buffer = sink.context().makeBuffer();
				innerParser.parser().parse(buffer, "term", reader, null, line, column, bounds, freshes);
				sink.copy((TransScript_term_sort) buffer.term());
			}
			else
			{
				System.out.println(text);
				// Regular term parsing. 
				BufferSink buffer = new TermBufferSink(sink.context());
				((TSParser) innerParser.parser()).parse(buffer, "term", reader, null, line, column, bounds, freshes);
				sink.copy(buffer.term());
			}
		}
		catch (IOException e)
		{} // can't happen.
	}

	/**
	 * Convert parser specific metacharacter to Crsx meta character (#).
	 */
	protected String fixupMetachar(String metavar)
	{
		return "#" + trimMetaArgs(metavar.substring(metachar.length()));
	}

	private String trimMetaArgs(String metavar)
	{
		int si = metavar.indexOf("[");
		if (si != -1)
			return metavar.substring(0, si);
		return metavar;
	}

	/**
	 * Convert raw type to proper TransScript type.
	 */
	private String fixupType(String type)
	{
		return type;
		//		final boolean islist = type.endsWith("_OOM") || type.endsWith("_ZOM") || type.endsWith("_OPT");
		//		type = islist ? type.substring(0, type.length() - "_ZOM".length()) : type;
		//
		//		if (type.endsWith("_TOK"))
		//			return (islist ? "List<" : "") + "StringTerm" + (islist ? ">" : "");
		//
		//		return (islist ? "List<" : "") + prefix + type + "_sort" + (islist ? ">" : "");
	}

	// Cast sink to metasink 
	final private MetaSink metasink()
	{
		return sink instanceof MetaSink ? (MetaSink) sink : null;
	}

	// Whether parser is in meta-parsing mode (i.e constructs a Tosca term)
	final private boolean isMeta()
	{
		return sink instanceof MetaSink;
	}

	// Tell whether about to parse concrete programs.
	private boolean isConcrete(String rulename, String altname)
	{
		// TODO: this is quite brittle. Should change PG.
		return parsets && altname.equals("aterm_A8");
	}

	/** 
	 * Make variable of the given type 
	 * @param name 
	 */
	private Variable makeVariable(String type, String name)
	{
		if (metasink() != null || parsets)
		{
			// Parsing embedded syntax: create generic variable
			return StringTerm.varStringTerm(sink.context(), name);
		}
		String rtype = prefix + type;
		return sink.context().makeVariable(rtype, name);
	}

}
