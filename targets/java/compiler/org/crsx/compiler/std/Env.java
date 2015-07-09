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
  final public static DynamicFunctionDescriptor _M_GetSome = makeFunction("GetSome", Env.class, "_M_GetSome");final public static boolean _M_GetStringEntryThen(Sink sink, int shared, int depth, Properties props, Term term, Term term_59, Variable var, Term term_43) {
    if (depth < 2000) {
      label: {
        /* #key=term */
        /* #default=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props));Term term_86;
        {
          BufferSink buf = sink.context().makeBuffer();
          buf.start(_M__s);buf.properties(safeRef(props));
          buf.start(_M_Builtin_sGet);
          buf.end(); buf.copy(term.ref()); buf.copy(term_59.ref());
          buf.end();
          term_86 = buf.term();
        }
        sink.substitute(term_43.ref(), new Variable[] { var }, new Term[] {term_86}); return true;
      }
    }
    return thunk(sink, _M_GetStringEntryThen, props, term, term_59, var, term_43);
  }    final public static boolean _M_AddStringEntry(Sink sink, int shared, int depth, Properties props_47, Term term_69, Term term_40, Variable var_97, Term term_14) {
    if (depth < 2000) {
      label_42: {
        /* #key=term */
        /* #value=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_47));Term term_76;
        {
          BufferSink buf_73 = sink.context().makeBuffer(); buf_73.copy(term_40.ref());
          term_76 = buf_73.term();
        }
        term_69 = force(sink.context(), term_69);
        Sink.property(sink, term_69, term_76);Term term_29;
        {
          BufferSink buf_54 = sink.context().makeBuffer(); buf_54.start(_M_OK); buf_54.end();
          term_29 = buf_54.term();
        }
        sink.substitute(term_14.ref(), new Variable[] { var_97 }, new Term[] {term_29}); return true;
      }
    }
    return thunk(sink, _M_AddStringEntry, props_47, term_69, term_40, var_97, term_14);
  }    final public static boolean _M_GetSome(Sink sink, int shared, int depth, Properties props_39, Term term_79) {
    if (depth < 2000) {
      sink.start(_M__s);sink.properties(safeRef(props_39));
      sink.start(_M_Builtin_sIfDef);
      sink.end(); sink.copy(term_79.ref());
      sink.start(_M_SOME);
      sink.start(_M__s);sink.properties(safeRef(props_39));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_79.ref());
      sink.end();
      sink.end(); sink.start(_M_NONE); sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_GetSome, props_39, term_79);
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