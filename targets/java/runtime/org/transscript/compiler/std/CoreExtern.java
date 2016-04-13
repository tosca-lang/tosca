/* Copyright (c) 2016 IBM Corporation. */

package org.transscript.compiler.std;

import org.transscript.runtime.Context;
import org.transscript.runtime.Normalizer;
import org.transscript.runtime.Sink;
import org.transscript.runtime.Term;
import org.transscript.runtime.Variable;
import org.transscript.runtime.VariableUse;

 

public class CoreExtern
{
//
//	public static <a extends Term, b extends Term> Bool SameVariable(Context context, a x_343, b x_347)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static <a extends Term, b extends Term> Bool Equal(Context context, a x_503, b x_508)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static <a extends Term> a Error(Context context, StringTerm x_359)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static <a extends Term> a Trace(Context context, a x_432)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static StringTerm GetEnv(Context context, StringTerm x_597, StringTerm x_602)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static <a extends Term> StringTerm Show(Context context, a x_614)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static <a extends Term, b extends Term, c extends Term> c IfDef(Context context, MapTerm x_628, a x_633, c x_638, c x_642)
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//	
	
	final public static boolean _M_IfDef(Sink sink, Term key, Term t, Term f)
	{
		final Context context = sink.context();

		key = Normalizer.normalize(context, key);
		java.lang.String value = System.getProperty(key.symbol());
		if (value != null)
		{

			sink.copy(t);
			f.release();
		}
		else
		{
			sink.copy(f);
			t.release();
		}

		key.release();
		return true;
	}

	final public static boolean _M_GetEnv(Sink sink, Term key, Term def)
	{
		final Context context = sink.context();

		key = Normalizer.normalize(context, key);

		java.lang.String value = System.getProperty(key.symbol());
		sink.literal(value == null ? "" : value);

		key.release();
		def.release();

		return true;
	}

	final public static boolean _M_Show(Sink sink, Term term)
	{
		final Context context = sink.context();
		term = Normalizer.normalize(context, term);

		sink.literal(term.toString());
		return true;
	}

	final public static boolean _M_Equal(Sink sink, Term term1, Term term2)
	{
		final Context context = sink.context();
		term1 = Normalizer.normalize(context, term1);
		term2 = Normalizer.normalize(context, term2);

		sink.start(term1.deepEquals(term2) ? Core._M_TRUE : Core._M_FALSE).end();
		term1.release();
		term2.release();
		return true;
	}

	final public static boolean _M_SameVariable(Sink sink, Term term1, Term term2)
	{
		if (Term.isVariableUse(term1) && Term.isVariableUse(term2))
		{
			Variable v1 = ((VariableUse) term1).variable();
			Variable v2 = ((VariableUse) term1).variable();
			sink.start(v1 == v2 ? Core._M_TRUE : Core._M_FALSE).end();
		}
		else
			sink.start(Core._M_FALSE).end();
		term1.release();
		term2.release();
		return true;
	}

	final public static boolean _M_Trace(Sink sink, Term term)
	{
		final Context context = sink.context();
		term = Normalizer.normalize(context, term);
		System.out.println(term);
		sink.copy(term);
		return true;
	}

	final public static boolean _M_Error(Sink sink, Term str)
	{
		final Context context = sink.context();
		str = Normalizer.normalize(context, str);
		System.err.println(str);
		System.exit(-1); // TODO: should be an exception
		return true;
	}

}
