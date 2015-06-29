/* START MODULE crsxutils.crs.java */
/** Generated File */

package org.crsx.compiler;

import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;

import org.crsx.runtime.*;
import org.crsx.runtime.ConstructionDescriptor.*;
import static org.crsx.runtime.Primitives.*;
import static org.crsx.compiler.parser.Crsx.*;
import static org.crsx.compiler.std.Core.*;
import static org.crsx.compiler.std.Num.*;
import static org.crsx.compiler.std.String.*;
import static org.crsx.compiler.std.List.*;

public class Crsxutils
{
	final public static ConstructionDescriptor _M_ANNOTATIONS = makeData("ANNOTATIONS");
	final public static DynamicFunctionDescriptor _M_DesugarPropertyList = makeFunction(
			"DesugarPropertyList", Crsxutils.class, "_M_DesugarPropertyList");
	final public static DynamicFunctionDescriptor _M_DesugarDispatchCases = makeFunction(
			"DesugarDispatchCases", Crsxutils.class, "_M_DesugarDispatchCases");
	final public static DynamicFunctionDescriptor _M_DesugarListTermList = makeFunction(
			"DesugarListTermList", Crsxutils.class, "_M_DesugarListTermList");
	final public static DynamicFunctionDescriptor _M_DesugarList = makeFunction("DesugarList", Crsxutils.class, "_M_DesugarList");
	final public static DynamicFunctionDescriptor _M_DesugarFreeTermList = makeFunction(
			"DesugarFreeTermList", Crsxutils.class, "_M_DesugarFreeTermList");
	final public static DynamicFunctionDescriptor _M_DesugarTermList = makeFunction(
			"DesugarTermList", Crsxutils.class, "_M_DesugarTermList");
	final public static DynamicFunctionDescriptor _M_DesugarFreeTerms = makeFunction(
			"DesugarFreeTerms", Crsxutils.class, "_M_DesugarFreeTerms");
	final public static DynamicFunctionDescriptor _M_DesugarTerms = makeFunction("DesugarTerms", Crsxutils.class, "_M_DesugarTerms");
	final public static DynamicFunctionDescriptor _M_DesugarDeclarations = makeFunction(
			"DesugarDeclarations", Crsxutils.class, "_M_DesugarDeclarations");
	final public static DynamicFunctionDescriptor _M_SugarPropertyList = makeFunction(
			"SugarPropertyList", Crsxutils.class, "_M_SugarPropertyList");
	final public static DynamicFunctionDescriptor _M_SugarDispatchCases = makeFunction(
			"SugarDispatchCases", Crsxutils.class, "_M_SugarDispatchCases");
	final public static DynamicFunctionDescriptor _M_SugarFreeTerms = makeFunction(
			"SugarFreeTerms", Crsxutils.class, "_M_SugarFreeTerms");
	final public static DynamicFunctionDescriptor _M_SugarTerms = makeFunction("SugarTerms", Crsxutils.class, "_M_SugarTerms");
	final public static DynamicFunctionDescriptor _M_SugarTermsOpt = makeFunction(
			"SugarTermsOpt", Crsxutils.class, "_M_SugarTermsOpt");
	final public static DynamicFunctionDescriptor _M_IndexAnnotation = makeFunction(
			"IndexAnnotation", Crsxutils.class, "_M_IndexAnnotation");
	final public static DynamicFunctionDescriptor _M_Then = makeFunction("Then", Crsxutils.class, "_M_Then");
	final public static DynamicFunctionDescriptor _M_IndexAnnotations = makeFunction(
			"IndexAnnotations", Crsxutils.class, "_M_IndexAnnotations");
	final public static DynamicFunctionDescriptor _M_AllMetaTerms_xS1_xZOM = makeFunction(
			"AllMetaTerms_S1_ZOM", Crsxutils.class, "_M_AllMetaTerms_xS1_xZOM");
	final public static DynamicFunctionDescriptor _M_AllMetaTerms = makeFunction("AllMetaTerms", Crsxutils.class, "_M_AllMetaTerms");
	final public static DynamicFunctionDescriptor _M_AllMetaArgumentsOpt = makeFunction(
			"AllMetaArgumentsOpt", Crsxutils.class, "_M_AllMetaArgumentsOpt");
	final public static DynamicFunctionDescriptor _M_AllMetaInPatternRule = makeFunction(
			"AllMetaInPatternRule", Crsxutils.class, "_M_AllMetaInPatternRule");
	final public static DynamicFunctionDescriptor _M_IsPrimitive = makeFunction("IsPrimitive", Crsxutils.class, "_M_IsPrimitive");
	final public static DynamicFunctionDescriptor _M_IsDirectiveUnwrap = makeFunction(
			"IsDirectiveUnwrap", Crsxutils.class, "_M_IsDirectiveUnwrap");
	final public static DynamicFunctionDescriptor _M_IsDirective = makeFunction("IsDirective", Crsxutils.class, "_M_IsDirective");
	final public static DynamicFunctionDescriptor _M_ArityTerms_xS1_xZOM = makeFunction(
			"ArityTerms_S1_ZOM", Crsxutils.class, "_M_ArityTerms_xS1_xZOM");
	final public static DynamicFunctionDescriptor _M_ArityTerms = makeFunction("ArityTerms", Crsxutils.class, "_M_ArityTerms");
	final public static DynamicFunctionDescriptor _M_ArityArguments = makeFunction(
			"ArityArguments", Crsxutils.class, "_M_ArityArguments");
	final public static DynamicFunctionDescriptor _M_ArityArgumentsOpt = makeFunction(
			"ArityArgumentsOpt", Crsxutils.class, "_M_ArityArgumentsOpt");

