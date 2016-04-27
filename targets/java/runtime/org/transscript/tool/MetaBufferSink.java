// Copyright (c) 2016 IBM Corporation.

package org.transscript.tool;

import static org.transscript.compiler.parser.TransScript.*;
import static org.transscript.compiler.std.Listdef.Cons;
import static org.transscript.compiler.std.Listdef.Nil;
import static org.transscript.runtime.StringTerm.stringTerm;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.function.Function;

import org.transscript.compiler.parser.TransScript.TransScript_xapply_xsort;
import org.transscript.compiler.parser.TransScript.TransScript_xargs_xsort;
import org.transscript.compiler.parser.TransScript.TransScript_xbinders_xsort;
import org.transscript.compiler.parser.TransScript.TransScript_xformalParams_xsort;
import org.transscript.compiler.parser.TransScript.TransScript_xqconstructor_xsort;
import org.transscript.compiler.parser.TransScript.TransScript_xscope_xsort;
import org.transscript.compiler.parser.TransScript.TransScript_xsortAnno_xsort;
import org.transscript.compiler.parser.TransScript.TransScript_xsortArgs_xsort;
import org.transscript.compiler.parser.TransScript.TransScript_xsortQualifier_xsort;
import org.transscript.compiler.parser.TransScript.TransScript_xsubst_xsort;
import org.transscript.compiler.parser.TransScript.TransScript_xterm_xsort;
import org.transscript.compiler.std.Listdef.List;
import org.transscript.runtime.ConstructionDescriptor;
import org.transscript.runtime.Context;
import org.transscript.runtime.Pair;
import org.transscript.runtime.Sink;
import org.transscript.runtime.StringTerm;
import org.transscript.runtime.StringTerm.VarStringTerm;
import org.transscript.runtime.Term;
import org.transscript.runtime.Variable;

/** 
 * Build term meta representation matching the TransScript term syntax.
 * 
 * NOTE: the implementation is highly dependent on the TransScript grammar description
 * in TransScript.g4.
 * 
 * <p>
 * For instance, this Core program:
 * <pre>F(1)</pre>
 * is parsed to the following (simplified) term 
 * <pre>Core_term_A1(Core_literal_A2(1))</pre>
 * 
 * is then turned into this following TransScript term:
 * <pre>TS_term_A1(TransScript_constructor("Core_term_A1", (TransScript_term_A1(... </pre>
 */
public class MetaBufferSink extends MetaSink
{
	// State

	/**  */
	protected Context context;

	/** Sub parameters stack */
	private ArrayDeque<SubParam> subParams;

	/** Sub current position stack */
	protected ArrayDeque<MutableInt> subIndex;

	/** Constructor type */
	private String type;

	/**
	 * @param context
	 */
	public MetaBufferSink(Context context)
	{
		this.context = context;
		this.subParams = new ArrayDeque<>();
		this.subParams.push(new ConsParam(null, new ArrayList<>()));
		this.subIndex = new ArrayDeque<>();
		this.subIndex.push(new MutableInt(0));

	}

	// Add sub to current construction
	protected void addSub(TransScript_xterm_xsort term)
	{
		if (subParams.peek() instanceof ConsParam)
		{
			subCons().thd = term;
		}
		else
		{
			MetaParam param = (MetaParam) subParams.peek();
			if (param.apply)
				param.snd.add(term);
			else
				param.thd.add(term);
		}

		// Move on to next sibling
		if (!subIndex.isEmpty())
			subIndex.peek().v++;
	}

	// Get current sub cons. Create it if not there yet
	protected SubCons subCons()
	{
		ArrayList<SubCons> subarray = ((ConsParam) subParams.peek()).snd;
		if (subarray.size() <= subIndex.peek().v)
		{
			subarray.add(new SubCons(new ArrayList<>(), new ArrayList<>(), null));
			assert subarray.size() > subIndex.peek().v;
		}

		return subarray.get(subIndex.peek().v);
	}

	// Overrides

	@Override
	public Sink start(ConstructionDescriptor descriptor)
	{
		List<TransScript_xsortQualifier_xsort> qualifier;
		if (type == null)
			qualifier = Nil(context);
		else
		{
			qualifier = Cons(context, TransScript_xsortQualifier(context, toTSSort(type)), Nil(context));
			type = null;
		}

		TransScript_xqconstructor_xsort qc = TransScript_xqconstructor(
				context, qualifier, TransScript_xconstructor(context, stringTerm(descriptor.symbol())));

		subParams.push(new ConsParam(qc, new ArrayList<>()));
		subIndex.push(new MutableInt(0)); // position to first sub.
		return this;
	}

