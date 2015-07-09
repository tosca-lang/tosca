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
  } final public static boolean _M_UnwrapBoolean(Sink sink, int shared, int depth, Term term_4) {
    if (depth < 2000) {
      label: {
        if (term_4.descriptor() != _M_TRUE)
        {   break label;
        }/*Contract*/ sink.start(_M__sTrue); sink.end(); return true;
      }
      label_43: {
        if (term_4.descriptor() != _M_FALSE)
        {   break label_43;
        }/*Contract*/ sink.start(_M__sFalse); sink.end(); return true;
      }
    }
    return thunk(sink, _M_UnwrapBoolean, term_4);
  } final public static boolean _M_WrapBoolean(Sink sink, int shared, int depth, Term term_47) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sDeepEqual); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sShow); sink.end(); sink.copy(term_47.ref());
      sink.end(); sink.literal("$True");
      sink.end(); sink.start(_M_TRUE); sink.end(); sink.start(_M_FALSE); sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_WrapBoolean, term_47);
  } final public static boolean _M_Or(Sink sink, int shared, int depth, Term term_45, Term term_66) {
    if (depth < 2000) {
      label_72: {
        if (term_45.descriptor() != _M_TRUE)
        {   break label_72;
        }
        /* #=term *//*Contract*/ sink.start(_M_TRUE); sink.end(); return true;
      }
      label_66: {
        if (term_45.descriptor() != _M_FALSE)
        {   break label_66;
        }
        /* #=term *//*Contract*/ sink.copy(term_66.ref()); return true;
      }
    }
    return thunk(sink, _M_Or, term_45, term_66);
  }  final public static boolean _M_And(Sink sink, int shared, int depth, Term term_74, Term term_115) {
    if (depth < 2000) {
      label_54: {
        if (term_74.descriptor() != _M_TRUE)
        {   break label_54;
        }
        /* #=term *//*Contract*/ sink.copy(term_115.ref()); return true;
      }
      label_31: {
        if (term_74.descriptor() != _M_FALSE)
        {   break label_31;
        }
        /* #=term *//*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_And, term_74, term_115);
  }  final public static boolean _M_If(Sink sink, int shared, int depth, Term term_60, Term term_95, Term term_61) {
    if (depth < 2000) {
      label_39: {
        if (term_60.descriptor() != _M_TRUE)
        {   break label_39;
        }
        /* #1=term */
        /* #2=term *//*Contract*/ sink.copy(term_95.ref()); return true;
      }
      label_56: {
        if (term_60.descriptor() != _M_FALSE)
        {   break label_56;
        }
        /* #1=term */
        /* #2=term *//*Contract*/ sink.copy(term_61.ref()); return true;
      }
    }
    return thunk(sink, _M_If, term_60, term_95, term_61);
  }   final public static boolean _M_UnSOME(Sink sink, int shared, int depth, Term term_76) {
    if (depth < 2000) {
      label_73: {
        if (term_76.descriptor() != _M_SOME)
        {   break label_73;
        }Term sub = term_76.sub(0).ref(); /* #=sub *//*Contract*/ sink.copy(sub.ref()); return true;
      }
      label_81: {
        if (term_76.descriptor() != _M_NONE)
        {   break label_81;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end(); sink.literal("Error: no optional value.");
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_UnSOME, term_76);
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