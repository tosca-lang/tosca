// Copyright (c) 2015 IBM Corporation.

package org.transscript.antlr;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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
import org.transscript.runtime.Pair;
import org.transscript.runtime.Sink;
import org.transscript.runtime.StringTerm;
import org.transscript.runtime.StringUtils;
import org.transscript.runtime.Variable;
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
		PARSE, START_EMBED, PARSE_EMBED, NAME, SKIP
	}

	enum TokenKind {
		STRING, NUMERIC, METAVAR
	}

	// The state.

	/** TransScript sink */
	private Sink sink4;

	/** The List construction descriptors */
	final protected ConstructionDescriptor nilDesc;
	final protected ConstructionDescriptor consDesc;

	private ArrayDeque<MutableInt> consCount;
	private ArrayDeque<ParserRuleContext> ruleContext;

	/** The ANTLR4 parser */
	private Parser parser;

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
	private ArrayDeque<Pair<String /* In the source */, Variable /* In the term */>> bounds;

	/** In scope fresh variables. */
	private ArrayDeque<Pair<String /* In the source */, Variable /* In the term */>> freshes;

	/** Current token sort */
	private TokenKind kind;

	/** Meta term type */
	//private String termType;

	/** Listener state */
	private State state;

	/**
	 * Create an TS ANTLR listener 
	 * @param sink
	 * @param prefix    Prefix to apply to constructor names
	 * @param metachar  Language specific meta variable prefix
	 * @param parser
	 * @param bounds    Bound variables
	 */
	public ToSinkListener(Sink sink, String prefix, String metachar, Parser parser, Map<String, Variable> bounds)
	{
		this.sink4 = sink;
		this.consCount = new ArrayDeque<>();
		this.ruleContext = new ArrayDeque<>();

		this.parser = parser;
		this.prefix = prefix;
		this.metachar = metachar;
		this.state = State.PARSE;
		this.kind = TokenKind.STRING;

		this.binderNames = new HashMap<>();
		this.bounds = new ArrayDeque<>();
		if (bounds != null)
		{
			for (Entry<String, Variable> entry : bounds.entrySet())
				this.bounds.add(new Pair<>(entry.getKey(), entry.getValue()));
		}
		this.freshes = new ArrayDeque<>();

		this.nilDesc = sink.context().lookupDescriptor("Nil");
		this.consDesc = sink.context().lookupDescriptor("Cons");
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
		consCount.push(new MutableInt(0));
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
			sink4 = sink4.start(nilDesc).end();
		}

		int count = consCount.pop().v;
		while (count-- > 0)
			sink4 = sink4.end();

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
		ParserRuleContext parentCtx = ruleContext.peek();
		String ruleName = parser.getRuleNames()[parentCtx.getRuleIndex()];

		sendLocation(parentCtx.getStart());
		sink4 = sink4.start(sink4.context().lookupDescriptor(prefix + ruleName));
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

		sendLocation(parentCtx.getStart());
		sink4 = sink4.start(sink4.context().lookupDescriptor(prefix + ruleName + "_A" + name));
	}

	/**
	 * Closing alternative
	 * @param context
	 */
	public void exitAlt(ParserRuleContext context)
	{
		sink4 = sink4.end();// end construction
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
		//	termType = type;
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
			metasink().startMetaApplication(metaname).endMetaApplication();

			// TODO: Send type when mode is META
			//if (termType != null)
			//	sink4 = sink4.type(termType);

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
				variable = Optional.of(new Pair<>(binderName, StringTerm.varStringTerm(sink4.context(), binderName)));

				freshes.push(variable.get());
			}

			// Can now emit variable
			sink4 = sink4.use(variable.get().snd);
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

		bounds.add(MARKER);
		for (int i = 0; i < snames.length; i++)
		{
			String id = snames[i];
			String name = binderNames.remove(id); // consume binder name 
			assert name != null : "Invalid grammar: binds used without binder/name";

			binders[i] = StringTerm.varStringTerm(sink4.context(), name);

			bounds.push(new Pair<>(name, binders[i]));
		}

		for (int i = 0; i < binders.length; i++)
			sink4 = sink4.bind(binders[i]);
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
		if (!consCount.isEmpty() && consCount.peek() != MutableInt.MARKER)
		{
			if (!tail)
			{
				sink4 = sink4.start(consDesc);

				consCount.peek().v++;
			}
			else
			{
				// Following events fill the second Cons argument
			}
		}

		consCount.push(MutableInt.MARKER);
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
					if (!consCount.isEmpty() && consCount.peek() != MutableInt.MARKER)
					{
						if (!tail)
						{
							sink4 = sink4.start(consDesc);
							consCount.peek().v++;
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

							sink4 = sink4.literal(t);
							break;
						case METAVAR :
							String metaname = fixupMetachar(context.getText());

							metasink().startMetaApplication(metaname);

							// Add directly bound variable.
							// REVISIT: should be user-specified.
							for (Object variable : bounds)
							{
								if (variable == MARKER)
									break;
								sink4 = sink4.use((Variable) variable);
							}

							metasink().endMetaApplication();

							// TODO: send type when meta mode
							//if (termType != null)
							//	sink4 = sink4.ype);
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
			case PARSE_EMBED :
				// Recursively parse this token
				//Token token = context.getSymbol();
				String text = context.getText();
				if (text.length() > 1)
				{
					// Last character is closing the embedded section: trim it.
					text = text.trim();
					text = text.substring(0, text.length() - 1);

					Reader reader = new StringReader(text);

					// TODO: location information.
					parseCrsx4Term(reader);
				}
				state = State.PARSE;
				break;

			case NAME :
				// Receive a symbol or a bound variable
				binderName += context.getText().trim();
				break;

			default :
				break;
		}
	}

	private void parseCrsx4Term(Reader reader)
	{
		org.transscript.runtime.Parser innerParser = sink4.context().getParser("term", true);
		BufferSink buffer = sink4.context().makeBuffer();
		innerParser.parser().parse(buffer, "term", reader, null, 0, 0, null);
		metasink().embded((TransScript_xterm_xsort) buffer.term());
	}

	/**
	 * Convert parser specific metacharacter to Crsx meta character (#).
	 */
	protected String fixupMetachar(String metavar)
	{
		return "#" + metavar.substring(metachar.length());
	}
	//
	//	/**
	//	 * Convert raw type to proper TransScript type.
	//	 */
	//	private String fixupType(String type)
	//	{
	//		if (type.endsWith("_TOK"))
	//			return "String";
	//
	//		final boolean islist = type.endsWith("_OOM") || type.endsWith("_ZOM") || type.endsWith("_OPT");
	//		type = islist ? type.substring(0, type.length() - "_ZOM".length()) : type;
	//
	//		return (islist ? "List<" : "") + prefix + type + "_sort" + (islist ? ">" : "");
	//	}

	/** Cast sink to metasink */
	final private MetaSink metasink()
	{
		return (MetaSink) sink4;
	}

}
