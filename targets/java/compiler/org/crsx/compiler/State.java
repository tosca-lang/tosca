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
      label_34: {
        if (term.descriptor() != _M__sCons)
        {   break label_34;
        }Term sub = term.sub(0).ref();
        /* #rule=sub */Term sub_92 = term.sub(1).ref();
        /* #rules=sub */
        /* #keys=term *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclaration_xA3); sink.copy(sub.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();sink.properties(safeRef(props));
        sink.start(_M_OutputRuleDeclarationsForKey); sink.copy(sub_92.ref()); sink.copy(term_84.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputRuleDeclarationsForKey, props, term, term_84);
  }  final public static boolean _M_OutputRuleDeclarations(Sink sink, int shared, int depth, Properties props_32, Term term_26) {
    if (depth < 2000) {
      label_38: {
        if (term_26.descriptor() != _M__sNil)
        {   break label_38;
        }/*Contract*/ sink.start(_M__sNil); sink.end(); return true;
      }
      label_60: {
        if (term_26.descriptor() != _M__sCons)
        {   break label_60;
        }Term sub_47 = term_26.sub(0).ref();
        /* #key=sub */Term sub_73 = term_26.sub(1).ref();
        /* #keys=sub *//*Contract*/sink.properties(safeRef(props_32));
        sink.start(_M_OutputRuleDeclarationsForKey);
        sink.start(_M_UnRULES);
        sink.start(_M__s);sink.properties(safeRef(props_32));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(sub_47.ref());
        sink.end();
        sink.end(); sink.copy(sub_73.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputRuleDeclarations, props_32, term_26);
  } final public static boolean _M_OutputFuncDeclaration(Sink sink, int shared, int depth, Properties props_95, Term term_68, Term term_37) {
    if (depth < 2000) {
      sink.start(_M__sCons);
      sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
      sink.start(_M__sCons);
      sink.start(_M_Crsx_xdeclaration_xA4); sink.copy(term_68.ref());
      sink.end(); sink.start(_M__sNil); sink.end();
      sink.end();
      sink.end();sink.properties(safeRef(props_95));
      sink.start(_M_OutputFuncDeclarations); sink.copy(term_37.ref());
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_OutputFuncDeclaration, props_95, term_68, term_37);
  }  final public static boolean _M_OutputFuncDeclarations(Sink sink, int shared, int depth, Properties props_98, Term term_48) {
    if (depth < 2000) {
      label_35: {
        Term value = props_98 == null ? null : props_98.lookup("$rulekeys");
        if (value == null) 
        {   break label_35;
        }
        if (value.descriptor() != _M_KEYS)
        {   break label_35;
        }Term sub_79 = value.sub(0).ref();
        /* #keys=sub */
        if (term_48.descriptor() != _M__sNil)
        {   break label_35;
        }/*Contract*/sink.properties(safeRef(props_98));
        sink.start(_M_OutputRuleDeclarations); sink.copy(sub_79.ref());
        sink.end(); return true;
      }
      label_45: {
        if (term_48.descriptor() != _M__sCons)
        {   break label_45;
        }Term sub_69 = term_48.sub(0).ref();
        /* #key=sub */Term sub_81 = term_48.sub(1).ref();
        /* #keys=sub *//*Contract*/sink.properties(safeRef(props_98));
        sink.start(_M_OutputFuncDeclaration);
        sink.start(_M_UnFUNCSORT);
        sink.start(_M__s);sink.properties(safeRef(props_98));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(sub_69.ref());
        sink.end();
        sink.end(); sink.copy(sub_81.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputFuncDeclarations, props_98, term_48);
  } final public static boolean _M_OutputDataDeclarationsForKey(Sink sink, int shared, int depth, Properties props_96, Term term_81, Term term_91) {
    if (depth < 2000) {
      label_25: {
        if (term_81.descriptor() != _M__sNil)
        {   break label_25;
        }
        /* #keys=term *//*Contract*/sink.properties(safeRef(props_96));
        sink.start(_M_OutputDataDeclarations); sink.copy(term_91.ref());
        sink.end(); return true;
      }
      label_93: {
        if (term_81.descriptor() != _M__sCons)
        {   break label_93;
        }Term sub_46 = term_81.sub(0).ref();
        if (sub_46.descriptor() != _M_QSORT)
        {   break label_93;
        }Term sub_172 = sub_46.sub(0).ref();
        /* #qualifier=sub */Term sub_50 = sub_46.sub(1).ref();
        /* #sort=sub */Term sub_85 = term_81.sub(1).ref();
        /* #qsorts=sub */
        /* #keys=term *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclaration_xA4); sink.copy(sub_50.ref());
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();sink.properties(safeRef(props_96));
        sink.start(_M_OutputDataDeclarationsForKey); sink.copy(sub_85.ref()); sink.copy(term_91.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputDataDeclarationsForKey, props_96, term_81, term_91);
  }  final public static boolean _M_OutputDataDeclarations(Sink sink, int shared, int depth, Properties props_21, Term term_32) {
    if (depth < 2000) {
      label_22: {
        Term value_0 = props_21 == null ? null : props_21.lookup("$funckeys");
        if (value_0 == null) 
        {   break label_22;
        }
        if (value_0.descriptor() != _M_KEYS)
        {   break label_22;
        }Term sub_21 = value_0.sub(0).ref();
        /* #keys=sub */
        if (term_32.descriptor() != _M__sNil)
        {   break label_22;
        }/*Contract*/sink.properties(safeRef(props_21));
        sink.start(_M_OutputFuncDeclarations); sink.copy(sub_21.ref());
        sink.end(); return true;
      }
      label_43: {
        if (term_32.descriptor() != _M__sCons)
        {   break label_43;
        }Term sub_4 = term_32.sub(0).ref();
        /* #key=sub */Term sub_39 = term_32.sub(1).ref();
        /* #keys=sub *//*Contract*/sink.properties(safeRef(props_21));
        sink.start(_M_OutputDataDeclarationsForKey);
        sink.start(_M_UnDATASORT);
        sink.start(_M__s);sink.properties(safeRef(props_21));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(sub_4.ref());
        sink.end();
        sink.end(); sink.copy(sub_39.ref());
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputDataDeclarations, props_21, term_32);
  } final public static boolean _M_OutputImportGrammarDeclarations(Sink sink, int shared, int depth, Properties props_2, Term term_57) {
    if (depth < 2000) {
      label_12: {
        Term value_90 = props_2 == null ? null : props_2.lookup("$datakeys");
        if (value_90 == null) 
        {   break label_12;
        }
        if (value_90.descriptor() != _M_KEYS)
        {   break label_12;
        }Term sub_15 = value_90.sub(0).ref();
        /* #keys=sub */
        if (term_57.descriptor() != _M__sNil)
        {   break label_12;
        }/*Contract*/sink.properties(safeRef(props_2));
        sink.start(_M_OutputDataDeclarations); sink.copy(sub_15.ref());
        sink.end(); return true;
      }
      label_0: {
        if (term_57.descriptor() != _M__sCons)
        {   break label_0;
        }Term sub_0 = term_57.sub(0).ref();
        /* #import=sub */Term sub_40 = term_57.sub(1).ref();
        /* #imports=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclaration_xA2);
        sink.start(_M_Crsx_ximportDeclaration_xA3); sink.literal("import"); sink.literal("grammar");
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.copy(sub_0.ref());
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();sink.properties(safeRef(props_2));
        sink.start(_M_OutputImportGrammarDeclarations); sink.copy(sub_40.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputImportGrammarDeclarations, props_2, term_57);
  } final public static boolean _M_OutputImportDeclarations(Sink sink, int shared, int depth, Properties props_25, Term term_63) {
    if (depth < 2000) {
      label_52: {
        Term value_93 = props_25 == null ? null : props_25.lookup("$grammars");
        if (value_93 == null) 
        {   break label_52;
        }
        if (value_93.descriptor() != _M_IMPORTS)
        {   break label_52;
        }Term sub_14 = value_93.sub(0).ref();
        /* #imported=sub */
        if (term_63.descriptor() != _M__sNil)
        {   break label_52;
        }/*Contract*/sink.properties(safeRef(props_25));
        sink.start(_M_OutputImportGrammarDeclarations); sink.copy(sub_14.ref());
        sink.end(); return true;
      }
      label_62: {
        if (term_63.descriptor() != _M__sCons)
        {   break label_62;
        }Term sub_8 = term_63.sub(0).ref();
        /* #import=sub */Term sub_45 = term_63.sub(1).ref();
        /* #imports=sub *//*Contract*/
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclarations_xS1); sink.literal(";");
        sink.start(_M__sCons);
        sink.start(_M_Crsx_xdeclaration_xA2);
        sink.start(_M_Crsx_ximportDeclaration_xA2); sink.literal("import"); sink.literal("module");
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.copy(sub_8.ref());
        sink.end();
        sink.end();
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();sink.properties(safeRef(props_25));
        sink.start(_M_OutputImportDeclarations); sink.copy(sub_45.ref());
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputImportDeclarations, props_25, term_63);
  } final public static boolean _M_OutputCrsx(Sink sink, int shared, int depth, Properties props_60, Term term_22) {
    if (depth < 2000) {
      label_26: {
        Term value_16 = props_60 == null ? null : props_60.lookup("$imported");
        if (value_16 == null) 
        {   break label_26;
        }
        if (value_16.descriptor() != _M_IMPORTS)
        {   break label_26;
        }Term sub_83 = value_16.sub(0).ref();
        /* #imported=sub */
        if (term_22.descriptor() != _M_OK)
        {   break label_26;
        }/*Contract*/
        sink.start(_M_Crsx_xcrsx);
        sink.start(_M_Crsx_xdeclarations);
        sink.start(_M_Crsx_xdeclaration_xA5);
        sink.start(_M_Crsx_xdirective_xA1);
        sink.start(_M_Crsx_xconstructor_xA1); sink.start(_M_Crsx_xqualifier_xA2); sink.end(); sink.literal("$Lax");
        sink.end(); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();sink.properties(safeRef(props_60));
        sink.start(_M_OutputImportDeclarations); sink.copy(sub_83.ref());
        sink.end();
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_OutputCrsx, props_60, term_22);
  } final public static boolean _M_AddFuncSort2(Sink sink, int shared, int depth, Properties props_99, Term term_131, Term term_34, Term term_13, Variable var, Term term_38) {
    if (depth < 2000) {
      label_80: {
        if (term_131.descriptor() != _M_FUNCSORT)
        {   break label_80;
        }Term sub_42 = term_131.sub(0).ref();
        /* #qualifier=sub */Term sub_67 = term_131.sub(1).ref();
        /* #sort=sub */
        /* #key=term */
        if (term_13.descriptor() != _M_Crsx_xsortDeclaration_xA2)
        {   break label_80;
        }Term sub_101 = term_13.sub(0).ref();
        /* #sortparams?=sub */Term sub_84 = term_13.sub(1).ref();
        /* #sortset=sub */Term sub_30 = term_13.sub(2).ref();
        if (sub_30.descriptor() != _M_Crsx_xform_xA1)
        {   break label_80;
        }Term sub_37 = sub_30.sub(0).ref();
        /* #constructor=sub */Term sub_250 = sub_30.sub(1).ref();
        /* #arguments?=sub */Term sub_11 = term_13.sub(3).ref();Term sub_91 = term_13.sub(4).ref();
        /* #sortname=sub */
        /* #=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("Function sort already defined:");
        sink.start(_M_ConstructorToString); sink.copy(sub_37.ref());
        sink.end();
        sink.end();
        sink.end(); return true;
      }
      label_14: {
        Term value_143 = props_99 == null ? null : props_99.lookup("$funckeys");
        if (value_143 == null) 
        {   break label_14;
        }
        if (value_143.descriptor() != _M_KEYS)
        {   break label_14;
        }Term sub_18 = value_143.sub(0).ref();
        /* #keys=sub */
        Term value_28 = props_99 == null ? null : props_99.lookup("$qualifier");
        if (value_28 == null) 
        {   break label_14;
        }
        if (value_28.descriptor() != _M_STR)
        {   break label_14;
        }Term sub_77 = value_28.sub(0).ref();
        /* #qualifier=sub */
        if (term_131.descriptor() != _M_NOCONTENTENTRY)
        {   break label_14;
        }
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_99));Term term_64;
        {
          BufferSink buf = sink.context().makeBuffer();
          buf.start(_M_FUNCSORT); buf.copy(sub_77.ref()); buf.copy(term_13.ref());
          buf.end();
          term_64 = buf.term();
        }
        term_34 = force(sink.context(), term_34);
        Sink.property(sink, term_34, term_64);Term term_36;
        {
          BufferSink buf_86 = sink.context().makeBuffer();
          buf_86.start(_M_KEYS);
          buf_86.start(_M__sCons); buf_86.copy(term_34.ref()); buf_86.copy(sub_18.ref());
          buf_86.end();
          buf_86.end();
          term_36 = buf_86.term();
        } sink.propertyNamed("$funckeys", term_36);Term term_93;
        {
          BufferSink buf_53 = sink.context().makeBuffer(); buf_53.start(_M_OK); buf_53.end();
          term_93 = buf_53.term();
        }
        sink.substitute(term_38.ref(), new Variable[] { var }, new Term[] {term_93}); return true;
      }
    }
    return thunk(sink, _M_AddFuncSort2, props_99, term_131, term_34, term_13, var, term_38);
  }     final public static boolean _M_AddFuncSort1(Sink sink, int shared, int depth, Properties props_73, Term term_95, Term term_144, Variable var_75, Term term_6) {
    if (depth < 2000) {
      label_32: {
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_73));
        sink.start(_M_AddFuncSort2);
        sink.start(_M__s);sink.properties(safeRef(props_73));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_95.ref()); sink.start(_M_NOCONTENTENTRY); sink.end();
        sink.end(); sink.copy(term_95.ref()); sink.copy(term_144.ref());
        Variable var_38 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_38});
        VariableUse use = sink.context().makeVariableUse(var_38);
        sink.substitute(term_6.ref(), new Variable[] { var_75 }, new Term[] {use});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddFuncSort1, props_73, term_95, term_144, var_75, term_6);
  }    final public static boolean _M_AddFuncSort(Sink sink, int shared, int depth, Properties props_77, Term term_29, Variable var_36, Term term_67) {
    if (depth < 2000) {
      label_153: {
        if (term_29.descriptor() != _M_Crsx_xsortDeclaration_xA2)
        {   break label_153;
        }Term sub_78 = term_29.sub(0).ref();
        /* #sortparams?=sub */Term sub_41 = term_29.sub(1).ref();
        /* #sortset=sub */Term sub_53 = term_29.sub(2).ref();
        if (sub_53.descriptor() != _M_Crsx_xform_xA1)
        {   break label_153;
        }Term sub_155 = sub_53.sub(0).ref();
        /* #constructor=sub */Term sub_12 = sub_53.sub(1).ref();
        /* #arguments?=sub */Term sub_80 = term_29.sub(3).ref();Term sub_145 = term_29.sub(4).ref();
        /* #sortname=sub */
        /* #=term *//*Contract*/sink.properties(safeRef(props_77));
        sink.start(_M_AddFuncSort1);
        sink.start(_M_FuncSortKey); sink.copy(sub_155.ref());
        sink.end();
        sink.start(_M_Crsx_xsortDeclaration_xA2); sink.copy(sub_78.ref()); sink.copy(sub_41.ref());
        sink.start(_M_Crsx_xform_xA1); sink.copy(sub_155.ref()); sink.copy(sub_12.ref());
        sink.end(); sink.literal("::"); sink.copy(sub_145.ref());
        sink.end();
        Variable var_60 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_60});
        VariableUse use_14 = sink.context().makeVariableUse(var_60);
        sink.substitute(term_67.ref(), new Variable[] { var_36 }, new Term[] {use_14});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddFuncSort, props_77, term_29, var_36, term_67);
  }   final public static boolean _M_AddDataForm2(Sink sink, int shared, int depth, Properties props_14, Term term_42, Term term_11, Term term_76, Term term_3, Term term_59, Term term_17) {
    if (depth < 2000) {
      label_6: {
        if (term_42.descriptor() != _M_DATASORT)
        {   break label_6;
        }Term sub_17 = term_42.sub(0).ref();
        /* #sort=sub */
        /* #key=term */
        if (term_76.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_6;
        }Term sub_115 = term_76.sub(0).ref();
        if (sub_115.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_6;
        }Term sub_164 = term_76.sub(1).ref();
        /* #CONSTRUCTOR1=sub */
        if (term_3.descriptor() != _M_Crsx_xsortname_xA1)
        {   break label_6;
        }Term sub_24 = term_3.sub(0).ref();
        if (sub_24.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_6;
        }Term sub_174 = sub_24.sub(0).ref();
        if (sub_174.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_6;
        }Term sub_9 = sub_24.sub(1).ref();
        /* #CONSTRUCTOR2=sub */Term sub_153 = term_3.sub(1).ref();
        /* #sortarguments?=sub */
        /* #sortdecl=term */
        /* #CONTINUATION=term *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sError); sink.end();
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("Error: duplicate data form "); sink.copy(sub_164.ref()); sink.literal(" found in sort "); sink.copy(sub_9.ref()); sink.literal(".");
        sink.end();
        sink.end(); return true;
      }
      label_7: {
        Term value_88 = props_14 == null ? null : props_14.lookup("$qualifier");
        if (value_88 == null) 
        {   break label_7;
        }
        if (value_88.descriptor() != _M_STR)
        {   break label_7;
        }Term sub_125 = value_88.sub(0).ref();
        /* #qualifier=sub */
        if (term_42.descriptor() != _M_NOCONTENTENTRY)
        {   break label_7;
        }
        /* #key=term */
        /* #constructor=term */
        /* #sortname=term */
        /* #sortdecl=term */
        if (term_17.descriptor() != _M_CONTINUATION)
        {   break label_7;
        }Term sub_166 = term_17.sub(0).ref();
        Variable binder = term_17.binders(0)[0];
        /* #=sub *//*Contract*/sink.properties(safeRef(props_14));Term term_15;
        {
          BufferSink buf_62 = sink.context().makeBuffer();
          buf_62.start(_M_DATASORT);
          buf_62.start(_M__sCons);
          buf_62.start(_M_QSORT); buf_62.copy(sub_125.ref()); buf_62.copy(term_59.ref());
          buf_62.end(); buf_62.start(_M__sNil); buf_62.end();
          buf_62.end();
          buf_62.end();
          term_15 = buf_62.term();
        }
        term_11 = force(sink.context(), term_11);
        Sink.property(sink, term_11, term_15);Term term_121;
        {
          BufferSink buf_73 = sink.context().makeBuffer(); buf_73.start(_M_OK); buf_73.end();
          term_121 = buf_73.term();
        }
        sink.substitute(sub_166.ref(), new Variable[] { binder }, new Term[] {term_121}); return true; 
      }
    }
    return thunk(sink, _M_AddDataForm2, props_14, term_42, term_11, term_76, term_3, term_59, term_17);
  }      final public static boolean _M_AddDataForm1(Sink sink, int shared, int depth, Properties props_54, Term term_170, Term term_31, Term term_65, Term term_74, Term term_47) {
    if (depth < 2000) {sink.properties(safeRef(props_54));
      sink.start(_M_AddDataForm2);
      sink.start(_M__s);sink.properties(safeRef(props_54));
      sink.start(_M_Builtin_sGet);
      sink.end(); sink.copy(term_170.ref()); sink.start(_M_NOCONTENTENTRY); sink.end();
      sink.end(); sink.copy(term_170.ref()); sink.copy(term_31.ref()); sink.copy(term_65.ref()); sink.copy(term_74.ref()); sink.copy(term_47.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_AddDataForm1, props_54, term_170, term_31, term_65, term_74, term_47);
  }     final public static boolean _M_AddDataForm(Sink sink, int shared, int depth, Properties props_70, Term term_73, Term term_79, Term term_146, Term term_153) {
    if (depth < 2000) {
      label_79: {
        if (term_73.descriptor() != _M_Crsx_xforms_xS1)
        {   break label_79;
        }Term sub_10 = term_73.sub(0).ref();
        if (sub_10.descriptor() != _M_Crsx_xform_xA1)
        {   break label_79;
        }Term sub_22 = sub_10.sub(0).ref();
        /* #constructor=sub */Term sub_34 = sub_10.sub(1).ref();
        /* #arguments?=sub */Term sub_19 = term_73.sub(1).ref();
        /* #sortname=term */
        /* #sortdecl=term */
        /* #CONTINUATION=term *//*Contract*/sink.properties(safeRef(props_70));
        sink.start(_M_AddDataForm1);
        sink.start(_M_DataFormKey); sink.copy(sub_22.ref());
        sink.end(); sink.copy(sub_22.ref()); sink.copy(term_79.ref()); sink.copy(term_146.ref()); sink.copy(term_153.ref());
        sink.end(); return true;
      }
      label_105: {
        if (term_73.descriptor() != _M_Crsx_xforms_xS1)
        {   break label_105;
        }Term sub_134 = term_73.sub(0).ref();
        if (sub_134.descriptor() != _M_Crsx_xform_xA2)
        {   break label_105;
        }Term sub_28 = sub_134.sub(0).ref();
        /* #variable=sub */Term sub_61 = term_73.sub(1).ref();
        /* #sortname=term */
        /* #sortdecl=term */
        if (term_153.descriptor() != _M_CONTINUATION)
        {   break label_105;
        }Term sub_27 = term_153.sub(0).ref();
        Variable binder_4 = term_153.binders(0)[0];
        /* #=sub *//*Contract*/sink.properties(safeRef(props_70));Term term_77;
        {
          BufferSink buf_47 = sink.context().makeBuffer(); buf_47.start(_M_OK); buf_47.end();
          term_77 = buf_47.term();
        }
        sink.substitute(sub_27.ref(), new Variable[] { binder_4 }, new Term[] {term_77}); return true; 
      }
    }
    return thunk(sink, _M_AddDataForm, props_70, term_73, term_79, term_146, term_153);
  }    final public static boolean _M_AddDataSort3(Sink sink, int shared, int depth, Properties props_26, Term term_171, Term term_41, Term term_90, Variable var_9, Term term_89) {
    if (depth < 2000) {
      label_145: {
        Term value_73 = props_26 == null ? null : props_26.lookup("$qualifier");
        if (value_73 == null) 
        {   break label_145;
        }
        if (value_73.descriptor() != _M_STR)
        {   break label_145;
        }Term sub_60 = value_73.sub(0).ref();
        /* #qualifier=sub */
        if (term_171.descriptor() != _M_DATASORT)
        {   break label_145;
        }Term sub_76 = term_171.sub(0).ref();
        /* #sorts=sub */
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_26));Term term_51;
        {
          BufferSink buf_6 = sink.context().makeBuffer();
          buf_6.start(_M_DATASORT);
          buf_6.start(_M__sCons);
          buf_6.start(_M_QSORT); buf_6.copy(sub_60.ref()); buf_6.copy(term_90.ref());
          buf_6.end(); buf_6.copy(sub_76.ref());
          buf_6.end();
          buf_6.end();
          term_51 = buf_6.term();
        }
        term_41 = force(sink.context(), term_41);
        Sink.property(sink, term_41, term_51);Term term_58;
        {
          BufferSink buf_77 = sink.context().makeBuffer(); buf_77.start(_M_OK); buf_77.end();
          term_58 = buf_77.term();
        }
        sink.substitute(term_89.ref(), new Variable[] { var_9 }, new Term[] {term_58}); return true;
      }
      label_40: {
        Term value_59 = props_26 == null ? null : props_26.lookup("$datakeys");
        if (value_59 == null) 
        {   break label_40;
        }
        if (value_59.descriptor() != _M_KEYS)
        {   break label_40;
        }Term sub_7 = value_59.sub(0).ref();
        /* #keys=sub */
        Term value_72 = props_26 == null ? null : props_26.lookup("$qualifier");
        if (value_72 == null) 
        {   break label_40;
        }
        if (value_72.descriptor() != _M_STR)
        {   break label_40;
        }Term sub_1 = value_72.sub(0).ref();
        /* #qualifier=sub */
        if (term_171.descriptor() != _M_NOCONTENTENTRY)
        {   break label_40;
        }
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_26));Term term_39;
        {
          BufferSink buf_37 = sink.context().makeBuffer();
          buf_37.start(_M_DATASORT);
          buf_37.start(_M__sCons);
          buf_37.start(_M_QSORT); buf_37.copy(sub_1.ref()); buf_37.copy(term_90.ref());
          buf_37.end(); buf_37.start(_M__sNil); buf_37.end();
          buf_37.end();
          buf_37.end();
          term_39 = buf_37.term();
        }
        term_41 = force(sink.context(), term_41);
        Sink.property(sink, term_41, term_39);Term term_164;
        {
          BufferSink buf_50 = sink.context().makeBuffer();
          buf_50.start(_M_KEYS);
          buf_50.start(_M__sCons); buf_50.copy(term_41.ref()); buf_50.copy(sub_7.ref());
          buf_50.end();
          buf_50.end();
          term_164 = buf_50.term();
        } sink.propertyNamed("$datakeys", term_164);Term term_23;
        {
          BufferSink buf_191 = sink.context().makeBuffer(); buf_191.start(_M_OK); buf_191.end();
          term_23 = buf_191.term();
        }
        sink.substitute(term_89.ref(), new Variable[] { var_9 }, new Term[] {term_23}); return true;
      }
    }
    return thunk(sink, _M_AddDataSort3, props_26, term_171, term_41, term_90, var_9, term_89);
  }     final public static boolean _M_AddDataSort2(Sink sink, int shared, int depth, Properties props_115, Term term_188, Term term_264, Variable var_56, Term term_46) {
    if (depth < 2000) {
      label_72: {
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_115));
        sink.start(_M_AddDataSort3);
        sink.start(_M__s);sink.properties(safeRef(props_115));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_188.ref()); sink.start(_M_NOCONTENTENTRY); sink.end();
        sink.end(); sink.copy(term_188.ref()); sink.copy(term_264.ref());
        Variable var_144 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_144});
        VariableUse use_94 = sink.context().makeVariableUse(var_144);
        sink.substitute(term_46.ref(), new Variable[] { var_56 }, new Term[] {use_94});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddDataSort2, props_115, term_188, term_264, var_56, term_46);
  }    final public static boolean _M_AddDataSort1(Sink sink, int shared, int depth, Properties props_72, Term term_4, Term term_150, Variable var_4, Term term_33) {
    if (depth < 2000) {
      label_9: {
        /* #key=term */
        /* #sortDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_72));
        sink.start(_M_AddDataSort2); sink.copy(term_4.ref()); sink.copy(term_150.ref());
        Variable var_22 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_22});
        VariableUse use_9 = sink.context().makeVariableUse(var_22);
        sink.substitute(term_33.ref(), new Variable[] { var_4 }, new Term[] {use_9});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddDataSort1, props_72, term_4, term_150, var_4, term_33);
  }    final public static boolean _M_AddDataSort(Sink sink, int shared, int depth, Properties props_16, Term term_149, Variable var_42, Term term_5) {
    if (depth < 2000) {
      label_90: {
        if (term_149.descriptor() != _M_Crsx_xsortDeclaration_xA1)
        {   break label_90;
        }Term sub_299 = term_149.sub(0).ref();
        /* #sortparams?=sub */Term sub_3 = term_149.sub(1).ref();
        /* #sortset=sub */Term sub_43 = term_149.sub(2).ref();
        /* #sortname=sub */Term sub_48 = term_149.sub(3).ref();Term sub_198 = term_149.sub(4).ref();Term sub_44 = term_149.sub(5).ref();
        if (sub_44.descriptor() != _M_Crsx_xforms)
        {   break label_90;
        }Term sub_72 = sub_44.sub(0).ref();
        /* #forms_S1*=sub */Term sub_75 = term_149.sub(6).ref();
        /* #=term *//*Contract*/sink.properties(safeRef(props_16));
        sink.start(_M_AddDataSort1);
        sink.start(_M_DataSortKey); sink.copy(sub_43.ref());
        sink.end();
        sink.start(_M_Crsx_xsortDeclaration_xA1); sink.copy(sub_299.ref()); sink.copy(sub_3.ref()); sink.copy(sub_43.ref()); sink.literal("::="); sink.literal("(");
        sink.start(_M_Crsx_xforms); sink.copy(sub_72.ref());
        sink.end(); sink.literal(")");
        sink.end();
        Variable var_35 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_35});
        sink.start(_M_SeqMap);
        Variable var_135 = sink.context().makeVariable("form");
        Variable var_29 = sink.context().makeVariable("cont");
        sink.binds(new Variable[] {var_135,var_29});
        sink.start(_M_AddDataForm); sink.use(var_135); sink.copy(sub_43.ref());
        sink.start(_M_Crsx_xsortDeclaration_xA1); sink.copy(sub_299.ref()); sink.copy(sub_3.ref()); sink.copy(sub_43.ref()); sink.literal("::="); sink.literal("(");
        sink.start(_M_Crsx_xforms); sink.copy(sub_72.ref());
        sink.end(); sink.literal(")");
        sink.end(); sink.use(var_29);
        sink.end(); sink.copy(sub_72.ref());
        Variable var_50 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_50});
        VariableUse use_10 = sink.context().makeVariableUse(var_50);
        sink.substitute(term_5.ref(), new Variable[] { var_42 }, new Term[] {use_10});
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddDataSort, props_16, term_149, var_42, term_5);
  }   final public static boolean _M_AddRule3(Sink sink, int shared, int depth, Properties props_186, Term term_7, Term term_174, Term term_273, Variable var_5, Term term_60) {
    if (depth < 2000) {
      label_55: {
        if (term_7.descriptor() != _M_RULES)
        {   break label_55;
        }Term sub_38 = term_7.sub(0).ref();
        /* #rules=sub */
        /* #key=term */
        /* #ruleDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_186));Term term_24;
        {
          BufferSink buf_72 = sink.context().makeBuffer();
          buf_72.start(_M_RULES);
          buf_72.start(_M_Concat); buf_72.copy(sub_38.ref());
          buf_72.start(_M__sCons); buf_72.copy(term_273.ref()); buf_72.start(_M__sNil); buf_72.end();
          buf_72.end();
          buf_72.end();
          buf_72.end();
          term_24 = buf_72.term();
        }
        term_174 = force(sink.context(), term_174);
        Sink.property(sink, term_174, term_24);Term term_27;
        {
          BufferSink buf_48 = sink.context().makeBuffer(); buf_48.start(_M_OK); buf_48.end();
          term_27 = buf_48.term();
        }
        sink.substitute(term_60.ref(), new Variable[] { var_5 }, new Term[] {term_27}); return true;
      }
      label_85: {
        Term value_75 = props_186 == null ? null : props_186.lookup("$rulekeys");
        if (value_75 == null) 
        {   break label_85;
        }
        if (value_75.descriptor() != _M_KEYS)
        {   break label_85;
        }Term sub_51 = value_75.sub(0).ref();
        /* #keys=sub */
        if (term_7.descriptor() != _M_NOCONTENTENTRY)
        {   break label_85;
        }
        /* #key=term */
        /* #ruleDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_186));Term term_25;
        {
          BufferSink buf_14 = sink.context().makeBuffer();
          buf_14.start(_M_RULES);
          buf_14.start(_M__sCons); buf_14.copy(term_273.ref()); buf_14.start(_M__sNil); buf_14.end();
          buf_14.end();
          buf_14.end();
          term_25 = buf_14.term();
        }
        term_174 = force(sink.context(), term_174);
        Sink.property(sink, term_174, term_25);Term term_148;
        {
          BufferSink buf_179 = sink.context().makeBuffer();
          buf_179.start(_M_KEYS);
          buf_179.start(_M__sCons); buf_179.copy(term_174.ref()); buf_179.copy(sub_51.ref());
          buf_179.end();
          buf_179.end();
          term_148 = buf_179.term();
        } sink.propertyNamed("$rulekeys", term_148);Term term_66;
        {
          BufferSink buf_45 = sink.context().makeBuffer(); buf_45.start(_M_OK); buf_45.end();
          term_66 = buf_45.term();
        }
        sink.substitute(term_60.ref(), new Variable[] { var_5 }, new Term[] {term_66}); return true;
      }
    }
    return thunk(sink, _M_AddRule3, props_186, term_7, term_174, term_273, var_5, term_60);
  }     final public static boolean _M_AddRule2(Sink sink, int shared, int depth, Properties props_31, Term term_83, Term term_99, Variable var_44, Term term_80) {
    if (depth < 2000) {
      label_70: {
        /* #key=term */
        /* #ruleDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_31));
        sink.start(_M_AddRule3);
        sink.start(_M__s);sink.properties(safeRef(props_31));
        sink.start(_M_Builtin_sGet);
        sink.end(); sink.copy(term_83.ref()); sink.start(_M_NOCONTENTENTRY); sink.end();
        sink.end(); sink.copy(term_83.ref()); sink.copy(term_99.ref());
        Variable var_90 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_90});
        VariableUse use_69 = sink.context().makeVariableUse(var_90);
        sink.substitute(term_80.ref(), new Variable[] { var_44 }, new Term[] {use_69});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddRule2, props_31, term_83, term_99, var_44, term_80);
  }    final public static boolean _M_AddRule(Sink sink, int shared, int depth, Properties props_79, Term term_16, Term term_191, Variable var_125, Term term_21) {
    if (depth < 2000) {
      label_47: {
        /* #key=term */
        /* #ruleDeclaration=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_79));
        sink.start(_M_AddRule2); sink.copy(term_16.ref()); sink.copy(term_191.ref());
        Variable var_6 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_6});
        VariableUse use_7 = sink.context().makeVariableUse(var_6);
        sink.substitute(term_21.ref(), new Variable[] { var_125 }, new Term[] {use_7});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddRule, props_79, term_16, term_191, var_125, term_21);
  }    final public static boolean _M_LookupSortByConstructor1(Sink sink, int shared, int depth, Term term_86, Term term_35) {
    if (depth < 2000) {
      label_77: {
        if (term_86.descriptor() != _M_SOME)
        {   break label_77;
        }Term sub_26 = term_86.sub(0).ref();
        /* #1=sub */
        /* #2=term *//*Contract*/
        sink.start(_M_SOME); sink.copy(sub_26.ref());
        sink.end(); return true;
      }
      label_188: {
        if (term_86.descriptor() != _M_NONE)
        {   break label_188;
        }
        /* #2=term *//*Contract*/ sink.copy(term_35.ref()); return true;
      }
    }
    return thunk(sink, _M_LookupSortByConstructor1, term_86, term_35);
  }  final public static boolean _M_LookupSortByConstructor(Sink sink, int shared, int depth, Properties props_23, Term term_19) {
    if (depth < 2000) {
      sink.start(_M_LookupSortByConstructor1);sink.properties(safeRef(props_23));
      sink.start(_M_GetSome);
      sink.start(_M_FuncSortKey); sink.copy(term_19.ref());
      sink.end();
      sink.end();sink.properties(safeRef(props_23));
      sink.start(_M_GetSome);
      sink.start(_M_DataFormKey); sink.copy(term_19.ref());
      sink.end();
      sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_LookupSortByConstructor, props_23, term_19);
  } final public static boolean _M_LookupModule(Sink sink, int shared, int depth, Properties props_75, Term term_14) {
    if (depth < 2000) {sink.properties(safeRef(props_75));
      sink.start(_M_GetSome); sink.start(_M_ModuleKey); sink.copy(term_14.ref()); sink.end();
      sink.end(); return true;
    }
    return thunk(sink, _M_LookupModule, props_75, term_14);
  } final public static boolean _M_ConstructorToString(Sink sink, int shared, int depth, Term term_28) {
    if (depth < 2000) {
      label_81: {
        if (term_28.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_81;
        }Term sub_123 = term_28.sub(0).ref();
        if (sub_123.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_81;
        }Term sub_36 = term_28.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/ sink.copy(sub_36.ref()); return true;
      }
      label_69: {
        if (term_28.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_69;
        }Term sub_97 = term_28.sub(0).ref();
        if (sub_97.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_69;
        }Term sub_70 = sub_97.sub(0).ref();/*Contract*/ sink.literal(":"); return true;
      }
    }
    return thunk(sink, _M_ConstructorToString, term_28);
  } final public static boolean _M_SortnameToString(Sink sink, int shared, int depth, Term term_162) {
    if (depth < 2000) {
      label_68: {
        if (term_162.descriptor() != _M_Crsx_xsortname_xA1)
        {   break label_68;
        }Term sub_25 = term_162.sub(0).ref();
        if (sub_25.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_68;
        }Term sub_63 = sub_25.sub(0).ref();
        if (sub_63.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_68;
        }Term sub_86 = sub_25.sub(1).ref();
        /* #CONSTRUCTOR=sub */Term sub_195 = term_162.sub(1).ref();
        /* #sortarguments?=sub *//*Contract*/ sink.copy(sub_86.ref()); return true;
      }
      label_33: {
        if (term_162.descriptor() != _M_Crsx_xsortname_xA1)
        {   break label_33;
        }Term sub_65 = term_162.sub(0).ref();
        if (sub_65.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_33;
        }Term sub_165 = sub_65.sub(0).ref();
        if (sub_165.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_33;
        }Term sub_33 = sub_165.sub(0).ref();Term sub_35 = term_162.sub(1).ref();
        /* #sortarguments?=sub *//*Contract*/ sink.literal(":"); return true;
      }
    }
    return thunk(sink, _M_SortnameToString, term_162);
  } final public static boolean _M_FuncSortKey(Sink sink, int shared, int depth, Term term_98) {
    if (depth < 2000) {
      label_205: {
        if (term_98.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_205;
        }Term sub_173 = term_98.sub(0).ref();
        if (sub_173.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_205;
        }Term sub_29 = term_98.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$func$"); sink.copy(sub_29.ref());
        sink.end(); return true;
      }
      label_20: {
        if (term_98.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_20;
        }Term sub_95 = term_98.sub(0).ref();
        if (sub_95.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_20;
        }Term sub_118 = sub_95.sub(0).ref();/*Contract*/ sink.literal("$func$:"); return true;
      }
    }
    return thunk(sink, _M_FuncSortKey, term_98);
  } final public static boolean _M_DataFormKey(Sink sink, int shared, int depth, Term term_119) {
    if (depth < 2000) {
      label_15: {
        if (term_119.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_15;
        }Term sub_6 = term_119.sub(0).ref();
        if (sub_6.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_15;
        }Term sub_143 = term_119.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$form$"); sink.copy(sub_143.ref());
        sink.end(); return true;
      }
      label_66: {
        if (term_119.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_66;
        }Term sub_55 = term_119.sub(0).ref();
        if (sub_55.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_66;
        }Term sub_189 = sub_55.sub(0).ref();/*Contract*/ sink.literal("$form$:"); return true;
      }
    }
    return thunk(sink, _M_DataFormKey, term_119);
  } final public static boolean _M_DataSortKey(Sink sink, int shared, int depth, Term term_88) {
    if (depth < 2000) {
      label_37: {
        if (term_88.descriptor() != _M_Crsx_xsortname_xA1)
        {   break label_37;
        }Term sub_138 = term_88.sub(0).ref();
        if (sub_138.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_37;
        }Term sub_31 = sub_138.sub(0).ref();
        if (sub_31.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_37;
        }Term sub_261 = sub_138.sub(1).ref();
        /* #CONSTRUCTOR=sub */Term sub_290 = term_88.sub(1).ref();
        /* #sortarguments?=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$data$"); sink.copy(sub_261.ref());
        sink.end(); return true;
      }
      label_18: {
        if (term_88.descriptor() != _M_Crsx_xsortname_xA1)
        {   break label_18;
        }Term sub_162 = term_88.sub(0).ref();
        if (sub_162.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_18;
        }Term sub_23 = sub_162.sub(0).ref();
        if (sub_23.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_18;
        }Term sub_154 = sub_23.sub(0).ref();Term sub_102 = term_88.sub(1).ref();
        /* #sortarguments?=sub *//*Contract*/ sink.literal("$data$:"); return true;
      }
    }
    return thunk(sink, _M_DataSortKey, term_88);
  } final public static boolean _M_RulesKey(Sink sink, int shared, int depth, Term term_44) {
    if (depth < 2000) {
      label_4: {
        if (term_44.descriptor() != _M_Crsx_xconstructor_xA1)
        {   break label_4;
        }Term sub_54 = term_44.sub(0).ref();
        if (sub_54.descriptor() != _M_Crsx_xqualifier_xA2)
        {   break label_4;
        }Term sub_284 = term_44.sub(1).ref();
        /* #CONSTRUCTOR=sub *//*Contract*/
        sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$rules$"); sink.copy(sub_284.ref());
        sink.end(); return true;
      }
      label_13: {
        if (term_44.descriptor() != _M_Crsx_xconstructor_xA2)
        {   break label_13;
        }Term sub_375 = term_44.sub(0).ref();
        if (sub_375.descriptor() != _M_Crsx_xreserved_xA1)
        {   break label_13;
        }Term sub_175 = sub_375.sub(0).ref();/*Contract*/ sink.literal("$rules$:"); return true;
      }
    }
    return thunk(sink, _M_RulesKey, term_44);
  } final public static boolean _M_UnRULES(Sink sink, int shared, int depth, Term term_113) {
    if (depth < 2000) {
      label_214: {
        if (term_113.descriptor() != _M_RULES)
        {   break label_214;
        }Term sub_59 = term_113.sub(0).ref(); /* #=sub *//*Contract*/ sink.copy(sub_59.ref()); return true;
      }
    }
    return thunk(sink, _M_UnRULES, term_113);
  } final public static boolean _M_UnFUNCSORT(Sink sink, int shared, int depth, Term term_139) {
    if (depth < 2000) {
      label_84: {
        if (term_139.descriptor() != _M_FUNCSORT)
        {   break label_84;
        }Term sub_182 = term_139.sub(0).ref();
        /* #1=sub */Term sub_204 = term_139.sub(1).ref(); /* #=sub *//*Contract*/ sink.copy(sub_204.ref()); return true;
      }
    }
    return thunk(sink, _M_UnFUNCSORT, term_139);
  } final public static boolean _M_UnDATASORT(Sink sink, int shared, int depth, Term term_102) {
    if (depth < 2000) {
      label_199: {
        if (term_102.descriptor() != _M_DATASORT)
        {   break label_199;
        }Term sub_100 = term_102.sub(0).ref(); /* #=sub *//*Contract*/ sink.copy(sub_100.ref()); return true;
      }
    }
    return thunk(sink, _M_UnDATASORT, term_102);
  } final public static boolean _M_AddModuleKey2(Sink sink, int shared, int depth, Properties props_58, Term term_52, Term term_40, Term term_199, Term term_18, Term term_124, Variable var_78, Term term_186) {
    if (depth < 2000) {
      label_117: {
        /* #key=term */
        /* #filename=term */
        /* #main=term */
        /* #modules=term */
        /* #notloaded=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_58));Term term_107;
        {
          BufferSink buf_81 = sink.context().makeBuffer();
          buf_81.start(_M_MODULE); buf_81.copy(term_40.ref()); buf_81.copy(term_199.ref()); buf_81.start(_M_NOTLOADED); buf_81.end();
          buf_81.end();
          term_107 = buf_81.term();
        }
        term_52 = force(sink.context(), term_52);
        Sink.property(sink, term_52, term_107);Term term_137;
        {
          BufferSink buf_33 = sink.context().makeBuffer();
          buf_33.start(_M_MODULES); buf_33.copy(term_18.ref());
          buf_33.end();
          term_137 = buf_33.term();
        } sink.propertyNamed("$modules", term_137);Term term_161;
        {
          BufferSink buf_29 = sink.context().makeBuffer();
          buf_29.start(_M_MODULES); buf_29.copy(term_124.ref());
          buf_29.end();
          term_161 = buf_29.term();
        } sink.propertyNamed("$notloaded", term_161);Term term_72;
        {
          BufferSink buf_159 = sink.context().makeBuffer(); buf_159.start(_M_OK); buf_159.end();
          term_72 = buf_159.term();
        }
        sink.substitute(term_186.ref(), new Variable[] { var_78 }, new Term[] {term_72}); return true;
      }
    }
    return thunk(sink, _M_AddModuleKey2, props_58, term_52, term_40, term_199, term_18, term_124, var_78, term_186);
  }       final public static boolean _M_AddModuleKey(Sink sink, int shared, int depth, Properties props_9, Term term_12, Term term_96, Term term_109, Variable var_73, Term term_156) {
    if (depth < 2000) {
      label_23: {
        Term value_6 = props_9 == null ? null : props_9.lookup("$modules");
        if (value_6 == null) 
        {   break label_23;
        }
        if (value_6.descriptor() != _M_MODULES)
        {   break label_23;
        }Term sub_199 = value_6.sub(0).ref();
        /* #modules=sub */
        Term value_80 = props_9 == null ? null : props_9.lookup("$notloaded");
        if (value_80 == null) 
        {   break label_23;
        }
        if (value_80.descriptor() != _M_MODULES)
        {   break label_23;
        }Term sub_127 = value_80.sub(0).ref();
        /* #notloaded=sub */
        /* #key=term */
        /* #filename=term */
        /* #main=term */
        /* #=term *//*Contract*/
        sink.start(_M__s);sink.properties(safeRef(props_9));
        sink.start(_M_Builtin_sIfDef);
        sink.end(); sink.copy(term_12.ref());sink.properties(safeRef(props_9));Term term_103;
        {
          BufferSink buf_85 = sink.context().makeBuffer(); buf_85.start(_M_OK); buf_85.end();
          term_103 = buf_85.term();
        }
        sink.substitute(term_156.ref(), new Variable[] { var_73 }, new Term[] {term_103});sink.properties(safeRef(props_9));
        sink.start(_M_AddModuleKey2); sink.copy(term_12.ref()); sink.copy(term_96.ref()); sink.copy(term_109.ref());
        sink.start(_M_Concat); sink.copy(sub_199.ref());
        sink.start(_M__sCons); sink.copy(term_12.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        sink.start(_M_Concat); sink.copy(sub_127.ref());
        sink.start(_M__sCons); sink.copy(term_12.ref()); sink.start(_M__sNil); sink.end();
        sink.end();
        sink.end();
        Variable var_80 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_80});
        VariableUse use_34 = sink.context().makeVariableUse(var_80);
        sink.substitute(term_156.ref(), new Variable[] { var_73 }, new Term[] {use_34});
        sink.end();
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddModuleKey, props_9, term_12, term_96, term_109, var_73, term_156);
  }     final public static boolean _M_AddModule(Sink sink, int shared, int depth, Properties props_46, Term term_233, Term term_284, Variable var_62, Term term_49) {
    if (depth < 2000) {
      label_75: {
        /* #filename=term */
        /* #main=term */
        /* #=term *//*Contract*/sink.properties(safeRef(props_46));
        sink.start(_M_AddModuleKey);
        sink.start(_M_ModuleKey); sink.copy(term_233.ref());
        sink.end(); sink.copy(term_233.ref()); sink.copy(term_284.ref());
        Variable var_68 = sink.context().makeVariable("ok");
        sink.binds(new Variable[] {var_68});
        VariableUse use_92 = sink.context().makeVariableUse(var_68);
        sink.substitute(term_49.ref(), new Variable[] { var_62 }, new Term[] {use_92});
        sink.end(); return true;
      }
    }
    return thunk(sink, _M_AddModule, props_46, term_233, term_284, var_62, term_49);
  }    final public static boolean _M_ModuleKey(Sink sink, int shared, int depth, Term term_62) {
    if (depth < 2000) {
      sink.start(_M__s); sink.start(_M_Builtin_sColon); sink.end(); sink.literal("$module$"); sink.copy(term_62.ref());
      sink.end(); return true;
    }
    return thunk(sink, _M_ModuleKey, term_62);
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