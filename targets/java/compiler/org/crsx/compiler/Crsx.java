/* START MODULE /Users/villardl/Projects/crsx/crsx4/src/crsx.crs.java */
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
import static org.crsx.compiler.State.*;
import static org.crsx.compiler.Normalizer.*;
import static org.crsx.compiler.cg.Cgjava.*;
import static org.crsx.compiler.std.Core.*;
import static org.crsx.compiler.std.List.*; import static org.crsx.compiler.std.Text.*;

public class Crsx
{
  final public static DynamicFunctionDescriptor _M_CompileSave = makeFunction("CompileSave", Crsx.class, "_M_CompileSave");
  final public static DynamicFunctionDescriptor _M_CompileNormalized = makeFunction("CompileNormalized", Crsx.class, "_M_CompileNormalized");
  final public static DynamicFunctionDescriptor _M_CompileModule = makeFunction("CompileModule", Crsx.class, "_M_CompileModule");
  final public static DynamicFunctionDescriptor _M_CompileNextModule1 = makeFunction("CompileNextModule1", Crsx.class, "_M_CompileNextModule1");
  final public static DynamicFunctionDescriptor _M_CompileNextModule = makeFunction("CompileNextModule", Crsx.class, "_M_CompileNextModule");
  final public static DynamicFunctionDescriptor _M_AddImport = makeFunction("AddImport", Crsx.class, "_M_AddImport");
  final public static DynamicFunctionDescriptor _M_NormalizeDone1 = makeFunction("NormalizeDone1", Crsx.class, "_M_NormalizeDone1");
  final public static DynamicFunctionDescriptor _M_NormalizeDone = makeFunction("NormalizeDone", Crsx.class, "_M_NormalizeDone");
  final public static DynamicFunctionDescriptor _M_NormalizeParsed = makeFunction("NormalizeParsed", Crsx.class, "_M_NormalizeParsed");
  final public static DynamicFunctionDescriptor _M_NormalizeModuleLoad = makeFunction("NormalizeModuleLoad", Crsx.class, "_M_NormalizeModuleLoad");
  final public static DynamicFunctionDescriptor _M_NormalizeModule = makeFunction("NormalizeModule", Crsx.class, "_M_NormalizeModule");
  final public static DynamicFunctionDescriptor _M_NormalizeNextModule1 = makeFunction("NormalizeNextModule1", Crsx.class, "_M_NormalizeNextModule1");
  final public static DynamicFunctionDescriptor _M_NormalizeNextModule = makeFunction("NormalizeNextModule", Crsx.class, "_M_NormalizeNextModule");
  final public static DynamicFunctionDescriptor _M_Compile = makeFunction("Compile", Crsx.class, "_M_Compile");final public static boolean _M_CompileSave(Sink sink, int shared, int depth, Properties props, Term term, Term term_29, Variable var, Term term_19) {
    if (depth < 2000) {
      label: {
        /* #filename=term */
        /* #code=term */
        /* #=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextChars); sink.literal("/* START MODULE ");
        sink.end();Term term_27;
        {
          BufferSink buf = sink.context().makeBuffer(); buf.start(_M_STRING); buf.literal(1); buf.end();
          term_27 = buf.term();
        } sink.propertyNamed("$LineLocation", term_27);Term term_42;
        {
          BufferSink buf_47 = sink.context().makeBuffer(); buf_47.start(_M_STRING); buf_47.literal(1); buf_47.end();
          term_42 = buf_47.term();
        } sink.propertyNamed("$ColumnLocation", term_42);
        sink.start(_M__sTextCons);Term term_52;
        {
          BufferSink buf_67 = sink.context().makeBuffer(); buf_67.start(_M_STRING); buf_67.literal(1); buf_67.end();
          term_52 = buf_67.term();
        } sink.propertyNamed("$LineLocation", term_52);Term term_20;
        {
          BufferSink buf_43 = sink.context().makeBuffer(); buf_43.start(_M_STRING); buf_43.literal(17); buf_43.end();
          term_20 = buf_43.term();
        } sink.propertyNamed("$ColumnLocation", term_20);
        sink.start(_M__sTextChars); sink.copy(term.ref());
        sink.end();Term term_2;
        {
          BufferSink buf_66 = sink.context().makeBuffer(); buf_66.start(_M_STRING); buf_66.literal(1); buf_66.end();
          term_2 = buf_66.term();
        } sink.propertyNamed("$LineLocation", term_2);Term term_25;
        {
          BufferSink buf_96 = sink.context().makeBuffer(); buf_96.start(_M_STRING); buf_96.literal(18); buf_96.end();
          term_25 = buf_96.term();
        } sink.propertyNamed("$ColumnLocation", term_25);
        sink.start(_M__sTextCons);Term term_21;
        {
          BufferSink buf_89 = sink.context().makeBuffer(); buf_89.start(_M_STRING); buf_89.literal(1); buf_89.end();
          term_21 = buf_89.term();
        } sink.propertyNamed("$LineLocation", term_21);Term term_66;
        {
          BufferSink buf_99 = sink.context().makeBuffer(); buf_99.start(_M_STRING); buf_99.literal(18); buf_99.end();
          term_66 = buf_99.term();
        } sink.propertyNamed("$ColumnLocation", term_66);
        sink.start(_M__sTextChars); sink.literal(" */");
        sink.end();Term term_79;
        {
          BufferSink buf_90 = sink.context().makeBuffer(); buf_90.start(_M_STRING); buf_90.literal(1); buf_90.end();
          term_79 = buf_90.term();
        } sink.propertyNamed("$LineLocation", term_79);Term term_197;
        {
          BufferSink buf_6 = sink.context().makeBuffer(); buf_6.start(_M_STRING); buf_6.literal(29); buf_6.end();
          term_197 = buf_6.term();
        } sink.propertyNamed("$ColumnLocation", term_197);
        sink.start(_M__sTextCons);Term term_6;
        {
          BufferSink buf_80 = sink.context().makeBuffer(); buf_80.start(_M_STRING); buf_80.literal(1); buf_80.end();
          term_6 = buf_80.term();
        } sink.propertyNamed("$LineLocation", term_6);Term term_40;
        {
          BufferSink buf_79 = sink.context().makeBuffer(); buf_79.start(_M_STRING); buf_79.literal(29); buf_79.end();
          term_40 = buf_79.term();
        } sink.propertyNamed("$ColumnLocation", term_40);
        sink.start(_M__sTextBreak); sink.literal("\n");
        sink.end();Term term_190;
        {
          BufferSink buf_0 = sink.context().makeBuffer(); buf_0.start(_M_STRING); buf_0.literal(1); buf_0.end();
          term_190 = buf_0.term();
        } sink.propertyNamed("$LineLocation", term_190);Term term_54;
        {
          BufferSink buf_52 = sink.context().makeBuffer(); buf_52.start(_M_STRING); buf_52.literal(32); buf_52.end();
          term_54 = buf_52.term();
        } sink.propertyNamed("$ColumnLocation", term_54);
        sink.start(_M__sTextCons);Term term_22;
        {
          BufferSink buf_30 = sink.context().makeBuffer(); buf_30.start(_M_STRING); buf_30.literal(1); buf_30.end();
          term_22 = buf_30.term();
        } sink.propertyNamed("$LineLocation", term_22);Term term_45;
        {
          BufferSink buf_35 = sink.context().makeBuffer(); buf_35.start(_M_STRING); buf_35.literal(32); buf_35.end();
          term_45 = buf_35.term();
        } sink.propertyNamed("$ColumnLocation", term_45);
        sink.start(_M__sTextEmbed);Term term_9;
        {
          BufferSink buf_14 = sink.context().makeBuffer(); buf_14.start(_M_STRING); buf_14.literal(1); buf_14.end();
          term_9 = buf_14.term();
        } sink.propertyNamed("$LineLocation", term_9);Term term_144;
        {
          BufferSink buf_8 = sink.context().makeBuffer(); buf_8.start(_M_STRING); buf_8.literal(32); buf_8.end();
          term_144 = buf_8.term();
        } sink.propertyNamed("$ColumnLocation", term_144);
        sink.start(_M_AsText); sink.copy(term_29.ref());
        sink.end();
        sink.end();Term term_88;
        {
          BufferSink buf_9 = sink.context().makeBuffer(); buf_9.start(_M_STRING); buf_9.literal(2); buf_9.end();
          term_88 = buf_9.term();
        } sink.propertyNamed("$LineLocation", term_88);Term term_69;
        {
          BufferSink buf_41 = sink.context().makeBuffer(); buf_41.start(_M_STRING); buf_41.literal(1); buf_41.end();
          term_69 = buf_41.term();
        } sink.propertyNamed("$ColumnLocation", term_69);
        sink.start(_M__sTextCons);Term term_48;
        {
          BufferSink buf_29 = sink.context().makeBuffer(); buf_29.start(_M_STRING); buf_29.literal(2); buf_29.end();
          term_48 = buf_29.term();
        } sink.propertyNamed("$LineLocation", term_48);Term term_115;
        {
          BufferSink buf_98 = sink.context().makeBuffer(); buf_98.start(_M_STRING); buf_98.literal(1); buf_98.end();
          term_115 = buf_98.term();
        } sink.propertyNamed("$ColumnLocation", term_115);
        sink.start(_M__sTextBreak); sink.literal("\n");
        sink.end();Term term_26;
        {
          BufferSink buf_84 = sink.context().makeBuffer(); buf_84.start(_M_STRING); buf_84.literal(2); buf_84.end();
          term_26 = buf_84.term();
        } sink.propertyNamed("$LineLocation", term_26);Term term_49;
        {
          BufferSink buf_4 = sink.context().makeBuffer(); buf_4.start(_M_STRING); buf_4.literal(8); buf_4.end();
          term_49 = buf_4.term();
        } sink.propertyNamed("$ColumnLocation", term_49);
        sink.start(_M__sTextCons);Term term_72;
        {
          BufferSink buf_248 = sink.context().makeBuffer(); buf_248.start(_M_STRING); buf_248.literal(2); buf_248.end();
          term_72 = buf_248.term();
        } sink.propertyNamed("$LineLocation", term_72);Term term_24;
        {
          BufferSink buf_85 = sink.context().makeBuffer(); buf_85.start(_M_STRING); buf_85.literal(8); buf_85.end();
          term_24 = buf_85.term();
        } sink.propertyNamed("$ColumnLocation", term_24);
        sink.start(_M__sTextChars); sink.literal("/* END MODULE ");
        sink.end();Term term_95;
        {
          BufferSink buf_87 = sink.context().makeBuffer(); buf_87.start(_M_STRING); buf_87.literal(3); buf_87.end();
          term_95 = buf_87.term();
        } sink.propertyNamed("$LineLocation", term_95);Term term_83;
        {
          BufferSink buf_59 = sink.context().makeBuffer(); buf_59.start(_M_STRING); buf_59.literal(1); buf_59.end();
          term_83 = buf_59.term();
        } sink.propertyNamed("$ColumnLocation", term_83);
        sink.start(_M__sTextCons);Term term_87;
        {
          BufferSink buf_13 = sink.context().makeBuffer(); buf_13.start(_M_STRING); buf_13.literal(3); buf_13.end();
          term_87 = buf_13.term();
        } sink.propertyNamed("$LineLocation", term_87);Term term_30;
        {
          BufferSink buf_68 = sink.context().makeBuffer(); buf_68.start(_M_STRING); buf_68.literal(1); buf_68.end();
          term_30 = buf_68.term();
        } sink.propertyNamed("$ColumnLocation", term_30);
        sink.start(_M__sTextEmbed);Term term_166;
        {
          BufferSink buf_5 = sink.context().makeBuffer(); buf_5.start(_M_STRING); buf_5.literal(3); buf_5.end();
          term_166 = buf_5.term();
        } sink.propertyNamed("$LineLocation", term_166);Term term_34;
        {
          BufferSink buf_119 = sink.context().makeBuffer(); buf_119.start(_M_STRING); buf_119.literal(1); buf_119.end();
          term_34 = buf_119.term();
        } sink.propertyNamed("$ColumnLocation", term_34);
        sink.start(_M_AsText); sink.copy(term.ref());
        sink.end();
        sink.end();Term term_93;
        {
          BufferSink buf_17 = sink.context().makeBuffer(); buf_17.start(_M_STRING); buf_17.literal(3); buf_17.end();
          term_93 = buf_17.term();
        } sink.propertyNamed("$LineLocation", term_93);Term term_82;
        {
          BufferSink buf_185 = sink.context().makeBuffer();
          buf_185.start(_M_STRING); buf_185.literal(15);
          buf_185.end();
          term_82 = buf_185.term();
        } sink.propertyNamed("$ColumnLocation", term_82);
        sink.start(_M__sTextCons);Term term_4;
        {
          BufferSink buf_26 = sink.context().makeBuffer(); buf_26.start(_M_STRING); buf_26.literal(3); buf_26.end();
          term_4 = buf_26.term();
        } sink.propertyNamed("$LineLocation", term_4);Term term_81;
        {
          BufferSink buf_20 = sink.context().makeBuffer(); buf_20.start(_M_STRING); buf_20.literal(15); buf_20.end();
          term_81 = buf_20.term();
        } sink.propertyNamed("$ColumnLocation", term_81);
        sink.start(_M__sTextChars); sink.literal(" */");
        sink.end();Term term_1;
        {
          BufferSink buf_76 = sink.context().makeBuffer(); buf_76.start(_M_STRING); buf_76.literal(3); buf_76.end();
          term_1 = buf_76.term();
        } sink.propertyNamed("$LineLocation", term_1);Term term_64;
        {
          BufferSink buf_51 = sink.context().makeBuffer(); buf_51.start(_M_STRING); buf_51.literal(26); buf_51.end();
          term_64 = buf_51.term();
        } sink.propertyNamed("$ColumnLocation", term_64);
        sink.start(_M__sTextCons);Term term_51;
        {
          BufferSink buf_38 = sink.context().makeBuffer(); buf_38.start(_M_STRING); buf_38.literal(3); buf_38.end();
          term_51 = buf_38.term();
        } sink.propertyNamed("$LineLocation", term_51);Term term_15;
        {
          BufferSink buf_37 = sink.context().makeBuffer(); buf_37.start(_M_STRING); buf_37.literal(26); buf_37.end();
          term_15 = buf_37.term();
        } sink.propertyNamed("$ColumnLocation", term_15);
        sink.start(_M__sTextBreak); sink.literal("\n");
        sink.end();Term term_80;
        {
          BufferSink buf_120 = sink.context().makeBuffer(); buf_120.start(_M_STRING); buf_120.literal(3); buf_120.end();
          term_80 = buf_120.term();
        } sink.propertyNamed("$LineLocation", term_80);Term term_5;
        {
          BufferSink buf_1 = sink.context().makeBuffer(); buf_1.start(_M_STRING); buf_1.literal(29); buf_1.end();
          term_5 = buf_1.term();
        } sink.propertyNamed("$ColumnLocation", term_5);
        sink.start(_M__sTextCons);Term term_85;
        {
          BufferSink buf_7 = sink.context().makeBuffer(); buf_7.start(_M_STRING); buf_7.literal(3); buf_7.end();
          term_85 = buf_7.term();
        } sink.propertyNamed("$LineLocation", term_85);Term term_12;
        {
          BufferSink buf_36 = sink.context().makeBuffer(); buf_36.start(_M_STRING); buf_36.literal(29); buf_36.end();
          term_12 = buf_36.term();
        } sink.propertyNamed("$ColumnLocation", term_12);
        sink.start(_M__sTextEmbed);Term term_91;
        {
          BufferSink buf_154 = sink.context().makeBuffer(); buf_154.start(_M_STRING); buf_154.literal(3); buf_154.end();
          term_91 = buf_154.term();
        } sink.propertyNamed("$LineLocation", term_91);Term term_84;
        {
          BufferSink buf_81 = sink.context().makeBuffer(); buf_81.start(_M_STRING); buf_81.literal(29); buf_81.end();
          term_84 = buf_81.term();
        } sink.propertyNamed("$ColumnLocation", term_84);
        sink.start(_M_AsText);sink.properties(safeRef(props));Term term_154;
        {
          BufferSink buf_48 = sink.context().makeBuffer(); buf_48.start(_M_OK); buf_48.end();
          term_154 = buf_48.term();
        }
        sink.substitute(term_19.ref(), new Variable[] { var }, new Term[] {term_154});
        sink.end();
        sink.end();Term term_337;
        {
          BufferSink buf_22 = sink.context().makeBuffer(); buf_22.start(_M_STRING); buf_22.literal(4); buf_22.end();
          term_337 = buf_22.term();
        } sink.propertyNamed("$LineLocation", term_337);Term term_38;
        {
          BufferSink buf_24 = sink.context().makeBuffer(); buf_24.start(_M_STRING); buf_24.literal(1); buf_24.end();
          term_38 = buf_24.term();
        } sink.propertyNamed("$ColumnLocation", term_38);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_CompileSave, props, term, term_29, var, term_19);
  }    final public static boolean _M_CompileNormalized(Sink sink, int shared, int depth, Properties props_82, Term term_172, Variable var_16, Term term_47) {
    if (depth < 2000) {
      label_90: {
        term_172 = force(sink.context(), term_172);
        if (term_172.descriptor() != _M_MODULE)
        {   break label_90;
        }Term sub = forceSub(sink.context(), term_172, 0).ref();
        /* #filename=sub */Term sub_89 = forceSub(sink.context(), term_172, 1).ref();
        /* #mode=sub */Term sub_39 = forceSub(sink.context(), term_172, 2).ref();
        sub_39 = force(sink.context(), sub_39);
        if (sub_39.descriptor() != _M_LOADED)
        {   break label_90;
        }
        Properties props_68 = safeRef(sub_39.properties());
        /* #=term *//*Contract*/sink.properties(safeRef(props_82));
        sink.start(_M_CompileSave);
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.copy(sub.ref()); sink.literal(".java");
        sink.end();
        sink.start(_M_GenerateJavaParsed); sink.copy(sub.ref());sink.properties(safeRef(props_68));
        sink.start(_M_OutputCrsx); sink.start(_M_OK); sink.end();
        sink.end(); sink.copy(sub_89.ref());
        sink.end();
        Variable var_5 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_5});
        VariableUse use = sink.context().makeVariableUse(var_5);
        sink.substitute(term_47.ref(), new Variable[] { var_16 }, new Term[] {use});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_CompileNormalized, props_82, term_172, var_16, term_47);
  }   final public static boolean _M_CompileModule(Sink sink, int shared, int depth, Properties props_43, Term term_176, Variable var_21, Term term_75) {
    if (depth < 2000) {
      label_76: {
        /* #key=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_43));
        sink.start(_M_CompileNormalized);
        sink.start(_M__s);sink.properties(safeRef(props_43));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_176.ref());
        sink.end();
        Variable var_44 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_44});
        VariableUse use_62 = sink.context().makeVariableUse(var_44);
        sink.substitute(term_75.ref(), new Variable[] { var_21 }, new Term[] {use_62});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_CompileModule, props_43, term_176, var_21, term_75);
  }   final public static boolean _M_CompileNextModule1(Sink sink, int shared, int depth, Properties props_13, Term term_99) {
    if (depth < 2000) {
      label_25: {
        term_99 = force(sink.context(), term_99);
        if (term_99.descriptor() != _M_MODULES)
        {   break label_25;
        }Term sub_96 = forceSub(sink.context(), term_99, 0).ref();
        sub_96 = force(sink.context(), sub_96);
        if (sub_96.descriptor() != _M__sNil)
        {   break label_25;
        }/*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal("}"); sink.end();Term term_39;
        {
          BufferSink buf_64 = sink.context().makeBuffer(); buf_64.start(_M_STRING); buf_64.literal(1); buf_64.end();
          term_39 = buf_64.term();
        } sink.propertyNamed("$LineLocation", term_39);Term term_56;
        {
          BufferSink buf_33 = sink.context().makeBuffer(); buf_33.start(_M_STRING); buf_33.literal(1); buf_33.end();
          term_56 = buf_33.term();
        } sink.propertyNamed("$ColumnLocation", term_56);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); return true;
      }
      label_95: {
        term_99 = force(sink.context(), term_99);
        if (term_99.descriptor() != _M_MODULES)
        {   break label_95;
        }Term sub_99 = forceSub(sink.context(), term_99, 0).ref();
        sub_99 = force(sink.context(), sub_99);
        if (sub_99.descriptor() != _M__sCons)
        {   break label_95;
        }Term sub_32 = forceSub(sink.context(), sub_99, 0).ref();
        /* #module=sub */Term sub_0 = forceSub(sink.context(), sub_99, 1).ref();
        /* #modules=sub *//*Contract*/sink.properties(safeRef(props_13));Term term_109;
        {
          BufferSink buf_16 = sink.context().makeBuffer();
          buf_16.start(_M_MODULES); buf_16.copy(sub_0.ref());
          buf_16.end();
          term_109 = buf_16.term();
        } sink.propertyNamed("$modules", term_109);
        sink.start(_M_CompileModule); sink.copy(sub_32.ref());
        Variable var_17 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_17});
        sink.start(_M_CompileNextModule); sink.use(var_17);
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_CompileNextModule1, props_13, term_99);
  } final public static boolean _M_CompileNextModule(Sink sink, int shared, int depth, Properties props_89, Term term_0) {
    if (depth < 2000) {
      label_10: {
        term_0 = force(sink.context(), term_0);
        if (term_0.descriptor() != _M_OK)
        {   break label_10;
        }/*Contract*/sink.properties(safeRef(props_89));
        sink.start(_M_CompileNextModule1);
        sink.start(_M__s);sink.properties(safeRef(props_89));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.literal("$modules");
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_CompileNextModule, props_89, term_0);
  } final public static boolean _M_AddImport(Sink sink, int shared, int depth, Properties props_3, Term term_17, Term term_58) {
    if (depth < 2000) {
      label_58: {
        /* #filename=term */
        term_58 = force(sink.context(), term_58);
        if (term_58.descriptor() != _M_CONTINUATION)
        {   break label_58;
        }Term sub_12 = forceSub(sink.context(), term_58, 0).ref();
        Variable binder = term_58.binders(0)[0];
        /* #=sub *//*Contract*/sink.properties(safeRef(props_3));Term term_124;
        {
          BufferSink buf_173 = sink.context().makeBuffer(); buf_173.start(_M_OK); buf_173.end();
          term_124 = buf_173.term();
        }
        sink.substitute(sub_12.ref(), new Variable[] { binder }, new Term[] {term_124}); return true; 
      }
    }
    return thunk(sink, _M_AddImport, props_3, term_17, term_58);
  }  final public static boolean _M_NormalizeDone1(Sink sink, int shared, int depth, Properties props_80, Term term_108, Term term_10, Term term_43, Term term_13, Term term_53, Term term_74, Term term_16, Variable var_35, Term term_46) {
    if (depth < 2000) {
      label_87: {
        term_108 = force(sink.context(), term_108);
        if (term_108.descriptor() != _M_MODULES)
        {   break label_87;
        }Term sub_75 = forceSub(sink.context(), term_108, 0).ref();
        /* #normalized=sub */
        term_10 = force(sink.context(), term_10);
        if (term_10.descriptor() != _M_MODULES)
        {   break label_87;
        }Term sub_42 = forceSub(sink.context(), term_10, 0).ref();
        /* #modules=sub */
        term_43 = force(sink.context(), term_43);
        if (term_43.descriptor() != _M_IMPORTS)
        {   break label_87;
        }Term sub_95 = forceSub(sink.context(), term_43, 0).ref();
        /* #imports=sub */
        /* #key=term */
        /* #filename=term */
        /* #mode=term */
        /* #content=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_80));Term term_50;
        {
          BufferSink buf_94 = sink.context().makeBuffer();
          buf_94.start(_M_MODULES);
          buf_94.start(_M_Concat); buf_94.copy(sub_75.ref());
          buf_94.start(_M__sCons); buf_94.copy(term_53.ref()); buf_94.start(_M__sNil); buf_94.end();
          buf_94.end();
          buf_94.end();
          buf_94.end();
          term_50 = buf_94.term();
        } sink.propertyNamed("$normalized", term_50);Term term_173;
        {
          BufferSink buf_92 = sink.context().makeBuffer();
          buf_92.start(_M_MODULE); buf_92.copy(term_53.ref()); buf_92.copy(term_74.ref()); buf_92.copy(term_16.ref());
          buf_92.end();
          term_173 = buf_92.term();
        }
        term_13 = force(sink.context(), term_13);
        Sink.property(sink, term_13, term_173);
        sink.start(_M_SeqMap);
        Variable var_65 = sink.context().makeVariable("name");
        Variable var_76 = sink.context().makeVariable("cont");
        sink.binds(new Variable[] {var_65,var_76});
        sink.start(_M_AddImport); sink.use(var_65); sink.use(var_76);
        sink.end(); sink.copy(sub_95.ref());
        Variable var_38 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_38});
        VariableUse use_44 = sink.context().makeVariableUse(var_38);
        sink.substitute(term_46.ref(), new Variable[] { var_35 }, new Term[] {use_44});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeDone1, props_80, term_108, term_10, term_43, term_13, term_53, term_74, term_16, var_35, term_46);
  }         final public static boolean _M_NormalizeDone(Sink sink, int shared, int depth, Properties props_41, Term term_119, Term term_31, Term term_201, Term term_70, Variable var_50, Term term_98) {
    if (depth < 2000) {
      label_85: {
        /* #key=term */
        /* #filename=term */
        /* #mode=term */
        term_70 = force(sink.context(), term_70);
        if (term_70.descriptor() != _M_LOADED)
        {   break label_85;
        }
        Properties props_71 = safeRef(term_70.properties());
        /* #=term *//*Contract*/sink.properties(safeRef(props_41));
        sink.start(_M_NormalizeDone1);
        sink.start(_M__s);sink.properties(safeRef(props_41));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.literal("$normalized");
        sink.end();
        sink.start(_M__s);sink.properties(safeRef(props_41));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.literal("$modules");
        sink.end();
        sink.start(_M__s);sink.properties(safeRef(props_71));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.literal("$imported");
        sink.end(); sink.copy(term_119.ref()); sink.copy(term_31.ref()); sink.copy(term_201.ref());sink.properties(safeRef(props_71));
        sink.start(_M_LOADED);
        sink.end();
        Variable var_82 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_82});
        VariableUse use_36 = sink.context().makeVariableUse(var_82);
        sink.substitute(term_98.ref(), new Variable[] { var_50 }, new Term[] {use_36});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeDone, props_41, term_119, term_31, term_201, term_70, var_50, term_98);
  }      final public static boolean _M_NormalizeParsed(Sink sink, int shared, int depth, Properties props_59, Term term_146, Term term_96, Term term_187, Term term_44, Variable var_53, Term term_14) {
    if (depth < 2000) {
      label_99: {
        /* #key=term */
        /* #filename=term */
        /* #mode=term */
        /* #crsx=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_59));
        sink.start(_M_NormalizeDone); sink.copy(term_146.ref()); sink.copy(term_96.ref()); sink.copy(term_187.ref());
        sink.start(_M_NormalizeToState); sink.copy(term_96.ref()); sink.copy(term_44.ref());
        sink.end();
        Variable var_99 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_99});
        VariableUse use_1 = sink.context().makeVariableUse(var_99);
        sink.substitute(term_14.ref(), new Variable[] { var_53 }, new Term[] {use_1});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeParsed, props_59, term_146, term_96, term_187, term_44, var_53, term_14);
  }      final public static boolean _M_NormalizeModuleLoad(Sink sink, int shared, int depth, Properties props_51, Term term_36, Variable var_15, Term term_92) {
    if (depth < 2000) {
      label_14: {
        term_36 = force(sink.context(), term_36);
        if (term_36.descriptor() != _M_MODULE)
        {   break label_14;
        }Term sub_10 = forceSub(sink.context(), term_36, 0).ref();
        /* #filename=sub */Term sub_20 = forceSub(sink.context(), term_36, 1).ref();
        /* #mode=sub */Term sub_41 = forceSub(sink.context(), term_36, 2).ref();
        sub_41 = force(sink.context(), sub_41);
        if (sub_41.descriptor() != _M_NOTLOADED)
        {   break label_14;
        }
        /* #=term *//*Contract*/sink.properties(safeRef(props_51));
        sink.start(_M_NormalizeParsed); sink.start(_M_ModuleKey); sink.copy(sub_10.ref()); sink.end(); sink.copy(sub_10.ref()); sink.copy(sub_20.ref());
        sink.start(_M__s); sink.start(_M_Builtin_sParseResource); sink.end(); sink.literal("crsx"); sink.copy(sub_10.ref());
        sink.end();
        Variable var_153 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_153});
        VariableUse use_290 = sink.context().makeVariableUse(var_153);
        sink.substitute(term_92.ref(), new Variable[] { var_15 }, new Term[] {use_290});
        sink.end(); return true;
      }
      label_63: {
        term_36 = force(sink.context(), term_36);
        if (term_36.descriptor() != _M_MODULE)
        {   break label_63;
        }Term sub_59 = forceSub(sink.context(), term_36, 0).ref();
        /* #filename=sub */Term sub_26 = forceSub(sink.context(), term_36, 1).ref();
        /* #mode=sub */Term sub_52 = forceSub(sink.context(), term_36, 2).ref();
        sub_52 = force(sink.context(), sub_52);
        if (sub_52.descriptor() != _M_LOADED)
        {   break label_63;
        }
        Properties props_67 = safeRef(sub_52.properties());
        /* #=term *//*Contract*/sink.properties(safeRef(props_51));Term term_61;
        {
          BufferSink buf_57 = sink.context().makeBuffer(); buf_57.start(_M_OK); buf_57.end();
          term_61 = buf_57.term();
        }
        sink.substitute(term_92.ref(), new Variable[] { var_15 }, new Term[] {term_61}); return true;
      }
    }
    return thunk(sink, _M_NormalizeModuleLoad, props_51, term_36, var_15, term_92);
  }   final public static boolean _M_NormalizeModule(Sink sink, int shared, int depth, Properties props_94, Term term_125, Variable var_94, Term term_152) {
    if (depth < 2000) {
      label_60: {
        /* #key=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_94));
        sink.start(_M_NormalizeModuleLoad);
        sink.start(_M__s);sink.properties(safeRef(props_94));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_125.ref());
        sink.end();
        Variable var_57 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_57});
        VariableUse use_53 = sink.context().makeVariableUse(var_57);
        sink.substitute(term_152.ref(), new Variable[] { var_94 }, new Term[] {use_53});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeModule, props_94, term_125, var_94, term_152);
  }   final public static boolean _M_NormalizeNextModule1(Sink sink, int shared, int depth, Properties props_38, Term term_185) {
    if (depth < 2000) {
      label_47: {
        term_185 = force(sink.context(), term_185);
        if (term_185.descriptor() != _M_MODULES)
        {   break label_47;
        }Term sub_71 = forceSub(sink.context(), term_185, 0).ref();
        sub_71 = force(sink.context(), sub_71);
        if (sub_71.descriptor() != _M__sNil)
        {   break label_47;
        }/*Contract*/sink.properties(safeRef(props_38));
        sink.start(_M_CompileNextModule); sink.start(_M_OK); sink.end();
        sink.end(); return true;
      }
      label_91: {
        term_185 = force(sink.context(), term_185);
        if (term_185.descriptor() != _M_MODULES)
        {   break label_91;
        }Term sub_54 = forceSub(sink.context(), term_185, 0).ref();
        sub_54 = force(sink.context(), sub_54);
        if (sub_54.descriptor() != _M__sCons)
        {   break label_91;
        }Term sub_57 = forceSub(sink.context(), sub_54, 0).ref();
        /* #module=sub */Term sub_51 = forceSub(sink.context(), sub_54, 1).ref();
        /* #modules=sub *//*Contract*/sink.properties(safeRef(props_38));Term term_135;
        {
          BufferSink buf_188 = sink.context().makeBuffer();
          buf_188.start(_M_MODULES); buf_188.copy(sub_51.ref());
          buf_188.end();
          term_135 = buf_188.term();
        } sink.propertyNamed("$notloaded", term_135);
        sink.start(_M_NormalizeModule); sink.copy(sub_57.ref());
        Variable var_114 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_114});
        sink.start(_M_NormalizeNextModule); sink.use(var_114);
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeNextModule1, props_38, term_185);
  } final public static boolean _M_NormalizeNextModule(Sink sink, int shared, int depth, Properties props_27, Term term_78) {
    if (depth < 2000) {
      label_9: {
        term_78 = force(sink.context(), term_78);
        if (term_78.descriptor() != _M_OK)
        {   break label_9;
        }/*Contract*/sink.properties(safeRef(props_27));
        sink.start(_M_NormalizeNextModule1);
        sink.start(_M__s);sink.properties(safeRef(props_27));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.literal("$notloaded");
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeNextModule, props_27, term_78);
  } final public static boolean _M_Compile(Sink sink, int shared, int depth, Term term_153) {
    if (depth < 2000) {Term term_23;
      {
        BufferSink buf_159 = sink.context().makeBuffer();
        buf_159.start(_M_MODULES); buf_159.start(_M__sNil); buf_159.end();
        buf_159.end();
        term_23 = buf_159.term();
      } sink.propertyNamed("$modules", term_23);Term term_143;
      {
        BufferSink buf_55 = sink.context().makeBuffer();
        buf_55.start(_M_MODULES); buf_55.start(_M__sNil); buf_55.end();
        buf_55.end();
        term_143 = buf_55.term();
      } sink.propertyNamed("$notloaded", term_143);Term term_77;
      {
        BufferSink buf_101 = sink.context().makeBuffer();
        buf_101.start(_M_MODULES); buf_101.start(_M__sNil); buf_101.end();
        buf_101.end();
        term_77 = buf_101.term();
      } sink.propertyNamed("$normalized", term_77);
      sink.start(_M_AddModule); sink.copy(term_153.ref()); sink.start(_M_MAINMODULE); sink.end();
      Variable var_3 = sink.context().makeVariable("ok");
      sink.binds(new Variable[] {var_3}); sink.start(_M_NormalizeNextModule); sink.use(var_3); sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Compile, term_153);
  } 
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.State.init(context); org.crsx.compiler.Normalizer.init(context); org.crsx.compiler.cg.Cgjava.init(context); org.crsx.compiler.std.Core.init(context); org.crsx.compiler.std.List.init(context); org.crsx.compiler.std.Text.init(context); context.register(_M_CompileSave); context.register(_M_CompileNormalized); context.register(_M_CompileModule); context.register(_M_CompileNextModule1); context.register(_M_CompileNextModule); context.register(_M_AddImport); context.register(_M_NormalizeDone1); context.register(_M_NormalizeDone); context.register(_M_NormalizeParsed); context.register(_M_NormalizeModuleLoad); context.register(_M_NormalizeModule); context.register(_M_NormalizeNextModule1); context.register(_M_NormalizeNextModule); context.register(_M_Compile);
      initialized = true;
    }
  }

/* END MODULE « "/Users/villardl/Projects/crsx/crsx4/src/crsx.crs.java" » */
}