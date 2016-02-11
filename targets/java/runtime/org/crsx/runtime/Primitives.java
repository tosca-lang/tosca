// Copyright (c) 2015 IBM Corporation.
package org.crsx.runtime;

import static org.crsx.runtime.ConstructionDescriptor.makeData;

import org.crsx.runtime.primitives.AfterFirstDescriptor;
import org.crsx.runtime.primitives.BeforeFirstDescriptor;
import org.crsx.runtime.primitives.ColonDescriptor;
import org.crsx.runtime.primitives.ContainsDescriptor;
import org.crsx.runtime.primitives.DeepEqualDescriptor;
import org.crsx.runtime.primitives.DollarDescriptor;
import org.crsx.runtime.primitives.ErrorDescriptor;
import org.crsx.runtime.primitives.EscapeDescriptor;
import org.crsx.runtime.primitives.FormatNumberDescriptor;
import org.crsx.runtime.primitives.GetDescriptor;
import org.crsx.runtime.primitives.IfDefDescriptor;
import org.crsx.runtime.primitives.IfDescriptor;
import org.crsx.runtime.primitives.LengthDescriptor;
import org.crsx.runtime.primitives.MangleDescriptor;
import org.crsx.runtime.primitives.MinusDescriptor;
import org.crsx.runtime.primitives.ParseResourceDescriptor;
import org.crsx.runtime.primitives.PlusDescriptor;
import org.crsx.runtime.primitives.ReplaceDescriptor;
import org.crsx.runtime.primitives.RescapeDescriptor;
import org.crsx.runtime.primitives.StartsWithDescriptor;
import org.crsx.runtime.primitives.StringEqualDescriptor;
import org.crsx.runtime.primitives.SubstringDescriptor;
import org.crsx.runtime.primitives.TraceDescriptor;
import org.crsx.runtime.primitives.TrimDescriptor;
import org.crsx.runtime.primitives.UpCaseDescriptor;

/**
 * Crsx 3 Primitives.
 * 
 * Temporary until fully migrated to CRSX 4
 * 
 * @author villardl
 *
 */
public class Primitives
{

	// All primitives
	final public static ConstructionDescriptor _M_Builtin_sTrace = new TraceDescriptor();
	final public static ConstructionDescriptor _M_Builtin_sError = new ErrorDescriptor();
	final public static ConstructionDescriptor _M_Builtin_sEqual = makeData("Equal");
	final public static ConstructionDescriptor _M_Builtin_sDeepEqual = new DeepEqualDescriptor();
	final public static ConstructionDescriptor _M_Builtin_sIf = new IfDescriptor();
	final public static ConstructionDescriptor _M_Builtin_sIfDef = new IfDefDescriptor();
	final public static ConstructionDescriptor _M_Builtin_sShow = makeData("Show");
	final public static ConstructionDescriptor _M_Builtin_sGet = new GetDescriptor();
	final public static ConstructionDescriptor _M_Get = new GetDescriptor(); // Somehow {#E}Get is not recognized as primitive.
	
	final public static ConstructionDescriptor _M_Builtin_sParseText = makeData("ParseText");
	final public static ConstructionDescriptor _M_Builtin_sParseResource = new ParseResourceDescriptor();
	
	final public static ConstructionDescriptor _M_Builtin_sColon = new ColonDescriptor();

	final public static ConstructionDescriptor _M_Builtin_sSubstring = new SubstringDescriptor();
	final public static ConstructionDescriptor _M_Builtin_sUpCase = new UpCaseDescriptor();
	final public static ConstructionDescriptor _M_Builtin_sLength = new LengthDescriptor();
	final public static ConstructionDescriptor _M_Builtin_sRescape = new RescapeDescriptor();
	final public static ConstructionDescriptor _M_Builtin_sContains = new ContainsDescriptor();
	final public static ConstructionDescriptor _M_Builtin_sAfterFirst = new AfterFirstDescriptor();
	final public static ConstructionDescriptor _M_Builtin_sBeforeFirst = new BeforeFirstDescriptor();
	final public static ConstructionDescriptor _M_Builtin_sReplace = new ReplaceDescriptor();
	final public static ConstructionDescriptor _M_Builtin_sStartsWith = new StartsWithDescriptor();
	final public static ConstructionDescriptor _M_Builtin_sFormatNumber = new FormatNumberDescriptor();
	final public static ConstructionDescriptor _M_Builtin_sMangle = new MangleDescriptor();
	final public static ConstructionDescriptor _M_Builtin_sEscape =new EscapeDescriptor();
	final public static ConstructionDescriptor _M_Builtin_sTrim = new TrimDescriptor();
	final public static ConstructionDescriptor _M_Builtin_sStringEqual = new StringEqualDescriptor();
		
	final public static ConstructionDescriptor _M_Builtin_sMinus = new MinusDescriptor();
	final public static ConstructionDescriptor _M_Builtin_sPlus = new PlusDescriptor();
		
	final public static DollarDescriptor _M__s = new DollarDescriptor();
	
	public static void init(Context context)
	{
		context.register(_M__s);
		context.register(_M_Builtin_sIfDef);
	}
}
