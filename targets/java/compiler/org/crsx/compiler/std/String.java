/* START MODULE /Users/villardl/Projects/crsx/crsx4/src/std/string.crs.java */
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
  } final public static boolean _M_ParseToTerm(Sink sink, int shared, int depth, Term term_6, Term term_91) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sParseText); sink.end(); sink.copy(term_6.ref()); sink.copy(term_91.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_ParseToTerm, term_6, term_91);
  }  final public static boolean _M_ParseToString(Sink sink, int shared, int depth, Term term_1, Term term_76) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sShow); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sParseText); sink.end(); sink.copy(term_1.ref()); sink.copy(term_76.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_ParseToString, term_1, term_76);
  }  final public static boolean _M_BeforeLast2(Sink sink, int shared, int depth, Term term_17, Term term_81, Term term_93) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sStringEqual); sink.end(); sink.copy(term_93.ref()); sink.literal("");
      sink.end(); sink.copy(term_17.ref());
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.copy(term_17.ref()); sink.copy(term_81.ref()); sink.copy(term_93.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_BeforeLast2, term_17, term_81, term_93);
  }   final public static boolean _M_BeforeLast(Sink sink, int shared, int depth, Term term_20, Term term_80) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sContains); sink.end(); sink.copy(term_20.ref()); sink.copy(term_80.ref());
      sink.end();
      sink.start(_M_BeforeLast2);
      sink.start(_M__s); sink.start(_M_Builtin_sBeforeFirst); sink.end(); sink.copy(term_20.ref()); sink.copy(term_80.ref());
      sink.end(); sink.copy(term_80.ref());
      sink.start(_M_BeforeLast);
      sink.start(_M__s); sink.start(_M_Builtin_sAfterFirst); sink.end(); sink.copy(term_20.ref()); sink.copy(term_80.ref());
      sink.end(); sink.copy(term_80.ref());
      sink.end();
      sink.end(); sink.literal("");
      sink.end(); return true;
    }
    return thunk(sink, _M_BeforeLast, term_20, term_80);
  }  final public static boolean _M_AfterLast2(Sink sink, int shared, int depth, Term term_31, Term term_44) {
    if (depth < 2000) {
      sink.start(_M_AfterLast); sink.copy(term_31.ref()); sink.copy(term_44.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_AfterLast2, term_31, term_44);
  }  final public static boolean _M_AfterLast(Sink sink, int shared, int depth, Term term_21, Term term_55) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sIf); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sContains); sink.end(); sink.copy(term_21.ref()); sink.copy(term_55.ref());
      sink.end();
      sink.start(_M_AfterLast2);
      sink.start(_M__s); sink.start(_M_Builtin_sAfterFirst); sink.end(); sink.copy(term_21.ref()); sink.copy(term_55.ref());
      sink.end(); sink.copy(term_55.ref());
      sink.end(); sink.copy(term_21.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_AfterLast, term_21, term_55);
  }  final public static boolean _M_Replace(Sink sink, int shared, int depth, Term term_27, Term term_60, Term term_84) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sReplace); sink.end(); sink.copy(term_27.ref()); sink.copy(term_60.ref()); sink.copy(term_84.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_Replace, term_27, term_60, term_84);
  }   final public static boolean _M_RemoveLastChar(Sink sink, int shared, int depth, Term term_39) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sSubstring); sink.end(); sink.copy(term_39.ref()); sink.literal(0);
      sink.start(_M__s); sink.start(_M_Builtin_sMinus); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sLength); sink.end(); sink.copy(term_39.ref());
      sink.end(); sink.literal(1);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_RemoveLastChar, term_39);
  } final public static boolean _M_RemoveFirstChar(Sink sink, int shared, int depth, Term term_26) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sSubstring); sink.end(); sink.copy(term_26.ref()); sink.literal(1);
      sink.end(); return true;
    }
    return thunk(sink, _M_RemoveFirstChar, term_26);
  } final public static boolean _M_UpCaseFirst(Sink sink, int shared, int depth, Term term_33) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sUpCase); sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sSubstring); sink.end(); sink.copy(term_33.ref()); sink.literal(0); sink.literal(1);
      sink.end();
      sink.end();
      sink.start(_M__s); sink.start(_M_Builtin_sSubstring); sink.end(); sink.copy(term_33.ref()); sink.literal(1);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_UpCaseFirst, term_33);
  } final public static boolean _M_UnString(Sink sink, int shared, int depth, Term term_38) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sRescape); sink.end(); sink.copy(term_38.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_UnString, term_38);
  } final public static boolean _M_ConcatString(Sink sink, int shared, int depth, Term term_62, Term term_42) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.copy(term_62.ref()); sink.copy(term_42.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_ConcatString, term_62, term_42);
  }  final public static boolean _M_StringEqual(Sink sink, int shared, int depth, Term term_54, Term term_182) {
    if (depth < 2000) {
      sink.start(_M_WrapBoolean);
      sink.start(_M__s); sink.start(_M_Builtin_sStringEqual); sink.end(); sink.copy(term_54.ref()); sink.copy(term_182.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_StringEqual, term_54, term_182);
  }  final public static boolean _M_StartsWith(Sink sink, int shared, int depth, Term term_8, Term term_43) {
    if (depth < 2000) {
      sink.start(_M_WrapBoolean);
      sink.start(_M__s); sink.start(_M_Builtin_sStartsWith); sink.end(); sink.copy(term_8.ref()); sink.copy(term_43.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_StartsWith, term_8, term_43);
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