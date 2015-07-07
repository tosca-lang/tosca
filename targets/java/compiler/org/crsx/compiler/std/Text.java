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
  final public static ConstructionDescriptor _M__sTextSeparator = makeData("$TextSeparator");
  final public static ConstructionDescriptor _M__sTextGroup = makeData("$TextGroup");
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
  } final public static boolean _M_NumberToText(Sink sink, int shared, int depth, Term term_26) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_22;
      {
        BufferSink buf = sink.context().makeBuffer(); buf.start(_M_STRING); buf.literal(1); buf.end();
        term_22 = buf.term();
      } sink.propertyNamed("$LineLocation", term_22);Term term_49;
      {
        BufferSink buf_32 = sink.context().makeBuffer(); buf_32.start(_M_STRING); buf_32.literal(1); buf_32.end();
        term_49 = buf_32.term();
      } sink.propertyNamed("$ColumnLocation", term_49);
      sink.start(_M__sTextChars);
      sink.start(_M__s); sink.start(_M_Builtin_sFormatNumber); sink.end(); sink.copy(term_26.ref());
      sink.end();
      sink.end();Term term_15;
      {
        BufferSink buf_41 = sink.context().makeBuffer(); buf_41.start(_M_STRING); buf_41.literal(1); buf_41.end();
        term_15 = buf_41.term();
      } sink.propertyNamed("$LineLocation", term_15);Term term_27;
      {
        BufferSink buf_37 = sink.context().makeBuffer(); buf_37.start(_M_STRING); buf_37.literal(2); buf_37.end();
        term_27 = buf_37.term();
      } sink.propertyNamed("$ColumnLocation", term_27);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_NumberToText, term_26);
  } final public static boolean _M_StringToText(Sink sink, int shared, int depth, Term term_55) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_54;
      {
        BufferSink buf_25 = sink.context().makeBuffer(); buf_25.start(_M_STRING); buf_25.literal(1); buf_25.end();
        term_54 = buf_25.term();
      } sink.propertyNamed("$LineLocation", term_54);Term term_78;
      {
        BufferSink buf_6 = sink.context().makeBuffer(); buf_6.start(_M_STRING); buf_6.literal(1); buf_6.end();
        term_78 = buf_6.term();
      } sink.propertyNamed("$ColumnLocation", term_78);
      sink.start(_M__sTextChars); sink.copy(term_55.ref());
      sink.end();Term term_85;
      {
        BufferSink buf_33 = sink.context().makeBuffer(); buf_33.start(_M_STRING); buf_33.literal(1); buf_33.end();
        term_85 = buf_33.term();
      } sink.propertyNamed("$LineLocation", term_85);Term term_21;
      {
        BufferSink buf_70 = sink.context().makeBuffer(); buf_70.start(_M_STRING); buf_70.literal(2); buf_70.end();
        term_21 = buf_70.term();
      } sink.propertyNamed("$ColumnLocation", term_21);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_StringToText, term_55);
  } final public static boolean _M_ReverseTextFold(Sink sink, int shared, int depth, Term term_75, Term term_7) {
    if (depth < 2000) {
      label: {
        if (term_75.descriptor() != _M__sNil)
        {   break label;
        }
        /* #sep=term *//*Contract*/ sink.start(_M__sTextNil); sink.end(); return true;
      }
      label_73: {
        if (term_75.descriptor() != _M__sCons)
        {   break label_73;
        }Term sub = term_75.sub(0).ref();
        /* #1=sub */Term sub_47 = term_75.sub(1).ref();
        if (sub_47.descriptor() != _M__sNil)
        {   break label_73;
        }
        /* #sep=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed); sink.start(_M_AsText); sink.copy(sub.ref()); sink.end();
        sink.end();Term term_16;
        {
          BufferSink buf_12 = sink.context().makeBuffer(); buf_12.start(_M_STRING); buf_12.literal(1); buf_12.end();
          term_16 = buf_12.term();
        } sink.propertyNamed("$LineLocation", term_16);Term term_76;
        {
          BufferSink buf_61 = sink.context().makeBuffer(); buf_61.start(_M_STRING); buf_61.literal(1); buf_61.end();
          term_76 = buf_61.term();
        } sink.propertyNamed("$ColumnLocation", term_76);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); return true;
      }
      label_89: {
        if (term_75.descriptor() != _M__sCons)
        {   break label_89;
        }Term sub_13 = term_75.sub(0).ref();
        /* #1=sub */Term sub_67 = term_75.sub(1).ref();
        if (sub_67.descriptor() != _M__sCons)
        {   break label_89;
        }Term sub_90 = sub_67.sub(0).ref();
        /* #2=sub */Term sub_57 = sub_67.sub(1).ref();
        /* #s=sub */
        /* #sep=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed);
        sink.start(_M_AsText);
        sink.start(_M_ReverseTextFold);
        sink.start(_M__sCons); sink.copy(sub_90.ref()); sink.copy(sub_57.ref());
        sink.end(); sink.copy(term_7.ref());
        sink.end();
        sink.end();
        sink.end();Term term_180;
        {
          BufferSink buf_5 = sink.context().makeBuffer(); buf_5.start(_M_STRING); buf_5.literal(1); buf_5.end();
          term_180 = buf_5.term();
        } sink.propertyNamed("$LineLocation", term_180);Term term_41;
        {
          BufferSink buf_39 = sink.context().makeBuffer(); buf_39.start(_M_STRING); buf_39.literal(1); buf_39.end();
          term_41 = buf_39.term();
        } sink.propertyNamed("$ColumnLocation", term_41);
        sink.start(_M__sTextCons);Term term_61;
        {
          BufferSink buf_83 = sink.context().makeBuffer(); buf_83.start(_M_STRING); buf_83.literal(1); buf_83.end();
          term_61 = buf_83.term();
        } sink.propertyNamed("$LineLocation", term_61);Term term_97;
        {
          BufferSink buf_99 = sink.context().makeBuffer(); buf_99.start(_M_STRING); buf_99.literal(1); buf_99.end();
          term_97 = buf_99.term();
        } sink.propertyNamed("$ColumnLocation", term_97);
        sink.start(_M__sTextEmbed);Term term_18;
        {
          BufferSink buf_78 = sink.context().makeBuffer(); buf_78.start(_M_STRING); buf_78.literal(1); buf_78.end();
          term_18 = buf_78.term();
        } sink.propertyNamed("$LineLocation", term_18);Term term_88;
        {
          BufferSink buf_19 = sink.context().makeBuffer(); buf_19.start(_M_STRING); buf_19.literal(1); buf_19.end();
          term_88 = buf_19.term();
        } sink.propertyNamed("$ColumnLocation", term_88);
        sink.start(_M_AsText); sink.copy(term_7.ref());
        sink.end();
        sink.end();Term term_11;
        {
          BufferSink buf_38 = sink.context().makeBuffer(); buf_38.start(_M_STRING); buf_38.literal(1); buf_38.end();
          term_11 = buf_38.term();
        } sink.propertyNamed("$LineLocation", term_11);Term term_98;
        {
          BufferSink buf_26 = sink.context().makeBuffer(); buf_26.start(_M_STRING); buf_26.literal(35); buf_26.end();
          term_98 = buf_26.term();
        } sink.propertyNamed("$ColumnLocation", term_98);
        sink.start(_M__sTextCons);Term term_65;
        {
          BufferSink buf_298 = sink.context().makeBuffer(); buf_298.start(_M_STRING); buf_298.literal(1); buf_298.end();
          term_65 = buf_298.term();
        } sink.propertyNamed("$LineLocation", term_65);Term term_89;
        {
          BufferSink buf_44 = sink.context().makeBuffer(); buf_44.start(_M_STRING); buf_44.literal(35); buf_44.end();
          term_89 = buf_44.term();
        } sink.propertyNamed("$ColumnLocation", term_89);
        sink.start(_M__sTextEmbed);Term term_74;
        {
          BufferSink buf_62 = sink.context().makeBuffer(); buf_62.start(_M_STRING); buf_62.literal(1); buf_62.end();
          term_74 = buf_62.term();
        } sink.propertyNamed("$LineLocation", term_74);Term term_84;
        {
          BufferSink buf_48 = sink.context().makeBuffer(); buf_48.start(_M_STRING); buf_48.literal(35); buf_48.end();
          term_84 = buf_48.term();
        } sink.propertyNamed("$ColumnLocation", term_84);
        sink.start(_M_AsText); sink.copy(sub_13.ref());
        sink.end();
        sink.end();Term term_114;
        {
          BufferSink buf_68 = sink.context().makeBuffer(); buf_68.start(_M_STRING); buf_68.literal(1); buf_68.end();
          term_114 = buf_68.term();
        } sink.propertyNamed("$LineLocation", term_114);Term term_117;
        {
          BufferSink buf_86 = sink.context().makeBuffer(); buf_86.start(_M_STRING); buf_86.literal(43); buf_86.end();
          term_117 = buf_86.term();
        } sink.propertyNamed("$ColumnLocation", term_117);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ReverseTextFold, term_75, term_7);
  }  final public static boolean _M_TextFold1(Sink sink, int shared, int depth, Term term_70, Term term_68) {
    if (depth < 2000) {
      label_11: {
        if (term_70.descriptor() != _M__sNil)
        {   break label_11;
        }
        /* #sep=term *//*Contract*/ sink.start(_M__sTextNil); sink.end(); return true;
      }
      label_33: {
        if (term_70.descriptor() != _M__sCons)
        {   break label_33;
        }Term sub_35 = term_70.sub(0).ref();
        /* #1=sub */Term sub_26 = term_70.sub(1).ref();
        /* #s=sub */
        /* #sep=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed); sink.start(_M_AsText); sink.copy(term_68.ref()); sink.end();
        sink.end();Term term_30;
        {
          BufferSink buf_50 = sink.context().makeBuffer(); buf_50.start(_M_STRING); buf_50.literal(1); buf_50.end();
          term_30 = buf_50.term();
        } sink.propertyNamed("$LineLocation", term_30);Term term_10;
        {
          BufferSink buf_11 = sink.context().makeBuffer(); buf_11.start(_M_STRING); buf_11.literal(1); buf_11.end();
          term_10 = buf_11.term();
        } sink.propertyNamed("$ColumnLocation", term_10);
        sink.start(_M__sTextCons);Term term_23;
        {
          BufferSink buf_80 = sink.context().makeBuffer(); buf_80.start(_M_STRING); buf_80.literal(1); buf_80.end();
          term_23 = buf_80.term();
        } sink.propertyNamed("$LineLocation", term_23);Term term_56;
        {
          BufferSink buf_52 = sink.context().makeBuffer(); buf_52.start(_M_STRING); buf_52.literal(1); buf_52.end();
          term_56 = buf_52.term();
        } sink.propertyNamed("$ColumnLocation", term_56);
        sink.start(_M__sTextEmbed);Term term_25;
        {
          BufferSink buf_153 = sink.context().makeBuffer(); buf_153.start(_M_STRING); buf_153.literal(1); buf_153.end();
          term_25 = buf_153.term();
        } sink.propertyNamed("$LineLocation", term_25);Term term_36;
        {
          BufferSink buf_15 = sink.context().makeBuffer(); buf_15.start(_M_STRING); buf_15.literal(1); buf_15.end();
          term_36 = buf_15.term();
        } sink.propertyNamed("$ColumnLocation", term_36);
        sink.start(_M_AsText); sink.copy(sub_35.ref());
        sink.end();
        sink.end();Term term_1;
        {
          BufferSink buf_84 = sink.context().makeBuffer(); buf_84.start(_M_STRING); buf_84.literal(1); buf_84.end();
          term_1 = buf_84.term();
        } sink.propertyNamed("$LineLocation", term_1);Term term_183;
        {
          BufferSink buf_75 = sink.context().makeBuffer(); buf_75.start(_M_STRING); buf_75.literal(9); buf_75.end();
          term_183 = buf_75.term();
        } sink.propertyNamed("$ColumnLocation", term_183);
        sink.start(_M__sTextCons);Term term_296;
        {
          BufferSink buf_163 = sink.context().makeBuffer(); buf_163.start(_M_STRING); buf_163.literal(1); buf_163.end();
          term_296 = buf_163.term();
        } sink.propertyNamed("$LineLocation", term_296);Term term_93;
        {
          BufferSink buf_154 = sink.context().makeBuffer(); buf_154.start(_M_STRING); buf_154.literal(9); buf_154.end();
          term_93 = buf_154.term();
        } sink.propertyNamed("$ColumnLocation", term_93);
        sink.start(_M__sTextEmbed);Term term_90;
        {
          BufferSink buf_199 = sink.context().makeBuffer(); buf_199.start(_M_STRING); buf_199.literal(1); buf_199.end();
          term_90 = buf_199.term();
        } sink.propertyNamed("$LineLocation", term_90);Term term_4;
        {
          BufferSink buf_63 = sink.context().makeBuffer(); buf_63.start(_M_STRING); buf_63.literal(9); buf_63.end();
          term_4 = buf_63.term();
        } sink.propertyNamed("$ColumnLocation", term_4);
        sink.start(_M_AsText);
        sink.start(_M_TextFold1); sink.copy(sub_26.ref()); sink.copy(term_68.ref());
        sink.end();
        sink.end();
        sink.end();Term term_32;
        {
          BufferSink buf_87 = sink.context().makeBuffer(); buf_87.start(_M_STRING); buf_87.literal(1); buf_87.end();
          term_32 = buf_87.term();
        } sink.propertyNamed("$LineLocation", term_32);Term term_9;
        {
          BufferSink buf_66 = sink.context().makeBuffer(); buf_66.start(_M_STRING); buf_66.literal(15); buf_66.end();
          term_9 = buf_66.term();
        } sink.propertyNamed("$ColumnLocation", term_9);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_TextFold1, term_70, term_68);
  }  final public static boolean _M_TextFold(Sink sink, int shared, int depth, Term term_77, Term term_20) {
    if (depth < 2000) {
      label_40: {
        if (term_77.descriptor() != _M__sNil)
        {   break label_40;
        }
        /* #sep=term *//*Contract*/ sink.start(_M__sTextNil); sink.end(); return true;
      }
      label_36: {
        if (term_77.descriptor() != _M__sCons)
        {   break label_36;
        }Term sub_54 = term_77.sub(0).ref();
        /* #1=sub */Term sub_25 = term_77.sub(1).ref();
        /* #s=sub */
        /* #sep=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed); sink.start(_M_AsText); sink.copy(term_20.ref()); sink.end();
        sink.end();Term term_48;
        {
          BufferSink buf_79 = sink.context().makeBuffer(); buf_79.start(_M_STRING); buf_79.literal(1); buf_79.end();
          term_48 = buf_79.term();
        } sink.propertyNamed("$LineLocation", term_48);Term term_33;
        {
          BufferSink buf_34 = sink.context().makeBuffer(); buf_34.start(_M_STRING); buf_34.literal(1); buf_34.end();
          term_33 = buf_34.term();
        } sink.propertyNamed("$ColumnLocation", term_33);
        sink.start(_M__sTextCons);Term term_2;
        {
          BufferSink buf_74 = sink.context().makeBuffer(); buf_74.start(_M_STRING); buf_74.literal(1); buf_74.end();
          term_2 = buf_74.term();
        } sink.propertyNamed("$LineLocation", term_2);Term term_62;
        {
          BufferSink buf_145 = sink.context().makeBuffer(); buf_145.start(_M_STRING); buf_145.literal(1); buf_145.end();
          term_62 = buf_145.term();
        } sink.propertyNamed("$ColumnLocation", term_62);
        sink.start(_M__sTextEmbed);Term term_86;
        {
          BufferSink buf_22 = sink.context().makeBuffer(); buf_22.start(_M_STRING); buf_22.literal(1); buf_22.end();
          term_86 = buf_22.term();
        } sink.propertyNamed("$LineLocation", term_86);Term term_144;
        {
          BufferSink buf_89 = sink.context().makeBuffer(); buf_89.start(_M_STRING); buf_89.literal(1); buf_89.end();
          term_144 = buf_89.term();
        } sink.propertyNamed("$ColumnLocation", term_144);
        sink.start(_M_AsText); sink.copy(sub_54.ref());
        sink.end();
        sink.end();Term term_153;
        {
          BufferSink buf_149 = sink.context().makeBuffer(); buf_149.start(_M_STRING); buf_149.literal(1); buf_149.end();
          term_153 = buf_149.term();
        } sink.propertyNamed("$LineLocation", term_153);Term term_38;
        {
          BufferSink buf_51 = sink.context().makeBuffer(); buf_51.start(_M_STRING); buf_51.literal(9); buf_51.end();
          term_38 = buf_51.term();
        } sink.propertyNamed("$ColumnLocation", term_38);
        sink.start(_M__sTextCons);Term term_293;
        {
          BufferSink buf_76 = sink.context().makeBuffer(); buf_76.start(_M_STRING); buf_76.literal(1); buf_76.end();
          term_293 = buf_76.term();
        } sink.propertyNamed("$LineLocation", term_293);Term term_221;
        {
          BufferSink buf_65 = sink.context().makeBuffer(); buf_65.start(_M_STRING); buf_65.literal(9); buf_65.end();
          term_221 = buf_65.term();
        } sink.propertyNamed("$ColumnLocation", term_221);
        sink.start(_M__sTextEmbed);Term term_185;
        {
          BufferSink buf_150 = sink.context().makeBuffer(); buf_150.start(_M_STRING); buf_150.literal(1); buf_150.end();
          term_185 = buf_150.term();
        } sink.propertyNamed("$LineLocation", term_185);Term term_13;
        {
          BufferSink buf_72 = sink.context().makeBuffer(); buf_72.start(_M_STRING); buf_72.literal(9); buf_72.end();
          term_13 = buf_72.term();
        } sink.propertyNamed("$ColumnLocation", term_13);
        sink.start(_M_AsText);
        sink.start(_M_TextFold1); sink.copy(sub_25.ref()); sink.copy(term_20.ref());
        sink.end();
        sink.end();
        sink.end();Term term_52;
        {
          BufferSink buf_16 = sink.context().makeBuffer(); buf_16.start(_M_STRING); buf_16.literal(1); buf_16.end();
          term_52 = buf_16.term();
        } sink.propertyNamed("$LineLocation", term_52);Term term_37;
        {
          BufferSink buf_10 = sink.context().makeBuffer(); buf_10.start(_M_STRING); buf_10.literal(15); buf_10.end();
          term_37 = buf_10.term();
        } sink.propertyNamed("$ColumnLocation", term_37);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_TextFold, term_77, term_20);
  }  final public static boolean _M_Text_Mangle(Sink sink, int shared, int depth, Term term_67) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_46;
      {
        BufferSink buf_158 = sink.context().makeBuffer(); buf_158.start(_M_STRING); buf_158.literal(1); buf_158.end();
        term_46 = buf_158.term();
      } sink.propertyNamed("$LineLocation", term_46);Term term_124;
      {
        BufferSink buf_59 = sink.context().makeBuffer(); buf_59.start(_M_STRING); buf_59.literal(1); buf_59.end();
        term_124 = buf_59.term();
      } sink.propertyNamed("$ColumnLocation", term_124);
      sink.start(_M__sTextChars);
      sink.start(_M__s); sink.start(_M_Builtin_sMangle); sink.end(); sink.copy(term_67.ref());
      sink.end();
      sink.end();Term term_71;
      {
        BufferSink buf_69 = sink.context().makeBuffer(); buf_69.start(_M_STRING); buf_69.literal(1); buf_69.end();
        term_71 = buf_69.term();
      } sink.propertyNamed("$LineLocation", term_71);Term term_6;
      {
        BufferSink buf_95 = sink.context().makeBuffer(); buf_95.start(_M_STRING); buf_95.literal(2); buf_95.end();
        term_6 = buf_95.term();
      } sink.propertyNamed("$ColumnLocation", term_6);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Mangle, term_67);
  } final public static boolean _M_Text_Integer(Sink sink, int shared, int depth, Term term_44) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_204;
      {
        BufferSink buf_157 = sink.context().makeBuffer(); buf_157.start(_M_STRING); buf_157.literal(1); buf_157.end();
        term_204 = buf_157.term();
      } sink.propertyNamed("$LineLocation", term_204);Term term_208;
      {
        BufferSink buf_30 = sink.context().makeBuffer(); buf_30.start(_M_STRING); buf_30.literal(1); buf_30.end();
        term_208 = buf_30.term();
      } sink.propertyNamed("$ColumnLocation", term_208);
      sink.start(_M__sTextChars);
      sink.start(_M__s); sink.start(_M_Builtin_sFormatNumber); sink.end(); sink.copy(term_44.ref());
      sink.end();
      sink.end();Term term_110;
      {
        BufferSink buf_31 = sink.context().makeBuffer(); buf_31.start(_M_STRING); buf_31.literal(1); buf_31.end();
        term_110 = buf_31.term();
      } sink.propertyNamed("$LineLocation", term_110);Term term_92;
      {
        BufferSink buf_49 = sink.context().makeBuffer(); buf_49.start(_M_STRING); buf_49.literal(2); buf_49.end();
        term_92 = buf_49.term();
      } sink.propertyNamed("$ColumnLocation", term_92);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Integer, term_44);
  } final public static boolean _M_Text_QuoteEscape(Sink sink, int shared, int depth, Term term_192) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_135;
      {
        BufferSink buf_96 = sink.context().makeBuffer(); buf_96.start(_M_STRING); buf_96.literal(1); buf_96.end();
        term_135 = buf_96.term();
      } sink.propertyNamed("$LineLocation", term_135);Term term_57;
      {
        BufferSink buf_54 = sink.context().makeBuffer(); buf_54.start(_M_STRING); buf_54.literal(1); buf_54.end();
        term_57 = buf_54.term();
      } sink.propertyNamed("$ColumnLocation", term_57);
      sink.start(_M__sTextChars);
      sink.start(_M__s); sink.start(_M_Builtin_sEscape); sink.end(); sink.copy(term_192.ref());
      sink.end();
      sink.end();Term term_66;
      {
        BufferSink buf_128 = sink.context().makeBuffer(); buf_128.start(_M_STRING); buf_128.literal(1); buf_128.end();
        term_66 = buf_128.term();
      } sink.propertyNamed("$LineLocation", term_66);Term term_170;
      {
        BufferSink buf_58 = sink.context().makeBuffer(); buf_58.start(_M_STRING); buf_58.literal(2); buf_58.end();
        term_170 = buf_58.term();
      } sink.propertyNamed("$ColumnLocation", term_170);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_QuoteEscape, term_192);
  } final public static boolean _M_Text_Comment(Sink sink, int shared, int depth, Term term_81) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_31;
      {
        BufferSink buf_242 = sink.context().makeBuffer(); buf_242.start(_M_STRING); buf_242.literal(1); buf_242.end();
        term_31 = buf_242.term();
      } sink.propertyNamed("$LineLocation", term_31);Term term_235;
      {
        BufferSink buf_102 = sink.context().makeBuffer(); buf_102.start(_M_STRING); buf_102.literal(1); buf_102.end();
        term_235 = buf_102.term();
      } sink.propertyNamed("$ColumnLocation", term_235);
      sink.start(_M__sTextChars);
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("/*");
      sink.start(_M__s); sink.start(_M_Builtin_sReplace); sink.end(); sink.copy(term_81.ref()); sink.literal("*/"); sink.literal("*_/");
      sink.end(); sink.literal("*/");
      sink.end();
      sink.end();Term term_212;
      {
        BufferSink buf_121 = sink.context().makeBuffer(); buf_121.start(_M_STRING); buf_121.literal(1); buf_121.end();
        term_212 = buf_121.term();
      } sink.propertyNamed("$LineLocation", term_212);Term term_186;
      {
        BufferSink buf_71 = sink.context().makeBuffer(); buf_71.start(_M_STRING); buf_71.literal(2); buf_71.end();
        term_186 = buf_71.term();
      } sink.propertyNamed("$ColumnLocation", term_186);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Comment, term_81);
  } final public static boolean _M_Text_CommentToken(Sink sink, int shared, int depth, Term term_166) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_130;
      {
        BufferSink buf_3 = sink.context().makeBuffer(); buf_3.start(_M_STRING); buf_3.literal(1); buf_3.end();
        term_130 = buf_3.term();
      } sink.propertyNamed("$LineLocation", term_130);Term term_109;
      {
        BufferSink buf_53 = sink.context().makeBuffer(); buf_53.start(_M_STRING); buf_53.literal(1); buf_53.end();
        term_109 = buf_53.term();
      } sink.propertyNamed("$ColumnLocation", term_109);
      sink.start(_M__sTextChars);
      sink.start(_M__s); sink.start(_M_Builtin_sReplace); sink.end(); sink.copy(term_166.ref()); sink.literal("*/"); sink.literal("*_/");
      sink.end();
      sink.end();Term term_12;
      {
        BufferSink buf_81 = sink.context().makeBuffer(); buf_81.start(_M_STRING); buf_81.literal(1); buf_81.end();
        term_12 = buf_81.term();
      } sink.propertyNamed("$LineLocation", term_12);Term term_275;
      {
        BufferSink buf_104 = sink.context().makeBuffer(); buf_104.start(_M_STRING); buf_104.literal(2); buf_104.end();
        term_275 = buf_104.term();
      } sink.propertyNamed("$ColumnLocation", term_275);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_CommentToken, term_166);
  } final public static boolean _M_Text_Token(Sink sink, int shared, int depth, Term term_0) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_35;
      {
        BufferSink buf_67 = sink.context().makeBuffer(); buf_67.start(_M_STRING); buf_67.literal(1); buf_67.end();
        term_35 = buf_67.term();
      } sink.propertyNamed("$LineLocation", term_35);Term term_79;
      {
        BufferSink buf_29 = sink.context().makeBuffer(); buf_29.start(_M_STRING); buf_29.literal(1); buf_29.end();
        term_79 = buf_29.term();
      } sink.propertyNamed("$ColumnLocation", term_79);
      sink.start(_M__sTextChars); sink.copy(term_0.ref());
      sink.end();Term term_50;
      {
        BufferSink buf_8 = sink.context().makeBuffer(); buf_8.start(_M_STRING); buf_8.literal(1); buf_8.end();
        term_50 = buf_8.term();
      } sink.propertyNamed("$LineLocation", term_50);Term term_73;
      {
        BufferSink buf_291 = sink.context().makeBuffer(); buf_291.start(_M_STRING); buf_291.literal(2); buf_291.end();
        term_73 = buf_291.term();
      } sink.propertyNamed("$ColumnLocation", term_73);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Token, term_0);
  } final public static boolean _M_Text_User(Sink sink, int shared, int depth, Term term_401, Term term_14) {
    if (depth < 2000) {
      sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal("%"); sink.end();Term term_82;
      {
        BufferSink buf_186 = sink.context().makeBuffer(); buf_186.start(_M_STRING); buf_186.literal(1); buf_186.end();
        term_82 = buf_186.term();
      } sink.propertyNamed("$LineLocation", term_82);Term term_291;
      {
        BufferSink buf_235 = sink.context().makeBuffer(); buf_235.start(_M_STRING); buf_235.literal(1); buf_235.end();
        term_291 = buf_235.term();
      } sink.propertyNamed("$ColumnLocation", term_291);
      sink.start(_M__sTextCons);Term term_94;
      {
        BufferSink buf_85 = sink.context().makeBuffer(); buf_85.start(_M_STRING); buf_85.literal(1); buf_85.end();
        term_94 = buf_85.term();
      } sink.propertyNamed("$LineLocation", term_94);Term term_163;
      {
        BufferSink buf_4 = sink.context().makeBuffer(); buf_4.start(_M_STRING); buf_4.literal(2); buf_4.end();
        term_163 = buf_4.term();
      } sink.propertyNamed("$ColumnLocation", term_163);
      sink.start(_M__sTextChars); sink.copy(term_401.ref());
      sink.end();Term term_40;
      {
        BufferSink buf_130 = sink.context().makeBuffer(); buf_130.start(_M_STRING); buf_130.literal(1); buf_130.end();
        term_40 = buf_130.term();
      } sink.propertyNamed("$LineLocation", term_40);Term term_5;
      {
        BufferSink buf_73 = sink.context().makeBuffer(); buf_73.start(_M_STRING); buf_73.literal(3); buf_73.end();
        term_5 = buf_73.term();
      } sink.propertyNamed("$ColumnLocation", term_5);
      sink.start(_M__sTextCons);Term term_160;
      {
        BufferSink buf_125 = sink.context().makeBuffer(); buf_125.start(_M_STRING); buf_125.literal(1); buf_125.end();
        term_160 = buf_125.term();
      } sink.propertyNamed("$LineLocation", term_160);Term term_286;
      {
        BufferSink buf_189 = sink.context().makeBuffer(); buf_189.start(_M_STRING); buf_189.literal(17); buf_189.end();
        term_286 = buf_189.term();
      } sink.propertyNamed("$ColumnLocation", term_286);
      sink.start(_M__sTextChars); sink.literal("\u27e6\u27e6");
      sink.end();Term term_122;
      {
        BufferSink buf_7 = sink.context().makeBuffer(); buf_7.start(_M_STRING); buf_7.literal(1); buf_7.end();
        term_122 = buf_7.term();
      } sink.propertyNamed("$LineLocation", term_122);Term term_165;
      {
        BufferSink buf_57 = sink.context().makeBuffer(); buf_57.start(_M_STRING); buf_57.literal(18); buf_57.end();
        term_165 = buf_57.term();
      } sink.propertyNamed("$ColumnLocation", term_165);
      sink.start(_M__sTextCons);Term term_63;
      {
        BufferSink buf_172 = sink.context().makeBuffer(); buf_172.start(_M_STRING); buf_172.literal(1); buf_172.end();
        term_63 = buf_172.term();
      } sink.propertyNamed("$LineLocation", term_63);Term term_276;
      {
        BufferSink buf_14 = sink.context().makeBuffer(); buf_14.start(_M_STRING); buf_14.literal(18); buf_14.end();
        term_276 = buf_14.term();
      } sink.propertyNamed("$ColumnLocation", term_276);
      sink.start(_M__sTextEmbed);Term term_133;
      {
        BufferSink buf_197 = sink.context().makeBuffer(); buf_197.start(_M_STRING); buf_197.literal(1); buf_197.end();
        term_133 = buf_197.term();
      } sink.propertyNamed("$LineLocation", term_133);Term term_29;
      {
        BufferSink buf_45 = sink.context().makeBuffer(); buf_45.start(_M_STRING); buf_45.literal(18); buf_45.end();
        term_29 = buf_45.term();
      } sink.propertyNamed("$ColumnLocation", term_29);
      sink.start(_M_AsText); sink.copy(term_14.ref());
      sink.end();
      sink.end();Term term_42;
      {
        BufferSink buf_198 = sink.context().makeBuffer(); buf_198.start(_M_STRING); buf_198.literal(1); buf_198.end();
        term_42 = buf_198.term();
      } sink.propertyNamed("$LineLocation", term_42);Term term_159;
      {
        BufferSink buf_9 = sink.context().makeBuffer(); buf_9.start(_M_STRING); buf_9.literal(34); buf_9.end();
        term_159 = buf_9.term();
      } sink.propertyNamed("$ColumnLocation", term_159);
      sink.start(_M__sTextCons);Term term_107;
      {
        BufferSink buf_60 = sink.context().makeBuffer(); buf_60.start(_M_STRING); buf_60.literal(1); buf_60.end();
        term_107 = buf_60.term();
      } sink.propertyNamed("$LineLocation", term_107);Term term_244;
      {
        BufferSink buf_160 = sink.context().makeBuffer(); buf_160.start(_M_STRING); buf_160.literal(47); buf_160.end();
        term_244 = buf_160.term();
      } sink.propertyNamed("$ColumnLocation", term_244);
      sink.start(_M__sTextChars); sink.literal("\u27e7\u27e7");
      sink.end();Term term_45;
      {
        BufferSink buf_13 = sink.context().makeBuffer(); buf_13.start(_M_STRING); buf_13.literal(1); buf_13.end();
        term_45 = buf_13.term();
      } sink.propertyNamed("$LineLocation", term_45);Term term_120;
      {
        BufferSink buf_292 = sink.context().makeBuffer(); buf_292.start(_M_STRING); buf_292.literal(48); buf_292.end();
        term_120 = buf_292.term();
      } sink.propertyNamed("$ColumnLocation", term_120);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end();
      sink.end();
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_User, term_401, term_14);
  }  final public static boolean _M_Text_ConcatSep(Sink sink, int shared, int depth, Term term_136, Term term_158) {
    if (depth < 2000) {
      label_82: {
        if (term_136.descriptor() != _M__sNil)
        {   break label_82;
        }
        /* #sep=term *//*Contract*/ sink.start(_M__sTextNil); sink.end(); return true;
      }
      label_0: {
        if (term_136.descriptor() != _M__sCons)
        {   break label_0;
        }Term sub_7 = term_136.sub(0).ref();
        /* #t1=sub */Term sub_2 = term_136.sub(1).ref();
        if (sub_2.descriptor() != _M__sNil)
        {   break label_0;
        }
        /* #sep=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed); sink.start(_M_AsText); sink.copy(sub_7.ref()); sink.end();
        sink.end();Term term_156;
        {
          BufferSink buf_269 = sink.context().makeBuffer(); buf_269.start(_M_STRING); buf_269.literal(1); buf_269.end();
          term_156 = buf_269.term();
        } sink.propertyNamed("$LineLocation", term_156);Term term_83;
        {
          BufferSink buf_27 = sink.context().makeBuffer(); buf_27.start(_M_STRING); buf_27.literal(1); buf_27.end();
          term_83 = buf_27.term();
        } sink.propertyNamed("$ColumnLocation", term_83);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); return true;
      }
      label_8: {
        if (term_136.descriptor() != _M__sCons)
        {   break label_8;
        }Term sub_63 = term_136.sub(0).ref();
        /* #t1=sub */Term sub_86 = term_136.sub(1).ref();
        if (sub_86.descriptor() != _M__sCons)
        {   break label_8;
        }Term sub_19 = sub_86.sub(0).ref();
        /* #t2=sub */Term sub_82 = sub_86.sub(1).ref();
        /* #ts=sub */
        /* #sep=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed); sink.start(_M_AsText); sink.copy(sub_63.ref()); sink.end();
        sink.end();Term term_8;
        {
          BufferSink buf_193 = sink.context().makeBuffer(); buf_193.start(_M_STRING); buf_193.literal(1); buf_193.end();
          term_8 = buf_193.term();
        } sink.propertyNamed("$LineLocation", term_8);Term term_241;
        {
          BufferSink buf_21 = sink.context().makeBuffer(); buf_21.start(_M_STRING); buf_21.literal(1); buf_21.end();
          term_241 = buf_21.term();
        } sink.propertyNamed("$ColumnLocation", term_241);
        sink.start(_M__sTextCons);Term term_148;
        {
          BufferSink buf_55 = sink.context().makeBuffer(); buf_55.start(_M_STRING); buf_55.literal(1); buf_55.end();
          term_148 = buf_55.term();
        } sink.propertyNamed("$LineLocation", term_148);Term term_58;
        {
          BufferSink buf_17 = sink.context().makeBuffer(); buf_17.start(_M_STRING); buf_17.literal(1); buf_17.end();
          term_58 = buf_17.term();
        } sink.propertyNamed("$ColumnLocation", term_58);
        sink.start(_M__sTextEmbed);Term term_263;
        {
          BufferSink buf_64 = sink.context().makeBuffer(); buf_64.start(_M_STRING); buf_64.literal(1); buf_64.end();
          term_263 = buf_64.term();
        } sink.propertyNamed("$LineLocation", term_263);Term term_210;
        {
          BufferSink buf_124 = sink.context().makeBuffer(); buf_124.start(_M_STRING); buf_124.literal(1); buf_124.end();
          term_210 = buf_124.term();
        } sink.propertyNamed("$ColumnLocation", term_210);
        sink.start(_M_AsText); sink.copy(term_158.ref());
        sink.end();
        sink.end();Term term_131;
        {
          BufferSink buf_28 = sink.context().makeBuffer(); buf_28.start(_M_STRING); buf_28.literal(1); buf_28.end();
          term_131 = buf_28.term();
        } sink.propertyNamed("$LineLocation", term_131);Term term_91;
        {
          BufferSink buf_200 = sink.context().makeBuffer(); buf_200.start(_M_STRING); buf_200.literal(6); buf_200.end();
          term_91 = buf_200.term();
        } sink.propertyNamed("$ColumnLocation", term_91);
        sink.start(_M__sTextCons);Term term_190;
        {
          BufferSink buf_36 = sink.context().makeBuffer(); buf_36.start(_M_STRING); buf_36.literal(1); buf_36.end();
          term_190 = buf_36.term();
        } sink.propertyNamed("$LineLocation", term_190);Term term_164;
        {
          BufferSink buf_98 = sink.context().makeBuffer(); buf_98.start(_M_STRING); buf_98.literal(6); buf_98.end();
          term_164 = buf_98.term();
        } sink.propertyNamed("$ColumnLocation", term_164);
        sink.start(_M__sTextEmbed);Term term_108;
        {
          BufferSink buf_171 = sink.context().makeBuffer(); buf_171.start(_M_STRING); buf_171.literal(1); buf_171.end();
          term_108 = buf_171.term();
        } sink.propertyNamed("$LineLocation", term_108);Term term_47;
        {
          BufferSink buf_180 = sink.context().makeBuffer(); buf_180.start(_M_STRING); buf_180.literal(6); buf_180.end();
          term_47 = buf_180.term();
        } sink.propertyNamed("$ColumnLocation", term_47);
        sink.start(_M_AsText);
        sink.start(_M_Text_ConcatSep);
        sink.start(_M__sCons); sink.copy(sub_19.ref()); sink.copy(sub_82.ref());
        sink.end(); sink.copy(term_158.ref());
        sink.end();
        sink.end();
        sink.end();Term term_96;
        {
          BufferSink buf_174 = sink.context().makeBuffer(); buf_174.start(_M_STRING); buf_174.literal(1); buf_174.end();
          term_96 = buf_174.term();
        } sink.propertyNamed("$LineLocation", term_96);Term term_178;
        {
          BufferSink buf_136 = sink.context().makeBuffer();
          buf_136.start(_M_STRING); buf_136.literal(12);
          buf_136.end();
          term_178 = buf_136.term();
        } sink.propertyNamed("$ColumnLocation", term_178);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Text_ConcatSep, term_136, term_158);
  }  final public static boolean _M_Text_Concat(Sink sink, int shared, int depth, Term term_174) {
    if (depth < 2000) {
      sink.start(_M_Text_ConcatSep); sink.copy(term_174.ref()); sink.start(_M__sTextNil); sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Concat, term_174);
  } final public static boolean _M_Text_Text(Sink sink, int shared, int depth, Term term_339) {
    if (depth < 2000) {
      sink.start(_M_Text_User); sink.literal("n"); sink.copy(term_339.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Text, term_339);
  } final public static boolean _M_Text_String(Sink sink, int shared, int depth, Term term_385) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_266;
      {
        BufferSink buf_164 = sink.context().makeBuffer(); buf_164.start(_M_STRING); buf_164.literal(1); buf_164.end();
        term_266 = buf_164.term();
      } sink.propertyNamed("$LineLocation", term_266);Term term_224;
      {
        BufferSink buf_111 = sink.context().makeBuffer(); buf_111.start(_M_STRING); buf_111.literal(1); buf_111.end();
        term_224 = buf_111.term();
      } sink.propertyNamed("$ColumnLocation", term_224);
      sink.start(_M__sTextChars); sink.literal("\u2020\u2020");
      sink.end();Term term_17;
      {
        BufferSink buf_299 = sink.context().makeBuffer(); buf_299.start(_M_STRING); buf_299.literal(1); buf_299.end();
        term_17 = buf_299.term();
      } sink.propertyNamed("$LineLocation", term_17);Term term_141;
      {
        BufferSink buf_92 = sink.context().makeBuffer(); buf_92.start(_M_STRING); buf_92.literal(2); buf_92.end();
        term_141 = buf_92.term();
      } sink.propertyNamed("$ColumnLocation", term_141);
      sink.start(_M__sTextCons);Term term_217;
      {
        BufferSink buf_88 = sink.context().makeBuffer(); buf_88.start(_M_STRING); buf_88.literal(1); buf_88.end();
        term_217 = buf_88.term();
      } sink.propertyNamed("$LineLocation", term_217);Term term_268;
      {
        BufferSink buf_265 = sink.context().makeBuffer(); buf_265.start(_M_STRING); buf_265.literal(18); buf_265.end();
        term_268 = buf_265.term();
      } sink.propertyNamed("$ColumnLocation", term_268);
      sink.start(_M__sTextChars); sink.literal("\u00ab\u00ab");
      sink.end();Term term_126;
      {
        BufferSink buf_176 = sink.context().makeBuffer(); buf_176.start(_M_STRING); buf_176.literal(1); buf_176.end();
        term_126 = buf_176.term();
      } sink.propertyNamed("$LineLocation", term_126);Term term_280;
      {
        BufferSink buf_0 = sink.context().makeBuffer(); buf_0.start(_M_STRING); buf_0.literal(19); buf_0.end();
        term_280 = buf_0.term();
      } sink.propertyNamed("$ColumnLocation", term_280);
      sink.start(_M__sTextCons);Term term_179;
      {
        BufferSink buf_82 = sink.context().makeBuffer(); buf_82.start(_M_STRING); buf_82.literal(1); buf_82.end();
        term_179 = buf_82.term();
      } sink.propertyNamed("$LineLocation", term_179);Term term_259;
      {
        BufferSink buf_23 = sink.context().makeBuffer(); buf_23.start(_M_STRING); buf_23.literal(19); buf_23.end();
        term_259 = buf_23.term();
      } sink.propertyNamed("$ColumnLocation", term_259);
      sink.start(_M__sTextEmbed);Term term_34;
      {
        BufferSink buf_118 = sink.context().makeBuffer(); buf_118.start(_M_STRING); buf_118.literal(1); buf_118.end();
        term_34 = buf_118.term();
      } sink.propertyNamed("$LineLocation", term_34);Term term_129;
      {
        BufferSink buf_177 = sink.context().makeBuffer(); buf_177.start(_M_STRING); buf_177.literal(19); buf_177.end();
        term_129 = buf_177.term();
      } sink.propertyNamed("$ColumnLocation", term_129);
      sink.start(_M_AsText); sink.copy(term_385.ref());
      sink.end();
      sink.end();Term term_101;
      {
        BufferSink buf_447 = sink.context().makeBuffer(); buf_447.start(_M_STRING); buf_447.literal(1); buf_447.end();
        term_101 = buf_447.term();
      } sink.propertyNamed("$LineLocation", term_101);Term term_102;
      {
        BufferSink buf_498 = sink.context().makeBuffer(); buf_498.start(_M_STRING); buf_498.literal(35); buf_498.end();
        term_102 = buf_498.term();
      } sink.propertyNamed("$ColumnLocation", term_102);
      sink.start(_M__sTextCons);Term term_214;
      {
        BufferSink buf_481 = sink.context().makeBuffer(); buf_481.start(_M_STRING); buf_481.literal(1); buf_481.end();
        term_214 = buf_481.term();
      } sink.propertyNamed("$LineLocation", term_214);Term term_116;
      {
        BufferSink buf_264 = sink.context().makeBuffer(); buf_264.start(_M_STRING); buf_264.literal(48); buf_264.end();
        term_116 = buf_264.term();
      } sink.propertyNamed("$ColumnLocation", term_116);
      sink.start(_M__sTextChars); sink.literal("\u00bb\u00bb");
      sink.end();Term term_188;
      {
        BufferSink buf_18 = sink.context().makeBuffer(); buf_18.start(_M_STRING); buf_18.literal(1); buf_18.end();
        term_188 = buf_18.term();
      } sink.propertyNamed("$LineLocation", term_188);Term term_184;
      {
        BufferSink buf_90 = sink.context().makeBuffer(); buf_90.start(_M_STRING); buf_90.literal(49); buf_90.end();
        term_184 = buf_90.term();
      } sink.propertyNamed("$ColumnLocation", term_184);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end();
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_String, term_385);
  } final public static boolean _M_Text_Embed(Sink sink, int shared, int depth, Term term_3) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_243;
      {
        BufferSink buf_134 = sink.context().makeBuffer(); buf_134.start(_M_STRING); buf_134.literal(1); buf_134.end();
        term_243 = buf_134.term();
      } sink.propertyNamed("$LineLocation", term_243);Term term_337;
      {
        BufferSink buf_181 = sink.context().makeBuffer(); buf_181.start(_M_STRING); buf_181.literal(1); buf_181.end();
        term_337 = buf_181.term();
      } sink.propertyNamed("$ColumnLocation", term_337);
      sink.start(_M__sTextChars); sink.literal("\u00ab\u00ab");
      sink.end();Term term_194;
      {
        BufferSink buf_347 = sink.context().makeBuffer(); buf_347.start(_M_STRING); buf_347.literal(1); buf_347.end();
        term_194 = buf_347.term();
      } sink.propertyNamed("$LineLocation", term_194);Term term_481;
      {
        BufferSink buf_113 = sink.context().makeBuffer(); buf_113.start(_M_STRING); buf_113.literal(2); buf_113.end();
        term_481 = buf_113.term();
      } sink.propertyNamed("$ColumnLocation", term_481);
      sink.start(_M__sTextCons);Term term_151;
      {
        BufferSink buf_314 = sink.context().makeBuffer(); buf_314.start(_M_STRING); buf_314.literal(1); buf_314.end();
        term_151 = buf_314.term();
      } sink.propertyNamed("$LineLocation", term_151);Term term_209;
      {
        BufferSink buf_42 = sink.context().makeBuffer(); buf_42.start(_M_STRING); buf_42.literal(2); buf_42.end();
        term_209 = buf_42.term();
      } sink.propertyNamed("$ColumnLocation", term_209);
      sink.start(_M__sTextEmbed);Term term_99;
      {
        BufferSink buf_191 = sink.context().makeBuffer(); buf_191.start(_M_STRING); buf_191.literal(1); buf_191.end();
        term_99 = buf_191.term();
      } sink.propertyNamed("$LineLocation", term_99);Term term_43;
      {
        BufferSink buf_259 = sink.context().makeBuffer(); buf_259.start(_M_STRING); buf_259.literal(2); buf_259.end();
        term_43 = buf_259.term();
      } sink.propertyNamed("$ColumnLocation", term_43);
      sink.start(_M_AsText); sink.copy(term_3.ref());
      sink.end();
      sink.end();Term term_518;
      {
        BufferSink buf_187 = sink.context().makeBuffer(); buf_187.start(_M_STRING); buf_187.literal(1); buf_187.end();
        term_518 = buf_187.term();
      } sink.propertyNamed("$LineLocation", term_518);Term term_347;
      {
        BufferSink buf_273 = sink.context().makeBuffer(); buf_273.start(_M_STRING); buf_273.literal(18); buf_273.end();
        term_347 = buf_273.term();
      } sink.propertyNamed("$ColumnLocation", term_347);
      sink.start(_M__sTextCons);Term term_198;
      {
        BufferSink buf_140 = sink.context().makeBuffer(); buf_140.start(_M_STRING); buf_140.literal(1); buf_140.end();
        term_198 = buf_140.term();
      } sink.propertyNamed("$LineLocation", term_198);Term term_169;
      {
        BufferSink buf_56 = sink.context().makeBuffer(); buf_56.start(_M_STRING); buf_56.literal(31); buf_56.end();
        term_169 = buf_56.term();
      } sink.propertyNamed("$ColumnLocation", term_169);
      sink.start(_M__sTextChars); sink.literal("\u00bb\u00bb");
      sink.end();Term term_24;
      {
        BufferSink buf_195 = sink.context().makeBuffer(); buf_195.start(_M_STRING); buf_195.literal(1); buf_195.end();
        term_24 = buf_195.term();
      } sink.propertyNamed("$LineLocation", term_24);Term term_202;
      {
        BufferSink buf_221 = sink.context().makeBuffer(); buf_221.start(_M_STRING); buf_221.literal(32); buf_221.end();
        term_202 = buf_221.term();
      } sink.propertyNamed("$ColumnLocation", term_202);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Embed, term_3);
  } final public static boolean _M_AsText(Sink sink, int shared, int depth, Term term_161) {
    if (depth < 2000) { sink.copy(term_161.ref()); return true;
    }
    return thunk(sink, _M_AsText, term_161);
  } 
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.std.Core.init(context); org.crsx.compiler.std.List.init(context); context.register(_M__sTextChars); context.register(_M__sTextBreak); context.register(_M__sTextSeparator); context.register(_M__sTextGroup); context.register(_M__sTextIndent); context.register(_M__sTextEmbed); context.register(_M__sTextString); context.register(_M__sTextCons); context.register(_M__sTextNil); context.register(_M_TextToString); context.register(_M_NumberToText); context.register(_M_StringToText); context.register(_M_ReverseTextFold); context.register(_M_TextFold1); context.register(_M_TextFold); context.register(_M_Text_Mangle); context.register(_M_Text_Integer); context.register(_M_Text_QuoteEscape); context.register(_M_Text_Comment); context.register(_M_Text_CommentToken); context.register(_M_Text_Token); context.register(_M_Text_User); context.register(_M_Text_ConcatSep); context.register(_M_Text_Concat); context.register(_M_Text_Text); context.register(_M_Text_String); context.register(_M_Text_Embed); context.register(_M_AsText);
      initialized = true;
    }
  }

/* END MODULE « "/Users/villardl/Projects/crsx/crsx4/src/std/text.crs.java" » */
}