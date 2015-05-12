
package org.crsx.pg;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.List;
import java.util.function.Consumer;

import net.sf.crsx.CRS;
import net.sf.crsx.CRSException;
import net.sf.crsx.Constructor;
import net.sf.crsx.Sink;
import net.sf.crsx.generic.GenericFactory;
import net.sf.crsx.util.Util;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Create CRSX term from ANTLR parse events.
 * 
 * @author villardl
 */
public class SinkAntlrListener implements ParseTreeListener
{
	// Static helper

	public static void fireEnterZOM(List<ParseTreeListener> listeners, ParserRuleContext _ctx)
	{
		fire(listeners, _ctx, l -> ((SinkAntlrListener) l).enterZOM(_ctx));
	}

	public static void fireExitZOM(List<ParseTreeListener> listeners, ParserRuleContext _ctx)
	{
		fire(listeners, _ctx, l -> ((SinkAntlrListener) l).exitZOM(_ctx));
	}

	public static void fireEnterOPT(List<ParseTreeListener> listeners, ParserRuleContext _ctx)
	{
		fire(listeners, _ctx, l -> ((SinkAntlrListener) l).enterOPT(_ctx));
	}

	public static void fireExitOPT(List<ParseTreeListener> listeners, ParserRuleContext _ctx)
	{
		fire(listeners, _ctx, l -> ((SinkAntlrListener) l).exitOPT(_ctx));
	}

	public static void fireEnterAlt(List<ParseTreeListener> listeners, ParserRuleContext _ctx)
	{
		fire(listeners, _ctx, l -> ((SinkAntlrListener) l).enterAlt(_ctx));
	}
	
	public static void fireEnterAlt(List<ParseTreeListener> listeners, ParserRuleContext _ctx, String name)
	{
		fire(listeners, _ctx, l -> ((SinkAntlrListener) l).enterAlt(_ctx, name));
	}
	
	public static void fireExitAlt(List<ParseTreeListener> listeners, ParserRuleContext _ctx)
	{
		fire(listeners, _ctx, l -> ((SinkAntlrListener) l).exitAlt(_ctx));
	}
	
	public static void fireHide(List<ParseTreeListener> listeners, ParserRuleContext _ctx)
	{
		fire(listeners, _ctx, l -> ((SinkAntlrListener) l).hide(_ctx));
	}
	
	public static void fireTerm(List<ParseTreeListener> listeners, ParserRuleContext _ctx)
	{
		fire(listeners, _ctx, l -> ((SinkAntlrListener) l).term(_ctx));
	}
	
	public static void fireTail(List<ParseTreeListener> listeners, ParserRuleContext _ctx)
	{
		fire(listeners, _ctx, l -> ((SinkAntlrListener) l).tail(_ctx));
	}

	public static void fireEmbed(List<ParseTreeListener> listeners, ParserRuleContext _ctx)
	{
		fire(listeners, _ctx, l -> ((SinkAntlrListener) l).embed(_ctx));
	}
	private static void fire(List<ParseTreeListener> listeners, ParserRuleContext _ctx, Consumer<ParseTreeListener> apply)
	{
		if (listeners != null)
			listeners.stream().filter(l -> l instanceof SinkAntlrListener).forEach(apply);
	}

	// Some enums

	enum State {
		PARSE, START_EMBED, PARSE_EMBED
	}

	enum TokenSort {
		STRING, NUMERIC, TERM
	}

	// The state.

	private Sink sink;
	private GenericFactory factory;
	private ArrayDeque<MutableInt> consCount;
	private ArrayDeque<ParserRuleContext> ruleContext;
	private Constructor cons;
	private Constructor nil;
	private MutableInt marker;
	private Parser parser;
	private String prefix;
	private boolean hide;
	private boolean tail;
	private TokenSort sort;

	/** Listener state? */
	private State state;

	public SinkAntlrListener(GenericFactory factory, Sink sink, String prefix, Parser parser)
	{
		this.factory = factory;
		this.sink = sink;
		this.consCount = new ArrayDeque<>();
		this.ruleContext = new ArrayDeque<>();

		this.cons = sink.makeConstructor("$Cons");
		this.nil = sink.makeConstructor("$Nil");
		this.marker = new MutableInt(-1);
		this.parser = parser;
		this.prefix = prefix;
		this.state = State.PARSE;
		this.sort = TokenSort.STRING;
	}

