/* START MODULE /Users/villardl/Projects/crsx/crsx4/src/std/path.crs.java */
/** Generated File */package org.crsx.compiler.std;
import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;
import static org.crsx.runtime.Normalizer.force;
import static org.crsx.runtime.Normalizer.forceSub;
import static org.crsx.runtime.Reference.safeRef;

import org.crsx.runtime.*;
import org.crsx.runtime.ConstructionDescriptor.*;
import static org.crsx.runtime.Primitives.*; import static org.crsx.compiler.std.String.*;

public class Path
{
  final public static DynamicFunctionDescriptor _M_BaseName = makeFunction("BaseName", Path.class, "_M_BaseName");final public static boolean _M_BaseName(Sink sink, int shared, int depth, Term term) {
    if (depth < 2000) {
      sink.start(_M_AfterLast);
      sink.start(_M_BeforeLast); sink.copy(term.ref()); sink.literal(".");
      sink.end(); sink.literal("/");
      sink.end(); return true;
    }
    return thunk(sink, _M_BaseName, term);
  } 
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.std.String.init(context); context.register(_M_BaseName);
      initialized = true;
    }
  }

/* END MODULE « "/Users/villardl/Projects/crsx/crsx4/src/std/path.crs.java" » */
}