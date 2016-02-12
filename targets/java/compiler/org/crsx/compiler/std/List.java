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

	final public static boolean _M_Foldr(Sink sink, Variable var, Variable var_83, Term term, Term term_99, Term term_66)
	{
		if (sink.context().sd++ < 256)
		{
			label :
			{
				/* #F=term */
				/* #Z=term */
				term_66 = force(sink.context(), term_66);
				if (term_66.descriptor() != _M_Nil)
				{
					break label;
				}
				sink.copy(term_99.ref());
				return true;
			}
			label_75 :
			{
				/* #F=term */
				/* #Z=term */
				term_66 = force(sink.context(), term_66);
				if (term_66.descriptor() != _M_Cons)
				{
					break label_75;
				}
				Term sub = term_66.sub(0).ref();
				/* #H=sub */
				Term sub_37 = term_66.sub(1).ref();
				/* #T=sub */Term jterm;
				{
					BufferSink buffer = sink.context().makeBuffer();
					buffer.copy(sub.ref());
					jterm = buffer.term();
				}
				Term jterm_66;
				{
					BufferSink buffer_13 = sink.context().makeBuffer();
					buffer_13.start(_M_Foldr);
					Variable jvar = buffer_13.context().makeVariable("x");
					Variable jvar_88 = buffer_13.context().makeVariable("x");
					buffer_13.binds(new Variable[]
						{jvar, jvar_88});
					Term jterm_18;
					{
						BufferSink buffer_21 = buffer_13.context().makeBuffer();
						buffer_21.use(jvar);
						jterm_18 = buffer_21.term();
					}
					Term jterm_90;
					{
						BufferSink buffer_72 = buffer_13.context().makeBuffer();
						buffer_72.use(jvar_88);
						jterm_90 = buffer_72.term();
					}
					buffer_13.substitute(term.ref(), new Variable[]
						{var, var_83}, new Term[]
						{jterm_18, jterm_90});
					buffer_13.copy(term_99.ref());
					buffer_13.copy(sub_37.ref());
					buffer_13.end();
					jterm_66 = buffer_13.term();
				}
				sink.substitute(term.ref(), new Variable[]
					{var, var_83}, new Term[]
					{jterm, jterm_66});
				return true;
			}
		}
		return thunk(sink, _M_Foldr);
	}

	final public static boolean _M_Map(Sink sink, Variable var_17, Term term_41, Term term_0)
	{
		if (sink.context().sd++ < 256)
		{
			label_78 :
			{
				/* #=term */
				term_0 = force(sink.context(), term_0);
				if (term_0.descriptor() != _M_Nil)
				{
					break label_78;
				}
				sink.start(_M_Nil);
				sink.end();
				return true;
			}
			label_80 :
			{
				/* #=term */
				term_0 = force(sink.context(), term_0);
				if (term_0.descriptor() != _M_Cons)
				{
					break label_80;
				}
				Term sub_55 = term_0.sub(0).ref();
				/* #1=sub */
				Term sub_3 = term_0.sub(1).ref();
				/* #s=sub */
				sink.start(_M_Cons);
				Term jterm_43;
				{
					BufferSink buffer_64 = sink.context().makeBuffer();
					buffer_64.copy(sub_55.ref());
					jterm_43 = buffer_64.term();
				}
				sink.substitute(term_41.ref(), new Variable[]
					{var_17}, new Term[]
					{jterm_43});
				sink.start(_M_Map);
				Variable jvar_47 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_47});
				Term jterm_58;
				{
					BufferSink buffer_80 = sink.context().makeBuffer();
					buffer_80.use(jvar_47);
					jterm_58 = buffer_80.term();
				}
				sink.substitute(term_41.ref(), new Variable[]
					{var_17}, new Term[]
					{jterm_58});
				sink.copy(sub_3.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Map);
	}

	final public static boolean _M_LookUp(Sink sink, Term term_74, Term term_49)
	{
		if (sink.context().sd++ < 256)
		{
			label_54 :
			{
				/* #Key=term */
				/* #KeyValueList=term */
				sink.start(_M_Map);
				Variable jvar_72 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_72});
				sink.start(_M_Snd);
				sink.use(jvar_72);
				sink.end();
				sink.start(_M_Filter);
				Variable jvar_91 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_91});
				sink.start(_M_Equal);
				sink.copy(term_74.ref());
				sink.start(_M_Fst);
				sink.use(jvar_91);
				sink.end();
				sink.end();
				sink.copy(term_49.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_LookUp);
	}

	final public static boolean _M_DelEntry(Sink sink, Term term_87, Term term_26)
	{
		if (sink.context().sd++ < 256)
		{
			label_10 :
			{
				/* #Key=term */
				/* #KeyValueList=term */
				sink.start(_M_Filter);
				Variable jvar_64 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_64});
				sink.start(_M_Not);
				sink.start(_M_Equal);
				sink.start(_M_Fst);
				sink.use(jvar_64);
				sink.end();
				sink.copy(term_87.ref());
				sink.end();
				sink.end();
				sink.copy(term_26.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_DelEntry);
	}

	final public static boolean _M_Filter(Sink sink, Variable var_22, Term term_13, Term term_53)
	{
		if (sink.context().sd++ < 256)
		{
			label_47 :
			{
				/* #C=term */
				/* #XS=term */
				sink.start(_M_Foldr);
				Variable jvar_97 = sink.context().makeVariable("x");
				Variable jvar_11 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_97, jvar_11});
				sink.start(_M_ConditionalInsert);
				Term jterm_63;
				{
					BufferSink buffer_65 = sink.context().makeBuffer();
					buffer_65.use(jvar_97);
					jterm_63 = buffer_65.term();
				}
				sink.substitute(term_13.ref(), new Variable[]
					{var_22}, new Term[]
					{jterm_63});
				sink.use(jvar_97);
				sink.use(jvar_11);
				sink.end();
				sink.start(_M_Nil);
				sink.end();
				sink.copy(term_53.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Filter);
	}

	final public static boolean _M_MapM(Sink sink, Variable var_29, Variable var_48, Term term_12, Term term_57, Term term_6)
	{
		if (sink.context().sd++ < 256)
		{
			label_72 :
			{
				/* #=term */
				/* #state=term */
				/* #s=term */
				sink.start(_M_MapM2);
				Variable jvar_20 = sink.context().makeVariable("x");
				Variable jvar_93 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_20, jvar_93});
				Term jterm_55;
				{
					BufferSink buffer_52 = sink.context().makeBuffer();
					buffer_52.use(jvar_20);
					jterm_55 = buffer_52.term();
				}
				Term jterm_83;
				{
					BufferSink buffer_86 = sink.context().makeBuffer();
					buffer_86.use(jvar_93);
					jterm_83 = buffer_86.term();
				}
				sink.substitute(term_12.ref(), new Variable[]
					{var_29, var_48}, new Term[]
					{jterm_55, jterm_83});
				sink.copy(term_57.ref());
				sink.copy(term_6.ref());
				sink.start(_M_Nil);
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_MapM);
	}

	final public static boolean _M_Length(Sink sink, Term term_86)
	{
		if (sink.context().sd++ < 256)
		{
			label_30 :
			{
				/* #XS=term */
				sink.start(_M_IWrapFoldlP);
				Variable jvar_82 = sink.context().makeVariable("x");
				Variable jvar_57 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_82, jvar_57});
				sink.start(_M_NumberPlus);
				sink.literal(1);
				sink.use(jvar_57);
				sink.end();
				sink.literal(0);
				sink.copy(term_86.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Length);
	}

	final public static boolean _M_IsNotEmpty(Sink sink, Term term_17)
	{
		if (sink.context().sd++ < 256)
		{
			label_26 :
			{
				term_17 = force(sink.context(), term_17);
				if (term_17.descriptor() != _M_Nil)
				{
					break label_26;
				}
				sink.start(_M_FALSE);
				sink.end();
				return true;
			}
			label_12 :
			{
				term_17 = force(sink.context(), term_17);
				if (term_17.descriptor() != _M_Cons)
				{
					break label_12;
				}
				Term sub_16 = term_17.sub(0).ref();
				/* #=sub */
				Term sub_35 = term_17.sub(1).ref();
				/* #s=sub */ sink.start(_M_TRUE);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_IsNotEmpty);
	}

	final public static boolean _M_Append(Sink sink, Term term_98, Term term_81)
	{
		if (sink.context().sd++ < 256)
		{
			label_43 :
			{
				/* #x=term */
				term_81 = force(sink.context(), term_81);
				if (term_81.descriptor() != _M_Nil)
				{
					break label_43;
				}
				sink.start(_M_Cons);
				sink.copy(term_98.ref());
				sink.start(_M_Nil);
				sink.end();
				sink.end();
				return true;
			}
			label_44 :
			{
				/* #x=term */
				term_81 = force(sink.context(), term_81);
				if (term_81.descriptor() != _M_Cons)
				{
					break label_44;
				}
				Term sub_52 = term_81.sub(0).ref();
				/* #1=sub */
				Term sub_22 = term_81.sub(1).ref();
				/* #s=sub */
				sink.start(_M_Cons);
				sink.copy(sub_52.ref());
				sink.start(_M_Append);
				sink.copy(term_98.ref());
				sink.copy(sub_22.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Append);
	}

	final public static boolean _M_IsSingleton(Sink sink, Term term_43)
	{
		if (sink.context().sd++ < 256)
		{
			label_88 :
			{
				term_43 = force(sink.context(), term_43);
				if (term_43.descriptor() != _M_Nil)
				{
					break label_88;
				}
				sink.start(_M_FALSE);
				sink.end();
				return true;
			}
			label_139 :
			{
				term_43 = force(sink.context(), term_43);
				if (term_43.descriptor() != _M_Cons)
				{
					break label_139;
				}
				Term sub_60 = term_43.sub(0).ref();
				/* #=sub */
				Term sub_78 = term_43.sub(1).ref();
				/* #s=sub */
				sink.start(_M_IsEmpty);
				sink.copy(sub_78.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_IsSingleton);
	}

	final public static boolean _M_RemoveDuplicates(Sink sink, Term term_108)
	{
		if (sink.context().sd++ < 256)
		{
			label_1 :
			{
				term_108 = force(sink.context(), term_108);
				if (term_108.descriptor() != _M_Nil)
				{
					break label_1;
				}
				sink.start(_M_Nil);
				sink.end();
				return true;
			}
			label_97 :
			{
				term_108 = force(sink.context(), term_108);
				if (term_108.descriptor() != _M_Cons)
				{
					break label_97;
				}
				Term sub_34 = term_108.sub(0).ref();
				/* #X=sub */
				Term sub_15 = term_108.sub(1).ref();
				/* #XS=sub */
				sink.start(_M_Cons);
				sink.copy(sub_34.ref());
				sink.start(_M_RemoveDuplicates);
				sink.start(_M_Filter);
				Variable jvar_8 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_8});
				sink.start(_M_Not);
				sink.start(_M_Equal);
				sink.use(jvar_8);
				sink.copy(sub_34.ref());
				sink.end();
				sink.end();
				sink.copy(sub_15.ref());
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_RemoveDuplicates);
	}

	final public static boolean _M_MapM2(Sink sink, Variable var_57, Variable var_81, Term term_31, Term term_10, Term term_75, Term term_3)
	{
		if (sink.context().sd++ < 256)
		{
			label_35 :
			{
				/* #=term */
				/* #state=term */
				term_75 = force(sink.context(), term_75);
				if (term_75.descriptor() != _M_Nil)
				{
					break label_35;
				}
				/* #rs=term */
				sink.start(_M_PairCons);
				sink.copy(term_10.ref());
				sink.copy(term_3.ref());
				sink.end();
				return true;
			}
			label_49 :
			{
				/* #=term */
				/* #state=term */
				term_75 = force(sink.context(), term_75);
				if (term_75.descriptor() != _M_Cons)
				{
					break label_49;
				}
				Term sub_5 = term_75.sub(0).ref();
				/* #1=sub */
				Term sub_20 = term_75.sub(1).ref();
				/* #s=sub */
				/* #rs=term */
				sink.start(_M_MapM3);
				Term jterm_25;
				{
					BufferSink buffer_24 = sink.context().makeBuffer();
					buffer_24.copy(term_10.ref());
					jterm_25 = buffer_24.term();
				}
				Term jterm_60;
				{
					BufferSink buffer_75 = sink.context().makeBuffer();
					buffer_75.copy(sub_5.ref());
					jterm_60 = buffer_75.term();
				}
				sink.substitute(term_31.ref(), new Variable[]
					{var_57, var_81}, new Term[]
					{jterm_25, jterm_60});
				Variable jvar_9 = sink.context().makeVariable("x");
				Variable jvar_37 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_9, jvar_37});
				Term jterm_11;
				{
					BufferSink buffer_69 = sink.context().makeBuffer();
					buffer_69.use(jvar_9);
					jterm_11 = buffer_69.term();
				}
				Term jterm_15;
				{
					BufferSink buffer_82 = sink.context().makeBuffer();
					buffer_82.use(jvar_37);
					jterm_15 = buffer_82.term();
				}
				sink.substitute(term_31.ref(), new Variable[]
					{var_57, var_81}, new Term[]
					{jterm_11, jterm_15});
				sink.copy(sub_20.ref());
				sink.copy(term_3.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_MapM2);
	}

	final public static boolean _M_MapM3(Sink sink, Term term_63, Variable var_135, Variable var_13, Term term_33, Term term_35, Term term_77)
	{
		if (sink.context().sd++ < 256)
		{
			label_152 :
			{
				term_63 = force(sink.context(), term_63);
				if (term_63.descriptor() != _M_PairCons)
				{
					break label_152;
				}
				Term sub_81 = term_63.sub(0).ref();
				/* #nstate=sub */
				Term sub_11 = term_63.sub(1).ref();
				/* #r=sub */
				/* #=term */
				/* #s=term */
				/* #rs=term */
				sink.start(_M_MapM2);
				Variable jvar_66 = sink.context().makeVariable("x");
				Variable jvar_21 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_66, jvar_21});
				Term jterm_91;
				{
					BufferSink buffer_10 = sink.context().makeBuffer();
					buffer_10.use(jvar_66);
					jterm_91 = buffer_10.term();
				}
				Term jterm_54;
				{
					BufferSink buffer_67 = sink.context().makeBuffer();
					buffer_67.use(jvar_21);
					jterm_54 = buffer_67.term();
				}
				sink.substitute(term_33.ref(), new Variable[]
					{var_135, var_13}, new Term[]
					{jterm_91, jterm_54});
				sink.copy(sub_81.ref());
				sink.copy(term_35.ref());
				sink.start(_M_Append);
				sink.copy(sub_11.ref());
				sink.copy(term_77.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_MapM3);
	}

	final public static boolean _M_Flatten(Sink sink, Term term_34)
	{
		if (sink.context().sd++ < 256)
		{
			label_39 :
			{
				term_34 = force(sink.context(), term_34);
				if (term_34.descriptor() != _M_Nil)
				{
					break label_39;
				}
				sink.start(_M_Nil);
				sink.end();
				return true;
			}
			label_71 :
			{
				term_34 = force(sink.context(), term_34);
				if (term_34.descriptor() != _M_Cons)
				{
					break label_71;
				}
				Term sub_51 = term_34.sub(0).ref();
				/* #1=sub */
				Term sub_6 = term_34.sub(1).ref();
				/* #s=sub */
				sink.start(_M_Concat);
				sink.copy(sub_51.ref());
				sink.start(_M_Flatten);
				sink.copy(sub_6.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Flatten);
	}

	final public static boolean _M_PickFirst1(Sink sink, Term term_40, Term term_42, Term term_50, Variable var_9, Term term_183)
	{
		if (sink.context().sd++ < 256)
		{
			label_51 :
			{
				term_40 = force(sink.context(), term_40);
				if (term_40.descriptor() != _M_TRUE)
				{
					break label_51;
				}
				/* #1=term */
				/* #s=term */
				/* #=term */
				sink.start(_M_SOME);
				sink.copy(term_42.ref());
				sink.end();
				return true;
			}
			label_98 :
			{
				term_40 = force(sink.context(), term_40);
				if (term_40.descriptor() != _M_FALSE)
				{
					break label_98;
				}
				/* #1=term */
				/* #s=term */
				/* #=term */
				sink.start(_M_PickFirst);
				sink.copy(term_50.ref());
				Variable jvar_42 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_42});
				Term jterm_157;
				{
					BufferSink buffer_11 = sink.context().makeBuffer();
					buffer_11.use(jvar_42);
					jterm_157 = buffer_11.term();
				}
				sink.substitute(term_183.ref(), new Variable[]
					{var_9}, new Term[]
					{jterm_157});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_PickFirst1);
	}

	final public static boolean _M_Foldl(Sink sink, Variable var_59, Variable var_88, Term term_38, Term term_112, Term term_172)
	{
		if (sink.context().sd++ < 256)
		{
			label_194 :
			{
				/* #F=term */
				/* #Z=term */
				term_172 = force(sink.context(), term_172);
				if (term_172.descriptor() != _M_Nil)
				{
					break label_194;
				}
				sink.copy(term_112.ref());
				return true;
			}
			label_41 :
			{
				/* #F=term */
				/* #Z=term */
				term_172 = force(sink.context(), term_172);
				if (term_172.descriptor() != _M_Cons)
				{
					break label_41;
				}
				Term sub_84 = term_172.sub(0).ref();
				/* #H=sub */
				Term sub_196 = term_172.sub(1).ref();
				/* #T=sub */
				sink.start(_M_Foldl);
				Variable jvar_44 = sink.context().makeVariable("x");
				Variable jvar_65 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_44, jvar_65});
				Term jterm_39;
				{
					BufferSink buffer_70 = sink.context().makeBuffer();
					buffer_70.use(jvar_44);
					jterm_39 = buffer_70.term();
				}
				Term jterm_36;
				{
					BufferSink buffer_94 = sink.context().makeBuffer();
					buffer_94.use(jvar_65);
					jterm_36 = buffer_94.term();
				}
				sink.substitute(term_38.ref(), new Variable[]
					{var_59, var_88}, new Term[]
					{jterm_39, jterm_36});
				Term jterm_2;
				{
					BufferSink buffer_81 = sink.context().makeBuffer();
					buffer_81.copy(sub_84.ref());
					jterm_2 = buffer_81.term();
				}
				Term jterm_33;
				{
					BufferSink buffer_78 = sink.context().makeBuffer();
					buffer_78.copy(term_112.ref());
					jterm_33 = buffer_78.term();
				}
				sink.substitute(term_38.ref(), new Variable[]
					{var_59, var_88}, new Term[]
					{jterm_2, jterm_33});
				sink.copy(sub_196.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Foldl);
	}

	final public static boolean _M_ContainsDuplicates(Sink sink, Term term_153)
	{
		if (sink.context().sd++ < 256)
		{
			label_17 :
			{
				term_153 = force(sink.context(), term_153);
				if (term_153.descriptor() != _M_Nil)
				{
					break label_17;
				}
				sink.start(_M_FALSE);
				sink.end();
				return true;
			}
			label_37 :
			{
				term_153 = force(sink.context(), term_153);
				if (term_153.descriptor() != _M_Cons)
				{
					break label_37;
				}
				Term sub_47 = term_153.sub(0).ref();
				/* #H=sub */
				Term sub_94 = term_153.sub(1).ref();
				/* #T=sub */
				sink.start(_M_Or);
				sink.start(_M_Elem);
				sink.copy(sub_47.ref());
				sink.copy(sub_94.ref());
				sink.end();
				sink.start(_M_ContainsDuplicates);
				sink.copy(sub_94.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_ContainsDuplicates);
	}

	final public static boolean _M_IfEmpty(Sink sink, Term term_88, Term term_24, Term term_71)
	{
		if (sink.context().sd++ < 256)
		{
			label_33 :
			{
				term_88 = force(sink.context(), term_88);
				if (term_88.descriptor() != _M_Nil)
				{
					break label_33;
				}
				/* #1=term */ /* #2=term */ sink.copy(term_24.ref());
				return true;
			}
			label_143 :
			{
				term_88 = force(sink.context(), term_88);
				if (term_88.descriptor() != _M_Cons)
				{
					break label_143;
				}
				Term sub_178 = term_88.sub(0).ref();
				/* #=sub */
				Term sub_82 = term_88.sub(1).ref();
				/* #s=sub */
				/* #1=term */ /* #2=term */ sink.copy(term_71.ref());
				return true;
			}
		}
		return thunk(sink, _M_IfEmpty);
	}

	final public static boolean _M_Head(Sink sink, Term term_62)
	{
		if (sink.context().sd++ < 256)
		{
			label_34 :
			{
				term_62 = force(sink.context(), term_62);
				if (term_62.descriptor() != _M_Nil)
				{
					break label_34;
				}
				sink.start(_M_Error);
				sink.literal("Head of empty list");
				sink.end();
				return true;
			}
			label_2 :
			{
				term_62 = force(sink.context(), term_62);
				if (term_62.descriptor() != _M_Cons)
				{
					break label_2;
				}
				Term sub_184 = term_62.sub(0).ref();
				/* #=sub */
				Term sub_83 = term_62.sub(1).ref();
				/* #s=sub */ sink.copy(sub_184.ref());
				return true;
			}
		}
		return thunk(sink, _M_Head);
	}

	final public static boolean _M_Partition(Sink sink, Variable var_36, Term term_78, Term term_82)
	{
		if (sink.context().sd++ < 256)
		{
			label_57 :
			{
				/* #C=term */
				/* #XS=term */
				sink.start(_M_Foldr);
				Variable jvar_75 = sink.context().makeVariable("x");
				Variable jvar_23 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_75, jvar_23});
				sink.start(_M_MatchPartition);
				Term jterm_196;
				{
					BufferSink buffer_35 = sink.context().makeBuffer();
					buffer_35.use(jvar_75);
					jterm_196 = buffer_35.term();
				}
				sink.substitute(term_78.ref(), new Variable[]
					{var_36}, new Term[]
					{jterm_196});
				sink.use(jvar_75);
				sink.use(jvar_23);
				sink.end();
				sink.start(_M_PairCons);
				sink.start(_M_Nil);
				sink.end();
				sink.start(_M_Nil);
				sink.end();
				sink.end();
				sink.copy(term_82.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Partition);
	}

	final public static boolean _M_ListEqual(Sink sink, Variable var_54, Variable var_187, Term term_97, Term term_76, Term term_28)
	{
		if (sink.context().sd++ < 256)
		{
			label_95 :
			{
				/* #C=term */
				term_76 = force(sink.context(), term_76);
				if (term_76.descriptor() != _M_Nil)
				{
					break label_95;
				}
				term_28 = force(sink.context(), term_28);
				if (term_28.descriptor() != _M_Nil)
				{
					break label_95;
				}
				sink.start(_M_TRUE);
				sink.end();
				return true;
			}
			label_159 :
			{
				/* #C=term */
				term_76 = force(sink.context(), term_76);
				if (term_76.descriptor() != _M_Cons)
				{
					break label_159;
				}
				Term sub_62 = term_76.sub(0).ref();
				/* #x=sub */
				Term sub_183 = term_76.sub(1).ref();
				/* #xs=sub */
				term_28 = force(sink.context(), term_28);
				if (term_28.descriptor() != _M_Nil)
				{
					break label_159;
				}
				sink.start(_M_FALSE);
				sink.end();
				return true;
			}
			label_15 :
			{
				/* #C=term */
				term_76 = force(sink.context(), term_76);
				if (term_76.descriptor() != _M_Nil)
				{
					break label_15;
				}
				term_28 = force(sink.context(), term_28);
				if (term_28.descriptor() != _M_Cons)
				{
					break label_15;
				}
				Term sub_4 = term_28.sub(0).ref();
				/* #y=sub */
				Term sub_192 = term_28.sub(1).ref();
				/* #ys=sub */ sink.start(_M_FALSE);
				sink.end();
				return true;
			}
			label_76 :
			{
				/* #C=term */
				term_76 = force(sink.context(), term_76);
				if (term_76.descriptor() != _M_Cons)
				{
					break label_76;
				}
				Term sub_65 = term_76.sub(0).ref();
				/* #x=sub */
				Term sub_7 = term_76.sub(1).ref();
				/* #xs=sub */
				term_28 = force(sink.context(), term_28);
				if (term_28.descriptor() != _M_Cons)
				{
					break label_76;
				}
				Term sub_42 = term_28.sub(0).ref();
				/* #y=sub */
				Term sub_66 = term_28.sub(1).ref();
				/* #ys=sub */
				sink.start(_M_And);
				Term jterm_178;
				{
					BufferSink buffer_20 = sink.context().makeBuffer();
					buffer_20.copy(sub_65.ref());
					jterm_178 = buffer_20.term();
				}
				Term jterm_37;
				{
					BufferSink buffer_129 = sink.context().makeBuffer();
					buffer_129.copy(sub_42.ref());
					jterm_37 = buffer_129.term();
				}
				sink.substitute(term_97.ref(), new Variable[]
					{var_54, var_187}, new Term[]
					{jterm_178, jterm_37});
				sink.start(_M_ListEqual);
				Variable jvar_6 = sink.context().makeVariable("x");
				Variable jvar_86 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_6, jvar_86});
				Term jterm_21;
				{
					BufferSink buffer_84 = sink.context().makeBuffer();
					buffer_84.use(jvar_6);
					jterm_21 = buffer_84.term();
				}
				Term jterm_183;
				{
					BufferSink buffer_19 = sink.context().makeBuffer();
					buffer_19.use(jvar_86);
					jterm_183 = buffer_19.term();
				}
				sink.substitute(term_97.ref(), new Variable[]
					{var_54, var_187}, new Term[]
					{jterm_21, jterm_183});
				sink.copy(sub_7.ref());
				sink.copy(sub_66.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_ListEqual);
	}

	final public static boolean _M_IfSingleton(Sink sink, Term term_29, Term term_54, Term term_18)
	{
		if (sink.context().sd++ < 256)
		{
			label_156 :
			{
				term_29 = force(sink.context(), term_29);
				if (term_29.descriptor() != _M_Nil)
				{
					break label_156;
				}
				/* #1=term */ /* #2=term */ sink.copy(term_18.ref());
				return true;
			}
			label_305 :
			{
				term_29 = force(sink.context(), term_29);
				if (term_29.descriptor() != _M_Cons)
				{
					break label_305;
				}
				Term sub_38 = term_29.sub(0).ref();
				/* #=sub */
				Term sub_87 = term_29.sub(1).ref();
				/* #s=sub */
				/* #1=term */
				/* #2=term */
				sink.start(_M_IfEmpty);
				sink.copy(sub_87.ref());
				sink.copy(term_54.ref());
				sink.copy(term_18.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_IfSingleton);
	}

	final public static boolean _M_Tail(Sink sink, Term term_161)
	{
		if (sink.context().sd++ < 256)
		{
			label_61 :
			{
				term_161 = force(sink.context(), term_161);
				if (term_161.descriptor() != _M_Nil)
				{
					break label_61;
				}
				sink.start(_M_Error);
				sink.literal("Tail of empty list");
				sink.end();
				return true;
			}
			label_189 :
			{
				term_161 = force(sink.context(), term_161);
				if (term_161.descriptor() != _M_Cons)
				{
					break label_189;
				}
				Term sub_49 = term_161.sub(0).ref();
				/* #=sub */
				Term sub_95 = term_161.sub(1).ref();
				/* #s=sub */ sink.copy(sub_95.ref());
				return true;
			}
		}
		return thunk(sink, _M_Tail);
	}

	final public static boolean _M_At(Sink sink, Term term_11, Term term_151)
	{
		if (sink.context().sd++ < 256)
		{
			label_25 :
			{
				term_11 = force(sink.context(), term_11);
				if (term_11.descriptor() != _M_Nil)
				{
					break label_25;
				}
				/* #i=term */ sink.start(_M_NONE);
				sink.end();
				return true;
			}
			label_45 :
			{
				term_11 = force(sink.context(), term_11);
				if (term_11.descriptor() != _M_Cons)
				{
					break label_45;
				}
				Term sub_126 = term_11.sub(0).ref();
				/* #=sub */
				Term sub_8 = term_11.sub(1).ref();
				/* #s=sub */
				/* #i=term */
				sink.start(_M_If);
				sink.start(_M_Equal);
				sink.copy(term_151.ref());
				sink.literal(0);
				sink.end();
				sink.start(_M_SOME);
				sink.copy(sub_126.ref());
				sink.end();
				sink.start(_M_At);
				sink.copy(sub_8.ref());
				sink.start(_M_Minus);
				sink.copy(term_151.ref());
				sink.literal(1);
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_At);
	}

	final public static boolean _M_Map2(Sink sink, Variable var_7, Term term_150, Term term_80)
	{
		if (sink.context().sd++ < 256)
		{
			label_92 :
			{
				/* #F=term */
				/* #XS=term */
				sink.start(_M_Foldr);
				Variable jvar_22 = sink.context().makeVariable("x");
				Variable jvar_170 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_22, jvar_170});
				sink.start(_M_Insert);
				Term jterm_79;
				{
					BufferSink buffer_18 = sink.context().makeBuffer();
					buffer_18.use(jvar_22);
					jterm_79 = buffer_18.term();
				}
				sink.substitute(term_150.ref(), new Variable[]
					{var_7}, new Term[]
					{jterm_79});
				sink.use(jvar_170);
				sink.end();
				sink.start(_M_Nil);
				sink.end();
				sink.copy(term_80.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Map2);
	}

	final public static boolean _M_Intersect(Sink sink, Term term_211, Term term_101)
	{
		if (sink.context().sd++ < 256)
		{
			label_59 :
			{
				/* #XS=term */
				/* #YS=term */
				sink.start(_M_Foldr);
				Variable jvar_3 = sink.context().makeVariable("x");
				Variable jvar_45 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_3, jvar_45});
				sink.start(_M_ConditionalInsert);
				sink.start(_M_Elem);
				sink.use(jvar_3);
				sink.copy(term_101.ref());
				sink.end();
				sink.use(jvar_3);
				sink.use(jvar_45);
				sink.end();
				sink.start(_M_Nil);
				sink.end();
				sink.copy(term_211.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Intersect);
	}

	final public static boolean _M_Concat(Sink sink, Term term_5, Term term_19)
	{
		if (sink.context().sd++ < 256)
		{
			label_87 :
			{
				term_5 = force(sink.context(), term_5);
				if (term_5.descriptor() != _M_Nil)
				{
					break label_87;
				}
				/* #tail=term */ sink.copy(term_19.ref());
				return true;
			}
			label_109 :
			{
				term_5 = force(sink.context(), term_5);
				if (term_5.descriptor() != _M_Cons)
				{
					break label_109;
				}
				Term sub_2 = term_5.sub(0).ref();
				/* #1=sub */
				Term sub_39 = term_5.sub(1).ref();
				/* #s=sub */
				/* #tail=term */
				sink.start(_M_Cons);
				sink.copy(sub_2.ref());
				sink.start(_M_Concat);
				sink.copy(sub_39.ref());
				sink.copy(term_19.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Concat);
	}

	final public static boolean _M_Elem(Sink sink, Term term_95, Term term_64)
	{
		if (sink.context().sd++ < 256)
		{
			label_102 :
			{
				/* #X=term */
				/* #XS=term */
				sink.start(_M_Foldr);
				Variable jvar_70 = sink.context().makeVariable("x");
				Variable jvar_89 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_70, jvar_89});
				sink.start(_M_Or);
				sink.start(_M_Equal);
				sink.copy(term_95.ref());
				sink.use(jvar_70);
				sink.end();
				sink.use(jvar_89);
				sink.end();
				sink.start(_M_FALSE);
				sink.end();
				sink.copy(term_64.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Elem);
	}

	final public static boolean _M_Union(Sink sink, Term term_16, Term term_30)
	{
		if (sink.context().sd++ < 256)
		{
			label_90 :
			{
				/* #XS=term */
				/* #YS=term */
				sink.start(_M_RemoveDuplicates);
				sink.start(_M_Concat);
				sink.copy(term_16.ref());
				sink.copy(term_30.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Union);
	}

	final public static boolean _M_ConditionalInsert(Sink sink, Term term_109, Term term_280, Term term_68)
	{
		if (sink.context().sd++ < 256)
		{
			label_94 :
			{
				term_109 = force(sink.context(), term_109);
				if (term_109.descriptor() != _M_TRUE)
				{
					break label_94;
				}
				/* #X=term */
				/* #XS=term */
				sink.start(_M_Insert);
				sink.copy(term_280.ref());
				sink.copy(term_68.ref());
				sink.end();
				return true;
			}
			label_135 :
			{
				term_109 = force(sink.context(), term_109);
				if (term_109.descriptor() != _M_FALSE)
				{
					break label_135;
				}
				/* #X=term */ /* #XS=term */ sink.copy(term_68.ref());
				return true;
			}
		}
		return thunk(sink, _M_ConditionalInsert);
	}

	final public static boolean _M_Insert(Sink sink, Term term_168, Term term_89)
	{
		if (sink.context().sd++ < 256)
		{
			label_69 :
			{
				/* #X=term */
				/* #XS=term */
				sink.start(_M_Cons);
				sink.copy(term_168.ref());
				sink.copy(term_89.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Insert);
	}

	final public static boolean _M_IWrapFoldlP(Sink sink, Variable var_67, Variable var_76, Term term_61, Term term_21, Term term_167)
	{
		if (sink.context().sd++ < 256)
		{
			label_81 :
			{
				/* #F=term */
				/* #Z=term */
				/* #XS=term */
				sink.start(_M_FoldlP);
				Variable jvar_58 = sink.context().makeVariable("x");
				Variable jvar_40 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_58, jvar_40});
				Term jterm_4;
				{
					BufferSink buffer_3 = sink.context().makeBuffer();
					buffer_3.use(jvar_58);
					jterm_4 = buffer_3.term();
				}
				Term jterm_72;
				{
					BufferSink buffer_83 = sink.context().makeBuffer();
					buffer_83.use(jvar_40);
					jterm_72 = buffer_83.term();
				}
				sink.substitute(term_61.ref(), new Variable[]
					{var_67, var_76}, new Term[]
					{jterm_4, jterm_72});
				sink.copy(term_21.ref());
				sink.copy(term_167.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_IWrapFoldlP);
	}

	final public static boolean _M_MatchPartition(Sink sink, Term term_2, Term term_73, Term term_131)
	{
		if (sink.context().sd++ < 256)
		{
			label_120 :
			{
				term_2 = force(sink.context(), term_2);
				if (term_2.descriptor() != _M_TRUE)
				{
					break label_120;
				}
				/* #X=term */
				term_131 = force(sink.context(), term_131);
				if (term_131.descriptor() != _M_PairCons)
				{
					break label_120;
				}
				Term sub_297 = term_131.sub(0).ref();
				/* #TS=sub */
				Term sub_70 = term_131.sub(1).ref();
				/* #FS=sub */
				sink.start(_M_PairCons);
				sink.start(_M_Insert);
				sink.copy(term_73.ref());
				sink.copy(sub_297.ref());
				sink.end();
				sink.copy(sub_70.ref());
				sink.end();
				return true;
			}
			label_255 :
			{
				term_2 = force(sink.context(), term_2);
				if (term_2.descriptor() != _M_FALSE)
				{
					break label_255;
				}
				/* #X=term */
				term_131 = force(sink.context(), term_131);
				if (term_131.descriptor() != _M_PairCons)
				{
					break label_255;
				}
				Term sub_25 = term_131.sub(0).ref();
				/* #TS=sub */
				Term sub_92 = term_131.sub(1).ref();
				/* #FS=sub */
				sink.start(_M_PairCons);
				sink.copy(sub_25.ref());
				sink.start(_M_Insert);
				sink.copy(term_73.ref());
				sink.copy(sub_92.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_MatchPartition);
	}

	final public static boolean _M_FoldlP(Sink sink, Variable var_39, Variable var_62, Term term_189, Term term_27, Term term_166)
	{
		if (sink.context().sd++ < 256)
		{
			label_56 :
			{
				/* #F=term */
				/* #Z=term */
				term_166 = force(sink.context(), term_166);
				if (term_166.descriptor() != _M_Nil)
				{
					break label_56;
				}
				sink.copy(term_27.ref());
				return true;
			}
			label_74 :
			{
				/* #F=term */
				/* #Z=term */
				term_166 = force(sink.context(), term_166);
				if (term_166.descriptor() != _M_Cons)
				{
					break label_74;
				}
				Term sub_372 = term_166.sub(0).ref();
				/* #H=sub */
				Term sub_108 = term_166.sub(1).ref();
				/* #T=sub */
				sink.start(_M_FoldlP);
				Variable jvar_7 = sink.context().makeVariable("x");
				Variable jvar_26 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_7, jvar_26});
				Term jterm_45;
				{
					BufferSink buffer_50 = sink.context().makeBuffer();
					buffer_50.use(jvar_7);
					jterm_45 = buffer_50.term();
				}
				Term jterm_259;
				{
					BufferSink buffer_146 = sink.context().makeBuffer();
					buffer_146.use(jvar_26);
					jterm_259 = buffer_146.term();
				}
				sink.substitute(term_189.ref(), new Variable[]
					{var_39, var_62}, new Term[]
					{jterm_45, jterm_259});
				Term jterm_130;
				{
					BufferSink buffer_57 = sink.context().makeBuffer();
					buffer_57.copy(sub_372.ref());
					jterm_130 = buffer_57.term();
				}
				Term jterm_74;
				{
					BufferSink buffer_114 = sink.context().makeBuffer();
					buffer_114.copy(term_27.ref());
					jterm_74 = buffer_114.term();
				}
				sink.substitute(term_189.ref(), new Variable[]
					{var_39, var_62}, new Term[]
					{jterm_130, jterm_74});
				sink.copy(sub_108.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_FoldlP);
	}

	final public static boolean _M_PickFirst(Sink sink, Term term_124, Variable var_72, Term term_72)
	{
		if (sink.context().sd++ < 256)
		{
			label_68 :
			{
				term_124 = force(sink.context(), term_124);
				if (term_124.descriptor() != _M_Nil)
				{
					break label_68;
				}
				/* #=term */ sink.start(_M_NONE);
				sink.end();
				return true;
			}
			label_9 :
			{
				term_124 = force(sink.context(), term_124);
				if (term_124.descriptor() != _M_Cons)
				{
					break label_9;
				}
				Term sub_186 = term_124.sub(0).ref();
				/* #1=sub */
				Term sub_193 = term_124.sub(1).ref();
				/* #s=sub */
				/* #=term */
				sink.start(_M_PickFirst1);
				Term jterm_64;
				{
					BufferSink buffer_33 = sink.context().makeBuffer();
					buffer_33.copy(sub_186.ref());
					jterm_64 = buffer_33.term();
				}
				sink.substitute(term_72.ref(), new Variable[]
					{var_72}, new Term[]
					{jterm_64});
				sink.copy(sub_186.ref());
				sink.copy(sub_193.ref());
				Variable jvar_39 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_39});
				Term jterm_48;
				{
					BufferSink buffer_39 = sink.context().makeBuffer();
					buffer_39.use(jvar_39);
					jterm_48 = buffer_39.term();
				}
				sink.substitute(term_72.ref(), new Variable[]
					{var_72}, new Term[]
					{jterm_48});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_PickFirst);
	}

	final public static boolean _M_Reverse(Sink sink, Term term_9)
	{
		if (sink.context().sd++ < 256)
		{
			label_66 :
			{
				/* #XS=term */
				sink.start(_M_Foldl);
				Variable jvar_142 = sink.context().makeVariable("x");
				Variable jvar_62 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{jvar_142, jvar_62});
				sink.start(_M_Insert);
				sink.use(jvar_142);
				sink.use(jvar_62);
				sink.end();
				sink.start(_M_Nil);
				sink.end();
				sink.copy(term_9.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Reverse);
	}

	final public static boolean _M_Null(Sink sink, Term term_44)
	{
		if (sink.context().sd++ < 256)
		{
			label_170 :
			{
				term_44 = force(sink.context(), term_44);
				if (term_44.descriptor() != _M_Nil)
				{
					break label_170;
				}
				sink.start(_M_TRUE);
				sink.end();
				return true;
			}
			label_195 :
			{
				term_44 = force(sink.context(), term_44);
				if (term_44.descriptor() != _M_Cons)
				{
					break label_195;
				}
				Term sub_99 = term_44.sub(0).ref();
				/* #H=sub */
				Term sub_33 = term_44.sub(1).ref();
				/* #T=sub */ sink.start(_M_FALSE);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Null);
	}

	final public static boolean _M_Zip(Sink sink, Term term_85, Term term_55)
	{
		if (sink.context().sd++ < 256)
		{
			label_46 :
			{
				term_85 = force(sink.context(), term_85);
				if (term_85.descriptor() != _M_Nil)
				{
					break label_46;
				}
				term_55 = force(sink.context(), term_55);
				if (term_55.descriptor() != _M_Nil)
				{
					break label_46;
				}
				sink.start(_M_Nil);
				sink.end();
				return true;
			}
			label_115 :
			{
				term_85 = force(sink.context(), term_85);
				if (term_85.descriptor() != _M_Nil)
				{
					break label_115;
				}
				/* #=term */
				sink.start(_M_Error);
				sink.literal("ListExtension.Zip: second argument list was longer");
				sink.end();
				return true;
			}
			label_113 :
			{
				/* #=term */
				term_55 = force(sink.context(), term_55);
				if (term_55.descriptor() != _M_Nil)
				{
					break label_113;
				}
				sink.start(_M_Error);
				sink.literal("ListExtension.Zip: first argument list was longer");
				sink.end();
				return true;
			}
			label_110 :
			{
				term_85 = force(sink.context(), term_85);
				if (term_85.descriptor() != _M_Cons)
				{
					break label_110;
				}
				Term sub_36 = term_85.sub(0).ref();
				/* #X=sub */
				Term sub_21 = term_85.sub(1).ref();
				/* #XS=sub */
				term_55 = force(sink.context(), term_55);
				if (term_55.descriptor() != _M_Cons)
				{
					break label_110;
				}
				Term sub_129 = term_55.sub(0).ref();
				/* #Y=sub */
				Term sub_57 = term_55.sub(1).ref();
				/* #YS=sub */
				sink.start(_M_Cons);
				sink.start(_M_PairCons);
				sink.copy(sub_36.ref());
				sink.copy(sub_129.ref());
				sink.end();
				sink.start(_M_Zip);
				sink.copy(sub_21.ref());
				sink.copy(sub_57.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Zip);
	}

	final public static boolean _M_IsEmpty(Sink sink, Term term_20)
	{
		if (sink.context().sd++ < 256)
		{
			label_86 :
			{
				term_20 = force(sink.context(), term_20);
				if (term_20.descriptor() != _M_Nil)
				{
					break label_86;
				}
				sink.start(_M_TRUE);
				sink.end();
				return true;
			}
			label_297 :
			{
				term_20 = force(sink.context(), term_20);
				if (term_20.descriptor() != _M_Cons)
				{
					break label_297;
				}
				Term sub_198 = term_20.sub(0).ref();
				/* #=sub */
				Term sub_101 = term_20.sub(1).ref();
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
			org.crsx.compiler.std.Num.init(context);
			org.crsx.compiler.std.Pair.init(context);
			org.crsx.compiler.std.Core.init(context);
			initialized = true;
		}
	}
}