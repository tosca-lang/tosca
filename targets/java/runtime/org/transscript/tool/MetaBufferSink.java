// Copyright (c) 2016 IBM Corporation.

package org.transscript.tool;

import static org.transscript.compiler.parser.TransScript.*;
import static org.transscript.compiler.std.Listdef.Cons;
import static org.transscript.compiler.std.Listdef.Nil;
import static org.transscript.runtime.StringTerm.stringTerm;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.function.Function;

import org.transscript.compiler.parser.TransScript.TransScript_apply_sort;
import org.transscript.compiler.parser.TransScript.TransScript_args_sort;
import org.transscript.compiler.parser.TransScript.TransScript_binders_sort;
import org.transscript.compiler.parser.TransScript.TransScript_formalParams_sort;
import org.transscript.compiler.parser.TransScript.TransScript_qconstructor_sort;
import org.transscript.compiler.parser.TransScript.TransScript_scope_sort;
import org.transscript.compiler.parser.TransScript.TransScript_sortAnno_sort;
import org.transscript.compiler.parser.TransScript.TransScript_sortArgs_sort;
import org.transscript.compiler.parser.TransScript.TransScript_sortQualifier_sort;
import org.transscript.compiler.parser.TransScript.TransScript_subst_sort;
import org.transscript.compiler.parser.TransScript.TransScript_term_sort;
import org.transscript.compiler.std.Listdef.List;
import org.transscript.runtime.ConstructionDescriptor;
import org.transscript.runtime.Context;
import org.transscript.runtime.Sink;
import org.transscript.runtime.StringTerm;
import org.transscript.runtime.StringTerm.VarStringTerm;
import org.transscript.runtime.utils.Pair;
import org.transscript.runtime.Term;
import org.transscript.runtime.Variable;

