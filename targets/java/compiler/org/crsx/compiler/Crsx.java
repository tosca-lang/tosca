/* START MODULE /Users/villardl/Projects/crsx/crsx4_2/src/crsx.crs.java */
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
  final public static DynamicFunctionDescriptor _M_Compile = makeFunction("Compile", Crsx.class, "_M_Compile");final public static boolean _M_CompileSave(Sink sink, int shared, int depth, Properties props, Term term, Term term_25, Variable var, Term term_78) {
    if (depth < 2000) {
      label: {
        /* #filename=term */
        /* #code=term */
        /* #=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextChars); sink.literal("/* START MODULE ");
        sink.end();Term term_69;
        {
          BufferSink buf = sink.context().makeBuffer(); buf.start(_M_STRING); buf.literal(1); buf.end();
          term_69 = buf.term();
        } sink.propertyNamed("$LineLocation", term_69);Term term_16;
        {
          BufferSink buf_72 = sink.context().makeBuffer(); buf_72.start(_M_STRING); buf_72.literal(1); buf_72.end();
          term_16 = buf_72.term();
        } sink.propertyNamed("$ColumnLocation", term_16);
        sink.start(_M__sTextCons);Term term_47;
        {
          BufferSink buf_74 = sink.context().makeBuffer(); buf_74.start(_M_STRING); buf_74.literal(1); buf_74.end();
          term_47 = buf_74.term();
        } sink.propertyNamed("$LineLocation", term_47);Term term_6;
        {
          BufferSink buf_135 = sink.context().makeBuffer();
          buf_135.start(_M_STRING); buf_135.literal(17);
          buf_135.end();
          term_6 = buf_135.term();
        } sink.propertyNamed("$ColumnLocation", term_6);
        sink.start(_M__sTextChars); sink.copy(term.ref());
        sink.end();Term term_75;
        {
          BufferSink buf_9 = sink.context().makeBuffer(); buf_9.start(_M_STRING); buf_9.literal(1); buf_9.end();
          term_75 = buf_9.term();
        } sink.propertyNamed("$LineLocation", term_75);Term term_15;
        {
          BufferSink buf_56 = sink.context().makeBuffer(); buf_56.start(_M_STRING); buf_56.literal(18); buf_56.end();
          term_15 = buf_56.term();
        } sink.propertyNamed("$ColumnLocation", term_15);
        sink.start(_M__sTextCons);Term term_58;
        {
          BufferSink buf_58 = sink.context().makeBuffer(); buf_58.start(_M_STRING); buf_58.literal(1); buf_58.end();
          term_58 = buf_58.term();
        } sink.propertyNamed("$LineLocation", term_58);Term term_72;
        {
          BufferSink buf_28 = sink.context().makeBuffer(); buf_28.start(_M_STRING); buf_28.literal(18); buf_28.end();
          term_72 = buf_28.term();
        } sink.propertyNamed("$ColumnLocation", term_72);
        sink.start(_M__sTextChars); sink.literal(" */");
        sink.end();Term term_2;
        {
          BufferSink buf_54 = sink.context().makeBuffer(); buf_54.start(_M_STRING); buf_54.literal(1); buf_54.end();
          term_2 = buf_54.term();
        } sink.propertyNamed("$LineLocation", term_2);Term term_29;
        {
          BufferSink buf_95 = sink.context().makeBuffer(); buf_95.start(_M_STRING); buf_95.literal(29); buf_95.end();
          term_29 = buf_95.term();
        } sink.propertyNamed("$ColumnLocation", term_29);
        sink.start(_M__sTextCons);Term term_55;
        {
          BufferSink buf_0 = sink.context().makeBuffer(); buf_0.start(_M_STRING); buf_0.literal(1); buf_0.end();
          term_55 = buf_0.term();
        } sink.propertyNamed("$LineLocation", term_55);Term term_46;
        {
          BufferSink buf_94 = sink.context().makeBuffer(); buf_94.start(_M_STRING); buf_94.literal(29); buf_94.end();
          term_46 = buf_94.term();
        } sink.propertyNamed("$ColumnLocation", term_46);
        sink.start(_M__sTextBreak); sink.literal("\n");
        sink.end();Term term_181;
        {
          BufferSink buf_17 = sink.context().makeBuffer(); buf_17.start(_M_STRING); buf_17.literal(1); buf_17.end();
          term_181 = buf_17.term();
        } sink.propertyNamed("$LineLocation", term_181);Term term_54;
        {
          BufferSink buf_97 = sink.context().makeBuffer(); buf_97.start(_M_STRING); buf_97.literal(32); buf_97.end();
          term_54 = buf_97.term();
        } sink.propertyNamed("$ColumnLocation", term_54);
        sink.start(_M__sTextCons);Term term_18;
        {
          BufferSink buf_45 = sink.context().makeBuffer(); buf_45.start(_M_STRING); buf_45.literal(1); buf_45.end();
          term_18 = buf_45.term();
        } sink.propertyNamed("$LineLocation", term_18);Term term_5;
        {
          BufferSink buf_77 = sink.context().makeBuffer(); buf_77.start(_M_STRING); buf_77.literal(32); buf_77.end();
          term_5 = buf_77.term();
        } sink.propertyNamed("$ColumnLocation", term_5);
        sink.start(_M__sTextEmbed);Term term_37;
        {
          BufferSink buf_8 = sink.context().makeBuffer(); buf_8.start(_M_STRING); buf_8.literal(1); buf_8.end();
          term_37 = buf_8.term();
        } sink.propertyNamed("$LineLocation", term_37);Term term_97;
        {
          BufferSink buf_187 = sink.context().makeBuffer();
          buf_187.start(_M_STRING); buf_187.literal(32);
          buf_187.end();
          term_97 = buf_187.term();
        } sink.propertyNamed("$ColumnLocation", term_97);
        sink.start(_M_AsText); sink.copy(term_25.ref());
        sink.end();
        sink.end();Term term_0;
        {
          BufferSink buf_12 = sink.context().makeBuffer(); buf_12.start(_M_STRING); buf_12.literal(2); buf_12.end();
          term_0 = buf_12.term();
        } sink.propertyNamed("$LineLocation", term_0);Term term_56;
        {
          BufferSink buf_37 = sink.context().makeBuffer(); buf_37.start(_M_STRING); buf_37.literal(1); buf_37.end();
          term_56 = buf_37.term();
        } sink.propertyNamed("$ColumnLocation", term_56);
        sink.start(_M__sTextCons);Term term_49;
        {
          BufferSink buf_66 = sink.context().makeBuffer(); buf_66.start(_M_STRING); buf_66.literal(2); buf_66.end();
          term_49 = buf_66.term();
        } sink.propertyNamed("$LineLocation", term_49);Term term_36;
        {
          BufferSink buf_10 = sink.context().makeBuffer(); buf_10.start(_M_STRING); buf_10.literal(1); buf_10.end();
          term_36 = buf_10.term();
        } sink.propertyNamed("$ColumnLocation", term_36);
        sink.start(_M__sTextBreak); sink.literal("\n");
        sink.end();Term term_79;
        {
          BufferSink buf_89 = sink.context().makeBuffer(); buf_89.start(_M_STRING); buf_89.literal(2); buf_89.end();
          term_79 = buf_89.term();
        } sink.propertyNamed("$LineLocation", term_79);Term term_66;
        {
          BufferSink buf_99 = sink.context().makeBuffer(); buf_99.start(_M_STRING); buf_99.literal(8); buf_99.end();
          term_66 = buf_99.term();
        } sink.propertyNamed("$ColumnLocation", term_66);
        sink.start(_M__sTextCons);Term term_73;
        {
          BufferSink buf_63 = sink.context().makeBuffer(); buf_63.start(_M_STRING); buf_63.literal(2); buf_63.end();
          term_73 = buf_63.term();
        } sink.propertyNamed("$LineLocation", term_73);Term term_63;
        {
          BufferSink buf_41 = sink.context().makeBuffer(); buf_41.start(_M_STRING); buf_41.literal(8); buf_41.end();
          term_63 = buf_41.term();
        } sink.propertyNamed("$ColumnLocation", term_63);
        sink.start(_M__sTextChars); sink.literal("/* END MODULE ");
        sink.end();Term term_83;
        {
          BufferSink buf_61 = sink.context().makeBuffer(); buf_61.start(_M_STRING); buf_61.literal(3); buf_61.end();
          term_83 = buf_61.term();
        } sink.propertyNamed("$LineLocation", term_83);Term term_92;
        {
          BufferSink buf_100 = sink.context().makeBuffer(); buf_100.start(_M_STRING); buf_100.literal(1); buf_100.end();
          term_92 = buf_100.term();
        } sink.propertyNamed("$ColumnLocation", term_92);
        sink.start(_M__sTextCons);Term term_76;
        {
          BufferSink buf_13 = sink.context().makeBuffer(); buf_13.start(_M_STRING); buf_13.literal(3); buf_13.end();
          term_76 = buf_13.term();
        } sink.propertyNamed("$LineLocation", term_76);Term term_96;
        {
          BufferSink buf_33 = sink.context().makeBuffer(); buf_33.start(_M_STRING); buf_33.literal(1); buf_33.end();
          term_96 = buf_33.term();
        } sink.propertyNamed("$ColumnLocation", term_96);
        sink.start(_M__sTextEmbed);Term term_42;
        {
          BufferSink buf_27 = sink.context().makeBuffer(); buf_27.start(_M_STRING); buf_27.literal(3); buf_27.end();
          term_42 = buf_27.term();
        } sink.propertyNamed("$LineLocation", term_42);Term term_91;
        {
          BufferSink buf_87 = sink.context().makeBuffer(); buf_87.start(_M_STRING); buf_87.literal(1); buf_87.end();
          term_91 = buf_87.term();
        } sink.propertyNamed("$ColumnLocation", term_91);
        sink.start(_M_AsText); sink.copy(term.ref());
        sink.end();
        sink.end();Term term_26;
        {
          BufferSink buf_83 = sink.context().makeBuffer(); buf_83.start(_M_STRING); buf_83.literal(3); buf_83.end();
          term_26 = buf_83.term();
        } sink.propertyNamed("$LineLocation", term_26);Term term_50;
        {
          BufferSink buf_123 = sink.context().makeBuffer();
          buf_123.start(_M_STRING); buf_123.literal(15);
          buf_123.end();
          term_50 = buf_123.term();
        } sink.propertyNamed("$ColumnLocation", term_50);
        sink.start(_M__sTextCons);Term term_39;
        {
          BufferSink buf_57 = sink.context().makeBuffer(); buf_57.start(_M_STRING); buf_57.literal(3); buf_57.end();
          term_39 = buf_57.term();
        } sink.propertyNamed("$LineLocation", term_39);Term term_13;
        {
          BufferSink buf_93 = sink.context().makeBuffer(); buf_93.start(_M_STRING); buf_93.literal(15); buf_93.end();
          term_13 = buf_93.term();
        } sink.propertyNamed("$ColumnLocation", term_13);
        sink.start(_M__sTextChars); sink.literal(" */");
        sink.end();Term term_53;
        {
          BufferSink buf_30 = sink.context().makeBuffer(); buf_30.start(_M_STRING); buf_30.literal(3); buf_30.end();
          term_53 = buf_30.term();
        } sink.propertyNamed("$LineLocation", term_53);Term term_1;
        {
          BufferSink buf_29 = sink.context().makeBuffer(); buf_29.start(_M_STRING); buf_29.literal(26); buf_29.end();
          term_1 = buf_29.term();
        } sink.propertyNamed("$ColumnLocation", term_1);
        sink.start(_M__sTextCons);Term term_20;
        {
          BufferSink buf_19 = sink.context().makeBuffer(); buf_19.start(_M_STRING); buf_19.literal(3); buf_19.end();
          term_20 = buf_19.term();
        } sink.propertyNamed("$LineLocation", term_20);Term term_176;
        {
          BufferSink buf_21 = sink.context().makeBuffer(); buf_21.start(_M_STRING); buf_21.literal(26); buf_21.end();
          term_176 = buf_21.term();
        } sink.propertyNamed("$ColumnLocation", term_176);
        sink.start(_M__sTextBreak); sink.literal("\n");
        sink.end();Term term_34;
        {
          BufferSink buf_91 = sink.context().makeBuffer(); buf_91.start(_M_STRING); buf_91.literal(3); buf_91.end();
          term_34 = buf_91.term();
        } sink.propertyNamed("$LineLocation", term_34);Term term_60;
        {
          BufferSink buf_22 = sink.context().makeBuffer(); buf_22.start(_M_STRING); buf_22.literal(29); buf_22.end();
          term_60 = buf_22.term();
        } sink.propertyNamed("$ColumnLocation", term_60);
        sink.start(_M__sTextCons);Term term_57;
        {
          BufferSink buf_75 = sink.context().makeBuffer(); buf_75.start(_M_STRING); buf_75.literal(3); buf_75.end();
          term_57 = buf_75.term();
        } sink.propertyNamed("$LineLocation", term_57);Term term_45;
        {
          BufferSink buf_23 = sink.context().makeBuffer(); buf_23.start(_M_STRING); buf_23.literal(29); buf_23.end();
          term_45 = buf_23.term();
        } sink.propertyNamed("$ColumnLocation", term_45);
        sink.start(_M__sTextEmbed);Term term_48;
        {
          BufferSink buf_81 = sink.context().makeBuffer(); buf_81.start(_M_STRING); buf_81.literal(3); buf_81.end();
          term_48 = buf_81.term();
        } sink.propertyNamed("$LineLocation", term_48);Term term_220;
        {
          BufferSink buf_20 = sink.context().makeBuffer(); buf_20.start(_M_STRING); buf_20.literal(29); buf_20.end();
          term_220 = buf_20.term();
        } sink.propertyNamed("$ColumnLocation", term_220);
        sink.start(_M_AsText);sink.properties(safeRef(props));Term term_41;
        {
          BufferSink buf_65 = sink.context().makeBuffer(); buf_65.start(_M_OK); buf_65.end();
          term_41 = buf_65.term();
        }
        sink.substitute(term_78.ref(), new Variable[] { var }, new Term[] {term_41});
        sink.end();
        sink.end();Term term_87;
        {
          BufferSink buf_98 = sink.context().makeBuffer(); buf_98.start(_M_STRING); buf_98.literal(4); buf_98.end();
          term_87 = buf_98.term();
        } sink.propertyNamed("$LineLocation", term_87);Term term_106;
        {
          BufferSink buf_25 = sink.context().makeBuffer(); buf_25.start(_M_STRING); buf_25.literal(1); buf_25.end();
          term_106 = buf_25.term();
        } sink.propertyNamed("$ColumnLocation", term_106);
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
    return thunk(sink, _M_CompileSave, props, term, term_25, var, term_78);
  }    final public static boolean _M_CompileNormalized(Sink sink, int shared, int depth, Properties props_65, Term term_269, Variable var_46, Term term_52) {
    if (depth < 2000) {
      label_69: {
        if (term_269.descriptor() != _M_MODULE)
        {   break label_69;
        }Term sub = term_269.sub(0).ref();
        /* #filename=sub */Term sub_9 = term_269.sub(1).ref();
        /* #mode=sub */Term sub_52 = term_269.sub(2).ref();
        if (sub_52.descriptor() != _M_LOADED)
        {   break label_69;
        }
        Properties props_14 = safeRef(sub_52.properties());
        /* #=term *//*Contract*/sink.properties(safeRef(props_65));
        sink.start(_M_CompileSave);
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.copy(sub.ref()); sink.literal(".java");
        sink.end();
        sink.start(_M_GenerateJavaParsed); sink.copy(sub.ref());sink.properties(safeRef(props_14));
        sink.start(_M_OutputCrsx); sink.start(_M_OK); sink.end();
        sink.end(); sink.copy(sub_9.ref());
        sink.end();
        Variable var_34 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_34});
        VariableUse use = sink.context().makeVariableUse(var_34);
        sink.substitute(term_52.ref(), new Variable[] { var_46 }, new Term[] {use});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_CompileNormalized, props_65, term_269, var_46, term_52);
  }   final public static boolean _M_CompileModule(Sink sink, int shared, int depth, Properties props_55, Term term_28, Variable var_4, Term term_38) {
    if (depth < 2000) {
      label_46: {
        /* #key=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_55));
        sink.start(_M_CompileNormalized);
        sink.start(_M__s);sink.properties(safeRef(props_55));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_28.ref());
        sink.end();
        Variable var_37 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_37});
        VariableUse use_6 = sink.context().makeVariableUse(var_37);
        sink.substitute(term_38.ref(), new Variable[] { var_4 }, new Term[] {use_6});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_CompileModule, props_55, term_28, var_4, term_38);
  }   final public static boolean _M_CompileNextModule1(Sink sink, int shared, int depth, Properties props_56, Term term_88) {
    if (depth < 2000) {
      label_50: {
        if (term_88.descriptor() != _M_MODULES)
        {   break label_50;
        }Term sub_67 = term_88.sub(0).ref();
        if (sub_67.descriptor() != _M__sNil)
        {   break label_50;
        }/*Contract*/
        sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal("}"); sink.end();Term term_296;
        {
          BufferSink buf_90 = sink.context().makeBuffer(); buf_90.start(_M_STRING); buf_90.literal(1); buf_90.end();
          term_296 = buf_90.term();
        } sink.propertyNamed("$LineLocation", term_296);Term term_124;
        {
          BufferSink buf_158 = sink.context().makeBuffer(); buf_158.start(_M_STRING); buf_158.literal(1); buf_158.end();
          term_124 = buf_158.term();
        } sink.propertyNamed("$ColumnLocation", term_124);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); return true;
      }
      label_92: {
        if (term_88.descriptor() != _M_MODULES)
        {   break label_92;
        }Term sub_48 = term_88.sub(0).ref();
        if (sub_48.descriptor() != _M__sCons)
        {   break label_92;
        }Term sub_36 = sub_48.sub(0).ref();
        /* #module=sub */Term sub_49 = sub_48.sub(1).ref();
        /* #modules=sub *//*Contract*/sink.properties(safeRef(props_56));Term term_98;
        {
          BufferSink buf_136 = sink.context().makeBuffer();
          buf_136.start(_M_MODULES); buf_136.copy(sub_49.ref());
          buf_136.end();
          term_98 = buf_136.term();
        } sink.propertyNamed("$modules", term_98);
        sink.start(_M_CompileModule); sink.copy(sub_36.ref());
        Variable var_23 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_23});
        sink.start(_M_CompileNextModule); sink.use(var_23);
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_CompileNextModule1, props_56, term_88);
  } final public static boolean _M_CompileNextModule(Sink sink, int shared, int depth, Properties props_70, Term term_70) {
    if (depth < 2000) {
      label_66: {
        if (term_70.descriptor() != _M_OK)
        {   break label_66;
        }/*Contract*/sink.properties(safeRef(props_70));
        sink.start(_M_CompileNextModule1);
        sink.start(_M__s);sink.properties(safeRef(props_70));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.literal("$modules");
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_CompileNextModule, props_70, term_70);
  } final public static boolean _M_AddImport(Sink sink, int shared, int depth, Properties props_75, Term term_103, Term term_59) {
    if (depth < 2000) {
      label_75: {
        /* #filename=term */
        if (term_59.descriptor() != _M_CONTINUATION)
        {   break label_75;
        }Term sub_64 = term_59.sub(0).ref();
        Variable binder = term_59.binders(0)[0];
        /* #=sub *//*Contract*/sink.properties(safeRef(props_75));Term term_109;
        {
          BufferSink buf_55 = sink.context().makeBuffer(); buf_55.start(_M_OK); buf_55.end();
          term_109 = buf_55.term();
        }
        sink.substitute(sub_64.ref(), new Variable[] { binder }, new Term[] {term_109}); return true; 
      }
    }
    return thunk(sink, _M_AddImport, props_75, term_103, term_59);
  }  final public static boolean _M_NormalizeDone1(Sink sink, int shared, int depth, Properties props_51, Term term_17, Term term_94, Term term_19, Term term_126, Term term_154, Term term_68, Term term_95, Variable var_19, Term term_198) {
    if (depth < 2000) {
      label_30: {
        if (term_17.descriptor() != _M_MODULES)
        {   break label_30;
        }Term sub_81 = term_17.sub(0).ref();
        /* #normalized=sub */
        if (term_94.descriptor() != _M_MODULES)
        {   break label_30;
        }Term sub_53 = term_94.sub(0).ref();
        /* #modules=sub */
        if (term_19.descriptor() != _M_IMPORTS)
        {   break label_30;
        }Term sub_2 = term_19.sub(0).ref();
        /* #imports=sub */
        /* #key=term */
        /* #filename=term */
        /* #mode=term */
        /* #content=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_51));Term term_22;
        {
          BufferSink buf_7 = sink.context().makeBuffer();
          buf_7.start(_M_MODULES);
          buf_7.start(_M_Concat); buf_7.copy(sub_81.ref());
          buf_7.start(_M__sCons); buf_7.copy(term_154.ref()); buf_7.start(_M__sNil); buf_7.end();
          buf_7.end();
          buf_7.end();
          buf_7.end();
          term_22 = buf_7.term();
        } sink.propertyNamed("$normalized", term_22);Term term_9;
        {
          BufferSink buf_3 = sink.context().makeBuffer();
          buf_3.start(_M_MODULE); buf_3.copy(term_154.ref()); buf_3.copy(term_68.ref()); buf_3.copy(term_95.ref());
          buf_3.end();
          term_9 = buf_3.term();
        }
        term_126 = force(sink.context(), term_126);
        Sink.property(sink, term_126, term_9);
        sink.start(_M_SeqMap);
        Variable var_88 = sink.context().makeVariable("name");
        Variable var_89 = sink.context().makeVariable("cont");
        sink.binds(new Variable[] {var_88,var_89});
        sink.start(_M_AddImport); sink.use(var_88); sink.use(var_89);
        sink.end(); sink.copy(sub_2.ref());
        Variable var_51 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_51});
        VariableUse use_93 = sink.context().makeVariableUse(var_51);
        sink.substitute(term_198.ref(), new Variable[] { var_19 }, new Term[] {use_93});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeDone1, props_51, term_17, term_94, term_19, term_126, term_154, term_68, term_95, var_19, term_198);
  }         final public static boolean _M_NormalizeDone(Sink sink, int shared, int depth, Properties props_3, Term term_231, Term term_10, Term term_178, Term term_90, Variable var_80, Term term_191) {
    if (depth < 2000) {
      label_59: {
        /* #key=term */
        /* #filename=term */
        /* #mode=term */
        if (term_90.descriptor() != _M_LOADED)
        {   break label_59;
        }
        Properties props_31 = safeRef(term_90.properties());
        /* #=term *//*Contract*/sink.properties(safeRef(props_3));
        sink.start(_M_NormalizeDone1);
        sink.start(_M__s);sink.properties(safeRef(props_3));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.literal("$normalized");
        sink.end();
        sink.start(_M__s);sink.properties(safeRef(props_3));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.literal("$modules");
        sink.end();
        sink.start(_M__s);sink.properties(safeRef(props_31));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.literal("$imported");
        sink.end(); sink.copy(term_231.ref()); sink.copy(term_10.ref()); sink.copy(term_178.ref());sink.properties(safeRef(props_31));
        sink.start(_M_LOADED);
        sink.end();
        Variable var_38 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_38});
        VariableUse use_42 = sink.context().makeVariableUse(var_38);
        sink.substitute(term_191.ref(), new Variable[] { var_80 }, new Term[] {use_42});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeDone, props_3, term_231, term_10, term_178, term_90, var_80, term_191);
  }      final public static boolean _M_NormalizeParsed(Sink sink, int shared, int depth, Properties props_40, Term term_128, Term term_170, Term term_259, Term term_51, Variable var_68, Term term_261) {
    if (depth < 2000) {
      label_23: {
        /* #key=term */
        /* #filename=term */
        /* #mode=term */
        /* #crsx=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_40));
        sink.start(_M_NormalizeDone); sink.copy(term_128.ref()); sink.copy(term_170.ref()); sink.copy(term_259.ref());
        sink.start(_M_NormalizeToState); sink.copy(term_170.ref()); sink.copy(term_51.ref());
        sink.end();
        Variable var_60 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_60});
        VariableUse use_77 = sink.context().makeVariableUse(var_60);
        sink.substitute(term_261.ref(), new Variable[] { var_68 }, new Term[] {use_77});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeParsed, props_40, term_128, term_170, term_259, term_51, var_68, term_261);
  }      final public static boolean _M_NormalizeModuleLoad(Sink sink, int shared, int depth, Properties props_59, Term term_89, Variable var_161, Term term_118) {
    if (depth < 2000) {
      label_112: {
        if (term_89.descriptor() != _M_MODULE)
        {   break label_112;
        }Term sub_93 = term_89.sub(0).ref();
        /* #filename=sub */Term sub_89 = term_89.sub(1).ref();
        /* #mode=sub */Term sub_59 = term_89.sub(2).ref();
        if (sub_59.descriptor() != _M_NOTLOADED)
        {   break label_112;
        }
        /* #=term *//*Contract*/sink.properties(safeRef(props_59));
        sink.start(_M_NormalizeParsed); sink.start(_M_ModuleKey); sink.copy(sub_93.ref()); sink.end(); sink.copy(sub_93.ref()); sink.copy(sub_89.ref());
        sink.start(_M__s); sink.start(_M_Builtin_sParseResource); sink.end(); sink.literal("crsx"); sink.copy(sub_93.ref());
        sink.end();
        Variable var_35 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_35});
        VariableUse use_90 = sink.context().makeVariableUse(var_35);
        sink.substitute(term_118.ref(), new Variable[] { var_161 }, new Term[] {use_90});
        sink.end(); return true;
      }
      label_15: {
        if (term_89.descriptor() != _M_MODULE)
        {   break label_15;
        }Term sub_15 = term_89.sub(0).ref();
        /* #filename=sub */Term sub_57 = term_89.sub(1).ref();
        /* #mode=sub */Term sub_88 = term_89.sub(2).ref();
        if (sub_88.descriptor() != _M_LOADED)
        {   break label_15;
        }
        Properties props_13 = safeRef(sub_88.properties());
        /* #=term *//*Contract*/sink.properties(safeRef(props_59));Term term_11;
        {
          BufferSink buf_15 = sink.context().makeBuffer(); buf_15.start(_M_OK); buf_15.end();
          term_11 = buf_15.term();
        }
        sink.substitute(term_118.ref(), new Variable[] { var_161 }, new Term[] {term_11}); return true;
      }
    }
    return thunk(sink, _M_NormalizeModuleLoad, props_59, term_89, var_161, term_118);
  }   final public static boolean _M_NormalizeModule(Sink sink, int shared, int depth, Properties props_57, Term term_77, Variable var_135, Term term_108) {
    if (depth < 2000) {
      label_51: {
        /* #key=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_57));
        sink.start(_M_NormalizeModuleLoad);
        sink.start(_M__s);sink.properties(safeRef(props_57));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_77.ref());
        sink.end();
        Variable var_22 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_22});
        VariableUse use_87 = sink.context().makeVariableUse(var_22);
        sink.substitute(term_108.ref(), new Variable[] { var_135 }, new Term[] {use_87});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeModule, props_57, term_77, var_135, term_108);
  }   final public static boolean _M_NormalizeNextModule1(Sink sink, int shared, int depth, Properties props_44, Term term_456) {
    if (depth < 2000) {
      label_16: {
        if (term_456.descriptor() != _M_MODULES)
        {   break label_16;
        }Term sub_3 = term_456.sub(0).ref();
        if (sub_3.descriptor() != _M__sNil)
        {   break label_16;
        }/*Contract*/sink.properties(safeRef(props_44));
        sink.start(_M_CompileNextModule); sink.start(_M_OK); sink.end();
        sink.end(); return true;
      }
      label_31: {
        if (term_456.descriptor() != _M_MODULES)
        {   break label_31;
        }Term sub_19 = term_456.sub(0).ref();
        if (sub_19.descriptor() != _M__sCons)
        {   break label_31;
        }Term sub_37 = sub_19.sub(0).ref();
        /* #module=sub */Term sub_83 = sub_19.sub(1).ref();
        /* #modules=sub *//*Contract*/sink.properties(safeRef(props_44));Term term_171;
        {
          BufferSink buf_150 = sink.context().makeBuffer();
          buf_150.start(_M_MODULES); buf_150.copy(sub_83.ref());
          buf_150.end();
          term_171 = buf_150.term();
        } sink.propertyNamed("$notloaded", term_171);
        sink.start(_M_NormalizeModule); sink.copy(sub_37.ref());
        Variable var_99 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_99});
        sink.start(_M_NormalizeNextModule); sink.use(var_99);
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeNextModule1, props_44, term_456);
  } final public static boolean _M_NormalizeNextModule(Sink sink, int shared, int depth, Properties props_83, Term term_260) {
    if (depth < 2000) {
      label_41: {
        if (term_260.descriptor() != _M_OK)
        {   break label_41;
        }/*Contract*/sink.properties(safeRef(props_83));
        sink.start(_M_NormalizeNextModule1);
        sink.start(_M__s);sink.properties(safeRef(props_83));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.literal("$notloaded");
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_NormalizeNextModule, props_83, term_260);
  } final public static boolean _M_Compile(Sink sink, int shared, int depth, Term term_44) {
    if (depth < 2000) {Term term_85;
      {
        BufferSink buf_179 = sink.context().makeBuffer();
        buf_179.start(_M_MODULES); buf_179.start(_M__sNil); buf_179.end();
        buf_179.end();
        term_85 = buf_179.term();
      } sink.propertyNamed("$modules", term_85);Term term_243;
      {
        BufferSink buf_32 = sink.context().makeBuffer();
        buf_32.start(_M_MODULES); buf_32.start(_M__sNil); buf_32.end();
        buf_32.end();
        term_243 = buf_32.term();
      } sink.propertyNamed("$notloaded", term_243);Term term_107;
      {
        BufferSink buf_78 = sink.context().makeBuffer();
        buf_78.start(_M_MODULES); buf_78.start(_M__sNil); buf_78.end();
        buf_78.end();
        term_107 = buf_78.term();
      } sink.propertyNamed("$normalized", term_107);
      sink.start(_M_AddModule); sink.copy(term_44.ref()); sink.start(_M_MAINMODULE); sink.end();
      Variable var_20 = sink.context().makeVariable("ok");
      sink.binds(new Variable[] {var_20});
      sink.start(_M_NormalizeNextModule); sink.use(var_20);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Compile, term_44);
  } 
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.State.init(context); org.crsx.compiler.Normalizer.init(context); org.crsx.compiler.cg.Cgjava.init(context); org.crsx.compiler.std.Core.init(context); org.crsx.compiler.std.List.init(context); org.crsx.compiler.std.Text.init(context); context.register(_M_CompileSave); context.register(_M_CompileNormalized); context.register(_M_CompileModule); context.register(_M_CompileNextModule1); context.register(_M_CompileNextModule); context.register(_M_AddImport); context.register(_M_NormalizeDone1); context.register(_M_NormalizeDone); context.register(_M_NormalizeParsed); context.register(_M_NormalizeModuleLoad); context.register(_M_NormalizeModule); context.register(_M_NormalizeNextModule1); context.register(_M_NormalizeNextModule); context.register(_M_Compile);
      initialized = true;
    }
  }

/* END MODULE « "/Users/villardl/Projects/crsx/crsx4_2/src/crsx.crs.java" » */
}