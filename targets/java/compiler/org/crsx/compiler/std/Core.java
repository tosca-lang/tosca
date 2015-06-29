/* START MODULE std/core.crs.java */
/** Generated File */package org.crsx.compiler.std;
import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;

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
      sink.start(_M__s); sink.start(_M_Builtin_sTrace); sink.end(); sink.copy(term);
      sink.end(); return true;
    }
    return thunk(sink, _M_Trace, term);
  } final public static boolean _M_UnwrapBoolean(Sink sink, int shared, int depth, Term term_70) {
    if (depth < 2000) {
      label: {
        if (!term_70.symbol().equals("TRUE"))
        {   break label;
        }/*Contract*/ sink.start(_M__sTrue); sink.end(); return true;
      }
      label_76: {
        if (!term_70.symbol().equals("FALSE"))
        {   break label_76;
        }/*Contract*/ sink.start(_M__sFalse); sink.end(); return true;
      }
    }
    return thunk(sink, _M_UnwrapBoolean, term_70);
  } final public static boolean _M_WrapBoolean(Sink sink, int shared, int depth, Term term_41) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sEqual); sink.end(); sink.copy(term_41); sink.literal("$True");
      sink.end(); sink.start(_M_TRUE); sink.end(); sink.start(_M_FALSE); sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_WrapBoolean, term_41);
  } final public static boolean _M_Or(Sink sink, int shared, int depth, Term term_6, Term term_12) {
    if (depth < 2000) {
      label_59: {
        if (!term_6.symbol().equals("TRUE"))
        {   break label_59;
        }
        /* #=term *//*Contract*/ sink.start(_M_TRUE); sink.end(); return true;
      }
      label_43: {
        if (!term_6.symbol().equals("FALSE"))
        {   break label_43;
        } /* #=term *//*Contract*/ sink.copy(term_12); return true;
      }
    }
    return thunk(sink, _M_Or, term_6, term_12);
  }  final public static boolean _M_And(Sink sink, int shared, int depth, Term term_56, Term term_36) {
    if (depth < 2000) {
      label_92: {
        if (!term_56.symbol().equals("TRUE"))
        {   break label_92;
        } /* #=term *//*Contract*/ sink.copy(term_36); return true;
      }
      label_77: {
        if (!term_56.symbol().equals("FALSE"))
        {   break label_77;
        }
        /* #=term *//*Contract*/ sink.start(_M_FALSE); sink.end(); return true;
      }
    }
    return thunk(sink, _M_And, term_56, term_36);
  }  final public static boolean _M_If(Sink sink, int shared, int depth, Term term_42, Term term_62, Term term_33) {
    if (depth < 2000) {
      label_9: {
        if (!term_42.symbol().equals("TRUE"))
        {   break label_9;
        }
        /* #1=term */ /* #2=term *//*Contract*/ sink.copy(term_62); return true;
      }
      label_64: {
        if (!term_42.symbol().equals("FALSE"))
        {   break label_64;
        }
        /* #1=term */ /* #2=term *//*Contract*/ sink.copy(term_33); return true;
      }
    }
    return thunk(sink, _M_If, term_42, term_62, term_33);
  }   final public static boolean _M_UnSOME(Sink sink, int shared, int depth, Term term_23) {
    if (depth < 2000) {
      label_198: {
        if (!term_23.symbol().equals("SOME"))
        {   break label_198;
        }Term sub = term_23.sub(0).ref(); /* #=sub *//*Contract*/ sink.copy(sub); return true;
      }
      label_85: {
        if (!term_23.symbol().equals("NONE"))
        {   break label_85;
        }/*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end(); sink.literal("Error: no optional value.");
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_UnSOME, term_23);
  } public static void init(Context context)
  { context.register(_M_TRUE); context.register(_M_FALSE); context.register(_M_SOME); context.register(_M_NONE); context.register(_M_STRING); context.register(_M_OK); context.register(_M_Trace); context.register(_M_UnwrapBoolean); context.register(_M_WrapBoolean); context.register(_M_Or); context.register(_M_And); context.register(_M_If); context.register(_M_UnSOME);
  }

/* END MODULE « "std/core.crs.java" » */
}