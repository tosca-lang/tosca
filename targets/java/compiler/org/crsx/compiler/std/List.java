/* START MODULE /Users/villardl/Projects/crsx/crsx4/src/std/list.crs.java */
/** Generated File */package org.crsx.compiler.std;
import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;
import static org.crsx.runtime.Normalizer.force;
import static org.crsx.runtime.Normalizer.forceSub;
import static org.crsx.runtime.Reference.safeRef;

import org.crsx.runtime.*;
import org.crsx.runtime.ConstructionDescriptor.*;
import static org.crsx.runtime.Primitives.*; import static org.crsx.compiler.std.Core.*;

public class List
{
  final public static ConstructionDescriptor _M_CONTINUATION = makeData("CONTINUATION");
  final public static DynamicFunctionDescriptor _M_ThenSeqMap = makeFunction("ThenSeqMap", List.class, "_M_ThenSeqMap");
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
  final public static DynamicFunctionDescriptor _M_IsEmpty = makeFunction("IsEmpty", List.class, "_M_IsEmpty");final public static boolean _M_ThenSeqMap(Sink sink, int shared, int depth, Properties props, Term term, Variable var, Variable var_26, Term term_24, Term term_33, Variable var_89, Term term_48) {
    if (depth < 2000) {
      label: {
        term = force(sink.context(), term);
        if (term.descriptor() != _M_OK)
        {   break label;
        }
        /* #=term */
        /* #list=term */
        /* #done=term *//*Contract*/sink.properties(safeRef(props));
        sink.start(_M_SeqMap);
        Variable var_54 = sink.context().makeVariable("x");
        Variable var_99 = sink.context().makeVariable("c");
        sink.binds(new Variable[] {var_54,var_99});
        VariableUse use = sink.context().makeVariableUse(var_54);
        VariableUse use_34 = sink.context().makeVariableUse(var_99);
        sink.substitute(term_24.ref(), new Variable[] { var, var_26 }, new Term[] {use, use_34}); sink.copy(term_33.ref());
        Variable var_38 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_38});
        VariableUse use_96 = sink.context().makeVariableUse(var_38);
        sink.substitute(term_48.ref(), new Variable[] { var_89 }, new Term[] {use_96});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ThenSeqMap, props, term, var, var_26, term_24, term_33, var_89, term_48);
  }       final public static boolean _M_SeqMap1(Sink sink, int shared, int depth, Properties props_10, Term term_17, Variable var_70, Variable var_17, Term term_77, Term term_31, Variable var_92, Term term_35) {
    if (depth < 2000) {
      label_41: {
        term_17 = force(sink.context(), term_17);
        if (term_17.descriptor() != _M_OK)
        {   break label_41;
        }
        /* #=term */
        term_31 = force(sink.context(), term_31);
        if (term_31.descriptor() != _M__sNil)
        {   break label_41;
        }
        /* #done=term *//*Contract*/sink.properties(safeRef(props_10));Term term_82;
        {
          BufferSink buf = sink.context().makeBuffer(); buf.start(_M_OK); buf.end();
          term_82 = buf.term();
        }
        sink.substitute(term_35.ref(), new Variable[] { var_92 }, new Term[] {term_82}); return true;
      }
      label_30: {
        term_17 = force(sink.context(), term_17);
        if (term_17.descriptor() != _M_OK)
        {   break label_30;
        }
        /* #=term */
        term_31 = force(sink.context(), term_31);
        if (term_31.descriptor() != _M__sCons)
        {   break label_30;
        }Term sub = forceSub(sink.context(), term_31, 0).ref();
        /* #1=sub */Term sub_76 = forceSub(sink.context(), term_31, 1).ref();
        /* #s=sub */
        /* #done=term *//*Contract*/sink.properties(safeRef(props_10));Term term_78;
        {
          BufferSink buf_8 = sink.context().makeBuffer(); buf_8.copy(sub.ref());
          term_78 = buf_8.term();
        }Term term_8;
        {
          BufferSink buf_1 = sink.context().makeBuffer();
          buf_1.start(_M_CONTINUATION);
          Variable var_82 = buf_1.context().makeVariable("ok");
          buf_1.binds(new Variable[] {var_82});
          buf_1.start(_M_SeqMap1); buf_1.use(var_82);
          Variable var_27 = buf_1.context().makeVariable("x");
          Variable var_10 = buf_1.context().makeVariable("c");
          buf_1.binds(new Variable[] {var_27,var_10});
          VariableUse use_58 = buf_1.context().makeVariableUse(var_27);
          VariableUse use_62 = buf_1.context().makeVariableUse(var_10);
          buf_1.substitute(term_77.ref(), new Variable[] { var_70, var_17 }, new Term[] {use_58, use_62}); buf_1.copy(sub_76.ref());
          Variable var_160 = buf_1.context().makeVariable("ok");
          buf_1.binds(new Variable[] {var_160});
          VariableUse use_85 = buf_1.context().makeVariableUse(var_160);
          buf_1.substitute(term_35.ref(), new Variable[] { var_92 }, new Term[] {use_85});
          buf_1.end();
          buf_1.end();
          term_8 = buf_1.term();
        }
        sink.substitute(term_77.ref(), new Variable[] { var_70, var_17 }, new Term[] {term_78, term_8}); return true;
      }
    }
    return thunk(sink, _M_SeqMap1, props_10, term_17, var_70, var_17, term_77, term_31, var_92, term_35);
  }       final public static boolean _M_SeqMap(Sink sink, int shared, int depth, Properties props_41, Variable var_8, Variable var_96, Term term_56, Term term_37, Variable var_11, Term term_9) {
    if (depth < 2000) {
      label_22: {
        /* #=term */
        /* #list=term */
        /* #done=term *//*Contract*/sink.properties(safeRef(props_41));
        sink.start(_M_SeqMap1); sink.start(_M_OK); sink.end();
        Variable var_50 = sink.context().makeVariable("x");
        Variable var_64 = sink.context().makeVariable("c");
        sink.binds(new Variable[] {var_50,var_64});
        VariableUse use_53 = sink.context().makeVariableUse(var_50);
        VariableUse use_99 = sink.context().makeVariableUse(var_64);
        sink.substitute(term_56.ref(), new Variable[] { var_8, var_96 }, new Term[] {use_53, use_99}); sink.copy(term_37.ref());
        Variable var_90 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_90});
        VariableUse use_59 = sink.context().makeVariableUse(var_90);
        sink.substitute(term_9.ref(), new Variable[] { var_11 }, new Term[] {use_59});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_SeqMap, props_41, var_8, var_96, term_56, term_37, var_11, term_9);
  }      final public static boolean _M_Fold(Sink sink, int shared, int depth, Variable var_7, Variable var_55, Term term_46, Term term_80, Term term_61) {
    if (depth < 2000) {
      label_2: {
        /* #=term */
        /* #x=term */
        term_61 = force(sink.context(), term_61);
        if (term_61.descriptor() != _M__sNil)
        {   break label_2;
        }/*Contract*/ sink.copy(term_80.ref()); return true;
      }
      label_72: {
        /* #=term */
        /* #x=term */
        term_61 = force(sink.context(), term_61);
        if (term_61.descriptor() != _M__sCons)
        {   break label_72;
        }Term sub_92 = forceSub(sink.context(), term_61, 0).ref();
        /* #1=sub */Term sub_83 = forceSub(sink.context(), term_61, 1).ref();
        /* #s=sub *//*Contract*/
        sink.start(_M_Fold);
        Variable var_52 = sink.context().makeVariable("x");
        Variable var_68 = sink.context().makeVariable("y");
        sink.binds(new Variable[] {var_52,var_68});
        VariableUse use_30 = sink.context().makeVariableUse(var_52);
        VariableUse use_57 = sink.context().makeVariableUse(var_68);
        sink.substitute(term_46.ref(), new Variable[] { var_7, var_55 }, new Term[] {use_30, use_57});Term term_36;
        {
          BufferSink buf_10 = sink.context().makeBuffer(); buf_10.copy(term_80.ref());
          term_36 = buf_10.term();
        }Term term_13;
        {
          BufferSink buf_13 = sink.context().makeBuffer(); buf_13.copy(sub_92.ref());
          term_13 = buf_13.term();
        }
        sink.substitute(term_46.ref(), new Variable[] { var_7, var_55 }, new Term[] {term_36, term_13}); sink.copy(sub_83.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Fold, var_7, var_55, term_46, term_80, term_61);
  }     final public static boolean _M_Map(Sink sink, int shared, int depth, Variable var_107, Term term_40, Term term_47) {
    if (depth < 2000) {
      label_91: {
        /* #=term */
        term_47 = force(sink.context(), term_47);
        if (term_47.descriptor() != _M__sNil)
        {   break label_91;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_75: {
        /* #=term */
        term_47 = force(sink.context(), term_47);
        if (term_47.descriptor() != _M__sCons)
        {   break label_75;
        }Term sub_6 = forceSub(sink.context(), term_47, 0).ref();
        /* #1=sub */Term sub_47 = forceSub(sink.context(), term_47, 1).ref();
        /* #s=sub *//*Contract*/
        sink.start(_M__sCons);Term term_14;
        {
          BufferSink buf_97 = sink.context().makeBuffer(); buf_97.copy(sub_6.ref());
          term_14 = buf_97.term();
        }
        sink.substitute(term_40.ref(), new Variable[] { var_107 }, new Term[] {term_14});
        sink.start(_M_Map);
        Variable var_78 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_78});
        VariableUse use_36 = sink.context().makeVariableUse(var_78);
        sink.substitute(term_40.ref(), new Variable[] { var_107 }, new Term[] {use_36}); sink.copy(sub_47.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Map, var_107, term_40, term_47);
  }   final public static boolean _M_Concat(Sink sink, int shared, int depth, Term term_93, Term term_94) {
    if (depth < 2000) {
      label_71: {
        term_93 = force(sink.context(), term_93);
        if (term_93.descriptor() != _M__sNil)
        {   break label_71;
        }
        /* #tail=term *//*Contract*/ sink.copy(term_94.ref()); return true;
      }
      label_97: {
        term_93 = force(sink.context(), term_93);
        if (term_93.descriptor() != _M__sCons)
        {   break label_97;
        }Term sub_2 = forceSub(sink.context(), term_93, 0).ref();
        /* #1=sub */Term sub_44 = forceSub(sink.context(), term_93, 1).ref();
        /* #s=sub */
        /* #tail=term *//*Contract*/
        sink.start(_M__sCons); sink.copy(sub_2.ref());
        sink.start(_M_Concat); sink.copy(sub_44.ref()); sink.copy(term_94.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Concat, term_93, term_94);
  }  final public static boolean _M_Tail(Sink sink, int shared, int depth, Term term_127) {
    if (depth < 2000) {
      label_51: {
        term_127 = force(sink.context(), term_127);
        if (term_127.descriptor() != _M__sCons)
        {   break label_51;
        }Term sub_11 = forceSub(sink.context(), term_127, 0).ref();
        /* #=sub */Term sub_89 = forceSub(sink.context(), term_127, 1).ref(); /* #s=sub *//*Contract*/ sink.copy(sub_89.ref()); return true;
      }
      label_24: {
        term_127 = force(sink.context(), term_127);
        if (term_127.descriptor() != _M__sNil)
        {   break label_24;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end(); sink.literal("Tail of empty list");
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Tail, term_127);
  } final public static boolean _M_Head(Sink sink, int shared, int depth, Term term_141) {
    if (depth < 2000) {
      label_78: {
        term_141 = force(sink.context(), term_141);
        if (term_141.descriptor() != _M__sCons)
        {   break label_78;
        }Term sub_73 = forceSub(sink.context(), term_141, 0).ref();
        /* #=sub */Term sub_86 = forceSub(sink.context(), term_141, 1).ref(); /* #s=sub *//*Contract*/ sink.copy(sub_73.ref()); return true;
      }
      label_6: {
        term_141 = force(sink.context(), term_141);
        if (term_141.descriptor() != _M__sNil)
        {   break label_6;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end(); sink.literal("Head of empty list");
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Head, term_141);
  } final public static boolean _M_IfSingleton(Sink sink, int shared, int depth, Term term_87, Term term_91, Term term_28) {
    if (depth < 2000) {
      label_44: {
        term_87 = force(sink.context(), term_87);
        if (term_87.descriptor() != _M__sNil)
        {   break label_44;
        }
        /* #1=term */
        /* #2=term *//*Contract*/ sink.copy(term_28.ref()); return true;
      }
      label_84: {
        term_87 = force(sink.context(), term_87);
        if (term_87.descriptor() != _M__sCons)
        {   break label_84;
        }Term sub_38 = forceSub(sink.context(), term_87, 0).ref();
        /* #=sub */Term sub_17 = forceSub(sink.context(), term_87, 1).ref();
        /* #s=sub */
        /* #1=term */
        /* #2=term *//*Contract*/
        sink.start(_M_IfEmpty); sink.copy(sub_17.ref()); sink.copy(term_91.ref()); sink.copy(term_28.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_IfSingleton, term_87, term_91, term_28);
  }   final public static boolean _M_IsSingleton(Sink sink, int shared, int depth, Term term_45) {
    if (depth < 2000) {
      label_43: {
        term_45 = force(sink.context(), term_45);
        if (term_45.descriptor() != _M__sNil)
        {   break label_43;
        }/*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
      label_67: {
        term_45 = force(sink.context(), term_45);
        if (term_45.descriptor() != _M__sCons)
        {   break label_67;
        }Term sub_61 = forceSub(sink.context(), term_45, 0).ref();
        /* #=sub */Term sub_16 = forceSub(sink.context(), term_45, 1).ref();
        /* #s=sub *//*Contract*/
        sink.start(_M_IsEmpty); sink.copy(sub_16.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_IsSingleton, term_45);
  } final public static boolean _M_IfEmpty(Sink sink, int shared, int depth, Term term_95, Term term_164, Term term_128) {
    if (depth < 2000) {
      label_42: {
        term_95 = force(sink.context(), term_95);
        if (term_95.descriptor() != _M__sNil)
        {   break label_42;
        }
        /* #1=term */
        /* #2=term *//*Contract*/ sink.copy(term_164.ref()); return true;
      }
      label_39: {
        term_95 = force(sink.context(), term_95);
        if (term_95.descriptor() != _M__sCons)
        {   break label_39;
        }Term sub_12 = forceSub(sink.context(), term_95, 0).ref();
        /* #=sub */Term sub_24 = forceSub(sink.context(), term_95, 1).ref();
        /* #s=sub */
        /* #1=term */
        /* #2=term *//*Contract*/ sink.copy(term_128.ref()); return true;
      }
    }
    return thunk(sink, _M_IfEmpty, term_95, term_164, term_128);
  }   final public static boolean _M_IsEmpty(Sink sink, int shared, int depth, Term term_176) {
    if (depth < 2000) {
      label_115: {
        term_176 = force(sink.context(), term_176);
        if (term_176.descriptor() != _M__sNil)
        {   break label_115;
        }/*Contract*/ sink.start(_M_TRUE); sink.end(); return true;
      }
      label_57: {
        term_176 = force(sink.context(), term_176);
        if (term_176.descriptor() != _M__sCons)
        {   break label_57;
        }Term sub_27 = forceSub(sink.context(), term_176, 0).ref();
        /* #=sub */Term sub_49 = forceSub(sink.context(), term_176, 1).ref();
        /* #s=sub *//*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_IsEmpty, term_176);
  } 
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.std.Core.init(context); context.register(_M_CONTINUATION); context.register(_M_ThenSeqMap); context.register(_M_SeqMap1); context.register(_M_SeqMap); context.register(_M_Fold); context.register(_M_Map); context.register(_M_Concat); context.register(_M_Tail); context.register(_M_Head); context.register(_M_IfSingleton); context.register(_M_IsSingleton); context.register(_M_IfEmpty); context.register(_M_IsEmpty);
      initialized = true;
    }
  }

/* END MODULE « "/Users/villardl/Projects/crsx/crsx4/src/std/list.crs.java" » */
}