/* START MODULE /Users/villardl/Projects/crsx/crsx4/src/std/list.crs.java */
/** Generated File */package org.crsx.compiler.std;
import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;
import static org.crsx.runtime.Normalizer.force;
import static org.crsx.runtime.Reference.safeRef;

import org.crsx.runtime.*;
import org.crsx.runtime.ConstructionDescriptor.*;
import static org.crsx.runtime.Primitives.*; import static org.crsx.compiler.std.Core.*;

public class List
{
  final public static ConstructionDescriptor _M_CONTINUATION = makeData("CONTINUATION");
  final public static DynamicFunctionDescriptor _M_SeqMap1 = makeFunction("SeqMap1", List.class, "_M_SeqMap1");
  final public static DynamicFunctionDescriptor _M_SeqMap = makeFunction("SeqMap", List.class, "_M_SeqMap");
  final public static DynamicFunctionDescriptor _M_Fold = makeFunction("Fold", List.class, "_M_Fold");
  final public static DynamicFunctionDescriptor _M_Map = makeFunction("Map", List.class, "_M_Map");
  final public static DynamicFunctionDescriptor _M_Concat = makeFunction("Concat", List.class, "_M_Concat");
  final public static DynamicFunctionDescriptor _M_Tail = makeFunction("Tail", List.class, "_M_Tail");
  final public static DynamicFunctionDescriptor _M_Head = makeFunction("Head", List.class, "_M_Head");
  final public static DynamicFunctionDescriptor _M_IfSingleton = makeFunction("IfSingleton", List.class, "_M_IfSingleton");
  final public static DynamicFunctionDescriptor _M_IsSingleton = makeFunction("IsSingleton", List.class, "_M_IsSingleton");
  final public static DynamicFunctionDescriptor _M_IfEmpty = makeFunction("IfEmpty", List.class, "_M_IfEmpty");
  final public static DynamicFunctionDescriptor _M_IsEmpty = makeFunction("IsEmpty", List.class, "_M_IsEmpty");final public static boolean _M_SeqMap1(Sink sink, int shared, int depth, Properties props, Term term, Variable var, Variable var_36, Term term_28, Term term_37, Variable var_8, Term term_76) {
    if (depth < 2000) {
      label: {
        if (term.descriptor() != _M_OK)
        {   break label;
        }
        /* #=term */
        if (term_37.descriptor() != _M__sNil)
        {   break label;
        }
        /* #done=term *//*Contract*/sink.properties(safeRef(props));Term term_72;
        {
          BufferSink buf = sink.context().makeBuffer(); buf.start(_M_OK); buf.end();
          term_72 = buf.term();
        }
        sink.substitute(term_76.ref(), new Variable[] { var_8 }, new Term[] {term_72}); return true;
      }
      label_32: {
        if (term.descriptor() != _M_OK)
        {   break label_32;
        }
        /* #=term */
        if (term_37.descriptor() != _M__sCons)
        {   break label_32;
        }Term sub = term_37.sub(0).ref();
        /* #1=sub */Term sub_6 = term_37.sub(1).ref();
        /* #s=sub */
        /* #done=term *//*Contract*/sink.properties(safeRef(props));Term term_52;
        {
          BufferSink buf_39 = sink.context().makeBuffer(); buf_39.copy(sub.ref());
          term_52 = buf_39.term();
        }Term term_97;
        {
          BufferSink buf_13 = sink.context().makeBuffer();
          buf_13.start(_M_CONTINUATION);
          Variable var_2 = buf_13.context().makeVariable("ok");
          buf_13.binds(new Variable[] {var_2});
          buf_13.start(_M_SeqMap1); buf_13.use(var_2);
          Variable var_68 = buf_13.context().makeVariable("x");
          Variable var_21 = buf_13.context().makeVariable("c");
          buf_13.binds(new Variable[] {var_68,var_21});
          VariableUse use = buf_13.context().makeVariableUse(var_68);
          VariableUse use_67 = buf_13.context().makeVariableUse(var_21);
          buf_13.substitute(term_28.ref(), new Variable[] { var, var_36 }, new Term[] {use, use_67}); buf_13.copy(sub_6.ref());
          Variable var_65 = buf_13.context().makeVariable("ok");
          buf_13.binds(new Variable[] {var_65});
          VariableUse use_81 = buf_13.context().makeVariableUse(var_65);
          buf_13.substitute(term_76.ref(), new Variable[] { var_8 }, new Term[] {use_81});
          buf_13.end();
          buf_13.end();
          term_97 = buf_13.term();
        }
        sink.substitute(term_28.ref(), new Variable[] { var, var_36 }, new Term[] {term_52, term_97}); return true;
      }
    }
    return thunk(sink, _M_SeqMap1, props, term, var, var_36, term_28, term_37, var_8, term_76);
  }       final public static boolean _M_SeqMap(Sink sink, int shared, int depth, Properties props_76, Variable var_20, Variable var_78, Term term_25, Term term_88, Variable var_55, Term term_4) {
    if (depth < 2000) {
      label_62: {
        /* #=term */
        /* #list=term */
        /* #done=term *//*Contract*/sink.properties(safeRef(props_76));
        sink.start(_M_SeqMap1); sink.start(_M_OK); sink.end();
        Variable var_81 = sink.context().makeVariable("x");
        Variable var_96 = sink.context().makeVariable("c");
        sink.binds(new Variable[] {var_81,var_96});
        VariableUse use_86 = sink.context().makeVariableUse(var_81);
        VariableUse use_25 = sink.context().makeVariableUse(var_96);
        sink.substitute(term_25.ref(), new Variable[] { var_20, var_78 }, new Term[] {use_86, use_25}); sink.copy(term_88.ref());
        Variable var_149 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_149});
        VariableUse use_51 = sink.context().makeVariableUse(var_149);
        sink.substitute(term_4.ref(), new Variable[] { var_55 }, new Term[] {use_51});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_SeqMap, props_76, var_20, var_78, term_25, term_88, var_55, term_4);
  }      final public static boolean _M_Fold(Sink sink, int shared, int depth, Variable var_61, Variable var_52, Term term_1, Term term_26, Term term_6) {
    if (depth < 2000) {
      label_87: {
        /* #=term */
        /* #x=term */
        if (term_6.descriptor() != _M__sNil)
        {   break label_87;
        }/*Contract*/ sink.copy(term_26.ref()); return true;
      }
      label_33: {
        /* #=term */
        /* #x=term */
        if (term_6.descriptor() != _M__sCons)
        {   break label_33;
        }Term sub_5 = term_6.sub(0).ref();
        /* #1=sub */Term sub_41 = term_6.sub(1).ref();
        /* #s=sub *//*Contract*/
        sink.start(_M_Fold);
        Variable var_0 = sink.context().makeVariable("x");
        Variable var_13 = sink.context().makeVariable("y");
        sink.binds(new Variable[] {var_0,var_13});
        VariableUse use_84 = sink.context().makeVariableUse(var_0);
        VariableUse use_17 = sink.context().makeVariableUse(var_13);
        sink.substitute(term_1.ref(), new Variable[] { var_61, var_52 }, new Term[] {use_84, use_17});Term term_61;
        {
          BufferSink buf_87 = sink.context().makeBuffer(); buf_87.copy(term_26.ref());
          term_61 = buf_87.term();
        }Term term_87;
        {
          BufferSink buf_98 = sink.context().makeBuffer(); buf_98.copy(sub_5.ref());
          term_87 = buf_98.term();
        }
        sink.substitute(term_1.ref(), new Variable[] { var_61, var_52 }, new Term[] {term_61, term_87}); sink.copy(sub_41.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Fold, var_61, var_52, term_1, term_26, term_6);
  }     final public static boolean _M_Map(Sink sink, int shared, int depth, Variable var_10, Term term_19, Term term_41) {
    if (depth < 2000) {
      label_10: {
        /* #=term */
        if (term_41.descriptor() != _M__sNil)
        {   break label_10;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_47: {
        /* #=term */
        if (term_41.descriptor() != _M__sCons)
        {   break label_47;
        }Term sub_13 = term_41.sub(0).ref();
        /* #1=sub */Term sub_93 = term_41.sub(1).ref();
        /* #s=sub *//*Contract*/
        sink.start(_M__sCons);Term term_54;
        {
          BufferSink buf_93 = sink.context().makeBuffer(); buf_93.copy(sub_13.ref());
          term_54 = buf_93.term();
        }
        sink.substitute(term_19.ref(), new Variable[] { var_10 }, new Term[] {term_54});
        sink.start(_M_Map);
        Variable var_1 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_1});
        VariableUse use_28 = sink.context().makeVariableUse(var_1);
        sink.substitute(term_19.ref(), new Variable[] { var_10 }, new Term[] {use_28}); sink.copy(sub_93.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Map, var_10, term_19, term_41);
  }   final public static boolean _M_Concat(Sink sink, int shared, int depth, Term term_99, Term term_70) {
    if (depth < 2000) {
      label_56: {
        if (term_99.descriptor() != _M__sNil)
        {   break label_56;
        }
        /* #tail=term *//*Contract*/ sink.copy(term_70.ref()); return true;
      }
      label_29: {
        if (term_99.descriptor() != _M__sCons)
        {   break label_29;
        }Term sub_21 = term_99.sub(0).ref();
        /* #1=sub */Term sub_43 = term_99.sub(1).ref();
        /* #s=sub */
        /* #tail=term *//*Contract*/
        sink.start(_M__sCons); sink.copy(sub_21.ref());
        sink.start(_M_Concat); sink.copy(sub_43.ref()); sink.copy(term_70.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Concat, term_99, term_70);
  }  final public static boolean _M_Tail(Sink sink, int shared, int depth, Term term_71) {
    if (depth < 2000) {
      label_92: {
        if (term_71.descriptor() != _M__sCons)
        {   break label_92;
        }Term sub_22 = term_71.sub(0).ref();
        /* #=sub */Term sub_90 = term_71.sub(1).ref(); /* #s=sub *//*Contract*/ sink.copy(sub_90.ref()); return true;
      }
      label_16: {
        if (term_71.descriptor() != _M__sNil)
        {   break label_16;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end(); sink.literal("Tail of empty list");
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Tail, term_71);
  } final public static boolean _M_Head(Sink sink, int shared, int depth, Term term_57) {
    if (depth < 2000) {
      label_60: {
        if (term_57.descriptor() != _M__sCons)
        {   break label_60;
        }Term sub_23 = term_57.sub(0).ref();
        /* #=sub */Term sub_96 = term_57.sub(1).ref(); /* #s=sub *//*Contract*/ sink.copy(sub_23.ref()); return true;
      }
      label_68: {
        if (term_57.descriptor() != _M__sNil)
        {   break label_68;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end(); sink.literal("Head of empty list");
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Head, term_57);
  } final public static boolean _M_IfSingleton(Sink sink, int shared, int depth, Term term_7, Term term_0, Term term_89) {
    if (depth < 2000) {
      label_132: {
        if (term_7.descriptor() != _M__sNil)
        {   break label_132;
        }
        /* #1=term */
        /* #2=term *//*Contract*/ sink.copy(term_89.ref()); return true;
      }
      label_36: {
        if (term_7.descriptor() != _M__sCons)
        {   break label_36;
        }Term sub_84 = term_7.sub(0).ref();
        /* #=sub */Term sub_161 = term_7.sub(1).ref();
        /* #s=sub */
        /* #1=term */
        /* #2=term *//*Contract*/
        sink.start(_M_IfEmpty); sink.copy(sub_161.ref()); sink.copy(term_0.ref()); sink.copy(term_89.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_IfSingleton, term_7, term_0, term_89);
  }   final public static boolean _M_IsSingleton(Sink sink, int shared, int depth, Term term_11) {
    if (depth < 2000) {
      label_23: {
        if (term_11.descriptor() != _M__sNil)
        {   break label_23;
        }/*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
      label_25: {
        if (term_11.descriptor() != _M__sCons)
        {   break label_25;
        }Term sub_10 = term_11.sub(0).ref();
        /* #=sub */Term sub_88 = term_11.sub(1).ref();
        /* #s=sub *//*Contract*/
        sink.start(_M_IsEmpty); sink.copy(sub_88.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_IsSingleton, term_11);
  } final public static boolean _M_IfEmpty(Sink sink, int shared, int depth, Term term_84, Term term_63, Term term_182) {
    if (depth < 2000) {
      label_30: {
        if (term_84.descriptor() != _M__sNil)
        {   break label_30;
        }
        /* #1=term */
        /* #2=term *//*Contract*/ sink.copy(term_63.ref()); return true;
      }
      label_31: {
        if (term_84.descriptor() != _M__sCons)
        {   break label_31;
        }Term sub_55 = term_84.sub(0).ref();
        /* #=sub */Term sub_97 = term_84.sub(1).ref();
        /* #s=sub */
        /* #1=term */
        /* #2=term *//*Contract*/ sink.copy(term_182.ref()); return true;
      }
    }
    return thunk(sink, _M_IfEmpty, term_84, term_63, term_182);
  }   final public static boolean _M_IsEmpty(Sink sink, int shared, int depth, Term term_8) {
    if (depth < 2000) {
      label_85: {
        if (term_8.descriptor() != _M__sNil)
        {   break label_85;
        }/*Contract*/ sink.start(_M_TRUE); sink.end(); return true;
      }
      label_91: {
        if (term_8.descriptor() != _M__sCons)
        {   break label_91;
        }Term sub_42 = term_8.sub(0).ref();
        /* #=sub */Term sub_82 = term_8.sub(1).ref();
        /* #s=sub *//*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_IsEmpty, term_8);
  } 
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.std.Core.init(context); context.register(_M_CONTINUATION); context.register(_M_SeqMap1); context.register(_M_SeqMap); context.register(_M_Fold); context.register(_M_Map); context.register(_M_Concat); context.register(_M_Tail); context.register(_M_Head); context.register(_M_IfSingleton); context.register(_M_IsSingleton); context.register(_M_IfEmpty); context.register(_M_IsEmpty);
      initialized = true;
    }
  }

/* END MODULE « "/Users/villardl/Projects/crsx/crsx4/src/std/list.crs.java" » */
}