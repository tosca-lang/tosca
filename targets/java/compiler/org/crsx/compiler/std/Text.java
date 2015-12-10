/* START MODULE /Users/villardl/Projects/crsx/crsx4/src/std/text.crs.java */
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
      sink.start(_M__sTextCons);Term term_53;
      {
        BufferSink buf = sink.context().makeBuffer(); buf.start(_M_STRING); buf.literal(1); buf.end();
        term_53 = buf.term();
      } sink.propertyNamed("$LineLocation", term_53);Term term_67;
      {
        BufferSink buf_13 = sink.context().makeBuffer(); buf_13.start(_M_STRING); buf_13.literal(1); buf_13.end();
        term_67 = buf_13.term();
      } sink.propertyNamed("$ColumnLocation", term_67);
      sink.start(_M__sTextChars);
      sink.start(_M__s); sink.start(_M_Builtin_sFormatNumber); sink.end(); sink.copy(term_3.ref());
      sink.end();
      sink.end();Term term_31;
      {
        BufferSink buf_79 = sink.context().makeBuffer(); buf_79.start(_M_STRING); buf_79.literal(1); buf_79.end();
        term_31 = buf_79.term();
      } sink.propertyNamed("$LineLocation", term_31);Term term_95;
      {
        BufferSink buf_36 = sink.context().makeBuffer(); buf_36.start(_M_STRING); buf_36.literal(2); buf_36.end();
        term_95 = buf_36.term();
      } sink.propertyNamed("$ColumnLocation", term_95);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_NumberToText, term_3);
  } final public static boolean _M_StringToText(Sink sink, int shared, int depth, Term term_37) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_15;
      {
        BufferSink buf_39 = sink.context().makeBuffer(); buf_39.start(_M_STRING); buf_39.literal(1); buf_39.end();
        term_15 = buf_39.term();
      } sink.propertyNamed("$LineLocation", term_15);Term term_14;
      {
        BufferSink buf_97 = sink.context().makeBuffer(); buf_97.start(_M_STRING); buf_97.literal(1); buf_97.end();
        term_14 = buf_97.term();
      } sink.propertyNamed("$ColumnLocation", term_14);
      sink.start(_M__sTextChars); sink.copy(term_37.ref());
      sink.end();Term term_76;
      {
        BufferSink buf_27 = sink.context().makeBuffer(); buf_27.start(_M_STRING); buf_27.literal(1); buf_27.end();
        term_76 = buf_27.term();
      } sink.propertyNamed("$LineLocation", term_76);Term term_36;
      {
        BufferSink buf_53 = sink.context().makeBuffer(); buf_53.start(_M_STRING); buf_53.literal(2); buf_53.end();
        term_36 = buf_53.term();
      } sink.propertyNamed("$ColumnLocation", term_36);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_StringToText, term_37);
  } final public static boolean _M_ReverseTextFold(Sink sink, int shared, int depth, Term term_40, Term term_57) {
    if (depth < 2000) {
      label: {
        term_40 = force(sink.context(), term_40);
        if (term_40.descriptor() != _M__sNil)
        {   break label;
        }
        /* #sep=term *//*Contract*/ sink.start(_M__sTextNil); sink.end(); return true;
      }
      label_27: {
        term_40 = force(sink.context(), term_40);
        if (term_40.descriptor() != _M__sCons)
        {   break label_27;
        }Term sub = forceSub(sink.context(), term_40, 0).ref();
        /* #1=sub */Term sub_26 = forceSub(sink.context(), term_40, 1).ref();
        sub_26 = force(sink.context(), sub_26);
        if (sub_26.descriptor() != _M__sNil)
        {   break label_27;
        }
        /* #sep=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed); sink.start(_M_AsText); sink.copy(sub.ref()); sink.end();
        sink.end();Term term_11;
        {
          BufferSink buf_86 = sink.context().makeBuffer(); buf_86.start(_M_STRING); buf_86.literal(1); buf_86.end();
          term_11 = buf_86.term();
        } sink.propertyNamed("$LineLocation", term_11);Term term_98;
        {
          BufferSink buf_18 = sink.context().makeBuffer(); buf_18.start(_M_STRING); buf_18.literal(1); buf_18.end();
          term_98 = buf_18.term();
        } sink.propertyNamed("$ColumnLocation", term_98);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); return true;
      }
      label_54: {
        term_40 = force(sink.context(), term_40);
        if (term_40.descriptor() != _M__sCons)
        {   break label_54;
        }Term sub_80 = forceSub(sink.context(), term_40, 0).ref();
        /* #1=sub */Term sub_48 = forceSub(sink.context(), term_40, 1).ref();
        sub_48 = force(sink.context(), sub_48);
        if (sub_48.descriptor() != _M__sCons)
        {   break label_54;
        }Term sub_44 = forceSub(sink.context(), sub_48, 0).ref();
        /* #2=sub */Term sub_85 = forceSub(sink.context(), sub_48, 1).ref();
        /* #s=sub */
        /* #sep=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed);
        sink.start(_M_AsText);
        sink.start(_M_ReverseTextFold);
        sink.start(_M__sCons); sink.copy(sub_44.ref()); sink.copy(sub_85.ref());
        sink.end(); sink.copy(term_57.ref());
        sink.end();
        sink.end();
        sink.end();Term term_39;
        {
          BufferSink buf_94 = sink.context().makeBuffer(); buf_94.start(_M_STRING); buf_94.literal(1); buf_94.end();
          term_39 = buf_94.term();
        } sink.propertyNamed("$LineLocation", term_39);Term term_20;
        {
          BufferSink buf_24 = sink.context().makeBuffer(); buf_24.start(_M_STRING); buf_24.literal(1); buf_24.end();
          term_20 = buf_24.term();
        } sink.propertyNamed("$ColumnLocation", term_20);
        sink.start(_M__sTextCons);Term term_32;
        {
          BufferSink buf_90 = sink.context().makeBuffer(); buf_90.start(_M_STRING); buf_90.literal(1); buf_90.end();
          term_32 = buf_90.term();
        } sink.propertyNamed("$LineLocation", term_32);Term term_49;
        {
          BufferSink buf_80 = sink.context().makeBuffer(); buf_80.start(_M_STRING); buf_80.literal(1); buf_80.end();
          term_49 = buf_80.term();
        } sink.propertyNamed("$ColumnLocation", term_49);
        sink.start(_M__sTextEmbed);Term term_47;
        {
          BufferSink buf_76 = sink.context().makeBuffer(); buf_76.start(_M_STRING); buf_76.literal(1); buf_76.end();
          term_47 = buf_76.term();
        } sink.propertyNamed("$LineLocation", term_47);Term term_92;
        {
          BufferSink buf_42 = sink.context().makeBuffer(); buf_42.start(_M_STRING); buf_42.literal(1); buf_42.end();
          term_92 = buf_42.term();
        } sink.propertyNamed("$ColumnLocation", term_92);
        sink.start(_M_AsText); sink.copy(term_57.ref());
        sink.end();
        sink.end();Term term_64;
        {
          BufferSink buf_83 = sink.context().makeBuffer(); buf_83.start(_M_STRING); buf_83.literal(1); buf_83.end();
          term_64 = buf_83.term();
        } sink.propertyNamed("$LineLocation", term_64);Term term_112;
        {
          BufferSink buf_23 = sink.context().makeBuffer(); buf_23.start(_M_STRING); buf_23.literal(35); buf_23.end();
          term_112 = buf_23.term();
        } sink.propertyNamed("$ColumnLocation", term_112);
        sink.start(_M__sTextCons);Term term_94;
        {
          BufferSink buf_82 = sink.context().makeBuffer(); buf_82.start(_M_STRING); buf_82.literal(1); buf_82.end();
          term_94 = buf_82.term();
        } sink.propertyNamed("$LineLocation", term_94);Term term_68;
        {
          BufferSink buf_30 = sink.context().makeBuffer(); buf_30.start(_M_STRING); buf_30.literal(35); buf_30.end();
          term_68 = buf_30.term();
        } sink.propertyNamed("$ColumnLocation", term_68);
        sink.start(_M__sTextEmbed);Term term_61;
        {
          BufferSink buf_57 = sink.context().makeBuffer(); buf_57.start(_M_STRING); buf_57.literal(1); buf_57.end();
          term_61 = buf_57.term();
        } sink.propertyNamed("$LineLocation", term_61);Term term_10;
        {
          BufferSink buf_130 = sink.context().makeBuffer();
          buf_130.start(_M_STRING); buf_130.literal(35);
          buf_130.end();
          term_10 = buf_130.term();
        } sink.propertyNamed("$ColumnLocation", term_10);
        sink.start(_M_AsText); sink.copy(sub_80.ref());
        sink.end();
        sink.end();Term term_84;
        {
          BufferSink buf_62 = sink.context().makeBuffer(); buf_62.start(_M_STRING); buf_62.literal(1); buf_62.end();
          term_84 = buf_62.term();
        } sink.propertyNamed("$LineLocation", term_84);Term term_43;
        {
          BufferSink buf_4 = sink.context().makeBuffer(); buf_4.start(_M_STRING); buf_4.literal(43); buf_4.end();
          term_43 = buf_4.term();
        } sink.propertyNamed("$ColumnLocation", term_43);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_ReverseTextFold, term_40, term_57);
  }  final public static boolean _M_TextFold1(Sink sink, int shared, int depth, Term term_4, Term term_90) {
    if (depth < 2000) {
      label_44: {
        term_4 = force(sink.context(), term_4);
        if (term_4.descriptor() != _M__sNil)
        {   break label_44;
        }
        /* #sep=term *//*Contract*/ sink.start(_M__sTextNil); sink.end(); return true;
      }
      label_28: {
        term_4 = force(sink.context(), term_4);
        if (term_4.descriptor() != _M__sCons)
        {   break label_28;
        }Term sub_10 = forceSub(sink.context(), term_4, 0).ref();
        /* #1=sub */Term sub_95 = forceSub(sink.context(), term_4, 1).ref();
        /* #s=sub */
        /* #sep=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed); sink.start(_M_AsText); sink.copy(term_90.ref()); sink.end();
        sink.end();Term term_33;
        {
          BufferSink buf_194 = sink.context().makeBuffer(); buf_194.start(_M_STRING); buf_194.literal(1); buf_194.end();
          term_33 = buf_194.term();
        } sink.propertyNamed("$LineLocation", term_33);Term term_78;
        {
          BufferSink buf_29 = sink.context().makeBuffer(); buf_29.start(_M_STRING); buf_29.literal(1); buf_29.end();
          term_78 = buf_29.term();
        } sink.propertyNamed("$ColumnLocation", term_78);
        sink.start(_M__sTextCons);Term term_18;
        {
          BufferSink buf_51 = sink.context().makeBuffer(); buf_51.start(_M_STRING); buf_51.literal(1); buf_51.end();
          term_18 = buf_51.term();
        } sink.propertyNamed("$LineLocation", term_18);Term term_29;
        {
          BufferSink buf_66 = sink.context().makeBuffer(); buf_66.start(_M_STRING); buf_66.literal(1); buf_66.end();
          term_29 = buf_66.term();
        } sink.propertyNamed("$ColumnLocation", term_29);
        sink.start(_M__sTextEmbed);Term term_5;
        {
          BufferSink buf_174 = sink.context().makeBuffer(); buf_174.start(_M_STRING); buf_174.literal(1); buf_174.end();
          term_5 = buf_174.term();
        } sink.propertyNamed("$LineLocation", term_5);Term term_127;
        {
          BufferSink buf_47 = sink.context().makeBuffer(); buf_47.start(_M_STRING); buf_47.literal(1); buf_47.end();
          term_127 = buf_47.term();
        } sink.propertyNamed("$ColumnLocation", term_127);
        sink.start(_M_AsText); sink.copy(sub_10.ref());
        sink.end();
        sink.end();Term term_129;
        {
          BufferSink buf_59 = sink.context().makeBuffer(); buf_59.start(_M_STRING); buf_59.literal(1); buf_59.end();
          term_129 = buf_59.term();
        } sink.propertyNamed("$LineLocation", term_129);Term term_69;
        {
          BufferSink buf_105 = sink.context().makeBuffer(); buf_105.start(_M_STRING); buf_105.literal(9); buf_105.end();
          term_69 = buf_105.term();
        } sink.propertyNamed("$ColumnLocation", term_69);
        sink.start(_M__sTextCons);Term term_54;
        {
          BufferSink buf_88 = sink.context().makeBuffer(); buf_88.start(_M_STRING); buf_88.literal(1); buf_88.end();
          term_54 = buf_88.term();
        } sink.propertyNamed("$LineLocation", term_54);Term term_28;
        {
          BufferSink buf_22 = sink.context().makeBuffer(); buf_22.start(_M_STRING); buf_22.literal(9); buf_22.end();
          term_28 = buf_22.term();
        } sink.propertyNamed("$ColumnLocation", term_28);
        sink.start(_M__sTextEmbed);Term term_70;
        {
          BufferSink buf_71 = sink.context().makeBuffer(); buf_71.start(_M_STRING); buf_71.literal(1); buf_71.end();
          term_70 = buf_71.term();
        } sink.propertyNamed("$LineLocation", term_70);Term term_72;
        {
          BufferSink buf_14 = sink.context().makeBuffer(); buf_14.start(_M_STRING); buf_14.literal(9); buf_14.end();
          term_72 = buf_14.term();
        } sink.propertyNamed("$ColumnLocation", term_72);
        sink.start(_M_AsText);
        sink.start(_M_TextFold1); sink.copy(sub_95.ref()); sink.copy(term_90.ref());
        sink.end();
        sink.end();
        sink.end();Term term_6;
        {
          BufferSink buf_70 = sink.context().makeBuffer(); buf_70.start(_M_STRING); buf_70.literal(1); buf_70.end();
          term_6 = buf_70.term();
        } sink.propertyNamed("$LineLocation", term_6);Term term_195;
        {
          BufferSink buf_56 = sink.context().makeBuffer(); buf_56.start(_M_STRING); buf_56.literal(15); buf_56.end();
          term_195 = buf_56.term();
        } sink.propertyNamed("$ColumnLocation", term_195);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_TextFold1, term_4, term_90);
  }  final public static boolean _M_TextFold(Sink sink, int shared, int depth, Term term_23, Term term_147) {
    if (depth < 2000) {
      label_10: {
        term_23 = force(sink.context(), term_23);
        if (term_23.descriptor() != _M__sNil)
        {   break label_10;
        }
        /* #sep=term *//*Contract*/ sink.start(_M__sTextNil); sink.end(); return true;
      }
      label_63: {
        term_23 = force(sink.context(), term_23);
        if (term_23.descriptor() != _M__sCons)
        {   break label_63;
        }Term sub_108 = forceSub(sink.context(), term_23, 0).ref();
        /* #1=sub */Term sub_50 = forceSub(sink.context(), term_23, 1).ref();
        /* #s=sub */
        /* #sep=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed); sink.start(_M_AsText); sink.copy(term_147.ref()); sink.end();
        sink.end();Term term_38;
        {
          BufferSink buf_89 = sink.context().makeBuffer(); buf_89.start(_M_STRING); buf_89.literal(1); buf_89.end();
          term_38 = buf_89.term();
        } sink.propertyNamed("$LineLocation", term_38);Term term_183;
        {
          BufferSink buf_9 = sink.context().makeBuffer(); buf_9.start(_M_STRING); buf_9.literal(1); buf_9.end();
          term_183 = buf_9.term();
        } sink.propertyNamed("$ColumnLocation", term_183);
        sink.start(_M__sTextCons);Term term_91;
        {
          BufferSink buf_25 = sink.context().makeBuffer(); buf_25.start(_M_STRING); buf_25.literal(1); buf_25.end();
          term_91 = buf_25.term();
        } sink.propertyNamed("$LineLocation", term_91);Term term_26;
        {
          BufferSink buf_177 = sink.context().makeBuffer(); buf_177.start(_M_STRING); buf_177.literal(1); buf_177.end();
          term_26 = buf_177.term();
        } sink.propertyNamed("$ColumnLocation", term_26);
        sink.start(_M__sTextEmbed);Term term_65;
        {
          BufferSink buf_0 = sink.context().makeBuffer(); buf_0.start(_M_STRING); buf_0.literal(1); buf_0.end();
          term_65 = buf_0.term();
        } sink.propertyNamed("$LineLocation", term_65);Term term_66;
        {
          BufferSink buf_69 = sink.context().makeBuffer(); buf_69.start(_M_STRING); buf_69.literal(1); buf_69.end();
          term_66 = buf_69.term();
        } sink.propertyNamed("$ColumnLocation", term_66);
        sink.start(_M_AsText); sink.copy(sub_108.ref());
        sink.end();
        sink.end();Term term_178;
        {
          BufferSink buf_8 = sink.context().makeBuffer(); buf_8.start(_M_STRING); buf_8.literal(1); buf_8.end();
          term_178 = buf_8.term();
        } sink.propertyNamed("$LineLocation", term_178);Term term_22;
        {
          BufferSink buf_123 = sink.context().makeBuffer(); buf_123.start(_M_STRING); buf_123.literal(9); buf_123.end();
          term_22 = buf_123.term();
        } sink.propertyNamed("$ColumnLocation", term_22);
        sink.start(_M__sTextCons);Term term_169;
        {
          BufferSink buf_181 = sink.context().makeBuffer(); buf_181.start(_M_STRING); buf_181.literal(1); buf_181.end();
          term_169 = buf_181.term();
        } sink.propertyNamed("$LineLocation", term_169);Term term_9;
        {
          BufferSink buf_43 = sink.context().makeBuffer(); buf_43.start(_M_STRING); buf_43.literal(9); buf_43.end();
          term_9 = buf_43.term();
        } sink.propertyNamed("$ColumnLocation", term_9);
        sink.start(_M__sTextEmbed);Term term_45;
        {
          BufferSink buf_61 = sink.context().makeBuffer(); buf_61.start(_M_STRING); buf_61.literal(1); buf_61.end();
          term_45 = buf_61.term();
        } sink.propertyNamed("$LineLocation", term_45);Term term_79;
        {
          BufferSink buf_38 = sink.context().makeBuffer(); buf_38.start(_M_STRING); buf_38.literal(9); buf_38.end();
          term_79 = buf_38.term();
        } sink.propertyNamed("$ColumnLocation", term_79);
        sink.start(_M_AsText);
        sink.start(_M_TextFold1); sink.copy(sub_50.ref()); sink.copy(term_147.ref());
        sink.end();
        sink.end();
        sink.end();Term term_17;
        {
          BufferSink buf_91 = sink.context().makeBuffer(); buf_91.start(_M_STRING); buf_91.literal(1); buf_91.end();
          term_17 = buf_91.term();
        } sink.propertyNamed("$LineLocation", term_17);Term term_55;
        {
          BufferSink buf_34 = sink.context().makeBuffer(); buf_34.start(_M_STRING); buf_34.literal(15); buf_34.end();
          term_55 = buf_34.term();
        } sink.propertyNamed("$ColumnLocation", term_55);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_TextFold, term_23, term_147);
  }  final public static boolean _M_Text_Mangle(Sink sink, int shared, int depth, Term term_1) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_132;
      {
        BufferSink buf_5 = sink.context().makeBuffer(); buf_5.start(_M_STRING); buf_5.literal(1); buf_5.end();
        term_132 = buf_5.term();
      } sink.propertyNamed("$LineLocation", term_132);Term term_224;
      {
        BufferSink buf_26 = sink.context().makeBuffer(); buf_26.start(_M_STRING); buf_26.literal(1); buf_26.end();
        term_224 = buf_26.term();
      } sink.propertyNamed("$ColumnLocation", term_224);
      sink.start(_M__sTextChars);
      sink.start(_M__s); sink.start(_M_Builtin_sMangle); sink.end(); sink.copy(term_1.ref());
      sink.end();
      sink.end();Term term_8;
      {
        BufferSink buf_92 = sink.context().makeBuffer(); buf_92.start(_M_STRING); buf_92.literal(1); buf_92.end();
        term_8 = buf_92.term();
      } sink.propertyNamed("$LineLocation", term_8);Term term_150;
      {
        BufferSink buf_93 = sink.context().makeBuffer(); buf_93.start(_M_STRING); buf_93.literal(2); buf_93.end();
        term_150 = buf_93.term();
      } sink.propertyNamed("$ColumnLocation", term_150);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Mangle, term_1);
  } final public static boolean _M_Text_Integer(Sink sink, int shared, int depth, Term term_229) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_177;
      {
        BufferSink buf_169 = sink.context().makeBuffer(); buf_169.start(_M_STRING); buf_169.literal(1); buf_169.end();
        term_177 = buf_169.term();
      } sink.propertyNamed("$LineLocation", term_177);Term term_46;
      {
        BufferSink buf_98 = sink.context().makeBuffer(); buf_98.start(_M_STRING); buf_98.literal(1); buf_98.end();
        term_46 = buf_98.term();
      } sink.propertyNamed("$ColumnLocation", term_46);
      sink.start(_M__sTextChars);
      sink.start(_M__s); sink.start(_M_Builtin_sFormatNumber); sink.end(); sink.copy(term_229.ref());
      sink.end();
      sink.end();Term term_85;
      {
        BufferSink buf_100 = sink.context().makeBuffer(); buf_100.start(_M_STRING); buf_100.literal(1); buf_100.end();
        term_85 = buf_100.term();
      } sink.propertyNamed("$LineLocation", term_85);Term term_52;
      {
        BufferSink buf_52 = sink.context().makeBuffer(); buf_52.start(_M_STRING); buf_52.literal(2); buf_52.end();
        term_52 = buf_52.term();
      } sink.propertyNamed("$ColumnLocation", term_52);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Integer, term_229);
  } final public static boolean _M_Text_QuoteEscape(Sink sink, int shared, int depth, Term term_59) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_136;
      {
        BufferSink buf_161 = sink.context().makeBuffer(); buf_161.start(_M_STRING); buf_161.literal(1); buf_161.end();
        term_136 = buf_161.term();
      } sink.propertyNamed("$LineLocation", term_136);Term term_80;
      {
        BufferSink buf_74 = sink.context().makeBuffer(); buf_74.start(_M_STRING); buf_74.literal(1); buf_74.end();
        term_80 = buf_74.term();
      } sink.propertyNamed("$ColumnLocation", term_80);
      sink.start(_M__sTextChars);
      sink.start(_M__s); sink.start(_M_Builtin_sEscape); sink.end(); sink.copy(term_59.ref());
      sink.end();
      sink.end();Term term_56;
      {
        BufferSink buf_81 = sink.context().makeBuffer(); buf_81.start(_M_STRING); buf_81.literal(1); buf_81.end();
        term_56 = buf_81.term();
      } sink.propertyNamed("$LineLocation", term_56);Term term_96;
      {
        BufferSink buf_17 = sink.context().makeBuffer(); buf_17.start(_M_STRING); buf_17.literal(2); buf_17.end();
        term_96 = buf_17.term();
      } sink.propertyNamed("$ColumnLocation", term_96);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_QuoteEscape, term_59);
  } final public static boolean _M_Text_Comment(Sink sink, int shared, int depth, Term term_89) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_12;
      {
        BufferSink buf_44 = sink.context().makeBuffer(); buf_44.start(_M_STRING); buf_44.literal(1); buf_44.end();
        term_12 = buf_44.term();
      } sink.propertyNamed("$LineLocation", term_12);Term term_24;
      {
        BufferSink buf_3 = sink.context().makeBuffer(); buf_3.start(_M_STRING); buf_3.literal(1); buf_3.end();
        term_24 = buf_3.term();
      } sink.propertyNamed("$ColumnLocation", term_24);
      sink.start(_M__sTextChars);
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("/*");
      sink.start(_M__s); sink.start(_M_Builtin_sReplace); sink.end(); sink.copy(term_89.ref()); sink.literal("*/"); sink.literal("*_/");
      sink.end(); sink.literal("*/");
      sink.end();
      sink.end();Term term_58;
      {
        BufferSink buf_131 = sink.context().makeBuffer(); buf_131.start(_M_STRING); buf_131.literal(1); buf_131.end();
        term_58 = buf_131.term();
      } sink.propertyNamed("$LineLocation", term_58);Term term_60;
      {
        BufferSink buf_114 = sink.context().makeBuffer(); buf_114.start(_M_STRING); buf_114.literal(2); buf_114.end();
        term_60 = buf_114.term();
      } sink.propertyNamed("$ColumnLocation", term_60);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Comment, term_89);
  } final public static boolean _M_Text_CommentToken(Sink sink, int shared, int depth, Term term_81) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_25;
      {
        BufferSink buf_101 = sink.context().makeBuffer(); buf_101.start(_M_STRING); buf_101.literal(1); buf_101.end();
        term_25 = buf_101.term();
      } sink.propertyNamed("$LineLocation", term_25);Term term_197;
      {
        BufferSink buf_7 = sink.context().makeBuffer(); buf_7.start(_M_STRING); buf_7.literal(1); buf_7.end();
        term_197 = buf_7.term();
      } sink.propertyNamed("$ColumnLocation", term_197);
      sink.start(_M__sTextChars);
      sink.start(_M__s); sink.start(_M_Builtin_sReplace); sink.end(); sink.copy(term_81.ref()); sink.literal("*/"); sink.literal("*_/");
      sink.end();
      sink.end();Term term_7;
      {
        BufferSink buf_138 = sink.context().makeBuffer(); buf_138.start(_M_STRING); buf_138.literal(1); buf_138.end();
        term_7 = buf_138.term();
      } sink.propertyNamed("$LineLocation", term_7);Term term_99;
      {
        BufferSink buf_106 = sink.context().makeBuffer(); buf_106.start(_M_STRING); buf_106.literal(2); buf_106.end();
        term_99 = buf_106.term();
      } sink.propertyNamed("$ColumnLocation", term_99);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_CommentToken, term_81);
  } final public static boolean _M_Text_Token(Sink sink, int shared, int depth, Term term_131) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_134;
      {
        BufferSink buf_77 = sink.context().makeBuffer(); buf_77.start(_M_STRING); buf_77.literal(1); buf_77.end();
        term_134 = buf_77.term();
      } sink.propertyNamed("$LineLocation", term_134);Term term_50;
      {
        BufferSink buf_31 = sink.context().makeBuffer(); buf_31.start(_M_STRING); buf_31.literal(1); buf_31.end();
        term_50 = buf_31.term();
      } sink.propertyNamed("$ColumnLocation", term_50);
      sink.start(_M__sTextChars); sink.copy(term_131.ref());
      sink.end();Term term_62;
      {
        BufferSink buf_16 = sink.context().makeBuffer(); buf_16.start(_M_STRING); buf_16.literal(1); buf_16.end();
        term_62 = buf_16.term();
      } sink.propertyNamed("$LineLocation", term_62);Term term_126;
      {
        BufferSink buf_20 = sink.context().makeBuffer(); buf_20.start(_M_STRING); buf_20.literal(2); buf_20.end();
        term_126 = buf_20.term();
      } sink.propertyNamed("$ColumnLocation", term_126);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Token, term_131);
  } final public static boolean _M_Text_User(Sink sink, int shared, int depth, Term term_190, Term term_41) {
    if (depth < 2000) {
      sink.start(_M__sTextCons); sink.start(_M__sTextChars); sink.literal("%"); sink.end();Term term_82;
      {
        BufferSink buf_50 = sink.context().makeBuffer(); buf_50.start(_M_STRING); buf_50.literal(1); buf_50.end();
        term_82 = buf_50.term();
      } sink.propertyNamed("$LineLocation", term_82);Term term_83;
      {
        BufferSink buf_28 = sink.context().makeBuffer(); buf_28.start(_M_STRING); buf_28.literal(1); buf_28.end();
        term_83 = buf_28.term();
      } sink.propertyNamed("$ColumnLocation", term_83);
      sink.start(_M__sTextCons);Term term_295;
      {
        BufferSink buf_33 = sink.context().makeBuffer(); buf_33.start(_M_STRING); buf_33.literal(1); buf_33.end();
        term_295 = buf_33.term();
      } sink.propertyNamed("$LineLocation", term_295);Term term_184;
      {
        BufferSink buf_143 = sink.context().makeBuffer(); buf_143.start(_M_STRING); buf_143.literal(2); buf_143.end();
        term_184 = buf_143.term();
      } sink.propertyNamed("$ColumnLocation", term_184);
      sink.start(_M__sTextChars); sink.copy(term_190.ref());
      sink.end();Term term_125;
      {
        BufferSink buf_248 = sink.context().makeBuffer(); buf_248.start(_M_STRING); buf_248.literal(1); buf_248.end();
        term_125 = buf_248.term();
      } sink.propertyNamed("$LineLocation", term_125);Term term_102;
      {
        BufferSink buf_72 = sink.context().makeBuffer(); buf_72.start(_M_STRING); buf_72.literal(3); buf_72.end();
        term_102 = buf_72.term();
      } sink.propertyNamed("$ColumnLocation", term_102);
      sink.start(_M__sTextCons);Term term_251;
      {
        BufferSink buf_40 = sink.context().makeBuffer(); buf_40.start(_M_STRING); buf_40.literal(1); buf_40.end();
        term_251 = buf_40.term();
      } sink.propertyNamed("$LineLocation", term_251);Term term_273;
      {
        BufferSink buf_121 = sink.context().makeBuffer(); buf_121.start(_M_STRING); buf_121.literal(17); buf_121.end();
        term_273 = buf_121.term();
      } sink.propertyNamed("$ColumnLocation", term_273);
      sink.start(_M__sTextChars); sink.literal("\u27e6\u27e6");
      sink.end();Term term_77;
      {
        BufferSink buf_41 = sink.context().makeBuffer(); buf_41.start(_M_STRING); buf_41.literal(1); buf_41.end();
        term_77 = buf_41.term();
      } sink.propertyNamed("$LineLocation", term_77);Term term_163;
      {
        BufferSink buf_15 = sink.context().makeBuffer(); buf_15.start(_M_STRING); buf_15.literal(18); buf_15.end();
        term_163 = buf_15.term();
      } sink.propertyNamed("$ColumnLocation", term_163);
      sink.start(_M__sTextCons);Term term_141;
      {
        BufferSink buf_1 = sink.context().makeBuffer(); buf_1.start(_M_STRING); buf_1.literal(1); buf_1.end();
        term_141 = buf_1.term();
      } sink.propertyNamed("$LineLocation", term_141);Term term_86;
      {
        BufferSink buf_199 = sink.context().makeBuffer(); buf_199.start(_M_STRING); buf_199.literal(18); buf_199.end();
        term_86 = buf_199.term();
      } sink.propertyNamed("$ColumnLocation", term_86);
      sink.start(_M__sTextEmbed);Term term_48;
      {
        BufferSink buf_151 = sink.context().makeBuffer(); buf_151.start(_M_STRING); buf_151.literal(1); buf_151.end();
        term_48 = buf_151.term();
      } sink.propertyNamed("$LineLocation", term_48);Term term_182;
      {
        BufferSink buf_95 = sink.context().makeBuffer(); buf_95.start(_M_STRING); buf_95.literal(18); buf_95.end();
        term_182 = buf_95.term();
      } sink.propertyNamed("$ColumnLocation", term_182);
      sink.start(_M_AsText); sink.copy(term_41.ref());
      sink.end();
      sink.end();Term term_27;
      {
        BufferSink buf_165 = sink.context().makeBuffer(); buf_165.start(_M_STRING); buf_165.literal(1); buf_165.end();
        term_27 = buf_165.term();
      } sink.propertyNamed("$LineLocation", term_27);Term term_21;
      {
        BufferSink buf_152 = sink.context().makeBuffer(); buf_152.start(_M_STRING); buf_152.literal(34); buf_152.end();
        term_21 = buf_152.term();
      } sink.propertyNamed("$ColumnLocation", term_21);
      sink.start(_M__sTextCons);Term term_30;
      {
        BufferSink buf_221 = sink.context().makeBuffer(); buf_221.start(_M_STRING); buf_221.literal(1); buf_221.end();
        term_30 = buf_221.term();
      } sink.propertyNamed("$LineLocation", term_30);Term term_124;
      {
        BufferSink buf_191 = sink.context().makeBuffer(); buf_191.start(_M_STRING); buf_191.literal(47); buf_191.end();
        term_124 = buf_191.term();
      } sink.propertyNamed("$ColumnLocation", term_124);
      sink.start(_M__sTextChars); sink.literal("\u27e7\u27e7");
      sink.end();Term term_142;
      {
        BufferSink buf_21 = sink.context().makeBuffer(); buf_21.start(_M_STRING); buf_21.literal(1); buf_21.end();
        term_142 = buf_21.term();
      } sink.propertyNamed("$LineLocation", term_142);Term term_19;
      {
        BufferSink buf_197 = sink.context().makeBuffer(); buf_197.start(_M_STRING); buf_197.literal(48); buf_197.end();
        term_19 = buf_197.term();
      } sink.propertyNamed("$ColumnLocation", term_19);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end();
      sink.end();
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_User, term_190, term_41);
  }  final public static boolean _M_Text_ConcatSep(Sink sink, int shared, int depth, Term term_185, Term term_306) {
    if (depth < 2000) {
      label_87: {
        term_185 = force(sink.context(), term_185);
        if (term_185.descriptor() != _M__sNil)
        {   break label_87;
        }
        /* #sep=term *//*Contract*/ sink.start(_M__sTextNil); sink.end(); return true;
      }
      label_32: {
        term_185 = force(sink.context(), term_185);
        if (term_185.descriptor() != _M__sCons)
        {   break label_32;
        }Term sub_74 = forceSub(sink.context(), term_185, 0).ref();
        /* #t1=sub */Term sub_98 = forceSub(sink.context(), term_185, 1).ref();
        sub_98 = force(sink.context(), sub_98);
        if (sub_98.descriptor() != _M__sNil)
        {   break label_32;
        }
        /* #sep=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed); sink.start(_M_AsText); sink.copy(sub_74.ref()); sink.end();
        sink.end();Term term_266;
        {
          BufferSink buf_55 = sink.context().makeBuffer(); buf_55.start(_M_STRING); buf_55.literal(1); buf_55.end();
          term_266 = buf_55.term();
        } sink.propertyNamed("$LineLocation", term_266);Term term_176;
        {
          BufferSink buf_73 = sink.context().makeBuffer(); buf_73.start(_M_STRING); buf_73.literal(1); buf_73.end();
          term_176 = buf_73.term();
        } sink.propertyNamed("$ColumnLocation", term_176);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end(); return true;
      }
      label_96: {
        term_185 = force(sink.context(), term_185);
        if (term_185.descriptor() != _M__sCons)
        {   break label_96;
        }Term sub_83 = forceSub(sink.context(), term_185, 0).ref();
        /* #t1=sub */Term sub_30 = forceSub(sink.context(), term_185, 1).ref();
        sub_30 = force(sink.context(), sub_30);
        if (sub_30.descriptor() != _M__sCons)
        {   break label_96;
        }Term sub_36 = forceSub(sink.context(), sub_30, 0).ref();
        /* #t2=sub */Term sub_52 = forceSub(sink.context(), sub_30, 1).ref();
        /* #ts=sub */
        /* #sep=term *//*Contract*/
        sink.start(_M__sTextCons);
        sink.start(_M__sTextEmbed); sink.start(_M_AsText); sink.copy(sub_83.ref()); sink.end();
        sink.end();Term term_157;
        {
          BufferSink buf_115 = sink.context().makeBuffer(); buf_115.start(_M_STRING); buf_115.literal(1); buf_115.end();
          term_157 = buf_115.term();
        } sink.propertyNamed("$LineLocation", term_157);Term term_331;
        {
          BufferSink buf_78 = sink.context().makeBuffer(); buf_78.start(_M_STRING); buf_78.literal(1); buf_78.end();
          term_331 = buf_78.term();
        } sink.propertyNamed("$ColumnLocation", term_331);
        sink.start(_M__sTextCons);Term term_140;
        {
          BufferSink buf_85 = sink.context().makeBuffer(); buf_85.start(_M_STRING); buf_85.literal(1); buf_85.end();
          term_140 = buf_85.term();
        } sink.propertyNamed("$LineLocation", term_140);Term term_0;
        {
          BufferSink buf_167 = sink.context().makeBuffer(); buf_167.start(_M_STRING); buf_167.literal(1); buf_167.end();
          term_0 = buf_167.term();
        } sink.propertyNamed("$ColumnLocation", term_0);
        sink.start(_M__sTextEmbed);Term term_267;
        {
          BufferSink buf_87 = sink.context().makeBuffer(); buf_87.start(_M_STRING); buf_87.literal(1); buf_87.end();
          term_267 = buf_87.term();
        } sink.propertyNamed("$LineLocation", term_267);Term term_491;
        {
          BufferSink buf_257 = sink.context().makeBuffer(); buf_257.start(_M_STRING); buf_257.literal(1); buf_257.end();
          term_491 = buf_257.term();
        } sink.propertyNamed("$ColumnLocation", term_491);
        sink.start(_M_AsText); sink.copy(term_306.ref());
        sink.end();
        sink.end();Term term_552;
        {
          BufferSink buf_10 = sink.context().makeBuffer(); buf_10.start(_M_STRING); buf_10.literal(1); buf_10.end();
          term_552 = buf_10.term();
        } sink.propertyNamed("$LineLocation", term_552);Term term_146;
        {
          BufferSink buf_102 = sink.context().makeBuffer(); buf_102.start(_M_STRING); buf_102.literal(6); buf_102.end();
          term_146 = buf_102.term();
        } sink.propertyNamed("$ColumnLocation", term_146);
        sink.start(_M__sTextCons);Term term_263;
        {
          BufferSink buf_159 = sink.context().makeBuffer(); buf_159.start(_M_STRING); buf_159.literal(1); buf_159.end();
          term_263 = buf_159.term();
        } sink.propertyNamed("$LineLocation", term_263);Term term_309;
        {
          BufferSink buf_283 = sink.context().makeBuffer(); buf_283.start(_M_STRING); buf_283.literal(6); buf_283.end();
          term_309 = buf_283.term();
        } sink.propertyNamed("$ColumnLocation", term_309);
        sink.start(_M__sTextEmbed);Term term_75;
        {
          BufferSink buf_46 = sink.context().makeBuffer(); buf_46.start(_M_STRING); buf_46.literal(1); buf_46.end();
          term_75 = buf_46.term();
        } sink.propertyNamed("$LineLocation", term_75);Term term_168;
        {
          BufferSink buf_49 = sink.context().makeBuffer(); buf_49.start(_M_STRING); buf_49.literal(6); buf_49.end();
          term_168 = buf_49.term();
        } sink.propertyNamed("$ColumnLocation", term_168);
        sink.start(_M_AsText);
        sink.start(_M_Text_ConcatSep);
        sink.start(_M__sCons); sink.copy(sub_36.ref()); sink.copy(sub_52.ref());
        sink.end(); sink.copy(term_306.ref());
        sink.end();
        sink.end();
        sink.end();Term term_42;
        {
          BufferSink buf_178 = sink.context().makeBuffer(); buf_178.start(_M_STRING); buf_178.literal(1); buf_178.end();
          term_42 = buf_178.term();
        } sink.propertyNamed("$LineLocation", term_42);Term term_220;
        {
          BufferSink buf_155 = sink.context().makeBuffer();
          buf_155.start(_M_STRING); buf_155.literal(12);
          buf_155.end();
          term_220 = buf_155.term();
        } sink.propertyNamed("$ColumnLocation", term_220);
        sink.start(_M__sTextNil);
        sink.end();
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_Text_ConcatSep, term_185, term_306);
  }  final public static boolean _M_Text_Concat(Sink sink, int shared, int depth, Term term_121) {
    if (depth < 2000) {
      sink.start(_M_Text_ConcatSep); sink.copy(term_121.ref()); sink.start(_M__sTextNil); sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Concat, term_121);
  } final public static boolean _M_Text_Text(Sink sink, int shared, int depth, Term term_119) {
    if (depth < 2000) {
      sink.start(_M_Text_User); sink.literal("n"); sink.copy(term_119.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Text, term_119);
  } final public static boolean _M_Text_String(Sink sink, int shared, int depth, Term term_149) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_2;
      {
        BufferSink buf_246 = sink.context().makeBuffer(); buf_246.start(_M_STRING); buf_246.literal(1); buf_246.end();
        term_2 = buf_246.term();
      } sink.propertyNamed("$LineLocation", term_2);Term term_427;
      {
        BufferSink buf_104 = sink.context().makeBuffer(); buf_104.start(_M_STRING); buf_104.literal(1); buf_104.end();
        term_427 = buf_104.term();
      } sink.propertyNamed("$ColumnLocation", term_427);
      sink.start(_M__sTextChars); sink.literal("\u2020\u2020");
      sink.end();Term term_304;
      {
        BufferSink buf_19 = sink.context().makeBuffer(); buf_19.start(_M_STRING); buf_19.literal(1); buf_19.end();
        term_304 = buf_19.term();
      } sink.propertyNamed("$LineLocation", term_304);Term term_74;
      {
        BufferSink buf_265 = sink.context().makeBuffer(); buf_265.start(_M_STRING); buf_265.literal(2); buf_265.end();
        term_74 = buf_265.term();
      } sink.propertyNamed("$ColumnLocation", term_74);
      sink.start(_M__sTextCons);Term term_154;
      {
        BufferSink buf_163 = sink.context().makeBuffer(); buf_163.start(_M_STRING); buf_163.literal(1); buf_163.end();
        term_154 = buf_163.term();
      } sink.propertyNamed("$LineLocation", term_154);Term term_187;
      {
        BufferSink buf_280 = sink.context().makeBuffer(); buf_280.start(_M_STRING); buf_280.literal(18); buf_280.end();
        term_187 = buf_280.term();
      } sink.propertyNamed("$ColumnLocation", term_187);
      sink.start(_M__sTextChars); sink.literal("\u00ab\u00ab");
      sink.end();Term term_196;
      {
        BufferSink buf_75 = sink.context().makeBuffer(); buf_75.start(_M_STRING); buf_75.literal(1); buf_75.end();
        term_196 = buf_75.term();
      } sink.propertyNamed("$LineLocation", term_196);Term term_111;
      {
        BufferSink buf_12 = sink.context().makeBuffer(); buf_12.start(_M_STRING); buf_12.literal(19); buf_12.end();
        term_111 = buf_12.term();
      } sink.propertyNamed("$ColumnLocation", term_111);
      sink.start(_M__sTextCons);Term term_283;
      {
        BufferSink buf_128 = sink.context().makeBuffer(); buf_128.start(_M_STRING); buf_128.literal(1); buf_128.end();
        term_283 = buf_128.term();
      } sink.propertyNamed("$LineLocation", term_283);Term term_155;
      {
        BufferSink buf_136 = sink.context().makeBuffer(); buf_136.start(_M_STRING); buf_136.literal(19); buf_136.end();
        term_155 = buf_136.term();
      } sink.propertyNamed("$ColumnLocation", term_155);
      sink.start(_M__sTextEmbed);Term term_341;
      {
        BufferSink buf_183 = sink.context().makeBuffer(); buf_183.start(_M_STRING); buf_183.literal(1); buf_183.end();
        term_341 = buf_183.term();
      } sink.propertyNamed("$LineLocation", term_341);Term term_165;
      {
        BufferSink buf_289 = sink.context().makeBuffer(); buf_289.start(_M_STRING); buf_289.literal(19); buf_289.end();
        term_165 = buf_289.term();
      } sink.propertyNamed("$ColumnLocation", term_165);
      sink.start(_M_AsText); sink.copy(term_149.ref());
      sink.end();
      sink.end();Term term_194;
      {
        BufferSink buf_157 = sink.context().makeBuffer(); buf_157.start(_M_STRING); buf_157.literal(1); buf_157.end();
        term_194 = buf_157.term();
      } sink.propertyNamed("$LineLocation", term_194);Term term_186;
      {
        BufferSink buf_64 = sink.context().makeBuffer(); buf_64.start(_M_STRING); buf_64.literal(35); buf_64.end();
        term_186 = buf_64.term();
      } sink.propertyNamed("$ColumnLocation", term_186);
      sink.start(_M__sTextCons);Term term_293;
      {
        BufferSink buf_119 = sink.context().makeBuffer(); buf_119.start(_M_STRING); buf_119.literal(1); buf_119.end();
        term_293 = buf_119.term();
      } sink.propertyNamed("$LineLocation", term_293);Term term_198;
      {
        BufferSink buf_127 = sink.context().makeBuffer(); buf_127.start(_M_STRING); buf_127.literal(48); buf_127.end();
        term_198 = buf_127.term();
      } sink.propertyNamed("$ColumnLocation", term_198);
      sink.start(_M__sTextChars); sink.literal("\u00bb\u00bb");
      sink.end();Term term_160;
      {
        BufferSink buf_144 = sink.context().makeBuffer(); buf_144.start(_M_STRING); buf_144.literal(1); buf_144.end();
        term_160 = buf_144.term();
      } sink.propertyNamed("$LineLocation", term_160);Term term_88;
      {
        BufferSink buf_175 = sink.context().makeBuffer(); buf_175.start(_M_STRING); buf_175.literal(49); buf_175.end();
        term_88 = buf_175.term();
      } sink.propertyNamed("$ColumnLocation", term_88);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end();
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_String, term_149);
  } final public static boolean _M_Text_Embed(Sink sink, int shared, int depth, Term term_151) {
    if (depth < 2000) {
      sink.start(_M__sTextCons);Term term_218;
      {
        BufferSink buf_250 = sink.context().makeBuffer(); buf_250.start(_M_STRING); buf_250.literal(1); buf_250.end();
        term_218 = buf_250.term();
      } sink.propertyNamed("$LineLocation", term_218);Term term_93;
      {
        BufferSink buf_225 = sink.context().makeBuffer(); buf_225.start(_M_STRING); buf_225.literal(1); buf_225.end();
        term_93 = buf_225.term();
      } sink.propertyNamed("$ColumnLocation", term_93);
      sink.start(_M__sTextChars); sink.literal("\u00ab\u00ab");
      sink.end();Term term_278;
      {
        BufferSink buf_54 = sink.context().makeBuffer(); buf_54.start(_M_STRING); buf_54.literal(1); buf_54.end();
        term_278 = buf_54.term();
      } sink.propertyNamed("$LineLocation", term_278);Term term_274;
      {
        BufferSink buf_272 = sink.context().makeBuffer(); buf_272.start(_M_STRING); buf_272.literal(2); buf_272.end();
        term_274 = buf_272.term();
      } sink.propertyNamed("$ColumnLocation", term_274);
      sink.start(_M__sTextCons);Term term_172;
      {
        BufferSink buf_293 = sink.context().makeBuffer(); buf_293.start(_M_STRING); buf_293.literal(1); buf_293.end();
        term_172 = buf_293.term();
      } sink.propertyNamed("$LineLocation", term_172);Term term_109;
      {
        BufferSink buf_116 = sink.context().makeBuffer(); buf_116.start(_M_STRING); buf_116.literal(2); buf_116.end();
        term_109 = buf_116.term();
      } sink.propertyNamed("$ColumnLocation", term_109);
      sink.start(_M__sTextEmbed);Term term_113;
      {
        BufferSink buf_99 = sink.context().makeBuffer(); buf_99.start(_M_STRING); buf_99.literal(1); buf_99.end();
        term_113 = buf_99.term();
      } sink.propertyNamed("$LineLocation", term_113);Term term_164;
      {
        BufferSink buf_176 = sink.context().makeBuffer(); buf_176.start(_M_STRING); buf_176.literal(2); buf_176.end();
        term_164 = buf_176.term();
      } sink.propertyNamed("$ColumnLocation", term_164);
      sink.start(_M_AsText); sink.copy(term_151.ref());
      sink.end();
      sink.end();Term term_217;
      {
        BufferSink buf_58 = sink.context().makeBuffer(); buf_58.start(_M_STRING); buf_58.literal(1); buf_58.end();
        term_217 = buf_58.term();
      } sink.propertyNamed("$LineLocation", term_217);Term term_106;
      {
        BufferSink buf_239 = sink.context().makeBuffer(); buf_239.start(_M_STRING); buf_239.literal(18); buf_239.end();
        term_106 = buf_239.term();
      } sink.propertyNamed("$ColumnLocation", term_106);
      sink.start(_M__sTextCons);Term term_456;
      {
        BufferSink buf_148 = sink.context().makeBuffer(); buf_148.start(_M_STRING); buf_148.literal(1); buf_148.end();
        term_456 = buf_148.term();
      } sink.propertyNamed("$LineLocation", term_456);Term term_139;
      {
        BufferSink buf_303 = sink.context().makeBuffer(); buf_303.start(_M_STRING); buf_303.literal(31); buf_303.end();
        term_139 = buf_303.term();
      } sink.propertyNamed("$ColumnLocation", term_139);
      sink.start(_M__sTextChars); sink.literal("\u00bb\u00bb");
      sink.end();Term term_117;
      {
        BufferSink buf_364 = sink.context().makeBuffer(); buf_364.start(_M_STRING); buf_364.literal(1); buf_364.end();
        term_117 = buf_364.term();
      } sink.propertyNamed("$LineLocation", term_117);Term term_16;
      {
        BufferSink buf_145 = sink.context().makeBuffer(); buf_145.start(_M_STRING); buf_145.literal(32); buf_145.end();
        term_16 = buf_145.term();
      } sink.propertyNamed("$ColumnLocation", term_16);
      sink.start(_M__sTextNil);
      sink.end();
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_Text_Embed, term_151);
  } final public static boolean _M_AsText(Sink sink, int shared, int depth, Term term_152) {
    if (depth < 2000) { sink.copy(term_152.ref()); return true;
    }
    return thunk(sink, _M_AsText, term_152);
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