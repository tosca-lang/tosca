/* START MODULE /Users/villardl/Projects/crsx/crsx4/src/std/core.crs.java */
/** Generated File */package org.crsx.compiler.std;
import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;
import static org.crsx.runtime.Normalizer.force;
import static org.crsx.runtime.Reference.safeRef;

import org.crsx.runtime.*;
import org.crsx.runtime.ConstructionDescriptor.*;
import static org.crsx.runtime.Primitives.*;

public class Core
{
  final public static ConstructionDescriptor _M_TRUE = makeData("TRUE");
  final public static ConstructionDescriptor _M_FALSE = makeData("FALSE");
  final public static ConstructionDescriptor _M_SOME = makeData("SOME");
  final public static ConstructionDescriptor _M_NONE = makeData("NONE");
  final public static ConstructionDescriptor _M_STRING = makeData("STRING"); final public static ConstructionDescriptor _M_OK = makeData("OK");
  final public static DynamicFunctionDescriptor _M_Trace = makeFunction("Trace", Core.class, "_M_Trace");
  final public static DynamicFunctionDescriptor _M_UnwrapBoolean = makeFunction("UnwrapBoolean", Core.class, "_M_UnwrapBoolean");
  final public static DynamicFunctionDescriptor _M_WrapBoolean = makeFunction("WrapBoolean", Core.class, "_M_WrapBoolean");
  final public static DynamicFunctionDescriptor _M_Or = makeFunction("Or", Core.class, "_M_Or");
  final public static DynamicFunctionDescriptor _M_And = makeFunction("And", Core.class, "_M_And");
  final public static DynamicFunctionDescriptor _M_If = makeFunction("If", Core.class, "_M_If");
  final public static DynamicFunctionDescriptor _M_UnSOME = makeFunction("UnSOME", Core.class, "_M_UnSOME");final public static boolean _M_Trace(Sink sink, int shared, int depth, Term term) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sTrace); sink.end(); sink.copy(term.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_Trace, term);
  } final public static boolean _M_UnwrapBoolean(Sink sink, int shared, int depth, Term term_53) {
    if (depth < 2000) {
      label: {
        if (term_53.descriptor() != _M_TRUE)
        {   break label;
        }/*Contract*/ sink.start(_M__sTrue); sink.end(); return true;
      }
      label_3: {
        if (term_53.descriptor() != _M_FALSE)
        {   break label_3;
        }/*Contract*/ sink.start(_M__sFalse); sink.end(); return true;
      }
    }
    return thunk(sink, _M_UnwrapBoolean, term_53);
  } final public static boolean _M_WrapBoolean(Sink sink, int shared, int depth, Term term_37) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sEqual); sink.end(); sink.copy(term_37.ref()); sink.start(_M__sTrue); sink.end();
      sink.end(); sink.start(_M_TRUE); sink.end(); sink.start(_M_FALSE); sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_WrapBoolean, term_37);
  } final public static boolean _M_Or(Sink sink, int shared, int depth, Term term_1, Term term_97) {
    if (depth < 2000) {
      label_17: {
        if (term_1.descriptor() != _M_TRUE)
        {   break label_17;
        }
        /* #=term *//*Contract*/ sink.start(_M_TRUE); sink.end(); return true;
      }
      label_94: {
        if (term_1.descriptor() != _M_FALSE)
        {   break label_94;
        }
        /* #=term *//*Contract*/ sink.copy(term_97.ref()); return true;
      }
    }
    return thunk(sink, _M_Or, term_1, term_97);
  }  final public static boolean _M_And(Sink sink, int shared, int depth, Term term_20, Term term_12) {
    if (depth < 2000) {
      label_77: {
        if (term_20.descriptor() != _M_TRUE)
        {   break label_77;
        }
        /* #=term *//*Contract*/ sink.copy(term_12.ref()); return true;
      }
      label_91: {
        if (term_20.descriptor() != _M_FALSE)
        {   break label_91;
        }
        /* #=term *//*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_And, term_20, term_12);
  }  final public static boolean _M_If(Sink sink, int shared, int depth, Term term_31, Term term_47, Term term_83) {
    if (depth < 2000) {
      label_42: {
        if (term_31.descriptor() != _M_TRUE)
        {   break label_42;
        }
        /* #1=term */
        /* #2=term *//*Contract*/ sink.copy(term_47.ref()); return true;
      }
      label_25: {
        if (term_31.descriptor() != _M_FALSE)
        {   break label_25;
        }
        /* #1=term */
        /* #2=term *//*Contract*/ sink.copy(term_83.ref()); return true;
      }
    }
    return thunk(sink, _M_If, term_31, term_47, term_83);
  }   final public static boolean _M_UnSOME(Sink sink, int shared, int depth, Term term_29) {
    if (depth < 2000) {
      label_84: {
        if (term_29.descriptor() != _M_SOME)
        {   break label_84;
        }Term sub = term_29.sub(0).ref(); /* #=sub *//*Contract*/ sink.copy(sub.ref()); return true;
      }
      label_1: {
        if (term_29.descriptor() != _M_NONE)
        {   break label_1;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end(); sink.literal("Error: no optional value.");
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_UnSOME, term_29);
  } 
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { context.register(_M_TRUE); context.register(_M_FALSE); context.register(_M_SOME); context.register(_M_NONE); context.register(_M_STRING); context.register(_M_OK); context.register(_M_Trace); context.register(_M_UnwrapBoolean); context.register(_M_WrapBoolean); context.register(_M_Or); context.register(_M_And); context.register(_M_If); context.register(_M_UnSOME);
      initialized = true;
    }
  }

/* END MODULE « "/Users/villardl/Projects/crsx/crsx4/src/std/core.crs.java" » */
}