/* START MODULE /Users/villardl/Projects/crsx/crsx4/src/std/env.crs.java */
/** Generated File */package org.crsx.compiler.std;
import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;
import static org.crsx.runtime.Normalizer.force;
import static org.crsx.runtime.Reference.safeRef;

import org.crsx.runtime.*;
import org.crsx.runtime.ConstructionDescriptor.*;
import static org.crsx.runtime.Primitives.*; import static org.crsx.compiler.std.Core.*;

public class Env
{
  final public static DynamicFunctionDescriptor _M_GetStringEntryThen = makeFunction("GetStringEntryThen", Env.class, "_M_GetStringEntryThen");
  final public static DynamicFunctionDescriptor _M_AddStringEntry = makeFunction("AddStringEntry", Env.class, "_M_AddStringEntry");
  final public static DynamicFunctionDescriptor _M_GetSome = makeFunction("GetSome", Env.class, "_M_GetSome");final public static boolean _M_GetStringEntryThen(Sink sink, int shared, int depth, Properties props, Term term, Term term_55, Variable var, Term term_94) {
    if (depth < 2000) {
      label: {
        /* #key=term */
        /* #default=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props));Term term_97;
        {
          BufferSink buf = sink.context().makeBuffer();
          buf.start(_M__s);buf.properties(safeRef(props));
          buf.start(_M_Builtin_sGet);
          buf.end(); buf.copy(term.ref()); buf.copy(term_55.ref());
          buf.end();
          term_97 = buf.term();
        }
        sink.substitute(term_94.ref(), new Variable[] { var }, new Term[] {term_97}); return true;
      }
    }
    return thunk(sink, _M_GetStringEntryThen, props, term, term_55, var, term_94);
  }    final public static boolean _M_AddStringEntry(Sink sink, int shared, int depth, Properties props_34, Term term_39, Term term_11, Variable var_74, Term term_5) {
    if (depth < 2000) {
      label_91: {
        /* #key=term */
        /* #value=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_34));Term term_9;
        {
          BufferSink buf_17 = sink.context().makeBuffer(); buf_17.copy(term_11.ref());
          term_9 = buf_17.term();
        }
        term_39 = force(sink.context(), term_39);
        Sink.property(sink, term_39, term_9);Term term_37;
        {
          BufferSink buf_52 = sink.context().makeBuffer(); buf_52.start(_M_OK); buf_52.end();
          term_37 = buf_52.term();
        }
        sink.substitute(term_5.ref(), new Variable[] { var_74 }, new Term[] {term_37}); return true;
      }
    }
    return thunk(sink, _M_AddStringEntry, props_34, term_39, term_11, var_74, term_5);
  }    final public static boolean _M_GetSome(Sink sink, int shared, int depth, Properties props_47, Term term_26) {
    if (depth < 2000) {
      sink.start(_M__s);sink.properties(safeRef(props_47));
      sink.start(_M_Builtin_sIfDef);
      sink.end(); sink.copy(term_26.ref());
      sink.start(_M_SOME);
      sink.start(_M__s);sink.properties(safeRef(props_47));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_26.ref());
      sink.end();
      sink.end(); sink.start(_M_NONE); sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_GetSome, props_47, term_26);
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