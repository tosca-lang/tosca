/* START MODULE /Users/villardl/Projects/crsx/crsx4/src/crsxutils.crs.java */
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
import static org.crsx.compiler.std.Core.*;
import static org.crsx.compiler.std.Num.*;
import static org.crsx.compiler.std.String.*; import static org.crsx.compiler.std.List.*;

public class Crsxutils
{
  final public static ConstructionDescriptor _M_ANNOTATIONS = makeData("ANNOTATIONS");
  final public static DynamicFunctionDescriptor _M_DesugarPropertyList = makeFunction("DesugarPropertyList", Crsxutils.class, "_M_DesugarPropertyList");
  final public static DynamicFunctionDescriptor _M_DesugarDispatchCases = makeFunction("DesugarDispatchCases", Crsxutils.class, "_M_DesugarDispatchCases");
  final public static DynamicFunctionDescriptor _M_DesugarListTermList = makeFunction("DesugarListTermList", Crsxutils.class, "_M_DesugarListTermList");
  final public static DynamicFunctionDescriptor _M_DesugarList = makeFunction("DesugarList", Crsxutils.class, "_M_DesugarList");
  final public static DynamicFunctionDescriptor _M_DesugarFreeTermList = makeFunction("DesugarFreeTermList", Crsxutils.class, "_M_DesugarFreeTermList");
  final public static DynamicFunctionDescriptor _M_DesugarTermList = makeFunction("DesugarTermList", Crsxutils.class, "_M_DesugarTermList");
  final public static DynamicFunctionDescriptor _M_DesugarFreeTerms = makeFunction("DesugarFreeTerms", Crsxutils.class, "_M_DesugarFreeTerms");
  final public static DynamicFunctionDescriptor _M_DesugarTerms = makeFunction("DesugarTerms", Crsxutils.class, "_M_DesugarTerms");
  final public static DynamicFunctionDescriptor _M_DesugarDeclarations = makeFunction("DesugarDeclarations", Crsxutils.class, "_M_DesugarDeclarations");
  final public static DynamicFunctionDescriptor _M_SugarPropertyList = makeFunction("SugarPropertyList", Crsxutils.class, "_M_SugarPropertyList");
  final public static DynamicFunctionDescriptor _M_SugarDispatchCases = makeFunction("SugarDispatchCases", Crsxutils.class, "_M_SugarDispatchCases");
  final public static DynamicFunctionDescriptor _M_SugarFreeTerms = makeFunction("SugarFreeTerms", Crsxutils.class, "_M_SugarFreeTerms");
  final public static DynamicFunctionDescriptor _M_SugarTerms = makeFunction("SugarTerms", Crsxutils.class, "_M_SugarTerms");
  final public static DynamicFunctionDescriptor _M_SugarTermsOpt = makeFunction("SugarTermsOpt", Crsxutils.class, "_M_SugarTermsOpt");
  final public static DynamicFunctionDescriptor _M_IndexAnnotation = makeFunction("IndexAnnotation", Crsxutils.class, "_M_IndexAnnotation");
  final public static DynamicFunctionDescriptor _M_Then = makeFunction("Then", Crsxutils.class, "_M_Then");
  final public static DynamicFunctionDescriptor _M_IndexAnnotations = makeFunction("IndexAnnotations", Crsxutils.class, "_M_IndexAnnotations");
  final public static DynamicFunctionDescriptor _M_AllMetaTerms_xS1_xZOM = makeFunction("AllMetaTerms_S1_ZOM", Crsxutils.class, "_M_AllMetaTerms_xS1_xZOM");
  final public static DynamicFunctionDescriptor _M_AllMetaTerms = makeFunction("AllMetaTerms", Crsxutils.class, "_M_AllMetaTerms");
  final public static DynamicFunctionDescriptor _M_AllMetaArgumentsOpt = makeFunction("AllMetaArgumentsOpt", Crsxutils.class, "_M_AllMetaArgumentsOpt");
  final public static DynamicFunctionDescriptor _M_AllMetaInPatternRule = makeFunction("AllMetaInPatternRule", Crsxutils.class, "_M_AllMetaInPatternRule");
  final public static DynamicFunctionDescriptor _M_IsPrimitive = makeFunction("IsPrimitive", Crsxutils.class, "_M_IsPrimitive");
  final public static DynamicFunctionDescriptor _M_IsDirectiveUnwrap = makeFunction("IsDirectiveUnwrap", Crsxutils.class, "_M_IsDirectiveUnwrap");
  final public static DynamicFunctionDescriptor _M_IsDirective = makeFunction("IsDirective", Crsxutils.class, "_M_IsDirective");
  final public static DynamicFunctionDescriptor _M_ArityTerms_xS1_xZOM = makeFunction("ArityTerms_S1_ZOM", Crsxutils.class, "_M_ArityTerms_xS1_xZOM");
  final public static DynamicFunctionDescriptor _M_ArityTerms = makeFunction("ArityTerms", Crsxutils.class, "_M_ArityTerms");
  final public static DynamicFunctionDescriptor _M_ArityArguments = makeFunction("ArityArguments", Crsxutils.class, "_M_ArityArguments");
  final public static DynamicFunctionDescriptor _M_ArityArgumentsOpt = makeFunction("ArityArgumentsOpt", Crsxutils.class, "_M_ArityArgumentsOpt");final public static boolean _M_DesugarPropertyList(Sink sink, int shared, int depth, Term term) {
    if (depth < 2000) {
      label: {
        if (term.descriptor() != _M_Crsx_xpropertyList)
        {   break label;
        }Term sub = term.sub(0).ref();
        /* #property=sub */Term sub_56 = term.sub(1).ref();
        /* #propertyList_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xpropertyList_xS1); sink.literal(";");
        sink.start(_M__sCons); sink.copy(sub.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.copy(sub_56.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarPropertyList, term);
  } final public static boolean _M_DesugarDispatchCases(Sink sink, int shared, int depth, Term term_68) {
    if (depth < 2000) {
      label_27: {
        if (term_68.descriptor() != _M_Crsx_xdispatchCases)
        {   break label_27;
        }Term sub_13 = term_68.sub(0).ref();
        /* #dispatchCase=sub */Term sub_79 = term_68.sub(1).ref();
        /* #dispatchCases_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdispatchCases_xS1); sink.literal(";"); sink.copy(sub_13.ref());
        sink.end(); sink.copy(sub_79.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarDispatchCases, term_68);
  } final public static boolean _M_DesugarListTermList(Sink sink, int shared, int depth, Term term_0) {
    if (depth < 2000) {
      label_35: {
        if (term_0.descriptor() != _M__sNil)
        {   break label_35;
        }/*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
      label_52: {
        if (term_0.descriptor() != _M__sCons)
        {   break label_52;
        }Term sub_0 = term_0.sub(0).ref();
        if (sub_0.descriptor() != _M_Crsx_xtermList_xS1)
        {   break label_52;
        }Term sub_72 = sub_0.sub(0).ref();Term sub_18 = sub_0.sub(1).ref();
        if (sub_18.descriptor() != _M__sNil)
        {   break label_52;
        }Term sub_63 = term_0.sub(1).ref();
        if (sub_63.descriptor() != _M__sNil)
        {   break label_52;
        }/*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
      label_36: {
        if (term_0.descriptor() != _M__sCons)
        {   break label_36;
        }Term sub_36 = term_0.sub(0).ref();
        if (sub_36.descriptor() != _M_Crsx_xtermList_xS1)
        {   break label_36;
        }Term sub_23 = sub_36.sub(0).ref();Term sub_66 = sub_36.sub(1).ref();
        if (sub_66.descriptor() != _M__sCons)
        {   break label_36;
        }Term sub_62 = sub_66.sub(0).ref();
        if (sub_62.descriptor() != _M_Crsx_xterm_xA1)
        {   break label_36;
        }Term sub_98 = sub_62.sub(0).ref();
        /* #freeTerm=sub */Term sub_75 = sub_66.sub(1).ref();
        if (sub_75.descriptor() != _M__sNil)
        {   break label_36;
        }Term sub_88 = term_0.sub(1).ref();
        if (sub_88.descriptor() != _M__sNil)
        {   break label_36;
        }/*Contract*/ sink.copy(sub_98.ref()); return true;
      }
      label_28: {
        if (term_0.descriptor() != _M__sCons)
        {   break label_28;
        }Term sub_32 = term_0.sub(0).ref();
        if (sub_32.descriptor() != _M_Crsx_xtermList_xS1)
        {   break label_28;
        }Term sub_78 = sub_32.sub(0).ref();Term sub_65 = sub_32.sub(1).ref();
        if (sub_65.descriptor() != _M__sCons)
        {   break label_28;
        }Term sub_24 = sub_65.sub(0).ref();
        /* #term=sub */Term sub_95 = sub_65.sub(1).ref();
        if (sub_95.descriptor() != _M__sNil)
        {   break label_28;
        }Term sub_110 = term_0.sub(1).ref();
        if (sub_110.descriptor() != _M__sCons)
        {   break label_28;
        }Term sub_46 = sub_110.sub(0).ref();
        if (sub_46.descriptor() != _M_Crsx_xtermList_xS1)
        {   break label_28;
        }Term sub_26 = sub_46.sub(0).ref();Term sub_74 = sub_46.sub(1).ref();
        if (sub_74.descriptor() != _M__sNil)
        {   break label_28;
        }Term sub_17 = sub_110.sub(1).ref();
        if (sub_17.descriptor() != _M__sNil)
        {   break label_28;
        }/*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.literal("$Cons");
        sink.end();
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms); sink.copy(sub_24.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms_xS1); sink.literal(",");
        sink.start(_M_Crsx_xterm_xA1);
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_49: {
        if (term_0.descriptor() != _M__sCons)
        {   break label_49;
        }Term sub_40 = term_0.sub(0).ref();
        if (sub_40.descriptor() != _M_Crsx_xtermList_xS1)
        {   break label_49;
        }Term sub_76 = sub_40.sub(0).ref();Term sub_84 = sub_40.sub(1).ref();
        if (sub_84.descriptor() != _M__sCons)
        {   break label_49;
        }Term sub_99 = sub_84.sub(0).ref();
        /* #term=sub */Term sub_1 = sub_84.sub(1).ref();
        if (sub_1.descriptor() != _M__sNil)
        {   break label_49;
        }Term sub_45 = term_0.sub(1).ref();
        if (sub_45.descriptor() != _M__sCons)
        {   break label_49;
        }Term sub_30 = sub_45.sub(0).ref();
        if (sub_30.descriptor() != _M_Crsx_xtermList_xS1)
        {   break label_49;
        }Term sub_55 = sub_30.sub(0).ref();Term sub_77 = sub_30.sub(1).ref();
        if (sub_77.descriptor() != _M__sCons)
        {   break label_49;
        }Term sub_47 = sub_77.sub(0).ref();
        /* #term2=sub */Term sub_9 = sub_77.sub(1).ref();
        if (sub_9.descriptor() != _M__sNil)
        {   break label_49;
        }Term sub_180 = sub_45.sub(1).ref();
        /* #termList_S1*=sub *//*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.literal("$Cons");
        sink.end();
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms); sink.copy(sub_99.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms_xS1); sink.literal(",");
        sink.start(_M_Crsx_xterm_xA1);
        sink.start(_M_DesugarListTermList);
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xtermList_xS1); sink.literal(";");
        sink.start(_M__sCons); sink.copy(sub_47.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.copy(sub_180.ref());
        sink.end();
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.literal("]");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarListTermList, term_0);
  } final public static boolean _M_DesugarList(Sink sink, int shared, int depth, Term term_22) {
    if (depth < 2000) {
      label_44: {
        if (term_22.descriptor() != _M_Crsx_xlist)
        {   break label_44;
        }Term sub_3 = term_22.sub(0).ref();Term sub_33 = term_22.sub(1).ref();
        if (sub_33.descriptor() != _M__sNil)
        {   break label_44;
        }Term sub_37 = term_22.sub(2).ref();/*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
      label_19: {
        if (term_22.descriptor() != _M_Crsx_xlist)
        {   break label_19;
        }Term sub_5 = term_22.sub(0).ref();Term sub_102 = term_22.sub(1).ref();
        if (sub_102.descriptor() != _M__sCons)
        {   break label_19;
        }Term sub_35 = sub_102.sub(0).ref();
        /* #termList=sub */Term sub_19 = sub_102.sub(1).ref();
        if (sub_19.descriptor() != _M__sNil)
        {   break label_19;
        }Term sub_165 = term_22.sub(2).ref();/*Contract*/
        sink.start(_M_DesugarListTermList);
        sink.start(_M_DesugarTermList); sink.copy(sub_35.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarList, term_22);
  } final public static boolean _M_DesugarFreeTermList(Sink sink, int shared, int depth, Term term_46) {
    if (depth < 2000) {
      label_90: {
        if (term_46.descriptor() != _M_Crsx_xfreeTerm_xA4)
        {   break label_90;
        }Term sub_58 = term_46.sub(0).ref();
        /* #annotations?=sub */Term sub_25 = term_46.sub(1).ref();
        if (sub_25.descriptor() != _M_Crsx_xlist)
        {   break label_90;
        }Term sub_81 = sub_25.sub(0).ref();Term sub_86 = sub_25.sub(1).ref();
        if (sub_86.descriptor() != _M__sNil)
        {   break label_90;
        }Term sub_60 = sub_25.sub(2).ref();/*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.copy(sub_58.ref()); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
      label_51: {
        if (term_46.descriptor() != _M_Crsx_xfreeTerm_xA4)
        {   break label_51;
        }Term sub_59 = term_46.sub(0).ref();
        /* #annotations?=sub */Term sub_93 = term_46.sub(1).ref();
        if (sub_93.descriptor() != _M_Crsx_xlist)
        {   break label_51;
        }Term sub_8 = sub_93.sub(0).ref();Term sub_69 = sub_93.sub(1).ref();
        if (sub_69.descriptor() != _M__sCons)
        {   break label_51;
        }Term sub_174 = sub_69.sub(0).ref();
        /* #termList=sub */Term sub_111 = sub_69.sub(1).ref();
        if (sub_111.descriptor() != _M__sNil)
        {   break label_51;
        }Term sub_49 = sub_93.sub(2).ref();/*Contract*/
        sink.start(_M_DesugarListTermList);
        sink.start(_M_DesugarTermList); sink.copy(sub_174.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarFreeTermList, term_46);
  } final public static boolean _M_DesugarTermList(Sink sink, int shared, int depth, Term term_94) {
    if (depth < 2000) {
      label_40: {
        if (term_94.descriptor() != _M_Crsx_xtermList)
        {   break label_40;
        }Term sub_182 = term_94.sub(0).ref();
        /* #term=sub */Term sub_54 = term_94.sub(1).ref();
        /* #termList_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xtermList_xS1); sink.literal(";");
        sink.start(_M__sCons); sink.copy(sub_182.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.copy(sub_54.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarTermList, term_94);
  } final public static boolean _M_DesugarFreeTerms(Sink sink, int shared, int depth, Term term_35) {
    if (depth < 2000) {
      label_45: {
        if (term_35.descriptor() != _M_Crsx_xfreeTerms)
        {   break label_45;
        }Term sub_96 = term_35.sub(0).ref();
        /* #freeTerm=sub */Term sub_131 = term_35.sub(1).ref();
        /* #freeTerms_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeTerms_xS1); sink.literal(","); sink.copy(sub_96.ref());
        sink.end(); sink.copy(sub_131.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarFreeTerms, term_35);
  } final public static boolean _M_DesugarTerms(Sink sink, int shared, int depth, Term term_93) {
    if (depth < 2000) {
      label_86: {
        if (term_93.descriptor() != _M_Crsx_xterms)
        {   break label_86;
        }Term sub_15 = term_93.sub(0).ref();
        /* #term=sub */Term sub_248 = term_93.sub(1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms_xS1); sink.literal(","); sink.copy(sub_15.ref());
        sink.end(); sink.copy(sub_248.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarTerms, term_93);
  } final public static boolean _M_DesugarDeclarations(Sink sink, int shared, int depth, Term term_25) {
    if (depth < 2000) {
      label_15: {
        if (term_25.descriptor() != _M_Crsx_xdeclarations)
        {   break label_15;
        }Term sub_173 = term_25.sub(0).ref();
        /* #declaration=sub */Term sub_7 = term_25.sub(1).ref();
        /* #declarations_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
        sink.start(_M__sCons); sink.copy(sub_173.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.copy(sub_7.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarDeclarations, term_25);
  } final public static boolean _M_SugarPropertyList(Sink sink, int shared, int depth, Term term_81) {
    if (depth < 2000) {
      label_30: {
        if (term_81.descriptor() != _M__sNil)
        {   break label_30;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Internal error: cannot rewrite an empty list of properties.");
        sink.end(); return true;
      }
      label_5: {
        if (term_81.descriptor() != _M__sCons)
        {   break label_5;
        }Term sub_158 = term_81.sub(0).ref();
        if (sub_158.descriptor() != _M_Crsx_xpropertyList_xS1)
        {   break label_5;
        }Term sub_177 = sub_158.sub(0).ref();Term sub_82 = sub_158.sub(1).ref();
        if (sub_82.descriptor() != _M__sCons)
        {   break label_5;
        }Term sub_170 = sub_82.sub(0).ref();
        /* #property=sub */Term sub_80 = sub_82.sub(1).ref();
        if (sub_80.descriptor() != _M__sNil)
        {   break label_5;
        }Term sub_6 = term_81.sub(1).ref();
        /* #propertyList_S1*=sub *//*Contract*/
        sink.start(_M_Crsx_xpropertyList); sink.copy(sub_170.ref()); sink.copy(sub_6.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_SugarPropertyList, term_81);
  } final public static boolean _M_SugarDispatchCases(Sink sink, int shared, int depth, Term term_61) {
    if (depth < 2000) {
      label_96: {
        if (term_61.descriptor() != _M__sNil)
        {   break label_96;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Assertion error: at least one dispatch case must be defined.");
        sink.end(); return true;
      }
      label_56: {
        if (term_61.descriptor() != _M__sCons)
        {   break label_56;
        }Term sub_29 = term_61.sub(0).ref();
        if (sub_29.descriptor() != _M_Crsx_xdispatchCases_xS1)
        {   break label_56;
        }Term sub_53 = sub_29.sub(0).ref();Term sub_148 = sub_29.sub(1).ref();
        /* #dispatchCase=sub */Term sub_155 = term_61.sub(1).ref();
        /* #dispatchCases_S1*=sub *//*Contract*/
        sink.start(_M_Crsx_xdispatchCases); sink.copy(sub_148.ref()); sink.copy(sub_155.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_SugarDispatchCases, term_61);
  } final public static boolean _M_SugarFreeTerms(Sink sink, int shared, int depth, Term term_188) {
    if (depth < 2000) {
      label_75: {
        if (term_188.descriptor() != _M__sNil)
        {   break label_75;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Internal error: cannot rewrite an empty list of terms to term");
        sink.end(); return true;
      }
      label_1: {
        if (term_188.descriptor() != _M__sCons)
        {   break label_1;
        }Term sub_217 = term_188.sub(0).ref();
        if (sub_217.descriptor() != _M_Crsx_xfreeTerms_xS1)
        {   break label_1;
        }Term sub_492 = sub_217.sub(0).ref();Term sub_10 = sub_217.sub(1).ref();
        /* #freeTerm=sub */Term sub_151 = term_188.sub(1).ref();
        /* #freeTerms_S1*=sub *//*Contract*/
        sink.start(_M_Crsx_xfreeTerms); sink.copy(sub_10.ref()); sink.copy(sub_151.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_SugarFreeTerms, term_188);
  } final public static boolean _M_SugarTerms(Sink sink, int shared, int depth, Term term_1) {
    if (depth < 2000) {
      label_17: {
        if (term_1.descriptor() != _M__sNil)
        {   break label_17;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Internal error: cannot rewrite an empty list of terms to term");
        sink.end(); return true;
      }
      label_105: {
        if (term_1.descriptor() != _M__sCons)
        {   break label_105;
        }Term sub_91 = term_1.sub(0).ref();
        if (sub_91.descriptor() != _M_Crsx_xterms_xS1)
        {   break label_105;
        }Term sub_42 = sub_91.sub(0).ref();Term sub_28 = sub_91.sub(1).ref();
        /* #term=sub */Term sub_14 = term_1.sub(1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M_Crsx_xterms); sink.copy(sub_28.ref()); sink.copy(sub_14.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_SugarTerms, term_1);
  } final public static boolean _M_SugarTermsOpt(Sink sink, int shared, int depth, Term term_77) {
    if (depth < 2000) {
      label_171: {
        if (term_77.descriptor() != _M__sNil)
        {   break label_171;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_84: {
        if (term_77.descriptor() != _M__sCons)
        {   break label_84;
        }Term sub_97 = term_77.sub(0).ref();
        if (sub_97.descriptor() != _M_Crsx_xterms_xS1)
        {   break label_84;
        }Term sub_287 = sub_97.sub(0).ref();Term sub_20 = sub_97.sub(1).ref();
        /* #term=sub */Term sub_140 = term_77.sub(1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms); sink.copy(sub_20.ref()); sink.copy(sub_140.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_SugarTermsOpt, term_77);
  } final public static boolean _M_IndexAnnotation(Sink sink, int shared, int depth, Properties props, Term term_78, Term term_29) {
    if (depth < 2000) {
      label_69: {
        if (term_78.descriptor() != _M_Crsx_xannotation)
        {   break label_69;
        }Term sub_125 = term_78.sub(0).ref();Term sub_156 = term_78.sub(1).ref();
        if (sub_156.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_69;
        }Term sub_147 = sub_156.sub(0).ref();
        if (sub_147.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_69;
        }Term sub_67 = sub_156.sub(1).ref();
        /* #CONSTRUCTOR=sub */Term sub_235 = term_78.sub(2).ref();
        /* #arguments?=sub */
        if (term_29.descriptor() != _M_CONTINUATION)
        {   break label_69;
        }Term sub_104 = term_29.sub(0).ref();
        Variable binder = term_29.binders(0)[0];
        /* #=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sTrace); sink.end();sink.properties(safeRef(props));Term term_43;
        {
          BufferSink buf = sink.context().makeBuffer(); buf.copy(sub_235.ref());
          term_43 = buf.term();
        }
        sub_67 = force(sink.context(), sub_67);
        Sink.property(sink, sub_67, term_43);Term term_64;
        {
          BufferSink buf_69 = sink.context().makeBuffer(); buf_69.start(_M_OK); buf_69.end();
          term_64 = buf_69.term();
        }
        sink.substitute(sub_104.ref(), new Variable[] { binder }, new Term[] {term_64});
        sink.end(); return true; 
      }
    }
    return thunk(sink, _M_IndexAnnotation, props, term_78, term_29);
  }  final public static boolean _M_Then(Sink sink, int shared, int depth, Properties props_85, Term term_75) {
    if (depth < 2000) {
      label_6: {
        if (term_75.descriptor() != _M_OK)
        {   break label_6;
        }/*Contract*/sink.properties(safeRef(props_85));
        sink.start(_M_ANNOTATIONS);
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Then, props_85, term_75);
  } final public static boolean _M_IndexAnnotations(Sink sink, int shared, int depth, Term term_67) {
    if (depth < 2000) {
      label_198: {
        if (term_67.descriptor() != _M__sNil)
        {   break label_198;
        }/*Contract*/ sink.start(_M_ANNOTATIONS); sink.end(); return true;
      }
      label_88: {
        if (term_67.descriptor() != _M__sCons)
        {   break label_88;
        }Term sub_73 = term_67.sub(0).ref();
        if (sub_73.descriptor() != _M_Crsx_xannotations)
        {   break label_88;
        }Term sub_199 = sub_73.sub(0).ref();
        /* #annotation+=sub */Term sub_70 = term_67.sub(1).ref();
        if (sub_70.descriptor() != _M__sNil)
        {   break label_88;
        }/*Contract*/
        sink.start(_M_SeqMap);
        Variable var = sink.context().makeVariable("anno");
        Variable var_43 = sink.context().makeVariable("cont");
        sink.binds(new Variable[] {var,var_43});
        sink.start(_M_IndexAnnotation); sink.use(var); sink.use(var_43);
        sink.end(); sink.copy(sub_199.ref());
        Variable var_59 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_59}); sink.start(_M_Then); sink.use(var_59); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_IndexAnnotations, term_67);
  } final public static boolean _M_AllMetaTerms_xS1_xZOM(Sink sink, int shared, int depth, Term term_36) {
    if (depth < 2000) {
      label_47: {
        if (term_36.descriptor() != _M__sNil)
        {   break label_47;
        }/*Contract*/ sink.start(_M_TRUE); sink.end(); return true;
      }
      label_34: {
        if (term_36.descriptor() != _M__sCons)
        {   break label_34;
        }Term sub_200 = term_36.sub(0).ref();
        if (sub_200.descriptor() != _M_Crsx_xterms_xS1)
        {   break label_34;
        }Term sub_160 = sub_200.sub(0).ref();Term sub_154 = sub_200.sub(1).ref();
        if (sub_154.descriptor() != _M_Crsx_xterm_xA1)
        {   break label_34;
        }Term sub_48 = sub_154.sub(0).ref();
        if (sub_48.descriptor() != _M_Crsx_xfreeTerm_xA7)
        {   break label_34;
        }Term sub_94 = sub_48.sub(0).ref();
        if (sub_94.descriptor() != _M__sNil)
        {   break label_34;
        }Term sub_258 = sub_48.sub(1).ref();
        if (sub_258.descriptor() != _M__sNil)
        {   break label_34;
        }Term sub_68 = sub_48.sub(2).ref();
        /* #METAVAR=sub */Term sub_172 = sub_48.sub(3).ref();
        if (sub_172.descriptor() != _M__sNil)
        {   break label_34;
        }Term sub_109 = term_36.sub(1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M_AllMetaTerms_xS1_xZOM); sink.copy(sub_109.ref());
        sink.end(); return true;
      }
      label_14: {
        /* #terms_S1_ZOM=term *//*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_AllMetaTerms_xS1_xZOM, term_36);
  } final public static boolean _M_AllMetaTerms(Sink sink, int shared, int depth, Term term_32) {
    if (depth < 2000) {
      label_50: {
        if (term_32.descriptor() != _M_Crsx_xterms)
        {   break label_50;
        }Term sub_38 = term_32.sub(0).ref();
        if (sub_38.descriptor() != _M_Crsx_xterm_xA1)
        {   break label_50;
        }Term sub_61 = sub_38.sub(0).ref();
        if (sub_61.descriptor() != _M_Crsx_xfreeTerm_xA7)
        {   break label_50;
        }Term sub_115 = sub_61.sub(0).ref();
        if (sub_115.descriptor() != _M__sNil)
        {   break label_50;
        }Term sub_223 = sub_61.sub(1).ref();
        if (sub_223.descriptor() != _M__sNil)
        {   break label_50;
        }Term sub_119 = sub_61.sub(2).ref();
        /* #METAVAR=sub */Term sub_136 = sub_61.sub(3).ref();
        if (sub_136.descriptor() != _M__sNil)
        {   break label_50;
        }Term sub_2 = term_32.sub(1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M_AllMetaTerms_xS1_xZOM); sink.copy(sub_2.ref());
        sink.end(); return true;
      }
      label_71: {
        /* #terms=term *//*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_AllMetaTerms, term_32);
  } final public static boolean _M_AllMetaArgumentsOpt(Sink sink, int shared, int depth, Term term_28) {
    if (depth < 2000) {
      label_21: {
        if (term_28.descriptor() != _M__sNil)
        {   break label_21;
        }/*Contract*/ sink.start(_M_TRUE); sink.end(); return true;
      }
      label_32: {
        if (term_28.descriptor() != _M__sCons)
        {   break label_32;
        }Term sub_90 = term_28.sub(0).ref();
        if (sub_90.descriptor() != _M_Crsx_xarguments)
        {   break label_32;
        }Term sub_197 = sub_90.sub(0).ref();Term sub_209 = sub_90.sub(1).ref();
        if (sub_209.descriptor() != _M__sNil)
        {   break label_32;
        }Term sub_106 = sub_90.sub(2).ref();Term sub_144 = term_28.sub(1).ref();
        if (sub_144.descriptor() != _M__sNil)
        {   break label_32;
        }/*Contract*/ sink.start(_M_TRUE); sink.end(); return true;
      }
      label_126: {
        if (term_28.descriptor() != _M__sCons)
        {   break label_126;
        }Term sub_4 = term_28.sub(0).ref();
        if (sub_4.descriptor() != _M_Crsx_xarguments)
        {   break label_126;
        }Term sub_85 = sub_4.sub(0).ref();Term sub_211 = sub_4.sub(1).ref();
        if (sub_211.descriptor() != _M__sCons)
        {   break label_126;
        }Term sub_453 = sub_211.sub(0).ref();
        /* #terms=sub */Term sub_187 = sub_211.sub(1).ref();
        if (sub_187.descriptor() != _M__sNil)
        {   break label_126;
        }Term sub_27 = sub_4.sub(2).ref();Term sub_11 = term_28.sub(1).ref();
        if (sub_11.descriptor() != _M__sNil)
        {   break label_126;
        }/*Contract*/
        sink.start(_M_AllMetaTerms); sink.copy(sub_453.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AllMetaArgumentsOpt, term_28);
  } final public static boolean _M_AllMetaInPatternRule(Sink sink, int shared, int depth, Term term_133) {
    if (depth < 2000) {
      label_95: {
        if (term_133.descriptor() != _M_Crsx_xruleDeclaration)
        {   break label_95;
        }Term sub_16 = term_133.sub(0).ref();
        /* #option?=sub */Term sub_34 = term_133.sub(1).ref();
        if (sub_34.descriptor() != _M_Crsx_xpattern)
        {   break label_95;
        }Term sub_245 = sub_34.sub(0).ref();
        /* #properties?=sub */Term sub_43 = sub_34.sub(1).ref();
        /* #constructor=sub */Term sub_402 = sub_34.sub(2).ref();
        /* #arguments?=sub */Term sub_39 = term_133.sub(2).ref();Term sub_127 = term_133.sub(3).ref();
        /* #contractum=sub *//*Contract*/
        sink.start(_M_AllMetaArgumentsOpt); sink.copy(sub_402.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AllMetaInPatternRule, term_133);
  } final public static boolean _M_IsPrimitive(Sink sink, int shared, int depth, Term term_37) {
    if (depth < 2000) {
      label_83: {
        if (term_37.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_83;
        }Term sub_103 = term_37.sub(0).ref();
        if (sub_103.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_83;
        }Term sub_194 = term_37.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M_StringEqual); sink.copy(sub_194.ref()); sink.literal("$");
        sink.end(); return true;
      }
      label_203: {
        if (term_37.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_203;
        }Term sub_185 = term_37.sub(0).ref();
        if (sub_185.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_203;
        }Term sub_44 = sub_185.sub(0).ref();/*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_IsPrimitive, term_37);
  } final public static boolean _M_IsDirectiveUnwrap(Sink sink, int shared, int depth, Term term_51) {
    if (depth < 2000) {
      label_285: {
        if (term_51.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_285;
        }Term sub_395 = term_51.sub(0).ref();
        if (sub_395.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_285;
        }Term sub_41 = term_51.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sStartsWith); sink.end(); sink.copy(sub_41.ref()); sink.literal("$");
        sink.end(); return true;
      }
      label_80: {
        if (term_51.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_80;
        }Term sub_159 = term_51.sub(0).ref();
        if (sub_159.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_80;
        }Term sub_57 = sub_159.sub(0).ref();/*Contract*/ sink.start(_M__sFalse); sink.end(); return true;
      }
    }
    return thunk(sink, _M_IsDirectiveUnwrap, term_51);
  } final public static boolean _M_IsDirective(Sink sink, int shared, int depth, Term term_56) {
    if (depth < 2000) {
      label_63: {
        if (term_56.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_63;
        }Term sub_118 = term_56.sub(0).ref();
        if (sub_118.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_63;
        }Term sub_273 = term_56.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M_StartsWith); sink.copy(sub_273.ref()); sink.literal("$");
        sink.end(); return true;
      }
      label_81: {
        if (term_56.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_81;
        }Term sub_215 = term_56.sub(0).ref();
        if (sub_215.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_81;
        }Term sub_237 = sub_215.sub(0).ref();/*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_IsDirective, term_56);
  } final public static boolean _M_ArityTerms_xS1_xZOM(Sink sink, int shared, int depth, Term term_31) {
    if (depth < 2000) {
      label_62: {
        if (term_31.descriptor() != _M__sNil)
        {   break label_62;
        }/*Contract*/ sink.literal(0); return true;
      }
      label_72: {
        if (term_31.descriptor() != _M__sCons)
        {   break label_72;
        }Term sub_175 = term_31.sub(0).ref();
        if (sub_175.descriptor() != _M_Crsx_xterms_xS1)
        {   break label_72;
        }Term sub_311 = sub_175.sub(0).ref();Term sub_230 = sub_175.sub(1).ref();
        /* #term=sub */Term sub_117 = term_31.sub(1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M_NumberPlus); sink.literal(1);
        sink.start(_M_ArityTerms_xS1_xZOM); sink.copy(sub_117.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ArityTerms_xS1_xZOM, term_31);
  } final public static boolean _M_ArityTerms(Sink sink, int shared, int depth, Term term_176) {
    if (depth < 2000) {
      label_157: {
        if (term_176.descriptor() != _M_Crsx_xterms)
        {   break label_157;
        }Term sub_224 = term_176.sub(0).ref();
        /* #term=sub */Term sub_12 = term_176.sub(1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M_NumberPlus); sink.literal(1);
        sink.start(_M_ArityTerms_xS1_xZOM); sink.copy(sub_12.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ArityTerms, term_176);
  } final public static boolean _M_ArityArguments(Sink sink, int shared, int depth, Term term_99) {
    if (depth < 2000) {
      label_136: {
        if (term_99.descriptor() != _M_Crsx_xarguments)
        {   break label_136;
        }Term sub_266 = term_99.sub(0).ref();Term sub_238 = term_99.sub(1).ref();
        if (sub_238.descriptor() != _M__sNil)
        {   break label_136;
        }Term sub_112 = term_99.sub(2).ref();/*Contract*/ sink.literal(0); return true;
      }
      label_137: {
        if (term_99.descriptor() != _M_Crsx_xarguments)
        {   break label_137;
        }Term sub_193 = term_99.sub(0).ref();Term sub_121 = term_99.sub(1).ref();
        if (sub_121.descriptor() != _M__sCons)
        {   break label_137;
        }Term sub_141 = sub_121.sub(0).ref();
        /* #terms=sub */Term sub_114 = sub_121.sub(1).ref();
        if (sub_114.descriptor() != _M__sNil)
        {   break label_137;
        }Term sub_105 = term_99.sub(2).ref();/*Contract*/
        sink.start(_M_ArityTerms); sink.copy(sub_141.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ArityArguments, term_99);
  } final public static boolean _M_ArityArgumentsOpt(Sink sink, int shared, int depth, Term term_74) {
    if (depth < 2000) {
      label_39: {
        if (term_74.descriptor() != _M__sNil)
        {   break label_39;
        }/*Contract*/ sink.literal(0); return true;
      }
      label_74: {
        if (term_74.descriptor() != _M__sCons)
        {   break label_74;
        }Term sub_149 = term_74.sub(0).ref();
        /* #arguments=sub */Term sub_281 = term_74.sub(1).ref();
        if (sub_281.descriptor() != _M__sNil)
        {   break label_74;
        }/*Contract*/
        sink.start(_M_ArityArguments); sink.copy(sub_149.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ArityArgumentsOpt, term_74);
  } 
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.parser.Crsx.init(context); org.crsx.compiler.std.Core.init(context); org.crsx.compiler.std.Num.init(context); org.crsx.compiler.std.String.init(context); org.crsx.compiler.std.List.init(context); context.register(_M_ANNOTATIONS); context.register(_M_DesugarPropertyList); context.register(_M_DesugarDispatchCases); context.register(_M_DesugarListTermList); context.register(_M_DesugarList); context.register(_M_DesugarFreeTermList); context.register(_M_DesugarTermList); context.register(_M_DesugarFreeTerms); context.register(_M_DesugarTerms); context.register(_M_DesugarDeclarations); context.register(_M_SugarPropertyList); context.register(_M_SugarDispatchCases); context.register(_M_SugarFreeTerms); context.register(_M_SugarTerms); context.register(_M_SugarTermsOpt); context.register(_M_IndexAnnotation); context.register(_M_Then); context.register(_M_IndexAnnotations); context.register(_M_AllMetaTerms_xS1_xZOM); context.register(_M_AllMetaTerms); context.register(_M_AllMetaArgumentsOpt); context.register(_M_AllMetaInPatternRule); context.register(_M_IsPrimitive); context.register(_M_IsDirectiveUnwrap); context.register(_M_IsDirective); context.register(_M_ArityTerms_xS1_xZOM); context.register(_M_ArityTerms); context.register(_M_ArityArguments); context.register(_M_ArityArgumentsOpt);
      initialized = true;
    }
  }

/* END MODULE « "/Users/villardl/Projects/crsx/crsx4/src/crsxutils.crs.java" » */
}