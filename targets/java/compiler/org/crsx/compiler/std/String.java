/* START MODULE /Users/villardl/Projects/crsx/crsx4/src/std/string.crs.java */
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
  } final public static boolean _M_ParseToTerm(Sink sink, int shared, int depth, Term term_66, Term term_71) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sParseText); sink.end(); sink.copy(term_66.ref()); sink.copy(term_71.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_ParseToTerm, term_66, term_71);
  }  final public static boolean _M_ParseToString(Sink sink, int shared, int depth, Term term_93, Term term_64) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sTrace); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sShow); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sParseText); sink.end(); sink.copy(term_93.ref()); sink.copy(term_64.ref());
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_ParseToString, term_93, term_64);
  }  final public static boolean _M_BeforeLast2(Sink sink, int shared, int depth, Term term_2, Term term_186, Term term_56) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sStringEqual); sink.end(); sink.copy(term_56.ref()); sink.literal("");
      sink.end(); sink.copy(term_2.ref());
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.copy(term_2.ref()); sink.copy(term_186.ref()); sink.copy(term_56.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_BeforeLast2, term_2, term_186, term_56);
  }   final public static boolean _M_BeforeLast(Sink sink, int shared, int depth, Term term_78, Term term_36) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sContains); sink.end(); sink.copy(term_78.ref()); sink.copy(term_36.ref());
      sink.end();
      sink.start(_M_BeforeLast2);
      sink.start(_M__s); sink.start(_M_Builtin_sBeforeFirst); sink.end(); sink.copy(term_78.ref()); sink.copy(term_36.ref());
      sink.end(); sink.copy(term_36.ref());
      sink.start(_M_BeforeLast);
      sink.start(_M__s); sink.start(_M_Builtin_sAfterFirst); sink.end(); sink.copy(term_78.ref()); sink.copy(term_36.ref());
      sink.end(); sink.copy(term_36.ref());
      sink.end();
      sink.end(); sink.literal("");
      sink.end(); return true;
    }
    return thunk(sink, _M_BeforeLast, term_78, term_36);
  }  final public static boolean _M_AfterLast2(Sink sink, int shared, int depth, Term term_77, Term term_55) {
    if (depth < 2000) {
      sink.start(_M_AfterLast); sink.copy(term_77.ref()); sink.copy(term_55.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_AfterLast2, term_77, term_55);
  }  final public static boolean _M_AfterLast(Sink sink, int shared, int depth, Term term_58, Term term_43) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sContains); sink.end(); sink.copy(term_58.ref()); sink.copy(term_43.ref());
      sink.end();
      sink.start(_M_AfterLast2);
      sink.start(_M__s); sink.start(_M_Builtin_sAfterFirst); sink.end(); sink.copy(term_58.ref()); sink.copy(term_43.ref());
      sink.end(); sink.copy(term_43.ref());
      sink.end(); sink.copy(term_58.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_AfterLast, term_58, term_43);
  }  final public static boolean _M_Replace(Sink sink, int shared, int depth, Term term_97, Term term_37, Term term_69) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sReplace); sink.end(); sink.copy(term_97.ref()); sink.copy(term_37.ref()); sink.copy(term_69.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_Replace, term_97, term_37, term_69);
  }   final public static boolean _M_RemoveLastChar(Sink sink, int shared, int depth, Term term_52) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sSubstring); sink.end(); sink.copy(term_52.ref()); sink.literal(0);
      sink.start(_M__s); sink.start(_M_Builtin_sMinus); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sLength); sink.end(); sink.copy(term_52.ref());
      sink.end(); sink.literal(1);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_RemoveLastChar, term_52);
  } final public static boolean _M_RemoveFirstChar(Sink sink, int shared, int depth, Term term_25) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sSubstring); sink.end(); sink.copy(term_25.ref()); sink.literal(1);
      sink.end(); return true;
    }
    return thunk(sink, _M_RemoveFirstChar, term_25);
  } final public static boolean _M_UpCaseFirst(Sink sink, int shared, int depth, Term term_53) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sUpCase); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sSubstring); sink.end(); sink.copy(term_53.ref()); sink.literal(0); sink.literal(1);
      sink.end();
      sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sSubstring); sink.end(); sink.copy(term_53.ref()); sink.literal(1);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_UpCaseFirst, term_53);
  } final public static boolean _M_UnString(Sink sink, int shared, int depth, Term term_94) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sRescape); sink.end(); sink.copy(term_94.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_UnString, term_94);
  } final public static boolean _M_ConcatString(Sink sink, int shared, int depth, Term term_185, Term term_63) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.copy(term_185.ref()); sink.copy(term_63.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_ConcatString, term_185, term_63);
  }  final public static boolean _M_StringEqual(Sink sink, int shared, int depth, Term term_15, Term term_29) {
    if (depth < 2000) {
      sink.start(_M_WrapBoolean);
      sink.start(_M__s); sink.start(_M_Builtin_sStringEqual); sink.end(); sink.copy(term_15.ref()); sink.copy(term_29.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_StringEqual, term_15, term_29);
  }  final public static boolean _M_StartsWith(Sink sink, int shared, int depth, Term term_22, Term term_7) {
    if (depth < 2000) {
      sink.start(_M_WrapBoolean);
      sink.start(_M__s); sink.start(_M_Builtin_sStartsWith); sink.end(); sink.copy(term_22.ref()); sink.copy(term_7.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_StartsWith, term_22, term_7);
  }  
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.std.Core.init(context); context.register(_M_Show); context.register(_M_ParseToTerm); context.register(_M_ParseToString); context.register(_M_BeforeLast2); context.register(_M_BeforeLast); context.register(_M_AfterLast2); context.register(_M_AfterLast); context.register(_M_Replace); context.register(_M_RemoveLastChar); context.register(_M_RemoveFirstChar); context.register(_M_UpCaseFirst); context.register(_M_UnString); context.register(_M_ConcatString); context.register(_M_StringEqual); context.register(_M_StartsWith);
      initialized = true;
    }
  }

/* END MODULE « "/Users/villardl/Projects/crsx/crsx4/src/std/string.crs.java" » */
}