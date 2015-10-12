/* START MODULE /Users/villardl/Projects/crsx/crsx4_2/src/std/text.crs.java */
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
  } final public static boolean _M_NumberToText(Sink sink, int shared, int depth, Term term_3) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_35;
      {
        BufferSink buf = sink.context().makeBuffer(); buf.start(_M_STRING); buf.literal(1); buf.end();
        term_35 = buf.term();
      } sink.propertyNamed("$LineLocation", term_35);Term term_95;
      {
        BufferSink buf_32 = sink.context().makeBuffer(); buf_32.start(_M_STRING); buf_32.literal(1); buf_32.end();
        term_95 = buf_32.term();
      } sink.propertyNamed("$ColumnLocation", term_95);
      sink.start(_M__sTextChars);
      sink.start(_M__s); sink.start(_M_Builtin_sFormatNumber); sink.end(); sink.copy(term_3.ref());
      sink.end();
      sink.end();Term term_81;
      {
        BufferSink buf_85 = sink.context().makeBuffer(); buf_85.start(_M_STRING); buf_85.literal(1); buf_85.end();
        term_81 = buf_85.term();
      } sink.propertyNamed("$LineLocation", term_81);Term term_66;
      {
        BufferSink buf_49 = sink.context().makeBuffer(); buf_49.start(_M_STRING); buf_49.literal(2); buf_49.end();
        term_66 = buf_49.term();
      } sink.propertyNamed("$ColumnLocation", term_66);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_NumberToText, term_3);
  } final public static boolean _M_StringToText(Sink sink, int shared, int depth, Term term_50) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_29;
      {
        BufferSink buf_0 = sink.context().makeBuffer(); buf_0.start(_M_STRING); buf_0.literal(1); buf_0.end();
        term_29 = buf_0.term();
      } sink.propertyNamed("$LineLocation", term_29);Term term_34;
      {
        BufferSink buf_16 = sink.context().makeBuffer(); buf_16.start(_M_STRING); buf_16.literal(1); buf_16.end();
        term_34 = buf_16.term();
      } sink.propertyNamed("$ColumnLocation", term_34);
      sink.start(_M__sTextChars); sink.copy(term_50.ref());
      sink.end();Term term_84;
      {
        BufferSink buf_30 = sink.context().makeBuffer(); buf_30.start(_M_STRING); buf_30.literal(1); buf_30.end();
        term_84 = buf_30.term();
      } sink.propertyNamed("$LineLocation", term_84);Term term_31;
      {
        BufferSink buf_91 = sink.context().makeBuffer(); buf_91.start(_M_STRING); buf_91.literal(2); buf_91.end();
        term_31 = buf_91.term();
      } sink.propertyNamed("$ColumnLocation", term_31);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_StringToText, term_50);
  } final public static boolean _M_ReverseTextFold(Sink sink, int shared, int depth, Term term_77, Term term_134) {
    if (depth < 2000) {
      label: {
        if (term_77.descriptor() != _M__sNil)
        {   break label;
        }
        /* #sep=term *//*Contract*/ sink.start(_M__sTextNil); sink.end(); return true;
      }
      label_6: {
        if (term_77.descriptor() != _M__sCons)
        {   break label_6;
        }Term sub = term_77.sub(0).ref();
        /* #1=sub */Term sub_13 = term_77.sub(1).ref();
        if (sub_13.descriptor() != _M__sNil)
        {   break label_6;
        }
        /* #sep=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed); sink.start(_M_AsText); sink.copy(sub.ref()); sink.end();
        sink.end();Term term_40;
        {
          BufferSink buf_67 = sink.context().makeBuffer(); buf_67.start(_M_STRING); buf_67.literal(1); buf_67.end();
          term_40 = buf_67.term();
        } sink.propertyNamed("$LineLocation", term_40);Term term_51;
        {
          BufferSink buf_33 = sink.context().makeBuffer(); buf_33.start(_M_STRING); buf_33.literal(1); buf_33.end();
          term_51 = buf_33.term();
        } sink.propertyNamed("$ColumnLocation", term_51);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); return true;
      }
      label_84: {
        if (term_77.descriptor() != _M__sCons)
        {   break label_84;
        }Term sub_79 = term_77.sub(0).ref();
        /* #1=sub */Term sub_38 = term_77.sub(1).ref();
        if (sub_38.descriptor() != _M__sCons)
        {   break label_84;
        }Term sub_23 = sub_38.sub(0).ref();
        /* #2=sub */Term sub_25 = sub_38.sub(1).ref();
        /* #s=sub */
        /* #sep=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed);
        sink.start(_M_AsText);
        sink.start(_M_ReverseTextFold);
        sink.start(_M__sCons); sink.copy(sub_23.ref()); sink.copy(sub_25.ref());
        sink.end(); sink.copy(term_134.ref());
        sink.end();
        sink.end();
        sink.end();Term term_11;
        {
          BufferSink buf_2 = sink.context().makeBuffer(); buf_2.start(_M_STRING); buf_2.literal(1); buf_2.end();
          term_11 = buf_2.term();
        } sink.propertyNamed("$LineLocation", term_11);Term term_36;
        {
          BufferSink buf_42 = sink.context().makeBuffer(); buf_42.start(_M_STRING); buf_42.literal(1); buf_42.end();
          term_36 = buf_42.term();
        } sink.propertyNamed("$ColumnLocation", term_36);
        sink.start(_M__sTextCons);Term term_30;
        {
          BufferSink buf_94 = sink.context().makeBuffer(); buf_94.start(_M_STRING); buf_94.literal(1); buf_94.end();
          term_30 = buf_94.term();
        } sink.propertyNamed("$LineLocation", term_30);Term term_78;
        {
          BufferSink buf_12 = sink.context().makeBuffer(); buf_12.start(_M_STRING); buf_12.literal(1); buf_12.end();
          term_78 = buf_12.term();
        } sink.propertyNamed("$ColumnLocation", term_78);
        sink.start(_M__sTextEmbed);Term term_47;
        {
          BufferSink buf_100 = sink.context().makeBuffer(); buf_100.start(_M_STRING); buf_100.literal(1); buf_100.end();
          term_47 = buf_100.term();
        } sink.propertyNamed("$LineLocation", term_47);Term term_46;
        {
          BufferSink buf_48 = sink.context().makeBuffer(); buf_48.start(_M_STRING); buf_48.literal(1); buf_48.end();
          term_46 = buf_48.term();
        } sink.propertyNamed("$ColumnLocation", term_46);
        sink.start(_M_AsText); sink.copy(term_134.ref());
        sink.end();
        sink.end();Term term_32;
        {
          BufferSink buf_22 = sink.context().makeBuffer(); buf_22.start(_M_STRING); buf_22.literal(1); buf_22.end();
          term_32 = buf_22.term();
        } sink.propertyNamed("$LineLocation", term_32);Term term_28;
        {
          BufferSink buf_11 = sink.context().makeBuffer(); buf_11.start(_M_STRING); buf_11.literal(35); buf_11.end();
          term_28 = buf_11.term();
        } sink.propertyNamed("$ColumnLocation", term_28);
        sink.start(_M__sTextCons);Term term_0;
        {
          BufferSink buf_97 = sink.context().makeBuffer(); buf_97.start(_M_STRING); buf_97.literal(1); buf_97.end();
          term_0 = buf_97.term();
        } sink.propertyNamed("$LineLocation", term_0);Term term_8;
        {
          BufferSink buf_46 = sink.context().makeBuffer(); buf_46.start(_M_STRING); buf_46.literal(35); buf_46.end();
          term_8 = buf_46.term();
        } sink.propertyNamed("$ColumnLocation", term_8);
        sink.start(_M__sTextEmbed);Term term_88;
        {
          BufferSink buf_68 = sink.context().makeBuffer(); buf_68.start(_M_STRING); buf_68.literal(1); buf_68.end();
          term_88 = buf_68.term();
        } sink.propertyNamed("$LineLocation", term_88);Term term_19;
        {
          BufferSink buf_17 = sink.context().makeBuffer(); buf_17.start(_M_STRING); buf_17.literal(35); buf_17.end();
          term_19 = buf_17.term();
        } sink.propertyNamed("$ColumnLocation", term_19);
        sink.start(_M_AsText); sink.copy(sub_79.ref());
        sink.end();
        sink.end();Term term_21;
        {
          BufferSink buf_35 = sink.context().makeBuffer(); buf_35.start(_M_STRING); buf_35.literal(1); buf_35.end();
          term_21 = buf_35.term();
        } sink.propertyNamed("$LineLocation", term_21);Term term_61;
        {
          BufferSink buf_105 = sink.context().makeBuffer();
          buf_105.start(_M_STRING); buf_105.literal(43);
          buf_105.end();
          term_61 = buf_105.term();
        } sink.propertyNamed("$ColumnLocation", term_61);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ReverseTextFold, term_77, term_134);
  }  final public static boolean _M_TextFold1(Sink sink, int shared, int depth, Term term_94, Term term_42) {
    if (depth < 2000) {
      label_99: {
        if (term_94.descriptor() != _M__sNil)
        {   break label_99;
        }
        /* #sep=term *//*Contract*/ sink.start(_M__sTextNil); sink.end(); return true;
      }
      label_57: {
        if (term_94.descriptor() != _M__sCons)
        {   break label_57;
        }Term sub_3 = term_94.sub(0).ref();
        /* #1=sub */Term sub_61 = term_94.sub(1).ref();
        /* #s=sub */
        /* #sep=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed); sink.start(_M_AsText); sink.copy(term_42.ref()); sink.end();
        sink.end();Term term_27;
        {
          BufferSink buf_40 = sink.context().makeBuffer(); buf_40.start(_M_STRING); buf_40.literal(1); buf_40.end();
          term_27 = buf_40.term();
        } sink.propertyNamed("$LineLocation", term_27);Term term_131;
        {
          BufferSink buf_145 = sink.context().makeBuffer(); buf_145.start(_M_STRING); buf_145.literal(1); buf_145.end();
          term_131 = buf_145.term();
        } sink.propertyNamed("$ColumnLocation", term_131);
        sink.start(_M__sTextCons);Term term_90;
        {
          BufferSink buf_102 = sink.context().makeBuffer(); buf_102.start(_M_STRING); buf_102.literal(1); buf_102.end();
          term_90 = buf_102.term();
        } sink.propertyNamed("$LineLocation", term_90);Term term_39;
        {
          BufferSink buf_191 = sink.context().makeBuffer(); buf_191.start(_M_STRING); buf_191.literal(1); buf_191.end();
          term_39 = buf_191.term();
        } sink.propertyNamed("$ColumnLocation", term_39);
        sink.start(_M__sTextEmbed);Term term_74;
        {
          BufferSink buf_19 = sink.context().makeBuffer(); buf_19.start(_M_STRING); buf_19.literal(1); buf_19.end();
          term_74 = buf_19.term();
        } sink.propertyNamed("$LineLocation", term_74);Term term_14;
        {
          BufferSink buf_53 = sink.context().makeBuffer(); buf_53.start(_M_STRING); buf_53.literal(1); buf_53.end();
          term_14 = buf_53.term();
        } sink.propertyNamed("$ColumnLocation", term_14);
        sink.start(_M_AsText); sink.copy(sub_3.ref());
        sink.end();
        sink.end();Term term_97;
        {
          BufferSink buf_13 = sink.context().makeBuffer(); buf_13.start(_M_STRING); buf_13.literal(1); buf_13.end();
          term_97 = buf_13.term();
        } sink.propertyNamed("$LineLocation", term_97);Term term_23;
        {
          BufferSink buf_23 = sink.context().makeBuffer(); buf_23.start(_M_STRING); buf_23.literal(9); buf_23.end();
          term_23 = buf_23.term();
        } sink.propertyNamed("$ColumnLocation", term_23);
        sink.start(_M__sTextCons);Term term_70;
        {
          BufferSink buf_75 = sink.context().makeBuffer(); buf_75.start(_M_STRING); buf_75.literal(1); buf_75.end();
          term_70 = buf_75.term();
        } sink.propertyNamed("$LineLocation", term_70);Term term_38;
        {
          BufferSink buf_95 = sink.context().makeBuffer(); buf_95.start(_M_STRING); buf_95.literal(9); buf_95.end();
          term_38 = buf_95.term();
        } sink.propertyNamed("$ColumnLocation", term_38);
        sink.start(_M__sTextEmbed);Term term_62;
        {
          BufferSink buf_25 = sink.context().makeBuffer(); buf_25.start(_M_STRING); buf_25.literal(1); buf_25.end();
          term_62 = buf_25.term();
        } sink.propertyNamed("$LineLocation", term_62);Term term_15;
        {
          BufferSink buf_168 = sink.context().makeBuffer(); buf_168.start(_M_STRING); buf_168.literal(9); buf_168.end();
          term_15 = buf_168.term();
        } sink.propertyNamed("$ColumnLocation", term_15);
        sink.start(_M_AsText);
        sink.start(_M_TextFold1); sink.copy(sub_61.ref()); sink.copy(term_42.ref());
        sink.end();
        sink.end();
        sink.end();Term term_176;
        {
          BufferSink buf_45 = sink.context().makeBuffer(); buf_45.start(_M_STRING); buf_45.literal(1); buf_45.end();
          term_176 = buf_45.term();
        } sink.propertyNamed("$LineLocation", term_176);Term term_43;
        {
          BufferSink buf_51 = sink.context().makeBuffer(); buf_51.start(_M_STRING); buf_51.literal(15); buf_51.end();
          term_43 = buf_51.term();
        } sink.propertyNamed("$ColumnLocation", term_43);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_TextFold1, term_94, term_42);
  }  final public static boolean _M_TextFold(Sink sink, int shared, int depth, Term term_129, Term term_54) {
    if (depth < 2000) {
      label_27: {
        if (term_129.descriptor() != _M__sNil)
        {   break label_27;
        }
        /* #sep=term *//*Contract*/ sink.start(_M__sTextNil); sink.end(); return true;
      }
      label_74: {
        if (term_129.descriptor() != _M__sCons)
        {   break label_74;
        }Term sub_89 = term_129.sub(0).ref();
        /* #1=sub */Term sub_68 = term_129.sub(1).ref();
        /* #s=sub */
        /* #sep=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed); sink.start(_M_AsText); sink.copy(term_54.ref()); sink.end();
        sink.end();Term term_64;
        {
          BufferSink buf_69 = sink.context().makeBuffer(); buf_69.start(_M_STRING); buf_69.literal(1); buf_69.end();
          term_64 = buf_69.term();
        } sink.propertyNamed("$LineLocation", term_64);Term term_118;
        {
          BufferSink buf_57 = sink.context().makeBuffer(); buf_57.start(_M_STRING); buf_57.literal(1); buf_57.end();
          term_118 = buf_57.term();
        } sink.propertyNamed("$ColumnLocation", term_118);
        sink.start(_M__sTextCons);Term term_52;
        {
          BufferSink buf_78 = sink.context().makeBuffer(); buf_78.start(_M_STRING); buf_78.literal(1); buf_78.end();
          term_52 = buf_78.term();
        } sink.propertyNamed("$LineLocation", term_52);Term term_55;
        {
          BufferSink buf_8 = sink.context().makeBuffer(); buf_8.start(_M_STRING); buf_8.literal(1); buf_8.end();
          term_55 = buf_8.term();
        } sink.propertyNamed("$ColumnLocation", term_55);
        sink.start(_M__sTextEmbed);Term term_2;
        {
          BufferSink buf_9 = sink.context().makeBuffer(); buf_9.start(_M_STRING); buf_9.literal(1); buf_9.end();
          term_2 = buf_9.term();
        } sink.propertyNamed("$LineLocation", term_2);Term term_270;
        {
          BufferSink buf_90 = sink.context().makeBuffer(); buf_90.start(_M_STRING); buf_90.literal(1); buf_90.end();
          term_270 = buf_90.term();
        } sink.propertyNamed("$ColumnLocation", term_270);
        sink.start(_M_AsText); sink.copy(sub_89.ref());
        sink.end();
        sink.end();Term term_172;
        {
          BufferSink buf_28 = sink.context().makeBuffer(); buf_28.start(_M_STRING); buf_28.literal(1); buf_28.end();
          term_172 = buf_28.term();
        } sink.propertyNamed("$LineLocation", term_172);Term term_75;
        {
          BufferSink buf_72 = sink.context().makeBuffer(); buf_72.start(_M_STRING); buf_72.literal(9); buf_72.end();
          term_75 = buf_72.term();
        } sink.propertyNamed("$ColumnLocation", term_75);
        sink.start(_M__sTextCons);Term term_6;
        {
          BufferSink buf_143 = sink.context().makeBuffer(); buf_143.start(_M_STRING); buf_143.literal(1); buf_143.end();
          term_6 = buf_143.term();
        } sink.propertyNamed("$LineLocation", term_6);Term term_7;
        {
          BufferSink buf_7 = sink.context().makeBuffer(); buf_7.start(_M_STRING); buf_7.literal(9); buf_7.end();
          term_7 = buf_7.term();
        } sink.propertyNamed("$ColumnLocation", term_7);
        sink.start(_M__sTextEmbed);Term term_56;
        {
          BufferSink buf_195 = sink.context().makeBuffer(); buf_195.start(_M_STRING); buf_195.literal(1); buf_195.end();
          term_56 = buf_195.term();
        } sink.propertyNamed("$LineLocation", term_56);Term term_4;
        {
          BufferSink buf_176 = sink.context().makeBuffer(); buf_176.start(_M_STRING); buf_176.literal(9); buf_176.end();
          term_4 = buf_176.term();
        } sink.propertyNamed("$ColumnLocation", term_4);
        sink.start(_M_AsText);
        sink.start(_M_TextFold1); sink.copy(sub_68.ref()); sink.copy(term_54.ref());
        sink.end();
        sink.end();
        sink.end();Term term_18;
        {
          BufferSink buf_80 = sink.context().makeBuffer(); buf_80.start(_M_STRING); buf_80.literal(1); buf_80.end();
          term_18 = buf_80.term();
        } sink.propertyNamed("$LineLocation", term_18);Term term_1;
        {
          BufferSink buf_166 = sink.context().makeBuffer();
          buf_166.start(_M_STRING); buf_166.literal(15);
          buf_166.end();
          term_1 = buf_166.term();
        } sink.propertyNamed("$ColumnLocation", term_1);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_TextFold, term_129, term_54);
  }  final public static boolean _M_Text_Mangle(Sink sink, int shared, int depth, Term term_162) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_147;
      {
        BufferSink buf_55 = sink.context().makeBuffer(); buf_55.start(_M_STRING); buf_55.literal(1); buf_55.end();
        term_147 = buf_55.term();
      } sink.propertyNamed("$LineLocation", term_147);Term term_86;
      {
        BufferSink buf_34 = sink.context().makeBuffer(); buf_34.start(_M_STRING); buf_34.literal(1); buf_34.end();
        term_86 = buf_34.term();
      } sink.propertyNamed("$ColumnLocation", term_86);
      sink.start(_M__sTextChars);
      sink.start(_M__s); sink.start(_M_Builtin_sMangle); sink.end(); sink.copy(term_162.ref());
      sink.end();
      sink.end();Term term_33;
      {
        BufferSink buf_15 = sink.context().makeBuffer(); buf_15.start(_M_STRING); buf_15.literal(1); buf_15.end();
        term_33 = buf_15.term();
      } sink.propertyNamed("$LineLocation", term_33);Term term_89;
      {
        BufferSink buf_81 = sink.context().makeBuffer(); buf_81.start(_M_STRING); buf_81.literal(2); buf_81.end();
        term_89 = buf_81.term();
      } sink.propertyNamed("$ColumnLocation", term_89);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Mangle, term_162);
  } final public static boolean _M_Text_Integer(Sink sink, int shared, int depth, Term term_105) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_79;
      {
        BufferSink buf_243 = sink.context().makeBuffer(); buf_243.start(_M_STRING); buf_243.literal(1); buf_243.end();
        term_79 = buf_243.term();
      } sink.propertyNamed("$LineLocation", term_79);Term term_10;
      {
        BufferSink buf_24 = sink.context().makeBuffer(); buf_24.start(_M_STRING); buf_24.literal(1); buf_24.end();
        term_10 = buf_24.term();
      } sink.propertyNamed("$ColumnLocation", term_10);
      sink.start(_M__sTextChars);
      sink.start(_M__s); sink.start(_M_Builtin_sFormatNumber); sink.end(); sink.copy(term_105.ref());
      sink.end();
      sink.end();Term term_60;
      {
        BufferSink buf_144 = sink.context().makeBuffer(); buf_144.start(_M_STRING); buf_144.literal(1); buf_144.end();
        term_60 = buf_144.term();
      } sink.propertyNamed("$LineLocation", term_60);Term term_24;
      {
        BufferSink buf_93 = sink.context().makeBuffer(); buf_93.start(_M_STRING); buf_93.literal(2); buf_93.end();
        term_24 = buf_93.term();
      } sink.propertyNamed("$ColumnLocation", term_24);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Integer, term_105);
  } final public static boolean _M_Text_QuoteEscape(Sink sink, int shared, int depth, Term term_16) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_85;
      {
        BufferSink buf_185 = sink.context().makeBuffer(); buf_185.start(_M_STRING); buf_185.literal(1); buf_185.end();
        term_85 = buf_185.term();
      } sink.propertyNamed("$LineLocation", term_85);Term term_82;
      {
        BufferSink buf_92 = sink.context().makeBuffer(); buf_92.start(_M_STRING); buf_92.literal(1); buf_92.end();
        term_82 = buf_92.term();
      } sink.propertyNamed("$ColumnLocation", term_82);
      sink.start(_M__sTextChars);
      sink.start(_M__s); sink.start(_M_Builtin_sEscape); sink.end(); sink.copy(term_16.ref());
      sink.end();
      sink.end();Term term_177;
      {
        BufferSink buf_41 = sink.context().makeBuffer(); buf_41.start(_M_STRING); buf_41.literal(1); buf_41.end();
        term_177 = buf_41.term();
      } sink.propertyNamed("$LineLocation", term_177);Term term_98;
      {
        BufferSink buf_1 = sink.context().makeBuffer(); buf_1.start(_M_STRING); buf_1.literal(2); buf_1.end();
        term_98 = buf_1.term();
      } sink.propertyNamed("$ColumnLocation", term_98);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_QuoteEscape, term_16);
  } final public static boolean _M_Text_Comment(Sink sink, int shared, int depth, Term term_246) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_281;
      {
        BufferSink buf_89 = sink.context().makeBuffer(); buf_89.start(_M_STRING); buf_89.literal(1); buf_89.end();
        term_281 = buf_89.term();
      } sink.propertyNamed("$LineLocation", term_281);Term term_222;
      {
        BufferSink buf_64 = sink.context().makeBuffer(); buf_64.start(_M_STRING); buf_64.literal(1); buf_64.end();
        term_222 = buf_64.term();
      } sink.propertyNamed("$ColumnLocation", term_222);
      sink.start(_M__sTextChars);
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("/*");
      sink.start(_M__s); sink.start(_M_Builtin_sReplace); sink.end(); sink.copy(term_246.ref()); sink.literal("*/"); sink.literal("*_/");
      sink.end(); sink.literal("*/");
      sink.end();
      sink.end();Term term_197;
      {
        BufferSink buf_20 = sink.context().makeBuffer(); buf_20.start(_M_STRING); buf_20.literal(1); buf_20.end();
        term_197 = buf_20.term();
      } sink.propertyNamed("$LineLocation", term_197);Term term_63;
      {
        BufferSink buf_61 = sink.context().makeBuffer(); buf_61.start(_M_STRING); buf_61.literal(2); buf_61.end();
        term_63 = buf_61.term();
      } sink.propertyNamed("$ColumnLocation", term_63);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Comment, term_246);
  } final public static boolean _M_Text_CommentToken(Sink sink, int shared, int depth, Term term_76) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_171;
      {
        BufferSink buf_3 = sink.context().makeBuffer(); buf_3.start(_M_STRING); buf_3.literal(1); buf_3.end();
        term_171 = buf_3.term();
      } sink.propertyNamed("$LineLocation", term_171);Term term_195;
      {
        BufferSink buf_96 = sink.context().makeBuffer(); buf_96.start(_M_STRING); buf_96.literal(1); buf_96.end();
        term_195 = buf_96.term();
      } sink.propertyNamed("$ColumnLocation", term_195);
      sink.start(_M__sTextChars);
      sink.start(_M__s); sink.start(_M_Builtin_sReplace); sink.end(); sink.copy(term_76.ref()); sink.literal("*/"); sink.literal("*_/");
      sink.end();
      sink.end();Term term_26;
      {
        BufferSink buf_174 = sink.context().makeBuffer(); buf_174.start(_M_STRING); buf_174.literal(1); buf_174.end();
        term_26 = buf_174.term();
      } sink.propertyNamed("$LineLocation", term_26);Term term_188;
      {
        BufferSink buf_31 = sink.context().makeBuffer(); buf_31.start(_M_STRING); buf_31.literal(2); buf_31.end();
        term_188 = buf_31.term();
      } sink.propertyNamed("$ColumnLocation", term_188);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_CommentToken, term_76);
  } final public static boolean _M_Text_Token(Sink sink, int shared, int depth, Term term_12) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_104;
      {
        BufferSink buf_79 = sink.context().makeBuffer(); buf_79.start(_M_STRING); buf_79.literal(1); buf_79.end();
        term_104 = buf_79.term();
      } sink.propertyNamed("$LineLocation", term_104);Term term_124;
      {
        BufferSink buf_101 = sink.context().makeBuffer(); buf_101.start(_M_STRING); buf_101.literal(1); buf_101.end();
        term_124 = buf_101.term();
      } sink.propertyNamed("$ColumnLocation", term_124);
      sink.start(_M__sTextChars); sink.copy(term_12.ref());
      sink.end();Term term_58;
      {
        BufferSink buf_59 = sink.context().makeBuffer(); buf_59.start(_M_STRING); buf_59.literal(1); buf_59.end();
        term_58 = buf_59.term();
      } sink.propertyNamed("$LineLocation", term_58);Term term_139;
      {
        BufferSink buf_192 = sink.context().makeBuffer(); buf_192.start(_M_STRING); buf_192.literal(2); buf_192.end();
        term_139 = buf_192.term();
      } sink.propertyNamed("$ColumnLocation", term_139);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Token, term_12);
  } final public static boolean _M_Text_User(Sink sink, int shared, int depth, Term term_155, Term term_138) {
    if (depth < 2000) {
      sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal("%"); sink.end();Term term_203;
      {
        BufferSink buf_5 = sink.context().makeBuffer(); buf_5.start(_M_STRING); buf_5.literal(1); buf_5.end();
        term_203 = buf_5.term();
      } sink.propertyNamed("$LineLocation", term_203);Term term_152;
      {
        BufferSink buf_179 = sink.context().makeBuffer(); buf_179.start(_M_STRING); buf_179.literal(1); buf_179.end();
        term_152 = buf_179.term();
      } sink.propertyNamed("$ColumnLocation", term_152);
      sink.start(_M__sTextCons);Term term_161;
      {
        BufferSink buf_76 = sink.context().makeBuffer(); buf_76.start(_M_STRING); buf_76.literal(1); buf_76.end();
        term_161 = buf_76.term();
      } sink.propertyNamed("$LineLocation", term_161);Term term_5;
      {
        BufferSink buf_37 = sink.context().makeBuffer(); buf_37.start(_M_STRING); buf_37.literal(2); buf_37.end();
        term_5 = buf_37.term();
      } sink.propertyNamed("$ColumnLocation", term_5);
      sink.start(_M__sTextChars); sink.copy(term_155.ref());
      sink.end();Term term_120;
      {
        BufferSink buf_38 = sink.context().makeBuffer(); buf_38.start(_M_STRING); buf_38.literal(1); buf_38.end();
        term_120 = buf_38.term();
      } sink.propertyNamed("$LineLocation", term_120);Term term_227;
      {
        BufferSink buf_21 = sink.context().makeBuffer(); buf_21.start(_M_STRING); buf_21.literal(3); buf_21.end();
        term_227 = buf_21.term();
      } sink.propertyNamed("$ColumnLocation", term_227);
      sink.start(_M__sTextCons);Term term_146;
      {
        BufferSink buf_87 = sink.context().makeBuffer(); buf_87.start(_M_STRING); buf_87.literal(1); buf_87.end();
        term_146 = buf_87.term();
      } sink.propertyNamed("$LineLocation", term_146);Term term_13;
      {
        BufferSink buf_70 = sink.context().makeBuffer(); buf_70.start(_M_STRING); buf_70.literal(17); buf_70.end();
        term_13 = buf_70.term();
      } sink.propertyNamed("$ColumnLocation", term_13);
      sink.start(_M__sTextChars); sink.literal("\u27e6\u27e6");
      sink.end();Term term_373;
      {
        BufferSink buf_65 = sink.context().makeBuffer(); buf_65.start(_M_STRING); buf_65.literal(1); buf_65.end();
        term_373 = buf_65.term();
      } sink.propertyNamed("$LineLocation", term_373);Term term_183;
      {
        BufferSink buf_127 = sink.context().makeBuffer(); buf_127.start(_M_STRING); buf_127.literal(18); buf_127.end();
        term_183 = buf_127.term();
      } sink.propertyNamed("$ColumnLocation", term_183);
      sink.start(_M__sTextCons);Term term_236;
      {
        BufferSink buf_266 = sink.context().makeBuffer(); buf_266.start(_M_STRING); buf_266.literal(1); buf_266.end();
        term_236 = buf_266.term();
      } sink.propertyNamed("$LineLocation", term_236);Term term_92;
      {
        BufferSink buf_108 = sink.context().makeBuffer(); buf_108.start(_M_STRING); buf_108.literal(18); buf_108.end();
        term_92 = buf_108.term();
      } sink.propertyNamed("$ColumnLocation", term_92);
      sink.start(_M__sTextEmbed);Term term_71;
      {
        BufferSink buf_62 = sink.context().makeBuffer(); buf_62.start(_M_STRING); buf_62.literal(1); buf_62.end();
        term_71 = buf_62.term();
      } sink.propertyNamed("$LineLocation", term_71);Term term_389;
      {
        BufferSink buf_99 = sink.context().makeBuffer(); buf_99.start(_M_STRING); buf_99.literal(18); buf_99.end();
        term_389 = buf_99.term();
      } sink.propertyNamed("$ColumnLocation", term_389);
      sink.start(_M_AsText); sink.copy(term_138.ref());
      sink.end();
      sink.end();Term term_370;
      {
        BufferSink buf_58 = sink.context().makeBuffer(); buf_58.start(_M_STRING); buf_58.literal(1); buf_58.end();
        term_370 = buf_58.term();
      } sink.propertyNamed("$LineLocation", term_370);Term term_87;
      {
        BufferSink buf_54 = sink.context().makeBuffer(); buf_54.start(_M_STRING); buf_54.literal(34); buf_54.end();
        term_87 = buf_54.term();
      } sink.propertyNamed("$ColumnLocation", term_87);
      sink.start(_M__sTextCons);Term term_145;
      {
        BufferSink buf_351 = sink.context().makeBuffer(); buf_351.start(_M_STRING); buf_351.literal(1); buf_351.end();
        term_145 = buf_351.term();
      } sink.propertyNamed("$LineLocation", term_145);Term term_239;
      {
        BufferSink buf_26 = sink.context().makeBuffer(); buf_26.start(_M_STRING); buf_26.literal(47); buf_26.end();
        term_239 = buf_26.term();
      } sink.propertyNamed("$ColumnLocation", term_239);
      sink.start(_M__sTextChars); sink.literal("\u27e7\u27e7");
      sink.end();Term term_167;
      {
        BufferSink buf_29 = sink.context().makeBuffer(); buf_29.start(_M_STRING); buf_29.literal(1); buf_29.end();
        term_167 = buf_29.term();
      } sink.propertyNamed("$LineLocation", term_167);Term term_22;
      {
        BufferSink buf_109 = sink.context().makeBuffer(); buf_109.start(_M_STRING); buf_109.literal(48); buf_109.end();
        term_22 = buf_109.term();
      } sink.propertyNamed("$ColumnLocation", term_22);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end();
      sink.end();
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_User, term_155, term_138);
  }  final public static boolean _M_Text_ConcatSep(Sink sink, int shared, int depth, Term term_154, Term term_130) {
    if (depth < 2000) {
      label_44: {
        if (term_154.descriptor() != _M__sNil)
        {   break label_44;
        }
        /* #sep=term *//*Contract*/ sink.start(_M__sTextNil); sink.end(); return true;
      }
      label_31: {
        if (term_154.descriptor() != _M__sCons)
        {   break label_31;
        }Term sub_59 = term_154.sub(0).ref();
        /* #t1=sub */Term sub_58 = term_154.sub(1).ref();
        if (sub_58.descriptor() != _M__sNil)
        {   break label_31;
        }
        /* #sep=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed); sink.start(_M_AsText); sink.copy(sub_59.ref()); sink.end();
        sink.end();Term term_173;
        {
          BufferSink buf_86 = sink.context().makeBuffer(); buf_86.start(_M_STRING); buf_86.literal(1); buf_86.end();
          term_173 = buf_86.term();
        } sink.propertyNamed("$LineLocation", term_173);Term term_187;
        {
          BufferSink buf_84 = sink.context().makeBuffer(); buf_84.start(_M_STRING); buf_84.literal(1); buf_84.end();
          term_187 = buf_84.term();
        } sink.propertyNamed("$ColumnLocation", term_187);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); return true;
      }
      label_17: {
        if (term_154.descriptor() != _M__sCons)
        {   break label_17;
        }Term sub_36 = term_154.sub(0).ref();
        /* #t1=sub */Term sub_44 = term_154.sub(1).ref();
        if (sub_44.descriptor() != _M__sCons)
        {   break label_17;
        }Term sub_84 = sub_44.sub(0).ref();
        /* #t2=sub */Term sub_53 = sub_44.sub(1).ref();
        /* #ts=sub */
        /* #sep=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed); sink.start(_M_AsText); sink.copy(sub_36.ref()); sink.end();
        sink.end();Term term_241;
        {
          BufferSink buf_137 = sink.context().makeBuffer(); buf_137.start(_M_STRING); buf_137.literal(1); buf_137.end();
          term_241 = buf_137.term();
        } sink.propertyNamed("$LineLocation", term_241);Term term_169;
        {
          BufferSink buf_295 = sink.context().makeBuffer(); buf_295.start(_M_STRING); buf_295.literal(1); buf_295.end();
          term_169 = buf_295.term();
        } sink.propertyNamed("$ColumnLocation", term_169);
        sink.start(_M__sTextCons);Term term_59;
        {
          BufferSink buf_194 = sink.context().makeBuffer(); buf_194.start(_M_STRING); buf_194.literal(1); buf_194.end();
          term_59 = buf_194.term();
        } sink.propertyNamed("$LineLocation", term_59);Term term_140;
        {
          BufferSink buf_120 = sink.context().makeBuffer(); buf_120.start(_M_STRING); buf_120.literal(1); buf_120.end();
          term_140 = buf_120.term();
        } sink.propertyNamed("$ColumnLocation", term_140);
        sink.start(_M__sTextEmbed);Term term_25;
        {
          BufferSink buf_115 = sink.context().makeBuffer(); buf_115.start(_M_STRING); buf_115.literal(1); buf_115.end();
          term_25 = buf_115.term();
        } sink.propertyNamed("$LineLocation", term_25);Term term_372;
        {
          BufferSink buf_139 = sink.context().makeBuffer(); buf_139.start(_M_STRING); buf_139.literal(1); buf_139.end();
          term_372 = buf_139.term();
        } sink.propertyNamed("$ColumnLocation", term_372);
        sink.start(_M_AsText); sink.copy(term_130.ref());
        sink.end();
        sink.end();Term term_112;
        {
          BufferSink buf_56 = sink.context().makeBuffer(); buf_56.start(_M_STRING); buf_56.literal(1); buf_56.end();
          term_112 = buf_56.term();
        } sink.propertyNamed("$LineLocation", term_112);Term term_9;
        {
          BufferSink buf_146 = sink.context().makeBuffer(); buf_146.start(_M_STRING); buf_146.literal(6); buf_146.end();
          term_9 = buf_146.term();
        } sink.propertyNamed("$ColumnLocation", term_9);
        sink.start(_M__sTextCons);Term term_229;
        {
          BufferSink buf_167 = sink.context().makeBuffer(); buf_167.start(_M_STRING); buf_167.literal(1); buf_167.end();
          term_229 = buf_167.term();
        } sink.propertyNamed("$LineLocation", term_229);Term term_159;
        {
          BufferSink buf_4 = sink.context().makeBuffer(); buf_4.start(_M_STRING); buf_4.literal(6); buf_4.end();
          term_159 = buf_4.term();
        } sink.propertyNamed("$ColumnLocation", term_159);
        sink.start(_M__sTextEmbed);Term term_296;
        {
          BufferSink buf_130 = sink.context().makeBuffer(); buf_130.start(_M_STRING); buf_130.literal(1); buf_130.end();
          term_296 = buf_130.term();
        } sink.propertyNamed("$LineLocation", term_296);Term term_116;
        {
          BufferSink buf_140 = sink.context().makeBuffer(); buf_140.start(_M_STRING); buf_140.literal(6); buf_140.end();
          term_116 = buf_140.term();
        } sink.propertyNamed("$ColumnLocation", term_116);
        sink.start(_M_AsText);
        sink.start(_M_Text_ConcatSep);
        sink.start(_M__sCons); sink.copy(sub_84.ref()); sink.copy(sub_53.ref());
        sink.end(); sink.copy(term_130.ref());
        sink.end();
        sink.end();
        sink.end();Term term_80;
        {
          BufferSink buf_292 = sink.context().makeBuffer(); buf_292.start(_M_STRING); buf_292.literal(1); buf_292.end();
          term_80 = buf_292.term();
        } sink.propertyNamed("$LineLocation", term_80);Term term_283;
        {
          BufferSink buf_273 = sink.context().makeBuffer();
          buf_273.start(_M_STRING); buf_273.literal(12);
          buf_273.end();
          term_283 = buf_273.term();
        } sink.propertyNamed("$ColumnLocation", term_283);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Text_ConcatSep, term_154, term_130);
  }  final public static boolean _M_Text_Concat(Sink sink, int shared, int depth, Term term_191) {
    if (depth < 2000) {
      sink.start(_M_Text_ConcatSep); sink.copy(term_191.ref()); sink.start(_M__sTextNil); sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Concat, term_191);
  } final public static boolean _M_Text_Text(Sink sink, int shared, int depth, Term term_158) {
    if (depth < 2000) {
      sink.start(_M_Text_User); sink.literal("n"); sink.copy(term_158.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Text, term_158);
  } final public static boolean _M_Text_String(Sink sink, int shared, int depth, Term term_201) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_274;
      {
        BufferSink buf_272 = sink.context().makeBuffer(); buf_272.start(_M_STRING); buf_272.literal(1); buf_272.end();
        term_274 = buf_272.term();
      } sink.propertyNamed("$LineLocation", term_274);Term term_122;
      {
        BufferSink buf_73 = sink.context().makeBuffer(); buf_73.start(_M_STRING); buf_73.literal(1); buf_73.end();
        term_122 = buf_73.term();
      } sink.propertyNamed("$ColumnLocation", term_122);
      sink.start(_M__sTextChars); sink.literal("\u2020\u2020");
      sink.end();Term term_17;
      {
        BufferSink buf_170 = sink.context().makeBuffer(); buf_170.start(_M_STRING); buf_170.literal(1); buf_170.end();
        term_17 = buf_170.term();
      } sink.propertyNamed("$LineLocation", term_17);Term term_374;
      {
        BufferSink buf_47 = sink.context().makeBuffer(); buf_47.start(_M_STRING); buf_47.literal(2); buf_47.end();
        term_374 = buf_47.term();
      } sink.propertyNamed("$ColumnLocation", term_374);
      sink.start(_M__sTextCons);Term term_44;
      {
        BufferSink buf_123 = sink.context().makeBuffer(); buf_123.start(_M_STRING); buf_123.literal(1); buf_123.end();
        term_44 = buf_123.term();
      } sink.propertyNamed("$LineLocation", term_44);Term term_194;
      {
        BufferSink buf_50 = sink.context().makeBuffer(); buf_50.start(_M_STRING); buf_50.literal(18); buf_50.end();
        term_194 = buf_50.term();
      } sink.propertyNamed("$ColumnLocation", term_194);
      sink.start(_M__sTextChars); sink.literal("\u00ab\u00ab");
      sink.end();Term term_250;
      {
        BufferSink buf_132 = sink.context().makeBuffer(); buf_132.start(_M_STRING); buf_132.literal(1); buf_132.end();
        term_250 = buf_132.term();
      } sink.propertyNamed("$LineLocation", term_250);Term term_148;
      {
        BufferSink buf_43 = sink.context().makeBuffer(); buf_43.start(_M_STRING); buf_43.literal(19); buf_43.end();
        term_148 = buf_43.term();
      } sink.propertyNamed("$ColumnLocation", term_148);
      sink.start(_M__sTextCons);Term term_476;
      {
        BufferSink buf_160 = sink.context().makeBuffer(); buf_160.start(_M_STRING); buf_160.literal(1); buf_160.end();
        term_476 = buf_160.term();
      } sink.propertyNamed("$LineLocation", term_476);Term term_157;
      {
        BufferSink buf_153 = sink.context().makeBuffer(); buf_153.start(_M_STRING); buf_153.literal(19); buf_153.end();
        term_157 = buf_153.term();
      } sink.propertyNamed("$ColumnLocation", term_157);
      sink.start(_M__sTextEmbed);Term term_49;
      {
        BufferSink buf_129 = sink.context().makeBuffer(); buf_129.start(_M_STRING); buf_129.literal(1); buf_129.end();
        term_49 = buf_129.term();
      } sink.propertyNamed("$LineLocation", term_49);Term term_100;
      {
        BufferSink buf_39 = sink.context().makeBuffer(); buf_39.start(_M_STRING); buf_39.literal(19); buf_39.end();
        term_100 = buf_39.term();
      } sink.propertyNamed("$ColumnLocation", term_100);
      sink.start(_M_AsText); sink.copy(term_201.ref());
      sink.end();
      sink.end();Term term_48;
      {
        BufferSink buf_151 = sink.context().makeBuffer(); buf_151.start(_M_STRING); buf_151.literal(1); buf_151.end();
        term_48 = buf_151.term();
      } sink.propertyNamed("$LineLocation", term_48);Term term_231;
      {
        BufferSink buf_276 = sink.context().makeBuffer(); buf_276.start(_M_STRING); buf_276.literal(35); buf_276.end();
        term_231 = buf_276.term();
      } sink.propertyNamed("$ColumnLocation", term_231);
      sink.start(_M__sTextCons);Term term_149;
      {
        BufferSink buf_431 = sink.context().makeBuffer(); buf_431.start(_M_STRING); buf_431.literal(1); buf_431.end();
        term_149 = buf_431.term();
      } sink.propertyNamed("$LineLocation", term_149);Term term_143;
      {
        BufferSink buf_182 = sink.context().makeBuffer(); buf_182.start(_M_STRING); buf_182.literal(48); buf_182.end();
        term_143 = buf_182.term();
      } sink.propertyNamed("$ColumnLocation", term_143);
      sink.start(_M__sTextChars); sink.literal("\u00bb\u00bb");
      sink.end();Term term_119;
      {
        BufferSink buf_44 = sink.context().makeBuffer(); buf_44.start(_M_STRING); buf_44.literal(1); buf_44.end();
        term_119 = buf_44.term();
      } sink.propertyNamed("$LineLocation", term_119);Term term_99;
      {
        BufferSink buf_297 = sink.context().makeBuffer(); buf_297.start(_M_STRING); buf_297.literal(49); buf_297.end();
        term_99 = buf_297.term();
      } sink.propertyNamed("$ColumnLocation", term_99);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end();
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_String, term_201);
  } final public static boolean _M_Text_Embed(Sink sink, int shared, int depth, Term term_111) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_103;
      {
        BufferSink buf_112 = sink.context().makeBuffer(); buf_112.start(_M_STRING); buf_112.literal(1); buf_112.end();
        term_103 = buf_112.term();
      } sink.propertyNamed("$LineLocation", term_103);Term term_178;
      {
        BufferSink buf_82 = sink.context().makeBuffer(); buf_82.start(_M_STRING); buf_82.literal(1); buf_82.end();
        term_178 = buf_82.term();
      } sink.propertyNamed("$ColumnLocation", term_178);
      sink.start(_M__sTextChars); sink.literal("\u00ab\u00ab");
      sink.end();Term term_174;
      {
        BufferSink buf_198 = sink.context().makeBuffer(); buf_198.start(_M_STRING); buf_198.literal(1); buf_198.end();
        term_174 = buf_198.term();
      } sink.propertyNamed("$LineLocation", term_174);Term term_136;
      {
        BufferSink buf_213 = sink.context().makeBuffer(); buf_213.start(_M_STRING); buf_213.literal(2); buf_213.end();
        term_136 = buf_213.term();
      } sink.propertyNamed("$ColumnLocation", term_136);
      sink.start(_M__sTextCons);Term term_192;
      {
        BufferSink buf_281 = sink.context().makeBuffer(); buf_281.start(_M_STRING); buf_281.literal(1); buf_281.end();
        term_192 = buf_281.term();
      } sink.propertyNamed("$LineLocation", term_192);Term term_45;
      {
        BufferSink buf_36 = sink.context().makeBuffer(); buf_36.start(_M_STRING); buf_36.literal(2); buf_36.end();
        term_45 = buf_36.term();
      } sink.propertyNamed("$ColumnLocation", term_45);
      sink.start(_M__sTextEmbed);Term term_483;
      {
        BufferSink buf_83 = sink.context().makeBuffer(); buf_83.start(_M_STRING); buf_83.literal(1); buf_83.end();
        term_483 = buf_83.term();
      } sink.propertyNamed("$LineLocation", term_483);Term term_127;
      {
        BufferSink buf_188 = sink.context().makeBuffer(); buf_188.start(_M_STRING); buf_188.literal(2); buf_188.end();
        term_127 = buf_188.term();
      } sink.propertyNamed("$ColumnLocation", term_127);
      sink.start(_M_AsText); sink.copy(term_111.ref());
      sink.end();
      sink.end();Term term_96;
      {
        BufferSink buf_18 = sink.context().makeBuffer(); buf_18.start(_M_STRING); buf_18.literal(1); buf_18.end();
        term_96 = buf_18.term();
      } sink.propertyNamed("$LineLocation", term_96);Term term_488;
      {
        BufferSink buf_52 = sink.context().makeBuffer(); buf_52.start(_M_STRING); buf_52.literal(18); buf_52.end();
        term_488 = buf_52.term();
      } sink.propertyNamed("$ColumnLocation", term_488);
      sink.start(_M__sTextCons);Term term_244;
      {
        BufferSink buf_10 = sink.context().makeBuffer(); buf_10.start(_M_STRING); buf_10.literal(1); buf_10.end();
        term_244 = buf_10.term();
      } sink.propertyNamed("$LineLocation", term_244);Term term_193;
      {
        BufferSink buf_410 = sink.context().makeBuffer(); buf_410.start(_M_STRING); buf_410.literal(31); buf_410.end();
        term_193 = buf_410.term();
      } sink.propertyNamed("$ColumnLocation", term_193);
      sink.start(_M__sTextChars); sink.literal("\u00bb\u00bb");
      sink.end();Term term_206;
      {
        BufferSink buf_27 = sink.context().makeBuffer(); buf_27.start(_M_STRING); buf_27.literal(1); buf_27.end();
        term_206 = buf_27.term();
      } sink.propertyNamed("$LineLocation", term_206);Term term_182;
      {
        BufferSink buf_142 = sink.context().makeBuffer(); buf_142.start(_M_STRING); buf_142.literal(32); buf_142.end();
        term_182 = buf_142.term();
      } sink.propertyNamed("$ColumnLocation", term_182);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Embed, term_111);
  } final public static boolean _M_AsText(Sink sink, int shared, int depth, Term term_68) {
    if (depth < 2000) { sink.copy(term_68.ref()); return true;
    }
    return thunk(sink, _M_AsText, term_68);
  } 
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.std.Core.init(context); org.crsx.compiler.std.List.init(context); context.register(_M__sTextChars); context.register(_M__sTextBreak); context.register(_M__sTextIndent); context.register(_M__sTextEmbed); context.register(_M__sTextString); context.register(_M__sTextCons); context.register(_M__sTextNil); context.register(_M_TextToString); context.register(_M_NumberToText); context.register(_M_StringToText); context.register(_M_ReverseTextFold); context.register(_M_TextFold1); context.register(_M_TextFold); context.register(_M_Text_Mangle); context.register(_M_Text_Integer); context.register(_M_Text_QuoteEscape); context.register(_M_Text_Comment); context.register(_M_Text_CommentToken); context.register(_M_Text_Token); context.register(_M_Text_User); context.register(_M_Text_ConcatSep); context.register(_M_Text_Concat); context.register(_M_Text_Text); context.register(_M_Text_String); context.register(_M_Text_Embed); context.register(_M_AsText);
      initialized = true;
    }
  }

/* END MODULE « "/Users/villardl/Projects/crsx/crsx4_2/src/std/text.crs.java" » */
}