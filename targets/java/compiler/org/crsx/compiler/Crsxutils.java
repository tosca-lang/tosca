/* START MODULE /Users/villardl/Projects/crsx/crsx4/src/crsxutils.crs.java */
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
        term = force(sink.context(), term);
        if (term.descriptor() != _M_Crsx_xpropertyList)
        {   break label;
        }Term sub = forceSub(sink.context(), term, 0).ref();
        /* #property=sub */Term sub_4 = forceSub(sink.context(), term, 1).ref();
        /* #propertyList_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xpropertyList_xS1); sink.literal(";");
        sink.start(_M__sCons); sink.copy(sub.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.copy(sub_4.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarPropertyList, term);
  } final public static boolean _M_DesugarDispatchCases(Sink sink, int shared, int depth, Term term_92) {
    if (depth < 2000) {
      label_1: {
        term_92 = force(sink.context(), term_92);
        if (term_92.descriptor() != _M_Crsx_xdispatchCases)
        {   break label_1;
        }Term sub_57 = forceSub(sink.context(), term_92, 0).ref();
        /* #dispatchCase=sub */Term sub_87 = forceSub(sink.context(), term_92, 1).ref();
        /* #dispatchCases_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdispatchCases_xS1); sink.literal(";"); sink.copy(sub_57.ref());
        sink.end(); sink.copy(sub_87.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarDispatchCases, term_92);
  } final public static boolean _M_DesugarListTermList(Sink sink, int shared, int depth, Term term_66) {
    if (depth < 2000) {
      label_72: {
        term_66 = force(sink.context(), term_66);
        if (term_66.descriptor() != _M__sNil)
        {   break label_72;
        }/*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
      label_86: {
        term_66 = force(sink.context(), term_66);
        if (term_66.descriptor() != _M__sCons)
        {   break label_86;
        }Term sub_100 = forceSub(sink.context(), term_66, 0).ref();
        sub_100 = force(sink.context(), sub_100);
        if (sub_100.descriptor() != _M_Crsx_xtermList_xS1)
        {   break label_86;
        }Term sub_54 = forceSub(sink.context(), sub_100, 0).ref();Term sub_42 = forceSub(sink.context(), sub_100, 1).ref();
        sub_42 = force(sink.context(), sub_42);
        if (sub_42.descriptor() != _M__sNil)
        {   break label_86;
        }Term sub_12 = forceSub(sink.context(), term_66, 1).ref();
        sub_12 = force(sink.context(), sub_12);
        if (sub_12.descriptor() != _M__sNil)
        {   break label_86;
        }/*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
      label_51: {
        term_66 = force(sink.context(), term_66);
        if (term_66.descriptor() != _M__sCons)
        {   break label_51;
        }Term sub_88 = forceSub(sink.context(), term_66, 0).ref();
        sub_88 = force(sink.context(), sub_88);
        if (sub_88.descriptor() != _M_Crsx_xtermList_xS1)
        {   break label_51;
        }Term sub_9 = forceSub(sink.context(), sub_88, 0).ref();Term sub_67 = forceSub(sink.context(), sub_88, 1).ref();
        sub_67 = force(sink.context(), sub_67);
        if (sub_67.descriptor() != _M__sCons)
        {   break label_51;
        }Term sub_130 = forceSub(sink.context(), sub_67, 0).ref();
        sub_130 = force(sink.context(), sub_130);
        if (sub_130.descriptor() != _M_Crsx_xterm_xA1)
        {   break label_51;
        }Term sub_93 = forceSub(sink.context(), sub_130, 0).ref();
        /* #freeTerm=sub */Term sub_216 = forceSub(sink.context(), sub_67, 1).ref();
        sub_216 = force(sink.context(), sub_216);
        if (sub_216.descriptor() != _M__sNil)
        {   break label_51;
        }Term sub_29 = forceSub(sink.context(), term_66, 1).ref();
        sub_29 = force(sink.context(), sub_29);
        if (sub_29.descriptor() != _M__sNil)
        {   break label_51;
        }/*Contract*/ sink.copy(sub_93.ref()); return true;
      }
      label_97: {
        term_66 = force(sink.context(), term_66);
        if (term_66.descriptor() != _M__sCons)
        {   break label_97;
        }Term sub_41 = forceSub(sink.context(), term_66, 0).ref();
        sub_41 = force(sink.context(), sub_41);
        if (sub_41.descriptor() != _M_Crsx_xtermList_xS1)
        {   break label_97;
        }Term sub_61 = forceSub(sink.context(), sub_41, 0).ref();Term sub_40 = forceSub(sink.context(), sub_41, 1).ref();
        sub_40 = force(sink.context(), sub_40);
        if (sub_40.descriptor() != _M__sCons)
        {   break label_97;
        }Term sub_68 = forceSub(sink.context(), sub_40, 0).ref();
        /* #term=sub */Term sub_35 = forceSub(sink.context(), sub_40, 1).ref();
        sub_35 = force(sink.context(), sub_35);
        if (sub_35.descriptor() != _M__sNil)
        {   break label_97;
        }Term sub_26 = forceSub(sink.context(), term_66, 1).ref();
        sub_26 = force(sink.context(), sub_26);
        if (sub_26.descriptor() != _M__sCons)
        {   break label_97;
        }Term sub_27 = forceSub(sink.context(), sub_26, 0).ref();
        sub_27 = force(sink.context(), sub_27);
        if (sub_27.descriptor() != _M_Crsx_xtermList_xS1)
        {   break label_97;
        }Term sub_114 = forceSub(sink.context(), sub_27, 0).ref();Term sub_78 = forceSub(sink.context(), sub_27, 1).ref();
        sub_78 = force(sink.context(), sub_78);
        if (sub_78.descriptor() != _M__sNil)
        {   break label_97;
        }Term sub_3 = forceSub(sink.context(), sub_26, 1).ref();
        sub_3 = force(sink.context(), sub_3);
        if (sub_3.descriptor() != _M__sNil)
        {   break label_97;
        }/*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.literal("$Cons");
        sink.end();
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms); sink.copy(sub_68.ref());
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
      label_33: {
        term_66 = force(sink.context(), term_66);
        if (term_66.descriptor() != _M__sCons)
        {   break label_33;
        }Term sub_193 = forceSub(sink.context(), term_66, 0).ref();
        sub_193 = force(sink.context(), sub_193);
        if (sub_193.descriptor() != _M_Crsx_xtermList_xS1)
        {   break label_33;
        }Term sub_23 = forceSub(sink.context(), sub_193, 0).ref();Term sub_43 = forceSub(sink.context(), sub_193, 1).ref();
        sub_43 = force(sink.context(), sub_43);
        if (sub_43.descriptor() != _M__sCons)
        {   break label_33;
        }Term sub_96 = forceSub(sink.context(), sub_43, 0).ref();
        /* #term=sub */Term sub_92 = forceSub(sink.context(), sub_43, 1).ref();
        sub_92 = force(sink.context(), sub_92);
        if (sub_92.descriptor() != _M__sNil)
        {   break label_33;
        }Term sub_89 = forceSub(sink.context(), term_66, 1).ref();
        sub_89 = force(sink.context(), sub_89);
        if (sub_89.descriptor() != _M__sCons)
        {   break label_33;
        }Term sub_74 = forceSub(sink.context(), sub_89, 0).ref();
        sub_74 = force(sink.context(), sub_74);
        if (sub_74.descriptor() != _M_Crsx_xtermList_xS1)
        {   break label_33;
        }Term sub_118 = forceSub(sink.context(), sub_74, 0).ref();Term sub_75 = forceSub(sink.context(), sub_74, 1).ref();
        sub_75 = force(sink.context(), sub_75);
        if (sub_75.descriptor() != _M__sCons)
        {   break label_33;
        }Term sub_72 = forceSub(sink.context(), sub_75, 0).ref();
        /* #term2=sub */Term sub_95 = forceSub(sink.context(), sub_75, 1).ref();
        sub_95 = force(sink.context(), sub_95);
        if (sub_95.descriptor() != _M__sNil)
        {   break label_33;
        }Term sub_20 = forceSub(sink.context(), sub_89, 1).ref();
        /* #termList_S1*=sub *//*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.literal("$Cons");
        sink.end();
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xarguments); sink.literal("[");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms); sink.copy(sub_96.ref());
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms_xS1); sink.literal(",");
        sink.start(_M_Crsx_xterm_xA1);
        sink.start(_M_DesugarListTermList);
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xtermList_xS1); sink.literal(";");
        sink.start(_M__sCons); sink.copy(sub_72.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.copy(sub_20.ref());
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
    return thunk(sink, _M_DesugarListTermList, term_66);
  } final public static boolean _M_DesugarList(Sink sink, int shared, int depth, Term term_99) {
    if (depth < 2000) {
      label_11: {
        term_99 = force(sink.context(), term_99);
        if (term_99.descriptor() != _M_Crsx_xlist)
        {   break label_11;
        }Term sub_192 = forceSub(sink.context(), term_99, 0).ref();Term sub_163 = forceSub(sink.context(), term_99, 1).ref();
        sub_163 = force(sink.context(), sub_163);
        if (sub_163.descriptor() != _M__sNil)
        {   break label_11;
        }Term sub_479 = forceSub(sink.context(), term_99, 2).ref();/*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
      label_84: {
        term_99 = force(sink.context(), term_99);
        if (term_99.descriptor() != _M_Crsx_xlist)
        {   break label_84;
        }Term sub_113 = forceSub(sink.context(), term_99, 0).ref();Term sub_18 = forceSub(sink.context(), term_99, 1).ref();
        sub_18 = force(sink.context(), sub_18);
        if (sub_18.descriptor() != _M__sCons)
        {   break label_84;
        }Term sub_25 = forceSub(sink.context(), sub_18, 0).ref();
        /* #termList=sub */Term sub_19 = forceSub(sink.context(), sub_18, 1).ref();
        sub_19 = force(sink.context(), sub_19);
        if (sub_19.descriptor() != _M__sNil)
        {   break label_84;
        }Term sub_58 = forceSub(sink.context(), term_99, 2).ref();/*Contract*/
        sink.start(_M_DesugarListTermList);
        sink.start(_M_DesugarTermList); sink.copy(sub_25.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarList, term_99);
  } final public static boolean _M_DesugarFreeTermList(Sink sink, int shared, int depth, Term term_16) {
    if (depth < 2000) {
      label_7: {
        term_16 = force(sink.context(), term_16);
        if (term_16.descriptor() != _M_Crsx_xfreeTerm_xA4)
        {   break label_7;
        }Term sub_162 = forceSub(sink.context(), term_16, 0).ref();
        /* #annotations?=sub */Term sub_36 = forceSub(sink.context(), term_16, 1).ref();
        sub_36 = force(sink.context(), sub_36);
        if (sub_36.descriptor() != _M_Crsx_xlist)
        {   break label_7;
        }Term sub_76 = forceSub(sink.context(), sub_36, 0).ref();Term sub_99 = forceSub(sink.context(), sub_36, 1).ref();
        sub_99 = force(sink.context(), sub_99);
        if (sub_99.descriptor() != _M__sNil)
        {   break label_7;
        }Term sub_34 = forceSub(sink.context(), sub_36, 2).ref();/*Contract*/
        sink.start(_M_Crsx_xfreeTerm_xA1); sink.copy(sub_162.ref()); sink.start(_M__sNil); sink.end();
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
      label_93: {
        term_16 = force(sink.context(), term_16);
        if (term_16.descriptor() != _M_Crsx_xfreeTerm_xA4)
        {   break label_93;
        }Term sub_47 = forceSub(sink.context(), term_16, 0).ref();
        /* #annotations?=sub */Term sub_70 = forceSub(sink.context(), term_16, 1).ref();
        sub_70 = force(sink.context(), sub_70);
        if (sub_70.descriptor() != _M_Crsx_xlist)
        {   break label_93;
        }Term sub_7 = forceSub(sink.context(), sub_70, 0).ref();Term sub_138 = forceSub(sink.context(), sub_70, 1).ref();
        sub_138 = force(sink.context(), sub_138);
        if (sub_138.descriptor() != _M__sCons)
        {   break label_93;
        }Term sub_71 = forceSub(sink.context(), sub_138, 0).ref();
        /* #termList=sub */Term sub_234 = forceSub(sink.context(), sub_138, 1).ref();
        sub_234 = force(sink.context(), sub_234);
        if (sub_234.descriptor() != _M__sNil)
        {   break label_93;
        }Term sub_55 = forceSub(sink.context(), sub_70, 2).ref();/*Contract*/
        sink.start(_M_DesugarListTermList);
        sink.start(_M_DesugarTermList); sink.copy(sub_71.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarFreeTermList, term_16);
  } final public static boolean _M_DesugarTermList(Sink sink, int shared, int depth, Term term_25) {
    if (depth < 2000) {
      label_59: {
        term_25 = force(sink.context(), term_25);
        if (term_25.descriptor() != _M_Crsx_xtermList)
        {   break label_59;
        }Term sub_84 = forceSub(sink.context(), term_25, 0).ref();
        /* #term=sub */Term sub_98 = forceSub(sink.context(), term_25, 1).ref();
        /* #termList_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xtermList_xS1); sink.literal(";");
        sink.start(_M__sCons); sink.copy(sub_84.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.copy(sub_98.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarTermList, term_25);
  } final public static boolean _M_DesugarFreeTerms(Sink sink, int shared, int depth, Term term_94) {
    if (depth < 2000) {
      label_29: {
        term_94 = force(sink.context(), term_94);
        if (term_94.descriptor() != _M_Crsx_xfreeTerms)
        {   break label_29;
        }Term sub_189 = forceSub(sink.context(), term_94, 0).ref();
        /* #freeTerm=sub */Term sub_129 = forceSub(sink.context(), term_94, 1).ref();
        /* #freeTerms_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xfreeTerms_xS1); sink.literal(","); sink.copy(sub_189.ref());
        sink.end(); sink.copy(sub_129.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarFreeTerms, term_94);
  } final public static boolean _M_DesugarTerms(Sink sink, int shared, int depth, Term term_87) {
    if (depth < 2000) {
      label_54: {
        term_87 = force(sink.context(), term_87);
        if (term_87.descriptor() != _M_Crsx_xterms)
        {   break label_54;
        }Term sub_2 = forceSub(sink.context(), term_87, 0).ref();
        /* #term=sub */Term sub_119 = forceSub(sink.context(), term_87, 1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms_xS1); sink.literal(","); sink.copy(sub_2.ref());
        sink.end(); sink.copy(sub_119.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarTerms, term_87);
  } final public static boolean _M_DesugarDeclarations(Sink sink, int shared, int depth, Term term_13) {
    if (depth < 2000) {
      label_70: {
        term_13 = force(sink.context(), term_13);
        if (term_13.descriptor() != _M_Crsx_xdeclarations)
        {   break label_70;
        }Term sub_51 = forceSub(sink.context(), term_13, 0).ref();
        /* #declaration=sub */Term sub_164 = forceSub(sink.context(), term_13, 1).ref();
        /* #declarations_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
        sink.start(_M__sCons); sink.copy(sub_51.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end(); sink.copy(sub_164.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_DesugarDeclarations, term_13);
  } final public static boolean _M_SugarPropertyList(Sink sink, int shared, int depth, Term term_98) {
    if (depth < 2000) {
      label_65: {
        term_98 = force(sink.context(), term_98);
        if (term_98.descriptor() != _M__sNil)
        {   break label_65;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Internal error: cannot rewrite an empty list of properties.");
        sink.end(); return true;
      }
      label_26: {
        term_98 = force(sink.context(), term_98);
        if (term_98.descriptor() != _M__sCons)
        {   break label_26;
        }Term sub_28 = forceSub(sink.context(), term_98, 0).ref();
        sub_28 = force(sink.context(), sub_28);
        if (sub_28.descriptor() != _M_Crsx_xpropertyList_xS1)
        {   break label_26;
        }Term sub_128 = forceSub(sink.context(), sub_28, 0).ref();Term sub_15 = forceSub(sink.context(), sub_28, 1).ref();
        sub_15 = force(sink.context(), sub_15);
        if (sub_15.descriptor() != _M__sCons)
        {   break label_26;
        }Term sub_133 = forceSub(sink.context(), sub_15, 0).ref();
        /* #property=sub */Term sub_107 = forceSub(sink.context(), sub_15, 1).ref();
        sub_107 = force(sink.context(), sub_107);
        if (sub_107.descriptor() != _M__sNil)
        {   break label_26;
        }Term sub_5 = forceSub(sink.context(), term_98, 1).ref();
        /* #propertyList_S1*=sub *//*Contract*/
        sink.start(_M_Crsx_xpropertyList); sink.copy(sub_133.ref()); sink.copy(sub_5.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_SugarPropertyList, term_98);
  } final public static boolean _M_SugarDispatchCases(Sink sink, int shared, int depth, Term term_56) {
    if (depth < 2000) {
      label_5: {
        term_56 = force(sink.context(), term_56);
        if (term_56.descriptor() != _M__sNil)
        {   break label_5;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Assertion error: at least one dispatch case must be defined.");
        sink.end(); return true;
      }
      label_10: {
        term_56 = force(sink.context(), term_56);
        if (term_56.descriptor() != _M__sCons)
        {   break label_10;
        }Term sub_73 = forceSub(sink.context(), term_56, 0).ref();
        sub_73 = force(sink.context(), sub_73);
        if (sub_73.descriptor() != _M_Crsx_xdispatchCases_xS1)
        {   break label_10;
        }Term sub_63 = forceSub(sink.context(), sub_73, 0).ref();Term sub_48 = forceSub(sink.context(), sub_73, 1).ref();
        /* #dispatchCase=sub */Term sub_80 = forceSub(sink.context(), term_56, 1).ref();
        /* #dispatchCases_S1*=sub *//*Contract*/
        sink.start(_M_Crsx_xdispatchCases); sink.copy(sub_48.ref()); sink.copy(sub_80.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_SugarDispatchCases, term_56);
  } final public static boolean _M_SugarFreeTerms(Sink sink, int shared, int depth, Term term_3) {
    if (depth < 2000) {
      label_87: {
        term_3 = force(sink.context(), term_3);
        if (term_3.descriptor() != _M__sNil)
        {   break label_87;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Internal error: cannot rewrite an empty list of terms to term");
        sink.end(); return true;
      }
      label_125: {
        term_3 = force(sink.context(), term_3);
        if (term_3.descriptor() != _M__sCons)
        {   break label_125;
        }Term sub_81 = forceSub(sink.context(), term_3, 0).ref();
        sub_81 = force(sink.context(), sub_81);
        if (sub_81.descriptor() != _M_Crsx_xfreeTerms_xS1)
        {   break label_125;
        }Term sub_97 = forceSub(sink.context(), sub_81, 0).ref();Term sub_85 = forceSub(sink.context(), sub_81, 1).ref();
        /* #freeTerm=sub */Term sub_166 = forceSub(sink.context(), term_3, 1).ref();
        /* #freeTerms_S1*=sub *//*Contract*/
        sink.start(_M_Crsx_xfreeTerms); sink.copy(sub_85.ref()); sink.copy(sub_166.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_SugarFreeTerms, term_3);
  } final public static boolean _M_SugarTerms(Sink sink, int shared, int depth, Term term_64) {
    if (depth < 2000) {
      label_15: {
        term_64 = force(sink.context(), term_64);
        if (term_64.descriptor() != _M__sNil)
        {   break label_15;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("Internal error: cannot rewrite an empty list of terms to term");
        sink.end(); return true;
      }
      label_45: {
        term_64 = force(sink.context(), term_64);
        if (term_64.descriptor() != _M__sCons)
        {   break label_45;
        }Term sub_6 = forceSub(sink.context(), term_64, 0).ref();
        sub_6 = force(sink.context(), sub_6);
        if (sub_6.descriptor() != _M_Crsx_xterms_xS1)
        {   break label_45;
        }Term sub_45 = forceSub(sink.context(), sub_6, 0).ref();Term sub_148 = forceSub(sink.context(), sub_6, 1).ref();
        /* #term=sub */Term sub_62 = forceSub(sink.context(), term_64, 1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M_Crsx_xterms); sink.copy(sub_148.ref()); sink.copy(sub_62.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_SugarTerms, term_64);
  } final public static boolean _M_SugarTermsOpt(Sink sink, int shared, int depth, Term term_93) {
    if (depth < 2000) {
      label_117: {
        term_93 = force(sink.context(), term_93);
        if (term_93.descriptor() != _M__sNil)
        {   break label_117;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_48: {
        term_93 = force(sink.context(), term_93);
        if (term_93.descriptor() != _M__sCons)
        {   break label_48;
        }Term sub_0 = forceSub(sink.context(), term_93, 0).ref();
        sub_0 = force(sink.context(), sub_0);
        if (sub_0.descriptor() != _M_Crsx_xterms_xS1)
        {   break label_48;
        }Term sub_194 = forceSub(sink.context(), sub_0, 0).ref();Term sub_83 = forceSub(sink.context(), sub_0, 1).ref();
        /* #term=sub */Term sub_38 = forceSub(sink.context(), term_93, 1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xterms); sink.copy(sub_83.ref()); sink.copy(sub_38.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_SugarTermsOpt, term_93);
  } final public static boolean _M_IndexAnnotation(Sink sink, int shared, int depth, Properties props, Term term_54, Term term_58) {
    if (depth < 2000) {
      label_68: {
        term_54 = force(sink.context(), term_54);
        if (term_54.descriptor() != _M_Crsx_xannotation)
        {   break label_68;
        }Term sub_8 = forceSub(sink.context(), term_54, 0).ref();Term sub_186 = forceSub(sink.context(), term_54, 1).ref();
        sub_186 = force(sink.context(), sub_186);
        if (sub_186.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_68;
        }Term sub_79 = forceSub(sink.context(), sub_186, 0).ref();
        sub_79 = force(sink.context(), sub_79);
        if (sub_79.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_68;
        }Term sub_17 = forceSub(sink.context(), sub_186, 1).ref();
        /* #CONSTRUCTOR=sub */Term sub_64 = forceSub(sink.context(), term_54, 2).ref();
        /* #arguments?=sub */
        term_58 = force(sink.context(), term_58);
        if (term_58.descriptor() != _M_CONTINUATION)
        {   break label_68;
        }Term sub_159 = forceSub(sink.context(), term_58, 0).ref();
        Variable binder = term_58.binders(0)[0];
        /* #=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sTrace); sink.end();sink.properties(safeRef(props));Term term_18;
        {
          BufferSink buf = sink.context().makeBuffer(); buf.copy(sub_64.ref());
          term_18 = buf.term();
        }
        sub_17 = force(sink.context(), sub_17);
        Sink.property(sink, sub_17, term_18);Term term_5;
        {
          BufferSink buf_88 = sink.context().makeBuffer(); buf_88.start(_M_OK); buf_88.end();
          term_5 = buf_88.term();
        }
        sink.substitute(sub_159.ref(), new Variable[] { binder }, new Term[] {term_5});
        sink.end(); return true; 
      }
    }
    return thunk(sink, _M_IndexAnnotation, props, term_54, term_58);
  }  final public static boolean _M_Then(Sink sink, int shared, int depth, Properties props_44, Term term_40) {
    if (depth < 2000) {
      label_43: {
        term_40 = force(sink.context(), term_40);
        if (term_40.descriptor() != _M_OK)
        {   break label_43;
        }/*Contract*/sink.properties(safeRef(props_44));
        sink.start(_M_ANNOTATIONS);
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Then, props_44, term_40);
  } final public static boolean _M_IndexAnnotations(Sink sink, int shared, int depth, Term term_24) {
    if (depth < 2000) {
      label_36: {
        term_24 = force(sink.context(), term_24);
        if (term_24.descriptor() != _M__sNil)
        {   break label_36;
        }/*Contract*/ sink.start(_M_ANNOTATIONS); sink.end(); return true;
      }
      label_160: {
        term_24 = force(sink.context(), term_24);
        if (term_24.descriptor() != _M__sCons)
        {   break label_160;
        }Term sub_105 = forceSub(sink.context(), term_24, 0).ref();
        sub_105 = force(sink.context(), sub_105);
        if (sub_105.descriptor() != _M_Crsx_xannotations)
        {   break label_160;
        }Term sub_287 = forceSub(sink.context(), sub_105, 0).ref();
        /* #annotation+=sub */Term sub_49 = forceSub(sink.context(), term_24, 1).ref();
        sub_49 = force(sink.context(), sub_49);
        if (sub_49.descriptor() != _M__sNil)
        {   break label_160;
        }/*Contract*/
        sink.start(_M_SeqMap);
        Variable var = sink.context().makeVariable("anno");
        Variable var_81 = sink.context().makeVariable("cont");
        sink.binds(new Variable[] {var,var_81});
        sink.start(_M_IndexAnnotation); sink.use(var); sink.use(var_81);
        sink.end(); sink.copy(sub_287.ref());
        Variable var_45 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_45}); sink.start(_M_Then); sink.use(var_45); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_IndexAnnotations, term_24);
  } final public static boolean _M_AllMetaTerms_xS1_xZOM(Sink sink, int shared, int depth, Term term_32) {
    if (depth < 2000) {
      label_167: {
        term_32 = force(sink.context(), term_32);
        if (term_32.descriptor() != _M__sNil)
        {   break label_167;
        }/*Contract*/ sink.start(_M_TRUE); sink.end(); return true;
      }
      label_13: {
        term_32 = force(sink.context(), term_32);
        if (term_32.descriptor() != _M__sCons)
        {   break label_13;
        }Term sub_220 = forceSub(sink.context(), term_32, 0).ref();
        sub_220 = force(sink.context(), sub_220);
        if (sub_220.descriptor() != _M_Crsx_xterms_xS1)
        {   break label_13;
        }Term sub_101 = forceSub(sink.context(), sub_220, 0).ref();Term sub_134 = forceSub(sink.context(), sub_220, 1).ref();
        sub_134 = force(sink.context(), sub_134);
        if (sub_134.descriptor() != _M_Crsx_xterm_xA1)
        {   break label_13;
        }Term sub_238 = forceSub(sink.context(), sub_134, 0).ref();
        sub_238 = force(sink.context(), sub_238);
        if (sub_238.descriptor() != _M_Crsx_xfreeTerm_xA7)
        {   break label_13;
        }Term sub_13 = forceSub(sink.context(), sub_238, 0).ref();
        sub_13 = force(sink.context(), sub_13);
        if (sub_13.descriptor() != _M__sNil)
        {   break label_13;
        }Term sub_21 = forceSub(sink.context(), sub_238, 1).ref();
        sub_21 = force(sink.context(), sub_21);
        if (sub_21.descriptor() != _M__sNil)
        {   break label_13;
        }Term sub_11 = forceSub(sink.context(), sub_238, 2).ref();
        /* #METAVAR=sub */Term sub_146 = forceSub(sink.context(), sub_238, 3).ref();
        sub_146 = force(sink.context(), sub_146);
        if (sub_146.descriptor() != _M__sNil)
        {   break label_13;
        }Term sub_210 = forceSub(sink.context(), term_32, 1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M_AllMetaTerms_xS1_xZOM); sink.copy(sub_210.ref());
        sink.end(); return true;
      }
      label_171: {
        /* #terms_S1_ZOM=term *//*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_AllMetaTerms_xS1_xZOM, term_32);
  } final public static boolean _M_AllMetaTerms(Sink sink, int shared, int depth, Term term_6) {
    if (depth < 2000) {
      label_69: {
        term_6 = force(sink.context(), term_6);
        if (term_6.descriptor() != _M_Crsx_xterms)
        {   break label_69;
        }Term sub_16 = forceSub(sink.context(), term_6, 0).ref();
        sub_16 = force(sink.context(), sub_16);
        if (sub_16.descriptor() != _M_Crsx_xterm_xA1)
        {   break label_69;
        }Term sub_33 = forceSub(sink.context(), sub_16, 0).ref();
        sub_33 = force(sink.context(), sub_33);
        if (sub_33.descriptor() != _M_Crsx_xfreeTerm_xA7)
        {   break label_69;
        }Term sub_180 = forceSub(sink.context(), sub_33, 0).ref();
        sub_180 = force(sink.context(), sub_180);
        if (sub_180.descriptor() != _M__sNil)
        {   break label_69;
        }Term sub_37 = forceSub(sink.context(), sub_33, 1).ref();
        sub_37 = force(sink.context(), sub_37);
        if (sub_37.descriptor() != _M__sNil)
        {   break label_69;
        }Term sub_30 = forceSub(sink.context(), sub_33, 2).ref();
        /* #METAVAR=sub */Term sub_46 = forceSub(sink.context(), sub_33, 3).ref();
        sub_46 = force(sink.context(), sub_46);
        if (sub_46.descriptor() != _M__sNil)
        {   break label_69;
        }Term sub_66 = forceSub(sink.context(), term_6, 1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M_AllMetaTerms_xS1_xZOM); sink.copy(sub_66.ref());
        sink.end(); return true;
      }
      label_4: {
        /* #terms=term *//*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_AllMetaTerms, term_6);
  } final public static boolean _M_AllMetaArgumentsOpt(Sink sink, int shared, int depth, Term term_121) {
    if (depth < 2000) {
      label_28: {
        term_121 = force(sink.context(), term_121);
        if (term_121.descriptor() != _M__sNil)
        {   break label_28;
        }/*Contract*/ sink.start(_M_TRUE); sink.end(); return true;
      }
      label_27: {
        term_121 = force(sink.context(), term_121);
        if (term_121.descriptor() != _M__sCons)
        {   break label_27;
        }Term sub_185 = forceSub(sink.context(), term_121, 0).ref();
        sub_185 = force(sink.context(), sub_185);
        if (sub_185.descriptor() != _M_Crsx_xarguments)
        {   break label_27;
        }Term sub_104 = forceSub(sink.context(), sub_185, 0).ref();Term sub_60 = forceSub(sink.context(), sub_185, 1).ref();
        sub_60 = force(sink.context(), sub_60);
        if (sub_60.descriptor() != _M__sNil)
        {   break label_27;
        }Term sub_384 = forceSub(sink.context(), sub_185, 2).ref();Term sub_126 = forceSub(sink.context(), term_121, 1).ref();
        sub_126 = force(sink.context(), sub_126);
        if (sub_126.descriptor() != _M__sNil)
        {   break label_27;
        }/*Contract*/ sink.start(_M_TRUE); sink.end(); return true;
      }
      label_90: {
        term_121 = force(sink.context(), term_121);
        if (term_121.descriptor() != _M__sCons)
        {   break label_90;
        }Term sub_31 = forceSub(sink.context(), term_121, 0).ref();
        sub_31 = force(sink.context(), sub_31);
        if (sub_31.descriptor() != _M_Crsx_xarguments)
        {   break label_90;
        }Term sub_365 = forceSub(sink.context(), sub_31, 0).ref();Term sub_39 = forceSub(sink.context(), sub_31, 1).ref();
        sub_39 = force(sink.context(), sub_39);
        if (sub_39.descriptor() != _M__sCons)
        {   break label_90;
        }Term sub_247 = forceSub(sink.context(), sub_39, 0).ref();
        /* #terms=sub */Term sub_188 = forceSub(sink.context(), sub_39, 1).ref();
        sub_188 = force(sink.context(), sub_188);
        if (sub_188.descriptor() != _M__sNil)
        {   break label_90;
        }Term sub_145 = forceSub(sink.context(), sub_31, 2).ref();Term sub_65 = forceSub(sink.context(), term_121, 1).ref();
        sub_65 = force(sink.context(), sub_65);
        if (sub_65.descriptor() != _M__sNil)
        {   break label_90;
        }/*Contract*/
        sink.start(_M_AllMetaTerms); sink.copy(sub_247.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AllMetaArgumentsOpt, term_121);
  } final public static boolean _M_AllMetaInPatternRule(Sink sink, int shared, int depth, Term term_48) {
    if (depth < 2000) {
      label_123: {
        term_48 = force(sink.context(), term_48);
        if (term_48.descriptor() != _M_Crsx_xruleDeclaration)
        {   break label_123;
        }Term sub_10 = forceSub(sink.context(), term_48, 0).ref();
        /* #option?=sub */Term sub_195 = forceSub(sink.context(), term_48, 1).ref();
        sub_195 = force(sink.context(), sub_195);
        if (sub_195.descriptor() != _M_Crsx_xpattern)
        {   break label_123;
        }Term sub_132 = forceSub(sink.context(), sub_195, 0).ref();
        /* #properties?=sub */Term sub_187 = forceSub(sink.context(), sub_195, 1).ref();
        /* #constructor=sub */Term sub_44 = forceSub(sink.context(), sub_195, 2).ref();
        /* #arguments?=sub */Term sub_257 = forceSub(sink.context(), term_48, 2).ref();Term sub_268 = forceSub(sink.context(), term_48, 3).ref();
        /* #contractum=sub *//*Contract*/
        sink.start(_M_AllMetaArgumentsOpt); sink.copy(sub_44.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AllMetaInPatternRule, term_48);
  } final public static boolean _M_IsPrimitive(Sink sink, int shared, int depth, Term term_33) {
    if (depth < 2000) {
      label_24: {
        term_33 = force(sink.context(), term_33);
        if (term_33.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_24;
        }Term sub_236 = forceSub(sink.context(), term_33, 0).ref();
        sub_236 = force(sink.context(), sub_236);
        if (sub_236.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_24;
        }Term sub_32 = forceSub(sink.context(), term_33, 1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M_StringEqual); sink.copy(sub_32.ref()); sink.literal("$");
        sink.end(); return true;
      }
      label_35: {
        term_33 = force(sink.context(), term_33);
        if (term_33.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_35;
        }Term sub_56 = forceSub(sink.context(), term_33, 0).ref();
        sub_56 = force(sink.context(), sub_56);
        if (sub_56.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_35;
        }Term sub_91 = forceSub(sink.context(), sub_56, 0).ref();/*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_IsPrimitive, term_33);
  } final public static boolean _M_IsDirectiveUnwrap(Sink sink, int shared, int depth, Term term_46) {
    if (depth < 2000) {
      label_175: {
        term_46 = force(sink.context(), term_46);
        if (term_46.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_175;
        }Term sub_297 = forceSub(sink.context(), term_46, 0).ref();
        sub_297 = force(sink.context(), sub_297);
        if (sub_297.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_175;
        }Term sub_120 = forceSub(sink.context(), term_46, 1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sStartsWith); sink.end(); sink.copy(sub_120.ref()); sink.literal("$");
        sink.end(); return true;
      }
      label_52: {
        term_46 = force(sink.context(), term_46);
        if (term_46.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_52;
        }Term sub_155 = forceSub(sink.context(), term_46, 0).ref();
        sub_155 = force(sink.context(), sub_155);
        if (sub_155.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_52;
        }Term sub_208 = forceSub(sink.context(), sub_155, 0).ref();/*Contract*/ sink.start(_M__sFalse); sink.end(); return true;
      }
    }
    return thunk(sink, _M_IsDirectiveUnwrap, term_46);
  } final public static boolean _M_IsDirective(Sink sink, int shared, int depth, Term term_75) {
    if (depth < 2000) {
      label_42: {
        term_75 = force(sink.context(), term_75);
        if (term_75.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_42;
        }Term sub_50 = forceSub(sink.context(), term_75, 0).ref();
        sub_50 = force(sink.context(), sub_50);
        if (sub_50.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_42;
        }Term sub_156 = forceSub(sink.context(), term_75, 1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M_StartsWith); sink.copy(sub_156.ref()); sink.literal("$");
        sink.end(); return true;
      }
      label_92: {
        term_75 = force(sink.context(), term_75);
        if (term_75.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_92;
        }Term sub_82 = forceSub(sink.context(), term_75, 0).ref();
        sub_82 = force(sink.context(), sub_82);
        if (sub_82.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_92;
        }Term sub_168 = forceSub(sink.context(), sub_82, 0).ref();/*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_IsDirective, term_75);
  } final public static boolean _M_ArityTerms_xS1_xZOM(Sink sink, int shared, int depth, Term term_59) {
    if (depth < 2000) {
      label_80: {
        term_59 = force(sink.context(), term_59);
        if (term_59.descriptor() != _M__sNil)
        {   break label_80;
        }/*Contract*/ sink.literal(0); return true;
      }
      label_25: {
        term_59 = force(sink.context(), term_59);
        if (term_59.descriptor() != _M__sCons)
        {   break label_25;
        }Term sub_160 = forceSub(sink.context(), term_59, 0).ref();
        sub_160 = force(sink.context(), sub_160);
        if (sub_160.descriptor() != _M_Crsx_xterms_xS1)
        {   break label_25;
        }Term sub_143 = forceSub(sink.context(), sub_160, 0).ref();Term sub_123 = forceSub(sink.context(), sub_160, 1).ref();
        /* #term=sub */Term sub_59 = forceSub(sink.context(), term_59, 1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M_NumberPlus); sink.literal(1);
        sink.start(_M_ArityTerms_xS1_xZOM); sink.copy(sub_59.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ArityTerms_xS1_xZOM, term_59);
  } final public static boolean _M_ArityTerms(Sink sink, int shared, int depth, Term term_65) {
    if (depth < 2000) {
      label_21: {
        term_65 = force(sink.context(), term_65);
        if (term_65.descriptor() != _M_Crsx_xterms)
        {   break label_21;
        }Term sub_190 = forceSub(sink.context(), term_65, 0).ref();
        /* #term=sub */Term sub_102 = forceSub(sink.context(), term_65, 1).ref();
        /* #terms_S1*=sub *//*Contract*/
        sink.start(_M_NumberPlus); sink.literal(1);
        sink.start(_M_ArityTerms_xS1_xZOM); sink.copy(sub_102.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ArityTerms, term_65);
  } final public static boolean _M_ArityArguments(Sink sink, int shared, int depth, Term term_167) {
    if (depth < 2000) {
      label_165: {
        term_167 = force(sink.context(), term_167);
        if (term_167.descriptor() != _M_Crsx_xarguments)
        {   break label_165;
        }Term sub_277 = forceSub(sink.context(), term_167, 0).ref();Term sub_285 = forceSub(sink.context(), term_167, 1).ref();
        sub_285 = force(sink.context(), sub_285);
        if (sub_285.descriptor() != _M__sNil)
        {   break label_165;
        }Term sub_109 = forceSub(sink.context(), term_167, 2).ref();/*Contract*/ sink.literal(0); return true;
      }
      label_34: {
        term_167 = force(sink.context(), term_167);
        if (term_167.descriptor() != _M_Crsx_xarguments)
        {   break label_34;
        }Term sub_290 = forceSub(sink.context(), term_167, 0).ref();Term sub_382 = forceSub(sink.context(), term_167, 1).ref();
        sub_382 = force(sink.context(), sub_382);
        if (sub_382.descriptor() != _M__sCons)
        {   break label_34;
        }Term sub_251 = forceSub(sink.context(), sub_382, 0).ref();
        /* #terms=sub */Term sub_379 = forceSub(sink.context(), sub_382, 1).ref();
        sub_379 = force(sink.context(), sub_379);
        if (sub_379.descriptor() != _M__sNil)
        {   break label_34;
        }Term sub_221 = forceSub(sink.context(), term_167, 2).ref();/*Contract*/
        sink.start(_M_ArityTerms); sink.copy(sub_251.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ArityArguments, term_167);
  } final public static boolean _M_ArityArgumentsOpt(Sink sink, int shared, int depth, Term term_29) {
    if (depth < 2000) {
      label_6: {
        term_29 = force(sink.context(), term_29);
        if (term_29.descriptor() != _M__sNil)
        {   break label_6;
        }/*Contract*/ sink.literal(0); return true;
      }
      label_64: {
        term_29 = force(sink.context(), term_29);
        if (term_29.descriptor() != _M__sCons)
        {   break label_64;
        }Term sub_151 = forceSub(sink.context(), term_29, 0).ref();
        /* #arguments=sub */Term sub_103 = forceSub(sink.context(), term_29, 1).ref();
        sub_103 = force(sink.context(), sub_103);
        if (sub_103.descriptor() != _M__sNil)
        {   break label_64;
        }/*Contract*/
        sink.start(_M_ArityArguments); sink.copy(sub_151.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ArityArgumentsOpt, term_29);
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