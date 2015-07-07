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
  } final public static boolean _M_ToJavaId(Sink sink, int shared, int depth, Term term_66) {
    if (depth < 2000) {
      label: {
        if (term_66.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label;
        }Term sub = term_66.sub(0).ref();
        if (sub.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label;
        }Term sub_56 = term_66.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M_Text_Mangle);
        sink.start(_M_UpCaseFirst); sink.copy(sub_56.ref());
        sink.end();
        sink.end(); return true;
      }
      label_8: {
        if (term_66.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_8;
        }Term sub_58 = term_66.sub(0).ref();
        /* #reserved=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sEqual); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sShow); sink.end(); sink.copy(sub_58.ref());
        sink.end(); sink.literal(":");
        sink.end();
        sink.start(_M__sTextCons);
        sink.start(_M__sTextChars); sink.literal(" _M_Colon ");
        sink.end();Term term_45;
        {
          BufferSink buf = sink.context().makeBuffer(); buf.start(_M_STRING); buf.literal(1); buf.end();
          term_45 = buf.term();
        } sink.propertyNamed("$LineLocation", term_45);Term term_22;
        {
          BufferSink buf_46 = sink.context().makeBuffer(); buf_46.start(_M_STRING); buf_46.literal(1); buf_46.end();
          term_22 = buf_46.term();
        } sink.propertyNamed("$ColumnLocation", term_22);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); sink.start(_M__sTextNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ToJavaId, term_66);
  } final public static boolean _M_Literal(Sink sink, int shared, int depth, Term term_48) {
    if (depth < 2000) {
      label_0: {
        if (term_48.descriptor() != _M_Crsx_xliteral_xA1)
        {   break label_0;
        }Term sub_46 = term_48.sub(0).ref();
        /* #STRING=sub *//*Contract*/
        sink.start(_M_StringToText); sink.copy(sub_46.ref());
        sink.end(); return true;
      }
      label_80: {
        if (term_48.descriptor() != _M_Crsx_xliteral_xA2)
        {   break label_80;
        }Term sub_80 = term_48.sub(0).ref();
        /* #NUMBER=sub *//*Contract*/
        sink.start(_M_StringToText); sink.copy(sub_80.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Literal, term_48);
  } final public static boolean _M_QuotedConstructor(Sink sink, int shared, int depth, Term term_8) {
    if (depth < 2000) {
      label_41: {
        if (term_8.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_41;
        }Term sub_33 = term_8.sub(0).ref();
        if (sub_33.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_41;
        }Term sub_44 = term_8.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M_Text_QuoteEscape); sink.copy(sub_44.ref());
        sink.end(); return true;
      }
      label_22: {
        if (term_8.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_22;
        }Term sub_90 = term_8.sub(0).ref();
        /* #reserved=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sEqual); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sShow); sink.end(); sink.copy(sub_90.ref());
        sink.end(); sink.literal(":");
        sink.end();
        sink.start(_M__sTextCons);
        sink.start(_M__sTextChars); sink.literal(" Colon ");
        sink.end();Term term_46;
        {
          BufferSink buf_54 = sink.context().makeBuffer(); buf_54.start(_M_STRING); buf_54.literal(1); buf_54.end();
          term_46 = buf_54.term();
        } sink.propertyNamed("$LineLocation", term_46);Term term_75;
        {
          BufferSink buf_153 = sink.context().makeBuffer(); buf_153.start(_M_STRING); buf_153.literal(1); buf_153.end();
          term_75 = buf_153.term();
        } sink.propertyNamed("$ColumnLocation", term_75);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); sink.start(_M__sTextNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_QuotedConstructor, term_8);
  } final public static boolean _M_Qualifier(Sink sink, int shared, int depth, Term term_51) {
    if (depth < 2000) {
      label_63: {
        if (term_51.descriptor() != _M_Crsx_xqualifier_xA1)
        {   break label_63;
        }Term sub_78 = term_51.sub(0).ref();
        /* #CONSTRUCTOR=sub */Term sub_113 = term_51.sub(1).ref();Term sub_86 = term_51.sub(2).ref();
        if (sub_86.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_63;
        }/*Contract*/
        sink.start(_M__sTextCons);Term term_126;
        {
          BufferSink buf_29 = sink.context().makeBuffer(); buf_29.start(_M_STRING); buf_29.literal(1); buf_29.end();
          term_126 = buf_29.term();
        } sink.propertyNamed("$LineLocation", term_126);Term term_23;
        {
          BufferSink buf_1 = sink.context().makeBuffer(); buf_1.start(_M_STRING); buf_1.literal(1); buf_1.end();
          term_23 = buf_1.term();
        } sink.propertyNamed("$ColumnLocation", term_23);
        sink.start(_M__sTextChars);
        sink.start(_M_UpCaseFirst); sink.copy(sub_78.ref());
        sink.end();
        sink.end();Term term_73;
        {
          BufferSink buf_81 = sink.context().makeBuffer(); buf_81.start(_M_STRING); buf_81.literal(1); buf_81.end();
          term_73 = buf_81.term();
        } sink.propertyNamed("$LineLocation", term_73);Term term_87;
        {
          BufferSink buf_19 = sink.context().makeBuffer(); buf_19.start(_M_STRING); buf_19.literal(2); buf_19.end();
          term_87 = buf_19.term();
        } sink.propertyNamed("$ColumnLocation", term_87);
        sink.start(_M__sTextCons);Term term_79;
        {
          BufferSink buf_84 = sink.context().makeBuffer(); buf_84.start(_M_STRING); buf_84.literal(1); buf_84.end();
          term_79 = buf_84.term();
        } sink.propertyNamed("$LineLocation", term_79);Term term_33;
        {
          BufferSink buf_99 = sink.context().makeBuffer(); buf_99.start(_M_STRING); buf_99.literal(2); buf_99.end();
          term_33 = buf_99.term();
        } sink.propertyNamed("$ColumnLocation", term_33);
        sink.start(_M__sTextChars); sink.literal(".");
        sink.end();Term term_50;
        {
          BufferSink buf_57 = sink.context().makeBuffer(); buf_57.start(_M_STRING); buf_57.literal(1); buf_57.end();
          term_50 = buf_57.term();
        } sink.propertyNamed("$LineLocation", term_50);Term term_84;
        {
          BufferSink buf_55 = sink.context().makeBuffer(); buf_55.start(_M_STRING); buf_55.literal(29); buf_55.end();
          term_84 = buf_55.term();
        } sink.propertyNamed("$ColumnLocation", term_84);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_150: {
        if (term_51.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_150;
        }/*Contract*/ sink.start(_M__sTextNil); sink.end(); return true;
      }
    }
    return thunk(sink, _M_Qualifier, term_51);
  } final public static boolean _M_Descriptor(Sink sink, int shared, int depth, Term term_37) {
    if (depth < 2000) {
      label_82: {
        if (term_37.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_82;
        }Term sub_39 = term_37.sub(0).ref();
        /* #qualifier=sub */Term sub_9 = term_37.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed);
        sink.start(_M_AsText); sink.start(_M_Qualifier); sink.copy(sub_39.ref()); sink.end();
        sink.end();
        sink.end();Term term_34;
        {
          BufferSink buf_25 = sink.context().makeBuffer(); buf_25.start(_M_STRING); buf_25.literal(1); buf_25.end();
          term_34 = buf_25.term();
        } sink.propertyNamed("$LineLocation", term_34);Term term_12;
        {
          BufferSink buf_70 = sink.context().makeBuffer(); buf_70.start(_M_STRING); buf_70.literal(1); buf_70.end();
          term_12 = buf_70.term();
        } sink.propertyNamed("$ColumnLocation", term_12);
        sink.start(_M__sTextCons);Term term_108;
        {
          BufferSink buf_40 = sink.context().makeBuffer(); buf_40.start(_M_STRING); buf_40.literal(1); buf_40.end();
          term_108 = buf_40.term();
        } sink.propertyNamed("$LineLocation", term_108);Term term_6;
        {
          BufferSink buf_93 = sink.context().makeBuffer(); buf_93.start(_M_STRING); buf_93.literal(1); buf_93.end();
          term_6 = buf_93.term();
        } sink.propertyNamed("$ColumnLocation", term_6);
        sink.start(_M__sTextEmbed);Term term_83;
        {
          BufferSink buf_36 = sink.context().makeBuffer(); buf_36.start(_M_STRING); buf_36.literal(1); buf_36.end();
          term_83 = buf_36.term();
        } sink.propertyNamed("$LineLocation", term_83);Term term_125;
        {
          BufferSink buf_72 = sink.context().makeBuffer(); buf_72.start(_M_STRING); buf_72.literal(1); buf_72.end();
          term_125 = buf_72.term();
        } sink.propertyNamed("$ColumnLocation", term_125);
        sink.start(_M_AsText);
        sink.start(_M_ToJavaIdString); sink.copy(sub_9.ref());
        sink.end();
        sink.end();
        sink.end();Term term_64;
        {
          BufferSink buf_60 = sink.context().makeBuffer(); buf_60.start(_M_STRING); buf_60.literal(1); buf_60.end();
          term_64 = buf_60.term();
        } sink.propertyNamed("$LineLocation", term_64);Term term_149;
        {
          BufferSink buf_97 = sink.context().makeBuffer(); buf_97.start(_M_STRING); buf_97.literal(24); buf_97.end();
          term_149 = buf_97.term();
        } sink.propertyNamed("$ColumnLocation", term_149);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_126: {
        if (term_37.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_126;
        }Term sub_41 = term_37.sub(0).ref();
        /* #reserved=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sEqual); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sShow); sink.end(); sink.copy(sub_41.ref());
        sink.end(); sink.literal(":");
        sink.end();
        sink.start(_M__sTextCons);
        sink.start(_M__sTextChars); sink.literal(" Colon ");
        sink.end();Term term_39;
        {
          BufferSink buf_41 = sink.context().makeBuffer(); buf_41.start(_M_STRING); buf_41.literal(1); buf_41.end();
          term_39 = buf_41.term();
        } sink.propertyNamed("$LineLocation", term_39);Term term_92;
        {
          BufferSink buf_196 = sink.context().makeBuffer(); buf_196.start(_M_STRING); buf_196.literal(1); buf_196.end();
          term_92 = buf_196.term();
        } sink.propertyNamed("$ColumnLocation", term_92);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); sink.start(_M__sTextNil); sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Descriptor, term_37);
  } final public static boolean _M_Variable0(Sink sink, int shared, int depth, Properties props, Term term_16) {
    if (depth < 2000) {
      sink.start(_M_UnTEXT);
      sink.start(_M__s);sink.properties(safeRef(props));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_16.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Variable0, props, term_16);
  } final public static boolean _M_Variable(Sink sink, int shared, int depth, Properties props_23, Term term_9) {
    if (depth < 2000) {sink.properties(safeRef(props_23));
      sink.start(_M_Variable0);
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$var$"); sink.copy(term_9.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Variable, props_23, term_9);
  } final public static boolean _M_VarKey(Sink sink, int shared, int depth, Term term_58) {
    if (depth < 2000) {
      label_58: {
        if (term_58.descriptor() != _M_Crsx_xvariable)
        {   break label_58;
        }Term sub_1 = term_58.sub(0).ref();
        if (sub_1.descriptor() != _M__sNil)
        {   break label_58;
        }Term sub_24 = term_58.sub(1).ref();
        /* #VARIABLE=sub */Term sub_28 = term_58.sub(2).ref();
        /* #linear?=sub */Term sub_16 = term_58.sub(3).ref();
        /* #functional?=sub */Term sub_94 = term_58.sub(4).ref();
        /* #varsort?=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$var$"); sink.copy(sub_24.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_VarKey, term_58);
  } final public static boolean _M_BinderKey(Sink sink, int shared, int depth, Term term_63) {
    if (depth < 2000) {
      label_1: {
        if (term_63.descriptor() != _M_Crsx_xbinder)
        {   break label_1;
        }Term sub_87 = term_63.sub(0).ref();
        if (sub_87.descriptor() != _M__sNil)
        {   break label_1;
        }Term sub_91 = term_63.sub(1).ref();
        /* #variable=sub *//*Contract*/
        sink.start(_M_VarKey); sink.copy(sub_91.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_BinderKey, term_63);
  } final public static boolean _M_DispatchedMetaVarBinders2(Sink sink, int shared, int depth, Properties props_59, Term term_70) {
    if (depth < 2000) {
      sink.start(_M_UnMETABinders);
      sink.start(_M__s);sink.properties(safeRef(props_59));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_70.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVarBinders2, props_59, term_70);
  } final public static boolean _M_DispatchedMetaVarBinders1(Sink sink, int shared, int depth, Properties props_63, Term term_59) {
    if (depth < 2000) {sink.properties(safeRef(props_63));
      sink.start(_M_DispatchedMetaVarBinders2);
      sink.start(_M_UnSTRING);
      sink.start(_M__s);sink.properties(safeRef(props_63));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_59.ref());
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVarBinders1, props_63, term_59);
  } final public static boolean _M_DispatchedMetaVarBinders(Sink sink, int shared, int depth, Properties props_34, Term term_13) {
    if (depth < 2000) {sink.properties(safeRef(props_34));
      sink.start(_M_DispatchedMetaVarBinders1);
      sink.start(_M_MetaDispatchKey); sink.copy(term_13.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVarBinders, props_34, term_13);
  } final public static boolean _M_DispatchedMetaVar2(Sink sink, int shared, int depth, Properties props_98, Term term_29) {
    if (depth < 2000) {
      sink.start(_M_UnMETA);
      sink.start(_M__s);sink.properties(safeRef(props_98));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_29.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVar2, props_98, term_29);
  } final public static boolean _M_DispatchedMetaVar1(Sink sink, int shared, int depth, Properties props_19, Term term_30) {
    if (depth < 2000) {sink.properties(safeRef(props_19));
      sink.start(_M_DispatchedMetaVar2);
      sink.start(_M_UnSTRING);
      sink.start(_M__s);sink.properties(safeRef(props_19));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_30.ref());
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVar1, props_19, term_30);
  } final public static boolean _M_DispatchedMetaVar(Sink sink, int shared, int depth, Properties props_96, Term term_135) {
    if (depth < 2000) {sink.properties(safeRef(props_96));
      sink.start(_M_DispatchedMetaVar1);
      sink.start(_M_MetaDispatchKey); sink.copy(term_135.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_DispatchedMetaVar, props_96, term_135);
  } final public static boolean _M_MetaDispatchKey(Sink sink, int shared, int depth, Term term_69) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$dispatch$");
      sink.start(_M__s); sink.start(_M_Builtin_sFormatNumber); sink.end(); sink.copy(term_69.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_MetaDispatchKey, term_69);
  } final public static boolean _M_AddMetaVar0(Sink sink, int shared, int depth, Properties props_88, Term term_71, Term term_68, Term term_97, Variable var, Term term_20) {
    if (depth < 2000) {
      label_51: {
        /* #key=term */
        /* #javavar=term */
        /* #binders=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_88));Term term_21;
        {
          BufferSink buf_34 = sink.context().makeBuffer();
          buf_34.start(_M_META); buf_34.copy(term_68.ref()); buf_34.copy(term_97.ref());
          buf_34.end();
          term_21 = buf_34.term();
        }
        term_71 = force(sink.context(), term_71);
        Sink.property(sink, term_71, term_21);Term term_36;
        {
          BufferSink buf_10 = sink.context().makeBuffer(); buf_10.start(_M_OK); buf_10.end();
          term_36 = buf_10.term();
        }
        sink.substitute(term_20.ref(), new Variable[] { var }, new Term[] {term_36}); return true;
      }
    }
    return thunk(sink, _M_AddMetaVar0, props_88, term_71, term_68, term_97, var, term_20);
  }     final public static boolean _M_AddMetaVar(Sink sink, int shared, int depth, Properties props_50, Term term_56, Term term_185, Term term_101, Variable var_72, Term term_98) {
    if (depth < 2000) {
      label_65: {
        /* #metavar=term */
        /* #javavar=term */
        /* #binders=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_50));
        sink.start(_M_AddMetaVar0); sink.start(_M_MetaKey); sink.copy(term_56.ref()); sink.end(); sink.copy(term_185.ref()); sink.copy(term_101.ref());
        Variable var_16 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_16});
        VariableUse use = sink.context().makeVariableUse(var_16);
        sink.substitute(term_98.ref(), new Variable[] { var_72 }, new Term[] {use});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddMetaVar, props_50, term_56, term_185, term_101, var_72, term_98);
  }     final public static boolean _M_MetaKey(Sink sink, int shared, int depth, Term term_159) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$meta$"); sink.copy(term_159.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_MetaKey, term_159);
  } final public static boolean _M_MetaVar0(Sink sink, int shared, int depth, Properties props_75, Term term_139) {
    if (depth < 2000) {
      sink.start(_M_UnMETA);
      sink.start(_M__s);sink.properties(safeRef(props_75));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_139.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_MetaVar0, props_75, term_139);
  } final public static boolean _M_MetaVar(Sink sink, int shared, int depth, Properties props_20, Term term_67) {
    if (depth < 2000) {sink.properties(safeRef(props_20));
      sink.start(_M_MetaVar0); sink.start(_M_MetaKey); sink.copy(term_67.ref()); sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_MetaVar, props_20, term_67);
  } final public static boolean _M_UnMETABinders(Sink sink, int shared, int depth, Term term_76) {
    if (depth < 2000) {
      label_61: {
        if (term_76.descriptor() != _M_META)
        {   break label_61;
        }Term sub_5 = term_76.sub(0).ref();
        /* #1=sub */Term sub_79 = term_76.sub(1).ref(); /* #2=sub *//*Contract*/ sink.copy(sub_79.ref()); return true;
      }
    }
    return thunk(sink, _M_UnMETABinders, term_76);
  } final public static boolean _M_UnMETA(Sink sink, int shared, int depth, Term term_114) {
    if (depth < 2000) {
      label_53: {
        if (term_114.descriptor() != _M_META)
        {   break label_53;
        }Term sub_35 = term_114.sub(0).ref();
        /* #1=sub */Term sub_82 = term_114.sub(1).ref(); /* #2=sub *//*Contract*/ sink.copy(sub_35.ref()); return true;
      }
    }
    return thunk(sink, _M_UnMETA, term_114);
  } final public static boolean _M_UnSTRING(Sink sink, int shared, int depth, Term term_117) {
    if (depth < 2000) {
      label_47: {
        if (term_117.descriptor() != _M_STRING)
        {   break label_47;
        }Term sub_36 = term_117.sub(0).ref(); /* #=sub *//*Contract*/ sink.copy(sub_36.ref()); return true;
      }
    }
    return thunk(sink, _M_UnSTRING, term_117);
  } final public static boolean _M_UnTEXT(Sink sink, int shared, int depth, Term term_31) {
    if (depth < 2000) {
      label_144: {
        if (term_31.descriptor() != _M_TEXT)
        {   break label_144;
        }Term sub_188 = term_31.sub(0).ref(); /* #=sub *//*Contract*/ sink.copy(sub_188.ref()); return true;
      }
    }
    return thunk(sink, _M_UnTEXT, term_31);
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