/* START MODULE std/list.crs.java */
/** Generated File */

package org.crsx.compiler.std;

import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;
import static org.crsx.runtime.Normalizer.force;
import static org.crsx.runtime.Reference.safeRef;

import org.crsx.runtime.*;
import org.crsx.runtime.ConstructionDescriptor.*;
import static org.crsx.runtime.Primitives.*;
import static org.crsx.compiler.std.Core.*;

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
	final public static DynamicFunctionDescriptor _M_IsEmpty = makeFunction("IsEmpty", List.class, "_M_IsEmpty");

	final public static boolean _M_SeqMap1(Sink sink, int shared, int depth, Properties props, Term term, Variable var, Variable var_41, Term term_19, Term term_4, Variable var_57, Term term_64)
	{
		if (depth < 2000)
		{
			label :
			{
				if (term.descriptor() != _M_OK)
				{
					break label;
				}
				/* #=term */
				if (term_4.descriptor() != _M__sNil)
				{
					break label;
				}
				/* #done=term */
				/*Contract*/
				sink.properties(safeRef(props));
				Term term_33;
				{
					BufferSink buf = sink.context().makeBuffer();
					buf.start(_M_OK);
					buf.end();
					term_33 = buf.term();
				}
				sink.substitute(term_64.ref(), new Variable[]
					{var_57}, new Term[]
					{term_33});
				return true;
			}
			label_86 :
			{
				if (term.descriptor() != _M_OK)
				{
					break label_86;
				}
				/* #=term */
				if (term_4.descriptor() != _M__sCons)
				{
					break label_86;
				}
				Term sub = term_4.sub(0).ref();
				/* #1=sub */Term sub_32 = term_4.sub(1).ref();
				/* #s=sub */
				/* #done=term *//*Contract*/sink.properties(safeRef(props));
				Term term_2;
				{
					BufferSink buf_8 = sink.context().makeBuffer();
					buf_8.copy(sub.ref());
					term_2 = buf_8.term();
				}
				Term term_74;
				{
					BufferSink buf_23 = sink.context().makeBuffer();
					buf_23.start(_M_CONTINUATION);
					Variable var_97 = buf_23.context().makeVariable("ok");
					buf_23.binds(new Variable[]
						{var_97});
					buf_23.start(_M_SeqMap1);
					buf_23.use(var_97);
					Variable var_73 = buf_23.context().makeVariable("x");
					Variable var_0 = buf_23.context().makeVariable("c");
					buf_23.binds(new Variable[]
						{var_73, var_0});
					VariableUse use = buf_23.context().makeVariableUse(var_73);
					VariableUse use_41 = buf_23.context().makeVariableUse(var_0);
					buf_23.substitute(term_19.ref(), new Variable[]
						{var, var_41}, new Term[]
						{use, use_41});
					buf_23.copy(sub_32.ref());
					Variable var_12 = buf_23.context().makeVariable("ok");
					buf_23.binds(new Variable[]
						{var_12});
					VariableUse use_90 = buf_23.context().makeVariableUse(var_12);
					buf_23.substitute(term_64.ref(), new Variable[]
						{var_57}, new Term[]
						{use_90});
					buf_23.end();
					buf_23.end();
					term_74 = buf_23.term();
				}
				sink.substitute(term_19.ref(), new Variable[]
					{var, var_41}, new Term[]
					{term_2, term_74});
				return true;
			}
		}
		return thunk(sink, _M_SeqMap1, props, term, var, var_41, term_19, term_4, var_57, term_64);
	}

	final public static boolean _M_SeqMap(Sink sink, int shared, int depth, Properties props_38, Variable var_94, Variable var_69, Term term_89, Term term_26, Variable var_6, Term term_37)
	{
		if (depth < 2000)
		{
			label_20 :
			{
				/* #=term */
				/* #list=term */
				/* #done=term *//*Contract*/sink.properties(safeRef(props_38));
				sink.start(_M_SeqMap1);
				sink.start(_M_OK);
				sink.end();
				Variable var_70 = sink.context().makeVariable("x");
				Variable var_40 = sink.context().makeVariable("c");
				sink.binds(new Variable[]
					{var_70, var_40});
				VariableUse use_49 = sink.context().makeVariableUse(var_70);
				VariableUse use_92 = sink.context().makeVariableUse(var_40);
				sink.substitute(term_89.ref(), new Variable[]
					{var_94, var_69}, new Term[]
					{use_49, use_92});
				sink.copy(term_26.ref());
				Variable var_31 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_31});
				VariableUse use_72 = sink.context().makeVariableUse(var_31);
				sink.substitute(term_37.ref(), new Variable[]
					{var_6}, new Term[]
					{use_72});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SeqMap, props_38, var_94, var_69, term_89, term_26, var_6, term_37);
	}

	final public static boolean _M_Map(Sink sink, int shared, int depth, Variable var_24, Term term_65, Term term_86)
	{
		if (depth < 2000)
		{
			label_47 :
			{
				/* #=term */
				if (term_86.descriptor() != _M__sNil)
				{
					break label_47;
				}/*Contract*/
				sink.start(_M__sNil);
				sink.end();
				return true;
			}
			label_2 :
			{
				/* #=term */
				if (term_86.descriptor() != _M__sCons)
				{
					break label_2;
				}
				Term sub_82 = term_86.sub(0).ref();
				/* #1=sub */Term sub_79 = term_86.sub(1).ref();
				/* #s=sub *//*Contract*/
				sink.start(_M__sCons);
				Term term_226;
				{
					BufferSink buf_81 = sink.context().makeBuffer();
					buf_81.copy(sub_82.ref());
					term_226 = buf_81.term();
				}
				sink.substitute(term_65.ref(), new Variable[]
					{var_24}, new Term[]
					{term_226});
				sink.start(_M_Map);
				Variable var_74 = sink.context().makeVariable("x");
				sink.binds(new Variable[]
					{var_74});
				VariableUse use_48 = sink.context().makeVariableUse(var_74);
				sink.substitute(term_65.ref(), new Variable[]
					{var_24}, new Term[]
					{use_48});
				sink.copy(sub_79.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Map, var_24, term_65, term_86);
	}

	final public static boolean _M_Concat(Sink sink, int shared, int depth, Term term_85, Term term_39)
	{
		if (depth < 2000)
		{
			label_57 :
			{
				if (term_85.descriptor() != _M__sNil)
				{
					break label_57;
				}
				/* #tail=term *//*Contract*/sink.copy(term_39.ref());
				return true;
			}
			label_17 :
			{
				if (term_85.descriptor() != _M__sCons)
				{
					break label_17;
				}
				Term sub_62 = term_85.sub(0).ref();
				/* #1=sub */Term sub_57 = term_85.sub(1).ref();
				/* #s=sub */
				/* #tail=term *//*Contract*/
				sink.start(_M__sCons);
				sink.copy(sub_62.ref());
				sink.start(_M_Concat);
				sink.copy(sub_57.ref());
				sink.copy(term_39.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Concat, term_85, term_39);
	}

	final public static boolean _M_Tail(Sink sink, int shared, int depth, Term term_32)
	{
		if (depth < 2000)
		{
			label_24 :
			{
				if (term_32.descriptor() != _M__sCons)
				{
					break label_24;
				}
				Term sub_99 = term_32.sub(0).ref();
				/* #=sub */Term sub_29 = term_32.sub(1).ref(); /* #s=sub *//*Contract*/
				sink.copy(sub_29.ref());
				return true;
			}
			label_25 :
			{
				if (term_32.descriptor() != _M__sNil)
				{
					break label_25;
				}/*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.literal("Tail of empty list");
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Tail, term_32);
	}

	final public static boolean _M_Head(Sink sink, int shared, int depth, Term term_92)
	{
		if (depth < 2000)
		{
			label_6 :
			{
				if (term_92.descriptor() != _M__sCons)
				{
					break label_6;
				}
				Term sub_19 = term_92.sub(0).ref();
				/* #=sub */Term sub_84 = term_92.sub(1).ref(); /* #s=sub *//*Contract*/
				sink.copy(sub_19.ref());
				return true;
			}
			label_74 :
			{
				if (term_92.descriptor() != _M__sNil)
				{
					break label_74;
				}/*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.literal("Head of empty list");
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Head, term_92);
	}

	final public static boolean _M_IfSingleton(Sink sink, int shared, int depth, Term term_48, Term term_73, Term term_94)
	{
		if (depth < 2000)
		{
			label_59 :
			{
				if (term_48.descriptor() != _M__sNil)
				{
					break label_59;
				}
				/* #1=term */
				/* #2=term *//*Contract*/sink.copy(term_94.ref());
				return true;
			}
			label_82 :
			{
				if (term_48.descriptor() != _M__sCons)
				{
					break label_82;
				}
				Term sub_75 = term_48.sub(0).ref();
				/* #=sub */Term sub_3 = term_48.sub(1).ref();
				/* #s=sub */
				/* #1=term */
				/* #2=term *//*Contract*/
				sink.start(_M_IfEmpty);
				sink.copy(sub_3.ref());
				sink.copy(term_73.ref());
				sink.copy(term_94.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_IfSingleton, term_48, term_73, term_94);
	}

	final public static boolean _M_IsSingleton(Sink sink, int shared, int depth, Term term_7)
	{
		if (depth < 2000)
		{
			label_8 :
			{
				if (term_7.descriptor() != _M__sNil)
				{
					break label_8;
				}/*Contract*/
				sink.start(_M_FALSE);
				sink.end();
				return true;
			}
			label_13 :
			{
				if (term_7.descriptor() != _M__sCons)
				{
					break label_13;
				}
				Term sub_39 = term_7.sub(0).ref();
				/* #=sub */Term sub_83 = term_7.sub(1).ref();
				/* #s=sub *//*Contract*/
				sink.start(_M_IsEmpty);
				sink.copy(sub_83.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_IsSingleton, term_7);
	}

	final public static boolean _M_IfEmpty(Sink sink, int shared, int depth, Term term_22, Term term_125, Term term_30)
	{
		if (depth < 2000)
		{
			label_96 :
			{
				if (term_22.descriptor() != _M__sNil)
				{
					break label_96;
				}
				/* #1=term */
				/* #2=term *//*Contract*/sink.copy(term_125.ref());
				return true;
			}
			label_179 :
			{
				if (term_22.descriptor() != _M__sCons)
				{
					break label_179;
				}
				Term sub_58 = term_22.sub(0).ref();
				/* #=sub */Term sub_26 = term_22.sub(1).ref();
				/* #s=sub */
				/* #1=term */
				/* #2=term *//*Contract*/sink.copy(term_30.ref());
				return true;
			}
		}
		return thunk(sink, _M_IfEmpty, term_22, term_125, term_30);
	}

	final public static boolean _M_IsEmpty(Sink sink, int shared, int depth, Term term_8)
	{
		if (depth < 2000)
		{
			label_31 :
			{
				if (term_8.descriptor() != _M__sNil)
				{
					break label_31;
				}/*Contract*/
				sink.start(_M_TRUE);
				sink.end();
				return true;
			}
			label_106 :
			{
				if (term_8.descriptor() != _M__sCons)
				{
					break label_106;
				}
				Term sub_215 = term_8.sub(0).ref();
				/* #=sub */Term sub_89 = term_8.sub(1).ref();
				/* #s=sub *//*Contract*/sink.start(_M_FALSE);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_IsEmpty, term_8);
	}
	private static boolean initialized = false;

	public static void init(Context context)
	{
		if (!initialized)
		{
			org.crsx.compiler.std.Core.init(context);
			context.register(_M_CONTINUATION);
			context.register(_M_SeqMap1);
			context.register(_M_SeqMap);
			context.register(_M_Map);
			context.register(_M_Concat);
			context.register(_M_Tail);
			context.register(_M_Head);
			context.register(_M_IfSingleton);
			context.register(_M_IsSingleton);
			context.register(_M_IfEmpty);
			context.register(_M_IsEmpty);
			initialized = true;
		}
	}

	/* END MODULE « "std/list.crs.java" » */
}