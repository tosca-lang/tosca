/* START MODULE cg/cgutils.crs.java */
/** Generated File */package org.crsx.compiler.cg;
import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;
import static org.crsx.runtime.Normalizer.force;
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
  } final public static boolean _M_ToJavaId(Sink sink, int shared, int depth, Term term_48) {
    if (depth < 2000) {
      label: {
        if (term_48.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label;
        }Term sub = term_48.sub(0).ref();
        if (sub.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label;
        }Term sub_6 = term_48.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M_Text_Mangle);
        sink.start(_M_UpCaseFirst); sink.copy(sub_6.ref());
        sink.end();
        sink.end(); return true;
      }
      label_3: {
        if (term_48.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_3;
        }Term sub_92 = term_48.sub(0).ref();
        /* #reserved=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sEqual); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sShow); sink.end(); sink.copy(sub_92.ref());
        sink.end(); sink.literal(":");
        sink.end();
        sink.start(_M__sTextCons);
        sink.start(_M__sTextChars); sink.literal(" _M_Colon ");
        sink.end();Term term_31;
        {
          BufferSink buf = sink.context().makeBuffer(); buf.start(_M_STRING); buf.literal(1); buf.end();
          term_31 = buf.term();
        } sink.propertyNamed("$LineLocation", term_31);Term term_17;
        {
          BufferSink buf_32 = sink.context().makeBuffer(); buf_32.start(_M_STRING); buf_32.literal(1); buf_32.end();
          term_17 = buf_32.term();
        } sink.propertyNamed("$ColumnLocation", term_17);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); sink.start(_M__sTextNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ToJavaId, term_48);
  } final public static boolean _M_Literal(Sink sink, int shared, int depth, Term term_66) {
    if (depth < 2000) {
      label_31: {
        if (term_66.descriptor() != _M_Crsx_xliteral_xA1)
        {   break label_31;
        }Term sub_60 = term_66.sub(0).ref();
        /* #STRING=sub *//*Contract*/
        sink.start(_M_StringToText); sink.copy(sub_60.ref());
        sink.end(); return true;
      }
      label_90: {
        if (term_66.descriptor() != _M_Crsx_xliteral_xA2)
        {   break label_90;
        }Term sub_98 = term_66.sub(0).ref();
        /* #NUMBER=sub *//*Contract*/
        sink.start(_M_StringToText); sink.copy(sub_98.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Literal, term_66);
  } final public static boolean _M_QuotedConstructor(Sink sink, int shared, int depth, Term term_43) {
    if (depth < 2000) {
      label_58: {
        if (term_43.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_58;
        }Term sub_85 = term_43.sub(0).ref();
        if (sub_85.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_58;
        }Term sub_22 = term_43.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M_Text_QuoteEscape); sink.copy(sub_22.ref());
        sink.end(); return true;
      }
      label_73: {
        if (term_43.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_73;
        }Term sub_19 = term_43.sub(0).ref();
        /* #reserved=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sEqual); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sShow); sink.end(); sink.copy(sub_19.ref());
        sink.end(); sink.literal(":");
        sink.end();
        sink.start(_M__sTextCons);
        sink.start(_M__sTextChars); sink.literal(" Colon ");
        sink.end();Term term_78;
        {
          BufferSink buf_24 = sink.context().makeBuffer(); buf_24.start(_M_STRING); buf_24.literal(1); buf_24.end();
          term_78 = buf_24.term();
        } sink.propertyNamed("$LineLocation", term_78);Term term_90;
        {
          BufferSink buf_47 = sink.context().makeBuffer(); buf_47.start(_M_STRING); buf_47.literal(1); buf_47.end();
          term_90 = buf_47.term();
        } sink.propertyNamed("$ColumnLocation", term_90);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); sink.start(_M__sTextNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_QuotedConstructor, term_43);
  } final public static boolean _M_Qualifier(Sink sink, int shared, int depth, Term term_23) {
    if (depth < 2000) {
      label_56: {
        if (term_23.descriptor() != _M_Crsx_xqualifier_xA1)
        {   break label_56;
        }Term sub_79 = term_23.sub(0).ref();
        /* #CONSTRUCTOR=sub */Term sub_24 = term_23.sub(1).ref();Term sub_93 = term_23.sub(2).ref();
        if (sub_93.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_56;
        }/*Contract*/
        sink.start(_M__sTextCons);Term term_87;
        {
          BufferSink buf_40 = sink.context().makeBuffer(); buf_40.start(_M_STRING); buf_40.literal(1); buf_40.end();
          term_87 = buf_40.term();
        } sink.propertyNamed("$LineLocation", term_87);Term term_27;
        {
          BufferSink buf_8 = sink.context().makeBuffer(); buf_8.start(_M_STRING); buf_8.literal(1); buf_8.end();
          term_27 = buf_8.term();
        } sink.propertyNamed("$ColumnLocation", term_27);
        sink.start(_M__sTextChars);
        sink.start(_M_UpCaseFirst); sink.copy(sub_79.ref());
        sink.end();
        sink.end();Term term_89;
        {
          BufferSink buf_137 = sink.context().makeBuffer(); buf_137.start(_M_STRING); buf_137.literal(1); buf_137.end();
          term_89 = buf_137.term();
        } sink.propertyNamed("$LineLocation", term_89);Term term_64;
        {
          BufferSink buf_87 = sink.context().makeBuffer(); buf_87.start(_M_STRING); buf_87.literal(2); buf_87.end();
          term_64 = buf_87.term();
        } sink.propertyNamed("$ColumnLocation", term_64);
        sink.start(_M__sTextCons);Term term_98;
        {
          BufferSink buf_38 = sink.context().makeBuffer(); buf_38.start(_M_STRING); buf_38.literal(1); buf_38.end();
          term_98 = buf_38.term();
        } sink.propertyNamed("$LineLocation", term_98);Term term_36;
        {
          BufferSink buf_62 = sink.context().makeBuffer(); buf_62.start(_M_STRING); buf_62.literal(2); buf_62.end();
          term_36 = buf_62.term();
        } sink.propertyNamed("$ColumnLocation", term_36);
        sink.start(_M__sTextChars); sink.literal(".");
        sink.end();Term term_130;
        {
          BufferSink buf_0 = sink.context().makeBuffer(); buf_0.start(_M_STRING); buf_0.literal(1); buf_0.end();
          term_130 = buf_0.term();
        } sink.propertyNamed("$LineLocation", term_130);Term term_50;
        {
          BufferSink buf_22 = sink.context().makeBuffer(); buf_22.start(_M_STRING); buf_22.literal(29); buf_22.end();
          term_50 = buf_22.term();
        } sink.propertyNamed("$ColumnLocation", term_50);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_78: {
        if (term_23.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_78;
        }/*Contract*/ sink.start(_M__sTextNil); sink.end(); return true;
      }
    }
    return thunk(sink, _M_Qualifier, term_23);
  } final public static boolean _M_Descriptor(Sink sink, int shared, int depth, Term term_198) {
    if (depth < 2000) {
      label_44: {
        if (term_198.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_44;
        }Term sub_40 = term_198.sub(0).ref();
        /* #qualifier=sub */Term sub_42 = term_198.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed);
        sink.start(_M_AsText); sink.start(_M_Qualifier); sink.copy(sub_40.ref()); sink.end();
        sink.end();
        sink.end();Term term_42;
        {
          BufferSink buf_18 = sink.context().makeBuffer(); buf_18.start(_M_STRING); buf_18.literal(1); buf_18.end();
          term_42 = buf_18.term();
        } sink.propertyNamed("$LineLocation", term_42);Term term_84;
        {
          BufferSink buf_88 = sink.context().makeBuffer(); buf_88.start(_M_STRING); buf_88.literal(1); buf_88.end();
          term_84 = buf_88.term();
        } sink.propertyNamed("$ColumnLocation", term_84);
        sink.start(_M__sTextCons);Term term_3;
        {
          BufferSink buf_59 = sink.context().makeBuffer(); buf_59.start(_M_STRING); buf_59.literal(1); buf_59.end();
          term_3 = buf_59.term();
        } sink.propertyNamed("$LineLocation", term_3);Term term_34;
        {
          BufferSink buf_141 = sink.context().makeBuffer(); buf_141.start(_M_STRING); buf_141.literal(1); buf_141.end();
          term_34 = buf_141.term();
        } sink.propertyNamed("$ColumnLocation", term_34);
        sink.start(_M__sTextEmbed);Term term_11;
        {
          BufferSink buf_72 = sink.context().makeBuffer(); buf_72.start(_M_STRING); buf_72.literal(1); buf_72.end();
          term_11 = buf_72.term();
        } sink.propertyNamed("$LineLocation", term_11);Term term_133;
        {
          BufferSink buf_41 = sink.context().makeBuffer(); buf_41.start(_M_STRING); buf_41.literal(1); buf_41.end();
          term_133 = buf_41.term();
        } sink.propertyNamed("$ColumnLocation", term_133);
        sink.start(_M_AsText);
        sink.start(_M_ToJavaIdString); sink.copy(sub_42.ref());
        sink.end();
        sink.end();
        sink.end();Term term_24;
        {
          BufferSink buf_19 = sink.context().makeBuffer(); buf_19.start(_M_STRING); buf_19.literal(1); buf_19.end();
          term_24 = buf_19.term();
        } sink.propertyNamed("$LineLocation", term_24);Term term_44;
        {
          BufferSink buf_33 = sink.context().makeBuffer(); buf_33.start(_M_STRING); buf_33.literal(24); buf_33.end();
          term_44 = buf_33.term();
        } sink.propertyNamed("$ColumnLocation", term_44);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_64: {
        if (term_198.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_64;
        }Term sub_72 = term_198.sub(0).ref();
        /* #reserved=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sEqual); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sShow); sink.end(); sink.copy(sub_72.ref());
        sink.end(); sink.literal(":");
        sink.end();
        sink.start(_M__sTextCons);
        sink.start(_M__sTextChars); sink.literal(" Colon ");
        sink.end();Term term_14;
        {
          BufferSink buf_61 = sink.context().makeBuffer(); buf_61.start(_M_STRING); buf_61.literal(1); buf_61.end();
          term_14 = buf_61.term();
        } sink.propertyNamed("$LineLocation", term_14);Term term_160;
        {
          BufferSink buf_48 = sink.context().makeBuffer(); buf_48.start(_M_STRING); buf_48.literal(1); buf_48.end();
          term_160 = buf_48.term();
        } sink.propertyNamed("$ColumnLocation", term_160);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); sink.start(_M__sTextNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Descriptor, term_198);
  } final public static boolean _M_Variable0(Sink sink, int shared, int depth, Properties props, Term term_82) {
    if (depth < 2000) {
      sink.start(_M_UnTEXT);
      sink.start(_M__s);sink.properties(safeRef(props));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_82.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Variable0, props, term_82);
  } final public static boolean _M_Variable(Sink sink, int shared, int depth, Properties props_90, Term term_55) {
    if (depth < 2000) {sink.properties(safeRef(props_90));
      sink.start(_M_Variable0);
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$var$"); sink.copy(term_55.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Variable, props_90, term_55);
  } final public static boolean _M_VarKey(Sink sink, int shared, int depth, Term term_141) {
    if (depth < 2000) {
      label_68: {
        if (term_141.descriptor() != _M_Crsx_xvariable)
        {   break label_68;
        }Term sub_65 = term_141.sub(0).ref();
        if (sub_65.descriptor() != _M__sNil)
        {   break label_68;
        }Term sub_32 = term_141.sub(1).ref();
        /* #VARIABLE=sub */Term sub_7 = term_141.sub(2).ref();
        /* #linear?=sub */Term sub_44 = term_141.sub(3).ref();
        /* #functional?=sub */Term sub_51 = term_141.sub(4).ref();
        /* #varsort?=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$var$"); sink.copy(sub_32.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_VarKey, term_141);
  } final public static boolean _M_BinderKey(Sink sink, int shared, int depth, Term term_0) {
    if (depth < 2000) {
      label_122: {
        if (term_0.descriptor() != _M_Crsx_xbinder)
        {   break label_122;
        }Term sub_78 = term_0.sub(0).ref();
        if (sub_78.descriptor() != _M__sNil)
        {   break label_122;
        }Term sub_11 = term_0.sub(1).ref();
        /* #variable=sub *//*Contract*/
        sink.start(_M_VarKey); sink.copy(sub_11.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_BinderKey, term_0);
  } final public static boolean _M_DispatchedMetaVarBinders2(Sink sink, int shared, int depth, Properties props_27, Term term_12) {
    if (depth < 2000) {
      sink.start(_M_UnMETABinders);
      sink.start(_M__s);sink.properties(safeRef(props_27));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_12.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVarBinders2, props_27, term_12);
  } final public static boolean _M_DispatchedMetaVarBinders1(Sink sink, int shared, int depth, Properties props_45, Term term_7) {
    if (depth < 2000) {sink.properties(safeRef(props_45));
      sink.start(_M_DispatchedMetaVarBinders2);
      sink.start(_M_UnSTRING);
      sink.start(_M__s);sink.properties(safeRef(props_45));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_7.ref());
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVarBinders1, props_45, term_7);
  } final public static boolean _M_DispatchedMetaVarBinders(Sink sink, int shared, int depth, Properties props_39, Term term_13) {
    if (depth < 2000) {sink.properties(safeRef(props_39));
      sink.start(_M_DispatchedMetaVarBinders1);
      sink.start(_M_MetaDispatchKey); sink.copy(term_13.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVarBinders, props_39, term_13);
  } final public static boolean _M_DispatchedMetaVar2(Sink sink, int shared, int depth, Properties props_38, Term term_92) {
    if (depth < 2000) {
      sink.start(_M_UnMETA);
      sink.start(_M__s);sink.properties(safeRef(props_38));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_92.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVar2, props_38, term_92);
  } final public static boolean _M_DispatchedMetaVar1(Sink sink, int shared, int depth, Properties props_7, Term term_4) {
    if (depth < 2000) {sink.properties(safeRef(props_7));
      sink.start(_M_DispatchedMetaVar2);
      sink.start(_M_UnSTRING);
      sink.start(_M__s);sink.properties(safeRef(props_7));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_4.ref());
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVar1, props_7, term_4);
  } final public static boolean _M_DispatchedMetaVar(Sink sink, int shared, int depth, Properties props_13, Term term_49) {
    if (depth < 2000) {sink.properties(safeRef(props_13));
      sink.start(_M_DispatchedMetaVar1);
      sink.start(_M_MetaDispatchKey); sink.copy(term_49.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVar, props_13, term_49);
  } final public static boolean _M_MetaDispatchKey(Sink sink, int shared, int depth, Term term_21) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$dispatch$");
      sink.start(_M__s); sink.start(_M_Builtin_sFormatNumber); sink.end(); sink.copy(term_21.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_MetaDispatchKey, term_21);
  } final public static boolean _M_AddMetaVar0(Sink sink, int shared, int depth, Properties props_94, Term term_67, Term term_81, Term term_76, Variable var, Term term_57) {
    if (depth < 2000) {
      label_6: {
        /* #key=term */
        /* #javavar=term */
        /* #binders=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_94));Term term_54;
        {
          BufferSink buf_53 = sink.context().makeBuffer();
          buf_53.start(_M_META); buf_53.copy(term_81.ref()); buf_53.copy(term_76.ref());
          buf_53.end();
          term_54 = buf_53.term();
        }
        term_67 = force(sink.context(), term_67);
        Sink.property(sink, term_67, term_54);Term term_73;
        {
          BufferSink buf_16 = sink.context().makeBuffer(); buf_16.start(_M_OK); buf_16.end();
          term_73 = buf_16.term();
        }
        sink.substitute(term_57.ref(), new Variable[] { var }, new Term[] {term_73}); return true;
      }
    }
    return thunk(sink, _M_AddMetaVar0, props_94, term_67, term_81, term_76, var, term_57);
  }     final public static boolean _M_AddMetaVar(Sink sink, int shared, int depth, Properties props_41, Term term_140, Term term_97, Term term_35, Variable var_72, Term term_32) {
    if (depth < 2000) {
      label_98: {
        /* #metavar=term */
        /* #javavar=term */
        /* #binders=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_41));
        sink.start(_M_AddMetaVar0); sink.start(_M_MetaKey); sink.copy(term_140.ref()); sink.end(); sink.copy(term_97.ref()); sink.copy(term_35.ref());
        Variable var_29 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_29});
        VariableUse use = sink.context().makeVariableUse(var_29);
        sink.substitute(term_32.ref(), new Variable[] { var_72 }, new Term[] {use});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddMetaVar, props_41, term_140, term_97, term_35, var_72, term_32);
  }     final public static boolean _M_MetaKey(Sink sink, int shared, int depth, Term term_58) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$meta$"); sink.copy(term_58.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_MetaKey, term_58);
  } final public static boolean _M_MetaVar0(Sink sink, int shared, int depth, Properties props_56, Term term_51) {
    if (depth < 2000) {
      sink.start(_M_UnMETA);
      sink.start(_M__s);sink.properties(safeRef(props_56));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_51.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_MetaVar0, props_56, term_51);
  } final public static boolean _M_MetaVar(Sink sink, int shared, int depth, Properties props_34, Term term_175) {
    if (depth < 2000) {sink.properties(safeRef(props_34));
      sink.start(_M_MetaVar0); sink.start(_M_MetaKey); sink.copy(term_175.ref()); sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_MetaVar, props_34, term_175);
  } final public static boolean _M_UnMETABinders(Sink sink, int shared, int depth, Term term_71) {
    if (depth < 2000) {
      label_80: {
        if (term_71.descriptor() != _M_META)
        {   break label_80;
        }Term sub_67 = term_71.sub(0).ref();
        /* #1=sub */Term sub_21 = term_71.sub(1).ref(); /* #2=sub *//*Contract*/ sink.copy(sub_21.ref()); return true;
      }
    }
    return thunk(sink, _M_UnMETABinders, term_71);
  } final public static boolean _M_UnMETA(Sink sink, int shared, int depth, Term term_86) {
    if (depth < 2000) {
      label_62: {
        if (term_86.descriptor() != _M_META)
        {   break label_62;
        }Term sub_35 = term_86.sub(0).ref();
        /* #1=sub */Term sub_29 = term_86.sub(1).ref(); /* #2=sub *//*Contract*/ sink.copy(sub_35.ref()); return true;
      }
    }
    return thunk(sink, _M_UnMETA, term_86);
  } final public static boolean _M_UnSTRING(Sink sink, int shared, int depth, Term term_179) {
    if (depth < 2000) {
      label_92: {
        if (term_179.descriptor() != _M_STRING)
        {   break label_92;
        }Term sub_17 = term_179.sub(0).ref(); /* #=sub *//*Contract*/ sink.copy(sub_17.ref()); return true;
      }
    }
    return thunk(sink, _M_UnSTRING, term_179);
  } final public static boolean _M_UnTEXT(Sink sink, int shared, int depth, Term term_148) {
    if (depth < 2000) {
      label_16: {
        if (term_148.descriptor() != _M_TEXT)
        {   break label_16;
        }Term sub_38 = term_148.sub(0).ref(); /* #=sub *//*Contract*/ sink.copy(sub_38.ref()); return true;
      }
    }
    return thunk(sink, _M_UnTEXT, term_148);
  } 
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.std.Core.init(context); org.crsx.compiler.std.Text.init(context); org.crsx.compiler.std.String.init(context); org.crsx.compiler.parser.Crsx.init(context); context.register(_M_BOUND); context.register(_M_FRESH); context.register(_M_TEXT); context.register(_M_META); context.register(_M_NO); context.register(_M_YES); context.register(_M_TEXTS); context.register(_M_STRINGS); context.register(_M_NOENTRY); context.register(_M_ToJavaIdString); context.register(_M_ToJavaId); context.register(_M_Literal); context.register(_M_QuotedConstructor); context.register(_M_Qualifier); context.register(_M_Descriptor); context.register(_M_Variable0); context.register(_M_Variable); context.register(_M_VarKey); context.register(_M_BinderKey); context.register(_M_DispatchedMetaVarBinders2); context.register(_M_DispatchedMetaVarBinders1); context.register(_M_DispatchedMetaVarBinders); context.register(_M_DispatchedMetaVar2); context.register(_M_DispatchedMetaVar1); context.register(_M_DispatchedMetaVar); context.register(_M_MetaDispatchKey); context.register(_M_AddMetaVar0); context.register(_M_AddMetaVar); context.register(_M_MetaKey); context.register(_M_MetaVar0); context.register(_M_MetaVar); context.register(_M_UnMETABinders); context.register(_M_UnMETA); context.register(_M_UnSTRING); context.register(_M_UnTEXT);
      initialized = true;
    }
  }

/* END MODULE « "cg/cgutils.crs.java" » */
}