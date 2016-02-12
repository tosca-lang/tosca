/** Generated File */ package org.crsx.compiler.std;
import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;
import static org.crsx.runtime.Normalizer.force;
import static org.crsx.runtime.Normalizer.forceSub;
import static org.crsx.runtime.Reference.safeRef;
import static org.crsx.runtime.Term.isVariableUse; 

import org.crsx.runtime.*;
import org.crsx.runtime.ConstructionDescriptor.*;

 import static org.crsx.compiler.std.Num.*; import static org.crsx.compiler.std.Pair.*; import static org.crsx.compiler.std.Core.*;

@SuppressWarnings("unused")
 public class List
{
  final public static ConstructionDescriptor _M_Cons = makeData("Cons"); final public static ConstructionDescriptor _M_Nil = makeData("Nil");
  final public static DynamicFunctionDescriptor _M_Foldr = makeFunction("Foldr", List.class, "_M_Foldr");final public static DynamicFunctionDescriptor _M_Map = makeFunction("Map", List.class, "_M_Map");final public static DynamicFunctionDescriptor _M_LookUp = makeFunction("LookUp", List.class, "_M_LookUp");final public static DynamicFunctionDescriptor _M_DelEntry = makeFunction("DelEntry", List.class, "_M_DelEntry");final public static DynamicFunctionDescriptor _M_Filter = makeFunction("Filter", List.class, "_M_Filter");final public static DynamicFunctionDescriptor _M_MapM = makeFunction("MapM", List.class, "_M_MapM");final public static DynamicFunctionDescriptor _M_Length = makeFunction("Length", List.class, "_M_Length");final public static DynamicFunctionDescriptor _M_IsNotEmpty = makeFunction("IsNotEmpty", List.class, "_M_IsNotEmpty");final public static DynamicFunctionDescriptor _M_Append = makeFunction("Append", List.class, "_M_Append");final public static DynamicFunctionDescriptor _M_IsSingleton = makeFunction("IsSingleton", List.class, "_M_IsSingleton");final public static DynamicFunctionDescriptor _M_RemoveDuplicates = makeFunction("RemoveDuplicates", List.class, "_M_RemoveDuplicates");final public static DynamicFunctionDescriptor _M_MapM2 = makeFunction("MapM2", List.class, "_M_MapM2");final public static DynamicFunctionDescriptor _M_MapM3 = makeFunction("MapM3", List.class, "_M_MapM3");final public static DynamicFunctionDescriptor _M_Flatten = makeFunction("Flatten", List.class, "_M_Flatten");final public static DynamicFunctionDescriptor _M_PickFirst1 = makeFunction("PickFirst1", List.class, "_M_PickFirst1");final public static DynamicFunctionDescriptor _M_Foldl = makeFunction("Foldl", List.class, "_M_Foldl");final public static DynamicFunctionDescriptor _M_ContainsDuplicates = makeFunction("ContainsDuplicates", List.class, "_M_ContainsDuplicates");final public static DynamicFunctionDescriptor _M_IfEmpty = makeFunction("IfEmpty", List.class, "_M_IfEmpty");final public static DynamicFunctionDescriptor _M_Head = makeFunction("Head", List.class, "_M_Head");final public static DynamicFunctionDescriptor _M_Partition = makeFunction("Partition", List.class, "_M_Partition");final public static DynamicFunctionDescriptor _M_ListEqual = makeFunction("ListEqual", List.class, "_M_ListEqual");final public static DynamicFunctionDescriptor _M_IfSingleton = makeFunction("IfSingleton", List.class, "_M_IfSingleton");final public static DynamicFunctionDescriptor _M_Tail = makeFunction("Tail", List.class, "_M_Tail");final public static DynamicFunctionDescriptor _M_At = makeFunction("At", List.class, "_M_At");final public static DynamicFunctionDescriptor _M_Map2 = makeFunction("Map2", List.class, "_M_Map2");final public static DynamicFunctionDescriptor _M_Intersect = makeFunction("Intersect", List.class, "_M_Intersect");final public static DynamicFunctionDescriptor _M_Concat = makeFunction("Concat", List.class, "_M_Concat");final public static DynamicFunctionDescriptor _M_Elem = makeFunction("Elem", List.class, "_M_Elem");final public static DynamicFunctionDescriptor _M_Union = makeFunction("Union", List.class, "_M_Union");final public static DynamicFunctionDescriptor _M_ConditionalInsert = makeFunction("ConditionalInsert", List.class, "_M_ConditionalInsert");final public static DynamicFunctionDescriptor _M_Insert = makeFunction("Insert", List.class, "_M_Insert");final public static DynamicFunctionDescriptor _M_IWrapFoldlP = makeFunction("IWrapFoldlP", List.class, "_M_IWrapFoldlP");final public static DynamicFunctionDescriptor _M_MatchPartition = makeFunction("MatchPartition", List.class, "_M_MatchPartition");final public static DynamicFunctionDescriptor _M_FoldlP = makeFunction("FoldlP", List.class, "_M_FoldlP");final public static DynamicFunctionDescriptor _M_PickFirst = makeFunction("PickFirst", List.class, "_M_PickFirst");final public static DynamicFunctionDescriptor _M_Reverse = makeFunction("Reverse", List.class, "_M_Reverse");final public static DynamicFunctionDescriptor _M_Null = makeFunction("Null", List.class, "_M_Null");final public static DynamicFunctionDescriptor _M_Zip = makeFunction("Zip", List.class, "_M_Zip");final public static DynamicFunctionDescriptor _M_IsEmpty = makeFunction("IsEmpty", List.class, "_M_IsEmpty");
  final public static boolean _M_Foldr(Sink sink, Variable var, Variable var_67, Term term, Term term_36, Term term_87) 
  {if (sink.context().sd ++ < 256) {
      label:{
        /* #F=term */
        /* #Z=term */
        term_87 = force(sink.context(), term_87);
        if (term_87.descriptor() != _M_Nil)
        {   break label;
        } sink.copy(term_36.ref());return true;
      }label_54:{
        /* #F=term */
        /* #Z=term */
        term_87 = force(sink.context(), term_87);
        if (term_87.descriptor() != _M_Cons)
        {   break label_54;
        }
        Term sub = term_87.sub(0).ref();
        /* #H=sub */
        Term sub_92 = term_87.sub(1).ref();
        /* #T=sub */Term jterm;{
          BufferSink buffer = sink.context().makeBuffer(); buffer.copy(sub.ref());
          jterm = buffer.term();
        }Term jterm_77;{
          BufferSink buffer_63 = sink.context().makeBuffer();
          buffer_63.start(_M_Foldr);
          Variable jvar = buffer_63.context().makeVariable("x");
          Variable jvar_1 = buffer_63.context().makeVariable("x"); buffer_63.binds(new Variable[] { jvar, jvar_1 });Term jterm_55;{
            BufferSink buffer_85 = buffer_63.context().makeBuffer(); buffer_85.use(jvar);
            jterm_55 = buffer_85.term();
          }Term jterm_43;{
            BufferSink buffer_37 = buffer_63.context().makeBuffer(); buffer_37.use(jvar_1);
            jterm_43 = buffer_37.term();
          }
          buffer_63.substitute(term.ref(), new Variable[] { var, var_67 }, new Term[] {jterm_55, jterm_43});
          buffer_63.copy(term_36.ref()); buffer_63.copy(sub_92.ref());buffer_63.end();
          jterm_77 = buffer_63.term();
        }
        sink.substitute(term.ref(), new Variable[] { var, var_67 }, new Term[] {jterm, jterm_77});return true;
      }
    }
    return thunk(sink, _M_Foldr);
  }final public static boolean _M_Map(Sink sink, Variable var_56, Term term_54, Term term_34) 
  {if (sink.context().sd ++ < 256) {
      label_57:{
        /* #=term */
        term_34 = force(sink.context(), term_34);
        if (term_34.descriptor() != _M_Nil)
        {   break label_57;
        } sink.start(_M_Nil);sink.end();return true;
      }label_109:{
        /* #=term */
        term_34 = force(sink.context(), term_34);
        if (term_34.descriptor() != _M_Cons)
        {   break label_109;
        }
        Term sub_39 = term_34.sub(0).ref();
        /* #1=sub */
        Term sub_72 = term_34.sub(1).ref();
        /* #s=sub */
        sink.start(_M_Cons);Term jterm_40;{
          BufferSink buffer_66 = sink.context().makeBuffer(); buffer_66.copy(sub_39.ref());
          jterm_40 = buffer_66.term();
        }
        sink.substitute(term_54.ref(), new Variable[] { var_56 }, new Term[] {jterm_40});
        sink.start(_M_Map);
        Variable jvar_52 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_52 });Term jterm_82;{
          BufferSink buffer_23 = sink.context().makeBuffer(); buffer_23.use(jvar_52);
          jterm_82 = buffer_23.term();
        }
        sink.substitute(term_54.ref(), new Variable[] { var_56 }, new Term[] {jterm_82}); sink.copy(sub_72.ref());sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_Map);
  }final public static boolean _M_LookUp(Sink sink, Term term_24, Term term_32) 
  {if (sink.context().sd ++ < 256) {
      label_86:{
        /* #Key=term */
        /* #KeyValueList=term */
        sink.start(_M_Map);
        Variable jvar_28 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_28 });
        sink.start(_M_Snd);
        sink.use(jvar_28);sink.end();
        sink.start(_M_Filter);
        Variable jvar_27 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_27 });
        sink.start(_M_Equal);
        sink.copy(term_24.ref());
        sink.start(_M_Fst);
        sink.use(jvar_27);sink.end();sink.end(); sink.copy(term_32.ref());sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_LookUp);
  }final public static boolean _M_DelEntry(Sink sink, Term term_15, Term term_45) 
  {if (sink.context().sd ++ < 256) {
      label_11:{
        /* #Key=term */
        /* #KeyValueList=term */
        sink.start(_M_Filter);
        Variable jvar_8 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_8 });
        sink.start(_M_Not);
        sink.start(_M_Equal);
        sink.start(_M_Fst);
        sink.use(jvar_8);sink.end();
        sink.copy(term_15.ref());sink.end();sink.end(); sink.copy(term_45.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_DelEntry);
  }final public static boolean _M_Filter(Sink sink, Variable var_94, Term term_35, Term term_75) 
  {if (sink.context().sd ++ < 256) {
      label_91:{
        /* #C=term */
        /* #XS=term */
        sink.start(_M_Foldr);
        Variable jvar_98 = sink.context().makeVariable("x");
        Variable jvar_76 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_98, jvar_76 });
        sink.start(_M_ConditionalInsert);Term jterm_83;{
          BufferSink buffer_68 = sink.context().makeBuffer(); buffer_68.use(jvar_98);
          jterm_83 = buffer_68.term();
        }
        sink.substitute(term_35.ref(), new Variable[] { var_94 }, new Term[] {jterm_83});
        sink.use(jvar_98);
        sink.use(jvar_76);sink.end();
        sink.start(_M_Nil);sink.end(); sink.copy(term_75.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_Filter);
  }final public static boolean _M_MapM(Sink sink, Variable var_61, Variable var_2, Term term_65, Term term_27, Term term_68) 
  {if (sink.context().sd ++ < 256) {
      label_9:{
        /* #=term */
        /* #state=term */
        /* #s=term */
        sink.start(_M_MapM2);
        Variable jvar_41 = sink.context().makeVariable("x");
        Variable jvar_43 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_41, jvar_43 });Term jterm_0;{
          BufferSink buffer_80 = sink.context().makeBuffer(); buffer_80.use(jvar_41);
          jterm_0 = buffer_80.term();
        }Term jterm_25;{
          BufferSink buffer_92 = sink.context().makeBuffer(); buffer_92.use(jvar_43);
          jterm_25 = buffer_92.term();
        }
        sink.substitute(term_65.ref(), new Variable[] { var_61, var_2 }, new Term[] {jterm_0, jterm_25});
        sink.copy(term_27.ref());
        sink.copy(term_68.ref()); sink.start(_M_Nil);sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_MapM);
  }final public static boolean _M_Length(Sink sink, Term term_59) 
  {if (sink.context().sd ++ < 256) {
      label_85:{
        /* #XS=term */
        sink.start(_M_IWrapFoldlP);
        Variable jvar_68 = sink.context().makeVariable("x");
        Variable jvar_36 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_68, jvar_36 });
        sink.start(_M_NumberPlus);sink.literal(1);
        sink.use(jvar_36);sink.end();sink.literal(0); sink.copy(term_59.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_Length);
  }final public static boolean _M_IsNotEmpty(Sink sink, Term term_55) 
  {if (sink.context().sd ++ < 256) {
      label_5:{
        term_55 = force(sink.context(), term_55);
        if (term_55.descriptor() != _M_Nil)
        {   break label_5;
        } sink.start(_M_FALSE);sink.end();return true;
      }label_75:{
        term_55 = force(sink.context(), term_55);
        if (term_55.descriptor() != _M_Cons)
        {   break label_75;
        }
        Term sub_55 = term_55.sub(0).ref();
        /* #=sub */
        Term sub_10 = term_55.sub(1).ref(); /* #s=sub */ sink.start(_M_TRUE);sink.end();return true;
      }
    }
    return thunk(sink, _M_IsNotEmpty);
  }final public static boolean _M_Append(Sink sink, Term term_66, Term term_38) 
  {if (sink.context().sd ++ < 256) {
      label_66:{
        /* #x=term */
        term_38 = force(sink.context(), term_38);
        if (term_38.descriptor() != _M_Nil)
        {   break label_66;
        }
        sink.start(_M_Cons);
        sink.copy(term_66.ref()); sink.start(_M_Nil);sink.end();sink.end();return true;
      }label_34:{
        /* #x=term */
        term_38 = force(sink.context(), term_38);
        if (term_38.descriptor() != _M_Cons)
        {   break label_34;
        }
        Term sub_51 = term_38.sub(0).ref();
        /* #1=sub */
        Term sub_1 = term_38.sub(1).ref();
        /* #s=sub */
        sink.start(_M_Cons);
        sink.copy(sub_51.ref());
        sink.start(_M_Append);
        sink.copy(term_66.ref()); sink.copy(sub_1.ref());sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_Append);
  }final public static boolean _M_IsSingleton(Sink sink, Term term_91) 
  {if (sink.context().sd ++ < 256) {
      label_58:{
        term_91 = force(sink.context(), term_91);
        if (term_91.descriptor() != _M_Nil)
        {   break label_58;
        } sink.start(_M_FALSE);sink.end();return true;
      }label_20:{
        term_91 = force(sink.context(), term_91);
        if (term_91.descriptor() != _M_Cons)
        {   break label_20;
        }
        Term sub_8 = term_91.sub(0).ref();
        /* #=sub */
        Term sub_89 = term_91.sub(1).ref();
        /* #s=sub */
        sink.start(_M_IsEmpty); sink.copy(sub_89.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_IsSingleton);
  }final public static boolean _M_RemoveDuplicates(Sink sink, Term term_83) 
  {if (sink.context().sd ++ < 256) {
      label_44:{
        term_83 = force(sink.context(), term_83);
        if (term_83.descriptor() != _M_Nil)
        {   break label_44;
        } sink.start(_M_Nil);sink.end();return true;
      }label_1:{
        term_83 = force(sink.context(), term_83);
        if (term_83.descriptor() != _M_Cons)
        {   break label_1;
        }
        Term sub_66 = term_83.sub(0).ref();
        /* #X=sub */
        Term sub_25 = term_83.sub(1).ref();
        /* #XS=sub */
        sink.start(_M_Cons);
        sink.copy(sub_66.ref());
        sink.start(_M_RemoveDuplicates);
        sink.start(_M_Filter);
        Variable jvar_20 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_20 });
        sink.start(_M_Not);
        sink.start(_M_Equal);
        sink.use(jvar_20);
        sink.copy(sub_66.ref());sink.end();sink.end();
        sink.copy(sub_25.ref());sink.end();sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_RemoveDuplicates);
  }final public static boolean _M_MapM2(Sink sink, Variable var_42, Variable var_9, Term term_51, Term term_148, Term term_67, Term term_57) 
  {if (sink.context().sd ++ < 256) {
      label_46:{
        /* #=term */
        /* #state=term */
        term_67 = force(sink.context(), term_67);
        if (term_67.descriptor() != _M_Nil)
        {   break label_46;
        }
        /* #rs=term */
        sink.start(_M_PairCons);
        sink.copy(term_148.ref()); sink.copy(term_57.ref());sink.end();return true;
      }label_153:{
        /* #=term */
        /* #state=term */
        term_67 = force(sink.context(), term_67);
        if (term_67.descriptor() != _M_Cons)
        {   break label_153;
        }
        Term sub_73 = term_67.sub(0).ref();
        /* #1=sub */
        Term sub_91 = term_67.sub(1).ref();
        /* #s=sub */
        /* #rs=term */
        sink.start(_M_MapM3);Term jterm_96;{
          BufferSink buffer_2 = sink.context().makeBuffer(); buffer_2.copy(term_148.ref());
          jterm_96 = buffer_2.term();
        }Term jterm_64;{
          BufferSink buffer_84 = sink.context().makeBuffer(); buffer_84.copy(sub_73.ref());
          jterm_64 = buffer_84.term();
        }
        sink.substitute(term_51.ref(), new Variable[] { var_42, var_9 }, new Term[] {jterm_96, jterm_64});
        Variable jvar_15 = sink.context().makeVariable("x");
        Variable jvar_35 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_15, jvar_35 });Term jterm_78;{
          BufferSink buffer_61 = sink.context().makeBuffer(); buffer_61.use(jvar_15);
          jterm_78 = buffer_61.term();
        }Term jterm_15;{
          BufferSink buffer_39 = sink.context().makeBuffer(); buffer_39.use(jvar_35);
          jterm_15 = buffer_39.term();
        }
        sink.substitute(term_51.ref(), new Variable[] { var_42, var_9 }, new Term[] {jterm_78, jterm_15});
        sink.copy(sub_91.ref()); sink.copy(term_57.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_MapM2);
  }final public static boolean _M_MapM3(Sink sink, Term term_40, Variable var_71, Variable var_60, Term term_73, Term term_4, Term term_37) 
  {if (sink.context().sd ++ < 256) {
      label_24:{
        term_40 = force(sink.context(), term_40);
        if (term_40.descriptor() != _M_PairCons)
        {   break label_24;
        }
        Term sub_13 = term_40.sub(0).ref();
        /* #nstate=sub */
        Term sub_80 = term_40.sub(1).ref();
        /* #r=sub */
        /* #=term */
        /* #s=term */
        /* #rs=term */
        sink.start(_M_MapM2);
        Variable jvar_84 = sink.context().makeVariable("x");
        Variable jvar_150 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_84, jvar_150 });Term jterm_42;{
          BufferSink buffer_94 = sink.context().makeBuffer(); buffer_94.use(jvar_84);
          jterm_42 = buffer_94.term();
        }Term jterm_93;{
          BufferSink buffer_144 = sink.context().makeBuffer(); buffer_144.use(jvar_150);
          jterm_93 = buffer_144.term();
        }
        sink.substitute(term_73.ref(), new Variable[] { var_71, var_60 }, new Term[] {jterm_42, jterm_93});
        sink.copy(sub_13.ref());
        sink.copy(term_4.ref());
        sink.start(_M_Append);
        sink.copy(sub_80.ref()); sink.copy(term_37.ref());sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_MapM3);
  }final public static boolean _M_Flatten(Sink sink, Term term_49) 
  {if (sink.context().sd ++ < 256) {
      label_7:{
        term_49 = force(sink.context(), term_49);
        if (term_49.descriptor() != _M_Nil)
        {   break label_7;
        } sink.start(_M_Nil);sink.end();return true;
      }label_77:{
        term_49 = force(sink.context(), term_49);
        if (term_49.descriptor() != _M_Cons)
        {   break label_77;
        }
        Term sub_106 = term_49.sub(0).ref();
        /* #1=sub */
        Term sub_95 = term_49.sub(1).ref();
        /* #s=sub */
        sink.start(_M_Concat);
        sink.copy(sub_106.ref());
        sink.start(_M_Flatten); sink.copy(sub_95.ref());sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_Flatten);
  }final public static boolean _M_PickFirst1(Sink sink, Term term_104, Term term_16, Term term_170, Variable var_22, Term term_86) 
  {if (sink.context().sd ++ < 256) {
      label_52:{
        term_104 = force(sink.context(), term_104);
        if (term_104.descriptor() != _M_TRUE)
        {   break label_52;
        }
        /* #1=term */
        /* #s=term */
        /* #=term */
        sink.start(_M_SOME); sink.copy(term_16.ref());sink.end();return true;
      }label_48:{
        term_104 = force(sink.context(), term_104);
        if (term_104.descriptor() != _M_FALSE)
        {   break label_48;
        }
        /* #1=term */
        /* #s=term */
        /* #=term */
        sink.start(_M_PickFirst);
        sink.copy(term_170.ref());
        Variable jvar_99 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_99 });Term jterm_89;{
          BufferSink buffer_38 = sink.context().makeBuffer(); buffer_38.use(jvar_99);
          jterm_89 = buffer_38.term();
        }
        sink.substitute(term_86.ref(), new Variable[] { var_22 }, new Term[] {jterm_89});sink.end();return true;
      }
    }
    return thunk(sink, _M_PickFirst1);
  }final public static boolean _M_Foldl(Sink sink, Variable var_51, Variable var_98, Term term_94, Term term_14, Term term_175) 
  {if (sink.context().sd ++ < 256) {
      label_30:{
        /* #F=term */
        /* #Z=term */
        term_175 = force(sink.context(), term_175);
        if (term_175.descriptor() != _M_Nil)
        {   break label_30;
        } sink.copy(term_14.ref());return true;
      }label_16:{
        /* #F=term */
        /* #Z=term */
        term_175 = force(sink.context(), term_175);
        if (term_175.descriptor() != _M_Cons)
        {   break label_16;
        }
        Term sub_63 = term_175.sub(0).ref();
        /* #H=sub */
        Term sub_56 = term_175.sub(1).ref();
        /* #T=sub */
        sink.start(_M_Foldl);
        Variable jvar_83 = sink.context().makeVariable("x");
        Variable jvar_91 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_83, jvar_91 });Term jterm_190;{
          BufferSink buffer_15 = sink.context().makeBuffer(); buffer_15.use(jvar_83);
          jterm_190 = buffer_15.term();
        }Term jterm_84;{
          BufferSink buffer_21 = sink.context().makeBuffer(); buffer_21.use(jvar_91);
          jterm_84 = buffer_21.term();
        }
        sink.substitute(term_94.ref(), new Variable[] { var_51, var_98 }, new Term[] {jterm_190, jterm_84});Term jterm_94;{
          BufferSink buffer_50 = sink.context().makeBuffer(); buffer_50.copy(sub_63.ref());
          jterm_94 = buffer_50.term();
        }Term jterm_97;{
          BufferSink buffer_88 = sink.context().makeBuffer(); buffer_88.copy(term_14.ref());
          jterm_97 = buffer_88.term();
        }
        sink.substitute(term_94.ref(), new Variable[] { var_51, var_98 }, new Term[] {jterm_94, jterm_97}); sink.copy(sub_56.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_Foldl);
  }final public static boolean _M_ContainsDuplicates(Sink sink, Term term_97) 
  {if (sink.context().sd ++ < 256) {
      label_4:{
        term_97 = force(sink.context(), term_97);
        if (term_97.descriptor() != _M_Nil)
        {   break label_4;
        } sink.start(_M_FALSE);sink.end();return true;
      }label_70:{
        term_97 = force(sink.context(), term_97);
        if (term_97.descriptor() != _M_Cons)
        {   break label_70;
        }
        Term sub_22 = term_97.sub(0).ref();
        /* #H=sub */
        Term sub_57 = term_97.sub(1).ref();
        /* #T=sub */
        sink.start(_M_Or);
        sink.start(_M_Elem);
        sink.copy(sub_22.ref());
        sink.copy(sub_57.ref());sink.end();
        sink.start(_M_ContainsDuplicates); sink.copy(sub_57.ref());sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_ContainsDuplicates);
  }final public static boolean _M_IfEmpty(Sink sink, Term term_79, Term term_47, Term term_90) 
  {if (sink.context().sd ++ < 256) {
      label_12:{
        term_79 = force(sink.context(), term_79);
        if (term_79.descriptor() != _M_Nil)
        {   break label_12;
        }
        /* #1=term */ /* #2=term */ sink.copy(term_47.ref());return true;
      }label_50:{
        term_79 = force(sink.context(), term_79);
        if (term_79.descriptor() != _M_Cons)
        {   break label_50;
        }
        Term sub_31 = term_79.sub(0).ref();
        /* #=sub */
        Term sub_67 = term_79.sub(1).ref();
        /* #s=sub */
        /* #1=term */ /* #2=term */ sink.copy(term_90.ref());return true;
      }
    }
    return thunk(sink, _M_IfEmpty);
  }final public static boolean _M_Head(Sink sink, Term term_3) 
  {if (sink.context().sd ++ < 256) {
      label_80:{
        term_3 = force(sink.context(), term_3);
        if (term_3.descriptor() != _M_Nil)
        {   break label_80;
        }
        sink.start(_M_Error);sink.literal("Head of empty list");sink.end();return true;
      }label_156:{
        term_3 = force(sink.context(), term_3);
        if (term_3.descriptor() != _M_Cons)
        {   break label_156;
        }
        Term sub_54 = term_3.sub(0).ref();
        /* #=sub */
        Term sub_185 = term_3.sub(1).ref(); /* #s=sub */ sink.copy(sub_54.ref());return true;
      }
    }
    return thunk(sink, _M_Head);
  }final public static boolean _M_Partition(Sink sink, Variable var_169, Term term_60, Term term_151) 
  {if (sink.context().sd ++ < 256) {
      label_32:{
        /* #C=term */
        /* #XS=term */
        sink.start(_M_Foldr);
        Variable jvar_25 = sink.context().makeVariable("x");
        Variable jvar_94 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_25, jvar_94 });
        sink.start(_M_MatchPartition);Term jterm_98;{
          BufferSink buffer_75 = sink.context().makeBuffer(); buffer_75.use(jvar_25);
          jterm_98 = buffer_75.term();
        }
        sink.substitute(term_60.ref(), new Variable[] { var_169 }, new Term[] {jterm_98});
        sink.use(jvar_25);
        sink.use(jvar_94);sink.end();
        sink.start(_M_PairCons);
        sink.start(_M_Nil);sink.end();
        sink.start(_M_Nil);sink.end();sink.end(); sink.copy(term_151.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_Partition);
  }final public static boolean _M_ListEqual(Sink sink, Variable var_70, Variable var_86, Term term_71, Term term_84, Term term_82) 
  {if (sink.context().sd ++ < 256) {
      label_95:{
        /* #C=term */
        term_84 = force(sink.context(), term_84);
        if (term_84.descriptor() != _M_Nil)
        {   break label_95;
        }
        term_82 = force(sink.context(), term_82);
        if (term_82.descriptor() != _M_Nil)
        {   break label_95;
        } sink.start(_M_TRUE);sink.end();return true;
      }label_92:{
        /* #C=term */
        term_84 = force(sink.context(), term_84);
        if (term_84.descriptor() != _M_Cons)
        {   break label_92;
        }
        Term sub_50 = term_84.sub(0).ref();
        /* #x=sub */
        Term sub_159 = term_84.sub(1).ref();
        /* #xs=sub */
        term_82 = force(sink.context(), term_82);
        if (term_82.descriptor() != _M_Nil)
        {   break label_92;
        } sink.start(_M_FALSE);sink.end();return true;
      }label_152:{
        /* #C=term */
        term_84 = force(sink.context(), term_84);
        if (term_84.descriptor() != _M_Nil)
        {   break label_152;
        }
        term_82 = force(sink.context(), term_82);
        if (term_82.descriptor() != _M_Cons)
        {   break label_152;
        }
        Term sub_45 = term_82.sub(0).ref();
        /* #y=sub */
        Term sub_110 = term_82.sub(1).ref(); /* #ys=sub */ sink.start(_M_FALSE);sink.end();return true;
      }label_37:{
        /* #C=term */
        term_84 = force(sink.context(), term_84);
        if (term_84.descriptor() != _M_Cons)
        {   break label_37;
        }
        Term sub_24 = term_84.sub(0).ref();
        /* #x=sub */
        Term sub_37 = term_84.sub(1).ref();
        /* #xs=sub */
        term_82 = force(sink.context(), term_82);
        if (term_82.descriptor() != _M_Cons)
        {   break label_37;
        }
        Term sub_78 = term_82.sub(0).ref();
        /* #y=sub */
        Term sub_12 = term_82.sub(1).ref();
        /* #ys=sub */
        sink.start(_M_And);Term jterm_58;{
          BufferSink buffer_89 = sink.context().makeBuffer(); buffer_89.copy(sub_24.ref());
          jterm_58 = buffer_89.term();
        }Term jterm_31;{
          BufferSink buffer_78 = sink.context().makeBuffer(); buffer_78.copy(sub_78.ref());
          jterm_31 = buffer_78.term();
        }
        sink.substitute(term_71.ref(), new Variable[] { var_70, var_86 }, new Term[] {jterm_58, jterm_31});
        sink.start(_M_ListEqual);
        Variable jvar_152 = sink.context().makeVariable("x");
        Variable jvar_56 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_152, jvar_56 });Term jterm_85;{
          BufferSink buffer_12 = sink.context().makeBuffer(); buffer_12.use(jvar_152);
          jterm_85 = buffer_12.term();
        }Term jterm_8;{
          BufferSink buffer_108 = sink.context().makeBuffer(); buffer_108.use(jvar_56);
          jterm_8 = buffer_108.term();
        }
        sink.substitute(term_71.ref(), new Variable[] { var_70, var_86 }, new Term[] {jterm_85, jterm_8});
        sink.copy(sub_37.ref()); sink.copy(sub_12.ref());sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_ListEqual);
  }final public static boolean _M_IfSingleton(Sink sink, Term term_235, Term term_25, Term term_167) 
  {if (sink.context().sd ++ < 256) {
      label_99:{
        term_235 = force(sink.context(), term_235);
        if (term_235.descriptor() != _M_Nil)
        {   break label_99;
        }
        /* #1=term */ /* #2=term */ sink.copy(term_167.ref());return true;
      }label_55:{
        term_235 = force(sink.context(), term_235);
        if (term_235.descriptor() != _M_Cons)
        {   break label_55;
        }
        Term sub_118 = term_235.sub(0).ref();
        /* #=sub */
        Term sub_47 = term_235.sub(1).ref();
        /* #s=sub */
        /* #1=term */
        /* #2=term */
        sink.start(_M_IfEmpty);
        sink.copy(sub_47.ref());
        sink.copy(term_25.ref()); sink.copy(term_167.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_IfSingleton);
  }final public static boolean _M_Tail(Sink sink, Term term_53) 
  {if (sink.context().sd ++ < 256) {
      label_64:{
        term_53 = force(sink.context(), term_53);
        if (term_53.descriptor() != _M_Nil)
        {   break label_64;
        }
        sink.start(_M_Error);sink.literal("Tail of empty list");sink.end();return true;
      }label_60:{
        term_53 = force(sink.context(), term_53);
        if (term_53.descriptor() != _M_Cons)
        {   break label_60;
        }
        Term sub_97 = term_53.sub(0).ref();
        /* #=sub */
        Term sub_28 = term_53.sub(1).ref(); /* #s=sub */ sink.copy(sub_28.ref());return true;
      }
    }
    return thunk(sink, _M_Tail);
  }final public static boolean _M_At(Sink sink, Term term_39, Term term_173) 
  {if (sink.context().sd ++ < 256) {
      label_2:{
        term_39 = force(sink.context(), term_39);
        if (term_39.descriptor() != _M_Nil)
        {   break label_2;
        } /* #i=term */ sink.start(_M_NONE);sink.end();return true;
      }label_79:{
        term_39 = force(sink.context(), term_39);
        if (term_39.descriptor() != _M_Cons)
        {   break label_79;
        }
        Term sub_87 = term_39.sub(0).ref();
        /* #=sub */
        Term sub_79 = term_39.sub(1).ref();
        /* #s=sub */
        /* #i=term */
        sink.start(_M_If);
        sink.start(_M_Equal);
        sink.copy(term_173.ref());sink.literal(0);sink.end();
        sink.start(_M_SOME);
        sink.copy(sub_87.ref());sink.end();
        sink.start(_M_At);
        sink.copy(sub_79.ref());
        sink.start(_M_Minus);
        sink.copy(term_173.ref());sink.literal(1);sink.end();sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_At);
  }final public static boolean _M_Map2(Sink sink, Variable var_78, Term term_76, Term term_62) 
  {if (sink.context().sd ++ < 256) {
      label_27:{
        /* #F=term */
        /* #XS=term */
        sink.start(_M_Foldr);
        Variable jvar_75 = sink.context().makeVariable("x");
        Variable jvar_67 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_75, jvar_67 });
        sink.start(_M_Insert);Term jterm_4;{
          BufferSink buffer_25 = sink.context().makeBuffer(); buffer_25.use(jvar_75);
          jterm_4 = buffer_25.term();
        }
        sink.substitute(term_76.ref(), new Variable[] { var_78 }, new Term[] {jterm_4});
        sink.use(jvar_67);sink.end();
        sink.start(_M_Nil);sink.end(); sink.copy(term_62.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_Map2);
  }final public static boolean _M_Intersect(Sink sink, Term term_92, Term term_41) 
  {if (sink.context().sd ++ < 256) {
      label_118:{
        /* #XS=term */
        /* #YS=term */
        sink.start(_M_Foldr);
        Variable jvar_23 = sink.context().makeVariable("x");
        Variable jvar_185 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_23, jvar_185 });
        sink.start(_M_ConditionalInsert);
        sink.start(_M_Elem);
        sink.use(jvar_23);
        sink.copy(term_41.ref());sink.end();
        sink.use(jvar_23);
        sink.use(jvar_185);sink.end();
        sink.start(_M_Nil);sink.end(); sink.copy(term_92.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_Intersect);
  }final public static boolean _M_Concat(Sink sink, Term term_7, Term term_193) 
  {if (sink.context().sd ++ < 256) {
      label_172:{
        term_7 = force(sink.context(), term_7);
        if (term_7.descriptor() != _M_Nil)
        {   break label_172;
        } /* #tail=term */ sink.copy(term_193.ref());return true;
      }label_39:{
        term_7 = force(sink.context(), term_7);
        if (term_7.descriptor() != _M_Cons)
        {   break label_39;
        }
        Term sub_52 = term_7.sub(0).ref();
        /* #1=sub */
        Term sub_17 = term_7.sub(1).ref();
        /* #s=sub */
        /* #tail=term */
        sink.start(_M_Cons);
        sink.copy(sub_52.ref());
        sink.start(_M_Concat);
        sink.copy(sub_17.ref()); sink.copy(term_193.ref());sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_Concat);
  }final public static boolean _M_Elem(Sink sink, Term term_88, Term term_147) 
  {if (sink.context().sd ++ < 256) {
      label_31:{
        /* #X=term */
        /* #XS=term */
        sink.start(_M_Foldr);
        Variable jvar_49 = sink.context().makeVariable("x");
        Variable jvar_108 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_49, jvar_108 });
        sink.start(_M_Or);
        sink.start(_M_Equal);
        sink.copy(term_88.ref());
        sink.use(jvar_49);sink.end();
        sink.use(jvar_108);sink.end();
        sink.start(_M_FALSE);sink.end(); sink.copy(term_147.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_Elem);
  }final public static boolean _M_Union(Sink sink, Term term_188, Term term_78) 
  {if (sink.context().sd ++ < 256) {
      label_26:{
        /* #XS=term */
        /* #YS=term */
        sink.start(_M_RemoveDuplicates);
        sink.start(_M_Concat);
        sink.copy(term_188.ref()); sink.copy(term_78.ref());sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_Union);
  }final public static boolean _M_ConditionalInsert(Sink sink, Term term_177, Term term_146, Term term_183) 
  {if (sink.context().sd ++ < 256) {
      label_88:{
        term_177 = force(sink.context(), term_177);
        if (term_177.descriptor() != _M_TRUE)
        {   break label_88;
        }
        /* #X=term */
        /* #XS=term */
        sink.start(_M_Insert);
        sink.copy(term_146.ref()); sink.copy(term_183.ref());sink.end();return true;
      }label_96:{
        term_177 = force(sink.context(), term_177);
        if (term_177.descriptor() != _M_FALSE)
        {   break label_96;
        }
        /* #X=term */ /* #XS=term */ sink.copy(term_183.ref());return true;
      }
    }
    return thunk(sink, _M_ConditionalInsert);
  }final public static boolean _M_Insert(Sink sink, Term term_202, Term term_166) 
  {if (sink.context().sd ++ < 256) {
      label_87:{
        /* #X=term */
        /* #XS=term */
        sink.start(_M_Cons);
        sink.copy(term_202.ref()); sink.copy(term_166.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_Insert);
  }final public static boolean _M_IWrapFoldlP(Sink sink, Variable var_81, Variable var_12, Term term_56, Term term_127, Term term_22) 
  {if (sink.context().sd ++ < 256) {
      label_68:{
        /* #F=term */
        /* #Z=term */
        /* #XS=term */
        sink.start(_M_FoldlP);
        Variable jvar_63 = sink.context().makeVariable("x");
        Variable jvar_121 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_63, jvar_121 });Term jterm_26;{
          BufferSink buffer_71 = sink.context().makeBuffer(); buffer_71.use(jvar_63);
          jterm_26 = buffer_71.term();
        }Term jterm_38;{
          BufferSink buffer_87 = sink.context().makeBuffer(); buffer_87.use(jvar_121);
          jterm_38 = buffer_87.term();
        }
        sink.substitute(term_56.ref(), new Variable[] { var_81, var_12 }, new Term[] {jterm_26, jterm_38});
        sink.copy(term_127.ref()); sink.copy(term_22.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_IWrapFoldlP);
  }final public static boolean _M_MatchPartition(Sink sink, Term term_187, Term term_118, Term term_48) 
  {if (sink.context().sd ++ < 256) {
      label_59:{
        term_187 = force(sink.context(), term_187);
        if (term_187.descriptor() != _M_TRUE)
        {   break label_59;
        }
        /* #X=term */
        term_48 = force(sink.context(), term_48);
        if (term_48.descriptor() != _M_PairCons)
        {   break label_59;
        }
        Term sub_59 = term_48.sub(0).ref();
        /* #TS=sub */
        Term sub_41 = term_48.sub(1).ref();
        /* #FS=sub */
        sink.start(_M_PairCons);
        sink.start(_M_Insert);
        sink.copy(term_118.ref());
        sink.copy(sub_59.ref());sink.end(); sink.copy(sub_41.ref());sink.end();return true;
      }label_238:{
        term_187 = force(sink.context(), term_187);
        if (term_187.descriptor() != _M_FALSE)
        {   break label_238;
        }
        /* #X=term */
        term_48 = force(sink.context(), term_48);
        if (term_48.descriptor() != _M_PairCons)
        {   break label_238;
        }
        Term sub_20 = term_48.sub(0).ref();
        /* #TS=sub */
        Term sub_29 = term_48.sub(1).ref();
        /* #FS=sub */
        sink.start(_M_PairCons);
        sink.copy(sub_20.ref());
        sink.start(_M_Insert);
        sink.copy(term_118.ref()); sink.copy(sub_29.ref());sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_MatchPartition);
  }final public static boolean _M_FoldlP(Sink sink, Variable var_62, Variable var_296, Term term_63, Term term_5, Term term_81) 
  {if (sink.context().sd ++ < 256) {
      label_154:{
        /* #F=term */
        /* #Z=term */
        term_81 = force(sink.context(), term_81);
        if (term_81.descriptor() != _M_Nil)
        {   break label_154;
        } sink.copy(term_5.ref());return true;
      }label_56:{
        /* #F=term */
        /* #Z=term */
        term_81 = force(sink.context(), term_81);
        if (term_81.descriptor() != _M_Cons)
        {   break label_56;
        }
        Term sub_6 = term_81.sub(0).ref();
        /* #H=sub */
        Term sub_74 = term_81.sub(1).ref();
        /* #T=sub */
        sink.start(_M_FoldlP);
        Variable jvar_69 = sink.context().makeVariable("x");
        Variable jvar_82 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_69, jvar_82 });Term jterm_118;{
          BufferSink buffer_49 = sink.context().makeBuffer(); buffer_49.use(jvar_69);
          jterm_118 = buffer_49.term();
        }Term jterm_34;{
          BufferSink buffer_114 = sink.context().makeBuffer(); buffer_114.use(jvar_82);
          jterm_34 = buffer_114.term();
        }
        sink.substitute(term_63.ref(), new Variable[] { var_62, var_296 }, new Term[] {jterm_118, jterm_34});Term jterm_60;{
          BufferSink buffer_98 = sink.context().makeBuffer(); buffer_98.copy(sub_6.ref());
          jterm_60 = buffer_98.term();
        }Term jterm_86;{
          BufferSink buffer_79 = sink.context().makeBuffer(); buffer_79.copy(term_5.ref());
          jterm_86 = buffer_79.term();
        }
        sink.substitute(term_63.ref(), new Variable[] { var_62, var_296 }, new Term[] {jterm_60, jterm_86}); sink.copy(sub_74.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_FoldlP);
  }final public static boolean _M_PickFirst(Sink sink, Term term_178, Variable var_6, Term term_160) 
  {if (sink.context().sd ++ < 256) {
      label_123:{
        term_178 = force(sink.context(), term_178);
        if (term_178.descriptor() != _M_Nil)
        {   break label_123;
        } /* #=term */ sink.start(_M_NONE);sink.end();return true;
      }label_29:{
        term_178 = force(sink.context(), term_178);
        if (term_178.descriptor() != _M_Cons)
        {   break label_29;
        }
        Term sub_94 = term_178.sub(0).ref();
        /* #1=sub */
        Term sub_53 = term_178.sub(1).ref();
        /* #s=sub */
        /* #=term */
        sink.start(_M_PickFirst1);Term jterm_69;{
          BufferSink buffer_86 = sink.context().makeBuffer(); buffer_86.copy(sub_94.ref());
          jterm_69 = buffer_86.term();
        }
        sink.substitute(term_160.ref(), new Variable[] { var_6 }, new Term[] {jterm_69});
        sink.copy(sub_94.ref());
        sink.copy(sub_53.ref());
        Variable jvar_12 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_12 });Term jterm_41;{
          BufferSink buffer_130 = sink.context().makeBuffer(); buffer_130.use(jvar_12);
          jterm_41 = buffer_130.term();
        }
        sink.substitute(term_160.ref(), new Variable[] { var_6 }, new Term[] {jterm_41});sink.end();return true;
      }
    }
    return thunk(sink, _M_PickFirst);
  }final public static boolean _M_Reverse(Sink sink, Term term_198) 
  {if (sink.context().sd ++ < 256) {
      label_28:{
        /* #XS=term */
        sink.start(_M_Foldl);
        Variable jvar_80 = sink.context().makeVariable("x");
        Variable jvar_50 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_80, jvar_50 });
        sink.start(_M_Insert);
        sink.use(jvar_80);
        sink.use(jvar_50);sink.end();
        sink.start(_M_Nil);sink.end(); sink.copy(term_198.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_Reverse);
  }final public static boolean _M_Null(Sink sink, Term term_42) 
  {if (sink.context().sd ++ < 256) {
      label_82:{
        term_42 = force(sink.context(), term_42);
        if (term_42.descriptor() != _M_Nil)
        {   break label_82;
        } sink.start(_M_TRUE);sink.end();return true;
      }label_65:{
        term_42 = force(sink.context(), term_42);
        if (term_42.descriptor() != _M_Cons)
        {   break label_65;
        }
        Term sub_253 = term_42.sub(0).ref();
        /* #H=sub */
        Term sub_151 = term_42.sub(1).ref(); /* #T=sub */ sink.start(_M_FALSE);sink.end();return true;
      }
    }
    return thunk(sink, _M_Null);
  }final public static boolean _M_Zip(Sink sink, Term term_10, Term term_43) 
  {if (sink.context().sd ++ < 256) {
      label_35:{
        term_10 = force(sink.context(), term_10);
        if (term_10.descriptor() != _M_Nil)
        {   break label_35;
        }
        term_43 = force(sink.context(), term_43);
        if (term_43.descriptor() != _M_Nil)
        {   break label_35;
        } sink.start(_M_Nil);sink.end();return true;
      }label_33:{
        term_10 = force(sink.context(), term_10);
        if (term_10.descriptor() != _M_Nil)
        {   break label_33;
        }
        /* #=term */
        sink.start(_M_Error);sink.literal("ListExtension.Zip: second argument list was longer");sink.end();return true;
      }label_169:{
        /* #=term */
        term_43 = force(sink.context(), term_43);
        if (term_43.descriptor() != _M_Nil)
        {   break label_169;
        }
        sink.start(_M_Error);sink.literal("ListExtension.Zip: first argument list was longer");sink.end();return true;
      }label_195:{
        term_10 = force(sink.context(), term_10);
        if (term_10.descriptor() != _M_Cons)
        {   break label_195;
        }
        Term sub_93 = term_10.sub(0).ref();
        /* #X=sub */
        Term sub_84 = term_10.sub(1).ref();
        /* #XS=sub */
        term_43 = force(sink.context(), term_43);
        if (term_43.descriptor() != _M_Cons)
        {   break label_195;
        }
        Term sub_70 = term_43.sub(0).ref();
        /* #Y=sub */
        Term sub_138 = term_43.sub(1).ref();
        /* #YS=sub */
        sink.start(_M_Cons);
        sink.start(_M_PairCons);
        sink.copy(sub_93.ref());
        sink.copy(sub_70.ref());sink.end();
        sink.start(_M_Zip);
        sink.copy(sub_84.ref()); sink.copy(sub_138.ref());sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_Zip);
  }final public static boolean _M_IsEmpty(Sink sink, Term term_69) 
  {if (sink.context().sd ++ < 256) {
      label_94:{
        term_69 = force(sink.context(), term_69);
        if (term_69.descriptor() != _M_Nil)
        {   break label_94;
        } sink.start(_M_TRUE);sink.end();return true;
      }label_145:{
        term_69 = force(sink.context(), term_69);
        if (term_69.descriptor() != _M_Cons)
        {   break label_145;
        }
        Term sub_69 = term_69.sub(0).ref();
        /* #=sub */
        Term sub_76 = term_69.sub(1).ref(); /* #s=sub */ sink.start(_M_FALSE);sink.end();return true;
      }
    }
    return thunk(sink, _M_IsEmpty);
  }
  
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    {
      context.register(_M_Cons); context.register(_M_Nil);
       context.register(_M_Foldr); context.register(_M_Map); context.register(_M_LookUp); context.register(_M_DelEntry); context.register(_M_Filter); context.register(_M_MapM); context.register(_M_Length); context.register(_M_IsNotEmpty); context.register(_M_Append); context.register(_M_IsSingleton); context.register(_M_RemoveDuplicates); context.register(_M_MapM2); context.register(_M_MapM3); context.register(_M_Flatten); context.register(_M_PickFirst1); context.register(_M_Foldl); context.register(_M_ContainsDuplicates); context.register(_M_IfEmpty); context.register(_M_Head); context.register(_M_Partition); context.register(_M_ListEqual); context.register(_M_IfSingleton); context.register(_M_Tail); context.register(_M_At); context.register(_M_Map2); context.register(_M_Intersect); context.register(_M_Concat); context.register(_M_Elem); context.register(_M_Union); context.register(_M_ConditionalInsert); context.register(_M_Insert); context.register(_M_IWrapFoldlP); context.register(_M_MatchPartition); context.register(_M_FoldlP); context.register(_M_PickFirst); context.register(_M_Reverse); context.register(_M_Null); context.register(_M_Zip); context.register(_M_IsEmpty);
       org.crsx.compiler.std.Num.init(context); org.crsx.compiler.std.Pair.init(context); org.crsx.compiler.std.Core.init(context);
      initialized = true;
    }
  }
}