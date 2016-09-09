// Copyright (c) 2016 IBM Corporation.

package org.transscript.tool;

import java.util.ArrayDeque;
import java.util.IdentityHashMap;

import org.transscript.runtime.BufferSink;
import org.transscript.runtime.ConstructionDescriptor;
import org.transscript.runtime.Context;
import org.transscript.runtime.Variable;

/** 
 * Build language specific terms from Tosca term syntax.
 * 
 * NOTE: the implementation is highly dependent on the Tosca grammar description
 * in TransScript.g4.
 * 
 * <p>
 * For instance, this Tosca term representing Core:
 * <pre>Core_literal(1)</pre>
 * is parsed to the following (simplified) term 
 * <pre>TransScript_term_A1(TransScript_constructor("Core_literal", (TransScript_term_A1(... </pre></pre>
 * 
 * is then turned by this class into this following language-specific term:
 * <pre>Core_literal("1")</pre>
 */
public class TermBufferSink extends BufferSink
{
	enum State {
		SKIP, CONSTRUCTOR, LITERAL, SORTANNO
	};

	// State

	/** Cached descriptors */
	//final protected ConstructionDescriptor termDesc;
	final protected ConstructionDescriptor consDesc;
	final protected ConstructionDescriptor stringDesc;
	final protected ConstructionDescriptor doubleDesc;
	final protected ConstructionDescriptor constructorDesc;
	final protected ConstructionDescriptor bindersDesc;
	final protected ConstructionDescriptor emptyListDesc;
	final protected ConstructionDescriptor singleListDesc;
	final protected ConstructionDescriptor lnilDesc;
	final protected ConstructionDescriptor lconsDesc;

	/** Current parsing state */
	protected State state;

	/** Stack of descriptors */
	protected ArrayDeque<ConstructionDescriptor> descs;

	/** Pending bound variable sort */
	protected String pendingSort;

	/** Map TransScript variable to language-specific variable */
	protected IdentityHashMap<Variable, Variable> vars;

	// Constructor

	/**
	 * @param context
	 */
	public TermBufferSink(Context context)
	{
		super(context);

		descs = new ArrayDeque<>();
		vars = new IdentityHashMap<>();
		consDesc = context.lookupDescriptor("TransScript_cons");
		constructorDesc = context.lookupDescriptor("TransScript_constructor");
		emptyListDesc = context.lookupDescriptor("TransScript_groupOrList_A1");
		singleListDesc = context.lookupDescriptor("TransScript_groupOrList_A2");
		stringDesc = context.lookupDescriptor("TransScript_literal_A1");
		doubleDesc = context.lookupDescriptor("TransScript_literal_A2");
		bindersDesc = context.lookupDescriptor("TransScript_binders_A1");

		lnilDesc = context.lookupDescriptor("Nil");
		lconsDesc = context.lookupDescriptor("Cons");
		state = State.SKIP;
	}
	// Overrides

	@Override
	public BufferSink start(ConstructionDescriptor descriptor)
	{
		if (descriptor == constructorDesc && state == State.SKIP) // trigger the beginning of a construction
		{
			// expected a literal representing the construction symbol 
			state = State.CONSTRUCTOR;
		}
		else if ((descriptor == stringDesc || descriptor == doubleDesc) && state == State.SKIP)
		{
			state = State.LITERAL;
		}
		else if (descriptor == bindersDesc)
		{
			state = State.SORTANNO;
		}
		else if (descriptor == emptyListDesc)
		{
			super.start(lnilDesc);
			super.end();
		}
		else if (descriptor == singleListDesc)
		{
			super.start(lconsDesc);
		}
		descs.push(descriptor);
		return this;
	}

	@Override
	public BufferSink end()
	{
		ConstructionDescriptor descriptor = descs.pop();
		if ((descriptor == consDesc || descriptor == singleListDesc) && state == State.SKIP)
			super.end();

		return this;
	}

	@Override
	public BufferSink literal(String literal)
	{
		switch (state)
		{
			case CONSTRUCTOR : {
				ConstructionDescriptor desc = context.lookupDescriptor(literal);
				if (desc == null)
					throw new RuntimeException("Fatal error: construction symbol not defined: " + literal);
				super.start(desc);
				state = State.SKIP;
				break;
			}
			case LITERAL :
				// TODO: this is a bit of a hack. Need to change ToSinkListener to distinguish between numeric vs string.
				try
				{
					double v = Double.parseDouble(literal);
					super.literal(v);
				} catch (NumberFormatException e)
				{
					super.literal(literal);
				}
				state = State.SKIP;
				break;
			case SORTANNO : {
				pendingSort = literal;
				state = State.SKIP;
				break;
			}
			case SKIP :
		}
		return this;
	}

	@Override
	public BufferSink literal(double literal)
	{
		switch (state)
		{
			case LITERAL :
				super.literal(literal);
				break;
			default :
		}
		return this;
	}

	@Override
	public BufferSink use(Variable variable)
	{
		Variable languageVar = vars.get(variable);
		if (languageVar == null)
		{
			languageVar = variable;
		}
		return super.use(languageVar);
	}

	@Override
	public BufferSink bind(Variable binder)
	{
		// Map Tosca variable onto language variable
		if (pendingSort == null)
			throw new RuntimeException("Missing bound variable type: " + binder.name());

		Variable languageVar = context.makeVariable(pendingSort, binder.name());
		vars.put(binder, languageVar);

		try
		{
			super.bind(languageVar);
		}
		catch (ClassCastException e)
		{
			throw new RuntimeException("Invalid type for variable named " + binder.name() + ":" + pendingSort);
		}

		pendingSort = null;
		state = State.SKIP;
		return this;
	}

}
