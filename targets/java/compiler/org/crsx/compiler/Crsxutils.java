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
        /* #property=sub */Term sub_30 = term.sub(1).ref();
        /* #propertyList_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xpropertyList_xS1); sink.literal(";");
        sink.start(_M__sCons); sink.copy(sub.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.copy(sub_30.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarPropertyList, term);
  } final public static boolean _M_DesugarDispatchCases(Sink sink, int shared, int depth, Term term_66) {
    if (depth < 2000) {
      label_44: {
        if (term_66.descriptor() != _M_Crsx_xdispatchCases)
        {   break label_44;
        }Term sub_44 = term_66.sub(0).ref();
        /* #dispatchCase=sub */Term sub_47 = term_66.sub(1).ref();
        /* #dispatchCases_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdispatchCases_xS1); sink.literal(";"); sink.copy(sub_44.ref());
        sink.end(); sink.copy(sub_47.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarDispatchCases, term_66);
  } final public static boolean _M_DesugarListTermList(Sink sink, int shared, int depth, Term term_79) {
    if (depth < 2000) {
      label_67: {
        if (term_79.descriptor() != _M__sNil)
        {   break label_67;
        }/*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
      label_23: {
        if (term_79.descriptor() != _M__sCons)
        {   break label_23;
        }Term sub_16 = term_79.sub(0).ref();
        if (sub_16.descriptor() != _M_Crsx_xtermList_xS1)
        {   break label_23;
        }Term sub_15 = sub_16.sub(0).ref();Term sub_92 = sub_16.sub(1).ref();
        if (sub_92.descriptor() != _M__sNil)
        {   break label_23;
        }Term sub_24 = term_79.sub(1).ref();
        if (sub_24.descriptor() != _M__sNil)
        {   break label_23;
        }/*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
      label_88: {
        if (term_79.descriptor() != _M__sCons)
        {   break label_88;
        }Term sub_45 = term_79.sub(0).ref();
        if (sub_45.descriptor() != _M_Crsx_xtermList_xS1)
        {   break label_88;
        }Term sub_31 = sub_45.sub(0).ref();Term sub_87 = sub_45.sub(1).ref();
        if (sub_87.descriptor() != _M__sCons)
        {   break label_88;
        }Term sub_52 = sub_87.sub(0).ref();
        if (sub_52.descriptor() != _M_Crsx_xterm_xA1)
        {   break label_88;
        }Term sub_71 = sub_52.sub(0).ref();
        /* #freeTerm=sub */Term sub_46 = sub_87.sub(1).ref();
        if (sub_46.descriptor() != _M__sNil)
        {   break label_88;
        }Term sub_74 = term_79.sub(1).ref();
        if (sub_74.descriptor() != _M__sNil)
        {   break label_88;
        }/*Contract*/ sink.copy(sub_71.ref()); return true;
      }
      label_11: {
        if (term_79.descriptor() != _M__sCons)
        {   break label_11;
        }Term sub_20 = term_79.sub(0).ref();
        if (sub_20.descriptor() != _M_Crsx_xtermList_xS1)
        {   break label_11;
        }Term sub_91 = sub_20.sub(0).ref();Term sub_50 = sub_20.sub(1).ref();
        if (sub_50.descriptor() != _M__sCons)
        {   break label_11;
        }Term sub_11 = sub_50.sub(0).ref();
        /* #term=sub */Term sub_53 = sub_50.sub(1).ref();
        if (sub_53.descriptor() != _M__sNil)
        {   break label_11;
        }Term sub_51 = term_79.sub(1).ref();
        if (sub_51.descriptor() != _M__sCons)
        {   break label_11;
        }Term sub_41 = sub_51.sub(0).ref();
        if (sub_41.descriptor() != _M_Crsx_xtermList_xS1)
        {   break label_11;
        }Term sub_42 = sub_41.sub(0).ref();Term sub_116 = sub_41.sub(1).ref();
        if (sub_116.descriptor() != _M__sNil)
        {   break label_11;
        }Term sub_9 = sub_51.sub(1).ref();
        if (sub_9.descriptor() != _M__sNil)
        {   break label_11;
        }/*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.literal("$Cons");
        sink.end();
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms); sink.copy(sub_11.ref());
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
      label_55: {
        if (term_79.descriptor() != _M__sCons)
        {   break label_55;
        }Term sub_38 = term_79.sub(0).ref();
        if (sub_38.descriptor() != _M_Crsx_xtermList_xS1)
        {   break label_55;
        }Term sub_19 = sub_38.sub(0).ref();Term sub_126 = sub_38.sub(1).ref();
        if (sub_126.descriptor() != _M__sCons)
        {   break label_55;
        }Term sub_75 = sub_126.sub(0).ref();
        /* #term=sub */Term sub_67 = sub_126.sub(1).ref();
        if (sub_67.descriptor() != _M__sNil)
        {   break label_55;
        }Term sub_61 = term_79.sub(1).ref();
        if (sub_61.descriptor() != _M__sCons)
        {   break label_55;
        }Term sub_70 = sub_61.sub(0).ref();
        if (sub_70.descriptor() != _M_Crsx_xtermList_xS1)
        {   break label_55;
        }Term sub_120 = sub_70.sub(0).ref();Term sub_90 = sub_70.sub(1).ref();
        if (sub_90.descriptor() != _M__sCons)
        {   break label_55;
        }Term sub_317 = sub_90.sub(0).ref();
        /* #term2=sub */Term sub_183 = sub_90.sub(1).ref();
        if (sub_183.descriptor() != _M__sNil)
        {   break label_55;
        }Term sub_33 = sub_61.sub(1).ref();
        /* #termList_S1*=sub *//*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.literal("$Cons");
        sink.end();
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms); sink.copy(sub_75.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms_xS1); sink.literal(",");
        sink.start(_M_Crsx_xterm_xA1);
        sink.start(_M_DesugarListTermList);
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xtermList_xS1); sink.literal(";");
        sink.start(_M__sCons); sink.copy(sub_317.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.copy(sub_33.ref());
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
    return thunk(sink, _M_DesugarListTermList, term_79);
  } final public static boolean _M_DesugarList(Sink sink, int shared, int depth, Term term_6) {
    if (depth < 2000) {
      label_0: {
        if (term_6.descriptor() != _M_Crsx_xlist)
        {   break label_0;
        }Term sub_22 = term_6.sub(0).ref();Term sub_13 = term_6.sub(1).ref();
        if (sub_13.descriptor() != _M__sNil)
        {   break label_0;
        }Term sub_79 = term_6.sub(2).ref();/*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
      label_18: {
        if (term_6.descriptor() != _M_Crsx_xlist)
        {   break label_18;
        }Term sub_80 = term_6.sub(0).ref();Term sub_131 = term_6.sub(1).ref();
        if (sub_131.descriptor() != _M__sCons)
        {   break label_18;
        }Term sub_37 = sub_131.sub(0).ref();
        /* #termList=sub */Term sub_12 = sub_131.sub(1).ref();
        if (sub_12.descriptor() != _M__sNil)
        {   break label_18;
        }Term sub_81 = term_6.sub(2).ref();/*Contract*/
        sink.start(_M_DesugarListTermList);
        sink.start(_M_DesugarTermList); sink.copy(sub_37.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarList, term_6);
  } final public static boolean _M_DesugarFreeTermList(Sink sink, int shared, int depth, Term term_78) {
    if (depth < 2000) {
      label_80: {
        if (term_78.descriptor() != _M_Crsx_xfreeTerm_xA4)
        {   break label_80;
        }Term sub_28 = term_78.sub(0).ref();
        /* #annotations?=sub */Term sub_2 = term_78.sub(1).ref();
        if (sub_2.descriptor() != _M_Crsx_xlist)
        {   break label_80;
        }Term sub_21 = sub_2.sub(0).ref();Term sub_117 = sub_2.sub(1).ref();
        if (sub_117.descriptor() != _M__sNil)
        {   break label_80;
        }Term sub_82 = sub_2.sub(2).ref();/*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.copy(sub_28.ref()); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
      label_28: {
        if (term_78.descriptor() != _M_Crsx_xfreeTerm_xA4)
        {   break label_28;
        }Term sub_0 = term_78.sub(0).ref();
        /* #annotations?=sub */Term sub_57 = term_78.sub(1).ref();
        if (sub_57.descriptor() != _M_Crsx_xlist)
        {   break label_28;
        }Term sub_48 = sub_57.sub(0).ref();Term sub_94 = sub_57.sub(1).ref();
        if (sub_94.descriptor() != _M__sCons)
        {   break label_28;
        }Term sub_54 = sub_94.sub(0).ref();
        /* #termList=sub */Term sub_77 = sub_94.sub(1).ref();
        if (sub_77.descriptor() != _M__sNil)
        {   break label_28;
        }Term sub_78 = sub_57.sub(2).ref();/*Contract*/
        sink.start(_M_DesugarListTermList);
        sink.start(_M_DesugarTermList); sink.copy(sub_54.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarFreeTermList, term_78);
  } final public static boolean _M_DesugarTermList(Sink sink, int shared, int depth, Term term_10) {
    if (depth < 2000) {
      label_27: {
        if (term_10.descriptor() != _M_Crsx_xtermList)
        {   break label_27;
        }Term sub_1 = term_10.sub(0).ref();
        /* #term=sub */Term sub_109 = term_10.sub(1).ref();
        /* #termList_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xtermList_xS1); sink.literal(";");
        sink.start(_M__sCons); sink.copy(sub_1.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.copy(sub_109.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarTermList, term_10);
  } final public static boolean _M_DesugarFreeTerms(Sink sink, int shared, int depth, Term term_189) {
    if (depth < 2000) {
      label_36: {
        if (term_189.descriptor() != _M_Crsx_xfreeTerms)
        {   break label_36;
        }Term sub_99 = term_189.sub(0).ref();
        /* #freeTerm=sub */Term sub_140 = term_189.sub(1).ref();
        /* #freeTerms_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeTerms_xS1); sink.literal(","); sink.copy(sub_99.ref());
        sink.end(); sink.copy(sub_140.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarFreeTerms, term_189);
  } final public static boolean _M_DesugarTerms(Sink sink, int shared, int depth, Term term_65) {
    if (depth < 2000) {
      label_13: {
        if (term_65.descriptor() != _M_Crsx_xterms)
        {   break label_13;
        }Term sub_93 = term_65.sub(0).ref();
        /* #term=sub */Term sub_56 = term_65.sub(1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms_xS1); sink.literal(","); sink.copy(sub_93.ref());
        sink.end(); sink.copy(sub_56.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarTerms, term_65);
  } final public static boolean _M_DesugarDeclarations(Sink sink, int shared, int depth, Term term_71) {
    if (depth < 2000) {
      label_10: {
        if (term_71.descriptor() != _M_Crsx_xdeclarations)
        {   break label_10;
        }Term sub_35 = term_71.sub(0).ref();
        /* #declaration=sub */Term sub_252 = term_71.sub(1).ref();
        /* #declarations_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
        sink.start(_M__sCons); sink.copy(sub_35.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.copy(sub_252.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarDeclarations, term_71);
  } final public static boolean _M_SugarPropertyList(Sink sink, int shared, int depth, Term term_84) {
    if (depth < 2000) {
      label_33: {
        if (term_84.descriptor() != _M__sNil)
        {   break label_33;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Internal error: cannot rewrite an empty list of properties.");
        sink.end(); return true;
      }
      label_82: {
        if (term_84.descriptor() != _M__sCons)
        {   break label_82;
        }Term sub_95 = term_84.sub(0).ref();
        if (sub_95.descriptor() != _M_Crsx_xpropertyList_xS1)
        {   break label_82;
        }Term sub_186 = sub_95.sub(0).ref();Term sub_68 = sub_95.sub(1).ref();
        if (sub_68.descriptor() != _M__sCons)
        {   break label_82;
        }Term sub_214 = sub_68.sub(0).ref();
        /* #property=sub */Term sub_64 = sub_68.sub(1).ref();
        if (sub_64.descriptor() != _M__sNil)
        {   break label_82;
        }Term sub_188 = term_84.sub(1).ref();
        /* #propertyList_S1*=sub *//*Contract*/
        sink.start(_M_Crsx_xpropertyList); sink.copy(sub_214.ref()); sink.copy(sub_188.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_SugarPropertyList, term_84);
  } final public static boolean _M_SugarDispatchCases(Sink sink, int shared, int depth, Term term_93) {
    if (depth < 2000) {
      label_74: {
        if (term_93.descriptor() != _M__sNil)
        {   break label_74;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Assertion error: at least one dispatch case must be defined.");
        sink.end(); return true;
      }
      label_84: {
        if (term_93.descriptor() != _M__sCons)
        {   break label_84;
        }Term sub_275 = term_93.sub(0).ref();
        if (sub_275.descriptor() != _M_Crsx_xdispatchCases_xS1)
        {   break label_84;
        }Term sub_166 = sub_275.sub(0).ref();Term sub_36 = sub_275.sub(1).ref();
        /* #dispatchCase=sub */Term sub_43 = term_93.sub(1).ref();
        /* #dispatchCases_S1*=sub *//*Contract*/
        sink.start(_M_Crsx_xdispatchCases); sink.copy(sub_36.ref()); sink.copy(sub_43.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_SugarDispatchCases, term_93);
  } final public static boolean _M_SugarFreeTerms(Sink sink, int shared, int depth, Term term_28) {
    if (depth < 2000) {
      label_12: {
        if (term_28.descriptor() != _M__sNil)
        {   break label_12;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Internal error: cannot rewrite an empty list of terms to term");
        sink.end(); return true;
      }
      label_31: {
        if (term_28.descriptor() != _M__sCons)
        {   break label_31;
        }Term sub_58 = term_28.sub(0).ref();
        if (sub_58.descriptor() != _M_Crsx_xfreeTerms_xS1)
        {   break label_31;
        }Term sub_110 = sub_58.sub(0).ref();Term sub_396 = sub_58.sub(1).ref();
        /* #freeTerm=sub */Term sub_62 = term_28.sub(1).ref();
        /* #freeTerms_S1*=sub *//*Contract*/
        sink.start(_M_Crsx_xfreeTerms); sink.copy(sub_396.ref()); sink.copy(sub_62.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_SugarFreeTerms, term_28);
  } final public static boolean _M_SugarTerms(Sink sink, int shared, int depth, Term term_15) {
    if (depth < 2000) {
      label_14: {
        if (term_15.descriptor() != _M__sNil)
        {   break label_14;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Internal error: cannot rewrite an empty list of terms to term");
        sink.end(); return true;
      }
      label_72: {
        if (term_15.descriptor() != _M__sCons)
        {   break label_72;
        }Term sub_133 = term_15.sub(0).ref();
        if (sub_133.descriptor() != _M_Crsx_xterms_xS1)
        {   break label_72;
        }Term sub_254 = sub_133.sub(0).ref();Term sub_111 = sub_133.sub(1).ref();
        /* #term=sub */Term sub_66 = term_15.sub(1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M_Crsx_xterms); sink.copy(sub_111.ref()); sink.copy(sub_66.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_SugarTerms, term_15);
  } final public static boolean _M_SugarTermsOpt(Sink sink, int shared, int depth, Term term_25) {
    if (depth < 2000) {
      label_85: {
        if (term_25.descriptor() != _M__sNil)
        {   break label_85;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_5: {
        if (term_25.descriptor() != _M__sCons)
        {   break label_5;
        }Term sub_85 = term_25.sub(0).ref();
        if (sub_85.descriptor() != _M_Crsx_xterms_xS1)
        {   break label_5;
        }Term sub_34 = sub_85.sub(0).ref();Term sub_102 = sub_85.sub(1).ref();
        /* #term=sub */Term sub_265 = term_25.sub(1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms); sink.copy(sub_102.ref()); sink.copy(sub_265.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_SugarTermsOpt, term_25);
  } final public static boolean _M_IndexAnnotation(Sink sink, int shared, int depth, Properties props, Term term_74, Term term_7) {
    if (depth < 2000) {
      label_34: {
        if (term_74.descriptor() != _M_Crsx_xannotation)
        {   break label_34;
        }Term sub_7 = term_74.sub(0).ref();Term sub_23 = term_74.sub(1).ref();
        if (sub_23.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_34;
        }Term sub_26 = sub_23.sub(0).ref();
        if (sub_26.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_34;
        }Term sub_148 = sub_23.sub(1).ref();
        /* #CONSTRUCTOR=sub */Term sub_141 = term_74.sub(2).ref();
        /* #arguments?=sub */
        if (term_7.descriptor() != _M_CONTINUATION)
        {   break label_34;
        }Term sub_17 = term_7.sub(0).ref();
        Variable binder = term_7.binders(0)[0];
        /* #=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sTrace); sink.end();sink.properties(safeRef(props));Term term_39;
        {
          BufferSink buf = sink.context().makeBuffer(); buf.copy(sub_141.ref());
          term_39 = buf.term();
        }
        sub_148 = force(sink.context(), sub_148);
        Sink.property(sink, sub_148, term_39);Term term_70;
        {
          BufferSink buf_57 = sink.context().makeBuffer(); buf_57.start(_M_OK); buf_57.end();
          term_70 = buf_57.term();
        }
        sink.substitute(sub_17.ref(), new Variable[] { binder }, new Term[] {term_70});
        sink.end(); return true; 
      }
    }
    return thunk(sink, _M_IndexAnnotation, props, term_74, term_7);
  }  final public static boolean _M_Then(Sink sink, int shared, int depth, Properties props_31, Term term_50) {
    if (depth < 2000) {
      label_42: {
        if (term_50.descriptor() != _M_OK)
        {   break label_42;
        }/*Contract*/sink.properties(safeRef(props_31));
        sink.start(_M_ANNOTATIONS);
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Then, props_31, term_50);
  } final public static boolean _M_IndexAnnotations(Sink sink, int shared, int depth, Term term_86) {
    if (depth < 2000) {
      label_76: {
        if (term_86.descriptor() != _M__sNil)
        {   break label_76;
        }/*Contract*/ sink.start(_M_ANNOTATIONS); sink.end(); return true;
      }
      label_52: {
        if (term_86.descriptor() != _M__sCons)
        {   break label_52;
        }Term sub_4 = term_86.sub(0).ref();
        if (sub_4.descriptor() != _M_Crsx_xannotations)
        {   break label_52;
        }Term sub_139 = sub_4.sub(0).ref();
        /* #annotation+=sub */Term sub_185 = term_86.sub(1).ref();
        if (sub_185.descriptor() != _M__sNil)
        {   break label_52;
        }/*Contract*/
        sink.start(_M_SeqMap);
        Variable var = sink.context().makeVariable("anno");
        Variable var_84 = sink.context().makeVariable("cont");
        sink.binds(new Variable[] {var,var_84});
        sink.start(_M_IndexAnnotation); sink.use(var); sink.use(var_84);
        sink.end(); sink.copy(sub_139.ref());
        Variable var_46 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_46}); sink.start(_M_Then); sink.use(var_46); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_IndexAnnotations, term_86);
  } final public static boolean _M_AllMetaTerms_xS1_xZOM(Sink sink, int shared, int depth, Term term_95) {
    if (depth < 2000) {
      label_61: {
        if (term_95.descriptor() != _M__sNil)
        {   break label_61;
        }/*Contract*/ sink.start(_M_TRUE); sink.end(); return true;
      }
      label_73: {
        if (term_95.descriptor() != _M__sCons)
        {   break label_73;
        }Term sub_226 = term_95.sub(0).ref();
        if (sub_226.descriptor() != _M_Crsx_xterms_xS1)
        {   break label_73;
        }Term sub_84 = sub_226.sub(0).ref();Term sub_73 = sub_226.sub(1).ref();
        if (sub_73.descriptor() != _M_Crsx_xterm_xA1)
        {   break label_73;
        }Term sub_385 = sub_73.sub(0).ref();
        if (sub_385.descriptor() != _M_Crsx_xfreeTerm_xA7)
        {   break label_73;
        }Term sub_32 = sub_385.sub(0).ref();
        if (sub_32.descriptor() != _M__sNil)
        {   break label_73;
        }Term sub_176 = sub_385.sub(1).ref();
        if (sub_176.descriptor() != _M__sNil)
        {   break label_73;
        }Term sub_174 = sub_385.sub(2).ref();
        /* #METAVAR=sub */Term sub_3 = sub_385.sub(3).ref();
        if (sub_3.descriptor() != _M__sNil)
        {   break label_73;
        }Term sub_97 = term_95.sub(1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M_AllMetaTerms_xS1_xZOM); sink.copy(sub_97.ref());
        sink.end(); return true;
      }
      label_70: {
        /* #terms_S1_ZOM=term *//*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_AllMetaTerms_xS1_xZOM, term_95);
  } final public static boolean _M_AllMetaTerms(Sink sink, int shared, int depth, Term term_98) {
    if (depth < 2000) {
      label_22: {
        if (term_98.descriptor() != _M_Crsx_xterms)
        {   break label_22;
        }Term sub_55 = term_98.sub(0).ref();
        if (sub_55.descriptor() != _M_Crsx_xterm_xA1)
        {   break label_22;
        }Term sub_189 = sub_55.sub(0).ref();
        if (sub_189.descriptor() != _M_Crsx_xfreeTerm_xA7)
        {   break label_22;
        }Term sub_6 = sub_189.sub(0).ref();
        if (sub_6.descriptor() != _M__sNil)
        {   break label_22;
        }Term sub_147 = sub_189.sub(1).ref();
        if (sub_147.descriptor() != _M__sNil)
        {   break label_22;
        }Term sub_281 = sub_189.sub(2).ref();
        /* #METAVAR=sub */Term sub_196 = sub_189.sub(3).ref();
        if (sub_196.descriptor() != _M__sNil)
        {   break label_22;
        }Term sub_156 = term_98.sub(1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M_AllMetaTerms_xS1_xZOM); sink.copy(sub_156.ref());
        sink.end(); return true;
      }
      label_97: {
        /* #terms=term *//*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_AllMetaTerms, term_98);
  } final public static boolean _M_AllMetaArgumentsOpt(Sink sink, int shared, int depth, Term term_34) {
    if (depth < 2000) {
      label_122: {
        if (term_34.descriptor() != _M__sNil)
        {   break label_122;
        }/*Contract*/ sink.start(_M_TRUE); sink.end(); return true;
      }
      label_20: {
        if (term_34.descriptor() != _M__sCons)
        {   break label_20;
        }Term sub_145 = term_34.sub(0).ref();
        if (sub_145.descriptor() != _M_Crsx_xarguments)
        {   break label_20;
        }Term sub_240 = sub_145.sub(0).ref();Term sub_244 = sub_145.sub(1).ref();
        if (sub_244.descriptor() != _M__sNil)
        {   break label_20;
        }Term sub_14 = sub_145.sub(2).ref();Term sub_65 = term_34.sub(1).ref();
        if (sub_65.descriptor() != _M__sNil)
        {   break label_20;
        }/*Contract*/ sink.start(_M_TRUE); sink.end(); return true;
      }
      label_87: {
        if (term_34.descriptor() != _M__sCons)
        {   break label_87;
        }Term sub_180 = term_34.sub(0).ref();
        if (sub_180.descriptor() != _M_Crsx_xarguments)
        {   break label_87;
        }Term sub_144 = sub_180.sub(0).ref();Term sub_100 = sub_180.sub(1).ref();
        if (sub_100.descriptor() != _M__sCons)
        {   break label_87;
        }Term sub_18 = sub_100.sub(0).ref();
        /* #terms=sub */Term sub_163 = sub_100.sub(1).ref();
        if (sub_163.descriptor() != _M__sNil)
        {   break label_87;
        }Term sub_263 = sub_180.sub(2).ref();Term sub_114 = term_34.sub(1).ref();
        if (sub_114.descriptor() != _M__sNil)
        {   break label_87;
        }/*Contract*/
        sink.start(_M_AllMetaTerms); sink.copy(sub_18.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AllMetaArgumentsOpt, term_34);
  } final public static boolean _M_AllMetaInPatternRule(Sink sink, int shared, int depth, Term term_13) {
    if (depth < 2000) {
      label_77: {
        if (term_13.descriptor() != _M_Crsx_xruleDeclaration)
        {   break label_77;
        }Term sub_190 = term_13.sub(0).ref();
        /* #option?=sub */Term sub_168 = term_13.sub(1).ref();
        if (sub_168.descriptor() != _M_Crsx_xpattern)
        {   break label_77;
        }Term sub_138 = sub_168.sub(0).ref();
        /* #properties?=sub */Term sub_422 = sub_168.sub(1).ref();
        /* #constructor=sub */Term sub_227 = sub_168.sub(2).ref();
        /* #arguments?=sub */Term sub_182 = term_13.sub(2).ref();Term sub_205 = term_13.sub(3).ref();
        /* #contractum=sub *//*Contract*/
        sink.start(_M_AllMetaArgumentsOpt); sink.copy(sub_227.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AllMetaInPatternRule, term_13);
  } final public static boolean _M_IsPrimitive(Sink sink, int shared, int depth, Term term_135) {
    if (depth < 2000) {
      label_4: {
        if (term_135.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_4;
        }Term sub_198 = term_135.sub(0).ref();
        if (sub_198.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_4;
        }Term sub_118 = term_135.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M_StringEqual); sink.copy(sub_118.ref()); sink.literal("$");
        sink.end(); return true;
      }
      label_58: {
        if (term_135.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_58;
        }Term sub_29 = term_135.sub(0).ref();
        if (sub_29.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_58;
        }Term sub_108 = sub_29.sub(0).ref();/*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_IsPrimitive, term_135);
  } final public static boolean _M_IsDirectiveUnwrap(Sink sink, int shared, int depth, Term term_47) {
    if (depth < 2000) {
      label_98: {
        if (term_47.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_98;
        }Term sub_195 = term_47.sub(0).ref();
        if (sub_195.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_98;
        }Term sub_124 = term_47.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sStartsWith); sink.end(); sink.copy(sub_124.ref()); sink.literal("$");
        sink.end(); return true;
      }
      label_282: {
        if (term_47.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_282;
        }Term sub_72 = term_47.sub(0).ref();
        if (sub_72.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_282;
        }Term sub_25 = sub_72.sub(0).ref();/*Contract*/ sink.start(_M__sFalse); sink.end(); return true;
      }
    }
    return thunk(sink, _M_IsDirectiveUnwrap, term_47);
  } final public static boolean _M_IsDirective(Sink sink, int shared, int depth, Term term_58) {
    if (depth < 2000) {
      label_121: {
        if (term_58.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_121;
        }Term sub_161 = term_58.sub(0).ref();
        if (sub_161.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_121;
        }Term sub_143 = term_58.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M_StartsWith); sink.copy(sub_143.ref()); sink.literal("$");
        sink.end(); return true;
      }
      label_99: {
        if (term_58.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_99;
        }Term sub_142 = term_58.sub(0).ref();
        if (sub_142.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_99;
        }Term sub_267 = sub_142.sub(0).ref();/*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_IsDirective, term_58);
  } final public static boolean _M_ArityTerms_xS1_xZOM(Sink sink, int shared, int depth, Term term_87) {
    if (depth < 2000) {
      label_46: {
        if (term_87.descriptor() != _M__sNil)
        {   break label_46;
        }/*Contract*/ sink.literal(0); return true;
      }
      label_68: {
        if (term_87.descriptor() != _M__sCons)
        {   break label_68;
        }Term sub_63 = term_87.sub(0).ref();
        if (sub_63.descriptor() != _M_Crsx_xterms_xS1)
        {   break label_68;
        }Term sub_104 = sub_63.sub(0).ref();Term sub_76 = sub_63.sub(1).ref();
        /* #term=sub */Term sub_234 = term_87.sub(1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M_NumberPlus); sink.literal(1);
        sink.start(_M_ArityTerms_xS1_xZOM); sink.copy(sub_234.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ArityTerms_xS1_xZOM, term_87);
  } final public static boolean _M_ArityTerms(Sink sink, int shared, int depth, Term term_35) {
    if (depth < 2000) {
      label_141: {
        if (term_35.descriptor() != _M_Crsx_xterms)
        {   break label_141;
        }Term sub_249 = term_35.sub(0).ref();
        /* #term=sub */Term sub_151 = term_35.sub(1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M_NumberPlus); sink.literal(1);
        sink.start(_M_ArityTerms_xS1_xZOM); sink.copy(sub_151.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ArityTerms, term_35);
  } final public static boolean _M_ArityArguments(Sink sink, int shared, int depth, Term term_69) {
    if (depth < 2000) {
      label_32: {
        if (term_69.descriptor() != _M_Crsx_xarguments)
        {   break label_32;
        }Term sub_260 = term_69.sub(0).ref();Term sub_103 = term_69.sub(1).ref();
        if (sub_103.descriptor() != _M__sNil)
        {   break label_32;
        }Term sub_362 = term_69.sub(2).ref();/*Contract*/ sink.literal(0); return true;
      }
      label_48: {
        if (term_69.descriptor() != _M_Crsx_xarguments)
        {   break label_48;
        }Term sub_157 = term_69.sub(0).ref();Term sub_172 = term_69.sub(1).ref();
        if (sub_172.descriptor() != _M__sCons)
        {   break label_48;
        }Term sub_387 = sub_172.sub(0).ref();
        /* #terms=sub */Term sub_89 = sub_172.sub(1).ref();
        if (sub_89.descriptor() != _M__sNil)
        {   break label_48;
        }Term sub_222 = term_69.sub(2).ref();/*Contract*/
        sink.start(_M_ArityTerms); sink.copy(sub_387.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ArityArguments, term_69);
  } final public static boolean _M_ArityArgumentsOpt(Sink sink, int shared, int depth, Term term_62) {
    if (depth < 2000) {
      label_163: {
        if (term_62.descriptor() != _M__sNil)
        {   break label_163;
        }/*Contract*/ sink.literal(0); return true;
      }
      label_161: {
        if (term_62.descriptor() != _M__sCons)
        {   break label_161;
        }Term sub_27 = term_62.sub(0).ref();
        /* #arguments=sub */Term sub_179 = term_62.sub(1).ref();
        if (sub_179.descriptor() != _M__sNil)
        {   break label_161;
        }/*Contract*/
        sink.start(_M_ArityArguments); sink.copy(sub_27.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ArityArgumentsOpt, term_62);
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