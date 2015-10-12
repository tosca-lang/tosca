/* START MODULE /Users/villardl/Projects/crsx/crsx4_2/src/normalizer.crs.java */
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
      label_52: {
        if (term.descriptor() != _M__sCons)
        {   break label_52;
        }Term sub = term.sub(0).ref();
        if (sub.descriptor() != _M_Crsx_xdispatchCases_xS1)
        {   break label_52;
        }Term sub_51 = sub.sub(0).ref();Term sub_77 = sub.sub(1).ref();
        if (sub_77.descriptor() != _M_Crsx_xdispatchCase)
        {   break label_52;
        }Term sub_73 = sub_77.sub(0).ref();
        /* #ruleDeclaration=sub */Term sub_65 = term.sub(1).ref();
        /* #dispatchCases_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdispatchCases_xS1); sink.literal(";");
        sink.start(_M_Crsx_xdispatchCase);sink.properties(safeRef(props));
        sink.start(_M_NormalizeRule); sink.copy(sub_73.ref());
        sink.end();
        sink.end();
        sink.end();sink.properties(safeRef(props));
        sink.start(_M_NormalizeDispatchCases); sink.copy(sub_65.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeDispatchCases, props, term);
  } final public static boolean _M_NormalizeDispatch(Sink sink, int shared, int depth, Properties props_16, Term term_53) {
    if (depth < 2000) {
      label_26: {
        if (term_53.descriptor() != _M_Crsx_xdispatch)
        {   break label_26;
        }Term sub_92 = term_53.sub(0).ref();Term sub_91 = term_53.sub(1).ref();
        if (sub_91.descriptor() != _M_Crsx_xdispatchTerm)
        {   break label_26;
        }Term sub_87 = sub_91.sub(0).ref();
        /* #freeTerm=sub */Term sub_33 = term_53.sub(2).ref();
        /* #dispatchCases=sub */Term sub_89 = term_53.sub(3).ref();
        /* #delayCase?=sub *//*Contract*/
        sink.start(_M_Crsx_xdispatch); sink.literal("dispatch");
        sink.start(_M_Crsx_xdispatchTerm);sink.properties(safeRef(props_16));
        sink.start(_M_NormalizeFreeTerm); sink.copy(sub_87.ref());
        sink.end();
        sink.end();
        sink.start(_M_SugarDispatchCases);sink.properties(safeRef(props_16));
        sink.start(_M_NormalizeDispatchCases);
        sink.start(_M_DesugarDispatchCases); sink.copy(sub_33.ref());
        sink.end();
        sink.end();
        sink.end(); sink.copy(sub_89.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeDispatch, props_16, term_53);
  } final public static boolean _M_NormalizeConcrete(Sink sink, int shared, int depth, Properties props_94, Term term_16) {
    if (depth < 2000) {
      label_76: {
        if (term_16.descriptor() != _M_Crsx_xconcrete_xA1)
        {   break label_76;
        }Term sub_45 = term_16.sub(0).ref();
        /* #CATEGORY=sub */Term sub_66 = term_16.sub(1).ref();
        /* #CONCRETE=sub *//*Contract*/sink.properties(safeRef(props_94));
        sink.start(_M_NormalizeFreeTerm);
        sink.start(_M_ParseToTerm); sink.literal("freeTerm");
        sink.start(_M_ParseToString);
        sink.start(_M_RemoveFirstChar); sink.copy(sub_45.ref());
        sink.end();
        sink.start(_M_RemoveFirstChar);
        sink.start(_M_RemoveLastChar); sink.copy(sub_66.ref());
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeConcrete, props_94, term_16);
  } final public static boolean _M_NormalizeFreeTerms(Sink sink, int shared, int depth, Properties props_69, Term term_22) {
    if (depth < 2000) {
      label_57: {
        if (term_22.descriptor() != _M__sNil)
        {   break label_57;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_34: {
        if (term_22.descriptor() != _M__sCons)
        {   break label_34;
        }Term sub_54 = term_22.sub(0).ref();
        if (sub_54.descriptor() != _M_Crsx_xfreeTerms_xS1)
        {   break label_34;
        }Term sub_14 = sub_54.sub(0).ref();Term sub_21 = sub_54.sub(1).ref();
        /* #freeTerm=sub */Term sub_57 = term_22.sub(1).ref();
        /* #freeTerms_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeTerms_xS1); sink.literal(",");sink.properties(safeRef(props_69));
        sink.start(_M_NormalizeFreeTerm); sink.copy(sub_21.ref());
        sink.end();
        sink.end();sink.properties(safeRef(props_69));
        sink.start(_M_NormalizeFreeTerms); sink.copy(sub_57.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeFreeTerms, props_69, term_22);
  } final public static boolean _M_NormalizeFreeArgumentsOpt(Sink sink, int shared, int depth, Properties props_27, Term term_29) {
    if (depth < 2000) {
      label_45: {
        if (term_29.descriptor() != _M__sNil)
        {   break label_45;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_59: {
        if (term_29.descriptor() != _M__sCons)
        {   break label_59;
        }Term sub_53 = term_29.sub(0).ref();
        if (sub_53.descriptor() != _M_Crsx_xfreeArguments)
        {   break label_59;
        }Term sub_40 = sub_53.sub(0).ref();Term sub_94 = sub_53.sub(1).ref();
        if (sub_94.descriptor() != _M__sNil)
        {   break label_59;
        }Term sub_39 = sub_53.sub(2).ref();Term sub_6 = term_29.sub(1).ref();
        if (sub_6.descriptor() != _M__sNil)
        {   break label_59;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_66: {
        if (term_29.descriptor() != _M__sCons)
        {   break label_66;
        }Term sub_36 = term_29.sub(0).ref();
        if (sub_36.descriptor() != _M_Crsx_xfreeArguments)
        {   break label_66;
        }Term sub_81 = sub_36.sub(0).ref();Term sub_25 = sub_36.sub(1).ref();
        if (sub_25.descriptor() != _M__sCons)
        {   break label_66;
        }Term sub_19 = sub_25.sub(0).ref();
        /* #freeTerms=sub */Term sub_55 = sub_25.sub(1).ref();
        if (sub_55.descriptor() != _M__sNil)
        {   break label_66;
        }Term sub_24 = sub_36.sub(2).ref();Term sub_5 = term_29.sub(1).ref();
        if (sub_5.descriptor() != _M__sNil)
        {   break label_66;
        }/*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeArguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_SugarFreeTerms);
        sink.start(_M_NormalizeFreeTerms);
        sink.start(_M_DesugarFreeTerms); sink.copy(sub_19.ref());
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeFreeArgumentsOpt, props_27, term_29);
  } final public static boolean _M_MakeBuiltin(Sink sink, int shared, int depth, Term term_97) {
    if (depth < 2000) {
      label_3: {
        if (term_97.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_3;
        }Term sub_109 = term_97.sub(0).ref();
        if (sub_109.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_3;
        }Term sub_46 = term_97.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("Builtin$"); sink.copy(sub_46.ref());
        sink.end();
        sink.end(); return true;
      }
      label_7: {
        if (term_97.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_7;
        }Term sub_18 = term_97.sub(0).ref();
        if (sub_18.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_7;
        }Term sub_42 = sub_18.sub(0).ref();/*Contract*/
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.literal("Builtin$Colon");
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_MakeBuiltin, term_97);
  } final public static boolean _M_NormalizeConstructor(Sink sink, int shared, int depth, Properties props_58, Term term_24, Term term_30, Term term_12, Term term_95, Term term_67) {
    if (depth < 2000) {
      label_1: {
        if (term_24.descriptor() != _M_TRUE)
        {   break label_1;
        }
        /* #annotations?=term */
        /* #properties?2=term */
        /* #constructor=term */
        if (term_67.descriptor() != _M__sCons)
        {   break label_1;
        }Term sub_82 = term_67.sub(0).ref();
        if (sub_82.descriptor() != _M_Crsx_xarguments)
        {   break label_1;
        }Term sub_225 = sub_82.sub(0).ref();Term sub_3 = sub_82.sub(1).ref();
        if (sub_3.descriptor() != _M__sCons)
        {   break label_1;
        }Term sub_34 = sub_3.sub(0).ref();
        if (sub_34.descriptor() != _M_Crsx_xterms)
        {   break label_1;
        }Term sub_96 = sub_34.sub(0).ref();
        if (sub_96.descriptor() != _M_Crsx_xterm_xA1)
        {   break label_1;
        }Term sub_181 = sub_96.sub(0).ref();
        if (sub_181.descriptor() != _M_Crsx_xfreeTerm_xA1)
        {   break label_1;
        }Term sub_99 = sub_181.sub(0).ref();
        if (sub_99.descriptor() != _M__sNil)
        {   break label_1;
        }Term sub_61 = sub_181.sub(1).ref();
        /* #properties?=sub */Term sub_86 = sub_181.sub(2).ref();
        /* #constructor2=sub */Term sub_72 = sub_181.sub(3).ref();
        if (sub_72.descriptor() != _M__sNil)
        {   break label_1;
        }Term sub_131 = sub_34.sub(1).ref();
        /* #terms_S1*=sub */Term sub_95 = sub_3.sub(1).ref();
        if (sub_95.descriptor() != _M__sNil)
        {   break label_1;
        }Term sub_10 = sub_82.sub(2).ref();Term sub_50 = term_67.sub(1).ref();
        if (sub_50.descriptor() != _M__sNil)
        {   break label_1;
        }/*Contract*/sink.properties(safeRef(props_58));
        sink.start(_M_NormalizeConstructor); sink.start(_M_FALSE); sink.end(); sink.copy(term_30.ref()); sink.copy(term_12.ref()); sink.copy(term_95.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms);
        sink.start(_M_Crsx_xterm_xA1);
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.start(_M__sNil); sink.end(); sink.copy(sub_61.ref());
        sink.start(_M_MakeBuiltin); sink.copy(sub_86.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.copy(sub_131.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_95: {
        if (term_24.descriptor() != _M_FALSE)
        {   break label_95;
        }
        /* #annotations?=term */
        /* #properties?=term */
        /* #constructor=term */
        /* #arguments?=term *//*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.copy(term_30.ref());sink.properties(safeRef(props_58));
        sink.start(_M_NormalizePropertiesOpt); sink.copy(term_12.ref());
        sink.end(); sink.copy(term_95.ref());sink.properties(safeRef(props_58));
        sink.start(_M_NormalizeArgumentsOpt); sink.copy(term_67.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeConstructor, props_58, term_24, term_30, term_12, term_95, term_67);
  }     final public static boolean _M_NormalizeFreeTerm(Sink sink, int shared, int depth, Properties props_43, Term term_134) {
    if (depth < 2000) {
      label_24: {
        if (term_134.descriptor() != _M_Crsx_xfreeTerm_xA1)
        {   break label_24;
        }Term sub_68 = term_134.sub(0).ref();
        /* #annotations?=sub */Term sub_70 = term_134.sub(1).ref();
        /* #properties?=sub */Term sub_132 = term_134.sub(2).ref();
        /* #constructor=sub */Term sub_1 = term_134.sub(3).ref();
        /* #arguments?=sub *//*Contract*/sink.properties(safeRef(props_43));
        sink.start(_M_NormalizeConstructor);
        sink.start(_M_IsPrimitive); sink.copy(sub_132.ref());
        sink.end(); sink.copy(sub_68.ref()); sink.copy(sub_70.ref()); sink.copy(sub_132.ref()); sink.copy(sub_1.ref());
        sink.end(); return true;
      }
      label_46: {
        if (term_134.descriptor() != _M_Crsx_xfreeTerm_xA2)
        {   break label_46;
        }Term sub_194 = term_134.sub(0).ref();
        /* #annotations?=sub */Term sub_63 = term_134.sub(1).ref();
        /* #properties?=sub */Term sub_13 = term_134.sub(2).ref();
        /* #constructor=sub */Term sub_38 = term_134.sub(3).ref();
        /* #term=sub *//*Contract*/sink.properties(safeRef(props_43));
        sink.start(_M_NormalizeFreeTerm);
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.copy(sub_194.ref()); sink.copy(sub_63.ref()); sink.copy(sub_13.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms); sink.copy(sub_38.ref()); sink.start(_M__sNil); sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_38: {
        if (term_134.descriptor() != _M_Crsx_xfreeTerm_xA3)
        {   break label_38;
        }Term sub_2 = term_134.sub(0).ref();
        /* #annotations?=sub */Term sub_200 = term_134.sub(1).ref();
        /* #properties?=sub */Term sub_8 = term_134.sub(2).ref();
        /* #literal=sub *//*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA3); sink.copy(sub_2.ref());sink.properties(safeRef(props_43));
        sink.start(_M_NormalizePropertiesOpt); sink.copy(sub_200.ref());
        sink.end(); sink.copy(sub_8.ref());
        sink.end(); return true;
      }
      label_98: {
        if (term_134.descriptor() != _M_Crsx_xfreeTerm_xA4)
        {   break label_98;
        }Term sub_138 = term_134.sub(0).ref();
        /* #annotations?=sub */Term sub_78 = term_134.sub(1).ref();
        /* #list=sub *//*Contract*/sink.properties(safeRef(props_43));
        sink.start(_M_NormalizeFreeTerm);
        sink.start(_M_DesugarList); sink.copy(sub_78.ref());
        sink.end();
        sink.end(); return true;
      }
      label_55: {
        if (term_134.descriptor() != _M_Crsx_xfreeTerm_xA5)
        {   break label_55;
        }Term sub_79 = term_134.sub(0).ref();
        /* #annotations?=sub */Term sub_30 = term_134.sub(1).ref();
        /* #variable=sub *//*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA5); sink.copy(sub_79.ref()); sink.copy(sub_30.ref());
        sink.end(); return true;
      }
      label_15: {
        if (term_134.descriptor() != _M_Crsx_xfreeTerm_xA6)
        {   break label_15;
        }Term sub_35 = term_134.sub(0).ref();
        /* #annotations?=sub */Term sub_26 = term_134.sub(1).ref();
        if (sub_26.descriptor() != _M_Crsx_xproperties)
        {   break label_15;
        }Term sub_197 = sub_26.sub(0).ref();Term sub_20 = sub_26.sub(1).ref();
        if (sub_20.descriptor() != _M__sCons)
        {   break label_15;
        }Term sub_15 = sub_20.sub(0).ref();
        /* #propertyList=sub */Term sub_32 = sub_20.sub(1).ref();
        if (sub_32.descriptor() != _M__sNil)
        {   break label_15;
        }Term sub_43 = sub_26.sub(2).ref();/*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA6); sink.copy(sub_35.ref());
        sink.start(_M_Crsx_xproperties); sink.literal("{");
        sink.start(_M__sCons);
        sink.start(_M_SugarPropertyList);sink.properties(safeRef(props_43));
        sink.start(_M_NormalizeProperties);
        sink.start(_M_DesugarPropertyList); sink.copy(sub_15.ref());
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("}");
        sink.end();
        sink.end(); return true;
      }
      label_139: {
        if (term_134.descriptor() != _M_Crsx_xfreeTerm_xA7)
        {   break label_139;
        }Term sub_64 = term_134.sub(0).ref();
        /* #annotations?=sub */Term sub_214 = term_134.sub(1).ref();
        /* #properties?=sub */Term sub_28 = term_134.sub(2).ref();
        /* #METAVAR=sub */Term sub_12 = term_134.sub(3).ref();
        /* #freeArguments?=sub *//*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA7); sink.copy(sub_64.ref());sink.properties(safeRef(props_43));
        sink.start(_M_NormalizePropertiesOpt); sink.copy(sub_214.ref());
        sink.end(); sink.copy(sub_28.ref());sink.properties(safeRef(props_43));
        sink.start(_M_NormalizeFreeArgumentsOpt); sink.copy(sub_12.ref());
        sink.end();
        sink.end(); return true;
      }
      label_0: {
        if (term_134.descriptor() != _M_Crsx_xfreeTerm_xA8)
        {   break label_0;
        }Term sub_74 = term_134.sub(0).ref();
        /* #annotations?=sub */Term sub_23 = term_134.sub(1).ref();
        /* #concrete=sub *//*Contract*/sink.properties(safeRef(props_43));
        sink.start(_M_NormalizeConcrete); sink.copy(sub_23.ref());
        sink.end(); return true;
      }
      label_93: {
        if (term_134.descriptor() != _M_Crsx_xfreeTerm_xA9)
        {   break label_93;
        }Term sub_149 = term_134.sub(0).ref();
        /* #annotations?=sub */Term sub_22 = term_134.sub(1).ref();
        /* #properties?=sub */Term sub_129 = term_134.sub(2).ref();
        if (sub_129.descriptor() != _M_Crsx_xexpression)
        {   break label_93;
        }Term sub_11 = sub_129.sub(0).ref();
        /* #dispatch=sub *//*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA9); sink.copy(sub_149.ref());sink.properties(safeRef(props_43));
        sink.start(_M_NormalizePropertiesOpt); sink.copy(sub_22.ref());
        sink.end();
        sink.start(_M_Crsx_xexpression);sink.properties(safeRef(props_43));
        sink.start(_M_NormalizeDispatch); sink.copy(sub_11.ref());
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeFreeTerm, props_43, term_134);
  } final public static boolean _M_NormalizeNextBinder(Sink sink, int shared, int depth, Properties props_72, Term term_86) {
    if (depth < 2000) {
      label_163: {
        if (term_86.descriptor() != _M_Crsx_xnextBinder_xA1)
        {   break label_163;
        }Term sub_29 = term_86.sub(0).ref();
        /* #binder=sub */Term sub_151 = term_86.sub(1).ref();
        /* #nextBinder=sub *//*Contract*/
        sink.start(_M_Crsx_xnextBinder_xA1); sink.copy(sub_29.ref());sink.properties(safeRef(props_72));
        sink.start(_M_NormalizeNextBinder); sink.copy(sub_151.ref());
        sink.end();
        sink.end(); return true;
      }
      label_51: {
        if (term_86.descriptor() != _M_Crsx_xnextBinder_xA2)
        {   break label_51;
        }Term sub_135 = term_86.sub(0).ref();Term sub_103 = term_86.sub(1).ref();
        /* #freeTerm=sub *//*Contract*/
        sink.start(_M_Crsx_xnextBinder_xA2); sink.literal(".");sink.properties(safeRef(props_72));
        sink.start(_M_NormalizeFreeTerm); sink.copy(sub_103.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeNextBinder, props_72, term_86);
  } final public static boolean _M_NormalizeTerm(Sink sink, int shared, int depth, Properties props_82, Term term_15) {
    if (depth < 2000) {
      label_31: {
        if (term_15.descriptor() != _M_Crsx_xterm_xA1)
        {   break label_31;
        }Term sub_171 = term_15.sub(0).ref();
        /* #freeTerm=sub *//*Contract*/
        sink.start(_M_Crsx_xterm_xA1);sink.properties(safeRef(props_82));
        sink.start(_M_NormalizeFreeTerm); sink.copy(sub_171.ref());
        sink.end();
        sink.end(); return true;
      }
      label_2: {
        if (term_15.descriptor() != _M_Crsx_xterm_xA2)
        {   break label_2;
        }Term sub_145 = term_15.sub(0).ref();
        if (sub_145.descriptor() != _M_Crsx_xboundTerm)
        {   break label_2;
        }Term sub_84 = sub_145.sub(0).ref();
        /* #binder=sub */Term sub_85 = sub_145.sub(1).ref();
        /* #nextBinder=sub *//*Contract*/
        sink.start(_M_Crsx_xterm_xA2);
        sink.start(_M_Crsx_xboundTerm); sink.copy(sub_84.ref());sink.properties(safeRef(props_82));
        sink.start(_M_NormalizeNextBinder); sink.copy(sub_85.ref());
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeTerm, props_82, term_15);
  } final public static boolean _M_NormalizeTerms(Sink sink, int shared, int depth, Properties props_52, Term term_18) {
    if (depth < 2000) {
      label_20: {
        if (term_18.descriptor() != _M__sNil)
        {   break label_20;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_16: {
        if (term_18.descriptor() != _M__sCons)
        {   break label_16;
        }Term sub_69 = term_18.sub(0).ref();
        if (sub_69.descriptor() != _M_Crsx_xterms_xS1)
        {   break label_16;
        }Term sub_295 = sub_69.sub(0).ref();Term sub_93 = sub_69.sub(1).ref();
        /* #term=sub */Term sub_218 = term_18.sub(1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms_xS1); sink.literal(",");sink.properties(safeRef(props_52));
        sink.start(_M_NormalizeTerm); sink.copy(sub_93.ref());
        sink.end();
        sink.end();sink.properties(safeRef(props_52));
        sink.start(_M_NormalizeTerms); sink.copy(sub_218.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeTerms, props_52, term_18);
  } final public static boolean _M_NormalizeArgumentsOpt(Sink sink, int shared, int depth, Properties props_168, Term term_60) {
    if (depth < 2000) {
      label_42: {
        if (term_60.descriptor() != _M__sNil)
        {   break label_42;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_67: {
        if (term_60.descriptor() != _M__sCons)
        {   break label_67;
        }Term sub_27 = term_60.sub(0).ref();
        if (sub_27.descriptor() != _M_Crsx_xarguments)
        {   break label_67;
        }Term sub_110 = sub_27.sub(0).ref();Term sub_114 = sub_27.sub(1).ref();
        if (sub_114.descriptor() != _M__sNil)
        {   break label_67;
        }Term sub_17 = sub_27.sub(2).ref();Term sub_193 = term_60.sub(1).ref();
        if (sub_193.descriptor() != _M__sNil)
        {   break label_67;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_137: {
        if (term_60.descriptor() != _M__sCons)
        {   break label_137;
        }Term sub_9 = term_60.sub(0).ref();
        if (sub_9.descriptor() != _M_Crsx_xarguments)
        {   break label_137;
        }Term sub_117 = sub_9.sub(0).ref();Term sub_168 = sub_9.sub(1).ref();
        if (sub_168.descriptor() != _M__sCons)
        {   break label_137;
        }Term sub_106 = sub_168.sub(0).ref();
        /* #terms=sub */Term sub_56 = sub_168.sub(1).ref();
        if (sub_56.descriptor() != _M__sNil)
        {   break label_137;
        }Term sub_60 = sub_9.sub(2).ref();Term sub_52 = term_60.sub(1).ref();
        if (sub_52.descriptor() != _M__sNil)
        {   break label_137;
        }/*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_SugarTerms);
        sink.start(_M_NormalizeTerms);
        sink.start(_M_DesugarTerms); sink.copy(sub_106.ref());
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeArgumentsOpt, props_168, term_60);
  } final public static boolean _M_NormalizeProperties(Sink sink, int shared, int depth, Properties props_44, Term term_36) {
    if (depth < 2000) { sink.copy(term_36.ref()); return true;
    }
    return thunk(sink, _M_NormalizeProperties, props_44, term_36);
  } final public static boolean _M_NormalizePropertiesOpt(Sink sink, int shared, int depth, Properties props_1, Term term_9) {
    if (depth < 2000) {
      label_86: {
        if (term_9.descriptor() != _M__sNil)
        {   break label_86;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_99: {
        if (term_9.descriptor() != _M__sCons)
        {   break label_99;
        }Term sub_59 = term_9.sub(0).ref();
        if (sub_59.descriptor() != _M_Crsx_xproperties)
        {   break label_99;
        }Term sub_217 = sub_59.sub(0).ref();Term sub_49 = sub_59.sub(1).ref();
        if (sub_49.descriptor() != _M__sNil)
        {   break label_99;
        }Term sub_191 = sub_59.sub(2).ref();Term sub_206 = term_9.sub(1).ref();
        if (sub_206.descriptor() != _M__sNil)
        {   break label_99;
        }/*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xproperties); sink.literal("{"); sink.start(_M__sNil); sink.end(); sink.literal("}");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
      label_174: {
        if (term_9.descriptor() != _M__sCons)
        {   break label_174;
        }Term sub_209 = term_9.sub(0).ref();
        if (sub_209.descriptor() != _M_Crsx_xproperties)
        {   break label_174;
        }Term sub_44 = sub_209.sub(0).ref();Term sub_155 = sub_209.sub(1).ref();
        if (sub_155.descriptor() != _M__sCons)
        {   break label_174;
        }Term sub_282 = sub_155.sub(0).ref();
        /* #propertyList=sub */Term sub_226 = sub_155.sub(1).ref();
        if (sub_226.descriptor() != _M__sNil)
        {   break label_174;
        }Term sub_156 = sub_209.sub(2).ref();Term sub_154 = term_9.sub(1).ref();
        if (sub_154.descriptor() != _M__sNil)
        {   break label_174;
        }/*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xproperties); sink.literal("{");
        sink.start(_M__sCons);
        sink.start(_M_SugarPropertyList);sink.properties(safeRef(props_1));
        sink.start(_M_NormalizeProperties);
        sink.start(_M_DesugarPropertyList); sink.copy(sub_282.ref());
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("}");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizePropertiesOpt, props_1, term_9);
  } final public static boolean _M_NormalizeRule(Sink sink, int shared, int depth, Properties props_70, Term term_61) {
    if (depth < 2000) {
      label_64: {
        if (term_61.descriptor() != _M_Crsx_xruleDeclaration)
        {   break label_64;
        }Term sub_258 = term_61.sub(0).ref();
        /* #option?=sub */Term sub_71 = term_61.sub(1).ref();
        if (sub_71.descriptor() != _M_Crsx_xpattern)
        {   break label_64;
        }Term sub_220 = sub_71.sub(0).ref();
        /* #properties?=sub */Term sub_136 = sub_71.sub(1).ref();
        /* #constructor=sub */Term sub_130 = sub_71.sub(2).ref();
        /* #arguments?=sub */Term sub_133 = term_61.sub(2).ref();Term sub_152 = term_61.sub(3).ref();
        if (sub_152.descriptor() != _M_Crsx_xcontractum)
        {   break label_64;
        }Term sub_121 = sub_152.sub(0).ref();
        /* #freeTerm=sub *//*Contract*/
        sink.start(_M_Crsx_xruleDeclaration); sink.copy(sub_258.ref());
        sink.start(_M_Crsx_xpattern);sink.properties(safeRef(props_70));
        sink.start(_M_NormalizePropertiesOpt); sink.copy(sub_220.ref());
        sink.end(); sink.copy(sub_136.ref());sink.properties(safeRef(props_70));
        sink.start(_M_NormalizeArgumentsOpt); sink.copy(sub_130.ref());
        sink.end();
        sink.end(); sink.literal("\u2192");
        sink.start(_M_Crsx_xcontractum);sink.properties(safeRef(props_70));
        sink.start(_M_NormalizeFreeTerm); sink.copy(sub_121.ref());
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeRule, props_70, term_61);
  } final public static boolean _M_NormalizeRules(Sink sink, int shared, int depth, Properties props_75, Term term_66) {
    if (depth < 2000) {
      label_47: {
        if (term_66.descriptor() != _M__sCons)
        {   break label_47;
        }Term sub_182 = term_66.sub(0).ref();
        /* #rule=sub */Term sub_270 = term_66.sub(1).ref();
        if (sub_270.descriptor() != _M__sNil)
        {   break label_47;
        }/*Contract*/
        sink.start(_M__sCons);sink.properties(safeRef(props_75));
        sink.start(_M_NormalizeRule); sink.copy(sub_182.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeRules, props_75, term_66);
  } final public static boolean _M_NormalizeRuleKey1(Sink sink, int shared, int depth, Properties props_20, Term term_27, Term term_41, Variable var, Term term_8) {
    if (depth < 2000) {
      label_53: {
        if (term_27.descriptor() != _M_RULES)
        {   break label_53;
        }Term sub_339 = term_27.sub(0).ref();
        /* #rules=sub */
        /* #key=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_20));Term term_0;
        {
          BufferSink buf = sink.context().makeBuffer();
          buf.start(_M_RULES);buf.properties(safeRef(props_20));
          buf.start(_M_NormalizeRules); buf.copy(sub_339.ref());
          buf.end();
          buf.end();
          term_0 = buf.term();
        }
        term_41 = force(sink.context(), term_41);
        Sink.property(sink, term_41, term_0);Term term_72;
        {
          BufferSink buf_70 = sink.context().makeBuffer(); buf_70.start(_M_OK); buf_70.end();
          term_72 = buf_70.term();
        }
        sink.substitute(term_8.ref(), new Variable[] { var }, new Term[] {term_72}); return true;
      }
    }
    return thunk(sink, _M_NormalizeRuleKey1, props_20, term_27, term_41, var, term_8);
  }    final public static boolean _M_NormalizeRuleKey(Sink sink, int shared, int depth, Properties props_6, Term term_4, Term term_14, Variable var_14, Term term_13) {
    if (depth < 2000) {
      label_138: {
        if (term_4.descriptor() != _M_OK)
        {   break label_138;
        }
        /* #key=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_6));
        sink.start(_M_NormalizeRuleKey1);
        sink.start(_M__s);sink.properties(safeRef(props_6));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_14.ref());
        sink.end(); sink.copy(term_14.ref());
        Variable var_40 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_40});
        VariableUse use = sink.context().makeVariableUse(var_40);
        sink.substitute(term_13.ref(), new Variable[] { var_14 }, new Term[] {use});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeRuleKey, props_6, term_4, term_14, var_14, term_13);
  }    final public static boolean _M_DispatchCases(Sink sink, int shared, int depth, Term term_88) {
    if (depth < 2000) {
      label_12: {
        if (term_88.descriptor() != _M__sNil)
        {   break label_12;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_4: {
        if (term_88.descriptor() != _M__sCons)
        {   break label_4;
        }Term sub_184 = term_88.sub(0).ref();
        /* #rule=sub */Term sub_198 = term_88.sub(1).ref();
        /* #rules=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdispatchCases_xS1); sink.literal(";");
        sink.start(_M_Crsx_xdispatchCase); sink.copy(sub_184.ref());
        sink.end();
        sink.end();
        sink.start(_M_DispatchCases); sink.copy(sub_198.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DispatchCases, term_88);
  } final public static boolean _M_DispatchMetaArgsOpt(Sink sink, int shared, int depth, Term term_54) {
    if (depth < 2000) {
      label_11: {
        if (term_54.descriptor() != _M__sNil)
        {   break label_11;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_54: {
        if (term_54.descriptor() != _M__sCons)
        {   break label_54;
        }Term sub_90 = term_54.sub(0).ref();
        if (sub_90.descriptor() != _M_Crsx_xfreeTerms_xS1)
        {   break label_54;
        }Term sub_208 = sub_90.sub(0).ref();Term sub_48 = sub_90.sub(1).ref();
        /* #freeTerm=sub */Term sub_41 = term_54.sub(1).ref();
        /* #freeTerms_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeArguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeTerms); sink.copy(sub_48.ref()); sink.copy(sub_41.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DispatchMetaArgsOpt, term_54);
  } final public static boolean _M_DispatchPatternNextBinder(Sink sink, int shared, int depth, Term term_82, Term term_166, Term term_50) {
    if (depth < 2000) {
      label_70: {
        if (term_82.descriptor() != _M_Crsx_xnextBinder_xA2)
        {   break label_70;
        }Term sub_98 = term_82.sub(0).ref();Term sub_190 = term_82.sub(1).ref();
        /* #freeTerm=sub */
        /* #count=term */
        /* #freeTerms_S1*=term *//*Contract*/
        sink.start(_M_Crsx_xnextBinder_xA2); sink.literal(".");
        sink.start(_M_DispatchPatternFreeTerm); sink.copy(sub_190.ref()); sink.copy(term_166.ref()); sink.copy(term_50.ref());
        sink.end();
        sink.end(); return true;
      }
      label_154: {
        if (term_82.descriptor() != _M_Crsx_xnextBinder_xA1)
        {   break label_154;
        }Term sub_16 = term_82.sub(0).ref();
        if (sub_16.descriptor() != _M_Crsx_xbinder)
        {   break label_154;
        }Term sub_123 = sub_16.sub(0).ref();
        /* #annotations?=sub */Term sub_47 = sub_16.sub(1).ref();
        if (sub_47.descriptor() != _M_Crsx_xvariable)
        {   break label_154;
        }Term sub_0 = sub_47.sub(0).ref();
        if (sub_0.descriptor() != _M__sNil)
        {   break label_154;
        }Term sub_205 = sub_47.sub(1).ref();
        /* #VARIABLE=sub */Term sub_124 = sub_47.sub(2).ref();
        /* #linear?=sub */Term sub_160 = sub_47.sub(3).ref();
        /* #functional?=sub */Term sub_62 = sub_47.sub(4).ref();
        /* #varsort?=sub */Term sub_146 = term_82.sub(1).ref();
        /* #nextBinder=sub */
        /* #count=term */
        /* #freeTerms_S1*=term *//*Contract*/
        sink.start(_M_Crsx_xnextBinder_xA1);
        sink.start(_M_Crsx_xbinder); sink.copy(sub_123.ref());
        sink.start(_M_Crsx_xvariable); sink.start(_M__sNil); sink.end(); sink.copy(sub_205.ref()); sink.copy(sub_124.ref()); sink.copy(sub_160.ref()); sink.copy(sub_62.ref());
        sink.end();
        sink.end();
        sink.start(_M_DispatchPatternNextBinder); sink.copy(sub_146.ref()); sink.copy(term_166.ref());
        sink.start(_M_Concat); sink.copy(term_50.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeTerms_xS1); sink.literal(",");
        sink.start(_M_Crsx_xfreeTerm_xA5); sink.copy(sub_123.ref());
        sink.start(_M_Crsx_xvariable); sink.start(_M__sNil); sink.end(); sink.copy(sub_205.ref()); sink.copy(sub_124.ref()); sink.copy(sub_160.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DispatchPatternNextBinder, term_82, term_166, term_50);
  }   final public static boolean _M_DispatchPatternBinder(Sink sink, int shared, int depth, Term term_55, Term term_7, Term term_69, Term term_65) {
    if (depth < 2000) {
      label_30: {
        if (term_55.descriptor() != _M_Crsx_xbinder)
        {   break label_30;
        }Term sub_139 = term_55.sub(0).ref();
        /* #annotations?=sub */Term sub_80 = term_55.sub(1).ref();
        if (sub_80.descriptor() != _M_Crsx_xvariable)
        {   break label_30;
        }Term sub_37 = sub_80.sub(0).ref();
        if (sub_37.descriptor() != _M__sNil)
        {   break label_30;
        }Term sub_165 = sub_80.sub(1).ref();
        /* #VARIABLE=sub */Term sub_337 = sub_80.sub(2).ref();
        /* #linear?=sub */Term sub_134 = sub_80.sub(3).ref();
        /* #functional?=sub */Term sub_308 = sub_80.sub(4).ref();
        /* #varsort?=sub */
        /* #nextBinder=term */
        /* #count=term */
        /* #freeTerms_S1*=term *//*Contract*/
        sink.start(_M_Crsx_xterm_xA2);
        sink.start(_M_Crsx_xboundTerm);
        sink.start(_M_Crsx_xbinder); sink.copy(sub_139.ref());
        sink.start(_M_Crsx_xvariable); sink.start(_M__sNil); sink.end(); sink.copy(sub_165.ref()); sink.copy(sub_337.ref()); sink.copy(sub_134.ref()); sink.copy(sub_308.ref());
        sink.end();
        sink.end();
        sink.start(_M_DispatchPatternNextBinder); sink.copy(term_7.ref()); sink.copy(term_69.ref());
        sink.start(_M_Concat); sink.copy(term_65.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeTerms_xS1); sink.literal(",");
        sink.start(_M_Crsx_xfreeTerm_xA5); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xvariable); sink.start(_M__sNil); sink.end(); sink.copy(sub_165.ref()); sink.copy(sub_337.ref()); sink.copy(sub_134.ref()); sink.start(_M__sNil); sink.end();
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
    return thunk(sink, _M_DispatchPatternBinder, term_55, term_7, term_69, term_65);
  }    final public static boolean _M_DispatchPatternFreeTerm(Sink sink, int shared, int depth, Term term_114, Term term_56, Term term_40) {
    if (depth < 2000) {
      sink.start(_M_Crsx_xfreeTerm_xA7); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("#$P$");
      sink.start(_M__s); sink.start(_M_Builtin_sFormatNumber); sink.end(); sink.copy(term_56.ref());
      sink.end();
      sink.end();
      sink.start(_M_DispatchMetaArgsOpt); sink.copy(term_40.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchPatternFreeTerm, term_114, term_56, term_40);
  }   final public static boolean _M_DispatchPatternTerm(Sink sink, int shared, int depth, Term term_48, Term term_96, Term term_11) {
    if (depth < 2000) {
      label_44: {
        if (term_48.descriptor() != _M_Crsx_xterm_xA1)
        {   break label_44;
        }Term sub_148 = term_48.sub(0).ref();
        /* #freeTerm=sub */
        /* #count=term */
        /* #freeTerms_S1*=term *//*Contract*/
        sink.start(_M_Crsx_xterm_xA1);
        sink.start(_M_DispatchPatternFreeTerm); sink.copy(sub_148.ref()); sink.copy(term_96.ref()); sink.copy(term_11.ref());
        sink.end();
        sink.end(); return true;
      }
      label_35: {
        if (term_48.descriptor() != _M_Crsx_xterm_xA2)
        {   break label_35;
        }Term sub_485 = term_48.sub(0).ref();
        if (sub_485.descriptor() != _M_Crsx_xboundTerm)
        {   break label_35;
        }Term sub_140 = sub_485.sub(0).ref();
        /* #binder=sub */Term sub_153 = sub_485.sub(1).ref();
        /* #nextBinder=sub */
        /* #count=term */
        /* #freeTerms_S1*=term *//*Contract*/
        sink.start(_M_DispatchPatternBinder); sink.copy(sub_140.ref()); sink.copy(sub_153.ref()); sink.copy(term_96.ref()); sink.copy(term_11.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DispatchPatternTerm, term_48, term_96, term_11);
  }   final public static boolean _M_DispatchPatternArgs(Sink sink, int shared, int depth, Term term_150, Term term_1) {
    if (depth < 2000) {
      label_77: {
        if (term_150.descriptor() != _M__sNil)
        {   break label_77;
        }
        /* #count=term *//*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_61: {
        if (term_150.descriptor() != _M__sCons)
        {   break label_61;
        }Term sub_4 = term_150.sub(0).ref();
        if (sub_4.descriptor() != _M_Crsx_xterms_xS1)
        {   break label_61;
        }Term sub_75 = sub_4.sub(0).ref();Term sub_112 = sub_4.sub(1).ref();
        /* #term=sub */Term sub_231 = term_150.sub(1).ref();
        /* #terms_S1*=sub */
        /* #count=term *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms_xS1); sink.literal(",");
        sink.start(_M_DispatchPatternTerm); sink.copy(sub_112.ref()); sink.copy(term_1.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.start(_M_DispatchPatternArgs); sink.copy(sub_231.ref());
        sink.start(_M__s); sink.start(_M_Builtin_sPlus); sink.end(); sink.copy(term_1.ref()); sink.literal(1);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DispatchPatternArgs, term_150, term_1);
  }  final public static boolean _M_DispatchProperties(Sink sink, int shared, int depth, Term term_59) {
    if (depth < 2000) {
      label_84: {
        if (term_59.descriptor() != _M__sNil)
        {   break label_84;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_89: {
        if (term_59.descriptor() != _M__sCons)
        {   break label_89;
        }Term sub_147 = term_59.sub(0).ref();
        if (sub_147.descriptor() != _M_Crsx_xproperties)
        {   break label_89;
        }Term sub_297 = sub_147.sub(0).ref();Term sub_101 = sub_147.sub(1).ref();
        if (sub_101.descriptor() != _M__sNil)
        {   break label_89;
        }Term sub_201 = sub_147.sub(2).ref();Term sub_104 = term_59.sub(1).ref();
        if (sub_104.descriptor() != _M__sNil)
        {   break label_89;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_146: {
        if (term_59.descriptor() != _M__sCons)
        {   break label_146;
        }Term sub_7 = term_59.sub(0).ref();
        if (sub_7.descriptor() != _M_Crsx_xproperties)
        {   break label_146;
        }Term sub_83 = sub_7.sub(0).ref();Term sub_212 = sub_7.sub(1).ref();
        if (sub_212.descriptor() != _M__sCons)
        {   break label_146;
        }Term sub_31 = sub_212.sub(0).ref();
        /* #propertyList=sub */Term sub_219 = sub_212.sub(1).ref();
        if (sub_219.descriptor() != _M__sNil)
        {   break label_146;
        }Term sub_274 = sub_7.sub(2).ref();Term sub_159 = term_59.sub(1).ref();
        if (sub_159.descriptor() != _M__sNil)
        {   break label_146;
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
    return thunk(sink, _M_DispatchProperties, term_59);
  } final public static boolean _M_Dispatch(Sink sink, int shared, int depth, Term term_116) {
    if (depth < 2000) {
      label_63: {
        if (term_116.descriptor() != _M__sCons)
        {   break label_63;
        }Term sub_236 = term_116.sub(0).ref();
        if (sub_236.descriptor() != _M_Crsx_xruleDeclaration)
        {   break label_63;
        }Term sub_269 = sub_236.sub(0).ref();
        /* #option?=sub */Term sub_239 = sub_236.sub(1).ref();
        if (sub_239.descriptor() != _M_Crsx_xpattern)
        {   break label_63;
        }Term sub_245 = sub_239.sub(0).ref();
        /* #properties?=sub */Term sub_271 = sub_239.sub(1).ref();
        /* #constructor=sub */Term sub_144 = sub_239.sub(2).ref();
        if (sub_144.descriptor() != _M__sCons)
        {   break label_63;
        }Term sub_389 = sub_144.sub(0).ref();
        if (sub_389.descriptor() != _M_Crsx_xarguments)
        {   break label_63;
        }Term sub_338 = sub_389.sub(0).ref();Term sub_177 = sub_389.sub(1).ref();
        if (sub_177.descriptor() != _M__sCons)
        {   break label_63;
        }Term sub_179 = sub_177.sub(0).ref();
        /* #terms=sub */Term sub_88 = sub_177.sub(1).ref();
        if (sub_88.descriptor() != _M__sNil)
        {   break label_63;
        }Term sub_111 = sub_389.sub(2).ref();Term sub_128 = sub_144.sub(1).ref();
        if (sub_128.descriptor() != _M__sNil)
        {   break label_63;
        }Term sub_116 = sub_236.sub(2).ref();Term sub_309 = sub_236.sub(3).ref();
        /* #contractum=sub */Term sub_100 = term_116.sub(1).ref();
        /* #rules=sub *//*Contract*/
        sink.start(_M_Crsx_xruleDeclaration); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xpattern);
        sink.start(_M_DispatchProperties); sink.copy(sub_245.ref());
        sink.end(); sink.copy(sub_271.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_SugarTerms);
        sink.start(_M_DispatchPatternArgs);
        sink.start(_M_DesugarTerms); sink.copy(sub_179.ref());
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
        sink.start(_M_DispatchProperties); sink.copy(sub_245.ref());
        sink.end(); sink.copy(sub_271.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_SugarTerms);
        sink.start(_M_DispatchPatternArgs);
        sink.start(_M_DesugarTerms); sink.copy(sub_179.ref());
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
        sink.start(_M_Crsx_xruleDeclaration); sink.copy(sub_269.ref());
        sink.start(_M_Crsx_xpattern); sink.copy(sub_245.ref()); sink.copy(sub_271.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons); sink.copy(sub_179.ref()); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.literal("\u2192"); sink.copy(sub_309.ref());
        sink.end(); sink.copy(sub_100.ref());
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
    return thunk(sink, _M_Dispatch, term_116);
  } final public static boolean _M_GroupRule(Sink sink, int shared, int depth, Properties props_99, Term term_115, Term term_34, Variable var_84, Term term_99) {
    if (depth < 2000) {
      label_73: {
        /* #key=term */
        /* #rules=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_99));Term term_76;
        {
          BufferSink buf_9 = sink.context().makeBuffer();
          buf_9.start(_M_RULES);
          buf_9.start(_M__sCons);
          buf_9.start(_M_Dispatch); buf_9.copy(term_34.ref());
          buf_9.end(); buf_9.start(_M__sNil); buf_9.end();
          buf_9.end();
          buf_9.end();
          term_76 = buf_9.term();
        }
        term_115 = force(sink.context(), term_115);
        Sink.property(sink, term_115, term_76);Term term_43;
        {
          BufferSink buf_35 = sink.context().makeBuffer(); buf_35.start(_M_OK); buf_35.end();
          term_43 = buf_35.term();
        }
        sink.substitute(term_99.ref(), new Variable[] { var_84 }, new Term[] {term_43}); return true;
      }
    }
    return thunk(sink, _M_GroupRule, props_99, term_115, term_34, var_84, term_99);
  }    final public static boolean _M_MayGroupRule2(Sink sink, int shared, int depth, Properties props_86, Term term_38, Term term_28, Term term_52, Variable var_38, Term term_93) {
    if (depth < 2000) {
      label_87: {
        if (term_38.descriptor() != _M_TRUE)
        {   break label_87;
        }
        /* #key=term */
        /* #rules=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_86));Term term_70;
        {
          BufferSink buf_5 = sink.context().makeBuffer(); buf_5.start(_M_OK); buf_5.end();
          term_70 = buf_5.term();
        }
        sink.substitute(term_93.ref(), new Variable[] { var_38 }, new Term[] {term_70}); return true;
      }
      label_80: {
        if (term_38.descriptor() != _M_FALSE)
        {   break label_80;
        }
        /* #key=term */
        /* #rules=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_86));
        sink.start(_M_GroupRule); sink.copy(term_28.ref()); sink.copy(term_52.ref());
        Variable var_56 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_56});
        VariableUse use_71 = sink.context().makeVariableUse(var_56);
        sink.substitute(term_93.ref(), new Variable[] { var_38 }, new Term[] {use_71});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_MayGroupRule2, props_86, term_38, term_28, term_52, var_38, term_93);
  }     final public static boolean _M_MayGroupRule1(Sink sink, int shared, int depth, Properties props_73, Term term_20, Term term_32, Variable var_67, Term term_101) {
    if (depth < 2000) {
      label_72: {
        if (term_20.descriptor() != _M_RULES)
        {   break label_72;
        }Term sub_189 = term_20.sub(0).ref();
        /* #rules=sub */
        /* #key=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_73));
        sink.start(_M_MayGroupRule2);
        sink.start(_M_Or); sink.start(_M_IsEmpty); sink.copy(sub_189.ref()); sink.end();
        sink.start(_M_And);
        sink.start(_M_IsSingleton); sink.copy(sub_189.ref());
        sink.end();
        sink.start(_M_AllMetaInPatternRule); sink.start(_M_Head); sink.copy(sub_189.ref()); sink.end();
        sink.end();
        sink.end();
        sink.end(); sink.copy(term_32.ref()); sink.copy(sub_189.ref());
        Variable var_54 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_54});
        VariableUse use_59 = sink.context().makeVariableUse(var_54);
        sink.substitute(term_101.ref(), new Variable[] { var_67 }, new Term[] {use_59});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_MayGroupRule1, props_73, term_20, term_32, var_67, term_101);
  }    final public static boolean _M_MayGroupRule(Sink sink, int shared, int depth, Properties props_4, Term term_62, Variable var_62, Term term_85) {
    if (depth < 2000) {
      label_48: {
        /* #key=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_4));
        sink.start(_M_MayGroupRule1);
        sink.start(_M__s);sink.properties(safeRef(props_4));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_62.ref());
        sink.end(); sink.copy(term_62.ref());
        Variable var_12 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_12});
        VariableUse use_92 = sink.context().makeVariableUse(var_12);
        sink.substitute(term_85.ref(), new Variable[] { var_62 }, new Term[] {use_92});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_MayGroupRule, props_4, term_62, var_62, term_85);
  }   final public static boolean _M_N2Rule(Sink sink, int shared, int depth, Properties props_66, Term term_190, Term term_90) {
    if (depth < 2000) {
      label_43: {
        /* #ruleKey=term */
        if (term_90.descriptor() != _M_CONTINUATION)
        {   break label_43;
        }Term sub_215 = term_90.sub(0).ref();
        Variable binder = term_90.binders(0)[0];
        /* #=sub *//*Contract*/sink.properties(safeRef(props_66));
        sink.start(_M_MayGroupRule); sink.copy(term_190.ref());
        Variable var_80 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_80});
        sink.start(_M_NormalizeRuleKey); sink.use(var_80); sink.copy(term_190.ref());
        Variable var_9 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_9});
        VariableUse use_98 = sink.context().makeVariableUse(var_9);
        sink.substitute(sub_215.ref(), new Variable[] { binder }, new Term[] {use_98});
        sink.end();
        sink.end(); return true; 
      }
    }
    return thunk(sink, _M_N2Rule, props_66, term_190, term_90);
  }  final public static boolean _M_N2Rules(Sink sink, int shared, int depth, Properties props_35, Term term_17, Variable var_78, Term term_21) {
    if (depth < 2000) {
      label_90: {
        /* #keys=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_35));
        sink.start(_M_SeqMap);
        Variable var_10 = sink.context().makeVariable("x");
        Variable var_4 = sink.context().makeVariable("c");
        sink.binds(new Variable[] {var_10,var_4});
        sink.start(_M_N2Rule); sink.use(var_10); sink.use(var_4);
        sink.end(); sink.copy(term_17.ref());
        Variable var_2 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_2});
        VariableUse use_93 = sink.context().makeVariableUse(var_2);
        sink.substitute(term_21.ref(), new Variable[] { var_78 }, new Term[] {use_93});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N2Rules, props_35, term_17, var_78, term_21);
  }   final public static boolean _M_N2(Sink sink, int shared, int depth, Properties props_56, Term term_6, Variable var_47, Term term_5) {
    if (depth < 2000) {
      label_195: {
        Term value = props_56 == null ? null : props_56.lookup("$rulekeys");
        if (value == null) 
        {   break label_195;
        }
        if (value.descriptor() != _M_KEYS)
        {   break label_195;
        }Term sub_249 = value.sub(0).ref();
        /* #keys=sub */
        if (term_6.descriptor() != _M_OK)
        {   break label_195;
        }
        /* #=term *//*Contract*/sink.properties(safeRef(props_56));
        sink.start(_M_N2Rules); sink.copy(sub_249.ref());
        Variable var_53 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_53});
        VariableUse use_91 = sink.context().makeVariableUse(var_53);
        sink.substitute(term_5.ref(), new Variable[] { var_47 }, new Term[] {use_91});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N2, props_56, term_6, var_47, term_5);
  }   final public static boolean _M_N1ImportDirective(Sink sink, int shared, int depth, Properties props_87, Term term_68, Term term_57, Variable var_25, Term term_107) {
    if (depth < 2000) {
      label_40: {
        Term value_6 = props_87 == null ? null : props_87.lookup("$imported");
        if (value_6 == null) 
        {   break label_40;
        }
        if (value_6.descriptor() != _M_IMPORTS)
        {   break label_40;
        }Term sub_170 = value_6.sub(0).ref();
        /* #imported=sub */
        if (term_68.descriptor() != _M_Crsx_xdirective_xA3)
        {   break label_40;
        }Term sub_433 = term_68.sub(0).ref();
        if (sub_433.descriptor() != _M_Crsx_xliteral_xA1)
        {   break label_40;
        }Term sub_471 = sub_433.sub(0).ref();
        /* #STRING=sub */
        if (term_57.descriptor() != _M_TRUE)
        {   break label_40;
        }
        /* #=term *//*Contract*/sink.properties(safeRef(props_87));Term term_140;
        {
          BufferSink buf_41 = sink.context().makeBuffer();
          buf_41.start(_M_IMPORTS);
          buf_41.start(_M_Concat); buf_41.copy(sub_170.ref());
          buf_41.start(_M__sCons);
          buf_41.start(_M_UnString); buf_41.copy(sub_471.ref());
          buf_41.end(); buf_41.start(_M__sNil); buf_41.end();
          buf_41.end();
          buf_41.end();
          buf_41.end();
          term_140 = buf_41.term();
        } sink.propertyNamed("$imported", term_140);Term term_179;
        {
          BufferSink buf_4 = sink.context().makeBuffer(); buf_4.start(_M_OK); buf_4.end();
          term_179 = buf_4.term();
        }
        sink.substitute(term_107.ref(), new Variable[] { var_25 }, new Term[] {term_179}); return true;
      }
      label_196: {
        Term value_95 = props_87 == null ? null : props_87.lookup("$grammars");
        if (value_95 == null) 
        {   break label_196;
        }
        if (value_95.descriptor() != _M_IMPORTS)
        {   break label_196;
        }Term sub_188 = value_95.sub(0).ref();
        /* #imported=sub */
        if (term_68.descriptor() != _M_Crsx_xdirective_xA3)
        {   break label_196;
        }Term sub_469 = term_68.sub(0).ref();
        if (sub_469.descriptor() != _M_Crsx_xliteral_xA1)
        {   break label_196;
        }Term sub_58 = sub_469.sub(0).ref();
        /* #STRING=sub */
        if (term_57.descriptor() != _M_FALSE)
        {   break label_196;
        }
        /* #=term *//*Contract*/sink.properties(safeRef(props_87));Term term_206;
        {
          BufferSink buf_15 = sink.context().makeBuffer();
          buf_15.start(_M_IMPORTS);
          buf_15.start(_M_Concat); buf_15.copy(sub_188.ref());
          buf_15.start(_M__sCons);
          buf_15.start(_M_Replace);
          buf_15.start(_M_UnString); buf_15.copy(sub_58.ref());
          buf_15.end(); buf_15.literal("."); buf_15.literal("/");
          buf_15.end(); buf_15.start(_M__sNil); buf_15.end();
          buf_15.end();
          buf_15.end();
          buf_15.end();
          term_206 = buf_15.term();
        } sink.propertyNamed("$grammars", term_206);Term term_187;
        {
          BufferSink buf_45 = sink.context().makeBuffer(); buf_45.start(_M_OK); buf_45.end();
          term_187 = buf_45.term();
        }
        sink.substitute(term_107.ref(), new Variable[] { var_25 }, new Term[] {term_187}); return true;
      }
      label_156: {
        /* #directive=term */
        /* #kind=term */
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end(); sink.literal("Error: invalid argument in import directive.");
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1ImportDirective, props_87, term_68, term_57, var_25, term_107);
  }    final public static boolean _M_N1ImportDirectives(Sink sink, int shared, int depth, Properties props_61, Term term_154, Term term_180, Variable var_34, Term term_399) {
    if (depth < 2000) {
      label_49: {
        if (term_154.descriptor() != _M__sNil)
        {   break label_49;
        }
        /* #kind=term */
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Error: missing filename argument in import directive.");
        sink.end(); return true;
      }
      label_85: {
        if (term_154.descriptor() != _M__sCons)
        {   break label_85;
        }Term sub_456 = term_154.sub(0).ref();
        if (sub_456.descriptor() != _M_Crsx_xdirectives)
        {   break label_85;
        }Term sub_228 = sub_456.sub(0).ref();
        /* #directive1=sub */Term sub_180 = sub_456.sub(1).ref();
        if (sub_180.descriptor() != _M__sCons)
        {   break label_85;
        }Term sub_230 = sub_180.sub(0).ref();
        if (sub_230.descriptor() != _M_Crsx_xdirectives_xS1)
        {   break label_85;
        }Term sub_301 = sub_230.sub(0).ref();Term sub_102 = sub_230.sub(1).ref();
        /* #directive2=sub */Term sub_113 = sub_180.sub(1).ref();
        /* #directives_S1*=sub */Term sub_183 = term_154.sub(1).ref();
        if (sub_183.descriptor() != _M__sNil)
        {   break label_85;
        }
        /* #kind=term */
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Error: extraneous argument in import directive.");
        sink.end(); return true;
      }
      label_94: {
        if (term_154.descriptor() != _M__sCons)
        {   break label_94;
        }Term sub_137 = term_154.sub(0).ref();
        if (sub_137.descriptor() != _M_Crsx_xdirectives)
        {   break label_94;
        }Term sub_276 = sub_137.sub(0).ref();
        /* #directive=sub */Term sub_365 = sub_137.sub(1).ref();
        if (sub_365.descriptor() != _M__sNil)
        {   break label_94;
        }Term sub_241 = term_154.sub(1).ref();
        if (sub_241.descriptor() != _M__sNil)
        {   break label_94;
        }
        /* #kind=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_61));
        sink.start(_M_N1ImportDirective); sink.copy(sub_276.ref()); sink.copy(term_180.ref());
        Variable var_31 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_31});
        VariableUse use_24 = sink.context().makeVariableUse(var_31);
        sink.substitute(term_399.ref(), new Variable[] { var_34 }, new Term[] {use_24});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1ImportDirectives, props_61, term_154, term_180, var_34, term_399);
  }    final public static boolean _M_N1Import(Sink sink, int shared, int depth, Properties props_5, Term term_170, Term term_299, Variable var_46, Term term_71) {
    if (depth < 2000) {
      label_9: {
        if (term_170.descriptor() != _M__sNil)
        {   break label_9;
        }
        /* #kind=term */
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Error: missing filename argument in import directive.");
        sink.end(); return true;
      }
      label_36: {
        if (term_170.descriptor() != _M__sCons)
        {   break label_36;
        }Term sub_264 = term_170.sub(0).ref();
        if (sub_264.descriptor() != _M_Crsx_xdirectiveArguments)
        {   break label_36;
        }Term sub_164 = sub_264.sub(0).ref();Term sub_67 = sub_264.sub(1).ref();
        /* #directives?=sub */Term sub_76 = sub_264.sub(2).ref();Term sub_260 = term_170.sub(1).ref();
        if (sub_260.descriptor() != _M__sNil)
        {   break label_36;
        }
        /* #kind=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_5));
        sink.start(_M_N1ImportDirectives); sink.copy(sub_67.ref()); sink.copy(term_299.ref());
        Variable var_69 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_69});
        VariableUse use_88 = sink.context().makeVariableUse(var_69);
        sink.substitute(term_71.ref(), new Variable[] { var_46 }, new Term[] {use_88});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1Import, props_5, term_170, term_299, var_46, term_71);
  }    final public static boolean _M_N1DirectiveConstructor(Sink sink, int shared, int depth, Properties props_45, Term term_363, Variable var_83, Term term_47) {
    if (depth < 2000) {
      label_234: {
        /* #constructor=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_45));Term term_165;
        {
          BufferSink buf_74 = sink.context().makeBuffer(); buf_74.start(_M_OK); buf_74.end();
          term_165 = buf_74.term();
        }
        sink.substitute(term_47.ref(), new Variable[] { var_83 }, new Term[] {term_165}); return true;
      }
    }
    return thunk(sink, _M_N1DirectiveConstructor, props_45, term_363, var_83, term_47);
  }   final public static boolean _M_N1Directive(Sink sink, int shared, int depth, Properties props_62, Term term_432, Variable var_77, Term term_192) {
    if (depth < 2000) {
      label_81: {
        if (term_432.descriptor() != _M_Crsx_xdirective_xA1)
        {   break label_81;
        }Term sub_678 = term_432.sub(0).ref();
        if (sub_678.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_81;
        }Term sub_257 = sub_678.sub(0).ref();
        if (sub_257.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_81;
        }Term sub_568 = sub_678.sub(1).ref();
        /* #CONSTRUCTOR=sub */Term sub_419 = term_432.sub(1).ref();
        /* #directiveArguments?=sub */
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sStringEqual); sink.end(); sink.copy(sub_568.ref()); sink.literal("$Use");
        sink.end();sink.properties(safeRef(props_62));
        sink.start(_M_N1Import); sink.copy(sub_419.ref()); sink.start(_M_TRUE); sink.end();
        Variable var_74 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_74});
        VariableUse use_74 = sink.context().makeVariableUse(var_74);
        sink.substitute(term_192.ref(), new Variable[] { var_77 }, new Term[] {use_74});
        sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sStringEqual); sink.end(); sink.copy(sub_568.ref()); sink.literal("$AddGrammar");
        sink.end();sink.properties(safeRef(props_62));
        sink.start(_M_N1Import); sink.copy(sub_419.ref()); sink.start(_M_FALSE); sink.end();
        Variable var_32 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_32});
        VariableUse use_99 = sink.context().makeVariableUse(var_32);
        sink.substitute(term_192.ref(), new Variable[] { var_77 }, new Term[] {use_99});
        sink.end();sink.properties(safeRef(props_62));Term term_37;
        {
          BufferSink buf_10 = sink.context().makeBuffer(); buf_10.start(_M_OK); buf_10.end();
          term_37 = buf_10.term();
        }
        sink.substitute(term_192.ref(), new Variable[] { var_77 }, new Term[] {term_37});
        sink.end();
        sink.end(); return true;
      }
      label_173: {
        /* #directive=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_62));Term term_31;
        {
          BufferSink buf_117 = sink.context().makeBuffer(); buf_117.start(_M_OK); buf_117.end();
          term_31 = buf_117.term();
        }
        sink.substitute(term_192.ref(), new Variable[] { var_77 }, new Term[] {term_31}); return true;
      }
    }
    return thunk(sink, _M_N1Directive, props_62, term_432, var_77, term_192);
  }   final public static boolean _M_N1Declaration(Sink sink, int shared, int depth, Properties props_55, Term term_125, Variable var_52, Term term_126) {
    if (depth < 2000) {
      label_242: {
        if (term_125.descriptor() != _M_Crsx_xdeclaration_xA5)
        {   break label_242;
        }Term sub_118 = term_125.sub(0).ref();
        if (sub_118.descriptor() != _M_Crsx_xdirective_xA1)
        {   break label_242;
        }Term sub_296 = sub_118.sub(0).ref();
        /* #constructor=sub */Term sub_392 = sub_118.sub(1).ref();
        if (sub_392.descriptor() != _M__sCons)
        {   break label_242;
        }Term sub_172 = sub_392.sub(0).ref();
        if (sub_172.descriptor() != _M_Crsx_xdirectiveArguments)
        {   break label_242;
        }Term sub_299 = sub_172.sub(0).ref();Term sub_223 = sub_172.sub(1).ref();
        if (sub_223.descriptor() != _M__sCons)
        {   break label_242;
        }Term sub_125 = sub_223.sub(0).ref();
        if (sub_125.descriptor() != _M_Crsx_xdirectives)
        {   break label_242;
        }Term sub_267 = sub_125.sub(0).ref();
        if (sub_267.descriptor() != _M_Crsx_xdirective_xA2)
        {   break label_242;
        }Term sub_178 = sub_267.sub(0).ref();
        if (sub_178.descriptor() != _M_Crsx_xdirectiveList)
        {   break label_242;
        }Term sub_115 = sub_178.sub(0).ref();Term sub_364 = sub_178.sub(1).ref();
        if (sub_364.descriptor() != _M__sNil)
        {   break label_242;
        }Term sub_176 = sub_178.sub(2).ref();Term sub_294 = sub_125.sub(1).ref();
        if (sub_294.descriptor() != _M__sNil)
        {   break label_242;
        }Term sub_330 = sub_223.sub(1).ref();
        if (sub_330.descriptor() != _M__sNil)
        {   break label_242;
        }Term sub_410 = sub_172.sub(2).ref();Term sub_275 = sub_392.sub(1).ref();
        if (sub_275.descriptor() != _M__sNil)
        {   break label_242;
        }
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M_IsDirectiveUnwrap); sink.copy(sub_296.ref());
        sink.end();sink.properties(safeRef(props_55));
        sink.start(_M_N1DirectiveConstructor); sink.copy(sub_296.ref());
        Variable var_91 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_91});
        VariableUse use_45 = sink.context().makeVariableUse(var_91);
        sink.substitute(term_126.ref(), new Variable[] { var_52 }, new Term[] {use_45});
        sink.end();sink.properties(safeRef(props_55));Term term_74;
        {
          BufferSink buf_26 = sink.context().makeBuffer(); buf_26.start(_M_OK); buf_26.end();
          term_74 = buf_26.term();
        }
        sink.substitute(term_126.ref(), new Variable[] { var_52 }, new Term[] {term_74});
        sink.end(); return true;
      }
      label_210: {
        if (term_125.descriptor() != _M_Crsx_xdeclaration_xA5)
        {   break label_210;
        }Term sub_306 = term_125.sub(0).ref();
        if (sub_306.descriptor() != _M_Crsx_xdirective_xA1)
        {   break label_210;
        }Term sub_158 = sub_306.sub(0).ref();
        /* #constructor=sub */Term sub_195 = sub_306.sub(1).ref();
        if (sub_195.descriptor() != _M__sCons)
        {   break label_210;
        }Term sub_150 = sub_195.sub(0).ref();
        if (sub_150.descriptor() != _M_Crsx_xdirectiveArguments)
        {   break label_210;
        }Term sub_430 = sub_150.sub(0).ref();Term sub_143 = sub_150.sub(1).ref();
        if (sub_143.descriptor() != _M__sCons)
        {   break label_210;
        }Term sub_334 = sub_143.sub(0).ref();
        if (sub_334.descriptor() != _M_Crsx_xdirectives)
        {   break label_210;
        }Term sub_288 = sub_334.sub(0).ref();
        if (sub_288.descriptor() != _M_Crsx_xdirective_xA2)
        {   break label_210;
        }Term sub_331 = sub_288.sub(0).ref();
        if (sub_331.descriptor() != _M_Crsx_xdirectiveList)
        {   break label_210;
        }Term sub_166 = sub_331.sub(0).ref();Term sub_383 = sub_331.sub(1).ref();
        if (sub_383.descriptor() != _M__sCons)
        {   break label_210;
        }Term sub_196 = sub_383.sub(0).ref();
        /* #declarations=sub */Term sub_122 = sub_383.sub(1).ref();
        if (sub_122.descriptor() != _M__sNil)
        {   break label_210;
        }Term sub_186 = sub_331.sub(2).ref();Term sub_157 = sub_334.sub(1).ref();
        if (sub_157.descriptor() != _M__sNil)
        {   break label_210;
        }Term sub_361 = sub_143.sub(1).ref();
        if (sub_361.descriptor() != _M__sNil)
        {   break label_210;
        }Term sub_393 = sub_150.sub(2).ref();Term sub_227 = sub_195.sub(1).ref();
        if (sub_227.descriptor() != _M__sNil)
        {   break label_210;
        }
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M_IsDirectiveUnwrap); sink.copy(sub_158.ref());
        sink.end();sink.properties(safeRef(props_55));
        sink.start(_M_N1DirectiveConstructor); sink.copy(sub_158.ref());
        Variable var_98 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_98});
        VariableUse use_42 = sink.context().makeVariableUse(var_98);
        sink.substitute(term_126.ref(), new Variable[] { var_52 }, new Term[] {use_42});
        sink.end();sink.properties(safeRef(props_55));
        sink.start(_M_N1Declarations1); sink.start(_M_OK); sink.end();
        sink.start(_M_DesugarDeclarations); sink.copy(sub_196.ref());
        sink.end();
        Variable var_55 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_55});
        VariableUse use_83 = sink.context().makeVariableUse(var_55);
        sink.substitute(term_126.ref(), new Variable[] { var_52 }, new Term[] {use_83});
        sink.end();
        sink.end(); return true;
      }
      label_33: {
        if (term_125.descriptor() != _M_Crsx_xdeclaration_xA5)
        {   break label_33;
        }Term sub_108 = term_125.sub(0).ref();
        /* #directive=sub */
        /* #=term *//*Contract*/sink.properties(safeRef(props_55));
        sink.start(_M_N1Directive); sink.copy(sub_108.ref());
        Variable var_219 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_219});
        VariableUse use_150 = sink.context().makeVariableUse(var_219);
        sink.substitute(term_126.ref(), new Variable[] { var_52 }, new Term[] {use_150});
        sink.end(); return true;
      }
      label_255: {
        if (term_125.descriptor() != _M_Crsx_xdeclaration_xA1)
        {   break label_255;
        }Term sub_235 = term_125.sub(0).ref();
        if (sub_235.descriptor() != _M_Crsx_xmoduleDeclaration)
        {   break label_255;
        }Term sub_272 = sub_235.sub(0).ref();Term sub_435 = sub_235.sub(1).ref();
        /* #CONSTRUCTOR=sub */Term sub_185 = sub_235.sub(2).ref();Term sub_349 = sub_235.sub(3).ref();
        /* #declarations=sub */Term sub_283 = sub_235.sub(4).ref();
        /* #=term *//*Contract*/sink.properties(safeRef(props_55));
        sink.start(_M_N1Declarations);
        sink.start(_M_DesugarDeclarations); sink.copy(sub_349.ref());
        sink.end();
        Variable var_172 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_172});
        VariableUse use_68 = sink.context().makeVariableUse(var_172);
        sink.substitute(term_126.ref(), new Variable[] { var_52 }, new Term[] {use_68});
        sink.end(); return true;
      }
      label_184: {
        if (term_125.descriptor() != _M_Crsx_xdeclaration_xA3)
        {   break label_184;
        }Term sub_298 = term_125.sub(0).ref();
        if (sub_298.descriptor() != _M_Crsx_xruleDeclaration)
        {   break label_184;
        }Term sub_455 = sub_298.sub(0).ref();
        /* #option?=sub */Term sub_291 = sub_298.sub(1).ref();
        if (sub_291.descriptor() != _M_Crsx_xpattern)
        {   break label_184;
        }Term sub_252 = sub_291.sub(0).ref();
        /* #properties?=sub */Term sub_312 = sub_291.sub(1).ref();
        /* #constructor=sub */Term sub_126 = sub_291.sub(2).ref();
        /* #arguments?=sub */Term sub_277 = sub_298.sub(2).ref();Term sub_127 = sub_298.sub(3).ref();
        /* #contractum=sub */
        /* #=term *//*Contract*/sink.properties(safeRef(props_55));
        sink.start(_M_AddRule); sink.start(_M_RulesKey); sink.copy(sub_312.ref()); sink.end();
        sink.start(_M_Crsx_xruleDeclaration); sink.copy(sub_455.ref());
        sink.start(_M_Crsx_xpattern); sink.copy(sub_252.ref()); sink.copy(sub_312.ref()); sink.copy(sub_126.ref());
        sink.end(); sink.literal("\u2192"); sink.copy(sub_127.ref());
        sink.end();
        Variable var_99 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_99});
        VariableUse use_11 = sink.context().makeVariableUse(var_99);
        sink.substitute(term_126.ref(), new Variable[] { var_52 }, new Term[] {use_11});
        sink.end(); return true;
      }
      label_28: {
        if (term_125.descriptor() != _M_Crsx_xdeclaration_xA4)
        {   break label_28;
        }Term sub_216 = term_125.sub(0).ref();
        if (sub_216.descriptor() != _M_Crsx_xsortDeclaration_xA1)
        {   break label_28;
        }Term sub_253 = sub_216.sub(0).ref();
        /* #sortparams?=sub */Term sub_167 = sub_216.sub(1).ref();
        /* #sortset=sub */Term sub_359 = sub_216.sub(2).ref();
        /* #sortname=sub */Term sub_378 = sub_216.sub(3).ref();Term sub_210 = sub_216.sub(4).ref();Term sub_362 = sub_216.sub(5).ref();
        /* #forms=sub */Term sub_259 = sub_216.sub(6).ref();
        /* #=term *//*Contract*/sink.properties(safeRef(props_55));
        sink.start(_M_AddDataSort);
        sink.start(_M_Crsx_xsortDeclaration_xA1); sink.copy(sub_253.ref()); sink.copy(sub_167.ref()); sink.copy(sub_359.ref()); sink.literal("::="); sink.literal("("); sink.copy(sub_362.ref()); sink.literal(")");
        sink.end();
        Variable var_28 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_28});
        VariableUse use_96 = sink.context().makeVariableUse(var_28);
        sink.substitute(term_126.ref(), new Variable[] { var_52 }, new Term[] {use_96});
        sink.end(); return true;
      }
      label_13: {
        if (term_125.descriptor() != _M_Crsx_xdeclaration_xA4)
        {   break label_13;
        }Term sub_589 = term_125.sub(0).ref();
        if (sub_589.descriptor() != _M_Crsx_xsortDeclaration_xA2)
        {   break label_13;
        }Term sub_284 = sub_589.sub(0).ref();
        /* #sortparams?=sub */Term sub_266 = sub_589.sub(1).ref();
        /* #sortset=sub */Term sub_351 = sub_589.sub(2).ref();
        if (sub_351.descriptor() != _M_Crsx_xform_xA1)
        {   break label_13;
        }Term sub_162 = sub_351.sub(0).ref();
        /* #constructor=sub */Term sub_292 = sub_351.sub(1).ref();
        /* #arguments?=sub */Term sub_581 = sub_589.sub(3).ref();Term sub_558 = sub_589.sub(4).ref();
        /* #sortname=sub */
        /* #=term *//*Contract*/sink.properties(safeRef(props_55));
        sink.start(_M_AddFuncSort);
        sink.start(_M_Crsx_xsortDeclaration_xA2); sink.copy(sub_284.ref()); sink.copy(sub_266.ref());
        sink.start(_M_Crsx_xform_xA1); sink.copy(sub_162.ref()); sink.copy(sub_292.ref());
        sink.end(); sink.literal("::"); sink.copy(sub_558.ref());
        sink.end();
        Variable var_93 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_93});
        VariableUse use_52 = sink.context().makeVariableUse(var_93);
        sink.substitute(term_126.ref(), new Variable[] { var_52 }, new Term[] {use_52});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1Declaration, props_55, term_125, var_52, term_126);
  }   final public static boolean _M_N1Declarations1(Sink sink, int shared, int depth, Properties props_65, Term term_44, Term term_89, Variable var_85, Term term_102) {
    if (depth < 2000) {
      label_60: {
        if (term_44.descriptor() != _M_OK)
        {   break label_60;
        }
        if (term_89.descriptor() != _M__sNil)
        {   break label_60;
        }
        /* #=term *//*Contract*/sink.properties(safeRef(props_65));Term term_45;
        {
          BufferSink buf_91 = sink.context().makeBuffer(); buf_91.start(_M_OK); buf_91.end();
          term_45 = buf_91.term();
        }
        sink.substitute(term_102.ref(), new Variable[] { var_85 }, new Term[] {term_45}); return true;
      }
      label_177: {
        if (term_44.descriptor() != _M_OK)
        {   break label_177;
        }
        if (term_89.descriptor() != _M__sCons)
        {   break label_177;
        }Term sub_385 = term_89.sub(0).ref();
        if (sub_385.descriptor() != _M_Crsx_xdeclarations_xS1)
        {   break label_177;
        }Term sub_551 = sub_385.sub(0).ref();Term sub_484 = sub_385.sub(1).ref();
        if (sub_484.descriptor() != _M__sNil)
        {   break label_177;
        }Term sub_417 = term_89.sub(1).ref();
        if (sub_417.descriptor() != _M__sNil)
        {   break label_177;
        }
        /* #=term *//*Contract*/sink.properties(safeRef(props_65));Term term_151;
        {
          BufferSink buf_97 = sink.context().makeBuffer(); buf_97.start(_M_OK); buf_97.end();
          term_151 = buf_97.term();
        }
        sink.substitute(term_102.ref(), new Variable[] { var_85 }, new Term[] {term_151}); return true;
      }
      label_78: {
        if (term_44.descriptor() != _M_OK)
        {   break label_78;
        }
        if (term_89.descriptor() != _M__sCons)
        {   break label_78;
        }Term sub_234 = term_89.sub(0).ref();
        if (sub_234.descriptor() != _M_Crsx_xdeclarations_xS1)
        {   break label_78;
        }Term sub_726 = sub_234.sub(0).ref();Term sub_211 = sub_234.sub(1).ref();
        if (sub_211.descriptor() != _M__sCons)
        {   break label_78;
        }Term sub_187 = sub_211.sub(0).ref();
        /* #declaration=sub */Term sub_400 = sub_211.sub(1).ref();
        if (sub_400.descriptor() != _M__sNil)
        {   break label_78;
        }Term sub_358 = term_89.sub(1).ref();
        /* #declarations_S1*=sub */
        /* #=term *//*Contract*/sink.properties(safeRef(props_65));
        sink.start(_M_N1Declaration); sink.copy(sub_187.ref());
        Variable var_71 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_71});
        sink.start(_M_N1Declarations1); sink.use(var_71); sink.copy(sub_358.ref());
        Variable var_159 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_159});
        VariableUse use_61 = sink.context().makeVariableUse(var_159);
        sink.substitute(term_102.ref(), new Variable[] { var_85 }, new Term[] {use_61});
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1Declarations1, props_65, term_44, term_89, var_85, term_102);
  }    final public static boolean _M_N1Declarations(Sink sink, int shared, int depth, Properties props_33, Term term_10, Variable var_132, Term term_109) {
    if (depth < 2000) {
      label_92: {
        /* #declarations=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_33));
        sink.start(_M_N1Declarations1); sink.start(_M_OK); sink.end(); sink.copy(term_10.ref());
        Variable var_39 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_39});
        VariableUse use_28 = sink.context().makeVariableUse(var_39);
        sink.substitute(term_109.ref(), new Variable[] { var_132 }, new Term[] {use_28});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1Declarations, props_33, term_10, var_132, term_109);
  }   final public static boolean _M_N1DeclarationsInit(Sink sink, int shared, int depth, Term term_153, Term term_58, Variable var_61, Term term_238) {
    if (depth < 2000) {
      label_376: {
        /* #qualifier=term */
        /* #declarations=term */
        /* #=term *//*Contract*/Term term_279;
        {
          BufferSink buf_16 = sink.context().makeBuffer();
          buf_16.start(_M_STR); buf_16.copy(term_153.ref());
          buf_16.end();
          term_279 = buf_16.term();
        } sink.propertyNamed("$qualifier", term_279);Term term_201;
        {
          BufferSink buf_23 = sink.context().makeBuffer();
          buf_23.start(_M_KEYS); buf_23.start(_M__sNil); buf_23.end();
          buf_23.end();
          term_201 = buf_23.term();
        } sink.propertyNamed("$rulekeys", term_201);Term term_147;
        {
          BufferSink buf_27 = sink.context().makeBuffer();
          buf_27.start(_M_KEYS); buf_27.start(_M__sNil); buf_27.end();
          buf_27.end();
          term_147 = buf_27.term();
        } sink.propertyNamed("$datakeys", term_147);Term term_193;
        {
          BufferSink buf_40 = sink.context().makeBuffer();
          buf_40.start(_M_KEYS); buf_40.start(_M__sNil); buf_40.end();
          buf_40.end();
          term_193 = buf_40.term();
        } sink.propertyNamed("$funckeys", term_193);Term term_149;
        {
          BufferSink buf_20 = sink.context().makeBuffer();
          buf_20.start(_M_IMPORTS); buf_20.start(_M__sNil); buf_20.end();
          buf_20.end();
          term_149 = buf_20.term();
        } sink.propertyNamed("$imported", term_149);Term term_185;
        {
          BufferSink buf_75 = sink.context().makeBuffer();
          buf_75.start(_M_IMPORTS); buf_75.start(_M__sNil); buf_75.end();
          buf_75.end();
          term_185 = buf_75.term();
        } sink.propertyNamed("$grammars", term_185);
        sink.start(_M_N1Declarations); sink.copy(term_58.ref());
        Variable var_175 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_175});
        VariableUse use_50 = sink.context().makeVariableUse(var_175);
        sink.substitute(term_238.ref(), new Variable[] { var_61 }, new Term[] {use_50});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1DeclarationsInit, term_153, term_58, var_61, term_238);
  }    final public static boolean _M_NormalizeToState(Sink sink, int shared, int depth, Term term_123, Term term_3) {
    if (depth < 2000) {
      label_79: {
        /* #filename=term */
        if (term_3.descriptor() != _M_Crsx_xcrsx)
        {   break label_79;
        }Term sub_426 = term_3.sub(0).ref();
        /* #declarations=sub *//*Contract*/
        sink.start(_M_N1DeclarationsInit);
        sink.start(_M_BaseName); sink.copy(term_123.ref());
        sink.end();
        sink.start(_M_DesugarDeclarations); sink.copy(sub_426.ref());
        sink.end();
        Variable var_160 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_160});
        sink.start(_M_N2); sink.use(var_160);
        Variable var_27 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_27}); sink.start(_M_LOADED); sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeToState, term_123, term_3);
  }  final public static boolean _M_NormalizeToCrsx(Sink sink, int shared, int depth, Term term_80, Term term_215) {
    if (depth < 2000) {
      label_62: {
        /* #filename=term */
        if (term_215.descriptor() != _M_Crsx_xcrsx)
        {   break label_62;
        }Term sub_340 = term_215.sub(0).ref();
        /* #declarations=sub *//*Contract*/
        sink.start(_M_N1DeclarationsInit); sink.start(_M_BaseName); sink.copy(term_80.ref()); sink.end();
        sink.start(_M_DesugarDeclarations); sink.copy(sub_340.ref());
        sink.end();
        Variable var_29 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_29});
        sink.start(_M_N2); sink.use(var_29);
        Variable var_15 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_15}); sink.start(_M_OutputCrsx); sink.use(var_15); sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeToCrsx, term_80, term_215);
  }  
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.parser.Crsx.init(context); org.crsx.compiler.State.init(context); org.crsx.compiler.Crsxutils.init(context); org.crsx.compiler.std.Core.init(context); org.crsx.compiler.std.String.init(context); org.crsx.compiler.std.List.init(context); org.crsx.compiler.std.Num.init(context); org.crsx.compiler.std.Path.init(context); context.register(_M_NormalizeDispatchCases); context.register(_M_NormalizeDispatch); context.register(_M_NormalizeConcrete); context.register(_M_NormalizeFreeTerms); context.register(_M_NormalizeFreeArgumentsOpt); context.register(_M_MakeBuiltin); context.register(_M_NormalizeConstructor); context.register(_M_NormalizeFreeTerm); context.register(_M_NormalizeNextBinder); context.register(_M_NormalizeTerm); context.register(_M_NormalizeTerms); context.register(_M_NormalizeArgumentsOpt); context.register(_M_NormalizeProperties); context.register(_M_NormalizePropertiesOpt); context.register(_M_NormalizeRule); context.register(_M_NormalizeRules); context.register(_M_NormalizeRuleKey1); context.register(_M_NormalizeRuleKey); context.register(_M_DispatchCases); context.register(_M_DispatchMetaArgsOpt); context.register(_M_DispatchPatternNextBinder); context.register(_M_DispatchPatternBinder); context.register(_M_DispatchPatternFreeTerm); context.register(_M_DispatchPatternTerm); context.register(_M_DispatchPatternArgs); context.register(_M_DispatchProperties); context.register(_M_Dispatch); context.register(_M_GroupRule); context.register(_M_MayGroupRule2); context.register(_M_MayGroupRule1); context.register(_M_MayGroupRule); context.register(_M_N2Rule); context.register(_M_N2Rules); context.register(_M_N2); context.register(_M_N1ImportDirective); context.register(_M_N1ImportDirectives); context.register(_M_N1Import); context.register(_M_N1DirectiveConstructor); context.register(_M_N1Directive); context.register(_M_N1Declaration); context.register(_M_N1Declarations1); context.register(_M_N1Declarations); context.register(_M_N1DeclarationsInit); context.register(_M_NormalizeToState); context.register(_M_NormalizeToCrsx);
      initialized = true;
    }
  }

/* END MODULE « "/Users/villardl/Projects/crsx/crsx4_2/src/normalizer.crs.java" » */
}