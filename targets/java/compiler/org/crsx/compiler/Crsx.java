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
  final public static DynamicFunctionDescriptor _M_Compile = makeFunction("Compile", Crsx.class, "_M_Compile");final public static boolean _M_CompileSave(Sink sink, int shared, int depth, Properties props, Term term, Term term_98, Variable var, Term term_14) {
    if (depth < 2000) {
      label: {
        /* #filename=term */
        /* #code=term */
        /* #=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextChars); sink.literal("/* START MODULE ");
        sink.end();Term term_88;
        {
          BufferSink buf = sink.context().makeBuffer(); buf.start(_M_STRING); buf.literal(1); buf.end();
          term_88 = buf.term();
        } sink.propertyNamed("$LineLocation", term_88);Term term_31;
        {
          BufferSink buf_12 = sink.context().makeBuffer(); buf_12.start(_M_STRING); buf_12.literal(1); buf_12.end();
          term_31 = buf_12.term();
        } sink.propertyNamed("$ColumnLocation", term_31);
        sink.start(_M__sTextCons);Term term_64;
        {
          BufferSink buf_27 = sink.context().makeBuffer(); buf_27.start(_M_STRING); buf_27.literal(1); buf_27.end();
          term_64 = buf_27.term();
        } sink.propertyNamed("$LineLocation", term_64);Term term_96;
        {
          BufferSink buf_11 = sink.context().makeBuffer(); buf_11.start(_M_STRING); buf_11.literal(17); buf_11.end();
          term_96 = buf_11.term();
        } sink.propertyNamed("$ColumnLocation", term_96);
        sink.start(_M__sTextChars); sink.copy(term.ref());
        sink.end();Term term_63;
        {
          BufferSink buf_8 = sink.context().makeBuffer(); buf_8.start(_M_STRING); buf_8.literal(1); buf_8.end();
          term_63 = buf_8.term();
        } sink.propertyNamed("$LineLocation", term_63);Term term_86;
        {
          BufferSink buf_9 = sink.context().makeBuffer(); buf_9.start(_M_STRING); buf_9.literal(18); buf_9.end();
          term_86 = buf_9.term();
        } sink.propertyNamed("$ColumnLocation", term_86);
        sink.start(_M__sTextCons);Term term_54;
        {
          BufferSink buf_23 = sink.context().makeBuffer(); buf_23.start(_M_STRING); buf_23.literal(1); buf_23.end();
          term_54 = buf_23.term();
        } sink.propertyNamed("$LineLocation", term_54);Term term_37;
        {
          BufferSink buf_15 = sink.context().makeBuffer(); buf_15.start(_M_STRING); buf_15.literal(18); buf_15.end();
          term_37 = buf_15.term();
        } sink.propertyNamed("$ColumnLocation", term_37);
        sink.start(_M__sTextChars); sink.literal(" */");
        sink.end();Term term_15;
        {
          BufferSink buf_69 = sink.context().makeBuffer(); buf_69.start(_M_STRING); buf_69.literal(1); buf_69.end();
          term_15 = buf_69.term();
        } sink.propertyNamed("$LineLocation", term_15);Term term_40;
        {
          BufferSink buf_57 = sink.context().makeBuffer(); buf_57.start(_M_STRING); buf_57.literal(29); buf_57.end();
          term_40 = buf_57.term();
        } sink.propertyNamed("$ColumnLocation", term_40);
        sink.start(_M__sTextCons);Term term_93;
        {
          BufferSink buf_83 = sink.context().makeBuffer(); buf_83.start(_M_STRING); buf_83.literal(1); buf_83.end();
          term_93 = buf_83.term();
        } sink.propertyNamed("$LineLocation", term_93);Term term_167;
        {
          BufferSink buf_93 = sink.context().makeBuffer(); buf_93.start(_M_STRING); buf_93.literal(29); buf_93.end();
          term_167 = buf_93.term();
        } sink.propertyNamed("$ColumnLocation", term_167);
        sink.start(_M__sTextBreak); sink.literal("\n");
        sink.end();Term term_34;
        {
          BufferSink buf_89 = sink.context().makeBuffer(); buf_89.start(_M_STRING); buf_89.literal(1); buf_89.end();
          term_34 = buf_89.term();
        } sink.propertyNamed("$LineLocation", term_34);Term term_95;
        {
          BufferSink buf_49 = sink.context().makeBuffer(); buf_49.start(_M_STRING); buf_49.literal(32); buf_49.end();
          term_95 = buf_49.term();
        } sink.propertyNamed("$ColumnLocation", term_95);
        sink.start(_M__sTextCons);Term term_53;
        {
          BufferSink buf_32 = sink.context().makeBuffer(); buf_32.start(_M_STRING); buf_32.literal(1); buf_32.end();
          term_53 = buf_32.term();
        } sink.propertyNamed("$LineLocation", term_53);Term term_48;
        {
          BufferSink buf_3 = sink.context().makeBuffer(); buf_3.start(_M_STRING); buf_3.literal(32); buf_3.end();
          term_48 = buf_3.term();
        } sink.propertyNamed("$ColumnLocation", term_48);
        sink.start(_M__sTextEmbed);Term term_17;
        {
          BufferSink buf_10 = sink.context().makeBuffer(); buf_10.start(_M_STRING); buf_10.literal(1); buf_10.end();
          term_17 = buf_10.term();
        } sink.propertyNamed("$LineLocation", term_17);Term term_33;
        {
          BufferSink buf_37 = sink.context().makeBuffer(); buf_37.start(_M_STRING); buf_37.literal(32); buf_37.end();
          term_33 = buf_37.term();
        } sink.propertyNamed("$ColumnLocation", term_33);
        sink.start(_M_AsText); sink.copy(term_98.ref());
        sink.end();
        sink.end();Term term_87;
        {
          BufferSink buf_16 = sink.context().makeBuffer(); buf_16.start(_M_STRING); buf_16.literal(2); buf_16.end();
          term_87 = buf_16.term();
        } sink.propertyNamed("$LineLocation", term_87);Term term_41;
        {
          BufferSink buf_26 = sink.context().makeBuffer(); buf_26.start(_M_STRING); buf_26.literal(1); buf_26.end();
          term_41 = buf_26.term();
        } sink.propertyNamed("$ColumnLocation", term_41);
        sink.start(_M__sTextCons);Term term_29;
        {
          BufferSink buf_96 = sink.context().makeBuffer(); buf_96.start(_M_STRING); buf_96.literal(2); buf_96.end();
          term_29 = buf_96.term();
        } sink.propertyNamed("$LineLocation", term_29);Term term_8;
        {
          BufferSink buf_19 = sink.context().makeBuffer(); buf_19.start(_M_STRING); buf_19.literal(1); buf_19.end();
          term_8 = buf_19.term();
        } sink.propertyNamed("$ColumnLocation", term_8);
        sink.start(_M__sTextBreak); sink.literal("\n");
        sink.end();Term term_4;
        {
          BufferSink buf_44 = sink.context().makeBuffer(); buf_44.start(_M_STRING); buf_44.literal(2); buf_44.end();
          term_4 = buf_44.term();
        } sink.propertyNamed("$LineLocation", term_4);Term term_50;
        {
          BufferSink buf_82 = sink.context().makeBuffer(); buf_82.start(_M_STRING); buf_82.literal(8); buf_82.end();
          term_50 = buf_82.term();
        } sink.propertyNamed("$ColumnLocation", term_50);
        sink.start(_M__sTextCons);Term term_76;
        {
          BufferSink buf_24 = sink.context().makeBuffer(); buf_24.start(_M_STRING); buf_24.literal(2); buf_24.end();
          term_76 = buf_24.term();
        } sink.propertyNamed("$LineLocation", term_76);Term term_81;
        {
          BufferSink buf_98 = sink.context().makeBuffer(); buf_98.start(_M_STRING); buf_98.literal(8); buf_98.end();
          term_81 = buf_98.term();
        } sink.propertyNamed("$ColumnLocation", term_81);
        sink.start(_M__sTextChars); sink.literal("/* END MODULE ");
        sink.end();Term term_89;
        {
          BufferSink buf_62 = sink.context().makeBuffer(); buf_62.start(_M_STRING); buf_62.literal(3); buf_62.end();
          term_89 = buf_62.term();
        } sink.propertyNamed("$LineLocation", term_89);Term term_127;
        {
          BufferSink buf_0 = sink.context().makeBuffer(); buf_0.start(_M_STRING); buf_0.literal(1); buf_0.end();
          term_127 = buf_0.term();
        } sink.propertyNamed("$ColumnLocation", term_127);
        sink.start(_M__sTextCons);Term term_32;
        {
          BufferSink buf_81 = sink.context().makeBuffer(); buf_81.start(_M_STRING); buf_81.literal(3); buf_81.end();
          term_32 = buf_81.term();
        } sink.propertyNamed("$LineLocation", term_32);Term term_137;
        {
          BufferSink buf_50 = sink.context().makeBuffer(); buf_50.start(_M_STRING); buf_50.literal(1); buf_50.end();
          term_137 = buf_50.term();
        } sink.propertyNamed("$ColumnLocation", term_137);
        sink.start(_M__sTextEmbed);Term term_11;
        {
          BufferSink buf_139 = sink.context().makeBuffer(); buf_139.start(_M_STRING); buf_139.literal(3); buf_139.end();
          term_11 = buf_139.term();
        } sink.propertyNamed("$LineLocation", term_11);Term term_57;
        {
          BufferSink buf_40 = sink.context().makeBuffer(); buf_40.start(_M_STRING); buf_40.literal(1); buf_40.end();
          term_57 = buf_40.term();
        } sink.propertyNamed("$ColumnLocation", term_57);
        sink.start(_M_AsText); sink.copy(term.ref());
        sink.end();
        sink.end();Term term_7;
        {
          BufferSink buf_73 = sink.context().makeBuffer(); buf_73.start(_M_STRING); buf_73.literal(3); buf_73.end();
          term_7 = buf_73.term();
        } sink.propertyNamed("$LineLocation", term_7);Term term_36;
        {
          BufferSink buf_21 = sink.context().makeBuffer(); buf_21.start(_M_STRING); buf_21.literal(15); buf_21.end();
          term_36 = buf_21.term();
        } sink.propertyNamed("$ColumnLocation", term_36);
        sink.start(_M__sTextCons);Term term_67;
        {
          BufferSink buf_116 = sink.context().makeBuffer(); buf_116.start(_M_STRING); buf_116.literal(3); buf_116.end();
          term_67 = buf_116.term();
        } sink.propertyNamed("$LineLocation", term_67);Term term_191;
        {
          BufferSink buf_28 = sink.context().makeBuffer(); buf_28.start(_M_STRING); buf_28.literal(15); buf_28.end();
          term_191 = buf_28.term();
        } sink.propertyNamed("$ColumnLocation", term_191);
        sink.start(_M__sTextChars); sink.literal(" */");
        sink.end();Term term_0;
        {
          BufferSink buf_61 = sink.context().makeBuffer(); buf_61.start(_M_STRING); buf_61.literal(3); buf_61.end();
          term_0 = buf_61.term();
        } sink.propertyNamed("$LineLocation", term_0);Term term_80;
        {
          BufferSink buf_111 = sink.context().makeBuffer();
          buf_111.start(_M_STRING); buf_111.literal(26);
          buf_111.end();
          term_80 = buf_111.term();
        } sink.propertyNamed("$ColumnLocation", term_80);
        sink.start(_M__sTextCons);Term term_145;
        {
          BufferSink buf_55 = sink.context().makeBuffer(); buf_55.start(_M_STRING); buf_55.literal(3); buf_55.end();
          term_145 = buf_55.term();
        } sink.propertyNamed("$LineLocation", term_145);Term term_68;
        {
          BufferSink buf_133 = sink.context().makeBuffer();
          buf_133.start(_M_STRING); buf_133.literal(26);
          buf_133.end();
          term_68 = buf_133.term();
        } sink.propertyNamed("$ColumnLocation", term_68);
        sink.start(_M__sTextBreak); sink.literal("\n");
        sink.end();Term term_42;
        {
          BufferSink buf_42 = sink.context().makeBuffer(); buf_42.start(_M_STRING); buf_42.literal(3); buf_42.end();
          term_42 = buf_42.term();
        } sink.propertyNamed("$LineLocation", term_42);Term term_163;
        {
          BufferSink buf_30 = sink.context().makeBuffer(); buf_30.start(_M_STRING); buf_30.literal(29); buf_30.end();
          term_163 = buf_30.term();
        } sink.propertyNamed("$ColumnLocation", term_163);
        sink.start(_M__sTextCons);Term term_13;
        {
          BufferSink buf_94 = sink.context().makeBuffer(); buf_94.start(_M_STRING); buf_94.literal(3); buf_94.end();
          term_13 = buf_94.term();
        } sink.propertyNamed("$LineLocation", term_13);Term term_85;
        {
          BufferSink buf_74 = sink.context().makeBuffer(); buf_74.start(_M_STRING); buf_74.literal(29); buf_74.end();
          term_85 = buf_74.term();
        } sink.propertyNamed("$ColumnLocation", term_85);
        sink.start(_M__sTextEmbed);Term term_91;
        {
          BufferSink buf_6 = sink.context().makeBuffer(); buf_6.start(_M_STRING); buf_6.literal(3); buf_6.end();
          term_91 = buf_6.term();
        } sink.propertyNamed("$LineLocation", term_91);Term term_77;
        {
          BufferSink buf_136 = sink.context().makeBuffer();
          buf_136.start(_M_STRING); buf_136.literal(29);
          buf_136.end();
          term_77 = buf_136.term();
        } sink.propertyNamed("$ColumnLocation", term_77);
        sink.start(_M_AsText);sink.properties(safeRef(props));Term term_16;
        {
          BufferSink buf_60 = sink.context().makeBuffer(); buf_60.start(_M_OK); buf_60.end();
          term_16 = buf_60.term();
        }
        sink.substitute(term_14.ref(), new Variable[] { var }, new Term[] {term_16});
        sink.end();
        sink.end();Term term_120;
        {
          BufferSink buf_2 = sink.context().makeBuffer(); buf_2.start(_M_STRING); buf_2.literal(4); buf_2.end();
          term_120 = buf_2.term();
        } sink.propertyNamed("$LineLocation", term_120);Term term_9;
        {
          BufferSink buf_53 = sink.context().makeBuffer(); buf_53.start(_M_STRING); buf_53.literal(1); buf_53.end();
          term_9 = buf_53.term();
        } sink.propertyNamed("$ColumnLocation", term_9);
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
    return thunk(sink, _M_CompileSave, props, term, term_98, var, term_14);
  }    final public static boolean _M_CompileNormalized(Sink sink, int shared, int depth, Properties props_90, Term term_161, Variable var_57, Term term_10) {
    if (depth < 2000) {
      label_99: {
        if (term_161.descriptor() != _M_MODULE)
        {   break label_99;
        }Term sub = term_161.sub(0).ref();
        /* #filename=sub */Term sub_71 = term_161.sub(1).ref();
        /* #mode=sub */Term sub_26 = term_161.sub(2).ref();
        if (sub_26.descriptor() != _M_LOADED)
        {   break label_99;
        }
        Properties props_65 = safeRef(sub_26.properties());
        /* #=term *//*Contract*/sink.properties(safeRef(props_90));
        sink.start(_M_CompileSave);
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.copy(sub.ref()); sink.literal(".java");
        sink.end();
        sink.start(_M_GenerateJavaParsed); sink.copy(sub.ref());sink.properties(safeRef(props_65));
        sink.start(_M_OutputCrsx); sink.start(_M_OK); sink.end();
        sink.end(); sink.copy(sub_71.ref());
        sink.end();
        Variable var_45 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_45});
        VariableUse use = sink.context().makeVariableUse(var_45);
        sink.substitute(term_10.ref(), new Variable[] { var_57 }, new Term[] {use});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_CompileNormalized, props_90, term_161, var_57, term_10);
  }   final public static boolean _M_CompileModule(Sink sink, int shared, int depth, Properties props_93, Term term_149, Variable var_24, Term term_52) {
    if (depth < 2000) {
      label_87: {
        /* #key=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_93));
        sink.start(_M_CompileNormalized);
        sink.start(_M__s);sink.properties(safeRef(props_93));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_149.ref());
        sink.end();
        Variable var_40 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_40});
        VariableUse use_86 = sink.context().makeVariableUse(var_40);
        sink.substitute(term_52.ref(), new Variable[] { var_24 }, new Term[] {use_86});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_CompileModule, props_93, term_149, var_24, term_52);
  }   final public static boolean _M_CompileNextModule1(Sink sink, int shared, int depth, Properties props_30, Term term_18) {
    if (depth < 2000) {
      label_32: {
        if (term_18.descriptor() != _M_MODULES)
        {   break label_32;
        }Term sub_28 = term_18.sub(0).ref();
        if (sub_28.descriptor() != _M__sNil)
        {   break label_32;
        }/*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal("}"); sink.end();Term term_152;
        {
          BufferSink buf_7 = sink.context().makeBuffer(); buf_7.start(_M_STRING); buf_7.literal(1); buf_7.end();
          term_152 = buf_7.term();
        } sink.propertyNamed("$LineLocation", term_152);Term term_22;
        {
          BufferSink buf_72 = sink.context().makeBuffer(); buf_72.start(_M_STRING); buf_72.literal(1); buf_72.end();
          term_22 = buf_72.term();
        } sink.propertyNamed("$ColumnLocation", term_22);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); return true;
      }
      label_75: {
        if (term_18.descriptor() != _M_MODULES)
        {   break label_75;
        }Term sub_96 = term_18.sub(0).ref();
        if (sub_96.descriptor() != _M__sCons)
        {   break label_75;
        }Term sub_86 = sub_96.sub(0).ref();
        /* #module=sub */Term sub_44 = sub_96.sub(1).ref();
        /* #modules=sub *//*Contract*/sink.properties(safeRef(props_30));Term term_71;
        {
          BufferSink buf_67 = sink.context().makeBuffer();
          buf_67.start(_M_MODULES); buf_67.copy(sub_44.ref());
          buf_67.end();
          term_71 = buf_67.term();
        } sink.propertyNamed("$modules", term_71);
        sink.start(_M_CompileModule); sink.copy(sub_86.ref());
        Variable var_93 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_93});
        sink.start(_M_CompileNextModule); sink.use(var_93);
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_CompileNextModule1, props_30, term_18);
  } final public static boolean _M_CompileNextModule(Sink sink, int shared, int depth, Properties props_78, Term term_24) {
    if (depth < 2000) {
      label_3: {
        if (term_24.descriptor() != _M_OK)
        {   break label_3;
        }/*Contract*/sink.properties(safeRef(props_78));
        sink.start(_M_CompileNextModule1);
        sink.start(_M__s);sink.properties(safeRef(props_78));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.literal("$modules");
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_CompileNextModule, props_78, term_24);
  } final public static boolean _M_AddImport(Sink sink, int shared, int depth, Properties props_2, Term term_196, Term term_26) {
    if (depth < 2000) {
      label_89: {
        /* #filename=term */
        if (term_26.descriptor() != _M_CONTINUATION)
        {   break label_89;
        }Term sub_29 = term_26.sub(0).ref();
        Variable binder = term_26.binders(0)[0];
        /* #=sub *//*Contract*/sink.properties(safeRef(props_2));Term term_61;
        {
          BufferSink buf_75 = sink.context().makeBuffer(); buf_75.start(_M_OK); buf_75.end();
          term_61 = buf_75.term();
        }
        sink.substitute(sub_29.ref(), new Variable[] { binder }, new Term[] {term_61}); return true; 
      }
    }
    return thunk(sink, _M_AddImport, props_2, term_196, term_26);
  }  final public static boolean _M_NormalizeDone1(Sink sink, int shared, int depth, Properties props_23, Term term_73, Term term_65, Term term_180, Term term_59, Term term_56, Term term_28, Term term_69, Variable var_61, Term term_199) {
    if (depth < 2000) {
      label_38: {
        if (term_73.descriptor() != _M_MODULES)
        {   break label_38;
        }Term sub_24 = term_73.sub(0).ref();
        /* #normalized=sub */
        if (term_65.descriptor() != _M_MODULES)
        {   break label_38;
        }Term sub_43 = term_65.sub(0).ref();
        /* #modules=sub */
        if (term_180.descriptor() != _M_IMPORTS)
        {   break label_38;
        }Term sub_35 = term_180.sub(0).ref();
        /* #imports=sub */
        /* #key=term */
        /* #filename=term */
        /* #mode=term */
        /* #content=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_23));Term term_115;
        {
          BufferSink buf_43 = sink.context().makeBuffer();
          buf_43.start(_M_MODULES);
          buf_43.start(_M_Concat); buf_43.copy(sub_24.ref());
          buf_43.start(_M__sCons); buf_43.copy(term_56.ref()); buf_43.start(_M__sNil); buf_43.end();
          buf_43.end();
          buf_43.end();
          buf_43.end();
          term_115 = buf_43.term();
        } sink.propertyNamed("$normalized", term_115);Term term_84;
        {
          BufferSink buf_120 = sink.context().makeBuffer();
          buf_120.start(_M_MODULE); buf_120.copy(term_56.ref()); buf_120.copy(term_28.ref()); buf_120.copy(term_69.ref());
          buf_120.end();
          term_84 = buf_120.term();
        }
        term_59 = force(sink.context(), term_59);
        Sink.property(sink, term_59, term_84);
        sink.start(_M_SeqMap);
        Variable var_11 = sink.context().makeVariable("name");
        Variable var_60 = sink.context().makeVariable("cont");
        sink.binds(new Variable[] {var_11,var_60});
        sink.start(_M_AddImport); sink.use(var_11); sink.use(var_60);
        sink.end(); sink.copy(sub_35.ref());
        Variable var_32 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_32});
        VariableUse use_27 = sink.context().makeVariableUse(var_32);
        sink.substitute(term_199.ref(), new Variable[] { var_61 }, new Term[] {use_27});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeDone1, props_23, term_73, term_65, term_180, term_59, term_56, term_28, term_69, var_61, term_199);
  }         final public static boolean _M_NormalizeDone(Sink sink, int shared, int depth, Properties props_104, Term term_201, Term term_66, Term term_35, Term term_209, Variable var_77, Term term_251) {
    if (depth < 2000) {
      label_72: {
        /* #key=term */
        /* #filename=term */
        /* #mode=term */
        if (term_209.descriptor() != _M_LOADED)
        {   break label_72;
        }
        Properties props_8 = safeRef(term_209.properties());
        /* #=term *//*Contract*/sink.properties(safeRef(props_104));
        sink.start(_M_NormalizeDone1);
        sink.start(_M__s);sink.properties(safeRef(props_104));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.literal("$normalized");
        sink.end();
        sink.start(_M__s);sink.properties(safeRef(props_104));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.literal("$modules");
        sink.end();
        sink.start(_M__s);sink.properties(safeRef(props_8));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.literal("$imported");
        sink.end(); sink.copy(term_201.ref()); sink.copy(term_66.ref()); sink.copy(term_35.ref());sink.properties(safeRef(props_8));
        sink.start(_M_LOADED);
        sink.end();
        Variable var_54 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_54});
        VariableUse use_50 = sink.context().makeVariableUse(var_54);
        sink.substitute(term_251.ref(), new Variable[] { var_77 }, new Term[] {use_50});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeDone, props_104, term_201, term_66, term_35, term_209, var_77, term_251);
  }      final public static boolean _M_NormalizeParsed(Sink sink, int shared, int depth, Properties props_83, Term term_39, Term term_128, Term term_5, Term term_19, Variable var_70, Term term_78) {
    if (depth < 2000) {
      label_28: {
        /* #key=term */
        /* #filename=term */
        /* #mode=term */
        /* #crsx=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_83));
        sink.start(_M_NormalizeDone); sink.copy(term_39.ref()); sink.copy(term_128.ref()); sink.copy(term_5.ref());
        sink.start(_M_NormalizeToState); sink.copy(term_128.ref()); sink.copy(term_19.ref());
        sink.end();
        Variable var_8 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_8});
        VariableUse use_5 = sink.context().makeVariableUse(var_8);
        sink.substitute(term_78.ref(), new Variable[] { var_70 }, new Term[] {use_5});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeParsed, props_83, term_39, term_128, term_5, term_19, var_70, term_78);
  }      final public static boolean _M_NormalizeModuleLoad(Sink sink, int shared, int depth, Properties props_3, Term term_113, Variable var_29, Term term_165) {
    if (depth < 2000) {
      label_61: {
        if (term_113.descriptor() != _M_MODULE)
        {   break label_61;
        }Term sub_31 = term_113.sub(0).ref();
        /* #filename=sub */Term sub_92 = term_113.sub(1).ref();
        /* #mode=sub */Term sub_81 = term_113.sub(2).ref();
        if (sub_81.descriptor() != _M_NOTLOADED)
        {   break label_61;
        }
        /* #=term *//*Contract*/sink.properties(safeRef(props_3));
        sink.start(_M_NormalizeParsed); sink.start(_M_ModuleKey); sink.copy(sub_31.ref()); sink.end(); sink.copy(sub_31.ref()); sink.copy(sub_92.ref());
        sink.start(_M__s); sink.start(_M_Builtin_sParseResource); sink.end(); sink.literal("crsx"); sink.copy(sub_31.ref());
        sink.end();
        Variable var_53 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_53});
        VariableUse use_72 = sink.context().makeVariableUse(var_53);
        sink.substitute(term_165.ref(), new Variable[] { var_29 }, new Term[] {use_72});
        sink.end(); return true;
      }
      label_68: {
        if (term_113.descriptor() != _M_MODULE)
        {   break label_68;
        }Term sub_33 = term_113.sub(0).ref();
        /* #filename=sub */Term sub_19 = term_113.sub(1).ref();
        /* #mode=sub */Term sub_25 = term_113.sub(2).ref();
        if (sub_25.descriptor() != _M_LOADED)
        {   break label_68;
        }
        Properties props_84 = safeRef(sub_25.properties());
        /* #=term *//*Contract*/sink.properties(safeRef(props_3));Term term_181;
        {
          BufferSink buf_77 = sink.context().makeBuffer(); buf_77.start(_M_OK); buf_77.end();
          term_181 = buf_77.term();
        }
        sink.substitute(term_165.ref(), new Variable[] { var_29 }, new Term[] {term_181}); return true;
      }
    }
    return thunk(sink, _M_NormalizeModuleLoad, props_3, term_113, var_29, term_165);
  }   final public static boolean _M_NormalizeModule(Sink sink, int shared, int depth, Properties props_59, Term term_178, Variable var_85, Term term_146) {
    if (depth < 2000) {
      label_183: {
        /* #key=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_59));
        sink.start(_M_NormalizeModuleLoad);
        sink.start(_M__s);sink.properties(safeRef(props_59));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_178.ref());
        sink.end();
        Variable var_86 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_86});
        VariableUse use_55 = sink.context().makeVariableUse(var_86);
        sink.substitute(term_146.ref(), new Variable[] { var_85 }, new Term[] {use_55});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeModule, props_59, term_178, var_85, term_146);
  }   final public static boolean _M_NormalizeNextModule1(Sink sink, int shared, int depth, Properties props_68, Term term_20) {
    if (depth < 2000) {
      label_53: {
        if (term_20.descriptor() != _M_MODULES)
        {   break label_53;
        }Term sub_91 = term_20.sub(0).ref();
        if (sub_91.descriptor() != _M__sNil)
        {   break label_53;
        }/*Contract*/sink.properties(safeRef(props_68));
        sink.start(_M_CompileNextModule); sink.start(_M_OK); sink.end();
        sink.end(); return true;
      }
      label_65: {
        if (term_20.descriptor() != _M_MODULES)
        {   break label_65;
        }Term sub_45 = term_20.sub(0).ref();
        if (sub_45.descriptor() != _M__sCons)
        {   break label_65;
        }Term sub_41 = sub_45.sub(0).ref();
        /* #module=sub */Term sub_12 = sub_45.sub(1).ref();
        /* #modules=sub *//*Contract*/sink.properties(safeRef(props_68));Term term_82;
        {
          BufferSink buf_105 = sink.context().makeBuffer();
          buf_105.start(_M_MODULES); buf_105.copy(sub_12.ref());
          buf_105.end();
          term_82 = buf_105.term();
        } sink.propertyNamed("$notloaded", term_82);
        sink.start(_M_NormalizeModule); sink.copy(sub_41.ref());
        Variable var_126 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_126});
        sink.start(_M_NormalizeNextModule); sink.use(var_126);
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeNextModule1, props_68, term_20);
  } final public static boolean _M_NormalizeNextModule(Sink sink, int shared, int depth, Properties props_57, Term term_25) {
    if (depth < 2000) {
      label_45: {
        if (term_25.descriptor() != _M_OK)
        {   break label_45;
        }/*Contract*/sink.properties(safeRef(props_57));
        sink.start(_M_NormalizeNextModule1);
        sink.start(_M__s);sink.properties(safeRef(props_57));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.literal("$notloaded");
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeNextModule, props_57, term_25);
  } final public static boolean _M_Compile(Sink sink, int shared, int depth, Term term_124) {
    if (depth < 2000) {Term term_197;
      {
        BufferSink buf_118 = sink.context().makeBuffer();
        buf_118.start(_M_MODULES); buf_118.start(_M__sNil); buf_118.end();
        buf_118.end();
        term_197 = buf_118.term();
      } sink.propertyNamed("$modules", term_197);Term term_70;
      {
        BufferSink buf_95 = sink.context().makeBuffer();
        buf_95.start(_M_MODULES); buf_95.start(_M__sNil); buf_95.end();
        buf_95.end();
        term_70 = buf_95.term();
      } sink.propertyNamed("$notloaded", term_70);Term term_143;
      {
        BufferSink buf_1 = sink.context().makeBuffer();
        buf_1.start(_M_MODULES); buf_1.start(_M__sNil); buf_1.end();
        buf_1.end();
        term_143 = buf_1.term();
      } sink.propertyNamed("$normalized", term_143);
      sink.start(_M_AddModule); sink.copy(term_124.ref()); sink.start(_M_MAINMODULE); sink.end();
      Variable var_26 = sink.context().makeVariable("ok");
      sink.binds(new Variable[] {var_26});
      sink.start(_M_NormalizeNextModule); sink.use(var_26);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Compile, term_124);
  } 
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.State.init(context); org.crsx.compiler.Normalizer.init(context); org.crsx.compiler.cg.Cgjava.init(context); org.crsx.compiler.std.Core.init(context); org.crsx.compiler.std.List.init(context); org.crsx.compiler.std.Text.init(context); context.registerParser("org.crsx.parser.CrsxMetaParser"); context.register(_M_CompileSave); context.register(_M_CompileNormalized); context.register(_M_CompileModule); context.register(_M_CompileNextModule1); context.register(_M_CompileNextModule); context.register(_M_AddImport); context.register(_M_NormalizeDone1); context.register(_M_NormalizeDone); context.register(_M_NormalizeParsed); context.register(_M_NormalizeModuleLoad); context.register(_M_NormalizeModule); context.register(_M_NormalizeNextModule1); context.register(_M_NormalizeNextModule); context.register(_M_Compile);
      initialized = true;
    }
  }

/* END MODULE « "/Users/villardl/Projects/crsx/crsx4/src/crsx.crs.java" » */
}