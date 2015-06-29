/* START MODULE state.crs.java */
/** Generated File */

package org.crsx.compiler;

import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;
import static org.crsx.runtime.Normalizer.force;
import static org.crsx.runtime.Reference.safeRef;

import org.crsx.runtime.*;
import org.crsx.runtime.ConstructionDescriptor.*;
import static org.crsx.runtime.Primitives.*;
import static org.crsx.compiler.std.Core.*;
import static org.crsx.compiler.std.List.*;
import static org.crsx.compiler.parser.Crsx.*;

public class State
{
	final public static ConstructionDescriptor _M_QSORT = makeData("QSORT");
	final public static ConstructionDescriptor _M_KEYS = makeData("KEYS");
	final public static ConstructionDescriptor _M_IMPORTS = makeData("IMPORTS");
	final public static ConstructionDescriptor _M_RULES = makeData("RULES");
	final public static ConstructionDescriptor _M_DATASORT = makeData("DATASORT");
	final public static ConstructionDescriptor _M_FUNCSORT = makeData("FUNCSORT");
	final public static ConstructionDescriptor _M_FORMKEYS = makeData("FORMKEYS");
	final public static ConstructionDescriptor _M_STR = makeData("STR");
	final public static ConstructionDescriptor _M_NOCONTENTENTRY = makeData("NOCONTENTENTRY");
	final public static ConstructionDescriptor _M_NOTLOADED = makeData("NOTLOADED");
	final public static ConstructionDescriptor _M_LOADED = makeData("LOADED");
	final public static ConstructionDescriptor _M_MODULES = makeData("MODULES");
	final public static ConstructionDescriptor _M_MODULE = makeData("MODULE");
	final public static ConstructionDescriptor _M_MAINMODULE = makeData("MAINMODULE");
	final public static ConstructionDescriptor _M_SUBMODULE = makeData("SUBMODULE");
	final public static DynamicFunctionDescriptor _M_OutputRuleDeclarationsForKey = makeFunction(
			"OutputRuleDeclarationsForKey", State.class, "_M_OutputRuleDeclarationsForKey");
	final public static DynamicFunctionDescriptor _M_OutputRuleDeclarations = makeFunction(
			"OutputRuleDeclarations", State.class, "_M_OutputRuleDeclarations");
	final public static DynamicFunctionDescriptor _M_OutputFuncDeclaration = makeFunction(
			"OutputFuncDeclaration", State.class, "_M_OutputFuncDeclaration");
	final public static DynamicFunctionDescriptor _M_OutputFuncDeclarations = makeFunction(
			"OutputFuncDeclarations", State.class, "_M_OutputFuncDeclarations");
	final public static DynamicFunctionDescriptor _M_OutputDataDeclarationsForKey = makeFunction(
			"OutputDataDeclarationsForKey", State.class, "_M_OutputDataDeclarationsForKey");
	final public static DynamicFunctionDescriptor _M_OutputDataDeclarations = makeFunction(
			"OutputDataDeclarations", State.class, "_M_OutputDataDeclarations");
	final public static DynamicFunctionDescriptor _M_OutputImportGrammarDeclarations = makeFunction(
			"OutputImportGrammarDeclarations", State.class, "_M_OutputImportGrammarDeclarations");
	final public static DynamicFunctionDescriptor _M_OutputImportDeclarations = makeFunction(
			"OutputImportDeclarations", State.class, "_M_OutputImportDeclarations");
	final public static DynamicFunctionDescriptor _M_OutputCrsx = makeFunction("OutputCrsx", State.class, "_M_OutputCrsx");
	final public static DynamicFunctionDescriptor _M_AddFuncSort2 = makeFunction("AddFuncSort2", State.class, "_M_AddFuncSort2");
	final public static DynamicFunctionDescriptor _M_AddFuncSort1 = makeFunction("AddFuncSort1", State.class, "_M_AddFuncSort1");
	final public static DynamicFunctionDescriptor _M_AddFuncSort = makeFunction("AddFuncSort", State.class, "_M_AddFuncSort");
	final public static DynamicFunctionDescriptor _M_AddDataForm2 = makeFunction("AddDataForm2", State.class, "_M_AddDataForm2");
	final public static DynamicFunctionDescriptor _M_AddDataForm1 = makeFunction("AddDataForm1", State.class, "_M_AddDataForm1");
	final public static DynamicFunctionDescriptor _M_AddDataForm = makeFunction("AddDataForm", State.class, "_M_AddDataForm");
	final public static DynamicFunctionDescriptor _M_AddDataSort3 = makeFunction("AddDataSort3", State.class, "_M_AddDataSort3");
	final public static DynamicFunctionDescriptor _M_AddDataSort2 = makeFunction("AddDataSort2", State.class, "_M_AddDataSort2");
	final public static DynamicFunctionDescriptor _M_AddDataSort1 = makeFunction("AddDataSort1", State.class, "_M_AddDataSort1");
	final public static DynamicFunctionDescriptor _M_AddDataSort = makeFunction("AddDataSort", State.class, "_M_AddDataSort");
	final public static DynamicFunctionDescriptor _M_AddRule3 = makeFunction("AddRule3", State.class, "_M_AddRule3");
	final public static DynamicFunctionDescriptor _M_AddRule2 = makeFunction("AddRule2", State.class, "_M_AddRule2");
	final public static DynamicFunctionDescriptor _M_AddRule = makeFunction("AddRule", State.class, "_M_AddRule");
	final public static DynamicFunctionDescriptor _M_LookupSortByConstructor1 = makeFunction(
			"LookupSortByConstructor1", State.class, "_M_LookupSortByConstructor1");
	final public static DynamicFunctionDescriptor _M_LookupSortByConstructor = makeFunction(
			"LookupSortByConstructor", State.class, "_M_LookupSortByConstructor");
	final public static DynamicFunctionDescriptor _M_LookupModule = makeFunction("LookupModule", State.class, "_M_LookupModule");
	final public static DynamicFunctionDescriptor _M_ConstructorToString = makeFunction(
			"ConstructorToString", State.class, "_M_ConstructorToString");
	final public static DynamicFunctionDescriptor _M_SortnameToString = makeFunction(
			"SortnameToString", State.class, "_M_SortnameToString");
	final public static DynamicFunctionDescriptor _M_FuncSortKey = makeFunction("FuncSortKey", State.class, "_M_FuncSortKey");
	final public static DynamicFunctionDescriptor _M_DataFormKey = makeFunction("DataFormKey", State.class, "_M_DataFormKey");
	final public static DynamicFunctionDescriptor _M_DataSortKey = makeFunction("DataSortKey", State.class, "_M_DataSortKey");
	final public static DynamicFunctionDescriptor _M_RulesKey = makeFunction("RulesKey", State.class, "_M_RulesKey");
	final public static DynamicFunctionDescriptor _M_UnRULES = makeFunction("UnRULES", State.class, "_M_UnRULES");
	final public static DynamicFunctionDescriptor _M_UnFUNCSORT = makeFunction("UnFUNCSORT", State.class, "_M_UnFUNCSORT");
	final public static DynamicFunctionDescriptor _M_UnDATASORT = makeFunction("UnDATASORT", State.class, "_M_UnDATASORT");
	final public static DynamicFunctionDescriptor _M_AddModuleKey2 = makeFunction("AddModuleKey2", State.class, "_M_AddModuleKey2");
	final public static DynamicFunctionDescriptor _M_AddModuleKey = makeFunction("AddModuleKey", State.class, "_M_AddModuleKey");
	final public static DynamicFunctionDescriptor _M_AddModule = makeFunction("AddModule", State.class, "_M_AddModule");
	final public static DynamicFunctionDescriptor _M_ModuleKey = makeFunction("ModuleKey", State.class, "_M_ModuleKey");

