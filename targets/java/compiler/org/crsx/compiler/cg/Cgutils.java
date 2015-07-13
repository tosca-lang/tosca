/* START MODULE /Users/villardl/Projects/crsx/crsx4/src/cg/cgutils.crs.java */
/** Generated File */package org.crsx.compiler.cg;
import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;
import static org.crsx.runtime.Normalizer.force;
import static org.crsx.runtime.Normalizer.forceSub;
import static org.crsx.runtime.Reference.safeRef;

import org.crsx.runtime.*;
import org.crsx.runtime.ConstructionDescriptor.*;
import static org.crsx.runtime.Primitives.*;
import static org.crsx.compiler.std.Core.*;
import static org.crsx.compiler.std.Text.*;
import static org.crsx.compiler.std.String.*; import static org.crsx.compiler.parser.Crsx.*;

public class Cgutils
{
  final public static ConstructionDescriptor _M_BOUND = makeData("BOUND");
  final public static ConstructionDescriptor _M_FRESH = makeData("FRESH");
  final public static ConstructionDescriptor _M_TEXT = makeData("TEXT");
  final public static ConstructionDescriptor _M_META = makeData("META"); final public static ConstructionDescriptor _M_NO = makeData("NO"); final public static ConstructionDescriptor _M_YES = makeData("YES");
  final public static ConstructionDescriptor _M_TEXTS = makeData("TEXTS");
  final public static ConstructionDescriptor _M_STRINGS = makeData("STRINGS");
  final public static ConstructionDescriptor _M_NOENTRY = makeData("NOENTRY");
  final public static DynamicFunctionDescriptor _M_ToJavaIdString = makeFunction("ToJavaIdString", Cgutils.class, "_M_ToJavaIdString");
  final public static DynamicFunctionDescriptor _M_ToJavaId = makeFunction("ToJavaId", Cgutils.class, "_M_ToJavaId");
  final public static DynamicFunctionDescriptor _M_Literal = makeFunction("Literal", Cgutils.class, "_M_Literal");
  final public static DynamicFunctionDescriptor _M_QuotedConstructor = makeFunction("QuotedConstructor", Cgutils.class, "_M_QuotedConstructor");
  final public static DynamicFunctionDescriptor _M_Qualifier = makeFunction("Qualifier", Cgutils.class, "_M_Qualifier");
  final public static DynamicFunctionDescriptor _M_Descriptor = makeFunction("Descriptor", Cgutils.class, "_M_Descriptor");
  final public static DynamicFunctionDescriptor _M_Variable0 = makeFunction("Variable0", Cgutils.class, "_M_Variable0");
  final public static DynamicFunctionDescriptor _M_Variable = makeFunction("Variable", Cgutils.class, "_M_Variable");
  final public static DynamicFunctionDescriptor _M_VarKey = makeFunction("VarKey", Cgutils.class, "_M_VarKey");
  final public static DynamicFunctionDescriptor _M_BinderKey = makeFunction("BinderKey", Cgutils.class, "_M_BinderKey");
  final public static DynamicFunctionDescriptor _M_DispatchedMetaVarBinders2 = makeFunction("DispatchedMetaVarBinders2", Cgutils.class, "_M_DispatchedMetaVarBinders2");
  final public static DynamicFunctionDescriptor _M_DispatchedMetaVarBinders1 = makeFunction("DispatchedMetaVarBinders1", Cgutils.class, "_M_DispatchedMetaVarBinders1");
  final public static DynamicFunctionDescriptor _M_DispatchedMetaVarBinders = makeFunction("DispatchedMetaVarBinders", Cgutils.class, "_M_DispatchedMetaVarBinders");
  final public static DynamicFunctionDescriptor _M_DispatchedMetaVar2 = makeFunction("DispatchedMetaVar2", Cgutils.class, "_M_DispatchedMetaVar2");
  final public static DynamicFunctionDescriptor _M_DispatchedMetaVar1 = makeFunction("DispatchedMetaVar1", Cgutils.class, "_M_DispatchedMetaVar1");
  final public static DynamicFunctionDescriptor _M_DispatchedMetaVar = makeFunction("DispatchedMetaVar", Cgutils.class, "_M_DispatchedMetaVar");
  final public static DynamicFunctionDescriptor _M_MetaDispatchKey = makeFunction("MetaDispatchKey", Cgutils.class, "_M_MetaDispatchKey");
  final public static DynamicFunctionDescriptor _M_AddMetaVar0 = makeFunction("AddMetaVar0", Cgutils.class, "_M_AddMetaVar0");
  final public static DynamicFunctionDescriptor _M_AddMetaVar = makeFunction("AddMetaVar", Cgutils.class, "_M_AddMetaVar");
  final public static DynamicFunctionDescriptor _M_MetaKey = makeFunction("MetaKey", Cgutils.class, "_M_MetaKey");
  final public static DynamicFunctionDescriptor _M_MetaVar0 = makeFunction("MetaVar0", Cgutils.class, "_M_MetaVar0");
  final public static DynamicFunctionDescriptor _M_MetaVar = makeFunction("MetaVar", Cgutils.class, "_M_MetaVar");
  final public static DynamicFunctionDescriptor _M_UnMETABinders = makeFunction("UnMETABinders", Cgutils.class, "_M_UnMETABinders");
  final public static DynamicFunctionDescriptor _M_UnMETA = makeFunction("UnMETA", Cgutils.class, "_M_UnMETA");
  final public static DynamicFunctionDescriptor _M_UnSTRING = makeFunction("UnSTRING", Cgutils.class, "_M_UnSTRING");
  final public static DynamicFunctionDescriptor _M_UnTEXT = makeFunction("UnTEXT", Cgutils.class, "_M_UnTEXT");final public static boolean _M_ToJavaIdString(Sink sink, int shared, int depth, Term term) {
    if (depth < 2000) {
      sink.start(_M_Text_Mangle); sink.copy(term.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_ToJavaIdString, term);
  } final public static boolean _M_ToJavaId(Sink sink, int shared, int depth, Term term_86) {
    if (depth < 2000) {
      label: {
        term_86 = force(sink.context(), term_86);
        if (term_86.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label;
        }Term sub = forceSub(sink.context(), term_86, 0).ref();
        sub = force(sink.context(), sub);
        if (sub.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label;
        }Term sub_17 = forceSub(sink.context(), term_86, 1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M_Text_Mangle);
        sink.start(_M_UpCaseFirst); sink.copy(sub_17.ref());
        sink.end();
        sink.end(); return true;
      }
      label_3: {
        term_86 = force(sink.context(), term_86);
        if (term_86.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_3;
        }Term sub_30 = forceSub(sink.context(), term_86, 0).ref();
        /* #reserved=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sEqual); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sShow); sink.end(); sink.copy(sub_30.ref());
        sink.end(); sink.literal(":");
        sink.end();
        sink.start(_M__sTextCons);
        sink.start(_M__sTextChars); sink.literal(" _M_Colon ");
        sink.end();Term term_72;
        {
          BufferSink buf = sink.context().makeBuffer(); buf.start(_M_STRING); buf.literal(1); buf.end();
          term_72 = buf.term();
        } sink.propertyNamed("$LineLocation", term_72);Term term_60;
        {
          BufferSink buf_47 = sink.context().makeBuffer(); buf_47.start(_M_STRING); buf_47.literal(1); buf_47.end();
          term_60 = buf_47.term();
        } sink.propertyNamed("$ColumnLocation", term_60);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); sink.start(_M__sTextNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ToJavaId, term_86);
  } final public static boolean _M_Literal(Sink sink, int shared, int depth, Term term_37) {
    if (depth < 2000) {
      label_31: {
        term_37 = force(sink.context(), term_37);
        if (term_37.descriptor() != _M_Crsx_xliteral_xA1)
        {   break label_31;
        }Term sub_36 = forceSub(sink.context(), term_37, 0).ref();
        /* #STRING=sub *//*Contract*/
        sink.start(_M_StringToText); sink.copy(sub_36.ref());
        sink.end(); return true;
      }
      label_40: {
        term_37 = force(sink.context(), term_37);
        if (term_37.descriptor() != _M_Crsx_xliteral_xA2)
        {   break label_40;
        }Term sub_32 = forceSub(sink.context(), term_37, 0).ref();
        /* #NUMBER=sub *//*Contract*/
        sink.start(_M_StringToText); sink.copy(sub_32.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Literal, term_37);
  } final public static boolean _M_QuotedConstructor(Sink sink, int shared, int depth, Term term_27) {
    if (depth < 2000) {
      label_63: {
        term_27 = force(sink.context(), term_27);
        if (term_27.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_63;
        }Term sub_33 = forceSub(sink.context(), term_27, 0).ref();
        sub_33 = force(sink.context(), sub_33);
        if (sub_33.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_63;
        }Term sub_79 = forceSub(sink.context(), term_27, 1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M_Text_QuoteEscape); sink.copy(sub_79.ref());
        sink.end(); return true;
      }
      label_41: {
        term_27 = force(sink.context(), term_27);
        if (term_27.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_41;
        }Term sub_88 = forceSub(sink.context(), term_27, 0).ref();
        /* #reserved=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sEqual); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sShow); sink.end(); sink.copy(sub_88.ref());
        sink.end(); sink.literal(":");
        sink.end();
        sink.start(_M__sTextCons);
        sink.start(_M__sTextChars); sink.literal(" Colon ");
        sink.end();Term term_12;
        {
          BufferSink buf_51 = sink.context().makeBuffer(); buf_51.start(_M_STRING); buf_51.literal(1); buf_51.end();
          term_12 = buf_51.term();
        } sink.propertyNamed("$LineLocation", term_12);Term term_8;
        {
          BufferSink buf_69 = sink.context().makeBuffer(); buf_69.start(_M_STRING); buf_69.literal(1); buf_69.end();
          term_8 = buf_69.term();
        } sink.propertyNamed("$ColumnLocation", term_8);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); sink.start(_M__sTextNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_QuotedConstructor, term_27);
  } final public static boolean _M_Qualifier(Sink sink, int shared, int depth, Term term_84) {
    if (depth < 2000) {
      label_47: {
        term_84 = force(sink.context(), term_84);
        if (term_84.descriptor() != _M_Crsx_xqualifier_xA1)
        {   break label_47;
        }Term sub_7 = forceSub(sink.context(), term_84, 0).ref();
        /* #CONSTRUCTOR=sub */Term sub_84 = forceSub(sink.context(), term_84, 1).ref();Term sub_10 = forceSub(sink.context(), term_84, 2).ref();
        sub_10 = force(sink.context(), sub_10);
        if (sub_10.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_47;
        }/*Contract*/
        sink.start(_M__sTextCons);Term term_5;
        {
          BufferSink buf_85 = sink.context().makeBuffer(); buf_85.start(_M_STRING); buf_85.literal(1); buf_85.end();
          term_5 = buf_85.term();
        } sink.propertyNamed("$LineLocation", term_5);Term term_65;
        {
          BufferSink buf_94 = sink.context().makeBuffer(); buf_94.start(_M_STRING); buf_94.literal(1); buf_94.end();
          term_65 = buf_94.term();
        } sink.propertyNamed("$ColumnLocation", term_65);
        sink.start(_M__sTextChars);
        sink.start(_M_UpCaseFirst); sink.copy(sub_7.ref());
        sink.end();
        sink.end();Term term_68;
        {
          BufferSink buf_65 = sink.context().makeBuffer(); buf_65.start(_M_STRING); buf_65.literal(1); buf_65.end();
          term_68 = buf_65.term();
        } sink.propertyNamed("$LineLocation", term_68);Term term_107;
        {
          BufferSink buf_80 = sink.context().makeBuffer(); buf_80.start(_M_STRING); buf_80.literal(2); buf_80.end();
          term_107 = buf_80.term();
        } sink.propertyNamed("$ColumnLocation", term_107);
        sink.start(_M__sTextCons);Term term_36;
        {
          BufferSink buf_52 = sink.context().makeBuffer(); buf_52.start(_M_STRING); buf_52.literal(1); buf_52.end();
          term_36 = buf_52.term();
        } sink.propertyNamed("$LineLocation", term_36);Term term_42;
        {
          BufferSink buf_37 = sink.context().makeBuffer(); buf_37.start(_M_STRING); buf_37.literal(2); buf_37.end();
          term_42 = buf_37.term();
        } sink.propertyNamed("$ColumnLocation", term_42);
        sink.start(_M__sTextChars); sink.literal(".");
        sink.end();Term term_40;
        {
          BufferSink buf_83 = sink.context().makeBuffer(); buf_83.start(_M_STRING); buf_83.literal(1); buf_83.end();
          term_40 = buf_83.term();
        } sink.propertyNamed("$LineLocation", term_40);Term term_4;
        {
          BufferSink buf_76 = sink.context().makeBuffer(); buf_76.start(_M_STRING); buf_76.literal(29); buf_76.end();
          term_4 = buf_76.term();
        } sink.propertyNamed("$ColumnLocation", term_4);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_69: {
        term_84 = force(sink.context(), term_84);
        if (term_84.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_69;
        }/*Contract*/ sink.start(_M__sTextNil); sink.end(); return true;
      }
    }
    return thunk(sink, _M_Qualifier, term_84);
  } final public static boolean _M_Descriptor(Sink sink, int shared, int depth, Term term_142) {
    if (depth < 2000) {
      label_62: {
        term_142 = force(sink.context(), term_142);
        if (term_142.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_62;
        }Term sub_66 = forceSub(sink.context(), term_142, 0).ref();
        /* #qualifier=sub */Term sub_99 = forceSub(sink.context(), term_142, 1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed);
        sink.start(_M_AsText); sink.start(_M_Qualifier); sink.copy(sub_66.ref()); sink.end();
        sink.end();
        sink.end();Term term_13;
        {
          BufferSink buf_29 = sink.context().makeBuffer(); buf_29.start(_M_STRING); buf_29.literal(1); buf_29.end();
          term_13 = buf_29.term();
        } sink.propertyNamed("$LineLocation", term_13);Term term_61;
        {
          BufferSink buf_4 = sink.context().makeBuffer(); buf_4.start(_M_STRING); buf_4.literal(1); buf_4.end();
          term_61 = buf_4.term();
        } sink.propertyNamed("$ColumnLocation", term_61);
        sink.start(_M__sTextCons);Term term_6;
        {
          BufferSink buf_131 = sink.context().makeBuffer(); buf_131.start(_M_STRING); buf_131.literal(1); buf_131.end();
          term_6 = buf_131.term();
        } sink.propertyNamed("$LineLocation", term_6);Term term_2;
        {
          BufferSink buf_48 = sink.context().makeBuffer(); buf_48.start(_M_STRING); buf_48.literal(1); buf_48.end();
          term_2 = buf_48.term();
        } sink.propertyNamed("$ColumnLocation", term_2);
        sink.start(_M__sTextEmbed);Term term_19;
        {
          BufferSink buf_60 = sink.context().makeBuffer(); buf_60.start(_M_STRING); buf_60.literal(1); buf_60.end();
          term_19 = buf_60.term();
        } sink.propertyNamed("$LineLocation", term_19);Term term_22;
        {
          BufferSink buf_26 = sink.context().makeBuffer(); buf_26.start(_M_STRING); buf_26.literal(1); buf_26.end();
          term_22 = buf_26.term();
        } sink.propertyNamed("$ColumnLocation", term_22);
        sink.start(_M_AsText);
        sink.start(_M_ToJavaIdString); sink.copy(sub_99.ref());
        sink.end();
        sink.end();
        sink.end();Term term_75;
        {
          BufferSink buf_64 = sink.context().makeBuffer(); buf_64.start(_M_STRING); buf_64.literal(1); buf_64.end();
          term_75 = buf_64.term();
        } sink.propertyNamed("$LineLocation", term_75);Term term_73;
        {
          BufferSink buf_67 = sink.context().makeBuffer(); buf_67.start(_M_STRING); buf_67.literal(24); buf_67.end();
          term_73 = buf_67.term();
        } sink.propertyNamed("$ColumnLocation", term_73);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_54: {
        term_142 = force(sink.context(), term_142);
        if (term_142.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_54;
        }Term sub_55 = forceSub(sink.context(), term_142, 0).ref();
        /* #reserved=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sEqual); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sShow); sink.end(); sink.copy(sub_55.ref());
        sink.end(); sink.literal(":");
        sink.end();
        sink.start(_M__sTextCons);
        sink.start(_M__sTextChars); sink.literal(" Colon ");
        sink.end();Term term_3;
        {
          BufferSink buf_68 = sink.context().makeBuffer(); buf_68.start(_M_STRING); buf_68.literal(1); buf_68.end();
          term_3 = buf_68.term();
        } sink.propertyNamed("$LineLocation", term_3);Term term_57;
        {
          BufferSink buf_53 = sink.context().makeBuffer(); buf_53.start(_M_STRING); buf_53.literal(1); buf_53.end();
          term_57 = buf_53.term();
        } sink.propertyNamed("$ColumnLocation", term_57);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); sink.start(_M__sTextNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Descriptor, term_142);
  } final public static boolean _M_Variable0(Sink sink, int shared, int depth, Properties props, Term term_49) {
    if (depth < 2000) {
      sink.start(_M_UnTEXT);
      sink.start(_M__s);sink.properties(safeRef(props));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_49.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Variable0, props, term_49);
  } final public static boolean _M_Variable(Sink sink, int shared, int depth, Properties props_34, Term term_66) {
    if (depth < 2000) {sink.properties(safeRef(props_34));
      sink.start(_M_Variable0);
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$var$"); sink.copy(term_66.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Variable, props_34, term_66);
  } final public static boolean _M_VarKey(Sink sink, int shared, int depth, Term term_54) {
    if (depth < 2000) {
      label_70: {
        term_54 = force(sink.context(), term_54);
        if (term_54.descriptor() != _M_Crsx_xvariable)
        {   break label_70;
        }Term sub_65 = forceSub(sink.context(), term_54, 0).ref();
        sub_65 = force(sink.context(), sub_65);
        if (sub_65.descriptor() != _M__sNil)
        {   break label_70;
        }Term sub_13 = forceSub(sink.context(), term_54, 1).ref();
        /* #VARIABLE=sub */Term sub_77 = forceSub(sink.context(), term_54, 2).ref();
        /* #linear?=sub */Term sub_71 = forceSub(sink.context(), term_54, 3).ref();
        /* #functional?=sub */Term sub_128 = forceSub(sink.context(), term_54, 4).ref();
        /* #varsort?=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$var$"); sink.copy(sub_13.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_VarKey, term_54);
  } final public static boolean _M_BinderKey(Sink sink, int shared, int depth, Term term_63) {
    if (depth < 2000) {
      label_95: {
        term_63 = force(sink.context(), term_63);
        if (term_63.descriptor() != _M_Crsx_xbinder)
        {   break label_95;
        }Term sub_37 = forceSub(sink.context(), term_63, 0).ref();
        sub_37 = force(sink.context(), sub_37);
        if (sub_37.descriptor() != _M__sNil)
        {   break label_95;
        }Term sub_6 = forceSub(sink.context(), term_63, 1).ref();
        /* #variable=sub *//*Contract*/
        sink.start(_M_VarKey); sink.copy(sub_6.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_BinderKey, term_63);
  } final public static boolean _M_DispatchedMetaVarBinders2(Sink sink, int shared, int depth, Properties props_6, Term term_17) {
    if (depth < 2000) {
      sink.start(_M_UnMETABinders);
      sink.start(_M__s);sink.properties(safeRef(props_6));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_17.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVarBinders2, props_6, term_17);
  } final public static boolean _M_DispatchedMetaVarBinders1(Sink sink, int shared, int depth, Properties props_42, Term term_14) {
    if (depth < 2000) {sink.properties(safeRef(props_42));
      sink.start(_M_DispatchedMetaVarBinders2);
      sink.start(_M_UnSTRING);
      sink.start(_M__s);sink.properties(safeRef(props_42));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_14.ref());
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVarBinders1, props_42, term_14);
  } final public static boolean _M_DispatchedMetaVarBinders(Sink sink, int shared, int depth, Properties props_47, Term term_62) {
    if (depth < 2000) {sink.properties(safeRef(props_47));
      sink.start(_M_DispatchedMetaVarBinders1);
      sink.start(_M_MetaDispatchKey); sink.copy(term_62.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVarBinders, props_47, term_62);
  } final public static boolean _M_DispatchedMetaVar2(Sink sink, int shared, int depth, Properties props_16, Term term_11) {
    if (depth < 2000) {
      sink.start(_M_UnMETA);
      sink.start(_M__s);sink.properties(safeRef(props_16));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_11.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVar2, props_16, term_11);
  } final public static boolean _M_DispatchedMetaVar1(Sink sink, int shared, int depth, Properties props_22, Term term_29) {
    if (depth < 2000) {sink.properties(safeRef(props_22));
      sink.start(_M_DispatchedMetaVar2);
      sink.start(_M_UnSTRING);
      sink.start(_M__s);sink.properties(safeRef(props_22));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_29.ref());
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVar1, props_22, term_29);
  } final public static boolean _M_DispatchedMetaVar(Sink sink, int shared, int depth, Properties props_50, Term term_67) {
    if (depth < 2000) {sink.properties(safeRef(props_50));
      sink.start(_M_DispatchedMetaVar1);
      sink.start(_M_MetaDispatchKey); sink.copy(term_67.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVar, props_50, term_67);
  } final public static boolean _M_MetaDispatchKey(Sink sink, int shared, int depth, Term term_31) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$dispatch$");
      sink.start(_M__s); sink.start(_M_Builtin_sFormatNumber); sink.end(); sink.copy(term_31.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_MetaDispatchKey, term_31);
  } final public static boolean _M_AddMetaVar0(Sink sink, int shared, int depth, Properties props_31, Term term_117, Term term_78, Term term_77, Variable var, Term term_48) {
    if (depth < 2000) {
      label_10: {
        /* #key=term */
        /* #javavar=term */
        /* #binders=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_31));Term term_47;
        {
          BufferSink buf_20 = sink.context().makeBuffer();
          buf_20.start(_M_META); buf_20.copy(term_78.ref()); buf_20.copy(term_77.ref());
          buf_20.end();
          term_47 = buf_20.term();
        }
        term_117 = force(sink.context(), term_117);
        Sink.property(sink, term_117, term_47);Term term_39;
        {
          BufferSink buf_97 = sink.context().makeBuffer(); buf_97.start(_M_OK); buf_97.end();
          term_39 = buf_97.term();
        }
        sink.substitute(term_48.ref(), new Variable[] { var }, new Term[] {term_39}); return true;
      }
    }
    return thunk(sink, _M_AddMetaVar0, props_31, term_117, term_78, term_77, var, term_48);
  }     final public static boolean _M_AddMetaVar(Sink sink, int shared, int depth, Properties props_8, Term term_203, Term term_150, Term term_53, Variable var_90, Term term_76) {
    if (depth < 2000) {
      label_43: {
        /* #metavar=term */
        /* #javavar=term */
        /* #binders=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_8));
        sink.start(_M_AddMetaVar0); sink.start(_M_MetaKey); sink.copy(term_203.ref()); sink.end(); sink.copy(term_150.ref()); sink.copy(term_53.ref());
        Variable var_61 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_61});
        VariableUse use = sink.context().makeVariableUse(var_61);
        sink.substitute(term_76.ref(), new Variable[] { var_90 }, new Term[] {use});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddMetaVar, props_8, term_203, term_150, term_53, var_90, term_76);
  }     final public static boolean _M_MetaKey(Sink sink, int shared, int depth, Term term_297) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$meta$"); sink.copy(term_297.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_MetaKey, term_297);
  } final public static boolean _M_MetaVar0(Sink sink, int shared, int depth, Properties props_30, Term term_99) {
    if (depth < 2000) {
      sink.start(_M_UnMETA);
      sink.start(_M__s);sink.properties(safeRef(props_30));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_99.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_MetaVar0, props_30, term_99);
  } final public static boolean _M_MetaVar(Sink sink, int shared, int depth, Properties props_1, Term term_55) {
    if (depth < 2000) {sink.properties(safeRef(props_1));
      sink.start(_M_MetaVar0); sink.start(_M_MetaKey); sink.copy(term_55.ref()); sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_MetaVar, props_1, term_55);
  } final public static boolean _M_UnMETABinders(Sink sink, int shared, int depth, Term term_183) {
    if (depth < 2000) {
      label_135: {
        term_183 = force(sink.context(), term_183);
        if (term_183.descriptor() != _M_META)
        {   break label_135;
        }Term sub_42 = forceSub(sink.context(), term_183, 0).ref();
        /* #1=sub */Term sub_44 = forceSub(sink.context(), term_183, 1).ref(); /* #2=sub *//*Contract*/ sink.copy(sub_44.ref()); return true;
      }
    }
    return thunk(sink, _M_UnMETABinders, term_183);
  } final public static boolean _M_UnMETA(Sink sink, int shared, int depth, Term term_46) {
    if (depth < 2000) {
      label_0: {
        term_46 = force(sink.context(), term_46);
        if (term_46.descriptor() != _M_META)
        {   break label_0;
        }Term sub_18 = forceSub(sink.context(), term_46, 0).ref();
        /* #1=sub */Term sub_90 = forceSub(sink.context(), term_46, 1).ref(); /* #2=sub *//*Contract*/ sink.copy(sub_18.ref()); return true;
      }
    }
    return thunk(sink, _M_UnMETA, term_46);
  } final public static boolean _M_UnSTRING(Sink sink, int shared, int depth, Term term_94) {
    if (depth < 2000) {
      label_1: {
        term_94 = force(sink.context(), term_94);
        if (term_94.descriptor() != _M_STRING)
        {   break label_1;
        }Term sub_64 = forceSub(sink.context(), term_94, 0).ref(); /* #=sub *//*Contract*/ sink.copy(sub_64.ref()); return true;
      }
    }
    return thunk(sink, _M_UnSTRING, term_94);
  } final public static boolean _M_UnTEXT(Sink sink, int shared, int depth, Term term_249) {
    if (depth < 2000) {
      label_74: {
        term_249 = force(sink.context(), term_249);
        if (term_249.descriptor() != _M_TEXT)
        {   break label_74;
        }Term sub_142 = forceSub(sink.context(), term_249, 0).ref(); /* #=sub *//*Contract*/ sink.copy(sub_142.ref()); return true;
      }
    }
    return thunk(sink, _M_UnTEXT, term_249);
  } 
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.std.Core.init(context); org.crsx.compiler.std.Text.init(context); org.crsx.compiler.std.String.init(context); org.crsx.compiler.parser.Crsx.init(context); context.register(_M_BOUND); context.register(_M_FRESH); context.register(_M_TEXT); context.register(_M_META); context.register(_M_NO); context.register(_M_YES); context.register(_M_TEXTS); context.register(_M_STRINGS); context.register(_M_NOENTRY); context.register(_M_ToJavaIdString); context.register(_M_ToJavaId); context.register(_M_Literal); context.register(_M_QuotedConstructor); context.register(_M_Qualifier); context.register(_M_Descriptor); context.register(_M_Variable0); context.register(_M_Variable); context.register(_M_VarKey); context.register(_M_BinderKey); context.register(_M_DispatchedMetaVarBinders2); context.register(_M_DispatchedMetaVarBinders1); context.register(_M_DispatchedMetaVarBinders); context.register(_M_DispatchedMetaVar2); context.register(_M_DispatchedMetaVar1); context.register(_M_DispatchedMetaVar); context.register(_M_MetaDispatchKey); context.register(_M_AddMetaVar0); context.register(_M_AddMetaVar); context.register(_M_MetaKey); context.register(_M_MetaVar0); context.register(_M_MetaVar); context.register(_M_UnMETABinders); context.register(_M_UnMETA); context.register(_M_UnSTRING); context.register(_M_UnTEXT);
      initialized = true;
    }
  }

/* END MODULE « "/Users/villardl/Projects/crsx/crsx4/src/cg/cgutils.crs.java" » */
}