	/**
	 *  Add location properties to constructor
	 */
	protected Constructor locate(Token token, Constructor c)
	{
		int column = token.getCharPositionInLine();
		int line = token.getLine();
		return Util.wrapWithLocation(sink, c, parser.getInputStream().getSourceName(), line, column);
	}

	/**
	 * Receive the notification the next sequence of tokens are list items.
	 * 
	 * <p>Constructs nested $Cons[..., ...] and $Nil terms. 
	 * 
	 * @param context
	 */
	public void enterZOM(ParserRuleContext context)
	{
		consCount.push(new MutableInt(0));
		tail = false;
	}

	public void exitZOM(ParserRuleContext context)
	{
		if (!tail)
			sink = sink.start(nil).end();
		int count = consCount.pop().v;
		while (count-- > 0)
			sink = sink.end();
		
		tail = false;
	}

	public void enterOPT(ParserRuleContext context)
	{
		enterZOM(context);
	}

	public void exitOPT(ParserRuleContext context)
	{
		exitZOM(context);
	}

	public void enterAlt(ParserRuleContext context)
	{
		ParserRuleContext parentCtx = ruleContext.peek();
		String ruleName = parser.getRuleNames()[parentCtx.getRuleIndex()];

		sink = sink.start(locate(parentCtx.getStart(), sink.makeConstructor(prefix + ruleName)));
	}

	public void enterAlt(ParserRuleContext context, String name)
	{
		ParserRuleContext parentCtx = ruleContext.peek();
		String ruleName = parser.getRuleNames()[parentCtx.getRuleIndex()];

		sink = sink.start(locate(parentCtx.getStart(), sink.makeConstructor(prefix + ruleName + "_A" + name)));
	}

	public void exitAlt(ParserRuleContext context)
	{
		sink = sink.end();
	}

	public void embed(ParserRuleContext context)
	{
		state = State.START_EMBED;
	}

	/** Receive the notification the next token is of type term */
	public void term(ParserRuleContext context)
	{
		sort = TokenSort.TERM;
	}

	/** Receive the notification the next token match all of a list tail */
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
		hide = true;
	}

	// Overrides

	@Override
	public void enterEveryRule(ParserRuleContext context)
	{
		// Is that a rule part of a list?
		if (!consCount.isEmpty() && consCount.peek() != marker)
		{
			if (!tail)
			{
				sink = sink.start(cons);
				consCount.peek().v++;
			}
			else
			{
				// Following events fill the second $Cons argument
			}
		}

		consCount.push(marker);
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
			case PARSE :
				if (!hide && context.getSymbol().getType() != -1)
				{
					// Is that a terminal part of a list?
					if (!consCount.isEmpty() && consCount.peek() != marker)
					{
						if (!tail)
						{
							sink = sink.start(cons);
							consCount.peek().v++;
						}
					}

					switch (sort)
					{
						case NUMERIC :
						case STRING :
							sink = sink.start(locate(context.getSymbol(), sink.makeLiteral(context.getText(), CRS.STRING_SORT))).end();
							break;
						case TERM :
							sink = sink.startMetaApplication(context.getText()).endMetaApplication();
							break;
						default :
							break;

					}

					sort = TokenSort.STRING;
				}
				hide = false;
				break;
			case START_EMBED :
				// Just the category/sort name. Ignore
				state = State.PARSE_EMBED;
				break;
			case PARSE_EMBED :
				// Recursively parse this token
				Token token = context.getSymbol();
				String text = context.getText();
				if (text.length() > 1)
				{
					// Last character is closing the embedded section: trim it.
					text = text.trim();
					text = text.substring(0, text.length() - 1);

					Reader reader = new StringReader(text);
					try
					{
						sink = factory.parser(factory).parse(
								sink, null, reader, "", token.getLine(), token.getCharPositionInLine(), null);
					}
					catch (CRSException | IOException e)
					{
						throw new RuntimeException(e);
					}
				}
				state = State.PARSE;
				break;
			default :
				break;
		}
	}

	class MutableInt
	{
		int v;

		MutableInt(int v)
		{
			this.v = v;
		}
	}
}
