/* START MODULE /Users/villardl/Projects/crsx/crsx4/src/std/core.crs.java */
/** Generated File */package org.crsx.compiler.std;
import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;
import static org.crsx.runtime.Normalizer.force;
import static org.crsx.runtime.Normalizer.forceSub;
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
  } final public static boolean _M_UnwrapBoolean(Sink sink, int shared, int depth, Term term_1) {
    if (depth < 2000) {
      label: {
        term_1 = force(sink.context(), term_1);
        if (term_1.descriptor() != _M_TRUE)
        {   break label;
        }/*Contract*/ sink.start(_M__sTrue); sink.end(); return true;
      }
      label_7: {
        term_1 = force(sink.context(), term_1);
        if (term_1.descriptor() != _M_FALSE)
        {   break label_7;
        }/*Contract*/ sink.start(_M__sFalse); sink.end(); return true;
      }
    }
    return thunk(sink, _M_UnwrapBoolean, term_1);
  } final public static boolean _M_WrapBoolean(Sink sink, int shared, int depth, Term term_28) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sDeepEqual); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sShow); sink.end(); sink.copy(term_28.ref());
      sink.end(); sink.literal("$True");
      sink.end(); sink.start(_M_TRUE); sink.end(); sink.start(_M_FALSE); sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_WrapBoolean, term_28);
  } final public static boolean _M_Or(Sink sink, int shared, int depth, Term term_11, Term term_44) {
    if (depth < 2000) {
      label_75: {
        term_11 = force(sink.context(), term_11);
        if (term_11.descriptor() != _M_TRUE)
        {   break label_75;
        }
        /* #=term *//*Contract*/ sink.start(_M_TRUE); sink.end(); return true;
      }
      label_90: {
        term_11 = force(sink.context(), term_11);
        if (term_11.descriptor() != _M_FALSE)
        {   break label_90;
        }
        /* #=term *//*Contract*/ sink.copy(term_44.ref()); return true;
      }
    }
    return thunk(sink, _M_Or, term_11, term_44);
  }  final public static boolean _M_And(Sink sink, int shared, int depth, Term term_12, Term term_56) {
    if (depth < 2000) {
      label_99: {
        term_12 = force(sink.context(), term_12);
        if (term_12.descriptor() != _M_TRUE)
        {   break label_99;
        }
        /* #=term *//*Contract*/ sink.copy(term_56.ref()); return true;
      }
      label_183: {
        term_12 = force(sink.context(), term_12);
        if (term_12.descriptor() != _M_FALSE)
        {   break label_183;
        }
        /* #=term *//*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_And, term_12, term_56);
  }  final public static boolean _M_If(Sink sink, int shared, int depth, Term term_26, Term term_8, Term term_74) {
    if (depth < 2000) {
      label_76: {
        term_26 = force(sink.context(), term_26);
        if (term_26.descriptor() != _M_TRUE)
        {   break label_76;
        }
        /* #1=term */
        /* #2=term *//*Contract*/ sink.copy(term_8.ref()); return true;
      }
      label_98: {
        term_26 = force(sink.context(), term_26);
        if (term_26.descriptor() != _M_FALSE)
        {   break label_98;
        }
        /* #1=term */
        /* #2=term *//*Contract*/ sink.copy(term_74.ref()); return true;
      }
    }
    return thunk(sink, _M_If, term_26, term_8, term_74);
  }   final public static boolean _M_UnSOME(Sink sink, int shared, int depth, Term term_159) {
    if (depth < 2000) {
      label_63: {
        term_159 = force(sink.context(), term_159);
        if (term_159.descriptor() != _M_SOME)
        {   break label_63;
        }Term sub = forceSub(sink.context(), term_159, 0).ref(); /* #=sub *//*Contract*/ sink.copy(sub.ref()); return true;
      }
      label_49: {
        term_159 = force(sink.context(), term_159);
        if (term_159.descriptor() != _M_NONE)
        {   break label_49;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end(); sink.literal("Error: no optional value.");
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_UnSOME, term_159);
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