/* START MODULE /Users/villardl/Projects/crsx/crsx4_2/src/std/list.crs.java */
/** Generated File */package org.crsx.compiler.std;
import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;
import static org.crsx.runtime.Normalizer.force;
import static org.crsx.runtime.Reference.safeRef;

import org.crsx.runtime.*;
import org.crsx.runtime.ConstructionDescriptor.*;
import static org.crsx.runtime.Primitives.*;
import static org.crsx.compiler.std.Core.*; import static org.crsx.compiler.std.Pair.*;

public class List
{
  final public static ConstructionDescriptor _M_CONTINUATION = makeData("CONTINUATION");
  final public static DynamicFunctionDescriptor _M_SeqMap1 = makeFunction("SeqMap1", List.class, "_M_SeqMap1");
  final public static DynamicFunctionDescriptor _M_SeqMap = makeFunction("SeqMap", List.class, "_M_SeqMap");
  final public static DynamicFunctionDescriptor _M_Fold = makeFunction("Fold", List.class, "_M_Fold");
  final public static DynamicFunctionDescriptor _M_Foldr = makeFunction("Foldr", List.class, "_M_Foldr");
  final public static DynamicFunctionDescriptor _M_FoldlP = makeFunction("FoldlP", List.class, "_M_FoldlP");
  final public static DynamicFunctionDescriptor _M_IWrapFoldlP = makeFunction("IWrapFoldlP", List.class, "_M_IWrapFoldlP");
  final public static DynamicFunctionDescriptor _M_Foldl = makeFunction("Foldl", List.class, "_M_Foldl");
  final public static DynamicFunctionDescriptor _M_Filter = makeFunction("Filter", List.class, "_M_Filter");
  final public static DynamicFunctionDescriptor _M_Map2 = makeFunction("Map2", List.class, "_M_Map2");
  final public static DynamicFunctionDescriptor _M_Map = makeFunction("Map", List.class, "_M_Map");
  final public static DynamicFunctionDescriptor _M_MatchPartition = makeFunction("MatchPartition", List.class, "_M_MatchPartition");
  final public static DynamicFunctionDescriptor _M_Partition = makeFunction("Partition", List.class, "_M_Partition");
  final public static DynamicFunctionDescriptor _M_DelEntry = makeFunction("DelEntry", List.class, "_M_DelEntry");
  final public static DynamicFunctionDescriptor _M_LookUp = makeFunction("LookUp", List.class, "_M_LookUp");
  final public static DynamicFunctionDescriptor _M_Zip = makeFunction("Zip", List.class, "_M_Zip");
  final public static DynamicFunctionDescriptor _M_Reverse = makeFunction("Reverse", List.class, "_M_Reverse");
  final public static DynamicFunctionDescriptor _M_Union = makeFunction("Union", List.class, "_M_Union");
  final public static DynamicFunctionDescriptor _M_Intersect = makeFunction("Intersect", List.class, "_M_Intersect");
  final public static DynamicFunctionDescriptor _M_Length = makeFunction("Length", List.class, "_M_Length");
  final public static DynamicFunctionDescriptor _M_RemoveDuplicates = makeFunction("RemoveDuplicates", List.class, "_M_RemoveDuplicates");
  final public static DynamicFunctionDescriptor _M_ContainsDuplicates = makeFunction("ContainsDuplicates", List.class, "_M_ContainsDuplicates");
  final public static DynamicFunctionDescriptor _M_ConditionalInsert = makeFunction("ConditionalInsert", List.class, "_M_ConditionalInsert");
  final public static DynamicFunctionDescriptor _M_ListEqual = makeFunction("ListEqual", List.class, "_M_ListEqual");
  final public static DynamicFunctionDescriptor _M_Insert = makeFunction("Insert", List.class, "_M_Insert");
  final public static DynamicFunctionDescriptor _M_Elem = makeFunction("Elem", List.class, "_M_Elem");
  final public static DynamicFunctionDescriptor _M_Concat = makeFunction("Concat", List.class, "_M_Concat");
  final public static DynamicFunctionDescriptor _M_Tail = makeFunction("Tail", List.class, "_M_Tail");
  final public static DynamicFunctionDescriptor _M_Head = makeFunction("Head", List.class, "_M_Head");
  final public static DynamicFunctionDescriptor _M_IfSingleton = makeFunction("IfSingleton", List.class, "_M_IfSingleton");
  final public static DynamicFunctionDescriptor _M_IsSingleton = makeFunction("IsSingleton", List.class, "_M_IsSingleton");
  final public static DynamicFunctionDescriptor _M_Null = makeFunction("Null", List.class, "_M_Null");
  final public static DynamicFunctionDescriptor _M_IfEmpty = makeFunction("IfEmpty", List.class, "_M_IfEmpty");
  final public static DynamicFunctionDescriptor _M_IsEmpty = makeFunction("IsEmpty", List.class, "_M_IsEmpty");final public static boolean _M_SeqMap1(Sink sink, int shared, int depth, Properties props, Term term, Variable var, Variable var_68, Term term_48, Term term_30, Variable var_88, Term term_20) {
    if (depth < 2000) {
      label: {
        if (term.descriptor() != _M_OK)
        {   break label;
        }
        /* #=term */
        if (term_30.descriptor() != _M__sNil)
        {   break label;
        }
        /* #done=term *//*Contract*/sink.properties(safeRef(props));Term term_7;
        {
          BufferSink buf = sink.context().makeBuffer(); buf.start(_M_OK); buf.end();
          term_7 = buf.term();
        }
        sink.substitute(term_20.ref(), new Variable[] { var_88 }, new Term[] {term_7}); return true;
      }
      label_83: {
        if (term.descriptor() != _M_OK)
        {   break label_83;
        }
        /* #=term */
        if (term_30.descriptor() != _M__sCons)
        {   break label_83;
        }Term sub = term_30.sub(0).ref();
        /* #1=sub */Term sub_68 = term_30.sub(1).ref();
        /* #s=sub */
        /* #done=term *//*Contract*/sink.properties(safeRef(props));Term term_83;
        {
          BufferSink buf_59 = sink.context().makeBuffer(); buf_59.copy(sub.ref());
          term_83 = buf_59.term();
        }Term term_16;
        {
          BufferSink buf_72 = sink.context().makeBuffer();
          buf_72.start(_M_CONTINUATION);
          Variable var_2 = buf_72.context().makeVariable("ok");
          buf_72.binds(new Variable[] {var_2});
          buf_72.start(_M_SeqMap1); buf_72.use(var_2);
          Variable var_87 = buf_72.context().makeVariable("x");
          Variable var_7 = buf_72.context().makeVariable("c");
          buf_72.binds(new Variable[] {var_87,var_7});
          VariableUse use = buf_72.context().makeVariableUse(var_87);
          VariableUse use_54 = buf_72.context().makeVariableUse(var_7);
          buf_72.substitute(term_48.ref(), new Variable[] { var, var_68 }, new Term[] {use, use_54}); buf_72.copy(sub_68.ref());
          Variable var_44 = buf_72.context().makeVariable("ok");
          buf_72.binds(new Variable[] {var_44});
          VariableUse use_35 = buf_72.context().makeVariableUse(var_44);
          buf_72.substitute(term_20.ref(), new Variable[] { var_88 }, new Term[] {use_35});
          buf_72.end();
          buf_72.end();
          term_16 = buf_72.term();
        }
        sink.substitute(term_48.ref(), new Variable[] { var, var_68 }, new Term[] {term_83, term_16}); return true;
      }
    }
    return thunk(sink, _M_SeqMap1, props, term, var, var_68, term_48, term_30, var_88, term_20);
  }       final public static boolean _M_SeqMap(Sink sink, int shared, int depth, Properties props_69, Variable var_11, Variable var_38, Term term_77, Term term_22, Variable var_15, Term term_171) {
    if (depth < 2000) {
      label_14: {
        /* #=term */
        /* #list=term */
        /* #done=term *//*Contract*/sink.properties(safeRef(props_69));
        sink.start(_M_SeqMap1); sink.start(_M_OK); sink.end();
        Variable var_90 = sink.context().makeVariable("x");
        Variable var_64 = sink.context().makeVariable("c");
        sink.binds(new Variable[] {var_90,var_64});
        VariableUse use_50 = sink.context().makeVariableUse(var_90);
        VariableUse use_42 = sink.context().makeVariableUse(var_64);
        sink.substitute(term_77.ref(), new Variable[] { var_11, var_38 }, new Term[] {use_50, use_42}); sink.copy(term_22.ref());
        Variable var_244 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_244});
        VariableUse use_96 = sink.context().makeVariableUse(var_244);
        sink.substitute(term_171.ref(), new Variable[] { var_15 }, new Term[] {use_96});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_SeqMap, props_69, var_11, var_38, term_77, term_22, var_15, term_171);
  }      final public static boolean _M_Fold(Sink sink, int shared, int depth, Variable var_27, Variable var_98, Term term_17, Term term_29, Term term_55) {
    if (depth < 2000) {
      label_47: {
        /* #=term */
        /* #x=term */
        if (term_55.descriptor() != _M__sNil)
        {   break label_47;
        }/*Contract*/ sink.copy(term_29.ref()); return true;
      }
      label_38: {
        /* #=term */
        /* #x=term */
        if (term_55.descriptor() != _M__sCons)
        {   break label_38;
        }Term sub_86 = term_55.sub(0).ref();
        /* #1=sub */Term sub_83 = term_55.sub(1).ref();
        /* #s=sub *//*Contract*/
        sink.start(_M_Fold);
        Variable var_21 = sink.context().makeVariable("x");
        Variable var_71 = sink.context().makeVariable("y");
        sink.binds(new Variable[] {var_21,var_71});
        VariableUse use_44 = sink.context().makeVariableUse(var_21);
        VariableUse use_64 = sink.context().makeVariableUse(var_71);
        sink.substitute(term_17.ref(), new Variable[] { var_27, var_98 }, new Term[] {use_44, use_64});Term term_72;
        {
          BufferSink buf_75 = sink.context().makeBuffer(); buf_75.copy(term_29.ref());
          term_72 = buf_75.term();
        }Term term_5;
        {
          BufferSink buf_93 = sink.context().makeBuffer(); buf_93.copy(sub_86.ref());
          term_5 = buf_93.term();
        }
        sink.substitute(term_17.ref(), new Variable[] { var_27, var_98 }, new Term[] {term_72, term_5}); sink.copy(sub_83.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Fold, var_27, var_98, term_17, term_29, term_55);
  }     final public static boolean _M_Foldr(Sink sink, int shared, int depth, Variable var_48, Variable var_16, Term term_35, Term term_96, Term term_34) {
    if (depth < 2000) {
      label_31: {
        /* #F=term */
        /* #Z=term */
        if (term_34.descriptor() != _M__sNil)
        {   break label_31;
        }/*Contract*/ sink.copy(term_96.ref()); return true;
      }
      label_12: {
        /* #F=term */
        /* #Z=term */
        if (term_34.descriptor() != _M__sCons)
        {   break label_12;
        }Term sub_32 = term_34.sub(0).ref();
        /* #H=sub */Term sub_99 = term_34.sub(1).ref();
        /* #T=sub *//*Contract*/Term term_28;
        {
          BufferSink buf_35 = sink.context().makeBuffer(); buf_35.copy(sub_32.ref());
          term_28 = buf_35.term();
        }Term term_19;
        {
          BufferSink buf_11 = sink.context().makeBuffer();
          buf_11.start(_M_Foldr);
          Variable var_18 = buf_11.context().makeVariable("x");
          Variable var_75 = buf_11.context().makeVariable("y");
          buf_11.binds(new Variable[] {var_18,var_75});
          VariableUse use_39 = buf_11.context().makeVariableUse(var_18);
          VariableUse use_1 = buf_11.context().makeVariableUse(var_75);
          buf_11.substitute(term_35.ref(), new Variable[] { var_48, var_16 }, new Term[] {use_39, use_1}); buf_11.copy(term_96.ref()); buf_11.copy(sub_99.ref());
          buf_11.end();
          term_19 = buf_11.term();
        }
        sink.substitute(term_35.ref(), new Variable[] { var_48, var_16 }, new Term[] {term_28, term_19}); return true;
      }
    }
    return thunk(sink, _M_Foldr, var_48, var_16, term_35, term_96, term_34);
  }     final public static boolean _M_FoldlP(Sink sink, int shared, int depth, Variable var_41, Variable var_31, Term term_180, Term term_44, Term term_6) {
    if (depth < 2000) {
      label_16: {
        /* #F=term */
        /* #Z=term */
        if (term_6.descriptor() != _M__sNil)
        {   break label_16;
        }/*Contract*/ sink.copy(term_44.ref()); return true;
      }
      label_65: {
        /* #F=term */
        /* #Z=term */
        if (term_6.descriptor() != _M__sCons)
        {   break label_65;
        }Term sub_10 = term_6.sub(0).ref();
        /* #H=sub */Term sub_25 = term_6.sub(1).ref();
        /* #T=sub *//*Contract*/
        sink.start(_M_FoldlP);
        Variable var_66 = sink.context().makeVariable("x");
        Variable var_95 = sink.context().makeVariable("y");
        sink.binds(new Variable[] {var_66,var_95});
        VariableUse use_25 = sink.context().makeVariableUse(var_66);
        VariableUse use_84 = sink.context().makeVariableUse(var_95);
        sink.substitute(term_180.ref(), new Variable[] { var_41, var_31 }, new Term[] {use_25, use_84});Term term_45;
        {
          BufferSink buf_60 = sink.context().makeBuffer(); buf_60.copy(sub_10.ref());
          term_45 = buf_60.term();
        }Term term_47;
        {
          BufferSink buf_17 = sink.context().makeBuffer(); buf_17.copy(term_44.ref());
          term_47 = buf_17.term();
        }
        sink.substitute(term_180.ref(), new Variable[] { var_41, var_31 }, new Term[] {term_45, term_47}); sink.copy(sub_25.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_FoldlP, var_41, var_31, term_180, term_44, term_6);
  }     final public static boolean _M_IWrapFoldlP(Sink sink, int shared, int depth, Variable var_5, Variable var_97, Term term_24, Term term_32, Term term_157) {
    if (depth < 2000) {
      label_91: {
        /* #F=term */
        /* #Z=term */
        /* #XS=term *//*Contract*/
        sink.start(_M_FoldlP);
        Variable var_73 = sink.context().makeVariable("x");
        Variable var_45 = sink.context().makeVariable("y");
        sink.binds(new Variable[] {var_73,var_45});
        VariableUse use_9 = sink.context().makeVariableUse(var_73);
        VariableUse use_45 = sink.context().makeVariableUse(var_45);
        sink.substitute(term_24.ref(), new Variable[] { var_5, var_97 }, new Term[] {use_9, use_45}); sink.copy(term_32.ref()); sink.copy(term_157.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_IWrapFoldlP, var_5, var_97, term_24, term_32, term_157);
  }     final public static boolean _M_Foldl(Sink sink, int shared, int depth, Variable var_32, Variable var_58, Term term_31, Term term_61, Term term_64) {
    if (depth < 2000) {
      label_70: {
        /* #F=term */
        /* #Z=term */
        if (term_64.descriptor() != _M__sNil)
        {   break label_70;
        }/*Contract*/ sink.copy(term_61.ref()); return true;
      }
      label_62: {
        /* #F=term */
        /* #Z=term */
        if (term_64.descriptor() != _M__sCons)
        {   break label_62;
        }Term sub_28 = term_64.sub(0).ref();
        /* #H=sub */Term sub_33 = term_64.sub(1).ref();
        /* #T=sub *//*Contract*/
        sink.start(_M_Foldl);
        Variable var_20 = sink.context().makeVariable("x");
        Variable var_39 = sink.context().makeVariable("y");
        sink.binds(new Variable[] {var_20,var_39});
        VariableUse use_86 = sink.context().makeVariableUse(var_20);
        VariableUse use_69 = sink.context().makeVariableUse(var_39);
        sink.substitute(term_31.ref(), new Variable[] { var_32, var_58 }, new Term[] {use_86, use_69});Term term_41;
        {
          BufferSink buf_6 = sink.context().makeBuffer(); buf_6.copy(sub_28.ref());
          term_41 = buf_6.term();
        }Term term_160;
        {
          BufferSink buf_86 = sink.context().makeBuffer(); buf_86.copy(term_61.ref());
          term_160 = buf_86.term();
        }
        sink.substitute(term_31.ref(), new Variable[] { var_32, var_58 }, new Term[] {term_41, term_160}); sink.copy(sub_33.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Foldl, var_32, var_58, term_31, term_61, term_64);
  }     final public static boolean _M_Filter(Sink sink, int shared, int depth, Variable var_67, Term term_58, Term term_21) {
    if (depth < 2000) {
      label_46: {
        /* #C=term */
        /* #XS=term *//*Contract*/
        sink.start(_M_Foldr);
        Variable var_94 = sink.context().makeVariable("x");
        Variable var_161 = sink.context().makeVariable("y");
        sink.binds(new Variable[] {var_94,var_161});
        sink.start(_M_ConditionalInsert);
        VariableUse use_73 = sink.context().makeVariableUse(var_94);
        sink.substitute(term_58.ref(), new Variable[] { var_67 }, new Term[] {use_73}); sink.use(var_94); sink.use(var_161);
        sink.end(); sink.start(_M__sNil); sink.end(); sink.copy(term_21.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Filter, var_67, term_58, term_21);
  }   final public static boolean _M_Map2(Sink sink, int shared, int depth, Variable var_214, Term term_42, Term term_95) {
    if (depth < 2000) {
      label_24: {
        /* #F=term */
        /* #XS=term *//*Contract*/
        sink.start(_M_Foldr);
        Variable var_1 = sink.context().makeVariable("y");
        Variable var_8 = sink.context().makeVariable("ys");
        sink.binds(new Variable[] {var_1,var_8});
        sink.start(_M_Insert);
        VariableUse use_78 = sink.context().makeVariableUse(var_1);
        sink.substitute(term_42.ref(), new Variable[] { var_214 }, new Term[] {use_78}); sink.use(var_8);
        sink.end(); sink.start(_M__sNil); sink.end(); sink.copy(term_95.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Map2, var_214, term_42, term_95);
  }   final public static boolean _M_Map(Sink sink, int shared, int depth, Variable var_80, Term term_82, Term term_67) {
    if (depth < 2000) {
      label_80: {
        /* #=term */
        if (term_67.descriptor() != _M__sNil)
        {   break label_80;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_6: {
        /* #=term */
        if (term_67.descriptor() != _M__sCons)
        {   break label_6;
        }Term sub_81 = term_67.sub(0).ref();
        /* #1=sub */Term sub_75 = term_67.sub(1).ref();
        /* #s=sub *//*Contract*/
        sink.start(_M__sCons);Term term_25;
        {
          BufferSink buf_42 = sink.context().makeBuffer(); buf_42.copy(sub_81.ref());
          term_25 = buf_42.term();
        }
        sink.substitute(term_82.ref(), new Variable[] { var_80 }, new Term[] {term_25});
        sink.start(_M_Map);
        Variable var_99 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_99});
        VariableUse use_55 = sink.context().makeVariableUse(var_99);
        sink.substitute(term_82.ref(), new Variable[] { var_80 }, new Term[] {use_55}); sink.copy(sub_75.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Map, var_80, term_82, term_67);
  }   final public static boolean _M_MatchPartition(Sink sink, int shared, int depth, Term term_40, Term term_117, Term term_87) {
    if (depth < 2000) {
      label_58: {
        if (term_40.descriptor() != _M_TRUE)
        {   break label_58;
        }
        /* #X=term */
        if (term_87.descriptor() != _M_PairCons)
        {   break label_58;
        }Term sub_182 = term_87.sub(0).ref();
        /* #TS=sub */Term sub_70 = term_87.sub(1).ref();
        /* #FS=sub *//*Contract*/
        sink.start(_M_PairCons);
        sink.start(_M_Insert); sink.copy(term_117.ref()); sink.copy(sub_182.ref());
        sink.end(); sink.copy(sub_70.ref());
        sink.end(); return true;
      }
      label_89: {
        if (term_40.descriptor() != _M_FALSE)
        {   break label_89;
        }
        /* #X=term */
        if (term_87.descriptor() != _M_PairCons)
        {   break label_89;
        }Term sub_95 = term_87.sub(0).ref();
        /* #TS=sub */Term sub_45 = term_87.sub(1).ref();
        /* #FS=sub *//*Contract*/
        sink.start(_M_PairCons); sink.copy(sub_95.ref());
        sink.start(_M_Insert); sink.copy(term_117.ref()); sink.copy(sub_45.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_MatchPartition, term_40, term_117, term_87);
  }   final public static boolean _M_Partition(Sink sink, int shared, int depth, Variable var_78, Term term_59, Term term_65) {
    if (depth < 2000) {
      label_2: {
        /* #C=term */
        /* #XS=term *//*Contract*/
        sink.start(_M_Foldr);
        Variable var_170 = sink.context().makeVariable("x");
        Variable var_120 = sink.context().makeVariable("res");
        sink.binds(new Variable[] {var_170,var_120});
        sink.start(_M_MatchPartition);
        VariableUse use_57 = sink.context().makeVariableUse(var_170);
        sink.substitute(term_59.ref(), new Variable[] { var_78 }, new Term[] {use_57}); sink.use(var_170); sink.use(var_120);
        sink.end();
        sink.start(_M_PairCons); sink.start(_M__sNil); sink.end(); sink.start(_M__sNil); sink.end();
        sink.end(); sink.copy(term_65.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Partition, var_78, term_59, term_65);
  }   final public static boolean _M_DelEntry(Sink sink, int shared, int depth, Term term_92, Term term_101) {
    if (depth < 2000) {
      sink.start(_M_Filter);
      Variable var_77 = sink.context().makeVariable("pair");
      sink.binds(new Variable[] {var_77});
      sink.start(_M_Not);
      sink.start(_M_Eq); sink.start(_M_Fst); sink.use(var_77); sink.end(); sink.copy(term_92.ref());
      sink.end();
      sink.end(); sink.copy(term_101.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_DelEntry, term_92, term_101);
  }  final public static boolean _M_LookUp(Sink sink, int shared, int depth, Term term_12, Term term_62) {
    if (depth < 2000) {
      sink.start(_M_Map);
      Variable var_9 = sink.context().makeVariable("x");
      sink.binds(new Variable[] {var_9}); sink.start(_M_Snd); sink.use(var_9); sink.end();
      sink.start(_M_Filter);
      Variable var_255 = sink.context().makeVariable("pair");
      sink.binds(new Variable[] {var_255});
      sink.start(_M_Eq); sink.copy(term_12.ref()); sink.start(_M_Fst); sink.use(var_255); sink.end();
      sink.end(); sink.copy(term_62.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_LookUp, term_12, term_62);
  }  final public static boolean _M_Zip(Sink sink, int shared, int depth, Term term_10, Term term_107) {
    if (depth < 2000) {
      label_84: {
        if (term_10.descriptor() != _M__sNil)
        {   break label_84;
        }
        if (term_107.descriptor() != _M__sNil)
        {   break label_84;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_43: {
        if (term_10.descriptor() != _M__sNil)
        {   break label_43;
        }
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("ListExtension.Zip: second argument list was longer");
        sink.end(); return true;
      }
      label_86: {
        /* #=term */
        if (term_107.descriptor() != _M__sNil)
        {   break label_86;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.literal("ListExtension.Zip: first argument list was longer");
        sink.end(); return true;
      }
      label_19: {
        if (term_10.descriptor() != _M__sCons)
        {   break label_19;
        }Term sub_144 = term_10.sub(0).ref();
        /* #X=sub */Term sub_64 = term_10.sub(1).ref();
        /* #XS=sub */
        if (term_107.descriptor() != _M__sCons)
        {   break label_19;
        }Term sub_13 = term_107.sub(0).ref();
        /* #Y=sub */Term sub_51 = term_107.sub(1).ref();
        /* #YS=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_PairCons); sink.copy(sub_144.ref()); sink.copy(sub_13.ref());
        sink.end();
        sink.start(_M_Zip); sink.copy(sub_64.ref()); sink.copy(sub_51.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Zip, term_10, term_107);
  }  final public static boolean _M_Reverse(Sink sink, int shared, int depth, Term term_259) {
    if (depth < 2000) {
      sink.start(_M_Foldl);
      Variable var_57 = sink.context().makeVariable("x");
      Variable var_50 = sink.context().makeVariable("xs");
      sink.binds(new Variable[] {var_57,var_50});
      sink.start(_M_Insert); sink.use(var_57); sink.use(var_50);
      sink.end(); sink.start(_M__sNil); sink.end(); sink.copy(term_259.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_Reverse, term_259);
  } final public static boolean _M_Union(Sink sink, int shared, int depth, Term term_193, Term term_80) {
    if (depth < 2000) {
      sink.start(_M_RemoveDuplicates);
      sink.start(_M_Concat); sink.copy(term_193.ref()); sink.copy(term_80.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Union, term_193, term_80);
  }  final public static boolean _M_Intersect(Sink sink, int shared, int depth, Term term_143, Term term_165) {
    if (depth < 2000) {
      sink.start(_M_Foldr);
      Variable var_14 = sink.context().makeVariable("x");
      Variable var_92 = sink.context().makeVariable("zs");
      sink.binds(new Variable[] {var_14,var_92});
      sink.start(_M_ConditionalInsert);
      sink.start(_M_Elem); sink.use(var_14); sink.copy(term_165.ref());
      sink.end(); sink.use(var_14); sink.use(var_92);
      sink.end(); sink.start(_M__sNil); sink.end(); sink.copy(term_143.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_Intersect, term_143, term_165);
  }  final public static boolean _M_Length(Sink sink, int shared, int depth, Term term_0) {
    if (depth < 2000) {
      sink.start(_M_IWrapFoldlP);
      Variable var_24 = sink.context().makeVariable("x");
      Variable var_59 = sink.context().makeVariable("y");
      sink.binds(new Variable[] {var_24,var_59});
      sink.start(_M_NumberPlus); sink.literal(1); sink.use(var_59);
      sink.end(); sink.literal(0); sink.copy(term_0.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_Length, term_0);
  } final public static boolean _M_RemoveDuplicates(Sink sink, int shared, int depth, Term term_3) {
    if (depth < 2000) {
      label_192: {
        if (term_3.descriptor() != _M__sNil)
        {   break label_192;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_95: {
        if (term_3.descriptor() != _M__sCons)
        {   break label_95;
        }Term sub_31 = term_3.sub(0).ref();
        /* #X=sub */Term sub_18 = term_3.sub(1).ref();
        /* #XS=sub *//*Contract*/
        sink.start(_M_Insert); sink.copy(sub_31.ref());
        sink.start(_M_RemoveDuplicates);
        sink.start(_M_Filter);
        Variable var_52 = sink.context().makeVariable("x");
        sink.binds(new Variable[] {var_52});
        sink.start(_M_Not);
        sink.start(_M_Eq); sink.use(var_52); sink.copy(sub_31.ref());
        sink.end();
        sink.end(); sink.copy(sub_18.ref());
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_RemoveDuplicates, term_3);
  } final public static boolean _M_ContainsDuplicates(Sink sink, int shared, int depth, Term term_27) {
    if (depth < 2000) {
      label_74: {
        if (term_27.descriptor() != _M__sNil)
        {   break label_74;
        }/*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
      label_63: {
        if (term_27.descriptor() != _M__sCons)
        {   break label_63;
        }Term sub_19 = term_27.sub(0).ref();
        /* #H=sub */Term sub_113 = term_27.sub(1).ref();
        /* #T=sub *//*Contract*/
        sink.start(_M_Or);
        sink.start(_M_Elem); sink.copy(sub_19.ref()); sink.copy(sub_113.ref());
        sink.end();
        sink.start(_M_ContainsDuplicates); sink.copy(sub_113.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ContainsDuplicates, term_27);
  } final public static boolean _M_ConditionalInsert(Sink sink, int shared, int depth, Term term_69, Term term_98, Term term_36) {
    if (depth < 2000) {
      label_18: {
        if (term_69.descriptor() != _M_TRUE)
        {   break label_18;
        }
        /* #X=term */
        /* #XS=term *//*Contract*/
        sink.start(_M_Insert); sink.copy(term_98.ref()); sink.copy(term_36.ref());
        sink.end(); return true;
      }
      label_59: {
        if (term_69.descriptor() != _M_FALSE)
        {   break label_59;
        }
        /* #X=term */
        /* #XS=term *//*Contract*/ sink.copy(term_36.ref()); return true;
      }
    }
    return thunk(sink, _M_ConditionalInsert, term_69, term_98, term_36);
  }   final public static boolean _M_ListEqual(Sink sink, int shared, int depth, Variable var_199, Variable var_26, Term term_54, Term term_13, Term term_37) {
    if (depth < 2000) {
      label_153: {
        /* #C=term */
        if (term_13.descriptor() != _M__sNil)
        {   break label_153;
        }
        if (term_37.descriptor() != _M__sNil)
        {   break label_153;
        }/*Contract*/ sink.start(_M_TRUE); sink.end(); return true;
      }
      label_32: {
        /* #C=term */
        if (term_13.descriptor() != _M__sCons)
        {   break label_32;
        }Term sub_36 = term_13.sub(0).ref();
        /* #x=sub */Term sub_157 = term_13.sub(1).ref();
        /* #xs=sub */
        if (term_37.descriptor() != _M__sNil)
        {   break label_32;
        }/*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
      label_168: {
        /* #C=term */
        if (term_13.descriptor() != _M__sNil)
        {   break label_168;
        }
        if (term_37.descriptor() != _M__sCons)
        {   break label_168;
        }Term sub_11 = term_37.sub(0).ref();
        /* #y=sub */Term sub_12 = term_37.sub(1).ref();
        /* #ys=sub *//*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
      label_22: {
        /* #C=term */
        if (term_13.descriptor() != _M__sCons)
        {   break label_22;
        }Term sub_76 = term_13.sub(0).ref();
        /* #x=sub */Term sub_2 = term_13.sub(1).ref();
        /* #xs=sub */
        if (term_37.descriptor() != _M__sCons)
        {   break label_22;
        }Term sub_69 = term_37.sub(0).ref();
        /* #y=sub */Term sub_135 = term_37.sub(1).ref();
        /* #ys=sub *//*Contract*/
        sink.start(_M_And);Term term_68;
        {
          BufferSink buf_13 = sink.context().makeBuffer(); buf_13.copy(sub_76.ref());
          term_68 = buf_13.term();
        }Term term_71;
        {
          BufferSink buf_53 = sink.context().makeBuffer(); buf_53.copy(sub_69.ref());
          term_71 = buf_53.term();
        }
        sink.substitute(term_54.ref(), new Variable[] { var_199, var_26 }, new Term[] {term_68, term_71});
        sink.start(_M_ListEqual);
        Variable var_36 = sink.context().makeVariable("x");
        Variable var_86 = sink.context().makeVariable("y");
        sink.binds(new Variable[] {var_36,var_86});
        VariableUse use_97 = sink.context().makeVariableUse(var_36);
        VariableUse use_6 = sink.context().makeVariableUse(var_86);
        sink.substitute(term_54.ref(), new Variable[] { var_199, var_26 }, new Term[] {use_97, use_6}); sink.copy(sub_2.ref()); sink.copy(sub_135.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ListEqual, var_199, var_26, term_54, term_13, term_37);
  }     final public static boolean _M_Insert(Sink sink, int shared, int depth, Term term_66, Term term_73) {
    if (depth < 2000) {
      sink.start(_M__sCons); sink.copy(term_66.ref()); sink.copy(term_73.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_Insert, term_66, term_73);
  }  final public static boolean _M_Elem(Sink sink, int shared, int depth, Term term_112, Term term_23) {
    if (depth < 2000) {
      sink.start(_M_Foldr);
      Variable var_283 = sink.context().makeVariable("x");
      Variable var_179 = sink.context().makeVariable("y");
      sink.binds(new Variable[] {var_283,var_179});
      sink.start(_M_Or);
      sink.start(_M_Eq); sink.copy(term_112.ref()); sink.use(var_283);
      sink.end(); sink.use(var_179);
      sink.end(); sink.start(_M_FALSE); sink.end(); sink.copy(term_23.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_Elem, term_112, term_23);
  }  final public static boolean _M_Concat(Sink sink, int shared, int depth, Term term_81, Term term_88) {
    if (depth < 2000) {
      label_56: {
        if (term_81.descriptor() != _M__sNil)
        {   break label_56;
        }
        /* #tail=term *//*Contract*/ sink.copy(term_88.ref()); return true;
      }
      label_13: {
        if (term_81.descriptor() != _M__sCons)
        {   break label_13;
        }Term sub_5 = term_81.sub(0).ref();
        /* #1=sub */Term sub_63 = term_81.sub(1).ref();
        /* #s=sub */
        /* #tail=term *//*Contract*/
        sink.start(_M__sCons); sink.copy(sub_5.ref());
        sink.start(_M_Concat); sink.copy(sub_63.ref()); sink.copy(term_88.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Concat, term_81, term_88);
  }  final public static boolean _M_Tail(Sink sink, int shared, int depth, Term term_60) {
    if (depth < 2000) {
      label_73: {
        if (term_60.descriptor() != _M__sCons)
        {   break label_73;
        }Term sub_22 = term_60.sub(0).ref();
        /* #=sub */Term sub_52 = term_60.sub(1).ref(); /* #s=sub *//*Contract*/ sink.copy(sub_52.ref()); return true;
      }
      label_88: {
        if (term_60.descriptor() != _M__sNil)
        {   break label_88;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end(); sink.literal("Tail of empty list");
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Tail, term_60);
  } final public static boolean _M_Head(Sink sink, int shared, int depth, Term term_56) {
    if (depth < 2000) {
      label_20: {
        if (term_56.descriptor() != _M__sCons)
        {   break label_20;
        }Term sub_84 = term_56.sub(0).ref();
        /* #=sub */Term sub_38 = term_56.sub(1).ref(); /* #s=sub *//*Contract*/ sink.copy(sub_84.ref()); return true;
      }
      label_104: {
        if (term_56.descriptor() != _M__sNil)
        {   break label_104;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end(); sink.literal("Head of empty list");
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Head, term_56);
  } final public static boolean _M_IfSingleton(Sink sink, int shared, int depth, Term term_148, Term term_14, Term term_97) {
    if (depth < 2000) {
      label_54: {
        if (term_148.descriptor() != _M__sNil)
        {   break label_54;
        }
        /* #1=term */
        /* #2=term *//*Contract*/ sink.copy(term_97.ref()); return true;
      }
      label_122: {
        if (term_148.descriptor() != _M__sCons)
        {   break label_122;
        }Term sub_43 = term_148.sub(0).ref();
        /* #=sub */Term sub_49 = term_148.sub(1).ref();
        /* #s=sub */
        /* #1=term */
        /* #2=term *//*Contract*/
        sink.start(_M_IfEmpty); sink.copy(sub_49.ref()); sink.copy(term_14.ref()); sink.copy(term_97.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_IfSingleton, term_148, term_14, term_97);
  }   final public static boolean _M_IsSingleton(Sink sink, int shared, int depth, Term term_140) {
    if (depth < 2000) {
      label_170: {
        if (term_140.descriptor() != _M__sNil)
        {   break label_170;
        }/*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
      label_39: {
        if (term_140.descriptor() != _M__sCons)
        {   break label_39;
        }Term sub_37 = term_140.sub(0).ref();
        /* #=sub */Term sub_91 = term_140.sub(1).ref();
        /* #s=sub *//*Contract*/
        sink.start(_M_IsEmpty); sink.copy(sub_91.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_IsSingleton, term_140);
  } final public static boolean _M_Null(Sink sink, int shared, int depth, Term term_52) {
    if (depth < 2000) {
      label_7: {
        if (term_52.descriptor() != _M__sNil)
        {   break label_7;
        }/*Contract*/ sink.start(_M_TRUE); sink.end(); return true;
      }
      label_8: {
        if (term_52.descriptor() != _M__sCons)
        {   break label_8;
        }Term sub_16 = term_52.sub(0).ref();
        /* #H=sub */Term sub_170 = term_52.sub(1).ref();
        /* #T=sub *//*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_Null, term_52);
  } final public static boolean _M_IfEmpty(Sink sink, int shared, int depth, Term term_76, Term term_136, Term term_90) {
    if (depth < 2000) {
      label_66: {
        if (term_76.descriptor() != _M__sNil)
        {   break label_66;
        }
        /* #1=term */
        /* #2=term *//*Contract*/ sink.copy(term_136.ref()); return true;
      }
      label_90: {
        if (term_76.descriptor() != _M__sCons)
        {   break label_90;
        }Term sub_80 = term_76.sub(0).ref();
        /* #=sub */Term sub_147 = term_76.sub(1).ref();
        /* #s=sub */
        /* #1=term */
        /* #2=term *//*Contract*/ sink.copy(term_90.ref()); return true;
      }
    }
    return thunk(sink, _M_IfEmpty, term_76, term_136, term_90);
  }   final public static boolean _M_IsEmpty(Sink sink, int shared, int depth, Term term_127) {
    if (depth < 2000) {
      label_93: {
        if (term_127.descriptor() != _M__sNil)
        {   break label_93;
        }/*Contract*/ sink.start(_M_TRUE); sink.end(); return true;
      }
      label_81: {
        if (term_127.descriptor() != _M__sCons)
        {   break label_81;
        }Term sub_8 = term_127.sub(0).ref();
        /* #=sub */Term sub_14 = term_127.sub(1).ref();
        /* #s=sub *//*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_IsEmpty, term_127);
  } 
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.std.Core.init(context); org.crsx.compiler.std.Pair.init(context); context.register(_M_CONTINUATION); context.register(_M_SeqMap1); context.register(_M_SeqMap); context.register(_M_Fold); context.register(_M_Foldr); context.register(_M_FoldlP); context.register(_M_IWrapFoldlP); context.register(_M_Foldl); context.register(_M_Filter); context.register(_M_Map2); context.register(_M_Map); context.register(_M_MatchPartition); context.register(_M_Partition); context.register(_M_DelEntry); context.register(_M_LookUp); context.register(_M_Zip); context.register(_M_Reverse); context.register(_M_Union); context.register(_M_Intersect); context.register(_M_Length); context.register(_M_RemoveDuplicates); context.register(_M_ContainsDuplicates); context.register(_M_ConditionalInsert); context.register(_M_ListEqual); context.register(_M_Insert); context.register(_M_Elem); context.register(_M_Concat); context.register(_M_Tail); context.register(_M_Head); context.register(_M_IfSingleton); context.register(_M_IsSingleton); context.register(_M_Null); context.register(_M_IfEmpty); context.register(_M_IsEmpty);
      initialized = true;
    }
  }

/* END MODULE « "/Users/villardl/Projects/crsx/crsx4_2/src/std/list.crs.java" » */
}