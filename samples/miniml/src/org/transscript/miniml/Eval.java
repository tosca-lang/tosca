
/** Generated File */

package org.transscript.miniml;

import static org.transscript.runtime.ConstructionDescriptor.makeData;
import static org.transscript.runtime.ConstructionDescriptor.makeFunction;
import static org.transscript.runtime.Normalizer.thunk;
import static org.transscript.runtime.Normalizer.force;
import static org.transscript.runtime.Normalizer.forceSub;
import static org.transscript.runtime.Normalizer.normalize;
import static org.transscript.runtime.Reference.safeRef;
import static org.transscript.runtime.Term.isVariableUse;

import org.transscript.runtime.*;
import org.transscript.runtime.ConstructionDescriptor.*;

import static org.transscript.compiler.std.Num.*;
import static org.transscript.miniml.Miniml.*;

@SuppressWarnings("unused")
public class Eval
{

	/* Enumerations */

	/* Function descriptors */
	final public static DynamicFunctionDescriptor _M_EvalExpr = makeFunction("EvalExpr", Eval.class, "_M_EvalExpr");
	final public static DynamicFunctionDescriptor _M_EvalPrimaryExpr = makeFunction(
			"EvalPrimaryExpr", Eval.class, "_M_EvalPrimaryExpr");
	final public static DynamicFunctionDescriptor _M_EvalTimesExpr = makeFunction("EvalTimesExpr", Eval.class, "_M_EvalTimesExpr");
	final public static DynamicFunctionDescriptor _M_EvalCompExpr = makeFunction("EvalCompExpr", Eval.class, "_M_EvalCompExpr");
	final public static DynamicFunctionDescriptor _M_Eval = makeFunction("Eval", Eval.class, "_M_Eval");

	final public static boolean _M_EvalExpr(Sink sink, Term x_39)
	{
		if (sink.context().sd++ < 256)
		{

			x_49 :
			{
				x_39 = force(sink.context(), x_39);
				if (x_39.descriptor() != _M_MiniML_xexpr_xA1)
				{
					break x_49;
				}
				Term x_63 = x_39.sub(0).ref();
				/* #timesExpr=x_63 */
				Term x_78 = x_39.sub(1).ref();
				/* #expr=x_78 */
				sink.start(_M_Plus);
				sink.start(_M_EvalTimesExpr);
				sink.copy(x_63.ref());
				sink.end();
				sink.start(_M_EvalExpr);
				sink.copy(x_78.ref());
				sink.end();
				sink.end();
				return true;
			}
			x_239 :
			{
				x_39 = force(sink.context(), x_39);
				if (x_39.descriptor() != _M_MiniML_xexpr_xA2)
				{
					break x_239;
				}
				Term x_253 = x_39.sub(0).ref();
				/* #timesExpr=x_253 */
				Term x_268 = x_39.sub(1).ref();
				/* #expr=x_268 */
				sink.start(_M_Minus);
				sink.start(_M_EvalTimesExpr);
				sink.copy(x_253.ref());
				sink.end();
				sink.start(_M_EvalExpr);
				sink.copy(x_268.ref());
				sink.end();
				sink.end();
				return true;
			}
			x_429 :
			{
				x_39 = force(sink.context(), x_39);
				if (x_39.descriptor() != _M_MiniML_xexpr_xA3)
				{
					break x_429;
				}
				Term x_443 = x_39.sub(0).ref();
				/* #timesExpr=x_443 */
				sink.start(_M_EvalTimesExpr);
				sink.copy(x_443.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_EvalExpr, x_39);
	}

	final public static boolean _M_EvalPrimaryExpr(Sink sink, Term x_496)
	{
		if (sink.context().sd++ < 256)
		{

			x_506 :
			{
				x_496 = force(sink.context(), x_496);
				if (x_496.descriptor() != _M_MiniML_xprimaryExpr_xA2)
				{
					break x_506;
				}
				Term x_520 = x_496.sub(0).ref();
				/* #INT=x_520 */
				sink.start(_M_Minus);
				sink.literal(1);
				sink.copy(x_520.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_EvalPrimaryExpr, x_496);
	}

	final public static boolean _M_EvalTimesExpr(Sink sink, Term x_586)
	{
		if (sink.context().sd++ < 256)
		{

			x_596 :
			{
				x_586 = force(sink.context(), x_586);
				if (x_586.descriptor() != _M_MiniML_xtimesExpr_xA2)
				{
					break x_596;
				}
				Term x_610 = x_586.sub(0).ref();
				/* #compExpr=x_610 */
				sink.start(_M_EvalCompExpr);
				sink.copy(x_610.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_EvalTimesExpr, x_586);
	}

	final public static boolean _M_EvalCompExpr(Sink sink, Term x_663)
	{
		if (sink.context().sd++ < 256)
		{

			x_673 :
			{
				x_663 = force(sink.context(), x_663);
				if (x_663.descriptor() != _M_MiniML_xcompExpr_xA3)
				{
					break x_673;
				}
				Term x_687 = x_663.sub(0).ref();
				/* #primaryExpr=x_687 */
				sink.start(_M_EvalPrimaryExpr);
				sink.copy(x_687.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_EvalCompExpr, x_663);
	}

	final public static boolean _M_Eval(Sink sink, Term x_740)
	{
		if (sink.context().sd++ < 256)
		{

			x_750 :
			{
				x_740 = force(sink.context(), x_740);
				if (x_740.descriptor() != _M_MiniML_xtoplevel_xA2)
				{
					break x_750;
				}
				Term x_764 = x_740.sub(0).ref();
				/* #expr=x_764 */
				sink.start(_M_EvalExpr);
				sink.copy(x_764.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Eval, x_740);
	}

	private static boolean initialized = false;

	public static void init(Context context)
	{
		if (!initialized)
		{
			initialized = true;

			context.register(_M_EvalExpr);
			context.register(_M_EvalPrimaryExpr);
			context.register(_M_EvalTimesExpr);
			context.register(_M_EvalCompExpr);
			context.register(_M_Eval);

			org.transscript.compiler.std.Num.init(context);
			org.transscript.miniml.Miniml.init(context);
		}
	}
}
