/* START MODULE /Users/villardl/Projects/crsx/crsx4_2/src/state.crs.java */
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
  final public static DynamicFunctionDescriptor _M_ModuleKey = makeFunction("ModuleKey", State.class, "_M_ModuleKey");final public static boolean _M_OutputRuleDeclarationsForKey(Sink sink, int shared, int depth, Properties props, Term term, Term term_84) {
    if (depth < 2000) {
      label: {
        if (term.descriptor() != _M__sNil)
        {   break label;
        }
        /* #keys=term *//*Contract*/sink.properties(safeRef(props));
        sink.start(_M_OutputRuleDeclarations); sink.copy(term_84.ref());
        sink.end(); return true;
      }
      label_83: {
        if (term.descriptor() != _M__sCons)
        {   break label_83;
        }Term sub = term.sub(0).ref();
        /* #rule=sub */Term sub_45 = term.sub(1).ref();
        /* #rules=sub */
        /* #keys=term *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclaration_xA3); sink.copy(sub.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();sink.properties(safeRef(props));
        sink.start(_M_OutputRuleDeclarationsForKey); sink.copy(sub_45.ref()); sink.copy(term_84.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputRuleDeclarationsForKey, props, term, term_84);
  }  final public static boolean _M_OutputRuleDeclarations(Sink sink, int shared, int depth, Properties props_58, Term term_47) {
    if (depth < 2000) {
      label_72: {
        if (term_47.descriptor() != _M__sNil)
        {   break label_72;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_64: {
        if (term_47.descriptor() != _M__sCons)
        {   break label_64;
        }Term sub_14 = term_47.sub(0).ref();
        /* #key=sub */Term sub_21 = term_47.sub(1).ref();
        /* #keys=sub *//*Contract*/sink.properties(safeRef(props_58));
        sink.start(_M_OutputRuleDeclarationsForKey);
        sink.start(_M_UnRULES);
        sink.start(_M__s);sink.properties(safeRef(props_58));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(sub_14.ref());
        sink.end();
        sink.end(); sink.copy(sub_21.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputRuleDeclarations, props_58, term_47);
  } final public static boolean _M_OutputFuncDeclaration(Sink sink, int shared, int depth, Properties props_44, Term term_63, Term term_56) {
    if (depth < 2000) {
      sink.start(_M__sCons);
      sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
      sink.start(_M__sCons);
      sink.start(_M_Crsx_xdeclaration_xA4); sink.copy(term_63.ref());
      sink.end(); sink.start(_M__sNil); sink.end();
      sink.end();
      sink.end();sink.properties(safeRef(props_44));
      sink.start(_M_OutputFuncDeclarations); sink.copy(term_56.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_OutputFuncDeclaration, props_44, term_63, term_56);
  }  final public static boolean _M_OutputFuncDeclarations(Sink sink, int shared, int depth, Properties props_74, Term term_23) {
    if (depth < 2000) {
      label_29: {
        Term value = props_74 == null ? null : props_74.lookup("$rulekeys");
        if (value == null) 
        {   break label_29;
        }
        if (value.descriptor() != _M_KEYS)
        {   break label_29;
        }Term sub_12 = value.sub(0).ref();
        /* #keys=sub */
        if (term_23.descriptor() != _M__sNil)
        {   break label_29;
        }/*Contract*/sink.properties(safeRef(props_74));
        sink.start(_M_OutputRuleDeclarations); sink.copy(sub_12.ref());
        sink.end(); return true;
      }
      label_90: {
        if (term_23.descriptor() != _M__sCons)
        {   break label_90;
        }Term sub_20 = term_23.sub(0).ref();
        /* #key=sub */Term sub_8 = term_23.sub(1).ref();
        /* #keys=sub *//*Contract*/sink.properties(safeRef(props_74));
        sink.start(_M_OutputFuncDeclaration);
        sink.start(_M_UnFUNCSORT);
        sink.start(_M__s);sink.properties(safeRef(props_74));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(sub_20.ref());
        sink.end();
        sink.end(); sink.copy(sub_8.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputFuncDeclarations, props_74, term_23);
  } final public static boolean _M_OutputDataDeclarationsForKey(Sink sink, int shared, int depth, Properties props_40, Term term_16, Term term_5) {
    if (depth < 2000) {
      label_9: {
        if (term_16.descriptor() != _M__sNil)
        {   break label_9;
        }
        /* #keys=term *//*Contract*/sink.properties(safeRef(props_40));
        sink.start(_M_OutputDataDeclarations); sink.copy(term_5.ref());
        sink.end(); return true;
      }
      label_16: {
        if (term_16.descriptor() != _M__sCons)
        {   break label_16;
        }Term sub_69 = term_16.sub(0).ref();
        if (sub_69.descriptor() != _M_QSORT)
        {   break label_16;
        }Term sub_53 = sub_69.sub(0).ref();
        /* #qualifier=sub */Term sub_75 = sub_69.sub(1).ref();
        /* #sort=sub */Term sub_63 = term_16.sub(1).ref();
        /* #qsorts=sub */
        /* #keys=term *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclaration_xA4); sink.copy(sub_75.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();sink.properties(safeRef(props_40));
        sink.start(_M_OutputDataDeclarationsForKey); sink.copy(sub_63.ref()); sink.copy(term_5.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputDataDeclarationsForKey, props_40, term_16, term_5);
  }  final public static boolean _M_OutputDataDeclarations(Sink sink, int shared, int depth, Properties props_99, Term term_44) {
    if (depth < 2000) {
      label_10: {
        Term value_44 = props_99 == null ? null : props_99.lookup("$funckeys");
        if (value_44 == null) 
        {   break label_10;
        }
        if (value_44.descriptor() != _M_KEYS)
        {   break label_10;
        }Term sub_76 = value_44.sub(0).ref();
        /* #keys=sub */
        if (term_44.descriptor() != _M__sNil)
        {   break label_10;
        }/*Contract*/sink.properties(safeRef(props_99));
        sink.start(_M_OutputFuncDeclarations); sink.copy(sub_76.ref());
        sink.end(); return true;
      }
      label_68: {
        if (term_44.descriptor() != _M__sCons)
        {   break label_68;
        }Term sub_184 = term_44.sub(0).ref();
        /* #key=sub */Term sub_61 = term_44.sub(1).ref();
        /* #keys=sub *//*Contract*/sink.properties(safeRef(props_99));
        sink.start(_M_OutputDataDeclarationsForKey);
        sink.start(_M_UnDATASORT);
        sink.start(_M__s);sink.properties(safeRef(props_99));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(sub_184.ref());
        sink.end();
        sink.end(); sink.copy(sub_61.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputDataDeclarations, props_99, term_44);
  } final public static boolean _M_OutputImportGrammarDeclarations(Sink sink, int shared, int depth, Properties props_7, Term term_8) {
    if (depth < 2000) {
      label_3: {
        Term value_53 = props_7 == null ? null : props_7.lookup("$datakeys");
        if (value_53 == null) 
        {   break label_3;
        }
        if (value_53.descriptor() != _M_KEYS)
        {   break label_3;
        }Term sub_32 = value_53.sub(0).ref();
        /* #keys=sub */
        if (term_8.descriptor() != _M__sNil)
        {   break label_3;
        }/*Contract*/sink.properties(safeRef(props_7));
        sink.start(_M_OutputDataDeclarations); sink.copy(sub_32.ref());
        sink.end(); return true;
      }
      label_98: {
        if (term_8.descriptor() != _M__sCons)
        {   break label_98;
        }Term sub_3 = term_8.sub(0).ref();
        /* #import=sub */Term sub_68 = term_8.sub(1).ref();
        /* #imports=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclaration_xA2);
        sink.start(_M_Crsx_ximportDeclaration_xA3); sink.literal("import"); sink.literal("grammar");
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.copy(sub_3.ref());
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();sink.properties(safeRef(props_7));
        sink.start(_M_OutputImportGrammarDeclarations); sink.copy(sub_68.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputImportGrammarDeclarations, props_7, term_8);
  } final public static boolean _M_OutputImportDeclarations(Sink sink, int shared, int depth, Properties props_18, Term term_55) {
    if (depth < 2000) {
      label_32: {
        Term value_81 = props_18 == null ? null : props_18.lookup("$grammars");
        if (value_81 == null) 
        {   break label_32;
        }
        if (value_81.descriptor() != _M_IMPORTS)
        {   break label_32;
        }Term sub_43 = value_81.sub(0).ref();
        /* #imported=sub */
        if (term_55.descriptor() != _M__sNil)
        {   break label_32;
        }/*Contract*/sink.properties(safeRef(props_18));
        sink.start(_M_OutputImportGrammarDeclarations); sink.copy(sub_43.ref());
        sink.end(); return true;
      }
      label_14: {
        if (term_55.descriptor() != _M__sCons)
        {   break label_14;
        }Term sub_59 = term_55.sub(0).ref();
        /* #import=sub */Term sub_6 = term_55.sub(1).ref();
        /* #imports=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclaration_xA2);
        sink.start(_M_Crsx_ximportDeclaration_xA2); sink.literal("import"); sink.literal("module");
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.copy(sub_59.ref());
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();sink.properties(safeRef(props_18));
        sink.start(_M_OutputImportDeclarations); sink.copy(sub_6.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputImportDeclarations, props_18, term_55);
  } final public static boolean _M_OutputCrsx(Sink sink, int shared, int depth, Properties props_71, Term term_30) {
    if (depth < 2000) {
      label_191: {
        Term value_7 = props_71 == null ? null : props_71.lookup("$imported");
        if (value_7 == null) 
        {   break label_191;
        }
        if (value_7.descriptor() != _M_IMPORTS)
        {   break label_191;
        }Term sub_74 = value_7.sub(0).ref();
        /* #imported=sub */
        if (term_30.descriptor() != _M_OK)
        {   break label_191;
        }/*Contract*/
        sink.start(_M_Crsx_xcrsx);
        sink.start(_M_Crsx_xdeclarations);
        sink.start(_M_Crsx_xdeclaration_xA5);
        sink.start(_M_Crsx_xdirective_xA1);
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.literal("$Lax");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();sink.properties(safeRef(props_71));
        sink.start(_M_OutputImportDeclarations); sink.copy(sub_74.ref());
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputCrsx, props_71, term_30);
  } final public static boolean _M_AddFuncSort2(Sink sink, int shared, int depth, Properties props_47, Term term_93, Term term_31, Term term_45, Variable var, Term term_192) {
    if (depth < 2000) {
      label_38: {
        if (term_93.descriptor() != _M_FUNCSORT)
        {   break label_38;
        }Term sub_87 = term_93.sub(0).ref();
        /* #qualifier=sub */Term sub_50 = term_93.sub(1).ref();
        /* #sort=sub */
        /* #key=term */
        if (term_45.descriptor() != _M_Crsx_xsortDeclaration_xA2)
        {   break label_38;
        }Term sub_65 = term_45.sub(0).ref();
        /* #sortparams?=sub */Term sub_25 = term_45.sub(1).ref();
        /* #sortset=sub */Term sub_73 = term_45.sub(2).ref();
        if (sub_73.descriptor() != _M_Crsx_xform_xA1)
        {   break label_38;
        }Term sub_9 = sub_73.sub(0).ref();
        /* #constructor=sub */Term sub_82 = sub_73.sub(1).ref();
        /* #arguments?=sub */Term sub_67 = term_45.sub(3).ref();Term sub_146 = term_45.sub(4).ref();
        /* #sortname=sub */
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("Function sort already defined:");
        sink.start(_M_ConstructorToString); sink.copy(sub_9.ref());
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_8: {
        Term value_57 = props_47 == null ? null : props_47.lookup("$funckeys");
        if (value_57 == null) 
        {   break label_8;
        }
        if (value_57.descriptor() != _M_KEYS)
        {   break label_8;
        }Term sub_95 = value_57.sub(0).ref();
        /* #keys=sub */
        Term value_32 = props_47 == null ? null : props_47.lookup("$qualifier");
        if (value_32 == null) 
        {   break label_8;
        }
        if (value_32.descriptor() != _M_STR)
        {   break label_8;
        }Term sub_29 = value_32.sub(0).ref();
        /* #qualifier=sub */
        if (term_93.descriptor() != _M_NOCONTENTENTRY)
        {   break label_8;
        }
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_47));Term term_92;
        {
          BufferSink buf = sink.context().makeBuffer();
          buf.start(_M_FUNCSORT); buf.copy(sub_29.ref()); buf.copy(term_45.ref());
          buf.end();
          term_92 = buf.term();
        }
        term_31 = force(sink.context(), term_31);
        Sink.property(sink, term_31, term_92);Term term_67;
        {
          BufferSink buf_42 = sink.context().makeBuffer();
          buf_42.start(_M_KEYS);
          buf_42.start(_M__sCons); buf_42.copy(term_31.ref()); buf_42.copy(sub_95.ref());
          buf_42.end();
          buf_42.end();
          term_67 = buf_42.term();
        } sink.propertyNamed("$funckeys", term_67);Term term_80;
        {
          BufferSink buf_22 = sink.context().makeBuffer(); buf_22.start(_M_OK); buf_22.end();
          term_80 = buf_22.term();
        }
        sink.substitute(term_192.ref(), new Variable[] { var }, new Term[] {term_80}); return true;
      }
    }
    return thunk(sink, _M_AddFuncSort2, props_47, term_93, term_31, term_45, var, term_192);
  }     final public static boolean _M_AddFuncSort1(Sink sink, int shared, int depth, Properties props_42, Term term_15, Term term_77, Variable var_40, Term term_39) {
    if (depth < 2000) {
      label_34: {
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_42));
        sink.start(_M_AddFuncSort2);
        sink.start(_M__s);sink.properties(safeRef(props_42));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_15.ref()); sink.start(_M_NOCONTENTENTRY); sink.end();
        sink.end(); sink.copy(term_15.ref()); sink.copy(term_77.ref());
        Variable var_21 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_21});
        VariableUse use = sink.context().makeVariableUse(var_21);
        sink.substitute(term_39.ref(), new Variable[] { var_40 }, new Term[] {use});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddFuncSort1, props_42, term_15, term_77, var_40, term_39);
  }    final public static boolean _M_AddFuncSort(Sink sink, int shared, int depth, Properties props_22, Term term_51, Variable var_81, Term term_40) {
    if (depth < 2000) {
      label_89: {
        if (term_51.descriptor() != _M_Crsx_xsortDeclaration_xA2)
        {   break label_89;
        }Term sub_16 = term_51.sub(0).ref();
        /* #sortparams?=sub */Term sub_36 = term_51.sub(1).ref();
        /* #sortset=sub */Term sub_167 = term_51.sub(2).ref();
        if (sub_167.descriptor() != _M_Crsx_xform_xA1)
        {   break label_89;
        }Term sub_11 = sub_167.sub(0).ref();
        /* #constructor=sub */Term sub_28 = sub_167.sub(1).ref();
        /* #arguments?=sub */Term sub_58 = term_51.sub(3).ref();Term sub_49 = term_51.sub(4).ref();
        /* #sortname=sub */
        /* #=term *//*Contract*/sink.properties(safeRef(props_22));
        sink.start(_M_AddFuncSort1);
        sink.start(_M_FuncSortKey); sink.copy(sub_11.ref());
        sink.end();
        sink.start(_M_Crsx_xsortDeclaration_xA2); sink.copy(sub_16.ref()); sink.copy(sub_36.ref());
        sink.start(_M_Crsx_xform_xA1); sink.copy(sub_11.ref()); sink.copy(sub_28.ref());
        sink.end(); sink.literal("::"); sink.copy(sub_49.ref());
        sink.end();
        Variable var_9 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_9});
        VariableUse use_44 = sink.context().makeVariableUse(var_9);
        sink.substitute(term_40.ref(), new Variable[] { var_81 }, new Term[] {use_44});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddFuncSort, props_22, term_51, var_81, term_40);
  }   final public static boolean _M_AddDataForm2(Sink sink, int shared, int depth, Properties props_29, Term term_10, Term term_12, Term term_83, Term term_29, Term term_2, Term term_113) {
    if (depth < 2000) {
      label_0: {
        if (term_10.descriptor() != _M_DATASORT)
        {   break label_0;
        }Term sub_102 = term_10.sub(0).ref();
        /* #sort=sub */
        /* #key=term */
        if (term_83.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_0;
        }Term sub_19 = term_83.sub(0).ref();
        if (sub_19.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_0;
        }Term sub_52 = term_83.sub(1).ref();
        /* #CONSTRUCTOR1=sub */
        if (term_29.descriptor() != _M_Crsx_xsortname_xA1)
        {   break label_0;
        }Term sub_10 = term_29.sub(0).ref();
        if (sub_10.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_0;
        }Term sub_5 = sub_10.sub(0).ref();
        if (sub_5.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_0;
        }Term sub_101 = sub_10.sub(1).ref();
        /* #CONSTRUCTOR2=sub */Term sub_42 = term_29.sub(1).ref();
        /* #sortarguments?=sub */
        /* #sortdecl=term */
        /* #CONTINUATION=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("Error: duplicate data form "); sink.copy(sub_52.ref()); sink.literal(" found in sort "); sink.copy(sub_101.ref()); sink.literal(".");
        sink.end();
        sink.end(); return true;
      }
      label_99: {
        Term value_70 = props_29 == null ? null : props_29.lookup("$qualifier");
        if (value_70 == null) 
        {   break label_99;
        }
        if (value_70.descriptor() != _M_STR)
        {   break label_99;
        }Term sub_26 = value_70.sub(0).ref();
        /* #qualifier=sub */
        if (term_10.descriptor() != _M_NOCONTENTENTRY)
        {   break label_99;
        }
        /* #key=term */
        /* #constructor=term */
        /* #sortname=term */
        /* #sortdecl=term */
        if (term_113.descriptor() != _M_CONTINUATION)
        {   break label_99;
        }Term sub_193 = term_113.sub(0).ref();
        Variable binder = term_113.binders(0)[0];
        /* #=sub *//*Contract*/sink.properties(safeRef(props_29));Term term_24;
        {
          BufferSink buf_3 = sink.context().makeBuffer();
          buf_3.start(_M_DATASORT);
          buf_3.start(_M__sCons);
          buf_3.start(_M_QSORT); buf_3.copy(sub_26.ref()); buf_3.copy(term_2.ref());
          buf_3.end(); buf_3.start(_M__sNil); buf_3.end();
          buf_3.end();
          buf_3.end();
          term_24 = buf_3.term();
        }
        term_12 = force(sink.context(), term_12);
        Sink.property(sink, term_12, term_24);Term term_99;
        {
          BufferSink buf_17 = sink.context().makeBuffer(); buf_17.start(_M_OK); buf_17.end();
          term_99 = buf_17.term();
        }
        sink.substitute(sub_193.ref(), new Variable[] { binder }, new Term[] {term_99}); return true; 
      }
    }
    return thunk(sink, _M_AddDataForm2, props_29, term_10, term_12, term_83, term_29, term_2, term_113);
  }      final public static boolean _M_AddDataForm1(Sink sink, int shared, int depth, Properties props_9, Term term_191, Term term_50, Term term_202, Term term_164, Term term_64) {
    if (depth < 2000) {sink.properties(safeRef(props_9));
      sink.start(_M_AddDataForm2);
      sink.start(_M__s);sink.properties(safeRef(props_9));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_191.ref()); sink.start(_M_NOCONTENTENTRY); sink.end();
      sink.end(); sink.copy(term_191.ref()); sink.copy(term_50.ref()); sink.copy(term_202.ref()); sink.copy(term_164.ref()); sink.copy(term_64.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_AddDataForm1, props_9, term_191, term_50, term_202, term_164, term_64);
  }     final public static boolean _M_AddDataForm(Sink sink, int shared, int depth, Properties props_37, Term term_0, Term term_251, Term term_162, Term term_1) {
    if (depth < 2000) {
      label_77: {
        if (term_0.descriptor() != _M_Crsx_xforms_xS1)
        {   break label_77;
        }Term sub_70 = term_0.sub(0).ref();
        if (sub_70.descriptor() != _M_Crsx_xform_xA1)
        {   break label_77;
        }Term sub_23 = sub_70.sub(0).ref();
        /* #constructor=sub */Term sub_175 = sub_70.sub(1).ref();
        /* #arguments?=sub */Term sub_93 = term_0.sub(1).ref();
        /* #sortname=term */
        /* #sortdecl=term */
        /* #CONTINUATION=term *//*Contract*/sink.properties(safeRef(props_37));
        sink.start(_M_AddDataForm1);
        sink.start(_M_DataFormKey); sink.copy(sub_23.ref());
        sink.end(); sink.copy(sub_23.ref()); sink.copy(term_251.ref()); sink.copy(term_162.ref()); sink.copy(term_1.ref());
        sink.end(); return true;
      }
      label_21: {
        if (term_0.descriptor() != _M_Crsx_xforms_xS1)
        {   break label_21;
        }Term sub_100 = term_0.sub(0).ref();
        if (sub_100.descriptor() != _M_Crsx_xform_xA2)
        {   break label_21;
        }Term sub_92 = sub_100.sub(0).ref();
        /* #variable=sub */Term sub_54 = term_0.sub(1).ref();
        /* #sortname=term */
        /* #sortdecl=term */
        if (term_1.descriptor() != _M_CONTINUATION)
        {   break label_21;
        }Term sub_64 = term_1.sub(0).ref();
        Variable binder_12 = term_1.binders(0)[0];
        /* #=sub *//*Contract*/sink.properties(safeRef(props_37));Term term_109;
        {
          BufferSink buf_85 = sink.context().makeBuffer(); buf_85.start(_M_OK); buf_85.end();
          term_109 = buf_85.term();
        }
        sink.substitute(sub_64.ref(), new Variable[] { binder_12 }, new Term[] {term_109}); return true; 
      }
    }
    return thunk(sink, _M_AddDataForm, props_37, term_0, term_251, term_162, term_1);
  }    final public static boolean _M_AddDataSort3(Sink sink, int shared, int depth, Properties props_14, Term term_61, Term term_247, Term term_28, Variable var_88, Term term_128) {
    if (depth < 2000) {
      label_81: {
        Term value_73 = props_14 == null ? null : props_14.lookup("$qualifier");
        if (value_73 == null) 
        {   break label_81;
        }
        if (value_73.descriptor() != _M_STR)
        {   break label_81;
        }Term sub_118 = value_73.sub(0).ref();
        /* #qualifier=sub */
        if (term_61.descriptor() != _M_DATASORT)
        {   break label_81;
        }Term sub_84 = term_61.sub(0).ref();
        /* #sorts=sub */
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_14));Term term_186;
        {
          BufferSink buf_11 = sink.context().makeBuffer();
          buf_11.start(_M_DATASORT);
          buf_11.start(_M__sCons);
          buf_11.start(_M_QSORT); buf_11.copy(sub_118.ref()); buf_11.copy(term_28.ref());
          buf_11.end(); buf_11.copy(sub_84.ref());
          buf_11.end();
          buf_11.end();
          term_186 = buf_11.term();
        }
        term_247 = force(sink.context(), term_247);
        Sink.property(sink, term_247, term_186);Term term_81;
        {
          BufferSink buf_70 = sink.context().makeBuffer(); buf_70.start(_M_OK); buf_70.end();
          term_81 = buf_70.term();
        }
        sink.substitute(term_128.ref(), new Variable[] { var_88 }, new Term[] {term_81}); return true;
      }
      label_125: {
        Term value_38 = props_14 == null ? null : props_14.lookup("$datakeys");
        if (value_38 == null) 
        {   break label_125;
        }
        if (value_38.descriptor() != _M_KEYS)
        {   break label_125;
        }Term sub_131 = value_38.sub(0).ref();
        /* #keys=sub */
        Term value_26 = props_14 == null ? null : props_14.lookup("$qualifier");
        if (value_26 == null) 
        {   break label_125;
        }
        if (value_26.descriptor() != _M_STR)
        {   break label_125;
        }Term sub_17 = value_26.sub(0).ref();
        /* #qualifier=sub */
        if (term_61.descriptor() != _M_NOCONTENTENTRY)
        {   break label_125;
        }
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_14));Term term_34;
        {
          BufferSink buf_29 = sink.context().makeBuffer();
          buf_29.start(_M_DATASORT);
          buf_29.start(_M__sCons);
          buf_29.start(_M_QSORT); buf_29.copy(sub_17.ref()); buf_29.copy(term_28.ref());
          buf_29.end(); buf_29.start(_M__sNil); buf_29.end();
          buf_29.end();
          buf_29.end();
          term_34 = buf_29.term();
        }
        term_247 = force(sink.context(), term_247);
        Sink.property(sink, term_247, term_34);Term term_91;
        {
          BufferSink buf_73 = sink.context().makeBuffer();
          buf_73.start(_M_KEYS);
          buf_73.start(_M__sCons); buf_73.copy(term_247.ref()); buf_73.copy(sub_131.ref());
          buf_73.end();
          buf_73.end();
          term_91 = buf_73.term();
        } sink.propertyNamed("$datakeys", term_91);Term term_46;
        {
          BufferSink buf_80 = sink.context().makeBuffer(); buf_80.start(_M_OK); buf_80.end();
          term_46 = buf_80.term();
        }
        sink.substitute(term_128.ref(), new Variable[] { var_88 }, new Term[] {term_46}); return true;
      }
    }
    return thunk(sink, _M_AddDataSort3, props_14, term_61, term_247, term_28, var_88, term_128);
  }     final public static boolean _M_AddDataSort2(Sink sink, int shared, int depth, Properties props_84, Term term_95, Term term_73, Variable var_10, Term term_59) {
    if (depth < 2000) {
      label_30: {
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_84));
        sink.start(_M_AddDataSort3);
        sink.start(_M__s);sink.properties(safeRef(props_84));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_95.ref()); sink.start(_M_NOCONTENTENTRY); sink.end();
        sink.end(); sink.copy(term_95.ref()); sink.copy(term_73.ref());
        Variable var_22 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_22});
        VariableUse use_23 = sink.context().makeVariableUse(var_22);
        sink.substitute(term_59.ref(), new Variable[] { var_10 }, new Term[] {use_23});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddDataSort2, props_84, term_95, term_73, var_10, term_59);
  }    final public static boolean _M_AddDataSort1(Sink sink, int shared, int depth, Properties props_33, Term term_49, Term term_119, Variable var_37, Term term_13) {
    if (depth < 2000) {
      label_336: {
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_33));
        sink.start(_M_AddDataSort2); sink.copy(term_49.ref()); sink.copy(term_119.ref());
        Variable var_91 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_91});
        VariableUse use_53 = sink.context().makeVariableUse(var_91);
        sink.substitute(term_13.ref(), new Variable[] { var_37 }, new Term[] {use_53});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddDataSort1, props_33, term_49, term_119, var_37, term_13);
  }    final public static boolean _M_AddDataSort(Sink sink, int shared, int depth, Properties props_20, Term term_27, Variable var_43, Term term_17) {
    if (depth < 2000) {
      label_5: {
        if (term_27.descriptor() != _M_Crsx_xsortDeclaration_xA1)
        {   break label_5;
        }Term sub_275 = term_27.sub(0).ref();
        /* #sortparams?=sub */Term sub_134 = term_27.sub(1).ref();
        /* #sortset=sub */Term sub_86 = term_27.sub(2).ref();
        /* #sortname=sub */Term sub_24 = term_27.sub(3).ref();Term sub_15 = term_27.sub(4).ref();Term sub_83 = term_27.sub(5).ref();
        if (sub_83.descriptor() != _M_Crsx_xforms)
        {   break label_5;
        }Term sub_40 = sub_83.sub(0).ref();
        /* #forms_S1*=sub */Term sub_88 = term_27.sub(6).ref();
        /* #=term *//*Contract*/sink.properties(safeRef(props_20));
        sink.start(_M_AddDataSort1);
        sink.start(_M_DataSortKey); sink.copy(sub_86.ref());
        sink.end();
        sink.start(_M_Crsx_xsortDeclaration_xA1); sink.copy(sub_275.ref()); sink.copy(sub_134.ref()); sink.copy(sub_86.ref()); sink.literal("::="); sink.literal("(");
        sink.start(_M_Crsx_xforms); sink.copy(sub_40.ref());
        sink.end(); sink.literal(")");
        sink.end();
        Variable var_56 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_56});
        sink.start(_M_SeqMap);
        Variable var_86 = sink.context().makeVariable("form");
        Variable var_87 = sink.context().makeVariable("cont");
        sink.binds(new Variable[] {var_86,var_87});
        sink.start(_M_AddDataForm); sink.use(var_86); sink.copy(sub_86.ref());
        sink.start(_M_Crsx_xsortDeclaration_xA1); sink.copy(sub_275.ref()); sink.copy(sub_134.ref()); sink.copy(sub_86.ref()); sink.literal("::="); sink.literal("(");
        sink.start(_M_Crsx_xforms); sink.copy(sub_40.ref());
        sink.end(); sink.literal(")");
        sink.end(); sink.use(var_87);
        sink.end(); sink.copy(sub_40.ref());
        Variable var_32 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_32});
        VariableUse use_48 = sink.context().makeVariableUse(var_32);
        sink.substitute(term_17.ref(), new Variable[] { var_43 }, new Term[] {use_48});
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddDataSort, props_20, term_27, var_43, term_17);
  }   final public static boolean _M_AddRule3(Sink sink, int shared, int depth, Properties props_39, Term term_88, Term term_36, Term term_82, Variable var_55, Term term_18) {
    if (depth < 2000) {
      label_48: {
        if (term_88.descriptor() != _M_RULES)
        {   break label_48;
        }Term sub_79 = term_88.sub(0).ref();
        /* #rules=sub */
        /* #key=term */
        /* #ruleDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_39));Term term_43;
        {
          BufferSink buf_24 = sink.context().makeBuffer();
          buf_24.start(_M_RULES);
          buf_24.start(_M_Concat); buf_24.copy(sub_79.ref());
          buf_24.start(_M__sCons); buf_24.copy(term_82.ref()); buf_24.start(_M__sNil); buf_24.end();
          buf_24.end();
          buf_24.end();
          buf_24.end();
          term_43 = buf_24.term();
        }
        term_36 = force(sink.context(), term_36);
        Sink.property(sink, term_36, term_43);Term term_22;
        {
          BufferSink buf_27 = sink.context().makeBuffer(); buf_27.start(_M_OK); buf_27.end();
          term_22 = buf_27.term();
        }
        sink.substitute(term_18.ref(), new Variable[] { var_55 }, new Term[] {term_22}); return true;
      }
      label_185: {
        Term value_99 = props_39 == null ? null : props_39.lookup("$rulekeys");
        if (value_99 == null) 
        {   break label_185;
        }
        if (value_99.descriptor() != _M_KEYS)
        {   break label_185;
        }Term sub_154 = value_99.sub(0).ref();
        /* #keys=sub */
        if (term_88.descriptor() != _M_NOCONTENTENTRY)
        {   break label_185;
        }
        /* #key=term */
        /* #ruleDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_39));Term term_6;
        {
          BufferSink buf_90 = sink.context().makeBuffer();
          buf_90.start(_M_RULES);
          buf_90.start(_M__sCons); buf_90.copy(term_82.ref()); buf_90.start(_M__sNil); buf_90.end();
          buf_90.end();
          buf_90.end();
          term_6 = buf_90.term();
        }
        term_36 = force(sink.context(), term_36);
        Sink.property(sink, term_36, term_6);Term term_332;
        {
          BufferSink buf_91 = sink.context().makeBuffer();
          buf_91.start(_M_KEYS);
          buf_91.start(_M__sCons); buf_91.copy(term_36.ref()); buf_91.copy(sub_154.ref());
          buf_91.end();
          buf_91.end();
          term_332 = buf_91.term();
        } sink.propertyNamed("$rulekeys", term_332);Term term_48;
        {
          BufferSink buf_83 = sink.context().makeBuffer(); buf_83.start(_M_OK); buf_83.end();
          term_48 = buf_83.term();
        }
        sink.substitute(term_18.ref(), new Variable[] { var_55 }, new Term[] {term_48}); return true;
      }
    }
    return thunk(sink, _M_AddRule3, props_39, term_88, term_36, term_82, var_55, term_18);
  }     final public static boolean _M_AddRule2(Sink sink, int shared, int depth, Properties props_2, Term term_96, Term term_3, Variable var_17, Term term_79) {
    if (depth < 2000) {
      label_28: {
        /* #key=term */
        /* #ruleDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_2));
        sink.start(_M_AddRule3);
        sink.start(_M__s);sink.properties(safeRef(props_2));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_96.ref()); sink.start(_M_NOCONTENTENTRY); sink.end();
        sink.end(); sink.copy(term_96.ref()); sink.copy(term_3.ref());
        Variable var_54 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_54});
        VariableUse use_14 = sink.context().makeVariableUse(var_54);
        sink.substitute(term_79.ref(), new Variable[] { var_17 }, new Term[] {use_14});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddRule2, props_2, term_96, term_3, var_17, term_79);
  }    final public static boolean _M_AddRule(Sink sink, int shared, int depth, Properties props_6, Term term_62, Term term_121, Variable var_84, Term term_139) {
    if (depth < 2000) {
      label_104: {
        /* #key=term */
        /* #ruleDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_6));
        sink.start(_M_AddRule2); sink.copy(term_62.ref()); sink.copy(term_121.ref());
        Variable var_79 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_79});
        VariableUse use_132 = sink.context().makeVariableUse(var_79);
        sink.substitute(term_139.ref(), new Variable[] { var_84 }, new Term[] {use_132});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddRule, props_6, term_62, term_121, var_84, term_139);
  }    final public static boolean _M_LookupSortByConstructor1(Sink sink, int shared, int depth, Term term_94, Term term_135) {
    if (depth < 2000) {
      label_12: {
        if (term_94.descriptor() != _M_SOME)
        {   break label_12;
        }Term sub_155 = term_94.sub(0).ref();
        /* #1=sub */
        /* #2=term *//*Contract*/
        sink.start(_M_SOME); sink.copy(sub_155.ref());
        sink.end(); return true;
      }
      label_132: {
        if (term_94.descriptor() != _M_NONE)
        {   break label_132;
        }
        /* #2=term *//*Contract*/ sink.copy(term_135.ref()); return true;
      }
    }
    return thunk(sink, _M_LookupSortByConstructor1, term_94, term_135);
  }  final public static boolean _M_LookupSortByConstructor(Sink sink, int shared, int depth, Properties props_10, Term term_205) {
    if (depth < 2000) {
      sink.start(_M_LookupSortByConstructor1);sink.properties(safeRef(props_10));
      sink.start(_M_GetSome);
      sink.start(_M_FuncSortKey); sink.copy(term_205.ref());
      sink.end();
      sink.end();sink.properties(safeRef(props_10));
      sink.start(_M_GetSome);
      sink.start(_M_DataFormKey); sink.copy(term_205.ref());
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_LookupSortByConstructor, props_10, term_205);
  } final public static boolean _M_LookupModule(Sink sink, int shared, int depth, Properties props_89, Term term_53) {
    if (depth < 2000) {sink.properties(safeRef(props_89));
      sink.start(_M_GetSome); sink.start(_M_ModuleKey); sink.copy(term_53.ref()); sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_LookupModule, props_89, term_53);
  } final public static boolean _M_ConstructorToString(Sink sink, int shared, int depth, Term term_90) {
    if (depth < 2000) {
      label_85: {
        if (term_90.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_85;
        }Term sub_51 = term_90.sub(0).ref();
        if (sub_51.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_85;
        }Term sub_128 = term_90.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/ sink.copy(sub_128.ref()); return true;
      }
      label_7: {
        if (term_90.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_7;
        }Term sub_99 = term_90.sub(0).ref();
        if (sub_99.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_7;
        }Term sub_72 = sub_99.sub(0).ref();/*Contract*/ sink.literal(":"); return true;
      }
    }
    return thunk(sink, _M_ConstructorToString, term_90);
  } final public static boolean _M_SortnameToString(Sink sink, int shared, int depth, Term term_87) {
    if (depth < 2000) {
      label_97: {
        if (term_87.descriptor() != _M_Crsx_xsortname_xA1)
        {   break label_97;
        }Term sub_33 = term_87.sub(0).ref();
        if (sub_33.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_97;
        }Term sub_232 = sub_33.sub(0).ref();
        if (sub_232.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_97;
        }Term sub_97 = sub_33.sub(1).ref();
        /* #CONSTRUCTOR=sub */Term sub_31 = term_87.sub(1).ref();
        /* #sortarguments?=sub *//*Contract*/ sink.copy(sub_97.ref()); return true;
      }
      label_248: {
        if (term_87.descriptor() != _M_Crsx_xsortname_xA1)
        {   break label_248;
        }Term sub_56 = term_87.sub(0).ref();
        if (sub_56.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_248;
        }Term sub_121 = sub_56.sub(0).ref();
        if (sub_121.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_248;
        }Term sub_172 = sub_121.sub(0).ref();Term sub_216 = term_87.sub(1).ref();
        /* #sortarguments?=sub *//*Contract*/ sink.literal(":"); return true;
      }
    }
    return thunk(sink, _M_SortnameToString, term_87);
  } final public static boolean _M_FuncSortKey(Sink sink, int shared, int depth, Term term_21) {
    if (depth < 2000) {
      label_138: {
        if (term_21.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_138;
        }Term sub_81 = term_21.sub(0).ref();
        if (sub_81.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_138;
        }Term sub_71 = term_21.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$func$"); sink.copy(sub_71.ref());
        sink.end(); return true;
      }
      label_65: {
        if (term_21.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_65;
        }Term sub_47 = term_21.sub(0).ref();
        if (sub_47.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_65;
        }Term sub_38 = sub_47.sub(0).ref();/*Contract*/ sink.literal("$func$:"); return true;
      }
    }
    return thunk(sink, _M_FuncSortKey, term_21);
  } final public static boolean _M_DataFormKey(Sink sink, int shared, int depth, Term term_25) {
    if (depth < 2000) {
      label_61: {
        if (term_25.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_61;
        }Term sub_107 = term_25.sub(0).ref();
        if (sub_107.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_61;
        }Term sub_41 = term_25.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$form$"); sink.copy(sub_41.ref());
        sink.end(); return true;
      }
      label_58: {
        if (term_25.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_58;
        }Term sub_57 = term_25.sub(0).ref();
        if (sub_57.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_58;
        }Term sub_196 = sub_57.sub(0).ref();/*Contract*/ sink.literal("$form$:"); return true;
      }
    }
    return thunk(sink, _M_DataFormKey, term_25);
  } final public static boolean _M_DataSortKey(Sink sink, int shared, int depth, Term term_143) {
    if (depth < 2000) {
      label_184: {
        if (term_143.descriptor() != _M_Crsx_xsortname_xA1)
        {   break label_184;
        }Term sub_130 = term_143.sub(0).ref();
        if (sub_130.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_184;
        }Term sub_169 = sub_130.sub(0).ref();
        if (sub_169.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_184;
        }Term sub_66 = sub_130.sub(1).ref();
        /* #CONSTRUCTOR=sub */Term sub_4 = term_143.sub(1).ref();
        /* #sortarguments?=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$data$"); sink.copy(sub_66.ref());
        sink.end(); return true;
      }
      label_51: {
        if (term_143.descriptor() != _M_Crsx_xsortname_xA1)
        {   break label_51;
        }Term sub_273 = term_143.sub(0).ref();
        if (sub_273.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_51;
        }Term sub_185 = sub_273.sub(0).ref();
        if (sub_185.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_51;
        }Term sub_337 = sub_185.sub(0).ref();Term sub_117 = term_143.sub(1).ref();
        /* #sortarguments?=sub *//*Contract*/ sink.literal("$data$:"); return true;
      }
    }
    return thunk(sink, _M_DataSortKey, term_143);
  } final public static boolean _M_RulesKey(Sink sink, int shared, int depth, Term term_180) {
    if (depth < 2000) {
      label_42: {
        if (term_180.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_42;
        }Term sub_2 = term_180.sub(0).ref();
        if (sub_2.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_42;
        }Term sub_194 = term_180.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$rules$"); sink.copy(sub_194.ref());
        sink.end(); return true;
      }
      label_78: {
        if (term_180.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_78;
        }Term sub_96 = term_180.sub(0).ref();
        if (sub_96.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_78;
        }Term sub_135 = sub_96.sub(0).ref();/*Contract*/ sink.literal("$rules$:"); return true;
      }
    }
    return thunk(sink, _M_RulesKey, term_180);
  } final public static boolean _M_UnRULES(Sink sink, int shared, int depth, Term term_127) {
    if (depth < 2000) {
      label_87: {
        if (term_127.descriptor() != _M_RULES)
        {   break label_87;
        }Term sub_190 = term_127.sub(0).ref(); /* #=sub *//*Contract*/ sink.copy(sub_190.ref()); return true;
      }
    }
    return thunk(sink, _M_UnRULES, term_127);
  } final public static boolean _M_UnFUNCSORT(Sink sink, int shared, int depth, Term term_37) {
    if (depth < 2000) {
      label_73: {
        if (term_37.descriptor() != _M_FUNCSORT)
        {   break label_73;
        }Term sub_136 = term_37.sub(0).ref();
        /* #1=sub */Term sub_27 = term_37.sub(1).ref(); /* #=sub *//*Contract*/ sink.copy(sub_27.ref()); return true;
      }
    }
    return thunk(sink, _M_UnFUNCSORT, term_37);
  } final public static boolean _M_UnDATASORT(Sink sink, int shared, int depth, Term term_253) {
    if (depth < 2000) {
      label_91: {
        if (term_253.descriptor() != _M_DATASORT)
        {   break label_91;
        }Term sub_113 = term_253.sub(0).ref(); /* #=sub *//*Contract*/ sink.copy(sub_113.ref()); return true;
      }
    }
    return thunk(sink, _M_UnDATASORT, term_253);
  } final public static boolean _M_AddModuleKey2(Sink sink, int shared, int depth, Properties props_25, Term term_161, Term term_20, Term term_165, Term term_58, Term term_70, Variable var_99, Term term_268) {
    if (depth < 2000) {
      label_24: {
        /* #key=term */
        /* #filename=term */
        /* #main=term */
        /* #modules=term */
        /* #notloaded=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_25));Term term_26;
        {
          BufferSink buf_43 = sink.context().makeBuffer();
          buf_43.start(_M_MODULE); buf_43.copy(term_20.ref()); buf_43.copy(term_165.ref()); buf_43.start(_M_NOTLOADED); buf_43.end();
          buf_43.end();
          term_26 = buf_43.term();
        }
        term_161 = force(sink.context(), term_161);
        Sink.property(sink, term_161, term_26);Term term_111;
        {
          BufferSink buf_63 = sink.context().makeBuffer();
          buf_63.start(_M_MODULES); buf_63.copy(term_58.ref());
          buf_63.end();
          term_111 = buf_63.term();
        } sink.propertyNamed("$modules", term_111);Term term_78;
        {
          BufferSink buf_171 = sink.context().makeBuffer();
          buf_171.start(_M_MODULES); buf_171.copy(term_70.ref());
          buf_171.end();
          term_78 = buf_171.term();
        } sink.propertyNamed("$notloaded", term_78);Term term_7;
        {
          BufferSink buf_25 = sink.context().makeBuffer(); buf_25.start(_M_OK); buf_25.end();
          term_7 = buf_25.term();
        }
        sink.substitute(term_268.ref(), new Variable[] { var_99 }, new Term[] {term_7}); return true;
      }
    }
    return thunk(sink, _M_AddModuleKey2, props_25, term_161, term_20, term_165, term_58, term_70, var_99, term_268);
  }       final public static boolean _M_AddModuleKey(Sink sink, int shared, int depth, Properties props_96, Term term_110, Term term_144, Term term_98, Variable var_82, Term term_167) {
    if (depth < 2000) {
      label_62: {
        Term value_19 = props_96 == null ? null : props_96.lookup("$modules");
        if (value_19 == null) 
        {   break label_62;
        }
        if (value_19.descriptor() != _M_MODULES)
        {   break label_62;
        }Term sub_137 = value_19.sub(0).ref();
        /* #modules=sub */
        Term value_34 = props_96 == null ? null : props_96.lookup("$notloaded");
        if (value_34 == null) 
        {   break label_62;
        }
        if (value_34.descriptor() != _M_MODULES)
        {   break label_62;
        }Term sub_18 = value_34.sub(0).ref();
        /* #notloaded=sub */
        /* #key=term */
        /* #filename=term */
        /* #main=term */
        /* #=term *//*Contract*/
        sink.start(_M__s);sink.properties(safeRef(props_96));
        sink.start(_M_Builtin_sIfDef);
        sink.end(); sink.copy(term_110.ref());sink.properties(safeRef(props_96));Term term_150;
        {
          BufferSink buf_60 = sink.context().makeBuffer(); buf_60.start(_M_OK); buf_60.end();
          term_150 = buf_60.term();
        }
        sink.substitute(term_167.ref(), new Variable[] { var_82 }, new Term[] {term_150});sink.properties(safeRef(props_96));
        sink.start(_M_AddModuleKey2); sink.copy(term_110.ref()); sink.copy(term_144.ref()); sink.copy(term_98.ref());
        sink.start(_M_Concat); sink.copy(sub_137.ref());
        sink.start(_M__sCons); sink.copy(term_110.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.start(_M_Concat); sink.copy(sub_18.ref());
        sink.start(_M__sCons); sink.copy(term_110.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        Variable var_46 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_46});
        VariableUse use_83 = sink.context().makeVariableUse(var_46);
        sink.substitute(term_167.ref(), new Variable[] { var_82 }, new Term[] {use_83});
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddModuleKey, props_96, term_110, term_144, term_98, var_82, term_167);
  }     final public static boolean _M_AddModule(Sink sink, int shared, int depth, Properties props_90, Term term_292, Term term_166, Variable var_52, Term term_221) {
    if (depth < 2000) {
      label_69: {
        /* #filename=term */
        /* #main=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_90));
        sink.start(_M_AddModuleKey);
        sink.start(_M_ModuleKey); sink.copy(term_292.ref());
        sink.end(); sink.copy(term_292.ref()); sink.copy(term_166.ref());
        Variable var_15 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_15});
        VariableUse use_76 = sink.context().makeVariableUse(var_15);
        sink.substitute(term_221.ref(), new Variable[] { var_52 }, new Term[] {use_76});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddModule, props_90, term_292, term_166, var_52, term_221);
  }    final public static boolean _M_ModuleKey(Sink sink, int shared, int depth, Term term_19) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$module$"); sink.copy(term_19.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_ModuleKey, term_19);
  } 
  private static boolean initialized = false;
  public static void init(Context context)
  {
    if (!initialized) 
    { org.crsx.compiler.std.Core.init(context); org.crsx.compiler.std.Env.init(context); org.crsx.compiler.std.List.init(context); org.crsx.compiler.parser.Crsx.init(context); context.register(_M_QSORT); context.register(_M_KEYS); context.register(_M_IMPORTS); context.register(_M_RULES); context.register(_M_DATASORT); context.register(_M_FUNCSORT); context.register(_M_FORMKEYS); context.register(_M_STR); context.register(_M_NOCONTENTENTRY); context.register(_M_NOTLOADED); context.register(_M_LOADED); context.register(_M_MODULES); context.register(_M_MODULE); context.register(_M_MAINMODULE); context.register(_M_SUBMODULE); context.register(_M_OutputRuleDeclarationsForKey); context.register(_M_OutputRuleDeclarations); context.register(_M_OutputFuncDeclaration); context.register(_M_OutputFuncDeclarations); context.register(_M_OutputDataDeclarationsForKey); context.register(_M_OutputDataDeclarations); context.register(_M_OutputImportGrammarDeclarations); context.register(_M_OutputImportDeclarations); context.register(_M_OutputCrsx); context.register(_M_AddFuncSort2); context.register(_M_AddFuncSort1); context.register(_M_AddFuncSort); context.register(_M_AddDataForm2); context.register(_M_AddDataForm1); context.register(_M_AddDataForm); context.register(_M_AddDataSort3); context.register(_M_AddDataSort2); context.register(_M_AddDataSort1); context.register(_M_AddDataSort); context.register(_M_AddRule3); context.register(_M_AddRule2); context.register(_M_AddRule); context.register(_M_LookupSortByConstructor1); context.register(_M_LookupSortByConstructor); context.register(_M_LookupModule); context.register(_M_ConstructorToString); context.register(_M_SortnameToString); context.register(_M_FuncSortKey); context.register(_M_DataFormKey); context.register(_M_DataSortKey); context.register(_M_RulesKey); context.register(_M_UnRULES); context.register(_M_UnFUNCSORT); context.register(_M_UnDATASORT); context.register(_M_AddModuleKey2); context.register(_M_AddModuleKey); context.register(_M_AddModule); context.register(_M_ModuleKey);
      initialized = true;
    }
  }

/* END MODULE « "/Users/villardl/Projects/crsx/crsx4_2/src/state.crs.java" » */
}