	@Override
	public Sink end()
	{
		ConsParam cparams = (ConsParam) subParams.pop();
		subIndex.pop();

		List<TransScript_xargs_xsort> args;
		if (cparams.snd.isEmpty())
			args = Nil(context);
		else
			args = Cons(
					context,
					TransScript_xargs(context, Cons(context, TransScript_xscopes(context, toScopes(cparams.snd)), Nil(context))),
					Nil(context));

		TransScript_xterm_xsort term = TransScript_xterm(
				context, TransScript_xaterm_xA1(context, TransScript_xcons(context, cparams.fst, Nil(context), args, Nil(context))),
				Nil(context));

		addSub(term);
		return this;
	}

	@Override
	public Sink literal(String literal)
	{
		TransScript_xterm_xsort term = TransScript_xterm(
				context, TransScript_xaterm_xA2(context, TransScript_xliteral_xA1(context, stringTerm(literal))), Nil(context));

		addSub(term);
		return this;
	}

	@Override
	public Sink literal(double literal)
	{
		TransScript_xterm_xsort term = TransScript_xterm(
				context, TransScript_xaterm_xA2(context, TransScript_xliteral_xA2(context, stringTerm(Double.toString(literal)))),
				Nil(context));

		addSub(term);
		return this;
	}

	@Override
	public Sink use(Variable variable)
	{
		TransScript_xterm_xsort term = TransScript_xterm(
				context, TransScript_xaterm_xA4(context, TransScript_xvariable(context, (StringTerm) variable.use(), Nil(context))),
				Nil(context));

		addSub(term);
		return this;
	}

	@Override
	public Sink bind(Variable binder)
	{
		subCons().fst.add(binder);
		return this;
	}

	@Override
	public Sink param(Variable param)
	{
		subCons().snd.add(param);
		return this;
	}

	@Override
	public Sink startMetaApplication(String name)
	{
		subParams.push(new MetaParam(name, new ArrayList<>(), new ArrayList<>()));
		subIndex.push(new MutableInt(0)); // position to first sub. (not used)
		return this;
	}

	@Override
	public Sink endMetaApplication()
	{
		MetaParam mparams = (MetaParam) subParams.pop();
		subIndex.pop();

		List<TransScript_xapply_xsort> apply;
		if (mparams.snd.isEmpty())
			apply = Nil(context);
		else
			apply = Cons(
					context,
					TransScript_xapply(context, Cons(context, TransScript_xterms(context, toTerms(mparams.snd)), Nil(context))),
					Nil(context));

		List<TransScript_xsubst_xsort> subst;
		if (mparams.thd.isEmpty())
			subst = Nil(context);
		else
			subst = Cons(
					context,
					TransScript_xsubst(context, Cons(context, TransScript_xterms(context, toTerms(mparams.snd)), Nil(context))),
					Nil(context));

		TransScript_xterm_xsort term = TransScript_xterm(
				context,
				TransScript_xaterm_xA6(context,
						TransScript_xmetapp(context, stringTerm(mparams.fst), apply, subst, toTSSortAnno(mparams.type))),
				Nil(context));

		addSub(term);
		return this;
	}

	@Override
	public Sink startSubstitutes()
	{
		((MetaParam) subParams.peek()).apply = false;
		return this;
	}

	@Override
	public Sink endSubstitutes()
	{
		((MetaParam) subParams.peek()).apply = true;
		return this;
	}

	@Override
	public Sink type(String type)
	{
		if (subParams.peek() instanceof MetaParam)
			((MetaParam) subParams.peek()).type = type;
		else
			this.type = type;
		return this;
	}

	@Override
	public Sink copy(Term term)
	{
		addSub((TransScript_xterm_xsort) term);
		return this;
	}

	@Override
	public Context context()
	{
		return context;
	}

	/**
	 * @return The resulting meta term.
	 */
	public TransScript_xterm_xsort metaterm()
	{
		ConsParam sub = (ConsParam) subParams.pop();
		subIndex.pop();

		assert subParams.size() == 0;
		assert subIndex.size() == 0;
		return sub.snd.get(0).thd;
	}

