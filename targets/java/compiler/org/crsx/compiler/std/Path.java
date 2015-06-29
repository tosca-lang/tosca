/* START MODULE std/path.crs.java */
/** Generated File */package org.crsx.compiler.std;
import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;

import org.crsx.runtime.*;
import org.crsx.runtime.ConstructionDescriptor.*;
import static org.crsx.runtime.Primitives.*; import static org.crsx.compiler.std.String.*;

public class Path
{
  final public static DynamicFunctionDescriptor _M_BaseName = makeFunction("BaseName", Path.class, "_M_BaseName");final public static boolean _M_BaseName(Sink sink, int shared, int depth, Term term) {
    if (depth < 2000) {
      sink.start(_M_AfterLast);
      sink.start(_M_BeforeLast); sink.copy(term); sink.literal(".");
      sink.end(); sink.literal("/");
      sink.end(); return true;
    }
    return thunk(sink, _M_BaseName, term);
  } public static void init(Context context)
  { context.register(_M_BaseName);
  }

/* END MODULE « "std/path.crs.java" » */
}