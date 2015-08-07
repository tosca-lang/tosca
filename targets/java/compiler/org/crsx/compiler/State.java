/* START MODULE state.crs.java */
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
  final public static DynamicFunctionDescriptor _M_ModuleKey = makeFunction("ModuleKey", State.class, "_M_ModuleKey");final public static boolean _M_OutputRuleDeclarationsForKey(Sink sink, int shared, int depth, Properties props, Term term, Term term_65) {
    if (depth < 2000) {
      label: {
        term = force(sink.context(), term);
        if (term.descriptor() != _M__sNil)
        {   break label;
        }
        /* #keys=term *//*Contract*/sink.properties(safeRef(props));
        sink.start(_M_OutputRuleDeclarations); sink.copy(term_65.ref());
        sink.end(); return true;
      }
      label_21: {
        term = force(sink.context(), term);
        if (term.descriptor() != _M__sCons)
        {   break label_21;
        }Term sub = forceSub(sink.context(), term, 0).ref();
        /* #rule=sub */Term sub_50 = forceSub(sink.context(), term, 1).ref();
        /* #rules=sub */
        /* #keys=term *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclaration_xA3); sink.copy(sub.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.start(_M_OutputRuleDeclarationsForKey); sink.copy(sub_50.ref()); sink.copy(term_65.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputRuleDeclarationsForKey, props, term, term_65);
  }  final public static boolean _M_OutputRuleDeclarations(Sink sink, int shared, int depth, Properties props_17, Term term_91) {
    if (depth < 2000) {
      label_59: {
        term_91 = force(sink.context(), term_91);
        if (term_91.descriptor() != _M__sNil)
        {   break label_59;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_55: {
        term_91 = force(sink.context(), term_91);
        if (term_91.descriptor() != _M__sCons)
        {   break label_55;
        }Term sub_42 = forceSub(sink.context(), term_91, 0).ref();
        /* #key=sub */Term sub_49 = forceSub(sink.context(), term_91, 1).ref();
        /* #keys=sub *//*Contract*/sink.properties(safeRef(props_17));
        sink.start(_M_OutputRuleDeclarationsForKey);
        sink.start(_M_UnRULES);
        sink.start(_M__s);sink.properties(safeRef(props_17));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(sub_42.ref());
        sink.end();
        sink.end(); sink.copy(sub_49.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputRuleDeclarations, props_17, term_91);
  } final public static boolean _M_OutputFuncDeclaration(Sink sink, int shared, int depth, Properties props_24, Term term_62, Term term_40) {
    if (depth < 2000) {
      sink.start(_M__sCons);
      sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
      sink.start(_M__sCons);
      sink.start(_M_Crsx_xdeclaration_xA4); sink.copy(term_62.ref());
      sink.end(); sink.start(_M__sNil); sink.end();
      sink.end();
      sink.end();
      sink.start(_M_OutputFuncDeclarations); sink.copy(term_40.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_OutputFuncDeclaration, props_24, term_62, term_40);
  }  final public static boolean _M_OutputFuncDeclarations(Sink sink, int shared, int depth, Properties props_49, Term term_6) {
    if (depth < 2000) {
      label_92: {
        Term value = props_49 == null ? null : props_49.lookup("$rulekeys");
        if (value == null) 
        {   break label_92;
        }
        value = force(sink.context(), value);
        if (value.descriptor() != _M_KEYS)
        {   break label_92;
        }Term sub_8 = forceSub(sink.context(), value, 0).ref();
        /* #keys=sub */
        term_6 = force(sink.context(), term_6);
        if (term_6.descriptor() != _M__sNil)
        {   break label_92;
        }/*Contract*/sink.properties(safeRef(props_49));
        sink.start(_M_OutputRuleDeclarations); sink.copy(sub_8.ref());
        sink.end(); return true;
      }
      label_53: {
        term_6 = force(sink.context(), term_6);
        if (term_6.descriptor() != _M__sCons)
        {   break label_53;
        }Term sub_88 = forceSub(sink.context(), term_6, 0).ref();
        /* #key=sub */Term sub_97 = forceSub(sink.context(), term_6, 1).ref();
        /* #keys=sub *//*Contract*/sink.properties(safeRef(props_49));
        sink.start(_M_OutputFuncDeclaration);
        sink.start(_M_UnFUNCSORT);
        sink.start(_M__s);sink.properties(safeRef(props_49));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(sub_88.ref());
        sink.end();
        sink.end(); sink.copy(sub_97.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputFuncDeclarations, props_49, term_6);
  } final public static boolean _M_OutputDataDeclarationsForKey(Sink sink, int shared, int depth, Properties props_27, Term term_70, Term term_5) {
    if (depth < 2000) {
      label_38: {
        term_70 = force(sink.context(), term_70);
        if (term_70.descriptor() != _M__sNil)
        {   break label_38;
        }
        /* #keys=term *//*Contract*/sink.properties(safeRef(props_27));
        sink.start(_M_OutputDataDeclarations); sink.copy(term_5.ref());
        sink.end(); return true;
      }
      label_81: {
        term_70 = force(sink.context(), term_70);
        if (term_70.descriptor() != _M__sCons)
        {   break label_81;
        }Term sub_26 = forceSub(sink.context(), term_70, 0).ref();
        sub_26 = force(sink.context(), sub_26);
        if (sub_26.descriptor() != _M_QSORT)
        {   break label_81;
        }Term sub_20 = forceSub(sink.context(), sub_26, 0).ref();
        /* #qualifier=sub */Term sub_52 = forceSub(sink.context(), sub_26, 1).ref();
        /* #sort=sub */Term sub_21 = forceSub(sink.context(), term_70, 1).ref();
        /* #qsorts=sub */
        /* #keys=term *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclaration_xA4); sink.copy(sub_52.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.start(_M_OutputDataDeclarationsForKey); sink.copy(sub_21.ref()); sink.copy(term_5.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputDataDeclarationsForKey, props_27, term_70, term_5);
  }  final public static boolean _M_OutputDataDeclarations(Sink sink, int shared, int depth, Properties props_97, Term term_119) {
    if (depth < 2000) {
      label_47: {
        Term value_59 = props_97 == null ? null : props_97.lookup("$funckeys");
        if (value_59 == null) 
        {   break label_47;
        }
        value_59 = force(sink.context(), value_59);
        if (value_59.descriptor() != _M_KEYS)
        {   break label_47;
        }Term sub_72 = forceSub(sink.context(), value_59, 0).ref();
        /* #keys=sub */
        term_119 = force(sink.context(), term_119);
        if (term_119.descriptor() != _M__sNil)
        {   break label_47;
        }/*Contract*/sink.properties(safeRef(props_97));
        sink.start(_M_OutputFuncDeclarations); sink.copy(sub_72.ref());
        sink.end(); return true;
      }
      label_2: {
        term_119 = force(sink.context(), term_119);
        if (term_119.descriptor() != _M__sCons)
        {   break label_2;
        }Term sub_57 = forceSub(sink.context(), term_119, 0).ref();
        /* #key=sub */Term sub_77 = forceSub(sink.context(), term_119, 1).ref();
        /* #keys=sub *//*Contract*/sink.properties(safeRef(props_97));
        sink.start(_M_OutputDataDeclarationsForKey);
        sink.start(_M_UnDATASORT);
        sink.start(_M__s);sink.properties(safeRef(props_97));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(sub_57.ref());
        sink.end();
        sink.end(); sink.copy(sub_77.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputDataDeclarations, props_97, term_119);
  } final public static boolean _M_OutputImportGrammarDeclarations(Sink sink, int shared, int depth, Properties props_22, Term term_90) {
    if (depth < 2000) {
      label_76: {
        Term value_67 = props_22 == null ? null : props_22.lookup("$datakeys");
        if (value_67 == null) 
        {   break label_76;
        }
        value_67 = force(sink.context(), value_67);
        if (value_67.descriptor() != _M_KEYS)
        {   break label_76;
        }Term sub_18 = forceSub(sink.context(), value_67, 0).ref();
        /* #keys=sub */
        term_90 = force(sink.context(), term_90);
        if (term_90.descriptor() != _M__sNil)
        {   break label_76;
        }/*Contract*/sink.properties(safeRef(props_22));
        sink.start(_M_OutputDataDeclarations); sink.copy(sub_18.ref());
        sink.end(); return true;
      }
      label_3: {
        term_90 = force(sink.context(), term_90);
        if (term_90.descriptor() != _M__sCons)
        {   break label_3;
        }Term sub_96 = forceSub(sink.context(), term_90, 0).ref();
        /* #import=sub */Term sub_95 = forceSub(sink.context(), term_90, 1).ref();
        /* #imports=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclaration_xA2);
        sink.start(_M_Crsx_ximportDeclaration_xA3); sink.literal("import"); sink.literal("grammar");
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.copy(sub_96.ref());
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.start(_M_OutputImportGrammarDeclarations); sink.copy(sub_95.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputImportGrammarDeclarations, props_22, term_90);
  } final public static boolean _M_OutputImportDeclarations(Sink sink, int shared, int depth, Properties props_41, Term term_63) {
    if (depth < 2000) {
      label_10: {
        Term value_51 = props_41 == null ? null : props_41.lookup("$grammars");
        if (value_51 == null) 
        {   break label_10;
        }
        value_51 = force(sink.context(), value_51);
        if (value_51.descriptor() != _M_IMPORTS)
        {   break label_10;
        }Term sub_73 = forceSub(sink.context(), value_51, 0).ref();
        /* #imported=sub */
        term_63 = force(sink.context(), term_63);
        if (term_63.descriptor() != _M__sNil)
        {   break label_10;
        }/*Contract*/sink.properties(safeRef(props_41));
        sink.start(_M_OutputImportGrammarDeclarations); sink.copy(sub_73.ref());
        sink.end(); return true;
      }
      label_9: {
        term_63 = force(sink.context(), term_63);
        if (term_63.descriptor() != _M__sCons)
        {   break label_9;
        }Term sub_61 = forceSub(sink.context(), term_63, 0).ref();
        /* #import=sub */Term sub_9 = forceSub(sink.context(), term_63, 1).ref();
        /* #imports=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclaration_xA2);
        sink.start(_M_Crsx_ximportDeclaration_xA2); sink.literal("import"); sink.literal("module");
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.copy(sub_61.ref());
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.start(_M_OutputImportDeclarations); sink.copy(sub_9.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputImportDeclarations, props_41, term_63);
  } final public static boolean _M_OutputCrsx(Sink sink, int shared, int depth, Properties props_86, Term term_126) {
    if (depth < 2000) {
      label_75: {
        Term value_31 = props_86 == null ? null : props_86.lookup("$imported");
        if (value_31 == null) 
        {   break label_75;
        }
        value_31 = force(sink.context(), value_31);
        if (value_31.descriptor() != _M_IMPORTS)
        {   break label_75;
        }Term sub_81 = forceSub(sink.context(), value_31, 0).ref();
        /* #imported=sub */
        term_126 = force(sink.context(), term_126);
        if (term_126.descriptor() != _M_OK)
        {   break label_75;
        }/*Contract*/
        sink.start(_M_Crsx_xcrsx);
        sink.start(_M_Crsx_xdeclarations);
        sink.start(_M_Crsx_xdeclaration_xA5);
        sink.start(_M_Crsx_xdirective_xA1);
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.literal("$Lax");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();sink.properties(safeRef(props_86));
        sink.start(_M_OutputImportDeclarations); sink.copy(sub_81.ref());
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputCrsx, props_86, term_126);
  } final public static boolean _M_AddFuncSort2(Sink sink, int shared, int depth, Properties props_30, Term term_27, Term term_57, Term term_35, Variable var, Term term_59) {
    if (depth < 2000) {
      label_17: {
        term_27 = force(sink.context(), term_27);
        if (term_27.descriptor() != _M_FUNCSORT)
        {   break label_17;
        }Term sub_84 = forceSub(sink.context(), term_27, 0).ref();
        /* #qualifier=sub */Term sub_7 = forceSub(sink.context(), term_27, 1).ref();
        /* #sort=sub */
        /* #key=term */
        term_35 = force(sink.context(), term_35);
        if (term_35.descriptor() != _M_Crsx_xsortDeclaration_xA2)
        {   break label_17;
        }Term sub_3 = forceSub(sink.context(), term_35, 0).ref();
        /* #sortparams?=sub */Term sub_2 = forceSub(sink.context(), term_35, 1).ref();
        /* #sortset=sub */Term sub_65 = forceSub(sink.context(), term_35, 2).ref();
        sub_65 = force(sink.context(), sub_65);
        if (sub_65.descriptor() != _M_Crsx_xform_xA1)
        {   break label_17;
        }Term sub_16 = forceSub(sink.context(), sub_65, 0).ref();
        /* #constructor=sub */Term sub_39 = forceSub(sink.context(), sub_65, 1).ref();
        /* #arguments?=sub */Term sub_38 = forceSub(sink.context(), term_35, 3).ref();Term sub_46 = forceSub(sink.context(), term_35, 4).ref();
        /* #sortname=sub */
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("Function sort already defined:");
        sink.start(_M_ConstructorToString); sink.copy(sub_16.ref());
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_5: {
        Term value_4 = props_30 == null ? null : props_30.lookup("$funckeys");
        if (value_4 == null) 
        {   break label_5;
        }
        value_4 = force(sink.context(), value_4);
        if (value_4.descriptor() != _M_KEYS)
        {   break label_5;
        }Term sub_78 = forceSub(sink.context(), value_4, 0).ref();
        /* #keys=sub */
        Term value_57 = props_30 == null ? null : props_30.lookup("$qualifier");
        if (value_57 == null) 
        {   break label_5;
        }
        value_57 = force(sink.context(), value_57);
        if (value_57.descriptor() != _M_STR)
        {   break label_5;
        }Term sub_76 = forceSub(sink.context(), value_57, 0).ref();
        /* #qualifier=sub */
        term_27 = force(sink.context(), term_27);
        if (term_27.descriptor() != _M_NOCONTENTENTRY)
        {   break label_5;
        }
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_30));Term term_38;
        {
          BufferSink buf = sink.context().makeBuffer();
          buf.start(_M_FUNCSORT); buf.copy(sub_76.ref()); buf.copy(term_35.ref());
          buf.end();
          term_38 = buf.term();
        }
        term_57 = force(sink.context(), term_57);
        Sink.property(sink, term_57, term_38);Term term_96;
        {
          BufferSink buf_38 = sink.context().makeBuffer();
          buf_38.start(_M_KEYS);
          buf_38.start(_M__sCons); buf_38.copy(term_57.ref()); buf_38.copy(sub_78.ref());
          buf_38.end();
          buf_38.end();
          term_96 = buf_38.term();
        } sink.propertyNamed("$funckeys", term_96);Term term_99;
        {
          BufferSink buf_95 = sink.context().makeBuffer(); buf_95.start(_M_OK); buf_95.end();
          term_99 = buf_95.term();
        }
        sink.substitute(term_59.ref(), new Variable[] { var }, new Term[] {term_99}); return true;
      }
    }
    return thunk(sink, _M_AddFuncSort2, props_30, term_27, term_57, term_35, var, term_59);
  }     final public static boolean _M_AddFuncSort1(Sink sink, int shared, int depth, Properties props_175, Term term_41, Term term_82, Variable var_10, Term term_12) {
    if (depth < 2000) {
      label_23: {
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_175));
        sink.start(_M_AddFuncSort2);
        sink.start(_M__s);sink.properties(safeRef(props_175));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_41.ref()); sink.start(_M_NOCONTENTENTRY); sink.end();
        sink.end(); sink.copy(term_41.ref()); sink.copy(term_82.ref());
        Variable var_50 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_50});
        VariableUse use = sink.context().makeVariableUse(var_50);
        sink.substitute(term_12.ref(), new Variable[] { var_10 }, new Term[] {use});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddFuncSort1, props_175, term_41, term_82, var_10, term_12);
  }    final public static boolean _M_AddFuncSort(Sink sink, int shared, int depth, Properties props_44, Term term_69, Variable var_96, Term term_10) {
    if (depth < 2000) {
      label_18: {
        term_69 = force(sink.context(), term_69);
        if (term_69.descriptor() != _M_Crsx_xsortDeclaration_xA2)
        {   break label_18;
        }Term sub_141 = forceSub(sink.context(), term_69, 0).ref();
        /* #sortparams?=sub */Term sub_56 = forceSub(sink.context(), term_69, 1).ref();
        /* #sortset=sub */Term sub_0 = forceSub(sink.context(), term_69, 2).ref();
        sub_0 = force(sink.context(), sub_0);
        if (sub_0.descriptor() != _M_Crsx_xform_xA1)
        {   break label_18;
        }Term sub_41 = forceSub(sink.context(), sub_0, 0).ref();
        /* #constructor=sub */Term sub_62 = forceSub(sink.context(), sub_0, 1).ref();
        /* #arguments?=sub */Term sub_91 = forceSub(sink.context(), term_69, 3).ref();Term sub_11 = forceSub(sink.context(), term_69, 4).ref();
        /* #sortname=sub */
        /* #=term *//*Contract*/sink.properties(safeRef(props_44));
        sink.start(_M_AddFuncSort1);
        sink.start(_M_FuncSortKey); sink.copy(sub_41.ref());
        sink.end();
        sink.start(_M_Crsx_xsortDeclaration_xA2); sink.copy(sub_141.ref()); sink.copy(sub_56.ref());
        sink.start(_M_Crsx_xform_xA1); sink.copy(sub_41.ref()); sink.copy(sub_62.ref());
        sink.end(); sink.literal("::"); sink.copy(sub_11.ref());
        sink.end();
        Variable var_188 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_188});
        VariableUse use_82 = sink.context().makeVariableUse(var_188);
        sink.substitute(term_10.ref(), new Variable[] { var_96 }, new Term[] {use_82});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddFuncSort, props_44, term_69, var_96, term_10);
  }   final public static boolean _M_AddDataForm2(Sink sink, int shared, int depth, Properties props_73, Term term_1, Term term_17, Term term_98, Term term_75, Term term_34, Term term_88) {
    if (depth < 2000) {
      label_84: {
        term_1 = force(sink.context(), term_1);
        if (term_1.descriptor() != _M_DATASORT)
        {   break label_84;
        }Term sub_32 = forceSub(sink.context(), term_1, 0).ref();
        /* #sort=sub */
        /* #key=term */
        term_98 = force(sink.context(), term_98);
        if (term_98.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_84;
        }Term sub_94 = forceSub(sink.context(), term_98, 0).ref();
        sub_94 = force(sink.context(), sub_94);
        if (sub_94.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_84;
        }Term sub_29 = forceSub(sink.context(), term_98, 1).ref();
        /* #CONSTRUCTOR1=sub */
        term_75 = force(sink.context(), term_75);
        if (term_75.descriptor() != _M_Crsx_xsortname_xA1)
        {   break label_84;
        }Term sub_30 = forceSub(sink.context(), term_75, 0).ref();
        sub_30 = force(sink.context(), sub_30);
        if (sub_30.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_84;
        }Term sub_25 = forceSub(sink.context(), sub_30, 0).ref();
        sub_25 = force(sink.context(), sub_25);
        if (sub_25.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_84;
        }Term sub_123 = forceSub(sink.context(), sub_30, 1).ref();
        /* #CONSTRUCTOR2=sub */Term sub_4 = forceSub(sink.context(), term_75, 1).ref();
        /* #sortarguments?=sub */
        /* #sortdecl=term */
        /* #CONTINUATION=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("Error: duplicate data form "); sink.copy(sub_29.ref()); sink.literal(" found in sort "); sink.copy(sub_123.ref()); sink.literal(".");
        sink.end();
        sink.end(); return true;
      }
      label_25: {
        Term value_78 = props_73 == null ? null : props_73.lookup("$qualifier");
        if (value_78 == null) 
        {   break label_25;
        }
        value_78 = force(sink.context(), value_78);
        if (value_78.descriptor() != _M_STR)
        {   break label_25;
        }Term sub_193 = forceSub(sink.context(), value_78, 0).ref();
        /* #qualifier=sub */
        term_1 = force(sink.context(), term_1);
        if (term_1.descriptor() != _M_NOCONTENTENTRY)
        {   break label_25;
        }
        /* #key=term */
        /* #constructor=term */
        /* #sortname=term */
        /* #sortdecl=term */
        term_88 = force(sink.context(), term_88);
        if (term_88.descriptor() != _M_CONTINUATION)
        {   break label_25;
        }Term sub_100 = forceSub(sink.context(), term_88, 0).ref();
        Variable binder = term_88.binders(0)[0];
        /* #=sub *//*Contract*/sink.properties(safeRef(props_73));Term term_32;
        {
          BufferSink buf_87 = sink.context().makeBuffer();
          buf_87.start(_M_DATASORT);
          buf_87.start(_M__sCons);
          buf_87.start(_M_QSORT); buf_87.copy(sub_193.ref()); buf_87.copy(term_34.ref());
          buf_87.end(); buf_87.start(_M__sNil); buf_87.end();
          buf_87.end();
          buf_87.end();
          term_32 = buf_87.term();
        }
        term_17 = force(sink.context(), term_17);
        Sink.property(sink, term_17, term_32);Term term_53;
        {
          BufferSink buf_40 = sink.context().makeBuffer(); buf_40.start(_M_OK); buf_40.end();
          term_53 = buf_40.term();
        }
        sink.substitute(sub_100.ref(), new Variable[] { binder }, new Term[] {term_53}); return true; 
      }
    }
    return thunk(sink, _M_AddDataForm2, props_73, term_1, term_17, term_98, term_75, term_34, term_88);
  }      final public static boolean _M_AddDataForm1(Sink sink, int shared, int depth, Properties props_21, Term term_16, Term term_178, Term term_87, Term term_19, Term term_15) {
    if (depth < 2000) {sink.properties(safeRef(props_21));
      sink.start(_M_AddDataForm2);
      sink.start(_M__s);sink.properties(safeRef(props_21));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_16.ref()); sink.start(_M_NOCONTENTENTRY); sink.end();
      sink.end(); sink.copy(term_16.ref()); sink.copy(term_178.ref()); sink.copy(term_87.ref()); sink.copy(term_19.ref()); sink.copy(term_15.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_AddDataForm1, props_21, term_16, term_178, term_87, term_19, term_15);
  }     final public static boolean _M_AddDataForm(Sink sink, int shared, int depth, Properties props_39, Term term_166, Term term_79, Term term_72, Term term_85) {
    if (depth < 2000) {
      label_90: {
        term_166 = force(sink.context(), term_166);
        if (term_166.descriptor() != _M_Crsx_xforms_xS1)
        {   break label_90;
        }Term sub_6 = forceSub(sink.context(), term_166, 0).ref();
        sub_6 = force(sink.context(), sub_6);
        if (sub_6.descriptor() != _M_Crsx_xform_xA1)
        {   break label_90;
        }Term sub_148 = forceSub(sink.context(), sub_6, 0).ref();
        /* #constructor=sub */Term sub_17 = forceSub(sink.context(), sub_6, 1).ref();
        /* #arguments?=sub */Term sub_86 = forceSub(sink.context(), term_166, 1).ref();
        /* #sortname=term */
        /* #sortdecl=term */
        /* #CONTINUATION=term *//*Contract*/sink.properties(safeRef(props_39));
        sink.start(_M_AddDataForm1);
        sink.start(_M_DataFormKey); sink.copy(sub_148.ref());
        sink.end(); sink.copy(sub_148.ref()); sink.copy(term_79.ref()); sink.copy(term_72.ref()); sink.copy(term_85.ref());
        sink.end(); return true;
      }
      label_37: {
        term_166 = force(sink.context(), term_166);
        if (term_166.descriptor() != _M_Crsx_xforms_xS1)
        {   break label_37;
        }Term sub_135 = forceSub(sink.context(), term_166, 0).ref();
        sub_135 = force(sink.context(), sub_135);
        if (sub_135.descriptor() != _M_Crsx_xform_xA2)
        {   break label_37;
        }Term sub_98 = forceSub(sink.context(), sub_135, 0).ref();
        /* #variable=sub */Term sub_89 = forceSub(sink.context(), term_166, 1).ref();
        /* #sortname=term */
        /* #sortdecl=term */
        term_85 = force(sink.context(), term_85);
        if (term_85.descriptor() != _M_CONTINUATION)
        {   break label_37;
        }Term sub_153 = forceSub(sink.context(), term_85, 0).ref();
        Variable binder_11 = term_85.binders(0)[0];
        /* #=sub *//*Contract*/sink.properties(safeRef(props_39));Term term_80;
        {
          BufferSink buf_66 = sink.context().makeBuffer(); buf_66.start(_M_OK); buf_66.end();
          term_80 = buf_66.term();
        }
        sink.substitute(sub_153.ref(), new Variable[] { binder_11 }, new Term[] {term_80}); return true; 
      }
    }
    return thunk(sink, _M_AddDataForm, props_39, term_166, term_79, term_72, term_85);
  }    final public static boolean _M_AddDataSort3(Sink sink, int shared, int depth, Properties props_67, Term term_89, Term term_55, Term term_30, Variable var_56, Term term_195) {
    if (depth < 2000) {
      label_8: {
        Term value_77 = props_67 == null ? null : props_67.lookup("$qualifier");
        if (value_77 == null) 
        {   break label_8;
        }
        value_77 = force(sink.context(), value_77);
        if (value_77.descriptor() != _M_STR)
        {   break label_8;
        }Term sub_155 = forceSub(sink.context(), value_77, 0).ref();
        /* #qualifier=sub */
        term_89 = force(sink.context(), term_89);
        if (term_89.descriptor() != _M_DATASORT)
        {   break label_8;
        }Term sub_85 = forceSub(sink.context(), term_89, 0).ref();
        /* #sorts=sub */
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_67));Term term_45;
        {
          BufferSink buf_32 = sink.context().makeBuffer();
          buf_32.start(_M_DATASORT);
          buf_32.start(_M__sCons);
          buf_32.start(_M_QSORT); buf_32.copy(sub_155.ref()); buf_32.copy(term_30.ref());
          buf_32.end(); buf_32.copy(sub_85.ref());
          buf_32.end();
          buf_32.end();
          term_45 = buf_32.term();
        }
        term_55 = force(sink.context(), term_55);
        Sink.property(sink, term_55, term_45);Term term_97;
        {
          BufferSink buf_12 = sink.context().makeBuffer(); buf_12.start(_M_OK); buf_12.end();
          term_97 = buf_12.term();
        }
        sink.substitute(term_195.ref(), new Variable[] { var_56 }, new Term[] {term_97}); return true;
      }
      label_34: {
        Term value_37 = props_67 == null ? null : props_67.lookup("$datakeys");
        if (value_37 == null) 
        {   break label_34;
        }
        value_37 = force(sink.context(), value_37);
        if (value_37.descriptor() != _M_KEYS)
        {   break label_34;
        }Term sub_71 = forceSub(sink.context(), value_37, 0).ref();
        /* #keys=sub */
        Term value_86 = props_67 == null ? null : props_67.lookup("$qualifier");
        if (value_86 == null) 
        {   break label_34;
        }
        value_86 = force(sink.context(), value_86);
        if (value_86.descriptor() != _M_STR)
        {   break label_34;
        }Term sub_254 = forceSub(sink.context(), value_86, 0).ref();
        /* #qualifier=sub */
        term_89 = force(sink.context(), term_89);
        if (term_89.descriptor() != _M_NOCONTENTENTRY)
        {   break label_34;
        }
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_67));Term term_21;
        {
          BufferSink buf_68 = sink.context().makeBuffer();
          buf_68.start(_M_DATASORT);
          buf_68.start(_M__sCons);
          buf_68.start(_M_QSORT); buf_68.copy(sub_254.ref()); buf_68.copy(term_30.ref());
          buf_68.end(); buf_68.start(_M__sNil); buf_68.end();
          buf_68.end();
          buf_68.end();
          term_21 = buf_68.term();
        }
        term_55 = force(sink.context(), term_55);
        Sink.property(sink, term_55, term_21);Term term_128;
        {
          BufferSink buf_90 = sink.context().makeBuffer();
          buf_90.start(_M_KEYS);
          buf_90.start(_M__sCons); buf_90.copy(term_55.ref()); buf_90.copy(sub_71.ref());
          buf_90.end();
          buf_90.end();
          term_128 = buf_90.term();
        } sink.propertyNamed("$datakeys", term_128);Term term_44;
        {
          BufferSink buf_86 = sink.context().makeBuffer(); buf_86.start(_M_OK); buf_86.end();
          term_44 = buf_86.term();
        }
        sink.substitute(term_195.ref(), new Variable[] { var_56 }, new Term[] {term_44}); return true;
      }
    }
    return thunk(sink, _M_AddDataSort3, props_67, term_89, term_55, term_30, var_56, term_195);
  }     final public static boolean _M_AddDataSort2(Sink sink, int shared, int depth, Properties props_23, Term term_184, Term term_94, Variable var_51, Term term_7) {
    if (depth < 2000) {
      label_70: {
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_23));
        sink.start(_M_AddDataSort3);
        sink.start(_M__s);sink.properties(safeRef(props_23));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_184.ref()); sink.start(_M_NOCONTENTENTRY); sink.end();
        sink.end(); sink.copy(term_184.ref()); sink.copy(term_94.ref());
        Variable var_25 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_25});
        VariableUse use_94 = sink.context().makeVariableUse(var_25);
        sink.substitute(term_7.ref(), new Variable[] { var_51 }, new Term[] {use_94});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddDataSort2, props_23, term_184, term_94, var_51, term_7);
  }    final public static boolean _M_AddDataSort1(Sink sink, int shared, int depth, Properties props_5, Term term_168, Term term_253, Variable var_27, Term term_95) {
    if (depth < 2000) {
      label_113: {
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_5));
        sink.start(_M_AddDataSort2); sink.copy(term_168.ref()); sink.copy(term_253.ref());
        Variable var_15 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_15});
        VariableUse use_32 = sink.context().makeVariableUse(var_15);
        sink.substitute(term_95.ref(), new Variable[] { var_27 }, new Term[] {use_32});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddDataSort1, props_5, term_168, term_253, var_27, term_95);
  }    final public static boolean _M_AddDataSort(Sink sink, int shared, int depth, Properties props_87, Term term_112, Variable var_93, Term term_170) {
    if (depth < 2000) {
      label_60: {
        term_112 = force(sink.context(), term_112);
        if (term_112.descriptor() != _M_Crsx_xsortDeclaration_xA1)
        {   break label_60;
        }Term sub_149 = forceSub(sink.context(), term_112, 0).ref();
        /* #sortparams?=sub */Term sub_87 = forceSub(sink.context(), term_112, 1).ref();
        /* #sortset=sub */Term sub_60 = forceSub(sink.context(), term_112, 2).ref();
        /* #sortname=sub */Term sub_184 = forceSub(sink.context(), term_112, 3).ref();Term sub_160 = forceSub(sink.context(), term_112, 4).ref();Term sub_64 = forceSub(sink.context(), term_112, 5).ref();
        sub_64 = force(sink.context(), sub_64);
        if (sub_64.descriptor() != _M_Crsx_xforms)
        {   break label_60;
        }Term sub_74 = forceSub(sink.context(), sub_64, 0).ref();
        /* #forms_S1*=sub */Term sub_28 = forceSub(sink.context(), term_112, 6).ref();
        /* #=term *//*Contract*/sink.properties(safeRef(props_87));
        sink.start(_M_AddDataSort1);
        sink.start(_M_DataSortKey); sink.copy(sub_60.ref());
        sink.end();
        sink.start(_M_Crsx_xsortDeclaration_xA1); sink.copy(sub_149.ref()); sink.copy(sub_87.ref()); sink.copy(sub_60.ref()); sink.literal("::="); sink.literal("(");
        sink.start(_M_Crsx_xforms); sink.copy(sub_74.ref());
        sink.end(); sink.literal(")");
        sink.end();
        Variable var_55 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_55});
        sink.start(_M_ThenSeqMap); sink.use(var_55);
        Variable var_60 = sink.context().makeVariable("form");
        Variable var_0 = sink.context().makeVariable("cont");
        sink.binds(new Variable[] {var_60,var_0});
        sink.start(_M_AddDataForm); sink.use(var_60); sink.copy(sub_60.ref());
        sink.start(_M_Crsx_xsortDeclaration_xA1); sink.copy(sub_149.ref()); sink.copy(sub_87.ref()); sink.copy(sub_60.ref()); sink.literal("::="); sink.literal("(");
        sink.start(_M_Crsx_xforms); sink.copy(sub_74.ref());
        sink.end(); sink.literal(")");
        sink.end(); sink.use(var_0);
        sink.end(); sink.copy(sub_74.ref());
        Variable var_75 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_75});
        VariableUse use_49 = sink.context().makeVariableUse(var_75);
        sink.substitute(term_170.ref(), new Variable[] { var_93 }, new Term[] {use_49});
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddDataSort, props_87, term_112, var_93, term_170);
  }   final public static boolean _M_AddRule3(Sink sink, int shared, int depth, Properties props_12, Term term_66, Term term_52, Term term_9, Variable var_172, Term term_3) {
    if (depth < 2000) {
      label_127: {
        term_66 = force(sink.context(), term_66);
        if (term_66.descriptor() != _M_RULES)
        {   break label_127;
        }Term sub_68 = forceSub(sink.context(), term_66, 0).ref();
        /* #rules=sub */
        /* #key=term */
        /* #ruleDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_12));Term term_26;
        {
          BufferSink buf_54 = sink.context().makeBuffer();
          buf_54.start(_M_RULES);
          buf_54.start(_M_Concat); buf_54.copy(sub_68.ref());
          buf_54.start(_M__sCons); buf_54.copy(term_9.ref()); buf_54.start(_M__sNil); buf_54.end();
          buf_54.end();
          buf_54.end();
          buf_54.end();
          term_26 = buf_54.term();
        }
        term_52 = force(sink.context(), term_52);
        Sink.property(sink, term_52, term_26);Term term_84;
        {
          BufferSink buf_96 = sink.context().makeBuffer(); buf_96.start(_M_OK); buf_96.end();
          term_84 = buf_96.term();
        }
        sink.substitute(term_3.ref(), new Variable[] { var_172 }, new Term[] {term_84}); return true;
      }
      label_89: {
        Term value_74 = props_12 == null ? null : props_12.lookup("$rulekeys");
        if (value_74 == null) 
        {   break label_89;
        }
        value_74 = force(sink.context(), value_74);
        if (value_74.descriptor() != _M_KEYS)
        {   break label_89;
        }Term sub_240 = forceSub(sink.context(), value_74, 0).ref();
        /* #keys=sub */
        term_66 = force(sink.context(), term_66);
        if (term_66.descriptor() != _M_NOCONTENTENTRY)
        {   break label_89;
        }
        /* #key=term */
        /* #ruleDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_12));Term term_8;
        {
          BufferSink buf_45 = sink.context().makeBuffer();
          buf_45.start(_M_RULES);
          buf_45.start(_M__sCons); buf_45.copy(term_9.ref()); buf_45.start(_M__sNil); buf_45.end();
          buf_45.end();
          buf_45.end();
          term_8 = buf_45.term();
        }
        term_52 = force(sink.context(), term_52);
        Sink.property(sink, term_52, term_8);Term term_122;
        {
          BufferSink buf_42 = sink.context().makeBuffer();
          buf_42.start(_M_KEYS);
          buf_42.start(_M__sCons); buf_42.copy(term_52.ref()); buf_42.copy(sub_240.ref());
          buf_42.end();
          buf_42.end();
          term_122 = buf_42.term();
        } sink.propertyNamed("$rulekeys", term_122);Term term_109;
        {
          BufferSink buf_37 = sink.context().makeBuffer(); buf_37.start(_M_OK); buf_37.end();
          term_109 = buf_37.term();
        }
        sink.substitute(term_3.ref(), new Variable[] { var_172 }, new Term[] {term_109}); return true;
      }
    }
    return thunk(sink, _M_AddRule3, props_12, term_66, term_52, term_9, var_172, term_3);
  }     final public static boolean _M_AddRule2(Sink sink, int shared, int depth, Properties props_81, Term term_143, Term term_76, Variable var_67, Term term_117) {
    if (depth < 2000) {
      label_31: {
        /* #key=term */
        /* #ruleDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_81));
        sink.start(_M_AddRule3);
        sink.start(_M__s);sink.properties(safeRef(props_81));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_143.ref()); sink.start(_M_NOCONTENTENTRY); sink.end();
        sink.end(); sink.copy(term_143.ref()); sink.copy(term_76.ref());
        Variable var_31 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_31});
        VariableUse use_64 = sink.context().makeVariableUse(var_31);
        sink.substitute(term_117.ref(), new Variable[] { var_67 }, new Term[] {use_64});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddRule2, props_81, term_143, term_76, var_67, term_117);
  }    final public static boolean _M_AddRule(Sink sink, int shared, int depth, Properties props_74, Term term_58, Term term_78, Variable var_83, Term term_48) {
    if (depth < 2000) {
      label_52: {
        /* #key=term */
        /* #ruleDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_74));
        sink.start(_M_AddRule2); sink.copy(term_58.ref()); sink.copy(term_78.ref());
        Variable var_18 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_18});
        VariableUse use_99 = sink.context().makeVariableUse(var_18);
        sink.substitute(term_48.ref(), new Variable[] { var_83 }, new Term[] {use_99});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddRule, props_74, term_58, term_78, var_83, term_48);
  }    final public static boolean _M_LookupSortByConstructor1(Sink sink, int shared, int depth, Term term_71, Term term_4) {
    if (depth < 2000) {
      label_0: {
        term_71 = force(sink.context(), term_71);
        if (term_71.descriptor() != _M_SOME)
        {   break label_0;
        }Term sub_34 = forceSub(sink.context(), term_71, 0).ref();
        /* #1=sub */
        /* #2=term *//*Contract*/
        sink.start(_M_SOME); sink.copy(sub_34.ref());
        sink.end(); return true;
      }
      label_96: {
        term_71 = force(sink.context(), term_71);
        if (term_71.descriptor() != _M_NONE)
        {   break label_96;
        }
        /* #2=term *//*Contract*/ sink.copy(term_4.ref()); return true;
      }
    }
    return thunk(sink, _M_LookupSortByConstructor1, term_71, term_4);
  }  final public static boolean _M_LookupSortByConstructor(Sink sink, int shared, int depth, Properties props_42, Term term_31) {
    if (depth < 2000) {
      sink.start(_M_LookupSortByConstructor1);sink.properties(safeRef(props_42));
      sink.start(_M_GetSome);
      sink.start(_M_FuncSortKey); sink.copy(term_31.ref());
      sink.end();
      sink.end();sink.properties(safeRef(props_42));
      sink.start(_M_GetSome);
      sink.start(_M_DataFormKey); sink.copy(term_31.ref());
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_LookupSortByConstructor, props_42, term_31);
  } final public static boolean _M_LookupModule(Sink sink, int shared, int depth, Properties props_54, Term term_29) {
    if (depth < 2000) {sink.properties(safeRef(props_54));
      sink.start(_M_GetSome); sink.start(_M_ModuleKey); sink.copy(term_29.ref()); sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_LookupModule, props_54, term_29);
  } final public static boolean _M_ConstructorToString(Sink sink, int shared, int depth, Term term_56) {
    if (depth < 2000) {
      label_49: {
        term_56 = force(sink.context(), term_56);
        if (term_56.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_49;
        }Term sub_80 = forceSub(sink.context(), term_56, 0).ref();
        sub_80 = force(sink.context(), sub_80);
        if (sub_80.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_49;
        }Term sub_31 = forceSub(sink.context(), term_56, 1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/ sink.copy(sub_31.ref()); return true;
      }
      label_80: {
        term_56 = force(sink.context(), term_56);
        if (term_56.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_80;
        }Term sub_196 = forceSub(sink.context(), term_56, 0).ref();
        sub_196 = force(sink.context(), sub_196);
        if (sub_196.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_80;
        }Term sub_145 = forceSub(sink.context(), sub_196, 0).ref();/*Contract*/ sink.literal(":"); return true;
      }
    }
    return thunk(sink, _M_ConstructorToString, term_56);
  } final public static boolean _M_SortnameToString(Sink sink, int shared, int depth, Term term_186) {
    if (depth < 2000) {
      label_79: {
        term_186 = force(sink.context(), term_186);
        if (term_186.descriptor() != _M_Crsx_xsortname_xA1)
        {   break label_79;
        }Term sub_45 = forceSub(sink.context(), term_186, 0).ref();
        sub_45 = force(sink.context(), sub_45);
        if (sub_45.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_79;
        }Term sub_146 = forceSub(sink.context(), sub_45, 0).ref();
        sub_146 = force(sink.context(), sub_146);
        if (sub_146.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_79;
        }Term sub_93 = forceSub(sink.context(), sub_45, 1).ref();
        /* #CONSTRUCTOR=sub */Term sub_70 = forceSub(sink.context(), term_186, 1).ref();
        /* #sortarguments?=sub *//*Contract*/ sink.copy(sub_93.ref()); return true;
      }
      label_33: {
        term_186 = force(sink.context(), term_186);
        if (term_186.descriptor() != _M_Crsx_xsortname_xA1)
        {   break label_33;
        }Term sub_90 = forceSub(sink.context(), term_186, 0).ref();
        sub_90 = force(sink.context(), sub_90);
        if (sub_90.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_33;
        }Term sub_22 = forceSub(sink.context(), sub_90, 0).ref();
        sub_22 = force(sink.context(), sub_22);
        if (sub_22.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_33;
        }Term sub_150 = forceSub(sink.context(), sub_22, 0).ref();Term sub_172 = forceSub(sink.context(), term_186, 1).ref();
        /* #sortarguments?=sub *//*Contract*/ sink.literal(":"); return true;
      }
    }
    return thunk(sink, _M_SortnameToString, term_186);
  } final public static boolean _M_FuncSortKey(Sink sink, int shared, int depth, Term term_93) {
    if (depth < 2000) {
      label_116: {
        term_93 = force(sink.context(), term_93);
        if (term_93.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_116;
        }Term sub_40 = forceSub(sink.context(), term_93, 0).ref();
        sub_40 = force(sink.context(), sub_40);
        if (sub_40.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_116;
        }Term sub_114 = forceSub(sink.context(), term_93, 1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$func$"); sink.copy(sub_114.ref());
        sink.end(); return true;
      }
      label_15: {
        term_93 = force(sink.context(), term_93);
        if (term_93.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_15;
        }Term sub_67 = forceSub(sink.context(), term_93, 0).ref();
        sub_67 = force(sink.context(), sub_67);
        if (sub_67.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_15;
        }Term sub_154 = forceSub(sink.context(), sub_67, 0).ref();/*Contract*/ sink.literal("$func$:"); return true;
      }
    }
    return thunk(sink, _M_FuncSortKey, term_93);
  } final public static boolean _M_DataFormKey(Sink sink, int shared, int depth, Term term_47) {
    if (depth < 2000) {
      label_167: {
        term_47 = force(sink.context(), term_47);
        if (term_47.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_167;
        }Term sub_112 = forceSub(sink.context(), term_47, 0).ref();
        sub_112 = force(sink.context(), sub_112);
        if (sub_112.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_167;
        }Term sub_24 = forceSub(sink.context(), term_47, 1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$form$"); sink.copy(sub_24.ref());
        sink.end(); return true;
      }
      label_95: {
        term_47 = force(sink.context(), term_47);
        if (term_47.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_95;
        }Term sub_47 = forceSub(sink.context(), term_47, 0).ref();
        sub_47 = force(sink.context(), sub_47);
        if (sub_47.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_95;
        }Term sub_12 = forceSub(sink.context(), sub_47, 0).ref();/*Contract*/ sink.literal("$form$:"); return true;
      }
    }
    return thunk(sink, _M_DataFormKey, term_47);
  } final public static boolean _M_DataSortKey(Sink sink, int shared, int depth, Term term_159) {
    if (depth < 2000) {
      label_119: {
        term_159 = force(sink.context(), term_159);
        if (term_159.descriptor() != _M_Crsx_xsortname_xA1)
        {   break label_119;
        }Term sub_59 = forceSub(sink.context(), term_159, 0).ref();
        sub_59 = force(sink.context(), sub_59);
        if (sub_59.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_119;
        }Term sub_1 = forceSub(sink.context(), sub_59, 0).ref();
        sub_1 = force(sink.context(), sub_1);
        if (sub_1.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_119;
        }Term sub_101 = forceSub(sink.context(), sub_59, 1).ref();
        /* #CONSTRUCTOR=sub */Term sub_212 = forceSub(sink.context(), term_159, 1).ref();
        /* #sortarguments?=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$data$"); sink.copy(sub_101.ref());
        sink.end(); return true;
      }
      label_99: {
        term_159 = force(sink.context(), term_159);
        if (term_159.descriptor() != _M_Crsx_xsortname_xA1)
        {   break label_99;
        }Term sub_82 = forceSub(sink.context(), term_159, 0).ref();
        sub_82 = force(sink.context(), sub_82);
        if (sub_82.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_99;
        }Term sub_33 = forceSub(sink.context(), sub_82, 0).ref();
        sub_33 = force(sink.context(), sub_33);
        if (sub_33.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_99;
        }Term sub_265 = forceSub(sink.context(), sub_33, 0).ref();Term sub_15 = forceSub(sink.context(), term_159, 1).ref();
        /* #sortarguments?=sub *//*Contract*/ sink.literal("$data$:"); return true;
      }
    }
    return thunk(sink, _M_DataSortKey, term_159);
  } final public static boolean _M_RulesKey(Sink sink, int shared, int depth, Term term_64) {
    if (depth < 2000) {
      label_225: {
        term_64 = force(sink.context(), term_64);
        if (term_64.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_225;
        }Term sub_51 = forceSub(sink.context(), term_64, 0).ref();
        sub_51 = force(sink.context(), sub_51);
        if (sub_51.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_225;
        }Term sub_170 = forceSub(sink.context(), term_64, 1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$rules$"); sink.copy(sub_170.ref());
        sink.end(); return true;
      }
      label_26: {
        term_64 = force(sink.context(), term_64);
        if (term_64.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_26;
        }Term sub_103 = forceSub(sink.context(), term_64, 0).ref();
        sub_103 = force(sink.context(), sub_103);
        if (sub_103.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_26;
        }Term sub_102 = forceSub(sink.context(), sub_103, 0).ref();/*Contract*/ sink.literal("$rules$:"); return true;
      }
    }
    return thunk(sink, _M_RulesKey, term_64);
  } final public static boolean _M_UnRULES(Sink sink, int shared, int depth, Term term_68) {
    if (depth < 2000) {
      label_117: {
        term_68 = force(sink.context(), term_68);
        if (term_68.descriptor() != _M_RULES)
        {   break label_117;
        }Term sub_157 = forceSub(sink.context(), term_68, 0).ref(); /* #=sub *//*Contract*/ sink.copy(sub_157.ref()); return true;
      }
    }
    return thunk(sink, _M_UnRULES, term_68);
  } final public static boolean _M_UnFUNCSORT(Sink sink, int shared, int depth, Term term_50) {
    if (depth < 2000) {
      label_85: {
        term_50 = force(sink.context(), term_50);
        if (term_50.descriptor() != _M_FUNCSORT)
        {   break label_85;
        }Term sub_186 = forceSub(sink.context(), term_50, 0).ref();
        /* #1=sub */Term sub_110 = forceSub(sink.context(), term_50, 1).ref(); /* #=sub *//*Contract*/ sink.copy(sub_110.ref()); return true;
      }
    }
    return thunk(sink, _M_UnFUNCSORT, term_50);
  } final public static boolean _M_UnDATASORT(Sink sink, int shared, int depth, Term term_174) {
    if (depth < 2000) {
      label_93: {
        term_174 = force(sink.context(), term_174);
        if (term_174.descriptor() != _M_DATASORT)
        {   break label_93;
        }Term sub_173 = forceSub(sink.context(), term_174, 0).ref(); /* #=sub *//*Contract*/ sink.copy(sub_173.ref()); return true;
      }
    }
    return thunk(sink, _M_UnDATASORT, term_174);
  } final public static boolean _M_AddModuleKey2(Sink sink, int shared, int depth, Properties props_38, Term term_108, Term term_286, Term term_11, Term term_212, Term term_137, Variable var_44, Term term_42) {
    if (depth < 2000) {
      label_78: {
        /* #key=term */
        /* #filename=term */
        /* #main=term */
        /* #modules=term */
        /* #notloaded=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_38));Term term_131;
        {
          BufferSink buf_155 = sink.context().makeBuffer();
          buf_155.start(_M_MODULE); buf_155.copy(term_286.ref()); buf_155.copy(term_11.ref()); buf_155.start(_M_NOTLOADED); buf_155.end();
          buf_155.end();
          term_131 = buf_155.term();
        }
        term_108 = force(sink.context(), term_108);
        Sink.property(sink, term_108, term_131);Term term_92;
        {
          BufferSink buf_97 = sink.context().makeBuffer();
          buf_97.start(_M_MODULES); buf_97.copy(term_212.ref());
          buf_97.end();
          term_92 = buf_97.term();
        } sink.propertyNamed("$modules", term_92);Term term_194;
        {
          BufferSink buf_93 = sink.context().makeBuffer();
          buf_93.start(_M_MODULES); buf_93.copy(term_137.ref());
          buf_93.end();
          term_194 = buf_93.term();
        } sink.propertyNamed("$notloaded", term_194);Term term_199;
        {
          BufferSink buf_84 = sink.context().makeBuffer(); buf_84.start(_M_OK); buf_84.end();
          term_199 = buf_84.term();
        }
        sink.substitute(term_42.ref(), new Variable[] { var_44 }, new Term[] {term_199}); return true;
      }
    }
    return thunk(sink, _M_AddModuleKey2, props_38, term_108, term_286, term_11, term_212, term_137, var_44, term_42);
  }       final public static boolean _M_AddModuleKey(Sink sink, int shared, int depth, Properties props_98, Term term_43, Term term_223, Term term_0, Variable var_3, Term term_25) {
    if (depth < 2000) {
      label_30: {
        Term value_95 = props_98 == null ? null : props_98.lookup("$modules");
        if (value_95 == null) 
        {   break label_30;
        }
        value_95 = force(sink.context(), value_95);
        if (value_95.descriptor() != _M_MODULES)
        {   break label_30;
        }Term sub_270 = forceSub(sink.context(), value_95, 0).ref();
        /* #modules=sub */
        Term value_3 = props_98 == null ? null : props_98.lookup("$notloaded");
        if (value_3 == null) 
        {   break label_30;
        }
        value_3 = force(sink.context(), value_3);
        if (value_3.descriptor() != _M_MODULES)
        {   break label_30;
        }Term sub_75 = forceSub(sink.context(), value_3, 0).ref();
        /* #notloaded=sub */
        /* #key=term */
        /* #filename=term */
        /* #main=term */
        /* #=term *//*Contract*/
        sink.start(_M__s);sink.properties(safeRef(props_98));
        sink.start(_M_Builtin_sIfDef);
        sink.end(); sink.copy(term_43.ref());sink.properties(safeRef(props_98));Term term_111;
        {
          BufferSink buf_52 = sink.context().makeBuffer(); buf_52.start(_M_OK); buf_52.end();
          term_111 = buf_52.term();
        }
        sink.substitute(term_25.ref(), new Variable[] { var_3 }, new Term[] {term_111});sink.properties(safeRef(props_98));
        sink.start(_M_AddModuleKey2); sink.copy(term_43.ref()); sink.copy(term_223.ref()); sink.copy(term_0.ref());
        sink.start(_M_Concat); sink.copy(sub_270.ref());
        sink.start(_M__sCons); sink.copy(term_43.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.start(_M_Concat); sink.copy(sub_75.ref());
        sink.start(_M__sCons); sink.copy(term_43.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        Variable var_23 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_23});
        VariableUse use_33 = sink.context().makeVariableUse(var_23);
        sink.substitute(term_25.ref(), new Variable[] { var_3 }, new Term[] {use_33});
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddModuleKey, props_98, term_43, term_223, term_0, var_3, term_25);
  }     final public static boolean _M_AddModule(Sink sink, int shared, int depth, Properties props_50, Term term_161, Term term_81, Variable var_39, Term term_73) {
    if (depth < 2000) {
      label_35: {
        /* #filename=term */
        /* #main=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_50));
        sink.start(_M_AddModuleKey);
        sink.start(_M_ModuleKey); sink.copy(term_161.ref());
        sink.end(); sink.copy(term_161.ref()); sink.copy(term_81.ref());
        Variable var_29 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_29});
        VariableUse use_53 = sink.context().makeVariableUse(var_29);
        sink.substitute(term_73.ref(), new Variable[] { var_39 }, new Term[] {use_53});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddModule, props_50, term_161, term_81, var_39, term_73);
  }    final public static boolean _M_ModuleKey(Sink sink, int shared, int depth, Term term_292) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$module$"); sink.copy(term_292.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_ModuleKey, term_292);
  } 
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.std.Core.init(context); org.crsx.compiler.std.Env.init(context); org.crsx.compiler.std.List.init(context); org.crsx.compiler.parser.Crsx.init(context); context.register(_M_QSORT); context.register(_M_KEYS); context.register(_M_IMPORTS); context.register(_M_RULES); context.register(_M_DATASORT); context.register(_M_FUNCSORT); context.register(_M_FORMKEYS); context.register(_M_STR); context.register(_M_NOCONTENTENTRY); context.register(_M_NOTLOADED); context.register(_M_LOADED); context.register(_M_MODULES); context.register(_M_MODULE); context.register(_M_MAINMODULE); context.register(_M_SUBMODULE); context.register(_M_OutputRuleDeclarationsForKey); context.register(_M_OutputRuleDeclarations); context.register(_M_OutputFuncDeclaration); context.register(_M_OutputFuncDeclarations); context.register(_M_OutputDataDeclarationsForKey); context.register(_M_OutputDataDeclarations); context.register(_M_OutputImportGrammarDeclarations); context.register(_M_OutputImportDeclarations); context.register(_M_OutputCrsx); context.register(_M_AddFuncSort2); context.register(_M_AddFuncSort1); context.register(_M_AddFuncSort); context.register(_M_AddDataForm2); context.register(_M_AddDataForm1); context.register(_M_AddDataForm); context.register(_M_AddDataSort3); context.register(_M_AddDataSort2); context.register(_M_AddDataSort1); context.register(_M_AddDataSort); context.register(_M_AddRule3); context.register(_M_AddRule2); context.register(_M_AddRule); context.register(_M_LookupSortByConstructor1); context.register(_M_LookupSortByConstructor); context.register(_M_LookupModule); context.register(_M_ConstructorToString); context.register(_M_SortnameToString); context.register(_M_FuncSortKey); context.register(_M_DataFormKey); context.register(_M_DataSortKey); context.register(_M_RulesKey); context.register(_M_UnRULES); context.register(_M_UnFUNCSORT); context.register(_M_UnDATASORT); context.register(_M_AddModuleKey2); context.register(_M_AddModuleKey); context.register(_M_AddModule); context.register(_M_ModuleKey);
      initialized = true;
    }
  }

/* END MODULE « "state.crs.java" » */
}