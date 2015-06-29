/* START MODULE std/string.crs.java */
/** Generated File */package org.crsx.compiler.std;
import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;
import static org.crsx.runtime.Normalizer.force;
import static org.crsx.runtime.Reference.safeRef;

import org.crsx.runtime.*;
import org.crsx.runtime.ConstructionDescriptor.*;
import static org.crsx.runtime.Primitives.*; import static org.crsx.compiler.std.Core.*;

public class String
{
  final public static DynamicFunctionDescriptor _M_Show = makeFunction("Show", String.class, "_M_Show");
  final public static DynamicFunctionDescriptor _M_ParseToTerm = makeFunction("ParseToTerm", String.class, "_M_ParseToTerm");
  final public static DynamicFunctionDescriptor _M_ParseToString = makeFunction("ParseToString", String.class, "_M_ParseToString");
  final public static DynamicFunctionDescriptor _M_BeforeLast2 = makeFunction("BeforeLast2", String.class, "_M_BeforeLast2");
  final public static DynamicFunctionDescriptor _M_BeforeLast = makeFunction("BeforeLast", String.class, "_M_BeforeLast");
  final public static DynamicFunctionDescriptor _M_AfterLast2 = makeFunction("AfterLast2", String.class, "_M_AfterLast2");
  final public static DynamicFunctionDescriptor _M_AfterLast = makeFunction("AfterLast", String.class, "_M_AfterLast");
  final public static DynamicFunctionDescriptor _M_Replace = makeFunction("Replace", String.class, "_M_Replace");
  final public static DynamicFunctionDescriptor _M_RemoveLastChar = makeFunction("RemoveLastChar", String.class, "_M_RemoveLastChar");
  final public static DynamicFunctionDescriptor _M_RemoveFirstChar = makeFunction("RemoveFirstChar", String.class, "_M_RemoveFirstChar");
  final public static DynamicFunctionDescriptor _M_UpCaseFirst = makeFunction("UpCaseFirst", String.class, "_M_UpCaseFirst");
  final public static DynamicFunctionDescriptor _M_UnString = makeFunction("UnString", String.class, "_M_UnString");
  final public static DynamicFunctionDescriptor _M_ConcatString = makeFunction("ConcatString", String.class, "_M_ConcatString");
  final public static DynamicFunctionDescriptor _M_StringEqual = makeFunction("StringEqual", String.class, "_M_StringEqual");
  final public static DynamicFunctionDescriptor _M_StartsWith = makeFunction("StartsWith", String.class, "_M_StartsWith");final public static boolean _M_Show(Sink sink, int shared, int depth, Term term) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sShow); sink.end(); sink.copy(term.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_Show, term);
  } final public static boolean _M_ParseToTerm(Sink sink, int shared, int depth, Term term_85, Term term_95) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sParseText); sink.end(); sink.copy(term_85.ref()); sink.copy(term_95.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_ParseToTerm, term_85, term_95);
  }  final public static boolean _M_ParseToString(Sink sink, int shared, int depth, Term term_5, Term term_60) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sTrace); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sShow); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sParseText); sink.end(); sink.copy(term_5.ref()); sink.copy(term_60.ref());
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_ParseToString, term_5, term_60);
  }  final public static boolean _M_BeforeLast2(Sink sink, int shared, int depth, Term term_21, Term term_73, Term term_26) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sStringEqual); sink.end(); sink.copy(term_26.ref()); sink.literal("");
      sink.end(); sink.copy(term_21.ref());
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.copy(term_21.ref()); sink.copy(term_73.ref()); sink.copy(term_26.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_BeforeLast2, term_21, term_73, term_26);
  }   final public static boolean _M_BeforeLast(Sink sink, int shared, int depth, Term term_30, Term term_46) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sContains); sink.end(); sink.copy(term_30.ref()); sink.copy(term_46.ref());
      sink.end();
      sink.start(_M_BeforeLast2);
      sink.start(_M__s); sink.start(_M_Builtin_sBeforeFirst); sink.end(); sink.copy(term_30.ref()); sink.copy(term_46.ref());
      sink.end(); sink.copy(term_46.ref());
      sink.start(_M_BeforeLast);
      sink.start(_M__s); sink.start(_M_Builtin_sAfterFirst); sink.end(); sink.copy(term_30.ref()); sink.copy(term_46.ref());
      sink.end(); sink.copy(term_46.ref());
      sink.end();
      sink.end(); sink.literal("");
      sink.end(); return true;
    }
    return thunk(sink, _M_BeforeLast, term_30, term_46);
  }  final public static boolean _M_AfterLast2(Sink sink, int shared, int depth, Term term_25, Term term_52) {
    if (depth < 2000) {
      sink.start(_M_AfterLast); sink.copy(term_25.ref()); sink.copy(term_52.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_AfterLast2, term_25, term_52);
  }  final public static boolean _M_AfterLast(Sink sink, int shared, int depth, Term term_83, Term term_42) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sContains); sink.end(); sink.copy(term_83.ref()); sink.copy(term_42.ref());
      sink.end();
      sink.start(_M_AfterLast2);
      sink.start(_M__s); sink.start(_M_Builtin_sAfterFirst); sink.end(); sink.copy(term_83.ref()); sink.copy(term_42.ref());
      sink.end(); sink.copy(term_42.ref());
      sink.end(); sink.copy(term_83.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_AfterLast, term_83, term_42);
  }  final public static boolean _M_Replace(Sink sink, int shared, int depth, Term term_13, Term term_66, Term term_51) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sReplace); sink.end(); sink.copy(term_13.ref()); sink.copy(term_66.ref()); sink.copy(term_51.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_Replace, term_13, term_66, term_51);
  }   final public static boolean _M_RemoveLastChar(Sink sink, int shared, int depth, Term term_8) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sSubstring); sink.end(); sink.copy(term_8.ref()); sink.literal(0);
      sink.start(_M__s); sink.start(_M_Builtin_sMinus); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sLength); sink.end(); sink.copy(term_8.ref());
      sink.end(); sink.literal(1);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_RemoveLastChar, term_8);
  } final public static boolean _M_RemoveFirstChar(Sink sink, int shared, int depth, Term term_58) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sSubstring); sink.end(); sink.copy(term_58.ref()); sink.literal(1);
      sink.end(); return true;
    }
    return thunk(sink, _M_RemoveFirstChar, term_58);
  } final public static boolean _M_UpCaseFirst(Sink sink, int shared, int depth, Term term_18) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sUpCase); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sSubstring); sink.end(); sink.copy(term_18.ref()); sink.literal(0); sink.literal(1);
      sink.end();
      sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sSubstring); sink.end(); sink.copy(term_18.ref()); sink.literal(1);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_UpCaseFirst, term_18);
  } final public static boolean _M_UnString(Sink sink, int shared, int depth, Term term_147) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sRescape); sink.end(); sink.copy(term_147.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_UnString, term_147);
  } final public static boolean _M_ConcatString(Sink sink, int shared, int depth, Term term_70, Term term_29) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.copy(term_70.ref()); sink.copy(term_29.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_ConcatString, term_70, term_29);
  }  final public static boolean _M_StringEqual(Sink sink, int shared, int depth, Term term_103, Term term_151) {
    if (depth < 2000) {
      sink.start(_M_WrapBoolean);
      sink.start(_M__s); sink.start(_M_Builtin_sStringEqual); sink.end(); sink.copy(term_103.ref()); sink.copy(term_151.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_StringEqual, term_103, term_151);
  }  final public static boolean _M_StartsWith(Sink sink, int shared, int depth, Term term_23, Term term_11) {
    if (depth < 2000) {
      sink.start(_M_WrapBoolean);
      sink.start(_M__s); sink.start(_M_Builtin_sStartsWith); sink.end(); sink.copy(term_23.ref()); sink.copy(term_11.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_StartsWith, term_23, term_11);
  }  
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.std.Core.init(context); context.register(_M_Show); context.register(_M_ParseToTerm); context.register(_M_ParseToString); context.register(_M_BeforeLast2); context.register(_M_BeforeLast); context.register(_M_AfterLast2); context.register(_M_AfterLast); context.register(_M_Replace); context.register(_M_RemoveLastChar); context.register(_M_RemoveFirstChar); context.register(_M_UpCaseFirst); context.register(_M_UnString); context.register(_M_ConcatString); context.register(_M_StringEqual); context.register(_M_StartsWith);
      initialized = true;
    }
  }

/* END MODULE « "std/string.crs.java" » */
}