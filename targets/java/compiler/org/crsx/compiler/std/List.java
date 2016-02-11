/** Generated File */

package org.crsx.compiler.std;

import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;
import static org.crsx.runtime.Normalizer.force;
import static org.crsx.runtime.Normalizer.forceSub;
import static org.crsx.runtime.Reference.safeRef;
import static org.crsx.runtime.Term.isVariableUse;

import org.crsx.runtime.*;
import org.crsx.runtime.ConstructionDescriptor.*;
import static org.crsx.runtime.Primitives.*;

import static org.crsx.compiler.std.Num.*;
import static org.crsx.compiler.std.Pair.*;
import static org.crsx.compiler.std.Core.*;

@SuppressWarnings("unused")
public class List
{
	final public static ConstructionDescriptor _M_Cons = makeData("Cons");
	final public static ConstructionDescriptor _M_Nil = makeData("Nil");
	final public static DynamicFunctionDescriptor _M_Foldr = makeFunction("Foldr", List.class, "_M_Foldr");
	final public static DynamicFunctionDescriptor _M_Map = makeFunction("Map", List.class, "_M_Map");
	final public static DynamicFunctionDescriptor _M_LookUp = makeFunction("LookUp", List.class, "_M_LookUp");
	final public static DynamicFunctionDescriptor _M_DelEntry = makeFunction("DelEntry", List.class, "_M_DelEntry");
	final public static DynamicFunctionDescriptor _M_Filter = makeFunction("Filter", List.class, "_M_Filter");
	final public static DynamicFunctionDescriptor _M_MapM = makeFunction("MapM", List.class, "_M_MapM");
	final public static DynamicFunctionDescriptor _M_Length = makeFunction("Length", List.class, "_M_Length");
	final public static DynamicFunctionDescriptor _M_IsNotEmpty = makeFunction("IsNotEmpty", List.class, "_M_IsNotEmpty");
	final public static DynamicFunctionDescriptor _M_Append = makeFunction("Append", List.class, "_M_Append");
	final public static DynamicFunctionDescriptor _M_IsSingleton = makeFunction("IsSingleton", List.class, "_M_IsSingleton");
	final public static DynamicFunctionDescriptor _M_RemoveDuplicates = makeFunction(
			"RemoveDuplicates", List.class, "_M_RemoveDuplicates");
	final public static DynamicFunctionDescriptor _M_MapM2 = makeFunction("MapM2", List.class, "_M_MapM2");
	final public static DynamicFunctionDescriptor _M_MapM3 = makeFunction("MapM3", List.class, "_M_MapM3");
	final public static DynamicFunctionDescriptor _M_Flatten = makeFunction("Flatten", List.class, "_M_Flatten");
	final public static DynamicFunctionDescriptor _M_PickFirst1 = makeFunction("PickFirst1", List.class, "_M_PickFirst1");
	final public static DynamicFunctionDescriptor _M_Foldl = makeFunction("Foldl", List.class, "_M_Foldl");
	final public static DynamicFunctionDescriptor _M_ContainsDuplicates = makeFunction(
			"ContainsDuplicates", List.class, "_M_ContainsDuplicates");
	final public static DynamicFunctionDescriptor _M_IfEmpty = makeFunction("IfEmpty", List.class, "_M_IfEmpty");
	final public static DynamicFunctionDescriptor _M_Head = makeFunction("Head", List.class, "_M_Head");
	final public static DynamicFunctionDescriptor _M_Partition = makeFunction("Partition", List.class, "_M_Partition");
	final public static DynamicFunctionDescriptor _M_ListEqual = makeFunction("ListEqual", List.class, "_M_ListEqual");
	final public static DynamicFunctionDescriptor _M_IfSingleton = makeFunction("IfSingleton", List.class, "_M_IfSingleton");
	final public static DynamicFunctionDescriptor _M_Tail = makeFunction("Tail", List.class, "_M_Tail");
	final public static DynamicFunctionDescriptor _M_At = makeFunction("At", List.class, "_M_At");
	final public static DynamicFunctionDescriptor _M_Map2 = makeFunction("Map2", List.class, "_M_Map2");
	final public static DynamicFunctionDescriptor _M_Intersect = makeFunction("Intersect", List.class, "_M_Intersect");
	final public static DynamicFunctionDescriptor _M_Concat = makeFunction("Concat", List.class, "_M_Concat");
	final public static DynamicFunctionDescriptor _M_Elem = makeFunction("Elem", List.class, "_M_Elem");
	final public static DynamicFunctionDescriptor _M_Union = makeFunction("Union", List.class, "_M_Union");
	final public static DynamicFunctionDescriptor _M_ConditionalInsert = makeFunction(
			"ConditionalInsert", List.class, "_M_ConditionalInsert");
	final public static DynamicFunctionDescriptor _M_Insert = makeFunction("Insert", List.class, "_M_Insert");
	final public static DynamicFunctionDescriptor _M_IWrapFoldlP = makeFunction("IWrapFoldlP", List.class, "_M_IWrapFoldlP");
	final public static DynamicFunctionDescriptor _M_MatchPartition = makeFunction(
			"MatchPartition", List.class, "_M_MatchPartition");
	final public static DynamicFunctionDescriptor _M_FoldlP = makeFunction("FoldlP", List.class, "_M_FoldlP");
	final public static DynamicFunctionDescriptor _M_PickFirst = makeFunction("PickFirst", List.class, "_M_PickFirst");
	final public static DynamicFunctionDescriptor _M_Reverse = makeFunction("Reverse", List.class, "_M_Reverse");
	final public static DynamicFunctionDescriptor _M_Null = makeFunction("Null", List.class, "_M_Null");
	final public static DynamicFunctionDescriptor _M_Zip = makeFunction("Zip", List.class, "_M_Zip");
	final public static DynamicFunctionDescriptor _M_IsEmpty = makeFunction("IsEmpty", List.class, "_M_IsEmpty");

