/* Copyright (c) 2016 IBM Corporation. */
package org.transscript.compiler.cg;

import org.transscript.runtime.Context;
import org.transscript.runtime.StringTerm;
import org.transscript.runtime.Term;
import org.transscript.tool.Utils;

/**
 * External functions for C++ code generator
 * 
 * @author Lionel Villard
 */
public class CgcppExtern
{

	public static StringTerm TargetCppSource(Context context, StringTerm input, StringTerm buildir)
	{
		StringTerm einput = Term.force(context, input);
		StringTerm ebuildir = Term.force(context, buildir);
		StringTerm r = StringTerm.stringTerm(Utils.targetCppFilename(einput.unbox(), ebuildir.unbox(), true, false));
		einput.release();
		ebuildir.release();
		return r;
	}

	public static StringTerm TargetCppHeader(Context context, StringTerm input, StringTerm buildir)
	{
		StringTerm einput = Term.force(context, input);
		StringTerm ebuildir = Term.force(context, buildir);
		StringTerm r = StringTerm.stringTerm(Utils.targetCppFilename(einput.unbox(), ebuildir.unbox(), true, true));
		einput.release();
		ebuildir.release();
		return r;
	}

}