	final public static boolean _M_DesugarPropertyList(Sink sink, int shared, int depth, Term term)
	{
		if (depth < 2000)
		{
			label :
			{
				if (!term.symbol().equals("Crsx_propertyList"))
				{
					break label;
				}
				Term sub = term.sub(0).ref();
				/* #property=sub */Term sub_23 = term.sub(1).ref();
				/* #propertyList_S1*=sub *//*Contract*/
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xpropertyList_xS1);
				sink.literal(";");
				sink.start(_M__sCons);
				sink.copy(sub);
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				sink.copy(sub_23);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_DesugarPropertyList, term);
	}

	final public static boolean _M_DesugarDispatchCases(Sink sink, int shared, int depth, Term term_81)
	{
		if (depth < 2000)
		{
			label_84 :
			{
				if (!term_81.symbol().equals("Crsx_dispatchCases"))
				{
					break label_84;
				}
				Term sub_20 = term_81.sub(0).ref();
				/* #dispatchCase=sub */Term sub_70 = term_81.sub(1).ref();
				/* #dispatchCases_S1*=sub *//*Contract*/
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xdispatchCases_xS1);
				sink.literal(";");
				sink.copy(sub_20);
				sink.end();
				sink.copy(sub_70);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_DesugarDispatchCases, term_81);
	}

