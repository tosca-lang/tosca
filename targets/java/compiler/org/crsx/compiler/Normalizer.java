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
      label_57: {
        if (term.descriptor() != _M__sCons)
        {   break label_57;
        }Term sub = term.sub(0).ref();
        if (sub.descriptor() != _M_Crsx_xdispatchCases_xS1)
        {   break label_57;
        }Term sub_83 = sub.sub(0).ref();Term sub_55 = sub.sub(1).ref();
        if (sub_55.descriptor() != _M_Crsx_xdispatchCase)
        {   break label_57;
        }Term sub_2 = sub_55.sub(0).ref();
        /* #ruleDeclaration=sub */Term sub_68 = term.sub(1).ref();
        /* #dispatchCases_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdispatchCases_xS1); sink.literal(";");
        sink.start(_M_Crsx_xdispatchCase);sink.properties(safeRef(props));
        sink.start(_M_NormalizeRule); sink.copy(sub_2.ref());
        sink.end();
        sink.end();
        sink.end();sink.properties(safeRef(props));
        sink.start(_M_NormalizeDispatchCases); sink.copy(sub_68.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeDispatchCases, props, term);
  } final public static boolean _M_NormalizeDispatch(Sink sink, int shared, int depth, Properties props_83, Term term_69) {
    if (depth < 2000) {
      label_10: {
        if (term_69.descriptor() != _M_Crsx_xdispatch)
        {   break label_10;
        }Term sub_86 = term_69.sub(0).ref();Term sub_10 = term_69.sub(1).ref();
        if (sub_10.descriptor() != _M_Crsx_xdispatchTerm)
        {   break label_10;
        }Term sub_28 = sub_10.sub(0).ref();
        /* #freeTerm=sub */Term sub_5 = term_69.sub(2).ref();
        /* #dispatchCases=sub */Term sub_85 = term_69.sub(3).ref();
        /* #delayCase?=sub *//*Contract*/
        sink.start(_M_Crsx_xdispatch); sink.literal("dispatch");
        sink.start(_M_Crsx_xdispatchTerm);sink.properties(safeRef(props_83));
        sink.start(_M_NormalizeFreeTerm); sink.copy(sub_28.ref());
        sink.end();
        sink.end();
        sink.start(_M_SugarDispatchCases);sink.properties(safeRef(props_83));
        sink.start(_M_NormalizeDispatchCases);
        sink.start(_M_DesugarDispatchCases); sink.copy(sub_5.ref());
        sink.end();
        sink.end();
        sink.end(); sink.copy(sub_85.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeDispatch, props_83, term_69);
  } final public static boolean _M_NormalizeConcrete(Sink sink, int shared, int depth, Properties props_30, Term term_93) {
    if (depth < 2000) {
      label_30: {
        if (term_93.descriptor() != _M_Crsx_xconcrete_xA1)
        {   break label_30;
        }Term sub_23 = term_93.sub(0).ref();
        /* #CATEGORY=sub */Term sub_97 = term_93.sub(1).ref();
        /* #CONCRETE=sub *//*Contract*/sink.properties(safeRef(props_30));
        sink.start(_M_NormalizeFreeTerm);
        sink.start(_M_ParseToTerm); sink.literal("freeTerm");
        sink.start(_M_ParseToString);
        sink.start(_M_RemoveFirstChar); sink.copy(sub_23.ref());
        sink.end();
        sink.start(_M_RemoveFirstChar);
        sink.start(_M_RemoveLastChar); sink.copy(sub_97.ref());
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeConcrete, props_30, term_93);
  } final public static boolean _M_NormalizeFreeTerms(Sink sink, int shared, int depth, Properties props_78, Term term_23) {
    if (depth < 2000) {
      label_0: {
        if (term_23.descriptor() != _M__sNil)
        {   break label_0;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_81: {
        if (term_23.descriptor() != _M__sCons)
        {   break label_81;
        }Term sub_29 = term_23.sub(0).ref();
        if (sub_29.descriptor() != _M_Crsx_xfreeTerms_xS1)
        {   break label_81;
        }Term sub_33 = sub_29.sub(0).ref();Term sub_13 = sub_29.sub(1).ref();
        /* #freeTerm=sub */Term sub_46 = term_23.sub(1).ref();
        /* #freeTerms_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeTerms_xS1); sink.literal(",");sink.properties(safeRef(props_78));
        sink.start(_M_NormalizeFreeTerm); sink.copy(sub_13.ref());
        sink.end();
        sink.end();sink.properties(safeRef(props_78));
        sink.start(_M_NormalizeFreeTerms); sink.copy(sub_46.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeFreeTerms, props_78, term_23);
  } final public static boolean _M_NormalizeFreeArgumentsOpt(Sink sink, int shared, int depth, Properties props_65, Term term_63) {
    if (depth < 2000) {
      label_37: {
        if (term_63.descriptor() != _M__sNil)
        {   break label_37;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_21: {
        if (term_63.descriptor() != _M__sCons)
        {   break label_21;
        }Term sub_3 = term_63.sub(0).ref();
        if (sub_3.descriptor() != _M_Crsx_xfreeArguments)
        {   break label_21;
        }Term sub_125 = sub_3.sub(0).ref();Term sub_278 = sub_3.sub(1).ref();
        if (sub_278.descriptor() != _M__sNil)
        {   break label_21;
        }Term sub_52 = sub_3.sub(2).ref();Term sub_18 = term_63.sub(1).ref();
        if (sub_18.descriptor() != _M__sNil)
        {   break label_21;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_170: {
        if (term_63.descriptor() != _M__sCons)
        {   break label_170;
        }Term sub_42 = term_63.sub(0).ref();
        if (sub_42.descriptor() != _M_Crsx_xfreeArguments)
        {   break label_170;
        }Term sub_139 = sub_42.sub(0).ref();Term sub_7 = sub_42.sub(1).ref();
        if (sub_7.descriptor() != _M__sCons)
        {   break label_170;
        }Term sub_89 = sub_7.sub(0).ref();
        /* #freeTerms=sub */Term sub_93 = sub_7.sub(1).ref();
        if (sub_93.descriptor() != _M__sNil)
        {   break label_170;
        }Term sub_49 = sub_42.sub(2).ref();Term sub_20 = term_63.sub(1).ref();
        if (sub_20.descriptor() != _M__sNil)
        {   break label_170;
        }/*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeArguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_SugarFreeTerms);
        sink.start(_M_NormalizeFreeTerms);
        sink.start(_M_DesugarFreeTerms); sink.copy(sub_89.ref());
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeFreeArgumentsOpt, props_65, term_63);
  } final public static boolean _M_MakeBuiltin(Sink sink, int shared, int depth, Term term_6) {
    if (depth < 2000) {
      label_78: {
        if (term_6.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_78;
        }Term sub_24 = term_6.sub(0).ref();
        if (sub_24.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_78;
        }Term sub_58 = term_6.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("Builtin$"); sink.copy(sub_58.ref());
        sink.end();
        sink.end(); return true;
      }
      label_35: {
        if (term_6.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_35;
        }Term sub_17 = term_6.sub(0).ref();
        if (sub_17.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_35;
        }Term sub_25 = sub_17.sub(0).ref();/*Contract*/
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.literal("Builtin$Colon");
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_MakeBuiltin, term_6);
  } final public static boolean _M_NormalizeConstructor(Sink sink, int shared, int depth, Properties props_14, Term term_81, Term term_45, Term term_9, Term term_60, Term term_1) {
    if (depth < 2000) {
      label_51: {
        if (term_81.descriptor() != _M_TRUE)
        {   break label_51;
        }
        /* #annotations?=term */
        /* #properties?2=term */
        /* #constructor=term */
        if (term_1.descriptor() != _M__sCons)
        {   break label_51;
        }Term sub_56 = term_1.sub(0).ref();
        if (sub_56.descriptor() != _M_Crsx_xarguments)
        {   break label_51;
        }Term sub_126 = sub_56.sub(0).ref();Term sub_181 = sub_56.sub(1).ref();
        if (sub_181.descriptor() != _M__sCons)
        {   break label_51;
        }Term sub_1 = sub_181.sub(0).ref();
        if (sub_1.descriptor() != _M_Crsx_xterms)
        {   break label_51;
        }Term sub_203 = sub_1.sub(0).ref();
        if (sub_203.descriptor() != _M_Crsx_xterm_xA1)
        {   break label_51;
        }Term sub_36 = sub_203.sub(0).ref();
        if (sub_36.descriptor() != _M_Crsx_xfreeTerm_xA1)
        {   break label_51;
        }Term sub_78 = sub_36.sub(0).ref();
        if (sub_78.descriptor() != _M__sNil)
        {   break label_51;
        }Term sub_22 = sub_36.sub(1).ref();
        /* #properties?=sub */Term sub_27 = sub_36.sub(2).ref();
        /* #constructor2=sub */Term sub_60 = sub_36.sub(3).ref();
        if (sub_60.descriptor() != _M__sNil)
        {   break label_51;
        }Term sub_71 = sub_1.sub(1).ref();
        /* #terms_S1*=sub */Term sub_30 = sub_181.sub(1).ref();
        if (sub_30.descriptor() != _M__sNil)
        {   break label_51;
        }Term sub_90 = sub_56.sub(2).ref();Term sub_92 = term_1.sub(1).ref();
        if (sub_92.descriptor() != _M__sNil)
        {   break label_51;
        }/*Contract*/sink.properties(safeRef(props_14));
        sink.start(_M_NormalizeConstructor); sink.start(_M_FALSE); sink.end(); sink.copy(term_45.ref()); sink.copy(term_9.ref()); sink.copy(term_60.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms);
        sink.start(_M_Crsx_xterm_xA1);
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.start(_M__sNil); sink.end(); sink.copy(sub_22.ref());
        sink.start(_M_MakeBuiltin); sink.copy(sub_27.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.copy(sub_71.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_41: {
        if (term_81.descriptor() != _M_FALSE)
        {   break label_41;
        }
        /* #annotations?=term */
        /* #properties?=term */
        /* #constructor=term */
        /* #arguments?=term *//*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.copy(term_45.ref());sink.properties(safeRef(props_14));
        sink.start(_M_NormalizePropertiesOpt); sink.copy(term_9.ref());
        sink.end(); sink.copy(term_60.ref());sink.properties(safeRef(props_14));
        sink.start(_M_NormalizeArgumentsOpt); sink.copy(term_1.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeConstructor, props_14, term_81, term_45, term_9, term_60, term_1);
  }     final public static boolean _M_NormalizeFreeTerm(Sink sink, int shared, int depth, Properties props_37, Term term_4) {
    if (depth < 2000) {
      label_13: {
        if (term_4.descriptor() != _M_Crsx_xfreeTerm_xA1)
        {   break label_13;
        }Term sub_48 = term_4.sub(0).ref();
        /* #annotations?=sub */Term sub_31 = term_4.sub(1).ref();
        /* #properties?=sub */Term sub_80 = term_4.sub(2).ref();
        /* #constructor=sub */Term sub_94 = term_4.sub(3).ref();
        /* #arguments?=sub *//*Contract*/sink.properties(safeRef(props_37));
        sink.start(_M_NormalizeConstructor);
        sink.start(_M_IsPrimitive); sink.copy(sub_80.ref());
        sink.end(); sink.copy(sub_48.ref()); sink.copy(sub_31.ref()); sink.copy(sub_80.ref()); sink.copy(sub_94.ref());
        sink.end(); return true;
      }
      label_39: {
        if (term_4.descriptor() != _M_Crsx_xfreeTerm_xA2)
        {   break label_39;
        }Term sub_233 = term_4.sub(0).ref();
        /* #annotations?=sub */Term sub_194 = term_4.sub(1).ref();
        /* #properties?=sub */Term sub_168 = term_4.sub(2).ref();
        /* #constructor=sub */Term sub_34 = term_4.sub(3).ref();
        /* #term=sub *//*Contract*/sink.properties(safeRef(props_37));
        sink.start(_M_NormalizeFreeTerm);
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.copy(sub_233.ref()); sink.copy(sub_194.ref()); sink.copy(sub_168.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms); sink.copy(sub_34.ref()); sink.start(_M__sNil); sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_75: {
        if (term_4.descriptor() != _M_Crsx_xfreeTerm_xA3)
        {   break label_75;
        }Term sub_77 = term_4.sub(0).ref();
        /* #annotations?=sub */Term sub_151 = term_4.sub(1).ref();
        /* #properties?=sub */Term sub_79 = term_4.sub(2).ref();
        /* #literal=sub *//*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA3); sink.copy(sub_77.ref());sink.properties(safeRef(props_37));
        sink.start(_M_NormalizePropertiesOpt); sink.copy(sub_151.ref());
        sink.end(); sink.copy(sub_79.ref());
        sink.end(); return true;
      }
      label_38: {
        if (term_4.descriptor() != _M_Crsx_xfreeTerm_xA4)
        {   break label_38;
        }Term sub_59 = term_4.sub(0).ref();
        /* #annotations?=sub */Term sub_8 = term_4.sub(1).ref();
        /* #list=sub *//*Contract*/sink.properties(safeRef(props_37));
        sink.start(_M_NormalizeFreeTerm);
        sink.start(_M_DesugarList); sink.copy(sub_8.ref());
        sink.end();
        sink.end(); return true;
      }
      label_14: {
        if (term_4.descriptor() != _M_Crsx_xfreeTerm_xA5)
        {   break label_14;
        }Term sub_41 = term_4.sub(0).ref();
        /* #annotations?=sub */Term sub_65 = term_4.sub(1).ref();
        /* #variable=sub *//*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA5); sink.copy(sub_41.ref()); sink.copy(sub_65.ref());
        sink.end(); return true;
      }
      label_93: {
        if (term_4.descriptor() != _M_Crsx_xfreeTerm_xA6)
        {   break label_93;
        }Term sub_121 = term_4.sub(0).ref();
        /* #annotations?=sub */Term sub_157 = term_4.sub(1).ref();
        if (sub_157.descriptor() != _M_Crsx_xproperties)
        {   break label_93;
        }Term sub_119 = sub_157.sub(0).ref();Term sub_39 = sub_157.sub(1).ref();
        if (sub_39.descriptor() != _M__sCons)
        {   break label_93;
        }Term sub_95 = sub_39.sub(0).ref();
        /* #propertyList=sub */Term sub_81 = sub_39.sub(1).ref();
        if (sub_81.descriptor() != _M__sNil)
        {   break label_93;
        }Term sub_179 = sub_157.sub(2).ref();/*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA6); sink.copy(sub_121.ref());
        sink.start(_M_Crsx_xproperties); sink.literal("{");
        sink.start(_M__sCons);
        sink.start(_M_SugarPropertyList);sink.properties(safeRef(props_37));
        sink.start(_M_NormalizeProperties);
        sink.start(_M_DesugarPropertyList); sink.copy(sub_95.ref());
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("}");
        sink.end();
        sink.end(); return true;
      }
      label_45: {
        if (term_4.descriptor() != _M_Crsx_xfreeTerm_xA7)
        {   break label_45;
        }Term sub_9 = term_4.sub(0).ref();
        /* #annotations?=sub */Term sub_37 = term_4.sub(1).ref();
        /* #properties?=sub */Term sub_32 = term_4.sub(2).ref();
        /* #METAVAR=sub */Term sub_64 = term_4.sub(3).ref();
        /* #freeArguments?=sub *//*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA7); sink.copy(sub_9.ref());sink.properties(safeRef(props_37));
        sink.start(_M_NormalizePropertiesOpt); sink.copy(sub_37.ref());
        sink.end(); sink.copy(sub_32.ref());sink.properties(safeRef(props_37));
        sink.start(_M_NormalizeFreeArgumentsOpt); sink.copy(sub_64.ref());
        sink.end();
        sink.end(); return true;
      }
      label_74: {
        if (term_4.descriptor() != _M_Crsx_xfreeTerm_xA8)
        {   break label_74;
        }Term sub_66 = term_4.sub(0).ref();
        /* #annotations?=sub */Term sub_274 = term_4.sub(1).ref();
        /* #concrete=sub *//*Contract*/sink.properties(safeRef(props_37));
        sink.start(_M_NormalizeConcrete); sink.copy(sub_274.ref());
        sink.end(); return true;
      }
      label_177: {
        if (term_4.descriptor() != _M_Crsx_xfreeTerm_xA9)
        {   break label_177;
        }Term sub_45 = term_4.sub(0).ref();
        /* #annotations?=sub */Term sub_63 = term_4.sub(1).ref();
        /* #properties?=sub */Term sub_47 = term_4.sub(2).ref();
        if (sub_47.descriptor() != _M_Crsx_xexpression)
        {   break label_177;
        }Term sub_0 = sub_47.sub(0).ref();
        /* #dispatch=sub *//*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA9); sink.copy(sub_45.ref());sink.properties(safeRef(props_37));
        sink.start(_M_NormalizePropertiesOpt); sink.copy(sub_63.ref());
        sink.end();
        sink.start(_M_Crsx_xexpression);sink.properties(safeRef(props_37));
        sink.start(_M_NormalizeDispatch); sink.copy(sub_0.ref());
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeFreeTerm, props_37, term_4);
  } final public static boolean _M_NormalizeNextBinder(Sink sink, int shared, int depth, Properties props_56, Term term_17) {
    if (depth < 2000) {
      label_298: {
        if (term_17.descriptor() != _M_Crsx_xnextBinder_xA1)
        {   break label_298;
        }Term sub_82 = term_17.sub(0).ref();
        /* #binder=sub */Term sub_96 = term_17.sub(1).ref();
        /* #nextBinder=sub *//*Contract*/
        sink.start(_M_Crsx_xnextBinder_xA1); sink.copy(sub_82.ref());sink.properties(safeRef(props_56));
        sink.start(_M_NormalizeNextBinder); sink.copy(sub_96.ref());
        sink.end();
        sink.end(); return true;
      }
      label_60: {
        if (term_17.descriptor() != _M_Crsx_xnextBinder_xA2)
        {   break label_60;
        }Term sub_122 = term_17.sub(0).ref();Term sub_74 = term_17.sub(1).ref();
        /* #freeTerm=sub *//*Contract*/
        sink.start(_M_Crsx_xnextBinder_xA2); sink.literal(".");sink.properties(safeRef(props_56));
        sink.start(_M_NormalizeFreeTerm); sink.copy(sub_74.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeNextBinder, props_56, term_17);
  } final public static boolean _M_NormalizeTerm(Sink sink, int shared, int depth, Properties props_120, Term term_83) {
    if (depth < 2000) {
      label_49: {
        if (term_83.descriptor() != _M_Crsx_xterm_xA1)
        {   break label_49;
        }Term sub_73 = term_83.sub(0).ref();
        /* #freeTerm=sub *//*Contract*/
        sink.start(_M_Crsx_xterm_xA1);sink.properties(safeRef(props_120));
        sink.start(_M_NormalizeFreeTerm); sink.copy(sub_73.ref());
        sink.end();
        sink.end(); return true;
      }
      label_87: {
        if (term_83.descriptor() != _M_Crsx_xterm_xA2)
        {   break label_87;
        }Term sub_53 = term_83.sub(0).ref();
        if (sub_53.descriptor() != _M_Crsx_xboundTerm)
        {   break label_87;
        }Term sub_148 = sub_53.sub(0).ref();
        /* #binder=sub */Term sub_232 = sub_53.sub(1).ref();
        /* #nextBinder=sub *//*Contract*/
        sink.start(_M_Crsx_xterm_xA2);
        sink.start(_M_Crsx_xboundTerm); sink.copy(sub_148.ref());sink.properties(safeRef(props_120));
        sink.start(_M_NormalizeNextBinder); sink.copy(sub_232.ref());
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeTerm, props_120, term_83);
  } final public static boolean _M_NormalizeTerms(Sink sink, int shared, int depth, Properties props_4, Term term_79) {
    if (depth < 2000) {
      label_158: {
        if (term_79.descriptor() != _M__sNil)
        {   break label_158;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_72: {
        if (term_79.descriptor() != _M__sCons)
        {   break label_72;
        }Term sub_189 = term_79.sub(0).ref();
        if (sub_189.descriptor() != _M_Crsx_xterms_xS1)
        {   break label_72;
        }Term sub_160 = sub_189.sub(0).ref();Term sub_87 = sub_189.sub(1).ref();
        /* #term=sub */Term sub_99 = term_79.sub(1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms_xS1); sink.literal(",");sink.properties(safeRef(props_4));
        sink.start(_M_NormalizeTerm); sink.copy(sub_87.ref());
        sink.end();
        sink.end();sink.properties(safeRef(props_4));
        sink.start(_M_NormalizeTerms); sink.copy(sub_99.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeTerms, props_4, term_79);
  } final public static boolean _M_NormalizeArgumentsOpt(Sink sink, int shared, int depth, Properties props_66, Term term_76) {
    if (depth < 2000) {
      label_95: {
        if (term_76.descriptor() != _M__sNil)
        {   break label_95;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_142: {
        if (term_76.descriptor() != _M__sCons)
        {   break label_142;
        }Term sub_178 = term_76.sub(0).ref();
        if (sub_178.descriptor() != _M_Crsx_xarguments)
        {   break label_142;
        }Term sub_50 = sub_178.sub(0).ref();Term sub_62 = sub_178.sub(1).ref();
        if (sub_62.descriptor() != _M__sNil)
        {   break label_142;
        }Term sub_35 = sub_178.sub(2).ref();Term sub_137 = term_76.sub(1).ref();
        if (sub_137.descriptor() != _M__sNil)
        {   break label_142;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_32: {
        if (term_76.descriptor() != _M__sCons)
        {   break label_32;
        }Term sub_140 = term_76.sub(0).ref();
        if (sub_140.descriptor() != _M_Crsx_xarguments)
        {   break label_32;
        }Term sub_38 = sub_140.sub(0).ref();Term sub_21 = sub_140.sub(1).ref();
        if (sub_21.descriptor() != _M__sCons)
        {   break label_32;
        }Term sub_67 = sub_21.sub(0).ref();
        /* #terms=sub */Term sub_124 = sub_21.sub(1).ref();
        if (sub_124.descriptor() != _M__sNil)
        {   break label_32;
        }Term sub_142 = sub_140.sub(2).ref();Term sub_296 = term_76.sub(1).ref();
        if (sub_296.descriptor() != _M__sNil)
        {   break label_32;
        }/*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_SugarTerms);
        sink.start(_M_NormalizeTerms);
        sink.start(_M_DesugarTerms); sink.copy(sub_67.ref());
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeArgumentsOpt, props_66, term_76);
  } final public static boolean _M_NormalizeProperties(Sink sink, int shared, int depth, Properties props_16, Term term_48) {
    if (depth < 2000) { sink.copy(term_48.ref()); return true;
    }
    return thunk(sink, _M_NormalizeProperties, props_16, term_48);
  } final public static boolean _M_NormalizePropertiesOpt(Sink sink, int shared, int depth, Properties props_80, Term term_7) {
    if (depth < 2000) {
      label_52: {
        if (term_7.descriptor() != _M__sNil)
        {   break label_52;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_63: {
        if (term_7.descriptor() != _M__sCons)
        {   break label_63;
        }Term sub_98 = term_7.sub(0).ref();
        if (sub_98.descriptor() != _M_Crsx_xproperties)
        {   break label_63;
        }Term sub_183 = sub_98.sub(0).ref();Term sub_57 = sub_98.sub(1).ref();
        if (sub_57.descriptor() != _M__sNil)
        {   break label_63;
        }Term sub_127 = sub_98.sub(2).ref();Term sub_40 = term_7.sub(1).ref();
        if (sub_40.descriptor() != _M__sNil)
        {   break label_63;
        }/*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xproperties); sink.literal("{"); sink.start(_M__sNil); sink.end(); sink.literal("}");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
      label_29: {
        if (term_7.descriptor() != _M__sCons)
        {   break label_29;
        }Term sub_172 = term_7.sub(0).ref();
        if (sub_172.descriptor() != _M_Crsx_xproperties)
        {   break label_29;
        }Term sub_91 = sub_172.sub(0).ref();Term sub_51 = sub_172.sub(1).ref();
        if (sub_51.descriptor() != _M__sCons)
        {   break label_29;
        }Term sub_14 = sub_51.sub(0).ref();
        /* #propertyList=sub */Term sub_132 = sub_51.sub(1).ref();
        if (sub_132.descriptor() != _M__sNil)
        {   break label_29;
        }Term sub_284 = sub_172.sub(2).ref();Term sub_19 = term_7.sub(1).ref();
        if (sub_19.descriptor() != _M__sNil)
        {   break label_29;
        }/*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xproperties); sink.literal("{");
        sink.start(_M__sCons);
        sink.start(_M_SugarPropertyList);sink.properties(safeRef(props_80));
        sink.start(_M_NormalizeProperties);
        sink.start(_M_DesugarPropertyList); sink.copy(sub_14.ref());
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("}");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizePropertiesOpt, props_80, term_7);
  } final public static boolean _M_NormalizeRule(Sink sink, int shared, int depth, Properties props_76, Term term_72) {
    if (depth < 2000) {
      label_36: {
        if (term_72.descriptor() != _M_Crsx_xruleDeclaration)
        {   break label_36;
        }Term sub_185 = term_72.sub(0).ref();
        /* #option?=sub */Term sub_133 = term_72.sub(1).ref();
        if (sub_133.descriptor() != _M_Crsx_xpattern)
        {   break label_36;
        }Term sub_4 = sub_133.sub(0).ref();
        /* #properties?=sub */Term sub_241 = sub_133.sub(1).ref();
        /* #constructor=sub */Term sub_149 = sub_133.sub(2).ref();
        /* #arguments?=sub */Term sub_43 = term_72.sub(2).ref();Term sub_102 = term_72.sub(3).ref();
        if (sub_102.descriptor() != _M_Crsx_xcontractum)
        {   break label_36;
        }Term sub_200 = sub_102.sub(0).ref();
        /* #freeTerm=sub *//*Contract*/
        sink.start(_M_Crsx_xruleDeclaration); sink.copy(sub_185.ref());
        sink.start(_M_Crsx_xpattern);sink.properties(safeRef(props_76));
        sink.start(_M_NormalizePropertiesOpt); sink.copy(sub_4.ref());
        sink.end(); sink.copy(sub_241.ref());sink.properties(safeRef(props_76));
        sink.start(_M_NormalizeArgumentsOpt); sink.copy(sub_149.ref());
        sink.end();
        sink.end(); sink.literal("\u2192");
        sink.start(_M_Crsx_xcontractum);sink.properties(safeRef(props_76));
        sink.start(_M_NormalizeFreeTerm); sink.copy(sub_200.ref());
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeRule, props_76, term_72);
  } final public static boolean _M_NormalizeRules(Sink sink, int shared, int depth, Properties props_94, Term term_10) {
    if (depth < 2000) {
      label_9: {
        if (term_10.descriptor() != _M__sCons)
        {   break label_9;
        }Term sub_44 = term_10.sub(0).ref();
        /* #rule=sub */Term sub_177 = term_10.sub(1).ref();
        if (sub_177.descriptor() != _M__sNil)
        {   break label_9;
        }/*Contract*/
        sink.start(_M__sCons);sink.properties(safeRef(props_94));
        sink.start(_M_NormalizeRule); sink.copy(sub_44.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeRules, props_94, term_10);
  } final public static boolean _M_NormalizeRuleKey1(Sink sink, int shared, int depth, Properties props_35, Term term_75, Term term_44, Variable var, Term term_35) {
    if (depth < 2000) {
      label_12: {
        if (term_75.descriptor() != _M_RULES)
        {   break label_12;
        }Term sub_26 = term_75.sub(0).ref();
        /* #rules=sub */
        /* #key=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_35));Term term_64;
        {
          BufferSink buf = sink.context().makeBuffer();
          buf.start(_M_RULES);buf.properties(safeRef(props_35));
          buf.start(_M_NormalizeRules); buf.copy(sub_26.ref());
          buf.end();
          buf.end();
          term_64 = buf.term();
        }
        term_44 = force(sink.context(), term_44);
        Sink.property(sink, term_44, term_64);Term term_74;
        {
          BufferSink buf_42 = sink.context().makeBuffer(); buf_42.start(_M_OK); buf_42.end();
          term_74 = buf_42.term();
        }
        sink.substitute(term_35.ref(), new Variable[] { var }, new Term[] {term_74}); return true;
      }
    }
    return thunk(sink, _M_NormalizeRuleKey1, props_35, term_75, term_44, var, term_35);
  }    final public static boolean _M_NormalizeRuleKey(Sink sink, int shared, int depth, Properties props_72, Term term_97, Term term_11, Variable var_27, Term term_94) {
    if (depth < 2000) {
      label_4: {
        if (term_97.descriptor() != _M_OK)
        {   break label_4;
        }
        /* #key=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_72));
        sink.start(_M_NormalizeRuleKey1);
        sink.start(_M__s);sink.properties(safeRef(props_72));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_11.ref());
        sink.end(); sink.copy(term_11.ref());
        Variable var_8 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_8});
        VariableUse use = sink.context().makeVariableUse(var_8);
        sink.substitute(term_94.ref(), new Variable[] { var_27 }, new Term[] {use});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeRuleKey, props_72, term_97, term_11, var_27, term_94);
  }    final public static boolean _M_DispatchCases(Sink sink, int shared, int depth, Term term_140) {
    if (depth < 2000) {
      label_165: {
        if (term_140.descriptor() != _M__sNil)
        {   break label_165;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_26: {
        if (term_140.descriptor() != _M__sCons)
        {   break label_26;
        }Term sub_143 = term_140.sub(0).ref();
        /* #rule=sub */Term sub_161 = term_140.sub(1).ref();
        /* #rules=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdispatchCases_xS1); sink.literal(";");
        sink.start(_M_Crsx_xdispatchCase); sink.copy(sub_143.ref());
        sink.end();
        sink.end();
        sink.start(_M_DispatchCases); sink.copy(sub_161.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DispatchCases, term_140);
  } final public static boolean _M_DispatchMetaArgsOpt(Sink sink, int shared, int depth, Term term_70) {
    if (depth < 2000) {
      label_5: {
        if (term_70.descriptor() != _M__sNil)
        {   break label_5;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_19: {
        if (term_70.descriptor() != _M__sCons)
        {   break label_19;
        }Term sub_15 = term_70.sub(0).ref();
        if (sub_15.descriptor() != _M_Crsx_xfreeTerms_xS1)
        {   break label_19;
        }Term sub_130 = sub_15.sub(0).ref();Term sub_360 = sub_15.sub(1).ref();
        /* #freeTerm=sub */Term sub_144 = term_70.sub(1).ref();
        /* #freeTerms_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeArguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeTerms); sink.copy(sub_360.ref()); sink.copy(sub_144.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DispatchMetaArgsOpt, term_70);
  } final public static boolean _M_DispatchPatternNextBinder(Sink sink, int shared, int depth, Term term_22, Term term_55, Term term_88) {
    if (depth < 2000) {
      label_117: {
        if (term_22.descriptor() != _M_Crsx_xnextBinder_xA2)
        {   break label_117;
        }Term sub_205 = term_22.sub(0).ref();Term sub_138 = term_22.sub(1).ref();
        /* #freeTerm=sub */
        /* #count=term */
        /* #freeTerms_S1*=term *//*Contract*/
        sink.start(_M_Crsx_xnextBinder_xA2); sink.literal(".");
        sink.start(_M_DispatchPatternFreeTerm); sink.copy(sub_138.ref()); sink.copy(term_55.ref()); sink.copy(term_88.ref());
        sink.end();
        sink.end(); return true;
      }
      label_173: {
        if (term_22.descriptor() != _M_Crsx_xnextBinder_xA1)
        {   break label_173;
        }Term sub_12 = term_22.sub(0).ref();
        if (sub_12.descriptor() != _M_Crsx_xbinder)
        {   break label_173;
        }Term sub_267 = sub_12.sub(0).ref();
        /* #annotations?=sub */Term sub_264 = sub_12.sub(1).ref();
        if (sub_264.descriptor() != _M_Crsx_xvariable)
        {   break label_173;
        }Term sub_196 = sub_264.sub(0).ref();
        if (sub_196.descriptor() != _M__sNil)
        {   break label_173;
        }Term sub_361 = sub_264.sub(1).ref();
        /* #VARIABLE=sub */Term sub_235 = sub_264.sub(2).ref();
        /* #linear?=sub */Term sub_191 = sub_264.sub(3).ref();
        /* #functional?=sub */Term sub_147 = sub_264.sub(4).ref();
        /* #varsort?=sub */Term sub_198 = term_22.sub(1).ref();
        /* #nextBinder=sub */
        /* #count=term */
        /* #freeTerms_S1*=term *//*Contract*/
        sink.start(_M_Crsx_xnextBinder_xA1);
        sink.start(_M_Crsx_xbinder); sink.copy(sub_267.ref());
        sink.start(_M_Crsx_xvariable); sink.start(_M__sNil); sink.end(); sink.copy(sub_361.ref()); sink.copy(sub_235.ref()); sink.copy(sub_191.ref()); sink.copy(sub_147.ref());
        sink.end();
        sink.end();
        sink.start(_M_DispatchPatternNextBinder); sink.copy(sub_198.ref()); sink.copy(term_55.ref());
        sink.start(_M_Concat); sink.copy(term_88.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeTerms_xS1); sink.literal(",");
        sink.start(_M_Crsx_xfreeTerm_xA5); sink.copy(sub_267.ref());
        sink.start(_M_Crsx_xvariable); sink.start(_M__sNil); sink.end(); sink.copy(sub_361.ref()); sink.copy(sub_235.ref()); sink.copy(sub_191.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DispatchPatternNextBinder, term_22, term_55, term_88);
  }   final public static boolean _M_DispatchPatternBinder(Sink sink, int shared, int depth, Term term_24, Term term_26, Term term_77, Term term_49) {
    if (depth < 2000) {
      label_25: {
        if (term_24.descriptor() != _M_Crsx_xbinder)
        {   break label_25;
        }Term sub_75 = term_24.sub(0).ref();
        /* #annotations?=sub */Term sub_117 = term_24.sub(1).ref();
        if (sub_117.descriptor() != _M_Crsx_xvariable)
        {   break label_25;
        }Term sub_199 = sub_117.sub(0).ref();
        if (sub_199.descriptor() != _M__sNil)
        {   break label_25;
        }Term sub_112 = sub_117.sub(1).ref();
        /* #VARIABLE=sub */Term sub_329 = sub_117.sub(2).ref();
        /* #linear?=sub */Term sub_129 = sub_117.sub(3).ref();
        /* #functional?=sub */Term sub_254 = sub_117.sub(4).ref();
        /* #varsort?=sub */
        /* #nextBinder=term */
        /* #count=term */
        /* #freeTerms_S1*=term *//*Contract*/
        sink.start(_M_Crsx_xterm_xA2);
        sink.start(_M_Crsx_xboundTerm);
        sink.start(_M_Crsx_xbinder); sink.copy(sub_75.ref());
        sink.start(_M_Crsx_xvariable); sink.start(_M__sNil); sink.end(); sink.copy(sub_112.ref()); sink.copy(sub_329.ref()); sink.copy(sub_129.ref()); sink.copy(sub_254.ref());
        sink.end();
        sink.end();
        sink.start(_M_DispatchPatternNextBinder); sink.copy(term_26.ref()); sink.copy(term_77.ref());
        sink.start(_M_Concat); sink.copy(term_49.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeTerms_xS1); sink.literal(",");
        sink.start(_M_Crsx_xfreeTerm_xA5); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xvariable); sink.start(_M__sNil); sink.end(); sink.copy(sub_112.ref()); sink.copy(sub_329.ref()); sink.copy(sub_129.ref()); sink.start(_M__sNil); sink.end();
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
    return thunk(sink, _M_DispatchPatternBinder, term_24, term_26, term_77, term_49);
  }    final public static boolean _M_DispatchPatternFreeTerm(Sink sink, int shared, int depth, Term term_19, Term term_78, Term term_25) {
    if (depth < 2000) {
      sink.start(_M_Crsx_xfreeTerm_xA7); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("#$P$");
      sink.start(_M__s); sink.start(_M_Builtin_sFormatNumber); sink.end(); sink.copy(term_78.ref());
      sink.end();
      sink.end();
      sink.start(_M_DispatchMetaArgsOpt); sink.copy(term_25.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchPatternFreeTerm, term_19, term_78, term_25);
  }   final public static boolean _M_DispatchPatternTerm(Sink sink, int shared, int depth, Term term_87, Term term_57, Term term_256) {
    if (depth < 2000) {
      label_53: {
        if (term_87.descriptor() != _M_Crsx_xterm_xA1)
        {   break label_53;
        }Term sub_76 = term_87.sub(0).ref();
        /* #freeTerm=sub */
        /* #count=term */
        /* #freeTerms_S1*=term *//*Contract*/
        sink.start(_M_Crsx_xterm_xA1);
        sink.start(_M_DispatchPatternFreeTerm); sink.copy(sub_76.ref()); sink.copy(term_57.ref()); sink.copy(term_256.ref());
        sink.end();
        sink.end(); return true;
      }
      label_6: {
        if (term_87.descriptor() != _M_Crsx_xterm_xA2)
        {   break label_6;
        }Term sub_192 = term_87.sub(0).ref();
        if (sub_192.descriptor() != _M_Crsx_xboundTerm)
        {   break label_6;
        }Term sub_173 = sub_192.sub(0).ref();
        /* #binder=sub */Term sub_195 = sub_192.sub(1).ref();
        /* #nextBinder=sub */
        /* #count=term */
        /* #freeTerms_S1*=term *//*Contract*/
        sink.start(_M_DispatchPatternBinder); sink.copy(sub_173.ref()); sink.copy(sub_195.ref()); sink.copy(term_57.ref()); sink.copy(term_256.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DispatchPatternTerm, term_87, term_57, term_256);
  }   final public static boolean _M_DispatchPatternArgs(Sink sink, int shared, int depth, Term term_171, Term term_14) {
    if (depth < 2000) {
      label_99: {
        if (term_171.descriptor() != _M__sNil)
        {   break label_99;
        }
        /* #count=term *//*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_3: {
        if (term_171.descriptor() != _M__sCons)
        {   break label_3;
        }Term sub_155 = term_171.sub(0).ref();
        if (sub_155.descriptor() != _M_Crsx_xterms_xS1)
        {   break label_3;
        }Term sub_154 = sub_155.sub(0).ref();Term sub_120 = sub_155.sub(1).ref();
        /* #term=sub */Term sub_485 = term_171.sub(1).ref();
        /* #terms_S1*=sub */
        /* #count=term *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms_xS1); sink.literal(",");
        sink.start(_M_DispatchPatternTerm); sink.copy(sub_120.ref()); sink.copy(term_14.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.start(_M_DispatchPatternArgs); sink.copy(sub_485.ref());
        sink.start(_M__s); sink.start(_M_Builtin_sPlus); sink.end(); sink.copy(term_14.ref()); sink.literal(1);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DispatchPatternArgs, term_171, term_14);
  }  final public static boolean _M_DispatchProperties(Sink sink, int shared, int depth, Term term_91) {
    if (depth < 2000) {
      label_155: {
        if (term_91.descriptor() != _M__sNil)
        {   break label_155;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_67: {
        if (term_91.descriptor() != _M__sCons)
        {   break label_67;
        }Term sub_174 = term_91.sub(0).ref();
        if (sub_174.descriptor() != _M_Crsx_xproperties)
        {   break label_67;
        }Term sub_88 = sub_174.sub(0).ref();Term sub_72 = sub_174.sub(1).ref();
        if (sub_72.descriptor() != _M__sNil)
        {   break label_67;
        }Term sub_54 = sub_174.sub(2).ref();Term sub_243 = term_91.sub(1).ref();
        if (sub_243.descriptor() != _M__sNil)
        {   break label_67;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_8: {
        if (term_91.descriptor() != _M__sCons)
        {   break label_8;
        }Term sub_70 = term_91.sub(0).ref();
        if (sub_70.descriptor() != _M_Crsx_xproperties)
        {   break label_8;
        }Term sub_229 = sub_70.sub(0).ref();Term sub_236 = sub_70.sub(1).ref();
        if (sub_236.descriptor() != _M__sCons)
        {   break label_8;
        }Term sub_331 = sub_236.sub(0).ref();
        /* #propertyList=sub */Term sub_290 = sub_236.sub(1).ref();
        if (sub_290.descriptor() != _M__sNil)
        {   break label_8;
        }Term sub_263 = sub_70.sub(2).ref();Term sub_116 = term_91.sub(1).ref();
        if (sub_116.descriptor() != _M__sNil)
        {   break label_8;
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
    return thunk(sink, _M_DispatchProperties, term_91);
  } final public static boolean _M_Dispatch(Sink sink, int shared, int depth, Term term_31) {
    if (depth < 2000) {
      label_168: {
        if (term_31.descriptor() != _M__sCons)
        {   break label_168;
        }Term sub_282 = term_31.sub(0).ref();
        if (sub_282.descriptor() != _M_Crsx_xruleDeclaration)
        {   break label_168;
        }Term sub_107 = sub_282.sub(0).ref();
        /* #option?=sub */Term sub_156 = sub_282.sub(1).ref();
        if (sub_156.descriptor() != _M_Crsx_xpattern)
        {   break label_168;
        }Term sub_375 = sub_156.sub(0).ref();
        /* #properties?=sub */Term sub_230 = sub_156.sub(1).ref();
        /* #constructor=sub */Term sub_328 = sub_156.sub(2).ref();
        if (sub_328.descriptor() != _M__sCons)
        {   break label_168;
        }Term sub_11 = sub_328.sub(0).ref();
        if (sub_11.descriptor() != _M_Crsx_xarguments)
        {   break label_168;
        }Term sub_316 = sub_11.sub(0).ref();Term sub_175 = sub_11.sub(1).ref();
        if (sub_175.descriptor() != _M__sCons)
        {   break label_168;
        }Term sub_180 = sub_175.sub(0).ref();
        /* #terms=sub */Term sub_69 = sub_175.sub(1).ref();
        if (sub_69.descriptor() != _M__sNil)
        {   break label_168;
        }Term sub_190 = sub_11.sub(2).ref();Term sub_295 = sub_328.sub(1).ref();
        if (sub_295.descriptor() != _M__sNil)
        {   break label_168;
        }Term sub_209 = sub_282.sub(2).ref();Term sub_153 = sub_282.sub(3).ref();
        /* #contractum=sub */Term sub_164 = term_31.sub(1).ref();
        /* #rules=sub *//*Contract*/
        sink.start(_M_Crsx_xruleDeclaration); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xpattern);
        sink.start(_M_DispatchProperties); sink.copy(sub_375.ref());
        sink.end(); sink.copy(sub_230.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_SugarTerms);
        sink.start(_M_DispatchPatternArgs);
        sink.start(_M_DesugarTerms); sink.copy(sub_180.ref());
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
        sink.start(_M_DispatchProperties); sink.copy(sub_375.ref());
        sink.end(); sink.copy(sub_230.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_SugarTerms);
        sink.start(_M_DispatchPatternArgs);
        sink.start(_M_DesugarTerms); sink.copy(sub_180.ref());
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
        sink.start(_M_Crsx_xruleDeclaration); sink.copy(sub_107.ref());
        sink.start(_M_Crsx_xpattern); sink.copy(sub_375.ref()); sink.copy(sub_230.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons); sink.copy(sub_180.ref()); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.literal("\u2192"); sink.copy(sub_153.ref());
        sink.end(); sink.copy(sub_164.ref());
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
    return thunk(sink, _M_Dispatch, term_31);
  } final public static boolean _M_GroupRule(Sink sink, int shared, int depth, Properties props_92, Term term_51, Term term_30, Variable var_39, Term term_43) {
    if (depth < 2000) {
      label_196: {
        /* #key=term */
        /* #rules=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_92));Term term_0;
        {
          BufferSink buf_47 = sink.context().makeBuffer();
          buf_47.start(_M_RULES);
          buf_47.start(_M__sCons);
          buf_47.start(_M_Dispatch); buf_47.copy(term_30.ref());
          buf_47.end(); buf_47.start(_M__sNil); buf_47.end();
          buf_47.end();
          buf_47.end();
          term_0 = buf_47.term();
        }
        term_51 = force(sink.context(), term_51);
        Sink.property(sink, term_51, term_0);Term term_61;
        {
          BufferSink buf_12 = sink.context().makeBuffer(); buf_12.start(_M_OK); buf_12.end();
          term_61 = buf_12.term();
        }
        sink.substitute(term_43.ref(), new Variable[] { var_39 }, new Term[] {term_61}); return true;
      }
    }
    return thunk(sink, _M_GroupRule, props_92, term_51, term_30, var_39, term_43);
  }    final public static boolean _M_MayGroupRule2(Sink sink, int shared, int depth, Properties props_158, Term term_3, Term term_53, Term term_39, Variable var_38, Term term_118) {
    if (depth < 2000) {
      label_40: {
        if (term_3.descriptor() != _M_TRUE)
        {   break label_40;
        }
        /* #key=term */
        /* #rules=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_158));Term term_98;
        {
          BufferSink buf_18 = sink.context().makeBuffer(); buf_18.start(_M_OK); buf_18.end();
          term_98 = buf_18.term();
        }
        sink.substitute(term_118.ref(), new Variable[] { var_38 }, new Term[] {term_98}); return true;
      }
      label_280: {
        if (term_3.descriptor() != _M_FALSE)
        {   break label_280;
        }
        /* #key=term */
        /* #rules=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_158));
        sink.start(_M_GroupRule); sink.copy(term_53.ref()); sink.copy(term_39.ref());
        Variable var_61 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_61});
        VariableUse use_69 = sink.context().makeVariableUse(var_61);
        sink.substitute(term_118.ref(), new Variable[] { var_38 }, new Term[] {use_69});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_MayGroupRule2, props_158, term_3, term_53, term_39, var_38, term_118);
  }     final public static boolean _M_MayGroupRule1(Sink sink, int shared, int depth, Properties props_64, Term term_36, Term term_86, Variable var_17, Term term_136) {
    if (depth < 2000) {
      label_33: {
        if (term_36.descriptor() != _M_RULES)
        {   break label_33;
        }Term sub_321 = term_36.sub(0).ref();
        /* #rules=sub */
        /* #key=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_64));
        sink.start(_M_MayGroupRule2);
        sink.start(_M_Or); sink.start(_M_IsEmpty); sink.copy(sub_321.ref()); sink.end();
        sink.start(_M_And);
        sink.start(_M_IsSingleton); sink.copy(sub_321.ref());
        sink.end();
        sink.start(_M_AllMetaInPatternRule); sink.start(_M_Head); sink.copy(sub_321.ref()); sink.end();
        sink.end();
        sink.end();
        sink.end(); sink.copy(term_86.ref()); sink.copy(sub_321.ref());
        Variable var_94 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_94});
        VariableUse use_96 = sink.context().makeVariableUse(var_94);
        sink.substitute(term_136.ref(), new Variable[] { var_17 }, new Term[] {use_96});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_MayGroupRule1, props_64, term_36, term_86, var_17, term_136);
  }    final public static boolean _M_MayGroupRule(Sink sink, int shared, int depth, Properties props_75, Term term_18, Variable var_73, Term term_42) {
    if (depth < 2000) {
      label_148: {
        /* #key=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_75));
        sink.start(_M_MayGroupRule1);
        sink.start(_M__s);sink.properties(safeRef(props_75));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_18.ref());
        sink.end(); sink.copy(term_18.ref());
        Variable var_47 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_47});
        VariableUse use_72 = sink.context().makeVariableUse(var_47);
        sink.substitute(term_42.ref(), new Variable[] { var_73 }, new Term[] {use_72});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_MayGroupRule, props_75, term_18, var_73, term_42);
  }   final public static boolean _M_N2Rule(Sink sink, int shared, int depth, Properties props_13, Term term_189, Term term_58) {
    if (depth < 2000) {
      label_71: {
        /* #ruleKey=term */
        if (term_58.descriptor() != _M_CONTINUATION)
        {   break label_71;
        }Term sub_159 = term_58.sub(0).ref();
        Variable binder = term_58.binders(0)[0];
        /* #=sub *//*Contract*/sink.properties(safeRef(props_13));
        sink.start(_M_MayGroupRule); sink.copy(term_189.ref());
        Variable var_96 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_96});
        sink.start(_M_NormalizeRuleKey); sink.use(var_96); sink.copy(term_189.ref());
        Variable var_49 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_49});
        VariableUse use_49 = sink.context().makeVariableUse(var_49);
        sink.substitute(sub_159.ref(), new Variable[] { binder }, new Term[] {use_49});
        sink.end();
        sink.end(); return true; 
      }
    }
    return thunk(sink, _M_N2Rule, props_13, term_189, term_58);
  }  final public static boolean _M_N2Rules(Sink sink, int shared, int depth, Properties props_3, Term term_109, Variable var_44, Term term_84) {
    if (depth < 2000) {
      label_114: {
        /* #keys=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_3));
        sink.start(_M_SeqMap);
        Variable var_69 = sink.context().makeVariable("x");
        Variable var_65 = sink.context().makeVariable("c");
        sink.binds(new Variable[] {var_69,var_65});
        sink.start(_M_N2Rule); sink.use(var_69); sink.use(var_65);
        sink.end(); sink.copy(term_109.ref());
        Variable var_90 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_90});
        VariableUse use_26 = sink.context().makeVariableUse(var_90);
        sink.substitute(term_84.ref(), new Variable[] { var_44 }, new Term[] {use_26});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N2Rules, props_3, term_109, var_44, term_84);
  }   final public static boolean _M_N2(Sink sink, int shared, int depth, Properties props_29, Term term_46, Variable var_16, Term term_29) {
    if (depth < 2000) {
      label_79: {
        Term value = props_29 == null ? null : props_29.lookup("$rulekeys");
        if (value == null) 
        {   break label_79;
        }
        if (value.descriptor() != _M_KEYS)
        {   break label_79;
        }Term sub_455 = value.sub(0).ref();
        /* #keys=sub */
        if (term_46.descriptor() != _M_OK)
        {   break label_79;
        }
        /* #=term *//*Contract*/sink.properties(safeRef(props_29));
        sink.start(_M_N2Rules); sink.copy(sub_455.ref());
        Variable var_58 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_58});
        VariableUse use_43 = sink.context().makeVariableUse(var_58);
        sink.substitute(term_29.ref(), new Variable[] { var_16 }, new Term[] {use_43});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N2, props_29, term_46, var_16, term_29);
  }   final public static boolean _M_N1ImportDirective(Sink sink, int shared, int depth, Properties props_87, Term term_152, Term term_89, Variable var_0, Term term_52) {
    if (depth < 2000) {
      label_73: {
        Term value_77 = props_87 == null ? null : props_87.lookup("$imported");
        if (value_77 == null) 
        {   break label_73;
        }
        if (value_77.descriptor() != _M_IMPORTS)
        {   break label_73;
        }Term sub_249 = value_77.sub(0).ref();
        /* #imported=sub */
        if (term_152.descriptor() != _M_Crsx_xdirective_xA3)
        {   break label_73;
        }Term sub_272 = term_152.sub(0).ref();
        if (sub_272.descriptor() != _M_Crsx_xliteral_xA1)
        {   break label_73;
        }Term sub_166 = sub_272.sub(0).ref();
        /* #STRING=sub */
        if (term_89.descriptor() != _M_TRUE)
        {   break label_73;
        }
        /* #=term *//*Contract*/sink.properties(safeRef(props_87));Term term_148;
        {
          BufferSink buf_13 = sink.context().makeBuffer();
          buf_13.start(_M_IMPORTS);
          buf_13.start(_M_Concat); buf_13.copy(sub_249.ref());
          buf_13.start(_M__sCons);
          buf_13.start(_M_UnString); buf_13.copy(sub_166.ref());
          buf_13.end(); buf_13.start(_M__sNil); buf_13.end();
          buf_13.end();
          buf_13.end();
          buf_13.end();
          term_148 = buf_13.term();
        } sink.propertyNamed("$imported", term_148);Term term_67;
        {
          BufferSink buf_81 = sink.context().makeBuffer(); buf_81.start(_M_OK); buf_81.end();
          term_67 = buf_81.term();
        }
        sink.substitute(term_52.ref(), new Variable[] { var_0 }, new Term[] {term_67}); return true;
      }
      label_69: {
        Term value_97 = props_87 == null ? null : props_87.lookup("$grammars");
        if (value_97 == null) 
        {   break label_69;
        }
        if (value_97.descriptor() != _M_IMPORTS)
        {   break label_69;
        }Term sub_150 = value_97.sub(0).ref();
        /* #imported=sub */
        if (term_152.descriptor() != _M_Crsx_xdirective_xA3)
        {   break label_69;
        }Term sub_113 = term_152.sub(0).ref();
        if (sub_113.descriptor() != _M_Crsx_xliteral_xA1)
        {   break label_69;
        }Term sub_270 = sub_113.sub(0).ref();
        /* #STRING=sub */
        if (term_89.descriptor() != _M_FALSE)
        {   break label_69;
        }
        /* #=term *//*Contract*/sink.properties(safeRef(props_87));Term term_71;
        {
          BufferSink buf_187 = sink.context().makeBuffer();
          buf_187.start(_M_IMPORTS);
          buf_187.start(_M_Concat); buf_187.copy(sub_150.ref());
          buf_187.start(_M__sCons);
          buf_187.start(_M_Replace);
          buf_187.start(_M_UnString); buf_187.copy(sub_270.ref());
          buf_187.end(); buf_187.literal("."); buf_187.literal("/");
          buf_187.end(); buf_187.start(_M__sNil); buf_187.end();
          buf_187.end();
          buf_187.end();
          buf_187.end();
          term_71 = buf_187.term();
        } sink.propertyNamed("$grammars", term_71);Term term_267;
        {
          BufferSink buf_72 = sink.context().makeBuffer(); buf_72.start(_M_OK); buf_72.end();
          term_267 = buf_72.term();
        }
        sink.substitute(term_52.ref(), new Variable[] { var_0 }, new Term[] {term_267}); return true;
      }
      label_34: {
        /* #directive=term */
        /* #kind=term */
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end(); sink.literal("Error: invalid argument in import directive.");
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1ImportDirective, props_87, term_152, term_89, var_0, term_52);
  }    final public static boolean _M_N1ImportDirectives(Sink sink, int shared, int depth, Properties props_33, Term term_112, Term term_95, Variable var_186, Term term_8) {
    if (depth < 2000) {
      label_43: {
        if (term_112.descriptor() != _M__sNil)
        {   break label_43;
        }
        /* #kind=term */
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Error: missing filename argument in import directive.");
        sink.end(); return true;
      }
      label_292: {
        if (term_112.descriptor() != _M__sCons)
        {   break label_292;
        }Term sub_101 = term_112.sub(0).ref();
        if (sub_101.descriptor() != _M_Crsx_xdirectives)
        {   break label_292;
        }Term sub_108 = sub_101.sub(0).ref();
        /* #directive1=sub */Term sub_170 = sub_101.sub(1).ref();
        if (sub_170.descriptor() != _M__sCons)
        {   break label_292;
        }Term sub_283 = sub_170.sub(0).ref();
        if (sub_283.descriptor() != _M_Crsx_xdirectives_xS1)
        {   break label_292;
        }Term sub_158 = sub_283.sub(0).ref();Term sub_405 = sub_283.sub(1).ref();
        /* #directive2=sub */Term sub_246 = sub_170.sub(1).ref();
        /* #directives_S1*=sub */Term sub_281 = term_112.sub(1).ref();
        if (sub_281.descriptor() != _M__sNil)
        {   break label_292;
        }
        /* #kind=term */
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Error: extraneous argument in import directive.");
        sink.end(); return true;
      }
      label_85: {
        if (term_112.descriptor() != _M__sCons)
        {   break label_85;
        }Term sub_169 = term_112.sub(0).ref();
        if (sub_169.descriptor() != _M_Crsx_xdirectives)
        {   break label_85;
        }Term sub_383 = sub_169.sub(0).ref();
        /* #directive=sub */Term sub_224 = sub_169.sub(1).ref();
        if (sub_224.descriptor() != _M__sNil)
        {   break label_85;
        }Term sub_184 = term_112.sub(1).ref();
        if (sub_184.descriptor() != _M__sNil)
        {   break label_85;
        }
        /* #kind=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_33));
        sink.start(_M_N1ImportDirective); sink.copy(sub_383.ref()); sink.copy(term_95.ref());
        Variable var_41 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_41});
        VariableUse use_83 = sink.context().makeVariableUse(var_41);
        sink.substitute(term_8.ref(), new Variable[] { var_186 }, new Term[] {use_83});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1ImportDirectives, props_33, term_112, term_95, var_186, term_8);
  }    final public static boolean _M_N1Import(Sink sink, int shared, int depth, Properties props_18, Term term_66, Term term_2, Variable var_13, Term term_59) {
    if (depth < 2000) {
      label_89: {
        if (term_66.descriptor() != _M__sNil)
        {   break label_89;
        }
        /* #kind=term */
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Error: missing filename argument in import directive.");
        sink.end(); return true;
      }
      label_175: {
        if (term_66.descriptor() != _M__sCons)
        {   break label_175;
        }Term sub_136 = term_66.sub(0).ref();
        if (sub_136.descriptor() != _M_Crsx_xdirectiveArguments)
        {   break label_175;
        }Term sub_217 = sub_136.sub(0).ref();Term sub_268 = sub_136.sub(1).ref();
        /* #directives?=sub */Term sub_376 = sub_136.sub(2).ref();Term sub_61 = term_66.sub(1).ref();
        if (sub_61.descriptor() != _M__sNil)
        {   break label_175;
        }
        /* #kind=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_18));
        sink.start(_M_N1ImportDirectives); sink.copy(sub_268.ref()); sink.copy(term_2.ref());
        Variable var_82 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_82});
        VariableUse use_22 = sink.context().makeVariableUse(var_82);
        sink.substitute(term_59.ref(), new Variable[] { var_13 }, new Term[] {use_22});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1Import, props_18, term_66, term_2, var_13, term_59);
  }    final public static boolean _M_N1DirectiveConstructor(Sink sink, int shared, int depth, Properties props_19, Term term_85, Variable var_85, Term term_130) {
    if (depth < 2000) {
      label_22: {
        /* #constructor=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_19));Term term_50;
        {
          BufferSink buf_90 = sink.context().makeBuffer(); buf_90.start(_M_OK); buf_90.end();
          term_50 = buf_90.term();
        }
        sink.substitute(term_130.ref(), new Variable[] { var_85 }, new Term[] {term_50}); return true;
      }
    }
    return thunk(sink, _M_N1DirectiveConstructor, props_19, term_85, var_85, term_130);
  }   final public static boolean _M_N1Directive(Sink sink, int shared, int depth, Properties props_44, Term term_187, Variable var_72, Term term_157) {
    if (depth < 2000) {
      label_11: {
        if (term_187.descriptor() != _M_Crsx_xdirective_xA1)
        {   break label_11;
        }Term sub_211 = term_187.sub(0).ref();
        if (sub_211.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_11;
        }Term sub_277 = sub_211.sub(0).ref();
        if (sub_277.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_11;
        }Term sub_269 = sub_211.sub(1).ref();
        /* #CONSTRUCTOR=sub */Term sub_302 = term_187.sub(1).ref();
        /* #directiveArguments?=sub */
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sStringEqual); sink.end(); sink.copy(sub_269.ref()); sink.literal("$Use");
        sink.end();sink.properties(safeRef(props_44));
        sink.start(_M_N1Import); sink.copy(sub_302.ref()); sink.start(_M_TRUE); sink.end();
        Variable var_84 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_84});
        VariableUse use_57 = sink.context().makeVariableUse(var_84);
        sink.substitute(term_157.ref(), new Variable[] { var_72 }, new Term[] {use_57});
        sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sStringEqual); sink.end(); sink.copy(sub_269.ref()); sink.literal("$AddGrammar");
        sink.end();sink.properties(safeRef(props_44));
        sink.start(_M_N1Import); sink.copy(sub_302.ref()); sink.start(_M_FALSE); sink.end();
        Variable var_66 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_66});
        VariableUse use_58 = sink.context().makeVariableUse(var_66);
        sink.substitute(term_157.ref(), new Variable[] { var_72 }, new Term[] {use_58});
        sink.end();sink.properties(safeRef(props_44));Term term_225;
        {
          BufferSink buf_50 = sink.context().makeBuffer(); buf_50.start(_M_OK); buf_50.end();
          term_225 = buf_50.term();
        }
        sink.substitute(term_157.ref(), new Variable[] { var_72 }, new Term[] {term_225});
        sink.end();
        sink.end(); return true;
      }
      label_108: {
        /* #directive=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_44));Term term_65;
        {
          BufferSink buf_41 = sink.context().makeBuffer(); buf_41.start(_M_OK); buf_41.end();
          term_65 = buf_41.term();
        }
        sink.substitute(term_157.ref(), new Variable[] { var_72 }, new Term[] {term_65}); return true;
      }
    }
    return thunk(sink, _M_N1Directive, props_44, term_187, var_72, term_157);
  }   final public static boolean _M_N1Declaration(Sink sink, int shared, int depth, Properties props_47, Term term_56, Variable var_93, Term term_229) {
    if (depth < 2000) {
      label_83: {
        if (term_56.descriptor() != _M_Crsx_xdeclaration_xA5)
        {   break label_83;
        }Term sub_123 = term_56.sub(0).ref();
        if (sub_123.descriptor() != _M_Crsx_xdirective_xA1)
        {   break label_83;
        }Term sub_381 = sub_123.sub(0).ref();
        /* #constructor=sub */Term sub_110 = sub_123.sub(1).ref();
        if (sub_110.descriptor() != _M__sCons)
        {   break label_83;
        }Term sub_131 = sub_110.sub(0).ref();
        if (sub_131.descriptor() != _M_Crsx_xdirectiveArguments)
        {   break label_83;
        }Term sub_141 = sub_131.sub(0).ref();Term sub_115 = sub_131.sub(1).ref();
        if (sub_115.descriptor() != _M__sCons)
        {   break label_83;
        }Term sub_152 = sub_115.sub(0).ref();
        if (sub_152.descriptor() != _M_Crsx_xdirectives)
        {   break label_83;
        }Term sub_464 = sub_152.sub(0).ref();
        if (sub_464.descriptor() != _M_Crsx_xdirective_xA2)
        {   break label_83;
        }Term sub_541 = sub_464.sub(0).ref();
        if (sub_541.descriptor() != _M_Crsx_xdirectiveList)
        {   break label_83;
        }Term sub_297 = sub_541.sub(0).ref();Term sub_221 = sub_541.sub(1).ref();
        if (sub_221.descriptor() != _M__sNil)
        {   break label_83;
        }Term sub_163 = sub_541.sub(2).ref();Term sub_219 = sub_152.sub(1).ref();
        if (sub_219.descriptor() != _M__sNil)
        {   break label_83;
        }Term sub_187 = sub_115.sub(1).ref();
        if (sub_187.descriptor() != _M__sNil)
        {   break label_83;
        }Term sub_202 = sub_131.sub(2).ref();Term sub_16 = sub_110.sub(1).ref();
        if (sub_16.descriptor() != _M__sNil)
        {   break label_83;
        }
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M_IsDirectiveUnwrap); sink.copy(sub_381.ref());
        sink.end();sink.properties(safeRef(props_47));
        sink.start(_M_N1DirectiveConstructor); sink.copy(sub_381.ref());
        Variable var_26 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_26});
        VariableUse use_12 = sink.context().makeVariableUse(var_26);
        sink.substitute(term_229.ref(), new Variable[] { var_93 }, new Term[] {use_12});
        sink.end();sink.properties(safeRef(props_47));Term term_321;
        {
          BufferSink buf_85 = sink.context().makeBuffer(); buf_85.start(_M_OK); buf_85.end();
          term_321 = buf_85.term();
        }
        sink.substitute(term_229.ref(), new Variable[] { var_93 }, new Term[] {term_321});
        sink.end(); return true;
      }
      label_84: {
        if (term_56.descriptor() != _M_Crsx_xdeclaration_xA5)
        {   break label_84;
        }Term sub_258 = term_56.sub(0).ref();
        if (sub_258.descriptor() != _M_Crsx_xdirective_xA1)
        {   break label_84;
        }Term sub_210 = sub_258.sub(0).ref();
        /* #constructor=sub */Term sub_347 = sub_258.sub(1).ref();
        if (sub_347.descriptor() != _M__sCons)
        {   break label_84;
        }Term sub_337 = sub_347.sub(0).ref();
        if (sub_337.descriptor() != _M_Crsx_xdirectiveArguments)
        {   break label_84;
        }Term sub_109 = sub_337.sub(0).ref();Term sub_301 = sub_337.sub(1).ref();
        if (sub_301.descriptor() != _M__sCons)
        {   break label_84;
        }Term sub_398 = sub_301.sub(0).ref();
        if (sub_398.descriptor() != _M_Crsx_xdirectives)
        {   break label_84;
        }Term sub_387 = sub_398.sub(0).ref();
        if (sub_387.descriptor() != _M_Crsx_xdirective_xA2)
        {   break label_84;
        }Term sub_84 = sub_387.sub(0).ref();
        if (sub_84.descriptor() != _M_Crsx_xdirectiveList)
        {   break label_84;
        }Term sub_457 = sub_84.sub(0).ref();Term sub_239 = sub_84.sub(1).ref();
        if (sub_239.descriptor() != _M__sCons)
        {   break label_84;
        }Term sub_304 = sub_239.sub(0).ref();
        /* #declarations=sub */Term sub_273 = sub_239.sub(1).ref();
        if (sub_273.descriptor() != _M__sNil)
        {   break label_84;
        }Term sub_427 = sub_84.sub(2).ref();Term sub_146 = sub_398.sub(1).ref();
        if (sub_146.descriptor() != _M__sNil)
        {   break label_84;
        }Term sub_298 = sub_301.sub(1).ref();
        if (sub_298.descriptor() != _M__sNil)
        {   break label_84;
        }Term sub_454 = sub_337.sub(2).ref();Term sub_348 = sub_347.sub(1).ref();
        if (sub_348.descriptor() != _M__sNil)
        {   break label_84;
        }
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M_IsDirectiveUnwrap); sink.copy(sub_210.ref());
        sink.end();sink.properties(safeRef(props_47));
        sink.start(_M_N1DirectiveConstructor); sink.copy(sub_210.ref());
        Variable var_79 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_79});
        VariableUse use_16 = sink.context().makeVariableUse(var_79);
        sink.substitute(term_229.ref(), new Variable[] { var_93 }, new Term[] {use_16});
        sink.end();sink.properties(safeRef(props_47));
        sink.start(_M_N1Declarations1); sink.start(_M_OK); sink.end();
        sink.start(_M_DesugarDeclarations); sink.copy(sub_304.ref());
        sink.end();
        Variable var_18 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_18});
        VariableUse use_99 = sink.context().makeVariableUse(var_18);
        sink.substitute(term_229.ref(), new Variable[] { var_93 }, new Term[] {use_99});
        sink.end();
        sink.end(); return true;
      }
      label_47: {
        if (term_56.descriptor() != _M_Crsx_xdeclaration_xA5)
        {   break label_47;
        }Term sub_391 = term_56.sub(0).ref();
        /* #directive=sub */
        /* #=term *//*Contract*/sink.properties(safeRef(props_47));
        sink.start(_M_N1Directive); sink.copy(sub_391.ref());
        Variable var_146 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_146});
        VariableUse use_52 = sink.context().makeVariableUse(var_146);
        sink.substitute(term_229.ref(), new Variable[] { var_93 }, new Term[] {use_52});
        sink.end(); return true;
      }
      label_316: {
        if (term_56.descriptor() != _M_Crsx_xdeclaration_xA1)
        {   break label_316;
        }Term sub_250 = term_56.sub(0).ref();
        if (sub_250.descriptor() != _M_Crsx_xmoduleDeclaration)
        {   break label_316;
        }Term sub_320 = sub_250.sub(0).ref();Term sub_256 = sub_250.sub(1).ref();
        /* #CONSTRUCTOR=sub */Term sub_288 = sub_250.sub(2).ref();Term sub_6 = sub_250.sub(3).ref();
        /* #declarations=sub */Term sub_461 = sub_250.sub(4).ref();
        /* #=term *//*Contract*/sink.properties(safeRef(props_47));
        sink.start(_M_N1Declarations);
        sink.start(_M_DesugarDeclarations); sink.copy(sub_6.ref());
        sink.end();
        Variable var_31 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_31});
        VariableUse use_2 = sink.context().makeVariableUse(var_31);
        sink.substitute(term_229.ref(), new Variable[] { var_93 }, new Term[] {use_2});
        sink.end(); return true;
      }
      label_188: {
        if (term_56.descriptor() != _M_Crsx_xdeclaration_xA3)
        {   break label_188;
        }Term sub_310 = term_56.sub(0).ref();
        if (sub_310.descriptor() != _M_Crsx_xruleDeclaration)
        {   break label_188;
        }Term sub_497 = sub_310.sub(0).ref();
        /* #option?=sub */Term sub_216 = sub_310.sub(1).ref();
        if (sub_216.descriptor() != _M_Crsx_xpattern)
        {   break label_188;
        }Term sub_414 = sub_216.sub(0).ref();
        /* #properties?=sub */Term sub_340 = sub_216.sub(1).ref();
        /* #constructor=sub */Term sub_378 = sub_216.sub(2).ref();
        /* #arguments?=sub */Term sub_167 = sub_310.sub(2).ref();Term sub_197 = sub_310.sub(3).ref();
        /* #contractum=sub */
        /* #=term *//*Contract*/sink.properties(safeRef(props_47));
        sink.start(_M_AddRule); sink.start(_M_RulesKey); sink.copy(sub_340.ref()); sink.end();
        sink.start(_M_Crsx_xruleDeclaration); sink.copy(sub_497.ref());
        sink.start(_M_Crsx_xpattern); sink.copy(sub_414.ref()); sink.copy(sub_340.ref()); sink.copy(sub_378.ref());
        sink.end(); sink.literal("\u2192"); sink.copy(sub_197.ref());
        sink.end();
        Variable var_161 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_161});
        VariableUse use_87 = sink.context().makeVariableUse(var_161);
        sink.substitute(term_229.ref(), new Variable[] { var_93 }, new Term[] {use_87});
        sink.end(); return true;
      }
      label_182: {
        if (term_56.descriptor() != _M_Crsx_xdeclaration_xA4)
        {   break label_182;
        }Term sub_351 = term_56.sub(0).ref();
        if (sub_351.descriptor() != _M_Crsx_xsortDeclaration_xA1)
        {   break label_182;
        }Term sub_223 = sub_351.sub(0).ref();
        /* #sortparams?=sub */Term sub_193 = sub_351.sub(1).ref();
        /* #sortset=sub */Term sub_286 = sub_351.sub(2).ref();
        /* #sortname=sub */Term sub_500 = sub_351.sub(3).ref();Term sub_309 = sub_351.sub(4).ref();Term sub_104 = sub_351.sub(5).ref();
        /* #forms=sub */Term sub_114 = sub_351.sub(6).ref();
        /* #=term *//*Contract*/sink.properties(safeRef(props_47));
        sink.start(_M_AddDataSort);
        sink.start(_M_Crsx_xsortDeclaration_xA1); sink.copy(sub_223.ref()); sink.copy(sub_193.ref()); sink.copy(sub_286.ref()); sink.literal("::="); sink.literal("("); sink.copy(sub_104.ref()); sink.literal(")");
        sink.end();
        Variable var_80 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_80});
        VariableUse use_39 = sink.context().makeVariableUse(var_80);
        sink.substitute(term_229.ref(), new Variable[] { var_93 }, new Term[] {use_39});
        sink.end(); return true;
      }
      label_124: {
        if (term_56.descriptor() != _M_Crsx_xdeclaration_xA4)
        {   break label_124;
        }Term sub_315 = term_56.sub(0).ref();
        if (sub_315.descriptor() != _M_Crsx_xsortDeclaration_xA2)
        {   break label_124;
        }Term sub_513 = sub_315.sub(0).ref();
        /* #sortparams?=sub */Term sub_207 = sub_315.sub(1).ref();
        /* #sortset=sub */Term sub_103 = sub_315.sub(2).ref();
        if (sub_103.descriptor() != _M_Crsx_xform_xA1)
        {   break label_124;
        }Term sub_225 = sub_103.sub(0).ref();
        /* #constructor=sub */Term sub_220 = sub_103.sub(1).ref();
        /* #arguments?=sub */Term sub_128 = sub_315.sub(3).ref();Term sub_293 = sub_315.sub(4).ref();
        /* #sortname=sub */
        /* #=term *//*Contract*/sink.properties(safeRef(props_47));
        sink.start(_M_AddFuncSort);
        sink.start(_M_Crsx_xsortDeclaration_xA2); sink.copy(sub_513.ref()); sink.copy(sub_207.ref());
        sink.start(_M_Crsx_xform_xA1); sink.copy(sub_225.ref()); sink.copy(sub_220.ref());
        sink.end(); sink.literal("::"); sink.copy(sub_293.ref());
        sink.end();
        Variable var_53 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_53});
        VariableUse use_13 = sink.context().makeVariableUse(var_53);
        sink.substitute(term_229.ref(), new Variable[] { var_93 }, new Term[] {use_13});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1Declaration, props_47, term_56, var_93, term_229);
  }   final public static boolean _M_N1Declarations1(Sink sink, int shared, int depth, Properties props_174, Term term_164, Term term_260, Variable var_143, Term term_120) {
    if (depth < 2000) {
      label_132: {
        if (term_164.descriptor() != _M_OK)
        {   break label_132;
        }
        if (term_260.descriptor() != _M__sNil)
        {   break label_132;
        }
        /* #=term *//*Contract*/sink.properties(safeRef(props_174));Term term_33;
        {
          BufferSink buf_80 = sink.context().makeBuffer(); buf_80.start(_M_OK); buf_80.end();
          term_33 = buf_80.term();
        }
        sink.substitute(term_120.ref(), new Variable[] { var_143 }, new Term[] {term_33}); return true;
      }
      label_276: {
        if (term_164.descriptor() != _M_OK)
        {   break label_276;
        }
        if (term_260.descriptor() != _M__sCons)
        {   break label_276;
        }Term sub_368 = term_260.sub(0).ref();
        if (sub_368.descriptor() != _M_Crsx_xdeclarations_xS1)
        {   break label_276;
        }Term sub_327 = sub_368.sub(0).ref();Term sub_204 = sub_368.sub(1).ref();
        if (sub_204.descriptor() != _M__sNil)
        {   break label_276;
        }Term sub_292 = term_260.sub(1).ref();
        if (sub_292.descriptor() != _M__sNil)
        {   break label_276;
        }
        /* #=term *//*Contract*/sink.properties(safeRef(props_174));Term term_163;
        {
          BufferSink buf_45 = sink.context().makeBuffer(); buf_45.start(_M_OK); buf_45.end();
          term_163 = buf_45.term();
        }
        sink.substitute(term_120.ref(), new Variable[] { var_143 }, new Term[] {term_163}); return true;
      }
      label_59: {
        if (term_164.descriptor() != _M_OK)
        {   break label_59;
        }
        if (term_260.descriptor() != _M__sCons)
        {   break label_59;
        }Term sub_498 = term_260.sub(0).ref();
        if (sub_498.descriptor() != _M_Crsx_xdeclarations_xS1)
        {   break label_59;
        }Term sub_380 = sub_498.sub(0).ref();Term sub_332 = sub_498.sub(1).ref();
        if (sub_332.descriptor() != _M__sCons)
        {   break label_59;
        }Term sub_524 = sub_332.sub(0).ref();
        /* #declaration=sub */Term sub_530 = sub_332.sub(1).ref();
        if (sub_530.descriptor() != _M__sNil)
        {   break label_59;
        }Term sub_486 = term_260.sub(1).ref();
        /* #declarations_S1*=sub */
        /* #=term *//*Contract*/sink.properties(safeRef(props_174));
        sink.start(_M_N1Declaration); sink.copy(sub_524.ref());
        Variable var_24 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_24});
        sink.start(_M_N1Declarations1); sink.use(var_24); sink.copy(sub_486.ref());
        Variable var_60 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_60});
        VariableUse use_44 = sink.context().makeVariableUse(var_60);
        sink.substitute(term_120.ref(), new Variable[] { var_143 }, new Term[] {use_44});
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1Declarations1, props_174, term_164, term_260, var_143, term_120);
  }    final public static boolean _M_N1Declarations(Sink sink, int shared, int depth, Properties props_54, Term term_197, Variable var_45, Term term_113) {
    if (depth < 2000) {
      label_226: {
        /* #declarations=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_54));
        sink.start(_M_N1Declarations1); sink.start(_M_OK); sink.end(); sink.copy(term_197.ref());
        Variable var_1 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_1});
        VariableUse use_41 = sink.context().makeVariableUse(var_1);
        sink.substitute(term_113.ref(), new Variable[] { var_45 }, new Term[] {use_41});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1Declarations, props_54, term_197, var_45, term_113);
  }   final public static boolean _M_N1DeclarationsInit(Sink sink, int shared, int depth, Term term_13, Term term_41, Variable var_293, Term term_372) {
    if (depth < 2000) {
      label_308: {
        /* #qualifier=term */
        /* #declarations=term */
        /* #=term *//*Contract*/Term term_223;
        {
          BufferSink buf_26 = sink.context().makeBuffer();
          buf_26.start(_M_STR); buf_26.copy(term_13.ref());
          buf_26.end();
          term_223 = buf_26.term();
        } sink.propertyNamed("$qualifier", term_223);Term term_40;
        {
          BufferSink buf_54 = sink.context().makeBuffer();
          buf_54.start(_M_KEYS); buf_54.start(_M__sNil); buf_54.end();
          buf_54.end();
          term_40 = buf_54.term();
        } sink.propertyNamed("$rulekeys", term_40);Term term_12;
        {
          BufferSink buf_70 = sink.context().makeBuffer();
          buf_70.start(_M_KEYS); buf_70.start(_M__sNil); buf_70.end();
          buf_70.end();
          term_12 = buf_70.term();
        } sink.propertyNamed("$datakeys", term_12);Term term_38;
        {
          BufferSink buf_1 = sink.context().makeBuffer();
          buf_1.start(_M_KEYS); buf_1.start(_M__sNil); buf_1.end();
          buf_1.end();
          term_38 = buf_1.term();
        } sink.propertyNamed("$funckeys", term_38);Term term_16;
        {
          BufferSink buf_77 = sink.context().makeBuffer();
          buf_77.start(_M_IMPORTS); buf_77.start(_M__sNil); buf_77.end();
          buf_77.end();
          term_16 = buf_77.term();
        } sink.propertyNamed("$imported", term_16);Term term_160;
        {
          BufferSink buf_34 = sink.context().makeBuffer();
          buf_34.start(_M_IMPORTS); buf_34.start(_M__sNil); buf_34.end();
          buf_34.end();
          term_160 = buf_34.term();
        } sink.propertyNamed("$grammars", term_160);
        sink.start(_M_N1Declarations); sink.copy(term_41.ref());
        Variable var_88 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_88});
        VariableUse use_85 = sink.context().makeVariableUse(var_88);
        sink.substitute(term_372.ref(), new Variable[] { var_293 }, new Term[] {use_85});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1DeclarationsInit, term_13, term_41, var_293, term_372);
  }    final public static boolean _M_NormalizeToState(Sink sink, int shared, int depth, Term term_277, Term term_134) {
    if (depth < 2000) {
      label_257: {
        /* #filename=term */
        if (term_134.descriptor() != _M_Crsx_xcrsx)
        {   break label_257;
        }Term sub_393 = term_134.sub(0).ref();
        /* #declarations=sub *//*Contract*/
        sink.start(_M_N1DeclarationsInit);
        sink.start(_M_BaseName); sink.copy(term_277.ref());
        sink.end();
        sink.start(_M_DesugarDeclarations); sink.copy(sub_393.ref());
        sink.end();
        Variable var_15 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_15});
        sink.start(_M_N2); sink.use(var_15);
        Variable var_153 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_153}); sink.start(_M_LOADED); sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeToState, term_277, term_134);
  }  final public static boolean _M_NormalizeToCrsx(Sink sink, int shared, int depth, Term term_142, Term term_68) {
    if (depth < 2000) {
      label_127: {
        /* #filename=term */
        if (term_68.descriptor() != _M_Crsx_xcrsx)
        {   break label_127;
        }Term sub_118 = term_68.sub(0).ref();
        /* #declarations=sub *//*Contract*/
        sink.start(_M_N1DeclarationsInit);
        sink.start(_M_BaseName); sink.copy(term_142.ref());
        sink.end();
        sink.start(_M_DesugarDeclarations); sink.copy(sub_118.ref());
        sink.end();
        Variable var_29 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_29});
        sink.start(_M_N2); sink.use(var_29);
        Variable var_184 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_184}); sink.start(_M_OutputCrsx); sink.use(var_184); sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeToCrsx, term_142, term_68);
  }  
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.parser.Crsx.init(context); org.crsx.compiler.State.init(context); org.crsx.compiler.Crsxutils.init(context); org.crsx.compiler.std.Core.init(context); org.crsx.compiler.std.String.init(context); org.crsx.compiler.std.List.init(context); org.crsx.compiler.std.Num.init(context); org.crsx.compiler.std.Path.init(context); context.register(_M_NormalizeDispatchCases); context.register(_M_NormalizeDispatch); context.register(_M_NormalizeConcrete); context.register(_M_NormalizeFreeTerms); context.register(_M_NormalizeFreeArgumentsOpt); context.register(_M_MakeBuiltin); context.register(_M_NormalizeConstructor); context.register(_M_NormalizeFreeTerm); context.register(_M_NormalizeNextBinder); context.register(_M_NormalizeTerm); context.register(_M_NormalizeTerms); context.register(_M_NormalizeArgumentsOpt); context.register(_M_NormalizeProperties); context.register(_M_NormalizePropertiesOpt); context.register(_M_NormalizeRule); context.register(_M_NormalizeRules); context.register(_M_NormalizeRuleKey1); context.register(_M_NormalizeRuleKey); context.register(_M_DispatchCases); context.register(_M_DispatchMetaArgsOpt); context.register(_M_DispatchPatternNextBinder); context.register(_M_DispatchPatternBinder); context.register(_M_DispatchPatternFreeTerm); context.register(_M_DispatchPatternTerm); context.register(_M_DispatchPatternArgs); context.register(_M_DispatchProperties); context.register(_M_Dispatch); context.register(_M_GroupRule); context.register(_M_MayGroupRule2); context.register(_M_MayGroupRule1); context.register(_M_MayGroupRule); context.register(_M_N2Rule); context.register(_M_N2Rules); context.register(_M_N2); context.register(_M_N1ImportDirective); context.register(_M_N1ImportDirectives); context.register(_M_N1Import); context.register(_M_N1DirectiveConstructor); context.register(_M_N1Directive); context.register(_M_N1Declaration); context.register(_M_N1Declarations1); context.register(_M_N1Declarations); context.register(_M_N1DeclarationsInit); context.register(_M_NormalizeToState); context.register(_M_NormalizeToCrsx);
      initialized = true;
    }
  }

/* END MODULE « "/Users/villardl/Projects/crsx/crsx4/src/normalizer.crs.java" » */
}