// Copyright (c) 2015 IBM Corporation.

package org.transscript.antlr;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.transscript.compiler.parser.TransScript.TransScript_xterm_xsort;
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

	public static void fireEnterSymbol(List<ParseTreeListener> listeners, ParserRuleContext _ctx)
	{
		fire(listeners, _ctx, l -> ((ToSinkListener) l).enterSymbol(_ctx));
	}

	public static void fireExitSymbol(List<ParseTreeListener> listeners, ParserRuleContext _ctx)
	{
		fire(listeners, _ctx, l -> ((ToSinkListener) l).exitSymbol(_ctx));
	}

	public static void fireEnterBinder(List<ParseTreeListener> listeners, ParserRuleContext _ctx, String name)
	{
		fire(listeners, _ctx, l -> ((ToSinkListener) l).enterBinder(_ctx, name));
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

	// Variable stack marker
	final static private Pair<String, Variable> MARKER = new Pair<>(null, null);

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
	private Parser parser;

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

	/** Map binder id to binder name */
	private HashMap<String, String> binderNames;

	/** In scope bound variables. */
	private Scoping bounds;

	/** In scope fresh variables. */
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
	public ToSinkListener(Sink sink, String prefix, String metachar, Parser parser, Scoping bounds, Scoping freshes)
	{
		this.sink = sink;
		this.consCount = new ArrayDeque<>();
		this.ruleContext = new ArrayDeque<>();

		this.parser = parser;
		this.prefix = prefix;
		this.metachar = metachar;
		this.state = State.PARSE;
		this.kind = TokenKind.STRING;

		this.binderNames = new HashMap<>();
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

		// No location until crsx4 can compile crsx4

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

		if (!tail)
		{
			if (metasink() != null)
			{
				ParserRuleContext parentCtx = ruleContext.peek();
				String ruleName = parser.getRuleNames()[parentCtx.getRuleIndex()];
				String type = fixupType(ruleName);

				metasink().type(type);
			}

			sink.start(nilDesc).end();
		}

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
	 */
	public void enterAlt(ParserRuleContext context)
	{
		switch (state)
		{
			case CONCRETE :
				break;
			default :
				ParserRuleContext parentCtx = ruleContext.peek();
				String ruleName = parser.getRuleNames()[parentCtx.getRuleIndex()];

				sendLocation(parentCtx.getStart());
				if (metasink() != null)
					metasink().type(fixupType(ruleName));
				sink = sink.start(sink.context().lookupDescriptor(prefix + ruleName));
		}
	}

	/**
	 * Start a rule alternative of a given name
	 *
	 * Generate a constructor of the form <prefix><rulename>_A<name>
	 * 
	 * @param context
	 * @param name
	 */
	public void enterAlt(ParserRuleContext context, String name)
	{
		ParserRuleContext parentCtx = ruleContext.peek();
		String ruleName = parser.getRuleNames()[parentCtx.getRuleIndex()];
		if (isConcrete(ruleName, name))
			state = State.CONCRETE;
		else
		{
			sendLocation(parentCtx.getStart());

			if (metasink() != null)
				metasink().type(fixupType(ruleName));
			sink.start(sink.context().lookupDescriptor(prefix + ruleName + "_A" + name));
		}
	}

	/**
	 * Closing alternative
	 * @param context
	 */
	public void exitAlt(ParserRuleContext context)
	{
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
		termType = fixupType(type);
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
	 */
	public void enterBinder(ParserRuleContext context, String name)
	{
		assert!tail : "Cannot declare a binder is a list tail";
		assert binderId == null : "Cannot nest binders";

		state = State.NAME;
		binderId = name.trim();
		binderName = "";
	}

	/**
	 * Receive the notification the binder name is complete
	 * @param context
	 */
	public void exitBinder(ParserRuleContext context)
	{
		assert state == State.NAME;
		assert!tail : "Cannot declare a binder is a list tail";
		assert binderId != null : "Missing enterBinder notification";

		binderNames.put(binderId, binderName);
		binderId = null;
		binderName = null;
		state = State.PARSE;
	}

	/**
	 * Receive the notification the next tokens declare a binder
	 * @param context
	 */
	public void enterSymbol(ParserRuleContext context)
	{
		assert!tail : "Cannot declare a binder is a list tail";
		assert binderId == null : "Cannot nest binders";

		binderName = "";
		state = State.NAME;
	}

	/**
	 * Receive the notification all tokens parts of a binder name have been received
	 * @param context
	 */
	public void exitSymbol(ParserRuleContext context)
	{
		assert state == State.NAME;
		assert!tail : "Cannot declare a name in a list tail";

		if (kind == TokenKind.METAVAR)
		{
			// received a metavariable matching a syntactic variable.

			String metaname = fixupMetachar(binderName);
			metasink().startMetaApplication(metaname);

			if (termType != null)
				metasink().type(termType);
			metasink().endMetaApplication();

			kind = TokenKind.STRING;
		}
		else
		{
			// This is a binder occurrence. Resolve and emit
			assert bounds != null;
			Optional<Pair<String, Variable>> variable = bounds.stream().filter(pair -> {
				if (pair == MARKER)
					return false;

				return pair.fst.equals(binderName);
			}).findFirst();

			if (!variable.isPresent())
			{
				// Try among fresh variables
				variable = freshes.stream().filter(pair -> {
					return pair.fst.equals(binderName);

				}).findFirst();
			}

			if (!variable.isPresent())
			{
				// Create new fresh variable.
				// For now all variables are of type String
				variable = Optional.of(new Pair<>(binderName, StringTerm.varStringTerm(sink.context(), binderName)));

				freshes.push(variable.get());
			}

			// Can now emit variable
			sink = sink.use(variable.get().snd);
		}
		state = State.PARSE;
	}

	/**
	 * Binds the name associated to the given identifier
	 * @param context
	 * @param id space-separated ids.
	 */
	public void enterBinds(ParserRuleContext context, String names)
	{
		String[] snames = names.trim().split(" ");
		Variable[] binders = new Variable[snames.length];

		bounds.push(MARKER);
		for (int i = 0; i < snames.length; i++)
		{
			String id = snames[i];
			String name = binderNames.remove(id); // consume binder name 
			assert name != null : "Invalid grammar: binds used without binder/name";

			binders[i] = StringTerm.varStringTerm(sink.context(), name);

			bounds.push(new Pair<>(name, binders[i]));
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
		assert!bounds.isEmpty() : "Unbalanced use of enterBinds/exitBinds";

		while (bounds.pop() != MARKER);
	}

	// Overrides

	@Override
	public void enterEveryRule(ParserRuleContext context)
	{
		// Is that a rule part of a list?
		if (!consCount.isEmpty() && consCount.peek().fst != MutableInt.MARKER)
		{
			if (!tail)
			{
				if (metasink() != null)
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
		consCount.pop();
		ruleContext.pop();
	}

	@Override
	public void visitErrorNode(ErrorNode arg0)
	{}

	@Override
	public void visitTerminal(TerminalNode context)
	{
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
							if (metasink() != null)
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
							if (t.startsWith("\""))
								t = StringUtils.unquoteJava(t);

							sink = sink.literal(t);
							break;
						case METAVAR :
							assert metasink() != null;

							String metaname = fixupMetachar(context.getText());

							metasink().startMetaApplication(metaname);
							metasink().startSubstitutes();
							// Add all bound variables.
							// REVISIT: should be user-specified.
							for (Pair<String, Variable> bound : bounds)
							{
								if (bound != MARKER)
									sink.use(bound.snd);
							}
							metasink().endSubstitutes();

							if (termType != null)
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
					metasink().type("TransScript_aterm_sort");
					sink.start(sink.context().lookupDescriptor("TransScript_aterm_A8"));
					metasink().type("TransScript_concrete_sort");
					sink.start(sink.context().lookupDescriptor("TransScript_concrete"));
					String metaname = fixupMetachar(context.getText());
					metasink().startMetaApplication(metaname);
					if (termType != null)
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

	// Parse concrete syntax
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
			MetaBufferSink innersink = new MetaBufferSink(sink.context());
			parser.parse(innersink, category, reader, null, line, column, bounds, freshes);
			sink.copy(innersink.metaterm().asTransScript_xterm(sink.context()).getField1(sink.context(), false));
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
			BufferSink buffer = sink.context().makeBuffer();
			innerParser.parser().parse(buffer, "term", reader, null, line, column, bounds, freshes);
			metasink().copy((TransScript_xterm_xsort) buffer.term());
		}
		catch (IOException e)
		{} // can't happen.
	}

	/**
	 * Convert parser specific metacharacter to Crsx meta character (#).
	 */
	protected String fixupMetachar(String metavar)
	{
		return "#" + metavar.substring(metachar.length());
	}

	/**
	 * Convert raw type to proper TransScript type.
	 */
	private String fixupType(String type)
	{
		final boolean islist = type.endsWith("_OOM") || type.endsWith("_ZOM") || type.endsWith("_OPT");
		type = islist ? type.substring(0, type.length() - "_ZOM".length()) : type;

		if (type.endsWith("_TOK"))
			return (islist ? "List<" : "") + "StringTerm" + (islist ? ">" : "");

		return (islist ? "List<" : "") + prefix + type + "_sort" + (islist ? ">" : "");
	}

	/** Cast sink to metasink */
	final private MetaSink metasink()
	{
		return sink instanceof MetaSink ? (MetaSink) sink : null;
	}

	// Tell whether about to parse concrete programs.
	private boolean isConcrete(String rulename, String altname)
	{
		// TODO: this is quite brittle. Should change PG.
		return parsets && altname.equals("8") && rulename.equals("aterm");
	}

}
