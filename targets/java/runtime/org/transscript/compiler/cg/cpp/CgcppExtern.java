/* Copyright (c) 2016 IBM Corporation. */

package org.transscript.compiler.cg.cpp;

import static org.transscript.runtime.StringTerm.stringTerm;
import static org.transscript.runtime.Term.force;

import org.transscript.runtime.Context;
import org.transscript.runtime.StringTerm;
import org.transscript.tool.Utils;

/**
 * External functions for C++ code generator
 * 
 * @author Lionel Villard
 */
public class CgcppExtern
{

	/** Get the absolute name of the target c++ source file */
	public static StringTerm TargetCppSource(Context context, StringTerm mainurl, StringTerm input, StringTerm base, StringTerm buildir)
	{
		StringTerm emainurl = force(context, mainurl);
		StringTerm einput = force(context, input);
		StringTerm ebase = force(context, base);
		StringTerm ebuildir = force(context, buildir);
		StringTerm r = stringTerm(Utils.targetCppFilename(einput.unbox(), ebase.unbox(), ebuildir.unbox(), emainurl.unbox(), true, false));
		emainurl.release();
		einput.release();
		ebuildir.release();
		return r;
	}

	/** Get the absolute name of the target c++ header file */
	public static StringTerm TargetCppHeader(Context context, StringTerm mainurl, StringTerm input, StringTerm base, StringTerm buildir)
	{
		StringTerm emainurl = force(context, mainurl);
		StringTerm einput = force(context, input);
		StringTerm ebase = force(context, base);
		StringTerm ebuildir = force(context, buildir);
		StringTerm r = stringTerm(Utils.targetCppFilename(einput.unbox(), ebase.unbox(), ebuildir.unbox(), emainurl.unbox(), true, true));
		emainurl.release();
		einput.release();
		ebuildir.release();
		return r;
	}

}