	final public static boolean _M_DesugarListTermList(Sink sink, int shared, int depth, Term term_89)
	{
		if (depth < 2000)
		{
			label_36 :
			{
				if (!term_89.symbol().equals("$Nil"))
				{
					break label_36;
				}/*Contract*/
				sink.start(_M_Crsx_xfreeTerm_xA1);
				sink.start(_M__sNil);
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.start(_M_Crsx_xconstructor_xA1);
				sink.start(_M_Crsx_xqualifier_xA2);
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				return true;
			}
			label_50 :
			{
				if (!term_89.symbol().equals("$Cons"))
				{
					break label_50;
				}
				Term sub_7 = term_89.sub(0).ref();
				if (!sub_7.symbol().equals("Crsx_termList_S1"))
				{
					break label_50;
				}
				Term sub_63 = sub_7.sub(0).ref();
				Term sub_13 = sub_7.sub(1).ref();
				if (!sub_13.symbol().equals("$Nil"))
				{
					break label_50;
				}
				Term sub_76 = term_89.sub(1).ref();
				if (!sub_76.symbol().equals("$Nil"))
				{
					break label_50;
				}/*Contract*/
				sink.start(_M_Crsx_xfreeTerm_xA1);
				sink.start(_M__sNil);
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.start(_M_Crsx_xconstructor_xA1);
				sink.start(_M_Crsx_xqualifier_xA2);
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				return true;
			}
			label_70 :
			{
				if (!term_89.symbol().equals("$Cons"))
				{
					break label_70;
				}
				Term sub_5 = term_89.sub(0).ref();
				if (!sub_5.symbol().equals("Crsx_termList_S1"))
				{
					break label_70;
				}
				Term sub_74 = sub_5.sub(0).ref();
				Term sub_16 = sub_5.sub(1).ref();
				if (!sub_16.symbol().equals("$Cons"))
				{
					break label_70;
				}
				Term sub_2 = sub_16.sub(0).ref();
				if (!sub_2.symbol().equals("Crsx_term_A1"))
				{
					break label_70;
				}
				Term sub_68 = sub_2.sub(0).ref();
				/* #freeTerm=sub */Term sub_95 = sub_16.sub(1).ref();
				if (!sub_95.symbol().equals("$Nil"))
				{
					break label_70;
				}
				Term sub_96 = term_89.sub(1).ref();
				if (!sub_96.symbol().equals("$Nil"))
				{
					break label_70;
				}/*Contract*/
				sink.copy(sub_68);
				return true;
			}
			label_20 :
			{
				if (!term_89.symbol().equals("$Cons"))
				{
					break label_20;
				}
				Term sub_155 = term_89.sub(0).ref();
				if (!sub_155.symbol().equals("Crsx_termList_S1"))
				{
					break label_20;
				}
				Term sub_27 = sub_155.sub(0).ref();
				Term sub_189 = sub_155.sub(1).ref();
				if (!sub_189.symbol().equals("$Cons"))
				{
					break label_20;
				}
				Term sub_12 = sub_189.sub(0).ref();
				/* #term=sub */Term sub_6 = sub_189.sub(1).ref();
				if (!sub_6.symbol().equals("$Nil"))
				{
					break label_20;
				}
				Term sub_39 = term_89.sub(1).ref();
				if (!sub_39.symbol().equals("$Cons"))
				{
					break label_20;
				}
				Term sub_93 = sub_39.sub(0).ref();
				if (!sub_93.symbol().equals("Crsx_termList_S1"))
				{
					break label_20;
				}
				Term sub_77 = sub_93.sub(0).ref();
				Term sub_91 = sub_93.sub(1).ref();
				if (!sub_91.symbol().equals("$Nil"))
				{
					break label_20;
				}
				Term sub_78 = sub_39.sub(1).ref();
				if (!sub_78.symbol().equals("$Nil"))
				{
					break label_20;
				}/*Contract*/
				sink.start(_M_Crsx_xfreeTerm_xA1);
				sink.start(_M__sNil);
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.start(_M_Crsx_xconstructor_xA1);
				sink.start(_M_Crsx_xqualifier_xA2);
				sink.end();
				sink.literal("$Cons");
				sink.end();
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xarguments);
				sink.literal("[");
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xterms);
				sink.copy(sub_12);
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xterms_xS1);
				sink.literal(",");
				sink.start(_M_Crsx_xterm_xA1);
				sink.start(_M_Crsx_xfreeTerm_xA1);
				sink.start(_M__sNil);
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.start(_M_Crsx_xconstructor_xA1);
				sink.start(_M_Crsx_xqualifier_xA2);
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.literal("]");
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_93 :
			{
				if (!term_89.symbol().equals("$Cons"))
				{
					break label_93;
				}
				Term sub_56 = term_89.sub(0).ref();
				if (!sub_56.symbol().equals("Crsx_termList_S1"))
				{
					break label_93;
				}
				Term sub_79 = sub_56.sub(0).ref();
				Term sub_83 = sub_56.sub(1).ref();
				if (!sub_83.symbol().equals("$Cons"))
				{
					break label_93;
				}
				Term sub_62 = sub_83.sub(0).ref();
				/* #term=sub */Term sub_51 = sub_83.sub(1).ref();
				if (!sub_51.symbol().equals("$Nil"))
				{
					break label_93;
				}
				Term sub_59 = term_89.sub(1).ref();
				if (!sub_59.symbol().equals("$Cons"))
				{
					break label_93;
				}
				Term sub_177 = sub_59.sub(0).ref();
				if (!sub_177.symbol().equals("Crsx_termList_S1"))
				{
					break label_93;
				}
				Term sub_55 = sub_177.sub(0).ref();
				Term sub_175 = sub_177.sub(1).ref();
				if (!sub_175.symbol().equals("$Cons"))
				{
					break label_93;
				}
				Term sub_88 = sub_175.sub(0).ref();
				/* #term2=sub */Term sub_396 = sub_175.sub(1).ref();
				if (!sub_396.symbol().equals("$Nil"))
				{
					break label_93;
				}
				Term sub_21 = sub_59.sub(1).ref();
				/* #termList_S1*=sub *//*Contract*/
				sink.start(_M_Crsx_xfreeTerm_xA1);
				sink.start(_M__sNil);
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.start(_M_Crsx_xconstructor_xA1);
				sink.start(_M_Crsx_xqualifier_xA2);
				sink.end();
				sink.literal("$Cons");
				sink.end();
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xarguments);
				sink.literal("[");
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xterms);
				sink.copy(sub_62);
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xterms_xS1);
				sink.literal(",");
				sink.start(_M_Crsx_xterm_xA1);
				sink.start(_M_DesugarListTermList);
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xtermList_xS1);
				sink.literal(";");
				sink.start(_M__sCons);
				sink.copy(sub_88);
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				sink.copy(sub_21);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.literal("]");
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_DesugarListTermList, term_89);
	}

	final public static boolean _M_DesugarList(Sink sink, int shared, int depth, Term term_56)
	{
		if (depth < 2000)
		{
			label_35 :
			{
				if (!term_56.symbol().equals("Crsx_freeTerm_A4"))
				{
					break label_35;
				}
				Term sub_35 = term_56.sub(0).ref();
				/* #annotations?=sub */Term sub_47 = term_56.sub(1).ref();
				if (!sub_47.symbol().equals("Crsx_list"))
				{
					break label_35;
				}
				Term sub_64 = sub_47.sub(0).ref();
				Term sub_194 = sub_47.sub(1).ref();
				if (!sub_194.symbol().equals("$Nil"))
				{
					break label_35;
				}
				Term sub_46 = sub_47.sub(2).ref();/*Contract*/
				sink.start(_M_Crsx_xfreeTerm_xA1);
				sink.copy(sub_35);
				sink.start(_M__sNil);
				sink.end();
				sink.start(_M_Crsx_xconstructor_xA1);
				sink.start(_M_Crsx_xqualifier_xA2);
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				return true;
			}
			label_3 :
			{
				if (!term_56.symbol().equals("Crsx_freeTerm_A4"))
				{
					break label_3;
				}
				Term sub_42 = term_56.sub(0).ref();
				/* #annotations?=sub */Term sub_45 = term_56.sub(1).ref();
				if (!sub_45.symbol().equals("Crsx_list"))
				{
					break label_3;
				}
				Term sub_38 = sub_45.sub(0).ref();
				Term sub_98 = sub_45.sub(1).ref();
				if (!sub_98.symbol().equals("$Cons"))
				{
					break label_3;
				}
				Term sub_75 = sub_98.sub(0).ref();
				/* #termList=sub */Term sub_57 = sub_98.sub(1).ref();
				if (!sub_57.symbol().equals("$Nil"))
				{
					break label_3;
				}
				Term sub_14 = sub_45.sub(2).ref();/*Contract*/
				sink.start(_M_DesugarListTermList);
				sink.start(_M_DesugarTermList);
				sink.copy(sub_75);
				sink.end();
				sink.end();
				return true;
			}
			label_23 :
			{
				if (!term_56.symbol().equals("Crsx_list"))
				{
					break label_23;
				}
				Term sub_41 = term_56.sub(0).ref();
				Term sub_84 = term_56.sub(1).ref();
				if (!sub_84.symbol().equals("$Nil"))
				{
					break label_23;
				}
				Term sub_0 = term_56.sub(2).ref();/*Contract*/
				sink.start(_M_Crsx_xfreeTerm_xA1);
				sink.start(_M__sNil);
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.start(_M_Crsx_xconstructor_xA1);
				sink.start(_M_Crsx_xqualifier_xA2);
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				return true;
			}
			label_6 :
			{
				if (!term_56.symbol().equals("Crsx_list"))
				{
					break label_6;
				}
				Term sub_170 = term_56.sub(0).ref();
				Term sub_17 = term_56.sub(1).ref();
				if (!sub_17.symbol().equals("$Cons"))
				{
					break label_6;
				}
				Term sub_165 = sub_17.sub(0).ref();
				/* #termList=sub */Term sub_11 = sub_17.sub(1).ref();
				if (!sub_11.symbol().equals("$Nil"))
				{
					break label_6;
				}
				Term sub_111 = term_56.sub(2).ref();/*Contract*/
				sink.start(_M_DesugarListTermList);
				sink.start(_M_DesugarTermList);
				sink.copy(sub_165);
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_DesugarList, term_56);
	}

	final public static boolean _M_DesugarTermList(Sink sink, int shared, int depth, Term term_13)
	{
		if (depth < 2000)
		{
			label_56 :
			{
				if (!term_13.symbol().equals("Crsx_termList"))
				{
					break label_56;
				}
				Term sub_191 = term_13.sub(0).ref();
				/* #term=sub */Term sub_58 = term_13.sub(1).ref();
				/* #termList_S1*=sub *//*Contract*/
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xtermList_xS1);
				sink.literal(";");
				sink.start(_M__sCons);
				sink.copy(sub_191);
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				sink.copy(sub_58);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_DesugarTermList, term_13);
	}

	final public static boolean _M_DesugarFreeTerms(Sink sink, int shared, int depth, Term term_49)
	{
		if (depth < 2000)
		{
			label_86 :
			{
				if (!term_49.symbol().equals("Crsx_freeTerms"))
				{
					break label_86;
				}
				Term sub_52 = term_49.sub(0).ref();
				/* #freeTerm=sub */Term sub_94 = term_49.sub(1).ref();
				/* #freeTerms_S1*=sub *//*Contract*/
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xfreeTerms_xS1);
				sink.literal(",");
				sink.copy(sub_52);
				sink.end();
				sink.copy(sub_94);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_DesugarFreeTerms, term_49);
	}

	final public static boolean _M_DesugarTerms(Sink sink, int shared, int depth, Term term_19)
	{
		if (depth < 2000)
		{
			label_95 :
			{
				if (!term_19.symbol().equals("Crsx_terms"))
				{
					break label_95;
				}
				Term sub_174 = term_19.sub(0).ref();
				/* #term=sub */Term sub_90 = term_19.sub(1).ref();
				/* #terms_S1*=sub *//*Contract*/
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xterms_xS1);
				sink.literal(",");
				sink.copy(sub_174);
				sink.end();
				sink.copy(sub_90);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_DesugarTerms, term_19);
	}

	final public static boolean _M_DesugarDeclarations(Sink sink, int shared, int depth, Term term_64)
	{
		if (depth < 2000)
		{
			label_72 :
			{
				if (!term_64.symbol().equals("Crsx_declarations"))
				{
					break label_72;
				}
				Term sub_19 = term_64.sub(0).ref();
				/* #declaration=sub */Term sub_8 = term_64.sub(1).ref();
				/* #declarations_S1*=sub *//*Contract*/
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xdeclarations_xS1);
				sink.literal(";");
				sink.start(_M__sCons);
				sink.copy(sub_19);
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				sink.copy(sub_8);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_DesugarDeclarations, term_64);
	}

	final public static boolean _M_SugarPropertyList(Sink sink, int shared, int depth, Term term_37)
	{
		if (depth < 2000)
		{
			label_8 :
			{
				if (!term_37.symbol().equals("$Nil"))
				{
					break label_8;
				}/*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.literal("Internal error: cannot rewrite an empty list of properties.");
				sink.end();
				return true;
			}
			label_21 :
			{
				if (!term_37.symbol().equals("$Cons"))
				{
					break label_21;
				}
				Term sub_104 = term_37.sub(0).ref();
				if (!sub_104.symbol().equals("Crsx_propertyList_S1"))
				{
					break label_21;
				}
				Term sub_179 = sub_104.sub(0).ref();
				Term sub_158 = sub_104.sub(1).ref();
				if (!sub_158.symbol().equals("$Cons"))
				{
					break label_21;
				}
				Term sub_50 = sub_158.sub(0).ref();
				/* #property=sub */Term sub_10 = sub_158.sub(1).ref();
				if (!sub_10.symbol().equals("$Nil"))
				{
					break label_21;
				}
				Term sub_153 = term_37.sub(1).ref();
				/* #propertyList_S1*=sub *//*Contract*/
				sink.start(_M_Crsx_xpropertyList);
				sink.copy(sub_50);
				sink.copy(sub_153);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SugarPropertyList, term_37);
	}

	final public static boolean _M_SugarDispatchCases(Sink sink, int shared, int depth, Term term_30)
	{
		if (depth < 2000)
		{
			label_78 :
			{
				if (!term_30.symbol().equals("$Nil"))
				{
					break label_78;
				}/*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.literal("Assertion error: at least one dispatch case must be defined.");
				sink.end();
				return true;
			}
			label_58 :
			{
				if (!term_30.symbol().equals("$Cons"))
				{
					break label_58;
				}
				Term sub_132 = term_30.sub(0).ref();
				if (!sub_132.symbol().equals("Crsx_dispatchCases_S1"))
				{
					break label_58;
				}
				Term sub_197 = sub_132.sub(0).ref();
				Term sub_72 = sub_132.sub(1).ref();
				/* #dispatchCase=sub */Term sub_92 = term_30.sub(1).ref();
				/* #dispatchCases_S1*=sub *//*Contract*/
				sink.start(_M_Crsx_xdispatchCases);
				sink.copy(sub_72);
				sink.copy(sub_92);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SugarDispatchCases, term_30);
	}

	final public static boolean _M_SugarFreeTerms(Sink sink, int shared, int depth, Term term_2)
	{
		if (depth < 2000)
		{
			label_49 :
			{
				if (!term_2.symbol().equals("$Nil"))
				{
					break label_49;
				}/*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.literal("Internal error: cannot rewrite an empty list of terms to term");
				sink.end();
				return true;
			}
			label_15 :
			{
				if (!term_2.symbol().equals("$Cons"))
				{
					break label_15;
				}
				Term sub_151 = term_2.sub(0).ref();
				if (!sub_151.symbol().equals("Crsx_freeTerms_S1"))
				{
					break label_15;
				}
				Term sub_69 = sub_151.sub(0).ref();
				Term sub_133 = sub_151.sub(1).ref();
				/* #freeTerm=sub */Term sub_131 = term_2.sub(1).ref();
				/* #freeTerms_S1*=sub *//*Contract*/
				sink.start(_M_Crsx_xfreeTerms);
				sink.copy(sub_133);
				sink.copy(sub_131);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SugarFreeTerms, term_2);
	}

	final public static boolean _M_SugarTerms(Sink sink, int shared, int depth, Term term_20)
	{
		if (depth < 2000)
		{
			label_88 :
			{
				if (!term_20.symbol().equals("$Nil"))
				{
					break label_88;
				}/*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.literal("Internal error: cannot rewrite an empty list of terms to term");
				sink.end();
				return true;
			}
			label_44 :
			{
				if (!term_20.symbol().equals("$Cons"))
				{
					break label_44;
				}
				Term sub_89 = term_20.sub(0).ref();
				if (!sub_89.symbol().equals("Crsx_terms_S1"))
				{
					break label_44;
				}
				Term sub_184 = sub_89.sub(0).ref();
				Term sub_28 = sub_89.sub(1).ref();
				/* #term=sub */Term sub_164 = term_20.sub(1).ref();
				/* #terms_S1*=sub *//*Contract*/
				sink.start(_M_Crsx_xterms);
				sink.copy(sub_28);
				sink.copy(sub_164);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SugarTerms, term_20);
	}

	final public static boolean _M_SugarTermsOpt(Sink sink, int shared, int depth, Term term_86)
	{
		if (depth < 2000)
		{
			label_39 :
			{
				if (!term_86.symbol().equals("$Nil"))
				{
					break label_39;
				}/*Contract*/
				sink.start(_M__sNil);
				sink.end();
				return true;
			}
			label_55 :
			{
				if (!term_86.symbol().equals("$Cons"))
				{
					break label_55;
				}
				Term sub_143 = term_86.sub(0).ref();
				if (!sub_143.symbol().equals("Crsx_terms_S1"))
				{
					break label_55;
				}
				Term sub_81 = sub_143.sub(0).ref();
				Term sub_249 = sub_143.sub(1).ref();
				/* #term=sub */Term sub_80 = term_86.sub(1).ref();
				/* #terms_S1*=sub *//*Contract*/
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xterms);
				sink.copy(sub_249);
				sink.copy(sub_80);
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SugarTermsOpt, term_86);
	}

	final public static boolean _M_IndexAnnotation(Sink sink, int shared, int depth, Properties props, Term term_40, Term term_28)
	{
		if (depth < 2000)
		{
			label_67 :
			{
				if (!term_40.symbol().equals("Crsx_annotation"))
				{
					break label_67;
				}
				Term sub_260 = term_40.sub(0).ref();
				Term sub_87 = term_40.sub(1).ref();
				if (!sub_87.symbol().equals("Crsx_constructor_A1"))
				{
					break label_67;
				}
				Term sub_126 = sub_87.sub(0).ref();
				if (!sub_126.symbol().equals("Crsx_qualifier_A2"))
				{
					break label_67;
				}
				Term sub_141 = sub_87.sub(1).ref();
				/* #CONSTRUCTOR=sub */Term sub_157 = term_40.sub(2).ref();
				/* #arguments?=sub */
				if (!term_28.symbol().equals("CONTINUATION"))
				{
					break label_67;
				}
				Term sub_121 = term_28.sub(0).ref();
				/* #=sub *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sTrace);
				sink.end();
				Term term_141;
				{
					BufferSink buf = sink.context().makeBuffer();
					buf.start(_M_OK);
					buf.end();
					term_141 = buf.term();
				}
				sink.substitute(sub_121.ref(), new Variable[]
					{}, new Term[]
					{term_141});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_IndexAnnotation, term_40, term_28);
	}

	final public static boolean _M_Then(Sink sink, int shared, int depth, Properties props_23, Term term_91)
	{
		if (depth < 2000)
		{
			label_119 :
			{
				if (!term_91.symbol().equals("OK"))
				{
					break label_119;
				}/*Contract*/
				sink.properties(props_23);
				sink.start(_M_ANNOTATIONS);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Then, term_91);
	}

	final public static boolean _M_IndexAnnotations(Sink sink, int shared, int depth, Term term_165)
	{
		if (depth < 2000)
		{
			label_62 :
			{
				if (!term_165.symbol().equals("$Nil"))
				{
					break label_62;
				}/*Contract*/
				sink.start(_M_ANNOTATIONS);
				sink.end();
				return true;
			}
			label_18 :
			{
				if (!term_165.symbol().equals("$Cons"))
				{
					break label_18;
				}
				Term sub_49 = term_165.sub(0).ref();
				if (!sub_49.symbol().equals("Crsx_annotations"))
				{
					break label_18;
				}
				Term sub_61 = sub_49.sub(0).ref();
				/* #annotation+=sub */Term sub_15 = term_165.sub(1).ref();
				if (!sub_15.symbol().equals("$Nil"))
				{
					break label_18;
				}/*Contract*/
				sink.start(_M_SeqMap);
				Variable var = sink.context().makeVariable("anno");
				Variable var_56 = sink.context().makeVariable("cont");
				sink.binds(new Variable[]
					{var, var_56});
				sink.start(_M_IndexAnnotation);
				sink.use(var);
				sink.use(var_56);
				sink.end();
				sink.copy(sub_61);
				Variable var_50 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_50});
				sink.start(_M_Then);
				sink.use(var_50);
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_IndexAnnotations, term_165);
	}

	final public static boolean _M_AllMetaTerms_xS1_xZOM(Sink sink, int shared, int depth, Term term_77)
	{
		if (depth < 2000)
		{
			label_82 :
			{
				if (!term_77.symbol().equals("$Nil"))
				{
					break label_82;
				}/*Contract*/
				sink.start(_M_TRUE);
				sink.end();
				return true;
			}
			label_89 :
			{
				if (!term_77.symbol().equals("$Cons"))
				{
					break label_89;
				}
				Term sub_32 = term_77.sub(0).ref();
				if (!sub_32.symbol().equals("Crsx_terms_S1"))
				{
					break label_89;
				}
				Term sub_1 = sub_32.sub(0).ref();
				Term sub_232 = sub_32.sub(1).ref();
				if (!sub_232.symbol().equals("Crsx_term_A1"))
				{
					break label_89;
				}
				Term sub_138 = sub_232.sub(0).ref();
				if (!sub_138.symbol().equals("Crsx_freeTerm_A7"))
				{
					break label_89;
				}
				Term sub_86 = sub_138.sub(0).ref();
				if (!sub_86.symbol().equals("$Nil"))
				{
					break label_89;
				}
				Term sub_24 = sub_138.sub(1).ref();
				if (!sub_24.symbol().equals("$Nil"))
				{
					break label_89;
				}
				Term sub_3 = sub_138.sub(2).ref();
				/* #METAVAR=sub */Term sub_48 = sub_138.sub(3).ref();
				if (!sub_48.symbol().equals("$Nil"))
				{
					break label_89;
				}
				Term sub_178 = term_77.sub(1).ref();
				/* #terms_S1*=sub *//*Contract*/
				sink.start(_M_AllMetaTerms_xS1_xZOM);
				sink.copy(sub_178);
				sink.end();
				return true;
			}
			label_27 :
			{
				/* #terms_S1_ZOM=term *//*Contract*/sink.start(_M_FALSE);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_AllMetaTerms_xS1_xZOM, term_77);
	}

	final public static boolean _M_AllMetaTerms(Sink sink, int shared, int depth, Term term_34)
	{
		if (depth < 2000)
		{
			label_118 :
			{
				if (!term_34.symbol().equals("Crsx_terms"))
				{
					break label_118;
				}
				Term sub_67 = term_34.sub(0).ref();
				if (!sub_67.symbol().equals("Crsx_term_A1"))
				{
					break label_118;
				}
				Term sub_124 = sub_67.sub(0).ref();
				if (!sub_124.symbol().equals("Crsx_freeTerm_A7"))
				{
					break label_118;
				}
				Term sub_66 = sub_124.sub(0).ref();
				if (!sub_66.symbol().equals("$Nil"))
				{
					break label_118;
				}
				Term sub_161 = sub_124.sub(1).ref();
				if (!sub_161.symbol().equals("$Nil"))
				{
					break label_118;
				}
				Term sub_116 = sub_124.sub(2).ref();
				/* #METAVAR=sub */Term sub_226 = sub_124.sub(3).ref();
				if (!sub_226.symbol().equals("$Nil"))
				{
					break label_118;
				}
				Term sub_65 = term_34.sub(1).ref();
				/* #terms_S1*=sub *//*Contract*/
				sink.start(_M_AllMetaTerms_xS1_xZOM);
				sink.copy(sub_65);
				sink.end();
				return true;
			}
			label_65 :
			{
				/* #terms=term *//*Contract*/sink.start(_M_FALSE);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_AllMetaTerms, term_34);
	}

	final public static boolean _M_AllMetaArgumentsOpt(Sink sink, int shared, int depth, Term term_43)
	{
		if (depth < 2000)
		{
			label_81 :
			{
				if (!term_43.symbol().equals("$Nil"))
				{
					break label_81;
				}/*Contract*/
				sink.start(_M_TRUE);
				sink.end();
				return true;
			}
			label_53 :
			{
				if (!term_43.symbol().equals("$Cons"))
				{
					break label_53;
				}
				Term sub_198 = term_43.sub(0).ref();
				if (!sub_198.symbol().equals("Crsx_arguments"))
				{
					break label_53;
				}
				Term sub_283 = sub_198.sub(0).ref();
				Term sub_183 = sub_198.sub(1).ref();
				if (!sub_183.symbol().equals("$Nil"))
				{
					break label_53;
				}
				Term sub_43 = sub_198.sub(2).ref();
				Term sub_130 = term_43.sub(1).ref();
				if (!sub_130.symbol().equals("$Nil"))
				{
					break label_53;
				}/*Contract*/
				sink.start(_M_TRUE);
				sink.end();
				return true;
			}
			label_73 :
			{
				if (!term_43.symbol().equals("$Cons"))
				{
					break label_73;
				}
				Term sub_54 = term_43.sub(0).ref();
				if (!sub_54.symbol().equals("Crsx_arguments"))
				{
					break label_73;
				}
				Term sub_169 = sub_54.sub(0).ref();
				Term sub_71 = sub_54.sub(1).ref();
				if (!sub_71.symbol().equals("$Cons"))
				{
					break label_73;
				}
				Term sub_140 = sub_71.sub(0).ref();
				/* #terms=sub */Term sub_192 = sub_71.sub(1).ref();
				if (!sub_192.symbol().equals("$Nil"))
				{
					break label_73;
				}
				Term sub_112 = sub_54.sub(2).ref();
				Term sub_31 = term_43.sub(1).ref();
				if (!sub_31.symbol().equals("$Nil"))
				{
					break label_73;
				}/*Contract*/
				sink.start(_M_AllMetaTerms);
				sink.copy(sub_140);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_AllMetaArgumentsOpt, term_43);
	}

	final public static boolean _M_AllMetaInPatternRule(Sink sink, int shared, int depth, Term term_70)
	{
		if (depth < 2000)
		{
			label_45 :
			{
				if (!term_70.symbol().equals("Crsx_ruleDeclaration"))
				{
					break label_45;
				}
				Term sub_227 = term_70.sub(0).ref();
				/* #option?=sub */Term sub_33 = term_70.sub(1).ref();
				if (!sub_33.symbol().equals("Crsx_pattern"))
				{
					break label_45;
				}
				Term sub_25 = sub_33.sub(0).ref();
				/* #properties?=sub */Term sub_109 = sub_33.sub(1).ref();
				/* #constructor=sub */Term sub_85 = sub_33.sub(2).ref();
				/* #arguments?=sub */Term sub_171 = term_70.sub(2).ref();
				Term sub_97 = term_70.sub(3).ref();
				/* #contractum=sub *//*Contract*/
				sink.start(_M_AllMetaArgumentsOpt);
				sink.copy(sub_85);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_AllMetaInPatternRule, term_70);
	}

	final public static boolean _M_IsPrimitive(Sink sink, int shared, int depth, Term term_35)
	{
		if (depth < 2000)
		{
			label_40 :
			{
				if (!term_35.symbol().equals("Crsx_constructor_A1"))
				{
					break label_40;
				}
				Term sub_266 = term_35.sub(0).ref();
				if (!sub_266.symbol().equals("Crsx_qualifier_A2"))
				{
					break label_40;
				}
				Term sub_176 = term_35.sub(1).ref();
				/* #CONSTRUCTOR=sub *//*Contract*/
				sink.start(_M_StringEqual);
				sink.copy(sub_176);
				sink.literal("$");
				sink.end();
				return true;
			}
			label_90 :
			{
				if (!term_35.symbol().equals("Crsx_constructor_A2"))
				{
					break label_90;
				}
				Term sub_117 = term_35.sub(0).ref();
				if (!sub_117.symbol().equals("Crsx_reserved_A1"))
				{
					break label_90;
				}
				Term sub_302 = sub_117.sub(0).ref();/*Contract*/
				sink.start(_M_FALSE);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_IsPrimitive, term_35);
	}

	final public static boolean _M_IsDirectiveUnwrap(Sink sink, int shared, int depth, Term term_25)
	{
		if (depth < 2000)
		{
			label_77 :
			{
				if (!term_25.symbol().equals("Crsx_constructor_A1"))
				{
					break label_77;
				}
				Term sub_44 = term_25.sub(0).ref();
				if (!sub_44.symbol().equals("Crsx_qualifier_A2"))
				{
					break label_77;
				}
				Term sub_128 = term_25.sub(1).ref();
				/* #CONSTRUCTOR=sub *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sStartsWith);
				sink.end();
				sink.copy(sub_128);
				sink.literal("$");
				sink.end();
				return true;
			}
			label_97 :
			{
				if (!term_25.symbol().equals("Crsx_constructor_A2"))
				{
					break label_97;
				}
				Term sub_257 = term_25.sub(0).ref();
				if (!sub_257.symbol().equals("Crsx_reserved_A1"))
				{
					break label_97;
				}
				Term sub_136 = sub_257.sub(0).ref();/*Contract*/
				sink.start(_M__sFalse);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_IsDirectiveUnwrap, term_25);
	}

	final public static boolean _M_IsDirective(Sink sink, int shared, int depth, Term term_108)
	{
		if (depth < 2000)
		{
			label_126 :
			{
				if (!term_108.symbol().equals("Crsx_constructor_A1"))
				{
					break label_126;
				}
				Term sub_200 = term_108.sub(0).ref();
				if (!sub_200.symbol().equals("Crsx_qualifier_A2"))
				{
					break label_126;
				}
				Term sub_267 = term_108.sub(1).ref();
				/* #CONSTRUCTOR=sub *//*Contract*/
				sink.start(_M_StartsWith);
				sink.copy(sub_267);
				sink.literal("$");
				sink.end();
				return true;
			}
			label_17 :
			{
				if (!term_108.symbol().equals("Crsx_constructor_A2"))
				{
					break label_17;
				}
				Term sub_259 = term_108.sub(0).ref();
				if (!sub_259.symbol().equals("Crsx_reserved_A1"))
				{
					break label_17;
				}
				Term sub_22 = sub_259.sub(0).ref();/*Contract*/
				sink.start(_M_FALSE);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_IsDirective, term_108);
	}

	final public static boolean _M_ArityTerms_xS1_xZOM(Sink sink, int shared, int depth, Term term_79)
	{
		if (depth < 2000)
		{
			label_9 :
			{
				if (!term_79.symbol().equals("$Nil"))
				{
					break label_9;
				}/*Contract*/
				sink.literal(0);
				return true;
			}
			label_69 :
			{
				if (!term_79.symbol().equals("$Cons"))
				{
					break label_69;
				}
				Term sub_217 = term_79.sub(0).ref();
				if (!sub_217.symbol().equals("Crsx_terms_S1"))
				{
					break label_69;
				}
				Term sub_282 = sub_217.sub(0).ref();
				Term sub_272 = sub_217.sub(1).ref();
				/* #term=sub */Term sub_205 = term_79.sub(1).ref();
				/* #terms_S1*=sub *//*Contract*/
				sink.start(_M_NumberPlus);
				sink.literal(1);
				sink.start(_M_ArityTerms_xS1_xZOM);
				sink.copy(sub_205);
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_ArityTerms_xS1_xZOM, term_79);
	}

	final public static boolean _M_ArityTerms(Sink sink, int shared, int depth, Term term_52)
	{
		if (depth < 2000)
		{
			label_164 :
			{
				if (!term_52.symbol().equals("Crsx_terms"))
				{
					break label_164;
				}
				Term sub_9 = term_52.sub(0).ref();
				/* #term=sub */Term sub_73 = term_52.sub(1).ref();
				/* #terms_S1*=sub *//*Contract*/
				sink.start(_M_NumberPlus);
				sink.literal(1);
				sink.start(_M_ArityTerms_xS1_xZOM);
				sink.copy(sub_73);
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_ArityTerms, term_52);
	}

	final public static boolean _M_ArityArguments(Sink sink, int shared, int depth, Term term_39)
	{
		if (depth < 2000)
		{
			label_57 :
			{
				if (!term_39.symbol().equals("Crsx_arguments"))
				{
					break label_57;
				}
				Term sub_261 = term_39.sub(0).ref();
				Term sub_331 = term_39.sub(1).ref();
				if (!sub_331.symbol().equals("$Nil"))
				{
					break label_57;
				}
				Term sub_355 = term_39.sub(2).ref();/*Contract*/
				sink.literal(0);
				return true;
			}
			label_41 :
			{
				if (!term_39.symbol().equals("Crsx_arguments"))
				{
					break label_41;
				}
				Term sub_286 = term_39.sub(0).ref();
				Term sub_245 = term_39.sub(1).ref();
				if (!sub_245.symbol().equals("$Cons"))
				{
					break label_41;
				}
				Term sub_167 = sub_245.sub(0).ref();
				/* #terms=sub */Term sub_303 = sub_245.sub(1).ref();
				if (!sub_303.symbol().equals("$Nil"))
				{
					break label_41;
				}
				Term sub_241 = term_39.sub(2).ref();/*Contract*/
				sink.start(_M_ArityTerms);
				sink.copy(sub_167);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_ArityArguments, term_39);
	}

	final public static boolean _M_ArityArgumentsOpt(Sink sink, int shared, int depth, Term term_57)
	{
		if (depth < 2000)
		{
			label_61 :
			{
				if (!term_57.symbol().equals("$Nil"))
				{
					break label_61;
				}/*Contract*/
				sink.literal(0);
				return true;
			}
			label_108 :
			{
				if (!term_57.symbol().equals("$Cons"))
				{
					break label_108;
				}
				Term sub_99 = term_57.sub(0).ref();
				/* #arguments=sub */Term sub_135 = term_57.sub(1).ref();
				if (!sub_135.symbol().equals("$Nil"))
				{
					break label_108;
				}/*Contract*/
				sink.start(_M_ArityArguments);
				sink.copy(sub_99);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_ArityArgumentsOpt, term_57);
	}

	public static void init(Context context)
	{
		context.register(_M_ANNOTATIONS);
		context.register(_M_DesugarPropertyList);
		context.register(_M_DesugarDispatchCases);
		context.register(_M_DesugarListTermList);
		context.register(_M_DesugarList);
		context.register(_M_DesugarFreeTermList);
		context.register(_M_DesugarTermList);
		context.register(_M_DesugarFreeTerms);
		context.register(_M_DesugarTerms);
		context.register(_M_DesugarDeclarations);
		context.register(_M_SugarPropertyList);
		context.register(_M_SugarDispatchCases);
		context.register(_M_SugarFreeTerms);
		context.register(_M_SugarTerms);
		context.register(_M_SugarTermsOpt);
		context.register(_M_IndexAnnotation);
		context.register(_M_Then);
		context.register(_M_IndexAnnotations);
		context.register(_M_AllMetaTerms_xS1_xZOM);
		context.register(_M_AllMetaTerms);
		context.register(_M_AllMetaArgumentsOpt);
		context.register(_M_AllMetaInPatternRule);
		context.register(_M_IsPrimitive);
		context.register(_M_IsDirectiveUnwrap);
		context.register(_M_IsDirective);
		context.register(_M_ArityTerms_xS1_xZOM);
		context.register(_M_ArityTerms);
		context.register(_M_ArityArguments);
		context.register(_M_ArityArgumentsOpt);
	}

	/* END MODULE « "crsxutils.crs.java" » */
}