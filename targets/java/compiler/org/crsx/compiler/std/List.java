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
  final public static DynamicFunctionDescriptor _M_Map = makeFunction("Map", List.class, "_M_Map");
  final public static DynamicFunctionDescriptor _M_Concat = makeFunction("Concat", List.class, "_M_Concat");
  final public static DynamicFunctionDescriptor _M_Tail = makeFunction("Tail", List.class, "_M_Tail");
  final public static DynamicFunctionDescriptor _M_Head = makeFunction("Head", List.class, "_M_Head");
  final public static DynamicFunctionDescriptor _M_IfSingleton = makeFunction("IfSingleton", List.class, "_M_IfSingleton");
  final public static DynamicFunctionDescriptor _M_IsSingleton = makeFunction("IsSingleton", List.class, "_M_IsSingleton");
  final public static DynamicFunctionDescriptor _M_IfEmpty = makeFunction("IfEmpty", List.class, "_M_IfEmpty");
  final public static DynamicFunctionDescriptor _M_IsEmpty = makeFunction("IsEmpty", List.class, "_M_IsEmpty");final public static boolean _M_SeqMap1(Sink sink, int shared, int depth, Properties props, Term term, Variable var, Variable var_99, Term term_63, Term term_74, Variable var_125, Term term_190) {
    if (depth < 2000) {
      label: {
        if (term.descriptor() != _M_OK)
        {   break label;
        }
        /* #=term */
        if (term_74.descriptor() != _M__sNil)
        {   break label;
        }
        /* #done=term *//*Contract*/sink.properties(safeRef(props));Term term_72;
        {
          BufferSink buf = sink.context().makeBuffer(); buf.start(_M_OK); buf.end();
          term_72 = buf.term();
        }
        sink.substitute(term_190.ref(), new Variable[] { var_125 }, new Term[] {term_72}); return true;
      }
      label_20: {
        if (term.descriptor() != _M_OK)
        {   break label_20;
        }
        /* #=term */
        if (term_74.descriptor() != _M__sCons)
        {   break label_20;
        }Term sub = term_74.sub(0).ref();
        /* #1=sub */Term sub_61 = term_74.sub(1).ref();
        /* #s=sub */
        /* #done=term *//*Contract*/sink.properties(safeRef(props));Term term_43;
        {
          BufferSink buf_10 = sink.context().makeBuffer(); buf_10.copy(sub.ref());
          term_43 = buf_10.term();
        }Term term_24;
        {
          BufferSink buf_6 = sink.context().makeBuffer();
          buf_6.start(_M_CONTINUATION);
          Variable var_40 = buf_6.context().makeVariable("ok");
          buf_6.binds(new Variable[] {var_40});
          buf_6.start(_M_SeqMap1); buf_6.use(var_40);
          Variable var_91 = buf_6.context().makeVariable("x");
          Variable var_5 = buf_6.context().makeVariable("c");
          buf_6.binds(new Variable[] {var_91,var_5});
          VariableUse use = buf_6.context().makeVariableUse(var_91);
          VariableUse use_15 = buf_6.context().makeVariableUse(var_5);
          buf_6.substitute(term_63.ref(), new Variable[] { var, var_99 }, new Term[] {use, use_15}); buf_6.copy(sub_61.ref());
          Variable var_93 = buf_6.context().makeVariable("ok");
          buf_6.binds(new Variable[] {var_93});
          VariableUse use_31 = buf_6.context().makeVariableUse(var_93);
          buf_6.substitute(term_190.ref(), new Variable[] { var_125 }, new Term[] {use_31});
          buf_6.end();
          buf_6.end();
          term_24 = buf_6.term();
        }
        sink.substitute(term_63.ref(), new Variable[] { var, var_99 }, new Term[] {term_43, term_24}); return true;
      }
    }
    return thunk(sink, _M_SeqMap1, props, term, var, var_99, term_63, term_74, var_125, term_190);
  }       final public static boolean _M_SeqMap(Sink sink, int shared, int depth, Properties props_23, Variable var_65, Variable var_35, Term term_66, Term term_11, Variable var_71, Term term_98) {
    if (depth < 2000) {
      label_41: {
        /* #=term */
        /* #list=term */
        /* #done=term *//*Contract*/sink.properties(safeRef(props_23));
        sink.start(_M_SeqMap1); sink.start(_M_OK); sink.end();
        Variable var_154 = sink.context().makeVariable("x");
        Variable var_28 = sink.context().makeVariable("c");
        sink.binds(new Variable[] {var_154,var_28});
        VariableUse use_73 = sink.context().makeVariableUse(var_154);
        VariableUse use_80 = sink.context().makeVariableUse(var_28);
        sink.substitute(term_66.ref(), new Variable[] { var_65, var_35 }, new Term[] {use_73, use_80}); sink.copy(term_11.ref());
        Variable var_23 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_23});
        VariableUse use_84 = sink.context().makeVariableUse(var_23);
        sink.substitute(term_98.ref(), new Variable[] { var_71 }, new Term[] {use_84});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_SeqMap, props_23, var_65, var_35, term_66, term_11, var_71, term_98);
  }      final public static boolean _M_Map(Sink sink, int shared, int depth, Variable var_82, Term term_37, Term term_46) {
    if (depth < 2000) {
      label_15: {
        /* #=term */
        if (term_46.descriptor() != _M__sNil)
        {   break label_15;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_7: {
        /* #=term */
        if (term_46.descriptor() != _M__sCons)
        {   break label_7;
        }Term sub_71 = term_46.sub(0).ref();
        /* #1=sub */Term sub_14 = term_46.sub(1).ref();
        /* #s=sub *//*Contract*/
        sink.start(_M__sCons);Term term_128;
        {
          BufferSink buf_21 = sink.context().makeBuffer(); buf_21.copy(sub_71.ref());
          term_128 = buf_21.term();
        }
        sink.substitute(term_37.ref(), new Variable[] { var_82 }, new Term[] {term_128});
        sink.start(_M_Map);
        Variable var_54 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_54});
        VariableUse use_14 = sink.context().makeVariableUse(var_54);
        sink.substitute(term_37.ref(), new Variable[] { var_82 }, new Term[] {use_14}); sink.copy(sub_14.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Map, var_82, term_37, term_46);
  }   final public static boolean _M_Concat(Sink sink, int shared, int depth, Term term_25, Term term_14) {
    if (depth < 2000) {
      label_79: {
        if (term_25.descriptor() != _M__sNil)
        {   break label_79;
        }
        /* #tail=term *//*Contract*/ sink.copy(term_14.ref()); return true;
      }
      label_56: {
        if (term_25.descriptor() != _M__sCons)
        {   break label_56;
        }Term sub_49 = term_25.sub(0).ref();
        /* #1=sub */Term sub_50 = term_25.sub(1).ref();
        /* #s=sub */
        /* #tail=term *//*Contract*/
        sink.start(_M__sCons); sink.copy(sub_49.ref());
        sink.start(_M_Concat); sink.copy(sub_50.ref()); sink.copy(term_14.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Concat, term_25, term_14);
  }  final public static boolean _M_Tail(Sink sink, int shared, int depth, Term term_6) {
    if (depth < 2000) {
      label_93: {
        if (term_6.descriptor() != _M__sCons)
        {   break label_93;
        }Term sub_74 = term_6.sub(0).ref();
        /* #=sub */Term sub_58 = term_6.sub(1).ref(); /* #s=sub *//*Contract*/ sink.copy(sub_58.ref()); return true;
      }
      label_1: {
        if (term_6.descriptor() != _M__sNil)
        {   break label_1;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end(); sink.literal("Tail of empty list");
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Tail, term_6);
  } final public static boolean _M_Head(Sink sink, int shared, int depth, Term term_64) {
    if (depth < 2000) {
      label_6: {
        if (term_64.descriptor() != _M__sCons)
        {   break label_6;
        }Term sub_73 = term_64.sub(0).ref();
        /* #=sub */Term sub_46 = term_64.sub(1).ref(); /* #s=sub *//*Contract*/ sink.copy(sub_73.ref()); return true;
      }
      label_33: {
        if (term_64.descriptor() != _M__sNil)
        {   break label_33;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end(); sink.literal("Head of empty list");
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Head, term_64);
  } final public static boolean _M_IfSingleton(Sink sink, int shared, int depth, Term term_89, Term term_34, Term term_31) {
    if (depth < 2000) {
      label_106: {
        if (term_89.descriptor() != _M__sNil)
        {   break label_106;
        }
        /* #1=term */
        /* #2=term *//*Contract*/ sink.copy(term_31.ref()); return true;
      }
      label_50: {
        if (term_89.descriptor() != _M__sCons)
        {   break label_50;
        }Term sub_64 = term_89.sub(0).ref();
        /* #=sub */Term sub_15 = term_89.sub(1).ref();
        /* #s=sub */
        /* #1=term */
        /* #2=term *//*Contract*/
        sink.start(_M_IfEmpty); sink.copy(sub_15.ref()); sink.copy(term_34.ref()); sink.copy(term_31.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_IfSingleton, term_89, term_34, term_31);
  }   final public static boolean _M_IsSingleton(Sink sink, int shared, int depth, Term term_88) {
    if (depth < 2000) {
      label_49: {
        if (term_88.descriptor() != _M__sNil)
        {   break label_49;
        }/*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
      label_44: {
        if (term_88.descriptor() != _M__sCons)
        {   break label_44;
        }Term sub_198 = term_88.sub(0).ref();
        /* #=sub */Term sub_25 = term_88.sub(1).ref();
        /* #s=sub *//*Contract*/
        sink.start(_M_IsEmpty); sink.copy(sub_25.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_IsSingleton, term_88);
  } final public static boolean _M_IfEmpty(Sink sink, int shared, int depth, Term term_85, Term term_35, Term term_78) {
    if (depth < 2000) {
      label_22: {
        if (term_85.descriptor() != _M__sNil)
        {   break label_22;
        }
        /* #1=term */
        /* #2=term *//*Contract*/ sink.copy(term_35.ref()); return true;
      }
      label_80: {
        if (term_85.descriptor() != _M__sCons)
        {   break label_80;
        }Term sub_88 = term_85.sub(0).ref();
        /* #=sub */Term sub_56 = term_85.sub(1).ref();
        /* #s=sub */
        /* #1=term */
        /* #2=term *//*Contract*/ sink.copy(term_78.ref()); return true;
      }
    }
    return thunk(sink, _M_IfEmpty, term_85, term_35, term_78);
  }   final public static boolean _M_IsEmpty(Sink sink, int shared, int depth, Term term_8) {
    if (depth < 2000) {
      label_63: {
        if (term_8.descriptor() != _M__sNil)
        {   break label_63;
        }/*Contract*/ sink.start(_M_TRUE); sink.end(); return true;
      }
      label_8: {
        if (term_8.descriptor() != _M__sCons)
        {   break label_8;
        }Term sub_6 = term_8.sub(0).ref();
        /* #=sub */Term sub_43 = term_8.sub(1).ref();
        /* #s=sub *//*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_IsEmpty, term_8);
  } 
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.std.Core.init(context); context.register(_M_CONTINUATION); context.register(_M_SeqMap1); context.register(_M_SeqMap); context.register(_M_Map); context.register(_M_Concat); context.register(_M_Tail); context.register(_M_Head); context.register(_M_IfSingleton); context.register(_M_IsSingleton); context.register(_M_IfEmpty); context.register(_M_IsEmpty);
      initialized = true;
    }
  }

/* END MODULE « "/Users/villardl/Projects/crsx/crsx4/src/std/list.crs.java" » */
}