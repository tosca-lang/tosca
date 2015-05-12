// Copyright (c) 2014 IBM Corporation.
package org.crsx.pg;

import java.util.ArrayDeque;

import net.sf.crsx.CRS;
import net.sf.crsx.Constructor;
import net.sf.crsx.util.Util;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.crsx.pg.SinkAntlrListener.MutableInt;
import org.crsx.runtime.ConstructionDescriptor;
import org.crsx.runtime.Context;
import org.crsx.runtime.Properties;
import org.crsx.runtime.Sink;
import org.crsx.runtime.Term;
import org.crsx.runtime.Variable;

/**
 * Antlr to Java runtime sink bridge
 *  
 * @author villardl
 */
public class AntlrSink implements ParseTreeListener
{

	private Sink sink;
	private ArrayDeque<MutableInt> consCount;
	private ArrayDeque<ParserRuleContext> ruleContext;
	private Constructor cons;
	private Constructor nil;
	private MutableInt marker;
	private Parser parser;
	private String prefix;
	private boolean hide;

	public AntlrSink(Sink sink, String prefix, Parser parser)
	{
		this.sink = sink;
		this.consCount = new ArrayDeque<>();
		this.ruleContext = new ArrayDeque<>();

//		this.cons = sink.makeConstructor("$Cons");
//		this.nil = sink.makeConstructor("$Nil");
		this.marker = new MutableInt(-1);
		this.parser = parser;
		this.prefix = prefix;
	}

	/**
	 *  Add location properties to constructor
	 */
	protected Constructor locate(Token token, Constructor c)
	{
		int column = token.getCharPositionInLine();
		int line = token.getLine();
	//	return Util.wrapWithLocation(sink, c, parser.getInputStream().getSourceName(), line, column);
		return null;
	}

	public void enterZOM(ParserRuleContext context)
	{
		consCount.push(new MutableInt(0));
	}

	public void exitZOM(ParserRuleContext context)
	{
		//sink = sink.start(nil).end();
		int count = consCount.pop().v;
		while (count-- > 0)
			sink = sink.end();
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
		
		//sink = sink.start(locate(parentCtx.getStart(), sink.makeConstructor(prefix + ruleName)));
	}
	
	public void enterAlt(ParserRuleContext context, String name)
	{
		
		ParserRuleContext parentCtx = ruleContext.peek();
		String ruleName = parser.getRuleNames()[parentCtx.getRuleIndex()];
		
		//sink = sink.start(locate(parentCtx.getStart(), sink.makeConstructor(prefix + ruleName + "_A" + name)));
		
	}

	public void exitAlt(ParserRuleContext context)
	{
		sink = sink.end();
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
			//sink = sink.start(cons);
			consCount.peek().v++;
		}
	
		consCount.push(marker);
		ruleContext.push(context);
	}

	@Override
	public void exitEveryRule(ParserRuleContext context)
	{
		//sink = sink.end(); // End Constructor

		consCount.pop();
		ruleContext.pop();
	}

	@Override
	public void visitErrorNode(ErrorNode arg0)
	{}

	@Override
	public void visitTerminal(TerminalNode context)
	{
		if (!hide && context.getSymbol().getType() != -1)
		{
			// Is that a terminal part of a list?
			if (!consCount.isEmpty() && consCount.peek() != marker)
			{
				//sink = sink.start(cons);
				consCount.peek().v++;
			}
			
			//sink = sink.start(locate(context.getSymbol(), sink.makeLiteral(context.getText(), CRS.STRING_SORT))).end();
		}
		hide = false;
	}

	class MutableInt {
		int v;
		MutableInt(int v)
		{
			this.v = v;
		}
	}
	
	

	
}
