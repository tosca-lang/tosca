/* START MODULE /Users/villardl/Projects/crsx/crsx4/src/std/text.crs.java */
/** Generated File */package org.crsx.compiler.std;
import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;
import static org.crsx.runtime.Normalizer.force;
import static org.crsx.runtime.Reference.safeRef;

import org.crsx.runtime.*;
import org.crsx.runtime.ConstructionDescriptor.*;
import static org.crsx.runtime.Primitives.*;
import static org.crsx.compiler.std.Core.*; import static org.crsx.compiler.std.List.*;

public class Text
{
  final public static ConstructionDescriptor _M__sTextChars = makeData("$TextChars");
  final public static ConstructionDescriptor _M__sTextBreak = makeData("$TextBreak");
  final public static ConstructionDescriptor _M__sTextIndent = makeData("$TextIndent");
  final public static ConstructionDescriptor _M__sTextEmbed = makeData("$TextEmbed");
  final public static ConstructionDescriptor _M__sTextString = makeData("$TextString");
  final public static ConstructionDescriptor _M__sTextCons = makeData("$TextCons");
  final public static ConstructionDescriptor _M__sTextNil = makeData("$TextNil");
  final public static DynamicFunctionDescriptor _M_TextToString = makeFunction("TextToString", Text.class, "_M_TextToString");
  final public static DynamicFunctionDescriptor _M_NumberToText = makeFunction("NumberToText", Text.class, "_M_NumberToText");
  final public static DynamicFunctionDescriptor _M_StringToText = makeFunction("StringToText", Text.class, "_M_StringToText");
  final public static DynamicFunctionDescriptor _M_ReverseTextFold = makeFunction("ReverseTextFold", Text.class, "_M_ReverseTextFold");
  final public static DynamicFunctionDescriptor _M_TextFold1 = makeFunction("TextFold1", Text.class, "_M_TextFold1");
  final public static DynamicFunctionDescriptor _M_TextFold = makeFunction("TextFold", Text.class, "_M_TextFold");
  final public static DynamicFunctionDescriptor _M_Text_Mangle = makeFunction("Text-Mangle", Text.class, "_M_Text_Mangle");
  final public static DynamicFunctionDescriptor _M_Text_Integer = makeFunction("Text-Integer", Text.class, "_M_Text_Integer");
  final public static DynamicFunctionDescriptor _M_Text_QuoteEscape = makeFunction("Text-QuoteEscape", Text.class, "_M_Text_QuoteEscape");
  final public static DynamicFunctionDescriptor _M_Text_Comment = makeFunction("Text-Comment", Text.class, "_M_Text_Comment");
  final public static DynamicFunctionDescriptor _M_Text_CommentToken = makeFunction("Text-CommentToken", Text.class, "_M_Text_CommentToken");
  final public static DynamicFunctionDescriptor _M_Text_Token = makeFunction("Text-Token", Text.class, "_M_Text_Token");
  final public static DynamicFunctionDescriptor _M_Text_User = makeFunction("Text-User", Text.class, "_M_Text_User");
  final public static DynamicFunctionDescriptor _M_Text_ConcatSep = makeFunction("Text-ConcatSep", Text.class, "_M_Text_ConcatSep");
  final public static DynamicFunctionDescriptor _M_Text_Concat = makeFunction("Text-Concat", Text.class, "_M_Text_Concat");
  final public static DynamicFunctionDescriptor _M_Text_Text = makeFunction("Text-Text", Text.class, "_M_Text_Text");
  final public static DynamicFunctionDescriptor _M_Text_String = makeFunction("Text-String", Text.class, "_M_Text_String");
  final public static DynamicFunctionDescriptor _M_Text_Embed = makeFunction("Text-Embed", Text.class, "_M_Text_Embed");
  final public static DynamicFunctionDescriptor _M_AsText = makeFunction("AsText", Text.class, "_M_AsText");final public static boolean _M_TextToString(Sink sink, int shared, int depth, Term term) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sShow); sink.end(); sink.copy(term.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_TextToString, term);
  } final public static boolean _M_NumberToText(Sink sink, int shared, int depth, Term term_49) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_54;
      {
        BufferSink buf = sink.context().makeBuffer(); buf.start(_M_STRING); buf.literal(1); buf.end();
        term_54 = buf.term();
      } sink.propertyNamed("$LineLocation", term_54);Term term_81;
      {
        BufferSink buf_5 = sink.context().makeBuffer(); buf_5.start(_M_STRING); buf_5.literal(1); buf_5.end();
        term_81 = buf_5.term();
      } sink.propertyNamed("$ColumnLocation", term_81);
      sink.start(_M__sTextChars);
      sink.start(_M__s); sink.start(_M_Builtin_sFormatNumber); sink.end(); sink.copy(term_49.ref());
      sink.end();
      sink.end();Term term_6;
      {
        BufferSink buf_95 = sink.context().makeBuffer(); buf_95.start(_M_STRING); buf_95.literal(1); buf_95.end();
        term_6 = buf_95.term();
      } sink.propertyNamed("$LineLocation", term_6);Term term_15;
      {
        BufferSink buf_44 = sink.context().makeBuffer(); buf_44.start(_M_STRING); buf_44.literal(2); buf_44.end();
        term_15 = buf_44.term();
      } sink.propertyNamed("$ColumnLocation", term_15);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_NumberToText, term_49);
  } final public static boolean _M_StringToText(Sink sink, int shared, int depth, Term term_46) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_18;
      {
        BufferSink buf_20 = sink.context().makeBuffer(); buf_20.start(_M_STRING); buf_20.literal(1); buf_20.end();
        term_18 = buf_20.term();
      } sink.propertyNamed("$LineLocation", term_18);Term term_21;
      {
        BufferSink buf_56 = sink.context().makeBuffer(); buf_56.start(_M_STRING); buf_56.literal(1); buf_56.end();
        term_21 = buf_56.term();
      } sink.propertyNamed("$ColumnLocation", term_21);
      sink.start(_M__sTextChars); sink.copy(term_46.ref());
      sink.end();Term term_5;
      {
        BufferSink buf_46 = sink.context().makeBuffer(); buf_46.start(_M_STRING); buf_46.literal(1); buf_46.end();
        term_5 = buf_46.term();
      } sink.propertyNamed("$LineLocation", term_5);Term term_7;
      {
        BufferSink buf_187 = sink.context().makeBuffer(); buf_187.start(_M_STRING); buf_187.literal(2); buf_187.end();
        term_7 = buf_187.term();
      } sink.propertyNamed("$ColumnLocation", term_7);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_StringToText, term_46);
  } final public static boolean _M_ReverseTextFold(Sink sink, int shared, int depth, Term term_89, Term term_40) {
    if (depth < 2000) {
      label: {
        if (term_89.descriptor() != _M__sNil)
        {   break label;
        }
        /* #sep=term *//*Contract*/ sink.start(_M__sTextNil); sink.end(); return true;
      }
      label_6: {
        if (term_89.descriptor() != _M__sCons)
        {   break label_6;
        }Term sub = term_89.sub(0).ref();
        /* #1=sub */Term sub_99 = term_89.sub(1).ref();
        if (sub_99.descriptor() != _M__sNil)
        {   break label_6;
        }
        /* #sep=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed); sink.start(_M_AsText); sink.copy(sub.ref()); sink.end();
        sink.end();Term term_53;
        {
          BufferSink buf_84 = sink.context().makeBuffer(); buf_84.start(_M_STRING); buf_84.literal(1); buf_84.end();
          term_53 = buf_84.term();
        } sink.propertyNamed("$LineLocation", term_53);Term term_36;
        {
          BufferSink buf_24 = sink.context().makeBuffer(); buf_24.start(_M_STRING); buf_24.literal(1); buf_24.end();
          term_36 = buf_24.term();
        } sink.propertyNamed("$ColumnLocation", term_36);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); return true;
      }
      label_69: {
        if (term_89.descriptor() != _M__sCons)
        {   break label_69;
        }Term sub_4 = term_89.sub(0).ref();
        /* #1=sub */Term sub_50 = term_89.sub(1).ref();
        if (sub_50.descriptor() != _M__sCons)
        {   break label_69;
        }Term sub_9 = sub_50.sub(0).ref();
        /* #2=sub */Term sub_29 = sub_50.sub(1).ref();
        /* #s=sub */
        /* #sep=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed);
        sink.start(_M_AsText);
        sink.start(_M_ReverseTextFold);
        sink.start(_M__sCons); sink.copy(sub_9.ref()); sink.copy(sub_29.ref());
        sink.end(); sink.copy(term_40.ref());
        sink.end();
        sink.end();
        sink.end();Term term_136;
        {
          BufferSink buf_36 = sink.context().makeBuffer(); buf_36.start(_M_STRING); buf_36.literal(1); buf_36.end();
          term_136 = buf_36.term();
        } sink.propertyNamed("$LineLocation", term_136);Term term_35;
        {
          BufferSink buf_77 = sink.context().makeBuffer(); buf_77.start(_M_STRING); buf_77.literal(1); buf_77.end();
          term_35 = buf_77.term();
        } sink.propertyNamed("$ColumnLocation", term_35);
        sink.start(_M__sTextCons);Term term_19;
        {
          BufferSink buf_11 = sink.context().makeBuffer(); buf_11.start(_M_STRING); buf_11.literal(1); buf_11.end();
          term_19 = buf_11.term();
        } sink.propertyNamed("$LineLocation", term_19);Term term_131;
        {
          BufferSink buf_91 = sink.context().makeBuffer(); buf_91.start(_M_STRING); buf_91.literal(1); buf_91.end();
          term_131 = buf_91.term();
        } sink.propertyNamed("$ColumnLocation", term_131);
        sink.start(_M__sTextEmbed);Term term_4;
        {
          BufferSink buf_14 = sink.context().makeBuffer(); buf_14.start(_M_STRING); buf_14.literal(1); buf_14.end();
          term_4 = buf_14.term();
        } sink.propertyNamed("$LineLocation", term_4);Term term_14;
        {
          BufferSink buf_13 = sink.context().makeBuffer(); buf_13.start(_M_STRING); buf_13.literal(1); buf_13.end();
          term_14 = buf_13.term();
        } sink.propertyNamed("$ColumnLocation", term_14);
        sink.start(_M_AsText); sink.copy(term_40.ref());
        sink.end();
        sink.end();Term term_57;
        {
          BufferSink buf_66 = sink.context().makeBuffer(); buf_66.start(_M_STRING); buf_66.literal(1); buf_66.end();
          term_57 = buf_66.term();
        } sink.propertyNamed("$LineLocation", term_57);Term term_71;
        {
          BufferSink buf_58 = sink.context().makeBuffer(); buf_58.start(_M_STRING); buf_58.literal(35); buf_58.end();
          term_71 = buf_58.term();
        } sink.propertyNamed("$ColumnLocation", term_71);
        sink.start(_M__sTextCons);Term term_157;
        {
          BufferSink buf_85 = sink.context().makeBuffer(); buf_85.start(_M_STRING); buf_85.literal(1); buf_85.end();
          term_157 = buf_85.term();
        } sink.propertyNamed("$LineLocation", term_157);Term term_77;
        {
          BufferSink buf_54 = sink.context().makeBuffer(); buf_54.start(_M_STRING); buf_54.literal(35); buf_54.end();
          term_77 = buf_54.term();
        } sink.propertyNamed("$ColumnLocation", term_77);
        sink.start(_M__sTextEmbed);Term term_65;
        {
          BufferSink buf_6 = sink.context().makeBuffer(); buf_6.start(_M_STRING); buf_6.literal(1); buf_6.end();
          term_65 = buf_6.term();
        } sink.propertyNamed("$LineLocation", term_65);Term term_94;
        {
          BufferSink buf_16 = sink.context().makeBuffer(); buf_16.start(_M_STRING); buf_16.literal(35); buf_16.end();
          term_94 = buf_16.term();
        } sink.propertyNamed("$ColumnLocation", term_94);
        sink.start(_M_AsText); sink.copy(sub_4.ref());
        sink.end();
        sink.end();Term term_20;
        {
          BufferSink buf_74 = sink.context().makeBuffer(); buf_74.start(_M_STRING); buf_74.literal(1); buf_74.end();
          term_20 = buf_74.term();
        } sink.propertyNamed("$LineLocation", term_20);Term term_69;
        {
          BufferSink buf_39 = sink.context().makeBuffer(); buf_39.start(_M_STRING); buf_39.literal(43); buf_39.end();
          term_69 = buf_39.term();
        } sink.propertyNamed("$ColumnLocation", term_69);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ReverseTextFold, term_89, term_40);
  }  final public static boolean _M_TextFold1(Sink sink, int shared, int depth, Term term_113, Term term_70) {
    if (depth < 2000) {
      label_7: {
        if (term_113.descriptor() != _M__sNil)
        {   break label_7;
        }
        /* #sep=term *//*Contract*/ sink.start(_M__sTextNil); sink.end(); return true;
      }
      label_66: {
        if (term_113.descriptor() != _M__sCons)
        {   break label_66;
        }Term sub_53 = term_113.sub(0).ref();
        /* #1=sub */Term sub_80 = term_113.sub(1).ref();
        /* #s=sub */
        /* #sep=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed); sink.start(_M_AsText); sink.copy(term_70.ref()); sink.end();
        sink.end();Term term_75;
        {
          BufferSink buf_41 = sink.context().makeBuffer(); buf_41.start(_M_STRING); buf_41.literal(1); buf_41.end();
          term_75 = buf_41.term();
        } sink.propertyNamed("$LineLocation", term_75);Term term_23;
        {
          BufferSink buf_68 = sink.context().makeBuffer(); buf_68.start(_M_STRING); buf_68.literal(1); buf_68.end();
          term_23 = buf_68.term();
        } sink.propertyNamed("$ColumnLocation", term_23);
        sink.start(_M__sTextCons);Term term_66;
        {
          BufferSink buf_34 = sink.context().makeBuffer(); buf_34.start(_M_STRING); buf_34.literal(1); buf_34.end();
          term_66 = buf_34.term();
        } sink.propertyNamed("$LineLocation", term_66);Term term_82;
        {
          BufferSink buf_59 = sink.context().makeBuffer(); buf_59.start(_M_STRING); buf_59.literal(1); buf_59.end();
          term_82 = buf_59.term();
        } sink.propertyNamed("$ColumnLocation", term_82);
        sink.start(_M__sTextEmbed);Term term_42;
        {
          BufferSink buf_262 = sink.context().makeBuffer(); buf_262.start(_M_STRING); buf_262.literal(1); buf_262.end();
          term_42 = buf_262.term();
        } sink.propertyNamed("$LineLocation", term_42);Term term_8;
        {
          BufferSink buf_2 = sink.context().makeBuffer(); buf_2.start(_M_STRING); buf_2.literal(1); buf_2.end();
          term_8 = buf_2.term();
        } sink.propertyNamed("$ColumnLocation", term_8);
        sink.start(_M_AsText); sink.copy(sub_53.ref());
        sink.end();
        sink.end();Term term_84;
        {
          BufferSink buf_63 = sink.context().makeBuffer(); buf_63.start(_M_STRING); buf_63.literal(1); buf_63.end();
          term_84 = buf_63.term();
        } sink.propertyNamed("$LineLocation", term_84);Term term_95;
        {
          BufferSink buf_57 = sink.context().makeBuffer(); buf_57.start(_M_STRING); buf_57.literal(9); buf_57.end();
          term_95 = buf_57.term();
        } sink.propertyNamed("$ColumnLocation", term_95);
        sink.start(_M__sTextCons);Term term_190;
        {
          BufferSink buf_62 = sink.context().makeBuffer(); buf_62.start(_M_STRING); buf_62.literal(1); buf_62.end();
          term_190 = buf_62.term();
        } sink.propertyNamed("$LineLocation", term_190);Term term_87;
        {
          BufferSink buf_4 = sink.context().makeBuffer(); buf_4.start(_M_STRING); buf_4.literal(9); buf_4.end();
          term_87 = buf_4.term();
        } sink.propertyNamed("$ColumnLocation", term_87);
        sink.start(_M__sTextEmbed);Term term_38;
        {
          BufferSink buf_61 = sink.context().makeBuffer(); buf_61.start(_M_STRING); buf_61.literal(1); buf_61.end();
          term_38 = buf_61.term();
        } sink.propertyNamed("$LineLocation", term_38);Term term_154;
        {
          BufferSink buf_73 = sink.context().makeBuffer(); buf_73.start(_M_STRING); buf_73.literal(9); buf_73.end();
          term_154 = buf_73.term();
        } sink.propertyNamed("$ColumnLocation", term_154);
        sink.start(_M_AsText);
        sink.start(_M_TextFold1); sink.copy(sub_80.ref()); sink.copy(term_70.ref());
        sink.end();
        sink.end();
        sink.end();Term term_62;
        {
          BufferSink buf_19 = sink.context().makeBuffer(); buf_19.start(_M_STRING); buf_19.literal(1); buf_19.end();
          term_62 = buf_19.term();
        } sink.propertyNamed("$LineLocation", term_62);Term term_180;
        {
          BufferSink buf_78 = sink.context().makeBuffer(); buf_78.start(_M_STRING); buf_78.literal(15); buf_78.end();
          term_180 = buf_78.term();
        } sink.propertyNamed("$ColumnLocation", term_180);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_TextFold1, term_113, term_70);
  }  final public static boolean _M_TextFold(Sink sink, int shared, int depth, Term term_56, Term term_10) {
    if (depth < 2000) {
      label_58: {
        if (term_56.descriptor() != _M__sNil)
        {   break label_58;
        }
        /* #sep=term *//*Contract*/ sink.start(_M__sTextNil); sink.end(); return true;
      }
      label_88: {
        if (term_56.descriptor() != _M__sCons)
        {   break label_88;
        }Term sub_23 = term_56.sub(0).ref();
        /* #1=sub */Term sub_125 = term_56.sub(1).ref();
        /* #s=sub */
        /* #sep=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed); sink.start(_M_AsText); sink.copy(term_10.ref()); sink.end();
        sink.end();Term term_3;
        {
          BufferSink buf_67 = sink.context().makeBuffer(); buf_67.start(_M_STRING); buf_67.literal(1); buf_67.end();
          term_3 = buf_67.term();
        } sink.propertyNamed("$LineLocation", term_3);Term term_51;
        {
          BufferSink buf_21 = sink.context().makeBuffer(); buf_21.start(_M_STRING); buf_21.literal(1); buf_21.end();
          term_51 = buf_21.term();
        } sink.propertyNamed("$ColumnLocation", term_51);
        sink.start(_M__sTextCons);Term term_101;
        {
          BufferSink buf_98 = sink.context().makeBuffer(); buf_98.start(_M_STRING); buf_98.literal(1); buf_98.end();
          term_101 = buf_98.term();
        } sink.propertyNamed("$LineLocation", term_101);Term term_22;
        {
          BufferSink buf_178 = sink.context().makeBuffer(); buf_178.start(_M_STRING); buf_178.literal(1); buf_178.end();
          term_22 = buf_178.term();
        } sink.propertyNamed("$ColumnLocation", term_22);
        sink.start(_M__sTextEmbed);Term term_127;
        {
          BufferSink buf_88 = sink.context().makeBuffer(); buf_88.start(_M_STRING); buf_88.literal(1); buf_88.end();
          term_127 = buf_88.term();
        } sink.propertyNamed("$LineLocation", term_127);Term term_185;
        {
          BufferSink buf_10 = sink.context().makeBuffer(); buf_10.start(_M_STRING); buf_10.literal(1); buf_10.end();
          term_185 = buf_10.term();
        } sink.propertyNamed("$ColumnLocation", term_185);
        sink.start(_M_AsText); sink.copy(sub_23.ref());
        sink.end();
        sink.end();Term term_28;
        {
          BufferSink buf_64 = sink.context().makeBuffer(); buf_64.start(_M_STRING); buf_64.literal(1); buf_64.end();
          term_28 = buf_64.term();
        } sink.propertyNamed("$LineLocation", term_28);Term term_74;
        {
          BufferSink buf_83 = sink.context().makeBuffer(); buf_83.start(_M_STRING); buf_83.literal(9); buf_83.end();
          term_74 = buf_83.term();
        } sink.propertyNamed("$ColumnLocation", term_74);
        sink.start(_M__sTextCons);Term term_68;
        {
          BufferSink buf_8 = sink.context().makeBuffer(); buf_8.start(_M_STRING); buf_8.literal(1); buf_8.end();
          term_68 = buf_8.term();
        } sink.propertyNamed("$LineLocation", term_68);Term term_12;
        {
          BufferSink buf_70 = sink.context().makeBuffer(); buf_70.start(_M_STRING); buf_70.literal(9); buf_70.end();
          term_12 = buf_70.term();
        } sink.propertyNamed("$ColumnLocation", term_12);
        sink.start(_M__sTextEmbed);Term term_195;
        {
          BufferSink buf_49 = sink.context().makeBuffer(); buf_49.start(_M_STRING); buf_49.literal(1); buf_49.end();
          term_195 = buf_49.term();
        } sink.propertyNamed("$LineLocation", term_195);Term term_67;
        {
          BufferSink buf_28 = sink.context().makeBuffer(); buf_28.start(_M_STRING); buf_28.literal(9); buf_28.end();
          term_67 = buf_28.term();
        } sink.propertyNamed("$ColumnLocation", term_67);
        sink.start(_M_AsText);
        sink.start(_M_TextFold1); sink.copy(sub_125.ref()); sink.copy(term_10.ref());
        sink.end();
        sink.end();
        sink.end();Term term_76;
        {
          BufferSink buf_12 = sink.context().makeBuffer(); buf_12.start(_M_STRING); buf_12.literal(1); buf_12.end();
          term_76 = buf_12.term();
        } sink.propertyNamed("$LineLocation", term_76);Term term_48;
        {
          BufferSink buf_25 = sink.context().makeBuffer(); buf_25.start(_M_STRING); buf_25.literal(15); buf_25.end();
          term_48 = buf_25.term();
        } sink.propertyNamed("$ColumnLocation", term_48);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_TextFold, term_56, term_10);
  }  final public static boolean _M_Text_Mangle(Sink sink, int shared, int depth, Term term_64) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_141;
      {
        BufferSink buf_99 = sink.context().makeBuffer(); buf_99.start(_M_STRING); buf_99.literal(1); buf_99.end();
        term_141 = buf_99.term();
      } sink.propertyNamed("$LineLocation", term_141);Term term_123;
      {
        BufferSink buf_60 = sink.context().makeBuffer(); buf_60.start(_M_STRING); buf_60.literal(1); buf_60.end();
        term_123 = buf_60.term();
      } sink.propertyNamed("$ColumnLocation", term_123);
      sink.start(_M__sTextChars);
      sink.start(_M__s); sink.start(_M_Builtin_sMangle); sink.end(); sink.copy(term_64.ref());
      sink.end();
      sink.end();Term term_148;
      {
        BufferSink buf_26 = sink.context().makeBuffer(); buf_26.start(_M_STRING); buf_26.literal(1); buf_26.end();
        term_148 = buf_26.term();
      } sink.propertyNamed("$LineLocation", term_148);Term term_110;
      {
        BufferSink buf_156 = sink.context().makeBuffer(); buf_156.start(_M_STRING); buf_156.literal(2); buf_156.end();
        term_110 = buf_156.term();
      } sink.propertyNamed("$ColumnLocation", term_110);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Mangle, term_64);
  } final public static boolean _M_Text_Integer(Sink sink, int shared, int depth, Term term_30) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_58;
      {
        BufferSink buf_89 = sink.context().makeBuffer(); buf_89.start(_M_STRING); buf_89.literal(1); buf_89.end();
        term_58 = buf_89.term();
      } sink.propertyNamed("$LineLocation", term_58);Term term_29;
      {
        BufferSink buf_281 = sink.context().makeBuffer(); buf_281.start(_M_STRING); buf_281.literal(1); buf_281.end();
        term_29 = buf_281.term();
      } sink.propertyNamed("$ColumnLocation", term_29);
      sink.start(_M__sTextChars);
      sink.start(_M__s); sink.start(_M_Builtin_sFormatNumber); sink.end(); sink.copy(term_30.ref());
      sink.end();
      sink.end();Term term_105;
      {
        BufferSink buf_79 = sink.context().makeBuffer(); buf_79.start(_M_STRING); buf_79.literal(1); buf_79.end();
        term_105 = buf_79.term();
      } sink.propertyNamed("$LineLocation", term_105);Term term_31;
      {
        BufferSink buf_90 = sink.context().makeBuffer(); buf_90.start(_M_STRING); buf_90.literal(2); buf_90.end();
        term_31 = buf_90.term();
      } sink.propertyNamed("$ColumnLocation", term_31);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Integer, term_30);
  } final public static boolean _M_Text_QuoteEscape(Sink sink, int shared, int depth, Term term_102) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_177;
      {
        BufferSink buf_270 = sink.context().makeBuffer(); buf_270.start(_M_STRING); buf_270.literal(1); buf_270.end();
        term_177 = buf_270.term();
      } sink.propertyNamed("$LineLocation", term_177);Term term_128;
      {
        BufferSink buf_273 = sink.context().makeBuffer(); buf_273.start(_M_STRING); buf_273.literal(1); buf_273.end();
        term_128 = buf_273.term();
      } sink.propertyNamed("$ColumnLocation", term_128);
      sink.start(_M__sTextChars);
      sink.start(_M__s); sink.start(_M_Builtin_sEscape); sink.end(); sink.copy(term_102.ref());
      sink.end();
      sink.end();Term term_39;
      {
        BufferSink buf_185 = sink.context().makeBuffer(); buf_185.start(_M_STRING); buf_185.literal(1); buf_185.end();
        term_39 = buf_185.term();
      } sink.propertyNamed("$LineLocation", term_39);Term term_281;
      {
        BufferSink buf_9 = sink.context().makeBuffer(); buf_9.start(_M_STRING); buf_9.literal(2); buf_9.end();
        term_281 = buf_9.term();
      } sink.propertyNamed("$ColumnLocation", term_281);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_QuoteEscape, term_102);
  } final public static boolean _M_Text_Comment(Sink sink, int shared, int depth, Term term_181) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_246;
      {
        BufferSink buf_96 = sink.context().makeBuffer(); buf_96.start(_M_STRING); buf_96.literal(1); buf_96.end();
        term_246 = buf_96.term();
      } sink.propertyNamed("$LineLocation", term_246);Term term_267;
      {
        BufferSink buf_45 = sink.context().makeBuffer(); buf_45.start(_M_STRING); buf_45.literal(1); buf_45.end();
        term_267 = buf_45.term();
      } sink.propertyNamed("$ColumnLocation", term_267);
      sink.start(_M__sTextChars);
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("/*");
      sink.start(_M__s); sink.start(_M_Builtin_sReplace); sink.end(); sink.copy(term_181.ref()); sink.literal("*/"); sink.literal("*_/");
      sink.end(); sink.literal("*/");
      sink.end();
      sink.end();Term term_2;
      {
        BufferSink buf_194 = sink.context().makeBuffer(); buf_194.start(_M_STRING); buf_194.literal(1); buf_194.end();
        term_2 = buf_194.term();
      } sink.propertyNamed("$LineLocation", term_2);Term term_169;
      {
        BufferSink buf_288 = sink.context().makeBuffer(); buf_288.start(_M_STRING); buf_288.literal(2); buf_288.end();
        term_169 = buf_288.term();
      } sink.propertyNamed("$ColumnLocation", term_169);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Comment, term_181);
  } final public static boolean _M_Text_CommentToken(Sink sink, int shared, int depth, Term term_13) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_60;
      {
        BufferSink buf_7 = sink.context().makeBuffer(); buf_7.start(_M_STRING); buf_7.literal(1); buf_7.end();
        term_60 = buf_7.term();
      } sink.propertyNamed("$LineLocation", term_60);Term term_17;
      {
        BufferSink buf_275 = sink.context().makeBuffer(); buf_275.start(_M_STRING); buf_275.literal(1); buf_275.end();
        term_17 = buf_275.term();
      } sink.propertyNamed("$ColumnLocation", term_17);
      sink.start(_M__sTextChars);
      sink.start(_M__s); sink.start(_M_Builtin_sReplace); sink.end(); sink.copy(term_13.ref()); sink.literal("*/"); sink.literal("*_/");
      sink.end();
      sink.end();Term term_165;
      {
        BufferSink buf_23 = sink.context().makeBuffer(); buf_23.start(_M_STRING); buf_23.literal(1); buf_23.end();
        term_165 = buf_23.term();
      } sink.propertyNamed("$LineLocation", term_165);Term term_108;
      {
        BufferSink buf_22 = sink.context().makeBuffer(); buf_22.start(_M_STRING); buf_22.literal(2); buf_22.end();
        term_108 = buf_22.term();
      } sink.propertyNamed("$ColumnLocation", term_108);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_CommentToken, term_13);
  } final public static boolean _M_Text_Token(Sink sink, int shared, int depth, Term term_16) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_83;
      {
        BufferSink buf_65 = sink.context().makeBuffer(); buf_65.start(_M_STRING); buf_65.literal(1); buf_65.end();
        term_83 = buf_65.term();
      } sink.propertyNamed("$LineLocation", term_83);Term term_151;
      {
        BufferSink buf_235 = sink.context().makeBuffer(); buf_235.start(_M_STRING); buf_235.literal(1); buf_235.end();
        term_151 = buf_235.term();
      } sink.propertyNamed("$ColumnLocation", term_151);
      sink.start(_M__sTextChars); sink.copy(term_16.ref());
      sink.end();Term term_163;
      {
        BufferSink buf_27 = sink.context().makeBuffer(); buf_27.start(_M_STRING); buf_27.literal(1); buf_27.end();
        term_163 = buf_27.term();
      } sink.propertyNamed("$LineLocation", term_163);Term term_239;
      {
        BufferSink buf_55 = sink.context().makeBuffer(); buf_55.start(_M_STRING); buf_55.literal(2); buf_55.end();
        term_239 = buf_55.term();
      } sink.propertyNamed("$ColumnLocation", term_239);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Token, term_16);
  } final public static boolean _M_Text_User(Sink sink, int shared, int depth, Term term_92, Term term_45) {
    if (depth < 2000) {
      sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal("%"); sink.end();Term term_97;
      {
        BufferSink buf_3 = sink.context().makeBuffer(); buf_3.start(_M_STRING); buf_3.literal(1); buf_3.end();
        term_97 = buf_3.term();
      } sink.propertyNamed("$LineLocation", term_97);Term term_266;
      {
        BufferSink buf_33 = sink.context().makeBuffer(); buf_33.start(_M_STRING); buf_33.literal(1); buf_33.end();
        term_266 = buf_33.term();
      } sink.propertyNamed("$ColumnLocation", term_266);
      sink.start(_M__sTextCons);Term term_11;
      {
        BufferSink buf_199 = sink.context().makeBuffer(); buf_199.start(_M_STRING); buf_199.literal(1); buf_199.end();
        term_11 = buf_199.term();
      } sink.propertyNamed("$LineLocation", term_11);Term term_191;
      {
        BufferSink buf_152 = sink.context().makeBuffer(); buf_152.start(_M_STRING); buf_152.literal(2); buf_152.end();
        term_191 = buf_152.term();
      } sink.propertyNamed("$ColumnLocation", term_191);
      sink.start(_M__sTextChars); sink.copy(term_92.ref());
      sink.end();Term term_24;
      {
        BufferSink buf_38 = sink.context().makeBuffer(); buf_38.start(_M_STRING); buf_38.literal(1); buf_38.end();
        term_24 = buf_38.term();
      } sink.propertyNamed("$LineLocation", term_24);Term term_96;
      {
        BufferSink buf_190 = sink.context().makeBuffer(); buf_190.start(_M_STRING); buf_190.literal(3); buf_190.end();
        term_96 = buf_190.term();
      } sink.propertyNamed("$ColumnLocation", term_96);
      sink.start(_M__sTextCons);Term term_189;
      {
        BufferSink buf_31 = sink.context().makeBuffer(); buf_31.start(_M_STRING); buf_31.literal(1); buf_31.end();
        term_189 = buf_31.term();
      } sink.propertyNamed("$LineLocation", term_189);Term term_1;
      {
        BufferSink buf_157 = sink.context().makeBuffer(); buf_157.start(_M_STRING); buf_157.literal(17); buf_157.end();
        term_1 = buf_157.term();
      } sink.propertyNamed("$ColumnLocation", term_1);
      sink.start(_M__sTextChars); sink.literal("\u27e6\u27e6");
      sink.end();Term term_63;
      {
        BufferSink buf_97 = sink.context().makeBuffer(); buf_97.start(_M_STRING); buf_97.literal(1); buf_97.end();
        term_63 = buf_97.term();
      } sink.propertyNamed("$LineLocation", term_63);Term term_215;
      {
        BufferSink buf_29 = sink.context().makeBuffer(); buf_29.start(_M_STRING); buf_29.literal(18); buf_29.end();
        term_215 = buf_29.term();
      } sink.propertyNamed("$ColumnLocation", term_215);
      sink.start(_M__sTextCons);Term term_186;
      {
        BufferSink buf_298 = sink.context().makeBuffer(); buf_298.start(_M_STRING); buf_298.literal(1); buf_298.end();
        term_186 = buf_298.term();
      } sink.propertyNamed("$LineLocation", term_186);Term term_156;
      {
        BufferSink buf_93 = sink.context().makeBuffer(); buf_93.start(_M_STRING); buf_93.literal(18); buf_93.end();
        term_156 = buf_93.term();
      } sink.propertyNamed("$ColumnLocation", term_156);
      sink.start(_M__sTextEmbed);Term term_125;
      {
        BufferSink buf_151 = sink.context().makeBuffer(); buf_151.start(_M_STRING); buf_151.literal(1); buf_151.end();
        term_125 = buf_151.term();
      } sink.propertyNamed("$LineLocation", term_125);Term term_116;
      {
        BufferSink buf_69 = sink.context().makeBuffer(); buf_69.start(_M_STRING); buf_69.literal(18); buf_69.end();
        term_116 = buf_69.term();
      } sink.propertyNamed("$ColumnLocation", term_116);
      sink.start(_M_AsText); sink.copy(term_45.ref());
      sink.end();
      sink.end();Term term_132;
      {
        BufferSink buf_160 = sink.context().makeBuffer(); buf_160.start(_M_STRING); buf_160.literal(1); buf_160.end();
        term_132 = buf_160.term();
      } sink.propertyNamed("$LineLocation", term_132);Term term_187;
      {
        BufferSink buf_141 = sink.context().makeBuffer(); buf_141.start(_M_STRING); buf_141.literal(34); buf_141.end();
        term_187 = buf_141.term();
      } sink.propertyNamed("$ColumnLocation", term_187);
      sink.start(_M__sTextCons);Term term_32;
      {
        BufferSink buf_1 = sink.context().makeBuffer(); buf_1.start(_M_STRING); buf_1.literal(1); buf_1.end();
        term_32 = buf_1.term();
      } sink.propertyNamed("$LineLocation", term_32);Term term_279;
      {
        BufferSink buf_127 = sink.context().makeBuffer(); buf_127.start(_M_STRING); buf_127.literal(47); buf_127.end();
        term_279 = buf_127.term();
      } sink.propertyNamed("$ColumnLocation", term_279);
      sink.start(_M__sTextChars); sink.literal("\u27e7\u27e7");
      sink.end();Term term_120;
      {
        BufferSink buf_105 = sink.context().makeBuffer(); buf_105.start(_M_STRING); buf_105.literal(1); buf_105.end();
        term_120 = buf_105.term();
      } sink.propertyNamed("$LineLocation", term_120);Term term_72;
      {
        BufferSink buf_15 = sink.context().makeBuffer(); buf_15.start(_M_STRING); buf_15.literal(48); buf_15.end();
        term_72 = buf_15.term();
      } sink.propertyNamed("$ColumnLocation", term_72);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end();
      sink.end();
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_User, term_92, term_45);
  }  final public static boolean _M_Text_ConcatSep(Sink sink, int shared, int depth, Term term_88, Term term_126) {
    if (depth < 2000) {
      label_93: {
        if (term_88.descriptor() != _M__sNil)
        {   break label_93;
        }
        /* #sep=term *//*Contract*/ sink.start(_M__sTextNil); sink.end(); return true;
      }
      label_18: {
        if (term_88.descriptor() != _M__sCons)
        {   break label_18;
        }Term sub_58 = term_88.sub(0).ref();
        /* #t1=sub */Term sub_45 = term_88.sub(1).ref();
        if (sub_45.descriptor() != _M__sNil)
        {   break label_18;
        }
        /* #sep=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed); sink.start(_M_AsText); sink.copy(sub_58.ref()); sink.end();
        sink.end();Term term_26;
        {
          BufferSink buf_124 = sink.context().makeBuffer(); buf_124.start(_M_STRING); buf_124.literal(1); buf_124.end();
          term_26 = buf_124.term();
        } sink.propertyNamed("$LineLocation", term_26);Term term_193;
        {
          BufferSink buf_155 = sink.context().makeBuffer(); buf_155.start(_M_STRING); buf_155.literal(1); buf_155.end();
          term_193 = buf_155.term();
        } sink.propertyNamed("$ColumnLocation", term_193);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); return true;
      }
      label_91: {
        if (term_88.descriptor() != _M__sCons)
        {   break label_91;
        }Term sub_184 = term_88.sub(0).ref();
        /* #t1=sub */Term sub_75 = term_88.sub(1).ref();
        if (sub_75.descriptor() != _M__sCons)
        {   break label_91;
        }Term sub_69 = sub_75.sub(0).ref();
        /* #t2=sub */Term sub_81 = sub_75.sub(1).ref();
        /* #ts=sub */
        /* #sep=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed); sink.start(_M_AsText); sink.copy(sub_184.ref()); sink.end();
        sink.end();Term term_299;
        {
          BufferSink buf_164 = sink.context().makeBuffer(); buf_164.start(_M_STRING); buf_164.literal(1); buf_164.end();
          term_299 = buf_164.term();
        } sink.propertyNamed("$LineLocation", term_299);Term term_104;
        {
          BufferSink buf_161 = sink.context().makeBuffer(); buf_161.start(_M_STRING); buf_161.literal(1); buf_161.end();
          term_104 = buf_161.term();
        } sink.propertyNamed("$ColumnLocation", term_104);
        sink.start(_M__sTextCons);Term term_194;
        {
          BufferSink buf_168 = sink.context().makeBuffer(); buf_168.start(_M_STRING); buf_168.literal(1); buf_168.end();
          term_194 = buf_168.term();
        } sink.propertyNamed("$LineLocation", term_194);Term term_175;
        {
          BufferSink buf_0 = sink.context().makeBuffer(); buf_0.start(_M_STRING); buf_0.literal(1); buf_0.end();
          term_175 = buf_0.term();
        } sink.propertyNamed("$ColumnLocation", term_175);
        sink.start(_M__sTextEmbed);Term term_55;
        {
          BufferSink buf_184 = sink.context().makeBuffer(); buf_184.start(_M_STRING); buf_184.literal(1); buf_184.end();
          term_55 = buf_184.term();
        } sink.propertyNamed("$LineLocation", term_55);Term term_59;
        {
          BufferSink buf_181 = sink.context().makeBuffer(); buf_181.start(_M_STRING); buf_181.literal(1); buf_181.end();
          term_59 = buf_181.term();
        } sink.propertyNamed("$ColumnLocation", term_59);
        sink.start(_M_AsText); sink.copy(term_126.ref());
        sink.end();
        sink.end();Term term_122;
        {
          BufferSink buf_191 = sink.context().makeBuffer(); buf_191.start(_M_STRING); buf_191.literal(1); buf_191.end();
          term_122 = buf_191.term();
        } sink.propertyNamed("$LineLocation", term_122);Term term_90;
        {
          BufferSink buf_165 = sink.context().makeBuffer(); buf_165.start(_M_STRING); buf_165.literal(6); buf_165.end();
          term_90 = buf_165.term();
        } sink.propertyNamed("$ColumnLocation", term_90);
        sink.start(_M__sTextCons);Term term_167;
        {
          BufferSink buf_484 = sink.context().makeBuffer(); buf_484.start(_M_STRING); buf_484.literal(1); buf_484.end();
          term_167 = buf_484.term();
        } sink.propertyNamed("$LineLocation", term_167);Term term_161;
        {
          BufferSink buf_209 = sink.context().makeBuffer(); buf_209.start(_M_STRING); buf_209.literal(6); buf_209.end();
          term_161 = buf_209.term();
        } sink.propertyNamed("$ColumnLocation", term_161);
        sink.start(_M__sTextEmbed);Term term_25;
        {
          BufferSink buf_131 = sink.context().makeBuffer(); buf_131.start(_M_STRING); buf_131.literal(1); buf_131.end();
          term_25 = buf_131.term();
        } sink.propertyNamed("$LineLocation", term_25);Term term_244;
        {
          BufferSink buf_18 = sink.context().makeBuffer(); buf_18.start(_M_STRING); buf_18.literal(6); buf_18.end();
          term_244 = buf_18.term();
        } sink.propertyNamed("$ColumnLocation", term_244);
        sink.start(_M_AsText);
        sink.start(_M_Text_ConcatSep);
        sink.start(_M__sCons); sink.copy(sub_69.ref()); sink.copy(sub_81.ref());
        sink.end(); sink.copy(term_126.ref());
        sink.end();
        sink.end();
        sink.end();Term term_144;
        {
          BufferSink buf_119 = sink.context().makeBuffer(); buf_119.start(_M_STRING); buf_119.literal(1); buf_119.end();
          term_144 = buf_119.term();
        } sink.propertyNamed("$LineLocation", term_144);Term term_50;
        {
          BufferSink buf_172 = sink.context().makeBuffer();
          buf_172.start(_M_STRING); buf_172.literal(12);
          buf_172.end();
          term_50 = buf_172.term();
        } sink.propertyNamed("$ColumnLocation", term_50);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Text_ConcatSep, term_88, term_126);
  }  final public static boolean _M_Text_Concat(Sink sink, int shared, int depth, Term term_61) {
    if (depth < 2000) {
      sink.start(_M_Text_ConcatSep); sink.copy(term_61.ref()); sink.start(_M__sTextNil); sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Concat, term_61);
  } final public static boolean _M_Text_Text(Sink sink, int shared, int depth, Term term_91) {
    if (depth < 2000) {
      sink.start(_M_Text_User); sink.literal("n"); sink.copy(term_91.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Text, term_91);
  } final public static boolean _M_Text_String(Sink sink, int shared, int depth, Term term_33) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_139;
      {
        BufferSink buf_72 = sink.context().makeBuffer(); buf_72.start(_M_STRING); buf_72.literal(1); buf_72.end();
        term_139 = buf_72.term();
      } sink.propertyNamed("$LineLocation", term_139);Term term_103;
      {
        BufferSink buf_210 = sink.context().makeBuffer(); buf_210.start(_M_STRING); buf_210.literal(1); buf_210.end();
        term_103 = buf_210.term();
      } sink.propertyNamed("$ColumnLocation", term_103);
      sink.start(_M__sTextChars); sink.literal("\u2020\u2020");
      sink.end();Term term_43;
      {
        BufferSink buf_43 = sink.context().makeBuffer(); buf_43.start(_M_STRING); buf_43.literal(1); buf_43.end();
        term_43 = buf_43.term();
      } sink.propertyNamed("$LineLocation", term_43);Term term_241;
      {
        BufferSink buf_47 = sink.context().makeBuffer(); buf_47.start(_M_STRING); buf_47.literal(2); buf_47.end();
        term_241 = buf_47.term();
      } sink.propertyNamed("$ColumnLocation", term_241);
      sink.start(_M__sTextCons);Term term_302;
      {
        BufferSink buf_108 = sink.context().makeBuffer(); buf_108.start(_M_STRING); buf_108.literal(1); buf_108.end();
        term_302 = buf_108.term();
      } sink.propertyNamed("$LineLocation", term_302);Term term_0;
      {
        BufferSink buf_296 = sink.context().makeBuffer(); buf_296.start(_M_STRING); buf_296.literal(18); buf_296.end();
        term_0 = buf_296.term();
      } sink.propertyNamed("$ColumnLocation", term_0);
      sink.start(_M__sTextChars); sink.literal("\u00ab\u00ab");
      sink.end();Term term_79;
      {
        BufferSink buf_37 = sink.context().makeBuffer(); buf_37.start(_M_STRING); buf_37.literal(1); buf_37.end();
        term_79 = buf_37.term();
      } sink.propertyNamed("$LineLocation", term_79);Term term_280;
      {
        BufferSink buf_76 = sink.context().makeBuffer(); buf_76.start(_M_STRING); buf_76.literal(19); buf_76.end();
        term_280 = buf_76.term();
      } sink.propertyNamed("$ColumnLocation", term_280);
      sink.start(_M__sTextCons);Term term_121;
      {
        BufferSink buf_53 = sink.context().makeBuffer(); buf_53.start(_M_STRING); buf_53.literal(1); buf_53.end();
        term_121 = buf_53.term();
      } sink.propertyNamed("$LineLocation", term_121);Term term_134;
      {
        BufferSink buf_153 = sink.context().makeBuffer(); buf_153.start(_M_STRING); buf_153.literal(19); buf_153.end();
        term_134 = buf_153.term();
      } sink.propertyNamed("$ColumnLocation", term_134);
      sink.start(_M__sTextEmbed);Term term_147;
      {
        BufferSink buf_104 = sink.context().makeBuffer(); buf_104.start(_M_STRING); buf_104.literal(1); buf_104.end();
        term_147 = buf_104.term();
      } sink.propertyNamed("$LineLocation", term_147);Term term_34;
      {
        BufferSink buf_106 = sink.context().makeBuffer(); buf_106.start(_M_STRING); buf_106.literal(19); buf_106.end();
        term_34 = buf_106.term();
      } sink.propertyNamed("$ColumnLocation", term_34);
      sink.start(_M_AsText); sink.copy(term_33.ref());
      sink.end();
      sink.end();Term term_112;
      {
        BufferSink buf_171 = sink.context().makeBuffer(); buf_171.start(_M_STRING); buf_171.literal(1); buf_171.end();
        term_112 = buf_171.term();
      } sink.propertyNamed("$LineLocation", term_112);Term term_78;
      {
        BufferSink buf_140 = sink.context().makeBuffer(); buf_140.start(_M_STRING); buf_140.literal(35); buf_140.end();
        term_78 = buf_140.term();
      } sink.propertyNamed("$ColumnLocation", term_78);
      sink.start(_M__sTextCons);Term term_393;
      {
        BufferSink buf_82 = sink.context().makeBuffer(); buf_82.start(_M_STRING); buf_82.literal(1); buf_82.end();
        term_393 = buf_82.term();
      } sink.propertyNamed("$LineLocation", term_393);Term term_659;
      {
        BufferSink buf_71 = sink.context().makeBuffer(); buf_71.start(_M_STRING); buf_71.literal(48); buf_71.end();
        term_659 = buf_71.term();
      } sink.propertyNamed("$ColumnLocation", term_659);
      sink.start(_M__sTextChars); sink.literal("\u00bb\u00bb");
      sink.end();Term term_255;
      {
        BufferSink buf_40 = sink.context().makeBuffer(); buf_40.start(_M_STRING); buf_40.literal(1); buf_40.end();
        term_255 = buf_40.term();
      } sink.propertyNamed("$LineLocation", term_255);Term term_47;
      {
        BufferSink buf_51 = sink.context().makeBuffer(); buf_51.start(_M_STRING); buf_51.literal(49); buf_51.end();
        term_47 = buf_51.term();
      } sink.propertyNamed("$ColumnLocation", term_47);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end();
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_String, term_33);
  } final public static boolean _M_Text_Embed(Sink sink, int shared, int depth, Term term_225) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_380;
      {
        BufferSink buf_137 = sink.context().makeBuffer(); buf_137.start(_M_STRING); buf_137.literal(1); buf_137.end();
        term_380 = buf_137.term();
      } sink.propertyNamed("$LineLocation", term_380);Term term_173;
      {
        BufferSink buf_493 = sink.context().makeBuffer(); buf_493.start(_M_STRING); buf_493.literal(1); buf_493.end();
        term_173 = buf_493.term();
      } sink.propertyNamed("$ColumnLocation", term_173);
      sink.start(_M__sTextChars); sink.literal("\u00ab\u00ab");
      sink.end();Term term_27;
      {
        BufferSink buf_247 = sink.context().makeBuffer(); buf_247.start(_M_STRING); buf_247.literal(1); buf_247.end();
        term_27 = buf_247.term();
      } sink.propertyNamed("$LineLocation", term_27);Term term_335;
      {
        BufferSink buf_162 = sink.context().makeBuffer(); buf_162.start(_M_STRING); buf_162.literal(2); buf_162.end();
        term_335 = buf_162.term();
      } sink.propertyNamed("$ColumnLocation", term_335);
      sink.start(_M__sTextCons);Term term_561;
      {
        BufferSink buf_200 = sink.context().makeBuffer(); buf_200.start(_M_STRING); buf_200.literal(1); buf_200.end();
        term_561 = buf_200.term();
      } sink.propertyNamed("$LineLocation", term_561);Term term_9;
      {
        BufferSink buf_356 = sink.context().makeBuffer(); buf_356.start(_M_STRING); buf_356.literal(2); buf_356.end();
        term_9 = buf_356.term();
      } sink.propertyNamed("$ColumnLocation", term_9);
      sink.start(_M__sTextEmbed);Term term_313;
      {
        BufferSink buf_129 = sink.context().makeBuffer(); buf_129.start(_M_STRING); buf_129.literal(1); buf_129.end();
        term_313 = buf_129.term();
      } sink.propertyNamed("$LineLocation", term_313);Term term_99;
      {
        BufferSink buf_352 = sink.context().makeBuffer(); buf_352.start(_M_STRING); buf_352.literal(2); buf_352.end();
        term_99 = buf_352.term();
      } sink.propertyNamed("$ColumnLocation", term_99);
      sink.start(_M_AsText); sink.copy(term_225.ref());
      sink.end();
      sink.end();Term term_436;
      {
        BufferSink buf_378 = sink.context().makeBuffer(); buf_378.start(_M_STRING); buf_378.literal(1); buf_378.end();
        term_436 = buf_378.term();
      } sink.propertyNamed("$LineLocation", term_436);Term term_226;
      {
        BufferSink buf_297 = sink.context().makeBuffer(); buf_297.start(_M_STRING); buf_297.literal(18); buf_297.end();
        term_226 = buf_297.term();
      } sink.propertyNamed("$ColumnLocation", term_226);
      sink.start(_M__sTextCons);Term term_428;
      {
        BufferSink buf_177 = sink.context().makeBuffer(); buf_177.start(_M_STRING); buf_177.literal(1); buf_177.end();
        term_428 = buf_177.term();
      } sink.propertyNamed("$LineLocation", term_428);Term term_133;
      {
        BufferSink buf_134 = sink.context().makeBuffer(); buf_134.start(_M_STRING); buf_134.literal(31); buf_134.end();
        term_133 = buf_134.term();
      } sink.propertyNamed("$ColumnLocation", term_133);
      sink.start(_M__sTextChars); sink.literal("\u00bb\u00bb");
      sink.end();Term term_85;
      {
        BufferSink buf_113 = sink.context().makeBuffer(); buf_113.start(_M_STRING); buf_113.literal(1); buf_113.end();
        term_85 = buf_113.term();
      } sink.propertyNamed("$LineLocation", term_85);Term term_277;
      {
        BufferSink buf_196 = sink.context().makeBuffer(); buf_196.start(_M_STRING); buf_196.literal(32); buf_196.end();
        term_277 = buf_196.term();
      } sink.propertyNamed("$ColumnLocation", term_277);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Embed, term_225);
  } final public static boolean _M_AsText(Sink sink, int shared, int depth, Term term_137) {
    if (depth < 2000) { sink.copy(term_137.ref()); return true;
    }
    return thunk(sink, _M_AsText, term_137);
  } 
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.std.Core.init(context); org.crsx.compiler.std.List.init(context); context.register(_M__sTextChars); context.register(_M__sTextBreak); context.register(_M__sTextIndent); context.register(_M__sTextEmbed); context.register(_M__sTextString); context.register(_M__sTextCons); context.register(_M__sTextNil); context.register(_M_TextToString); context.register(_M_NumberToText); context.register(_M_StringToText); context.register(_M_ReverseTextFold); context.register(_M_TextFold1); context.register(_M_TextFold); context.register(_M_Text_Mangle); context.register(_M_Text_Integer); context.register(_M_Text_QuoteEscape); context.register(_M_Text_Comment); context.register(_M_Text_CommentToken); context.register(_M_Text_Token); context.register(_M_Text_User); context.register(_M_Text_ConcatSep); context.register(_M_Text_Concat); context.register(_M_Text_Text); context.register(_M_Text_String); context.register(_M_Text_Embed); context.register(_M_AsText);
      initialized = true;
    }
  }

/* END MODULE « "/Users/villardl/Projects/crsx/crsx4/src/std/text.crs.java" » */
}