	final public static boolean _M_Foldr(Sink sink, Variable var, Variable var_57, Term term, Term term_3, Term term_79)
	{
		if (sink.context().sd++ < 256)
		{
			label :
			{
				/* #F=term */
				/* #Z=term */
				term_79 = force(sink.context(), term_79);
				if (term_79.descriptor() != _M_Nil)
				{
					break label;
				}
				sink.copy(term_3.ref());
				return true;
			}
			label_54 :
			{
				/* #F=term */
				/* #Z=term */
				term_79 = force(sink.context(), term_79);
				if (term_79.descriptor() != _M_Cons)
				{
					break label_54;
				}
				Term sub = term_79.sub(0).ref();
				/* #H=sub */
				Term sub_11 = term_79.sub(1).ref();
				/* #T=sub */Term jterm;
				{
					BufferSink buffer = sink.context().makeBuffer();
					buffer.copy(sub.ref());
					jterm = buffer.term();
				}
				Term jterm_25;
				{
					BufferSink buffer_36 = sink.context().makeBuffer();
					buffer_36.start(_M_Foldr);
					Variable jvar = buffer_36.context().makeVariable("x");
					Variable jvar_17 = buffer_36.context().makeVariable("x");
					buffer_36.binds(new Variable[]
						{jvar, jvar_17});
					Term jterm_3;
					{
						BufferSink buffer_60 = buffer_36.context().makeBuffer();
						buffer_60.use(jvar);
						jterm_3 = buffer_60.term();
					}
					Term jterm_7;
					{
						BufferSink buffer_41 = buffer_36.context().makeBuffer();
						buffer_41.use(jvar_17);
						jterm_7 = buffer_41.term();
					}
					buffer_36.substitute(term.ref(), new Variable[]
						{var, var_57}, new Term[]
						{jterm_3, jterm_7});
					buffer_36.copy(term_3.ref());
					buffer_36.copy(sub_11.ref());
					buffer_36.end();
					jterm_25 = buffer_36.term();
				}
				sink.substitute(term.ref(), new Variable[]
					{var, var_57}, new Term[]
					{jterm, jterm_25});
				return true;
			}
		}
		return thunk(sink, _M_Foldr);
	}

