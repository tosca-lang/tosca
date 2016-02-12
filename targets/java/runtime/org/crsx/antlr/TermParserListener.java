// Copyright (c) 2016 IBM Corporation.

package org.crsx.antlr;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Optional;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.crsx.parser.CrsxMetaParser.BindersContext;
import org.crsx.parser.CrsxMetaParser.ConcreteContext;
import org.crsx.parser.CrsxMetaParser.ConsContext;
import org.crsx.parser.CrsxMetaParser.GroupOrListContext;
import org.crsx.parser.CrsxMetaParser.LiteralContext;
import org.crsx.parser.CrsxMetaParser.MapContext;
import org.crsx.parser.CrsxMetaParser.MetappContext;
import org.crsx.parser.CrsxMetaParser.ScopeContext;
import org.crsx.parser.CrsxMetaParser.TermContext;
import org.crsx.parser.CrsxMetaParser.VariableContext;
import org.crsx.parser.CrsxMetaParserBaseListener;

import net.sf.crsx.CRS;
import net.sf.crsx.CRSException;
import net.sf.crsx.Sink;
import net.sf.crsx.Variable;
import net.sf.crsx.generic.GenericFactory;
import net.sf.crsx.util.ExtensibleMap;
import net.sf.crsx.util.LinkedExtensibleMap;

/**
 * Antlr listener producing term internal representation
 * 
 * <p>Only support crsx3 for now.
 * <p>Does not support grouped term and custom operators
 * 
 * @author Lionel Villard
 */
public class TermParserListener extends CrsxMetaParserBaseListener
{
	// Variable stack marker
	final static private Object MARKER = new Object();

	enum State {
		SKIP, CONS, LITERAL, VAR, BINDER, METAVAR, CONCRETE, GROUPORLIST, IN_GROUPORLIST, TERM
	};

	private GenericFactory factory;

	public Sink sink3;

	ArrayDeque<State> state = new ArrayDeque<>();

	/** In scope variables. */
	private ArrayDeque<Object> bounds;

	/** Fresh variables */
	private ArrayDeque<Object> freshes;

	private ArrayList<Variable> binders;

	/** Count the number of terms in list */
	private ArrayDeque<Integer> consCount = new ArrayDeque<>();

	// Constructors

	public TermParserListener(GenericFactory factory, Sink sink3, ArrayDeque<Object> bounds, ArrayDeque<Object> freshes)
	{
		this.sink3 = sink3;
		this.factory = factory;
		this.freshes = freshes;
		this.bounds = bounds;
		
		state.push(State.SKIP);
	}

	// ---  {!isPrefix(_input.LT(1).getText())}? cons    

	@Override
	public void enterCons(ConsContext ctx)
	{
		state.push(State.CONS); // Expect a terminal representing the constructor name
	}

	@Override
	public void exitCons(ConsContext ctx)
	{
		sink3 = sink3.end();
		state.pop();
	}

	// --- literal

	@Override
	public void enterLiteral(LiteralContext ctx)
	{
		state.push(State.LITERAL); // Expect a terminal representing the literal
	}

	@Override
	public void exitLiteral(LiteralContext ctx)
	{
		sink3 = sink3.end();
		state.pop();
	}

	// --- groupOrList

	@Override
	public void enterGroupOrList(GroupOrListContext ctx)
	{
		state.push(State.GROUPORLIST); // Expect the terminal (
		consCount.push(0);
	}

	@Override
	public void exitGroupOrList(GroupOrListContext ctx)
	{
		int count = consCount.pop();

		// Send list terminator
		sink3 = sink3.start(sink3.makeConstructor("$Nil")).end();

		// And close all $Cons
		while (count-- > 0)
			sink3 = sink3.end();

		state.pop();
	}

	// --- variable

	@Override
	public void enterVariable(VariableContext ctx)
	{
		state.push(State.VAR); // Next terminal is a variable
	}

	@Override
	public void exitVariable(VariableContext ctx)
	{
		state.pop();
	}

	// --- map

	@Override
	public void enterMap(MapContext ctx)
	{
		throw new RuntimeException("Not implemented");
	}

	@Override
	public void exitMap(MapContext ctx)
	{
		throw new RuntimeException("Not implemented");
	}

	// --- metapp

	@Override
	public void enterMetapp(MetappContext ctx)
	{
		state.push(State.METAVAR);
	}

	@Override
	public void exitMetapp(MetappContext ctx)
	{
		sink3 = sink3.endMetaApplication();

		state.pop();
	}

	// --- concrete

	@Override
	public void enterConcrete(ConcreteContext ctx)
	{
		state.push(State.CONCRETE);
	}

	@Override
	public void exitConcrete(ConcreteContext ctx)
	{
		state.pop();
	}

	// --- scope

