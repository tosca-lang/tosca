// Copyright (c) 2016 IBM Corporation.

package org.transscript.antlr;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.transscript.parser.TransScriptMetaParser.ApplyContext;
import org.transscript.parser.TransScriptMetaParser.BindersContext;
import org.transscript.parser.TransScriptMetaParser.ConcreteContext;
import org.transscript.parser.TransScriptMetaParser.ConsContext;
import org.transscript.parser.TransScriptMetaParser.FormalParamsContext;
import org.transscript.parser.TransScriptMetaParser.GroupOrListContext;
import org.transscript.parser.TransScriptMetaParser.LiteralContext;
import org.transscript.parser.TransScriptMetaParser.MapContext;
import org.transscript.parser.TransScriptMetaParser.MetappContext;
import org.transscript.parser.TransScriptMetaParser.ScopeContext;
import org.transscript.parser.TransScriptMetaParser.SortAnnoContext;
import org.transscript.parser.TransScriptMetaParser.TermContext;
import org.transscript.parser.TransScriptMetaParser.VariableContext;
import org.transscript.parser.TransScriptMetaParserBaseListener;
import org.transscript.runtime.ConstructionDescriptor;
import org.transscript.runtime.Variable;

import net.sf.crsx.CRS;
import net.sf.crsx.CRSException;
import net.sf.crsx.Sink;
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
public class TermParserListener extends TransScriptMetaParserBaseListener
{
	// Variable stack marker
	final static private Object MARKER = new Object();

	enum State {
		SKIP, CONS, LITERAL, VAR, BINDER, PARAM, METAVAR, CONCRETE, GROUPORLIST, IN_GROUPORLIST, TERM
	};

	private GenericFactory factory;

	public Sink sink3;
	public org.transscript.runtime.Sink sink4;

	ArrayDeque<State> state = new ArrayDeque<>();

	/** In scope variables. */
	private ArrayDeque<Object> bounds;

	/** Fresh variables */
	private ArrayDeque<Object> freshes;

	private ArrayList<Object> binders;

	/** Count the number of terms in list */
	private ArrayDeque<Integer> consCount = new ArrayDeque<>();

	/** The List construction descriptors */
	final protected ConstructionDescriptor nilDesc;
	final protected ConstructionDescriptor consDesc;

	// Constructors

	public TermParserListener(GenericFactory factory, Sink sink3, ArrayDeque<Object> bounds, ArrayDeque<Object> freshes)
	{
		this.sink3 = sink3;
		this.factory = factory;
		this.freshes = freshes;
		this.bounds = bounds;
		this.nilDesc = null;
		this.consDesc = null;

		state.push(State.SKIP);
	}

	public TermParserListener(org.transscript.runtime.Sink sink)
	{
		this(sink, new ArrayDeque<>(), new ArrayDeque<>(), sink.context().lookupDescriptor("Nil"),
				sink.context().lookupDescriptor("Cons"));
	}

	public TermParserListener(org.transscript.runtime.Sink sink4, ArrayDeque<Object> bounds, ArrayDeque<Object> freshes,
			ConstructionDescriptor nilDesc, ConstructionDescriptor consDesc)
	{
		this.sink4 = sink4;
		this.freshes = freshes;
		this.bounds = bounds;
		this.nilDesc = nilDesc;
		this.consDesc = consDesc;

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
		if (sink3 == null)
			sink4 = sink4.end();
		else
			sink3 = sink3.end();
		state.pop();
	}

	// --- literal

	@Override
	public void enterLiteral(LiteralContext ctx)
	{
		state.push(State.LITERAL); // Expect a terminal representing the literal
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
		if (sink3 == null)
			sink4 = sink4.start(nilDesc).end();
		else
			sink3 = sink3.start(sink3.makeConstructor("$Nil")).end();

		// And close all $Cons
		while (count-- > 0)
		{
			if (sink3 == null)
				sink4 = sink4.end();
			else
				sink3 = sink3.end();
		}

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
		if (sink3 == null)
			sink4 = sink4.endMetaApplication();
		else
			sink3 = sink3.endMetaApplication();

		state.pop();
	}

	// --- apply

	@Override
	public void enterApply(ApplyContext ctx)
	{
		if (sink4 != null)
			sink4 = sink4.startSubstitutes();
	}

