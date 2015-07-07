/* START MODULE /Users/villardl/Projects/crsx/crsx4/src/normalizer.crs.java */
/** Generated File */package org.crsx.compiler;
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
import static org.crsx.compiler.std.Num.*; import static org.crsx.compiler.std.Path.*;

public class Normalizer
{
  final public static DynamicFunctionDescriptor _M_NormalizeDispatchCases = makeFunction("NormalizeDispatchCases", Normalizer.class, "_M_NormalizeDispatchCases");
  final public static DynamicFunctionDescriptor _M_NormalizeDispatch = makeFunction("NormalizeDispatch", Normalizer.class, "_M_NormalizeDispatch");
  final public static DynamicFunctionDescriptor _M_NormalizeConcrete = makeFunction("NormalizeConcrete", Normalizer.class, "_M_NormalizeConcrete");
  final public static DynamicFunctionDescriptor _M_NormalizeFreeTerms = makeFunction("NormalizeFreeTerms", Normalizer.class, "_M_NormalizeFreeTerms");
  final public static DynamicFunctionDescriptor _M_NormalizeFreeArgumentsOpt = makeFunction("NormalizeFreeArgumentsOpt", Normalizer.class, "_M_NormalizeFreeArgumentsOpt");
  final public static DynamicFunctionDescriptor _M_MakeBuiltin = makeFunction("MakeBuiltin", Normalizer.class, "_M_MakeBuiltin");
  final public static DynamicFunctionDescriptor _M_NormalizeConstructor = makeFunction("NormalizeConstructor", Normalizer.class, "_M_NormalizeConstructor");
  final public static DynamicFunctionDescriptor _M_NormalizeFreeTerm = makeFunction("NormalizeFreeTerm", Normalizer.class, "_M_NormalizeFreeTerm");
  final public static DynamicFunctionDescriptor _M_NormalizeNextBinder = makeFunction("NormalizeNextBinder", Normalizer.class, "_M_NormalizeNextBinder");
  final public static DynamicFunctionDescriptor _M_NormalizeTerm = makeFunction("NormalizeTerm", Normalizer.class, "_M_NormalizeTerm");
  final public static DynamicFunctionDescriptor _M_NormalizeTerms = makeFunction("NormalizeTerms", Normalizer.class, "_M_NormalizeTerms");
  final public static DynamicFunctionDescriptor _M_NormalizeArgumentsOpt = makeFunction("NormalizeArgumentsOpt", Normalizer.class, "_M_NormalizeArgumentsOpt");
  final public static DynamicFunctionDescriptor _M_NormalizeProperties = makeFunction("NormalizeProperties", Normalizer.class, "_M_NormalizeProperties");
  final public static DynamicFunctionDescriptor _M_NormalizePropertiesOpt = makeFunction("NormalizePropertiesOpt", Normalizer.class, "_M_NormalizePropertiesOpt");
  final public static DynamicFunctionDescriptor _M_NormalizeRule = makeFunction("NormalizeRule", Normalizer.class, "_M_NormalizeRule");
  final public static DynamicFunctionDescriptor _M_NormalizeRules = makeFunction("NormalizeRules", Normalizer.class, "_M_NormalizeRules");
  final public static DynamicFunctionDescriptor _M_NormalizeRuleKey1 = makeFunction("NormalizeRuleKey1", Normalizer.class, "_M_NormalizeRuleKey1");
  final public static DynamicFunctionDescriptor _M_NormalizeRuleKey = makeFunction("NormalizeRuleKey", Normalizer.class, "_M_NormalizeRuleKey");
  final public static DynamicFunctionDescriptor _M_DispatchCases = makeFunction("DispatchCases", Normalizer.class, "_M_DispatchCases");
  final public static DynamicFunctionDescriptor _M_DispatchMetaArgsOpt = makeFunction("DispatchMetaArgsOpt", Normalizer.class, "_M_DispatchMetaArgsOpt");
  final public static DynamicFunctionDescriptor _M_DispatchPatternNextBinder = makeFunction("DispatchPatternNextBinder", Normalizer.class, "_M_DispatchPatternNextBinder");
  final public static DynamicFunctionDescriptor _M_DispatchPatternBinder = makeFunction("DispatchPatternBinder", Normalizer.class, "_M_DispatchPatternBinder");
  final public static DynamicFunctionDescriptor _M_DispatchPatternFreeTerm = makeFunction("DispatchPatternFreeTerm", Normalizer.class, "_M_DispatchPatternFreeTerm");
  final public static DynamicFunctionDescriptor _M_DispatchPatternTerm = makeFunction("DispatchPatternTerm", Normalizer.class, "_M_DispatchPatternTerm");
  final public static DynamicFunctionDescriptor _M_DispatchPatternArgs = makeFunction("DispatchPatternArgs", Normalizer.class, "_M_DispatchPatternArgs");
  final public static DynamicFunctionDescriptor _M_DispatchProperties = makeFunction("DispatchProperties", Normalizer.class, "_M_DispatchProperties");
  final public static DynamicFunctionDescriptor _M_Dispatch = makeFunction("Dispatch", Normalizer.class, "_M_Dispatch");
  final public static DynamicFunctionDescriptor _M_GroupRule = makeFunction("GroupRule", Normalizer.class, "_M_GroupRule");
  final public static DynamicFunctionDescriptor _M_MayGroupRule2 = makeFunction("MayGroupRule2", Normalizer.class, "_M_MayGroupRule2");
  final public static DynamicFunctionDescriptor _M_MayGroupRule1 = makeFunction("MayGroupRule1", Normalizer.class, "_M_MayGroupRule1");
  final public static DynamicFunctionDescriptor _M_MayGroupRule = makeFunction("MayGroupRule", Normalizer.class, "_M_MayGroupRule");
  final public static DynamicFunctionDescriptor _M_N2Rule = makeFunction("N2Rule", Normalizer.class, "_M_N2Rule");
  final public static DynamicFunctionDescriptor _M_N2Rules = makeFunction("N2Rules", Normalizer.class, "_M_N2Rules");
  final public static DynamicFunctionDescriptor _M_N2 = makeFunction("N2", Normalizer.class, "_M_N2");
  final public static DynamicFunctionDescriptor _M_N1ImportDirective = makeFunction("N1ImportDirective", Normalizer.class, "_M_N1ImportDirective");
  final public static DynamicFunctionDescriptor _M_N1ImportDirectives = makeFunction("N1ImportDirectives", Normalizer.class, "_M_N1ImportDirectives");
  final public static DynamicFunctionDescriptor _M_N1Import = makeFunction("N1Import", Normalizer.class, "_M_N1Import");
  final public static DynamicFunctionDescriptor _M_N1DirectiveConstructor = makeFunction("N1DirectiveConstructor", Normalizer.class, "_M_N1DirectiveConstructor");
  final public static DynamicFunctionDescriptor _M_N1Directive = makeFunction("N1Directive", Normalizer.class, "_M_N1Directive");
  final public static DynamicFunctionDescriptor _M_N1Declaration = makeFunction("N1Declaration", Normalizer.class, "_M_N1Declaration");
  final public static DynamicFunctionDescriptor _M_N1Declarations1 = makeFunction("N1Declarations1", Normalizer.class, "_M_N1Declarations1");
  final public static DynamicFunctionDescriptor _M_N1Declarations = makeFunction("N1Declarations", Normalizer.class, "_M_N1Declarations");
  final public static DynamicFunctionDescriptor _M_N1DeclarationsInit = makeFunction("N1DeclarationsInit", Normalizer.class, "_M_N1DeclarationsInit");
  final public static DynamicFunctionDescriptor _M_NormalizeToState = makeFunction("NormalizeToState", Normalizer.class, "_M_NormalizeToState");
  final public static DynamicFunctionDescriptor _M_NormalizeToCrsx = makeFunction("NormalizeToCrsx", Normalizer.class, "_M_NormalizeToCrsx");final public static boolean _M_NormalizeDispatchCases(Sink sink, int shared, int depth, Properties props, Term term) {
    if (depth < 2000) {
      label: {
        if (term.descriptor() != _M__sNil)
        {   break label;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_99: {
        if (term.descriptor() != _M__sCons)
        {   break label_99;
        }Term sub = term.sub(0).ref();
        if (sub.descriptor() != _M_Crsx_xdispatchCases_xS1)
        {   break label_99;
        }Term sub_71 = sub.sub(0).ref();Term sub_46 = sub.sub(1).ref();
        if (sub_46.descriptor() != _M_Crsx_xdispatchCase)
        {   break label_99;
        }Term sub_29 = sub_46.sub(0).ref();
        /* #ruleDeclaration=sub */Term sub_74 = term.sub(1).ref();
        /* #dispatchCases_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdispatchCases_xS1); sink.literal(";");
        sink.start(_M_Crsx_xdispatchCase);sink.properties(safeRef(props));
        sink.start(_M_NormalizeRule); sink.copy(sub_29.ref());
        sink.end();
        sink.end();
        sink.end();sink.properties(safeRef(props));
        sink.start(_M_NormalizeDispatchCases); sink.copy(sub_74.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeDispatchCases, props, term);
  } final public static boolean _M_NormalizeDispatch(Sink sink, int shared, int depth, Properties props_69, Term term_77) {
    if (depth < 2000) {
      label_59: {
        if (term_77.descriptor() != _M_Crsx_xdispatch)
        {   break label_59;
        }Term sub_45 = term_77.sub(0).ref();Term sub_31 = term_77.sub(1).ref();
        if (sub_31.descriptor() != _M_Crsx_xdispatchTerm)
        {   break label_59;
        }Term sub_84 = sub_31.sub(0).ref();
        /* #freeTerm=sub */Term sub_28 = term_77.sub(2).ref();
        /* #dispatchCases=sub */Term sub_94 = term_77.sub(3).ref();
        /* #delayCase?=sub *//*Contract*/
        sink.start(_M_Crsx_xdispatch); sink.literal("dispatch");
        sink.start(_M_Crsx_xdispatchTerm);sink.properties(safeRef(props_69));
        sink.start(_M_NormalizeFreeTerm); sink.copy(sub_84.ref());
        sink.end();
        sink.end();
        sink.start(_M_SugarDispatchCases);sink.properties(safeRef(props_69));
        sink.start(_M_NormalizeDispatchCases);
        sink.start(_M_DesugarDispatchCases); sink.copy(sub_28.ref());
        sink.end();
        sink.end();
        sink.end(); sink.copy(sub_94.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeDispatch, props_69, term_77);
  } final public static boolean _M_NormalizeConcrete(Sink sink, int shared, int depth, Properties props_52, Term term_3) {
    if (depth < 2000) {
      label_90: {
        if (term_3.descriptor() != _M_Crsx_xconcrete_xA1)
        {   break label_90;
        }Term sub_96 = term_3.sub(0).ref();
        /* #CATEGORY=sub */Term sub_42 = term_3.sub(1).ref();
        /* #CONCRETE=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sTrace); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("Parse concrete1 "); sink.copy(sub_42.ref());
        sink.end();sink.properties(safeRef(props_52));
        sink.start(_M_NormalizeFreeTerm);
        sink.start(_M_ParseToTerm); sink.literal("freeTerm");
        sink.start(_M_ParseToString);
        sink.start(_M_RemoveFirstChar); sink.copy(sub_96.ref());
        sink.end();
        sink.start(_M_RemoveFirstChar);
        sink.start(_M_RemoveLastChar); sink.copy(sub_42.ref());
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeConcrete, props_52, term_3);
  } final public static boolean _M_NormalizeFreeTerms(Sink sink, int shared, int depth, Properties props_15, Term term_84) {
    if (depth < 2000) {
      label_17: {
        if (term_84.descriptor() != _M__sNil)
        {   break label_17;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_86: {
        if (term_84.descriptor() != _M__sCons)
        {   break label_86;
        }Term sub_17 = term_84.sub(0).ref();
        if (sub_17.descriptor() != _M_Crsx_xfreeTerms_xS1)
        {   break label_86;
        }Term sub_12 = sub_17.sub(0).ref();Term sub_85 = sub_17.sub(1).ref();
        /* #freeTerm=sub */Term sub_144 = term_84.sub(1).ref();
        /* #freeTerms_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeTerms_xS1); sink.literal(",");sink.properties(safeRef(props_15));
        sink.start(_M_NormalizeFreeTerm); sink.copy(sub_85.ref());
        sink.end();
        sink.end();sink.properties(safeRef(props_15));
        sink.start(_M_NormalizeFreeTerms); sink.copy(sub_144.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeFreeTerms, props_15, term_84);
  } final public static boolean _M_NormalizeFreeArgumentsOpt(Sink sink, int shared, int depth, Properties props_11, Term term_55) {
    if (depth < 2000) {
      label_67: {
        if (term_55.descriptor() != _M__sNil)
        {   break label_67;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_41: {
        if (term_55.descriptor() != _M__sCons)
        {   break label_41;
        }Term sub_48 = term_55.sub(0).ref();
        if (sub_48.descriptor() != _M_Crsx_xfreeArguments)
        {   break label_41;
        }Term sub_32 = sub_48.sub(0).ref();Term sub_8 = sub_48.sub(1).ref();
        if (sub_8.descriptor() != _M__sNil)
        {   break label_41;
        }Term sub_95 = sub_48.sub(2).ref();Term sub_57 = term_55.sub(1).ref();
        if (sub_57.descriptor() != _M__sNil)
        {   break label_41;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_25: {
        if (term_55.descriptor() != _M__sCons)
        {   break label_25;
        }Term sub_5 = term_55.sub(0).ref();
        if (sub_5.descriptor() != _M_Crsx_xfreeArguments)
        {   break label_25;
        }Term sub_15 = sub_5.sub(0).ref();Term sub_98 = sub_5.sub(1).ref();
        if (sub_98.descriptor() != _M__sCons)
        {   break label_25;
        }Term sub_39 = sub_98.sub(0).ref();
        /* #freeTerms=sub */Term sub_64 = sub_98.sub(1).ref();
        if (sub_64.descriptor() != _M__sNil)
        {   break label_25;
        }Term sub_43 = sub_5.sub(2).ref();Term sub_7 = term_55.sub(1).ref();
        if (sub_7.descriptor() != _M__sNil)
        {   break label_25;
        }/*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeArguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_SugarFreeTerms);
        sink.start(_M_NormalizeFreeTerms);
        sink.start(_M_DesugarFreeTerms); sink.copy(sub_39.ref());
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeFreeArgumentsOpt, props_11, term_55);
  } final public static boolean _M_MakeBuiltin(Sink sink, int shared, int depth, Term term_79) {
    if (depth < 2000) {
      label_16: {
        if (term_79.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_16;
        }Term sub_41 = term_79.sub(0).ref();
        if (sub_41.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_16;
        }Term sub_173 = term_79.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("Builtin$"); sink.copy(sub_173.ref());
        sink.end();
        sink.end(); return true;
      }
      label_84: {
        if (term_79.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_84;
        }Term sub_53 = term_79.sub(0).ref();
        if (sub_53.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_84;
        }Term sub_66 = sub_53.sub(0).ref();/*Contract*/
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.literal("Builtin$Colon");
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_MakeBuiltin, term_79);
  } final public static boolean _M_NormalizeConstructor(Sink sink, int shared, int depth, Properties props_70, Term term_14, Term term_46, Term term_66, Term term_80, Term term_16) {
    if (depth < 2000) {
      label_28: {
        if (term_14.descriptor() != _M_TRUE)
        {   break label_28;
        }
        /* #annotations?=term */
        /* #properties?2=term */
        /* #constructor=term */
        if (term_16.descriptor() != _M__sCons)
        {   break label_28;
        }Term sub_62 = term_16.sub(0).ref();
        if (sub_62.descriptor() != _M_Crsx_xarguments)
        {   break label_28;
        }Term sub_92 = sub_62.sub(0).ref();Term sub_37 = sub_62.sub(1).ref();
        if (sub_37.descriptor() != _M__sCons)
        {   break label_28;
        }Term sub_13 = sub_37.sub(0).ref();
        if (sub_13.descriptor() != _M_Crsx_xterms)
        {   break label_28;
        }Term sub_70 = sub_13.sub(0).ref();
        if (sub_70.descriptor() != _M_Crsx_xterm_xA1)
        {   break label_28;
        }Term sub_47 = sub_70.sub(0).ref();
        if (sub_47.descriptor() != _M_Crsx_xfreeTerm_xA1)
        {   break label_28;
        }Term sub_51 = sub_47.sub(0).ref();
        if (sub_51.descriptor() != _M__sNil)
        {   break label_28;
        }Term sub_115 = sub_47.sub(1).ref();
        /* #properties?=sub */Term sub_65 = sub_47.sub(2).ref();
        /* #constructor2=sub */Term sub_152 = sub_47.sub(3).ref();
        if (sub_152.descriptor() != _M__sNil)
        {   break label_28;
        }Term sub_140 = sub_13.sub(1).ref();
        /* #terms_S1*=sub */Term sub_61 = sub_37.sub(1).ref();
        if (sub_61.descriptor() != _M__sNil)
        {   break label_28;
        }Term sub_4 = sub_62.sub(2).ref();Term sub_1 = term_16.sub(1).ref();
        if (sub_1.descriptor() != _M__sNil)
        {   break label_28;
        }/*Contract*/sink.properties(safeRef(props_70));
        sink.start(_M_NormalizeConstructor); sink.start(_M_FALSE); sink.end(); sink.copy(term_46.ref()); sink.copy(term_66.ref()); sink.copy(term_80.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms);
        sink.start(_M_Crsx_xterm_xA1);
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.start(_M__sNil); sink.end(); sink.copy(sub_115.ref());
        sink.start(_M_MakeBuiltin); sink.copy(sub_65.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.copy(sub_140.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_97: {
        if (term_14.descriptor() != _M_FALSE)
        {   break label_97;
        }
        /* #annotations?=term */
        /* #properties?=term */
        /* #constructor=term */
        /* #arguments?=term *//*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.copy(term_46.ref());sink.properties(safeRef(props_70));
        sink.start(_M_NormalizePropertiesOpt); sink.copy(term_66.ref());
        sink.end(); sink.copy(term_80.ref());sink.properties(safeRef(props_70));
        sink.start(_M_NormalizeArgumentsOpt); sink.copy(term_16.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeConstructor, props_70, term_14, term_46, term_66, term_80, term_16);
  }     final public static boolean _M_NormalizeFreeTerm(Sink sink, int shared, int depth, Properties props_28, Term term_6) {
    if (depth < 2000) {
      label_18: {
        if (term_6.descriptor() != _M_Crsx_xfreeTerm_xA1)
        {   break label_18;
        }Term sub_73 = term_6.sub(0).ref();
        /* #annotations?=sub */Term sub_55 = term_6.sub(1).ref();
        /* #properties?=sub */Term sub_25 = term_6.sub(2).ref();
        /* #constructor=sub */Term sub_56 = term_6.sub(3).ref();
        /* #arguments?=sub *//*Contract*/sink.properties(safeRef(props_28));
        sink.start(_M_NormalizeConstructor);
        sink.start(_M_IsPrimitive); sink.copy(sub_25.ref());
        sink.end(); sink.copy(sub_73.ref()); sink.copy(sub_55.ref()); sink.copy(sub_25.ref()); sink.copy(sub_56.ref());
        sink.end(); return true;
      }
      label_74: {
        if (term_6.descriptor() != _M_Crsx_xfreeTerm_xA2)
        {   break label_74;
        }Term sub_265 = term_6.sub(0).ref();
        /* #annotations?=sub */Term sub_86 = term_6.sub(1).ref();
        /* #properties?=sub */Term sub_126 = term_6.sub(2).ref();
        /* #constructor=sub */Term sub_80 = term_6.sub(3).ref();
        /* #term=sub *//*Contract*/sink.properties(safeRef(props_28));
        sink.start(_M_NormalizeFreeTerm);
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.copy(sub_265.ref()); sink.copy(sub_86.ref()); sink.copy(sub_126.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms); sink.copy(sub_80.ref()); sink.start(_M__sNil); sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_54: {
        if (term_6.descriptor() != _M_Crsx_xfreeTerm_xA3)
        {   break label_54;
        }Term sub_38 = term_6.sub(0).ref();
        /* #annotations?=sub */Term sub_44 = term_6.sub(1).ref();
        /* #properties?=sub */Term sub_139 = term_6.sub(2).ref();
        /* #literal=sub *//*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA3); sink.copy(sub_38.ref());sink.properties(safeRef(props_28));
        sink.start(_M_NormalizePropertiesOpt); sink.copy(sub_44.ref());
        sink.end(); sink.copy(sub_139.ref());
        sink.end(); return true;
      }
      label_20: {
        if (term_6.descriptor() != _M_Crsx_xfreeTerm_xA4)
        {   break label_20;
        }Term sub_63 = term_6.sub(0).ref();
        /* #annotations?=sub */Term sub_177 = term_6.sub(1).ref();
        /* #list=sub *//*Contract*/sink.properties(safeRef(props_28));
        sink.start(_M_NormalizeFreeTerm);
        sink.start(_M_DesugarList); sink.copy(sub_177.ref());
        sink.end();
        sink.end(); return true;
      }
      label_7: {
        if (term_6.descriptor() != _M_Crsx_xfreeTerm_xA5)
        {   break label_7;
        }Term sub_20 = term_6.sub(0).ref();
        /* #annotations?=sub */Term sub_138 = term_6.sub(1).ref();
        /* #variable=sub *//*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA5); sink.copy(sub_20.ref()); sink.copy(sub_138.ref());
        sink.end(); return true;
      }
      label_87: {
        if (term_6.descriptor() != _M_Crsx_xfreeTerm_xA6)
        {   break label_87;
        }Term sub_131 = term_6.sub(0).ref();
        /* #annotations?=sub */Term sub_111 = term_6.sub(1).ref();
        if (sub_111.descriptor() != _M_Crsx_xproperties)
        {   break label_87;
        }Term sub_67 = sub_111.sub(0).ref();Term sub_26 = sub_111.sub(1).ref();
        if (sub_26.descriptor() != _M__sCons)
        {   break label_87;
        }Term sub_59 = sub_26.sub(0).ref();
        /* #propertyList=sub */Term sub_102 = sub_26.sub(1).ref();
        if (sub_102.descriptor() != _M__sNil)
        {   break label_87;
        }Term sub_33 = sub_111.sub(2).ref();/*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA6); sink.copy(sub_131.ref());
        sink.start(_M_Crsx_xproperties); sink.literal("{");
        sink.start(_M__sCons);
        sink.start(_M_SugarPropertyList);sink.properties(safeRef(props_28));
        sink.start(_M_NormalizeProperties);
        sink.start(_M_DesugarPropertyList); sink.copy(sub_59.ref());
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("}");
        sink.end();
        sink.end(); return true;
      }
      label_21: {
        if (term_6.descriptor() != _M_Crsx_xfreeTerm_xA7)
        {   break label_21;
        }Term sub_171 = term_6.sub(0).ref();
        /* #annotations?=sub */Term sub_27 = term_6.sub(1).ref();
        /* #properties?=sub */Term sub_76 = term_6.sub(2).ref();
        /* #METAVAR=sub */Term sub_36 = term_6.sub(3).ref();
        /* #freeArguments?=sub *//*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA7); sink.copy(sub_171.ref());sink.properties(safeRef(props_28));
        sink.start(_M_NormalizePropertiesOpt); sink.copy(sub_27.ref());
        sink.end(); sink.copy(sub_76.ref());sink.properties(safeRef(props_28));
        sink.start(_M_NormalizeFreeArgumentsOpt); sink.copy(sub_36.ref());
        sink.end();
        sink.end(); return true;
      }
      label_149: {
        if (term_6.descriptor() != _M_Crsx_xfreeTerm_xA8)
        {   break label_149;
        }Term sub_93 = term_6.sub(0).ref();
        /* #annotations?=sub */Term sub_75 = term_6.sub(1).ref();
        /* #concrete=sub *//*Contract*/sink.properties(safeRef(props_28));
        sink.start(_M_NormalizeConcrete); sink.copy(sub_75.ref());
        sink.end(); return true;
      }
      label_62: {
        if (term_6.descriptor() != _M_Crsx_xfreeTerm_xA9)
        {   break label_62;
        }Term sub_254 = term_6.sub(0).ref();
        /* #annotations?=sub */Term sub_284 = term_6.sub(1).ref();
        /* #properties?=sub */Term sub_151 = term_6.sub(2).ref();
        if (sub_151.descriptor() != _M_Crsx_xexpression)
        {   break label_62;
        }Term sub_89 = sub_151.sub(0).ref();
        /* #dispatch=sub *//*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA9); sink.copy(sub_254.ref());sink.properties(safeRef(props_28));
        sink.start(_M_NormalizePropertiesOpt); sink.copy(sub_284.ref());
        sink.end();
        sink.start(_M_Crsx_xexpression);sink.properties(safeRef(props_28));
        sink.start(_M_NormalizeDispatch); sink.copy(sub_89.ref());
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeFreeTerm, props_28, term_6);
  } final public static boolean _M_NormalizeNextBinder(Sink sink, int shared, int depth, Properties props_35, Term term_40) {
    if (depth < 2000) {
      label_88: {
        if (term_40.descriptor() != _M_Crsx_xnextBinder_xA1)
        {   break label_88;
        }Term sub_264 = term_40.sub(0).ref();
        /* #binder=sub */Term sub_11 = term_40.sub(1).ref();
        /* #nextBinder=sub *//*Contract*/
        sink.start(_M_Crsx_xnextBinder_xA1); sink.copy(sub_264.ref());sink.properties(safeRef(props_35));
        sink.start(_M_NormalizeNextBinder); sink.copy(sub_11.ref());
        sink.end();
        sink.end(); return true;
      }
      label_12: {
        if (term_40.descriptor() != _M_Crsx_xnextBinder_xA2)
        {   break label_12;
        }Term sub_224 = term_40.sub(0).ref();Term sub_218 = term_40.sub(1).ref();
        /* #freeTerm=sub *//*Contract*/
        sink.start(_M_Crsx_xnextBinder_xA2); sink.literal(".");sink.properties(safeRef(props_35));
        sink.start(_M_NormalizeFreeTerm); sink.copy(sub_218.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeNextBinder, props_35, term_40);
  } final public static boolean _M_NormalizeTerm(Sink sink, int shared, int depth, Properties props_25, Term term_11) {
    if (depth < 2000) {
      label_173: {
        if (term_11.descriptor() != _M_Crsx_xterm_xA1)
        {   break label_173;
        }Term sub_82 = term_11.sub(0).ref();
        /* #freeTerm=sub *//*Contract*/
        sink.start(_M_Crsx_xterm_xA1);sink.properties(safeRef(props_25));
        sink.start(_M_NormalizeFreeTerm); sink.copy(sub_82.ref());
        sink.end();
        sink.end(); return true;
      }
      label_3: {
        if (term_11.descriptor() != _M_Crsx_xterm_xA2)
        {   break label_3;
        }Term sub_58 = term_11.sub(0).ref();
        if (sub_58.descriptor() != _M_Crsx_xboundTerm)
        {   break label_3;
        }Term sub_49 = sub_58.sub(0).ref();
        /* #binder=sub */Term sub_16 = sub_58.sub(1).ref();
        /* #nextBinder=sub *//*Contract*/
        sink.start(_M_Crsx_xterm_xA2);
        sink.start(_M_Crsx_xboundTerm); sink.copy(sub_49.ref());sink.properties(safeRef(props_25));
        sink.start(_M_NormalizeNextBinder); sink.copy(sub_16.ref());
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeTerm, props_25, term_11);
  } final public static boolean _M_NormalizeTerms(Sink sink, int shared, int depth, Properties props_73, Term term_1) {
    if (depth < 2000) {
      label_30: {
        if (term_1.descriptor() != _M__sNil)
        {   break label_30;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_52: {
        if (term_1.descriptor() != _M__sCons)
        {   break label_52;
        }Term sub_114 = term_1.sub(0).ref();
        if (sub_114.descriptor() != _M_Crsx_xterms_xS1)
        {   break label_52;
        }Term sub_22 = sub_114.sub(0).ref();Term sub_83 = sub_114.sub(1).ref();
        /* #term=sub */Term sub_0 = term_1.sub(1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms_xS1); sink.literal(",");sink.properties(safeRef(props_73));
        sink.start(_M_NormalizeTerm); sink.copy(sub_83.ref());
        sink.end();
        sink.end();sink.properties(safeRef(props_73));
        sink.start(_M_NormalizeTerms); sink.copy(sub_0.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeTerms, props_73, term_1);
  } final public static boolean _M_NormalizeArgumentsOpt(Sink sink, int shared, int depth, Properties props_71, Term term_75) {
    if (depth < 2000) {
      label_8: {
        if (term_75.descriptor() != _M__sNil)
        {   break label_8;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_15: {
        if (term_75.descriptor() != _M__sCons)
        {   break label_15;
        }Term sub_21 = term_75.sub(0).ref();
        if (sub_21.descriptor() != _M_Crsx_xarguments)
        {   break label_15;
        }Term sub_72 = sub_21.sub(0).ref();Term sub_105 = sub_21.sub(1).ref();
        if (sub_105.descriptor() != _M__sNil)
        {   break label_15;
        }Term sub_6 = sub_21.sub(2).ref();Term sub_172 = term_75.sub(1).ref();
        if (sub_172.descriptor() != _M__sNil)
        {   break label_15;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_36: {
        if (term_75.descriptor() != _M__sCons)
        {   break label_36;
        }Term sub_18 = term_75.sub(0).ref();
        if (sub_18.descriptor() != _M_Crsx_xarguments)
        {   break label_36;
        }Term sub_103 = sub_18.sub(0).ref();Term sub_23 = sub_18.sub(1).ref();
        if (sub_23.descriptor() != _M__sCons)
        {   break label_36;
        }Term sub_147 = sub_23.sub(0).ref();
        /* #terms=sub */Term sub_24 = sub_23.sub(1).ref();
        if (sub_24.descriptor() != _M__sNil)
        {   break label_36;
        }Term sub_135 = sub_18.sub(2).ref();Term sub_78 = term_75.sub(1).ref();
        if (sub_78.descriptor() != _M__sNil)
        {   break label_36;
        }/*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_SugarTerms);
        sink.start(_M_NormalizeTerms);
        sink.start(_M_DesugarTerms); sink.copy(sub_147.ref());
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeArgumentsOpt, props_71, term_75);
  } final public static boolean _M_NormalizeProperties(Sink sink, int shared, int depth, Properties props_87, Term term_76) {
    if (depth < 2000) { sink.copy(term_76.ref()); return true;
    }
    return thunk(sink, _M_NormalizeProperties, props_87, term_76);
  } final public static boolean _M_NormalizePropertiesOpt(Sink sink, int shared, int depth, Properties props_55, Term term_94) {
    if (depth < 2000) {
      label_160: {
        if (term_94.descriptor() != _M__sNil)
        {   break label_160;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_123: {
        if (term_94.descriptor() != _M__sCons)
        {   break label_123;
        }Term sub_104 = term_94.sub(0).ref();
        if (sub_104.descriptor() != _M_Crsx_xproperties)
        {   break label_123;
        }Term sub_34 = sub_104.sub(0).ref();Term sub_278 = sub_104.sub(1).ref();
        if (sub_278.descriptor() != _M__sNil)
        {   break label_123;
        }Term sub_35 = sub_104.sub(2).ref();Term sub_193 = term_94.sub(1).ref();
        if (sub_193.descriptor() != _M__sNil)
        {   break label_123;
        }/*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xproperties); sink.literal("{"); sink.start(_M__sNil); sink.end(); sink.literal("}");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
      label_96: {
        if (term_94.descriptor() != _M__sCons)
        {   break label_96;
        }Term sub_170 = term_94.sub(0).ref();
        if (sub_170.descriptor() != _M_Crsx_xproperties)
        {   break label_96;
        }Term sub_197 = sub_170.sub(0).ref();Term sub_3 = sub_170.sub(1).ref();
        if (sub_3.descriptor() != _M__sCons)
        {   break label_96;
        }Term sub_250 = sub_3.sub(0).ref();
        /* #propertyList=sub */Term sub_10 = sub_3.sub(1).ref();
        if (sub_10.descriptor() != _M__sNil)
        {   break label_96;
        }Term sub_130 = sub_170.sub(2).ref();Term sub_499 = term_94.sub(1).ref();
        if (sub_499.descriptor() != _M__sNil)
        {   break label_96;
        }/*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xproperties); sink.literal("{");
        sink.start(_M__sCons);
        sink.start(_M_SugarPropertyList);sink.properties(safeRef(props_55));
        sink.start(_M_NormalizeProperties);
        sink.start(_M_DesugarPropertyList); sink.copy(sub_250.ref());
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("}");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizePropertiesOpt, props_55, term_94);
  } final public static boolean _M_NormalizeRule(Sink sink, int shared, int depth, Properties props_2, Term term_52) {
    if (depth < 2000) {
      label_141: {
        if (term_52.descriptor() != _M_Crsx_xruleDeclaration)
        {   break label_141;
        }Term sub_40 = term_52.sub(0).ref();
        /* #option?=sub */Term sub_188 = term_52.sub(1).ref();
        if (sub_188.descriptor() != _M_Crsx_xpattern)
        {   break label_141;
        }Term sub_174 = sub_188.sub(0).ref();
        /* #properties?=sub */Term sub_272 = sub_188.sub(1).ref();
        /* #constructor=sub */Term sub_101 = sub_188.sub(2).ref();
        /* #arguments?=sub */Term sub_154 = term_52.sub(2).ref();Term sub_2 = term_52.sub(3).ref();
        if (sub_2.descriptor() != _M_Crsx_xcontractum)
        {   break label_141;
        }Term sub_181 = sub_2.sub(0).ref();
        /* #freeTerm=sub *//*Contract*/
        sink.start(_M_Crsx_xruleDeclaration); sink.copy(sub_40.ref());
        sink.start(_M_Crsx_xpattern);sink.properties(safeRef(props_2));
        sink.start(_M_NormalizePropertiesOpt); sink.copy(sub_174.ref());
        sink.end(); sink.copy(sub_272.ref());sink.properties(safeRef(props_2));
        sink.start(_M_NormalizeArgumentsOpt); sink.copy(sub_101.ref());
        sink.end();
        sink.end(); sink.literal("\u2192");
        sink.start(_M_Crsx_xcontractum);sink.properties(safeRef(props_2));
        sink.start(_M_NormalizeFreeTerm); sink.copy(sub_181.ref());
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeRule, props_2, term_52);
  } final public static boolean _M_NormalizeRules(Sink sink, int shared, int depth, Properties props_196, Term term_39) {
    if (depth < 2000) {
      label_77: {
        if (term_39.descriptor() != _M__sCons)
        {   break label_77;
        }Term sub_60 = term_39.sub(0).ref();
        /* #rule=sub */Term sub_183 = term_39.sub(1).ref();
        if (sub_183.descriptor() != _M__sNil)
        {   break label_77;
        }/*Contract*/
        sink.start(_M__sCons);sink.properties(safeRef(props_196));
        sink.start(_M_NormalizeRule); sink.copy(sub_60.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeRules, props_196, term_39);
  } final public static boolean _M_NormalizeRuleKey1(Sink sink, int shared, int depth, Properties props_16, Term term_65, Term term_17, Variable var, Term term_18) {
    if (depth < 2000) {
      label_31: {
        if (term_65.descriptor() != _M_RULES)
        {   break label_31;
        }Term sub_110 = term_65.sub(0).ref();
        /* #rules=sub */
        /* #key=term */
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sTrace); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("Normalize rules: "); sink.copy(term_17.ref());
        sink.end();sink.properties(safeRef(props_16));Term term_28;
        {
          BufferSink buf = sink.context().makeBuffer();
          buf.start(_M_RULES);buf.properties(safeRef(props_16));
          buf.start(_M_NormalizeRules); buf.copy(sub_110.ref());
          buf.end();
          buf.end();
          term_28 = buf.term();
        }
        term_17 = force(sink.context(), term_17);
        Sink.property(sink, term_17, term_28);Term term_87;
        {
          BufferSink buf_49 = sink.context().makeBuffer(); buf_49.start(_M_OK); buf_49.end();
          term_87 = buf_49.term();
        }
        sink.substitute(term_18.ref(), new Variable[] { var }, new Term[] {term_87});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeRuleKey1, props_16, term_65, term_17, var, term_18);
  }    final public static boolean _M_NormalizeRuleKey(Sink sink, int shared, int depth, Properties props_131, Term term_22, Term term_37, Variable var_48, Term term_48) {
    if (depth < 2000) {
      label_13: {
        if (term_22.descriptor() != _M_OK)
        {   break label_13;
        }
        /* #key=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_131));
        sink.start(_M_NormalizeRuleKey1);
        sink.start(_M__s);sink.properties(safeRef(props_131));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_37.ref());
        sink.end(); sink.copy(term_37.ref());
        Variable var_77 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_77});
        VariableUse use = sink.context().makeVariableUse(var_77);
        sink.substitute(term_48.ref(), new Variable[] { var_48 }, new Term[] {use});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeRuleKey, props_131, term_22, term_37, var_48, term_48);
  }    final public static boolean _M_DispatchCases(Sink sink, int shared, int depth, Term term_96) {
    if (depth < 2000) {
      label_33: {
        if (term_96.descriptor() != _M__sNil)
        {   break label_33;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_183: {
        if (term_96.descriptor() != _M__sCons)
        {   break label_183;
        }Term sub_271 = term_96.sub(0).ref();
        /* #rule=sub */Term sub_121 = term_96.sub(1).ref();
        /* #rules=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdispatchCases_xS1); sink.literal(";");
        sink.start(_M_Crsx_xdispatchCase); sink.copy(sub_271.ref());
        sink.end();
        sink.end();
        sink.start(_M_DispatchCases); sink.copy(sub_121.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DispatchCases, term_96);
  } final public static boolean _M_DispatchMetaArgsOpt(Sink sink, int shared, int depth, Term term_41) {
    if (depth < 2000) {
      label_4: {
        if (term_41.descriptor() != _M__sNil)
        {   break label_4;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_89: {
        if (term_41.descriptor() != _M__sCons)
        {   break label_89;
        }Term sub_145 = term_41.sub(0).ref();
        if (sub_145.descriptor() != _M_Crsx_xfreeTerms_xS1)
        {   break label_89;
        }Term sub_244 = sub_145.sub(0).ref();Term sub_117 = sub_145.sub(1).ref();
        /* #freeTerm=sub */Term sub_52 = term_41.sub(1).ref();
        /* #freeTerms_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeArguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeTerms); sink.copy(sub_117.ref()); sink.copy(sub_52.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DispatchMetaArgsOpt, term_41);
  } final public static boolean _M_DispatchPatternNextBinder(Sink sink, int shared, int depth, Term term_74, Term term_78, Term term_88) {
    if (depth < 2000) {
      label_79: {
        if (term_74.descriptor() != _M_Crsx_xnextBinder_xA2)
        {   break label_79;
        }Term sub_165 = term_74.sub(0).ref();Term sub_283 = term_74.sub(1).ref();
        /* #freeTerm=sub */
        /* #count=term */
        /* #freeTerms_S1*=term *//*Contract*/
        sink.start(_M_Crsx_xnextBinder_xA2); sink.literal(".");
        sink.start(_M_DispatchPatternFreeTerm); sink.copy(sub_283.ref()); sink.copy(term_78.ref()); sink.copy(term_88.ref());
        sink.end();
        sink.end(); return true;
      }
      label_155: {
        if (term_74.descriptor() != _M_Crsx_xnextBinder_xA1)
        {   break label_155;
        }Term sub_378 = term_74.sub(0).ref();
        if (sub_378.descriptor() != _M_Crsx_xbinder)
        {   break label_155;
        }Term sub_133 = sub_378.sub(0).ref();
        /* #annotations?=sub */Term sub_207 = sub_378.sub(1).ref();
        if (sub_207.descriptor() != _M_Crsx_xvariable)
        {   break label_155;
        }Term sub_180 = sub_207.sub(0).ref();
        if (sub_180.descriptor() != _M__sNil)
        {   break label_155;
        }Term sub_245 = sub_207.sub(1).ref();
        /* #VARIABLE=sub */Term sub_118 = sub_207.sub(2).ref();
        /* #linear?=sub */Term sub_90 = sub_207.sub(3).ref();
        /* #functional?=sub */Term sub_217 = sub_207.sub(4).ref();
        /* #varsort?=sub */Term sub_286 = term_74.sub(1).ref();
        /* #nextBinder=sub */
        /* #count=term */
        /* #freeTerms_S1*=term *//*Contract*/
        sink.start(_M_Crsx_xnextBinder_xA1);
        sink.start(_M_Crsx_xbinder); sink.copy(sub_133.ref());
        sink.start(_M_Crsx_xvariable); sink.start(_M__sNil); sink.end(); sink.copy(sub_245.ref()); sink.copy(sub_118.ref()); sink.copy(sub_90.ref()); sink.copy(sub_217.ref());
        sink.end();
        sink.end();
        sink.start(_M_DispatchPatternNextBinder); sink.copy(sub_286.ref()); sink.copy(term_78.ref());
        sink.start(_M_Concat); sink.copy(term_88.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeTerms_xS1); sink.literal(",");
        sink.start(_M_Crsx_xfreeTerm_xA5); sink.copy(sub_133.ref());
        sink.start(_M_Crsx_xvariable); sink.start(_M__sNil); sink.end(); sink.copy(sub_245.ref()); sink.copy(sub_118.ref()); sink.copy(sub_90.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DispatchPatternNextBinder, term_74, term_78, term_88);
  }   final public static boolean _M_DispatchPatternBinder(Sink sink, int shared, int depth, Term term_99, Term term_43, Term term_7, Term term_70) {
    if (depth < 2000) {
      label_55: {
        if (term_99.descriptor() != _M_Crsx_xbinder)
        {   break label_55;
        }Term sub_194 = term_99.sub(0).ref();
        /* #annotations?=sub */Term sub_195 = term_99.sub(1).ref();
        if (sub_195.descriptor() != _M_Crsx_xvariable)
        {   break label_55;
        }Term sub_179 = sub_195.sub(0).ref();
        if (sub_179.descriptor() != _M__sNil)
        {   break label_55;
        }Term sub_296 = sub_195.sub(1).ref();
        /* #VARIABLE=sub */Term sub_161 = sub_195.sub(2).ref();
        /* #linear?=sub */Term sub_157 = sub_195.sub(3).ref();
        /* #functional?=sub */Term sub_50 = sub_195.sub(4).ref();
        /* #varsort?=sub */
        /* #nextBinder=term */
        /* #count=term */
        /* #freeTerms_S1*=term *//*Contract*/
        sink.start(_M_Crsx_xterm_xA2);
        sink.start(_M_Crsx_xboundTerm);
        sink.start(_M_Crsx_xbinder); sink.copy(sub_194.ref());
        sink.start(_M_Crsx_xvariable); sink.start(_M__sNil); sink.end(); sink.copy(sub_296.ref()); sink.copy(sub_161.ref()); sink.copy(sub_157.ref()); sink.copy(sub_50.ref());
        sink.end();
        sink.end();
        sink.start(_M_DispatchPatternNextBinder); sink.copy(term_43.ref()); sink.copy(term_7.ref());
        sink.start(_M_Concat); sink.copy(term_70.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeTerms_xS1); sink.literal(",");
        sink.start(_M_Crsx_xfreeTerm_xA5); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xvariable); sink.start(_M__sNil); sink.end(); sink.copy(sub_296.ref()); sink.copy(sub_161.ref()); sink.copy(sub_157.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DispatchPatternBinder, term_99, term_43, term_7, term_70);
  }    final public static boolean _M_DispatchPatternFreeTerm(Sink sink, int shared, int depth, Term term_24, Term term_9, Term term_27) {
    if (depth < 2000) {
      sink.start(_M_Crsx_xfreeTerm_xA7); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("#$P$");
      sink.start(_M__s); sink.start(_M_Builtin_sFormatNumber); sink.end(); sink.copy(term_9.ref());
      sink.end();
      sink.end();
      sink.start(_M_DispatchMetaArgsOpt); sink.copy(term_27.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchPatternFreeTerm, term_24, term_9, term_27);
  }   final public static boolean _M_DispatchPatternTerm(Sink sink, int shared, int depth, Term term_0, Term term_35, Term term_15) {
    if (depth < 2000) {
      label_148: {
        if (term_0.descriptor() != _M_Crsx_xterm_xA1)
        {   break label_148;
        }Term sub_148 = term_0.sub(0).ref();
        /* #freeTerm=sub */
        /* #count=term */
        /* #freeTerms_S1*=term *//*Contract*/
        sink.start(_M_Crsx_xterm_xA1);
        sink.start(_M_DispatchPatternFreeTerm); sink.copy(sub_148.ref()); sink.copy(term_35.ref()); sink.copy(term_15.ref());
        sink.end();
        sink.end(); return true;
      }
      label_136: {
        if (term_0.descriptor() != _M_Crsx_xterm_xA2)
        {   break label_136;
        }Term sub_132 = term_0.sub(0).ref();
        if (sub_132.descriptor() != _M_Crsx_xboundTerm)
        {   break label_136;
        }Term sub_246 = sub_132.sub(0).ref();
        /* #binder=sub */Term sub_287 = sub_132.sub(1).ref();
        /* #nextBinder=sub */
        /* #count=term */
        /* #freeTerms_S1*=term *//*Contract*/
        sink.start(_M_DispatchPatternBinder); sink.copy(sub_246.ref()); sink.copy(sub_287.ref()); sink.copy(term_35.ref()); sink.copy(term_15.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DispatchPatternTerm, term_0, term_35, term_15);
  }   final public static boolean _M_DispatchPatternArgs(Sink sink, int shared, int depth, Term term_176, Term term_174) {
    if (depth < 2000) {
      label_85: {
        if (term_176.descriptor() != _M__sNil)
        {   break label_85;
        }
        /* #count=term *//*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_32: {
        if (term_176.descriptor() != _M__sCons)
        {   break label_32;
        }Term sub_160 = term_176.sub(0).ref();
        if (sub_160.descriptor() != _M_Crsx_xterms_xS1)
        {   break label_32;
        }Term sub_127 = sub_160.sub(0).ref();Term sub_119 = sub_160.sub(1).ref();
        /* #term=sub */Term sub_134 = term_176.sub(1).ref();
        /* #terms_S1*=sub */
        /* #count=term *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms_xS1); sink.literal(",");
        sink.start(_M_DispatchPatternTerm); sink.copy(sub_119.ref()); sink.copy(term_174.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.start(_M_DispatchPatternArgs); sink.copy(sub_134.ref());
        sink.start(_M__s); sink.start(_M_Builtin_sPlus); sink.end(); sink.copy(term_174.ref()); sink.literal(1);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DispatchPatternArgs, term_176, term_174);
  }  final public static boolean _M_DispatchProperties(Sink sink, int shared, int depth, Term term_32) {
    if (depth < 2000) {
      label_19: {
        if (term_32.descriptor() != _M__sNil)
        {   break label_19;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_65: {
        if (term_32.descriptor() != _M__sCons)
        {   break label_65;
        }Term sub_137 = term_32.sub(0).ref();
        if (sub_137.descriptor() != _M_Crsx_xproperties)
        {   break label_65;
        }Term sub_123 = sub_137.sub(0).ref();Term sub_235 = sub_137.sub(1).ref();
        if (sub_235.descriptor() != _M__sNil)
        {   break label_65;
        }Term sub_196 = sub_137.sub(2).ref();Term sub_81 = term_32.sub(1).ref();
        if (sub_81.descriptor() != _M__sNil)
        {   break label_65;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_100: {
        if (term_32.descriptor() != _M__sCons)
        {   break label_100;
        }Term sub_225 = term_32.sub(0).ref();
        if (sub_225.descriptor() != _M_Crsx_xproperties)
        {   break label_100;
        }Term sub_190 = sub_225.sub(0).ref();Term sub_164 = sub_225.sub(1).ref();
        if (sub_164.descriptor() != _M__sCons)
        {   break label_100;
        }Term sub_159 = sub_164.sub(0).ref();
        /* #propertyList=sub */Term sub_107 = sub_164.sub(1).ref();
        if (sub_107.descriptor() != _M__sNil)
        {   break label_100;
        }Term sub_227 = sub_225.sub(2).ref();Term sub_184 = term_32.sub(1).ref();
        if (sub_184.descriptor() != _M__sNil)
        {   break label_100;
        }/*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xproperties); sink.literal("{");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xpropertyList);
        sink.start(_M_Crsx_xproperty_xA1); sink.literal("#$P$E");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("}");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DispatchProperties, term_32);
  } final public static boolean _M_Dispatch(Sink sink, int shared, int depth, Term term_57) {
    if (depth < 2000) {
      label_110: {
        if (term_57.descriptor() != _M__sCons)
        {   break label_110;
        }Term sub_19 = term_57.sub(0).ref();
        if (sub_19.descriptor() != _M_Crsx_xruleDeclaration)
        {   break label_110;
        }Term sub_353 = sub_19.sub(0).ref();
        /* #option?=sub */Term sub_9 = sub_19.sub(1).ref();
        if (sub_9.descriptor() != _M_Crsx_xpattern)
        {   break label_110;
        }Term sub_88 = sub_9.sub(0).ref();
        /* #properties?=sub */Term sub_91 = sub_9.sub(1).ref();
        /* #constructor=sub */Term sub_360 = sub_9.sub(2).ref();
        if (sub_360.descriptor() != _M__sCons)
        {   break label_110;
        }Term sub_189 = sub_360.sub(0).ref();
        if (sub_189.descriptor() != _M_Crsx_xarguments)
        {   break label_110;
        }Term sub_215 = sub_189.sub(0).ref();Term sub_54 = sub_189.sub(1).ref();
        if (sub_54.descriptor() != _M__sCons)
        {   break label_110;
        }Term sub_316 = sub_54.sub(0).ref();
        /* #terms=sub */Term sub_259 = sub_54.sub(1).ref();
        if (sub_259.descriptor() != _M__sNil)
        {   break label_110;
        }Term sub_297 = sub_189.sub(2).ref();Term sub_214 = sub_360.sub(1).ref();
        if (sub_214.descriptor() != _M__sNil)
        {   break label_110;
        }Term sub_108 = sub_19.sub(2).ref();Term sub_233 = sub_19.sub(3).ref();
        /* #contractum=sub */Term sub_253 = term_57.sub(1).ref();
        /* #rules=sub *//*Contract*/
        sink.start(_M_Crsx_xruleDeclaration); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xpattern);
        sink.start(_M_DispatchProperties); sink.copy(sub_88.ref());
        sink.end(); sink.copy(sub_91.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_SugarTerms);
        sink.start(_M_DispatchPatternArgs);
        sink.start(_M_DesugarTerms); sink.copy(sub_316.ref());
        sink.end(); sink.literal(0);
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.literal("\u2192");
        sink.start(_M_Crsx_xcontractum);
        sink.start(_M_Crsx_xfreeTerm_xA9); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xexpression);
        sink.start(_M_Crsx_xdispatch); sink.literal("dispatch");
        sink.start(_M_Crsx_xdispatchTerm);
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.start(_M__sNil); sink.end();
        sink.start(_M_DispatchProperties); sink.copy(sub_88.ref());
        sink.end(); sink.copy(sub_91.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_SugarTerms);
        sink.start(_M_DispatchPatternArgs);
        sink.start(_M_DesugarTerms); sink.copy(sub_316.ref());
        sink.end(); sink.literal(0);
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.start(_M_SugarDispatchCases);
        sink.start(_M_DispatchCases);
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xruleDeclaration); sink.copy(sub_353.ref());
        sink.start(_M_Crsx_xpattern); sink.copy(sub_88.ref()); sink.copy(sub_91.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons); sink.copy(sub_316.ref()); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.literal("\u2192"); sink.copy(sub_233.ref());
        sink.end(); sink.copy(sub_253.ref());
        sink.end();
        sink.end();
        sink.end();
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdelayCase); sink.literal("delay");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Dispatch, term_57);
  } final public static boolean _M_GroupRule(Sink sink, int shared, int depth, Properties props_10, Term term_63, Term term_10, Variable var_34, Term term_26) {
    if (depth < 2000) {
      label_48: {
        /* #key=term */
        /* #rules=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_10));Term term_161;
        {
          BufferSink buf_55 = sink.context().makeBuffer();
          buf_55.start(_M_RULES);
          buf_55.start(_M__sCons);
          buf_55.start(_M_Dispatch); buf_55.copy(term_10.ref());
          buf_55.end(); buf_55.start(_M__sNil); buf_55.end();
          buf_55.end();
          buf_55.end();
          term_161 = buf_55.term();
        }
        term_63 = force(sink.context(), term_63);
        Sink.property(sink, term_63, term_161);Term term_290;
        {
          BufferSink buf_11 = sink.context().makeBuffer(); buf_11.start(_M_OK); buf_11.end();
          term_290 = buf_11.term();
        }
        sink.substitute(term_26.ref(), new Variable[] { var_34 }, new Term[] {term_290}); return true;
      }
    }
    return thunk(sink, _M_GroupRule, props_10, term_63, term_10, var_34, term_26);
  }    final public static boolean _M_MayGroupRule2(Sink sink, int shared, int depth, Properties props_50, Term term_44, Term term_69, Term term_67, Variable var_97, Term term_205) {
    if (depth < 2000) {
      label_0: {
        if (term_44.descriptor() != _M_TRUE)
        {   break label_0;
        }
        /* #key=term */
        /* #rules=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_50));Term term_90;
        {
          BufferSink buf_75 = sink.context().makeBuffer(); buf_75.start(_M_OK); buf_75.end();
          term_90 = buf_75.term();
        }
        sink.substitute(term_205.ref(), new Variable[] { var_97 }, new Term[] {term_90}); return true;
      }
      label_113: {
        if (term_44.descriptor() != _M_FALSE)
        {   break label_113;
        }
        /* #key=term */
        /* #rules=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_50));
        sink.start(_M_GroupRule); sink.copy(term_69.ref()); sink.copy(term_67.ref());
        Variable var_79 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_79});
        VariableUse use_33 = sink.context().makeVariableUse(var_79);
        sink.substitute(term_205.ref(), new Variable[] { var_97 }, new Term[] {use_33});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_MayGroupRule2, props_50, term_44, term_69, term_67, var_97, term_205);
  }     final public static boolean _M_MayGroupRule1(Sink sink, int shared, int depth, Properties props_64, Term term_224, Term term_62, Variable var_168, Term term_155) {
    if (depth < 2000) {
      label_81: {
        if (term_224.descriptor() != _M_RULES)
        {   break label_81;
        }Term sub_166 = term_224.sub(0).ref();
        /* #rules=sub */
        /* #key=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_64));
        sink.start(_M_MayGroupRule2);
        sink.start(_M_Or); sink.start(_M_IsEmpty); sink.copy(sub_166.ref()); sink.end();
        sink.start(_M_And);
        sink.start(_M_IsSingleton); sink.copy(sub_166.ref());
        sink.end();
        sink.start(_M_AllMetaInPatternRule); sink.start(_M_Head); sink.copy(sub_166.ref()); sink.end();
        sink.end();
        sink.end();
        sink.end(); sink.copy(term_62.ref()); sink.copy(sub_166.ref());
        Variable var_5 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_5});
        VariableUse use_15 = sink.context().makeVariableUse(var_5);
        sink.substitute(term_155.ref(), new Variable[] { var_168 }, new Term[] {use_15});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_MayGroupRule1, props_64, term_224, term_62, var_168, term_155);
  }    final public static boolean _M_MayGroupRule(Sink sink, int shared, int depth, Properties props_86, Term term_361, Variable var_135, Term term_83) {
    if (depth < 2000) {
      label_153: {
        /* #key=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_86));
        sink.start(_M_MayGroupRule1);
        sink.start(_M__s);sink.properties(safeRef(props_86));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_361.ref());
        sink.end(); sink.copy(term_361.ref());
        Variable var_30 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_30});
        VariableUse use_37 = sink.context().makeVariableUse(var_30);
        sink.substitute(term_83.ref(), new Variable[] { var_135 }, new Term[] {use_37});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_MayGroupRule, props_86, term_361, var_135, term_83);
  }   final public static boolean _M_N2Rule(Sink sink, int shared, int depth, Properties props_175, Term term_31, Term term_188) {
    if (depth < 2000) {
      label_6: {
        /* #ruleKey=term */
        if (term_188.descriptor() != _M_CONTINUATION)
        {   break label_6;
        }Term sub_69 = term_188.sub(0).ref();
        Variable binder = term_188.binders(0)[0];
        /* #=sub *//*Contract*/sink.properties(safeRef(props_175));
        sink.start(_M_MayGroupRule); sink.copy(term_31.ref());
        Variable var_89 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_89});
        sink.start(_M_NormalizeRuleKey); sink.use(var_89); sink.copy(term_31.ref());
        Variable var_1 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_1});
        VariableUse use_84 = sink.context().makeVariableUse(var_1);
        sink.substitute(sub_69.ref(), new Variable[] { binder }, new Term[] {use_84});
        sink.end();
        sink.end(); return true; 
      }
    }
    return thunk(sink, _M_N2Rule, props_175, term_31, term_188);
  }  final public static boolean _M_N2Rules(Sink sink, int shared, int depth, Properties props_61, Term term_30, Variable var_69, Term term_197) {
    if (depth < 2000) {
      label_39: {
        /* #keys=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_61));
        sink.start(_M_SeqMap);
        Variable var_65 = sink.context().makeVariable("x");
        Variable var_14 = sink.context().makeVariable("c");
        sink.binds(new Variable[] {var_65,var_14});
        sink.start(_M_N2Rule); sink.use(var_65); sink.use(var_14);
        sink.end(); sink.copy(term_30.ref());
        Variable var_47 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_47});
        VariableUse use_7 = sink.context().makeVariableUse(var_47);
        sink.substitute(term_197.ref(), new Variable[] { var_69 }, new Term[] {use_7});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N2Rules, props_61, term_30, var_69, term_197);
  }   final public static boolean _M_N2(Sink sink, int shared, int depth, Properties props_93, Term term_36, Variable var_40, Term term_201) {
    if (depth < 2000) {
      label_94: {
        Term value = props_93 == null ? null : props_93.lookup("$rulekeys");
        if (value == null) 
        {   break label_94;
        }
        if (value.descriptor() != _M_KEYS)
        {   break label_94;
        }Term sub_162 = value.sub(0).ref();
        /* #keys=sub */
        if (term_36.descriptor() != _M_OK)
        {   break label_94;
        }
        /* #=term *//*Contract*/sink.properties(safeRef(props_93));
        sink.start(_M_N2Rules); sink.copy(sub_162.ref());
        Variable var_187 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_187});
        VariableUse use_75 = sink.context().makeVariableUse(var_187);
        sink.substitute(term_201.ref(), new Variable[] { var_40 }, new Term[] {use_75});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N2, props_93, term_36, var_40, term_201);
  }   final public static boolean _M_N1ImportDirective(Sink sink, int shared, int depth, Properties props_78, Term term_263, Term term_151, Variable var_26, Term term_82) {
    if (depth < 2000) {
      label_63: {
        Term value_0 = props_78 == null ? null : props_78.lookup("$imported");
        if (value_0 == null) 
        {   break label_63;
        }
        if (value_0.descriptor() != _M_IMPORTS)
        {   break label_63;
        }Term sub_30 = value_0.sub(0).ref();
        /* #imported=sub */
        if (term_263.descriptor() != _M_Crsx_xdirective_xA3)
        {   break label_63;
        }Term sub_186 = term_263.sub(0).ref();
        if (sub_186.descriptor() != _M_Crsx_xliteral_xA1)
        {   break label_63;
        }Term sub_212 = sub_186.sub(0).ref();
        /* #STRING=sub */
        if (term_151.descriptor() != _M_TRUE)
        {   break label_63;
        }
        /* #=term *//*Contract*/sink.properties(safeRef(props_78));Term term_169;
        {
          BufferSink buf_43 = sink.context().makeBuffer();
          buf_43.start(_M_IMPORTS);
          buf_43.start(_M_Concat); buf_43.copy(sub_30.ref());
          buf_43.start(_M__sCons);
          buf_43.start(_M_UnString); buf_43.copy(sub_212.ref());
          buf_43.end(); buf_43.start(_M__sNil); buf_43.end();
          buf_43.end();
          buf_43.end();
          buf_43.end();
          term_169 = buf_43.term();
        } sink.propertyNamed("$imported", term_169);Term term_183;
        {
          BufferSink buf_99 = sink.context().makeBuffer(); buf_99.start(_M_OK); buf_99.end();
          term_183 = buf_99.term();
        }
        sink.substitute(term_82.ref(), new Variable[] { var_26 }, new Term[] {term_183}); return true;
      }
      label_22: {
        Term value_16 = props_78 == null ? null : props_78.lookup("$grammars");
        if (value_16 == null) 
        {   break label_22;
        }
        if (value_16.descriptor() != _M_IMPORTS)
        {   break label_22;
        }Term sub_346 = value_16.sub(0).ref();
        /* #imported=sub */
        if (term_263.descriptor() != _M_Crsx_xdirective_xA3)
        {   break label_22;
        }Term sub_143 = term_263.sub(0).ref();
        if (sub_143.descriptor() != _M_Crsx_xliteral_xA1)
        {   break label_22;
        }Term sub_202 = sub_143.sub(0).ref();
        /* #STRING=sub */
        if (term_151.descriptor() != _M_FALSE)
        {   break label_22;
        }
        /* #=term *//*Contract*/sink.properties(safeRef(props_78));Term term_13;
        {
          BufferSink buf_15 = sink.context().makeBuffer();
          buf_15.start(_M_IMPORTS);
          buf_15.start(_M_Concat); buf_15.copy(sub_346.ref());
          buf_15.start(_M__sCons);
          buf_15.start(_M_Replace);
          buf_15.start(_M_UnString); buf_15.copy(sub_202.ref());
          buf_15.end(); buf_15.literal("."); buf_15.literal("/");
          buf_15.end(); buf_15.start(_M__sNil); buf_15.end();
          buf_15.end();
          buf_15.end();
          buf_15.end();
          term_13 = buf_15.term();
        } sink.propertyNamed("$grammars", term_13);Term term_192;
        {
          BufferSink buf_90 = sink.context().makeBuffer(); buf_90.start(_M_OK); buf_90.end();
          term_192 = buf_90.term();
        }
        sink.substitute(term_82.ref(), new Variable[] { var_26 }, new Term[] {term_192}); return true;
      }
      label_187: {
        /* #directive=term */
        /* #kind=term */
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end(); sink.literal("Error: invalid argument in import directive.");
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1ImportDirective, props_78, term_263, term_151, var_26, term_82);
  }    final public static boolean _M_N1ImportDirectives(Sink sink, int shared, int depth, Properties props_12, Term term_142, Term term_112, Variable var_12, Term term_42) {
    if (depth < 2000) {
      label_93: {
        if (term_142.descriptor() != _M__sNil)
        {   break label_93;
        }
        /* #kind=term */
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Error: missing filename argument in import directive.");
        sink.end(); return true;
      }
      label_129: {
        if (term_142.descriptor() != _M__sCons)
        {   break label_129;
        }Term sub_320 = term_142.sub(0).ref();
        if (sub_320.descriptor() != _M_Crsx_xdirectives)
        {   break label_129;
        }Term sub_327 = sub_320.sub(0).ref();
        /* #directive1=sub */Term sub_150 = sub_320.sub(1).ref();
        if (sub_150.descriptor() != _M__sCons)
        {   break label_129;
        }Term sub_205 = sub_150.sub(0).ref();
        if (sub_205.descriptor() != _M_Crsx_xdirectives_xS1)
        {   break label_129;
        }Term sub_275 = sub_205.sub(0).ref();Term sub_77 = sub_205.sub(1).ref();
        /* #directive2=sub */Term sub_124 = sub_150.sub(1).ref();
        /* #directives_S1*=sub */Term sub_156 = term_142.sub(1).ref();
        if (sub_156.descriptor() != _M__sNil)
        {   break label_129;
        }
        /* #kind=term */
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Error: extraneous argument in import directive.");
        sink.end(); return true;
      }
      label_191: {
        if (term_142.descriptor() != _M__sCons)
        {   break label_191;
        }Term sub_68 = term_142.sub(0).ref();
        if (sub_68.descriptor() != _M_Crsx_xdirectives)
        {   break label_191;
        }Term sub_258 = sub_68.sub(0).ref();
        /* #directive=sub */Term sub_122 = sub_68.sub(1).ref();
        if (sub_122.descriptor() != _M__sNil)
        {   break label_191;
        }Term sub_153 = term_142.sub(1).ref();
        if (sub_153.descriptor() != _M__sNil)
        {   break label_191;
        }
        /* #kind=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_12));
        sink.start(_M_N1ImportDirective); sink.copy(sub_258.ref()); sink.copy(term_112.ref());
        Variable var_59 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_59});
        VariableUse use_26 = sink.context().makeVariableUse(var_59);
        sink.substitute(term_42.ref(), new Variable[] { var_12 }, new Term[] {use_26});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1ImportDirectives, props_12, term_142, term_112, var_12, term_42);
  }    final public static boolean _M_N1Import(Sink sink, int shared, int depth, Properties props_48, Term term_163, Term term_261, Variable var_31, Term term_5) {
    if (depth < 2000) {
      label_134: {
        if (term_163.descriptor() != _M__sNil)
        {   break label_134;
        }
        /* #kind=term */
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Error: missing filename argument in import directive.");
        sink.end(); return true;
      }
      label_75: {
        if (term_163.descriptor() != _M__sCons)
        {   break label_75;
        }Term sub_141 = term_163.sub(0).ref();
        if (sub_141.descriptor() != _M_Crsx_xdirectiveArguments)
        {   break label_75;
        }Term sub_97 = sub_141.sub(0).ref();Term sub_392 = sub_141.sub(1).ref();
        /* #directives?=sub */Term sub_236 = sub_141.sub(2).ref();Term sub_299 = term_163.sub(1).ref();
        if (sub_299.descriptor() != _M__sNil)
        {   break label_75;
        }
        /* #kind=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_48));
        sink.start(_M_N1ImportDirectives); sink.copy(sub_392.ref()); sink.copy(term_261.ref());
        Variable var_20 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_20});
        VariableUse use_90 = sink.context().makeVariableUse(var_20);
        sink.substitute(term_5.ref(), new Variable[] { var_31 }, new Term[] {use_90});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1Import, props_48, term_163, term_261, var_31, term_5);
  }    final public static boolean _M_N1DirectiveConstructor(Sink sink, int shared, int depth, Properties props_40, Term term_166, Variable var_75, Term term_64) {
    if (depth < 2000) {
      label_26: {
        /* #constructor=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_40));Term term_138;
        {
          BufferSink buf_36 = sink.context().makeBuffer(); buf_36.start(_M_OK); buf_36.end();
          term_138 = buf_36.term();
        }
        sink.substitute(term_64.ref(), new Variable[] { var_75 }, new Term[] {term_138}); return true;
      }
    }
    return thunk(sink, _M_N1DirectiveConstructor, props_40, term_166, var_75, term_64);
  }   final public static boolean _M_N1Directive(Sink sink, int shared, int depth, Properties props_23, Term term_149, Variable var_33, Term term_215) {
    if (depth < 2000) {
      label_161: {
        if (term_149.descriptor() != _M_Crsx_xdirective_xA1)
        {   break label_161;
        }Term sub_231 = term_149.sub(0).ref();
        if (sub_231.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_161;
        }Term sub_208 = sub_231.sub(0).ref();
        if (sub_208.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_161;
        }Term sub_282 = sub_231.sub(1).ref();
        /* #CONSTRUCTOR=sub */Term sub_431 = term_149.sub(1).ref();
        /* #directiveArguments?=sub */
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sStringEqual); sink.end(); sink.copy(sub_282.ref()); sink.literal("$Use");
        sink.end();sink.properties(safeRef(props_23));
        sink.start(_M_N1Import); sink.copy(sub_431.ref()); sink.start(_M_TRUE); sink.end();
        Variable var_28 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_28});
        VariableUse use_39 = sink.context().makeVariableUse(var_28);
        sink.substitute(term_215.ref(), new Variable[] { var_33 }, new Term[] {use_39});
        sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sStringEqual); sink.end(); sink.copy(sub_282.ref()); sink.literal("$AddGrammar");
        sink.end();sink.properties(safeRef(props_23));
        sink.start(_M_N1Import); sink.copy(sub_431.ref()); sink.start(_M_FALSE); sink.end();
        Variable var_51 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_51});
        VariableUse use_48 = sink.context().makeVariableUse(var_51);
        sink.substitute(term_215.ref(), new Variable[] { var_33 }, new Term[] {use_48});
        sink.end();sink.properties(safeRef(props_23));Term term_257;
        {
          BufferSink buf_54 = sink.context().makeBuffer(); buf_54.start(_M_OK); buf_54.end();
          term_257 = buf_54.term();
        }
        sink.substitute(term_215.ref(), new Variable[] { var_33 }, new Term[] {term_257});
        sink.end();
        sink.end(); return true;
      }
      label_11: {
        /* #directive=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_23));Term term_131;
        {
          BufferSink buf_94 = sink.context().makeBuffer(); buf_94.start(_M_OK); buf_94.end();
          term_131 = buf_94.term();
        }
        sink.substitute(term_215.ref(), new Variable[] { var_33 }, new Term[] {term_131}); return true;
      }
    }
    return thunk(sink, _M_N1Directive, props_23, term_149, var_33, term_215);
  }   final public static boolean _M_N1Declaration(Sink sink, int shared, int depth, Properties props_24, Term term_266, Variable var_96, Term term_102) {
    if (depth < 2000) {
      label_60: {
        if (term_266.descriptor() != _M_Crsx_xdeclaration_xA5)
        {   break label_60;
        }Term sub_14 = term_266.sub(0).ref();
        if (sub_14.descriptor() != _M_Crsx_xdirective_xA1)
        {   break label_60;
        }Term sub_191 = sub_14.sub(0).ref();
        /* #constructor=sub */Term sub_357 = sub_14.sub(1).ref();
        if (sub_357.descriptor() != _M__sCons)
        {   break label_60;
        }Term sub_386 = sub_357.sub(0).ref();
        if (sub_386.descriptor() != _M_Crsx_xdirectiveArguments)
        {   break label_60;
        }Term sub_125 = sub_386.sub(0).ref();Term sub_341 = sub_386.sub(1).ref();
        if (sub_341.descriptor() != _M__sCons)
        {   break label_60;
        }Term sub_243 = sub_341.sub(0).ref();
        if (sub_243.descriptor() != _M_Crsx_xdirectives)
        {   break label_60;
        }Term sub_294 = sub_243.sub(0).ref();
        if (sub_294.descriptor() != _M_Crsx_xdirective_xA2)
        {   break label_60;
        }Term sub_163 = sub_294.sub(0).ref();
        if (sub_163.descriptor() != _M_Crsx_xdirectiveList)
        {   break label_60;
        }Term sub_381 = sub_163.sub(0).ref();Term sub_368 = sub_163.sub(1).ref();
        if (sub_368.descriptor() != _M__sNil)
        {   break label_60;
        }Term sub_298 = sub_163.sub(2).ref();Term sub_187 = sub_243.sub(1).ref();
        if (sub_187.descriptor() != _M__sNil)
        {   break label_60;
        }Term sub_398 = sub_341.sub(1).ref();
        if (sub_398.descriptor() != _M__sNil)
        {   break label_60;
        }Term sub_149 = sub_386.sub(2).ref();Term sub_128 = sub_357.sub(1).ref();
        if (sub_128.descriptor() != _M__sNil)
        {   break label_60;
        }
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M_IsDirectiveUnwrap); sink.copy(sub_191.ref());
        sink.end();sink.properties(safeRef(props_24));
        sink.start(_M_N1DirectiveConstructor); sink.copy(sub_191.ref());
        Variable var_150 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_150});
        VariableUse use_6 = sink.context().makeVariableUse(var_150);
        sink.substitute(term_102.ref(), new Variable[] { var_96 }, new Term[] {use_6});
        sink.end();sink.properties(safeRef(props_24));Term term_115;
        {
          BufferSink buf_31 = sink.context().makeBuffer(); buf_31.start(_M_OK); buf_31.end();
          term_115 = buf_31.term();
        }
        sink.substitute(term_102.ref(), new Variable[] { var_96 }, new Term[] {term_115});
        sink.end(); return true;
      }
      label_196: {
        if (term_266.descriptor() != _M_Crsx_xdeclaration_xA5)
        {   break label_196;
        }Term sub_203 = term_266.sub(0).ref();
        if (sub_203.descriptor() != _M_Crsx_xdirective_xA1)
        {   break label_196;
        }Term sub_168 = sub_203.sub(0).ref();
        /* #constructor=sub */Term sub_578 = sub_203.sub(1).ref();
        if (sub_578.descriptor() != _M__sCons)
        {   break label_196;
        }Term sub_404 = sub_578.sub(0).ref();
        if (sub_404.descriptor() != _M_Crsx_xdirectiveArguments)
        {   break label_196;
        }Term sub_185 = sub_404.sub(0).ref();Term sub_517 = sub_404.sub(1).ref();
        if (sub_517.descriptor() != _M__sCons)
        {   break label_196;
        }Term sub_209 = sub_517.sub(0).ref();
        if (sub_209.descriptor() != _M_Crsx_xdirectives)
        {   break label_196;
        }Term sub_324 = sub_209.sub(0).ref();
        if (sub_324.descriptor() != _M_Crsx_xdirective_xA2)
        {   break label_196;
        }Term sub_416 = sub_324.sub(0).ref();
        if (sub_416.descriptor() != _M_Crsx_xdirectiveList)
        {   break label_196;
        }Term sub_223 = sub_416.sub(0).ref();Term sub_175 = sub_416.sub(1).ref();
        if (sub_175.descriptor() != _M__sCons)
        {   break label_196;
        }Term sub_408 = sub_175.sub(0).ref();
        /* #declarations=sub */Term sub_493 = sub_175.sub(1).ref();
        if (sub_493.descriptor() != _M__sNil)
        {   break label_196;
        }Term sub_530 = sub_416.sub(2).ref();Term sub_221 = sub_209.sub(1).ref();
        if (sub_221.descriptor() != _M__sNil)
        {   break label_196;
        }Term sub_444 = sub_517.sub(1).ref();
        if (sub_444.descriptor() != _M__sNil)
        {   break label_196;
        }Term sub_99 = sub_404.sub(2).ref();Term sub_79 = sub_578.sub(1).ref();
        if (sub_79.descriptor() != _M__sNil)
        {   break label_196;
        }
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M_IsDirectiveUnwrap); sink.copy(sub_168.ref());
        sink.end();sink.properties(safeRef(props_24));
        sink.start(_M_N1DirectiveConstructor); sink.copy(sub_168.ref());
        Variable var_10 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_10});
        VariableUse use_99 = sink.context().makeVariableUse(var_10);
        sink.substitute(term_102.ref(), new Variable[] { var_96 }, new Term[] {use_99});
        sink.end();sink.properties(safeRef(props_24));
        sink.start(_M_N1Declarations1); sink.start(_M_OK); sink.end();
        sink.start(_M_DesugarDeclarations); sink.copy(sub_408.ref());
        sink.end();
        Variable var_86 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_86});
        VariableUse use_0 = sink.context().makeVariableUse(var_86);
        sink.substitute(term_102.ref(), new Variable[] { var_96 }, new Term[] {use_0});
        sink.end();
        sink.end(); return true;
      }
      label_46: {
        if (term_266.descriptor() != _M_Crsx_xdeclaration_xA5)
        {   break label_46;
        }Term sub_488 = term_266.sub(0).ref();
        /* #directive=sub */
        /* #=term *//*Contract*/sink.properties(safeRef(props_24));
        sink.start(_M_N1Directive); sink.copy(sub_488.ref());
        Variable var_9 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_9});
        VariableUse use_45 = sink.context().makeVariableUse(var_9);
        sink.substitute(term_102.ref(), new Variable[] { var_96 }, new Term[] {use_45});
        sink.end(); return true;
      }
      label_186: {
        if (term_266.descriptor() != _M_Crsx_xdeclaration_xA1)
        {   break label_186;
        }Term sub_343 = term_266.sub(0).ref();
        if (sub_343.descriptor() != _M_Crsx_xmoduleDeclaration)
        {   break label_186;
        }Term sub_285 = sub_343.sub(0).ref();Term sub_359 = sub_343.sub(1).ref();
        /* #CONSTRUCTOR=sub */Term sub_707 = sub_343.sub(2).ref();Term sub_257 = sub_343.sub(3).ref();
        /* #declarations=sub */Term sub_267 = sub_343.sub(4).ref();
        /* #=term *//*Contract*/sink.properties(safeRef(props_24));
        sink.start(_M_N1Declarations);
        sink.start(_M_DesugarDeclarations); sink.copy(sub_257.ref());
        sink.end();
        Variable var_88 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_88});
        VariableUse use_197 = sink.context().makeVariableUse(var_88);
        sink.substitute(term_102.ref(), new Variable[] { var_96 }, new Term[] {use_197});
        sink.end(); return true;
      }
      label_233: {
        if (term_266.descriptor() != _M_Crsx_xdeclaration_xA3)
        {   break label_233;
        }Term sub_344 = term_266.sub(0).ref();
        if (sub_344.descriptor() != _M_Crsx_xruleDeclaration)
        {   break label_233;
        }Term sub_289 = sub_344.sub(0).ref();
        /* #option?=sub */Term sub_252 = sub_344.sub(1).ref();
        if (sub_252.descriptor() != _M_Crsx_xpattern)
        {   break label_233;
        }Term sub_232 = sub_252.sub(0).ref();
        /* #properties?=sub */Term sub_300 = sub_252.sub(1).ref();
        /* #constructor=sub */Term sub_370 = sub_252.sub(2).ref();
        /* #arguments?=sub */Term sub_350 = sub_344.sub(2).ref();Term sub_514 = sub_344.sub(3).ref();
        /* #contractum=sub */
        /* #=term *//*Contract*/sink.properties(safeRef(props_24));
        sink.start(_M_AddRule); sink.start(_M_RulesKey); sink.copy(sub_300.ref()); sink.end();
        sink.start(_M_Crsx_xruleDeclaration); sink.copy(sub_289.ref());
        sink.start(_M_Crsx_xpattern); sink.copy(sub_232.ref()); sink.copy(sub_300.ref()); sink.copy(sub_370.ref());
        sink.end(); sink.literal("\u2192"); sink.copy(sub_514.ref());
        sink.end();
        Variable var_54 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_54});
        VariableUse use_9 = sink.context().makeVariableUse(var_54);
        sink.substitute(term_102.ref(), new Variable[] { var_96 }, new Term[] {use_9});
        sink.end(); return true;
      }
      label_174: {
        if (term_266.descriptor() != _M_Crsx_xdeclaration_xA4)
        {   break label_174;
        }Term sub_277 = term_266.sub(0).ref();
        if (sub_277.descriptor() != _M_Crsx_xsortDeclaration_xA1)
        {   break label_174;
        }Term sub_276 = sub_277.sub(0).ref();
        /* #sortparams?=sub */Term sub_588 = sub_277.sub(1).ref();
        /* #sortset=sub */Term sub_242 = sub_277.sub(2).ref();
        /* #sortname=sub */Term sub_626 = sub_277.sub(3).ref();Term sub_291 = sub_277.sub(4).ref();Term sub_176 = sub_277.sub(5).ref();
        /* #forms=sub */Term sub_109 = sub_277.sub(6).ref();
        /* #=term *//*Contract*/sink.properties(safeRef(props_24));
        sink.start(_M_AddDataSort);
        sink.start(_M_Crsx_xsortDeclaration_xA1); sink.copy(sub_276.ref()); sink.copy(sub_588.ref()); sink.copy(sub_242.ref()); sink.literal("::="); sink.literal("("); sink.copy(sub_176.ref()); sink.literal(")");
        sink.end();
        Variable var_6 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_6});
        VariableUse use_28 = sink.context().makeVariableUse(var_6);
        sink.substitute(term_102.ref(), new Variable[] { var_96 }, new Term[] {use_28});
        sink.end(); return true;
      }
      label_255: {
        if (term_266.descriptor() != _M_Crsx_xdeclaration_xA4)
        {   break label_255;
        }Term sub_338 = term_266.sub(0).ref();
        if (sub_338.descriptor() != _M_Crsx_xsortDeclaration_xA2)
        {   break label_255;
        }Term sub_379 = sub_338.sub(0).ref();
        /* #sortparams?=sub */Term sub_419 = sub_338.sub(1).ref();
        /* #sortset=sub */Term sub_229 = sub_338.sub(2).ref();
        if (sub_229.descriptor() != _M_Crsx_xform_xA1)
        {   break label_255;
        }Term sub_439 = sub_229.sub(0).ref();
        /* #constructor=sub */Term sub_210 = sub_229.sub(1).ref();
        /* #arguments?=sub */Term sub_563 = sub_338.sub(3).ref();Term sub_136 = sub_338.sub(4).ref();
        /* #sortname=sub */
        /* #=term *//*Contract*/sink.properties(safeRef(props_24));
        sink.start(_M_AddFuncSort);
        sink.start(_M_Crsx_xsortDeclaration_xA2); sink.copy(sub_379.ref()); sink.copy(sub_419.ref());
        sink.start(_M_Crsx_xform_xA1); sink.copy(sub_439.ref()); sink.copy(sub_210.ref());
        sink.end(); sink.literal("::"); sink.copy(sub_136.ref());
        sink.end();
        Variable var_53 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_53});
        VariableUse use_62 = sink.context().makeVariableUse(var_53);
        sink.substitute(term_102.ref(), new Variable[] { var_96 }, new Term[] {use_62});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1Declaration, props_24, term_266, var_96, term_102);
  }   final public static boolean _M_N1Declarations1(Sink sink, int shared, int depth, Properties props_72, Term term_49, Term term_51, Variable var_120, Term term_58) {
    if (depth < 2000) {
      label_68: {
        if (term_49.descriptor() != _M_OK)
        {   break label_68;
        }
        if (term_51.descriptor() != _M__sNil)
        {   break label_68;
        }
        /* #=term *//*Contract*/sink.properties(safeRef(props_72));Term term_73;
        {
          BufferSink buf_64 = sink.context().makeBuffer(); buf_64.start(_M_OK); buf_64.end();
          term_73 = buf_64.term();
        }
        sink.substitute(term_58.ref(), new Variable[] { var_120 }, new Term[] {term_73}); return true;
      }
      label_73: {
        if (term_49.descriptor() != _M_OK)
        {   break label_73;
        }
        if (term_51.descriptor() != _M__sCons)
        {   break label_73;
        }Term sub_393 = term_51.sub(0).ref();
        if (sub_393.descriptor() != _M_Crsx_xdeclarations_xS1)
        {   break label_73;
        }Term sub_587 = sub_393.sub(0).ref();Term sub_182 = sub_393.sub(1).ref();
        if (sub_182.descriptor() != _M__sNil)
        {   break label_73;
        }Term sub_306 = term_51.sub(1).ref();
        if (sub_306.descriptor() != _M__sNil)
        {   break label_73;
        }
        /* #=term *//*Contract*/sink.properties(safeRef(props_72));Term term_254;
        {
          BufferSink buf_44 = sink.context().makeBuffer(); buf_44.start(_M_OK); buf_44.end();
          term_254 = buf_44.term();
        }
        sink.substitute(term_58.ref(), new Variable[] { var_120 }, new Term[] {term_254}); return true;
      }
      label_105: {
        if (term_49.descriptor() != _M_OK)
        {   break label_105;
        }
        if (term_51.descriptor() != _M__sCons)
        {   break label_105;
        }Term sub_322 = term_51.sub(0).ref();
        if (sub_322.descriptor() != _M_Crsx_xdeclarations_xS1)
        {   break label_105;
        }Term sub_213 = sub_322.sub(0).ref();Term sub_308 = sub_322.sub(1).ref();
        if (sub_308.descriptor() != _M__sCons)
        {   break label_105;
        }Term sub_204 = sub_308.sub(0).ref();
        /* #declaration=sub */Term sub_410 = sub_308.sub(1).ref();
        if (sub_410.descriptor() != _M__sNil)
        {   break label_105;
        }Term sub_567 = term_51.sub(1).ref();
        /* #declarations_S1*=sub */
        /* #=term *//*Contract*/sink.properties(safeRef(props_72));
        sink.start(_M_N1Declaration); sink.copy(sub_204.ref());
        Variable var_37 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_37});
        sink.start(_M_N1Declarations1); sink.use(var_37); sink.copy(sub_567.ref());
        Variable var_98 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_98});
        VariableUse use_35 = sink.context().makeVariableUse(var_98);
        sink.substitute(term_58.ref(), new Variable[] { var_120 }, new Term[] {use_35});
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1Declarations1, props_72, term_49, term_51, var_120, term_58);
  }    final public static boolean _M_N1Declarations(Sink sink, int shared, int depth, Properties props_20, Term term_144, Variable var_35, Term term_86) {
    if (depth < 2000) {
      label_267: {
        /* #declarations=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_20));
        sink.start(_M_N1Declarations1); sink.start(_M_OK); sink.end(); sink.copy(term_144.ref());
        Variable var_44 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_44});
        VariableUse use_92 = sink.context().makeVariableUse(var_44);
        sink.substitute(term_86.ref(), new Variable[] { var_35 }, new Term[] {use_92});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1Declarations, props_20, term_144, var_35, term_86);
  }   final public static boolean _M_N1DeclarationsInit(Sink sink, int shared, int depth, Term term_68, Term term_262, Variable var_57, Term term_47) {
    if (depth < 2000) {
      label_91: {
        /* #qualifier=term */
        /* #declarations=term */
        /* #=term *//*Contract*/Term term_89;
        {
          BufferSink buf_48 = sink.context().makeBuffer();
          buf_48.start(_M_STR); buf_48.copy(term_68.ref());
          buf_48.end();
          term_89 = buf_48.term();
        } sink.propertyNamed("$qualifier", term_89);Term term_140;
        {
          BufferSink buf_26 = sink.context().makeBuffer();
          buf_26.start(_M_KEYS); buf_26.start(_M__sNil); buf_26.end();
          buf_26.end();
          term_140 = buf_26.term();
        } sink.propertyNamed("$rulekeys", term_140);Term term_145;
        {
          BufferSink buf_25 = sink.context().makeBuffer();
          buf_25.start(_M_KEYS); buf_25.start(_M__sNil); buf_25.end();
          buf_25.end();
          term_145 = buf_25.term();
        } sink.propertyNamed("$datakeys", term_145);Term term_360;
        {
          BufferSink buf_47 = sink.context().makeBuffer();
          buf_47.start(_M_KEYS); buf_47.start(_M__sNil); buf_47.end();
          buf_47.end();
          term_360 = buf_47.term();
        } sink.propertyNamed("$funckeys", term_360);Term term_38;
        {
          BufferSink buf_91 = sink.context().makeBuffer();
          buf_91.start(_M_IMPORTS); buf_91.start(_M__sNil); buf_91.end();
          buf_91.end();
          term_38 = buf_91.term();
        } sink.propertyNamed("$imported", term_38);Term term_105;
        {
          BufferSink buf_22 = sink.context().makeBuffer();
          buf_22.start(_M_IMPORTS); buf_22.start(_M__sNil); buf_22.end();
          buf_22.end();
          term_105 = buf_22.term();
        } sink.propertyNamed("$grammars", term_105);
        sink.start(_M_N1Declarations); sink.copy(term_262.ref());
        Variable var_39 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_39});
        VariableUse use_87 = sink.context().makeVariableUse(var_39);
        sink.substitute(term_47.ref(), new Variable[] { var_57 }, new Term[] {use_87});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1DeclarationsInit, term_68, term_262, var_57, term_47);
  }    final public static boolean _M_NormalizeToState(Sink sink, int shared, int depth, Term term_34, Term term_21) {
    if (depth < 2000) {
      label_2: {
        /* #filename=term */
        if (term_21.descriptor() != _M_Crsx_xcrsx)
        {   break label_2;
        }Term sub_383 = term_21.sub(0).ref();
        /* #declarations=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sTrace); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("Normalize "); sink.copy(term_34.ref());
        sink.end();
        sink.start(_M_N1DeclarationsInit); sink.start(_M_BaseName); sink.copy(term_34.ref()); sink.end();
        sink.start(_M_DesugarDeclarations); sink.copy(sub_383.ref());
        sink.end();
        Variable var_18 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_18});
        sink.start(_M_N2); sink.use(var_18);
        Variable var_74 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_74}); sink.start(_M_LOADED); sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeToState, term_34, term_21);
  }  final public static boolean _M_NormalizeToCrsx(Sink sink, int shared, int depth, Term term_98, Term term_209) {
    if (depth < 2000) {
      label_119: {
        /* #filename=term */
        if (term_209.descriptor() != _M_Crsx_xcrsx)
        {   break label_119;
        }Term sub_434 = term_209.sub(0).ref();
        /* #declarations=sub *//*Contract*/
        sink.start(_M_N1DeclarationsInit); sink.start(_M_BaseName); sink.copy(term_98.ref()); sink.end();
        sink.start(_M_DesugarDeclarations); sink.copy(sub_434.ref());
        sink.end();
        Variable var_85 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_85});
        sink.start(_M_N2); sink.use(var_85);
        Variable var_197 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_197}); sink.start(_M_OutputCrsx); sink.use(var_197); sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeToCrsx, term_98, term_209);
  }  
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.parser.Crsx.init(context); org.crsx.compiler.State.init(context); org.crsx.compiler.Crsxutils.init(context); org.crsx.compiler.std.Core.init(context); org.crsx.compiler.std.String.init(context); org.crsx.compiler.std.List.init(context); org.crsx.compiler.std.Num.init(context); org.crsx.compiler.std.Path.init(context); context.registerParser("org.crsx.parser.CrsxMetaParser"); context.register(_M_NormalizeDispatchCases); context.register(_M_NormalizeDispatch); context.register(_M_NormalizeConcrete); context.register(_M_NormalizeFreeTerms); context.register(_M_NormalizeFreeArgumentsOpt); context.register(_M_MakeBuiltin); context.register(_M_NormalizeConstructor); context.register(_M_NormalizeFreeTerm); context.register(_M_NormalizeNextBinder); context.register(_M_NormalizeTerm); context.register(_M_NormalizeTerms); context.register(_M_NormalizeArgumentsOpt); context.register(_M_NormalizeProperties); context.register(_M_NormalizePropertiesOpt); context.register(_M_NormalizeRule); context.register(_M_NormalizeRules); context.register(_M_NormalizeRuleKey1); context.register(_M_NormalizeRuleKey); context.register(_M_DispatchCases); context.register(_M_DispatchMetaArgsOpt); context.register(_M_DispatchPatternNextBinder); context.register(_M_DispatchPatternBinder); context.register(_M_DispatchPatternFreeTerm); context.register(_M_DispatchPatternTerm); context.register(_M_DispatchPatternArgs); context.register(_M_DispatchProperties); context.register(_M_Dispatch); context.register(_M_GroupRule); context.register(_M_MayGroupRule2); context.register(_M_MayGroupRule1); context.register(_M_MayGroupRule); context.register(_M_N2Rule); context.register(_M_N2Rules); context.register(_M_N2); context.register(_M_N1ImportDirective); context.register(_M_N1ImportDirectives); context.register(_M_N1Import); context.register(_M_N1DirectiveConstructor); context.register(_M_N1Directive); context.register(_M_N1Declaration); context.register(_M_N1Declarations1); context.register(_M_N1Declarations); context.register(_M_N1DeclarationsInit); context.register(_M_NormalizeToState); context.register(_M_NormalizeToCrsx);
      initialized = true;
    }
  }

/* END MODULE « "/Users/villardl/Projects/crsx/crsx4/src/normalizer.crs.java" » */
}