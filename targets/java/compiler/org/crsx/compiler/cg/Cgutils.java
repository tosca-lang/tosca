/* START MODULE /Users/villardl/Projects/crsx/crsx4_2/src/cg/cgutils.crs.java */
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
  } final public static boolean _M_ToJavaId(Sink sink, int shared, int depth, Term term_28) {
    if (depth < 2000) {
      label: {
        if (term_28.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label;
        }Term sub = term_28.sub(0).ref();
        if (sub.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label;
        }Term sub_27 = term_28.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M_Text_Mangle);
        sink.start(_M_UpCaseFirst); sink.copy(sub_27.ref());
        sink.end();
        sink.end(); return true;
      }
      label_54: {
        if (term_28.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_54;
        }Term sub_46 = term_28.sub(0).ref();
        /* #reserved=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sEqual); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sShow); sink.end(); sink.copy(sub_46.ref());
        sink.end(); sink.literal(":");
        sink.end();
        sink.start(_M__sTextCons);
        sink.start(_M__sTextChars); sink.literal(" _M_Colon ");
        sink.end();Term term_91;
        {
          BufferSink buf = sink.context().makeBuffer(); buf.start(_M_STRING); buf.literal(1); buf.end();
          term_91 = buf.term();
        } sink.propertyNamed("$LineLocation", term_91);Term term_15;
        {
          BufferSink buf_87 = sink.context().makeBuffer(); buf_87.start(_M_STRING); buf_87.literal(1); buf_87.end();
          term_15 = buf_87.term();
        } sink.propertyNamed("$ColumnLocation", term_15);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); sink.start(_M__sTextNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ToJavaId, term_28);
  } final public static boolean _M_Literal(Sink sink, int shared, int depth, Term term_77) {
    if (depth < 2000) {
      label_75: {
        if (term_77.descriptor() != _M_Crsx_xliteral_xA1)
        {   break label_75;
        }Term sub_10 = term_77.sub(0).ref();
        /* #STRING=sub *//*Contract*/
        sink.start(_M_StringToText); sink.copy(sub_10.ref());
        sink.end(); return true;
      }
      label_29: {
        if (term_77.descriptor() != _M_Crsx_xliteral_xA2)
        {   break label_29;
        }Term sub_77 = term_77.sub(0).ref();
        /* #NUMBER=sub *//*Contract*/
        sink.start(_M_StringToText); sink.copy(sub_77.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Literal, term_77);
  } final public static boolean _M_QuotedConstructor(Sink sink, int shared, int depth, Term term_58) {
    if (depth < 2000) {
      label_11: {
        if (term_58.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_11;
        }Term sub_33 = term_58.sub(0).ref();
        if (sub_33.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_11;
        }Term sub_31 = term_58.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M_Text_QuoteEscape); sink.copy(sub_31.ref());
        sink.end(); return true;
      }
      label_72: {
        if (term_58.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_72;
        }Term sub_83 = term_58.sub(0).ref();
        /* #reserved=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sEqual); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sShow); sink.end(); sink.copy(sub_83.ref());
        sink.end(); sink.literal(":");
        sink.end();
        sink.start(_M__sTextCons);
        sink.start(_M__sTextChars); sink.literal(" Colon ");
        sink.end();Term term_95;
        {
          BufferSink buf_62 = sink.context().makeBuffer(); buf_62.start(_M_STRING); buf_62.literal(1); buf_62.end();
          term_95 = buf_62.term();
        } sink.propertyNamed("$LineLocation", term_95);Term term_22;
        {
          BufferSink buf_84 = sink.context().makeBuffer(); buf_84.start(_M_STRING); buf_84.literal(1); buf_84.end();
          term_22 = buf_84.term();
        } sink.propertyNamed("$ColumnLocation", term_22);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); sink.start(_M__sTextNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_QuotedConstructor, term_58);
  } final public static boolean _M_Qualifier(Sink sink, int shared, int depth, Term term_69) {
    if (depth < 2000) {
      label_0: {
        if (term_69.descriptor() != _M_Crsx_xqualifier_xA1)
        {   break label_0;
        }Term sub_16 = term_69.sub(0).ref();
        /* #CONSTRUCTOR=sub */Term sub_5 = term_69.sub(1).ref();Term sub_190 = term_69.sub(2).ref();
        if (sub_190.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_0;
        }/*Contract*/
        sink.start(_M__sTextCons);Term term_61;
        {
          BufferSink buf_69 = sink.context().makeBuffer(); buf_69.start(_M_STRING); buf_69.literal(1); buf_69.end();
          term_61 = buf_69.term();
        } sink.propertyNamed("$LineLocation", term_61);Term term_10;
        {
          BufferSink buf_72 = sink.context().makeBuffer(); buf_72.start(_M_STRING); buf_72.literal(1); buf_72.end();
          term_10 = buf_72.term();
        } sink.propertyNamed("$ColumnLocation", term_10);
        sink.start(_M__sTextChars);
        sink.start(_M_UpCaseFirst); sink.copy(sub_16.ref());
        sink.end();
        sink.end();Term term_4;
        {
          BufferSink buf_38 = sink.context().makeBuffer(); buf_38.start(_M_STRING); buf_38.literal(1); buf_38.end();
          term_4 = buf_38.term();
        } sink.propertyNamed("$LineLocation", term_4);Term term_46;
        {
          BufferSink buf_58 = sink.context().makeBuffer(); buf_58.start(_M_STRING); buf_58.literal(2); buf_58.end();
          term_46 = buf_58.term();
        } sink.propertyNamed("$ColumnLocation", term_46);
        sink.start(_M__sTextCons);Term term_260;
        {
          BufferSink buf_77 = sink.context().makeBuffer(); buf_77.start(_M_STRING); buf_77.literal(1); buf_77.end();
          term_260 = buf_77.term();
        } sink.propertyNamed("$LineLocation", term_260);Term term_30;
        {
          BufferSink buf_32 = sink.context().makeBuffer(); buf_32.start(_M_STRING); buf_32.literal(2); buf_32.end();
          term_30 = buf_32.term();
        } sink.propertyNamed("$ColumnLocation", term_30);
        sink.start(_M__sTextChars); sink.literal(".");
        sink.end();Term term_83;
        {
          BufferSink buf_30 = sink.context().makeBuffer(); buf_30.start(_M_STRING); buf_30.literal(1); buf_30.end();
          term_83 = buf_30.term();
        } sink.propertyNamed("$LineLocation", term_83);Term term_34;
        {
          BufferSink buf_27 = sink.context().makeBuffer(); buf_27.start(_M_STRING); buf_27.literal(29); buf_27.end();
          term_34 = buf_27.term();
        } sink.propertyNamed("$ColumnLocation", term_34);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_57: {
        if (term_69.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_57;
        }/*Contract*/ sink.start(_M__sTextNil); sink.end(); return true;
      }
    }
    return thunk(sink, _M_Qualifier, term_69);
  } final public static boolean _M_Descriptor(Sink sink, int shared, int depth, Term term_32) {
    if (depth < 2000) {
      label_43: {
        if (term_32.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_43;
        }Term sub_58 = term_32.sub(0).ref();
        /* #qualifier=sub */Term sub_39 = term_32.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed);
        sink.start(_M_AsText); sink.start(_M_Qualifier); sink.copy(sub_58.ref()); sink.end();
        sink.end();
        sink.end();Term term_16;
        {
          BufferSink buf_54 = sink.context().makeBuffer(); buf_54.start(_M_STRING); buf_54.literal(1); buf_54.end();
          term_16 = buf_54.term();
        } sink.propertyNamed("$LineLocation", term_16);Term term_31;
        {
          BufferSink buf_0 = sink.context().makeBuffer(); buf_0.start(_M_STRING); buf_0.literal(1); buf_0.end();
          term_31 = buf_0.term();
        } sink.propertyNamed("$ColumnLocation", term_31);
        sink.start(_M__sTextCons);Term term_85;
        {
          BufferSink buf_156 = sink.context().makeBuffer(); buf_156.start(_M_STRING); buf_156.literal(1); buf_156.end();
          term_85 = buf_156.term();
        } sink.propertyNamed("$LineLocation", term_85);Term term_74;
        {
          BufferSink buf_67 = sink.context().makeBuffer(); buf_67.start(_M_STRING); buf_67.literal(1); buf_67.end();
          term_74 = buf_67.term();
        } sink.propertyNamed("$ColumnLocation", term_74);
        sink.start(_M__sTextEmbed);Term term_64;
        {
          BufferSink buf_157 = sink.context().makeBuffer(); buf_157.start(_M_STRING); buf_157.literal(1); buf_157.end();
          term_64 = buf_157.term();
        } sink.propertyNamed("$LineLocation", term_64);Term term_37;
        {
          BufferSink buf_3 = sink.context().makeBuffer(); buf_3.start(_M_STRING); buf_3.literal(1); buf_3.end();
          term_37 = buf_3.term();
        } sink.propertyNamed("$ColumnLocation", term_37);
        sink.start(_M_AsText);
        sink.start(_M_ToJavaIdString); sink.copy(sub_39.ref());
        sink.end();
        sink.end();
        sink.end();Term term_48;
        {
          BufferSink buf_81 = sink.context().makeBuffer(); buf_81.start(_M_STRING); buf_81.literal(1); buf_81.end();
          term_48 = buf_81.term();
        } sink.propertyNamed("$LineLocation", term_48);Term term_176;
        {
          BufferSink buf_2 = sink.context().makeBuffer(); buf_2.start(_M_STRING); buf_2.literal(24); buf_2.end();
          term_176 = buf_2.term();
        } sink.propertyNamed("$ColumnLocation", term_176);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_77: {
        if (term_32.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_77;
        }Term sub_89 = term_32.sub(0).ref();
        /* #reserved=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sEqual); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sShow); sink.end(); sink.copy(sub_89.ref());
        sink.end(); sink.literal(":");
        sink.end();
        sink.start(_M__sTextCons);
        sink.start(_M__sTextChars); sink.literal(" Colon ");
        sink.end();Term term_66;
        {
          BufferSink buf_25 = sink.context().makeBuffer(); buf_25.start(_M_STRING); buf_25.literal(1); buf_25.end();
          term_66 = buf_25.term();
        } sink.propertyNamed("$LineLocation", term_66);Term term_92;
        {
          BufferSink buf_151 = sink.context().makeBuffer(); buf_151.start(_M_STRING); buf_151.literal(1); buf_151.end();
          term_92 = buf_151.term();
        } sink.propertyNamed("$ColumnLocation", term_92);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); sink.start(_M__sTextNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Descriptor, term_32);
  } final public static boolean _M_Variable0(Sink sink, int shared, int depth, Properties props, Term term_90) {
    if (depth < 2000) {
      sink.start(_M_UnTEXT);
      sink.start(_M__s);sink.properties(safeRef(props));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_90.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Variable0, props, term_90);
  } final public static boolean _M_Variable(Sink sink, int shared, int depth, Properties props_14, Term term_96) {
    if (depth < 2000) {sink.properties(safeRef(props_14));
      sink.start(_M_Variable0);
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$var$"); sink.copy(term_96.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Variable, props_14, term_96);
  } final public static boolean _M_VarKey(Sink sink, int shared, int depth, Term term_42) {
    if (depth < 2000) {
      label_5: {
        if (term_42.descriptor() != _M_Crsx_xvariable)
        {   break label_5;
        }Term sub_95 = term_42.sub(0).ref();
        if (sub_95.descriptor() != _M__sNil)
        {   break label_5;
        }Term sub_42 = term_42.sub(1).ref();
        /* #VARIABLE=sub */Term sub_44 = term_42.sub(2).ref();
        /* #linear?=sub */Term sub_81 = term_42.sub(3).ref();
        /* #functional?=sub */Term sub_55 = term_42.sub(4).ref();
        /* #varsort?=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$var$"); sink.copy(sub_42.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_VarKey, term_42);
  } final public static boolean _M_BinderKey(Sink sink, int shared, int depth, Term term_106) {
    if (depth < 2000) {
      label_14: {
        if (term_106.descriptor() != _M_Crsx_xbinder)
        {   break label_14;
        }Term sub_12 = term_106.sub(0).ref();
        if (sub_12.descriptor() != _M__sNil)
        {   break label_14;
        }Term sub_24 = term_106.sub(1).ref();
        /* #variable=sub *//*Contract*/
        sink.start(_M_VarKey); sink.copy(sub_24.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_BinderKey, term_106);
  } final public static boolean _M_DispatchedMetaVarBinders2(Sink sink, int shared, int depth, Properties props_77, Term term_53) {
    if (depth < 2000) {
      sink.start(_M_UnMETABinders);
      sink.start(_M__s);sink.properties(safeRef(props_77));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_53.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVarBinders2, props_77, term_53);
  } final public static boolean _M_DispatchedMetaVarBinders1(Sink sink, int shared, int depth, Properties props_43, Term term_105) {
    if (depth < 2000) {sink.properties(safeRef(props_43));
      sink.start(_M_DispatchedMetaVarBinders2);
      sink.start(_M_UnSTRING);
      sink.start(_M__s);sink.properties(safeRef(props_43));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_105.ref());
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVarBinders1, props_43, term_105);
  } final public static boolean _M_DispatchedMetaVarBinders(Sink sink, int shared, int depth, Properties props_41, Term term_12) {
    if (depth < 2000) {sink.properties(safeRef(props_41));
      sink.start(_M_DispatchedMetaVarBinders1);
      sink.start(_M_MetaDispatchKey); sink.copy(term_12.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVarBinders, props_41, term_12);
  } final public static boolean _M_DispatchedMetaVar2(Sink sink, int shared, int depth, Properties props_60, Term term_86) {
    if (depth < 2000) {
      sink.start(_M_UnMETA);
      sink.start(_M__s);sink.properties(safeRef(props_60));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_86.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVar2, props_60, term_86);
  } final public static boolean _M_DispatchedMetaVar1(Sink sink, int shared, int depth, Properties props_13, Term term_38) {
    if (depth < 2000) {sink.properties(safeRef(props_13));
      sink.start(_M_DispatchedMetaVar2);
      sink.start(_M_UnSTRING);
      sink.start(_M__s);sink.properties(safeRef(props_13));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_38.ref());
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVar1, props_13, term_38);
  } final public static boolean _M_DispatchedMetaVar(Sink sink, int shared, int depth, Properties props_70, Term term_88) {
    if (depth < 2000) {sink.properties(safeRef(props_70));
      sink.start(_M_DispatchedMetaVar1);
      sink.start(_M_MetaDispatchKey); sink.copy(term_88.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVar, props_70, term_88);
  } final public static boolean _M_MetaDispatchKey(Sink sink, int shared, int depth, Term term_146) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$dispatch$");
      sink.start(_M__s); sink.start(_M_Builtin_sFormatNumber); sink.end(); sink.copy(term_146.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_MetaDispatchKey, term_146);
  } final public static boolean _M_AddMetaVar0(Sink sink, int shared, int depth, Properties props_37, Term term_183, Term term_3, Term term_1, Variable var, Term term_97) {
    if (depth < 2000) {
      label_91: {
        /* #key=term */
        /* #javavar=term */
        /* #binders=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_37));Term term_45;
        {
          BufferSink buf_74 = sink.context().makeBuffer();
          buf_74.start(_M_META); buf_74.copy(term_3.ref()); buf_74.copy(term_1.ref());
          buf_74.end();
          term_45 = buf_74.term();
        }
        term_183 = force(sink.context(), term_183);
        Sink.property(sink, term_183, term_45);Term term_41;
        {
          BufferSink buf_33 = sink.context().makeBuffer(); buf_33.start(_M_OK); buf_33.end();
          term_41 = buf_33.term();
        }
        sink.substitute(term_97.ref(), new Variable[] { var }, new Term[] {term_41}); return true;
      }
    }
    return thunk(sink, _M_AddMetaVar0, props_37, term_183, term_3, term_1, var, term_97);
  }     final public static boolean _M_AddMetaVar(Sink sink, int shared, int depth, Properties props_18, Term term_14, Term term_33, Term term_211, Variable var_46, Term term_137) {
    if (depth < 2000) {
      label_32: {
        /* #metavar=term */
        /* #javavar=term */
        /* #binders=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_18));
        sink.start(_M_AddMetaVar0); sink.start(_M_MetaKey); sink.copy(term_14.ref()); sink.end(); sink.copy(term_33.ref()); sink.copy(term_211.ref());
        Variable var_45 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_45});
        VariableUse use = sink.context().makeVariableUse(var_45);
        sink.substitute(term_137.ref(), new Variable[] { var_46 }, new Term[] {use});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddMetaVar, props_18, term_14, term_33, term_211, var_46, term_137);
  }     final public static boolean _M_MetaKey(Sink sink, int shared, int depth, Term term_26) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$meta$"); sink.copy(term_26.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_MetaKey, term_26);
  } final public static boolean _M_MetaVar0(Sink sink, int shared, int depth, Properties props_36, Term term_24) {
    if (depth < 2000) {
      sink.start(_M_UnMETA);
      sink.start(_M__s);sink.properties(safeRef(props_36));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_24.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_MetaVar0, props_36, term_24);
  } final public static boolean _M_MetaVar(Sink sink, int shared, int depth, Properties props_9, Term term_65) {
    if (depth < 2000) {sink.properties(safeRef(props_9));
      sink.start(_M_MetaVar0); sink.start(_M_MetaKey); sink.copy(term_65.ref()); sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_MetaVar, props_9, term_65);
  } final public static boolean _M_UnMETABinders(Sink sink, int shared, int depth, Term term_43) {
    if (depth < 2000) {
      label_25: {
        if (term_43.descriptor() != _M_META)
        {   break label_25;
        }Term sub_67 = term_43.sub(0).ref();
        /* #1=sub */Term sub_267 = term_43.sub(1).ref();
        /* #2=sub *//*Contract*/ sink.copy(sub_267.ref()); return true;
      }
    }
    return thunk(sink, _M_UnMETABinders, term_43);
  } final public static boolean _M_UnMETA(Sink sink, int shared, int depth, Term term_60) {
    if (depth < 2000) {
      label_50: {
        if (term_60.descriptor() != _M_META)
        {   break label_50;
        }Term sub_40 = term_60.sub(0).ref();
        /* #1=sub */Term sub_14 = term_60.sub(1).ref(); /* #2=sub *//*Contract*/ sink.copy(sub_40.ref()); return true;
      }
    }
    return thunk(sink, _M_UnMETA, term_60);
  } final public static boolean _M_UnSTRING(Sink sink, int shared, int depth, Term term_191) {
    if (depth < 2000) {
      label_28: {
        if (term_191.descriptor() != _M_STRING)
        {   break label_28;
        }Term sub_90 = term_191.sub(0).ref(); /* #=sub *//*Contract*/ sink.copy(sub_90.ref()); return true;
      }
    }
    return thunk(sink, _M_UnSTRING, term_191);
  } final public static boolean _M_UnTEXT(Sink sink, int shared, int depth, Term term_23) {
    if (depth < 2000) {
      label_80: {
        if (term_23.descriptor() != _M_TEXT)
        {   break label_80;
        }Term sub_64 = term_23.sub(0).ref(); /* #=sub *//*Contract*/ sink.copy(sub_64.ref()); return true;
      }
    }
    return thunk(sink, _M_UnTEXT, term_23);
  } 
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.std.Core.init(context); org.crsx.compiler.std.Text.init(context); org.crsx.compiler.std.String.init(context); org.crsx.compiler.parser.Crsx.init(context); context.register(_M_BOUND); context.register(_M_FRESH); context.register(_M_TEXT); context.register(_M_META); context.register(_M_NO); context.register(_M_YES); context.register(_M_TEXTS); context.register(_M_STRINGS); context.register(_M_NOENTRY); context.register(_M_ToJavaIdString); context.register(_M_ToJavaId); context.register(_M_Literal); context.register(_M_QuotedConstructor); context.register(_M_Qualifier); context.register(_M_Descriptor); context.register(_M_Variable0); context.register(_M_Variable); context.register(_M_VarKey); context.register(_M_BinderKey); context.register(_M_DispatchedMetaVarBinders2); context.register(_M_DispatchedMetaVarBinders1); context.register(_M_DispatchedMetaVarBinders); context.register(_M_DispatchedMetaVar2); context.register(_M_DispatchedMetaVar1); context.register(_M_DispatchedMetaVar); context.register(_M_MetaDispatchKey); context.register(_M_AddMetaVar0); context.register(_M_AddMetaVar); context.register(_M_MetaKey); context.register(_M_MetaVar0); context.register(_M_MetaVar); context.register(_M_UnMETABinders); context.register(_M_UnMETA); context.register(_M_UnSTRING); context.register(_M_UnTEXT);
      initialized = true;
    }
  }

/* END MODULE « "/Users/villardl/Projects/crsx/crsx4_2/src/cg/cgutils.crs.java" » */
}