	final public static boolean _M_OutputRuleDeclarationsForKey(Sink sink, int shared, int depth, Properties props, Term term, Term term_87)
	{
		if (depth < 2000)
		{
			label :
			{
				if (term.descriptor() != _M__sNil)
				{
					break label;
				}
				/* #keys=term *//*Contract*/sink.properties(safeRef(props));
				sink.start(_M_OutputRuleDeclarations);
				sink.copy(term_87.ref());
				sink.end();
				return true;
			}
			label_98 :
			{
				if (term.descriptor() != _M__sCons)
				{
					break label_98;
				}
				Term sub = term.sub(0).ref();
				/* #rule=sub */Term sub_97 = term.sub(1).ref();
				/* #rules=sub */
				/* #keys=term *//*Contract*/
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xdeclarations_xS1);
				sink.literal(";");
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xdeclaration_xA3);
				sink.copy(sub.ref());
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				sink.start(_M_OutputRuleDeclarationsForKey);
				sink.copy(sub_97.ref());
				sink.copy(term_87.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_OutputRuleDeclarationsForKey, props, term, term_87);
	}

	final public static boolean _M_OutputRuleDeclarations(Sink sink, int shared, int depth, Properties props_70, Term term_56)
	{
		if (depth < 2000)
		{
			label_0 :
			{
				if (term_56.descriptor() != _M__sNil)
				{
					break label_0;
				}/*Contract*/
				sink.start(_M__sNil);
				sink.end();
				return true;
			}
			label_49 :
			{
				if (term_56.descriptor() != _M__sCons)
				{
					break label_49;
				}
				Term sub_11 = term_56.sub(0).ref();
				/* #key=sub */Term sub_5 = term_56.sub(1).ref();
				/* #keys=sub *//*Contract*/sink.properties(safeRef(props_70));
				sink.start(_M_OutputRuleDeclarationsForKey);
				sink.start(_M_UnRULES);
				sink.start(_M__s);
				sink.properties(safeRef(props_70));
				sink.start(_M_Builtin_sGet);
				sink.end();
				sink.copy(sub_11.ref());
				sink.end();
				sink.end();
				sink.copy(sub_5.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_OutputRuleDeclarations, props_70, term_56);
	}

	final public static boolean _M_OutputFuncDeclaration(Sink sink, int shared, int depth, Properties props_8, Term term_77, Term term_4)
	{
		if (depth < 2000)
		{
			sink.start(_M__sCons);
			sink.start(_M_Crsx_xdeclarations_xS1);
			sink.literal(";");
			sink.start(_M__sCons);
			sink.start(_M_Crsx_xdeclaration_xA4);
			sink.copy(term_77.ref());
			sink.end();
			sink.start(_M__sNil);
			sink.end();
			sink.end();
			sink.end();
			sink.start(_M_OutputFuncDeclarations);
			sink.copy(term_4.ref());
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_OutputFuncDeclaration, props_8, term_77, term_4);
	}

	final public static boolean _M_OutputFuncDeclarations(Sink sink, int shared, int depth, Properties props_52, Term term_21)
	{
		if (depth < 2000)
		{
			label_94 :
			{
				Term value = props_52 == null ? null : props_52.lookup("$rulekeys");
				if (value == null)
				{
					break label_94;
				}
				if (value.descriptor() != _M_KEYS)
				{
					break label_94;
				}
				Term sub_15 = value.sub(0).ref();
				/* #keys=sub */
				if (term_21.descriptor() != _M__sNil)
				{
					break label_94;
				}/*Contract*/
				sink.properties(safeRef(props_52));
				sink.start(_M_OutputRuleDeclarations);
				sink.copy(sub_15.ref());
				sink.end();
				return true;
			}
			label_83 :
			{
				if (term_21.descriptor() != _M__sCons)
				{
					break label_83;
				}
				Term sub_168 = term_21.sub(0).ref();
				/* #key=sub */Term sub_23 = term_21.sub(1).ref();
				/* #keys=sub *//*Contract*/sink.properties(safeRef(props_52));
				sink.start(_M_OutputFuncDeclaration);
				sink.start(_M_UnFUNCSORT);
				sink.start(_M__s);
				sink.properties(safeRef(props_52));
				sink.start(_M_Builtin_sGet);
				sink.end();
				sink.copy(sub_168.ref());
				sink.end();
				sink.end();
				sink.copy(sub_23.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_OutputFuncDeclarations, props_52, term_21);
	}

	final public static boolean _M_OutputDataDeclarationsForKey(Sink sink, int shared, int depth, Properties props_10, Term term_5, Term term_71)
	{
		if (depth < 2000)
		{
			label_59 :
			{
				if (term_5.descriptor() != _M__sNil)
				{
					break label_59;
				}
				/* #keys=term *//*Contract*/sink.properties(safeRef(props_10));
				sink.start(_M_OutputDataDeclarations);
				sink.copy(term_71.ref());
				sink.end();
				return true;
			}
			label_27 :
			{
				if (term_5.descriptor() != _M__sCons)
				{
					break label_27;
				}
				Term sub_2 = term_5.sub(0).ref();
				if (sub_2.descriptor() != _M_QSORT)
				{
					break label_27;
				}
				Term sub_62 = sub_2.sub(0).ref();
				/* #qualifier=sub */Term sub_64 = sub_2.sub(1).ref();
				/* #sort=sub */Term sub_67 = term_5.sub(1).ref();
				/* #qsorts=sub */
				/* #keys=term *//*Contract*/
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xdeclarations_xS1);
				sink.literal(";");
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xdeclaration_xA4);
				sink.copy(sub_64.ref());
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				sink.start(_M_OutputDataDeclarationsForKey);
				sink.copy(sub_67.ref());
				sink.copy(term_71.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_OutputDataDeclarationsForKey, props_10, term_5, term_71);
	}

	final public static boolean _M_OutputDataDeclarations(Sink sink, int shared, int depth, Properties props_98, Term term_81)
	{
		if (depth < 2000)
		{
			label_73 :
			{
				Term value_5 = props_98 == null ? null : props_98.lookup("$funckeys");
				if (value_5 == null)
				{
					break label_73;
				}
				if (value_5.descriptor() != _M_KEYS)
				{
					break label_73;
				}
				Term sub_92 = value_5.sub(0).ref();
				/* #keys=sub */
				if (term_81.descriptor() != _M__sNil)
				{
					break label_73;
				}/*Contract*/
				sink.properties(safeRef(props_98));
				sink.start(_M_OutputFuncDeclarations);
				sink.copy(sub_92.ref());
				sink.end();
				return true;
			}
			label_46 :
			{
				if (term_81.descriptor() != _M__sCons)
				{
					break label_46;
				}
				Term sub_95 = term_81.sub(0).ref();
				/* #key=sub */Term sub_12 = term_81.sub(1).ref();
				/* #keys=sub *//*Contract*/sink.properties(safeRef(props_98));
				sink.start(_M_OutputDataDeclarationsForKey);
				sink.start(_M_UnDATASORT);
				sink.start(_M__s);
				sink.properties(safeRef(props_98));
				sink.start(_M_Builtin_sGet);
				sink.end();
				sink.copy(sub_95.ref());
				sink.end();
				sink.end();
				sink.copy(sub_12.ref());
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_OutputDataDeclarations, props_98, term_81);
	}

	final public static boolean _M_OutputImportGrammarDeclarations(Sink sink, int shared, int depth, Properties props_89, Term term_149)
	{
		if (depth < 2000)
		{
			label_80 :
			{
				Term value_41 = props_89 == null ? null : props_89.lookup("$datakeys");
				if (value_41 == null)
				{
					break label_80;
				}
				if (value_41.descriptor() != _M_KEYS)
				{
					break label_80;
				}
				Term sub_53 = value_41.sub(0).ref();
				/* #keys=sub */
				if (term_149.descriptor() != _M__sNil)
				{
					break label_80;
				}/*Contract*/
				sink.properties(safeRef(props_89));
				sink.start(_M_OutputDataDeclarations);
				sink.copy(sub_53.ref());
				sink.end();
				return true;
			}
			label_125 :
			{
				if (term_149.descriptor() != _M__sCons)
				{
					break label_125;
				}
				Term sub_31 = term_149.sub(0).ref();
				/* #import=sub */Term sub_81 = term_149.sub(1).ref();
				/* #imports=sub *//*Contract*/
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xdeclarations_xS1);
				sink.literal(";");
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xdeclaration_xA2);
				sink.start(_M_Crsx_ximportDeclaration_xA3);
				sink.literal("import");
				sink.literal("grammar");
				sink.start(_M_Crsx_xconstructor_xA1);
				sink.start(_M_Crsx_xqualifier_xA2);
				sink.end();
				sink.copy(sub_31.ref());
				sink.end();
				sink.end();
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				sink.start(_M_OutputImportGrammarDeclarations);
				sink.copy(sub_81.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_OutputImportGrammarDeclarations, props_89, term_149);
	}

	final public static boolean _M_OutputImportDeclarations(Sink sink, int shared, int depth, Properties props_73, Term term_82)
	{
		if (depth < 2000)
		{
			label_50 :
			{
				Term value_90 = props_73 == null ? null : props_73.lookup("$grammars");
				if (value_90 == null)
				{
					break label_50;
				}
				if (value_90.descriptor() != _M_IMPORTS)
				{
					break label_50;
				}
				Term sub_42 = value_90.sub(0).ref();
				/* #imported=sub */
				if (term_82.descriptor() != _M__sNil)
				{
					break label_50;
				}/*Contract*/
				sink.properties(safeRef(props_73));
				sink.start(_M_OutputImportGrammarDeclarations);
				sink.copy(sub_42.ref());
				sink.end();
				return true;
			}
			label_8 :
			{
				if (term_82.descriptor() != _M__sCons)
				{
					break label_8;
				}
				Term sub_89 = term_82.sub(0).ref();
				/* #import=sub */Term sub_86 = term_82.sub(1).ref();
				/* #imports=sub *//*Contract*/
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xdeclarations_xS1);
				sink.literal(";");
				sink.start(_M__sCons);
				sink.start(_M_Crsx_xdeclaration_xA2);
				sink.start(_M_Crsx_ximportDeclaration_xA2);
				sink.literal("import");
				sink.literal("module");
				sink.start(_M_Crsx_xconstructor_xA1);
				sink.start(_M_Crsx_xqualifier_xA2);
				sink.end();
				sink.copy(sub_89.ref());
				sink.end();
				sink.end();
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				sink.start(_M_OutputImportDeclarations);
				sink.copy(sub_86.ref());
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_OutputImportDeclarations, props_73, term_82);
	}

	final public static boolean _M_OutputCrsx(Sink sink, int shared, int depth, Properties props_64, Term term_37)
	{
		if (depth < 2000)
		{
			label_54 :
			{
				Term value_16 = props_64 == null ? null : props_64.lookup("$imported");
				if (value_16 == null)
				{
					break label_54;
				}
				if (value_16.descriptor() != _M_IMPORTS)
				{
					break label_54;
				}
				Term sub_52 = value_16.sub(0).ref();
				/* #imported=sub */
				if (term_37.descriptor() != _M_OK)
				{
					break label_54;
				}/*Contract*/
				sink.start(_M_Crsx_xcrsx);
				sink.start(_M_Crsx_xdeclarations);
				sink.start(_M_Crsx_xdeclaration_xA5);
				sink.start(_M_Crsx_xdirective_xA1);
				sink.start(_M_Crsx_xconstructor_xA1);
				sink.start(_M_Crsx_xqualifier_xA2);
				sink.end();
				sink.literal("$Lax");
				sink.end();
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				sink.properties(safeRef(props_64));
				sink.start(_M_OutputImportDeclarations);
				sink.copy(sub_52.ref());
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_OutputCrsx, props_64, term_37);
	}

	final public static boolean _M_AddFuncSort2(Sink sink, int shared, int depth, Properties props_80, Term term_67, Term term_19, Term term_147, Variable var, Term term_78)
	{
		if (depth < 2000)
		{
			label_68 :
			{
				if (term_67.descriptor() != _M_FUNCSORT)
				{
					break label_68;
				}
				Term sub_293 = term_67.sub(0).ref();
				/* #qualifier=sub */Term sub_28 = term_67.sub(1).ref();
				/* #sort=sub */
				/* #key=term */
				if (term_147.descriptor() != _M_Crsx_xsortDeclaration_xA2)
				{
					break label_68;
				}
				Term sub_9 = term_147.sub(0).ref();
				/* #sortparams?=sub */Term sub_109 = term_147.sub(1).ref();
				/* #sortset=sub */Term sub_48 = term_147.sub(2).ref();
				if (sub_48.descriptor() != _M_Crsx_xform_xA1)
				{
					break label_68;
				}
				Term sub_47 = sub_48.sub(0).ref();
				/* #constructor=sub */Term sub_32 = sub_48.sub(1).ref();
				/* #arguments?=sub */Term sub_35 = term_147.sub(3).ref();
				Term sub_6 = term_147.sub(4).ref();
				/* #sortname=sub */
				/* #=term *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.start(_M__s);
				sink.start(_M_Builtin_sColon);
				sink.end();
				sink.literal("Function sort already defined:");
				sink.start(_M_ConstructorToString);
				sink.copy(sub_47.ref());
				sink.end();
				sink.end();
				sink.end();
				return true;
			}
			label_45 :
			{
				Term value_45 = props_80 == null ? null : props_80.lookup("$funckeys");
				if (value_45 == null)
				{
					break label_45;
				}
				if (value_45.descriptor() != _M_KEYS)
				{
					break label_45;
				}
				Term sub_25 = value_45.sub(0).ref();
				/* #keys=sub */
				Term value_42 = props_80 == null ? null : props_80.lookup("$qualifier");
				if (value_42 == null)
				{
					break label_45;
				}
				if (value_42.descriptor() != _M_STR)
				{
					break label_45;
				}
				Term sub_54 = value_42.sub(0).ref();
				/* #qualifier=sub */
				if (term_67.descriptor() != _M_NOCONTENTENTRY)
				{
					break label_45;
				}
				/* #key=term */
				/* #sortDeclaration=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_80));
				Term term_86;
				{
					BufferSink buf = sink.context().makeBuffer();
					buf.start(_M_FUNCSORT);
					buf.copy(sub_54.ref());
					buf.copy(term_147.ref());
					buf.end();
					term_86 = buf.term();
				}
				term_19 = force(sink.context(), term_19);
				Sink.property(sink, term_19, term_86);
				Term term_99;
				{
					BufferSink buf_22 = sink.context().makeBuffer();
					buf_22.start(_M_KEYS);
					buf_22.start(_M__sCons);
					buf_22.copy(term_19.ref());
					buf_22.copy(sub_25.ref());
					buf_22.end();
					buf_22.end();
					term_99 = buf_22.term();
				}
				sink.propertyNamed("$funckeys", term_99);
				Term term_90;
				{
					BufferSink buf_21 = sink.context().makeBuffer();
					buf_21.start(_M_OK);
					buf_21.end();
					term_90 = buf_21.term();
				}
				sink.substitute(term_78.ref(), new Variable[]
					{var}, new Term[]
					{term_90});
				return true;
			}
		}
		return thunk(sink, _M_AddFuncSort2, props_80, term_67, term_19, term_147, var, term_78);
	}

	final public static boolean _M_AddFuncSort1(Sink sink, int shared, int depth, Properties props_63, Term term_35, Term term_72, Variable var_39, Term term_20)
	{
		if (depth < 2000)
		{
			label_19 :
			{
				/* #key=term */
				/* #sortDeclaration=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_63));
				sink.start(_M_AddFuncSort2);
				sink.start(_M__s);
				sink.properties(safeRef(props_63));
				sink.start(_M_Builtin_sGet);
				sink.end();
				sink.copy(term_35.ref());
				sink.start(_M_NOCONTENTENTRY);
				sink.end();
				sink.end();
				sink.copy(term_35.ref());
				sink.copy(term_72.ref());
				Variable var_94 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_94});
				VariableUse use = sink.context().makeVariableUse(var_94);
				sink.substitute(term_20.ref(), new Variable[]
					{var_39}, new Term[]
					{use});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_AddFuncSort1, props_63, term_35, term_72, var_39, term_20);
	}

	final public static boolean _M_AddFuncSort(Sink sink, int shared, int depth, Properties props_82, Term term_88, Variable var_80, Term term_175)
	{
		if (depth < 2000)
		{
			label_84 :
			{
				if (term_88.descriptor() != _M_Crsx_xsortDeclaration_xA2)
				{
					break label_84;
				}
				Term sub_66 = term_88.sub(0).ref();
				/* #sortparams?=sub */Term sub_17 = term_88.sub(1).ref();
				/* #sortset=sub */Term sub_100 = term_88.sub(2).ref();
				if (sub_100.descriptor() != _M_Crsx_xform_xA1)
				{
					break label_84;
				}
				Term sub_30 = sub_100.sub(0).ref();
				/* #constructor=sub */Term sub_88 = sub_100.sub(1).ref();
				/* #arguments?=sub */Term sub_45 = term_88.sub(3).ref();
				Term sub_22 = term_88.sub(4).ref();
				/* #sortname=sub */
				/* #=term *//*Contract*/sink.properties(safeRef(props_82));
				sink.start(_M_AddFuncSort1);
				sink.start(_M_FuncSortKey);
				sink.copy(sub_30.ref());
				sink.end();
				sink.start(_M_Crsx_xsortDeclaration_xA2);
				sink.copy(sub_66.ref());
				sink.copy(sub_17.ref());
				sink.start(_M_Crsx_xform_xA1);
				sink.copy(sub_30.ref());
				sink.copy(sub_88.ref());
				sink.end();
				sink.literal("::");
				sink.copy(sub_22.ref());
				sink.end();
				Variable var_5 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_5});
				VariableUse use_29 = sink.context().makeVariableUse(var_5);
				sink.substitute(term_175.ref(), new Variable[]
					{var_80}, new Term[]
					{use_29});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_AddFuncSort, props_82, term_88, var_80, term_175);
	}

	final public static boolean _M_AddDataForm2(Sink sink, int shared, int depth, Properties props_34, Term term_97, Term term_22, Term term_285, Term term_42, Term term_13, Term term_8)
	{
		if (depth < 2000)
		{
			label_52 :
			{
				if (term_97.descriptor() != _M_DATASORT)
				{
					break label_52;
				}
				Term sub_49 = term_97.sub(0).ref();
				/* #sort=sub */
				/* #key=term */
				if (term_285.descriptor() != _M_Crsx_xconstructor_xA1)
				{
					break label_52;
				}
				Term sub_18 = term_285.sub(0).ref();
				if (sub_18.descriptor() != _M_Crsx_xqualifier_xA2)
				{
					break label_52;
				}
				Term sub_72 = term_285.sub(1).ref();
				/* #CONSTRUCTOR1=sub */
				if (term_42.descriptor() != _M_Crsx_xsortname_xA1)
				{
					break label_52;
				}
				Term sub_7 = term_42.sub(0).ref();
				if (sub_7.descriptor() != _M_Crsx_xconstructor_xA1)
				{
					break label_52;
				}
				Term sub_38 = sub_7.sub(0).ref();
				if (sub_38.descriptor() != _M_Crsx_xqualifier_xA2)
				{
					break label_52;
				}
				Term sub_59 = sub_7.sub(1).ref();
				/* #CONSTRUCTOR2=sub */Term sub_3 = term_42.sub(1).ref();
				/* #sortarguments?=sub */
				/* #sortdecl=term */
				/* #CONTINUATION=term *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sError);
				sink.end();
				sink.start(_M__s);
				sink.start(_M_Builtin_sColon);
				sink.end();
				sink.literal("Error: duplicate data form ");
				sink.copy(sub_72.ref());
				sink.literal(" found in sort ");
				sink.copy(sub_59.ref());
				sink.literal(".");
				sink.end();
				sink.end();
				return true;
			}
			label_38 :
			{
				Term value_27 = props_34 == null ? null : props_34.lookup("$qualifier");
				if (value_27 == null)
				{
					break label_38;
				}
				if (value_27.descriptor() != _M_STR)
				{
					break label_38;
				}
				Term sub_21 = value_27.sub(0).ref();
				/* #qualifier=sub */
				if (term_97.descriptor() != _M_NOCONTENTENTRY)
				{
					break label_38;
				}
				/* #key=term */
				/* #constructor=term */
				/* #sortname=term */
				/* #sortdecl=term */
				if (term_8.descriptor() != _M_CONTINUATION)
				{
					break label_38;
				}
				Term sub_20 = term_8.sub(0).ref();
				Variable binder = term_8.binders(0)[0];
				/* #=sub *//*Contract*/sink.properties(safeRef(props_34));
				Term term_23;
				{
					BufferSink buf_24 = sink.context().makeBuffer();
					buf_24.start(_M_DATASORT);
					buf_24.start(_M__sCons);
					buf_24.start(_M_QSORT);
					buf_24.copy(sub_21.ref());
					buf_24.copy(term_13.ref());
					buf_24.end();
					buf_24.start(_M__sNil);
					buf_24.end();
					buf_24.end();
					buf_24.end();
					term_23 = buf_24.term();
				}
				term_22 = force(sink.context(), term_22);
				Sink.property(sink, term_22, term_23);
				Term term_61;
				{
					BufferSink buf_48 = sink.context().makeBuffer();
					buf_48.start(_M_OK);
					buf_48.end();
					term_61 = buf_48.term();
				}
				sink.substitute(sub_20.ref(), new Variable[]
					{binder}, new Term[]
					{term_61});
				return true;
			}
		}
		return thunk(sink, _M_AddDataForm2, props_34, term_97, term_22, term_285, term_42, term_13, term_8);
	}

	final public static boolean _M_AddDataForm1(Sink sink, int shared, int depth, Properties props_1, Term term_94, Term term_96, Term term_91, Term term_16, Term term_15)
	{
		if (depth < 2000)
		{
			sink.properties(safeRef(props_1));
			sink.start(_M_AddDataForm2);
			sink.start(_M__s);
			sink.properties(safeRef(props_1));
			sink.start(_M_Builtin_sGet);
			sink.end();
			sink.copy(term_94.ref());
			sink.start(_M_NOCONTENTENTRY);
			sink.end();
			sink.end();
			sink.copy(term_94.ref());
			sink.copy(term_96.ref());
			sink.copy(term_91.ref());
			sink.copy(term_16.ref());
			sink.copy(term_15.ref());
			sink.end();
			return true;
		}
		return thunk(sink, _M_AddDataForm1, props_1, term_94, term_96, term_91, term_16, term_15);
	}

	final public static boolean _M_AddDataForm(Sink sink, int shared, int depth, Properties props_76, Term term_89, Term term_1, Term term_7, Term term_0)
	{
		if (depth < 2000)
		{
			label_65 :
			{
				if (term_89.descriptor() != _M_Crsx_xforms_xS1)
				{
					break label_65;
				}
				Term sub_1 = term_89.sub(0).ref();
				if (sub_1.descriptor() != _M_Crsx_xform_xA1)
				{
					break label_65;
				}
				Term sub_68 = sub_1.sub(0).ref();
				/* #constructor=sub */Term sub_14 = sub_1.sub(1).ref();
				/* #arguments?=sub */Term sub_16 = term_89.sub(1).ref();
				/* #sortname=term */
				/* #sortdecl=term */
				/* #CONTINUATION=term *//*Contract*/sink.properties(safeRef(props_76));
				sink.start(_M_AddDataForm1);
				sink.start(_M_DataFormKey);
				sink.copy(sub_68.ref());
				sink.end();
				sink.copy(sub_68.ref());
				sink.copy(term_1.ref());
				sink.copy(term_7.ref());
				sink.copy(term_0.ref());
				sink.end();
				return true;
			}
			label_6 :
			{
				if (term_89.descriptor() != _M_Crsx_xforms_xS1)
				{
					break label_6;
				}
				Term sub_63 = term_89.sub(0).ref();
				if (sub_63.descriptor() != _M_Crsx_xform_xA2)
				{
					break label_6;
				}
				Term sub_82 = sub_63.sub(0).ref();
				/* #variable=sub */Term sub_8 = term_89.sub(1).ref();
				/* #sortname=term */
				/* #sortdecl=term */
				if (term_0.descriptor() != _M_CONTINUATION)
				{
					break label_6;
				}
				Term sub_120 = term_0.sub(0).ref();
				Variable binder_45 = term_0.binders(0)[0];
				/* #=sub *//*Contract*/sink.properties(safeRef(props_76));
				Term term_62;
				{
					BufferSink buf_96 = sink.context().makeBuffer();
					buf_96.start(_M_OK);
					buf_96.end();
					term_62 = buf_96.term();
				}
				sink.substitute(sub_120.ref(), new Variable[]
					{binder_45}, new Term[]
					{term_62});
				return true;
			}
		}
		return thunk(sink, _M_AddDataForm, props_76, term_89, term_1, term_7, term_0);
	}

	final public static boolean _M_AddDataSort3(Sink sink, int shared, int depth, Properties props_58, Term term_50, Term term_3, Term term_181, Variable var_16, Term term_27)
	{
		if (depth < 2000)
		{
			label_5 :
			{
				Term value_37 = props_58 == null ? null : props_58.lookup("$qualifier");
				if (value_37 == null)
				{
					break label_5;
				}
				if (value_37.descriptor() != _M_STR)
				{
					break label_5;
				}
				Term sub_44 = value_37.sub(0).ref();
				/* #qualifier=sub */
				if (term_50.descriptor() != _M_DATASORT)
				{
					break label_5;
				}
				Term sub_176 = term_50.sub(0).ref();
				/* #sorts=sub */
				/* #key=term */
				/* #sortDeclaration=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_58));
				Term term_111;
				{
					BufferSink buf_8 = sink.context().makeBuffer();
					buf_8.start(_M_DATASORT);
					buf_8.start(_M__sCons);
					buf_8.start(_M_QSORT);
					buf_8.copy(sub_44.ref());
					buf_8.copy(term_181.ref());
					buf_8.end();
					buf_8.copy(sub_176.ref());
					buf_8.end();
					buf_8.end();
					term_111 = buf_8.term();
				}
				term_3 = force(sink.context(), term_3);
				Sink.property(sink, term_3, term_111);
				Term term_24;
				{
					BufferSink buf_68 = sink.context().makeBuffer();
					buf_68.start(_M_OK);
					buf_68.end();
					term_24 = buf_68.term();
				}
				sink.substitute(term_27.ref(), new Variable[]
					{var_16}, new Term[]
					{term_24});
				return true;
			}
			label_13 :
			{
				Term value_96 = props_58 == null ? null : props_58.lookup("$datakeys");
				if (value_96 == null)
				{
					break label_13;
				}
				if (value_96.descriptor() != _M_KEYS)
				{
					break label_13;
				}
				Term sub_127 = value_96.sub(0).ref();
				/* #keys=sub */
				Term value_35 = props_58 == null ? null : props_58.lookup("$qualifier");
				if (value_35 == null)
				{
					break label_13;
				}
				if (value_35.descriptor() != _M_STR)
				{
					break label_13;
				}
				Term sub_29 = value_35.sub(0).ref();
				/* #qualifier=sub */
				if (term_50.descriptor() != _M_NOCONTENTENTRY)
				{
					break label_13;
				}
				/* #key=term */
				/* #sortDeclaration=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_58));
				Term term_36;
				{
					BufferSink buf_32 = sink.context().makeBuffer();
					buf_32.start(_M_DATASORT);
					buf_32.start(_M__sCons);
					buf_32.start(_M_QSORT);
					buf_32.copy(sub_29.ref());
					buf_32.copy(term_181.ref());
					buf_32.end();
					buf_32.start(_M__sNil);
					buf_32.end();
					buf_32.end();
					buf_32.end();
					term_36 = buf_32.term();
				}
				term_3 = force(sink.context(), term_3);
				Sink.property(sink, term_3, term_36);
				Term term_28;
				{
					BufferSink buf_60 = sink.context().makeBuffer();
					buf_60.start(_M_KEYS);
					buf_60.start(_M__sCons);
					buf_60.copy(term_3.ref());
					buf_60.copy(sub_127.ref());
					buf_60.end();
					buf_60.end();
					term_28 = buf_60.term();
				}
				sink.propertyNamed("$datakeys", term_28);
				Term term_40;
				{
					BufferSink buf_5 = sink.context().makeBuffer();
					buf_5.start(_M_OK);
					buf_5.end();
					term_40 = buf_5.term();
				}
				sink.substitute(term_27.ref(), new Variable[]
					{var_16}, new Term[]
					{term_40});
				return true;
			}
		}
		return thunk(sink, _M_AddDataSort3, props_58, term_50, term_3, term_181, var_16, term_27);
	}

	final public static boolean _M_AddDataSort2(Sink sink, int shared, int depth, Properties props_21, Term term_43, Term term_58, Variable var_67, Term term_143)
	{
		if (depth < 2000)
		{
			label_74 :
			{
				/* #key=term */
				/* #sortDeclaration=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_21));
				sink.start(_M_AddDataSort3);
				sink.start(_M__s);
				sink.properties(safeRef(props_21));
				sink.start(_M_Builtin_sGet);
				sink.end();
				sink.copy(term_43.ref());
				sink.start(_M_NOCONTENTENTRY);
				sink.end();
				sink.end();
				sink.copy(term_43.ref());
				sink.copy(term_58.ref());
				Variable var_69 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_69});
				VariableUse use_63 = sink.context().makeVariableUse(var_69);
				sink.substitute(term_143.ref(), new Variable[]
					{var_67}, new Term[]
					{use_63});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_AddDataSort2, props_21, term_43, term_58, var_67, term_143);
	}

	final public static boolean _M_AddDataSort1(Sink sink, int shared, int depth, Properties props_27, Term term_95, Term term_158, Variable var_15, Term term_196)
	{
		if (depth < 2000)
		{
			label_57 :
			{
				/* #key=term */
				/* #sortDeclaration=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_27));
				sink.start(_M_AddDataSort2);
				sink.copy(term_95.ref());
				sink.copy(term_158.ref());
				Variable var_78 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_78});
				VariableUse use_49 = sink.context().makeVariableUse(var_78);
				sink.substitute(term_196.ref(), new Variable[]
					{var_15}, new Term[]
					{use_49});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_AddDataSort1, props_27, term_95, term_158, var_15, term_196);
	}

	final public static boolean _M_AddDataSort(Sink sink, int shared, int depth, Properties props_38, Term term_260, Variable var_75, Term term_33)
	{
		if (depth < 2000)
		{
			label_39 :
			{
				if (term_260.descriptor() != _M_Crsx_xsortDeclaration_xA1)
				{
					break label_39;
				}
				Term sub_61 = term_260.sub(0).ref();
				/* #sortparams?=sub */Term sub_143 = term_260.sub(1).ref();
				/* #sortset=sub */Term sub_43 = term_260.sub(2).ref();
				/* #sortname=sub */Term sub_78 = term_260.sub(3).ref();
				Term sub_151 = term_260.sub(4).ref();
				Term sub_51 = term_260.sub(5).ref();
				if (sub_51.descriptor() != _M_Crsx_xforms)
				{
					break label_39;
				}
				Term sub_259 = sub_51.sub(0).ref();
				/* #forms_S1*=sub */Term sub_121 = term_260.sub(6).ref();
				/* #=term *//*Contract*/sink.properties(safeRef(props_38));
				sink.start(_M_AddDataSort1);
				sink.start(_M_DataSortKey);
				sink.copy(sub_43.ref());
				sink.end();
				sink.start(_M_Crsx_xsortDeclaration_xA1);
				sink.copy(sub_61.ref());
				sink.copy(sub_143.ref());
				sink.copy(sub_43.ref());
				sink.literal("::=");
				sink.literal("(");
				sink.start(_M_Crsx_xforms);
				sink.copy(sub_259.ref());
				sink.end();
				sink.literal(")");
				sink.end();
				Variable var_96 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_96});
				sink.start(_M_SeqMap);
				Variable var_87 = sink.context().makeVariable("form");
				Variable var_61 = sink.context().makeVariable("cont");
				sink.binds(new Variable[]
					{var_87, var_61});
				sink.start(_M_AddDataForm);
				sink.use(var_87);
				sink.copy(sub_43.ref());
				sink.start(_M_Crsx_xsortDeclaration_xA1);
				sink.copy(sub_61.ref());
				sink.copy(sub_143.ref());
				sink.copy(sub_43.ref());
				sink.literal("::=");
				sink.literal("(");
				sink.start(_M_Crsx_xforms);
				sink.copy(sub_259.ref());
				sink.end();
				sink.literal(")");
				sink.end();
				sink.use(var_61);
				sink.end();
				sink.copy(sub_259.ref());
				Variable var_66 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_66});
				VariableUse use_61 = sink.context().makeVariableUse(var_66);
				sink.substitute(term_33.ref(), new Variable[]
					{var_75}, new Term[]
					{use_61});
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_AddDataSort, props_38, term_260, var_75, term_33);
	}

	final public static boolean _M_AddRule3(Sink sink, int shared, int depth, Properties props_53, Term term_160, Term term_84, Term term_74, Variable var_25, Term term_48)
	{
		if (depth < 2000)
		{
			label_51 :
			{
				if (term_160.descriptor() != _M_RULES)
				{
					break label_51;
				}
				Term sub_129 = term_160.sub(0).ref();
				/* #rules=sub */
				/* #key=term */
				/* #ruleDeclaration=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_53));
				Term term_46;
				{
					BufferSink buf_40 = sink.context().makeBuffer();
					buf_40.start(_M_RULES);
					buf_40.start(_M_Concat);
					buf_40.copy(sub_129.ref());
					buf_40.start(_M__sCons);
					buf_40.copy(term_74.ref());
					buf_40.start(_M__sNil);
					buf_40.end();
					buf_40.end();
					buf_40.end();
					buf_40.end();
					term_46 = buf_40.term();
				}
				term_84 = force(sink.context(), term_84);
				Sink.property(sink, term_84, term_46);
				Term term_130;
				{
					BufferSink buf_78 = sink.context().makeBuffer();
					buf_78.start(_M_OK);
					buf_78.end();
					term_130 = buf_78.term();
				}
				sink.substitute(term_48.ref(), new Variable[]
					{var_25}, new Term[]
					{term_130});
				return true;
			}
			label_67 :
			{
				Term value_34 = props_53 == null ? null : props_53.lookup("$rulekeys");
				if (value_34 == null)
				{
					break label_67;
				}
				if (value_34.descriptor() != _M_KEYS)
				{
					break label_67;
				}
				Term sub_80 = value_34.sub(0).ref();
				/* #keys=sub */
				if (term_160.descriptor() != _M_NOCONTENTENTRY)
				{
					break label_67;
				}
				/* #key=term */
				/* #ruleDeclaration=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_53));
				Term term_75;
				{
					BufferSink buf_49 = sink.context().makeBuffer();
					buf_49.start(_M_RULES);
					buf_49.start(_M__sCons);
					buf_49.copy(term_74.ref());
					buf_49.start(_M__sNil);
					buf_49.end();
					buf_49.end();
					buf_49.end();
					term_75 = buf_49.term();
				}
				term_84 = force(sink.context(), term_84);
				Sink.property(sink, term_84, term_75);
				Term term_69;
				{
					BufferSink buf_58 = sink.context().makeBuffer();
					buf_58.start(_M_KEYS);
					buf_58.start(_M__sCons);
					buf_58.copy(term_84.ref());
					buf_58.copy(sub_80.ref());
					buf_58.end();
					buf_58.end();
					term_69 = buf_58.term();
				}
				sink.propertyNamed("$rulekeys", term_69);
				Term term_68;
				{
					BufferSink buf_133 = sink.context().makeBuffer();
					buf_133.start(_M_OK);
					buf_133.end();
					term_68 = buf_133.term();
				}
				sink.substitute(term_48.ref(), new Variable[]
					{var_25}, new Term[]
					{term_68});
				return true;
			}
		}
		return thunk(sink, _M_AddRule3, props_53, term_160, term_84, term_74, var_25, term_48);
	}

	final public static boolean _M_AddRule2(Sink sink, int shared, int depth, Properties props_51, Term term_98, Term term_38, Variable var_246, Term term_128)
	{
		if (depth < 2000)
		{
			label_92 :
			{
				/* #key=term */
				/* #ruleDeclaration=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_51));
				sink.start(_M_AddRule3);
				sink.start(_M__s);
				sink.properties(safeRef(props_51));
				sink.start(_M_Builtin_sGet);
				sink.end();
				sink.copy(term_98.ref());
				sink.start(_M_NOCONTENTENTRY);
				sink.end();
				sink.end();
				sink.copy(term_98.ref());
				sink.copy(term_38.ref());
				Variable var_91 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_91});
				VariableUse use_13 = sink.context().makeVariableUse(var_91);
				sink.substitute(term_128.ref(), new Variable[]
					{var_246}, new Term[]
					{use_13});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_AddRule2, props_51, term_98, term_38, var_246, term_128);
	}

	final public static boolean _M_AddRule(Sink sink, int shared, int depth, Properties props_31, Term term_133, Term term_12, Variable var_8, Term term_134)
	{
		if (depth < 2000)
		{
			label_29 :
			{
				/* #key=term */
				/* #ruleDeclaration=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_31));
				sink.start(_M_AddRule2);
				sink.copy(term_133.ref());
				sink.copy(term_12.ref());
				Variable var_1 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_1});
				VariableUse use_4 = sink.context().makeVariableUse(var_1);
				sink.substitute(term_134.ref(), new Variable[]
					{var_8}, new Term[]
					{use_4});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_AddRule, props_31, term_133, term_12, var_8, term_134);
	}

	final public static boolean _M_LookupSortByConstructor1(Sink sink, int shared, int depth, Term term_187, Term term_39)
	{
		if (depth < 2000)
		{
			label_64 :
			{
				if (term_187.descriptor() != _M_SOME)
				{
					break label_64;
				}
				Term sub_84 = term_187.sub(0).ref();
				/* #1=sub */
				/* #2=term *//*Contract*/
				sink.start(_M_SOME);
				sink.copy(sub_84.ref());
				sink.end();
				return true;
			}
			label_102 :
			{
				if (term_187.descriptor() != _M_NONE)
				{
					break label_102;
				}
				/* #2=term *//*Contract*/sink.copy(term_39.ref());
				return true;
			}
		}
		return thunk(sink, _M_LookupSortByConstructor1, term_187, term_39);
	}

	final public static boolean _M_LookupSortByConstructor(Sink sink, int shared, int depth, Properties props_37, Term term_102)
	{
		if (depth < 2000)
		{
			sink.start(_M_LookupSortByConstructor1);
			sink.properties(safeRef(props_37));
			sink.start(_M_Get);
			sink.start(_M_FuncSortKey);
			sink.copy(term_102.ref());
			sink.end();
			sink.end();
			sink.properties(safeRef(props_37));
			sink.start(_M_Get);
			sink.start(_M_DataFormKey);
			sink.copy(term_102.ref());
			sink.end();
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_LookupSortByConstructor, props_37, term_102);
	}

	final public static boolean _M_LookupModule(Sink sink, int shared, int depth, Properties props_134, Term term_156)
	{
		if (depth < 2000)
		{
			sink.properties(safeRef(props_134));
			sink.start(_M_Get);
			sink.start(_M_ModuleKey);
			sink.copy(term_156.ref());
			sink.end();
			sink.end();
			return true;
		}
		return thunk(sink, _M_LookupModule, props_134, term_156);
	}

	final public static boolean _M_ConstructorToString(Sink sink, int shared, int depth, Term term_73)
	{
		if (depth < 2000)
		{
			label_85 :
			{
				if (term_73.descriptor() != _M_Crsx_xconstructor_xA1)
				{
					break label_85;
				}
				Term sub_87 = term_73.sub(0).ref();
				if (sub_87.descriptor() != _M_Crsx_xqualifier_xA2)
				{
					break label_85;
				}
				Term sub_248 = term_73.sub(1).ref();
				/* #CONSTRUCTOR=sub *//*Contract*/sink.copy(sub_248.ref());
				return true;
			}
			label_24 :
			{
				if (term_73.descriptor() != _M_Crsx_xconstructor_xA2)
				{
					break label_24;
				}
				Term sub_220 = term_73.sub(0).ref();
				if (sub_220.descriptor() != _M_Crsx_xreserved_xA1)
				{
					break label_24;
				}
				Term sub_39 = sub_220.sub(0).ref();/*Contract*/
				sink.literal(":");
				return true;
			}
		}
		return thunk(sink, _M_ConstructorToString, term_73);
	}

	final public static boolean _M_SortnameToString(Sink sink, int shared, int depth, Term term_93)
	{
		if (depth < 2000)
		{
			label_53 :
			{
				if (term_93.descriptor() != _M_Crsx_xsortname_xA1)
				{
					break label_53;
				}
				Term sub_177 = term_93.sub(0).ref();
				if (sub_177.descriptor() != _M_Crsx_xconstructor_xA1)
				{
					break label_53;
				}
				Term sub_57 = sub_177.sub(0).ref();
				if (sub_57.descriptor() != _M_Crsx_xqualifier_xA2)
				{
					break label_53;
				}
				Term sub_278 = sub_177.sub(1).ref();
				/* #CONSTRUCTOR=sub */Term sub_130 = term_93.sub(1).ref();
				/* #sortarguments?=sub *//*Contract*/sink.copy(sub_278.ref());
				return true;
			}
			label_40 :
			{
				if (term_93.descriptor() != _M_Crsx_xsortname_xA1)
				{
					break label_40;
				}
				Term sub_93 = term_93.sub(0).ref();
				if (sub_93.descriptor() != _M_Crsx_xconstructor_xA2)
				{
					break label_40;
				}
				Term sub_24 = sub_93.sub(0).ref();
				if (sub_24.descriptor() != _M_Crsx_xreserved_xA1)
				{
					break label_40;
				}
				Term sub_91 = sub_24.sub(0).ref();
				Term sub_110 = term_93.sub(1).ref();
				/* #sortarguments?=sub *//*Contract*/sink.literal(":");
				return true;
			}
		}
		return thunk(sink, _M_SortnameToString, term_93);
	}

	final public static boolean _M_FuncSortKey(Sink sink, int shared, int depth, Term term_92)
	{
		if (depth < 2000)
		{
			label_217 :
			{
				if (term_92.descriptor() != _M_Crsx_xconstructor_xA1)
				{
					break label_217;
				}
				Term sub_99 = term_92.sub(0).ref();
				if (sub_99.descriptor() != _M_Crsx_xqualifier_xA2)
				{
					break label_217;
				}
				Term sub_154 = term_92.sub(1).ref();
				/* #CONSTRUCTOR=sub *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sColon);
				sink.end();
				sink.literal("$func$");
				sink.copy(sub_154.ref());
				sink.end();
				return true;
			}
			label_86 :
			{
				if (term_92.descriptor() != _M_Crsx_xconstructor_xA2)
				{
					break label_86;
				}
				Term sub_295 = term_92.sub(0).ref();
				if (sub_295.descriptor() != _M_Crsx_xreserved_xA1)
				{
					break label_86;
				}
				Term sub_98 = sub_295.sub(0).ref();/*Contract*/
				sink.literal("$func$:");
				return true;
			}
		}
		return thunk(sink, _M_FuncSortKey, term_92);
	}

	final public static boolean _M_DataFormKey(Sink sink, int shared, int depth, Term term_59)
	{
		if (depth < 2000)
		{
			label_32 :
			{
				if (term_59.descriptor() != _M_Crsx_xconstructor_xA1)
				{
					break label_32;
				}
				Term sub_65 = term_59.sub(0).ref();
				if (sub_65.descriptor() != _M_Crsx_xqualifier_xA2)
				{
					break label_32;
				}
				Term sub_341 = term_59.sub(1).ref();
				/* #CONSTRUCTOR=sub *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sColon);
				sink.end();
				sink.literal("$form$");
				sink.copy(sub_341.ref());
				sink.end();
				return true;
			}
			label_62 :
			{
				if (term_59.descriptor() != _M_Crsx_xconstructor_xA2)
				{
					break label_62;
				}
				Term sub_184 = term_59.sub(0).ref();
				if (sub_184.descriptor() != _M_Crsx_xreserved_xA1)
				{
					break label_62;
				}
				Term sub_107 = sub_184.sub(0).ref();/*Contract*/
				sink.literal("$form$:");
				return true;
			}
		}
		return thunk(sink, _M_DataFormKey, term_59);
	}

	final public static boolean _M_DataSortKey(Sink sink, int shared, int depth, Term term_70)
	{
		if (depth < 2000)
		{
			label_48 :
			{
				if (term_70.descriptor() != _M_Crsx_xsortname_xA1)
				{
					break label_48;
				}
				Term sub_19 = term_70.sub(0).ref();
				if (sub_19.descriptor() != _M_Crsx_xconstructor_xA1)
				{
					break label_48;
				}
				Term sub_165 = sub_19.sub(0).ref();
				if (sub_165.descriptor() != _M_Crsx_xqualifier_xA2)
				{
					break label_48;
				}
				Term sub_189 = sub_19.sub(1).ref();
				/* #CONSTRUCTOR=sub */Term sub_58 = term_70.sub(1).ref();
				/* #sortarguments?=sub *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sColon);
				sink.end();
				sink.literal("$data$");
				sink.copy(sub_189.ref());
				sink.end();
				return true;
			}
			label_169 :
			{
				if (term_70.descriptor() != _M_Crsx_xsortname_xA1)
				{
					break label_169;
				}
				Term sub_90 = term_70.sub(0).ref();
				if (sub_90.descriptor() != _M_Crsx_xconstructor_xA2)
				{
					break label_169;
				}
				Term sub_79 = sub_90.sub(0).ref();
				if (sub_79.descriptor() != _M_Crsx_xreserved_xA1)
				{
					break label_169;
				}
				Term sub_135 = sub_79.sub(0).ref();
				Term sub_96 = term_70.sub(1).ref();
				/* #sortarguments?=sub *//*Contract*/sink.literal("$data$:");
				return true;
			}
		}
		return thunk(sink, _M_DataSortKey, term_70);
	}

	final public static boolean _M_RulesKey(Sink sink, int shared, int depth, Term term_186)
	{
		if (depth < 2000)
		{
			label_22 :
			{
				if (term_186.descriptor() != _M_Crsx_xconstructor_xA1)
				{
					break label_22;
				}
				Term sub_183 = term_186.sub(0).ref();
				if (sub_183.descriptor() != _M_Crsx_xqualifier_xA2)
				{
					break label_22;
				}
				Term sub_566 = term_186.sub(1).ref();
				/* #CONSTRUCTOR=sub *//*Contract*/
				sink.start(_M__s);
				sink.start(_M_Builtin_sColon);
				sink.end();
				sink.literal("$rules$");
				sink.copy(sub_566.ref());
				sink.end();
				return true;
			}
			label_176 :
			{
				if (term_186.descriptor() != _M_Crsx_xconstructor_xA2)
				{
					break label_176;
				}
				Term sub_26 = term_186.sub(0).ref();
				if (sub_26.descriptor() != _M_Crsx_xreserved_xA1)
				{
					break label_176;
				}
				Term sub_191 = sub_26.sub(0).ref();/*Contract*/
				sink.literal("$rules$:");
				return true;
			}
		}
		return thunk(sink, _M_RulesKey, term_186);
	}

	final public static boolean _M_UnRULES(Sink sink, int shared, int depth, Term term_47)
	{
		if (depth < 2000)
		{
			label_70 :
			{
				if (term_47.descriptor() != _M_RULES)
				{
					break label_70;
				}
				Term sub_304 = term_47.sub(0).ref(); /* #=sub *//*Contract*/
				sink.copy(sub_304.ref());
				return true;
			}
		}
		return thunk(sink, _M_UnRULES, term_47);
	}

	final public static boolean _M_UnFUNCSORT(Sink sink, int shared, int depth, Term term_100)
	{
		if (depth < 2000)
		{
			label_11 :
			{
				if (term_100.descriptor() != _M_FUNCSORT)
				{
					break label_11;
				}
				Term sub_173 = term_100.sub(0).ref();
				/* #1=sub */Term sub_4 = term_100.sub(1).ref(); /* #=sub *//*Contract*/
				sink.copy(sub_4.ref());
				return true;
			}
		}
		return thunk(sink, _M_UnFUNCSORT, term_100);
	}

	final public static boolean _M_UnDATASORT(Sink sink, int shared, int depth, Term term_122)
	{
		if (depth < 2000)
		{
			label_124 :
			{
				if (term_122.descriptor() != _M_DATASORT)
				{
					break label_124;
				}
				Term sub_170 = term_122.sub(0).ref(); /* #=sub *//*Contract*/
				sink.copy(sub_170.ref());
				return true;
			}
		}
		return thunk(sink, _M_UnDATASORT, term_122);
	}

	final public static boolean _M_AddModuleKey2(Sink sink, int shared, int depth, Properties props_62, Term term_347, Term term_138, Term term_176, Term term_55, Term term_6, Variable var_22, Term term_30)
	{
		if (depth < 2000)
		{
			label_91 :
			{
				/* #key=term */
				/* #filename=term */
				/* #main=term */
				/* #modules=term */
				/* #notloaded=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_62));
				Term term_124;
				{
					BufferSink buf_93 = sink.context().makeBuffer();
					buf_93.start(_M_MODULE);
					buf_93.copy(term_138.ref());
					buf_93.copy(term_176.ref());
					buf_93.start(_M_NOTLOADED);
					buf_93.end();
					buf_93.end();
					term_124 = buf_93.term();
				}
				term_347 = force(sink.context(), term_347);
				Sink.property(sink, term_347, term_124);
				Term term_229;
				{
					BufferSink buf_36 = sink.context().makeBuffer();
					buf_36.start(_M_MODULES);
					buf_36.copy(term_55.ref());
					buf_36.end();
					term_229 = buf_36.term();
				}
				sink.propertyNamed("$modules", term_229);
				Term term_17;
				{
					BufferSink buf_167 = sink.context().makeBuffer();
					buf_167.start(_M_MODULES);
					buf_167.copy(term_6.ref());
					buf_167.end();
					term_17 = buf_167.term();
				}
				sink.propertyNamed("$notloaded", term_17);
				Term term_163;
				{
					BufferSink buf_76 = sink.context().makeBuffer();
					buf_76.start(_M_OK);
					buf_76.end();
					term_163 = buf_76.term();
				}
				sink.substitute(term_30.ref(), new Variable[]
					{var_22}, new Term[]
					{term_163});
				return true;
			}
		}
		return thunk(sink, _M_AddModuleKey2, props_62, term_347, term_138, term_176, term_55, term_6, var_22, term_30);
	}

	final public static boolean _M_AddModuleKey(Sink sink, int shared, int depth, Properties props_79, Term term_180, Term term_2, Term term_76, Variable var_57, Term term_51)
	{
		if (depth < 2000)
		{
			label_12 :
			{
				Term value_55 = props_79 == null ? null : props_79.lookup("$modules");
				if (value_55 == null)
				{
					break label_12;
				}
				if (value_55.descriptor() != _M_MODULES)
				{
					break label_12;
				}
				Term sub_229 = value_55.sub(0).ref();
				/* #modules=sub */
				Term value_69 = props_79 == null ? null : props_79.lookup("$notloaded");
				if (value_69 == null)
				{
					break label_12;
				}
				if (value_69.descriptor() != _M_MODULES)
				{
					break label_12;
				}
				Term sub_10 = value_69.sub(0).ref();
				/* #notloaded=sub */
				/* #key=term */
				/* #filename=term */
				/* #main=term */
				/* #=term *//*Contract*/
				sink.start(_M__s);
				sink.properties(safeRef(props_79));
				sink.start(_M_Builtin_sIfDef);
				sink.end();
				sink.copy(term_180.ref());
				sink.properties(safeRef(props_79));
				Term term_125;
				{
					BufferSink buf_3 = sink.context().makeBuffer();
					buf_3.start(_M_OK);
					buf_3.end();
					term_125 = buf_3.term();
				}
				sink.substitute(term_51.ref(), new Variable[]
					{var_57}, new Term[]
					{term_125});
				sink.properties(safeRef(props_79));
				sink.start(_M_AddModuleKey2);
				sink.copy(term_180.ref());
				sink.copy(term_2.ref());
				sink.copy(term_76.ref());
				sink.start(_M_Concat);
				sink.copy(sub_229.ref());
				sink.start(_M__sCons);
				sink.copy(term_180.ref());
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				sink.start(_M_Concat);
				sink.copy(sub_10.ref());
				sink.start(_M__sCons);
				sink.copy(term_180.ref());
				sink.start(_M__sNil);
				sink.end();
				sink.end();
				sink.end();
				Variable var_98 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_98});
				VariableUse use_41 = sink.context().makeVariableUse(var_98);
				sink.substitute(term_51.ref(), new Variable[]
					{var_57}, new Term[]
					{use_41});
				sink.end();
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_AddModuleKey, props_79, term_180, term_2, term_76, var_57, term_51);
	}

	final public static boolean _M_AddModule(Sink sink, int shared, int depth, Properties props_67, Term term_247, Term term_26, Variable var_115, Term term_177)
	{
		if (depth < 2000)
		{
			label_191 :
			{
				/* #filename=term */
				/* #main=term */
				/* #=term *//*Contract*/sink.properties(safeRef(props_67));
				sink.start(_M_AddModuleKey);
				sink.start(_M_ModuleKey);
				sink.copy(term_247.ref());
				sink.end();
				sink.copy(term_247.ref());
				sink.copy(term_26.ref());
				Variable var_21 = sink.context().makeVariable("ok");
				sink.binds(new Variable[]
					{var_21});
				VariableUse use_52 = sink.context().makeVariableUse(var_21);
				sink.substitute(term_177.ref(), new Variable[]
					{var_115}, new Term[]
					{use_52});
				sink.end();
				return true;
			}
		}
		return thunk(sink, _M_AddModule, props_67, term_247, term_26, var_115, term_177);
	}

	final public static boolean _M_ModuleKey(Sink sink, int shared, int depth, Term term_360)
	{
		if (depth < 2000)
		{
			sink.start(_M__s);
			sink.start(_M_Builtin_sColon);
			sink.end();
			sink.literal("$module$");
			sink.copy(term_360.ref());
			sink.end();
			return true;
		}
		return thunk(sink, _M_ModuleKey, term_360);
	}
	private static boolean initialized = false;

	public static void init(Context context)
	{
		if (!initialized)
		{
			org.crsx.compiler.std.Core.init(context);
			org.crsx.compiler.std.List.init(context);
			org.crsx.compiler.parser.Crsx.init(context);
			context.register(_M_QSORT);
			context.register(_M_KEYS);
			context.register(_M_IMPORTS);
			context.register(_M_RULES);
			context.register(_M_DATASORT);
			context.register(_M_FUNCSORT);
			context.register(_M_FORMKEYS);
			context.register(_M_STR);
			context.register(_M_NOCONTENTENTRY);
			context.register(_M_NOTLOADED);
			context.register(_M_LOADED);
			context.register(_M_MODULES);
			context.register(_M_MODULE);
			context.register(_M_MAINMODULE);
			context.register(_M_SUBMODULE);
			context.register(_M_OutputRuleDeclarationsForKey);
			context.register(_M_OutputRuleDeclarations);
			context.register(_M_OutputFuncDeclaration);
			context.register(_M_OutputFuncDeclarations);
			context.register(_M_OutputDataDeclarationsForKey);
			context.register(_M_OutputDataDeclarations);
			context.register(_M_OutputImportGrammarDeclarations);
			context.register(_M_OutputImportDeclarations);
			context.register(_M_OutputCrsx);
			context.register(_M_AddFuncSort2);
			context.register(_M_AddFuncSort1);
			context.register(_M_AddFuncSort);
			context.register(_M_AddDataForm2);
			context.register(_M_AddDataForm1);
			context.register(_M_AddDataForm);
			context.register(_M_AddDataSort3);
			context.register(_M_AddDataSort2);
			context.register(_M_AddDataSort1);
			context.register(_M_AddDataSort);
			context.register(_M_AddRule3);
			context.register(_M_AddRule2);
			context.register(_M_AddRule);
			context.register(_M_LookupSortByConstructor1);
			context.register(_M_LookupSortByConstructor);
			context.register(_M_LookupModule);
			context.register(_M_ConstructorToString);
			context.register(_M_SortnameToString);
			context.register(_M_FuncSortKey);
			context.register(_M_DataFormKey);
			context.register(_M_DataSortKey);
			context.register(_M_RulesKey);
			context.register(_M_UnRULES);
			context.register(_M_UnFUNCSORT);
			context.register(_M_UnDATASORT);
			context.register(_M_AddModuleKey2);
			context.register(_M_AddModuleKey);
			context.register(_M_AddModule);
			context.register(_M_ModuleKey);
			initialized = true;
		}
	}

	/* END MODULE « "state.crs.java" » */
}