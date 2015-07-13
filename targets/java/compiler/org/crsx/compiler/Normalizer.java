/* START MODULE /Users/villardl/Projects/crsx/crsx4/src/normalizer.crs.java */
/** Generated File */package org.crsx.compiler;
import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;
import static org.crsx.runtime.Normalizer.force;
import static org.crsx.runtime.Normalizer.forceSub;
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
        term = force(sink.context(), term);
        if (term.descriptor() != _M__sNil)
        {   break label;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_6: {
        term = force(sink.context(), term);
        if (term.descriptor() != _M__sCons)
        {   break label_6;
        }Term sub = forceSub(sink.context(), term, 0).ref();
        sub = force(sink.context(), sub);
        if (sub.descriptor() != _M_Crsx_xdispatchCases_xS1)
        {   break label_6;
        }Term sub_28 = forceSub(sink.context(), sub, 0).ref();Term sub_48 = forceSub(sink.context(), sub, 1).ref();
        sub_48 = force(sink.context(), sub_48);
        if (sub_48.descriptor() != _M_Crsx_xdispatchCase)
        {   break label_6;
        }Term sub_50 = forceSub(sink.context(), sub_48, 0).ref();
        /* #ruleDeclaration=sub */Term sub_38 = forceSub(sink.context(), term, 1).ref();
        /* #dispatchCases_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdispatchCases_xS1); sink.literal(";");
        sink.start(_M_Crsx_xdispatchCase);sink.properties(safeRef(props));
        sink.start(_M_NormalizeRule); sink.copy(sub_50.ref());
        sink.end();
        sink.end();
        sink.end();sink.properties(safeRef(props));
        sink.start(_M_NormalizeDispatchCases); sink.copy(sub_38.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeDispatchCases, props, term);
  } final public static boolean _M_NormalizeDispatch(Sink sink, int shared, int depth, Properties props_22, Term term_4) {
    if (depth < 2000) {
      label_24: {
        term_4 = force(sink.context(), term_4);
        if (term_4.descriptor() != _M_Crsx_xdispatch)
        {   break label_24;
        }Term sub_44 = forceSub(sink.context(), term_4, 0).ref();Term sub_36 = forceSub(sink.context(), term_4, 1).ref();
        sub_36 = force(sink.context(), sub_36);
        if (sub_36.descriptor() != _M_Crsx_xdispatchTerm)
        {   break label_24;
        }Term sub_3 = forceSub(sink.context(), sub_36, 0).ref();
        /* #freeTerm=sub */Term sub_21 = forceSub(sink.context(), term_4, 2).ref();
        /* #dispatchCases=sub */Term sub_39 = forceSub(sink.context(), term_4, 3).ref();
        /* #delayCase?=sub *//*Contract*/
        sink.start(_M_Crsx_xdispatch); sink.literal("dispatch");
        sink.start(_M_Crsx_xdispatchTerm);sink.properties(safeRef(props_22));
        sink.start(_M_NormalizeFreeTerm); sink.copy(sub_3.ref());
        sink.end();
        sink.end();
        sink.start(_M_SugarDispatchCases);sink.properties(safeRef(props_22));
        sink.start(_M_NormalizeDispatchCases);
        sink.start(_M_DesugarDispatchCases); sink.copy(sub_21.ref());
        sink.end();
        sink.end();
        sink.end(); sink.copy(sub_39.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeDispatch, props_22, term_4);
  } final public static boolean _M_NormalizeConcrete(Sink sink, int shared, int depth, Properties props_76, Term term_53) {
    if (depth < 2000) {
      label_7: {
        term_53 = force(sink.context(), term_53);
        if (term_53.descriptor() != _M_Crsx_xconcrete_xA1)
        {   break label_7;
        }Term sub_51 = forceSub(sink.context(), term_53, 0).ref();
        /* #CATEGORY=sub */Term sub_10 = forceSub(sink.context(), term_53, 1).ref();
        /* #CONCRETE=sub *//*Contract*/sink.properties(safeRef(props_76));
        sink.start(_M_NormalizeFreeTerm);
        sink.start(_M_ParseToTerm); sink.literal("freeTerm");
        sink.start(_M_ParseToString);
        sink.start(_M_RemoveFirstChar); sink.copy(sub_51.ref());
        sink.end();
        sink.start(_M_RemoveFirstChar);
        sink.start(_M_RemoveLastChar); sink.copy(sub_10.ref());
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeConcrete, props_76, term_53);
  } final public static boolean _M_NormalizeFreeTerms(Sink sink, int shared, int depth, Properties props_72, Term term_27) {
    if (depth < 2000) {
      label_31: {
        term_27 = force(sink.context(), term_27);
        if (term_27.descriptor() != _M__sNil)
        {   break label_31;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_78: {
        term_27 = force(sink.context(), term_27);
        if (term_27.descriptor() != _M__sCons)
        {   break label_78;
        }Term sub_88 = forceSub(sink.context(), term_27, 0).ref();
        sub_88 = force(sink.context(), sub_88);
        if (sub_88.descriptor() != _M_Crsx_xfreeTerms_xS1)
        {   break label_78;
        }Term sub_83 = forceSub(sink.context(), sub_88, 0).ref();Term sub_47 = forceSub(sink.context(), sub_88, 1).ref();
        /* #freeTerm=sub */Term sub_59 = forceSub(sink.context(), term_27, 1).ref();
        /* #freeTerms_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeTerms_xS1); sink.literal(",");sink.properties(safeRef(props_72));
        sink.start(_M_NormalizeFreeTerm); sink.copy(sub_47.ref());
        sink.end();
        sink.end();sink.properties(safeRef(props_72));
        sink.start(_M_NormalizeFreeTerms); sink.copy(sub_59.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeFreeTerms, props_72, term_27);
  } final public static boolean _M_NormalizeFreeArgumentsOpt(Sink sink, int shared, int depth, Properties props_92, Term term_79) {
    if (depth < 2000) {
      label_50: {
        term_79 = force(sink.context(), term_79);
        if (term_79.descriptor() != _M__sNil)
        {   break label_50;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_41: {
        term_79 = force(sink.context(), term_79);
        if (term_79.descriptor() != _M__sCons)
        {   break label_41;
        }Term sub_80 = forceSub(sink.context(), term_79, 0).ref();
        sub_80 = force(sink.context(), sub_80);
        if (sub_80.descriptor() != _M_Crsx_xfreeArguments)
        {   break label_41;
        }Term sub_85 = forceSub(sink.context(), sub_80, 0).ref();Term sub_55 = forceSub(sink.context(), sub_80, 1).ref();
        sub_55 = force(sink.context(), sub_55);
        if (sub_55.descriptor() != _M__sNil)
        {   break label_41;
        }Term sub_76 = forceSub(sink.context(), sub_80, 2).ref();Term sub_74 = forceSub(sink.context(), term_79, 1).ref();
        sub_74 = force(sink.context(), sub_74);
        if (sub_74.descriptor() != _M__sNil)
        {   break label_41;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_69: {
        term_79 = force(sink.context(), term_79);
        if (term_79.descriptor() != _M__sCons)
        {   break label_69;
        }Term sub_78 = forceSub(sink.context(), term_79, 0).ref();
        sub_78 = force(sink.context(), sub_78);
        if (sub_78.descriptor() != _M_Crsx_xfreeArguments)
        {   break label_69;
        }Term sub_20 = forceSub(sink.context(), sub_78, 0).ref();Term sub_73 = forceSub(sink.context(), sub_78, 1).ref();
        sub_73 = force(sink.context(), sub_73);
        if (sub_73.descriptor() != _M__sCons)
        {   break label_69;
        }Term sub_12 = forceSub(sink.context(), sub_73, 0).ref();
        /* #freeTerms=sub */Term sub_71 = forceSub(sink.context(), sub_73, 1).ref();
        sub_71 = force(sink.context(), sub_71);
        if (sub_71.descriptor() != _M__sNil)
        {   break label_69;
        }Term sub_32 = forceSub(sink.context(), sub_78, 2).ref();Term sub_93 = forceSub(sink.context(), term_79, 1).ref();
        sub_93 = force(sink.context(), sub_93);
        if (sub_93.descriptor() != _M__sNil)
        {   break label_69;
        }/*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeArguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_SugarFreeTerms);
        sink.start(_M_NormalizeFreeTerms);
        sink.start(_M_DesugarFreeTerms); sink.copy(sub_12.ref());
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeFreeArgumentsOpt, props_92, term_79);
  } final public static boolean _M_MakeBuiltin(Sink sink, int shared, int depth, Term term_30) {
    if (depth < 2000) {
      label_42: {
        term_30 = force(sink.context(), term_30);
        if (term_30.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_42;
        }Term sub_5 = forceSub(sink.context(), term_30, 0).ref();
        sub_5 = force(sink.context(), sub_5);
        if (sub_5.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_42;
        }Term sub_65 = forceSub(sink.context(), term_30, 1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("Builtin$"); sink.copy(sub_65.ref());
        sink.end();
        sink.end(); return true;
      }
      label_65: {
        term_30 = force(sink.context(), term_30);
        if (term_30.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_65;
        }Term sub_6 = forceSub(sink.context(), term_30, 0).ref();
        sub_6 = force(sink.context(), sub_6);
        if (sub_6.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_65;
        }Term sub_19 = forceSub(sink.context(), sub_6, 0).ref();/*Contract*/
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.literal("Builtin$Colon");
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_MakeBuiltin, term_30);
  } final public static boolean _M_NormalizeConstructor(Sink sink, int shared, int depth, Properties props_78, Term term_83, Term term_75, Term term_69, Term term_33, Term term_38) {
    if (depth < 2000) {
      label_70: {
        term_83 = force(sink.context(), term_83);
        if (term_83.descriptor() != _M_TRUE)
        {   break label_70;
        }
        /* #annotations?=term */
        /* #properties?2=term */
        /* #constructor=term */
        term_38 = force(sink.context(), term_38);
        if (term_38.descriptor() != _M__sCons)
        {   break label_70;
        }Term sub_211 = forceSub(sink.context(), term_38, 0).ref();
        sub_211 = force(sink.context(), sub_211);
        if (sub_211.descriptor() != _M_Crsx_xarguments)
        {   break label_70;
        }Term sub_95 = forceSub(sink.context(), sub_211, 0).ref();Term sub_2 = forceSub(sink.context(), sub_211, 1).ref();
        sub_2 = force(sink.context(), sub_2);
        if (sub_2.descriptor() != _M__sCons)
        {   break label_70;
        }Term sub_52 = forceSub(sink.context(), sub_2, 0).ref();
        sub_52 = force(sink.context(), sub_52);
        if (sub_52.descriptor() != _M_Crsx_xterms)
        {   break label_70;
        }Term sub_57 = forceSub(sink.context(), sub_52, 0).ref();
        sub_57 = force(sink.context(), sub_57);
        if (sub_57.descriptor() != _M_Crsx_xterm_xA1)
        {   break label_70;
        }Term sub_58 = forceSub(sink.context(), sub_57, 0).ref();
        sub_58 = force(sink.context(), sub_58);
        if (sub_58.descriptor() != _M_Crsx_xfreeTerm_xA1)
        {   break label_70;
        }Term sub_41 = forceSub(sink.context(), sub_58, 0).ref();
        sub_41 = force(sink.context(), sub_41);
        if (sub_41.descriptor() != _M__sNil)
        {   break label_70;
        }Term sub_196 = forceSub(sink.context(), sub_58, 1).ref();
        /* #properties?=sub */Term sub_98 = forceSub(sink.context(), sub_58, 2).ref();
        /* #constructor2=sub */Term sub_87 = forceSub(sink.context(), sub_58, 3).ref();
        sub_87 = force(sink.context(), sub_87);
        if (sub_87.descriptor() != _M__sNil)
        {   break label_70;
        }Term sub_67 = forceSub(sink.context(), sub_52, 1).ref();
        /* #terms_S1*=sub */Term sub_0 = forceSub(sink.context(), sub_2, 1).ref();
        sub_0 = force(sink.context(), sub_0);
        if (sub_0.descriptor() != _M__sNil)
        {   break label_70;
        }Term sub_8 = forceSub(sink.context(), sub_211, 2).ref();Term sub_115 = forceSub(sink.context(), term_38, 1).ref();
        sub_115 = force(sink.context(), sub_115);
        if (sub_115.descriptor() != _M__sNil)
        {   break label_70;
        }/*Contract*/sink.properties(safeRef(props_78));
        sink.start(_M_NormalizeConstructor); sink.start(_M_FALSE); sink.end(); sink.copy(term_75.ref()); sink.copy(term_69.ref()); sink.copy(term_33.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms);
        sink.start(_M_Crsx_xterm_xA1);
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.start(_M__sNil); sink.end(); sink.copy(sub_196.ref());
        sink.start(_M_MakeBuiltin); sink.copy(sub_98.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.copy(sub_67.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_54: {
        term_83 = force(sink.context(), term_83);
        if (term_83.descriptor() != _M_FALSE)
        {   break label_54;
        }
        /* #annotations?=term */
        /* #properties?=term */
        /* #constructor=term */
        /* #arguments?=term *//*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.copy(term_75.ref());sink.properties(safeRef(props_78));
        sink.start(_M_NormalizePropertiesOpt); sink.copy(term_69.ref());
        sink.end(); sink.copy(term_33.ref());sink.properties(safeRef(props_78));
        sink.start(_M_NormalizeArgumentsOpt); sink.copy(term_38.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeConstructor, props_78, term_83, term_75, term_69, term_33, term_38);
  }     final public static boolean _M_NormalizeFreeTerm(Sink sink, int shared, int depth, Properties props_95, Term term_94) {
    if (depth < 2000) {
      label_62: {
        term_94 = force(sink.context(), term_94);
        if (term_94.descriptor() != _M_Crsx_xfreeTerm_xA1)
        {   break label_62;
        }Term sub_23 = forceSub(sink.context(), term_94, 0).ref();
        /* #annotations?=sub */Term sub_25 = forceSub(sink.context(), term_94, 1).ref();
        /* #properties?=sub */Term sub_72 = forceSub(sink.context(), term_94, 2).ref();
        /* #constructor=sub */Term sub_84 = forceSub(sink.context(), term_94, 3).ref();
        /* #arguments?=sub *//*Contract*/sink.properties(safeRef(props_95));
        sink.start(_M_NormalizeConstructor);
        sink.start(_M_IsPrimitive); sink.copy(sub_72.ref());
        sink.end(); sink.copy(sub_23.ref()); sink.copy(sub_25.ref()); sink.copy(sub_72.ref()); sink.copy(sub_84.ref());
        sink.end(); return true;
      }
      label_58: {
        term_94 = force(sink.context(), term_94);
        if (term_94.descriptor() != _M_Crsx_xfreeTerm_xA2)
        {   break label_58;
        }Term sub_175 = forceSub(sink.context(), term_94, 0).ref();
        /* #annotations?=sub */Term sub_17 = forceSub(sink.context(), term_94, 1).ref();
        /* #properties?=sub */Term sub_68 = forceSub(sink.context(), term_94, 2).ref();
        /* #constructor=sub */Term sub_27 = forceSub(sink.context(), term_94, 3).ref();
        /* #term=sub *//*Contract*/sink.properties(safeRef(props_95));
        sink.start(_M_NormalizeFreeTerm);
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.copy(sub_175.ref()); sink.copy(sub_17.ref()); sink.copy(sub_68.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms); sink.copy(sub_27.ref()); sink.start(_M__sNil); sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_80: {
        term_94 = force(sink.context(), term_94);
        if (term_94.descriptor() != _M_Crsx_xfreeTerm_xA3)
        {   break label_80;
        }Term sub_13 = forceSub(sink.context(), term_94, 0).ref();
        /* #annotations?=sub */Term sub_283 = forceSub(sink.context(), term_94, 1).ref();
        /* #properties?=sub */Term sub_63 = forceSub(sink.context(), term_94, 2).ref();
        /* #literal=sub *//*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA3); sink.copy(sub_13.ref());sink.properties(safeRef(props_95));
        sink.start(_M_NormalizePropertiesOpt); sink.copy(sub_283.ref());
        sink.end(); sink.copy(sub_63.ref());
        sink.end(); return true;
      }
      label_118: {
        term_94 = force(sink.context(), term_94);
        if (term_94.descriptor() != _M_Crsx_xfreeTerm_xA4)
        {   break label_118;
        }Term sub_62 = forceSub(sink.context(), term_94, 0).ref();
        /* #annotations?=sub */Term sub_53 = forceSub(sink.context(), term_94, 1).ref();
        /* #list=sub *//*Contract*/sink.properties(safeRef(props_95));
        sink.start(_M_NormalizeFreeTerm);
        sink.start(_M_DesugarList); sink.copy(sub_53.ref());
        sink.end();
        sink.end(); return true;
      }
      label_169: {
        term_94 = force(sink.context(), term_94);
        if (term_94.descriptor() != _M_Crsx_xfreeTerm_xA5)
        {   break label_169;
        }Term sub_16 = forceSub(sink.context(), term_94, 0).ref();
        /* #annotations?=sub */Term sub_61 = forceSub(sink.context(), term_94, 1).ref();
        /* #variable=sub *//*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA5); sink.copy(sub_16.ref()); sink.copy(sub_61.ref());
        sink.end(); return true;
      }
      label_2: {
        term_94 = force(sink.context(), term_94);
        if (term_94.descriptor() != _M_Crsx_xfreeTerm_xA6)
        {   break label_2;
        }Term sub_86 = forceSub(sink.context(), term_94, 0).ref();
        /* #annotations?=sub */Term sub_111 = forceSub(sink.context(), term_94, 1).ref();
        sub_111 = force(sink.context(), sub_111);
        if (sub_111.descriptor() != _M_Crsx_xproperties)
        {   break label_2;
        }Term sub_30 = forceSub(sink.context(), sub_111, 0).ref();Term sub_112 = forceSub(sink.context(), sub_111, 1).ref();
        sub_112 = force(sink.context(), sub_112);
        if (sub_112.descriptor() != _M__sCons)
        {   break label_2;
        }Term sub_29 = forceSub(sink.context(), sub_112, 0).ref();
        /* #propertyList=sub */Term sub_107 = forceSub(sink.context(), sub_112, 1).ref();
        sub_107 = force(sink.context(), sub_107);
        if (sub_107.descriptor() != _M__sNil)
        {   break label_2;
        }Term sub_179 = forceSub(sink.context(), sub_111, 2).ref();/*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA6); sink.copy(sub_86.ref());
        sink.start(_M_Crsx_xproperties); sink.literal("{");
        sink.start(_M__sCons);
        sink.start(_M_SugarPropertyList);sink.properties(safeRef(props_95));
        sink.start(_M_NormalizeProperties);
        sink.start(_M_DesugarPropertyList); sink.copy(sub_29.ref());
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("}");
        sink.end();
        sink.end(); return true;
      }
      label_88: {
        term_94 = force(sink.context(), term_94);
        if (term_94.descriptor() != _M_Crsx_xfreeTerm_xA7)
        {   break label_88;
        }Term sub_121 = forceSub(sink.context(), term_94, 0).ref();
        /* #annotations?=sub */Term sub_35 = forceSub(sink.context(), term_94, 1).ref();
        /* #properties?=sub */Term sub_180 = forceSub(sink.context(), term_94, 2).ref();
        /* #METAVAR=sub */Term sub_24 = forceSub(sink.context(), term_94, 3).ref();
        /* #freeArguments?=sub *//*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA7); sink.copy(sub_121.ref());sink.properties(safeRef(props_95));
        sink.start(_M_NormalizePropertiesOpt); sink.copy(sub_35.ref());
        sink.end(); sink.copy(sub_180.ref());sink.properties(safeRef(props_95));
        sink.start(_M_NormalizeFreeArgumentsOpt); sink.copy(sub_24.ref());
        sink.end();
        sink.end(); return true;
      }
      label_129: {
        term_94 = force(sink.context(), term_94);
        if (term_94.descriptor() != _M_Crsx_xfreeTerm_xA8)
        {   break label_129;
        }Term sub_114 = forceSub(sink.context(), term_94, 0).ref();
        /* #annotations?=sub */Term sub_149 = forceSub(sink.context(), term_94, 1).ref();
        /* #concrete=sub *//*Contract*/sink.properties(safeRef(props_95));
        sink.start(_M_NormalizeConcrete); sink.copy(sub_149.ref());
        sink.end(); return true;
      }
      label_77: {
        term_94 = force(sink.context(), term_94);
        if (term_94.descriptor() != _M_Crsx_xfreeTerm_xA9)
        {   break label_77;
        }Term sub_18 = forceSub(sink.context(), term_94, 0).ref();
        /* #annotations?=sub */Term sub_146 = forceSub(sink.context(), term_94, 1).ref();
        /* #properties?=sub */Term sub_1 = forceSub(sink.context(), term_94, 2).ref();
        sub_1 = force(sink.context(), sub_1);
        if (sub_1.descriptor() != _M_Crsx_xexpression)
        {   break label_77;
        }Term sub_54 = forceSub(sink.context(), sub_1, 0).ref();
        /* #dispatch=sub *//*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA9); sink.copy(sub_18.ref());sink.properties(safeRef(props_95));
        sink.start(_M_NormalizePropertiesOpt); sink.copy(sub_146.ref());
        sink.end();
        sink.start(_M_Crsx_xexpression);sink.properties(safeRef(props_95));
        sink.start(_M_NormalizeDispatch); sink.copy(sub_54.ref());
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeFreeTerm, props_95, term_94);
  } final public static boolean _M_NormalizeNextBinder(Sink sink, int shared, int depth, Properties props_35, Term term_90) {
    if (depth < 2000) {
      label_3: {
        term_90 = force(sink.context(), term_90);
        if (term_90.descriptor() != _M_Crsx_xnextBinder_xA1)
        {   break label_3;
        }Term sub_171 = forceSub(sink.context(), term_90, 0).ref();
        /* #binder=sub */Term sub_272 = forceSub(sink.context(), term_90, 1).ref();
        /* #nextBinder=sub *//*Contract*/
        sink.start(_M_Crsx_xnextBinder_xA1); sink.copy(sub_171.ref());sink.properties(safeRef(props_35));
        sink.start(_M_NormalizeNextBinder); sink.copy(sub_272.ref());
        sink.end();
        sink.end(); return true;
      }
      label_38: {
        term_90 = force(sink.context(), term_90);
        if (term_90.descriptor() != _M_Crsx_xnextBinder_xA2)
        {   break label_38;
        }Term sub_109 = forceSub(sink.context(), term_90, 0).ref();Term sub_302 = forceSub(sink.context(), term_90, 1).ref();
        /* #freeTerm=sub *//*Contract*/
        sink.start(_M_Crsx_xnextBinder_xA2); sink.literal(".");sink.properties(safeRef(props_35));
        sink.start(_M_NormalizeFreeTerm); sink.copy(sub_302.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeNextBinder, props_35, term_90);
  } final public static boolean _M_NormalizeTerm(Sink sink, int shared, int depth, Properties props_2, Term term_0) {
    if (depth < 2000) {
      label_93: {
        term_0 = force(sink.context(), term_0);
        if (term_0.descriptor() != _M_Crsx_xterm_xA1)
        {   break label_93;
        }Term sub_186 = forceSub(sink.context(), term_0, 0).ref();
        /* #freeTerm=sub *//*Contract*/
        sink.start(_M_Crsx_xterm_xA1);sink.properties(safeRef(props_2));
        sink.start(_M_NormalizeFreeTerm); sink.copy(sub_186.ref());
        sink.end();
        sink.end(); return true;
      }
      label_26: {
        term_0 = force(sink.context(), term_0);
        if (term_0.descriptor() != _M_Crsx_xterm_xA2)
        {   break label_26;
        }Term sub_97 = forceSub(sink.context(), term_0, 0).ref();
        sub_97 = force(sink.context(), sub_97);
        if (sub_97.descriptor() != _M_Crsx_xboundTerm)
        {   break label_26;
        }Term sub_199 = forceSub(sink.context(), sub_97, 0).ref();
        /* #binder=sub */Term sub_77 = forceSub(sink.context(), sub_97, 1).ref();
        /* #nextBinder=sub *//*Contract*/
        sink.start(_M_Crsx_xterm_xA2);
        sink.start(_M_Crsx_xboundTerm); sink.copy(sub_199.ref());sink.properties(safeRef(props_2));
        sink.start(_M_NormalizeNextBinder); sink.copy(sub_77.ref());
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeTerm, props_2, term_0);
  } final public static boolean _M_NormalizeTerms(Sink sink, int shared, int depth, Properties props_60, Term term_74) {
    if (depth < 2000) {
      label_67: {
        term_74 = force(sink.context(), term_74);
        if (term_74.descriptor() != _M__sNil)
        {   break label_67;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_12: {
        term_74 = force(sink.context(), term_74);
        if (term_74.descriptor() != _M__sCons)
        {   break label_12;
        }Term sub_22 = forceSub(sink.context(), term_74, 0).ref();
        sub_22 = force(sink.context(), sub_22);
        if (sub_22.descriptor() != _M_Crsx_xterms_xS1)
        {   break label_12;
        }Term sub_152 = forceSub(sink.context(), sub_22, 0).ref();Term sub_173 = forceSub(sink.context(), sub_22, 1).ref();
        /* #term=sub */Term sub_82 = forceSub(sink.context(), term_74, 1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms_xS1); sink.literal(",");sink.properties(safeRef(props_60));
        sink.start(_M_NormalizeTerm); sink.copy(sub_173.ref());
        sink.end();
        sink.end();sink.properties(safeRef(props_60));
        sink.start(_M_NormalizeTerms); sink.copy(sub_82.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeTerms, props_60, term_74);
  } final public static boolean _M_NormalizeArgumentsOpt(Sink sink, int shared, int depth, Properties props_81, Term term_99) {
    if (depth < 2000) {
      label_14: {
        term_99 = force(sink.context(), term_99);
        if (term_99.descriptor() != _M__sNil)
        {   break label_14;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_44: {
        term_99 = force(sink.context(), term_99);
        if (term_99.descriptor() != _M__sCons)
        {   break label_44;
        }Term sub_90 = forceSub(sink.context(), term_99, 0).ref();
        sub_90 = force(sink.context(), sub_90);
        if (sub_90.descriptor() != _M_Crsx_xarguments)
        {   break label_44;
        }Term sub_31 = forceSub(sink.context(), sub_90, 0).ref();Term sub_42 = forceSub(sink.context(), sub_90, 1).ref();
        sub_42 = force(sink.context(), sub_42);
        if (sub_42.descriptor() != _M__sNil)
        {   break label_44;
        }Term sub_99 = forceSub(sink.context(), sub_90, 2).ref();Term sub_125 = forceSub(sink.context(), term_99, 1).ref();
        sub_125 = force(sink.context(), sub_125);
        if (sub_125.descriptor() != _M__sNil)
        {   break label_44;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_33: {
        term_99 = force(sink.context(), term_99);
        if (term_99.descriptor() != _M__sCons)
        {   break label_33;
        }Term sub_60 = forceSub(sink.context(), term_99, 0).ref();
        sub_60 = force(sink.context(), sub_60);
        if (sub_60.descriptor() != _M_Crsx_xarguments)
        {   break label_33;
        }Term sub_150 = forceSub(sink.context(), sub_60, 0).ref();Term sub_69 = forceSub(sink.context(), sub_60, 1).ref();
        sub_69 = force(sink.context(), sub_69);
        if (sub_69.descriptor() != _M__sCons)
        {   break label_33;
        }Term sub_195 = forceSub(sink.context(), sub_69, 0).ref();
        /* #terms=sub */Term sub_355 = forceSub(sink.context(), sub_69, 1).ref();
        sub_355 = force(sink.context(), sub_355);
        if (sub_355.descriptor() != _M__sNil)
        {   break label_33;
        }Term sub_228 = forceSub(sink.context(), sub_60, 2).ref();Term sub_281 = forceSub(sink.context(), term_99, 1).ref();
        sub_281 = force(sink.context(), sub_281);
        if (sub_281.descriptor() != _M__sNil)
        {   break label_33;
        }/*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_SugarTerms);
        sink.start(_M_NormalizeTerms);
        sink.start(_M_DesugarTerms); sink.copy(sub_195.ref());
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeArgumentsOpt, props_81, term_99);
  } final public static boolean _M_NormalizeProperties(Sink sink, int shared, int depth, Properties props_182, Term term_19) {
    if (depth < 2000) { sink.copy(term_19.ref()); return true;
    }
    return thunk(sink, _M_NormalizeProperties, props_182, term_19);
  } final public static boolean _M_NormalizePropertiesOpt(Sink sink, int shared, int depth, Properties props_47, Term term_39) {
    if (depth < 2000) {
      label_4: {
        term_39 = force(sink.context(), term_39);
        if (term_39.descriptor() != _M__sNil)
        {   break label_4;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_60: {
        term_39 = force(sink.context(), term_39);
        if (term_39.descriptor() != _M__sCons)
        {   break label_60;
        }Term sub_206 = forceSub(sink.context(), term_39, 0).ref();
        sub_206 = force(sink.context(), sub_206);
        if (sub_206.descriptor() != _M_Crsx_xproperties)
        {   break label_60;
        }Term sub_37 = forceSub(sink.context(), sub_206, 0).ref();Term sub_56 = forceSub(sink.context(), sub_206, 1).ref();
        sub_56 = force(sink.context(), sub_56);
        if (sub_56.descriptor() != _M__sNil)
        {   break label_60;
        }Term sub_43 = forceSub(sink.context(), sub_206, 2).ref();Term sub_182 = forceSub(sink.context(), term_39, 1).ref();
        sub_182 = force(sink.context(), sub_182);
        if (sub_182.descriptor() != _M__sNil)
        {   break label_60;
        }/*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xproperties); sink.literal("{"); sink.start(_M__sNil); sink.end(); sink.literal("}");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
      label_167: {
        term_39 = force(sink.context(), term_39);
        if (term_39.descriptor() != _M__sCons)
        {   break label_167;
        }Term sub_92 = forceSub(sink.context(), term_39, 0).ref();
        sub_92 = force(sink.context(), sub_92);
        if (sub_92.descriptor() != _M_Crsx_xproperties)
        {   break label_167;
        }Term sub_248 = forceSub(sink.context(), sub_92, 0).ref();Term sub_166 = forceSub(sink.context(), sub_92, 1).ref();
        sub_166 = force(sink.context(), sub_166);
        if (sub_166.descriptor() != _M__sCons)
        {   break label_167;
        }Term sub_134 = forceSub(sink.context(), sub_166, 0).ref();
        /* #propertyList=sub */Term sub_45 = forceSub(sink.context(), sub_166, 1).ref();
        sub_45 = force(sink.context(), sub_45);
        if (sub_45.descriptor() != _M__sNil)
        {   break label_167;
        }Term sub_4 = forceSub(sink.context(), sub_92, 2).ref();Term sub_130 = forceSub(sink.context(), term_39, 1).ref();
        sub_130 = force(sink.context(), sub_130);
        if (sub_130.descriptor() != _M__sNil)
        {   break label_167;
        }/*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xproperties); sink.literal("{");
        sink.start(_M__sCons);
        sink.start(_M_SugarPropertyList);sink.properties(safeRef(props_47));
        sink.start(_M_NormalizeProperties);
        sink.start(_M_DesugarPropertyList); sink.copy(sub_134.ref());
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("}");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizePropertiesOpt, props_47, term_39);
  } final public static boolean _M_NormalizeRule(Sink sink, int shared, int depth, Properties props_13, Term term_229) {
    if (depth < 2000) {
      label_139: {
        term_229 = force(sink.context(), term_229);
        if (term_229.descriptor() != _M_Crsx_xruleDeclaration)
        {   break label_139;
        }Term sub_91 = forceSub(sink.context(), term_229, 0).ref();
        /* #option?=sub */Term sub_236 = forceSub(sink.context(), term_229, 1).ref();
        sub_236 = force(sink.context(), sub_236);
        if (sub_236.descriptor() != _M_Crsx_xpattern)
        {   break label_139;
        }Term sub_192 = forceSub(sink.context(), sub_236, 0).ref();
        /* #properties?=sub */Term sub_191 = forceSub(sink.context(), sub_236, 1).ref();
        /* #constructor=sub */Term sub_105 = forceSub(sink.context(), sub_236, 2).ref();
        /* #arguments?=sub */Term sub_79 = forceSub(sink.context(), term_229, 2).ref();Term sub_235 = forceSub(sink.context(), term_229, 3).ref();
        sub_235 = force(sink.context(), sub_235);
        if (sub_235.descriptor() != _M_Crsx_xcontractum)
        {   break label_139;
        }Term sub_253 = forceSub(sink.context(), sub_235, 0).ref();
        /* #freeTerm=sub *//*Contract*/
        sink.start(_M_Crsx_xruleDeclaration); sink.copy(sub_91.ref());
        sink.start(_M_Crsx_xpattern);sink.properties(safeRef(props_13));
        sink.start(_M_NormalizePropertiesOpt); sink.copy(sub_192.ref());
        sink.end(); sink.copy(sub_191.ref());sink.properties(safeRef(props_13));
        sink.start(_M_NormalizeArgumentsOpt); sink.copy(sub_105.ref());
        sink.end();
        sink.end(); sink.literal("\u2192");
        sink.start(_M_Crsx_xcontractum);sink.properties(safeRef(props_13));
        sink.start(_M_NormalizeFreeTerm); sink.copy(sub_253.ref());
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeRule, props_13, term_229);
  } final public static boolean _M_NormalizeRules(Sink sink, int shared, int depth, Properties props_42, Term term_44) {
    if (depth < 2000) {
      label_163: {
        term_44 = force(sink.context(), term_44);
        if (term_44.descriptor() != _M__sCons)
        {   break label_163;
        }Term sub_14 = forceSub(sink.context(), term_44, 0).ref();
        /* #rule=sub */Term sub_257 = forceSub(sink.context(), term_44, 1).ref();
        sub_257 = force(sink.context(), sub_257);
        if (sub_257.descriptor() != _M__sNil)
        {   break label_163;
        }/*Contract*/
        sink.start(_M__sCons);sink.properties(safeRef(props_42));
        sink.start(_M_NormalizeRule); sink.copy(sub_14.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeRules, props_42, term_44);
  } final public static boolean _M_NormalizeRuleKey1(Sink sink, int shared, int depth, Properties props_19, Term term_60, Term term_11, Variable var, Term term_52) {
    if (depth < 2000) {
      label_83: {
        term_60 = force(sink.context(), term_60);
        if (term_60.descriptor() != _M_RULES)
        {   break label_83;
        }Term sub_147 = forceSub(sink.context(), term_60, 0).ref();
        /* #rules=sub */
        /* #key=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_19));Term term_9;
        {
          BufferSink buf = sink.context().makeBuffer();
          buf.start(_M_RULES);buf.properties(safeRef(props_19));
          buf.start(_M_NormalizeRules); buf.copy(sub_147.ref());
          buf.end();
          buf.end();
          term_9 = buf.term();
        }
        term_11 = force(sink.context(), term_11);
        Sink.property(sink, term_11, term_9);Term term_48;
        {
          BufferSink buf_0 = sink.context().makeBuffer(); buf_0.start(_M_OK); buf_0.end();
          term_48 = buf_0.term();
        }
        sink.substitute(term_52.ref(), new Variable[] { var }, new Term[] {term_48}); return true;
      }
    }
    return thunk(sink, _M_NormalizeRuleKey1, props_19, term_60, term_11, var, term_52);
  }    final public static boolean _M_NormalizeRuleKey(Sink sink, int shared, int depth, Properties props_68, Term term_70, Term term_58, Variable var_64, Term term_42) {
    if (depth < 2000) {
      label_147: {
        term_70 = force(sink.context(), term_70);
        if (term_70.descriptor() != _M_OK)
        {   break label_147;
        }
        /* #key=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_68));
        sink.start(_M_NormalizeRuleKey1);
        sink.start(_M__s);sink.properties(safeRef(props_68));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_58.ref());
        sink.end(); sink.copy(term_58.ref());
        Variable var_13 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_13});
        VariableUse use = sink.context().makeVariableUse(var_13);
        sink.substitute(term_42.ref(), new Variable[] { var_64 }, new Term[] {use});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeRuleKey, props_68, term_70, term_58, var_64, term_42);
  }    final public static boolean _M_DispatchCases(Sink sink, int shared, int depth, Term term_67) {
    if (depth < 2000) {
      label_51: {
        term_67 = force(sink.context(), term_67);
        if (term_67.descriptor() != _M__sNil)
        {   break label_51;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_57: {
        term_67 = force(sink.context(), term_67);
        if (term_67.descriptor() != _M__sCons)
        {   break label_57;
        }Term sub_138 = forceSub(sink.context(), term_67, 0).ref();
        /* #rule=sub */Term sub_70 = forceSub(sink.context(), term_67, 1).ref();
        /* #rules=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdispatchCases_xS1); sink.literal(";");
        sink.start(_M_Crsx_xdispatchCase); sink.copy(sub_138.ref());
        sink.end();
        sink.end();
        sink.start(_M_DispatchCases); sink.copy(sub_70.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DispatchCases, term_67);
  } final public static boolean _M_DispatchMetaArgsOpt(Sink sink, int shared, int depth, Term term_54) {
    if (depth < 2000) {
      label_72: {
        term_54 = force(sink.context(), term_54);
        if (term_54.descriptor() != _M__sNil)
        {   break label_72;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_29: {
        term_54 = force(sink.context(), term_54);
        if (term_54.descriptor() != _M__sCons)
        {   break label_29;
        }Term sub_33 = forceSub(sink.context(), term_54, 0).ref();
        sub_33 = force(sink.context(), sub_33);
        if (sub_33.descriptor() != _M_Crsx_xfreeTerms_xS1)
        {   break label_29;
        }Term sub_124 = forceSub(sink.context(), sub_33, 0).ref();Term sub_252 = forceSub(sink.context(), sub_33, 1).ref();
        /* #freeTerm=sub */Term sub_151 = forceSub(sink.context(), term_54, 1).ref();
        /* #freeTerms_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeArguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeTerms); sink.copy(sub_252.ref()); sink.copy(sub_151.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DispatchMetaArgsOpt, term_54);
  } final public static boolean _M_DispatchPatternNextBinder(Sink sink, int shared, int depth, Term term_61, Term term_16, Term term_223) {
    if (depth < 2000) {
      label_35: {
        term_61 = force(sink.context(), term_61);
        if (term_61.descriptor() != _M_Crsx_xnextBinder_xA2)
        {   break label_35;
        }Term sub_254 = forceSub(sink.context(), term_61, 0).ref();Term sub_7 = forceSub(sink.context(), term_61, 1).ref();
        /* #freeTerm=sub */
        /* #count=term */
        /* #freeTerms_S1*=term *//*Contract*/
        sink.start(_M_Crsx_xnextBinder_xA2); sink.literal(".");
        sink.start(_M_DispatchPatternFreeTerm); sink.copy(sub_7.ref()); sink.copy(term_16.ref()); sink.copy(term_223.ref());
        sink.end();
        sink.end(); return true;
      }
      label_23: {
        term_61 = force(sink.context(), term_61);
        if (term_61.descriptor() != _M_Crsx_xnextBinder_xA1)
        {   break label_23;
        }Term sub_127 = forceSub(sink.context(), term_61, 0).ref();
        sub_127 = force(sink.context(), sub_127);
        if (sub_127.descriptor() != _M_Crsx_xbinder)
        {   break label_23;
        }Term sub_122 = forceSub(sink.context(), sub_127, 0).ref();
        /* #annotations?=sub */Term sub_266 = forceSub(sink.context(), sub_127, 1).ref();
        sub_266 = force(sink.context(), sub_266);
        if (sub_266.descriptor() != _M_Crsx_xvariable)
        {   break label_23;
        }Term sub_188 = forceSub(sink.context(), sub_266, 0).ref();
        sub_188 = force(sink.context(), sub_188);
        if (sub_188.descriptor() != _M__sNil)
        {   break label_23;
        }Term sub_339 = forceSub(sink.context(), sub_266, 1).ref();
        /* #VARIABLE=sub */Term sub_94 = forceSub(sink.context(), sub_266, 2).ref();
        /* #linear?=sub */Term sub_141 = forceSub(sink.context(), sub_266, 3).ref();
        /* #functional?=sub */Term sub_226 = forceSub(sink.context(), sub_266, 4).ref();
        /* #varsort?=sub */Term sub_268 = forceSub(sink.context(), term_61, 1).ref();
        /* #nextBinder=sub */
        /* #count=term */
        /* #freeTerms_S1*=term *//*Contract*/
        sink.start(_M_Crsx_xnextBinder_xA1);
        sink.start(_M_Crsx_xbinder); sink.copy(sub_122.ref());
        sink.start(_M_Crsx_xvariable); sink.start(_M__sNil); sink.end(); sink.copy(sub_339.ref()); sink.copy(sub_94.ref()); sink.copy(sub_141.ref()); sink.copy(sub_226.ref());
        sink.end();
        sink.end();
        sink.start(_M_DispatchPatternNextBinder); sink.copy(sub_268.ref()); sink.copy(term_16.ref());
        sink.start(_M_Concat); sink.copy(term_223.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeTerms_xS1); sink.literal(",");
        sink.start(_M_Crsx_xfreeTerm_xA5); sink.copy(sub_122.ref());
        sink.start(_M_Crsx_xvariable); sink.start(_M__sNil); sink.end(); sink.copy(sub_339.ref()); sink.copy(sub_94.ref()); sink.copy(sub_141.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DispatchPatternNextBinder, term_61, term_16, term_223);
  }   final public static boolean _M_DispatchPatternBinder(Sink sink, int shared, int depth, Term term_23, Term term_29, Term term_31, Term term_89) {
    if (depth < 2000) {
      label_28: {
        term_23 = force(sink.context(), term_23);
        if (term_23.descriptor() != _M_Crsx_xbinder)
        {   break label_28;
        }Term sub_223 = forceSub(sink.context(), term_23, 0).ref();
        /* #annotations?=sub */Term sub_388 = forceSub(sink.context(), term_23, 1).ref();
        sub_388 = force(sink.context(), sub_388);
        if (sub_388.descriptor() != _M_Crsx_xvariable)
        {   break label_28;
        }Term sub_278 = forceSub(sink.context(), sub_388, 0).ref();
        sub_278 = force(sink.context(), sub_278);
        if (sub_278.descriptor() != _M__sNil)
        {   break label_28;
        }Term sub_332 = forceSub(sink.context(), sub_388, 1).ref();
        /* #VARIABLE=sub */Term sub_129 = forceSub(sink.context(), sub_388, 2).ref();
        /* #linear?=sub */Term sub_160 = forceSub(sink.context(), sub_388, 3).ref();
        /* #functional?=sub */Term sub_203 = forceSub(sink.context(), sub_388, 4).ref();
        /* #varsort?=sub */
        /* #nextBinder=term */
        /* #count=term */
        /* #freeTerms_S1*=term *//*Contract*/
        sink.start(_M_Crsx_xterm_xA2);
        sink.start(_M_Crsx_xboundTerm);
        sink.start(_M_Crsx_xbinder); sink.copy(sub_223.ref());
        sink.start(_M_Crsx_xvariable); sink.start(_M__sNil); sink.end(); sink.copy(sub_332.ref()); sink.copy(sub_129.ref()); sink.copy(sub_160.ref()); sink.copy(sub_203.ref());
        sink.end();
        sink.end();
        sink.start(_M_DispatchPatternNextBinder); sink.copy(term_29.ref()); sink.copy(term_31.ref());
        sink.start(_M_Concat); sink.copy(term_89.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeTerms_xS1); sink.literal(",");
        sink.start(_M_Crsx_xfreeTerm_xA5); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xvariable); sink.start(_M__sNil); sink.end(); sink.copy(sub_332.ref()); sink.copy(sub_129.ref()); sink.copy(sub_160.ref()); sink.start(_M__sNil); sink.end();
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
    return thunk(sink, _M_DispatchPatternBinder, term_23, term_29, term_31, term_89);
  }    final public static boolean _M_DispatchPatternFreeTerm(Sink sink, int shared, int depth, Term term_45, Term term_51, Term term_47) {
    if (depth < 2000) {
      sink.start(_M_Crsx_xfreeTerm_xA7); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("#$P$");
      sink.start(_M__s); sink.start(_M_Builtin_sFormatNumber); sink.end(); sink.copy(term_51.ref());
      sink.end();
      sink.end();
      sink.start(_M_DispatchMetaArgsOpt); sink.copy(term_47.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchPatternFreeTerm, term_45, term_51, term_47);
  }   final public static boolean _M_DispatchPatternTerm(Sink sink, int shared, int depth, Term term_1, Term term_15, Term term_14) {
    if (depth < 2000) {
      label_97: {
        term_1 = force(sink.context(), term_1);
        if (term_1.descriptor() != _M_Crsx_xterm_xA1)
        {   break label_97;
        }Term sub_163 = forceSub(sink.context(), term_1, 0).ref();
        /* #freeTerm=sub */
        /* #count=term */
        /* #freeTerms_S1*=term *//*Contract*/
        sink.start(_M_Crsx_xterm_xA1);
        sink.start(_M_DispatchPatternFreeTerm); sink.copy(sub_163.ref()); sink.copy(term_15.ref()); sink.copy(term_14.ref());
        sink.end();
        sink.end(); return true;
      }
      label_32: {
        term_1 = force(sink.context(), term_1);
        if (term_1.descriptor() != _M_Crsx_xterm_xA2)
        {   break label_32;
        }Term sub_293 = forceSub(sink.context(), term_1, 0).ref();
        sub_293 = force(sink.context(), sub_293);
        if (sub_293.descriptor() != _M_Crsx_xboundTerm)
        {   break label_32;
        }Term sub_259 = forceSub(sink.context(), sub_293, 0).ref();
        /* #binder=sub */Term sub_15 = forceSub(sink.context(), sub_293, 1).ref();
        /* #nextBinder=sub */
        /* #count=term */
        /* #freeTerms_S1*=term *//*Contract*/
        sink.start(_M_DispatchPatternBinder); sink.copy(sub_259.ref()); sink.copy(sub_15.ref()); sink.copy(term_15.ref()); sink.copy(term_14.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DispatchPatternTerm, term_1, term_15, term_14);
  }   final public static boolean _M_DispatchPatternArgs(Sink sink, int shared, int depth, Term term_151, Term term_176) {
    if (depth < 2000) {
      label_48: {
        term_151 = force(sink.context(), term_151);
        if (term_151.descriptor() != _M__sNil)
        {   break label_48;
        }
        /* #count=term *//*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_160: {
        term_151 = force(sink.context(), term_151);
        if (term_151.descriptor() != _M__sCons)
        {   break label_160;
        }Term sub_158 = forceSub(sink.context(), term_151, 0).ref();
        sub_158 = force(sink.context(), sub_158);
        if (sub_158.descriptor() != _M_Crsx_xterms_xS1)
        {   break label_160;
        }Term sub_353 = forceSub(sink.context(), sub_158, 0).ref();Term sub_144 = forceSub(sink.context(), sub_158, 1).ref();
        /* #term=sub */Term sub_154 = forceSub(sink.context(), term_151, 1).ref();
        /* #terms_S1*=sub */
        /* #count=term *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms_xS1); sink.literal(",");
        sink.start(_M_DispatchPatternTerm); sink.copy(sub_144.ref()); sink.copy(term_176.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.start(_M_DispatchPatternArgs); sink.copy(sub_154.ref());
        sink.start(_M__s); sink.start(_M_Builtin_sPlus); sink.end(); sink.copy(term_176.ref()); sink.literal(1);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DispatchPatternArgs, term_151, term_176);
  }  final public static boolean _M_DispatchProperties(Sink sink, int shared, int depth, Term term_137) {
    if (depth < 2000) {
      label_21: {
        term_137 = force(sink.context(), term_137);
        if (term_137.descriptor() != _M__sNil)
        {   break label_21;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_36: {
        term_137 = force(sink.context(), term_137);
        if (term_137.descriptor() != _M__sCons)
        {   break label_36;
        }Term sub_201 = forceSub(sink.context(), term_137, 0).ref();
        sub_201 = force(sink.context(), sub_201);
        if (sub_201.descriptor() != _M_Crsx_xproperties)
        {   break label_36;
        }Term sub_231 = forceSub(sink.context(), sub_201, 0).ref();Term sub_242 = forceSub(sink.context(), sub_201, 1).ref();
        sub_242 = force(sink.context(), sub_242);
        if (sub_242.descriptor() != _M__sNil)
        {   break label_36;
        }Term sub_317 = forceSub(sink.context(), sub_201, 2).ref();Term sub_108 = forceSub(sink.context(), term_137, 1).ref();
        sub_108 = force(sink.context(), sub_108);
        if (sub_108.descriptor() != _M__sNil)
        {   break label_36;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_138: {
        term_137 = force(sink.context(), term_137);
        if (term_137.descriptor() != _M__sCons)
        {   break label_138;
        }Term sub_497 = forceSub(sink.context(), term_137, 0).ref();
        sub_497 = force(sink.context(), sub_497);
        if (sub_497.descriptor() != _M_Crsx_xproperties)
        {   break label_138;
        }Term sub_214 = forceSub(sink.context(), sub_497, 0).ref();Term sub_46 = forceSub(sink.context(), sub_497, 1).ref();
        sub_46 = force(sink.context(), sub_46);
        if (sub_46.descriptor() != _M__sCons)
        {   break label_138;
        }Term sub_273 = forceSub(sink.context(), sub_46, 0).ref();
        /* #propertyList=sub */Term sub_162 = forceSub(sink.context(), sub_46, 1).ref();
        sub_162 = force(sink.context(), sub_162);
        if (sub_162.descriptor() != _M__sNil)
        {   break label_138;
        }Term sub_282 = forceSub(sink.context(), sub_497, 2).ref();Term sub_143 = forceSub(sink.context(), term_137, 1).ref();
        sub_143 = force(sink.context(), sub_143);
        if (sub_143.descriptor() != _M__sNil)
        {   break label_138;
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
    return thunk(sink, _M_DispatchProperties, term_137);
  } final public static boolean _M_Dispatch(Sink sink, int shared, int depth, Term term_77) {
    if (depth < 2000) {
      label_94: {
        term_77 = force(sink.context(), term_77);
        if (term_77.descriptor() != _M__sCons)
        {   break label_94;
        }Term sub_26 = forceSub(sink.context(), term_77, 0).ref();
        sub_26 = force(sink.context(), sub_26);
        if (sub_26.descriptor() != _M_Crsx_xruleDeclaration)
        {   break label_94;
        }Term sub_159 = forceSub(sink.context(), sub_26, 0).ref();
        /* #option?=sub */Term sub_267 = forceSub(sink.context(), sub_26, 1).ref();
        sub_267 = force(sink.context(), sub_267);
        if (sub_267.descriptor() != _M_Crsx_xpattern)
        {   break label_94;
        }Term sub_40 = forceSub(sink.context(), sub_267, 0).ref();
        /* #properties?=sub */Term sub_153 = forceSub(sink.context(), sub_267, 1).ref();
        /* #constructor=sub */Term sub_176 = forceSub(sink.context(), sub_267, 2).ref();
        sub_176 = force(sink.context(), sub_176);
        if (sub_176.descriptor() != _M__sCons)
        {   break label_94;
        }Term sub_120 = forceSub(sink.context(), sub_176, 0).ref();
        sub_120 = force(sink.context(), sub_120);
        if (sub_120.descriptor() != _M_Crsx_xarguments)
        {   break label_94;
        }Term sub_470 = forceSub(sink.context(), sub_120, 0).ref();Term sub_258 = forceSub(sink.context(), sub_120, 1).ref();
        sub_258 = force(sink.context(), sub_258);
        if (sub_258.descriptor() != _M__sCons)
        {   break label_94;
        }Term sub_89 = forceSub(sink.context(), sub_258, 0).ref();
        /* #terms=sub */Term sub_270 = forceSub(sink.context(), sub_258, 1).ref();
        sub_270 = force(sink.context(), sub_270);
        if (sub_270.descriptor() != _M__sNil)
        {   break label_94;
        }Term sub_194 = forceSub(sink.context(), sub_120, 2).ref();Term sub_247 = forceSub(sink.context(), sub_176, 1).ref();
        sub_247 = force(sink.context(), sub_247);
        if (sub_247.descriptor() != _M__sNil)
        {   break label_94;
        }Term sub_374 = forceSub(sink.context(), sub_26, 2).ref();Term sub_322 = forceSub(sink.context(), sub_26, 3).ref();
        /* #contractum=sub */Term sub_318 = forceSub(sink.context(), term_77, 1).ref();
        /* #rules=sub *//*Contract*/
        sink.start(_M_Crsx_xruleDeclaration); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xpattern);
        sink.start(_M_DispatchProperties); sink.copy(sub_40.ref());
        sink.end(); sink.copy(sub_153.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_SugarTerms);
        sink.start(_M_DispatchPatternArgs);
        sink.start(_M_DesugarTerms); sink.copy(sub_89.ref());
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
        sink.start(_M_DispatchProperties); sink.copy(sub_40.ref());
        sink.end(); sink.copy(sub_153.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_SugarTerms);
        sink.start(_M_DispatchPatternArgs);
        sink.start(_M_DesugarTerms); sink.copy(sub_89.ref());
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
        sink.start(_M_Crsx_xruleDeclaration); sink.copy(sub_159.ref());
        sink.start(_M_Crsx_xpattern); sink.copy(sub_40.ref()); sink.copy(sub_153.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons); sink.copy(sub_89.ref()); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.literal("\u2192"); sink.copy(sub_322.ref());
        sink.end(); sink.copy(sub_318.ref());
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
    return thunk(sink, _M_Dispatch, term_77);
  } final public static boolean _M_GroupRule(Sink sink, int shared, int depth, Properties props_84, Term term_66, Term term_196, Variable var_88, Term term_127) {
    if (depth < 2000) {
      label_34: {
        /* #key=term */
        /* #rules=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_84));Term term_188;
        {
          BufferSink buf_11 = sink.context().makeBuffer();
          buf_11.start(_M_RULES);
          buf_11.start(_M__sCons);
          buf_11.start(_M_Dispatch); buf_11.copy(term_196.ref());
          buf_11.end(); buf_11.start(_M__sNil); buf_11.end();
          buf_11.end();
          buf_11.end();
          term_188 = buf_11.term();
        }
        term_66 = force(sink.context(), term_66);
        Sink.property(sink, term_66, term_188);Term term_86;
        {
          BufferSink buf_44 = sink.context().makeBuffer(); buf_44.start(_M_OK); buf_44.end();
          term_86 = buf_44.term();
        }
        sink.substitute(term_127.ref(), new Variable[] { var_88 }, new Term[] {term_86}); return true;
      }
    }
    return thunk(sink, _M_GroupRule, props_84, term_66, term_196, var_88, term_127);
  }    final public static boolean _M_MayGroupRule2(Sink sink, int shared, int depth, Properties props_12, Term term_87, Term term_185, Term term_115, Variable var_22, Term term_49) {
    if (depth < 2000) {
      label_95: {
        term_87 = force(sink.context(), term_87);
        if (term_87.descriptor() != _M_TRUE)
        {   break label_95;
        }
        /* #key=term */
        /* #rules=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_12));Term term_24;
        {
          BufferSink buf_19 = sink.context().makeBuffer(); buf_19.start(_M_OK); buf_19.end();
          term_24 = buf_19.term();
        }
        sink.substitute(term_49.ref(), new Variable[] { var_22 }, new Term[] {term_24}); return true;
      }
      label_87: {
        term_87 = force(sink.context(), term_87);
        if (term_87.descriptor() != _M_FALSE)
        {   break label_87;
        }
        /* #key=term */
        /* #rules=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_12));
        sink.start(_M_GroupRule); sink.copy(term_185.ref()); sink.copy(term_115.ref());
        Variable var_49 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_49});
        VariableUse use_98 = sink.context().makeVariableUse(var_49);
        sink.substitute(term_49.ref(), new Variable[] { var_22 }, new Term[] {use_98});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_MayGroupRule2, props_12, term_87, term_185, term_115, var_22, term_49);
  }     final public static boolean _M_MayGroupRule1(Sink sink, int shared, int depth, Properties props_36, Term term_35, Term term_32, Variable var_82, Term term_119) {
    if (depth < 2000) {
      label_99: {
        term_35 = force(sink.context(), term_35);
        if (term_35.descriptor() != _M_RULES)
        {   break label_99;
        }Term sub_294 = forceSub(sink.context(), term_35, 0).ref();
        /* #rules=sub */
        /* #key=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_36));
        sink.start(_M_MayGroupRule2);
        sink.start(_M_Or); sink.start(_M_IsEmpty); sink.copy(sub_294.ref()); sink.end();
        sink.start(_M_And);
        sink.start(_M_IsSingleton); sink.copy(sub_294.ref());
        sink.end();
        sink.start(_M_AllMetaInPatternRule); sink.start(_M_Head); sink.copy(sub_294.ref()); sink.end();
        sink.end();
        sink.end();
        sink.end(); sink.copy(term_32.ref()); sink.copy(sub_294.ref());
        Variable var_79 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_79});
        VariableUse use_8 = sink.context().makeVariableUse(var_79);
        sink.substitute(term_119.ref(), new Variable[] { var_82 }, new Term[] {use_8});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_MayGroupRule1, props_36, term_35, term_32, var_82, term_119);
  }    final public static boolean _M_MayGroupRule(Sink sink, int shared, int depth, Properties props_27, Term term_195, Variable var_58, Term term_22) {
    if (depth < 2000) {
      label_71: {
        /* #key=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_27));
        sink.start(_M_MayGroupRule1);
        sink.start(_M__s);sink.properties(safeRef(props_27));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_195.ref());
        sink.end(); sink.copy(term_195.ref());
        Variable var_19 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_19});
        VariableUse use_1 = sink.context().makeVariableUse(var_19);
        sink.substitute(term_22.ref(), new Variable[] { var_58 }, new Term[] {use_1});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_MayGroupRule, props_27, term_195, var_58, term_22);
  }   final public static boolean _M_N2Rule(Sink sink, int shared, int depth, Properties props_18, Term term_148, Term term_73) {
    if (depth < 2000) {
      label_260: {
        /* #ruleKey=term */
        term_73 = force(sink.context(), term_73);
        if (term_73.descriptor() != _M_CONTINUATION)
        {   break label_260;
        }Term sub_145 = forceSub(sink.context(), term_73, 0).ref();
        Variable binder = term_73.binders(0)[0];
        /* #=sub *//*Contract*/sink.properties(safeRef(props_18));
        sink.start(_M_MayGroupRule); sink.copy(term_148.ref());
        Variable var_80 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_80});
        sink.start(_M_NormalizeRuleKey); sink.use(var_80); sink.copy(term_148.ref());
        Variable var_31 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_31});
        VariableUse use_21 = sink.context().makeVariableUse(var_31);
        sink.substitute(sub_145.ref(), new Variable[] { binder }, new Term[] {use_21});
        sink.end();
        sink.end(); return true; 
      }
    }
    return thunk(sink, _M_N2Rule, props_18, term_148, term_73);
  }  final public static boolean _M_N2Rules(Sink sink, int shared, int depth, Properties props_28, Term term_43, Variable var_68, Term term_36) {
    if (depth < 2000) {
      label_46: {
        /* #keys=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_28));
        sink.start(_M_SeqMap);
        Variable var_181 = sink.context().makeVariable("x");
        Variable var_25 = sink.context().makeVariable("c");
        sink.binds(new Variable[] {var_181,var_25});
        sink.start(_M_N2Rule); sink.use(var_181); sink.use(var_25);
        sink.end(); sink.copy(term_43.ref());
        Variable var_97 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_97});
        VariableUse use_92 = sink.context().makeVariableUse(var_97);
        sink.substitute(term_36.ref(), new Variable[] { var_68 }, new Term[] {use_92});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N2Rules, props_28, term_43, var_68, term_36);
  }   final public static boolean _M_N2(Sink sink, int shared, int depth, Properties props_8, Term term_21, Variable var_46, Term term_194) {
    if (depth < 2000) {
      label_149: {
        Term value = props_8 == null ? null : props_8.lookup("$rulekeys");
        if (value == null) 
        {   break label_149;
        }
        value = force(sink.context(), value);
        if (value.descriptor() != _M_KEYS)
        {   break label_149;
        }Term sub_117 = forceSub(sink.context(), value, 0).ref();
        /* #keys=sub */
        term_21 = force(sink.context(), term_21);
        if (term_21.descriptor() != _M_OK)
        {   break label_149;
        }
        /* #=term *//*Contract*/sink.properties(safeRef(props_8));
        sink.start(_M_N2Rules); sink.copy(sub_117.ref());
        Variable var_38 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_38});
        VariableUse use_77 = sink.context().makeVariableUse(var_38);
        sink.substitute(term_194.ref(), new Variable[] { var_46 }, new Term[] {use_77});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N2, props_8, term_21, var_46, term_194);
  }   final public static boolean _M_N1ImportDirective(Sink sink, int shared, int depth, Properties props_55, Term term_18, Term term_80, Variable var_37, Term term_104) {
    if (depth < 2000) {
      label_195: {
        Term value_97 = props_55 == null ? null : props_55.lookup("$imported");
        if (value_97 == null) 
        {   break label_195;
        }
        value_97 = force(sink.context(), value_97);
        if (value_97.descriptor() != _M_IMPORTS)
        {   break label_195;
        }Term sub_116 = forceSub(sink.context(), value_97, 0).ref();
        /* #imported=sub */
        term_18 = force(sink.context(), term_18);
        if (term_18.descriptor() != _M_Crsx_xdirective_xA3)
        {   break label_195;
        }Term sub_131 = forceSub(sink.context(), term_18, 0).ref();
        sub_131 = force(sink.context(), sub_131);
        if (sub_131.descriptor() != _M_Crsx_xliteral_xA1)
        {   break label_195;
        }Term sub_461 = forceSub(sink.context(), sub_131, 0).ref();
        /* #STRING=sub */
        term_80 = force(sink.context(), term_80);
        if (term_80.descriptor() != _M_TRUE)
        {   break label_195;
        }
        /* #=term *//*Contract*/sink.properties(safeRef(props_55));Term term_279;
        {
          BufferSink buf_82 = sink.context().makeBuffer();
          buf_82.start(_M_IMPORTS);
          buf_82.start(_M_Concat); buf_82.copy(sub_116.ref());
          buf_82.start(_M__sCons);
          buf_82.start(_M_UnString); buf_82.copy(sub_461.ref());
          buf_82.end(); buf_82.start(_M__sNil); buf_82.end();
          buf_82.end();
          buf_82.end();
          buf_82.end();
          term_279 = buf_82.term();
        } sink.propertyNamed("$imported", term_279);Term term_63;
        {
          BufferSink buf_18 = sink.context().makeBuffer(); buf_18.start(_M_OK); buf_18.end();
          term_63 = buf_18.term();
        }
        sink.substitute(term_104.ref(), new Variable[] { var_37 }, new Term[] {term_63}); return true;
      }
      label_73: {
        Term value_26 = props_55 == null ? null : props_55.lookup("$grammars");
        if (value_26 == null) 
        {   break label_73;
        }
        value_26 = force(sink.context(), value_26);
        if (value_26.descriptor() != _M_IMPORTS)
        {   break label_73;
        }Term sub_249 = forceSub(sink.context(), value_26, 0).ref();
        /* #imported=sub */
        term_18 = force(sink.context(), term_18);
        if (term_18.descriptor() != _M_Crsx_xdirective_xA3)
        {   break label_73;
        }Term sub_187 = forceSub(sink.context(), term_18, 0).ref();
        sub_187 = force(sink.context(), sub_187);
        if (sub_187.descriptor() != _M_Crsx_xliteral_xA1)
        {   break label_73;
        }Term sub_113 = forceSub(sink.context(), sub_187, 0).ref();
        /* #STRING=sub */
        term_80 = force(sink.context(), term_80);
        if (term_80.descriptor() != _M_FALSE)
        {   break label_73;
        }
        /* #=term *//*Contract*/sink.properties(safeRef(props_55));Term term_17;
        {
          BufferSink buf_79 = sink.context().makeBuffer();
          buf_79.start(_M_IMPORTS);
          buf_79.start(_M_Concat); buf_79.copy(sub_249.ref());
          buf_79.start(_M__sCons);
          buf_79.start(_M_Replace);
          buf_79.start(_M_UnString); buf_79.copy(sub_113.ref());
          buf_79.end(); buf_79.literal("."); buf_79.literal("/");
          buf_79.end(); buf_79.start(_M__sNil); buf_79.end();
          buf_79.end();
          buf_79.end();
          buf_79.end();
          term_17 = buf_79.term();
        } sink.propertyNamed("$grammars", term_17);Term term_122;
        {
          BufferSink buf_2 = sink.context().makeBuffer(); buf_2.start(_M_OK); buf_2.end();
          term_122 = buf_2.term();
        }
        sink.substitute(term_104.ref(), new Variable[] { var_37 }, new Term[] {term_122}); return true;
      }
      label_18: {
        /* #directive=term */
        /* #kind=term */
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end(); sink.literal("Error: invalid argument in import directive.");
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1ImportDirective, props_55, term_18, term_80, var_37, term_104);
  }    final public static boolean _M_N1ImportDirectives(Sink sink, int shared, int depth, Properties props_34, Term term_93, Term term_59, Variable var_11, Term term_50) {
    if (depth < 2000) {
      label_98: {
        term_93 = force(sink.context(), term_93);
        if (term_93.descriptor() != _M__sNil)
        {   break label_98;
        }
        /* #kind=term */
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Error: missing filename argument in import directive.");
        sink.end(); return true;
      }
      label_90: {
        term_93 = force(sink.context(), term_93);
        if (term_93.descriptor() != _M__sCons)
        {   break label_90;
        }Term sub_349 = forceSub(sink.context(), term_93, 0).ref();
        sub_349 = force(sink.context(), sub_349);
        if (sub_349.descriptor() != _M_Crsx_xdirectives)
        {   break label_90;
        }Term sub_9 = forceSub(sink.context(), sub_349, 0).ref();
        /* #directive1=sub */Term sub_75 = forceSub(sink.context(), sub_349, 1).ref();
        sub_75 = force(sink.context(), sub_75);
        if (sub_75.descriptor() != _M__sCons)
        {   break label_90;
        }Term sub_208 = forceSub(sink.context(), sub_75, 0).ref();
        sub_208 = force(sink.context(), sub_208);
        if (sub_208.descriptor() != _M_Crsx_xdirectives_xS1)
        {   break label_90;
        }Term sub_49 = forceSub(sink.context(), sub_208, 0).ref();Term sub_224 = forceSub(sink.context(), sub_208, 1).ref();
        /* #directive2=sub */Term sub_225 = forceSub(sink.context(), sub_75, 1).ref();
        /* #directives_S1*=sub */Term sub_303 = forceSub(sink.context(), term_93, 1).ref();
        sub_303 = force(sink.context(), sub_303);
        if (sub_303.descriptor() != _M__sNil)
        {   break label_90;
        }
        /* #kind=term */
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Error: extraneous argument in import directive.");
        sink.end(); return true;
      }
      label_277: {
        term_93 = force(sink.context(), term_93);
        if (term_93.descriptor() != _M__sCons)
        {   break label_277;
        }Term sub_205 = forceSub(sink.context(), term_93, 0).ref();
        sub_205 = force(sink.context(), sub_205);
        if (sub_205.descriptor() != _M_Crsx_xdirectives)
        {   break label_277;
        }Term sub_297 = forceSub(sink.context(), sub_205, 0).ref();
        /* #directive=sub */Term sub_66 = forceSub(sink.context(), sub_205, 1).ref();
        sub_66 = force(sink.context(), sub_66);
        if (sub_66.descriptor() != _M__sNil)
        {   break label_277;
        }Term sub_391 = forceSub(sink.context(), term_93, 1).ref();
        sub_391 = force(sink.context(), sub_391);
        if (sub_391.descriptor() != _M__sNil)
        {   break label_277;
        }
        /* #kind=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_34));
        sink.start(_M_N1ImportDirective); sink.copy(sub_297.ref()); sink.copy(term_59.ref());
        Variable var_151 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_151});
        VariableUse use_42 = sink.context().makeVariableUse(var_151);
        sink.substitute(term_50.ref(), new Variable[] { var_11 }, new Term[] {use_42});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1ImportDirectives, props_34, term_93, term_59, var_11, term_50);
  }    final public static boolean _M_N1Import(Sink sink, int shared, int depth, Properties props_165, Term term_170, Term term_85, Variable var_5, Term term_56) {
    if (depth < 2000) {
      label_106: {
        term_170 = force(sink.context(), term_170);
        if (term_170.descriptor() != _M__sNil)
        {   break label_106;
        }
        /* #kind=term */
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Error: missing filename argument in import directive.");
        sink.end(); return true;
      }
      label_180: {
        term_170 = force(sink.context(), term_170);
        if (term_170.descriptor() != _M__sCons)
        {   break label_180;
        }Term sub_244 = forceSub(sink.context(), term_170, 0).ref();
        sub_244 = force(sink.context(), sub_244);
        if (sub_244.descriptor() != _M_Crsx_xdirectiveArguments)
        {   break label_180;
        }Term sub_264 = forceSub(sink.context(), sub_244, 0).ref();Term sub_256 = forceSub(sink.context(), sub_244, 1).ref();
        /* #directives?=sub */Term sub_119 = forceSub(sink.context(), sub_244, 2).ref();Term sub_238 = forceSub(sink.context(), term_170, 1).ref();
        sub_238 = force(sink.context(), sub_238);
        if (sub_238.descriptor() != _M__sNil)
        {   break label_180;
        }
        /* #kind=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_165));
        sink.start(_M_N1ImportDirectives); sink.copy(sub_256.ref()); sink.copy(term_85.ref());
        Variable var_61 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_61});
        VariableUse use_3 = sink.context().makeVariableUse(var_61);
        sink.substitute(term_56.ref(), new Variable[] { var_5 }, new Term[] {use_3});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1Import, props_165, term_170, term_85, var_5, term_56);
  }    final public static boolean _M_N1DirectiveConstructor(Sink sink, int shared, int depth, Properties props_97, Term term_8, Variable var_56, Term term_293) {
    if (depth < 2000) {
      label_164: {
        /* #constructor=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_97));Term term_102;
        {
          BufferSink buf_6 = sink.context().makeBuffer(); buf_6.start(_M_OK); buf_6.end();
          term_102 = buf_6.term();
        }
        sink.substitute(term_293.ref(), new Variable[] { var_56 }, new Term[] {term_102}); return true;
      }
    }
    return thunk(sink, _M_N1DirectiveConstructor, props_97, term_8, var_56, term_293);
  }   final public static boolean _M_N1Directive(Sink sink, int shared, int depth, Properties props_67, Term term_82, Variable var_167, Term term_163) {
    if (depth < 2000) {
      label_156: {
        term_82 = force(sink.context(), term_82);
        if (term_82.descriptor() != _M_Crsx_xdirective_xA1)
        {   break label_156;
        }Term sub_100 = forceSub(sink.context(), term_82, 0).ref();
        sub_100 = force(sink.context(), sub_100);
        if (sub_100.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_156;
        }Term sub_310 = forceSub(sink.context(), sub_100, 0).ref();
        sub_310 = force(sink.context(), sub_310);
        if (sub_310.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_156;
        }Term sub_102 = forceSub(sink.context(), sub_100, 1).ref();
        /* #CONSTRUCTOR=sub */Term sub_101 = forceSub(sink.context(), term_82, 1).ref();
        /* #directiveArguments?=sub */
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sStringEqual); sink.end(); sink.copy(sub_102.ref()); sink.literal("$Use");
        sink.end();sink.properties(safeRef(props_67));
        sink.start(_M_N1Import); sink.copy(sub_101.ref()); sink.start(_M_TRUE); sink.end();
        Variable var_32 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_32});
        VariableUse use_27 = sink.context().makeVariableUse(var_32);
        sink.substitute(term_163.ref(), new Variable[] { var_167 }, new Term[] {use_27});
        sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sStringEqual); sink.end(); sink.copy(sub_102.ref()); sink.literal("$AddGrammar");
        sink.end();sink.properties(safeRef(props_67));
        sink.start(_M_N1Import); sink.copy(sub_101.ref()); sink.start(_M_FALSE); sink.end();
        Variable var_52 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_52});
        VariableUse use_11 = sink.context().makeVariableUse(var_52);
        sink.substitute(term_163.ref(), new Variable[] { var_167 }, new Term[] {use_11});
        sink.end();sink.properties(safeRef(props_67));Term term_40;
        {
          BufferSink buf_71 = sink.context().makeBuffer(); buf_71.start(_M_OK); buf_71.end();
          term_40 = buf_71.term();
        }
        sink.substitute(term_163.ref(), new Variable[] { var_167 }, new Term[] {term_40});
        sink.end();
        sink.end(); return true;
      }
      label_68: {
        /* #directive=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_67));Term term_256;
        {
          BufferSink buf_94 = sink.context().makeBuffer(); buf_94.start(_M_OK); buf_94.end();
          term_256 = buf_94.term();
        }
        sink.substitute(term_163.ref(), new Variable[] { var_167 }, new Term[] {term_256}); return true;
      }
    }
    return thunk(sink, _M_N1Directive, props_67, term_82, var_167, term_163);
  }   final public static boolean _M_N1Declaration(Sink sink, int shared, int depth, Properties props_0, Term term_3, Variable var_132, Term term_98) {
    if (depth < 2000) {
      label_47: {
        term_3 = force(sink.context(), term_3);
        if (term_3.descriptor() != _M_Crsx_xdeclaration_xA5)
        {   break label_47;
        }Term sub_142 = forceSub(sink.context(), term_3, 0).ref();
        sub_142 = force(sink.context(), sub_142);
        if (sub_142.descriptor() != _M_Crsx_xdirective_xA1)
        {   break label_47;
        }Term sub_230 = forceSub(sink.context(), sub_142, 0).ref();
        /* #constructor=sub */Term sub_467 = forceSub(sink.context(), sub_142, 1).ref();
        sub_467 = force(sink.context(), sub_467);
        if (sub_467.descriptor() != _M__sCons)
        {   break label_47;
        }Term sub_269 = forceSub(sink.context(), sub_467, 0).ref();
        sub_269 = force(sink.context(), sub_269);
        if (sub_269.descriptor() != _M_Crsx_xdirectiveArguments)
        {   break label_47;
        }Term sub_165 = forceSub(sink.context(), sub_269, 0).ref();Term sub_189 = forceSub(sink.context(), sub_269, 1).ref();
        sub_189 = force(sink.context(), sub_189);
        if (sub_189.descriptor() != _M__sCons)
        {   break label_47;
        }Term sub_432 = forceSub(sink.context(), sub_189, 0).ref();
        sub_432 = force(sink.context(), sub_432);
        if (sub_432.descriptor() != _M_Crsx_xdirectives)
        {   break label_47;
        }Term sub_126 = forceSub(sink.context(), sub_432, 0).ref();
        sub_126 = force(sink.context(), sub_126);
        if (sub_126.descriptor() != _M_Crsx_xdirective_xA2)
        {   break label_47;
        }Term sub_430 = forceSub(sink.context(), sub_126, 0).ref();
        sub_430 = force(sink.context(), sub_430);
        if (sub_430.descriptor() != _M_Crsx_xdirectiveList)
        {   break label_47;
        }Term sub_246 = forceSub(sink.context(), sub_430, 0).ref();Term sub_218 = forceSub(sink.context(), sub_430, 1).ref();
        sub_218 = force(sink.context(), sub_218);
        if (sub_218.descriptor() != _M__sNil)
        {   break label_47;
        }Term sub_393 = forceSub(sink.context(), sub_430, 2).ref();Term sub_422 = forceSub(sink.context(), sub_432, 1).ref();
        sub_422 = force(sink.context(), sub_422);
        if (sub_422.descriptor() != _M__sNil)
        {   break label_47;
        }Term sub_428 = forceSub(sink.context(), sub_189, 1).ref();
        sub_428 = force(sink.context(), sub_428);
        if (sub_428.descriptor() != _M__sNil)
        {   break label_47;
        }Term sub_299 = forceSub(sink.context(), sub_269, 2).ref();Term sub_169 = forceSub(sink.context(), sub_467, 1).ref();
        sub_169 = force(sink.context(), sub_169);
        if (sub_169.descriptor() != _M__sNil)
        {   break label_47;
        }
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M_IsDirectiveUnwrap); sink.copy(sub_230.ref());
        sink.end();sink.properties(safeRef(props_0));
        sink.start(_M_N1DirectiveConstructor); sink.copy(sub_230.ref());
        Variable var_35 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_35});
        VariableUse use_25 = sink.context().makeVariableUse(var_35);
        sink.substitute(term_98.ref(), new Variable[] { var_132 }, new Term[] {use_25});
        sink.end();sink.properties(safeRef(props_0));Term term_136;
        {
          BufferSink buf_58 = sink.context().makeBuffer(); buf_58.start(_M_OK); buf_58.end();
          term_136 = buf_58.term();
        }
        sink.substitute(term_98.ref(), new Variable[] { var_132 }, new Term[] {term_136});
        sink.end(); return true;
      }
      label_64: {
        term_3 = force(sink.context(), term_3);
        if (term_3.descriptor() != _M_Crsx_xdeclaration_xA5)
        {   break label_64;
        }Term sub_137 = forceSub(sink.context(), term_3, 0).ref();
        sub_137 = force(sink.context(), sub_137);
        if (sub_137.descriptor() != _M_Crsx_xdirective_xA1)
        {   break label_64;
        }Term sub_132 = forceSub(sink.context(), sub_137, 0).ref();
        /* #constructor=sub */Term sub_340 = forceSub(sink.context(), sub_137, 1).ref();
        sub_340 = force(sink.context(), sub_340);
        if (sub_340.descriptor() != _M__sCons)
        {   break label_64;
        }Term sub_133 = forceSub(sink.context(), sub_340, 0).ref();
        sub_133 = force(sink.context(), sub_133);
        if (sub_133.descriptor() != _M_Crsx_xdirectiveArguments)
        {   break label_64;
        }Term sub_296 = forceSub(sink.context(), sub_133, 0).ref();Term sub_394 = forceSub(sink.context(), sub_133, 1).ref();
        sub_394 = force(sink.context(), sub_394);
        if (sub_394.descriptor() != _M__sCons)
        {   break label_64;
        }Term sub_217 = forceSub(sink.context(), sub_394, 0).ref();
        sub_217 = force(sink.context(), sub_217);
        if (sub_217.descriptor() != _M_Crsx_xdirectives)
        {   break label_64;
        }Term sub_262 = forceSub(sink.context(), sub_217, 0).ref();
        sub_262 = force(sink.context(), sub_262);
        if (sub_262.descriptor() != _M_Crsx_xdirective_xA2)
        {   break label_64;
        }Term sub_178 = forceSub(sink.context(), sub_262, 0).ref();
        sub_178 = force(sink.context(), sub_178);
        if (sub_178.descriptor() != _M_Crsx_xdirectiveList)
        {   break label_64;
        }Term sub_96 = forceSub(sink.context(), sub_178, 0).ref();Term sub_263 = forceSub(sink.context(), sub_178, 1).ref();
        sub_263 = force(sink.context(), sub_263);
        if (sub_263.descriptor() != _M__sCons)
        {   break label_64;
        }Term sub_81 = forceSub(sink.context(), sub_263, 0).ref();
        /* #declarations=sub */Term sub_493 = forceSub(sink.context(), sub_263, 1).ref();
        sub_493 = force(sink.context(), sub_493);
        if (sub_493.descriptor() != _M__sNil)
        {   break label_64;
        }Term sub_291 = forceSub(sink.context(), sub_178, 2).ref();Term sub_553 = forceSub(sink.context(), sub_217, 1).ref();
        sub_553 = force(sink.context(), sub_553);
        if (sub_553.descriptor() != _M__sNil)
        {   break label_64;
        }Term sub_193 = forceSub(sink.context(), sub_394, 1).ref();
        sub_193 = force(sink.context(), sub_193);
        if (sub_193.descriptor() != _M__sNil)
        {   break label_64;
        }Term sub_336 = forceSub(sink.context(), sub_133, 2).ref();Term sub_274 = forceSub(sink.context(), sub_340, 1).ref();
        sub_274 = force(sink.context(), sub_274);
        if (sub_274.descriptor() != _M__sNil)
        {   break label_64;
        }
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M_IsDirectiveUnwrap); sink.copy(sub_132.ref());
        sink.end();sink.properties(safeRef(props_0));
        sink.start(_M_N1DirectiveConstructor); sink.copy(sub_132.ref());
        Variable var_92 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_92});
        VariableUse use_23 = sink.context().makeVariableUse(var_92);
        sink.substitute(term_98.ref(), new Variable[] { var_132 }, new Term[] {use_23});
        sink.end();sink.properties(safeRef(props_0));
        sink.start(_M_N1Declarations1); sink.start(_M_OK); sink.end();
        sink.start(_M_DesugarDeclarations); sink.copy(sub_81.ref());
        sink.end();
        Variable var_24 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_24});
        VariableUse use_46 = sink.context().makeVariableUse(var_24);
        sink.substitute(term_98.ref(), new Variable[] { var_132 }, new Term[] {use_46});
        sink.end();
        sink.end(); return true;
      }
      label_199: {
        term_3 = force(sink.context(), term_3);
        if (term_3.descriptor() != _M_Crsx_xdeclaration_xA5)
        {   break label_199;
        }Term sub_255 = forceSub(sink.context(), term_3, 0).ref();
        /* #directive=sub */
        /* #=term *//*Contract*/sink.properties(safeRef(props_0));
        sink.start(_M_N1Directive); sink.copy(sub_255.ref());
        Variable var_69 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_69});
        VariableUse use_145 = sink.context().makeVariableUse(var_69);
        sink.substitute(term_98.ref(), new Variable[] { var_132 }, new Term[] {use_145});
        sink.end(); return true;
      }
      label_1: {
        term_3 = force(sink.context(), term_3);
        if (term_3.descriptor() != _M_Crsx_xdeclaration_xA1)
        {   break label_1;
        }Term sub_103 = forceSub(sink.context(), term_3, 0).ref();
        sub_103 = force(sink.context(), sub_103);
        if (sub_103.descriptor() != _M_Crsx_xmoduleDeclaration)
        {   break label_1;
        }Term sub_213 = forceSub(sink.context(), sub_103, 0).ref();Term sub_479 = forceSub(sink.context(), sub_103, 1).ref();
        /* #CONSTRUCTOR=sub */Term sub_64 = forceSub(sink.context(), sub_103, 2).ref();Term sub_202 = forceSub(sink.context(), sub_103, 3).ref();
        /* #declarations=sub */Term sub_190 = forceSub(sink.context(), sub_103, 4).ref();
        /* #=term *//*Contract*/sink.properties(safeRef(props_0));
        sink.start(_M_N1Declarations);
        sink.start(_M_DesugarDeclarations); sink.copy(sub_202.ref());
        sink.end();
        Variable var_8 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_8});
        VariableUse use_45 = sink.context().makeVariableUse(var_8);
        sink.substitute(term_98.ref(), new Variable[] { var_132 }, new Term[] {use_45});
        sink.end(); return true;
      }
      label_469: {
        term_3 = force(sink.context(), term_3);
        if (term_3.descriptor() != _M_Crsx_xdeclaration_xA3)
        {   break label_469;
        }Term sub_280 = forceSub(sink.context(), term_3, 0).ref();
        sub_280 = force(sink.context(), sub_280);
        if (sub_280.descriptor() != _M_Crsx_xruleDeclaration)
        {   break label_469;
        }Term sub_459 = forceSub(sink.context(), sub_280, 0).ref();
        /* #option?=sub */Term sub_571 = forceSub(sink.context(), sub_280, 1).ref();
        sub_571 = force(sink.context(), sub_571);
        if (sub_571.descriptor() != _M_Crsx_xpattern)
        {   break label_469;
        }Term sub_123 = forceSub(sink.context(), sub_571, 0).ref();
        /* #properties?=sub */Term sub_446 = forceSub(sink.context(), sub_571, 1).ref();
        /* #constructor=sub */Term sub_167 = forceSub(sink.context(), sub_571, 2).ref();
        /* #arguments?=sub */Term sub_354 = forceSub(sink.context(), sub_280, 2).ref();Term sub_284 = forceSub(sink.context(), sub_280, 3).ref();
        /* #contractum=sub */
        /* #=term *//*Contract*/sink.properties(safeRef(props_0));
        sink.start(_M_AddRule); sink.start(_M_RulesKey); sink.copy(sub_446.ref()); sink.end();
        sink.start(_M_Crsx_xruleDeclaration); sink.copy(sub_459.ref());
        sink.start(_M_Crsx_xpattern); sink.copy(sub_123.ref()); sink.copy(sub_446.ref()); sink.copy(sub_167.ref());
        sink.end(); sink.literal("\u2192"); sink.copy(sub_284.ref());
        sink.end();
        Variable var_63 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_63});
        VariableUse use_0 = sink.context().makeVariableUse(var_63);
        sink.substitute(term_98.ref(), new Variable[] { var_132 }, new Term[] {use_0});
        sink.end(); return true;
      }
      label_52: {
        term_3 = force(sink.context(), term_3);
        if (term_3.descriptor() != _M_Crsx_xdeclaration_xA4)
        {   break label_52;
        }Term sub_362 = forceSub(sink.context(), term_3, 0).ref();
        sub_362 = force(sink.context(), sub_362);
        if (sub_362.descriptor() != _M_Crsx_xsortDeclaration_xA1)
        {   break label_52;
        }Term sub_215 = forceSub(sink.context(), sub_362, 0).ref();
        /* #sortparams?=sub */Term sub_629 = forceSub(sink.context(), sub_362, 1).ref();
        /* #sortset=sub */Term sub_427 = forceSub(sink.context(), sub_362, 2).ref();
        /* #sortname=sub */Term sub_170 = forceSub(sink.context(), sub_362, 3).ref();Term sub_568 = forceSub(sink.context(), sub_362, 4).ref();Term sub_311 = forceSub(sink.context(), sub_362, 5).ref();
        /* #forms=sub */Term sub_368 = forceSub(sink.context(), sub_362, 6).ref();
        /* #=term *//*Contract*/sink.properties(safeRef(props_0));
        sink.start(_M_AddDataSort);
        sink.start(_M_Crsx_xsortDeclaration_xA1); sink.copy(sub_215.ref()); sink.copy(sub_629.ref()); sink.copy(sub_427.ref()); sink.literal("::="); sink.literal("("); sink.copy(sub_311.ref()); sink.literal(")");
        sink.end();
        Variable var_1 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_1});
        VariableUse use_50 = sink.context().makeVariableUse(var_1);
        sink.substitute(term_98.ref(), new Variable[] { var_132 }, new Term[] {use_50});
        sink.end(); return true;
      }
      label_177: {
        term_3 = force(sink.context(), term_3);
        if (term_3.descriptor() != _M_Crsx_xdeclaration_xA4)
        {   break label_177;
        }Term sub_168 = forceSub(sink.context(), term_3, 0).ref();
        sub_168 = force(sink.context(), sub_168);
        if (sub_168.descriptor() != _M_Crsx_xsortDeclaration_xA2)
        {   break label_177;
        }Term sub_184 = forceSub(sink.context(), sub_168, 0).ref();
        /* #sortparams?=sub */Term sub_341 = forceSub(sink.context(), sub_168, 1).ref();
        /* #sortset=sub */Term sub_289 = forceSub(sink.context(), sub_168, 2).ref();
        sub_289 = force(sink.context(), sub_289);
        if (sub_289.descriptor() != _M_Crsx_xform_xA1)
        {   break label_177;
        }Term sub_528 = forceSub(sink.context(), sub_289, 0).ref();
        /* #constructor=sub */Term sub_240 = forceSub(sink.context(), sub_289, 1).ref();
        /* #arguments?=sub */Term sub_398 = forceSub(sink.context(), sub_168, 3).ref();Term sub_304 = forceSub(sink.context(), sub_168, 4).ref();
        /* #sortname=sub */
        /* #=term *//*Contract*/sink.properties(safeRef(props_0));
        sink.start(_M_AddFuncSort);
        sink.start(_M_Crsx_xsortDeclaration_xA2); sink.copy(sub_184.ref()); sink.copy(sub_341.ref());
        sink.start(_M_Crsx_xform_xA1); sink.copy(sub_528.ref()); sink.copy(sub_240.ref());
        sink.end(); sink.literal("::"); sink.copy(sub_304.ref());
        sink.end();
        Variable var_65 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_65});
        VariableUse use_24 = sink.context().makeVariableUse(var_65);
        sink.substitute(term_98.ref(), new Variable[] { var_132 }, new Term[] {use_24});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1Declaration, props_0, term_3, var_132, term_98);
  }   final public static boolean _M_N1Declarations1(Sink sink, int shared, int depth, Properties props_29, Term term_96, Term term_164, Variable var_0, Term term_182) {
    if (depth < 2000) {
      label_61: {
        term_96 = force(sink.context(), term_96);
        if (term_96.descriptor() != _M_OK)
        {   break label_61;
        }
        term_164 = force(sink.context(), term_164);
        if (term_164.descriptor() != _M__sNil)
        {   break label_61;
        }
        /* #=term *//*Contract*/sink.properties(safeRef(props_29));Term term_46;
        {
          BufferSink buf_22 = sink.context().makeBuffer(); buf_22.start(_M_OK); buf_22.end();
          term_46 = buf_22.term();
        }
        sink.substitute(term_182.ref(), new Variable[] { var_0 }, new Term[] {term_46}); return true;
      }
      label_131: {
        term_96 = force(sink.context(), term_96);
        if (term_96.descriptor() != _M_OK)
        {   break label_131;
        }
        term_164 = force(sink.context(), term_164);
        if (term_164.descriptor() != _M__sCons)
        {   break label_131;
        }Term sub_369 = forceSub(sink.context(), term_164, 0).ref();
        sub_369 = force(sink.context(), sub_369);
        if (sub_369.descriptor() != _M_Crsx_xdeclarations_xS1)
        {   break label_131;
        }Term sub_251 = forceSub(sink.context(), sub_369, 0).ref();Term sub_719 = forceSub(sink.context(), sub_369, 1).ref();
        sub_719 = force(sink.context(), sub_719);
        if (sub_719.descriptor() != _M__sNil)
        {   break label_131;
        }Term sub_463 = forceSub(sink.context(), term_164, 1).ref();
        sub_463 = force(sink.context(), sub_463);
        if (sub_463.descriptor() != _M__sNil)
        {   break label_131;
        }
        /* #=term *//*Contract*/sink.properties(safeRef(props_29));Term term_225;
        {
          BufferSink buf_46 = sink.context().makeBuffer(); buf_46.start(_M_OK); buf_46.end();
          term_225 = buf_46.term();
        }
        sink.substitute(term_182.ref(), new Variable[] { var_0 }, new Term[] {term_225}); return true;
      }
      label_19: {
        term_96 = force(sink.context(), term_96);
        if (term_96.descriptor() != _M_OK)
        {   break label_19;
        }
        term_164 = force(sink.context(), term_164);
        if (term_164.descriptor() != _M__sCons)
        {   break label_19;
        }Term sub_359 = forceSub(sink.context(), term_164, 0).ref();
        sub_359 = force(sink.context(), sub_359);
        if (sub_359.descriptor() != _M_Crsx_xdeclarations_xS1)
        {   break label_19;
        }Term sub_34 = forceSub(sink.context(), sub_359, 0).ref();Term sub_11 = forceSub(sink.context(), sub_359, 1).ref();
        sub_11 = force(sink.context(), sub_11);
        if (sub_11.descriptor() != _M__sCons)
        {   break label_19;
        }Term sub_104 = forceSub(sink.context(), sub_11, 0).ref();
        /* #declaration=sub */Term sub_207 = forceSub(sink.context(), sub_11, 1).ref();
        sub_207 = force(sink.context(), sub_207);
        if (sub_207.descriptor() != _M__sNil)
        {   break label_19;
        }Term sub_325 = forceSub(sink.context(), term_164, 1).ref();
        /* #declarations_S1*=sub */
        /* #=term *//*Contract*/sink.properties(safeRef(props_29));
        sink.start(_M_N1Declaration); sink.copy(sub_104.ref());
        Variable var_84 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_84});
        sink.start(_M_N1Declarations1); sink.use(var_84); sink.copy(sub_325.ref());
        Variable var_59 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_59});
        VariableUse use_82 = sink.context().makeVariableUse(var_59);
        sink.substitute(term_182.ref(), new Variable[] { var_0 }, new Term[] {use_82});
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1Declarations1, props_29, term_96, term_164, var_0, term_182);
  }    final public static boolean _M_N1Declarations(Sink sink, int shared, int depth, Properties props_31, Term term_25, Variable var_171, Term term_81) {
    if (depth < 2000) {
      label_85: {
        /* #declarations=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_31));
        sink.start(_M_N1Declarations1); sink.start(_M_OK); sink.end(); sink.copy(term_25.ref());
        Variable var_83 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_83});
        VariableUse use_13 = sink.context().makeVariableUse(var_83);
        sink.substitute(term_81.ref(), new Variable[] { var_171 }, new Term[] {use_13});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1Declarations, props_31, term_25, var_171, term_81);
  }   final public static boolean _M_N1DeclarationsInit(Sink sink, int shared, int depth, Term term_304, Term term_183, Variable var_72, Term term_5) {
    if (depth < 2000) {
      label_142: {
        /* #qualifier=term */
        /* #declarations=term */
        /* #=term *//*Contract*/Term term_78;
        {
          BufferSink buf_52 = sink.context().makeBuffer();
          buf_52.start(_M_STR); buf_52.copy(term_304.ref());
          buf_52.end();
          term_78 = buf_52.term();
        } sink.propertyNamed("$qualifier", term_78);Term term_100;
        {
          BufferSink buf_12 = sink.context().makeBuffer();
          buf_12.start(_M_KEYS); buf_12.start(_M__sNil); buf_12.end();
          buf_12.end();
          term_100 = buf_12.term();
        } sink.propertyNamed("$rulekeys", term_100);Term term_249;
        {
          BufferSink buf_99 = sink.context().makeBuffer();
          buf_99.start(_M_KEYS); buf_99.start(_M__sNil); buf_99.end();
          buf_99.end();
          term_249 = buf_99.term();
        } sink.propertyNamed("$datakeys", term_249);Term term_220;
        {
          BufferSink buf_170 = sink.context().makeBuffer();
          buf_170.start(_M_KEYS); buf_170.start(_M__sNil); buf_170.end();
          buf_170.end();
          term_220 = buf_170.term();
        } sink.propertyNamed("$funckeys", term_220);Term term_71;
        {
          BufferSink buf_66 = sink.context().makeBuffer();
          buf_66.start(_M_IMPORTS); buf_66.start(_M__sNil); buf_66.end();
          buf_66.end();
          term_71 = buf_66.term();
        } sink.propertyNamed("$imported", term_71);Term term_6;
        {
          BufferSink buf_20 = sink.context().makeBuffer();
          buf_20.start(_M_IMPORTS); buf_20.start(_M__sNil); buf_20.end();
          buf_20.end();
          term_6 = buf_20.term();
        } sink.propertyNamed("$grammars", term_6);
        sink.start(_M_N1Declarations); sink.copy(term_183.ref());
        Variable var_99 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_99});
        VariableUse use_35 = sink.context().makeVariableUse(var_99);
        sink.substitute(term_5.ref(), new Variable[] { var_72 }, new Term[] {use_35});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_N1DeclarationsInit, term_304, term_183, var_72, term_5);
  }    final public static boolean _M_NormalizeToState(Sink sink, int shared, int depth, Term term_244, Term term_393) {
    if (depth < 2000) {
      label_120: {
        /* #filename=term */
        term_393 = force(sink.context(), term_393);
        if (term_393.descriptor() != _M_Crsx_xcrsx)
        {   break label_120;
        }Term sub_406 = forceSub(sink.context(), term_393, 0).ref();
        /* #declarations=sub *//*Contract*/
        sink.start(_M_N1DeclarationsInit);
        sink.start(_M_BaseName); sink.copy(term_244.ref());
        sink.end();
        sink.start(_M_DesugarDeclarations); sink.copy(sub_406.ref());
        sink.end();
        Variable var_93 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_93});
        sink.start(_M_N2); sink.use(var_93);
        Variable var_44 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_44}); sink.start(_M_LOADED); sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeToState, term_244, term_393);
  }  final public static boolean _M_NormalizeToCrsx(Sink sink, int shared, int depth, Term term_84, Term term_91) {
    if (depth < 2000) {
      label_238: {
        /* #filename=term */
        term_91 = force(sink.context(), term_91);
        if (term_91.descriptor() != _M_Crsx_xcrsx)
        {   break label_238;
        }Term sub_265 = forceSub(sink.context(), term_91, 0).ref();
        /* #declarations=sub *//*Contract*/
        sink.start(_M_N1DeclarationsInit); sink.start(_M_BaseName); sink.copy(term_84.ref()); sink.end();
        sink.start(_M_DesugarDeclarations); sink.copy(sub_265.ref());
        sink.end();
        Variable var_12 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_12});
        sink.start(_M_N2); sink.use(var_12);
        Variable var_53 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_53}); sink.start(_M_OutputCrsx); sink.use(var_53); sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeToCrsx, term_84, term_91);
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