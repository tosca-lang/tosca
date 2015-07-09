/* START MODULE /Users/villardl/Projects/crsx/crsx4/src/crsx.crs.java */
/** Generated File */package org.crsx.compiler;
import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;
import static org.crsx.runtime.Normalizer.force;
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
  final public static DynamicFunctionDescriptor _M_Compile = makeFunction("Compile", Crsx.class, "_M_Compile");final public static boolean _M_CompileSave(Sink sink, int shared, int depth, Properties props, Term term, Term term_15, Variable var, Term term_54) {
    if (depth < 2000) {
      label: {
        /* #filename=term */
        /* #code=term */
        /* #=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextChars); sink.literal("/* START MODULE ");
        sink.end();Term term_84;
        {
          BufferSink buf = sink.context().makeBuffer(); buf.start(_M_STRING); buf.literal(1); buf.end();
          term_84 = buf.term();
        } sink.propertyNamed("$LineLocation", term_84);Term term_1;
        {
          BufferSink buf_10 = sink.context().makeBuffer(); buf_10.start(_M_STRING); buf_10.literal(1); buf_10.end();
          term_1 = buf_10.term();
        } sink.propertyNamed("$ColumnLocation", term_1);
        sink.start(_M__sTextCons);Term term_6;
        {
          BufferSink buf_71 = sink.context().makeBuffer(); buf_71.start(_M_STRING); buf_71.literal(1); buf_71.end();
          term_6 = buf_71.term();
        } sink.propertyNamed("$LineLocation", term_6);Term term_63;
        {
          BufferSink buf_41 = sink.context().makeBuffer(); buf_41.start(_M_STRING); buf_41.literal(17); buf_41.end();
          term_63 = buf_41.term();
        } sink.propertyNamed("$ColumnLocation", term_63);
        sink.start(_M__sTextChars); sink.copy(term.ref());
        sink.end();Term term_95;
        {
          BufferSink buf_72 = sink.context().makeBuffer(); buf_72.start(_M_STRING); buf_72.literal(1); buf_72.end();
          term_95 = buf_72.term();
        } sink.propertyNamed("$LineLocation", term_95);Term term_62;
        {
          BufferSink buf_95 = sink.context().makeBuffer(); buf_95.start(_M_STRING); buf_95.literal(18); buf_95.end();
          term_62 = buf_95.term();
        } sink.propertyNamed("$ColumnLocation", term_62);
        sink.start(_M__sTextCons);Term term_45;
        {
          BufferSink buf_43 = sink.context().makeBuffer(); buf_43.start(_M_STRING); buf_43.literal(1); buf_43.end();
          term_45 = buf_43.term();
        } sink.propertyNamed("$LineLocation", term_45);Term term_179;
        {
          BufferSink buf_35 = sink.context().makeBuffer(); buf_35.start(_M_STRING); buf_35.literal(18); buf_35.end();
          term_179 = buf_35.term();
        } sink.propertyNamed("$ColumnLocation", term_179);
        sink.start(_M__sTextChars); sink.literal(" */");
        sink.end();Term term_91;
        {
          BufferSink buf_56 = sink.context().makeBuffer(); buf_56.start(_M_STRING); buf_56.literal(1); buf_56.end();
          term_91 = buf_56.term();
        } sink.propertyNamed("$LineLocation", term_91);Term term_7;
        {
          BufferSink buf_62 = sink.context().makeBuffer(); buf_62.start(_M_STRING); buf_62.literal(29); buf_62.end();
          term_7 = buf_62.term();
        } sink.propertyNamed("$ColumnLocation", term_7);
        sink.start(_M__sTextCons);Term term_57;
        {
          BufferSink buf_2 = sink.context().makeBuffer(); buf_2.start(_M_STRING); buf_2.literal(1); buf_2.end();
          term_57 = buf_2.term();
        } sink.propertyNamed("$LineLocation", term_57);Term term_82;
        {
          BufferSink buf_74 = sink.context().makeBuffer(); buf_74.start(_M_STRING); buf_74.literal(29); buf_74.end();
          term_82 = buf_74.term();
        } sink.propertyNamed("$ColumnLocation", term_82);
        sink.start(_M__sTextBreak); sink.literal("\n");
        sink.end();Term term_87;
        {
          BufferSink buf_96 = sink.context().makeBuffer(); buf_96.start(_M_STRING); buf_96.literal(1); buf_96.end();
          term_87 = buf_96.term();
        } sink.propertyNamed("$LineLocation", term_87);Term term_65;
        {
          BufferSink buf_53 = sink.context().makeBuffer(); buf_53.start(_M_STRING); buf_53.literal(32); buf_53.end();
          term_65 = buf_53.term();
        } sink.propertyNamed("$ColumnLocation", term_65);
        sink.start(_M__sTextCons);Term term_33;
        {
          BufferSink buf_4 = sink.context().makeBuffer(); buf_4.start(_M_STRING); buf_4.literal(1); buf_4.end();
          term_33 = buf_4.term();
        } sink.propertyNamed("$LineLocation", term_33);Term term_78;
        {
          BufferSink buf_14 = sink.context().makeBuffer(); buf_14.start(_M_STRING); buf_14.literal(32); buf_14.end();
          term_78 = buf_14.term();
        } sink.propertyNamed("$ColumnLocation", term_78);
        sink.start(_M__sTextEmbed);Term term_37;
        {
          BufferSink buf_6 = sink.context().makeBuffer(); buf_6.start(_M_STRING); buf_6.literal(1); buf_6.end();
          term_37 = buf_6.term();
        } sink.propertyNamed("$LineLocation", term_37);Term term_27;
        {
          BufferSink buf_70 = sink.context().makeBuffer(); buf_70.start(_M_STRING); buf_70.literal(32); buf_70.end();
          term_27 = buf_70.term();
        } sink.propertyNamed("$ColumnLocation", term_27);
        sink.start(_M_AsText); sink.copy(term_15.ref());
        sink.end();
        sink.end();Term term_60;
        {
          BufferSink buf_28 = sink.context().makeBuffer(); buf_28.start(_M_STRING); buf_28.literal(2); buf_28.end();
          term_60 = buf_28.term();
        } sink.propertyNamed("$LineLocation", term_60);Term term_75;
        {
          BufferSink buf_8 = sink.context().makeBuffer(); buf_8.start(_M_STRING); buf_8.literal(1); buf_8.end();
          term_75 = buf_8.term();
        } sink.propertyNamed("$ColumnLocation", term_75);
        sink.start(_M__sTextCons);Term term_39;
        {
          BufferSink buf_25 = sink.context().makeBuffer(); buf_25.start(_M_STRING); buf_25.literal(2); buf_25.end();
          term_39 = buf_25.term();
        } sink.propertyNamed("$LineLocation", term_39);Term term_22;
        {
          BufferSink buf_78 = sink.context().makeBuffer(); buf_78.start(_M_STRING); buf_78.literal(1); buf_78.end();
          term_22 = buf_78.term();
        } sink.propertyNamed("$ColumnLocation", term_22);
        sink.start(_M__sTextBreak); sink.literal("\n");
        sink.end();Term term_76;
        {
          BufferSink buf_15 = sink.context().makeBuffer(); buf_15.start(_M_STRING); buf_15.literal(2); buf_15.end();
          term_76 = buf_15.term();
        } sink.propertyNamed("$LineLocation", term_76);Term term_4;
        {
          BufferSink buf_45 = sink.context().makeBuffer(); buf_45.start(_M_STRING); buf_45.literal(8); buf_45.end();
          term_4 = buf_45.term();
        } sink.propertyNamed("$ColumnLocation", term_4);
        sink.start(_M__sTextCons);Term term_30;
        {
          BufferSink buf_7 = sink.context().makeBuffer(); buf_7.start(_M_STRING); buf_7.literal(2); buf_7.end();
          term_30 = buf_7.term();
        } sink.propertyNamed("$LineLocation", term_30);Term term_133;
        {
          BufferSink buf_17 = sink.context().makeBuffer(); buf_17.start(_M_STRING); buf_17.literal(8); buf_17.end();
          term_133 = buf_17.term();
        } sink.propertyNamed("$ColumnLocation", term_133);
        sink.start(_M__sTextChars); sink.literal("/* END MODULE ");
        sink.end();Term term_99;
        {
          BufferSink buf_39 = sink.context().makeBuffer(); buf_39.start(_M_STRING); buf_39.literal(3); buf_39.end();
          term_99 = buf_39.term();
        } sink.propertyNamed("$LineLocation", term_99);Term term_2;
        {
          BufferSink buf_11 = sink.context().makeBuffer(); buf_11.start(_M_STRING); buf_11.literal(1); buf_11.end();
          term_2 = buf_11.term();
        } sink.propertyNamed("$ColumnLocation", term_2);
        sink.start(_M__sTextCons);Term term_89;
        {
          BufferSink buf_61 = sink.context().makeBuffer(); buf_61.start(_M_STRING); buf_61.literal(3); buf_61.end();
          term_89 = buf_61.term();
        } sink.propertyNamed("$LineLocation", term_89);Term term_98;
        {
          BufferSink buf_0 = sink.context().makeBuffer(); buf_0.start(_M_STRING); buf_0.literal(1); buf_0.end();
          term_98 = buf_0.term();
        } sink.propertyNamed("$ColumnLocation", term_98);
        sink.start(_M__sTextEmbed);Term term_85;
        {
          BufferSink buf_86 = sink.context().makeBuffer(); buf_86.start(_M_STRING); buf_86.literal(3); buf_86.end();
          term_85 = buf_86.term();
        } sink.propertyNamed("$LineLocation", term_85);Term term_58;
        {
          BufferSink buf_57 = sink.context().makeBuffer(); buf_57.start(_M_STRING); buf_57.literal(1); buf_57.end();
          term_58 = buf_57.term();
        } sink.propertyNamed("$ColumnLocation", term_58);
        sink.start(_M_AsText); sink.copy(term.ref());
        sink.end();
        sink.end();Term term_51;
        {
          BufferSink buf_40 = sink.context().makeBuffer(); buf_40.start(_M_STRING); buf_40.literal(3); buf_40.end();
          term_51 = buf_40.term();
        } sink.propertyNamed("$LineLocation", term_51);Term term_164;
        {
          BufferSink buf_33 = sink.context().makeBuffer(); buf_33.start(_M_STRING); buf_33.literal(15); buf_33.end();
          term_164 = buf_33.term();
        } sink.propertyNamed("$ColumnLocation", term_164);
        sink.start(_M__sTextCons);Term term_68;
        {
          BufferSink buf_47 = sink.context().makeBuffer(); buf_47.start(_M_STRING); buf_47.literal(3); buf_47.end();
          term_68 = buf_47.term();
        } sink.propertyNamed("$LineLocation", term_68);Term term_55;
        {
          BufferSink buf_54 = sink.context().makeBuffer(); buf_54.start(_M_STRING); buf_54.literal(15); buf_54.end();
          term_55 = buf_54.term();
        } sink.propertyNamed("$ColumnLocation", term_55);
        sink.start(_M__sTextChars); sink.literal(" */");
        sink.end();Term term_9;
        {
          BufferSink buf_172 = sink.context().makeBuffer(); buf_172.start(_M_STRING); buf_172.literal(3); buf_172.end();
          term_9 = buf_172.term();
        } sink.propertyNamed("$LineLocation", term_9);Term term_31;
        {
          BufferSink buf_59 = sink.context().makeBuffer(); buf_59.start(_M_STRING); buf_59.literal(26); buf_59.end();
          term_31 = buf_59.term();
        } sink.propertyNamed("$ColumnLocation", term_31);
        sink.start(_M__sTextCons);Term term_86;
        {
          BufferSink buf_64 = sink.context().makeBuffer(); buf_64.start(_M_STRING); buf_64.literal(3); buf_64.end();
          term_86 = buf_64.term();
        } sink.propertyNamed("$LineLocation", term_86);Term term_146;
        {
          BufferSink buf_18 = sink.context().makeBuffer(); buf_18.start(_M_STRING); buf_18.literal(26); buf_18.end();
          term_146 = buf_18.term();
        } sink.propertyNamed("$ColumnLocation", term_146);
        sink.start(_M__sTextBreak); sink.literal("\n");
        sink.end();Term term_163;
        {
          BufferSink buf_66 = sink.context().makeBuffer(); buf_66.start(_M_STRING); buf_66.literal(3); buf_66.end();
          term_163 = buf_66.term();
        } sink.propertyNamed("$LineLocation", term_163);Term term_41;
        {
          BufferSink buf_84 = sink.context().makeBuffer(); buf_84.start(_M_STRING); buf_84.literal(29); buf_84.end();
          term_41 = buf_84.term();
        } sink.propertyNamed("$ColumnLocation", term_41);
        sink.start(_M__sTextCons);Term term_186;
        {
          BufferSink buf_85 = sink.context().makeBuffer(); buf_85.start(_M_STRING); buf_85.literal(3); buf_85.end();
          term_186 = buf_85.term();
        } sink.propertyNamed("$LineLocation", term_186);Term term_10;
        {
          BufferSink buf_48 = sink.context().makeBuffer(); buf_48.start(_M_STRING); buf_48.literal(29); buf_48.end();
          term_10 = buf_48.term();
        } sink.propertyNamed("$ColumnLocation", term_10);
        sink.start(_M__sTextEmbed);Term term_38;
        {
          BufferSink buf_162 = sink.context().makeBuffer(); buf_162.start(_M_STRING); buf_162.literal(3); buf_162.end();
          term_38 = buf_162.term();
        } sink.propertyNamed("$LineLocation", term_38);Term term_187;
        {
          BufferSink buf_93 = sink.context().makeBuffer(); buf_93.start(_M_STRING); buf_93.literal(29); buf_93.end();
          term_187 = buf_93.term();
        } sink.propertyNamed("$ColumnLocation", term_187);
        sink.start(_M_AsText);sink.properties(safeRef(props));Term term_118;
        {
          BufferSink buf_3 = sink.context().makeBuffer(); buf_3.start(_M_OK); buf_3.end();
          term_118 = buf_3.term();
        }
        sink.substitute(term_54.ref(), new Variable[] { var }, new Term[] {term_118});
        sink.end();
        sink.end();Term term_52;
        {
          BufferSink buf_98 = sink.context().makeBuffer(); buf_98.start(_M_STRING); buf_98.literal(4); buf_98.end();
          term_52 = buf_98.term();
        } sink.propertyNamed("$LineLocation", term_52);Term term_50;
        {
          BufferSink buf_23 = sink.context().makeBuffer(); buf_23.start(_M_STRING); buf_23.literal(1); buf_23.end();
          term_50 = buf_23.term();
        } sink.propertyNamed("$ColumnLocation", term_50);
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
    return thunk(sink, _M_CompileSave, props, term, term_15, var, term_54);
  }    final public static boolean _M_CompileNormalized(Sink sink, int shared, int depth, Properties props_59, Term term_3, Variable var_47, Term term_18) {
    if (depth < 2000) {
      label_76: {
        if (term_3.descriptor() != _M_MODULE)
        {   break label_76;
        }Term sub = term_3.sub(0).ref();
        /* #filename=sub */Term sub_57 = term_3.sub(1).ref();
        /* #mode=sub */Term sub_49 = term_3.sub(2).ref();
        if (sub_49.descriptor() != _M_LOADED)
        {   break label_76;
        }
        Properties props_5 = safeRef(sub_49.properties());
        /* #=term *//*Contract*/sink.properties(safeRef(props_59));
        sink.start(_M_CompileSave);
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.copy(sub.ref()); sink.literal(".java");
        sink.end();
        sink.start(_M_GenerateJavaParsed); sink.copy(sub.ref());sink.properties(safeRef(props_5));
        sink.start(_M_OutputCrsx); sink.start(_M_OK); sink.end();
        sink.end(); sink.copy(sub_57.ref());
        sink.end();
        Variable var_86 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_86});
        VariableUse use = sink.context().makeVariableUse(var_86);
        sink.substitute(term_18.ref(), new Variable[] { var_47 }, new Term[] {use});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_CompileNormalized, props_59, term_3, var_47, term_18);
  }   final public static boolean _M_CompileModule(Sink sink, int shared, int depth, Properties props_21, Term term_0, Variable var_69, Term term_88) {
    if (depth < 2000) {
      label_36: {
        /* #key=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_21));
        sink.start(_M_CompileNormalized);
        sink.start(_M__s);sink.properties(safeRef(props_21));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_0.ref());
        sink.end();
        Variable var_98 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_98});
        VariableUse use_1 = sink.context().makeVariableUse(var_98);
        sink.substitute(term_88.ref(), new Variable[] { var_69 }, new Term[] {use_1});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_CompileModule, props_21, term_0, var_69, term_88);
  }   final public static boolean _M_CompileNextModule1(Sink sink, int shared, int depth, Properties props_89, Term term_14) {
    if (depth < 2000) {
      label_96: {
        if (term_14.descriptor() != _M_MODULES)
        {   break label_96;
        }Term sub_98 = term_14.sub(0).ref();
        if (sub_98.descriptor() != _M__sNil)
        {   break label_96;
        }/*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal("}"); sink.end();Term term_105;
        {
          BufferSink buf_136 = sink.context().makeBuffer(); buf_136.start(_M_STRING); buf_136.literal(1); buf_136.end();
          term_105 = buf_136.term();
        } sink.propertyNamed("$LineLocation", term_105);Term term_34;
        {
          BufferSink buf_105 = sink.context().makeBuffer(); buf_105.start(_M_STRING); buf_105.literal(1); buf_105.end();
          term_34 = buf_105.term();
        } sink.propertyNamed("$ColumnLocation", term_34);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); return true;
      }
      label_20: {
        if (term_14.descriptor() != _M_MODULES)
        {   break label_20;
        }Term sub_82 = term_14.sub(0).ref();
        if (sub_82.descriptor() != _M__sCons)
        {   break label_20;
        }Term sub_44 = sub_82.sub(0).ref();
        /* #module=sub */Term sub_30 = sub_82.sub(1).ref();
        /* #modules=sub *//*Contract*/sink.properties(safeRef(props_89));Term term_135;
        {
          BufferSink buf_82 = sink.context().makeBuffer();
          buf_82.start(_M_MODULES); buf_82.copy(sub_30.ref());
          buf_82.end();
          term_135 = buf_82.term();
        } sink.propertyNamed("$modules", term_135);
        sink.start(_M_CompileModule); sink.copy(sub_44.ref());
        Variable var_18 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_18});
        sink.start(_M_CompileNextModule); sink.use(var_18);
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_CompileNextModule1, props_89, term_14);
  } final public static boolean _M_CompileNextModule(Sink sink, int shared, int depth, Properties props_99, Term term_180) {
    if (depth < 2000) {
      label_13: {
        if (term_180.descriptor() != _M_OK)
        {   break label_13;
        }/*Contract*/sink.properties(safeRef(props_99));
        sink.start(_M_CompileNextModule1);
        sink.start(_M__s);sink.properties(safeRef(props_99));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.literal("$modules");
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_CompileNextModule, props_99, term_180);
  } final public static boolean _M_AddImport(Sink sink, int shared, int depth, Properties props_79, Term term_272, Term term_154) {
    if (depth < 2000) {
      label_3: {
        /* #filename=term */
        if (term_154.descriptor() != _M_CONTINUATION)
        {   break label_3;
        }Term sub_46 = term_154.sub(0).ref();
        Variable binder = term_154.binders(0)[0];
        /* #=sub *//*Contract*/sink.properties(safeRef(props_79));Term term_49;
        {
          BufferSink buf_38 = sink.context().makeBuffer(); buf_38.start(_M_OK); buf_38.end();
          term_49 = buf_38.term();
        }
        sink.substitute(sub_46.ref(), new Variable[] { binder }, new Term[] {term_49}); return true; 
      }
    }
    return thunk(sink, _M_AddImport, props_79, term_272, term_154);
  }  final public static boolean _M_NormalizeDone1(Sink sink, int shared, int depth, Properties props_66, Term term_5, Term term_96, Term term_339, Term term_73, Term term_8, Term term_66, Term term_53, Variable var_34, Term term_32) {
    if (depth < 2000) {
      label_50: {
        if (term_5.descriptor() != _M_MODULES)
        {   break label_50;
        }Term sub_17 = term_5.sub(0).ref();
        /* #normalized=sub */
        if (term_96.descriptor() != _M_MODULES)
        {   break label_50;
        }Term sub_54 = term_96.sub(0).ref();
        /* #modules=sub */
        if (term_339.descriptor() != _M_IMPORTS)
        {   break label_50;
        }Term sub_2 = term_339.sub(0).ref();
        /* #imports=sub */
        /* #key=term */
        /* #filename=term */
        /* #mode=term */
        /* #content=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_66));Term term_162;
        {
          BufferSink buf_270 = sink.context().makeBuffer();
          buf_270.start(_M_MODULES);
          buf_270.start(_M_Concat); buf_270.copy(sub_17.ref());
          buf_270.start(_M__sCons); buf_270.copy(term_8.ref()); buf_270.start(_M__sNil); buf_270.end();
          buf_270.end();
          buf_270.end();
          buf_270.end();
          term_162 = buf_270.term();
        } sink.propertyNamed("$normalized", term_162);Term term_11;
        {
          BufferSink buf_50 = sink.context().makeBuffer();
          buf_50.start(_M_MODULE); buf_50.copy(term_8.ref()); buf_50.copy(term_66.ref()); buf_50.copy(term_53.ref());
          buf_50.end();
          term_11 = buf_50.term();
        }
        term_73 = force(sink.context(), term_73);
        Sink.property(sink, term_73, term_11);
        sink.start(_M_SeqMap);
        Variable var_94 = sink.context().makeVariable("name");
        Variable var_6 = sink.context().makeVariable("cont");
        sink.binds(new Variable[] {var_94,var_6});
        sink.start(_M_AddImport); sink.use(var_94); sink.use(var_6);
        sink.end(); sink.copy(sub_2.ref());
        Variable var_48 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_48});
        VariableUse use_53 = sink.context().makeVariableUse(var_48);
        sink.substitute(term_32.ref(), new Variable[] { var_34 }, new Term[] {use_53});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeDone1, props_66, term_5, term_96, term_339, term_73, term_8, term_66, term_53, var_34, term_32);
  }         final public static boolean _M_NormalizeDone(Sink sink, int shared, int depth, Properties props_138, Term term_40, Term term_119, Term term_61, Term term_102, Variable var_93, Term term_47) {
    if (depth < 2000) {
      label_80: {
        /* #key=term */
        /* #filename=term */
        /* #mode=term */
        if (term_102.descriptor() != _M_LOADED)
        {   break label_80;
        }
        Properties props_12 = safeRef(term_102.properties());
        /* #=term *//*Contract*/sink.properties(safeRef(props_138));
        sink.start(_M_NormalizeDone1);
        sink.start(_M__s);sink.properties(safeRef(props_138));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.literal("$normalized");
        sink.end();
        sink.start(_M__s);sink.properties(safeRef(props_138));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.literal("$modules");
        sink.end();
        sink.start(_M__s);sink.properties(safeRef(props_12));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.literal("$imported");
        sink.end(); sink.copy(term_40.ref()); sink.copy(term_119.ref()); sink.copy(term_61.ref());sink.properties(safeRef(props_12));
        sink.start(_M_LOADED);
        sink.end();
        Variable var_37 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_37});
        VariableUse use_47 = sink.context().makeVariableUse(var_37);
        sink.substitute(term_47.ref(), new Variable[] { var_93 }, new Term[] {use_47});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeDone, props_138, term_40, term_119, term_61, term_102, var_93, term_47);
  }      final public static boolean _M_NormalizeParsed(Sink sink, int shared, int depth, Properties props_84, Term term_97, Term term_134, Term term_74, Term term_322, Variable var_3, Term term_77) {
    if (depth < 2000) {
      label_116: {
        /* #key=term */
        /* #filename=term */
        /* #mode=term */
        /* #crsx=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_84));
        sink.start(_M_NormalizeDone); sink.copy(term_97.ref()); sink.copy(term_134.ref()); sink.copy(term_74.ref());
        sink.start(_M_NormalizeToState); sink.copy(term_134.ref()); sink.copy(term_322.ref());
        sink.end();
        Variable var_130 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_130});
        VariableUse use_39 = sink.context().makeVariableUse(var_130);
        sink.substitute(term_77.ref(), new Variable[] { var_3 }, new Term[] {use_39});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeParsed, props_84, term_97, term_134, term_74, term_322, var_3, term_77);
  }      final public static boolean _M_NormalizeModuleLoad(Sink sink, int shared, int depth, Properties props_96, Term term_156, Variable var_32, Term term_110) {
    if (depth < 2000) {
      label_1: {
        if (term_156.descriptor() != _M_MODULE)
        {   break label_1;
        }Term sub_185 = term_156.sub(0).ref();
        /* #filename=sub */Term sub_63 = term_156.sub(1).ref();
        /* #mode=sub */Term sub_77 = term_156.sub(2).ref();
        if (sub_77.descriptor() != _M_NOTLOADED)
        {   break label_1;
        }
        /* #=term *//*Contract*/sink.properties(safeRef(props_96));
        sink.start(_M_NormalizeParsed);
        sink.start(_M_ModuleKey); sink.copy(sub_185.ref());
        sink.end(); sink.copy(sub_185.ref()); sink.copy(sub_63.ref());
        sink.start(_M__s); sink.start(_M_Builtin_sParseResource); sink.end(); sink.literal("crsx"); sink.copy(sub_185.ref());
        sink.end();
        Variable var_77 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_77});
        VariableUse use_72 = sink.context().makeVariableUse(var_77);
        sink.substitute(term_110.ref(), new Variable[] { var_32 }, new Term[] {use_72});
        sink.end(); return true;
      }
      label_169: {
        if (term_156.descriptor() != _M_MODULE)
        {   break label_169;
        }Term sub_33 = term_156.sub(0).ref();
        /* #filename=sub */Term sub_79 = term_156.sub(1).ref();
        /* #mode=sub */Term sub_23 = term_156.sub(2).ref();
        if (sub_23.descriptor() != _M_LOADED)
        {   break label_169;
        }
        Properties props_69 = safeRef(sub_23.properties());
        /* #=term *//*Contract*/sink.properties(safeRef(props_96));Term term_20;
        {
          BufferSink buf_83 = sink.context().makeBuffer(); buf_83.start(_M_OK); buf_83.end();
          term_20 = buf_83.term();
        }
        sink.substitute(term_110.ref(), new Variable[] { var_32 }, new Term[] {term_20}); return true;
      }
    }
    return thunk(sink, _M_NormalizeModuleLoad, props_96, term_156, var_32, term_110);
  }   final public static boolean _M_NormalizeModule(Sink sink, int shared, int depth, Properties props_91, Term term_17, Variable var_60, Term term_80) {
    if (depth < 2000) {
      label_89: {
        /* #key=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_91));
        sink.start(_M_NormalizeModuleLoad);
        sink.start(_M__s);sink.properties(safeRef(props_91));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_17.ref());
        sink.end();
        Variable var_92 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_92});
        VariableUse use_89 = sink.context().makeVariableUse(var_92);
        sink.substitute(term_80.ref(), new Variable[] { var_60 }, new Term[] {use_89});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeModule, props_91, term_17, var_60, term_80);
  }   final public static boolean _M_NormalizeNextModule1(Sink sink, int shared, int depth, Properties props_16, Term term_56) {
    if (depth < 2000) {
      label_33: {
        if (term_56.descriptor() != _M_MODULES)
        {   break label_33;
        }Term sub_26 = term_56.sub(0).ref();
        if (sub_26.descriptor() != _M__sNil)
        {   break label_33;
        }/*Contract*/sink.properties(safeRef(props_16));
        sink.start(_M_CompileNextModule); sink.start(_M_OK); sink.end();
        sink.end(); return true;
      }
      label_99: {
        if (term_56.descriptor() != _M_MODULES)
        {   break label_99;
        }Term sub_51 = term_56.sub(0).ref();
        if (sub_51.descriptor() != _M__sCons)
        {   break label_99;
        }Term sub_64 = sub_51.sub(0).ref();
        /* #module=sub */Term sub_175 = sub_51.sub(1).ref();
        /* #modules=sub *//*Contract*/sink.properties(safeRef(props_16));Term term_199;
        {
          BufferSink buf_118 = sink.context().makeBuffer();
          buf_118.start(_M_MODULES); buf_118.copy(sub_175.ref());
          buf_118.end();
          term_199 = buf_118.term();
        } sink.propertyNamed("$notloaded", term_199);
        sink.start(_M_NormalizeModule); sink.copy(sub_64.ref());
        Variable var_39 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_39});
        sink.start(_M_NormalizeNextModule); sink.use(var_39);
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeNextModule1, props_16, term_56);
  } final public static boolean _M_NormalizeNextModule(Sink sink, int shared, int depth, Properties props_28, Term term_148) {
    if (depth < 2000) {
      label_38: {
        if (term_148.descriptor() != _M_OK)
        {   break label_38;
        }/*Contract*/sink.properties(safeRef(props_28));
        sink.start(_M_NormalizeNextModule1);
        sink.start(_M__s);sink.properties(safeRef(props_28));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.literal("$notloaded");
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeNextModule, props_28, term_148);
  } final public static boolean _M_Compile(Sink sink, int shared, int depth, Term term_225) {
    if (depth < 2000) {Term term_81;
      {
        BufferSink buf_32 = sink.context().makeBuffer();
        buf_32.start(_M_MODULES); buf_32.start(_M__sNil); buf_32.end();
        buf_32.end();
        term_81 = buf_32.term();
      } sink.propertyNamed("$modules", term_81);Term term_279;
      {
        BufferSink buf_60 = sink.context().makeBuffer();
        buf_60.start(_M_MODULES); buf_60.start(_M__sNil); buf_60.end();
        buf_60.end();
        term_279 = buf_60.term();
      } sink.propertyNamed("$notloaded", term_279);Term term_242;
      {
        BufferSink buf_1 = sink.context().makeBuffer();
        buf_1.start(_M_MODULES); buf_1.start(_M__sNil); buf_1.end();
        buf_1.end();
        term_242 = buf_1.term();
      } sink.propertyNamed("$normalized", term_242);
      sink.start(_M_AddModule); sink.copy(term_225.ref()); sink.start(_M_MAINMODULE); sink.end();
      Variable var_105 = sink.context().makeVariable("ok");
      sink.binds(new Variable[] {var_105});
      sink.start(_M_NormalizeNextModule); sink.use(var_105);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Compile, term_225);
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