/** Generated File */

package org.crsx.compiler.std;

import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;
import static org.crsx.runtime.Normalizer.force;
import static org.crsx.runtime.Normalizer.forceSub;
import static org.crsx.runtime.Normalizer.normalize;
import static org.crsx.runtime.Reference.safeRef;
import static org.crsx.runtime.Term.isVariableUse;

import org.crsx.runtime.*;
import org.crsx.runtime.ConstructionDescriptor.*;

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

	final public static boolean _M_Foldr(Sink sink, Variable var, Variable var_78, Term term, Term term_58, Term term_41)
	{
		if (sink.context().sd++ < 256)
		{

			label :
			{
				/* #F=term */
				/* #Z=term */
				term_41 = force(sink.context(), term_41);
				if (term_41.descriptor() != _M_Nil)
				{
					break label;
				}
				sink.copy(term_58.ref());
				return true;
			}
			label_85 :
			{
				/* #F=term */
				/* #Z=term */
				term_41 = force(sink.context(), term_41);
				if (term_41.descriptor() != _M_Cons)
				{
					break label_85;
				}
				Term sub = term_41.sub(0).ref();
				/* #H=sub */
				Term sub_75 = term_41.sub(1).ref();
				/* #T=sub */Term jterm;
				{
					BufferSink buffer = sink.context().makeBuffer();
					buffer.copy(sub.ref());
					jterm = buffer.term();
				}
				Term jterm_80;
				{
					BufferSink buffer_15 = sink.context().makeBuffer();
					buffer_15.start(_M_Foldr);
					Variable jvar = buffer_15.context().makeVariable("x");
					Variable jvar_40 = buffer_15.context().makeVariable("x");
					buffer_15.binds(new Variable[]
						{jvar, jvar_40});
					Term jterm_32;
					{
						BufferSink buffer_44 = buffer_15.context().makeBuffer();
						buffer_44.use(jvar);
						jterm_32 = buffer_44.term();
					}
					Term jterm_43;
					{
						BufferSink buffer_40 = buffer_15.context().makeBuffer();
						buffer_40.use(jvar_40);
						jterm_43 = buffer_40.term();
					}
					buffer_15.substitute(term.ref(), new Variable[]
						{var, var_78}, new Term[]
						{jterm_32, jterm_43});
					buffer_15.copy(term_58.ref());
					buffer_15.copy(sub_75.ref());
					buffer_15.end();
					jterm_80 = buffer_15.term();
				}
				sink.substitute(term.ref(), new Variable[]
					{var, var_78}, new Term[]
					{jterm, jterm_80});
				return true;
			}
		}
		return thunk(sink, _M_Foldr, var, var_78, term, term_58, term_41);
	}

	final public static boolean _M_Map(Sink sink, Variable var_20, Term term_35, Term term_3)
	{
		if (sink.context().sd++ < 256)
		{

			label_37 :
			{
				/* #=term */
				term_3 = force(sink.context(), term_3);
				if (term_3.descriptor() != _M_Nil)
				{
					break label_37;
				}
				sink.start(_M_Nil);
				sink.end();
				return true;
			}
			label_20 :
			{
				/* #=term */
				term_3 = force(sink.context(), term_3);
				if (term_3.descriptor() != _M_Cons)
				{
					break label_20;
				}
				Term sub_12 = term_3.sub(0).ref();
				/* #1=sub */
				Term sub_6 = term_3.sub(1).ref();
				/* #s=sub */
				sink.start(_M_Cons);
				Term jterm_22;
				{
					BufferSink buffer_27 = sink.context().makeBuffer();
					buffer_27.copy(sub_12.ref());
					jterm_22 = buffer_27.term();
				}
				sink.substitute(term_35.ref(), new Variable[]
					{var_20}, new Term[]
					{jterm_22});
				sink.start(_M_Map);
				Variable jvar_83 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_83});
				Term jterm_24;
				{
					BufferSink buffer_24 = sink.context().makeBuffer();
					buffer_24.use(jvar_83);
					jterm_24 = buffer_24.term();
				}
				sink.substitute(term_35.ref(), new Variable[]
					{var_20}, new Term[]
					{jterm_24});
				sink.copy(sub_6.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Map, var_20, term_35, term_3);
	}

	final public static boolean _M_LookUp(Sink sink, Term term_78, Term term_49)
	{
		if (sink.context().sd++ < 256)
		{
			term_49 = normalize(sink.context(), term_49);
			label_43 :
			{
				/* #Key=term */
				/* #KeyValueList=term */
				sink.start(_M_Map);
				Variable jvar_36 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_36});
				sink.start(_M_Snd);
				sink.use(jvar_36);
				sink.end();
				sink.start(_M_Filter);
				Variable jvar_18 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_18});
				sink.start(_M_Equal);
				sink.copy(term_78.ref());
				sink.start(_M_Fst);
				sink.use(jvar_18);
				sink.end();
				sink.end();
				sink.copy(term_49.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_LookUp, term_78, term_49);
	}

	final public static boolean _M_DelEntry(Sink sink, Term term_31, Term term_14)
	{
		if (sink.context().sd++ < 256)
		{

			label_69 :
			{
				/* #Key=term */
				/* #KeyValueList=term */
				sink.start(_M_Filter);
				Variable jvar_89 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_89});
				sink.start(_M_Not);
				sink.start(_M_Equal);
				sink.start(_M_Fst);
				sink.use(jvar_89);
				sink.end();
				sink.copy(term_31.ref());
				sink.end();
				sink.end();
				sink.copy(term_14.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_DelEntry, term_31, term_14);
	}

	final public static boolean _M_Filter(Sink sink, Variable var_66, Term term_17, Term term_140)
	{
		if (sink.context().sd++ < 256)
		{

			label_5 :
			{
				/* #C=term */
				/* #XS=term */
				sink.start(_M_Foldr);
				Variable jvar_21 = sink.context().makeVariable("x");
				Variable jvar_91 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_21, jvar_91});
				sink.start(_M_ConditionalInsert);
				Term jterm_38;
				{
					BufferSink buffer_8 = sink.context().makeBuffer();
					buffer_8.use(jvar_21);
					jterm_38 = buffer_8.term();
				}
				sink.substitute(term_17.ref(), new Variable[]
					{var_66}, new Term[]
					{jterm_38});
				sink.use(jvar_21);
				sink.use(jvar_91);
				sink.end();
				sink.start(_M_Nil);
				sink.end();
				sink.copy(term_140.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Filter, var_66, term_17, term_140);
	}

	final public static boolean _M_MapM(Sink sink, Variable var_14, Variable var_27, Term term_97, Term term_9, Term term_29)
	{
		if (sink.context().sd++ < 256)
		{

			label_96 :
			{
				/* #=term */
				/* #state=term */
				/* #s=term */
				sink.start(_M_MapM2);
				Variable jvar_38 = sink.context().makeVariable("x");
				Variable jvar_17 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_38, jvar_17});
				Term jterm_39;
				{
					BufferSink buffer_91 = sink.context().makeBuffer();
					buffer_91.use(jvar_38);
					jterm_39 = buffer_91.term();
				}
				Term jterm_10;
				{
					BufferSink buffer_5 = sink.context().makeBuffer();
					buffer_5.use(jvar_17);
					jterm_10 = buffer_5.term();
				}
				sink.substitute(term_97.ref(), new Variable[]
					{var_14, var_27}, new Term[]
					{jterm_39, jterm_10});
				sink.copy(term_9.ref());
				sink.copy(term_29.ref());
				sink.start(_M_Nil);
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_MapM, var_14, var_27, term_97, term_9, term_29);
	}

	final public static boolean _M_Length(Sink sink, Term term_4)
	{
		if (sink.context().sd++ < 256)
		{

			label_17 :
			{
				/* #XS=term */
				sink.start(_M_IWrapFoldlP);
				Variable jvar_6 = sink.context().makeVariable("x");
				Variable jvar_11 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_6, jvar_11});
				sink.start(_M_NumberPlus);
				sink.literal(1);
				sink.use(jvar_11);
				sink.end();
				sink.literal(0);
				sink.copy(term_4.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Length, term_4);
	}

	final public static boolean _M_IsNotEmpty(Sink sink, Term term_24)
	{
		if (sink.context().sd++ < 256)
		{

			label_32 :
			{
				term_24 = force(sink.context(), term_24);
				if (term_24.descriptor() != _M_Nil)
				{
					break label_32;
				}
				sink.start(_M_FALSE);
				sink.end();
				return true;
			}
			label_71 :
			{
				term_24 = force(sink.context(), term_24);
				if (term_24.descriptor() != _M_Cons)
				{
					break label_71;
				}
				Term sub_15 = term_24.sub(0).ref();
				/* #=sub */
				Term sub_81 = term_24.sub(1).ref();
				/* #s=sub */ sink.start(_M_TRUE);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_IsNotEmpty, term_24);
	}

	final public static boolean _M_Append(Sink sink, Term term_55, Term term_37)
	{
		if (sink.context().sd++ < 256)
		{

			label_63 :
			{
				/* #x=term */
				term_37 = force(sink.context(), term_37);
				if (term_37.descriptor() != _M_Nil)
				{
					break label_63;
				}
				sink.start(_M_Cons);
				sink.copy(term_55.ref());
				sink.start(_M_Nil);
				sink.end();
				sink.end();
				return true;
			}
			label_25 :
			{
				/* #x=term */
				term_37 = force(sink.context(), term_37);
				if (term_37.descriptor() != _M_Cons)
				{
					break label_25;
				}
				Term sub_22 = term_37.sub(0).ref();
				/* #1=sub */
				Term sub_47 = term_37.sub(1).ref();
				/* #s=sub */
				sink.start(_M_Cons);
				sink.copy(sub_22.ref());
				sink.start(_M_Append);
				sink.copy(term_55.ref());
				sink.copy(sub_47.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Append, term_55, term_37);
	}

	final public static boolean _M_IsSingleton(Sink sink, Term term_47)
	{
		if (sink.context().sd++ < 256)
		{

			label_66 :
			{
				term_47 = force(sink.context(), term_47);
				if (term_47.descriptor() != _M_Nil)
				{
					break label_66;
				}
				sink.start(_M_FALSE);
				sink.end();
				return true;
			}
			label_33 :
			{
				term_47 = force(sink.context(), term_47);
				if (term_47.descriptor() != _M_Cons)
				{
					break label_33;
				}
				Term sub_98 = term_47.sub(0).ref();
				/* #=sub */
				Term sub_63 = term_47.sub(1).ref();
				/* #s=sub */
				sink.start(_M_IsEmpty);
				sink.copy(sub_63.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_IsSingleton, term_47);
	}

	final public static boolean _M_RemoveDuplicates(Sink sink, Term term_74)
	{
		if (sink.context().sd++ < 256)
		{

			label_24 :
			{
				term_74 = force(sink.context(), term_74);
				if (term_74.descriptor() != _M_Nil)
				{
					break label_24;
				}
				sink.start(_M_Nil);
				sink.end();
				return true;
			}
			label_47 :
			{
				term_74 = force(sink.context(), term_74);
				if (term_74.descriptor() != _M_Cons)
				{
					break label_47;
				}
				Term sub_55 = term_74.sub(0).ref();
				/* #X=sub */
				Term sub_34 = term_74.sub(1).ref();
				/* #XS=sub */
				sink.start(_M_Cons);
				sink.copy(sub_55.ref());
				sink.start(_M_RemoveDuplicates);
				sink.start(_M_Filter);
				Variable jvar_67 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_67});
				sink.start(_M_Not);
				sink.start(_M_Equal);
				sink.use(jvar_67);
				sink.copy(sub_55.ref());
				sink.end();
				sink.end();
				sink.copy(sub_34.ref());
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_RemoveDuplicates, term_74);
	}

	final public static boolean _M_MapM2(Sink sink, Variable var_36, Variable var_91, Term term_69, Term term_22, Term term_72, Term term_59)
	{
		if (sink.context().sd++ < 256)
		{

			label_41 :
			{
				/* #=term */
				/* #state=term */
				term_72 = force(sink.context(), term_72);
				if (term_72.descriptor() != _M_Nil)
				{
					break label_41;
				}
				/* #rs=term */
				sink.start(_M_PairCons);
				sink.copy(term_22.ref());
				sink.copy(term_59.ref());
				sink.end();
				return true;
			}
			label_4 :
			{
				/* #=term */
				/* #state=term */
				term_72 = force(sink.context(), term_72);
				if (term_72.descriptor() != _M_Cons)
				{
					break label_4;
				}
				Term sub_126 = term_72.sub(0).ref();
				/* #1=sub */
				Term sub_11 = term_72.sub(1).ref();
				/* #s=sub */
				/* #rs=term */
				sink.start(_M_MapM3);
				Term jterm_46;
				{
					BufferSink buffer_49 = sink.context().makeBuffer();
					buffer_49.copy(term_22.ref());
					jterm_46 = buffer_49.term();
				}
				Term jterm_1;
				{
					BufferSink buffer_32 = sink.context().makeBuffer();
					buffer_32.copy(sub_126.ref());
					jterm_1 = buffer_32.term();
				}
				sink.substitute(term_69.ref(), new Variable[]
					{var_36, var_91}, new Term[]
					{jterm_46, jterm_1});
				Variable jvar_93 = sink.context().makeVariable("x");
				Variable jvar_63 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_93, jvar_63});
				Term jterm_56;
				{
					BufferSink buffer_33 = sink.context().makeBuffer();
					buffer_33.use(jvar_93);
					jterm_56 = buffer_33.term();
				}
				Term jterm_20;
				{
					BufferSink buffer_52 = sink.context().makeBuffer();
					buffer_52.use(jvar_63);
					jterm_20 = buffer_52.term();
				}
				sink.substitute(term_69.ref(), new Variable[]
					{var_36, var_91}, new Term[]
					{jterm_56, jterm_20});
				sink.copy(sub_11.ref());
				sink.copy(term_59.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_MapM2, var_36, var_91, term_69, term_22, term_72, term_59);
	}

	final public static boolean _M_MapM3(Sink sink, Term term_11, Variable var_22, Variable var_61, Term term_99, Term term_86, Term term_93)
	{
		if (sink.context().sd++ < 256)
		{

			label_93 :
			{
				term_11 = force(sink.context(), term_11);
				if (term_11.descriptor() != _M_PairCons)
				{
					break label_93;
				}
				Term sub_150 = term_11.sub(0).ref();
				/* #nstate=sub */
				Term sub_20 = term_11.sub(1).ref();
				/* #r=sub */
				/* #=term */
				/* #s=term */
				/* #rs=term */
				sink.start(_M_MapM2);
				Variable jvar_13 = sink.context().makeVariable("x");
				Variable jvar_42 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_13, jvar_42});
				Term jterm_78;
				{
					BufferSink buffer_35 = sink.context().makeBuffer();
					buffer_35.use(jvar_13);
					jterm_78 = buffer_35.term();
				}
				Term jterm_44;
				{
					BufferSink buffer_41 = sink.context().makeBuffer();
					buffer_41.use(jvar_42);
					jterm_44 = buffer_41.term();
				}
				sink.substitute(term_99.ref(), new Variable[]
					{var_22, var_61}, new Term[]
					{jterm_78, jterm_44});
				sink.copy(sub_150.ref());
				sink.copy(term_86.ref());
				sink.start(_M_Append);
				sink.copy(sub_20.ref());
				sink.copy(term_93.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_MapM3, term_11, var_22, var_61, term_99, term_86, term_93);
	}

	final public static boolean _M_Flatten(Sink sink, Term term_84)
	{
		if (sink.context().sd++ < 256)
		{

			label_73 :
			{
				term_84 = force(sink.context(), term_84);
				if (term_84.descriptor() != _M_Nil)
				{
					break label_73;
				}
				sink.start(_M_Nil);
				sink.end();
				return true;
			}
			label_34 :
			{
				term_84 = force(sink.context(), term_84);
				if (term_84.descriptor() != _M_Cons)
				{
					break label_34;
				}
				Term sub_69 = term_84.sub(0).ref();
				/* #1=sub */
				Term sub_175 = term_84.sub(1).ref();
				/* #s=sub */
				sink.start(_M_Concat);
				sink.copy(sub_69.ref());
				sink.start(_M_Flatten);
				sink.copy(sub_175.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Flatten, term_84);
	}

	final public static boolean _M_PickFirst1(Sink sink, Term term_57, Term term_64, Term term_28, Variable var_28, Term term_43)
	{
		if (sink.context().sd++ < 256)
		{

			label_28 :
			{
				term_57 = force(sink.context(), term_57);
				if (term_57.descriptor() != _M_TRUE)
				{
					break label_28;
				}
				/* #1=term */
				/* #s=term */
				/* #=term */
				sink.start(_M_SOME);
				sink.copy(term_64.ref());
				sink.end();
				return true;
			}
			label_81 :
			{
				term_57 = force(sink.context(), term_57);
				if (term_57.descriptor() != _M_FALSE)
				{
					break label_81;
				}
				/* #1=term */
				/* #s=term */
				/* #=term */
				sink.start(_M_PickFirst);
				sink.copy(term_28.ref());
				Variable jvar_24 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_24});
				Term jterm_28;
				{
					BufferSink buffer_4 = sink.context().makeBuffer();
					buffer_4.use(jvar_24);
					jterm_28 = buffer_4.term();
				}
				sink.substitute(term_43.ref(), new Variable[]
					{var_28}, new Term[]
					{jterm_28});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_PickFirst1, term_57, term_64, term_28, var_28, term_43);
	}

	final public static boolean _M_Foldl(Sink sink, Variable var_128, Variable var_6, Term term_125, Term term_96, Term term_2)
	{
		if (sink.context().sd++ < 256)
		{

			label_189 :
			{
				/* #F=term */
				/* #Z=term */
				term_2 = force(sink.context(), term_2);
				if (term_2.descriptor() != _M_Nil)
				{
					break label_189;
				}
				sink.copy(term_96.ref());
				return true;
			}
			label_198 :
			{
				/* #F=term */
				/* #Z=term */
				term_2 = force(sink.context(), term_2);
				if (term_2.descriptor() != _M_Cons)
				{
					break label_198;
				}
				Term sub_39 = term_2.sub(0).ref();
				/* #H=sub */
				Term sub_145 = term_2.sub(1).ref();
				/* #T=sub */
				sink.start(_M_Foldl);
				Variable jvar_20 = sink.context().makeVariable("x");
				Variable jvar_73 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_20, jvar_73});
				Term jterm_60;
				{
					BufferSink buffer_73 = sink.context().makeBuffer();
					buffer_73.use(jvar_20);
					jterm_60 = buffer_73.term();
				}
				Term jterm_66;
				{
					BufferSink buffer_54 = sink.context().makeBuffer();
					buffer_54.use(jvar_73);
					jterm_66 = buffer_54.term();
				}
				sink.substitute(term_125.ref(), new Variable[]
					{var_128, var_6}, new Term[]
					{jterm_60, jterm_66});
				Term jterm_94;
				{
					BufferSink buffer_51 = sink.context().makeBuffer();
					buffer_51.copy(sub_39.ref());
					jterm_94 = buffer_51.term();
				}
				Term jterm_23;
				{
					BufferSink buffer_149 = sink.context().makeBuffer();
					buffer_149.copy(term_96.ref());
					jterm_23 = buffer_149.term();
				}
				sink.substitute(term_125.ref(), new Variable[]
					{var_128, var_6}, new Term[]
					{jterm_94, jterm_23});
				sink.copy(sub_145.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Foldl, var_128, var_6, term_125, term_96, term_2);
	}

	final public static boolean _M_ContainsDuplicates(Sink sink, Term term_179)
	{
		if (sink.context().sd++ < 256)
		{

			label_52 :
			{
				term_179 = force(sink.context(), term_179);
				if (term_179.descriptor() != _M_Nil)
				{
					break label_52;
				}
				sink.start(_M_FALSE);
				sink.end();
				return true;
			}
			label_90 :
			{
				term_179 = force(sink.context(), term_179);
				if (term_179.descriptor() != _M_Cons)
				{
					break label_90;
				}
				Term sub_35 = term_179.sub(0).ref();
				/* #H=sub */
				Term sub_72 = term_179.sub(1).ref();
				/* #T=sub */
				sink.start(_M_Or);
				sink.start(_M_Elem);
				sink.copy(sub_35.ref());
				sink.copy(sub_72.ref());
				sink.end();
				sink.start(_M_ContainsDuplicates);
				sink.copy(sub_72.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_ContainsDuplicates, term_179);
	}

	final public static boolean _M_IfEmpty(Sink sink, Term term_85, Term term_261, Term term_16)
	{
		if (sink.context().sd++ < 256)
		{

			label_180 :
			{
				term_85 = force(sink.context(), term_85);
				if (term_85.descriptor() != _M_Nil)
				{
					break label_180;
				}
				/* #1=term */ /* #2=term */ sink.copy(term_261.ref());
				return true;
			}
			label_0 :
			{
				term_85 = force(sink.context(), term_85);
				if (term_85.descriptor() != _M_Cons)
				{
					break label_0;
				}
				Term sub_0 = term_85.sub(0).ref();
				/* #=sub */
				Term sub_29 = term_85.sub(1).ref();
				/* #s=sub */
				/* #1=term */ /* #2=term */ sink.copy(term_16.ref());
				return true;
			}
		}
		return thunk(sink, _M_IfEmpty, term_85, term_261, term_16);
	}

	final public static boolean _M_Head(Sink sink, Term term_226)
	{
		if (sink.context().sd++ < 256)
		{

			label_84 :
			{
				term_226 = force(sink.context(), term_226);
				if (term_226.descriptor() != _M_Nil)
				{
					break label_84;
				}
				sink.start(_M_Error);
				sink.literal("Head of empty list");
				sink.end();
				return true;
			}
			label_56 :
			{
				term_226 = force(sink.context(), term_226);
				if (term_226.descriptor() != _M_Cons)
				{
					break label_56;
				}
				Term sub_13 = term_226.sub(0).ref();
				/* #=sub */
				Term sub_58 = term_226.sub(1).ref();
				/* #s=sub */ sink.copy(sub_13.ref());
				return true;
			}
		}
		return thunk(sink, _M_Head, term_226);
	}

	final public static boolean _M_Partition(Sink sink, Variable var_1, Term term_65, Term term_137)
	{
		if (sink.context().sd++ < 256)
		{

			label_8 :
			{
				/* #C=term */
				/* #XS=term */
				sink.start(_M_Foldr);
				Variable jvar_55 = sink.context().makeVariable("x");
				Variable jvar_3 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_55, jvar_3});
				sink.start(_M_MatchPartition);
				Term jterm_47;
				{
					BufferSink buffer_28 = sink.context().makeBuffer();
					buffer_28.use(jvar_55);
					jterm_47 = buffer_28.term();
				}
				sink.substitute(term_65.ref(), new Variable[]
					{var_1}, new Term[]
					{jterm_47});
				sink.use(jvar_55);
				sink.use(jvar_3);
				sink.end();
				sink.start(_M_PairCons);
				sink.start(_M_Nil);
				sink.end();
				sink.start(_M_Nil);
				sink.end();
				sink.end();
				sink.copy(term_137.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Partition, var_1, term_65, term_137);
	}

	final public static boolean _M_ListEqual(Sink sink, Variable var_0, Variable var_42, Term term_262, Term term_26, Term term_173)
	{
		if (sink.context().sd++ < 256)
		{

			label_29 :
			{
				/* #C=term */
				term_26 = force(sink.context(), term_26);
				if (term_26.descriptor() != _M_Nil)
				{
					break label_29;
				}
				term_173 = force(sink.context(), term_173);
				if (term_173.descriptor() != _M_Nil)
				{
					break label_29;
				}
				sink.start(_M_TRUE);
				sink.end();
				return true;
			}
			label_80 :
			{
				/* #C=term */
				term_26 = force(sink.context(), term_26);
				if (term_26.descriptor() != _M_Cons)
				{
					break label_80;
				}
				Term sub_90 = term_26.sub(0).ref();
				/* #x=sub */
				Term sub_78 = term_26.sub(1).ref();
				/* #xs=sub */
				term_173 = force(sink.context(), term_173);
				if (term_173.descriptor() != _M_Nil)
				{
					break label_80;
				}
				sink.start(_M_FALSE);
				sink.end();
				return true;
			}
			label_23 :
			{
				/* #C=term */
				term_26 = force(sink.context(), term_26);
				if (term_26.descriptor() != _M_Nil)
				{
					break label_23;
				}
				term_173 = force(sink.context(), term_173);
				if (term_173.descriptor() != _M_Cons)
				{
					break label_23;
				}
				Term sub_9 = term_173.sub(0).ref();
				/* #y=sub */
				Term sub_33 = term_173.sub(1).ref();
				/* #ys=sub */ sink.start(_M_FALSE);
				sink.end();
				return true;
			}
			label_40 :
			{
				/* #C=term */
				term_26 = force(sink.context(), term_26);
				if (term_26.descriptor() != _M_Cons)
				{
					break label_40;
				}
				Term sub_57 = term_26.sub(0).ref();
				/* #x=sub */
				Term sub_59 = term_26.sub(1).ref();
				/* #xs=sub */
				term_173 = force(sink.context(), term_173);
				if (term_173.descriptor() != _M_Cons)
				{
					break label_40;
				}
				Term sub_64 = term_173.sub(0).ref();
				/* #y=sub */
				Term sub_65 = term_173.sub(1).ref();
				/* #ys=sub */
				sink.start(_M_And);
				Term jterm_149;
				{
					BufferSink buffer_63 = sink.context().makeBuffer();
					buffer_63.copy(sub_57.ref());
					jterm_149 = buffer_63.term();
				}
				Term jterm_91;
				{
					BufferSink buffer_29 = sink.context().makeBuffer();
					buffer_29.copy(sub_64.ref());
					jterm_91 = buffer_29.term();
				}
				sink.substitute(term_262.ref(), new Variable[]
					{var_0, var_42}, new Term[]
					{jterm_149, jterm_91});
				sink.start(_M_ListEqual);
				Variable jvar_61 = sink.context().makeVariable("x");
				Variable jvar_133 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_61, jvar_133});
				Term jterm_92;
				{
					BufferSink buffer_81 = sink.context().makeBuffer();
					buffer_81.use(jvar_61);
					jterm_92 = buffer_81.term();
				}
				Term jterm_9;
				{
					BufferSink buffer_139 = sink.context().makeBuffer();
					buffer_139.use(jvar_133);
					jterm_9 = buffer_139.term();
				}
				sink.substitute(term_262.ref(), new Variable[]
					{var_0, var_42}, new Term[]
					{jterm_92, jterm_9});
				sink.copy(sub_59.ref());
				sink.copy(sub_65.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_ListEqual, var_0, var_42, term_262, term_26, term_173);
	}

	final public static boolean _M_IfSingleton(Sink sink, Term term_88, Term term_91, Term term_79)
	{
		if (sink.context().sd++ < 256)
		{

			label_74 :
			{
				term_88 = force(sink.context(), term_88);
				if (term_88.descriptor() != _M_Nil)
				{
					break label_74;
				}
				/* #1=term */ /* #2=term */ sink.copy(term_79.ref());
				return true;
			}
			label_35 :
			{
				term_88 = force(sink.context(), term_88);
				if (term_88.descriptor() != _M_Cons)
				{
					break label_35;
				}
				Term sub_188 = term_88.sub(0).ref();
				/* #=sub */
				Term sub_16 = term_88.sub(1).ref();
				/* #s=sub */
				/* #1=term */
				/* #2=term */
				sink.start(_M_IfEmpty);
				sink.copy(sub_16.ref());
				sink.copy(term_91.ref());
				sink.copy(term_79.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_IfSingleton, term_88, term_91, term_79);
	}

	final public static boolean _M_Tail(Sink sink, Term term_19)
	{
		if (sink.context().sd++ < 256)
		{

			label_38 :
			{
				term_19 = force(sink.context(), term_19);
				if (term_19.descriptor() != _M_Nil)
				{
					break label_38;
				}
				sink.start(_M_Error);
				sink.literal("Tail of empty list");
				sink.end();
				return true;
			}
			label_2 :
			{
				term_19 = force(sink.context(), term_19);
				if (term_19.descriptor() != _M_Cons)
				{
					break label_2;
				}
				Term sub_76 = term_19.sub(0).ref();
				/* #=sub */
				Term sub_18 = term_19.sub(1).ref();
				/* #s=sub */ sink.copy(sub_18.ref());
				return true;
			}
		}
		return thunk(sink, _M_Tail, term_19);
	}

	final public static boolean _M_At(Sink sink, Term term_62, Term term_12)
	{
		if (sink.context().sd++ < 256)
		{
			term_12 = normalize(sink.context(), term_12);
			label_55 :
			{
				term_62 = force(sink.context(), term_62);
				if (term_62.descriptor() != _M_Nil)
				{
					break label_55;
				}
				/* #i=term */ sink.start(_M_NONE);
				sink.end();
				return true;
			}
			label_148 :
			{
				term_62 = force(sink.context(), term_62);
				if (term_62.descriptor() != _M_Cons)
				{
					break label_148;
				}
				Term sub_62 = term_62.sub(0).ref();
				/* #=sub */
				Term sub_88 = term_62.sub(1).ref();
				/* #s=sub */
				/* #i=term */
				sink.start(_M_If);
				sink.start(_M_Equal);
				sink.copy(term_12.ref());
				sink.literal(0);
				sink.end();
				sink.start(_M_SOME);
				sink.copy(sub_62.ref());
				sink.end();
				sink.start(_M_At);
				sink.copy(sub_88.ref());
				sink.start(_M_Minus);
				sink.copy(term_12.ref());
				sink.literal(1);
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_At, term_62, term_12);
	}

	final public static boolean _M_Map2(Sink sink, Variable var_168, Term term_167, Term term_5)
	{
		if (sink.context().sd++ < 256)
		{

			label_12 :
			{
				/* #F=term */
				/* #XS=term */
				sink.start(_M_Foldr);
				Variable jvar_33 = sink.context().makeVariable("x");
				Variable jvar_47 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_33, jvar_47});
				sink.start(_M_Insert);
				Term jterm_37;
				{
					BufferSink buffer_10 = sink.context().makeBuffer();
					buffer_10.use(jvar_33);
					jterm_37 = buffer_10.term();
				}
				sink.substitute(term_167.ref(), new Variable[]
					{var_168}, new Term[]
					{jterm_37});
				sink.use(jvar_47);
				sink.end();
				sink.start(_M_Nil);
				sink.end();
				sink.copy(term_5.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Map2, var_168, term_167, term_5);
	}

	final public static boolean _M_Intersect(Sink sink, Term term_46, Term term_32)
	{
		if (sink.context().sd++ < 256)
		{

			label_45 :
			{
				/* #XS=term */
				/* #YS=term */
				sink.start(_M_Foldr);
				Variable jvar_96 = sink.context().makeVariable("x");
				Variable jvar_57 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_96, jvar_57});
				sink.start(_M_ConditionalInsert);
				sink.start(_M_Elem);
				sink.use(jvar_96);
				sink.copy(term_32.ref());
				sink.end();
				sink.use(jvar_96);
				sink.use(jvar_57);
				sink.end();
				sink.start(_M_Nil);
				sink.end();
				sink.copy(term_46.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Intersect, term_46, term_32);
	}

	final public static boolean _M_Concat(Sink sink, Term term_20, Term term_23)
	{
		if (sink.context().sd++ < 256)
		{

			label_188 :
			{
				term_20 = force(sink.context(), term_20);
				if (term_20.descriptor() != _M_Nil)
				{
					break label_188;
				}
				/* #tail=term */ sink.copy(term_23.ref());
				return true;
			}
			label_120 :
			{
				term_20 = force(sink.context(), term_20);
				if (term_20.descriptor() != _M_Cons)
				{
					break label_120;
				}
				Term sub_36 = term_20.sub(0).ref();
				/* #1=sub */
				Term sub_316 = term_20.sub(1).ref();
				/* #s=sub */
				/* #tail=term */
				sink.start(_M_Cons);
				sink.copy(sub_36.ref());
				sink.start(_M_Concat);
				sink.copy(sub_316.ref());
				sink.copy(term_23.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Concat, term_20, term_23);
	}

	final public static boolean _M_Elem(Sink sink, Term term_48, Term term_6)
	{
		if (sink.context().sd++ < 256)
		{

			label_97 :
			{
				/* #X=term */
				/* #XS=term */
				sink.start(_M_Foldr);
				Variable jvar_72 = sink.context().makeVariable("x");
				Variable jvar_5 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_72, jvar_5});
				sink.start(_M_Or);
				sink.start(_M_Equal);
				sink.copy(term_48.ref());
				sink.use(jvar_72);
				sink.end();
				sink.use(jvar_5);
				sink.end();
				sink.start(_M_FALSE);
				sink.end();
				sink.copy(term_6.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Elem, term_48, term_6);
	}

	final public static boolean _M_Union(Sink sink, Term term_89, Term term_178)
	{
		if (sink.context().sd++ < 256)
		{

			label_115 :
			{
				/* #XS=term */
				/* #YS=term */
				sink.start(_M_RemoveDuplicates);
				sink.start(_M_Concat);
				sink.copy(term_89.ref());
				sink.copy(term_178.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Union, term_89, term_178);
	}

	final public static boolean _M_ConditionalInsert(Sink sink, Term term_132, Term term_101, Term term_10)
	{
		if (sink.context().sd++ < 256)
		{

			label_156 :
			{
				term_132 = force(sink.context(), term_132);
				if (term_132.descriptor() != _M_TRUE)
				{
					break label_156;
				}
				/* #X=term */
				/* #XS=term */
				sink.start(_M_Insert);
				sink.copy(term_101.ref());
				sink.copy(term_10.ref());
				sink.end();
				return true;
			}
			label_153 :
			{
				term_132 = force(sink.context(), term_132);
				if (term_132.descriptor() != _M_FALSE)
				{
					break label_153;
				}
				/* #X=term */ /* #XS=term */ sink.copy(term_10.ref());
				return true;
			}
		}
		return thunk(sink, _M_ConditionalInsert, term_132, term_101, term_10);
	}

	final public static boolean _M_Insert(Sink sink, Term term_90, Term term_192)
	{
		if (sink.context().sd++ < 256)
		{

			label_67 :
			{
				/* #X=term */
				/* #XS=term */
				sink.start(_M_Cons);
				sink.copy(term_90.ref());
				sink.copy(term_192.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Insert, term_90, term_192);
	}

	final public static boolean _M_IWrapFoldlP(Sink sink, Variable var_37, Variable var_4, Term term_95, Term term_150, Term term_157)
	{
		if (sink.context().sd++ < 256)
		{

			label_145 :
			{
				/* #F=term */
				/* #Z=term */
				/* #XS=term */
				sink.start(_M_FoldlP);
				Variable jvar_74 = sink.context().makeVariable("x");
				Variable jvar_51 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_74, jvar_51});
				Term jterm_48;
				{
					BufferSink buffer_78 = sink.context().makeBuffer();
					buffer_78.use(jvar_74);
					jterm_48 = buffer_78.term();
				}
				Term jterm_57;
				{
					BufferSink buffer_3 = sink.context().makeBuffer();
					buffer_3.use(jvar_51);
					jterm_57 = buffer_3.term();
				}
				sink.substitute(term_95.ref(), new Variable[]
					{var_37, var_4}, new Term[]
					{jterm_48, jterm_57});
				sink.copy(term_150.ref());
				sink.copy(term_157.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_IWrapFoldlP, var_37, var_4, term_95, term_150, term_157);
	}

	final public static boolean _M_MatchPartition(Sink sink, Term term_7, Term term_60, Term term_172)
	{
		if (sink.context().sd++ < 256)
		{

			label_89 :
			{
				term_7 = force(sink.context(), term_7);
				if (term_7.descriptor() != _M_TRUE)
				{
					break label_89;
				}
				/* #X=term */
				term_172 = force(sink.context(), term_172);
				if (term_172.descriptor() != _M_PairCons)
				{
					break label_89;
				}
				Term sub_5 = term_172.sub(0).ref();
				/* #TS=sub */
				Term sub_128 = term_172.sub(1).ref();
				/* #FS=sub */
				sink.start(_M_PairCons);
				sink.start(_M_Insert);
				sink.copy(term_60.ref());
				sink.copy(sub_5.ref());
				sink.end();
				sink.copy(sub_128.ref());
				sink.end();
				return true;
			}
			label_54 :
			{
				term_7 = force(sink.context(), term_7);
				if (term_7.descriptor() != _M_FALSE)
				{
					break label_54;
				}
				/* #X=term */
				term_172 = force(sink.context(), term_172);
				if (term_172.descriptor() != _M_PairCons)
				{
					break label_54;
				}
				Term sub_137 = term_172.sub(0).ref();
				/* #TS=sub */
				Term sub_83 = term_172.sub(1).ref();
				/* #FS=sub */
				sink.start(_M_PairCons);
				sink.copy(sub_137.ref());
				sink.start(_M_Insert);
				sink.copy(term_60.ref());
				sink.copy(sub_83.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_MatchPartition, term_7, term_60, term_172);
	}

	final public static boolean _M_FoldlP(Sink sink, Variable var_33, Variable var_181, Term term_108, Term term_45, Term term_13)
	{
		if (sink.context().sd++ < 256)
		{
			term_45 = normalize(sink.context(), term_45);
			label_83 :
			{
				/* #F=term */
				/* #Z=term */
				term_13 = force(sink.context(), term_13);
				if (term_13.descriptor() != _M_Nil)
				{
					break label_83;
				}
				sink.copy(term_45.ref());
				return true;
			}
			label_141 :
			{
				/* #F=term */
				/* #Z=term */
				term_13 = force(sink.context(), term_13);
				if (term_13.descriptor() != _M_Cons)
				{
					break label_141;
				}
				Term sub_41 = term_13.sub(0).ref();
				/* #H=sub */
				Term sub_94 = term_13.sub(1).ref();
				/* #T=sub */
				sink.start(_M_FoldlP);
				Variable jvar_88 = sink.context().makeVariable("x");
				Variable jvar_94 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_88, jvar_94});
				Term jterm_69;
				{
					BufferSink buffer_50 = sink.context().makeBuffer();
					buffer_50.use(jvar_88);
					jterm_69 = buffer_50.term();
				}
				Term jterm_98;
				{
					BufferSink buffer_79 = sink.context().makeBuffer();
					buffer_79.use(jvar_94);
					jterm_98 = buffer_79.term();
				}
				sink.substitute(term_108.ref(), new Variable[]
					{var_33, var_181}, new Term[]
					{jterm_69, jterm_98});
				Term jterm_68;
				{
					BufferSink buffer_69 = sink.context().makeBuffer();
					buffer_69.copy(sub_41.ref());
					jterm_68 = buffer_69.term();
				}
				Term jterm_190;
				{
					BufferSink buffer_19 = sink.context().makeBuffer();
					buffer_19.copy(term_45.ref());
					jterm_190 = buffer_19.term();
				}
				sink.substitute(term_108.ref(), new Variable[]
					{var_33, var_181}, new Term[]
					{jterm_68, jterm_190});
				sink.copy(sub_94.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_FoldlP, var_33, var_181, term_108, term_45, term_13);
	}

	final public static boolean _M_PickFirst(Sink sink, Term term_122, Variable var_169, Term term_87)
	{
		if (sink.context().sd++ < 256)
		{

			label_53 :
			{
				term_122 = force(sink.context(), term_122);
				if (term_122.descriptor() != _M_Nil)
				{
					break label_53;
				}
				/* #=term */ sink.start(_M_NONE);
				sink.end();
				return true;
			}
			label_18 :
			{
				term_122 = force(sink.context(), term_122);
				if (term_122.descriptor() != _M_Cons)
				{
					break label_18;
				}
				Term sub_184 = term_122.sub(0).ref();
				/* #1=sub */
				Term sub_40 = term_122.sub(1).ref();
				/* #s=sub */
				/* #=term */
				sink.start(_M_PickFirst1);
				Term jterm_4;
				{
					BufferSink buffer_184 = sink.context().makeBuffer();
					buffer_184.copy(sub_184.ref());
					jterm_4 = buffer_184.term();
				}
				sink.substitute(term_87.ref(), new Variable[]
					{var_169}, new Term[]
					{jterm_4});
				sink.copy(sub_184.ref());
				sink.copy(sub_40.ref());
				Variable jvar_48 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_48});
				Term jterm_226;
				{
					BufferSink buffer_61 = sink.context().makeBuffer();
					buffer_61.use(jvar_48);
					jterm_226 = buffer_61.term();
				}
				sink.substitute(term_87.ref(), new Variable[]
					{var_169}, new Term[]
					{jterm_226});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_PickFirst, term_122, var_169, term_87);
	}

	final public static boolean _M_Reverse(Sink sink, Term term_67)
	{
		if (sink.context().sd++ < 256)
		{

			label_158 :
			{
				/* #XS=term */
				sink.start(_M_Foldl);
				Variable jvar_71 = sink.context().makeVariable("x");
				Variable jvar_92 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_71, jvar_92});
				sink.start(_M_Insert);
				sink.use(jvar_71);
				sink.use(jvar_92);
				sink.end();
				sink.start(_M_Nil);
				sink.end();
				sink.copy(term_67.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Reverse, term_67);
	}

	final public static boolean _M_Null(Sink sink, Term term_194)
	{
		if (sink.context().sd++ < 256)
		{

			label_36 :
			{
				term_194 = force(sink.context(), term_194);
				if (term_194.descriptor() != _M_Nil)
				{
					break label_36;
				}
				sink.start(_M_TRUE);
				sink.end();
				return true;
			}
			label_50 :
			{
				term_194 = force(sink.context(), term_194);
				if (term_194.descriptor() != _M_Cons)
				{
					break label_50;
				}
				Term sub_7 = term_194.sub(0).ref();
				/* #H=sub */
				Term sub_141 = term_194.sub(1).ref();
				/* #T=sub */ sink.start(_M_FALSE);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Null, term_194);
	}

	final public static boolean _M_Zip(Sink sink, Term term_119, Term term_82)
	{
		if (sink.context().sd++ < 256)
		{

			label_91 :
			{
				term_119 = force(sink.context(), term_119);
				if (term_119.descriptor() != _M_Nil)
				{
					break label_91;
				}
				term_82 = force(sink.context(), term_82);
				if (term_82.descriptor() != _M_Nil)
				{
					break label_91;
				}
				sink.start(_M_Nil);
				sink.end();
				return true;
			}
			label_78 :
			{
				term_119 = force(sink.context(), term_119);
				if (term_119.descriptor() != _M_Nil)
				{
					break label_78;
				}
				/* #=term */
				sink.start(_M_Error);
				sink.literal("ListExtension.Zip: second argument list was longer");
				sink.end();
				return true;
			}
			label_102 :
			{
				/* #=term */
				term_82 = force(sink.context(), term_82);
				if (term_82.descriptor() != _M_Nil)
				{
					break label_102;
				}
				sink.start(_M_Error);
				sink.literal("ListExtension.Zip: first argument list was longer");
				sink.end();
				return true;
			}
			label_95 :
			{
				term_119 = force(sink.context(), term_119);
				if (term_119.descriptor() != _M_Cons)
				{
					break label_95;
				}
				Term sub_28 = term_119.sub(0).ref();
				/* #X=sub */
				Term sub_199 = term_119.sub(1).ref();
				/* #XS=sub */
				term_82 = force(sink.context(), term_82);
				if (term_82.descriptor() != _M_Cons)
				{
					break label_95;
				}
				Term sub_119 = term_82.sub(0).ref();
				/* #Y=sub */
				Term sub_99 = term_82.sub(1).ref();
				/* #YS=sub */
				sink.start(_M_Cons);
				sink.start(_M_PairCons);
				sink.copy(sub_28.ref());
				sink.copy(sub_119.ref());
				sink.end();
				sink.start(_M_Zip);
				sink.copy(sub_199.ref());
				sink.copy(sub_99.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Zip, term_119, term_82);
	}

	final public static boolean _M_IsEmpty(Sink sink, Term term_98)
	{
		if (sink.context().sd++ < 256)
		{

			label_11 :
			{
				term_98 = force(sink.context(), term_98);
				if (term_98.descriptor() != _M_Nil)
				{
					break label_11;
				}
				sink.start(_M_TRUE);
				sink.end();
				return true;
			}
			label_92 :
			{
				term_98 = force(sink.context(), term_98);
				if (term_98.descriptor() != _M_Cons)
				{
					break label_92;
				}
				Term sub_23 = term_98.sub(0).ref();
				/* #=sub */
				Term sub_45 = term_98.sub(1).ref();
				/* #s=sub */ sink.start(_M_FALSE);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_IsEmpty, term_98);
	}

	private static boolean initialized = false;

	public static void init(Context context)
	{
		if (!initialized)
		{
			initialized = true;
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
			org.crsx.compiler.std.Num.init(context);
			org.crsx.compiler.std.Pair.init(context);
			org.crsx.compiler.std.Core.init(context);
		}
	}
}