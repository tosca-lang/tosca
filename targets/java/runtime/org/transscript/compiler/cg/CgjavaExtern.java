/* Copyright (c) 2016 IBM Corporation. */

package org.transscript.compiler.cg;

import org.transscript.runtime.Context;
import org.transscript.runtime.StringTerm;
import org.transscript.runtime.Term;
import org.transscript.tool.Utils;

/**
 * External functions for Java code generator
 * 
 * @author Lionel Villard
 */
public class CgjavaExtern
{

	public static StringTerm TargetJavaFilename(Context context, StringTerm input, StringTerm buildir, StringTerm mainurl, StringTerm pkg)
	{
		StringTerm einput = Term.force(context, input);
		StringTerm ebuildir = Term.force(context, buildir);
		StringTerm emainurl = Term.force(context, mainurl);
		StringTerm epkg = Term.force(context, pkg);
		StringTerm r = StringTerm.stringTerm(
				Utils.targetJavaFilename(einput.unbox(), ebuildir.unbox(), emainurl.unbox(), epkg.unbox(), true));
		einput.release();
		ebuildir.release();
		emainurl.release();
		epkg.release();
		return r;
	}

	public static StringTerm RelativePath(Context context, StringTerm input, StringTerm mainurl)
	{
		StringTerm einput = Term.force(context, input);
		StringTerm emainurl = Term.force(context, mainurl);
		StringTerm r = StringTerm.stringTerm(Utils.relativePath(einput.unbox(), emainurl.unbox()));
		einput.release();
		emainurl.release();
		return r;
	}

}
