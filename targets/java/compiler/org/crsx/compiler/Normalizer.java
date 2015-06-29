/* START MODULE normalizer.crs.java */
/** Generated File */

package org.crsx.compiler;

import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;
import static org.crsx.runtime.Normalizer.force;
import static org.crsx.runtime.Reference.safeRef;

import org.crsx.runtime.*;
import org.crsx.runtime.ConstructionDescriptor.*;
import static org.crsx.runtime.Primitives.*;
import static org.crsx.compiler.parser.Crsx.*;
import static org.crsx.compiler.State.*;
import static org.crsx.compiler.Crsxutils.*;
import static org.crsx.compiler.std.Core.*;
import static org.crsx.compiler.std.String.*;
import static org.crsx.compiler.std.List.*;
import static org.crsx.compiler.std.Num.*;
import static org.crsx.compiler.std.Path.*;

public class Normalizer
{
	final public static DynamicFunctionDescriptor _M_NormalizeDispatchCases = makeFunction(
			"NormalizeDispatchCases", Normalizer.class, "_M_NormalizeDispatchCases");
	final public static DynamicFunctionDescriptor _M_NormalizeDispatch = makeFunction(
			"NormalizeDispatch", Normalizer.class, "_M_NormalizeDispatch");
	final public static DynamicFunctionDescriptor _M_NormalizeConcrete = makeFunction(
			"NormalizeConcrete", Normalizer.class, "_M_NormalizeConcrete");
	final public static DynamicFunctionDescriptor _M_NormalizeFreeTerms = makeFunction(
			"NormalizeFreeTerms", Normalizer.class, "_M_NormalizeFreeTerms");
	final public static DynamicFunctionDescriptor _M_NormalizeFreeArgumentsOpt = makeFunction(
			"NormalizeFreeArgumentsOpt", Normalizer.class, "_M_NormalizeFreeArgumentsOpt");
	final public static DynamicFunctionDescriptor _M_MakeBuiltin = makeFunction("MakeBuiltin", Normalizer.class, "_M_MakeBuiltin");
	final public static DynamicFunctionDescriptor _M_NormalizeConstructor = makeFunction(
			"NormalizeConstructor", Normalizer.class, "_M_NormalizeConstructor");
	final public static DynamicFunctionDescriptor _M_NormalizeFreeTerm = makeFunction(
			"NormalizeFreeTerm", Normalizer.class, "_M_NormalizeFreeTerm");
	final public static DynamicFunctionDescriptor _M_NormalizeNextBinder = makeFunction(
			"NormalizeNextBinder", Normalizer.class, "_M_NormalizeNextBinder");
	final public static DynamicFunctionDescriptor _M_NormalizeTerm = makeFunction(
			"NormalizeTerm", Normalizer.class, "_M_NormalizeTerm");
	final public static DynamicFunctionDescriptor _M_NormalizeTerms = makeFunction(
			"NormalizeTerms", Normalizer.class, "_M_NormalizeTerms");
	final public static DynamicFunctionDescriptor _M_NormalizeArgumentsOpt = makeFunction(
			"NormalizeArgumentsOpt", Normalizer.class, "_M_NormalizeArgumentsOpt");
	final public static DynamicFunctionDescriptor _M_NormalizeProperties = makeFunction(
			"NormalizeProperties", Normalizer.class, "_M_NormalizeProperties");
	final public static DynamicFunctionDescriptor _M_NormalizePropertiesOpt = makeFunction(
			"NormalizePropertiesOpt", Normalizer.class, "_M_NormalizePropertiesOpt");
	final public static DynamicFunctionDescriptor _M_NormalizeRule = makeFunction(
			"NormalizeRule", Normalizer.class, "_M_NormalizeRule");
	final public static DynamicFunctionDescriptor _M_NormalizeRules = makeFunction(
			"NormalizeRules", Normalizer.class, "_M_NormalizeRules");
	final public static DynamicFunctionDescriptor _M_NormalizeRuleKey1 = makeFunction(
			"NormalizeRuleKey1", Normalizer.class, "_M_NormalizeRuleKey1");
	final public static DynamicFunctionDescriptor _M_NormalizeRuleKey = makeFunction(
			"NormalizeRuleKey", Normalizer.class, "_M_NormalizeRuleKey");
	final public static DynamicFunctionDescriptor _M_DispatchCases = makeFunction(
			"DispatchCases", Normalizer.class, "_M_DispatchCases");
	final public static DynamicFunctionDescriptor _M_DispatchMetaArgsOpt = makeFunction(
			"DispatchMetaArgsOpt", Normalizer.class, "_M_DispatchMetaArgsOpt");
	final public static DynamicFunctionDescriptor _M_DispatchPatternNextBinder = makeFunction(
			"DispatchPatternNextBinder", Normalizer.class, "_M_DispatchPatternNextBinder");
	final public static DynamicFunctionDescriptor _M_DispatchPatternBinder = makeFunction(
			"DispatchPatternBinder", Normalizer.class, "_M_DispatchPatternBinder");
	final public static DynamicFunctionDescriptor _M_DispatchPatternFreeTerm = makeFunction(
			"DispatchPatternFreeTerm", Normalizer.class, "_M_DispatchPatternFreeTerm");
	final public static DynamicFunctionDescriptor _M_DispatchPatternTerm = makeFunction(
			"DispatchPatternTerm", Normalizer.class, "_M_DispatchPatternTerm");
	final public static DynamicFunctionDescriptor _M_DispatchPatternArgs = makeFunction(
			"DispatchPatternArgs", Normalizer.class, "_M_DispatchPatternArgs");
	final public static DynamicFunctionDescriptor _M_DispatchProperties = makeFunction(
			"DispatchProperties", Normalizer.class, "_M_DispatchProperties");
	final public static DynamicFunctionDescriptor _M_Dispatch = makeFunction("Dispatch", Normalizer.class, "_M_Dispatch");
	final public static DynamicFunctionDescriptor _M_GroupRule = makeFunction("GroupRule", Normalizer.class, "_M_GroupRule");
	final public static DynamicFunctionDescriptor _M_MayGroupRule2 = makeFunction(
			"MayGroupRule2", Normalizer.class, "_M_MayGroupRule2");
	final public static DynamicFunctionDescriptor _M_MayGroupRule1 = makeFunction(
			"MayGroupRule1", Normalizer.class, "_M_MayGroupRule1");
	final public static DynamicFunctionDescriptor _M_MayGroupRule = makeFunction(
			"MayGroupRule", Normalizer.class, "_M_MayGroupRule");
	final public static DynamicFunctionDescriptor _M_N2Rule = makeFunction("N2Rule", Normalizer.class, "_M_N2Rule");
	final public static DynamicFunctionDescriptor _M_N2Rules = makeFunction("N2Rules", Normalizer.class, "_M_N2Rules");
	final public static DynamicFunctionDescriptor _M_N2 = makeFunction("N2", Normalizer.class, "_M_N2");
	final public static DynamicFunctionDescriptor _M_N1ImportDirective = makeFunction(
			"N1ImportDirective", Normalizer.class, "_M_N1ImportDirective");
	final public static DynamicFunctionDescriptor _M_N1ImportDirectives = makeFunction(
			"N1ImportDirectives", Normalizer.class, "_M_N1ImportDirectives");
	final public static DynamicFunctionDescriptor _M_N1Import = makeFunction("N1Import", Normalizer.class, "_M_N1Import");
	final public static DynamicFunctionDescriptor _M_N1DirectiveConstructor = makeFunction(
			"N1DirectiveConstructor", Normalizer.class, "_M_N1DirectiveConstructor");
	final public static DynamicFunctionDescriptor _M_N1Directive = makeFunction("N1Directive", Normalizer.class, "_M_N1Directive");
	final public static DynamicFunctionDescriptor _M_N1Declaration = makeFunction(
			"N1Declaration", Normalizer.class, "_M_N1Declaration");
	final public static DynamicFunctionDescriptor _M_N1Declarations1 = makeFunction(
			"N1Declarations1", Normalizer.class, "_M_N1Declarations1");
	final public static DynamicFunctionDescriptor _M_N1Declarations = makeFunction(
			"N1Declarations", Normalizer.class, "_M_N1Declarations");
	final public static DynamicFunctionDescriptor _M_NormalizeToState = makeFunction(
			"NormalizeToState", Normalizer.class, "_M_NormalizeToState");
	final public static DynamicFunctionDescriptor _M_NormalizeToCrsx = makeFunction(
			"NormalizeToCrsx", Normalizer.class, "_M_NormalizeToCrsx");