	@Override
	public void exitApply(ApplyContext ctx)
	{
		if (sink4 != null)
			sink4 = sink4.endSubstitutes();
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

	// --- formal params

	@Override
	public void enterFormalParams(FormalParamsContext ctx)
	{
		state.push(State.PARAM);
	}

	@Override
	public void exitFormalParams(FormalParamsContext ctx)
	{
		state.pop();
	}

	// --- type

	@Override
	public void enterSortAnno(SortAnnoContext ctx)
	{
	//	if (sink4 != null)
	//		sink4 = sink4.startType();
	}

	@Override
	public void exitSortAnno(SortAnnoContext ctx)
	{
	//	if (sink4 != null)
	//		sink4 = sink4.endType();
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
			if (sink3 == null)
				sink4 = sink4.start(consDesc);
			else
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
						if (sink3 == null)
						{
							for (int i = 0; i < binders.size(); i++)
								sink4 = sink4.bind((Variable) binders.get(i));
						}
						else
						{
							net.sf.crsx.Variable[] bs = new net.sf.crsx.Variable[binders.size()];
							binders.toArray(bs);
							sink3 = sink3.binds(bs);
						}
					}
				}
				else
				{
					if (sink3 == null)
					{
						org.transscript.runtime.Variable binder = sink4.context().makeVariable(node.getText());
						bounds.push(binder);
						binders.add(binder);
					}
					else
					{
						net.sf.crsx.Variable binder = sink3.makeVariable(node.getText(), false);
						bounds.push(binder);
						binders.add(binder);
					}
				}
				state.pop();
				state.push(State.SKIP);
				break;

			case PARAM :
				if (node.getText().equals(")"))
				{
					if (binders.size() > 0)
					{
						assert sink3 != null;

						net.sf.crsx.Variable[] bs = new net.sf.crsx.Variable[binders.size()];
						binders.toArray(bs);
						sink3 = sink3.binds(bs);
					}
				}
				else
				{
					// No support for sink3
					if (sink3 == null)
					{
						org.transscript.runtime.Variable param = sink4.context().makeVariable(node.getText());
						bounds.push(param);
						sink4 = sink4.param(param);
					}
					else
					{
						// Treat as regular binder.
						net.sf.crsx.Variable binder = sink3.makeVariable(node.getText(), false);
						bounds.push(binder);
						binders.add(binder);
					}
				}
				state.pop();
				state.push(State.SKIP);
				break;
			case CONS :
				if (sink3 == null)
					sink4 = sink4.start(sink4.context().lookupDescriptor(node.getText()));
				else
					sink3 = sink3.start(sink3.makeConstructor(node.getText()));
				state.pop();
				state.push(State.SKIP);
				break;
			case METAVAR :
				if (sink3 == null)
					sink4 = sink4.startMetaApplication(node.getText());
				else
					sink3 = sink3.startMetaApplication(node.getText());
				state.pop();
				state.push(State.SKIP);
				break;
			case LITERAL : {
				String literal = node.getText();
				// HACK: should not unquote here!
				if (literal.length() > 0 && literal.charAt(0) == '"' && literal.charAt(literal.length() - 1) == '"')
					literal = literal.substring(1).substring(0, literal.length() - 2);

				if (sink3 == null)
					sink4 = sink4.literal(literal);
				else
					sink3 = sink3.start(sink3.makeLiteral(literal, CRS.STRING_SORT)).end();

				state.pop();
				state.push(State.SKIP);
			}
				break;
			case VAR :
				final String varname = node.getText();

				// This is a binder occurrence or a fresh variable. Resolve and emit
				Optional<Object> variable = bounds.stream().filter(var -> {
					if (var == MARKER)
						return false;

					if (var instanceof Variable)
						return ((Variable) var).name().equals(varname);

					return ((net.sf.crsx.Variable) var).name().equals(varname);
				}).findFirst();

				if (!variable.isPresent())
				{
					// Try among fresh variables
					variable = freshes.stream().filter(var -> {
						if (var instanceof Variable)
							return ((Variable) var).name().equals(varname);

						return ((net.sf.crsx.Variable) var).name().equals(varname);
					}).findFirst();
				}

				if (!variable.isPresent())
				{
					// Create new fresh variable.
					if (sink3 == null)
						variable = Optional.of(sink4.context().makeVariable(varname));
					else
						variable = Optional.of(sink3.makeVariable(varname, false));

					freshes.push(variable.get());
				}

				if (sink3 == null)
					sink4 = sink4.use((Variable) variable.get());
				else
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

					if (sink3 == null)
					{
						sink4 = sink4.context().getParser(category, false).parse(
								sink4, category, new StringReader(text), "", node.getSymbol().getLine(),
								node.getSymbol().getCharPositionInLine(), toCrsx4Bound());
					}
					else
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
			case TERM :
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

	/**
	 * Convert bound variable structure to one compatible with crsx4
	 * @return
	 */
	private Map<String, Variable> toCrsx4Bound()
	{
		HashMap<String, Variable> map = new HashMap<>();
		for (Object v : bounds)
		{
			if (v instanceof Variable)
				map.put(((Variable) v).name(), (Variable) v);
		};
		for (Object v : freshes)
		{
			if (v instanceof Variable)
				map.put(((Variable) v).name(), (Variable) v);
		};
		return map;
	}

}