	@Override
	public void enterScope(ScopeContext ctx)
	{
		bounds.push(MARKER);

		binders = new ArrayList<>();
	}

	@Override
	public void exitScope(ScopeContext ctx)
	{
		while (bounds.peek() != MARKER)
			bounds.pop();
	}

	// --- binders

	@Override
	public void enterBinders(BindersContext ctx)
	{
		state.push(State.BINDER);
	}

	@Override
	public void exitBinders(BindersContext ctx)
	{
		state.pop();
	}

	// ---  

	@Override
	public void enterTerm(TermContext ctx)
	{
		if (state.peek() == State.IN_GROUPORLIST)
		{
			int count = consCount.pop();
			consCount.push(count + 1);

			// TODO: Should delay by using a buffer before sending $Cons when supporting grouped expression.
			sink3 = sink3.start(sink3.makeConstructor("$Cons"));
		}
		state.push(State.TERM);

	}

	@Override
	public void exitTerm(TermContext ctx)
	{
		state.pop();
	}

	@Override
	public void visitTerminal(TerminalNode node)
	{
		switch (state.peek())
		{
			case BINDER :
				if (node.getText().equals("]"))
				{
					if (binders.size() > 0)
					{
						net.sf.crsx.Variable[] bs = new net.sf.crsx.Variable[binders.size()];
						binders.toArray(bs);
						sink3 = sink3.binds(bs);
					}
				}
				else
				{
					net.sf.crsx.Variable binder = sink3.makeVariable(node.getText(), false);
					bounds.push(binder);
					binders.add(binder);
				}
				state.pop();
				state.push(State.SKIP);
				break;
			case CONS :
				sink3 = sink3.start(sink3.makeConstructor(node.getText()));
				state.pop();
				state.push(State.SKIP);
				break;
			case METAVAR :
				sink3 = sink3.startMetaApplication(node.getText());
				state.pop();
				state.push(State.SKIP);
				break;
			case LITERAL :
				sink3 = sink3.start(sink3.makeLiteral(node.getText(), CRS.STRING_SORT));
				state.pop();
				state.push(State.SKIP);
				break;
			case VAR :
				final String varname = node.getText();

				// This is a binder occurrence or a fresh variable. Resolve and emit
				Optional<Object> variable = bounds.stream().filter(var -> {
					if (var == MARKER)
						return false;

					return ((net.sf.crsx.Variable) var).name().equals(varname);
				}).findFirst();

				if (!variable.isPresent())
				{
					// Try among fresh variables
					variable = freshes.stream().filter(var -> {
						return ((net.sf.crsx.Variable) var).name().equals(varname);
					}).findFirst();
				}

				if (!variable.isPresent())
				{
					// Create new fresh variable.
					variable = Optional.of(sink3.makeVariable(varname, false));
					freshes.push(variable.get());
				}

				sink3 = sink3.use((net.sf.crsx.Variable) variable.get());

				state.pop();
				state.push(State.SKIP);
				break;
			case CONCRETE :

				String text = node.getText();
				if (text.length() > 1)
				{
					// Text is of the form category⟦ concrete text ⟧
					int i = text.indexOf("⟦");
					String category = text.substring(0, i);
					text = text.substring(i + 1, text.length() - 1);

					//System.out.println("parse embedded: " + text);
					Reader reader = new StringReader(text);

					//if (sink3 != null)
					{

						try
						{
							sink3 = factory.parser(factory).parse(
									sink3, category, reader, "", node.getSymbol().getLine(),
									node.getSymbol().getCharPositionInLine(), toCrsx3Bound());
						}
						catch (CRSException | IOException e)
						{
							throw new RuntimeException(e);
						}
					}

				}
				state.pop();
				state.push(State.SKIP);
				break;
			case GROUPORLIST :
				// Receive first group list token. Must be (
				assert node.getText().equals("(");
				state.pop();
				state.push(State.IN_GROUPORLIST);
				break;
			case IN_GROUPORLIST :
				// either a COMMA or RPAR. Ignore.
				break;
			case SKIP :
				// EOF
				break;

			default :
				assert false : "Unreachable";
				break;

		}

	}

	/**
	 * Convert bound variable structure to one compatible with crsx3
	 * @return
	 */
	private ExtensibleMap<String, net.sf.crsx.Variable> toCrsx3Bound()
	{
		ExtensibleMap<String, net.sf.crsx.Variable> map = new LinkedExtensibleMap<>();
		for (Object v : bounds)
		{
			if (v instanceof net.sf.crsx.Variable)
				map = map.extend(((net.sf.crsx.Variable) v).name(), (net.sf.crsx.Variable) v);
		};
		for (Object v : freshes)
		{
			if (v instanceof net.sf.crsx.Variable)
				map = map.extend(((net.sf.crsx.Variable) v).name(), (net.sf.crsx.Variable) v);
		};
		return map;
	}

}
