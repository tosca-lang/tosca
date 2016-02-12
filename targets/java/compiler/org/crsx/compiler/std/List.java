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
  final public static boolean _M_Foldr(Sink sink, Variable var, Variable var_77, Term term, Term term_50, Term term_34) 
  {if (sink.context().sd ++ < 256) {
      label:{
        /* #F=term */
        /* #Z=term */
        term_34 = force(sink.context(), term_34);
        if (term_34.descriptor() != _M_Nil)
        {   break label;
        } sink.copy(term_50.ref());return true;
      }label_55:{
        /* #F=term */
        /* #Z=term */
        term_34 = force(sink.context(), term_34);
        if (term_34.descriptor() != _M_Cons)
        {   break label_55;
        }
        Term sub = term_34.sub(0).ref();
        /* #H=sub */
        Term sub_55 = term_34.sub(1).ref();
        /* #T=sub */Term jterm;{
          BufferSink buffer = sink.context().makeBuffer(); buffer.copy(sub.ref());
          jterm = buffer.term();
        }Term jterm_89;{
          BufferSink buffer_80 = sink.context().makeBuffer();
          buffer_80.start(_M_Foldr);
          Variable jvar = buffer_80.context().makeVariable("x");
          Variable jvar_37 = buffer_80.context().makeVariable("x"); buffer_80.binds(new Variable[] { jvar, jvar_37 });Term jterm_62;{
            BufferSink buffer_7 = buffer_80.context().makeBuffer(); buffer_7.use(jvar);
            jterm_62 = buffer_7.term();
          }Term jterm_49;{
            BufferSink buffer_25 = buffer_80.context().makeBuffer(); buffer_25.use(jvar_37);
            jterm_49 = buffer_25.term();
          }
          buffer_80.substitute(term.ref(), new Variable[] { var, var_77 }, new Term[] {jterm_62, jterm_49});
          buffer_80.copy(term_50.ref()); buffer_80.copy(sub_55.ref());buffer_80.end();
          jterm_89 = buffer_80.term();
        }
        sink.substitute(term.ref(), new Variable[] { var, var_77 }, new Term[] {jterm, jterm_89});return true;
      }
    }
    return thunk(sink, _M_Foldr);
  }final public static boolean _M_Map(Sink sink, Variable var_98, Term term_75, Term term_18) 
  {if (sink.context().sd ++ < 256) {
      label_18:{
        /* #=term */
        term_18 = force(sink.context(), term_18);
        if (term_18.descriptor() != _M_Nil)
        {   break label_18;
        } sink.start(_M_Nil);sink.end();return true;
      }label_48:{
        /* #=term */
        term_18 = force(sink.context(), term_18);
        if (term_18.descriptor() != _M_Cons)
        {   break label_48;
        }
        Term sub_78 = term_18.sub(0).ref();
        /* #1=sub */
        Term sub_53 = term_18.sub(1).ref();
        /* #s=sub */
        sink.start(_M_Cons);Term jterm_25;{
          BufferSink buffer_42 = sink.context().makeBuffer(); buffer_42.copy(sub_78.ref());
          jterm_25 = buffer_42.term();
        }
        sink.substitute(term_75.ref(), new Variable[] { var_98 }, new Term[] {jterm_25});
        sink.start(_M_Map);
        Variable jvar_81 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_81 });Term jterm_7;{
          BufferSink buffer_52 = sink.context().makeBuffer(); buffer_52.use(jvar_81);
          jterm_7 = buffer_52.term();
        }
        sink.substitute(term_75.ref(), new Variable[] { var_98 }, new Term[] {jterm_7}); sink.copy(sub_53.ref());sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_Map);
  }final public static boolean _M_LookUp(Sink sink, Term term_8, Term term_74) 
  {if (sink.context().sd ++ < 256) {
      label_33:{
        /* #Key=term */
        /* #KeyValueList=term */
        sink.start(_M_Map);
        Variable jvar_80 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_80 });
        sink.start(_M_Snd);
        sink.use(jvar_80);sink.end();
        sink.start(_M_Filter);
        Variable jvar_82 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_82 });
        sink.start(_M_Equal);
        sink.copy(term_8.ref());
        sink.start(_M_Fst);
        sink.use(jvar_82);sink.end();sink.end(); sink.copy(term_74.ref());sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_LookUp);
  }final public static boolean _M_DelEntry(Sink sink, Term term_95, Term term_7) 
  {if (sink.context().sd ++ < 256) {
      label_3:{
        /* #Key=term */
        /* #KeyValueList=term */
        sink.start(_M_Filter);
        Variable jvar_51 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_51 });
        sink.start(_M_Not);
        sink.start(_M_Equal);
        sink.start(_M_Fst);
        sink.use(jvar_51);sink.end();
        sink.copy(term_95.ref());sink.end();sink.end(); sink.copy(term_7.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_DelEntry);
  }final public static boolean _M_Filter(Sink sink, Variable var_53, Term term_46, Term term_92) 
  {if (sink.context().sd ++ < 256) {
      label_79:{
        /* #C=term */
        /* #XS=term */
        sink.start(_M_Foldr);
        Variable jvar_90 = sink.context().makeVariable("x");
        Variable jvar_42 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_90, jvar_42 });
        sink.start(_M_ConditionalInsert);Term jterm_29;{
          BufferSink buffer_37 = sink.context().makeBuffer(); buffer_37.use(jvar_90);
          jterm_29 = buffer_37.term();
        }
        sink.substitute(term_46.ref(), new Variable[] { var_53 }, new Term[] {jterm_29});
        sink.use(jvar_90);
        sink.use(jvar_42);sink.end();
        sink.start(_M_Nil);sink.end(); sink.copy(term_92.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_Filter);
  }final public static boolean _M_MapM(Sink sink, Variable var_69, Variable var_17, Term term_52, Term term_62, Term term_55) 
  {if (sink.context().sd ++ < 256) {
      label_19:{
        /* #=term */
        /* #state=term */
        /* #s=term */
        sink.start(_M_MapM2);
        Variable jvar_15 = sink.context().makeVariable("x");
        Variable jvar_77 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_15, jvar_77 });Term jterm_55;{
          BufferSink buffer_55 = sink.context().makeBuffer(); buffer_55.use(jvar_15);
          jterm_55 = buffer_55.term();
        }Term jterm_96;{
          BufferSink buffer_77 = sink.context().makeBuffer(); buffer_77.use(jvar_77);
          jterm_96 = buffer_77.term();
        }
        sink.substitute(term_52.ref(), new Variable[] { var_69, var_17 }, new Term[] {jterm_55, jterm_96});
        sink.copy(term_62.ref());
        sink.copy(term_55.ref()); sink.start(_M_Nil);sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_MapM);
  }final public static boolean _M_Length(Sink sink, Term term_2) 
  {if (sink.context().sd ++ < 256) {
      label_39:{
        /* #XS=term */
        sink.start(_M_IWrapFoldlP);
        Variable jvar_6 = sink.context().makeVariable("x");
        Variable jvar_66 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_6, jvar_66 });
        sink.start(_M_NumberPlus);sink.literal(1);
        sink.use(jvar_66);sink.end();sink.literal(0); sink.copy(term_2.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_Length);
  }final public static boolean _M_IsNotEmpty(Sink sink, Term term_82) 
  {if (sink.context().sd ++ < 256) {
      label_23:{
        term_82 = force(sink.context(), term_82);
        if (term_82.descriptor() != _M_Nil)
        {   break label_23;
        } sink.start(_M_FALSE);sink.end();return true;
      }label_84:{
        term_82 = force(sink.context(), term_82);
        if (term_82.descriptor() != _M_Cons)
        {   break label_84;
        }
        Term sub_17 = term_82.sub(0).ref();
        /* #=sub */
        Term sub_9 = term_82.sub(1).ref(); /* #s=sub */ sink.start(_M_TRUE);sink.end();return true;
      }
    }
    return thunk(sink, _M_IsNotEmpty);
  }final public static boolean _M_Append(Sink sink, Term term_37, Term term_28) 
  {if (sink.context().sd ++ < 256) {
      label_174:{
        /* #x=term */
        term_28 = force(sink.context(), term_28);
        if (term_28.descriptor() != _M_Nil)
        {   break label_174;
        }
        sink.start(_M_Cons);
        sink.copy(term_37.ref()); sink.start(_M_Nil);sink.end();sink.end();return true;
      }label_37:{
        /* #x=term */
        term_28 = force(sink.context(), term_28);
        if (term_28.descriptor() != _M_Cons)
        {   break label_37;
        }
        Term sub_50 = term_28.sub(0).ref();
        /* #1=sub */
        Term sub_45 = term_28.sub(1).ref();
        /* #s=sub */
        sink.start(_M_Cons);
        sink.copy(sub_50.ref());
        sink.start(_M_Append);
        sink.copy(term_37.ref()); sink.copy(sub_45.ref());sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_Append);
  }final public static boolean _M_IsSingleton(Sink sink, Term term_42) 
  {if (sink.context().sd ++ < 256) {
      label_60:{
        term_42 = force(sink.context(), term_42);
        if (term_42.descriptor() != _M_Nil)
        {   break label_60;
        } sink.start(_M_FALSE);sink.end();return true;
      }label_32:{
        term_42 = force(sink.context(), term_42);
        if (term_42.descriptor() != _M_Cons)
        {   break label_32;
        }
        Term sub_25 = term_42.sub(0).ref();
        /* #=sub */
        Term sub_60 = term_42.sub(1).ref();
        /* #s=sub */
        sink.start(_M_IsEmpty); sink.copy(sub_60.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_IsSingleton);
  }final public static boolean _M_RemoveDuplicates(Sink sink, Term term_77) 
  {if (sink.context().sd ++ < 256) {
      label_45:{
        term_77 = force(sink.context(), term_77);
        if (term_77.descriptor() != _M_Nil)
        {   break label_45;
        } sink.start(_M_Nil);sink.end();return true;
      }label_26:{
        term_77 = force(sink.context(), term_77);
        if (term_77.descriptor() != _M_Cons)
        {   break label_26;
        }
        Term sub_66 = term_77.sub(0).ref();
        /* #X=sub */
        Term sub_48 = term_77.sub(1).ref();
        /* #XS=sub */
        sink.start(_M_Cons);
        sink.copy(sub_66.ref());
        sink.start(_M_RemoveDuplicates);
        sink.start(_M_Filter);
        Variable jvar_99 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_99 });
        sink.start(_M_Not);
        sink.start(_M_Equal);
        sink.use(jvar_99);
        sink.copy(sub_66.ref());sink.end();sink.end();
        sink.copy(sub_48.ref());sink.end();sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_RemoveDuplicates);
  }final public static boolean _M_MapM2(Sink sink, Variable var_81, Variable var_52, Term term_73, Term term_38, Term term_97, Term term_81) 
  {if (sink.context().sd ++ < 256) {
      label_49:{
        /* #=term */
        /* #state=term */
        term_97 = force(sink.context(), term_97);
        if (term_97.descriptor() != _M_Nil)
        {   break label_49;
        }
        /* #rs=term */
        sink.start(_M_PairCons);
        sink.copy(term_38.ref()); sink.copy(term_81.ref());sink.end();return true;
      }label_67:{
        /* #=term */
        /* #state=term */
        term_97 = force(sink.context(), term_97);
        if (term_97.descriptor() != _M_Cons)
        {   break label_67;
        }
        Term sub_29 = term_97.sub(0).ref();
        /* #1=sub */
        Term sub_14 = term_97.sub(1).ref();
        /* #s=sub */
        /* #rs=term */
        sink.start(_M_MapM3);Term jterm_33;{
          BufferSink buffer_87 = sink.context().makeBuffer(); buffer_87.copy(term_38.ref());
          jterm_33 = buffer_87.term();
        }Term jterm_1;{
          BufferSink buffer_70 = sink.context().makeBuffer(); buffer_70.copy(sub_29.ref());
          jterm_1 = buffer_70.term();
        }
        sink.substitute(term_73.ref(), new Variable[] { var_81, var_52 }, new Term[] {jterm_33, jterm_1});
        Variable jvar_16 = sink.context().makeVariable("x");
        Variable jvar_67 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_16, jvar_67 });Term jterm_63;{
          BufferSink buffer_34 = sink.context().makeBuffer(); buffer_34.use(jvar_16);
          jterm_63 = buffer_34.term();
        }Term jterm_14;{
          BufferSink buffer_93 = sink.context().makeBuffer(); buffer_93.use(jvar_67);
          jterm_14 = buffer_93.term();
        }
        sink.substitute(term_73.ref(), new Variable[] { var_81, var_52 }, new Term[] {jterm_63, jterm_14});
        sink.copy(sub_14.ref()); sink.copy(term_81.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_MapM2);
  }final public static boolean _M_MapM3(Sink sink, Term term_41, Variable var_72, Variable var_57, Term term_13, Term term_1, Term term_40) 
  {if (sink.context().sd ++ < 256) {
      label_81:{
        term_41 = force(sink.context(), term_41);
        if (term_41.descriptor() != _M_PairCons)
        {   break label_81;
        }
        Term sub_3 = term_41.sub(0).ref();
        /* #nstate=sub */
        Term sub_42 = term_41.sub(1).ref();
        /* #r=sub */
        /* #=term */
        /* #s=term */
        /* #rs=term */
        sink.start(_M_MapM2);
        Variable jvar_5 = sink.context().makeVariable("x");
        Variable jvar_91 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_5, jvar_91 });Term jterm_28;{
          BufferSink buffer_13 = sink.context().makeBuffer(); buffer_13.use(jvar_5);
          jterm_28 = buffer_13.term();
        }Term jterm_3;{
          BufferSink buffer_90 = sink.context().makeBuffer(); buffer_90.use(jvar_91);
          jterm_3 = buffer_90.term();
        }
        sink.substitute(term_13.ref(), new Variable[] { var_72, var_57 }, new Term[] {jterm_28, jterm_3});
        sink.copy(sub_3.ref());
        sink.copy(term_1.ref());
        sink.start(_M_Append);
        sink.copy(sub_42.ref()); sink.copy(term_40.ref());sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_MapM3);
  }final public static boolean _M_Flatten(Sink sink, Term term_43) 
  {if (sink.context().sd ++ < 256) {
      label_20:{
        term_43 = force(sink.context(), term_43);
        if (term_43.descriptor() != _M_Nil)
        {   break label_20;
        } sink.start(_M_Nil);sink.end();return true;
      }label_41:{
        term_43 = force(sink.context(), term_43);
        if (term_43.descriptor() != _M_Cons)
        {   break label_41;
        }
        Term sub_86 = term_43.sub(0).ref();
        /* #1=sub */
        Term sub_154 = term_43.sub(1).ref();
        /* #s=sub */
        sink.start(_M_Concat);
        sink.copy(sub_86.ref());
        sink.start(_M_Flatten); sink.copy(sub_154.ref());sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_Flatten);
  }final public static boolean _M_PickFirst1(Sink sink, Term term_194, Term term_17, Term term_96, Variable var_1, Term term_65) 
  {if (sink.context().sd ++ < 256) {
      label_53:{
        term_194 = force(sink.context(), term_194);
        if (term_194.descriptor() != _M_TRUE)
        {   break label_53;
        }
        /* #1=term */
        /* #s=term */
        /* #=term */
        sink.start(_M_SOME); sink.copy(term_17.ref());sink.end();return true;
      }label_62:{
        term_194 = force(sink.context(), term_194);
        if (term_194.descriptor() != _M_FALSE)
        {   break label_62;
        }
        /* #1=term */
        /* #s=term */
        /* #=term */
        sink.start(_M_PickFirst);
        sink.copy(term_96.ref());
        Variable jvar_251 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_251 });Term jterm_42;{
          BufferSink buffer_35 = sink.context().makeBuffer(); buffer_35.use(jvar_251);
          jterm_42 = buffer_35.term();
        }
        sink.substitute(term_65.ref(), new Variable[] { var_1 }, new Term[] {jterm_42});sink.end();return true;
      }
    }
    return thunk(sink, _M_PickFirst1);
  }final public static boolean _M_Foldl(Sink sink, Variable var_102, Variable var_195, Term term_39, Term term_66, Term term_98) 
  {if (sink.context().sd ++ < 256) {
      label_87:{
        /* #F=term */
        /* #Z=term */
        term_98 = force(sink.context(), term_98);
        if (term_98.descriptor() != _M_Nil)
        {   break label_87;
        } sink.copy(term_66.ref());return true;
      }label_76:{
        /* #F=term */
        /* #Z=term */
        term_98 = force(sink.context(), term_98);
        if (term_98.descriptor() != _M_Cons)
        {   break label_76;
        }
        Term sub_90 = term_98.sub(0).ref();
        /* #H=sub */
        Term sub_18 = term_98.sub(1).ref();
        /* #T=sub */
        sink.start(_M_Foldl);
        Variable jvar_195 = sink.context().makeVariable("x");
        Variable jvar_1 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_195, jvar_1 });Term jterm_66;{
          BufferSink buffer_61 = sink.context().makeBuffer(); buffer_61.use(jvar_195);
          jterm_66 = buffer_61.term();
        }Term jterm_138;{
          BufferSink buffer_76 = sink.context().makeBuffer(); buffer_76.use(jvar_1);
          jterm_138 = buffer_76.term();
        }
        sink.substitute(term_39.ref(), new Variable[] { var_102, var_195 }, new Term[] {jterm_66, jterm_138});Term jterm_93;{
          BufferSink buffer_91 = sink.context().makeBuffer(); buffer_91.copy(sub_90.ref());
          jterm_93 = buffer_91.term();
        }Term jterm_31;{
          BufferSink buffer_2 = sink.context().makeBuffer(); buffer_2.copy(term_66.ref());
          jterm_31 = buffer_2.term();
        }
        sink.substitute(term_39.ref(), new Variable[] { var_102, var_195 }, new Term[] {jterm_93, jterm_31}); sink.copy(sub_18.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_Foldl);
  }final public static boolean _M_ContainsDuplicates(Sink sink, Term term_19) 
  {if (sink.context().sd ++ < 256) {
      label_0:{
        term_19 = force(sink.context(), term_19);
        if (term_19.descriptor() != _M_Nil)
        {   break label_0;
        } sink.start(_M_FALSE);sink.end();return true;
      }label_95:{
        term_19 = force(sink.context(), term_19);
        if (term_19.descriptor() != _M_Cons)
        {   break label_95;
        }
        Term sub_8 = term_19.sub(0).ref();
        /* #H=sub */
        Term sub_28 = term_19.sub(1).ref();
        /* #T=sub */
        sink.start(_M_Or);
        sink.start(_M_Elem);
        sink.copy(sub_8.ref());
        sink.copy(sub_28.ref());sink.end();
        sink.start(_M_ContainsDuplicates); sink.copy(sub_28.ref());sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_ContainsDuplicates);
  }final public static boolean _M_IfEmpty(Sink sink, Term term_54, Term term_93, Term term_3) 
  {if (sink.context().sd ++ < 256) {
      label_90:{
        term_54 = force(sink.context(), term_54);
        if (term_54.descriptor() != _M_Nil)
        {   break label_90;
        }
        /* #1=term */ /* #2=term */ sink.copy(term_93.ref());return true;
      }label_24:{
        term_54 = force(sink.context(), term_54);
        if (term_54.descriptor() != _M_Cons)
        {   break label_24;
        }
        Term sub_82 = term_54.sub(0).ref();
        /* #=sub */
        Term sub_74 = term_54.sub(1).ref();
        /* #s=sub */
        /* #1=term */ /* #2=term */ sink.copy(term_3.ref());return true;
      }
    }
    return thunk(sink, _M_IfEmpty);
  }final public static boolean _M_Head(Sink sink, Term term_148) 
  {if (sink.context().sd ++ < 256) {
      label_92:{
        term_148 = force(sink.context(), term_148);
        if (term_148.descriptor() != _M_Nil)
        {   break label_92;
        }
        sink.start(_M_Error);sink.literal("Head of empty list");sink.end();return true;
      }label_82:{
        term_148 = force(sink.context(), term_148);
        if (term_148.descriptor() != _M_Cons)
        {   break label_82;
        }
        Term sub_56 = term_148.sub(0).ref();
        /* #=sub */
        Term sub_124 = term_148.sub(1).ref(); /* #s=sub */ sink.copy(sub_56.ref());return true;
      }
    }
    return thunk(sink, _M_Head);
  }final public static boolean _M_Partition(Sink sink, Variable var_108, Term term_90, Term term_165) 
  {if (sink.context().sd ++ < 256) {
      label_46:{
        /* #C=term */
        /* #XS=term */
        sink.start(_M_Foldr);
        Variable jvar_87 = sink.context().makeVariable("x");
        Variable jvar_19 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_87, jvar_19 });
        sink.start(_M_MatchPartition);Term jterm_32;{
          BufferSink buffer_20 = sink.context().makeBuffer(); buffer_20.use(jvar_87);
          jterm_32 = buffer_20.term();
        }
        sink.substitute(term_90.ref(), new Variable[] { var_108 }, new Term[] {jterm_32});
        sink.use(jvar_87);
        sink.use(jvar_19);sink.end();
        sink.start(_M_PairCons);
        sink.start(_M_Nil);sink.end();
        sink.start(_M_Nil);sink.end();sink.end(); sink.copy(term_165.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_Partition);
  }final public static boolean _M_ListEqual(Sink sink, Variable var_15, Variable var_27, Term term_67, Term term_56, Term term_69) 
  {if (sink.context().sd ++ < 256) {
      label_78:{
        /* #C=term */
        term_56 = force(sink.context(), term_56);
        if (term_56.descriptor() != _M_Nil)
        {   break label_78;
        }
        term_69 = force(sink.context(), term_69);
        if (term_69.descriptor() != _M_Nil)
        {   break label_78;
        } sink.start(_M_TRUE);sink.end();return true;
      }label_154:{
        /* #C=term */
        term_56 = force(sink.context(), term_56);
        if (term_56.descriptor() != _M_Cons)
        {   break label_154;
        }
        Term sub_79 = term_56.sub(0).ref();
        /* #x=sub */
        Term sub_46 = term_56.sub(1).ref();
        /* #xs=sub */
        term_69 = force(sink.context(), term_69);
        if (term_69.descriptor() != _M_Nil)
        {   break label_154;
        } sink.start(_M_FALSE);sink.end();return true;
      }label_192:{
        /* #C=term */
        term_56 = force(sink.context(), term_56);
        if (term_56.descriptor() != _M_Nil)
        {   break label_192;
        }
        term_69 = force(sink.context(), term_69);
        if (term_69.descriptor() != _M_Cons)
        {   break label_192;
        }
        Term sub_65 = term_69.sub(0).ref();
        /* #y=sub */
        Term sub_75 = term_69.sub(1).ref(); /* #ys=sub */ sink.start(_M_FALSE);sink.end();return true;
      }label_69:{
        /* #C=term */
        term_56 = force(sink.context(), term_56);
        if (term_56.descriptor() != _M_Cons)
        {   break label_69;
        }
        Term sub_87 = term_56.sub(0).ref();
        /* #x=sub */
        Term sub_69 = term_56.sub(1).ref();
        /* #xs=sub */
        term_69 = force(sink.context(), term_69);
        if (term_69.descriptor() != _M_Cons)
        {   break label_69;
        }
        Term sub_126 = term_69.sub(0).ref();
        /* #y=sub */
        Term sub_77 = term_69.sub(1).ref();
        /* #ys=sub */
        sink.start(_M_And);Term jterm_86;{
          BufferSink buffer_36 = sink.context().makeBuffer(); buffer_36.copy(sub_87.ref());
          jterm_86 = buffer_36.term();
        }Term jterm_76;{
          BufferSink buffer_46 = sink.context().makeBuffer(); buffer_46.copy(sub_126.ref());
          jterm_76 = buffer_46.term();
        }
        sink.substitute(term_67.ref(), new Variable[] { var_15, var_27 }, new Term[] {jterm_86, jterm_76});
        sink.start(_M_ListEqual);
        Variable jvar_71 = sink.context().makeVariable("x");
        Variable jvar_18 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_71, jvar_18 });Term jterm_10;{
          BufferSink buffer_44 = sink.context().makeBuffer(); buffer_44.use(jvar_71);
          jterm_10 = buffer_44.term();
        }Term jterm_162;{
          BufferSink buffer_78 = sink.context().makeBuffer(); buffer_78.use(jvar_18);
          jterm_162 = buffer_78.term();
        }
        sink.substitute(term_67.ref(), new Variable[] { var_15, var_27 }, new Term[] {jterm_10, jterm_162});
        sink.copy(sub_69.ref()); sink.copy(sub_77.ref());sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_ListEqual);
  }final public static boolean _M_IfSingleton(Sink sink, Term term_33, Term term_133, Term term_70) 
  {if (sink.context().sd ++ < 256) {
      label_190:{
        term_33 = force(sink.context(), term_33);
        if (term_33.descriptor() != _M_Nil)
        {   break label_190;
        }
        /* #1=term */ /* #2=term */ sink.copy(term_70.ref());return true;
      }label_56:{
        term_33 = force(sink.context(), term_33);
        if (term_33.descriptor() != _M_Cons)
        {   break label_56;
        }
        Term sub_15 = term_33.sub(0).ref();
        /* #=sub */
        Term sub_94 = term_33.sub(1).ref();
        /* #s=sub */
        /* #1=term */
        /* #2=term */
        sink.start(_M_IfEmpty);
        sink.copy(sub_94.ref());
        sink.copy(term_133.ref()); sink.copy(term_70.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_IfSingleton);
  }final public static boolean _M_Tail(Sink sink, Term term_125) 
  {if (sink.context().sd ++ < 256) {
      label_35:{
        term_125 = force(sink.context(), term_125);
        if (term_125.descriptor() != _M_Nil)
        {   break label_35;
        }
        sink.start(_M_Error);sink.literal("Tail of empty list");sink.end();return true;
      }label_157:{
        term_125 = force(sink.context(), term_125);
        if (term_125.descriptor() != _M_Cons)
        {   break label_157;
        }
        Term sub_81 = term_125.sub(0).ref();
        /* #=sub */
        Term sub_131 = term_125.sub(1).ref(); /* #s=sub */ sink.copy(sub_131.ref());return true;
      }
    }
    return thunk(sink, _M_Tail);
  }final public static boolean _M_At(Sink sink, Term term_61, Term term_10) 
  {if (sink.context().sd ++ < 256) {
      label_125:{
        term_61 = force(sink.context(), term_61);
        if (term_61.descriptor() != _M_Nil)
        {   break label_125;
        } /* #i=term */ sink.start(_M_NONE);sink.end();return true;
      }label_8:{
        term_61 = force(sink.context(), term_61);
        if (term_61.descriptor() != _M_Cons)
        {   break label_8;
        }
        Term sub_51 = term_61.sub(0).ref();
        /* #=sub */
        Term sub_95 = term_61.sub(1).ref();
        /* #s=sub */
        /* #i=term */
        sink.start(_M_If);
        sink.start(_M_Equal);
        sink.copy(term_10.ref());sink.literal(0);sink.end();
        sink.start(_M_SOME);
        sink.copy(sub_51.ref());sink.end();
        sink.start(_M_At);
        sink.copy(sub_95.ref());
        sink.start(_M_Minus);
        sink.copy(term_10.ref());sink.literal(1);sink.end();sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_At);
  }final public static boolean _M_Map2(Sink sink, Variable var_76, Term term_47, Term term_205) 
  {if (sink.context().sd ++ < 256) {
      label_2:{
        /* #F=term */
        /* #XS=term */
        sink.start(_M_Foldr);
        Variable jvar_38 = sink.context().makeVariable("x");
        Variable jvar_27 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_38, jvar_27 });
        sink.start(_M_Insert);Term jterm_46;{
          BufferSink buffer_63 = sink.context().makeBuffer(); buffer_63.use(jvar_38);
          jterm_46 = buffer_63.term();
        }
        sink.substitute(term_47.ref(), new Variable[] { var_76 }, new Term[] {jterm_46});
        sink.use(jvar_27);sink.end();
        sink.start(_M_Nil);sink.end(); sink.copy(term_205.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_Map2);
  }final public static boolean _M_Intersect(Sink sink, Term term_193, Term term_68) 
  {if (sink.context().sd ++ < 256) {
      label_57:{
        /* #XS=term */
        /* #YS=term */
        sink.start(_M_Foldr);
        Variable jvar_93 = sink.context().makeVariable("x");
        Variable jvar_32 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_93, jvar_32 });
        sink.start(_M_ConditionalInsert);
        sink.start(_M_Elem);
        sink.use(jvar_93);
        sink.copy(term_68.ref());sink.end();
        sink.use(jvar_93);
        sink.use(jvar_32);sink.end();
        sink.start(_M_Nil);sink.end(); sink.copy(term_193.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_Intersect);
  }final public static boolean _M_Concat(Sink sink, Term term_25, Term term_16) 
  {if (sink.context().sd ++ < 256) {
      label_80:{
        term_25 = force(sink.context(), term_25);
        if (term_25.descriptor() != _M_Nil)
        {   break label_80;
        } /* #tail=term */ sink.copy(term_16.ref());return true;
      }label_29:{
        term_25 = force(sink.context(), term_25);
        if (term_25.descriptor() != _M_Cons)
        {   break label_29;
        }
        Term sub_98 = term_25.sub(0).ref();
        /* #1=sub */
        Term sub_30 = term_25.sub(1).ref();
        /* #s=sub */
        /* #tail=term */
        sink.start(_M_Cons);
        sink.copy(sub_98.ref());
        sink.start(_M_Concat);
        sink.copy(sub_30.ref()); sink.copy(term_16.ref());sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_Concat);
  }final public static boolean _M_Elem(Sink sink, Term term_29, Term term_161) 
  {if (sink.context().sd ++ < 256) {
      label_91:{
        /* #X=term */
        /* #XS=term */
        sink.start(_M_Foldr);
        Variable jvar_23 = sink.context().makeVariable("x");
        Variable jvar_131 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_23, jvar_131 });
        sink.start(_M_Or);
        sink.start(_M_Equal);
        sink.copy(term_29.ref());
        sink.use(jvar_23);sink.end();
        sink.use(jvar_131);sink.end();
        sink.start(_M_FALSE);sink.end(); sink.copy(term_161.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_Elem);
  }final public static boolean _M_Union(Sink sink, Term term_109, Term term_44) 
  {if (sink.context().sd ++ < 256) {
      label_61:{
        /* #XS=term */
        /* #YS=term */
        sink.start(_M_RemoveDuplicates);
        sink.start(_M_Concat);
        sink.copy(term_109.ref()); sink.copy(term_44.ref());sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_Union);
  }final public static boolean _M_ConditionalInsert(Sink sink, Term term_179, Term term_88, Term term_21) 
  {if (sink.context().sd ++ < 256) {
      label_36:{
        term_179 = force(sink.context(), term_179);
        if (term_179.descriptor() != _M_TRUE)
        {   break label_36;
        }
        /* #X=term */
        /* #XS=term */
        sink.start(_M_Insert);
        sink.copy(term_88.ref()); sink.copy(term_21.ref());sink.end();return true;
      }label_7:{
        term_179 = force(sink.context(), term_179);
        if (term_179.descriptor() != _M_FALSE)
        {   break label_7;
        }
        /* #X=term */ /* #XS=term */ sink.copy(term_21.ref());return true;
      }
    }
    return thunk(sink, _M_ConditionalInsert);
  }final public static boolean _M_Insert(Sink sink, Term term_108, Term term_85) 
  {if (sink.context().sd ++ < 256) {
      label_132:{
        /* #X=term */
        /* #XS=term */
        sink.start(_M_Cons);
        sink.copy(term_108.ref()); sink.copy(term_85.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_Insert);
  }final public static boolean _M_IWrapFoldlP(Sink sink, Variable var_26, Variable var_80, Term term_71, Term term_91, Term term_162) 
  {if (sink.context().sd ++ < 256) {
      label_1:{
        /* #F=term */
        /* #Z=term */
        /* #XS=term */
        sink.start(_M_FoldlP);
        Variable jvar_76 = sink.context().makeVariable("x");
        Variable jvar_50 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_76, jvar_50 });Term jterm_84;{
          BufferSink buffer_14 = sink.context().makeBuffer(); buffer_14.use(jvar_76);
          jterm_84 = buffer_14.term();
        }Term jterm_35;{
          BufferSink buffer_68 = sink.context().makeBuffer(); buffer_68.use(jvar_50);
          jterm_35 = buffer_68.term();
        }
        sink.substitute(term_71.ref(), new Variable[] { var_26, var_80 }, new Term[] {jterm_84, jterm_35});
        sink.copy(term_91.ref()); sink.copy(term_162.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_IWrapFoldlP);
  }final public static boolean _M_MatchPartition(Sink sink, Term term_89, Term term_76, Term term_129) 
  {if (sink.context().sd ++ < 256) {
      label_163:{
        term_89 = force(sink.context(), term_89);
        if (term_89.descriptor() != _M_TRUE)
        {   break label_163;
        }
        /* #X=term */
        term_129 = force(sink.context(), term_129);
        if (term_129.descriptor() != _M_PairCons)
        {   break label_163;
        }
        Term sub_96 = term_129.sub(0).ref();
        /* #TS=sub */
        Term sub_39 = term_129.sub(1).ref();
        /* #FS=sub */
        sink.start(_M_PairCons);
        sink.start(_M_Insert);
        sink.copy(term_76.ref());
        sink.copy(sub_96.ref());sink.end(); sink.copy(sub_39.ref());sink.end();return true;
      }label_146:{
        term_89 = force(sink.context(), term_89);
        if (term_89.descriptor() != _M_FALSE)
        {   break label_146;
        }
        /* #X=term */
        term_129 = force(sink.context(), term_129);
        if (term_129.descriptor() != _M_PairCons)
        {   break label_146;
        }
        Term sub_21 = term_129.sub(0).ref();
        /* #TS=sub */
        Term sub_71 = term_129.sub(1).ref();
        /* #FS=sub */
        sink.start(_M_PairCons);
        sink.copy(sub_21.ref());
        sink.start(_M_Insert);
        sink.copy(term_76.ref()); sink.copy(sub_71.ref());sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_MatchPartition);
  }final public static boolean _M_FoldlP(Sink sink, Variable var_7, Variable var_14, Term term_0, Term term_72, Term term_23) 
  {if (sink.context().sd ++ < 256) {
      label_25:{
        /* #F=term */
        /* #Z=term */
        term_23 = force(sink.context(), term_23);
        if (term_23.descriptor() != _M_Nil)
        {   break label_25;
        } sink.copy(term_72.ref());return true;
      }label_147:{
        /* #F=term */
        /* #Z=term */
        term_23 = force(sink.context(), term_23);
        if (term_23.descriptor() != _M_Cons)
        {   break label_147;
        }
        Term sub_92 = term_23.sub(0).ref();
        /* #H=sub */
        Term sub_64 = term_23.sub(1).ref();
        /* #T=sub */
        sink.start(_M_FoldlP);
        Variable jvar_48 = sink.context().makeVariable("x");
        Variable jvar_61 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_48, jvar_61 });Term jterm_97;{
          BufferSink buffer_84 = sink.context().makeBuffer(); buffer_84.use(jvar_48);
          jterm_97 = buffer_84.term();
        }Term jterm_69;{
          BufferSink buffer_22 = sink.context().makeBuffer(); buffer_22.use(jvar_61);
          jterm_69 = buffer_22.term();
        }
        sink.substitute(term_0.ref(), new Variable[] { var_7, var_14 }, new Term[] {jterm_97, jterm_69});Term jterm_39;{
          BufferSink buffer_60 = sink.context().makeBuffer(); buffer_60.copy(sub_92.ref());
          jterm_39 = buffer_60.term();
        }Term jterm_283;{
          BufferSink buffer_49 = sink.context().makeBuffer(); buffer_49.copy(term_72.ref());
          jterm_283 = buffer_49.term();
        }
        sink.substitute(term_0.ref(), new Variable[] { var_7, var_14 }, new Term[] {jterm_39, jterm_283}); sink.copy(sub_64.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_FoldlP);
  }final public static boolean _M_PickFirst(Sink sink, Term term_57, Variable var_67, Term term_78) 
  {if (sink.context().sd ++ < 256) {
      label_42:{
        term_57 = force(sink.context(), term_57);
        if (term_57.descriptor() != _M_Nil)
        {   break label_42;
        } /* #=term */ sink.start(_M_NONE);sink.end();return true;
      }label_68:{
        term_57 = force(sink.context(), term_57);
        if (term_57.descriptor() != _M_Cons)
        {   break label_68;
        }
        Term sub_5 = term_57.sub(0).ref();
        /* #1=sub */
        Term sub_70 = term_57.sub(1).ref();
        /* #s=sub */
        /* #=term */
        sink.start(_M_PickFirst1);Term jterm_65;{
          BufferSink buffer_9 = sink.context().makeBuffer(); buffer_9.copy(sub_5.ref());
          jterm_65 = buffer_9.term();
        }
        sink.substitute(term_78.ref(), new Variable[] { var_67 }, new Term[] {jterm_65});
        sink.copy(sub_5.ref());
        sink.copy(sub_70.ref());
        Variable jvar_213 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_213 });Term jterm_82;{
          BufferSink buffer_53 = sink.context().makeBuffer(); buffer_53.use(jvar_213);
          jterm_82 = buffer_53.term();
        }
        sink.substitute(term_78.ref(), new Variable[] { var_67 }, new Term[] {jterm_82});sink.end();return true;
      }
    }
    return thunk(sink, _M_PickFirst);
  }final public static boolean _M_Reverse(Sink sink, Term term_198) 
  {if (sink.context().sd ++ < 256) {
      label_73:{
        /* #XS=term */
        sink.start(_M_Foldl);
        Variable jvar_78 = sink.context().makeVariable("x");
        Variable jvar_109 = sink.context().makeVariable("x"); sink.binds(new Variable[] { jvar_78, jvar_109 });
        sink.start(_M_Insert);
        sink.use(jvar_78);
        sink.use(jvar_109);sink.end();
        sink.start(_M_Nil);sink.end(); sink.copy(term_198.ref());sink.end();return true;
      }
    }
    return thunk(sink, _M_Reverse);
  }final public static boolean _M_Null(Sink sink, Term term_199) 
  {if (sink.context().sd ++ < 256) {
      label_140:{
        term_199 = force(sink.context(), term_199);
        if (term_199.descriptor() != _M_Nil)
        {   break label_140;
        } sink.start(_M_TRUE);sink.end();return true;
      }label_149:{
        term_199 = force(sink.context(), term_199);
        if (term_199.descriptor() != _M_Cons)
        {   break label_149;
        }
        Term sub_19 = term_199.sub(0).ref();
        /* #H=sub */
        Term sub_108 = term_199.sub(1).ref(); /* #T=sub */ sink.start(_M_FALSE);sink.end();return true;
      }
    }
    return thunk(sink, _M_Null);
  }final public static boolean _M_Zip(Sink sink, Term term_79, Term term_45) 
  {if (sink.context().sd ++ < 256) {
      label_15:{
        term_79 = force(sink.context(), term_79);
        if (term_79.descriptor() != _M_Nil)
        {   break label_15;
        }
        term_45 = force(sink.context(), term_45);
        if (term_45.descriptor() != _M_Nil)
        {   break label_15;
        } sink.start(_M_Nil);sink.end();return true;
      }label_28:{
        term_79 = force(sink.context(), term_79);
        if (term_79.descriptor() != _M_Nil)
        {   break label_28;
        }
        /* #=term */
        sink.start(_M_Error);sink.literal("ListExtension.Zip: second argument list was longer");sink.end();return true;
      }label_70:{
        /* #=term */
        term_45 = force(sink.context(), term_45);
        if (term_45.descriptor() != _M_Nil)
        {   break label_70;
        }
        sink.start(_M_Error);sink.literal("ListExtension.Zip: first argument list was longer");sink.end();return true;
      }label_88:{
        term_79 = force(sink.context(), term_79);
        if (term_79.descriptor() != _M_Cons)
        {   break label_88;
        }
        Term sub_170 = term_79.sub(0).ref();
        /* #X=sub */
        Term sub_11 = term_79.sub(1).ref();
        /* #XS=sub */
        term_45 = force(sink.context(), term_45);
        if (term_45.descriptor() != _M_Cons)
        {   break label_88;
        }
        Term sub_115 = term_45.sub(0).ref();
        /* #Y=sub */
        Term sub_57 = term_45.sub(1).ref();
        /* #YS=sub */
        sink.start(_M_Cons);
        sink.start(_M_PairCons);
        sink.copy(sub_170.ref());
        sink.copy(sub_115.ref());sink.end();
        sink.start(_M_Zip);
        sink.copy(sub_11.ref()); sink.copy(sub_57.ref());sink.end();sink.end();return true;
      }
    }
    return thunk(sink, _M_Zip);
  }final public static boolean _M_IsEmpty(Sink sink, Term term_488) 
  {if (sink.context().sd ++ < 256) {
      label_182:{
        term_488 = force(sink.context(), term_488);
        if (term_488.descriptor() != _M_Nil)
        {   break label_182;
        } sink.start(_M_TRUE);sink.end();return true;
      }label_89:{
        term_488 = force(sink.context(), term_488);
        if (term_488.descriptor() != _M_Cons)
        {   break label_89;
        }
        Term sub_34 = term_488.sub(0).ref();
        /* #=sub */
        Term sub_107 = term_488.sub(1).ref(); /* #s=sub */ sink.start(_M_FALSE);sink.end();return true;
      }
    }
    return thunk(sink, _M_IsEmpty);
  }
  
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    {
      initialized = true;
      context.register(_M_Cons); context.register(_M_Nil);
       context.register(_M_Foldr); context.register(_M_Map); context.register(_M_LookUp); context.register(_M_DelEntry); context.register(_M_Filter); context.register(_M_MapM); context.register(_M_Length); context.register(_M_IsNotEmpty); context.register(_M_Append); context.register(_M_IsSingleton); context.register(_M_RemoveDuplicates); context.register(_M_MapM2); context.register(_M_MapM3); context.register(_M_Flatten); context.register(_M_PickFirst1); context.register(_M_Foldl); context.register(_M_ContainsDuplicates); context.register(_M_IfEmpty); context.register(_M_Head); context.register(_M_Partition); context.register(_M_ListEqual); context.register(_M_IfSingleton); context.register(_M_Tail); context.register(_M_At); context.register(_M_Map2); context.register(_M_Intersect); context.register(_M_Concat); context.register(_M_Elem); context.register(_M_Union); context.register(_M_ConditionalInsert); context.register(_M_Insert); context.register(_M_IWrapFoldlP); context.register(_M_MatchPartition); context.register(_M_FoldlP); context.register(_M_PickFirst); context.register(_M_Reverse); context.register(_M_Null); context.register(_M_Zip); context.register(_M_IsEmpty);
       org.crsx.compiler.std.Num.init(context); org.crsx.compiler.std.Pair.init(context); org.crsx.compiler.std.Core.init(context);
    }
  }
}