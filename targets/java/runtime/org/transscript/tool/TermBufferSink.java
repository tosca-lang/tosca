// Copyright (c) 2016 IBM Corporation.

package org.transscript.tool;

import java.util.ArrayDeque;
import java.util.IdentityHashMap;
import java.util.Optional;

import org.transscript.runtime.BufferSink;
import org.transscript.runtime.ConstructionDescriptor;
import org.transscript.runtime.Context;
import org.transscript.runtime.Variable;
import org.transscript.runtime.utils.Pair;
import org.transscript.runtime.utils.Scoping;

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
	final protected ConstructionDescriptor literalDesc;
	final protected ConstructionDescriptor constructorDesc;
	final protected ConstructionDescriptor bindersDesc;

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
		literalDesc = context.lookupDescriptor("TransScript_literal");
		bindersDesc = context.lookupDescriptor("TransScript_binders_A1");
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
		else if (descriptor == literalDesc && state == State.SKIP)
		{
			state = State.LITERAL;
		}
		else if (descriptor == bindersDesc)
		{
			state = State.SORTANNO;
		}
		descs.push(descriptor);
		return this;
	}

	@Override
	public BufferSink end()
	{
		ConstructionDescriptor descriptor = descs.pop();
		if (descriptor == consDesc && state == State.SKIP) // trigger the end of a construction, which includes subs.
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
				super.literal(literal);
				break;
			case SORTANNO : {
				pendingSort = literal;
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
			pendingSort = "String";

		Variable languageVar = context.makeVariable(pendingSort, binder.name());
		vars.put(binder, languageVar);

		pendingSort = null;
		state = State.SKIP;
		return super.bind(languageVar);

	}

}
