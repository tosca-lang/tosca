/* START MODULE /Users/villardl/Projects/crsx/crsx4/src/state.crs.java */
/** Generated File */package org.crsx.compiler;
import static org.crsx.runtime.ConstructionDescriptor.makeData;
import static org.crsx.runtime.ConstructionDescriptor.makeFunction;
import static org.crsx.runtime.Normalizer.thunk;
import static org.crsx.runtime.Normalizer.force;
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
  final public static DynamicFunctionDescriptor _M_ModuleKey = makeFunction("ModuleKey", State.class, "_M_ModuleKey");final public static boolean _M_OutputRuleDeclarationsForKey(Sink sink, int shared, int depth, Properties props, Term term, Term term_24) {
    if (depth < 2000) {
      label: {
        if (term.descriptor() != _M__sNil)
        {   break label;
        }
        /* #keys=term *//*Contract*/sink.properties(safeRef(props));
        sink.start(_M_OutputRuleDeclarations); sink.copy(term_24.ref());
        sink.end(); return true;
      }
      label_90: {
        if (term.descriptor() != _M__sCons)
        {   break label_90;
        }Term sub = term.sub(0).ref();
        /* #rule=sub */Term sub_30 = term.sub(1).ref();
        /* #rules=sub */
        /* #keys=term *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclaration_xA3); sink.copy(sub.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();sink.properties(safeRef(props));
        sink.start(_M_OutputRuleDeclarationsForKey); sink.copy(sub_30.ref()); sink.copy(term_24.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputRuleDeclarationsForKey, props, term, term_24);
  }  final public static boolean _M_OutputRuleDeclarations(Sink sink, int shared, int depth, Properties props_94, Term term_78) {
    if (depth < 2000) {
      label_59: {
        if (term_78.descriptor() != _M__sNil)
        {   break label_59;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_43: {
        if (term_78.descriptor() != _M__sCons)
        {   break label_43;
        }Term sub_16 = term_78.sub(0).ref();
        /* #key=sub */Term sub_91 = term_78.sub(1).ref();
        /* #keys=sub *//*Contract*/sink.properties(safeRef(props_94));
        sink.start(_M_OutputRuleDeclarationsForKey);
        sink.start(_M_UnRULES);
        sink.start(_M__s);sink.properties(safeRef(props_94));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(sub_16.ref());
        sink.end();
        sink.end(); sink.copy(sub_91.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputRuleDeclarations, props_94, term_78);
  } final public static boolean _M_OutputFuncDeclaration(Sink sink, int shared, int depth, Properties props_64, Term term_44, Term term_0) {
    if (depth < 2000) {
      sink.start(_M__sCons);
      sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
      sink.start(_M__sCons);
      sink.start(_M_Crsx_xdeclaration_xA4); sink.copy(term_44.ref());
      sink.end(); sink.start(_M__sNil); sink.end();
      sink.end();
      sink.end();sink.properties(safeRef(props_64));
      sink.start(_M_OutputFuncDeclarations); sink.copy(term_0.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_OutputFuncDeclaration, props_64, term_44, term_0);
  }  final public static boolean _M_OutputFuncDeclarations(Sink sink, int shared, int depth, Properties props_70, Term term_97) {
    if (depth < 2000) {
      label_62: {
        Term value = props_70 == null ? null : props_70.lookup("$rulekeys");
        if (value == null) 
        {   break label_62;
        }
        if (value.descriptor() != _M_KEYS)
        {   break label_62;
        }Term sub_22 = value.sub(0).ref();
        /* #keys=sub */
        if (term_97.descriptor() != _M__sNil)
        {   break label_62;
        }/*Contract*/sink.properties(safeRef(props_70));
        sink.start(_M_OutputRuleDeclarations); sink.copy(sub_22.ref());
        sink.end(); return true;
      }
      label_16: {
        if (term_97.descriptor() != _M__sCons)
        {   break label_16;
        }Term sub_28 = term_97.sub(0).ref();
        /* #key=sub */Term sub_41 = term_97.sub(1).ref();
        /* #keys=sub *//*Contract*/sink.properties(safeRef(props_70));
        sink.start(_M_OutputFuncDeclaration);
        sink.start(_M_UnFUNCSORT);
        sink.start(_M__s);sink.properties(safeRef(props_70));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(sub_28.ref());
        sink.end();
        sink.end(); sink.copy(sub_41.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputFuncDeclarations, props_70, term_97);
  } final public static boolean _M_OutputDataDeclarationsForKey(Sink sink, int shared, int depth, Properties props_1, Term term_8, Term term_94) {
    if (depth < 2000) {
      label_9: {
        if (term_8.descriptor() != _M__sNil)
        {   break label_9;
        }
        /* #keys=term *//*Contract*/sink.properties(safeRef(props_1));
        sink.start(_M_OutputDataDeclarations); sink.copy(term_94.ref());
        sink.end(); return true;
      }
      label_126: {
        if (term_8.descriptor() != _M__sCons)
        {   break label_126;
        }Term sub_39 = term_8.sub(0).ref();
        if (sub_39.descriptor() != _M_QSORT)
        {   break label_126;
        }Term sub_90 = sub_39.sub(0).ref();
        /* #qualifier=sub */Term sub_67 = sub_39.sub(1).ref();
        /* #sort=sub */Term sub_17 = term_8.sub(1).ref();
        /* #qsorts=sub */
        /* #keys=term *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclaration_xA4); sink.copy(sub_67.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();sink.properties(safeRef(props_1));
        sink.start(_M_OutputDataDeclarationsForKey); sink.copy(sub_17.ref()); sink.copy(term_94.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputDataDeclarationsForKey, props_1, term_8, term_94);
  }  final public static boolean _M_OutputDataDeclarations(Sink sink, int shared, int depth, Properties props_39, Term term_88) {
    if (depth < 2000) {
      label_60: {
        Term value_19 = props_39 == null ? null : props_39.lookup("$funckeys");
        if (value_19 == null) 
        {   break label_60;
        }
        if (value_19.descriptor() != _M_KEYS)
        {   break label_60;
        }Term sub_82 = value_19.sub(0).ref();
        /* #keys=sub */
        if (term_88.descriptor() != _M__sNil)
        {   break label_60;
        }/*Contract*/sink.properties(safeRef(props_39));
        sink.start(_M_OutputFuncDeclarations); sink.copy(sub_82.ref());
        sink.end(); return true;
      }
      label_42: {
        if (term_88.descriptor() != _M__sCons)
        {   break label_42;
        }Term sub_86 = term_88.sub(0).ref();
        /* #key=sub */Term sub_79 = term_88.sub(1).ref();
        /* #keys=sub *//*Contract*/sink.properties(safeRef(props_39));
        sink.start(_M_OutputDataDeclarationsForKey);
        sink.start(_M_UnDATASORT);
        sink.start(_M__s);sink.properties(safeRef(props_39));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(sub_86.ref());
        sink.end();
        sink.end(); sink.copy(sub_79.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputDataDeclarations, props_39, term_88);
  } final public static boolean _M_OutputImportGrammarDeclarations(Sink sink, int shared, int depth, Properties props_19, Term term_67) {
    if (depth < 2000) {
      label_140: {
        Term value_67 = props_19 == null ? null : props_19.lookup("$datakeys");
        if (value_67 == null) 
        {   break label_140;
        }
        if (value_67.descriptor() != _M_KEYS)
        {   break label_140;
        }Term sub_14 = value_67.sub(0).ref();
        /* #keys=sub */
        if (term_67.descriptor() != _M__sNil)
        {   break label_140;
        }/*Contract*/sink.properties(safeRef(props_19));
        sink.start(_M_OutputDataDeclarations); sink.copy(sub_14.ref());
        sink.end(); return true;
      }
      label_72: {
        if (term_67.descriptor() != _M__sCons)
        {   break label_72;
        }Term sub_64 = term_67.sub(0).ref();
        /* #import=sub */Term sub_45 = term_67.sub(1).ref();
        /* #imports=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclaration_xA2);
        sink.start(_M_Crsx_ximportDeclaration_xA3); sink.literal("import"); sink.literal("grammar");
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.copy(sub_64.ref());
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();sink.properties(safeRef(props_19));
        sink.start(_M_OutputImportGrammarDeclarations); sink.copy(sub_45.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputImportGrammarDeclarations, props_19, term_67);
  } final public static boolean _M_OutputImportDeclarations(Sink sink, int shared, int depth, Properties props_40, Term term_99) {
    if (depth < 2000) {
      label_65: {
        Term value_57 = props_40 == null ? null : props_40.lookup("$grammars");
        if (value_57 == null) 
        {   break label_65;
        }
        if (value_57.descriptor() != _M_IMPORTS)
        {   break label_65;
        }Term sub_12 = value_57.sub(0).ref();
        /* #imported=sub */
        if (term_99.descriptor() != _M__sNil)
        {   break label_65;
        }/*Contract*/sink.properties(safeRef(props_40));
        sink.start(_M_OutputImportGrammarDeclarations); sink.copy(sub_12.ref());
        sink.end(); return true;
      }
      label_73: {
        if (term_99.descriptor() != _M__sCons)
        {   break label_73;
        }Term sub_4 = term_99.sub(0).ref();
        /* #import=sub */Term sub_75 = term_99.sub(1).ref();
        /* #imports=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclaration_xA2);
        sink.start(_M_Crsx_ximportDeclaration_xA2); sink.literal("import"); sink.literal("module");
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.copy(sub_4.ref());
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();sink.properties(safeRef(props_40));
        sink.start(_M_OutputImportDeclarations); sink.copy(sub_75.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputImportDeclarations, props_40, term_99);
  } final public static boolean _M_OutputCrsx(Sink sink, int shared, int depth, Properties props_59, Term term_77) {
    if (depth < 2000) {
      label_46: {
        Term value_160 = props_59 == null ? null : props_59.lookup("$imported");
        if (value_160 == null) 
        {   break label_46;
        }
        if (value_160.descriptor() != _M_IMPORTS)
        {   break label_46;
        }Term sub_46 = value_160.sub(0).ref();
        /* #imported=sub */
        if (term_77.descriptor() != _M_OK)
        {   break label_46;
        }/*Contract*/
        sink.start(_M_Crsx_xcrsx);
        sink.start(_M_Crsx_xdeclarations);
        sink.start(_M_Crsx_xdeclaration_xA5);
        sink.start(_M_Crsx_xdirective_xA1);
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.literal("$Lax");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();sink.properties(safeRef(props_59));
        sink.start(_M_OutputImportDeclarations); sink.copy(sub_46.ref());
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputCrsx, props_59, term_77);
  } final public static boolean _M_AddFuncSort2(Sink sink, int shared, int depth, Properties props_6, Term term_35, Term term_12, Term term_4, Variable var, Term term_82) {
    if (depth < 2000) {
      label_41: {
        if (term_35.descriptor() != _M_FUNCSORT)
        {   break label_41;
        }Term sub_74 = term_35.sub(0).ref();
        /* #qualifier=sub */Term sub_7 = term_35.sub(1).ref();
        /* #sort=sub */
        /* #key=term */
        if (term_4.descriptor() != _M_Crsx_xsortDeclaration_xA2)
        {   break label_41;
        }Term sub_119 = term_4.sub(0).ref();
        /* #sortparams?=sub */Term sub_138 = term_4.sub(1).ref();
        /* #sortset=sub */Term sub_26 = term_4.sub(2).ref();
        if (sub_26.descriptor() != _M_Crsx_xform_xA1)
        {   break label_41;
        }Term sub_38 = sub_26.sub(0).ref();
        /* #constructor=sub */Term sub_78 = sub_26.sub(1).ref();
        /* #arguments?=sub */Term sub_48 = term_4.sub(3).ref();Term sub_80 = term_4.sub(4).ref();
        /* #sortname=sub */
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("Function sort already defined:");
        sink.start(_M_ConstructorToString); sink.copy(sub_38.ref());
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_80: {
        Term value_146 = props_6 == null ? null : props_6.lookup("$funckeys");
        if (value_146 == null) 
        {   break label_80;
        }
        if (value_146.descriptor() != _M_KEYS)
        {   break label_80;
        }Term sub_20 = value_146.sub(0).ref();
        /* #keys=sub */
        Term value_80 = props_6 == null ? null : props_6.lookup("$qualifier");
        if (value_80 == null) 
        {   break label_80;
        }
        if (value_80.descriptor() != _M_STR)
        {   break label_80;
        }Term sub_83 = value_80.sub(0).ref();
        /* #qualifier=sub */
        if (term_35.descriptor() != _M_NOCONTENTENTRY)
        {   break label_80;
        }
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_6));Term term_32;
        {
          BufferSink buf = sink.context().makeBuffer();
          buf.start(_M_FUNCSORT); buf.copy(sub_83.ref()); buf.copy(term_4.ref());
          buf.end();
          term_32 = buf.term();
        }
        term_12 = force(sink.context(), term_12);
        Sink.property(sink, term_12, term_32);Term term_30;
        {
          BufferSink buf_8 = sink.context().makeBuffer();
          buf_8.start(_M_KEYS);
          buf_8.start(_M__sCons); buf_8.copy(term_12.ref()); buf_8.copy(sub_20.ref());
          buf_8.end();
          buf_8.end();
          term_30 = buf_8.term();
        } sink.propertyNamed("$funckeys", term_30);Term term_90;
        {
          BufferSink buf_32 = sink.context().makeBuffer(); buf_32.start(_M_OK); buf_32.end();
          term_90 = buf_32.term();
        }
        sink.substitute(term_82.ref(), new Variable[] { var }, new Term[] {term_90}); return true;
      }
    }
    return thunk(sink, _M_AddFuncSort2, props_6, term_35, term_12, term_4, var, term_82);
  }     final public static boolean _M_AddFuncSort1(Sink sink, int shared, int depth, Properties props_83, Term term_181, Term term_52, Variable var_4, Term term_93) {
    if (depth < 2000) {
      label_17: {
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_83));
        sink.start(_M_AddFuncSort2);
        sink.start(_M__s);sink.properties(safeRef(props_83));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_181.ref()); sink.start(_M_NOCONTENTENTRY); sink.end();
        sink.end(); sink.copy(term_181.ref()); sink.copy(term_52.ref());
        Variable var_25 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_25});
        VariableUse use = sink.context().makeVariableUse(var_25);
        sink.substitute(term_93.ref(), new Variable[] { var_4 }, new Term[] {use});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddFuncSort1, props_83, term_181, term_52, var_4, term_93);
  }    final public static boolean _M_AddFuncSort(Sink sink, int shared, int depth, Properties props_42, Term term_307, Variable var_35, Term term_21) {
    if (depth < 2000) {
      label_7: {
        if (term_307.descriptor() != _M_Crsx_xsortDeclaration_xA2)
        {   break label_7;
        }Term sub_34 = term_307.sub(0).ref();
        /* #sortparams?=sub */Term sub_132 = term_307.sub(1).ref();
        /* #sortset=sub */Term sub_35 = term_307.sub(2).ref();
        if (sub_35.descriptor() != _M_Crsx_xform_xA1)
        {   break label_7;
        }Term sub_77 = sub_35.sub(0).ref();
        /* #constructor=sub */Term sub_128 = sub_35.sub(1).ref();
        /* #arguments?=sub */Term sub_29 = term_307.sub(3).ref();Term sub_59 = term_307.sub(4).ref();
        /* #sortname=sub */
        /* #=term *//*Contract*/sink.properties(safeRef(props_42));
        sink.start(_M_AddFuncSort1);
        sink.start(_M_FuncSortKey); sink.copy(sub_77.ref());
        sink.end();
        sink.start(_M_Crsx_xsortDeclaration_xA2); sink.copy(sub_34.ref()); sink.copy(sub_132.ref());
        sink.start(_M_Crsx_xform_xA1); sink.copy(sub_77.ref()); sink.copy(sub_128.ref());
        sink.end(); sink.literal("::"); sink.copy(sub_59.ref());
        sink.end();
        Variable var_70 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_70});
        VariableUse use_66 = sink.context().makeVariableUse(var_70);
        sink.substitute(term_21.ref(), new Variable[] { var_35 }, new Term[] {use_66});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddFuncSort, props_42, term_307, var_35, term_21);
  }   final public static boolean _M_AddDataForm2(Sink sink, int shared, int depth, Properties props_36, Term term_107, Term term_54, Term term_34, Term term_193, Term term_71, Term term_75) {
    if (depth < 2000) {
      label_40: {
        if (term_107.descriptor() != _M_DATASORT)
        {   break label_40;
        }Term sub_186 = term_107.sub(0).ref();
        /* #sort=sub */
        /* #key=term */
        if (term_34.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_40;
        }Term sub_134 = term_34.sub(0).ref();
        if (sub_134.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_40;
        }Term sub_55 = term_34.sub(1).ref();
        /* #CONSTRUCTOR1=sub */
        if (term_193.descriptor() != _M_Crsx_xsortname_xA1)
        {   break label_40;
        }Term sub_53 = term_193.sub(0).ref();
        if (sub_53.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_40;
        }Term sub_62 = sub_53.sub(0).ref();
        if (sub_62.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_40;
        }Term sub_50 = sub_53.sub(1).ref();
        /* #CONSTRUCTOR2=sub */Term sub_15 = term_193.sub(1).ref();
        /* #sortarguments?=sub */
        /* #sortdecl=term */
        /* #CONTINUATION=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("Error: duplicate data form "); sink.copy(sub_55.ref()); sink.literal(" found in sort "); sink.copy(sub_50.ref()); sink.literal(".");
        sink.end();
        sink.end(); return true;
      }
      label_13: {
        Term value_94 = props_36 == null ? null : props_36.lookup("$qualifier");
        if (value_94 == null) 
        {   break label_13;
        }
        if (value_94.descriptor() != _M_STR)
        {   break label_13;
        }Term sub_32 = value_94.sub(0).ref();
        /* #qualifier=sub */
        if (term_107.descriptor() != _M_NOCONTENTENTRY)
        {   break label_13;
        }
        /* #key=term */
        /* #constructor=term */
        /* #sortname=term */
        /* #sortdecl=term */
        if (term_75.descriptor() != _M_CONTINUATION)
        {   break label_13;
        }Term sub_52 = term_75.sub(0).ref();
        Variable binder = term_75.binders(0)[0];
        /* #=sub *//*Contract*/sink.properties(safeRef(props_36));Term term_36;
        {
          BufferSink buf_0 = sink.context().makeBuffer();
          buf_0.start(_M_DATASORT);
          buf_0.start(_M__sCons);
          buf_0.start(_M_QSORT); buf_0.copy(sub_32.ref()); buf_0.copy(term_71.ref());
          buf_0.end(); buf_0.start(_M__sNil); buf_0.end();
          buf_0.end();
          buf_0.end();
          term_36 = buf_0.term();
        }
        term_54 = force(sink.context(), term_54);
        Sink.property(sink, term_54, term_36);Term term_168;
        {
          BufferSink buf_96 = sink.context().makeBuffer(); buf_96.start(_M_OK); buf_96.end();
          term_168 = buf_96.term();
        }
        sink.substitute(sub_52.ref(), new Variable[] { binder }, new Term[] {term_168}); return true; 
      }
    }
    return thunk(sink, _M_AddDataForm2, props_36, term_107, term_54, term_34, term_193, term_71, term_75);
  }      final public static boolean _M_AddDataForm1(Sink sink, int shared, int depth, Properties props_26, Term term_18, Term term_38, Term term_5, Term term_20, Term term_63) {
    if (depth < 2000) {sink.properties(safeRef(props_26));
      sink.start(_M_AddDataForm2);
      sink.start(_M__s);sink.properties(safeRef(props_26));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_18.ref()); sink.start(_M_NOCONTENTENTRY); sink.end();
      sink.end(); sink.copy(term_18.ref()); sink.copy(term_38.ref()); sink.copy(term_5.ref()); sink.copy(term_20.ref()); sink.copy(term_63.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_AddDataForm1, props_26, term_18, term_38, term_5, term_20, term_63);
  }     final public static boolean _M_AddDataForm(Sink sink, int shared, int depth, Properties props_41, Term term_216, Term term_349, Term term_56, Term term_27) {
    if (depth < 2000) {
      label_61: {
        if (term_216.descriptor() != _M_Crsx_xforms_xS1)
        {   break label_61;
        }Term sub_13 = term_216.sub(0).ref();
        if (sub_13.descriptor() != _M_Crsx_xform_xA1)
        {   break label_61;
        }Term sub_173 = sub_13.sub(0).ref();
        /* #constructor=sub */Term sub_165 = sub_13.sub(1).ref();
        /* #arguments?=sub */Term sub_224 = term_216.sub(1).ref();
        /* #sortname=term */
        /* #sortdecl=term */
        /* #CONTINUATION=term *//*Contract*/sink.properties(safeRef(props_41));
        sink.start(_M_AddDataForm1);
        sink.start(_M_DataFormKey); sink.copy(sub_173.ref());
        sink.end(); sink.copy(sub_173.ref()); sink.copy(term_349.ref()); sink.copy(term_56.ref()); sink.copy(term_27.ref());
        sink.end(); return true;
      }
      label_176: {
        if (term_216.descriptor() != _M_Crsx_xforms_xS1)
        {   break label_176;
        }Term sub_18 = term_216.sub(0).ref();
        if (sub_18.descriptor() != _M_Crsx_xform_xA2)
        {   break label_176;
        }Term sub_76 = sub_18.sub(0).ref();
        /* #variable=sub */Term sub_40 = term_216.sub(1).ref();
        /* #sortname=term */
        /* #sortdecl=term */
        if (term_27.descriptor() != _M_CONTINUATION)
        {   break label_176;
        }Term sub_291 = term_27.sub(0).ref();
        Variable binder_77 = term_27.binders(0)[0];
        /* #=sub *//*Contract*/sink.properties(safeRef(props_41));Term term_25;
        {
          BufferSink buf_39 = sink.context().makeBuffer(); buf_39.start(_M_OK); buf_39.end();
          term_25 = buf_39.term();
        }
        sink.substitute(sub_291.ref(), new Variable[] { binder_77 }, new Term[] {term_25}); return true; 
      }
    }
    return thunk(sink, _M_AddDataForm, props_41, term_216, term_349, term_56, term_27);
  }    final public static boolean _M_AddDataSort3(Sink sink, int shared, int depth, Properties props_58, Term term_61, Term term_13, Term term_53, Variable var_98, Term term_66) {
    if (depth < 2000) {
      label_47: {
        Term value_0 = props_58 == null ? null : props_58.lookup("$qualifier");
        if (value_0 == null) 
        {   break label_47;
        }
        if (value_0.descriptor() != _M_STR)
        {   break label_47;
        }Term sub_68 = value_0.sub(0).ref();
        /* #qualifier=sub */
        if (term_61.descriptor() != _M_DATASORT)
        {   break label_47;
        }Term sub_123 = term_61.sub(0).ref();
        /* #sorts=sub */
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_58));Term term_114;
        {
          BufferSink buf_41 = sink.context().makeBuffer();
          buf_41.start(_M_DATASORT);
          buf_41.start(_M__sCons);
          buf_41.start(_M_QSORT); buf_41.copy(sub_68.ref()); buf_41.copy(term_53.ref());
          buf_41.end(); buf_41.copy(sub_123.ref());
          buf_41.end();
          buf_41.end();
          term_114 = buf_41.term();
        }
        term_13 = force(sink.context(), term_13);
        Sink.property(sink, term_13, term_114);Term term_33;
        {
          BufferSink buf_21 = sink.context().makeBuffer(); buf_21.start(_M_OK); buf_21.end();
          term_33 = buf_21.term();
        }
        sink.substitute(term_66.ref(), new Variable[] { var_98 }, new Term[] {term_33}); return true;
      }
      label_85: {
        Term value_82 = props_58 == null ? null : props_58.lookup("$datakeys");
        if (value_82 == null) 
        {   break label_85;
        }
        if (value_82.descriptor() != _M_KEYS)
        {   break label_85;
        }Term sub_0 = value_82.sub(0).ref();
        /* #keys=sub */
        Term value_47 = props_58 == null ? null : props_58.lookup("$qualifier");
        if (value_47 == null) 
        {   break label_85;
        }
        if (value_47.descriptor() != _M_STR)
        {   break label_85;
        }Term sub_144 = value_47.sub(0).ref();
        /* #qualifier=sub */
        if (term_61.descriptor() != _M_NOCONTENTENTRY)
        {   break label_85;
        }
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_58));Term term_2;
        {
          BufferSink buf_142 = sink.context().makeBuffer();
          buf_142.start(_M_DATASORT);
          buf_142.start(_M__sCons);
          buf_142.start(_M_QSORT); buf_142.copy(sub_144.ref()); buf_142.copy(term_53.ref());
          buf_142.end(); buf_142.start(_M__sNil); buf_142.end();
          buf_142.end();
          buf_142.end();
          term_2 = buf_142.term();
        }
        term_13 = force(sink.context(), term_13);
        Sink.property(sink, term_13, term_2);Term term_48;
        {
          BufferSink buf_18 = sink.context().makeBuffer();
          buf_18.start(_M_KEYS);
          buf_18.start(_M__sCons); buf_18.copy(term_13.ref()); buf_18.copy(sub_0.ref());
          buf_18.end();
          buf_18.end();
          term_48 = buf_18.term();
        } sink.propertyNamed("$datakeys", term_48);Term term_79;
        {
          BufferSink buf_84 = sink.context().makeBuffer(); buf_84.start(_M_OK); buf_84.end();
          term_79 = buf_84.term();
        }
        sink.substitute(term_66.ref(), new Variable[] { var_98 }, new Term[] {term_79}); return true;
      }
    }
    return thunk(sink, _M_AddDataSort3, props_58, term_61, term_13, term_53, var_98, term_66);
  }     final public static boolean _M_AddDataSort2(Sink sink, int shared, int depth, Properties props_13, Term term_14, Term term_140, Variable var_75, Term term_65) {
    if (depth < 2000) {
      label_170: {
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_13));
        sink.start(_M_AddDataSort3);
        sink.start(_M__s);sink.properties(safeRef(props_13));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_14.ref()); sink.start(_M_NOCONTENTENTRY); sink.end();
        sink.end(); sink.copy(term_14.ref()); sink.copy(term_140.ref());
        Variable var_22 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_22});
        VariableUse use_52 = sink.context().makeVariableUse(var_22);
        sink.substitute(term_65.ref(), new Variable[] { var_75 }, new Term[] {use_52});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddDataSort2, props_13, term_14, term_140, var_75, term_65);
  }    final public static boolean _M_AddDataSort1(Sink sink, int shared, int depth, Properties props_43, Term term_147, Term term_80, Variable var_44, Term term_73) {
    if (depth < 2000) {
      label_49: {
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_43));
        sink.start(_M_AddDataSort2); sink.copy(term_147.ref()); sink.copy(term_80.ref());
        Variable var_83 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_83});
        VariableUse use_96 = sink.context().makeVariableUse(var_83);
        sink.substitute(term_73.ref(), new Variable[] { var_44 }, new Term[] {use_96});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddDataSort1, props_43, term_147, term_80, var_44, term_73);
  }    final public static boolean _M_AddDataSort(Sink sink, int shared, int depth, Properties props_27, Term term_37, Variable var_49, Term term_17) {
    if (depth < 2000) {
      label_11: {
        if (term_37.descriptor() != _M_Crsx_xsortDeclaration_xA1)
        {   break label_11;
        }Term sub_93 = term_37.sub(0).ref();
        /* #sortparams?=sub */Term sub_348 = term_37.sub(1).ref();
        /* #sortset=sub */Term sub_98 = term_37.sub(2).ref();
        /* #sortname=sub */Term sub_60 = term_37.sub(3).ref();Term sub_8 = term_37.sub(4).ref();Term sub_141 = term_37.sub(5).ref();
        if (sub_141.descriptor() != _M_Crsx_xforms)
        {   break label_11;
        }Term sub_84 = sub_141.sub(0).ref();
        /* #forms_S1*=sub */Term sub_42 = term_37.sub(6).ref();
        /* #=term *//*Contract*/sink.properties(safeRef(props_27));
        sink.start(_M_AddDataSort1);
        sink.start(_M_DataSortKey); sink.copy(sub_98.ref());
        sink.end();
        sink.start(_M_Crsx_xsortDeclaration_xA1); sink.copy(sub_93.ref()); sink.copy(sub_348.ref()); sink.copy(sub_98.ref()); sink.literal("::="); sink.literal("(");
        sink.start(_M_Crsx_xforms); sink.copy(sub_84.ref());
        sink.end(); sink.literal(")");
        sink.end();
        Variable var_63 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_63});
        sink.start(_M_SeqMap);
        Variable var_19 = sink.context().makeVariable("form");
        Variable var_50 = sink.context().makeVariable("cont");
        sink.binds(new Variable[] {var_19,var_50});
        sink.start(_M_AddDataForm); sink.use(var_19); sink.copy(sub_98.ref());
        sink.start(_M_Crsx_xsortDeclaration_xA1); sink.copy(sub_93.ref()); sink.copy(sub_348.ref()); sink.copy(sub_98.ref()); sink.literal("::="); sink.literal("(");
        sink.start(_M_Crsx_xforms); sink.copy(sub_84.ref());
        sink.end(); sink.literal(")");
        sink.end(); sink.use(var_50);
        sink.end(); sink.copy(sub_84.ref());
        Variable var_36 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_36});
        VariableUse use_81 = sink.context().makeVariableUse(var_36);
        sink.substitute(term_17.ref(), new Variable[] { var_49 }, new Term[] {use_81});
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddDataSort, props_27, term_37, var_49, term_17);
  }   final public static boolean _M_AddRule3(Sink sink, int shared, int depth, Properties props_95, Term term_3, Term term_139, Term term_41, Variable var_13, Term term_190) {
    if (depth < 2000) {
      label_12: {
        if (term_3.descriptor() != _M_RULES)
        {   break label_12;
        }Term sub_65 = term_3.sub(0).ref();
        /* #rules=sub */
        /* #key=term */
        /* #ruleDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_95));Term term_46;
        {
          BufferSink buf_64 = sink.context().makeBuffer();
          buf_64.start(_M_RULES);
          buf_64.start(_M_Concat); buf_64.copy(sub_65.ref());
          buf_64.start(_M__sCons); buf_64.copy(term_41.ref()); buf_64.start(_M__sNil); buf_64.end();
          buf_64.end();
          buf_64.end();
          buf_64.end();
          term_46 = buf_64.term();
        }
        term_139 = force(sink.context(), term_139);
        Sink.property(sink, term_139, term_46);Term term_9;
        {
          BufferSink buf_79 = sink.context().makeBuffer(); buf_79.start(_M_OK); buf_79.end();
          term_9 = buf_79.term();
        }
        sink.substitute(term_190.ref(), new Variable[] { var_13 }, new Term[] {term_9}); return true;
      }
      label_25: {
        Term value_40 = props_95 == null ? null : props_95.lookup("$rulekeys");
        if (value_40 == null) 
        {   break label_25;
        }
        if (value_40.descriptor() != _M_KEYS)
        {   break label_25;
        }Term sub_58 = value_40.sub(0).ref();
        /* #keys=sub */
        if (term_3.descriptor() != _M_NOCONTENTENTRY)
        {   break label_25;
        }
        /* #key=term */
        /* #ruleDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_95));Term term_51;
        {
          BufferSink buf_83 = sink.context().makeBuffer();
          buf_83.start(_M_RULES);
          buf_83.start(_M__sCons); buf_83.copy(term_41.ref()); buf_83.start(_M__sNil); buf_83.end();
          buf_83.end();
          buf_83.end();
          term_51 = buf_83.term();
        }
        term_139 = force(sink.context(), term_139);
        Sink.property(sink, term_139, term_51);Term term_120;
        {
          BufferSink buf_42 = sink.context().makeBuffer();
          buf_42.start(_M_KEYS);
          buf_42.start(_M__sCons); buf_42.copy(term_139.ref()); buf_42.copy(sub_58.ref());
          buf_42.end();
          buf_42.end();
          term_120 = buf_42.term();
        } sink.propertyNamed("$rulekeys", term_120);Term term_50;
        {
          BufferSink buf_49 = sink.context().makeBuffer(); buf_49.start(_M_OK); buf_49.end();
          term_50 = buf_49.term();
        }
        sink.substitute(term_190.ref(), new Variable[] { var_13 }, new Term[] {term_50}); return true;
      }
    }
    return thunk(sink, _M_AddRule3, props_95, term_3, term_139, term_41, var_13, term_190);
  }     final public static boolean _M_AddRule2(Sink sink, int shared, int depth, Properties props_69, Term term_227, Term term_84, Variable var_57, Term term_62) {
    if (depth < 2000) {
      label_175: {
        /* #key=term */
        /* #ruleDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_69));
        sink.start(_M_AddRule3);
        sink.start(_M__s);sink.properties(safeRef(props_69));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_227.ref()); sink.start(_M_NOCONTENTENTRY); sink.end();
        sink.end(); sink.copy(term_227.ref()); sink.copy(term_84.ref());
        Variable var_8 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_8});
        VariableUse use_35 = sink.context().makeVariableUse(var_8);
        sink.substitute(term_62.ref(), new Variable[] { var_57 }, new Term[] {use_35});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddRule2, props_69, term_227, term_84, var_57, term_62);
  }    final public static boolean _M_AddRule(Sink sink, int shared, int depth, Properties props_115, Term term_95, Term term_185, Variable var_94, Term term_39) {
    if (depth < 2000) {
      label_75: {
        /* #key=term */
        /* #ruleDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_115));
        sink.start(_M_AddRule2); sink.copy(term_95.ref()); sink.copy(term_185.ref());
        Variable var_42 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_42});
        VariableUse use_11 = sink.context().makeVariableUse(var_42);
        sink.substitute(term_39.ref(), new Variable[] { var_94 }, new Term[] {use_11});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddRule, props_115, term_95, term_185, var_94, term_39);
  }    final public static boolean _M_LookupSortByConstructor1(Sink sink, int shared, int depth, Term term_174, Term term_143) {
    if (depth < 2000) {
      label_138: {
        if (term_174.descriptor() != _M_SOME)
        {   break label_138;
        }Term sub_320 = term_174.sub(0).ref();
        /* #1=sub */
        /* #2=term *//*Contract*/
        sink.start(_M_SOME); sink.copy(sub_320.ref());
        sink.end(); return true;
      }
      label_15: {
        if (term_174.descriptor() != _M_NONE)
        {   break label_15;
        }
        /* #2=term *//*Contract*/ sink.copy(term_143.ref()); return true;
      }
    }
    return thunk(sink, _M_LookupSortByConstructor1, term_174, term_143);
  }  final public static boolean _M_LookupSortByConstructor(Sink sink, int shared, int depth, Properties props_32, Term term_291) {
    if (depth < 2000) {
      sink.start(_M_LookupSortByConstructor1);sink.properties(safeRef(props_32));
      sink.start(_M_GetSome);
      sink.start(_M_FuncSortKey); sink.copy(term_291.ref());
      sink.end();
      sink.end();sink.properties(safeRef(props_32));
      sink.start(_M_GetSome);
      sink.start(_M_DataFormKey); sink.copy(term_291.ref());
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_LookupSortByConstructor, props_32, term_291);
  } final public static boolean _M_LookupModule(Sink sink, int shared, int depth, Properties props_49, Term term_87) {
    if (depth < 2000) {sink.properties(safeRef(props_49));
      sink.start(_M_GetSome); sink.start(_M_ModuleKey); sink.copy(term_87.ref()); sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_LookupModule, props_49, term_87);
  } final public static boolean _M_ConstructorToString(Sink sink, int shared, int depth, Term term_47) {
    if (depth < 2000) {
      label_82: {
        if (term_47.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_82;
        }Term sub_150 = term_47.sub(0).ref();
        if (sub_150.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_82;
        }Term sub_6 = term_47.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/ sink.copy(sub_6.ref()); return true;
      }
      label_155: {
        if (term_47.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_155;
        }Term sub_284 = term_47.sub(0).ref();
        if (sub_284.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_155;
        }Term sub_195 = sub_284.sub(0).ref();/*Contract*/ sink.literal(":"); return true;
      }
    }
    return thunk(sink, _M_ConstructorToString, term_47);
  } final public static boolean _M_SortnameToString(Sink sink, int shared, int depth, Term term_40) {
    if (depth < 2000) {
      label_70: {
        if (term_40.descriptor() != _M_Crsx_xsortname_xA1)
        {   break label_70;
        }Term sub_88 = term_40.sub(0).ref();
        if (sub_88.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_70;
        }Term sub_158 = sub_88.sub(0).ref();
        if (sub_158.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_70;
        }Term sub_182 = sub_88.sub(1).ref();
        /* #CONSTRUCTOR=sub */Term sub_181 = term_40.sub(1).ref();
        /* #sortarguments?=sub *//*Contract*/ sink.copy(sub_182.ref()); return true;
      }
      label_197: {
        if (term_40.descriptor() != _M_Crsx_xsortname_xA1)
        {   break label_197;
        }Term sub_69 = term_40.sub(0).ref();
        if (sub_69.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_197;
        }Term sub_73 = sub_69.sub(0).ref();
        if (sub_73.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_197;
        }Term sub_94 = sub_73.sub(0).ref();Term sub_5 = term_40.sub(1).ref();
        /* #sortarguments?=sub *//*Contract*/ sink.literal(":"); return true;
      }
    }
    return thunk(sink, _M_SortnameToString, term_40);
  } final public static boolean _M_FuncSortKey(Sink sink, int shared, int depth, Term term_118) {
    if (depth < 2000) {
      label_2: {
        if (term_118.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_2;
        }Term sub_176 = term_118.sub(0).ref();
        if (sub_176.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_2;
        }Term sub_31 = term_118.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$func$"); sink.copy(sub_31.ref());
        sink.end(); return true;
      }
      label_69: {
        if (term_118.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_69;
        }Term sub_70 = term_118.sub(0).ref();
        if (sub_70.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_69;
        }Term sub_164 = sub_70.sub(0).ref();/*Contract*/ sink.literal("$func$:"); return true;
      }
    }
    return thunk(sink, _M_FuncSortKey, term_118);
  } final public static boolean _M_DataFormKey(Sink sink, int shared, int depth, Term term_58) {
    if (depth < 2000) {
      label_92: {
        if (term_58.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_92;
        }Term sub_43 = term_58.sub(0).ref();
        if (sub_43.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_92;
        }Term sub_2 = term_58.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$form$"); sink.copy(sub_2.ref());
        sink.end(); return true;
      }
      label_36: {
        if (term_58.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_36;
        }Term sub_10 = term_58.sub(0).ref();
        if (sub_10.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_36;
        }Term sub_162 = sub_10.sub(0).ref();/*Contract*/ sink.literal("$form$:"); return true;
      }
    }
    return thunk(sink, _M_DataFormKey, term_58);
  } final public static boolean _M_DataSortKey(Sink sink, int shared, int depth, Term term_124) {
    if (depth < 2000) {
      label_77: {
        if (term_124.descriptor() != _M_Crsx_xsortname_xA1)
        {   break label_77;
        }Term sub_166 = term_124.sub(0).ref();
        if (sub_166.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_77;
        }Term sub_168 = sub_166.sub(0).ref();
        if (sub_168.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_77;
        }Term sub_37 = sub_166.sub(1).ref();
        /* #CONSTRUCTOR=sub */Term sub_199 = term_124.sub(1).ref();
        /* #sortarguments?=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$data$"); sink.copy(sub_37.ref());
        sink.end(); return true;
      }
      label_84: {
        if (term_124.descriptor() != _M_Crsx_xsortname_xA1)
        {   break label_84;
        }Term sub_222 = term_124.sub(0).ref();
        if (sub_222.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_84;
        }Term sub_160 = sub_222.sub(0).ref();
        if (sub_160.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_84;
        }Term sub_156 = sub_160.sub(0).ref();Term sub_205 = term_124.sub(1).ref();
        /* #sortarguments?=sub *//*Contract*/ sink.literal("$data$:"); return true;
      }
    }
    return thunk(sink, _M_DataSortKey, term_124);
  } final public static boolean _M_RulesKey(Sink sink, int shared, int depth, Term term_309) {
    if (depth < 2000) {
      label_58: {
        if (term_309.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_58;
        }Term sub_72 = term_309.sub(0).ref();
        if (sub_72.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_58;
        }Term sub_63 = term_309.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$rules$"); sink.copy(sub_63.ref());
        sink.end(); return true;
      }
      label_45: {
        if (term_309.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_45;
        }Term sub_163 = term_309.sub(0).ref();
        if (sub_163.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_45;
        }Term sub_227 = sub_163.sub(0).ref();/*Contract*/ sink.literal("$rules$:"); return true;
      }
    }
    return thunk(sink, _M_RulesKey, term_309);
  } final public static boolean _M_UnRULES(Sink sink, int shared, int depth, Term term_127) {
    if (depth < 2000) {
      label_290: {
        if (term_127.descriptor() != _M_RULES)
        {   break label_290;
        }Term sub_117 = term_127.sub(0).ref(); /* #=sub *//*Contract*/ sink.copy(sub_117.ref()); return true;
      }
    }
    return thunk(sink, _M_UnRULES, term_127);
  } final public static boolean _M_UnFUNCSORT(Sink sink, int shared, int depth, Term term_1) {
    if (depth < 2000) {
      label_29: {
        if (term_1.descriptor() != _M_FUNCSORT)
        {   break label_29;
        }Term sub_197 = term_1.sub(0).ref();
        /* #1=sub */Term sub_140 = term_1.sub(1).ref(); /* #=sub *//*Contract*/ sink.copy(sub_140.ref()); return true;
      }
    }
    return thunk(sink, _M_UnFUNCSORT, term_1);
  } final public static boolean _M_UnDATASORT(Sink sink, int shared, int depth, Term term_285) {
    if (depth < 2000) {
      label_106: {
        if (term_285.descriptor() != _M_DATASORT)
        {   break label_106;
        }Term sub_100 = term_285.sub(0).ref(); /* #=sub *//*Contract*/ sink.copy(sub_100.ref()); return true;
      }
    }
    return thunk(sink, _M_UnDATASORT, term_285);
  } final public static boolean _M_AddModuleKey2(Sink sink, int shared, int depth, Properties props_38, Term term_170, Term term_250, Term term_15, Term term_6, Term term_158, Variable var_66, Term term_117) {
    if (depth < 2000) {
      label_38: {
        /* #key=term */
        /* #filename=term */
        /* #main=term */
        /* #modules=term */
        /* #notloaded=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_38));Term term_31;
        {
          BufferSink buf_59 = sink.context().makeBuffer();
          buf_59.start(_M_MODULE); buf_59.copy(term_250.ref()); buf_59.copy(term_15.ref()); buf_59.start(_M_NOTLOADED); buf_59.end();
          buf_59.end();
          term_31 = buf_59.term();
        }
        term_170 = force(sink.context(), term_170);
        Sink.property(sink, term_170, term_31);Term term_89;
        {
          BufferSink buf_88 = sink.context().makeBuffer();
          buf_88.start(_M_MODULES); buf_88.copy(term_6.ref());
          buf_88.end();
          term_89 = buf_88.term();
        } sink.propertyNamed("$modules", term_89);Term term_83;
        {
          BufferSink buf_65 = sink.context().makeBuffer();
          buf_65.start(_M_MODULES); buf_65.copy(term_158.ref());
          buf_65.end();
          term_83 = buf_65.term();
        } sink.propertyNamed("$notloaded", term_83);Term term_187;
        {
          BufferSink buf_27 = sink.context().makeBuffer(); buf_27.start(_M_OK); buf_27.end();
          term_187 = buf_27.term();
        }
        sink.substitute(term_117.ref(), new Variable[] { var_66 }, new Term[] {term_187}); return true;
      }
    }
    return thunk(sink, _M_AddModuleKey2, props_38, term_170, term_250, term_15, term_6, term_158, var_66, term_117);
  }       final public static boolean _M_AddModuleKey(Sink sink, int shared, int depth, Properties props_46, Term term_74, Term term_259, Term term_96, Variable var_71, Term term_60) {
    if (depth < 2000) {
      label_32: {
        Term value_52 = props_46 == null ? null : props_46.lookup("$modules");
        if (value_52 == null) 
        {   break label_32;
        }
        if (value_52.descriptor() != _M_MODULES)
        {   break label_32;
        }Term sub_108 = value_52.sub(0).ref();
        /* #modules=sub */
        Term value_54 = props_46 == null ? null : props_46.lookup("$notloaded");
        if (value_54 == null) 
        {   break label_32;
        }
        if (value_54.descriptor() != _M_MODULES)
        {   break label_32;
        }Term sub_185 = value_54.sub(0).ref();
        /* #notloaded=sub */
        /* #key=term */
        /* #filename=term */
        /* #main=term */
        /* #=term *//*Contract*/
        sink.start(_M__s);sink.properties(safeRef(props_46));
        sink.start(_M_Builtin_sIfDef);
        sink.end(); sink.copy(term_74.ref());sink.properties(safeRef(props_46));Term term_192;
        {
          BufferSink buf_90 = sink.context().makeBuffer(); buf_90.start(_M_OK); buf_90.end();
          term_192 = buf_90.term();
        }
        sink.substitute(term_60.ref(), new Variable[] { var_71 }, new Term[] {term_192});sink.properties(safeRef(props_46));
        sink.start(_M_AddModuleKey2); sink.copy(term_74.ref()); sink.copy(term_259.ref()); sink.copy(term_96.ref());
        sink.start(_M_Concat); sink.copy(sub_108.ref());
        sink.start(_M__sCons); sink.copy(term_74.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.start(_M_Concat); sink.copy(sub_185.ref());
        sink.start(_M__sCons); sink.copy(term_74.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        Variable var_0 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_0});
        VariableUse use_94 = sink.context().makeVariableUse(var_0);
        sink.substitute(term_60.ref(), new Variable[] { var_71 }, new Term[] {use_94});
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddModuleKey, props_46, term_74, term_259, term_96, var_71, term_60);
  }     final public static boolean _M_AddModule(Sink sink, int shared, int depth, Properties props_18, Term term_218, Term term_163, Variable var_85, Term term_165) {
    if (depth < 2000) {
      label_37: {
        /* #filename=term */
        /* #main=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_18));
        sink.start(_M_AddModuleKey);
        sink.start(_M_ModuleKey); sink.copy(term_218.ref());
        sink.end(); sink.copy(term_218.ref()); sink.copy(term_163.ref());
        Variable var_80 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_80});
        VariableUse use_34 = sink.context().makeVariableUse(var_80);
        sink.substitute(term_165.ref(), new Variable[] { var_85 }, new Term[] {use_34});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddModule, props_18, term_218, term_163, var_85, term_165);
  }    final public static boolean _M_ModuleKey(Sink sink, int shared, int depth, Term term_194) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$module$"); sink.copy(term_194.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_ModuleKey, term_194);
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