	// Convert simple type string to TS type annotation
	private List<TransScript_xsortAnno_xsort> toTSSortAnno(String type)
	{
		if (type == null)
			return Nil(context);

		return Cons(context, TransScript_xsortAnno(context, toTSSort(type)), Nil(context));
	}

	// Convert simple type string to TS sort
	private TransScript_xsort_xsort toTSSort(String type)
	{
		// Type is always a constructor, optionally with type variable.
		List<TransScript_xsortArgs_xsort> args;
		if (type.contains("<")) // it's a List of something
		{
			String listArg = type.substring(type.indexOf('<') + 1, type.indexOf('>'));
			type = type.substring(0, type.indexOf('<'));
			args = Cons(
					context,
					TransScript_xsortArgs(context, Cons(context,
							TransScript_xsort(context,
									Nil(context), TransScript_xparamSort_xA1(context,
											TransScript_xconstructor(context, stringTerm(listArg)), Nil(context))),
							Nil(context))),
					Nil(context));
		}
		else
			args = Nil(context);

		return TransScript_xsort(context, Nil(context),
				TransScript_xparamSort_xA1(context, TransScript_xconstructor(context, stringTerm(type)), args));
	}

	// Convert internal rep sub to list of terms
	private List<TransScript_xterm_xsort> toTerms(ArrayList<TransScript_xterm_xsort> terms)
	{
		return toTSList(terms, t -> t);
	}

	// Convert internal rep sub to list of scopes
	private List<TransScript_xscope_xsort> toScopes(ArrayList<SubCons> subs)
	{
		return toTSList(subs, sub -> {
			ArrayList<Variable> sparams = sub.snd;
			TransScript_xformalParams_xsort params = null;
			if (!sparams.isEmpty())
			{
				params = TransScript_xformalParams_xA2(context, sub.thd);

				for (int i = sparams.size() - 1; i >= 0; i--)
				{
					params = TransScript_xformalParams_xA1(
							context, Nil(context), (VarStringTerm) sparams.get(sparams.size() - 1), params);
				}
			}

			ArrayList<Variable> sbinders = sub.fst;
			TransScript_xbinders_xsort binders = null;
			if (!sbinders.isEmpty())
			{
				binders = params == null ? TransScript_xbinders_xA2(context, sub.thd) : TransScript_xbinders_xA3(context, params);

				for (int i = sbinders.size() - 1; i >= 0; i--)
				{
					binders = TransScript_xbinders_xA1(
							context, Nil(context), (VarStringTerm) sbinders.get(sbinders.size() - 1), binders);
				}
			}

			if (binders != null)
				return TransScript_xscope_xA1(context, binders);
			if (params != null)
				return TransScript_xscope_xA2(context, params);

			return TransScript_xscope_xA3(context, sub.thd);
		});
	}

	// Convert Java list to TS list
	private <S, R extends Term> List<R> toTSList(ArrayList<S> lst, Function<S, R> map)
	{
		if (lst.isEmpty())
			return Nil(context);

		List<R> cons = Cons(context, map.apply(lst.get(lst.size() - 1)), Nil(context));
		for (int i = lst.size() - 2; i >= 0; i--)
		{
			List<R> ncons = Cons(context, map.apply(lst.get(i)), cons);
			cons = ncons;
		}

		return cons;
	}

	/** Construction sub term argument type alias. A triple of binders/formal params/term */
	static class SubCons extends Triple<ArrayList<Variable>, ArrayList<Variable>, TransScript_xterm_xsort>
	{

		public SubCons(ArrayList<Variable> fst, ArrayList<Variable> snd, TransScript_xterm_xsort thd)
		{
			super(fst, snd, thd);
		}

	}

	/** Base interface of sub params */
	interface SubParam
	{}

	/** Construction argument type alias */
	static class ConsParam extends Pair<TransScript_xqconstructor_xsort, ArrayList<SubCons>>implements SubParam
	{
		public ConsParam(TransScript_xqconstructor_xsort constructor, ArrayList<SubCons> subs)
		{
			super(constructor, subs);
		}
	}

	/** Meta argument type alias */
	static class MetaParam extends Triple<String, ArrayList<TransScript_xterm_xsort>, ArrayList<TransScript_xterm_xsort>>
			implements
				SubParam
	{
		public boolean apply = true;
		public String type;

		public MetaParam(String name, ArrayList<TransScript_xterm_xsort> apply, ArrayList<TransScript_xterm_xsort> subst)
		{
			super(name, apply, subst);
		}

	}

}
