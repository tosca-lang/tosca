/* START MODULE cg/cgjava.crs.java */
/** Generated File */

package org.crsx.compiler.cg;

import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;
import static org.crsx.runtime.Normalizer.force;
import static org.crsx.runtime.Reference.safeRef;

import org.crsx.runtime.*;
import org.crsx.runtime.ConstructionDescriptor.*;
import static org.crsx.runtime.Primitives.*;
import static org.crsx.compiler.parser.Crsx.*;
import static org.crsx.compiler.std.Core.*;
import static org.crsx.compiler.std.String.*;
import static org.crsx.compiler.std.Num.*;
import static org.crsx.compiler.std.Text.*;
import static org.crsx.compiler.std.List.*;
import static org.crsx.compiler.Crsxutils.*;
import static org.crsx.compiler.State.*;
import static org.crsx.compiler.cg.Cgutils.*;

public class Cgjava
{
	final public static DynamicFunctionDescriptor _M_ClassName = makeFunction("ClassName", Cgjava.class, "_M_ClassName");
	final public static DynamicFunctionDescriptor _M_PathToDot2 = makeFunction("PathToDot2", Cgjava.class, "_M_PathToDot2");
	final public static DynamicFunctionDescriptor _M_PathToDot = makeFunction("PathToDot", Cgjava.class, "_M_PathToDot");
	final public static DynamicFunctionDescriptor _M_PathToImport2 = makeFunction("PathToImport2", Cgjava.class, "_M_PathToImport2");
	final public static DynamicFunctionDescriptor _M_PathToImport = makeFunction("PathToImport", Cgjava.class, "_M_PathToImport");
	final public static DynamicFunctionDescriptor _M_PackageDeclaration3 = makeFunction(
			"PackageDeclaration3", Cgjava.class, "_M_PackageDeclaration3");
	final public static DynamicFunctionDescriptor _M_PackageDeclaration2 = makeFunction(
			"PackageDeclaration2", Cgjava.class, "_M_PackageDeclaration2");
	final public static DynamicFunctionDescriptor _M_PackageDeclaration = makeFunction(
			"PackageDeclaration", Cgjava.class, "_M_PackageDeclaration");
	final public static DynamicFunctionDescriptor _M_RegisterDataForm = makeFunction(
			"RegisterDataForm", Cgjava.class, "_M_RegisterDataForm");
	final public static DynamicFunctionDescriptor _M_RegisterDataSort = makeFunction(
			"RegisterDataSort", Cgjava.class, "_M_RegisterDataSort");
	final public static DynamicFunctionDescriptor _M_Register = makeFunction("Register", Cgjava.class, "_M_Register");
	final public static DynamicFunctionDescriptor _M_Registers = makeFunction("Registers", Cgjava.class, "_M_Registers");
	final public static DynamicFunctionDescriptor _M_InitModule = makeFunction("InitModule", Cgjava.class, "_M_InitModule");
	final public static DynamicFunctionDescriptor _M_SetBuffer = makeFunction("SetBuffer", Cgjava.class, "_M_SetBuffer");
	final public static DynamicFunctionDescriptor _M_SetVariable0 = makeFunction("SetVariable0", Cgjava.class, "_M_SetVariable0");
	final public static DynamicFunctionDescriptor _M_SetVariable = makeFunction("SetVariable", Cgjava.class, "_M_SetVariable");
	final public static DynamicFunctionDescriptor _M_SetTerm = makeFunction("SetTerm", Cgjava.class, "_M_SetTerm");
	final public static DynamicFunctionDescriptor _M_SetNextTerms = makeFunction("SetNextTerms", Cgjava.class, "_M_SetNextTerms");
	final public static DynamicFunctionDescriptor _M_SetTerms = makeFunction("SetTerms", Cgjava.class, "_M_SetTerms");
	final public static DynamicFunctionDescriptor _M_SetArgumentsOpt = makeFunction(
			"SetArgumentsOpt", Cgjava.class, "_M_SetArgumentsOpt");
	final public static DynamicFunctionDescriptor _M_SetFreeTerm = makeFunction("SetFreeTerm", Cgjava.class, "_M_SetFreeTerm");
	final public static DynamicFunctionDescriptor _M_SetFreeTerms_xS1_xZOM = makeFunction(
			"SetFreeTerms_S1_ZOM", Cgjava.class, "_M_SetFreeTerms_xS1_xZOM");
	final public static DynamicFunctionDescriptor _M_SetFreeTerms = makeFunction("SetFreeTerms", Cgjava.class, "_M_SetFreeTerms");
	final public static DynamicFunctionDescriptor _M_CallFunctionArgs = makeFunction(
			"CallFunctionArgs", Cgjava.class, "_M_CallFunctionArgs");
	final public static DynamicFunctionDescriptor _M_CallFunction = makeFunction("CallFunction", Cgjava.class, "_M_CallFunction");
	final public static DynamicFunctionDescriptor _M_SendTail2 = makeFunction("SendTail2", Cgjava.class, "_M_SendTail2");
	final public static DynamicFunctionDescriptor _M_SendTail = makeFunction("SendTail", Cgjava.class, "_M_SendTail");
	final public static DynamicFunctionDescriptor _M_SendFreshesKey2 = makeFunction(
			"SendFreshesKey2", Cgjava.class, "_M_SendFreshesKey2");
	final public static DynamicFunctionDescriptor _M_SendFreshesKey = makeFunction(
			"SendFreshesKey", Cgjava.class, "_M_SendFreshesKey");
	final public static DynamicFunctionDescriptor _M_SendFreshesKeys = makeFunction(
			"SendFreshesKeys", Cgjava.class, "_M_SendFreshesKeys");
	final public static DynamicFunctionDescriptor _M_SendFreshes = makeFunction("SendFreshes", Cgjava.class, "_M_SendFreshes");
	final public static DynamicFunctionDescriptor _M_SendContraction = makeFunction(
			"SendContraction", Cgjava.class, "_M_SendContraction");
	final public static DynamicFunctionDescriptor _M_SendMatchNextBinder = makeFunction(
			"SendMatchNextBinder", Cgjava.class, "_M_SendMatchNextBinder");
	final public static DynamicFunctionDescriptor _M_SendMatchSubTerm = makeFunction(
			"SendMatchSubTerm", Cgjava.class, "_M_SendMatchSubTerm");
	final public static DynamicFunctionDescriptor _M_SendMatchSubTerms = makeFunction(
			"SendMatchSubTerms", Cgjava.class, "_M_SendMatchSubTerms");
	final public static DynamicFunctionDescriptor _M_SendMatchMaybeArguments = makeFunction(
			"SendMatchMaybeArguments", Cgjava.class, "_M_SendMatchMaybeArguments");
	final public static DynamicFunctionDescriptor _M_SendMatchMeta = makeFunction("SendMatchMeta", Cgjava.class, "_M_SendMatchMeta");
	final public static DynamicFunctionDescriptor _M_SendMatchProperty = makeFunction(
			"SendMatchProperty", Cgjava.class, "_M_SendMatchProperty");
	final public static DynamicFunctionDescriptor _M_SendMatchPropertyList = makeFunction(
			"SendMatchPropertyList", Cgjava.class, "_M_SendMatchPropertyList");
	final public static DynamicFunctionDescriptor _M_SendMatchMaybeProperties = makeFunction(
			"SendMatchMaybeProperties", Cgjava.class, "_M_SendMatchMaybeProperties");
	final public static DynamicFunctionDescriptor _M_SendMatchFreeTerm = makeFunction(
			"SendMatchFreeTerm", Cgjava.class, "_M_SendMatchFreeTerm");
	final public static DynamicFunctionDescriptor _M_SendMatchTerm = makeFunction("SendMatchTerm", Cgjava.class, "_M_SendMatchTerm");
	final public static DynamicFunctionDescriptor _M_SendMatchTopArguments = makeFunction(
			"SendMatchTopArguments", Cgjava.class, "_M_SendMatchTopArguments");
	final public static DynamicFunctionDescriptor _M_SendMatchTopMaybeProperties = makeFunction(
			"SendMatchTopMaybeProperties", Cgjava.class, "_M_SendMatchTopMaybeProperties");
	final public static DynamicFunctionDescriptor _M_SendDispatchCase = makeFunction(
			"SendDispatchCase", Cgjava.class, "_M_SendDispatchCase");
	final public static DynamicFunctionDescriptor _M_SendDispatchCases = makeFunction(
			"SendDispatchCases", Cgjava.class, "_M_SendDispatchCases");
	final public static DynamicFunctionDescriptor _M_SendDispatchBinders = makeFunction(
			"SendDispatchBinders", Cgjava.class, "_M_SendDispatchBinders");
	final public static DynamicFunctionDescriptor _M_SendDispatchMeta = makeFunction(
			"SendDispatchMeta", Cgjava.class, "_M_SendDispatchMeta");
	final public static DynamicFunctionDescriptor _M_SendDispatchFreeTerm = makeFunction(
			"SendDispatchFreeTerm", Cgjava.class, "_M_SendDispatchFreeTerm");
	final public static DynamicFunctionDescriptor _M_SendDispatchTerm = makeFunction(
			"SendDispatchTerm", Cgjava.class, "_M_SendDispatchTerm");
	final public static DynamicFunctionDescriptor _M_SendDispatchTerms = makeFunction(
			"SendDispatchTerms", Cgjava.class, "_M_SendDispatchTerms");
	final public static DynamicFunctionDescriptor _M_SendDispatchMaybeProperties = makeFunction(
			"SendDispatchMaybeProperties", Cgjava.class, "_M_SendDispatchMaybeProperties");
	final public static DynamicFunctionDescriptor _M_SendDispatchTopFreeTerm = makeFunction(
			"SendDispatchTopFreeTerm", Cgjava.class, "_M_SendDispatchTopFreeTerm");
	final public static DynamicFunctionDescriptor _M_SendDispatch = makeFunction("SendDispatch", Cgjava.class, "_M_SendDispatch");
	final public static DynamicFunctionDescriptor _M_SendSubstitutes = makeFunction(
			"SendSubstitutes", Cgjava.class, "_M_SendSubstitutes");
	final public static DynamicFunctionDescriptor _M_SendMetaEntry = makeFunction("SendMetaEntry", Cgjava.class, "_M_SendMetaEntry");
	final public static DynamicFunctionDescriptor _M_SendMetaKey = makeFunction("SendMetaKey", Cgjava.class, "_M_SendMetaKey");
	final public static DynamicFunctionDescriptor _M_SendMeta = makeFunction("SendMeta", Cgjava.class, "_M_SendMeta");
	final public static DynamicFunctionDescriptor _M_SendVariable0 = makeFunction("SendVariable0", Cgjava.class, "_M_SendVariable0");
	final public static DynamicFunctionDescriptor _M_SendVariable = makeFunction("SendVariable", Cgjava.class, "_M_SendVariable");
	final public static DynamicFunctionDescriptor _M_SendNamedProperty = makeFunction(
			"SendNamedProperty", Cgjava.class, "_M_SendNamedProperty");
	final public static DynamicFunctionDescriptor _M_SendVariableProperty = makeFunction(
			"SendVariableProperty", Cgjava.class, "_M_SendVariableProperty");
	final public static DynamicFunctionDescriptor _M_SendMetaProperty = makeFunction(
			"SendMetaProperty", Cgjava.class, "_M_SendMetaProperty");
	final public static DynamicFunctionDescriptor _M_SendProperty = makeFunction("SendProperty", Cgjava.class, "_M_SendProperty");
	final public static DynamicFunctionDescriptor _M_SendPropertyList = makeFunction(
			"SendPropertyList", Cgjava.class, "_M_SendPropertyList");
	final public static DynamicFunctionDescriptor _M_SendMaybeProperties = makeFunction(
			"SendMaybeProperties", Cgjava.class, "_M_SendMaybeProperties");
	final public static DynamicFunctionDescriptor _M_SendBindersKey = makeFunction(
			"SendBindersKey", Cgjava.class, "_M_SendBindersKey");
	final public static DynamicFunctionDescriptor _M_SendBinders = makeFunction("SendBinders", Cgjava.class, "_M_SendBinders");
	final public static DynamicFunctionDescriptor _M_SendTerms_xS1_xZOM = makeFunction(
			"SendTerms_S1_ZOM", Cgjava.class, "_M_SendTerms_xS1_xZOM");
	final public static DynamicFunctionDescriptor _M_SendTerms = makeFunction("SendTerms", Cgjava.class, "_M_SendTerms");
	final public static DynamicFunctionDescriptor _M_SendArgumentsOpt = makeFunction(
			"SendArgumentsOpt", Cgjava.class, "_M_SendArgumentsOpt");
	final public static DynamicFunctionDescriptor _M_ThenSendArgumentsOpt = makeFunction(
			"ThenSendArgumentsOpt", Cgjava.class, "_M_ThenSendArgumentsOpt");
	final public static DynamicFunctionDescriptor _M_SendConstructor = makeFunction(
			"SendConstructor", Cgjava.class, "_M_SendConstructor");
	final public static DynamicFunctionDescriptor _M_SendFreeTerm = makeFunction("SendFreeTerm", Cgjava.class, "_M_SendFreeTerm");
	final public static DynamicFunctionDescriptor _M_SendTerm = makeFunction("SendTerm", Cgjava.class, "_M_SendTerm");
	final public static DynamicFunctionDescriptor _M_Thunk2 = makeFunction("Thunk2", Cgjava.class, "_M_Thunk2");
	final public static DynamicFunctionDescriptor _M_Thunk = makeFunction("Thunk", Cgjava.class, "_M_Thunk");
	final public static DynamicFunctionDescriptor _M_Body = makeFunction("Body", Cgjava.class, "_M_Body");
	final public static DynamicFunctionDescriptor _M_SigVar1 = makeFunction("SigVar1", Cgjava.class, "_M_SigVar1");
	final public static DynamicFunctionDescriptor _M_SigVar = makeFunction("SigVar", Cgjava.class, "_M_SigVar");
	final public static DynamicFunctionDescriptor _M_SigMeta1 = makeFunction("SigMeta1", Cgjava.class, "_M_SigMeta1");
	final public static DynamicFunctionDescriptor _M_SigMeta = makeFunction("SigMeta", Cgjava.class, "_M_SigMeta");
	final public static DynamicFunctionDescriptor _M_SigPropertyRef1 = makeFunction(
			"SigPropertyRef1", Cgjava.class, "_M_SigPropertyRef1");
	final public static DynamicFunctionDescriptor _M_SigPropertyRef = makeFunction(
			"SigPropertyRef", Cgjava.class, "_M_SigPropertyRef");
	final public static DynamicFunctionDescriptor _M_SigNextBinder = makeFunction("SigNextBinder", Cgjava.class, "_M_SigNextBinder");
	final public static DynamicFunctionDescriptor _M_SigTerms = makeFunction("SigTerms", Cgjava.class, "_M_SigTerms");
	final public static DynamicFunctionDescriptor _M_SigMaybeTerms = makeFunction("SigMaybeTerms", Cgjava.class, "_M_SigMaybeTerms");
	final public static DynamicFunctionDescriptor _M_SigArguments = makeFunction("SigArguments", Cgjava.class, "_M_SigArguments");
	final public static DynamicFunctionDescriptor _M_SigMaybeArguments = makeFunction(
			"SigMaybeArguments", Cgjava.class, "_M_SigMaybeArguments");
	final public static DynamicFunctionDescriptor _M_SigMaybeProperties = makeFunction(
			"SigMaybeProperties", Cgjava.class, "_M_SigMaybeProperties");
	final public static DynamicFunctionDescriptor _M_Signature = makeFunction("Signature", Cgjava.class, "_M_Signature");
	final public static DynamicFunctionDescriptor _M_Rule = makeFunction("Rule", Cgjava.class, "_M_Rule");
	final public static DynamicFunctionDescriptor _M_OptionIndexKey = makeFunction(
			"OptionIndexKey", Cgjava.class, "_M_OptionIndexKey");
	final public static DynamicFunctionDescriptor _M_OptionIndex = makeFunction("OptionIndex", Cgjava.class, "_M_OptionIndex");
	final public static DynamicFunctionDescriptor _M_OptionTerms = makeFunction("OptionTerms", Cgjava.class, "_M_OptionTerms");
	final public static DynamicFunctionDescriptor _M_OptionArgumentsOpt = makeFunction(
			"OptionArgumentsOpt", Cgjava.class, "_M_OptionArgumentsOpt");
	final public static DynamicFunctionDescriptor _M_OptionOpt = makeFunction("OptionOpt", Cgjava.class, "_M_OptionOpt");
	final public static DynamicFunctionDescriptor _M_DataForm = makeFunction("DataForm", Cgjava.class, "_M_DataForm");
	final public static DynamicFunctionDescriptor _M_DataSort = makeFunction("DataSort", Cgjava.class, "_M_DataSort");
	final public static DynamicFunctionDescriptor _M_Declaration = makeFunction("Declaration", Cgjava.class, "_M_Declaration");
	final public static DynamicFunctionDescriptor _M_Declarations = makeFunction("Declarations", Cgjava.class, "_M_Declarations");
	final public static DynamicFunctionDescriptor _M_JavaImport = makeFunction("JavaImport", Cgjava.class, "_M_JavaImport");
	final public static DynamicFunctionDescriptor _M_JavaFooter = makeFunction("JavaFooter", Cgjava.class, "_M_JavaFooter");
	final public static DynamicFunctionDescriptor _M_JavaHeader = makeFunction("JavaHeader", Cgjava.class, "_M_JavaHeader");
	final public static DynamicFunctionDescriptor _M_JavaUnit = makeFunction("JavaUnit", Cgjava.class, "_M_JavaUnit");
	final public static DynamicFunctionDescriptor _M_Crsx = makeFunction("Crsx", Cgjava.class, "_M_Crsx");
	final public static DynamicFunctionDescriptor _M_GenerateJavaParsed = makeFunction(
			"GenerateJavaParsed", Cgjava.class, "_M_GenerateJavaParsed");
	final public static DynamicFunctionDescriptor _M_GenerateJava = makeFunction("GenerateJava", Cgjava.class, "_M_GenerateJava");

	final public static boolean _M_ClassName(Sink sink, int shared, int depth, Term term)
	{
		if (depth < 2000)
		{
			sink.start(_M_UpCaseFirst);
			sink.start(_M_AfterLast);
			sink.start(_M_BeforeLast);
			sink.copy(term.ref());
			sink.literal(".");
			sink.end();
			sink.literal("/");
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_ClassName, term);
	}

	final public static boolean _M_PathToDot2(Sink sink, int shared, int depth, Term term_94)
	{
		if (depth < 2000)
		{
			sink.start(_M__s);
			sink.start(_M_Builtin_sIf);
			sink.end();
			sink.start(_M__s);
			sink.start(_M_Builtin_sContains);
			sink.end();
			sink.copy(term_94.ref());
			sink.literal(".");
			sink.end();
			sink.start(_M_ConcatString);
			sink.start(_M_ConcatString);
			sink.start(_M_BeforeLast);
			sink.copy(term_94.ref());
			sink.literal(".");
			sink.end();
			sink.literal(".");
			sink.end();
			sink.start(_M_UpCaseFirst);
			sink.start(_M_AfterLast);
			sink.copy(term_94.ref());
			sink.literal(".");
			sink.end();
			sink.end();
			sink.end();
			sink.start(_M_UpCaseFirst);
			sink.copy(term_94.ref());
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_PathToDot2, term_94);
	}

	final public static boolean _M_PathToDot(Sink sink, int shared, int depth, Term term_37)
	{
		if (depth < 2000)
		{
			sink.start(_M_PathToDot2);
			sink.start(_M_Replace);
			sink.start(_M_BeforeLast);
			sink.copy(term_37.ref());
			sink.literal(".");
			sink.end();
			sink.literal("/");
			sink.literal(".");
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_PathToDot, term_37);
	}

	final public static boolean _M_PathToImport2(Sink sink, int shared, int depth, Term term_9, Term term_24)
	{
		if (depth < 2000)
		{
			sink.start(_M__sTextCons);
			sink.start(_M__sTextEmbed);
			sink.start(_M_AsText);
			sink.start(_M_StringToText);
			sink.copy(term_9.ref());
			sink.end();
			sink.end();
			sink.end();
			Term term_49;
			{
				BufferSink buf = sink.context().makeBuffer();
				buf.start(_M_STRING);
				buf.literal(1);
				buf.end();
				term_49 = buf.term();
			}
			sink.propertyNamed("$LineLocation", term_49);
			Term term_23;
			{
				BufferSink buf_25 = sink.context().makeBuffer();
				buf_25.start(_M_STRING);
				buf_25.literal(1);
				buf_25.end();
				term_23 = buf_25.term();
			}
			sink.propertyNamed("$ColumnLocation", term_23);
			sink.start(_M__sTextCons);
			Term term_66;
			{
				BufferSink buf_30 = sink.context().makeBuffer();
				buf_30.start(_M_STRING);
				buf_30.literal(1);
				buf_30.end();
				term_66 = buf_30.term();
			}
			sink.propertyNamed("$LineLocation", term_66);
			Term term_38;
			{
				BufferSink buf_45 = sink.context().makeBuffer();
				buf_45.start(_M_STRING);
				buf_45.literal(1);
				buf_45.end();
				term_38 = buf_45.term();
			}
			sink.propertyNamed("$ColumnLocation", term_38);
			sink.start(_M__sTextChars);
			sink.literal(".");
			sink.end();
			Term term_81;
			{
				BufferSink buf_73 = sink.context().makeBuffer();
				buf_73.start(_M_STRING);
				buf_73.literal(1);
				buf_73.end();
				term_81 = buf_73.term();
			}
			sink.propertyNamed("$LineLocation", term_81);
			Term term_7;
			{
				BufferSink buf_94 = sink.context().makeBuffer();
				buf_94.start(_M_STRING);
				buf_94.literal(25);
				buf_94.end();
				term_7 = buf_94.term();
			}
			sink.propertyNamed("$ColumnLocation", term_7);
			sink.start(_M__sTextCons);
			Term term_36;
			{
				BufferSink buf_38 = sink.context().makeBuffer();
				buf_38.start(_M_STRING);
				buf_38.literal(1);
				buf_38.end();
				term_36 = buf_38.term();
			}
			sink.propertyNamed("$LineLocation", term_36);
			Term term_80;
			{
				BufferSink buf_67 = sink.context().makeBuffer();
				buf_67.start(_M_STRING);
				buf_67.literal(25);
				buf_67.end();
				term_80 = buf_67.term();
			}
			sink.propertyNamed("$ColumnLocation", term_80);
			sink.start(_M__sTextEmbed);
			Term term_180;
			{
				BufferSink buf_123 = sink.context().makeBuffer();
				buf_123.start(_M_STRING);
				buf_123.literal(1);
				buf_123.end();
				term_180 = buf_123.term();
			}
			sink.propertyNamed("$LineLocation", term_180);
			Term term_92;
			{
				BufferSink buf_68 = sink.context().makeBuffer();
				buf_68.start(_M_STRING);
				buf_68.literal(25);
				buf_68.end();
				term_92 = buf_68.term();
			}
			sink.propertyNamed("$ColumnLocation", term_92);
			sink.start(_M_AsText);
			sink.start(_M_StringToText);
			sink.copy(term_24.ref());
			sink.end();
			sink.end();
			sink.end();
			Term term_98;
			{
				BufferSink buf_78 = sink.context().makeBuffer();
				buf_78.start(_M_STRING);
				buf_78.literal(1);
				buf_78.end();
				term_98 = buf_78.term();
			}
			sink.propertyNamed("$LineLocation", term_98);
			Term term_5;
			{
				BufferSink buf_69 = sink.context().makeBuffer();
				buf_69.start(_M_STRING);
				buf_69.literal(26);
				buf_69.end();
				term_5 = buf_69.term();
			}
			sink.propertyNamed("$ColumnLocation", term_5);
			sink.start(_M__sTextNil);
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_PathToImport2, term_9, term_24);
	}

	final public static boolean _M_PathToImport(Sink sink, int shared, int depth, Term term_55)
	{
		if (depth < 2000)
		{
			label :
			{
				if (term_55.descriptor() != _M_Crsx_xconstructor_xA1)
				{
					break label;
				}
				Term sub = term_55.sub(0).ref();
				if (sub.descriptor() != _M_Crsx_xqualifier_xA2)
				{
					break label;
				}
				Term sub_36 = term_55.sub(1).ref();
				/* #CONSTRUCTOR=sub *//*Contract*/
				sink.start(_M_PathToImport2);
				sink.start(_M__s);
				sink.start(_M_Builtin_sGet);
				sink.end();
				sink.literal("javabasepackage");
				sink.literal("");
				sink.end();
				sink.start(_M_PathToDot);
				sink.copy(sub_36.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_PathToImport, term_55);
	}

	final public static boolean _M_PackageDeclaration3(Sink sink, int shared, int depth, Term term_48, Term term_29)
	{
		if (depth < 2000)
		{
			sink.start(_M__s);
			sink.start(_M_Builtin_sIf);
			sink.end();
			sink.start(_M__s);
			sink.start(_M_Builtin_sStringEqual);
			sink.end();
			sink.start(_M__s);
			sink.start(_M_Builtin_sTrim);
			sink.end();
			sink.copy(term_29.ref());
			sink.end();
			sink.literal("");
			sink.end();
			sink.start(_M__sTextNil);
			sink.end();
			sink.start(_M__sTextCons);
			Term term_74;
			{
				BufferSink buf_36 = sink.context().makeBuffer();
				buf_36.start(_M_STRING);
				buf_36.literal(1);
				buf_36.end();
				term_74 = buf_36.term();
			}
			sink.propertyNamed("$LineLocation", term_74);
			Term term_87;
			{
				BufferSink buf_26 = sink.context().makeBuffer();
				buf_26.start(_M_STRING);
				buf_26.literal(1);
				buf_26.end();
				term_87 = buf_26.term();
			}
			sink.propertyNamed("$ColumnLocation", term_87);
			sink.start(_M__sTextChars);
			sink.copy(term_48.ref());
			sink.end();
			Term term_34;
			{
				BufferSink buf_49 = sink.context().makeBuffer();
				buf_49.start(_M_STRING);
				buf_49.literal(1);
				buf_49.end();
				term_34 = buf_49.term();
			}
			sink.propertyNamed("$LineLocation", term_34);
			Term term_8;
			{
				BufferSink buf_13 = sink.context().makeBuffer();
				buf_13.start(_M_STRING);
				buf_13.literal(2);
				buf_13.end();
				term_8 = buf_13.term();
			}
			sink.propertyNamed("$ColumnLocation", term_8);
			sink.start(_M__sTextCons);
			Term term_25;
			{
				BufferSink buf_179 = sink.context().makeBuffer();
				buf_179.start(_M_STRING);
				buf_179.literal(1);
				buf_179.end();
				term_25 = buf_179.term();
			}
			sink.propertyNamed("$LineLocation", term_25);
			Term term_51;
			{
				BufferSink buf_66 = sink.context().makeBuffer();
				buf_66.start(_M_STRING);
				buf_66.literal(8);
				buf_66.end();
				term_51 = buf_66.term();
			}
			sink.propertyNamed("$ColumnLocation", term_51);
			sink.start(_M__sTextChars);
			sink.copy(term_29.ref());
			sink.end();
			Term term_54;
			{
				BufferSink buf_57 = sink.context().makeBuffer();
				buf_57.start(_M_STRING);
				buf_57.literal(1);
				buf_57.end();
				term_54 = buf_57.term();
			}
			sink.propertyNamed("$LineLocation", term_54);
			Term term_58;
			{
				BufferSink buf_160 = sink.context().makeBuffer();
				buf_160.start(_M_STRING);
				buf_160.literal(9);
				buf_160.end();
				term_58 = buf_160.term();
			}
			sink.propertyNamed("$ColumnLocation", term_58);
			sink.start(_M__sTextNil);
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_PackageDeclaration3, term_48, term_29);
	}

	final public static boolean _M_PackageDeclaration2(Sink sink, int shared, int depth, Term term_45, Term term_47)
	{
		if (depth < 2000)
		{
			sink.start(_M__s);
			sink.start(_M_Builtin_sIf);
			sink.end();
			sink.start(_M__s);
			sink.start(_M_Builtin_sStringEqual);
			sink.end();
			sink.start(_M__s);
			sink.start(_M_Builtin_sTrim);
			sink.end();
			sink.copy(term_45.ref());
			sink.end();
			sink.literal("");
			sink.end();
			sink.start(_M_PackageDeclaration3);
			sink.literal("");
			sink.copy(term_47.ref());
			sink.end();
			sink.start(_M__sTextCons);
			sink.start(_M__sTextChars);
			sink.literal("package ");
			sink.end();
			Term term_50;
			{
				BufferSink buf_31 = sink.context().makeBuffer();
				buf_31.start(_M_STRING);
				buf_31.literal(1);
				buf_31.end();
				term_50 = buf_31.term();
			}
			sink.propertyNamed("$LineLocation", term_50);
			Term term_166;
			{
				BufferSink buf_2 = sink.context().makeBuffer();
				buf_2.start(_M_STRING);
				buf_2.literal(1);
				buf_2.end();
				term_166 = buf_2.term();
			}
			sink.propertyNamed("$ColumnLocation", term_166);
			sink.start(_M__sTextCons);
			Term term_119;
			{
				BufferSink buf_90 = sink.context().makeBuffer();
				buf_90.start(_M_STRING);
				buf_90.literal(1);
				buf_90.end();
				term_119 = buf_90.term();
			}
			sink.propertyNamed("$LineLocation", term_119);
			Term term_86;
			{
				BufferSink buf_74 = sink.context().makeBuffer();
				buf_74.start(_M_STRING);
				buf_74.literal(9);
				buf_74.end();
				term_86 = buf_74.term();
			}
			sink.propertyNamed("$ColumnLocation", term_86);
			sink.start(_M__sTextChars);
			sink.copy(term_45.ref());
			sink.end();
			Term term_22;
			{
				BufferSink buf_51 = sink.context().makeBuffer();
				buf_51.start(_M_STRING);
				buf_51.literal(1);
				buf_51.end();
				term_22 = buf_51.term();
			}
			sink.propertyNamed("$LineLocation", term_22);
			Term term_63;
			{
				BufferSink buf_16 = sink.context().makeBuffer();
				buf_16.start(_M_STRING);
				buf_16.literal(10);
				buf_16.end();
				term_63 = buf_16.term();
			}
			sink.propertyNamed("$ColumnLocation", term_63);
			sink.start(_M__sTextCons);
			Term term_83;
			{
				BufferSink buf_61 = sink.context().makeBuffer();
				buf_61.start(_M_STRING);
				buf_61.literal(1);
				buf_61.end();
				term_83 = buf_61.term();
			}
			sink.propertyNamed("$LineLocation", term_83);
			Term term_84;
			{
				BufferSink buf_44 = sink.context().makeBuffer();
				buf_44.start(_M_STRING);
				buf_44.literal(10);
				buf_44.end();
				term_84 = buf_44.term();
			}
			sink.propertyNamed("$ColumnLocation", term_84);
			sink.start(_M__sTextEmbed);
			Term term_75;
			{
				BufferSink buf_100 = sink.context().makeBuffer();
				buf_100.start(_M_STRING);
				buf_100.literal(1);
				buf_100.end();
				term_75 = buf_100.term();
			}
			sink.propertyNamed("$LineLocation", term_75);
			Term term_30;
			{
				BufferSink buf_138 = sink.context().makeBuffer();
				buf_138.start(_M_STRING);
				buf_138.literal(10);
				buf_138.end();
				term_30 = buf_138.term();
			}
			sink.propertyNamed("$ColumnLocation", term_30);
			sink.start(_M_AsText);
			sink.start(_M_PackageDeclaration3);
			sink.literal(".");
			sink.copy(term_47.ref());
			sink.end();
			sink.end();
			sink.end();
			Term term_39;
			{
				BufferSink buf_86 = sink.context().makeBuffer();
				buf_86.start(_M_STRING);
				buf_86.literal(1);
				buf_86.end();
				term_39 = buf_86.term();
			}
			sink.propertyNamed("$LineLocation", term_39);
			Term term_4;
			{
				BufferSink buf_75 = sink.context().makeBuffer();
				buf_75.start(_M_STRING);
				buf_75.literal(17);
				buf_75.end();
				term_4 = buf_75.term();
			}
			sink.propertyNamed("$ColumnLocation", term_4);
			sink.start(_M__sTextCons);
			Term term_0;
			{
				BufferSink buf_81 = sink.context().makeBuffer();
				buf_81.start(_M_STRING);
				buf_81.literal(1);
				buf_81.end();
				term_0 = buf_81.term();
			}
			sink.propertyNamed("$LineLocation", term_0);
			Term term_89;
			{
				BufferSink buf_88 = sink.context().makeBuffer();
				buf_88.start(_M_STRING);
				buf_88.literal(17);
				buf_88.end();
				term_89 = buf_88.term();
			}
			sink.propertyNamed("$ColumnLocation", term_89);
			sink.start(_M__sTextChars);
			sink.literal(";");
			sink.end();
			Term term_90;
			{
				BufferSink buf_12 = sink.context().makeBuffer();
				buf_12.start(_M_STRING);
				buf_12.literal(1);
				buf_12.end();
				term_90 = buf_12.term();
			}
			sink.propertyNamed("$LineLocation", term_90);
			Term term_195;
			{
				BufferSink buf_52 = sink.context().makeBuffer();
				buf_52.start(_M_STRING);
				buf_52.literal(49);
				buf_52.end();
				term_195 = buf_52.term();
			}
			sink.propertyNamed("$ColumnLocation", term_195);
			sink.start(_M__sTextNil);
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_PackageDeclaration2, term_45, term_47);
	}

	final public static boolean _M_PackageDeclaration(Sink sink, int shared, int depth)
	{
		if (depth < 2000)
		{
			sink.start(_M_PackageDeclaration2);
			sink.start(_M__s);
			sink.start(_M_Builtin_sGet);
			sink.end();
			sink.literal("javabasepackage");
			sink.literal("");
			sink.end();
			sink.start(_M__s);
			sink.start(_M_Builtin_sGet);
			sink.end();
			sink.literal("javapackage");
			sink.literal("");
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_PackageDeclaration);
	}

	final public static boolean _M_RegisterDataForm(Sink sink, int shared, int depth, Term term_1)
	{
		if (depth < 2000)
		{
			label_28 :
			{
				if (term_1.descriptor() != _M_Crsx_xforms_xS1)
				{
					break label_28;
				}
				Term sub_24 = term_1.sub(0).ref();
				if (sub_24.descriptor() != _M_Crsx_xform_xA1)
				{
					break label_28;
				}
				Term sub_1 = sub_24.sub(0).ref();
				/* #constructor=sub */Term sub_15 = sub_24.sub(1).ref();
				/* #arguments?=sub */Term sub_2 = term_1.sub(1).ref();/*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_41;
				{
					BufferSink buf_98 = sink.context().makeBuffer();
					buf_98.start(_M_STRING);
					buf_98.literal(1);
					buf_98.end();
					term_41 = buf_98.term();
				}
				sink.propertyNamed("$LineLocation", term_41);
				Term term_68;
				{
					BufferSink buf_62 = sink.context().makeBuffer();
					buf_62.start(_M_STRING);
					buf_62.literal(1);
					buf_62.end();
					term_68 = buf_62.term();
				}
				sink.propertyNamed("$ColumnLocation", term_68);
				sink.start(_M__sTextCons);
				Term term_40;
				{
					BufferSink buf_32 = sink.context().makeBuffer();
					buf_32.start(_M_STRING);
					buf_32.literal(1);
					buf_32.end();
					term_40 = buf_32.term();
				}
				sink.propertyNamed("$LineLocation", term_40);
				Term term_31;
				{
					BufferSink buf_11 = sink.context().makeBuffer();
					buf_11.start(_M_STRING);
					buf_11.literal(1);
					buf_11.end();
					term_31 = buf_11.term();
				}
				sink.propertyNamed("$ColumnLocation", term_31);
				sink.start(_M__sTextChars);
				sink.literal("context.register(");
				sink.end();
				Term term_76;
				{
					BufferSink buf_155 = sink.context().makeBuffer();
					buf_155.start(_M_STRING);
					buf_155.literal(1);
					buf_155.end();
					term_76 = buf_155.term();
				}
				sink.propertyNamed("$LineLocation", term_76);
				Term term_108;
				{
					BufferSink buf_20 = sink.context().makeBuffer();
					buf_20.start(_M_STRING);
					buf_20.literal(2);
					buf_20.end();
					term_108 = buf_20.term();
				}
				sink.propertyNamed("$ColumnLocation", term_108);
				sink.start(_M__sTextCons);
				Term term_93;
				{
					BufferSink buf_104 = sink.context().makeBuffer();
					buf_104.start(_M_STRING);
					buf_104.literal(1);
					buf_104.end();
					term_93 = buf_104.term();
				}
				sink.propertyNamed("$LineLocation", term_93);
				Term term_11;
				{
					BufferSink buf_55 = sink.context().makeBuffer();
					buf_55.start(_M_STRING);
					buf_55.literal(2);
					buf_55.end();
					term_11 = buf_55.term();
				}
				sink.propertyNamed("$ColumnLocation", term_11);
				sink.start(_M__sTextEmbed);
				Term term_197;
				{
					BufferSink buf_28 = sink.context().makeBuffer();
					buf_28.start(_M_STRING);
					buf_28.literal(1);
					buf_28.end();
					term_197 = buf_28.term();
				}
				sink.propertyNamed("$LineLocation", term_197);
				Term term_185;
				{
					BufferSink buf_187 = sink.context().makeBuffer();
					buf_187.start(_M_STRING);
					buf_187.literal(2);
					buf_187.end();
					term_185 = buf_187.term();
				}
				sink.propertyNamed("$ColumnLocation", term_185);
				sink.start(_M_AsText);
				sink.start(_M_Descriptor);
				sink.copy(sub_1.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_187;
				{
					BufferSink buf_76 = sink.context().makeBuffer();
					buf_76.start(_M_STRING);
					buf_76.literal(1);
					buf_76.end();
					term_187 = buf_76.term();
				}
				sink.propertyNamed("$LineLocation", term_187);
				Term term_79;
				{
					BufferSink buf_1 = sink.context().makeBuffer();
					buf_1.start(_M_STRING);
					buf_1.literal(19);
					buf_1.end();
					term_79 = buf_1.term();
				}
				sink.propertyNamed("$ColumnLocation", term_79);
				sink.start(_M__sTextCons);
				Term term_59;
				{
					BufferSink buf_41 = sink.context().makeBuffer();
					buf_41.start(_M_STRING);
					buf_41.literal(1);
					buf_41.end();
					term_59 = buf_41.term();
				}
				sink.propertyNamed("$LineLocation", term_59);
				Term term_6;
				{
					BufferSink buf_8 = sink.context().makeBuffer();
					buf_8.start(_M_STRING);
					buf_8.literal(19);
					buf_8.end();
					term_6 = buf_8.term();
				}
				sink.propertyNamed("$ColumnLocation", term_6);
				sink.start(_M__sTextChars);
				sink.literal(");");
				sink.end();
				Term term_56;
				{
					BufferSink buf_34 = sink.context().makeBuffer();
					buf_34.start(_M_STRING);
					buf_34.literal(1);
					buf_34.end();
					term_56 = buf_34.term();
				}
				sink.propertyNamed("$LineLocation", term_56);
				Term term_53;
				{
					BufferSink buf_64 = sink.context().makeBuffer();
					buf_64.start(_M_STRING);
					buf_64.literal(45);
					buf_64.end();
					term_53 = buf_64.term();
				}
				sink.propertyNamed("$ColumnLocation", term_53);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_RegisterDataForm, term_1);
	}

	final public static boolean _M_RegisterDataSort(Sink sink, int shared, int depth, Term term_13, Term term_272, Term term_77)
	{
		if (depth < 2000)
		{
			sink.start(_M_Text_Concat);
			sink.start(_M_Map);
			Variable var = sink.context().makeVariable("form");
			sink.binds(new Variable[]
				{var});
			sink.start(_M_RegisterDataForm);
			sink.use(var);
			sink.end();
			sink.copy(term_77.ref());
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_RegisterDataSort, term_13, term_272, term_77);
	}

	final public static boolean _M_Register(Sink sink, int shared, int depth, Term term_104)
	{
		if (depth < 2000)
		{
			label_54 :
			{
				if (term_104.descriptor() != _M_Crsx_xdeclaration_xA1)
				{
					break label_54;
				}
				Term sub_93 = term_104.sub(0).ref();
				if (sub_93.descriptor() != _M_Crsx_xmoduleDeclaration)
				{
					break label_54;
				}
				Term sub_43 = sub_93.sub(0).ref();
				Term sub_99 = sub_93.sub(1).ref();
				/* #CONSTRUCTOR=sub */Term sub_8 = sub_93.sub(2).ref();
				Term sub_22 = sub_93.sub(3).ref();
				/* #declarations=sub */Term sub_67 = sub_93.sub(4).ref();/*Contract*/
				sink.start(_M_Registers);
				sink.start(_M_DesugarDeclarations);
				sink.copy(sub_22.ref());
				sink.end();
				sink.end();
				return true;
			}
			label_52 :
			{
				if (term_104.descriptor() != _M_Crsx_xdeclaration_xA2)
				{
					break label_52;
				}
				Term sub_82 = term_104.sub(0).ref();
				if (sub_82.descriptor() != _M_Crsx_ximportDeclaration_xA2)
				{
					break label_52;
				}
				Term sub_83 = sub_82.sub(0).ref();
				Term sub_66 = sub_82.sub(1).ref();
				Term sub_10 = sub_82.sub(2).ref();
				/* #constructor=sub *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_27;
				{
					BufferSink buf_23 = sink.context().makeBuffer();
					buf_23.start(_M_STRING);
					buf_23.literal(1);
					buf_23.end();
					term_27 = buf_23.term();
				}
				sink.propertyNamed("$LineLocation", term_27);
				Term term_20;
				{
					BufferSink buf_29 = sink.context().makeBuffer();
					buf_29.start(_M_STRING);
					buf_29.literal(1);
					buf_29.end();
					term_20 = buf_29.term();
				}
				sink.propertyNamed("$ColumnLocation", term_20);
				sink.start(_M__sTextCons);
				Term term_125;
				{
					BufferSink buf_124 = sink.context().makeBuffer();
					buf_124.start(_M_STRING);
					buf_124.literal(1);
					buf_124.end();
					term_125 = buf_124.term();
				}
				sink.propertyNamed("$LineLocation", term_125);
				Term term_71;
				{
					BufferSink buf_211 = sink.context().makeBuffer();
					buf_211.start(_M_STRING);
					buf_211.literal(1);
					buf_211.end();
					term_71 = buf_211.term();
				}
				sink.propertyNamed("$ColumnLocation", term_71);
				sink.start(_M__sTextEmbed);
				Term term_26;
				{
					BufferSink buf_97 = sink.context().makeBuffer();
					buf_97.start(_M_STRING);
					buf_97.literal(1);
					buf_97.end();
					term_26 = buf_97.term();
				}
				sink.propertyNamed("$LineLocation", term_26);
				Term term_177;
				{
					BufferSink buf_191 = sink.context().makeBuffer();
					buf_191.start(_M_STRING);
					buf_191.literal(1);
					buf_191.end();
					term_177 = buf_191.term();
				}
				sink.propertyNamed("$ColumnLocation", term_177);
				sink.start(_M_AsText);
				sink.start(_M_PathToImport);
				sink.copy(sub_10.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_65;
				{
					BufferSink buf_83 = sink.context().makeBuffer();
					buf_83.start(_M_STRING);
					buf_83.literal(2);
					buf_83.end();
					term_65 = buf_83.term();
				}
				sink.propertyNamed("$LineLocation", term_65);
				Term term_67;
				{
					BufferSink buf_293 = sink.context().makeBuffer();
					buf_293.start(_M_STRING);
					buf_293.literal(1);
					buf_293.end();
					term_67 = buf_293.term();
				}
				sink.propertyNamed("$ColumnLocation", term_67);
				sink.start(_M__sTextCons);
				Term term_3;
				{
					BufferSink buf_99 = sink.context().makeBuffer();
					buf_99.start(_M_STRING);
					buf_99.literal(2);
					buf_99.end();
					term_3 = buf_99.term();
				}
				sink.propertyNamed("$LineLocation", term_3);
				Term term_88;
				{
					BufferSink buf_5 = sink.context().makeBuffer();
					buf_5.start(_M_STRING);
					buf_5.literal(1);
					buf_5.end();
					term_88 = buf_5.term();
				}
				sink.propertyNamed("$ColumnLocation", term_88);
				sink.start(_M__sTextChars);
				sink.literal(".init(context);");
				sink.end();
				Term term_175;
				{
					BufferSink buf_59 = sink.context().makeBuffer();
					buf_59.start(_M_STRING);
					buf_59.literal(2);
					buf_59.end();
					term_175 = buf_59.term();
				}
				sink.propertyNamed("$LineLocation", term_175);
				Term term_42;
				{
					BufferSink buf_70 = sink.context().makeBuffer();
					buf_70.start(_M_STRING);
					buf_70.literal(29);
					buf_70.end();
					term_42 = buf_70.term();
				}
				sink.propertyNamed("$ColumnLocation", term_42);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_65 :
			{
				if (term_104.descriptor() != _M_Crsx_xdeclaration_xA2)
				{
					break label_65;
				}
				Term sub_17 = term_104.sub(0).ref();
				if (sub_17.descriptor() != _M_Crsx_ximportDeclaration_xA3)
				{
					break label_65;
				}
				Term sub_41 = sub_17.sub(0).ref();
				Term sub_68 = sub_17.sub(1).ref();
				Term sub_90 = sub_17.sub(2).ref();
				if (sub_90.descriptor() != _M_Crsx_xconstructor_xA1)
				{
					break label_65;
				}
				Term sub_102 = sub_90.sub(0).ref();
				if (sub_102.descriptor() != _M_Crsx_xqualifier_xA2)
				{
					break label_65;
				}
				Term sub_72 = sub_90.sub(1).ref();
				/* #CONSTRUCTOR=sub *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_82;
				{
					BufferSink buf_63 = sink.context().makeBuffer();
					buf_63.start(_M_STRING);
					buf_63.literal(1);
					buf_63.end();
					term_82 = buf_63.term();
				}
				sink.propertyNamed("$LineLocation", term_82);
				Term term_129;
				{
					BufferSink buf_220 = sink.context().makeBuffer();
					buf_220.start(_M_STRING);
					buf_220.literal(1);
					buf_220.end();
					term_129 = buf_220.term();
				}
				sink.propertyNamed("$ColumnLocation", term_129);
				sink.start(_M__sTextCons);
				Term term_35;
				{
					BufferSink buf_106 = sink.context().makeBuffer();
					buf_106.start(_M_STRING);
					buf_106.literal(1);
					buf_106.end();
					term_35 = buf_106.term();
				}
				sink.propertyNamed("$LineLocation", term_35);
				Term term_15;
				{
					BufferSink buf_19 = sink.context().makeBuffer();
					buf_19.start(_M_STRING);
					buf_19.literal(1);
					buf_19.end();
					term_15 = buf_19.term();
				}
				sink.propertyNamed("$ColumnLocation", term_15);
				sink.start(_M__sTextChars);
				sink.literal("context.registerParser(");
				sink.end();
				Term term_73;
				{
					BufferSink buf_142 = sink.context().makeBuffer();
					buf_142.start(_M_STRING);
					buf_142.literal(2);
					buf_142.end();
					term_73 = buf_142.term();
				}
				sink.propertyNamed("$LineLocation", term_73);
				Term term_184;
				{
					BufferSink buf_85 = sink.context().makeBuffer();
					buf_85.start(_M_STRING);
					buf_85.literal(1);
					buf_85.end();
					term_184 = buf_85.term();
				}
				sink.propertyNamed("$ColumnLocation", term_184);
				sink.start(_M__sTextCons);
				Term term_60;
				{
					BufferSink buf_48 = sink.context().makeBuffer();
					buf_48.start(_M_STRING);
					buf_48.literal(2);
					buf_48.end();
					term_60 = buf_48.term();
				}
				sink.propertyNamed("$LineLocation", term_60);
				Term term_43;
				{
					BufferSink buf_188 = sink.context().makeBuffer();
					buf_188.start(_M_STRING);
					buf_188.literal(1);
					buf_188.end();
					term_43 = buf_188.term();
				}
				sink.propertyNamed("$ColumnLocation", term_43);
				sink.start(_M__sTextEmbed);
				Term term_218;
				{
					BufferSink buf_196 = sink.context().makeBuffer();
					buf_196.start(_M_STRING);
					buf_196.literal(2);
					buf_196.end();
					term_218 = buf_196.term();
				}
				sink.propertyNamed("$LineLocation", term_218);
				Term term_354;
				{
					BufferSink buf_39 = sink.context().makeBuffer();
					buf_39.start(_M_STRING);
					buf_39.literal(1);
					buf_39.end();
					term_354 = buf_39.term();
				}
				sink.propertyNamed("$ColumnLocation", term_354);
				sink.start(_M_AsText);
				sink.start(_M_Text_QuoteEscape);
				sink.start(_M_Replace);
				sink.copy(sub_72.ref());
				sink.literal("/");
				sink.literal(".");
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				Term term_153;
				{
					BufferSink buf_87 = sink.context().makeBuffer();
					buf_87.start(_M_STRING);
					buf_87.literal(2);
					buf_87.end();
					term_153 = buf_87.term();
				}
				sink.propertyNamed("$LineLocation", term_153);
				Term term_99;
				{
					BufferSink buf_131 = sink.context().makeBuffer();
					buf_131.start(_M_STRING);
					buf_131.literal(24);
					buf_131.end();
					term_99 = buf_131.term();
				}
				sink.propertyNamed("$ColumnLocation", term_99);
				sink.start(_M__sTextCons);
				Term term_107;
				{
					BufferSink buf_9 = sink.context().makeBuffer();
					buf_9.start(_M_STRING);
					buf_9.literal(2);
					buf_9.end();
					term_107 = buf_9.term();
				}
				sink.propertyNamed("$LineLocation", term_107);
				Term term_138;
				{
					BufferSink buf_53 = sink.context().makeBuffer();
					buf_53.start(_M_STRING);
					buf_53.literal(24);
					buf_53.end();
					term_138 = buf_53.term();
				}
				sink.propertyNamed("$ColumnLocation", term_138);
				sink.start(_M__sTextChars);
				sink.literal(");");
				sink.end();
				Term term_44;
				{
					BufferSink buf_3 = sink.context().makeBuffer();
					buf_3.start(_M_STRING);
					buf_3.literal(2);
					buf_3.end();
					term_44 = buf_3.term();
				}
				sink.propertyNamed("$LineLocation", term_44);
				Term term_298;
				{
					BufferSink buf_260 = sink.context().makeBuffer();
					buf_260.start(_M_STRING);
					buf_260.literal(75);
					buf_260.end();
					term_298 = buf_260.term();
				}
				sink.propertyNamed("$ColumnLocation", term_298);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_10 :
			{
				if (term_104.descriptor() != _M_Crsx_xdeclaration_xA3)
				{
					break label_10;
				}
				Term sub_51 = term_104.sub(0).ref();
				if (sub_51.descriptor() != _M_Crsx_xruleDeclaration)
				{
					break label_10;
				}
				Term sub_64 = sub_51.sub(0).ref();
				/* #option?=sub */Term sub_57 = sub_51.sub(1).ref();
				/* #pattern=sub */Term sub_84 = sub_51.sub(2).ref();
				Term sub_147 = sub_51.sub(3).ref();
				/* #contractum=sub *//*Contract*/sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
			label_8 :
			{
				if (term_104.descriptor() != _M_Crsx_xdeclaration_xA4)
				{
					break label_8;
				}
				Term sub_49 = term_104.sub(0).ref();
				if (sub_49.descriptor() != _M_Crsx_xsortDeclaration_xA1)
				{
					break label_8;
				}
				Term sub_77 = sub_49.sub(0).ref();
				/* #sortparams?=sub */Term sub_55 = sub_49.sub(1).ref();
				/* #sortset=sub */Term sub_23 = sub_49.sub(2).ref();
				/* #sortname=sub */Term sub_11 = sub_49.sub(3).ref();
				Term sub_138 = sub_49.sub(4).ref();
				Term sub_176 = sub_49.sub(5).ref();
				if (sub_176.descriptor() != _M_Crsx_xforms)
				{
					break label_8;
				}
				Term sub_14 = sub_176.sub(0).ref();
				/* #forms_S1*=sub */Term sub_271 = sub_49.sub(6).ref();/*Contract*/
				sink.start(_M_RegisterDataSort);
				sink.copy(sub_55.ref());
				sink.copy(sub_23.ref());
				sink.copy(sub_14.ref());
				sink.end();
				return true;
			}
			label_56 :
			{
				if (term_104.descriptor() != _M_Crsx_xdeclaration_xA4)
				{
					break label_56;
				}
				Term sub_21 = term_104.sub(0).ref();
				if (sub_21.descriptor() != _M_Crsx_xsortDeclaration_xA2)
				{
					break label_56;
				}
				Term sub_85 = sub_21.sub(0).ref();
				/* #sortparams?=sub */Term sub_132 = sub_21.sub(1).ref();
				/* #sortset=sub */Term sub_161 = sub_21.sub(2).ref();
				if (sub_161.descriptor() != _M_Crsx_xform_xA1)
				{
					break label_56;
				}
				Term sub_98 = sub_161.sub(0).ref();
				/* #constructor=sub */Term sub_80 = sub_161.sub(1).ref();
				/* #arguments?=sub */Term sub_97 = sub_21.sub(3).ref();
				Term sub_40 = sub_21.sub(4).ref();
				/* #sortname=sub *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_18;
				{
					BufferSink buf_127 = sink.context().makeBuffer();
					buf_127.start(_M_STRING);
					buf_127.literal(1);
					buf_127.end();
					term_18 = buf_127.term();
				}
				sink.propertyNamed("$LineLocation", term_18);
				Term term_275;
				{
					BufferSink buf_165 = sink.context().makeBuffer();
					buf_165.start(_M_STRING);
					buf_165.literal(1);
					buf_165.end();
					term_275 = buf_165.term();
				}
				sink.propertyNamed("$ColumnLocation", term_275);
				sink.start(_M__sTextCons);
				Term term_277;
				{
					BufferSink buf_80 = sink.context().makeBuffer();
					buf_80.start(_M_STRING);
					buf_80.literal(1);
					buf_80.end();
					term_277 = buf_80.term();
				}
				sink.propertyNamed("$LineLocation", term_277);
				Term term_96;
				{
					BufferSink buf_46 = sink.context().makeBuffer();
					buf_46.start(_M_STRING);
					buf_46.literal(1);
					buf_46.end();
					term_96 = buf_46.term();
				}
				sink.propertyNamed("$ColumnLocation", term_96);
				sink.start(_M__sTextChars);
				sink.literal("context.register(");
				sink.end();
				Term term_278;
				{
					BufferSink buf_22 = sink.context().makeBuffer();
					buf_22.start(_M_STRING);
					buf_22.literal(1);
					buf_22.end();
					term_278 = buf_22.term();
				}
				sink.propertyNamed("$LineLocation", term_278);
				Term term_147;
				{
					BufferSink buf_103 = sink.context().makeBuffer();
					buf_103.start(_M_STRING);
					buf_103.literal(2);
					buf_103.end();
					term_147 = buf_103.term();
				}
				sink.propertyNamed("$ColumnLocation", term_147);
				sink.start(_M__sTextCons);
				Term term_183;
				{
					BufferSink buf_107 = sink.context().makeBuffer();
					buf_107.start(_M_STRING);
					buf_107.literal(1);
					buf_107.end();
					term_183 = buf_107.term();
				}
				sink.propertyNamed("$LineLocation", term_183);
				Term term_72;
				{
					BufferSink buf_10 = sink.context().makeBuffer();
					buf_10.start(_M_STRING);
					buf_10.literal(2);
					buf_10.end();
					term_72 = buf_10.term();
				}
				sink.propertyNamed("$ColumnLocation", term_72);
				sink.start(_M__sTextEmbed);
				Term term_150;
				{
					BufferSink buf_40 = sink.context().makeBuffer();
					buf_40.start(_M_STRING);
					buf_40.literal(1);
					buf_40.end();
					term_150 = buf_40.term();
				}
				sink.propertyNamed("$LineLocation", term_150);
				Term term_206;
				{
					BufferSink buf_96 = sink.context().makeBuffer();
					buf_96.start(_M_STRING);
					buf_96.literal(2);
					buf_96.end();
					term_206 = buf_96.term();
				}
				sink.propertyNamed("$ColumnLocation", term_206);
				sink.start(_M_AsText);
				sink.start(_M_Descriptor);
				sink.copy(sub_98.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_102;
				{
					BufferSink buf_140 = sink.context().makeBuffer();
					buf_140.start(_M_STRING);
					buf_140.literal(1);
					buf_140.end();
					term_102 = buf_140.term();
				}
				sink.propertyNamed("$LineLocation", term_102);
				Term term_136;
				{
					BufferSink buf_180 = sink.context().makeBuffer();
					buf_180.start(_M_STRING);
					buf_180.literal(19);
					buf_180.end();
					term_136 = buf_180.term();
				}
				sink.propertyNamed("$ColumnLocation", term_136);
				sink.start(_M__sTextCons);
				Term term_2;
				{
					BufferSink buf_93 = sink.context().makeBuffer();
					buf_93.start(_M_STRING);
					buf_93.literal(1);
					buf_93.end();
					term_2 = buf_93.term();
				}
				sink.propertyNamed("$LineLocation", term_2);
				Term term_106;
				{
					BufferSink buf_4 = sink.context().makeBuffer();
					buf_4.start(_M_STRING);
					buf_4.literal(19);
					buf_4.end();
					term_106 = buf_4.term();
				}
				sink.propertyNamed("$ColumnLocation", term_106);
				sink.start(_M__sTextChars);
				sink.literal(");");
				sink.end();
				Term term_132;
				{
					BufferSink buf_105 = sink.context().makeBuffer();
					buf_105.start(_M_STRING);
					buf_105.literal(1);
					buf_105.end();
					term_132 = buf_105.term();
				}
				sink.propertyNamed("$LineLocation", term_132);
				Term term_242;
				{
					BufferSink buf_186 = sink.context().makeBuffer();
					buf_186.start(_M_STRING);
					buf_186.literal(45);
					buf_186.end();
					term_242 = buf_186.term();
				}
				sink.propertyNamed("$ColumnLocation", term_242);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_25 :
			{
				if (term_104.descriptor() != _M_Crsx_xdeclaration_xA5)
				{
					break label_25;
				}
				Term sub_189 = term_104.sub(0).ref();
				if (sub_189.descriptor() != _M_Crsx_xdirective_xA1)
				{
					break label_25;
				}
				Term sub_121 = sub_189.sub(0).ref();
				/* #constructor=sub */Term sub_78 = sub_189.sub(1).ref();
				if (sub_78.descriptor() != _M__sNil)
				{
					break label_25;
				}/*Contract*/
				sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
			label_1 :
			{
				if (term_104.descriptor() != _M_Crsx_xdeclaration_xA5)
				{
					break label_1;
				}
				Term sub_146 = term_104.sub(0).ref();
				if (sub_146.descriptor() != _M_Crsx_xdirective_xA1)
				{
					break label_1;
				}
				Term sub_38 = sub_146.sub(0).ref();
				/* #constructor=sub */Term sub_79 = sub_146.sub(1).ref();
				if (sub_79.descriptor() != _M__sCons)
				{
					break label_1;
				}
				Term sub_53 = sub_79.sub(0).ref();
				if (sub_53.descriptor() != _M_Crsx_xdirectiveArguments)
				{
					break label_1;
				}
				Term sub_87 = sub_53.sub(0).ref();
				Term sub_65 = sub_53.sub(1).ref();
				if (sub_65.descriptor() != _M__sCons)
				{
					break label_1;
				}
				Term sub_91 = sub_65.sub(0).ref();
				if (sub_91.descriptor() != _M_Crsx_xdirectives)
				{
					break label_1;
				}
				Term sub_81 = sub_91.sub(0).ref();
				if (sub_81.descriptor() != _M_Crsx_xdirective_xA2)
				{
					break label_1;
				}
				Term sub_54 = sub_81.sub(0).ref();
				if (sub_54.descriptor() != _M_Crsx_xdirectiveList)
				{
					break label_1;
				}
				Term sub_140 = sub_54.sub(0).ref();
				Term sub_152 = sub_54.sub(1).ref();
				if (sub_152.descriptor() != _M__sNil)
				{
					break label_1;
				}
				Term sub_95 = sub_54.sub(2).ref();
				Term sub_341 = sub_91.sub(1).ref();
				if (sub_341.descriptor() != _M__sNil)
				{
					break label_1;
				}
				Term sub_168 = sub_65.sub(1).ref();
				if (sub_168.descriptor() != _M__sNil)
				{
					break label_1;
				}
				Term sub_37 = sub_53.sub(2).ref();
				Term sub_59 = sub_79.sub(1).ref();
				if (sub_59.descriptor() != _M__sNil)
				{
					break label_1;
				}/*Contract*/
				sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
			label_39 :
			{
				if (term_104.descriptor() != _M_Crsx_xdeclaration_xA5)
				{
					break label_39;
				}
				Term sub_16 = term_104.sub(0).ref();
				if (sub_16.descriptor() != _M_Crsx_xdirective_xA1)
				{
					break label_39;
				}
				Term sub_28 = sub_16.sub(0).ref();
				/* #constructor=sub */Term sub_4 = sub_16.sub(1).ref();
				if (sub_4.descriptor() != _M__sCons)
				{
					break label_39;
				}
				Term sub_145 = sub_4.sub(0).ref();
				if (sub_145.descriptor() != _M_Crsx_xdirectiveArguments)
				{
					break label_39;
				}
				Term sub_29 = sub_145.sub(0).ref();
				Term sub_12 = sub_145.sub(1).ref();
				if (sub_12.descriptor() != _M__sCons)
				{
					break label_39;
				}
				Term sub_39 = sub_12.sub(0).ref();
				if (sub_39.descriptor() != _M_Crsx_xdirectives)
				{
					break label_39;
				}
				Term sub_119 = sub_39.sub(0).ref();
				if (sub_119.descriptor() != _M_Crsx_xdirective_xA2)
				{
					break label_39;
				}
				Term sub_262 = sub_119.sub(0).ref();
				if (sub_262.descriptor() != _M_Crsx_xdirectiveList)
				{
					break label_39;
				}
				Term sub_136 = sub_262.sub(0).ref();
				Term sub_134 = sub_262.sub(1).ref();
				if (sub_134.descriptor() != _M__sCons)
				{
					break label_39;
				}
				Term sub_61 = sub_134.sub(0).ref();
				/* #declarations=sub */Term sub_75 = sub_134.sub(1).ref();
				if (sub_75.descriptor() != _M__sNil)
				{
					break label_39;
				}
				Term sub_69 = sub_262.sub(2).ref();
				Term sub_74 = sub_39.sub(1).ref();
				if (sub_74.descriptor() != _M__sNil)
				{
					break label_39;
				}
				Term sub_42 = sub_12.sub(1).ref();
				if (sub_42.descriptor() != _M__sNil)
				{
					break label_39;
				}
				Term sub_96 = sub_145.sub(2).ref();
				Term sub_31 = sub_4.sub(1).ref();
				if (sub_31.descriptor() != _M__sNil)
				{
					break label_39;
				}/*Contract*/
				sink.start(_M_Registers);
				sink.start(_M_DesugarDeclarations);
				sink.copy(sub_61.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Register, term_104);
	}

	final public static boolean _M_Registers(Sink sink, int shared, int depth, Term term_118)
	{
		if (depth < 2000)
		{
			label_70 :
			{
				if (term_118.descriptor() != _M__sNil)
				{
					break label_70;
				}/*Contract*/
				sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
			label_196 :
			{
				if (term_118.descriptor() != _M__sCons)
				{
					break label_196;
				}
				Term sub_92 = term_118.sub(0).ref();
				if (sub_92.descriptor() != _M_Crsx_xdeclarations_xS1)
				{
					break label_196;
				}
				Term sub_204 = sub_92.sub(0).ref();
				Term sub_70 = sub_92.sub(1).ref();
				if (sub_70.descriptor() != _M__sNil)
				{
					break label_196;
				}
				Term sub_180 = term_118.sub(1).ref();
				if (sub_180.descriptor() != _M__sNil)
				{
					break label_196;
				}/*Contract*/
				sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
			label_95 :
			{
				if (term_118.descriptor() != _M__sCons)
				{
					break label_95;
				}
				Term sub_123 = term_118.sub(0).ref();
				if (sub_123.descriptor() != _M_Crsx_xdeclarations_xS1)
				{
					break label_95;
				}
				Term sub_162 = sub_123.sub(0).ref();
				Term sub_249 = sub_123.sub(1).ref();
				if (sub_249.descriptor() != _M__sCons)
				{
					break label_95;
				}
				Term sub_126 = sub_249.sub(0).ref();
				/* #declaration=sub */Term sub_52 = sub_249.sub(1).ref();
				if (sub_52.descriptor() != _M__sNil)
				{
					break label_95;
				}
				Term sub_166 = term_118.sub(1).ref();
				/* #declarations_S1*=sub *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextEmbed);
				sink.start(_M_AsText);
				sink.start(_M_Register);
				sink.copy(sub_126.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_388;
				{
					BufferSink buf_82 = sink.context().makeBuffer();
					buf_82.start(_M_STRING);
					buf_82.literal(1);
					buf_82.end();
					term_388 = buf_82.term();
				}
				sink.propertyNamed("$LineLocation", term_388);
				Term term_62;
				{
					BufferSink buf_136 = sink.context().makeBuffer();
					buf_136.start(_M_STRING);
					buf_136.literal(1);
					buf_136.end();
					term_62 = buf_136.term();
				}
				sink.propertyNamed("$ColumnLocation", term_62);
				sink.start(_M__sTextCons);
				Term term_178;
				{
					BufferSink buf_130 = sink.context().makeBuffer();
					buf_130.start(_M_STRING);
					buf_130.literal(1);
					buf_130.end();
					term_178 = buf_130.term();
				}
				sink.propertyNamed("$LineLocation", term_178);
				Term term_21;
				{
					BufferSink buf_58 = sink.context().makeBuffer();
					buf_58.start(_M_STRING);
					buf_58.literal(1);
					buf_58.end();
					term_21 = buf_58.term();
				}
				sink.propertyNamed("$ColumnLocation", term_21);
				sink.start(_M__sTextEmbed);
				Term term_334;
				{
					BufferSink buf_273 = sink.context().makeBuffer();
					buf_273.start(_M_STRING);
					buf_273.literal(1);
					buf_273.end();
					term_334 = buf_273.term();
				}
				sink.propertyNamed("$LineLocation", term_334);
				Term term_295;
				{
					BufferSink buf_54 = sink.context().makeBuffer();
					buf_54.start(_M_STRING);
					buf_54.literal(1);
					buf_54.end();
					term_295 = buf_54.term();
				}
				sink.propertyNamed("$ColumnLocation", term_295);
				sink.start(_M_AsText);
				sink.start(_M_Registers);
				sink.copy(sub_166.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_61;
				{
					BufferSink buf_168 = sink.context().makeBuffer();
					buf_168.start(_M_STRING);
					buf_168.literal(1);
					buf_168.end();
					term_61 = buf_168.term();
				}
				sink.propertyNamed("$LineLocation", term_61);
				Term term_10;
				{
					BufferSink buf_35 = sink.context().makeBuffer();
					buf_35.start(_M_STRING);
					buf_35.literal(25);
					buf_35.end();
					term_10 = buf_35.term();
				}
				sink.propertyNamed("$ColumnLocation", term_10);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Registers, term_118);
	}

	final public static boolean _M_InitModule(Sink sink, int shared, int depth, Term term_52)
	{
		if (depth < 2000)
		{
			sink.start(_M__sTextCons);
			sink.start(_M__sTextBreak);
			sink.literal("\n");
			sink.end();
			Term term_191;
			{
				BufferSink buf_161 = sink.context().makeBuffer();
				buf_161.start(_M_STRING);
				buf_161.literal(1);
				buf_161.end();
				term_191 = buf_161.term();
			}
			sink.propertyNamed("$LineLocation", term_191);
			Term term_97;
			{
				BufferSink buf_77 = sink.context().makeBuffer();
				buf_77.start(_M_STRING);
				buf_77.literal(1);
				buf_77.end();
				term_97 = buf_77.term();
			}
			sink.propertyNamed("$ColumnLocation", term_97);
			sink.start(_M__sTextCons);
			Term term_19;
			{
				BufferSink buf_122 = sink.context().makeBuffer();
				buf_122.start(_M_STRING);
				buf_122.literal(1);
				buf_122.end();
				term_19 = buf_122.term();
			}
			sink.propertyNamed("$LineLocation", term_19);
			Term term_57;
			{
				BufferSink buf_147 = sink.context().makeBuffer();
				buf_147.start(_M_STRING);
				buf_147.literal(1);
				buf_147.end();
				term_57 = buf_147.term();
			}
			sink.propertyNamed("$ColumnLocation", term_57);
			sink.start(_M__sTextChars);
			sink.literal("private static boolean initialized = false;");
			sink.end();
			Term term_131;
			{
				BufferSink buf_280 = sink.context().makeBuffer();
				buf_280.start(_M_STRING);
				buf_280.literal(2);
				buf_280.end();
				term_131 = buf_280.term();
			}
			sink.propertyNamed("$LineLocation", term_131);
			Term term_70;
			{
				BufferSink buf_198 = sink.context().makeBuffer();
				buf_198.start(_M_STRING);
				buf_198.literal(1);
				buf_198.end();
				term_70 = buf_198.term();
			}
			sink.propertyNamed("$ColumnLocation", term_70);
			sink.start(_M__sTextCons);
			Term term_176;
			{
				BufferSink buf_14 = sink.context().makeBuffer();
				buf_14.start(_M_STRING);
				buf_14.literal(2);
				buf_14.end();
				term_176 = buf_14.term();
			}
			sink.propertyNamed("$LineLocation", term_176);
			Term term_266;
			{
				BufferSink buf_120 = sink.context().makeBuffer();
				buf_120.start(_M_STRING);
				buf_120.literal(1);
				buf_120.end();
				term_266 = buf_120.term();
			}
			sink.propertyNamed("$ColumnLocation", term_266);
			sink.start(_M__sTextBreak);
			sink.literal("\n");
			sink.end();
			Term term_78;
			{
				BufferSink buf_102 = sink.context().makeBuffer();
				buf_102.start(_M_STRING);
				buf_102.literal(2);
				buf_102.end();
				term_78 = buf_102.term();
			}
			sink.propertyNamed("$LineLocation", term_78);
			Term term_194;
			{
				BufferSink buf_167 = sink.context().makeBuffer();
				buf_167.start(_M_STRING);
				buf_167.literal(44);
				buf_167.end();
				term_194 = buf_167.term();
			}
			sink.propertyNamed("$ColumnLocation", term_194);
			sink.start(_M__sTextCons);
			Term term_145;
			{
				BufferSink buf_0 = sink.context().makeBuffer();
				buf_0.start(_M_STRING);
				buf_0.literal(2);
				buf_0.end();
				term_145 = buf_0.term();
			}
			sink.propertyNamed("$LineLocation", term_145);
			Term term_140;
			{
				BufferSink buf_261 = sink.context().makeBuffer();
				buf_261.start(_M_STRING);
				buf_261.literal(44);
				buf_261.end();
				term_140 = buf_261.term();
			}
			sink.propertyNamed("$ColumnLocation", term_140);
			sink.start(_M__sTextChars);
			sink.literal("public static void init(Context context)");
			sink.end();
			Term term_152;
			{
				BufferSink buf_218 = sink.context().makeBuffer();
				buf_218.start(_M_STRING);
				buf_218.literal(3);
				buf_218.end();
				term_152 = buf_218.term();
			}
			sink.propertyNamed("$LineLocation", term_152);
			Term term_169;
			{
				BufferSink buf_17 = sink.context().makeBuffer();
				buf_17.start(_M_STRING);
				buf_17.literal(1);
				buf_17.end();
				term_169 = buf_17.term();
			}
			sink.propertyNamed("$ColumnLocation", term_169);
			sink.start(_M__sTextCons);
			Term term_156;
			{
				BufferSink buf_132 = sink.context().makeBuffer();
				buf_132.start(_M_STRING);
				buf_132.literal(3);
				buf_132.end();
				term_156 = buf_132.term();
			}
			sink.propertyNamed("$LineLocation", term_156);
			Term term_28;
			{
				BufferSink buf_277 = sink.context().makeBuffer();
				buf_277.start(_M_STRING);
				buf_277.literal(1);
				buf_277.end();
				term_28 = buf_277.term();
			}
			sink.propertyNamed("$ColumnLocation", term_28);
			sink.start(_M__sTextBreak);
			sink.literal("\n");
			sink.end();
			Term term_130;
			{
				BufferSink buf_564 = sink.context().makeBuffer();
				buf_564.start(_M_STRING);
				buf_564.literal(3);
				buf_564.end();
				term_130 = buf_564.term();
			}
			sink.propertyNamed("$LineLocation", term_130);
			Term term_148;
			{
				BufferSink buf_171 = sink.context().makeBuffer();
				buf_171.start(_M_STRING);
				buf_171.literal(41);
				buf_171.end();
				term_148 = buf_171.term();
			}
			sink.propertyNamed("$ColumnLocation", term_148);
			sink.start(_M__sTextCons);
			Term term_139;
			{
				BufferSink buf_126 = sink.context().makeBuffer();
				buf_126.start(_M_STRING);
				buf_126.literal(3);
				buf_126.end();
				term_139 = buf_126.term();
			}
			sink.propertyNamed("$LineLocation", term_139);
			Term term_112;
			{
				BufferSink buf_84 = sink.context().makeBuffer();
				buf_84.start(_M_STRING);
				buf_84.literal(41);
				buf_84.end();
				term_112 = buf_84.term();
			}
			sink.propertyNamed("$ColumnLocation", term_112);
			sink.start(_M__sTextChars);
			sink.literal("{");
			sink.end();
			Term term_338;
			{
				BufferSink buf_247 = sink.context().makeBuffer();
				buf_247.start(_M_STRING);
				buf_247.literal(4);
				buf_247.end();
				term_338 = buf_247.term();
			}
			sink.propertyNamed("$LineLocation", term_338);
			Term term_103;
			{
				BufferSink buf_156 = sink.context().makeBuffer();
				buf_156.start(_M_STRING);
				buf_156.literal(1);
				buf_156.end();
				term_103 = buf_156.term();
			}
			sink.propertyNamed("$ColumnLocation", term_103);
			sink.start(_M__sTextCons);
			Term term_179;
			{
				BufferSink buf_47 = sink.context().makeBuffer();
				buf_47.start(_M_STRING);
				buf_47.literal(4);
				buf_47.end();
				term_179 = buf_47.term();
			}
			sink.propertyNamed("$LineLocation", term_179);
			Term term_158;
			{
				BufferSink buf_89 = sink.context().makeBuffer();
				buf_89.start(_M_STRING);
				buf_89.literal(2);
				buf_89.end();
				term_158 = buf_89.term();
			}
			sink.propertyNamed("$ColumnLocation", term_158);
			sink.start(_M__sTextIndent);
			Term term_245;
			{
				BufferSink buf_79 = sink.context().makeBuffer();
				buf_79.start(_M_STRING);
				buf_79.literal(4);
				buf_79.end();
				term_245 = buf_79.term();
			}
			sink.propertyNamed("$LineLocation", term_245);
			Term term_370;
			{
				BufferSink buf_146 = sink.context().makeBuffer();
				buf_146.start(_M_STRING);
				buf_146.literal(2);
				buf_146.end();
				term_370 = buf_146.term();
			}
			sink.propertyNamed("$ColumnLocation", term_370);
			sink.start(_M__sTextCons);
			Term term_267;
			{
				BufferSink buf_238 = sink.context().makeBuffer();
				buf_238.start(_M_STRING);
				buf_238.literal(4);
				buf_238.end();
				term_267 = buf_238.term();
			}
			sink.propertyNamed("$LineLocation", term_267);
			Term term_164;
			{
				BufferSink buf_223 = sink.context().makeBuffer();
				buf_223.start(_M_STRING);
				buf_223.literal(2);
				buf_223.end();
				term_164 = buf_223.term();
			}
			sink.propertyNamed("$ColumnLocation", term_164);
			sink.start(_M__sTextBreak);
			sink.literal("\n");
			sink.end();
			Term term_123;
			{
				BufferSink buf_199 = sink.context().makeBuffer();
				buf_199.start(_M_STRING);
				buf_199.literal(4);
				buf_199.end();
				term_123 = buf_199.term();
			}
			sink.propertyNamed("$LineLocation", term_123);
			Term term_293;
			{
				BufferSink buf_71 = sink.context().makeBuffer();
				buf_71.start(_M_STRING);
				buf_71.literal(3);
				buf_71.end();
				term_293 = buf_71.term();
			}
			sink.propertyNamed("$ColumnLocation", term_293);
			sink.start(_M__sTextCons);
			Term term_268;
			{
				BufferSink buf_207 = sink.context().makeBuffer();
				buf_207.start(_M_STRING);
				buf_207.literal(4);
				buf_207.end();
				term_268 = buf_207.term();
			}
			sink.propertyNamed("$LineLocation", term_268);
			Term term_120;
			{
				BufferSink buf_305 = sink.context().makeBuffer();
				buf_305.start(_M_STRING);
				buf_305.literal(3);
				buf_305.end();
				term_120 = buf_305.term();
			}
			sink.propertyNamed("$ColumnLocation", term_120);
			sink.start(_M__sTextChars);
			sink.literal("if (!initialized) ");
			sink.end();
			Term term_193;
			{
				BufferSink buf_152 = sink.context().makeBuffer();
				buf_152.start(_M_STRING);
				buf_152.literal(5);
				buf_152.end();
				term_193 = buf_152.term();
			}
			sink.propertyNamed("$LineLocation", term_193);
			Term term_512;
			{
				BufferSink buf_95 = sink.context().makeBuffer();
				buf_95.start(_M_STRING);
				buf_95.literal(1);
				buf_95.end();
				term_512 = buf_95.term();
			}
			sink.propertyNamed("$ColumnLocation", term_512);
			sink.start(_M__sTextCons);
			Term term_12;
			{
				BufferSink buf_274 = sink.context().makeBuffer();
				buf_274.start(_M_STRING);
				buf_274.literal(5);
				buf_274.end();
				term_12 = buf_274.term();
			}
			sink.propertyNamed("$LineLocation", term_12);
			Term term_205;
			{
				BufferSink buf_21 = sink.context().makeBuffer();
				buf_21.start(_M_STRING);
				buf_21.literal(1);
				buf_21.end();
				term_205 = buf_21.term();
			}
			sink.propertyNamed("$ColumnLocation", term_205);
			sink.start(_M__sTextBreak);
			sink.literal("\n");
			sink.end();
			Term term_423;
			{
				BufferSink buf_128 = sink.context().makeBuffer();
				buf_128.start(_M_STRING);
				buf_128.literal(5);
				buf_128.end();
				term_423 = buf_128.term();
			}
			sink.propertyNamed("$LineLocation", term_423);
			Term term_111;
			{
				BufferSink buf_178 = sink.context().makeBuffer();
				buf_178.start(_M_STRING);
				buf_178.literal(19);
				buf_178.end();
				term_111 = buf_178.term();
			}
			sink.propertyNamed("$ColumnLocation", term_111);
			sink.start(_M__sTextCons);
			Term term_303;
			{
				BufferSink buf_115 = sink.context().makeBuffer();
				buf_115.start(_M_STRING);
				buf_115.literal(5);
				buf_115.end();
				term_303 = buf_115.term();
			}
			sink.propertyNamed("$LineLocation", term_303);
			Term term_392;
			{
				BufferSink buf_358 = sink.context().makeBuffer();
				buf_358.start(_M_STRING);
				buf_358.literal(19);
				buf_358.end();
				term_392 = buf_358.term();
			}
			sink.propertyNamed("$ColumnLocation", term_392);
			sink.start(_M__sTextChars);
			sink.literal("{");
			sink.end();
			Term term_229;
			{
				BufferSink buf_202 = sink.context().makeBuffer();
				buf_202.start(_M_STRING);
				buf_202.literal(6);
				buf_202.end();
				term_229 = buf_202.term();
			}
			sink.propertyNamed("$LineLocation", term_229);
			Term term_159;
			{
				BufferSink buf_234 = sink.context().makeBuffer();
				buf_234.start(_M_STRING);
				buf_234.literal(1);
				buf_234.end();
				term_159 = buf_234.term();
			}
			sink.propertyNamed("$ColumnLocation", term_159);
			sink.start(_M__sTextCons);
			Term term_331;
			{
				BufferSink buf_50 = sink.context().makeBuffer();
				buf_50.start(_M_STRING);
				buf_50.literal(6);
				buf_50.end();
				term_331 = buf_50.term();
			}
			sink.propertyNamed("$LineLocation", term_331);
			Term term_141;
			{
				BufferSink buf_24 = sink.context().makeBuffer();
				buf_24.start(_M_STRING);
				buf_24.literal(2);
				buf_24.end();
				term_141 = buf_24.term();
			}
			sink.propertyNamed("$ColumnLocation", term_141);
			sink.start(_M__sTextIndent);
			Term term_116;
			{
				BufferSink buf_219 = sink.context().makeBuffer();
				buf_219.start(_M_STRING);
				buf_219.literal(6);
				buf_219.end();
				term_116 = buf_219.term();
			}
			sink.propertyNamed("$LineLocation", term_116);
			Term term_115;
			{
				BufferSink buf_292 = sink.context().makeBuffer();
				buf_292.start(_M_STRING);
				buf_292.literal(2);
				buf_292.end();
				term_115 = buf_292.term();
			}
			sink.propertyNamed("$ColumnLocation", term_115);
			sink.start(_M__sTextCons);
			Term term_248;
			{
				BufferSink buf_7 = sink.context().makeBuffer();
				buf_7.start(_M_STRING);
				buf_7.literal(6);
				buf_7.end();
				term_248 = buf_7.term();
			}
			sink.propertyNamed("$LineLocation", term_248);
			Term term_262;
			{
				BufferSink buf_60 = sink.context().makeBuffer();
				buf_60.start(_M_STRING);
				buf_60.literal(2);
				buf_60.end();
				term_262 = buf_60.term();
			}
			sink.propertyNamed("$ColumnLocation", term_262);
			sink.start(_M__sTextEmbed);
			Term term_281;
			{
				BufferSink buf_329 = sink.context().makeBuffer();
				buf_329.start(_M_STRING);
				buf_329.literal(6);
				buf_329.end();
				term_281 = buf_329.term();
			}
			sink.propertyNamed("$LineLocation", term_281);
			Term term_162;
			{
				BufferSink buf_262 = sink.context().makeBuffer();
				buf_262.start(_M_STRING);
				buf_262.literal(2);
				buf_262.end();
				term_162 = buf_262.term();
			}
			sink.propertyNamed("$ColumnLocation", term_162);
			sink.start(_M_AsText);
			sink.start(_M_Registers);
			sink.copy(term_52.ref());
			sink.end();
			sink.end();
			sink.end();
			Term term_238;
			{
				BufferSink buf_117 = sink.context().makeBuffer();
				buf_117.start(_M_STRING);
				buf_117.literal(6);
				buf_117.end();
				term_238 = buf_117.term();
			}
			sink.propertyNamed("$LineLocation", term_238);
			Term term_33;
			{
				BufferSink buf_183 = sink.context().makeBuffer();
				buf_183.start(_M_STRING);
				buf_183.literal(3);
				buf_183.end();
				term_33 = buf_183.term();
			}
			sink.propertyNamed("$ColumnLocation", term_33);
			sink.start(_M__sTextCons);
			Term term_247;
			{
				BufferSink buf_153 = sink.context().makeBuffer();
				buf_153.start(_M_STRING);
				buf_153.literal(6);
				buf_153.end();
				term_247 = buf_153.term();
			}
			sink.propertyNamed("$LineLocation", term_247);
			Term term_157;
			{
				BufferSink buf_65 = sink.context().makeBuffer();
				buf_65.start(_M_STRING);
				buf_65.literal(3);
				buf_65.end();
				term_157 = buf_65.term();
			}
			sink.propertyNamed("$ColumnLocation", term_157);
			sink.start(_M__sTextBreak);
			sink.literal("\n");
			sink.end();
			Term term_325;
			{
				BufferSink buf_396 = sink.context().makeBuffer();
				buf_396.start(_M_STRING);
				buf_396.literal(6);
				buf_396.end();
				term_325 = buf_396.term();
			}
			sink.propertyNamed("$LineLocation", term_325);
			Term term_127;
			{
				BufferSink buf_192 = sink.context().makeBuffer();
				buf_192.start(_M_STRING);
				buf_192.literal(29);
				buf_192.end();
				term_127 = buf_192.term();
			}
			sink.propertyNamed("$ColumnLocation", term_127);
			sink.start(_M__sTextCons);
			Term term_154;
			{
				BufferSink buf_133 = sink.context().makeBuffer();
				buf_133.start(_M_STRING);
				buf_133.literal(6);
				buf_133.end();
				term_154 = buf_133.term();
			}
			sink.propertyNamed("$LineLocation", term_154);
			Term term_91;
			{
				BufferSink buf_72 = sink.context().makeBuffer();
				buf_72.start(_M_STRING);
				buf_72.literal(29);
				buf_72.end();
				term_91 = buf_72.term();
			}
			sink.propertyNamed("$ColumnLocation", term_91);
			sink.start(_M__sTextChars);
			sink.literal("initialized = true;");
			sink.end();
			Term term_126;
			{
				BufferSink buf_162 = sink.context().makeBuffer();
				buf_162.start(_M_STRING);
				buf_162.literal(7);
				buf_162.end();
				term_126 = buf_162.term();
			}
			sink.propertyNamed("$LineLocation", term_126);
			Term term_124;
			{
				BufferSink buf_206 = sink.context().makeBuffer();
				buf_206.start(_M_STRING);
				buf_206.literal(1);
				buf_206.end();
				term_124 = buf_206.term();
			}
			sink.propertyNamed("$ColumnLocation", term_124);
			sink.start(_M__sTextNil);
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			Term term_296;
			{
				BufferSink buf_327 = sink.context().makeBuffer();
				buf_327.start(_M_STRING);
				buf_327.literal(7);
				buf_327.end();
				term_296 = buf_327.term();
			}
			sink.propertyNamed("$LineLocation", term_296);
			Term term_264;
			{
				BufferSink buf_114 = sink.context().makeBuffer();
				buf_114.start(_M_STRING);
				buf_114.literal(20);
				buf_114.end();
				term_264 = buf_114.term();
			}
			sink.propertyNamed("$ColumnLocation", term_264);
			sink.start(_M__sTextCons);
			Term term_155;
			{
				BufferSink buf_244 = sink.context().makeBuffer();
				buf_244.start(_M_STRING);
				buf_244.literal(7);
				buf_244.end();
				term_155 = buf_244.term();
			}
			sink.propertyNamed("$LineLocation", term_155);
			Term term_85;
			{
				BufferSink buf_125 = sink.context().makeBuffer();
				buf_125.start(_M_STRING);
				buf_125.literal(20);
				buf_125.end();
				term_85 = buf_125.term();
			}
			sink.propertyNamed("$ColumnLocation", term_85);
			sink.start(_M__sTextBreak);
			sink.literal("\n");
			sink.end();
			Term term_261;
			{
				BufferSink buf_158 = sink.context().makeBuffer();
				buf_158.start(_M_STRING);
				buf_158.literal(7);
				buf_158.end();
				term_261 = buf_158.term();
			}
			sink.propertyNamed("$LineLocation", term_261);
			Term term_190;
			{
				BufferSink buf_118 = sink.context().makeBuffer();
				buf_118.start(_M_STRING);
				buf_118.literal(21);
				buf_118.end();
				term_190 = buf_118.term();
			}
			sink.propertyNamed("$ColumnLocation", term_190);
			sink.start(_M__sTextCons);
			Term term_291;
			{
				BufferSink buf_175 = sink.context().makeBuffer();
				buf_175.start(_M_STRING);
				buf_175.literal(7);
				buf_175.end();
				term_291 = buf_175.term();
			}
			sink.propertyNamed("$LineLocation", term_291);
			Term term_290;
			{
				BufferSink buf_208 = sink.context().makeBuffer();
				buf_208.start(_M_STRING);
				buf_208.literal(21);
				buf_208.end();
				term_290 = buf_208.term();
			}
			sink.propertyNamed("$ColumnLocation", term_290);
			sink.start(_M__sTextChars);
			sink.literal("}");
			sink.end();
			Term term_46;
			{
				BufferSink buf_170 = sink.context().makeBuffer();
				buf_170.start(_M_STRING);
				buf_170.literal(8);
				buf_170.end();
				term_46 = buf_170.term();
			}
			sink.propertyNamed("$LineLocation", term_46);
			Term term_228;
			{
				BufferSink buf_119 = sink.context().makeBuffer();
				buf_119.start(_M_STRING);
				buf_119.literal(1);
				buf_119.end();
				term_228 = buf_119.term();
			}
			sink.propertyNamed("$ColumnLocation", term_228);
			sink.start(_M__sTextNil);
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			Term term_146;
			{
				BufferSink buf_164 = sink.context().makeBuffer();
				buf_164.start(_M_STRING);
				buf_164.literal(8);
				buf_164.end();
				term_146 = buf_164.term();
			}
			sink.propertyNamed("$LineLocation", term_146);
			Term term_170;
			{
				BufferSink buf_112 = sink.context().makeBuffer();
				buf_112.start(_M_STRING);
				buf_112.literal(2);
				buf_112.end();
				term_170 = buf_112.term();
			}
			sink.propertyNamed("$ColumnLocation", term_170);
			sink.start(_M__sTextCons);
			Term term_199;
			{
				BufferSink buf_335 = sink.context().makeBuffer();
				buf_335.start(_M_STRING);
				buf_335.literal(8);
				buf_335.end();
				term_199 = buf_335.term();
			}
			sink.propertyNamed("$LineLocation", term_199);
			Term term_137;
			{
				BufferSink buf_92 = sink.context().makeBuffer();
				buf_92.start(_M_STRING);
				buf_92.literal(2);
				buf_92.end();
				term_137 = buf_92.term();
			}
			sink.propertyNamed("$ColumnLocation", term_137);
			sink.start(_M__sTextBreak);
			sink.literal("\n");
			sink.end();
			Term term_16;
			{
				BufferSink buf_113 = sink.context().makeBuffer();
				buf_113.start(_M_STRING);
				buf_113.literal(8);
				buf_113.end();
				term_16 = buf_113.term();
			}
			sink.propertyNamed("$LineLocation", term_16);
			Term term_233;
			{
				BufferSink buf_27 = sink.context().makeBuffer();
				buf_27.start(_M_STRING);
				buf_27.literal(3);
				buf_27.end();
				term_233 = buf_27.term();
			}
			sink.propertyNamed("$ColumnLocation", term_233);
			sink.start(_M__sTextCons);
			Term term_289;
			{
				BufferSink buf_141 = sink.context().makeBuffer();
				buf_141.start(_M_STRING);
				buf_141.literal(8);
				buf_141.end();
				term_289 = buf_141.term();
			}
			sink.propertyNamed("$LineLocation", term_289);
			Term term_220;
			{
				BufferSink buf_185 = sink.context().makeBuffer();
				buf_185.start(_M_STRING);
				buf_185.literal(3);
				buf_185.end();
				term_220 = buf_185.term();
			}
			sink.propertyNamed("$ColumnLocation", term_220);
			sink.start(_M__sTextChars);
			sink.literal("}");
			sink.end();
			Term term_196;
			{
				BufferSink buf_37 = sink.context().makeBuffer();
				buf_37.start(_M_STRING);
				buf_37.literal(9);
				buf_37.end();
				term_196 = buf_37.term();
			}
			sink.propertyNamed("$LineLocation", term_196);
			Term term_95;
			{
				BufferSink buf_257 = sink.context().makeBuffer();
				buf_257.start(_M_STRING);
				buf_257.literal(1);
				buf_257.end();
				term_95 = buf_257.term();
			}
			sink.propertyNamed("$ColumnLocation", term_95);
			sink.start(_M__sTextNil);
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_InitModule, term_52);
	}

	final public static boolean _M_SetBuffer(Sink sink, int shared, int depth, Properties props, Term term_182, Variable var_32, Variable var_98, Term term_204)
	{
		if (depth < 2000)
		{
			label_73 :
			{
				Term value = props == null ? null : props.lookup("$sink");
				if (value == null)
				{
					break label_73;
				}
				if (value.descriptor() != _M_TEXT)
				{
					break label_73;
				}
				Term sub_0 = value.sub(0).ref();
				/* #sink=sub */
				/* #freeTerm=term */
				/* #=term *//*Contract*/
				Variable var_96 = sink.context().makeVariable("term");
				Variable var_59 = sink.context().makeVariable("buf");
				sink.start(_M__sTextCons);
				sink.start(_M__sTextChars);
				sink.literal("Term ");
				sink.end();
				Term term_181;
				{
					BufferSink buf_91 = sink.context().makeBuffer();
					buf_91.start(_M_STRING);
					buf_91.literal(1);
					buf_91.end();
					term_181 = buf_91.term();
				}
				sink.propertyNamed("$LineLocation", term_181);
				Term term_471;
				{
					BufferSink buf_221 = sink.context().makeBuffer();
					buf_221.start(_M_STRING);
					buf_221.literal(1);
					buf_221.end();
					term_471 = buf_221.term();
				}
				sink.propertyNamed("$ColumnLocation", term_471);
				sink.start(_M__sTextCons);
				Term term_133;
				{
					BufferSink buf_271 = sink.context().makeBuffer();
					buf_271.start(_M_STRING);
					buf_271.literal(1);
					buf_271.end();
					term_133 = buf_271.term();
				}
				sink.propertyNamed("$LineLocation", term_133);
				Term term_122;
				{
					BufferSink buf_159 = sink.context().makeBuffer();
					buf_159.start(_M_STRING);
					buf_159.literal(1);
					buf_159.end();
					term_122 = buf_159.term();
				}
				sink.propertyNamed("$ColumnLocation", term_122);
				sink.start(_M__sTextEmbed);
				Term term_313;
				{
					BufferSink buf_43 = sink.context().makeBuffer();
					buf_43.start(_M_STRING);
					buf_43.literal(1);
					buf_43.end();
					term_313 = buf_43.term();
				}
				sink.propertyNamed("$LineLocation", term_313);
				Term term_17;
				{
					BufferSink buf_210 = sink.context().makeBuffer();
					buf_210.start(_M_STRING);
					buf_210.literal(1);
					buf_210.end();
					term_17 = buf_210.term();
				}
				sink.propertyNamed("$ColumnLocation", term_17);
				sink.start(_M_AsText);
				sink.use(var_96);
				sink.end();
				sink.end();
				Term term_167;
				{
					BufferSink buf_231 = sink.context().makeBuffer();
					buf_231.start(_M_STRING);
					buf_231.literal(1);
					buf_231.end();
					term_167 = buf_231.term();
				}
				sink.propertyNamed("$LineLocation", term_167);
				Term term_173;
				{
					BufferSink buf_18 = sink.context().makeBuffer();
					buf_18.start(_M_STRING);
					buf_18.literal(6);
					buf_18.end();
					term_173 = buf_18.term();
				}
				sink.propertyNamed("$ColumnLocation", term_173);
				sink.start(_M__sTextCons);
				Term term_230;
				{
					BufferSink buf_282 = sink.context().makeBuffer();
					buf_282.start(_M_STRING);
					buf_282.literal(1);
					buf_282.end();
					term_230 = buf_282.term();
				}
				sink.propertyNamed("$LineLocation", term_230);
				Term term_231;
				{
					BufferSink buf_399 = sink.context().makeBuffer();
					buf_399.start(_M_STRING);
					buf_399.literal(6);
					buf_399.end();
					term_231 = buf_399.term();
				}
				sink.propertyNamed("$ColumnLocation", term_231);
				sink.start(_M__sTextChars);
				sink.literal(";");
				sink.end();
				Term term_516;
				{
					BufferSink buf_450 = sink.context().makeBuffer();
					buf_450.start(_M_STRING);
					buf_450.literal(1);
					buf_450.end();
					term_516 = buf_450.term();
				}
				sink.propertyNamed("$LineLocation", term_516);
				Term term_221;
				{
					BufferSink buf_204 = sink.context().makeBuffer();
					buf_204.start(_M_STRING);
					buf_204.literal(12);
					buf_204.end();
					term_221 = buf_204.term();
				}
				sink.propertyNamed("$ColumnLocation", term_221);
				sink.start(_M__sTextCons);
				Term term_418;
				{
					BufferSink buf_150 = sink.context().makeBuffer();
					buf_150.start(_M_STRING);
					buf_150.literal(1);
					buf_150.end();
					term_418 = buf_150.term();
				}
				sink.propertyNamed("$LineLocation", term_418);
				Term term_161;
				{
					BufferSink buf_334 = sink.context().makeBuffer();
					buf_334.start(_M_STRING);
					buf_334.literal(12);
					buf_334.end();
					term_161 = buf_334.term();
				}
				sink.propertyNamed("$ColumnLocation", term_161);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_200;
				{
					BufferSink buf_259 = sink.context().makeBuffer();
					buf_259.start(_M_STRING);
					buf_259.literal(1);
					buf_259.end();
					term_200 = buf_259.term();
				}
				sink.propertyNamed("$LineLocation", term_200);
				Term term_188;
				{
					BufferSink buf_242 = sink.context().makeBuffer();
					buf_242.start(_M_STRING);
					buf_242.literal(13);
					buf_242.end();
					term_188 = buf_242.term();
				}
				sink.propertyNamed("$ColumnLocation", term_188);
				sink.start(_M__sTextCons);
				Term term_384;
				{
					BufferSink buf_181 = sink.context().makeBuffer();
					buf_181.start(_M_STRING);
					buf_181.literal(1);
					buf_181.end();
					term_384 = buf_181.term();
				}
				sink.propertyNamed("$LineLocation", term_384);
				Term term_258;
				{
					BufferSink buf_352 = sink.context().makeBuffer();
					buf_352.start(_M_STRING);
					buf_352.literal(13);
					buf_352.end();
					term_258 = buf_352.term();
				}
				sink.propertyNamed("$ColumnLocation", term_258);
				sink.start(_M__sTextChars);
				sink.literal("{");
				sink.end();
				Term term_387;
				{
					BufferSink buf_272 = sink.context().makeBuffer();
					buf_272.start(_M_STRING);
					buf_272.literal(2);
					buf_272.end();
					term_387 = buf_272.term();
				}
				sink.propertyNamed("$LineLocation", term_387);
				Term term_226;
				{
					BufferSink buf_135 = sink.context().makeBuffer();
					buf_135.start(_M_STRING);
					buf_135.literal(1);
					buf_135.end();
					term_226 = buf_135.term();
				}
				sink.propertyNamed("$ColumnLocation", term_226);
				sink.start(_M__sTextCons);
				Term term_271;
				{
					BufferSink buf_190 = sink.context().makeBuffer();
					buf_190.start(_M_STRING);
					buf_190.literal(2);
					buf_190.end();
					term_271 = buf_190.term();
				}
				sink.propertyNamed("$LineLocation", term_271);
				Term term_69;
				{
					BufferSink buf_42 = sink.context().makeBuffer();
					buf_42.start(_M_STRING);
					buf_42.literal(2);
					buf_42.end();
					term_69 = buf_42.term();
				}
				sink.propertyNamed("$ColumnLocation", term_69);
				sink.start(_M__sTextIndent);
				Term term_207;
				{
					BufferSink buf_336 = sink.context().makeBuffer();
					buf_336.start(_M_STRING);
					buf_336.literal(2);
					buf_336.end();
					term_207 = buf_336.term();
				}
				sink.propertyNamed("$LineLocation", term_207);
				Term term_482;
				{
					BufferSink buf_463 = sink.context().makeBuffer();
					buf_463.start(_M_STRING);
					buf_463.literal(2);
					buf_463.end();
					term_482 = buf_463.term();
				}
				sink.propertyNamed("$ColumnLocation", term_482);
				sink.start(_M__sTextCons);
				Term term_171;
				{
					BufferSink buf_226 = sink.context().makeBuffer();
					buf_226.start(_M_STRING);
					buf_226.literal(2);
					buf_226.end();
					term_171 = buf_226.term();
				}
				sink.propertyNamed("$LineLocation", term_171);
				Term term_252;
				{
					BufferSink buf_144 = sink.context().makeBuffer();
					buf_144.start(_M_STRING);
					buf_144.literal(2);
					buf_144.end();
					term_252 = buf_144.term();
				}
				sink.propertyNamed("$ColumnLocation", term_252);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_240;
				{
					BufferSink buf_209 = sink.context().makeBuffer();
					buf_209.start(_M_STRING);
					buf_209.literal(2);
					buf_209.end();
					term_240 = buf_209.term();
				}
				sink.propertyNamed("$LineLocation", term_240);
				Term term_577;
				{
					BufferSink buf_6 = sink.context().makeBuffer();
					buf_6.start(_M_STRING);
					buf_6.literal(3);
					buf_6.end();
					term_577 = buf_6.term();
				}
				sink.propertyNamed("$ColumnLocation", term_577);
				sink.start(_M__sTextCons);
				Term term_302;
				{
					BufferSink buf_236 = sink.context().makeBuffer();
					buf_236.start(_M_STRING);
					buf_236.literal(2);
					buf_236.end();
					term_302 = buf_236.term();
				}
				sink.propertyNamed("$LineLocation", term_302);
				Term term_172;
				{
					BufferSink buf_143 = sink.context().makeBuffer();
					buf_143.start(_M_STRING);
					buf_143.literal(3);
					buf_143.end();
					term_172 = buf_143.term();
				}
				sink.propertyNamed("$ColumnLocation", term_172);
				sink.start(_M__sTextChars);
				sink.literal("BufferSink ");
				sink.end();
				Term term_121;
				{
					BufferSink buf_121 = sink.context().makeBuffer();
					buf_121.start(_M_STRING);
					buf_121.literal(3);
					buf_121.end();
					term_121 = buf_121.term();
				}
				sink.propertyNamed("$LineLocation", term_121);
				Term term_246;
				{
					BufferSink buf_101 = sink.context().makeBuffer();
					buf_101.start(_M_STRING);
					buf_101.literal(1);
					buf_101.end();
					term_246 = buf_101.term();
				}
				sink.propertyNamed("$ColumnLocation", term_246);
				sink.start(_M__sTextCons);
				Term term_312;
				{
					BufferSink buf_294 = sink.context().makeBuffer();
					buf_294.start(_M_STRING);
					buf_294.literal(3);
					buf_294.end();
					term_312 = buf_294.term();
				}
				sink.propertyNamed("$LineLocation", term_312);
				Term term_249;
				{
					BufferSink buf_15 = sink.context().makeBuffer();
					buf_15.start(_M_STRING);
					buf_15.literal(1);
					buf_15.end();
					term_249 = buf_15.term();
				}
				sink.propertyNamed("$ColumnLocation", term_249);
				sink.start(_M__sTextEmbed);
				Term term_219;
				{
					BufferSink buf_393 = sink.context().makeBuffer();
					buf_393.start(_M_STRING);
					buf_393.literal(3);
					buf_393.end();
					term_219 = buf_393.term();
				}
				sink.propertyNamed("$LineLocation", term_219);
				Term term_345;
				{
					BufferSink buf_189 = sink.context().makeBuffer();
					buf_189.start(_M_STRING);
					buf_189.literal(1);
					buf_189.end();
					term_345 = buf_189.term();
				}
				sink.propertyNamed("$ColumnLocation", term_345);
				sink.start(_M_AsText);
				sink.use(var_59);
				sink.end();
				sink.end();
				Term term_396;
				{
					BufferSink buf_279 = sink.context().makeBuffer();
					buf_279.start(_M_STRING);
					buf_279.literal(3);
					buf_279.end();
					term_396 = buf_279.term();
				}
				sink.propertyNamed("$LineLocation", term_396);
				Term term_209;
				{
					BufferSink buf_438 = sink.context().makeBuffer();
					buf_438.start(_M_STRING);
					buf_438.literal(12);
					buf_438.end();
					term_209 = buf_438.term();
				}
				sink.propertyNamed("$ColumnLocation", term_209);
				sink.start(_M__sTextCons);
				Term term_279;
				{
					BufferSink buf_233 = sink.context().makeBuffer();
					buf_233.start(_M_STRING);
					buf_233.literal(3);
					buf_233.end();
					term_279 = buf_233.term();
				}
				sink.propertyNamed("$LineLocation", term_279);
				Term term_342;
				{
					BufferSink buf_267 = sink.context().makeBuffer();
					buf_267.start(_M_STRING);
					buf_267.literal(12);
					buf_267.end();
					term_342 = buf_267.term();
				}
				sink.propertyNamed("$ColumnLocation", term_342);
				sink.start(_M__sTextChars);
				sink.literal(" = ");
				sink.end();
				Term term_257;
				{
					BufferSink buf_176 = sink.context().makeBuffer();
					buf_176.start(_M_STRING);
					buf_176.literal(3);
					buf_176.end();
					term_257 = buf_176.term();
				}
				sink.propertyNamed("$LineLocation", term_257);
				Term term_198;
				{
					BufferSink buf_440 = sink.context().makeBuffer();
					buf_440.start(_M_STRING);
					buf_440.literal(17);
					buf_440.end();
					term_198 = buf_440.term();
				}
				sink.propertyNamed("$ColumnLocation", term_198);
				sink.start(_M__sTextCons);
				Term term_135;
				{
					BufferSink buf_151 = sink.context().makeBuffer();
					buf_151.start(_M_STRING);
					buf_151.literal(3);
					buf_151.end();
					term_135 = buf_151.term();
				}
				sink.propertyNamed("$LineLocation", term_135);
				Term term_344;
				{
					BufferSink buf_203 = sink.context().makeBuffer();
					buf_203.start(_M_STRING);
					buf_203.literal(17);
					buf_203.end();
					term_344 = buf_203.term();
				}
				sink.propertyNamed("$ColumnLocation", term_344);
				sink.start(_M__sTextEmbed);
				Term term_263;
				{
					BufferSink buf_319 = sink.context().makeBuffer();
					buf_319.start(_M_STRING);
					buf_319.literal(3);
					buf_319.end();
					term_263 = buf_319.term();
				}
				sink.propertyNamed("$LineLocation", term_263);
				Term term_398;
				{
					BufferSink buf_215 = sink.context().makeBuffer();
					buf_215.start(_M_STRING);
					buf_215.literal(17);
					buf_215.end();
					term_398 = buf_215.term();
				}
				sink.propertyNamed("$ColumnLocation", term_398);
				sink.start(_M_AsText);
				sink.copy(sub_0.ref());
				sink.end();
				sink.end();
				Term term_100;
				{
					BufferSink buf_56 = sink.context().makeBuffer();
					buf_56.start(_M_STRING);
					buf_56.literal(3);
					buf_56.end();
					term_100 = buf_56.term();
				}
				sink.propertyNamed("$LineLocation", term_100);
				Term term_144;
				{
					BufferSink buf_451 = sink.context().makeBuffer();
					buf_451.start(_M_STRING);
					buf_451.literal(20);
					buf_451.end();
					term_144 = buf_451.term();
				}
				sink.propertyNamed("$ColumnLocation", term_144);
				sink.start(_M__sTextCons);
				Term term_149;
				{
					BufferSink buf_459 = sink.context().makeBuffer();
					buf_459.start(_M_STRING);
					buf_459.literal(3);
					buf_459.end();
					term_149 = buf_459.term();
				}
				sink.propertyNamed("$LineLocation", term_149);
				Term term_215;
				{
					BufferSink buf_315 = sink.context().makeBuffer();
					buf_315.start(_M_STRING);
					buf_315.literal(20);
					buf_315.end();
					term_215 = buf_315.term();
				}
				sink.propertyNamed("$ColumnLocation", term_215);
				sink.start(_M__sTextChars);
				sink.literal(".context().makeBuffer();");
				sink.end();
				Term term_321;
				{
					BufferSink buf_270 = sink.context().makeBuffer();
					buf_270.start(_M_STRING);
					buf_270.literal(3);
					buf_270.end();
					term_321 = buf_270.term();
				}
				sink.propertyNamed("$LineLocation", term_321);
				Term term_117;
				{
					BufferSink buf_425 = sink.context().makeBuffer();
					buf_425.start(_M_STRING);
					buf_425.literal(27);
					buf_425.end();
					term_117 = buf_425.term();
				}
				sink.propertyNamed("$ColumnLocation", term_117);
				sink.start(_M__sTextCons);
				Term term_101;
				{
					BufferSink buf_235 = sink.context().makeBuffer();
					buf_235.start(_M_STRING);
					buf_235.literal(3);
					buf_235.end();
					term_101 = buf_235.term();
				}
				sink.propertyNamed("$LineLocation", term_101);
				Term term_151;
				{
					BufferSink buf_289 = sink.context().makeBuffer();
					buf_289.start(_M_STRING);
					buf_289.literal(27);
					buf_289.end();
					term_151 = buf_289.term();
				}
				sink.propertyNamed("$ColumnLocation", term_151);
				sink.start(_M__sTextEmbed);
				Term term_382;
				{
					BufferSink buf_454 = sink.context().makeBuffer();
					buf_454.start(_M_STRING);
					buf_454.literal(3);
					buf_454.end();
					term_382 = buf_454.term();
				}
				sink.propertyNamed("$LineLocation", term_382);
				Term term_285;
				{
					BufferSink buf_213 = sink.context().makeBuffer();
					buf_213.start(_M_STRING);
					buf_213.literal(27);
					buf_213.end();
					term_285 = buf_213.term();
				}
				sink.propertyNamed("$ColumnLocation", term_285);
				sink.start(_M_AsText);
				sink.properties(safeRef(props));
				Term term_186;
				{
					BufferSink buf_182 = sink.context().makeBuffer();
					buf_182.start(_M_TEXT);
					buf_182.use(var_59);
					buf_182.end();
					term_186 = buf_182.term();
				}
				sink.propertyNamed("$sink", term_186);
				sink.start(_M_SendFreeTerm);
				sink.copy(term_182.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_142;
				{
					BufferSink buf_197 = sink.context().makeBuffer();
					buf_197.start(_M_STRING);
					buf_197.literal(3);
					buf_197.end();
					term_142 = buf_197.term();
				}
				sink.propertyNamed("$LineLocation", term_142);
				Term term_416;
				{
					BufferSink buf_332 = sink.context().makeBuffer();
					buf_332.start(_M_STRING);
					buf_332.literal(51);
					buf_332.end();
					term_416 = buf_332.term();
				}
				sink.propertyNamed("$ColumnLocation", term_416);
				sink.start(_M__sTextCons);
				Term term_239;
				{
					BufferSink buf_353 = sink.context().makeBuffer();
					buf_353.start(_M_STRING);
					buf_353.literal(3);
					buf_353.end();
					term_239 = buf_353.term();
				}
				sink.propertyNamed("$LineLocation", term_239);
				Term term_32;
				{
					BufferSink buf_237 = sink.context().makeBuffer();
					buf_237.start(_M_STRING);
					buf_237.literal(51);
					buf_237.end();
					term_32 = buf_237.term();
				}
				sink.propertyNamed("$ColumnLocation", term_32);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_452;
				{
					BufferSink buf_383 = sink.context().makeBuffer();
					buf_383.start(_M_STRING);
					buf_383.literal(3);
					buf_383.end();
					term_452 = buf_383.term();
				}
				sink.propertyNamed("$LineLocation", term_452);
				Term term_318;
				{
					BufferSink buf_166 = sink.context().makeBuffer();
					buf_166.start(_M_STRING);
					buf_166.literal(101);
					buf_166.end();
					term_318 = buf_166.term();
				}
				sink.propertyNamed("$ColumnLocation", term_318);
				sink.start(_M__sTextCons);
				Term term_601;
				{
					BufferSink buf_184 = sink.context().makeBuffer();
					buf_184.start(_M_STRING);
					buf_184.literal(3);
					buf_184.end();
					term_601 = buf_184.term();
				}
				sink.propertyNamed("$LineLocation", term_601);
				Term term_254;
				{
					BufferSink buf_351 = sink.context().makeBuffer();
					buf_351.start(_M_STRING);
					buf_351.literal(101);
					buf_351.end();
					term_254 = buf_351.term();
				}
				sink.propertyNamed("$ColumnLocation", term_254);
				sink.start(_M__sTextEmbed);
				Term term_379;
				{
					BufferSink buf_395 = sink.context().makeBuffer();
					buf_395.start(_M_STRING);
					buf_395.literal(3);
					buf_395.end();
					term_379 = buf_395.term();
				}
				sink.propertyNamed("$LineLocation", term_379);
				Term term_114;
				{
					BufferSink buf_252 = sink.context().makeBuffer();
					buf_252.start(_M_STRING);
					buf_252.literal(101);
					buf_252.end();
					term_114 = buf_252.term();
				}
				sink.propertyNamed("$ColumnLocation", term_114);
				sink.start(_M_AsText);
				sink.use(var_96);
				sink.end();
				sink.end();
				Term term_284;
				{
					BufferSink buf_232 = sink.context().makeBuffer();
					buf_232.start(_M_STRING);
					buf_232.literal(4);
					buf_232.end();
					term_284 = buf_232.term();
				}
				sink.propertyNamed("$LineLocation", term_284);
				Term term_563;
				{
					BufferSink buf_33 = sink.context().makeBuffer();
					buf_33.start(_M_STRING);
					buf_33.literal(1);
					buf_33.end();
					term_563 = buf_33.term();
				}
				sink.propertyNamed("$ColumnLocation", term_563);
				sink.start(_M__sTextCons);
				Term term_538;
				{
					BufferSink buf_194 = sink.context().makeBuffer();
					buf_194.start(_M_STRING);
					buf_194.literal(4);
					buf_194.end();
					term_538 = buf_194.term();
				}
				sink.propertyNamed("$LineLocation", term_538);
				Term term_265;
				{
					BufferSink buf_359 = sink.context().makeBuffer();
					buf_359.start(_M_STRING);
					buf_359.literal(1);
					buf_359.end();
					term_265 = buf_359.term();
				}
				sink.propertyNamed("$ColumnLocation", term_265);
				sink.start(_M__sTextChars);
				sink.literal(" = ");
				sink.end();
				Term term_522;
				{
					BufferSink buf_137 = sink.context().makeBuffer();
					buf_137.start(_M_STRING);
					buf_137.literal(4);
					buf_137.end();
					term_522 = buf_137.term();
				}
				sink.propertyNamed("$LineLocation", term_522);
				Term term_479;
				{
					BufferSink buf_174 = sink.context().makeBuffer();
					buf_174.start(_M_STRING);
					buf_174.literal(7);
					buf_174.end();
					term_479 = buf_174.term();
				}
				sink.propertyNamed("$ColumnLocation", term_479);
				sink.start(_M__sTextCons);
				Term term_174;
				{
					BufferSink buf_145 = sink.context().makeBuffer();
					buf_145.start(_M_STRING);
					buf_145.literal(4);
					buf_145.end();
					term_174 = buf_145.term();
				}
				sink.propertyNamed("$LineLocation", term_174);
				Term term_109;
				{
					BufferSink buf_288 = sink.context().makeBuffer();
					buf_288.start(_M_STRING);
					buf_288.literal(7);
					buf_288.end();
					term_109 = buf_288.term();
				}
				sink.propertyNamed("$ColumnLocation", term_109);
				sink.start(_M__sTextEmbed);
				Term term_492;
				{
					BufferSink buf_369 = sink.context().makeBuffer();
					buf_369.start(_M_STRING);
					buf_369.literal(4);
					buf_369.end();
					term_492 = buf_369.term();
				}
				sink.propertyNamed("$LineLocation", term_492);
				Term term_237;
				{
					BufferSink buf_278 = sink.context().makeBuffer();
					buf_278.start(_M_STRING);
					buf_278.literal(7);
					buf_278.end();
					term_237 = buf_278.term();
				}
				sink.propertyNamed("$ColumnLocation", term_237);
				sink.start(_M_AsText);
				sink.use(var_59);
				sink.end();
				sink.end();
				Term term_397;
				{
					BufferSink buf_284 = sink.context().makeBuffer();
					buf_284.start(_M_STRING);
					buf_284.literal(4);
					buf_284.end();
					term_397 = buf_284.term();
				}
				sink.propertyNamed("$LineLocation", term_397);
				Term term_361;
				{
					BufferSink buf_264 = sink.context().makeBuffer();
					buf_264.start(_M_STRING);
					buf_264.literal(10);
					buf_264.end();
					term_361 = buf_264.term();
				}
				sink.propertyNamed("$ColumnLocation", term_361);
				sink.start(_M__sTextCons);
				Term term_160;
				{
					BufferSink buf_468 = sink.context().makeBuffer();
					buf_468.start(_M_STRING);
					buf_468.literal(4);
					buf_468.end();
					term_160 = buf_468.term();
				}
				sink.propertyNamed("$LineLocation", term_160);
				Term term_163;
				{
					BufferSink buf_283 = sink.context().makeBuffer();
					buf_283.start(_M_STRING);
					buf_283.literal(10);
					buf_283.end();
					term_163 = buf_283.term();
				}
				sink.propertyNamed("$ColumnLocation", term_163);
				sink.start(_M__sTextChars);
				sink.literal(".term();");
				sink.end();
				Term term_335;
				{
					BufferSink buf_414 = sink.context().makeBuffer();
					buf_414.start(_M_STRING);
					buf_414.literal(4);
					buf_414.end();
					term_335 = buf_414.term();
				}
				sink.propertyNamed("$LineLocation", term_335);
				Term term_283;
				{
					BufferSink buf_229 = sink.context().makeBuffer();
					buf_229.start(_M_STRING);
					buf_229.literal(15);
					buf_229.end();
					term_283 = buf_229.term();
				}
				sink.propertyNamed("$ColumnLocation", term_283);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				Term term_375;
				{
					BufferSink buf_543 = sink.context().makeBuffer();
					buf_543.start(_M_STRING);
					buf_543.literal(4);
					buf_543.end();
					term_375 = buf_543.term();
				}
				sink.propertyNamed("$LineLocation", term_375);
				Term term_412;
				{
					BufferSink buf_227 = sink.context().makeBuffer();
					buf_227.start(_M_STRING);
					buf_227.literal(23);
					buf_227.end();
					term_412 = buf_227.term();
				}
				sink.propertyNamed("$ColumnLocation", term_412);
				sink.start(_M__sTextCons);
				Term term_241;
				{
					BufferSink buf_241 = sink.context().makeBuffer();
					buf_241.start(_M_STRING);
					buf_241.literal(4);
					buf_241.end();
					term_241 = buf_241.term();
				}
				sink.propertyNamed("$LineLocation", term_241);
				Term term_113;
				{
					BufferSink buf_217 = sink.context().makeBuffer();
					buf_217.start(_M_STRING);
					buf_217.literal(23);
					buf_217.end();
					term_113 = buf_217.term();
				}
				sink.propertyNamed("$ColumnLocation", term_113);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_294;
				{
					BufferSink buf_364 = sink.context().makeBuffer();
					buf_364.start(_M_STRING);
					buf_364.literal(4);
					buf_364.end();
					term_294 = buf_364.term();
				}
				sink.propertyNamed("$LineLocation", term_294);
				Term term_414;
				{
					BufferSink buf_629 = sink.context().makeBuffer();
					buf_629.start(_M_STRING);
					buf_629.literal(24);
					buf_629.end();
					term_414 = buf_629.term();
				}
				sink.propertyNamed("$ColumnLocation", term_414);
				sink.start(_M__sTextCons);
				Term term_475;
				{
					BufferSink buf_116 = sink.context().makeBuffer();
					buf_116.start(_M_STRING);
					buf_116.literal(4);
					buf_116.end();
					term_475 = buf_116.term();
				}
				sink.propertyNamed("$LineLocation", term_475);
				Term term_216;
				{
					BufferSink buf_547 = sink.context().makeBuffer();
					buf_547.start(_M_STRING);
					buf_547.literal(24);
					buf_547.end();
					term_216 = buf_547.term();
				}
				sink.propertyNamed("$ColumnLocation", term_216);
				sink.start(_M__sTextChars);
				sink.literal("}");
				sink.end();
				Term term_255;
				{
					BufferSink buf_154 = sink.context().makeBuffer();
					buf_154.start(_M_STRING);
					buf_154.literal(5);
					buf_154.end();
					term_255 = buf_154.term();
				}
				sink.propertyNamed("$LineLocation", term_255);
				Term term_64;
				{
					BufferSink buf_258 = sink.context().makeBuffer();
					buf_258.start(_M_STRING);
					buf_258.literal(1);
					buf_258.end();
					term_64 = buf_258.term();
				}
				sink.propertyNamed("$ColumnLocation", term_64);
				sink.start(_M__sTextCons);
				Term term_364;
				{
					BufferSink buf_493 = sink.context().makeBuffer();
					buf_493.start(_M_STRING);
					buf_493.literal(5);
					buf_493.end();
					term_364 = buf_493.term();
				}
				sink.propertyNamed("$LineLocation", term_364);
				Term term_333;
				{
					BufferSink buf_663 = sink.context().makeBuffer();
					buf_663.start(_M_STRING);
					buf_663.literal(1);
					buf_663.end();
					term_333 = buf_663.term();
				}
				sink.propertyNamed("$ColumnLocation", term_333);
				sink.start(_M__sTextEmbed);
				Term term_353;
				{
					BufferSink buf_290 = sink.context().makeBuffer();
					buf_290.start(_M_STRING);
					buf_290.literal(5);
					buf_290.end();
					term_353 = buf_290.term();
				}
				sink.propertyNamed("$LineLocation", term_353);
				Term term_362;
				{
					BufferSink buf_632 = sink.context().makeBuffer();
					buf_632.start(_M_STRING);
					buf_632.literal(1);
					buf_632.end();
					term_362 = buf_632.term();
				}
				sink.propertyNamed("$ColumnLocation", term_362);
				sink.start(_M_AsText);
				sink.properties(safeRef(props));
				Term term_297;
				{
					BufferSink buf_434 = sink.context().makeBuffer();
					buf_434.start(_M_TEXT);
					buf_434.copy(sub_0.ref());
					buf_434.end();
					term_297 = buf_434.term();
				}
				sink.propertyNamed("$sink", term_297);
				Term term_435;
				{
					BufferSink buf_519 = sink.context().makeBuffer();
					buf_519.start(_M_OK);
					buf_519.end();
					term_435 = buf_519.term();
				}
				VariableUse use = sink.context().makeVariableUse(var_96);
				sink.substitute(term_204.ref(), new Variable[]
					{var_32, var_98}, new Term[]
					{term_435, use});
				sink.end();
				sink.end();
				Term term_461;
				{
					BufferSink buf_250 = sink.context().makeBuffer();
					buf_250.start(_M_STRING);
					buf_250.literal(5);
					buf_250.end();
					term_461 = buf_250.term();
				}
				sink.propertyNamed("$LineLocation", term_461);
				Term term_568;
				{
					BufferSink buf_550 = sink.context().makeBuffer();
					buf_550.start(_M_STRING);
					buf_550.literal(2);
					buf_550.end();
					term_568 = buf_550.term();
				}
				sink.propertyNamed("$ColumnLocation", term_568);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SetBuffer, props, term_182, var_32, var_98, term_204);
	}

	final public static boolean _M_SetVariable0(Sink sink, int shared, int depth, Properties props_92, Term term_256, Term term_355, Variable var_23, Variable var_73, Term term_213)
	{
		if (depth < 2000)
		{
			label_61 :
			{
				Term value_56 = props_92 == null ? null : props_92.lookup("$sink");
				if (value_56 == null)
				{
					break label_61;
				}
				if (value_56.descriptor() != _M_TEXT)
				{
					break label_61;
				}
				Term sub_88 = value_56.sub(0).ref();
				/* #sink=sub */
				if (term_256.descriptor() != _M_TEXT)
				{
					break label_61;
				}
				Term sub_106 = term_256.sub(0).ref();
				/* #var=sub */
				/* #key=term */
				/* #=term *//*Contract*/
				Variable var_5 = sink.context().makeVariable("use");
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_459;
				{
					BufferSink buf_222 = sink.context().makeBuffer();
					buf_222.start(_M_STRING);
					buf_222.literal(1);
					buf_222.end();
					term_459 = buf_222.term();
				}
				sink.propertyNamed("$LineLocation", term_459);
				Term term_378;
				{
					BufferSink buf_287 = sink.context().makeBuffer();
					buf_287.start(_M_STRING);
					buf_287.literal(1);
					buf_287.end();
					term_378 = buf_287.term();
				}
				sink.propertyNamed("$ColumnLocation", term_378);
				sink.start(_M__sTextCons);
				Term term_323;
				{
					BufferSink buf_268 = sink.context().makeBuffer();
					buf_268.start(_M_STRING);
					buf_268.literal(1);
					buf_268.end();
					term_323 = buf_268.term();
				}
				sink.propertyNamed("$LineLocation", term_323);
				Term term_192;
				{
					BufferSink buf_245 = sink.context().makeBuffer();
					buf_245.start(_M_STRING);
					buf_245.literal(1);
					buf_245.end();
					term_192 = buf_245.term();
				}
				sink.propertyNamed("$ColumnLocation", term_192);
				sink.start(_M__sTextChars);
				sink.literal("VariableUse ");
				sink.end();
				Term term_578;
				{
					BufferSink buf_384 = sink.context().makeBuffer();
					buf_384.start(_M_STRING);
					buf_384.literal(1);
					buf_384.end();
					term_578 = buf_384.term();
				}
				sink.propertyNamed("$LineLocation", term_578);
				Term term_393;
				{
					BufferSink buf_539 = sink.context().makeBuffer();
					buf_539.start(_M_STRING);
					buf_539.literal(2);
					buf_539.end();
					term_393 = buf_539.term();
				}
				sink.propertyNamed("$ColumnLocation", term_393);
				sink.start(_M__sTextCons);
				Term term_504;
				{
					BufferSink buf_431 = sink.context().makeBuffer();
					buf_431.start(_M_STRING);
					buf_431.literal(1);
					buf_431.end();
					term_504 = buf_431.term();
				}
				sink.propertyNamed("$LineLocation", term_504);
				Term term_687;
				{
					BufferSink buf_111 = sink.context().makeBuffer();
					buf_111.start(_M_STRING);
					buf_111.literal(2);
					buf_111.end();
					term_687 = buf_111.term();
				}
				sink.propertyNamed("$ColumnLocation", term_687);
				sink.start(_M__sTextEmbed);
				Term term_386;
				{
					BufferSink buf_276 = sink.context().makeBuffer();
					buf_276.start(_M_STRING);
					buf_276.literal(1);
					buf_276.end();
					term_386 = buf_276.term();
				}
				sink.propertyNamed("$LineLocation", term_386);
				Term term_336;
				{
					BufferSink buf_483 = sink.context().makeBuffer();
					buf_483.start(_M_STRING);
					buf_483.literal(2);
					buf_483.end();
					term_336 = buf_483.term();
				}
				sink.propertyNamed("$ColumnLocation", term_336);
				sink.start(_M_AsText);
				sink.use(var_5);
				sink.end();
				sink.end();
				Term term_14;
				{
					BufferSink buf_373 = sink.context().makeBuffer();
					buf_373.start(_M_STRING);
					buf_373.literal(1);
					buf_373.end();
					term_14 = buf_373.term();
				}
				sink.propertyNamed("$LineLocation", term_14);
				Term term_365;
				{
					BufferSink buf_350 = sink.context().makeBuffer();
					buf_350.start(_M_STRING);
					buf_350.literal(14);
					buf_350.end();
					term_365 = buf_350.term();
				}
				sink.propertyNamed("$ColumnLocation", term_365);
				sink.start(_M__sTextCons);
				Term term_394;
				{
					BufferSink buf_797 = sink.context().makeBuffer();
					buf_797.start(_M_STRING);
					buf_797.literal(1);
					buf_797.end();
					term_394 = buf_797.term();
				}
				sink.propertyNamed("$LineLocation", term_394);
				Term term_105;
				{
					BufferSink buf_624 = sink.context().makeBuffer();
					buf_624.start(_M_STRING);
					buf_624.literal(14);
					buf_624.end();
					term_105 = buf_624.term();
				}
				sink.propertyNamed("$ColumnLocation", term_105);
				sink.start(_M__sTextChars);
				sink.literal(" = ");
				sink.end();
				Term term_420;
				{
					BufferSink buf_266 = sink.context().makeBuffer();
					buf_266.start(_M_STRING);
					buf_266.literal(1);
					buf_266.end();
					term_420 = buf_266.term();
				}
				sink.propertyNamed("$LineLocation", term_420);
				Term term_356;
				{
					BufferSink buf_486 = sink.context().makeBuffer();
					buf_486.start(_M_STRING);
					buf_486.literal(19);
					buf_486.end();
					term_356 = buf_486.term();
				}
				sink.propertyNamed("$ColumnLocation", term_356);
				sink.start(_M__sTextCons);
				Term term_143;
				{
					BufferSink buf_301 = sink.context().makeBuffer();
					buf_301.start(_M_STRING);
					buf_301.literal(1);
					buf_301.end();
					term_143 = buf_301.term();
				}
				sink.propertyNamed("$LineLocation", term_143);
				Term term_406;
				{
					BufferSink buf_302 = sink.context().makeBuffer();
					buf_302.start(_M_STRING);
					buf_302.literal(19);
					buf_302.end();
					term_406 = buf_302.term();
				}
				sink.propertyNamed("$ColumnLocation", term_406);
				sink.start(_M__sTextEmbed);
				Term term_753;
				{
					BufferSink buf_108 = sink.context().makeBuffer();
					buf_108.start(_M_STRING);
					buf_108.literal(1);
					buf_108.end();
					term_753 = buf_108.term();
				}
				sink.propertyNamed("$LineLocation", term_753);
				Term term_168;
				{
					BufferSink buf_456 = sink.context().makeBuffer();
					buf_456.start(_M_STRING);
					buf_456.literal(19);
					buf_456.end();
					term_168 = buf_456.term();
				}
				sink.propertyNamed("$ColumnLocation", term_168);
				sink.start(_M_AsText);
				sink.copy(sub_88.ref());
				sink.end();
				sink.end();
				Term term_456;
				{
					BufferSink buf_263 = sink.context().makeBuffer();
					buf_263.start(_M_STRING);
					buf_263.literal(1);
					buf_263.end();
					term_456 = buf_263.term();
				}
				sink.propertyNamed("$LineLocation", term_456);
				Term term_413;
				{
					BufferSink buf_324 = sink.context().makeBuffer();
					buf_324.start(_M_STRING);
					buf_324.literal(22);
					buf_324.end();
					term_413 = buf_324.term();
				}
				sink.propertyNamed("$ColumnLocation", term_413);
				sink.start(_M__sTextCons);
				Term term_407;
				{
					BufferSink buf_367 = sink.context().makeBuffer();
					buf_367.start(_M_STRING);
					buf_367.literal(1);
					buf_367.end();
					term_407 = buf_367.term();
				}
				sink.propertyNamed("$LineLocation", term_407);
				Term term_287;
				{
					BufferSink buf_339 = sink.context().makeBuffer();
					buf_339.start(_M_STRING);
					buf_339.literal(22);
					buf_339.end();
					term_287 = buf_339.term();
				}
				sink.propertyNamed("$ColumnLocation", term_287);
				sink.start(_M__sTextChars);
				sink.literal(".context().makeVariableUse(");
				sink.end();
				Term term_681;
				{
					BufferSink buf_348 = sink.context().makeBuffer();
					buf_348.start(_M_STRING);
					buf_348.literal(1);
					buf_348.end();
					term_681 = buf_348.term();
				}
				sink.propertyNamed("$LineLocation", term_681);
				Term term_352;
				{
					BufferSink buf_417 = sink.context().makeBuffer();
					buf_417.start(_M_STRING);
					buf_417.literal(29);
					buf_417.end();
					term_352 = buf_417.term();
				}
				sink.propertyNamed("$ColumnLocation", term_352);
				sink.start(_M__sTextCons);
				Term term_217;
				{
					BufferSink buf_195 = sink.context().makeBuffer();
					buf_195.start(_M_STRING);
					buf_195.literal(1);
					buf_195.end();
					term_217 = buf_195.term();
				}
				sink.propertyNamed("$LineLocation", term_217);
				Term term_383;
				{
					BufferSink buf_148 = sink.context().makeBuffer();
					buf_148.start(_M_STRING);
					buf_148.literal(29);
					buf_148.end();
					term_383 = buf_148.term();
				}
				sink.propertyNamed("$ColumnLocation", term_383);
				sink.start(_M__sTextEmbed);
				Term term_654;
				{
					BufferSink buf_488 = sink.context().makeBuffer();
					buf_488.start(_M_STRING);
					buf_488.literal(1);
					buf_488.end();
					term_654 = buf_488.term();
				}
				sink.propertyNamed("$LineLocation", term_654);
				Term term_351;
				{
					BufferSink buf_110 = sink.context().makeBuffer();
					buf_110.start(_M_STRING);
					buf_110.literal(29);
					buf_110.end();
					term_351 = buf_110.term();
				}
				sink.propertyNamed("$ColumnLocation", term_351);
				sink.start(_M_AsText);
				sink.copy(sub_106.ref());
				sink.end();
				sink.end();
				Term term_488;
				{
					BufferSink buf_314 = sink.context().makeBuffer();
					buf_314.start(_M_STRING);
					buf_314.literal(1);
					buf_314.end();
					term_488 = buf_314.term();
				}
				sink.propertyNamed("$LineLocation", term_488);
				Term term_339;
				{
					BufferSink buf_331 = sink.context().makeBuffer();
					buf_331.start(_M_STRING);
					buf_331.literal(56);
					buf_331.end();
					term_339 = buf_331.term();
				}
				sink.propertyNamed("$ColumnLocation", term_339);
				sink.start(_M__sTextCons);
				Term term_328;
				{
					BufferSink buf_398 = sink.context().makeBuffer();
					buf_398.start(_M_STRING);
					buf_398.literal(1);
					buf_398.end();
					term_328 = buf_398.term();
				}
				sink.propertyNamed("$LineLocation", term_328);
				Term term_395;
				{
					BufferSink buf_340 = sink.context().makeBuffer();
					buf_340.start(_M_STRING);
					buf_340.literal(56);
					buf_340.end();
					term_395 = buf_340.term();
				}
				sink.propertyNamed("$ColumnLocation", term_395);
				sink.start(_M__sTextChars);
				sink.literal(");");
				sink.end();
				Term term_531;
				{
					BufferSink buf_193 = sink.context().makeBuffer();
					buf_193.start(_M_STRING);
					buf_193.literal(1);
					buf_193.end();
					term_531 = buf_193.term();
				}
				sink.propertyNamed("$LineLocation", term_531);
				Term term_451;
				{
					BufferSink buf_390 = sink.context().makeBuffer();
					buf_390.start(_M_STRING);
					buf_390.literal(62);
					buf_390.end();
					term_451 = buf_390.term();
				}
				sink.propertyNamed("$ColumnLocation", term_451);
				sink.start(_M__sTextCons);
				Term term_286;
				{
					BufferSink buf_291 = sink.context().makeBuffer();
					buf_291.start(_M_STRING);
					buf_291.literal(1);
					buf_291.end();
					term_286 = buf_291.term();
				}
				sink.propertyNamed("$LineLocation", term_286);
				Term term_110;
				{
					BufferSink buf_328 = sink.context().makeBuffer();
					buf_328.start(_M_STRING);
					buf_328.literal(62);
					buf_328.end();
					term_110 = buf_328.term();
				}
				sink.propertyNamed("$ColumnLocation", term_110);
				sink.start(_M__sTextEmbed);
				Term term_604;
				{
					BufferSink buf_134 = sink.context().makeBuffer();
					buf_134.start(_M_STRING);
					buf_134.literal(1);
					buf_134.end();
					term_604 = buf_134.term();
				}
				sink.propertyNamed("$LineLocation", term_604);
				Term term_496;
				{
					BufferSink buf_522 = sink.context().makeBuffer();
					buf_522.start(_M_STRING);
					buf_522.literal(62);
					buf_522.end();
					term_496 = buf_522.term();
				}
				sink.propertyNamed("$ColumnLocation", term_496);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_92));
				Term term_299;
				{
					BufferSink buf_363 = sink.context().makeBuffer();
					buf_363.start(_M_OK);
					buf_363.end();
					term_299 = buf_363.term();
				}
				VariableUse use_0 = sink.context().makeVariableUse(var_5);
				sink.substitute(term_213.ref(), new Variable[]
					{var_23, var_73}, new Term[]
					{term_299, use_0});
				sink.end();
				sink.end();
				Term term_671;
				{
					BufferSink buf_243 = sink.context().makeBuffer();
					buf_243.start(_M_STRING);
					buf_243.literal(1);
					buf_243.end();
					term_671 = buf_243.term();
				}
				sink.propertyNamed("$LineLocation", term_671);
				Term term_511;
				{
					BufferSink buf_385 = sink.context().makeBuffer();
					buf_385.start(_M_STRING);
					buf_385.literal(64);
					buf_385.end();
					term_511 = buf_385.term();
				}
				sink.propertyNamed("$ColumnLocation", term_511);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_35 :
			{
				Term value_65 = props_92 == null ? null : props_92.lookup("$sink");
				if (value_65 == null)
				{
					break label_35;
				}
				if (value_65.descriptor() != _M_TEXT)
				{
					break label_35;
				}
				Term sub_48 = value_65.sub(0).ref();
				/* #sink=sub */
				if (term_256.descriptor() != _M_NOENTRY)
				{
					break label_35;
				}
				/* #key=term */
				/* #=term *//*Contract*/
				Variable var_94 = sink.context().makeVariable("var");
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_377;
				{
					BufferSink buf_574 = sink.context().makeBuffer();
					buf_574.start(_M_STRING);
					buf_574.literal(1);
					buf_574.end();
					term_377 = buf_574.term();
				}
				sink.propertyNamed("$LineLocation", term_377);
				Term term_460;
				{
					BufferSink buf_255 = sink.context().makeBuffer();
					buf_255.start(_M_STRING);
					buf_255.literal(1);
					buf_255.end();
					term_460 = buf_255.term();
				}
				sink.propertyNamed("$ColumnLocation", term_460);
				sink.start(_M__sTextCons);
				Term term_755;
				{
					BufferSink buf_645 = sink.context().makeBuffer();
					buf_645.start(_M_STRING);
					buf_645.literal(1);
					buf_645.end();
					term_755 = buf_645.term();
				}
				sink.propertyNamed("$LineLocation", term_755);
				Term term_189;
				{
					BufferSink buf_163 = sink.context().makeBuffer();
					buf_163.start(_M_STRING);
					buf_163.literal(1);
					buf_163.end();
					term_189 = buf_163.term();
				}
				sink.propertyNamed("$ColumnLocation", term_189);
				sink.start(_M__sTextChars);
				sink.literal("Variable ");
				sink.end();
				Term term_363;
				{
					BufferSink buf_297 = sink.context().makeBuffer();
					buf_297.start(_M_STRING);
					buf_297.literal(1);
					buf_297.end();
					term_363 = buf_297.term();
				}
				sink.propertyNamed("$LineLocation", term_363);
				Term term_201;
				{
					BufferSink buf_527 = sink.context().makeBuffer();
					buf_527.start(_M_STRING);
					buf_527.literal(2);
					buf_527.end();
					term_201 = buf_527.term();
				}
				sink.propertyNamed("$ColumnLocation", term_201);
				sink.start(_M__sTextCons);
				Term term_476;
				{
					BufferSink buf_555 = sink.context().makeBuffer();
					buf_555.start(_M_STRING);
					buf_555.literal(1);
					buf_555.end();
					term_476 = buf_555.term();
				}
				sink.propertyNamed("$LineLocation", term_476);
				Term term_448;
				{
					BufferSink buf_357 = sink.context().makeBuffer();
					buf_357.start(_M_STRING);
					buf_357.literal(2);
					buf_357.end();
					term_448 = buf_357.term();
				}
				sink.propertyNamed("$ColumnLocation", term_448);
				sink.start(_M__sTextEmbed);
				Term term_409;
				{
					BufferSink buf_228 = sink.context().makeBuffer();
					buf_228.start(_M_STRING);
					buf_228.literal(1);
					buf_228.end();
					term_409 = buf_228.term();
				}
				sink.propertyNamed("$LineLocation", term_409);
				Term term_236;
				{
					BufferSink buf_684 = sink.context().makeBuffer();
					buf_684.start(_M_STRING);
					buf_684.literal(2);
					buf_684.end();
					term_236 = buf_684.term();
				}
				sink.propertyNamed("$ColumnLocation", term_236);
				sink.start(_M_AsText);
				sink.use(var_94);
				sink.end();
				sink.end();
				Term term_234;
				{
					BufferSink buf_759 = sink.context().makeBuffer();
					buf_759.start(_M_STRING);
					buf_759.literal(1);
					buf_759.end();
					term_234 = buf_759.term();
				}
				sink.propertyNamed("$LineLocation", term_234);
				Term term_494;
				{
					BufferSink buf_380 = sink.context().makeBuffer();
					buf_380.start(_M_STRING);
					buf_380.literal(11);
					buf_380.end();
					term_494 = buf_380.term();
				}
				sink.propertyNamed("$ColumnLocation", term_494);
				sink.start(_M__sTextCons);
				Term term_636;
				{
					BufferSink buf_460 = sink.context().makeBuffer();
					buf_460.start(_M_STRING);
					buf_460.literal(1);
					buf_460.end();
					term_636 = buf_460.term();
				}
				sink.propertyNamed("$LineLocation", term_636);
				Term term_533;
				{
					BufferSink buf_205 = sink.context().makeBuffer();
					buf_205.start(_M_STRING);
					buf_205.literal(11);
					buf_205.end();
					term_533 = buf_205.term();
				}
				sink.propertyNamed("$ColumnLocation", term_533);
				sink.start(_M__sTextChars);
				sink.literal(" = ");
				sink.end();
				Term term_431;
				{
					BufferSink buf_346 = sink.context().makeBuffer();
					buf_346.start(_M_STRING);
					buf_346.literal(1);
					buf_346.end();
					term_431 = buf_346.term();
				}
				sink.propertyNamed("$LineLocation", term_431);
				Term term_310;
				{
					BufferSink buf_249 = sink.context().makeBuffer();
					buf_249.start(_M_STRING);
					buf_249.literal(16);
					buf_249.end();
					term_310 = buf_249.term();
				}
				sink.propertyNamed("$ColumnLocation", term_310);
				sink.start(_M__sTextCons);
				Term term_347;
				{
					BufferSink buf_467 = sink.context().makeBuffer();
					buf_467.start(_M_STRING);
					buf_467.literal(1);
					buf_467.end();
					term_347 = buf_467.term();
				}
				sink.propertyNamed("$LineLocation", term_347);
				Term term_309;
				{
					BufferSink buf_376 = sink.context().makeBuffer();
					buf_376.start(_M_STRING);
					buf_376.literal(16);
					buf_376.end();
					term_309 = buf_376.term();
				}
				sink.propertyNamed("$ColumnLocation", term_309);
				sink.start(_M__sTextEmbed);
				Term term_214;
				{
					BufferSink buf_299 = sink.context().makeBuffer();
					buf_299.start(_M_STRING);
					buf_299.literal(1);
					buf_299.end();
					term_214 = buf_299.term();
				}
				sink.propertyNamed("$LineLocation", term_214);
				Term term_288;
				{
					BufferSink buf_437 = sink.context().makeBuffer();
					buf_437.start(_M_STRING);
					buf_437.literal(16);
					buf_437.end();
					term_288 = buf_437.term();
				}
				sink.propertyNamed("$ColumnLocation", term_288);
				sink.start(_M_AsText);
				sink.copy(sub_48.ref());
				sink.end();
				sink.end();
				Term term_642;
				{
					BufferSink buf_230 = sink.context().makeBuffer();
					buf_230.start(_M_STRING);
					buf_230.literal(1);
					buf_230.end();
					term_642 = buf_230.term();
				}
				sink.propertyNamed("$LineLocation", term_642);
				Term term_689;
				{
					BufferSink buf_304 = sink.context().makeBuffer();
					buf_304.start(_M_STRING);
					buf_304.literal(19);
					buf_304.end();
					term_689 = buf_304.term();
				}
				sink.propertyNamed("$ColumnLocation", term_689);
				sink.start(_M__sTextCons);
				Term term_454;
				{
					BufferSink buf_497 = sink.context().makeBuffer();
					buf_497.start(_M_STRING);
					buf_497.literal(1);
					buf_497.end();
					term_454 = buf_497.term();
				}
				sink.propertyNamed("$LineLocation", term_454);
				Term term_316;
				{
					BufferSink buf_365 = sink.context().makeBuffer();
					buf_365.start(_M_STRING);
					buf_365.literal(19);
					buf_365.end();
					term_316 = buf_365.term();
				}
				sink.propertyNamed("$ColumnLocation", term_316);
				sink.start(_M__sTextChars);
				sink.literal(".context().makeVariable(\"");
				sink.end();
				Term term_444;
				{
					BufferSink buf_442 = sink.context().makeBuffer();
					buf_442.start(_M_STRING);
					buf_442.literal(1);
					buf_442.end();
					term_444 = buf_442.term();
				}
				sink.propertyNamed("$LineLocation", term_444);
				Term term_464;
				{
					BufferSink buf_455 = sink.context().makeBuffer();
					buf_455.start(_M_STRING);
					buf_455.literal(26);
					buf_455.end();
					term_464 = buf_455.term();
				}
				sink.propertyNamed("$ColumnLocation", term_464);
				sink.start(_M__sTextCons);
				Term term_210;
				{
					BufferSink buf_457 = sink.context().makeBuffer();
					buf_457.start(_M_STRING);
					buf_457.literal(1);
					buf_457.end();
					term_210 = buf_457.term();
				}
				sink.propertyNamed("$LineLocation", term_210);
				Term term_300;
				{
					BufferSink buf_251 = sink.context().makeBuffer();
					buf_251.start(_M_STRING);
					buf_251.literal(51);
					buf_251.end();
					term_300 = buf_251.term();
				}
				sink.propertyNamed("$ColumnLocation", term_300);
				sink.start(_M__sTextChars);
				sink.copy(term_355.ref());
				sink.end();
				Term term_250;
				{
					BufferSink buf_214 = sink.context().makeBuffer();
					buf_214.start(_M_STRING);
					buf_214.literal(1);
					buf_214.end();
					term_250 = buf_214.term();
				}
				sink.propertyNamed("$LineLocation", term_250);
				Term term_404;
				{
					BufferSink buf_201 = sink.context().makeBuffer();
					buf_201.start(_M_STRING);
					buf_201.literal(52);
					buf_201.end();
					term_404 = buf_201.term();
				}
				sink.propertyNamed("$ColumnLocation", term_404);
				sink.start(_M__sTextCons);
				Term term_134;
				{
					BufferSink buf_498 = sink.context().makeBuffer();
					buf_498.start(_M_STRING);
					buf_498.literal(1);
					buf_498.end();
					term_134 = buf_498.term();
				}
				sink.propertyNamed("$LineLocation", term_134);
				Term term_270;
				{
					BufferSink buf_726 = sink.context().makeBuffer();
					buf_726.start(_M_STRING);
					buf_726.literal(52);
					buf_726.end();
					term_270 = buf_726.term();
				}
				sink.propertyNamed("$ColumnLocation", term_270);
				sink.start(_M__sTextChars);
				sink.literal("\");");
				sink.end();
				Term term_346;
				{
					BufferSink buf_793 = sink.context().makeBuffer();
					buf_793.start(_M_STRING);
					buf_793.literal(1);
					buf_793.end();
					term_346 = buf_793.term();
				}
				sink.propertyNamed("$LineLocation", term_346);
				Term term_269;
				{
					BufferSink buf_177 = sink.context().makeBuffer();
					buf_177.start(_M_STRING);
					buf_177.literal(58);
					buf_177.end();
					term_269 = buf_177.term();
				}
				sink.propertyNamed("$ColumnLocation", term_269);
				sink.start(_M__sTextCons);
				Term term_273;
				{
					BufferSink buf_157 = sink.context().makeBuffer();
					buf_157.start(_M_STRING);
					buf_157.literal(1);
					buf_157.end();
					term_273 = buf_157.term();
				}
				sink.propertyNamed("$LineLocation", term_273);
				Term term_684;
				{
					BufferSink buf_375 = sink.context().makeBuffer();
					buf_375.start(_M_STRING);
					buf_375.literal(58);
					buf_375.end();
					term_684 = buf_375.term();
				}
				sink.propertyNamed("$ColumnLocation", term_684);
				sink.start(_M__sTextEmbed);
				Term term_391;
				{
					BufferSink buf_646 = sink.context().makeBuffer();
					buf_646.start(_M_STRING);
					buf_646.literal(1);
					buf_646.end();
					term_391 = buf_646.term();
				}
				sink.propertyNamed("$LineLocation", term_391);
				Term term_481;
				{
					BufferSink buf_545 = sink.context().makeBuffer();
					buf_545.start(_M_STRING);
					buf_545.literal(58);
					buf_545.end();
					term_481 = buf_545.term();
				}
				sink.propertyNamed("$ColumnLocation", term_481);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_92));
				Term term_385;
				{
					BufferSink buf_349 = sink.context().makeBuffer();
					buf_349.start(_M_FRESH);
					buf_349.end();
					term_385 = buf_349.term();
				}
				sink.propertyVariable(var_94, term_385);
				Term term_521;
				{
					BufferSink buf_321 = sink.context().makeBuffer();
					buf_321.start(_M_TEXT);
					buf_321.use(var_94);
					buf_321.end();
					term_521 = buf_321.term();
				}
				term_355 = force(sink.context(), term_355);
				Sink.property(sink, term_355, term_521);
				sink.start(_M_SetVariable);
				sink.copy(term_355.ref());
				Variable var_88 = sink.context().makeVariable("ok");
				Variable var_26 = sink.context().makeVariable("var_80");
				sink.binds(new Variable[]
					{var_88, var_26});
				VariableUse use_26 = sink.context().makeVariableUse(var_88);
				VariableUse use_99 = sink.context().makeVariableUse(var_26);
				sink.substitute(term_213.ref(), new Variable[]
					{var_23, var_73}, new Term[]
					{use_26, use_99});
				sink.end();
				sink.end();
				sink.end();
				Term term_244;
				{
					BufferSink buf_275 = sink.context().makeBuffer();
					buf_275.start(_M_STRING);
					buf_275.literal(1);
					buf_275.end();
					term_244 = buf_275.term();
				}
				sink.propertyNamed("$LineLocation", term_244);
				Term term_212;
				{
					BufferSink buf_254 = sink.context().makeBuffer();
					buf_254.start(_M_STRING);
					buf_254.literal(61);
					buf_254.end();
					term_212 = buf_254.term();
				}
				sink.propertyNamed("$ColumnLocation", term_212);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SetVariable0, props_92, term_256, term_355, var_23, var_73, term_213);
	}

	final public static boolean _M_SetVariable(Sink sink, int shared, int depth, Properties props_60, Term term_282, Variable var_138, Variable var_84, Term term_304)
	{
		if (depth < 2000)
		{
			label_76 :
			{
				/* #key=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_60));
				sink.start(_M_SetVariable0);
				sink.start(_M__s);
				sink.properties(safeRef(props_60));
				sink.start(_M_Builtin_sGet);
				sink.end();
				sink.copy(term_282.ref());
				sink.start(_M_NOENTRY);
				sink.end();
				sink.end();
				sink.copy(term_282.ref());
				Variable var_12 = sink.context().makeVariable("ok");
				Variable var_95 = sink.context().makeVariable("var");
				sink.binds(new Variable[]
					{var_12, var_95});
				VariableUse use_97 = sink.context().makeVariableUse(var_12);
				VariableUse use_68 = sink.context().makeVariableUse(var_95);
				sink.substitute(term_304.ref(), new Variable[]
					{var_138, var_84}, new Term[]
					{use_97, use_68});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SetVariable, props_60, term_282, var_138, var_84, term_304);
	}

	final public static boolean _M_SetTerm(Sink sink, int shared, int depth, Properties props_88, Term term_405, Variable var_145, Variable var_92, Term term_419)
	{
		if (depth < 2000)
		{
			label_85 :
			{
				if (term_405.descriptor() != _M_Crsx_xterm_xA1)
				{
					break label_85;
				}
				Term sub_320 = term_405.sub(0).ref();
				/* #freeTerm=sub */
				/* #=term *//*Contract*/sink.properties(safeRef(props_88));
				sink.start(_M_SetFreeTerm);
				sink.copy(sub_320.ref());
				Variable var_0 = sink.context().makeVariable("ok");
				Variable var_53 = sink.context().makeVariable("var");
				sink.binds(new Variable[]
					{var_0, var_53});
				VariableUse use_9 = sink.context().makeVariableUse(var_0);
				Term term_243;
				{
					BufferSink buf_405 = sink.context().makeBuffer();
					buf_405.start(_M__sCons);
					buf_405.use(var_53);
					buf_405.start(_M__sNil);
					buf_405.end();
					buf_405.end();
					term_243 = buf_405.term();
				}
				sink.substitute(term_419.ref(), new Variable[]
					{var_145, var_92}, new Term[]
					{use_9, term_243});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SetTerm, props_88, term_405, var_145, var_92, term_419);
	}

	final public static boolean _M_SetNextTerms(Sink sink, int shared, int depth, Properties props_66, Term term_314, Term term_472, Term term_838, Variable var_63, Variable var_46, Term term_350)
	{
		if (depth < 2000)
		{
			label_0 :
			{
				if (term_314.descriptor() != _M_OK)
				{
					break label_0;
				}
				/* #args=term */
				if (term_838.descriptor() != _M__sNil)
				{
					break label_0;
				}
				/* #=term *//*Contract*/sink.properties(safeRef(props_66));
				Term term_694;
				{
					BufferSink buf_593 = sink.context().makeBuffer();
					buf_593.start(_M_OK);
					buf_593.end();
					term_694 = buf_593.term();
				}
				Term term_607;
				{
					BufferSink buf_307 = sink.context().makeBuffer();
					buf_307.copy(term_472.ref());
					term_607 = buf_307.term();
				}
				sink.substitute(term_350.ref(), new Variable[]
					{var_63, var_46}, new Term[]
					{term_694, term_607});
				return true;
			}
			label_27 :
			{
				if (term_314.descriptor() != _M_OK)
				{
					break label_27;
				}
				/* #args=term */
				if (term_838.descriptor() != _M__sCons)
				{
					break label_27;
				}
				Term sub_89 = term_838.sub(0).ref();
				if (sub_89.descriptor() != _M_Crsx_xterms_xS1)
				{
					break label_27;
				}
				Term sub_35 = sub_89.sub(0).ref();
				Term sub_184 = sub_89.sub(1).ref();
				/* #term=sub */Term sub_197 = term_838.sub(1).ref();
				/* #terms_S1*=sub */
				/* #=term *//*Contract*/sink.properties(safeRef(props_66));
				sink.start(_M_SetTerm);
				sink.copy(sub_184.ref());
				Variable var_65 = sink.context().makeVariable("ok");
				Variable var_17 = sink.context().makeVariable("args");
				sink.binds(new Variable[]
					{var_65, var_17});
				sink.start(_M_SetNextTerms);
				sink.use(var_65);
				sink.start(_M_Concat);
				sink.copy(term_472.ref());
				sink.use(var_17);
				sink.end();
				sink.copy(sub_197.ref());
				Variable var_1 = sink.context().makeVariable("ok");
				Variable var_52 = sink.context().makeVariable("args");
				sink.binds(new Variable[]
					{var_1, var_52});
				VariableUse use_1 = sink.context().makeVariableUse(var_1);
				VariableUse use_32 = sink.context().makeVariableUse(var_52);
				sink.substitute(term_350.ref(), new Variable[]
					{var_63, var_46}, new Term[]
					{use_1, use_32});
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SetNextTerms, props_66, term_314, term_472, term_838, var_63, var_46, term_350);
	}

	final public static boolean _M_SetTerms(Sink sink, int shared, int depth, Properties props_89, Term term_317, Variable var_81, Variable var_131, Term term_253)
	{
		if (depth < 2000)
		{
			label_60 :
			{
				if (term_317.descriptor() != _M_Crsx_xterms)
				{
					break label_60;
				}
				Term sub_129 = term_317.sub(0).ref();
				/* #term=sub */Term sub_6 = term_317.sub(1).ref();
				/* #terms_S1*=sub */
				/* #=term *//*Contract*/sink.properties(safeRef(props_89));
				sink.start(_M_SetTerm);
				sink.copy(sub_129.ref());
				Variable var_24 = sink.context().makeVariable("ok");
				Variable var_68 = sink.context().makeVariable("args");
				sink.binds(new Variable[]
					{var_24, var_68});
				sink.start(_M_SetNextTerms);
				sink.use(var_24);
				sink.use(var_68);
				sink.copy(sub_6.ref());
				Variable var_27 = sink.context().makeVariable("ok");
				Variable var_6 = sink.context().makeVariable("args");
				sink.binds(new Variable[]
					{var_27, var_6});
				VariableUse use_42 = sink.context().makeVariableUse(var_27);
				VariableUse use_83 = sink.context().makeVariableUse(var_6);
				sink.substitute(term_253.ref(), new Variable[]
					{var_81, var_131}, new Term[]
					{use_42, use_83});
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SetTerms, props_89, term_317, var_81, var_131, term_253);
	}

	final public static boolean _M_SetArgumentsOpt(Sink sink, int shared, int depth, Properties props_3, Term term_439, Variable var_146, Variable var_47, Term term_629)
	{
		if (depth < 2000)
		{
			label_86 :
			{
				if (term_439.descriptor() != _M__sNil)
				{
					break label_86;
				}
				/* #=term *//*Contract*/sink.properties(safeRef(props_3));
				Term term_251;
				{
					BufferSink buf_658 = sink.context().makeBuffer();
					buf_658.start(_M_OK);
					buf_658.end();
					term_251 = buf_658.term();
				}
				Term term_319;
				{
					BufferSink buf_317 = sink.context().makeBuffer();
					buf_317.start(_M__sNil);
					buf_317.end();
					term_319 = buf_317.term();
				}
				sink.substitute(term_629.ref(), new Variable[]
					{var_146, var_47}, new Term[]
					{term_251, term_319});
				return true;
			}
			label_31 :
			{
				if (term_439.descriptor() != _M__sCons)
				{
					break label_31;
				}
				Term sub_160 = term_439.sub(0).ref();
				if (sub_160.descriptor() != _M_Crsx_xarguments)
				{
					break label_31;
				}
				Term sub_255 = sub_160.sub(0).ref();
				Term sub_47 = sub_160.sub(1).ref();
				if (sub_47.descriptor() != _M__sNil)
				{
					break label_31;
				}
				Term sub_25 = sub_160.sub(2).ref();
				Term sub_33 = term_439.sub(1).ref();
				if (sub_33.descriptor() != _M__sNil)
				{
					break label_31;
				}
				/* #=term *//*Contract*/sink.properties(safeRef(props_3));
				Term term_497;
				{
					BufferSink buf_491 = sink.context().makeBuffer();
					buf_491.start(_M_OK);
					buf_491.end();
					term_497 = buf_491.term();
				}
				Term term_543;
				{
					BufferSink buf_913 = sink.context().makeBuffer();
					buf_913.start(_M__sNil);
					buf_913.end();
					term_543 = buf_913.term();
				}
				sink.substitute(term_629.ref(), new Variable[]
					{var_146, var_47}, new Term[]
					{term_497, term_543});
				return true;
			}
			label_89 :
			{
				if (term_439.descriptor() != _M__sCons)
				{
					break label_89;
				}
				Term sub_18 = term_439.sub(0).ref();
				if (sub_18.descriptor() != _M_Crsx_xarguments)
				{
					break label_89;
				}
				Term sub_195 = sub_18.sub(0).ref();
				Term sub_7 = sub_18.sub(1).ref();
				if (sub_7.descriptor() != _M__sCons)
				{
					break label_89;
				}
				Term sub_113 = sub_7.sub(0).ref();
				/* #terms=sub */Term sub_188 = sub_7.sub(1).ref();
				if (sub_188.descriptor() != _M__sNil)
				{
					break label_89;
				}
				Term sub_186 = sub_18.sub(2).ref();
				Term sub_30 = term_439.sub(1).ref();
				if (sub_30.descriptor() != _M__sNil)
				{
					break label_89;
				}
				/* #=term *//*Contract*/sink.properties(safeRef(props_3));
				sink.start(_M_SetTerms);
				sink.copy(sub_113.ref());
				Variable var_14 = sink.context().makeVariable("ok");
				Variable var_70 = sink.context().makeVariable("args");
				sink.binds(new Variable[]
					{var_14, var_70});
				VariableUse use_48 = sink.context().makeVariableUse(var_14);
				VariableUse use_61 = sink.context().makeVariableUse(var_70);
				sink.substitute(term_629.ref(), new Variable[]
					{var_146, var_47}, new Term[]
					{use_48, use_61});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SetArgumentsOpt, props_3, term_439, var_146, var_47, term_629);
	}

	final public static boolean _M_SetFreeTerm(Sink sink, int shared, int depth, Properties props_6, Term term_524, Variable var_43, Variable var_19, Term term_259)
	{
		if (depth < 2000)
		{
			label_91 :
			{
				if (term_524.descriptor() != _M_Crsx_xfreeTerm_xA1)
				{
					break label_91;
				}
				Term sub_50 = term_524.sub(0).ref();
				/* #annotations?=sub */Term sub_183 = term_524.sub(1).ref();
				/* #properties?=sub */Term sub_156 = term_524.sub(2).ref();
				/* #constructor=sub */Term sub_280 = term_524.sub(3).ref();
				/* #arguments?=sub */
				/* #=term *//*Contract*/sink.properties(safeRef(props_6));
				sink.start(_M_SetBuffer);
				sink.start(_M_Crsx_xfreeTerm_xA1);
				sink.copy(sub_50.ref());
				sink.copy(sub_183.ref());
				sink.copy(sub_156.ref());
				sink.copy(sub_280.ref());
				sink.end();
				Variable var_67 = sink.context().makeVariable("ok");
				Variable var_143 = sink.context().makeVariable("var");
				sink.binds(new Variable[]
					{var_67, var_143});
				VariableUse use_15 = sink.context().makeVariableUse(var_67);
				VariableUse use_44 = sink.context().makeVariableUse(var_143);
				sink.substitute(term_259.ref(), new Variable[]
					{var_43, var_19}, new Term[]
					{use_15, use_44});
				sink.end();
				return true;
			}
			label_162 :
			{
				if (term_524.descriptor() != _M_Crsx_xfreeTerm_xA2)
				{
					break label_162;
				}
				Term sub_239 = term_524.sub(0).ref();
				/* #annotations?=sub */Term sub_142 = term_524.sub(1).ref();
				/* #properties?=sub */Term sub_34 = term_524.sub(2).ref();
				/* #constructor=sub */Term sub_125 = term_524.sub(3).ref();
				/* #term=sub */
				/* #=term *//*Contract*/sink.properties(safeRef(props_6));
				sink.start(_M_SetFreeTerm);
				sink.start(_M_Crsx_xfreeTerm_xA1);
				sink.copy(sub_239.ref());
				sink.copy(sub_142.ref());
				sink.copy(sub_34.ref());
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xarguments);
				sink.literal("[");
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xterms);
				sink.copy(sub_125.ref());
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.literal("]");
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				Variable var_78 = sink.context().makeVariable("ok");
				Variable var_54 = sink.context().makeVariable("var");
				sink.binds(new Variable[]
					{var_78, var_54});
				VariableUse use_87 = sink.context().makeVariableUse(var_78);
				VariableUse use_18 = sink.context().makeVariableUse(var_54);
				sink.substitute(term_259.ref(), new Variable[]
					{var_43, var_19}, new Term[]
					{use_87, use_18});
				sink.end();
				return true;
			}
			label_297 :
			{
				Term value_46 = props_6 == null ? null : props_6.lookup("$sink");
				if (value_46 == null)
				{
					break label_297;
				}
				if (value_46.descriptor() != _M_TEXT)
				{
					break label_297;
				}
				Term sub_20 = value_46.sub(0).ref();
				/* #sink=sub */
				if (term_524.descriptor() != _M_Crsx_xfreeTerm_xA3)
				{
					break label_297;
				}
				Term sub_212 = term_524.sub(0).ref();
				/* #annotations?=sub */Term sub_71 = term_524.sub(1).ref();
				/* #properties?=sub */Term sub_5 = term_524.sub(2).ref();
				/* #literal=sub */
				/* #=term *//*Contract*/
				Variable var_66 = sink.context().makeVariable("literal");
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_467;
				{
					BufferSink buf_370 = sink.context().makeBuffer();
					buf_370.start(_M_STRING);
					buf_370.literal(1);
					buf_370.end();
					term_467 = buf_370.term();
				}
				sink.propertyNamed("$LineLocation", term_467);
				Term term_767;
				{
					BufferSink buf_409 = sink.context().makeBuffer();
					buf_409.start(_M_STRING);
					buf_409.literal(1);
					buf_409.end();
					term_767 = buf_409.term();
				}
				sink.propertyNamed("$ColumnLocation", term_767);
				sink.start(_M__sTextCons);
				Term term_788;
				{
					BufferSink buf_318 = sink.context().makeBuffer();
					buf_318.start(_M_STRING);
					buf_318.literal(1);
					buf_318.end();
					term_788 = buf_318.term();
				}
				sink.propertyNamed("$LineLocation", term_788);
				Term term_566;
				{
					BufferSink buf_428 = sink.context().makeBuffer();
					buf_428.start(_M_STRING);
					buf_428.literal(1);
					buf_428.end();
					term_566 = buf_428.term();
				}
				sink.propertyNamed("$ColumnLocation", term_566);
				sink.start(_M__sTextChars);
				sink.literal("Term ");
				sink.end();
				Term term_438;
				{
					BufferSink buf_716 = sink.context().makeBuffer();
					buf_716.start(_M_STRING);
					buf_716.literal(1);
					buf_716.end();
					term_438 = buf_716.term();
				}
				sink.propertyNamed("$LineLocation", term_438);
				Term term_421;
				{
					BufferSink buf_435 = sink.context().makeBuffer();
					buf_435.start(_M_STRING);
					buf_435.literal(2);
					buf_435.end();
					term_421 = buf_435.term();
				}
				sink.propertyNamed("$ColumnLocation", term_421);
				sink.start(_M__sTextCons);
				Term term_326;
				{
					BufferSink buf_295 = sink.context().makeBuffer();
					buf_295.start(_M_STRING);
					buf_295.literal(1);
					buf_295.end();
					term_326 = buf_295.term();
				}
				sink.propertyNamed("$LineLocation", term_326);
				Term term_128;
				{
					BufferSink buf_402 = sink.context().makeBuffer();
					buf_402.start(_M_STRING);
					buf_402.literal(2);
					buf_402.end();
					term_128 = buf_402.term();
				}
				sink.propertyNamed("$ColumnLocation", term_128);
				sink.start(_M__sTextEmbed);
				Term term_417;
				{
					BufferSink buf_427 = sink.context().makeBuffer();
					buf_427.start(_M_STRING);
					buf_427.literal(1);
					buf_427.end();
					term_417 = buf_427.term();
				}
				sink.propertyNamed("$LineLocation", term_417);
				Term term_223;
				{
					BufferSink buf_281 = sink.context().makeBuffer();
					buf_281.start(_M_STRING);
					buf_281.literal(2);
					buf_281.end();
					term_223 = buf_281.term();
				}
				sink.propertyNamed("$ColumnLocation", term_223);
				sink.start(_M_AsText);
				sink.use(var_66);
				sink.end();
				sink.end();
				Term term_415;
				{
					BufferSink buf_308 = sink.context().makeBuffer();
					buf_308.start(_M_STRING);
					buf_308.literal(1);
					buf_308.end();
					term_415 = buf_308.term();
				}
				sink.propertyNamed("$LineLocation", term_415);
				Term term_506;
				{
					BufferSink buf_239 = sink.context().makeBuffer();
					buf_239.start(_M_STRING);
					buf_239.literal(7);
					buf_239.end();
					term_506 = buf_239.term();
				}
				sink.propertyNamed("$ColumnLocation", term_506);
				sink.start(_M__sTextCons);
				Term term_280;
				{
					BufferSink buf_495 = sink.context().makeBuffer();
					buf_495.start(_M_STRING);
					buf_495.literal(1);
					buf_495.end();
					term_280 = buf_495.term();
				}
				sink.propertyNamed("$LineLocation", term_280);
				Term term_573;
				{
					BufferSink buf_374 = sink.context().makeBuffer();
					buf_374.start(_M_STRING);
					buf_374.literal(7);
					buf_374.end();
					term_573 = buf_374.term();
				}
				sink.propertyNamed("$ColumnLocation", term_573);
				sink.start(_M__sTextChars);
				sink.literal(" = Literal.make(");
				sink.end();
				Term term_784;
				{
					BufferSink buf_109 = sink.context().makeBuffer();
					buf_109.start(_M_STRING);
					buf_109.literal(1);
					buf_109.end();
					term_784 = buf_109.term();
				}
				sink.propertyNamed("$LineLocation", term_784);
				Term term_202;
				{
					BufferSink buf_298 = sink.context().makeBuffer();
					buf_298.start(_M_STRING);
					buf_298.literal(16);
					buf_298.end();
					term_202 = buf_298.term();
				}
				sink.propertyNamed("$ColumnLocation", term_202);
				sink.start(_M__sTextCons);
				Term term_698;
				{
					BufferSink buf_389 = sink.context().makeBuffer();
					buf_389.start(_M_STRING);
					buf_389.literal(1);
					buf_389.end();
					term_698 = buf_389.term();
				}
				sink.propertyNamed("$LineLocation", term_698);
				Term term_529;
				{
					BufferSink buf_508 = sink.context().makeBuffer();
					buf_508.start(_M_STRING);
					buf_508.literal(16);
					buf_508.end();
					term_529 = buf_508.term();
				}
				sink.propertyNamed("$ColumnLocation", term_529);
				sink.start(_M__sTextEmbed);
				Term term_469;
				{
					BufferSink buf_355 = sink.context().makeBuffer();
					buf_355.start(_M_STRING);
					buf_355.literal(1);
					buf_355.end();
					term_469 = buf_355.term();
				}
				sink.propertyNamed("$LineLocation", term_469);
				Term term_235;
				{
					BufferSink buf_660 = sink.context().makeBuffer();
					buf_660.start(_M_STRING);
					buf_660.literal(16);
					buf_660.end();
					term_235 = buf_660.term();
				}
				sink.propertyNamed("$ColumnLocation", term_235);
				sink.start(_M_AsText);
				sink.start(_M_Literal);
				sink.copy(sub_5.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_425;
				{
					BufferSink buf_423 = sink.context().makeBuffer();
					buf_423.start(_M_STRING);
					buf_423.literal(1);
					buf_423.end();
					term_425 = buf_423.term();
				}
				sink.propertyNamed("$LineLocation", term_425);
				Term term_491;
				{
					BufferSink buf_253 = sink.context().makeBuffer();
					buf_253.start(_M_STRING);
					buf_253.literal(32);
					buf_253.end();
					term_491 = buf_253.term();
				}
				sink.propertyNamed("$ColumnLocation", term_491);
				sink.start(_M__sTextCons);
				Term term_534;
				{
					BufferSink buf_625 = sink.context().makeBuffer();
					buf_625.start(_M_STRING);
					buf_625.literal(1);
					buf_625.end();
					term_534 = buf_625.term();
				}
				sink.propertyNamed("$LineLocation", term_534);
				Term term_208;
				{
					BufferSink buf_216 = sink.context().makeBuffer();
					buf_216.start(_M_STRING);
					buf_216.literal(32);
					buf_216.end();
					term_208 = buf_216.term();
				}
				sink.propertyNamed("$ColumnLocation", term_208);
				sink.start(_M__sTextChars);
				sink.literal(");");
				sink.end();
				Term term_358;
				{
					BufferSink buf_330 = sink.context().makeBuffer();
					buf_330.start(_M_STRING);
					buf_330.literal(1);
					buf_330.end();
					term_358 = buf_330.term();
				}
				sink.propertyNamed("$LineLocation", term_358);
				Term term_341;
				{
					BufferSink buf_377 = sink.context().makeBuffer();
					buf_377.start(_M_STRING);
					buf_377.literal(51);
					buf_377.end();
					term_341 = buf_377.term();
				}
				sink.propertyNamed("$ColumnLocation", term_341);
				sink.start(_M__sTextCons);
				Term term_371;
				{
					BufferSink buf_269 = sink.context().makeBuffer();
					buf_269.start(_M_STRING);
					buf_269.literal(1);
					buf_269.end();
					term_371 = buf_269.term();
				}
				sink.propertyNamed("$LineLocation", term_371);
				Term term_621;
				{
					BufferSink buf_172 = sink.context().makeBuffer();
					buf_172.start(_M_STRING);
					buf_172.literal(51);
					buf_172.end();
					term_621 = buf_172.term();
				}
				sink.propertyNamed("$ColumnLocation", term_621);
				sink.start(_M__sTextEmbed);
				Term term_749;
				{
					BufferSink buf_420 = sink.context().makeBuffer();
					buf_420.start(_M_STRING);
					buf_420.literal(1);
					buf_420.end();
					term_749 = buf_420.term();
				}
				sink.propertyNamed("$LineLocation", term_749);
				Term term_599;
				{
					BufferSink buf_618 = sink.context().makeBuffer();
					buf_618.start(_M_STRING);
					buf_618.literal(51);
					buf_618.end();
					term_599 = buf_618.term();
				}
				sink.propertyNamed("$ColumnLocation", term_599);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_6));
				Term term_360;
				{
					BufferSink buf_360 = sink.context().makeBuffer();
					buf_360.start(_M_OK);
					buf_360.end();
					term_360 = buf_360.term();
				}
				VariableUse use_2 = sink.context().makeVariableUse(var_66);
				sink.substitute(term_259.ref(), new Variable[]
					{var_43, var_19}, new Term[]
					{term_360, use_2});
				sink.end();
				sink.end();
				Term term_574;
				{
					BufferSink buf_391 = sink.context().makeBuffer();
					buf_391.start(_M_STRING);
					buf_391.literal(1);
					buf_391.end();
					term_574 = buf_391.term();
				}
				sink.propertyNamed("$LineLocation", term_574);
				Term term_320;
				{
					BufferSink buf_713 = sink.context().makeBuffer();
					buf_713.start(_M_STRING);
					buf_713.literal(53);
					buf_713.end();
					term_320 = buf_713.term();
				}
				sink.propertyNamed("$ColumnLocation", term_320);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_96 :
			{
				if (term_524.descriptor() != _M_Crsx_xfreeTerm_xA4)
				{
					break label_96;
				}
				Term sub_260 = term_524.sub(0).ref();
				/* #annotations?=sub */Term sub_27 = term_524.sub(1).ref();
				/* #list=sub */
				/* #=term *//*Contract*/sink.properties(safeRef(props_6));
				sink.start(_M_SetFreeTerm);
				sink.start(_M_DesugarList);
				sink.copy(sub_27.ref());
				sink.end();
				Variable var_9 = sink.context().makeVariable("ok");
				Variable var_87 = sink.context().makeVariable("var");
				sink.binds(new Variable[]
					{var_9, var_87});
				VariableUse use_38 = sink.context().makeVariableUse(var_9);
				VariableUse use_81 = sink.context().makeVariableUse(var_87);
				sink.substitute(term_259.ref(), new Variable[]
					{var_43, var_19}, new Term[]
					{use_38, use_81});
				sink.end();
				return true;
			}
			label_47 :
			{
				if (term_524.descriptor() != _M_Crsx_xfreeTerm_xA5)
				{
					break label_47;
				}
				Term sub_94 = term_524.sub(0).ref();
				/* #annotations?=sub */Term sub_9 = term_524.sub(1).ref();
				if (sub_9.descriptor() != _M_Crsx_xvariable)
				{
					break label_47;
				}
				Term sub_111 = sub_9.sub(0).ref();
				if (sub_111.descriptor() != _M__sNil)
				{
					break label_47;
				}
				Term sub_3 = sub_9.sub(1).ref();
				/* #VARIABLE=sub */Term sub_154 = sub_9.sub(2).ref();
				/* #linear?=sub */Term sub_86 = sub_9.sub(3).ref();
				/* #functional?=sub */Term sub_242 = sub_9.sub(4).ref();
				/* #varsort?=sub */
				/* #=term *//*Contract*/sink.properties(safeRef(props_6));
				sink.start(_M_SetVariable);
				sink.start(_M_VarKey);
				sink.start(_M_Crsx_xvariable);
				sink.start(_M__sNil);
				sink.end();
				sink.copy(sub_3.ref());
				sink.start(_M__sNil);
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				Variable var_74 = sink.context().makeVariable("ok");
				Variable var_123 = sink.context().makeVariable("var");
				sink.binds(new Variable[]
					{var_74, var_123});
				VariableUse use_144 = sink.context().makeVariableUse(var_74);
				VariableUse use_57 = sink.context().makeVariableUse(var_123);
				sink.substitute(term_259.ref(), new Variable[]
					{var_43, var_19}, new Term[]
					{use_144, use_57});
				sink.end();
				return true;
			}
			label_79 :
			{
				if (term_524.descriptor() != _M_Crsx_xfreeTerm_xA6)
				{
					break label_79;
				}
				Term sub_185 = term_524.sub(0).ref();
				if (sub_185.descriptor() != _M__sNil)
				{
					break label_79;
				}
				Term sub_73 = term_524.sub(1).ref();
				/* #properties=sub */
				/* #=term *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.literal("Named data structure not implemented yet.");
				sink.end();
				return true;
			}
			label_179 :
			{
				if (term_524.descriptor() != _M_Crsx_xfreeTerm_xA7)
				{
					break label_179;
				}
				Term sub_298 = term_524.sub(0).ref();
				/* #annotations?=sub */Term sub_178 = term_524.sub(1).ref();
				/* #properties?=sub */Term sub_133 = term_524.sub(2).ref();
				/* #METAVAR=sub */Term sub_211 = term_524.sub(3).ref();
				/* #freeArguments?=sub */
				/* #=term *//*Contract*/sink.properties(safeRef(props_6));
				sink.start(_M_SetBuffer);
				sink.start(_M_Crsx_xfreeTerm_xA7);
				sink.copy(sub_298.ref());
				sink.copy(sub_178.ref());
				sink.copy(sub_133.ref());
				sink.copy(sub_211.ref());
				sink.end();
				Variable var_199 = sink.context().makeVariable("ok");
				Variable var_122 = sink.context().makeVariable("var");
				sink.binds(new Variable[]
					{var_199, var_122});
				VariableUse use_70 = sink.context().makeVariableUse(var_199);
				VariableUse use_91 = sink.context().makeVariableUse(var_122);
				sink.substitute(term_259.ref(), new Variable[]
					{var_43, var_19}, new Term[]
					{use_70, use_91});
				sink.end();
				return true;
			}
			label_50 :
			{
				if (term_524.descriptor() != _M_Crsx_xfreeTerm_xA9)
				{
					break label_50;
				}
				Term sub_210 = term_524.sub(0).ref();
				/* #annotations?=sub */Term sub_252 = term_524.sub(1).ref();
				/* #properties?=sub */Term sub_236 = term_524.sub(2).ref();
				/* #expression=sub */
				/* #=term *//*Contract*/sink.properties(safeRef(props_6));
				sink.start(_M_SetBuffer);
				sink.start(_M_Crsx_xfreeTerm_xA9);
				sink.copy(sub_210.ref());
				sink.copy(sub_252.ref());
				sink.copy(sub_236.ref());
				sink.end();
				Variable var_57 = sink.context().makeVariable("ok");
				Variable var_49 = sink.context().makeVariable("var");
				sink.binds(new Variable[]
					{var_57, var_49});
				VariableUse use_10 = sink.context().makeVariableUse(var_57);
				VariableUse use_14 = sink.context().makeVariableUse(var_49);
				sink.substitute(term_259.ref(), new Variable[]
					{var_43, var_19}, new Term[]
					{use_10, use_14});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SetFreeTerm, props_6, term_524, var_43, var_19, term_259);
	}

	final public static boolean _M_SetFreeTerms_xS1_xZOM(Sink sink, int shared, int depth, Properties props_12, Term term_322, Variable var_93, Variable var_107, Term term_442)
	{
		if (depth < 2000)
		{
			label_57 :
			{
				if (term_322.descriptor() != _M__sNil)
				{
					break label_57;
				}
				/* #=term *//*Contract*/sink.properties(safeRef(props_12));
				Term term_374;
				{
					BufferSink buf_285 = sink.context().makeBuffer();
					buf_285.start(_M_OK);
					buf_285.end();
					term_374 = buf_285.term();
				}
				Term term_462;
				{
					BufferSink buf_557 = sink.context().makeBuffer();
					buf_557.start(_M__sNil);
					buf_557.end();
					term_462 = buf_557.term();
				}
				sink.substitute(term_442.ref(), new Variable[]
					{var_93, var_107}, new Term[]
					{term_374, term_462});
				return true;
			}
			label_83 :
			{
				if (term_322.descriptor() != _M__sCons)
				{
					break label_83;
				}
				Term sub_193 = term_322.sub(0).ref();
				if (sub_193.descriptor() != _M_Crsx_xfreeTerms_xS1)
				{
					break label_83;
				}
				Term sub_205 = sub_193.sub(0).ref();
				Term sub_299 = sub_193.sub(1).ref();
				/* #freeTerm=sub */Term sub_76 = term_322.sub(1).ref();
				/* #freeTerms_S1*=sub */
				/* #=term *//*Contract*/sink.properties(safeRef(props_12));
				sink.start(_M_SetFreeTerm);
				sink.copy(sub_299.ref());
				Variable var_35 = sink.context().makeVariable("ok");
				Variable var_15 = sink.context().makeVariable("var");
				sink.binds(new Variable[]
					{var_35, var_15});
				sink.start(_M_SetFreeTerms_xS1_xZOM);
				sink.copy(sub_76.ref());
				Variable var_190 = sink.context().makeVariable("ok");
				Variable var_29 = sink.context().makeVariable("vars");
				sink.binds(new Variable[]
					{var_190, var_29});
				VariableUse use_76 = sink.context().makeVariableUse(var_190);
				Term term_716;
				{
					BufferSink buf_433 = sink.context().makeBuffer();
					buf_433.start(_M__sCons);
					buf_433.use(var_15);
					buf_433.use(var_29);
					buf_433.end();
					term_716 = buf_433.term();
				}
				sink.substitute(term_442.ref(), new Variable[]
					{var_93, var_107}, new Term[]
					{use_76, term_716});
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SetFreeTerms_xS1_xZOM, props_12, term_322, var_93, var_107, term_442);
	}

	final public static boolean _M_SetFreeTerms(Sink sink, int shared, int depth, Properties props_41, Term term_606, Variable var_28, Variable var_7, Term term_367)
	{
		if (depth < 2000)
		{
			label_75 :
			{
				if (term_606.descriptor() != _M_Crsx_xfreeTerms)
				{
					break label_75;
				}
				Term sub_141 = term_606.sub(0).ref();
				/* #freeTerm=sub */Term sub_58 = term_606.sub(1).ref();
				/* #freeTerms_S1*=sub */
				/* #=term *//*Contract*/sink.properties(safeRef(props_41));
				sink.start(_M_SetFreeTerm);
				sink.copy(sub_141.ref());
				Variable var_71 = sink.context().makeVariable("ok");
				Variable var_111 = sink.context().makeVariable("var");
				sink.binds(new Variable[]
					{var_71, var_111});
				sink.start(_M_SetFreeTerms_xS1_xZOM);
				sink.copy(sub_58.ref());
				Variable var_198 = sink.context().makeVariable("ok");
				Variable var_31 = sink.context().makeVariable("vars");
				sink.binds(new Variable[]
					{var_198, var_31});
				VariableUse use_75 = sink.context().makeVariableUse(var_198);
				Term term_571;
				{
					BufferSink buf_265 = sink.context().makeBuffer();
					buf_265.start(_M__sCons);
					buf_265.use(var_111);
					buf_265.use(var_31);
					buf_265.end();
					term_571 = buf_265.term();
				}
				sink.substitute(term_367.ref(), new Variable[]
					{var_28, var_7}, new Term[]
					{use_75, term_571});
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SetFreeTerms, props_41, term_606, var_28, var_7, term_367);
	}

	final public static boolean _M_CallFunctionArgs(Sink sink, int shared, int depth, Properties props_40, Term term_555)
	{
		if (depth < 2000)
		{
			label_22 :
			{
				if (term_555.descriptor() != _M__sNil)
				{
					break label_22;
				}/*Contract*/
				sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
			label_38 :
			{
				if (term_555.descriptor() != _M__sCons)
				{
					break label_38;
				}
				Term sub_264 = term_555.sub(0).ref();
				/* #arg=sub */Term sub_203 = term_555.sub(1).ref();
				/* #args=sub *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextChars);
				sink.literal(", ");
				sink.end();
				Term term_203;
				{
					BufferSink buf_462 = sink.context().makeBuffer();
					buf_462.start(_M_STRING);
					buf_462.literal(1);
					buf_462.end();
					term_203 = buf_462.term();
				}
				sink.propertyNamed("$LineLocation", term_203);
				Term term_576;
				{
					BufferSink buf_661 = sink.context().makeBuffer();
					buf_661.start(_M_STRING);
					buf_661.literal(1);
					buf_661.end();
					term_576 = buf_661.term();
				}
				sink.propertyNamed("$ColumnLocation", term_576);
				sink.start(_M__sTextCons);
				Term term_480;
				{
					BufferSink buf_520 = sink.context().makeBuffer();
					buf_520.start(_M_STRING);
					buf_520.literal(1);
					buf_520.end();
					term_480 = buf_520.term();
				}
				sink.propertyNamed("$LineLocation", term_480);
				Term term_485;
				{
					BufferSink buf_212 = sink.context().makeBuffer();
					buf_212.start(_M_STRING);
					buf_212.literal(1);
					buf_212.end();
					term_485 = buf_212.term();
				}
				sink.propertyNamed("$ColumnLocation", term_485);
				sink.start(_M__sTextEmbed);
				Term term_590;
				{
					BufferSink buf_744 = sink.context().makeBuffer();
					buf_744.start(_M_STRING);
					buf_744.literal(1);
					buf_744.end();
					term_590 = buf_744.term();
				}
				sink.propertyNamed("$LineLocation", term_590);
				Term term_436;
				{
					BufferSink buf_356 = sink.context().makeBuffer();
					buf_356.start(_M_STRING);
					buf_356.literal(1);
					buf_356.end();
					term_436 = buf_356.term();
				}
				sink.propertyNamed("$ColumnLocation", term_436);
				sink.start(_M_AsText);
				sink.copy(sub_264.ref());
				sink.end();
				sink.end();
				Term term_434;
				{
					BufferSink buf_316 = sink.context().makeBuffer();
					buf_316.start(_M_STRING);
					buf_316.literal(1);
					buf_316.end();
					term_434 = buf_316.term();
				}
				sink.propertyNamed("$LineLocation", term_434);
				Term term_616;
				{
					BufferSink buf_526 = sink.context().makeBuffer();
					buf_526.start(_M_STRING);
					buf_526.literal(3);
					buf_526.end();
					term_616 = buf_526.term();
				}
				sink.propertyNamed("$ColumnLocation", term_616);
				sink.start(_M__sTextCons);
				Term term_165;
				{
					BufferSink buf_401 = sink.context().makeBuffer();
					buf_401.start(_M_STRING);
					buf_401.literal(1);
					buf_401.end();
					term_165 = buf_401.term();
				}
				sink.propertyNamed("$LineLocation", term_165);
				Term term_348;
				{
					BufferSink buf_622 = sink.context().makeBuffer();
					buf_622.start(_M_STRING);
					buf_622.literal(3);
					buf_622.end();
					term_348 = buf_622.term();
				}
				sink.propertyNamed("$ColumnLocation", term_348);
				sink.start(_M__sTextEmbed);
				Term term_301;
				{
					BufferSink buf_647 = sink.context().makeBuffer();
					buf_647.start(_M_STRING);
					buf_647.literal(1);
					buf_647.end();
					term_301 = buf_647.term();
				}
				sink.propertyNamed("$LineLocation", term_301);
				Term term_401;
				{
					BufferSink buf_381 = sink.context().makeBuffer();
					buf_381.start(_M_STRING);
					buf_381.literal(3);
					buf_381.end();
					term_401 = buf_381.term();
				}
				sink.propertyNamed("$ColumnLocation", term_401);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_40));
				sink.start(_M_CallFunctionArgs);
				sink.copy(sub_203.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_721;
				{
					BufferSink buf_695 = sink.context().makeBuffer();
					buf_695.start(_M_STRING);
					buf_695.literal(1);
					buf_695.end();
					term_721 = buf_695.term();
				}
				sink.propertyNamed("$LineLocation", term_721);
				Term term_919;
				{
					BufferSink buf_436 = sink.context().makeBuffer();
					buf_436.start(_M_STRING);
					buf_436.literal(9);
					buf_436.end();
					term_919 = buf_436.term();
				}
				sink.propertyNamed("$ColumnLocation", term_919);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_CallFunctionArgs, props_40, term_555);
	}

	final public static boolean _M_CallFunction(Sink sink, int shared, int depth, Properties props_155, Term term_227, Term term_349, Term term_540, Term term_589)
	{
		if (depth < 2000)
		{
			label_18 :
			{
				Term value_92 = props_155 == null ? null : props_155.lookup("$sink");
				if (value_92 == null)
				{
					break label_18;
				}
				if (value_92.descriptor() != _M_TEXT)
				{
					break label_18;
				}
				Term sub_217 = value_92.sub(0).ref();
				/* #sink=sub */
				if (term_227.descriptor() != _M_OK)
				{
					break label_18;
				}
				/* #tail=term */
				/* #symbol=term */
				/* #vars=term *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextEmbed);
				sink.start(_M_AsText);
				sink.start(_M_SendTail2);
				sink.copy(term_349.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_570;
				{
					BufferSink buf_567 = sink.context().makeBuffer();
					buf_567.start(_M_STRING);
					buf_567.literal(1);
					buf_567.end();
					term_570 = buf_567.term();
				}
				sink.propertyNamed("$LineLocation", term_570);
				Term term_750;
				{
					BufferSink buf_634 = sink.context().makeBuffer();
					buf_634.start(_M_STRING);
					buf_634.literal(1);
					buf_634.end();
					term_750 = buf_634.term();
				}
				sink.propertyNamed("$ColumnLocation", term_750);
				sink.start(_M__sTextCons);
				Term term_232;
				{
					BufferSink buf_342 = sink.context().makeBuffer();
					buf_342.start(_M_STRING);
					buf_342.literal(1);
					buf_342.end();
					term_232 = buf_342.term();
				}
				sink.propertyNamed("$LineLocation", term_232);
				Term term_427;
				{
					BufferSink buf_489 = sink.context().makeBuffer();
					buf_489.start(_M_STRING);
					buf_489.literal(1);
					buf_489.end();
					term_427 = buf_489.term();
				}
				sink.propertyNamed("$ColumnLocation", term_427);
				sink.start(_M__sTextEmbed);
				Term term_225;
				{
					BufferSink buf_471 = sink.context().makeBuffer();
					buf_471.start(_M_STRING);
					buf_471.literal(1);
					buf_471.end();
					term_225 = buf_471.term();
				}
				sink.propertyNamed("$LineLocation", term_225);
				Term term_799;
				{
					BufferSink buf_296 = sink.context().makeBuffer();
					buf_296.start(_M_STRING);
					buf_296.literal(1);
					buf_296.end();
					term_799 = buf_296.term();
				}
				sink.propertyNamed("$ColumnLocation", term_799);
				sink.start(_M_AsText);
				sink.start(_M_ToJavaId);
				sink.copy(term_540.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_509;
				{
					BufferSink buf_480 = sink.context().makeBuffer();
					buf_480.start(_M_STRING);
					buf_480.literal(1);
					buf_480.end();
					term_509 = buf_480.term();
				}
				sink.propertyNamed("$LineLocation", term_509);
				Term term_645;
				{
					BufferSink buf_169 = sink.context().makeBuffer();
					buf_169.start(_M_STRING);
					buf_169.literal(19);
					buf_169.end();
					term_645 = buf_169.term();
				}
				sink.propertyNamed("$ColumnLocation", term_645);
				sink.start(_M__sTextCons);
				Term term_877;
				{
					BufferSink buf_598 = sink.context().makeBuffer();
					buf_598.start(_M_STRING);
					buf_598.literal(1);
					buf_598.end();
					term_877 = buf_598.term();
				}
				sink.propertyNamed("$LineLocation", term_877);
				Term term_389;
				{
					BufferSink buf_326 = sink.context().makeBuffer();
					buf_326.start(_M_STRING);
					buf_326.literal(19);
					buf_326.end();
					term_389 = buf_326.term();
				}
				sink.propertyNamed("$ColumnLocation", term_389);
				sink.start(_M__sTextChars);
				sink.literal("(");
				sink.end();
				Term term_403;
				{
					BufferSink buf_453 = sink.context().makeBuffer();
					buf_453.start(_M_STRING);
					buf_453.literal(1);
					buf_453.end();
					term_403 = buf_453.term();
				}
				sink.propertyNamed("$LineLocation", term_403);
				Term term_498;
				{
					BufferSink buf_458 = sink.context().makeBuffer();
					buf_458.start(_M_STRING);
					buf_458.literal(38);
					buf_458.end();
					term_498 = buf_458.term();
				}
				sink.propertyNamed("$ColumnLocation", term_498);
				sink.start(_M__sTextCons);
				Term term_372;
				{
					BufferSink buf_313 = sink.context().makeBuffer();
					buf_313.start(_M_STRING);
					buf_313.literal(1);
					buf_313.end();
					term_372 = buf_313.term();
				}
				sink.propertyNamed("$LineLocation", term_372);
				Term term_211;
				{
					BufferSink buf_129 = sink.context().makeBuffer();
					buf_129.start(_M_STRING);
					buf_129.literal(38);
					buf_129.end();
					term_211 = buf_129.term();
				}
				sink.propertyNamed("$ColumnLocation", term_211);
				sink.start(_M__sTextEmbed);
				Term term_760;
				{
					BufferSink buf_325 = sink.context().makeBuffer();
					buf_325.start(_M_STRING);
					buf_325.literal(1);
					buf_325.end();
					term_760 = buf_325.term();
				}
				sink.propertyNamed("$LineLocation", term_760);
				Term term_224;
				{
					BufferSink buf_694 = sink.context().makeBuffer();
					buf_694.start(_M_STRING);
					buf_694.literal(38);
					buf_694.end();
					term_224 = buf_694.term();
				}
				sink.propertyNamed("$ColumnLocation", term_224);
				sink.start(_M_AsText);
				sink.copy(sub_217.ref());
				sink.end();
				sink.end();
				Term term_366;
				{
					BufferSink buf_515 = sink.context().makeBuffer();
					buf_515.start(_M_STRING);
					buf_515.literal(1);
					buf_515.end();
					term_366 = buf_515.term();
				}
				sink.propertyNamed("$LineLocation", term_366);
				Term term_595;
				{
					BufferSink buf_691 = sink.context().makeBuffer();
					buf_691.start(_M_STRING);
					buf_691.literal(39);
					buf_691.end();
					term_595 = buf_691.term();
				}
				sink.propertyNamed("$ColumnLocation", term_595);
				sink.start(_M__sTextCons);
				Term term_564;
				{
					BufferSink buf_225 = sink.context().makeBuffer();
					buf_225.start(_M_STRING);
					buf_225.literal(1);
					buf_225.end();
					term_564 = buf_225.term();
				}
				sink.propertyNamed("$LineLocation", term_564);
				Term term_1075;
				{
					BufferSink buf_582 = sink.context().makeBuffer();
					buf_582.start(_M_STRING);
					buf_582.literal(39);
					buf_582.end();
					term_1075 = buf_582.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1075);
				sink.start(_M__sTextChars);
				sink.literal(", 1, depth + 1");
				sink.end();
				Term term_368;
				{
					BufferSink buf_796 = sink.context().makeBuffer();
					buf_796.start(_M_STRING);
					buf_796.literal(1);
					buf_796.end();
					term_368 = buf_796.term();
				}
				sink.propertyNamed("$LineLocation", term_368);
				Term term_428;
				{
					BufferSink buf_569 = sink.context().makeBuffer();
					buf_569.start(_M_STRING);
					buf_569.literal(46);
					buf_569.end();
					term_428 = buf_569.term();
				}
				sink.propertyNamed("$ColumnLocation", term_428);
				sink.start(_M__sTextCons);
				Term term_613;
				{
					BufferSink buf_341 = sink.context().makeBuffer();
					buf_341.start(_M_STRING);
					buf_341.literal(1);
					buf_341.end();
					term_613 = buf_341.term();
				}
				sink.propertyNamed("$LineLocation", term_613);
				Term term_593;
				{
					BufferSink buf_429 = sink.context().makeBuffer();
					buf_429.start(_M_STRING);
					buf_429.literal(46);
					buf_429.end();
					term_593 = buf_429.term();
				}
				sink.propertyNamed("$ColumnLocation", term_593);
				sink.start(_M__sTextEmbed);
				Term term_329;
				{
					BufferSink buf_563 = sink.context().makeBuffer();
					buf_563.start(_M_STRING);
					buf_563.literal(1);
					buf_563.end();
					term_329 = buf_563.term();
				}
				sink.propertyNamed("$LineLocation", term_329);
				Term term_369;
				{
					BufferSink buf_310 = sink.context().makeBuffer();
					buf_310.start(_M_STRING);
					buf_310.literal(46);
					buf_310.end();
					term_369 = buf_310.term();
				}
				sink.propertyNamed("$ColumnLocation", term_369);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_155));
				sink.start(_M_CallFunctionArgs);
				sink.copy(term_589.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_483;
				{
					BufferSink buf_410 = sink.context().makeBuffer();
					buf_410.start(_M_STRING);
					buf_410.literal(1);
					buf_410.end();
					term_483 = buf_410.term();
				}
				sink.propertyNamed("$LineLocation", term_483);
				Term term_373;
				{
					BufferSink buf_981 = sink.context().makeBuffer();
					buf_981.start(_M_STRING);
					buf_981.literal(60);
					buf_981.end();
					term_373 = buf_981.term();
				}
				sink.propertyNamed("$ColumnLocation", term_373);
				sink.start(_M__sTextCons);
				Term term_743;
				{
					BufferSink buf_587 = sink.context().makeBuffer();
					buf_587.start(_M_STRING);
					buf_587.literal(1);
					buf_587.end();
					term_743 = buf_587.term();
				}
				sink.propertyNamed("$LineLocation", term_743);
				Term term_305;
				{
					BufferSink buf_502 = sink.context().makeBuffer();
					buf_502.start(_M_STRING);
					buf_502.literal(60);
					buf_502.end();
					term_305 = buf_502.term();
				}
				sink.propertyNamed("$ColumnLocation", term_305);
				sink.start(_M__sTextChars);
				sink.literal(");");
				sink.end();
				Term term_487;
				{
					BufferSink buf_753 = sink.context().makeBuffer();
					buf_753.start(_M_STRING);
					buf_753.literal(1);
					buf_753.end();
					term_487 = buf_753.term();
				}
				sink.propertyNamed("$LineLocation", term_487);
				Term term_643;
				{
					BufferSink buf_404 = sink.context().makeBuffer();
					buf_404.start(_M_STRING);
					buf_404.literal(89);
					buf_404.end();
					term_643 = buf_404.term();
				}
				sink.propertyNamed("$ColumnLocation", term_643);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_CallFunction, props_155, term_227, term_349, term_540, term_589);
	}

	final public static boolean _M_SendTail2(Sink sink, int shared, int depth, Term term_633)
	{
		if (depth < 2000)
		{
			label_46 :
			{
				if (term_633.descriptor() != _M_YES)
				{
					break label_46;
				}/*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_777;
				{
					BufferSink buf_424 = sink.context().makeBuffer();
					buf_424.start(_M_STRING);
					buf_424.literal(1);
					buf_424.end();
					term_777 = buf_424.term();
				}
				sink.propertyNamed("$LineLocation", term_777);
				Term term_747;
				{
					BufferSink buf_372 = sink.context().makeBuffer();
					buf_372.start(_M_STRING);
					buf_372.literal(1);
					buf_372.end();
					term_747 = buf_372.term();
				}
				sink.propertyNamed("$ColumnLocation", term_747);
				sink.start(_M__sTextCons);
				Term term_667;
				{
					BufferSink buf_474 = sink.context().makeBuffer();
					buf_474.start(_M_STRING);
					buf_474.literal(1);
					buf_474.end();
					term_667 = buf_474.term();
				}
				sink.propertyNamed("$LineLocation", term_667);
				Term term_489;
				{
					BufferSink buf_392 = sink.context().makeBuffer();
					buf_392.start(_M_STRING);
					buf_392.literal(1);
					buf_392.end();
					term_489 = buf_392.term();
				}
				sink.propertyNamed("$ColumnLocation", term_489);
				sink.start(_M__sTextChars);
				sink.literal("return ");
				sink.end();
				Term term_490;
				{
					BufferSink buf_894 = sink.context().makeBuffer();
					buf_894.start(_M_STRING);
					buf_894.literal(1);
					buf_894.end();
					term_490 = buf_894.term();
				}
				sink.propertyNamed("$LineLocation", term_490);
				Term term_422;
				{
					BufferSink buf_772 = sink.context().makeBuffer();
					buf_772.start(_M_STRING);
					buf_772.literal(2);
					buf_772.end();
					term_422 = buf_772.term();
				}
				sink.propertyNamed("$ColumnLocation", term_422);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_99 :
			{
				if (term_633.descriptor() != _M_NO)
				{
					break label_99;
				}/*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_376;
				{
					BufferSink buf_672 = sink.context().makeBuffer();
					buf_672.start(_M_STRING);
					buf_672.literal(1);
					buf_672.end();
					term_376 = buf_672.term();
				}
				sink.propertyNamed("$LineLocation", term_376);
				Term term_680;
				{
					BufferSink buf_666 = sink.context().makeBuffer();
					buf_666.start(_M_STRING);
					buf_666.literal(1);
					buf_666.end();
					term_680 = buf_666.term();
				}
				sink.propertyNamed("$ColumnLocation", term_680);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendTail2, term_633);
	}

	final public static boolean _M_SendTail(Sink sink, int shared, int depth, Term term_337)
	{
		if (depth < 2000)
		{
			label_55 :
			{
				if (term_337.descriptor() != _M_YES)
				{
					break label_55;
				}/*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_477;
				{
					BufferSink buf_394 = sink.context().makeBuffer();
					buf_394.start(_M_STRING);
					buf_394.literal(1);
					buf_394.end();
					term_477 = buf_394.term();
				}
				sink.propertyNamed("$LineLocation", term_477);
				Term term_307;
				{
					BufferSink buf_344 = sink.context().makeBuffer();
					buf_344.start(_M_STRING);
					buf_344.literal(1);
					buf_344.end();
					term_307 = buf_344.term();
				}
				sink.propertyNamed("$ColumnLocation", term_307);
				sink.start(_M__sTextCons);
				Term term_424;
				{
					BufferSink buf_595 = sink.context().makeBuffer();
					buf_595.start(_M_STRING);
					buf_595.literal(1);
					buf_595.end();
					term_424 = buf_595.term();
				}
				sink.propertyNamed("$LineLocation", term_424);
				Term term_502;
				{
					BufferSink buf_521 = sink.context().makeBuffer();
					buf_521.start(_M_STRING);
					buf_521.literal(1);
					buf_521.end();
					term_502 = buf_521.term();
				}
				sink.propertyNamed("$ColumnLocation", term_502);
				sink.start(_M__sTextChars);
				sink.literal("return true;");
				sink.end();
				Term term_478;
				{
					BufferSink buf_345 = sink.context().makeBuffer();
					buf_345.start(_M_STRING);
					buf_345.literal(1);
					buf_345.end();
					term_478 = buf_345.term();
				}
				sink.propertyNamed("$LineLocation", term_478);
				Term term_408;
				{
					BufferSink buf_139 = sink.context().makeBuffer();
					buf_139.start(_M_STRING);
					buf_139.literal(2);
					buf_139.end();
					term_408 = buf_139.term();
				}
				sink.propertyNamed("$ColumnLocation", term_408);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_173 :
			{
				if (term_337.descriptor() != _M_NO)
				{
					break label_173;
				}/*Contract*/
				sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendTail, term_337);
	}

	final public static boolean _M_SendFreshesKey2(Sink sink, int shared, int depth, Properties props_22, Term term_332, Term term_1248, Variable var_37, Term term_430)
	{
		if (depth < 2000)
		{
			label_82 :
			{
				Term value_21 = props_22 == null ? null : props_22.lookup("$sink");
				if (value_21 == null)
				{
					break label_82;
				}
				if (value_21.descriptor() != _M_TEXT)
				{
					break label_82;
				}
				Term sub_311 = value_21.sub(0).ref();
				/* #sink=sub */
				/* #varname=term */
				/* #key=term */
				/* #=term *//*Contract*/
				Variable var_85 = sink.context().makeVariable("var");
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1131;
				{
					BufferSink buf_312 = sink.context().makeBuffer();
					buf_312.start(_M_STRING);
					buf_312.literal(1);
					buf_312.end();
					term_1131 = buf_312.term();
				}
				sink.propertyNamed("$LineLocation", term_1131);
				Term term_306;
				{
					BufferSink buf_850 = sink.context().makeBuffer();
					buf_850.start(_M_STRING);
					buf_850.literal(1);
					buf_850.end();
					term_306 = buf_850.term();
				}
				sink.propertyNamed("$ColumnLocation", term_306);
				sink.start(_M__sTextCons);
				Term term_553;
				{
					BufferSink buf_540 = sink.context().makeBuffer();
					buf_540.start(_M_STRING);
					buf_540.literal(1);
					buf_540.end();
					term_553 = buf_540.term();
				}
				sink.propertyNamed("$LineLocation", term_553);
				Term term_400;
				{
					BufferSink buf_400 = sink.context().makeBuffer();
					buf_400.start(_M_STRING);
					buf_400.literal(1);
					buf_400.end();
					term_400 = buf_400.term();
				}
				sink.propertyNamed("$ColumnLocation", term_400);
				sink.start(_M__sTextChars);
				sink.literal("Variable ");
				sink.end();
				Term term_688;
				{
					BufferSink buf_256 = sink.context().makeBuffer();
					buf_256.start(_M_STRING);
					buf_256.literal(1);
					buf_256.end();
					term_688 = buf_256.term();
				}
				sink.propertyNamed("$LineLocation", term_688);
				Term term_653;
				{
					BufferSink buf_784 = sink.context().makeBuffer();
					buf_784.start(_M_STRING);
					buf_784.literal(2);
					buf_784.end();
					term_653 = buf_784.term();
				}
				sink.propertyNamed("$ColumnLocation", term_653);
				sink.start(_M__sTextCons);
				Term term_832;
				{
					BufferSink buf_200 = sink.context().makeBuffer();
					buf_200.start(_M_STRING);
					buf_200.literal(1);
					buf_200.end();
					term_832 = buf_200.term();
				}
				sink.propertyNamed("$LineLocation", term_832);
				Term term_834;
				{
					BufferSink buf_361 = sink.context().makeBuffer();
					buf_361.start(_M_STRING);
					buf_361.literal(2);
					buf_361.end();
					term_834 = buf_361.term();
				}
				sink.propertyNamed("$ColumnLocation", term_834);
				sink.start(_M__sTextEmbed);
				Term term_499;
				{
					BufferSink buf_616 = sink.context().makeBuffer();
					buf_616.start(_M_STRING);
					buf_616.literal(1);
					buf_616.end();
					term_499 = buf_616.term();
				}
				sink.propertyNamed("$LineLocation", term_499);
				Term term_828;
				{
					BufferSink buf_386 = sink.context().makeBuffer();
					buf_386.start(_M_STRING);
					buf_386.literal(2);
					buf_386.end();
					term_828 = buf_386.term();
				}
				sink.propertyNamed("$ColumnLocation", term_828);
				sink.start(_M_AsText);
				sink.use(var_85);
				sink.end();
				sink.end();
				Term term_579;
				{
					BufferSink buf_347 = sink.context().makeBuffer();
					buf_347.start(_M_STRING);
					buf_347.literal(1);
					buf_347.end();
					term_579 = buf_347.term();
				}
				sink.propertyNamed("$LineLocation", term_579);
				Term term_440;
				{
					BufferSink buf_482 = sink.context().makeBuffer();
					buf_482.start(_M_STRING);
					buf_482.literal(11);
					buf_482.end();
					term_440 = buf_482.term();
				}
				sink.propertyNamed("$ColumnLocation", term_440);
				sink.start(_M__sTextCons);
				Term term_493;
				{
					BufferSink buf_531 = sink.context().makeBuffer();
					buf_531.start(_M_STRING);
					buf_531.literal(1);
					buf_531.end();
					term_493 = buf_531.term();
				}
				sink.propertyNamed("$LineLocation", term_493);
				Term term_910;
				{
					BufferSink buf_608 = sink.context().makeBuffer();
					buf_608.start(_M_STRING);
					buf_608.literal(11);
					buf_608.end();
					term_910 = buf_608.term();
				}
				sink.propertyNamed("$ColumnLocation", term_910);
				sink.start(_M__sTextChars);
				sink.literal(" = ");
				sink.end();
				Term term_907;
				{
					BufferSink buf_388 = sink.context().makeBuffer();
					buf_388.start(_M_STRING);
					buf_388.literal(1);
					buf_388.end();
					term_907 = buf_388.term();
				}
				sink.propertyNamed("$LineLocation", term_907);
				Term term_672;
				{
					BufferSink buf_664 = sink.context().makeBuffer();
					buf_664.start(_M_STRING);
					buf_664.literal(16);
					buf_664.end();
					term_672 = buf_664.term();
				}
				sink.propertyNamed("$ColumnLocation", term_672);
				sink.start(_M__sTextCons);
				Term term_315;
				{
					BufferSink buf_449 = sink.context().makeBuffer();
					buf_449.start(_M_STRING);
					buf_449.literal(1);
					buf_449.end();
					term_315 = buf_449.term();
				}
				sink.propertyNamed("$LineLocation", term_315);
				Term term_685;
				{
					BufferSink buf_477 = sink.context().makeBuffer();
					buf_477.start(_M_STRING);
					buf_477.literal(16);
					buf_477.end();
					term_685 = buf_477.term();
				}
				sink.propertyNamed("$ColumnLocation", term_685);
				sink.start(_M__sTextEmbed);
				Term term_583;
				{
					BufferSink buf_576 = sink.context().makeBuffer();
					buf_576.start(_M_STRING);
					buf_576.literal(1);
					buf_576.end();
					term_583 = buf_576.term();
				}
				sink.propertyNamed("$LineLocation", term_583);
				Term term_536;
				{
					BufferSink buf_511 = sink.context().makeBuffer();
					buf_511.start(_M_STRING);
					buf_511.literal(16);
					buf_511.end();
					term_536 = buf_511.term();
				}
				sink.propertyNamed("$ColumnLocation", term_536);
				sink.start(_M_AsText);
				sink.copy(sub_311.ref());
				sink.end();
				sink.end();
				Term term_517;
				{
					BufferSink buf_613 = sink.context().makeBuffer();
					buf_613.start(_M_STRING);
					buf_613.literal(1);
					buf_613.end();
					term_517 = buf_613.term();
				}
				sink.propertyNamed("$LineLocation", term_517);
				Term term_600;
				{
					BufferSink buf_418 = sink.context().makeBuffer();
					buf_418.start(_M_STRING);
					buf_418.literal(19);
					buf_418.end();
					term_600 = buf_418.term();
				}
				sink.propertyNamed("$ColumnLocation", term_600);
				sink.start(_M__sTextCons);
				Term term_510;
				{
					BufferSink buf_173 = sink.context().makeBuffer();
					buf_173.start(_M_STRING);
					buf_173.literal(1);
					buf_173.end();
					term_510 = buf_173.term();
				}
				sink.propertyNamed("$LineLocation", term_510);
				Term term_637;
				{
					BufferSink buf_343 = sink.context().makeBuffer();
					buf_343.start(_M_STRING);
					buf_343.literal(19);
					buf_343.end();
					term_637 = buf_343.term();
				}
				sink.propertyNamed("$ColumnLocation", term_637);
				sink.start(_M__sTextChars);
				sink.literal(".context().makeVariable(\"");
				sink.end();
				Term term_463;
				{
					BufferSink buf_529 = sink.context().makeBuffer();
					buf_529.start(_M_STRING);
					buf_529.literal(1);
					buf_529.end();
					term_463 = buf_529.term();
				}
				sink.propertyNamed("$LineLocation", term_463);
				Term term_731;
				{
					BufferSink buf_657 = sink.context().makeBuffer();
					buf_657.start(_M_STRING);
					buf_657.literal(26);
					buf_657.end();
					term_731 = buf_657.term();
				}
				sink.propertyNamed("$ColumnLocation", term_731);
				sink.start(_M__sTextCons);
				Term term_986;
				{
					BufferSink buf_594 = sink.context().makeBuffer();
					buf_594.start(_M_STRING);
					buf_594.literal(1);
					buf_594.end();
					term_986 = buf_594.term();
				}
				sink.propertyNamed("$LineLocation", term_986);
				Term term_705;
				{
					BufferSink buf_320 = sink.context().makeBuffer();
					buf_320.start(_M_STRING);
					buf_320.literal(51);
					buf_320.end();
					term_705 = buf_320.term();
				}
				sink.propertyNamed("$ColumnLocation", term_705);
				sink.start(_M__sTextChars);
				sink.copy(term_332.ref());
				sink.end();
				Term term_662;
				{
					BufferSink buf_443 = sink.context().makeBuffer();
					buf_443.start(_M_STRING);
					buf_443.literal(1);
					buf_443.end();
					term_662 = buf_443.term();
				}
				sink.propertyNamed("$LineLocation", term_662);
				Term term_330;
				{
					BufferSink buf_403 = sink.context().makeBuffer();
					buf_403.start(_M_STRING);
					buf_403.literal(52);
					buf_403.end();
					term_330 = buf_403.term();
				}
				sink.propertyNamed("$ColumnLocation", term_330);
				sink.start(_M__sTextCons);
				Term term_678;
				{
					BufferSink buf_783 = sink.context().makeBuffer();
					buf_783.start(_M_STRING);
					buf_783.literal(1);
					buf_783.end();
					term_678 = buf_783.term();
				}
				sink.propertyNamed("$LineLocation", term_678);
				Term term_458;
				{
					BufferSink buf_782 = sink.context().makeBuffer();
					buf_782.start(_M_STRING);
					buf_782.literal(52);
					buf_782.end();
					term_458 = buf_782.term();
				}
				sink.propertyNamed("$ColumnLocation", term_458);
				sink.start(_M__sTextChars);
				sink.literal("\");");
				sink.end();
				Term term_748;
				{
					BufferSink buf_548 = sink.context().makeBuffer();
					buf_548.start(_M_STRING);
					buf_548.literal(1);
					buf_548.end();
					term_748 = buf_548.term();
				}
				sink.propertyNamed("$LineLocation", term_748);
				Term term_402;
				{
					BufferSink buf_246 = sink.context().makeBuffer();
					buf_246.start(_M_STRING);
					buf_246.literal(62);
					buf_246.end();
					term_402 = buf_246.term();
				}
				sink.propertyNamed("$ColumnLocation", term_402);
				sink.start(_M__sTextCons);
				Term term_641;
				{
					BufferSink buf_509 = sink.context().makeBuffer();
					buf_509.start(_M_STRING);
					buf_509.literal(1);
					buf_509.end();
					term_641 = buf_509.term();
				}
				sink.propertyNamed("$LineLocation", term_641);
				Term term_411;
				{
					BufferSink buf_309 = sink.context().makeBuffer();
					buf_309.start(_M_STRING);
					buf_309.literal(62);
					buf_309.end();
					term_411 = buf_309.term();
				}
				sink.propertyNamed("$ColumnLocation", term_411);
				sink.start(_M__sTextEmbed);
				Term term_820;
				{
					BufferSink buf_671 = sink.context().makeBuffer();
					buf_671.start(_M_STRING);
					buf_671.literal(1);
					buf_671.end();
					term_820 = buf_671.term();
				}
				sink.propertyNamed("$LineLocation", term_820);
				Term term_276;
				{
					BufferSink buf_799 = sink.context().makeBuffer();
					buf_799.start(_M_STRING);
					buf_799.literal(62);
					buf_799.end();
					term_276 = buf_799.term();
				}
				sink.propertyNamed("$ColumnLocation", term_276);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_22));
				Term term_343;
				{
					BufferSink buf_603 = sink.context().makeBuffer();
					buf_603.start(_M_FRESH);
					buf_603.end();
					term_343 = buf_603.term();
				}
				sink.propertyVariable(var_85, term_343);
				Term term_618;
				{
					BufferSink buf_786 = sink.context().makeBuffer();
					buf_786.start(_M_TEXT);
					buf_786.use(var_85);
					buf_786.end();
					term_618 = buf_786.term();
				}
				term_1248 = force(sink.context(), term_1248);
				Sink.property(sink, term_1248, term_618);
				Term term_759;
				{
					BufferSink buf_303 = sink.context().makeBuffer();
					buf_303.start(_M_OK);
					buf_303.end();
					term_759 = buf_303.term();
				}
				sink.substitute(term_430.ref(), new Variable[]
					{var_37}, new Term[]
					{term_759});
				sink.end();
				sink.end();
				Term term_526;
				{
					BufferSink buf_224 = sink.context().makeBuffer();
					buf_224.start(_M_STRING);
					buf_224.literal(1);
					buf_224.end();
					term_526 = buf_224.term();
				}
				sink.propertyNamed("$LineLocation", term_526);
				Term term_706;
				{
					BufferSink buf_368 = sink.context().makeBuffer();
					buf_368.start(_M_STRING);
					buf_368.literal(65);
					buf_368.end();
					term_706 = buf_368.term();
				}
				sink.propertyNamed("$ColumnLocation", term_706);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendFreshesKey2, props_22, term_332, term_1248, var_37, term_430);
	}

	final public static boolean _M_SendFreshesKey(Sink sink, int shared, int depth, Properties props_37, Term term_584, Variable var_39, Term term_327)
	{
		if (depth < 2000)
		{
			label_90 :
			{
				if (term_584.descriptor() != _M_STRING)
				{
					break label_90;
				}
				Term sub_237 = term_584.sub(0).ref();
				/* #varname=sub */
				/* #=term *//*Contract*/sink.properties(safeRef(props_37));
				sink.start(_M_SendFreshesKey2);
				sink.copy(sub_237.ref());
				sink.start(_M__s);
				sink.start(_M_Builtin_sColon);
				sink.end();
				sink.literal("$var$");
				sink.copy(sub_237.ref());
				sink.end();
				Variable var_51 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_51});
				VariableUse use_17 = sink.context().makeVariableUse(var_51);
				sink.substitute(term_327.ref(), new Variable[]
					{var_39}, new Term[]
					{use_17});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendFreshesKey, props_37, term_584, var_39, term_327);
	}

	final public static boolean _M_SendFreshesKeys(Sink sink, int shared, int depth, Properties props_31, Term term_429, Term term_655, Term term_455)
	{
		if (depth < 2000)
		{
			label_102 :
			{
				if (term_429.descriptor() != _M_OK)
				{
					break label_102;
				}
				if (term_655.descriptor() != _M__sNil)
				{
					break label_102;
				}
				/* #freeTerm=term *//*Contract*/sink.properties(safeRef(props_31));
				sink.start(_M_SendFreeTerm);
				sink.copy(term_455.ref());
				sink.end();
				return true;
			}
			label_40 :
			{
				if (term_429.descriptor() != _M_OK)
				{
					break label_40;
				}
				if (term_655.descriptor() != _M__sCons)
				{
					break label_40;
				}
				Term sub_167 = term_655.sub(0).ref();
				/* #key=sub */Term sub_214 = term_655.sub(1).ref();
				/* #keys=sub */
				/* #freeTerm=term *//*Contract*/sink.properties(safeRef(props_31));
				sink.start(_M_SendFreshesKey);
				sink.start(_M__s);
				sink.properties(safeRef(props_31));
				sink.start(_M_Builtin_sGet);
				sink.end();
				sink.copy(sub_167.ref());
				sink.end();
				Variable var_60 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_60});
				sink.start(_M_SendFreshesKeys);
				sink.use(var_60);
				sink.copy(sub_214.ref());
				sink.copy(term_455.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendFreshesKeys, props_31, term_429, term_655, term_455);
	}

	final public static boolean _M_SendFreshes(Sink sink, int shared, int depth, Properties props_2, Term term_614, Term term_453)
	{
		if (depth < 2000)
		{
			label_175 :
			{
				if (term_614.descriptor() != _M_NOENTRY)
				{
					break label_175;
				}
				/* #freeTerm=term *//*Contract*/sink.properties(safeRef(props_2));
				sink.start(_M_SendFreeTerm);
				sink.copy(term_453.ref());
				sink.end();
				return true;
			}
			label_20 :
			{
				if (term_614.descriptor() != _M_STRINGS)
				{
					break label_20;
				}
				Term sub_213 = term_614.sub(0).ref();
				/* #keys=sub */
				/* #freeTerm=term *//*Contract*/sink.properties(safeRef(props_2));
				sink.start(_M_SendFreshesKeys);
				sink.start(_M_OK);
				sink.end();
				sink.copy(sub_213.ref());
				sink.copy(term_453.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendFreshes, props_2, term_614, term_453);
	}

	final public static boolean _M_SendContraction(Sink sink, int shared, int depth, Properties props_24, Term term_449, Term term_542)
	{
		if (depth < 2000)
		{
			label_14 :
			{
				if (term_449.descriptor() != _M_OK)
				{
					break label_14;
				}
				/* #freeTerm=term *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextEmbed);
				sink.start(_M_AsText);
				sink.start(_M_Text_Comment);
				sink.literal("Contract");
				sink.end();
				sink.end();
				sink.end();
				Term term_552;
				{
					BufferSink buf_830 = sink.context().makeBuffer();
					buf_830.start(_M_STRING);
					buf_830.literal(1);
					buf_830.end();
					term_552 = buf_830.term();
				}
				sink.propertyNamed("$LineLocation", term_552);
				Term term_466;
				{
					BufferSink buf_688 = sink.context().makeBuffer();
					buf_688.start(_M_STRING);
					buf_688.literal(1);
					buf_688.end();
					term_466 = buf_688.term();
				}
				sink.propertyNamed("$ColumnLocation", term_466);
				sink.start(_M__sTextCons);
				Term term_726;
				{
					BufferSink buf_464 = sink.context().makeBuffer();
					buf_464.start(_M_STRING);
					buf_464.literal(1);
					buf_464.end();
					term_726 = buf_464.term();
				}
				sink.propertyNamed("$LineLocation", term_726);
				Term term_486;
				{
					BufferSink buf_469 = sink.context().makeBuffer();
					buf_469.start(_M_STRING);
					buf_469.literal(1);
					buf_469.end();
					term_486 = buf_469.term();
				}
				sink.propertyNamed("$ColumnLocation", term_486);
				sink.start(_M__sTextEmbed);
				Term term_380;
				{
					BufferSink buf_286 = sink.context().makeBuffer();
					buf_286.start(_M_STRING);
					buf_286.literal(1);
					buf_286.end();
					term_380 = buf_286.term();
				}
				sink.propertyNamed("$LineLocation", term_380);
				Term term_484;
				{
					BufferSink buf_306 = sink.context().makeBuffer();
					buf_306.start(_M_STRING);
					buf_306.literal(1);
					buf_306.end();
					term_484 = buf_306.term();
				}
				sink.propertyNamed("$ColumnLocation", term_484);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_24));
				sink.start(_M_SendFreshes);
				sink.start(_M__s);
				sink.start(_M_Builtin_sGet);
				sink.end();
				sink.literal("$Freshes");
				sink.start(_M_NOENTRY);
				sink.end();
				sink.end();
				sink.copy(term_542.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_709;
				{
					BufferSink buf_461 = sink.context().makeBuffer();
					buf_461.start(_M_STRING);
					buf_461.literal(1);
					buf_461.end();
					term_709 = buf_461.term();
				}
				sink.propertyNamed("$LineLocation", term_709);
				Term term_649;
				{
					BufferSink buf_570 = sink.context().makeBuffer();
					buf_570.start(_M_STRING);
					buf_570.literal(27);
					buf_570.end();
					term_649 = buf_570.term();
				}
				sink.propertyNamed("$ColumnLocation", term_649);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendContraction, props_24, term_449, term_542);
	}

	final public static boolean _M_SendMatchNextBinder(Sink sink, int shared, int depth, Properties props_52, Term term_274, Term term_632, Term term_390, Term term_523, Term term_1028, Variable var_106, Term term_594)
	{
		if (depth < 2000)
		{
			label_42 :
			{
				if (term_274.descriptor() != _M_Crsx_xnextBinder_xA2)
				{
					break label_42;
				}
				Term sub_117 = term_274.sub(0).ref();
				Term sub_135 = term_274.sub(1).ref();
				/* #freeTerm=sub */
				/* #parent=term */
				/* #term=term */
				/* #termpos=term */
				/* #binderpos=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_52));
				sink.start(_M_SendMatchFreeTerm);
				sink.copy(sub_135.ref());
				sink.copy(term_390.ref());
				Variable var_75 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_75});
				VariableUse use_163 = sink.context().makeVariableUse(var_75);
				sink.substitute(term_594.ref(), new Variable[]
					{var_106}, new Term[]
					{use_163});
				sink.end();
				return true;
			}
			label_29 :
			{
				if (term_274.descriptor() != _M_Crsx_xnextBinder_xA1)
				{
					break label_29;
				}
				Term sub_270 = term_274.sub(0).ref();
				/* #binder=sub */Term sub_118 = term_274.sub(1).ref();
				/* #nextBinder=sub */
				if (term_632.descriptor() != _M_NONE)
				{
					break label_29;
				}
				/* #term=term */
				/* #termpos=term */
				/* #binderpos=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_52));
				sink.start(_M_SendMatchNextBinder);
				sink.copy(sub_118.ref());
				sink.start(_M_NONE);
				sink.end();
				sink.copy(term_390.ref());
				sink.copy(term_523.ref());
				sink.start(_M_NumberPlus);
				sink.copy(term_1028.ref());
				sink.literal(1);
				sink.end();
				Variable var_110 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_110});
				VariableUse use_84 = sink.context().makeVariableUse(var_110);
				sink.substitute(term_594.ref(), new Variable[]
					{var_106}, new Term[]
					{use_84});
				sink.end();
				return true;
			}
			label_21 :
			{
				Term value_31 = props_52 == null ? null : props_52.lookup("$binders");
				if (value_31 == null)
				{
					break label_21;
				}
				if (value_31.descriptor() != _M_TEXTS)
				{
					break label_21;
				}
				Term sub_148 = value_31.sub(0).ref();
				/* #binders=sub */
				if (term_274.descriptor() != _M_Crsx_xnextBinder_xA1)
				{
					break label_21;
				}
				Term sub_253 = term_274.sub(0).ref();
				/* #binder=sub */Term sub_44 = term_274.sub(1).ref();
				/* #nextBinder=sub */
				if (term_632.descriptor() != _M_SOME)
				{
					break label_21;
				}
				Term sub_198 = term_632.sub(0).ref();
				/* #parent=sub */
				/* #term=term */
				/* #termpos=term */
				/* #binderpos=term */
				/* #=term *//*Contract*/
				Variable var_79 = sink.context().makeVariable("binder");
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_962;
				{
					BufferSink buf_872 = sink.context().makeBuffer();
					buf_872.start(_M_STRING);
					buf_872.literal(1);
					buf_872.end();
					term_962 = buf_872.term();
				}
				sink.propertyNamed("$LineLocation", term_962);
				Term term_561;
				{
					BufferSink buf_649 = sink.context().makeBuffer();
					buf_649.start(_M_STRING);
					buf_649.literal(1);
					buf_649.end();
					term_561 = buf_649.term();
				}
				sink.propertyNamed("$ColumnLocation", term_561);
				sink.start(_M__sTextCons);
				Term term_311;
				{
					BufferSink buf_667 = sink.context().makeBuffer();
					buf_667.start(_M_STRING);
					buf_667.literal(1);
					buf_667.end();
					term_311 = buf_667.term();
				}
				sink.propertyNamed("$LineLocation", term_311);
				Term term_744;
				{
					BufferSink buf_501 = sink.context().makeBuffer();
					buf_501.start(_M_STRING);
					buf_501.literal(1);
					buf_501.end();
					term_744 = buf_501.term();
				}
				sink.propertyNamed("$ColumnLocation", term_744);
				sink.start(_M__sTextChars);
				sink.literal("Variable ");
				sink.end();
				Term term_446;
				{
					BufferSink buf_599 = sink.context().makeBuffer();
					buf_599.start(_M_STRING);
					buf_599.literal(2);
					buf_599.end();
					term_446 = buf_599.term();
				}
				sink.propertyNamed("$LineLocation", term_446);
				Term term_501;
				{
					BufferSink buf_998 = sink.context().makeBuffer();
					buf_998.start(_M_STRING);
					buf_998.literal(1);
					buf_998.end();
					term_501 = buf_998.term();
				}
				sink.propertyNamed("$ColumnLocation", term_501);
				sink.start(_M__sTextCons);
				Term term_433;
				{
					BufferSink buf_149 = sink.context().makeBuffer();
					buf_149.start(_M_STRING);
					buf_149.literal(2);
					buf_149.end();
					term_433 = buf_149.term();
				}
				sink.propertyNamed("$LineLocation", term_433);
				Term term_545;
				{
					BufferSink buf_733 = sink.context().makeBuffer();
					buf_733.start(_M_STRING);
					buf_733.literal(1);
					buf_733.end();
					term_545 = buf_733.term();
				}
				sink.propertyNamed("$ColumnLocation", term_545);
				sink.start(_M__sTextEmbed);
				Term term_622;
				{
					BufferSink buf_406 = sink.context().makeBuffer();
					buf_406.start(_M_STRING);
					buf_406.literal(2);
					buf_406.end();
					term_622 = buf_406.term();
				}
				sink.propertyNamed("$LineLocation", term_622);
				Term term_582;
				{
					BufferSink buf_606 = sink.context().makeBuffer();
					buf_606.start(_M_STRING);
					buf_606.literal(1);
					buf_606.end();
					term_582 = buf_606.term();
				}
				sink.propertyNamed("$ColumnLocation", term_582);
				sink.start(_M_AsText);
				sink.use(var_79);
				sink.end();
				sink.end();
				Term term_647;
				{
					BufferSink buf_248 = sink.context().makeBuffer();
					buf_248.start(_M_STRING);
					buf_248.literal(2);
					buf_248.end();
					term_647 = buf_248.term();
				}
				sink.propertyNamed("$LineLocation", term_647);
				Term term_979;
				{
					BufferSink buf_322 = sink.context().makeBuffer();
					buf_322.start(_M_STRING);
					buf_322.literal(10);
					buf_322.end();
					term_979 = buf_322.term();
				}
				sink.propertyNamed("$ColumnLocation", term_979);
				sink.start(_M__sTextCons);
				Term term_457;
				{
					BufferSink buf_617 = sink.context().makeBuffer();
					buf_617.start(_M_STRING);
					buf_617.literal(2);
					buf_617.end();
					term_457 = buf_617.term();
				}
				sink.propertyNamed("$LineLocation", term_457);
				Term term_844;
				{
					BufferSink buf_942 = sink.context().makeBuffer();
					buf_942.start(_M_STRING);
					buf_942.literal(10);
					buf_942.end();
					term_844 = buf_942.term();
				}
				sink.propertyNamed("$ColumnLocation", term_844);
				sink.start(_M__sTextChars);
				sink.literal(" = ");
				sink.end();
				Term term_876;
				{
					BufferSink buf_523 = sink.context().makeBuffer();
					buf_523.start(_M_STRING);
					buf_523.literal(2);
					buf_523.end();
					term_876 = buf_523.term();
				}
				sink.propertyNamed("$LineLocation", term_876);
				Term term_340;
				{
					BufferSink buf_773 = sink.context().makeBuffer();
					buf_773.start(_M_STRING);
					buf_773.literal(18);
					buf_773.end();
					term_340 = buf_773.term();
				}
				sink.propertyNamed("$ColumnLocation", term_340);
				sink.start(_M__sTextCons);
				Term term_474;
				{
					BufferSink buf_407 = sink.context().makeBuffer();
					buf_407.start(_M_STRING);
					buf_407.literal(2);
					buf_407.end();
					term_474 = buf_407.term();
				}
				sink.propertyNamed("$LineLocation", term_474);
				Term term_650;
				{
					BufferSink buf_787 = sink.context().makeBuffer();
					buf_787.start(_M_STRING);
					buf_787.literal(18);
					buf_787.end();
					term_650 = buf_787.term();
				}
				sink.propertyNamed("$ColumnLocation", term_650);
				sink.start(_M__sTextEmbed);
				Term term_308;
				{
					BufferSink buf_499 = sink.context().makeBuffer();
					buf_499.start(_M_STRING);
					buf_499.literal(2);
					buf_499.end();
					term_308 = buf_499.term();
				}
				sink.propertyNamed("$LineLocation", term_308);
				Term term_764;
				{
					BufferSink buf_397 = sink.context().makeBuffer();
					buf_397.start(_M_STRING);
					buf_397.literal(18);
					buf_397.end();
					term_764 = buf_397.term();
				}
				sink.propertyNamed("$ColumnLocation", term_764);
				sink.start(_M_AsText);
				sink.copy(sub_198.ref());
				sink.end();
				sink.end();
				Term term_652;
				{
					BufferSink buf_366 = sink.context().makeBuffer();
					buf_366.start(_M_STRING);
					buf_366.literal(2);
					buf_366.end();
					term_652 = buf_366.term();
				}
				sink.propertyNamed("$LineLocation", term_652);
				Term term_943;
				{
					BufferSink buf_736 = sink.context().makeBuffer();
					buf_736.start(_M_STRING);
					buf_736.literal(21);
					buf_736.end();
					term_943 = buf_736.term();
				}
				sink.propertyNamed("$ColumnLocation", term_943);
				sink.start(_M__sTextCons);
				Term term_858;
				{
					BufferSink buf_413 = sink.context().makeBuffer();
					buf_413.start(_M_STRING);
					buf_413.literal(2);
					buf_413.end();
					term_858 = buf_413.term();
				}
				sink.propertyNamed("$LineLocation", term_858);
				Term term_786;
				{
					BufferSink buf_577 = sink.context().makeBuffer();
					buf_577.start(_M_STRING);
					buf_577.literal(21);
					buf_577.end();
					term_786 = buf_577.term();
				}
				sink.propertyNamed("$ColumnLocation", term_786);
				sink.start(_M__sTextChars);
				sink.literal(".binders(");
				sink.end();
				Term term_503;
				{
					BufferSink buf_484 = sink.context().makeBuffer();
					buf_484.start(_M_STRING);
					buf_484.literal(2);
					buf_484.end();
					term_503 = buf_484.term();
				}
				sink.propertyNamed("$LineLocation", term_503);
				Term term_426;
				{
					BufferSink buf_432 = sink.context().makeBuffer();
					buf_432.start(_M_STRING);
					buf_432.literal(30);
					buf_432.end();
					term_426 = buf_432.term();
				}
				sink.propertyNamed("$ColumnLocation", term_426);
				sink.start(_M__sTextCons);
				Term term_539;
				{
					BufferSink buf_412 = sink.context().makeBuffer();
					buf_412.start(_M_STRING);
					buf_412.literal(2);
					buf_412.end();
					term_539 = buf_412.term();
				}
				sink.propertyNamed("$LineLocation", term_539);
				Term term_535;
				{
					BufferSink buf_337 = sink.context().makeBuffer();
					buf_337.start(_M_STRING);
					buf_337.literal(30);
					buf_337.end();
					term_535 = buf_337.term();
				}
				sink.propertyNamed("$ColumnLocation", term_535);
				sink.start(_M__sTextEmbed);
				Term term_222;
				{
					BufferSink buf_592 = sink.context().makeBuffer();
					buf_592.start(_M_STRING);
					buf_592.literal(2);
					buf_592.end();
					term_222 = buf_592.term();
				}
				sink.propertyNamed("$LineLocation", term_222);
				Term term_611;
				{
					BufferSink buf_444 = sink.context().makeBuffer();
					buf_444.start(_M_STRING);
					buf_444.literal(30);
					buf_444.end();
					term_611 = buf_444.term();
				}
				sink.propertyNamed("$ColumnLocation", term_611);
				sink.start(_M_AsText);
				sink.start(_M_NumberToText);
				sink.copy(term_523.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_260;
				{
					BufferSink buf_863 = sink.context().makeBuffer();
					buf_863.start(_M_STRING);
					buf_863.literal(2);
					buf_863.end();
					term_260 = buf_863.term();
				}
				sink.propertyNamed("$LineLocation", term_260);
				Term term_978;
				{
					BufferSink buf_430 = sink.context().makeBuffer();
					buf_430.start(_M_STRING);
					buf_430.literal(39);
					buf_430.end();
					term_978 = buf_430.term();
				}
				sink.propertyNamed("$ColumnLocation", term_978);
				sink.start(_M__sTextCons);
				Term term_699;
				{
					BufferSink buf_338 = sink.context().makeBuffer();
					buf_338.start(_M_STRING);
					buf_338.literal(2);
					buf_338.end();
					term_699 = buf_338.term();
				}
				sink.propertyNamed("$LineLocation", term_699);
				Term term_889;
				{
					BufferSink buf_725 = sink.context().makeBuffer();
					buf_725.start(_M_STRING);
					buf_725.literal(39);
					buf_725.end();
					term_889 = buf_725.term();
				}
				sink.propertyNamed("$ColumnLocation", term_889);
				sink.start(_M__sTextChars);
				sink.literal(")[");
				sink.end();
				Term term_624;
				{
					BufferSink buf_910 = sink.context().makeBuffer();
					buf_910.start(_M_STRING);
					buf_910.literal(2);
					buf_910.end();
					term_624 = buf_910.term();
				}
				sink.propertyNamed("$LineLocation", term_624);
				Term term_468;
				{
					BufferSink buf_542 = sink.context().makeBuffer();
					buf_542.start(_M_STRING);
					buf_542.literal(63);
					buf_542.end();
					term_468 = buf_542.term();
				}
				sink.propertyNamed("$ColumnLocation", term_468);
				sink.start(_M__sTextCons);
				Term term_610;
				{
					BufferSink buf_709 = sink.context().makeBuffer();
					buf_709.start(_M_STRING);
					buf_709.literal(2);
					buf_709.end();
					term_610 = buf_709.term();
				}
				sink.propertyNamed("$LineLocation", term_610);
				Term term_292;
				{
					BufferSink buf_643 = sink.context().makeBuffer();
					buf_643.start(_M_STRING);
					buf_643.literal(63);
					buf_643.end();
					term_292 = buf_643.term();
				}
				sink.propertyNamed("$ColumnLocation", term_292);
				sink.start(_M__sTextEmbed);
				Term term_441;
				{
					BufferSink buf_415 = sink.context().makeBuffer();
					buf_415.start(_M_STRING);
					buf_415.literal(2);
					buf_415.end();
					term_441 = buf_415.term();
				}
				sink.propertyNamed("$LineLocation", term_441);
				Term term_1287;
				{
					BufferSink buf_1093 = sink.context().makeBuffer();
					buf_1093.start(_M_STRING);
					buf_1093.literal(63);
					buf_1093.end();
					term_1287 = buf_1093.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1287);
				sink.start(_M_AsText);
				sink.start(_M_NumberToText);
				sink.copy(term_1028.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_821;
				{
					BufferSink buf_1009 = sink.context().makeBuffer();
					buf_1009.start(_M_STRING);
					buf_1009.literal(2);
					buf_1009.end();
					term_821 = buf_1009.term();
				}
				sink.propertyNamed("$LineLocation", term_821);
				Term term_740;
				{
					BufferSink buf_426 = sink.context().makeBuffer();
					buf_426.start(_M_STRING);
					buf_426.literal(65);
					buf_426.end();
					term_740 = buf_426.term();
				}
				sink.propertyNamed("$ColumnLocation", term_740);
				sink.start(_M__sTextCons);
				Term term_775;
				{
					BufferSink buf_573 = sink.context().makeBuffer();
					buf_573.start(_M_STRING);
					buf_573.literal(2);
					buf_573.end();
					term_775 = buf_573.term();
				}
				sink.propertyNamed("$LineLocation", term_775);
				Term term_1288;
				{
					BufferSink buf_781 = sink.context().makeBuffer();
					buf_781.start(_M_STRING);
					buf_781.literal(65);
					buf_781.end();
					term_1288 = buf_781.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1288);
				sink.start(_M__sTextChars);
				sink.literal("];");
				sink.end();
				Term term_660;
				{
					BufferSink buf_323 = sink.context().makeBuffer();
					buf_323.start(_M_STRING);
					buf_323.literal(2);
					buf_323.end();
					term_660 = buf_323.term();
				}
				sink.propertyNamed("$LineLocation", term_660);
				Term term_783;
				{
					BufferSink buf_439 = sink.context().makeBuffer();
					buf_439.start(_M_STRING);
					buf_439.literal(91);
					buf_439.end();
					term_783 = buf_439.term();
				}
				sink.propertyNamed("$ColumnLocation", term_783);
				sink.start(_M__sTextCons);
				Term term_815;
				{
					BufferSink buf_840 = sink.context().makeBuffer();
					buf_840.start(_M_STRING);
					buf_840.literal(2);
					buf_840.end();
					term_815 = buf_840.term();
				}
				sink.propertyNamed("$LineLocation", term_815);
				Term term_905;
				{
					BufferSink buf_492 = sink.context().makeBuffer();
					buf_492.start(_M_STRING);
					buf_492.literal(91);
					buf_492.end();
					term_905 = buf_492.term();
				}
				sink.propertyNamed("$ColumnLocation", term_905);
				sink.start(_M__sTextEmbed);
				Term term_658;
				{
					BufferSink buf_517 = sink.context().makeBuffer();
					buf_517.start(_M_STRING);
					buf_517.literal(2);
					buf_517.end();
					term_658 = buf_517.term();
				}
				sink.propertyNamed("$LineLocation", term_658);
				Term term_771;
				{
					BufferSink buf_810 = sink.context().makeBuffer();
					buf_810.start(_M_STRING);
					buf_810.literal(91);
					buf_810.end();
					term_771 = buf_810.term();
				}
				sink.propertyNamed("$ColumnLocation", term_771);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_52));
				Term term_869;
				{
					BufferSink buf_421 = sink.context().makeBuffer();
					buf_421.start(_M_TEXTS);
					buf_421.start(_M_Concat);
					buf_421.start(_M__sCons);
					buf_421.use(var_79);
					buf_421.start(_M__sNil);
					buf_421.end();
					buf_421.end();
					buf_421.copy(sub_148.ref());
					buf_421.end();
					buf_421.end();
					term_869 = buf_421.term();
				}
				sink.propertyNamed("$binders", term_869);
				sink.start(_M_SendMatchNextBinder);
				sink.copy(sub_44.ref());
				sink.start(_M_SOME);
				sink.copy(sub_198.ref());
				sink.end();
				sink.copy(term_390.ref());
				sink.copy(term_523.ref());
				sink.start(_M_NumberPlus);
				sink.copy(term_1028.ref());
				sink.literal(1);
				sink.end();
				Variable var_3 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_3});
				VariableUse use_90 = sink.context().makeVariableUse(var_3);
				sink.substitute(term_594.ref(), new Variable[]
					{var_106}, new Term[]
					{use_90});
				sink.end();
				sink.end();
				sink.end();
				Term term_969;
				{
					BufferSink buf_959 = sink.context().makeBuffer();
					buf_959.start(_M_STRING);
					buf_959.literal(2);
					buf_959.end();
					term_969 = buf_959.term();
				}
				sink.propertyNamed("$LineLocation", term_969);
				Term term_432;
				{
					BufferSink buf_452 = sink.context().makeBuffer();
					buf_452.start(_M_STRING);
					buf_452.literal(93);
					buf_452.end();
					term_432 = buf_452.term();
				}
				sink.propertyNamed("$ColumnLocation", term_432);
				sink.start(_M__sTextCons);
				Term term_557;
				{
					BufferSink buf_533 = sink.context().makeBuffer();
					buf_533.start(_M_STRING);
					buf_533.literal(2);
					buf_533.end();
					term_557 = buf_533.term();
				}
				sink.propertyNamed("$LineLocation", term_557);
				Term term_745;
				{
					BufferSink buf_791 = sink.context().makeBuffer();
					buf_791.start(_M_STRING);
					buf_791.literal(93);
					buf_791.end();
					term_745 = buf_791.term();
				}
				sink.propertyNamed("$ColumnLocation", term_745);
				sink.start(_M__sTextChars);
				sink.literal(" ");
				sink.end();
				Term term_597;
				{
					BufferSink buf_549 = sink.context().makeBuffer();
					buf_549.start(_M_STRING);
					buf_549.literal(3);
					buf_549.end();
					term_597 = buf_549.term();
				}
				sink.propertyNamed("$LineLocation", term_597);
				Term term_922;
				{
					BufferSink buf_717 = sink.context().makeBuffer();
					buf_717.start(_M_STRING);
					buf_717.literal(157);
					buf_717.end();
					term_922 = buf_717.term();
				}
				sink.propertyNamed("$ColumnLocation", term_922);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendMatchNextBinder, props_52, term_274, term_632, term_390, term_523, term_1028, var_106, term_594);
	}

	final public static boolean _M_SendMatchSubTerm(Sink sink, int shared, int depth, Properties props_38, Term term_1079, Term term_735, Term term_508, Variable var_10, Term term_620)
	{
		if (depth < 2000)
		{
			label_103 :
			{
				/* #sub=term */
				/* #parent=term */
				/* #subpos=term */
				/* #=term *//*Contract*/
				Variable var_64 = sink.context().makeVariable("sub");
				sink.start(_M__sTextCons);
				sink.start(_M__sTextChars);
				sink.literal("Term ");
				sink.end();
				Term term_1631;
				{
					BufferSink buf_379 = sink.context().makeBuffer();
					buf_379.start(_M_STRING);
					buf_379.literal(1);
					buf_379.end();
					term_1631 = buf_379.term();
				}
				sink.propertyNamed("$LineLocation", term_1631);
				Term term_612;
				{
					BufferSink buf_556 = sink.context().makeBuffer();
					buf_556.start(_M_STRING);
					buf_556.literal(1);
					buf_556.end();
					term_612 = buf_556.term();
				}
				sink.propertyNamed("$ColumnLocation", term_612);
				sink.start(_M__sTextCons);
				Term term_722;
				{
					BufferSink buf_581 = sink.context().makeBuffer();
					buf_581.start(_M_STRING);
					buf_581.literal(1);
					buf_581.end();
					term_722 = buf_581.term();
				}
				sink.propertyNamed("$LineLocation", term_722);
				Term term_586;
				{
					BufferSink buf_371 = sink.context().makeBuffer();
					buf_371.start(_M_STRING);
					buf_371.literal(1);
					buf_371.end();
					term_586 = buf_371.term();
				}
				sink.propertyNamed("$ColumnLocation", term_586);
				sink.start(_M__sTextEmbed);
				Term term_514;
				{
					BufferSink buf_834 = sink.context().makeBuffer();
					buf_834.start(_M_STRING);
					buf_834.literal(1);
					buf_834.end();
					term_514 = buf_834.term();
				}
				sink.propertyNamed("$LineLocation", term_514);
				Term term_659;
				{
					BufferSink buf_558 = sink.context().makeBuffer();
					buf_558.start(_M_STRING);
					buf_558.literal(1);
					buf_558.end();
					term_659 = buf_558.term();
				}
				sink.propertyNamed("$ColumnLocation", term_659);
				sink.start(_M_AsText);
				sink.use(var_64);
				sink.end();
				sink.end();
				Term term_769;
				{
					BufferSink buf_485 = sink.context().makeBuffer();
					buf_485.start(_M_STRING);
					buf_485.literal(1);
					buf_485.end();
					term_769 = buf_485.term();
				}
				sink.propertyNamed("$LineLocation", term_769);
				Term term_410;
				{
					BufferSink buf_465 = sink.context().makeBuffer();
					buf_465.start(_M_STRING);
					buf_465.literal(6);
					buf_465.end();
					term_410 = buf_465.term();
				}
				sink.propertyNamed("$ColumnLocation", term_410);
				sink.start(_M__sTextCons);
				Term term_639;
				{
					BufferSink buf_422 = sink.context().makeBuffer();
					buf_422.start(_M_STRING);
					buf_422.literal(1);
					buf_422.end();
					term_639 = buf_422.term();
				}
				sink.propertyNamed("$LineLocation", term_639);
				Term term_737;
				{
					BufferSink buf_490 = sink.context().makeBuffer();
					buf_490.start(_M_STRING);
					buf_490.literal(6);
					buf_490.end();
					term_737 = buf_490.term();
				}
				sink.propertyNamed("$ColumnLocation", term_737);
				sink.start(_M__sTextChars);
				sink.literal(" = ");
				sink.end();
				Term term_756;
				{
					BufferSink buf_851 = sink.context().makeBuffer();
					buf_851.start(_M_STRING);
					buf_851.literal(1);
					buf_851.end();
					term_756 = buf_851.term();
				}
				sink.propertyNamed("$LineLocation", term_756);
				Term term_628;
				{
					BufferSink buf_620 = sink.context().makeBuffer();
					buf_620.start(_M_STRING);
					buf_620.literal(11);
					buf_620.end();
					term_628 = buf_620.term();
				}
				sink.propertyNamed("$ColumnLocation", term_628);
				sink.start(_M__sTextCons);
				Term term_585;
				{
					BufferSink buf_769 = sink.context().makeBuffer();
					buf_769.start(_M_STRING);
					buf_769.literal(1);
					buf_769.end();
					term_585 = buf_769.term();
				}
				sink.propertyNamed("$LineLocation", term_585);
				Term term_809;
				{
					BufferSink buf_674 = sink.context().makeBuffer();
					buf_674.start(_M_STRING);
					buf_674.literal(11);
					buf_674.end();
					term_809 = buf_674.term();
				}
				sink.propertyNamed("$ColumnLocation", term_809);
				sink.start(_M__sTextEmbed);
				Term term_723;
				{
					BufferSink buf_703 = sink.context().makeBuffer();
					buf_703.start(_M_STRING);
					buf_703.literal(1);
					buf_703.end();
					term_723 = buf_703.term();
				}
				sink.propertyNamed("$LineLocation", term_723);
				Term term_796;
				{
					BufferSink buf_240 = sink.context().makeBuffer();
					buf_240.start(_M_STRING);
					buf_240.literal(11);
					buf_240.end();
					term_796 = buf_240.term();
				}
				sink.propertyNamed("$ColumnLocation", term_796);
				sink.start(_M_AsText);
				sink.copy(term_735.ref());
				sink.end();
				sink.end();
				Term term_692;
				{
					BufferSink buf_583 = sink.context().makeBuffer();
					buf_583.start(_M_STRING);
					buf_583.literal(1);
					buf_583.end();
					term_692 = buf_583.term();
				}
				sink.propertyNamed("$LineLocation", term_692);
				Term term_559;
				{
					BufferSink buf_560 = sink.context().makeBuffer();
					buf_560.start(_M_STRING);
					buf_560.literal(14);
					buf_560.end();
					term_559 = buf_560.term();
				}
				sink.propertyNamed("$ColumnLocation", term_559);
				sink.start(_M__sTextCons);
				Term term_548;
				{
					BufferSink buf_677 = sink.context().makeBuffer();
					buf_677.start(_M_STRING);
					buf_677.literal(1);
					buf_677.end();
					term_548 = buf_677.term();
				}
				sink.propertyNamed("$LineLocation", term_548);
				Term term_702;
				{
					BufferSink buf_835 = sink.context().makeBuffer();
					buf_835.start(_M_STRING);
					buf_835.literal(14);
					buf_835.end();
					term_702 = buf_835.term();
				}
				sink.propertyNamed("$ColumnLocation", term_702);
				sink.start(_M__sTextChars);
				sink.literal(".sub(");
				sink.end();
				Term term_1093;
				{
					BufferSink buf_561 = sink.context().makeBuffer();
					buf_561.start(_M_STRING);
					buf_561.literal(1);
					buf_561.end();
					term_1093 = buf_561.term();
				}
				sink.propertyNamed("$LineLocation", term_1093);
				Term term_567;
				{
					BufferSink buf_653 = sink.context().makeBuffer();
					buf_653.start(_M_STRING);
					buf_653.literal(23);
					buf_653.end();
					term_567 = buf_653.term();
				}
				sink.propertyNamed("$ColumnLocation", term_567);
				sink.start(_M__sTextCons);
				Term term_359;
				{
					BufferSink buf_589 = sink.context().makeBuffer();
					buf_589.start(_M_STRING);
					buf_589.literal(1);
					buf_589.end();
					term_359 = buf_589.term();
				}
				sink.propertyNamed("$LineLocation", term_359);
				Term term_754;
				{
					BufferSink buf_654 = sink.context().makeBuffer();
					buf_654.start(_M_STRING);
					buf_654.literal(23);
					buf_654.end();
					term_754 = buf_654.term();
				}
				sink.propertyNamed("$ColumnLocation", term_754);
				sink.start(_M__sTextEmbed);
				Term term_549;
				{
					BufferSink buf_601 = sink.context().makeBuffer();
					buf_601.start(_M_STRING);
					buf_601.literal(1);
					buf_601.end();
					term_549 = buf_601.term();
				}
				sink.propertyNamed("$LineLocation", term_549);
				Term term_1340;
				{
					BufferSink buf_445 = sink.context().makeBuffer();
					buf_445.start(_M_STRING);
					buf_445.literal(23);
					buf_445.end();
					term_1340 = buf_445.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1340);
				sink.start(_M_AsText);
				sink.start(_M_NumberToText);
				sink.copy(term_508.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_495;
				{
					BufferSink buf_448 = sink.context().makeBuffer();
					buf_448.start(_M_STRING);
					buf_448.literal(1);
					buf_448.end();
					term_495 = buf_448.term();
				}
				sink.propertyNamed("$LineLocation", term_495);
				Term term_836;
				{
					BufferSink buf_378 = sink.context().makeBuffer();
					buf_378.start(_M_STRING);
					buf_378.literal(28);
					buf_378.end();
					term_836 = buf_378.term();
				}
				sink.propertyNamed("$ColumnLocation", term_836);
				sink.start(_M__sTextCons);
				Term term_673;
				{
					BufferSink buf_518 = sink.context().makeBuffer();
					buf_518.start(_M_STRING);
					buf_518.literal(1);
					buf_518.end();
					term_673 = buf_518.term();
				}
				sink.propertyNamed("$LineLocation", term_673);
				Term term_546;
				{
					BufferSink buf_387 = sink.context().makeBuffer();
					buf_387.start(_M_STRING);
					buf_387.literal(28);
					buf_387.end();
					term_546 = buf_387.term();
				}
				sink.propertyNamed("$ColumnLocation", term_546);
				sink.start(_M__sTextChars);
				sink.literal(").ref();");
				sink.end();
				Term term_808;
				{
					BufferSink buf_311 = sink.context().makeBuffer();
					buf_311.start(_M_STRING);
					buf_311.literal(1);
					buf_311.end();
					term_808 = buf_311.term();
				}
				sink.propertyNamed("$LineLocation", term_808);
				Term term_569;
				{
					BufferSink buf_941 = sink.context().makeBuffer();
					buf_941.start(_M_STRING);
					buf_941.literal(51);
					buf_941.end();
					term_569 = buf_941.term();
				}
				sink.propertyNamed("$ColumnLocation", term_569);
				sink.start(_M__sTextCons);
				Term term_810;
				{
					BufferSink buf_481 = sink.context().makeBuffer();
					buf_481.start(_M_STRING);
					buf_481.literal(1);
					buf_481.end();
					term_810 = buf_481.term();
				}
				sink.propertyNamed("$LineLocation", term_810);
				Term term_470;
				{
					BufferSink buf_472 = sink.context().makeBuffer();
					buf_472.start(_M_STRING);
					buf_472.literal(51);
					buf_472.end();
					term_470 = buf_472.term();
				}
				sink.propertyNamed("$ColumnLocation", term_470);
				sink.start(_M__sTextEmbed);
				Term term_887;
				{
					BufferSink buf_446 = sink.context().makeBuffer();
					buf_446.start(_M_STRING);
					buf_446.literal(1);
					buf_446.end();
					term_887 = buf_446.term();
				}
				sink.propertyNamed("$LineLocation", term_887);
				Term term_623;
				{
					BufferSink buf_1262 = sink.context().makeBuffer();
					buf_1262.start(_M_STRING);
					buf_1262.literal(51);
					buf_1262.end();
					term_623 = buf_1262.term();
				}
				sink.propertyNamed("$ColumnLocation", term_623);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_38));
				sink.start(_M_SendMatchTerm);
				sink.copy(term_1079.ref());
				sink.start(_M_SOME);
				sink.copy(term_735.ref());
				sink.end();
				sink.use(var_64);
				sink.copy(term_508.ref());
				Variable var_132 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_132});
				VariableUse use_85 = sink.context().makeVariableUse(var_132);
				sink.substitute(term_620.ref(), new Variable[]
					{var_10}, new Term[]
					{use_85});
				sink.end();
				sink.end();
				sink.end();
				Term term_873;
				{
					BufferSink buf_473 = sink.context().makeBuffer();
					buf_473.start(_M_STRING);
					buf_473.literal(1);
					buf_473.end();
					term_873 = buf_473.term();
				}
				sink.propertyNamed("$LineLocation", term_873);
				Term term_765;
				{
					BufferSink buf_441 = sink.context().makeBuffer();
					buf_441.start(_M_STRING);
					buf_441.literal(59);
					buf_441.end();
					term_765 = buf_441.term();
				}
				sink.propertyNamed("$ColumnLocation", term_765);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendMatchSubTerm, props_38, term_1079, term_735, term_508, var_10, term_620);
	}

	final public static boolean _M_SendMatchSubTerms(Sink sink, int shared, int depth, Properties props_13, Term term_657, Term term_693, Term term_863, Term term_854, Variable var_162, Term term_713)
	{
		if (depth < 2000)
		{
			label_44 :
			{
				if (term_657.descriptor() != _M_OK)
				{
					break label_44;
				}
				if (term_693.descriptor() != _M__sNil)
				{
					break label_44;
				}
				/* #parent=term */
				/* #subpos=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_13));
				Term term_882;
				{
					BufferSink buf_559 = sink.context().makeBuffer();
					buf_559.start(_M_OK);
					buf_559.end();
					term_882 = buf_559.term();
				}
				sink.substitute(term_713.ref(), new Variable[]
					{var_162}, new Term[]
					{term_882});
				return true;
			}
			label_71 :
			{
				if (term_657.descriptor() != _M_OK)
				{
					break label_71;
				}
				if (term_693.descriptor() != _M__sCons)
				{
					break label_71;
				}
				Term sub_258 = term_693.sub(0).ref();
				if (sub_258.descriptor() != _M_Crsx_xterms_xS1)
				{
					break label_71;
				}
				Term sub_179 = sub_258.sub(0).ref();
				Term sub_157 = sub_258.sub(1).ref();
				/* #term=sub */Term sub_112 = term_693.sub(1).ref();
				/* #terms_S1*=sub */
				/* #parent=term */
				/* #subpos=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_13));
				sink.start(_M_SendMatchSubTerm);
				sink.copy(sub_157.ref());
				sink.copy(term_863.ref());
				sink.copy(term_854.ref());
				Variable var_119 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_119});
				sink.start(_M_SendMatchSubTerms);
				sink.use(var_119);
				sink.copy(sub_112.ref());
				sink.copy(term_863.ref());
				sink.start(_M_NumberPlus);
				sink.copy(term_854.ref());
				sink.literal(1);
				sink.end();
				Variable var_103 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_103});
				VariableUse use_3 = sink.context().makeVariableUse(var_103);
				sink.substitute(term_713.ref(), new Variable[]
					{var_162}, new Term[]
					{use_3});
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendMatchSubTerms, props_13, term_657, term_693, term_863, term_854, var_162, term_713);
	}

	final public static boolean _M_SendMatchMaybeArguments(Sink sink, int shared, int depth, Properties props_26, Term term_741, Term term_959, Term term_866, Variable var_30, Term term_598)
	{
		if (depth < 2000)
		{
			label_74 :
			{
				if (term_741.descriptor() != _M_OK)
				{
					break label_74;
				}
				if (term_959.descriptor() != _M__sNil)
				{
					break label_74;
				}
				/* #term=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_26));
				Term term_981;
				{
					BufferSink buf_877 = sink.context().makeBuffer();
					buf_877.start(_M_OK);
					buf_877.end();
					term_981 = buf_877.term();
				}
				sink.substitute(term_598.ref(), new Variable[]
					{var_30}, new Term[]
					{term_981});
				return true;
			}
			label_43 :
			{
				if (term_741.descriptor() != _M_OK)
				{
					break label_43;
				}
				if (term_959.descriptor() != _M__sCons)
				{
					break label_43;
				}
				Term sub_275 = term_959.sub(0).ref();
				if (sub_275.descriptor() != _M_Crsx_xarguments)
				{
					break label_43;
				}
				Term sub_340 = sub_275.sub(0).ref();
				Term sub_172 = sub_275.sub(1).ref();
				if (sub_172.descriptor() != _M__sNil)
				{
					break label_43;
				}
				Term sub_155 = sub_275.sub(2).ref();
				Term sub_149 = term_959.sub(1).ref();
				if (sub_149.descriptor() != _M__sNil)
				{
					break label_43;
				}
				/* #term=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_26));
				Term term_881;
				{
					BufferSink buf_1291 = sink.context().makeBuffer();
					buf_1291.start(_M_OK);
					buf_1291.end();
					term_881 = buf_1291.term();
				}
				sink.substitute(term_598.ref(), new Variable[]
					{var_30}, new Term[]
					{term_881});
				return true;
			}
			label_197 :
			{
				if (term_741.descriptor() != _M_OK)
				{
					break label_197;
				}
				if (term_959.descriptor() != _M__sCons)
				{
					break label_197;
				}
				Term sub_259 = term_959.sub(0).ref();
				if (sub_259.descriptor() != _M_Crsx_xarguments)
				{
					break label_197;
				}
				Term sub_63 = sub_259.sub(0).ref();
				Term sub_289 = sub_259.sub(1).ref();
				if (sub_289.descriptor() != _M__sCons)
				{
					break label_197;
				}
				Term sub_170 = sub_289.sub(0).ref();
				/* #terms=sub */Term sub_288 = sub_289.sub(1).ref();
				if (sub_288.descriptor() != _M__sNil)
				{
					break label_197;
				}
				Term sub_26 = sub_259.sub(2).ref();
				Term sub_122 = term_959.sub(1).ref();
				if (sub_122.descriptor() != _M__sNil)
				{
					break label_197;
				}
				/* #term=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_26));
				sink.start(_M_SendMatchSubTerms);
				sink.start(_M_OK);
				sink.end();
				sink.start(_M_DesugarTerms);
				sink.copy(sub_170.ref());
				sink.end();
				sink.copy(term_866.ref());
				sink.literal(0);
				Variable var_117 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_117});
				VariableUse use_36 = sink.context().makeVariableUse(var_117);
				sink.substitute(term_598.ref(), new Variable[]
					{var_30}, new Term[]
					{use_36});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendMatchMaybeArguments, props_26, term_741, term_959, term_866, var_30, term_598);
	}

	final public static boolean _M_SendMatchMeta(Sink sink, int shared, int depth, Properties props_56, Term term_1077, Term term_1226, Variable var_154, Term term_982)
	{
		if (depth < 2000)
		{
			label_225 :
			{
				Term value_72 = props_56 == null ? null : props_56.lookup("$binders");
				if (value_72 == null)
				{
					break label_225;
				}
				if (value_72.descriptor() != _M_TEXTS)
				{
					break label_225;
				}
				Term sub_45 = value_72.sub(0).ref();
				/* #binders=sub */
				/* #key=term */
				/* #term=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_56));
				Term term_635;
				{
					BufferSink buf_1029 = sink.context().makeBuffer();
					buf_1029.start(_M_META);
					buf_1029.copy(term_1226.ref());
					buf_1029.copy(sub_45.ref());
					buf_1029.end();
					term_635 = buf_1029.term();
				}
				term_1077 = force(sink.context(), term_1077);
				Sink.property(sink, term_1077, term_635);
				Term term_727;
				{
					BufferSink buf_506 = sink.context().makeBuffer();
					buf_506.start(_M_OK);
					buf_506.end();
					term_727 = buf_506.term();
				}
				sink.substitute(term_982.ref(), new Variable[]
					{var_154}, new Term[]
					{term_727});
				return true;
			}
		}
		return thunk(sink, _M_SendMatchMeta, props_56, term_1077, term_1226, var_154, term_982);
	}

	final public static boolean _M_SendMatchProperty(Sink sink, int shared, int depth, Properties props_9, Term term_558, Term term_811, Variable var_33, Term term_686)
	{
		if (depth < 2000)
		{
			label_12 :
			{
				Term value_68 = props_9 == null ? null : props_9.lookup("$top-props");
				if (value_68 == null)
				{
					break label_12;
				}
				if (value_68.descriptor() != _M_YES)
				{
					break label_12;
				}
				Term value_48 = props_9 == null ? null : props_9.lookup("$dispatch$env");
				if (value_48 == null)
				{
					break label_12;
				}
				if (value_48.descriptor() != _M_TEXT)
				{
					break label_12;
				}
				Term sub_251 = value_48.sub(0).ref();
				/* #props=sub */
				if (term_558.descriptor() != _M_Crsx_xproperty_xA1)
				{
					break label_12;
				}
				Term sub_104 = term_558.sub(0).ref();
				/* #METAVAR=sub */
				/* #term=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_9));
				Term term_1159;
				{
					BufferSink buf_354 = sink.context().makeBuffer();
					buf_354.start(_M_TEXT);
					buf_354.copy(sub_251.ref());
					buf_354.end();
					term_1159 = buf_354.term();
				}
				sink.propertyNamed("$props", term_1159);
				sink.start(_M_AddMetaVar);
				sink.copy(sub_104.ref());
				sink.copy(sub_251.ref());
				sink.start(_M__sNil);
				sink.end();
				Variable var_69 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_69});
				VariableUse use_88 = sink.context().makeVariableUse(var_69);
				sink.substitute(term_686.ref(), new Variable[]
					{var_33}, new Term[]
					{use_88});
				sink.end();
				return true;
			}
			label_135 :
			{
				Term value_4 = props_9 == null ? null : props_9.lookup("$top-props");
				if (value_4 == null)
				{
					break label_135;
				}
				if (value_4.descriptor() != _M_NO)
				{
					break label_135;
				}
				if (term_558.descriptor() != _M_Crsx_xproperty_xA1)
				{
					break label_135;
				}
				Term sub_144 = term_558.sub(0).ref();
				/* #METAVAR=sub */
				/* #term=term */
				/* #=term *//*Contract*/
				Variable var_41 = sink.context().makeVariable("props");
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_791;
				{
					BufferSink buf_621 = sink.context().makeBuffer();
					buf_621.start(_M_STRING);
					buf_621.literal(1);
					buf_621.end();
					term_791 = buf_621.term();
				}
				sink.propertyNamed("$LineLocation", term_791);
				Term term_677;
				{
					BufferSink buf_656 = sink.context().makeBuffer();
					buf_656.start(_M_STRING);
					buf_656.literal(1);
					buf_656.end();
					term_677 = buf_656.term();
				}
				sink.propertyNamed("$ColumnLocation", term_677);
				sink.start(_M__sTextCons);
				Term term_816;
				{
					BufferSink buf_828 = sink.context().makeBuffer();
					buf_828.start(_M_STRING);
					buf_828.literal(1);
					buf_828.end();
					term_816 = buf_828.term();
				}
				sink.propertyNamed("$LineLocation", term_816);
				Term term_795;
				{
					BufferSink buf_763 = sink.context().makeBuffer();
					buf_763.start(_M_STRING);
					buf_763.literal(1);
					buf_763.end();
					term_795 = buf_763.term();
				}
				sink.propertyNamed("$ColumnLocation", term_795);
				sink.start(_M__sTextChars);
				sink.literal("Properties ");
				sink.end();
				Term term_648;
				{
					BufferSink buf_655 = sink.context().makeBuffer();
					buf_655.start(_M_STRING);
					buf_655.literal(1);
					buf_655.end();
					term_648 = buf_655.term();
				}
				sink.propertyNamed("$LineLocation", term_648);
				Term term_592;
				{
					BufferSink buf_516 = sink.context().makeBuffer();
					buf_516.start(_M_STRING);
					buf_516.literal(2);
					buf_516.end();
					term_592 = buf_516.term();
				}
				sink.propertyNamed("$ColumnLocation", term_592);
				sink.start(_M__sTextCons);
				Term term_730;
				{
					BufferSink buf_631 = sink.context().makeBuffer();
					buf_631.start(_M_STRING);
					buf_631.literal(1);
					buf_631.end();
					term_730 = buf_631.term();
				}
				sink.propertyNamed("$LineLocation", term_730);
				Term term_627;
				{
					BufferSink buf_600 = sink.context().makeBuffer();
					buf_600.start(_M_STRING);
					buf_600.literal(2);
					buf_600.end();
					term_627 = buf_600.term();
				}
				sink.propertyNamed("$ColumnLocation", term_627);
				sink.start(_M__sTextEmbed);
				Term term_1096;
				{
					BufferSink buf_642 = sink.context().makeBuffer();
					buf_642.start(_M_STRING);
					buf_642.literal(1);
					buf_642.end();
					term_1096 = buf_642.term();
				}
				sink.propertyNamed("$LineLocation", term_1096);
				Term term_551;
				{
					BufferSink buf_652 = sink.context().makeBuffer();
					buf_652.start(_M_STRING);
					buf_652.literal(2);
					buf_652.end();
					term_551 = buf_652.term();
				}
				sink.propertyNamed("$ColumnLocation", term_551);
				sink.start(_M_AsText);
				sink.use(var_41);
				sink.end();
				sink.end();
				Term term_707;
				{
					BufferSink buf_510 = sink.context().makeBuffer();
					buf_510.start(_M_STRING);
					buf_510.literal(1);
					buf_510.end();
					term_707 = buf_510.term();
				}
				sink.propertyNamed("$LineLocation", term_707);
				Term term_998;
				{
					BufferSink buf_767 = sink.context().makeBuffer();
					buf_767.start(_M_STRING);
					buf_767.literal(13);
					buf_767.end();
					term_998 = buf_767.term();
				}
				sink.propertyNamed("$ColumnLocation", term_998);
				sink.start(_M__sTextCons);
				Term term_1145;
				{
					BufferSink buf_596 = sink.context().makeBuffer();
					buf_596.start(_M_STRING);
					buf_596.literal(1);
					buf_596.end();
					term_1145 = buf_596.term();
				}
				sink.propertyNamed("$LineLocation", term_1145);
				Term term_588;
				{
					BufferSink buf_896 = sink.context().makeBuffer();
					buf_896.start(_M_STRING);
					buf_896.literal(13);
					buf_896.end();
					term_588 = buf_896.term();
				}
				sink.propertyNamed("$ColumnLocation", term_588);
				sink.start(_M__sTextChars);
				sink.literal(" = safeRef(");
				sink.end();
				Term term_500;
				{
					BufferSink buf_884 = sink.context().makeBuffer();
					buf_884.start(_M_STRING);
					buf_884.literal(1);
					buf_884.end();
					term_500 = buf_884.term();
				}
				sink.propertyNamed("$LineLocation", term_500);
				Term term_841;
				{
					BufferSink buf_673 = sink.context().makeBuffer();
					buf_673.start(_M_STRING);
					buf_673.literal(20);
					buf_673.end();
					term_841 = buf_673.term();
				}
				sink.propertyNamed("$ColumnLocation", term_841);
				sink.start(_M__sTextCons);
				Term term_977;
				{
					BufferSink buf_300 = sink.context().makeBuffer();
					buf_300.start(_M_STRING);
					buf_300.literal(1);
					buf_300.end();
					term_977 = buf_300.term();
				}
				sink.propertyNamed("$LineLocation", term_977);
				Term term_886;
				{
					BufferSink buf_1011 = sink.context().makeBuffer();
					buf_1011.start(_M_STRING);
					buf_1011.literal(20);
					buf_1011.end();
					term_886 = buf_1011.term();
				}
				sink.propertyNamed("$ColumnLocation", term_886);
				sink.start(_M__sTextEmbed);
				Term term_1083;
				{
					BufferSink buf_771 = sink.context().makeBuffer();
					buf_771.start(_M_STRING);
					buf_771.literal(1);
					buf_771.end();
					term_1083 = buf_771.term();
				}
				sink.propertyNamed("$LineLocation", term_1083);
				Term term_802;
				{
					BufferSink buf_817 = sink.context().makeBuffer();
					buf_817.start(_M_STRING);
					buf_817.literal(20);
					buf_817.end();
					term_802 = buf_817.term();
				}
				sink.propertyNamed("$ColumnLocation", term_802);
				sink.start(_M_AsText);
				sink.copy(term_811.ref());
				sink.end();
				sink.end();
				Term term_1008;
				{
					BufferSink buf_532 = sink.context().makeBuffer();
					buf_532.start(_M_STRING);
					buf_532.literal(1);
					buf_532.end();
					term_1008 = buf_532.term();
				}
				sink.propertyNamed("$LineLocation", term_1008);
				Term term_537;
				{
					BufferSink buf_746 = sink.context().makeBuffer();
					buf_746.start(_M_STRING);
					buf_746.literal(31);
					buf_746.end();
					term_537 = buf_746.term();
				}
				sink.propertyNamed("$ColumnLocation", term_537);
				sink.start(_M__sTextCons);
				Term term_953;
				{
					BufferSink buf_536 = sink.context().makeBuffer();
					buf_536.start(_M_STRING);
					buf_536.literal(1);
					buf_536.end();
					term_953 = buf_536.term();
				}
				sink.propertyNamed("$LineLocation", term_953);
				Term term_848;
				{
					BufferSink buf_679 = sink.context().makeBuffer();
					buf_679.start(_M_STRING);
					buf_679.literal(31);
					buf_679.end();
					term_848 = buf_679.term();
				}
				sink.propertyNamed("$ColumnLocation", term_848);
				sink.start(_M__sTextChars);
				sink.literal(".properties());");
				sink.end();
				Term term_697;
				{
					BufferSink buf_1140 = sink.context().makeBuffer();
					buf_1140.start(_M_STRING);
					buf_1140.literal(1);
					buf_1140.end();
					term_697 = buf_1140.term();
				}
				sink.propertyNamed("$LineLocation", term_697);
				Term term_762;
				{
					BufferSink buf_562 = sink.context().makeBuffer();
					buf_562.start(_M_STRING);
					buf_562.literal(38);
					buf_562.end();
					term_762 = buf_562.term();
				}
				sink.propertyNamed("$ColumnLocation", term_762);
				sink.start(_M__sTextCons);
				Term term_806;
				{
					BufferSink buf_514 = sink.context().makeBuffer();
					buf_514.start(_M_STRING);
					buf_514.literal(1);
					buf_514.end();
					term_806 = buf_514.term();
				}
				sink.propertyNamed("$LineLocation", term_806);
				Term term_927;
				{
					BufferSink buf_895 = sink.context().makeBuffer();
					buf_895.start(_M_STRING);
					buf_895.literal(38);
					buf_895.end();
					term_927 = buf_895.term();
				}
				sink.propertyNamed("$ColumnLocation", term_927);
				sink.start(_M__sTextEmbed);
				Term term_1076;
				{
					BufferSink buf_692 = sink.context().makeBuffer();
					buf_692.start(_M_STRING);
					buf_692.literal(1);
					buf_692.end();
					term_1076 = buf_692.term();
				}
				sink.propertyNamed("$LineLocation", term_1076);
				Term term_399;
				{
					BufferSink buf_505 = sink.context().makeBuffer();
					buf_505.start(_M_STRING);
					buf_505.literal(38);
					buf_505.end();
					term_399 = buf_505.term();
				}
				sink.propertyNamed("$ColumnLocation", term_399);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_9));
				Term term_1046;
				{
					BufferSink buf_546 = sink.context().makeBuffer();
					buf_546.start(_M_TEXT);
					buf_546.use(var_41);
					buf_546.end();
					term_1046 = buf_546.term();
				}
				sink.propertyNamed("$props", term_1046);
				sink.start(_M_AddMetaVar);
				sink.copy(sub_144.ref());
				sink.use(var_41);
				sink.start(_M__sNil);
				sink.end();
				Variable var_13 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_13});
				VariableUse use_52 = sink.context().makeVariableUse(var_13);
				sink.substitute(term_686.ref(), new Variable[]
					{var_33}, new Term[]
					{use_52});
				sink.end();
				sink.end();
				sink.end();
				Term term_1343;
				{
					BufferSink buf_1223 = sink.context().makeBuffer();
					buf_1223.start(_M_STRING);
					buf_1223.literal(1);
					buf_1223.end();
					term_1343 = buf_1223.term();
				}
				sink.propertyNamed("$LineLocation", term_1343);
				Term term_937;
				{
					BufferSink buf_659 = sink.context().makeBuffer();
					buf_659.start(_M_STRING);
					buf_659.literal(53);
					buf_659.end();
					term_937 = buf_659.term();
				}
				sink.propertyNamed("$ColumnLocation", term_937);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_72 :
			{
				Term value_41 = props_9 == null ? null : props_9.lookup("$props");
				if (value_41 == null)
				{
					break label_72;
				}
				if (value_41.descriptor() != _M_TEXT)
				{
					break label_72;
				}
				Term sub_246 = value_41.sub(0).ref();
				/* #props=sub */
				Term value_59 = props_9 == null ? null : props_9.lookup("$caselabel");
				if (value_59 == null)
				{
					break label_72;
				}
				if (value_59.descriptor() != _M_TEXT)
				{
					break label_72;
				}
				Term sub_487 = value_59.sub(0).ref();
				/* #label=sub */
				if (term_558.descriptor() != _M_Crsx_xproperty_xA2)
				{
					break label_72;
				}
				Term sub_426 = term_558.sub(0).ref();
				Term sub_265 = term_558.sub(1).ref();
				/* #METAVAR=sub */
				/* #term=term */
				/* #=term *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_669;
				{
					BufferSink buf_382 = sink.context().makeBuffer();
					buf_382.start(_M_STRING);
					buf_382.literal(1);
					buf_382.end();
					term_669 = buf_382.term();
				}
				sink.propertyNamed("$LineLocation", term_669);
				Term term_640;
				{
					BufferSink buf_419 = sink.context().makeBuffer();
					buf_419.start(_M_STRING);
					buf_419.literal(1);
					buf_419.end();
					term_640 = buf_419.term();
				}
				sink.propertyNamed("$ColumnLocation", term_640);
				sink.start(_M__sTextCons);
				Term term_565;
				{
					BufferSink buf_855 = sink.context().makeBuffer();
					buf_855.start(_M_STRING);
					buf_855.literal(1);
					buf_855.end();
					term_565 = buf_855.term();
				}
				sink.propertyNamed("$LineLocation", term_565);
				Term term_758;
				{
					BufferSink buf_504 = sink.context().makeBuffer();
					buf_504.start(_M_STRING);
					buf_504.literal(1);
					buf_504.end();
					term_758 = buf_504.term();
				}
				sink.propertyNamed("$ColumnLocation", term_758);
				sink.start(_M__sTextChars);
				sink.literal("if (");
				sink.end();
				Term term_626;
				{
					BufferSink buf_579 = sink.context().makeBuffer();
					buf_579.start(_M_STRING);
					buf_579.literal(1);
					buf_579.end();
					term_626 = buf_579.term();
				}
				sink.propertyNamed("$LineLocation", term_626);
				Term term_324;
				{
					BufferSink buf_636 = sink.context().makeBuffer();
					buf_636.start(_M_STRING);
					buf_636.literal(2);
					buf_636.end();
					term_324 = buf_636.term();
				}
				sink.propertyNamed("$ColumnLocation", term_324);
				sink.start(_M__sTextCons);
				Term term_447;
				{
					BufferSink buf_528 = sink.context().makeBuffer();
					buf_528.start(_M_STRING);
					buf_528.literal(1);
					buf_528.end();
					term_447 = buf_528.term();
				}
				sink.propertyNamed("$LineLocation", term_447);
				Term term_1055;
				{
					BufferSink buf_575 = sink.context().makeBuffer();
					buf_575.start(_M_STRING);
					buf_575.literal(2);
					buf_575.end();
					term_1055 = buf_575.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1055);
				sink.start(_M__sTextEmbed);
				Term term_609;
				{
					BufferSink buf_812 = sink.context().makeBuffer();
					buf_812.start(_M_STRING);
					buf_812.literal(1);
					buf_812.end();
					term_609 = buf_812.term();
				}
				sink.propertyNamed("$LineLocation", term_609);
				Term term_945;
				{
					BufferSink buf_993 = sink.context().makeBuffer();
					buf_993.start(_M_STRING);
					buf_993.literal(2);
					buf_993.end();
					term_945 = buf_993.term();
				}
				sink.propertyNamed("$ColumnLocation", term_945);
				sink.start(_M_AsText);
				sink.copy(sub_246.ref());
				sink.end();
				sink.end();
				Term term_670;
				{
					BufferSink buf_362 = sink.context().makeBuffer();
					buf_362.start(_M_STRING);
					buf_362.literal(1);
					buf_362.end();
					term_670 = buf_362.term();
				}
				sink.propertyNamed("$LineLocation", term_670);
				Term term_928;
				{
					BufferSink buf_887 = sink.context().makeBuffer();
					buf_887.start(_M_STRING);
					buf_887.literal(6);
					buf_887.end();
					term_928 = buf_887.term();
				}
				sink.propertyNamed("$ColumnLocation", term_928);
				sink.start(_M__sTextCons);
				Term term_1268;
				{
					BufferSink buf_980 = sink.context().makeBuffer();
					buf_980.start(_M_STRING);
					buf_980.literal(1);
					buf_980.end();
					term_1268 = buf_980.term();
				}
				sink.propertyNamed("$LineLocation", term_1268);
				Term term_554;
				{
					BufferSink buf_538 = sink.context().makeBuffer();
					buf_538.start(_M_STRING);
					buf_538.literal(6);
					buf_538.end();
					term_554 = buf_538.term();
				}
				sink.propertyNamed("$ColumnLocation", term_554);
				sink.start(_M__sTextChars);
				sink.literal(" != null && ");
				sink.end();
				Term term_700;
				{
					BufferSink buf_565 = sink.context().makeBuffer();
					buf_565.start(_M_STRING);
					buf_565.literal(1);
					buf_565.end();
					term_700 = buf_565.term();
				}
				sink.propertyNamed("$LineLocation", term_700);
				Term term_805;
				{
					BufferSink buf_948 = sink.context().makeBuffer();
					buf_948.start(_M_STRING);
					buf_948.literal(14);
					buf_948.end();
					term_805 = buf_948.term();
				}
				sink.propertyNamed("$ColumnLocation", term_805);
				sink.start(_M__sTextCons);
				Term term_518;
				{
					BufferSink buf_881 = sink.context().makeBuffer();
					buf_881.start(_M_STRING);
					buf_881.literal(1);
					buf_881.end();
					term_518 = buf_881.term();
				}
				sink.propertyNamed("$LineLocation", term_518);
				Term term_770;
				{
					BufferSink buf_737 = sink.context().makeBuffer();
					buf_737.start(_M_STRING);
					buf_737.literal(14);
					buf_737.end();
					term_770 = buf_737.term();
				}
				sink.propertyNamed("$ColumnLocation", term_770);
				sink.start(_M__sTextEmbed);
				Term term_792;
				{
					BufferSink buf_857 = sink.context().makeBuffer();
					buf_857.start(_M_STRING);
					buf_857.literal(1);
					buf_857.end();
					term_792 = buf_857.term();
				}
				sink.propertyNamed("$LineLocation", term_792);
				Term term_948;
				{
					BufferSink buf_571 = sink.context().makeBuffer();
					buf_571.start(_M_STRING);
					buf_571.literal(14);
					buf_571.end();
					term_948 = buf_571.term();
				}
				sink.propertyNamed("$ColumnLocation", term_948);
				sink.start(_M_AsText);
				sink.copy(sub_246.ref());
				sink.end();
				sink.end();
				Term term_884;
				{
					BufferSink buf_710 = sink.context().makeBuffer();
					buf_710.start(_M_STRING);
					buf_710.literal(1);
					buf_710.end();
					term_884 = buf_710.term();
				}
				sink.propertyNamed("$LineLocation", term_884);
				Term term_842;
				{
					BufferSink buf_1151 = sink.context().makeBuffer();
					buf_1151.start(_M_STRING);
					buf_1151.literal(26);
					buf_1151.end();
					term_842 = buf_1151.term();
				}
				sink.propertyNamed("$ColumnLocation", term_842);
				sink.start(_M__sTextCons);
				Term term_1270;
				{
					BufferSink buf_612 = sink.context().makeBuffer();
					buf_612.start(_M_STRING);
					buf_612.literal(1);
					buf_612.end();
					term_1270 = buf_612.term();
				}
				sink.propertyNamed("$LineLocation", term_1270);
				Term term_980;
				{
					BufferSink buf_551 = sink.context().makeBuffer();
					buf_551.start(_M_STRING);
					buf_551.literal(26);
					buf_551.end();
					term_980 = buf_551.term();
				}
				sink.propertyNamed("$ColumnLocation", term_980);
				sink.start(_M__sTextChars);
				sink.literal(".lookup(");
				sink.end();
				Term term_752;
				{
					BufferSink buf_775 = sink.context().makeBuffer();
					buf_775.start(_M_STRING);
					buf_775.literal(1);
					buf_775.end();
					term_752 = buf_775.term();
				}
				sink.propertyNamed("$LineLocation", term_752);
				Term term_797;
				{
					BufferSink buf_700 = sink.context().makeBuffer();
					buf_700.start(_M_STRING);
					buf_700.literal(34);
					buf_700.end();
					term_797 = buf_700.term();
				}
				sink.propertyNamed("$ColumnLocation", term_797);
				sink.start(_M__sTextCons);
				Term term_824;
				{
					BufferSink buf_1068 = sink.context().makeBuffer();
					buf_1068.start(_M_STRING);
					buf_1068.literal(1);
					buf_1068.end();
					term_824 = buf_1068.term();
				}
				sink.propertyNamed("$LineLocation", term_824);
				Term term_1032;
				{
					BufferSink buf_690 = sink.context().makeBuffer();
					buf_690.start(_M_STRING);
					buf_690.literal(34);
					buf_690.end();
					term_1032 = buf_690.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1032);
				sink.start(_M__sTextEmbed);
				Term term_572;
				{
					BufferSink buf_988 = sink.context().makeBuffer();
					buf_988.start(_M_STRING);
					buf_988.literal(1);
					buf_988.end();
					term_572 = buf_988.term();
				}
				sink.propertyNamed("$LineLocation", term_572);
				Term term_656;
				{
					BufferSink buf_1022 = sink.context().makeBuffer();
					buf_1022.start(_M_STRING);
					buf_1022.literal(34);
					buf_1022.end();
					term_656 = buf_1022.term();
				}
				sink.propertyNamed("$ColumnLocation", term_656);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_9));
				sink.start(_M_MetaVar);
				sink.copy(sub_265.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_855;
				{
					BufferSink buf_644 = sink.context().makeBuffer();
					buf_644.start(_M_STRING);
					buf_644.literal(1);
					buf_644.end();
					term_855 = buf_644.term();
				}
				sink.propertyNamed("$LineLocation", term_855);
				Term term_603;
				{
					BufferSink buf_479 = sink.context().makeBuffer();
					buf_479.start(_M_STRING);
					buf_479.literal(42);
					buf_479.end();
					term_603 = buf_479.term();
				}
				sink.propertyNamed("$ColumnLocation", term_603);
				sink.start(_M__sTextCons);
				Term term_826;
				{
					BufferSink buf_778 = sink.context().makeBuffer();
					buf_778.start(_M_STRING);
					buf_778.literal(1);
					buf_778.end();
					term_826 = buf_778.term();
				}
				sink.propertyNamed("$LineLocation", term_826);
				Term term_1078;
				{
					BufferSink buf_1118 = sink.context().makeBuffer();
					buf_1118.start(_M_STRING);
					buf_1118.literal(42);
					buf_1118.end();
					term_1078 = buf_1118.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1078);
				sink.start(_M__sTextChars);
				sink.literal(") != null) ");
				sink.end();
				Term term_634;
				{
					BufferSink buf_973 = sink.context().makeBuffer();
					buf_973.start(_M_STRING);
					buf_973.literal(1);
					buf_973.end();
					term_634 = buf_973.term();
				}
				sink.propertyNamed("$LineLocation", term_634);
				Term term_357;
				{
					BufferSink buf_728 = sink.context().makeBuffer();
					buf_728.start(_M_STRING);
					buf_728.literal(65);
					buf_728.end();
					term_357 = buf_728.term();
				}
				sink.propertyNamed("$ColumnLocation", term_357);
				sink.start(_M__sTextCons);
				Term term_956;
				{
					BufferSink buf_760 = sink.context().makeBuffer();
					buf_760.start(_M_STRING);
					buf_760.literal(1);
					buf_760.end();
					term_956 = buf_760.term();
				}
				sink.propertyNamed("$LineLocation", term_956);
				Term term_776;
				{
					BufferSink buf_774 = sink.context().makeBuffer();
					buf_774.start(_M_STRING);
					buf_774.literal(65);
					buf_774.end();
					term_776 = buf_774.term();
				}
				sink.propertyNamed("$ColumnLocation", term_776);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_708;
				{
					BufferSink buf_958 = sink.context().makeBuffer();
					buf_958.start(_M_STRING);
					buf_958.literal(1);
					buf_958.end();
					term_708 = buf_958.term();
				}
				sink.propertyNamed("$LineLocation", term_708);
				Term term_1109;
				{
					BufferSink buf_637 = sink.context().makeBuffer();
					buf_637.start(_M_STRING);
					buf_637.literal(76);
					buf_637.end();
					term_1109 = buf_637.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1109);
				sink.start(_M__sTextCons);
				Term term_710;
				{
					BufferSink buf_1287 = sink.context().makeBuffer();
					buf_1287.start(_M_STRING);
					buf_1287.literal(1);
					buf_1287.end();
					term_710 = buf_1287.term();
				}
				sink.propertyNamed("$LineLocation", term_710);
				Term term_445;
				{
					BufferSink buf_503 = sink.context().makeBuffer();
					buf_503.start(_M_STRING);
					buf_503.literal(76);
					buf_503.end();
					term_445 = buf_503.term();
				}
				sink.propertyNamed("$ColumnLocation", term_445);
				sink.start(_M__sTextChars);
				sink.literal("{");
				sink.end();
				Term term_668;
				{
					BufferSink buf_478 = sink.context().makeBuffer();
					buf_478.start(_M_STRING);
					buf_478.literal(2);
					buf_478.end();
					term_668 = buf_478.term();
				}
				sink.propertyNamed("$LineLocation", term_668);
				Term term_757;
				{
					BufferSink buf_699 = sink.context().makeBuffer();
					buf_699.start(_M_STRING);
					buf_699.literal(1);
					buf_699.end();
					term_757 = buf_699.term();
				}
				sink.propertyNamed("$ColumnLocation", term_757);
				sink.start(_M__sTextCons);
				Term term_651;
				{
					BufferSink buf_705 = sink.context().makeBuffer();
					buf_705.start(_M_STRING);
					buf_705.literal(2);
					buf_705.end();
					term_651 = buf_705.term();
				}
				sink.propertyNamed("$LineLocation", term_651);
				Term term_581;
				{
					BufferSink buf_928 = sink.context().makeBuffer();
					buf_928.start(_M_STRING);
					buf_928.literal(2);
					buf_928.end();
					term_581 = buf_928.term();
				}
				sink.propertyNamed("$ColumnLocation", term_581);
				sink.start(_M__sTextIndent);
				Term term_443;
				{
					BufferSink buf_708 = sink.context().makeBuffer();
					buf_708.start(_M_STRING);
					buf_708.literal(2);
					buf_708.end();
					term_443 = buf_708.term();
				}
				sink.propertyNamed("$LineLocation", term_443);
				Term term_926;
				{
					BufferSink buf_854 = sink.context().makeBuffer();
					buf_854.start(_M_STRING);
					buf_854.literal(2);
					buf_854.end();
					term_926 = buf_854.term();
				}
				sink.propertyNamed("$ColumnLocation", term_926);
				sink.start(_M__sTextCons);
				Term term_644;
				{
					BufferSink buf_1041 = sink.context().makeBuffer();
					buf_1041.start(_M_STRING);
					buf_1041.literal(2);
					buf_1041.end();
					term_644 = buf_1041.term();
				}
				sink.propertyNamed("$LineLocation", term_644);
				Term term_714;
				{
					BufferSink buf_974 = sink.context().makeBuffer();
					buf_974.start(_M_STRING);
					buf_974.literal(2);
					buf_974.end();
					term_714 = buf_974.term();
				}
				sink.propertyNamed("$ColumnLocation", term_714);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1036;
				{
					BufferSink buf_754 = sink.context().makeBuffer();
					buf_754.start(_M_STRING);
					buf_754.literal(2);
					buf_754.end();
					term_1036 = buf_754.term();
				}
				sink.propertyNamed("$LineLocation", term_1036);
				Term term_1021;
				{
					BufferSink buf_1008 = sink.context().makeBuffer();
					buf_1008.start(_M_STRING);
					buf_1008.literal(3);
					buf_1008.end();
					term_1021 = buf_1008.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1021);
				sink.start(_M__sTextCons);
				Term term_605;
				{
					BufferSink buf_662 = sink.context().makeBuffer();
					buf_662.start(_M_STRING);
					buf_662.literal(2);
					buf_662.end();
					term_605 = buf_662.term();
				}
				sink.propertyNamed("$LineLocation", term_605);
				Term term_718;
				{
					BufferSink buf_638 = sink.context().makeBuffer();
					buf_638.start(_M_STRING);
					buf_638.literal(3);
					buf_638.end();
					term_718 = buf_638.term();
				}
				sink.propertyNamed("$ColumnLocation", term_718);
				sink.start(_M__sTextChars);
				sink.literal("  break ");
				sink.end();
				Term term_1071;
				{
					BufferSink buf_668 = sink.context().makeBuffer();
					buf_668.start(_M_STRING);
					buf_668.literal(3);
					buf_668.end();
					term_1071 = buf_668.term();
				}
				sink.propertyNamed("$LineLocation", term_1071);
				Term term_912;
				{
					BufferSink buf_586 = sink.context().makeBuffer();
					buf_586.start(_M_STRING);
					buf_586.literal(1);
					buf_586.end();
					term_912 = buf_586.term();
				}
				sink.propertyNamed("$ColumnLocation", term_912);
				sink.start(_M__sTextCons);
				Term term_1252;
				{
					BufferSink buf_967 = sink.context().makeBuffer();
					buf_967.start(_M_STRING);
					buf_967.literal(3);
					buf_967.end();
					term_1252 = buf_967.term();
				}
				sink.propertyNamed("$LineLocation", term_1252);
				Term term_1436;
				{
					BufferSink buf_920 = sink.context().makeBuffer();
					buf_920.start(_M_STRING);
					buf_920.literal(1);
					buf_920.end();
					term_1436 = buf_920.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1436);
				sink.start(_M__sTextEmbed);
				Term term_823;
				{
					BufferSink buf_989 = sink.context().makeBuffer();
					buf_989.start(_M_STRING);
					buf_989.literal(3);
					buf_989.end();
					term_823 = buf_989.term();
				}
				sink.propertyNamed("$LineLocation", term_823);
				Term term_999;
				{
					BufferSink buf_798 = sink.context().makeBuffer();
					buf_798.start(_M_STRING);
					buf_798.literal(1);
					buf_798.end();
					term_999 = buf_798.term();
				}
				sink.propertyNamed("$ColumnLocation", term_999);
				sink.start(_M_AsText);
				sink.copy(sub_487.ref());
				sink.end();
				sink.end();
				Term term_507;
				{
					BufferSink buf_670 = sink.context().makeBuffer();
					buf_670.start(_M_STRING);
					buf_670.literal(3);
					buf_670.end();
					term_507 = buf_670.term();
				}
				sink.propertyNamed("$LineLocation", term_507);
				Term term_556;
				{
					BufferSink buf_591 = sink.context().makeBuffer();
					buf_591.start(_M_STRING);
					buf_591.literal(9);
					buf_591.end();
					term_556 = buf_591.term();
				}
				sink.propertyNamed("$ColumnLocation", term_556);
				sink.start(_M__sTextCons);
				Term term_683;
				{
					BufferSink buf_832 = sink.context().makeBuffer();
					buf_832.start(_M_STRING);
					buf_832.literal(3);
					buf_832.end();
					term_683 = buf_832.term();
				}
				sink.propertyNamed("$LineLocation", term_683);
				Term term_734;
				{
					BufferSink buf_1174 = sink.context().makeBuffer();
					buf_1174.start(_M_STRING);
					buf_1174.literal(9);
					buf_1174.end();
					term_734 = buf_1174.term();
				}
				sink.propertyNamed("$ColumnLocation", term_734);
				sink.start(_M__sTextChars);
				sink.literal(";");
				sink.end();
				Term term_825;
				{
					BufferSink buf_748 = sink.context().makeBuffer();
					buf_748.start(_M_STRING);
					buf_748.literal(3);
					buf_748.end();
					term_825 = buf_748.term();
				}
				sink.propertyNamed("$LineLocation", term_825);
				Term term_793;
				{
					BufferSink buf_635 = sink.context().makeBuffer();
					buf_635.start(_M_STRING);
					buf_635.literal(17);
					buf_635.end();
					term_793 = buf_635.term();
				}
				sink.propertyNamed("$ColumnLocation", term_793);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				Term term_437;
				{
					BufferSink buf_1217 = sink.context().makeBuffer();
					buf_1217.start(_M_STRING);
					buf_1217.literal(3);
					buf_1217.end();
					term_437 = buf_1217.term();
				}
				sink.propertyNamed("$LineLocation", term_437);
				Term term_794;
				{
					BufferSink buf_610 = sink.context().makeBuffer();
					buf_610.start(_M_STRING);
					buf_610.literal(18);
					buf_610.end();
					term_794 = buf_610.term();
				}
				sink.propertyNamed("$ColumnLocation", term_794);
				sink.start(_M__sTextCons);
				Term term_638;
				{
					BufferSink buf_888 = sink.context().makeBuffer();
					buf_888.start(_M_STRING);
					buf_888.literal(3);
					buf_888.end();
					term_638 = buf_888.term();
				}
				sink.propertyNamed("$LineLocation", term_638);
				Term term_894;
				{
					BufferSink buf_722 = sink.context().makeBuffer();
					buf_722.start(_M_STRING);
					buf_722.literal(18);
					buf_722.end();
					term_894 = buf_722.term();
				}
				sink.propertyNamed("$ColumnLocation", term_894);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1081;
				{
					BufferSink buf_814 = sink.context().makeBuffer();
					buf_814.start(_M_STRING);
					buf_814.literal(3);
					buf_814.end();
					term_1081 = buf_814.term();
				}
				sink.propertyNamed("$LineLocation", term_1081);
				Term term_450;
				{
					BufferSink buf_804 = sink.context().makeBuffer();
					buf_804.start(_M_STRING);
					buf_804.literal(19);
					buf_804.end();
					term_450 = buf_804.term();
				}
				sink.propertyNamed("$ColumnLocation", term_450);
				sink.start(_M__sTextCons);
				Term term_1022;
				{
					BufferSink buf_1006 = sink.context().makeBuffer();
					buf_1006.start(_M_STRING);
					buf_1006.literal(3);
					buf_1006.end();
					term_1022 = buf_1006.term();
				}
				sink.propertyNamed("$LineLocation", term_1022);
				Term term_864;
				{
					BufferSink buf_1192 = sink.context().makeBuffer();
					buf_1192.start(_M_STRING);
					buf_1192.literal(19);
					buf_1192.end();
					term_864 = buf_1192.term();
				}
				sink.propertyNamed("$ColumnLocation", term_864);
				sink.start(_M__sTextChars);
				sink.literal("}");
				sink.end();
				Term term_947;
				{
					BufferSink buf_1061 = sink.context().makeBuffer();
					buf_1061.start(_M_STRING);
					buf_1061.literal(4);
					buf_1061.end();
					term_947 = buf_1061.term();
				}
				sink.propertyNamed("$LineLocation", term_947);
				Term term_859;
				{
					BufferSink buf_858 = sink.context().makeBuffer();
					buf_858.start(_M_STRING);
					buf_858.literal(1);
					buf_858.end();
					term_859 = buf_858.term();
				}
				sink.propertyNamed("$ColumnLocation", term_859);
				sink.start(_M__sTextCons);
				Term term_696;
				{
					BufferSink buf_605 = sink.context().makeBuffer();
					buf_605.start(_M_STRING);
					buf_605.literal(4);
					buf_605.end();
					term_696 = buf_605.term();
				}
				sink.propertyNamed("$LineLocation", term_696);
				Term term_587;
				{
					BufferSink buf_1017 = sink.context().makeBuffer();
					buf_1017.start(_M_STRING);
					buf_1017.literal(1);
					buf_1017.end();
					term_587 = buf_1017.term();
				}
				sink.propertyNamed("$ColumnLocation", term_587);
				sink.start(_M__sTextEmbed);
				Term term_1010;
				{
					BufferSink buf_566 = sink.context().makeBuffer();
					buf_566.start(_M_STRING);
					buf_566.literal(4);
					buf_566.end();
					term_1010 = buf_566.term();
				}
				sink.propertyNamed("$LineLocation", term_1010);
				Term term_1001;
				{
					BufferSink buf_623 = sink.context().makeBuffer();
					buf_623.start(_M_STRING);
					buf_623.literal(1);
					buf_623.end();
					term_1001 = buf_623.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1001);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_9));
				Term term_1125;
				{
					BufferSink buf_512 = sink.context().makeBuffer();
					buf_512.start(_M_OK);
					buf_512.end();
					term_1125 = buf_512.term();
				}
				sink.substitute(term_686.ref(), new Variable[]
					{var_33}, new Term[]
					{term_1125});
				sink.end();
				sink.end();
				Term term_550;
				{
					BufferSink buf_986 = sink.context().makeBuffer();
					buf_986.start(_M_STRING);
					buf_986.literal(4);
					buf_986.end();
					term_550 = buf_986.term();
				}
				sink.propertyNamed("$LineLocation", term_550);
				Term term_465;
				{
					BufferSink buf_494 = sink.context().makeBuffer();
					buf_494.start(_M_STRING);
					buf_494.literal(2);
					buf_494.end();
					term_465 = buf_494.term();
				}
				sink.propertyNamed("$ColumnLocation", term_465);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_41 :
			{
				Term value_94 = props_9 == null ? null : props_9.lookup("$props");
				if (value_94 == null)
				{
					break label_41;
				}
				if (value_94.descriptor() != _M_TEXT)
				{
					break label_41;
				}
				Term sub_120 = value_94.sub(0).ref();
				/* #props=sub */
				Term value_47 = props_9 == null ? null : props_9.lookup("$caselabel");
				if (value_47 == null)
				{
					break label_41;
				}
				if (value_47.descriptor() != _M_TEXT)
				{
					break label_41;
				}
				Term sub_202 = value_47.sub(0).ref();
				/* #label=sub */
				if (term_558.descriptor() != _M_Crsx_xproperty_xA4)
				{
					break label_41;
				}
				Term sub_116 = term_558.sub(0).ref();
				/* #VARIABLE=sub */
				/* #term=term */
				/* #=term *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_541;
				{
					BufferSink buf_866 = sink.context().makeBuffer();
					buf_866.start(_M_STRING);
					buf_866.literal(1);
					buf_866.end();
					term_541 = buf_866.term();
				}
				sink.propertyNamed("$LineLocation", term_541);
				Term term_899;
				{
					BufferSink buf_1066 = sink.context().makeBuffer();
					buf_1066.start(_M_STRING);
					buf_1066.literal(1);
					buf_1066.end();
					term_899 = buf_1066.term();
				}
				sink.propertyNamed("$ColumnLocation", term_899);
				sink.start(_M__sTextCons);
				Term term_732;
				{
					BufferSink buf_689 = sink.context().makeBuffer();
					buf_689.start(_M_STRING);
					buf_689.literal(1);
					buf_689.end();
					term_732 = buf_689.term();
				}
				sink.propertyNamed("$LineLocation", term_732);
				Term term_691;
				{
					BufferSink buf_762 = sink.context().makeBuffer();
					buf_762.start(_M_STRING);
					buf_762.literal(1);
					buf_762.end();
					term_691 = buf_762.term();
				}
				sink.propertyNamed("$ColumnLocation", term_691);
				sink.start(_M__sTextChars);
				sink.literal("if (");
				sink.end();
				Term term_853;
				{
					BufferSink buf_697 = sink.context().makeBuffer();
					buf_697.start(_M_STRING);
					buf_697.literal(1);
					buf_697.end();
					term_853 = buf_697.term();
				}
				sink.propertyNamed("$LineLocation", term_853);
				Term term_944;
				{
					BufferSink buf_553 = sink.context().makeBuffer();
					buf_553.start(_M_STRING);
					buf_553.literal(2);
					buf_553.end();
					term_944 = buf_553.term();
				}
				sink.propertyNamed("$ColumnLocation", term_944);
				sink.start(_M__sTextCons);
				Term term_913;
				{
					BufferSink buf_568 = sink.context().makeBuffer();
					buf_568.start(_M_STRING);
					buf_568.literal(1);
					buf_568.end();
					term_913 = buf_568.term();
				}
				sink.propertyNamed("$LineLocation", term_913);
				Term term_798;
				{
					BufferSink buf_1033 = sink.context().makeBuffer();
					buf_1033.start(_M_STRING);
					buf_1033.literal(2);
					buf_1033.end();
					term_798 = buf_1033.term();
				}
				sink.propertyNamed("$ColumnLocation", term_798);
				sink.start(_M__sTextEmbed);
				Term term_1035;
				{
					BufferSink buf_476 = sink.context().makeBuffer();
					buf_476.start(_M_STRING);
					buf_476.literal(1);
					buf_476.end();
					term_1035 = buf_476.term();
				}
				sink.propertyNamed("$LineLocation", term_1035);
				Term term_665;
				{
					BufferSink buf_1032 = sink.context().makeBuffer();
					buf_1032.start(_M_STRING);
					buf_1032.literal(2);
					buf_1032.end();
					term_665 = buf_1032.term();
				}
				sink.propertyNamed("$ColumnLocation", term_665);
				sink.start(_M_AsText);
				sink.copy(sub_120.ref());
				sink.end();
				sink.end();
				Term term_1598;
				{
					BufferSink buf_701 = sink.context().makeBuffer();
					buf_701.start(_M_STRING);
					buf_701.literal(1);
					buf_701.end();
					term_1598 = buf_701.term();
				}
				sink.propertyNamed("$LineLocation", term_1598);
				Term term_608;
				{
					BufferSink buf_698 = sink.context().makeBuffer();
					buf_698.start(_M_STRING);
					buf_698.literal(6);
					buf_698.end();
					term_608 = buf_698.term();
				}
				sink.propertyNamed("$ColumnLocation", term_608);
				sink.start(_M__sTextCons);
				Term term_746;
				{
					BufferSink buf_416 = sink.context().makeBuffer();
					buf_416.start(_M_STRING);
					buf_416.literal(1);
					buf_416.end();
					term_746 = buf_416.term();
				}
				sink.propertyNamed("$LineLocation", term_746);
				Term term_954;
				{
					BufferSink buf_739 = sink.context().makeBuffer();
					buf_739.start(_M_STRING);
					buf_739.literal(6);
					buf_739.end();
					term_954 = buf_739.term();
				}
				sink.propertyNamed("$ColumnLocation", term_954);
				sink.start(_M__sTextChars);
				sink.literal(" == null || ");
				sink.end();
				Term term_872;
				{
					BufferSink buf_820 = sink.context().makeBuffer();
					buf_820.start(_M_STRING);
					buf_820.literal(1);
					buf_820.end();
					term_872 = buf_820.term();
				}
				sink.propertyNamed("$LineLocation", term_872);
				Term term_602;
				{
					BufferSink buf_801 = sink.context().makeBuffer();
					buf_801.start(_M_STRING);
					buf_801.literal(14);
					buf_801.end();
					term_602 = buf_801.term();
				}
				sink.propertyNamed("$ColumnLocation", term_602);
				sink.start(_M__sTextCons);
				Term term_738;
				{
					BufferSink buf_702 = sink.context().makeBuffer();
					buf_702.start(_M_STRING);
					buf_702.literal(1);
					buf_702.end();
					term_738 = buf_702.term();
				}
				sink.propertyNamed("$LineLocation", term_738);
				Term term_817;
				{
					BufferSink buf_818 = sink.context().makeBuffer();
					buf_818.start(_M_STRING);
					buf_818.literal(14);
					buf_818.end();
					term_817 = buf_818.term();
				}
				sink.propertyNamed("$ColumnLocation", term_817);
				sink.start(_M__sTextEmbed);
				Term term_1456;
				{
					BufferSink buf_899 = sink.context().makeBuffer();
					buf_899.start(_M_STRING);
					buf_899.literal(1);
					buf_899.end();
					term_1456 = buf_899.term();
				}
				sink.propertyNamed("$LineLocation", term_1456);
				Term term_674;
				{
					BufferSink buf_711 = sink.context().makeBuffer();
					buf_711.start(_M_STRING);
					buf_711.literal(14);
					buf_711.end();
					term_674 = buf_711.term();
				}
				sink.propertyNamed("$ColumnLocation", term_674);
				sink.start(_M_AsText);
				sink.copy(sub_120.ref());
				sink.end();
				sink.end();
				Term term_1333;
				{
					BufferSink buf_846 = sink.context().makeBuffer();
					buf_846.start(_M_STRING);
					buf_846.literal(1);
					buf_846.end();
					term_1333 = buf_846.term();
				}
				sink.propertyNamed("$LineLocation", term_1333);
				Term term_575;
				{
					BufferSink buf_706 = sink.context().makeBuffer();
					buf_706.start(_M_STRING);
					buf_706.literal(26);
					buf_706.end();
					term_575 = buf_706.term();
				}
				sink.propertyNamed("$ColumnLocation", term_575);
				sink.start(_M__sTextCons);
				Term term_920;
				{
					BufferSink buf_619 = sink.context().makeBuffer();
					buf_619.start(_M_STRING);
					buf_619.literal(1);
					buf_619.end();
					term_920 = buf_619.term();
				}
				sink.propertyNamed("$LineLocation", term_920);
				Term term_896;
				{
					BufferSink buf_1233 = sink.context().makeBuffer();
					buf_1233.start(_M_STRING);
					buf_1233.literal(26);
					buf_1233.end();
					term_896 = buf_1233.term();
				}
				sink.propertyNamed("$ColumnLocation", term_896);
				sink.start(_M__sTextChars);
				sink.literal(".lookup(");
				sink.end();
				Term term_527;
				{
					BufferSink buf_903 = sink.context().makeBuffer();
					buf_903.start(_M_STRING);
					buf_903.literal(1);
					buf_903.end();
					term_527 = buf_903.term();
				}
				sink.propertyNamed("$LineLocation", term_527);
				Term term_807;
				{
					BufferSink buf_496 = sink.context().makeBuffer();
					buf_496.start(_M_STRING);
					buf_496.literal(34);
					buf_496.end();
					term_807 = buf_496.term();
				}
				sink.propertyNamed("$ColumnLocation", term_807);
				sink.start(_M__sTextCons);
				Term term_932;
				{
					BufferSink buf_944 = sink.context().makeBuffer();
					buf_944.start(_M_STRING);
					buf_944.literal(1);
					buf_944.end();
					term_932 = buf_944.term();
				}
				sink.propertyNamed("$LineLocation", term_932);
				Term term_898;
				{
					BufferSink buf_602 = sink.context().makeBuffer();
					buf_602.start(_M_STRING);
					buf_602.literal(34);
					buf_602.end();
					term_898 = buf_602.term();
				}
				sink.propertyNamed("$ColumnLocation", term_898);
				sink.start(_M__sTextEmbed);
				Term term_1050;
				{
					BufferSink buf_968 = sink.context().makeBuffer();
					buf_968.start(_M_STRING);
					buf_968.literal(1);
					buf_968.end();
					term_1050 = buf_968.term();
				}
				sink.propertyNamed("$LineLocation", term_1050);
				Term term_1264;
				{
					BufferSink buf_580 = sink.context().makeBuffer();
					buf_580.start(_M_STRING);
					buf_580.literal(34);
					buf_580.end();
					term_1264 = buf_580.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1264);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_9));
				sink.start(_M_Variable);
				sink.copy(sub_116.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_1229;
				{
					BufferSink buf_792 = sink.context().makeBuffer();
					buf_792.start(_M_STRING);
					buf_792.literal(1);
					buf_792.end();
					term_1229 = buf_792.term();
				}
				sink.propertyNamed("$LineLocation", term_1229);
				Term term_861;
				{
					BufferSink buf_882 = sink.context().makeBuffer();
					buf_882.start(_M_STRING);
					buf_882.literal(42);
					buf_882.end();
					term_861 = buf_882.term();
				}
				sink.propertyNamed("$ColumnLocation", term_861);
				sink.start(_M__sTextCons);
				Term term_840;
				{
					BufferSink buf_626 = sink.context().makeBuffer();
					buf_626.start(_M_STRING);
					buf_626.literal(1);
					buf_626.end();
					term_840 = buf_626.term();
				}
				sink.propertyNamed("$LineLocation", term_840);
				Term term_892;
				{
					BufferSink buf_535 = sink.context().makeBuffer();
					buf_535.start(_M_STRING);
					buf_535.literal(42);
					buf_535.end();
					term_892 = buf_535.term();
				}
				sink.propertyNamed("$ColumnLocation", term_892);
				sink.start(_M__sTextChars);
				sink.literal(") == null) ");
				sink.end();
				Term term_1670;
				{
					BufferSink buf_470 = sink.context().makeBuffer();
					buf_470.start(_M_STRING);
					buf_470.literal(1);
					buf_470.end();
					term_1670 = buf_470.term();
				}
				sink.propertyNamed("$LineLocation", term_1670);
				Term term_1040;
				{
					BufferSink buf_552 = sink.context().makeBuffer();
					buf_552.start(_M_STRING);
					buf_552.literal(67);
					buf_552.end();
					term_1040 = buf_552.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1040);
				sink.start(_M__sTextCons);
				Term term_1020;
				{
					BufferSink buf_813 = sink.context().makeBuffer();
					buf_813.start(_M_STRING);
					buf_813.literal(1);
					buf_813.end();
					term_1020 = buf_813.term();
				}
				sink.propertyNamed("$LineLocation", term_1020);
				Term term_530;
				{
					BufferSink buf_544 = sink.context().makeBuffer();
					buf_544.start(_M_STRING);
					buf_544.literal(67);
					buf_544.end();
					term_530 = buf_544.term();
				}
				sink.propertyNamed("$ColumnLocation", term_530);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1324;
				{
					BufferSink buf_865 = sink.context().makeBuffer();
					buf_865.start(_M_STRING);
					buf_865.literal(1);
					buf_865.end();
					term_1324 = buf_865.term();
				}
				sink.propertyNamed("$LineLocation", term_1324);
				Term term_812;
				{
					BufferSink buf_924 = sink.context().makeBuffer();
					buf_924.start(_M_STRING);
					buf_924.literal(78);
					buf_924.end();
					term_812 = buf_924.term();
				}
				sink.propertyNamed("$ColumnLocation", term_812);
				sink.start(_M__sTextCons);
				Term term_989;
				{
					BufferSink buf_1064 = sink.context().makeBuffer();
					buf_1064.start(_M_STRING);
					buf_1064.literal(1);
					buf_1064.end();
					term_989 = buf_1064.term();
				}
				sink.propertyNamed("$LineLocation", term_989);
				Term term_800;
				{
					BufferSink buf_1045 = sink.context().makeBuffer();
					buf_1045.start(_M_STRING);
					buf_1045.literal(78);
					buf_1045.end();
					term_800 = buf_1045.term();
				}
				sink.propertyNamed("$ColumnLocation", term_800);
				sink.start(_M__sTextChars);
				sink.literal("{");
				sink.end();
				Term term_630;
				{
					BufferSink buf_1040 = sink.context().makeBuffer();
					buf_1040.start(_M_STRING);
					buf_1040.literal(2);
					buf_1040.end();
					term_630 = buf_1040.term();
				}
				sink.propertyNamed("$LineLocation", term_630);
				Term term_739;
				{
					BufferSink buf_447 = sink.context().makeBuffer();
					buf_447.start(_M_STRING);
					buf_447.literal(1);
					buf_447.end();
					term_739 = buf_447.term();
				}
				sink.propertyNamed("$ColumnLocation", term_739);
				sink.start(_M__sTextCons);
				Term term_1135;
				{
					BufferSink buf_880 = sink.context().makeBuffer();
					buf_880.start(_M_STRING);
					buf_880.literal(2);
					buf_880.end();
					term_1135 = buf_880.term();
				}
				sink.propertyNamed("$LineLocation", term_1135);
				Term term_902;
				{
					BufferSink buf_885 = sink.context().makeBuffer();
					buf_885.start(_M_STRING);
					buf_885.literal(2);
					buf_885.end();
					term_902 = buf_885.term();
				}
				sink.propertyNamed("$ColumnLocation", term_902);
				sink.start(_M__sTextIndent);
				Term term_774;
				{
					BufferSink buf_745 = sink.context().makeBuffer();
					buf_745.start(_M_STRING);
					buf_745.literal(2);
					buf_745.end();
					term_774 = buf_745.term();
				}
				sink.propertyNamed("$LineLocation", term_774);
				Term term_675;
				{
					BufferSink buf_730 = sink.context().makeBuffer();
					buf_730.start(_M_STRING);
					buf_730.literal(2);
					buf_730.end();
					term_675 = buf_730.term();
				}
				sink.propertyNamed("$ColumnLocation", term_675);
				sink.start(_M__sTextCons);
				Term term_547;
				{
					BufferSink buf_808 = sink.context().makeBuffer();
					buf_808.start(_M_STRING);
					buf_808.literal(2);
					buf_808.end();
					term_547 = buf_808.term();
				}
				sink.propertyNamed("$LineLocation", term_547);
				Term term_733;
				{
					BufferSink buf_1136 = sink.context().makeBuffer();
					buf_1136.start(_M_STRING);
					buf_1136.literal(2);
					buf_1136.end();
					term_733 = buf_1136.term();
				}
				sink.propertyNamed("$ColumnLocation", term_733);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_960;
				{
					BufferSink buf_1054 = sink.context().makeBuffer();
					buf_1054.start(_M_STRING);
					buf_1054.literal(2);
					buf_1054.end();
					term_960 = buf_1054.term();
				}
				sink.propertyNamed("$LineLocation", term_960);
				Term term_591;
				{
					BufferSink buf_585 = sink.context().makeBuffer();
					buf_585.start(_M_STRING);
					buf_585.literal(3);
					buf_585.end();
					term_591 = buf_585.term();
				}
				sink.propertyNamed("$ColumnLocation", term_591);
				sink.start(_M__sTextCons);
				Term term_711;
				{
					BufferSink buf_741 = sink.context().makeBuffer();
					buf_741.start(_M_STRING);
					buf_741.literal(2);
					buf_741.end();
					term_711 = buf_741.term();
				}
				sink.propertyNamed("$LineLocation", term_711);
				Term term_1265;
				{
					BufferSink buf_534 = sink.context().makeBuffer();
					buf_534.start(_M_STRING);
					buf_534.literal(3);
					buf_534.end();
					term_1265 = buf_534.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1265);
				sink.start(_M__sTextChars);
				sink.literal("  break ");
				sink.end();
				Term term_763;
				{
					BufferSink buf_964 = sink.context().makeBuffer();
					buf_964.start(_M_STRING);
					buf_964.literal(3);
					buf_964.end();
					term_763 = buf_964.term();
				}
				sink.propertyNamed("$LineLocation", term_763);
				Term term_728;
				{
					BufferSink buf_1254 = sink.context().makeBuffer();
					buf_1254.start(_M_STRING);
					buf_1254.literal(1);
					buf_1254.end();
					term_728 = buf_1254.term();
				}
				sink.propertyNamed("$ColumnLocation", term_728);
				sink.start(_M__sTextCons);
				Term term_1335;
				{
					BufferSink buf_1296 = sink.context().makeBuffer();
					buf_1296.start(_M_STRING);
					buf_1296.literal(3);
					buf_1296.end();
					term_1335 = buf_1296.term();
				}
				sink.propertyNamed("$LineLocation", term_1335);
				Term term_515;
				{
					BufferSink buf_731 = sink.context().makeBuffer();
					buf_731.start(_M_STRING);
					buf_731.literal(1);
					buf_731.end();
					term_515 = buf_731.term();
				}
				sink.propertyNamed("$ColumnLocation", term_515);
				sink.start(_M__sTextEmbed);
				Term term_985;
				{
					BufferSink buf_1570 = sink.context().makeBuffer();
					buf_1570.start(_M_STRING);
					buf_1570.literal(3);
					buf_1570.end();
					term_985 = buf_1570.term();
				}
				sink.propertyNamed("$LineLocation", term_985);
				Term term_1072;
				{
					BufferSink buf_931 = sink.context().makeBuffer();
					buf_931.start(_M_STRING);
					buf_931.literal(1);
					buf_931.end();
					term_1072 = buf_931.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1072);
				sink.start(_M_AsText);
				sink.copy(sub_202.ref());
				sink.end();
				sink.end();
				Term term_917;
				{
					BufferSink buf_1351 = sink.context().makeBuffer();
					buf_1351.start(_M_STRING);
					buf_1351.literal(3);
					buf_1351.end();
					term_917 = buf_1351.term();
				}
				sink.propertyNamed("$LineLocation", term_917);
				Term term_996;
				{
					BufferSink buf_500 = sink.context().makeBuffer();
					buf_500.start(_M_STRING);
					buf_500.literal(9);
					buf_500.end();
					term_996 = buf_500.term();
				}
				sink.propertyNamed("$ColumnLocation", term_996);
				sink.start(_M__sTextCons);
				Term term_1316;
				{
					BufferSink buf_950 = sink.context().makeBuffer();
					buf_950.start(_M_STRING);
					buf_950.literal(3);
					buf_950.end();
					term_1316 = buf_950.term();
				}
				sink.propertyNamed("$LineLocation", term_1316);
				Term term_888;
				{
					BufferSink buf_1365 = sink.context().makeBuffer();
					buf_1365.start(_M_STRING);
					buf_1365.literal(9);
					buf_1365.end();
					term_888 = buf_1365.term();
				}
				sink.propertyNamed("$ColumnLocation", term_888);
				sink.start(_M__sTextChars);
				sink.literal(";");
				sink.end();
				Term term_596;
				{
					BufferSink buf_723 = sink.context().makeBuffer();
					buf_723.start(_M_STRING);
					buf_723.literal(3);
					buf_723.end();
					term_596 = buf_723.term();
				}
				sink.propertyNamed("$LineLocation", term_596);
				Term term_1100;
				{
					BufferSink buf_1248 = sink.context().makeBuffer();
					buf_1248.start(_M_STRING);
					buf_1248.literal(17);
					buf_1248.end();
					term_1100 = buf_1248.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1100);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				Term term_924;
				{
					BufferSink buf_609 = sink.context().makeBuffer();
					buf_609.start(_M_STRING);
					buf_609.literal(3);
					buf_609.end();
					term_924 = buf_609.term();
				}
				sink.propertyNamed("$LineLocation", term_924);
				Term term_897;
				{
					BufferSink buf_712 = sink.context().makeBuffer();
					buf_712.start(_M_STRING);
					buf_712.literal(18);
					buf_712.end();
					term_897 = buf_712.term();
				}
				sink.propertyNamed("$ColumnLocation", term_897);
				sink.start(_M__sTextCons);
				Term term_528;
				{
					BufferSink buf_876 = sink.context().makeBuffer();
					buf_876.start(_M_STRING);
					buf_876.literal(3);
					buf_876.end();
					term_528 = buf_876.term();
				}
				sink.propertyNamed("$LineLocation", term_528);
				Term term_513;
				{
					BufferSink buf_878 = sink.context().makeBuffer();
					buf_878.start(_M_STRING);
					buf_878.literal(18);
					buf_878.end();
					term_513 = buf_878.term();
				}
				sink.propertyNamed("$ColumnLocation", term_513);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_931;
				{
					BufferSink buf_1086 = sink.context().makeBuffer();
					buf_1086.start(_M_STRING);
					buf_1086.literal(3);
					buf_1086.end();
					term_931 = buf_1086.term();
				}
				sink.propertyNamed("$LineLocation", term_931);
				Term term_941;
				{
					BufferSink buf_628 = sink.context().makeBuffer();
					buf_628.start(_M_STRING);
					buf_628.literal(19);
					buf_628.end();
					term_941 = buf_628.term();
				}
				sink.propertyNamed("$ColumnLocation", term_941);
				sink.start(_M__sTextCons);
				Term term_1317;
				{
					BufferSink buf_707 = sink.context().makeBuffer();
					buf_707.start(_M_STRING);
					buf_707.literal(3);
					buf_707.end();
					term_1317 = buf_707.term();
				}
				sink.propertyNamed("$LineLocation", term_1317);
				Term term_1247;
				{
					BufferSink buf_803 = sink.context().makeBuffer();
					buf_803.start(_M_STRING);
					buf_803.literal(19);
					buf_803.end();
					term_1247 = buf_803.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1247);
				sink.start(_M__sTextChars);
				sink.literal("}");
				sink.end();
				Term term_1143;
				{
					BufferSink buf_676 = sink.context().makeBuffer();
					buf_676.start(_M_STRING);
					buf_676.literal(4);
					buf_676.end();
					term_1143 = buf_676.term();
				}
				sink.propertyNamed("$LineLocation", term_1143);
				Term term_544;
				{
					BufferSink buf_1134 = sink.context().makeBuffer();
					buf_1134.start(_M_STRING);
					buf_1134.literal(1);
					buf_1134.end();
					term_544 = buf_1134.term();
				}
				sink.propertyNamed("$ColumnLocation", term_544);
				sink.start(_M__sTextCons);
				Term term_857;
				{
					BufferSink buf_1408 = sink.context().makeBuffer();
					buf_1408.start(_M_STRING);
					buf_1408.literal(4);
					buf_1408.end();
					term_857 = buf_1408.term();
				}
				sink.propertyNamed("$LineLocation", term_857);
				Term term_1231;
				{
					BufferSink buf_1315 = sink.context().makeBuffer();
					buf_1315.start(_M_STRING);
					buf_1315.literal(1);
					buf_1315.end();
					term_1231 = buf_1315.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1231);
				sink.start(_M__sTextEmbed);
				Term term_725;
				{
					BufferSink buf_1221 = sink.context().makeBuffer();
					buf_1221.start(_M_STRING);
					buf_1221.literal(4);
					buf_1221.end();
					term_725 = buf_1221.term();
				}
				sink.propertyNamed("$LineLocation", term_725);
				Term term_1014;
				{
					BufferSink buf_1062 = sink.context().makeBuffer();
					buf_1062.start(_M_STRING);
					buf_1062.literal(1);
					buf_1062.end();
					term_1014 = buf_1062.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1014);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_9));
				Term term_617;
				{
					BufferSink buf_795 = sink.context().makeBuffer();
					buf_795.start(_M_OK);
					buf_795.end();
					term_617 = buf_795.term();
				}
				sink.substitute(term_686.ref(), new Variable[]
					{var_33}, new Term[]
					{term_617});
				sink.end();
				sink.end();
				Term term_1042;
				{
					BufferSink buf_588 = sink.context().makeBuffer();
					buf_588.start(_M_STRING);
					buf_588.literal(4);
					buf_588.end();
					term_1042 = buf_588.term();
				}
				sink.propertyNamed("$LineLocation", term_1042);
				Term term_1099;
				{
					BufferSink buf_843 = sink.context().makeBuffer();
					buf_843.start(_M_STRING);
					buf_843.literal(2);
					buf_843.end();
					term_1099 = buf_843.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1099);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_34 :
			{
				Term value_53 = props_9 == null ? null : props_9.lookup("$props");
				if (value_53 == null)
				{
					break label_34;
				}
				if (value_53.descriptor() != _M_TEXT)
				{
					break label_34;
				}
				Term sub_187 = value_53.sub(0).ref();
				/* #props=sub */
				Term value_60 = props_9 == null ? null : props_9.lookup("$caselabel");
				if (value_60 == null)
				{
					break label_34;
				}
				if (value_60.descriptor() != _M_TEXT)
				{
					break label_34;
				}
				Term sub_323 = value_60.sub(0).ref();
				/* #label=sub */
				if (term_558.descriptor() != _M_Crsx_xproperty_xA5)
				{
					break label_34;
				}
				Term sub_293 = term_558.sub(0).ref();
				Term sub_388 = term_558.sub(1).ref();
				/* #VARIABLE=sub */
				/* #term=term */
				/* #=term *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_768;
				{
					BufferSink buf_1083 = sink.context().makeBuffer();
					buf_1083.start(_M_STRING);
					buf_1083.literal(1);
					buf_1083.end();
					term_768 = buf_1083.term();
				}
				sink.propertyNamed("$LineLocation", term_768);
				Term term_1597;
				{
					BufferSink buf_971 = sink.context().makeBuffer();
					buf_971.start(_M_STRING);
					buf_971.literal(1);
					buf_971.end();
					term_1597 = buf_971.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1597);
				sink.start(_M__sTextCons);
				Term term_938;
				{
					BufferSink buf_541 = sink.context().makeBuffer();
					buf_541.start(_M_STRING);
					buf_541.literal(1);
					buf_541.end();
					term_938 = buf_541.term();
				}
				sink.propertyNamed("$LineLocation", term_938);
				Term term_704;
				{
					BufferSink buf_633 = sink.context().makeBuffer();
					buf_633.start(_M_STRING);
					buf_633.literal(1);
					buf_633.end();
					term_704 = buf_633.term();
				}
				sink.propertyNamed("$ColumnLocation", term_704);
				sink.start(_M__sTextChars);
				sink.literal("if (");
				sink.end();
				Term term_1356;
				{
					BufferSink buf_682 = sink.context().makeBuffer();
					buf_682.start(_M_STRING);
					buf_682.literal(1);
					buf_682.end();
					term_1356 = buf_682.term();
				}
				sink.propertyNamed("$LineLocation", term_1356);
				Term term_701;
				{
					BufferSink buf_1298 = sink.context().makeBuffer();
					buf_1298.start(_M_STRING);
					buf_1298.literal(2);
					buf_1298.end();
					term_701 = buf_1298.term();
				}
				sink.propertyNamed("$ColumnLocation", term_701);
				sink.start(_M__sTextCons);
				Term term_1003;
				{
					BufferSink buf_1770 = sink.context().makeBuffer();
					buf_1770.start(_M_STRING);
					buf_1770.literal(1);
					buf_1770.end();
					term_1003 = buf_1770.term();
				}
				sink.propertyNamed("$LineLocation", term_1003);
				Term term_1180;
				{
					BufferSink buf_1316 = sink.context().makeBuffer();
					buf_1316.start(_M_STRING);
					buf_1316.literal(2);
					buf_1316.end();
					term_1180 = buf_1316.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1180);
				sink.start(_M__sTextEmbed);
				Term term_1185;
				{
					BufferSink buf_991 = sink.context().makeBuffer();
					buf_991.start(_M_STRING);
					buf_991.literal(1);
					buf_991.end();
					term_1185 = buf_991.term();
				}
				sink.propertyNamed("$LineLocation", term_1185);
				Term term_1007;
				{
					BufferSink buf_578 = sink.context().makeBuffer();
					buf_578.start(_M_STRING);
					buf_578.literal(2);
					buf_578.end();
					term_1007 = buf_578.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1007);
				sink.start(_M_AsText);
				sink.copy(sub_187.ref());
				sink.end();
				sink.end();
				Term term_520;
				{
					BufferSink buf_957 = sink.context().makeBuffer();
					buf_957.start(_M_STRING);
					buf_957.literal(1);
					buf_957.end();
					term_520 = buf_957.term();
				}
				sink.propertyNamed("$LineLocation", term_520);
				Term term_690;
				{
					BufferSink buf_823 = sink.context().makeBuffer();
					buf_823.start(_M_STRING);
					buf_823.literal(6);
					buf_823.end();
					term_690 = buf_823.term();
				}
				sink.propertyNamed("$ColumnLocation", term_690);
				sink.start(_M__sTextCons);
				Term term_1142;
				{
					BufferSink buf_735 = sink.context().makeBuffer();
					buf_735.start(_M_STRING);
					buf_735.literal(1);
					buf_735.end();
					term_1142 = buf_735.term();
				}
				sink.propertyNamed("$LineLocation", term_1142);
				Term term_1102;
				{
					BufferSink buf_1211 = sink.context().makeBuffer();
					buf_1211.start(_M_STRING);
					buf_1211.literal(6);
					buf_1211.end();
					term_1102 = buf_1211.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1102);
				sink.start(_M__sTextChars);
				sink.literal(" != null && ");
				sink.end();
				Term term_1390;
				{
					BufferSink buf_719 = sink.context().makeBuffer();
					buf_719.start(_M_STRING);
					buf_719.literal(1);
					buf_719.end();
					term_1390 = buf_719.term();
				}
				sink.propertyNamed("$LineLocation", term_1390);
				Term term_661;
				{
					BufferSink buf_901 = sink.context().makeBuffer();
					buf_901.start(_M_STRING);
					buf_901.literal(14);
					buf_901.end();
					term_661 = buf_901.term();
				}
				sink.propertyNamed("$ColumnLocation", term_661);
				sink.start(_M__sTextCons);
				Term term_505;
				{
					BufferSink buf_1082 = sink.context().makeBuffer();
					buf_1082.start(_M_STRING);
					buf_1082.literal(1);
					buf_1082.end();
					term_505 = buf_1082.term();
				}
				sink.propertyNamed("$LineLocation", term_505);
				Term term_1091;
				{
					BufferSink buf_800 = sink.context().makeBuffer();
					buf_800.start(_M_STRING);
					buf_800.literal(14);
					buf_800.end();
					term_1091 = buf_800.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1091);
				sink.start(_M__sTextEmbed);
				Term term_742;
				{
					BufferSink buf_892 = sink.context().makeBuffer();
					buf_892.start(_M_STRING);
					buf_892.literal(1);
					buf_892.end();
					term_742 = buf_892.term();
				}
				sink.propertyNamed("$LineLocation", term_742);
				Term term_993;
				{
					BufferSink buf_933 = sink.context().makeBuffer();
					buf_933.start(_M_STRING);
					buf_933.literal(14);
					buf_933.end();
					term_993 = buf_933.term();
				}
				sink.propertyNamed("$ColumnLocation", term_993);
				sink.start(_M_AsText);
				sink.copy(sub_187.ref());
				sink.end();
				sink.end();
				Term term_856;
				{
					BufferSink buf_680 = sink.context().makeBuffer();
					buf_680.start(_M_STRING);
					buf_680.literal(1);
					buf_680.end();
					term_856 = buf_680.term();
				}
				sink.propertyNamed("$LineLocation", term_856);
				Term term_1073;
				{
					BufferSink buf_1112 = sink.context().makeBuffer();
					buf_1112.start(_M_STRING);
					buf_1112.literal(26);
					buf_1112.end();
					term_1073 = buf_1112.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1073);
				sink.start(_M__sTextCons);
				Term term_562;
				{
					BufferSink buf_597 = sink.context().makeBuffer();
					buf_597.start(_M_STRING);
					buf_597.literal(1);
					buf_597.end();
					term_562 = buf_597.term();
				}
				sink.propertyNamed("$LineLocation", term_562);
				Term term_830;
				{
					BufferSink buf_962 = sink.context().makeBuffer();
					buf_962.start(_M_STRING);
					buf_962.literal(26);
					buf_962.end();
					term_830 = buf_962.term();
				}
				sink.propertyNamed("$ColumnLocation", term_830);
				sink.start(_M__sTextChars);
				sink.literal(".lookup(");
				sink.end();
				Term term_724;
				{
					BufferSink buf_604 = sink.context().makeBuffer();
					buf_604.start(_M_STRING);
					buf_604.literal(1);
					buf_604.end();
					term_724 = buf_604.term();
				}
				sink.propertyNamed("$LineLocation", term_724);
				Term term_619;
				{
					BufferSink buf_1280 = sink.context().makeBuffer();
					buf_1280.start(_M_STRING);
					buf_1280.literal(34);
					buf_1280.end();
					term_619 = buf_1280.term();
				}
				sink.propertyNamed("$ColumnLocation", term_619);
				sink.start(_M__sTextCons);
				Term term_916;
				{
					BufferSink buf_1147 = sink.context().makeBuffer();
					buf_1147.start(_M_STRING);
					buf_1147.literal(1);
					buf_1147.end();
					term_916 = buf_1147.term();
				}
				sink.propertyNamed("$LineLocation", term_916);
				Term term_761;
				{
					BufferSink buf_862 = sink.context().makeBuffer();
					buf_862.start(_M_STRING);
					buf_862.literal(34);
					buf_862.end();
					term_761 = buf_862.term();
				}
				sink.propertyNamed("$ColumnLocation", term_761);
				sink.start(_M__sTextEmbed);
				Term term_1164;
				{
					BufferSink buf_1058 = sink.context().makeBuffer();
					buf_1058.start(_M_STRING);
					buf_1058.literal(1);
					buf_1058.end();
					term_1164 = buf_1058.term();
				}
				sink.propertyNamed("$LineLocation", term_1164);
				Term term_1033;
				{
					BufferSink buf_871 = sink.context().makeBuffer();
					buf_871.start(_M_STRING);
					buf_871.literal(34);
					buf_871.end();
					term_1033 = buf_871.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1033);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_9));
				sink.start(_M_Variable);
				sink.copy(sub_388.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_1080;
				{
					BufferSink buf_918 = sink.context().makeBuffer();
					buf_918.start(_M_STRING);
					buf_918.literal(1);
					buf_918.end();
					term_1080 = buf_918.term();
				}
				sink.propertyNamed("$LineLocation", term_1080);
				Term term_1663;
				{
					BufferSink buf_819 = sink.context().makeBuffer();
					buf_819.start(_M_STRING);
					buf_819.literal(42);
					buf_819.end();
					term_1663 = buf_819.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1663);
				sink.start(_M__sTextCons);
				Term term_987;
				{
					BufferSink buf_333 = sink.context().makeBuffer();
					buf_333.start(_M_STRING);
					buf_333.literal(1);
					buf_333.end();
					term_987 = buf_333.term();
				}
				sink.propertyNamed("$LineLocation", term_987);
				Term term_867;
				{
					BufferSink buf_982 = sink.context().makeBuffer();
					buf_982.start(_M_STRING);
					buf_982.literal(42);
					buf_982.end();
					term_867 = buf_982.term();
				}
				sink.propertyNamed("$ColumnLocation", term_867);
				sink.start(_M__sTextChars);
				sink.literal(") == null) ");
				sink.end();
				Term term_381;
				{
					BufferSink buf_615 = sink.context().makeBuffer();
					buf_615.start(_M_STRING);
					buf_615.literal(1);
					buf_615.end();
					term_381 = buf_615.term();
				}
				sink.propertyNamed("$LineLocation", term_381);
				Term term_695;
				{
					BufferSink buf_411 = sink.context().makeBuffer();
					buf_411.start(_M_STRING);
					buf_411.literal(67);
					buf_411.end();
					term_695 = buf_411.term();
				}
				sink.propertyNamed("$ColumnLocation", term_695);
				sink.start(_M__sTextCons);
				Term term_939;
				{
					BufferSink buf_756 = sink.context().makeBuffer();
					buf_756.start(_M_STRING);
					buf_756.literal(1);
					buf_756.end();
					term_939 = buf_756.term();
				}
				sink.propertyNamed("$LineLocation", term_939);
				Term term_1590;
				{
					BufferSink buf_815 = sink.context().makeBuffer();
					buf_815.start(_M_STRING);
					buf_815.literal(67);
					buf_815.end();
					term_1590 = buf_815.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1590);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1065;
				{
					BufferSink buf_738 = sink.context().makeBuffer();
					buf_738.start(_M_STRING);
					buf_738.literal(1);
					buf_738.end();
					term_1065 = buf_738.term();
				}
				sink.propertyNamed("$LineLocation", term_1065);
				Term term_615;
				{
					BufferSink buf_1043 = sink.context().makeBuffer();
					buf_1043.start(_M_STRING);
					buf_1043.literal(78);
					buf_1043.end();
					term_615 = buf_1043.term();
				}
				sink.propertyNamed("$ColumnLocation", term_615);
				sink.start(_M__sTextCons);
				Term term_1162;
				{
					BufferSink buf_837 = sink.context().makeBuffer();
					buf_837.start(_M_STRING);
					buf_837.literal(1);
					buf_837.end();
					term_1162 = buf_837.term();
				}
				sink.propertyNamed("$LineLocation", term_1162);
				Term term_935;
				{
					BufferSink buf_1056 = sink.context().makeBuffer();
					buf_1056.start(_M_STRING);
					buf_1056.literal(78);
					buf_1056.end();
					term_935 = buf_1056.term();
				}
				sink.propertyNamed("$ColumnLocation", term_935);
				sink.start(_M__sTextChars);
				sink.literal("{");
				sink.end();
				Term term_1381;
				{
					BufferSink buf_839 = sink.context().makeBuffer();
					buf_839.start(_M_STRING);
					buf_839.literal(2);
					buf_839.end();
					term_1381 = buf_839.term();
				}
				sink.propertyNamed("$LineLocation", term_1381);
				Term term_1196;
				{
					BufferSink buf_1339 = sink.context().makeBuffer();
					buf_1339.start(_M_STRING);
					buf_1339.literal(1);
					buf_1339.end();
					term_1196 = buf_1339.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1196);
				sink.start(_M__sTextCons);
				Term term_1412;
				{
					BufferSink buf_1063 = sink.context().makeBuffer();
					buf_1063.start(_M_STRING);
					buf_1063.literal(2);
					buf_1063.end();
					term_1412 = buf_1063.term();
				}
				sink.propertyNamed("$LineLocation", term_1412);
				Term term_914;
				{
					BufferSink buf_1036 = sink.context().makeBuffer();
					buf_1036.start(_M_STRING);
					buf_1036.literal(2);
					buf_1036.end();
					term_914 = buf_1036.term();
				}
				sink.propertyNamed("$ColumnLocation", term_914);
				sink.start(_M__sTextIndent);
				Term term_1452;
				{
					BufferSink buf_1149 = sink.context().makeBuffer();
					buf_1149.start(_M_STRING);
					buf_1149.literal(2);
					buf_1149.end();
					term_1452 = buf_1149.term();
				}
				sink.propertyNamed("$LineLocation", term_1452);
				Term term_525;
				{
					BufferSink buf_740 = sink.context().makeBuffer();
					buf_740.start(_M_STRING);
					buf_740.literal(2);
					buf_740.end();
					term_525 = buf_740.term();
				}
				sink.propertyNamed("$ColumnLocation", term_525);
				sink.start(_M__sTextCons);
				Term term_1168;
				{
					BufferSink buf_1039 = sink.context().makeBuffer();
					buf_1039.start(_M_STRING);
					buf_1039.literal(2);
					buf_1039.end();
					term_1168 = buf_1039.term();
				}
				sink.propertyNamed("$LineLocation", term_1168);
				Term term_751;
				{
					BufferSink buf_524 = sink.context().makeBuffer();
					buf_524.start(_M_STRING);
					buf_524.literal(2);
					buf_524.end();
					term_751 = buf_524.term();
				}
				sink.propertyNamed("$ColumnLocation", term_751);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_720;
				{
					BufferSink buf_856 = sink.context().makeBuffer();
					buf_856.start(_M_STRING);
					buf_856.literal(2);
					buf_856.end();
					term_720 = buf_856.term();
				}
				sink.propertyNamed("$LineLocation", term_720);
				Term term_666;
				{
					BufferSink buf_1053 = sink.context().makeBuffer();
					buf_1053.start(_M_STRING);
					buf_1053.literal(3);
					buf_1053.end();
					term_666 = buf_1053.term();
				}
				sink.propertyNamed("$ColumnLocation", term_666);
				sink.start(_M__sTextCons);
				Term term_1150;
				{
					BufferSink buf_1848 = sink.context().makeBuffer();
					buf_1848.start(_M_STRING);
					buf_1848.literal(2);
					buf_1848.end();
					term_1150 = buf_1848.term();
				}
				sink.propertyNamed("$LineLocation", term_1150);
				Term term_1527;
				{
					BufferSink buf_1038 = sink.context().makeBuffer();
					buf_1038.start(_M_STRING);
					buf_1038.literal(3);
					buf_1038.end();
					term_1527 = buf_1038.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1527);
				sink.start(_M__sTextChars);
				sink.literal("  break ");
				sink.end();
				Term term_1256;
				{
					BufferSink buf_1193 = sink.context().makeBuffer();
					buf_1193.start(_M_STRING);
					buf_1193.literal(3);
					buf_1193.end();
					term_1256 = buf_1193.term();
				}
				sink.propertyNamed("$LineLocation", term_1256);
				Term term_1165;
				{
					BufferSink buf_886 = sink.context().makeBuffer();
					buf_886.start(_M_STRING);
					buf_886.literal(1);
					buf_886.end();
					term_1165 = buf_886.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1165);
				sink.start(_M__sTextCons);
				Term term_1281;
				{
					BufferSink buf_732 = sink.context().makeBuffer();
					buf_732.start(_M_STRING);
					buf_732.literal(3);
					buf_732.end();
					term_1281 = buf_732.term();
				}
				sink.propertyNamed("$LineLocation", term_1281);
				Term term_1095;
				{
					BufferSink buf_704 = sink.context().makeBuffer();
					buf_704.start(_M_STRING);
					buf_704.literal(1);
					buf_704.end();
					term_1095 = buf_704.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1095);
				sink.start(_M__sTextEmbed);
				Term term_1126;
				{
					BufferSink buf_487 = sink.context().makeBuffer();
					buf_487.start(_M_STRING);
					buf_487.literal(3);
					buf_487.end();
					term_1126 = buf_487.term();
				}
				sink.propertyNamed("$LineLocation", term_1126);
				Term term_990;
				{
					BufferSink buf_641 = sink.context().makeBuffer();
					buf_641.start(_M_STRING);
					buf_641.literal(1);
					buf_641.end();
					term_990 = buf_641.term();
				}
				sink.propertyNamed("$ColumnLocation", term_990);
				sink.start(_M_AsText);
				sink.copy(sub_323.ref());
				sink.end();
				sink.end();
				Term term_1370;
				{
					BufferSink buf_1297 = sink.context().makeBuffer();
					buf_1297.start(_M_STRING);
					buf_1297.literal(3);
					buf_1297.end();
					term_1370 = buf_1297.term();
				}
				sink.propertyNamed("$LineLocation", term_1370);
				Term term_930;
				{
					BufferSink buf_938 = sink.context().makeBuffer();
					buf_938.start(_M_STRING);
					buf_938.literal(9);
					buf_938.end();
					term_930 = buf_938.term();
				}
				sink.propertyNamed("$ColumnLocation", term_930);
				sink.start(_M__sTextCons);
				Term term_976;
				{
					BufferSink buf_841 = sink.context().makeBuffer();
					buf_841.start(_M_STRING);
					buf_841.literal(3);
					buf_841.end();
					term_976 = buf_841.term();
				}
				sink.propertyNamed("$LineLocation", term_976);
				Term term_1557;
				{
					BufferSink buf_1285 = sink.context().makeBuffer();
					buf_1285.start(_M_STRING);
					buf_1285.literal(9);
					buf_1285.end();
					term_1557 = buf_1285.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1557);
				sink.start(_M__sTextChars);
				sink.literal(";");
				sink.end();
				Term term_1114;
				{
					BufferSink buf_824 = sink.context().makeBuffer();
					buf_824.start(_M_STRING);
					buf_824.literal(3);
					buf_824.end();
					term_1114 = buf_824.term();
				}
				sink.propertyNamed("$LineLocation", term_1114);
				Term term_1261;
				{
					BufferSink buf_1110 = sink.context().makeBuffer();
					buf_1110.start(_M_STRING);
					buf_1110.literal(17);
					buf_1110.end();
					term_1261 = buf_1110.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1261);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				Term term_849;
				{
					BufferSink buf_1092 = sink.context().makeBuffer();
					buf_1092.start(_M_STRING);
					buf_1092.literal(3);
					buf_1092.end();
					term_849 = buf_1092.term();
				}
				sink.propertyNamed("$LineLocation", term_849);
				Term term_1330;
				{
					BufferSink buf_1305 = sink.context().makeBuffer();
					buf_1305.start(_M_STRING);
					buf_1305.literal(18);
					buf_1305.end();
					term_1330 = buf_1305.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1330);
				sink.start(_M__sTextCons);
				Term term_1051;
				{
					BufferSink buf_651 = sink.context().makeBuffer();
					buf_651.start(_M_STRING);
					buf_651.literal(3);
					buf_651.end();
					term_1051 = buf_651.term();
				}
				sink.propertyNamed("$LineLocation", term_1051);
				Term term_1043;
				{
					BufferSink buf_669 = sink.context().makeBuffer();
					buf_669.start(_M_STRING);
					buf_669.literal(18);
					buf_669.end();
					term_1043 = buf_669.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1043);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1037;
				{
					BufferSink buf_900 = sink.context().makeBuffer();
					buf_900.start(_M_STRING);
					buf_900.literal(3);
					buf_900.end();
					term_1037 = buf_900.term();
				}
				sink.propertyNamed("$LineLocation", term_1037);
				Term term_1115;
				{
					BufferSink buf_1001 = sink.context().makeBuffer();
					buf_1001.start(_M_STRING);
					buf_1001.literal(19);
					buf_1001.end();
					term_1115 = buf_1001.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1115);
				sink.start(_M__sTextCons);
				Term term_778;
				{
					BufferSink buf_1363 = sink.context().makeBuffer();
					buf_1363.start(_M_STRING);
					buf_1363.literal(3);
					buf_1363.end();
					term_778 = buf_1363.term();
				}
				sink.propertyNamed("$LineLocation", term_778);
				Term term_1011;
				{
					BufferSink buf_909 = sink.context().makeBuffer();
					buf_909.start(_M_STRING);
					buf_909.literal(19);
					buf_909.end();
					term_1011 = buf_909.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1011);
				sink.start(_M__sTextChars);
				sink.literal("}");
				sink.end();
				Term term_1551;
				{
					BufferSink buf_590 = sink.context().makeBuffer();
					buf_590.start(_M_STRING);
					buf_590.literal(4);
					buf_590.end();
					term_1551 = buf_590.term();
				}
				sink.propertyNamed("$LineLocation", term_1551);
				Term term_1119;
				{
					BufferSink buf_1108 = sink.context().makeBuffer();
					buf_1108.start(_M_STRING);
					buf_1108.literal(1);
					buf_1108.end();
					term_1119 = buf_1108.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1119);
				sink.start(_M__sTextCons);
				Term term_785;
				{
					BufferSink buf_765 = sink.context().makeBuffer();
					buf_765.start(_M_STRING);
					buf_765.literal(4);
					buf_765.end();
					term_785 = buf_765.term();
				}
				sink.propertyNamed("$LineLocation", term_785);
				Term term_921;
				{
					BufferSink buf_999 = sink.context().makeBuffer();
					buf_999.start(_M_STRING);
					buf_999.literal(1);
					buf_999.end();
					term_921 = buf_999.term();
				}
				sink.propertyNamed("$ColumnLocation", term_921);
				sink.start(_M__sTextEmbed);
				Term term_952;
				{
					BufferSink buf_821 = sink.context().makeBuffer();
					buf_821.start(_M_STRING);
					buf_821.literal(4);
					buf_821.end();
					term_952 = buf_821.term();
				}
				sink.propertyNamed("$LineLocation", term_952);
				Term term_1223;
				{
					BufferSink buf_537 = sink.context().makeBuffer();
					buf_537.start(_M_STRING);
					buf_537.literal(1);
					buf_537.end();
					term_1223 = buf_537.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1223);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_9));
				Term term_1267;
				{
					BufferSink buf_951 = sink.context().makeBuffer();
					buf_951.start(_M_OK);
					buf_951.end();
					term_1267 = buf_951.term();
				}
				sink.substitute(term_686.ref(), new Variable[]
					{var_33}, new Term[]
					{term_1267});
				sink.end();
				sink.end();
				Term term_958;
				{
					BufferSink buf_687 = sink.context().makeBuffer();
					buf_687.start(_M_STRING);
					buf_687.literal(4);
					buf_687.end();
					term_958 = buf_687.term();
				}
				sink.propertyNamed("$LineLocation", term_958);
				Term term_1105;
				{
					BufferSink buf_853 = sink.context().makeBuffer();
					buf_853.start(_M_STRING);
					buf_853.literal(2);
					buf_853.end();
					term_1105 = buf_853.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1105);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_152 :
			{
				Term value_93 = props_9 == null ? null : props_9.lookup("$props");
				if (value_93 == null)
				{
					break label_152;
				}
				if (value_93.descriptor() != _M_TEXT)
				{
					break label_152;
				}
				Term sub_256 = value_93.sub(0).ref();
				/* #props=sub */
				Term value_79 = props_9 == null ? null : props_9.lookup("$caselabel");
				if (value_79 == null)
				{
					break label_152;
				}
				if (value_79.descriptor() != _M_TEXT)
				{
					break label_152;
				}
				Term sub_352 = value_79.sub(0).ref();
				/* #label=sub */
				if (term_558.descriptor() != _M_Crsx_xproperty_xA7)
				{
					break label_152;
				}
				Term sub_163 = term_558.sub(0).ref();
				/* #STRING=sub */
				/* #term=term */
				/* #=term *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_850;
				{
					BufferSink buf_764 = sink.context().makeBuffer();
					buf_764.start(_M_STRING);
					buf_764.literal(1);
					buf_764.end();
					term_850 = buf_764.term();
				}
				sink.propertyNamed("$LineLocation", term_850);
				Term term_682;
				{
					BufferSink buf_1191 = sink.context().makeBuffer();
					buf_1191.start(_M_STRING);
					buf_1191.literal(1);
					buf_1191.end();
					term_682 = buf_1191.term();
				}
				sink.propertyNamed("$ColumnLocation", term_682);
				sink.start(_M__sTextCons);
				Term term_782;
				{
					BufferSink buf_979 = sink.context().makeBuffer();
					buf_979.start(_M_STRING);
					buf_979.literal(1);
					buf_979.end();
					term_782 = buf_979.term();
				}
				sink.propertyNamed("$LineLocation", term_782);
				Term term_964;
				{
					BufferSink buf_1024 = sink.context().makeBuffer();
					buf_1024.start(_M_STRING);
					buf_1024.literal(1);
					buf_1024.end();
					term_964 = buf_1024.term();
				}
				sink.propertyNamed("$ColumnLocation", term_964);
				sink.start(_M__sTextChars);
				sink.literal("if (");
				sink.end();
				Term term_729;
				{
					BufferSink buf_639 = sink.context().makeBuffer();
					buf_639.start(_M_STRING);
					buf_639.literal(1);
					buf_639.end();
					term_729 = buf_639.term();
				}
				sink.propertyNamed("$LineLocation", term_729);
				Term term_1178;
				{
					BufferSink buf_947 = sink.context().makeBuffer();
					buf_947.start(_M_STRING);
					buf_947.literal(2);
					buf_947.end();
					term_1178 = buf_947.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1178);
				sink.start(_M__sTextCons);
				Term term_814;
				{
					BufferSink buf_952 = sink.context().makeBuffer();
					buf_952.start(_M_STRING);
					buf_952.literal(1);
					buf_952.end();
					term_814 = buf_952.term();
				}
				sink.propertyNamed("$LineLocation", term_814);
				Term term_1006;
				{
					BufferSink buf_790 = sink.context().makeBuffer();
					buf_790.start(_M_STRING);
					buf_790.literal(2);
					buf_790.end();
					term_1006 = buf_790.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1006);
				sink.start(_M__sTextEmbed);
				Term term_833;
				{
					BufferSink buf_607 = sink.context().makeBuffer();
					buf_607.start(_M_STRING);
					buf_607.literal(1);
					buf_607.end();
					term_833 = buf_607.term();
				}
				sink.propertyNamed("$LineLocation", term_833);
				Term term_1224;
				{
					BufferSink buf_757 = sink.context().makeBuffer();
					buf_757.start(_M_STRING);
					buf_757.literal(2);
					buf_757.end();
					term_1224 = buf_757.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1224);
				sink.start(_M_AsText);
				sink.copy(sub_256.ref());
				sink.end();
				sink.end();
				Term term_1364;
				{
					BufferSink buf_1080 = sink.context().makeBuffer();
					buf_1080.start(_M_STRING);
					buf_1080.literal(1);
					buf_1080.end();
					term_1364 = buf_1080.term();
				}
				sink.propertyNamed("$LineLocation", term_1364);
				Term term_1379;
				{
					BufferSink buf_965 = sink.context().makeBuffer();
					buf_965.start(_M_STRING);
					buf_965.literal(6);
					buf_965.end();
					term_1379 = buf_965.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1379);
				sink.start(_M__sTextCons);
				Term term_1052;
				{
					BufferSink buf_715 = sink.context().makeBuffer();
					buf_715.start(_M_STRING);
					buf_715.literal(1);
					buf_715.end();
					term_1052 = buf_715.term();
				}
				sink.propertyNamed("$LineLocation", term_1052);
				Term term_909;
				{
					BufferSink buf_761 = sink.context().makeBuffer();
					buf_761.start(_M_STRING);
					buf_761.literal(6);
					buf_761.end();
					term_909 = buf_761.term();
				}
				sink.propertyNamed("$ColumnLocation", term_909);
				sink.start(_M__sTextChars);
				sink.literal(" == null || ");
				sink.end();
				Term term_891;
				{
					BufferSink buf_665 = sink.context().makeBuffer();
					buf_665.start(_M_STRING);
					buf_665.literal(1);
					buf_665.end();
					term_891 = buf_665.term();
				}
				sink.propertyNamed("$LineLocation", term_891);
				Term term_664;
				{
					BufferSink buf_961 = sink.context().makeBuffer();
					buf_961.start(_M_STRING);
					buf_961.literal(14);
					buf_961.end();
					term_664 = buf_961.term();
				}
				sink.propertyNamed("$ColumnLocation", term_664);
				sink.start(_M__sTextCons);
				Term term_1992;
				{
					BufferSink buf_627 = sink.context().makeBuffer();
					buf_627.start(_M_STRING);
					buf_627.literal(1);
					buf_627.end();
					term_1992 = buf_627.term();
				}
				sink.propertyNamed("$LineLocation", term_1992);
				Term term_473;
				{
					BufferSink buf_870 = sink.context().makeBuffer();
					buf_870.start(_M_STRING);
					buf_870.literal(14);
					buf_870.end();
					term_473 = buf_870.term();
				}
				sink.propertyNamed("$ColumnLocation", term_473);
				sink.start(_M__sTextEmbed);
				Term term_676;
				{
					BufferSink buf_640 = sink.context().makeBuffer();
					buf_640.start(_M_STRING);
					buf_640.literal(1);
					buf_640.end();
					term_676 = buf_640.term();
				}
				sink.propertyNamed("$LineLocation", term_676);
				Term term_1112;
				{
					BufferSink buf_1189 = sink.context().makeBuffer();
					buf_1189.start(_M_STRING);
					buf_1189.literal(14);
					buf_1189.end();
					term_1112 = buf_1189.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1112);
				sink.start(_M_AsText);
				sink.copy(sub_256.ref());
				sink.end();
				sink.end();
				Term term_992;
				{
					BufferSink buf_1073 = sink.context().makeBuffer();
					buf_1073.start(_M_STRING);
					buf_1073.literal(1);
					buf_1073.end();
					term_992 = buf_1073.term();
				}
				sink.propertyNamed("$LineLocation", term_992);
				Term term_787;
				{
					BufferSink buf_1096 = sink.context().makeBuffer();
					buf_1096.start(_M_STRING);
					buf_1096.literal(26);
					buf_1096.end();
					term_787 = buf_1096.term();
				}
				sink.propertyNamed("$ColumnLocation", term_787);
				sink.start(_M__sTextCons);
				Term term_789;
				{
					BufferSink buf_758 = sink.context().makeBuffer();
					buf_758.start(_M_STRING);
					buf_758.literal(1);
					buf_758.end();
					term_789 = buf_758.term();
				}
				sink.propertyNamed("$LineLocation", term_789);
				Term term_880;
				{
					BufferSink buf_802 = sink.context().makeBuffer();
					buf_802.start(_M_STRING);
					buf_802.literal(26);
					buf_802.end();
					term_880 = buf_802.term();
				}
				sink.propertyNamed("$ColumnLocation", term_880);
				sink.start(_M__sTextChars);
				sink.literal(".lookup(");
				sink.end();
				Term term_790;
				{
					BufferSink buf_1238 = sink.context().makeBuffer();
					buf_1238.start(_M_STRING);
					buf_1238.literal(1);
					buf_1238.end();
					term_790 = buf_1238.term();
				}
				sink.propertyNamed("$LineLocation", term_790);
				Term term_646;
				{
					BufferSink buf_1669 = sink.context().makeBuffer();
					buf_1669.start(_M_STRING);
					buf_1669.literal(34);
					buf_1669.end();
					term_646 = buf_1669.term();
				}
				sink.propertyNamed("$ColumnLocation", term_646);
				sink.start(_M__sTextCons);
				Term term_1327;
				{
					BufferSink buf_1313 = sink.context().makeBuffer();
					buf_1313.start(_M_STRING);
					buf_1313.literal(1);
					buf_1313.end();
					term_1327 = buf_1313.term();
				}
				sink.propertyNamed("$LineLocation", term_1327);
				Term term_997;
				{
					BufferSink buf_927 = sink.context().makeBuffer();
					buf_927.start(_M_STRING);
					buf_927.literal(42);
					buf_927.end();
					term_997 = buf_927.term();
				}
				sink.propertyNamed("$ColumnLocation", term_997);
				sink.start(_M__sTextChars);
				sink.copy(sub_163.ref());
				sink.end();
				Term term_915;
				{
					BufferSink buf_685 = sink.context().makeBuffer();
					buf_685.start(_M_STRING);
					buf_685.literal(1);
					buf_685.end();
					term_915 = buf_685.term();
				}
				sink.propertyNamed("$LineLocation", term_915);
				Term term_972;
				{
					BufferSink buf_789 = sink.context().makeBuffer();
					buf_789.start(_M_STRING);
					buf_789.literal(43);
					buf_789.end();
					term_972 = buf_789.term();
				}
				sink.propertyNamed("$ColumnLocation", term_972);
				sink.start(_M__sTextCons);
				Term term_1375;
				{
					BufferSink buf_1210 = sink.context().makeBuffer();
					buf_1210.start(_M_STRING);
					buf_1210.literal(1);
					buf_1210.end();
					term_1375 = buf_1210.term();
				}
				sink.propertyNamed("$LineLocation", term_1375);
				Term term_1283;
				{
					BufferSink buf_1199 = sink.context().makeBuffer();
					buf_1199.start(_M_STRING);
					buf_1199.literal(43);
					buf_1199.end();
					term_1283 = buf_1199.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1283);
				sink.start(_M__sTextChars);
				sink.literal(") == null) ");
				sink.end();
				Term term_1198;
				{
					BufferSink buf_873 = sink.context().makeBuffer();
					buf_873.start(_M_STRING);
					buf_873.literal(1);
					buf_873.end();
					term_1198 = buf_873.term();
				}
				sink.propertyNamed("$LineLocation", term_1198);
				Term term_949;
				{
					BufferSink buf_889 = sink.context().makeBuffer();
					buf_889.start(_M_STRING);
					buf_889.literal(52);
					buf_889.end();
					term_949 = buf_889.term();
				}
				sink.propertyNamed("$ColumnLocation", term_949);
				sink.start(_M__sTextCons);
				Term term_1604;
				{
					BufferSink buf_530 = sink.context().makeBuffer();
					buf_530.start(_M_STRING);
					buf_530.literal(1);
					buf_530.end();
					term_1604 = buf_530.term();
				}
				sink.propertyNamed("$LineLocation", term_1604);
				Term term_766;
				{
					BufferSink buf_1587 = sink.context().makeBuffer();
					buf_1587.start(_M_STRING);
					buf_1587.literal(52);
					buf_1587.end();
					term_766 = buf_1587.term();
				}
				sink.propertyNamed("$ColumnLocation", term_766);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_717;
				{
					BufferSink buf_1546 = sink.context().makeBuffer();
					buf_1546.start(_M_STRING);
					buf_1546.literal(1);
					buf_1546.end();
					term_717 = buf_1546.term();
				}
				sink.propertyNamed("$LineLocation", term_717);
				Term term_1176;
				{
					BufferSink buf_507 = sink.context().makeBuffer();
					buf_507.start(_M_STRING);
					buf_507.literal(63);
					buf_507.end();
					term_1176 = buf_507.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1176);
				sink.start(_M__sTextCons);
				Term term_631;
				{
					BufferSink buf_969 = sink.context().makeBuffer();
					buf_969.start(_M_STRING);
					buf_969.literal(1);
					buf_969.end();
					term_631 = buf_969.term();
				}
				sink.propertyNamed("$LineLocation", term_631);
				Term term_1027;
				{
					BufferSink buf_720 = sink.context().makeBuffer();
					buf_720.start(_M_STRING);
					buf_720.literal(63);
					buf_720.end();
					term_1027 = buf_720.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1027);
				sink.start(_M__sTextChars);
				sink.literal("{");
				sink.end();
				Term term_1397;
				{
					BufferSink buf_1067 = sink.context().makeBuffer();
					buf_1067.start(_M_STRING);
					buf_1067.literal(2);
					buf_1067.end();
					term_1397 = buf_1067.term();
				}
				sink.propertyNamed("$LineLocation", term_1397);
				Term term_1045;
				{
					BufferSink buf_1509 = sink.context().makeBuffer();
					buf_1509.start(_M_STRING);
					buf_1509.literal(1);
					buf_1509.end();
					term_1045 = buf_1509.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1045);
				sink.start(_M__sTextCons);
				Term term_983;
				{
					BufferSink buf_1178 = sink.context().makeBuffer();
					buf_1178.start(_M_STRING);
					buf_1178.literal(2);
					buf_1178.end();
					term_983 = buf_1178.term();
				}
				sink.propertyNamed("$LineLocation", term_983);
				Term term_1166;
				{
					BufferSink buf_675 = sink.context().makeBuffer();
					buf_675.start(_M_STRING);
					buf_675.literal(2);
					buf_675.end();
					term_1166 = buf_675.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1166);
				sink.start(_M__sTextIndent);
				Term term_532;
				{
					BufferSink buf_977 = sink.context().makeBuffer();
					buf_977.start(_M_STRING);
					buf_977.literal(2);
					buf_977.end();
					term_532 = buf_977.term();
				}
				sink.propertyNamed("$LineLocation", term_532);
				Term term_1019;
				{
					BufferSink buf_475 = sink.context().makeBuffer();
					buf_475.start(_M_STRING);
					buf_475.literal(2);
					buf_475.end();
					term_1019 = buf_475.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1019);
				sink.start(_M__sTextCons);
				Term term_1358;
				{
					BufferSink buf_724 = sink.context().makeBuffer();
					buf_724.start(_M_STRING);
					buf_724.literal(2);
					buf_724.end();
					term_1358 = buf_724.term();
				}
				sink.propertyNamed("$LineLocation", term_1358);
				Term term_1107;
				{
					BufferSink buf_1138 = sink.context().makeBuffer();
					buf_1138.start(_M_STRING);
					buf_1138.literal(2);
					buf_1138.end();
					term_1107 = buf_1138.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1107);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1195;
				{
					BufferSink buf_1010 = sink.context().makeBuffer();
					buf_1010.start(_M_STRING);
					buf_1010.literal(2);
					buf_1010.end();
					term_1195 = buf_1010.term();
				}
				sink.propertyNamed("$LineLocation", term_1195);
				Term term_973;
				{
					BufferSink buf_1098 = sink.context().makeBuffer();
					buf_1098.start(_M_STRING);
					buf_1098.literal(3);
					buf_1098.end();
					term_973 = buf_1098.term();
				}
				sink.propertyNamed("$ColumnLocation", term_973);
				sink.start(_M__sTextCons);
				Term term_1044;
				{
					BufferSink buf_869 = sink.context().makeBuffer();
					buf_869.start(_M_STRING);
					buf_869.literal(2);
					buf_869.end();
					term_1044 = buf_869.term();
				}
				sink.propertyNamed("$LineLocation", term_1044);
				Term term_1208;
				{
					BufferSink buf_1170 = sink.context().makeBuffer();
					buf_1170.start(_M_STRING);
					buf_1170.literal(3);
					buf_1170.end();
					term_1208 = buf_1170.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1208);
				sink.start(_M__sTextChars);
				sink.literal("  break ");
				sink.end();
				Term term_1513;
				{
					BufferSink buf_1692 = sink.context().makeBuffer();
					buf_1692.start(_M_STRING);
					buf_1692.literal(3);
					buf_1692.end();
					term_1513 = buf_1692.term();
				}
				sink.propertyNamed("$LineLocation", term_1513);
				Term term_1529;
				{
					BufferSink buf_1459 = sink.context().makeBuffer();
					buf_1459.start(_M_STRING);
					buf_1459.literal(1);
					buf_1459.end();
					term_1529 = buf_1459.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1529);
				sink.start(_M__sTextCons);
				Term term_903;
				{
					BufferSink buf_766 = sink.context().makeBuffer();
					buf_766.start(_M_STRING);
					buf_766.literal(3);
					buf_766.end();
					term_903 = buf_766.term();
				}
				sink.propertyNamed("$LineLocation", term_903);
				Term term_1024;
				{
					BufferSink buf_729 = sink.context().makeBuffer();
					buf_729.start(_M_STRING);
					buf_729.literal(1);
					buf_729.end();
					term_1024 = buf_729.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1024);
				sink.start(_M__sTextEmbed);
				Term term_1546;
				{
					BufferSink buf_955 = sink.context().makeBuffer();
					buf_955.start(_M_STRING);
					buf_955.literal(3);
					buf_955.end();
					term_1546 = buf_955.term();
				}
				sink.propertyNamed("$LineLocation", term_1546);
				Term term_2032;
				{
					BufferSink buf_972 = sink.context().makeBuffer();
					buf_972.start(_M_STRING);
					buf_972.literal(1);
					buf_972.end();
					term_2032 = buf_972.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2032);
				sink.start(_M_AsText);
				sink.copy(sub_352.ref());
				sink.end();
				sink.end();
				Term term_1284;
				{
					BufferSink buf_718 = sink.context().makeBuffer();
					buf_718.start(_M_STRING);
					buf_718.literal(3);
					buf_718.end();
					term_1284 = buf_718.term();
				}
				sink.propertyNamed("$LineLocation", term_1284);
				Term term_1156;
				{
					BufferSink buf_893 = sink.context().makeBuffer();
					buf_893.start(_M_STRING);
					buf_893.literal(9);
					buf_893.end();
					term_1156 = buf_893.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1156);
				sink.start(_M__sTextCons);
				Term term_625;
				{
					BufferSink buf_943 = sink.context().makeBuffer();
					buf_943.start(_M_STRING);
					buf_943.literal(3);
					buf_943.end();
					term_625 = buf_943.term();
				}
				sink.propertyNamed("$LineLocation", term_625);
				Term term_719;
				{
					BufferSink buf_408 = sink.context().makeBuffer();
					buf_408.start(_M_STRING);
					buf_408.literal(9);
					buf_408.end();
					term_719 = buf_408.term();
				}
				sink.propertyNamed("$ColumnLocation", term_719);
				sink.start(_M__sTextChars);
				sink.literal(";");
				sink.end();
				Term term_900;
				{
					BufferSink buf_525 = sink.context().makeBuffer();
					buf_525.start(_M_STRING);
					buf_525.literal(3);
					buf_525.end();
					term_900 = buf_525.term();
				}
				sink.propertyNamed("$LineLocation", term_900);
				Term term_1300;
				{
					BufferSink buf_1213 = sink.context().makeBuffer();
					buf_1213.start(_M_STRING);
					buf_1213.literal(17);
					buf_1213.end();
					term_1300 = buf_1213.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1300);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				Term term_1090;
				{
					BufferSink buf_1215 = sink.context().makeBuffer();
					buf_1215.start(_M_STRING);
					buf_1215.literal(3);
					buf_1215.end();
					term_1090 = buf_1215.term();
				}
				sink.propertyNamed("$LineLocation", term_1090);
				Term term_901;
				{
					BufferSink buf_1071 = sink.context().makeBuffer();
					buf_1071.start(_M_STRING);
					buf_1071.literal(18);
					buf_1071.end();
					term_901 = buf_1071.term();
				}
				sink.propertyNamed("$ColumnLocation", term_901);
				sink.start(_M__sTextCons);
				Term term_1355;
				{
					BufferSink buf_785 = sink.context().makeBuffer();
					buf_785.start(_M_STRING);
					buf_785.literal(3);
					buf_785.end();
					term_1355 = buf_785.term();
				}
				sink.propertyNamed("$LineLocation", term_1355);
				Term term_955;
				{
					BufferSink buf_686 = sink.context().makeBuffer();
					buf_686.start(_M_STRING);
					buf_686.literal(18);
					buf_686.end();
					term_955 = buf_686.term();
				}
				sink.propertyNamed("$ColumnLocation", term_955);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1209;
				{
					BufferSink buf_1352 = sink.context().makeBuffer();
					buf_1352.start(_M_STRING);
					buf_1352.literal(3);
					buf_1352.end();
					term_1209 = buf_1352.term();
				}
				sink.propertyNamed("$LineLocation", term_1209);
				Term term_1642;
				{
					BufferSink buf_905 = sink.context().makeBuffer();
					buf_905.start(_M_STRING);
					buf_905.literal(19);
					buf_905.end();
					term_1642 = buf_905.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1642);
				sink.start(_M__sTextCons);
				Term term_1897;
				{
					BufferSink buf_1746 = sink.context().makeBuffer();
					buf_1746.start(_M_STRING);
					buf_1746.literal(3);
					buf_1746.end();
					term_1897 = buf_1746.term();
				}
				sink.propertyNamed("$LineLocation", term_1897);
				Term term_1431;
				{
					BufferSink buf_1281 = sink.context().makeBuffer();
					buf_1281.start(_M_STRING);
					buf_1281.literal(19);
					buf_1281.end();
					term_1431 = buf_1281.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1431);
				sink.start(_M__sTextChars);
				sink.literal("}");
				sink.end();
				Term term_860;
				{
					BufferSink buf_630 = sink.context().makeBuffer();
					buf_630.start(_M_STRING);
					buf_630.literal(4);
					buf_630.end();
					term_860 = buf_630.term();
				}
				sink.propertyNamed("$LineLocation", term_860);
				Term term_827;
				{
					BufferSink buf_1131 = sink.context().makeBuffer();
					buf_1131.start(_M_STRING);
					buf_1131.literal(1);
					buf_1131.end();
					term_827 = buf_1131.term();
				}
				sink.propertyNamed("$ColumnLocation", term_827);
				sink.start(_M__sTextCons);
				Term term_1501;
				{
					BufferSink buf_902 = sink.context().makeBuffer();
					buf_902.start(_M_STRING);
					buf_902.literal(4);
					buf_902.end();
					term_1501 = buf_902.term();
				}
				sink.propertyNamed("$LineLocation", term_1501);
				Term term_1603;
				{
					BufferSink buf_1206 = sink.context().makeBuffer();
					buf_1206.start(_M_STRING);
					buf_1206.literal(1);
					buf_1206.end();
					term_1603 = buf_1206.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1603);
				sink.start(_M__sTextEmbed);
				Term term_1061;
				{
					BufferSink buf_925 = sink.context().makeBuffer();
					buf_925.start(_M_STRING);
					buf_925.literal(4);
					buf_925.end();
					term_1061 = buf_925.term();
				}
				sink.propertyNamed("$LineLocation", term_1061);
				Term term_1246;
				{
					BufferSink buf_1458 = sink.context().makeBuffer();
					buf_1458.start(_M_STRING);
					buf_1458.literal(1);
					buf_1458.end();
					term_1246 = buf_1458.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1246);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_9));
				Term term_835;
				{
					BufferSink buf_554 = sink.context().makeBuffer();
					buf_554.start(_M_OK);
					buf_554.end();
					term_835 = buf_554.term();
				}
				sink.substitute(term_686.ref(), new Variable[]
					{var_33}, new Term[]
					{term_835});
				sink.end();
				sink.end();
				Term term_1359;
				{
					BufferSink buf_1423 = sink.context().makeBuffer();
					buf_1423.start(_M_STRING);
					buf_1423.literal(4);
					buf_1423.end();
					term_1359 = buf_1423.term();
				}
				sink.propertyNamed("$LineLocation", term_1359);
				Term term_1669;
				{
					BufferSink buf_1264 = sink.context().makeBuffer();
					buf_1264.start(_M_STRING);
					buf_1264.literal(2);
					buf_1264.end();
					term_1669 = buf_1264.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1669);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_6 :
			{
				Term value_69 = props_9 == null ? null : props_9.lookup("$props");
				if (value_69 == null)
				{
					break label_6;
				}
				if (value_69.descriptor() != _M_TEXT)
				{
					break label_6;
				}
				Term sub_60 = value_69.sub(0).ref();
				/* #props=sub */
				Term value_55 = props_9 == null ? null : props_9.lookup("$caselabel");
				if (value_55 == null)
				{
					break label_6;
				}
				if (value_55.descriptor() != _M_TEXT)
				{
					break label_6;
				}
				Term sub_124 = value_55.sub(0).ref();
				/* #label=sub */
				if (term_558.descriptor() != _M_Crsx_xproperty_xA8)
				{
					break label_6;
				}
				Term sub_62 = term_558.sub(0).ref();
				Term sub_56 = term_558.sub(1).ref();
				/* #STRING=sub */
				/* #term=term */
				/* #=term *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1148;
				{
					BufferSink buf_1265 = sink.context().makeBuffer();
					buf_1265.start(_M_STRING);
					buf_1265.literal(1);
					buf_1265.end();
					term_1148 = buf_1265.term();
				}
				sink.propertyNamed("$LineLocation", term_1148);
				Term term_519;
				{
					BufferSink buf_1146 = sink.context().makeBuffer();
					buf_1146.start(_M_STRING);
					buf_1146.literal(1);
					buf_1146.end();
					term_519 = buf_1146.term();
				}
				sink.propertyNamed("$ColumnLocation", term_519);
				sink.start(_M__sTextCons);
				Term term_951;
				{
					BufferSink buf_926 = sink.context().makeBuffer();
					buf_926.start(_M_STRING);
					buf_926.literal(1);
					buf_926.end();
					term_951 = buf_926.term();
				}
				sink.propertyNamed("$LineLocation", term_951);
				Term term_1227;
				{
					BufferSink buf_1116 = sink.context().makeBuffer();
					buf_1116.start(_M_STRING);
					buf_1116.literal(1);
					buf_1116.end();
					term_1227 = buf_1116.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1227);
				sink.start(_M__sTextChars);
				sink.literal("if (");
				sink.end();
				Term term_1386;
				{
					BufferSink buf_1089 = sink.context().makeBuffer();
					buf_1089.start(_M_STRING);
					buf_1089.literal(1);
					buf_1089.end();
					term_1386 = buf_1089.term();
				}
				sink.propertyNamed("$LineLocation", term_1386);
				Term term_1192;
				{
					BufferSink buf_1453 = sink.context().makeBuffer();
					buf_1453.start(_M_STRING);
					buf_1453.literal(2);
					buf_1453.end();
					term_1192 = buf_1453.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1192);
				sink.start(_M__sTextCons);
				Term term_974;
				{
					BufferSink buf_939 = sink.context().makeBuffer();
					buf_939.start(_M_STRING);
					buf_939.literal(1);
					buf_939.end();
					term_974 = buf_939.term();
				}
				sink.propertyNamed("$LineLocation", term_974);
				Term term_1058;
				{
					BufferSink buf_1257 = sink.context().makeBuffer();
					buf_1257.start(_M_STRING);
					buf_1257.literal(2);
					buf_1257.end();
					term_1058 = buf_1257.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1058);
				sink.start(_M__sTextEmbed);
				Term term_1272;
				{
					BufferSink buf_937 = sink.context().makeBuffer();
					buf_937.start(_M_STRING);
					buf_937.literal(1);
					buf_937.end();
					term_1272 = buf_937.term();
				}
				sink.propertyNamed("$LineLocation", term_1272);
				Term term_1002;
				{
					BufferSink buf_1100 = sink.context().makeBuffer();
					buf_1100.start(_M_STRING);
					buf_1100.literal(2);
					buf_1100.end();
					term_1002 = buf_1100.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1002);
				sink.start(_M_AsText);
				sink.copy(sub_60.ref());
				sink.end();
				sink.end();
				Term term_1029;
				{
					BufferSink buf_1198 = sink.context().makeBuffer();
					buf_1198.start(_M_STRING);
					buf_1198.literal(1);
					buf_1198.end();
					term_1029 = buf_1198.term();
				}
				sink.propertyNamed("$LineLocation", term_1029);
				Term term_1157;
				{
					BufferSink buf_987 = sink.context().makeBuffer();
					buf_987.start(_M_STRING);
					buf_987.literal(6);
					buf_987.end();
					term_1157 = buf_987.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1157);
				sink.start(_M__sTextCons);
				Term term_1544;
				{
					BufferSink buf_714 = sink.context().makeBuffer();
					buf_714.start(_M_STRING);
					buf_714.literal(1);
					buf_714.end();
					term_1544 = buf_714.term();
				}
				sink.propertyNamed("$LineLocation", term_1544);
				Term term_1049;
				{
					BufferSink buf_811 = sink.context().makeBuffer();
					buf_811.start(_M_STRING);
					buf_811.literal(6);
					buf_811.end();
					term_1049 = buf_811.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1049);
				sink.start(_M__sTextChars);
				sink.literal(" != null && ");
				sink.end();
				Term term_1311;
				{
					BufferSink buf_572 = sink.context().makeBuffer();
					buf_572.start(_M_STRING);
					buf_572.literal(1);
					buf_572.end();
					term_1311 = buf_572.term();
				}
				sink.propertyNamed("$LineLocation", term_1311);
				Term term_871;
				{
					BufferSink buf_1787 = sink.context().makeBuffer();
					buf_1787.start(_M_STRING);
					buf_1787.literal(14);
					buf_1787.end();
					term_871 = buf_1787.term();
				}
				sink.propertyNamed("$ColumnLocation", term_871);
				sink.start(_M__sTextCons);
				Term term_781;
				{
					BufferSink buf_1042 = sink.context().makeBuffer();
					buf_1042.start(_M_STRING);
					buf_1042.literal(1);
					buf_1042.end();
					term_781 = buf_1042.term();
				}
				sink.propertyNamed("$LineLocation", term_781);
				Term term_1116;
				{
					BufferSink buf_997 = sink.context().makeBuffer();
					buf_997.start(_M_STRING);
					buf_997.literal(14);
					buf_997.end();
					term_1116 = buf_997.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1116);
				sink.start(_M__sTextEmbed);
				Term term_878;
				{
					BufferSink buf_1218 = sink.context().makeBuffer();
					buf_1218.start(_M_STRING);
					buf_1218.literal(1);
					buf_1218.end();
					term_878 = buf_1218.term();
				}
				sink.propertyNamed("$LineLocation", term_878);
				Term term_1245;
				{
					BufferSink buf_1852 = sink.context().makeBuffer();
					buf_1852.start(_M_STRING);
					buf_1852.literal(14);
					buf_1852.end();
					term_1245 = buf_1852.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1245);
				sink.start(_M_AsText);
				sink.copy(sub_60.ref());
				sink.end();
				sink.end();
				Term term_1728;
				{
					BufferSink buf_921 = sink.context().makeBuffer();
					buf_921.start(_M_STRING);
					buf_921.literal(1);
					buf_921.end();
					term_1728 = buf_921.term();
				}
				sink.propertyNamed("$LineLocation", term_1728);
				Term term_1776;
				{
					BufferSink buf_836 = sink.context().makeBuffer();
					buf_836.start(_M_STRING);
					buf_836.literal(26);
					buf_836.end();
					term_1776 = buf_836.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1776);
				sink.start(_M__sTextCons);
				Term term_1152;
				{
					BufferSink buf_990 = sink.context().makeBuffer();
					buf_990.start(_M_STRING);
					buf_990.literal(1);
					buf_990.end();
					term_1152 = buf_990.term();
				}
				sink.propertyNamed("$LineLocation", term_1152);
				Term term_1127;
				{
					BufferSink buf_1195 = sink.context().makeBuffer();
					buf_1195.start(_M_STRING);
					buf_1195.literal(26);
					buf_1195.end();
					term_1127 = buf_1195.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1127);
				sink.start(_M__sTextChars);
				sink.literal(".lookup(");
				sink.end();
				Term term_1054;
				{
					BufferSink buf_1472 = sink.context().makeBuffer();
					buf_1472.start(_M_STRING);
					buf_1472.literal(1);
					buf_1472.end();
					term_1054 = buf_1472.term();
				}
				sink.propertyNamed("$LineLocation", term_1054);
				Term term_906;
				{
					BufferSink buf_1115 = sink.context().makeBuffer();
					buf_1115.start(_M_STRING);
					buf_1115.literal(34);
					buf_1115.end();
					term_906 = buf_1115.term();
				}
				sink.propertyNamed("$ColumnLocation", term_906);
				sink.start(_M__sTextCons);
				Term term_1228;
				{
					BufferSink buf_650 = sink.context().makeBuffer();
					buf_650.start(_M_STRING);
					buf_650.literal(1);
					buf_650.end();
					term_1228 = buf_650.term();
				}
				sink.propertyNamed("$LineLocation", term_1228);
				Term term_1543;
				{
					BufferSink buf_946 = sink.context().makeBuffer();
					buf_946.start(_M_STRING);
					buf_946.literal(42);
					buf_946.end();
					term_1543 = buf_946.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1543);
				sink.start(_M__sTextChars);
				sink.copy(sub_56.ref());
				sink.end();
				Term term_936;
				{
					BufferSink buf_1251 = sink.context().makeBuffer();
					buf_1251.start(_M_STRING);
					buf_1251.literal(1);
					buf_1251.end();
					term_936 = buf_1251.term();
				}
				sink.propertyNamed("$LineLocation", term_936);
				Term term_1103;
				{
					BufferSink buf_743 = sink.context().makeBuffer();
					buf_743.start(_M_STRING);
					buf_743.literal(43);
					buf_743.end();
					term_1103 = buf_743.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1103);
				sink.start(_M__sTextCons);
				Term term_779;
				{
					BufferSink buf_1184 = sink.context().makeBuffer();
					buf_1184.start(_M_STRING);
					buf_1184.literal(1);
					buf_1184.end();
					term_779 = buf_1184.term();
				}
				sink.propertyNamed("$LineLocation", term_779);
				Term term_1004;
				{
					BufferSink buf_1057 = sink.context().makeBuffer();
					buf_1057.start(_M_STRING);
					buf_1057.literal(43);
					buf_1057.end();
					term_1004 = buf_1057.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1004);
				sink.start(_M__sTextChars);
				sink.literal(") != null) ");
				sink.end();
				Term term_703;
				{
					BufferSink buf_1331 = sink.context().makeBuffer();
					buf_1331.start(_M_STRING);
					buf_1331.literal(1);
					buf_1331.end();
					term_703 = buf_1331.term();
				}
				sink.propertyNamed("$LineLocation", term_703);
				Term term_712;
				{
					BufferSink buf_768 = sink.context().makeBuffer();
					buf_768.start(_M_STRING);
					buf_768.literal(52);
					buf_768.end();
					term_712 = buf_768.term();
				}
				sink.propertyNamed("$ColumnLocation", term_712);
				sink.start(_M__sTextCons);
				Term term_1757;
				{
					BufferSink buf_1502 = sink.context().makeBuffer();
					buf_1502.start(_M_STRING);
					buf_1502.literal(1);
					buf_1502.end();
					term_1757 = buf_1502.term();
				}
				sink.propertyNamed("$LineLocation", term_1757);
				Term term_1082;
				{
					BufferSink buf_1047 = sink.context().makeBuffer();
					buf_1047.start(_M_STRING);
					buf_1047.literal(52);
					buf_1047.end();
					term_1082 = buf_1047.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1082);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1191;
				{
					BufferSink buf_1334 = sink.context().makeBuffer();
					buf_1334.start(_M_STRING);
					buf_1334.literal(1);
					buf_1334.end();
					term_1191 = buf_1334.term();
				}
				sink.propertyNamed("$LineLocation", term_1191);
				Term term_1047;
				{
					BufferSink buf_936 = sink.context().makeBuffer();
					buf_936.start(_M_STRING);
					buf_936.literal(63);
					buf_936.end();
					term_1047 = buf_936.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1047);
				sink.start(_M__sTextCons);
				Term term_1331;
				{
					BufferSink buf_934 = sink.context().makeBuffer();
					buf_934.start(_M_STRING);
					buf_934.literal(1);
					buf_934.end();
					term_1331 = buf_934.term();
				}
				sink.propertyNamed("$LineLocation", term_1331);
				Term term_1066;
				{
					BufferSink buf_696 = sink.context().makeBuffer();
					buf_696.start(_M_STRING);
					buf_696.literal(63);
					buf_696.end();
					term_1066 = buf_696.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1066);
				sink.start(_M__sTextChars);
				sink.literal("{");
				sink.end();
				Term term_1030;
				{
					BufferSink buf_1759 = sink.context().makeBuffer();
					buf_1759.start(_M_STRING);
					buf_1759.literal(2);
					buf_1759.end();
					term_1030 = buf_1759.term();
				}
				sink.propertyNamed("$LineLocation", term_1030);
				Term term_1124;
				{
					BufferSink buf_859 = sink.context().makeBuffer();
					buf_859.start(_M_STRING);
					buf_859.literal(1);
					buf_859.end();
					term_1124 = buf_859.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1124);
				sink.start(_M__sTextCons);
				Term term_1445;
				{
					BufferSink buf_915 = sink.context().makeBuffer();
					buf_915.start(_M_STRING);
					buf_915.literal(2);
					buf_915.end();
					term_1445 = buf_915.term();
				}
				sink.propertyNamed("$LineLocation", term_1445);
				Term term_1108;
				{
					BufferSink buf_970 = sink.context().makeBuffer();
					buf_970.start(_M_STRING);
					buf_970.literal(2);
					buf_970.end();
					term_1108 = buf_970.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1108);
				sink.start(_M__sTextIndent);
				Term term_966;
				{
					BufferSink buf_1175 = sink.context().makeBuffer();
					buf_1175.start(_M_STRING);
					buf_1175.literal(2);
					buf_1175.end();
					term_966 = buf_1175.term();
				}
				sink.propertyNamed("$LineLocation", term_966);
				Term term_831;
				{
					BufferSink buf_1269 = sink.context().makeBuffer();
					buf_1269.start(_M_STRING);
					buf_1269.literal(2);
					buf_1269.end();
					term_831 = buf_1269.term();
				}
				sink.propertyNamed("$ColumnLocation", term_831);
				sink.start(_M__sTextCons);
				Term term_1220;
				{
					BufferSink buf_1650 = sink.context().makeBuffer();
					buf_1650.start(_M_STRING);
					buf_1650.literal(2);
					buf_1650.end();
					term_1220 = buf_1650.term();
				}
				sink.propertyNamed("$LineLocation", term_1220);
				Term term_1310;
				{
					BufferSink buf_1353 = sink.context().makeBuffer();
					buf_1353.start(_M_STRING);
					buf_1353.literal(2);
					buf_1353.end();
					term_1310 = buf_1353.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1310);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1473;
				{
					BufferSink buf_1196 = sink.context().makeBuffer();
					buf_1196.start(_M_STRING);
					buf_1196.literal(2);
					buf_1196.end();
					term_1473 = buf_1196.term();
				}
				sink.propertyNamed("$LineLocation", term_1473);
				Term term_1714;
				{
					BufferSink buf_1234 = sink.context().makeBuffer();
					buf_1234.start(_M_STRING);
					buf_1234.literal(3);
					buf_1234.end();
					term_1714 = buf_1234.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1714);
				sink.start(_M__sTextCons);
				Term term_1123;
				{
					BufferSink buf_860 = sink.context().makeBuffer();
					buf_860.start(_M_STRING);
					buf_860.literal(2);
					buf_860.end();
					term_1123 = buf_860.term();
				}
				sink.propertyNamed("$LineLocation", term_1123);
				Term term_1479;
				{
					BufferSink buf_845 = sink.context().makeBuffer();
					buf_845.start(_M_STRING);
					buf_845.literal(3);
					buf_845.end();
					term_1479 = buf_845.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1479);
				sink.start(_M__sTextChars);
				sink.literal("  break ");
				sink.end();
				Term term_580;
				{
					BufferSink buf_1013 = sink.context().makeBuffer();
					buf_1013.start(_M_STRING);
					buf_1013.literal(3);
					buf_1013.end();
					term_580 = buf_1013.term();
				}
				sink.propertyNamed("$LineLocation", term_580);
				Term term_1414;
				{
					BufferSink buf_842 = sink.context().makeBuffer();
					buf_842.start(_M_STRING);
					buf_842.literal(1);
					buf_842.end();
					term_1414 = buf_842.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1414);
				sink.start(_M__sTextCons);
				Term term_991;
				{
					BufferSink buf_678 = sink.context().makeBuffer();
					buf_678.start(_M_STRING);
					buf_678.literal(3);
					buf_678.end();
					term_991 = buf_678.term();
				}
				sink.propertyNamed("$LineLocation", term_991);
				Term term_911;
				{
					BufferSink buf_1004 = sink.context().makeBuffer();
					buf_1004.start(_M_STRING);
					buf_1004.literal(1);
					buf_1004.end();
					term_911 = buf_1004.term();
				}
				sink.propertyNamed("$ColumnLocation", term_911);
				sink.start(_M__sTextEmbed);
				Term term_1392;
				{
					BufferSink buf_822 = sink.context().makeBuffer();
					buf_822.start(_M_STRING);
					buf_822.literal(3);
					buf_822.end();
					term_1392 = buf_822.term();
				}
				sink.propertyNamed("$LineLocation", term_1392);
				Term term_1197;
				{
					BufferSink buf_1095 = sink.context().makeBuffer();
					buf_1095.start(_M_STRING);
					buf_1095.literal(1);
					buf_1095.end();
					term_1197 = buf_1095.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1197);
				sink.start(_M_AsText);
				sink.copy(sub_124.ref());
				sink.end();
				sink.end();
				Term term_874;
				{
					BufferSink buf_1055 = sink.context().makeBuffer();
					buf_1055.start(_M_STRING);
					buf_1055.literal(3);
					buf_1055.end();
					term_874 = buf_1055.term();
				}
				sink.propertyNamed("$LineLocation", term_874);
				Term term_1360;
				{
					BufferSink buf_1368 = sink.context().makeBuffer();
					buf_1368.start(_M_STRING);
					buf_1368.literal(9);
					buf_1368.end();
					term_1360 = buf_1368.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1360);
				sink.start(_M__sTextCons);
				Term term_1104;
				{
					BufferSink buf_838 = sink.context().makeBuffer();
					buf_838.start(_M_STRING);
					buf_838.literal(3);
					buf_838.end();
					term_1104 = buf_838.term();
				}
				sink.propertyNamed("$LineLocation", term_1104);
				Term term_1276;
				{
					BufferSink buf_611 = sink.context().makeBuffer();
					buf_611.start(_M_STRING);
					buf_611.literal(9);
					buf_611.end();
					term_1276 = buf_611.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1276);
				sink.start(_M__sTextChars);
				sink.literal(";");
				sink.end();
				Term term_1477;
				{
					BufferSink buf_734 = sink.context().makeBuffer();
					buf_734.start(_M_STRING);
					buf_734.literal(3);
					buf_734.end();
					term_1477 = buf_734.term();
				}
				sink.propertyNamed("$LineLocation", term_1477);
				Term term_1294;
				{
					BufferSink buf_1161 = sink.context().makeBuffer();
					buf_1161.start(_M_STRING);
					buf_1161.literal(17);
					buf_1161.end();
					term_1294 = buf_1161.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1294);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				Term term_1161;
				{
					BufferSink buf_1097 = sink.context().makeBuffer();
					buf_1097.start(_M_STRING);
					buf_1097.literal(3);
					buf_1097.end();
					term_1161 = buf_1097.term();
				}
				sink.propertyNamed("$LineLocation", term_1161);
				Term term_1784;
				{
					BufferSink buf_932 = sink.context().makeBuffer();
					buf_932.start(_M_STRING);
					buf_932.literal(18);
					buf_932.end();
					term_1784 = buf_932.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1784);
				sink.start(_M__sTextCons);
				Term term_868;
				{
					BufferSink buf_1081 = sink.context().makeBuffer();
					buf_1081.start(_M_STRING);
					buf_1081.literal(3);
					buf_1081.end();
					term_868 = buf_1081.term();
				}
				sink.propertyNamed("$LineLocation", term_868);
				Term term_1026;
				{
					BufferSink buf_749 = sink.context().makeBuffer();
					buf_749.start(_M_STRING);
					buf_749.literal(18);
					buf_749.end();
					term_1026 = buf_749.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1026);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1654;
				{
					BufferSink buf_1230 = sink.context().makeBuffer();
					buf_1230.start(_M_STRING);
					buf_1230.literal(3);
					buf_1230.end();
					term_1654 = buf_1230.term();
				}
				sink.propertyNamed("$LineLocation", term_1654);
				Term term_925;
				{
					BufferSink buf_1182 = sink.context().makeBuffer();
					buf_1182.start(_M_STRING);
					buf_1182.literal(19);
					buf_1182.end();
					term_925 = buf_1182.term();
				}
				sink.propertyNamed("$ColumnLocation", term_925);
				sink.start(_M__sTextCons);
				Term term_1491;
				{
					BufferSink buf_879 = sink.context().makeBuffer();
					buf_879.start(_M_STRING);
					buf_879.literal(3);
					buf_879.end();
					term_1491 = buf_879.term();
				}
				sink.propertyNamed("$LineLocation", term_1491);
				Term term_1483;
				{
					BufferSink buf_1150 = sink.context().makeBuffer();
					buf_1150.start(_M_STRING);
					buf_1150.literal(19);
					buf_1150.end();
					term_1483 = buf_1150.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1483);
				sink.start(_M__sTextChars);
				sink.literal("}");
				sink.end();
				Term term_1662;
				{
					BufferSink buf_1366 = sink.context().makeBuffer();
					buf_1366.start(_M_STRING);
					buf_1366.literal(4);
					buf_1366.end();
					term_1662 = buf_1366.term();
				}
				sink.propertyNamed("$LineLocation", term_1662);
				Term term_1487;
				{
					BufferSink buf_1312 = sink.context().makeBuffer();
					buf_1312.start(_M_STRING);
					buf_1312.literal(1);
					buf_1312.end();
					term_1487 = buf_1312.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1487);
				sink.start(_M__sTextCons);
				Term term_819;
				{
					BufferSink buf_867 = sink.context().makeBuffer();
					buf_867.start(_M_STRING);
					buf_867.literal(4);
					buf_867.end();
					term_819 = buf_867.term();
				}
				sink.propertyNamed("$LineLocation", term_819);
				Term term_1620;
				{
					BufferSink buf_1467 = sink.context().makeBuffer();
					buf_1467.start(_M_STRING);
					buf_1467.literal(1);
					buf_1467.end();
					term_1620 = buf_1467.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1620);
				sink.start(_M__sTextEmbed);
				Term term_1733;
				{
					BufferSink buf_788 = sink.context().makeBuffer();
					buf_788.start(_M_STRING);
					buf_788.literal(4);
					buf_788.end();
					term_1733 = buf_788.term();
				}
				sink.propertyNamed("$LineLocation", term_1733);
				Term term_1254;
				{
					BufferSink buf_1333 = sink.context().makeBuffer();
					buf_1333.start(_M_STRING);
					buf_1333.literal(1);
					buf_1333.end();
					term_1254 = buf_1333.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1254);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_9));
				Term term_1292;
				{
					BufferSink buf_1012 = sink.context().makeBuffer();
					buf_1012.start(_M_OK);
					buf_1012.end();
					term_1292 = buf_1012.term();
				}
				sink.substitute(term_686.ref(), new Variable[]
					{var_33}, new Term[]
					{term_1292});
				sink.end();
				sink.end();
				Term term_822;
				{
					BufferSink buf_1015 = sink.context().makeBuffer();
					buf_1015.start(_M_STRING);
					buf_1015.literal(4);
					buf_1015.end();
					term_822 = buf_1015.term();
				}
				sink.propertyNamed("$LineLocation", term_822);
				Term term_1171;
				{
					BufferSink buf_584 = sink.context().makeBuffer();
					buf_584.start(_M_STRING);
					buf_584.literal(2);
					buf_584.end();
					term_1171 = buf_584.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1171);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_33 :
			{
				Term value_19 = props_9 == null ? null : props_9.lookup("$props");
				if (value_19 == null)
				{
					break label_33;
				}
				if (value_19.descriptor() != _M_TEXT)
				{
					break label_33;
				}
				Term sub_32 = value_19.sub(0).ref();
				/* #props=sub */
				Term value_17 = props_9 == null ? null : props_9.lookup("$caselabel");
				if (value_17 == null)
				{
					break label_33;
				}
				if (value_17.descriptor() != _M_TEXT)
				{
					break label_33;
				}
				Term sub_109 = value_17.sub(0).ref();
				/* #label=sub */
				if (term_558.descriptor() != _M_Crsx_xproperty_xA3)
				{
					break label_33;
				}
				Term sub_294 = term_558.sub(0).ref();
				/* #METAVAR1=sub */Term sub_169 = term_558.sub(1).ref();
				Term sub_432 = term_558.sub(2).ref();
				if (sub_432.descriptor() != _M_Crsx_xfreeTerm_xA7)
				{
					break label_33;
				}
				Term sub_319 = sub_432.sub(0).ref();
				if (sub_319.descriptor() != _M__sNil)
				{
					break label_33;
				}
				Term sub_467 = sub_432.sub(1).ref();
				if (sub_467.descriptor() != _M__sNil)
				{
					break label_33;
				}
				Term sub_445 = sub_432.sub(2).ref();
				/* #METAVAR2=sub */Term sub_358 = sub_432.sub(3).ref();
				if (sub_358.descriptor() != _M__sNil)
				{
					break label_33;
				}
				/* #term=term */
				/* #=term *//*Contract*/
				Variable var_62 = sink.context().makeVariable("value");
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2164;
				{
					BufferSink buf_1007 = sink.context().makeBuffer();
					buf_1007.start(_M_STRING);
					buf_1007.literal(1);
					buf_1007.end();
					term_2164 = buf_1007.term();
				}
				sink.propertyNamed("$LineLocation", term_2164);
				Term term_1060;
				{
					BufferSink buf_1390 = sink.context().makeBuffer();
					buf_1390.start(_M_STRING);
					buf_1390.literal(1);
					buf_1390.end();
					term_1060 = buf_1390.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1060);
				sink.start(_M__sTextCons);
				Term term_736;
				{
					BufferSink buf_1074 = sink.context().makeBuffer();
					buf_1074.start(_M_STRING);
					buf_1074.literal(1);
					buf_1074.end();
					term_736 = buf_1074.term();
				}
				sink.propertyNamed("$LineLocation", term_736);
				Term term_1850;
				{
					BufferSink buf_1014 = sink.context().makeBuffer();
					buf_1014.start(_M_STRING);
					buf_1014.literal(1);
					buf_1014.end();
					term_1850 = buf_1014.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1850);
				sink.start(_M__sTextChars);
				sink.literal("Term ");
				sink.end();
				Term term_852;
				{
					BufferSink buf_826 = sink.context().makeBuffer();
					buf_826.start(_M_STRING);
					buf_826.literal(1);
					buf_826.end();
					term_852 = buf_826.term();
				}
				sink.propertyNamed("$LineLocation", term_852);
				Term term_1097;
				{
					BufferSink buf_1065 = sink.context().makeBuffer();
					buf_1065.start(_M_STRING);
					buf_1065.literal(2);
					buf_1065.end();
					term_1097 = buf_1065.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1097);
				sink.start(_M__sTextCons);
				Term term_1600;
				{
					BufferSink buf_779 = sink.context().makeBuffer();
					buf_779.start(_M_STRING);
					buf_779.literal(1);
					buf_779.end();
					term_1600 = buf_779.term();
				}
				sink.propertyNamed("$LineLocation", term_1600);
				Term term_870;
				{
					BufferSink buf_1933 = sink.context().makeBuffer();
					buf_1933.start(_M_STRING);
					buf_1933.literal(2);
					buf_1933.end();
					term_870 = buf_1933.term();
				}
				sink.propertyNamed("$ColumnLocation", term_870);
				sink.start(_M__sTextEmbed);
				Term term_1053;
				{
					BufferSink buf_1031 = sink.context().makeBuffer();
					buf_1031.start(_M_STRING);
					buf_1031.literal(1);
					buf_1031.end();
					term_1053 = buf_1031.term();
				}
				sink.propertyNamed("$LineLocation", term_1053);
				Term term_1154;
				{
					BufferSink buf_1332 = sink.context().makeBuffer();
					buf_1332.start(_M_STRING);
					buf_1332.literal(2);
					buf_1332.end();
					term_1154 = buf_1332.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1154);
				sink.start(_M_AsText);
				sink.use(var_62);
				sink.end();
				sink.end();
				Term term_1074;
				{
					BufferSink buf_1046 = sink.context().makeBuffer();
					buf_1046.start(_M_STRING);
					buf_1046.literal(1);
					buf_1046.end();
					term_1074 = buf_1046.term();
				}
				sink.propertyNamed("$LineLocation", term_1074);
				Term term_1013;
				{
					BufferSink buf_648 = sink.context().makeBuffer();
					buf_648.start(_M_STRING);
					buf_648.literal(7);
					buf_648.end();
					term_1013 = buf_648.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1013);
				sink.start(_M__sTextCons);
				Term term_885;
				{
					BufferSink buf_1232 = sink.context().makeBuffer();
					buf_1232.start(_M_STRING);
					buf_1232.literal(1);
					buf_1232.end();
					term_885 = buf_1232.term();
				}
				sink.propertyNamed("$LineLocation", term_885);
				Term term_1737;
				{
					BufferSink buf_1749 = sink.context().makeBuffer();
					buf_1749.start(_M_STRING);
					buf_1749.literal(7);
					buf_1749.end();
					term_1737 = buf_1749.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1737);
				sink.start(_M__sTextChars);
				sink.literal(" = ");
				sink.end();
				Term term_1867;
				{
					BufferSink buf_1106 = sink.context().makeBuffer();
					buf_1106.start(_M_STRING);
					buf_1106.literal(1);
					buf_1106.end();
					term_1867 = buf_1106.term();
				}
				sink.propertyNamed("$LineLocation", term_1867);
				Term term_1158;
				{
					BufferSink buf_747 = sink.context().makeBuffer();
					buf_747.start(_M_STRING);
					buf_747.literal(14);
					buf_747.end();
					term_1158 = buf_747.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1158);
				sink.start(_M__sTextCons);
				Term term_1194;
				{
					BufferSink buf_1282 = sink.context().makeBuffer();
					buf_1282.start(_M_STRING);
					buf_1282.literal(1);
					buf_1282.end();
					term_1194 = buf_1282.term();
				}
				sink.propertyNamed("$LineLocation", term_1194);
				Term term_1320;
				{
					BufferSink buf_794 = sink.context().makeBuffer();
					buf_794.start(_M_STRING);
					buf_794.literal(14);
					buf_794.end();
					term_1320 = buf_794.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1320);
				sink.start(_M__sTextEmbed);
				Term term_560;
				{
					BufferSink buf_984 = sink.context().makeBuffer();
					buf_984.start(_M_STRING);
					buf_984.literal(1);
					buf_984.end();
					term_560 = buf_984.term();
				}
				sink.propertyNamed("$LineLocation", term_560);
				Term term_1056;
				{
					BufferSink buf_1070 = sink.context().makeBuffer();
					buf_1070.start(_M_STRING);
					buf_1070.literal(14);
					buf_1070.end();
					term_1056 = buf_1070.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1056);
				sink.start(_M_AsText);
				sink.copy(sub_32.ref());
				sink.end();
				sink.end();
				Term term_803;
				{
					BufferSink buf_1094 = sink.context().makeBuffer();
					buf_1094.start(_M_STRING);
					buf_1094.literal(1);
					buf_1094.end();
					term_803 = buf_1094.term();
				}
				sink.propertyNamed("$LineLocation", term_803);
				Term term_1151;
				{
					BufferSink buf_1292 = sink.context().makeBuffer();
					buf_1292.start(_M_STRING);
					buf_1292.literal(17);
					buf_1292.end();
					term_1151 = buf_1292.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1151);
				sink.start(_M__sTextCons);
				Term term_1991;
				{
					BufferSink buf_1023 = sink.context().makeBuffer();
					buf_1023.start(_M_STRING);
					buf_1023.literal(1);
					buf_1023.end();
					term_1991 = buf_1023.term();
				}
				sink.propertyNamed("$LineLocation", term_1991);
				Term term_1336;
				{
					BufferSink buf_1243 = sink.context().makeBuffer();
					buf_1243.start(_M_STRING);
					buf_1243.literal(17);
					buf_1243.end();
					term_1336 = buf_1243.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1336);
				sink.start(_M__sTextChars);
				sink.literal(" == null ? null : ");
				sink.end();
				Term term_957;
				{
					BufferSink buf_1119 = sink.context().makeBuffer();
					buf_1119.start(_M_STRING);
					buf_1119.literal(1);
					buf_1119.end();
					term_957 = buf_1119.term();
				}
				sink.propertyNamed("$LineLocation", term_957);
				Term term_1565;
				{
					BufferSink buf_1452 = sink.context().makeBuffer();
					buf_1452.start(_M_STRING);
					buf_1452.literal(25);
					buf_1452.end();
					term_1565 = buf_1452.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1565);
				sink.start(_M__sTextCons);
				Term term_875;
				{
					BufferSink buf_1397 = sink.context().makeBuffer();
					buf_1397.start(_M_STRING);
					buf_1397.literal(1);
					buf_1397.end();
					term_875 = buf_1397.term();
				}
				sink.propertyNamed("$LineLocation", term_875);
				Term term_1057;
				{
					BufferSink buf_1270 = sink.context().makeBuffer();
					buf_1270.start(_M_STRING);
					buf_1270.literal(25);
					buf_1270.end();
					term_1057 = buf_1270.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1057);
				sink.start(_M__sTextEmbed);
				Term term_1337;
				{
					BufferSink buf_1284 = sink.context().makeBuffer();
					buf_1284.start(_M_STRING);
					buf_1284.literal(1);
					buf_1284.end();
					term_1337 = buf_1284.term();
				}
				sink.propertyNamed("$LineLocation", term_1337);
				Term term_1384;
				{
					BufferSink buf_1317 = sink.context().makeBuffer();
					buf_1317.start(_M_STRING);
					buf_1317.literal(25);
					buf_1317.end();
					term_1384 = buf_1317.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1384);
				sink.start(_M_AsText);
				sink.copy(sub_32.ref());
				sink.end();
				sink.end();
				Term term_1478;
				{
					BufferSink buf_1563 = sink.context().makeBuffer();
					buf_1563.start(_M_STRING);
					buf_1563.literal(1);
					buf_1563.end();
					term_1478 = buf_1563.term();
				}
				sink.propertyNamed("$LineLocation", term_1478);
				Term term_1068;
				{
					BufferSink buf_1557 = sink.context().makeBuffer();
					buf_1557.start(_M_STRING);
					buf_1557.literal(43);
					buf_1557.end();
					term_1068 = buf_1557.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1068);
				sink.start(_M__sTextCons);
				Term term_1085;
				{
					BufferSink buf_1367 = sink.context().makeBuffer();
					buf_1367.start(_M_STRING);
					buf_1367.literal(1);
					buf_1367.end();
					term_1085 = buf_1367.term();
				}
				sink.propertyNamed("$LineLocation", term_1085);
				Term term_1169;
				{
					BufferSink buf_1388 = sink.context().makeBuffer();
					buf_1388.start(_M_STRING);
					buf_1388.literal(43);
					buf_1388.end();
					term_1169 = buf_1388.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1169);
				sink.start(_M__sTextChars);
				sink.literal(".lookup(");
				sink.end();
				Term term_663;
				{
					BufferSink buf_1142 = sink.context().makeBuffer();
					buf_1142.start(_M_STRING);
					buf_1142.literal(1);
					buf_1142.end();
					term_663 = buf_1142.term();
				}
				sink.propertyNamed("$LineLocation", term_663);
				Term term_1476;
				{
					BufferSink buf_1018 = sink.context().makeBuffer();
					buf_1018.start(_M_STRING);
					buf_1018.literal(51);
					buf_1018.end();
					term_1476 = buf_1018.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1476);
				sink.start(_M__sTextCons);
				Term term_1293;
				{
					BufferSink buf_777 = sink.context().makeBuffer();
					buf_777.start(_M_STRING);
					buf_777.literal(1);
					buf_777.end();
					term_1293 = buf_777.term();
				}
				sink.propertyNamed("$LineLocation", term_1293);
				Term term_1584;
				{
					BufferSink buf_1084 = sink.context().makeBuffer();
					buf_1084.start(_M_STRING);
					buf_1084.literal(51);
					buf_1084.end();
					term_1584 = buf_1084.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1584);
				sink.start(_M__sTextEmbed);
				Term term_961;
				{
					BufferSink buf_1619 = sink.context().makeBuffer();
					buf_1619.start(_M_STRING);
					buf_1619.literal(1);
					buf_1619.end();
					term_961 = buf_1619.term();
				}
				sink.propertyNamed("$LineLocation", term_961);
				Term term_1059;
				{
					BufferSink buf_923 = sink.context().makeBuffer();
					buf_923.start(_M_STRING);
					buf_923.literal(51);
					buf_923.end();
					term_1059 = buf_923.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1059);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_9));
				sink.start(_M_MetaVar);
				sink.copy(sub_294.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_1243;
				{
					BufferSink buf_1153 = sink.context().makeBuffer();
					buf_1153.start(_M_STRING);
					buf_1153.literal(1);
					buf_1153.end();
					term_1243 = buf_1153.term();
				}
				sink.propertyNamed("$LineLocation", term_1243);
				Term term_2187;
				{
					BufferSink buf_1345 = sink.context().makeBuffer();
					buf_1345.start(_M_STRING);
					buf_1345.literal(59);
					buf_1345.end();
					term_2187 = buf_1345.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2187);
				sink.start(_M__sTextCons);
				Term term_1088;
				{
					BufferSink buf_1391 = sink.context().makeBuffer();
					buf_1391.start(_M_STRING);
					buf_1391.literal(1);
					buf_1391.end();
					term_1088 = buf_1391.term();
				}
				sink.propertyNamed("$LineLocation", term_1088);
				Term term_1434;
				{
					BufferSink buf_807 = sink.context().makeBuffer();
					buf_807.start(_M_STRING);
					buf_807.literal(59);
					buf_807.end();
					term_1434 = buf_807.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1434);
				sink.start(_M__sTextChars);
				sink.literal(");");
				sink.end();
				Term term_1242;
				{
					BufferSink buf_1258 = sink.context().makeBuffer();
					buf_1258.start(_M_STRING);
					buf_1258.literal(1);
					buf_1258.end();
					term_1242 = buf_1258.term();
				}
				sink.propertyNamed("$LineLocation", term_1242);
				Term term_1591;
				{
					BufferSink buf_1227 = sink.context().makeBuffer();
					buf_1227.start(_M_STRING);
					buf_1227.literal(83);
					buf_1227.end();
					term_1591 = buf_1227.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1591);
				sink.start(_M__sTextCons);
				Term term_837;
				{
					BufferSink buf_1838 = sink.context().makeBuffer();
					buf_1838.start(_M_STRING);
					buf_1838.literal(1);
					buf_1838.end();
					term_837 = buf_1838.term();
				}
				sink.propertyNamed("$LineLocation", term_837);
				Term term_1792;
				{
					BufferSink buf_1000 = sink.context().makeBuffer();
					buf_1000.start(_M_STRING);
					buf_1000.literal(83);
					buf_1000.end();
					term_1792 = buf_1000.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1792);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1134;
				{
					BufferSink buf_1169 = sink.context().makeBuffer();
					buf_1169.start(_M_STRING);
					buf_1169.literal(1);
					buf_1169.end();
					term_1134 = buf_1169.term();
				}
				sink.propertyNamed("$LineLocation", term_1134);
				Term term_1563;
				{
					BufferSink buf_1164 = sink.context().makeBuffer();
					buf_1164.start(_M_STRING);
					buf_1164.literal(85);
					buf_1164.end();
					term_1563 = buf_1164.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1563);
				sink.start(_M__sTextCons);
				Term term_1831;
				{
					BufferSink buf_996 = sink.context().makeBuffer();
					buf_996.start(_M_STRING);
					buf_996.literal(1);
					buf_996.end();
					term_1831 = buf_996.term();
				}
				sink.propertyNamed("$LineLocation", term_1831);
				Term term_1184;
				{
					BufferSink buf_1337 = sink.context().makeBuffer();
					buf_1337.start(_M_STRING);
					buf_1337.literal(85);
					buf_1337.end();
					term_1184 = buf_1337.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1184);
				sink.start(_M__sTextChars);
				sink.literal("if (");
				sink.end();
				Term term_1636;
				{
					BufferSink buf_1691 = sink.context().makeBuffer();
					buf_1691.start(_M_STRING);
					buf_1691.literal(2);
					buf_1691.end();
					term_1636 = buf_1691.term();
				}
				sink.propertyNamed("$LineLocation", term_1636);
				Term term_1121;
				{
					BufferSink buf_513 = sink.context().makeBuffer();
					buf_513.start(_M_STRING);
					buf_513.literal(1);
					buf_513.end();
					term_1121 = buf_513.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1121);
				sink.start(_M__sTextCons);
				Term term_1382;
				{
					BufferSink buf_1128 = sink.context().makeBuffer();
					buf_1128.start(_M_STRING);
					buf_1128.literal(2);
					buf_1128.end();
					term_1382 = buf_1128.term();
				}
				sink.propertyNamed("$LineLocation", term_1382);
				Term term_1411;
				{
					BufferSink buf_1289 = sink.context().makeBuffer();
					buf_1289.start(_M_STRING);
					buf_1289.literal(1);
					buf_1289.end();
					term_1411 = buf_1289.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1411);
				sink.start(_M__sTextEmbed);
				Term term_818;
				{
					BufferSink buf_844 = sink.context().makeBuffer();
					buf_844.start(_M_STRING);
					buf_844.literal(2);
					buf_844.end();
					term_818 = buf_844.term();
				}
				sink.propertyNamed("$LineLocation", term_818);
				Term term_1200;
				{
					BufferSink buf_1538 = sink.context().makeBuffer();
					buf_1538.start(_M_STRING);
					buf_1538.literal(1);
					buf_1538.end();
					term_1200 = buf_1538.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1200);
				sink.start(_M_AsText);
				sink.use(var_62);
				sink.end();
				sink.end();
				Term term_883;
				{
					BufferSink buf_727 = sink.context().makeBuffer();
					buf_727.start(_M_STRING);
					buf_727.literal(2);
					buf_727.end();
					term_883 = buf_727.term();
				}
				sink.propertyNamed("$LineLocation", term_883);
				Term term_1018;
				{
					BufferSink buf_1253 = sink.context().makeBuffer();
					buf_1253.start(_M_STRING);
					buf_1253.literal(5);
					buf_1253.end();
					term_1018 = buf_1253.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1018);
				sink.start(_M__sTextCons);
				Term term_1084;
				{
					BufferSink buf_1241 = sink.context().makeBuffer();
					buf_1241.start(_M_STRING);
					buf_1241.literal(2);
					buf_1241.end();
					term_1084 = buf_1241.term();
				}
				sink.propertyNamed("$LineLocation", term_1084);
				Term term_1665;
				{
					BufferSink buf_890 = sink.context().makeBuffer();
					buf_890.start(_M_STRING);
					buf_890.literal(5);
					buf_890.end();
					term_1665 = buf_890.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1665);
				sink.start(_M__sTextChars);
				sink.literal(" == null) ");
				sink.end();
				Term term_865;
				{
					BufferSink buf_683 = sink.context().makeBuffer();
					buf_683.start(_M_STRING);
					buf_683.literal(2);
					buf_683.end();
					term_865 = buf_683.term();
				}
				sink.propertyNamed("$LineLocation", term_865);
				Term term_893;
				{
					BufferSink buf_1637 = sink.context().makeBuffer();
					buf_1637.start(_M_STRING);
					buf_1637.literal(12);
					buf_1637.end();
					term_893 = buf_1637.term();
				}
				sink.propertyNamed("$ColumnLocation", term_893);
				sink.start(_M__sTextCons);
				Term term_845;
				{
					BufferSink buf_953 = sink.context().makeBuffer();
					buf_953.start(_M_STRING);
					buf_953.literal(2);
					buf_953.end();
					term_845 = buf_953.term();
				}
				sink.propertyNamed("$LineLocation", term_845);
				Term term_1062;
				{
					BufferSink buf_1133 = sink.context().makeBuffer();
					buf_1133.start(_M_STRING);
					buf_1133.literal(12);
					buf_1133.end();
					term_1062 = buf_1133.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1062);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1633;
				{
					BufferSink buf_1127 = sink.context().makeBuffer();
					buf_1127.start(_M_STRING);
					buf_1127.literal(2);
					buf_1127.end();
					term_1633 = buf_1127.term();
				}
				sink.propertyNamed("$LineLocation", term_1633);
				Term term_1255;
				{
					BufferSink buf_1395 = sink.context().makeBuffer();
					buf_1395.start(_M_STRING);
					buf_1395.literal(22);
					buf_1395.end();
					term_1255 = buf_1395.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1255);
				sink.start(_M__sTextCons);
				Term term_1205;
				{
					BufferSink buf_831 = sink.context().makeBuffer();
					buf_831.start(_M_STRING);
					buf_831.literal(2);
					buf_831.end();
					term_1205 = buf_831.term();
				}
				sink.propertyNamed("$LineLocation", term_1205);
				Term term_1140;
				{
					BufferSink buf_1242 = sink.context().makeBuffer();
					buf_1242.start(_M_STRING);
					buf_1242.literal(22);
					buf_1242.end();
					term_1140 = buf_1242.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1140);
				sink.start(_M__sTextChars);
				sink.literal("{");
				sink.end();
				Term term_1183;
				{
					BufferSink buf_752 = sink.context().makeBuffer();
					buf_752.start(_M_STRING);
					buf_752.literal(3);
					buf_752.end();
					term_1183 = buf_752.term();
				}
				sink.propertyNamed("$LineLocation", term_1183);
				Term term_1363;
				{
					BufferSink buf_755 = sink.context().makeBuffer();
					buf_755.start(_M_STRING);
					buf_755.literal(1);
					buf_755.end();
					term_1363 = buf_755.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1363);
				sink.start(_M__sTextCons);
				Term term_772;
				{
					BufferSink buf_906 = sink.context().makeBuffer();
					buf_906.start(_M_STRING);
					buf_906.literal(3);
					buf_906.end();
					term_772 = buf_906.term();
				}
				sink.propertyNamed("$LineLocation", term_772);
				Term term_1225;
				{
					BufferSink buf_1709 = sink.context().makeBuffer();
					buf_1709.start(_M_STRING);
					buf_1709.literal(2);
					buf_1709.end();
					term_1225 = buf_1709.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1225);
				sink.start(_M__sTextIndent);
				Term term_933;
				{
					BufferSink buf_1069 = sink.context().makeBuffer();
					buf_1069.start(_M_STRING);
					buf_1069.literal(3);
					buf_1069.end();
					term_933 = buf_1069.term();
				}
				sink.propertyNamed("$LineLocation", term_933);
				Term term_1596;
				{
					BufferSink buf_1437 = sink.context().makeBuffer();
					buf_1437.start(_M_STRING);
					buf_1437.literal(2);
					buf_1437.end();
					term_1596 = buf_1437.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1596);
				sink.start(_M__sTextCons);
				Term term_1625;
				{
					BufferSink buf_1686 = sink.context().makeBuffer();
					buf_1686.start(_M_STRING);
					buf_1686.literal(3);
					buf_1686.end();
					term_1625 = buf_1686.term();
				}
				sink.propertyNamed("$LineLocation", term_1625);
				Term term_1550;
				{
					BufferSink buf_1050 = sink.context().makeBuffer();
					buf_1050.start(_M_STRING);
					buf_1050.literal(2);
					buf_1050.end();
					term_1550 = buf_1050.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1550);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1786;
				{
					BufferSink buf_1487 = sink.context().makeBuffer();
					buf_1487.start(_M_STRING);
					buf_1487.literal(3);
					buf_1487.end();
					term_1786 = buf_1487.term();
				}
				sink.propertyNamed("$LineLocation", term_1786);
				Term term_942;
				{
					BufferSink buf_1543 = sink.context().makeBuffer();
					buf_1543.start(_M_STRING);
					buf_1543.literal(3);
					buf_1543.end();
					term_942 = buf_1543.term();
				}
				sink.propertyNamed("$ColumnLocation", term_942);
				sink.start(_M__sTextCons);
				Term term_1038;
				{
					BufferSink buf_2098 = sink.context().makeBuffer();
					buf_2098.start(_M_STRING);
					buf_2098.literal(3);
					buf_2098.end();
					term_1038 = buf_2098.term();
				}
				sink.propertyNamed("$LineLocation", term_1038);
				Term term_1041;
				{
					BufferSink buf_898 = sink.context().makeBuffer();
					buf_898.start(_M_STRING);
					buf_898.literal(3);
					buf_898.end();
					term_1041 = buf_898.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1041);
				sink.start(_M__sTextChars);
				sink.literal("  break ");
				sink.end();
				Term term_879;
				{
					BufferSink buf_1592 = sink.context().makeBuffer();
					buf_1592.start(_M_STRING);
					buf_1592.literal(4);
					buf_1592.end();
					term_879 = buf_1592.term();
				}
				sink.propertyNamed("$LineLocation", term_879);
				Term term_1101;
				{
					BufferSink buf_1156 = sink.context().makeBuffer();
					buf_1156.start(_M_STRING);
					buf_1156.literal(1);
					buf_1156.end();
					term_1101 = buf_1156.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1101);
				sink.start(_M__sTextCons);
				Term term_1804;
				{
					BufferSink buf_1389 = sink.context().makeBuffer();
					buf_1389.start(_M_STRING);
					buf_1389.literal(4);
					buf_1389.end();
					term_1804 = buf_1389.term();
				}
				sink.propertyNamed("$LineLocation", term_1804);
				Term term_1296;
				{
					BufferSink buf_816 = sink.context().makeBuffer();
					buf_816.start(_M_STRING);
					buf_816.literal(1);
					buf_816.end();
					term_1296 = buf_816.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1296);
				sink.start(_M__sTextEmbed);
				Term term_1280;
				{
					BufferSink buf_1652 = sink.context().makeBuffer();
					buf_1652.start(_M_STRING);
					buf_1652.literal(4);
					buf_1652.end();
					term_1280 = buf_1652.term();
				}
				sink.propertyNamed("$LineLocation", term_1280);
				Term term_773;
				{
					BufferSink buf_911 = sink.context().makeBuffer();
					buf_911.start(_M_STRING);
					buf_911.literal(1);
					buf_911.end();
					term_773 = buf_911.term();
				}
				sink.propertyNamed("$ColumnLocation", term_773);
				sink.start(_M_AsText);
				sink.copy(sub_109.ref());
				sink.end();
				sink.end();
				Term term_1253;
				{
					BufferSink buf_963 = sink.context().makeBuffer();
					buf_963.start(_M_STRING);
					buf_963.literal(4);
					buf_963.end();
					term_1253 = buf_963.term();
				}
				sink.propertyNamed("$LineLocation", term_1253);
				Term term_1160;
				{
					BufferSink buf_1035 = sink.context().makeBuffer();
					buf_1035.start(_M_STRING);
					buf_1035.literal(9);
					buf_1035.end();
					term_1160 = buf_1035.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1160);
				sink.start(_M__sTextCons);
				Term term_963;
				{
					BufferSink buf_852 = sink.context().makeBuffer();
					buf_852.start(_M_STRING);
					buf_852.literal(4);
					buf_852.end();
					term_963 = buf_852.term();
				}
				sink.propertyNamed("$LineLocation", term_963);
				Term term_1717;
				{
					BufferSink buf_614 = sink.context().makeBuffer();
					buf_614.start(_M_STRING);
					buf_614.literal(9);
					buf_614.end();
					term_1717 = buf_614.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1717);
				sink.start(_M__sTextChars);
				sink.literal(";");
				sink.end();
				Term term_1561;
				{
					BufferSink buf_930 = sink.context().makeBuffer();
					buf_930.start(_M_STRING);
					buf_930.literal(4);
					buf_930.end();
					term_1561 = buf_930.term();
				}
				sink.propertyNamed("$LineLocation", term_1561);
				Term term_1113;
				{
					BufferSink buf_1246 = sink.context().makeBuffer();
					buf_1246.start(_M_STRING);
					buf_1246.literal(17);
					buf_1246.end();
					term_1113 = buf_1246.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1113);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				Term term_846;
				{
					BufferSink buf_466 = sink.context().makeBuffer();
					buf_466.start(_M_STRING);
					buf_466.literal(4);
					buf_466.end();
					term_846 = buf_466.term();
				}
				sink.propertyNamed("$LineLocation", term_846);
				Term term_1495;
				{
					BufferSink buf_1378 = sink.context().makeBuffer();
					buf_1378.start(_M_STRING);
					buf_1378.literal(18);
					buf_1378.end();
					term_1495 = buf_1378.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1495);
				sink.start(_M__sTextCons);
				Term term_1039;
				{
					BufferSink buf_1025 = sink.context().makeBuffer();
					buf_1025.start(_M_STRING);
					buf_1025.literal(4);
					buf_1025.end();
					term_1039 = buf_1025.term();
				}
				sink.propertyNamed("$LineLocation", term_1039);
				Term term_1177;
				{
					BufferSink buf_829 = sink.context().makeBuffer();
					buf_829.start(_M_STRING);
					buf_829.literal(18);
					buf_829.end();
					term_1177 = buf_829.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1177);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_801;
				{
					BufferSink buf_825 = sink.context().makeBuffer();
					buf_825.start(_M_STRING);
					buf_825.literal(4);
					buf_825.end();
					term_801 = buf_825.term();
				}
				sink.propertyNamed("$LineLocation", term_801);
				Term term_1442;
				{
					BufferSink buf_1279 = sink.context().makeBuffer();
					buf_1279.start(_M_STRING);
					buf_1279.literal(19);
					buf_1279.end();
					term_1442 = buf_1279.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1442);
				sink.start(_M__sTextCons);
				Term term_1034;
				{
					BufferSink buf_1090 = sink.context().makeBuffer();
					buf_1090.start(_M_STRING);
					buf_1090.literal(4);
					buf_1090.end();
					term_1034 = buf_1090.term();
				}
				sink.propertyNamed("$LineLocation", term_1034);
				Term term_1664;
				{
					BufferSink buf_1180 = sink.context().makeBuffer();
					buf_1180.start(_M_STRING);
					buf_1180.literal(19);
					buf_1180.end();
					term_1664 = buf_1180.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1664);
				sink.start(_M__sTextChars);
				sink.literal("}");
				sink.end();
				Term term_1233;
				{
					BufferSink buf_864 = sink.context().makeBuffer();
					buf_864.start(_M_STRING);
					buf_864.literal(5);
					buf_864.end();
					term_1233 = buf_864.term();
				}
				sink.propertyNamed("$LineLocation", term_1233);
				Term term_1652;
				{
					BufferSink buf_1266 = sink.context().makeBuffer();
					buf_1266.start(_M_STRING);
					buf_1266.literal(1);
					buf_1266.end();
					term_1652 = buf_1266.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1652);
				sink.start(_M__sTextCons);
				Term term_1424;
				{
					BufferSink buf_1072 = sink.context().makeBuffer();
					buf_1072.start(_M_STRING);
					buf_1072.literal(5);
					buf_1072.end();
					term_1424 = buf_1072.term();
				}
				sink.propertyNamed("$LineLocation", term_1424);
				Term term_1448;
				{
					BufferSink buf_1085 = sink.context().makeBuffer();
					buf_1085.start(_M_STRING);
					buf_1085.literal(1);
					buf_1085.end();
					term_1448 = buf_1085.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1448);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_890;
				{
					BufferSink buf_1212 = sink.context().makeBuffer();
					buf_1212.start(_M_STRING);
					buf_1212.literal(5);
					buf_1212.end();
					term_890 = buf_1212.term();
				}
				sink.propertyNamed("$LineLocation", term_890);
				Term term_1144;
				{
					BufferSink buf_1087 = sink.context().makeBuffer();
					buf_1087.start(_M_STRING);
					buf_1087.literal(2);
					buf_1087.end();
					term_1144 = buf_1087.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1144);
				sink.start(_M__sTextCons);
				Term term_1218;
				{
					BufferSink buf_1663 = sink.context().makeBuffer();
					buf_1663.start(_M_STRING);
					buf_1663.literal(5);
					buf_1663.end();
					term_1218 = buf_1663.term();
				}
				sink.propertyNamed("$LineLocation", term_1218);
				Term term_1234;
				{
					BufferSink buf_1052 = sink.context().makeBuffer();
					buf_1052.start(_M_STRING);
					buf_1052.literal(2);
					buf_1052.end();
					term_1234 = buf_1052.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1234);
				sink.start(_M__sTextEmbed);
				Term term_1303;
				{
					BufferSink buf_983 = sink.context().makeBuffer();
					buf_983.start(_M_STRING);
					buf_983.literal(5);
					buf_983.end();
					term_1303 = buf_983.term();
				}
				sink.propertyNamed("$LineLocation", term_1303);
				Term term_994;
				{
					BufferSink buf_1037 = sink.context().makeBuffer();
					buf_1037.start(_M_STRING);
					buf_1037.literal(2);
					buf_1037.end();
					term_994 = buf_1037.term();
				}
				sink.propertyNamed("$ColumnLocation", term_994);
				sink.start(_M_AsText);
				sink.use(var_62);
				sink.end();
				sink.end();
				Term term_1485;
				{
					BufferSink buf_1139 = sink.context().makeBuffer();
					buf_1139.start(_M_STRING);
					buf_1139.literal(6);
					buf_1139.end();
					term_1485 = buf_1139.term();
				}
				sink.propertyNamed("$LineLocation", term_1485);
				Term term_1307;
				{
					BufferSink buf_978 = sink.context().makeBuffer();
					buf_978.start(_M_STRING);
					buf_978.literal(1);
					buf_978.end();
					term_1307 = buf_978.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1307);
				sink.start(_M__sTextCons);
				Term term_1290;
				{
					BufferSink buf_1753 = sink.context().makeBuffer();
					buf_1753.start(_M_STRING);
					buf_1753.literal(6);
					buf_1753.end();
					term_1290 = buf_1753.term();
				}
				sink.propertyNamed("$LineLocation", term_1290);
				Term term_1731;
				{
					BufferSink buf_883 = sink.context().makeBuffer();
					buf_883.start(_M_STRING);
					buf_883.literal(1);
					buf_883.end();
					term_1731 = buf_883.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1731);
				sink.start(_M__sTextChars);
				sink.literal(" = ");
				sink.end();
				Term term_1938;
				{
					BufferSink buf_1462 = sink.context().makeBuffer();
					buf_1462.start(_M_STRING);
					buf_1462.literal(6);
					buf_1462.end();
					term_1938 = buf_1462.term();
				}
				sink.propertyNamed("$LineLocation", term_1938);
				Term term_1089;
				{
					BufferSink buf_1181 = sink.context().makeBuffer();
					buf_1181.start(_M_STRING);
					buf_1181.literal(8);
					buf_1181.end();
					term_1089 = buf_1181.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1089);
				sink.start(_M__sTextCons);
				Term term_1190;
				{
					BufferSink buf_1020 = sink.context().makeBuffer();
					buf_1020.start(_M_STRING);
					buf_1020.literal(6);
					buf_1020.end();
					term_1190 = buf_1020.term();
				}
				sink.propertyNamed("$LineLocation", term_1190);
				Term term_1064;
				{
					BufferSink buf_907 = sink.context().makeBuffer();
					buf_907.start(_M_STRING);
					buf_907.literal(8);
					buf_907.end();
					term_1064 = buf_907.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1064);
				sink.start(_M__sTextEmbed);
				Term term_1251;
				{
					BufferSink buf_1355 = sink.context().makeBuffer();
					buf_1355.start(_M_STRING);
					buf_1355.literal(6);
					buf_1355.end();
					term_1251 = buf_1355.term();
				}
				sink.propertyNamed("$LineLocation", term_1251);
				Term term_1174;
				{
					BufferSink buf_750 = sink.context().makeBuffer();
					buf_750.start(_M_STRING);
					buf_750.literal(8);
					buf_750.end();
					term_1174 = buf_750.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1174);
				sink.start(_M_AsText);
				sink.use(var_62);
				sink.end();
				sink.end();
				Term term_1087;
				{
					BufferSink buf_1396 = sink.context().makeBuffer();
					buf_1396.start(_M_STRING);
					buf_1396.literal(6);
					buf_1396.end();
					term_1087 = buf_1396.term();
				}
				sink.propertyNamed("$LineLocation", term_1087);
				Term term_1339;
				{
					BufferSink buf_992 = sink.context().makeBuffer();
					buf_992.start(_M_STRING);
					buf_992.literal(11);
					buf_992.end();
					term_1339 = buf_992.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1339);
				sink.start(_M__sTextCons);
				Term term_1278;
				{
					BufferSink buf_935 = sink.context().makeBuffer();
					buf_935.start(_M_STRING);
					buf_935.literal(6);
					buf_935.end();
					term_1278 = buf_935.term();
				}
				sink.propertyNamed("$LineLocation", term_1278);
				Term term_1118;
				{
					BufferSink buf_908 = sink.context().makeBuffer();
					buf_908.start(_M_STRING);
					buf_908.literal(11);
					buf_908.end();
					term_1118 = buf_908.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1118);
				sink.start(_M__sTextChars);
				sink.literal(".ref();");
				sink.end();
				Term term_929;
				{
					BufferSink buf_904 = sink.context().makeBuffer();
					buf_904.start(_M_STRING);
					buf_904.literal(6);
					buf_904.end();
					term_929 = buf_904.term();
				}
				sink.propertyNamed("$LineLocation", term_929);
				Term term_1106;
				{
					BufferSink buf_1507 = sink.context().makeBuffer();
					buf_1507.start(_M_STRING);
					buf_1507.literal(18);
					buf_1507.end();
					term_1106 = buf_1507.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1106);
				sink.start(_M__sTextCons);
				Term term_1870;
				{
					BufferSink buf_776 = sink.context().makeBuffer();
					buf_776.start(_M_STRING);
					buf_776.literal(6);
					buf_776.end();
					term_1870 = buf_776.term();
				}
				sink.propertyNamed("$LineLocation", term_1870);
				Term term_1750;
				{
					BufferSink buf_1642 = sink.context().makeBuffer();
					buf_1642.start(_M_STRING);
					buf_1642.literal(18);
					buf_1642.end();
					term_1750 = buf_1642.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1750);
				sink.start(_M__sTextEmbed);
				Term term_946;
				{
					BufferSink buf_1111 = sink.context().makeBuffer();
					buf_1111.start(_M_STRING);
					buf_1111.literal(6);
					buf_1111.end();
					term_946 = buf_1111.term();
				}
				sink.propertyNamed("$LineLocation", term_946);
				Term term_1147;
				{
					BufferSink buf_1079 = sink.context().makeBuffer();
					buf_1079.start(_M_STRING);
					buf_1079.literal(18);
					buf_1079.end();
					term_1147 = buf_1079.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1147);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_9));
				sink.start(_M_AddMetaVar);
				sink.copy(sub_445.ref());
				sink.use(var_62);
				sink.start(_M__sNil);
				sink.end();
				Variable var_185 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_185});
				VariableUse use_77 = sink.context().makeVariableUse(var_185);
				sink.substitute(term_686.ref(), new Variable[]
					{var_33}, new Term[]
					{use_77});
				sink.end();
				sink.end();
				sink.end();
				Term term_1067;
				{
					BufferSink buf_1556 = sink.context().makeBuffer();
					buf_1556.start(_M_STRING);
					buf_1556.literal(6);
					buf_1556.end();
					term_1067 = buf_1556.term();
				}
				sink.propertyNamed("$LineLocation", term_1067);
				Term term_1291;
				{
					BufferSink buf_1044 = sink.context().makeBuffer();
					buf_1044.start(_M_STRING);
					buf_1044.literal(25);
					buf_1044.end();
					term_1291 = buf_1044.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1291);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_51 :
			{
				Term value_138 = props_9 == null ? null : props_9.lookup("$props");
				if (value_138 == null)
				{
					break label_51;
				}
				if (value_138.descriptor() != _M_TEXT)
				{
					break label_51;
				}
				Term sub_130 = value_138.sub(0).ref();
				/* #props=sub */
				Term value_7 = props_9 == null ? null : props_9.lookup("$caselabel");
				if (value_7 == null)
				{
					break label_51;
				}
				if (value_7.descriptor() != _M_TEXT)
				{
					break label_51;
				}
				Term sub_100 = value_7.sub(0).ref();
				/* #label=sub */
				if (term_558.descriptor() != _M_Crsx_xproperty_xA6)
				{
					break label_51;
				}
				Term sub_114 = term_558.sub(0).ref();
				/* #VARIABLE=sub */Term sub_158 = term_558.sub(1).ref();
				Term sub_278 = term_558.sub(2).ref();
				if (sub_278.descriptor() != _M_Crsx_xfreeTerm_xA7)
				{
					break label_51;
				}
				Term sub_115 = sub_278.sub(0).ref();
				if (sub_115.descriptor() != _M__sNil)
				{
					break label_51;
				}
				Term sub_524 = sub_278.sub(1).ref();
				if (sub_524.descriptor() != _M__sNil)
				{
					break label_51;
				}
				Term sub_201 = sub_278.sub(2).ref();
				/* #METAVAR=sub */Term sub_354 = sub_278.sub(3).ref();
				if (sub_354.descriptor() != _M__sNil)
				{
					break label_51;
				}
				/* #term=term */
				/* #=term *//*Contract*/
				Variable var_48 = sink.context().makeVariable("value");
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1484;
				{
					BufferSink buf_1340 = sink.context().makeBuffer();
					buf_1340.start(_M_STRING);
					buf_1340.literal(1);
					buf_1340.end();
					term_1484 = buf_1340.term();
				}
				sink.propertyNamed("$LineLocation", term_1484);
				Term term_1746;
				{
					BufferSink buf_1209 = sink.context().makeBuffer();
					buf_1209.start(_M_STRING);
					buf_1209.literal(1);
					buf_1209.end();
					term_1746 = buf_1209.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1746);
				sink.start(_M__sTextCons);
				Term term_1289;
				{
					BufferSink buf_1216 = sink.context().makeBuffer();
					buf_1216.start(_M_STRING);
					buf_1216.literal(1);
					buf_1216.end();
					term_1289 = buf_1216.term();
				}
				sink.propertyNamed("$LineLocation", term_1289);
				Term term_2086;
				{
					BufferSink buf_1621 = sink.context().makeBuffer();
					buf_1621.start(_M_STRING);
					buf_1621.literal(1);
					buf_1621.end();
					term_2086 = buf_1621.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2086);
				sink.start(_M__sTextChars);
				sink.literal("Term ");
				sink.end();
				Term term_1207;
				{
					BufferSink buf_1496 = sink.context().makeBuffer();
					buf_1496.start(_M_STRING);
					buf_1496.literal(1);
					buf_1496.end();
					term_1207 = buf_1496.term();
				}
				sink.propertyNamed("$LineLocation", term_1207);
				Term term_1380;
				{
					BufferSink buf_1267 = sink.context().makeBuffer();
					buf_1267.start(_M_STRING);
					buf_1267.literal(2);
					buf_1267.end();
					term_1380 = buf_1267.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1380);
				sink.start(_M__sTextCons);
				Term term_1507;
				{
					BufferSink buf_1701 = sink.context().makeBuffer();
					buf_1701.start(_M_STRING);
					buf_1701.literal(1);
					buf_1701.end();
					term_1507 = buf_1701.term();
				}
				sink.propertyNamed("$LineLocation", term_1507);
				Term term_1170;
				{
					BufferSink buf_1225 = sink.context().makeBuffer();
					buf_1225.start(_M_STRING);
					buf_1225.literal(2);
					buf_1225.end();
					term_1170 = buf_1225.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1170);
				sink.start(_M__sTextEmbed);
				Term term_1351;
				{
					BufferSink buf_1002 = sink.context().makeBuffer();
					buf_1002.start(_M_STRING);
					buf_1002.literal(1);
					buf_1002.end();
					term_1351 = buf_1002.term();
				}
				sink.propertyNamed("$LineLocation", term_1351);
				Term term_715;
				{
					BufferSink buf_1468 = sink.context().makeBuffer();
					buf_1468.start(_M_STRING);
					buf_1468.literal(2);
					buf_1468.end();
					term_715 = buf_1468.term();
				}
				sink.propertyNamed("$ColumnLocation", term_715);
				sink.start(_M_AsText);
				sink.use(var_48);
				sink.end();
				sink.end();
				Term term_904;
				{
					BufferSink buf_1466 = sink.context().makeBuffer();
					buf_1466.start(_M_STRING);
					buf_1466.literal(1);
					buf_1466.end();
					term_904 = buf_1466.term();
				}
				sink.propertyNamed("$LineLocation", term_904);
				Term term_1899;
				{
					BufferSink buf_1477 = sink.context().makeBuffer();
					buf_1477.start(_M_STRING);
					buf_1477.literal(7);
					buf_1477.end();
					term_1899 = buf_1477.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1899);
				sink.start(_M__sTextCons);
				Term term_1464;
				{
					BufferSink buf_1486 = sink.context().makeBuffer();
					buf_1486.start(_M_STRING);
					buf_1486.literal(1);
					buf_1486.end();
					term_1464 = buf_1486.term();
				}
				sink.propertyNamed("$LineLocation", term_1464);
				Term term_1451;
				{
					BufferSink buf_1772 = sink.context().makeBuffer();
					buf_1772.start(_M_STRING);
					buf_1772.literal(7);
					buf_1772.end();
					term_1451 = buf_1772.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1451);
				sink.start(_M__sTextChars);
				sink.literal(" = ");
				sink.end();
				Term term_1017;
				{
					BufferSink buf_1380 = sink.context().makeBuffer();
					buf_1380.start(_M_STRING);
					buf_1380.literal(1);
					buf_1380.end();
					term_1017 = buf_1380.term();
				}
				sink.propertyNamed("$LineLocation", term_1017);
				Term term_1450;
				{
					BufferSink buf_916 = sink.context().makeBuffer();
					buf_916.start(_M_STRING);
					buf_916.literal(14);
					buf_916.end();
					term_1450 = buf_916.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1450);
				sink.start(_M__sTextCons);
				Term term_2101;
				{
					BufferSink buf_1129 = sink.context().makeBuffer();
					buf_1129.start(_M_STRING);
					buf_1129.literal(1);
					buf_1129.end();
					term_2101 = buf_1129.term();
				}
				sink.propertyNamed("$LineLocation", term_2101);
				Term term_813;
				{
					BufferSink buf_1891 = sink.context().makeBuffer();
					buf_1891.start(_M_STRING);
					buf_1891.literal(14);
					buf_1891.end();
					term_813 = buf_1891.term();
				}
				sink.propertyNamed("$ColumnLocation", term_813);
				sink.start(_M__sTextEmbed);
				Term term_1347;
				{
					BufferSink buf_929 = sink.context().makeBuffer();
					buf_929.start(_M_STRING);
					buf_929.literal(1);
					buf_929.end();
					term_1347 = buf_929.term();
				}
				sink.propertyNamed("$LineLocation", term_1347);
				Term term_679;
				{
					BufferSink buf_1231 = sink.context().makeBuffer();
					buf_1231.start(_M_STRING);
					buf_1231.literal(14);
					buf_1231.end();
					term_679 = buf_1231.term();
				}
				sink.propertyNamed("$ColumnLocation", term_679);
				sink.start(_M_AsText);
				sink.copy(sub_130.ref());
				sink.end();
				sink.end();
				Term term_780;
				{
					BufferSink buf_1578 = sink.context().makeBuffer();
					buf_1578.start(_M_STRING);
					buf_1578.literal(1);
					buf_1578.end();
					term_780 = buf_1578.term();
				}
				sink.propertyNamed("$LineLocation", term_780);
				Term term_1139;
				{
					BufferSink buf_1005 = sink.context().makeBuffer();
					buf_1005.start(_M_STRING);
					buf_1005.literal(17);
					buf_1005.end();
					term_1139 = buf_1005.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1139);
				sink.start(_M__sTextCons);
				Term term_934;
				{
					BufferSink buf_1463 = sink.context().makeBuffer();
					buf_1463.start(_M_STRING);
					buf_1463.literal(1);
					buf_1463.end();
					term_934 = buf_1463.term();
				}
				sink.propertyNamed("$LineLocation", term_934);
				Term term_1493;
				{
					BufferSink buf_954 = sink.context().makeBuffer();
					buf_954.start(_M_STRING);
					buf_954.literal(17);
					buf_954.end();
					term_1493 = buf_954.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1493);
				sink.start(_M__sTextChars);
				sink.literal(" == null ? null : ");
				sink.end();
				Term term_1548;
				{
					BufferSink buf_1272 = sink.context().makeBuffer();
					buf_1272.start(_M_STRING);
					buf_1272.literal(1);
					buf_1272.end();
					term_1548 = buf_1272.term();
				}
				sink.propertyNamed("$LineLocation", term_1548);
				Term term_1389;
				{
					BufferSink buf_770 = sink.context().makeBuffer();
					buf_770.start(_M_STRING);
					buf_770.literal(25);
					buf_770.end();
					term_1389 = buf_770.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1389);
				sink.start(_M__sTextCons);
				Term term_1516;
				{
					BufferSink buf_940 = sink.context().makeBuffer();
					buf_940.start(_M_STRING);
					buf_940.literal(1);
					buf_940.end();
					term_1516 = buf_940.term();
				}
				sink.propertyNamed("$LineLocation", term_1516);
				Term term_1250;
				{
					BufferSink buf_1027 = sink.context().makeBuffer();
					buf_1027.start(_M_STRING);
					buf_1027.literal(25);
					buf_1027.end();
					term_1250 = buf_1027.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1250);
				sink.start(_M__sTextEmbed);
				Term term_1086;
				{
					BufferSink buf_1226 = sink.context().makeBuffer();
					buf_1226.start(_M_STRING);
					buf_1226.literal(1);
					buf_1226.end();
					term_1086 = buf_1226.term();
				}
				sink.propertyNamed("$LineLocation", term_1086);
				Term term_1352;
				{
					BufferSink buf_1299 = sink.context().makeBuffer();
					buf_1299.start(_M_STRING);
					buf_1299.literal(25);
					buf_1299.end();
					term_1352 = buf_1299.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1352);
				sink.start(_M_AsText);
				sink.copy(sub_130.ref());
				sink.end();
				sink.end();
				Term term_843;
				{
					BufferSink buf_1143 = sink.context().makeBuffer();
					buf_1143.start(_M_STRING);
					buf_1143.literal(1);
					buf_1143.end();
					term_843 = buf_1143.term();
				}
				sink.propertyNamed("$LineLocation", term_843);
				Term term_1016;
				{
					BufferSink buf_1172 = sink.context().makeBuffer();
					buf_1172.start(_M_STRING);
					buf_1172.literal(43);
					buf_1172.end();
					term_1016 = buf_1172.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1016);
				sink.start(_M__sTextCons);
				Term term_1621;
				{
					BufferSink buf_693 = sink.context().makeBuffer();
					buf_693.start(_M_STRING);
					buf_693.literal(1);
					buf_693.end();
					term_1621 = buf_693.term();
				}
				sink.propertyNamed("$LineLocation", term_1621);
				Term term_1809;
				{
					BufferSink buf_1455 = sink.context().makeBuffer();
					buf_1455.start(_M_STRING);
					buf_1455.literal(43);
					buf_1455.end();
					term_1809 = buf_1455.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1809);
				sink.start(_M__sTextChars);
				sink.literal(".lookup(");
				sink.end();
				Term term_1644;
				{
					BufferSink buf_861 = sink.context().makeBuffer();
					buf_861.start(_M_STRING);
					buf_861.literal(1);
					buf_861.end();
					term_1644 = buf_861.term();
				}
				sink.propertyNamed("$LineLocation", term_1644);
				Term term_1155;
				{
					BufferSink buf_1540 = sink.context().makeBuffer();
					buf_1540.start(_M_STRING);
					buf_1540.literal(51);
					buf_1540.end();
					term_1155 = buf_1540.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1155);
				sink.start(_M__sTextCons);
				Term term_1471;
				{
					BufferSink buf_868 = sink.context().makeBuffer();
					buf_868.start(_M_STRING);
					buf_868.literal(1);
					buf_868.end();
					term_1471 = buf_868.term();
				}
				sink.propertyNamed("$LineLocation", term_1471);
				Term term_1921;
				{
					BufferSink buf_1485 = sink.context().makeBuffer();
					buf_1485.start(_M_STRING);
					buf_1485.literal(51);
					buf_1485.end();
					term_1921 = buf_1485.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1921);
				sink.start(_M__sTextEmbed);
				Term term_1137;
				{
					BufferSink buf_1105 = sink.context().makeBuffer();
					buf_1105.start(_M_STRING);
					buf_1105.literal(1);
					buf_1105.end();
					term_1137 = buf_1105.term();
				}
				sink.propertyNamed("$LineLocation", term_1137);
				Term term_1577;
				{
					BufferSink buf_1600 = sink.context().makeBuffer();
					buf_1600.start(_M_STRING);
					buf_1600.literal(51);
					buf_1600.end();
					term_1577 = buf_1600.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1577);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_9));
				sink.start(_M_Variable);
				sink.copy(sub_114.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_975;
				{
					BufferSink buf_1051 = sink.context().makeBuffer();
					buf_1051.start(_M_STRING);
					buf_1051.literal(1);
					buf_1051.end();
					term_975 = buf_1051.term();
				}
				sink.propertyNamed("$LineLocation", term_975);
				Term term_1269;
				{
					BufferSink buf_2163 = sink.context().makeBuffer();
					buf_2163.start(_M_STRING);
					buf_2163.literal(59);
					buf_2163.end();
					term_1269 = buf_2163.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1269);
				sink.start(_M__sTextCons);
				Term term_1793;
				{
					BufferSink buf_2118 = sink.context().makeBuffer();
					buf_2118.start(_M_STRING);
					buf_2118.literal(1);
					buf_2118.end();
					term_1793 = buf_2118.term();
				}
				sink.propertyNamed("$LineLocation", term_1793);
				Term term_1425;
				{
					BufferSink buf_1207 = sink.context().makeBuffer();
					buf_1207.start(_M_STRING);
					buf_1207.literal(59);
					buf_1207.end();
					term_1425 = buf_1207.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1425);
				sink.start(_M__sTextChars);
				sink.literal(");");
				sink.end();
				Term term_2052;
				{
					BufferSink buf_1401 = sink.context().makeBuffer();
					buf_1401.start(_M_STRING);
					buf_1401.literal(1);
					buf_1401.end();
					term_2052 = buf_1401.term();
				}
				sink.propertyNamed("$LineLocation", term_2052);
				Term term_1575;
				{
					BufferSink buf_1235 = sink.context().makeBuffer();
					buf_1235.start(_M_STRING);
					buf_1235.literal(84);
					buf_1235.end();
					term_1575 = buf_1235.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1575);
				sink.start(_M__sTextCons);
				Term term_1120;
				{
					BufferSink buf_1572 = sink.context().makeBuffer();
					buf_1572.start(_M_STRING);
					buf_1572.literal(1);
					buf_1572.end();
					term_1120 = buf_1572.term();
				}
				sink.propertyNamed("$LineLocation", term_1120);
				Term term_1258;
				{
					BufferSink buf_848 = sink.context().makeBuffer();
					buf_848.start(_M_STRING);
					buf_848.literal(84);
					buf_848.end();
					term_1258 = buf_848.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1258);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1601;
				{
					BufferSink buf_1403 = sink.context().makeBuffer();
					buf_1403.start(_M_STRING);
					buf_1403.literal(1);
					buf_1403.end();
					term_1601 = buf_1403.term();
				}
				sink.propertyNamed("$LineLocation", term_1601);
				Term term_1244;
				{
					BufferSink buf_1693 = sink.context().makeBuffer();
					buf_1693.start(_M_STRING);
					buf_1693.literal(86);
					buf_1693.end();
					term_1244 = buf_1693.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1244);
				sink.start(_M__sTextCons);
				Term term_2915;
				{
					BufferSink buf_751 = sink.context().makeBuffer();
					buf_751.start(_M_STRING);
					buf_751.literal(1);
					buf_751.end();
					term_2915 = buf_751.term();
				}
				sink.propertyNamed("$LineLocation", term_2915);
				Term term_1622;
				{
					BufferSink buf_1681 = sink.context().makeBuffer();
					buf_1681.start(_M_STRING);
					buf_1681.literal(86);
					buf_1681.end();
					term_1622 = buf_1681.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1622);
				sink.start(_M__sTextChars);
				sink.literal("if (");
				sink.end();
				Term term_1070;
				{
					BufferSink buf_1152 = sink.context().makeBuffer();
					buf_1152.start(_M_STRING);
					buf_1152.literal(2);
					buf_1152.end();
					term_1070 = buf_1152.term();
				}
				sink.propertyNamed("$LineLocation", term_1070);
				Term term_1688;
				{
					BufferSink buf_1260 = sink.context().makeBuffer();
					buf_1260.start(_M_STRING);
					buf_1260.literal(1);
					buf_1260.end();
					term_1688 = buf_1260.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1688);
				sink.start(_M__sTextCons);
				Term term_1461;
				{
					BufferSink buf_956 = sink.context().makeBuffer();
					buf_956.start(_M_STRING);
					buf_956.literal(2);
					buf_956.end();
					term_1461 = buf_956.term();
				}
				sink.propertyNamed("$LineLocation", term_1461);
				Term term_1651;
				{
					BufferSink buf_809 = sink.context().makeBuffer();
					buf_809.start(_M_STRING);
					buf_809.literal(1);
					buf_809.end();
					term_1651 = buf_809.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1651);
				sink.start(_M__sTextEmbed);
				Term term_1713;
				{
					BufferSink buf_1327 = sink.context().makeBuffer();
					buf_1327.start(_M_STRING);
					buf_1327.literal(2);
					buf_1327.end();
					term_1713 = buf_1327.term();
				}
				sink.propertyNamed("$LineLocation", term_1713);
				Term term_1463;
				{
					BufferSink buf_1797 = sink.context().makeBuffer();
					buf_1797.start(_M_STRING);
					buf_1797.literal(1);
					buf_1797.end();
					term_1463 = buf_1797.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1463);
				sink.start(_M_AsText);
				sink.use(var_48);
				sink.end();
				sink.end();
				Term term_1526;
				{
					BufferSink buf_1808 = sink.context().makeBuffer();
					buf_1808.start(_M_STRING);
					buf_1808.literal(2);
					buf_1808.end();
					term_1526 = buf_1808.term();
				}
				sink.propertyNamed("$LineLocation", term_1526);
				Term term_1682;
				{
					BufferSink buf_1712 = sink.context().makeBuffer();
					buf_1712.start(_M_STRING);
					buf_1712.literal(5);
					buf_1712.end();
					term_1682 = buf_1712.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1682);
				sink.start(_M__sTextCons);
				Term term_847;
				{
					BufferSink buf_1167 = sink.context().makeBuffer();
					buf_1167.start(_M_STRING);
					buf_1167.literal(2);
					buf_1167.end();
					term_847 = buf_1167.term();
				}
				sink.propertyNamed("$LineLocation", term_847);
				Term term_1585;
				{
					BufferSink buf_1582 = sink.context().makeBuffer();
					buf_1582.start(_M_STRING);
					buf_1582.literal(5);
					buf_1582.end();
					term_1585 = buf_1582.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1585);
				sink.start(_M__sTextChars);
				sink.literal(" == null) ");
				sink.end();
				Term term_1216;
				{
					BufferSink buf_1584 = sink.context().makeBuffer();
					buf_1584.start(_M_STRING);
					buf_1584.literal(2);
					buf_1584.end();
					term_1216 = buf_1584.term();
				}
				sink.propertyNamed("$LineLocation", term_1216);
				Term term_1638;
				{
					BufferSink buf_1660 = sink.context().makeBuffer();
					buf_1660.start(_M_STRING);
					buf_1660.literal(12);
					buf_1660.end();
					term_1638 = buf_1660.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1638);
				sink.start(_M__sTextCons);
				Term term_1686;
				{
					BufferSink buf_1222 = sink.context().makeBuffer();
					buf_1222.start(_M_STRING);
					buf_1222.literal(2);
					buf_1222.end();
					term_1686 = buf_1222.term();
				}
				sink.propertyNamed("$LineLocation", term_1686);
				Term term_968;
				{
					BufferSink buf_1549 = sink.context().makeBuffer();
					buf_1549.start(_M_STRING);
					buf_1549.literal(12);
					buf_1549.end();
					term_968 = buf_1549.term();
				}
				sink.propertyNamed("$ColumnLocation", term_968);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1262;
				{
					BufferSink buf_1104 = sink.context().makeBuffer();
					buf_1104.start(_M_STRING);
					buf_1104.literal(2);
					buf_1104.end();
					term_1262 = buf_1104.term();
				}
				sink.propertyNamed("$LineLocation", term_1262);
				Term term_1505;
				{
					BufferSink buf_1228 = sink.context().makeBuffer();
					buf_1228.start(_M_STRING);
					buf_1228.literal(22);
					buf_1228.end();
					term_1505 = buf_1228.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1505);
				sink.start(_M__sTextCons);
				Term term_1259;
				{
					BufferSink buf_1856 = sink.context().makeBuffer();
					buf_1856.start(_M_STRING);
					buf_1856.literal(2);
					buf_1856.end();
					term_1259 = buf_1856.term();
				}
				sink.propertyNamed("$LineLocation", term_1259);
				Term term_1277;
				{
					BufferSink buf_833 = sink.context().makeBuffer();
					buf_833.start(_M_STRING);
					buf_833.literal(22);
					buf_833.end();
					term_1277 = buf_833.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1277);
				sink.start(_M__sTextChars);
				sink.literal("{");
				sink.end();
				Term term_1149;
				{
					BufferSink buf_1177 = sink.context().makeBuffer();
					buf_1177.start(_M_STRING);
					buf_1177.literal(3);
					buf_1177.end();
					term_1149 = buf_1177.term();
				}
				sink.propertyNamed("$LineLocation", term_1149);
				Term term_908;
				{
					BufferSink buf_1381 = sink.context().makeBuffer();
					buf_1381.start(_M_STRING);
					buf_1381.literal(1);
					buf_1381.end();
					term_908 = buf_1381.term();
				}
				sink.propertyNamed("$ColumnLocation", term_908);
				sink.start(_M__sTextCons);
				Term term_988;
				{
					BufferSink buf_1168 = sink.context().makeBuffer();
					buf_1168.start(_M_STRING);
					buf_1168.literal(3);
					buf_1168.end();
					term_988 = buf_1168.term();
				}
				sink.propertyNamed("$LineLocation", term_988);
				Term term_1236;
				{
					BufferSink buf_1414 = sink.context().makeBuffer();
					buf_1414.start(_M_STRING);
					buf_1414.literal(2);
					buf_1414.end();
					term_1236 = buf_1414.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1236);
				sink.start(_M__sTextIndent);
				Term term_1555;
				{
					BufferSink buf_1101 = sink.context().makeBuffer();
					buf_1101.start(_M_STRING);
					buf_1101.literal(3);
					buf_1101.end();
					term_1555 = buf_1101.term();
				}
				sink.propertyNamed("$LineLocation", term_1555);
				Term term_1217;
				{
					BufferSink buf_994 = sink.context().makeBuffer();
					buf_994.start(_M_STRING);
					buf_994.literal(2);
					buf_994.end();
					term_1217 = buf_994.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1217);
				sink.start(_M__sTextCons);
				Term term_862;
				{
					BufferSink buf_1624 = sink.context().makeBuffer();
					buf_1624.start(_M_STRING);
					buf_1624.literal(3);
					buf_1624.end();
					term_862 = buf_1624.term();
				}
				sink.propertyNamed("$LineLocation", term_862);
				Term term_1973;
				{
					BufferSink buf_1107 = sink.context().makeBuffer();
					buf_1107.start(_M_STRING);
					buf_1107.literal(2);
					buf_1107.end();
					term_1973 = buf_1107.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1973);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1755;
				{
					BufferSink buf_1019 = sink.context().makeBuffer();
					buf_1019.start(_M_STRING);
					buf_1019.literal(3);
					buf_1019.end();
					term_1755 = buf_1019.term();
				}
				sink.propertyNamed("$LineLocation", term_1755);
				Term term_1623;
				{
					BufferSink buf_1132 = sink.context().makeBuffer();
					buf_1132.start(_M_STRING);
					buf_1132.literal(3);
					buf_1132.end();
					term_1623 = buf_1132.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1623);
				sink.start(_M__sTextCons);
				Term term_1853;
				{
					BufferSink buf_1384 = sink.context().makeBuffer();
					buf_1384.start(_M_STRING);
					buf_1384.literal(3);
					buf_1384.end();
					term_1853 = buf_1384.term();
				}
				sink.propertyNamed("$LineLocation", term_1853);
				Term term_1457;
				{
					BufferSink buf_1529 = sink.context().makeBuffer();
					buf_1529.start(_M_STRING);
					buf_1529.literal(3);
					buf_1529.end();
					term_1457 = buf_1529.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1457);
				sink.start(_M__sTextChars);
				sink.literal("  break ");
				sink.end();
				Term term_1369;
				{
					BufferSink buf_1294 = sink.context().makeBuffer();
					buf_1294.start(_M_STRING);
					buf_1294.literal(4);
					buf_1294.end();
					term_1369 = buf_1294.term();
				}
				sink.propertyNamed("$LineLocation", term_1369);
				Term term_1839;
				{
					BufferSink buf_1336 = sink.context().makeBuffer();
					buf_1336.start(_M_STRING);
					buf_1336.literal(1);
					buf_1336.end();
					term_1839 = buf_1336.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1839);
				sink.start(_M__sTextCons);
				Term term_1519;
				{
					BufferSink buf_1558 = sink.context().makeBuffer();
					buf_1558.start(_M_STRING);
					buf_1558.literal(4);
					buf_1558.end();
					term_1519 = buf_1558.term();
				}
				sink.propertyNamed("$LineLocation", term_1519);
				Term term_923;
				{
					BufferSink buf_945 = sink.context().makeBuffer();
					buf_945.start(_M_STRING);
					buf_945.literal(1);
					buf_945.end();
					term_923 = buf_945.term();
				}
				sink.propertyNamed("$ColumnLocation", term_923);
				sink.start(_M__sTextEmbed);
				Term term_1348;
				{
					BufferSink buf_1003 = sink.context().makeBuffer();
					buf_1003.start(_M_STRING);
					buf_1003.literal(4);
					buf_1003.end();
					term_1348 = buf_1003.term();
				}
				sink.propertyNamed("$LineLocation", term_1348);
				Term term_1846;
				{
					BufferSink buf_1159 = sink.context().makeBuffer();
					buf_1159.start(_M_STRING);
					buf_1159.literal(1);
					buf_1159.end();
					term_1846 = buf_1159.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1846);
				sink.start(_M_AsText);
				sink.copy(sub_100.ref());
				sink.end();
				sink.end();
				Term term_965;
				{
					BufferSink buf_1645 = sink.context().makeBuffer();
					buf_1645.start(_M_STRING);
					buf_1645.literal(4);
					buf_1645.end();
					term_965 = buf_1645.term();
				}
				sink.propertyNamed("$LineLocation", term_965);
				Term term_1186;
				{
					BufferSink buf_1060 = sink.context().makeBuffer();
					buf_1060.start(_M_STRING);
					buf_1060.literal(9);
					buf_1060.end();
					term_1186 = buf_1060.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1186);
				sink.start(_M__sTextCons);
				Term term_1372;
				{
					BufferSink buf_1417 = sink.context().makeBuffer();
					buf_1417.start(_M_STRING);
					buf_1417.literal(4);
					buf_1417.end();
					term_1372 = buf_1417.term();
				}
				sink.propertyNamed("$LineLocation", term_1372);
				Term term_1240;
				{
					BufferSink buf_1571 = sink.context().makeBuffer();
					buf_1571.start(_M_STRING);
					buf_1571.literal(9);
					buf_1571.end();
					term_1240 = buf_1571.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1240);
				sink.start(_M__sTextChars);
				sink.literal(";");
				sink.end();
				Term term_2021;
				{
					BufferSink buf_1102 = sink.context().makeBuffer();
					buf_1102.start(_M_STRING);
					buf_1102.literal(4);
					buf_1102.end();
					term_2021 = buf_1102.term();
				}
				sink.propertyNamed("$LineLocation", term_2021);
				Term term_1235;
				{
					BufferSink buf_1203 = sink.context().makeBuffer();
					buf_1203.start(_M_STRING);
					buf_1203.literal(17);
					buf_1203.end();
					term_1235 = buf_1203.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1235);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				Term term_1805;
				{
					BufferSink buf_1465 = sink.context().makeBuffer();
					buf_1465.start(_M_STRING);
					buf_1465.literal(4);
					buf_1465.end();
					term_1805 = buf_1465.term();
				}
				sink.propertyNamed("$LineLocation", term_1805);
				Term term_1554;
				{
					BufferSink buf_1124 = sink.context().makeBuffer();
					buf_1124.start(_M_STRING);
					buf_1124.literal(18);
					buf_1124.end();
					term_1554 = buf_1124.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1554);
				sink.start(_M__sTextCons);
				Term term_1587;
				{
					BufferSink buf_1323 = sink.context().makeBuffer();
					buf_1323.start(_M_STRING);
					buf_1323.literal(4);
					buf_1323.end();
					term_1587 = buf_1323.term();
				}
				sink.propertyNamed("$LineLocation", term_1587);
				Term term_1005;
				{
					BufferSink buf_806 = sink.context().makeBuffer();
					buf_806.start(_M_STRING);
					buf_806.literal(18);
					buf_806.end();
					term_1005 = buf_806.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1005);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2210;
				{
					BufferSink buf_1259 = sink.context().makeBuffer();
					buf_1259.start(_M_STRING);
					buf_1259.literal(4);
					buf_1259.end();
					term_2210 = buf_1259.term();
				}
				sink.propertyNamed("$LineLocation", term_2210);
				Term term_1813;
				{
					BufferSink buf_1541 = sink.context().makeBuffer();
					buf_1541.start(_M_STRING);
					buf_1541.literal(19);
					buf_1541.end();
					term_1813 = buf_1541.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1813);
				sink.start(_M__sTextCons);
				Term term_1063;
				{
					BufferSink buf_1508 = sink.context().makeBuffer();
					buf_1508.start(_M_STRING);
					buf_1508.literal(4);
					buf_1508.end();
					term_1063 = buf_1508.term();
				}
				sink.propertyNamed("$LineLocation", term_1063);
				Term term_1111;
				{
					BufferSink buf_1662 = sink.context().makeBuffer();
					buf_1662.start(_M_STRING);
					buf_1662.literal(19);
					buf_1662.end();
					term_1111 = buf_1662.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1111);
				sink.start(_M__sTextChars);
				sink.literal("}");
				sink.end();
				Term term_995;
				{
					BufferSink buf_1415 = sink.context().makeBuffer();
					buf_1415.start(_M_STRING);
					buf_1415.literal(5);
					buf_1415.end();
					term_995 = buf_1415.term();
				}
				sink.propertyNamed("$LineLocation", term_995);
				Term term_2249;
				{
					BufferSink buf_1564 = sink.context().makeBuffer();
					buf_1564.start(_M_STRING);
					buf_1564.literal(1);
					buf_1564.end();
					term_2249 = buf_1564.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2249);
				sink.start(_M__sTextCons);
				Term term_1481;
				{
					BufferSink buf_1275 = sink.context().makeBuffer();
					buf_1275.start(_M_STRING);
					buf_1275.literal(5);
					buf_1275.end();
					term_1481 = buf_1275.term();
				}
				sink.propertyNamed("$LineLocation", term_1481);
				Term term_839;
				{
					BufferSink buf_1429 = sink.context().makeBuffer();
					buf_1429.start(_M_STRING);
					buf_1429.literal(1);
					buf_1429.end();
					term_839 = buf_1429.term();
				}
				sink.propertyNamed("$ColumnLocation", term_839);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1954;
				{
					BufferSink buf_1656 = sink.context().makeBuffer();
					buf_1656.start(_M_STRING);
					buf_1656.literal(5);
					buf_1656.end();
					term_1954 = buf_1656.term();
				}
				sink.propertyNamed("$LineLocation", term_1954);
				Term term_970;
				{
					BufferSink buf_1611 = sink.context().makeBuffer();
					buf_1611.start(_M_STRING);
					buf_1611.literal(2);
					buf_1611.end();
					term_970 = buf_1611.term();
				}
				sink.propertyNamed("$ColumnLocation", term_970);
				sink.start(_M__sTextCons);
				Term term_1674;
				{
					BufferSink buf_1922 = sink.context().makeBuffer();
					buf_1922.start(_M_STRING);
					buf_1922.literal(5);
					buf_1922.end();
					term_1674 = buf_1922.term();
				}
				sink.propertyNamed("$LineLocation", term_1674);
				Term term_1406;
				{
					BufferSink buf_1375 = sink.context().makeBuffer();
					buf_1375.start(_M_STRING);
					buf_1375.literal(2);
					buf_1375.end();
					term_1406 = buf_1375.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1406);
				sink.start(_M__sTextEmbed);
				Term term_1447;
				{
					BufferSink buf_1049 = sink.context().makeBuffer();
					buf_1049.start(_M_STRING);
					buf_1049.literal(5);
					buf_1049.end();
					term_1447 = buf_1049.term();
				}
				sink.propertyNamed("$LineLocation", term_1447);
				Term term_1408;
				{
					BufferSink buf_1532 = sink.context().makeBuffer();
					buf_1532.start(_M_STRING);
					buf_1532.literal(2);
					buf_1532.end();
					term_1408 = buf_1532.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1408);
				sink.start(_M_AsText);
				sink.use(var_48);
				sink.end();
				sink.end();
				Term term_2275;
				{
					BufferSink buf_1456 = sink.context().makeBuffer();
					buf_1456.start(_M_STRING);
					buf_1456.literal(6);
					buf_1456.end();
					term_2275 = buf_1456.term();
				}
				sink.propertyNamed("$LineLocation", term_2275);
				Term term_1321;
				{
					BufferSink buf_1158 = sink.context().makeBuffer();
					buf_1158.start(_M_STRING);
					buf_1158.literal(1);
					buf_1158.end();
					term_1321 = buf_1158.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1321);
				sink.start(_M__sTextCons);
				Term term_1015;
				{
					BufferSink buf_1780 = sink.context().makeBuffer();
					buf_1780.start(_M_STRING);
					buf_1780.literal(6);
					buf_1780.end();
					term_1015 = buf_1780.term();
				}
				sink.propertyNamed("$LineLocation", term_1015);
				Term term_918;
				{
					BufferSink buf_1114 = sink.context().makeBuffer();
					buf_1114.start(_M_STRING);
					buf_1114.literal(1);
					buf_1114.end();
					term_918 = buf_1114.term();
				}
				sink.propertyNamed("$ColumnLocation", term_918);
				sink.start(_M__sTextChars);
				sink.literal(" = ");
				sink.end();
				Term term_1376;
				{
					BufferSink buf_1369 = sink.context().makeBuffer();
					buf_1369.start(_M_STRING);
					buf_1369.literal(6);
					buf_1369.end();
					term_1376 = buf_1369.term();
				}
				sink.propertyNamed("$LineLocation", term_1376);
				Term term_1666;
				{
					BufferSink buf_1831 = sink.context().makeBuffer();
					buf_1831.start(_M_STRING);
					buf_1831.literal(8);
					buf_1831.end();
					term_1666 = buf_1831.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1666);
				sink.start(_M__sTextCons);
				Term term_1260;
				{
					BufferSink buf_1347 = sink.context().makeBuffer();
					buf_1347.start(_M_STRING);
					buf_1347.literal(6);
					buf_1347.end();
					term_1260 = buf_1347.term();
				}
				sink.propertyNamed("$LineLocation", term_1260);
				Term term_1610;
				{
					BufferSink buf_805 = sink.context().makeBuffer();
					buf_805.start(_M_STRING);
					buf_805.literal(8);
					buf_805.end();
					term_1610 = buf_805.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1610);
				sink.start(_M__sTextEmbed);
				Term term_1502;
				{
					BufferSink buf_1427 = sink.context().makeBuffer();
					buf_1427.start(_M_STRING);
					buf_1427.literal(6);
					buf_1427.end();
					term_1502 = buf_1427.term();
				}
				sink.propertyNamed("$LineLocation", term_1502);
				Term term_1578;
				{
					BufferSink buf_1618 = sink.context().makeBuffer();
					buf_1618.start(_M_STRING);
					buf_1618.literal(8);
					buf_1618.end();
					term_1578 = buf_1618.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1578);
				sink.start(_M_AsText);
				sink.use(var_48);
				sink.end();
				sink.end();
				Term term_1110;
				{
					BufferSink buf_681 = sink.context().makeBuffer();
					buf_681.start(_M_STRING);
					buf_681.literal(6);
					buf_681.end();
					term_1110 = buf_681.term();
				}
				sink.propertyNamed("$LineLocation", term_1110);
				Term term_1523;
				{
					BufferSink buf_1271 = sink.context().makeBuffer();
					buf_1271.start(_M_STRING);
					buf_1271.literal(11);
					buf_1271.end();
					term_1523 = buf_1271.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1523);
				sink.start(_M__sTextCons);
				Term term_1323;
				{
					BufferSink buf_1755 = sink.context().makeBuffer();
					buf_1755.start(_M_STRING);
					buf_1755.literal(6);
					buf_1755.end();
					term_1323 = buf_1755.term();
				}
				sink.propertyNamed("$LineLocation", term_1323);
				Term term_1000;
				{
					BufferSink buf_995 = sink.context().makeBuffer();
					buf_995.start(_M_STRING);
					buf_995.literal(11);
					buf_995.end();
					term_1000 = buf_995.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1000);
				sink.start(_M__sTextChars);
				sink.literal(".ref();");
				sink.end();
				Term term_2230;
				{
					BufferSink buf_1162 = sink.context().makeBuffer();
					buf_1162.start(_M_STRING);
					buf_1162.literal(6);
					buf_1162.end();
					term_2230 = buf_1162.term();
				}
				sink.propertyNamed("$LineLocation", term_2230);
				Term term_1492;
				{
					BufferSink buf_1643 = sink.context().makeBuffer();
					buf_1643.start(_M_STRING);
					buf_1643.literal(18);
					buf_1643.end();
					term_1492 = buf_1643.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1492);
				sink.start(_M__sTextCons);
				Term term_1373;
				{
					BufferSink buf_1344 = sink.context().makeBuffer();
					buf_1344.start(_M_STRING);
					buf_1344.literal(6);
					buf_1344.end();
					term_1373 = buf_1344.term();
				}
				sink.propertyNamed("$LineLocation", term_1373);
				Term term_1771;
				{
					BufferSink buf_1491 = sink.context().makeBuffer();
					buf_1491.start(_M_STRING);
					buf_1491.literal(18);
					buf_1491.end();
					term_1771 = buf_1491.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1771);
				sink.start(_M__sTextEmbed);
				Term term_1094;
				{
					BufferSink buf_1293 = sink.context().makeBuffer();
					buf_1293.start(_M_STRING);
					buf_1293.literal(6);
					buf_1293.end();
					term_1094 = buf_1293.term();
				}
				sink.propertyNamed("$LineLocation", term_1094);
				Term term_1740;
				{
					BufferSink buf_1252 = sink.context().makeBuffer();
					buf_1252.start(_M_STRING);
					buf_1252.literal(18);
					buf_1252.end();
					term_1740 = buf_1252.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1740);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_9));
				sink.start(_M_AddMetaVar);
				sink.copy(sub_201.ref());
				sink.use(var_48);
				sink.start(_M__sNil);
				sink.end();
				Variable var_156 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_156});
				VariableUse use_184 = sink.context().makeVariableUse(var_156);
				sink.substitute(term_686.ref(), new Variable[]
					{var_33}, new Term[]
					{use_184});
				sink.end();
				sink.end();
				sink.end();
				Term term_1306;
				{
					BufferSink buf_1447 = sink.context().makeBuffer();
					buf_1447.start(_M_STRING);
					buf_1447.literal(6);
					buf_1447.end();
					term_1306 = buf_1447.term();
				}
				sink.propertyNamed("$LineLocation", term_1306);
				Term term_1349;
				{
					BufferSink buf_1283 = sink.context().makeBuffer();
					buf_1283.start(_M_STRING);
					buf_1283.literal(25);
					buf_1283.end();
					term_1349 = buf_1283.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1349);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_30 :
			{
				Term value_85 = props_9 == null ? null : props_9.lookup("$props");
				if (value_85 == null)
				{
					break label_30;
				}
				if (value_85.descriptor() != _M_TEXT)
				{
					break label_30;
				}
				Term sub_159 = value_85.sub(0).ref();
				/* #props=sub */
				Term value_36 = props_9 == null ? null : props_9.lookup("$caselabel");
				if (value_36 == null)
				{
					break label_30;
				}
				if (value_36.descriptor() != _M_TEXT)
				{
					break label_30;
				}
				Term sub_406 = value_36.sub(0).ref();
				/* #label=sub */
				if (term_558.descriptor() != _M_Crsx_xproperty_xA9)
				{
					break label_30;
				}
				Term sub_348 = term_558.sub(0).ref();
				/* #STRING=sub */Term sub_137 = term_558.sub(1).ref();
				Term sub_285 = term_558.sub(2).ref();
				if (sub_285.descriptor() != _M_Crsx_xfreeTerm_xA7)
				{
					break label_30;
				}
				Term sub_46 = sub_285.sub(0).ref();
				if (sub_46.descriptor() != _M__sNil)
				{
					break label_30;
				}
				Term sub_286 = sub_285.sub(1).ref();
				if (sub_286.descriptor() != _M__sNil)
				{
					break label_30;
				}
				Term sub_103 = sub_285.sub(2).ref();
				/* #METAVAR=sub */Term sub_272 = sub_285.sub(3).ref();
				if (sub_272.descriptor() != _M__sNil)
				{
					break label_30;
				}
				/* #term=term */
				/* #=term *//*Contract*/
				Variable var_61 = sink.context().makeVariable("value");
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1462;
				{
					BufferSink buf_2190 = sink.context().makeBuffer();
					buf_2190.start(_M_STRING);
					buf_2190.literal(1);
					buf_2190.end();
					term_1462 = buf_2190.term();
				}
				sink.propertyNamed("$LineLocation", term_1462);
				Term term_1048;
				{
					BufferSink buf_1109 = sink.context().makeBuffer();
					buf_1109.start(_M_STRING);
					buf_1109.literal(1);
					buf_1109.end();
					term_1048 = buf_1109.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1048);
				sink.start(_M__sTextCons);
				Term term_1770;
				{
					BufferSink buf_1125 = sink.context().makeBuffer();
					buf_1125.start(_M_STRING);
					buf_1125.literal(1);
					buf_1125.end();
					term_1770 = buf_1125.term();
				}
				sink.propertyNamed("$LineLocation", term_1770);
				Term term_1295;
				{
					BufferSink buf_2065 = sink.context().makeBuffer();
					buf_2065.start(_M_STRING);
					buf_2065.literal(1);
					buf_2065.end();
					term_1295 = buf_2065.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1295);
				sink.start(_M__sTextChars);
				sink.literal("Term ");
				sink.end();
				Term term_1627;
				{
					BufferSink buf_1026 = sink.context().makeBuffer();
					buf_1026.start(_M_STRING);
					buf_1026.literal(1);
					buf_1026.end();
					term_1627 = buf_1026.term();
				}
				sink.propertyNamed("$LineLocation", term_1627);
				Term term_1475;
				{
					BufferSink buf_2049 = sink.context().makeBuffer();
					buf_2049.start(_M_STRING);
					buf_2049.literal(2);
					buf_2049.end();
					term_1475 = buf_2049.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1475);
				sink.start(_M__sTextCons);
				Term term_1455;
				{
					BufferSink buf_1103 = sink.context().makeBuffer();
					buf_1103.start(_M_STRING);
					buf_1103.literal(1);
					buf_1103.end();
					term_1455 = buf_1103.term();
				}
				sink.propertyNamed("$LineLocation", term_1455);
				Term term_1645;
				{
					BufferSink buf_1818 = sink.context().makeBuffer();
					buf_1818.start(_M_STRING);
					buf_1818.literal(2);
					buf_1818.end();
					term_1645 = buf_1818.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1645);
				sink.start(_M__sTextEmbed);
				Term term_1702;
				{
					BufferSink buf_1244 = sink.context().makeBuffer();
					buf_1244.start(_M_STRING);
					buf_1244.literal(1);
					buf_1244.end();
					term_1702 = buf_1244.term();
				}
				sink.propertyNamed("$LineLocation", term_1702);
				Term term_1801;
				{
					BufferSink buf_1449 = sink.context().makeBuffer();
					buf_1449.start(_M_STRING);
					buf_1449.literal(2);
					buf_1449.end();
					term_1801 = buf_1449.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1801);
				sink.start(_M_AsText);
				sink.use(var_61);
				sink.end();
				sink.end();
				Term term_1470;
				{
					BufferSink buf_949 = sink.context().makeBuffer();
					buf_949.start(_M_STRING);
					buf_949.literal(1);
					buf_949.end();
					term_1470 = buf_949.term();
				}
				sink.propertyNamed("$LineLocation", term_1470);
				Term term_940;
				{
					BufferSink buf_1475 = sink.context().makeBuffer();
					buf_1475.start(_M_STRING);
					buf_1475.literal(7);
					buf_1475.end();
					term_940 = buf_1475.term();
				}
				sink.propertyNamed("$ColumnLocation", term_940);
				sink.start(_M__sTextCons);
				Term term_1693;
				{
					BufferSink buf_1088 = sink.context().makeBuffer();
					buf_1088.start(_M_STRING);
					buf_1088.literal(1);
					buf_1088.end();
					term_1693 = buf_1088.term();
				}
				sink.propertyNamed("$LineLocation", term_1693);
				Term term_1189;
				{
					BufferSink buf_875 = sink.context().makeBuffer();
					buf_875.start(_M_STRING);
					buf_875.literal(7);
					buf_875.end();
					term_1189 = buf_875.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1189);
				sink.start(_M__sTextChars);
				sink.literal(" = ");
				sink.end();
				Term term_1458;
				{
					BufferSink buf_1457 = sink.context().makeBuffer();
					buf_1457.start(_M_STRING);
					buf_1457.literal(1);
					buf_1457.end();
					term_1458 = buf_1457.term();
				}
				sink.propertyNamed("$LineLocation", term_1458);
				Term term_971;
				{
					BufferSink buf_1208 = sink.context().makeBuffer();
					buf_1208.start(_M_STRING);
					buf_1208.literal(14);
					buf_1208.end();
					term_971 = buf_1208.term();
				}
				sink.propertyNamed("$ColumnLocation", term_971);
				sink.start(_M__sTextCons);
				Term term_804;
				{
					BufferSink buf_1145 = sink.context().makeBuffer();
					buf_1145.start(_M_STRING);
					buf_1145.literal(1);
					buf_1145.end();
					term_804 = buf_1145.term();
				}
				sink.propertyNamed("$LineLocation", term_804);
				Term term_1275;
				{
					BufferSink buf_1433 = sink.context().makeBuffer();
					buf_1433.start(_M_STRING);
					buf_1433.literal(14);
					buf_1433.end();
					term_1275 = buf_1433.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1275);
				sink.start(_M__sTextEmbed);
				Term term_1650;
				{
					BufferSink buf_1376 = sink.context().makeBuffer();
					buf_1376.start(_M_STRING);
					buf_1376.literal(1);
					buf_1376.end();
					term_1650 = buf_1376.term();
				}
				sink.propertyNamed("$LineLocation", term_1650);
				Term term_1496;
				{
					BufferSink buf_847 = sink.context().makeBuffer();
					buf_847.start(_M_STRING);
					buf_847.literal(14);
					buf_847.end();
					term_1496 = buf_847.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1496);
				sink.start(_M_AsText);
				sink.copy(sub_159.ref());
				sink.end();
				sink.end();
				Term term_1657;
				{
					BufferSink buf_780 = sink.context().makeBuffer();
					buf_780.start(_M_STRING);
					buf_780.literal(1);
					buf_780.end();
					term_1657 = buf_780.term();
				}
				sink.propertyNamed("$LineLocation", term_1657);
				Term term_1163;
				{
					BufferSink buf_1255 = sink.context().makeBuffer();
					buf_1255.start(_M_STRING);
					buf_1255.literal(17);
					buf_1255.end();
					term_1163 = buf_1255.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1163);
				sink.start(_M__sTextCons);
				Term term_2079;
				{
					BufferSink buf_1239 = sink.context().makeBuffer();
					buf_1239.start(_M_STRING);
					buf_1239.literal(1);
					buf_1239.end();
					term_2079 = buf_1239.term();
				}
				sink.propertyNamed("$LineLocation", term_2079);
				Term term_1494;
				{
					BufferSink buf_1268 = sink.context().makeBuffer();
					buf_1268.start(_M_STRING);
					buf_1268.literal(17);
					buf_1268.end();
					term_1494 = buf_1268.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1494);
				sink.start(_M__sTextChars);
				sink.literal(" == null ? null : ");
				sink.end();
				Term term_1181;
				{
					BufferSink buf_1263 = sink.context().makeBuffer();
					buf_1263.start(_M_STRING);
					buf_1263.literal(1);
					buf_1263.end();
					term_1181 = buf_1263.term();
				}
				sink.propertyNamed("$LineLocation", term_1181);
				Term term_1146;
				{
					BufferSink buf_1460 = sink.context().makeBuffer();
					buf_1460.start(_M_STRING);
					buf_1460.literal(25);
					buf_1460.end();
					term_1146 = buf_1460.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1146);
				sink.start(_M__sTextCons);
				Term term_2084;
				{
					BufferSink buf_919 = sink.context().makeBuffer();
					buf_919.start(_M_STRING);
					buf_919.literal(1);
					buf_919.end();
					term_2084 = buf_919.term();
				}
				sink.propertyNamed("$LineLocation", term_2084);
				Term term_2147;
				{
					BufferSink buf_1649 = sink.context().makeBuffer();
					buf_1649.start(_M_STRING);
					buf_1649.literal(25);
					buf_1649.end();
					term_2147 = buf_1649.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2147);
				sink.start(_M__sTextEmbed);
				Term term_1215;
				{
					BufferSink buf_1689 = sink.context().makeBuffer();
					buf_1689.start(_M_STRING);
					buf_1689.literal(1);
					buf_1689.end();
					term_1215 = buf_1689.term();
				}
				sink.propertyNamed("$LineLocation", term_1215);
				Term term_1854;
				{
					BufferSink buf_1461 = sink.context().makeBuffer();
					buf_1461.start(_M_STRING);
					buf_1461.literal(25);
					buf_1461.end();
					term_1854 = buf_1461.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1854);
				sink.start(_M_AsText);
				sink.copy(sub_159.ref());
				sink.end();
				sink.end();
				Term term_1353;
				{
					BufferSink buf_1250 = sink.context().makeBuffer();
					buf_1250.start(_M_STRING);
					buf_1250.literal(1);
					buf_1250.end();
					term_1353 = buf_1250.term();
				}
				sink.propertyNamed("$LineLocation", term_1353);
				Term term_1249;
				{
					BufferSink buf_960 = sink.context().makeBuffer();
					buf_960.start(_M_STRING);
					buf_960.literal(43);
					buf_960.end();
					term_1249 = buf_960.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1249);
				sink.start(_M__sTextCons);
				Term term_1435;
				{
					BufferSink buf_1370 = sink.context().makeBuffer();
					buf_1370.start(_M_STRING);
					buf_1370.literal(1);
					buf_1370.end();
					term_1435 = buf_1370.term();
				}
				sink.propertyNamed("$LineLocation", term_1435);
				Term term_1696;
				{
					BufferSink buf_1595 = sink.context().makeBuffer();
					buf_1595.start(_M_STRING);
					buf_1595.literal(43);
					buf_1595.end();
					term_1696 = buf_1595.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1696);
				sink.start(_M__sTextChars);
				sink.literal(".lookup(");
				sink.end();
				Term term_2009;
				{
					BufferSink buf_1302 = sink.context().makeBuffer();
					buf_1302.start(_M_STRING);
					buf_1302.literal(1);
					buf_1302.end();
					term_2009 = buf_1302.term();
				}
				sink.propertyNamed("$LineLocation", term_2009);
				Term term_1175;
				{
					BufferSink buf_1314 = sink.context().makeBuffer();
					buf_1314.start(_M_STRING);
					buf_1314.literal(51);
					buf_1314.end();
					term_1175 = buf_1314.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1175);
				sink.start(_M__sTextCons);
				Term term_1446;
				{
					BufferSink buf_1552 = sink.context().makeBuffer();
					buf_1552.start(_M_STRING);
					buf_1552.literal(1);
					buf_1552.end();
					term_1446 = buf_1552.term();
				}
				sink.propertyNamed("$LineLocation", term_1446);
				Term term_1415;
				{
					BufferSink buf_1224 = sink.context().makeBuffer();
					buf_1224.start(_M_STRING);
					buf_1224.literal(59);
					buf_1224.end();
					term_1415 = buf_1224.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1415);
				sink.start(_M__sTextChars);
				sink.copy(sub_348.ref());
				sink.end();
				Term term_1357;
				{
					BufferSink buf_1633 = sink.context().makeBuffer();
					buf_1633.start(_M_STRING);
					buf_1633.literal(1);
					buf_1633.end();
					term_1357 = buf_1633.term();
				}
				sink.propertyNamed("$LineLocation", term_1357);
				Term term_1201;
				{
					BufferSink buf_914 = sink.context().makeBuffer();
					buf_914.start(_M_STRING);
					buf_914.literal(60);
					buf_914.end();
					term_1201 = buf_914.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1201);
				sink.start(_M__sTextCons);
				Term term_967;
				{
					BufferSink buf_1441 = sink.context().makeBuffer();
					buf_1441.start(_M_STRING);
					buf_1441.literal(1);
					buf_1441.end();
					term_967 = buf_1441.term();
				}
				sink.propertyNamed("$LineLocation", term_967);
				Term term_1257;
				{
					BufferSink buf_1498 = sink.context().makeBuffer();
					buf_1498.start(_M_STRING);
					buf_1498.literal(60);
					buf_1498.end();
					term_1257 = buf_1498.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1257);
				sink.start(_M__sTextChars);
				sink.literal(");");
				sink.end();
				Term term_1589;
				{
					BufferSink buf_1137 = sink.context().makeBuffer();
					buf_1137.start(_M_STRING);
					buf_1137.literal(1);
					buf_1137.end();
					term_1589 = buf_1137.term();
				}
				sink.propertyNamed("$LineLocation", term_1589);
				Term term_2463;
				{
					BufferSink buf_1197 = sink.context().makeBuffer();
					buf_1197.start(_M_STRING);
					buf_1197.literal(69);
					buf_1197.end();
					term_2463 = buf_1197.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2463);
				sink.start(_M__sTextCons);
				Term term_2155;
				{
					BufferSink buf_1300 = sink.context().makeBuffer();
					buf_1300.start(_M_STRING);
					buf_1300.literal(1);
					buf_1300.end();
					term_2155 = buf_1300.term();
				}
				sink.propertyNamed("$LineLocation", term_2155);
				Term term_1130;
				{
					BufferSink buf_1577 = sink.context().makeBuffer();
					buf_1577.start(_M_STRING);
					buf_1577.literal(69);
					buf_1577.end();
					term_1130 = buf_1577.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1130);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1222;
				{
					BufferSink buf_1499 = sink.context().makeBuffer();
					buf_1499.start(_M_STRING);
					buf_1499.literal(1);
					buf_1499.end();
					term_1222 = buf_1499.term();
				}
				sink.propertyNamed("$LineLocation", term_1222);
				Term term_1297;
				{
					BufferSink buf_1377 = sink.context().makeBuffer();
					buf_1377.start(_M_STRING);
					buf_1377.literal(71);
					buf_1377.end();
					term_1297 = buf_1377.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1297);
				sink.start(_M__sTextCons);
				Term term_1649;
				{
					BufferSink buf_1130 = sink.context().makeBuffer();
					buf_1130.start(_M_STRING);
					buf_1130.literal(1);
					buf_1130.end();
					term_1649 = buf_1130.term();
				}
				sink.propertyNamed("$LineLocation", term_1649);
				Term term_1365;
				{
					BufferSink buf_1030 = sink.context().makeBuffer();
					buf_1030.start(_M_STRING);
					buf_1030.literal(71);
					buf_1030.end();
					term_1365 = buf_1030.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1365);
				sink.start(_M__sTextChars);
				sink.literal("if (");
				sink.end();
				Term term_1362;
				{
					BufferSink buf_1176 = sink.context().makeBuffer();
					buf_1176.start(_M_STRING);
					buf_1176.literal(2);
					buf_1176.end();
					term_1362 = buf_1176.term();
				}
				sink.propertyNamed("$LineLocation", term_1362);
				Term term_1422;
				{
					BufferSink buf_1542 = sink.context().makeBuffer();
					buf_1542.start(_M_STRING);
					buf_1542.literal(1);
					buf_1542.end();
					term_1422 = buf_1542.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1422);
				sink.start(_M__sTextCons);
				Term term_1872;
				{
					BufferSink buf_1651 = sink.context().makeBuffer();
					buf_1651.start(_M_STRING);
					buf_1651.literal(2);
					buf_1651.end();
					term_1872 = buf_1651.term();
				}
				sink.propertyNamed("$LineLocation", term_1872);
				Term term_1667;
				{
					BufferSink buf_976 = sink.context().makeBuffer();
					buf_976.start(_M_STRING);
					buf_976.literal(1);
					buf_976.end();
					term_1667 = buf_976.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1667);
				sink.start(_M__sTextEmbed);
				Term term_1573;
				{
					BufferSink buf_1185 = sink.context().makeBuffer();
					buf_1185.start(_M_STRING);
					buf_1185.literal(2);
					buf_1185.end();
					term_1573 = buf_1185.term();
				}
				sink.propertyNamed("$LineLocation", term_1573);
				Term term_1182;
				{
					BufferSink buf_1647 = sink.context().makeBuffer();
					buf_1647.start(_M_STRING);
					buf_1647.literal(1);
					buf_1647.end();
					term_1182 = buf_1647.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1182);
				sink.start(_M_AsText);
				sink.use(var_61);
				sink.end();
				sink.end();
				Term term_1427;
				{
					BufferSink buf_1338 = sink.context().makeBuffer();
					buf_1338.start(_M_STRING);
					buf_1338.literal(2);
					buf_1338.end();
					term_1427 = buf_1338.term();
				}
				sink.propertyNamed("$LineLocation", term_1427);
				Term term_1765;
				{
					BufferSink buf_2099 = sink.context().makeBuffer();
					buf_2099.start(_M_STRING);
					buf_2099.literal(5);
					buf_2099.end();
					term_1765 = buf_2099.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1765);
				sink.start(_M__sTextCons);
				Term term_1615;
				{
					BufferSink buf_1518 = sink.context().makeBuffer();
					buf_1518.start(_M_STRING);
					buf_1518.literal(2);
					buf_1518.end();
					term_1615 = buf_1518.term();
				}
				sink.propertyNamed("$LineLocation", term_1615);
				Term term_1524;
				{
					BufferSink buf_1535 = sink.context().makeBuffer();
					buf_1535.start(_M_STRING);
					buf_1535.literal(5);
					buf_1535.end();
					term_1524 = buf_1535.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1524);
				sink.start(_M__sTextChars);
				sink.literal(" == null) ");
				sink.end();
				Term term_2059;
				{
					BufferSink buf_2040 = sink.context().makeBuffer();
					buf_2040.start(_M_STRING);
					buf_2040.literal(2);
					buf_2040.end();
					term_2059 = buf_2040.term();
				}
				sink.propertyNamed("$LineLocation", term_2059);
				Term term_1279;
				{
					BufferSink buf_1719 = sink.context().makeBuffer();
					buf_1719.start(_M_STRING);
					buf_1719.literal(12);
					buf_1719.end();
					term_1279 = buf_1719.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1279);
				sink.start(_M__sTextCons);
				Term term_1388;
				{
					BufferSink buf_1021 = sink.context().makeBuffer();
					buf_1021.start(_M_STRING);
					buf_1021.literal(2);
					buf_1021.end();
					term_1388 = buf_1021.term();
				}
				sink.propertyNamed("$LineLocation", term_1388);
				Term term_1378;
				{
					BufferSink buf_1653 = sink.context().makeBuffer();
					buf_1653.start(_M_STRING);
					buf_1653.literal(12);
					buf_1653.end();
					term_1378 = buf_1653.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1378);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1312;
				{
					BufferSink buf_1099 = sink.context().makeBuffer();
					buf_1099.start(_M_STRING);
					buf_1099.literal(2);
					buf_1099.end();
					term_1312 = buf_1099.term();
				}
				sink.propertyNamed("$LineLocation", term_1312);
				Term term_1202;
				{
					BufferSink buf_1163 = sink.context().makeBuffer();
					buf_1163.start(_M_STRING);
					buf_1163.literal(22);
					buf_1163.end();
					term_1202 = buf_1163.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1202);
				sink.start(_M__sTextCons);
				Term term_1129;
				{
					BufferSink buf_1398 = sink.context().makeBuffer();
					buf_1398.start(_M_STRING);
					buf_1398.literal(2);
					buf_1398.end();
					term_1129 = buf_1398.term();
				}
				sink.propertyNamed("$LineLocation", term_1129);
				Term term_1885;
				{
					BufferSink buf_1404 = sink.context().makeBuffer();
					buf_1404.start(_M_STRING);
					buf_1404.literal(22);
					buf_1404.end();
					term_1885 = buf_1404.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1885);
				sink.start(_M__sTextChars);
				sink.literal("{");
				sink.end();
				Term term_1482;
				{
					BufferSink buf_1393 = sink.context().makeBuffer();
					buf_1393.start(_M_STRING);
					buf_1393.literal(3);
					buf_1393.end();
					term_1482 = buf_1393.term();
				}
				sink.propertyNamed("$LineLocation", term_1482);
				Term term_2581;
				{
					BufferSink buf_721 = sink.context().makeBuffer();
					buf_721.start(_M_STRING);
					buf_721.literal(1);
					buf_721.end();
					term_2581 = buf_721.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2581);
				sink.start(_M__sTextCons);
				Term term_1971;
				{
					BufferSink buf_1360 = sink.context().makeBuffer();
					buf_1360.start(_M_STRING);
					buf_1360.literal(3);
					buf_1360.end();
					term_1971 = buf_1360.term();
				}
				sink.propertyNamed("$LineLocation", term_1971);
				Term term_2238;
				{
					BufferSink buf_1290 = sink.context().makeBuffer();
					buf_1290.start(_M_STRING);
					buf_1290.literal(2);
					buf_1290.end();
					term_2238 = buf_1290.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2238);
				sink.start(_M__sTextIndent);
				Term term_1318;
				{
					BufferSink buf_1016 = sink.context().makeBuffer();
					buf_1016.start(_M_STRING);
					buf_1016.literal(3);
					buf_1016.end();
					term_1318 = buf_1016.term();
				}
				sink.propertyNamed("$LineLocation", term_1318);
				Term term_1800;
				{
					BufferSink buf_1471 = sink.context().makeBuffer();
					buf_1471.start(_M_STRING);
					buf_1471.literal(2);
					buf_1471.end();
					term_1800 = buf_1471.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1800);
				sink.start(_M__sTextCons);
				Term term_1734;
				{
					BufferSink buf_2184 = sink.context().makeBuffer();
					buf_2184.start(_M_STRING);
					buf_2184.literal(3);
					buf_2184.end();
					term_1734 = buf_2184.term();
				}
				sink.propertyNamed("$LineLocation", term_1734);
				Term term_1592;
				{
					BufferSink buf_1274 = sink.context().makeBuffer();
					buf_1274.start(_M_STRING);
					buf_1274.literal(2);
					buf_1274.end();
					term_1592 = buf_1274.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1592);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1179;
				{
					BufferSink buf_1426 = sink.context().makeBuffer();
					buf_1426.start(_M_STRING);
					buf_1426.literal(3);
					buf_1426.end();
					term_1179 = buf_1426.term();
				}
				sink.propertyNamed("$LineLocation", term_1179);
				Term term_1395;
				{
					BufferSink buf_1513 = sink.context().makeBuffer();
					buf_1513.start(_M_STRING);
					buf_1513.literal(3);
					buf_1513.end();
					term_1395 = buf_1513.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1395);
				sink.start(_M__sTextCons);
				Term term_2217;
				{
					BufferSink buf_966 = sink.context().makeBuffer();
					buf_966.start(_M_STRING);
					buf_966.literal(3);
					buf_966.end();
					term_2217 = buf_966.term();
				}
				sink.propertyNamed("$LineLocation", term_2217);
				Term term_1432;
				{
					BufferSink buf_1837 = sink.context().makeBuffer();
					buf_1837.start(_M_STRING);
					buf_1837.literal(3);
					buf_1837.end();
					term_1432 = buf_1837.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1432);
				sink.start(_M__sTextChars);
				sink.literal("  break ");
				sink.end();
				Term term_1562;
				{
					BufferSink buf_1325 = sink.context().makeBuffer();
					buf_1325.start(_M_STRING);
					buf_1325.literal(4);
					buf_1325.end();
					term_1562 = buf_1325.term();
				}
				sink.propertyNamed("$LineLocation", term_1562);
				Term term_1617;
				{
					BufferSink buf_1500 = sink.context().makeBuffer();
					buf_1500.start(_M_STRING);
					buf_1500.literal(1);
					buf_1500.end();
					term_1617 = buf_1500.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1617);
				sink.start(_M__sTextCons);
				Term term_1902;
				{
					BufferSink buf_917 = sink.context().makeBuffer();
					buf_917.start(_M_STRING);
					buf_917.literal(4);
					buf_917.end();
					term_1902 = buf_917.term();
				}
				sink.propertyNamed("$LineLocation", term_1902);
				Term term_1334;
				{
					BufferSink buf_1383 = sink.context().makeBuffer();
					buf_1383.start(_M_STRING);
					buf_1383.literal(1);
					buf_1383.end();
					term_1334 = buf_1383.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1334);
				sink.start(_M__sTextEmbed);
				Term term_1117;
				{
					BufferSink buf_1494 = sink.context().makeBuffer();
					buf_1494.start(_M_STRING);
					buf_1494.literal(4);
					buf_1494.end();
					term_1117 = buf_1494.term();
				}
				sink.propertyNamed("$LineLocation", term_1117);
				Term term_1680;
				{
					BufferSink buf_1632 = sink.context().makeBuffer();
					buf_1632.start(_M_STRING);
					buf_1632.literal(1);
					buf_1632.end();
					term_1680 = buf_1632.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1680);
				sink.start(_M_AsText);
				sink.copy(sub_406.ref());
				sink.end();
				sink.end();
				Term term_1558;
				{
					BufferSink buf_1350 = sink.context().makeBuffer();
					buf_1350.start(_M_STRING);
					buf_1350.literal(4);
					buf_1350.end();
					term_1558 = buf_1350.term();
				}
				sink.propertyNamed("$LineLocation", term_1558);
				Term term_2281;
				{
					BufferSink buf_1522 = sink.context().makeBuffer();
					buf_1522.start(_M_STRING);
					buf_1522.literal(9);
					buf_1522.end();
					term_2281 = buf_1522.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2281);
				sink.start(_M__sTextCons);
				Term term_1430;
				{
					BufferSink buf_2080 = sink.context().makeBuffer();
					buf_2080.start(_M_STRING);
					buf_2080.literal(4);
					buf_2080.end();
					term_1430 = buf_2080.term();
				}
				sink.propertyNamed("$LineLocation", term_1430);
				Term term_1153;
				{
					BufferSink buf_1229 = sink.context().makeBuffer();
					buf_1229.start(_M_STRING);
					buf_1229.literal(9);
					buf_1229.end();
					term_1153 = buf_1229.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1153);
				sink.start(_M__sTextChars);
				sink.literal(";");
				sink.end();
				Term term_984;
				{
					BufferSink buf_2131 = sink.context().makeBuffer();
					buf_2131.start(_M_STRING);
					buf_2131.literal(4);
					buf_2131.end();
					term_984 = buf_2131.term();
				}
				sink.propertyNamed("$LineLocation", term_984);
				Term term_1366;
				{
					BufferSink buf_1480 = sink.context().makeBuffer();
					buf_1480.start(_M_STRING);
					buf_1480.literal(17);
					buf_1480.end();
					term_1366 = buf_1480.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1366);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				Term term_2031;
				{
					BufferSink buf_1525 = sink.context().makeBuffer();
					buf_1525.start(_M_STRING);
					buf_1525.literal(4);
					buf_1525.end();
					term_2031 = buf_1525.term();
				}
				sink.propertyNamed("$LineLocation", term_2031);
				Term term_1172;
				{
					BufferSink buf_1438 = sink.context().makeBuffer();
					buf_1438.start(_M_STRING);
					buf_1438.literal(18);
					buf_1438.end();
					term_1172 = buf_1438.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1172);
				sink.start(_M__sTextCons);
				Term term_1221;
				{
					BufferSink buf_1418 = sink.context().makeBuffer();
					buf_1418.start(_M_STRING);
					buf_1418.literal(4);
					buf_1418.end();
					term_1221 = buf_1418.term();
				}
				sink.propertyNamed("$LineLocation", term_1221);
				Term term_1635;
				{
					BufferSink buf_2223 = sink.context().makeBuffer();
					buf_2223.start(_M_STRING);
					buf_2223.literal(18);
					buf_2223.end();
					term_1635 = buf_2223.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1635);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1213;
				{
					BufferSink buf_1596 = sink.context().makeBuffer();
					buf_1596.start(_M_STRING);
					buf_1596.literal(4);
					buf_1596.end();
					term_1213 = buf_1596.term();
				}
				sink.propertyNamed("$LineLocation", term_1213);
				Term term_1999;
				{
					BufferSink buf_2658 = sink.context().makeBuffer();
					buf_2658.start(_M_STRING);
					buf_2658.literal(19);
					buf_2658.end();
					term_1999 = buf_2658.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1999);
				sink.start(_M__sTextCons);
				Term term_1681;
				{
					BufferSink buf_1679 = sink.context().makeBuffer();
					buf_1679.start(_M_STRING);
					buf_1679.literal(4);
					buf_1679.end();
					term_1681 = buf_1679.term();
				}
				sink.propertyNamed("$LineLocation", term_1681);
				Term term_2000;
				{
					BufferSink buf_2874 = sink.context().makeBuffer();
					buf_2874.start(_M_STRING);
					buf_2874.literal(19);
					buf_2874.end();
					term_2000 = buf_2874.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2000);
				sink.start(_M__sTextChars);
				sink.literal("}");
				sink.end();
				Term term_1188;
				{
					BufferSink buf_1117 = sink.context().makeBuffer();
					buf_1117.start(_M_STRING);
					buf_1117.literal(5);
					buf_1117.end();
					term_1188 = buf_1117.term();
				}
				sink.propertyNamed("$LineLocation", term_1188);
				Term term_1676;
				{
					BufferSink buf_1589 = sink.context().makeBuffer();
					buf_1589.start(_M_STRING);
					buf_1589.literal(1);
					buf_1589.end();
					term_1676 = buf_1589.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1676);
				sink.start(_M__sTextCons);
				Term term_2127;
				{
					BufferSink buf_1986 = sink.context().makeBuffer();
					buf_1986.start(_M_STRING);
					buf_1986.literal(5);
					buf_1986.end();
					term_2127 = buf_1986.term();
				}
				sink.propertyNamed("$LineLocation", term_2127);
				Term term_2295;
				{
					BufferSink buf_897 = sink.context().makeBuffer();
					buf_897.start(_M_STRING);
					buf_897.literal(1);
					buf_897.end();
					term_2295 = buf_897.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2295);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1863;
				{
					BufferSink buf_2215 = sink.context().makeBuffer();
					buf_2215.start(_M_STRING);
					buf_2215.literal(5);
					buf_2215.end();
					term_1863 = buf_2215.term();
				}
				sink.propertyNamed("$LineLocation", term_1863);
				Term term_1031;
				{
					BufferSink buf_1585 = sink.context().makeBuffer();
					buf_1585.start(_M_STRING);
					buf_1585.literal(2);
					buf_1585.end();
					term_1031 = buf_1585.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1031);
				sink.start(_M__sTextCons);
				Term term_2089;
				{
					BufferSink buf_1559 = sink.context().makeBuffer();
					buf_1559.start(_M_STRING);
					buf_1559.literal(5);
					buf_1559.end();
					term_2089 = buf_1559.term();
				}
				sink.propertyNamed("$LineLocation", term_2089);
				Term term_1394;
				{
					BufferSink buf_912 = sink.context().makeBuffer();
					buf_912.start(_M_STRING);
					buf_912.literal(2);
					buf_912.end();
					term_1394 = buf_912.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1394);
				sink.start(_M__sTextEmbed);
				Term term_1274;
				{
					BufferSink buf_1607 = sink.context().makeBuffer();
					buf_1607.start(_M_STRING);
					buf_1607.literal(5);
					buf_1607.end();
					term_1274 = buf_1607.term();
				}
				sink.propertyNamed("$LineLocation", term_1274);
				Term term_1203;
				{
					BufferSink buf_1478 = sink.context().makeBuffer();
					buf_1478.start(_M_STRING);
					buf_1478.literal(2);
					buf_1478.end();
					term_1203 = buf_1478.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1203);
				sink.start(_M_AsText);
				sink.use(var_61);
				sink.end();
				sink.end();
				Term term_1616;
				{
					BufferSink buf_1897 = sink.context().makeBuffer();
					buf_1897.start(_M_STRING);
					buf_1897.literal(6);
					buf_1897.end();
					term_1616 = buf_1897.term();
				}
				sink.propertyNamed("$LineLocation", term_1616);
				Term term_2159;
				{
					BufferSink buf_1708 = sink.context().makeBuffer();
					buf_1708.start(_M_STRING);
					buf_1708.literal(1);
					buf_1708.end();
					term_2159 = buf_1708.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2159);
				sink.start(_M__sTextCons);
				Term term_1206;
				{
					BufferSink buf_1358 = sink.context().makeBuffer();
					buf_1358.start(_M_STRING);
					buf_1358.literal(6);
					buf_1358.end();
					term_1206 = buf_1358.term();
				}
				sink.propertyNamed("$LineLocation", term_1206);
				Term term_1418;
				{
					BufferSink buf_1144 = sink.context().makeBuffer();
					buf_1144.start(_M_STRING);
					buf_1144.literal(1);
					buf_1144.end();
					term_1418 = buf_1144.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1418);
				sink.start(_M__sTextChars);
				sink.literal(" = ");
				sink.end();
				Term term_1405;
				{
					BufferSink buf_1123 = sink.context().makeBuffer();
					buf_1123.start(_M_STRING);
					buf_1123.literal(6);
					buf_1123.end();
					term_1405 = buf_1123.term();
				}
				sink.propertyNamed("$LineLocation", term_1405);
				Term term_1619;
				{
					BufferSink buf_1187 = sink.context().makeBuffer();
					buf_1187.start(_M_STRING);
					buf_1187.literal(8);
					buf_1187.end();
					term_1619 = buf_1187.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1619);
				sink.start(_M__sTextCons);
				Term term_1588;
				{
					BufferSink buf_1321 = sink.context().makeBuffer();
					buf_1321.start(_M_STRING);
					buf_1321.literal(6);
					buf_1321.end();
					term_1588 = buf_1321.term();
				}
				sink.propertyNamed("$LineLocation", term_1588);
				Term term_1687;
				{
					BufferSink buf_1190 = sink.context().makeBuffer();
					buf_1190.start(_M_STRING);
					buf_1190.literal(8);
					buf_1190.end();
					term_1687 = buf_1190.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1687);
				sink.start(_M__sTextEmbed);
				Term term_2191;
				{
					BufferSink buf_1249 = sink.context().makeBuffer();
					buf_1249.start(_M_STRING);
					buf_1249.literal(6);
					buf_1249.end();
					term_2191 = buf_1249.term();
				}
				sink.propertyNamed("$LineLocation", term_2191);
				Term term_1593;
				{
					BufferSink buf_1435 = sink.context().makeBuffer();
					buf_1435.start(_M_STRING);
					buf_1435.literal(8);
					buf_1435.end();
					term_1593 = buf_1435.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1593);
				sink.start(_M_AsText);
				sink.use(var_61);
				sink.end();
				sink.end();
				Term term_1497;
				{
					BufferSink buf_1165 = sink.context().makeBuffer();
					buf_1165.start(_M_STRING);
					buf_1165.literal(6);
					buf_1165.end();
					term_1497 = buf_1165.term();
				}
				sink.propertyNamed("$LineLocation", term_1497);
				Term term_1465;
				{
					BufferSink buf_1915 = sink.context().makeBuffer();
					buf_1915.start(_M_STRING);
					buf_1915.literal(11);
					buf_1915.end();
					term_1465 = buf_1915.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1465);
				sink.start(_M__sTextCons);
				Term term_1354;
				{
					BufferSink buf_1553 = sink.context().makeBuffer();
					buf_1553.start(_M_STRING);
					buf_1553.literal(6);
					buf_1553.end();
					term_1354 = buf_1553.term();
				}
				sink.propertyNamed("$LineLocation", term_1354);
				Term term_1136;
				{
					BufferSink buf_1371 = sink.context().makeBuffer();
					buf_1371.start(_M_STRING);
					buf_1371.literal(11);
					buf_1371.end();
					term_1136 = buf_1371.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1136);
				sink.start(_M__sTextChars);
				sink.literal(".ref();");
				sink.end();
				Term term_1167;
				{
					BufferSink buf_1357 = sink.context().makeBuffer();
					buf_1357.start(_M_STRING);
					buf_1357.literal(6);
					buf_1357.end();
					term_1167 = buf_1357.term();
				}
				sink.propertyNamed("$LineLocation", term_1167);
				Term term_2075;
				{
					BufferSink buf_1356 = sink.context().makeBuffer();
					buf_1356.start(_M_STRING);
					buf_1356.literal(18);
					buf_1356.end();
					term_2075 = buf_1356.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2075);
				sink.start(_M__sTextCons);
				Term term_1199;
				{
					BufferSink buf_1560 = sink.context().makeBuffer();
					buf_1560.start(_M_STRING);
					buf_1560.literal(6);
					buf_1560.end();
					term_1199 = buf_1560.term();
				}
				sink.propertyNamed("$LineLocation", term_1199);
				Term term_1545;
				{
					BufferSink buf_1430 = sink.context().makeBuffer();
					buf_1430.start(_M_STRING);
					buf_1430.literal(18);
					buf_1430.end();
					term_1545 = buf_1430.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1545);
				sink.start(_M__sTextEmbed);
				Term term_2060;
				{
					BufferSink buf_1732 = sink.context().makeBuffer();
					buf_1732.start(_M_STRING);
					buf_1732.literal(6);
					buf_1732.end();
					term_2060 = buf_1732.term();
				}
				sink.propertyNamed("$LineLocation", term_2060);
				Term term_1413;
				{
					BufferSink buf_1788 = sink.context().makeBuffer();
					buf_1788.start(_M_STRING);
					buf_1788.literal(18);
					buf_1788.end();
					term_1413 = buf_1788.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1413);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_9));
				sink.start(_M_AddMetaVar);
				sink.copy(sub_103.ref());
				sink.use(var_61);
				sink.start(_M__sNil);
				sink.end();
				Variable var_204 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_204});
				VariableUse use_51 = sink.context().makeVariableUse(var_204);
				sink.substitute(term_686.ref(), new Variable[]
					{var_33}, new Term[]
					{use_51});
				sink.end();
				sink.end();
				sink.end();
				Term term_1286;
				{
					BufferSink buf_1547 = sink.context().makeBuffer();
					buf_1547.start(_M_STRING);
					buf_1547.literal(6);
					buf_1547.end();
					term_1286 = buf_1547.term();
				}
				sink.propertyNamed("$LineLocation", term_1286);
				Term term_1637;
				{
					BufferSink buf_1307 = sink.context().makeBuffer();
					buf_1307.start(_M_STRING);
					buf_1307.literal(25);
					buf_1307.end();
					term_1637 = buf_1307.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1637);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_5 :
			{
				if (term_558.descriptor() != _M_Crsx_xproperty_xA3)
				{
					break label_5;
				}
				Term sub_290 = term_558.sub(0).ref();
				/* #METAVAR=sub */Term sub_430 = term_558.sub(1).ref();
				Term sub_200 = term_558.sub(2).ref();
				/* #freeTerm=sub */
				/* #term=term */
				/* #=term *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.start(_M__s);
				sink.start(_M_Builtin_sColon);
				sink.end();
				sink.literal("Internal error: dynamic lookup of ");
				sink.copy(sub_290.ref());
				sink.literal(" not allowed.");
				sink.end();
				sink.end();
				return true;
			}
			label_58 :
			{
				if (term_558.descriptor() != _M_Crsx_xproperty_xA6)
				{
					break label_58;
				}
				Term sub_19 = term_558.sub(0).ref();
				/* #VARIABLE=sub */Term sub_245 = term_558.sub(1).ref();
				Term sub_351 = term_558.sub(2).ref();
				/* #freeTerm=sub */
				/* #term=term */
				/* #=term *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.literal("Internal error: variable property construction not allowed in pattern");
				sink.end();
				return true;
			}
			label_4 :
			{
				Term value_29 = props_9 == null ? null : props_9.lookup("$props");
				if (value_29 == null)
				{
					break label_4;
				}
				if (value_29.descriptor() != _M_TEXT)
				{
					break label_4;
				}
				Term sub_101 = value_29.sub(0).ref();
				/* #props=sub */
				Term value_77 = props_9 == null ? null : props_9.lookup("$caselabel");
				if (value_77 == null)
				{
					break label_4;
				}
				if (value_77.descriptor() != _M_TEXT)
				{
					break label_4;
				}
				Term sub_110 = value_77.sub(0).ref();
				/* #label=sub */
				if (term_558.descriptor() != _M_Crsx_xproperty_xA9)
				{
					break label_4;
				}
				Term sub_328 = term_558.sub(0).ref();
				/* #STRING=sub */Term sub_208 = term_558.sub(1).ref();
				Term sub_191 = term_558.sub(2).ref();
				/* #freeTerm=sub */
				/* #term=term */
				/* #=term *//*Contract*/
				Variable var_147 = sink.context().makeVariable("value");
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1313;
				{
					BufferSink buf_1392 = sink.context().makeBuffer();
					buf_1392.start(_M_STRING);
					buf_1392.literal(1);
					buf_1392.end();
					term_1313 = buf_1392.term();
				}
				sink.propertyNamed("$LineLocation", term_1313);
				Term term_1946;
				{
					BufferSink buf_1627 = sink.context().makeBuffer();
					buf_1627.start(_M_STRING);
					buf_1627.literal(1);
					buf_1627.end();
					term_1946 = buf_1627.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1946);
				sink.start(_M__sTextCons);
				Term term_1574;
				{
					BufferSink buf_2380 = sink.context().makeBuffer();
					buf_2380.start(_M_STRING);
					buf_2380.literal(1);
					buf_2380.end();
					term_1574 = buf_2380.term();
				}
				sink.propertyNamed("$LineLocation", term_1574);
				Term term_1753;
				{
					BufferSink buf_1135 = sink.context().makeBuffer();
					buf_1135.start(_M_STRING);
					buf_1135.literal(1);
					buf_1135.end();
					term_1753 = buf_1135.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1753);
				sink.start(_M__sTextChars);
				sink.literal("Term ");
				sink.end();
				Term term_1122;
				{
					BufferSink buf_922 = sink.context().makeBuffer();
					buf_922.start(_M_STRING);
					buf_922.literal(1);
					buf_922.end();
					term_1122 = buf_922.term();
				}
				sink.propertyNamed("$LineLocation", term_1122);
				Term term_1510;
				{
					BufferSink buf_1318 = sink.context().makeBuffer();
					buf_1318.start(_M_STRING);
					buf_1318.literal(2);
					buf_1318.end();
					term_1510 = buf_1318.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1510);
				sink.start(_M__sTextCons);
				Term term_1808;
				{
					BufferSink buf_1565 = sink.context().makeBuffer();
					buf_1565.start(_M_STRING);
					buf_1565.literal(1);
					buf_1565.end();
					term_1808 = buf_1565.term();
				}
				sink.propertyNamed("$LineLocation", term_1808);
				Term term_2294;
				{
					BufferSink buf_985 = sink.context().makeBuffer();
					buf_985.start(_M_STRING);
					buf_985.literal(2);
					buf_985.end();
					term_2294 = buf_985.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2294);
				sink.start(_M__sTextEmbed);
				Term term_1607;
				{
					BufferSink buf_2026 = sink.context().makeBuffer();
					buf_2026.start(_M_STRING);
					buf_2026.literal(1);
					buf_2026.end();
					term_1607 = buf_2026.term();
				}
				sink.propertyNamed("$LineLocation", term_1607);
				Term term_851;
				{
					BufferSink buf_1544 = sink.context().makeBuffer();
					buf_1544.start(_M_STRING);
					buf_1544.literal(2);
					buf_1544.end();
					term_851 = buf_1544.term();
				}
				sink.propertyNamed("$ColumnLocation", term_851);
				sink.start(_M_AsText);
				sink.use(var_147);
				sink.end();
				sink.end();
				Term term_1522;
				{
					BufferSink buf_1374 = sink.context().makeBuffer();
					buf_1374.start(_M_STRING);
					buf_1374.literal(1);
					buf_1374.end();
					term_1522 = buf_1374.term();
				}
				sink.propertyNamed("$LineLocation", term_1522);
				Term term_829;
				{
					BufferSink buf_1237 = sink.context().makeBuffer();
					buf_1237.start(_M_STRING);
					buf_1237.literal(7);
					buf_1237.end();
					term_829 = buf_1237.term();
				}
				sink.propertyNamed("$ColumnLocation", term_829);
				sink.start(_M__sTextCons);
				Term term_2082;
				{
					BufferSink buf_1445 = sink.context().makeBuffer();
					buf_1445.start(_M_STRING);
					buf_1445.literal(1);
					buf_1445.end();
					term_2082 = buf_1445.term();
				}
				sink.propertyNamed("$LineLocation", term_2082);
				Term term_1572;
				{
					BufferSink buf_1824 = sink.context().makeBuffer();
					buf_1824.start(_M_STRING);
					buf_1824.literal(7);
					buf_1824.end();
					term_1572 = buf_1824.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1572);
				sink.start(_M__sTextChars);
				sink.literal(" = ");
				sink.end();
				Term term_1567;
				{
					BufferSink buf_1634 = sink.context().makeBuffer();
					buf_1634.start(_M_STRING);
					buf_1634.literal(1);
					buf_1634.end();
					term_1567 = buf_1634.term();
				}
				sink.propertyNamed("$LineLocation", term_1567);
				Term term_1534;
				{
					BufferSink buf_1075 = sink.context().makeBuffer();
					buf_1075.start(_M_STRING);
					buf_1075.literal(14);
					buf_1075.end();
					term_1534 = buf_1075.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1534);
				sink.start(_M__sTextCons);
				Term term_1489;
				{
					BufferSink buf_1923 = sink.context().makeBuffer();
					buf_1923.start(_M_STRING);
					buf_1923.literal(1);
					buf_1923.end();
					term_1489 = buf_1923.term();
				}
				sink.propertyNamed("$LineLocation", term_1489);
				Term term_1443;
				{
					BufferSink buf_1483 = sink.context().makeBuffer();
					buf_1483.start(_M_STRING);
					buf_1483.literal(14);
					buf_1483.end();
					term_1443 = buf_1483.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1443);
				sink.start(_M__sTextEmbed);
				Term term_1531;
				{
					BufferSink buf_1640 = sink.context().makeBuffer();
					buf_1640.start(_M_STRING);
					buf_1640.literal(1);
					buf_1640.end();
					term_1531 = buf_1640.term();
				}
				sink.propertyNamed("$LineLocation", term_1531);
				Term term_1868;
				{
					BufferSink buf_1827 = sink.context().makeBuffer();
					buf_1827.start(_M_STRING);
					buf_1827.literal(14);
					buf_1827.end();
					term_1868 = buf_1827.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1868);
				sink.start(_M_AsText);
				sink.copy(sub_101.ref());
				sink.end();
				sink.end();
				Term term_895;
				{
					BufferSink buf_1959 = sink.context().makeBuffer();
					buf_1959.start(_M_STRING);
					buf_1959.literal(1);
					buf_1959.end();
					term_895 = buf_1959.term();
				}
				sink.propertyNamed("$LineLocation", term_895);
				Term term_1602;
				{
					BufferSink buf_1495 = sink.context().makeBuffer();
					buf_1495.start(_M_STRING);
					buf_1495.literal(17);
					buf_1495.end();
					term_1602 = buf_1495.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1602);
				sink.start(_M__sTextCons);
				Term term_1580;
				{
					BufferSink buf_1454 = sink.context().makeBuffer();
					buf_1454.start(_M_STRING);
					buf_1454.literal(1);
					buf_1454.end();
					term_1580 = buf_1454.term();
				}
				sink.propertyNamed("$LineLocation", term_1580);
				Term term_1917;
				{
					BufferSink buf_1214 = sink.context().makeBuffer();
					buf_1214.start(_M_STRING);
					buf_1214.literal(17);
					buf_1214.end();
					term_1917 = buf_1214.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1917);
				sink.start(_M__sTextChars);
				sink.literal(" == null ? null : ");
				sink.end();
				Term term_1098;
				{
					BufferSink buf_1711 = sink.context().makeBuffer();
					buf_1711.start(_M_STRING);
					buf_1711.literal(1);
					buf_1711.end();
					term_1098 = buf_1711.term();
				}
				sink.propertyNamed("$LineLocation", term_1098);
				Term term_1779;
				{
					BufferSink buf_1076 = sink.context().makeBuffer();
					buf_1076.start(_M_STRING);
					buf_1076.literal(25);
					buf_1076.end();
					term_1779 = buf_1076.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1779);
				sink.start(_M__sTextCons);
				Term term_1576;
				{
					BufferSink buf_1078 = sink.context().makeBuffer();
					buf_1078.start(_M_STRING);
					buf_1078.literal(1);
					buf_1078.end();
					term_1576 = buf_1078.term();
				}
				sink.propertyNamed("$LineLocation", term_1576);
				Term term_1398;
				{
					BufferSink buf_1200 = sink.context().makeBuffer();
					buf_1200.start(_M_STRING);
					buf_1200.literal(25);
					buf_1200.end();
					term_1398 = buf_1200.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1398);
				sink.start(_M__sTextEmbed);
				Term term_1133;
				{
					BufferSink buf_2599 = sink.context().makeBuffer();
					buf_2599.start(_M_STRING);
					buf_2599.literal(1);
					buf_2599.end();
					term_1133 = buf_2599.term();
				}
				sink.propertyNamed("$LineLocation", term_1133);
				Term term_1023;
				{
					BufferSink buf_1812 = sink.context().makeBuffer();
					buf_1812.start(_M_STRING);
					buf_1812.literal(25);
					buf_1812.end();
					term_1023 = buf_1812.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1023);
				sink.start(_M_AsText);
				sink.copy(sub_101.ref());
				sink.end();
				sink.end();
				Term term_2162;
				{
					BufferSink buf_1346 = sink.context().makeBuffer();
					buf_1346.start(_M_STRING);
					buf_1346.literal(1);
					buf_1346.end();
					term_2162 = buf_1346.term();
				}
				sink.propertyNamed("$LineLocation", term_2162);
				Term term_2258;
				{
					BufferSink buf_1343 = sink.context().makeBuffer();
					buf_1343.start(_M_STRING);
					buf_1343.literal(43);
					buf_1343.end();
					term_2258 = buf_1343.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2258);
				sink.start(_M__sTextCons);
				Term term_2782;
				{
					BufferSink buf_1493 = sink.context().makeBuffer();
					buf_1493.start(_M_STRING);
					buf_1493.literal(1);
					buf_1493.end();
					term_2782 = buf_1493.term();
				}
				sink.propertyNamed("$LineLocation", term_2782);
				Term term_1439;
				{
					BufferSink buf_1581 = sink.context().makeBuffer();
					buf_1581.start(_M_STRING);
					buf_1581.literal(43);
					buf_1581.end();
					term_1439 = buf_1581.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1439);
				sink.start(_M__sTextChars);
				sink.literal(".lookup(");
				sink.end();
				Term term_1263;
				{
					BufferSink buf_975 = sink.context().makeBuffer();
					buf_975.start(_M_STRING);
					buf_975.literal(1);
					buf_975.end();
					term_1263 = buf_975.term();
				}
				sink.propertyNamed("$LineLocation", term_1263);
				Term term_1749;
				{
					BufferSink buf_1349 = sink.context().makeBuffer();
					buf_1349.start(_M_STRING);
					buf_1349.literal(51);
					buf_1349.end();
					term_1749 = buf_1349.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1749);
				sink.start(_M__sTextCons);
				Term term_1712;
				{
					BufferSink buf_1767 = sink.context().makeBuffer();
					buf_1767.start(_M_STRING);
					buf_1767.literal(1);
					buf_1767.end();
					term_1712 = buf_1767.term();
				}
				sink.propertyNamed("$LineLocation", term_1712);
				Term term_1697;
				{
					BufferSink buf_891 = sink.context().makeBuffer();
					buf_891.start(_M_STRING);
					buf_891.literal(59);
					buf_891.end();
					term_1697 = buf_891.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1697);
				sink.start(_M__sTextChars);
				sink.copy(sub_328.ref());
				sink.end();
				Term term_1860;
				{
					BufferSink buf_1721 = sink.context().makeBuffer();
					buf_1721.start(_M_STRING);
					buf_1721.literal(1);
					buf_1721.end();
					term_1860 = buf_1721.term();
				}
				sink.propertyNamed("$LineLocation", term_1860);
				Term term_1599;
				{
					BufferSink buf_2009 = sink.context().makeBuffer();
					buf_2009.start(_M_STRING);
					buf_2009.literal(60);
					buf_2009.end();
					term_1599 = buf_2009.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1599);
				sink.start(_M__sTextCons);
				Term term_1903;
				{
					BufferSink buf_1696 = sink.context().makeBuffer();
					buf_1696.start(_M_STRING);
					buf_1696.literal(1);
					buf_1696.end();
					term_1903 = buf_1696.term();
				}
				sink.propertyNamed("$LineLocation", term_1903);
				Term term_1583;
				{
					BufferSink buf_1506 = sink.context().makeBuffer();
					buf_1506.start(_M_STRING);
					buf_1506.literal(60);
					buf_1506.end();
					term_1583 = buf_1506.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1583);
				sink.start(_M__sTextChars);
				sink.literal(");");
				sink.end();
				Term term_1508;
				{
					BufferSink buf_1675 = sink.context().makeBuffer();
					buf_1675.start(_M_STRING);
					buf_1675.literal(1);
					buf_1675.end();
					term_1508 = buf_1675.term();
				}
				sink.propertyNamed("$LineLocation", term_1508);
				Term term_1438;
				{
					BufferSink buf_2147 = sink.context().makeBuffer();
					buf_2147.start(_M_STRING);
					buf_2147.literal(69);
					buf_2147.end();
					term_1438 = buf_2147.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1438);
				sink.start(_M__sTextCons);
				Term term_2176;
				{
					BufferSink buf_1322 = sink.context().makeBuffer();
					buf_1322.start(_M_STRING);
					buf_1322.literal(1);
					buf_1322.end();
					term_2176 = buf_1322.term();
				}
				sink.propertyNamed("$LineLocation", term_2176);
				Term term_2024;
				{
					BufferSink buf_1330 = sink.context().makeBuffer();
					buf_1330.start(_M_STRING);
					buf_1330.literal(69);
					buf_1330.end();
					term_2024 = buf_1330.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2024);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1743;
				{
					BufferSink buf_1489 = sink.context().makeBuffer();
					buf_1489.start(_M_STRING);
					buf_1489.literal(1);
					buf_1489.end();
					term_1743 = buf_1489.term();
				}
				sink.propertyNamed("$LineLocation", term_1743);
				Term term_1345;
				{
					BufferSink buf_1505 = sink.context().makeBuffer();
					buf_1505.start(_M_STRING);
					buf_1505.literal(71);
					buf_1505.end();
					term_1345 = buf_1505.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1345);
				sink.start(_M__sTextCons);
				Term term_2077;
				{
					BufferSink buf_1568 = sink.context().makeBuffer();
					buf_1568.start(_M_STRING);
					buf_1568.literal(1);
					buf_1568.end();
					term_2077 = buf_1568.term();
				}
				sink.propertyNamed("$LineLocation", term_2077);
				Term term_1594;
				{
					BufferSink buf_1154 = sink.context().makeBuffer();
					buf_1154.start(_M_STRING);
					buf_1154.literal(71);
					buf_1154.end();
					term_1594 = buf_1154.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1594);
				sink.start(_M__sTextChars);
				sink.literal("if (");
				sink.end();
				Term term_2132;
				{
					BufferSink buf_1760 = sink.context().makeBuffer();
					buf_1760.start(_M_STRING);
					buf_1760.literal(2);
					buf_1760.end();
					term_2132 = buf_1760.term();
				}
				sink.propertyNamed("$LineLocation", term_2132);
				Term term_1474;
				{
					BufferSink buf_1335 = sink.context().makeBuffer();
					buf_1335.start(_M_STRING);
					buf_1335.literal(1);
					buf_1335.end();
					term_1474 = buf_1335.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1474);
				sink.start(_M__sTextCons);
				Term term_1305;
				{
					BufferSink buf_1822 = sink.context().makeBuffer();
					buf_1822.start(_M_STRING);
					buf_1822.literal(2);
					buf_1822.end();
					term_1305 = buf_1822.term();
				}
				sink.propertyNamed("$LineLocation", term_1305);
				Term term_2543;
				{
					BufferSink buf_1752 = sink.context().makeBuffer();
					buf_1752.start(_M_STRING);
					buf_1752.literal(1);
					buf_1752.end();
					term_2543 = buf_1752.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2543);
				sink.start(_M__sTextEmbed);
				Term term_1564;
				{
					BufferSink buf_2038 = sink.context().makeBuffer();
					buf_2038.start(_M_STRING);
					buf_2038.literal(2);
					buf_2038.end();
					term_1564 = buf_2038.term();
				}
				sink.propertyNamed("$LineLocation", term_1564);
				Term term_1553;
				{
					BufferSink buf_1514 = sink.context().makeBuffer();
					buf_1514.start(_M_STRING);
					buf_1514.literal(1);
					buf_1514.end();
					term_1553 = buf_1514.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1553);
				sink.start(_M_AsText);
				sink.use(var_147);
				sink.end();
				sink.end();
				Term term_2311;
				{
					BufferSink buf_1372 = sink.context().makeBuffer();
					buf_1372.start(_M_STRING);
					buf_1372.literal(2);
					buf_1372.end();
					term_2311 = buf_1372.term();
				}
				sink.propertyNamed("$LineLocation", term_2311);
				Term term_1718;
				{
					BufferSink buf_1672 = sink.context().makeBuffer();
					buf_1672.start(_M_STRING);
					buf_1672.literal(5);
					buf_1672.end();
					term_1718 = buf_1672.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1718);
				sink.start(_M__sTextCons);
				Term term_1383;
				{
					BufferSink buf_1464 = sink.context().makeBuffer();
					buf_1464.start(_M_STRING);
					buf_1464.literal(2);
					buf_1464.end();
					term_1383 = buf_1464.term();
				}
				sink.propertyNamed("$LineLocation", term_1383);
				Term term_1609;
				{
					BufferSink buf_1762 = sink.context().makeBuffer();
					buf_1762.start(_M_STRING);
					buf_1762.literal(5);
					buf_1762.end();
					term_1609 = buf_1762.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1609);
				sink.start(_M__sTextChars);
				sink.literal(" == null) ");
				sink.end();
				Term term_1560;
				{
					BufferSink buf_1929 = sink.context().makeBuffer();
					buf_1929.start(_M_STRING);
					buf_1929.literal(2);
					buf_1929.end();
					term_1560 = buf_1929.term();
				}
				sink.propertyNamed("$LineLocation", term_1560);
				Term term_1138;
				{
					BufferSink buf_1740 = sink.context().makeBuffer();
					buf_1740.start(_M_STRING);
					buf_1740.literal(12);
					buf_1740.end();
					term_1138 = buf_1740.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1138);
				sink.start(_M__sTextCons);
				Term term_1440;
				{
					BufferSink buf_874 = sink.context().makeBuffer();
					buf_874.start(_M_STRING);
					buf_874.literal(2);
					buf_874.end();
					term_1440 = buf_874.term();
				}
				sink.propertyNamed("$LineLocation", term_1440);
				Term term_1460;
				{
					BufferSink buf_1183 = sink.context().makeBuffer();
					buf_1183.start(_M_STRING);
					buf_1183.literal(12);
					buf_1183.end();
					term_1460 = buf_1183.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1460);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1989;
				{
					BufferSink buf_1854 = sink.context().makeBuffer();
					buf_1854.start(_M_STRING);
					buf_1854.literal(2);
					buf_1854.end();
					term_1989 = buf_1854.term();
				}
				sink.propertyNamed("$LineLocation", term_1989);
				Term term_1966;
				{
					BufferSink buf_1166 = sink.context().makeBuffer();
					buf_1166.start(_M_STRING);
					buf_1166.literal(22);
					buf_1166.end();
					term_1966 = buf_1166.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1966);
				sink.start(_M__sTextCons);
				Term term_1322;
				{
					BufferSink buf_2158 = sink.context().makeBuffer();
					buf_2158.start(_M_STRING);
					buf_2158.literal(2);
					buf_2158.end();
					term_1322 = buf_2158.term();
				}
				sink.propertyNamed("$LineLocation", term_1322);
				Term term_1374;
				{
					BufferSink buf_827 = sink.context().makeBuffer();
					buf_827.start(_M_STRING);
					buf_827.literal(22);
					buf_827.end();
					term_1374 = buf_827.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1374);
				sink.start(_M__sTextChars);
				sink.literal("{");
				sink.end();
				Term term_1624;
				{
					BufferSink buf_1091 = sink.context().makeBuffer();
					buf_1091.start(_M_STRING);
					buf_1091.literal(3);
					buf_1091.end();
					term_1624 = buf_1091.term();
				}
				sink.propertyNamed("$LineLocation", term_1624);
				Term term_1282;
				{
					BufferSink buf_1329 = sink.context().makeBuffer();
					buf_1329.start(_M_STRING);
					buf_1329.literal(1);
					buf_1329.end();
					term_1282 = buf_1329.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1282);
				sink.start(_M__sTextCons);
				Term term_1582;
				{
					BufferSink buf_1926 = sink.context().makeBuffer();
					buf_1926.start(_M_STRING);
					buf_1926.literal(3);
					buf_1926.end();
					term_1582 = buf_1926.term();
				}
				sink.propertyNamed("$LineLocation", term_1582);
				Term term_1128;
				{
					BufferSink buf_1677 = sink.context().makeBuffer();
					buf_1677.start(_M_STRING);
					buf_1677.literal(2);
					buf_1677.end();
					term_1128 = buf_1677.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1128);
				sink.start(_M__sTextIndent);
				Term term_1437;
				{
					BufferSink buf_1613 = sink.context().makeBuffer();
					buf_1613.start(_M_STRING);
					buf_1613.literal(3);
					buf_1613.end();
					term_1437 = buf_1613.term();
				}
				sink.propertyNamed("$LineLocation", term_1437);
				Term term_2251;
				{
					BufferSink buf_1985 = sink.context().makeBuffer();
					buf_1985.start(_M_STRING);
					buf_1985.literal(2);
					buf_1985.end();
					term_2251 = buf_1985.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2251);
				sink.start(_M__sTextCons);
				Term term_1214;
				{
					BufferSink buf_1667 = sink.context().makeBuffer();
					buf_1667.start(_M_STRING);
					buf_1667.literal(3);
					buf_1667.end();
					term_1214 = buf_1667.term();
				}
				sink.propertyNamed("$LineLocation", term_1214);
				Term term_2151;
				{
					BufferSink buf_1247 = sink.context().makeBuffer();
					buf_1247.start(_M_STRING);
					buf_1247.literal(2);
					buf_1247.end();
					term_2151 = buf_1247.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2151);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2566;
				{
					BufferSink buf_1034 = sink.context().makeBuffer();
					buf_1034.start(_M_STRING);
					buf_1034.literal(3);
					buf_1034.end();
					term_2566 = buf_1034.term();
				}
				sink.propertyNamed("$LineLocation", term_2566);
				Term term_1690;
				{
					BufferSink buf_1734 = sink.context().makeBuffer();
					buf_1734.start(_M_STRING);
					buf_1734.literal(3);
					buf_1734.end();
					term_1690 = buf_1734.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1690);
				sink.start(_M__sTextCons);
				Term term_1187;
				{
					BufferSink buf_742 = sink.context().makeBuffer();
					buf_742.start(_M_STRING);
					buf_742.literal(3);
					buf_742.end();
					term_1187 = buf_742.term();
				}
				sink.propertyNamed("$LineLocation", term_1187);
				Term term_1864;
				{
					BufferSink buf_1320 = sink.context().makeBuffer();
					buf_1320.start(_M_STRING);
					buf_1320.literal(3);
					buf_1320.end();
					term_1864 = buf_1320.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1864);
				sink.start(_M__sTextChars);
				sink.literal("  break ");
				sink.end();
				Term term_1346;
				{
					BufferSink buf_1733 = sink.context().makeBuffer();
					buf_1733.start(_M_STRING);
					buf_1733.literal(4);
					buf_1733.end();
					term_1346 = buf_1733.term();
				}
				sink.propertyNamed("$LineLocation", term_1346);
				Term term_1480;
				{
					BufferSink buf_1306 = sink.context().makeBuffer();
					buf_1306.start(_M_STRING);
					buf_1306.literal(1);
					buf_1306.end();
					term_1480 = buf_1306.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1480);
				sink.start(_M__sTextCons);
				Term term_1706;
				{
					BufferSink buf_1648 = sink.context().makeBuffer();
					buf_1648.start(_M_STRING);
					buf_1648.literal(4);
					buf_1648.end();
					term_1706 = buf_1648.term();
				}
				sink.propertyNamed("$LineLocation", term_1706);
				Term term_1459;
				{
					BufferSink buf_2014 = sink.context().makeBuffer();
					buf_2014.start(_M_STRING);
					buf_2014.literal(1);
					buf_2014.end();
					term_1459 = buf_2014.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1459);
				sink.start(_M__sTextEmbed);
				Term term_1266;
				{
					BufferSink buf_1326 = sink.context().makeBuffer();
					buf_1326.start(_M_STRING);
					buf_1326.literal(4);
					buf_1326.end();
					term_1266 = buf_1326.term();
				}
				sink.propertyNamed("$LineLocation", term_1266);
				Term term_1673;
				{
					BufferSink buf_1731 = sink.context().makeBuffer();
					buf_1731.start(_M_STRING);
					buf_1731.literal(1);
					buf_1731.end();
					term_1673 = buf_1731.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1673);
				sink.start(_M_AsText);
				sink.copy(sub_110.ref());
				sink.end();
				sink.end();
				Term term_1848;
				{
					BufferSink buf_1615 = sink.context().makeBuffer();
					buf_1615.start(_M_STRING);
					buf_1615.literal(4);
					buf_1615.end();
					term_1848 = buf_1615.term();
				}
				sink.propertyNamed("$LineLocation", term_1848);
				Term term_1678;
				{
					BufferSink buf_1059 = sink.context().makeBuffer();
					buf_1059.start(_M_STRING);
					buf_1059.literal(9);
					buf_1059.end();
					term_1678 = buf_1059.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1678);
				sink.start(_M__sTextCons);
				Term term_2468;
				{
					BufferSink buf_1309 = sink.context().makeBuffer();
					buf_1309.start(_M_STRING);
					buf_1309.literal(4);
					buf_1309.end();
					term_2468 = buf_1309.term();
				}
				sink.propertyNamed("$LineLocation", term_2468);
				Term term_1886;
				{
					BufferSink buf_1295 = sink.context().makeBuffer();
					buf_1295.start(_M_STRING);
					buf_1295.literal(9);
					buf_1295.end();
					term_1886 = buf_1295.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1886);
				sink.start(_M__sTextChars);
				sink.literal(";");
				sink.end();
				Term term_1342;
				{
					BufferSink buf_1705 = sink.context().makeBuffer();
					buf_1705.start(_M_STRING);
					buf_1705.literal(4);
					buf_1705.end();
					term_1342 = buf_1705.term();
				}
				sink.propertyNamed("$LineLocation", term_1342);
				Term term_1541;
				{
					BufferSink buf_2177 = sink.context().makeBuffer();
					buf_2177.start(_M_STRING);
					buf_2177.literal(17);
					buf_2177.end();
					term_1541 = buf_2177.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1541);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				Term term_1498;
				{
					BufferSink buf_2061 = sink.context().makeBuffer();
					buf_2061.start(_M_STRING);
					buf_2061.literal(4);
					buf_2061.end();
					term_1498 = buf_2061.term();
				}
				sink.propertyNamed("$LineLocation", term_1498);
				Term term_2602;
				{
					BufferSink buf_1240 = sink.context().makeBuffer();
					buf_1240.start(_M_STRING);
					buf_1240.literal(18);
					buf_1240.end();
					term_2602 = buf_1240.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2602);
				sink.start(_M__sTextCons);
				Term term_1683;
				{
					BufferSink buf_1977 = sink.context().makeBuffer();
					buf_1977.start(_M_STRING);
					buf_1977.literal(4);
					buf_1977.end();
					term_1683 = buf_1977.term();
				}
				sink.propertyNamed("$LineLocation", term_1683);
				Term term_1212;
				{
					BufferSink buf_1155 = sink.context().makeBuffer();
					buf_1155.start(_M_STRING);
					buf_1155.literal(18);
					buf_1155.end();
					term_1212 = buf_1155.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1212);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2280;
				{
					BufferSink buf_1863 = sink.context().makeBuffer();
					buf_1863.start(_M_STRING);
					buf_1863.literal(4);
					buf_1863.end();
					term_2280 = buf_1863.term();
				}
				sink.propertyNamed("$LineLocation", term_2280);
				Term term_1403;
				{
					BufferSink buf_1342 = sink.context().makeBuffer();
					buf_1342.start(_M_STRING);
					buf_1342.literal(19);
					buf_1342.end();
					term_1403 = buf_1342.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1403);
				sink.start(_M__sTextCons);
				Term term_1273;
				{
					BufferSink buf_1995 = sink.context().makeBuffer();
					buf_1995.start(_M_STRING);
					buf_1995.literal(4);
					buf_1995.end();
					term_1273 = buf_1995.term();
				}
				sink.propertyNamed("$LineLocation", term_1273);
				Term term_1828;
				{
					BufferSink buf_1277 = sink.context().makeBuffer();
					buf_1277.start(_M_STRING);
					buf_1277.literal(19);
					buf_1277.end();
					term_1828 = buf_1277.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1828);
				sink.start(_M__sTextChars);
				sink.literal("}");
				sink.end();
				Term term_1861;
				{
					BufferSink buf_1387 = sink.context().makeBuffer();
					buf_1387.start(_M_STRING);
					buf_1387.literal(5);
					buf_1387.end();
					term_1861 = buf_1387.term();
				}
				sink.propertyNamed("$LineLocation", term_1861);
				Term term_1579;
				{
					BufferSink buf_1899 = sink.context().makeBuffer();
					buf_1899.start(_M_STRING);
					buf_1899.literal(1);
					buf_1899.end();
					term_1579 = buf_1899.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1579);
				sink.start(_M__sTextCons);
				Term term_1488;
				{
					BufferSink buf_1422 = sink.context().makeBuffer();
					buf_1422.start(_M_STRING);
					buf_1422.literal(5);
					buf_1422.end();
					term_1488 = buf_1422.term();
				}
				sink.propertyNamed("$LineLocation", term_1488);
				Term term_1344;
				{
					BufferSink buf_1220 = sink.context().makeBuffer();
					buf_1220.start(_M_STRING);
					buf_1220.literal(1);
					buf_1220.end();
					term_1344 = buf_1220.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1344);
				sink.start(_M__sTextEmbed);
				Term term_1709;
				{
					BufferSink buf_1688 = sink.context().makeBuffer();
					buf_1688.start(_M_STRING);
					buf_1688.literal(5);
					buf_1688.end();
					term_1709 = buf_1688.term();
				}
				sink.propertyNamed("$LineLocation", term_1709);
				Term term_1468;
				{
					BufferSink buf_1639 = sink.context().makeBuffer();
					buf_1639.start(_M_STRING);
					buf_1639.literal(1);
					buf_1639.end();
					term_1468 = buf_1639.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1468);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_9));
				sink.start(_M_SendMatchFreeTerm);
				sink.copy(sub_191.ref());
				sink.use(var_147);
				Variable var_82 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_82});
				VariableUse use_25 = sink.context().makeVariableUse(var_82);
				sink.substitute(term_686.ref(), new Variable[]
					{var_33}, new Term[]
					{use_25});
				sink.end();
				sink.end();
				sink.end();
				Term term_1092;
				{
					BufferSink buf_1476 = sink.context().makeBuffer();
					buf_1476.start(_M_STRING);
					buf_1476.literal(5);
					buf_1476.end();
					term_1092 = buf_1476.term();
				}
				sink.propertyNamed("$LineLocation", term_1092);
				Term term_1326;
				{
					BufferSink buf_1835 = sink.context().makeBuffer();
					buf_1835.start(_M_STRING);
					buf_1835.literal(2);
					buf_1835.end();
					term_1326 = buf_1835.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1326);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_157 :
			{
				if (term_558.descriptor() != _M_Crsx_xproperty_xA10)
				{
					break label_157;
				}
				Term sub_291 = term_558.sub(0).ref();
				if (sub_291.descriptor() != _M_Crsx_xconstructor_xA1)
				{
					break label_157;
				}
				Term sub_305 = sub_291.sub(0).ref();
				if (sub_305.descriptor() != _M_Crsx_xqualifier_xA2)
				{
					break label_157;
				}
				Term sub_296 = sub_291.sub(1).ref();
				/* #CONSTRUCTOR=sub */Term sub_248 = term_558.sub(1).ref();
				Term sub_276 = term_558.sub(2).ref();
				/* #freeTerm=sub */
				/* #term=term */
				/* #=term *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.start(_M__s);
				sink.start(_M_Builtin_sColon);
				sink.end();
				sink.literal("Internal error: named property ");
				sink.copy(sub_296.ref());
				sink.literal(" not allowed in pattern");
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendMatchProperty, props_9, term_558, term_811, var_33, term_686);
	}

	final public static boolean _M_SendMatchPropertyList(Sink sink, int shared, int depth, Properties props_69, Term term_1332, Term term_950, Term term_1910, Variable var_284, Term term_1677)
	{
		if (depth < 2000)
		{
			label_92 :
			{
				if (term_1332.descriptor() != _M_OK)
				{
					break label_92;
				}
				if (term_950.descriptor() != _M__sNil)
				{
					break label_92;
				}
				/* #term=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_69));
				Term term_1304;
				{
					BufferSink buf_1671 = sink.context().makeBuffer();
					buf_1671.start(_M_OK);
					buf_1671.end();
					term_1304 = buf_1671.term();
				}
				sink.substitute(term_1677.ref(), new Variable[]
					{var_284}, new Term[]
					{term_1304});
				return true;
			}
			label_252 :
			{
				if (term_1332.descriptor() != _M_OK)
				{
					break label_252;
				}
				if (term_950.descriptor() != _M__sCons)
				{
					break label_252;
				}
				Term sub_463 = term_950.sub(0).ref();
				if (sub_463.descriptor() != _M_Crsx_xpropertyList_xS1)
				{
					break label_252;
				}
				Term sub_13 = sub_463.sub(0).ref();
				Term sub_847 = sub_463.sub(1).ref();
				if (sub_847.descriptor() != _M__sNil)
				{
					break label_252;
				}
				Term sub_219 = term_950.sub(1).ref();
				/* #propertyList_S1*=sub */
				/* #term=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_69));
				sink.start(_M_SendMatchPropertyList);
				sink.start(_M_OK);
				sink.end();
				sink.copy(sub_219.ref());
				sink.copy(term_1910.ref());
				Variable var_21 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_21});
				VariableUse use_60 = sink.context().makeVariableUse(var_21);
				sink.substitute(term_1677.ref(), new Variable[]
					{var_284}, new Term[]
					{use_60});
				sink.end();
				return true;
			}
			label_3 :
			{
				if (term_1332.descriptor() != _M_OK)
				{
					break label_3;
				}
				if (term_950.descriptor() != _M__sCons)
				{
					break label_3;
				}
				Term sub_199 = term_950.sub(0).ref();
				if (sub_199.descriptor() != _M_Crsx_xpropertyList_xS1)
				{
					break label_3;
				}
				Term sub_408 = sub_199.sub(0).ref();
				Term sub_151 = sub_199.sub(1).ref();
				if (sub_151.descriptor() != _M__sCons)
				{
					break label_3;
				}
				Term sub_410 = sub_151.sub(0).ref();
				/* #property=sub */Term sub_243 = sub_151.sub(1).ref();
				if (sub_243.descriptor() != _M__sNil)
				{
					break label_3;
				}
				Term sub_153 = term_950.sub(1).ref();
				/* #propertyList_S1*=sub */
				/* #term=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_69));
				sink.start(_M_SendMatchProperty);
				sink.copy(sub_410.ref());
				sink.copy(term_1910.ref());
				Variable var_363 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_363});
				sink.start(_M_SendMatchPropertyList);
				sink.use(var_363);
				sink.copy(sub_153.ref());
				sink.copy(term_1910.ref());
				Variable var_172 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_172});
				VariableUse use_47 = sink.context().makeVariableUse(var_172);
				sink.substitute(term_1677.ref(), new Variable[]
					{var_284}, new Term[]
					{use_47});
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendMatchPropertyList, props_69, term_1332, term_950, term_1910, var_284, term_1677);
	}

	final public static boolean _M_SendMatchMaybeProperties(Sink sink, int shared, int depth, Properties props_46, Term term_1315, Term term_1759, Variable var_223, Term term_1715)
	{
		if (depth < 2000)
		{
			label_77 :
			{
				if (term_1315.descriptor() != _M__sNil)
				{
					break label_77;
				}
				/* #term=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_46));
				Term term_2283;
				{
					BufferSink buf_1805 = sink.context().makeBuffer();
					buf_1805.start(_M_OK);
					buf_1805.end();
					term_2283 = buf_1805.term();
				}
				sink.substitute(term_1715.ref(), new Variable[]
					{var_223}, new Term[]
					{term_2283});
				return true;
			}
			label_66 :
			{
				if (term_1315.descriptor() != _M__sCons)
				{
					break label_66;
				}
				Term sub_525 = term_1315.sub(0).ref();
				if (sub_525.descriptor() != _M_Crsx_xproperties)
				{
					break label_66;
				}
				Term sub_456 = sub_525.sub(0).ref();
				Term sub_346 = sub_525.sub(1).ref();
				if (sub_346.descriptor() != _M__sNil)
				{
					break label_66;
				}
				Term sub_415 = sub_525.sub(2).ref();
				Term sub_377 = term_1315.sub(1).ref();
				if (sub_377.descriptor() != _M__sNil)
				{
					break label_66;
				}
				/* #term=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_46));
				Term term_1025;
				{
					BufferSink buf_1794 = sink.context().makeBuffer();
					buf_1794.start(_M_OK);
					buf_1794.end();
					term_1025 = buf_1794.term();
				}
				sink.substitute(term_1715.ref(), new Variable[]
					{var_223}, new Term[]
					{term_1025});
				return true;
			}
			label_112 :
			{
				if (term_1315.descriptor() != _M__sCons)
				{
					break label_112;
				}
				Term sub_257 = term_1315.sub(0).ref();
				if (sub_257.descriptor() != _M_Crsx_xproperties)
				{
					break label_112;
				}
				Term sub_175 = sub_257.sub(0).ref();
				Term sub_643 = sub_257.sub(1).ref();
				if (sub_643.descriptor() != _M__sCons)
				{
					break label_112;
				}
				Term sub_221 = sub_643.sub(0).ref();
				/* #propertyList=sub */Term sub_335 = sub_643.sub(1).ref();
				if (sub_335.descriptor() != _M__sNil)
				{
					break label_112;
				}
				Term sub_105 = sub_257.sub(2).ref();
				Term sub_639 = term_1315.sub(1).ref();
				if (sub_639.descriptor() != _M__sNil)
				{
					break label_112;
				}
				/* #term=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_46));
				sink.start(_M_SendMatchPropertyList);
				sink.start(_M_OK);
				sink.end();
				sink.start(_M_DesugarPropertyList);
				sink.copy(sub_221.ref());
				sink.end();
				sink.copy(term_1759.ref());
				Variable var_228 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_228});
				VariableUse use_8 = sink.context().makeVariableUse(var_228);
				sink.substitute(term_1715.ref(), new Variable[]
					{var_223}, new Term[]
					{use_8});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendMatchMaybeProperties, props_46, term_1315, term_1759, var_223, term_1715);
	}

	final public static boolean _M_SendMatchFreeTerm(Sink sink, int shared, int depth, Properties props_171, Term term_1407, Term term_1367, Variable var_306, Term term_1537)
	{
		if (depth < 2000)
		{
			label_226 :
			{
				Term value_28 = props_171 == null ? null : props_171.lookup("$caselabel");
				if (value_28 == null)
				{
					break label_226;
				}
				if (value_28.descriptor() != _M_TEXT)
				{
					break label_226;
				}
				Term sub_365 = value_28.sub(0).ref();
				/* #label=sub */
				if (term_1407.descriptor() != _M_Crsx_xfreeTerm_xA1)
				{
					break label_226;
				}
				Term sub_229 = term_1407.sub(0).ref();
				/* #annotations?=sub */Term sub_321 = term_1407.sub(1).ref();
				/* #properties?=sub */Term sub_392 = term_1407.sub(2).ref();
				/* #constructor=sub */Term sub_190 = term_1407.sub(3).ref();
				/* #arguments?=sub */
				/* #term=term */
				/* #=term *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1760;
				{
					BufferSink buf_1576 = sink.context().makeBuffer();
					buf_1576.start(_M_STRING);
					buf_1576.literal(1);
					buf_1576.end();
					term_1760 = buf_1576.term();
				}
				sink.propertyNamed("$LineLocation", term_1760);
				Term term_1742;
				{
					BufferSink buf_1724 = sink.context().makeBuffer();
					buf_1724.start(_M_STRING);
					buf_1724.literal(1);
					buf_1724.end();
					term_1742 = buf_1724.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1742);
				sink.start(_M__sTextCons);
				Term term_1319;
				{
					BufferSink buf_1857 = sink.context().makeBuffer();
					buf_1857.start(_M_STRING);
					buf_1857.literal(1);
					buf_1857.end();
					term_1319 = buf_1857.term();
				}
				sink.propertyNamed("$LineLocation", term_1319);
				Term term_1725;
				{
					BufferSink buf_1194 = sink.context().makeBuffer();
					buf_1194.start(_M_STRING);
					buf_1194.literal(1);
					buf_1194.end();
					term_1725 = buf_1194.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1725);
				sink.start(_M__sTextChars);
				sink.literal("if (");
				sink.end();
				Term term_1417;
				{
					BufferSink buf_1792 = sink.context().makeBuffer();
					buf_1792.start(_M_STRING);
					buf_1792.literal(1);
					buf_1792.end();
					term_1417 = buf_1792.term();
				}
				sink.propertyNamed("$LineLocation", term_1417);
				Term term_1499;
				{
					BufferSink buf_1434 = sink.context().makeBuffer();
					buf_1434.start(_M_STRING);
					buf_1434.literal(2);
					buf_1434.end();
					term_1499 = buf_1434.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1499);
				sink.start(_M__sTextCons);
				Term term_2087;
				{
					BufferSink buf_2498 = sink.context().makeBuffer();
					buf_2498.start(_M_STRING);
					buf_2498.literal(1);
					buf_2498.end();
					term_2087 = buf_2498.term();
				}
				sink.propertyNamed("$LineLocation", term_2087);
				Term term_1907;
				{
					BufferSink buf_1120 = sink.context().makeBuffer();
					buf_1120.start(_M_STRING);
					buf_1120.literal(2);
					buf_1120.end();
					term_1907 = buf_1120.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1907);
				sink.start(_M__sTextEmbed);
				Term term_1193;
				{
					BufferSink buf_2122 = sink.context().makeBuffer();
					buf_2122.start(_M_STRING);
					buf_2122.literal(1);
					buf_2122.end();
					term_1193 = buf_2122.term();
				}
				sink.propertyNamed("$LineLocation", term_1193);
				Term term_2268;
				{
					BufferSink buf_1919 = sink.context().makeBuffer();
					buf_1919.start(_M_STRING);
					buf_1919.literal(2);
					buf_1919.end();
					term_2268 = buf_1919.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2268);
				sink.start(_M_AsText);
				sink.copy(term_1367.ref());
				sink.end();
				sink.end();
				Term term_2130;
				{
					BufferSink buf_1515 = sink.context().makeBuffer();
					buf_1515.start(_M_STRING);
					buf_1515.literal(1);
					buf_1515.end();
					term_2130 = buf_1515.term();
				}
				sink.propertyNamed("$LineLocation", term_2130);
				Term term_2041;
				{
					BufferSink buf_1874 = sink.context().makeBuffer();
					buf_1874.start(_M_STRING);
					buf_1874.literal(6);
					buf_1874.end();
					term_2041 = buf_1874.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2041);
				sink.start(_M__sTextCons);
				Term term_1732;
				{
					BufferSink buf_1987 = sink.context().makeBuffer();
					buf_1987.start(_M_STRING);
					buf_1987.literal(1);
					buf_1987.end();
					term_1732 = buf_1987.term();
				}
				sink.propertyNamed("$LineLocation", term_1732);
				Term term_1302;
				{
					BufferSink buf_1889 = sink.context().makeBuffer();
					buf_1889.start(_M_STRING);
					buf_1889.literal(6);
					buf_1889.end();
					term_1302 = buf_1889.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1302);
				sink.start(_M__sTextChars);
				sink.literal(".descriptor() != ");
				sink.end();
				Term term_1968;
				{
					BufferSink buf_1450 = sink.context().makeBuffer();
					buf_1450.start(_M_STRING);
					buf_1450.literal(1);
					buf_1450.end();
					term_1968 = buf_1450.term();
				}
				sink.propertyNamed("$LineLocation", term_1968);
				Term term_2092;
				{
					BufferSink buf_1684 = sink.context().makeBuffer();
					buf_1684.start(_M_STRING);
					buf_1684.literal(13);
					buf_1684.end();
					term_2092 = buf_1684.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2092);
				sink.start(_M__sTextCons);
				Term term_1778;
				{
					BufferSink buf_1628 = sink.context().makeBuffer();
					buf_1628.start(_M_STRING);
					buf_1628.literal(1);
					buf_1628.end();
					term_1778 = buf_1628.term();
				}
				sink.propertyNamed("$LineLocation", term_1778);
				Term term_1926;
				{
					BufferSink buf_2408 = sink.context().makeBuffer();
					buf_2408.start(_M_STRING);
					buf_2408.literal(13);
					buf_2408.end();
					term_1926 = buf_2408.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1926);
				sink.start(_M__sTextEmbed);
				Term term_1795;
				{
					BufferSink buf_1341 = sink.context().makeBuffer();
					buf_1341.start(_M_STRING);
					buf_1341.literal(1);
					buf_1341.end();
					term_1795 = buf_1341.term();
				}
				sink.propertyNamed("$LineLocation", term_1795);
				Term term_1517;
				{
					BufferSink buf_1442 = sink.context().makeBuffer();
					buf_1442.start(_M_STRING);
					buf_1442.literal(13);
					buf_1442.end();
					term_1517 = buf_1442.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1517);
				sink.start(_M_AsText);
				sink.start(_M_Descriptor);
				sink.copy(sub_392.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_1751;
				{
					BufferSink buf_2123 = sink.context().makeBuffer();
					buf_2123.start(_M_STRING);
					buf_2123.literal(1);
					buf_2123.end();
					term_1751 = buf_2123.term();
				}
				sink.propertyNamed("$LineLocation", term_1751);
				Term term_1879;
				{
					BufferSink buf_1519 = sink.context().makeBuffer();
					buf_1519.start(_M_STRING);
					buf_1519.literal(30);
					buf_1519.end();
					term_1879 = buf_1519.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1879);
				sink.start(_M__sTextCons);
				Term term_1556;
				{
					BufferSink buf_2139 = sink.context().makeBuffer();
					buf_2139.start(_M_STRING);
					buf_2139.literal(1);
					buf_2139.end();
					term_1556 = buf_2139.term();
				}
				sink.propertyNamed("$LineLocation", term_1556);
				Term term_1901;
				{
					BufferSink buf_1743 = sink.context().makeBuffer();
					buf_1743.start(_M_STRING);
					buf_1743.literal(30);
					buf_1743.end();
					term_1901 = buf_1743.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1901);
				sink.start(_M__sTextChars);
				sink.literal(")");
				sink.end();
				Term term_1428;
				{
					BufferSink buf_1276 = sink.context().makeBuffer();
					buf_1276.start(_M_STRING);
					buf_1276.literal(1);
					buf_1276.end();
					term_1428 = buf_1276.term();
				}
				sink.propertyNamed("$LineLocation", term_1428);
				Term term_1802;
				{
					BufferSink buf_1554 = sink.context().makeBuffer();
					buf_1554.start(_M_STRING);
					buf_1554.literal(56);
					buf_1554.end();
					term_1802 = buf_1554.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1802);
				sink.start(_M__sTextCons);
				Term term_1271;
				{
					BufferSink buf_2053 = sink.context().makeBuffer();
					buf_2053.start(_M_STRING);
					buf_2053.literal(1);
					buf_2053.end();
					term_1271 = buf_2053.term();
				}
				sink.propertyNamed("$LineLocation", term_1271);
				Term term_1568;
				{
					BufferSink buf_1443 = sink.context().makeBuffer();
					buf_1443.start(_M_STRING);
					buf_1443.literal(56);
					buf_1443.end();
					term_1568 = buf_1443.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1568);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2056;
				{
					BufferSink buf_1875 = sink.context().makeBuffer();
					buf_1875.start(_M_STRING);
					buf_1875.literal(1);
					buf_1875.end();
					term_2056 = buf_1875.term();
				}
				sink.propertyNamed("$LineLocation", term_2056);
				Term term_1798;
				{
					BufferSink buf_1893 = sink.context().makeBuffer();
					buf_1893.start(_M_STRING);
					buf_1893.literal(57);
					buf_1893.end();
					term_1798 = buf_1893.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1798);
				sink.start(_M__sTextCons);
				Term term_1399;
				{
					BufferSink buf_1482 = sink.context().makeBuffer();
					buf_1482.start(_M_STRING);
					buf_1482.literal(1);
					buf_1482.end();
					term_1399 = buf_1482.term();
				}
				sink.propertyNamed("$LineLocation", term_1399);
				Term term_1606;
				{
					BufferSink buf_1786 = sink.context().makeBuffer();
					buf_1786.start(_M_STRING);
					buf_1786.literal(57);
					buf_1786.end();
					term_1606 = buf_1786.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1606);
				sink.start(_M__sTextChars);
				sink.literal("{");
				sink.end();
				Term term_2078;
				{
					BufferSink buf_1764 = sink.context().makeBuffer();
					buf_1764.start(_M_STRING);
					buf_1764.literal(2);
					buf_1764.end();
					term_2078 = buf_1764.term();
				}
				sink.propertyNamed("$LineLocation", term_2078);
				Term term_1204;
				{
					BufferSink buf_1989 = sink.context().makeBuffer();
					buf_1989.start(_M_STRING);
					buf_1989.literal(1);
					buf_1989.end();
					term_1204 = buf_1989.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1204);
				sink.start(_M__sTextCons);
				Term term_1689;
				{
					BufferSink buf_1771 = sink.context().makeBuffer();
					buf_1771.start(_M_STRING);
					buf_1771.literal(2);
					buf_1771.end();
					term_1689 = buf_1771.term();
				}
				sink.propertyNamed("$LineLocation", term_1689);
				Term term_2008;
				{
					BufferSink buf_1654 = sink.context().makeBuffer();
					buf_1654.start(_M_STRING);
					buf_1654.literal(2);
					buf_1654.end();
					term_2008 = buf_1654.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2008);
				sink.start(_M__sTextIndent);
				Term term_2029;
				{
					BufferSink buf_1622 = sink.context().makeBuffer();
					buf_1622.start(_M_STRING);
					buf_1622.literal(2);
					buf_1622.end();
					term_2029 = buf_1622.term();
				}
				sink.propertyNamed("$LineLocation", term_2029);
				Term term_1566;
				{
					BufferSink buf_1328 = sink.context().makeBuffer();
					buf_1328.start(_M_STRING);
					buf_1328.literal(2);
					buf_1328.end();
					term_1566 = buf_1328.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1566);
				sink.start(_M__sTextCons);
				Term term_1520;
				{
					BufferSink buf_1448 = sink.context().makeBuffer();
					buf_1448.start(_M_STRING);
					buf_1448.literal(2);
					buf_1448.end();
					term_1520 = buf_1448.term();
				}
				sink.propertyNamed("$LineLocation", term_1520);
				Term term_1173;
				{
					BufferSink buf_1718 = sink.context().makeBuffer();
					buf_1718.start(_M_STRING);
					buf_1718.literal(2);
					buf_1718.end();
					term_1173 = buf_1718.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1173);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2034;
				{
					BufferSink buf_1492 = sink.context().makeBuffer();
					buf_1492.start(_M_STRING);
					buf_1492.literal(2);
					buf_1492.end();
					term_2034 = buf_1492.term();
				}
				sink.propertyNamed("$LineLocation", term_2034);
				Term term_1829;
				{
					BufferSink buf_2074 = sink.context().makeBuffer();
					buf_2074.start(_M_STRING);
					buf_2074.literal(3);
					buf_2074.end();
					term_1829 = buf_2074.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1829);
				sink.start(_M__sTextCons);
				Term term_2163;
				{
					BufferSink buf_1605 = sink.context().makeBuffer();
					buf_1605.start(_M_STRING);
					buf_1605.literal(2);
					buf_1605.end();
					term_2163 = buf_1605.term();
				}
				sink.propertyNamed("$LineLocation", term_2163);
				Term term_2068;
				{
					BufferSink buf_1205 = sink.context().makeBuffer();
					buf_1205.start(_M_STRING);
					buf_1205.literal(3);
					buf_1205.end();
					term_2068 = buf_1205.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2068);
				sink.start(_M__sTextChars);
				sink.literal("  break ");
				sink.end();
				Term term_1675;
				{
					BufferSink buf_1385 = sink.context().makeBuffer();
					buf_1385.start(_M_STRING);
					buf_1385.literal(3);
					buf_1385.end();
					term_1675 = buf_1385.term();
				}
				sink.propertyNamed("$LineLocation", term_1675);
				Term term_3058;
				{
					BufferSink buf_1630 = sink.context().makeBuffer();
					buf_1630.start(_M_STRING);
					buf_1630.literal(1);
					buf_1630.end();
					term_3058 = buf_1630.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3058);
				sink.start(_M__sTextCons);
				Term term_1832;
				{
					BufferSink buf_1614 = sink.context().makeBuffer();
					buf_1614.start(_M_STRING);
					buf_1614.literal(3);
					buf_1614.end();
					term_1832 = buf_1614.term();
				}
				sink.propertyNamed("$LineLocation", term_1832);
				Term term_2654;
				{
					BufferSink buf_2247 = sink.context().makeBuffer();
					buf_2247.start(_M_STRING);
					buf_2247.literal(1);
					buf_2247.end();
					term_2654 = buf_2247.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2654);
				sink.start(_M__sTextEmbed);
				Term term_1341;
				{
					BufferSink buf_1256 = sink.context().makeBuffer();
					buf_1256.start(_M_STRING);
					buf_1256.literal(3);
					buf_1256.end();
					term_1341 = buf_1256.term();
				}
				sink.propertyNamed("$LineLocation", term_1341);
				Term term_1641;
				{
					BufferSink buf_2039 = sink.context().makeBuffer();
					buf_2039.start(_M_STRING);
					buf_2039.literal(1);
					buf_2039.end();
					term_1641 = buf_2039.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1641);
				sink.start(_M_AsText);
				sink.copy(sub_365.ref());
				sink.end();
				sink.end();
				Term term_2822;
				{
					BufferSink buf_1934 = sink.context().makeBuffer();
					buf_1934.start(_M_STRING);
					buf_1934.literal(3);
					buf_1934.end();
					term_2822 = buf_1934.term();
				}
				sink.propertyNamed("$LineLocation", term_2822);
				Term term_1009;
				{
					BufferSink buf_1574 = sink.context().makeBuffer();
					buf_1574.start(_M_STRING);
					buf_1574.literal(9);
					buf_1574.end();
					term_1009 = buf_1574.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1009);
				sink.start(_M__sTextCons);
				Term term_1890;
				{
					BufferSink buf_2078 = sink.context().makeBuffer();
					buf_2078.start(_M_STRING);
					buf_2078.literal(3);
					buf_2078.end();
					term_1890 = buf_2078.term();
				}
				sink.propertyNamed("$LineLocation", term_1890);
				Term term_1309;
				{
					BufferSink buf_1219 = sink.context().makeBuffer();
					buf_1219.start(_M_STRING);
					buf_1219.literal(9);
					buf_1219.end();
					term_1309 = buf_1219.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1309);
				sink.start(_M__sTextChars);
				sink.literal(";");
				sink.end();
				Term term_1301;
				{
					BufferSink buf_1416 = sink.context().makeBuffer();
					buf_1416.start(_M_STRING);
					buf_1416.literal(3);
					buf_1416.end();
					term_1301 = buf_1416.term();
				}
				sink.propertyNamed("$LineLocation", term_1301);
				Term term_1552;
				{
					BufferSink buf_1148 = sink.context().makeBuffer();
					buf_1148.start(_M_STRING);
					buf_1148.literal(17);
					buf_1148.end();
					term_1552 = buf_1148.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1552);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				Term term_1908;
				{
					BufferSink buf_2128 = sink.context().makeBuffer();
					buf_2128.start(_M_STRING);
					buf_2128.literal(3);
					buf_2128.end();
					term_1908 = buf_2128.term();
				}
				sink.propertyNamed("$LineLocation", term_1908);
				Term term_1012;
				{
					BufferSink buf_2401 = sink.context().makeBuffer();
					buf_2401.start(_M_STRING);
					buf_2401.literal(18);
					buf_2401.end();
					term_1012 = buf_2401.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1012);
				sink.start(_M__sTextCons);
				Term term_1705;
				{
					BufferSink buf_1735 = sink.context().makeBuffer();
					buf_1735.start(_M_STRING);
					buf_1735.literal(3);
					buf_1735.end();
					term_1705 = buf_1735.term();
				}
				sink.propertyNamed("$LineLocation", term_1705);
				Term term_1549;
				{
					BufferSink buf_1077 = sink.context().makeBuffer();
					buf_1077.start(_M_STRING);
					buf_1077.literal(18);
					buf_1077.end();
					term_1549 = buf_1077.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1549);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1533;
				{
					BufferSink buf_1748 = sink.context().makeBuffer();
					buf_1748.start(_M_STRING);
					buf_1748.literal(3);
					buf_1748.end();
					term_1533 = buf_1748.term();
				}
				sink.propertyNamed("$LineLocation", term_1533);
				Term term_1536;
				{
					BufferSink buf_1981 = sink.context().makeBuffer();
					buf_1981.start(_M_STRING);
					buf_1981.literal(19);
					buf_1981.end();
					term_1536 = buf_1981.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1536);
				sink.start(_M__sTextCons);
				Term term_1069;
				{
					BufferSink buf_1657 = sink.context().makeBuffer();
					buf_1657.start(_M_STRING);
					buf_1657.literal(3);
					buf_1657.end();
					term_1069 = buf_1657.term();
				}
				sink.propertyNamed("$LineLocation", term_1069);
				Term term_1512;
				{
					BufferSink buf_1842 = sink.context().makeBuffer();
					buf_1842.start(_M_STRING);
					buf_1842.literal(19);
					buf_1842.end();
					term_1512 = buf_1842.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1512);
				sink.start(_M__sTextChars);
				sink.literal("}");
				sink.end();
				Term term_2100;
				{
					BufferSink buf_1883 = sink.context().makeBuffer();
					buf_1883.start(_M_STRING);
					buf_1883.literal(4);
					buf_1883.end();
					term_2100 = buf_1883.term();
				}
				sink.propertyNamed("$LineLocation", term_2100);
				Term term_1827;
				{
					BufferSink buf_2029 = sink.context().makeBuffer();
					buf_2029.start(_M_STRING);
					buf_2029.literal(1);
					buf_2029.end();
					term_1827 = buf_2029.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1827);
				sink.start(_M__sTextCons);
				Term term_1298;
				{
					BufferSink buf_1668 = sink.context().makeBuffer();
					buf_1668.start(_M_STRING);
					buf_1668.literal(4);
					buf_1668.end();
					term_1298 = buf_1668.term();
				}
				sink.propertyNamed("$LineLocation", term_1298);
				Term term_1521;
				{
					BufferSink buf_1550 = sink.context().makeBuffer();
					buf_1550.start(_M_STRING);
					buf_1550.literal(1);
					buf_1550.end();
					term_1521 = buf_1550.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1521);
				sink.start(_M__sTextEmbed);
				Term term_1605;
				{
					BufferSink buf_1924 = sink.context().makeBuffer();
					buf_1924.start(_M_STRING);
					buf_1924.literal(4);
					buf_1924.end();
					term_1605 = buf_1924.term();
				}
				sink.propertyNamed("$LineLocation", term_1605);
				Term term_1385;
				{
					BufferSink buf_1179 = sink.context().makeBuffer();
					buf_1179.start(_M_STRING);
					buf_1179.literal(1);
					buf_1179.end();
					term_1385 = buf_1179.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1385);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_171));
				sink.start(_M_SendMatchMaybeProperties);
				sink.copy(sub_321.ref());
				sink.copy(term_1367.ref());
				Variable var_45 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_45});
				sink.start(_M_SendMatchMaybeArguments);
				sink.use(var_45);
				sink.copy(sub_190.ref());
				sink.copy(term_1367.ref());
				Variable var_2 = sink.context().makeVariable("ok_6");
				sink.binds(new Variable[]
					{var_2});
				VariableUse use_55 = sink.context().makeVariableUse(var_2);
				sink.substitute(term_1537.ref(), new Variable[]
					{var_306}, new Term[]
					{use_55});
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				Term term_2114;
				{
					BufferSink buf_2075 = sink.context().makeBuffer();
					buf_2075.start(_M_STRING);
					buf_2075.literal(4);
					buf_2075.end();
					term_2114 = buf_2075.term();
				}
				sink.propertyNamed("$LineLocation", term_2114);
				Term term_1756;
				{
					BufferSink buf_849 = sink.context().makeBuffer();
					buf_849.start(_M_STRING);
					buf_849.literal(2);
					buf_849.end();
					term_1756 = buf_849.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1756);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_11 :
			{
				if (term_1407.descriptor() != _M_Crsx_xfreeTerm_xA3)
				{
					break label_11;
				}
				Term sub_174 = term_1407.sub(0).ref();
				/* #annotations?=sub */Term sub_387 = term_1407.sub(1).ref();
				/* #properties?=sub */Term sub_326 = term_1407.sub(2).ref();
				/* #literal=sub */
				/* #term=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_171));
				Term term_1132;
				{
					BufferSink buf_1737 = sink.context().makeBuffer();
					buf_1737.start(_M_OK);
					buf_1737.end();
					term_1132 = buf_1737.term();
				}
				sink.substitute(term_1537.ref(), new Variable[]
					{var_306}, new Term[]
					{term_1132});
				return true;
			}
			label_2 :
			{
				if (term_1407.descriptor() != _M_Crsx_xfreeTerm_xA7)
				{
					break label_2;
				}
				Term sub_371 = term_1407.sub(0).ref();
				/* #annotations?=sub */Term sub_108 = term_1407.sub(1).ref();
				/* #properties?=sub */Term sub_474 = term_1407.sub(2).ref();
				/* #METAVAR=sub */Term sub_423 = term_1407.sub(3).ref();
				/* #freeArguments?=sub */
				/* #term=term */
				/* #=term *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2601;
				{
					BufferSink buf_1887 = sink.context().makeBuffer();
					buf_1887.start(_M_STRING);
					buf_1887.literal(1);
					buf_1887.end();
					term_2601 = buf_1887.term();
				}
				sink.propertyNamed("$LineLocation", term_2601);
				Term term_1720;
				{
					BufferSink buf_1420 = sink.context().makeBuffer();
					buf_1420.start(_M_STRING);
					buf_1420.literal(1);
					buf_1420.end();
					term_1720 = buf_1420.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1720);
				sink.start(_M__sTextCons);
				Term term_2346;
				{
					BufferSink buf_1793 = sink.context().makeBuffer();
					buf_1793.start(_M_STRING);
					buf_1793.literal(1);
					buf_1793.end();
					term_2346 = buf_1793.term();
				}
				sink.propertyNamed("$LineLocation", term_2346);
				Term term_1525;
				{
					BufferSink buf_1901 = sink.context().makeBuffer();
					buf_1901.start(_M_STRING);
					buf_1901.literal(1);
					buf_1901.end();
					term_1525 = buf_1901.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1525);
				sink.start(_M__sTextChars);
				sink.literal("/* ");
				sink.end();
				Term term_1959;
				{
					BufferSink buf_1695 = sink.context().makeBuffer();
					buf_1695.start(_M_STRING);
					buf_1695.literal(1);
					buf_1695.end();
					term_1959 = buf_1695.term();
				}
				sink.propertyNamed("$LineLocation", term_1959);
				Term term_1729;
				{
					BufferSink buf_1304 = sink.context().makeBuffer();
					buf_1304.start(_M_STRING);
					buf_1304.literal(2);
					buf_1304.end();
					term_1729 = buf_1304.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1729);
				sink.start(_M__sTextCons);
				Term term_2590;
				{
					BufferSink buf_2018 = sink.context().makeBuffer();
					buf_2018.start(_M_STRING);
					buf_2018.literal(1);
					buf_2018.end();
					term_2590 = buf_2018.term();
				}
				sink.propertyNamed("$LineLocation", term_2590);
				Term term_1799;
				{
					BufferSink buf_2662 = sink.context().makeBuffer();
					buf_2662.start(_M_STRING);
					buf_2662.literal(2);
					buf_2662.end();
					term_1799 = buf_2662.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1799);
				sink.start(_M__sTextEmbed);
				Term term_1350;
				{
					BufferSink buf_1881 = sink.context().makeBuffer();
					buf_1881.start(_M_STRING);
					buf_1881.literal(1);
					buf_1881.end();
					term_1350 = buf_1881.term();
				}
				sink.propertyNamed("$LineLocation", term_1350);
				Term term_1985;
				{
					BufferSink buf_1579 = sink.context().makeBuffer();
					buf_1579.start(_M_STRING);
					buf_1579.literal(2);
					buf_1579.end();
					term_1985 = buf_1579.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1985);
				sink.start(_M_AsText);
				sink.start(_M_Text_CommentToken);
				sink.copy(sub_474.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_1884;
				{
					BufferSink buf_2031 = sink.context().makeBuffer();
					buf_2031.start(_M_STRING);
					buf_2031.literal(1);
					buf_2031.end();
					term_1884 = buf_2031.term();
				}
				sink.propertyNamed("$LineLocation", term_1884);
				Term term_1807;
				{
					BufferSink buf_1682 = sink.context().makeBuffer();
					buf_1682.start(_M_STRING);
					buf_1682.literal(5);
					buf_1682.end();
					term_1807 = buf_1682.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1807);
				sink.start(_M__sTextCons);
				Term term_1426;
				{
					BufferSink buf_1583 = sink.context().makeBuffer();
					buf_1583.start(_M_STRING);
					buf_1583.literal(1);
					buf_1583.end();
					term_1426 = buf_1583.term();
				}
				sink.propertyNamed("$LineLocation", term_1426);
				Term term_1937;
				{
					BufferSink buf_1845 = sink.context().makeBuffer();
					buf_1845.start(_M_STRING);
					buf_1845.literal(5);
					buf_1845.end();
					term_1937 = buf_1845.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1937);
				sink.start(_M__sTextChars);
				sink.literal("=");
				sink.end();
				Term term_1141;
				{
					BufferSink buf_1551 = sink.context().makeBuffer();
					buf_1551.start(_M_STRING);
					buf_1551.literal(1);
					buf_1551.end();
					term_1141 = buf_1551.term();
				}
				sink.propertyNamed("$LineLocation", term_1141);
				Term term_1660;
				{
					BufferSink buf_1126 = sink.context().makeBuffer();
					buf_1126.start(_M_STRING);
					buf_1126.literal(34);
					buf_1126.end();
					term_1660 = buf_1126.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1660);
				sink.start(_M__sTextCons);
				Term term_2017;
				{
					BufferSink buf_1171 = sink.context().makeBuffer();
					buf_1171.start(_M_STRING);
					buf_1171.literal(1);
					buf_1171.end();
					term_2017 = buf_1171.term();
				}
				sink.propertyNamed("$LineLocation", term_2017);
				Term term_2145;
				{
					BufferSink buf_1048 = sink.context().makeBuffer();
					buf_1048.start(_M_STRING);
					buf_1048.literal(34);
					buf_1048.end();
					term_2145 = buf_1048.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2145);
				sink.start(_M__sTextEmbed);
				Term term_1232;
				{
					BufferSink buf_1278 = sink.context().makeBuffer();
					buf_1278.start(_M_STRING);
					buf_1278.literal(1);
					buf_1278.end();
					term_1232 = buf_1278.term();
				}
				sink.propertyNamed("$LineLocation", term_1232);
				Term term_1977;
				{
					BufferSink buf_1700 = sink.context().makeBuffer();
					buf_1700.start(_M_STRING);
					buf_1700.literal(34);
					buf_1700.end();
					term_1977 = buf_1700.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1977);
				sink.start(_M_AsText);
				sink.start(_M_Text_CommentToken);
				sink.start(_M__s);
				sink.start(_M_Builtin_sShow);
				sink.end();
				sink.copy(term_1367.ref());
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				Term term_1237;
				{
					BufferSink buf_1941 = sink.context().makeBuffer();
					buf_1941.start(_M_STRING);
					buf_1941.literal(1);
					buf_1941.end();
					term_1237 = buf_1941.term();
				}
				sink.propertyNamed("$LineLocation", term_1237);
				Term term_2018;
				{
					BufferSink buf_1702 = sink.context().makeBuffer();
					buf_1702.start(_M_STRING);
					buf_1702.literal(35);
					buf_1702.end();
					term_2018 = buf_1702.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2018);
				sink.start(_M__sTextCons);
				Term term_1704;
				{
					BufferSink buf_1410 = sink.context().makeBuffer();
					buf_1410.start(_M_STRING);
					buf_1410.literal(1);
					buf_1410.end();
					term_1704 = buf_1410.term();
				}
				sink.propertyNamed("$LineLocation", term_1704);
				Term term_1744;
				{
					BufferSink buf_1301 = sink.context().makeBuffer();
					buf_1301.start(_M_STRING);
					buf_1301.literal(35);
					buf_1301.end();
					term_1744 = buf_1301.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1744);
				sink.start(_M__sTextChars);
				sink.literal(" */");
				sink.end();
				Term term_1699;
				{
					BufferSink buf_1601 = sink.context().makeBuffer();
					buf_1601.start(_M_STRING);
					buf_1601.literal(1);
					buf_1601.end();
					term_1699 = buf_1601.term();
				}
				sink.propertyNamed("$LineLocation", term_1699);
				Term term_1490;
				{
					BufferSink buf_1411 = sink.context().makeBuffer();
					buf_1411.start(_M_STRING);
					buf_1411.literal(70);
					buf_1411.end();
					term_1490 = buf_1411.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1490);
				sink.start(_M__sTextCons);
				Term term_2339;
				{
					BufferSink buf_1674 = sink.context().makeBuffer();
					buf_1674.start(_M_STRING);
					buf_1674.literal(1);
					buf_1674.end();
					term_2339 = buf_1674.term();
				}
				sink.propertyNamed("$LineLocation", term_2339);
				Term term_1653;
				{
					BufferSink buf_2293 = sink.context().makeBuffer();
					buf_2293.start(_M_STRING);
					buf_2293.literal(70);
					buf_2293.end();
					term_1653 = buf_2293.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1653);
				sink.start(_M__sTextEmbed);
				Term term_1940;
				{
					BufferSink buf_1419 = sink.context().makeBuffer();
					buf_1419.start(_M_STRING);
					buf_1419.literal(1);
					buf_1419.end();
					term_1940 = buf_1419.term();
				}
				sink.propertyNamed("$LineLocation", term_1940);
				Term term_1930;
				{
					BufferSink buf_1602 = sink.context().makeBuffer();
					buf_1602.start(_M_STRING);
					buf_1602.literal(70);
					buf_1602.end();
					term_1930 = buf_1602.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1930);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_171));
				sink.start(_M_SendMatchMeta);
				sink.start(_M_MetaKey);
				sink.copy(sub_474.ref());
				sink.end();
				sink.copy(term_1367.ref());
				Variable var_177 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_177});
				VariableUse use_63 = sink.context().makeVariableUse(var_177);
				sink.substitute(term_1537.ref(), new Variable[]
					{var_306}, new Term[]
					{use_63});
				sink.end();
				sink.end();
				sink.end();
				Term term_1586;
				{
					BufferSink buf_1841 = sink.context().makeBuffer();
					buf_1841.start(_M_STRING);
					buf_1841.literal(1);
					buf_1841.end();
					term_1586 = buf_1841.term();
				}
				sink.propertyNamed("$LineLocation", term_1586);
				Term term_2218;
				{
					BufferSink buf_1975 = sink.context().makeBuffer();
					buf_1975.start(_M_STRING);
					buf_1975.literal(73);
					buf_1975.end();
					term_2218 = buf_1975.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2218);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendMatchFreeTerm, props_171, term_1407, term_1367, var_306, term_1537);
	}

	final public static boolean _M_SendMatchTerm(Sink sink, int shared, int depth, Properties props_19, Term term_2354, Term term_1640, Term term_2171, Term term_2208, Variable var_167, Term term_1308)
	{
		if (depth < 2000)
		{
			label_188 :
			{
				if (term_2354.descriptor() != _M_Crsx_xterm_xA1)
				{
					break label_188;
				}
				Term sub_127 = term_2354.sub(0).ref();
				/* #freeTerm=sub */
				/* #parent=term */
				/* #term=term */
				/* #termpos=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_19));
				Term term_1963;
				{
					BufferSink buf_1528 = sink.context().makeBuffer();
					buf_1528.start(_M_TEXTS);
					buf_1528.start(_M__sNil);
					buf_1528.end();
					buf_1528.end();
					term_1963 = buf_1528.term();
				}
				sink.propertyNamed("$binders", term_1963);
				sink.start(_M_SendMatchFreeTerm);
				sink.copy(sub_127.ref());
				sink.copy(term_2171.ref());
				Variable var_18 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_18});
				VariableUse use_58 = sink.context().makeVariableUse(var_18);
				sink.substitute(term_1308.ref(), new Variable[]
					{var_167}, new Term[]
					{use_58});
				sink.end();
				return true;
			}
			label_189 :
			{
				if (term_2354.descriptor() != _M_Crsx_xterm_xA2)
				{
					break label_189;
				}
				Term sub_107 = term_2354.sub(0).ref();
				if (sub_107.descriptor() != _M_Crsx_xboundTerm)
				{
					break label_189;
				}
				Term sub_386 = sub_107.sub(0).ref();
				/* #binder=sub */Term sub_464 = sub_107.sub(1).ref();
				/* #nextBinder=sub */
				if (term_1640.descriptor() != _M_NONE)
				{
					break label_189;
				}
				/* #term=term */
				/* #termpos=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_19));
				sink.start(_M_SendMatchNextBinder);
				sink.start(_M_Crsx_xnextBinder_xA1);
				sink.copy(sub_386.ref());
				sink.copy(sub_464.ref());
				sink.end();
				sink.start(_M_NONE);
				sink.end();
				sink.copy(term_2171.ref());
				sink.copy(term_2208.ref());
				sink.literal(0);
				Variable var_335 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_335});
				VariableUse use_78 = sink.context().makeVariableUse(var_335);
				sink.substitute(term_1308.ref(), new Variable[]
					{var_167}, new Term[]
					{use_78});
				sink.end();
				return true;
			}
			label_164 :
			{
				if (term_2354.descriptor() != _M_Crsx_xterm_xA2)
				{
					break label_164;
				}
				Term sub_309 = term_2354.sub(0).ref();
				if (sub_309.descriptor() != _M_Crsx_xboundTerm)
				{
					break label_164;
				}
				Term sub_342 = sub_309.sub(0).ref();
				/* #binder=sub */Term sub_497 = sub_309.sub(1).ref();
				/* #nextBinder=sub */
				if (term_1640.descriptor() != _M_SOME)
				{
					break label_164;
				}
				Term sub_589 = term_1640.sub(0).ref();
				/* #parent=sub */
				/* #term=term */
				/* #termpos=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_19));
				Term term_1881;
				{
					BufferSink buf_1955 = sink.context().makeBuffer();
					buf_1955.start(_M_TEXTS);
					buf_1955.start(_M__sNil);
					buf_1955.end();
					buf_1955.end();
					term_1881 = buf_1955.term();
				}
				sink.propertyNamed("$binders", term_1881);
				sink.start(_M_SendMatchNextBinder);
				sink.start(_M_Crsx_xnextBinder_xA1);
				sink.copy(sub_342.ref());
				sink.copy(sub_497.ref());
				sink.end();
				sink.start(_M_SOME);
				sink.copy(sub_589.ref());
				sink.end();
				sink.copy(term_2171.ref());
				sink.copy(term_2208.ref());
				sink.literal(0);
				Variable var_22 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_22});
				VariableUse use_7 = sink.context().makeVariableUse(var_22);
				sink.substitute(term_1308.ref(), new Variable[]
					{var_167}, new Term[]
					{use_7});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendMatchTerm, props_19, term_2354, term_1640, term_2171, term_2208, var_167, term_1308);
	}

	final public static boolean _M_SendMatchTopArguments(Sink sink, int shared, int depth, Properties props_80, Term term_1764, Term term_1506, Term term_1836, Variable var_38, Term term_1239)
	{
		if (depth < 2000)
		{
			label_292 :
			{
				if (term_1764.descriptor() != _M_OK)
				{
					break label_292;
				}
				if (term_1506.descriptor() != _M__sNil)
				{
					break label_292;
				}
				/* #position=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_80));
				Term term_1707;
				{
					BufferSink buf_2154 = sink.context().makeBuffer();
					buf_2154.start(_M_OK);
					buf_2154.end();
					term_1707 = buf_2154.term();
				}
				sink.substitute(term_1239.ref(), new Variable[]
					{var_38}, new Term[]
					{term_1707});
				return true;
			}
			label_149 :
			{
				if (term_1764.descriptor() != _M_OK)
				{
					break label_149;
				}
				if (term_1506.descriptor() != _M__sCons)
				{
					break label_149;
				}
				Term sub_181 = term_1506.sub(0).ref();
				if (sub_181.descriptor() != _M_Crsx_xterms_xS1)
				{
					break label_149;
				}
				Term sub_374 = sub_181.sub(0).ref();
				Term sub_297 = sub_181.sub(1).ref();
				/* #term=sub */Term sub_307 = term_1506.sub(1).ref();
				/* #terms_S1*=sub */
				/* #position=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_80));
				Term term_2329;
				{
					BufferSink buf_1779 = sink.context().makeBuffer();
					buf_1779.start(_M_TEXTS);
					buf_1779.properties(safeRef(props_80));
					buf_1779.start(_M_DispatchedMetaVarBinders);
					buf_1779.copy(term_1836.ref());
					buf_1779.end();
					buf_1779.end();
					term_2329 = buf_1779.term();
				}
				sink.propertyNamed("$binders", term_2329);
				Term term_1777;
				{
					BufferSink buf_1446 = sink.context().makeBuffer();
					buf_1446.start(_M_NO);
					buf_1446.end();
					term_1777 = buf_1446.term();
				}
				sink.propertyNamed("$top-props", term_1777);
				sink.start(_M_SendMatchTerm);
				sink.copy(sub_297.ref());
				sink.start(_M_NONE);
				sink.end();
				sink.properties(safeRef(props_80));
				sink.start(_M_DispatchedMetaVar);
				sink.copy(term_1836.ref());
				sink.end();
				sink.copy(term_1836.ref());
				Variable var_44 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_44});
				sink.start(_M_SendMatchTopArguments);
				sink.use(var_44);
				sink.copy(sub_307.ref());
				sink.start(_M__s);
				sink.start(_M_Builtin_sPlus);
				sink.end();
				sink.copy(term_1836.ref());
				sink.literal(1);
				sink.end();
				Variable var_158 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_158});
				VariableUse use_37 = sink.context().makeVariableUse(var_158);
				sink.substitute(term_1239.ref(), new Variable[]
					{var_38}, new Term[]
					{use_37});
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendMatchTopArguments, props_80, term_1764, term_1506, term_1836, var_38, term_1239);
	}

	final public static boolean _M_SendMatchTopMaybeProperties(Sink sink, int shared, int depth, Properties props_4, Term term_1700, Term term_2724, Variable var_89, Term term_1581)
	{
		if (depth < 2000)
		{
			label_133 :
			{
				if (term_1700.descriptor() != _M_OK)
				{
					break label_133;
				}
				if (term_2724.descriptor() != _M__sNil)
				{
					break label_133;
				}
				/* #=term *//*Contract*/sink.properties(safeRef(props_4));
				Term term_2429;
				{
					BufferSink buf_1359 = sink.context().makeBuffer();
					buf_1359.start(_M_OK);
					buf_1359.end();
					term_2429 = buf_1359.term();
				}
				sink.substitute(term_1581.ref(), new Variable[]
					{var_89}, new Term[]
					{term_2429});
				return true;
			}
			label_299 :
			{
				if (term_1700.descriptor() != _M_OK)
				{
					break label_299;
				}
				if (term_2724.descriptor() != _M__sCons)
				{
					break label_299;
				}
				Term sub_419 = term_2724.sub(0).ref();
				if (sub_419.descriptor() != _M_Crsx_xproperties)
				{
					break label_299;
				}
				Term sub_393 = sub_419.sub(0).ref();
				Term sub_343 = sub_419.sub(1).ref();
				if (sub_343.descriptor() != _M__sNil)
				{
					break label_299;
				}
				Term sub_515 = sub_419.sub(2).ref();
				Term sub_192 = term_2724.sub(1).ref();
				if (sub_192.descriptor() != _M__sNil)
				{
					break label_299;
				}
				/* #=term *//*Contract*/sink.properties(safeRef(props_4));
				Term term_2231;
				{
					BufferSink buf_1186 = sink.context().makeBuffer();
					buf_1186.start(_M_OK);
					buf_1186.end();
					term_2231 = buf_1186.term();
				}
				sink.substitute(term_1581.ref(), new Variable[]
					{var_89}, new Term[]
					{term_2231});
				return true;
			}
			label_36 :
			{
				if (term_1700.descriptor() != _M_OK)
				{
					break label_36;
				}
				if (term_2724.descriptor() != _M__sCons)
				{
					break label_36;
				}
				Term sub_139 = term_2724.sub(0).ref();
				if (sub_139.descriptor() != _M_Crsx_xproperties)
				{
					break label_36;
				}
				Term sub_235 = sub_139.sub(0).ref();
				Term sub_382 = sub_139.sub(1).ref();
				if (sub_382.descriptor() != _M__sCons)
				{
					break label_36;
				}
				Term sub_171 = sub_382.sub(0).ref();
				/* #propertyList=sub */Term sub_302 = sub_382.sub(1).ref();
				if (sub_302.descriptor() != _M__sNil)
				{
					break label_36;
				}
				Term sub_301 = sub_139.sub(2).ref();
				Term sub_359 = term_2724.sub(1).ref();
				if (sub_359.descriptor() != _M__sNil)
				{
					break label_36;
				}
				/* #=term *//*Contract*/sink.properties(safeRef(props_4));
				Term term_2290;
				{
					BufferSink buf_1782 = sink.context().makeBuffer();
					buf_1782.start(_M_YES);
					buf_1782.end();
					term_2290 = buf_1782.term();
				}
				sink.propertyNamed("$top-props", term_2290);
				sink.start(_M_SendMatchPropertyList);
				sink.start(_M_OK);
				sink.end();
				sink.start(_M_DesugarPropertyList);
				sink.copy(sub_171.ref());
				sink.end();
				sink.start(_M__sTextNil);
				sink.end();
				Variable var_90 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_90});
				VariableUse use_74 = sink.context().makeVariableUse(var_90);
				sink.substitute(term_1581.ref(), new Variable[]
					{var_89}, new Term[]
					{use_74});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendMatchTopMaybeProperties, props_4, term_1700, term_2724, var_89, term_1581);
	}

	final public static boolean _M_SendDispatchCase(Sink sink, int shared, int depth, Properties props_65, Term term_2416)
	{
		if (depth < 2000)
		{
			label_144 :
			{
				if (term_2416.descriptor() != _M_Crsx_xdispatchCase)
				{
					break label_144;
				}
				Term sub_209 = term_2416.sub(0).ref();
				if (sub_209.descriptor() != _M_Crsx_xruleDeclaration)
				{
					break label_144;
				}
				Term sub_300 = sub_209.sub(0).ref();
				/* #option?=sub */Term sub_512 = sub_209.sub(1).ref();
				if (sub_512.descriptor() != _M_Crsx_xpattern)
				{
					break label_144;
				}
				Term sub_522 = sub_512.sub(0).ref();
				/* #properties?=sub */Term sub_523 = sub_512.sub(1).ref();
				/* #constructor=sub */Term sub_438 = sub_512.sub(2).ref();
				if (sub_438.descriptor() != _M__sCons)
				{
					break label_144;
				}
				Term sub_314 = sub_438.sub(0).ref();
				if (sub_314.descriptor() != _M_Crsx_xarguments)
				{
					break label_144;
				}
				Term sub_688 = sub_314.sub(0).ref();
				Term sub_665 = sub_314.sub(1).ref();
				if (sub_665.descriptor() != _M__sCons)
				{
					break label_144;
				}
				Term sub_554 = sub_665.sub(0).ref();
				/* #terms=sub */Term sub_263 = sub_665.sub(1).ref();
				if (sub_263.descriptor() != _M__sNil)
				{
					break label_144;
				}
				Term sub_478 = sub_314.sub(2).ref();
				Term sub_244 = sub_438.sub(1).ref();
				if (sub_244.descriptor() != _M__sNil)
				{
					break label_144;
				}
				Term sub_232 = sub_209.sub(2).ref();
				Term sub_336 = sub_209.sub(3).ref();
				if (sub_336.descriptor() != _M_Crsx_xcontractum)
				{
					break label_144;
				}
				Term sub_131 = sub_336.sub(0).ref();
				/* #freeTerm=sub *//*Contract*/
				Variable var_142 = sink.context().makeVariable("label");
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2053;
				{
					BufferSink buf_1930 = sink.context().makeBuffer();
					buf_1930.start(_M_STRING);
					buf_1930.literal(1);
					buf_1930.end();
					term_2053 = buf_1930.term();
				}
				sink.propertyNamed("$LineLocation", term_2053);
				Term term_1466;
				{
					BufferSink buf_1245 = sink.context().makeBuffer();
					buf_1245.start(_M_STRING);
					buf_1245.literal(1);
					buf_1245.end();
					term_1466 = buf_1245.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1466);
				sink.start(_M__sTextCons);
				Term term_1788;
				{
					BufferSink buf_2282 = sink.context().makeBuffer();
					buf_2282.start(_M_STRING);
					buf_2282.literal(1);
					buf_2282.end();
					term_1788 = buf_2282.term();
				}
				sink.propertyNamed("$LineLocation", term_1788);
				Term term_1855;
				{
					BufferSink buf_1591 = sink.context().makeBuffer();
					buf_1591.start(_M_STRING);
					buf_1591.literal(1);
					buf_1591.end();
					term_1855 = buf_1591.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1855);
				sink.start(_M__sTextEmbed);
				Term term_1371;
				{
					BufferSink buf_2112 = sink.context().makeBuffer();
					buf_2112.start(_M_STRING);
					buf_2112.literal(1);
					buf_2112.end();
					term_1371 = buf_2112.term();
				}
				sink.propertyNamed("$LineLocation", term_1371);
				Term term_1672;
				{
					BufferSink buf_1754 = sink.context().makeBuffer();
					buf_1754.start(_M_STRING);
					buf_1754.literal(1);
					buf_1754.end();
					term_1672 = buf_1754.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1672);
				sink.start(_M_AsText);
				sink.use(var_142);
				sink.end();
				sink.end();
				Term term_2573;
				{
					BufferSink buf_1993 = sink.context().makeBuffer();
					buf_1993.start(_M_STRING);
					buf_1993.literal(1);
					buf_1993.end();
					term_2573 = buf_1993.term();
				}
				sink.propertyNamed("$LineLocation", term_2573);
				Term term_1949;
				{
					BufferSink buf_1510 = sink.context().makeBuffer();
					buf_1510.start(_M_STRING);
					buf_1510.literal(2);
					buf_1510.end();
					term_1949 = buf_1510.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1949);
				sink.start(_M__sTextCons);
				Term term_1230;
				{
					BufferSink buf_2073 = sink.context().makeBuffer();
					buf_2073.start(_M_STRING);
					buf_2073.literal(1);
					buf_2073.end();
					term_1230 = buf_2073.term();
				}
				sink.propertyNamed("$LineLocation", term_1230);
				Term term_2242;
				{
					BufferSink buf_1828 = sink.context().makeBuffer();
					buf_1828.start(_M_STRING);
					buf_1828.literal(2);
					buf_1828.end();
					term_2242 = buf_1828.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2242);
				sink.start(_M__sTextChars);
				sink.literal(": {");
				sink.end();
				Term term_1692;
				{
					BufferSink buf_1687 = sink.context().makeBuffer();
					buf_1687.start(_M_STRING);
					buf_1687.literal(1);
					buf_1687.end();
					term_1692 = buf_1687.term();
				}
				sink.propertyNamed("$LineLocation", term_1692);
				Term term_1396;
				{
					BufferSink buf_1566 = sink.context().makeBuffer();
					buf_1566.start(_M_STRING);
					buf_1566.literal(9);
					buf_1566.end();
					term_1396 = buf_1566.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1396);
				sink.start(_M__sTextCons);
				Term term_2061;
				{
					BufferSink buf_2203 = sink.context().makeBuffer();
					buf_2203.start(_M_STRING);
					buf_2203.literal(1);
					buf_2203.end();
					term_2061 = buf_2203.term();
				}
				sink.propertyNamed("$LineLocation", term_2061);
				Term term_2158;
				{
					BufferSink buf_2062 = sink.context().makeBuffer();
					buf_2062.start(_M_STRING);
					buf_2062.literal(12);
					buf_2062.end();
					term_2158 = buf_2062.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2158);
				sink.start(_M__sTextIndent);
				Term term_2285;
				{
					BufferSink buf_1386 = sink.context().makeBuffer();
					buf_1386.start(_M_STRING);
					buf_1386.literal(1);
					buf_1386.end();
					term_2285 = buf_1386.term();
				}
				sink.propertyNamed("$LineLocation", term_2285);
				Term term_2561;
				{
					BufferSink buf_1655 = sink.context().makeBuffer();
					buf_1655.start(_M_STRING);
					buf_1655.literal(12);
					buf_1655.end();
					term_2561 = buf_1655.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2561);
				sink.start(_M__sTextCons);
				Term term_2402;
				{
					BufferSink buf_1886 = sink.context().makeBuffer();
					buf_1886.start(_M_STRING);
					buf_1886.literal(1);
					buf_1886.end();
					term_2402 = buf_1886.term();
				}
				sink.propertyNamed("$LineLocation", term_2402);
				Term term_1540;
				{
					BufferSink buf_1141 = sink.context().makeBuffer();
					buf_1141.start(_M_STRING);
					buf_1141.literal(12);
					buf_1141.end();
					term_1540 = buf_1141.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1540);
				sink.start(_M__sTextEmbed);
				Term term_1965;
				{
					BufferSink buf_1406 = sink.context().makeBuffer();
					buf_1406.start(_M_STRING);
					buf_1406.literal(1);
					buf_1406.end();
					term_1965 = buf_1406.term();
				}
				sink.propertyNamed("$LineLocation", term_1965);
				Term term_1856;
				{
					BufferSink buf_1979 = sink.context().makeBuffer();
					buf_1979.start(_M_STRING);
					buf_1979.literal(12);
					buf_1979.end();
					term_1856 = buf_1979.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1856);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_65));
				Term term_1400;
				{
					BufferSink buf_1593 = sink.context().makeBuffer();
					buf_1593.start(_M_TEXT);
					buf_1593.use(var_142);
					buf_1593.end();
					term_1400 = buf_1593.term();
				}
				sink.propertyNamed("$caselabel", term_1400);
				sink.start(_M_OptionOpt);
				sink.copy(sub_300.ref());
				Variable var_8 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_8});
				sink.start(_M_SendMatchTopMaybeProperties);
				sink.use(var_8);
				sink.copy(sub_522.ref());
				Variable var_211 = sink.context().makeVariable("ok_79");
				sink.binds(new Variable[]
					{var_211});
				sink.start(_M_SendMatchTopArguments);
				sink.use(var_211);
				sink.start(_M_DesugarTerms);
				sink.copy(sub_554.ref());
				sink.end();
				sink.literal(0);
				Variable var_134 = sink.context().makeVariable("ok_58");
				sink.binds(new Variable[]
					{var_134});
				sink.start(_M_SendContraction);
				sink.use(var_134);
				sink.copy(sub_131.ref());
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				Term term_2291;
				{
					BufferSink buf_1188 = sink.context().makeBuffer();
					buf_1188.start(_M_STRING);
					buf_1188.literal(1);
					buf_1188.end();
					term_2291 = buf_1188.term();
				}
				sink.propertyNamed("$LineLocation", term_2291);
				Term term_2186;
				{
					BufferSink buf_2606 = sink.context().makeBuffer();
					buf_2606.start(_M_STRING);
					buf_2606.literal(13);
					buf_2606.end();
					term_2186 = buf_2606.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2186);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				Term term_1865;
				{
					BufferSink buf_1236 = sink.context().makeBuffer();
					buf_1236.start(_M_STRING);
					buf_1236.literal(1);
					buf_1236.end();
					term_1865 = buf_1236.term();
				}
				sink.propertyNamed("$LineLocation", term_1865);
				Term term_1722;
				{
					BufferSink buf_1785 = sink.context().makeBuffer();
					buf_1785.start(_M_STRING);
					buf_1785.literal(204);
					buf_1785.end();
					term_1722 = buf_1785.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1722);
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1766;
				{
					BufferSink buf_1685 = sink.context().makeBuffer();
					buf_1685.start(_M_STRING);
					buf_1685.literal(1);
					buf_1685.end();
					term_1766 = buf_1685.term();
				}
				sink.propertyNamed("$LineLocation", term_1766);
				Term term_1454;
				{
					BufferSink buf_1790 = sink.context().makeBuffer();
					buf_1790.start(_M_STRING);
					buf_1790.literal(205);
					buf_1790.end();
					term_1454 = buf_1790.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1454);
				sink.start(_M__sTextCons);
				Term term_1210;
				{
					BufferSink buf_1517 = sink.context().makeBuffer();
					buf_1517.start(_M_STRING);
					buf_1517.literal(1);
					buf_1517.end();
					term_1210 = buf_1517.term();
				}
				sink.propertyNamed("$LineLocation", term_1210);
				Term term_1643;
				{
					BufferSink buf_1706 = sink.context().makeBuffer();
					buf_1706.start(_M_STRING);
					buf_1706.literal(205);
					buf_1706.end();
					term_1643 = buf_1706.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1643);
				sink.start(_M__sTextChars);
				sink.literal("}");
				sink.end();
				Term term_2194;
				{
					BufferSink buf_2150 = sink.context().makeBuffer();
					buf_2150.start(_M_STRING);
					buf_2150.literal(1);
					buf_2150.end();
					term_2194 = buf_2150.term();
				}
				sink.propertyNamed("$LineLocation", term_2194);
				Term term_1947;
				{
					BufferSink buf_1444 = sink.context().makeBuffer();
					buf_1444.start(_M_STRING);
					buf_1444.literal(206);
					buf_1444.end();
					term_1947 = buf_1444.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1947);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_78 :
			{
				/* #dispatchCase=term *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.start(_M__s);
				sink.start(_M_Builtin_sColon);
				sink.end();
				sink.literal("Internal error: dispatch case pattern must be of the form C[ ... ]. Got: ");
				sink.start(_M__s);
				sink.start(_M_Builtin_sShow);
				sink.end();
				sink.copy(term_2416.ref());
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendDispatchCase, props_65, term_2416);
	}

	final public static boolean _M_SendDispatchCases(Sink sink, int shared, int depth, Properties props_188, Term term_1611, Term term_1328)
	{
		if (depth < 2000)
		{
			label_170 :
			{
				if (term_1611.descriptor() != _M_OK)
				{
					break label_170;
				}
				if (term_1328.descriptor() != _M__sNil)
				{
					break label_170;
				}/*Contract*/
				sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
			label_53 :
			{
				if (term_1611.descriptor() != _M_OK)
				{
					break label_53;
				}
				if (term_1328.descriptor() != _M__sCons)
				{
					break label_53;
				}
				Term sub_216 = term_1328.sub(0).ref();
				if (sub_216.descriptor() != _M_Crsx_xdispatchCases_xS1)
				{
					break label_53;
				}
				Term sub_645 = sub_216.sub(0).ref();
				Term sub_322 = sub_216.sub(1).ref();
				/* #dispatchCase=sub */Term sub_207 = term_1328.sub(1).ref();
				/* #dispatchCases_S1*=sub *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextEmbed);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_188));
				sink.start(_M_SendDispatchCase);
				sink.copy(sub_322.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_1679;
				{
					BufferSink buf_1569 = sink.context().makeBuffer();
					buf_1569.start(_M_STRING);
					buf_1569.literal(1);
					buf_1569.end();
					term_1679 = buf_1569.term();
				}
				sink.propertyNamed("$LineLocation", term_1679);
				Term term_1834;
				{
					BufferSink buf_1774 = sink.context().makeBuffer();
					buf_1774.start(_M_STRING);
					buf_1774.literal(1);
					buf_1774.end();
					term_1834 = buf_1774.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1834);
				sink.start(_M__sTextCons);
				Term term_1211;
				{
					BufferSink buf_1912 = sink.context().makeBuffer();
					buf_1912.start(_M_STRING);
					buf_1912.literal(1);
					buf_1912.end();
					term_1211 = buf_1912.term();
				}
				sink.propertyNamed("$LineLocation", term_1211);
				Term term_1329;
				{
					BufferSink buf_2388 = sink.context().makeBuffer();
					buf_2388.start(_M_STRING);
					buf_2388.literal(1);
					buf_2388.end();
					term_1329 = buf_2388.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1329);
				sink.start(_M__sTextEmbed);
				Term term_1648;
				{
					BufferSink buf_1534 = sink.context().makeBuffer();
					buf_1534.start(_M_STRING);
					buf_1534.literal(1);
					buf_1534.end();
					term_1648 = buf_1534.term();
				}
				sink.propertyNamed("$LineLocation", term_1648);
				Term term_2328;
				{
					BufferSink buf_1436 = sink.context().makeBuffer();
					buf_1436.start(_M_STRING);
					buf_1436.literal(1);
					buf_1436.end();
					term_2328 = buf_1436.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2328);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_188));
				sink.start(_M_SendDispatchCases);
				sink.start(_M_OK);
				sink.end();
				sink.copy(sub_207.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_2117;
				{
					BufferSink buf_1524 = sink.context().makeBuffer();
					buf_1524.start(_M_STRING);
					buf_1524.literal(1);
					buf_1524.end();
					term_2117 = buf_1524.term();
				}
				sink.propertyNamed("$LineLocation", term_2117);
				Term term_2239;
				{
					BufferSink buf_2043 = sink.context().makeBuffer();
					buf_2043.start(_M_STRING);
					buf_2043.literal(38);
					buf_2043.end();
					term_2239 = buf_2043.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2239);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendDispatchCases, props_188, term_1611, term_1328);
	}

	final public static boolean _M_SendDispatchBinders(Sink sink, int shared, int depth, Properties props_215, Term term_1241, Term term_1711, Variable var_58, Term term_1655)
	{
		if (depth < 2000)
		{
			label_178 :
			{
				if (term_1241.descriptor() != _M_Crsx_xnextBinder_xA2)
				{
					break label_178;
				}
				Term sub_312 = term_1241.sub(0).ref();
				Term sub_287 = term_1241.sub(1).ref();
				/* #freeTerm=sub */
				/* #position=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_215));
				sink.start(_M_SendDispatchFreeTerm);
				sink.copy(sub_287.ref());
				sink.copy(term_1711.ref());
				Variable var_208 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_208});
				VariableUse use_29 = sink.context().makeVariableUse(var_208);
				sink.substitute(term_1655.ref(), new Variable[]
					{var_58}, new Term[]
					{use_29});
				sink.end();
				return true;
			}
			label_17 :
			{
				if (term_1241.descriptor() != _M_Crsx_xnextBinder_xA1)
				{
					break label_17;
				}
				Term sub_350 = term_1241.sub(0).ref();
				/* #binder=sub */Term sub_363 = term_1241.sub(1).ref();
				/* #nextBinder=sub */
				/* #position=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_215));
				sink.start(_M_SendDispatchBinders);
				sink.copy(sub_363.ref());
				sink.copy(term_1711.ref());
				Variable var_118 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_118});
				VariableUse use_50 = sink.context().makeVariableUse(var_118);
				sink.substitute(term_1655.ref(), new Variable[]
					{var_58}, new Term[]
					{use_50});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendDispatchBinders, props_215, term_1241, term_1711, var_58, term_1655);
	}

	final public static boolean _M_SendDispatchMeta(Sink sink, int shared, int depth, Properties props_97, Term term_2523, Term term_1472, Variable var_203, Term term_1453)
	{
		if (depth < 2000)
		{
			label_64 :
			{
				/* #dispatchKey=term */
				/* #metavarKey=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_97));
				Term term_1851;
				{
					BufferSink buf_1310 = sink.context().makeBuffer();
					buf_1310.start(_M_STRING);
					buf_1310.copy(term_1472.ref());
					buf_1310.end();
					term_1851 = buf_1310.term();
				}
				term_2523 = force(sink.context(), term_2523);
				Sink.property(sink, term_2523, term_1851);
				Term term_2027;
				{
					BufferSink buf_2274 = sink.context().makeBuffer();
					buf_2274.start(_M_OK);
					buf_2274.end();
					term_2027 = buf_2274.term();
				}
				sink.substitute(term_1453.ref(), new Variable[]
					{var_203}, new Term[]
					{term_2027});
				return true;
			}
		}
		return thunk(sink, _M_SendDispatchMeta, props_97, term_2523, term_1472, var_203, term_1453);
	}

	final public static boolean _M_SendDispatchFreeTerm(Sink sink, int shared, int depth, Properties props_57, Term term_1964, Term term_2545, Variable var_279, Term term_1976)
	{
		if (depth < 2000)
		{
			label_136 :
			{
				if (term_1964.descriptor() != _M_Crsx_xfreeTerm_xA7)
				{
					break label_136;
				}
				Term sub_316 = term_1964.sub(0).ref();
				if (sub_316.descriptor() != _M__sNil)
				{
					break label_136;
				}
				Term sub_831 = term_1964.sub(1).ref();
				if (sub_831.descriptor() != _M__sNil)
				{
					break label_136;
				}
				Term sub_281 = term_1964.sub(2).ref();
				/* #METAVAR=sub */Term sub_250 = term_1964.sub(3).ref();
				/* #freeArguments?=sub */
				/* #position=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_57));
				sink.start(_M_SendDispatchMeta);
				sink.start(_M_MetaDispatchKey);
				sink.copy(term_2545.ref());
				sink.end();
				sink.start(_M_MetaKey);
				sink.copy(sub_281.ref());
				sink.end();
				Variable var_80 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_80});
				VariableUse use_66 = sink.context().makeVariableUse(var_80);
				sink.substitute(term_1976.ref(), new Variable[]
					{var_279}, new Term[]
					{use_66});
				sink.end();
				return true;
			}
			label_232 :
			{
				/* #freeTerm=term */
				/* #position=term */
				/* #=term *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.start(_M__s);
				sink.start(_M_Builtin_sColon);
				sink.end();
				sink.literal("Internal error: dispatch term arguments must be all meta-variables. Got: ");
				sink.start(_M__s);
				sink.start(_M_Builtin_sShow);
				sink.end();
				sink.copy(term_1964.ref());
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendDispatchFreeTerm, props_57, term_1964, term_2545, var_279, term_1976);
	}

	final public static boolean _M_SendDispatchTerm(Sink sink, int shared, int depth, Properties props_76, Term term_2112, Term term_2144, Variable var_194, Term term_1423)
	{
		if (depth < 2000)
		{
			label_127 :
			{
				if (term_2112.descriptor() != _M_Crsx_xterm_xA1)
				{
					break label_127;
				}
				Term sub_625 = term_2112.sub(0).ref();
				/* #freeTerm=sub */
				/* #position=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_76));
				sink.start(_M_SendDispatchFreeTerm);
				sink.copy(sub_625.ref());
				sink.copy(term_2144.ref());
				Variable var_295 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_295});
				VariableUse use_12 = sink.context().makeVariableUse(var_295);
				sink.substitute(term_1423.ref(), new Variable[]
					{var_194}, new Term[]
					{use_12});
				sink.end();
				return true;
			}
			label_16 :
			{
				if (term_2112.descriptor() != _M_Crsx_xterm_xA2)
				{
					break label_16;
				}
				Term sub_306 = term_2112.sub(0).ref();
				if (sub_306.descriptor() != _M_Crsx_xboundTerm)
				{
					break label_16;
				}
				Term sub_303 = sub_306.sub(0).ref();
				/* #binder=sub */Term sub_240 = sub_306.sub(1).ref();
				/* #nextBinder=sub */
				/* #position=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_76));
				sink.start(_M_SendDispatchBinders);
				sink.start(_M_Crsx_xnextBinder_xA1);
				sink.copy(sub_303.ref());
				sink.copy(sub_240.ref());
				sink.end();
				sink.copy(term_2144.ref());
				Variable var_4 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_4});
				VariableUse use_118 = sink.context().makeVariableUse(var_4);
				sink.substitute(term_1423.ref(), new Variable[]
					{var_194}, new Term[]
					{use_118});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendDispatchTerm, props_76, term_2112, term_2144, var_194, term_1423);
	}

	final public static boolean _M_SendDispatchTerms(Sink sink, int shared, int depth, Properties props_20, Term term_1830, Term term_1518, Term term_1739, Variable var_50, Term term_2064)
	{
		if (depth < 2000)
		{
			label_23 :
			{
				if (term_1830.descriptor() != _M_OK)
				{
					break label_23;
				}
				if (term_1518.descriptor() != _M__sNil)
				{
					break label_23;
				}
				/* #position=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_20));
				Term term_2167;
				{
					BufferSink buf_1201 = sink.context().makeBuffer();
					buf_1201.start(_M_OK);
					buf_1201.end();
					term_2167 = buf_1201.term();
				}
				sink.substitute(term_2064.ref(), new Variable[]
					{var_50}, new Term[]
					{term_2167});
				return true;
			}
			label_341 :
			{
				if (term_1830.descriptor() != _M_OK)
				{
					break label_341;
				}
				if (term_1518.descriptor() != _M__sCons)
				{
					break label_341;
				}
				Term sub_364 = term_1518.sub(0).ref();
				if (sub_364.descriptor() != _M_Crsx_xterms_xS1)
				{
					break label_341;
				}
				Term sub_338 = sub_364.sub(0).ref();
				Term sub_227 = sub_364.sub(1).ref();
				/* #term=sub */Term sub_224 = term_1518.sub(1).ref();
				/* #terms_S1*=sub */
				/* #position=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_20));
				sink.start(_M_SendDispatchTerm);
				sink.copy(sub_227.ref());
				sink.copy(term_1739.ref());
				Variable var_153 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_153});
				sink.start(_M_SendDispatchTerms);
				sink.use(var_153);
				sink.copy(sub_224.ref());
				sink.start(_M__s);
				sink.start(_M_Builtin_sPlus);
				sink.end();
				sink.copy(term_1739.ref());
				sink.literal(1);
				sink.end();
				Variable var_307 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_307});
				VariableUse use_265 = sink.context().makeVariableUse(var_307);
				sink.substitute(term_2064.ref(), new Variable[]
					{var_50}, new Term[]
					{use_265});
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendDispatchTerms, props_20, term_1830, term_1518, term_1739, var_50, term_2064);
	}

	final public static boolean _M_SendDispatchMaybeProperties(Sink sink, int shared, int depth, Properties props_103, Term term_1514, Variable var_100, Term term_2099)
	{
		if (depth < 2000)
		{
			label_140 :
			{
				if (term_1514.descriptor() != _M__sNil)
				{
					break label_140;
				}
				/* #=term *//*Contract*/sink.properties(safeRef(props_103));
				Term term_1747;
				{
					BufferSink buf_1902 = sink.context().makeBuffer();
					buf_1902.start(_M_OK);
					buf_1902.end();
					term_1747 = buf_1902.term();
				}
				sink.substitute(term_2099.ref(), new Variable[]
					{var_100}, new Term[]
					{term_1747});
				return true;
			}
			label_104 :
			{
				if (term_1514.descriptor() != _M__sCons)
				{
					break label_104;
				}
				Term sub_218 = term_1514.sub(0).ref();
				if (sub_218.descriptor() != _M_Crsx_xproperties)
				{
					break label_104;
				}
				Term sub_486 = sub_218.sub(0).ref();
				Term sub_150 = sub_218.sub(1).ref();
				if (sub_150.descriptor() != _M__sNil)
				{
					break label_104;
				}
				Term sub_254 = sub_218.sub(2).ref();
				Term sub_411 = term_1514.sub(1).ref();
				if (sub_411.descriptor() != _M__sNil)
				{
					break label_104;
				}
				/* #=term *//*Contract*/sink.properties(safeRef(props_103));
				Term term_1393;
				{
					BufferSink buf_1490 = sink.context().makeBuffer();
					buf_1490.start(_M_OK);
					buf_1490.end();
					term_1393 = buf_1490.term();
				}
				sink.substitute(term_2099.ref(), new Variable[]
					{var_100}, new Term[]
					{term_1393});
				return true;
			}
			label_45 :
			{
				if (term_1514.descriptor() != _M__sCons)
				{
					break label_45;
				}
				Term sub_598 = term_1514.sub(0).ref();
				if (sub_598.descriptor() != _M_Crsx_xproperties)
				{
					break label_45;
				}
				Term sub_385 = sub_598.sub(0).ref();
				Term sub_308 = sub_598.sub(1).ref();
				if (sub_308.descriptor() != _M__sCons)
				{
					break label_45;
				}
				Term sub_282 = sub_308.sub(0).ref();
				if (sub_282.descriptor() != _M_Crsx_xpropertyList)
				{
					break label_45;
				}
				Term sub_468 = sub_282.sub(0).ref();
				if (sub_468.descriptor() != _M_Crsx_xproperty_xA1)
				{
					break label_45;
				}
				Term sub_267 = sub_468.sub(0).ref();
				/* #METAVAR=sub */Term sub_164 = sub_282.sub(1).ref();
				if (sub_164.descriptor() != _M__sNil)
				{
					break label_45;
				}
				Term sub_143 = sub_308.sub(1).ref();
				if (sub_143.descriptor() != _M__sNil)
				{
					break label_45;
				}
				Term sub_584 = sub_598.sub(2).ref();
				Term sub_361 = term_1514.sub(1).ref();
				if (sub_361.descriptor() != _M__sNil)
				{
					break label_45;
				}
				/* #=term *//*Contract*/sink.properties(safeRef(props_103));
				Term term_1535;
				{
					BufferSink buf_1479 = sink.context().makeBuffer();
					buf_1479.start(_M_TEXT);
					buf_1479.properties(safeRef(props_103));
					buf_1479.start(_M_MetaVar);
					buf_1479.copy(sub_267.ref());
					buf_1479.end();
					buf_1479.end();
					term_1535 = buf_1479.term();
				}
				sink.propertyNamed("$dispatch$env", term_1535);
				Term term_1618;
				{
					BufferSink buf_1503 = sink.context().makeBuffer();
					buf_1503.start(_M_OK);
					buf_1503.end();
					term_1618 = buf_1503.term();
				}
				sink.substitute(term_2099.ref(), new Variable[]
					{var_100}, new Term[]
					{term_1618});
				return true;
			}
			label_168 :
			{
				/* #properties=term */
				/* #=term *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.start(_M__s);
				sink.start(_M_Builtin_sColon);
				sink.end();
				sink.literal("Internal error: invalid dispatch term properties:");
				sink.start(_M__s);
				sink.start(_M_Builtin_sShow);
				sink.end();
				sink.copy(term_1514.ref());
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendDispatchMaybeProperties, props_103, term_1514, var_100, term_2099);
	}

	final public static boolean _M_SendDispatchTopFreeTerm(Sink sink, int shared, int depth, Properties props_79, Term term_1998, Variable var_455, Term term_1444)
	{
		if (depth < 2000)
		{
			label_212 :
			{
				if (term_1998.descriptor() != _M_Crsx_xfreeTerm_xA1)
				{
					break label_212;
				}
				Term sub_452 = term_1998.sub(0).ref();
				/* #annotations?=sub */Term sub_315 = term_1998.sub(1).ref();
				/* #properties?=sub */Term sub_391 = term_1998.sub(2).ref();
				/* #constructor=sub */Term sub_173 = term_1998.sub(3).ref();
				if (sub_173.descriptor() != _M__sCons)
				{
					break label_212;
				}
				Term sub_206 = sub_173.sub(0).ref();
				if (sub_206.descriptor() != _M_Crsx_xarguments)
				{
					break label_212;
				}
				Term sub_222 = sub_206.sub(0).ref();
				Term sub_247 = sub_206.sub(1).ref();
				if (sub_247.descriptor() != _M__sCons)
				{
					break label_212;
				}
				Term sub_535 = sub_247.sub(0).ref();
				/* #terms=sub */Term sub_437 = sub_247.sub(1).ref();
				if (sub_437.descriptor() != _M__sNil)
				{
					break label_212;
				}
				Term sub_182 = sub_206.sub(2).ref();
				Term sub_368 = sub_173.sub(1).ref();
				if (sub_368.descriptor() != _M__sNil)
				{
					break label_212;
				}
				/* #=term *//*Contract*/sink.properties(safeRef(props_79));
				sink.start(_M_SendDispatchMaybeProperties);
				sink.copy(sub_315.ref());
				Variable var_112 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_112});
				sink.start(_M_SendDispatchTerms);
				sink.use(var_112);
				sink.start(_M_DesugarTerms);
				sink.copy(sub_535.ref());
				sink.end();
				sink.literal(0);
				Variable var_217 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_217});
				VariableUse use_71 = sink.context().makeVariableUse(var_217);
				sink.substitute(term_1444.ref(), new Variable[]
					{var_455}, new Term[]
					{use_71});
				sink.end();
				sink.end();
				return true;
			}
			label_26 :
			{
				/* #freeTerm=term */
				/* #=term *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.start(_M__s);
				sink.start(_M_Builtin_sColon);
				sink.end();
				sink.literal("Internal Error: invalid dispatch term. Got: ");
				sink.start(_M__s);
				sink.start(_M_Builtin_sShow);
				sink.end();
				sink.copy(term_1998.ref());
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendDispatchTopFreeTerm, props_79, term_1998, var_455, term_1444);
	}

	final public static boolean _M_SendDispatch(Sink sink, int shared, int depth, Properties props_70, Term term_1325)
	{
		if (depth < 2000)
		{
			label_94 :
			{
				if (term_1325.descriptor() != _M_Crsx_xdispatch)
				{
					break label_94;
				}
				Term sub_177 = term_1325.sub(0).ref();
				Term sub_284 = term_1325.sub(1).ref();
				if (sub_284.descriptor() != _M_Crsx_xdispatchTerm)
				{
					break label_94;
				}
				Term sub_593 = sub_284.sub(0).ref();
				/* #freeTerm=sub */Term sub_220 = term_1325.sub(2).ref();
				/* #dispatchCases=sub */Term sub_684 = term_1325.sub(3).ref();
				/* #delayCase?=sub *//*Contract*/sink.properties(safeRef(props_70));
				sink.start(_M_SendDispatchTopFreeTerm);
				sink.copy(sub_593.ref());
				Variable var_257 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_257});
				sink.start(_M_SendDispatchCases);
				sink.use(var_257);
				sink.start(_M_DesugarDispatchCases);
				sink.copy(sub_220.ref());
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendDispatch, props_70, term_1325);
	}

	final public static boolean _M_SendSubstitutes(Sink sink, int shared, int depth, Properties props_83, Term term_1539, Term term_2237, Term term_1486, Term term_1404)
	{
		if (depth < 2000)
		{
			label_63 :
			{
				Term value_8 = props_83 == null ? null : props_83.lookup("$sink");
				if (value_8 == null)
				{
					break label_63;
				}
				if (value_8.descriptor() != _M_TEXT)
				{
					break label_63;
				}
				Term sub_399 = value_8.sub(0).ref();
				/* #sink=sub */
				if (term_1539.descriptor() != _M_OK)
				{
					break label_63;
				}
				/* #metavar=term */
				/* #binders=term */
				/* #substitutes=term *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2297;
				{
					BufferSink buf_1608 = sink.context().makeBuffer();
					buf_1608.start(_M_STRING);
					buf_1608.literal(1);
					buf_1608.end();
					term_2297 = buf_1608.term();
				}
				sink.propertyNamed("$LineLocation", term_2297);
				Term term_2831;
				{
					BufferSink buf_2145 = sink.context().makeBuffer();
					buf_2145.start(_M_STRING);
					buf_2145.literal(1);
					buf_2145.end();
					term_2831 = buf_2145.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2831);
				sink.start(_M__sTextCons);
				Term term_2198;
				{
					BufferSink buf_1943 = sink.context().makeBuffer();
					buf_1943.start(_M_STRING);
					buf_1943.literal(1);
					buf_1943.end();
					term_2198 = buf_1943.term();
				}
				sink.propertyNamed("$LineLocation", term_2198);
				Term term_1402;
				{
					BufferSink buf_2413 = sink.context().makeBuffer();
					buf_2413.start(_M_STRING);
					buf_2413.literal(1);
					buf_2413.end();
					term_1402 = buf_2413.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1402);
				sink.start(_M__sTextEmbed);
				Term term_2451;
				{
					BufferSink buf_1973 = sink.context().makeBuffer();
					buf_1973.start(_M_STRING);
					buf_1973.literal(1);
					buf_1973.end();
					term_2451 = buf_1973.term();
				}
				sink.propertyNamed("$LineLocation", term_2451);
				Term term_2025;
				{
					BufferSink buf_2182 = sink.context().makeBuffer();
					buf_2182.start(_M_STRING);
					buf_2182.literal(1);
					buf_2182.end();
					term_2025 = buf_2182.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2025);
				sink.start(_M_AsText);
				sink.copy(sub_399.ref());
				sink.end();
				sink.end();
				Term term_2169;
				{
					BufferSink buf_2068 = sink.context().makeBuffer();
					buf_2068.start(_M_STRING);
					buf_2068.literal(1);
					buf_2068.end();
					term_2169 = buf_2068.term();
				}
				sink.propertyNamed("$LineLocation", term_2169);
				Term term_2073;
				{
					BufferSink buf_1988 = sink.context().makeBuffer();
					buf_1988.start(_M_STRING);
					buf_1988.literal(2);
					buf_1988.end();
					term_2073 = buf_1988.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2073);
				sink.start(_M__sTextCons);
				Term term_2131;
				{
					BufferSink buf_1394 = sink.context().makeBuffer();
					buf_1394.start(_M_STRING);
					buf_1394.literal(1);
					buf_1394.end();
					term_2131 = buf_1394.term();
				}
				sink.propertyNamed("$LineLocation", term_2131);
				Term term_1967;
				{
					BufferSink buf_1204 = sink.context().makeBuffer();
					buf_1204.start(_M_STRING);
					buf_1204.literal(2);
					buf_1204.end();
					term_1967 = buf_1204.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1967);
				sink.start(_M__sTextChars);
				sink.literal(".substitute(");
				sink.end();
				Term term_2781;
				{
					BufferSink buf_2296 = sink.context().makeBuffer();
					buf_2296.start(_M_STRING);
					buf_2296.literal(1);
					buf_2296.end();
					term_2781 = buf_2296.term();
				}
				sink.propertyNamed("$LineLocation", term_2781);
				Term term_1401;
				{
					BufferSink buf_2316 = sink.context().makeBuffer();
					buf_2316.start(_M_STRING);
					buf_2316.literal(9);
					buf_2316.end();
					term_1401 = buf_2316.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1401);
				sink.start(_M__sTextCons);
				Term term_1338;
				{
					BufferSink buf_1157 = sink.context().makeBuffer();
					buf_1157.start(_M_STRING);
					buf_1157.literal(1);
					buf_1157.end();
					term_1338 = buf_1157.term();
				}
				sink.propertyNamed("$LineLocation", term_1338);
				Term term_2103;
				{
					BufferSink buf_1658 = sink.context().makeBuffer();
					buf_1658.start(_M_STRING);
					buf_1658.literal(9);
					buf_1658.end();
					term_2103 = buf_1658.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2103);
				sink.start(_M__sTextEmbed);
				Term term_1816;
				{
					BufferSink buf_1470 = sink.context().makeBuffer();
					buf_1470.start(_M_STRING);
					buf_1470.literal(1);
					buf_1470.end();
					term_1816 = buf_1470.term();
				}
				sink.propertyNamed("$LineLocation", term_1816);
				Term term_2045;
				{
					BufferSink buf_2134 = sink.context().makeBuffer();
					buf_2134.start(_M_STRING);
					buf_2134.literal(9);
					buf_2134.end();
					term_2045 = buf_2134.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2045);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_83));
				sink.start(_M_MetaVar);
				sink.copy(term_2237.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_1787;
				{
					BufferSink buf_1523 = sink.context().makeBuffer();
					buf_1523.start(_M_STRING);
					buf_1523.literal(1);
					buf_1523.end();
					term_1787 = buf_1523.term();
				}
				sink.propertyNamed("$LineLocation", term_1787);
				Term term_1571;
				{
					BufferSink buf_1451 = sink.context().makeBuffer();
					buf_1451.start(_M_STRING);
					buf_1451.literal(21);
					buf_1451.end();
					term_1571 = buf_1451.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1571);
				sink.start(_M__sTextCons);
				Term term_1763;
				{
					BufferSink buf_1825 = sink.context().makeBuffer();
					buf_1825.start(_M_STRING);
					buf_1825.literal(1);
					buf_1825.end();
					term_1763 = buf_1825.term();
				}
				sink.propertyNamed("$LineLocation", term_1763);
				Term term_1532;
				{
					BufferSink buf_2136 = sink.context().makeBuffer();
					buf_2136.start(_M_STRING);
					buf_2136.literal(21);
					buf_2136.end();
					term_1532 = buf_2136.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1532);
				sink.start(_M__sTextChars);
				sink.literal(".ref(), new Variable[] { ");
				sink.end();
				Term term_2072;
				{
					BufferSink buf_1945 = sink.context().makeBuffer();
					buf_1945.start(_M_STRING);
					buf_1945.literal(1);
					buf_1945.end();
					term_2072 = buf_1945.term();
				}
				sink.propertyNamed("$LineLocation", term_2072);
				Term term_2381;
				{
					BufferSink buf_2066 = sink.context().makeBuffer();
					buf_2066.start(_M_STRING);
					buf_2066.literal(44);
					buf_2066.end();
					term_2381 = buf_2066.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2381);
				sink.start(_M__sTextCons);
				Term term_1782;
				{
					BufferSink buf_1202 = sink.context().makeBuffer();
					buf_1202.start(_M_STRING);
					buf_1202.literal(1);
					buf_1202.end();
					term_1782 = buf_1202.term();
				}
				sink.propertyNamed("$LineLocation", term_1782);
				Term term_1823;
				{
					BufferSink buf_2197 = sink.context().makeBuffer();
					buf_2197.start(_M_STRING);
					buf_2197.literal(44);
					buf_2197.end();
					term_1823 = buf_2197.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1823);
				sink.start(_M__sTextEmbed);
				Term term_2010;
				{
					BufferSink buf_1766 = sink.context().makeBuffer();
					buf_1766.start(_M_STRING);
					buf_1766.literal(1);
					buf_1766.end();
					term_2010 = buf_1766.term();
				}
				sink.propertyNamed("$LineLocation", term_2010);
				Term term_2003;
				{
					BufferSink buf_1286 = sink.context().makeBuffer();
					buf_1286.start(_M_STRING);
					buf_1286.literal(44);
					buf_1286.end();
					term_2003 = buf_1286.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2003);
				sink.start(_M_AsText);
				sink.start(_M_Text_ConcatSep);
				sink.copy(term_1486.ref());
				sink.start(_M__sTextCons);
				sink.start(_M__sTextChars);
				sink.literal(", ");
				sink.end();
				Term term_1538;
				{
					BufferSink buf_1727 = sink.context().makeBuffer();
					buf_1727.start(_M_STRING);
					buf_1727.literal(1);
					buf_1727.end();
					term_1538 = buf_1727.term();
				}
				sink.propertyNamed("$LineLocation", term_1538);
				Term term_1858;
				{
					BufferSink buf_1715 = sink.context().makeBuffer();
					buf_1715.start(_M_STRING);
					buf_1715.literal(98);
					buf_1715.end();
					term_1858 = buf_1715.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1858);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				Term term_1299;
				{
					BufferSink buf_1599 = sink.context().makeBuffer();
					buf_1599.start(_M_STRING);
					buf_1599.literal(1);
					buf_1599.end();
					term_1299 = buf_1599.term();
				}
				sink.propertyNamed("$LineLocation", term_1299);
				Term term_2046;
				{
					BufferSink buf_1361 = sink.context().makeBuffer();
					buf_1361.start(_M_STRING);
					buf_1361.literal(69);
					buf_1361.end();
					term_2046 = buf_1361.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2046);
				sink.start(_M__sTextCons);
				Term term_1608;
				{
					BufferSink buf_1819 = sink.context().makeBuffer();
					buf_1819.start(_M_STRING);
					buf_1819.literal(1);
					buf_1819.end();
					term_1608 = buf_1819.term();
				}
				sink.propertyNamed("$LineLocation", term_1608);
				Term term_2469;
				{
					BufferSink buf_1968 = sink.context().makeBuffer();
					buf_1968.start(_M_STRING);
					buf_1968.literal(69);
					buf_1968.end();
					term_2469 = buf_1968.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2469);
				sink.start(_M__sTextChars);
				sink.literal(" }, new Term[] {");
				sink.end();
				Term term_1668;
				{
					BufferSink buf_1998 = sink.context().makeBuffer();
					buf_1998.start(_M_STRING);
					buf_1998.literal(1);
					buf_1998.end();
					term_1668 = buf_1998.term();
				}
				sink.propertyNamed("$LineLocation", term_1668);
				Term term_1796;
				{
					BufferSink buf_2397 = sink.context().makeBuffer();
					buf_2397.start(_M_STRING);
					buf_2397.literal(103);
					buf_2397.end();
					term_1796 = buf_2397.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1796);
				sink.start(_M__sTextCons);
				Term term_2371;
				{
					BufferSink buf_1537 = sink.context().makeBuffer();
					buf_1537.start(_M_STRING);
					buf_1537.literal(1);
					buf_1537.end();
					term_2371 = buf_1537.term();
				}
				sink.propertyNamed("$LineLocation", term_2371);
				Term term_2220;
				{
					BufferSink buf_1121 = sink.context().makeBuffer();
					buf_1121.start(_M_STRING);
					buf_1121.literal(103);
					buf_1121.end();
					term_2220 = buf_1121.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2220);
				sink.start(_M__sTextEmbed);
				Term term_2063;
				{
					BufferSink buf_2322 = sink.context().makeBuffer();
					buf_2322.start(_M_STRING);
					buf_2322.literal(1);
					buf_2322.end();
					term_2063 = buf_2322.term();
				}
				sink.propertyNamed("$LineLocation", term_2063);
				Term term_2196;
				{
					BufferSink buf_1641 = sink.context().makeBuffer();
					buf_1641.start(_M_STRING);
					buf_1641.literal(103);
					buf_1641.end();
					term_2196 = buf_1641.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2196);
				sink.start(_M_AsText);
				sink.start(_M_Text_ConcatSep);
				sink.copy(term_1404.ref());
				sink.start(_M__sTextCons);
				sink.start(_M__sTextChars);
				sink.literal(", ");
				sink.end();
				Term term_1772;
				{
					BufferSink buf_1288 = sink.context().makeBuffer();
					buf_1288.start(_M_STRING);
					buf_1288.literal(1);
					buf_1288.end();
					term_1772 = buf_1288.term();
				}
				sink.propertyNamed("$LineLocation", term_1772);
				Term term_2160;
				{
					BufferSink buf_1971 = sink.context().makeBuffer();
					buf_1971.start(_M_STRING);
					buf_1971.literal(152);
					buf_1971.end();
					term_2160 = buf_1971.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2160);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				Term term_2193;
				{
					BufferSink buf_1983 = sink.context().makeBuffer();
					buf_1983.start(_M_STRING);
					buf_1983.literal(1);
					buf_1983.end();
					term_2193 = buf_1983.term();
				}
				sink.propertyNamed("$LineLocation", term_2193);
				Term term_2011;
				{
					BufferSink buf_1623 = sink.context().makeBuffer();
					buf_1623.start(_M_STRING);
					buf_1623.literal(119);
					buf_1623.end();
					term_2011 = buf_1623.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2011);
				sink.start(_M__sTextCons);
				Term term_2629;
				{
					BufferSink buf_1555 = sink.context().makeBuffer();
					buf_1555.start(_M_STRING);
					buf_1555.literal(1);
					buf_1555.end();
					term_2629 = buf_1555.term();
				}
				sink.propertyNamed("$LineLocation", term_2629);
				Term term_1849;
				{
					BufferSink buf_2032 = sink.context().makeBuffer();
					buf_2032.start(_M_STRING);
					buf_2032.literal(119);
					buf_2032.end();
					term_1849 = buf_2032.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1849);
				sink.start(_M__sTextChars);
				sink.literal("});");
				sink.end();
				Term term_2113;
				{
					BufferSink buf_1990 = sink.context().makeBuffer();
					buf_1990.start(_M_STRING);
					buf_1990.literal(1);
					buf_1990.end();
					term_2113 = buf_1990.term();
				}
				sink.propertyNamed("$LineLocation", term_2113);
				Term term_1409;
				{
					BufferSink buf_1400 = sink.context().makeBuffer();
					buf_1400.start(_M_STRING);
					buf_1400.literal(157);
					buf_1400.end();
					term_1409 = buf_1400.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1409);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendSubstitutes, props_83, term_1539, term_2237, term_1486, term_1404);
	}

	final public static boolean _M_SendMetaEntry(Sink sink, int shared, int depth, Properties props_23, Term term_1980, Term term_2137, Term term_1542)
	{
		if (depth < 2000)
		{
			label_148 :
			{
				Term value_25 = props_23 == null ? null : props_23.lookup("$sink");
				if (value_25 == null)
				{
					break label_148;
				}
				if (value_25.descriptor() != _M_TEXT)
				{
					break label_148;
				}
				Term sub_324 = value_25.sub(0).ref();
				/* #sink=sub */
				if (term_1980.descriptor() != _M_META)
				{
					break label_148;
				}
				Term sub_283 = term_1980.sub(0).ref();
				/* #var=sub */Term sub_238 = term_1980.sub(1).ref();
				/* #binders=sub */
				/* #metavar=term */
				if (term_1542.descriptor() != _M__sNil)
				{
					break label_148;
				}/*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2585;
				{
					BufferSink buf_1536 = sink.context().makeBuffer();
					buf_1536.start(_M_STRING);
					buf_1536.literal(1);
					buf_1536.end();
					term_2585 = buf_1536.term();
				}
				sink.propertyNamed("$LineLocation", term_2585);
				Term term_2687;
				{
					BufferSink buf_1409 = sink.context().makeBuffer();
					buf_1409.start(_M_STRING);
					buf_1409.literal(1);
					buf_1409.end();
					term_2687 = buf_1409.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2687);
				sink.start(_M__sTextCons);
				Term term_2062;
				{
					BufferSink buf_2175 = sink.context().makeBuffer();
					buf_2175.start(_M_STRING);
					buf_2175.literal(1);
					buf_2175.end();
					term_2062 = buf_2175.term();
				}
				sink.propertyNamed("$LineLocation", term_2062);
				Term term_1595;
				{
					BufferSink buf_1871 = sink.context().makeBuffer();
					buf_1871.start(_M_STRING);
					buf_1871.literal(1);
					buf_1871.end();
					term_1595 = buf_1871.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1595);
				sink.start(_M__sTextEmbed);
				Term term_1646;
				{
					BufferSink buf_2682 = sink.context().makeBuffer();
					buf_2682.start(_M_STRING);
					buf_2682.literal(1);
					buf_2682.end();
					term_1646 = buf_2682.term();
				}
				sink.propertyNamed("$LineLocation", term_1646);
				Term term_2202;
				{
					BufferSink buf_1765 = sink.context().makeBuffer();
					buf_1765.start(_M_STRING);
					buf_1765.literal(1);
					buf_1765.end();
					term_2202 = buf_1765.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2202);
				sink.start(_M_AsText);
				sink.copy(sub_324.ref());
				sink.end();
				sink.end();
				Term term_2825;
				{
					BufferSink buf_1927 = sink.context().makeBuffer();
					buf_1927.start(_M_STRING);
					buf_1927.literal(1);
					buf_1927.end();
					term_2825 = buf_1927.term();
				}
				sink.propertyNamed("$LineLocation", term_2825);
				Term term_2439;
				{
					BufferSink buf_1431 = sink.context().makeBuffer();
					buf_1431.start(_M_STRING);
					buf_1431.literal(2);
					buf_1431.end();
					term_2439 = buf_1431.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2439);
				sink.start(_M__sTextCons);
				Term term_2398;
				{
					BufferSink buf_1644 = sink.context().makeBuffer();
					buf_1644.start(_M_STRING);
					buf_1644.literal(1);
					buf_1644.end();
					term_2398 = buf_1644.term();
				}
				sink.propertyNamed("$LineLocation", term_2398);
				Term term_2471;
				{
					BufferSink buf_1964 = sink.context().makeBuffer();
					buf_1964.start(_M_STRING);
					buf_1964.literal(2);
					buf_1964.end();
					term_2471 = buf_1964.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2471);
				sink.start(_M__sTextChars);
				sink.literal(".copy(");
				sink.end();
				Term term_1658;
				{
					BufferSink buf_1815 = sink.context().makeBuffer();
					buf_1815.start(_M_STRING);
					buf_1815.literal(1);
					buf_1815.end();
					term_1658 = buf_1815.term();
				}
				sink.propertyNamed("$LineLocation", term_1658);
				Term term_2005;
				{
					BufferSink buf_1725 = sink.context().makeBuffer();
					buf_1725.start(_M_STRING);
					buf_1725.literal(9);
					buf_1725.end();
					term_2005 = buf_1725.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2005);
				sink.start(_M__sTextCons);
				Term term_2165;
				{
					BufferSink buf_1617 = sink.context().makeBuffer();
					buf_1617.start(_M_STRING);
					buf_1617.literal(1);
					buf_1617.end();
					term_2165 = buf_1617.term();
				}
				sink.propertyNamed("$LineLocation", term_2165);
				Term term_2042;
				{
					BufferSink buf_1521 = sink.context().makeBuffer();
					buf_1521.start(_M_STRING);
					buf_1521.literal(9);
					buf_1521.end();
					term_2042 = buf_1521.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2042);
				sink.start(_M__sTextEmbed);
				Term term_2276;
				{
					BufferSink buf_1504 = sink.context().makeBuffer();
					buf_1504.start(_M_STRING);
					buf_1504.literal(1);
					buf_1504.end();
					term_2276 = buf_1504.term();
				}
				sink.propertyNamed("$LineLocation", term_2276);
				Term term_1433;
				{
					BufferSink buf_1590 = sink.context().makeBuffer();
					buf_1590.start(_M_STRING);
					buf_1590.literal(9);
					buf_1590.end();
					term_1433 = buf_1590.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1433);
				sink.start(_M_AsText);
				sink.copy(sub_283.ref());
				sink.end();
				sink.end();
				Term term_2399;
				{
					BufferSink buf_2249 = sink.context().makeBuffer();
					buf_2249.start(_M_STRING);
					buf_2249.literal(1);
					buf_2249.end();
					term_2399 = buf_2249.term();
				}
				sink.propertyNamed("$LineLocation", term_2399);
				Term term_1862;
				{
					BufferSink buf_1625 = sink.context().makeBuffer();
					buf_1625.start(_M_STRING);
					buf_1625.literal(15);
					buf_1625.end();
					term_1862 = buf_1625.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1862);
				sink.start(_M__sTextCons);
				Term term_2332;
				{
					BufferSink buf_1937 = sink.context().makeBuffer();
					buf_1937.start(_M_STRING);
					buf_1937.literal(1);
					buf_1937.end();
					term_2332 = buf_1937.term();
				}
				sink.propertyNamed("$LineLocation", term_2332);
				Term term_1806;
				{
					BufferSink buf_1626 = sink.context().makeBuffer();
					buf_1626.start(_M_STRING);
					buf_1626.literal(15);
					buf_1626.end();
					term_1806 = buf_1626.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1806);
				sink.start(_M__sTextChars);
				sink.literal(".ref());");
				sink.end();
				Term term_1429;
				{
					BufferSink buf_1925 = sink.context().makeBuffer();
					buf_1925.start(_M_STRING);
					buf_1925.literal(1);
					buf_1925.end();
					term_1429 = buf_1925.term();
				}
				sink.propertyNamed("$LineLocation", term_1429);
				Term term_1377;
				{
					BufferSink buf_1972 = sink.context().makeBuffer();
					buf_1972.start(_M_STRING);
					buf_1972.literal(21);
					buf_1972.end();
					term_1377 = buf_1972.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1377);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_295 :
			{
				Term value_38 = props_23 == null ? null : props_23.lookup("$sink");
				if (value_38 == null)
				{
					break label_295;
				}
				if (value_38.descriptor() != _M_TEXT)
				{
					break label_295;
				}
				Term sub_228 = value_38.sub(0).ref();
				/* #sink=sub */
				if (term_1980.descriptor() != _M_META)
				{
					break label_295;
				}
				Term sub_447 = term_1980.sub(0).ref();
				/* #var=sub */Term sub_225 = term_1980.sub(1).ref();
				/* #binders=sub */
				/* #metavar=term */
				if (term_1542.descriptor() != _M__sCons)
				{
					break label_295;
				}
				Term sub_215 = term_1542.sub(0).ref();
				if (sub_215.descriptor() != _M_Crsx_xfreeArguments)
				{
					break label_295;
				}
				Term sub_407 = sub_215.sub(0).ref();
				Term sub_279 = sub_215.sub(1).ref();
				if (sub_279.descriptor() != _M__sNil)
				{
					break label_295;
				}
				Term sub_937 = sub_215.sub(2).ref();
				Term sub_317 = term_1542.sub(1).ref();
				if (sub_317.descriptor() != _M__sNil)
				{
					break label_295;
				}/*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1825;
				{
					BufferSink buf_1413 = sink.context().makeBuffer();
					buf_1413.start(_M_STRING);
					buf_1413.literal(1);
					buf_1413.end();
					term_1825 = buf_1413.term();
				}
				sink.propertyNamed("$LineLocation", term_1825);
				Term term_1361;
				{
					BufferSink buf_1775 = sink.context().makeBuffer();
					buf_1775.start(_M_STRING);
					buf_1775.literal(1);
					buf_1775.end();
					term_1361 = buf_1775.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1361);
				sink.start(_M__sTextCons);
				Term term_1969;
				{
					BufferSink buf_1948 = sink.context().makeBuffer();
					buf_1948.start(_M_STRING);
					buf_1948.literal(1);
					buf_1948.end();
					term_1969 = buf_1948.term();
				}
				sink.propertyNamed("$LineLocation", term_1969);
				Term term_1421;
				{
					BufferSink buf_1884 = sink.context().makeBuffer();
					buf_1884.start(_M_STRING);
					buf_1884.literal(1);
					buf_1884.end();
					term_1421 = buf_1884.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1421);
				sink.start(_M__sTextEmbed);
				Term term_1703;
				{
					BufferSink buf_1481 = sink.context().makeBuffer();
					buf_1481.start(_M_STRING);
					buf_1481.literal(1);
					buf_1481.end();
					term_1703 = buf_1481.term();
				}
				sink.propertyNamed("$LineLocation", term_1703);
				Term term_2617;
				{
					BufferSink buf_1594 = sink.context().makeBuffer();
					buf_1594.start(_M_STRING);
					buf_1594.literal(1);
					buf_1594.end();
					term_2617 = buf_1594.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2617);
				sink.start(_M_AsText);
				sink.copy(sub_228.ref());
				sink.end();
				sink.end();
				Term term_2080;
				{
					BufferSink buf_1791 = sink.context().makeBuffer();
					buf_1791.start(_M_STRING);
					buf_1791.literal(1);
					buf_1791.end();
					term_2080 = buf_1791.term();
				}
				sink.propertyNamed("$LineLocation", term_2080);
				Term term_2172;
				{
					BufferSink buf_2064 = sink.context().makeBuffer();
					buf_2064.start(_M_STRING);
					buf_2064.literal(2);
					buf_2064.end();
					term_2172 = buf_2064.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2172);
				sink.start(_M__sTextCons);
				Term term_2116;
				{
					BufferSink buf_2084 = sink.context().makeBuffer();
					buf_2084.start(_M_STRING);
					buf_2084.literal(1);
					buf_2084.end();
					term_2116 = buf_2084.term();
				}
				sink.propertyNamed("$LineLocation", term_2116);
				Term term_1932;
				{
					BufferSink buf_1616 = sink.context().makeBuffer();
					buf_1616.start(_M_STRING);
					buf_1616.literal(2);
					buf_1616.end();
					term_1932 = buf_1616.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1932);
				sink.start(_M__sTextChars);
				sink.literal(".copy(");
				sink.end();
				Term term_1944;
				{
					BufferSink buf_1028 = sink.context().makeBuffer();
					buf_1028.start(_M_STRING);
					buf_1028.literal(1);
					buf_1028.end();
					term_1944 = buf_1028.term();
				}
				sink.propertyNamed("$LineLocation", term_1944);
				Term term_2156;
				{
					BufferSink buf_2349 = sink.context().makeBuffer();
					buf_2349.start(_M_STRING);
					buf_2349.literal(9);
					buf_2349.end();
					term_2156 = buf_2349.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2156);
				sink.start(_M__sTextCons);
				Term term_1368;
				{
					BufferSink buf_1683 = sink.context().makeBuffer();
					buf_1683.start(_M_STRING);
					buf_1683.literal(1);
					buf_1683.end();
					term_1368 = buf_1683.term();
				}
				sink.propertyNamed("$LineLocation", term_1368);
				Term term_1767;
				{
					BufferSink buf_1888 = sink.context().makeBuffer();
					buf_1888.start(_M_STRING);
					buf_1888.literal(9);
					buf_1888.end();
					term_1767 = buf_1888.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1767);
				sink.start(_M__sTextEmbed);
				Term term_2422;
				{
					BufferSink buf_2035 = sink.context().makeBuffer();
					buf_2035.start(_M_STRING);
					buf_2035.literal(1);
					buf_2035.end();
					term_2422 = buf_2035.term();
				}
				sink.propertyNamed("$LineLocation", term_2422);
				Term term_1736;
				{
					BufferSink buf_2270 = sink.context().makeBuffer();
					buf_2270.start(_M_STRING);
					buf_2270.literal(9);
					buf_2270.end();
					term_1736 = buf_2270.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1736);
				sink.start(_M_AsText);
				sink.copy(sub_447.ref());
				sink.end();
				sink.end();
				Term term_1882;
				{
					BufferSink buf_1880 = sink.context().makeBuffer();
					buf_1880.start(_M_STRING);
					buf_1880.literal(1);
					buf_1880.end();
					term_1882 = buf_1880.term();
				}
				sink.propertyNamed("$LineLocation", term_1882);
				Term term_1503;
				{
					BufferSink buf_1738 = sink.context().makeBuffer();
					buf_1738.start(_M_STRING);
					buf_1738.literal(15);
					buf_1738.end();
					term_1503 = buf_1738.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1503);
				sink.start(_M__sTextCons);
				Term term_1659;
				{
					BufferSink buf_2141 = sink.context().makeBuffer();
					buf_2141.start(_M_STRING);
					buf_2141.literal(1);
					buf_2141.end();
					term_1659 = buf_2141.term();
				}
				sink.propertyNamed("$LineLocation", term_1659);
				Term term_2175;
				{
					BufferSink buf_1324 = sink.context().makeBuffer();
					buf_1324.start(_M_STRING);
					buf_1324.literal(15);
					buf_1324.end();
					term_2175 = buf_1324.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2175);
				sink.start(_M__sTextChars);
				sink.literal(".ref());");
				sink.end();
				Term term_2170;
				{
					BufferSink buf_1751 = sink.context().makeBuffer();
					buf_1751.start(_M_STRING);
					buf_1751.literal(1);
					buf_1751.end();
					term_2170 = buf_1751.term();
				}
				sink.propertyNamed("$LineLocation", term_2170);
				Term term_2051;
				{
					BufferSink buf_2124 = sink.context().makeBuffer();
					buf_2124.start(_M_STRING);
					buf_2124.literal(21);
					buf_2124.end();
					term_2051 = buf_2124.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2051);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_187 :
			{
				if (term_1980.descriptor() != _M_META)
				{
					break label_187;
				}
				Term sub_274 = term_1980.sub(0).ref();
				/* #var=sub */Term sub_442 = term_1980.sub(1).ref();
				/* #binders=sub */
				/* #metavar=term */
				if (term_1542.descriptor() != _M__sCons)
				{
					break label_187;
				}
				Term sub_473 = term_1542.sub(0).ref();
				if (sub_473.descriptor() != _M_Crsx_xfreeArguments)
				{
					break label_187;
				}
				Term sub_376 = sub_473.sub(0).ref();
				Term sub_581 = sub_473.sub(1).ref();
				if (sub_581.descriptor() != _M__sCons)
				{
					break label_187;
				}
				Term sub_459 = sub_581.sub(0).ref();
				/* #freeTerms=sub */Term sub_165 = sub_581.sub(1).ref();
				if (sub_165.descriptor() != _M__sNil)
				{
					break label_187;
				}
				Term sub_591 = sub_473.sub(2).ref();
				Term sub_349 = term_1542.sub(1).ref();
				if (sub_349.descriptor() != _M__sNil)
				{
					break label_187;
				}/*Contract*/
				sink.properties(safeRef(props_23));
				sink.start(_M_SetFreeTerms);
				sink.copy(sub_459.ref());
				Variable var_276 = sink.context().makeVariable("ok");
				Variable var_262 = sink.context().makeVariable("args");
				sink.binds(new Variable[]
					{var_276, var_262});
				sink.start(_M_SendSubstitutes);
				sink.use(var_276);
				sink.copy(term_2137.ref());
				sink.copy(sub_442.ref());
				sink.use(var_262);
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendMetaEntry, props_23, term_1980, term_2137, term_1542);
	}

	final public static boolean _M_SendMetaKey(Sink sink, int shared, int depth, Properties props_71, Term term_1387, Term term_1815, Term term_2374)
	{
		if (depth < 2000)
		{
			sink.properties(safeRef(props_71));
			sink.start(_M_SendMetaEntry);
			sink.start(_M__s);
			sink.properties(safeRef(props_71));
			sink.start(_M_Builtin_sGet);
			sink.end();
			sink.copy(term_1387.ref());
			sink.end();
			sink.copy(term_1815.ref());
			sink.copy(term_2374.ref());
			sink.end();
			return true;
		}
		return thunk(sink, _M_SendMetaKey, props_71, term_1387, term_1815, term_2374);
	}

	final public static boolean _M_SendMeta(Sink sink, int shared, int depth, Properties props_93, Term term_2121, Term term_2672)
	{
		if (depth < 2000)
		{
			sink.properties(safeRef(props_93));
			sink.start(_M_SendMetaKey);
			sink.start(_M_MetaKey);
			sink.copy(term_2121.ref());
			sink.end();
			sink.copy(term_2121.ref());
			sink.copy(term_2672.ref());
			sink.end();
			return true;
		}
		return thunk(sink, _M_SendMeta, props_93, term_2121, term_2672);
	}

	final public static boolean _M_SendVariable0(Sink sink, int shared, int depth, Properties props_388, Term term_2148, Term term_2081)
	{
		if (depth < 2000)
		{
			label_185 :
			{
				Term value_263 = props_388 == null ? null : props_388.lookup("$sink");
				if (value_263 == null)
				{
					break label_185;
				}
				if (value_263.descriptor() != _M_TEXT)
				{
					break label_185;
				}
				Term sub_548 = value_263.sub(0).ref();
				/* #sink=sub */
				Term value_76 = props_388 == null ? null : props_388.lookup("$tail");
				if (value_76 == null)
				{
					break label_185;
				}
				value_76 = value_76.ref();
				if (term_2148.descriptor() != _M_TEXT)
				{
					break label_185;
				}
				Term sub_337 = term_2148.sub(0).ref();
				/* #var=sub */
				/* #key=term *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2253;
				{
					BufferSink buf_1362 = sink.context().makeBuffer();
					buf_1362.start(_M_STRING);
					buf_1362.literal(1);
					buf_1362.end();
					term_2253 = buf_1362.term();
				}
				sink.propertyNamed("$LineLocation", term_2253);
				Term term_1780;
				{
					BufferSink buf_1575 = sink.context().makeBuffer();
					buf_1575.start(_M_STRING);
					buf_1575.literal(1);
					buf_1575.end();
					term_1780 = buf_1575.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1780);
				sink.start(_M__sTextCons);
				Term term_1958;
				{
					BufferSink buf_2012 = sink.context().makeBuffer();
					buf_2012.start(_M_STRING);
					buf_2012.literal(1);
					buf_2012.end();
					term_1958 = buf_2012.term();
				}
				sink.propertyNamed("$LineLocation", term_1958);
				Term term_1285;
				{
					BufferSink buf_2011 = sink.context().makeBuffer();
					buf_2011.start(_M_STRING);
					buf_2011.literal(1);
					buf_2011.end();
					term_1285 = buf_2011.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1285);
				sink.start(_M__sTextEmbed);
				Term term_1841;
				{
					BufferSink buf_2337 = sink.context().makeBuffer();
					buf_2337.start(_M_STRING);
					buf_2337.literal(1);
					buf_2337.end();
					term_1841 = buf_2337.term();
				}
				sink.propertyNamed("$LineLocation", term_1841);
				Term term_1741;
				{
					BufferSink buf_1497 = sink.context().makeBuffer();
					buf_1497.start(_M_STRING);
					buf_1497.literal(1);
					buf_1497.end();
					term_1741 = buf_1497.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1741);
				sink.start(_M_AsText);
				sink.copy(sub_548.ref());
				sink.end();
				sink.end();
				Term term_1790;
				{
					BufferSink buf_1961 = sink.context().makeBuffer();
					buf_1961.start(_M_STRING);
					buf_1961.literal(1);
					buf_1961.end();
					term_1790 = buf_1961.term();
				}
				sink.propertyNamed("$LineLocation", term_1790);
				Term term_2400;
				{
					BufferSink buf_1261 = sink.context().makeBuffer();
					buf_1261.start(_M_STRING);
					buf_1261.literal(2);
					buf_1261.end();
					term_2400 = buf_1261.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2400);
				sink.start(_M__sTextCons);
				Term term_1845;
				{
					BufferSink buf_1698 = sink.context().makeBuffer();
					buf_1698.start(_M_STRING);
					buf_1698.literal(1);
					buf_1698.end();
					term_1845 = buf_1698.term();
				}
				sink.propertyNamed("$LineLocation", term_1845);
				Term term_1661;
				{
					BufferSink buf_1484 = sink.context().makeBuffer();
					buf_1484.start(_M_STRING);
					buf_1484.literal(2);
					buf_1484.end();
					term_1661 = buf_1484.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1661);
				sink.start(_M__sTextChars);
				sink.literal(".use(");
				sink.end();
				Term term_1869;
				{
					BufferSink buf_1867 = sink.context().makeBuffer();
					buf_1867.start(_M_STRING);
					buf_1867.literal(1);
					buf_1867.end();
					term_1869 = buf_1867.term();
				}
				sink.propertyNamed("$LineLocation", term_1869);
				Term term_1883;
				{
					BufferSink buf_2142 = sink.context().makeBuffer();
					buf_2142.start(_M_STRING);
					buf_2142.literal(9);
					buf_2142.end();
					term_1883 = buf_2142.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1883);
				sink.start(_M__sTextCons);
				Term term_2014;
				{
					BufferSink buf_1606 = sink.context().makeBuffer();
					buf_1606.start(_M_STRING);
					buf_1606.literal(1);
					buf_1606.end();
					term_2014 = buf_1606.term();
				}
				sink.propertyNamed("$LineLocation", term_2014);
				Term term_2548;
				{
					BufferSink buf_1402 = sink.context().makeBuffer();
					buf_1402.start(_M_STRING);
					buf_1402.literal(9);
					buf_1402.end();
					term_2548 = buf_1402.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2548);
				sink.start(_M__sTextEmbed);
				Term term_2192;
				{
					BufferSink buf_2398 = sink.context().makeBuffer();
					buf_2398.start(_M_STRING);
					buf_2398.literal(1);
					buf_2398.end();
					term_2192 = buf_2398.term();
				}
				sink.propertyNamed("$LineLocation", term_2192);
				Term term_1891;
				{
					BufferSink buf_1942 = sink.context().makeBuffer();
					buf_1942.start(_M_STRING);
					buf_1942.literal(9);
					buf_1942.end();
					term_1891 = buf_1942.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1891);
				sink.start(_M_AsText);
				sink.copy(sub_337.ref());
				sink.end();
				sink.end();
				Term term_1906;
				{
					BufferSink buf_1439 = sink.context().makeBuffer();
					buf_1439.start(_M_STRING);
					buf_1439.literal(1);
					buf_1439.end();
					term_1906 = buf_1439.term();
				}
				sink.propertyNamed("$LineLocation", term_1906);
				Term term_2596;
				{
					BufferSink buf_1488 = sink.context().makeBuffer();
					buf_1488.start(_M_STRING);
					buf_1488.literal(14);
					buf_1488.end();
					term_2596 = buf_1488.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2596);
				sink.start(_M__sTextCons);
				Term term_1875;
				{
					BufferSink buf_2159 = sink.context().makeBuffer();
					buf_2159.start(_M_STRING);
					buf_2159.literal(1);
					buf_2159.end();
					term_1875 = buf_2159.term();
				}
				sink.propertyNamed("$LineLocation", term_1875);
				Term term_2229;
				{
					BufferSink buf_1832 = sink.context().makeBuffer();
					buf_1832.start(_M_STRING);
					buf_1832.literal(14);
					buf_1832.end();
					term_2229 = buf_1832.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2229);
				sink.start(_M__sTextChars);
				sink.literal(");");
				sink.end();
				Term term_2149;
				{
					BufferSink buf_2027 = sink.context().makeBuffer();
					buf_2027.start(_M_STRING);
					buf_2027.literal(1);
					buf_2027.end();
					term_2149 = buf_2027.term();
				}
				sink.propertyNamed("$LineLocation", term_2149);
				Term term_1632;
				{
					BufferSink buf_1974 = sink.context().makeBuffer();
					buf_1974.start(_M_STRING);
					buf_1974.literal(20);
					buf_1974.end();
					term_1632 = buf_1974.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1632);
				sink.start(_M__sTextCons);
				Term term_1811;
				{
					BufferSink buf_1905 = sink.context().makeBuffer();
					buf_1905.start(_M_STRING);
					buf_1905.literal(1);
					buf_1905.end();
					term_1811 = buf_1905.term();
				}
				sink.propertyNamed("$LineLocation", term_1811);
				Term term_1820;
				{
					BufferSink buf_1730 = sink.context().makeBuffer();
					buf_1730.start(_M_STRING);
					buf_1730.literal(20);
					buf_1730.end();
					term_1820 = buf_1730.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1820);
				sink.start(_M__sTextEmbed);
				Term term_1449;
				{
					BufferSink buf_2106 = sink.context().makeBuffer();
					buf_2106.start(_M_STRING);
					buf_2106.literal(1);
					buf_2106.end();
					term_1449 = buf_2106.term();
				}
				sink.propertyNamed("$LineLocation", term_1449);
				Term term_1504;
				{
					BufferSink buf_2022 = sink.context().makeBuffer();
					buf_2022.start(_M_STRING);
					buf_2022.literal(20);
					buf_2022.end();
					term_1504 = buf_2022.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1504);
				sink.start(_M_AsText);
				sink.start(_M_SendTail);
				sink.copy(value_76.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_1723;
				{
					BufferSink buf_1965 = sink.context().makeBuffer();
					buf_1965.start(_M_STRING);
					buf_1965.literal(1);
					buf_1965.end();
					term_1723 = buf_1965.term();
				}
				sink.propertyNamed("$LineLocation", term_1723);
				Term term_1528;
				{
					BufferSink buf_1520 = sink.context().makeBuffer();
					buf_1520.start(_M_STRING);
					buf_1520.literal(22);
					buf_1520.end();
					term_1528 = buf_1520.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1528);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_37 :
			{
				if (term_2148.descriptor() != _M_NOENTRY)
				{
					break label_37;
				}
				/* #key=term *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.start(_M__s);
				sink.start(_M_Builtin_sColon);
				sink.end();
				sink.literal("Internal error: undefined variable key ");
				sink.copy(term_2081.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendVariable0, props_388, term_2148, term_2081);
	}

	final public static boolean _M_SendVariable(Sink sink, int shared, int depth, Properties props_140, Term term_1721)
	{
		if (depth < 2000)
		{
			sink.properties(safeRef(props_140));
			sink.start(_M_SendVariable0);
			sink.start(_M__s);
			sink.properties(safeRef(props_140));
			sink.start(_M_Builtin_sGet);
			sink.end();
			sink.copy(term_1721.ref());
			sink.start(_M_NOENTRY);
			sink.end();
			sink.end();
			sink.copy(term_1721.ref());
			sink.end();
			return true;
		}
		return thunk(sink, _M_SendVariable, props_140, term_1721);
	}

	final public static boolean _M_SendNamedProperty(Sink sink, int shared, int depth, Properties props_183, Term term_2310, Term term_2652, Term term_1987)
	{
		if (depth < 2000)
		{
			label_88 :
			{
				Term value_1 = props_183 == null ? null : props_183.lookup("$sink");
				if (value_1 == null)
				{
					break label_88;
				}
				if (value_1.descriptor() != _M_TEXT)
				{
					break label_88;
				}
				Term sub_553 = value_1.sub(0).ref();
				/* #sink=sub */
				if (term_2310.descriptor() != _M_OK)
				{
					break label_88;
				}
				/* #name=term */
				/* #value=term *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2425;
				{
					BufferSink buf_1967 = sink.context().makeBuffer();
					buf_1967.start(_M_STRING);
					buf_1967.literal(1);
					buf_1967.end();
					term_2425 = buf_1967.term();
				}
				sink.propertyNamed("$LineLocation", term_2425);
				Term term_2847;
				{
					BufferSink buf_1885 = sink.context().makeBuffer();
					buf_1885.start(_M_STRING);
					buf_1885.literal(1);
					buf_1885.end();
					term_2847 = buf_1885.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2847);
				sink.start(_M__sTextCons);
				Term term_2250;
				{
					BufferSink buf_2060 = sink.context().makeBuffer();
					buf_2060.start(_M_STRING);
					buf_2060.literal(1);
					buf_2060.end();
					term_2250 = buf_2060.term();
				}
				sink.propertyNamed("$LineLocation", term_2250);
				Term term_2792;
				{
					BufferSink buf_1364 = sink.context().makeBuffer();
					buf_1364.start(_M_STRING);
					buf_1364.literal(1);
					buf_1364.end();
					term_2792 = buf_1364.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2792);
				sink.start(_M__sTextEmbed);
				Term term_2219;
				{
					BufferSink buf_2151 = sink.context().makeBuffer();
					buf_2151.start(_M_STRING);
					buf_2151.literal(1);
					buf_2151.end();
					term_2219 = buf_2151.term();
				}
				sink.propertyNamed("$LineLocation", term_2219);
				Term term_1416;
				{
					BufferSink buf_2162 = sink.context().makeBuffer();
					buf_2162.start(_M_STRING);
					buf_2162.literal(1);
					buf_2162.end();
					term_1416 = buf_2162.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1416);
				sink.start(_M_AsText);
				sink.copy(sub_553.ref());
				sink.end();
				sink.end();
				Term term_1941;
				{
					BufferSink buf_2957 = sink.context().makeBuffer();
					buf_2957.start(_M_STRING);
					buf_2957.literal(1);
					buf_2957.end();
					term_1941 = buf_2957.term();
				}
				sink.propertyNamed("$LineLocation", term_1941);
				Term term_2529;
				{
					BufferSink buf_1659 = sink.context().makeBuffer();
					buf_1659.start(_M_STRING);
					buf_1659.literal(2);
					buf_1659.end();
					term_2529 = buf_1659.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2529);
				sink.start(_M__sTextCons);
				Term term_1391;
				{
					BufferSink buf_1516 = sink.context().makeBuffer();
					buf_1516.start(_M_STRING);
					buf_1516.literal(1);
					buf_1516.end();
					term_1391 = buf_1516.term();
				}
				sink.propertyNamed("$LineLocation", term_1391);
				Term term_1837;
				{
					BufferSink buf_1810 = sink.context().makeBuffer();
					buf_1810.start(_M_STRING);
					buf_1810.literal(2);
					buf_1810.end();
					term_1837 = buf_1810.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1837);
				sink.start(_M__sTextChars);
				sink.literal(".propertyNamed(");
				sink.end();
				Term term_2461;
				{
					BufferSink buf_1920 = sink.context().makeBuffer();
					buf_1920.start(_M_STRING);
					buf_1920.literal(1);
					buf_1920.end();
					term_2461 = buf_1920.term();
				}
				sink.propertyNamed("$LineLocation", term_2461);
				Term term_1762;
				{
					BufferSink buf_2359 = sink.context().makeBuffer();
					buf_2359.start(_M_STRING);
					buf_2359.literal(9);
					buf_2359.end();
					term_1762 = buf_2359.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1762);
				sink.start(_M__sTextCons);
				Term term_1684;
				{
					BufferSink buf_1665 = sink.context().makeBuffer();
					buf_1665.start(_M_STRING);
					buf_1665.literal(1);
					buf_1665.end();
					term_1684 = buf_1665.term();
				}
				sink.propertyNamed("$LineLocation", term_1684);
				Term term_2738;
				{
					BufferSink buf_1817 = sink.context().makeBuffer();
					buf_1817.start(_M_STRING);
					buf_1817.literal(9);
					buf_1817.end();
					term_2738 = buf_1817.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2738);
				sink.start(_M__sTextEmbed);
				Term term_1783;
				{
					BufferSink buf_1527 = sink.context().makeBuffer();
					buf_1527.start(_M_STRING);
					buf_1527.literal(1);
					buf_1527.end();
					term_1783 = buf_1527.term();
				}
				sink.propertyNamed("$LineLocation", term_1783);
				Term term_2426;
				{
					BufferSink buf_1723 = sink.context().makeBuffer();
					buf_1723.start(_M_STRING);
					buf_1723.literal(9);
					buf_1723.end();
					term_2426 = buf_1723.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2426);
				sink.start(_M_AsText);
				sink.start(_M_Text_QuoteEscape);
				sink.copy(term_2652.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_2115;
				{
					BufferSink buf_2231 = sink.context().makeBuffer();
					buf_2231.start(_M_STRING);
					buf_2231.literal(1);
					buf_2231.end();
					term_2115 = buf_2231.term();
				}
				sink.propertyNamed("$LineLocation", term_2115);
				Term term_2133;
				{
					BufferSink buf_2119 = sink.context().makeBuffer();
					buf_2119.start(_M_STRING);
					buf_2119.literal(24);
					buf_2119.end();
					term_2133 = buf_2119.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2133);
				sink.start(_M__sTextCons);
				Term term_1880;
				{
					BufferSink buf_2110 = sink.context().makeBuffer();
					buf_2110.start(_M_STRING);
					buf_2110.literal(1);
					buf_2110.end();
					term_1880 = buf_2110.term();
				}
				sink.propertyNamed("$LineLocation", term_1880);
				Term term_1857;
				{
					BufferSink buf_1865 = sink.context().makeBuffer();
					buf_1865.start(_M_STRING);
					buf_1865.literal(24);
					buf_1865.end();
					term_1857 = buf_1865.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1857);
				sink.start(_M__sTextChars);
				sink.literal(", ");
				sink.end();
				Term term_2359;
				{
					BufferSink buf_2178 = sink.context().makeBuffer();
					buf_2178.start(_M_STRING);
					buf_2178.literal(1);
					buf_2178.end();
					term_2359 = buf_2178.term();
				}
				sink.propertyNamed("$LineLocation", term_2359);
				Term term_2634;
				{
					BufferSink buf_1736 = sink.context().makeBuffer();
					buf_1736.start(_M_STRING);
					buf_1736.literal(49);
					buf_1736.end();
					term_2634 = buf_1736.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2634);
				sink.start(_M__sTextCons);
				Term term_1988;
				{
					BufferSink buf_2262 = sink.context().makeBuffer();
					buf_2262.start(_M_STRING);
					buf_2262.literal(1);
					buf_2262.end();
					term_1988 = buf_2262.term();
				}
				sink.propertyNamed("$LineLocation", term_1988);
				Term term_2126;
				{
					BufferSink buf_1399 = sink.context().makeBuffer();
					buf_1399.start(_M_STRING);
					buf_1399.literal(49);
					buf_1399.end();
					term_2126 = buf_1399.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2126);
				sink.start(_M__sTextEmbed);
				Term term_1735;
				{
					BufferSink buf_1405 = sink.context().makeBuffer();
					buf_1405.start(_M_STRING);
					buf_1405.literal(1);
					buf_1405.end();
					term_1735 = buf_1405.term();
				}
				sink.propertyNamed("$LineLocation", term_1735);
				Term term_2066;
				{
					BufferSink buf_1311 = sink.context().makeBuffer();
					buf_1311.start(_M_STRING);
					buf_1311.literal(49);
					buf_1311.end();
					term_2066 = buf_1311.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2066);
				sink.start(_M_AsText);
				sink.copy(term_1987.ref());
				sink.end();
				sink.end();
				Term term_2279;
				{
					BufferSink buf_1354 = sink.context().makeBuffer();
					buf_1354.start(_M_STRING);
					buf_1354.literal(1);
					buf_1354.end();
					term_2279 = buf_1354.term();
				}
				sink.propertyNamed("$LineLocation", term_2279);
				Term term_1441;
				{
					BufferSink buf_1861 = sink.context().makeBuffer();
					buf_1861.start(_M_STRING);
					buf_1861.literal(51);
					buf_1861.end();
					term_1441 = buf_1861.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1441);
				sink.start(_M__sTextCons);
				Term term_1613;
				{
					BufferSink buf_1876 = sink.context().makeBuffer();
					buf_1876.start(_M_STRING);
					buf_1876.literal(1);
					buf_1876.end();
					term_1613 = buf_1876.term();
				}
				sink.propertyNamed("$LineLocation", term_1613);
				Term term_2125;
				{
					BufferSink buf_1533 = sink.context().makeBuffer();
					buf_1533.start(_M_STRING);
					buf_1533.literal(51);
					buf_1533.end();
					term_2125 = buf_1533.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2125);
				sink.start(_M__sTextChars);
				sink.literal(");");
				sink.end();
				Term term_2669;
				{
					BufferSink buf_1704 = sink.context().makeBuffer();
					buf_1704.start(_M_STRING);
					buf_1704.literal(1);
					buf_1704.end();
					term_2669 = buf_1704.term();
				}
				sink.propertyNamed("$LineLocation", term_2669);
				Term term_2263;
				{
					BufferSink buf_2089 = sink.context().makeBuffer();
					buf_2089.start(_M_STRING);
					buf_2089.literal(59);
					buf_2089.end();
					term_2263 = buf_2089.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2263);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendNamedProperty, props_183, term_2310, term_2652, term_1987);
	}

	final public static boolean _M_SendVariableProperty(Sink sink, int shared, int depth, Properties props_198, Term term_2580, Term term_2506, Term term_2199)
	{
		if (depth < 2000)
		{
			label_120 :
			{
				Term value_20 = props_198 == null ? null : props_198.lookup("$sink");
				if (value_20 == null)
				{
					break label_120;
				}
				if (value_20.descriptor() != _M_TEXT)
				{
					break label_120;
				}
				Term sub_462 = value_20.sub(0).ref();
				/* #sink=sub */
				if (term_2580.descriptor() != _M_OK)
				{
					break label_120;
				}
				/* #VARIABLE=term */
				/* #value=term *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_3188;
				{
					BufferSink buf_1758 = sink.context().makeBuffer();
					buf_1758.start(_M_STRING);
					buf_1758.literal(1);
					buf_1758.end();
					term_3188 = buf_1758.term();
				}
				sink.propertyNamed("$LineLocation", term_3188);
				Term term_1877;
				{
					BufferSink buf_1714 = sink.context().makeBuffer();
					buf_1714.start(_M_STRING);
					buf_1714.literal(1);
					buf_1714.end();
					term_1877 = buf_1714.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1877);
				sink.start(_M__sTextCons);
				Term term_2136;
				{
					BufferSink buf_1629 = sink.context().makeBuffer();
					buf_1629.start(_M_STRING);
					buf_1629.literal(1);
					buf_1629.end();
					term_2136 = buf_1629.term();
				}
				sink.propertyNamed("$LineLocation", term_2136);
				Term term_2423;
				{
					BufferSink buf_1526 = sink.context().makeBuffer();
					buf_1526.start(_M_STRING);
					buf_1526.literal(1);
					buf_1526.end();
					term_2423 = buf_1526.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2423);
				sink.start(_M__sTextEmbed);
				Term term_2211;
				{
					BufferSink buf_2021 = sink.context().makeBuffer();
					buf_2021.start(_M_STRING);
					buf_2021.literal(1);
					buf_2021.end();
					term_2211 = buf_2021.term();
				}
				sink.propertyNamed("$LineLocation", term_2211);
				Term term_2096;
				{
					BufferSink buf_2087 = sink.context().makeBuffer();
					buf_2087.start(_M_STRING);
					buf_2087.literal(1);
					buf_2087.end();
					term_2096 = buf_2087.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2096);
				sink.start(_M_AsText);
				sink.copy(sub_462.ref());
				sink.end();
				sink.end();
				Term term_1995;
				{
					BufferSink buf_2045 = sink.context().makeBuffer();
					buf_2045.start(_M_STRING);
					buf_2045.literal(1);
					buf_2045.end();
					term_1995 = buf_2045.term();
				}
				sink.propertyNamed("$LineLocation", term_1995);
				Term term_1773;
				{
					BufferSink buf_2319 = sink.context().makeBuffer();
					buf_2319.start(_M_STRING);
					buf_2319.literal(2);
					buf_2319.end();
					term_1773 = buf_2319.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1773);
				sink.start(_M__sTextCons);
				Term term_1219;
				{
					BufferSink buf_2604 = sink.context().makeBuffer();
					buf_2604.start(_M_STRING);
					buf_2604.literal(1);
					buf_2604.end();
					term_1219 = buf_2604.term();
				}
				sink.propertyNamed("$LineLocation", term_1219);
				Term term_2323;
				{
					BufferSink buf_1910 = sink.context().makeBuffer();
					buf_1910.start(_M_STRING);
					buf_1910.literal(2);
					buf_1910.end();
					term_2323 = buf_1910.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2323);
				sink.start(_M__sTextChars);
				sink.literal(".propertyVariable(");
				sink.end();
				Term term_2157;
				{
					BufferSink buf_1586 = sink.context().makeBuffer();
					buf_1586.start(_M_STRING);
					buf_1586.literal(1);
					buf_1586.end();
					term_2157 = buf_1586.term();
				}
				sink.propertyNamed("$LineLocation", term_2157);
				Term term_1691;
				{
					BufferSink buf_1580 = sink.context().makeBuffer();
					buf_1580.start(_M_STRING);
					buf_1580.literal(9);
					buf_1580.end();
					term_1691 = buf_1580.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1691);
				sink.start(_M__sTextCons);
				Term term_1745;
				{
					BufferSink buf_2015 = sink.context().makeBuffer();
					buf_2015.start(_M_STRING);
					buf_2015.literal(1);
					buf_2015.end();
					term_1745 = buf_2015.term();
				}
				sink.propertyNamed("$LineLocation", term_1745);
				Term term_2236;
				{
					BufferSink buf_1745 = sink.context().makeBuffer();
					buf_1745.start(_M_STRING);
					buf_1745.literal(9);
					buf_1745.end();
					term_2236 = buf_1745.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2236);
				sink.start(_M__sTextEmbed);
				Term term_2479;
				{
					BufferSink buf_2161 = sink.context().makeBuffer();
					buf_2161.start(_M_STRING);
					buf_2161.literal(1);
					buf_2161.end();
					term_2479 = buf_2161.term();
				}
				sink.propertyNamed("$LineLocation", term_2479);
				Term term_1708;
				{
					BufferSink buf_2017 = sink.context().makeBuffer();
					buf_2017.start(_M_STRING);
					buf_2017.literal(9);
					buf_2017.end();
					term_1708 = buf_2017.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1708);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_198));
				sink.start(_M_Variable);
				sink.copy(term_2506.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_3029;
				{
					BufferSink buf_1545 = sink.context().makeBuffer();
					buf_1545.start(_M_STRING);
					buf_1545.literal(1);
					buf_1545.end();
					term_3029 = buf_1545.term();
				}
				sink.propertyNamed("$LineLocation", term_3029);
				Term term_2088;
				{
					BufferSink buf_2664 = sink.context().makeBuffer();
					buf_2664.start(_M_STRING);
					buf_2664.literal(27);
					buf_2664.end();
					term_2088 = buf_2664.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2088);
				sink.start(_M__sTextCons);
				Term term_1915;
				{
					BufferSink buf_1769 = sink.context().makeBuffer();
					buf_1769.start(_M_STRING);
					buf_1769.literal(1);
					buf_1769.end();
					term_1915 = buf_1769.term();
				}
				sink.propertyNamed("$LineLocation", term_1915);
				Term term_1840;
				{
					BufferSink buf_2593 = sink.context().makeBuffer();
					buf_2593.start(_M_STRING);
					buf_2593.literal(27);
					buf_2593.end();
					term_1840 = buf_2593.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1840);
				sink.start(_M__sTextChars);
				sink.literal(", ");
				sink.end();
				Term term_2335;
				{
					BufferSink buf_2070 = sink.context().makeBuffer();
					buf_2070.start(_M_STRING);
					buf_2070.literal(1);
					buf_2070.end();
					term_2335 = buf_2070.term();
				}
				sink.propertyNamed("$LineLocation", term_2335);
				Term term_1960;
				{
					BufferSink buf_1722 = sink.context().makeBuffer();
					buf_1722.start(_M_STRING);
					buf_1722.literal(52);
					buf_1722.end();
					term_1960 = buf_1722.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1960);
				sink.start(_M__sTextCons);
				Term term_2853;
				{
					BufferSink buf_2510 = sink.context().makeBuffer();
					buf_2510.start(_M_STRING);
					buf_2510.literal(1);
					buf_2510.end();
					term_2853 = buf_2510.term();
				}
				sink.propertyNamed("$LineLocation", term_2853);
				Term term_2177;
				{
					BufferSink buf_2392 = sink.context().makeBuffer();
					buf_2392.start(_M_STRING);
					buf_2392.literal(52);
					buf_2392.end();
					term_2177 = buf_2392.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2177);
				sink.start(_M__sTextEmbed);
				Term term_2038;
				{
					BufferSink buf_1918 = sink.context().makeBuffer();
					buf_1918.start(_M_STRING);
					buf_1918.literal(1);
					buf_1918.end();
					term_2038 = buf_1918.term();
				}
				sink.propertyNamed("$LineLocation", term_2038);
				Term term_1920;
				{
					BufferSink buf_1796 = sink.context().makeBuffer();
					buf_1796.start(_M_STRING);
					buf_1796.literal(52);
					buf_1796.end();
					term_1920 = buf_1796.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1920);
				sink.start(_M_AsText);
				sink.copy(term_2199.ref());
				sink.end();
				sink.end();
				Term term_2118;
				{
					BufferSink buf_2379 = sink.context().makeBuffer();
					buf_2379.start(_M_STRING);
					buf_2379.literal(1);
					buf_2379.end();
					term_2118 = buf_2379.term();
				}
				sink.propertyNamed("$LineLocation", term_2118);
				Term term_2330;
				{
					BufferSink buf_1938 = sink.context().makeBuffer();
					buf_1938.start(_M_STRING);
					buf_1938.literal(54);
					buf_1938.end();
					term_2330 = buf_1938.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2330);
				sink.start(_M__sTextCons);
				Term term_1530;
				{
					BufferSink buf_1911 = sink.context().makeBuffer();
					buf_1911.start(_M_STRING);
					buf_1911.literal(1);
					buf_1911.end();
					term_1530 = buf_1911.term();
				}
				sink.propertyNamed("$LineLocation", term_1530);
				Term term_1935;
				{
					BufferSink buf_2069 = sink.context().makeBuffer();
					buf_2069.start(_M_STRING);
					buf_2069.literal(54);
					buf_2069.end();
					term_1935 = buf_2069.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1935);
				sink.start(_M__sTextChars);
				sink.literal(");");
				sink.end();
				Term term_1898;
				{
					BufferSink buf_2725 = sink.context().makeBuffer();
					buf_2725.start(_M_STRING);
					buf_2725.literal(1);
					buf_2725.end();
					term_1898 = buf_2725.term();
				}
				sink.propertyNamed("$LineLocation", term_1898);
				Term term_1900;
				{
					BufferSink buf_2114 = sink.context().makeBuffer();
					buf_2114.start(_M_STRING);
					buf_2114.literal(62);
					buf_2114.end();
					term_1900 = buf_2114.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1900);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendVariableProperty, props_198, term_2580, term_2506, term_2199);
	}

	final public static boolean _M_SendMetaProperty(Sink sink, int shared, int depth, Properties props_98, Term term_2128, Term term_2362, Term term_1761)
	{
		if (depth < 2000)
		{
			label_98 :
			{
				Term value_88 = props_98 == null ? null : props_98.lookup("$sink");
				if (value_88 == null)
				{
					break label_98;
				}
				if (value_88.descriptor() != _M_TEXT)
				{
					break label_98;
				}
				Term sub_482 = value_88.sub(0).ref();
				/* #sink=sub */
				if (term_2128.descriptor() != _M_OK)
				{
					break label_98;
				}
				/* #METAVAR=term */
				/* #value=term *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1878;
				{
					BufferSink buf_1720 = sink.context().makeBuffer();
					buf_1720.start(_M_STRING);
					buf_1720.literal(1);
					buf_1720.end();
					term_1878 = buf_1720.term();
				}
				sink.propertyNamed("$LineLocation", term_1878);
				Term term_2872;
				{
					BufferSink buf_1939 = sink.context().makeBuffer();
					buf_1939.start(_M_STRING);
					buf_1939.literal(1);
					buf_1939.end();
					term_2872 = buf_1939.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2872);
				sink.start(_M__sTextCons);
				Term term_1892;
				{
					BufferSink buf_1800 = sink.context().makeBuffer();
					buf_1800.start(_M_STRING);
					buf_1800.literal(1);
					buf_1800.end();
					term_1892 = buf_1800.term();
				}
				sink.propertyNamed("$LineLocation", term_1892);
				Term term_1629;
				{
					BufferSink buf_1829 = sink.context().makeBuffer();
					buf_1829.start(_M_STRING);
					buf_1829.literal(1);
					buf_1829.end();
					term_1629 = buf_1829.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1629);
				sink.start(_M__sTextEmbed);
				Term term_2350;
				{
					BufferSink buf_2260 = sink.context().makeBuffer();
					buf_2260.start(_M_STRING);
					buf_2260.literal(1);
					buf_2260.end();
					term_2350 = buf_2260.term();
				}
				sink.propertyNamed("$LineLocation", term_2350);
				Term term_2516;
				{
					BufferSink buf_1474 = sink.context().makeBuffer();
					buf_1474.start(_M_STRING);
					buf_1474.literal(1);
					buf_1474.end();
					term_2516 = buf_1474.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2516);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_98));
				sink.start(_M_MetaVar);
				sink.copy(term_2362.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_1821;
				{
					BufferSink buf_1976 = sink.context().makeBuffer();
					buf_1976.start(_M_STRING);
					buf_1976.literal(1);
					buf_1976.end();
					term_1821 = buf_1976.term();
				}
				sink.propertyNamed("$LineLocation", term_1821);
				Term term_1972;
				{
					BufferSink buf_1707 = sink.context().makeBuffer();
					buf_1707.start(_M_STRING);
					buf_1707.literal(2);
					buf_1707.end();
					term_1972 = buf_1707.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1972);
				sink.start(_M__sTextCons);
				Term term_1701;
				{
					BufferSink buf_1783 = sink.context().makeBuffer();
					buf_1783.start(_M_STRING);
					buf_1783.literal(1);
					buf_1783.end();
					term_1701 = buf_1783.term();
				}
				sink.propertyNamed("$LineLocation", term_1701);
				Term term_2389;
				{
					BufferSink buf_1872 = sink.context().makeBuffer();
					buf_1872.start(_M_STRING);
					buf_1872.literal(2);
					buf_1872.end();
					term_2389 = buf_1872.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2389);
				sink.start(_M__sTextChars);
				sink.literal(" = force(");
				sink.end();
				Term term_2988;
				{
					BufferSink buf_2770 = sink.context().makeBuffer();
					buf_2770.start(_M_STRING);
					buf_2770.literal(1);
					buf_2770.end();
					term_2988 = buf_2770.term();
				}
				sink.propertyNamed("$LineLocation", term_2988);
				Term term_2190;
				{
					BufferSink buf_2214 = sink.context().makeBuffer();
					buf_2214.start(_M_STRING);
					buf_2214.literal(25);
					buf_2214.end();
					term_2190 = buf_2214.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2190);
				sink.start(_M__sTextCons);
				Term term_1905;
				{
					BufferSink buf_2120 = sink.context().makeBuffer();
					buf_2120.start(_M_STRING);
					buf_2120.literal(1);
					buf_2120.end();
					term_1905 = buf_2120.term();
				}
				sink.propertyNamed("$LineLocation", term_1905);
				Term term_2200;
				{
					BufferSink buf_2133 = sink.context().makeBuffer();
					buf_2133.start(_M_STRING);
					buf_2133.literal(25);
					buf_2133.end();
					term_2200 = buf_2133.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2200);
				sink.start(_M__sTextEmbed);
				Term term_1986;
				{
					BufferSink buf_2095 = sink.context().makeBuffer();
					buf_2095.start(_M_STRING);
					buf_2095.literal(1);
					buf_2095.end();
					term_1986 = buf_2095.term();
				}
				sink.propertyNamed("$LineLocation", term_1986);
				Term term_2241;
				{
					BufferSink buf_2625 = sink.context().makeBuffer();
					buf_2625.start(_M_STRING);
					buf_2625.literal(25);
					buf_2625.end();
					term_2241 = buf_2625.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2241);
				sink.start(_M_AsText);
				sink.copy(sub_482.ref());
				sink.end();
				sink.end();
				Term term_2552;
				{
					BufferSink buf_1813 = sink.context().makeBuffer();
					buf_1813.start(_M_STRING);
					buf_1813.literal(1);
					buf_1813.end();
					term_2552 = buf_1813.term();
				}
				sink.propertyNamed("$LineLocation", term_2552);
				Term term_1758;
				{
					BufferSink buf_1916 = sink.context().makeBuffer();
					buf_1916.start(_M_STRING);
					buf_1916.literal(34);
					buf_1916.end();
					term_1758 = buf_1916.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1758);
				sink.start(_M__sTextCons);
				Term term_2697;
				{
					BufferSink buf_1833 = sink.context().makeBuffer();
					buf_1833.start(_M_STRING);
					buf_1833.literal(1);
					buf_1833.end();
					term_2697 = buf_1833.term();
				}
				sink.propertyNamed("$LineLocation", term_2697);
				Term term_2146;
				{
					BufferSink buf_1561 = sink.context().makeBuffer();
					buf_1561.start(_M_STRING);
					buf_1561.literal(34);
					buf_1561.end();
					term_2146 = buf_1561.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2146);
				sink.start(_M__sTextChars);
				sink.literal(".context(), ");
				sink.end();
				Term term_1570;
				{
					BufferSink buf_1789 = sink.context().makeBuffer();
					buf_1789.start(_M_STRING);
					buf_1789.literal(1);
					buf_1789.end();
					term_1570 = buf_1789.term();
				}
				sink.propertyNamed("$LineLocation", term_1570);
				Term term_1410;
				{
					BufferSink buf_2764 = sink.context().makeBuffer();
					buf_2764.start(_M_STRING);
					buf_2764.literal(41);
					buf_2764.end();
					term_1410 = buf_2764.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1410);
				sink.start(_M__sTextCons);
				Term term_2282;
				{
					BufferSink buf_1531 = sink.context().makeBuffer();
					buf_1531.start(_M_STRING);
					buf_1531.literal(1);
					buf_1531.end();
					term_2282 = buf_1531.term();
				}
				sink.propertyNamed("$LineLocation", term_2282);
				Term term_1775;
				{
					BufferSink buf_2403 = sink.context().makeBuffer();
					buf_2403.start(_M_STRING);
					buf_2403.literal(41);
					buf_2403.end();
					term_1775 = buf_2403.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1775);
				sink.start(_M__sTextEmbed);
				Term term_2508;
				{
					BufferSink buf_1778 = sink.context().makeBuffer();
					buf_1778.start(_M_STRING);
					buf_1778.literal(1);
					buf_1778.end();
					term_2508 = buf_1778.term();
				}
				sink.propertyNamed("$LineLocation", term_2508);
				Term term_1656;
				{
					BufferSink buf_2626 = sink.context().makeBuffer();
					buf_2626.start(_M_STRING);
					buf_2626.literal(41);
					buf_2626.end();
					term_1656 = buf_2626.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1656);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_98));
				sink.start(_M_MetaVar);
				sink.copy(term_2362.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_1843;
				{
					BufferSink buf_2288 = sink.context().makeBuffer();
					buf_2288.start(_M_STRING);
					buf_2288.literal(1);
					buf_2288.end();
					term_1843 = buf_2288.term();
				}
				sink.propertyNamed("$LineLocation", term_1843);
				Term term_2639;
				{
					BufferSink buf_2396 = sink.context().makeBuffer();
					buf_2396.start(_M_STRING);
					buf_2396.literal(53);
					buf_2396.end();
					term_2639 = buf_2396.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2639);
				sink.start(_M__sTextCons);
				Term term_2302;
				{
					BufferSink buf_2519 = sink.context().makeBuffer();
					buf_2519.start(_M_STRING);
					buf_2519.literal(1);
					buf_2519.end();
					term_2302 = buf_2519.term();
				}
				sink.propertyNamed("$LineLocation", term_2302);
				Term term_2753;
				{
					BufferSink buf_2328 = sink.context().makeBuffer();
					buf_2328.start(_M_STRING);
					buf_2328.literal(53);
					buf_2328.end();
					term_2753 = buf_2328.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2753);
				sink.start(_M__sTextChars);
				sink.literal(");");
				sink.end();
				Term term_2574;
				{
					BufferSink buf_1699 = sink.context().makeBuffer();
					buf_1699.start(_M_STRING);
					buf_1699.literal(1);
					buf_1699.end();
					term_2574 = buf_1699.term();
				}
				sink.propertyNamed("$LineLocation", term_2574);
				Term term_2314;
				{
					BufferSink buf_2566 = sink.context().makeBuffer();
					buf_2566.start(_M_STRING);
					buf_2566.literal(76);
					buf_2566.end();
					term_2314 = buf_2566.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2314);
				sink.start(_M__sTextCons);
				Term term_1838;
				{
					BufferSink buf_2187 = sink.context().makeBuffer();
					buf_2187.start(_M_STRING);
					buf_2187.literal(1);
					buf_2187.end();
					term_1838 = buf_2187.term();
				}
				sink.propertyNamed("$LineLocation", term_1838);
				Term term_2546;
				{
					BufferSink buf_2240 = sink.context().makeBuffer();
					buf_2240.start(_M_STRING);
					buf_2240.literal(76);
					buf_2240.end();
					term_2546 = buf_2240.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2546);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1698;
				{
					BufferSink buf_1676 = sink.context().makeBuffer();
					buf_1676.start(_M_STRING);
					buf_1676.literal(1);
					buf_1676.end();
					term_1698 = buf_1676.term();
				}
				sink.propertyNamed("$LineLocation", term_1698);
				Term term_2070;
				{
					BufferSink buf_1952 = sink.context().makeBuffer();
					buf_1952.start(_M_STRING);
					buf_1952.literal(78);
					buf_1952.end();
					term_2070 = buf_1952.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2070);
				sink.start(_M__sTextCons);
				Term term_2430;
				{
					BufferSink buf_1892 = sink.context().makeBuffer();
					buf_1892.start(_M_STRING);
					buf_1892.literal(1);
					buf_1892.end();
					term_2430 = buf_1892.term();
				}
				sink.propertyNamed("$LineLocation", term_2430);
				Term term_2572;
				{
					BufferSink buf_2008 = sink.context().makeBuffer();
					buf_2008.start(_M_STRING);
					buf_2008.literal(78);
					buf_2008.end();
					term_2572 = buf_2008.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2572);
				sink.start(_M__sTextChars);
				sink.literal("Sink.property(");
				sink.end();
				Term term_2019;
				{
					BufferSink buf_1904 = sink.context().makeBuffer();
					buf_1904.start(_M_STRING);
					buf_1904.literal(2);
					buf_1904.end();
					term_2019 = buf_1904.term();
				}
				sink.propertyNamed("$LineLocation", term_2019);
				Term term_2466;
				{
					BufferSink buf_1348 = sink.context().makeBuffer();
					buf_1348.start(_M_STRING);
					buf_1348.literal(1);
					buf_1348.end();
					term_2466 = buf_1348.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2466);
				sink.start(_M__sTextCons);
				Term term_2260;
				{
					BufferSink buf_2336 = sink.context().makeBuffer();
					buf_2336.start(_M_STRING);
					buf_2336.literal(2);
					buf_2336.end();
					term_2260 = buf_2336.term();
				}
				sink.propertyNamed("$LineLocation", term_2260);
				Term term_2627;
				{
					BufferSink buf_1122 = sink.context().makeBuffer();
					buf_1122.start(_M_STRING);
					buf_1122.literal(1);
					buf_1122.end();
					term_2627 = buf_1122.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2627);
				sink.start(_M__sTextEmbed);
				Term term_2377;
				{
					BufferSink buf_1907 = sink.context().makeBuffer();
					buf_1907.start(_M_STRING);
					buf_1907.literal(2);
					buf_1907.end();
					term_2377 = buf_1907.term();
				}
				sink.propertyNamed("$LineLocation", term_2377);
				Term term_1810;
				{
					BufferSink buf_2244 = sink.context().makeBuffer();
					buf_2244.start(_M_STRING);
					buf_2244.literal(1);
					buf_2244.end();
					term_1810 = buf_2244.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1810);
				sink.start(_M_AsText);
				sink.copy(sub_482.ref());
				sink.end();
				sink.end();
				Term term_2414;
				{
					BufferSink buf_2206 = sink.context().makeBuffer();
					buf_2206.start(_M_STRING);
					buf_2206.literal(2);
					buf_2206.end();
					term_2414 = buf_2206.term();
				}
				sink.propertyNamed("$LineLocation", term_2414);
				Term term_1738;
				{
					BufferSink buf_2006 = sink.context().makeBuffer();
					buf_2006.start(_M_STRING);
					buf_2006.literal(15);
					buf_2006.end();
					term_1738 = buf_2006.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1738);
				sink.start(_M__sTextCons);
				Term term_2419;
				{
					BufferSink buf_1173 = sink.context().makeBuffer();
					buf_1173.start(_M_STRING);
					buf_1173.literal(2);
					buf_1173.end();
					term_2419 = buf_1173.term();
				}
				sink.propertyNamed("$LineLocation", term_2419);
				Term term_2182;
				{
					BufferSink buf_1469 = sink.context().makeBuffer();
					buf_1469.start(_M_STRING);
					buf_1469.literal(15);
					buf_1469.end();
					term_2182 = buf_1469.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2182);
				sink.start(_M__sTextChars);
				sink.literal(", ");
				sink.end();
				Term term_2582;
				{
					BufferSink buf_1678 = sink.context().makeBuffer();
					buf_1678.start(_M_STRING);
					buf_1678.literal(2);
					buf_1678.end();
					term_2582 = buf_1678.term();
				}
				sink.propertyNamed("$LineLocation", term_2582);
				Term term_1942;
				{
					BufferSink buf_1710 = sink.context().makeBuffer();
					buf_1710.start(_M_STRING);
					buf_1710.literal(22);
					buf_1710.end();
					term_1942 = buf_1710.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1942);
				sink.start(_M__sTextCons);
				Term term_1710;
				{
					BufferSink buf_2299 = sink.context().makeBuffer();
					buf_2299.start(_M_STRING);
					buf_2299.literal(2);
					buf_2299.end();
					term_1710 = buf_2299.term();
				}
				sink.propertyNamed("$LineLocation", term_1710);
				Term term_2030;
				{
					BufferSink buf_2267 = sink.context().makeBuffer();
					buf_2267.start(_M_STRING);
					buf_2267.literal(22);
					buf_2267.end();
					term_2030 = buf_2267.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2030);
				sink.start(_M__sTextEmbed);
				Term term_1469;
				{
					BufferSink buf_2693 = sink.context().makeBuffer();
					buf_2693.start(_M_STRING);
					buf_2693.literal(2);
					buf_2693.end();
					term_1469 = buf_2693.term();
				}
				sink.propertyNamed("$LineLocation", term_1469);
				Term term_2579;
				{
					BufferSink buf_1646 = sink.context().makeBuffer();
					buf_1646.start(_M_STRING);
					buf_1646.literal(22);
					buf_1646.end();
					term_2579 = buf_1646.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2579);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_98));
				sink.start(_M_MetaVar);
				sink.copy(term_2362.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_1314;
				{
					BufferSink buf_1826 = sink.context().makeBuffer();
					buf_1826.start(_M_STRING);
					buf_1826.literal(2);
					buf_1826.end();
					term_1314 = buf_1826.term();
				}
				sink.propertyNamed("$LineLocation", term_1314);
				Term term_2431;
				{
					BufferSink buf_1666 = sink.context().makeBuffer();
					buf_1666.start(_M_STRING);
					buf_1666.literal(24);
					buf_1666.end();
					term_2431 = buf_1666.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2431);
				sink.start(_M__sTextCons);
				Term term_1922;
				{
					BufferSink buf_1603 = sink.context().makeBuffer();
					buf_1603.start(_M_STRING);
					buf_1603.literal(2);
					buf_1603.end();
					term_1922 = buf_1603.term();
				}
				sink.propertyNamed("$LineLocation", term_1922);
				Term term_2437;
				{
					BufferSink buf_2528 = sink.context().makeBuffer();
					buf_2528.start(_M_STRING);
					buf_2528.literal(24);
					buf_2528.end();
					term_2437 = buf_2528.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2437);
				sink.start(_M__sTextChars);
				sink.literal(", ");
				sink.end();
				Term term_1768;
				{
					BufferSink buf_2217 = sink.context().makeBuffer();
					buf_2217.start(_M_STRING);
					buf_2217.literal(2);
					buf_2217.end();
					term_1768 = buf_2217.term();
				}
				sink.propertyNamed("$LineLocation", term_1768);
				Term term_1996;
				{
					BufferSink buf_1820 = sink.context().makeBuffer();
					buf_1820.start(_M_STRING);
					buf_1820.literal(47);
					buf_1820.end();
					term_1996 = buf_1820.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1996);
				sink.start(_M__sTextCons);
				Term term_1719;
				{
					BufferSink buf_1991 = sink.context().makeBuffer();
					buf_1991.start(_M_STRING);
					buf_1991.literal(2);
					buf_1991.end();
					term_1719 = buf_1991.term();
				}
				sink.propertyNamed("$LineLocation", term_1719);
				Term term_2104;
				{
					BufferSink buf_2281 = sink.context().makeBuffer();
					buf_2281.start(_M_STRING);
					buf_2281.literal(47);
					buf_2281.end();
					term_2104 = buf_2281.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2104);
				sink.start(_M__sTextEmbed);
				Term term_1919;
				{
					BufferSink buf_2351 = sink.context().makeBuffer();
					buf_2351.start(_M_STRING);
					buf_2351.literal(2);
					buf_2351.end();
					term_1919 = buf_2351.term();
				}
				sink.propertyNamed("$LineLocation", term_1919);
				Term term_2907;
				{
					BufferSink buf_1804 = sink.context().makeBuffer();
					buf_1804.start(_M_STRING);
					buf_1804.literal(47);
					buf_1804.end();
					term_2907 = buf_1804.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2907);
				sink.start(_M_AsText);
				sink.copy(term_1761.ref());
				sink.end();
				sink.end();
				Term term_1912;
				{
					BufferSink buf_1970 = sink.context().makeBuffer();
					buf_1970.start(_M_STRING);
					buf_1970.literal(2);
					buf_1970.end();
					term_1912 = buf_1970.term();
				}
				sink.propertyNamed("$LineLocation", term_1912);
				Term term_2058;
				{
					BufferSink buf_1424 = sink.context().makeBuffer();
					buf_1424.start(_M_STRING);
					buf_1424.literal(49);
					buf_1424.end();
					term_2058 = buf_1424.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2058);
				sink.start(_M__sTextCons);
				Term term_2505;
				{
					BufferSink buf_1757 = sink.context().makeBuffer();
					buf_1757.start(_M_STRING);
					buf_1757.literal(2);
					buf_1757.end();
					term_2505 = buf_1757.term();
				}
				sink.propertyNamed("$LineLocation", term_2505);
				Term term_2361;
				{
					BufferSink buf_2102 = sink.context().makeBuffer();
					buf_2102.start(_M_STRING);
					buf_2102.literal(49);
					buf_2102.end();
					term_2361 = buf_2102.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2361);
				sink.start(_M__sTextChars);
				sink.literal(");");
				sink.end();
				Term term_1803;
				{
					BufferSink buf_1890 = sink.context().makeBuffer();
					buf_1890.start(_M_STRING);
					buf_1890.literal(2);
					buf_1890.end();
					term_1803 = buf_1890.term();
				}
				sink.propertyNamed("$LineLocation", term_1803);
				Term term_2048;
				{
					BufferSink buf_1713 = sink.context().makeBuffer();
					buf_1713.start(_M_STRING);
					buf_1713.literal(57);
					buf_1713.end();
					term_2048 = buf_1713.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2048);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendMetaProperty, props_98, term_2128, term_2362, term_1761);
	}

	final public static boolean _M_SendProperty(Sink sink, int shared, int depth, Properties props_11, Term term_2485)
	{
		if (depth < 2000)
		{
			label_81 :
			{
				Term value_99 = props_11 == null ? null : props_11.lookup("$sink");
				if (value_99 == null)
				{
					break label_81;
				}
				if (value_99.descriptor() != _M_TEXT)
				{
					break label_81;
				}
				Term sub_292 = value_99.sub(0).ref();
				/* #sink=sub */
				if (term_2485.descriptor() != _M_Crsx_xproperty_xA1)
				{
					break label_81;
				}
				Term sub_607 = term_2485.sub(0).ref();
				/* #METAVAR=sub *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextEmbed);
				sink.start(_M_AsText);
				sink.copy(sub_292.ref());
				sink.end();
				sink.end();
				Term term_2353;
				{
					BufferSink buf_1747 = sink.context().makeBuffer();
					buf_1747.start(_M_STRING);
					buf_1747.literal(1);
					buf_1747.end();
					term_2353 = buf_1747.term();
				}
				sink.propertyNamed("$LineLocation", term_2353);
				Term term_2093;
				{
					BufferSink buf_2137 = sink.context().makeBuffer();
					buf_2137.start(_M_STRING);
					buf_2137.literal(1);
					buf_2137.end();
					term_2093 = buf_2137.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2093);
				sink.start(_M__sTextCons);
				Term term_1974;
				{
					BufferSink buf_1620 = sink.context().makeBuffer();
					buf_1620.start(_M_STRING);
					buf_1620.literal(1);
					buf_1620.end();
					term_1974 = buf_1620.term();
				}
				sink.propertyNamed("$LineLocation", term_1974);
				Term term_1569;
				{
					BufferSink buf_2241 = sink.context().makeBuffer();
					buf_2241.start(_M_STRING);
					buf_2241.literal(1);
					buf_2241.end();
					term_1569 = buf_2241.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1569);
				sink.start(_M__sTextChars);
				sink.literal(".properties(safeRef(");
				sink.end();
				Term term_2657;
				{
					BufferSink buf_1511 = sink.context().makeBuffer();
					buf_1511.start(_M_STRING);
					buf_1511.literal(1);
					buf_1511.end();
					term_2657 = buf_1511.term();
				}
				sink.propertyNamed("$LineLocation", term_2657);
				Term term_1819;
				{
					BufferSink buf_2361 = sink.context().makeBuffer();
					buf_2361.start(_M_STRING);
					buf_2361.literal(8);
					buf_2361.end();
					term_1819 = buf_2361.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1819);
				sink.start(_M__sTextCons);
				Term term_2541;
				{
					BufferSink buf_1573 = sink.context().makeBuffer();
					buf_1573.start(_M_STRING);
					buf_1573.literal(1);
					buf_1573.end();
					term_2541 = buf_1573.term();
				}
				sink.propertyNamed("$LineLocation", term_2541);
				Term term_2341;
				{
					BufferSink buf_2121 = sink.context().makeBuffer();
					buf_2121.start(_M_STRING);
					buf_2121.literal(8);
					buf_2121.end();
					term_2341 = buf_2121.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2341);
				sink.start(_M__sTextEmbed);
				Term term_1876;
				{
					BufferSink buf_2495 = sink.context().makeBuffer();
					buf_2495.start(_M_STRING);
					buf_2495.literal(1);
					buf_2495.end();
					term_1876 = buf_2495.term();
				}
				sink.propertyNamed("$LineLocation", term_1876);
				Term term_2610;
				{
					BufferSink buf_2476 = sink.context().makeBuffer();
					buf_2476.start(_M_STRING);
					buf_2476.literal(8);
					buf_2476.end();
					term_2610 = buf_2476.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2610);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_11));
				sink.start(_M_MetaVar);
				sink.copy(sub_607.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_2518;
				{
					BufferSink buf_1843 = sink.context().makeBuffer();
					buf_1843.start(_M_STRING);
					buf_1843.literal(1);
					buf_1843.end();
					term_2518 = buf_1843.term();
				}
				sink.propertyNamed("$LineLocation", term_2518);
				Term term_2023;
				{
					BufferSink buf_2497 = sink.context().makeBuffer();
					buf_2497.start(_M_STRING);
					buf_2497.literal(28);
					buf_2497.end();
					term_2023 = buf_2497.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2023);
				sink.start(_M__sTextCons);
				Term term_2761;
				{
					BufferSink buf_1960 = sink.context().makeBuffer();
					buf_1960.start(_M_STRING);
					buf_1960.literal(1);
					buf_1960.end();
					term_2761 = buf_1960.term();
				}
				sink.propertyNamed("$LineLocation", term_2761);
				Term term_1997;
				{
					BufferSink buf_2677 = sink.context().makeBuffer();
					buf_2677.start(_M_STRING);
					buf_2677.literal(28);
					buf_2677.end();
					term_1997 = buf_2677.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1997);
				sink.start(_M__sTextChars);
				sink.literal("));");
				sink.end();
				Term term_1925;
				{
					BufferSink buf_1680 = sink.context().makeBuffer();
					buf_1680.start(_M_STRING);
					buf_1680.literal(1);
					buf_1680.end();
					term_1925 = buf_1680.term();
				}
				sink.propertyNamed("$LineLocation", term_1925);
				Term term_1515;
				{
					BufferSink buf_2574 = sink.context().makeBuffer();
					buf_2574.start(_M_STRING);
					buf_2574.literal(51);
					buf_2574.end();
					term_1515 = buf_2574.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1515);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_84 :
			{
				if (term_2485.descriptor() != _M_Crsx_xproperty_xA3)
				{
					break label_84;
				}
				Term sub_667 = term_2485.sub(0).ref();
				/* #METAVAR=sub */Term sub_567 = term_2485.sub(1).ref();
				Term sub_425 = term_2485.sub(2).ref();
				/* #freeTerm=sub *//*Contract*/sink.properties(safeRef(props_11));
				sink.start(_M_SetFreeTerm);
				sink.copy(sub_425.ref());
				Variable var_212 = sink.context().makeVariable("ok");
				Variable var_152 = sink.context().makeVariable("value");
				sink.binds(new Variable[]
					{var_212, var_152});
				sink.start(_M_SendMetaProperty);
				sink.use(var_212);
				sink.copy(sub_667.ref());
				sink.use(var_152);
				sink.end();
				sink.end();
				return true;
			}
			label_224 :
			{
				if (term_2485.descriptor() != _M_Crsx_xproperty_xA6)
				{
					break label_224;
				}
				Term sub_476 = term_2485.sub(0).ref();
				/* #VARIABLE=sub */Term sub_960 = term_2485.sub(1).ref();
				Term sub_234 = term_2485.sub(2).ref();
				/* #freeTerm=sub *//*Contract*/sink.properties(safeRef(props_11));
				sink.start(_M_SetFreeTerm);
				sink.copy(sub_234.ref());
				Variable var_25 = sink.context().makeVariable("ok");
				Variable var_86 = sink.context().makeVariable("value");
				sink.binds(new Variable[]
					{var_25, var_86});
				sink.start(_M_SendVariableProperty);
				sink.use(var_25);
				sink.copy(sub_476.ref());
				sink.use(var_86);
				sink.end();
				sink.end();
				return true;
			}
			label_192 :
			{
				if (term_2485.descriptor() != _M_Crsx_xproperty_xA9)
				{
					break label_192;
				}
				Term sub_460 = term_2485.sub(0).ref();
				/* #STRING=sub */Term sub_776 = term_2485.sub(1).ref();
				Term sub_383 = term_2485.sub(2).ref();
				/* #freeTerm=sub *//*Contract*/sink.properties(safeRef(props_11));
				sink.start(_M_SetFreeTerm);
				sink.copy(sub_383.ref());
				Variable var_392 = sink.context().makeVariable("ok");
				Variable var_55 = sink.context().makeVariable("value");
				sink.binds(new Variable[]
					{var_392, var_55});
				sink.start(_M_SendNamedProperty);
				sink.use(var_392);
				sink.start(_M_UnString);
				sink.copy(sub_460.ref());
				sink.end();
				sink.use(var_55);
				sink.end();
				sink.end();
				return true;
			}
			label_238 :
			{
				if (term_2485.descriptor() != _M_Crsx_xproperty_xA10)
				{
					break label_238;
				}
				Term sub_128 = term_2485.sub(0).ref();
				if (sub_128.descriptor() != _M_Crsx_xconstructor_xA1)
				{
					break label_238;
				}
				Term sub_489 = sub_128.sub(0).ref();
				if (sub_489.descriptor() != _M_Crsx_xqualifier_xA2)
				{
					break label_238;
				}
				Term sub_631 = sub_128.sub(1).ref();
				/* #CONSTRUCTOR=sub */Term sub_506 = term_2485.sub(1).ref();
				Term sub_395 = term_2485.sub(2).ref();
				/* #freeTerm=sub *//*Contract*/sink.properties(safeRef(props_11));
				sink.start(_M_SetFreeTerm);
				sink.copy(sub_395.ref());
				Variable var_159 = sink.context().makeVariable("ok");
				Variable var_36 = sink.context().makeVariable("value");
				sink.binds(new Variable[]
					{var_159, var_36});
				sink.start(_M_SendNamedProperty);
				sink.use(var_159);
				sink.copy(sub_631.ref());
				sink.use(var_36);
				sink.end();
				sink.end();
				return true;
			}
			label_126 :
			{
				if (term_2485.descriptor() != _M_Crsx_xproperty_xA2)
				{
					break label_126;
				}
				Term sub_435 = term_2485.sub(0).ref();
				Term sub_194 = term_2485.sub(1).ref();
				/* #METAVAR=sub *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.literal("Internal error: test for property absence not allowed in contraction");
				sink.end();
				return true;
			}
			label_177 :
			{
				if (term_2485.descriptor() != _M_Crsx_xproperty_xA4)
				{
					break label_177;
				}
				Term sub_356 = term_2485.sub(0).ref();
				/* #VARIABLE=sub *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.literal("Internal error: test for variable presence not allowed in contraction");
				sink.end();
				return true;
			}
			label_154 :
			{
				if (term_2485.descriptor() != _M_Crsx_xproperty_xA5)
				{
					break label_154;
				}
				Term sub_433 = term_2485.sub(0).ref();
				Term sub_196 = term_2485.sub(1).ref();
				/* #VARIABLE=sub *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.literal("Internal error: test for variable absence not allowed in contraction");
				sink.end();
				return true;
			}
			label_362 :
			{
				if (term_2485.descriptor() != _M_Crsx_xproperty_xA7)
				{
					break label_362;
				}
				Term sub_575 = term_2485.sub(0).ref();
				/* #STRING=sub *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.literal("Internal error: test for named property presence not allowed in contraction");
				sink.end();
				return true;
			}
			label_371 :
			{
				if (term_2485.descriptor() != _M_Crsx_xproperty_xA8)
				{
					break label_371;
				}
				Term sub_519 = term_2485.sub(0).ref();
				Term sub_479 = term_2485.sub(1).ref();
				/* #STRING=sub *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.literal("Internal error: test for named property absence not allowed in contraction");
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendProperty, props_11, term_2485);
	}

	final public static boolean _M_SendPropertyList(Sink sink, int shared, int depth, Properties props_48, Term term_1927)
	{
		if (depth < 2000)
		{
			label_143 :
			{
				if (term_1927.descriptor() != _M__sNil)
				{
					break label_143;
				}/*Contract*/
				sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
			label_153 :
			{
				if (term_1927.descriptor() != _M__sCons)
				{
					break label_153;
				}
				Term sub_603 = term_1927.sub(0).ref();
				if (sub_603.descriptor() != _M_Crsx_xpropertyList_xS1)
				{
					break label_153;
				}
				Term sub_443 = sub_603.sub(0).ref();
				Term sub_544 = sub_603.sub(1).ref();
				if (sub_544.descriptor() != _M__sNil)
				{
					break label_153;
				}
				Term sub_679 = term_1927.sub(1).ref();
				/* #propertyList_S1*=sub *//*Contract*/sink.properties(safeRef(props_48));
				sink.start(_M_SendPropertyList);
				sink.copy(sub_679.ref());
				sink.end();
				return true;
			}
			label_556 :
			{
				if (term_1927.descriptor() != _M__sCons)
				{
					break label_556;
				}
				Term sub_738 = term_1927.sub(0).ref();
				if (sub_738.descriptor() != _M_Crsx_xpropertyList_xS1)
				{
					break label_556;
				}
				Term sub_318 = sub_738.sub(0).ref();
				Term sub_369 = sub_738.sub(1).ref();
				if (sub_369.descriptor() != _M__sCons)
				{
					break label_556;
				}
				Term sub_493 = sub_369.sub(0).ref();
				/* #property=sub */Term sub_481 = sub_369.sub(1).ref();
				if (sub_481.descriptor() != _M__sNil)
				{
					break label_556;
				}
				Term sub_499 = term_1927.sub(1).ref();
				/* #propertyList_S1*=sub *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextEmbed);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_48));
				sink.start(_M_SendProperty);
				sink.copy(sub_493.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_2036;
				{
					BufferSink buf_2284 = sink.context().makeBuffer();
					buf_2284.start(_M_STRING);
					buf_2284.literal(1);
					buf_2284.end();
					term_2036 = buf_2284.term();
				}
				sink.propertyNamed("$LineLocation", term_2036);
				Term term_2083;
				{
					BufferSink buf_2233 = sink.context().makeBuffer();
					buf_2233.start(_M_STRING);
					buf_2233.literal(1);
					buf_2233.end();
					term_2083 = buf_2233.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2083);
				sink.start(_M__sTextCons);
				Term term_2124;
				{
					BufferSink buf_1844 = sink.context().makeBuffer();
					buf_1844.start(_M_STRING);
					buf_1844.literal(1);
					buf_1844.end();
					term_2124 = buf_1844.term();
				}
				sink.propertyNamed("$LineLocation", term_2124);
				Term term_2016;
				{
					BufferSink buf_1909 = sink.context().makeBuffer();
					buf_1909.start(_M_STRING);
					buf_1909.literal(1);
					buf_1909.end();
					term_2016 = buf_1909.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2016);
				sink.start(_M__sTextEmbed);
				Term term_2598;
				{
					BufferSink buf_1953 = sink.context().makeBuffer();
					buf_1953.start(_M_STRING);
					buf_1953.literal(1);
					buf_1953.end();
					term_2598 = buf_1953.term();
				}
				sink.propertyNamed("$LineLocation", term_2598);
				Term term_2391;
				{
					BufferSink buf_1868 = sink.context().makeBuffer();
					buf_1868.start(_M_STRING);
					buf_1868.literal(1);
					buf_1868.end();
					term_2391 = buf_1868.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2391);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_48));
				sink.start(_M_SendPropertyList);
				sink.copy(sub_499.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_2300;
				{
					BufferSink buf_1914 = sink.context().makeBuffer();
					buf_1914.start(_M_STRING);
					buf_1914.literal(1);
					buf_1914.end();
					term_2300 = buf_1914.term();
				}
				sink.propertyNamed("$LineLocation", term_2300);
				Term term_1847;
				{
					BufferSink buf_1750 = sink.context().makeBuffer();
					buf_1750.start(_M_STRING);
					buf_1750.literal(30);
					buf_1750.end();
					term_1847 = buf_1750.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1847);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendPropertyList, props_48, term_1927);
	}

	final public static boolean _M_SendMaybeProperties(Sink sink, int shared, int depth, Properties props_47, Term term_2588)
	{
		if (depth < 2000)
		{
			label_24 :
			{
				if (term_2588.descriptor() != _M__sNil)
				{
					break label_24;
				}/*Contract*/
				sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
			label_67 :
			{
				if (term_2588.descriptor() != _M__sCons)
				{
					break label_67;
				}
				Term sub_333 = term_2588.sub(0).ref();
				if (sub_333.descriptor() != _M_Crsx_xproperties)
				{
					break label_67;
				}
				Term sub_266 = sub_333.sub(0).ref();
				Term sub_469 = sub_333.sub(1).ref();
				if (sub_469.descriptor() != _M__sNil)
				{
					break label_67;
				}
				Term sub_652 = sub_333.sub(2).ref();
				Term sub_559 = term_2588.sub(1).ref();
				if (sub_559.descriptor() != _M__sNil)
				{
					break label_67;
				}/*Contract*/
				sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
			label_119 :
			{
				if (term_2588.descriptor() != _M__sCons)
				{
					break label_119;
				}
				Term sub_427 = term_2588.sub(0).ref();
				if (sub_427.descriptor() != _M_Crsx_xproperties)
				{
					break label_119;
				}
				Term sub_402 = sub_427.sub(0).ref();
				Term sub_268 = sub_427.sub(1).ref();
				if (sub_268.descriptor() != _M__sCons)
				{
					break label_119;
				}
				Term sub_345 = sub_268.sub(0).ref();
				/* #propertyList=sub */Term sub_731 = sub_268.sub(1).ref();
				if (sub_731.descriptor() != _M__sNil)
				{
					break label_119;
				}
				Term sub_608 = sub_427.sub(2).ref();
				Term sub_545 = term_2588.sub(1).ref();
				if (sub_545.descriptor() != _M__sNil)
				{
					break label_119;
				}/*Contract*/
				sink.properties(safeRef(props_47));
				Term term_2245;
				{
					BufferSink buf_2391 = sink.context().makeBuffer();
					buf_2391.start(_M_NO);
					buf_2391.end();
					term_2245 = buf_2391.term();
				}
				sink.propertyNamed("$tail", term_2245);
				sink.start(_M_SendPropertyList);
				sink.start(_M_DesugarPropertyList);
				sink.copy(sub_345.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendMaybeProperties, props_47, term_2588);
	}

	final public static boolean _M_SendBindersKey(Sink sink, int shared, int depth, Properties props_125, Term term_1911, Term term_2256, Term term_2180)
	{
		if (depth < 2000)
		{
			label_9 :
			{
				Term value_175 = props_125 == null ? null : props_125.lookup("$sink");
				if (value_175 == null)
				{
					break label_9;
				}
				if (value_175.descriptor() != _M_TEXT)
				{
					break label_9;
				}
				Term sub_304 = value_175.sub(0).ref();
				/* #sink=sub */
				Term value_16 = props_125 == null ? null : props_125.lookup("$binders");
				if (value_16 == null)
				{
					break label_9;
				}
				if (value_16.descriptor() != _M_TEXTS)
				{
					break label_9;
				}
				Term sub_261 = value_16.sub(0).ref();
				/* #binders=sub */
				/* #key=term */
				if (term_2256.descriptor() != _M_Crsx_xbinder)
				{
					break label_9;
				}
				Term sub_574 = term_2256.sub(0).ref();
				if (sub_574.descriptor() != _M__sNil)
				{
					break label_9;
				}
				Term sub_458 = term_2256.sub(1).ref();
				if (sub_458.descriptor() != _M_Crsx_xvariable)
				{
					break label_9;
				}
				Term sub_520 = sub_458.sub(0).ref();
				/* #linear?=sub */Term sub_509 = sub_458.sub(1).ref();
				/* #VARIABLE=sub */Term sub_573 = sub_458.sub(2).ref();
				/* #linear?2=sub */Term sub_277 = sub_458.sub(3).ref();
				/* #functional?=sub */Term sub_418 = sub_458.sub(4).ref();
				/* #varsort?=sub */
				/* #nextBinder=term *//*Contract*/
				Variable var_20 = sink.context().makeVariable("var");
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2591;
				{
					BufferSink buf_1996 = sink.context().makeBuffer();
					buf_1996.start(_M_STRING);
					buf_1996.literal(1);
					buf_1996.end();
					term_2591 = buf_1996.term();
				}
				sink.propertyNamed("$LineLocation", term_2591);
				Term term_3383;
				{
					BufferSink buf_2253 = sink.context().makeBuffer();
					buf_2253.start(_M_STRING);
					buf_2253.literal(1);
					buf_2253.end();
					term_3383 = buf_2253.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3383);
				sink.start(_M__sTextCons);
				Term term_3409;
				{
					BufferSink buf_1839 = sink.context().makeBuffer();
					buf_1839.start(_M_STRING);
					buf_1839.literal(1);
					buf_1839.end();
					term_3409 = buf_1839.term();
				}
				sink.propertyNamed("$LineLocation", term_3409);
				Term term_2614;
				{
					BufferSink buf_1512 = sink.context().makeBuffer();
					buf_1512.start(_M_STRING);
					buf_1512.literal(1);
					buf_1512.end();
					term_2614 = buf_1512.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2614);
				sink.start(_M__sTextChars);
				sink.literal("Variable ");
				sink.end();
				Term term_2304;
				{
					BufferSink buf_2228 = sink.context().makeBuffer();
					buf_2228.start(_M_STRING);
					buf_2228.literal(1);
					buf_2228.end();
					term_2304 = buf_2228.term();
				}
				sink.propertyNamed("$LineLocation", term_2304);
				Term term_1826;
				{
					BufferSink buf_1432 = sink.context().makeBuffer();
					buf_1432.start(_M_STRING);
					buf_1432.literal(2);
					buf_1432.end();
					term_1826 = buf_1432.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1826);
				sink.start(_M__sTextCons);
				Term term_2955;
				{
					BufferSink buf_1864 = sink.context().makeBuffer();
					buf_1864.start(_M_STRING);
					buf_1864.literal(1);
					buf_1864.end();
					term_2955 = buf_1864.term();
				}
				sink.propertyNamed("$LineLocation", term_2955);
				Term term_2637;
				{
					BufferSink buf_1853 = sink.context().makeBuffer();
					buf_1853.start(_M_STRING);
					buf_1853.literal(2);
					buf_1853.end();
					term_2637 = buf_1853.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2637);
				sink.start(_M__sTextEmbed);
				Term term_2833;
				{
					BufferSink buf_1530 = sink.context().makeBuffer();
					buf_1530.start(_M_STRING);
					buf_1530.literal(1);
					buf_1530.end();
					term_2833 = buf_1530.term();
				}
				sink.propertyNamed("$LineLocation", term_2833);
				Term term_1887;
				{
					BufferSink buf_2727 = sink.context().makeBuffer();
					buf_2727.start(_M_STRING);
					buf_2727.literal(2);
					buf_2727.end();
					term_1887 = buf_2727.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1887);
				sink.start(_M_AsText);
				sink.use(var_20);
				sink.end();
				sink.end();
				Term term_1500;
				{
					BufferSink buf_1319 = sink.context().makeBuffer();
					buf_1319.start(_M_STRING);
					buf_1319.literal(1);
					buf_1319.end();
					term_1500 = buf_1319.term();
				}
				sink.propertyNamed("$LineLocation", term_1500);
				Term term_1726;
				{
					BufferSink buf_2670 = sink.context().makeBuffer();
					buf_2670.start(_M_STRING);
					buf_2670.literal(11);
					buf_2670.end();
					term_1726 = buf_2670.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1726);
				sink.start(_M__sTextCons);
				Term term_2181;
				{
					BufferSink buf_2686 = sink.context().makeBuffer();
					buf_2686.start(_M_STRING);
					buf_2686.literal(1);
					buf_2686.end();
					term_2181 = buf_2686.term();
				}
				sink.propertyNamed("$LineLocation", term_2181);
				Term term_2952;
				{
					BufferSink buf_1802 = sink.context().makeBuffer();
					buf_1802.start(_M_STRING);
					buf_1802.literal(11);
					buf_1802.end();
					term_2952 = buf_1802.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2952);
				sink.start(_M__sTextChars);
				sink.literal(" = ");
				sink.end();
				Term term_2868;
				{
					BufferSink buf_1997 = sink.context().makeBuffer();
					buf_1997.start(_M_STRING);
					buf_1997.literal(1);
					buf_1997.end();
					term_2868 = buf_1997.term();
				}
				sink.propertyNamed("$LineLocation", term_2868);
				Term term_2420;
				{
					BufferSink buf_2283 = sink.context().makeBuffer();
					buf_2283.start(_M_STRING);
					buf_2283.literal(16);
					buf_2283.end();
					term_2420 = buf_2283.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2420);
				sink.start(_M__sTextCons);
				Term term_2001;
				{
					BufferSink buf_2613 = sink.context().makeBuffer();
					buf_2613.start(_M_STRING);
					buf_2613.literal(1);
					buf_2613.end();
					term_2001 = buf_2613.term();
				}
				sink.propertyNamed("$LineLocation", term_2001);
				Term term_2679;
				{
					BufferSink buf_1807 = sink.context().makeBuffer();
					buf_1807.start(_M_STRING);
					buf_1807.literal(16);
					buf_1807.end();
					term_2679 = buf_1807.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2679);
				sink.start(_M__sTextEmbed);
				Term term_2491;
				{
					BufferSink buf_2255 = sink.context().makeBuffer();
					buf_2255.start(_M_STRING);
					buf_2255.literal(1);
					buf_2255.end();
					term_2491 = buf_2255.term();
				}
				sink.propertyNamed("$LineLocation", term_2491);
				Term term_2929;
				{
					BufferSink buf_2326 = sink.context().makeBuffer();
					buf_2326.start(_M_STRING);
					buf_2326.literal(16);
					buf_2326.end();
					term_2929 = buf_2326.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2929);
				sink.start(_M_AsText);
				sink.copy(sub_304.ref());
				sink.end();
				sink.end();
				Term term_2057;
				{
					BufferSink buf_2563 = sink.context().makeBuffer();
					buf_2563.start(_M_STRING);
					buf_2563.literal(1);
					buf_2563.end();
					term_2057 = buf_2563.term();
				}
				sink.propertyNamed("$LineLocation", term_2057);
				Term term_2569;
				{
					BufferSink buf_2842 = sink.context().makeBuffer();
					buf_2842.start(_M_STRING);
					buf_2842.literal(19);
					buf_2842.end();
					term_2569 = buf_2842.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2569);
				sink.start(_M__sTextCons);
				Term term_2305;
				{
					BufferSink buf_1373 = sink.context().makeBuffer();
					buf_1373.start(_M_STRING);
					buf_1373.literal(1);
					buf_1373.end();
					term_2305 = buf_1373.term();
				}
				sink.propertyNamed("$LineLocation", term_2305);
				Term term_2397;
				{
					BufferSink buf_2676 = sink.context().makeBuffer();
					buf_2676.start(_M_STRING);
					buf_2676.literal(19);
					buf_2676.end();
					term_2397 = buf_2676.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2397);
				sink.start(_M__sTextChars);
				sink.literal(".context().makeVariable(\"");
				sink.end();
				Term term_2656;
				{
					BufferSink buf_1716 = sink.context().makeBuffer();
					buf_1716.start(_M_STRING);
					buf_1716.literal(1);
					buf_1716.end();
					term_2656 = buf_1716.term();
				}
				sink.propertyNamed("$LineLocation", term_2656);
				Term term_1794;
				{
					BufferSink buf_2167 = sink.context().makeBuffer();
					buf_2167.start(_M_STRING);
					buf_2167.literal(26);
					buf_2167.end();
					term_1794 = buf_2167.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1794);
				sink.start(_M__sTextCons);
				Term term_2166;
				{
					BufferSink buf_2375 = sink.context().makeBuffer();
					buf_2375.start(_M_STRING);
					buf_2375.literal(1);
					buf_2375.end();
					term_2166 = buf_2375.term();
				}
				sink.propertyNamed("$LineLocation", term_2166);
				Term term_1647;
				{
					BufferSink buf_1947 = sink.context().makeBuffer();
					buf_1947.start(_M_STRING);
					buf_1947.literal(51);
					buf_1947.end();
					term_1647 = buf_1947.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1647);
				sink.start(_M__sTextChars);
				sink.copy(sub_509.ref());
				sink.end();
				Term term_2316;
				{
					BufferSink buf_1113 = sink.context().makeBuffer();
					buf_1113.start(_M_STRING);
					buf_1113.literal(1);
					buf_1113.end();
					term_2316 = buf_1113.term();
				}
				sink.propertyNamed("$LineLocation", term_2316);
				Term term_1797;
				{
					BufferSink buf_3197 = sink.context().makeBuffer();
					buf_3197.start(_M_STRING);
					buf_3197.literal(52);
					buf_3197.end();
					term_1797 = buf_3197.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1797);
				sink.start(_M__sTextCons);
				Term term_2896;
				{
					BufferSink buf_2466 = sink.context().makeBuffer();
					buf_2466.start(_M_STRING);
					buf_2466.literal(1);
					buf_2466.end();
					term_2896 = buf_2466.term();
				}
				sink.propertyNamed("$LineLocation", term_2896);
				Term term_1859;
				{
					BufferSink buf_1816 = sink.context().makeBuffer();
					buf_1816.start(_M_STRING);
					buf_1816.literal(52);
					buf_1816.end();
					term_1859 = buf_1816.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1859);
				sink.start(_M__sTextChars);
				sink.literal("\");");
				sink.end();
				Term term_2227;
				{
					BufferSink buf_2557 = sink.context().makeBuffer();
					buf_2557.start(_M_STRING);
					buf_2557.literal(1);
					buf_2557.end();
					term_2227 = buf_2557.term();
				}
				sink.propertyNamed("$LineLocation", term_2227);
				Term term_1904;
				{
					BufferSink buf_2127 = sink.context().makeBuffer();
					buf_2127.start(_M_STRING);
					buf_2127.literal(63);
					buf_2127.end();
					term_1904 = buf_2127.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1904);
				sink.start(_M__sTextCons);
				Term term_3680;
				{
					BufferSink buf_2192 = sink.context().makeBuffer();
					buf_2192.start(_M_STRING);
					buf_2192.literal(1);
					buf_2192.end();
					term_3680 = buf_2192.term();
				}
				sink.propertyNamed("$LineLocation", term_3680);
				Term term_1962;
				{
					BufferSink buf_2056 = sink.context().makeBuffer();
					buf_2056.start(_M_STRING);
					buf_2056.literal(63);
					buf_2056.end();
					term_1962 = buf_2056.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1962);
				sink.start(_M__sTextEmbed);
				Term term_2102;
				{
					BufferSink buf_2115 = sink.context().makeBuffer();
					buf_2115.start(_M_STRING);
					buf_2115.literal(1);
					buf_2115.end();
					term_2102 = buf_2115.term();
				}
				sink.propertyNamed("$LineLocation", term_2102);
				Term term_2244;
				{
					BufferSink buf_1697 = sink.context().makeBuffer();
					buf_1697.start(_M_STRING);
					buf_1697.literal(63);
					buf_1697.end();
					term_2244 = buf_1697.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2244);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_125));
				Term term_1824;
				{
					BufferSink buf_1781 = sink.context().makeBuffer();
					buf_1781.start(_M_TEXTS);
					buf_1781.start(_M_Concat);
					buf_1781.copy(sub_261.ref());
					buf_1781.start(_M__sCons);
					buf_1781.use(var_20);
					buf_1781.start(_M__sNil);
					buf_1781.end();
					buf_1781.end();
					buf_1781.end();
					buf_1781.end();
					term_1824 = buf_1781.term();
				}
				sink.propertyNamed("$binders", term_1824);
				Term term_2948;
				{
					BufferSink buf_1610 = sink.context().makeBuffer();
					buf_1610.start(_M_BOUND);
					buf_1610.end();
					term_2948 = buf_1610.term();
				}
				sink.propertyVariable(var_20, term_2948);
				Term term_1419;
				{
					BufferSink buf_1806 = sink.context().makeBuffer();
					buf_1806.start(_M_TEXT);
					buf_1806.use(var_20);
					buf_1806.end();
					term_1419 = buf_1806.term();
				}
				term_1911 = force(sink.context(), term_1911);
				Sink.property(sink, term_1911, term_1419);
				sink.start(_M_SendBinders);
				sink.copy(term_2180.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_1685;
				{
					BufferSink buf_1597 = sink.context().makeBuffer();
					buf_1597.start(_M_STRING);
					buf_1597.literal(1);
					buf_1597.end();
					term_1685 = buf_1597.term();
				}
				sink.propertyNamed("$LineLocation", term_1685);
				Term term_2675;
				{
					BufferSink buf_2373 = sink.context().makeBuffer();
					buf_2373.start(_M_STRING);
					buf_2373.literal(66);
					buf_2373.end();
					term_2675 = buf_2373.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2675);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendBindersKey, props_125, term_1911, term_2256, term_2180);
	}

	final public static boolean _M_SendBinders(Sink sink, int shared, int depth, Properties props_99, Term term_3056)
	{
		if (depth < 2000)
		{
			label_190 :
			{
				if (term_3056.descriptor() != _M_Crsx_xnextBinder_xA1)
				{
					break label_190;
				}
				Term sub_540 = term_3056.sub(0).ref();
				/* #binder=sub */Term sub_511 = term_3056.sub(1).ref();
				/* #nextBinder=sub *//*Contract*/sink.properties(safeRef(props_99));
				sink.start(_M_SendBindersKey);
				sink.start(_M_BinderKey);
				sink.copy(sub_540.ref());
				sink.end();
				sink.copy(sub_540.ref());
				sink.copy(sub_511.ref());
				sink.end();
				return true;
			}
			label_130 :
			{
				Term value_84 = props_99 == null ? null : props_99.lookup("$sink");
				if (value_84 == null)
				{
					break label_130;
				}
				if (value_84.descriptor() != _M_TEXT)
				{
					break label_130;
				}
				Term sub_455 = value_84.sub(0).ref();
				/* #sink=sub */
				Term value_90 = props_99 == null ? null : props_99.lookup("$binders");
				if (value_90 == null)
				{
					break label_130;
				}
				if (value_90.descriptor() != _M_TEXTS)
				{
					break label_130;
				}
				Term sub_441 = value_90.sub(0).ref();
				/* #binders=sub */
				if (term_3056.descriptor() != _M_Crsx_xnextBinder_xA2)
				{
					break label_130;
				}
				Term sub_269 = term_3056.sub(0).ref();
				Term sub_397 = term_3056.sub(1).ref();
				/* #freeTerm=sub *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2618;
				{
					BufferSink buf_1957 = sink.context().makeBuffer();
					buf_1957.start(_M_STRING);
					buf_1957.literal(1);
					buf_1957.end();
					term_2618 = buf_1957.term();
				}
				sink.propertyNamed("$LineLocation", term_2618);
				Term term_2257;
				{
					BufferSink buf_2005 = sink.context().makeBuffer();
					buf_2005.start(_M_STRING);
					buf_2005.literal(1);
					buf_2005.end();
					term_2257 = buf_2005.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2257);
				sink.start(_M__sTextCons);
				Term term_2154;
				{
					BufferSink buf_2019 = sink.context().makeBuffer();
					buf_2019.start(_M_STRING);
					buf_2019.literal(1);
					buf_2019.end();
					term_2154 = buf_2019.term();
				}
				sink.propertyNamed("$LineLocation", term_2154);
				Term term_2289;
				{
					BufferSink buf_1969 = sink.context().makeBuffer();
					buf_1969.start(_M_STRING);
					buf_1969.literal(1);
					buf_1969.end();
					term_2289 = buf_1969.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2289);
				sink.start(_M__sTextEmbed);
				Term term_1852;
				{
					BufferSink buf_1768 = sink.context().makeBuffer();
					buf_1768.start(_M_STRING);
					buf_1768.literal(1);
					buf_1768.end();
					term_1852 = buf_1768.term();
				}
				sink.propertyNamed("$LineLocation", term_1852);
				Term term_2595;
				{
					BufferSink buf_2679 = sink.context().makeBuffer();
					buf_2679.start(_M_STRING);
					buf_2679.literal(1);
					buf_2679.end();
					term_2595 = buf_2679.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2595);
				sink.start(_M_AsText);
				sink.copy(sub_455.ref());
				sink.end();
				sink.end();
				Term term_2044;
				{
					BufferSink buf_1728 = sink.context().makeBuffer();
					buf_1728.start(_M_STRING);
					buf_1728.literal(1);
					buf_1728.end();
					term_2044 = buf_1728.term();
				}
				sink.propertyNamed("$LineLocation", term_2044);
				Term term_2556;
				{
					BufferSink buf_1612 = sink.context().makeBuffer();
					buf_1612.start(_M_STRING);
					buf_1612.literal(2);
					buf_1612.end();
					term_2556 = buf_1612.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2556);
				sink.start(_M__sTextCons);
				Term term_2135;
				{
					BufferSink buf_1777 = sink.context().makeBuffer();
					buf_1777.start(_M_STRING);
					buf_1777.literal(1);
					buf_1777.end();
					term_2135 = buf_1777.term();
				}
				sink.propertyNamed("$LineLocation", term_2135);
				Term term_1614;
				{
					BufferSink buf_1638 = sink.context().makeBuffer();
					buf_1638.start(_M_STRING);
					buf_1638.literal(2);
					buf_1638.end();
					term_1614 = buf_1638.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1614);
				sink.start(_M__sTextChars);
				sink.literal(".binds(new Variable[] {");
				sink.end();
				Term term_1888;
				{
					BufferSink buf_2743 = sink.context().makeBuffer();
					buf_2743.start(_M_STRING);
					buf_2743.literal(1);
					buf_2743.end();
					term_1888 = buf_2743.term();
				}
				sink.propertyNamed("$LineLocation", term_1888);
				Term term_2322;
				{
					BufferSink buf_2290 = sink.context().makeBuffer();
					buf_2290.start(_M_STRING);
					buf_2290.literal(9);
					buf_2290.end();
					term_2322 = buf_2290.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2322);
				sink.start(_M__sTextCons);
				Term term_2424;
				{
					BufferSink buf_2387 = sink.context().makeBuffer();
					buf_2387.start(_M_STRING);
					buf_2387.literal(1);
					buf_2387.end();
					term_2424 = buf_2387.term();
				}
				sink.propertyNamed("$LineLocation", term_2424);
				Term term_3161;
				{
					BufferSink buf_1407 = sink.context().makeBuffer();
					buf_1407.start(_M_STRING);
					buf_1407.literal(9);
					buf_1407.end();
					term_3161 = buf_1407.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3161);
				sink.start(_M__sTextEmbed);
				Term term_2622;
				{
					BufferSink buf_2188 = sink.context().makeBuffer();
					buf_2188.start(_M_STRING);
					buf_2188.literal(1);
					buf_2188.end();
					term_2622 = buf_2188.term();
				}
				sink.propertyNamed("$LineLocation", term_2622);
				Term term_2234;
				{
					BufferSink buf_2777 = sink.context().makeBuffer();
					buf_2777.start(_M_STRING);
					buf_2777.literal(9);
					buf_2777.end();
					term_2234 = buf_2777.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2234);
				sink.start(_M_AsText);
				sink.start(_M_Text_ConcatSep);
				sink.copy(sub_441.ref());
				sink.start(_M__sTextCons);
				sink.start(_M__sTextChars);
				sink.literal(",");
				sink.end();
				Term term_3762;
				{
					BufferSink buf_2051 = sink.context().makeBuffer();
					buf_2051.start(_M_STRING);
					buf_2051.literal(1);
					buf_2051.end();
					term_3762 = buf_2051.term();
				}
				sink.propertyNamed("$LineLocation", term_3762);
				Term term_2321;
				{
					BufferSink buf_1473 = sink.context().makeBuffer();
					buf_1473.start(_M_STRING);
					buf_1473.literal(61);
					buf_1473.end();
					term_2321 = buf_1473.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2321);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				Term term_2775;
				{
					BufferSink buf_2239 = sink.context().makeBuffer();
					buf_2239.start(_M_STRING);
					buf_2239.literal(1);
					buf_2239.end();
					term_2775 = buf_2239.term();
				}
				sink.propertyNamed("$LineLocation", term_2775);
				Term term_1983;
				{
					BufferSink buf_2048 = sink.context().makeBuffer();
					buf_2048.start(_M_STRING);
					buf_2048.literal(32);
					buf_2048.end();
					term_1983 = buf_2048.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1983);
				sink.start(_M__sTextCons);
				Term term_2378;
				{
					BufferSink buf_2330 = sink.context().makeBuffer();
					buf_2330.start(_M_STRING);
					buf_2330.literal(1);
					buf_2330.end();
					term_2378 = buf_2330.term();
				}
				sink.propertyNamed("$LineLocation", term_2378);
				Term term_2273;
				{
					BufferSink buf_2419 = sink.context().makeBuffer();
					buf_2419.start(_M_STRING);
					buf_2419.literal(32);
					buf_2419.end();
					term_2273 = buf_2419.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2273);
				sink.start(_M__sTextChars);
				sink.literal("});");
				sink.end();
				Term term_2312;
				{
					BufferSink buf_1773 = sink.context().makeBuffer();
					buf_1773.start(_M_STRING);
					buf_1773.literal(1);
					buf_1773.end();
					term_2312 = buf_1773.term();
				}
				sink.propertyNamed("$LineLocation", term_2312);
				Term term_1724;
				{
					BufferSink buf_1866 = sink.context().makeBuffer();
					buf_1866.start(_M_STRING);
					buf_1866.literal(65);
					buf_1866.end();
					term_1724 = buf_1866.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1724);
				sink.start(_M__sTextCons);
				Term term_2449;
				{
					BufferSink buf_1635 = sink.context().makeBuffer();
					buf_1635.start(_M_STRING);
					buf_1635.literal(1);
					buf_1635.end();
					term_2449 = buf_1635.term();
				}
				sink.propertyNamed("$LineLocation", term_2449);
				Term term_1509;
				{
					BufferSink buf_2923 = sink.context().makeBuffer();
					buf_2923.start(_M_STRING);
					buf_2923.literal(65);
					buf_2923.end();
					term_1509 = buf_2923.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1509);
				sink.start(_M__sTextEmbed);
				Term term_2594;
				{
					BufferSink buf_2222 = sink.context().makeBuffer();
					buf_2222.start(_M_STRING);
					buf_2222.literal(1);
					buf_2222.end();
					term_2594 = buf_2222.term();
				}
				sink.propertyNamed("$LineLocation", term_2594);
				Term term_2004;
				{
					BufferSink buf_2071 = sink.context().makeBuffer();
					buf_2071.start(_M_STRING);
					buf_2071.literal(65);
					buf_2071.end();
					term_2004 = buf_2071.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2004);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_99));
				sink.start(_M_SendFreeTerm);
				sink.copy(sub_397.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_2828;
				{
					BufferSink buf_1717 = sink.context().makeBuffer();
					buf_1717.start(_M_STRING);
					buf_1717.literal(1);
					buf_1717.end();
					term_2828 = buf_1717.term();
				}
				sink.propertyNamed("$LineLocation", term_2828);
				Term term_2274;
				{
					BufferSink buf_1690 = sink.context().makeBuffer();
					buf_1690.start(_M_STRING);
					buf_1690.literal(68);
					buf_1690.end();
					term_2274 = buf_1690.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2274);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendBinders, props_99, term_3056);
	}

	final public static boolean _M_SendTerms_xS1_xZOM(Sink sink, int shared, int depth, Properties props_7, Term term_2286)
	{
		if (depth < 2000)
		{
			label_69 :
			{
				if (term_2286.descriptor() != _M__sNil)
				{
					break label_69;
				}/*Contract*/
				sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
			label_274 :
			{
				if (term_2286.descriptor() != _M__sCons)
				{
					break label_274;
				}
				Term sub_416 = term_2286.sub(0).ref();
				if (sub_416.descriptor() != _M_Crsx_xterms_xS1)
				{
					break label_274;
				}
				Term sub_241 = sub_416.sub(0).ref();
				Term sub_775 = sub_416.sub(1).ref();
				/* #term=sub */Term sub_421 = term_2286.sub(1).ref();
				/* #terms_S1*=sub *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextEmbed);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_7));
				sink.start(_M_SendTerm);
				sink.copy(sub_775.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_2259;
				{
					BufferSink buf_2059 = sink.context().makeBuffer();
					buf_2059.start(_M_STRING);
					buf_2059.literal(1);
					buf_2059.end();
					term_2259 = buf_2059.term();
				}
				sink.propertyNamed("$LineLocation", term_2259);
				Term term_3471;
				{
					BufferSink buf_2058 = sink.context().makeBuffer();
					buf_2058.start(_M_STRING);
					buf_2058.literal(1);
					buf_2058.end();
					term_3471 = buf_2058.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3471);
				sink.start(_M__sTextCons);
				Term term_1970;
				{
					BufferSink buf_1501 = sink.context().makeBuffer();
					buf_1501.start(_M_STRING);
					buf_1501.literal(1);
					buf_1501.end();
					term_1970 = buf_1501.term();
				}
				sink.propertyNamed("$LineLocation", term_1970);
				Term term_2108;
				{
					BufferSink buf_2130 = sink.context().makeBuffer();
					buf_2130.start(_M_STRING);
					buf_2130.literal(1);
					buf_2130.end();
					term_2108 = buf_2130.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2108);
				sink.start(_M__sTextEmbed);
				Term term_2215;
				{
					BufferSink buf_2242 = sink.context().makeBuffer();
					buf_2242.start(_M_STRING);
					buf_2242.literal(1);
					buf_2242.end();
					term_2215 = buf_2242.term();
				}
				sink.propertyNamed("$LineLocation", term_2215);
				Term term_2834;
				{
					BufferSink buf_1992 = sink.context().makeBuffer();
					buf_1992.start(_M_STRING);
					buf_1992.literal(1);
					buf_1992.end();
					term_2834 = buf_1992.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2834);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_7));
				sink.start(_M_SendTerms_xS1_xZOM);
				sink.copy(sub_421.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_1896;
				{
					BufferSink buf_1726 = sink.context().makeBuffer();
					buf_1726.start(_M_STRING);
					buf_1726.literal(1);
					buf_1726.end();
					term_1896 = buf_1726.term();
				}
				sink.propertyNamed("$LineLocation", term_1896);
				Term term_2174;
				{
					BufferSink buf_1894 = sink.context().makeBuffer();
					buf_1894.start(_M_STRING);
					buf_1894.literal(22);
					buf_1894.end();
					term_2174 = buf_1894.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2174);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendTerms_xS1_xZOM, props_7, term_2286);
	}

	final public static boolean _M_SendTerms(Sink sink, int shared, int depth, Properties props_72, Term term_2039)
	{
		if (depth < 2000)
		{
			label_338 :
			{
				if (term_2039.descriptor() != _M_Crsx_xterms)
				{
					break label_338;
				}
				Term sub_370 = term_2039.sub(0).ref();
				/* #term=sub */Term sub_784 = term_2039.sub(1).ref();
				/* #terms_S1*=sub *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextEmbed);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_72));
				sink.start(_M_SendTerm);
				sink.copy(sub_370.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_2999;
				{
					BufferSink buf_2426 = sink.context().makeBuffer();
					buf_2426.start(_M_STRING);
					buf_2426.literal(1);
					buf_2426.end();
					term_2999 = buf_2426.term();
				}
				sink.propertyNamed("$LineLocation", term_2999);
				Term term_2542;
				{
					BufferSink buf_2669 = sink.context().makeBuffer();
					buf_2669.start(_M_STRING);
					buf_2669.literal(1);
					buf_2669.end();
					term_2542 = buf_2669.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2542);
				sink.start(_M__sTextCons);
				Term term_1781;
				{
					BufferSink buf_2955 = sink.context().makeBuffer();
					buf_2955.start(_M_STRING);
					buf_2955.literal(1);
					buf_2955.end();
					term_1781 = buf_2955.term();
				}
				sink.propertyNamed("$LineLocation", term_1781);
				Term term_2758;
				{
					BufferSink buf_1428 = sink.context().makeBuffer();
					buf_1428.start(_M_STRING);
					buf_1428.literal(1);
					buf_1428.end();
					term_2758 = buf_1428.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2758);
				sink.start(_M__sTextEmbed);
				Term term_2006;
				{
					BufferSink buf_1954 = sink.context().makeBuffer();
					buf_1954.start(_M_STRING);
					buf_1954.literal(1);
					buf_1954.end();
					term_2006 = buf_1954.term();
				}
				sink.propertyNamed("$LineLocation", term_2006);
				Term term_1812;
				{
					BufferSink buf_1548 = sink.context().makeBuffer();
					buf_1548.start(_M_STRING);
					buf_1548.literal(1);
					buf_1548.end();
					term_1812 = buf_1548.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1812);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_72));
				sink.start(_M_SendTerms_xS1_xZOM);
				sink.copy(sub_784.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_3246;
				{
					BufferSink buf_1661 = sink.context().makeBuffer();
					buf_1661.start(_M_STRING);
					buf_1661.literal(1);
					buf_1661.end();
					term_3246 = buf_1661.term();
				}
				sink.propertyNamed("$LineLocation", term_3246);
				Term term_2739;
				{
					BufferSink buf_2057 = sink.context().makeBuffer();
					buf_2057.start(_M_STRING);
					buf_2057.literal(22);
					buf_2057.end();
					term_2739 = buf_2057.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2739);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendTerms, props_72, term_2039);
	}

	final public static boolean _M_SendArgumentsOpt(Sink sink, int shared, int depth, Properties props_68, Term term_2560)
	{
		if (depth < 2000)
		{
			label_134 :
			{
				if (term_2560.descriptor() != _M__sNil)
				{
					break label_134;
				}/*Contract*/
				sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
			label_115 :
			{
				if (term_2560.descriptor() != _M__sCons)
				{
					break label_115;
				}
				Term sub_362 = term_2560.sub(0).ref();
				if (sub_362.descriptor() != _M_Crsx_xarguments)
				{
					break label_115;
				}
				Term sub_449 = sub_362.sub(0).ref();
				Term sub_563 = sub_362.sub(1).ref();
				if (sub_563.descriptor() != _M__sNil)
				{
					break label_115;
				}
				Term sub_765 = sub_362.sub(2).ref();
				Term sub_516 = term_2560.sub(1).ref();
				if (sub_516.descriptor() != _M__sNil)
				{
					break label_115;
				}/*Contract*/
				sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
			label_411 :
			{
				if (term_2560.descriptor() != _M__sCons)
				{
					break label_411;
				}
				Term sub_565 = term_2560.sub(0).ref();
				if (sub_565.descriptor() != _M_Crsx_xarguments)
				{
					break label_411;
				}
				Term sub_223 = sub_565.sub(0).ref();
				Term sub_693 = sub_565.sub(1).ref();
				if (sub_693.descriptor() != _M__sCons)
				{
					break label_411;
				}
				Term sub_663 = sub_693.sub(0).ref();
				/* #terms=sub */Term sub_357 = sub_693.sub(1).ref();
				if (sub_357.descriptor() != _M__sNil)
				{
					break label_411;
				}
				Term sub_429 = sub_565.sub(2).ref();
				Term sub_339 = term_2560.sub(1).ref();
				if (sub_339.descriptor() != _M__sNil)
				{
					break label_411;
				}/*Contract*/
				sink.properties(safeRef(props_68));
				sink.start(_M_SendTerms);
				sink.copy(sub_663.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendArgumentsOpt, props_68, term_2560);
	}

	final public static boolean _M_ThenSendArgumentsOpt(Sink sink, int shared, int depth, Properties props_54, Term term_1934, Term term_2475)
	{
		if (depth < 2000)
		{
			label_105 :
			{
				if (term_1934.descriptor() != _M_OK)
				{
					break label_105;
				}
				/* #arguments?=term *//*Contract*/sink.properties(safeRef(props_54));
				sink.start(_M_SendArgumentsOpt);
				sink.copy(term_2475.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_ThenSendArgumentsOpt, props_54, term_1934, term_2475);
	}

	final public static boolean _M_SendConstructor(Sink sink, int shared, int depth, Properties props_10, Term term_1639, Term term_1955, Term term_3196, Term term_2994)
	{
		if (depth < 2000)
		{
			label_255 :
			{
				Term value_86 = props_10 == null ? null : props_10.lookup("$tail");
				if (value_86 == null)
				{
					break label_255;
				}
				value_86 = value_86.ref();
				Term value_113 = props_10 == null ? null : props_10.lookup("$sink");
				if (value_113 == null)
				{
					break label_255;
				}
				if (value_113.descriptor() != _M_TEXT)
				{
					break label_255;
				}
				Term sub_891 = value_113.sub(0).ref();
				/* #sink=sub */
				if (term_1639.descriptor() != _M_ANNOTATIONS)
				{
					break label_255;
				}
				Properties props_180 = safeRef(term_1639.properties());
				if (props_180 != null && props_180.lookup("@Function") != null)
				{
					break label_255;
				}
				/* #properties?=term */
				/* #constructor=term */
				/* #arguments?=term *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextEmbed);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_10));
				sink.start(_M_SendMaybeProperties);
				sink.copy(term_1955.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_2647;
				{
					BufferSink buf_1160 = sink.context().makeBuffer();
					buf_1160.start(_M_STRING);
					buf_1160.literal(1);
					buf_1160.end();
					term_2647 = buf_1160.term();
				}
				sink.propertyNamed("$LineLocation", term_2647);
				Term term_1752;
				{
					BufferSink buf_2536 = sink.context().makeBuffer();
					buf_2536.start(_M_STRING);
					buf_2536.literal(1);
					buf_2536.end();
					term_1752 = buf_2536.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1752);
				sink.start(_M__sTextCons);
				Term term_2520;
				{
					BufferSink buf_2003 = sink.context().makeBuffer();
					buf_2003.start(_M_STRING);
					buf_2003.literal(1);
					buf_2003.end();
					term_2520 = buf_2003.term();
				}
				sink.propertyNamed("$LineLocation", term_2520);
				Term term_2037;
				{
					BufferSink buf_1950 = sink.context().makeBuffer();
					buf_1950.start(_M_STRING);
					buf_1950.literal(1);
					buf_1950.end();
					term_2037 = buf_1950.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2037);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2119;
				{
					BufferSink buf_1539 = sink.context().makeBuffer();
					buf_1539.start(_M_STRING);
					buf_1539.literal(1);
					buf_1539.end();
					term_2119 = buf_1539.term();
				}
				sink.propertyNamed("$LineLocation", term_2119);
				Term term_2270;
				{
					BufferSink buf_2252 = sink.context().makeBuffer();
					buf_2252.start(_M_STRING);
					buf_2252.literal(40);
					buf_2252.end();
					term_2270 = buf_2252.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2270);
				sink.start(_M__sTextCons);
				Term term_2387;
				{
					BufferSink buf_2601 = sink.context().makeBuffer();
					buf_2601.start(_M_STRING);
					buf_2601.literal(1);
					buf_2601.end();
					term_2387 = buf_2601.term();
				}
				sink.propertyNamed("$LineLocation", term_2387);
				Term term_1842;
				{
					BufferSink buf_2132 = sink.context().makeBuffer();
					buf_2132.start(_M_STRING);
					buf_2132.literal(40);
					buf_2132.end();
					term_1842 = buf_2132.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1842);
				sink.start(_M__sTextEmbed);
				Term term_2351;
				{
					BufferSink buf_1694 = sink.context().makeBuffer();
					buf_1694.start(_M_STRING);
					buf_1694.literal(1);
					buf_1694.end();
					term_2351 = buf_1694.term();
				}
				sink.propertyNamed("$LineLocation", term_2351);
				Term term_2319;
				{
					BufferSink buf_2414 = sink.context().makeBuffer();
					buf_2414.start(_M_STRING);
					buf_2414.literal(40);
					buf_2414.end();
					term_2319 = buf_2414.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2319);
				sink.start(_M_AsText);
				sink.copy(sub_891.ref());
				sink.end();
				sink.end();
				Term term_2085;
				{
					BufferSink buf_2637 = sink.context().makeBuffer();
					buf_2637.start(_M_STRING);
					buf_2637.literal(2);
					buf_2637.end();
					term_2085 = buf_2637.term();
				}
				sink.propertyNamed("$LineLocation", term_2085);
				Term term_2440;
				{
					BufferSink buf_2460 = sink.context().makeBuffer();
					buf_2460.start(_M_STRING);
					buf_2460.literal(1);
					buf_2460.end();
					term_2440 = buf_2460.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2440);
				sink.start(_M__sTextCons);
				Term term_1929;
				{
					BufferSink buf_1798 = sink.context().makeBuffer();
					buf_1798.start(_M_STRING);
					buf_1798.literal(2);
					buf_1798.end();
					term_1929 = buf_1798.term();
				}
				sink.propertyNamed("$LineLocation", term_1929);
				Term term_1559;
				{
					BufferSink buf_1851 = sink.context().makeBuffer();
					buf_1851.start(_M_STRING);
					buf_1851.literal(1);
					buf_1851.end();
					term_1559 = buf_1851.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1559);
				sink.start(_M__sTextChars);
				sink.literal(".start(");
				sink.end();
				Term term_2578;
				{
					BufferSink buf_2176 = sink.context().makeBuffer();
					buf_2176.start(_M_STRING);
					buf_2176.literal(2);
					buf_2176.end();
					term_2578 = buf_2176.term();
				}
				sink.propertyNamed("$LineLocation", term_2578);
				Term term_2626;
				{
					BufferSink buf_2063 = sink.context().makeBuffer();
					buf_2063.start(_M_STRING);
					buf_2063.literal(8);
					buf_2063.end();
					term_2626 = buf_2063.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2626);
				sink.start(_M__sTextCons);
				Term term_1791;
				{
					BufferSink buf_1896 = sink.context().makeBuffer();
					buf_1896.start(_M_STRING);
					buf_1896.literal(2);
					buf_1896.end();
					term_1791 = buf_1896.term();
				}
				sink.propertyNamed("$LineLocation", term_1791);
				Term term_2533;
				{
					BufferSink buf_3078 = sink.context().makeBuffer();
					buf_3078.start(_M_STRING);
					buf_3078.literal(8);
					buf_3078.end();
					term_2533 = buf_3078.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2533);
				sink.start(_M__sTextEmbed);
				Term term_2701;
				{
					BufferSink buf_2346 = sink.context().makeBuffer();
					buf_2346.start(_M_STRING);
					buf_2346.literal(2);
					buf_2346.end();
					term_2701 = buf_2346.term();
				}
				sink.propertyNamed("$LineLocation", term_2701);
				Term term_3094;
				{
					BufferSink buf_1944 = sink.context().makeBuffer();
					buf_1944.start(_M_STRING);
					buf_1944.literal(8);
					buf_1944.end();
					term_3094 = buf_1944.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3094);
				sink.start(_M_AsText);
				sink.start(_M_Descriptor);
				sink.copy(term_3196.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_2820;
				{
					BufferSink buf_1858 = sink.context().makeBuffer();
					buf_1858.start(_M_STRING);
					buf_1858.literal(2);
					buf_1858.end();
					term_2820 = buf_1858.term();
				}
				sink.propertyNamed("$LineLocation", term_2820);
				Term term_2105;
				{
					BufferSink buf_2750 = sink.context().makeBuffer();
					buf_2750.start(_M_STRING);
					buf_2750.literal(15);
					buf_2750.end();
					term_2105 = buf_2750.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2105);
				sink.start(_M__sTextCons);
				Term term_2226;
				{
					BufferSink buf_2826 = sink.context().makeBuffer();
					buf_2826.start(_M_STRING);
					buf_2826.literal(2);
					buf_2826.end();
					term_2226 = buf_2826.term();
				}
				sink.propertyNamed("$LineLocation", term_2226);
				Term term_2558;
				{
					BufferSink buf_1636 = sink.context().makeBuffer();
					buf_1636.start(_M_STRING);
					buf_1636.literal(15);
					buf_1636.end();
					term_2558 = buf_1636.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2558);
				sink.start(_M__sTextChars);
				sink.literal(");");
				sink.end();
				Term term_2830;
				{
					BufferSink buf_2561 = sink.context().makeBuffer();
					buf_2561.start(_M_STRING);
					buf_2561.literal(2);
					buf_2561.end();
					term_2830 = buf_2561.term();
				}
				sink.propertyNamed("$LineLocation", term_2830);
				Term term_2436;
				{
					BufferSink buf_2730 = sink.context().makeBuffer();
					buf_2730.start(_M_STRING);
					buf_2730.literal(41);
					buf_2730.end();
					term_2436 = buf_2730.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2436);
				sink.start(_M__sTextCons);
				Term term_2240;
				{
					BufferSink buf_1379 = sink.context().makeBuffer();
					buf_1379.start(_M_STRING);
					buf_1379.literal(2);
					buf_1379.end();
					term_2240 = buf_1379.term();
				}
				sink.propertyNamed("$LineLocation", term_2240);
				Term term_1984;
				{
					BufferSink buf_2917 = sink.context().makeBuffer();
					buf_2917.start(_M_STRING);
					buf_2917.literal(41);
					buf_2917.end();
					term_1984 = buf_2917.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1984);
				sink.start(_M__sTextEmbed);
				Term term_1918;
				{
					BufferSink buf_1382 = sink.context().makeBuffer();
					buf_1382.start(_M_STRING);
					buf_1382.literal(2);
					buf_1382.end();
					term_1918 = buf_1382.term();
				}
				sink.propertyNamed("$LineLocation", term_1918);
				Term term_2139;
				{
					BufferSink buf_1962 = sink.context().makeBuffer();
					buf_1962.start(_M_STRING);
					buf_1962.literal(41);
					buf_1962.end();
					term_2139 = buf_1962.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2139);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_10));
				Term term_2020;
				{
					BufferSink buf_2185 = sink.context().makeBuffer();
					buf_2185.start(_M_NO);
					buf_2185.end();
					term_2020 = buf_2185.term();
				}
				sink.propertyNamed("$tail", term_2020);
				sink.start(_M_SendArgumentsOpt);
				sink.copy(term_2994.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_2380;
				{
					BufferSink buf_2301 = sink.context().makeBuffer();
					buf_2301.start(_M_STRING);
					buf_2301.literal(2);
					buf_2301.end();
					term_2380 = buf_2301.term();
				}
				sink.propertyNamed("$LineLocation", term_2380);
				Term term_2407;
				{
					BufferSink buf_1859 = sink.context().makeBuffer();
					buf_1859.start(_M_STRING);
					buf_1859.literal(43);
					buf_1859.end();
					term_2407 = buf_1859.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2407);
				sink.start(_M__sTextCons);
				Term term_2095;
				{
					BufferSink buf_2213 = sink.context().makeBuffer();
					buf_2213.start(_M_STRING);
					buf_2213.literal(2);
					buf_2213.end();
					term_2095 = buf_2213.term();
				}
				sink.propertyNamed("$LineLocation", term_2095);
				Term term_1630;
				{
					BufferSink buf_1958 = sink.context().makeBuffer();
					buf_1958.start(_M_STRING);
					buf_1958.literal(43);
					buf_1958.end();
					term_1630 = buf_1958.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1630);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1626;
				{
					BufferSink buf_2010 = sink.context().makeBuffer();
					buf_2010.start(_M_STRING);
					buf_2010.literal(2);
					buf_2010.end();
					term_1626 = buf_2010.term();
				}
				sink.propertyNamed("$LineLocation", term_1626);
				Term term_2069;
				{
					BufferSink buf_2511 = sink.context().makeBuffer();
					buf_2511.start(_M_STRING);
					buf_2511.literal(91);
					buf_2511.end();
					term_2069 = buf_2511.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2069);
				sink.start(_M__sTextCons);
				Term term_1789;
				{
					BufferSink buf_2259 = sink.context().makeBuffer();
					buf_2259.start(_M_STRING);
					buf_2259.literal(2);
					buf_2259.end();
					term_1789 = buf_2259.term();
				}
				sink.propertyNamed("$LineLocation", term_1789);
				Term term_2071;
				{
					BufferSink buf_2172 = sink.context().makeBuffer();
					buf_2172.start(_M_STRING);
					buf_2172.literal(91);
					buf_2172.end();
					term_2071 = buf_2172.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2071);
				sink.start(_M__sTextEmbed);
				Term term_2183;
				{
					BufferSink buf_2448 = sink.context().makeBuffer();
					buf_2448.start(_M_STRING);
					buf_2448.literal(2);
					buf_2448.end();
					term_2183 = buf_2448.term();
				}
				sink.propertyNamed("$LineLocation", term_2183);
				Term term_1695;
				{
					BufferSink buf_2781 = sink.context().makeBuffer();
					buf_2781.start(_M_STRING);
					buf_2781.literal(91);
					buf_2781.end();
					term_1695 = buf_2781.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1695);
				sink.start(_M_AsText);
				sink.copy(sub_891.ref());
				sink.end();
				sink.end();
				Term term_2012;
				{
					BufferSink buf_2050 = sink.context().makeBuffer();
					buf_2050.start(_M_STRING);
					buf_2050.literal(3);
					buf_2050.end();
					term_2012 = buf_2050.term();
				}
				sink.propertyNamed("$LineLocation", term_2012);
				Term term_2632;
				{
					BufferSink buf_2383 = sink.context().makeBuffer();
					buf_2383.start(_M_STRING);
					buf_2383.literal(1);
					buf_2383.end();
					term_2632 = buf_2383.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2632);
				sink.start(_M__sTextCons);
				Term term_2510;
				{
					BufferSink buf_2277 = sink.context().makeBuffer();
					buf_2277.start(_M_STRING);
					buf_2277.literal(3);
					buf_2277.end();
					term_2510 = buf_2277.term();
				}
				sink.propertyNamed("$LineLocation", term_2510);
				Term term_2185;
				{
					BufferSink buf_2090 = sink.context().makeBuffer();
					buf_2090.start(_M_STRING);
					buf_2090.literal(1);
					buf_2090.end();
					term_2185 = buf_2090.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2185);
				sink.start(_M__sTextChars);
				sink.literal(".end();");
				sink.end();
				Term term_2427;
				{
					BufferSink buf_1756 = sink.context().makeBuffer();
					buf_1756.start(_M_STRING);
					buf_1756.literal(3);
					buf_1756.end();
					term_2427 = buf_1756.term();
				}
				sink.propertyNamed("$LineLocation", term_2427);
				Term term_2307;
				{
					BufferSink buf_2165 = sink.context().makeBuffer();
					buf_2165.start(_M_STRING);
					buf_2165.literal(8);
					buf_2165.end();
					term_2307 = buf_2165.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2307);
				sink.start(_M__sTextCons);
				Term term_2802;
				{
					BufferSink buf_2023 = sink.context().makeBuffer();
					buf_2023.start(_M_STRING);
					buf_2023.literal(3);
					buf_2023.end();
					term_2802 = buf_2023.term();
				}
				sink.propertyNamed("$LineLocation", term_2802);
				Term term_2490;
				{
					BufferSink buf_1870 = sink.context().makeBuffer();
					buf_1870.start(_M_STRING);
					buf_1870.literal(8);
					buf_1870.end();
					term_2490 = buf_1870.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2490);
				sink.start(_M__sTextEmbed);
				Term term_1822;
				{
					BufferSink buf_1855 = sink.context().makeBuffer();
					buf_1855.start(_M_STRING);
					buf_1855.literal(3);
					buf_1855.end();
					term_1822 = buf_1855.term();
				}
				sink.propertyNamed("$LineLocation", term_1822);
				Term term_2683;
				{
					BufferSink buf_3014 = sink.context().makeBuffer();
					buf_3014.start(_M_STRING);
					buf_3014.literal(8);
					buf_3014.end();
					term_2683 = buf_3014.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2683);
				sink.start(_M_AsText);
				sink.start(_M_SendTail);
				sink.copy(value_86.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_2363;
				{
					BufferSink buf_2295 = sink.context().makeBuffer();
					buf_2295.start(_M_STRING);
					buf_2295.literal(3);
					buf_2295.end();
					term_2363 = buf_2295.term();
				}
				sink.propertyNamed("$LineLocation", term_2363);
				Term term_1916;
				{
					BufferSink buf_1850 = sink.context().makeBuffer();
					buf_1850.start(_M_STRING);
					buf_1850.literal(15);
					buf_1850.end();
					term_1916 = buf_1850.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1916);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_221 :
			{
				Term value_161 = props_10 == null ? null : props_10.lookup("$tail");
				if (value_161 == null)
				{
					break label_221;
				}
				value_161 = value_161.ref();
				Term value_14 = props_10 == null ? null : props_10.lookup("$sink");
				if (value_14 == null)
				{
					break label_221;
				}
				if (value_14.descriptor() != _M_TEXT)
				{
					break label_221;
				}
				Term sub_576 = value_14.sub(0).ref();
				/* #sink=sub */
				if (term_1639.descriptor() != _M_ANNOTATIONS)
				{
					break label_221;
				}
				Properties props_81 = safeRef(term_1639.properties());
				if (props_81 == null || props_81.lookup("@Function") == null)
				{
					break label_221;
				}
				/* #properties?=term */
				/* #constructor=term */
				/* #arguments?=term *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextEmbed);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_10));
				sink.start(_M_SendMaybeProperties);
				sink.copy(term_1955.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_2898;
				{
					BufferSink buf_2455 = sink.context().makeBuffer();
					buf_2455.start(_M_STRING);
					buf_2455.literal(1);
					buf_2455.end();
					term_2898 = buf_2455.term();
				}
				sink.propertyNamed("$LineLocation", term_2898);
				Term term_1866;
				{
					BufferSink buf_2308 = sink.context().makeBuffer();
					buf_2308.start(_M_STRING);
					buf_2308.literal(1);
					buf_2308.end();
					term_1866 = buf_2308.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1866);
				sink.start(_M__sTextCons);
				Term term_2243;
				{
					BufferSink buf_2404 = sink.context().makeBuffer();
					buf_2404.start(_M_STRING);
					buf_2404.literal(1);
					buf_2404.end();
					term_2243 = buf_2404.term();
				}
				sink.propertyNamed("$LineLocation", term_2243);
				Term term_2773;
				{
					BufferSink buf_3096 = sink.context().makeBuffer();
					buf_3096.start(_M_STRING);
					buf_3096.literal(1);
					buf_3096.end();
					term_2773 = buf_3096.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2773);
				sink.start(_M__sTextChars);
				sink.literal(" ");
				sink.end();
				Term term_2368;
				{
					BufferSink buf_1741 = sink.context().makeBuffer();
					buf_1741.start(_M_STRING);
					buf_1741.literal(1);
					buf_1741.end();
					term_2368 = buf_1741.term();
				}
				sink.propertyNamed("$LineLocation", term_2368);
				Term term_2592;
				{
					BufferSink buf_2362 = sink.context().makeBuffer();
					buf_2362.start(_M_STRING);
					buf_2362.literal(40);
					buf_2362.end();
					term_2592 = buf_2362.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2592);
				sink.start(_M__sTextCons);
				Term term_2450;
				{
					BufferSink buf_2717 = sink.context().makeBuffer();
					buf_2717.start(_M_STRING);
					buf_2717.literal(1);
					buf_2717.end();
					term_2450 = buf_2717.term();
				}
				sink.propertyNamed("$LineLocation", term_2450);
				Term term_2026;
				{
					BufferSink buf_2291 = sink.context().makeBuffer();
					buf_2291.start(_M_STRING);
					buf_2291.literal(40);
					buf_2291.end();
					term_2026 = buf_2291.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2026);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2141;
				{
					BufferSink buf_2091 = sink.context().makeBuffer();
					buf_2091.start(_M_STRING);
					buf_2091.literal(1);
					buf_2091.end();
					term_2141 = buf_2091.term();
				}
				sink.propertyNamed("$LineLocation", term_2141);
				Term term_2120;
				{
					BufferSink buf_2447 = sink.context().makeBuffer();
					buf_2447.start(_M_STRING);
					buf_2447.literal(41);
					buf_2447.end();
					term_2120 = buf_2447.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2120);
				sink.start(_M__sTextCons);
				Term term_2779;
				{
					BufferSink buf_2094 = sink.context().makeBuffer();
					buf_2094.start(_M_STRING);
					buf_2094.literal(1);
					buf_2094.end();
					term_2779 = buf_2094.term();
				}
				sink.propertyNamed("$LineLocation", term_2779);
				Term term_2129;
				{
					BufferSink buf_2294 = sink.context().makeBuffer();
					buf_2294.start(_M_STRING);
					buf_2294.literal(41);
					buf_2294.end();
					term_2129 = buf_2294.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2129);
				sink.start(_M__sTextEmbed);
				Term term_2587;
				{
					BufferSink buf_2171 = sink.context().makeBuffer();
					buf_2171.start(_M_STRING);
					buf_2171.literal(1);
					buf_2171.end();
					term_2587 = buf_2171.term();
				}
				sink.propertyNamed("$LineLocation", term_2587);
				Term term_2065;
				{
					BufferSink buf_2135 = sink.context().makeBuffer();
					buf_2135.start(_M_STRING);
					buf_2135.literal(41);
					buf_2135.end();
					term_2065 = buf_2135.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2065);
				sink.start(_M_AsText);
				sink.copy(sub_576.ref());
				sink.end();
				sink.end();
				Term term_2111;
				{
					BufferSink buf_2465 = sink.context().makeBuffer();
					buf_2465.start(_M_STRING);
					buf_2465.literal(2);
					buf_2465.end();
					term_2111 = buf_2465.term();
				}
				sink.propertyNamed("$LineLocation", term_2111);
				Term term_2763;
				{
					BufferSink buf_1421 = sink.context().makeBuffer();
					buf_1421.start(_M_STRING);
					buf_1421.literal(1);
					buf_1421.end();
					term_2763 = buf_1421.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2763);
				sink.start(_M__sTextCons);
				Term term_1931;
				{
					BufferSink buf_1273 = sink.context().makeBuffer();
					buf_1273.start(_M_STRING);
					buf_1273.literal(2);
					buf_1273.end();
					term_1931 = buf_1273.term();
				}
				sink.propertyNamed("$LineLocation", term_1931);
				Term term_2501;
				{
					BufferSink buf_2390 = sink.context().makeBuffer();
					buf_2390.start(_M_STRING);
					buf_2390.literal(1);
					buf_2390.end();
					term_2501 = buf_2390.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2501);
				sink.start(_M__sTextChars);
				sink.literal(".start(");
				sink.end();
				Term term_2221;
				{
					BufferSink buf_2235 = sink.context().makeBuffer();
					buf_2235.start(_M_STRING);
					buf_2235.literal(2);
					buf_2235.end();
					term_2221 = buf_2235.term();
				}
				sink.propertyNamed("$LineLocation", term_2221);
				Term term_1818;
				{
					BufferSink buf_2180 = sink.context().makeBuffer();
					buf_2180.start(_M_STRING);
					buf_2180.literal(8);
					buf_2180.end();
					term_1818 = buf_2180.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1818);
				sink.start(_M__sTextCons);
				Term term_2881;
				{
					BufferSink buf_2643 = sink.context().makeBuffer();
					buf_2643.start(_M_STRING);
					buf_2643.literal(2);
					buf_2643.end();
					term_2881 = buf_2643.term();
				}
				sink.propertyNamed("$LineLocation", term_2881);
				Term term_1979;
				{
					BufferSink buf_2794 = sink.context().makeBuffer();
					buf_2794.start(_M_STRING);
					buf_2794.literal(8);
					buf_2794.end();
					term_1979 = buf_2794.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1979);
				sink.start(_M__sTextEmbed);
				Term term_2325;
				{
					BufferSink buf_2355 = sink.context().makeBuffer();
					buf_2355.start(_M_STRING);
					buf_2355.literal(2);
					buf_2355.end();
					term_2325 = buf_2355.term();
				}
				sink.propertyNamed("$LineLocation", term_2325);
				Term term_2331;
				{
					BufferSink buf_2088 = sink.context().makeBuffer();
					buf_2088.start(_M_STRING);
					buf_2088.literal(8);
					buf_2088.end();
					term_2331 = buf_2088.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2331);
				sink.start(_M_AsText);
				sink.start(_M_Descriptor);
				sink.copy(term_3196.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_1833;
				{
					BufferSink buf_2086 = sink.context().makeBuffer();
					buf_2086.start(_M_STRING);
					buf_2086.literal(2);
					buf_2086.end();
					term_1833 = buf_2086.term();
				}
				sink.propertyNamed("$LineLocation", term_1833);
				Term term_3531;
				{
					BufferSink buf_2325 = sink.context().makeBuffer();
					buf_2325.start(_M_STRING);
					buf_2325.literal(15);
					buf_2325.end();
					term_3531 = buf_2325.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3531);
				sink.start(_M__sTextCons);
				Term term_1671;
				{
					BufferSink buf_2173 = sink.context().makeBuffer();
					buf_2173.start(_M_STRING);
					buf_2173.literal(2);
					buf_2173.end();
					term_1671 = buf_2173.term();
				}
				sink.propertyNamed("$LineLocation", term_1671);
				Term term_2184;
				{
					BufferSink buf_2406 = sink.context().makeBuffer();
					buf_2406.start(_M_STRING);
					buf_2406.literal(15);
					buf_2406.end();
					term_2184 = buf_2406.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2184);
				sink.start(_M__sTextChars);
				sink.literal(");");
				sink.end();
				Term term_2040;
				{
					BufferSink buf_2339 = sink.context().makeBuffer();
					buf_2339.start(_M_STRING);
					buf_2339.literal(2);
					buf_2339.end();
					term_2040 = buf_2339.term();
				}
				sink.propertyNamed("$LineLocation", term_2040);
				Term term_2269;
				{
					BufferSink buf_1440 = sink.context().makeBuffer();
					buf_1440.start(_M_STRING);
					buf_1440.literal(41);
					buf_1440.end();
					term_2269 = buf_1440.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2269);
				sink.start(_M__sTextCons);
				Term term_2608;
				{
					BufferSink buf_1931 = sink.context().makeBuffer();
					buf_1931.start(_M_STRING);
					buf_1931.literal(2);
					buf_1931.end();
					term_2608 = buf_1931.term();
				}
				sink.propertyNamed("$LineLocation", term_2608);
				Term term_2054;
				{
					BufferSink buf_1703 = sink.context().makeBuffer();
					buf_1703.start(_M_STRING);
					buf_1703.literal(41);
					buf_1703.end();
					term_2054 = buf_1703.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2054);
				sink.start(_M__sTextEmbed);
				Term term_2712;
				{
					BufferSink buf_2297 = sink.context().makeBuffer();
					buf_2297.start(_M_STRING);
					buf_2297.literal(2);
					buf_2297.end();
					term_2712 = buf_2297.term();
				}
				sink.propertyNamed("$LineLocation", term_2712);
				Term term_2428;
				{
					BufferSink buf_2211 = sink.context().makeBuffer();
					buf_2211.start(_M_STRING);
					buf_2211.literal(41);
					buf_2211.end();
					term_2428 = buf_2211.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2428);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_10));
				Term term_2337;
				{
					BufferSink buf_2208 = sink.context().makeBuffer();
					buf_2208.start(_M_NO);
					buf_2208.end();
					term_2337 = buf_2208.term();
				}
				sink.propertyNamed("$tail", term_2337);
				sink.start(_M_SendArgumentsOpt);
				sink.copy(term_2994.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_2575;
				{
					BufferSink buf_2305 = sink.context().makeBuffer();
					buf_2305.start(_M_STRING);
					buf_2305.literal(2);
					buf_2305.end();
					term_2575 = buf_2305.term();
				}
				sink.propertyNamed("$LineLocation", term_2575);
				Term term_1945;
				{
					BufferSink buf_2751 = sink.context().makeBuffer();
					buf_2751.start(_M_STRING);
					buf_2751.literal(43);
					buf_2751.end();
					term_1945 = buf_2751.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1945);
				sink.start(_M__sTextCons);
				Term term_2213;
				{
					BufferSink buf_1882 = sink.context().makeBuffer();
					buf_1882.start(_M_STRING);
					buf_1882.literal(2);
					buf_1882.end();
					term_2213 = buf_1882.term();
				}
				sink.propertyNamed("$LineLocation", term_2213);
				Term term_2924;
				{
					BufferSink buf_3091 = sink.context().makeBuffer();
					buf_3091.start(_M_STRING);
					buf_3091.literal(43);
					buf_3091.end();
					term_2924 = buf_3091.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2924);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2878;
				{
					BufferSink buf_1814 = sink.context().makeBuffer();
					buf_1814.start(_M_STRING);
					buf_1814.literal(2);
					buf_1814.end();
					term_2878 = buf_1814.term();
				}
				sink.propertyNamed("$LineLocation", term_2878);
				Term term_2254;
				{
					BufferSink buf_1729 = sink.context().makeBuffer();
					buf_1729.start(_M_STRING);
					buf_1729.literal(91);
					buf_1729.end();
					term_2254 = buf_1729.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2254);
				sink.start(_M__sTextCons);
				Term term_2496;
				{
					BufferSink buf_1898 = sink.context().makeBuffer();
					buf_1898.start(_M_STRING);
					buf_1898.literal(2);
					buf_1898.end();
					term_2496 = buf_1898.term();
				}
				sink.propertyNamed("$LineLocation", term_2496);
				Term term_2074;
				{
					BufferSink buf_2226 = sink.context().makeBuffer();
					buf_2226.start(_M_STRING);
					buf_2226.literal(91);
					buf_2226.end();
					term_2074 = buf_2226.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2074);
				sink.start(_M__sTextEmbed);
				Term term_2658;
				{
					BufferSink buf_2667 = sink.context().makeBuffer();
					buf_2667.start(_M_STRING);
					buf_2667.literal(2);
					buf_2667.end();
					term_2658 = buf_2667.term();
				}
				sink.propertyNamed("$LineLocation", term_2658);
				Term term_1909;
				{
					BufferSink buf_1598 = sink.context().makeBuffer();
					buf_1598.start(_M_STRING);
					buf_1598.literal(91);
					buf_1598.end();
					term_1909 = buf_1598.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1909);
				sink.start(_M_AsText);
				sink.copy(sub_576.ref());
				sink.end();
				sink.end();
				Term term_2173;
				{
					BufferSink buf_2140 = sink.context().makeBuffer();
					buf_2140.start(_M_STRING);
					buf_2140.literal(3);
					buf_2140.end();
					term_2173 = buf_2140.term();
				}
				sink.propertyNamed("$LineLocation", term_2173);
				Term term_1978;
				{
					BufferSink buf_2365 = sink.context().makeBuffer();
					buf_2365.start(_M_STRING);
					buf_2365.literal(1);
					buf_2365.end();
					term_1978 = buf_2365.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1978);
				sink.start(_M__sTextCons);
				Term term_2719;
				{
					BufferSink buf_1673 = sink.context().makeBuffer();
					buf_1673.start(_M_STRING);
					buf_1673.literal(3);
					buf_1673.end();
					term_2719 = buf_1673.term();
				}
				sink.propertyNamed("$LineLocation", term_2719);
				Term term_2800;
				{
					BufferSink buf_1906 = sink.context().makeBuffer();
					buf_1906.start(_M_STRING);
					buf_1906.literal(1);
					buf_1906.end();
					term_2800 = buf_1906.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2800);
				sink.start(_M__sTextChars);
				sink.literal(".end();");
				sink.end();
				Term term_2090;
				{
					BufferSink buf_2389 = sink.context().makeBuffer();
					buf_2389.start(_M_STRING);
					buf_2389.literal(3);
					buf_2389.end();
					term_2090 = buf_2389.term();
				}
				sink.propertyNamed("$LineLocation", term_2090);
				Term term_1547;
				{
					BufferSink buf_2356 = sink.context().makeBuffer();
					buf_2356.start(_M_STRING);
					buf_2356.literal(8);
					buf_2356.end();
					term_1547 = buf_2356.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1547);
				sink.start(_M__sTextCons);
				Term term_2643;
				{
					BufferSink buf_2600 = sink.context().makeBuffer();
					buf_2600.start(_M_STRING);
					buf_2600.literal(3);
					buf_2600.end();
					term_2643 = buf_2600.term();
				}
				sink.propertyNamed("$LineLocation", term_2643);
				Term term_2454;
				{
					BufferSink buf_1935 = sink.context().makeBuffer();
					buf_1935.start(_M_STRING);
					buf_1935.literal(8);
					buf_1935.end();
					term_2454 = buf_1935.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2454);
				sink.start(_M__sTextEmbed);
				Term term_2035;
				{
					BufferSink buf_3112 = sink.context().makeBuffer();
					buf_3112.start(_M_STRING);
					buf_3112.literal(3);
					buf_3112.end();
					term_2035 = buf_3112.term();
				}
				sink.propertyNamed("$LineLocation", term_2035);
				Term term_2682;
				{
					BufferSink buf_2157 = sink.context().makeBuffer();
					buf_2157.start(_M_STRING);
					buf_2157.literal(8);
					buf_2157.end();
					term_2682 = buf_2157.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2682);
				sink.start(_M_AsText);
				sink.start(_M_SendTail);
				sink.copy(value_161.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_2265;
				{
					BufferSink buf_2681 = sink.context().makeBuffer();
					buf_2681.start(_M_STRING);
					buf_2681.literal(3);
					buf_2681.end();
					term_2265 = buf_2681.term();
				}
				sink.propertyNamed("$LineLocation", term_2265);
				Term term_2388;
				{
					BufferSink buf_2553 = sink.context().makeBuffer();
					buf_2553.start(_M_STRING);
					buf_2553.literal(15);
					buf_2553.end();
					term_2388 = buf_2553.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2388);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendConstructor, props_10, term_1639, term_1955, term_3196, term_2994);
	}

	final public static boolean _M_SendFreeTerm(Sink sink, int shared, int depth, Properties props_64, Term term_2379)
	{
		if (depth < 2000)
		{
			label_351 :
			{
				if (term_2379.descriptor() != _M_Crsx_xfreeTerm_xA1)
				{
					break label_351;
				}
				Term sub_750 = term_2379.sub(0).ref();
				/* #annotations?=sub */Term sub_721 = term_2379.sub(1).ref();
				/* #properties?=sub */Term sub_379 = term_2379.sub(2).ref();
				/* #constructor=sub */Term sub_551 = term_2379.sub(3).ref();
				/* #arguments?=sub *//*Contract*/sink.properties(safeRef(props_64));
				sink.start(_M_SendConstructor);
				sink.start(_M_IndexAnnotations);
				sink.copy(sub_750.ref());
				sink.end();
				sink.copy(sub_721.ref());
				sink.copy(sub_379.ref());
				sink.copy(sub_551.ref());
				sink.end();
				return true;
			}
			label_191 :
			{
				if (term_2379.descriptor() != _M_Crsx_xfreeTerm_xA2)
				{
					break label_191;
				}
				Term sub_837 = term_2379.sub(0).ref();
				/* #annotations?=sub */Term sub_233 = term_2379.sub(1).ref();
				/* #properties?=sub */Term sub_587 = term_2379.sub(2).ref();
				/* #constructor=sub */Term sub_838 = term_2379.sub(3).ref();
				/* #term=sub *//*Contract*/sink.properties(safeRef(props_64));
				sink.start(_M_SendFreeTerm);
				sink.start(_M_Crsx_xfreeTerm_xA1);
				sink.copy(sub_837.ref());
				sink.copy(sub_233.ref());
				sink.copy(sub_587.ref());
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xarguments);
				sink.literal("[");
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xterms);
				sink.copy(sub_838.ref());
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.literal("]");
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_172 :
			{
				Term value_54 = props_64 == null ? null : props_64.lookup("$sink");
				if (value_54 == null)
				{
					break label_172;
				}
				if (value_54.descriptor() != _M_TEXT)
				{
					break label_172;
				}
				Term sub_492 = value_54.sub(0).ref();
				/* #sink=sub */
				Term value_194 = props_64 == null ? null : props_64.lookup("$tail");
				if (value_194 == null)
				{
					break label_172;
				}
				value_194 = value_194.ref();
				if (term_2379.descriptor() != _M_Crsx_xfreeTerm_xA3)
				{
					break label_172;
				}
				Term sub_470 = term_2379.sub(0).ref();
				/* #annotations?=sub */Term sub_273 = term_2379.sub(1).ref();
				/* #properties?=sub */Term sub_484 = term_2379.sub(2).ref();
				/* #literal=sub *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2225;
				{
					BufferSink buf_2212 = sink.context().makeBuffer();
					buf_2212.start(_M_STRING);
					buf_2212.literal(1);
					buf_2212.end();
					term_2225 = buf_2212.term();
				}
				sink.propertyNamed("$LineLocation", term_2225);
				Term term_1871;
				{
					BufferSink buf_1908 = sink.context().makeBuffer();
					buf_1908.start(_M_STRING);
					buf_1908.literal(1);
					buf_1908.end();
					term_1871 = buf_1908.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1871);
				sink.start(_M__sTextCons);
				Term term_2559;
				{
					BufferSink buf_2496 = sink.context().makeBuffer();
					buf_2496.start(_M_STRING);
					buf_2496.literal(1);
					buf_2496.end();
					term_2559 = buf_2496.term();
				}
				sink.propertyNamed("$LineLocation", term_2559);
				Term term_2480;
				{
					BufferSink buf_2367 = sink.context().makeBuffer();
					buf_2367.start(_M_STRING);
					buf_2367.literal(1);
					buf_2367.end();
					term_2480 = buf_2367.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2480);
				sink.start(_M__sTextEmbed);
				Term term_1817;
				{
					BufferSink buf_2028 = sink.context().makeBuffer();
					buf_2028.start(_M_STRING);
					buf_2028.literal(1);
					buf_2028.end();
					term_1817 = buf_2028.term();
				}
				sink.propertyNamed("$LineLocation", term_1817);
				Term term_3059;
				{
					BufferSink buf_2229 = sink.context().makeBuffer();
					buf_2229.start(_M_STRING);
					buf_2229.literal(1);
					buf_2229.end();
					term_3059 = buf_2229.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3059);
				sink.start(_M_AsText);
				sink.copy(sub_492.ref());
				sink.end();
				sink.end();
				Term term_2749;
				{
					BufferSink buf_3052 = sink.context().makeBuffer();
					buf_3052.start(_M_STRING);
					buf_3052.literal(1);
					buf_3052.end();
					term_2749 = buf_3052.term();
				}
				sink.propertyNamed("$LineLocation", term_2749);
				Term term_3144;
				{
					BufferSink buf_1830 = sink.context().makeBuffer();
					buf_1830.start(_M_STRING);
					buf_1830.literal(2);
					buf_1830.end();
					term_3144 = buf_1830.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3144);
				sink.start(_M__sTextCons);
				Term term_2415;
				{
					BufferSink buf_2436 = sink.context().makeBuffer();
					buf_2436.start(_M_STRING);
					buf_2436.literal(1);
					buf_2436.end();
					term_2415 = buf_2436.term();
				}
				sink.propertyNamed("$LineLocation", term_2415);
				Term term_2976;
				{
					BufferSink buf_1978 = sink.context().makeBuffer();
					buf_1978.start(_M_STRING);
					buf_1978.literal(2);
					buf_1978.end();
					term_2976 = buf_1978.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2976);
				sink.start(_M__sTextChars);
				sink.literal(".literal(");
				sink.end();
				Term term_2209;
				{
					BufferSink buf_1761 = sink.context().makeBuffer();
					buf_1761.start(_M_STRING);
					buf_1761.literal(1);
					buf_1761.end();
					term_2209 = buf_1761.term();
				}
				sink.propertyNamed("$LineLocation", term_2209);
				Term term_2393;
				{
					BufferSink buf_1567 = sink.context().makeBuffer();
					buf_1567.start(_M_STRING);
					buf_1567.literal(9);
					buf_1567.end();
					term_2393 = buf_1567.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2393);
				sink.start(_M__sTextCons);
				Term term_3198;
				{
					BufferSink buf_2378 = sink.context().makeBuffer();
					buf_2378.start(_M_STRING);
					buf_2378.literal(1);
					buf_2378.end();
					term_3198 = buf_2378.term();
				}
				sink.propertyNamed("$LineLocation", term_3198);
				Term term_2299;
				{
					BufferSink buf_1795 = sink.context().makeBuffer();
					buf_1795.start(_M_STRING);
					buf_1795.literal(9);
					buf_1795.end();
					term_2299 = buf_1795.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2299);
				sink.start(_M__sTextEmbed);
				Term term_2247;
				{
					BufferSink buf_2220 = sink.context().makeBuffer();
					buf_2220.start(_M_STRING);
					buf_2220.literal(1);
					buf_2220.end();
					term_2247 = buf_2220.term();
				}
				sink.propertyNamed("$LineLocation", term_2247);
				Term term_2718;
				{
					BufferSink buf_2486 = sink.context().makeBuffer();
					buf_2486.start(_M_STRING);
					buf_2486.literal(9);
					buf_2486.end();
					term_2718 = buf_2486.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2718);
				sink.start(_M_AsText);
				sink.start(_M_Literal);
				sink.copy(sub_484.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_1727;
				{
					BufferSink buf_2959 = sink.context().makeBuffer();
					buf_2959.start(_M_STRING);
					buf_2959.literal(1);
					buf_2959.end();
					term_1727 = buf_2959.term();
				}
				sink.propertyNamed("$LineLocation", term_1727);
				Term term_2367;
				{
					BufferSink buf_2148 = sink.context().makeBuffer();
					buf_2148.start(_M_STRING);
					buf_2148.literal(18);
					buf_2148.end();
					term_2367 = buf_2148.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2367);
				sink.start(_M__sTextCons);
				Term term_2786;
				{
					BufferSink buf_2302 = sink.context().makeBuffer();
					buf_2302.start(_M_STRING);
					buf_2302.literal(1);
					buf_2302.end();
					term_2786 = buf_2302.term();
				}
				sink.propertyNamed("$LineLocation", term_2786);
				Term term_2248;
				{
					BufferSink buf_2421 = sink.context().makeBuffer();
					buf_2421.start(_M_STRING);
					buf_2421.literal(18);
					buf_2421.end();
					term_2248 = buf_2421.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2248);
				sink.start(_M__sTextChars);
				sink.literal(");");
				sink.end();
				Term term_2754;
				{
					BufferSink buf_2659 = sink.context().makeBuffer();
					buf_2659.start(_M_STRING);
					buf_2659.literal(1);
					buf_2659.end();
					term_2754 = buf_2659.term();
				}
				sink.propertyNamed("$LineLocation", term_2754);
				Term term_2352;
				{
					BufferSink buf_2097 = sink.context().makeBuffer();
					buf_2097.start(_M_STRING);
					buf_2097.literal(37);
					buf_2097.end();
					term_2352 = buf_2097.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2352);
				sink.start(_M__sTextCons);
				Term term_1785;
				{
					BufferSink buf_2749 = sink.context().makeBuffer();
					buf_2749.start(_M_STRING);
					buf_2749.literal(1);
					buf_2749.end();
					term_1785 = buf_2749.term();
				}
				sink.propertyNamed("$LineLocation", term_1785);
				Term term_2287;
				{
					BufferSink buf_2454 = sink.context().makeBuffer();
					buf_2454.start(_M_STRING);
					buf_2454.literal(37);
					buf_2454.end();
					term_2287 = buf_2454.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2287);
				sink.start(_M__sTextEmbed);
				Term term_3220;
				{
					BufferSink buf_1994 = sink.context().makeBuffer();
					buf_1994.start(_M_STRING);
					buf_1994.literal(1);
					buf_1994.end();
					term_3220 = buf_1994.term();
				}
				sink.propertyNamed("$LineLocation", term_3220);
				Term term_2382;
				{
					BufferSink buf_2082 = sink.context().makeBuffer();
					buf_2082.start(_M_STRING);
					buf_2082.literal(37);
					buf_2082.end();
					term_2382 = buf_2082.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2382);
				sink.start(_M_AsText);
				sink.start(_M_SendTail);
				sink.copy(value_194.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_2356;
				{
					BufferSink buf_2649 = sink.context().makeBuffer();
					buf_2649.start(_M_STRING);
					buf_2649.literal(1);
					buf_2649.end();
					term_2356 = buf_2649.term();
				}
				sink.propertyNamed("$LineLocation", term_2356);
				Term term_2576;
				{
					BufferSink buf_2230 = sink.context().makeBuffer();
					buf_2230.start(_M_STRING);
					buf_2230.literal(39);
					buf_2230.end();
					term_2576 = buf_2230.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2576);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_142 :
			{
				if (term_2379.descriptor() != _M_Crsx_xfreeTerm_xA4)
				{
					break label_142;
				}
				Term sub_496 = term_2379.sub(0).ref();
				/* #annotations?=sub */Term sub_514 = term_2379.sub(1).ref();
				/* #list=sub *//*Contract*/sink.properties(safeRef(props_64));
				sink.start(_M_SendFreeTerm);
				sink.start(_M_DesugarList);
				sink.copy(sub_514.ref());
				sink.end();
				sink.end();
				return true;
			}
			label_380 :
			{
				if (term_2379.descriptor() != _M_Crsx_xfreeTerm_xA5)
				{
					break label_380;
				}
				Term sub_378 = term_2379.sub(0).ref();
				/* #annotations?=sub */Term sub_230 = term_2379.sub(1).ref();
				if (sub_230.descriptor() != _M_Crsx_xvariable)
				{
					break label_380;
				}
				Term sub_329 = sub_230.sub(0).ref();
				if (sub_329.descriptor() != _M__sNil)
				{
					break label_380;
				}
				Term sub_231 = sub_230.sub(1).ref();
				/* #VARIABLE=sub */Term sub_620 = sub_230.sub(2).ref();
				/* #linear?=sub */Term sub_641 = sub_230.sub(3).ref();
				/* #functional?=sub */Term sub_494 = sub_230.sub(4).ref();
				/* #varsort?=sub *//*Contract*/sink.properties(safeRef(props_64));
				sink.start(_M_SendVariable);
				sink.start(_M_VarKey);
				sink.start(_M_Crsx_xvariable);
				sink.start(_M__sNil);
				sink.end();
				sink.copy(sub_231.ref());
				sink.copy(sub_620.ref());
				sink.copy(sub_641.ref());
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_165 :
			{
				if (term_2379.descriptor() != _M_Crsx_xfreeTerm_xA6)
				{
					break label_165;
				}
				Term sub_599 = term_2379.sub(0).ref();
				/* #annotations?=sub */Term sub_882 = term_2379.sub(1).ref();
				/* #properties=sub *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.literal("Named data structure not implemented yet.");
				sink.end();
				return true;
			}
			label_138 :
			{
				Term value_134 = props_64 == null ? null : props_64.lookup("$tail");
				if (value_134 == null)
				{
					break label_138;
				}
				value_134 = value_134.ref();
				if (term_2379.descriptor() != _M_Crsx_xfreeTerm_xA7)
				{
					break label_138;
				}
				Term sub_485 = term_2379.sub(0).ref();
				/* #annotations?=sub */Term sub_644 = term_2379.sub(1).ref();
				/* #properties?=sub */Term sub_325 = term_2379.sub(2).ref();
				/* #METAVAR=sub */Term sub_295 = term_2379.sub(3).ref();
				/* #freeArguments?=sub *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextEmbed);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_64));
				Term term_2216;
				{
					BufferSink buf_1609 = sink.context().makeBuffer();
					buf_1609.start(_M_NO);
					buf_1609.end();
					term_2216 = buf_1609.term();
				}
				sink.propertyNamed("$tail", term_2216);
				sink.start(_M_SendMaybeProperties);
				sink.copy(sub_644.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_2438;
				{
					BufferSink buf_2474 = sink.context().makeBuffer();
					buf_2474.start(_M_STRING);
					buf_2474.literal(1);
					buf_2474.end();
					term_2438 = buf_2474.term();
				}
				sink.propertyNamed("$LineLocation", term_2438);
				Term term_2188;
				{
					BufferSink buf_2439 = sink.context().makeBuffer();
					buf_2439.start(_M_STRING);
					buf_2439.literal(1);
					buf_2439.end();
					term_2188 = buf_2439.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2188);
				sink.start(_M__sTextCons);
				Term term_2433;
				{
					BufferSink buf_2193 = sink.context().makeBuffer();
					buf_2193.start(_M_STRING);
					buf_2193.literal(1);
					buf_2193.end();
					term_2433 = buf_2193.term();
				}
				sink.propertyNamed("$LineLocation", term_2433);
				Term term_2452;
				{
					BufferSink buf_2572 = sink.context().makeBuffer();
					buf_2572.start(_M_STRING);
					buf_2572.literal(1);
					buf_2572.end();
					term_2452 = buf_2572.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2452);
				sink.start(_M__sTextEmbed);
				Term term_2699;
				{
					BufferSink buf_2652 = sink.context().makeBuffer();
					buf_2652.start(_M_STRING);
					buf_2652.literal(1);
					buf_2652.end();
					term_2699 = buf_2652.term();
				}
				sink.propertyNamed("$LineLocation", term_2699);
				Term term_2741;
				{
					BufferSink buf_2450 = sink.context().makeBuffer();
					buf_2450.start(_M_STRING);
					buf_2450.literal(1);
					buf_2450.end();
					term_2741 = buf_2450.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2741);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_64));
				Term term_3068;
				{
					BufferSink buf_1763 = sink.context().makeBuffer();
					buf_1763.start(_M_NO);
					buf_1763.end();
					term_3068 = buf_1763.term();
				}
				sink.propertyNamed("$tail", term_3068);
				sink.start(_M_SendMeta);
				sink.copy(sub_325.ref());
				sink.copy(sub_295.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_2856;
				{
					BufferSink buf_2198 = sink.context().makeBuffer();
					buf_2198.start(_M_STRING);
					buf_2198.literal(1);
					buf_2198.end();
					term_2856 = buf_2198.term();
				}
				sink.propertyNamed("$LineLocation", term_2856);
				Term term_2401;
				{
					BufferSink buf_2200 = sink.context().makeBuffer();
					buf_2200.start(_M_STRING);
					buf_2200.literal(53);
					buf_2200.end();
					term_2401 = buf_2200.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2401);
				sink.start(_M__sTextCons);
				Term term_1982;
				{
					BufferSink buf_2072 = sink.context().makeBuffer();
					buf_2072.start(_M_STRING);
					buf_2072.literal(1);
					buf_2072.end();
					term_1982 = buf_2072.term();
				}
				sink.propertyNamed("$LineLocation", term_1982);
				Term term_2418;
				{
					BufferSink buf_2913 = sink.context().makeBuffer();
					buf_2913.start(_M_STRING);
					buf_2913.literal(53);
					buf_2913.end();
					term_2418 = buf_2913.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2418);
				sink.start(_M__sTextEmbed);
				Term term_2284;
				{
					BufferSink buf_1823 = sink.context().makeBuffer();
					buf_1823.start(_M_STRING);
					buf_1823.literal(1);
					buf_1823.end();
					term_2284 = buf_1823.term();
				}
				sink.propertyNamed("$LineLocation", term_2284);
				Term term_1511;
				{
					BufferSink buf_2412 = sink.context().makeBuffer();
					buf_2412.start(_M_STRING);
					buf_2412.literal(53);
					buf_2412.end();
					term_1511 = buf_2412.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1511);
				sink.start(_M_AsText);
				sink.start(_M_SendTail);
				sink.copy(value_134.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_2358;
				{
					BufferSink buf_2671 = sink.context().makeBuffer();
					buf_2671.start(_M_STRING);
					buf_2671.literal(1);
					buf_2671.end();
					term_2358 = buf_2671.term();
				}
				sink.propertyNamed("$LineLocation", term_2358);
				Term term_2261;
				{
					BufferSink buf_1862 = sink.context().makeBuffer();
					buf_1862.start(_M_STRING);
					buf_1862.literal(107);
					buf_1862.end();
					term_2261 = buf_1862.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2261);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_479 :
			{
				if (term_2379.descriptor() != _M_Crsx_xfreeTerm_xA9)
				{
					break label_479;
				}
				Term sub_673 = term_2379.sub(0).ref();
				/* #annotations?=sub */Term sub_822 = term_2379.sub(1).ref();
				/* #properties?=sub */Term sub_905 = term_2379.sub(2).ref();
				if (sub_905.descriptor() != _M_Crsx_xexpression)
				{
					break label_479;
				}
				Term sub_997 = sub_905.sub(0).ref();
				/* #dispatch=sub *//*Contract*/sink.properties(safeRef(props_64));
				sink.start(_M_SendDispatch);
				sink.copy(sub_997.ref());
				sink.end();
				return true;
			}
			label_59 :
			{
				if (term_2379.descriptor() != _M_Crsx_xfreeTerm_xA9)
				{
					break label_59;
				}
				Term sub_472 = term_2379.sub(0).ref();
				/* #annotations?=sub */Term sub_623 = term_2379.sub(1).ref();
				/* #properties?=sub */Term sub_367 = term_2379.sub(2).ref();
				/* #expression=sub *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.start(_M__s);
				sink.start(_M_Builtin_sColon);
				sink.end();
				sink.literal("Expression not implemented yet: ");
				sink.start(_M__s);
				sink.start(_M_Builtin_sShow);
				sink.end();
				sink.copy(sub_367.ref());
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendFreeTerm, props_64, term_2379);
	}

	final public static boolean _M_SendTerm(Sink sink, int shared, int depth, Properties props_90, Term term_2178)
	{
		if (depth < 2000)
		{
			label_182 :
			{
				if (term_2178.descriptor() != _M_Crsx_xterm_xA1)
				{
					break label_182;
				}
				Term sub_769 = term_2178.sub(0).ref();
				/* #freeTerm=sub *//*Contract*/sink.properties(safeRef(props_90));
				Term term_1956;
				{
					BufferSink buf_2371 = sink.context().makeBuffer();
					buf_2371.start(_M_TEXTS);
					buf_2371.start(_M__sNil);
					buf_2371.end();
					buf_2371.end();
					term_1956 = buf_2371.term();
				}
				sink.propertyNamed("$binders", term_1956);
				sink.start(_M_SendFreeTerm);
				sink.copy(sub_769.ref());
				sink.end();
				return true;
			}
			label_108 :
			{
				if (term_2178.descriptor() != _M_Crsx_xterm_xA2)
				{
					break label_108;
				}
				Term sub_845 = term_2178.sub(0).ref();
				if (sub_845.descriptor() != _M_Crsx_xboundTerm)
				{
					break label_108;
				}
				Term sub_381 = sub_845.sub(0).ref();
				/* #binder=sub */Term sub_863 = sub_845.sub(1).ref();
				/* #nextBinder=sub *//*Contract*/sink.properties(safeRef(props_90));
				Term term_2417;
				{
					BufferSink buf_1308 = sink.context().makeBuffer();
					buf_1308.start(_M_TEXTS);
					buf_1308.start(_M__sNil);
					buf_1308.end();
					buf_1308.end();
					term_2417 = buf_1308.term();
				}
				sink.propertyNamed("$binders", term_2417);
				sink.start(_M_SendBinders);
				sink.start(_M_Crsx_xnextBinder_xA1);
				sink.copy(sub_381.ref());
				sink.copy(sub_863.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SendTerm, props_90, term_2178);
	}

	final public static boolean _M_Thunk2(Sink sink, int shared, int depth, Term term_2492)
	{
		if (depth < 2000)
		{
			label_121 :
			{
				if (term_2492.descriptor() != _M_TEXTS)
				{
					break label_121;
				}
				Term sub_558 = term_2492.sub(0).ref();
				/* #thunk=sub *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextChars);
				sink.literal("thunk(");
				sink.end();
				Term term_1612;
				{
					BufferSink buf_2103 = sink.context().makeBuffer();
					buf_2103.start(_M_STRING);
					buf_2103.literal(1);
					buf_2103.end();
					term_1612 = buf_2103.term();
				}
				sink.propertyNamed("$LineLocation", term_1612);
				Term term_2729;
				{
					BufferSink buf_2047 = sink.context().makeBuffer();
					buf_2047.start(_M_STRING);
					buf_2047.literal(1);
					buf_2047.end();
					term_2729 = buf_2047.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2729);
				sink.start(_M__sTextCons);
				Term term_3030;
				{
					BufferSink buf_3118 = sink.context().makeBuffer();
					buf_3118.start(_M_STRING);
					buf_3118.literal(1);
					buf_3118.end();
					term_3030 = buf_3118.term();
				}
				sink.propertyNamed("$LineLocation", term_3030);
				Term term_2189;
				{
					BufferSink buf_1847 = sink.context().makeBuffer();
					buf_1847.start(_M_STRING);
					buf_1847.literal(1);
					buf_1847.end();
					term_2189 = buf_1847.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2189);
				sink.start(_M__sTextEmbed);
				Term term_2819;
				{
					BufferSink buf_2261 = sink.context().makeBuffer();
					buf_2261.start(_M_STRING);
					buf_2261.literal(1);
					buf_2261.end();
					term_2819 = buf_2261.term();
				}
				sink.propertyNamed("$LineLocation", term_2819);
				Term term_1748;
				{
					BufferSink buf_1913 = sink.context().makeBuffer();
					buf_1913.start(_M_STRING);
					buf_1913.literal(1);
					buf_1913.end();
					term_1748 = buf_1913.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1748);
				sink.start(_M_AsText);
				sink.start(_M_Text_ConcatSep);
				sink.copy(sub_558.ref());
				sink.start(_M__sTextCons);
				sink.start(_M__sTextChars);
				sink.literal(", ");
				sink.end();
				Term term_2370;
				{
					BufferSink buf_2105 = sink.context().makeBuffer();
					buf_2105.start(_M_STRING);
					buf_2105.literal(1);
					buf_2105.end();
					term_2370 = buf_2105.term();
				}
				sink.propertyNamed("$LineLocation", term_2370);
				Term term_2223;
				{
					BufferSink buf_3032 = sink.context().makeBuffer();
					buf_3032.start(_M_STRING);
					buf_3032.literal(34);
					buf_3032.end();
					term_2223 = buf_3032.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2223);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				Term term_2495;
				{
					BufferSink buf_2753 = sink.context().makeBuffer();
					buf_2753.start(_M_STRING);
					buf_2753.literal(1);
					buf_2753.end();
					term_2495 = buf_2753.term();
				}
				sink.propertyNamed("$LineLocation", term_2495);
				Term term_2693;
				{
					BufferSink buf_2385 = sink.context().makeBuffer();
					buf_2385.start(_M_STRING);
					buf_2385.literal(7);
					buf_2385.end();
					term_2693 = buf_2385.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2693);
				sink.start(_M__sTextCons);
				Term term_1913;
				{
					BufferSink buf_2702 = sink.context().makeBuffer();
					buf_2702.start(_M_STRING);
					buf_2702.literal(1);
					buf_2702.end();
					term_1913 = buf_2702.term();
				}
				sink.propertyNamed("$LineLocation", term_1913);
				Term term_2725;
				{
					BufferSink buf_2327 = sink.context().makeBuffer();
					buf_2327.start(_M_STRING);
					buf_2327.literal(7);
					buf_2327.end();
					term_2725 = buf_2327.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2725);
				sink.start(_M__sTextChars);
				sink.literal(")");
				sink.end();
				Term term_2928;
				{
					BufferSink buf_1984 = sink.context().makeBuffer();
					buf_1984.start(_M_STRING);
					buf_1984.literal(1);
					buf_1984.end();
					term_2928 = buf_1984.term();
				}
				sink.propertyNamed("$LineLocation", term_2928);
				Term term_2272;
				{
					BufferSink buf_2798 = sink.context().makeBuffer();
					buf_2798.start(_M_STRING);
					buf_2798.literal(39);
					buf_2798.end();
					term_2272 = buf_2798.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2272);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Thunk2, term_2492);
	}

	final public static boolean _M_Thunk(Sink sink, int shared, int depth, Properties props_53)
	{
		if (depth < 2000)
		{
			sink.start(_M_Thunk2);
			sink.start(_M__s);
			sink.properties(safeRef(props_53));
			sink.start(_M_Builtin_sGet);
			sink.end();
			sink.literal("$thunk-args");
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_Thunk, props_53);
	}

	final public static boolean _M_Body(Sink sink, int shared, int depth, Properties props_27, Term term_1716, Term term_2342)
	{
		if (depth < 2000)
		{
			label_294 :
			{
				/* #pattern=term */
				if (term_2342.descriptor() != _M_Crsx_xcontractum)
				{
					break label_294;
				}
				Term sub_327 = term_2342.sub(0).ref();
				/* #freeTerm=sub *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextChars);
				sink.literal(") {");
				sink.end();
				Term term_2770;
				{
					BufferSink buf_1604 = sink.context().makeBuffer();
					buf_1604.start(_M_STRING);
					buf_1604.literal(1);
					buf_1604.end();
					term_2770 = buf_1604.term();
				}
				sink.propertyNamed("$LineLocation", term_2770);
				Term term_2494;
				{
					BufferSink buf_2898 = sink.context().makeBuffer();
					buf_2898.start(_M_STRING);
					buf_2898.literal(1);
					buf_2898.end();
					term_2494 = buf_2898.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2494);
				sink.start(_M__sTextCons);
				Term term_2528;
				{
					BufferSink buf_2719 = sink.context().makeBuffer();
					buf_2719.start(_M_STRING);
					buf_2719.literal(1);
					buf_2719.end();
					term_2528 = buf_2719.term();
				}
				sink.propertyNamed("$LineLocation", term_2528);
				Term term_2067;
				{
					BufferSink buf_2502 = sink.context().makeBuffer();
					buf_2502.start(_M_STRING);
					buf_2502.literal(4);
					buf_2502.end();
					term_2067 = buf_2502.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2067);
				sink.start(_M__sTextIndent);
				Term term_2007;
				{
					BufferSink buf_3082 = sink.context().makeBuffer();
					buf_3082.start(_M_STRING);
					buf_3082.literal(1);
					buf_3082.end();
					term_2007 = buf_3082.term();
				}
				sink.propertyNamed("$LineLocation", term_2007);
				Term term_2650;
				{
					BufferSink buf_2887 = sink.context().makeBuffer();
					buf_2887.start(_M_STRING);
					buf_2887.literal(4);
					buf_2887.end();
					term_2650 = buf_2887.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2650);
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2336;
				{
					BufferSink buf_2418 = sink.context().makeBuffer();
					buf_2418.start(_M_STRING);
					buf_2418.literal(1);
					buf_2418.end();
					term_2336 = buf_2418.term();
				}
				sink.propertyNamed("$LineLocation", term_2336);
				Term term_1914;
				{
					BufferSink buf_2825 = sink.context().makeBuffer();
					buf_2825.start(_M_STRING);
					buf_2825.literal(5);
					buf_2825.end();
					term_1914 = buf_2825.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1914);
				sink.start(_M__sTextCons);
				Term term_1769;
				{
					BufferSink buf_2987 = sink.context().makeBuffer();
					buf_2987.start(_M_STRING);
					buf_2987.literal(1);
					buf_2987.end();
					term_1769 = buf_2987.term();
				}
				sink.propertyNamed("$LineLocation", term_1769);
				Term term_2640;
				{
					BufferSink buf_2506 = sink.context().makeBuffer();
					buf_2506.start(_M_STRING);
					buf_2506.literal(5);
					buf_2506.end();
					term_2640 = buf_2506.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2640);
				sink.start(_M__sTextChars);
				sink.literal("if (depth < 2000) {");
				sink.end();
				Term term_2055;
				{
					BufferSink buf_2126 = sink.context().makeBuffer();
					buf_2126.start(_M_STRING);
					buf_2126.literal(1);
					buf_2126.end();
					term_2055 = buf_2126.term();
				}
				sink.propertyNamed("$LineLocation", term_2055);
				Term term_3171;
				{
					BufferSink buf_2183 = sink.context().makeBuffer();
					buf_2183.start(_M_STRING);
					buf_2183.literal(6);
					buf_2183.end();
					term_3171 = buf_2183.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3171);
				sink.start(_M__sTextCons);
				Term term_3197;
				{
					BufferSink buf_2300 = sink.context().makeBuffer();
					buf_2300.start(_M_STRING);
					buf_2300.literal(1);
					buf_2300.end();
					term_3197 = buf_2300.term();
				}
				sink.propertyNamed("$LineLocation", term_3197);
				Term term_2390;
				{
					BufferSink buf_2585 = sink.context().makeBuffer();
					buf_2585.start(_M_STRING);
					buf_2585.literal(25);
					buf_2585.end();
					term_2390 = buf_2585.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2390);
				sink.start(_M__sTextIndent);
				Term term_2600;
				{
					BufferSink buf_2020 = sink.context().makeBuffer();
					buf_2020.start(_M_STRING);
					buf_2020.literal(1);
					buf_2020.end();
					term_2600 = buf_2020.term();
				}
				sink.propertyNamed("$LineLocation", term_2600);
				Term term_3078;
				{
					BufferSink buf_2037 = sink.context().makeBuffer();
					buf_2037.start(_M_STRING);
					buf_2037.literal(25);
					buf_2037.end();
					term_3078 = buf_2037.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3078);
				sink.start(_M__sTextCons);
				Term term_1694;
				{
					BufferSink buf_1932 = sink.context().makeBuffer();
					buf_1932.start(_M_STRING);
					buf_1932.literal(1);
					buf_1932.end();
					term_1694 = buf_1932.term();
				}
				sink.propertyNamed("$LineLocation", term_1694);
				Term term_2396;
				{
					BufferSink buf_2324 = sink.context().makeBuffer();
					buf_2324.start(_M_STRING);
					buf_2324.literal(25);
					buf_2324.end();
					term_2396 = buf_2324.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2396);
				sink.start(_M__sTextEmbed);
				Term term_1981;
				{
					BufferSink buf_2287 = sink.context().makeBuffer();
					buf_2287.start(_M_STRING);
					buf_2287.literal(1);
					buf_2287.end();
					term_1981 = buf_2287.term();
				}
				sink.propertyNamed("$LineLocation", term_1981);
				Term term_3248;
				{
					BufferSink buf_2201 = sink.context().makeBuffer();
					buf_2201.start(_M_STRING);
					buf_2201.literal(25);
					buf_2201.end();
					term_3248 = buf_2201.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3248);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_27));
				Term term_1950;
				{
					BufferSink buf_2596 = sink.context().makeBuffer();
					buf_2596.start(_M_TEXTS);
					buf_2596.start(_M__sNil);
					buf_2596.end();
					buf_2596.end();
					term_1950 = buf_2596.term();
				}
				sink.propertyNamed("$binders", term_1950);
				Term term_3298;
				{
					BufferSink buf_2179 = sink.context().makeBuffer();
					buf_2179.start(_M_YES);
					buf_2179.end();
					term_3298 = buf_2179.term();
				}
				sink.propertyNamed("$tail", term_3298);
				Term term_2033;
				{
					BufferSink buf_2425 = sink.context().makeBuffer();
					buf_2425.start(_M_TEXT);
					buf_2425.start(_M__sTextCons);
					buf_2425.start(_M__sTextChars);
					buf_2425.literal("sink");
					buf_2425.end();
					buf_2425.start(_M__sTextNil);
					buf_2425.end();
					buf_2425.end();
					buf_2425.end();
					term_2033 = buf_2425.term();
				}
				sink.propertyNamed("$sink", term_2033);
				sink.start(_M_SendFreeTerm);
				sink.copy(sub_327.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_1936;
				{
					BufferSink buf_2914 = sink.context().makeBuffer();
					buf_2914.start(_M_STRING);
					buf_2914.literal(1);
					buf_2914.end();
					term_1936 = buf_2914.term();
				}
				sink.propertyNamed("$LineLocation", term_1936);
				Term term_2161;
				{
					BufferSink buf_2146 = sink.context().makeBuffer();
					buf_2146.start(_M_STRING);
					buf_2146.literal(26);
					buf_2146.end();
					term_2161 = buf_2146.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2161);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				Term term_1844;
				{
					BufferSink buf_3398 = sink.context().makeBuffer();
					buf_3398.start(_M_STRING);
					buf_3398.literal(1);
					buf_3398.end();
					term_1844 = buf_3398.term();
				}
				sink.propertyNamed("$LineLocation", term_1844);
				Term term_2534;
				{
					BufferSink buf_2513 = sink.context().makeBuffer();
					buf_2513.start(_M_STRING);
					buf_2513.literal(115);
					buf_2513.end();
					term_2534 = buf_2513.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2534);
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2489;
				{
					BufferSink buf_2170 = sink.context().makeBuffer();
					buf_2170.start(_M_STRING);
					buf_2170.literal(1);
					buf_2170.end();
					term_2489 = buf_2170.term();
				}
				sink.propertyNamed("$LineLocation", term_2489);
				Term term_3596;
				{
					BufferSink buf_1849 = sink.context().makeBuffer();
					buf_1849.start(_M_STRING);
					buf_1849.literal(116);
					buf_1849.end();
					term_3596 = buf_1849.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3596);
				sink.start(_M__sTextCons);
				Term term_2457;
				{
					BufferSink buf_1562 = sink.context().makeBuffer();
					buf_1562.start(_M_STRING);
					buf_1562.literal(1);
					buf_1562.end();
					term_2457 = buf_1562.term();
				}
				sink.propertyNamed("$LineLocation", term_2457);
				Term term_2860;
				{
					BufferSink buf_2085 = sink.context().makeBuffer();
					buf_2085.start(_M_STRING);
					buf_2085.literal(116);
					buf_2085.end();
					term_2860 = buf_2085.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2860);
				sink.start(_M__sTextChars);
				sink.literal("}");
				sink.end();
				Term term_2646;
				{
					BufferSink buf_2904 = sink.context().makeBuffer();
					buf_2904.start(_M_STRING);
					buf_2904.literal(1);
					buf_2904.end();
					term_2646 = buf_2904.term();
				}
				sink.propertyNamed("$LineLocation", term_2646);
				Term term_1951;
				{
					BufferSink buf_2446 = sink.context().makeBuffer();
					buf_2446.start(_M_STRING);
					buf_2446.literal(117);
					buf_2446.end();
					term_1951 = buf_2446.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1951);
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_1948;
				{
					BufferSink buf_2960 = sink.context().makeBuffer();
					buf_2960.start(_M_STRING);
					buf_2960.literal(1);
					buf_2960.end();
					term_1948 = buf_2960.term();
				}
				sink.propertyNamed("$LineLocation", term_1948);
				Term term_3250;
				{
					BufferSink buf_2813 = sink.context().makeBuffer();
					buf_2813.start(_M_STRING);
					buf_2813.literal(118);
					buf_2813.end();
					term_3250 = buf_2813.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3250);
				sink.start(_M__sTextCons);
				Term term_1238;
				{
					BufferSink buf_1879 = sink.context().makeBuffer();
					buf_1879.start(_M_STRING);
					buf_1879.literal(1);
					buf_1879.end();
					term_1238 = buf_1879.term();
				}
				sink.propertyNamed("$LineLocation", term_1238);
				Term term_2444;
				{
					BufferSink buf_2508 = sink.context().makeBuffer();
					buf_2508.start(_M_STRING);
					buf_2508.literal(118);
					buf_2508.end();
					term_2444 = buf_2508.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2444);
				sink.start(_M__sTextChars);
				sink.literal("return ");
				sink.end();
				Term term_2050;
				{
					BufferSink buf_2279 = sink.context().makeBuffer();
					buf_2279.start(_M_STRING);
					buf_2279.literal(1);
					buf_2279.end();
					term_2050 = buf_2279.term();
				}
				sink.propertyNamed("$LineLocation", term_2050);
				Term term_3263;
				{
					BufferSink buf_2405 = sink.context().makeBuffer();
					buf_2405.start(_M_STRING);
					buf_2405.literal(119);
					buf_2405.end();
					term_3263 = buf_2405.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3263);
				sink.start(_M__sTextCons);
				Term term_2142;
				{
					BufferSink buf_2409 = sink.context().makeBuffer();
					buf_2409.start(_M_STRING);
					buf_2409.literal(1);
					buf_2409.end();
					term_2142 = buf_2409.term();
				}
				sink.propertyNamed("$LineLocation", term_2142);
				Term term_2152;
				{
					BufferSink buf_2739 = sink.context().makeBuffer();
					buf_2739.start(_M_STRING);
					buf_2739.literal(119);
					buf_2739.end();
					term_2152 = buf_2739.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2152);
				sink.start(_M__sTextEmbed);
				Term term_1893;
				{
					BufferSink buf_2113 = sink.context().makeBuffer();
					buf_2113.start(_M_STRING);
					buf_2113.literal(1);
					buf_2113.end();
					term_1893 = buf_2113.term();
				}
				sink.propertyNamed("$LineLocation", term_1893);
				Term term_2288;
				{
					BufferSink buf_2723 = sink.context().makeBuffer();
					buf_2723.start(_M_STRING);
					buf_2723.literal(119);
					buf_2723.end();
					term_2288 = buf_2723.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2288);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_27));
				sink.start(_M_Thunk);
				sink.end();
				sink.end();
				sink.end();
				Term term_2993;
				{
					BufferSink buf_2462 = sink.context().makeBuffer();
					buf_2462.start(_M_STRING);
					buf_2462.literal(1);
					buf_2462.end();
					term_2993 = buf_2462.term();
				}
				sink.propertyNamed("$LineLocation", term_2993);
				Term term_3543;
				{
					BufferSink buf_2036 = sink.context().makeBuffer();
					buf_2036.start(_M_STRING);
					buf_2036.literal(126);
					buf_2036.end();
					term_3543 = buf_2036.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3543);
				sink.start(_M__sTextCons);
				Term term_1993;
				{
					BufferSink buf_1917 = sink.context().makeBuffer();
					buf_1917.start(_M_STRING);
					buf_1917.literal(1);
					buf_1917.end();
					term_1993 = buf_1917.term();
				}
				sink.propertyNamed("$LineLocation", term_1993);
				Term term_3107;
				{
					BufferSink buf_2000 = sink.context().makeBuffer();
					buf_2000.start(_M_STRING);
					buf_2000.literal(126);
					buf_2000.end();
					term_3107 = buf_2000.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3107);
				sink.start(_M__sTextChars);
				sink.literal(";");
				sink.end();
				Term term_2740;
				{
					BufferSink buf_2560 = sink.context().makeBuffer();
					buf_2560.start(_M_STRING);
					buf_2560.literal(1);
					buf_2560.end();
					term_2740 = buf_2560.term();
				}
				sink.propertyNamed("$LineLocation", term_2740);
				Term term_2204;
				{
					BufferSink buf_2453 = sink.context().makeBuffer();
					buf_2453.start(_M_STRING);
					buf_2453.literal(137);
					buf_2453.end();
					term_2204 = buf_2453.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2204);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				Term term_2412;
				{
					BufferSink buf_1836 = sink.context().makeBuffer();
					buf_1836.start(_M_STRING);
					buf_1836.literal(1);
					buf_1836.end();
					term_2412 = buf_1836.term();
				}
				sink.propertyNamed("$LineLocation", term_2412);
				Term term_2604;
				{
					BufferSink buf_1664 = sink.context().makeBuffer();
					buf_1664.start(_M_STRING);
					buf_1664.literal(138);
					buf_1664.end();
					term_2604 = buf_1664.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2604);
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2333;
				{
					BufferSink buf_2002 = sink.context().makeBuffer();
					buf_2002.start(_M_STRING);
					buf_2002.literal(1);
					buf_2002.end();
					term_2333 = buf_2002.term();
				}
				sink.propertyNamed("$LineLocation", term_2333);
				Term term_2049;
				{
					BufferSink buf_2594 = sink.context().makeBuffer();
					buf_2594.start(_M_STRING);
					buf_2594.literal(139);
					buf_2594.end();
					term_2049 = buf_2594.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2049);
				sink.start(_M__sTextCons);
				Term term_2636;
				{
					BufferSink buf_1739 = sink.context().makeBuffer();
					buf_1739.start(_M_STRING);
					buf_1739.literal(1);
					buf_1739.end();
					term_2636 = buf_1739.term();
				}
				sink.propertyNamed("$LineLocation", term_2636);
				Term term_2623;
				{
					BufferSink buf_1742 = sink.context().makeBuffer();
					buf_1742.start(_M_STRING);
					buf_1742.literal(139);
					buf_1742.end();
					term_2623 = buf_1742.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2623);
				sink.start(_M__sTextChars);
				sink.literal("}");
				sink.end();
				Term term_3099;
				{
					BufferSink buf_3349 = sink.context().makeBuffer();
					buf_3349.start(_M_STRING);
					buf_3349.literal(1);
					buf_3349.end();
					term_3099 = buf_3349.term();
				}
				sink.propertyNamed("$LineLocation", term_3099);
				Term term_2511;
				{
					BufferSink buf_2143 = sink.context().makeBuffer();
					buf_2143.start(_M_STRING);
					buf_2143.literal(140);
					buf_2143.end();
					term_2511 = buf_2143.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2511);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Body, props_27, term_1716, term_2342);
	}

	final public static boolean _M_SigVar1(Sink sink, int shared, int depth, Properties props_63, Term term_2262, Term term_2443, Term term_3080, Term term_2635, Term term_1873, Term term_2507, Term term_2271)
	{
		if (depth < 2000)
		{
			label_372 :
			{
				if (term_2262.descriptor() != _M_TEXTS)
				{
					break label_372;
				}
				Term sub_933 = term_2262.sub(0).ref();
				/* #binders=sub */
				if (term_2443.descriptor() != _M_TEXTS)
				{
					break label_372;
				}
				Term sub_453 = term_2443.sub(0).ref();
				/* #thunk=sub */
				/* #key=term */
				/* #nextBinder=term */
				/* #terms_S1*=term */
				/* #pattern=term */
				/* #contractum=term *//*Contract*/
				Variable var_175 = sink.context().makeVariable("var");
				sink.start(_M__sTextCons);
				sink.start(_M__sTextChars);
				sink.literal(", Variable ");
				sink.end();
				Term term_2318;
				{
					BufferSink buf_2369 = sink.context().makeBuffer();
					buf_2369.start(_M_STRING);
					buf_2369.literal(1);
					buf_2369.end();
					term_2318 = buf_2369.term();
				}
				sink.propertyNamed("$LineLocation", term_2318);
				Term term_2123;
				{
					BufferSink buf_2395 = sink.context().makeBuffer();
					buf_2395.start(_M_STRING);
					buf_2395.literal(1);
					buf_2395.end();
					term_2123 = buf_2395.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2123);
				sink.start(_M__sTextCons);
				Term term_2787;
				{
					BufferSink buf_2181 = sink.context().makeBuffer();
					buf_2181.start(_M_STRING);
					buf_2181.literal(1);
					buf_2181.end();
					term_2787 = buf_2181.term();
				}
				sink.propertyNamed("$LineLocation", term_2787);
				Term term_2997;
				{
					BufferSink buf_2155 = sink.context().makeBuffer();
					buf_2155.start(_M_STRING);
					buf_2155.literal(1);
					buf_2155.end();
					term_2997 = buf_2155.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2997);
				sink.start(_M__sTextEmbed);
				Term term_2347;
				{
					BufferSink buf_2494 = sink.context().makeBuffer();
					buf_2494.start(_M_STRING);
					buf_2494.literal(1);
					buf_2494.end();
					term_2347 = buf_2494.term();
				}
				sink.propertyNamed("$LineLocation", term_2347);
				Term term_3497;
				{
					BufferSink buf_2523 = sink.context().makeBuffer();
					buf_2523.start(_M_STRING);
					buf_2523.literal(1);
					buf_2523.end();
					term_3497 = buf_2523.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3497);
				sink.start(_M_AsText);
				sink.use(var_175);
				sink.end();
				sink.end();
				Term term_1923;
				{
					BufferSink buf_2994 = sink.context().makeBuffer();
					buf_2994.start(_M_STRING);
					buf_2994.literal(1);
					buf_2994.end();
					term_1923 = buf_2994.term();
				}
				sink.propertyNamed("$LineLocation", term_1923);
				Term term_1994;
				{
					BufferSink buf_1303 = sink.context().makeBuffer();
					buf_1303.start(_M_STRING);
					buf_1303.literal(12);
					buf_1303.end();
					term_1994 = buf_1303.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1994);
				sink.start(_M__sTextCons);
				Term term_2747;
				{
					BufferSink buf_2480 = sink.context().makeBuffer();
					buf_2480.start(_M_STRING);
					buf_2480.literal(1);
					buf_2480.end();
					term_2747 = buf_2480.term();
				}
				sink.propertyNamed("$LineLocation", term_2747);
				Term term_2967;
				{
					BufferSink buf_2518 = sink.context().makeBuffer();
					buf_2518.start(_M_STRING);
					buf_2518.literal(12);
					buf_2518.end();
					term_2967 = buf_2518.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2967);
				sink.start(_M__sTextEmbed);
				Term term_2465;
				{
					BufferSink buf_1873 = sink.context().makeBuffer();
					buf_1873.start(_M_STRING);
					buf_1873.literal(1);
					buf_1873.end();
					term_2465 = buf_1873.term();
				}
				sink.propertyNamed("$LineLocation", term_2465);
				Term term_2076;
				{
					BufferSink buf_2684 = sink.context().makeBuffer();
					buf_2684.start(_M_STRING);
					buf_2684.literal(12);
					buf_2684.end();
					term_2076 = buf_2684.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2076);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_63));
				Term term_1754;
				{
					BufferSink buf_2100 = sink.context().makeBuffer();
					buf_2100.start(_M_TEXTS);
					buf_2100.start(_M_Concat);
					buf_2100.copy(sub_453.ref());
					buf_2100.start(_M__sCons);
					buf_2100.use(var_175);
					buf_2100.start(_M__sNil);
					buf_2100.end();
					buf_2100.end();
					buf_2100.end();
					buf_2100.end();
					term_1754 = buf_2100.term();
				}
				sink.propertyNamed("$thunk-args", term_1754);
				Term term_2098;
				{
					BufferSink buf_3790 = sink.context().makeBuffer();
					buf_3790.start(_M_TEXTS);
					buf_3790.start(_M_Concat);
					buf_3790.copy(sub_933.ref());
					buf_3790.start(_M__sCons);
					buf_3790.use(var_175);
					buf_3790.start(_M__sNil);
					buf_3790.end();
					buf_3790.end();
					buf_3790.end();
					buf_3790.end();
					term_2098 = buf_3790.term();
				}
				sink.propertyNamed("$binders", term_2098);
				Term term_1943;
				{
					BufferSink buf_2186 = sink.context().makeBuffer();
					buf_2186.start(_M_TEXT);
					buf_2186.use(var_175);
					buf_2186.end();
					term_1943 = buf_2186.term();
				}
				term_3080 = force(sink.context(), term_3080);
				Sink.property(sink, term_3080, term_1943);
				sink.start(_M_SigNextBinder);
				sink.copy(term_2635.ref());
				sink.copy(term_1873.ref());
				sink.copy(term_2507.ref());
				sink.copy(term_2271.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_2886;
				{
					BufferSink buf_2079 = sink.context().makeBuffer();
					buf_2079.start(_M_STRING);
					buf_2079.literal(1);
					buf_2079.end();
					term_2886 = buf_2079.term();
				}
				sink.propertyNamed("$LineLocation", term_2886);
				Term term_2784;
				{
					BufferSink buf_2307 = sink.context().makeBuffer();
					buf_2307.start(_M_STRING);
					buf_2307.literal(17);
					buf_2307.end();
					term_2784 = buf_2307.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2784);
				sink.start(_M__sTextCons);
				Term term_2750;
				{
					BufferSink buf_2605 = sink.context().makeBuffer();
					buf_2605.start(_M_STRING);
					buf_2605.literal(1);
					buf_2605.end();
					term_2750 = buf_2605.term();
				}
				sink.propertyNamed("$LineLocation", term_2750);
				Term term_1952;
				{
					BufferSink buf_2269 = sink.context().makeBuffer();
					buf_2269.start(_M_STRING);
					buf_2269.literal(17);
					buf_2269.end();
					term_1952 = buf_2269.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1952);
				sink.start(_M__sTextChars);
				sink.literal(" ");
				sink.end();
				Term term_2435;
				{
					BufferSink buf_2587 = sink.context().makeBuffer();
					buf_2587.start(_M_STRING);
					buf_2587.literal(1);
					buf_2587.end();
					term_2435 = buf_2587.term();
				}
				sink.propertyNamed("$LineLocation", term_2435);
				Term term_3446;
				{
					BufferSink buf_2096 = sink.context().makeBuffer();
					buf_2096.start(_M_STRING);
					buf_2096.literal(189);
					buf_2096.end();
					term_3446 = buf_2096.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3446);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SigVar1, props_63, term_2262, term_2443, term_3080, term_2635, term_1873, term_2507, term_2271);
	}

	final public static boolean _M_SigVar(Sink sink, int shared, int depth, Properties props_82, Term term_2313, Term term_2349, Term term_2246, Term term_2570, Term term_2865)
	{
		if (depth < 2000)
		{
			sink.properties(safeRef(props_82));
			sink.start(_M_SigVar1);
			sink.start(_M__s);
			sink.properties(safeRef(props_82));
			sink.start(_M_Builtin_sGet);
			sink.end();
			sink.literal("$binders");
			sink.end();
			sink.start(_M__s);
			sink.properties(safeRef(props_82));
			sink.start(_M_Builtin_sGet);
			sink.end();
			sink.literal("$thunk-args");
			sink.end();
			sink.copy(term_2313.ref());
			sink.copy(term_2349.ref());
			sink.copy(term_2246.ref());
			sink.copy(term_2570.ref());
			sink.copy(term_2865.ref());
			sink.end();
			return true;
		}
		return thunk(sink, _M_SigVar, props_82, term_2313, term_2349, term_2246, term_2570, term_2865);
	}

	final public static boolean _M_SigMeta1(Sink sink, int shared, int depth, Properties props_95, Term term_3039, Term term_2140, Term term_1953, Term term_1895, Term term_1814, Term term_2932)
	{
		if (depth < 2000)
		{
			label_145 :
			{
				if (term_3039.descriptor() != _M_TEXTS)
				{
					break label_145;
				}
				Term sub_360 = term_3039.sub(0).ref();
				/* #binders=sub */
				if (term_2140.descriptor() != _M_TEXTS)
				{
					break label_145;
				}
				Term sub_531 = term_2140.sub(0).ref();
				/* #thunk=sub */
				/* #key=term */
				/* #terms_S1*=term */
				/* #pattern=term */
				/* #contractum=term *//*Contract*/
				Variable var_160 = sink.context().makeVariable("term");
				sink.start(_M__sTextCons);
				sink.start(_M__sTextChars);
				sink.literal(", Term ");
				sink.end();
				Term term_2150;
				{
					BufferSink buf_2174 = sink.context().makeBuffer();
					buf_2174.start(_M_STRING);
					buf_2174.literal(1);
					buf_2174.end();
					term_2150 = buf_2174.term();
				}
				sink.propertyNamed("$LineLocation", term_2150);
				Term term_2544;
				{
					BufferSink buf_2034 = sink.context().makeBuffer();
					buf_2034.start(_M_STRING);
					buf_2034.literal(1);
					buf_2034.end();
					term_2544 = buf_2034.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2544);
				sink.start(_M__sTextCons);
				Term term_2267;
				{
					BufferSink buf_2265 = sink.context().makeBuffer();
					buf_2265.start(_M_STRING);
					buf_2265.literal(1);
					buf_2265.end();
					term_2267 = buf_2265.term();
				}
				sink.propertyNamed("$LineLocation", term_2267);
				Term term_2772;
				{
					BufferSink buf_1956 = sink.context().makeBuffer();
					buf_1956.start(_M_STRING);
					buf_1956.literal(1);
					buf_1956.end();
					term_2772 = buf_1956.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2772);
				sink.start(_M__sTextEmbed);
				Term term_1628;
				{
					BufferSink buf_2352 = sink.context().makeBuffer();
					buf_2352.start(_M_STRING);
					buf_2352.literal(1);
					buf_2352.end();
					term_1628 = buf_2352.term();
				}
				sink.propertyNamed("$LineLocation", term_1628);
				Term term_2811;
				{
					BufferSink buf_2775 = sink.context().makeBuffer();
					buf_2775.start(_M_STRING);
					buf_2775.literal(1);
					buf_2775.end();
					term_2811 = buf_2775.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2811);
				sink.start(_M_AsText);
				sink.use(var_160);
				sink.end();
				sink.end();
				Term term_3089;
				{
					BufferSink buf_2273 = sink.context().makeBuffer();
					buf_2273.start(_M_STRING);
					buf_2273.literal(1);
					buf_2273.end();
					term_3089 = buf_2273.term();
				}
				sink.propertyNamed("$LineLocation", term_3089);
				Term term_2504;
				{
					BufferSink buf_2237 = sink.context().makeBuffer();
					buf_2237.start(_M_STRING);
					buf_2237.literal(8);
					buf_2237.end();
					term_2504 = buf_2237.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2504);
				sink.start(_M__sTextCons);
				Term term_2091;
				{
					BufferSink buf_2610 = sink.context().makeBuffer();
					buf_2610.start(_M_STRING);
					buf_2610.literal(1);
					buf_2610.end();
					term_2091 = buf_2610.term();
				}
				sink.propertyNamed("$LineLocation", term_2091);
				Term term_2678;
				{
					BufferSink buf_2708 = sink.context().makeBuffer();
					buf_2708.start(_M_STRING);
					buf_2708.literal(8);
					buf_2708.end();
					term_2678 = buf_2708.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2678);
				sink.start(_M__sTextEmbed);
				Term term_2472;
				{
					BufferSink buf_1900 = sink.context().makeBuffer();
					buf_1900.start(_M_STRING);
					buf_1900.literal(1);
					buf_1900.end();
					term_2472 = buf_1900.term();
				}
				sink.propertyNamed("$LineLocation", term_2472);
				Term term_2930;
				{
					BufferSink buf_2463 = sink.context().makeBuffer();
					buf_2463.start(_M_STRING);
					buf_2463.literal(8);
					buf_2463.end();
					term_2930 = buf_2463.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2930);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_95));
				Term term_3256;
				{
					BufferSink buf_2364 = sink.context().makeBuffer();
					buf_2364.start(_M_TEXTS);
					buf_2364.start(_M_Concat);
					buf_2364.copy(sub_531.ref());
					buf_2364.start(_M__sCons);
					buf_2364.use(var_160);
					buf_2364.start(_M__sNil);
					buf_2364.end();
					buf_2364.end();
					buf_2364.end();
					buf_2364.end();
					term_3256 = buf_2364.term();
				}
				sink.propertyNamed("$thunk-args", term_3256);
				Term term_3081;
				{
					BufferSink buf_2138 = sink.context().makeBuffer();
					buf_2138.start(_M_TEXTS);
					buf_2138.start(_M__sNil);
					buf_2138.end();
					buf_2138.end();
					term_3081 = buf_2138.term();
				}
				sink.propertyNamed("$binders", term_3081);
				Term term_2298;
				{
					BufferSink buf_2153 = sink.context().makeBuffer();
					buf_2153.start(_M_META);
					buf_2153.use(var_160);
					buf_2153.copy(sub_360.ref());
					buf_2153.end();
					term_2298 = buf_2153.term();
				}
				term_1953 = force(sink.context(), term_1953);
				Sink.property(sink, term_1953, term_2298);
				sink.start(_M_SigTerms);
				sink.copy(term_1895.ref());
				sink.copy(term_1814.ref());
				sink.copy(term_2932.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_2661;
				{
					BufferSink buf_2004 = sink.context().makeBuffer();
					buf_2004.start(_M_STRING);
					buf_2004.literal(1);
					buf_2004.end();
					term_2661 = buf_2004.term();
				}
				sink.propertyNamed("$LineLocation", term_2661);
				Term term_2869;
				{
					BufferSink buf_2333 = sink.context().makeBuffer();
					buf_2333.start(_M_STRING);
					buf_2333.literal(14);
					buf_2333.end();
					term_2869 = buf_2333.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2869);
				sink.start(_M__sTextCons);
				Term term_2681;
				{
					BufferSink buf_1903 = sink.context().makeBuffer();
					buf_1903.start(_M_STRING);
					buf_1903.literal(1);
					buf_1903.end();
					term_2681 = buf_1903.term();
				}
				sink.propertyNamed("$LineLocation", term_2681);
				Term term_1774;
				{
					BufferSink buf_2345 = sink.context().makeBuffer();
					buf_2345.start(_M_STRING);
					buf_2345.literal(14);
					buf_2345.end();
					term_1774 = buf_2345.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1774);
				sink.start(_M__sTextChars);
				sink.literal(" ");
				sink.end();
				Term term_2671;
				{
					BufferSink buf_1966 = sink.context().makeBuffer();
					buf_1966.start(_M_STRING);
					buf_1966.literal(1);
					buf_1966.end();
					term_2671 = buf_1966.term();
				}
				sink.propertyNamed("$LineLocation", term_2671);
				Term term_2910;
				{
					BufferSink buf_2661 = sink.context().makeBuffer();
					buf_2661.start(_M_STRING);
					buf_2661.literal(161);
					buf_2661.end();
					term_2910 = buf_2661.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2910);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SigMeta1, props_95, term_3039, term_2140, term_1953, term_1895, term_1814, term_2932);
	}

	final public static boolean _M_SigMeta(Sink sink, int shared, int depth, Properties props_163, Term term_2824, Term term_2109, Term term_1874, Term term_2873)
	{
		if (depth < 2000)
		{
			sink.properties(safeRef(props_163));
			sink.start(_M_SigMeta1);
			sink.start(_M__s);
			sink.properties(safeRef(props_163));
			sink.start(_M_Builtin_sGet);
			sink.end();
			sink.literal("$binders");
			sink.end();
			sink.start(_M__s);
			sink.properties(safeRef(props_163));
			sink.start(_M_Builtin_sGet);
			sink.end();
			sink.literal("$thunk-args");
			sink.end();
			sink.copy(term_2824.ref());
			sink.copy(term_2109.ref());
			sink.copy(term_1874.ref());
			sink.copy(term_2873.ref());
			sink.end();
			return true;
		}
		return thunk(sink, _M_SigMeta, props_163, term_2824, term_2109, term_1874, term_2873);
	}

	final public static boolean _M_SigPropertyRef1(Sink sink, int shared, int depth, Properties props_1, Term term_2340, Term term_3195, Variable var_168, Term term_2406)
	{
		if (depth < 2000)
		{
			label_333 :
			{
				if (term_2340.descriptor() != _M_TEXTS)
				{
					break label_333;
				}
				Term sub_400 = term_2340.sub(0).ref();
				/* #thunk=sub */
				/* #key=term */
				/* #=term *//*Contract*/
				Variable var_347 = sink.context().makeVariable("props");
				sink.start(_M__sTextCons);
				sink.start(_M__sTextChars);
				sink.literal(", Properties ");
				sink.end();
				Term term_2684;
				{
					BufferSink buf_3181 = sink.context().makeBuffer();
					buf_3181.start(_M_STRING);
					buf_3181.literal(1);
					buf_3181.end();
					term_2684 = buf_3181.term();
				}
				sink.propertyNamed("$LineLocation", term_2684);
				Term term_3157;
				{
					BufferSink buf_2942 = sink.context().makeBuffer();
					buf_2942.start(_M_STRING);
					buf_2942.literal(1);
					buf_2942.end();
					term_3157 = buf_2942.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3157);
				sink.start(_M__sTextCons);
				Term term_2326;
				{
					BufferSink buf_2695 = sink.context().makeBuffer();
					buf_2695.start(_M_STRING);
					buf_2695.literal(1);
					buf_2695.end();
					term_2326 = buf_2695.term();
				}
				sink.propertyNamed("$LineLocation", term_2326);
				Term term_2902;
				{
					BufferSink buf_2617 = sink.context().makeBuffer();
					buf_2617.start(_M_STRING);
					buf_2617.literal(1);
					buf_2617.end();
					term_2902 = buf_2617.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2902);
				sink.start(_M__sTextEmbed);
				Term term_2760;
				{
					BufferSink buf_2348 = sink.context().makeBuffer();
					buf_2348.start(_M_STRING);
					buf_2348.literal(1);
					buf_2348.end();
					term_2760 = buf_2348.term();
				}
				sink.propertyNamed("$LineLocation", term_2760);
				Term term_2821;
				{
					BufferSink buf_2125 = sink.context().makeBuffer();
					buf_2125.start(_M_STRING);
					buf_2125.literal(1);
					buf_2125.end();
					term_2821 = buf_2125.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2821);
				sink.start(_M_AsText);
				sink.use(var_347);
				sink.end();
				sink.end();
				Term term_3033;
				{
					BufferSink buf_2209 = sink.context().makeBuffer();
					buf_2209.start(_M_STRING);
					buf_2209.literal(1);
					buf_2209.end();
					term_3033 = buf_2209.term();
				}
				sink.propertyNamed("$LineLocation", term_3033);
				Term term_3525;
				{
					BufferSink buf_1860 = sink.context().makeBuffer();
					buf_1860.start(_M_STRING);
					buf_1860.literal(14);
					buf_1860.end();
					term_3525 = buf_1860.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3525);
				sink.start(_M__sTextCons);
				Term term_2845;
				{
					BufferSink buf_2429 = sink.context().makeBuffer();
					buf_2429.start(_M_STRING);
					buf_2429.literal(1);
					buf_2429.end();
					term_2845 = buf_2429.term();
				}
				sink.propertyNamed("$LineLocation", term_2845);
				Term term_2673;
				{
					BufferSink buf_2807 = sink.context().makeBuffer();
					buf_2807.start(_M_STRING);
					buf_2807.literal(14);
					buf_2807.end();
					term_2673 = buf_2807.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2673);
				sink.start(_M__sTextEmbed);
				Term term_1975;
				{
					BufferSink buf_1425 = sink.context().makeBuffer();
					buf_1425.start(_M_STRING);
					buf_1425.literal(1);
					buf_1425.end();
					term_1975 = buf_1425.term();
				}
				sink.propertyNamed("$LineLocation", term_1975);
				Term term_2885;
				{
					BufferSink buf_2377 = sink.context().makeBuffer();
					buf_2377.start(_M_STRING);
					buf_2377.literal(14);
					buf_2377.end();
					term_2885 = buf_2377.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2885);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_1));
				Term term_2691;
				{
					BufferSink buf_2199 = sink.context().makeBuffer();
					buf_2199.start(_M_TEXTS);
					buf_2199.start(_M_Concat);
					buf_2199.copy(sub_400.ref());
					buf_2199.start(_M__sCons);
					buf_2199.use(var_347);
					buf_2199.start(_M__sNil);
					buf_2199.end();
					buf_2199.end();
					buf_2199.end();
					buf_2199.end();
					term_2691 = buf_2199.term();
				}
				sink.propertyNamed("$thunk-args", term_2691);
				Term term_2736;
				{
					BufferSink buf_4269 = sink.context().makeBuffer();
					buf_4269.start(_M_META);
					buf_4269.use(var_347);
					buf_4269.start(_M__sNil);
					buf_4269.end();
					buf_4269.end();
					term_2736 = buf_4269.term();
				}
				term_3195 = force(sink.context(), term_3195);
				Sink.property(sink, term_3195, term_2736);
				Term term_2207;
				{
					BufferSink buf_1631 = sink.context().makeBuffer();
					buf_1631.start(_M_OK);
					buf_1631.end();
					term_2207 = buf_1631.term();
				}
				sink.substitute(term_2406.ref(), new Variable[]
					{var_168}, new Term[]
					{term_2207});
				sink.end();
				sink.end();
				Term term_2810;
				{
					BufferSink buf_2569 = sink.context().makeBuffer();
					buf_2569.start(_M_STRING);
					buf_2569.literal(1);
					buf_2569.end();
					term_2810 = buf_2569.term();
				}
				sink.propertyNamed("$LineLocation", term_2810);
				Term term_2728;
				{
					BufferSink buf_2772 = sink.context().makeBuffer();
					buf_2772.start(_M_STRING);
					buf_2772.literal(21);
					buf_2772.end();
					term_2728 = buf_2772.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2728);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SigPropertyRef1, props_1, term_2340, term_3195, var_168, term_2406);
	}

	final public static boolean _M_SigPropertyRef(Sink sink, int shared, int depth, Properties props_75, Term term_3205, Variable var_144, Term term_2751)
	{
		if (depth < 2000)
		{
			label_100 :
			{
				/* #key=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_75));
				sink.start(_M_SigPropertyRef1);
				sink.start(_M__s);
				sink.properties(safeRef(props_75));
				sink.start(_M_Builtin_sGet);
				sink.end();
				sink.literal("$thunk-args");
				sink.end();
				sink.copy(term_3205.ref());
				Variable var_120 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_120});
				VariableUse use_35 = sink.context().makeVariableUse(var_120);
				sink.substitute(term_2751.ref(), new Variable[]
					{var_144}, new Term[]
					{use_35});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SigPropertyRef, props_75, term_3205, var_144, term_2751);
	}

	final public static boolean _M_SigNextBinder(Sink sink, int shared, int depth, Properties props_211, Term term_2871, Term term_2959, Term term_2703, Term term_2404)
	{
		if (depth < 2000)
		{
			label_118 :
			{
				if (term_2871.descriptor() != _M_Crsx_xnextBinder_xA2)
				{
					break label_118;
				}
				Term sub_794 = term_2871.sub(0).ref();
				Term sub_518 = term_2871.sub(1).ref();
				/* #freeTerm=sub */
				/* #terms_S1*=term */
				/* #pattern=term */
				/* #contractum=term *//*Contract*/sink.properties(safeRef(props_211));
				sink.start(_M_SigTerms);
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xterms_xS1);
				sink.literal(",");
				sink.start(_M_Crsx_xterm_xA1);
				sink.copy(sub_518.ref());
				sink.end();
				sink.end();
				sink.copy(term_2959.ref());
				sink.end();
				sink.copy(term_2703.ref());
				sink.copy(term_2404.ref());
				sink.end();
				return true;
			}
			label_374 :
			{
				if (term_2871.descriptor() != _M_Crsx_xnextBinder_xA1)
				{
					break label_374;
				}
				Term sub_542 = term_2871.sub(0).ref();
				/* #binder=sub */Term sub_475 = term_2871.sub(1).ref();
				/* #nextBinder=sub */
				/* #terms_S1*=term */
				/* #pattern=term */
				/* #contractum=term *//*Contract*/sink.properties(safeRef(props_211));
				sink.start(_M_SigVar);
				sink.start(_M_BinderKey);
				sink.copy(sub_542.ref());
				sink.end();
				sink.copy(sub_475.ref());
				sink.copy(term_2959.ref());
				sink.copy(term_2703.ref());
				sink.copy(term_2404.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SigNextBinder, props_211, term_2871, term_2959, term_2703, term_2404);
	}

	final public static boolean _M_SigTerms(Sink sink, int shared, int depth, Properties props_146, Term term_2814, Term term_3273, Term term_2843)
	{
		if (depth < 2000)
		{
			label_87 :
			{
				if (term_2814.descriptor() != _M__sNil)
				{
					break label_87;
				}
				/* #pattern=term */
				/* #contractum=term *//*Contract*/sink.properties(safeRef(props_146));
				sink.start(_M_Body);
				sink.copy(term_3273.ref());
				sink.copy(term_2843.ref());
				sink.end();
				return true;
			}
			label_159 :
			{
				if (term_2814.descriptor() != _M__sCons)
				{
					break label_159;
				}
				Term sub_571 = term_2814.sub(0).ref();
				if (sub_571.descriptor() != _M_Crsx_xterms_xS1)
				{
					break label_159;
				}
				Term sub_552 = sub_571.sub(0).ref();
				Term sub_557 = sub_571.sub(1).ref();
				if (sub_557.descriptor() != _M_Crsx_xterm_xA1)
				{
					break label_159;
				}
				Term sub_658 = sub_557.sub(0).ref();
				if (sub_658.descriptor() != _M_Crsx_xfreeTerm_xA7)
				{
					break label_159;
				}
				Term sub_483 = sub_658.sub(0).ref();
				if (sub_483.descriptor() != _M__sNil)
				{
					break label_159;
				}
				Term sub_532 = sub_658.sub(1).ref();
				if (sub_532.descriptor() != _M__sNil)
				{
					break label_159;
				}
				Term sub_347 = sub_658.sub(2).ref();
				/* #METAVAR=sub */Term sub_440 = sub_658.sub(3).ref();
				/* #freeArguments?=sub */Term sub_568 = term_2814.sub(1).ref();
				/* #terms_S1*=sub */
				/* #pattern=term */
				/* #contractum=term *//*Contract*/sink.properties(safeRef(props_146));
				sink.start(_M_SigMeta);
				sink.start(_M_MetaKey);
				sink.copy(sub_347.ref());
				sink.end();
				sink.copy(sub_568.ref());
				sink.copy(term_3273.ref());
				sink.copy(term_2843.ref());
				sink.end();
				return true;
			}
			label_125 :
			{
				if (term_2814.descriptor() != _M__sCons)
				{
					break label_125;
				}
				Term sub_597 = term_2814.sub(0).ref();
				if (sub_597.descriptor() != _M_Crsx_xterms_xS1)
				{
					break label_125;
				}
				Term sub_510 = sub_597.sub(0).ref();
				Term sub_450 = sub_597.sub(1).ref();
				if (sub_450.descriptor() != _M_Crsx_xterm_xA2)
				{
					break label_125;
				}
				Term sub_439 = sub_450.sub(0).ref();
				if (sub_439.descriptor() != _M_Crsx_xboundTerm)
				{
					break label_125;
				}
				Term sub_588 = sub_439.sub(0).ref();
				/* #binder=sub */Term sub_944 = sub_439.sub(1).ref();
				/* #nextBinder=sub */Term sub_448 = term_2814.sub(1).ref();
				/* #terms_S1*=sub */
				/* #pattern=term */
				/* #contractum=term *//*Contract*/sink.properties(safeRef(props_146));
				sink.start(_M_SigNextBinder);
				sink.start(_M_Crsx_xnextBinder_xA1);
				sink.copy(sub_588.ref());
				sink.copy(sub_944.ref());
				sink.end();
				sink.copy(sub_448.ref());
				sink.copy(term_3273.ref());
				sink.copy(term_2843.ref());
				sink.end();
				return true;
			}
			label_205 :
			{
				/* #terms=term */
				/* #pattern=term */
				/* #contractum=term *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.literal("Internal error: all pattern arguments must be metavariable.");
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SigTerms, props_146, term_2814, term_3273, term_2843);
	}

	final public static boolean _M_SigMaybeTerms(Sink sink, int shared, int depth, Properties props_94, Term term_2476, Term term_2205, Term term_3428)
	{
		if (depth < 2000)
		{
			label_32 :
			{
				if (term_2476.descriptor() != _M__sNil)
				{
					break label_32;
				}
				/* #pattern=term */
				/* #contractum=term *//*Contract*/sink.properties(safeRef(props_94));
				sink.start(_M_Body);
				sink.copy(term_2205.ref());
				sink.copy(term_3428.ref());
				sink.end();
				return true;
			}
			label_93 :
			{
				if (term_2476.descriptor() != _M__sCons)
				{
					break label_93;
				}
				Term sub_692 = term_2476.sub(0).ref();
				/* #terms=sub */Term sub_912 = term_2476.sub(1).ref();
				if (sub_912.descriptor() != _M__sNil)
				{
					break label_93;
				}
				/* #pattern=term */
				/* #contractum=term *//*Contract*/sink.properties(safeRef(props_94));
				Term term_2338;
				{
					BufferSink buf_2107 = sink.context().makeBuffer();
					buf_2107.start(_M_TEXTS);
					buf_2107.start(_M__sNil);
					buf_2107.end();
					buf_2107.end();
					term_2338 = buf_2107.term();
				}
				sink.propertyNamed("$binders", term_2338);
				sink.start(_M_SigTerms);
				sink.start(_M_DesugarTerms);
				sink.copy(sub_692.ref());
				sink.end();
				sink.copy(term_2205.ref());
				sink.copy(term_3428.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SigMaybeTerms, props_94, term_2476, term_2205, term_3428);
	}

	final public static boolean _M_SigArguments(Sink sink, int shared, int depth, Properties props_190, Term term_3180, Term term_3065, Term term_2562)
	{
		if (depth < 2000)
		{
			label_231 :
			{
				if (term_3180.descriptor() != _M_Crsx_xarguments)
				{
					break label_231;
				}
				Term sub_513 = term_3180.sub(0).ref();
				Term sub_860 = term_3180.sub(1).ref();
				/* #terms?=sub */Term sub_507 = term_3180.sub(2).ref();
				/* #pattern=term */
				/* #contractum=term *//*Contract*/sink.properties(safeRef(props_190));
				sink.start(_M_SigMaybeTerms);
				sink.copy(sub_860.ref());
				sink.copy(term_3065.ref());
				sink.copy(term_2562.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SigArguments, props_190, term_3180, term_3065, term_2562);
	}

	final public static boolean _M_SigMaybeArguments(Sink sink, int shared, int depth, Properties props_282, Term term_2134, Term term_3257, Term term_2043, Term term_2620)
	{
		if (depth < 2000)
		{
			label_123 :
			{
				if (term_2134.descriptor() != _M_OK)
				{
					break label_123;
				}
				if (term_3257.descriptor() != _M__sNil)
				{
					break label_123;
				}
				/* #pattern=term */
				/* #contractum=term *//*Contract*/sink.properties(safeRef(props_282));
				sink.start(_M_Body);
				sink.copy(term_2043.ref());
				sink.copy(term_2620.ref());
				sink.end();
				return true;
			}
			label_313 :
			{
				if (term_2134.descriptor() != _M_OK)
				{
					break label_313;
				}
				if (term_3257.descriptor() != _M__sCons)
				{
					break label_313;
				}
				Term sub_683 = term_3257.sub(0).ref();
				/* #arguments=sub */Term sub_414 = term_3257.sub(1).ref();
				if (sub_414.descriptor() != _M__sNil)
				{
					break label_313;
				}
				/* #pattern=term */
				/* #contractum=term *//*Contract*/sink.properties(safeRef(props_282));
				sink.start(_M_SigArguments);
				sink.copy(sub_683.ref());
				sink.copy(term_2043.ref());
				sink.copy(term_2620.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SigMaybeArguments, props_282, term_2134, term_3257, term_2043, term_2620);
	}

	final public static boolean _M_SigMaybeProperties(Sink sink, int shared, int depth, Properties props_18, Term term_2405, Variable var_101, Term term_2527)
	{
		if (depth < 2000)
		{
			label_68 :
			{
				if (term_2405.descriptor() != _M__sNil)
				{
					break label_68;
				}
				/* #=term *//*Contract*/sink.properties(safeRef(props_18));
				Term term_2597;
				{
					BufferSink buf_1834 = sink.context().makeBuffer();
					buf_1834.start(_M_OK);
					buf_1834.end();
					term_2597 = buf_1834.term();
				}
				sink.substitute(term_2527.ref(), new Variable[]
					{var_101}, new Term[]
					{term_2597});
				return true;
			}
			label_286 :
			{
				if (term_2405.descriptor() != _M__sCons)
				{
					break label_286;
				}
				Term sub_375 = term_2405.sub(0).ref();
				if (sub_375.descriptor() != _M_Crsx_xproperties)
				{
					break label_286;
				}
				Term sub_424 = sub_375.sub(0).ref();
				Term sub_628 = sub_375.sub(1).ref();
				if (sub_628.descriptor() != _M__sNil)
				{
					break label_286;
				}
				Term sub_612 = sub_375.sub(2).ref();
				Term sub_517 = term_2405.sub(1).ref();
				if (sub_517.descriptor() != _M__sNil)
				{
					break label_286;
				}
				/* #=term *//*Contract*/sink.properties(safeRef(props_18));
				Term term_3172;
				{
					BufferSink buf_2657 = sink.context().makeBuffer();
					buf_2657.start(_M_OK);
					buf_2657.end();
					term_3172 = buf_2657.term();
				}
				sink.substitute(term_2527.ref(), new Variable[]
					{var_101}, new Term[]
					{term_3172});
				return true;
			}
			label_314 :
			{
				if (term_2405.descriptor() != _M__sCons)
				{
					break label_314;
				}
				Term sub_394 = term_2405.sub(0).ref();
				if (sub_394.descriptor() != _M_Crsx_xproperties)
				{
					break label_314;
				}
				Term sub_676 = sub_394.sub(0).ref();
				Term sub_848 = sub_394.sub(1).ref();
				if (sub_848.descriptor() != _M__sCons)
				{
					break label_314;
				}
				Term sub_718 = sub_848.sub(0).ref();
				if (sub_718.descriptor() != _M_Crsx_xpropertyList)
				{
					break label_314;
				}
				Term sub_555 = sub_718.sub(0).ref();
				if (sub_555.descriptor() != _M_Crsx_xproperty_xA1)
				{
					break label_314;
				}
				Term sub_991 = sub_555.sub(0).ref();
				/* #METAVAR=sub */Term sub_334 = sub_718.sub(1).ref();
				/* #propertyList_S1*=sub */Term sub_226 = sub_848.sub(1).ref();
				if (sub_226.descriptor() != _M__sNil)
				{
					break label_314;
				}
				Term sub_556 = sub_394.sub(2).ref();
				Term sub_508 = term_2405.sub(1).ref();
				if (sub_508.descriptor() != _M__sNil)
				{
					break label_314;
				}
				/* #=term *//*Contract*/sink.properties(safeRef(props_18));
				sink.start(_M_SigPropertyRef);
				sink.start(_M_MetaKey);
				sink.copy(sub_991.ref());
				sink.end();
				Variable var_355 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_355});
				VariableUse use_72 = sink.context().makeVariableUse(var_355);
				sink.substitute(term_2527.ref(), new Variable[]
					{var_101}, new Term[]
					{use_72});
				sink.end();
				return true;
			}
			label_97 :
			{
				/* #properties?=term */
				/* #=term *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.start(_M__s);
				sink.start(_M_Builtin_sColon);
				sink.end();
				sink.literal("Internal error: invalid top-level properties on pattern. Must be a property reference. Got:");
				sink.start(_M__s);
				sink.start(_M_Builtin_sShow);
				sink.end();
				sink.copy(term_2405.ref());
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_SigMaybeProperties, props_18, term_2405, var_101, term_2527);
	}

	final public static boolean _M_Signature(Sink sink, int shared, int depth, Properties props_127, Term term_2409, Term term_1467)
	{
		if (depth < 2000)
		{
			label_151 :
			{
				if (term_2409.descriptor() != _M_Crsx_xpattern)
				{
					break label_151;
				}
				Term sub_789 = term_2409.sub(0).ref();
				/* #properties?=sub */Term sub_724 = term_2409.sub(1).ref();
				/* #constructor=sub */Term sub_920 = term_2409.sub(2).ref();
				/* #arguments?=sub */
				/* #contractum=term *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextEmbed);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_127));
				Term term_3134;
				{
					BufferSink buf_2041 = sink.context().makeBuffer();
					buf_2041.start(_M_ToJavaId);
					buf_2041.copy(sub_724.ref());
					buf_2041.end();
					term_3134 = buf_2041.term();
				}
				sink.propertyNamed("$method-name", term_3134);
				sink.start(_M_ToJavaId);
				sink.copy(sub_724.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_3315;
				{
					BufferSink buf_1878 = sink.context().makeBuffer();
					buf_1878.start(_M_STRING);
					buf_1878.literal(1);
					buf_1878.end();
					term_3315 = buf_1878.term();
				}
				sink.propertyNamed("$LineLocation", term_3315);
				Term term_2481;
				{
					BufferSink buf_2416 = sink.context().makeBuffer();
					buf_2416.start(_M_STRING);
					buf_2416.literal(1);
					buf_2416.end();
					term_2481 = buf_2416.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2481);
				sink.start(_M__sTextCons);
				Term term_2957;
				{
					BufferSink buf_1776 = sink.context().makeBuffer();
					buf_1776.start(_M_STRING);
					buf_1776.literal(1);
					buf_1776.end();
					term_2957 = buf_1776.term();
				}
				sink.propertyNamed("$LineLocation", term_2957);
				Term term_2143;
				{
					BufferSink buf_2542 = sink.context().makeBuffer();
					buf_2542.start(_M_STRING);
					buf_2542.literal(1);
					buf_2542.end();
					term_2143 = buf_2542.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2143);
				sink.start(_M__sTextChars);
				sink.literal("(Sink sink, int shared, int depth");
				sink.end();
				Term term_2168;
				{
					BufferSink buf_2997 = sink.context().makeBuffer();
					buf_2997.start(_M_STRING);
					buf_2997.literal(1);
					buf_2997.end();
					term_2168 = buf_2997.term();
				}
				sink.propertyNamed("$LineLocation", term_2168);
				Term term_2583;
				{
					BufferSink buf_2168 = sink.context().makeBuffer();
					buf_2168.start(_M_STRING);
					buf_2168.literal(69);
					buf_2168.end();
					term_2583 = buf_2168.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2583);
				sink.start(_M__sTextCons);
				Term term_2809;
				{
					BufferSink buf_2221 = sink.context().makeBuffer();
					buf_2221.start(_M_STRING);
					buf_2221.literal(1);
					buf_2221.end();
					term_2809 = buf_2221.term();
				}
				sink.propertyNamed("$LineLocation", term_2809);
				Term term_2228;
				{
					BufferSink buf_2458 = sink.context().makeBuffer();
					buf_2458.start(_M_STRING);
					buf_2458.literal(69);
					buf_2458.end();
					term_2228 = buf_2458.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2228);
				sink.start(_M__sTextEmbed);
				Term term_2344;
				{
					BufferSink buf_2195 = sink.context().makeBuffer();
					buf_2195.start(_M_STRING);
					buf_2195.literal(1);
					buf_2195.end();
					term_2344 = buf_2195.term();
				}
				sink.propertyNamed("$LineLocation", term_2344);
				Term term_3838;
				{
					BufferSink buf_2895 = sink.context().makeBuffer();
					buf_2895.start(_M_STRING);
					buf_2895.literal(69);
					buf_2895.end();
					term_3838 = buf_2895.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3838);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_127));
				Term term_2232;
				{
					BufferSink buf_2576 = sink.context().makeBuffer();
					buf_2576.start(_M_TEXTS);
					buf_2576.start(_M__sCons);
					buf_2576.start(_M__sTextCons);
					buf_2576.start(_M__sTextChars);
					buf_2576.literal("sink");
					buf_2576.end();
					buf_2576.start(_M__sTextNil);
					buf_2576.end();
					buf_2576.end();
					buf_2576.start(_M__sCons);
					buf_2576.start(_M_Descriptor);
					buf_2576.copy(sub_724.ref());
					buf_2576.end();
					buf_2576.start(_M__sNil);
					buf_2576.end();
					buf_2576.end();
					buf_2576.end();
					buf_2576.end();
					term_2232 = buf_2576.term();
				}
				sink.propertyNamed("$thunk-args", term_2232);
				sink.start(_M_SigMaybeProperties);
				sink.copy(sub_789.ref());
				Variable var_77 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_77});
				sink.start(_M_SigMaybeArguments);
				sink.use(var_77);
				sink.copy(sub_920.ref());
				sink.start(_M_Crsx_xpattern);
				sink.copy(sub_789.ref());
				sink.copy(sub_724.ref());
				sink.copy(sub_920.ref());
				sink.end();
				sink.copy(term_1467.ref());
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				Term term_2122;
				{
					BufferSink buf_2456 = sink.context().makeBuffer();
					buf_2456.start(_M_STRING);
					buf_2456.literal(1);
					buf_2456.end();
					term_2122 = buf_2456.term();
				}
				sink.propertyNamed("$LineLocation", term_2122);
				Term term_2964;
				{
					BufferSink buf_2780 = sink.context().makeBuffer();
					buf_2780.start(_M_STRING);
					buf_2780.literal(102);
					buf_2780.end();
					term_2964 = buf_2780.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2964);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Signature, props_127, term_2409, term_1467);
	}

	final public static boolean _M_Rule(Sink sink, int shared, int depth, Properties props_50, Term term_2403, Term term_1933, Term term_3169)
	{
		if (depth < 2000)
		{
			label_116 :
			{
				if (term_2403.descriptor() != _M_OK)
				{
					break label_116;
				}
				/* #pattern=term */
				/* #contractum=term *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextChars);
				sink.literal("final public static boolean ");
				sink.end();
				Term term_3122;
				{
					BufferSink buf_2042 = sink.context().makeBuffer();
					buf_2042.start(_M_STRING);
					buf_2042.literal(1);
					buf_2042.end();
					term_3122 = buf_2042.term();
				}
				sink.propertyNamed("$LineLocation", term_3122);
				Term term_2456;
				{
					BufferSink buf_2718 = sink.context().makeBuffer();
					buf_2718.start(_M_STRING);
					buf_2718.literal(1);
					buf_2718.end();
					term_2456 = buf_2718.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2456);
				sink.start(_M__sTextCons);
				Term term_2840;
				{
					BufferSink buf_2582 = sink.context().makeBuffer();
					buf_2582.start(_M_STRING);
					buf_2582.literal(1);
					buf_2582.end();
					term_2840 = buf_2582.term();
				}
				sink.propertyNamed("$LineLocation", term_2840);
				Term term_2624;
				{
					BufferSink buf_2760 = sink.context().makeBuffer();
					buf_2760.start(_M_STRING);
					buf_2760.literal(1);
					buf_2760.end();
					term_2624 = buf_2760.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2624);
				sink.start(_M__sTextEmbed);
				Term term_3138;
				{
					BufferSink buf_2083 = sink.context().makeBuffer();
					buf_2083.start(_M_STRING);
					buf_2083.literal(1);
					buf_2083.end();
					term_3138 = buf_2083.term();
				}
				sink.propertyNamed("$LineLocation", term_3138);
				Term term_3173;
				{
					BufferSink buf_2937 = sink.context().makeBuffer();
					buf_2937.start(_M_STRING);
					buf_2937.literal(1);
					buf_2937.end();
					term_3173 = buf_2937.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3173);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_50));
				sink.start(_M_Signature);
				sink.copy(term_1933.ref());
				sink.copy(term_3169.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_2702;
				{
					BufferSink buf_2444 = sink.context().makeBuffer();
					buf_2444.start(_M_STRING);
					buf_2444.literal(1);
					buf_2444.end();
					term_2702 = buf_2444.term();
				}
				sink.propertyNamed("$LineLocation", term_2702);
				Term term_1894;
				{
					BufferSink buf_1963 = sink.context().makeBuffer();
					buf_1963.start(_M_STRING);
					buf_1963.literal(29);
					buf_1963.end();
					term_1894 = buf_1963.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1894);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Rule, props_50, term_2403, term_1933, term_3169);
	}

	final public static boolean _M_OptionIndexKey(Sink sink, int shared, int depth, Properties props_134, Term term_2789, Term term_3005, Term term_2355, Term term_3024, Term term_2586, Term term_2303, Term term_2296, Variable var_40, Term term_2668)
	{
		if (depth < 2000)
		{
			label_146 :
			{
				/* #keyPrefix=term */
				/* #keysKey=term */
				/* #keys=term */
				/* #value=term */
				/* #key=term */
				/* #count=term */
				/* #terms_S1*=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_134));
				Term term_3547;
				{
					BufferSink buf_3190 = sink.context().makeBuffer();
					buf_3190.start(_M_STRING);
					buf_3190.copy(term_3024.ref());
					buf_3190.end();
					term_3547 = buf_3190.term();
				}
				term_2586 = force(sink.context(), term_2586);
				Sink.property(sink, term_2586, term_3547);
				sink.start(_M_OptionIndex);
				sink.copy(term_2789.ref());
				sink.copy(term_3005.ref());
				sink.start(_M__sCons);
				sink.copy(term_2586.ref());
				sink.copy(term_2355.ref());
				sink.end();
				sink.start(_M__s);
				sink.start(_M_Builtin_sPlus);
				sink.end();
				sink.copy(term_2303.ref());
				sink.literal(1);
				sink.end();
				sink.copy(term_2296.ref());
				Variable var_390 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_390});
				VariableUse use_49 = sink.context().makeVariableUse(var_390);
				sink.substitute(term_2668.ref(), new Variable[]
					{var_40}, new Term[]
					{use_49});
				sink.end();
				return true;
			}
		}
		return thunk(
				sink, _M_OptionIndexKey, props_134, term_2789, term_3005, term_2355, term_3024, term_2586, term_2303, term_2296,
				var_40, term_2668);
	}

	final public static boolean _M_OptionIndex(Sink sink, int shared, int depth, Properties props_117, Term term_2979, Term term_3347, Term term_1957, Term term_2625, Term term_3085, Variable var_72, Term term_2357)
	{
		if (depth < 2000)
		{
			label_174 :
			{
				/* #keyPrefix=term */
				/* #keysKey=term */
				/* #keys=term */
				/* #count=term */
				if (term_3085.descriptor() != _M__sNil)
				{
					break label_174;
				}
				/* #=term *//*Contract*/sink.properties(safeRef(props_117));
				Term term_3637;
				{
					BufferSink buf_2946 = sink.context().makeBuffer();
					buf_2946.start(_M_STRINGS);
					buf_2946.copy(term_1957.ref());
					buf_2946.end();
					term_3637 = buf_2946.term();
				}
				term_3347 = force(sink.context(), term_3347);
				Sink.property(sink, term_3347, term_3637);
				Term term_2526;
				{
					BufferSink buf_2701 = sink.context().makeBuffer();
					buf_2701.start(_M_OK);
					buf_2701.end();
					term_2526 = buf_2701.term();
				}
				sink.substitute(term_2357.ref(), new Variable[]
					{var_72}, new Term[]
					{term_2526});
				return true;
			}
			label_280 :
			{
				/* #keyPrefix=term */
				/* #keysKey=term */
				/* #keys=term */
				/* #count=term */
				if (term_3085.descriptor() != _M__sCons)
				{
					break label_280;
				}
				Term sub_651 = term_3085.sub(0).ref();
				if (sub_651.descriptor() != _M_Crsx_xterms_xS1)
				{
					break label_280;
				}
				Term sub_403 = sub_651.sub(0).ref();
				/* #COMMA=sub */Term sub_602 = sub_651.sub(1).ref();
				if (sub_602.descriptor() != _M_Crsx_xterm_xA1)
				{
					break label_280;
				}
				Term sub_529 = sub_602.sub(0).ref();
				if (sub_529.descriptor() != _M_Crsx_xfreeTerm_xA5)
				{
					break label_280;
				}
				Term sub_940 = sub_529.sub(0).ref();
				if (sub_940.descriptor() != _M__sNil)
				{
					break label_280;
				}
				Term sub_1013 = sub_529.sub(1).ref();
				if (sub_1013.descriptor() != _M_Crsx_xvariable)
				{
					break label_280;
				}
				Term sub_539 = sub_1013.sub(0).ref();
				if (sub_539.descriptor() != _M__sNil)
				{
					break label_280;
				}
				Term sub_451 = sub_1013.sub(1).ref();
				/* #VARIABLE=sub */Term sub_739 = sub_1013.sub(2).ref();
				/* #linear?=sub */Term sub_566 = sub_1013.sub(3).ref();
				/* #functional?=sub */Term sub_384 = sub_1013.sub(4).ref();
				if (sub_384.descriptor() != _M__sCons)
				{
					break label_280;
				}
				Term sub_617 = sub_384.sub(0).ref();
				/* #varsort=sub */Term sub_615 = sub_384.sub(1).ref();
				if (sub_615.descriptor() != _M__sNil)
				{
					break label_280;
				}
				Term sub_758 = term_3085.sub(1).ref();
				/* #terms_S1*=sub */
				/* #=term *//*Contract*/sink.properties(safeRef(props_117));
				sink.start(_M_OptionIndexKey);
				sink.copy(term_2979.ref());
				sink.copy(term_3347.ref());
				sink.copy(term_1957.ref());
				sink.copy(sub_451.ref());
				sink.start(_M__s);
				sink.start(_M_Builtin_sColon);
				sink.end();
				sink.copy(term_2979.ref());
				sink.start(_M__s);
				sink.start(_M_Builtin_sFormatNumber);
				sink.end();
				sink.copy(term_2625.ref());
				sink.end();
				sink.end();
				sink.copy(term_2625.ref());
				sink.copy(sub_758.ref());
				Variable var_42 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_42});
				VariableUse use_124 = sink.context().makeVariableUse(var_42);
				sink.substitute(term_2357.ref(), new Variable[]
					{var_72}, new Term[]
					{use_124});
				sink.end();
				return true;
			}
			label_261 :
			{
				/* #keyPrefix=term */
				/* #keysKey=term */
				/* #keys=term */
				/* #count=term */
				if (term_3085.descriptor() != _M__sCons)
				{
					break label_261;
				}
				Term sub_428 = term_3085.sub(0).ref();
				if (sub_428.descriptor() != _M_Crsx_xterms_xS1)
				{
					break label_261;
				}
				Term sub_695 = sub_428.sub(0).ref();
				/* #COMMA=sub */Term sub_530 = sub_428.sub(1).ref();
				if (sub_530.descriptor() != _M_Crsx_xterm_xA1)
				{
					break label_261;
				}
				Term sub_533 = sub_530.sub(0).ref();
				if (sub_533.descriptor() != _M_Crsx_xfreeTerm_xA7)
				{
					break label_261;
				}
				Term sub_634 = sub_533.sub(0).ref();
				if (sub_634.descriptor() != _M__sNil)
				{
					break label_261;
				}
				Term sub_627 = sub_533.sub(1).ref();
				if (sub_627.descriptor() != _M__sNil)
				{
					break label_261;
				}
				Term sub_787 = sub_533.sub(2).ref();
				/* #METAVAR=sub */Term sub_714 = sub_533.sub(3).ref();
				if (sub_714.descriptor() != _M__sNil)
				{
					break label_261;
				}
				Term sub_867 = term_3085.sub(1).ref();
				/* #terms_S1*=sub */
				/* #=term *//*Contract*/sink.properties(safeRef(props_117));
				sink.start(_M_OptionIndexKey);
				sink.copy(term_2979.ref());
				sink.copy(term_3347.ref());
				sink.copy(term_1957.ref());
				sink.copy(sub_787.ref());
				sink.start(_M__s);
				sink.start(_M_Builtin_sColon);
				sink.end();
				sink.copy(term_2979.ref());
				sink.start(_M__s);
				sink.start(_M_Builtin_sFormatNumber);
				sink.end();
				sink.copy(term_2625.ref());
				sink.end();
				sink.end();
				sink.copy(term_2625.ref());
				sink.copy(sub_867.ref());
				Variable var_191 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_191});
				VariableUse use_291 = sink.context().makeVariableUse(var_191);
				sink.substitute(term_2357.ref(), new Variable[]
					{var_72}, new Term[]
					{use_291});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_OptionIndex, props_117, term_2979, term_3347, term_1957, term_2625, term_3085, var_72, term_2357);
	}

	final public static boolean _M_OptionTerms(Sink sink, int shared, int depth, Properties props_36, Term term_3291, Term term_2953, Variable var_401, Term term_2571)
	{
		if (depth < 2000)
		{
			label_471 :
			{
				if (term_3291.descriptor() != _M_OK)
				{
					break label_471;
				}
				if (term_2953.descriptor() != _M__sNil)
				{
					break label_471;
				}
				/* #=term *//*Contract*/sink.properties(safeRef(props_36));
				Term term_3269;
				{
					BufferSink buf_2796 = sink.context().makeBuffer();
					buf_2796.start(_M_OK);
					buf_2796.end();
					term_3269 = buf_2796.term();
				}
				sink.substitute(term_2571.ref(), new Variable[]
					{var_401}, new Term[]
					{term_3269});
				return true;
			}
			label_107 :
			{
				if (term_3291.descriptor() != _M_OK)
				{
					break label_107;
				}
				if (term_2953.descriptor() != _M__sCons)
				{
					break label_107;
				}
				Term sub_788 = term_2953.sub(0).ref();
				if (sub_788.descriptor() != _M_Crsx_xterms_xS1)
				{
					break label_107;
				}
				Term sub_762 = sub_788.sub(0).ref();
				Term sub_396 = sub_788.sub(1).ref();
				if (sub_396.descriptor() != _M_Crsx_xterm_xA1)
				{
					break label_107;
				}
				Term sub_454 = sub_396.sub(0).ref();
				if (sub_454.descriptor() != _M_Crsx_xfreeTerm_xA1)
				{
					break label_107;
				}
				Term sub_803 = sub_454.sub(0).ref();
				if (sub_803.descriptor() != _M__sNil)
				{
					break label_107;
				}
				Term sub_696 = sub_454.sub(1).ref();
				if (sub_696.descriptor() != _M__sNil)
				{
					break label_107;
				}
				Term sub_560 = sub_454.sub(2).ref();
				if (sub_560.descriptor() != _M_Crsx_xconstructor_xA1)
				{
					break label_107;
				}
				Term sub_664 = sub_560.sub(0).ref();
				if (sub_664.descriptor() != _M_Crsx_xqualifier_xA2)
				{
					break label_107;
				}
				Term sub_405 = sub_560.sub(1).ref();
				/* #CONSTRUCTOR=sub */Term sub_966 = sub_454.sub(3).ref();
				if (sub_966.descriptor() != _M__sNil)
				{
					break label_107;
				}
				Term sub_592 = term_2953.sub(1).ref();
				/* #terms_S1*=sub */
				/* #=term *//*Contract*/sink.properties(safeRef(props_36));
				sink.start(_M_OptionTerms);
				sink.start(_M_OK);
				sink.end();
				sink.copy(sub_592.ref());
				Variable var_141 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_141});
				VariableUse use_73 = sink.context().makeVariableUse(var_141);
				sink.substitute(term_2571.ref(), new Variable[]
					{var_401}, new Term[]
					{use_73});
				sink.end();
				return true;
			}
			label_213 :
			{
				if (term_3291.descriptor() != _M_OK)
				{
					break label_213;
				}
				if (term_2953.descriptor() != _M__sCons)
				{
					break label_213;
				}
				Term sub_422 = term_2953.sub(0).ref();
				if (sub_422.descriptor() != _M_Crsx_xterms_xS1)
				{
					break label_213;
				}
				Term sub_909 = sub_422.sub(0).ref();
				Term sub_742 = sub_422.sub(1).ref();
				if (sub_742.descriptor() != _M_Crsx_xterm_xA1)
				{
					break label_213;
				}
				Term sub_570 = sub_742.sub(0).ref();
				if (sub_570.descriptor() != _M_Crsx_xfreeTerm_xA1)
				{
					break label_213;
				}
				Term sub_331 = sub_570.sub(0).ref();
				if (sub_331.descriptor() != _M__sNil)
				{
					break label_213;
				}
				Term sub_1171 = sub_570.sub(1).ref();
				if (sub_1171.descriptor() != _M__sNil)
				{
					break label_213;
				}
				Term sub_878 = sub_570.sub(2).ref();
				if (sub_878.descriptor() != _M_Crsx_xconstructor_xA1)
				{
					break label_213;
				}
				Term sub_444 = sub_878.sub(0).ref();
				if (sub_444.descriptor() != _M_Crsx_xqualifier_xA2)
				{
					break label_213;
				}
				Term sub_941 = sub_878.sub(1).ref();
				/* #CONSTRUCTOR=sub */Term sub_480 = sub_570.sub(3).ref();
				if (sub_480.descriptor() != _M__sCons)
				{
					break label_213;
				}
				Term sub_791 = sub_480.sub(0).ref();
				if (sub_791.descriptor() != _M_Crsx_xarguments)
				{
					break label_213;
				}
				Term sub_373 = sub_791.sub(0).ref();
				Term sub_498 = sub_791.sub(1).ref();
				if (sub_498.descriptor() != _M__sNil)
				{
					break label_213;
				}
				Term sub_344 = sub_791.sub(2).ref();
				Term sub_626 = sub_480.sub(1).ref();
				if (sub_626.descriptor() != _M__sNil)
				{
					break label_213;
				}
				Term sub_1053 = term_2953.sub(1).ref();
				/* #terms_S1*=sub */
				/* #=term *//*Contract*/sink.properties(safeRef(props_36));
				sink.start(_M_OptionTerms);
				sink.start(_M_OK);
				sink.end();
				sink.copy(sub_1053.ref());
				Variable var_224 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_224});
				VariableUse use_30 = sink.context().makeVariableUse(var_224);
				sink.substitute(term_2571.ref(), new Variable[]
					{var_401}, new Term[]
					{use_30});
				sink.end();
				return true;
			}
			label_285 :
			{
				if (term_3291.descriptor() != _M_OK)
				{
					break label_285;
				}
				if (term_2953.descriptor() != _M__sCons)
				{
					break label_285;
				}
				Term sub_797 = term_2953.sub(0).ref();
				if (sub_797.descriptor() != _M_Crsx_xterms_xS1)
				{
					break label_285;
				}
				Term sub_353 = sub_797.sub(0).ref();
				Term sub_390 = sub_797.sub(1).ref();
				if (sub_390.descriptor() != _M_Crsx_xterm_xA1)
				{
					break label_285;
				}
				Term sub_849 = sub_390.sub(0).ref();
				if (sub_849.descriptor() != _M_Crsx_xfreeTerm_xA1)
				{
					break label_285;
				}
				Term sub_843 = sub_849.sub(0).ref();
				if (sub_843.descriptor() != _M__sNil)
				{
					break label_285;
				}
				Term sub_431 = sub_849.sub(1).ref();
				if (sub_431.descriptor() != _M__sNil)
				{
					break label_285;
				}
				Term sub_398 = sub_849.sub(2).ref();
				if (sub_398.descriptor() != _M_Crsx_xconstructor_xA1)
				{
					break label_285;
				}
				Term sub_853 = sub_398.sub(0).ref();
				if (sub_853.descriptor() != _M_Crsx_xqualifier_xA2)
				{
					break label_285;
				}
				Term sub_417 = sub_398.sub(1).ref();
				/* #CONSTRUCTOR=sub */Term sub_536 = sub_849.sub(3).ref();
				if (sub_536.descriptor() != _M__sCons)
				{
					break label_285;
				}
				Term sub_689 = sub_536.sub(0).ref();
				if (sub_689.descriptor() != _M_Crsx_xarguments)
				{
					break label_285;
				}
				Term sub_681 = sub_689.sub(0).ref();
				Term sub_778 = sub_689.sub(1).ref();
				if (sub_778.descriptor() != _M__sCons)
				{
					break label_285;
				}
				Term sub_521 = sub_778.sub(0).ref();
				/* #terms=sub */Term sub_661 = sub_778.sub(1).ref();
				if (sub_661.descriptor() != _M__sNil)
				{
					break label_285;
				}
				Term sub_537 = sub_689.sub(2).ref();
				Term sub_534 = sub_536.sub(1).ref();
				if (sub_534.descriptor() != _M__sNil)
				{
					break label_285;
				}
				Term sub_704 = term_2953.sub(1).ref();
				/* #terms_S1*=sub */
				/* #=term *//*Contract*/sink.properties(safeRef(props_36));
				sink.start(_M_OptionIndex);
				sink.start(_M__s);
				sink.start(_M_Builtin_sColon);
				sink.end();
				sink.literal("$Option$");
				sink.copy(sub_417.ref());
				sink.literal("$");
				sink.end();
				sink.start(_M__s);
				sink.start(_M_Builtin_sColon);
				sink.end();
				sink.literal("$");
				sink.copy(sub_417.ref());
				sink.literal("es");
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.literal(0);
				sink.start(_M_DesugarTerms);
				sink.copy(sub_521.ref());
				sink.end();
				Variable var_11 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_11});
				sink.start(_M_OptionTerms);
				sink.use(var_11);
				sink.copy(sub_704.ref());
				Variable var_124 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_124});
				VariableUse use_20 = sink.context().makeVariableUse(var_124);
				sink.substitute(term_2571.ref(), new Variable[]
					{var_401}, new Term[]
					{use_20});
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_OptionTerms, props_36, term_3291, term_2953, var_401, term_2571);
	}

	final public static boolean _M_OptionArgumentsOpt(Sink sink, int shared, int depth, Properties props_16, Term term_3181, Variable var_180, Term term_2879)
	{
		if (depth < 2000)
		{
			label_183 :
			{
				if (term_3181.descriptor() != _M__sNil)
				{
					break label_183;
				}
				/* #=term *//*Contract*/sink.properties(safeRef(props_16));
				Term term_2911;
				{
					BufferSink buf_2986 = sink.context().makeBuffer();
					buf_2986.start(_M_OK);
					buf_2986.end();
					term_2911 = buf_2986.term();
				}
				sink.substitute(term_2879.ref(), new Variable[]
					{var_180}, new Term[]
					{term_2911});
				return true;
			}
			label_184 :
			{
				if (term_3181.descriptor() != _M__sCons)
				{
					break label_184;
				}
				Term sub_698 = term_3181.sub(0).ref();
				if (sub_698.descriptor() != _M_Crsx_xarguments)
				{
					break label_184;
				}
				Term sub_792 = sub_698.sub(0).ref();
				Term sub_502 = sub_698.sub(1).ref();
				if (sub_502.descriptor() != _M__sCons)
				{
					break label_184;
				}
				Term sub_662 = sub_502.sub(0).ref();
				/* #terms=sub */Term sub_702 = sub_502.sub(1).ref();
				if (sub_702.descriptor() != _M__sNil)
				{
					break label_184;
				}
				Term sub_926 = sub_698.sub(2).ref();
				Term sub_770 = term_3181.sub(1).ref();
				if (sub_770.descriptor() != _M__sNil)
				{
					break label_184;
				}
				/* #=term *//*Contract*/sink.properties(safeRef(props_16));
				sink.start(_M_OptionTerms);
				sink.start(_M_OK);
				sink.end();
				sink.start(_M_DesugarTerms);
				sink.copy(sub_662.ref());
				sink.end();
				Variable var_76 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_76});
				VariableUse use_102 = sink.context().makeVariableUse(var_76);
				sink.substitute(term_2879.ref(), new Variable[]
					{var_180}, new Term[]
					{use_102});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_OptionArgumentsOpt, props_16, term_3181, var_180, term_2879);
	}

	final public static boolean _M_OptionOpt(Sink sink, int shared, int depth, Properties props_86, Term term_3645, Variable var_83, Term term_3234)
	{
		if (depth < 2000)
		{
			label_163 :
			{
				if (term_3645.descriptor() != _M__sNil)
				{
					break label_163;
				}
				/* #=term *//*Contract*/sink.properties(safeRef(props_86));
				Term term_2317;
				{
					BufferSink buf_1799 = sink.context().makeBuffer();
					buf_1799.start(_M_OK);
					buf_1799.end();
					term_2317 = buf_1799.term();
				}
				sink.substitute(term_3234.ref(), new Variable[]
					{var_83}, new Term[]
					{term_2317});
				return true;
			}
			label_62 :
			{
				if (term_3645.descriptor() != _M__sCons)
				{
					break label_62;
				}
				Term sub_562 = term_3645.sub(0).ref();
				if (sub_562.descriptor() != _M_Crsx_xoption_xA1)
				{
					break label_62;
				}
				Term sub_601 = sub_562.sub(0).ref();
				/* #constructor=sub */Term sub_1000 = sub_562.sub(1).ref();
				/* #arguments?=sub */Term sub_666 = sub_562.sub(2).ref();
				Term sub_330 = term_3645.sub(1).ref();
				if (sub_330.descriptor() != _M__sNil)
				{
					break label_62;
				}
				/* #=term *//*Contract*/sink.properties(safeRef(props_86));
				sink.start(_M_OptionArgumentsOpt);
				sink.copy(sub_1000.ref());
				Variable var_130 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_130});
				VariableUse use_172 = sink.context().makeVariableUse(var_130);
				sink.substitute(term_3234.ref(), new Variable[]
					{var_83}, new Term[]
					{use_172});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_OptionOpt, props_86, term_3645, var_83, term_3234);
	}

	final public static boolean _M_DataForm(Sink sink, int shared, int depth, Properties props_160, Term term_3453)
	{
		if (depth < 2000)
		{
			label_129 :
			{
				if (term_3453.descriptor() != _M_Crsx_xforms_xS1)
				{
					break label_129;
				}
				Term sub_1114 = term_3453.sub(0).ref();
				if (sub_1114.descriptor() != _M_Crsx_xform_xA1)
				{
					break label_129;
				}
				Term sub_310 = sub_1114.sub(0).ref();
				/* #constructor=sub */Term sub_632 = sub_1114.sub(1).ref();
				/* #arguments?=sub */Term sub_846 = term_3453.sub(1).ref();/*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2203;
				{
					BufferSink buf_2334 = sink.context().makeBuffer();
					buf_2334.start(_M_STRING);
					buf_2334.literal(1);
					buf_2334.end();
					term_2203 = buf_2334.term();
				}
				sink.propertyNamed("$LineLocation", term_2203);
				Term term_2615;
				{
					BufferSink buf_2721 = sink.context().makeBuffer();
					buf_2721.start(_M_STRING);
					buf_2721.literal(1);
					buf_2721.end();
					term_2615 = buf_2721.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2615);
				sink.start(_M__sTextCons);
				Term term_2503;
				{
					BufferSink buf_2740 = sink.context().makeBuffer();
					buf_2740.start(_M_STRING);
					buf_2740.literal(1);
					buf_2740.end();
					term_2503 = buf_2740.term();
				}
				sink.propertyNamed("$LineLocation", term_2503);
				Term term_2737;
				{
					BufferSink buf_1936 = sink.context().makeBuffer();
					buf_1936.start(_M_STRING);
					buf_1936.literal(1);
					buf_1936.end();
					term_2737 = buf_1936.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2737);
				sink.start(_M__sTextChars);
				sink.literal("final public static ConstructionDescriptor ");
				sink.end();
				Term term_2308;
				{
					BufferSink buf_2592 = sink.context().makeBuffer();
					buf_2592.start(_M_STRING);
					buf_2592.literal(2);
					buf_2592.end();
					term_2308 = buf_2592.term();
				}
				sink.propertyNamed("$LineLocation", term_2308);
				Term term_3454;
				{
					BufferSink buf_3114 = sink.context().makeBuffer();
					buf_3114.start(_M_STRING);
					buf_3114.literal(1);
					buf_3114.end();
					term_3454 = buf_3114.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3454);
				sink.start(_M__sTextCons);
				Term term_2373;
				{
					BufferSink buf_2016 = sink.context().makeBuffer();
					buf_2016.start(_M_STRING);
					buf_2016.literal(2);
					buf_2016.end();
					term_2373 = buf_2016.term();
				}
				sink.propertyNamed("$LineLocation", term_2373);
				Term term_3034;
				{
					BufferSink buf_3002 = sink.context().makeBuffer();
					buf_3002.start(_M_STRING);
					buf_3002.literal(1);
					buf_3002.end();
					term_3034 = buf_3002.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3034);
				sink.start(_M__sTextEmbed);
				Term term_4138;
				{
					BufferSink buf_1840 = sink.context().makeBuffer();
					buf_1840.start(_M_STRING);
					buf_1840.literal(2);
					buf_1840.end();
					term_4138 = buf_1840.term();
				}
				sink.propertyNamed("$LineLocation", term_4138);
				Term term_2540;
				{
					BufferSink buf_2248 = sink.context().makeBuffer();
					buf_2248.start(_M_STRING);
					buf_2248.literal(1);
					buf_2248.end();
					term_2540 = buf_2248.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2540);
				sink.start(_M_AsText);
				sink.start(_M_Descriptor);
				sink.copy(sub_310.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_2664;
				{
					BufferSink buf_2443 = sink.context().makeBuffer();
					buf_2443.start(_M_STRING);
					buf_2443.literal(2);
					buf_2443.end();
					term_2664 = buf_2443.term();
				}
				sink.propertyNamed("$LineLocation", term_2664);
				Term term_2903;
				{
					BufferSink buf_2160 = sink.context().makeBuffer();
					buf_2160.start(_M_STRING);
					buf_2160.literal(44);
					buf_2160.end();
					term_2903 = buf_2160.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2903);
				sink.start(_M__sTextCons);
				Term term_3353;
				{
					BufferSink buf_2481 = sink.context().makeBuffer();
					buf_2481.start(_M_STRING);
					buf_2481.literal(2);
					buf_2481.end();
					term_3353 = buf_2481.term();
				}
				sink.propertyNamed("$LineLocation", term_3353);
				Term term_2179;
				{
					BufferSink buf_1801 = sink.context().makeBuffer();
					buf_1801.start(_M_STRING);
					buf_1801.literal(44);
					buf_1801.end();
					term_2179 = buf_1801.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2179);
				sink.start(_M__sTextChars);
				sink.literal(" = makeData(");
				sink.end();
				Term term_2421;
				{
					BufferSink buf_2491 = sink.context().makeBuffer();
					buf_2491.start(_M_STRING);
					buf_2491.literal(2);
					buf_2491.end();
					term_2421 = buf_2491.term();
				}
				sink.propertyNamed("$LineLocation", term_2421);
				Term term_2013;
				{
					BufferSink buf_2449 = sink.context().makeBuffer();
					buf_2449.start(_M_STRING);
					buf_2449.literal(70);
					buf_2449.end();
					term_2013 = buf_2449.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2013);
				sink.start(_M__sTextCons);
				Term term_2394;
				{
					BufferSink buf_2812 = sink.context().makeBuffer();
					buf_2812.start(_M_STRING);
					buf_2812.literal(2);
					buf_2812.end();
					term_2394 = buf_2812.term();
				}
				sink.propertyNamed("$LineLocation", term_2394);
				Term term_2942;
				{
					BufferSink buf_2451 = sink.context().makeBuffer();
					buf_2451.start(_M_STRING);
					buf_2451.literal(70);
					buf_2451.end();
					term_2942 = buf_2451.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2942);
				sink.start(_M__sTextEmbed);
				Term term_3355;
				{
					BufferSink buf_2343 = sink.context().makeBuffer();
					buf_2343.start(_M_STRING);
					buf_2343.literal(2);
					buf_2343.end();
					term_3355 = buf_2343.term();
				}
				sink.propertyNamed("$LineLocation", term_3355);
				Term term_3275;
				{
					BufferSink buf_2642 = sink.context().makeBuffer();
					buf_2642.start(_M_STRING);
					buf_2642.literal(70);
					buf_2642.end();
					term_3275 = buf_2642.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3275);
				sink.start(_M_AsText);
				sink.start(_M_QuotedConstructor);
				sink.copy(sub_310.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_1990;
				{
					BufferSink buf_2007 = sink.context().makeBuffer();
					buf_2007.start(_M_STRING);
					buf_2007.literal(2);
					buf_2007.end();
					term_1990 = buf_2007.term();
				}
				sink.propertyNamed("$LineLocation", term_1990);
				Term term_2499;
				{
					BufferSink buf_2442 = sink.context().makeBuffer();
					buf_2442.start(_M_STRING);
					buf_2442.literal(82);
					buf_2442.end();
					term_2499 = buf_2442.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2499);
				sink.start(_M__sTextCons);
				Term term_2493;
				{
					BufferSink buf_2025 = sink.context().makeBuffer();
					buf_2025.start(_M_STRING);
					buf_2025.literal(2);
					buf_2025.end();
					term_2493 = buf_2025.term();
				}
				sink.propertyNamed("$LineLocation", term_2493);
				Term term_2709;
				{
					BufferSink buf_2698 = sink.context().makeBuffer();
					buf_2698.start(_M_STRING);
					buf_2698.literal(82);
					buf_2698.end();
					term_2709 = buf_2698.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2709);
				sink.start(_M__sTextChars);
				sink.literal(");");
				sink.end();
				Term term_2266;
				{
					BufferSink buf_2840 = sink.context().makeBuffer();
					buf_2840.start(_M_STRING);
					buf_2840.literal(2);
					buf_2840.end();
					term_2266 = buf_2840.term();
				}
				sink.propertyNamed("$LineLocation", term_2266);
				Term term_2301;
				{
					BufferSink buf_1412 = sink.context().makeBuffer();
					buf_1412.start(_M_STRING);
					buf_1412.literal(115);
					buf_1412.end();
					term_2301 = buf_1412.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2301);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_DataForm, props_160, term_3453);
	}

	final public static boolean _M_DataSort(Sink sink, int shared, int depth, Properties props_144, Term term_2839, Term term_3004, Term term_2726)
	{
		if (depth < 2000)
		{
			sink.start(_M_Text_Concat);
			sink.start(_M_Map);
			Variable var_316 = sink.context().makeVariable("form");
			sink.binds(new Variable[]
				{var_316});
			sink.properties(safeRef(props_144));
			sink.start(_M_DataForm);
			sink.use(var_316);
			sink.end();
			sink.copy(term_2726.ref());
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_DataSort, props_144, term_2839, term_3004, term_2726);
	}

	final public static boolean _M_Declaration(Sink sink, int shared, int depth, Properties props_49, Term term_2611)
	{
		if (depth < 2000)
		{
			label_161 :
			{
				if (term_2611.descriptor() != _M_Crsx_xdeclaration_xA1)
				{
					break label_161;
				}
				Term sub_638 = term_2611.sub(0).ref();
				if (sub_638.descriptor() != _M_Crsx_xmoduleDeclaration)
				{
					break label_161;
				}
				Term sub_572 = sub_638.sub(0).ref();
				Term sub_412 = sub_638.sub(1).ref();
				/* #CONSTRUCTOR=sub */Term sub_355 = sub_638.sub(2).ref();
				Term sub_674 = sub_638.sub(3).ref();
				/* #declarations=sub */Term sub_761 = sub_638.sub(4).ref();/*Contract*/
				sink.properties(safeRef(props_49));
				sink.start(_M_Declarations);
				sink.start(_M_DesugarDeclarations);
				sink.copy(sub_674.ref());
				sink.end();
				sink.end();
				return true;
			}
			label_186 :
			{
				if (term_2611.descriptor() != _M_Crsx_xdeclaration_xA2)
				{
					break label_186;
				}
				Term sub_436 = term_2611.sub(0).ref();
				if (sub_436.descriptor() != _M_Crsx_ximportDeclaration_xA2)
				{
					break label_186;
				}
				Term sub_579 = sub_436.sub(0).ref();
				Term sub_774 = sub_436.sub(1).ref();
				Term sub_899 = sub_436.sub(2).ref();
				/* #constructor=sub *//*Contract*/sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
			label_323 :
			{
				if (term_2611.descriptor() != _M_Crsx_xdeclaration_xA2)
				{
					break label_323;
				}
				Term sub_585 = term_2611.sub(0).ref();
				if (sub_585.descriptor() != _M_Crsx_ximportDeclaration_xA3)
				{
					break label_323;
				}
				Term sub_577 = sub_585.sub(0).ref();
				Term sub_446 = sub_585.sub(1).ref();
				Term sub_504 = sub_585.sub(2).ref();
				/* #constructor=sub *//*Contract*/sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
			label_122 :
			{
				if (term_2611.descriptor() != _M_Crsx_xdeclaration_xA3)
				{
					break label_122;
				}
				Term sub_583 = term_2611.sub(0).ref();
				if (sub_583.descriptor() != _M_Crsx_xruleDeclaration)
				{
					break label_122;
				}
				Term sub_883 = sub_583.sub(0).ref();
				/* #option?=sub */Term sub_624 = sub_583.sub(1).ref();
				/* #pattern=sub */Term sub_751 = sub_583.sub(2).ref();
				Term sub_973 = sub_583.sub(3).ref();
				/* #contractum=sub *//*Contract*/sink.properties(safeRef(props_49));
				sink.start(_M_OptionOpt);
				sink.copy(sub_883.ref());
				Variable var_250 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_250});
				sink.start(_M_Rule);
				sink.use(var_250);
				sink.copy(sub_624.ref());
				sink.copy(sub_973.ref());
				sink.end();
				sink.end();
				return true;
			}
			label_524 :
			{
				if (term_2611.descriptor() != _M_Crsx_xdeclaration_xA4)
				{
					break label_524;
				}
				Term sub_992 = term_2611.sub(0).ref();
				if (sub_992.descriptor() != _M_Crsx_xsortDeclaration_xA1)
				{
					break label_524;
				}
				Term sub_629 = sub_992.sub(0).ref();
				/* #sortparams?=sub */Term sub_372 = sub_992.sub(1).ref();
				/* #sortset=sub */Term sub_691 = sub_992.sub(2).ref();
				/* #sortname=sub */Term sub_854 = sub_992.sub(3).ref();
				Term sub_313 = sub_992.sub(4).ref();
				Term sub_748 = sub_992.sub(5).ref();
				if (sub_748.descriptor() != _M_Crsx_xforms)
				{
					break label_524;
				}
				Term sub_564 = sub_748.sub(0).ref();
				/* #forms_S1*=sub */Term sub_549 = sub_992.sub(6).ref();/*Contract*/
				sink.properties(safeRef(props_49));
				sink.start(_M_DataSort);
				sink.copy(sub_372.ref());
				sink.copy(sub_691.ref());
				sink.copy(sub_564.ref());
				sink.end();
				return true;
			}
			label_198 :
			{
				Term value_66 = props_49 == null ? null : props_49.lookup("$classname");
				if (value_66 == null)
				{
					break label_198;
				}
				if (value_66.descriptor() != _M_STRING)
				{
					break label_198;
				}
				Term sub_621 = value_66.sub(0).ref();
				/* #class=sub */
				if (term_2611.descriptor() != _M_Crsx_xdeclaration_xA4)
				{
					break label_198;
				}
				Term sub_752 = term_2611.sub(0).ref();
				if (sub_752.descriptor() != _M_Crsx_xsortDeclaration_xA2)
				{
					break label_198;
				}
				Term sub_1255 = sub_752.sub(0).ref();
				/* #sortparams?=sub */Term sub_1197 = sub_752.sub(1).ref();
				/* #sortset=sub */Term sub_578 = sub_752.sub(2).ref();
				if (sub_578.descriptor() != _M_Crsx_xform_xA1)
				{
					break label_198;
				}
				Term sub_1117 = sub_578.sub(0).ref();
				/* #constructor=sub */Term sub_649 = sub_578.sub(1).ref();
				/* #arguments?=sub */Term sub_671 = sub_752.sub(3).ref();
				Term sub_781 = sub_752.sub(4).ref();
				/* #sortname=sub *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_3013;
				{
					BufferSink buf_2164 = sink.context().makeBuffer();
					buf_2164.start(_M_STRING);
					buf_2164.literal(1);
					buf_2164.end();
					term_3013 = buf_2164.term();
				}
				sink.propertyNamed("$LineLocation", term_3013);
				Term term_3012;
				{
					BufferSink buf_2589 = sink.context().makeBuffer();
					buf_2589.start(_M_STRING);
					buf_2589.literal(1);
					buf_2589.end();
					term_3012 = buf_2589.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3012);
				sink.start(_M__sTextCons);
				Term term_3042;
				{
					BufferSink buf_3579 = sink.context().makeBuffer();
					buf_3579.start(_M_STRING);
					buf_3579.literal(1);
					buf_3579.end();
					term_3042 = buf_3579.term();
				}
				sink.propertyNamed("$LineLocation", term_3042);
				Term term_3332;
				{
					BufferSink buf_2347 = sink.context().makeBuffer();
					buf_2347.start(_M_STRING);
					buf_2347.literal(1);
					buf_2347.end();
					term_3332 = buf_2347.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3332);
				sink.start(_M__sTextChars);
				sink.literal("final public static DynamicFunctionDescriptor ");
				sink.end();
				Term term_3224;
				{
					BufferSink buf_2238 = sink.context().makeBuffer();
					buf_2238.start(_M_STRING);
					buf_2238.literal(1);
					buf_2238.end();
					term_3224 = buf_2238.term();
				}
				sink.propertyNamed("$LineLocation", term_3224);
				Term term_2776;
				{
					BufferSink buf_2264 = sink.context().makeBuffer();
					buf_2264.start(_M_STRING);
					buf_2264.literal(2);
					buf_2264.end();
					term_2776 = buf_2264.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2776);
				sink.start(_M__sTextCons);
				Term term_2812;
				{
					BufferSink buf_2918 = sink.context().makeBuffer();
					buf_2918.start(_M_STRING);
					buf_2918.literal(1);
					buf_2918.end();
					term_2812 = buf_2918.term();
				}
				sink.propertyNamed("$LineLocation", term_2812);
				Term term_3189;
				{
					BufferSink buf_2559 = sink.context().makeBuffer();
					buf_2559.start(_M_STRING);
					buf_2559.literal(2);
					buf_2559.end();
					term_3189 = buf_2559.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3189);
				sink.start(_M__sTextEmbed);
				Term term_2360;
				{
					BufferSink buf_2275 = sink.context().makeBuffer();
					buf_2275.start(_M_STRING);
					buf_2275.literal(1);
					buf_2275.end();
					term_2360 = buf_2275.term();
				}
				sink.propertyNamed("$LineLocation", term_2360);
				Term term_2557;
				{
					BufferSink buf_2370 = sink.context().makeBuffer();
					buf_2370.start(_M_STRING);
					buf_2370.literal(2);
					buf_2370.end();
					term_2557 = buf_2370.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2557);
				sink.start(_M_AsText);
				sink.start(_M_Descriptor);
				sink.copy(sub_1117.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_1961;
				{
					BufferSink buf_2067 = sink.context().makeBuffer();
					buf_2067.start(_M_STRING);
					buf_2067.literal(1);
					buf_2067.end();
					term_1961 = buf_2067.term();
				}
				sink.propertyNamed("$LineLocation", term_1961);
				Term term_2850;
				{
					BufferSink buf_2219 = sink.context().makeBuffer();
					buf_2219.start(_M_STRING);
					buf_2219.literal(48);
					buf_2219.end();
					term_2850 = buf_2219.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2850);
				sink.start(_M__sTextCons);
				Term term_3008;
				{
					BufferSink buf_3318 = sink.context().makeBuffer();
					buf_3318.start(_M_STRING);
					buf_3318.literal(1);
					buf_3318.end();
					term_3008 = buf_3318.term();
				}
				sink.propertyNamed("$LineLocation", term_3008);
				Term term_2530;
				{
					BufferSink buf_2493 = sink.context().makeBuffer();
					buf_2493.start(_M_STRING);
					buf_2493.literal(48);
					buf_2493.end();
					term_2530 = buf_2493.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2530);
				sink.start(_M__sTextChars);
				sink.literal(" = makeFunction(");
				sink.end();
				Term term_2255;
				{
					BufferSink buf_2435 = sink.context().makeBuffer();
					buf_2435.start(_M_STRING);
					buf_2435.literal(1);
					buf_2435.end();
					term_2255 = buf_2435.term();
				}
				sink.propertyNamed("$LineLocation", term_2255);
				Term term_3310;
				{
					BufferSink buf_2627 = sink.context().makeBuffer();
					buf_2627.start(_M_STRING);
					buf_2627.literal(74);
					buf_2627.end();
					term_3310 = buf_2627.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3310);
				sink.start(_M__sTextCons);
				Term term_2535;
				{
					BufferSink buf_2350 = sink.context().makeBuffer();
					buf_2350.start(_M_STRING);
					buf_2350.literal(1);
					buf_2350.end();
					term_2535 = buf_2350.term();
				}
				sink.propertyNamed("$LineLocation", term_2535);
				Term term_2028;
				{
					BufferSink buf_2338 = sink.context().makeBuffer();
					buf_2338.start(_M_STRING);
					buf_2338.literal(74);
					buf_2338.end();
					term_2028 = buf_2338.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2028);
				sink.start(_M__sTextEmbed);
				Term term_2950;
				{
					BufferSink buf_4049 = sink.context().makeBuffer();
					buf_4049.start(_M_STRING);
					buf_4049.literal(1);
					buf_4049.end();
					term_2950 = buf_4049.term();
				}
				sink.propertyNamed("$LineLocation", term_2950);
				Term term_2022;
				{
					BufferSink buf_1921 = sink.context().makeBuffer();
					buf_1921.start(_M_STRING);
					buf_1921.literal(74);
					buf_1921.end();
					term_2022 = buf_1921.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2022);
				sink.start(_M_AsText);
				sink.start(_M_QuotedConstructor);
				sink.copy(sub_1117.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_2549;
				{
					BufferSink buf_2879 = sink.context().makeBuffer();
					buf_2879.start(_M_STRING);
					buf_2879.literal(1);
					buf_2879.end();
					term_2549 = buf_2879.term();
				}
				sink.propertyNamed("$LineLocation", term_2549);
				Term term_2477;
				{
					BufferSink buf_2647 = sink.context().makeBuffer();
					buf_2647.start(_M_STRING);
					buf_2647.literal(90);
					buf_2647.end();
					term_2477 = buf_2647.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2477);
				sink.start(_M__sTextCons);
				Term term_2413;
				{
					BufferSink buf_2875 = sink.context().makeBuffer();
					buf_2875.start(_M_STRING);
					buf_2875.literal(1);
					buf_2875.end();
					term_2413 = buf_2875.term();
				}
				sink.propertyNamed("$LineLocation", term_2413);
				Term term_2891;
				{
					BufferSink buf_2030 = sink.context().makeBuffer();
					buf_2030.start(_M_STRING);
					buf_2030.literal(90);
					buf_2030.end();
					term_2891 = buf_2030.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2891);
				sink.start(_M__sTextChars);
				sink.literal(", ");
				sink.end();
				Term term_2264;
				{
					BufferSink buf_2531 = sink.context().makeBuffer();
					buf_2531.start(_M_STRING);
					buf_2531.literal(1);
					buf_2531.end();
					term_2264 = buf_2531.term();
				}
				sink.propertyNamed("$LineLocation", term_2264);
				Term term_2376;
				{
					BufferSink buf_2441 = sink.context().makeBuffer();
					buf_2441.start(_M_STRING);
					buf_2441.literal(123);
					buf_2441.end();
					term_2376 = buf_2441.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2376);
				sink.start(_M__sTextCons);
				Term term_3477;
				{
					BufferSink buf_2487 = sink.context().makeBuffer();
					buf_2487.start(_M_STRING);
					buf_2487.literal(1);
					buf_2487.end();
					term_3477 = buf_2487.term();
				}
				sink.propertyNamed("$LineLocation", term_3477);
				Term term_3182;
				{
					BufferSink buf_2624 = sink.context().makeBuffer();
					buf_2624.start(_M_STRING);
					buf_2624.literal(125);
					buf_2624.end();
					term_3182 = buf_2624.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3182);
				sink.start(_M__sTextChars);
				sink.copy(sub_621.ref());
				sink.end();
				Term term_2224;
				{
					BufferSink buf_2834 = sink.context().makeBuffer();
					buf_2834.start(_M_STRING);
					buf_2834.literal(1);
					buf_2834.end();
					term_2224 = buf_2834.term();
				}
				sink.propertyNamed("$LineLocation", term_2224);
				Term term_2852;
				{
					BufferSink buf_2854 = sink.context().makeBuffer();
					buf_2854.start(_M_STRING);
					buf_2854.literal(126);
					buf_2854.end();
					term_2852 = buf_2854.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2852);
				sink.start(_M__sTextCons);
				Term term_2645;
				{
					BufferSink buf_2532 = sink.context().makeBuffer();
					buf_2532.start(_M_STRING);
					buf_2532.literal(1);
					buf_2532.end();
					term_2645 = buf_2532.term();
				}
				sink.propertyNamed("$LineLocation", term_2645);
				Term term_2818;
				{
					BufferSink buf_2129 = sink.context().makeBuffer();
					buf_2129.start(_M_STRING);
					buf_2129.literal(126);
					buf_2129.end();
					term_2818 = buf_2129.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2818);
				sink.start(_M__sTextChars);
				sink.literal(".class, \"");
				sink.end();
				Term term_2667;
				{
					BufferSink buf_2883 = sink.context().makeBuffer();
					buf_2883.start(_M_STRING);
					buf_2883.literal(1);
					buf_2883.end();
					term_2667 = buf_2883.term();
				}
				sink.propertyNamed("$LineLocation", term_2667);
				Term term_3084;
				{
					BufferSink buf_2688 = sink.context().makeBuffer();
					buf_2688.start(_M_STRING);
					buf_2688.literal(134);
					buf_2688.end();
					term_3084 = buf_2688.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3084);
				sink.start(_M__sTextCons);
				Term term_2502;
				{
					BufferSink buf_2342 = sink.context().makeBuffer();
					buf_2342.start(_M_STRING);
					buf_2342.literal(1);
					buf_2342.end();
					term_2502 = buf_2342.term();
				}
				sink.propertyNamed("$LineLocation", term_2502);
				Term term_2780;
				{
					BufferSink buf_2445 = sink.context().makeBuffer();
					buf_2445.start(_M_STRING);
					buf_2445.literal(134);
					buf_2445.end();
					term_2780 = buf_2445.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2780);
				sink.start(_M__sTextEmbed);
				Term term_2698;
				{
					BufferSink buf_2076 = sink.context().makeBuffer();
					buf_2076.start(_M_STRING);
					buf_2076.literal(1);
					buf_2076.end();
					term_2698 = buf_2076.term();
				}
				sink.propertyNamed("$LineLocation", term_2698);
				Term term_3705;
				{
					BufferSink buf_2411 = sink.context().makeBuffer();
					buf_2411.start(_M_STRING);
					buf_2411.literal(134);
					buf_2411.end();
					term_3705 = buf_2411.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3705);
				sink.start(_M_AsText);
				sink.start(_M_ToJavaId);
				sink.copy(sub_1117.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_3077;
				{
					BufferSink buf_2836 = sink.context().makeBuffer();
					buf_2836.start(_M_STRING);
					buf_2836.literal(1);
					buf_2836.end();
					term_3077 = buf_2836.term();
				}
				sink.propertyNamed("$LineLocation", term_3077);
				Term term_3321;
				{
					BufferSink buf_2475 = sink.context().makeBuffer();
					buf_2475.start(_M_STRING);
					buf_2475.literal(143);
					buf_2475.end();
					term_3321 = buf_2475.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3321);
				sink.start(_M__sTextCons);
				Term term_2649;
				{
					BufferSink buf_2549 = sink.context().makeBuffer();
					buf_2549.start(_M_STRING);
					buf_2549.literal(1);
					buf_2549.end();
					term_2649 = buf_2549.term();
				}
				sink.propertyNamed("$LineLocation", term_2649);
				Term term_2674;
				{
					BufferSink buf_2276 = sink.context().makeBuffer();
					buf_2276.start(_M_STRING);
					buf_2276.literal(143);
					buf_2276.end();
					term_2674 = buf_2276.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2674);
				sink.start(_M__sTextChars);
				sink.literal("\");");
				sink.end();
				Term term_3165;
				{
					BufferSink buf_2685 = sink.context().makeBuffer();
					buf_2685.start(_M_STRING);
					buf_2685.literal(1);
					buf_2685.end();
					term_3165 = buf_2685.term();
				}
				sink.propertyNamed("$LineLocation", term_3165);
				Term term_2293;
				{
					BufferSink buf_2472 = sink.context().makeBuffer();
					buf_2472.start(_M_STRING);
					buf_2472.literal(167);
					buf_2472.end();
					term_2293 = buf_2472.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2293);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_237 :
			{
				if (term_2611.descriptor() != _M_Crsx_xdeclaration_xA5)
				{
					break label_237;
				}
				Term sub_1247 = term_2611.sub(0).ref();
				if (sub_1247.descriptor() != _M_Crsx_xdirective_xA1)
				{
					break label_237;
				}
				Term sub_865 = sub_1247.sub(0).ref();
				/* #constructor=sub */Term sub_798 = sub_1247.sub(1).ref();
				if (sub_798.descriptor() != _M__sNil)
				{
					break label_237;
				}/*Contract*/
				sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
			label_15 :
			{
				if (term_2611.descriptor() != _M_Crsx_xdeclaration_xA5)
				{
					break label_15;
				}
				Term sub_380 = term_2611.sub(0).ref();
				if (sub_380.descriptor() != _M_Crsx_xdirective_xA1)
				{
					break label_15;
				}
				Term sub_930 = sub_380.sub(0).ref();
				/* #constructor=sub */Term sub_461 = sub_380.sub(1).ref();
				if (sub_461.descriptor() != _M__sCons)
				{
					break label_15;
				}
				Term sub_730 = sub_461.sub(0).ref();
				if (sub_730.descriptor() != _M_Crsx_xdirectiveArguments)
				{
					break label_15;
				}
				Term sub_1072 = sub_730.sub(0).ref();
				Term sub_1079 = sub_730.sub(1).ref();
				if (sub_1079.descriptor() != _M__sCons)
				{
					break label_15;
				}
				Term sub_669 = sub_1079.sub(0).ref();
				if (sub_669.descriptor() != _M_Crsx_xdirectives)
				{
					break label_15;
				}
				Term sub_332 = sub_669.sub(0).ref();
				if (sub_332.descriptor() != _M_Crsx_xdirective_xA2)
				{
					break label_15;
				}
				Term sub_694 = sub_332.sub(0).ref();
				if (sub_694.descriptor() != _M_Crsx_xdirectiveList)
				{
					break label_15;
				}
				Term sub_656 = sub_694.sub(0).ref();
				Term sub_754 = sub_694.sub(1).ref();
				if (sub_754.descriptor() != _M__sNil)
				{
					break label_15;
				}
				Term sub_1168 = sub_694.sub(2).ref();
				Term sub_650 = sub_669.sub(1).ref();
				if (sub_650.descriptor() != _M__sNil)
				{
					break label_15;
				}
				Term sub_401 = sub_1079.sub(1).ref();
				if (sub_401.descriptor() != _M__sNil)
				{
					break label_15;
				}
				Term sub_713 = sub_730.sub(2).ref();
				Term sub_726 = sub_461.sub(1).ref();
				if (sub_726.descriptor() != _M__sNil)
				{
					break label_15;
				}/*Contract*/
				sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
			label_80 :
			{
				if (term_2611.descriptor() != _M_Crsx_xdeclaration_xA5)
				{
					break label_80;
				}
				Term sub_804 = term_2611.sub(0).ref();
				if (sub_804.descriptor() != _M_Crsx_xdirective_xA1)
				{
					break label_80;
				}
				Term sub_719 = sub_804.sub(0).ref();
				/* #constructor=sub */Term sub_936 = sub_804.sub(1).ref();
				if (sub_936.descriptor() != _M__sCons)
				{
					break label_80;
				}
				Term sub_732 = sub_936.sub(0).ref();
				if (sub_732.descriptor() != _M_Crsx_xdirectiveArguments)
				{
					break label_80;
				}
				Term sub_766 = sub_732.sub(0).ref();
				Term sub_389 = sub_732.sub(1).ref();
				if (sub_389.descriptor() != _M__sCons)
				{
					break label_80;
				}
				Term sub_505 = sub_389.sub(0).ref();
				if (sub_505.descriptor() != _M_Crsx_xdirectives)
				{
					break label_80;
				}
				Term sub_366 = sub_505.sub(0).ref();
				if (sub_366.descriptor() != _M_Crsx_xdirective_xA2)
				{
					break label_80;
				}
				Term sub_471 = sub_366.sub(0).ref();
				if (sub_471.descriptor() != _M_Crsx_xdirectiveList)
				{
					break label_80;
				}
				Term sub_687 = sub_471.sub(0).ref();
				Term sub_1173 = sub_471.sub(1).ref();
				if (sub_1173.descriptor() != _M__sCons)
				{
					break label_80;
				}
				Term sub_699 = sub_1173.sub(0).ref();
				/* #declarations=sub */Term sub_722 = sub_1173.sub(1).ref();
				if (sub_722.descriptor() != _M__sNil)
				{
					break label_80;
				}
				Term sub_861 = sub_471.sub(2).ref();
				Term sub_640 = sub_505.sub(1).ref();
				if (sub_640.descriptor() != _M__sNil)
				{
					break label_80;
				}
				Term sub_773 = sub_389.sub(1).ref();
				if (sub_773.descriptor() != _M__sNil)
				{
					break label_80;
				}
				Term sub_790 = sub_732.sub(2).ref();
				Term sub_782 = sub_936.sub(1).ref();
				if (sub_782.descriptor() != _M__sNil)
				{
					break label_80;
				}/*Contract*/
				sink.properties(safeRef(props_49));
				sink.start(_M_Declarations);
				sink.start(_M_DesugarDeclarations);
				sink.copy(sub_699.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Declaration, props_49, term_2611);
	}

	final public static boolean _M_Declarations(Sink sink, int shared, int depth, Properties props_253, Term term_2447)
	{
		if (depth < 2000)
		{
			label_147 :
			{
				if (term_2447.descriptor() != _M__sNil)
				{
					break label_147;
				}/*Contract*/
				sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
			label_254 :
			{
				if (term_2447.descriptor() != _M__sCons)
				{
					break label_254;
				}
				Term sub_969 = term_2447.sub(0).ref();
				if (sub_969.descriptor() != _M_Crsx_xdeclarations_xS1)
				{
					break label_254;
				}
				Term sub_605 = sub_969.sub(0).ref();
				Term sub_720 = sub_969.sub(1).ref();
				if (sub_720.descriptor() != _M__sNil)
				{
					break label_254;
				}
				Term sub_611 = term_2447.sub(1).ref();
				if (sub_611.descriptor() != _M__sNil)
				{
					break label_254;
				}/*Contract*/
				sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
			label_155 :
			{
				if (term_2447.descriptor() != _M__sCons)
				{
					break label_155;
				}
				Term sub_633 = term_2447.sub(0).ref();
				if (sub_633.descriptor() != _M_Crsx_xdeclarations_xS1)
				{
					break label_155;
				}
				Term sub_657 = sub_633.sub(0).ref();
				Term sub_897 = sub_633.sub(1).ref();
				if (sub_897.descriptor() != _M__sCons)
				{
					break label_155;
				}
				Term sub_747 = sub_897.sub(0).ref();
				/* #declaration=sub */Term sub_686 = sub_897.sub(1).ref();
				if (sub_686.descriptor() != _M__sNil)
				{
					break label_155;
				}
				Term sub_680 = term_2447.sub(1).ref();
				/* #declarations_S1*=sub *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextEmbed);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_253));
				sink.start(_M_Declaration);
				sink.copy(sub_747.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_2599;
				{
					BufferSink buf_2644 = sink.context().makeBuffer();
					buf_2644.start(_M_STRING);
					buf_2644.literal(1);
					buf_2644.end();
					term_2599 = buf_2644.term();
				}
				sink.propertyNamed("$LineLocation", term_2599);
				Term term_2940;
				{
					BufferSink buf_1588 = sink.context().makeBuffer();
					buf_1588.start(_M_STRING);
					buf_1588.literal(1);
					buf_1588.end();
					term_2940 = buf_1588.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2940);
				sink.start(_M__sTextCons);
				Term term_2497;
				{
					BufferSink buf_3130 = sink.context().makeBuffer();
					buf_3130.start(_M_STRING);
					buf_3130.literal(1);
					buf_3130.end();
					term_2497 = buf_3130.term();
				}
				sink.propertyNamed("$LineLocation", term_2497);
				Term term_1835;
				{
					BufferSink buf_3422 = sink.context().makeBuffer();
					buf_3422.start(_M_STRING);
					buf_3422.literal(1);
					buf_3422.end();
					term_1835 = buf_3422.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1835);
				sink.start(_M__sTextEmbed);
				Term term_2795;
				{
					BufferSink buf_3172 = sink.context().makeBuffer();
					buf_3172.start(_M_STRING);
					buf_3172.literal(1);
					buf_3172.end();
					term_2795 = buf_3172.term();
				}
				sink.propertyNamed("$LineLocation", term_2795);
				Term term_3201;
				{
					BufferSink buf_2109 = sink.context().makeBuffer();
					buf_2109.start(_M_STRING);
					buf_2109.literal(1);
					buf_2109.end();
					term_3201 = buf_2109.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3201);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_253));
				sink.start(_M_Declarations);
				sink.copy(sub_680.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_3243;
				{
					BufferSink buf_2437 = sink.context().makeBuffer();
					buf_2437.start(_M_STRING);
					buf_2437.literal(1);
					buf_2437.end();
					term_3243 = buf_2437.term();
				}
				sink.propertyNamed("$LineLocation", term_3243);
				Term term_2517;
				{
					BufferSink buf_2382 = sink.context().makeBuffer();
					buf_2382.start(_M_STRING);
					buf_2382.literal(32);
					buf_2382.end();
					term_2517 = buf_2382.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2517);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Declarations, props_253, term_2447);
	}

	final public static boolean _M_JavaImport(Sink sink, int shared, int depth, Properties props_8, Term term_3102)
	{
		if (depth < 2000)
		{
			label_7 :
			{
				if (term_3102.descriptor() != _M__sNil)
				{
					break label_7;
				}/*Contract*/
				sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
			label_298 :
			{
				if (term_3102.descriptor() != _M__sCons)
				{
					break label_298;
				}
				Term sub_729 = term_3102.sub(0).ref();
				if (sub_729.descriptor() != _M_Crsx_xdeclarations_xS1)
				{
					break label_298;
				}
				Term sub_404 = sub_729.sub(0).ref();
				Term sub_547 = sub_729.sub(1).ref();
				if (sub_547.descriptor() != _M__sNil)
				{
					break label_298;
				}
				Term sub_582 = term_3102.sub(1).ref();
				if (sub_582.descriptor() != _M__sNil)
				{
					break label_298;
				}/*Contract*/
				sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
			label_230 :
			{
				if (term_3102.descriptor() != _M__sCons)
				{
					break label_230;
				}
				Term sub_1038 = term_3102.sub(0).ref();
				if (sub_1038.descriptor() != _M_Crsx_xdeclarations_xS1)
				{
					break label_230;
				}
				Term sub_1278 = sub_1038.sub(0).ref();
				Term sub_477 = sub_1038.sub(1).ref();
				if (sub_477.descriptor() != _M__sCons)
				{
					break label_230;
				}
				Term sub_630 = sub_477.sub(0).ref();
				if (sub_630.descriptor() != _M_Crsx_xdeclaration_xA1)
				{
					break label_230;
				}
				Term sub_434 = sub_630.sub(0).ref();
				if (sub_434.descriptor() != _M_Crsx_xmoduleDeclaration)
				{
					break label_230;
				}
				Term sub_1327 = sub_434.sub(0).ref();
				Term sub_915 = sub_434.sub(1).ref();
				/* #CONSTRUCTOR=sub */Term sub_994 = sub_434.sub(2).ref();
				Term sub_1002 = sub_434.sub(3).ref();
				/* #declarations=sub */Term sub_929 = sub_434.sub(4).ref();
				Term sub_619 = sub_477.sub(1).ref();
				if (sub_619.descriptor() != _M__sNil)
				{
					break label_230;
				}
				Term sub_1067 = term_3102.sub(1).ref();
				/* #declarations_S1*=sub *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextEmbed);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_8));
				sink.start(_M_JavaImport);
				sink.start(_M_DesugarDeclarations);
				sink.copy(sub_1002.ref());
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				Term term_2717;
				{
					BufferSink buf_3122 = sink.context().makeBuffer();
					buf_3122.start(_M_STRING);
					buf_3122.literal(1);
					buf_3122.end();
					term_2717 = buf_3122.term();
				}
				sink.propertyNamed("$LineLocation", term_2717);
				Term term_2563;
				{
					BufferSink buf_3131 = sink.context().makeBuffer();
					buf_3131.start(_M_STRING);
					buf_3131.literal(1);
					buf_3131.end();
					term_2563 = buf_3131.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2563);
				sink.start(_M__sTextCons);
				Term term_2445;
				{
					BufferSink buf_2704 = sink.context().makeBuffer();
					buf_2704.start(_M_STRING);
					buf_2704.literal(1);
					buf_2704.end();
					term_2445 = buf_2704.term();
				}
				sink.propertyNamed("$LineLocation", term_2445);
				Term term_3049;
				{
					BufferSink buf_2169 = sink.context().makeBuffer();
					buf_2169.start(_M_STRING);
					buf_2169.literal(1);
					buf_2169.end();
					term_3049 = buf_2169.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3049);
				sink.start(_M__sTextEmbed);
				Term term_3019;
				{
					BufferSink buf_2191 = sink.context().makeBuffer();
					buf_2191.start(_M_STRING);
					buf_2191.literal(1);
					buf_2191.end();
					term_3019 = buf_2191.term();
				}
				sink.propertyNamed("$LineLocation", term_3019);
				Term term_3316;
				{
					BufferSink buf_2985 = sink.context().makeBuffer();
					buf_2985.start(_M_STRING);
					buf_2985.literal(1);
					buf_2985.end();
					term_3316 = buf_2985.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3316);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_8));
				sink.start(_M_JavaImport);
				sink.copy(sub_1067.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_3142;
				{
					BufferSink buf_2525 = sink.context().makeBuffer();
					buf_2525.start(_M_STRING);
					buf_2525.literal(1);
					buf_2525.end();
					term_3142 = buf_2525.term();
				}
				sink.propertyNamed("$LineLocation", term_3142);
				Term term_2743;
				{
					BufferSink buf_2598 = sink.context().makeBuffer();
					buf_2598.start(_M_STRING);
					buf_2598.literal(53);
					buf_2598.end();
					term_2743 = buf_2598.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2743);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_464 :
			{
				if (term_3102.descriptor() != _M__sCons)
				{
					break label_464;
				}
				Term sub_677 = term_3102.sub(0).ref();
				if (sub_677.descriptor() != _M_Crsx_xdeclarations_xS1)
				{
					break label_464;
				}
				Term sub_1158 = sub_677.sub(0).ref();
				Term sub_561 = sub_677.sub(1).ref();
				if (sub_561.descriptor() != _M__sCons)
				{
					break label_464;
				}
				Term sub_635 = sub_561.sub(0).ref();
				if (sub_635.descriptor() != _M_Crsx_xdeclaration_xA2)
				{
					break label_464;
				}
				Term sub_1054 = sub_635.sub(0).ref();
				if (sub_1054.descriptor() != _M_Crsx_ximportDeclaration_xA2)
				{
					break label_464;
				}
				Term sub_609 = sub_1054.sub(0).ref();
				Term sub_465 = sub_1054.sub(1).ref();
				Term sub_660 = sub_1054.sub(2).ref();
				/* #constructor=sub */Term sub_851 = sub_561.sub(1).ref();
				if (sub_851.descriptor() != _M__sNil)
				{
					break label_464;
				}
				Term sub_812 = term_3102.sub(1).ref();
				/* #declarations_S1*=sub *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2482;
				{
					BufferSink buf_2331 = sink.context().makeBuffer();
					buf_2331.start(_M_STRING);
					buf_2331.literal(1);
					buf_2331.end();
					term_2482 = buf_2331.term();
				}
				sink.propertyNamed("$LineLocation", term_2482);
				Term term_3017;
				{
					BufferSink buf_3284 = sink.context().makeBuffer();
					buf_3284.start(_M_STRING);
					buf_3284.literal(1);
					buf_3284.end();
					term_3017 = buf_3284.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3017);
				sink.start(_M__sTextCons);
				Term term_3108;
				{
					BufferSink buf_2205 = sink.context().makeBuffer();
					buf_2205.start(_M_STRING);
					buf_2205.literal(1);
					buf_2205.end();
					term_3108 = buf_2205.term();
				}
				sink.propertyNamed("$LineLocation", term_3108);
				Term term_2659;
				{
					BufferSink buf_2340 = sink.context().makeBuffer();
					buf_2340.start(_M_STRING);
					buf_2340.literal(1);
					buf_2340.end();
					term_2659 = buf_2340.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2659);
				sink.start(_M__sTextChars);
				sink.literal("import static ");
				sink.end();
				Term term_3405;
				{
					BufferSink buf_2580 = sink.context().makeBuffer();
					buf_2580.start(_M_STRING);
					buf_2580.literal(2);
					buf_2580.end();
					term_3405 = buf_2580.term();
				}
				sink.propertyNamed("$LineLocation", term_3405);
				Term term_2206;
				{
					BufferSink buf_1784 = sink.context().makeBuffer();
					buf_1784.start(_M_STRING);
					buf_1784.literal(1);
					buf_1784.end();
					term_2206 = buf_1784.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2206);
				sink.start(_M__sTextCons);
				Term term_2655;
				{
					BufferSink buf_2571 = sink.context().makeBuffer();
					buf_2571.start(_M_STRING);
					buf_2571.literal(2);
					buf_2571.end();
					term_2655 = buf_2571.term();
				}
				sink.propertyNamed("$LineLocation", term_2655);
				Term term_4163;
				{
					BufferSink buf_2196 = sink.context().makeBuffer();
					buf_2196.start(_M_STRING);
					buf_2196.literal(1);
					buf_2196.end();
					term_4163 = buf_2196.term();
				}
				sink.propertyNamed("$ColumnLocation", term_4163);
				sink.start(_M__sTextEmbed);
				Term term_3259;
				{
					BufferSink buf_2204 = sink.context().makeBuffer();
					buf_2204.start(_M_STRING);
					buf_2204.literal(2);
					buf_2204.end();
					term_3259 = buf_2204.term();
				}
				sink.propertyNamed("$LineLocation", term_3259);
				Term term_1928;
				{
					BufferSink buf_2323 = sink.context().makeBuffer();
					buf_2323.start(_M_STRING);
					buf_2323.literal(1);
					buf_2323.end();
					term_1928 = buf_2323.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1928);
				sink.start(_M_AsText);
				sink.start(_M_PathToImport);
				sink.copy(sub_660.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_3156;
				{
					BufferSink buf_2144 = sink.context().makeBuffer();
					buf_2144.start(_M_STRING);
					buf_2144.literal(2);
					buf_2144.end();
					term_3156 = buf_2144.term();
				}
				sink.propertyNamed("$LineLocation", term_3156);
				Term term_2705;
				{
					BufferSink buf_2759 = sink.context().makeBuffer();
					buf_2759.start(_M_STRING);
					buf_2759.literal(15);
					buf_2759.end();
					term_2705 = buf_2759.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2705);
				sink.start(_M__sTextCons);
				Term term_2464;
				{
					BufferSink buf_2868 = sink.context().makeBuffer();
					buf_2868.start(_M_STRING);
					buf_2868.literal(2);
					buf_2868.end();
					term_2464 = buf_2868.term();
				}
				sink.propertyNamed("$LineLocation", term_2464);
				Term term_3214;
				{
					BufferSink buf_2910 = sink.context().makeBuffer();
					buf_2910.start(_M_STRING);
					buf_2910.literal(15);
					buf_2910.end();
					term_3214 = buf_2910.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3214);
				sink.start(_M__sTextChars);
				sink.literal(".*;");
				sink.end();
				Term term_3419;
				{
					BufferSink buf_2224 = sink.context().makeBuffer();
					buf_2224.start(_M_STRING);
					buf_2224.literal(2);
					buf_2224.end();
					term_3419 = buf_2224.term();
				}
				sink.propertyNamed("$LineLocation", term_3419);
				Term term_2704;
				{
					BufferSink buf_2363 = sink.context().makeBuffer();
					buf_2363.start(_M_STRING);
					buf_2363.literal(43);
					buf_2363.end();
					term_2704 = buf_2363.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2704);
				sink.start(_M__sTextCons);
				Term term_2982;
				{
					BufferSink buf_2795 = sink.context().makeBuffer();
					buf_2795.start(_M_STRING);
					buf_2795.literal(2);
					buf_2795.end();
					term_2982 = buf_2795.term();
				}
				sink.propertyNamed("$LineLocation", term_2982);
				Term term_2384;
				{
					BufferSink buf_2013 = sink.context().makeBuffer();
					buf_2013.start(_M_STRING);
					buf_2013.literal(43);
					buf_2013.end();
					term_2384 = buf_2013.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2384);
				sink.start(_M__sTextEmbed);
				Term term_2327;
				{
					BufferSink buf_3069 = sink.context().makeBuffer();
					buf_3069.start(_M_STRING);
					buf_3069.literal(2);
					buf_3069.end();
					term_2327 = buf_3069.term();
				}
				sink.propertyNamed("$LineLocation", term_2327);
				Term term_2531;
				{
					BufferSink buf_2402 = sink.context().makeBuffer();
					buf_2402.start(_M_STRING);
					buf_2402.literal(43);
					buf_2402.end();
					term_2531 = buf_2402.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2531);
				sink.start(_M_AsText);
				sink.properties(safeRef(props_8));
				sink.start(_M_JavaImport);
				sink.copy(sub_812.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_3010;
				{
					BufferSink buf_1821 = sink.context().makeBuffer();
					buf_1821.start(_M_STRING);
					buf_1821.literal(2);
					buf_1821.end();
					term_3010 = buf_1821.term();
				}
				sink.propertyNamed("$LineLocation", term_3010);
				Term term_2513;
				{
					BufferSink buf_1928 = sink.context().makeBuffer();
					buf_1928.start(_M_STRING);
					buf_1928.literal(46);
					buf_1928.end();
					term_2513 = buf_1928.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2513);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_780 :
			{
				if (term_3102.descriptor() != _M__sCons)
				{
					break label_780;
				}
				Term sub_939 = term_3102.sub(0).ref();
				if (sub_939.descriptor() != _M_Crsx_xdeclarations_xS1)
				{
					break label_780;
				}
				Term sub_968 = sub_939.sub(0).ref();
				Term sub_503 = sub_939.sub(1).ref();
				if (sub_503.descriptor() != _M__sCons)
				{
					break label_780;
				}
				Term sub_835 = sub_503.sub(0).ref();
				if (sub_835.descriptor() != _M_Crsx_xdeclaration_xA2)
				{
					break label_780;
				}
				Term sub_670 = sub_835.sub(0).ref();
				if (sub_670.descriptor() != _M_Crsx_ximportDeclaration_xA3)
				{
					break label_780;
				}
				Term sub_759 = sub_670.sub(0).ref();
				Term sub_763 = sub_670.sub(1).ref();
				Term sub_727 = sub_670.sub(2).ref();
				/* #constructor=sub */Term sub_541 = sub_503.sub(1).ref();
				if (sub_541.descriptor() != _M__sNil)
				{
					break label_780;
				}
				Term sub_743 = term_3102.sub(1).ref();
				/* #declarations_S1*=sub *//*Contract*/sink.properties(safeRef(props_8));
				sink.start(_M_JavaImport);
				sink.copy(sub_743.ref());
				sink.end();
				return true;
			}
			label_499 :
			{
				if (term_3102.descriptor() != _M__sCons)
				{
					break label_499;
				}
				Term sub_725 = term_3102.sub(0).ref();
				if (sub_725.descriptor() != _M_Crsx_xdeclarations_xS1)
				{
					break label_499;
				}
				Term sub_749 = sub_725.sub(0).ref();
				Term sub_807 = sub_725.sub(1).ref();
				if (sub_807.descriptor() != _M__sCons)
				{
					break label_499;
				}
				Term sub_1286 = sub_807.sub(0).ref();
				if (sub_1286.descriptor() != _M_Crsx_xdeclaration_xA3)
				{
					break label_499;
				}
				Term sub_672 = sub_1286.sub(0).ref();
				/* #ruleDeclaration=sub */Term sub_668 = sub_807.sub(1).ref();
				if (sub_668.descriptor() != _M__sNil)
				{
					break label_499;
				}
				Term sub_760 = term_3102.sub(1).ref();
				/* #declarations_S1*=sub *//*Contract*/sink.properties(safeRef(props_8));
				sink.start(_M_JavaImport);
				sink.copy(sub_760.ref());
				sink.end();
				return true;
			}
			label_13 :
			{
				if (term_3102.descriptor() != _M__sCons)
				{
					break label_13;
				}
				Term sub_786 = term_3102.sub(0).ref();
				if (sub_786.descriptor() != _M_Crsx_xdeclarations_xS1)
				{
					break label_13;
				}
				Term sub_709 = sub_786.sub(0).ref();
				Term sub_895 = sub_786.sub(1).ref();
				if (sub_895.descriptor() != _M__sCons)
				{
					break label_13;
				}
				Term sub_685 = sub_895.sub(0).ref();
				if (sub_685.descriptor() != _M_Crsx_xdeclaration_xA4)
				{
					break label_13;
				}
				Term sub_491 = sub_685.sub(0).ref();
				/* #sortDeclaration=sub */Term sub_1294 = sub_895.sub(1).ref();
				if (sub_1294.descriptor() != _M__sNil)
				{
					break label_13;
				}
				Term sub_830 = term_3102.sub(1).ref();
				/* #declarations_S1*=sub *//*Contract*/sink.properties(safeRef(props_8));
				sink.start(_M_JavaImport);
				sink.copy(sub_830.ref());
				sink.end();
				return true;
			}
			label_139 :
			{
				if (term_3102.descriptor() != _M__sCons)
				{
					break label_139;
				}
				Term sub_816 = term_3102.sub(0).ref();
				if (sub_816.descriptor() != _M_Crsx_xdeclarations_xS1)
				{
					break label_139;
				}
				Term sub_580 = sub_816.sub(0).ref();
				Term sub_875 = sub_816.sub(1).ref();
				if (sub_875.descriptor() != _M__sCons)
				{
					break label_139;
				}
				Term sub_526 = sub_875.sub(0).ref();
				if (sub_526.descriptor() != _M_Crsx_xdeclaration_xA5)
				{
					break label_139;
				}
				Term sub_655 = sub_526.sub(0).ref();
				/* #directive=sub */Term sub_586 = sub_875.sub(1).ref();
				if (sub_586.descriptor() != _M__sNil)
				{
					break label_139;
				}
				Term sub_642 = term_3102.sub(1).ref();
				/* #declarations_S1*=sub *//*Contract*/sink.properties(safeRef(props_8));
				sink.start(_M_JavaImport);
				sink.copy(sub_642.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_JavaImport, props_8, term_3102);
	}

	final public static boolean _M_JavaFooter(Sink sink, int shared, int depth, Term term_2985)
	{
		if (depth < 2000)
		{
			label_348 :
			{
				if (term_2985.descriptor() != _M_MAINMODULE)
				{
					break label_348;
				}/*Contract*/
				sink.start(_M__sTextNil);
				sink.end();
				return true;
			}
			label_419 :
			{
				if (term_2985.descriptor() != _M_SUBMODULE)
				{
					break label_419;
				}/*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextChars);
				sink.literal("}");
				sink.end();
				Term term_3351;
				{
					BufferSink buf_2632 = sink.context().makeBuffer();
					buf_2632.start(_M_STRING);
					buf_2632.literal(1);
					buf_2632.end();
					term_3351 = buf_2632.term();
				}
				sink.propertyNamed("$LineLocation", term_3351);
				Term term_2292;
				{
					BufferSink buf_2289 = sink.context().makeBuffer();
					buf_2289.start(_M_STRING);
					buf_2289.literal(1);
					buf_2289.end();
					term_2292 = buf_2289.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2292);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_JavaFooter, term_2985);
	}

	final public static boolean _M_JavaHeader(Sink sink, int shared, int depth, Term term_3466, Term term_2488)
	{
		if (depth < 2000)
		{
			label_106 :
			{
				if (term_3466.descriptor() != _M_MAINMODULE)
				{
					break label_106;
				}
				/* #declarations=term *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextChars);
				sink.literal("/** Generated File */");
				sink.end();
				Term term_3239;
				{
					BufferSink buf_2149 = sink.context().makeBuffer();
					buf_2149.start(_M_STRING);
					buf_2149.literal(1);
					buf_2149.end();
					term_3239 = buf_2149.term();
				}
				sink.propertyNamed("$LineLocation", term_3239);
				Term term_3429;
				{
					BufferSink buf_2341 = sink.context().makeBuffer();
					buf_2341.start(_M_STRING);
					buf_2341.literal(1);
					buf_2341.end();
					term_3429 = buf_2341.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3429);
				sink.start(_M__sTextCons);
				Term term_3011;
				{
					BufferSink buf_2210 = sink.context().makeBuffer();
					buf_2210.start(_M_STRING);
					buf_2210.literal(1);
					buf_2210.end();
					term_3011 = buf_2210.term();
				}
				sink.propertyNamed("$LineLocation", term_3011);
				Term term_2470;
				{
					BufferSink buf_3006 = sink.context().makeBuffer();
					buf_3006.start(_M_STRING);
					buf_3006.literal(1);
					buf_3006.end();
					term_2470 = buf_3006.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2470);
				sink.start(_M__sTextEmbed);
				Term term_3305;
				{
					BufferSink buf_2117 = sink.context().makeBuffer();
					buf_2117.start(_M_STRING);
					buf_2117.literal(1);
					buf_2117.end();
					term_3305 = buf_2117.term();
				}
				sink.propertyNamed("$LineLocation", term_3305);
				Term term_3174;
				{
					BufferSink buf_3178 = sink.context().makeBuffer();
					buf_3178.start(_M_STRING);
					buf_3178.literal(1);
					buf_3178.end();
					term_3174 = buf_3178.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3174);
				sink.start(_M_AsText);
				sink.start(_M_PackageDeclaration);
				sink.end();
				sink.end();
				sink.end();
				Term term_1889;
				{
					BufferSink buf_2081 = sink.context().makeBuffer();
					buf_2081.start(_M_STRING);
					buf_2081.literal(1);
					buf_2081.end();
					term_1889 = buf_2081.term();
				}
				sink.propertyNamed("$LineLocation", term_1889);
				Term term_2877;
				{
					BufferSink buf_2478 = sink.context().makeBuffer();
					buf_2478.start(_M_STRING);
					buf_2478.literal(22);
					buf_2478.end();
					term_2877 = buf_2478.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2877);
				sink.start(_M__sTextCons);
				Term term_2807;
				{
					BufferSink buf_2926 = sink.context().makeBuffer();
					buf_2926.start(_M_STRING);
					buf_2926.literal(1);
					buf_2926.end();
					term_2807 = buf_2926.term();
				}
				sink.propertyNamed("$LineLocation", term_2807);
				Term term_3101;
				{
					BufferSink buf_2729 = sink.context().makeBuffer();
					buf_2729.start(_M_STRING);
					buf_2729.literal(22);
					buf_2729.end();
					term_3101 = buf_2729.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3101);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_3014;
				{
					BufferSink buf_2731 = sink.context().makeBuffer();
					buf_2731.start(_M_STRING);
					buf_2731.literal(1);
					buf_2731.end();
					term_3014 = buf_2731.term();
				}
				sink.propertyNamed("$LineLocation", term_3014);
				Term term_3765;
				{
					BufferSink buf_3003 = sink.context().makeBuffer();
					buf_3003.start(_M_STRING);
					buf_3003.literal(42);
					buf_3003.end();
					term_3765 = buf_3003.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3765);
				sink.start(_M__sTextCons);
				Term term_3114;
				{
					BufferSink buf_2597 = sink.context().makeBuffer();
					buf_2597.start(_M_STRING);
					buf_2597.literal(1);
					buf_2597.end();
					term_3114 = buf_2597.term();
				}
				sink.propertyNamed("$LineLocation", term_3114);
				Term term_1730;
				{
					BufferSink buf_1877 = sink.context().makeBuffer();
					buf_1877.start(_M_STRING);
					buf_1877.literal(42);
					buf_1877.end();
					term_1730 = buf_1877.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1730);
				sink.start(_M__sTextChars);
				sink.literal("import static org.crsx.runtime.ConstructionDescriptor.makeData;");
				sink.end();
				Term term_2509;
				{
					BufferSink buf_3140 = sink.context().makeBuffer();
					buf_3140.start(_M_STRING);
					buf_3140.literal(2);
					buf_3140.end();
					term_2509 = buf_3140.term();
				}
				sink.propertyNamed("$LineLocation", term_2509);
				Term term_2813;
				{
					BufferSink buf_2691 = sink.context().makeBuffer();
					buf_2691.start(_M_STRING);
					buf_2691.literal(1);
					buf_2691.end();
					term_2813 = buf_2691.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2813);
				sink.start(_M__sTextCons);
				Term term_2722;
				{
					BufferSink buf_3273 = sink.context().makeBuffer();
					buf_3273.start(_M_STRING);
					buf_3273.literal(2);
					buf_3273.end();
					term_2722 = buf_3273.term();
				}
				sink.propertyNamed("$LineLocation", term_2722);
				Term term_3341;
				{
					BufferSink buf_3127 = sink.context().makeBuffer();
					buf_3127.start(_M_STRING);
					buf_3127.literal(1);
					buf_3127.end();
					term_3341 = buf_3127.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3341);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_3193;
				{
					BufferSink buf_2940 = sink.context().makeBuffer();
					buf_2940.start(_M_STRING);
					buf_2940.literal(2);
					buf_2940.end();
					term_3193 = buf_2940.term();
				}
				sink.propertyNamed("$LineLocation", term_3193);
				Term term_2835;
				{
					BufferSink buf_2748 = sink.context().makeBuffer();
					buf_2748.start(_M_STRING);
					buf_2748.literal(64);
					buf_2748.end();
					term_2835 = buf_2748.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2835);
				sink.start(_M__sTextCons);
				Term term_3133;
				{
					BufferSink buf_2603 = sink.context().makeBuffer();
					buf_2603.start(_M_STRING);
					buf_2603.literal(2);
					buf_2603.end();
					term_3133 = buf_2603.term();
				}
				sink.propertyNamed("$LineLocation", term_3133);
				Term term_2514;
				{
					BufferSink buf_2894 = sink.context().makeBuffer();
					buf_2894.start(_M_STRING);
					buf_2894.literal(64);
					buf_2894.end();
					term_2514 = buf_2894.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2514);
				sink.start(_M__sTextChars);
				sink.literal("import static org.crsx.runtime.ConstructionDescriptor.makeFunction;");
				sink.end();
				Term term_3451;
				{
					BufferSink buf_2368 = sink.context().makeBuffer();
					buf_2368.start(_M_STRING);
					buf_2368.literal(3);
					buf_2368.end();
					term_3451 = buf_2368.term();
				}
				sink.propertyNamed("$LineLocation", term_3451);
				Term term_2733;
				{
					BufferSink buf_2292 = sink.context().makeBuffer();
					buf_2292.start(_M_STRING);
					buf_2292.literal(1);
					buf_2292.end();
					term_2733 = buf_2292.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2733);
				sink.start(_M__sTextCons);
				Term term_2711;
				{
					BufferSink buf_3315 = sink.context().makeBuffer();
					buf_3315.start(_M_STRING);
					buf_3315.literal(3);
					buf_3315.end();
					term_2711 = buf_3315.term();
				}
				sink.propertyNamed("$LineLocation", term_2711);
				Term term_2826;
				{
					BufferSink buf_2754 = sink.context().makeBuffer();
					buf_2754.start(_M_STRING);
					buf_2754.literal(1);
					buf_2754.end();
					term_2826 = buf_2754.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2826);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_3086;
				{
					BufferSink buf_2452 = sink.context().makeBuffer();
					buf_2452.start(_M_STRING);
					buf_2452.literal(3);
					buf_2452.end();
					term_3086 = buf_2452.term();
				}
				sink.propertyNamed("$LineLocation", term_3086);
				Term term_2981;
				{
					BufferSink buf_2515 = sink.context().makeBuffer();
					buf_2515.start(_M_STRING);
					buf_2515.literal(68);
					buf_2515.end();
					term_2981 = buf_2515.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2981);
				sink.start(_M__sTextCons);
				Term term_3770;
				{
					BufferSink buf_3017 = sink.context().makeBuffer();
					buf_3017.start(_M_STRING);
					buf_3017.literal(3);
					buf_3017.end();
					term_3770 = buf_3017.term();
				}
				sink.propertyNamed("$LineLocation", term_3770);
				Term term_2097;
				{
					BufferSink buf_2332 = sink.context().makeBuffer();
					buf_2332.start(_M_STRING);
					buf_2332.literal(68);
					buf_2332.end();
					term_2097 = buf_2332.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2097);
				sink.start(_M__sTextChars);
				sink.literal("import static org.crsx.runtime.Normalizer.thunk;");
				sink.end();
				Term term_3035;
				{
					BufferSink buf_2434 = sink.context().makeBuffer();
					buf_2434.start(_M_STRING);
					buf_2434.literal(4);
					buf_2434.end();
					term_3035 = buf_2434.term();
				}
				sink.propertyNamed("$LineLocation", term_3035);
				Term term_2842;
				{
					BufferSink buf_2678 = sink.context().makeBuffer();
					buf_2678.start(_M_STRING);
					buf_2678.literal(1);
					buf_2678.end();
					term_2842 = buf_2678.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2842);
				sink.start(_M__sTextCons);
				Term term_2638;
				{
					BufferSink buf_1980 = sink.context().makeBuffer();
					buf_1980.start(_M_STRING);
					buf_1980.literal(4);
					buf_1980.end();
					term_2638 = buf_1980.term();
				}
				sink.propertyNamed("$LineLocation", term_2638);
				Term term_3340;
				{
					BufferSink buf_2207 = sink.context().makeBuffer();
					buf_2207.start(_M_STRING);
					buf_2207.literal(1);
					buf_2207.end();
					term_3340 = buf_2207.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3340);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2864;
				{
					BufferSink buf_2116 = sink.context().makeBuffer();
					buf_2116.start(_M_STRING);
					buf_2116.literal(4);
					buf_2116.end();
					term_2864 = buf_2116.term();
				}
				sink.propertyNamed("$LineLocation", term_2864);
				Term term_3730;
				{
					BufferSink buf_2774 = sink.context().makeBuffer();
					buf_2774.start(_M_STRING);
					buf_2774.literal(49);
					buf_2774.end();
					term_3730 = buf_2774.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3730);
				sink.start(_M__sTextCons);
				Term term_2551;
				{
					BufferSink buf_2865 = sink.context().makeBuffer();
					buf_2865.start(_M_STRING);
					buf_2865.literal(4);
					buf_2865.end();
					term_2551 = buf_2865.term();
				}
				sink.propertyNamed("$LineLocation", term_2551);
				Term term_2324;
				{
					BufferSink buf_2467 = sink.context().makeBuffer();
					buf_2467.start(_M_STRING);
					buf_2467.literal(49);
					buf_2467.end();
					term_2324 = buf_2467.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2324);
				sink.start(_M__sTextChars);
				sink.literal("import static org.crsx.runtime.Normalizer.force;");
				sink.end();
				Term term_2900;
				{
					BufferSink buf_2422 = sink.context().makeBuffer();
					buf_2422.start(_M_STRING);
					buf_2422.literal(5);
					buf_2422.end();
					term_2900 = buf_2422.term();
				}
				sink.propertyNamed("$LineLocation", term_2900);
				Term term_3223;
				{
					BufferSink buf_2728 = sink.context().makeBuffer();
					buf_2728.start(_M_STRING);
					buf_2728.literal(1);
					buf_2728.end();
					term_3223 = buf_2728.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3223);
				sink.start(_M__sTextCons);
				Term term_2798;
				{
					BufferSink buf_2303 = sink.context().makeBuffer();
					buf_2303.start(_M_STRING);
					buf_2303.literal(5);
					buf_2303.end();
					term_2798 = buf_2303.term();
				}
				sink.propertyNamed("$LineLocation", term_2798);
				Term term_1939;
				{
					BufferSink buf_2234 = sink.context().makeBuffer();
					buf_2234.start(_M_STRING);
					buf_2234.literal(1);
					buf_2234.end();
					term_1939 = buf_2234.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1939);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_3328;
				{
					BufferSink buf_3545 = sink.context().makeBuffer();
					buf_3545.start(_M_STRING);
					buf_3545.literal(5);
					buf_3545.end();
					term_3328 = buf_3545.term();
				}
				sink.propertyNamed("$LineLocation", term_3328);
				Term term_3410;
				{
					BufferSink buf_2329 = sink.context().makeBuffer();
					buf_2329.start(_M_STRING);
					buf_2329.literal(49);
					buf_2329.end();
					term_3410 = buf_2329.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3410);
				sink.start(_M__sTextCons);
				Term term_3602;
				{
					BufferSink buf_2092 = sink.context().makeBuffer();
					buf_2092.start(_M_STRING);
					buf_2092.literal(5);
					buf_2092.end();
					term_3602 = buf_2092.term();
				}
				sink.propertyNamed("$LineLocation", term_3602);
				Term term_2459;
				{
					BufferSink buf_2609 = sink.context().makeBuffer();
					buf_2609.start(_M_STRING);
					buf_2609.literal(49);
					buf_2609.end();
					term_2459 = buf_2609.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2459);
				sink.start(_M__sTextChars);
				sink.literal("import static org.crsx.runtime.Reference.safeRef;");
				sink.end();
				Term term_2713;
				{
					BufferSink buf_2953 = sink.context().makeBuffer();
					buf_2953.start(_M_STRING);
					buf_2953.literal(6);
					buf_2953.end();
					term_2713 = buf_2953.term();
				}
				sink.propertyNamed("$LineLocation", term_2713);
				Term term_1634;
				{
					BufferSink buf_2673 = sink.context().makeBuffer();
					buf_2673.start(_M_STRING);
					buf_2673.literal(1);
					buf_2673.end();
					term_1634 = buf_2673.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1634);
				sink.start(_M__sTextCons);
				Term term_3267;
				{
					BufferSink buf_2111 = sink.context().makeBuffer();
					buf_2111.start(_M_STRING);
					buf_2111.literal(6);
					buf_2111.end();
					term_3267 = buf_2111.term();
				}
				sink.propertyNamed("$LineLocation", term_3267);
				Term term_2555;
				{
					BufferSink buf_2742 = sink.context().makeBuffer();
					buf_2742.start(_M_STRING);
					buf_2742.literal(1);
					buf_2742.end();
					term_2555 = buf_2742.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2555);
				sink.start(_M__sTextBreak);
				sink.literal("\n\n");
				sink.end();
				Term term_2315;
				{
					BufferSink buf_3320 = sink.context().makeBuffer();
					buf_3320.start(_M_STRING);
					buf_3320.literal(6);
					buf_3320.end();
					term_2315 = buf_3320.term();
				}
				sink.propertyNamed("$LineLocation", term_2315);
				Term term_3343;
				{
					BufferSink buf_2810 = sink.context().makeBuffer();
					buf_2810.start(_M_STRING);
					buf_2810.literal(50);
					buf_2810.end();
					term_3343 = buf_2810.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3343);
				sink.start(_M__sTextCons);
				Term term_2745;
				{
					BufferSink buf_2514 = sink.context().makeBuffer();
					buf_2514.start(_M_STRING);
					buf_2514.literal(6);
					buf_2514.end();
					term_2745 = buf_2514.term();
				}
				sink.propertyNamed("$LineLocation", term_2745);
				Term term_3120;
				{
					BufferSink buf_2804 = sink.context().makeBuffer();
					buf_2804.start(_M_STRING);
					buf_2804.literal(50);
					buf_2804.end();
					term_3120 = buf_2804.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3120);
				sink.start(_M__sTextChars);
				sink.literal("import org.crsx.runtime.*;");
				sink.end();
				Term term_2960;
				{
					BufferSink buf_2246 = sink.context().makeBuffer();
					buf_2246.start(_M_STRING);
					buf_2246.literal(8);
					buf_2246.end();
					term_2960 = buf_2246.term();
				}
				sink.propertyNamed("$LineLocation", term_2960);
				Term term_3562;
				{
					BufferSink buf_2522 = sink.context().makeBuffer();
					buf_2522.start(_M_STRING);
					buf_2522.literal(1);
					buf_2522.end();
					term_3562 = buf_2522.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3562);
				sink.start(_M__sTextCons);
				Term term_3737;
				{
					BufferSink buf_2521 = sink.context().makeBuffer();
					buf_2521.start(_M_STRING);
					buf_2521.literal(8);
					buf_2521.end();
					term_3737 = buf_2521.term();
				}
				sink.propertyNamed("$LineLocation", term_3737);
				Term term_2201;
				{
					BufferSink buf_2771 = sink.context().makeBuffer();
					buf_2771.start(_M_STRING);
					buf_2771.literal(1);
					buf_2771.end();
					term_2201 = buf_2771.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2201);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2788;
				{
					BufferSink buf_2586 = sink.context().makeBuffer();
					buf_2586.start(_M_STRING);
					buf_2586.literal(8);
					buf_2586.end();
					term_2788 = buf_2586.term();
				}
				sink.propertyNamed("$LineLocation", term_2788);
				Term term_3700;
				{
					BufferSink buf_2620 = sink.context().makeBuffer();
					buf_2620.start(_M_STRING);
					buf_2620.literal(27);
					buf_2620.end();
					term_3700 = buf_2620.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3700);
				sink.start(_M__sTextCons);
				Term term_3761;
				{
					BufferSink buf_2707 = sink.context().makeBuffer();
					buf_2707.start(_M_STRING);
					buf_2707.literal(8);
					buf_2707.end();
					term_3761 = buf_2707.term();
				}
				sink.propertyNamed("$LineLocation", term_3761);
				Term term_3026;
				{
					BufferSink buf_2651 = sink.context().makeBuffer();
					buf_2651.start(_M_STRING);
					buf_2651.literal(27);
					buf_2651.end();
					term_3026 = buf_2651.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3026);
				sink.start(_M__sTextChars);
				sink.literal("import org.crsx.runtime.ConstructionDescriptor.*;");
				sink.end();
				Term term_2448;
				{
					BufferSink buf_2978 = sink.context().makeBuffer();
					buf_2978.start(_M_STRING);
					buf_2978.literal(9);
					buf_2978.end();
					term_2448 = buf_2978.term();
				}
				sink.propertyNamed("$LineLocation", term_2448);
				Term term_2859;
				{
					BufferSink buf_2471 = sink.context().makeBuffer();
					buf_2471.start(_M_STRING);
					buf_2471.literal(1);
					buf_2471.end();
					term_2859 = buf_2471.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2859);
				sink.start(_M__sTextCons);
				Term term_3040;
				{
					BufferSink buf_2501 = sink.context().makeBuffer();
					buf_2501.start(_M_STRING);
					buf_2501.literal(9);
					buf_2501.end();
					term_3040 = buf_2501.term();
				}
				sink.propertyNamed("$LineLocation", term_3040);
				Term term_2752;
				{
					BufferSink buf_2614 = sink.context().makeBuffer();
					buf_2614.start(_M_STRING);
					buf_2614.literal(1);
					buf_2614.end();
					term_2752 = buf_2614.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2752);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2432;
				{
					BufferSink buf_3263 = sink.context().makeBuffer();
					buf_3263.start(_M_STRING);
					buf_3263.literal(9);
					buf_3263.end();
					term_2432 = buf_3263.term();
				}
				sink.propertyNamed("$LineLocation", term_2432);
				Term term_3051;
				{
					BufferSink buf_2567 = sink.context().makeBuffer();
					buf_2567.start(_M_STRING);
					buf_2567.literal(50);
					buf_2567.end();
					term_3051 = buf_2567.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3051);
				sink.start(_M__sTextCons);
				Term term_2766;
				{
					BufferSink buf_2469 = sink.context().makeBuffer();
					buf_2469.start(_M_STRING);
					buf_2469.literal(9);
					buf_2469.end();
					term_2766 = buf_2469.term();
				}
				sink.propertyNamed("$LineLocation", term_2766);
				Term term_2764;
				{
					BufferSink buf_2944 = sink.context().makeBuffer();
					buf_2944.start(_M_STRING);
					buf_2944.literal(50);
					buf_2944.end();
					term_2764 = buf_2944.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2764);
				sink.start(_M__sTextChars);
				sink.literal("import static org.crsx.runtime.Primitives.*;");
				sink.end();
				Term term_2446;
				{
					BufferSink buf_2477 = sink.context().makeBuffer();
					buf_2477.start(_M_STRING);
					buf_2477.literal(10);
					buf_2477.end();
					term_2446 = buf_2477.term();
				}
				sink.propertyNamed("$LineLocation", term_2446);
				Term term_2805;
				{
					BufferSink buf_1846 = sink.context().makeBuffer();
					buf_1846.start(_M_STRING);
					buf_1846.literal(1);
					buf_1846.end();
					term_2805 = buf_1846.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2805);
				sink.start(_M__sTextCons);
				Term term_2567;
				{
					BufferSink buf_2855 = sink.context().makeBuffer();
					buf_2855.start(_M_STRING);
					buf_2855.literal(10);
					buf_2855.end();
					term_2567 = buf_2855.term();
				}
				sink.propertyNamed("$LineLocation", term_2567);
				Term term_3249;
				{
					BufferSink buf_2584 = sink.context().makeBuffer();
					buf_2584.start(_M_STRING);
					buf_2584.literal(1);
					buf_2584.end();
					term_3249 = buf_2584.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3249);
				sink.start(_M__sTextEmbed);
				Term term_2829;
				{
					BufferSink buf_3409 = sink.context().makeBuffer();
					buf_3409.start(_M_STRING);
					buf_3409.literal(10);
					buf_3409.end();
					term_2829 = buf_3409.term();
				}
				sink.propertyNamed("$LineLocation", term_2829);
				Term term_2801;
				{
					BufferSink buf_1744 = sink.context().makeBuffer();
					buf_1744.start(_M_STRING);
					buf_1744.literal(1);
					buf_1744.end();
					term_2801 = buf_1744.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2801);
				sink.start(_M_AsText);
				sink.start(_M_JavaImport);
				sink.copy(term_2488.ref());
				sink.end();
				sink.end();
				sink.end();
				Term term_2887;
				{
					BufferSink buf_3481 = sink.context().makeBuffer();
					buf_3481.start(_M_STRING);
					buf_3481.literal(10);
					buf_3481.end();
					term_2887 = buf_3481.term();
				}
				sink.propertyNamed("$LineLocation", term_2887);
				Term term_3105;
				{
					BufferSink buf_2499 = sink.context().makeBuffer();
					buf_2499.start(_M_STRING);
					buf_2499.literal(45);
					buf_2499.end();
					term_3105 = buf_2499.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3105);
				sink.start(_M__sTextCons);
				Term term_2612;
				{
					BufferSink buf_2641 = sink.context().makeBuffer();
					buf_2641.start(_M_STRING);
					buf_2641.literal(10);
					buf_2641.end();
					term_2612 = buf_2641.term();
				}
				sink.propertyNamed("$LineLocation", term_2612);
				Term term_3096;
				{
					BufferSink buf_2816 = sink.context().makeBuffer();
					buf_2816.start(_M_STRING);
					buf_2816.literal(45);
					buf_2816.end();
					term_3096 = buf_2816.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3096);
				sink.start(_M__sTextBreak);
				sink.literal("\n\n");
				sink.end();
				Term term_2696;
				{
					BufferSink buf_2271 = sink.context().makeBuffer();
					buf_2271.start(_M_STRING);
					buf_2271.literal(10);
					buf_2271.end();
					term_2696 = buf_2271.term();
				}
				sink.propertyNamed("$LineLocation", term_2696);
				Term term_2744;
				{
					BufferSink buf_2706 = sink.context().makeBuffer();
					buf_2706.start(_M_STRING);
					buf_2706.literal(72);
					buf_2706.end();
					term_2744 = buf_2706.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2744);
				sink.start(_M__sTextCons);
				Term term_3445;
				{
					BufferSink buf_2675 = sink.context().makeBuffer();
					buf_2675.start(_M_STRING);
					buf_2675.literal(10);
					buf_2675.end();
					term_3445 = buf_2675.term();
				}
				sink.propertyNamed("$LineLocation", term_3445);
				Term term_2484;
				{
					BufferSink buf_2687 = sink.context().makeBuffer();
					buf_2687.start(_M_STRING);
					buf_2687.literal(72);
					buf_2687.end();
					term_2484 = buf_2687.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2484);
				sink.start(_M__sTextChars);
				sink.literal("public ");
				sink.end();
				Term term_2343;
				{
					BufferSink buf_2440 = sink.context().makeBuffer();
					buf_2440.start(_M_STRING);
					buf_2440.literal(12);
					buf_2440.end();
					term_2343 = buf_2440.term();
				}
				sink.propertyNamed("$LineLocation", term_2343);
				Term term_2593;
				{
					BufferSink buf_2245 = sink.context().makeBuffer();
					buf_2245.start(_M_STRING);
					buf_2245.literal(1);
					buf_2245.end();
					term_2593 = buf_2245.term();
				}
				sink.propertyNamed("$ColumnLocation", term_2593);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_48 :
			{
				if (term_3466.descriptor() != _M_SUBMODULE)
				{
					break label_48;
				}
				/* #declarations=term *//*Contract*/
				sink.start(_M__sTextCons);
				sink.start(_M__sTextBreak);
				sink.literal("\n");
				sink.end();
				Term term_2892;
				{
					BufferSink buf_1949 = sink.context().makeBuffer();
					buf_1949.start(_M_STRING);
					buf_1949.literal(1);
					buf_1949.end();
					term_2892 = buf_1949.term();
				}
				sink.propertyNamed("$LineLocation", term_2892);
				Term term_3376;
				{
					BufferSink buf_2851 = sink.context().makeBuffer();
					buf_2851.start(_M_STRING);
					buf_2851.literal(1);
					buf_2851.end();
					term_3376 = buf_2851.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3376);
				sink.start(_M__sTextCons);
				Term term_2515;
				{
					BufferSink buf_2540 = sink.context().makeBuffer();
					buf_2540.start(_M_STRING);
					buf_2540.literal(1);
					buf_2540.end();
					term_2515 = buf_2540.term();
				}
				sink.propertyNamed("$LineLocation", term_2515);
				Term term_3694;
				{
					BufferSink buf_3226 = sink.context().makeBuffer();
					buf_3226.start(_M_STRING);
					buf_3226.literal(1);
					buf_3226.end();
					term_3694 = buf_3226.term();
				}
				sink.propertyNamed("$ColumnLocation", term_3694);
				sink.start(_M__sTextChars);
				sink.literal("public static ");
				sink.end();
				Term term_2880;
				{
					BufferSink buf_2964 = sink.context().makeBuffer();
					buf_2964.start(_M_STRING);
					buf_2964.literal(1);
					buf_2964.end();
					term_2880 = buf_2964.term();
				}
				sink.propertyNamed("$LineLocation", term_2880);
				Term term_1924;
				{
					BufferSink buf_2243 = sink.context().makeBuffer();
					buf_2243.start(_M_STRING);
					buf_2243.literal(2);
					buf_2243.end();
					term_1924 = buf_2243.term();
				}
				sink.propertyNamed("$ColumnLocation", term_1924);
				sink.start(_M__sTextNil);
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_JavaHeader, term_3466, term_2488);
	}

	final public static boolean _M_JavaUnit(Sink sink, int shared, int depth, Properties props_74, Term term_2767, Term term_2478, Term term_3009)
	{
		if (depth < 2000)
		{
			sink.start(_M__sTextCons);
			sink.start(_M__sTextEmbed);
			sink.start(_M_AsText);
			sink.start(_M_JavaHeader);
			sink.copy(term_3009.ref());
			sink.start(_M_DesugarDeclarations);
			sink.copy(term_2478.ref());
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			Term term_2500;
			{
				BufferSink buf_1940 = sink.context().makeBuffer();
				buf_1940.start(_M_STRING);
				buf_1940.literal(1);
				buf_1940.end();
				term_2500 = buf_1940.term();
			}
			sink.propertyNamed("$LineLocation", term_2500);
			Term term_3148;
			{
				BufferSink buf_2889 = sink.context().makeBuffer();
				buf_2889.start(_M_STRING);
				buf_2889.literal(1);
				buf_2889.end();
				term_3148 = buf_2889.term();
			}
			sink.propertyNamed("$ColumnLocation", term_3148);
			sink.start(_M__sTextCons);
			Term term_3007;
			{
				BufferSink buf_2999 = sink.context().makeBuffer();
				buf_2999.start(_M_STRING);
				buf_2999.literal(1);
				buf_2999.end();
				term_3007 = buf_2999.term();
			}
			sink.propertyNamed("$LineLocation", term_3007);
			Term term_2641;
			{
				BufferSink buf_2278 = sink.context().makeBuffer();
				buf_2278.start(_M_STRING);
				buf_2278.literal(1);
				buf_2278.end();
				term_2641 = buf_2278.term();
			}
			sink.propertyNamed("$ColumnLocation", term_2641);
			sink.start(_M__sTextChars);
			sink.literal("class ");
			sink.end();
			Term term_3361;
			{
				BufferSink buf_2756 = sink.context().makeBuffer();
				buf_2756.start(_M_STRING);
				buf_2756.literal(1);
				buf_2756.end();
				term_3361 = buf_2756.term();
			}
			sink.propertyNamed("$LineLocation", term_3361);
			Term term_2823;
			{
				BufferSink buf_2716 = sink.context().makeBuffer();
				buf_2716.start(_M_STRING);
				buf_2716.literal(56);
				buf_2716.end();
				term_2823 = buf_2716.term();
			}
			sink.propertyNamed("$ColumnLocation", term_2823);
			sink.start(_M__sTextCons);
			Term term_3559;
			{
				BufferSink buf_2711 = sink.context().makeBuffer();
				buf_2711.start(_M_STRING);
				buf_2711.literal(1);
				buf_2711.end();
				term_3559 = buf_2711.term();
			}
			sink.propertyNamed("$LineLocation", term_3559);
			Term term_3566;
			{
				BufferSink buf_2892 = sink.context().makeBuffer();
				buf_2892.start(_M_STRING);
				buf_2892.literal(62);
				buf_2892.end();
				term_3566 = buf_2892.term();
			}
			sink.propertyNamed("$ColumnLocation", term_3566);
			sink.start(_M__sTextChars);
			sink.start(_M_ClassName);
			sink.copy(term_2767.ref());
			sink.end();
			sink.end();
			Term term_3183;
			{
				BufferSink buf_3159 = sink.context().makeBuffer();
				buf_3159.start(_M_STRING);
				buf_3159.literal(1);
				buf_3159.end();
				term_3183 = buf_3159.term();
			}
			sink.propertyNamed("$LineLocation", term_3183);
			Term term_2991;
			{
				BufferSink buf_2943 = sink.context().makeBuffer();
				buf_2943.start(_M_STRING);
				buf_2943.literal(63);
				buf_2943.end();
				term_2991 = buf_2943.term();
			}
			sink.propertyNamed("$ColumnLocation", term_2991);
			sink.start(_M__sTextCons);
			Term term_3041;
			{
				BufferSink buf_2315 = sink.context().makeBuffer();
				buf_2315.start(_M_STRING);
				buf_2315.literal(1);
				buf_2315.end();
				term_3041 = buf_2315.term();
			}
			sink.propertyNamed("$LineLocation", term_3041);
			Term term_3677;
			{
				BufferSink buf_2864 = sink.context().makeBuffer();
				buf_2864.start(_M_STRING);
				buf_2864.literal(63);
				buf_2864.end();
				term_3677 = buf_2864.term();
			}
			sink.propertyNamed("$ColumnLocation", term_3677);
			sink.start(_M__sTextBreak);
			sink.literal("\n");
			sink.end();
			Term term_3125;
			{
				BufferSink buf_2516 = sink.context().makeBuffer();
				buf_2516.start(_M_STRING);
				buf_2516.literal(1);
				buf_2516.end();
				term_3125 = buf_2516.term();
			}
			sink.propertyNamed("$LineLocation", term_3125);
			Term term_2537;
			{
				BufferSink buf_2310 = sink.context().makeBuffer();
				buf_2310.start(_M_STRING);
				buf_2310.literal(85);
				buf_2310.end();
				term_2537 = buf_2310.term();
			}
			sink.propertyNamed("$ColumnLocation", term_2537);
			sink.start(_M__sTextCons);
			Term term_2631;
			{
				BufferSink buf_2108 = sink.context().makeBuffer();
				buf_2108.start(_M_STRING);
				buf_2108.literal(1);
				buf_2108.end();
				term_2631 = buf_2108.term();
			}
			sink.propertyNamed("$LineLocation", term_2631);
			Term term_3052;
			{
				BufferSink buf_3368 = sink.context().makeBuffer();
				buf_3368.start(_M_STRING);
				buf_3368.literal(85);
				buf_3368.end();
				term_3052 = buf_3368.term();
			}
			sink.propertyNamed("$ColumnLocation", term_3052);
			sink.start(_M__sTextChars);
			sink.literal("{");
			sink.end();
			Term term_2836;
			{
				BufferSink buf_2870 = sink.context().makeBuffer();
				buf_2870.start(_M_STRING);
				buf_2870.literal(2);
				buf_2870.end();
				term_2836 = buf_2870.term();
			}
			sink.propertyNamed("$LineLocation", term_2836);
			Term term_2837;
			{
				BufferSink buf_2489 = sink.context().makeBuffer();
				buf_2489.start(_M_STRING);
				buf_2489.literal(1);
				buf_2489.end();
				term_2837 = buf_2489.term();
			}
			sink.propertyNamed("$ColumnLocation", term_2837);
			sink.start(_M__sTextCons);
			Term term_3206;
			{
				BufferSink buf_3037 = sink.context().makeBuffer();
				buf_3037.start(_M_STRING);
				buf_3037.literal(2);
				buf_3037.end();
				term_3206 = buf_3037.term();
			}
			sink.propertyNamed("$LineLocation", term_3206);
			Term term_3154;
			{
				BufferSink buf_2818 = sink.context().makeBuffer();
				buf_2818.start(_M_STRING);
				buf_2818.literal(2);
				buf_2818.end();
				term_3154 = buf_2818.term();
			}
			sink.propertyNamed("$ColumnLocation", term_3154);
			sink.start(_M__sTextIndent);
			Term term_2334;
			{
				BufferSink buf_1951 = sink.context().makeBuffer();
				buf_1951.start(_M_STRING);
				buf_1951.literal(2);
				buf_1951.end();
				term_2334 = buf_1951.term();
			}
			sink.propertyNamed("$LineLocation", term_2334);
			Term term_2708;
			{
				BufferSink buf_3732 = sink.context().makeBuffer();
				buf_3732.start(_M_STRING);
				buf_3732.literal(2);
				buf_3732.end();
				term_2708 = buf_3732.term();
			}
			sink.propertyNamed("$ColumnLocation", term_2708);
			sink.start(_M__sTextCons);
			Term term_2692;
			{
				BufferSink buf_2767 = sink.context().makeBuffer();
				buf_2767.start(_M_STRING);
				buf_2767.literal(2);
				buf_2767.end();
				term_2692 = buf_2767.term();
			}
			sink.propertyNamed("$LineLocation", term_2692);
			Term term_3687;
			{
				BufferSink buf_2757 = sink.context().makeBuffer();
				buf_2757.start(_M_STRING);
				buf_2757.literal(2);
				buf_2757.end();
				term_3687 = buf_2757.term();
			}
			sink.propertyNamed("$ColumnLocation", term_3687);
			sink.start(_M__sTextEmbed);
			Term term_2619;
			{
				BufferSink buf_2648 = sink.context().makeBuffer();
				buf_2648.start(_M_STRING);
				buf_2648.literal(2);
				buf_2648.end();
				term_2619 = buf_2648.term();
			}
			sink.propertyNamed("$LineLocation", term_2619);
			Term term_2441;
			{
				BufferSink buf_2470 = sink.context().makeBuffer();
				buf_2470.start(_M_STRING);
				buf_2470.literal(2);
				buf_2470.end();
				term_2441 = buf_2470.term();
			}
			sink.propertyNamed("$ColumnLocation", term_2441);
			sink.start(_M_AsText);
			sink.properties(safeRef(props_74));
			Term term_3326;
			{
				BufferSink buf_2801 = sink.context().makeBuffer();
				buf_2801.start(_M_STRING);
				buf_2801.start(_M_ClassName);
				buf_2801.copy(term_2767.ref());
				buf_2801.end();
				buf_2801.end();
				term_3326 = buf_2801.term();
			}
			sink.propertyNamed("$classname", term_3326);
			sink.start(_M_Declarations);
			sink.start(_M_DesugarDeclarations);
			sink.copy(term_2478.ref());
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			Term term_2721;
			{
				BufferSink buf_1946 = sink.context().makeBuffer();
				buf_1946.start(_M_STRING);
				buf_1946.literal(2);
				buf_1946.end();
				term_2721 = buf_1946.term();
			}
			sink.propertyNamed("$LineLocation", term_2721);
			Term term_2222;
			{
				BufferSink buf_2166 = sink.context().makeBuffer();
				buf_2166.start(_M_STRING);
				buf_2166.literal(3);
				buf_2166.end();
				term_2222 = buf_2166.term();
			}
			sink.propertyNamed("$ColumnLocation", term_2222);
			sink.start(_M__sTextCons);
			Term term_3025;
			{
				BufferSink buf_3065 = sink.context().makeBuffer();
				buf_3065.start(_M_STRING);
				buf_3065.literal(2);
				buf_3065.end();
				term_3025 = buf_3065.term();
			}
			sink.propertyNamed("$LineLocation", term_3025);
			Term term_2943;
			{
				BufferSink buf_3519 = sink.context().makeBuffer();
				buf_3519.start(_M_STRING);
				buf_3519.literal(3);
				buf_3519.end();
				term_2943 = buf_3519.term();
			}
			sink.propertyNamed("$ColumnLocation", term_2943);
			sink.start(_M__sTextEmbed);
			Term term_3587;
			{
				BufferSink buf_3396 = sink.context().makeBuffer();
				buf_3396.start(_M_STRING);
				buf_3396.literal(2);
				buf_3396.end();
				term_3587 = buf_3396.term();
			}
			sink.propertyNamed("$LineLocation", term_3587);
			Term term_3540;
			{
				BufferSink buf_2838 = sink.context().makeBuffer();
				buf_2838.start(_M_STRING);
				buf_2838.literal(3);
				buf_2838.end();
				term_3540 = buf_2838.term();
			}
			sink.propertyNamed("$ColumnLocation", term_3540);
			sink.start(_M_AsText);
			sink.start(_M_InitModule);
			sink.start(_M_DesugarDeclarations);
			sink.copy(term_2478.ref());
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			Term term_3095;
			{
				BufferSink buf_2280 = sink.context().makeBuffer();
				buf_2280.start(_M_STRING);
				buf_2280.literal(2);
				buf_2280.end();
				term_3095 = buf_2280.term();
			}
			sink.propertyNamed("$LineLocation", term_3095);
			Term term_3091;
			{
				BufferSink buf_2872 = sink.context().makeBuffer();
				buf_2872.start(_M_STRING);
				buf_2872.literal(101);
				buf_2872.end();
				term_3091 = buf_2872.term();
			}
			sink.propertyNamed("$ColumnLocation", term_3091);
			sink.start(_M__sTextNil);
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			Term term_3116;
			{
				BufferSink buf_2831 = sink.context().makeBuffer();
				buf_2831.start(_M_STRING);
				buf_2831.literal(2);
				buf_2831.end();
				term_3116 = buf_2831.term();
			}
			sink.propertyNamed("$LineLocation", term_3116);
			Term term_3585;
			{
				BufferSink buf_2591 = sink.context().makeBuffer();
				buf_2591.start(_M_STRING);
				buf_2591.literal(149);
				buf_2591.end();
				term_3585 = buf_2591.term();
			}
			sink.propertyNamed("$ColumnLocation", term_3585);
			sink.start(_M__sTextCons);
			Term term_3862;
			{
				BufferSink buf_2485 = sink.context().makeBuffer();
				buf_2485.start(_M_STRING);
				buf_2485.literal(2);
				buf_2485.end();
				term_3862 = buf_2485.term();
			}
			sink.propertyNamed("$LineLocation", term_3862);
			Term term_3484;
			{
				BufferSink buf_2630 = sink.context().makeBuffer();
				buf_2630.start(_M_STRING);
				buf_2630.literal(149);
				buf_2630.end();
				term_3484 = buf_2630.term();
			}
			sink.propertyNamed("$ColumnLocation", term_3484);
			sink.start(_M__sTextBreak);
			sink.literal("\n");
			sink.end();
			Term term_3763;
			{
				BufferSink buf_3117 = sink.context().makeBuffer();
				buf_3117.start(_M_STRING);
				buf_3117.literal(2);
				buf_3117.end();
				term_3763 = buf_3117.term();
			}
			sink.propertyNamed("$LineLocation", term_3763);
			Term term_3533;
			{
				BufferSink buf_3187 = sink.context().makeBuffer();
				buf_3187.start(_M_STRING);
				buf_3187.literal(150);
				buf_3187.end();
				term_3533 = buf_3187.term();
			}
			sink.propertyNamed("$ColumnLocation", term_3533);
			sink.start(_M__sTextCons);
			Term term_2660;
			{
				BufferSink buf_2700 = sink.context().makeBuffer();
				buf_2700.start(_M_STRING);
				buf_2700.literal(2);
				buf_2700.end();
				term_2660 = buf_2700.term();
			}
			sink.propertyNamed("$LineLocation", term_2660);
			Term term_2613;
			{
				BufferSink buf_2590 = sink.context().makeBuffer();
				buf_2590.start(_M_STRING);
				buf_2590.literal(150);
				buf_2590.end();
				term_2613 = buf_2590.term();
			}
			sink.propertyNamed("$ColumnLocation", term_2613);
			sink.start(_M__sTextEmbed);
			Term term_3191;
			{
				BufferSink buf_2821 = sink.context().makeBuffer();
				buf_2821.start(_M_STRING);
				buf_2821.literal(2);
				buf_2821.end();
				term_3191 = buf_2821.term();
			}
			sink.propertyNamed("$LineLocation", term_3191);
			Term term_3262;
			{
				BufferSink buf_2733 = sink.context().makeBuffer();
				buf_2733.start(_M_STRING);
				buf_2733.literal(150);
				buf_2733.end();
				term_3262 = buf_2733.term();
			}
			sink.propertyNamed("$ColumnLocation", term_3262);
			sink.start(_M_AsText);
			sink.start(_M_JavaFooter);
			sink.copy(term_3009.ref());
			sink.end();
			sink.end();
			sink.end();
			Term term_2686;
			{
				BufferSink buf_2285 = sink.context().makeBuffer();
				buf_2285.start(_M_STRING);
				buf_2285.literal(3);
				buf_2285.end();
				term_2686 = buf_2285.term();
			}
			sink.propertyNamed("$LineLocation", term_2686);
			Term term_3437;
			{
				BufferSink buf_3445 = sink.context().makeBuffer();
				buf_3445.start(_M_STRING);
				buf_3445.literal(1);
				buf_3445.end();
				term_3437 = buf_3445.term();
			}
			sink.propertyNamed("$ColumnLocation", term_3437);
			sink.start(_M__sTextNil);
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_JavaUnit, props_74, term_2767, term_2478, term_3009);
	}

	final public static boolean _M_Crsx(Sink sink, int shared, int depth, Properties props_78, Term term_2973, Term term_3556, Term term_2015, Term term_2827)
	{
		if (depth < 2000)
		{
			label_360 :
			{
				if (term_2973.descriptor() != _M_OK)
				{
					break label_360;
				}
				/* #filename=term */
				if (term_2015.descriptor() != _M_Crsx_xcrsx)
				{
					break label_360;
				}
				Term sub_943 = term_2015.sub(0).ref();
				/* #declarations=sub */
				/* #mode=term *//*Contract*/sink.properties(safeRef(props_78));
				sink.start(_M_JavaUnit);
				sink.copy(term_3556.ref());
				sink.copy(sub_943.ref());
				sink.copy(term_2827.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_Crsx, props_78, term_2973, term_3556, term_2015, term_2827);
	}

	final public static boolean _M_GenerateJavaParsed(Sink sink, int shared, int depth, Term term_3362, Term term_3696, Term term_2348)
	{
		if (depth < 2000)
		{
			sink.start(_M_Crsx);
			sink.start(_M_OK);
			sink.end();
			sink.copy(term_3362.ref());
			sink.copy(term_3696.ref());
			sink.copy(term_2348.ref());
			sink.end();
			return true;
		}
		return thunk(sink, _M_GenerateJavaParsed, term_3362, term_3696, term_2348);
	}

	final public static boolean _M_GenerateJava(Sink sink, int shared, int depth, Term term_3452, Term term_2936)
	{
		if (depth < 2000)
		{
			sink.start(_M_GenerateJavaParsed);
			sink.copy(term_3452.ref());
			sink.start(_M__s);
			sink.start(_M_Builtin_sParseResource);
			sink.end();
			sink.literal("crsx");
			sink.copy(term_3452.ref());
			sink.end();
			sink.copy(term_2936.ref());
			sink.end();
			return true;
		}
		return thunk(sink, _M_GenerateJava, term_3452, term_2936);
	}
	private static boolean initialized = false;

	public static void init(Context context)
	{
		if (!initialized)
		{
			org.crsx.compiler.parser.Crsx.init(context);
			org.crsx.compiler.std.Core.init(context);
			org.crsx.compiler.std.String.init(context);
			org.crsx.compiler.std.Num.init(context);
			org.crsx.compiler.std.Text.init(context);
			org.crsx.compiler.std.List.init(context);
			org.crsx.compiler.Crsxutils.init(context);
			org.crsx.compiler.State.init(context);
			org.crsx.compiler.cg.Cgutils.init(context);
			context.registerParser("org.crsx.text.TextMetaParser");
			context.registerParser("org.crsx.parser.CrsxMetaParser");
			context.register(_M_ClassName);
			context.register(_M_PathToDot2);
			context.register(_M_PathToDot);
			context.register(_M_PathToImport2);
			context.register(_M_PathToImport);
			context.register(_M_PackageDeclaration3);
			context.register(_M_PackageDeclaration2);
			context.register(_M_PackageDeclaration);
			context.register(_M_RegisterDataForm);
			context.register(_M_RegisterDataSort);
			context.register(_M_Register);
			context.register(_M_Registers);
			context.register(_M_InitModule);
			context.register(_M_SetBuffer);
			context.register(_M_SetVariable0);
			context.register(_M_SetVariable);
			context.register(_M_SetTerm);
			context.register(_M_SetNextTerms);
			context.register(_M_SetTerms);
			context.register(_M_SetArgumentsOpt);
			context.register(_M_SetFreeTerm);
			context.register(_M_SetFreeTerms_xS1_xZOM);
			context.register(_M_SetFreeTerms);
			context.register(_M_CallFunctionArgs);
			context.register(_M_CallFunction);
			context.register(_M_SendTail2);
			context.register(_M_SendTail);
			context.register(_M_SendFreshesKey2);
			context.register(_M_SendFreshesKey);
			context.register(_M_SendFreshesKeys);
			context.register(_M_SendFreshes);
			context.register(_M_SendContraction);
			context.register(_M_SendMatchNextBinder);
			context.register(_M_SendMatchSubTerm);
			context.register(_M_SendMatchSubTerms);
			context.register(_M_SendMatchMaybeArguments);
			context.register(_M_SendMatchMeta);
			context.register(_M_SendMatchProperty);
			context.register(_M_SendMatchPropertyList);
			context.register(_M_SendMatchMaybeProperties);
			context.register(_M_SendMatchFreeTerm);
			context.register(_M_SendMatchTerm);
			context.register(_M_SendMatchTopArguments);
			context.register(_M_SendMatchTopMaybeProperties);
			context.register(_M_SendDispatchCase);
			context.register(_M_SendDispatchCases);
			context.register(_M_SendDispatchBinders);
			context.register(_M_SendDispatchMeta);
			context.register(_M_SendDispatchFreeTerm);
			context.register(_M_SendDispatchTerm);
			context.register(_M_SendDispatchTerms);
			context.register(_M_SendDispatchMaybeProperties);
			context.register(_M_SendDispatchTopFreeTerm);
			context.register(_M_SendDispatch);
			context.register(_M_SendSubstitutes);
			context.register(_M_SendMetaEntry);
			context.register(_M_SendMetaKey);
			context.register(_M_SendMeta);
			context.register(_M_SendVariable0);
			context.register(_M_SendVariable);
			context.register(_M_SendNamedProperty);
			context.register(_M_SendVariableProperty);
			context.register(_M_SendMetaProperty);
			context.register(_M_SendProperty);
			context.register(_M_SendPropertyList);
			context.register(_M_SendMaybeProperties);
			context.register(_M_SendBindersKey);
			context.register(_M_SendBinders);
			context.register(_M_SendTerms_xS1_xZOM);
			context.register(_M_SendTerms);
			context.register(_M_SendArgumentsOpt);
			context.register(_M_ThenSendArgumentsOpt);
			context.register(_M_SendConstructor);
			context.register(_M_SendFreeTerm);
			context.register(_M_SendTerm);
			context.register(_M_Thunk2);
			context.register(_M_Thunk);
			context.register(_M_Body);
			context.register(_M_SigVar1);
			context.register(_M_SigVar);
			context.register(_M_SigMeta1);
			context.register(_M_SigMeta);
			context.register(_M_SigPropertyRef1);
			context.register(_M_SigPropertyRef);
			context.register(_M_SigNextBinder);
			context.register(_M_SigTerms);
			context.register(_M_SigMaybeTerms);
			context.register(_M_SigArguments);
			context.register(_M_SigMaybeArguments);
			context.register(_M_SigMaybeProperties);
			context.register(_M_Signature);
			context.register(_M_Rule);
			context.register(_M_OptionIndexKey);
			context.register(_M_OptionIndex);
			context.register(_M_OptionTerms);
			context.register(_M_OptionArgumentsOpt);
			context.register(_M_OptionOpt);
			context.register(_M_DataForm);
			context.register(_M_DataSort);
			context.register(_M_Declaration);
			context.register(_M_Declarations);
			context.register(_M_JavaImport);
			context.register(_M_JavaFooter);
			context.register(_M_JavaHeader);
			context.register(_M_JavaUnit);
			context.register(_M_Crsx);
			context.register(_M_GenerateJavaParsed);
			context.register(_M_GenerateJava);
			initialized = true;
		}
	}

	/* END MODULE « "cg/cgjava.crs.java" » */
}