/** 
 * Build term meta representation matching the Tosca term syntax.
 * 
 * NOTE: the implementation is highly dependent on the Tosca grammar description
 * in TransScript.g4.
 * 
 * <p>
 * For instance, this Core program:
 * <pre>F(1)</pre>
 * is parsed to the following (simplified) term 
 * <pre>Core_term_A1(Core_literal_A2(1))</pre>
 * 
 * is then turned by this class into this following Tosca term:
 * <pre>TransScript_term_A1(TransScript_constructor("Core_term_A1", (TransScript_term_A1(... </pre>
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
	protected void addSub(TransScript_term_sort term)
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
		List<TransScript_sortQualifier_sort> qualifier;
		if (type == null)
			qualifier = Nil(context);
		else
		{
			qualifier = Cons(context, TransScript_sortQualifier(context, toTSSort(type)), Nil(context));
			type = null;
		}

		TransScript_qconstructor_sort qc = TransScript_qconstructor(
				context, qualifier, TransScript_constructor(context, stringTerm(descriptor.symbol())));

		subParams.push(new ConsParam(qc, new ArrayList<>()));
		subIndex.push(new MutableInt(0)); // position to first sub.
		return this;
	}

	@Override
	public Sink end()
	{
		ConsParam cparams = (ConsParam) subParams.pop();
		subIndex.pop();

		List<TransScript_args_sort> args;
		if (cparams.snd.isEmpty())
			args = Nil(context);
		else
			args = Cons(
					context,
					TransScript_args(context, Cons(context, TransScript_scopes(context, toScopes(cparams.snd)), Nil(context))),
					Nil(context));

		TransScript_term_sort term = TransScript_term(
				context,
				TransScript_annoterm(
						context, Nil(context),
						TransScript_aterm_A1(context, TransScript_cons(context, cparams.fst, Nil(context), args, Nil(context)))),
				TransScript_nterm_A2(context));

		addSub(term);
		return this;
	}

	@Override
	public Sink literal(String literal)
	{
		TransScript_term_sort term = TransScript_term(
				context,
				TransScript_annoterm(
						context, Nil(context), TransScript_aterm_A2(context, TransScript_literal_A1(context, stringTerm(literal)))),
				TransScript_nterm_A2(context));

		addSub(term);
		return this;
	}

	@Override
	public Sink literal(double literal)
	{
		TransScript_term_sort term = TransScript_term(
				context,
				TransScript_annoterm(
						context, Nil(context),
						TransScript_aterm_A2(context, TransScript_literal_A2(context, stringTerm(Double.toString(literal))))),
				TransScript_nterm_A2(context));

		addSub(term);
		return this;
	}

	@Override
	public Sink use(Variable variable)
	{
		TransScript_term_sort term = TransScript_term(
				context,
				TransScript_annoterm(
						context, Nil(context), TransScript_aterm_A4(context, (StringTerm) variable.use(), Nil(context))),
				TransScript_nterm_A2(context));

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

		List<TransScript_apply_sort> apply;
		if (mparams.snd.isEmpty())
			apply = Nil(context);
		else
			apply = Cons(
					context,
					TransScript_apply(context, Cons(context, TransScript_terms(context, toTerms(mparams.snd)), Nil(context))),
					Nil(context));

		List<TransScript_subst_sort> subst;
		if (mparams.thd.isEmpty())
			subst = Nil(context);
		else
			subst = Cons(
					context,
					TransScript_subst(context, Cons(context, TransScript_terms(context, toTerms(mparams.thd)), Nil(context))),
					Nil(context));

		TransScript_term_sort term = TransScript_term(
				context,
				TransScript_annoterm(
						context, Nil(context),
						TransScript_aterm_A6(
								context,
								TransScript_metapp(context, stringTerm(mparams.fst), apply, subst, toTSSortAnno(mparams.type)))),
				TransScript_nterm_A2(context));

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
		//		if (subParams.peek() instanceof MetaParam)
		//			((MetaParam) subParams.peek()).type = type;
		//		else
		//			this.type = type;
		return this;
	}

	@Override
	public Sink copy(Term term)
	{
		addSub((TransScript_term_sort) term);
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
	public TransScript_term_sort metaterm()
	{
		ConsParam sub = (ConsParam) subParams.pop();
		subIndex.pop();

		assert subParams.size() == 0;
		assert subIndex.size() == 0;
		return sub.snd.get(0).thd;
	}

	// Convert simple type string to TS type annotation
	private List<TransScript_sortAnno_sort> toTSSortAnno(String type)
	{
		if (type == null)
			return Nil(context);

		return Cons(context, TransScript_sortAnno(context, toTSSort(type)), Nil(context));
	}

	// Convert simple type string to TS sort
	private TransScript_sort_sort toTSSort(String type)
	{
		// Type is always a constructor, optionally with type variable.
		List<TransScript_sortArgs_sort> args;
		if (type.contains("<")) // it's a List of something
		{
			String listArg = type.substring(type.indexOf('<') + 1, type.indexOf('>'));
			type = type.substring(0, type.indexOf('<'));
			args = Cons(context, TransScript_sortArgs(context, Cons(
					context,
					TransScript_sort(
							context, Nil(context), Nil(context),
							TransScript_paramSort_A1(context, TransScript_constructor(context, stringTerm(listArg)), Nil(context))),
					Nil(context))), Nil(context));
		}
		else
			args = Nil(context);

		return TransScript_sort(
				context, Nil(context), Nil(context),
				TransScript_paramSort_A1(context, TransScript_constructor(context, stringTerm(type)), args));
	}

	// Convert internal rep sub to list of terms
	private List<TransScript_term_sort> toTerms(ArrayList<TransScript_term_sort> terms)
	{
		return toTSList(terms, t -> t);
	}

	// Convert internal rep sub to list of scopes
	private List<TransScript_scope_sort> toScopes(ArrayList<SubCons> subs)
	{
		return toTSList(subs, sub -> {
			ArrayList<Variable> sparams = sub.snd;
			TransScript_formalParams_sort params = null;
			if (!sparams.isEmpty())
			{
				params = TransScript_formalParams_A2(context, sub.thd);

				for (int i = sparams.size() - 1; i >= 0; i--)
				{
					params = TransScript_formalParams_A1(context, Nil(context), (VarStringTerm) sparams.get(i), params);
				}
			}

			ArrayList<Variable> sbinders = sub.fst;
			TransScript_binders_sort binders = null;
			if (!sbinders.isEmpty())
			{
				binders = params == null ? TransScript_binders_A2(context, sub.thd) : TransScript_binders_A3(context, params);

				for (int i = sbinders.size() - 1; i >= 0; i--)
				{
					binders = TransScript_binders_A1(context, Nil(context), (VarStringTerm) sbinders.get(i), binders);
				}
			}

			TransScript_scope_sort scope;
			if (binders != null)
				scope = TransScript_scope_A1(context, binders);
			else if (params != null)
				scope = TransScript_scope_A2(context, params);
			else
				scope = TransScript_scope_A3(context, sub.thd);
			return scope;
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
	static class SubCons extends Triple<ArrayList<Variable>, ArrayList<Variable>, TransScript_term_sort>
	{

		public SubCons(ArrayList<Variable> fst, ArrayList<Variable> snd, TransScript_term_sort thd)
		{
			super(fst, snd, thd);
		}

	}

	/** Base interface of sub params */
	interface SubParam
	{}

	/** Construction argument type alias */
	static class ConsParam extends Pair<TransScript_qconstructor_sort, ArrayList<SubCons>> implements SubParam
	{
		public ConsParam(TransScript_qconstructor_sort constructor, ArrayList<SubCons> subs)
		{
			super(constructor, subs);
		}
	}

	/** Meta argument type alias */
	static class MetaParam extends Triple<String, ArrayList<TransScript_term_sort>, ArrayList<TransScript_term_sort>>
			implements
				SubParam
	{
		public boolean apply = true;
		public String type;

		public MetaParam(String name, ArrayList<TransScript_term_sort> apply, ArrayList<TransScript_term_sort> subst)
		{
			super(name, apply, subst);
		}

	}

}
