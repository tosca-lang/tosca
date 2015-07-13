/* START MODULE /Users/villardl/Projects/crsx/crsx4/src/state.crs.java */
/** Generated File */package org.crsx.compiler;
import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;
import static org.crsx.runtime.Normalizer.force;
import static org.crsx.runtime.Normalizer.forceSub;
import static org.crsx.runtime.Reference.safeRef;

import org.crsx.runtime.*;
import org.crsx.runtime.ConstructionDescriptor.*;
import static org.crsx.runtime.Primitives.*;
import static org.crsx.compiler.std.Core.*;
import static org.crsx.compiler.std.Env.*;
import static org.crsx.compiler.std.List.*; import static org.crsx.compiler.parser.Crsx.*;

public class State
{
  final public static ConstructionDescriptor _M_QSORT = makeData("QSORT");
  final public static ConstructionDescriptor _M_KEYS = makeData("KEYS");
  final public static ConstructionDescriptor _M_IMPORTS = makeData("IMPORTS");
  final public static ConstructionDescriptor _M_RULES = makeData("RULES");
  final public static ConstructionDescriptor _M_DATASORT = makeData("DATASORT");
  final public static ConstructionDescriptor _M_FUNCSORT = makeData("FUNCSORT");
  final public static ConstructionDescriptor _M_FORMKEYS = makeData("FORMKEYS"); final public static ConstructionDescriptor _M_STR = makeData("STR");
  final public static ConstructionDescriptor _M_NOCONTENTENTRY = makeData("NOCONTENTENTRY");
  final public static ConstructionDescriptor _M_NOTLOADED = makeData("NOTLOADED");
  final public static ConstructionDescriptor _M_LOADED = makeData("LOADED");
  final public static ConstructionDescriptor _M_MODULES = makeData("MODULES");
  final public static ConstructionDescriptor _M_MODULE = makeData("MODULE");
  final public static ConstructionDescriptor _M_MAINMODULE = makeData("MAINMODULE");
  final public static ConstructionDescriptor _M_SUBMODULE = makeData("SUBMODULE");
  final public static DynamicFunctionDescriptor _M_OutputRuleDeclarationsForKey = makeFunction("OutputRuleDeclarationsForKey", State.class, "_M_OutputRuleDeclarationsForKey");
  final public static DynamicFunctionDescriptor _M_OutputRuleDeclarations = makeFunction("OutputRuleDeclarations", State.class, "_M_OutputRuleDeclarations");
  final public static DynamicFunctionDescriptor _M_OutputFuncDeclaration = makeFunction("OutputFuncDeclaration", State.class, "_M_OutputFuncDeclaration");
  final public static DynamicFunctionDescriptor _M_OutputFuncDeclarations = makeFunction("OutputFuncDeclarations", State.class, "_M_OutputFuncDeclarations");
  final public static DynamicFunctionDescriptor _M_OutputDataDeclarationsForKey = makeFunction("OutputDataDeclarationsForKey", State.class, "_M_OutputDataDeclarationsForKey");
  final public static DynamicFunctionDescriptor _M_OutputDataDeclarations = makeFunction("OutputDataDeclarations", State.class, "_M_OutputDataDeclarations");
  final public static DynamicFunctionDescriptor _M_OutputImportGrammarDeclarations = makeFunction("OutputImportGrammarDeclarations", State.class, "_M_OutputImportGrammarDeclarations");
  final public static DynamicFunctionDescriptor _M_OutputImportDeclarations = makeFunction("OutputImportDeclarations", State.class, "_M_OutputImportDeclarations");
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
  final public static DynamicFunctionDescriptor _M_LookupSortByConstructor1 = makeFunction("LookupSortByConstructor1", State.class, "_M_LookupSortByConstructor1");
  final public static DynamicFunctionDescriptor _M_LookupSortByConstructor = makeFunction("LookupSortByConstructor", State.class, "_M_LookupSortByConstructor");
  final public static DynamicFunctionDescriptor _M_LookupModule = makeFunction("LookupModule", State.class, "_M_LookupModule");
  final public static DynamicFunctionDescriptor _M_ConstructorToString = makeFunction("ConstructorToString", State.class, "_M_ConstructorToString");
  final public static DynamicFunctionDescriptor _M_SortnameToString = makeFunction("SortnameToString", State.class, "_M_SortnameToString");
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
  final public static DynamicFunctionDescriptor _M_ModuleKey = makeFunction("ModuleKey", State.class, "_M_ModuleKey");final public static boolean _M_OutputRuleDeclarationsForKey(Sink sink, int shared, int depth, Properties props, Term term, Term term_5) {
    if (depth < 2000) {
      label: {
        term = force(sink.context(), term);
        if (term.descriptor() != _M__sNil)
        {   break label;
        }
        /* #keys=term *//*Contract*/sink.properties(safeRef(props));
        sink.start(_M_OutputRuleDeclarations); sink.copy(term_5.ref());
        sink.end(); return true;
      }
      label_18: {
        term = force(sink.context(), term);
        if (term.descriptor() != _M__sCons)
        {   break label_18;
        }Term sub = forceSub(sink.context(), term, 0).ref();
        /* #rule=sub */Term sub_62 = forceSub(sink.context(), term, 1).ref();
        /* #rules=sub */
        /* #keys=term *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclaration_xA3); sink.copy(sub.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();sink.properties(safeRef(props));
        sink.start(_M_OutputRuleDeclarationsForKey); sink.copy(sub_62.ref()); sink.copy(term_5.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputRuleDeclarationsForKey, props, term, term_5);
  }  final public static boolean _M_OutputRuleDeclarations(Sink sink, int shared, int depth, Properties props_42, Term term_96) {
    if (depth < 2000) {
      label_75: {
        term_96 = force(sink.context(), term_96);
        if (term_96.descriptor() != _M__sNil)
        {   break label_75;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_80: {
        term_96 = force(sink.context(), term_96);
        if (term_96.descriptor() != _M__sCons)
        {   break label_80;
        }Term sub_47 = forceSub(sink.context(), term_96, 0).ref();
        /* #key=sub */Term sub_50 = forceSub(sink.context(), term_96, 1).ref();
        /* #keys=sub *//*Contract*/sink.properties(safeRef(props_42));
        sink.start(_M_OutputRuleDeclarationsForKey);
        sink.start(_M_UnRULES);
        sink.start(_M__s);sink.properties(safeRef(props_42));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(sub_47.ref());
        sink.end();
        sink.end(); sink.copy(sub_50.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputRuleDeclarations, props_42, term_96);
  } final public static boolean _M_OutputFuncDeclaration(Sink sink, int shared, int depth, Properties props_64, Term term_69, Term term_71) {
    if (depth < 2000) {
      sink.start(_M__sCons);
      sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
      sink.start(_M__sCons);
      sink.start(_M_Crsx_xdeclaration_xA4); sink.copy(term_69.ref());
      sink.end(); sink.start(_M__sNil); sink.end();
      sink.end();
      sink.end();sink.properties(safeRef(props_64));
      sink.start(_M_OutputFuncDeclarations); sink.copy(term_71.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_OutputFuncDeclaration, props_64, term_69, term_71);
  }  final public static boolean _M_OutputFuncDeclarations(Sink sink, int shared, int depth, Properties props_63, Term term_45) {
    if (depth < 2000) {
      label_9: {
        Term value = props_63 == null ? null : props_63.lookup("$rulekeys");
        if (value == null) 
        {   break label_9;
        }
        value = force(sink.context(), value);
        if (value.descriptor() != _M_KEYS)
        {   break label_9;
        }Term sub_29 = forceSub(sink.context(), value, 0).ref();
        /* #keys=sub */
        term_45 = force(sink.context(), term_45);
        if (term_45.descriptor() != _M__sNil)
        {   break label_9;
        }/*Contract*/sink.properties(safeRef(props_63));
        sink.start(_M_OutputRuleDeclarations); sink.copy(sub_29.ref());
        sink.end(); return true;
      }
      label_85: {
        term_45 = force(sink.context(), term_45);
        if (term_45.descriptor() != _M__sCons)
        {   break label_85;
        }Term sub_4 = forceSub(sink.context(), term_45, 0).ref();
        /* #key=sub */Term sub_42 = forceSub(sink.context(), term_45, 1).ref();
        /* #keys=sub *//*Contract*/sink.properties(safeRef(props_63));
        sink.start(_M_OutputFuncDeclaration);
        sink.start(_M_UnFUNCSORT);
        sink.start(_M__s);sink.properties(safeRef(props_63));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(sub_4.ref());
        sink.end();
        sink.end(); sink.copy(sub_42.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputFuncDeclarations, props_63, term_45);
  } final public static boolean _M_OutputDataDeclarationsForKey(Sink sink, int shared, int depth, Properties props_35, Term term_89, Term term_93) {
    if (depth < 2000) {
      label_77: {
        term_89 = force(sink.context(), term_89);
        if (term_89.descriptor() != _M__sNil)
        {   break label_77;
        }
        /* #keys=term *//*Contract*/sink.properties(safeRef(props_35));
        sink.start(_M_OutputDataDeclarations); sink.copy(term_93.ref());
        sink.end(); return true;
      }
      label_2: {
        term_89 = force(sink.context(), term_89);
        if (term_89.descriptor() != _M__sCons)
        {   break label_2;
        }Term sub_24 = forceSub(sink.context(), term_89, 0).ref();
        sub_24 = force(sink.context(), sub_24);
        if (sub_24.descriptor() != _M_QSORT)
        {   break label_2;
        }Term sub_97 = forceSub(sink.context(), sub_24, 0).ref();
        /* #qualifier=sub */Term sub_44 = forceSub(sink.context(), sub_24, 1).ref();
        /* #sort=sub */Term sub_21 = forceSub(sink.context(), term_89, 1).ref();
        /* #qsorts=sub */
        /* #keys=term *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclaration_xA4); sink.copy(sub_44.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();sink.properties(safeRef(props_35));
        sink.start(_M_OutputDataDeclarationsForKey); sink.copy(sub_21.ref()); sink.copy(term_93.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputDataDeclarationsForKey, props_35, term_89, term_93);
  }  final public static boolean _M_OutputDataDeclarations(Sink sink, int shared, int depth, Properties props_68, Term term_24) {
    if (depth < 2000) {
      label_90: {
        Term value_51 = props_68 == null ? null : props_68.lookup("$funckeys");
        if (value_51 == null) 
        {   break label_90;
        }
        value_51 = force(sink.context(), value_51);
        if (value_51.descriptor() != _M_KEYS)
        {   break label_90;
        }Term sub_78 = forceSub(sink.context(), value_51, 0).ref();
        /* #keys=sub */
        term_24 = force(sink.context(), term_24);
        if (term_24.descriptor() != _M__sNil)
        {   break label_90;
        }/*Contract*/sink.properties(safeRef(props_68));
        sink.start(_M_OutputFuncDeclarations); sink.copy(sub_78.ref());
        sink.end(); return true;
      }
      label_88: {
        term_24 = force(sink.context(), term_24);
        if (term_24.descriptor() != _M__sCons)
        {   break label_88;
        }Term sub_48 = forceSub(sink.context(), term_24, 0).ref();
        /* #key=sub */Term sub_22 = forceSub(sink.context(), term_24, 1).ref();
        /* #keys=sub *//*Contract*/sink.properties(safeRef(props_68));
        sink.start(_M_OutputDataDeclarationsForKey);
        sink.start(_M_UnDATASORT);
        sink.start(_M__s);sink.properties(safeRef(props_68));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(sub_48.ref());
        sink.end();
        sink.end(); sink.copy(sub_22.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputDataDeclarations, props_68, term_24);
  } final public static boolean _M_OutputImportGrammarDeclarations(Sink sink, int shared, int depth, Properties props_78, Term term_16) {
    if (depth < 2000) {
      label_70: {
        Term value_22 = props_78 == null ? null : props_78.lookup("$datakeys");
        if (value_22 == null) 
        {   break label_70;
        }
        value_22 = force(sink.context(), value_22);
        if (value_22.descriptor() != _M_KEYS)
        {   break label_70;
        }Term sub_99 = forceSub(sink.context(), value_22, 0).ref();
        /* #keys=sub */
        term_16 = force(sink.context(), term_16);
        if (term_16.descriptor() != _M__sNil)
        {   break label_70;
        }/*Contract*/sink.properties(safeRef(props_78));
        sink.start(_M_OutputDataDeclarations); sink.copy(sub_99.ref());
        sink.end(); return true;
      }
      label_56: {
        term_16 = force(sink.context(), term_16);
        if (term_16.descriptor() != _M__sCons)
        {   break label_56;
        }Term sub_11 = forceSub(sink.context(), term_16, 0).ref();
        /* #import=sub */Term sub_94 = forceSub(sink.context(), term_16, 1).ref();
        /* #imports=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclaration_xA2);
        sink.start(_M_Crsx_ximportDeclaration_xA3); sink.literal("import"); sink.literal("grammar");
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.copy(sub_11.ref());
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();sink.properties(safeRef(props_78));
        sink.start(_M_OutputImportGrammarDeclarations); sink.copy(sub_94.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputImportGrammarDeclarations, props_78, term_16);
  } final public static boolean _M_OutputImportDeclarations(Sink sink, int shared, int depth, Properties props_114, Term term_98) {
    if (depth < 2000) {
      label_17: {
        Term value_11 = props_114 == null ? null : props_114.lookup("$grammars");
        if (value_11 == null) 
        {   break label_17;
        }
        value_11 = force(sink.context(), value_11);
        if (value_11.descriptor() != _M_IMPORTS)
        {   break label_17;
        }Term sub_67 = forceSub(sink.context(), value_11, 0).ref();
        /* #imported=sub */
        term_98 = force(sink.context(), term_98);
        if (term_98.descriptor() != _M__sNil)
        {   break label_17;
        }/*Contract*/sink.properties(safeRef(props_114));
        sink.start(_M_OutputImportGrammarDeclarations); sink.copy(sub_67.ref());
        sink.end(); return true;
      }
      label_48: {
        term_98 = force(sink.context(), term_98);
        if (term_98.descriptor() != _M__sCons)
        {   break label_48;
        }Term sub_55 = forceSub(sink.context(), term_98, 0).ref();
        /* #import=sub */Term sub_20 = forceSub(sink.context(), term_98, 1).ref();
        /* #imports=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclaration_xA2);
        sink.start(_M_Crsx_ximportDeclaration_xA2); sink.literal("import"); sink.literal("module");
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.copy(sub_55.ref());
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();sink.properties(safeRef(props_114));
        sink.start(_M_OutputImportDeclarations); sink.copy(sub_20.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputImportDeclarations, props_114, term_98);
  } final public static boolean _M_OutputCrsx(Sink sink, int shared, int depth, Properties props_16, Term term_82) {
    if (depth < 2000) {
      label_58: {
        Term value_44 = props_16 == null ? null : props_16.lookup("$imported");
        if (value_44 == null) 
        {   break label_58;
        }
        value_44 = force(sink.context(), value_44);
        if (value_44.descriptor() != _M_IMPORTS)
        {   break label_58;
        }Term sub_264 = forceSub(sink.context(), value_44, 0).ref();
        /* #imported=sub */
        term_82 = force(sink.context(), term_82);
        if (term_82.descriptor() != _M_OK)
        {   break label_58;
        }/*Contract*/
        sink.start(_M_Crsx_xcrsx);
        sink.start(_M_Crsx_xdeclarations);
        sink.start(_M_Crsx_xdeclaration_xA5);
        sink.start(_M_Crsx_xdirective_xA1);
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.literal("$Lax");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();sink.properties(safeRef(props_16));
        sink.start(_M_OutputImportDeclarations); sink.copy(sub_264.ref());
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputCrsx, props_16, term_82);
  } final public static boolean _M_AddFuncSort2(Sink sink, int shared, int depth, Properties props_90, Term term_13, Term term_22, Term term_152, Variable var, Term term_37) {
    if (depth < 2000) {
      label_79: {
        term_13 = force(sink.context(), term_13);
        if (term_13.descriptor() != _M_FUNCSORT)
        {   break label_79;
        }Term sub_26 = forceSub(sink.context(), term_13, 0).ref();
        /* #qualifier=sub */Term sub_81 = forceSub(sink.context(), term_13, 1).ref();
        /* #sort=sub */
        /* #key=term */
        term_152 = force(sink.context(), term_152);
        if (term_152.descriptor() != _M_Crsx_xsortDeclaration_xA2)
        {   break label_79;
        }Term sub_15 = forceSub(sink.context(), term_152, 0).ref();
        /* #sortparams?=sub */Term sub_37 = forceSub(sink.context(), term_152, 1).ref();
        /* #sortset=sub */Term sub_84 = forceSub(sink.context(), term_152, 2).ref();
        sub_84 = force(sink.context(), sub_84);
        if (sub_84.descriptor() != _M_Crsx_xform_xA1)
        {   break label_79;
        }Term sub_31 = forceSub(sink.context(), sub_84, 0).ref();
        /* #constructor=sub */Term sub_158 = forceSub(sink.context(), sub_84, 1).ref();
        /* #arguments?=sub */Term sub_144 = forceSub(sink.context(), term_152, 3).ref();Term sub_74 = forceSub(sink.context(), term_152, 4).ref();
        /* #sortname=sub */
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("Function sort already defined:");
        sink.start(_M_ConstructorToString); sink.copy(sub_31.ref());
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_82: {
        Term value_14 = props_90 == null ? null : props_90.lookup("$funckeys");
        if (value_14 == null) 
        {   break label_82;
        }
        value_14 = force(sink.context(), value_14);
        if (value_14.descriptor() != _M_KEYS)
        {   break label_82;
        }Term sub_1 = forceSub(sink.context(), value_14, 0).ref();
        /* #keys=sub */
        Term value_17 = props_90 == null ? null : props_90.lookup("$qualifier");
        if (value_17 == null) 
        {   break label_82;
        }
        value_17 = force(sink.context(), value_17);
        if (value_17.descriptor() != _M_STR)
        {   break label_82;
        }Term sub_2 = forceSub(sink.context(), value_17, 0).ref();
        /* #qualifier=sub */
        term_13 = force(sink.context(), term_13);
        if (term_13.descriptor() != _M_NOCONTENTENTRY)
        {   break label_82;
        }
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_90));Term term_32;
        {
          BufferSink buf = sink.context().makeBuffer();
          buf.start(_M_FUNCSORT); buf.copy(sub_2.ref()); buf.copy(term_152.ref());
          buf.end();
          term_32 = buf.term();
        }
        term_22 = force(sink.context(), term_22);
        Sink.property(sink, term_22, term_32);Term term_46;
        {
          BufferSink buf_9 = sink.context().makeBuffer();
          buf_9.start(_M_KEYS);
          buf_9.start(_M__sCons); buf_9.copy(term_22.ref()); buf_9.copy(sub_1.ref());
          buf_9.end();
          buf_9.end();
          term_46 = buf_9.term();
        } sink.propertyNamed("$funckeys", term_46);Term term_2;
        {
          BufferSink buf_43 = sink.context().makeBuffer(); buf_43.start(_M_OK); buf_43.end();
          term_2 = buf_43.term();
        }
        sink.substitute(term_37.ref(), new Variable[] { var }, new Term[] {term_2}); return true;
      }
    }
    return thunk(sink, _M_AddFuncSort2, props_90, term_13, term_22, term_152, var, term_37);
  }     final public static boolean _M_AddFuncSort1(Sink sink, int shared, int depth, Properties props_14, Term term_25, Term term_64, Variable var_25, Term term_72) {
    if (depth < 2000) {
      label_59: {
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_14));
        sink.start(_M_AddFuncSort2);
        sink.start(_M__s);sink.properties(safeRef(props_14));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_25.ref()); sink.start(_M_NOCONTENTENTRY); sink.end();
        sink.end(); sink.copy(term_25.ref()); sink.copy(term_64.ref());
        Variable var_0 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_0});
        VariableUse use = sink.context().makeVariableUse(var_0);
        sink.substitute(term_72.ref(), new Variable[] { var_25 }, new Term[] {use});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddFuncSort1, props_14, term_25, term_64, var_25, term_72);
  }    final public static boolean _M_AddFuncSort(Sink sink, int shared, int depth, Properties props_48, Term term_84, Variable var_70, Term term_63) {
    if (depth < 2000) {
      label_7: {
        term_84 = force(sink.context(), term_84);
        if (term_84.descriptor() != _M_Crsx_xsortDeclaration_xA2)
        {   break label_7;
        }Term sub_119 = forceSub(sink.context(), term_84, 0).ref();
        /* #sortparams?=sub */Term sub_28 = forceSub(sink.context(), term_84, 1).ref();
        /* #sortset=sub */Term sub_109 = forceSub(sink.context(), term_84, 2).ref();
        sub_109 = force(sink.context(), sub_109);
        if (sub_109.descriptor() != _M_Crsx_xform_xA1)
        {   break label_7;
        }Term sub_140 = forceSub(sink.context(), sub_109, 0).ref();
        /* #constructor=sub */Term sub_60 = forceSub(sink.context(), sub_109, 1).ref();
        /* #arguments?=sub */Term sub_183 = forceSub(sink.context(), term_84, 3).ref();Term sub_40 = forceSub(sink.context(), term_84, 4).ref();
        /* #sortname=sub */
        /* #=term *//*Contract*/sink.properties(safeRef(props_48));
        sink.start(_M_AddFuncSort1);
        sink.start(_M_FuncSortKey); sink.copy(sub_140.ref());
        sink.end();
        sink.start(_M_Crsx_xsortDeclaration_xA2); sink.copy(sub_119.ref()); sink.copy(sub_28.ref());
        sink.start(_M_Crsx_xform_xA1); sink.copy(sub_140.ref()); sink.copy(sub_60.ref());
        sink.end(); sink.literal("::"); sink.copy(sub_40.ref());
        sink.end();
        Variable var_90 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_90});
        VariableUse use_53 = sink.context().makeVariableUse(var_90);
        sink.substitute(term_63.ref(), new Variable[] { var_70 }, new Term[] {use_53});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddFuncSort, props_48, term_84, var_70, term_63);
  }   final public static boolean _M_AddDataForm2(Sink sink, int shared, int depth, Properties props_88, Term term_85, Term term_7, Term term_38, Term term_28, Term term_14, Term term_36) {
    if (depth < 2000) {
      label_15: {
        term_85 = force(sink.context(), term_85);
        if (term_85.descriptor() != _M_DATASORT)
        {   break label_15;
        }Term sub_95 = forceSub(sink.context(), term_85, 0).ref();
        /* #sort=sub */
        /* #key=term */
        term_38 = force(sink.context(), term_38);
        if (term_38.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_15;
        }Term sub_18 = forceSub(sink.context(), term_38, 0).ref();
        sub_18 = force(sink.context(), sub_18);
        if (sub_18.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_15;
        }Term sub_27 = forceSub(sink.context(), term_38, 1).ref();
        /* #CONSTRUCTOR1=sub */
        term_28 = force(sink.context(), term_28);
        if (term_28.descriptor() != _M_Crsx_xsortname_xA1)
        {   break label_15;
        }Term sub_91 = forceSub(sink.context(), term_28, 0).ref();
        sub_91 = force(sink.context(), sub_91);
        if (sub_91.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_15;
        }Term sub_7 = forceSub(sink.context(), sub_91, 0).ref();
        sub_7 = force(sink.context(), sub_7);
        if (sub_7.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_15;
        }Term sub_150 = forceSub(sink.context(), sub_91, 1).ref();
        /* #CONSTRUCTOR2=sub */Term sub_101 = forceSub(sink.context(), term_28, 1).ref();
        /* #sortarguments?=sub */
        /* #sortdecl=term */
        /* #CONTINUATION=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("Error: duplicate data form "); sink.copy(sub_27.ref()); sink.literal(" found in sort "); sink.copy(sub_150.ref()); sink.literal(".");
        sink.end();
        sink.end(); return true;
      }
      label_21: {
        Term value_9 = props_88 == null ? null : props_88.lookup("$qualifier");
        if (value_9 == null) 
        {   break label_21;
        }
        value_9 = force(sink.context(), value_9);
        if (value_9.descriptor() != _M_STR)
        {   break label_21;
        }Term sub_261 = forceSub(sink.context(), value_9, 0).ref();
        /* #qualifier=sub */
        term_85 = force(sink.context(), term_85);
        if (term_85.descriptor() != _M_NOCONTENTENTRY)
        {   break label_21;
        }
        /* #key=term */
        /* #constructor=term */
        /* #sortname=term */
        /* #sortdecl=term */
        term_36 = force(sink.context(), term_36);
        if (term_36.descriptor() != _M_CONTINUATION)
        {   break label_21;
        }Term sub_92 = forceSub(sink.context(), term_36, 0).ref();
        Variable binder = term_36.binders(0)[0];
        /* #=sub *//*Contract*/sink.properties(safeRef(props_88));Term term_197;
        {
          BufferSink buf_63 = sink.context().makeBuffer();
          buf_63.start(_M_DATASORT);
          buf_63.start(_M__sCons);
          buf_63.start(_M_QSORT); buf_63.copy(sub_261.ref()); buf_63.copy(term_14.ref());
          buf_63.end(); buf_63.start(_M__sNil); buf_63.end();
          buf_63.end();
          buf_63.end();
          term_197 = buf_63.term();
        }
        term_7 = force(sink.context(), term_7);
        Sink.property(sink, term_7, term_197);Term term_174;
        {
          BufferSink buf_2 = sink.context().makeBuffer(); buf_2.start(_M_OK); buf_2.end();
          term_174 = buf_2.term();
        }
        sink.substitute(sub_92.ref(), new Variable[] { binder }, new Term[] {term_174}); return true; 
      }
    }
    return thunk(sink, _M_AddDataForm2, props_88, term_85, term_7, term_38, term_28, term_14, term_36);
  }      final public static boolean _M_AddDataForm1(Sink sink, int shared, int depth, Properties props_58, Term term_8, Term term_77, Term term_67, Term term_157, Term term_65) {
    if (depth < 2000) {sink.properties(safeRef(props_58));
      sink.start(_M_AddDataForm2);
      sink.start(_M__s);sink.properties(safeRef(props_58));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_8.ref()); sink.start(_M_NOCONTENTENTRY); sink.end();
      sink.end(); sink.copy(term_8.ref()); sink.copy(term_77.ref()); sink.copy(term_67.ref()); sink.copy(term_157.ref()); sink.copy(term_65.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_AddDataForm1, props_58, term_8, term_77, term_67, term_157, term_65);
  }     final public static boolean _M_AddDataForm(Sink sink, int shared, int depth, Properties props_47, Term term_29, Term term_59, Term term_83, Term term_130) {
    if (depth < 2000) {
      label_46: {
        term_29 = force(sink.context(), term_29);
        if (term_29.descriptor() != _M_Crsx_xforms_xS1)
        {   break label_46;
        }Term sub_57 = forceSub(sink.context(), term_29, 0).ref();
        sub_57 = force(sink.context(), sub_57);
        if (sub_57.descriptor() != _M_Crsx_xform_xA1)
        {   break label_46;
        }Term sub_88 = forceSub(sink.context(), sub_57, 0).ref();
        /* #constructor=sub */Term sub_190 = forceSub(sink.context(), sub_57, 1).ref();
        /* #arguments?=sub */Term sub_9 = forceSub(sink.context(), term_29, 1).ref();
        /* #sortname=term */
        /* #sortdecl=term */
        /* #CONTINUATION=term *//*Contract*/sink.properties(safeRef(props_47));
        sink.start(_M_AddDataForm1);
        sink.start(_M_DataFormKey); sink.copy(sub_88.ref());
        sink.end(); sink.copy(sub_88.ref()); sink.copy(term_59.ref()); sink.copy(term_83.ref()); sink.copy(term_130.ref());
        sink.end(); return true;
      }
      label_20: {
        term_29 = force(sink.context(), term_29);
        if (term_29.descriptor() != _M_Crsx_xforms_xS1)
        {   break label_20;
        }Term sub_66 = forceSub(sink.context(), term_29, 0).ref();
        sub_66 = force(sink.context(), sub_66);
        if (sub_66.descriptor() != _M_Crsx_xform_xA2)
        {   break label_20;
        }Term sub_10 = forceSub(sink.context(), sub_66, 0).ref();
        /* #variable=sub */Term sub_25 = forceSub(sink.context(), term_29, 1).ref();
        /* #sortname=term */
        /* #sortdecl=term */
        term_130 = force(sink.context(), term_130);
        if (term_130.descriptor() != _M_CONTINUATION)
        {   break label_20;
        }Term sub_145 = forceSub(sink.context(), term_130, 0).ref();
        Variable binder_56 = term_130.binders(0)[0];
        /* #=sub *//*Contract*/sink.properties(safeRef(props_47));Term term_92;
        {
          BufferSink buf_74 = sink.context().makeBuffer(); buf_74.start(_M_OK); buf_74.end();
          term_92 = buf_74.term();
        }
        sink.substitute(sub_145.ref(), new Variable[] { binder_56 }, new Term[] {term_92}); return true; 
      }
    }
    return thunk(sink, _M_AddDataForm, props_47, term_29, term_59, term_83, term_130);
  }    final public static boolean _M_AddDataSort3(Sink sink, int shared, int depth, Properties props_54, Term term_95, Term term_11, Term term_34, Variable var_22, Term term_30) {
    if (depth < 2000) {
      label_33: {
        Term value_63 = props_54 == null ? null : props_54.lookup("$qualifier");
        if (value_63 == null) 
        {   break label_33;
        }
        value_63 = force(sink.context(), value_63);
        if (value_63.descriptor() != _M_STR)
        {   break label_33;
        }Term sub_79 = forceSub(sink.context(), value_63, 0).ref();
        /* #qualifier=sub */
        term_95 = force(sink.context(), term_95);
        if (term_95.descriptor() != _M_DATASORT)
        {   break label_33;
        }Term sub_46 = forceSub(sink.context(), term_95, 0).ref();
        /* #sorts=sub */
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_54));Term term_121;
        {
          BufferSink buf_67 = sink.context().makeBuffer();
          buf_67.start(_M_DATASORT);
          buf_67.start(_M__sCons);
          buf_67.start(_M_QSORT); buf_67.copy(sub_79.ref()); buf_67.copy(term_34.ref());
          buf_67.end(); buf_67.copy(sub_46.ref());
          buf_67.end();
          buf_67.end();
          term_121 = buf_67.term();
        }
        term_11 = force(sink.context(), term_11);
        Sink.property(sink, term_11, term_121);Term term_173;
        {
          BufferSink buf_45 = sink.context().makeBuffer(); buf_45.start(_M_OK); buf_45.end();
          term_173 = buf_45.term();
        }
        sink.substitute(term_30.ref(), new Variable[] { var_22 }, new Term[] {term_173}); return true;
      }
      label_57: {
        Term value_96 = props_54 == null ? null : props_54.lookup("$datakeys");
        if (value_96 == null) 
        {   break label_57;
        }
        value_96 = force(sink.context(), value_96);
        if (value_96.descriptor() != _M_KEYS)
        {   break label_57;
        }Term sub_85 = forceSub(sink.context(), value_96, 0).ref();
        /* #keys=sub */
        Term value_27 = props_54 == null ? null : props_54.lookup("$qualifier");
        if (value_27 == null) 
        {   break label_57;
        }
        value_27 = force(sink.context(), value_27);
        if (value_27.descriptor() != _M_STR)
        {   break label_57;
        }Term sub_59 = forceSub(sink.context(), value_27, 0).ref();
        /* #qualifier=sub */
        term_95 = force(sink.context(), term_95);
        if (term_95.descriptor() != _M_NOCONTENTENTRY)
        {   break label_57;
        }
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_54));Term term_110;
        {
          BufferSink buf_35 = sink.context().makeBuffer();
          buf_35.start(_M_DATASORT);
          buf_35.start(_M__sCons);
          buf_35.start(_M_QSORT); buf_35.copy(sub_59.ref()); buf_35.copy(term_34.ref());
          buf_35.end(); buf_35.start(_M__sNil); buf_35.end();
          buf_35.end();
          buf_35.end();
          term_110 = buf_35.term();
        }
        term_11 = force(sink.context(), term_11);
        Sink.property(sink, term_11, term_110);Term term_179;
        {
          BufferSink buf_99 = sink.context().makeBuffer();
          buf_99.start(_M_KEYS);
          buf_99.start(_M__sCons); buf_99.copy(term_11.ref()); buf_99.copy(sub_85.ref());
          buf_99.end();
          buf_99.end();
          term_179 = buf_99.term();
        } sink.propertyNamed("$datakeys", term_179);Term term_86;
        {
          BufferSink buf_6 = sink.context().makeBuffer(); buf_6.start(_M_OK); buf_6.end();
          term_86 = buf_6.term();
        }
        sink.substitute(term_30.ref(), new Variable[] { var_22 }, new Term[] {term_86}); return true;
      }
    }
    return thunk(sink, _M_AddDataSort3, props_54, term_95, term_11, term_34, var_22, term_30);
  }     final public static boolean _M_AddDataSort2(Sink sink, int shared, int depth, Properties props_43, Term term_60, Term term_62, Variable var_21, Term term_180) {
    if (depth < 2000) {
      label_26: {
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_43));
        sink.start(_M_AddDataSort3);
        sink.start(_M__s);sink.properties(safeRef(props_43));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_60.ref()); sink.start(_M_NOCONTENTENTRY); sink.end();
        sink.end(); sink.copy(term_60.ref()); sink.copy(term_62.ref());
        Variable var_173 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_173});
        VariableUse use_14 = sink.context().makeVariableUse(var_173);
        sink.substitute(term_180.ref(), new Variable[] { var_21 }, new Term[] {use_14});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddDataSort2, props_43, term_60, term_62, var_21, term_180);
  }    final public static boolean _M_AddDataSort1(Sink sink, int shared, int depth, Properties props_3, Term term_136, Term term_99, Variable var_72, Term term_61) {
    if (depth < 2000) {
      label_50: {
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_3));
        sink.start(_M_AddDataSort2); sink.copy(term_136.ref()); sink.copy(term_99.ref());
        Variable var_82 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_82});
        VariableUse use_43 = sink.context().makeVariableUse(var_82);
        sink.substitute(term_61.ref(), new Variable[] { var_72 }, new Term[] {use_43});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddDataSort1, props_3, term_136, term_99, var_72, term_61);
  }    final public static boolean _M_AddDataSort(Sink sink, int shared, int depth, Properties props_17, Term term_0, Variable var_76, Term term_17) {
    if (depth < 2000) {
      label_5: {
        term_0 = force(sink.context(), term_0);
        if (term_0.descriptor() != _M_Crsx_xsortDeclaration_xA1)
        {   break label_5;
        }Term sub_90 = forceSub(sink.context(), term_0, 0).ref();
        /* #sortparams?=sub */Term sub_240 = forceSub(sink.context(), term_0, 1).ref();
        /* #sortset=sub */Term sub_127 = forceSub(sink.context(), term_0, 2).ref();
        /* #sortname=sub */Term sub_156 = forceSub(sink.context(), term_0, 3).ref();Term sub_96 = forceSub(sink.context(), term_0, 4).ref();Term sub_30 = forceSub(sink.context(), term_0, 5).ref();
        sub_30 = force(sink.context(), sub_30);
        if (sub_30.descriptor() != _M_Crsx_xforms)
        {   break label_5;
        }Term sub_63 = forceSub(sink.context(), sub_30, 0).ref();
        /* #forms_S1*=sub */Term sub_184 = forceSub(sink.context(), term_0, 6).ref();
        /* #=term *//*Contract*/sink.properties(safeRef(props_17));
        sink.start(_M_AddDataSort1);
        sink.start(_M_DataSortKey); sink.copy(sub_127.ref());
        sink.end();
        sink.start(_M_Crsx_xsortDeclaration_xA1); sink.copy(sub_90.ref()); sink.copy(sub_240.ref()); sink.copy(sub_127.ref()); sink.literal("::="); sink.literal("(");
        sink.start(_M_Crsx_xforms); sink.copy(sub_63.ref());
        sink.end(); sink.literal(")");
        sink.end();
        Variable var_96 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_96});
        sink.start(_M_ThenSeqMap); sink.use(var_96);
        Variable var_20 = sink.context().makeVariable("form");
        Variable var_6 = sink.context().makeVariable("cont");
        sink.binds(new Variable[] {var_20,var_6});
        sink.start(_M_AddDataForm); sink.use(var_20); sink.copy(sub_127.ref());
        sink.start(_M_Crsx_xsortDeclaration_xA1); sink.copy(sub_90.ref()); sink.copy(sub_240.ref()); sink.copy(sub_127.ref()); sink.literal("::="); sink.literal("(");
        sink.start(_M_Crsx_xforms); sink.copy(sub_63.ref());
        sink.end(); sink.literal(")");
        sink.end(); sink.use(var_6);
        sink.end(); sink.copy(sub_63.ref());
        Variable var_23 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_23});
        VariableUse use_69 = sink.context().makeVariableUse(var_23);
        sink.substitute(term_17.ref(), new Variable[] { var_76 }, new Term[] {use_69});
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddDataSort, props_17, term_0, var_76, term_17);
  }   final public static boolean _M_AddRule3(Sink sink, int shared, int depth, Properties props_74, Term term_353, Term term_186, Term term_155, Variable var_32, Term term_4) {
    if (depth < 2000) {
      label_179: {
        term_353 = force(sink.context(), term_353);
        if (term_353.descriptor() != _M_RULES)
        {   break label_179;
        }Term sub_52 = forceSub(sink.context(), term_353, 0).ref();
        /* #rules=sub */
        /* #key=term */
        /* #ruleDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_74));Term term_124;
        {
          BufferSink buf_88 = sink.context().makeBuffer();
          buf_88.start(_M_RULES);
          buf_88.start(_M_Concat); buf_88.copy(sub_52.ref());
          buf_88.start(_M__sCons); buf_88.copy(term_155.ref()); buf_88.start(_M__sNil); buf_88.end();
          buf_88.end();
          buf_88.end();
          buf_88.end();
          term_124 = buf_88.term();
        }
        term_186 = force(sink.context(), term_186);
        Sink.property(sink, term_186, term_124);Term term_3;
        {
          BufferSink buf_62 = sink.context().makeBuffer(); buf_62.start(_M_OK); buf_62.end();
          term_3 = buf_62.term();
        }
        sink.substitute(term_4.ref(), new Variable[] { var_32 }, new Term[] {term_3}); return true;
      }
      label_8: {
        Term value_29 = props_74 == null ? null : props_74.lookup("$rulekeys");
        if (value_29 == null) 
        {   break label_8;
        }
        value_29 = force(sink.context(), value_29);
        if (value_29.descriptor() != _M_KEYS)
        {   break label_8;
        }Term sub_76 = forceSub(sink.context(), value_29, 0).ref();
        /* #keys=sub */
        term_353 = force(sink.context(), term_353);
        if (term_353.descriptor() != _M_NOCONTENTENTRY)
        {   break label_8;
        }
        /* #key=term */
        /* #ruleDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_74));Term term_177;
        {
          BufferSink buf_78 = sink.context().makeBuffer();
          buf_78.start(_M_RULES);
          buf_78.start(_M__sCons); buf_78.copy(term_155.ref()); buf_78.start(_M__sNil); buf_78.end();
          buf_78.end();
          buf_78.end();
          term_177 = buf_78.term();
        }
        term_186 = force(sink.context(), term_186);
        Sink.property(sink, term_186, term_177);Term term_150;
        {
          BufferSink buf_34 = sink.context().makeBuffer();
          buf_34.start(_M_KEYS);
          buf_34.start(_M__sCons); buf_34.copy(term_186.ref()); buf_34.copy(sub_76.ref());
          buf_34.end();
          buf_34.end();
          term_150 = buf_34.term();
        } sink.propertyNamed("$rulekeys", term_150);Term term_53;
        {
          BufferSink buf_64 = sink.context().makeBuffer(); buf_64.start(_M_OK); buf_64.end();
          term_53 = buf_64.term();
        }
        sink.substitute(term_4.ref(), new Variable[] { var_32 }, new Term[] {term_53}); return true;
      }
    }
    return thunk(sink, _M_AddRule3, props_74, term_353, term_186, term_155, var_32, term_4);
  }     final public static boolean _M_AddRule2(Sink sink, int shared, int depth, Properties props_20, Term term_159, Term term_23, Variable var_78, Term term_91) {
    if (depth < 2000) {
      label_138: {
        /* #key=term */
        /* #ruleDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_20));
        sink.start(_M_AddRule3);
        sink.start(_M__s);sink.properties(safeRef(props_20));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_159.ref()); sink.start(_M_NOCONTENTENTRY); sink.end();
        sink.end(); sink.copy(term_159.ref()); sink.copy(term_23.ref());
        Variable var_7 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_7});
        VariableUse use_57 = sink.context().makeVariableUse(var_7);
        sink.substitute(term_91.ref(), new Variable[] { var_78 }, new Term[] {use_57});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddRule2, props_20, term_159, term_23, var_78, term_91);
  }    final public static boolean _M_AddRule(Sink sink, int shared, int depth, Properties props_27, Term term_138, Term term_56, Variable var_61, Term term_21) {
    if (depth < 2000) {
      label_198: {
        /* #key=term */
        /* #ruleDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_27));
        sink.start(_M_AddRule2); sink.copy(term_138.ref()); sink.copy(term_56.ref());
        Variable var_58 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_58});
        VariableUse use_79 = sink.context().makeVariableUse(var_58);
        sink.substitute(term_21.ref(), new Variable[] { var_61 }, new Term[] {use_79});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddRule, props_27, term_138, term_56, var_61, term_21);
  }    final public static boolean _M_LookupSortByConstructor1(Sink sink, int shared, int depth, Term term_78, Term term_50) {
    if (depth < 2000) {
      label_87: {
        term_78 = force(sink.context(), term_78);
        if (term_78.descriptor() != _M_SOME)
        {   break label_87;
        }Term sub_89 = forceSub(sink.context(), term_78, 0).ref();
        /* #1=sub */
        /* #2=term *//*Contract*/
        sink.start(_M_SOME); sink.copy(sub_89.ref());
        sink.end(); return true;
      }
      label_37: {
        term_78 = force(sink.context(), term_78);
        if (term_78.descriptor() != _M_NONE)
        {   break label_37;
        }
        /* #2=term *//*Contract*/ sink.copy(term_50.ref()); return true;
      }
    }
    return thunk(sink, _M_LookupSortByConstructor1, term_78, term_50);
  }  final public static boolean _M_LookupSortByConstructor(Sink sink, int shared, int depth, Properties props_40, Term term_251) {
    if (depth < 2000) {
      sink.start(_M_LookupSortByConstructor1);sink.properties(safeRef(props_40));
      sink.start(_M_GetSome);
      sink.start(_M_FuncSortKey); sink.copy(term_251.ref());
      sink.end();
      sink.end();sink.properties(safeRef(props_40));
      sink.start(_M_GetSome);
      sink.start(_M_DataFormKey); sink.copy(term_251.ref());
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_LookupSortByConstructor, props_40, term_251);
  } final public static boolean _M_LookupModule(Sink sink, int shared, int depth, Properties props_24, Term term_129) {
    if (depth < 2000) {sink.properties(safeRef(props_24));
      sink.start(_M_GetSome); sink.start(_M_ModuleKey); sink.copy(term_129.ref()); sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_LookupModule, props_24, term_129);
  } final public static boolean _M_ConstructorToString(Sink sink, int shared, int depth, Term term_149) {
    if (depth < 2000) {
      label_83: {
        term_149 = force(sink.context(), term_149);
        if (term_149.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_83;
        }Term sub_69 = forceSub(sink.context(), term_149, 0).ref();
        sub_69 = force(sink.context(), sub_69);
        if (sub_69.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_83;
        }Term sub_137 = forceSub(sink.context(), term_149, 1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/ sink.copy(sub_137.ref()); return true;
      }
      label_196: {
        term_149 = force(sink.context(), term_149);
        if (term_149.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_196;
        }Term sub_83 = forceSub(sink.context(), term_149, 0).ref();
        sub_83 = force(sink.context(), sub_83);
        if (sub_83.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_196;
        }Term sub_71 = forceSub(sink.context(), sub_83, 0).ref();/*Contract*/ sink.literal(":"); return true;
      }
    }
    return thunk(sink, _M_ConstructorToString, term_149);
  } final public static boolean _M_SortnameToString(Sink sink, int shared, int depth, Term term_9) {
    if (depth < 2000) {
      label_12: {
        term_9 = force(sink.context(), term_9);
        if (term_9.descriptor() != _M_Crsx_xsortname_xA1)
        {   break label_12;
        }Term sub_23 = forceSub(sink.context(), term_9, 0).ref();
        sub_23 = force(sink.context(), sub_23);
        if (sub_23.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_12;
        }Term sub_179 = forceSub(sink.context(), sub_23, 0).ref();
        sub_179 = force(sink.context(), sub_179);
        if (sub_179.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_12;
        }Term sub_38 = forceSub(sink.context(), sub_23, 1).ref();
        /* #CONSTRUCTOR=sub */Term sub_82 = forceSub(sink.context(), term_9, 1).ref();
        /* #sortarguments?=sub *//*Contract*/ sink.copy(sub_38.ref()); return true;
      }
      label_43: {
        term_9 = force(sink.context(), term_9);
        if (term_9.descriptor() != _M_Crsx_xsortname_xA1)
        {   break label_43;
        }Term sub_5 = forceSub(sink.context(), term_9, 0).ref();
        sub_5 = force(sink.context(), sub_5);
        if (sub_5.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_43;
        }Term sub_36 = forceSub(sink.context(), sub_5, 0).ref();
        sub_36 = force(sink.context(), sub_36);
        if (sub_36.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_43;
        }Term sub_68 = forceSub(sink.context(), sub_36, 0).ref();Term sub_77 = forceSub(sink.context(), term_9, 1).ref();
        /* #sortarguments?=sub *//*Contract*/ sink.literal(":"); return true;
      }
    }
    return thunk(sink, _M_SortnameToString, term_9);
  } final public static boolean _M_FuncSortKey(Sink sink, int shared, int depth, Term term_76) {
    if (depth < 2000) {
      label_49: {
        term_76 = force(sink.context(), term_76);
        if (term_76.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_49;
        }Term sub_214 = forceSub(sink.context(), term_76, 0).ref();
        sub_214 = force(sink.context(), sub_214);
        if (sub_214.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_49;
        }Term sub_237 = forceSub(sink.context(), term_76, 1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$func$"); sink.copy(sub_237.ref());
        sink.end(); return true;
      }
      label_52: {
        term_76 = force(sink.context(), term_76);
        if (term_76.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_52;
        }Term sub_41 = forceSub(sink.context(), term_76, 0).ref();
        sub_41 = force(sink.context(), sub_41);
        if (sub_41.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_52;
        }Term sub_6 = forceSub(sink.context(), sub_41, 0).ref();/*Contract*/ sink.literal("$func$:"); return true;
      }
    }
    return thunk(sink, _M_FuncSortKey, term_76);
  } final public static boolean _M_DataFormKey(Sink sink, int shared, int depth, Term term_47) {
    if (depth < 2000) {
      label_107: {
        term_47 = force(sink.context(), term_47);
        if (term_47.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_107;
        }Term sub_80 = forceSub(sink.context(), term_47, 0).ref();
        sub_80 = force(sink.context(), sub_80);
        if (sub_80.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_107;
        }Term sub_54 = forceSub(sink.context(), term_47, 1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$form$"); sink.copy(sub_54.ref());
        sink.end(); return true;
      }
      label_45: {
        term_47 = force(sink.context(), term_47);
        if (term_47.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_45;
        }Term sub_45 = forceSub(sink.context(), term_47, 0).ref();
        sub_45 = force(sink.context(), sub_45);
        if (sub_45.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_45;
        }Term sub_268 = forceSub(sink.context(), sub_45, 0).ref();/*Contract*/ sink.literal("$form$:"); return true;
      }
    }
    return thunk(sink, _M_DataFormKey, term_47);
  } final public static boolean _M_DataSortKey(Sink sink, int shared, int depth, Term term_191) {
    if (depth < 2000) {
      label_86: {
        term_191 = force(sink.context(), term_191);
        if (term_191.descriptor() != _M_Crsx_xsortname_xA1)
        {   break label_86;
        }Term sub_113 = forceSub(sink.context(), term_191, 0).ref();
        sub_113 = force(sink.context(), sub_113);
        if (sub_113.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_86;
        }Term sub_58 = forceSub(sink.context(), sub_113, 0).ref();
        sub_58 = force(sink.context(), sub_58);
        if (sub_58.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_86;
        }Term sub_174 = forceSub(sink.context(), sub_113, 1).ref();
        /* #CONSTRUCTOR=sub */Term sub_51 = forceSub(sink.context(), term_191, 1).ref();
        /* #sortarguments?=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$data$"); sink.copy(sub_174.ref());
        sink.end(); return true;
      }
      label_156: {
        term_191 = force(sink.context(), term_191);
        if (term_191.descriptor() != _M_Crsx_xsortname_xA1)
        {   break label_156;
        }Term sub_17 = forceSub(sink.context(), term_191, 0).ref();
        sub_17 = force(sink.context(), sub_17);
        if (sub_17.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_156;
        }Term sub_75 = forceSub(sink.context(), sub_17, 0).ref();
        sub_75 = force(sink.context(), sub_75);
        if (sub_75.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_156;
        }Term sub_13 = forceSub(sink.context(), sub_75, 0).ref();Term sub_3 = forceSub(sink.context(), term_191, 1).ref();
        /* #sortarguments?=sub *//*Contract*/ sink.literal("$data$:"); return true;
      }
    }
    return thunk(sink, _M_DataSortKey, term_191);
  } final public static boolean _M_RulesKey(Sink sink, int shared, int depth, Term term_12) {
    if (depth < 2000) {
      label_115: {
        term_12 = force(sink.context(), term_12);
        if (term_12.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_115;
        }Term sub_243 = forceSub(sink.context(), term_12, 0).ref();
        sub_243 = force(sink.context(), sub_243);
        if (sub_243.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_115;
        }Term sub_61 = forceSub(sink.context(), term_12, 1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$rules$"); sink.copy(sub_61.ref());
        sink.end(); return true;
      }
      label_139: {
        term_12 = force(sink.context(), term_12);
        if (term_12.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_139;
        }Term sub_73 = forceSub(sink.context(), term_12, 0).ref();
        sub_73 = force(sink.context(), sub_73);
        if (sub_73.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_139;
        }Term sub_265 = forceSub(sink.context(), sub_73, 0).ref();/*Contract*/ sink.literal("$rules$:"); return true;
      }
    }
    return thunk(sink, _M_RulesKey, term_12);
  } final public static boolean _M_UnRULES(Sink sink, int shared, int depth, Term term_6) {
    if (depth < 2000) {
      label_197: {
        term_6 = force(sink.context(), term_6);
        if (term_6.descriptor() != _M_RULES)
        {   break label_197;
        }Term sub_14 = forceSub(sink.context(), term_6, 0).ref(); /* #=sub *//*Contract*/ sink.copy(sub_14.ref()); return true;
      }
    }
    return thunk(sink, _M_UnRULES, term_6);
  } final public static boolean _M_UnFUNCSORT(Sink sink, int shared, int depth, Term term_244) {
    if (depth < 2000) {
      label_47: {
        term_244 = force(sink.context(), term_244);
        if (term_244.descriptor() != _M_FUNCSORT)
        {   break label_47;
        }Term sub_293 = forceSub(sink.context(), term_244, 0).ref();
        /* #1=sub */Term sub_93 = forceSub(sink.context(), term_244, 1).ref(); /* #=sub *//*Contract*/ sink.copy(sub_93.ref()); return true;
      }
    }
    return thunk(sink, _M_UnFUNCSORT, term_244);
  } final public static boolean _M_UnDATASORT(Sink sink, int shared, int depth, Term term_116) {
    if (depth < 2000) {
      label_136: {
        term_116 = force(sink.context(), term_116);
        if (term_116.descriptor() != _M_DATASORT)
        {   break label_136;
        }Term sub_141 = forceSub(sink.context(), term_116, 0).ref(); /* #=sub *//*Contract*/ sink.copy(sub_141.ref()); return true;
      }
    }
    return thunk(sink, _M_UnDATASORT, term_116);
  } final public static boolean _M_AddModuleKey2(Sink sink, int shared, int depth, Properties props_98, Term term_70, Term term_44, Term term_54, Term term_107, Term term_104, Variable var_40, Term term_18) {
    if (depth < 2000) {
      label_34: {
        /* #key=term */
        /* #filename=term */
        /* #main=term */
        /* #modules=term */
        /* #notloaded=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_98));Term term_42;
        {
          BufferSink buf_18 = sink.context().makeBuffer();
          buf_18.start(_M_MODULE); buf_18.copy(term_44.ref()); buf_18.copy(term_54.ref()); buf_18.start(_M_NOTLOADED); buf_18.end();
          buf_18.end();
          term_42 = buf_18.term();
        }
        term_70 = force(sink.context(), term_70);
        Sink.property(sink, term_70, term_42);Term term_297;
        {
          BufferSink buf_90 = sink.context().makeBuffer();
          buf_90.start(_M_MODULES); buf_90.copy(term_107.ref());
          buf_90.end();
          term_297 = buf_90.term();
        } sink.propertyNamed("$modules", term_297);Term term_187;
        {
          BufferSink buf_91 = sink.context().makeBuffer();
          buf_91.start(_M_MODULES); buf_91.copy(term_104.ref());
          buf_91.end();
          term_187 = buf_91.term();
        } sink.propertyNamed("$notloaded", term_187);Term term_66;
        {
          BufferSink buf_82 = sink.context().makeBuffer(); buf_82.start(_M_OK); buf_82.end();
          term_66 = buf_82.term();
        }
        sink.substitute(term_18.ref(), new Variable[] { var_40 }, new Term[] {term_66}); return true;
      }
    }
    return thunk(sink, _M_AddModuleKey2, props_98, term_70, term_44, term_54, term_107, term_104, var_40, term_18);
  }       final public static boolean _M_AddModuleKey(Sink sink, int shared, int depth, Properties props_10, Term term_90, Term term_57, Term term_33, Variable var_4, Term term_58) {
    if (depth < 2000) {
      label_32: {
        Term value_68 = props_10 == null ? null : props_10.lookup("$modules");
        if (value_68 == null) 
        {   break label_32;
        }
        value_68 = force(sink.context(), value_68);
        if (value_68.descriptor() != _M_MODULES)
        {   break label_32;
        }Term sub_244 = forceSub(sink.context(), value_68, 0).ref();
        /* #modules=sub */
        Term value_90 = props_10 == null ? null : props_10.lookup("$notloaded");
        if (value_90 == null) 
        {   break label_32;
        }
        value_90 = force(sink.context(), value_90);
        if (value_90.descriptor() != _M_MODULES)
        {   break label_32;
        }Term sub_154 = forceSub(sink.context(), value_90, 0).ref();
        /* #notloaded=sub */
        /* #key=term */
        /* #filename=term */
        /* #main=term */
        /* #=term *//*Contract*/
        sink.start(_M__s);sink.properties(safeRef(props_10));
        sink.start(_M_Builtin_sIfDef);
        sink.end(); sink.copy(term_90.ref());sink.properties(safeRef(props_10));Term term_144;
        {
          BufferSink buf_80 = sink.context().makeBuffer(); buf_80.start(_M_OK); buf_80.end();
          term_144 = buf_80.term();
        }
        sink.substitute(term_58.ref(), new Variable[] { var_4 }, new Term[] {term_144});sink.properties(safeRef(props_10));
        sink.start(_M_AddModuleKey2); sink.copy(term_90.ref()); sink.copy(term_57.ref()); sink.copy(term_33.ref());
        sink.start(_M_Concat); sink.copy(sub_244.ref());
        sink.start(_M__sCons); sink.copy(term_90.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.start(_M_Concat); sink.copy(sub_154.ref());
        sink.start(_M__sCons); sink.copy(term_90.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        Variable var_53 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_53});
        VariableUse use_167 = sink.context().makeVariableUse(var_53);
        sink.substitute(term_58.ref(), new Variable[] { var_4 }, new Term[] {use_167});
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddModuleKey, props_10, term_90, term_57, term_33, var_4, term_58);
  }     final public static boolean _M_AddModule(Sink sink, int shared, int depth, Properties props_39, Term term_164, Term term_192, Variable var_69, Term term_73) {
    if (depth < 2000) {
      label_14: {
        /* #filename=term */
        /* #main=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_39));
        sink.start(_M_AddModuleKey);
        sink.start(_M_ModuleKey); sink.copy(term_164.ref());
        sink.end(); sink.copy(term_164.ref()); sink.copy(term_192.ref());
        Variable var_63 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_63});
        VariableUse use_157 = sink.context().makeVariableUse(var_63);
        sink.substitute(term_73.ref(), new Variable[] { var_69 }, new Term[] {use_157});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddModule, props_39, term_164, term_192, var_69, term_73);
  }    final public static boolean _M_ModuleKey(Sink sink, int shared, int depth, Term term_97) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$module$"); sink.copy(term_97.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_ModuleKey, term_97);
  } 
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.std.Core.init(context); org.crsx.compiler.std.Env.init(context); org.crsx.compiler.std.List.init(context); org.crsx.compiler.parser.Crsx.init(context); context.register(_M_QSORT); context.register(_M_KEYS); context.register(_M_IMPORTS); context.register(_M_RULES); context.register(_M_DATASORT); context.register(_M_FUNCSORT); context.register(_M_FORMKEYS); context.register(_M_STR); context.register(_M_NOCONTENTENTRY); context.register(_M_NOTLOADED); context.register(_M_LOADED); context.register(_M_MODULES); context.register(_M_MODULE); context.register(_M_MAINMODULE); context.register(_M_SUBMODULE); context.register(_M_OutputRuleDeclarationsForKey); context.register(_M_OutputRuleDeclarations); context.register(_M_OutputFuncDeclaration); context.register(_M_OutputFuncDeclarations); context.register(_M_OutputDataDeclarationsForKey); context.register(_M_OutputDataDeclarations); context.register(_M_OutputImportGrammarDeclarations); context.register(_M_OutputImportDeclarations); context.register(_M_OutputCrsx); context.register(_M_AddFuncSort2); context.register(_M_AddFuncSort1); context.register(_M_AddFuncSort); context.register(_M_AddDataForm2); context.register(_M_AddDataForm1); context.register(_M_AddDataForm); context.register(_M_AddDataSort3); context.register(_M_AddDataSort2); context.register(_M_AddDataSort1); context.register(_M_AddDataSort); context.register(_M_AddRule3); context.register(_M_AddRule2); context.register(_M_AddRule); context.register(_M_LookupSortByConstructor1); context.register(_M_LookupSortByConstructor); context.register(_M_LookupModule); context.register(_M_ConstructorToString); context.register(_M_SortnameToString); context.register(_M_FuncSortKey); context.register(_M_DataFormKey); context.register(_M_DataSortKey); context.register(_M_RulesKey); context.register(_M_UnRULES); context.register(_M_UnFUNCSORT); context.register(_M_UnDATASORT); context.register(_M_AddModuleKey2); context.register(_M_AddModuleKey); context.register(_M_AddModule); context.register(_M_ModuleKey);
      initialized = true;
    }
  }

/* END MODULE « "/Users/villardl/Projects/crsx/crsx4/src/state.crs.java" » */
}