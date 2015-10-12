/* START MODULE /Users/villardl/Projects/crsx/crsx4_2/src/std/core.crs.java */
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
  final public static DynamicFunctionDescriptor _M_TextError = makeFunction("TextError", Core.class, "_M_TextError");
  final public static DynamicFunctionDescriptor _M_Error = makeFunction("Error", Core.class, "_M_Error");
  final public static DynamicFunctionDescriptor _M_Trace = makeFunction("Trace", Core.class, "_M_Trace");
  final public static DynamicFunctionDescriptor _M_UnwrapBoolean = makeFunction("UnwrapBoolean", Core.class, "_M_UnwrapBoolean");
  final public static DynamicFunctionDescriptor _M_WrapBoolean = makeFunction("WrapBoolean", Core.class, "_M_WrapBoolean");
  final public static DynamicFunctionDescriptor _M_Eq = makeFunction("Eq", Core.class, "_M_Eq");
  final public static DynamicFunctionDescriptor _M_Not = makeFunction("Not", Core.class, "_M_Not");
  final public static DynamicFunctionDescriptor _M_Or = makeFunction("Or", Core.class, "_M_Or");
  final public static DynamicFunctionDescriptor _M_And = makeFunction("And", Core.class, "_M_And");
  final public static DynamicFunctionDescriptor _M_If = makeFunction("If", Core.class, "_M_If");
  final public static DynamicFunctionDescriptor _M_UnSOME = makeFunction("UnSOME", Core.class, "_M_UnSOME");final public static boolean _M_TextError(Sink sink, int shared, int depth, Term term) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end(); sink.start(_M_TextToString); sink.copy(term.ref()); sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_TextError, term);
  } final public static boolean _M_Error(Sink sink, int shared, int depth, Term term_95) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end(); sink.copy(term_95.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_Error, term_95);
  } final public static boolean _M_Trace(Sink sink, int shared, int depth, Term term_30) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sTrace); sink.end(); sink.copy(term_30.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_Trace, term_30);
  } final public static boolean _M_UnwrapBoolean(Sink sink, int shared, int depth, Term term_18) {
    if (depth < 2000) {
      label: {
        if (term_18.descriptor() != _M_TRUE)
        {   break label;
        }/*Contract*/ sink.start(_M__sTrue); sink.end(); return true;
      }
      label_93: {
        if (term_18.descriptor() != _M_FALSE)
        {   break label_93;
        }/*Contract*/ sink.start(_M__sFalse); sink.end(); return true;
      }
    }
    return thunk(sink, _M_UnwrapBoolean, term_18);
  } final public static boolean _M_WrapBoolean(Sink sink, int shared, int depth, Term term_82) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sDeepEqual); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sShow); sink.end(); sink.copy(term_82.ref());
      sink.end(); sink.literal("$True");
      sink.end(); sink.start(_M_TRUE); sink.end(); sink.start(_M_FALSE); sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_WrapBoolean, term_82);
  } final public static boolean _M_Eq(Sink sink, int shared, int depth, Term term_54, Term term_94) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sEqual); sink.end(); sink.copy(term_54.ref()); sink.copy(term_94.ref());
      sink.end(); sink.start(_M_TRUE); sink.end(); sink.start(_M_FALSE); sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Eq, term_54, term_94);
  }  final public static boolean _M_Not(Sink sink, int shared, int depth, Term term_83) {
    if (depth < 2000) {
      label_84: {
        if (term_83.descriptor() != _M_TRUE)
        {   break label_84;
        }/*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
      label_75: {
        if (term_83.descriptor() != _M_FALSE)
        {   break label_75;
        }/*Contract*/ sink.start(_M_TRUE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_Not, term_83);
  } final public static boolean _M_Or(Sink sink, int shared, int depth, Term term_34, Term term_69) {
    if (depth < 2000) {
      label_54: {
        if (term_34.descriptor() != _M_TRUE)
        {   break label_54;
        }
        /* #=term *//*Contract*/ sink.start(_M_TRUE); sink.end(); return true;
      }
      label_90: {
        if (term_34.descriptor() != _M_FALSE)
        {   break label_90;
        }
        /* #=term *//*Contract*/ sink.copy(term_69.ref()); return true;
      }
    }
    return thunk(sink, _M_Or, term_34, term_69);
  }  final public static boolean _M_And(Sink sink, int shared, int depth, Term term_6, Term term_60) {
    if (depth < 2000) {
      label_67: {
        if (term_6.descriptor() != _M_TRUE)
        {   break label_67;
        }
        /* #=term *//*Contract*/ sink.copy(term_60.ref()); return true;
      }
      label_40: {
        if (term_6.descriptor() != _M_FALSE)
        {   break label_40;
        }
        /* #=term *//*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_And, term_6, term_60);
  }  final public static boolean _M_If(Sink sink, int shared, int depth, Term term_110, Term term_70, Term term_81) {
    if (depth < 2000) {
      label_87: {
        if (term_110.descriptor() != _M_TRUE)
        {   break label_87;
        }
        /* #1=term */
        /* #2=term *//*Contract*/ sink.copy(term_70.ref()); return true;
      }
      label_25: {
        if (term_110.descriptor() != _M_FALSE)
        {   break label_25;
        }
        /* #1=term */
        /* #2=term *//*Contract*/ sink.copy(term_81.ref()); return true;
      }
    }
    return thunk(sink, _M_If, term_110, term_70, term_81);
  }   final public static boolean _M_UnSOME(Sink sink, int shared, int depth, Term term_11) {
    if (depth < 2000) {
      label_20: {
        if (term_11.descriptor() != _M_SOME)
        {   break label_20;
        }Term sub = term_11.sub(0).ref(); /* #=sub *//*Contract*/ sink.copy(sub.ref()); return true;
      }
      label_108: {
        if (term_11.descriptor() != _M_NONE)
        {   break label_108;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end(); sink.literal("Error: no optional value.");
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_UnSOME, term_11);
  } 
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { context.register(_M_TRUE); context.register(_M_FALSE); context.register(_M_SOME); context.register(_M_NONE); context.register(_M_STRING); context.register(_M_OK); context.register(_M_TextError); context.register(_M_Error); context.register(_M_Trace); context.register(_M_UnwrapBoolean); context.register(_M_WrapBoolean); context.register(_M_Eq); context.register(_M_Not); context.register(_M_Or); context.register(_M_And); context.register(_M_If); context.register(_M_UnSOME);
      initialized = true;
    }
  }

/* END MODULE « "/Users/villardl/Projects/crsx/crsx4_2/src/std/core.crs.java" » */
}