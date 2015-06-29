/* START MODULE crsx.crs.java */
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
  final public static DynamicFunctionDescriptor _M_Compile = makeFunction("Compile", Crsx.class, "_M_Compile");final public static boolean _M_CompileSave(Sink sink, int shared, int depth, Properties props, Term term, Term term_72, Variable var, Term term_7) {
    if (depth < 2000) {
      label: {
        /* #filename=term */
        /* #code=term */
        /* #=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextChars); sink.literal("/* START MODULE ");
        sink.end();Term term_41;
        {
          BufferSink buf = sink.context().makeBuffer(); buf.start(_M_STRING); buf.literal(1); buf.end();
          term_41 = buf.term();
        } sink.propertyNamed("$LineLocation", term_41);Term term_47;
        {
          BufferSink buf_78 = sink.context().makeBuffer(); buf_78.start(_M_STRING); buf_78.literal(1); buf_78.end();
          term_47 = buf_78.term();
        } sink.propertyNamed("$ColumnLocation", term_47);
        sink.start(_M__sTextCons);Term term_57;
        {
          BufferSink buf_90 = sink.context().makeBuffer(); buf_90.start(_M_STRING); buf_90.literal(1); buf_90.end();
          term_57 = buf_90.term();
        } sink.propertyNamed("$LineLocation", term_57);Term term_16;
        {
          BufferSink buf_51 = sink.context().makeBuffer(); buf_51.start(_M_STRING); buf_51.literal(17); buf_51.end();
          term_16 = buf_51.term();
        } sink.propertyNamed("$ColumnLocation", term_16);
        sink.start(_M__sTextChars); sink.copy(term.ref());
        sink.end();Term term_65;
        {
          BufferSink buf_2 = sink.context().makeBuffer(); buf_2.start(_M_STRING); buf_2.literal(1); buf_2.end();
          term_65 = buf_2.term();
        } sink.propertyNamed("$LineLocation", term_65);Term term_2;
        {
          BufferSink buf_47 = sink.context().makeBuffer(); buf_47.start(_M_STRING); buf_47.literal(18); buf_47.end();
          term_2 = buf_47.term();
        } sink.propertyNamed("$ColumnLocation", term_2);
        sink.start(_M__sTextCons);Term term_96;
        {
          BufferSink buf_41 = sink.context().makeBuffer(); buf_41.start(_M_STRING); buf_41.literal(1); buf_41.end();
          term_96 = buf_41.term();
        } sink.propertyNamed("$LineLocation", term_96);Term term_23;
        {
          BufferSink buf_127 = sink.context().makeBuffer();
          buf_127.start(_M_STRING); buf_127.literal(18);
          buf_127.end();
          term_23 = buf_127.term();
        } sink.propertyNamed("$ColumnLocation", term_23);
        sink.start(_M__sTextChars); sink.literal(" */");
        sink.end();Term term_6;
        {
          BufferSink buf_48 = sink.context().makeBuffer(); buf_48.start(_M_STRING); buf_48.literal(1); buf_48.end();
          term_6 = buf_48.term();
        } sink.propertyNamed("$LineLocation", term_6);Term term_87;
        {
          BufferSink buf_80 = sink.context().makeBuffer(); buf_80.start(_M_STRING); buf_80.literal(29); buf_80.end();
          term_87 = buf_80.term();
        } sink.propertyNamed("$ColumnLocation", term_87);
        sink.start(_M__sTextCons);Term term_29;
        {
          BufferSink buf_155 = sink.context().makeBuffer(); buf_155.start(_M_STRING); buf_155.literal(1); buf_155.end();
          term_29 = buf_155.term();
        } sink.propertyNamed("$LineLocation", term_29);Term term_91;
        {
          BufferSink buf_14 = sink.context().makeBuffer(); buf_14.start(_M_STRING); buf_14.literal(29); buf_14.end();
          term_91 = buf_14.term();
        } sink.propertyNamed("$ColumnLocation", term_91);
        sink.start(_M__sTextBreak); sink.literal("\n");
        sink.end();Term term_8;
        {
          BufferSink buf_5 = sink.context().makeBuffer(); buf_5.start(_M_STRING); buf_5.literal(1); buf_5.end();
          term_8 = buf_5.term();
        } sink.propertyNamed("$LineLocation", term_8);Term term_19;
        {
          BufferSink buf_55 = sink.context().makeBuffer(); buf_55.start(_M_STRING); buf_55.literal(32); buf_55.end();
          term_19 = buf_55.term();
        } sink.propertyNamed("$ColumnLocation", term_19);
        sink.start(_M__sTextCons);Term term_152;
        {
          BufferSink buf_54 = sink.context().makeBuffer(); buf_54.start(_M_STRING); buf_54.literal(1); buf_54.end();
          term_152 = buf_54.term();
        } sink.propertyNamed("$LineLocation", term_152);Term term_14;
        {
          BufferSink buf_49 = sink.context().makeBuffer(); buf_49.start(_M_STRING); buf_49.literal(32); buf_49.end();
          term_14 = buf_49.term();
        } sink.propertyNamed("$ColumnLocation", term_14);
        sink.start(_M__sTextEmbed);Term term_148;
        {
          BufferSink buf_56 = sink.context().makeBuffer(); buf_56.start(_M_STRING); buf_56.literal(1); buf_56.end();
          term_148 = buf_56.term();
        } sink.propertyNamed("$LineLocation", term_148);Term term_27;
        {
          BufferSink buf_28 = sink.context().makeBuffer(); buf_28.start(_M_STRING); buf_28.literal(32); buf_28.end();
          term_27 = buf_28.term();
        } sink.propertyNamed("$ColumnLocation", term_27);
        sink.start(_M_AsText); sink.copy(term_72.ref());
        sink.end();
        sink.end();Term term_15;
        {
          BufferSink buf_11 = sink.context().makeBuffer(); buf_11.start(_M_STRING); buf_11.literal(2); buf_11.end();
          term_15 = buf_11.term();
        } sink.propertyNamed("$LineLocation", term_15);Term term_46;
        {
          BufferSink buf_60 = sink.context().makeBuffer(); buf_60.start(_M_STRING); buf_60.literal(1); buf_60.end();
          term_46 = buf_60.term();
        } sink.propertyNamed("$ColumnLocation", term_46);
        sink.start(_M__sTextCons);Term term_85;
        {
          BufferSink buf_156 = sink.context().makeBuffer(); buf_156.start(_M_STRING); buf_156.literal(2); buf_156.end();
          term_85 = buf_156.term();
        } sink.propertyNamed("$LineLocation", term_85);Term term_98;
        {
          BufferSink buf_76 = sink.context().makeBuffer(); buf_76.start(_M_STRING); buf_76.literal(1); buf_76.end();
          term_98 = buf_76.term();
        } sink.propertyNamed("$ColumnLocation", term_98);
        sink.start(_M__sTextBreak); sink.literal("\n");
        sink.end();Term term_70;
        {
          BufferSink buf_9 = sink.context().makeBuffer(); buf_9.start(_M_STRING); buf_9.literal(2); buf_9.end();
          term_70 = buf_9.term();
        } sink.propertyNamed("$LineLocation", term_70);Term term_52;
        {
          BufferSink buf_39 = sink.context().makeBuffer(); buf_39.start(_M_STRING); buf_39.literal(8); buf_39.end();
          term_52 = buf_39.term();
        } sink.propertyNamed("$ColumnLocation", term_52);
        sink.start(_M__sTextCons);Term term_121;
        {
          BufferSink buf_150 = sink.context().makeBuffer(); buf_150.start(_M_STRING); buf_150.literal(2); buf_150.end();
          term_121 = buf_150.term();
        } sink.propertyNamed("$LineLocation", term_121);Term term_90;
        {
          BufferSink buf_77 = sink.context().makeBuffer(); buf_77.start(_M_STRING); buf_77.literal(8); buf_77.end();
          term_90 = buf_77.term();
        } sink.propertyNamed("$ColumnLocation", term_90);
        sink.start(_M__sTextChars); sink.literal("/* END MODULE ");
        sink.end();Term term_82;
        {
          BufferSink buf_18 = sink.context().makeBuffer(); buf_18.start(_M_STRING); buf_18.literal(3); buf_18.end();
          term_82 = buf_18.term();
        } sink.propertyNamed("$LineLocation", term_82);Term term_12;
        {
          BufferSink buf_53 = sink.context().makeBuffer(); buf_53.start(_M_STRING); buf_53.literal(1); buf_53.end();
          term_12 = buf_53.term();
        } sink.propertyNamed("$ColumnLocation", term_12);
        sink.start(_M__sTextCons);Term term_13;
        {
          BufferSink buf_21 = sink.context().makeBuffer(); buf_21.start(_M_STRING); buf_21.literal(3); buf_21.end();
          term_13 = buf_21.term();
        } sink.propertyNamed("$LineLocation", term_13);Term term_11;
        {
          BufferSink buf_62 = sink.context().makeBuffer(); buf_62.start(_M_STRING); buf_62.literal(1); buf_62.end();
          term_11 = buf_62.term();
        } sink.propertyNamed("$ColumnLocation", term_11);
        sink.start(_M__sTextEmbed);Term term_50;
        {
          BufferSink buf_87 = sink.context().makeBuffer(); buf_87.start(_M_STRING); buf_87.literal(3); buf_87.end();
          term_50 = buf_87.term();
        } sink.propertyNamed("$LineLocation", term_50);Term term_127;
        {
          BufferSink buf_129 = sink.context().makeBuffer(); buf_129.start(_M_STRING); buf_129.literal(1); buf_129.end();
          term_127 = buf_129.term();
        } sink.propertyNamed("$ColumnLocation", term_127);
        sink.start(_M_AsText); sink.copy(term.ref());
        sink.end();
        sink.end();Term term_25;
        {
          BufferSink buf_42 = sink.context().makeBuffer(); buf_42.start(_M_STRING); buf_42.literal(3); buf_42.end();
          term_25 = buf_42.term();
        } sink.propertyNamed("$LineLocation", term_25);Term term_138;
        {
          BufferSink buf_3 = sink.context().makeBuffer(); buf_3.start(_M_STRING); buf_3.literal(15); buf_3.end();
          term_138 = buf_3.term();
        } sink.propertyNamed("$ColumnLocation", term_138);
        sink.start(_M__sTextCons);Term term_54;
        {
          BufferSink buf_12 = sink.context().makeBuffer(); buf_12.start(_M_STRING); buf_12.literal(3); buf_12.end();
          term_54 = buf_12.term();
        } sink.propertyNamed("$LineLocation", term_54);Term term_97;
        {
          BufferSink buf_7 = sink.context().makeBuffer(); buf_7.start(_M_STRING); buf_7.literal(15); buf_7.end();
          term_97 = buf_7.term();
        } sink.propertyNamed("$ColumnLocation", term_97);
        sink.start(_M__sTextChars); sink.literal(" */");
        sink.end();Term term_77;
        {
          BufferSink buf_8 = sink.context().makeBuffer(); buf_8.start(_M_STRING); buf_8.literal(3); buf_8.end();
          term_77 = buf_8.term();
        } sink.propertyNamed("$LineLocation", term_77);Term term_48;
        {
          BufferSink buf_114 = sink.context().makeBuffer();
          buf_114.start(_M_STRING); buf_114.literal(26);
          buf_114.end();
          term_48 = buf_114.term();
        } sink.propertyNamed("$ColumnLocation", term_48);
        sink.start(_M__sTextCons);Term term_197;
        {
          BufferSink buf_154 = sink.context().makeBuffer(); buf_154.start(_M_STRING); buf_154.literal(3); buf_154.end();
          term_197 = buf_154.term();
        } sink.propertyNamed("$LineLocation", term_197);Term term_35;
        {
          BufferSink buf_43 = sink.context().makeBuffer(); buf_43.start(_M_STRING); buf_43.literal(26); buf_43.end();
          term_35 = buf_43.term();
        } sink.propertyNamed("$ColumnLocation", term_35);
        sink.start(_M__sTextBreak); sink.literal("\n");
        sink.end();Term term_84;
        {
          BufferSink buf_13 = sink.context().makeBuffer(); buf_13.start(_M_STRING); buf_13.literal(3); buf_13.end();
          term_84 = buf_13.term();
        } sink.propertyNamed("$LineLocation", term_84);Term term_18;
        {
          BufferSink buf_1 = sink.context().makeBuffer(); buf_1.start(_M_STRING); buf_1.literal(29); buf_1.end();
          term_18 = buf_1.term();
        } sink.propertyNamed("$ColumnLocation", term_18);
        sink.start(_M__sTextCons);Term term_64;
        {
          BufferSink buf_81 = sink.context().makeBuffer(); buf_81.start(_M_STRING); buf_81.literal(3); buf_81.end();
          term_64 = buf_81.term();
        } sink.propertyNamed("$LineLocation", term_64);Term term_22;
        {
          BufferSink buf_79 = sink.context().makeBuffer(); buf_79.start(_M_STRING); buf_79.literal(29); buf_79.end();
          term_22 = buf_79.term();
        } sink.propertyNamed("$ColumnLocation", term_22);
        sink.start(_M__sTextEmbed);Term term_95;
        {
          BufferSink buf_58 = sink.context().makeBuffer(); buf_58.start(_M_STRING); buf_58.literal(3); buf_58.end();
          term_95 = buf_58.term();
        } sink.propertyNamed("$LineLocation", term_95);Term term_116;
        {
          BufferSink buf_10 = sink.context().makeBuffer(); buf_10.start(_M_STRING); buf_10.literal(29); buf_10.end();
          term_116 = buf_10.term();
        } sink.propertyNamed("$ColumnLocation", term_116);
        sink.start(_M_AsText);sink.properties(safeRef(props));Term term_162;
        {
          BufferSink buf_20 = sink.context().makeBuffer(); buf_20.start(_M_OK); buf_20.end();
          term_162 = buf_20.term();
        }
        sink.substitute(term_7.ref(), new Variable[] { var }, new Term[] {term_162});
        sink.end();
        sink.end();Term term_74;
        {
          BufferSink buf_46 = sink.context().makeBuffer(); buf_46.start(_M_STRING); buf_46.literal(4); buf_46.end();
          term_74 = buf_46.term();
        } sink.propertyNamed("$LineLocation", term_74);Term term_31;
        {
          BufferSink buf_285 = sink.context().makeBuffer(); buf_285.start(_M_STRING); buf_285.literal(1); buf_285.end();
          term_31 = buf_285.term();
        } sink.propertyNamed("$ColumnLocation", term_31);
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
    return thunk(sink, _M_CompileSave, props, term, term_72, var, term_7);
  }    final public static boolean _M_CompileNormalized(Sink sink, int shared, int depth, Properties props_11, Term term_182, Variable var_54, Term term_44) {
    if (depth < 2000) {
      label_37: {
        if (term_182.descriptor() != _M_MODULE)
        {   break label_37;
        }Term sub = term_182.sub(0).ref();
        /* #filename=sub */Term sub_8 = term_182.sub(1).ref();
        /* #mode=sub */Term sub_79 = term_182.sub(2).ref();
        if (sub_79.descriptor() != _M_LOADED)
        {   break label_37;
        }
        Properties props_86 = safeRef(sub_79.properties());
        /* #=term *//*Contract*/sink.properties(safeRef(props_11));
        sink.start(_M_CompileSave);
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.copy(sub.ref()); sink.literal(".java");
        sink.end();
        sink.start(_M_GenerateJavaParsed); sink.copy(sub.ref());sink.properties(safeRef(props_86));
        sink.start(_M_OutputCrsx); sink.start(_M_OK); sink.end();
        sink.end(); sink.copy(sub_8.ref());
        sink.end();
        Variable var_64 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_64});
        VariableUse use = sink.context().makeVariableUse(var_64);
        sink.substitute(term_44.ref(), new Variable[] { var_54 }, new Term[] {use});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_CompileNormalized, props_11, term_182, var_54, term_44);
  }   final public static boolean _M_CompileModule(Sink sink, int shared, int depth, Properties props_25, Term term_189, Variable var_93, Term term_81) {
    if (depth < 2000) {
      label_23: {
        /* #key=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_25));
        sink.start(_M_CompileNormalized);
        sink.start(_M__s);sink.properties(safeRef(props_25));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_189.ref());
        sink.end();
        Variable var_42 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_42});
        VariableUse use_6 = sink.context().makeVariableUse(var_42);
        sink.substitute(term_81.ref(), new Variable[] { var_93 }, new Term[] {use_6});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_CompileModule, props_25, term_189, var_93, term_81);
  }   final public static boolean _M_CompileNextModule1(Sink sink, int shared, int depth, Properties props_66, Term term_88) {
    if (depth < 2000) {
      label_92: {
        if (term_88.descriptor() != _M_MODULES)
        {   break label_92;
        }Term sub_2 = term_88.sub(0).ref();
        if (sub_2.descriptor() != _M__sNil)
        {   break label_92;
        }/*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal("}"); sink.end();Term term_171;
        {
          BufferSink buf_31 = sink.context().makeBuffer(); buf_31.start(_M_STRING); buf_31.literal(1); buf_31.end();
          term_171 = buf_31.term();
        } sink.propertyNamed("$LineLocation", term_171);Term term_93;
        {
          BufferSink buf_134 = sink.context().makeBuffer(); buf_134.start(_M_STRING); buf_134.literal(1); buf_134.end();
          term_93 = buf_134.term();
        } sink.propertyNamed("$ColumnLocation", term_93);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); return true;
      }
      label_31: {
        if (term_88.descriptor() != _M_MODULES)
        {   break label_31;
        }Term sub_85 = term_88.sub(0).ref();
        if (sub_85.descriptor() != _M__sCons)
        {   break label_31;
        }Term sub_18 = sub_85.sub(0).ref();
        /* #module=sub */Term sub_7 = sub_85.sub(1).ref();
        /* #modules=sub *//*Contract*/sink.properties(safeRef(props_66));Term term_153;
        {
          BufferSink buf_123 = sink.context().makeBuffer();
          buf_123.start(_M_MODULES); buf_123.copy(sub_7.ref());
          buf_123.end();
          term_153 = buf_123.term();
        } sink.propertyNamed("$modules", term_153);
        sink.start(_M_CompileModule); sink.copy(sub_18.ref());
        Variable var_73 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_73});
        sink.start(_M_CompileNextModule); sink.use(var_73);
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_CompileNextModule1, props_66, term_88);
  } final public static boolean _M_CompileNextModule(Sink sink, int shared, int depth, Properties props_37, Term term_92) {
    if (depth < 2000) {
      label_76: {
        if (term_92.descriptor() != _M_OK)
        {   break label_76;
        }/*Contract*/sink.properties(safeRef(props_37));
        sink.start(_M_CompileNextModule1);
        sink.start(_M__s);sink.properties(safeRef(props_37));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.literal("$modules");
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_CompileNextModule, props_37, term_92);
  } final public static boolean _M_AddImport(Sink sink, int shared, int depth, Properties props_18, Term term_133, Term term_114) {
    if (depth < 2000) {
      label_90: {
        /* #filename=term */
        if (term_114.descriptor() != _M_CONTINUATION)
        {   break label_90;
        }Term sub_82 = term_114.sub(0).ref();
        Variable binder = term_114.binders(0)[0];
        /* #=sub *//*Contract*/sink.properties(safeRef(props_18));Term term_59;
        {
          BufferSink buf_52 = sink.context().makeBuffer(); buf_52.start(_M_OK); buf_52.end();
          term_59 = buf_52.term();
        }
        sink.substitute(sub_82.ref(), new Variable[] { binder }, new Term[] {term_59}); return true; 
      }
    }
    return thunk(sink, _M_AddImport, props_18, term_133, term_114);
  }  final public static boolean _M_NormalizeDone1(Sink sink, int shared, int depth, Properties props_22, Term term_45, Term term_69, Term term_51, Term term_111, Term term_113, Term term_1, Term term_231, Variable var_11, Term term_110) {
    if (depth < 2000) {
      label_14: {
        if (term_45.descriptor() != _M_MODULES)
        {   break label_14;
        }Term sub_61 = term_45.sub(0).ref();
        /* #normalized=sub */
        if (term_69.descriptor() != _M_MODULES)
        {   break label_14;
        }Term sub_91 = term_69.sub(0).ref();
        /* #modules=sub */
        if (term_51.descriptor() != _M_IMPORTS)
        {   break label_14;
        }Term sub_59 = term_51.sub(0).ref();
        /* #imports=sub */
        /* #key=term */
        /* #filename=term */
        /* #mode=term */
        /* #content=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_22));Term term_0;
        {
          BufferSink buf_35 = sink.context().makeBuffer();
          buf_35.start(_M_MODULES);
          buf_35.start(_M_Concat); buf_35.copy(sub_61.ref());
          buf_35.start(_M__sCons); buf_35.copy(term_113.ref()); buf_35.start(_M__sNil); buf_35.end();
          buf_35.end();
          buf_35.end();
          buf_35.end();
          term_0 = buf_35.term();
        } sink.propertyNamed("$normalized", term_0);Term term_180;
        {
          BufferSink buf_112 = sink.context().makeBuffer();
          buf_112.start(_M_MODULE); buf_112.copy(term_113.ref()); buf_112.copy(term_1.ref()); buf_112.copy(term_231.ref());
          buf_112.end();
          term_180 = buf_112.term();
        }
        term_111 = force(sink.context(), term_111);
        Sink.property(sink, term_111, term_180);
        sink.start(_M_SeqMap);
        Variable var_5 = sink.context().makeVariable("name");
        Variable var_50 = sink.context().makeVariable("cont");
        sink.binds(new Variable[] {var_5,var_50});
        sink.start(_M_AddImport); sink.use(var_5); sink.use(var_50);
        sink.end(); sink.copy(sub_59.ref());
        Variable var_47 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_47});
        VariableUse use_94 = sink.context().makeVariableUse(var_47);
        sink.substitute(term_110.ref(), new Variable[] { var_11 }, new Term[] {use_94});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeDone1, props_22, term_45, term_69, term_51, term_111, term_113, term_1, term_231, var_11, term_110);
  }         final public static boolean _M_NormalizeDone(Sink sink, int shared, int depth, Properties props_28, Term term_94, Term term_30, Term term_237, Term term_136, Variable var_57, Term term_120) {
    if (depth < 2000) {
      label_59: {
        /* #key=term */
        /* #filename=term */
        /* #mode=term */
        if (term_136.descriptor() != _M_LOADED)
        {   break label_59;
        }
        Properties props_65 = safeRef(term_136.properties());
        /* #=term *//*Contract*/sink.properties(safeRef(props_28));
        sink.start(_M_NormalizeDone1);
        sink.start(_M__s);sink.properties(safeRef(props_28));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.literal("$normalized");
        sink.end();
        sink.start(_M__s);sink.properties(safeRef(props_28));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.literal("$modules");
        sink.end();
        sink.start(_M__s);sink.properties(safeRef(props_65));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.literal("$imported");
        sink.end(); sink.copy(term_94.ref()); sink.copy(term_30.ref()); sink.copy(term_237.ref());sink.properties(safeRef(props_65));
        sink.start(_M_LOADED);
        sink.end();
        Variable var_33 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_33});
        VariableUse use_70 = sink.context().makeVariableUse(var_33);
        sink.substitute(term_120.ref(), new Variable[] { var_57 }, new Term[] {use_70});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeDone, props_28, term_94, term_30, term_237, term_136, var_57, term_120);
  }      final public static boolean _M_NormalizeParsed(Sink sink, int shared, int depth, Properties props_6, Term term_150, Term term_156, Term term_144, Term term_192, Variable var_87, Term term_78) {
    if (depth < 2000) {
      label_96: {
        /* #key=term */
        /* #filename=term */
        /* #mode=term */
        /* #crsx=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_6));
        sink.start(_M_NormalizeDone); sink.copy(term_150.ref()); sink.copy(term_156.ref()); sink.copy(term_144.ref());
        sink.start(_M_NormalizeToState); sink.copy(term_156.ref()); sink.copy(term_192.ref());
        sink.end();
        Variable var_29 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_29});
        VariableUse use_4 = sink.context().makeVariableUse(var_29);
        sink.substitute(term_78.ref(), new Variable[] { var_87 }, new Term[] {use_4});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeParsed, props_6, term_150, term_156, term_144, term_192, var_87, term_78);
  }      final public static boolean _M_NormalizeModuleLoad(Sink sink, int shared, int depth, Properties props_41, Term term_55, Variable var_7, Term term_119) {
    if (depth < 2000) {
      label_27: {
        if (term_55.descriptor() != _M_MODULE)
        {   break label_27;
        }Term sub_74 = term_55.sub(0).ref();
        /* #filename=sub */Term sub_34 = term_55.sub(1).ref();
        /* #mode=sub */Term sub_136 = term_55.sub(2).ref();
        if (sub_136.descriptor() != _M_NOTLOADED)
        {   break label_27;
        }
        /* #=term *//*Contract*/sink.properties(safeRef(props_41));
        sink.start(_M_NormalizeParsed); sink.start(_M_ModuleKey); sink.copy(sub_74.ref()); sink.end(); sink.copy(sub_74.ref()); sink.copy(sub_34.ref());
        sink.start(_M__s); sink.start(_M_Builtin_sParseResource); sink.end(); sink.literal("crsx"); sink.copy(sub_74.ref());
        sink.end();
        Variable var_21 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_21});
        VariableUse use_84 = sink.context().makeVariableUse(var_21);
        sink.substitute(term_119.ref(), new Variable[] { var_7 }, new Term[] {use_84});
        sink.end(); return true;
      }
      label_9: {
        if (term_55.descriptor() != _M_MODULE)
        {   break label_9;
        }Term sub_94 = term_55.sub(0).ref();
        /* #filename=sub */Term sub_51 = term_55.sub(1).ref();
        /* #mode=sub */Term sub_183 = term_55.sub(2).ref();
        if (sub_183.descriptor() != _M_LOADED)
        {   break label_9;
        }
        Properties props_48 = safeRef(sub_183.properties());
        /* #=term *//*Contract*/sink.properties(safeRef(props_41));Term term_9;
        {
          BufferSink buf_75 = sink.context().makeBuffer(); buf_75.start(_M_OK); buf_75.end();
          term_9 = buf_75.term();
        }
        sink.substitute(term_119.ref(), new Variable[] { var_7 }, new Term[] {term_9}); return true;
      }
    }
    return thunk(sink, _M_NormalizeModuleLoad, props_41, term_55, var_7, term_119);
  }   final public static boolean _M_NormalizeModule(Sink sink, int shared, int depth, Properties props_81, Term term_191, Variable var_18, Term term_20) {
    if (depth < 2000) {
      label_64: {
        /* #key=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_81));
        sink.start(_M_NormalizeModuleLoad);
        sink.start(_M__s);sink.properties(safeRef(props_81));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_191.ref());
        sink.end();
        Variable var_62 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_62});
        VariableUse use_77 = sink.context().makeVariableUse(var_62);
        sink.substitute(term_20.ref(), new Variable[] { var_18 }, new Term[] {use_77});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeModule, props_81, term_191, var_18, term_20);
  }   final public static boolean _M_NormalizeNextModule1(Sink sink, int shared, int depth, Properties props_67, Term term_58) {
    if (depth < 2000) {
      label_85: {
        if (term_58.descriptor() != _M_MODULES)
        {   break label_85;
        }Term sub_190 = term_58.sub(0).ref();
        if (sub_190.descriptor() != _M__sNil)
        {   break label_85;
        }/*Contract*/sink.properties(safeRef(props_67));
        sink.start(_M_CompileNextModule); sink.start(_M_OK); sink.end();
        sink.end(); return true;
      }
      label_20: {
        if (term_58.descriptor() != _M_MODULES)
        {   break label_20;
        }Term sub_40 = term_58.sub(0).ref();
        if (sub_40.descriptor() != _M__sCons)
        {   break label_20;
        }Term sub_42 = sub_40.sub(0).ref();
        /* #module=sub */Term sub_93 = sub_40.sub(1).ref();
        /* #modules=sub *//*Contract*/sink.properties(safeRef(props_67));Term term_36;
        {
          BufferSink buf_36 = sink.context().makeBuffer();
          buf_36.start(_M_MODULES); buf_36.copy(sub_93.ref());
          buf_36.end();
          term_36 = buf_36.term();
        } sink.propertyNamed("$notloaded", term_36);
        sink.start(_M_NormalizeModule); sink.copy(sub_42.ref());
        Variable var_8 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_8});
        sink.start(_M_NormalizeNextModule); sink.use(var_8);
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeNextModule1, props_67, term_58);
  } final public static boolean _M_NormalizeNextModule(Sink sink, int shared, int depth, Properties props_38, Term term_42) {
    if (depth < 2000) {
      label_32: {
        if (term_42.descriptor() != _M_OK)
        {   break label_32;
        }/*Contract*/sink.properties(safeRef(props_38));
        sink.start(_M_NormalizeNextModule1);
        sink.start(_M__s);sink.properties(safeRef(props_38));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.literal("$notloaded");
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeNextModule, props_38, term_42);
  } final public static boolean _M_Compile(Sink sink, int shared, int depth, Term term_71) {
    if (depth < 2000) {Term term_169;
      {
        BufferSink buf_16 = sink.context().makeBuffer();
        buf_16.start(_M_MODULES); buf_16.start(_M__sNil); buf_16.end();
        buf_16.end();
        term_169 = buf_16.term();
      } sink.propertyNamed("$modules", term_169);Term term_21;
      {
        BufferSink buf_37 = sink.context().makeBuffer();
        buf_37.start(_M_MODULES); buf_37.start(_M__sNil); buf_37.end();
        buf_37.end();
        term_21 = buf_37.term();
      } sink.propertyNamed("$notloaded", term_21);Term term_32;
      {
        BufferSink buf_135 = sink.context().makeBuffer();
        buf_135.start(_M_MODULES); buf_135.start(_M__sNil); buf_135.end();
        buf_135.end();
        term_32 = buf_135.term();
      } sink.propertyNamed("$normalized", term_32);
      sink.start(_M_AddModule); sink.copy(term_71.ref()); sink.start(_M_MAINMODULE); sink.end();
      Variable var_61 = sink.context().makeVariable("ok");
      sink.binds(new Variable[] {var_61});
      sink.start(_M_NormalizeNextModule); sink.use(var_61);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Compile, term_71);
  } 
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.State.init(context); org.crsx.compiler.Normalizer.init(context); org.crsx.compiler.cg.Cgjava.init(context); org.crsx.compiler.std.Core.init(context); org.crsx.compiler.std.List.init(context); org.crsx.compiler.std.Text.init(context); context.registerParser("org.crsx.parser.CrsxMetaParser"); context.register(_M_CompileSave); context.register(_M_CompileNormalized); context.register(_M_CompileModule); context.register(_M_CompileNextModule1); context.register(_M_CompileNextModule); context.register(_M_AddImport); context.register(_M_NormalizeDone1); context.register(_M_NormalizeDone); context.register(_M_NormalizeParsed); context.register(_M_NormalizeModuleLoad); context.register(_M_NormalizeModule); context.register(_M_NormalizeNextModule1); context.register(_M_NormalizeNextModule); context.register(_M_Compile);
      initialized = true;
    }
  }

/* END MODULE « "crsx.crs.java" » */
}