	final public static boolean _M_Map(Sink sink, Variable var_96, Term term_46, Term term_22)
	{
		if (sink.context().sd++ < 256)
		{
			label_67 :
			{
				/* #=term */
				term_22 = force(sink.context(), term_22);
				if (term_22.descriptor() != _M_Nil)
				{
					break label_67;
				}
				sink.start(_M_Nil);
				sink.end();
				return true;
			}
			label_22 :
			{
				/* #=term */
				term_22 = force(sink.context(), term_22);
				if (term_22.descriptor() != _M_Cons)
				{
					break label_22;
				}
				Term sub_21 = term_22.sub(0).ref();
				/* #1=sub */
				Term sub_83 = term_22.sub(1).ref();
				/* #s=sub */
				sink.start(_M_Cons);
				Term jterm_0;
				{
					BufferSink buffer_57 = sink.context().makeBuffer();
					buffer_57.copy(sub_21.ref());
					jterm_0 = buffer_57.term();
				}
				sink.substitute(term_46.ref(), new Variable[]
					{var_96}, new Term[]
					{jterm_0});
				sink.start(_M_Cons);
				sink.start(_M_Map);
				Variable jvar_19 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_19});
				Term jterm_95;
				{
					BufferSink buffer_33 = sink.context().makeBuffer();
					buffer_33.use(jvar_19);
					jterm_95 = buffer_33.term();
				}
				sink.substitute(term_46.ref(), new Variable[]
					{var_96}, new Term[]
					{jterm_95});
				sink.copy(sub_83.ref());
				sink.end();
				sink.start(_M_Nil);
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Map);
	}

	final public static boolean _M_LookUp(Sink sink, Term term_7, Term term_58)
	{
		if (sink.context().sd++ < 256)
		{
			label_9 :
			{
				/* #Key=term */
				/* #KeyValueList=term */
				sink.start(_M_Map);
				Variable jvar_9 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_9});
				sink.start(_M_Snd);
				sink.use(jvar_9);
				sink.end();
				sink.start(_M_Filter);
				Variable jvar_74 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_74});
				sink.start(_M_Equal);
				sink.copy(term_7.ref());
				sink.start(_M_Fst);
				sink.use(jvar_74);
				sink.end();
				sink.end();
				sink.copy(term_58.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_LookUp);
	}

	final public static boolean _M_DelEntry(Sink sink, Term term_41, Term term_82)
	{
		if (sink.context().sd++ < 256)
		{
			label_34 :
			{
				/* #Key=term */
				/* #KeyValueList=term */
				sink.start(_M_Filter);
				Variable jvar_84 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_84});
				sink.start(_M_Not);
				sink.start(_M_Equal);
				sink.start(_M_Fst);
				sink.use(jvar_84);
				sink.end();
				sink.copy(term_41.ref());
				sink.end();
				sink.end();
				sink.copy(term_82.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_DelEntry);
	}

	final public static boolean _M_Filter(Sink sink, Variable var_1, Term term_93, Term term_78)
	{
		if (sink.context().sd++ < 256)
		{
			label_85 :
			{
				/* #C=term */
				/* #XS=term */
				sink.start(_M_Foldr);
				Variable jvar_87 = sink.context().makeVariable("x");
				Variable jvar_4 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_87, jvar_4});
				sink.start(_M_ConditionalInsert);
				Term jterm_22;
				{
					BufferSink buffer_77 = sink.context().makeBuffer();
					buffer_77.use(jvar_87);
					jterm_22 = buffer_77.term();
				}
				sink.substitute(term_93.ref(), new Variable[]
					{var_1}, new Term[]
					{jterm_22});
				sink.use(jvar_87);
				sink.use(jvar_4);
				sink.end();
				sink.start(_M_Nil);
				sink.end();
				sink.copy(term_78.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Filter);
	}

	final public static boolean _M_MapM(Sink sink, Variable var_12, Variable var_99, Term term_60, Term term_35, Term term_74)
	{
		if (sink.context().sd++ < 256)
		{
			label_33 :
			{
				/* #=term */
				/* #state=term */
				/* #s=term */
				sink.start(_M_MapM2);
				Variable jvar_76 = sink.context().makeVariable("x");
				Variable jvar_7 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_76, jvar_7});
				Term jterm_83;
				{
					BufferSink buffer_81 = sink.context().makeBuffer();
					buffer_81.use(jvar_76);
					jterm_83 = buffer_81.term();
				}
				Term jterm_35;
				{
					BufferSink buffer_20 = sink.context().makeBuffer();
					buffer_20.use(jvar_7);
					jterm_35 = buffer_20.term();
				}
				sink.substitute(term_60.ref(), new Variable[]
					{var_12, var_99}, new Term[]
					{jterm_83, jterm_35});
				sink.copy(term_35.ref());
				sink.copy(term_74.ref());
				sink.start(_M_Nil);
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_MapM);
	}

	final public static boolean _M_Length(Sink sink, Term term_5)
	{
		if (sink.context().sd++ < 256)
		{
			label_6 :
			{
				/* #XS=term */
				sink.start(_M_IWrapFoldlP);
				Variable jvar_82 = sink.context().makeVariable("x");
				Variable jvar_2 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_82, jvar_2});
				sink.start(_M_NumberPlus);
				sink.literal(1);
				sink.use(jvar_2);
				sink.end();
				sink.literal(0);
				sink.copy(term_5.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Length);
	}

	final public static boolean _M_IsNotEmpty(Sink sink, Term term_16)
	{
		if (sink.context().sd++ < 256)
		{
			label_59 :
			{
				term_16 = force(sink.context(), term_16);
				if (term_16.descriptor() != _M_Nil)
				{
					break label_59;
				}
				sink.start(_M_FALSE);
				sink.end();
				return true;
			}
			label_80 :
			{
				term_16 = force(sink.context(), term_16);
				if (term_16.descriptor() != _M_Cons)
				{
					break label_80;
				}
				Term sub_68 = term_16.sub(0).ref();
				/* #=sub */
				Term sub_46 = term_16.sub(1).ref();
				/* #s=sub */ sink.start(_M_TRUE);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_IsNotEmpty);
	}

	final public static boolean _M_Append(Sink sink, Term term_171, Term term_97)
	{
		if (sink.context().sd++ < 256)
		{
			label_146 :
			{
				/* #x=term */
				term_97 = force(sink.context(), term_97);
				if (term_97.descriptor() != _M_Nil)
				{
					break label_146;
				}
				sink.copy(term_171.ref());
				return true;
			}
			label_223 :
			{
				/* #x=term */
				term_97 = force(sink.context(), term_97);
				if (term_97.descriptor() != _M_Cons)
				{
					break label_223;
				}
				Term sub_66 = term_97.sub(0).ref();
				/* #1=sub */
				Term sub_51 = term_97.sub(1).ref();
				/* #s=sub */
				sink.start(_M_Cons);
				sink.copy(sub_66.ref());
				sink.start(_M_Cons);
				sink.start(_M_Append);
				sink.copy(term_171.ref());
				sink.copy(sub_51.ref());
				sink.end();
				sink.start(_M_Nil);
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Append);
	}

	final public static boolean _M_IsSingleton(Sink sink, Term term_11)
	{
		if (sink.context().sd++ < 256)
		{
			label_40 :
			{
				term_11 = force(sink.context(), term_11);
				if (term_11.descriptor() != _M_Nil)
				{
					break label_40;
				}
				sink.start(_M_FALSE);
				sink.end();
				return true;
			}
			label_13 :
			{
				term_11 = force(sink.context(), term_11);
				if (term_11.descriptor() != _M_Cons)
				{
					break label_13;
				}
				Term sub_35 = term_11.sub(0).ref();
				/* #=sub */
				Term sub_95 = term_11.sub(1).ref();
				/* #s=sub */
				sink.start(_M_IsEmpty);
				sink.copy(sub_95.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_IsSingleton);
	}

	final public static boolean _M_RemoveDuplicates(Sink sink, Term term_43)
	{
		if (sink.context().sd++ < 256)
		{
			label_3 :
			{
				term_43 = force(sink.context(), term_43);
				if (term_43.descriptor() != _M_Nil)
				{
					break label_3;
				}
				sink.start(_M_Nil);
				sink.end();
				return true;
			}
			label_4 :
			{
				term_43 = force(sink.context(), term_43);
				if (term_43.descriptor() != _M_Cons)
				{
					break label_4;
				}
				Term sub_79 = term_43.sub(0).ref();
				/* #X=sub */
				Term sub_74 = term_43.sub(1).ref();
				/* #XS=sub */
				sink.start(_M_Insert);
				sink.copy(sub_79.ref());
				sink.start(_M_RemoveDuplicates);
				sink.start(_M_Filter);
				Variable jvar_80 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_80});
				sink.start(_M_Not);
				sink.start(_M_Equal);
				sink.use(jvar_80);
				sink.copy(sub_79.ref());
				sink.end();
				sink.end();
				sink.copy(sub_74.ref());
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_RemoveDuplicates);
	}

	final public static boolean _M_MapM2(Sink sink, Variable var_72, Variable var_95, Term term_42, Term term_1, Term term_89, Term term_40)
	{
		if (sink.context().sd++ < 256)
		{
			label_73 :
			{
				/* #=term */
				/* #state=term */
				term_89 = force(sink.context(), term_89);
				if (term_89.descriptor() != _M_Nil)
				{
					break label_73;
				}
				/* #rs=term */
				sink.start(_M_PairCons);
				sink.copy(term_1.ref());
				sink.copy(term_40.ref());
				sink.end();
				return true;
			}
			label_96 :
			{
				/* #=term */
				/* #state=term */
				term_89 = force(sink.context(), term_89);
				if (term_89.descriptor() != _M_Cons)
				{
					break label_96;
				}
				Term sub_55 = term_89.sub(0).ref();
				/* #1=sub */
				Term sub_25 = term_89.sub(1).ref();
				/* #s=sub */
				/* #rs=term */
				sink.start(_M_MapM3);
				Term jterm_8;
				{
					BufferSink buffer_44 = sink.context().makeBuffer();
					buffer_44.copy(term_1.ref());
					jterm_8 = buffer_44.term();
				}
				Term jterm_86;
				{
					BufferSink buffer_10 = sink.context().makeBuffer();
					buffer_10.copy(sub_55.ref());
					jterm_86 = buffer_10.term();
				}
				sink.substitute(term_42.ref(), new Variable[]
					{var_72, var_95}, new Term[]
					{jterm_8, jterm_86});
				Variable jvar_44 = sink.context().makeVariable("x");
				Variable jvar_72 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_44, jvar_72});
				Term jterm_48;
				{
					BufferSink buffer_64 = sink.context().makeBuffer();
					buffer_64.use(jvar_44);
					jterm_48 = buffer_64.term();
				}
				Term jterm_73;
				{
					BufferSink buffer_66 = sink.context().makeBuffer();
					buffer_66.use(jvar_72);
					jterm_73 = buffer_66.term();
				}
				sink.substitute(term_42.ref(), new Variable[]
					{var_72, var_95}, new Term[]
					{jterm_48, jterm_73});
				sink.copy(sub_25.ref());
				sink.copy(term_40.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_MapM2);
	}

	final public static boolean _M_MapM3(Sink sink, Term term_13, Variable var_7, Variable var_37, Term term_83, Term term_55, Term term_19)
	{
		if (sink.context().sd++ < 256)
		{
			label_62 :
			{
				term_13 = force(sink.context(), term_13);
				if (term_13.descriptor() != _M_PairCons)
				{
					break label_62;
				}
				Term sub_3 = term_13.sub(0).ref();
				/* #nstate=sub */
				Term sub_57 = term_13.sub(1).ref();
				/* #r=sub */
				/* #=term */
				/* #s=term */
				/* #rs=term */
				sink.start(_M_MapM2);
				Variable jvar_18 = sink.context().makeVariable("x");
				Variable jvar_75 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_18, jvar_75});
				Term jterm_29;
				{
					BufferSink buffer_18 = sink.context().makeBuffer();
					buffer_18.use(jvar_18);
					jterm_29 = buffer_18.term();
				}
				Term jterm_26;
				{
					BufferSink buffer_91 = sink.context().makeBuffer();
					buffer_91.use(jvar_75);
					jterm_26 = buffer_91.term();
				}
				sink.substitute(term_83.ref(), new Variable[]
					{var_7, var_37}, new Term[]
					{jterm_29, jterm_26});
				sink.copy(sub_3.ref());
				sink.copy(term_55.ref());
				sink.start(_M_Append);
				sink.copy(sub_57.ref());
				sink.copy(term_19.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_MapM3);
	}

	final public static boolean _M_Flatten(Sink sink, Term term_37)
	{
		if (sink.context().sd++ < 256)
		{
			label_16 :
			{
				term_37 = force(sink.context(), term_37);
				if (term_37.descriptor() != _M_Nil)
				{
					break label_16;
				}
				sink.start(_M_Nil);
				sink.end();
				return true;
			}
			label_10 :
			{
				term_37 = force(sink.context(), term_37);
				if (term_37.descriptor() != _M_Cons)
				{
					break label_10;
				}
				Term sub_158 = term_37.sub(0).ref();
				/* #1=sub */
				Term sub_30 = term_37.sub(1).ref();
				/* #s=sub */
				sink.start(_M_Concat);
				sink.copy(sub_158.ref());
				sink.start(_M_Flatten);
				sink.copy(sub_30.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Flatten);
	}

	final public static boolean _M_PickFirst1(Sink sink, Term term_17, Term term_65, Term term_4, Variable var_98, Term term_99)
	{
		if (sink.context().sd++ < 256)
		{
			label_17 :
			{
				term_17 = force(sink.context(), term_17);
				if (term_17.descriptor() != _M_TRUE)
				{
					break label_17;
				}
				/* #1=term */
				/* #s=term */
				/* #=term */
				sink.start(_M_SOME);
				sink.copy(term_65.ref());
				sink.end();
				return true;
			}
			label_58 :
			{
				term_17 = force(sink.context(), term_17);
				if (term_17.descriptor() != _M_FALSE)
				{
					break label_58;
				}
				/* #1=term */
				/* #s=term */
				/* #=term */
				sink.start(_M_PickFirst);
				sink.copy(term_4.ref());
				Variable jvar_48 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_48});
				Term jterm_34;
				{
					BufferSink buffer_13 = sink.context().makeBuffer();
					buffer_13.use(jvar_48);
					jterm_34 = buffer_13.term();
				}
				sink.substitute(term_99.ref(), new Variable[]
					{var_98}, new Term[]
					{jterm_34});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_PickFirst1);
	}

	final public static boolean _M_Foldl(Sink sink, Variable var_8, Variable var_31, Term term_98, Term term_191, Term term_183)
	{
		if (sink.context().sd++ < 256)
		{
			label_110 :
			{
				/* #F=term */
				/* #Z=term */
				term_183 = force(sink.context(), term_183);
				if (term_183.descriptor() != _M_Nil)
				{
					break label_110;
				}
				sink.copy(term_191.ref());
				return true;
			}
			label_68 :
			{
				/* #F=term */
				/* #Z=term */
				term_183 = force(sink.context(), term_183);
				if (term_183.descriptor() != _M_Cons)
				{
					break label_68;
				}
				Term sub_96 = term_183.sub(0).ref();
				/* #H=sub */
				Term sub_67 = term_183.sub(1).ref();
				/* #T=sub */
				sink.start(_M_Foldl);
				Variable jvar_13 = sink.context().makeVariable("x");
				Variable jvar_21 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_13, jvar_21});
				Term jterm_88;
				{
					BufferSink buffer_74 = sink.context().makeBuffer();
					buffer_74.use(jvar_13);
					jterm_88 = buffer_74.term();
				}
				Term jterm_42;
				{
					BufferSink buffer_26 = sink.context().makeBuffer();
					buffer_26.use(jvar_21);
					jterm_42 = buffer_26.term();
				}
				sink.substitute(term_98.ref(), new Variable[]
					{var_8, var_31}, new Term[]
					{jterm_88, jterm_42});
				Term jterm_85;
				{
					BufferSink buffer_31 = sink.context().makeBuffer();
					buffer_31.copy(sub_96.ref());
					jterm_85 = buffer_31.term();
				}
				Term jterm_175;
				{
					BufferSink buffer_191 = sink.context().makeBuffer();
					buffer_191.copy(term_191.ref());
					jterm_175 = buffer_191.term();
				}
				sink.substitute(term_98.ref(), new Variable[]
					{var_8, var_31}, new Term[]
					{jterm_85, jterm_175});
				sink.copy(sub_67.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Foldl);
	}

	final public static boolean _M_ContainsDuplicates(Sink sink, Term term_53)
	{
		if (sink.context().sd++ < 256)
		{
			label_28 :
			{
				term_53 = force(sink.context(), term_53);
				if (term_53.descriptor() != _M_Nil)
				{
					break label_28;
				}
				sink.start(_M_FALSE);
				sink.end();
				return true;
			}
			label_70 :
			{
				term_53 = force(sink.context(), term_53);
				if (term_53.descriptor() != _M_Cons)
				{
					break label_70;
				}
				Term sub_123 = term_53.sub(0).ref();
				/* #H=sub */
				Term sub_93 = term_53.sub(1).ref();
				/* #T=sub */
				sink.start(_M_Or);
				sink.start(_M_Elem);
				sink.copy(sub_123.ref());
				sink.copy(sub_93.ref());
				sink.end();
				sink.start(_M_ContainsDuplicates);
				sink.copy(sub_93.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_ContainsDuplicates);
	}

	final public static boolean _M_IfEmpty(Sink sink, Term term_51, Term term_94, Term term_155)
	{
		if (sink.context().sd++ < 256)
		{
			label_64 :
			{
				term_51 = force(sink.context(), term_51);
				if (term_51.descriptor() != _M_Nil)
				{
					break label_64;
				}
				/* #1=term */ /* #2=term */ sink.copy(term_94.ref());
				return true;
			}
			label_20 :
			{
				term_51 = force(sink.context(), term_51);
				if (term_51.descriptor() != _M_Cons)
				{
					break label_20;
				}
				Term sub_223 = term_51.sub(0).ref();
				/* #=sub */
				Term sub_24 = term_51.sub(1).ref();
				/* #s=sub */
				/* #1=term */ /* #2=term */ sink.copy(term_155.ref());
				return true;
			}
		}
		return thunk(sink, _M_IfEmpty);
	}

	final public static boolean _M_Head(Sink sink, Term term_76)
	{
		if (sink.context().sd++ < 256)
		{
			label_69 :
			{
				term_76 = force(sink.context(), term_76);
				if (term_76.descriptor() != _M_Nil)
				{
					break label_69;
				}
				sink.start(_M_Error);
				sink.literal("Head of empty list");
				sink.end();
				return true;
			}
			label_65 :
			{
				term_76 = force(sink.context(), term_76);
				if (term_76.descriptor() != _M_Cons)
				{
					break label_65;
				}
				Term sub_44 = term_76.sub(0).ref();
				/* #=sub */
				Term sub_65 = term_76.sub(1).ref();
				/* #s=sub */ sink.copy(sub_44.ref());
				return true;
			}
		}
		return thunk(sink, _M_Head);
	}

	final public static boolean _M_Partition(Sink sink, Variable var_3, Term term_31, Term term_70)
	{
		if (sink.context().sd++ < 256)
		{
			label_155 :
			{
				/* #C=term */
				/* #XS=term */
				sink.start(_M_Foldr);
				Variable jvar_45 = sink.context().makeVariable("x");
				Variable jvar_91 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_45, jvar_91});
				sink.start(_M_MatchPartition);
				Term jterm_77;
				{
					BufferSink buffer_43 = sink.context().makeBuffer();
					buffer_43.use(jvar_45);
					jterm_77 = buffer_43.term();
				}
				sink.substitute(term_31.ref(), new Variable[]
					{var_3}, new Term[]
					{jterm_77});
				sink.use(jvar_45);
				sink.use(jvar_91);
				sink.end();
				sink.start(_M_PairCons);
				sink.start(_M_Nil);
				sink.end();
				sink.start(_M_Nil);
				sink.end();
				sink.end();
				sink.copy(term_70.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Partition);
	}

	final public static boolean _M_ListEqual(Sink sink, Variable var_71, Variable var_86, Term term_80, Term term_27, Term term_67)
	{
		if (sink.context().sd++ < 256)
		{
			label_2 :
			{
				/* #C=term */
				term_27 = force(sink.context(), term_27);
				if (term_27.descriptor() != _M_Nil)
				{
					break label_2;
				}
				term_67 = force(sink.context(), term_67);
				if (term_67.descriptor() != _M_Nil)
				{
					break label_2;
				}
				sink.start(_M_TRUE);
				sink.end();
				return true;
			}
			label_57 :
			{
				/* #C=term */
				term_27 = force(sink.context(), term_27);
				if (term_27.descriptor() != _M_Cons)
				{
					break label_57;
				}
				Term sub_27 = term_27.sub(0).ref();
				/* #x=sub */
				Term sub_48 = term_27.sub(1).ref();
				/* #xs=sub */
				term_67 = force(sink.context(), term_67);
				if (term_67.descriptor() != _M_Nil)
				{
					break label_57;
				}
				sink.start(_M_FALSE);
				sink.end();
				return true;
			}
			label_35 :
			{
				/* #C=term */
				term_27 = force(sink.context(), term_27);
				if (term_27.descriptor() != _M_Nil)
				{
					break label_35;
				}
				term_67 = force(sink.context(), term_67);
				if (term_67.descriptor() != _M_Cons)
				{
					break label_35;
				}
				Term sub_36 = term_67.sub(0).ref();
				/* #y=sub */
				Term sub_40 = term_67.sub(1).ref();
				/* #ys=sub */ sink.start(_M_FALSE);
				sink.end();
				return true;
			}
			label_181 :
			{
				/* #C=term */
				term_27 = force(sink.context(), term_27);
				if (term_27.descriptor() != _M_Cons)
				{
					break label_181;
				}
				Term sub_18 = term_27.sub(0).ref();
				/* #x=sub */
				Term sub_77 = term_27.sub(1).ref();
				/* #xs=sub */
				term_67 = force(sink.context(), term_67);
				if (term_67.descriptor() != _M_Cons)
				{
					break label_181;
				}
				Term sub_20 = term_67.sub(0).ref();
				/* #y=sub */
				Term sub_87 = term_67.sub(1).ref();
				/* #ys=sub */
				sink.start(_M_And);
				Term jterm_58;
				{
					BufferSink buffer_9 = sink.context().makeBuffer();
					buffer_9.copy(sub_18.ref());
					jterm_58 = buffer_9.term();
				}
				Term jterm_38;
				{
					BufferSink buffer_80 = sink.context().makeBuffer();
					buffer_80.copy(sub_20.ref());
					jterm_38 = buffer_80.term();
				}
				sink.substitute(term_80.ref(), new Variable[]
					{var_71, var_86}, new Term[]
					{jterm_58, jterm_38});
				sink.start(_M_ListEqual);
				Variable jvar_47 = sink.context().makeVariable("x");
				Variable jvar_183 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_47, jvar_183});
				Term jterm_32;
				{
					BufferSink buffer_54 = sink.context().makeBuffer();
					buffer_54.use(jvar_47);
					jterm_32 = buffer_54.term();
				}
				Term jterm_40;
				{
					BufferSink buffer_25 = sink.context().makeBuffer();
					buffer_25.use(jvar_183);
					jterm_40 = buffer_25.term();
				}
				sink.substitute(term_80.ref(), new Variable[]
					{var_71, var_86}, new Term[]
					{jterm_32, jterm_40});
				sink.copy(sub_77.ref());
				sink.copy(sub_87.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_ListEqual);
	}

	final public static boolean _M_IfSingleton(Sink sink, Term term_88, Term term_10, Term term_0)
	{
		if (sink.context().sd++ < 256)
		{
			label_71 :
			{
				term_88 = force(sink.context(), term_88);
				if (term_88.descriptor() != _M_Nil)
				{
					break label_71;
				}
				/* #1=term */ /* #2=term */ sink.copy(term_0.ref());
				return true;
			}
			label_72 :
			{
				term_88 = force(sink.context(), term_88);
				if (term_88.descriptor() != _M_Cons)
				{
					break label_72;
				}
				Term sub_31 = term_88.sub(0).ref();
				/* #=sub */
				Term sub_62 = term_88.sub(1).ref();
				/* #s=sub */
				/* #1=term */
				/* #2=term */
				sink.start(_M_IfEmpty);
				sink.copy(sub_62.ref());
				sink.copy(term_10.ref());
				sink.copy(term_0.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_IfSingleton);
	}

	final public static boolean _M_Tail(Sink sink, Term term_115)
	{
		if (sink.context().sd++ < 256)
		{
			label_61 :
			{
				term_115 = force(sink.context(), term_115);
				if (term_115.descriptor() != _M_Nil)
				{
					break label_61;
				}
				sink.start(_M_Error);
				sink.literal("Tail of empty list");
				sink.end();
				return true;
			}
			label_272 :
			{
				term_115 = force(sink.context(), term_115);
				if (term_115.descriptor() != _M_Cons)
				{
					break label_272;
				}
				Term sub_73 = term_115.sub(0).ref();
				/* #=sub */
				Term sub_91 = term_115.sub(1).ref();
				/* #s=sub */ sink.copy(sub_91.ref());
				return true;
			}
		}
		return thunk(sink, _M_Tail);
	}

	final public static boolean _M_At(Sink sink, Term term_30, Term term_129)
	{
		if (sink.context().sd++ < 256)
		{
			label_39 :
			{
				term_30 = force(sink.context(), term_30);
				if (term_30.descriptor() != _M_Nil)
				{
					break label_39;
				}
				/* #i=term */ sink.start(_M_NONE);
				sink.end();
				return true;
			}
			label_12 :
			{
				term_30 = force(sink.context(), term_30);
				if (term_30.descriptor() != _M_Cons)
				{
					break label_12;
				}
				Term sub_99 = term_30.sub(0).ref();
				/* #=sub */
				Term sub_58 = term_30.sub(1).ref();
				/* #s=sub */
				/* #i=term */
				sink.start(_M_If);
				sink.start(_M_Equal);
				sink.copy(term_129.ref());
				sink.literal(0);
				sink.end();
				sink.start(_M_SOME);
				sink.copy(sub_99.ref());
				sink.end();
				sink.start(_M_At);
				sink.copy(sub_58.ref());
				sink.start(_M_Minus);
				sink.copy(term_129.ref());
				sink.literal(1);
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_At);
	}

	final public static boolean _M_Map2(Sink sink, Variable var_59, Term term_54, Term term_95)
	{
		if (sink.context().sd++ < 256)
		{
			label_260 :
			{
				/* #F=term */
				/* #XS=term */
				sink.start(_M_Foldr);
				Variable jvar_81 = sink.context().makeVariable("x");
				Variable jvar_28 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_81, jvar_28});
				sink.start(_M_Insert);
				Term jterm_41;
				{
					BufferSink buffer_28 = sink.context().makeBuffer();
					buffer_28.use(jvar_81);
					jterm_41 = buffer_28.term();
				}
				sink.substitute(term_54.ref(), new Variable[]
					{var_59}, new Term[]
					{jterm_41});
				sink.use(jvar_28);
				sink.end();
				sink.start(_M_Nil);
				sink.end();
				sink.copy(term_95.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Map2);
	}

	final public static boolean _M_Intersect(Sink sink, Term term_101, Term term_175)
	{
		if (sink.context().sd++ < 256)
		{
			label_161 :
			{
				/* #XS=term */
				/* #YS=term */
				sink.start(_M_Foldr);
				Variable jvar_95 = sink.context().makeVariable("x");
				Variable jvar_67 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_95, jvar_67});
				sink.start(_M_ConditionalInsert);
				sink.start(_M_Elem);
				sink.use(jvar_95);
				sink.copy(term_175.ref());
				sink.end();
				sink.use(jvar_95);
				sink.use(jvar_67);
				sink.end();
				sink.start(_M_Nil);
				sink.end();
				sink.copy(term_101.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Intersect);
	}

	final public static boolean _M_Concat(Sink sink, Term term_280, Term term_186)
	{
		if (sink.context().sd++ < 256)
		{
			label_129 :
			{
				term_280 = force(sink.context(), term_280);
				if (term_280.descriptor() != _M_Nil)
				{
					break label_129;
				}
				/* #tail=term */ sink.copy(term_186.ref());
				return true;
			}
			label_83 :
			{
				term_280 = force(sink.context(), term_280);
				if (term_280.descriptor() != _M_Cons)
				{
					break label_83;
				}
				Term sub_61 = term_280.sub(0).ref();
				/* #1=sub */
				Term sub_15 = term_280.sub(1).ref();
				/* #s=sub */
				/* #tail=term */
				sink.start(_M_Cons);
				sink.copy(sub_61.ref());
				sink.start(_M_Cons);
				sink.start(_M_Concat);
				sink.copy(sub_15.ref());
				sink.copy(term_186.ref());
				sink.end();
				sink.start(_M_Nil);
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Concat);
	}

	final public static boolean _M_Elem(Sink sink, Term term_156, Term term_26)
	{
		if (sink.context().sd++ < 256)
		{
			label_144 :
			{
				/* #X=term */
				/* #XS=term */
				sink.start(_M_Foldr);
				Variable jvar_61 = sink.context().makeVariable("x");
				Variable jvar_36 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_61, jvar_36});
				sink.start(_M_Or);
				sink.start(_M_Equal);
				sink.copy(term_156.ref());
				sink.use(jvar_61);
				sink.end();
				sink.use(jvar_36);
				sink.end();
				sink.start(_M_FALSE);
				sink.end();
				sink.copy(term_26.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Elem);
	}

	final public static boolean _M_Union(Sink sink, Term term_2, Term term_72)
	{
		if (sink.context().sd++ < 256)
		{
			label_1 :
			{
				/* #XS=term */
				/* #YS=term */
				sink.start(_M_RemoveDuplicates);
				sink.start(_M_Concat);
				sink.copy(term_2.ref());
				sink.copy(term_72.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Union);
	}

	final public static boolean _M_ConditionalInsert(Sink sink, Term term_62, Term term_114, Term term_69)
	{
		if (sink.context().sd++ < 256)
		{
			label_75 :
			{
				term_62 = force(sink.context(), term_62);
				if (term_62.descriptor() != _M_TRUE)
				{
					break label_75;
				}
				/* #X=term */
				/* #XS=term */
				sink.start(_M_Insert);
				sink.copy(term_114.ref());
				sink.copy(term_69.ref());
				sink.end();
				return true;
			}
			label_147 :
			{
				term_62 = force(sink.context(), term_62);
				if (term_62.descriptor() != _M_FALSE)
				{
					break label_147;
				}
				/* #X=term */ /* #XS=term */ sink.copy(term_69.ref());
				return true;
			}
		}
		return thunk(sink, _M_ConditionalInsert);
	}

	final public static boolean _M_Insert(Sink sink, Term term_195, Term term_176)
	{
		if (sink.context().sd++ < 256)
		{
			label_104 :
			{
				/* #X=term */
				/* #XS=term */
				sink.start(_M_Cons);
				sink.copy(term_195.ref());
				sink.start(_M_Cons);
				sink.copy(term_176.ref());
				sink.start(_M_Nil);
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Insert);
	}

	final public static boolean _M_IWrapFoldlP(Sink sink, Variable var_77, Variable var_84, Term term_118, Term term_21, Term term_68)
	{
		if (sink.context().sd++ < 256)
		{
			label_77 :
			{
				/* #F=term */
				/* #Z=term */
				/* #XS=term */
				sink.start(_M_FoldlP);
				Variable jvar_125 = sink.context().makeVariable("x");
				Variable jvar_41 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_125, jvar_41});
				Term jterm_60;
				{
					BufferSink buffer_73 = sink.context().makeBuffer();
					buffer_73.use(jvar_125);
					jterm_60 = buffer_73.term();
				}
				Term jterm_89;
				{
					BufferSink buffer_29 = sink.context().makeBuffer();
					buffer_29.use(jvar_41);
					jterm_89 = buffer_29.term();
				}
				sink.substitute(term_118.ref(), new Variable[]
					{var_77, var_84}, new Term[]
					{jterm_60, jterm_89});
				sink.copy(term_21.ref());
				sink.copy(term_68.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_IWrapFoldlP);
	}

	final public static boolean _M_MatchPartition(Sink sink, Term term_12, Term term_14, Term term_38)
	{
		if (sink.context().sd++ < 256)
		{
			label_30 :
			{
				term_12 = force(sink.context(), term_12);
				if (term_12.descriptor() != _M_TRUE)
				{
					break label_30;
				}
				/* #X=term */
				term_38 = force(sink.context(), term_38);
				if (term_38.descriptor() != _M_PairCons)
				{
					break label_30;
				}
				Term sub_28 = term_38.sub(0).ref();
				/* #TS=sub */
				Term sub_94 = term_38.sub(1).ref();
				/* #FS=sub */
				sink.start(_M_PairCons);
				sink.start(_M_Insert);
				sink.copy(term_14.ref());
				sink.copy(sub_28.ref());
				sink.end();
				sink.copy(sub_94.ref());
				sink.end();
				return true;
			}
			label_94 :
			{
				term_12 = force(sink.context(), term_12);
				if (term_12.descriptor() != _M_FALSE)
				{
					break label_94;
				}
				/* #X=term */
				term_38 = force(sink.context(), term_38);
				if (term_38.descriptor() != _M_PairCons)
				{
					break label_94;
				}
				Term sub_171 = term_38.sub(0).ref();
				/* #TS=sub */
				Term sub_170 = term_38.sub(1).ref();
				/* #FS=sub */
				sink.start(_M_PairCons);
				sink.copy(sub_171.ref());
				sink.start(_M_Insert);
				sink.copy(term_14.ref());
				sink.copy(sub_170.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_MatchPartition);
	}

	final public static boolean _M_FoldlP(Sink sink, Variable var_167, Variable var_19, Term term_164, Term term_59, Term term_134)
	{
		if (sink.context().sd++ < 256)
		{
			label_41 :
			{
				/* #F=term */
				/* #Z=term */
				term_134 = force(sink.context(), term_134);
				if (term_134.descriptor() != _M_Nil)
				{
					break label_41;
				}
				sink.copy(term_59.ref());
				return true;
			}
			label_93 :
			{
				/* #F=term */
				/* #Z=term */
				term_134 = force(sink.context(), term_134);
				if (term_134.descriptor() != _M_Cons)
				{
					break label_93;
				}
				Term sub_90 = term_134.sub(0).ref();
				/* #H=sub */
				Term sub_43 = term_134.sub(1).ref();
				/* #T=sub */
				sink.start(_M_FoldlP);
				Variable jvar_56 = sink.context().makeVariable("x");
				Variable jvar_89 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_56, jvar_89});
				Term jterm_97;
				{
					BufferSink buffer_50 = sink.context().makeBuffer();
					buffer_50.use(jvar_56);
					jterm_97 = buffer_50.term();
				}
				Term jterm_92;
				{
					BufferSink buffer_63 = sink.context().makeBuffer();
					buffer_63.use(jvar_89);
					jterm_92 = buffer_63.term();
				}
				sink.substitute(term_164.ref(), new Variable[]
					{var_167, var_19}, new Term[]
					{jterm_97, jterm_92});
				Term jterm_67;
				{
					BufferSink buffer_79 = sink.context().makeBuffer();
					buffer_79.copy(sub_90.ref());
					jterm_67 = buffer_79.term();
				}
				Term jterm_2;
				{
					BufferSink buffer_14 = sink.context().makeBuffer();
					buffer_14.copy(term_59.ref());
					jterm_2 = buffer_14.term();
				}
				sink.substitute(term_164.ref(), new Variable[]
					{var_167, var_19}, new Term[]
					{jterm_67, jterm_2});
				sink.copy(sub_43.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_FoldlP);
	}

	final public static boolean _M_PickFirst(Sink sink, Term term_63, Variable var_123, Term term_91)
	{
		if (sink.context().sd++ < 256)
		{
			label_107 :
			{
				term_63 = force(sink.context(), term_63);
				if (term_63.descriptor() != _M_Nil)
				{
					break label_107;
				}
				/* #=term */ sink.start(_M_NONE);
				sink.end();
				return true;
			}
			label_162 :
			{
				term_63 = force(sink.context(), term_63);
				if (term_63.descriptor() != _M_Cons)
				{
					break label_162;
				}
				Term sub_53 = term_63.sub(0).ref();
				/* #1=sub */
				Term sub_144 = term_63.sub(1).ref();
				/* #s=sub */
				/* #=term */
				sink.start(_M_PickFirst1);
				Term jterm_123;
				{
					BufferSink buffer_95 = sink.context().makeBuffer();
					buffer_95.copy(sub_53.ref());
					jterm_123 = buffer_95.term();
				}
				sink.substitute(term_91.ref(), new Variable[]
					{var_123}, new Term[]
					{jterm_123});
				sink.copy(sub_53.ref());
				sink.copy(sub_144.ref());
				Variable jvar_98 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_98});
				Term jterm_6;
				{
					BufferSink buffer_278 = sink.context().makeBuffer();
					buffer_278.use(jvar_98);
					jterm_6 = buffer_278.term();
				}
				sink.substitute(term_91.ref(), new Variable[]
					{var_123}, new Term[]
					{jterm_6});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_PickFirst);
	}

	final public static boolean _M_Reverse(Sink sink, Term term_242)
	{
		if (sink.context().sd++ < 256)
		{
			label_44 :
			{
				/* #XS=term */
				sink.start(_M_Foldl);
				Variable jvar_51 = sink.context().makeVariable("x");
				Variable jvar_15 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_51, jvar_15});
				sink.start(_M_Insert);
				sink.use(jvar_51);
				sink.use(jvar_15);
				sink.end();
				sink.start(_M_Nil);
				sink.end();
				sink.copy(term_242.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Reverse);
	}

	final public static boolean _M_Null(Sink sink, Term term_141)
	{
		if (sink.context().sd++ < 256)
		{
			label_11 :
			{
				term_141 = force(sink.context(), term_141);
				if (term_141.descriptor() != _M_Nil)
				{
					break label_11;
				}
				sink.start(_M_TRUE);
				sink.end();
				return true;
			}
			label_90 :
			{
				term_141 = force(sink.context(), term_141);
				if (term_141.descriptor() != _M_Cons)
				{
					break label_90;
				}
				Term sub_98 = term_141.sub(0).ref();
				/* #H=sub */
				Term sub_227 = term_141.sub(1).ref();
				/* #T=sub */ sink.start(_M_FALSE);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Null);
	}

	final public static boolean _M_Zip(Sink sink, Term term_33, Term term_254)
	{
		if (sink.context().sd++ < 256)
		{
			label_79 :
			{
				term_33 = force(sink.context(), term_33);
				if (term_33.descriptor() != _M_Nil)
				{
					break label_79;
				}
				term_254 = force(sink.context(), term_254);
				if (term_254.descriptor() != _M_Nil)
				{
					break label_79;
				}
				sink.start(_M_Nil);
				sink.end();
				return true;
			}
			label_8 :
			{
				term_33 = force(sink.context(), term_33);
				if (term_33.descriptor() != _M_Nil)
				{
					break label_8;
				}
				/* #=term */
				sink.start(_M_Error);
				sink.literal("ListExtension.Zip: second argument list was longer");
				sink.end();
				return true;
			}
			label_95 :
			{
				/* #=term */
				term_254 = force(sink.context(), term_254);
				if (term_254.descriptor() != _M_Nil)
				{
					break label_95;
				}
				sink.start(_M_Error);
				sink.literal("ListExtension.Zip: first argument list was longer");
				sink.end();
				return true;
			}
			label_88 :
			{
				term_33 = force(sink.context(), term_33);
				if (term_33.descriptor() != _M_Cons)
				{
					break label_88;
				}
				Term sub_13 = term_33.sub(0).ref();
				/* #X=sub */
				Term sub_5 = term_33.sub(1).ref();
				/* #XS=sub */
				term_254 = force(sink.context(), term_254);
				if (term_254.descriptor() != _M_Cons)
				{
					break label_88;
				}
				Term sub_188 = term_254.sub(0).ref();
				/* #Y=sub */
				Term sub_8 = term_254.sub(1).ref();
				/* #YS=sub */
				sink.start(_M_Cons);
				sink.start(_M_PairCons);
				sink.copy(sub_13.ref());
				sink.copy(sub_188.ref());
				sink.end();
				sink.start(_M_Cons);
				sink.start(_M_Zip);
				sink.copy(sub_5.ref());
				sink.copy(sub_8.ref());
				sink.end();
				sink.start(_M_Nil);
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Zip);
	}

	final public static boolean _M_IsEmpty(Sink sink, Term term_34)
	{
		if (sink.context().sd++ < 256)
		{
			label_108 :
			{
				term_34 = force(sink.context(), term_34);
				if (term_34.descriptor() != _M_Nil)
				{
					break label_108;
				}
				sink.start(_M_TRUE);
				sink.end();
				return true;
			}
			label_66 :
			{
				term_34 = force(sink.context(), term_34);
				if (term_34.descriptor() != _M_Cons)
				{
					break label_66;
				}
				Term sub_125 = term_34.sub(0).ref();
				/* #=sub */
				Term sub_124 = term_34.sub(1).ref();
				/* #s=sub */ sink.start(_M_FALSE);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_IsEmpty);
	}

	private static boolean initialized = false;

	public static void init(Context context)
	{
		if (!initialized)
		{
			context.register(_M_Cons);
			context.register(_M_Nil);
			context.register(_M_Foldr);
			context.register(_M_Map);
			context.register(_M_LookUp);
			context.register(_M_DelEntry);
			context.register(_M_Filter);
			context.register(_M_MapM);
			context.register(_M_Length);
			context.register(_M_IsNotEmpty);
			context.register(_M_Append);
			context.register(_M_IsSingleton);
			context.register(_M_RemoveDuplicates);
			context.register(_M_MapM2);
			context.register(_M_MapM3);
			context.register(_M_Flatten);
			context.register(_M_PickFirst1);
			context.register(_M_Foldl);
			context.register(_M_ContainsDuplicates);
			context.register(_M_IfEmpty);
			context.register(_M_Head);
			context.register(_M_Partition);
			context.register(_M_ListEqual);
			context.register(_M_IfSingleton);
			context.register(_M_Tail);
			context.register(_M_At);
			context.register(_M_Map2);
			context.register(_M_Intersect);
			context.register(_M_Concat);
			context.register(_M_Elem);
			context.register(_M_Union);
			context.register(_M_ConditionalInsert);
			context.register(_M_Insert);
			context.register(_M_IWrapFoldlP);
			context.register(_M_MatchPartition);
			context.register(_M_FoldlP);
			context.register(_M_PickFirst);
			context.register(_M_Reverse);
			context.register(_M_Null);
			context.register(_M_Zip);
			context.register(_M_IsEmpty);
			initialized = true;
		}
	}
}