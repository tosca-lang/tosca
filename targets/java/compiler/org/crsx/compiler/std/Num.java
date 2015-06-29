/* START MODULE std/num.crs.java */
/** Generated File */package org.crsx.compiler.std;
import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;

import org.crsx.runtime.*;
import org.crsx.runtime.ConstructionDescriptor.*;
import static org.crsx.runtime.Primitives.*; import static org.crsx.compiler.std.Core.*;

public class Num
{
  final public static DynamicFunctionDescriptor _M_NumberMinus = makeFunction("NumberMinus", Num.class, "_M_NumberMinus");
  final public static DynamicFunctionDescriptor _M_NumberPlus = makeFunction("NumberPlus", Num.class, "_M_NumberPlus");
  final public static DynamicFunctionDescriptor _M_NumberEqual = makeFunction("NumberEqual", Num.class, "_M_NumberEqual");final public static boolean _M_NumberMinus(Sink sink, int shared, int depth, Term term, Term term_79) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sMinus); sink.end(); sink.copy(term); sink.copy(term_79);
      sink.end(); return true;
    }
    return thunk(sink, _M_NumberMinus, term, term_79);
  }  final public static boolean _M_NumberPlus(Sink sink, int shared, int depth, Term term_27, Term term_25) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sPlus); sink.end(); sink.copy(term_27); sink.copy(term_25);
      sink.end(); return true;
    }
    return thunk(sink, _M_NumberPlus, term_27, term_25);
  }  final public static boolean _M_NumberEqual(Sink sink, int shared, int depth, Term term_1, Term term_30) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sEqual); sink.end(); sink.copy(term_1); sink.copy(term_30);
      sink.end(); sink.start(_M_TRUE); sink.end(); sink.start(_M_FALSE); sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_NumberEqual, term_1, term_30);
  }  public static void init(Context context)
  { context.register(_M_NumberMinus); context.register(_M_NumberPlus); context.register(_M_NumberEqual);
  }

/* END MODULE « "std/num.crs.java" » */
}