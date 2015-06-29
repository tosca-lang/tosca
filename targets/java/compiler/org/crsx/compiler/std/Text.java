/* START MODULE std/text.crs.java */
/** Generated File */

package org.crsx.compiler.std;

import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;

import org.crsx.runtime.*;
import org.crsx.runtime.ConstructionDescriptor.*;
import static org.crsx.runtime.Primitives.*;
import static org.crsx.compiler.std.Core.*;
import static org.crsx.compiler.std.List.*;

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
	final public static DynamicFunctionDescriptor _M_ReverseTextFold = makeFunction(
			"ReverseTextFold", Text.class, "_M_ReverseTextFold");
	final public static DynamicFunctionDescriptor _M_TextFold1 = makeFunction("TextFold1", Text.class, "_M_TextFold1");
	final public static DynamicFunctionDescriptor _M_TextFold = makeFunction("TextFold", Text.class, "_M_TextFold");
	final public static DynamicFunctionDescriptor _M_Text_Mangle = makeFunction("Text-Mangle", Text.class, "_M_Text_Mangle");
	final public static DynamicFunctionDescriptor _M_Text_Integer = makeFunction("Text-Integer", Text.class, "_M_Text_Integer");
	final public static DynamicFunctionDescriptor _M_Text_QuoteEscape = makeFunction(
			"Text-QuoteEscape", Text.class, "_M_Text_QuoteEscape");
	final public static DynamicFunctionDescriptor _M_Text_Comment = makeFunction("Text-Comment", Text.class, "_M_Text_Comment");
	final public static DynamicFunctionDescriptor _M_Text_CommentToken = makeFunction(
			"Text-CommentToken", Text.class, "_M_Text_CommentToken");
	final public static DynamicFunctionDescriptor _M_Text_Token = makeFunction("Text-Token", Text.class, "_M_Text_Token");
	final public static DynamicFunctionDescriptor _M_Text_User = makeFunction("Text-User", Text.class, "_M_Text_User");
	final public static DynamicFunctionDescriptor _M_Text_ConcatSep = makeFunction(
			"Text-ConcatSep", Text.class, "_M_Text_ConcatSep");
	final public static DynamicFunctionDescriptor _M_Text_Concat = makeFunction("Text-Concat", Text.class, "_M_Text_Concat");
	final public static DynamicFunctionDescriptor _M_Text_Text = makeFunction("Text-Text", Text.class, "_M_Text_Text");
	final public static DynamicFunctionDescriptor _M_Text_String = makeFunction("Text-String", Text.class, "_M_Text_String");
	final public static DynamicFunctionDescriptor _M_Text_Embed = makeFunction("Text-Embed", Text.class, "_M_Text_Embed");
	final public static DynamicFunctionDescriptor _M_AsText = makeFunction("AsText", Text.class, "_M_AsText");

	final public static boolean _M_TextToString(Sink sink, int shared, int depth, Term term)
	{
		if (depth < 2000)
		{
			sink.start(_M__s);
			sink.start(_M_Builtin_sShow);
			sink.end();
			sink.copy(term);
			sink.end();
			return true;
		}
		return thunk(sink, _M_TextToString, term);
	}

	final public static boolean _M_NumberToText(Sink sink, int shared, int depth, Term term_96)
	{
		if (depth < 2000)
		{
			sink.start(_M__sTextCons);
			Term term_46;
			{
				BufferSink buf = sink.context().makeBuffer();
				buf.start(_M_STRING);
				buf.literal(1);
				buf.end();
				term_46 = buf.term();
			}
			sink.propertyNamed("$LineLocation", term_46);
			Term term_0;
			{
				BufferSink buf_22 = sink.context().makeBuffer();
				buf_22.start(_M_STRING);
				buf_22.literal(1);
				buf_22.end();
				term_0 = buf_22.term();
			}
			sink.propertyNamed("$ColumnLocation", term_0);
			sink.start(_M__sTextChars);
			sink.start(_M__s);
			sink.start(_M_Builtin_sFormatNumber);
			sink.end();
			sink.copy(term_96);
			sink.end();
			sink.end();
			Term term_9;
			{
				BufferSink buf_71 = sink.context().makeBuffer();
				buf_71.start(_M_STRING);
				buf_71.literal(1);
				buf_71.end();
				term_9 = buf_71.term();
			}
			sink.propertyNamed("$LineLocation", term_9);
			Term term_11;
			{
				BufferSink buf_31 = sink.context().makeBuffer();
				buf_31.start(_M_STRING);
				buf_31.literal(2);
				buf_31.end();
				term_11 = buf_31.term();
			}
			sink.propertyNamed("$ColumnLocation", term_11);
			sink.start(_M__sTextNil);
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_NumberToText, term_96);
	}

	final public static boolean _M_StringToText(Sink sink, int shared, int depth, Term term_57)
	{
		if (depth < 2000)
		{
			sink.start(_M__sTextCons);
			Term term_31;
			{
				BufferSink buf_11 = sink.context().makeBuffer();
				buf_11.start(_M_STRING);
				buf_11.literal(1);
				buf_11.end();
				term_31 = buf_11.term();
			}
			sink.propertyNamed("$LineLocation", term_31);
			Term term_40;
			{
				BufferSink buf_10 = sink.context().makeBuffer();
				buf_10.start(_M_STRING);
				buf_10.literal(1);
				buf_10.end();
				term_40 = buf_10.term();
			}
			sink.propertyNamed("$ColumnLocation", term_40);
			sink.start(_M__sTextChars);
			sink.copy(term_57);
			sink.end();
			Term term_56;
			{
				BufferSink buf_72 = sink.context().makeBuffer();
				buf_72.start(_M_STRING);
				buf_72.literal(1);
				buf_72.end();
				term_56 = buf_72.term();
			}
			sink.propertyNamed("$LineLocation", term_56);
			Term term_26;
			{
				BufferSink buf_16 = sink.context().makeBuffer();
				buf_16.start(_M_STRING);
				buf_16.literal(2);
				buf_16.end();
				term_26 = buf_16.term();
			}
			sink.propertyNamed("$ColumnLocation", term_26);
			sink.start(_M__sTextNil);
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_StringToText, term_57);
	}

	final public static boolean _M_ReverseTextFold(Sink sink, int shared, int depth, Term term_166, Term term_48)
	{
		if (depth < 2000)
		{
			label :
			{
				if (!term_166.symbol().equals("$Nil"))
				{
					break label;
				}
				/* #sep=term *//*Contract*/sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
			label_96 :
			{
				if (!term_166.symbol().equals("$Cons"))
				{
					break label_96;
				}
				Term sub = term_166.sub(0).ref();
				/* #1=sub */Term sub_78 = term_166.sub(1).ref();
				if (!sub_78.symbol().equals("$Nil"))
				{
					break label_96;
				}
				/* #sep=term *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextEmbed);
				sink.start(_M_AsText);
				sink.copy(sub);
				sink.end();
				sink.end();
				Term term_10;
				{
					BufferSink buf_8 = sink.context().makeBuffer();
					buf_8.start(_M_STRING);
					buf_8.literal(1);
					buf_8.end();
					term_10 = buf_8.term();
				}
				sink.propertyNamed("$LineLocation", term_10);
				Term term_19;
				{
					BufferSink buf_99 = sink.context().makeBuffer();
					buf_99.start(_M_STRING);
					buf_99.literal(1);
					buf_99.end();
					term_19 = buf_99.term();
				}
				sink.propertyNamed("$ColumnLocation", term_19);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				return true;
			}
			label_81 :
			{
				if (!term_166.symbol().equals("$Cons"))
				{
					break label_81;
				}
				Term sub_11 = term_166.sub(0).ref();
				/* #1=sub */Term sub_85 = term_166.sub(1).ref();
				if (!sub_85.symbol().equals("$Cons"))
				{
					break label_81;
				}
				Term sub_67 = sub_85.sub(0).ref();
				/* #2=sub */Term sub_69 = sub_85.sub(1).ref();
				/* #s=sub */
				/* #sep=term *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextEmbed);
				sink.start(_M_AsText);
				sink.start(_M_ReverseTextFold);
				sink.start(_M__sCons);
				sink.copy(sub_67);
				sink.copy(sub_69);
				sink.end();
				sink.copy(term_48);
				sink.end();
				sink.end();
				sink.end();
				Term term_43;
				{
					BufferSink buf_18 = sink.context().makeBuffer();
					buf_18.start(_M_STRING);
					buf_18.literal(1);
					buf_18.end();
					term_43 = buf_18.term();
				}
				sink.propertyNamed("$LineLocation", term_43);
				Term term_92;
				{
					BufferSink buf_74 = sink.context().makeBuffer();
					buf_74.start(_M_STRING);
					buf_74.literal(1);
					buf_74.end();
					term_92 = buf_74.term();
				}
				sink.propertyNamed("$ColumnLocation", term_92);
				sink.start(_M__sTextCons);
				Term term_45;
				{
					BufferSink buf_95 = sink.context().makeBuffer();
					buf_95.start(_M_STRING);
					buf_95.literal(1);
					buf_95.end();
					term_45 = buf_95.term();
				}
				sink.propertyNamed("$LineLocation", term_45);
				Term term_85;
				{
					BufferSink buf_62 = sink.context().makeBuffer();
					buf_62.start(_M_STRING);
					buf_62.literal(1);
					buf_62.end();
					term_85 = buf_62.term();
				}
				sink.propertyNamed("$ColumnLocation", term_85);
				sink.start(_M__sTextEmbed);
				Term term_73;
				{
					BufferSink buf_68 = sink.context().makeBuffer();
					buf_68.start(_M_STRING);
					buf_68.literal(1);
					buf_68.end();
					term_73 = buf_68.term();
				}
				sink.propertyNamed("$LineLocation", term_73);
				Term term_20;
				{
					BufferSink buf_35 = sink.context().makeBuffer();
					buf_35.start(_M_STRING);
					buf_35.literal(1);
					buf_35.end();
					term_20 = buf_35.term();
				}
				sink.propertyNamed("$ColumnLocation", term_20);
				sink.start(_M_AsText);
				sink.copy(term_48);
				sink.end();
				sink.end();
				Term term_78;
				{
					BufferSink buf_51 = sink.context().makeBuffer();
					buf_51.start(_M_STRING);
					buf_51.literal(1);
					buf_51.end();
					term_78 = buf_51.term();
				}
				sink.propertyNamed("$LineLocation", term_78);
				Term term_71;
				{
					BufferSink buf_90 = sink.context().makeBuffer();
					buf_90.start(_M_STRING);
					buf_90.literal(35);
					buf_90.end();
					term_71 = buf_90.term();
				}
				sink.propertyNamed("$ColumnLocation", term_71);
				sink.start(_M__sTextCons);
				Term term_62;
				{
					BufferSink buf_92 = sink.context().makeBuffer();
					buf_92.start(_M_STRING);
					buf_92.literal(1);
					buf_92.end();
					term_62 = buf_92.term();
				}
				sink.propertyNamed("$LineLocation", term_62);
				Term term_17;
				{
					BufferSink buf_43 = sink.context().makeBuffer();
					buf_43.start(_M_STRING);
					buf_43.literal(35);
					buf_43.end();
					term_17 = buf_43.term();
				}
				sink.propertyNamed("$ColumnLocation", term_17);
				sink.start(_M__sTextEmbed);
				Term term_87;
				{
					BufferSink buf_86 = sink.context().makeBuffer();
					buf_86.start(_M_STRING);
					buf_86.literal(1);
					buf_86.end();
					term_87 = buf_86.term();
				}
				sink.propertyNamed("$LineLocation", term_87);
				Term term_81;
				{
					BufferSink buf_4 = sink.context().makeBuffer();
					buf_4.start(_M_STRING);
					buf_4.literal(35);
					buf_4.end();
					term_81 = buf_4.term();
				}
				sink.propertyNamed("$ColumnLocation", term_81);
				sink.start(_M_AsText);
				sink.copy(sub_11);
				sink.end();
				sink.end();
				Term term_113;
				{
					BufferSink buf_49 = sink.context().makeBuffer();
					buf_49.start(_M_STRING);
					buf_49.literal(1);
					buf_49.end();
					term_113 = buf_49.term();
				}
				sink.propertyNamed("$LineLocation", term_113);
				Term term_98;
				{
					BufferSink buf_42 = sink.context().makeBuffer();
					buf_42.start(_M_STRING);
					buf_42.literal(43);
					buf_42.end();
					term_98 = buf_42.term();
				}
				sink.propertyNamed("$ColumnLocation", term_98);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_ReverseTextFold, term_166, term_48);
	}

	final public static boolean _M_TextFold1(Sink sink, int shared, int depth, Term term_102, Term term_86)
	{
		if (depth < 2000)
		{
			label_26 :
			{
				if (!term_102.symbol().equals("$Nil"))
				{
					break label_26;
				}
				/* #sep=term *//*Contract*/sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
			label_14 :
			{
				if (!term_102.symbol().equals("$Cons"))
				{
					break label_14;
				}
				Term sub_24 = term_102.sub(0).ref();
				/* #1=sub */Term sub_29 = term_102.sub(1).ref();
				/* #s=sub */
				/* #sep=term *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextEmbed);
				sink.start(_M_AsText);
				sink.copy(term_86);
				sink.end();
				sink.end();
				Term term_121;
				{
					BufferSink buf_87 = sink.context().makeBuffer();
					buf_87.start(_M_STRING);
					buf_87.literal(1);
					buf_87.end();
					term_121 = buf_87.term();
				}
				sink.propertyNamed("$LineLocation", term_121);
				Term term_6;
				{
					BufferSink buf_7 = sink.context().makeBuffer();
					buf_7.start(_M_STRING);
					buf_7.literal(1);
					buf_7.end();
					term_6 = buf_7.term();
				}
				sink.propertyNamed("$ColumnLocation", term_6);
				sink.start(_M__sTextCons);
				Term term_59;
				{
					BufferSink buf_53 = sink.context().makeBuffer();
					buf_53.start(_M_STRING);
					buf_53.literal(1);
					buf_53.end();
					term_59 = buf_53.term();
				}
				sink.propertyNamed("$LineLocation", term_59);
				Term term_88;
				{
					BufferSink buf_77 = sink.context().makeBuffer();
					buf_77.start(_M_STRING);
					buf_77.literal(1);
					buf_77.end();
					term_88 = buf_77.term();
				}
				sink.propertyNamed("$ColumnLocation", term_88);
				sink.start(_M__sTextEmbed);
				Term term_179;
				{
					BufferSink buf_64 = sink.context().makeBuffer();
					buf_64.start(_M_STRING);
					buf_64.literal(1);
					buf_64.end();
					term_179 = buf_64.term();
				}
				sink.propertyNamed("$LineLocation", term_179);
				Term term_52;
				{
					BufferSink buf_37 = sink.context().makeBuffer();
					buf_37.start(_M_STRING);
					buf_37.literal(1);
					buf_37.end();
					term_52 = buf_37.term();
				}
				sink.propertyNamed("$ColumnLocation", term_52);
				sink.start(_M_AsText);
				sink.copy(sub_24);
				sink.end();
				sink.end();
				Term term_58;
				{
					BufferSink buf_25 = sink.context().makeBuffer();
					buf_25.start(_M_STRING);
					buf_25.literal(1);
					buf_25.end();
					term_58 = buf_25.term();
				}
				sink.propertyNamed("$LineLocation", term_58);
				Term term_50;
				{
					BufferSink buf_195 = sink.context().makeBuffer();
					buf_195.start(_M_STRING);
					buf_195.literal(9);
					buf_195.end();
					term_50 = buf_195.term();
				}
				sink.propertyNamed("$ColumnLocation", term_50);
				sink.start(_M__sTextCons);
				Term term_8;
				{
					BufferSink buf_75 = sink.context().makeBuffer();
					buf_75.start(_M_STRING);
					buf_75.literal(1);
					buf_75.end();
					term_8 = buf_75.term();
				}
				sink.propertyNamed("$LineLocation", term_8);
				Term term_91;
				{
					BufferSink buf_78 = sink.context().makeBuffer();
					buf_78.start(_M_STRING);
					buf_78.literal(9);
					buf_78.end();
					term_91 = buf_78.term();
				}
				sink.propertyNamed("$ColumnLocation", term_91);
				sink.start(_M__sTextEmbed);
				Term term_30;
				{
					BufferSink buf_28 = sink.context().makeBuffer();
					buf_28.start(_M_STRING);
					buf_28.literal(1);
					buf_28.end();
					term_30 = buf_28.term();
				}
				sink.propertyNamed("$LineLocation", term_30);
				Term term_93;
				{
					BufferSink buf_84 = sink.context().makeBuffer();
					buf_84.start(_M_STRING);
					buf_84.literal(9);
					buf_84.end();
					term_93 = buf_84.term();
				}
				sink.propertyNamed("$ColumnLocation", term_93);
				sink.start(_M_AsText);
				sink.start(_M_TextFold1);
				sink.copy(sub_29);
				sink.copy(term_86);
				sink.end();
				sink.end();
				sink.end();
				Term term_64;
				{
					BufferSink buf_131 = sink.context().makeBuffer();
					buf_131.start(_M_STRING);
					buf_131.literal(1);
					buf_131.end();
					term_64 = buf_131.term();
				}
				sink.propertyNamed("$LineLocation", term_64);
				Term term_36;
				{
					BufferSink buf_89 = sink.context().makeBuffer();
					buf_89.start(_M_STRING);
					buf_89.literal(15);
					buf_89.end();
					term_36 = buf_89.term();
				}
				sink.propertyNamed("$ColumnLocation", term_36);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_TextFold1, term_102, term_86);
	}

	final public static boolean _M_TextFold(Sink sink, int shared, int depth, Term term_4, Term term_2)
	{
		if (depth < 2000)
		{
			label_17 :
			{
				if (!term_4.symbol().equals("$Nil"))
				{
					break label_17;
				}
				/* #sep=term *//*Contract*/sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
			label_21 :
			{
				if (!term_4.symbol().equals("$Cons"))
				{
					break label_21;
				}
				Term sub_26 = term_4.sub(0).ref();
				/* #1=sub */Term sub_12 = term_4.sub(1).ref();
				/* #s=sub */
				/* #sep=term *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextEmbed);
				sink.start(_M_AsText);
				sink.copy(term_2);
				sink.end();
				sink.end();
				Term term_76;
				{
					BufferSink buf_17 = sink.context().makeBuffer();
					buf_17.start(_M_STRING);
					buf_17.literal(1);
					buf_17.end();
					term_76 = buf_17.term();
				}
				sink.propertyNamed("$LineLocation", term_76);
				Term term_134;
				{
					BufferSink buf_2 = sink.context().makeBuffer();
					buf_2.start(_M_STRING);
					buf_2.literal(1);
					buf_2.end();
					term_134 = buf_2.term();
				}
				sink.propertyNamed("$ColumnLocation", term_134);
				sink.start(_M__sTextCons);
				Term term_38;
				{
					BufferSink buf_12 = sink.context().makeBuffer();
					buf_12.start(_M_STRING);
					buf_12.literal(1);
					buf_12.end();
					term_38 = buf_12.term();
				}
				sink.propertyNamed("$LineLocation", term_38);
				Term term_83;
				{
					BufferSink buf_101 = sink.context().makeBuffer();
					buf_101.start(_M_STRING);
					buf_101.literal(1);
					buf_101.end();
					term_83 = buf_101.term();
				}
				sink.propertyNamed("$ColumnLocation", term_83);
				sink.start(_M__sTextEmbed);
				Term term_14;
				{
					BufferSink buf_187 = sink.context().makeBuffer();
					buf_187.start(_M_STRING);
					buf_187.literal(1);
					buf_187.end();
					term_14 = buf_187.term();
				}
				sink.propertyNamed("$LineLocation", term_14);
				Term term_115;
				{
					BufferSink buf_32 = sink.context().makeBuffer();
					buf_32.start(_M_STRING);
					buf_32.literal(1);
					buf_32.end();
					term_115 = buf_32.term();
				}
				sink.propertyNamed("$ColumnLocation", term_115);
				sink.start(_M_AsText);
				sink.copy(sub_26);
				sink.end();
				sink.end();
				Term term_37;
				{
					BufferSink buf_67 = sink.context().makeBuffer();
					buf_67.start(_M_STRING);
					buf_67.literal(1);
					buf_67.end();
					term_37 = buf_67.term();
				}
				sink.propertyNamed("$LineLocation", term_37);
				Term term_22;
				{
					BufferSink buf_33 = sink.context().makeBuffer();
					buf_33.start(_M_STRING);
					buf_33.literal(9);
					buf_33.end();
					term_22 = buf_33.term();
				}
				sink.propertyNamed("$ColumnLocation", term_22);
				sink.start(_M__sTextCons);
				Term term_82;
				{
					BufferSink buf_52 = sink.context().makeBuffer();
					buf_52.start(_M_STRING);
					buf_52.literal(1);
					buf_52.end();
					term_82 = buf_52.term();
				}
				sink.propertyNamed("$LineLocation", term_82);
				Term term_23;
				{
					BufferSink buf_81 = sink.context().makeBuffer();
					buf_81.start(_M_STRING);
					buf_81.literal(9);
					buf_81.end();
					term_23 = buf_81.term();
				}
				sink.propertyNamed("$ColumnLocation", term_23);
				sink.start(_M__sTextEmbed);
				Term term_24;
				{
					BufferSink buf_44 = sink.context().makeBuffer();
					buf_44.start(_M_STRING);
					buf_44.literal(1);
					buf_44.end();
					term_24 = buf_44.term();
				}
				sink.propertyNamed("$LineLocation", term_24);
				Term term_186;
				{
					BufferSink buf_122 = sink.context().makeBuffer();
					buf_122.start(_M_STRING);
					buf_122.literal(9);
					buf_122.end();
					term_186 = buf_122.term();
				}
				sink.propertyNamed("$ColumnLocation", term_186);
				sink.start(_M_AsText);
				sink.start(_M_TextFold1);
				sink.copy(sub_12);
				sink.copy(term_2);
				sink.end();
				sink.end();
				sink.end();
				Term term_60;
				{
					BufferSink buf_59 = sink.context().makeBuffer();
					buf_59.start(_M_STRING);
					buf_59.literal(1);
					buf_59.end();
					term_60 = buf_59.term();
				}
				sink.propertyNamed("$LineLocation", term_60);
				Term term_156;
				{
					BufferSink buf_40 = sink.context().makeBuffer();
					buf_40.start(_M_STRING);
					buf_40.literal(15);
					buf_40.end();
					term_156 = buf_40.term();
				}
				sink.propertyNamed("$ColumnLocation", term_156);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_TextFold, term_4, term_2);
	}

	final public static boolean _M_Text_Mangle(Sink sink, int shared, int depth, Term term_49)
	{
		if (depth < 2000)
		{
			sink.start(_M__sTextCons);
			Term term_47;
			{
				BufferSink buf_1 = sink.context().makeBuffer();
				buf_1.start(_M_STRING);
				buf_1.literal(1);
				buf_1.end();
				term_47 = buf_1.term();
			}
			sink.propertyNamed("$LineLocation", term_47);
			Term term_41;
			{
				BufferSink buf_119 = sink.context().makeBuffer();
				buf_119.start(_M_STRING);
				buf_119.literal(1);
				buf_119.end();
				term_41 = buf_119.term();
			}
			sink.propertyNamed("$ColumnLocation", term_41);
			sink.start(_M__sTextChars);
			sink.start(_M__s);
			sink.start(_M_Builtin_sMangle);
			sink.end();
			sink.copy(term_49);
			sink.end();
			sink.end();
			Term term_55;
			{
				BufferSink buf_76 = sink.context().makeBuffer();
				buf_76.start(_M_STRING);
				buf_76.literal(1);
				buf_76.end();
				term_55 = buf_76.term();
			}
			sink.propertyNamed("$LineLocation", term_55);
			Term term_77;
			{
				BufferSink buf_189 = sink.context().makeBuffer();
				buf_189.start(_M_STRING);
				buf_189.literal(2);
				buf_189.end();
				term_77 = buf_189.term();
			}
			sink.propertyNamed("$ColumnLocation", term_77);
			sink.start(_M__sTextNil);
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_Text_Mangle, term_49);
	}

	final public static boolean _M_Text_Integer(Sink sink, int shared, int depth, Term term_16)
	{
		if (depth < 2000)
		{
			sink.start(_M__sTextCons);
			Term term_39;
			{
				BufferSink buf_0 = sink.context().makeBuffer();
				buf_0.start(_M_STRING);
				buf_0.literal(1);
				buf_0.end();
				term_39 = buf_0.term();
			}
			sink.propertyNamed("$LineLocation", term_39);
			Term term_42;
			{
				BufferSink buf_19 = sink.context().makeBuffer();
				buf_19.start(_M_STRING);
				buf_19.literal(1);
				buf_19.end();
				term_42 = buf_19.term();
			}
			sink.propertyNamed("$ColumnLocation", term_42);
			sink.start(_M__sTextChars);
			sink.start(_M__s);
			sink.start(_M_Builtin_sFormatNumber);
			sink.end();
			sink.copy(term_16);
			sink.end();
			sink.end();
			Term term_111;
			{
				BufferSink buf_153 = sink.context().makeBuffer();
				buf_153.start(_M_STRING);
				buf_153.literal(1);
				buf_153.end();
				term_111 = buf_153.term();
			}
			sink.propertyNamed("$LineLocation", term_111);
			Term term_33;
			{
				BufferSink buf_236 = sink.context().makeBuffer();
				buf_236.start(_M_STRING);
				buf_236.literal(2);
				buf_236.end();
				term_33 = buf_236.term();
			}
			sink.propertyNamed("$ColumnLocation", term_33);
			sink.start(_M__sTextNil);
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_Text_Integer, term_16);
	}

	final public static boolean _M_Text_QuoteEscape(Sink sink, int shared, int depth, Term term_54)
	{
		if (depth < 2000)
		{
			sink.start(_M__sTextCons);
			Term term_34;
			{
				BufferSink buf_30 = sink.context().makeBuffer();
				buf_30.start(_M_STRING);
				buf_30.literal(1);
				buf_30.end();
				term_34 = buf_30.term();
			}
			sink.propertyNamed("$LineLocation", term_34);
			Term term_70;
			{
				BufferSink buf_57 = sink.context().makeBuffer();
				buf_57.start(_M_STRING);
				buf_57.literal(1);
				buf_57.end();
				term_70 = buf_57.term();
			}
			sink.propertyNamed("$ColumnLocation", term_70);
			sink.start(_M__sTextChars);
			sink.start(_M__s);
			sink.start(_M_Builtin_sEscape);
			sink.end();
			sink.copy(term_54);
			sink.end();
			sink.end();
			Term term_28;
			{
				BufferSink buf_124 = sink.context().makeBuffer();
				buf_124.start(_M_STRING);
				buf_124.literal(1);
				buf_124.end();
				term_28 = buf_124.term();
			}
			sink.propertyNamed("$LineLocation", term_28);
			Term term_375;
			{
				BufferSink buf_121 = sink.context().makeBuffer();
				buf_121.start(_M_STRING);
				buf_121.literal(2);
				buf_121.end();
				term_375 = buf_121.term();
			}
			sink.propertyNamed("$ColumnLocation", term_375);
			sink.start(_M__sTextNil);
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_Text_QuoteEscape, term_54);
	}

	final public static boolean _M_Text_Comment(Sink sink, int shared, int depth, Term term_79)
	{
		if (depth < 2000)
		{
			sink.start(_M__sTextCons);
			Term term_122;
			{
				BufferSink buf_98 = sink.context().makeBuffer();
				buf_98.start(_M_STRING);
				buf_98.literal(1);
				buf_98.end();
				term_122 = buf_98.term();
			}
			sink.propertyNamed("$LineLocation", term_122);
			Term term_125;
			{
				BufferSink buf_65 = sink.context().makeBuffer();
				buf_65.start(_M_STRING);
				buf_65.literal(1);
				buf_65.end();
				term_125 = buf_65.term();
			}
			sink.propertyNamed("$ColumnLocation", term_125);
			sink.start(_M__sTextChars);
			sink.start(_M__s);
			sink.start(_M_Builtin_sColon);
			sink.end();
			sink.literal("/*");
			sink.start(_M__s);
			sink.start(_M_Builtin_sReplace);
			sink.end();
			sink.copy(term_79);
			sink.literal("*/");
			sink.literal("*_/");
			sink.end();
			sink.literal("*/");
			sink.end();
			sink.end();
			Term term_67;
			{
				BufferSink buf_36 = sink.context().makeBuffer();
				buf_36.start(_M_STRING);
				buf_36.literal(1);
				buf_36.end();
				term_67 = buf_36.term();
			}
			sink.propertyNamed("$LineLocation", term_67);
			Term term_7;
			{
				BufferSink buf_70 = sink.context().makeBuffer();
				buf_70.start(_M_STRING);
				buf_70.literal(2);
				buf_70.end();
				term_7 = buf_70.term();
			}
			sink.propertyNamed("$ColumnLocation", term_7);
			sink.start(_M__sTextNil);
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_Text_Comment, term_79);
	}

	final public static boolean _M_Text_CommentToken(Sink sink, int shared, int depth, Term term_95)
	{
		if (depth < 2000)
		{
			sink.start(_M__sTextCons);
			Term term_152;
			{
				BufferSink buf_140 = sink.context().makeBuffer();
				buf_140.start(_M_STRING);
				buf_140.literal(1);
				buf_140.end();
				term_152 = buf_140.term();
			}
			sink.propertyNamed("$LineLocation", term_152);
			Term term_292;
			{
				BufferSink buf_184 = sink.context().makeBuffer();
				buf_184.start(_M_STRING);
				buf_184.literal(1);
				buf_184.end();
				term_292 = buf_184.term();
			}
			sink.propertyNamed("$ColumnLocation", term_292);
			sink.start(_M__sTextChars);
			sink.start(_M__s);
			sink.start(_M_Builtin_sReplace);
			sink.end();
			sink.copy(term_95);
			sink.literal("*/");
			sink.literal("*_/");
			sink.end();
			sink.end();
			Term term_252;
			{
				BufferSink buf_103 = sink.context().makeBuffer();
				buf_103.start(_M_STRING);
				buf_103.literal(1);
				buf_103.end();
				term_252 = buf_103.term();
			}
			sink.propertyNamed("$LineLocation", term_252);
			Term term_27;
			{
				BufferSink buf_177 = sink.context().makeBuffer();
				buf_177.start(_M_STRING);
				buf_177.literal(2);
				buf_177.end();
				term_27 = buf_177.term();
			}
			sink.propertyNamed("$ColumnLocation", term_27);
			sink.start(_M__sTextNil);
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_Text_CommentToken, term_95);
	}

	final public static boolean _M_Text_Token(Sink sink, int shared, int depth, Term term_94)
	{
		if (depth < 2000)
		{
			sink.start(_M__sTextCons);
			Term term_29;
			{
				BufferSink buf_66 = sink.context().makeBuffer();
				buf_66.start(_M_STRING);
				buf_66.literal(1);
				buf_66.end();
				term_29 = buf_66.term();
			}
			sink.propertyNamed("$LineLocation", term_29);
			Term term_44;
			{
				BufferSink buf_126 = sink.context().makeBuffer();
				buf_126.start(_M_STRING);
				buf_126.literal(1);
				buf_126.end();
				term_44 = buf_126.term();
			}
			sink.propertyNamed("$ColumnLocation", term_44);
			sink.start(_M__sTextChars);
			sink.copy(term_94);
			sink.end();
			Term term_195;
			{
				BufferSink buf_96 = sink.context().makeBuffer();
				buf_96.start(_M_STRING);
				buf_96.literal(1);
				buf_96.end();
				term_195 = buf_96.term();
			}
			sink.propertyNamed("$LineLocation", term_195);
			Term term_32;
			{
				BufferSink buf_29 = sink.context().makeBuffer();
				buf_29.start(_M_STRING);
				buf_29.literal(2);
				buf_29.end();
				term_32 = buf_29.term();
			}
			sink.propertyNamed("$ColumnLocation", term_32);
			sink.start(_M__sTextNil);
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_Text_Token, term_94);
	}

	final public static boolean _M_Text_User(Sink sink, int shared, int depth, Term term_97, Term term_184)
	{
		if (depth < 2000)
		{
			sink.start(_M__sTextCons);
			sink.start(_M__sTextChars);
			sink.literal("%");
			sink.end();
			Term term_218;
			{
				BufferSink buf_278 = sink.context().makeBuffer();
				buf_278.start(_M_STRING);
				buf_278.literal(1);
				buf_278.end();
				term_218 = buf_278.term();
			}
			sink.propertyNamed("$LineLocation", term_218);
			Term term_65;
			{
				BufferSink buf_94 = sink.context().makeBuffer();
				buf_94.start(_M_STRING);
				buf_94.literal(1);
				buf_94.end();
				term_65 = buf_94.term();
			}
			sink.propertyNamed("$ColumnLocation", term_65);
			sink.start(_M__sTextCons);
			Term term_143;
			{
				BufferSink buf_322 = sink.context().makeBuffer();
				buf_322.start(_M_STRING);
				buf_322.literal(1);
				buf_322.end();
				term_143 = buf_322.term();
			}
			sink.propertyNamed("$LineLocation", term_143);
			Term term_183;
			{
				BufferSink buf_133 = sink.context().makeBuffer();
				buf_133.start(_M_STRING);
				buf_133.literal(2);
				buf_133.end();
				term_183 = buf_133.term();
			}
			sink.propertyNamed("$ColumnLocation", term_183);
			sink.start(_M__sTextChars);
			sink.copy(term_97);
			sink.end();
			Term term_51;
			{
				BufferSink buf_160 = sink.context().makeBuffer();
				buf_160.start(_M_STRING);
				buf_160.literal(1);
				buf_160.end();
				term_51 = buf_160.term();
			}
			sink.propertyNamed("$LineLocation", term_51);
			Term term_139;
			{
				BufferSink buf_46 = sink.context().makeBuffer();
				buf_46.start(_M_STRING);
				buf_46.literal(3);
				buf_46.end();
				term_139 = buf_46.term();
			}
			sink.propertyNamed("$ColumnLocation", term_139);
			sink.start(_M__sTextCons);
			Term term_18;
			{
				BufferSink buf_209 = sink.context().makeBuffer();
				buf_209.start(_M_STRING);
				buf_209.literal(1);
				buf_209.end();
				term_18 = buf_209.term();
			}
			sink.propertyNamed("$LineLocation", term_18);
			Term term_299;
			{
				BufferSink buf_190 = sink.context().makeBuffer();
				buf_190.start(_M_STRING);
				buf_190.literal(17);
				buf_190.end();
				term_299 = buf_190.term();
			}
			sink.propertyNamed("$ColumnLocation", term_299);
			sink.start(_M__sTextChars);
			sink.literal("\u27ea");
			sink.end();
			Term term_90;
			{
				BufferSink buf_24 = sink.context().makeBuffer();
				buf_24.start(_M_STRING);
				buf_24.literal(1);
				buf_24.end();
				term_90 = buf_24.term();
			}
			sink.propertyNamed("$LineLocation", term_90);
			Term term_234;
			{
				BufferSink buf_73 = sink.context().makeBuffer();
				buf_73.start(_M_STRING);
				buf_73.literal(18);
				buf_73.end();
				term_234 = buf_73.term();
			}
			sink.propertyNamed("$ColumnLocation", term_234);
			sink.start(_M__sTextCons);
			Term term_1;
			{
				BufferSink buf_13 = sink.context().makeBuffer();
				buf_13.start(_M_STRING);
				buf_13.literal(1);
				buf_13.end();
				term_1 = buf_13.term();
			}
			sink.propertyNamed("$LineLocation", term_1);
			Term term_13;
			{
				BufferSink buf_5 = sink.context().makeBuffer();
				buf_5.start(_M_STRING);
				buf_5.literal(18);
				buf_5.end();
				term_13 = buf_5.term();
			}
			sink.propertyNamed("$ColumnLocation", term_13);
			sink.start(_M__sTextEmbed);
			Term term_248;
			{
				BufferSink buf_111 = sink.context().makeBuffer();
				buf_111.start(_M_STRING);
				buf_111.literal(1);
				buf_111.end();
				term_248 = buf_111.term();
			}
			sink.propertyNamed("$LineLocation", term_248);
			Term term_69;
			{
				BufferSink buf_55 = sink.context().makeBuffer();
				buf_55.start(_M_STRING);
				buf_55.literal(18);
				buf_55.end();
				term_69 = buf_55.term();
			}
			sink.propertyNamed("$ColumnLocation", term_69);
			sink.start(_M_AsText);
			sink.copy(term_184);
			sink.end();
			sink.end();
			Term term_53;
			{
				BufferSink buf_97 = sink.context().makeBuffer();
				buf_97.start(_M_STRING);
				buf_97.literal(1);
				buf_97.end();
				term_53 = buf_97.term();
			}
			sink.propertyNamed("$LineLocation", term_53);
			Term term_185;
			{
				BufferSink buf_47 = sink.context().makeBuffer();
				buf_47.start(_M_STRING);
				buf_47.literal(28);
				buf_47.end();
				term_185 = buf_47.term();
			}
			sink.propertyNamed("$ColumnLocation", term_185);
			sink.start(_M__sTextCons);
			Term term_108;
			{
				BufferSink buf_115 = sink.context().makeBuffer();
				buf_115.start(_M_STRING);
				buf_115.literal(1);
				buf_115.end();
				term_108 = buf_115.term();
			}
			sink.propertyNamed("$LineLocation", term_108);
			Term term_164;
			{
				BufferSink buf_114 = sink.context().makeBuffer();
				buf_114.start(_M_STRING);
				buf_114.literal(41);
				buf_114.end();
				term_164 = buf_114.term();
			}
			sink.propertyNamed("$ColumnLocation", term_164);
			sink.start(_M__sTextChars);
			sink.literal("\u27eb");
			sink.end();
			Term term_191;
			{
				BufferSink buf_60 = sink.context().makeBuffer();
				buf_60.start(_M_STRING);
				buf_60.literal(1);
				buf_60.end();
				term_191 = buf_60.term();
			}
			sink.propertyNamed("$LineLocation", term_191);
			Term term_170;
			{
				BufferSink buf_23 = sink.context().makeBuffer();
				buf_23.start(_M_STRING);
				buf_23.literal(42);
				buf_23.end();
				term_170 = buf_23.term();
			}
			sink.propertyNamed("$ColumnLocation", term_170);
			sink.start(_M__sTextNil);
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_Text_User, term_97, term_184);
	}

	final public static boolean _M_Text_ConcatSep(Sink sink, int shared, int depth, Term term_63, Term term_72)
	{
		if (depth < 2000)
		{
			label_83 :
			{
				if (!term_63.symbol().equals("$Nil"))
				{
					break label_83;
				}
				/* #sep=term *//*Contract*/sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
			label_77 :
			{
				if (!term_63.symbol().equals("$Cons"))
				{
					break label_77;
				}
				Term sub_23 = term_63.sub(0).ref();
				/* #t1=sub */Term sub_95 = term_63.sub(1).ref();
				if (!sub_95.symbol().equals("$Nil"))
				{
					break label_77;
				}
				/* #sep=term *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextEmbed);
				sink.start(_M_AsText);
				sink.copy(sub_23);
				sink.end();
				sink.end();
				Term term_159;
				{
					BufferSink buf_80 = sink.context().makeBuffer();
					buf_80.start(_M_STRING);
					buf_80.literal(1);
					buf_80.end();
					term_159 = buf_80.term();
				}
				sink.propertyNamed("$LineLocation", term_159);
				Term term_192;
				{
					BufferSink buf_116 = sink.context().makeBuffer();
					buf_116.start(_M_STRING);
					buf_116.literal(1);
					buf_116.end();
					term_192 = buf_116.term();
				}
				sink.propertyNamed("$ColumnLocation", term_192);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				return true;
			}
			label_42 :
			{
				if (!term_63.symbol().equals("$Cons"))
				{
					break label_42;
				}
				Term sub_56 = term_63.sub(0).ref();
				/* #t1=sub */Term sub_82 = term_63.sub(1).ref();
				if (!sub_82.symbol().equals("$Cons"))
				{
					break label_42;
				}
				Term sub_17 = sub_82.sub(0).ref();
				/* #t2=sub */Term sub_87 = sub_82.sub(1).ref();
				/* #ts=sub */
				/* #sep=term *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextEmbed);
				sink.start(_M_AsText);
				sink.copy(sub_56);
				sink.end();
				sink.end();
				Term term_66;
				{
					BufferSink buf_299 = sink.context().makeBuffer();
					buf_299.start(_M_STRING);
					buf_299.literal(1);
					buf_299.end();
					term_66 = buf_299.term();
				}
				sink.propertyNamed("$LineLocation", term_66);
				Term term_297;
				{
					BufferSink buf_21 = sink.context().makeBuffer();
					buf_21.start(_M_STRING);
					buf_21.literal(1);
					buf_21.end();
					term_297 = buf_21.term();
				}
				sink.propertyNamed("$ColumnLocation", term_297);
				sink.start(_M__sTextCons);
				Term term_269;
				{
					BufferSink buf_56 = sink.context().makeBuffer();
					buf_56.start(_M_STRING);
					buf_56.literal(1);
					buf_56.end();
					term_269 = buf_56.term();
				}
				sink.propertyNamed("$LineLocation", term_269);
				Term term_84;
				{
					BufferSink buf_91 = sink.context().makeBuffer();
					buf_91.start(_M_STRING);
					buf_91.literal(1);
					buf_91.end();
					term_84 = buf_91.term();
				}
				sink.propertyNamed("$ColumnLocation", term_84);
				sink.start(_M__sTextEmbed);
				Term term_109;
				{
					BufferSink buf_182 = sink.context().makeBuffer();
					buf_182.start(_M_STRING);
					buf_182.literal(1);
					buf_182.end();
					term_109 = buf_182.term();
				}
				sink.propertyNamed("$LineLocation", term_109);
				Term term_25;
				{
					BufferSink buf_50 = sink.context().makeBuffer();
					buf_50.start(_M_STRING);
					buf_50.literal(1);
					buf_50.end();
					term_25 = buf_50.term();
				}
				sink.propertyNamed("$ColumnLocation", term_25);
				sink.start(_M_AsText);
				sink.copy(term_72);
				sink.end();
				sink.end();
				Term term_153;
				{
					BufferSink buf_191 = sink.context().makeBuffer();
					buf_191.start(_M_STRING);
					buf_191.literal(1);
					buf_191.end();
					term_153 = buf_191.term();
				}
				sink.propertyNamed("$LineLocation", term_153);
				Term term_106;
				{
					BufferSink buf_41 = sink.context().makeBuffer();
					buf_41.start(_M_STRING);
					buf_41.literal(6);
					buf_41.end();
					term_106 = buf_41.term();
				}
				sink.propertyNamed("$ColumnLocation", term_106);
				sink.start(_M__sTextCons);
				Term term_35;
				{
					BufferSink buf_172 = sink.context().makeBuffer();
					buf_172.start(_M_STRING);
					buf_172.literal(1);
					buf_172.end();
					term_35 = buf_172.term();
				}
				sink.propertyNamed("$LineLocation", term_35);
				Term term_75;
				{
					BufferSink buf_218 = sink.context().makeBuffer();
					buf_218.start(_M_STRING);
					buf_218.literal(6);
					buf_218.end();
					term_75 = buf_218.term();
				}
				sink.propertyNamed("$ColumnLocation", term_75);
				sink.start(_M__sTextEmbed);
				Term term_261;
				{
					BufferSink buf_146 = sink.context().makeBuffer();
					buf_146.start(_M_STRING);
					buf_146.literal(1);
					buf_146.end();
					term_261 = buf_146.term();
				}
				sink.propertyNamed("$LineLocation", term_261);
				Term term_182;
				{
					BufferSink buf_93 = sink.context().makeBuffer();
					buf_93.start(_M_STRING);
					buf_93.literal(6);
					buf_93.end();
					term_182 = buf_93.term();
				}
				sink.propertyNamed("$ColumnLocation", term_182);
				sink.start(_M_AsText);
				sink.start(_M_Text_ConcatSep);
				sink.start(_M__sCons);
				sink.copy(sub_17);
				sink.copy(sub_87);
				sink.end();
				sink.copy(term_72);
				sink.end();
				sink.end();
				sink.end();
				Term term_161;
				{
					BufferSink buf_34 = sink.context().makeBuffer();
					buf_34.start(_M_STRING);
					buf_34.literal(1);
					buf_34.end();
					term_161 = buf_34.term();
				}
				sink.propertyNamed("$LineLocation", term_161);
				Term term_173;
				{
					BufferSink buf_69 = sink.context().makeBuffer();
					buf_69.start(_M_STRING);
					buf_69.literal(12);
					buf_69.end();
					term_173 = buf_69.term();
				}
				sink.propertyNamed("$ColumnLocation", term_173);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Text_ConcatSep, term_63, term_72);
	}

	final public static boolean _M_Text_Concat(Sink sink, int shared, int depth, Term term_258)
	{
		if (depth < 2000)
		{
			sink.start(_M_Text_ConcatSep);
			sink.copy(term_258);
			sink.start(_M__sTextNil);
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_Text_Concat, term_258);
	}

	final public static boolean _M_Text_Text(Sink sink, int shared, int depth, Term term_138)
	{
		if (depth < 2000)
		{
			sink.start(_M_Text_User);
			sink.literal("n");
			sink.copy(term_138);
			sink.end();
			return true;
		}
		return thunk(sink, _M_Text_Text, term_138);
	}

	final public static boolean _M_Text_String(Sink sink, int shared, int depth, Term term_145)
	{
		if (depth < 2000)
		{
			sink.start(_M__sTextCons);
			Term term_249;
			{
				BufferSink buf_141 = sink.context().makeBuffer();
				buf_141.start(_M_STRING);
				buf_141.literal(1);
				buf_141.end();
				term_249 = buf_141.term();
			}
			sink.propertyNamed("$LineLocation", term_249);
			Term term_128;
			{
				BufferSink buf_136 = sink.context().makeBuffer();
				buf_136.start(_M_STRING);
				buf_136.literal(1);
				buf_136.end();
				term_128 = buf_136.term();
			}
			sink.propertyNamed("$ColumnLocation", term_128);
			sink.start(_M__sTextChars);
			sink.literal("\u2020\u2020");
			sink.end();
			Term term_400;
			{
				BufferSink buf_54 = sink.context().makeBuffer();
				buf_54.start(_M_STRING);
				buf_54.literal(1);
				buf_54.end();
				term_400 = buf_54.term();
			}
			sink.propertyNamed("$LineLocation", term_400);
			Term term_160;
			{
				BufferSink buf_9 = sink.context().makeBuffer();
				buf_9.start(_M_STRING);
				buf_9.literal(2);
				buf_9.end();
				term_160 = buf_9.term();
			}
			sink.propertyNamed("$ColumnLocation", term_160);
			sink.start(_M__sTextCons);
			Term term_266;
			{
				BufferSink buf_175 = sink.context().makeBuffer();
				buf_175.start(_M_STRING);
				buf_175.literal(1);
				buf_175.end();
				term_266 = buf_175.term();
			}
			sink.propertyNamed("$LineLocation", term_266);
			Term term_181;
			{
				BufferSink buf_176 = sink.context().makeBuffer();
				buf_176.start(_M_STRING);
				buf_176.literal(18);
				buf_176.end();
				term_181 = buf_176.term();
			}
			sink.propertyNamed("$ColumnLocation", term_181);
			sink.start(_M__sTextChars);
			sink.literal("\u00ab\u00ab");
			sink.end();
			Term term_204;
			{
				BufferSink buf_48 = sink.context().makeBuffer();
				buf_48.start(_M_STRING);
				buf_48.literal(1);
				buf_48.end();
				term_204 = buf_48.term();
			}
			sink.propertyNamed("$LineLocation", term_204);
			Term term_211;
			{
				BufferSink buf_6 = sink.context().makeBuffer();
				buf_6.start(_M_STRING);
				buf_6.literal(19);
				buf_6.end();
				term_211 = buf_6.term();
			}
			sink.propertyNamed("$ColumnLocation", term_211);
			sink.start(_M__sTextCons);
			Term term_354;
			{
				BufferSink buf_108 = sink.context().makeBuffer();
				buf_108.start(_M_STRING);
				buf_108.literal(1);
				buf_108.end();
				term_354 = buf_108.term();
			}
			sink.propertyNamed("$LineLocation", term_354);
			Term term_194;
			{
				BufferSink buf_180 = sink.context().makeBuffer();
				buf_180.start(_M_STRING);
				buf_180.literal(19);
				buf_180.end();
				term_194 = buf_180.term();
			}
			sink.propertyNamed("$ColumnLocation", term_194);
			sink.start(_M__sTextEmbed);
			Term term_171;
			{
				BufferSink buf_245 = sink.context().makeBuffer();
				buf_245.start(_M_STRING);
				buf_245.literal(1);
				buf_245.end();
				term_171 = buf_245.term();
			}
			sink.propertyNamed("$LineLocation", term_171);
			Term term_116;
			{
				BufferSink buf_88 = sink.context().makeBuffer();
				buf_88.start(_M_STRING);
				buf_88.literal(19);
				buf_88.end();
				term_116 = buf_88.term();
			}
			sink.propertyNamed("$ColumnLocation", term_116);
			sink.start(_M_AsText);
			sink.copy(term_145);
			sink.end();
			sink.end();
			Term term_127;
			{
				BufferSink buf_123 = sink.context().makeBuffer();
				buf_123.start(_M_STRING);
				buf_123.literal(1);
				buf_123.end();
				term_127 = buf_123.term();
			}
			sink.propertyNamed("$LineLocation", term_127);
			Term term_257;
			{
				BufferSink buf_269 = sink.context().makeBuffer();
				buf_269.start(_M_STRING);
				buf_269.literal(35);
				buf_269.end();
				term_257 = buf_269.term();
			}
			sink.propertyNamed("$ColumnLocation", term_257);
			sink.start(_M__sTextCons);
			Term term_178;
			{
				BufferSink buf_159 = sink.context().makeBuffer();
				buf_159.start(_M_STRING);
				buf_159.literal(1);
				buf_159.end();
				term_178 = buf_159.term();
			}
			sink.propertyNamed("$LineLocation", term_178);
			Term term_284;
			{
				BufferSink buf_178 = sink.context().makeBuffer();
				buf_178.start(_M_STRING);
				buf_178.literal(48);
				buf_178.end();
				term_284 = buf_178.term();
			}
			sink.propertyNamed("$ColumnLocation", term_284);
			sink.start(_M__sTextChars);
			sink.literal("\u00bb\u00bb");
			sink.end();
			Term term_217;
			{
				BufferSink buf_211 = sink.context().makeBuffer();
				buf_211.start(_M_STRING);
				buf_211.literal(1);
				buf_211.end();
				term_217 = buf_211.term();
			}
			sink.propertyNamed("$LineLocation", term_217);
			Term term_201;
			{
				BufferSink buf_346 = sink.context().makeBuffer();
				buf_346.start(_M_STRING);
				buf_346.literal(49);
				buf_346.end();
				term_201 = buf_346.term();
			}
			sink.propertyNamed("$ColumnLocation", term_201);
			sink.start(_M__sTextNil);
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_Text_String, term_145);
	}

	final public static boolean _M_Text_Embed(Sink sink, int shared, int depth, Term term_107)
	{
		if (depth < 2000)
		{
			sink.start(_M__sTextCons);
			Term term_227;
			{
				BufferSink buf_231 = sink.context().makeBuffer();
				buf_231.start(_M_STRING);
				buf_231.literal(1);
				buf_231.end();
				term_227 = buf_231.term();
			}
			sink.propertyNamed("$LineLocation", term_227);
			Term term_112;
			{
				BufferSink buf_154 = sink.context().makeBuffer();
				buf_154.start(_M_STRING);
				buf_154.literal(1);
				buf_154.end();
				term_112 = buf_154.term();
			}
			sink.propertyNamed("$ColumnLocation", term_112);
			sink.start(_M__sTextChars);
			sink.literal("\u00ab\u00ab");
			sink.end();
			Term term_130;
			{
				BufferSink buf_179 = sink.context().makeBuffer();
				buf_179.start(_M_STRING);
				buf_179.literal(1);
				buf_179.end();
				term_130 = buf_179.term();
			}
			sink.propertyNamed("$LineLocation", term_130);
			Term term_176;
			{
				BufferSink buf_157 = sink.context().makeBuffer();
				buf_157.start(_M_STRING);
				buf_157.literal(2);
				buf_157.end();
				term_176 = buf_157.term();
			}
			sink.propertyNamed("$ColumnLocation", term_176);
			sink.start(_M__sTextCons);
			Term term_175;
			{
				BufferSink buf_15 = sink.context().makeBuffer();
				buf_15.start(_M_STRING);
				buf_15.literal(1);
				buf_15.end();
				term_175 = buf_15.term();
			}
			sink.propertyNamed("$LineLocation", term_175);
			Term term_172;
			{
				BufferSink buf_255 = sink.context().makeBuffer();
				buf_255.start(_M_STRING);
				buf_255.literal(2);
				buf_255.end();
				term_172 = buf_255.term();
			}
			sink.propertyNamed("$ColumnLocation", term_172);
			sink.start(_M__sTextEmbed);
			Term term_288;
			{
				BufferSink buf_258 = sink.context().makeBuffer();
				buf_258.start(_M_STRING);
				buf_258.literal(1);
				buf_258.end();
				term_288 = buf_258.term();
			}
			sink.propertyNamed("$LineLocation", term_288);
			Term term_154;
			{
				BufferSink buf_45 = sink.context().makeBuffer();
				buf_45.start(_M_STRING);
				buf_45.literal(2);
				buf_45.end();
				term_154 = buf_45.term();
			}
			sink.propertyNamed("$ColumnLocation", term_154);
			sink.start(_M_AsText);
			sink.copy(term_107);
			sink.end();
			sink.end();
			Term term_68;
			{
				BufferSink buf_148 = sink.context().makeBuffer();
				buf_148.start(_M_STRING);
				buf_148.literal(1);
				buf_148.end();
				term_68 = buf_148.term();
			}
			sink.propertyNamed("$LineLocation", term_68);
			Term term_177;
			{
				BufferSink buf_394 = sink.context().makeBuffer();
				buf_394.start(_M_STRING);
				buf_394.literal(18);
				buf_394.end();
				term_177 = buf_394.term();
			}
			sink.propertyNamed("$ColumnLocation", term_177);
			sink.start(_M__sTextCons);
			Term term_289;
			{
				BufferSink buf_312 = sink.context().makeBuffer();
				buf_312.start(_M_STRING);
				buf_312.literal(1);
				buf_312.end();
				term_289 = buf_312.term();
			}
			sink.propertyNamed("$LineLocation", term_289);
			Term term_212;
			{
				BufferSink buf_139 = sink.context().makeBuffer();
				buf_139.start(_M_STRING);
				buf_139.literal(31);
				buf_139.end();
				term_212 = buf_139.term();
			}
			sink.propertyNamed("$ColumnLocation", term_212);
			sink.start(_M__sTextChars);
			sink.literal("\u00bb\u00bb");
			sink.end();
			Term term_118;
			{
				BufferSink buf_199 = sink.context().makeBuffer();
				buf_199.start(_M_STRING);
				buf_199.literal(1);
				buf_199.end();
				term_118 = buf_199.term();
			}
			sink.propertyNamed("$LineLocation", term_118);
			Term term_165;
			{
				BufferSink buf_196 = sink.context().makeBuffer();
				buf_196.start(_M_STRING);
				buf_196.literal(32);
				buf_196.end();
				term_165 = buf_196.term();
			}
			sink.propertyNamed("$ColumnLocation", term_165);
			sink.start(_M__sTextNil);
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_Text_Embed, term_107);
	}

	final public static boolean _M_AsText(Sink sink, int shared, int depth, Term term_241)
	{
		if (depth < 2000)
		{
			sink.copy(term_241);
			return true;
		}
		return thunk(sink, _M_AsText, term_241);
	}

	public static void init(Context context)
	{
		context.register(_M__sTextChars);
		context.register(_M__sTextBreak);
		context.register(_M__sTextSeparator);
		context.register(_M__sTextGroup);
		context.register(_M__sTextIndent);
		context.register(_M__sTextEmbed);
		context.register(_M__sTextString);
		context.register(_M__sTextCons);
		context.register(_M__sTextNil);
		context.register(_M_TextToString);
		context.register(_M_NumberToText);
		context.register(_M_StringToText);
		context.register(_M_ReverseTextFold);
		context.register(_M_TextFold1);
		context.register(_M_TextFold);
		context.register(_M_Text_Mangle);
		context.register(_M_Text_Integer);
		context.register(_M_Text_QuoteEscape);
		context.register(_M_Text_Comment);
		context.register(_M_Text_CommentToken);
		context.register(_M_Text_Token);
		context.register(_M_Text_User);
		context.register(_M_Text_ConcatSep);
		context.register(_M_Text_Concat);
		context.register(_M_Text_Text);
		context.register(_M_Text_String);
		context.register(_M_Text_Embed);
		context.register(_M_AsText);
	}

	/* END MODULE « "std/text.crs.java" » */
} 