	final public static boolean _M_NormalizeDispatchCases(Sink sink, int shared, int depth, Properties props, Term term)
	{
		if (depth < 2000)
		{
			label :
			{
				if (term.descriptor() != _M__sNil)
				{
					break label;
				}/*Contract*/
				sink.start(_M__sNil);
				sink.end();
				return true;
			}
			label_78 :
			{
				if (term.descriptor() != _M__sCons)
				{
					break label_78;
				}
				Term sub = term.sub(0).ref();
				if (sub.descriptor() != _M_Crsx_xdispatchCases_xS1)
				{
					break label_78;
				}
				Term sub_61 = sub.sub(0).ref();
				Term sub_48 = sub.sub(1).ref();
				if (sub_48.descriptor() != _M_Crsx_xdispatchCase)
				{
					break label_78;
				}
				Term sub_12 = sub_48.sub(0).ref();
				/* #ruleDeclaration=sub */Term sub_81 = term.sub(1).ref();
				/* #dispatchCases_S1*=sub *//*Contract*/
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xdispatchCases_xS1);
				sink.literal(";");
				sink.start(_M_Crsx_xdispatchCase);
				sink.properties(safeRef(props));
				sink.start(_M_NormalizeRule);
				sink.copy(sub_12.ref());
				sink.end();
				sink.end();
				sink.end();
				sink.start(_M_NormalizeDispatchCases);
				sink.copy(sub_81.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_NormalizeDispatchCases, props, term);
	}

	final public static boolean _M_NormalizeDispatch(Sink sink, int shared, int depth, Properties props_94, Term term_83)
	{
		if (depth < 2000)
		{
			label_82 :
			{
				if (term_83.descriptor() != _M_Crsx_xdispatch)
				{
					break label_82;
				}
				Term sub_4 = term_83.sub(0).ref();
				Term sub_11 = term_83.sub(1).ref();
				if (sub_11.descriptor() != _M_Crsx_xdispatchTerm)
				{
					break label_82;
				}
				Term sub_56 = sub_11.sub(0).ref();
				/* #freeTerm=sub */Term sub_97 = term_83.sub(2).ref();
				/* #dispatchCases=sub */Term sub_72 = term_83.sub(3).ref();
				/* #delayCase?=sub *//*Contract*/
				sink.start(_M_Crsx_xdispatch);
				sink.literal("dispatch");
				sink.start(_M_Crsx_xdispatchTerm);
				sink.properties(safeRef(props_94));
				sink.start(_M_NormalizeFreeTerm);
				sink.copy(sub_56.ref());
				sink.end();
				sink.end();
				sink.start(_M_SugarDispatchCases);
				sink.properties(safeRef(props_94));
				sink.start(_M_NormalizeDispatchCases);
				sink.start(_M_DesugarDispatchCases);
				sink.copy(sub_97.ref());
				sink.end();
				sink.end();
				sink.end();
				sink.copy(sub_72.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_NormalizeDispatch, props_94, term_83);
	}

	final public static boolean _M_NormalizeConcrete(Sink sink, int shared, int depth, Properties props_76, Term term_42)
	{
		if (depth < 2000)
		{
			label_24 :
			{
				if (term_42.descriptor() != _M_Crsx_xconcrete_xA1)
				{
					break label_24;
				}
				Term sub_84 = term_42.sub(0).ref();
				/* #CATEGORY=sub */Term sub_64 = term_42.sub(1).ref();
				/* #CONCRETE=sub *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sTrace);
				sink.end();
				sink.start(_M__s);
				sink.start(_M_Builtin_sColon);
				sink.end();
				sink.literal("Parse concrete1 ");
				sink.copy(sub_64.ref());
				sink.end();
				sink.properties(safeRef(props_76));
				sink.start(_M_NormalizeFreeTerm);
				sink.start(_M_ParseToTerm);
				sink.literal("freeTerm");
				sink.start(_M_ParseToString);
				sink.start(_M_RemoveFirstChar);
				sink.copy(sub_84.ref());
				sink.end();
				sink.start(_M_RemoveFirstChar);
				sink.start(_M_RemoveLastChar);
				sink.copy(sub_64.ref());
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_NormalizeConcrete, props_76, term_42);
	}

	final public static boolean _M_NormalizeFreeTerms(Sink sink, int shared, int depth, Properties props_56, Term term_86)
	{
		if (depth < 2000)
		{
			label_94 :
			{
				if (term_86.descriptor() != _M__sNil)
				{
					break label_94;
				}/*Contract*/
				sink.start(_M__sNil);
				sink.end();
				return true;
			}
			label_60 :
			{
				if (term_86.descriptor() != _M__sCons)
				{
					break label_60;
				}
				Term sub_82 = term_86.sub(0).ref();
				if (sub_82.descriptor() != _M_Crsx_xfreeTerms_xS1)
				{
					break label_60;
				}
				Term sub_19 = sub_82.sub(0).ref();
				Term sub_1 = sub_82.sub(1).ref();
				/* #freeTerm=sub */Term sub_94 = term_86.sub(1).ref();
				/* #freeTerms_S1*=sub *//*Contract*/
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xfreeTerms_xS1);
				sink.literal(",");
				sink.properties(safeRef(props_56));
				sink.start(_M_NormalizeFreeTerm);
				sink.copy(sub_1.ref());
				sink.end();
				sink.end();
				sink.start(_M_NormalizeFreeTerms);
				sink.copy(sub_94.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_NormalizeFreeTerms, props_56, term_86);
	}

	final public static boolean _M_NormalizeFreeArgumentsOpt(Sink sink, int shared, int depth, Properties props_46, Term term_13)
	{
		if (depth < 2000)
		{
			label_71 :
			{
				if (term_13.descriptor() != _M__sNil)
				{
					break label_71;
				}/*Contract*/
				sink.start(_M__sNil);
				sink.end();
				return true;
			}
			label_83 :
			{
				if (term_13.descriptor() != _M__sCons)
				{
					break label_83;
				}
				Term sub_43 = term_13.sub(0).ref();
				if (sub_43.descriptor() != _M_Crsx_xfreeArguments)
				{
					break label_83;
				}
				Term sub_50 = sub_43.sub(0).ref();
				Term sub_59 = sub_43.sub(1).ref();
				if (sub_59.descriptor() != _M__sNil)
				{
					break label_83;
				}
				Term sub_113 = sub_43.sub(2).ref();
				Term sub_7 = term_13.sub(1).ref();
				if (sub_7.descriptor() != _M__sNil)
				{
					break label_83;
				}/*Contract*/
				sink.start(_M__sNil);
				sink.end();
				return true;
			}
			label_98 :
			{
				if (term_13.descriptor() != _M__sCons)
				{
					break label_98;
				}
				Term sub_68 = term_13.sub(0).ref();
				if (sub_68.descriptor() != _M_Crsx_xfreeArguments)
				{
					break label_98;
				}
				Term sub_54 = sub_68.sub(0).ref();
				Term sub_3 = sub_68.sub(1).ref();
				if (sub_3.descriptor() != _M__sCons)
				{
					break label_98;
				}
				Term sub_18 = sub_3.sub(0).ref();
				/* #freeTerms=sub */Term sub_189 = sub_3.sub(1).ref();
				if (sub_189.descriptor() != _M__sNil)
				{
					break label_98;
				}
				Term sub_22 = sub_68.sub(2).ref();
				Term sub_57 = term_13.sub(1).ref();
				if (sub_57.descriptor() != _M__sNil)
				{
					break label_98;
				}/*Contract*/
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xfreeArguments);
				sink.literal("[");
				sink.start(_M__sCons);
				sink.start(_M_SugarFreeTerms);
				sink.start(_M_NormalizeFreeTerms);
				sink.start(_M_DesugarFreeTerms);
				sink.copy(sub_18.ref());
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
				return true;
			}
		}
		return thunk(sink, _M_NormalizeFreeArgumentsOpt, props_46, term_13);
	}

	final public static boolean _M_MakeBuiltin(Sink sink, int shared, int depth, Term term_96)
	{
		if (depth < 2000)
		{
			label_13 :
			{
				if (term_96.descriptor() != _M_Crsx_xconstructor_xA1)
				{
					break label_13;
				}
				Term sub_49 = term_96.sub(0).ref();
				if (sub_49.descriptor() != _M_Crsx_xqualifier_xA2)
				{
					break label_13;
				}
				Term sub_52 = term_96.sub(1).ref();
				/* #CONSTRUCTOR=sub *//*Contract*/
				sink.start(_M_Crsx_xconstructor_xA1);
				sink.start(_M_Crsx_xqualifier_xA2);
				sink.end();
				sink.start(_M__s);
				sink.start(_M_Builtin_sColon);
				sink.end();
				sink.literal("Builtin$");
				sink.copy(sub_52.ref());
				sink.end();
				sink.end();
				return true;
			}
			label_36 :
			{
				if (term_96.descriptor() != _M_Crsx_xconstructor_xA2)
				{
					break label_36;
				}
				Term sub_101 = term_96.sub(0).ref();
				if (sub_101.descriptor() != _M_Crsx_xreserved_xA1)
				{
					break label_36;
				}
				Term sub_37 = sub_101.sub(0).ref();/*Contract*/
				sink.start(_M_Crsx_xconstructor_xA1);
				sink.start(_M_Crsx_xqualifier_xA2);
				sink.end();
				sink.literal("Builtin$Colon");
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_MakeBuiltin, term_96);
	}

	final public static boolean _M_NormalizeConstructor(Sink sink, int shared, int depth, Properties props_28, Term term_123, Term term_55, Term term_75, Term term_37, Term term_2)
	{
		if (depth < 2000)
		{
			label_84 :
			{
				if (term_123.descriptor() != _M_TRUE)
				{
					break label_84;
				}
				/* #annotations?=term */
				/* #properties?2=term */
				/* #constructor=term */
				if (term_2.descriptor() != _M__sCons)
				{
					break label_84;
				}
				Term sub_51 = term_2.sub(0).ref();
				if (sub_51.descriptor() != _M_Crsx_xarguments)
				{
					break label_84;
				}
				Term sub_76 = sub_51.sub(0).ref();
				Term sub_83 = sub_51.sub(1).ref();
				if (sub_83.descriptor() != _M__sCons)
				{
					break label_84;
				}
				Term sub_74 = sub_83.sub(0).ref();
				if (sub_74.descriptor() != _M_Crsx_xterms)
				{
					break label_84;
				}
				Term sub_41 = sub_74.sub(0).ref();
				if (sub_41.descriptor() != _M_Crsx_xterm_xA1)
				{
					break label_84;
				}
				Term sub_159 = sub_41.sub(0).ref();
				if (sub_159.descriptor() != _M_Crsx_xfreeTerm_xA1)
				{
					break label_84;
				}
				Term sub_0 = sub_159.sub(0).ref();
				if (sub_0.descriptor() != _M__sNil)
				{
					break label_84;
				}
				Term sub_205 = sub_159.sub(1).ref();
				/* #properties?=sub */Term sub_42 = sub_159.sub(2).ref();
				/* #constructor2=sub */Term sub_91 = sub_159.sub(3).ref();
				if (sub_91.descriptor() != _M__sNil)
				{
					break label_84;
				}
				Term sub_98 = sub_74.sub(1).ref();
				/* #terms_S1*=sub */Term sub_112 = sub_83.sub(1).ref();
				if (sub_112.descriptor() != _M__sNil)
				{
					break label_84;
				}
				Term sub_55 = sub_51.sub(2).ref();
				Term sub_89 = term_2.sub(1).ref();
				if (sub_89.descriptor() != _M__sNil)
				{
					break label_84;
				}/*Contract*/
				sink.properties(safeRef(props_28));
				sink.start(_M_NormalizeConstructor);
				sink.start(_M_FALSE);
				sink.end();
				sink.copy(term_55.ref());
				sink.copy(term_75.ref());
				sink.copy(term_37.ref());
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xarguments);
				sink.literal("[");
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xterms);
				sink.start(_M_Crsx_xterm_xA1);
				sink.start(_M_Crsx_xfreeTerm_xA1);
				sink.start(_M__sNil);
				sink.end();
				sink.copy(sub_205.ref());
				sink.start(_M_MakeBuiltin);
				sink.copy(sub_42.ref());
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				sink.copy(sub_98.ref());
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
			label_125 :
			{
				if (term_123.descriptor() != _M_FALSE)
				{
					break label_125;
				}
				/* #annotations?=term */
				/* #properties?=term */
				/* #constructor=term */
				/* #arguments?=term *//*Contract*/
				sink.start(_M_Crsx_xfreeTerm_xA1);
				sink.copy(term_55.ref());
				sink.properties(safeRef(props_28));
				sink.start(_M_NormalizePropertiesOpt);
				sink.copy(term_75.ref());
				sink.end();
				sink.copy(term_37.ref());
				sink.properties(safeRef(props_28));
				sink.start(_M_NormalizeArgumentsOpt);
				sink.copy(term_2.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_NormalizeConstructor, props_28, term_123, term_55, term_75, term_37, term_2);
	}

	final public static boolean _M_NormalizeFreeTerm(Sink sink, int shared, int depth, Properties props_84, Term term_88)
	{
		if (depth < 2000)
		{
			label_189 :
			{
				if (term_88.descriptor() != _M_Crsx_xfreeTerm_xA1)
				{
					break label_189;
				}
				Term sub_121 = term_88.sub(0).ref();
				/* #annotations?=sub */Term sub_30 = term_88.sub(1).ref();
				/* #properties?=sub */Term sub_96 = term_88.sub(2).ref();
				/* #constructor=sub */Term sub_258 = term_88.sub(3).ref();
				/* #arguments?=sub *//*Contract*/sink.properties(safeRef(props_84));
				sink.start(_M_NormalizeConstructor);
				sink.start(_M_IsPrimitive);
				sink.copy(sub_96.ref());
				sink.end();
				sink.copy(sub_121.ref());
				sink.copy(sub_30.ref());
				sink.copy(sub_96.ref());
				sink.copy(sub_258.ref());
				sink.end();
				return true;
			}
			label_35 :
			{
				if (term_88.descriptor() != _M_Crsx_xfreeTerm_xA2)
				{
					break label_35;
				}
				Term sub_73 = term_88.sub(0).ref();
				/* #annotations?=sub */Term sub_106 = term_88.sub(1).ref();
				/* #properties?=sub */Term sub_88 = term_88.sub(2).ref();
				/* #constructor=sub */Term sub_147 = term_88.sub(3).ref();
				/* #term=sub *//*Contract*/sink.properties(safeRef(props_84));
				sink.start(_M_NormalizeFreeTerm);
				sink.start(_M_Crsx_xfreeTerm_xA1);
				sink.copy(sub_73.ref());
				sink.copy(sub_106.ref());
				sink.copy(sub_88.ref());
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xarguments);
				sink.literal("[");
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xterms);
				sink.copy(sub_147.ref());
				sink.start(_M__sNil);
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
				sink.end();
				return true;
			}
			label_76 :
			{
				if (term_88.descriptor() != _M_Crsx_xfreeTerm_xA3)
				{
					break label_76;
				}
				Term sub_117 = term_88.sub(0).ref();
				/* #annotations?=sub */Term sub_26 = term_88.sub(1).ref();
				/* #properties?=sub */Term sub_93 = term_88.sub(2).ref();
				/* #literal=sub *//*Contract*/
				sink.start(_M_Crsx_xfreeTerm_xA3);
				sink.copy(sub_117.ref());
				sink.properties(safeRef(props_84));
				sink.start(_M_NormalizePropertiesOpt);
				sink.copy(sub_26.ref());
				sink.end();
				sink.copy(sub_93.ref());
				sink.end();
				return true;
			}
			label_43 :
			{
				if (term_88.descriptor() != _M_Crsx_xfreeTerm_xA4)
				{
					break label_43;
				}
				Term sub_221 = term_88.sub(0).ref();
				/* #annotations?=sub */Term sub_35 = term_88.sub(1).ref();
				/* #list=sub *//*Contract*/sink.properties(safeRef(props_84));
				sink.start(_M_NormalizeFreeTerm);
				sink.start(_M_DesugarList);
				sink.copy(sub_35.ref());
				sink.end();
				sink.end();
				return true;
			}
			label_74 :
			{
				if (term_88.descriptor() != _M_Crsx_xfreeTerm_xA5)
				{
					break label_74;
				}
				Term sub_24 = term_88.sub(0).ref();
				/* #annotations?=sub */Term sub_31 = term_88.sub(1).ref();
				/* #variable=sub *//*Contract*/
				sink.start(_M_Crsx_xfreeTerm_xA5);
				sink.copy(sub_24.ref());
				sink.copy(sub_31.ref());
				sink.end();
				return true;
			}
			label_151 :
			{
				if (term_88.descriptor() != _M_Crsx_xfreeTerm_xA6)
				{
					break label_151;
				}
				Term sub_44 = term_88.sub(0).ref();
				/* #annotations?=sub */Term sub_29 = term_88.sub(1).ref();
				/* #properties=sub *//*Contract*/
				sink.start(_M_Crsx_xfreeTerm_xA6);
				sink.copy(sub_44.ref());
				sink.properties(safeRef(props_84));
				sink.start(_M_NormalizeProperties);
				sink.copy(sub_29.ref());
				sink.end();
				sink.end();
				return true;
			}
			label_75 :
			{
				if (term_88.descriptor() != _M_Crsx_xfreeTerm_xA7)
				{
					break label_75;
				}
				Term sub_58 = term_88.sub(0).ref();
				/* #annotations?=sub */Term sub_77 = term_88.sub(1).ref();
				/* #properties?=sub */Term sub_47 = term_88.sub(2).ref();
				/* #METAVAR=sub */Term sub_2 = term_88.sub(3).ref();
				/* #freeArguments?=sub *//*Contract*/
				sink.start(_M_Crsx_xfreeTerm_xA7);
				sink.copy(sub_58.ref());
				sink.properties(safeRef(props_84));
				sink.start(_M_NormalizePropertiesOpt);
				sink.copy(sub_77.ref());
				sink.end();
				sink.copy(sub_47.ref());
				sink.properties(safeRef(props_84));
				sink.start(_M_NormalizeFreeArgumentsOpt);
				sink.copy(sub_2.ref());
				sink.end();
				sink.end();
				return true;
			}
			label_173 :
			{
				if (term_88.descriptor() != _M_Crsx_xfreeTerm_xA8)
				{
					break label_173;
				}
				Term sub_33 = term_88.sub(0).ref();
				/* #annotations?=sub */Term sub_267 = term_88.sub(1).ref();
				/* #concrete=sub *//*Contract*/sink.properties(safeRef(props_84));
				sink.start(_M_NormalizeConcrete);
				sink.copy(sub_267.ref());
				sink.end();
				return true;
			}
			label_77 :
			{
				if (term_88.descriptor() != _M_Crsx_xfreeTerm_xA9)
				{
					break label_77;
				}
				Term sub_164 = term_88.sub(0).ref();
				/* #annotations?=sub */Term sub_129 = term_88.sub(1).ref();
				/* #properties?=sub */Term sub_16 = term_88.sub(2).ref();
				if (sub_16.descriptor() != _M_Crsx_xexpression)
				{
					break label_77;
				}
				Term sub_86 = sub_16.sub(0).ref();
				/* #dispatch=sub *//*Contract*/
				sink.start(_M_Crsx_xfreeTerm_xA9);
				sink.copy(sub_164.ref());
				sink.properties(safeRef(props_84));
				sink.start(_M_NormalizePropertiesOpt);
				sink.copy(sub_129.ref());
				sink.end();
				sink.start(_M_Crsx_xexpression);
				sink.properties(safeRef(props_84));
				sink.start(_M_NormalizeDispatch);
				sink.copy(sub_86.ref());
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_NormalizeFreeTerm, props_84, term_88);
	}

	final public static boolean _M_NormalizeNextBinder(Sink sink, int shared, int depth, Properties props_48, Term term_18)
	{
		if (depth < 2000)
		{
			label_45 :
			{
				if (term_18.descriptor() != _M_Crsx_xnextBinder_xA1)
				{
					break label_45;
				}
				Term sub_65 = term_18.sub(0).ref();
				/* #binder=sub */Term sub_13 = term_18.sub(1).ref();
				/* #nextBinder=sub *//*Contract*/
				sink.start(_M_Crsx_xnextBinder_xA1);
				sink.copy(sub_65.ref());
				sink.properties(safeRef(props_48));
				sink.start(_M_NormalizeNextBinder);
				sink.copy(sub_13.ref());
				sink.end();
				sink.end();
				return true;
			}
			label_46 :
			{
				if (term_18.descriptor() != _M_Crsx_xnextBinder_xA2)
				{
					break label_46;
				}
				Term sub_10 = term_18.sub(0).ref();
				Term sub_80 = term_18.sub(1).ref();
				/* #freeTerm=sub *//*Contract*/
				sink.start(_M_Crsx_xnextBinder_xA2);
				sink.literal(".");
				sink.properties(safeRef(props_48));
				sink.start(_M_NormalizeFreeTerm);
				sink.copy(sub_80.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_NormalizeNextBinder, props_48, term_18);
	}

	final public static boolean _M_NormalizeTerm(Sink sink, int shared, int depth, Properties props_77, Term term_90)
	{
		if (depth < 2000)
		{
			label_136 :
			{
				if (term_90.descriptor() != _M_Crsx_xterm_xA1)
				{
					break label_136;
				}
				Term sub_142 = term_90.sub(0).ref();
				/* #freeTerm=sub *//*Contract*/
				sink.start(_M_Crsx_xterm_xA1);
				sink.properties(safeRef(props_77));
				sink.start(_M_NormalizeFreeTerm);
				sink.copy(sub_142.ref());
				sink.end();
				sink.end();
				return true;
			}
			label_26 :
			{
				if (term_90.descriptor() != _M_Crsx_xterm_xA2)
				{
					break label_26;
				}
				Term sub_40 = term_90.sub(0).ref();
				if (sub_40.descriptor() != _M_Crsx_xboundTerm)
				{
					break label_26;
				}
				Term sub_69 = sub_40.sub(0).ref();
				/* #binder=sub */Term sub_53 = sub_40.sub(1).ref();
				/* #nextBinder=sub *//*Contract*/
				sink.start(_M_Crsx_xterm_xA2);
				sink.start(_M_Crsx_xboundTerm);
				sink.copy(sub_69.ref());
				sink.properties(safeRef(props_77));
				sink.start(_M_NormalizeNextBinder);
				sink.copy(sub_53.ref());
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_NormalizeTerm, props_77, term_90);
	}

	final public static boolean _M_NormalizeTerms(Sink sink, int shared, int depth, Properties props_54, Term term_53)
	{
		if (depth < 2000)
		{
			label_38 :
			{
				if (term_53.descriptor() != _M__sNil)
				{
					break label_38;
				}/*Contract*/
				sink.start(_M__sNil);
				sink.end();
				return true;
			}
			label_172 :
			{
				if (term_53.descriptor() != _M__sCons)
				{
					break label_172;
				}
				Term sub_99 = term_53.sub(0).ref();
				if (sub_99.descriptor() != _M_Crsx_xterms_xS1)
				{
					break label_172;
				}
				Term sub_75 = sub_99.sub(0).ref();
				Term sub_232 = sub_99.sub(1).ref();
				/* #term=sub */Term sub_5 = term_53.sub(1).ref();
				/* #terms_S1*=sub *//*Contract*/
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xterms_xS1);
				sink.literal(",");
				sink.properties(safeRef(props_54));
				sink.start(_M_NormalizeTerm);
				sink.copy(sub_232.ref());
				sink.end();
				sink.end();
				sink.start(_M_NormalizeTerms);
				sink.copy(sub_5.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_NormalizeTerms, props_54, term_53);
	}

	final public static boolean _M_NormalizeArgumentsOpt(Sink sink, int shared, int depth, Properties props_19, Term term_84)
	{
		if (depth < 2000)
		{
			label_1 :
			{
				if (term_84.descriptor() != _M__sNil)
				{
					break label_1;
				}/*Contract*/
				sink.start(_M__sNil);
				sink.end();
				return true;
			}
			label_160 :
			{
				if (term_84.descriptor() != _M__sCons)
				{
					break label_160;
				}
				Term sub_111 = term_84.sub(0).ref();
				if (sub_111.descriptor() != _M_Crsx_xarguments)
				{
					break label_160;
				}
				Term sub_63 = sub_111.sub(0).ref();
				Term sub_95 = sub_111.sub(1).ref();
				if (sub_95.descriptor() != _M__sNil)
				{
					break label_160;
				}
				Term sub_102 = sub_111.sub(2).ref();
				Term sub_9 = term_84.sub(1).ref();
				if (sub_9.descriptor() != _M__sNil)
				{
					break label_160;
				}/*Contract*/
				sink.start(_M__sNil);
				sink.end();
				return true;
			}
			label_34 :
			{
				if (term_84.descriptor() != _M__sCons)
				{
					break label_34;
				}
				Term sub_66 = term_84.sub(0).ref();
				if (sub_66.descriptor() != _M_Crsx_xarguments)
				{
					break label_34;
				}
				Term sub_46 = sub_66.sub(0).ref();
				Term sub_45 = sub_66.sub(1).ref();
				if (sub_45.descriptor() != _M__sCons)
				{
					break label_34;
				}
				Term sub_194 = sub_45.sub(0).ref();
				/* #terms=sub */Term sub_8 = sub_45.sub(1).ref();
				if (sub_8.descriptor() != _M__sNil)
				{
					break label_34;
				}
				Term sub_150 = sub_66.sub(2).ref();
				Term sub_36 = term_84.sub(1).ref();
				if (sub_36.descriptor() != _M__sNil)
				{
					break label_34;
				}/*Contract*/
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xarguments);
				sink.literal("[");
				sink.start(_M__sCons);
				sink.start(_M_SugarTerms);
				sink.start(_M_NormalizeTerms);
				sink.start(_M_DesugarTerms);
				sink.copy(sub_194.ref());
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
				return true;
			}
		}
		return thunk(sink, _M_NormalizeArgumentsOpt, props_19, term_84);
	}

	final public static boolean _M_NormalizeProperties(Sink sink, int shared, int depth, Properties props_70, Term term_24)
	{
		if (depth < 2000)
		{
			sink.copy(term_24.ref());
			return true;
		}
		return thunk(sink, _M_NormalizeProperties, props_70, term_24);
	}

	final public static boolean _M_NormalizePropertiesOpt(Sink sink, int shared, int depth, Properties props_62, Term term_52)
	{
		if (depth < 2000)
		{
			label_111 :
			{
				if (term_52.descriptor() != _M__sNil)
				{
					break label_111;
				}/*Contract*/
				sink.start(_M__sNil);
				sink.end();
				return true;
			}
			label_44 :
			{
				if (term_52.descriptor() != _M__sCons)
				{
					break label_44;
				}
				Term sub_134 = term_52.sub(0).ref();
				if (sub_134.descriptor() != _M_Crsx_xproperties)
				{
					break label_44;
				}
				Term sub_219 = sub_134.sub(0).ref();
				Term sub_193 = sub_134.sub(1).ref();
				if (sub_193.descriptor() != _M__sNil)
				{
					break label_44;
				}
				Term sub_185 = sub_134.sub(2).ref();
				Term sub_25 = term_52.sub(1).ref();
				if (sub_25.descriptor() != _M__sNil)
				{
					break label_44;
				}/*Contract*/
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xproperties);
				sink.literal("{");
				sink.start(_M__sNil);
				sink.end();
				sink.literal("}");
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				return true;
			}
			label_21 :
			{
				if (term_52.descriptor() != _M__sCons)
				{
					break label_21;
				}
				Term sub_127 = term_52.sub(0).ref();
				if (sub_127.descriptor() != _M_Crsx_xproperties)
				{
					break label_21;
				}
				Term sub_191 = sub_127.sub(0).ref();
				Term sub_6 = sub_127.sub(1).ref();
				if (sub_6.descriptor() != _M__sCons)
				{
					break label_21;
				}
				Term sub_23 = sub_6.sub(0).ref();
				/* #propertyList=sub */Term sub_34 = sub_6.sub(1).ref();
				if (sub_34.descriptor() != _M__sNil)
				{
					break label_21;
				}
				Term sub_174 = sub_127.sub(2).ref();
				Term sub_165 = term_52.sub(1).ref();
				if (sub_165.descriptor() != _M__sNil)
				{
					break label_21;
				}/*Contract*/
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xproperties);
				sink.literal("{");
				sink.start(_M__sCons);
				sink.start(_M_SugarPropertyList);
				sink.properties(safeRef(props_62));
				sink.start(_M_NormalizeProperties);
				sink.start(_M_DesugarPropertyList);
				sink.copy(sub_23.ref());
				sink.end();
				sink.end();
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.literal("}");
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_NormalizePropertiesOpt, props_62, term_52);
	}

	final public static boolean _M_NormalizeRule(Sink sink, int shared, int depth, Properties props_90, Term term_35)
	{
		if (depth < 2000)
		{
			label_187 :
			{
				if (term_35.descriptor() != _M_Crsx_xruleDeclaration)
				{
					break label_187;
				}
				Term sub_218 = term_35.sub(0).ref();
				/* #option?=sub */Term sub_478 = term_35.sub(1).ref();
				if (sub_478.descriptor() != _M_Crsx_xpattern)
				{
					break label_187;
				}
				Term sub_350 = sub_478.sub(0).ref();
				/* #properties?=sub */Term sub_465 = sub_478.sub(1).ref();
				/* #constructor=sub */Term sub_87 = sub_478.sub(2).ref();
				/* #arguments?=sub */Term sub_21 = term_35.sub(2).ref();
				Term sub_60 = term_35.sub(3).ref();
				if (sub_60.descriptor() != _M_Crsx_xcontractum)
				{
					break label_187;
				}
				Term sub_28 = sub_60.sub(0).ref();
				/* #freeTerm=sub *//*Contract*/
				sink.start(_M_Crsx_xruleDeclaration);
				sink.copy(sub_218.ref());
				sink.start(_M_Crsx_xpattern);
				sink.properties(safeRef(props_90));
				sink.start(_M_NormalizePropertiesOpt);
				sink.copy(sub_350.ref());
				sink.end();
				sink.copy(sub_465.ref());
				sink.properties(safeRef(props_90));
				sink.start(_M_NormalizeArgumentsOpt);
				sink.copy(sub_87.ref());
				sink.end();
				sink.end();
				sink.literal("\u2192");
				sink.start(_M_Crsx_xcontractum);
				sink.properties(safeRef(props_90));
				sink.start(_M_NormalizeFreeTerm);
				sink.copy(sub_28.ref());
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_NormalizeRule, props_90, term_35);
	}

	final public static boolean _M_NormalizeRules(Sink sink, int shared, int depth, Properties props_140, Term term_28)
	{
		if (depth < 2000)
		{
			label_39 :
			{
				if (term_28.descriptor() != _M__sCons)
				{
					break label_39;
				}
				Term sub_277 = term_28.sub(0).ref();
				/* #rule=sub */Term sub_130 = term_28.sub(1).ref();
				if (sub_130.descriptor() != _M__sNil)
				{
					break label_39;
				}/*Contract*/
				sink.start(_M__sCons);
				sink.properties(safeRef(props_140));
				sink.start(_M_NormalizeRule);
				sink.copy(sub_277.ref());
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_NormalizeRules, props_140, term_28);
	}

	final public static boolean _M_NormalizeRuleKey1(Sink sink, int shared, int depth, Properties props_7, Term term_150, Term term_78, Variable var, Term term_77)
	{
		if (depth < 2000)
		{
			label_27 :
			{
				if (term_150.descriptor() != _M_RULES)
				{
					break label_27;
				}
				Term sub_70 = term_150.sub(0).ref();
				/* #rules=sub */
				/* #key=term */
				/* #=term *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sTrace);
				sink.end();
				sink.start(_M__s);
				sink.start(_M_Builtin_sColon);
				sink.end();
				sink.literal("Normalize rules: ");
				sink.copy(term_78.ref());
				sink.end();
				sink.properties(safeRef(props_7));
				Term term_79;
				{
					BufferSink buf = sink.context().makeBuffer();
					buf.start(_M_RULES);
					buf.properties(safeRef(props_7));
					buf.start(_M_NormalizeRules);
					buf.copy(sub_70.ref());
					buf.end();
					buf.end();
					term_79 = buf.term();
				}
				term_78 = force(sink.context(), term_78);
				Sink.property(sink, term_78, term_79);
				Term term_8;
				{
					BufferSink buf_31 = sink.context().makeBuffer();
					buf_31.start(_M_OK);
					buf_31.end();
					term_8 = buf_31.term();
				}
				sink.substitute(term_77.ref(), new Variable[]
					{var}, new Term[]
					{term_8});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_NormalizeRuleKey1, props_7, term_150, term_78, var, term_77);
	}

	final public static boolean _M_NormalizeRuleKey(Sink sink, int shared, int depth, Properties props_52, Term term_54, Term term_165, Variable var_8, Term term_51)
	{
		if (depth < 2000)
		{
			label_59 :
			{
				if (term_54.descriptor() != _M_OK)
				{
					break label_59;
				}
				/* #key=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_52));
				sink.start(_M_NormalizeRuleKey1);
				sink.start(_M__s);
				sink.properties(safeRef(props_52));
				sink.start(_M_Builtin_sGet);
				sink.end();
				sink.copy(term_165.ref());
				sink.end();
				sink.copy(term_165.ref());
				Variable var_67 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_67});
				VariableUse use = sink.context().makeVariableUse(var_67);
				sink.substitute(term_51.ref(), new Variable[]
					{var_8}, new Term[]
					{use});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_NormalizeRuleKey, props_52, term_54, term_165, var_8, term_51);
	}

	final public static boolean _M_DispatchCases(Sink sink, int shared, int depth, Term term_25)
	{
		if (depth < 2000)
		{
			label_8 :
			{
				if (term_25.descriptor() != _M__sNil)
				{
					break label_8;
				}/*Contract*/
				sink.start(_M__sNil);
				sink.end();
				return true;
			}
			label_73 :
			{
				if (term_25.descriptor() != _M__sCons)
				{
					break label_73;
				}
				Term sub_160 = term_25.sub(0).ref();
				/* #rule=sub */Term sub_274 = term_25.sub(1).ref();
				/* #rules=sub *//*Contract*/
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xdispatchCases_xS1);
				sink.literal(";");
				sink.start(_M_Crsx_xdispatchCase);
				sink.copy(sub_160.ref());
				sink.end();
				sink.end();
				sink.start(_M_DispatchCases);
				sink.copy(sub_274.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_DispatchCases, term_25);
	}

	final public static boolean _M_DispatchMetaArgsOpt(Sink sink, int shared, int depth, Term term_40)
	{
		if (depth < 2000)
		{
			label_25 :
			{
				if (term_40.descriptor() != _M__sNil)
				{
					break label_25;
				}/*Contract*/
				sink.start(_M__sNil);
				sink.end();
				return true;
			}
			label_55 :
			{
				if (term_40.descriptor() != _M__sCons)
				{
					break label_55;
				}
				Term sub_15 = term_40.sub(0).ref();
				if (sub_15.descriptor() != _M_Crsx_xfreeTerms_xS1)
				{
					break label_55;
				}
				Term sub_161 = sub_15.sub(0).ref();
				Term sub_71 = sub_15.sub(1).ref();
				/* #freeTerm=sub */Term sub_163 = term_40.sub(1).ref();
				/* #freeTerms_S1*=sub *//*Contract*/
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xfreeArguments);
				sink.literal("[");
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xfreeTerms);
				sink.copy(sub_71.ref());
				sink.copy(sub_163.ref());
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.literal("]");
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_DispatchMetaArgsOpt, term_40);
	}

	final public static boolean _M_DispatchPatternNextBinder(Sink sink, int shared, int depth, Term term_30, Term term_19, Term term_59)
	{
		if (depth < 2000)
		{
			label_32 :
			{
				if (term_30.descriptor() != _M_Crsx_xnextBinder_xA2)
				{
					break label_32;
				}
				Term sub_62 = term_30.sub(0).ref();
				Term sub_240 = term_30.sub(1).ref();
				/* #freeTerm=sub */
				/* #count=term */
				/* #freeTerms_S1*=term *//*Contract*/
				sink.start(_M_Crsx_xnextBinder_xA2);
				sink.literal(".");
				sink.start(_M_DispatchPatternFreeTerm);
				sink.copy(sub_240.ref());
				sink.copy(term_19.ref());
				sink.copy(term_59.ref());
				sink.end();
				sink.end();
				return true;
			}
			label_87 :
			{
				if (term_30.descriptor() != _M_Crsx_xnextBinder_xA1)
				{
					break label_87;
				}
				Term sub_104 = term_30.sub(0).ref();
				if (sub_104.descriptor() != _M_Crsx_xbinder)
				{
					break label_87;
				}
				Term sub_208 = sub_104.sub(0).ref();
				/* #annotations?=sub */Term sub_417 = sub_104.sub(1).ref();
				if (sub_417.descriptor() != _M_Crsx_xvariable)
				{
					break label_87;
				}
				Term sub_234 = sub_417.sub(0).ref();
				if (sub_234.descriptor() != _M__sNil)
				{
					break label_87;
				}
				Term sub_115 = sub_417.sub(1).ref();
				/* #VARIABLE=sub */Term sub_14 = sub_417.sub(2).ref();
				/* #linear?=sub */Term sub_79 = sub_417.sub(3).ref();
				/* #functional?=sub */Term sub_213 = sub_417.sub(4).ref();
				/* #varsort?=sub */Term sub_27 = term_30.sub(1).ref();
				/* #nextBinder=sub */
				/* #count=term */
				/* #freeTerms_S1*=term *//*Contract*/
				sink.start(_M_Crsx_xnextBinder_xA1);
				sink.start(_M_Crsx_xbinder);
				sink.copy(sub_208.ref());
				sink.start(_M_Crsx_xvariable);
				sink.start(_M__sNil);
				sink.end();
				sink.copy(sub_115.ref());
				sink.copy(sub_14.ref());
				sink.copy(sub_79.ref());
				sink.copy(sub_213.ref());
				sink.end();
				sink.end();
				sink.start(_M_DispatchPatternNextBinder);
				sink.copy(sub_27.ref());
				sink.copy(term_19.ref());
				sink.start(_M_Concat);
				sink.copy(term_59.ref());
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xfreeTerms_xS1);
				sink.literal(",");
				sink.start(_M_Crsx_xfreeTerm_xA5);
				sink.copy(sub_208.ref());
				sink.start(_M_Crsx_xvariable);
				sink.start(_M__sNil);
				sink.end();
				sink.copy(sub_115.ref());
				sink.copy(sub_14.ref());
				sink.copy(sub_79.ref());
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_DispatchPatternNextBinder, term_30, term_19, term_59);
	}

	final public static boolean _M_DispatchPatternBinder(Sink sink, int shared, int depth, Term term_29, Term term_16, Term term_20, Term term_58)
	{
		if (depth < 2000)
		{
			label_69 :
			{
				if (term_29.descriptor() != _M_Crsx_xbinder)
				{
					break label_69;
				}
				Term sub_124 = term_29.sub(0).ref();
				/* #annotations?=sub */Term sub_229 = term_29.sub(1).ref();
				if (sub_229.descriptor() != _M_Crsx_xvariable)
				{
					break label_69;
				}
				Term sub_188 = sub_229.sub(0).ref();
				if (sub_188.descriptor() != _M__sNil)
				{
					break label_69;
				}
				Term sub_38 = sub_229.sub(1).ref();
				/* #VARIABLE=sub */Term sub_192 = sub_229.sub(2).ref();
				/* #linear?=sub */Term sub_90 = sub_229.sub(3).ref();
				/* #functional?=sub */Term sub_182 = sub_229.sub(4).ref();
				/* #varsort?=sub */
				/* #nextBinder=term */
				/* #count=term */
				/* #freeTerms_S1*=term *//*Contract*/
				sink.start(_M_Crsx_xterm_xA2);
				sink.start(_M_Crsx_xboundTerm);
				sink.start(_M_Crsx_xbinder);
				sink.copy(sub_124.ref());
				sink.start(_M_Crsx_xvariable);
				sink.start(_M__sNil);
				sink.end();
				sink.copy(sub_38.ref());
				sink.copy(sub_192.ref());
				sink.copy(sub_90.ref());
				sink.copy(sub_182.ref());
				sink.end();
				sink.end();
				sink.start(_M_DispatchPatternNextBinder);
				sink.copy(term_16.ref());
				sink.copy(term_20.ref());
				sink.start(_M_Concat);
				sink.copy(term_58.ref());
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xfreeTerms_xS1);
				sink.literal(",");
				sink.start(_M_Crsx_xfreeTerm_xA5);
				sink.start(_M__sNil);
				sink.end();
				sink.start(_M_Crsx_xvariable);
				sink.start(_M__sNil);
				sink.end();
				sink.copy(sub_38.ref());
				sink.copy(sub_192.ref());
				sink.copy(sub_90.ref());
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_DispatchPatternBinder, term_29, term_16, term_20, term_58);
	}

	final public static boolean _M_DispatchPatternFreeTerm(Sink sink, int shared, int depth, Term term_3, Term term_39, Term term_5)
	{
		if (depth < 2000)
		{
			sink.start(_M_Crsx_xfreeTerm_xA7);
			sink.start(_M__sNil);
			sink.end();
			sink.start(_M__sNil);
			sink.end();
			sink.start(_M__s);
			sink.start(_M_Builtin_sColon);
			sink.end();
			sink.literal("#$P$");
			sink.start(_M__s);
			sink.start(_M_Builtin_sFormatNumber);
			sink.end();
			sink.copy(term_39.ref());
			sink.end();
			sink.end();
			sink.start(_M_DispatchMetaArgsOpt);
			sink.copy(term_5.ref());
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_DispatchPatternFreeTerm, term_3, term_39, term_5);
	}

	final public static boolean _M_DispatchPatternTerm(Sink sink, int shared, int depth, Term term_64, Term term_65, Term term_142)
	{
		if (depth < 2000)
		{
			label_166 :
			{
				if (term_64.descriptor() != _M_Crsx_xterm_xA1)
				{
					break label_166;
				}
				Term sub_132 = term_64.sub(0).ref();
				/* #freeTerm=sub */
				/* #count=term */
				/* #freeTerms_S1*=term *//*Contract*/
				sink.start(_M_Crsx_xterm_xA1);
				sink.start(_M_DispatchPatternFreeTerm);
				sink.copy(sub_132.ref());
				sink.copy(term_65.ref());
				sink.copy(term_142.ref());
				sink.end();
				sink.end();
				return true;
			}
			label_145 :
			{
				if (term_64.descriptor() != _M_Crsx_xterm_xA2)
				{
					break label_145;
				}
				Term sub_178 = term_64.sub(0).ref();
				if (sub_178.descriptor() != _M_Crsx_xboundTerm)
				{
					break label_145;
				}
				Term sub_198 = sub_178.sub(0).ref();
				/* #binder=sub */Term sub_482 = sub_178.sub(1).ref();
				/* #nextBinder=sub */
				/* #count=term */
				/* #freeTerms_S1*=term *//*Contract*/
				sink.start(_M_DispatchPatternBinder);
				sink.copy(sub_198.ref());
				sink.copy(sub_482.ref());
				sink.copy(term_65.ref());
				sink.copy(term_142.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_DispatchPatternTerm, term_64, term_65, term_142);
	}

	final public static boolean _M_DispatchPatternArgs(Sink sink, int shared, int depth, Term term_80, Term term_91)
	{
		if (depth < 2000)
		{
			label_99 :
			{
				if (term_80.descriptor() != _M__sNil)
				{
					break label_99;
				}
				/* #count=term *//*Contract*/sink.start(_M__sNil);
				sink.end();
				return true;
			}
			label_139 :
			{
				if (term_80.descriptor() != _M__sCons)
				{
					break label_139;
				}
				Term sub_17 = term_80.sub(0).ref();
				if (sub_17.descriptor() != _M_Crsx_xterms_xS1)
				{
					break label_139;
				}
				Term sub_264 = sub_17.sub(0).ref();
				Term sub_204 = sub_17.sub(1).ref();
				/* #term=sub */Term sub_131 = term_80.sub(1).ref();
				/* #terms_S1*=sub */
				/* #count=term *//*Contract*/
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xterms_xS1);
				sink.literal(",");
				sink.start(_M_DispatchPatternTerm);
				sink.copy(sub_204.ref());
				sink.copy(term_91.ref());
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				sink.start(_M_DispatchPatternArgs);
				sink.copy(sub_131.ref());
				sink.start(_M__s);
				sink.start(_M_Builtin_sPlus);
				sink.end();
				sink.copy(term_91.ref());
				sink.literal(1);
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_DispatchPatternArgs, term_80, term_91);
	}

	final public static boolean _M_DispatchProperties(Sink sink, int shared, int depth, Term term_17)
	{
		if (depth < 2000)
		{
			label_85 :
			{
				if (term_17.descriptor() != _M__sNil)
				{
					break label_85;
				}/*Contract*/
				sink.start(_M__sNil);
				sink.end();
				return true;
			}
			label_128 :
			{
				if (term_17.descriptor() != _M__sCons)
				{
					break label_128;
				}
				Term sub_151 = term_17.sub(0).ref();
				if (sub_151.descriptor() != _M_Crsx_xproperties)
				{
					break label_128;
				}
				Term sub_144 = sub_151.sub(0).ref();
				Term sub_304 = sub_151.sub(1).ref();
				if (sub_304.descriptor() != _M__sNil)
				{
					break label_128;
				}
				Term sub_171 = sub_151.sub(2).ref();
				Term sub_396 = term_17.sub(1).ref();
				if (sub_396.descriptor() != _M__sNil)
				{
					break label_128;
				}/*Contract*/
				sink.start(_M__sNil);
				sink.end();
				return true;
			}
			label_134 :
			{
				if (term_17.descriptor() != _M__sCons)
				{
					break label_134;
				}
				Term sub_39 = term_17.sub(0).ref();
				if (sub_39.descriptor() != _M_Crsx_xproperties)
				{
					break label_134;
				}
				Term sub_32 = sub_39.sub(0).ref();
				Term sub_133 = sub_39.sub(1).ref();
				if (sub_133.descriptor() != _M__sCons)
				{
					break label_134;
				}
				Term sub_288 = sub_133.sub(0).ref();
				/* #propertyList=sub */Term sub_149 = sub_133.sub(1).ref();
				if (sub_149.descriptor() != _M__sNil)
				{
					break label_134;
				}
				Term sub_126 = sub_39.sub(2).ref();
				Term sub_110 = term_17.sub(1).ref();
				if (sub_110.descriptor() != _M__sNil)
				{
					break label_134;
				}/*Contract*/
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xproperties);
				sink.literal("{");
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xpropertyList);
				sink.start(_M_Crsx_xproperty_xA1);
				sink.literal("#$P$E");
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.literal("}");
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_DispatchProperties, term_17);
	}

	final public static boolean _M_Dispatch(Sink sink, int shared, int depth, Term term_56)
	{
		if (depth < 2000)
		{
			label_51 :
			{
				if (term_56.descriptor() != _M__sCons)
				{
					break label_51;
				}
				Term sub_286 = term_56.sub(0).ref();
				if (sub_286.descriptor() != _M_Crsx_xruleDeclaration)
				{
					break label_51;
				}
				Term sub_291 = sub_286.sub(0).ref();
				/* #option?=sub */Term sub_146 = sub_286.sub(1).ref();
				if (sub_146.descriptor() != _M_Crsx_xpattern)
				{
					break label_51;
				}
				Term sub_122 = sub_146.sub(0).ref();
				/* #properties?=sub */Term sub_250 = sub_146.sub(1).ref();
				/* #constructor=sub */Term sub_145 = sub_146.sub(2).ref();
				if (sub_145.descriptor() != _M__sCons)
				{
					break label_51;
				}
				Term sub_158 = sub_145.sub(0).ref();
				if (sub_158.descriptor() != _M_Crsx_xarguments)
				{
					break label_51;
				}
				Term sub_452 = sub_158.sub(0).ref();
				Term sub_363 = sub_158.sub(1).ref();
				if (sub_363.descriptor() != _M__sCons)
				{
					break label_51;
				}
				Term sub_175 = sub_363.sub(0).ref();
				/* #terms=sub */Term sub_206 = sub_363.sub(1).ref();
				if (sub_206.descriptor() != _M__sNil)
				{
					break label_51;
				}
				Term sub_241 = sub_158.sub(2).ref();
				Term sub_225 = sub_145.sub(1).ref();
				if (sub_225.descriptor() != _M__sNil)
				{
					break label_51;
				}
				Term sub_278 = sub_286.sub(2).ref();
				Term sub_223 = sub_286.sub(3).ref();
				/* #contractum=sub */Term sub_153 = term_56.sub(1).ref();
				/* #rules=sub *//*Contract*/
				sink.start(_M_Crsx_xruleDeclaration);
				sink.start(_M__sNil);
				sink.end();
				sink.start(_M_Crsx_xpattern);
				sink.start(_M_DispatchProperties);
				sink.copy(sub_122.ref());
				sink.end();
				sink.copy(sub_250.ref());
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xarguments);
				sink.literal("[");
				sink.start(_M__sCons);
				sink.start(_M_SugarTerms);
				sink.start(_M_DispatchPatternArgs);
				sink.start(_M_DesugarTerms);
				sink.copy(sub_175.ref());
				sink.end();
				sink.literal(0);
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
				sink.literal("\u2192");
				sink.start(_M_Crsx_xcontractum);
				sink.start(_M_Crsx_xfreeTerm_xA9);
				sink.start(_M__sNil);
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.start(_M_Crsx_xexpression);
				sink.start(_M_Crsx_xdispatch);
				sink.literal("dispatch");
				sink.start(_M_Crsx_xdispatchTerm);
				sink.start(_M_Crsx_xfreeTerm_xA1);
				sink.start(_M__sNil);
				sink.end();
				sink.start(_M_DispatchProperties);
				sink.copy(sub_122.ref());
				sink.end();
				sink.copy(sub_250.ref());
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xarguments);
				sink.literal("[");
				sink.start(_M__sCons);
				sink.start(_M_SugarTerms);
				sink.start(_M_DispatchPatternArgs);
				sink.start(_M_DesugarTerms);
				sink.copy(sub_175.ref());
				sink.end();
				sink.literal(0);
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
				sink.end();
				sink.start(_M_SugarDispatchCases);
				sink.start(_M_DispatchCases);
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xruleDeclaration);
				sink.copy(sub_291.ref());
				sink.start(_M_Crsx_xpattern);
				sink.copy(sub_122.ref());
				sink.copy(sub_250.ref());
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xarguments);
				sink.literal("[");
				sink.start(_M__sCons);
				sink.copy(sub_175.ref());
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.literal("]");
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				sink.literal("\u2192");
				sink.copy(sub_223.ref());
				sink.end();
				sink.copy(sub_153.ref());
				sink.end();
				sink.end();
				sink.end();
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xdelayCase);
				sink.literal("delay");
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Dispatch, term_56);
	}

	final public static boolean _M_GroupRule(Sink sink, int shared, int depth, Properties props_99, Term term_193, Term term_269, Variable var_14, Term term_160)
	{
		if (depth < 2000)
		{
			label_52 :
			{
				/* #key=term */
				/* #rules=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_99));
				Term term_176;
				{
					BufferSink buf_35 = sink.context().makeBuffer();
					buf_35.start(_M_RULES);
					buf_35.start(_M__sCons);
					buf_35.start(_M_Dispatch);
					buf_35.copy(term_269.ref());
					buf_35.end();
					buf_35.start(_M__sNil);
					buf_35.end();
					buf_35.end();
					buf_35.end();
					term_176 = buf_35.term();
				}
				term_193 = force(sink.context(), term_193);
				Sink.property(sink, term_193, term_176);
				Term term_112;
				{
					BufferSink buf_66 = sink.context().makeBuffer();
					buf_66.start(_M_OK);
					buf_66.end();
					term_112 = buf_66.term();
				}
				sink.substitute(term_160.ref(), new Variable[]
					{var_14}, new Term[]
					{term_112});
				return true;
			}
		}
		return thunk(sink, _M_GroupRule, props_99, term_193, term_269, var_14, term_160);
	}

	final public static boolean _M_MayGroupRule2(Sink sink, int shared, int depth, Properties props_35, Term term_34, Term term_61, Term term_99, Variable var_43, Term term_0)
	{
		if (depth < 2000)
		{
			label_263 :
			{
				if (term_34.descriptor() != _M_TRUE)
				{
					break label_263;
				}
				/* #key=term */
				/* #rules=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_35));
				Term term_146;
				{
					BufferSink buf_11 = sink.context().makeBuffer();
					buf_11.start(_M_OK);
					buf_11.end();
					term_146 = buf_11.term();
				}
				sink.substitute(term_0.ref(), new Variable[]
					{var_43}, new Term[]
					{term_146});
				return true;
			}
			label_89 :
			{
				if (term_34.descriptor() != _M_FALSE)
				{
					break label_89;
				}
				/* #key=term */
				/* #rules=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_35));
				sink.start(_M_GroupRule);
				sink.copy(term_61.ref());
				sink.copy(term_99.ref());
				Variable var_25 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_25});
				VariableUse use_64 = sink.context().makeVariableUse(var_25);
				sink.substitute(term_0.ref(), new Variable[]
					{var_43}, new Term[]
					{use_64});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_MayGroupRule2, props_35, term_34, term_61, term_99, var_43, term_0);
	}

	final public static boolean _M_MayGroupRule1(Sink sink, int shared, int depth, Properties props_22, Term term_171, Term term_41, Variable var_94, Term term_6)
	{
		if (depth < 2000)
		{
			label_110 :
			{
				if (term_171.descriptor() != _M_RULES)
				{
					break label_110;
				}
				Term sub_244 = term_171.sub(0).ref();
				/* #rules=sub */
				/* #key=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_22));
				sink.start(_M_MayGroupRule2);
				sink.start(_M_Or);
				sink.start(_M_IsEmpty);
				sink.copy(sub_244.ref());
				sink.end();
				sink.start(_M_And);
				sink.start(_M_IsSingleton);
				sink.copy(sub_244.ref());
				sink.end();
				sink.start(_M_AllMetaInPatternRule);
				sink.start(_M_Head);
				sink.copy(sub_244.ref());
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.copy(term_41.ref());
				sink.copy(sub_244.ref());
				Variable var_72 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_72});
				VariableUse use_57 = sink.context().makeVariableUse(var_72);
				sink.substitute(term_6.ref(), new Variable[]
					{var_94}, new Term[]
					{use_57});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_MayGroupRule1, props_22, term_171, term_41, var_94, term_6);
	}

	final public static boolean _M_MayGroupRule(Sink sink, int shared, int depth, Properties props_73, Term term_152, Variable var_42, Term term_113)
	{
		if (depth < 2000)
		{
			label_14 :
			{
				/* #key=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_73));
				sink.start(_M_MayGroupRule1);
				sink.start(_M__s);
				sink.properties(safeRef(props_73));
				sink.start(_M_Builtin_sGet);
				sink.end();
				sink.copy(term_152.ref());
				sink.end();
				sink.copy(term_152.ref());
				Variable var_80 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_80});
				VariableUse use_12 = sink.context().makeVariableUse(var_80);
				sink.substitute(term_113.ref(), new Variable[]
					{var_42}, new Term[]
					{use_12});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_MayGroupRule, props_73, term_152, var_42, term_113);
	}

	final public static boolean _M_N2Rule(Sink sink, int shared, int depth, Properties props_180, Term term_12, Term term_92)
	{
		if (depth < 2000)
		{
			label_70 :
			{
				/* #ruleKey=term */
				if (term_92.descriptor() != _M_CONTINUATION)
				{
					break label_70;
				}
				Term sub_173 = term_92.sub(0).ref();
				Variable binder = term_92.binders(0)[0];
				/* #=sub *//*Contract*/sink.properties(safeRef(props_180));
				sink.start(_M_MayGroupRule);
				sink.copy(term_12.ref());
				Variable var_32 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_32});
				sink.start(_M_NormalizeRuleKey);
				sink.use(var_32);
				sink.copy(term_12.ref());
				Variable var_65 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_65});
				VariableUse use_95 = sink.context().makeVariableUse(var_65);
				sink.substitute(sub_173.ref(), new Variable[]
					{binder}, new Term[]
					{use_95});
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_N2Rule, props_180, term_12, term_92);
	}

	final public static boolean _M_N2Rules(Sink sink, int shared, int depth, Properties props_72, Term term_69, Variable var_28, Term term_260)
	{
		if (depth < 2000)
		{
			label_118 :
			{
				/* #keys=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_72));
				sink.start(_M_SeqMap);
				Variable var_78 = sink.context().makeVariable("x");
				Variable var_11 = sink.context().makeVariable("c");
				sink.binds(new Variable[]
					{var_78, var_11});
				sink.start(_M_N2Rule);
				sink.use(var_78);
				sink.use(var_11);
				sink.end();
				sink.copy(term_69.ref());
				Variable var_61 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_61});
				VariableUse use_76 = sink.context().makeVariableUse(var_61);
				sink.substitute(term_260.ref(), new Variable[]
					{var_28}, new Term[]
					{use_76});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_N2Rules, props_72, term_69, var_28, term_260);
	}

	final public static boolean _M_N2(Sink sink, int shared, int depth, Properties props_13, Term term_23, Variable var_7, Term term_71)
	{
		if (depth < 2000)
		{
			label_63 :
			{
				Term value = props_13 == null ? null : props_13.lookup("$rulekeys");
				if (value == null)
				{
					break label_63;
				}
				if (value.descriptor() != _M_KEYS)
				{
					break label_63;
				}
				Term sub_199 = value.sub(0).ref();
				/* #keys=sub */
				if (term_23.descriptor() != _M_OK)
				{
					break label_63;
				}
				/* #=term *//*Contract*/sink.properties(safeRef(props_13));
				sink.start(_M_N2Rules);
				sink.copy(sub_199.ref());
				Variable var_22 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_22});
				VariableUse use_49 = sink.context().makeVariableUse(var_22);
				sink.substitute(term_71.ref(), new Variable[]
					{var_7}, new Term[]
					{use_49});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_N2, props_13, term_23, var_7, term_71);
	}

	final public static boolean _M_N1ImportDirective(Sink sink, int shared, int depth, Properties props_43, Term term_72, Term term_94, Variable var_35, Term term_128)
	{
		if (depth < 2000)
		{
			label_146 :
			{
				Term value_34 = props_43 == null ? null : props_43.lookup("$imported");
				if (value_34 == null)
				{
					break label_146;
				}
				if (value_34.descriptor() != _M_IMPORTS)
				{
					break label_146;
				}
				Term sub_266 = value_34.sub(0).ref();
				/* #imported=sub */
				if (term_72.descriptor() != _M_Crsx_xdirective_xA3)
				{
					break label_146;
				}
				Term sub_388 = term_72.sub(0).ref();
				if (sub_388.descriptor() != _M_Crsx_xliteral_xA1)
				{
					break label_146;
				}
				Term sub_235 = sub_388.sub(0).ref();
				/* #STRING=sub */
				if (term_94.descriptor() != _M_TRUE)
				{
					break label_146;
				}
				/* #=term *//*Contract*/sink.properties(safeRef(props_43));
				Term term_114;
				{
					BufferSink buf_93 = sink.context().makeBuffer();
					buf_93.start(_M_IMPORTS);
					buf_93.start(_M_Concat);
					buf_93.copy(sub_266.ref());
					buf_93.start(_M__sCons);
					buf_93.start(_M_UnString);
					buf_93.copy(sub_235.ref());
					buf_93.end();
					buf_93.start(_M__sNil);
					buf_93.end();
					buf_93.end();
					buf_93.end();
					buf_93.end();
					term_114 = buf_93.term();
				}
				sink.propertyNamed("$imported", term_114);
				Term term_132;
				{
					BufferSink buf_61 = sink.context().makeBuffer();
					buf_61.start(_M_OK);
					buf_61.end();
					term_132 = buf_61.term();
				}
				sink.substitute(term_128.ref(), new Variable[]
					{var_35}, new Term[]
					{term_132});
				return true;
			}
			label_103 :
			{
				Term value_75 = props_43 == null ? null : props_43.lookup("$grammars");
				if (value_75 == null)
				{
					break label_103;
				}
				if (value_75.descriptor() != _M_IMPORTS)
				{
					break label_103;
				}
				Term sub_168 = value_75.sub(0).ref();
				/* #imported=sub */
				if (term_72.descriptor() != _M_Crsx_xdirective_xA3)
				{
					break label_103;
				}
				Term sub_141 = term_72.sub(0).ref();
				if (sub_141.descriptor() != _M_Crsx_xliteral_xA1)
				{
					break label_103;
				}
				Term sub_233 = sub_141.sub(0).ref();
				/* #STRING=sub */
				if (term_94.descriptor() != _M_FALSE)
				{
					break label_103;
				}
				/* #=term *//*Contract*/sink.properties(safeRef(props_43));
				Term term_148;
				{
					BufferSink buf_184 = sink.context().makeBuffer();
					buf_184.start(_M_IMPORTS);
					buf_184.start(_M_Concat);
					buf_184.copy(sub_168.ref());
					buf_184.start(_M__sCons);
					buf_184.start(_M_Replace);
					buf_184.start(_M_UnString);
					buf_184.copy(sub_233.ref());
					buf_184.end();
					buf_184.literal(".");
					buf_184.literal("/");
					buf_184.end();
					buf_184.start(_M__sNil);
					buf_184.end();
					buf_184.end();
					buf_184.end();
					buf_184.end();
					term_148 = buf_184.term();
				}
				sink.propertyNamed("$grammars", term_148);
				Term term_178;
				{
					BufferSink buf_84 = sink.context().makeBuffer();
					buf_84.start(_M_OK);
					buf_84.end();
					term_178 = buf_84.term();
				}
				sink.substitute(term_128.ref(), new Variable[]
					{var_35}, new Term[]
					{term_178});
				return true;
			}
			label_48 :
			{
				/* #directive=term */
				/* #kind=term */
				/* #=term *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.literal("Error: invalid argument in import directive.");
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_N1ImportDirective, props_43, term_72, term_94, var_35, term_128);
	}

	final public static boolean _M_N1ImportDirectives(Sink sink, int shared, int depth, Properties props_10, Term term_213, Term term_87, Variable var_41, Term term_60)
	{
		if (depth < 2000)
		{
			label_30 :
			{
				if (term_213.descriptor() != _M__sNil)
				{
					break label_30;
				}
				/* #kind=term */
				/* #=term *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.literal("Error: missing filename argument in import directive.");
				sink.end();
				return true;
			}
			label_15 :
			{
				if (term_213.descriptor() != _M__sCons)
				{
					break label_15;
				}
				Term sub_362 = term_213.sub(0).ref();
				if (sub_362.descriptor() != _M_Crsx_xdirectives)
				{
					break label_15;
				}
				Term sub_108 = sub_362.sub(0).ref();
				/* #directive1=sub */Term sub_211 = sub_362.sub(1).ref();
				if (sub_211.descriptor() != _M__sCons)
				{
					break label_15;
				}
				Term sub_140 = sub_211.sub(0).ref();
				if (sub_140.descriptor() != _M_Crsx_xdirectives_xS1)
				{
					break label_15;
				}
				Term sub_297 = sub_140.sub(0).ref();
				Term sub_136 = sub_140.sub(1).ref();
				/* #directive2=sub */Term sub_239 = sub_211.sub(1).ref();
				/* #directives_S1*=sub */Term sub_167 = term_213.sub(1).ref();
				if (sub_167.descriptor() != _M__sNil)
				{
					break label_15;
				}
				/* #kind=term */
				/* #=term *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.literal("Error: extraneous argument in import directive.");
				sink.end();
				return true;
			}
			label_20 :
			{
				if (term_213.descriptor() != _M__sCons)
				{
					break label_20;
				}
				Term sub_249 = term_213.sub(0).ref();
				if (sub_249.descriptor() != _M_Crsx_xdirectives)
				{
					break label_20;
				}
				Term sub_196 = sub_249.sub(0).ref();
				/* #directive=sub */Term sub_100 = sub_249.sub(1).ref();
				if (sub_100.descriptor() != _M__sNil)
				{
					break label_20;
				}
				Term sub_166 = term_213.sub(1).ref();
				if (sub_166.descriptor() != _M__sNil)
				{
					break label_20;
				}
				/* #kind=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_10));
				sink.start(_M_N1ImportDirective);
				sink.copy(sub_196.ref());
				sink.copy(term_87.ref());
				Variable var_74 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_74});
				VariableUse use_84 = sink.context().makeVariableUse(var_74);
				sink.substitute(term_60.ref(), new Variable[]
					{var_41}, new Term[]
					{use_84});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_N1ImportDirectives, props_10, term_213, term_87, var_41, term_60);
	}

	final public static boolean _M_N1Import(Sink sink, int shared, int depth, Properties props_148, Term term_63, Term term_47, Variable var_55, Term term_109)
	{
		if (depth < 2000)
		{
			label_95 :
			{
				if (term_63.descriptor() != _M__sNil)
				{
					break label_95;
				}
				/* #kind=term */
				/* #=term *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.literal("Error: missing filename argument in import directive.");
				sink.end();
				return true;
			}
			label_88 :
			{
				if (term_63.descriptor() != _M__sCons)
				{
					break label_88;
				}
				Term sub_514 = term_63.sub(0).ref();
				if (sub_514.descriptor() != _M_Crsx_xdirectiveArguments)
				{
					break label_88;
				}
				Term sub_292 = sub_514.sub(0).ref();
				Term sub_152 = sub_514.sub(1).ref();
				/* #directives?=sub */Term sub_432 = sub_514.sub(2).ref();
				Term sub_448 = term_63.sub(1).ref();
				if (sub_448.descriptor() != _M__sNil)
				{
					break label_88;
				}
				/* #kind=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_148));
				sink.start(_M_N1ImportDirectives);
				sink.copy(sub_152.ref());
				sink.copy(term_47.ref());
				Variable var_46 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_46});
				VariableUse use_9 = sink.context().makeVariableUse(var_46);
				sink.substitute(term_109.ref(), new Variable[]
					{var_55}, new Term[]
					{use_9});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_N1Import, props_148, term_63, term_47, var_55, term_109);
	}

	final public static boolean _M_N1DirectiveConstructor(Sink sink, int shared, int depth, Properties props_29, Term term_145, Variable var_60, Term term_135)
	{
		if (depth < 2000)
		{
			label_0 :
			{
				/* #constructor=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_29));
				Term term_38;
				{
					BufferSink buf_28 = sink.context().makeBuffer();
					buf_28.start(_M_OK);
					buf_28.end();
					term_38 = buf_28.term();
				}
				sink.substitute(term_135.ref(), new Variable[]
					{var_60}, new Term[]
					{term_38});
				return true;
			}
		}
		return thunk(sink, _M_N1DirectiveConstructor, props_29, term_145, var_60, term_135);
	}

	final public static boolean _M_N1Directive(Sink sink, int shared, int depth, Properties props_60, Term term_32, Variable var_12, Term term_7)
	{
		if (depth < 2000)
		{
			label_40 :
			{
				if (term_32.descriptor() != _M_Crsx_xdirective_xA1)
				{
					break label_40;
				}
				Term sub_118 = term_32.sub(0).ref();
				if (sub_118.descriptor() != _M_Crsx_xconstructor_xA1)
				{
					break label_40;
				}
				Term sub_237 = sub_118.sub(0).ref();
				if (sub_237.descriptor() != _M_Crsx_xqualifier_xA2)
				{
					break label_40;
				}
				Term sub_573 = sub_118.sub(1).ref();
				/* #CONSTRUCTOR=sub */Term sub_345 = term_32.sub(1).ref();
				/* #directiveArguments?=sub */
				/* #=term *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sIf);
				sink.end();
				sink.start(_M__s);
				sink.start(_M_Builtin_sStringEqual);
				sink.end();
				sink.copy(sub_573.ref());
				sink.literal("$Use");
				sink.end();
				sink.properties(safeRef(props_60));
				sink.start(_M_N1Import);
				sink.copy(sub_345.ref());
				sink.start(_M_TRUE);
				sink.end();
				Variable var_4 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_4});
				VariableUse use_85 = sink.context().makeVariableUse(var_4);
				sink.substitute(term_7.ref(), new Variable[]
					{var_12}, new Term[]
					{use_85});
				sink.end();
				sink.start(_M__s);
				sink.start(_M_Builtin_sIf);
				sink.end();
				sink.start(_M__s);
				sink.start(_M_Builtin_sStringEqual);
				sink.end();
				sink.copy(sub_573.ref());
				sink.literal("$AddGrammar");
				sink.end();
				sink.properties(safeRef(props_60));
				sink.start(_M_N1Import);
				sink.copy(sub_345.ref());
				sink.start(_M_FALSE);
				sink.end();
				Variable var_2 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_2});
				VariableUse use_77 = sink.context().makeVariableUse(var_2);
				sink.substitute(term_7.ref(), new Variable[]
					{var_12}, new Term[]
					{use_77});
				sink.end();
				sink.properties(safeRef(props_60));
				Term term_62;
				{
					BufferSink buf_68 = sink.context().makeBuffer();
					buf_68.start(_M_OK);
					buf_68.end();
					term_62 = buf_68.term();
				}
				sink.substitute(term_7.ref(), new Variable[]
					{var_12}, new Term[]
					{term_62});
				sink.end();
				sink.end();
				return true;
			}
			label_92 :
			{
				/* #directive=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_60));
				Term term_162;
				{
					BufferSink buf_29 = sink.context().makeBuffer();
					buf_29.start(_M_OK);
					buf_29.end();
					term_162 = buf_29.term();
				}
				sink.substitute(term_7.ref(), new Variable[]
					{var_12}, new Term[]
					{term_162});
				return true;
			}
		}
		return thunk(sink, _M_N1Directive, props_60, term_32, var_12, term_7);
	}

	final public static boolean _M_N1Declaration(Sink sink, int shared, int depth, Properties props_26, Term term_189, Variable var_13, Term term_9)
	{
		if (depth < 2000)
		{
			label_58 :
			{
				if (term_189.descriptor() != _M_Crsx_xdeclaration_xA5)
				{
					break label_58;
				}
				Term sub_139 = term_189.sub(0).ref();
				if (sub_139.descriptor() != _M_Crsx_xdirective_xA1)
				{
					break label_58;
				}
				Term sub_450 = sub_139.sub(0).ref();
				/* #constructor=sub */Term sub_143 = sub_139.sub(1).ref();
				if (sub_143.descriptor() != _M__sCons)
				{
					break label_58;
				}
				Term sub_169 = sub_143.sub(0).ref();
				if (sub_169.descriptor() != _M_Crsx_xdirectiveArguments)
				{
					break label_58;
				}
				Term sub_154 = sub_169.sub(0).ref();
				Term sub_170 = sub_169.sub(1).ref();
				if (sub_170.descriptor() != _M__sCons)
				{
					break label_58;
				}
				Term sub_114 = sub_170.sub(0).ref();
				if (sub_114.descriptor() != _M_Crsx_xdirectives)
				{
					break label_58;
				}
				Term sub_403 = sub_114.sub(0).ref();
				if (sub_403.descriptor() != _M_Crsx_xdirective_xA2)
				{
					break label_58;
				}
				Term sub_368 = sub_403.sub(0).ref();
				if (sub_368.descriptor() != _M_Crsx_xdirectiveList)
				{
					break label_58;
				}
				Term sub_355 = sub_368.sub(0).ref();
				Term sub_597 = sub_368.sub(1).ref();
				if (sub_597.descriptor() != _M__sNil)
				{
					break label_58;
				}
				Term sub_456 = sub_368.sub(2).ref();
				Term sub_324 = sub_114.sub(1).ref();
				if (sub_324.descriptor() != _M__sNil)
				{
					break label_58;
				}
				Term sub_416 = sub_170.sub(1).ref();
				if (sub_416.descriptor() != _M__sNil)
				{
					break label_58;
				}
				Term sub_155 = sub_169.sub(2).ref();
				Term sub_261 = sub_143.sub(1).ref();
				if (sub_261.descriptor() != _M__sNil)
				{
					break label_58;
				}
				/* #=term *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sIf);
				sink.end();
				sink.start(_M_IsDirectiveUnwrap);
				sink.copy(sub_450.ref());
				sink.end();
				sink.properties(safeRef(props_26));
				sink.start(_M_N1DirectiveConstructor);
				sink.copy(sub_450.ref());
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.properties(safeRef(props_26));
				Term term_120;
				{
					BufferSink buf_26 = sink.context().makeBuffer();
					buf_26.start(_M_OK);
					buf_26.end();
					term_120 = buf_26.term();
				}
				sink.substitute(term_9.ref(), new Variable[]
					{var_13}, new Term[]
					{term_120});
				sink.end();
				return true;
			}
			label_53 :
			{
				if (term_189.descriptor() != _M_Crsx_xdeclaration_xA5)
				{
					break label_53;
				}
				Term sub_275 = term_189.sub(0).ref();
				if (sub_275.descriptor() != _M_Crsx_xdirective_xA1)
				{
					break label_53;
				}
				Term sub_290 = sub_275.sub(0).ref();
				/* #constructor=sub */Term sub_365 = sub_275.sub(1).ref();
				if (sub_365.descriptor() != _M__sCons)
				{
					break label_53;
				}
				Term sub_120 = sub_365.sub(0).ref();
				if (sub_120.descriptor() != _M_Crsx_xdirectiveArguments)
				{
					break label_53;
				}
				Term sub_268 = sub_120.sub(0).ref();
				Term sub_313 = sub_120.sub(1).ref();
				if (sub_313.descriptor() != _M__sCons)
				{
					break label_53;
				}
				Term sub_148 = sub_313.sub(0).ref();
				if (sub_148.descriptor() != _M_Crsx_xdirectives)
				{
					break label_53;
				}
				Term sub_109 = sub_148.sub(0).ref();
				if (sub_109.descriptor() != _M_Crsx_xdirective_xA2)
				{
					break label_53;
				}
				Term sub_67 = sub_109.sub(0).ref();
				if (sub_67.descriptor() != _M_Crsx_xdirectiveList)
				{
					break label_53;
				}
				Term sub_238 = sub_67.sub(0).ref();
				Term sub_217 = sub_67.sub(1).ref();
				if (sub_217.descriptor() != _M__sCons)
				{
					break label_53;
				}
				Term sub_314 = sub_217.sub(0).ref();
				/* #declarations=sub */Term sub_20 = sub_217.sub(1).ref();
				if (sub_20.descriptor() != _M__sNil)
				{
					break label_53;
				}
				Term sub_289 = sub_67.sub(2).ref();
				Term sub_310 = sub_148.sub(1).ref();
				if (sub_310.descriptor() != _M__sNil)
				{
					break label_53;
				}
				Term sub_279 = sub_313.sub(1).ref();
				if (sub_279.descriptor() != _M__sNil)
				{
					break label_53;
				}
				Term sub_227 = sub_120.sub(2).ref();
				Term sub_92 = sub_365.sub(1).ref();
				if (sub_92.descriptor() != _M__sNil)
				{
					break label_53;
				}
				/* #=term *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sIf);
				sink.end();
				sink.start(_M_IsDirectiveUnwrap);
				sink.copy(sub_290.ref());
				sink.end();
				sink.properties(safeRef(props_26));
				sink.start(_M_N1DirectiveConstructor);
				sink.copy(sub_290.ref());
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xdirectiveArguments);
				sink.literal("[");
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xdirectives);
				sink.start(_M_Crsx_xdirective_xA2);
				sink.start(_M_Crsx_xdirectiveList);
				sink.literal("(");
				sink.start(_M__sCons);
				sink.copy(sub_314.ref());
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.literal(")");
				sink.end();
				sink.end();
				sink.start(_M__sNil);
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
				sink.properties(safeRef(props_26));
				sink.start(_M_N1Declarations1);
				sink.start(_M_OK);
				sink.end();
				sink.start(_M_DesugarDeclarations);
				sink.copy(sub_314.ref());
				sink.end();
				Variable var_24 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_24});
				VariableUse use_42 = sink.context().makeVariableUse(var_24);
				sink.substitute(term_9.ref(), new Variable[]
					{var_13}, new Term[]
					{use_42});
				sink.end();
				sink.end();
				return true;
			}
			label_37 :
			{
				if (term_189.descriptor() != _M_Crsx_xdeclaration_xA5)
				{
					break label_37;
				}
				Term sub_300 = term_189.sub(0).ref();
				/* #directive=sub */
				/* #=term *//*Contract*/sink.properties(safeRef(props_26));
				sink.start(_M_N1Directive);
				sink.copy(sub_300.ref());
				Variable var_82 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_82});
				VariableUse use_4 = sink.context().makeVariableUse(var_82);
				sink.substitute(term_9.ref(), new Variable[]
					{var_13}, new Term[]
					{use_4});
				sink.end();
				return true;
			}
			label_56 :
			{
				if (term_189.descriptor() != _M_Crsx_xdeclaration_xA1)
				{
					break label_56;
				}
				Term sub_85 = term_189.sub(0).ref();
				if (sub_85.descriptor() != _M_Crsx_xmoduleDeclaration)
				{
					break label_56;
				}
				Term sub_128 = sub_85.sub(0).ref();
				Term sub_561 = sub_85.sub(1).ref();
				/* #CONSTRUCTOR=sub */Term sub_366 = sub_85.sub(2).ref();
				Term sub_356 = sub_85.sub(3).ref();
				/* #declarations=sub */Term sub_393 = sub_85.sub(4).ref();
				/* #=term *//*Contract*/sink.properties(safeRef(props_26));
				sink.start(_M_N1Declarations);
				sink.start(_M_DesugarDeclarations);
				sink.copy(sub_356.ref());
				sink.end();
				Variable var_158 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_158});
				VariableUse use_5 = sink.context().makeVariableUse(var_158);
				sink.substitute(term_9.ref(), new Variable[]
					{var_13}, new Term[]
					{use_5});
				sink.end();
				return true;
			}
			label_68 :
			{
				if (term_189.descriptor() != _M_Crsx_xdeclaration_xA3)
				{
					break label_68;
				}
				Term sub_162 = term_189.sub(0).ref();
				if (sub_162.descriptor() != _M_Crsx_xruleDeclaration)
				{
					break label_68;
				}
				Term sub_328 = sub_162.sub(0).ref();
				/* #option?=sub */Term sub_470 = sub_162.sub(1).ref();
				if (sub_470.descriptor() != _M_Crsx_xpattern)
				{
					break label_68;
				}
				Term sub_423 = sub_470.sub(0).ref();
				/* #properties?=sub */Term sub_392 = sub_470.sub(1).ref();
				/* #constructor=sub */Term sub_312 = sub_470.sub(2).ref();
				/* #arguments?=sub */Term sub_428 = sub_162.sub(2).ref();
				Term sub_447 = sub_162.sub(3).ref();
				/* #contractum=sub */
				/* #=term *//*Contract*/sink.properties(safeRef(props_26));
				sink.start(_M_AddRule);
				sink.start(_M_RulesKey);
				sink.copy(sub_392.ref());
				sink.end();
				sink.start(_M_Crsx_xruleDeclaration);
				sink.copy(sub_328.ref());
				sink.start(_M_Crsx_xpattern);
				sink.copy(sub_423.ref());
				sink.copy(sub_392.ref());
				sink.copy(sub_312.ref());
				sink.end();
				sink.literal("\u2192");
				sink.copy(sub_447.ref());
				sink.end();
				Variable var_31 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_31});
				VariableUse use_21 = sink.context().makeVariableUse(var_31);
				sink.substitute(term_9.ref(), new Variable[]
					{var_13}, new Term[]
					{use_21});
				sink.end();
				return true;
			}
			label_42 :
			{
				if (term_189.descriptor() != _M_Crsx_xdeclaration_xA4)
				{
					break label_42;
				}
				Term sub_156 = term_189.sub(0).ref();
				if (sub_156.descriptor() != _M_Crsx_xsortDeclaration_xA1)
				{
					break label_42;
				}
				Term sub_269 = sub_156.sub(0).ref();
				/* #sortparams?=sub */Term sub_338 = sub_156.sub(1).ref();
				/* #sortset=sub */Term sub_183 = sub_156.sub(2).ref();
				/* #sortname=sub */Term sub_125 = sub_156.sub(3).ref();
				Term sub_252 = sub_156.sub(4).ref();
				Term sub_489 = sub_156.sub(5).ref();
				/* #forms=sub */Term sub_322 = sub_156.sub(6).ref();
				/* #=term *//*Contract*/sink.properties(safeRef(props_26));
				sink.start(_M_AddDataSort);
				sink.start(_M_Crsx_xsortDeclaration_xA1);
				sink.copy(sub_269.ref());
				sink.copy(sub_338.ref());
				sink.copy(sub_183.ref());
				sink.literal("::=");
				sink.literal("(");
				sink.copy(sub_489.ref());
				sink.literal(")");
				sink.end();
				Variable var_89 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_89});
				VariableUse use_61 = sink.context().makeVariableUse(var_89);
				sink.substitute(term_9.ref(), new Variable[]
					{var_13}, new Term[]
					{use_61});
				sink.end();
				return true;
			}
			label_140 :
			{
				if (term_189.descriptor() != _M_Crsx_xdeclaration_xA4)
				{
					break label_140;
				}
				Term sub_332 = term_189.sub(0).ref();
				if (sub_332.descriptor() != _M_Crsx_xsortDeclaration_xA2)
				{
					break label_140;
				}
				Term sub_519 = sub_332.sub(0).ref();
				/* #sortparams?=sub */Term sub_369 = sub_332.sub(1).ref();
				/* #sortset=sub */Term sub_507 = sub_332.sub(2).ref();
				if (sub_507.descriptor() != _M_Crsx_xform_xA1)
				{
					break label_140;
				}
				Term sub_265 = sub_507.sub(0).ref();
				/* #constructor=sub */Term sub_406 = sub_507.sub(1).ref();
				/* #arguments?=sub */Term sub_260 = sub_332.sub(3).ref();
				Term sub_231 = sub_332.sub(4).ref();
				/* #sortname=sub */
				/* #=term *//*Contract*/sink.properties(safeRef(props_26));
				sink.start(_M_AddFuncSort);
				sink.start(_M_Crsx_xsortDeclaration_xA2);
				sink.copy(sub_519.ref());
				sink.copy(sub_369.ref());
				sink.start(_M_Crsx_xform_xA1);
				sink.copy(sub_265.ref());
				sink.copy(sub_406.ref());
				sink.end();
				sink.literal("::");
				sink.copy(sub_231.ref());
				sink.end();
				Variable var_48 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_48});
				VariableUse use_90 = sink.context().makeVariableUse(var_48);
				sink.substitute(term_9.ref(), new Variable[]
					{var_13}, new Term[]
					{use_90});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_N1Declaration, props_26, term_189, var_13, term_9);
	}

	final public static boolean _M_N1Declarations1(Sink sink, int shared, int depth, Properties props_14, Term term_97, Term term_190, Variable var_33, Term term_117)
	{
		if (depth < 2000)
		{
			label_6 :
			{
				if (term_97.descriptor() != _M_OK)
				{
					break label_6;
				}
				if (term_190.descriptor() != _M__sNil)
				{
					break label_6;
				}
				/* #=term *//*Contract*/sink.properties(safeRef(props_14));
				Term term_167;
				{
					BufferSink buf_60 = sink.context().makeBuffer();
					buf_60.start(_M_OK);
					buf_60.end();
					term_167 = buf_60.term();
				}
				sink.substitute(term_117.ref(), new Variable[]
					{var_33}, new Term[]
					{term_167});
				return true;
			}
			label_2 :
			{
				if (term_97.descriptor() != _M_OK)
				{
					break label_2;
				}
				if (term_190.descriptor() != _M__sCons)
				{
					break label_2;
				}
				Term sub_105 = term_190.sub(0).ref();
				if (sub_105.descriptor() != _M_Crsx_xdeclarations_xS1)
				{
					break label_2;
				}
				Term sub_299 = sub_105.sub(0).ref();
				Term sub_370 = sub_105.sub(1).ref();
				if (sub_370.descriptor() != _M__sNil)
				{
					break label_2;
				}
				Term sub_135 = term_190.sub(1).ref();
				if (sub_135.descriptor() != _M__sNil)
				{
					break label_2;
				}
				/* #=term *//*Contract*/sink.properties(safeRef(props_14));
				Term term_68;
				{
					BufferSink buf_52 = sink.context().makeBuffer();
					buf_52.start(_M_OK);
					buf_52.end();
					term_68 = buf_52.term();
				}
				sink.substitute(term_117.ref(), new Variable[]
					{var_33}, new Term[]
					{term_68});
				return true;
			}
			label_79 :
			{
				if (term_97.descriptor() != _M_OK)
				{
					break label_79;
				}
				if (term_190.descriptor() != _M__sCons)
				{
					break label_79;
				}
				Term sub_296 = term_190.sub(0).ref();
				if (sub_296.descriptor() != _M_Crsx_xdeclarations_xS1)
				{
					break label_79;
				}
				Term sub_224 = sub_296.sub(0).ref();
				Term sub_186 = sub_296.sub(1).ref();
				if (sub_186.descriptor() != _M__sCons)
				{
					break label_79;
				}
				Term sub_404 = sub_186.sub(0).ref();
				/* #declaration=sub */Term sub_394 = sub_186.sub(1).ref();
				if (sub_394.descriptor() != _M__sNil)
				{
					break label_79;
				}
				Term sub_320 = term_190.sub(1).ref();
				/* #declarations_S1*=sub */
				/* #=term *//*Contract*/sink.properties(safeRef(props_14));
				sink.start(_M_N1Declaration);
				sink.copy(sub_404.ref());
				Variable var_131 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_131});
				sink.start(_M_N1Declarations1);
				sink.use(var_131);
				sink.copy(sub_320.ref());
				Variable var_103 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_103});
				VariableUse use_79 = sink.context().makeVariableUse(var_103);
				sink.substitute(term_117.ref(), new Variable[]
					{var_33}, new Term[]
					{use_79});
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_N1Declarations1, props_14, term_97, term_190, var_33, term_117);
	}

	final public static boolean _M_N1Declarations(Sink sink, int shared, int depth, Term term_22, Term term_57, Variable var_20, Term term_198)
	{
		if (depth < 2000)
		{
			label_54 :
			{
				/* #qualifier=term */
				/* #declarations=term */
				/* #=term *//*Contract*/Term term_36;
				{
					BufferSink buf_70 = sink.context().makeBuffer();
					buf_70.start(_M_STR);
					buf_70.copy(term_22.ref());
					buf_70.end();
					term_36 = buf_70.term();
				}
				sink.propertyNamed("$qualifier", term_36);
				Term term_143;
				{
					BufferSink buf_75 = sink.context().makeBuffer();
					buf_75.start(_M_KEYS);
					buf_75.start(_M__sNil);
					buf_75.end();
					buf_75.end();
					term_143 = buf_75.term();
				}
				sink.propertyNamed("$rulekeys", term_143);
				Term term_247;
				{
					BufferSink buf_5 = sink.context().makeBuffer();
					buf_5.start(_M_KEYS);
					buf_5.start(_M__sNil);
					buf_5.end();
					buf_5.end();
					term_247 = buf_5.term();
				}
				sink.propertyNamed("$datakeys", term_247);
				Term term_27;
				{
					BufferSink buf_74 = sink.context().makeBuffer();
					buf_74.start(_M_KEYS);
					buf_74.start(_M__sNil);
					buf_74.end();
					buf_74.end();
					term_27 = buf_74.term();
				}
				sink.propertyNamed("$funckeys", term_27);
				Term term_151;
				{
					BufferSink buf_20 = sink.context().makeBuffer();
					buf_20.start(_M_IMPORTS);
					buf_20.start(_M__sNil);
					buf_20.end();
					buf_20.end();
					term_151 = buf_20.term();
				}
				sink.propertyNamed("$imported", term_151);
				Term term_49;
				{
					BufferSink buf_30 = sink.context().makeBuffer();
					buf_30.start(_M_IMPORTS);
					buf_30.start(_M__sNil);
					buf_30.end();
					buf_30.end();
					term_49 = buf_30.term();
				}
				sink.propertyNamed("$grammars", term_49);
				sink.start(_M_N1Declarations1);
				sink.start(_M_OK);
				sink.end();
				sink.copy(term_57.ref());
				Variable var_91 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_91});
				VariableUse use_162 = sink.context().makeVariableUse(var_91);
				sink.substitute(term_198.ref(), new Variable[]
					{var_20}, new Term[]
					{use_162});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_N1Declarations, term_22, term_57, var_20, term_198);
	}

	final public static boolean _M_NormalizeToState(Sink sink, int shared, int depth, Term term_136, Term term_115)
	{
		if (depth < 2000)
		{
			label_50 :
			{
				/* #filename=term */
				if (term_115.descriptor() != _M_Crsx_xcrsx)
				{
					break label_50;
				}
				Term sub_248 = term_115.sub(0).ref();
				/* #declarations=sub *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sTrace);
				sink.end();
				sink.start(_M__s);
				sink.start(_M_Builtin_sColon);
				sink.end();
				sink.literal("Normalize ");
				sink.copy(term_136.ref());
				sink.end();
				sink.start(_M_N1Declarations);
				sink.start(_M_BaseName);
				sink.copy(term_136.ref());
				sink.end();
				sink.start(_M_DesugarDeclarations);
				sink.copy(sub_248.ref());
				sink.end();
				Variable var_18 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_18});
				sink.start(_M_N2);
				sink.use(var_18);
				Variable var_84 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_84});
				sink.start(_M_LOADED);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_NormalizeToState, term_136, term_115);
	}

	final public static boolean _M_NormalizeToCrsx(Sink sink, int shared, int depth, Term term_161, Term term_31)
	{
		if (depth < 2000)
		{
			label_41 :
			{
				/* #filename=term */
				if (term_31.descriptor() != _M_Crsx_xcrsx)
				{
					break label_41;
				}
				Term sub_340 = term_31.sub(0).ref();
				/* #declarations=sub *//*Contract*/
				sink.start(_M_N1Declarations);
				sink.start(_M_BaseName);
				sink.copy(term_161.ref());
				sink.end();
				sink.start(_M_DesugarDeclarations);
				sink.copy(sub_340.ref());
				sink.end();
				Variable var_5 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_5});
				sink.start(_M_N2);
				sink.use(var_5);
				Variable var_9 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_9});
				sink.start(_M_OutputCrsx);
				sink.use(var_9);
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_NormalizeToCrsx, term_161, term_31);
	}
	private static boolean initialized = false;

	public static void init(Context context)
	{
		if (!initialized)
		{
			org.crsx.compiler.parser.Crsx.init(context);
			org.crsx.compiler.State.init(context);
			org.crsx.compiler.Crsxutils.init(context);
			org.crsx.compiler.std.Core.init(context);
			org.crsx.compiler.std.String.init(context);
			org.crsx.compiler.std.List.init(context);
			org.crsx.compiler.std.Num.init(context);
			org.crsx.compiler.std.Path.init(context);
			context.registerParser("org.crsx.parser.CrsxMetaParser");
			context.register(_M_NormalizeDispatchCases);
			context.register(_M_NormalizeDispatch);
			context.register(_M_NormalizeConcrete);
			context.register(_M_NormalizeFreeTerms);
			context.register(_M_NormalizeFreeArgumentsOpt);
			context.register(_M_MakeBuiltin);
			context.register(_M_NormalizeConstructor);
			context.register(_M_NormalizeFreeTerm);
			context.register(_M_NormalizeNextBinder);
			context.register(_M_NormalizeTerm);
			context.register(_M_NormalizeTerms);
			context.register(_M_NormalizeArgumentsOpt);
			context.register(_M_NormalizeProperties);
			context.register(_M_NormalizePropertiesOpt);
			context.register(_M_NormalizeRule);
			context.register(_M_NormalizeRules);
			context.register(_M_NormalizeRuleKey1);
			context.register(_M_NormalizeRuleKey);
			context.register(_M_DispatchCases);
			context.register(_M_DispatchMetaArgsOpt);
			context.register(_M_DispatchPatternNextBinder);
			context.register(_M_DispatchPatternBinder);
			context.register(_M_DispatchPatternFreeTerm);
			context.register(_M_DispatchPatternTerm);
			context.register(_M_DispatchPatternArgs);
			context.register(_M_DispatchProperties);
			context.register(_M_Dispatch);
			context.register(_M_GroupRule);
			context.register(_M_MayGroupRule2);
			context.register(_M_MayGroupRule1);
			context.register(_M_MayGroupRule);
			context.register(_M_N2Rule);
			context.register(_M_N2Rules);
			context.register(_M_N2);
			context.register(_M_N1ImportDirective);
			context.register(_M_N1ImportDirectives);
			context.register(_M_N1Import);
			context.register(_M_N1DirectiveConstructor);
			context.register(_M_N1Directive);
			context.register(_M_N1Declaration);
			context.register(_M_N1Declarations1);
			context.register(_M_N1Declarations);
			context.register(_M_NormalizeToState);
			context.register(_M_NormalizeToCrsx);
			initialized = true;
		}
	}

	/* END MODULE « "normalizer.crs.java" » */
}