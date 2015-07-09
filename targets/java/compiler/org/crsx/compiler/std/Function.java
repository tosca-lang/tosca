/* START MODULE /Users/villardl/Projects/crsx/crsx4/src/std/function.crs.java */
/** Generated File */package org.crsx.compiler.std;
import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;
import static org.crsx.runtime.Normalizer.force;
import static org.crsx.runtime.Reference.safeRef;

import org.crsx.runtime.*;
import org.crsx.runtime.ConstructionDescriptor.*;
import static org.crsx.runtime.Primitives.*;

public class Function
{
  final public static DynamicFunctionDescriptor _M_ApplyIf = makeFunction("ApplyIf", Function.class, "_M_ApplyIf");final public static boolean _M_ApplyIf(Sink sink, int shared, int depth, Term term, Term term_2, Variable var, Term term_46) {
    if (depth < 2000) {
      label: {
        /* #value=term */
        if (term_2.descriptor() != _M__sTrue)
        {   break label;
        }
        /* #=term *//*Contract*/Term term_11;
        {
          BufferSink buf = sink.context().makeBuffer(); buf.copy(term.ref());
          term_11 = buf.term();
        }
        sink.substitute(term_46.ref(), new Variable[] { var }, new Term[] {term_11}); return true;
      }
      label_74: {
        /* #value=term */
        if (term_2.descriptor() != _M__sFalse)
        {   break label_74;
        } /* #=term *//*Contract*/ sink.copy(term.ref()); return true;
      }
    }
    return thunk(sink, _M_ApplyIf, term, term_2, var, term_46);
  }    
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { context.register(_M_ApplyIf); initialized = true;
    }
  }

/* END MODULE « "/Users/villardl/Projects/crsx/crsx4/src/std/function.crs.java" » */
}