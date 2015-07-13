/* START MODULE /Users/villardl/Projects/crsx/crsx4/src/std/env.crs.java */
/** Generated File */package org.crsx.compiler.std;
import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;
import static org.crsx.runtime.Normalizer.force;
import static org.crsx.runtime.Normalizer.forceSub;
import static org.crsx.runtime.Reference.safeRef;

import org.crsx.runtime.*;
import org.crsx.runtime.ConstructionDescriptor.*;
import static org.crsx.runtime.Primitives.*; import static org.crsx.compiler.std.Core.*;

public class Env
{
  final public static DynamicFunctionDescriptor _M_GetStringEntryThen = makeFunction("GetStringEntryThen", Env.class, "_M_GetStringEntryThen");
  final public static DynamicFunctionDescriptor _M_AddStringEntry = makeFunction("AddStringEntry", Env.class, "_M_AddStringEntry");
  final public static DynamicFunctionDescriptor _M_GetSome = makeFunction("GetSome", Env.class, "_M_GetSome");final public static boolean _M_GetStringEntryThen(Sink sink, int shared, int depth, Properties props, Term term, Term term_4, Variable var, Term term_48) {
    if (depth < 2000) {
      label: {
        /* #key=term */
        /* #default=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props));Term term_64;
        {
          BufferSink buf = sink.context().makeBuffer();
          buf.start(_M__s);buf.properties(safeRef(props));
          buf.start(_M_Builtin_sGet);
          buf.end(); buf.copy(term.ref()); buf.copy(term_4.ref());
          buf.end();
          term_64 = buf.term();
        }
        sink.substitute(term_48.ref(), new Variable[] { var }, new Term[] {term_64}); return true;
      }
    }
    return thunk(sink, _M_GetStringEntryThen, props, term, term_4, var, term_48);
  }    final public static boolean _M_AddStringEntry(Sink sink, int shared, int depth, Properties props_16, Term term_33, Term term_21, Variable var_20, Term term_10) {
    if (depth < 2000) {
      label_43: {
        /* #key=term */
        /* #value=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_16));Term term_98;
        {
          BufferSink buf_92 = sink.context().makeBuffer(); buf_92.copy(term_21.ref());
          term_98 = buf_92.term();
        }
        term_33 = force(sink.context(), term_33);
        Sink.property(sink, term_33, term_98);Term term_40;
        {
          BufferSink buf_17 = sink.context().makeBuffer(); buf_17.start(_M_OK); buf_17.end();
          term_40 = buf_17.term();
        }
        sink.substitute(term_10.ref(), new Variable[] { var_20 }, new Term[] {term_40}); return true;
      }
    }
    return thunk(sink, _M_AddStringEntry, props_16, term_33, term_21, var_20, term_10);
  }    final public static boolean _M_GetSome(Sink sink, int shared, int depth, Properties props_18, Term term_31) {
    if (depth < 2000) {
      sink.start(_M__s);sink.properties(safeRef(props_18));
      sink.start(_M_Builtin_sIfDef);
      sink.end(); sink.copy(term_31.ref());
      sink.start(_M_SOME);
      sink.start(_M__s);sink.properties(safeRef(props_18));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_31.ref());
      sink.end();
      sink.end(); sink.start(_M_NONE); sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_GetSome, props_18, term_31);
  } 
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.std.Core.init(context); context.register(_M_GetStringEntryThen); context.register(_M_AddStringEntry); context.register(_M_GetSome);
      initialized = true;
    }
  }

/* END MODULE « "/Users/villardl/Projects/crsx/crsx4/src/std/env.crs.java" » */
}