/* START MODULE /Users/villardl/Projects/crsx/crsx4_2/src/crsxutils.crs.java */
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
        /* #property=sub */Term sub_81 = term.sub(1).ref();
        /* #propertyList_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xpropertyList_xS1); sink.literal(";");
        sink.start(_M__sCons); sink.copy(sub.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.copy(sub_81.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarPropertyList, term);
  } final public static boolean _M_DesugarDispatchCases(Sink sink, int shared, int depth, Term term_71) {
    if (depth < 2000) {
      label_79: {
        if (term_71.descriptor() != _M_Crsx_xdispatchCases)
        {   break label_79;
        }Term sub_84 = term_71.sub(0).ref();
        /* #dispatchCase=sub */Term sub_22 = term_71.sub(1).ref();
        /* #dispatchCases_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdispatchCases_xS1); sink.literal(";"); sink.copy(sub_84.ref());
        sink.end(); sink.copy(sub_22.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarDispatchCases, term_71);
  } final public static boolean _M_DesugarListTermList(Sink sink, int shared, int depth, Term term_10) {
    if (depth < 2000) {
      label_9: {
        if (term_10.descriptor() != _M__sNil)
        {   break label_9;
        }/*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
      label_58: {
        if (term_10.descriptor() != _M__sCons)
        {   break label_58;
        }Term sub_3 = term_10.sub(0).ref();
        if (sub_3.descriptor() != _M_Crsx_xtermList_xS1)
        {   break label_58;
        }Term sub_18 = sub_3.sub(0).ref();Term sub_69 = sub_3.sub(1).ref();
        if (sub_69.descriptor() != _M__sNil)
        {   break label_58;
        }Term sub_12 = term_10.sub(1).ref();
        if (sub_12.descriptor() != _M__sNil)
        {   break label_58;
        }/*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
      label_87: {
        if (term_10.descriptor() != _M__sCons)
        {   break label_87;
        }Term sub_73 = term_10.sub(0).ref();
        if (sub_73.descriptor() != _M_Crsx_xtermList_xS1)
        {   break label_87;
        }Term sub_19 = sub_73.sub(0).ref();Term sub_45 = sub_73.sub(1).ref();
        if (sub_45.descriptor() != _M__sCons)
        {   break label_87;
        }Term sub_168 = sub_45.sub(0).ref();
        if (sub_168.descriptor() != _M_Crsx_xterm_xA1)
        {   break label_87;
        }Term sub_9 = sub_168.sub(0).ref();
        /* #freeTerm=sub */Term sub_33 = sub_45.sub(1).ref();
        if (sub_33.descriptor() != _M__sNil)
        {   break label_87;
        }Term sub_14 = term_10.sub(1).ref();
        if (sub_14.descriptor() != _M__sNil)
        {   break label_87;
        }/*Contract*/ sink.copy(sub_9.ref()); return true;
      }
      label_82: {
        if (term_10.descriptor() != _M__sCons)
        {   break label_82;
        }Term sub_62 = term_10.sub(0).ref();
        if (sub_62.descriptor() != _M_Crsx_xtermList_xS1)
        {   break label_82;
        }Term sub_6 = sub_62.sub(0).ref();Term sub_87 = sub_62.sub(1).ref();
        if (sub_87.descriptor() != _M__sCons)
        {   break label_82;
        }Term sub_31 = sub_87.sub(0).ref();
        /* #term=sub */Term sub_67 = sub_87.sub(1).ref();
        if (sub_67.descriptor() != _M__sNil)
        {   break label_82;
        }Term sub_16 = term_10.sub(1).ref();
        if (sub_16.descriptor() != _M__sCons)
        {   break label_82;
        }Term sub_47 = sub_16.sub(0).ref();
        if (sub_47.descriptor() != _M_Crsx_xtermList_xS1)
        {   break label_82;
        }Term sub_34 = sub_47.sub(0).ref();Term sub_92 = sub_47.sub(1).ref();
        if (sub_92.descriptor() != _M__sNil)
        {   break label_82;
        }Term sub_49 = sub_16.sub(1).ref();
        if (sub_49.descriptor() != _M__sNil)
        {   break label_82;
        }/*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.literal("$Cons");
        sink.end();
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms); sink.copy(sub_31.ref());
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
      label_20: {
        if (term_10.descriptor() != _M__sCons)
        {   break label_20;
        }Term sub_57 = term_10.sub(0).ref();
        if (sub_57.descriptor() != _M_Crsx_xtermList_xS1)
        {   break label_20;
        }Term sub_38 = sub_57.sub(0).ref();Term sub_194 = sub_57.sub(1).ref();
        if (sub_194.descriptor() != _M__sCons)
        {   break label_20;
        }Term sub_65 = sub_194.sub(0).ref();
        /* #term=sub */Term sub_15 = sub_194.sub(1).ref();
        if (sub_15.descriptor() != _M__sNil)
        {   break label_20;
        }Term sub_0 = term_10.sub(1).ref();
        if (sub_0.descriptor() != _M__sCons)
        {   break label_20;
        }Term sub_37 = sub_0.sub(0).ref();
        if (sub_37.descriptor() != _M_Crsx_xtermList_xS1)
        {   break label_20;
        }Term sub_51 = sub_37.sub(0).ref();Term sub_79 = sub_37.sub(1).ref();
        if (sub_79.descriptor() != _M__sCons)
        {   break label_20;
        }Term sub_48 = sub_79.sub(0).ref();
        /* #term2=sub */Term sub_58 = sub_79.sub(1).ref();
        if (sub_58.descriptor() != _M__sNil)
        {   break label_20;
        }Term sub_64 = sub_0.sub(1).ref();
        /* #termList_S1*=sub *//*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.literal("$Cons");
        sink.end();
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms); sink.copy(sub_65.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms_xS1); sink.literal(",");
        sink.start(_M_Crsx_xterm_xA1);
        sink.start(_M_DesugarListTermList);
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xtermList_xS1); sink.literal(";");
        sink.start(_M__sCons); sink.copy(sub_48.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.copy(sub_64.ref());
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
    return thunk(sink, _M_DesugarListTermList, term_10);
  } final public static boolean _M_DesugarList(Sink sink, int shared, int depth, Term term_64) {
    if (depth < 2000) {
      label_70: {
        if (term_64.descriptor() != _M_Crsx_xlist)
        {   break label_70;
        }Term sub_169 = term_64.sub(0).ref();Term sub_66 = term_64.sub(1).ref();
        if (sub_66.descriptor() != _M__sNil)
        {   break label_70;
        }Term sub_83 = term_64.sub(2).ref();/*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
      label_56: {
        if (term_64.descriptor() != _M_Crsx_xlist)
        {   break label_56;
        }Term sub_5 = term_64.sub(0).ref();Term sub_7 = term_64.sub(1).ref();
        if (sub_7.descriptor() != _M__sCons)
        {   break label_56;
        }Term sub_118 = sub_7.sub(0).ref();
        /* #termList=sub */Term sub_27 = sub_7.sub(1).ref();
        if (sub_27.descriptor() != _M__sNil)
        {   break label_56;
        }Term sub_144 = term_64.sub(2).ref();/*Contract*/
        sink.start(_M_DesugarListTermList);
        sink.start(_M_DesugarTermList); sink.copy(sub_118.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarList, term_64);
  } final public static boolean _M_DesugarFreeTermList(Sink sink, int shared, int depth, Term term_23) {
    if (depth < 2000) {
      label_23: {
        if (term_23.descriptor() != _M_Crsx_xfreeTerm_xA4)
        {   break label_23;
        }Term sub_54 = term_23.sub(0).ref();
        /* #annotations?=sub */Term sub_113 = term_23.sub(1).ref();
        if (sub_113.descriptor() != _M_Crsx_xlist)
        {   break label_23;
        }Term sub_110 = sub_113.sub(0).ref();Term sub_89 = sub_113.sub(1).ref();
        if (sub_89.descriptor() != _M__sNil)
        {   break label_23;
        }Term sub_175 = sub_113.sub(2).ref();/*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.copy(sub_54.ref()); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
      label_31: {
        if (term_23.descriptor() != _M_Crsx_xfreeTerm_xA4)
        {   break label_31;
        }Term sub_35 = term_23.sub(0).ref();
        /* #annotations?=sub */Term sub_68 = term_23.sub(1).ref();
        if (sub_68.descriptor() != _M_Crsx_xlist)
        {   break label_31;
        }Term sub_114 = sub_68.sub(0).ref();Term sub_36 = sub_68.sub(1).ref();
        if (sub_36.descriptor() != _M__sCons)
        {   break label_31;
        }Term sub_39 = sub_36.sub(0).ref();
        /* #termList=sub */Term sub_8 = sub_36.sub(1).ref();
        if (sub_8.descriptor() != _M__sNil)
        {   break label_31;
        }Term sub_60 = sub_68.sub(2).ref();/*Contract*/
        sink.start(_M_DesugarListTermList);
        sink.start(_M_DesugarTermList); sink.copy(sub_39.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarFreeTermList, term_23);
  } final public static boolean _M_DesugarTermList(Sink sink, int shared, int depth, Term term_8) {
    if (depth < 2000) {
      label_115: {
        if (term_8.descriptor() != _M_Crsx_xtermList)
        {   break label_115;
        }Term sub_345 = term_8.sub(0).ref();
        /* #term=sub */Term sub_17 = term_8.sub(1).ref();
        /* #termList_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xtermList_xS1); sink.literal(";");
        sink.start(_M__sCons); sink.copy(sub_345.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.copy(sub_17.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarTermList, term_8);
  } final public static boolean _M_DesugarFreeTerms(Sink sink, int shared, int depth, Term term_37) {
    if (depth < 2000) {
      label_59: {
        if (term_37.descriptor() != _M_Crsx_xfreeTerms)
        {   break label_59;
        }Term sub_46 = term_37.sub(0).ref();
        /* #freeTerm=sub */Term sub_32 = term_37.sub(1).ref();
        /* #freeTerms_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeTerms_xS1); sink.literal(","); sink.copy(sub_46.ref());
        sink.end(); sink.copy(sub_32.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarFreeTerms, term_37);
  } final public static boolean _M_DesugarTerms(Sink sink, int shared, int depth, Term term_65) {
    if (depth < 2000) {
      label_97: {
        if (term_65.descriptor() != _M_Crsx_xterms)
        {   break label_97;
        }Term sub_28 = term_65.sub(0).ref();
        /* #term=sub */Term sub_189 = term_65.sub(1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms_xS1); sink.literal(","); sink.copy(sub_28.ref());
        sink.end(); sink.copy(sub_189.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarTerms, term_65);
  } final public static boolean _M_DesugarDeclarations(Sink sink, int shared, int depth, Term term_49) {
    if (depth < 2000) {
      label_37: {
        if (term_49.descriptor() != _M_Crsx_xdeclarations)
        {   break label_37;
        }Term sub_93 = term_49.sub(0).ref();
        /* #declaration=sub */Term sub_127 = term_49.sub(1).ref();
        /* #declarations_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
        sink.start(_M__sCons); sink.copy(sub_93.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.copy(sub_127.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarDeclarations, term_49);
  } final public static boolean _M_SugarPropertyList(Sink sink, int shared, int depth, Term term_19) {
    if (depth < 2000) {
      label_125: {
        if (term_19.descriptor() != _M__sNil)
        {   break label_125;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Internal error: cannot rewrite an empty list of properties.");
        sink.end(); return true;
      }
      label_96: {
        if (term_19.descriptor() != _M__sCons)
        {   break label_96;
        }Term sub_165 = term_19.sub(0).ref();
        if (sub_165.descriptor() != _M_Crsx_xpropertyList_xS1)
        {   break label_96;
        }Term sub_2 = sub_165.sub(0).ref();Term sub_98 = sub_165.sub(1).ref();
        if (sub_98.descriptor() != _M__sCons)
        {   break label_96;
        }Term sub_90 = sub_98.sub(0).ref();
        /* #property=sub */Term sub_115 = sub_98.sub(1).ref();
        if (sub_115.descriptor() != _M__sNil)
        {   break label_96;
        }Term sub_314 = term_19.sub(1).ref();
        /* #propertyList_S1*=sub *//*Contract*/
        sink.start(_M_Crsx_xpropertyList); sink.copy(sub_90.ref()); sink.copy(sub_314.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_SugarPropertyList, term_19);
  } final public static boolean _M_SugarDispatchCases(Sink sink, int shared, int depth, Term term_97) {
    if (depth < 2000) {
      label_19: {
        if (term_97.descriptor() != _M__sNil)
        {   break label_19;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Assertion error: at least one dispatch case must be defined.");
        sink.end(); return true;
      }
      label_1: {
        if (term_97.descriptor() != _M__sCons)
        {   break label_1;
        }Term sub_143 = term_97.sub(0).ref();
        if (sub_143.descriptor() != _M_Crsx_xdispatchCases_xS1)
        {   break label_1;
        }Term sub_176 = sub_143.sub(0).ref();Term sub_55 = sub_143.sub(1).ref();
        /* #dispatchCase=sub */Term sub_61 = term_97.sub(1).ref();
        /* #dispatchCases_S1*=sub *//*Contract*/
        sink.start(_M_Crsx_xdispatchCases); sink.copy(sub_55.ref()); sink.copy(sub_61.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_SugarDispatchCases, term_97);
  } final public static boolean _M_SugarFreeTerms(Sink sink, int shared, int depth, Term term_20) {
    if (depth < 2000) {
      label_44: {
        if (term_20.descriptor() != _M__sNil)
        {   break label_44;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Internal error: cannot rewrite an empty list of terms to term");
        sink.end(); return true;
      }
      label_16: {
        if (term_20.descriptor() != _M__sCons)
        {   break label_16;
        }Term sub_206 = term_20.sub(0).ref();
        if (sub_206.descriptor() != _M_Crsx_xfreeTerms_xS1)
        {   break label_16;
        }Term sub_21 = sub_206.sub(0).ref();Term sub_24 = sub_206.sub(1).ref();
        /* #freeTerm=sub */Term sub_44 = term_20.sub(1).ref();
        /* #freeTerms_S1*=sub *//*Contract*/
        sink.start(_M_Crsx_xfreeTerms); sink.copy(sub_24.ref()); sink.copy(sub_44.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_SugarFreeTerms, term_20);
  } final public static boolean _M_SugarTerms(Sink sink, int shared, int depth, Term term_70) {
    if (depth < 2000) {
      label_63: {
        if (term_70.descriptor() != _M__sNil)
        {   break label_63;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Internal error: cannot rewrite an empty list of terms to term");
        sink.end(); return true;
      }
      label_90: {
        if (term_70.descriptor() != _M__sCons)
        {   break label_90;
        }Term sub_109 = term_70.sub(0).ref();
        if (sub_109.descriptor() != _M_Crsx_xterms_xS1)
        {   break label_90;
        }Term sub_53 = sub_109.sub(0).ref();Term sub_129 = sub_109.sub(1).ref();
        /* #term=sub */Term sub_78 = term_70.sub(1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M_Crsx_xterms); sink.copy(sub_129.ref()); sink.copy(sub_78.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_SugarTerms, term_70);
  } final public static boolean _M_SugarTermsOpt(Sink sink, int shared, int depth, Term term_24) {
    if (depth < 2000) {
      label_0: {
        if (term_24.descriptor() != _M__sNil)
        {   break label_0;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_98: {
        if (term_24.descriptor() != _M__sCons)
        {   break label_98;
        }Term sub_249 = term_24.sub(0).ref();
        if (sub_249.descriptor() != _M_Crsx_xterms_xS1)
        {   break label_98;
        }Term sub_74 = sub_249.sub(0).ref();Term sub_29 = sub_249.sub(1).ref();
        /* #term=sub */Term sub_187 = term_24.sub(1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms); sink.copy(sub_29.ref()); sink.copy(sub_187.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_SugarTermsOpt, term_24);
  } final public static boolean _M_IndexAnnotation(Sink sink, int shared, int depth, Properties props, Term term_193, Term term_12) {
    if (depth < 2000) {
      label_55: {
        if (term_193.descriptor() != _M_Crsx_xannotation)
        {   break label_55;
        }Term sub_258 = term_193.sub(0).ref();Term sub_155 = term_193.sub(1).ref();
        if (sub_155.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_55;
        }Term sub_41 = sub_155.sub(0).ref();
        if (sub_41.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_55;
        }Term sub_40 = sub_155.sub(1).ref();
        /* #CONSTRUCTOR=sub */Term sub_105 = term_193.sub(2).ref();
        /* #arguments?=sub */
        if (term_12.descriptor() != _M_CONTINUATION)
        {   break label_55;
        }Term sub_72 = term_12.sub(0).ref();
        Variable binder = term_12.binders(0)[0];
        /* #=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sTrace); sink.end();sink.properties(safeRef(props));Term term_89;
        {
          BufferSink buf = sink.context().makeBuffer(); buf.copy(sub_105.ref());
          term_89 = buf.term();
        }
        sub_40 = force(sink.context(), sub_40);
        Sink.property(sink, sub_40, term_89);Term term_39;
        {
          BufferSink buf_43 = sink.context().makeBuffer(); buf_43.start(_M_OK); buf_43.end();
          term_39 = buf_43.term();
        }
        sink.substitute(sub_72.ref(), new Variable[] { binder }, new Term[] {term_39});
        sink.end(); return true; 
      }
    }
    return thunk(sink, _M_IndexAnnotation, props, term_193, term_12);
  }  final public static boolean _M_Then(Sink sink, int shared, int depth, Properties props_80, Term term_139) {
    if (depth < 2000) {
      label_95: {
        if (term_139.descriptor() != _M_OK)
        {   break label_95;
        }/*Contract*/sink.properties(safeRef(props_80));
        sink.start(_M_ANNOTATIONS);
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Then, props_80, term_139);
  } final public static boolean _M_IndexAnnotations(Sink sink, int shared, int depth, Term term_183) {
    if (depth < 2000) {
      label_91: {
        if (term_183.descriptor() != _M__sNil)
        {   break label_91;
        }/*Contract*/ sink.start(_M_ANNOTATIONS); sink.end(); return true;
      }
      label_48: {
        if (term_183.descriptor() != _M__sCons)
        {   break label_48;
        }Term sub_163 = term_183.sub(0).ref();
        if (sub_163.descriptor() != _M_Crsx_xannotations)
        {   break label_48;
        }Term sub_56 = sub_163.sub(0).ref();
        /* #annotation+=sub */Term sub_199 = term_183.sub(1).ref();
        if (sub_199.descriptor() != _M__sNil)
        {   break label_48;
        }/*Contract*/
        sink.start(_M_SeqMap);
        Variable var = sink.context().makeVariable("anno");
        Variable var_87 = sink.context().makeVariable("cont");
        sink.binds(new Variable[] {var,var_87});
        sink.start(_M_IndexAnnotation); sink.use(var); sink.use(var_87);
        sink.end(); sink.copy(sub_56.ref());
        Variable var_4 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_4}); sink.start(_M_Then); sink.use(var_4); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_IndexAnnotations, term_183);
  } final public static boolean _M_AllMetaTerms_xS1_xZOM(Sink sink, int shared, int depth, Term term_31) {
    if (depth < 2000) {
      label_60: {
        if (term_31.descriptor() != _M__sNil)
        {   break label_60;
        }/*Contract*/ sink.start(_M_TRUE); sink.end(); return true;
      }
      label_265: {
        if (term_31.descriptor() != _M__sCons)
        {   break label_265;
        }Term sub_96 = term_31.sub(0).ref();
        if (sub_96.descriptor() != _M_Crsx_xterms_xS1)
        {   break label_265;
        }Term sub_217 = sub_96.sub(0).ref();Term sub_70 = sub_96.sub(1).ref();
        if (sub_70.descriptor() != _M_Crsx_xterm_xA1)
        {   break label_265;
        }Term sub_76 = sub_70.sub(0).ref();
        if (sub_76.descriptor() != _M_Crsx_xfreeTerm_xA7)
        {   break label_265;
        }Term sub_338 = sub_76.sub(0).ref();
        if (sub_338.descriptor() != _M__sNil)
        {   break label_265;
        }Term sub_11 = sub_76.sub(1).ref();
        if (sub_11.descriptor() != _M__sNil)
        {   break label_265;
        }Term sub_20 = sub_76.sub(2).ref();
        /* #METAVAR=sub */Term sub_185 = sub_76.sub(3).ref();
        if (sub_185.descriptor() != _M__sNil)
        {   break label_265;
        }Term sub_43 = term_31.sub(1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M_AllMetaTerms_xS1_xZOM); sink.copy(sub_43.ref());
        sink.end(); return true;
      }
      label_61: {
        /* #terms_S1_ZOM=term *//*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_AllMetaTerms_xS1_xZOM, term_31);
  } final public static boolean _M_AllMetaTerms(Sink sink, int shared, int depth, Term term_50) {
    if (depth < 2000) {
      label_72: {
        if (term_50.descriptor() != _M_Crsx_xterms)
        {   break label_72;
        }Term sub_91 = term_50.sub(0).ref();
        if (sub_91.descriptor() != _M_Crsx_xterm_xA1)
        {   break label_72;
        }Term sub_367 = sub_91.sub(0).ref();
        if (sub_367.descriptor() != _M_Crsx_xfreeTerm_xA7)
        {   break label_72;
        }Term sub_371 = sub_367.sub(0).ref();
        if (sub_371.descriptor() != _M__sNil)
        {   break label_72;
        }Term sub_103 = sub_367.sub(1).ref();
        if (sub_103.descriptor() != _M__sNil)
        {   break label_72;
        }Term sub_42 = sub_367.sub(2).ref();
        /* #METAVAR=sub */Term sub_353 = sub_367.sub(3).ref();
        if (sub_353.descriptor() != _M__sNil)
        {   break label_72;
        }Term sub_286 = term_50.sub(1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M_AllMetaTerms_xS1_xZOM); sink.copy(sub_286.ref());
        sink.end(); return true;
      }
      label_39: {
        /* #terms=term *//*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_AllMetaTerms, term_50);
  } final public static boolean _M_AllMetaArgumentsOpt(Sink sink, int shared, int depth, Term term_174) {
    if (depth < 2000) {
      label_25: {
        if (term_174.descriptor() != _M__sNil)
        {   break label_25;
        }/*Contract*/ sink.start(_M_TRUE); sink.end(); return true;
      }
      label_167: {
        if (term_174.descriptor() != _M__sCons)
        {   break label_167;
        }Term sub_75 = term_174.sub(0).ref();
        if (sub_75.descriptor() != _M_Crsx_xarguments)
        {   break label_167;
        }Term sub_167 = sub_75.sub(0).ref();Term sub_259 = sub_75.sub(1).ref();
        if (sub_259.descriptor() != _M__sNil)
        {   break label_167;
        }Term sub_111 = sub_75.sub(2).ref();Term sub_132 = term_174.sub(1).ref();
        if (sub_132.descriptor() != _M__sNil)
        {   break label_167;
        }/*Contract*/ sink.start(_M_TRUE); sink.end(); return true;
      }
      label_52: {
        if (term_174.descriptor() != _M__sCons)
        {   break label_52;
        }Term sub_63 = term_174.sub(0).ref();
        if (sub_63.descriptor() != _M_Crsx_xarguments)
        {   break label_52;
        }Term sub_138 = sub_63.sub(0).ref();Term sub_269 = sub_63.sub(1).ref();
        if (sub_269.descriptor() != _M__sCons)
        {   break label_52;
        }Term sub_26 = sub_269.sub(0).ref();
        /* #terms=sub */Term sub_219 = sub_269.sub(1).ref();
        if (sub_219.descriptor() != _M__sNil)
        {   break label_52;
        }Term sub_181 = sub_63.sub(2).ref();Term sub_241 = term_174.sub(1).ref();
        if (sub_241.descriptor() != _M__sNil)
        {   break label_52;
        }/*Contract*/
        sink.start(_M_AllMetaTerms); sink.copy(sub_26.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AllMetaArgumentsOpt, term_174);
  } final public static boolean _M_AllMetaInPatternRule(Sink sink, int shared, int depth, Term term_5) {
    if (depth < 2000) {
      label_148: {
        if (term_5.descriptor() != _M_Crsx_xruleDeclaration)
        {   break label_148;
        }Term sub_146 = term_5.sub(0).ref();
        /* #option?=sub */Term sub_25 = term_5.sub(1).ref();
        if (sub_25.descriptor() != _M_Crsx_xpattern)
        {   break label_148;
        }Term sub_190 = sub_25.sub(0).ref();
        /* #properties?=sub */Term sub_130 = sub_25.sub(1).ref();
        /* #constructor=sub */Term sub_140 = sub_25.sub(2).ref();
        /* #arguments?=sub */Term sub_149 = term_5.sub(2).ref();Term sub_52 = term_5.sub(3).ref();
        /* #contractum=sub *//*Contract*/
        sink.start(_M_AllMetaArgumentsOpt); sink.copy(sub_140.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AllMetaInPatternRule, term_5);
  } final public static boolean _M_IsPrimitive(Sink sink, int shared, int depth, Term term_99) {
    if (depth < 2000) {
      label_137: {
        if (term_99.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_137;
        }Term sub_150 = term_99.sub(0).ref();
        if (sub_150.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_137;
        }Term sub_50 = term_99.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M_StringEqual); sink.copy(sub_50.ref()); sink.literal("$");
        sink.end(); return true;
      }
      label_85: {
        if (term_99.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_85;
        }Term sub_142 = term_99.sub(0).ref();
        if (sub_142.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_85;
        }Term sub_197 = sub_142.sub(0).ref();/*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_IsPrimitive, term_99);
  } final public static boolean _M_IsDirectiveUnwrap(Sink sink, int shared, int depth, Term term_41) {
    if (depth < 2000) {
      label_69: {
        if (term_41.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_69;
        }Term sub_116 = term_41.sub(0).ref();
        if (sub_116.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_69;
        }Term sub_95 = term_41.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sStartsWith); sink.end(); sink.copy(sub_95.ref()); sink.literal("$");
        sink.end(); return true;
      }
      label_143: {
        if (term_41.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_143;
        }Term sub_541 = term_41.sub(0).ref();
        if (sub_541.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_143;
        }Term sub_173 = sub_541.sub(0).ref();/*Contract*/ sink.start(_M__sFalse); sink.end(); return true;
      }
    }
    return thunk(sink, _M_IsDirectiveUnwrap, term_41);
  } final public static boolean _M_IsDirective(Sink sink, int shared, int depth, Term term_17) {
    if (depth < 2000) {
      label_76: {
        if (term_17.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_76;
        }Term sub_82 = term_17.sub(0).ref();
        if (sub_82.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_76;
        }Term sub_30 = term_17.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M_StartsWith); sink.copy(sub_30.ref()); sink.literal("$");
        sink.end(); return true;
      }
      label_64: {
        if (term_17.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_64;
        }Term sub_161 = term_17.sub(0).ref();
        if (sub_161.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_64;
        }Term sub_174 = sub_161.sub(0).ref();/*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_IsDirective, term_17);
  } final public static boolean _M_ArityTerms_xS1_xZOM(Sink sink, int shared, int depth, Term term_29) {
    if (depth < 2000) {
      label_147: {
        if (term_29.descriptor() != _M__sNil)
        {   break label_147;
        }/*Contract*/ sink.literal(0); return true;
      }
      label_77: {
        if (term_29.descriptor() != _M__sCons)
        {   break label_77;
        }Term sub_157 = term_29.sub(0).ref();
        if (sub_157.descriptor() != _M_Crsx_xterms_xS1)
        {   break label_77;
        }Term sub_97 = sub_157.sub(0).ref();Term sub_1 = sub_157.sub(1).ref();
        /* #term=sub */Term sub_250 = term_29.sub(1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M_NumberPlus); sink.literal(1);
        sink.start(_M_ArityTerms_xS1_xZOM); sink.copy(sub_250.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ArityTerms_xS1_xZOM, term_29);
  } final public static boolean _M_ArityTerms(Sink sink, int shared, int depth, Term term_34) {
    if (depth < 2000) {
      label_3: {
        if (term_34.descriptor() != _M_Crsx_xterms)
        {   break label_3;
        }Term sub_294 = term_34.sub(0).ref();
        /* #term=sub */Term sub_193 = term_34.sub(1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M_NumberPlus); sink.literal(1);
        sink.start(_M_ArityTerms_xS1_xZOM); sink.copy(sub_193.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ArityTerms, term_34);
  } final public static boolean _M_ArityArguments(Sink sink, int shared, int depth, Term term_53) {
    if (depth < 2000) {
      label_5: {
        if (term_53.descriptor() != _M_Crsx_xarguments)
        {   break label_5;
        }Term sub_119 = term_53.sub(0).ref();Term sub_4 = term_53.sub(1).ref();
        if (sub_4.descriptor() != _M__sNil)
        {   break label_5;
        }Term sub_131 = term_53.sub(2).ref();/*Contract*/ sink.literal(0); return true;
      }
      label_8: {
        if (term_53.descriptor() != _M_Crsx_xarguments)
        {   break label_8;
        }Term sub_166 = term_53.sub(0).ref();Term sub_139 = term_53.sub(1).ref();
        if (sub_139.descriptor() != _M__sCons)
        {   break label_8;
        }Term sub_182 = sub_139.sub(0).ref();
        /* #terms=sub */Term sub_274 = sub_139.sub(1).ref();
        if (sub_274.descriptor() != _M__sNil)
        {   break label_8;
        }Term sub_107 = term_53.sub(2).ref();/*Contract*/
        sink.start(_M_ArityTerms); sink.copy(sub_182.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ArityArguments, term_53);
  } final public static boolean _M_ArityArgumentsOpt(Sink sink, int shared, int depth, Term term_165) {
    if (depth < 2000) {
      label_253: {
        if (term_165.descriptor() != _M__sNil)
        {   break label_253;
        }/*Contract*/ sink.literal(0); return true;
      }
      label_29: {
        if (term_165.descriptor() != _M__sCons)
        {   break label_29;
        }Term sub_188 = term_165.sub(0).ref();
        /* #arguments=sub */Term sub_210 = term_165.sub(1).ref();
        if (sub_210.descriptor() != _M__sNil)
        {   break label_29;
        }/*Contract*/
        sink.start(_M_ArityArguments); sink.copy(sub_188.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ArityArgumentsOpt, term_165);
  } 
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.parser.Crsx.init(context); org.crsx.compiler.std.Core.init(context); org.crsx.compiler.std.Num.init(context); org.crsx.compiler.std.String.init(context); org.crsx.compiler.std.List.init(context); context.register(_M_ANNOTATIONS); context.register(_M_DesugarPropertyList); context.register(_M_DesugarDispatchCases); context.register(_M_DesugarListTermList); context.register(_M_DesugarList); context.register(_M_DesugarFreeTermList); context.register(_M_DesugarTermList); context.register(_M_DesugarFreeTerms); context.register(_M_DesugarTerms); context.register(_M_DesugarDeclarations); context.register(_M_SugarPropertyList); context.register(_M_SugarDispatchCases); context.register(_M_SugarFreeTerms); context.register(_M_SugarTerms); context.register(_M_SugarTermsOpt); context.register(_M_IndexAnnotation); context.register(_M_Then); context.register(_M_IndexAnnotations); context.register(_M_AllMetaTerms_xS1_xZOM); context.register(_M_AllMetaTerms); context.register(_M_AllMetaArgumentsOpt); context.register(_M_AllMetaInPatternRule); context.register(_M_IsPrimitive); context.register(_M_IsDirectiveUnwrap); context.register(_M_IsDirective); context.register(_M_ArityTerms_xS1_xZOM); context.register(_M_ArityTerms); context.register(_M_ArityArguments); context.register(_M_ArityArgumentsOpt);
      initialized = true;
    }
  }

/* END MODULE « "/Users/villardl/Projects/crsx/crsx4_2/src/crsxutils.crs.java" » */
}