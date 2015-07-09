/* START MODULE /Users/villardl/Projects/crsx/crsx4/src/cg/cgutils.crs.java */
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
  } final public static boolean _M_ToJavaId(Sink sink, int shared, int depth, Term term_84) {
    if (depth < 2000) {
      label: {
        if (term_84.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label;
        }Term sub = term_84.sub(0).ref();
        if (sub.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label;
        }Term sub_57 = term_84.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M_Text_Mangle);
        sink.start(_M_UpCaseFirst); sink.copy(sub_57.ref());
        sink.end();
        sink.end(); return true;
      }
      label_55: {
        if (term_84.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_55;
        }Term sub_53 = term_84.sub(0).ref();
        /* #reserved=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sEqual); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sShow); sink.end(); sink.copy(sub_53.ref());
        sink.end(); sink.literal(":");
        sink.end();
        sink.start(_M__sTextCons);
        sink.start(_M__sTextChars); sink.literal(" _M_Colon ");
        sink.end();Term term_28;
        {
          BufferSink buf = sink.context().makeBuffer(); buf.start(_M_STRING); buf.literal(1); buf.end();
          term_28 = buf.term();
        } sink.propertyNamed("$LineLocation", term_28);Term term_85;
        {
          BufferSink buf_76 = sink.context().makeBuffer(); buf_76.start(_M_STRING); buf_76.literal(1); buf_76.end();
          term_85 = buf_76.term();
        } sink.propertyNamed("$ColumnLocation", term_85);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); sink.start(_M__sTextNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ToJavaId, term_84);
  } final public static boolean _M_Literal(Sink sink, int shared, int depth, Term term_98) {
    if (depth < 2000) {
      label_77: {
        if (term_98.descriptor() != _M_Crsx_xliteral_xA1)
        {   break label_77;
        }Term sub_15 = term_98.sub(0).ref();
        /* #STRING=sub *//*Contract*/
        sink.start(_M_StringToText); sink.copy(sub_15.ref());
        sink.end(); return true;
      }
      label_39: {
        if (term_98.descriptor() != _M_Crsx_xliteral_xA2)
        {   break label_39;
        }Term sub_0 = term_98.sub(0).ref();
        /* #NUMBER=sub *//*Contract*/
        sink.start(_M_StringToText); sink.copy(sub_0.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Literal, term_98);
  } final public static boolean _M_QuotedConstructor(Sink sink, int shared, int depth, Term term_15) {
    if (depth < 2000) {
      label_34: {
        if (term_15.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_34;
        }Term sub_26 = term_15.sub(0).ref();
        if (sub_26.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_34;
        }Term sub_61 = term_15.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M_Text_QuoteEscape); sink.copy(sub_61.ref());
        sink.end(); return true;
      }
      label_27: {
        if (term_15.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_27;
        }Term sub_3 = term_15.sub(0).ref();
        /* #reserved=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sEqual); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sShow); sink.end(); sink.copy(sub_3.ref());
        sink.end(); sink.literal(":");
        sink.end();
        sink.start(_M__sTextCons);
        sink.start(_M__sTextChars); sink.literal(" Colon ");
        sink.end();Term term_25;
        {
          BufferSink buf_50 = sink.context().makeBuffer(); buf_50.start(_M_STRING); buf_50.literal(1); buf_50.end();
          term_25 = buf_50.term();
        } sink.propertyNamed("$LineLocation", term_25);Term term_88;
        {
          BufferSink buf_65 = sink.context().makeBuffer(); buf_65.start(_M_STRING); buf_65.literal(1); buf_65.end();
          term_88 = buf_65.term();
        } sink.propertyNamed("$ColumnLocation", term_88);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); sink.start(_M__sTextNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_QuotedConstructor, term_15);
  } final public static boolean _M_Qualifier(Sink sink, int shared, int depth, Term term_46) {
    if (depth < 2000) {
      label_184: {
        if (term_46.descriptor() != _M_Crsx_xqualifier_xA1)
        {   break label_184;
        }Term sub_109 = term_46.sub(0).ref();
        /* #CONSTRUCTOR=sub */Term sub_80 = term_46.sub(1).ref();Term sub_19 = term_46.sub(2).ref();
        if (sub_19.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_184;
        }/*Contract*/
        sink.start(_M__sTextCons);Term term_20;
        {
          BufferSink buf_53 = sink.context().makeBuffer(); buf_53.start(_M_STRING); buf_53.literal(1); buf_53.end();
          term_20 = buf_53.term();
        } sink.propertyNamed("$LineLocation", term_20);Term term_17;
        {
          BufferSink buf_49 = sink.context().makeBuffer(); buf_49.start(_M_STRING); buf_49.literal(1); buf_49.end();
          term_17 = buf_49.term();
        } sink.propertyNamed("$ColumnLocation", term_17);
        sink.start(_M__sTextChars);
        sink.start(_M_UpCaseFirst); sink.copy(sub_109.ref());
        sink.end();
        sink.end();Term term_42;
        {
          BufferSink buf_89 = sink.context().makeBuffer(); buf_89.start(_M_STRING); buf_89.literal(1); buf_89.end();
          term_42 = buf_89.term();
        } sink.propertyNamed("$LineLocation", term_42);Term term_33;
        {
          BufferSink buf_61 = sink.context().makeBuffer(); buf_61.start(_M_STRING); buf_61.literal(2); buf_61.end();
          term_33 = buf_61.term();
        } sink.propertyNamed("$ColumnLocation", term_33);
        sink.start(_M__sTextCons);Term term_76;
        {
          BufferSink buf_7 = sink.context().makeBuffer(); buf_7.start(_M_STRING); buf_7.literal(1); buf_7.end();
          term_76 = buf_7.term();
        } sink.propertyNamed("$LineLocation", term_76);Term term_7;
        {
          BufferSink buf_59 = sink.context().makeBuffer(); buf_59.start(_M_STRING); buf_59.literal(2); buf_59.end();
          term_7 = buf_59.term();
        } sink.propertyNamed("$ColumnLocation", term_7);
        sink.start(_M__sTextChars); sink.literal(".");
        sink.end();Term term_12;
        {
          BufferSink buf_90 = sink.context().makeBuffer(); buf_90.start(_M_STRING); buf_90.literal(1); buf_90.end();
          term_12 = buf_90.term();
        } sink.propertyNamed("$LineLocation", term_12);Term term_73;
        {
          BufferSink buf_95 = sink.context().makeBuffer(); buf_95.start(_M_STRING); buf_95.literal(29); buf_95.end();
          term_73 = buf_95.term();
        } sink.propertyNamed("$ColumnLocation", term_73);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_48: {
        if (term_46.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_48;
        }/*Contract*/ sink.start(_M__sTextNil); sink.end(); return true;
      }
    }
    return thunk(sink, _M_Qualifier, term_46);
  } final public static boolean _M_Descriptor(Sink sink, int shared, int depth, Term term_16) {
    if (depth < 2000) {
      label_36: {
        if (term_16.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_36;
        }Term sub_30 = term_16.sub(0).ref();
        /* #qualifier=sub */Term sub_21 = term_16.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed);
        sink.start(_M_AsText); sink.start(_M_Qualifier); sink.copy(sub_30.ref()); sink.end();
        sink.end();
        sink.end();Term term_52;
        {
          BufferSink buf_71 = sink.context().makeBuffer(); buf_71.start(_M_STRING); buf_71.literal(1); buf_71.end();
          term_52 = buf_71.term();
        } sink.propertyNamed("$LineLocation", term_52);Term term_4;
        {
          BufferSink buf_1 = sink.context().makeBuffer(); buf_1.start(_M_STRING); buf_1.literal(1); buf_1.end();
          term_4 = buf_1.term();
        } sink.propertyNamed("$ColumnLocation", term_4);
        sink.start(_M__sTextCons);Term term_59;
        {
          BufferSink buf_24 = sink.context().makeBuffer(); buf_24.start(_M_STRING); buf_24.literal(1); buf_24.end();
          term_59 = buf_24.term();
        } sink.propertyNamed("$LineLocation", term_59);Term term_94;
        {
          BufferSink buf_27 = sink.context().makeBuffer(); buf_27.start(_M_STRING); buf_27.literal(1); buf_27.end();
          term_94 = buf_27.term();
        } sink.propertyNamed("$ColumnLocation", term_94);
        sink.start(_M__sTextEmbed);Term term_75;
        {
          BufferSink buf_31 = sink.context().makeBuffer(); buf_31.start(_M_STRING); buf_31.literal(1); buf_31.end();
          term_75 = buf_31.term();
        } sink.propertyNamed("$LineLocation", term_75);Term term_13;
        {
          BufferSink buf_163 = sink.context().makeBuffer(); buf_163.start(_M_STRING); buf_163.literal(1); buf_163.end();
          term_13 = buf_163.term();
        } sink.propertyNamed("$ColumnLocation", term_13);
        sink.start(_M_AsText);
        sink.start(_M_ToJavaIdString); sink.copy(sub_21.ref());
        sink.end();
        sink.end();
        sink.end();Term term_91;
        {
          BufferSink buf_93 = sink.context().makeBuffer(); buf_93.start(_M_STRING); buf_93.literal(1); buf_93.end();
          term_91 = buf_93.term();
        } sink.propertyNamed("$LineLocation", term_91);Term term_87;
        {
          BufferSink buf_67 = sink.context().makeBuffer(); buf_67.start(_M_STRING); buf_67.literal(24); buf_67.end();
          term_87 = buf_67.term();
        } sink.propertyNamed("$ColumnLocation", term_87);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_37: {
        if (term_16.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_37;
        }Term sub_176 = term_16.sub(0).ref();
        /* #reserved=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sEqual); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sShow); sink.end(); sink.copy(sub_176.ref());
        sink.end(); sink.literal(":");
        sink.end();
        sink.start(_M__sTextCons);
        sink.start(_M__sTextChars); sink.literal(" Colon ");
        sink.end();Term term_36;
        {
          BufferSink buf_58 = sink.context().makeBuffer(); buf_58.start(_M_STRING); buf_58.literal(1); buf_58.end();
          term_36 = buf_58.term();
        } sink.propertyNamed("$LineLocation", term_36);Term term_68;
        {
          BufferSink buf_28 = sink.context().makeBuffer(); buf_28.start(_M_STRING); buf_28.literal(1); buf_28.end();
          term_68 = buf_28.term();
        } sink.propertyNamed("$ColumnLocation", term_68);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); sink.start(_M__sTextNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Descriptor, term_16);
  } final public static boolean _M_Variable0(Sink sink, int shared, int depth, Properties props, Term term_0) {
    if (depth < 2000) {
      sink.start(_M_UnTEXT);
      sink.start(_M__s);sink.properties(safeRef(props));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_0.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Variable0, props, term_0);
  } final public static boolean _M_Variable(Sink sink, int shared, int depth, Properties props_28, Term term_63) {
    if (depth < 2000) {sink.properties(safeRef(props_28));
      sink.start(_M_Variable0);
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$var$"); sink.copy(term_63.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Variable, props_28, term_63);
  } final public static boolean _M_VarKey(Sink sink, int shared, int depth, Term term_39) {
    if (depth < 2000) {
      label_187: {
        if (term_39.descriptor() != _M_Crsx_xvariable)
        {   break label_187;
        }Term sub_78 = term_39.sub(0).ref();
        if (sub_78.descriptor() != _M__sNil)
        {   break label_187;
        }Term sub_12 = term_39.sub(1).ref();
        /* #VARIABLE=sub */Term sub_64 = term_39.sub(2).ref();
        /* #linear?=sub */Term sub_34 = term_39.sub(3).ref();
        /* #functional?=sub */Term sub_76 = term_39.sub(4).ref();
        /* #varsort?=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$var$"); sink.copy(sub_12.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_VarKey, term_39);
  } final public static boolean _M_BinderKey(Sink sink, int shared, int depth, Term term_27) {
    if (depth < 2000) {
      label_81: {
        if (term_27.descriptor() != _M_Crsx_xbinder)
        {   break label_81;
        }Term sub_209 = term_27.sub(0).ref();
        if (sub_209.descriptor() != _M__sNil)
        {   break label_81;
        }Term sub_99 = term_27.sub(1).ref();
        /* #variable=sub *//*Contract*/
        sink.start(_M_VarKey); sink.copy(sub_99.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_BinderKey, term_27);
  } final public static boolean _M_DispatchedMetaVarBinders2(Sink sink, int shared, int depth, Properties props_3, Term term_22) {
    if (depth < 2000) {
      sink.start(_M_UnMETABinders);
      sink.start(_M__s);sink.properties(safeRef(props_3));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_22.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVarBinders2, props_3, term_22);
  } final public static boolean _M_DispatchedMetaVarBinders1(Sink sink, int shared, int depth, Properties props_87, Term term_70) {
    if (depth < 2000) {sink.properties(safeRef(props_87));
      sink.start(_M_DispatchedMetaVarBinders2);
      sink.start(_M_UnSTRING);
      sink.start(_M__s);sink.properties(safeRef(props_87));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_70.ref());
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVarBinders1, props_87, term_70);
  } final public static boolean _M_DispatchedMetaVarBinders(Sink sink, int shared, int depth, Properties props_12, Term term_32) {
    if (depth < 2000) {sink.properties(safeRef(props_12));
      sink.start(_M_DispatchedMetaVarBinders1);
      sink.start(_M_MetaDispatchKey); sink.copy(term_32.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVarBinders, props_12, term_32);
  } final public static boolean _M_DispatchedMetaVar2(Sink sink, int shared, int depth, Properties props_74, Term term_83) {
    if (depth < 2000) {
      sink.start(_M_UnMETA);
      sink.start(_M__s);sink.properties(safeRef(props_74));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_83.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVar2, props_74, term_83);
  } final public static boolean _M_DispatchedMetaVar1(Sink sink, int shared, int depth, Properties props_11, Term term_53) {
    if (depth < 2000) {sink.properties(safeRef(props_11));
      sink.start(_M_DispatchedMetaVar2);
      sink.start(_M_UnSTRING);
      sink.start(_M__s);sink.properties(safeRef(props_11));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_53.ref());
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVar1, props_11, term_53);
  } final public static boolean _M_DispatchedMetaVar(Sink sink, int shared, int depth, Properties props_98, Term term_41) {
    if (depth < 2000) {sink.properties(safeRef(props_98));
      sink.start(_M_DispatchedMetaVar1);
      sink.start(_M_MetaDispatchKey); sink.copy(term_41.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVar, props_98, term_41);
  } final public static boolean _M_MetaDispatchKey(Sink sink, int shared, int depth, Term term_62) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$dispatch$");
      sink.start(_M__s); sink.start(_M_Builtin_sFormatNumber); sink.end(); sink.copy(term_62.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_MetaDispatchKey, term_62);
  } final public static boolean _M_AddMetaVar0(Sink sink, int shared, int depth, Properties props_48, Term term_214, Term term_156, Term term_72, Variable var, Term term_54) {
    if (depth < 2000) {
      label_71: {
        /* #key=term */
        /* #javavar=term */
        /* #binders=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_48));Term term_31;
        {
          BufferSink buf_10 = sink.context().makeBuffer();
          buf_10.start(_M_META); buf_10.copy(term_156.ref()); buf_10.copy(term_72.ref());
          buf_10.end();
          term_31 = buf_10.term();
        }
        term_214 = force(sink.context(), term_214);
        Sink.property(sink, term_214, term_31);Term term_35;
        {
          BufferSink buf_78 = sink.context().makeBuffer(); buf_78.start(_M_OK); buf_78.end();
          term_35 = buf_78.term();
        }
        sink.substitute(term_54.ref(), new Variable[] { var }, new Term[] {term_35}); return true;
      }
    }
    return thunk(sink, _M_AddMetaVar0, props_48, term_214, term_156, term_72, var, term_54);
  }     final public static boolean _M_AddMetaVar(Sink sink, int shared, int depth, Properties props_45, Term term_50, Term term_90, Term term_24, Variable var_85, Term term_37) {
    if (depth < 2000) {
      label_73: {
        /* #metavar=term */
        /* #javavar=term */
        /* #binders=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_45));
        sink.start(_M_AddMetaVar0); sink.start(_M_MetaKey); sink.copy(term_50.ref()); sink.end(); sink.copy(term_90.ref()); sink.copy(term_24.ref());
        Variable var_40 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_40});
        VariableUse use = sink.context().makeVariableUse(var_40);
        sink.substitute(term_37.ref(), new Variable[] { var_85 }, new Term[] {use});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddMetaVar, props_45, term_50, term_90, term_24, var_85, term_37);
  }     final public static boolean _M_MetaKey(Sink sink, int shared, int depth, Term term_65) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$meta$"); sink.copy(term_65.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_MetaKey, term_65);
  } final public static boolean _M_MetaVar0(Sink sink, int shared, int depth, Properties props_85, Term term_19) {
    if (depth < 2000) {
      sink.start(_M_UnMETA);
      sink.start(_M__s);sink.properties(safeRef(props_85));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_19.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_MetaVar0, props_85, term_19);
  } final public static boolean _M_MetaVar(Sink sink, int shared, int depth, Properties props_72, Term term_18) {
    if (depth < 2000) {sink.properties(safeRef(props_72));
      sink.start(_M_MetaVar0); sink.start(_M_MetaKey); sink.copy(term_18.ref()); sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_MetaVar, props_72, term_18);
  } final public static boolean _M_UnMETABinders(Sink sink, int shared, int depth, Term term_2) {
    if (depth < 2000) {
      label_80: {
        if (term_2.descriptor() != _M_META)
        {   break label_80;
        }Term sub_65 = term_2.sub(0).ref();
        /* #1=sub */Term sub_41 = term_2.sub(1).ref(); /* #2=sub *//*Contract*/ sink.copy(sub_41.ref()); return true;
      }
    }
    return thunk(sink, _M_UnMETABinders, term_2);
  } final public static boolean _M_UnMETA(Sink sink, int shared, int depth, Term term_96) {
    if (depth < 2000) {
      label_9: {
        if (term_96.descriptor() != _M_META)
        {   break label_9;
        }Term sub_55 = term_96.sub(0).ref();
        /* #1=sub */Term sub_7 = term_96.sub(1).ref(); /* #2=sub *//*Contract*/ sink.copy(sub_55.ref()); return true;
      }
    }
    return thunk(sink, _M_UnMETA, term_96);
  } final public static boolean _M_UnSTRING(Sink sink, int shared, int depth, Term term_164) {
    if (depth < 2000) {
      label_118: {
        if (term_164.descriptor() != _M_STRING)
        {   break label_118;
        }Term sub_46 = term_164.sub(0).ref(); /* #=sub *//*Contract*/ sink.copy(sub_46.ref()); return true;
      }
    }
    return thunk(sink, _M_UnSTRING, term_164);
  } final public static boolean _M_UnTEXT(Sink sink, int shared, int depth, Term term_185) {
    if (depth < 2000) {
      label_1: {
        if (term_185.descriptor() != _M_TEXT)
        {   break label_1;
        }Term sub_8 = term_185.sub(0).ref(); /* #=sub *//*Contract*/ sink.copy(sub_8.ref()); return true;
      }
    }
    return thunk(sink, _M_UnTEXT, term_185);
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