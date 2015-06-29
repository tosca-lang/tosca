// Generated from /Users/villardl/Projects/crsx/crsx4/src/parser/CrsxMetaParser.g4 by ANTLR 4.5
package org.crsx.parser;

import org.crsx.pg.SinkAntlrListener;
import static org.crsx.pg.SinkAntlrListener.fireEnterZOM;
import static org.crsx.pg.SinkAntlrListener.fireExitZOM;
import static org.crsx.pg.SinkAntlrListener.fireEnterOPT;
import static org.crsx.pg.SinkAntlrListener.fireExitOPT;
import static org.crsx.pg.SinkAntlrListener.fireEnterAlt;
import static org.crsx.pg.SinkAntlrListener.fireExitAlt;
import static org.crsx.pg.SinkAntlrListener.fireHide;
import static org.crsx.pg.SinkAntlrListener.fireTail;
import static org.crsx.pg.SinkAntlrListener.fireTerm;
import static org.crsx.pg.SinkAntlrListener.fireEmbed;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CrsxMetaParser extends org.crsx.pg.Crsx3Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MT_crsx=1, ET_crsx=2, MT_declarations=3, ET_declarations=4, MT_declarations_S1_ZOM=5, 
		ET_declarations_S1_ZOM=6, MT_declarations_S1=7, ET_declarations_S1=8, 
		MT_semi_TOK=9, ET_semi_TOK=10, MT_declaration_OPT=11, ET_declaration_OPT=12, 
		MT_declaration=13, ET_declaration=14, MT_moduleDeclaration=15, ET_moduleDeclaration=16, 
		MT_module_TOK=17, ET_module_TOK=18, MT_constructor_TOK=19, ET_constructor_TOK=20, 
		MT_lbrace_TOK=21, ET_lbrace_TOK=22, MT_rbrace_TOK=23, ET_rbrace_TOK=24, 
		MT_importDeclaration=25, ET_importDeclaration=26, MT_import_TOK=27, ET_import_TOK=28, 
		MT_grammar_TOK=29, ET_grammar_TOK=30, MT_ruleDeclaration=31, ET_ruleDeclaration=32, 
		MT_option_OPT=33, ET_option_OPT=34, MT_arrow_TOK=35, ET_arrow_TOK=36, 
		MT_option=37, ET_option=38, MT_arguments_OPT=39, ET_arguments_OPT=40, 
		MT_colon_TOK=41, ET_colon_TOK=42, MT_pattern=43, ET_pattern=44, MT_properties_OPT=45, 
		ET_properties_OPT=46, MT_contractum=47, ET_contractum=48, MT_annotations=49, 
		ET_annotations=50, MT_annotation_OOM=51, ET_annotation_OOM=52, MT_annotation=53, 
		ET_annotation=54, MT_at_TOK=55, ET_at_TOK=56, MT_term=57, ET_term=58, 
		MT_freeTerm=59, ET_freeTerm=60, MT_annotations_OPT=61, ET_annotations_OPT=62, 
		MT_metavar_TOK=63, ET_metavar_TOK=64, MT_freeArguments_OPT=65, ET_freeArguments_OPT=66, 
		MT_boundTerm=67, ET_boundTerm=68, MT_nextBinder=69, ET_nextBinder=70, 
		MT_dot_TOK=71, ET_dot_TOK=72, MT_arguments=73, ET_arguments=74, MT_lsquare_TOK=75, 
		ET_lsquare_TOK=76, MT_terms_OPT=77, ET_terms_OPT=78, MT_rsquare_TOK=79, 
		ET_rsquare_TOK=80, MT_terms=81, ET_terms=82, MT_terms_S1_ZOM=83, ET_terms_S1_ZOM=84, 
		MT_terms_S1=85, ET_terms_S1=86, MT_comma_TOK=87, ET_comma_TOK=88, MT_freeArguments=89, 
		ET_freeArguments=90, MT_freeTerms_OPT=91, ET_freeTerms_OPT=92, MT_freeTerms=93, 
		ET_freeTerms=94, MT_freeTerms_S1_ZOM=95, ET_freeTerms_S1_ZOM=96, MT_freeTerms_S1=97, 
		ET_freeTerms_S1=98, MT_list=99, ET_list=100, MT_lpar_TOK=101, ET_lpar_TOK=102, 
		MT_termList_OPT=103, ET_termList_OPT=104, MT_rpar_TOK=105, ET_rpar_TOK=106, 
		MT_termList=107, ET_termList=108, MT_termList_S1_ZOM=109, ET_termList_S1_ZOM=110, 
		MT_termList_S1=111, ET_termList_S1=112, MT_term_OPT=113, ET_term_OPT=114, 
		MT_variable=115, ET_variable=116, MT_linear_OPT=117, ET_linear_OPT=118, 
		MT_variable_TOK=119, ET_variable_TOK=120, MT_functional_OPT=121, ET_functional_OPT=122, 
		MT_varsort_OPT=123, ET_varsort_OPT=124, MT_linear=125, ET_linear=126, 
		MT_linear_TOK=127, ET_linear_TOK=128, MT_functional=129, ET_functional=130, 
		MT_functional_TOK=131, ET_functional_TOK=132, MT_literal=133, ET_literal=134, 
		MT_string_TOK=135, ET_string_TOK=136, MT_number_TOK=137, ET_number_TOK=138, 
		MT_binder=139, ET_binder=140, MT_varsort=141, ET_varsort=142, MT_coloncolon_TOK=143, 
		ET_coloncolon_TOK=144, MT_concrete=145, ET_concrete=146, MT_category_TOK=147, 
		ET_category_TOK=148, MT_concrete_TOK=149, ET_concrete_TOK=150, MT_concrete2_TOK=151, 
		ET_concrete2_TOK=152, MT_concrete3_TOK=153, ET_concrete3_TOK=154, MT_concrete4_TOK=155, 
		ET_concrete4_TOK=156, MT_dispatch=157, ET_dispatch=158, MT_dispatch_TOK=159, 
		ET_dispatch_TOK=160, MT_delayCase_OPT=161, ET_delayCase_OPT=162, MT_dispatchTerm=163, 
		ET_dispatchTerm=164, MT_dispatchCases=165, ET_dispatchCases=166, MT_dispatchCases_S1_ZOM=167, 
		ET_dispatchCases_S1_ZOM=168, MT_dispatchCases_S1=169, ET_dispatchCases_S1=170, 
		MT_dispatchCase=171, ET_dispatchCase=172, MT_delayCase=173, ET_delayCase=174, 
		MT_delay_TOK=175, ET_delay_TOK=176, MT_properties=177, ET_properties=178, 
		MT_propertyList_OPT=179, ET_propertyList_OPT=180, MT_propertyList=181, 
		ET_propertyList=182, MT_propertyList_S1_ZOM=183, ET_propertyList_S1_ZOM=184, 
		MT_propertyList_S1=185, ET_propertyList_S1=186, MT_property_OPT=187, ET_property_OPT=188, 
		MT_property=189, ET_property=190, MT_not_TOK=191, ET_not_TOK=192, MT_expression=193, 
		ET_expression=194, MT_sortDeclaration=195, ET_sortDeclaration=196, MT_sortparams_OPT=197, 
		ET_sortparams_OPT=198, MT_datasort_TOK=199, ET_datasort_TOK=200, MT_sortparams=201, 
		ET_sortparams=202, MT_forall_TOK=203, ET_forall_TOK=204, MT_variable_OOM=205, 
		ET_variable_OOM=206, MT_sortset=207, ET_sortset=208, MT_sortnames=209, 
		ET_sortnames=210, MT_sortnames_S1_ZOM=211, ET_sortnames_S1_ZOM=212, MT_sortnames_S1=213, 
		ET_sortnames_S1=214, MT_sortname=215, ET_sortname=216, MT_sortarguments_OPT=217, 
		ET_sortarguments_OPT=218, MT_sortarguments=219, ET_sortarguments=220, 
		MT_sortnames_OPT=221, ET_sortnames_OPT=222, MT_forms=223, ET_forms=224, 
		MT_forms_S1_ZOM=225, ET_forms_S1_ZOM=226, MT_forms_S1=227, ET_forms_S1=228, 
		MT_form=229, ET_form=230, MT_constructor=231, ET_constructor=232, MT_qualifier=233, 
		ET_qualifier=234, MT_reserved=235, ET_reserved=236, MT_directive=237, 
		ET_directive=238, MT_directiveArguments_OPT=239, ET_directiveArguments_OPT=240, 
		MT_directiveArguments=241, ET_directiveArguments=242, MT_directives_OPT=243, 
		ET_directives_OPT=244, MT_directives=245, ET_directives=246, MT_directives_S1_ZOM=247, 
		ET_directives_S1_ZOM=248, MT_directives_S1=249, ET_directives_S1=250, 
		MT_directiveList=251, ET_directiveList=252, MT_declarations_OPT=253, ET_declarations_OPT=254, 
		MODULE=255, IMPORT=256, DISPATCH=257, DELAY=258, GRAMMAR=259, COLON=260, 
		ARROW=261, FORALL=262, LPAR=263, RPAR=264, LBRACE=265, RBRACE=266, LSQUARE=267, 
		RSQUARE=268, SEMI=269, COMMA=270, DATASORT=271, COLONCOLON=272, DOT=273, 
		NOT=274, LINEAR=275, FUNCTIONAL=276, AND=277, AT=278, CATEGORY=279, CONCRETE=280, 
		CONCRETE2=281, CONCRETE3=282, CONCRETE4=283, CONSTRUCTOR=284, VARIABLE=285, 
		METAVAR=286, STRING=287, NUMBER=288, WS=289, BLOCK_COMMENT=290, LINE_COMMENT=291, 
		XML_COMMENT=292, CRSX_EMBED_END=293;
	public static final int
		RULE_crsx = 0, RULE_crsx_EOF = 1, RULE_declarations = 2, RULE_declarations_EOF = 3, 
		RULE_declarations_S1_ZOM = 4, RULE_declarations_S1_ZOM_EOF = 5, RULE_declarations_S1 = 6, 
		RULE_declarations_S1_EOF = 7, RULE_semi_TOK = 8, RULE_semi_TOK_EOF = 9, 
		RULE_declaration_OPT = 10, RULE_declaration_OPT_EOF = 11, RULE_declaration = 12, 
		RULE_declaration_EOF = 13, RULE_moduleDeclaration = 14, RULE_moduleDeclaration_EOF = 15, 
		RULE_module_TOK = 16, RULE_module_TOK_EOF = 17, RULE_constructor_TOK = 18, 
		RULE_constructor_TOK_EOF = 19, RULE_lbrace_TOK = 20, RULE_lbrace_TOK_EOF = 21, 
		RULE_rbrace_TOK = 22, RULE_rbrace_TOK_EOF = 23, RULE_importDeclaration = 24, 
		RULE_importDeclaration_EOF = 25, RULE_import_TOK = 26, RULE_import_TOK_EOF = 27, 
		RULE_grammar_TOK = 28, RULE_grammar_TOK_EOF = 29, RULE_ruleDeclaration = 30, 
		RULE_ruleDeclaration_EOF = 31, RULE_option_OPT = 32, RULE_option_OPT_EOF = 33, 
		RULE_arrow_TOK = 34, RULE_arrow_TOK_EOF = 35, RULE_option = 36, RULE_option_EOF = 37, 
		RULE_arguments_OPT = 38, RULE_arguments_OPT_EOF = 39, RULE_colon_TOK = 40, 
		RULE_colon_TOK_EOF = 41, RULE_pattern = 42, RULE_pattern_EOF = 43, RULE_properties_OPT = 44, 
		RULE_properties_OPT_EOF = 45, RULE_contractum = 46, RULE_contractum_EOF = 47, 
		RULE_annotations = 48, RULE_annotations_EOF = 49, RULE_annotation_OOM = 50, 
		RULE_annotation_OOM_EOF = 51, RULE_annotation = 52, RULE_annotation_EOF = 53, 
		RULE_at_TOK = 54, RULE_at_TOK_EOF = 55, RULE_term = 56, RULE_term_EOF = 57, 
		RULE_freeTerm = 58, RULE_freeTerm_EOF = 59, RULE_annotations_OPT = 60, 
		RULE_annotations_OPT_EOF = 61, RULE_metavar_TOK = 62, RULE_metavar_TOK_EOF = 63, 
		RULE_freeArguments_OPT = 64, RULE_freeArguments_OPT_EOF = 65, RULE_boundTerm = 66, 
		RULE_boundTerm_EOF = 67, RULE_nextBinder = 68, RULE_nextBinder_EOF = 69, 
		RULE_dot_TOK = 70, RULE_dot_TOK_EOF = 71, RULE_arguments = 72, RULE_arguments_EOF = 73, 
		RULE_lsquare_TOK = 74, RULE_lsquare_TOK_EOF = 75, RULE_terms_OPT = 76, 
		RULE_terms_OPT_EOF = 77, RULE_rsquare_TOK = 78, RULE_rsquare_TOK_EOF = 79, 
		RULE_terms = 80, RULE_terms_EOF = 81, RULE_terms_S1_ZOM = 82, RULE_terms_S1_ZOM_EOF = 83, 
		RULE_terms_S1 = 84, RULE_terms_S1_EOF = 85, RULE_comma_TOK = 86, RULE_comma_TOK_EOF = 87, 
		RULE_freeArguments = 88, RULE_freeArguments_EOF = 89, RULE_freeTerms_OPT = 90, 
		RULE_freeTerms_OPT_EOF = 91, RULE_freeTerms = 92, RULE_freeTerms_EOF = 93, 
		RULE_freeTerms_S1_ZOM = 94, RULE_freeTerms_S1_ZOM_EOF = 95, RULE_freeTerms_S1 = 96, 
		RULE_freeTerms_S1_EOF = 97, RULE_list = 98, RULE_list_EOF = 99, RULE_lpar_TOK = 100, 
		RULE_lpar_TOK_EOF = 101, RULE_termList_OPT = 102, RULE_termList_OPT_EOF = 103, 
		RULE_rpar_TOK = 104, RULE_rpar_TOK_EOF = 105, RULE_termList = 106, RULE_termList_EOF = 107, 
		RULE_termList_S1_ZOM = 108, RULE_termList_S1_ZOM_EOF = 109, RULE_termList_S1 = 110, 
		RULE_termList_S1_EOF = 111, RULE_term_OPT = 112, RULE_term_OPT_EOF = 113, 
		RULE_variable = 114, RULE_variable_EOF = 115, RULE_linear_OPT = 116, RULE_linear_OPT_EOF = 117, 
		RULE_variable_TOK = 118, RULE_variable_TOK_EOF = 119, RULE_functional_OPT = 120, 
		RULE_functional_OPT_EOF = 121, RULE_varsort_OPT = 122, RULE_varsort_OPT_EOF = 123, 
		RULE_linear = 124, RULE_linear_EOF = 125, RULE_linear_TOK = 126, RULE_linear_TOK_EOF = 127, 
		RULE_functional = 128, RULE_functional_EOF = 129, RULE_functional_TOK = 130, 
		RULE_functional_TOK_EOF = 131, RULE_literal = 132, RULE_literal_EOF = 133, 
		RULE_string_TOK = 134, RULE_string_TOK_EOF = 135, RULE_number_TOK = 136, 
		RULE_number_TOK_EOF = 137, RULE_binder = 138, RULE_binder_EOF = 139, RULE_varsort = 140, 
		RULE_varsort_EOF = 141, RULE_coloncolon_TOK = 142, RULE_coloncolon_TOK_EOF = 143, 
		RULE_concrete = 144, RULE_concrete_EOF = 145, RULE_category_TOK = 146, 
		RULE_category_TOK_EOF = 147, RULE_concrete_TOK = 148, RULE_concrete_TOK_EOF = 149, 
		RULE_concrete2_TOK = 150, RULE_concrete2_TOK_EOF = 151, RULE_concrete3_TOK = 152, 
		RULE_concrete3_TOK_EOF = 153, RULE_concrete4_TOK = 154, RULE_concrete4_TOK_EOF = 155, 
		RULE_dispatch = 156, RULE_dispatch_EOF = 157, RULE_dispatch_TOK = 158, 
		RULE_dispatch_TOK_EOF = 159, RULE_delayCase_OPT = 160, RULE_delayCase_OPT_EOF = 161, 
		RULE_dispatchTerm = 162, RULE_dispatchTerm_EOF = 163, RULE_dispatchCases = 164, 
		RULE_dispatchCases_EOF = 165, RULE_dispatchCases_S1_ZOM = 166, RULE_dispatchCases_S1_ZOM_EOF = 167, 
		RULE_dispatchCases_S1 = 168, RULE_dispatchCases_S1_EOF = 169, RULE_dispatchCase = 170, 
		RULE_dispatchCase_EOF = 171, RULE_delayCase = 172, RULE_delayCase_EOF = 173, 
		RULE_delay_TOK = 174, RULE_delay_TOK_EOF = 175, RULE_properties = 176, 
		RULE_properties_EOF = 177, RULE_propertyList_OPT = 178, RULE_propertyList_OPT_EOF = 179, 
		RULE_propertyList = 180, RULE_propertyList_EOF = 181, RULE_propertyList_S1_ZOM = 182, 
		RULE_propertyList_S1_ZOM_EOF = 183, RULE_propertyList_S1 = 184, RULE_propertyList_S1_EOF = 185, 
		RULE_property_OPT = 186, RULE_property_OPT_EOF = 187, RULE_property = 188, 
		RULE_property_EOF = 189, RULE_not_TOK = 190, RULE_not_TOK_EOF = 191, RULE_expression = 192, 
		RULE_expression_EOF = 193, RULE_sortDeclaration = 194, RULE_sortDeclaration_EOF = 195, 
		RULE_sortparams_OPT = 196, RULE_sortparams_OPT_EOF = 197, RULE_datasort_TOK = 198, 
		RULE_datasort_TOK_EOF = 199, RULE_sortparams = 200, RULE_sortparams_EOF = 201, 
		RULE_forall_TOK = 202, RULE_forall_TOK_EOF = 203, RULE_variable_OOM = 204, 
		RULE_variable_OOM_EOF = 205, RULE_sortset = 206, RULE_sortset_EOF = 207, 
		RULE_sortnames = 208, RULE_sortnames_EOF = 209, RULE_sortnames_S1_ZOM = 210, 
		RULE_sortnames_S1_ZOM_EOF = 211, RULE_sortnames_S1 = 212, RULE_sortnames_S1_EOF = 213, 
		RULE_sortname = 214, RULE_sortname_EOF = 215, RULE_sortarguments_OPT = 216, 
		RULE_sortarguments_OPT_EOF = 217, RULE_sortarguments = 218, RULE_sortarguments_EOF = 219, 
		RULE_sortnames_OPT = 220, RULE_sortnames_OPT_EOF = 221, RULE_forms = 222, 
		RULE_forms_EOF = 223, RULE_forms_S1_ZOM = 224, RULE_forms_S1_ZOM_EOF = 225, 
		RULE_forms_S1 = 226, RULE_forms_S1_EOF = 227, RULE_form = 228, RULE_form_EOF = 229, 
		RULE_constructor = 230, RULE_constructor_EOF = 231, RULE_qualifier = 232, 
		RULE_qualifier_EOF = 233, RULE_reserved = 234, RULE_reserved_EOF = 235, 
		RULE_directive = 236, RULE_directive_EOF = 237, RULE_directiveArguments_OPT = 238, 
		RULE_directiveArguments_OPT_EOF = 239, RULE_directiveArguments = 240, 
		RULE_directiveArguments_EOF = 241, RULE_directives_OPT = 242, RULE_directives_OPT_EOF = 243, 
		RULE_directives = 244, RULE_directives_EOF = 245, RULE_directives_S1_ZOM = 246, 
		RULE_directives_S1_ZOM_EOF = 247, RULE_directives_S1 = 248, RULE_directives_S1_EOF = 249, 
		RULE_directiveList = 250, RULE_directiveList_EOF = 251, RULE_declarations_OPT = 252, 
		RULE_declarations_OPT_EOF = 253;
	public static final String[] ruleNames = {
		"crsx", "crsx_EOF", "declarations", "declarations_EOF", "declarations_S1_ZOM", 
		"declarations_S1_ZOM_EOF", "declarations_S1", "declarations_S1_EOF", "semi_TOK", 
		"semi_TOK_EOF", "declaration_OPT", "declaration_OPT_EOF", "declaration", 
		"declaration_EOF", "moduleDeclaration", "moduleDeclaration_EOF", "module_TOK", 
		"module_TOK_EOF", "constructor_TOK", "constructor_TOK_EOF", "lbrace_TOK", 
		"lbrace_TOK_EOF", "rbrace_TOK", "rbrace_TOK_EOF", "importDeclaration", 
		"importDeclaration_EOF", "import_TOK", "import_TOK_EOF", "grammar_TOK", 
		"grammar_TOK_EOF", "ruleDeclaration", "ruleDeclaration_EOF", "option_OPT", 
		"option_OPT_EOF", "arrow_TOK", "arrow_TOK_EOF", "option", "option_EOF", 
		"arguments_OPT", "arguments_OPT_EOF", "colon_TOK", "colon_TOK_EOF", "pattern", 
		"pattern_EOF", "properties_OPT", "properties_OPT_EOF", "contractum", "contractum_EOF", 
		"annotations", "annotations_EOF", "annotation_OOM", "annotation_OOM_EOF", 
		"annotation", "annotation_EOF", "at_TOK", "at_TOK_EOF", "term", "term_EOF", 
		"freeTerm", "freeTerm_EOF", "annotations_OPT", "annotations_OPT_EOF", 
		"metavar_TOK", "metavar_TOK_EOF", "freeArguments_OPT", "freeArguments_OPT_EOF", 
		"boundTerm", "boundTerm_EOF", "nextBinder", "nextBinder_EOF", "dot_TOK", 
		"dot_TOK_EOF", "arguments", "arguments_EOF", "lsquare_TOK", "lsquare_TOK_EOF", 
		"terms_OPT", "terms_OPT_EOF", "rsquare_TOK", "rsquare_TOK_EOF", "terms", 
		"terms_EOF", "terms_S1_ZOM", "terms_S1_ZOM_EOF", "terms_S1", "terms_S1_EOF", 
		"comma_TOK", "comma_TOK_EOF", "freeArguments", "freeArguments_EOF", "freeTerms_OPT", 
		"freeTerms_OPT_EOF", "freeTerms", "freeTerms_EOF", "freeTerms_S1_ZOM", 
		"freeTerms_S1_ZOM_EOF", "freeTerms_S1", "freeTerms_S1_EOF", "list", "list_EOF", 
		"lpar_TOK", "lpar_TOK_EOF", "termList_OPT", "termList_OPT_EOF", "rpar_TOK", 
		"rpar_TOK_EOF", "termList", "termList_EOF", "termList_S1_ZOM", "termList_S1_ZOM_EOF", 
		"termList_S1", "termList_S1_EOF", "term_OPT", "term_OPT_EOF", "variable", 
		"variable_EOF", "linear_OPT", "linear_OPT_EOF", "variable_TOK", "variable_TOK_EOF", 
		"functional_OPT", "functional_OPT_EOF", "varsort_OPT", "varsort_OPT_EOF", 
		"linear", "linear_EOF", "linear_TOK", "linear_TOK_EOF", "functional", 
		"functional_EOF", "functional_TOK", "functional_TOK_EOF", "literal", "literal_EOF", 
		"string_TOK", "string_TOK_EOF", "number_TOK", "number_TOK_EOF", "binder", 
		"binder_EOF", "varsort", "varsort_EOF", "coloncolon_TOK", "coloncolon_TOK_EOF", 
		"concrete", "concrete_EOF", "category_TOK", "category_TOK_EOF", "concrete_TOK", 
		"concrete_TOK_EOF", "concrete2_TOK", "concrete2_TOK_EOF", "concrete3_TOK", 
		"concrete3_TOK_EOF", "concrete4_TOK", "concrete4_TOK_EOF", "dispatch", 
		"dispatch_EOF", "dispatch_TOK", "dispatch_TOK_EOF", "delayCase_OPT", "delayCase_OPT_EOF", 
		"dispatchTerm", "dispatchTerm_EOF", "dispatchCases", "dispatchCases_EOF", 
		"dispatchCases_S1_ZOM", "dispatchCases_S1_ZOM_EOF", "dispatchCases_S1", 
		"dispatchCases_S1_EOF", "dispatchCase", "dispatchCase_EOF", "delayCase", 
		"delayCase_EOF", "delay_TOK", "delay_TOK_EOF", "properties", "properties_EOF", 
		"propertyList_OPT", "propertyList_OPT_EOF", "propertyList", "propertyList_EOF", 
		"propertyList_S1_ZOM", "propertyList_S1_ZOM_EOF", "propertyList_S1", "propertyList_S1_EOF", 
		"property_OPT", "property_OPT_EOF", "property", "property_EOF", "not_TOK", 
		"not_TOK_EOF", "expression", "expression_EOF", "sortDeclaration", "sortDeclaration_EOF", 
		"sortparams_OPT", "sortparams_OPT_EOF", "datasort_TOK", "datasort_TOK_EOF", 
		"sortparams", "sortparams_EOF", "forall_TOK", "forall_TOK_EOF", "variable_OOM", 
		"variable_OOM_EOF", "sortset", "sortset_EOF", "sortnames", "sortnames_EOF", 
		"sortnames_S1_ZOM", "sortnames_S1_ZOM_EOF", "sortnames_S1", "sortnames_S1_EOF", 
		"sortname", "sortname_EOF", "sortarguments_OPT", "sortarguments_OPT_EOF", 
		"sortarguments", "sortarguments_EOF", "sortnames_OPT", "sortnames_OPT_EOF", 
		"forms", "forms_EOF", "forms_S1_ZOM", "forms_S1_ZOM_EOF", "forms_S1", 
		"forms_S1_EOF", "form", "form_EOF", "constructor", "constructor_EOF", 
		"qualifier", "qualifier_EOF", "reserved", "reserved_EOF", "directive", 
		"directive_EOF", "directiveArguments_OPT", "directiveArguments_OPT_EOF", 
		"directiveArguments", "directiveArguments_EOF", "directives_OPT", "directives_OPT_EOF", 
		"directives", "directives_EOF", "directives_S1_ZOM", "directives_S1_ZOM_EOF", 
		"directives_S1", "directives_S1_EOF", "directiveList", "directiveList_EOF", 
		"declarations_OPT", "declarations_OPT_EOF"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'module'", "'import'", "'dispatch'", "'delay'", "'grammar'", 
		"':'", "'→'", "'∀'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
		"','", "'::='", "'::'", "'.'", "'¬'", "'¹'", "'ᵇ'", "'&'", "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MT_crsx", "ET_crsx", "MT_declarations", "ET_declarations", "MT_declarations_S1_ZOM", 
		"ET_declarations_S1_ZOM", "MT_declarations_S1", "ET_declarations_S1", 
		"MT_semi_TOK", "ET_semi_TOK", "MT_declaration_OPT", "ET_declaration_OPT", 
		"MT_declaration", "ET_declaration", "MT_moduleDeclaration", "ET_moduleDeclaration", 
		"MT_module_TOK", "ET_module_TOK", "MT_constructor_TOK", "ET_constructor_TOK", 
		"MT_lbrace_TOK", "ET_lbrace_TOK", "MT_rbrace_TOK", "ET_rbrace_TOK", "MT_importDeclaration", 
		"ET_importDeclaration", "MT_import_TOK", "ET_import_TOK", "MT_grammar_TOK", 
		"ET_grammar_TOK", "MT_ruleDeclaration", "ET_ruleDeclaration", "MT_option_OPT", 
		"ET_option_OPT", "MT_arrow_TOK", "ET_arrow_TOK", "MT_option", "ET_option", 
		"MT_arguments_OPT", "ET_arguments_OPT", "MT_colon_TOK", "ET_colon_TOK", 
		"MT_pattern", "ET_pattern", "MT_properties_OPT", "ET_properties_OPT", 
		"MT_contractum", "ET_contractum", "MT_annotations", "ET_annotations", 
		"MT_annotation_OOM", "ET_annotation_OOM", "MT_annotation", "ET_annotation", 
		"MT_at_TOK", "ET_at_TOK", "MT_term", "ET_term", "MT_freeTerm", "ET_freeTerm", 
		"MT_annotations_OPT", "ET_annotations_OPT", "MT_metavar_TOK", "ET_metavar_TOK", 
		"MT_freeArguments_OPT", "ET_freeArguments_OPT", "MT_boundTerm", "ET_boundTerm", 
		"MT_nextBinder", "ET_nextBinder", "MT_dot_TOK", "ET_dot_TOK", "MT_arguments", 
		"ET_arguments", "MT_lsquare_TOK", "ET_lsquare_TOK", "MT_terms_OPT", "ET_terms_OPT", 
		"MT_rsquare_TOK", "ET_rsquare_TOK", "MT_terms", "ET_terms", "MT_terms_S1_ZOM", 
		"ET_terms_S1_ZOM", "MT_terms_S1", "ET_terms_S1", "MT_comma_TOK", "ET_comma_TOK", 
		"MT_freeArguments", "ET_freeArguments", "MT_freeTerms_OPT", "ET_freeTerms_OPT", 
		"MT_freeTerms", "ET_freeTerms", "MT_freeTerms_S1_ZOM", "ET_freeTerms_S1_ZOM", 
		"MT_freeTerms_S1", "ET_freeTerms_S1", "MT_list", "ET_list", "MT_lpar_TOK", 
		"ET_lpar_TOK", "MT_termList_OPT", "ET_termList_OPT", "MT_rpar_TOK", "ET_rpar_TOK", 
		"MT_termList", "ET_termList", "MT_termList_S1_ZOM", "ET_termList_S1_ZOM", 
		"MT_termList_S1", "ET_termList_S1", "MT_term_OPT", "ET_term_OPT", "MT_variable", 
		"ET_variable", "MT_linear_OPT", "ET_linear_OPT", "MT_variable_TOK", "ET_variable_TOK", 
		"MT_functional_OPT", "ET_functional_OPT", "MT_varsort_OPT", "ET_varsort_OPT", 
		"MT_linear", "ET_linear", "MT_linear_TOK", "ET_linear_TOK", "MT_functional", 
		"ET_functional", "MT_functional_TOK", "ET_functional_TOK", "MT_literal", 
		"ET_literal", "MT_string_TOK", "ET_string_TOK", "MT_number_TOK", "ET_number_TOK", 
		"MT_binder", "ET_binder", "MT_varsort", "ET_varsort", "MT_coloncolon_TOK", 
		"ET_coloncolon_TOK", "MT_concrete", "ET_concrete", "MT_category_TOK", 
		"ET_category_TOK", "MT_concrete_TOK", "ET_concrete_TOK", "MT_concrete2_TOK", 
		"ET_concrete2_TOK", "MT_concrete3_TOK", "ET_concrete3_TOK", "MT_concrete4_TOK", 
		"ET_concrete4_TOK", "MT_dispatch", "ET_dispatch", "MT_dispatch_TOK", "ET_dispatch_TOK", 
		"MT_delayCase_OPT", "ET_delayCase_OPT", "MT_dispatchTerm", "ET_dispatchTerm", 
		"MT_dispatchCases", "ET_dispatchCases", "MT_dispatchCases_S1_ZOM", "ET_dispatchCases_S1_ZOM", 
		"MT_dispatchCases_S1", "ET_dispatchCases_S1", "MT_dispatchCase", "ET_dispatchCase", 
		"MT_delayCase", "ET_delayCase", "MT_delay_TOK", "ET_delay_TOK", "MT_properties", 
		"ET_properties", "MT_propertyList_OPT", "ET_propertyList_OPT", "MT_propertyList", 
		"ET_propertyList", "MT_propertyList_S1_ZOM", "ET_propertyList_S1_ZOM", 
		"MT_propertyList_S1", "ET_propertyList_S1", "MT_property_OPT", "ET_property_OPT", 
		"MT_property", "ET_property", "MT_not_TOK", "ET_not_TOK", "MT_expression", 
		"ET_expression", "MT_sortDeclaration", "ET_sortDeclaration", "MT_sortparams_OPT", 
		"ET_sortparams_OPT", "MT_datasort_TOK", "ET_datasort_TOK", "MT_sortparams", 
		"ET_sortparams", "MT_forall_TOK", "ET_forall_TOK", "MT_variable_OOM", 
		"ET_variable_OOM", "MT_sortset", "ET_sortset", "MT_sortnames", "ET_sortnames", 
		"MT_sortnames_S1_ZOM", "ET_sortnames_S1_ZOM", "MT_sortnames_S1", "ET_sortnames_S1", 
		"MT_sortname", "ET_sortname", "MT_sortarguments_OPT", "ET_sortarguments_OPT", 
		"MT_sortarguments", "ET_sortarguments", "MT_sortnames_OPT", "ET_sortnames_OPT", 
		"MT_forms", "ET_forms", "MT_forms_S1_ZOM", "ET_forms_S1_ZOM", "MT_forms_S1", 
		"ET_forms_S1", "MT_form", "ET_form", "MT_constructor", "ET_constructor", 
		"MT_qualifier", "ET_qualifier", "MT_reserved", "ET_reserved", "MT_directive", 
		"ET_directive", "MT_directiveArguments_OPT", "ET_directiveArguments_OPT", 
		"MT_directiveArguments", "ET_directiveArguments", "MT_directives_OPT", 
		"ET_directives_OPT", "MT_directives", "ET_directives", "MT_directives_S1_ZOM", 
		"ET_directives_S1_ZOM", "MT_directives_S1", "ET_directives_S1", "MT_directiveList", 
		"ET_directiveList", "MT_declarations_OPT", "ET_declarations_OPT", "MODULE", 
		"IMPORT", "DISPATCH", "DELAY", "GRAMMAR", "COLON", "ARROW", "FORALL", 
		"LPAR", "RPAR", "LBRACE", "RBRACE", "LSQUARE", "RSQUARE", "SEMI", "COMMA", 
		"DATASORT", "COLONCOLON", "DOT", "NOT", "LINEAR", "FUNCTIONAL", "AND", 
		"AT", "CATEGORY", "CONCRETE", "CONCRETE2", "CONCRETE3", "CONCRETE4", "CONSTRUCTOR", 
		"VARIABLE", "METAVAR", "STRING", "NUMBER", "WS", "BLOCK_COMMENT", "LINE_COMMENT", 
		"XML_COMMENT", "CRSX_EMBED_END"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CrsxMetaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	public CrsxMetaParser() {}
	protected Lexer newLexer(CharStream stream)
	{

	return new CrsxMetaLexer(stream);
	}

	protected void initATN()
	{    _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}protected String _prefix() { return "Crsx_"; }
	protected void _enterZOM() { fireEnterZOM(_parseListeners, _ctx); }
	protected void _exitZOM()  { fireExitZOM(_parseListeners, _ctx); }
	protected void _enterOOM() { _enterZOM(); }
	protected void _exitOOM()  { _exitZOM(); }
	protected void _enterOPT() { fireEnterOPT(_parseListeners, _ctx); }
	protected void _exitOPT()  { fireExitOPT(_parseListeners, _ctx); }
	protected void _enterAlt(String name) { fireEnterAlt(_parseListeners, _ctx, name); }
	protected void _enterAlt() { fireEnterAlt(_parseListeners, _ctx); }
	protected void _exitAlt()  { fireExitAlt(_parseListeners, _ctx); }
	protected void _hide()     { fireHide(_parseListeners, _ctx); }
	protected void _embed()    { fireEmbed(_parseListeners, _ctx); }
	protected void _tail()     { fireTail(_parseListeners, _ctx); }
	protected void _term()     { fireTerm(_parseListeners, _ctx); }
	protected String _metachar() { return "##";}

	public CrsxMetaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CrsxContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode MT_crsx() { return getToken(CrsxMetaParser.MT_crsx, 0); }
		public TerminalNode ET_crsx() { return getToken(CrsxMetaParser.ET_crsx, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public CrsxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crsx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterCrsx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitCrsx(this);
		}
	}

	public final CrsxContext crsx() throws RecognitionException {
		CrsxContext _localctx = new CrsxContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_crsx);
		try {
			setState(517);
			switch (_input.LA(1)) {
			case MT_declarations:
			case ET_declarations:
			case MT_declaration:
			case ET_declaration:
			case MT_moduleDeclaration:
			case ET_moduleDeclaration:
			case MT_module_TOK:
			case ET_module_TOK:
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_lbrace_TOK:
			case ET_lbrace_TOK:
			case MT_importDeclaration:
			case ET_importDeclaration:
			case MT_import_TOK:
			case ET_import_TOK:
			case MT_ruleDeclaration:
			case ET_ruleDeclaration:
			case MT_option_OPT:
			case ET_option_OPT:
			case MT_option:
			case ET_option:
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_pattern:
			case ET_pattern:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
			case MT_at_TOK:
			case ET_at_TOK:
			case MT_lpar_TOK:
			case ET_lpar_TOK:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
			case MT_linear_TOK:
			case ET_linear_TOK:
			case MT_literal:
			case ET_literal:
			case MT_string_TOK:
			case ET_string_TOK:
			case MT_number_TOK:
			case ET_number_TOK:
			case MT_concrete:
			case ET_concrete:
			case MT_category_TOK:
			case ET_category_TOK:
			case MT_properties:
			case ET_properties:
			case MT_sortDeclaration:
			case ET_sortDeclaration:
			case MT_sortparams_OPT:
			case ET_sortparams_OPT:
			case MT_sortparams:
			case ET_sortparams:
			case MT_forall_TOK:
			case ET_forall_TOK:
			case MT_sortset:
			case ET_sortset:
			case MT_sortname:
			case ET_sortname:
			case MT_form:
			case ET_form:
			case MT_constructor:
			case ET_constructor:
			case MT_qualifier:
			case ET_qualifier:
			case MT_reserved:
			case ET_reserved:
			case MT_directive:
			case ET_directive:
			case MT_directiveList:
			case ET_directiveList:
			case MODULE:
			case IMPORT:
			case COLON:
			case FORALL:
			case LPAR:
			case LBRACE:
			case LINEAR:
			case AT:
			case CATEGORY:
			case CONSTRUCTOR:
			case VARIABLE:
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(509);
				declarations();
				_exitAlt();
				}
				break;
			case MT_crsx:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(513);
				match(MT_crsx);
				}
				break;
			case ET_crsx:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(515);
				match(ET_crsx);
				setState(516);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Crsx_EOFContext extends ParserRuleContext {
		public CrsxContext crsx() {
			return getRuleContext(CrsxContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Crsx_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crsx_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterCrsx_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitCrsx_EOF(this);
		}
	}

	public final Crsx_EOFContext crsx_EOF() throws RecognitionException {
		Crsx_EOFContext _localctx = new Crsx_EOFContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_crsx_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			crsx();
			setState(520);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Declarations_S1_ZOMContext declarations_S1_ZOM() {
			return getRuleContext(Declarations_S1_ZOMContext.class,0);
		}
		public TerminalNode MT_declarations() { return getToken(CrsxMetaParser.MT_declarations, 0); }
		public TerminalNode ET_declarations() { return getToken(CrsxMetaParser.ET_declarations, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarations);
		try {
			setState(532);
			switch (_input.LA(1)) {
			case MT_declaration:
			case ET_declaration:
			case MT_moduleDeclaration:
			case ET_moduleDeclaration:
			case MT_module_TOK:
			case ET_module_TOK:
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_lbrace_TOK:
			case ET_lbrace_TOK:
			case MT_importDeclaration:
			case ET_importDeclaration:
			case MT_import_TOK:
			case ET_import_TOK:
			case MT_ruleDeclaration:
			case ET_ruleDeclaration:
			case MT_option_OPT:
			case ET_option_OPT:
			case MT_option:
			case ET_option:
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_pattern:
			case ET_pattern:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
			case MT_at_TOK:
			case ET_at_TOK:
			case MT_lpar_TOK:
			case ET_lpar_TOK:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
			case MT_linear_TOK:
			case ET_linear_TOK:
			case MT_literal:
			case ET_literal:
			case MT_string_TOK:
			case ET_string_TOK:
			case MT_number_TOK:
			case ET_number_TOK:
			case MT_concrete:
			case ET_concrete:
			case MT_category_TOK:
			case ET_category_TOK:
			case MT_properties:
			case ET_properties:
			case MT_sortDeclaration:
			case ET_sortDeclaration:
			case MT_sortparams_OPT:
			case ET_sortparams_OPT:
			case MT_sortparams:
			case ET_sortparams:
			case MT_forall_TOK:
			case ET_forall_TOK:
			case MT_sortset:
			case ET_sortset:
			case MT_sortname:
			case ET_sortname:
			case MT_form:
			case ET_form:
			case MT_constructor:
			case ET_constructor:
			case MT_qualifier:
			case ET_qualifier:
			case MT_reserved:
			case ET_reserved:
			case MT_directive:
			case ET_directive:
			case MT_directiveList:
			case ET_directiveList:
			case MODULE:
			case IMPORT:
			case COLON:
			case FORALL:
			case LPAR:
			case LBRACE:
			case LINEAR:
			case AT:
			case CATEGORY:
			case CONSTRUCTOR:
			case VARIABLE:
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(523);
				declaration();
				setState(524);
				declarations_S1_ZOM();
				_exitAlt();
				}
				break;
			case MT_declarations:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(528);
				match(MT_declarations);
				}
				break;
			case ET_declarations:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(530);
				match(ET_declarations);
				setState(531);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declarations_EOFContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Declarations_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDeclarations_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDeclarations_EOF(this);
		}
	}

	public final Declarations_EOFContext declarations_EOF() throws RecognitionException {
		Declarations_EOFContext _localctx = new Declarations_EOFContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarations_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			declarations();
			setState(535);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declarations_S1_ZOMContext extends ParserRuleContext {
		public List<Declarations_S1Context> declarations_S1() {
			return getRuleContexts(Declarations_S1Context.class);
		}
		public Declarations_S1Context declarations_S1(int i) {
			return getRuleContext(Declarations_S1Context.class,i);
		}
		public TerminalNode MT_declarations_S1_ZOM() { return getToken(CrsxMetaParser.MT_declarations_S1_ZOM, 0); }
		public TerminalNode ET_declarations_S1_ZOM() { return getToken(CrsxMetaParser.ET_declarations_S1_ZOM, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Declarations_S1_ZOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations_S1_ZOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDeclarations_S1_ZOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDeclarations_S1_ZOM(this);
		}
	}

	public final Declarations_S1_ZOMContext declarations_S1_ZOM() throws RecognitionException {
		Declarations_S1_ZOMContext _localctx = new Declarations_S1_ZOMContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarations_S1_ZOM);
		int _la;
		try {
			setState(562);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterZOM();
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_declarations_S1) | (1L << ET_declarations_S1) | (1L << MT_semi_TOK) | (1L << ET_semi_TOK))) != 0) || _la==SEMI) {
					{
					{
					setState(539);
					declarations_S1();
					}
					}
					setState(544);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(553);
				_la = _input.LA(1);
				if (_la==MT_declarations_S1_ZOM || _la==ET_declarations_S1_ZOM) {
					{
					_tail();
					setState(551);
					switch (_input.LA(1)) {
					case MT_declarations_S1_ZOM:
						{
						_term();
						setState(547);
						match(MT_declarations_S1_ZOM);
						}
						break;
					case ET_declarations_S1_ZOM:
						{
						_embed();
						setState(549);
						match(ET_declarations_S1_ZOM);
						setState(550);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitZOM();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(558);
				match(MT_declarations_S1_ZOM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(560);
				match(ET_declarations_S1_ZOM);
				setState(561);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declarations_S1_ZOM_EOFContext extends ParserRuleContext {
		public Declarations_S1_ZOMContext declarations_S1_ZOM() {
			return getRuleContext(Declarations_S1_ZOMContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Declarations_S1_ZOM_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations_S1_ZOM_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDeclarations_S1_ZOM_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDeclarations_S1_ZOM_EOF(this);
		}
	}

	public final Declarations_S1_ZOM_EOFContext declarations_S1_ZOM_EOF() throws RecognitionException {
		Declarations_S1_ZOM_EOFContext _localctx = new Declarations_S1_ZOM_EOFContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declarations_S1_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			declarations_S1_ZOM();
			setState(565);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declarations_S1Context extends ParserRuleContext {
		public Semi_TOKContext semi_TOK() {
			return getRuleContext(Semi_TOKContext.class,0);
		}
		public Declaration_OPTContext declaration_OPT() {
			return getRuleContext(Declaration_OPTContext.class,0);
		}
		public TerminalNode MT_declarations_S1() { return getToken(CrsxMetaParser.MT_declarations_S1, 0); }
		public TerminalNode ET_declarations_S1() { return getToken(CrsxMetaParser.ET_declarations_S1, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Declarations_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDeclarations_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDeclarations_S1(this);
		}
	}

	public final Declarations_S1Context declarations_S1() throws RecognitionException {
		Declarations_S1Context _localctx = new Declarations_S1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_declarations_S1);
		try {
			setState(577);
			switch (_input.LA(1)) {
			case MT_semi_TOK:
			case ET_semi_TOK:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(568);
				semi_TOK();
				setState(569);
				declaration_OPT();
				_exitAlt();
				}
				break;
			case MT_declarations_S1:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(573);
				match(MT_declarations_S1);
				}
				break;
			case ET_declarations_S1:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(575);
				match(ET_declarations_S1);
				setState(576);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declarations_S1_EOFContext extends ParserRuleContext {
		public Declarations_S1Context declarations_S1() {
			return getRuleContext(Declarations_S1Context.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Declarations_S1_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations_S1_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDeclarations_S1_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDeclarations_S1_EOF(this);
		}
	}

	public final Declarations_S1_EOFContext declarations_S1_EOF() throws RecognitionException {
		Declarations_S1_EOFContext _localctx = new Declarations_S1_EOFContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declarations_S1_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			declarations_S1();
			setState(580);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Semi_TOKContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(CrsxMetaParser.SEMI, 0); }
		public TerminalNode MT_semi_TOK() { return getToken(CrsxMetaParser.MT_semi_TOK, 0); }
		public TerminalNode ET_semi_TOK() { return getToken(CrsxMetaParser.ET_semi_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Semi_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semi_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSemi_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSemi_TOK(this);
		}
	}

	public final Semi_TOKContext semi_TOK() throws RecognitionException {
		Semi_TOKContext _localctx = new Semi_TOKContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_semi_TOK);
		try {
			setState(590);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				match(SEMI);

				}
				break;
			case MT_semi_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(586);
				match(MT_semi_TOK);
				}
				break;
			case ET_semi_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(588);
				match(ET_semi_TOK);
				setState(589);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Semi_TOK_EOFContext extends ParserRuleContext {
		public Semi_TOKContext semi_TOK() {
			return getRuleContext(Semi_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Semi_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semi_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSemi_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSemi_TOK_EOF(this);
		}
	}

	public final Semi_TOK_EOFContext semi_TOK_EOF() throws RecognitionException {
		Semi_TOK_EOFContext _localctx = new Semi_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_semi_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			semi_TOK();
			setState(593);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_OPTContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode MT_declaration_OPT() { return getToken(CrsxMetaParser.MT_declaration_OPT, 0); }
		public TerminalNode ET_declaration_OPT() { return getToken(CrsxMetaParser.ET_declaration_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Declaration_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDeclaration_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDeclaration_OPT(this);
		}
	}

	public final Declaration_OPTContext declaration_OPT() throws RecognitionException {
		Declaration_OPTContext _localctx = new Declaration_OPTContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration_OPT);
		int _la;
		try {
			setState(617);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(598);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_declaration) | (1L << ET_declaration) | (1L << MT_moduleDeclaration) | (1L << ET_moduleDeclaration) | (1L << MT_module_TOK) | (1L << ET_module_TOK) | (1L << MT_constructor_TOK) | (1L << ET_constructor_TOK) | (1L << MT_lbrace_TOK) | (1L << ET_lbrace_TOK) | (1L << MT_importDeclaration) | (1L << ET_importDeclaration) | (1L << MT_import_TOK) | (1L << ET_import_TOK) | (1L << MT_ruleDeclaration) | (1L << ET_ruleDeclaration) | (1L << MT_option_OPT) | (1L << ET_option_OPT) | (1L << MT_option) | (1L << ET_option) | (1L << MT_colon_TOK) | (1L << ET_colon_TOK) | (1L << MT_pattern) | (1L << ET_pattern) | (1L << MT_properties_OPT) | (1L << ET_properties_OPT) | (1L << MT_annotations) | (1L << ET_annotations) | (1L << MT_annotation_OOM) | (1L << ET_annotation_OOM) | (1L << MT_annotation) | (1L << ET_annotation) | (1L << MT_at_TOK) | (1L << ET_at_TOK))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (MT_lpar_TOK - 101)) | (1L << (ET_lpar_TOK - 101)) | (1L << (MT_variable - 101)) | (1L << (ET_variable - 101)) | (1L << (MT_linear_OPT - 101)) | (1L << (ET_linear_OPT - 101)) | (1L << (MT_variable_TOK - 101)) | (1L << (ET_variable_TOK - 101)) | (1L << (MT_linear - 101)) | (1L << (ET_linear - 101)) | (1L << (MT_linear_TOK - 101)) | (1L << (ET_linear_TOK - 101)) | (1L << (MT_literal - 101)) | (1L << (ET_literal - 101)) | (1L << (MT_string_TOK - 101)) | (1L << (ET_string_TOK - 101)) | (1L << (MT_number_TOK - 101)) | (1L << (ET_number_TOK - 101)) | (1L << (MT_concrete - 101)) | (1L << (ET_concrete - 101)) | (1L << (MT_category_TOK - 101)) | (1L << (ET_category_TOK - 101)))) != 0) || ((((_la - 177)) & ~0x3f) == 0 && ((1L << (_la - 177)) & ((1L << (MT_properties - 177)) | (1L << (ET_properties - 177)) | (1L << (MT_sortDeclaration - 177)) | (1L << (ET_sortDeclaration - 177)) | (1L << (MT_sortparams_OPT - 177)) | (1L << (ET_sortparams_OPT - 177)) | (1L << (MT_sortparams - 177)) | (1L << (ET_sortparams - 177)) | (1L << (MT_forall_TOK - 177)) | (1L << (ET_forall_TOK - 177)) | (1L << (MT_sortset - 177)) | (1L << (ET_sortset - 177)) | (1L << (MT_sortname - 177)) | (1L << (ET_sortname - 177)) | (1L << (MT_form - 177)) | (1L << (ET_form - 177)) | (1L << (MT_constructor - 177)) | (1L << (ET_constructor - 177)) | (1L << (MT_qualifier - 177)) | (1L << (ET_qualifier - 177)) | (1L << (MT_reserved - 177)) | (1L << (ET_reserved - 177)) | (1L << (MT_directive - 177)) | (1L << (ET_directive - 177)))) != 0) || ((((_la - 251)) & ~0x3f) == 0 && ((1L << (_la - 251)) & ((1L << (MT_directiveList - 251)) | (1L << (ET_directiveList - 251)) | (1L << (MODULE - 251)) | (1L << (IMPORT - 251)) | (1L << (COLON - 251)) | (1L << (FORALL - 251)) | (1L << (LPAR - 251)) | (1L << (LBRACE - 251)) | (1L << (LINEAR - 251)) | (1L << (AT - 251)) | (1L << (CATEGORY - 251)) | (1L << (CONSTRUCTOR - 251)) | (1L << (VARIABLE - 251)) | (1L << (STRING - 251)) | (1L << (NUMBER - 251)))) != 0)) {
					{
					setState(597);
					declaration();
					}
				}

				setState(608);
				_la = _input.LA(1);
				if (_la==MT_declaration_OPT || _la==ET_declaration_OPT) {
					{
					_tail();
					setState(606);
					switch (_input.LA(1)) {
					case MT_declaration_OPT:
						{
						_term();
						setState(602);
						match(MT_declaration_OPT);
						}
						break;
					case ET_declaration_OPT:
						{
						_embed();
						setState(604);
						match(ET_declaration_OPT);
						setState(605);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitOPT();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(613);
				match(MT_declaration_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(615);
				match(ET_declaration_OPT);
				setState(616);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_OPT_EOFContext extends ParserRuleContext {
		public Declaration_OPTContext declaration_OPT() {
			return getRuleContext(Declaration_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Declaration_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDeclaration_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDeclaration_OPT_EOF(this);
		}
	}

	public final Declaration_OPT_EOFContext declaration_OPT_EOF() throws RecognitionException {
		Declaration_OPT_EOFContext _localctx = new Declaration_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaration_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			declaration_OPT();
			setState(620);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public ModuleDeclarationContext moduleDeclaration() {
			return getRuleContext(ModuleDeclarationContext.class,0);
		}
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public RuleDeclarationContext ruleDeclaration() {
			return getRuleContext(RuleDeclarationContext.class,0);
		}
		public SortDeclarationContext sortDeclaration() {
			return getRuleContext(SortDeclarationContext.class,0);
		}
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public TerminalNode MT_declaration() { return getToken(CrsxMetaParser.MT_declaration, 0); }
		public TerminalNode ET_declaration() { return getToken(CrsxMetaParser.ET_declaration, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaration);
		try {
			setState(647);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(623);
				moduleDeclaration();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(627);
				importDeclaration();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(631);
				ruleDeclaration();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(635);
				sortDeclaration();
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				setState(639);
				directive();
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_term();
				setState(643);
				match(MT_declaration);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				_embed();
				setState(645);
				match(ET_declaration);
				setState(646);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_EOFContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Declaration_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDeclaration_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDeclaration_EOF(this);
		}
	}

	public final Declaration_EOFContext declaration_EOF() throws RecognitionException {
		Declaration_EOFContext _localctx = new Declaration_EOFContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaration_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			declaration();
			setState(650);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleDeclarationContext extends ParserRuleContext {
		public Module_TOKContext module_TOK() {
			return getRuleContext(Module_TOKContext.class,0);
		}
		public Constructor_TOKContext constructor_TOK() {
			return getRuleContext(Constructor_TOKContext.class,0);
		}
		public Lbrace_TOKContext lbrace_TOK() {
			return getRuleContext(Lbrace_TOKContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Rbrace_TOKContext rbrace_TOK() {
			return getRuleContext(Rbrace_TOKContext.class,0);
		}
		public TerminalNode MT_moduleDeclaration() { return getToken(CrsxMetaParser.MT_moduleDeclaration, 0); }
		public TerminalNode ET_moduleDeclaration() { return getToken(CrsxMetaParser.ET_moduleDeclaration, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public ModuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterModuleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitModuleDeclaration(this);
		}
	}

	public final ModuleDeclarationContext moduleDeclaration() throws RecognitionException {
		ModuleDeclarationContext _localctx = new ModuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_moduleDeclaration);
		try {
			setState(665);
			switch (_input.LA(1)) {
			case MT_module_TOK:
			case ET_module_TOK:
			case MODULE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(653);
				module_TOK();
				setState(654);
				constructor_TOK();
				setState(655);
				lbrace_TOK();
				setState(656);
				declarations();
				setState(657);
				rbrace_TOK();
				_exitAlt();
				}
				break;
			case MT_moduleDeclaration:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(661);
				match(MT_moduleDeclaration);
				}
				break;
			case ET_moduleDeclaration:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(663);
				match(ET_moduleDeclaration);
				setState(664);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleDeclaration_EOFContext extends ParserRuleContext {
		public ModuleDeclarationContext moduleDeclaration() {
			return getRuleContext(ModuleDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public ModuleDeclaration_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDeclaration_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterModuleDeclaration_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitModuleDeclaration_EOF(this);
		}
	}

	public final ModuleDeclaration_EOFContext moduleDeclaration_EOF() throws RecognitionException {
		ModuleDeclaration_EOFContext _localctx = new ModuleDeclaration_EOFContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_moduleDeclaration_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			moduleDeclaration();
			setState(668);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_TOKContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(CrsxMetaParser.MODULE, 0); }
		public TerminalNode MT_module_TOK() { return getToken(CrsxMetaParser.MT_module_TOK, 0); }
		public TerminalNode ET_module_TOK() { return getToken(CrsxMetaParser.ET_module_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Module_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterModule_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitModule_TOK(this);
		}
	}

	public final Module_TOKContext module_TOK() throws RecognitionException {
		Module_TOKContext _localctx = new Module_TOKContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_module_TOK);
		try {
			setState(678);
			switch (_input.LA(1)) {
			case MODULE:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				match(MODULE);

				}
				break;
			case MT_module_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(674);
				match(MT_module_TOK);
				}
				break;
			case ET_module_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(676);
				match(ET_module_TOK);
				setState(677);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_TOK_EOFContext extends ParserRuleContext {
		public Module_TOKContext module_TOK() {
			return getRuleContext(Module_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Module_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterModule_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitModule_TOK_EOF(this);
		}
	}

	public final Module_TOK_EOFContext module_TOK_EOF() throws RecognitionException {
		Module_TOK_EOFContext _localctx = new Module_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_module_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			module_TOK();
			setState(681);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_TOKContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(CrsxMetaParser.CONSTRUCTOR, 0); }
		public TerminalNode MT_constructor_TOK() { return getToken(CrsxMetaParser.MT_constructor_TOK, 0); }
		public TerminalNode ET_constructor_TOK() { return getToken(CrsxMetaParser.ET_constructor_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Constructor_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterConstructor_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitConstructor_TOK(this);
		}
	}

	public final Constructor_TOKContext constructor_TOK() throws RecognitionException {
		Constructor_TOKContext _localctx = new Constructor_TOKContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constructor_TOK);
		try {
			setState(691);
			switch (_input.LA(1)) {
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(684);
				match(CONSTRUCTOR);

				}
				break;
			case MT_constructor_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(687);
				match(MT_constructor_TOK);
				}
				break;
			case ET_constructor_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(689);
				match(ET_constructor_TOK);
				setState(690);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_TOK_EOFContext extends ParserRuleContext {
		public Constructor_TOKContext constructor_TOK() {
			return getRuleContext(Constructor_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Constructor_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterConstructor_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitConstructor_TOK_EOF(this);
		}
	}

	public final Constructor_TOK_EOFContext constructor_TOK_EOF() throws RecognitionException {
		Constructor_TOK_EOFContext _localctx = new Constructor_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constructor_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			constructor_TOK();
			setState(694);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lbrace_TOKContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CrsxMetaParser.LBRACE, 0); }
		public TerminalNode MT_lbrace_TOK() { return getToken(CrsxMetaParser.MT_lbrace_TOK, 0); }
		public TerminalNode ET_lbrace_TOK() { return getToken(CrsxMetaParser.ET_lbrace_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Lbrace_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lbrace_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterLbrace_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitLbrace_TOK(this);
		}
	}

	public final Lbrace_TOKContext lbrace_TOK() throws RecognitionException {
		Lbrace_TOKContext _localctx = new Lbrace_TOKContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_lbrace_TOK);
		try {
			setState(704);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(697);
				match(LBRACE);

				}
				break;
			case MT_lbrace_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(700);
				match(MT_lbrace_TOK);
				}
				break;
			case ET_lbrace_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(702);
				match(ET_lbrace_TOK);
				setState(703);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lbrace_TOK_EOFContext extends ParserRuleContext {
		public Lbrace_TOKContext lbrace_TOK() {
			return getRuleContext(Lbrace_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Lbrace_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lbrace_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterLbrace_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitLbrace_TOK_EOF(this);
		}
	}

	public final Lbrace_TOK_EOFContext lbrace_TOK_EOF() throws RecognitionException {
		Lbrace_TOK_EOFContext _localctx = new Lbrace_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lbrace_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			lbrace_TOK();
			setState(707);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rbrace_TOKContext extends ParserRuleContext {
		public TerminalNode RBRACE() { return getToken(CrsxMetaParser.RBRACE, 0); }
		public TerminalNode MT_rbrace_TOK() { return getToken(CrsxMetaParser.MT_rbrace_TOK, 0); }
		public TerminalNode ET_rbrace_TOK() { return getToken(CrsxMetaParser.ET_rbrace_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Rbrace_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rbrace_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterRbrace_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitRbrace_TOK(this);
		}
	}

	public final Rbrace_TOKContext rbrace_TOK() throws RecognitionException {
		Rbrace_TOKContext _localctx = new Rbrace_TOKContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_rbrace_TOK);
		try {
			setState(717);
			switch (_input.LA(1)) {
			case RBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				match(RBRACE);

				}
				break;
			case MT_rbrace_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(713);
				match(MT_rbrace_TOK);
				}
				break;
			case ET_rbrace_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(715);
				match(ET_rbrace_TOK);
				setState(716);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rbrace_TOK_EOFContext extends ParserRuleContext {
		public Rbrace_TOKContext rbrace_TOK() {
			return getRuleContext(Rbrace_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Rbrace_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rbrace_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterRbrace_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitRbrace_TOK_EOF(this);
		}
	}

	public final Rbrace_TOK_EOFContext rbrace_TOK_EOF() throws RecognitionException {
		Rbrace_TOK_EOFContext _localctx = new Rbrace_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_rbrace_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			rbrace_TOK();
			setState(720);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public Import_TOKContext import_TOK() {
			return getRuleContext(Import_TOKContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public Module_TOKContext module_TOK() {
			return getRuleContext(Module_TOKContext.class,0);
		}
		public Grammar_TOKContext grammar_TOK() {
			return getRuleContext(Grammar_TOKContext.class,0);
		}
		public TerminalNode MT_importDeclaration() { return getToken(CrsxMetaParser.MT_importDeclaration, 0); }
		public TerminalNode ET_importDeclaration() { return getToken(CrsxMetaParser.ET_importDeclaration, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_importDeclaration);
		try {
			setState(744);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(723);
				import_TOK();
				setState(724);
				constructor();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(728);
				import_TOK();
				setState(729);
				module_TOK();
				setState(730);
				constructor();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(734);
				import_TOK();
				setState(735);
				grammar_TOK();
				setState(736);
				constructor();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_term();
				setState(740);
				match(MT_importDeclaration);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_embed();
				setState(742);
				match(ET_importDeclaration);
				setState(743);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclaration_EOFContext extends ParserRuleContext {
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public ImportDeclaration_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterImportDeclaration_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitImportDeclaration_EOF(this);
		}
	}

	public final ImportDeclaration_EOFContext importDeclaration_EOF() throws RecognitionException {
		ImportDeclaration_EOFContext _localctx = new ImportDeclaration_EOFContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_importDeclaration_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			importDeclaration();
			setState(747);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_TOKContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(CrsxMetaParser.IMPORT, 0); }
		public TerminalNode MT_import_TOK() { return getToken(CrsxMetaParser.MT_import_TOK, 0); }
		public TerminalNode ET_import_TOK() { return getToken(CrsxMetaParser.ET_import_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Import_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterImport_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitImport_TOK(this);
		}
	}

	public final Import_TOKContext import_TOK() throws RecognitionException {
		Import_TOKContext _localctx = new Import_TOKContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_import_TOK);
		try {
			setState(757);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(750);
				match(IMPORT);

				}
				break;
			case MT_import_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(753);
				match(MT_import_TOK);
				}
				break;
			case ET_import_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(755);
				match(ET_import_TOK);
				setState(756);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_TOK_EOFContext extends ParserRuleContext {
		public Import_TOKContext import_TOK() {
			return getRuleContext(Import_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Import_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterImport_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitImport_TOK_EOF(this);
		}
	}

	public final Import_TOK_EOFContext import_TOK_EOF() throws RecognitionException {
		Import_TOK_EOFContext _localctx = new Import_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_import_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			import_TOK();
			setState(760);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grammar_TOKContext extends ParserRuleContext {
		public TerminalNode GRAMMAR() { return getToken(CrsxMetaParser.GRAMMAR, 0); }
		public TerminalNode MT_grammar_TOK() { return getToken(CrsxMetaParser.MT_grammar_TOK, 0); }
		public TerminalNode ET_grammar_TOK() { return getToken(CrsxMetaParser.ET_grammar_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Grammar_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammar_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterGrammar_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitGrammar_TOK(this);
		}
	}

	public final Grammar_TOKContext grammar_TOK() throws RecognitionException {
		Grammar_TOKContext _localctx = new Grammar_TOKContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_grammar_TOK);
		try {
			setState(770);
			switch (_input.LA(1)) {
			case GRAMMAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				match(GRAMMAR);

				}
				break;
			case MT_grammar_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(766);
				match(MT_grammar_TOK);
				}
				break;
			case ET_grammar_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(768);
				match(ET_grammar_TOK);
				setState(769);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grammar_TOK_EOFContext extends ParserRuleContext {
		public Grammar_TOKContext grammar_TOK() {
			return getRuleContext(Grammar_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Grammar_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammar_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterGrammar_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitGrammar_TOK_EOF(this);
		}
	}

	public final Grammar_TOK_EOFContext grammar_TOK_EOF() throws RecognitionException {
		Grammar_TOK_EOFContext _localctx = new Grammar_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_grammar_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			grammar_TOK();
			setState(773);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleDeclarationContext extends ParserRuleContext {
		public Option_OPTContext option_OPT() {
			return getRuleContext(Option_OPTContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Arrow_TOKContext arrow_TOK() {
			return getRuleContext(Arrow_TOKContext.class,0);
		}
		public ContractumContext contractum() {
			return getRuleContext(ContractumContext.class,0);
		}
		public TerminalNode MT_ruleDeclaration() { return getToken(CrsxMetaParser.MT_ruleDeclaration, 0); }
		public TerminalNode ET_ruleDeclaration() { return getToken(CrsxMetaParser.ET_ruleDeclaration, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public RuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterRuleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitRuleDeclaration(this);
		}
	}

	public final RuleDeclarationContext ruleDeclaration() throws RecognitionException {
		RuleDeclarationContext _localctx = new RuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ruleDeclaration);
		try {
			setState(787);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_lbrace_TOK:
			case ET_lbrace_TOK:
			case MT_option_OPT:
			case ET_option_OPT:
			case MT_option:
			case ET_option:
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_pattern:
			case ET_pattern:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
			case MT_at_TOK:
			case ET_at_TOK:
			case MT_properties:
			case ET_properties:
			case MT_constructor:
			case ET_constructor:
			case MT_qualifier:
			case ET_qualifier:
			case MT_reserved:
			case ET_reserved:
			case COLON:
			case LBRACE:
			case AT:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(776);
				option_OPT();
				setState(777);
				pattern();
				setState(778);
				arrow_TOK();
				setState(779);
				contractum();
				_exitAlt();
				}
				break;
			case MT_ruleDeclaration:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(783);
				match(MT_ruleDeclaration);
				}
				break;
			case ET_ruleDeclaration:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(785);
				match(ET_ruleDeclaration);
				setState(786);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleDeclaration_EOFContext extends ParserRuleContext {
		public RuleDeclarationContext ruleDeclaration() {
			return getRuleContext(RuleDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public RuleDeclaration_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleDeclaration_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterRuleDeclaration_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitRuleDeclaration_EOF(this);
		}
	}

	public final RuleDeclaration_EOFContext ruleDeclaration_EOF() throws RecognitionException {
		RuleDeclaration_EOFContext _localctx = new RuleDeclaration_EOFContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ruleDeclaration_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			ruleDeclaration();
			setState(790);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Option_OPTContext extends ParserRuleContext {
		public OptionContext option() {
			return getRuleContext(OptionContext.class,0);
		}
		public TerminalNode MT_option_OPT() { return getToken(CrsxMetaParser.MT_option_OPT, 0); }
		public TerminalNode ET_option_OPT() { return getToken(CrsxMetaParser.ET_option_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Option_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterOption_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitOption_OPT(this);
		}
	}

	public final Option_OPTContext option_OPT() throws RecognitionException {
		Option_OPTContext _localctx = new Option_OPTContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_option_OPT);
		int _la;
		try {
			setState(814);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(795);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(794);
					option();
					}
					break;
				}
				setState(805);
				_la = _input.LA(1);
				if (_la==MT_option_OPT || _la==ET_option_OPT) {
					{
					_tail();
					setState(803);
					switch (_input.LA(1)) {
					case MT_option_OPT:
						{
						_term();
						setState(799);
						match(MT_option_OPT);
						}
						break;
					case ET_option_OPT:
						{
						_embed();
						setState(801);
						match(ET_option_OPT);
						setState(802);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitOPT();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(810);
				match(MT_option_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(812);
				match(ET_option_OPT);
				setState(813);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Option_OPT_EOFContext extends ParserRuleContext {
		public Option_OPTContext option_OPT() {
			return getRuleContext(Option_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Option_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterOption_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitOption_OPT_EOF(this);
		}
	}

	public final Option_OPT_EOFContext option_OPT_EOF() throws RecognitionException {
		Option_OPT_EOFContext _localctx = new Option_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_option_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			option_OPT();
			setState(817);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arrow_TOKContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(CrsxMetaParser.ARROW, 0); }
		public TerminalNode MT_arrow_TOK() { return getToken(CrsxMetaParser.MT_arrow_TOK, 0); }
		public TerminalNode ET_arrow_TOK() { return getToken(CrsxMetaParser.ET_arrow_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Arrow_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterArrow_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitArrow_TOK(this);
		}
	}

	public final Arrow_TOKContext arrow_TOK() throws RecognitionException {
		Arrow_TOKContext _localctx = new Arrow_TOKContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_arrow_TOK);
		try {
			setState(827);
			switch (_input.LA(1)) {
			case ARROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(820);
				match(ARROW);

				}
				break;
			case MT_arrow_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(823);
				match(MT_arrow_TOK);
				}
				break;
			case ET_arrow_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(825);
				match(ET_arrow_TOK);
				setState(826);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arrow_TOK_EOFContext extends ParserRuleContext {
		public Arrow_TOKContext arrow_TOK() {
			return getRuleContext(Arrow_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Arrow_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterArrow_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitArrow_TOK_EOF(this);
		}
	}

	public final Arrow_TOK_EOFContext arrow_TOK_EOF() throws RecognitionException {
		Arrow_TOK_EOFContext _localctx = new Arrow_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_arrow_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			arrow_TOK();
			setState(830);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionContext extends ParserRuleContext {
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public Arguments_OPTContext arguments_OPT() {
			return getRuleContext(Arguments_OPTContext.class,0);
		}
		public Colon_TOKContext colon_TOK() {
			return getRuleContext(Colon_TOKContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TerminalNode MT_option() { return getToken(CrsxMetaParser.MT_option, 0); }
		public TerminalNode ET_option() { return getToken(CrsxMetaParser.ET_option, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitOption(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_option);
		try {
			setState(847);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(833);
				constructor();
				setState(834);
				arguments_OPT();
				setState(835);
				colon_TOK();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(839);
				annotations();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(843);
				match(MT_option);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(845);
				match(ET_option);
				setState(846);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Option_EOFContext extends ParserRuleContext {
		public OptionContext option() {
			return getRuleContext(OptionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Option_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterOption_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitOption_EOF(this);
		}
	}

	public final Option_EOFContext option_EOF() throws RecognitionException {
		Option_EOFContext _localctx = new Option_EOFContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_option_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			option();
			setState(850);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arguments_OPTContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode MT_arguments_OPT() { return getToken(CrsxMetaParser.MT_arguments_OPT, 0); }
		public TerminalNode ET_arguments_OPT() { return getToken(CrsxMetaParser.ET_arguments_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Arguments_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterArguments_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitArguments_OPT(this);
		}
	}

	public final Arguments_OPTContext arguments_OPT() throws RecognitionException {
		Arguments_OPTContext _localctx = new Arguments_OPTContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arguments_OPT);
		int _la;
		try {
			setState(874);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(855);
				_la = _input.LA(1);
				if (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (MT_arguments - 73)) | (1L << (ET_arguments - 73)) | (1L << (MT_lsquare_TOK - 73)) | (1L << (ET_lsquare_TOK - 73)))) != 0) || _la==LSQUARE) {
					{
					setState(854);
					arguments();
					}
				}

				setState(865);
				_la = _input.LA(1);
				if (_la==MT_arguments_OPT || _la==ET_arguments_OPT) {
					{
					_tail();
					setState(863);
					switch (_input.LA(1)) {
					case MT_arguments_OPT:
						{
						_term();
						setState(859);
						match(MT_arguments_OPT);
						}
						break;
					case ET_arguments_OPT:
						{
						_embed();
						setState(861);
						match(ET_arguments_OPT);
						setState(862);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitOPT();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(870);
				match(MT_arguments_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(872);
				match(ET_arguments_OPT);
				setState(873);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arguments_OPT_EOFContext extends ParserRuleContext {
		public Arguments_OPTContext arguments_OPT() {
			return getRuleContext(Arguments_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Arguments_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterArguments_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitArguments_OPT_EOF(this);
		}
	}

	public final Arguments_OPT_EOFContext arguments_OPT_EOF() throws RecognitionException {
		Arguments_OPT_EOFContext _localctx = new Arguments_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_arguments_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			arguments_OPT();
			setState(877);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Colon_TOKContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(CrsxMetaParser.COLON, 0); }
		public TerminalNode MT_colon_TOK() { return getToken(CrsxMetaParser.MT_colon_TOK, 0); }
		public TerminalNode ET_colon_TOK() { return getToken(CrsxMetaParser.ET_colon_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Colon_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colon_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterColon_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitColon_TOK(this);
		}
	}

	public final Colon_TOKContext colon_TOK() throws RecognitionException {
		Colon_TOKContext _localctx = new Colon_TOKContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_colon_TOK);
		try {
			setState(887);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(880);
				match(COLON);

				}
				break;
			case MT_colon_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(883);
				match(MT_colon_TOK);
				}
				break;
			case ET_colon_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(885);
				match(ET_colon_TOK);
				setState(886);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Colon_TOK_EOFContext extends ParserRuleContext {
		public Colon_TOKContext colon_TOK() {
			return getRuleContext(Colon_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Colon_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colon_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterColon_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitColon_TOK_EOF(this);
		}
	}

	public final Colon_TOK_EOFContext colon_TOK_EOF() throws RecognitionException {
		Colon_TOK_EOFContext _localctx = new Colon_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_colon_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			colon_TOK();
			setState(890);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternContext extends ParserRuleContext {
		public Properties_OPTContext properties_OPT() {
			return getRuleContext(Properties_OPTContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public Arguments_OPTContext arguments_OPT() {
			return getRuleContext(Arguments_OPTContext.class,0);
		}
		public TerminalNode MT_pattern() { return getToken(CrsxMetaParser.MT_pattern, 0); }
		public TerminalNode ET_pattern() { return getToken(CrsxMetaParser.ET_pattern, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitPattern(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_pattern);
		try {
			setState(903);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_lbrace_TOK:
			case ET_lbrace_TOK:
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_at_TOK:
			case ET_at_TOK:
			case MT_properties:
			case ET_properties:
			case MT_constructor:
			case ET_constructor:
			case MT_qualifier:
			case ET_qualifier:
			case MT_reserved:
			case ET_reserved:
			case COLON:
			case LBRACE:
			case AT:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(893);
				properties_OPT();
				setState(894);
				constructor();
				setState(895);
				arguments_OPT();
				_exitAlt();
				}
				break;
			case MT_pattern:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(899);
				match(MT_pattern);
				}
				break;
			case ET_pattern:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(901);
				match(ET_pattern);
				setState(902);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pattern_EOFContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Pattern_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterPattern_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitPattern_EOF(this);
		}
	}

	public final Pattern_EOFContext pattern_EOF() throws RecognitionException {
		Pattern_EOFContext _localctx = new Pattern_EOFContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_pattern_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			pattern();
			setState(906);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Properties_OPTContext extends ParserRuleContext {
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public TerminalNode MT_properties_OPT() { return getToken(CrsxMetaParser.MT_properties_OPT, 0); }
		public TerminalNode ET_properties_OPT() { return getToken(CrsxMetaParser.ET_properties_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Properties_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterProperties_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitProperties_OPT(this);
		}
	}

	public final Properties_OPTContext properties_OPT() throws RecognitionException {
		Properties_OPTContext _localctx = new Properties_OPTContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_properties_OPT);
		int _la;
		try {
			setState(930);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(911);
				_la = _input.LA(1);
				if (_la==MT_lbrace_TOK || _la==ET_lbrace_TOK || _la==MT_properties || _la==ET_properties || _la==LBRACE) {
					{
					setState(910);
					properties();
					}
				}

				setState(921);
				_la = _input.LA(1);
				if (_la==MT_properties_OPT || _la==ET_properties_OPT) {
					{
					_tail();
					setState(919);
					switch (_input.LA(1)) {
					case MT_properties_OPT:
						{
						_term();
						setState(915);
						match(MT_properties_OPT);
						}
						break;
					case ET_properties_OPT:
						{
						_embed();
						setState(917);
						match(ET_properties_OPT);
						setState(918);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitOPT();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(926);
				match(MT_properties_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(928);
				match(ET_properties_OPT);
				setState(929);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Properties_OPT_EOFContext extends ParserRuleContext {
		public Properties_OPTContext properties_OPT() {
			return getRuleContext(Properties_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Properties_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterProperties_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitProperties_OPT_EOF(this);
		}
	}

	public final Properties_OPT_EOFContext properties_OPT_EOF() throws RecognitionException {
		Properties_OPT_EOFContext _localctx = new Properties_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_properties_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			properties_OPT();
			setState(933);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContractumContext extends ParserRuleContext {
		public FreeTermContext freeTerm() {
			return getRuleContext(FreeTermContext.class,0);
		}
		public TerminalNode MT_contractum() { return getToken(CrsxMetaParser.MT_contractum, 0); }
		public TerminalNode ET_contractum() { return getToken(CrsxMetaParser.ET_contractum, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public ContractumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterContractum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitContractum(this);
		}
	}

	public final ContractumContext contractum() throws RecognitionException {
		ContractumContext _localctx = new ContractumContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_contractum);
		try {
			setState(944);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_lbrace_TOK:
			case ET_lbrace_TOK:
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
			case MT_at_TOK:
			case ET_at_TOK:
			case MT_freeTerm:
			case ET_freeTerm:
			case MT_annotations_OPT:
			case ET_annotations_OPT:
			case MT_metavar_TOK:
			case ET_metavar_TOK:
			case MT_list:
			case ET_list:
			case MT_lpar_TOK:
			case ET_lpar_TOK:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
			case MT_linear_TOK:
			case ET_linear_TOK:
			case MT_literal:
			case ET_literal:
			case MT_string_TOK:
			case ET_string_TOK:
			case MT_number_TOK:
			case ET_number_TOK:
			case MT_concrete:
			case ET_concrete:
			case MT_category_TOK:
			case ET_category_TOK:
			case MT_dispatch:
			case ET_dispatch:
			case MT_dispatch_TOK:
			case ET_dispatch_TOK:
			case MT_properties:
			case ET_properties:
			case MT_expression:
			case ET_expression:
			case MT_constructor:
			case ET_constructor:
			case MT_qualifier:
			case ET_qualifier:
			case MT_reserved:
			case ET_reserved:
			case DISPATCH:
			case COLON:
			case LPAR:
			case LBRACE:
			case LINEAR:
			case AT:
			case CATEGORY:
			case CONSTRUCTOR:
			case VARIABLE:
			case METAVAR:
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(936);
				freeTerm();
				_exitAlt();
				}
				break;
			case MT_contractum:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(940);
				match(MT_contractum);
				}
				break;
			case ET_contractum:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(942);
				match(ET_contractum);
				setState(943);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Contractum_EOFContext extends ParserRuleContext {
		public ContractumContext contractum() {
			return getRuleContext(ContractumContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Contractum_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractum_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterContractum_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitContractum_EOF(this);
		}
	}

	public final Contractum_EOFContext contractum_EOF() throws RecognitionException {
		Contractum_EOFContext _localctx = new Contractum_EOFContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_contractum_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			contractum();
			setState(947);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationsContext extends ParserRuleContext {
		public Annotation_OOMContext annotation_OOM() {
			return getRuleContext(Annotation_OOMContext.class,0);
		}
		public TerminalNode MT_annotations() { return getToken(CrsxMetaParser.MT_annotations, 0); }
		public TerminalNode ET_annotations() { return getToken(CrsxMetaParser.ET_annotations, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitAnnotations(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_annotations);
		try {
			setState(958);
			switch (_input.LA(1)) {
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
			case MT_at_TOK:
			case ET_at_TOK:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(950);
				annotation_OOM();
				_exitAlt();
				}
				break;
			case MT_annotations:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(954);
				match(MT_annotations);
				}
				break;
			case ET_annotations:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(956);
				match(ET_annotations);
				setState(957);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotations_EOFContext extends ParserRuleContext {
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Annotations_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterAnnotations_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitAnnotations_EOF(this);
		}
	}

	public final Annotations_EOFContext annotations_EOF() throws RecognitionException {
		Annotations_EOFContext _localctx = new Annotations_EOFContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_annotations_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			annotations();
			setState(961);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_OOMContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode MT_annotation_OOM() { return getToken(CrsxMetaParser.MT_annotation_OOM, 0); }
		public TerminalNode ET_annotation_OOM() { return getToken(CrsxMetaParser.ET_annotation_OOM, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Annotation_OOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_OOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterAnnotation_OOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitAnnotation_OOM(this);
		}
	}

	public final Annotation_OOMContext annotation_OOM() throws RecognitionException {
		Annotation_OOMContext _localctx = new Annotation_OOMContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_annotation_OOM);
		int _la;
		try {
			int _alt;
			setState(988);
			switch (_input.LA(1)) {
			case MT_annotation:
			case ET_annotation:
			case MT_at_TOK:
			case ET_at_TOK:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				_enterOOM();
				setState(966); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(965);
						annotation();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(968); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(978);
				_la = _input.LA(1);
				if (_la==MT_annotation_OOM || _la==ET_annotation_OOM) {
					{
					_tail();
					setState(976);
					switch (_input.LA(1)) {
					case MT_annotation_OOM:
						{
						_term();
						setState(972);
						match(MT_annotation_OOM);
						}
						break;
					case ET_annotation_OOM:
						{
						_embed();
						setState(974);
						match(ET_annotation_OOM);
						setState(975);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitOOM();

				}
				break;
			case MT_annotation_OOM:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(984);
				match(MT_annotation_OOM);
				}
				break;
			case ET_annotation_OOM:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(986);
				match(ET_annotation_OOM);
				setState(987);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_OOM_EOFContext extends ParserRuleContext {
		public Annotation_OOMContext annotation_OOM() {
			return getRuleContext(Annotation_OOMContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Annotation_OOM_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_OOM_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterAnnotation_OOM_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitAnnotation_OOM_EOF(this);
		}
	}

	public final Annotation_OOM_EOFContext annotation_OOM_EOF() throws RecognitionException {
		Annotation_OOM_EOFContext _localctx = new Annotation_OOM_EOFContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_annotation_OOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			annotation_OOM();
			setState(991);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public At_TOKContext at_TOK() {
			return getRuleContext(At_TOKContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public Arguments_OPTContext arguments_OPT() {
			return getRuleContext(Arguments_OPTContext.class,0);
		}
		public TerminalNode MT_annotation() { return getToken(CrsxMetaParser.MT_annotation, 0); }
		public TerminalNode ET_annotation() { return getToken(CrsxMetaParser.ET_annotation, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_annotation);
		try {
			setState(1004);
			switch (_input.LA(1)) {
			case MT_at_TOK:
			case ET_at_TOK:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(994);
				at_TOK();
				setState(995);
				constructor();
				setState(996);
				arguments_OPT();
				_exitAlt();
				}
				break;
			case MT_annotation:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1000);
				match(MT_annotation);
				}
				break;
			case ET_annotation:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1002);
				match(ET_annotation);
				setState(1003);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_EOFContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Annotation_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterAnnotation_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitAnnotation_EOF(this);
		}
	}

	public final Annotation_EOFContext annotation_EOF() throws RecognitionException {
		Annotation_EOFContext _localctx = new Annotation_EOFContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_annotation_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			annotation();
			setState(1007);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class At_TOKContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(CrsxMetaParser.AT, 0); }
		public TerminalNode MT_at_TOK() { return getToken(CrsxMetaParser.MT_at_TOK, 0); }
		public TerminalNode ET_at_TOK() { return getToken(CrsxMetaParser.ET_at_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public At_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_at_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterAt_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitAt_TOK(this);
		}
	}

	public final At_TOKContext at_TOK() throws RecognitionException {
		At_TOKContext _localctx = new At_TOKContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_at_TOK);
		try {
			setState(1017);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1010);
				match(AT);

				}
				break;
			case MT_at_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1013);
				match(MT_at_TOK);
				}
				break;
			case ET_at_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1015);
				match(ET_at_TOK);
				setState(1016);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class At_TOK_EOFContext extends ParserRuleContext {
		public At_TOKContext at_TOK() {
			return getRuleContext(At_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public At_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_at_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterAt_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitAt_TOK_EOF(this);
		}
	}

	public final At_TOK_EOFContext at_TOK_EOF() throws RecognitionException {
		At_TOK_EOFContext _localctx = new At_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_at_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			at_TOK();
			setState(1020);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public FreeTermContext freeTerm() {
			return getRuleContext(FreeTermContext.class,0);
		}
		public BoundTermContext boundTerm() {
			return getRuleContext(BoundTermContext.class,0);
		}
		public TerminalNode MT_term() { return getToken(CrsxMetaParser.MT_term, 0); }
		public TerminalNode ET_term() { return getToken(CrsxMetaParser.ET_term, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_term);
		try {
			setState(1035);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(1023);
				freeTerm();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(1027);
				boundTerm();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(1031);
				match(MT_term);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(1033);
				match(ET_term);
				setState(1034);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Term_EOFContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Term_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterTerm_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitTerm_EOF(this);
		}
	}

	public final Term_EOFContext term_EOF() throws RecognitionException {
		Term_EOFContext _localctx = new Term_EOFContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_term_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			term();
			setState(1038);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FreeTermContext extends ParserRuleContext {
		public Annotations_OPTContext annotations_OPT() {
			return getRuleContext(Annotations_OPTContext.class,0);
		}
		public Properties_OPTContext properties_OPT() {
			return getRuleContext(Properties_OPTContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public Arguments_OPTContext arguments_OPT() {
			return getRuleContext(Arguments_OPTContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public Metavar_TOKContext metavar_TOK() {
			return getRuleContext(Metavar_TOKContext.class,0);
		}
		public FreeArguments_OPTContext freeArguments_OPT() {
			return getRuleContext(FreeArguments_OPTContext.class,0);
		}
		public ConcreteContext concrete() {
			return getRuleContext(ConcreteContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MT_freeTerm() { return getToken(CrsxMetaParser.MT_freeTerm, 0); }
		public TerminalNode ET_freeTerm() { return getToken(CrsxMetaParser.ET_freeTerm, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public FreeTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freeTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterFreeTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitFreeTerm(this);
		}
	}

	public final FreeTermContext freeTerm() throws RecognitionException {
		FreeTermContext _localctx = new FreeTermContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_freeTerm);
		try {
			setState(1098);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(1041);
				annotations_OPT();
				setState(1042);
				properties_OPT();
				setState(1043);
				constructor();
				setState(1044);
				arguments_OPT();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(1048);
				annotations_OPT();
				setState(1049);
				properties_OPT();
				setState(1050);
				constructor();
				setState(1051);
				term();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(1055);
				annotations_OPT();
				setState(1056);
				properties_OPT();
				setState(1057);
				literal();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(1061);
				annotations_OPT();
				setState(1062);
				list();
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				setState(1066);
				annotations_OPT();
				setState(1067);
				variable();
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_enterAlt("6");
				setState(1071);
				annotations_OPT();
				setState(1072);
				properties();
				_exitAlt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				_enterAlt("7");
				setState(1076);
				annotations_OPT();
				setState(1077);
				properties_OPT();
				setState(1078);
				metavar_TOK();
				setState(1079);
				freeArguments_OPT();
				_exitAlt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				_enterAlt("8");
				setState(1083);
				annotations_OPT();
				setState(1084);
				concrete();
				_exitAlt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				_enterAlt("9");
				setState(1088);
				annotations_OPT();
				setState(1089);
				properties_OPT();
				setState(1090);
				expression();
				_exitAlt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				_term();
				setState(1094);
				match(MT_freeTerm);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				_embed();
				setState(1096);
				match(ET_freeTerm);
				setState(1097);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FreeTerm_EOFContext extends ParserRuleContext {
		public FreeTermContext freeTerm() {
			return getRuleContext(FreeTermContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public FreeTerm_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freeTerm_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterFreeTerm_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitFreeTerm_EOF(this);
		}
	}

	public final FreeTerm_EOFContext freeTerm_EOF() throws RecognitionException {
		FreeTerm_EOFContext _localctx = new FreeTerm_EOFContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_freeTerm_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			freeTerm();
			setState(1101);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotations_OPTContext extends ParserRuleContext {
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TerminalNode MT_annotations_OPT() { return getToken(CrsxMetaParser.MT_annotations_OPT, 0); }
		public TerminalNode ET_annotations_OPT() { return getToken(CrsxMetaParser.ET_annotations_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Annotations_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterAnnotations_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitAnnotations_OPT(this);
		}
	}

	public final Annotations_OPTContext annotations_OPT() throws RecognitionException {
		Annotations_OPTContext _localctx = new Annotations_OPTContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotations_OPT);
		int _la;
		try {
			setState(1125);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1106);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(1105);
					annotations();
					}
					break;
				}
				setState(1116);
				_la = _input.LA(1);
				if (_la==MT_annotations_OPT || _la==ET_annotations_OPT) {
					{
					_tail();
					setState(1114);
					switch (_input.LA(1)) {
					case MT_annotations_OPT:
						{
						_term();
						setState(1110);
						match(MT_annotations_OPT);
						}
						break;
					case ET_annotations_OPT:
						{
						_embed();
						setState(1112);
						match(ET_annotations_OPT);
						setState(1113);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitOPT();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1121);
				match(MT_annotations_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1123);
				match(ET_annotations_OPT);
				setState(1124);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotations_OPT_EOFContext extends ParserRuleContext {
		public Annotations_OPTContext annotations_OPT() {
			return getRuleContext(Annotations_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Annotations_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterAnnotations_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitAnnotations_OPT_EOF(this);
		}
	}

	public final Annotations_OPT_EOFContext annotations_OPT_EOF() throws RecognitionException {
		Annotations_OPT_EOFContext _localctx = new Annotations_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_annotations_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
			annotations_OPT();
			setState(1128);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Metavar_TOKContext extends ParserRuleContext {
		public TerminalNode METAVAR() { return getToken(CrsxMetaParser.METAVAR, 0); }
		public TerminalNode MT_metavar_TOK() { return getToken(CrsxMetaParser.MT_metavar_TOK, 0); }
		public TerminalNode ET_metavar_TOK() { return getToken(CrsxMetaParser.ET_metavar_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Metavar_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metavar_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterMetavar_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitMetavar_TOK(this);
		}
	}

	public final Metavar_TOKContext metavar_TOK() throws RecognitionException {
		Metavar_TOKContext _localctx = new Metavar_TOKContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_metavar_TOK);
		try {
			setState(1138);
			switch (_input.LA(1)) {
			case METAVAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1131);
				match(METAVAR);

				}
				break;
			case MT_metavar_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1134);
				match(MT_metavar_TOK);
				}
				break;
			case ET_metavar_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1136);
				match(ET_metavar_TOK);
				setState(1137);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Metavar_TOK_EOFContext extends ParserRuleContext {
		public Metavar_TOKContext metavar_TOK() {
			return getRuleContext(Metavar_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Metavar_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metavar_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterMetavar_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitMetavar_TOK_EOF(this);
		}
	}

	public final Metavar_TOK_EOFContext metavar_TOK_EOF() throws RecognitionException {
		Metavar_TOK_EOFContext _localctx = new Metavar_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_metavar_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1140);
			metavar_TOK();
			setState(1141);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FreeArguments_OPTContext extends ParserRuleContext {
		public FreeArgumentsContext freeArguments() {
			return getRuleContext(FreeArgumentsContext.class,0);
		}
		public TerminalNode MT_freeArguments_OPT() { return getToken(CrsxMetaParser.MT_freeArguments_OPT, 0); }
		public TerminalNode ET_freeArguments_OPT() { return getToken(CrsxMetaParser.ET_freeArguments_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public FreeArguments_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freeArguments_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterFreeArguments_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitFreeArguments_OPT(this);
		}
	}

	public final FreeArguments_OPTContext freeArguments_OPT() throws RecognitionException {
		FreeArguments_OPTContext _localctx = new FreeArguments_OPTContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_freeArguments_OPT);
		int _la;
		try {
			setState(1165);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1146);
				_la = _input.LA(1);
				if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (MT_lsquare_TOK - 75)) | (1L << (ET_lsquare_TOK - 75)) | (1L << (MT_freeArguments - 75)) | (1L << (ET_freeArguments - 75)))) != 0) || _la==LSQUARE) {
					{
					setState(1145);
					freeArguments();
					}
				}

				setState(1156);
				_la = _input.LA(1);
				if (_la==MT_freeArguments_OPT || _la==ET_freeArguments_OPT) {
					{
					_tail();
					setState(1154);
					switch (_input.LA(1)) {
					case MT_freeArguments_OPT:
						{
						_term();
						setState(1150);
						match(MT_freeArguments_OPT);
						}
						break;
					case ET_freeArguments_OPT:
						{
						_embed();
						setState(1152);
						match(ET_freeArguments_OPT);
						setState(1153);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitOPT();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1161);
				match(MT_freeArguments_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1163);
				match(ET_freeArguments_OPT);
				setState(1164);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FreeArguments_OPT_EOFContext extends ParserRuleContext {
		public FreeArguments_OPTContext freeArguments_OPT() {
			return getRuleContext(FreeArguments_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public FreeArguments_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freeArguments_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterFreeArguments_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitFreeArguments_OPT_EOF(this);
		}
	}

	public final FreeArguments_OPT_EOFContext freeArguments_OPT_EOF() throws RecognitionException {
		FreeArguments_OPT_EOFContext _localctx = new FreeArguments_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_freeArguments_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
			freeArguments_OPT();
			setState(1168);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoundTermContext extends ParserRuleContext {
		public BinderContext binder() {
			return getRuleContext(BinderContext.class,0);
		}
		public NextBinderContext nextBinder() {
			return getRuleContext(NextBinderContext.class,0);
		}
		public TerminalNode MT_boundTerm() { return getToken(CrsxMetaParser.MT_boundTerm, 0); }
		public TerminalNode ET_boundTerm() { return getToken(CrsxMetaParser.ET_boundTerm, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public BoundTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterBoundTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitBoundTerm(this);
		}
	}

	public final BoundTermContext boundTerm() throws RecognitionException {
		BoundTermContext _localctx = new BoundTermContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_boundTerm);
		try {
			setState(1180);
			switch (_input.LA(1)) {
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
			case MT_at_TOK:
			case ET_at_TOK:
			case MT_annotations_OPT:
			case ET_annotations_OPT:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
			case MT_linear_TOK:
			case ET_linear_TOK:
			case MT_binder:
			case ET_binder:
			case LINEAR:
			case AT:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1171);
				binder();
				setState(1172);
				nextBinder();
				_exitAlt();
				}
				break;
			case MT_boundTerm:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1176);
				match(MT_boundTerm);
				}
				break;
			case ET_boundTerm:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1178);
				match(ET_boundTerm);
				setState(1179);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoundTerm_EOFContext extends ParserRuleContext {
		public BoundTermContext boundTerm() {
			return getRuleContext(BoundTermContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public BoundTerm_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundTerm_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterBoundTerm_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitBoundTerm_EOF(this);
		}
	}

	public final BoundTerm_EOFContext boundTerm_EOF() throws RecognitionException {
		BoundTerm_EOFContext _localctx = new BoundTerm_EOFContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_boundTerm_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			boundTerm();
			setState(1183);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NextBinderContext extends ParserRuleContext {
		public BinderContext binder() {
			return getRuleContext(BinderContext.class,0);
		}
		public NextBinderContext nextBinder() {
			return getRuleContext(NextBinderContext.class,0);
		}
		public Dot_TOKContext dot_TOK() {
			return getRuleContext(Dot_TOKContext.class,0);
		}
		public FreeTermContext freeTerm() {
			return getRuleContext(FreeTermContext.class,0);
		}
		public TerminalNode MT_nextBinder() { return getToken(CrsxMetaParser.MT_nextBinder, 0); }
		public TerminalNode ET_nextBinder() { return getToken(CrsxMetaParser.ET_nextBinder, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public NextBinderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextBinder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterNextBinder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitNextBinder(this);
		}
	}

	public final NextBinderContext nextBinder() throws RecognitionException {
		NextBinderContext _localctx = new NextBinderContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_nextBinder);
		try {
			setState(1200);
			switch (_input.LA(1)) {
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
			case MT_at_TOK:
			case ET_at_TOK:
			case MT_annotations_OPT:
			case ET_annotations_OPT:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
			case MT_linear_TOK:
			case ET_linear_TOK:
			case MT_binder:
			case ET_binder:
			case LINEAR:
			case AT:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(1186);
				binder();
				setState(1187);
				nextBinder();
				_exitAlt();
				}
				break;
			case MT_dot_TOK:
			case ET_dot_TOK:
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(1191);
				dot_TOK();
				setState(1192);
				freeTerm();
				_exitAlt();
				}
				break;
			case MT_nextBinder:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(1196);
				match(MT_nextBinder);
				}
				break;
			case ET_nextBinder:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(1198);
				match(ET_nextBinder);
				setState(1199);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NextBinder_EOFContext extends ParserRuleContext {
		public NextBinderContext nextBinder() {
			return getRuleContext(NextBinderContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public NextBinder_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextBinder_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterNextBinder_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitNextBinder_EOF(this);
		}
	}

	public final NextBinder_EOFContext nextBinder_EOF() throws RecognitionException {
		NextBinder_EOFContext _localctx = new NextBinder_EOFContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_nextBinder_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			nextBinder();
			setState(1203);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dot_TOKContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(CrsxMetaParser.DOT, 0); }
		public TerminalNode MT_dot_TOK() { return getToken(CrsxMetaParser.MT_dot_TOK, 0); }
		public TerminalNode ET_dot_TOK() { return getToken(CrsxMetaParser.ET_dot_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Dot_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDot_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDot_TOK(this);
		}
	}

	public final Dot_TOKContext dot_TOK() throws RecognitionException {
		Dot_TOKContext _localctx = new Dot_TOKContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_dot_TOK);
		try {
			setState(1213);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1206);
				match(DOT);

				}
				break;
			case MT_dot_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1209);
				match(MT_dot_TOK);
				}
				break;
			case ET_dot_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1211);
				match(ET_dot_TOK);
				setState(1212);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dot_TOK_EOFContext extends ParserRuleContext {
		public Dot_TOKContext dot_TOK() {
			return getRuleContext(Dot_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Dot_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDot_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDot_TOK_EOF(this);
		}
	}

	public final Dot_TOK_EOFContext dot_TOK_EOF() throws RecognitionException {
		Dot_TOK_EOFContext _localctx = new Dot_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_dot_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			dot_TOK();
			setState(1216);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public Lsquare_TOKContext lsquare_TOK() {
			return getRuleContext(Lsquare_TOKContext.class,0);
		}
		public Terms_OPTContext terms_OPT() {
			return getRuleContext(Terms_OPTContext.class,0);
		}
		public Rsquare_TOKContext rsquare_TOK() {
			return getRuleContext(Rsquare_TOKContext.class,0);
		}
		public TerminalNode MT_arguments() { return getToken(CrsxMetaParser.MT_arguments, 0); }
		public TerminalNode ET_arguments() { return getToken(CrsxMetaParser.ET_arguments, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_arguments);
		try {
			setState(1229);
			switch (_input.LA(1)) {
			case MT_lsquare_TOK:
			case ET_lsquare_TOK:
			case LSQUARE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1219);
				lsquare_TOK();
				setState(1220);
				terms_OPT();
				setState(1221);
				rsquare_TOK();
				_exitAlt();
				}
				break;
			case MT_arguments:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1225);
				match(MT_arguments);
				}
				break;
			case ET_arguments:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1227);
				match(ET_arguments);
				setState(1228);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arguments_EOFContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Arguments_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterArguments_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitArguments_EOF(this);
		}
	}

	public final Arguments_EOFContext arguments_EOF() throws RecognitionException {
		Arguments_EOFContext _localctx = new Arguments_EOFContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_arguments_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			arguments();
			setState(1232);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lsquare_TOKContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(CrsxMetaParser.LSQUARE, 0); }
		public TerminalNode MT_lsquare_TOK() { return getToken(CrsxMetaParser.MT_lsquare_TOK, 0); }
		public TerminalNode ET_lsquare_TOK() { return getToken(CrsxMetaParser.ET_lsquare_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Lsquare_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lsquare_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterLsquare_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitLsquare_TOK(this);
		}
	}

	public final Lsquare_TOKContext lsquare_TOK() throws RecognitionException {
		Lsquare_TOKContext _localctx = new Lsquare_TOKContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_lsquare_TOK);
		try {
			setState(1242);
			switch (_input.LA(1)) {
			case LSQUARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1235);
				match(LSQUARE);

				}
				break;
			case MT_lsquare_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1238);
				match(MT_lsquare_TOK);
				}
				break;
			case ET_lsquare_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1240);
				match(ET_lsquare_TOK);
				setState(1241);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lsquare_TOK_EOFContext extends ParserRuleContext {
		public Lsquare_TOKContext lsquare_TOK() {
			return getRuleContext(Lsquare_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Lsquare_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lsquare_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterLsquare_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitLsquare_TOK_EOF(this);
		}
	}

	public final Lsquare_TOK_EOFContext lsquare_TOK_EOF() throws RecognitionException {
		Lsquare_TOK_EOFContext _localctx = new Lsquare_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_lsquare_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			lsquare_TOK();
			setState(1245);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Terms_OPTContext extends ParserRuleContext {
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public TerminalNode MT_terms_OPT() { return getToken(CrsxMetaParser.MT_terms_OPT, 0); }
		public TerminalNode ET_terms_OPT() { return getToken(CrsxMetaParser.ET_terms_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Terms_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterTerms_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitTerms_OPT(this);
		}
	}

	public final Terms_OPTContext terms_OPT() throws RecognitionException {
		Terms_OPTContext _localctx = new Terms_OPTContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_terms_OPT);
		int _la;
		try {
			setState(1269);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1250);
				_la = _input.LA(1);
				if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (MT_constructor_TOK - 19)) | (1L << (ET_constructor_TOK - 19)) | (1L << (MT_lbrace_TOK - 19)) | (1L << (ET_lbrace_TOK - 19)) | (1L << (MT_colon_TOK - 19)) | (1L << (ET_colon_TOK - 19)) | (1L << (MT_properties_OPT - 19)) | (1L << (ET_properties_OPT - 19)) | (1L << (MT_annotations - 19)) | (1L << (ET_annotations - 19)) | (1L << (MT_annotation_OOM - 19)) | (1L << (ET_annotation_OOM - 19)) | (1L << (MT_annotation - 19)) | (1L << (ET_annotation - 19)) | (1L << (MT_at_TOK - 19)) | (1L << (ET_at_TOK - 19)) | (1L << (MT_term - 19)) | (1L << (ET_term - 19)) | (1L << (MT_freeTerm - 19)) | (1L << (ET_freeTerm - 19)) | (1L << (MT_annotations_OPT - 19)) | (1L << (ET_annotations_OPT - 19)) | (1L << (MT_metavar_TOK - 19)) | (1L << (ET_metavar_TOK - 19)) | (1L << (MT_boundTerm - 19)) | (1L << (ET_boundTerm - 19)) | (1L << (MT_terms - 19)) | (1L << (ET_terms - 19)))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (MT_list - 99)) | (1L << (ET_list - 99)) | (1L << (MT_lpar_TOK - 99)) | (1L << (ET_lpar_TOK - 99)) | (1L << (MT_variable - 99)) | (1L << (ET_variable - 99)) | (1L << (MT_linear_OPT - 99)) | (1L << (ET_linear_OPT - 99)) | (1L << (MT_variable_TOK - 99)) | (1L << (ET_variable_TOK - 99)) | (1L << (MT_linear - 99)) | (1L << (ET_linear - 99)) | (1L << (MT_linear_TOK - 99)) | (1L << (ET_linear_TOK - 99)) | (1L << (MT_literal - 99)) | (1L << (ET_literal - 99)) | (1L << (MT_string_TOK - 99)) | (1L << (ET_string_TOK - 99)) | (1L << (MT_number_TOK - 99)) | (1L << (ET_number_TOK - 99)) | (1L << (MT_binder - 99)) | (1L << (ET_binder - 99)) | (1L << (MT_concrete - 99)) | (1L << (ET_concrete - 99)) | (1L << (MT_category_TOK - 99)) | (1L << (ET_category_TOK - 99)) | (1L << (MT_dispatch - 99)) | (1L << (ET_dispatch - 99)) | (1L << (MT_dispatch_TOK - 99)) | (1L << (ET_dispatch_TOK - 99)))) != 0) || ((((_la - 177)) & ~0x3f) == 0 && ((1L << (_la - 177)) & ((1L << (MT_properties - 177)) | (1L << (ET_properties - 177)) | (1L << (MT_expression - 177)) | (1L << (ET_expression - 177)) | (1L << (MT_constructor - 177)) | (1L << (ET_constructor - 177)) | (1L << (MT_qualifier - 177)) | (1L << (ET_qualifier - 177)) | (1L << (MT_reserved - 177)) | (1L << (ET_reserved - 177)))) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & ((1L << (DISPATCH - 257)) | (1L << (COLON - 257)) | (1L << (LPAR - 257)) | (1L << (LBRACE - 257)) | (1L << (LINEAR - 257)) | (1L << (AT - 257)) | (1L << (CATEGORY - 257)) | (1L << (CONSTRUCTOR - 257)) | (1L << (VARIABLE - 257)) | (1L << (METAVAR - 257)) | (1L << (STRING - 257)) | (1L << (NUMBER - 257)))) != 0)) {
					{
					setState(1249);
					terms();
					}
				}

				setState(1260);
				_la = _input.LA(1);
				if (_la==MT_terms_OPT || _la==ET_terms_OPT) {
					{
					_tail();
					setState(1258);
					switch (_input.LA(1)) {
					case MT_terms_OPT:
						{
						_term();
						setState(1254);
						match(MT_terms_OPT);
						}
						break;
					case ET_terms_OPT:
						{
						_embed();
						setState(1256);
						match(ET_terms_OPT);
						setState(1257);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitOPT();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1265);
				match(MT_terms_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1267);
				match(ET_terms_OPT);
				setState(1268);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Terms_OPT_EOFContext extends ParserRuleContext {
		public Terms_OPTContext terms_OPT() {
			return getRuleContext(Terms_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Terms_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterTerms_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitTerms_OPT_EOF(this);
		}
	}

	public final Terms_OPT_EOFContext terms_OPT_EOF() throws RecognitionException {
		Terms_OPT_EOFContext _localctx = new Terms_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_terms_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			terms_OPT();
			setState(1272);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rsquare_TOKContext extends ParserRuleContext {
		public TerminalNode RSQUARE() { return getToken(CrsxMetaParser.RSQUARE, 0); }
		public TerminalNode MT_rsquare_TOK() { return getToken(CrsxMetaParser.MT_rsquare_TOK, 0); }
		public TerminalNode ET_rsquare_TOK() { return getToken(CrsxMetaParser.ET_rsquare_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Rsquare_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rsquare_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterRsquare_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitRsquare_TOK(this);
		}
	}

	public final Rsquare_TOKContext rsquare_TOK() throws RecognitionException {
		Rsquare_TOKContext _localctx = new Rsquare_TOKContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_rsquare_TOK);
		try {
			setState(1282);
			switch (_input.LA(1)) {
			case RSQUARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1275);
				match(RSQUARE);

				}
				break;
			case MT_rsquare_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1278);
				match(MT_rsquare_TOK);
				}
				break;
			case ET_rsquare_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1280);
				match(ET_rsquare_TOK);
				setState(1281);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rsquare_TOK_EOFContext extends ParserRuleContext {
		public Rsquare_TOKContext rsquare_TOK() {
			return getRuleContext(Rsquare_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Rsquare_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rsquare_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterRsquare_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitRsquare_TOK_EOF(this);
		}
	}

	public final Rsquare_TOK_EOFContext rsquare_TOK_EOF() throws RecognitionException {
		Rsquare_TOK_EOFContext _localctx = new Rsquare_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_rsquare_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284);
			rsquare_TOK();
			setState(1285);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermsContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Terms_S1_ZOMContext terms_S1_ZOM() {
			return getRuleContext(Terms_S1_ZOMContext.class,0);
		}
		public TerminalNode MT_terms() { return getToken(CrsxMetaParser.MT_terms, 0); }
		public TerminalNode ET_terms() { return getToken(CrsxMetaParser.ET_terms, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public TermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitTerms(this);
		}
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_terms);
		try {
			setState(1297);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_lbrace_TOK:
			case ET_lbrace_TOK:
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
			case MT_at_TOK:
			case ET_at_TOK:
			case MT_term:
			case ET_term:
			case MT_freeTerm:
			case ET_freeTerm:
			case MT_annotations_OPT:
			case ET_annotations_OPT:
			case MT_metavar_TOK:
			case ET_metavar_TOK:
			case MT_boundTerm:
			case ET_boundTerm:
			case MT_list:
			case ET_list:
			case MT_lpar_TOK:
			case ET_lpar_TOK:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
			case MT_linear_TOK:
			case ET_linear_TOK:
			case MT_literal:
			case ET_literal:
			case MT_string_TOK:
			case ET_string_TOK:
			case MT_number_TOK:
			case ET_number_TOK:
			case MT_binder:
			case ET_binder:
			case MT_concrete:
			case ET_concrete:
			case MT_category_TOK:
			case ET_category_TOK:
			case MT_dispatch:
			case ET_dispatch:
			case MT_dispatch_TOK:
			case ET_dispatch_TOK:
			case MT_properties:
			case ET_properties:
			case MT_expression:
			case ET_expression:
			case MT_constructor:
			case ET_constructor:
			case MT_qualifier:
			case ET_qualifier:
			case MT_reserved:
			case ET_reserved:
			case DISPATCH:
			case COLON:
			case LPAR:
			case LBRACE:
			case LINEAR:
			case AT:
			case CATEGORY:
			case CONSTRUCTOR:
			case VARIABLE:
			case METAVAR:
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1288);
				term();
				setState(1289);
				terms_S1_ZOM();
				_exitAlt();
				}
				break;
			case MT_terms:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1293);
				match(MT_terms);
				}
				break;
			case ET_terms:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1295);
				match(ET_terms);
				setState(1296);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Terms_EOFContext extends ParserRuleContext {
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Terms_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterTerms_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitTerms_EOF(this);
		}
	}

	public final Terms_EOFContext terms_EOF() throws RecognitionException {
		Terms_EOFContext _localctx = new Terms_EOFContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_terms_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299);
			terms();
			setState(1300);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Terms_S1_ZOMContext extends ParserRuleContext {
		public List<Terms_S1Context> terms_S1() {
			return getRuleContexts(Terms_S1Context.class);
		}
		public Terms_S1Context terms_S1(int i) {
			return getRuleContext(Terms_S1Context.class,i);
		}
		public TerminalNode MT_terms_S1_ZOM() { return getToken(CrsxMetaParser.MT_terms_S1_ZOM, 0); }
		public TerminalNode ET_terms_S1_ZOM() { return getToken(CrsxMetaParser.ET_terms_S1_ZOM, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Terms_S1_ZOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms_S1_ZOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterTerms_S1_ZOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitTerms_S1_ZOM(this);
		}
	}

	public final Terms_S1_ZOMContext terms_S1_ZOM() throws RecognitionException {
		Terms_S1_ZOMContext _localctx = new Terms_S1_ZOMContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_terms_S1_ZOM);
		int _la;
		try {
			setState(1327);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterZOM();
				setState(1307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (MT_terms_S1 - 85)) | (1L << (ET_terms_S1 - 85)) | (1L << (MT_comma_TOK - 85)) | (1L << (ET_comma_TOK - 85)))) != 0) || _la==COMMA) {
					{
					{
					setState(1304);
					terms_S1();
					}
					}
					setState(1309);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1318);
				_la = _input.LA(1);
				if (_la==MT_terms_S1_ZOM || _la==ET_terms_S1_ZOM) {
					{
					_tail();
					setState(1316);
					switch (_input.LA(1)) {
					case MT_terms_S1_ZOM:
						{
						_term();
						setState(1312);
						match(MT_terms_S1_ZOM);
						}
						break;
					case ET_terms_S1_ZOM:
						{
						_embed();
						setState(1314);
						match(ET_terms_S1_ZOM);
						setState(1315);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitZOM();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1323);
				match(MT_terms_S1_ZOM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1325);
				match(ET_terms_S1_ZOM);
				setState(1326);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Terms_S1_ZOM_EOFContext extends ParserRuleContext {
		public Terms_S1_ZOMContext terms_S1_ZOM() {
			return getRuleContext(Terms_S1_ZOMContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Terms_S1_ZOM_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms_S1_ZOM_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterTerms_S1_ZOM_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitTerms_S1_ZOM_EOF(this);
		}
	}

	public final Terms_S1_ZOM_EOFContext terms_S1_ZOM_EOF() throws RecognitionException {
		Terms_S1_ZOM_EOFContext _localctx = new Terms_S1_ZOM_EOFContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_terms_S1_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1329);
			terms_S1_ZOM();
			setState(1330);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Terms_S1Context extends ParserRuleContext {
		public Comma_TOKContext comma_TOK() {
			return getRuleContext(Comma_TOKContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MT_terms_S1() { return getToken(CrsxMetaParser.MT_terms_S1, 0); }
		public TerminalNode ET_terms_S1() { return getToken(CrsxMetaParser.ET_terms_S1, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Terms_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterTerms_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitTerms_S1(this);
		}
	}

	public final Terms_S1Context terms_S1() throws RecognitionException {
		Terms_S1Context _localctx = new Terms_S1Context(_ctx, getState());
		enterRule(_localctx, 168, RULE_terms_S1);
		try {
			setState(1342);
			switch (_input.LA(1)) {
			case MT_comma_TOK:
			case ET_comma_TOK:
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1333);
				comma_TOK();
				setState(1334);
				term();
				_exitAlt();
				}
				break;
			case MT_terms_S1:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1338);
				match(MT_terms_S1);
				}
				break;
			case ET_terms_S1:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1340);
				match(ET_terms_S1);
				setState(1341);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Terms_S1_EOFContext extends ParserRuleContext {
		public Terms_S1Context terms_S1() {
			return getRuleContext(Terms_S1Context.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Terms_S1_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms_S1_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterTerms_S1_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitTerms_S1_EOF(this);
		}
	}

	public final Terms_S1_EOFContext terms_S1_EOF() throws RecognitionException {
		Terms_S1_EOFContext _localctx = new Terms_S1_EOFContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_terms_S1_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1344);
			terms_S1();
			setState(1345);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comma_TOKContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(CrsxMetaParser.COMMA, 0); }
		public TerminalNode MT_comma_TOK() { return getToken(CrsxMetaParser.MT_comma_TOK, 0); }
		public TerminalNode ET_comma_TOK() { return getToken(CrsxMetaParser.ET_comma_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Comma_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterComma_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitComma_TOK(this);
		}
	}

	public final Comma_TOKContext comma_TOK() throws RecognitionException {
		Comma_TOKContext _localctx = new Comma_TOKContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_comma_TOK);
		try {
			setState(1355);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1348);
				match(COMMA);

				}
				break;
			case MT_comma_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1351);
				match(MT_comma_TOK);
				}
				break;
			case ET_comma_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1353);
				match(ET_comma_TOK);
				setState(1354);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comma_TOK_EOFContext extends ParserRuleContext {
		public Comma_TOKContext comma_TOK() {
			return getRuleContext(Comma_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Comma_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterComma_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitComma_TOK_EOF(this);
		}
	}

	public final Comma_TOK_EOFContext comma_TOK_EOF() throws RecognitionException {
		Comma_TOK_EOFContext _localctx = new Comma_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_comma_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357);
			comma_TOK();
			setState(1358);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FreeArgumentsContext extends ParserRuleContext {
		public Lsquare_TOKContext lsquare_TOK() {
			return getRuleContext(Lsquare_TOKContext.class,0);
		}
		public FreeTerms_OPTContext freeTerms_OPT() {
			return getRuleContext(FreeTerms_OPTContext.class,0);
		}
		public Rsquare_TOKContext rsquare_TOK() {
			return getRuleContext(Rsquare_TOKContext.class,0);
		}
		public TerminalNode MT_freeArguments() { return getToken(CrsxMetaParser.MT_freeArguments, 0); }
		public TerminalNode ET_freeArguments() { return getToken(CrsxMetaParser.ET_freeArguments, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public FreeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterFreeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitFreeArguments(this);
		}
	}

	public final FreeArgumentsContext freeArguments() throws RecognitionException {
		FreeArgumentsContext _localctx = new FreeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_freeArguments);
		try {
			setState(1371);
			switch (_input.LA(1)) {
			case MT_lsquare_TOK:
			case ET_lsquare_TOK:
			case LSQUARE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1361);
				lsquare_TOK();
				setState(1362);
				freeTerms_OPT();
				setState(1363);
				rsquare_TOK();
				_exitAlt();
				}
				break;
			case MT_freeArguments:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1367);
				match(MT_freeArguments);
				}
				break;
			case ET_freeArguments:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1369);
				match(ET_freeArguments);
				setState(1370);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FreeArguments_EOFContext extends ParserRuleContext {
		public FreeArgumentsContext freeArguments() {
			return getRuleContext(FreeArgumentsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public FreeArguments_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freeArguments_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterFreeArguments_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitFreeArguments_EOF(this);
		}
	}

	public final FreeArguments_EOFContext freeArguments_EOF() throws RecognitionException {
		FreeArguments_EOFContext _localctx = new FreeArguments_EOFContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_freeArguments_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
			freeArguments();
			setState(1374);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FreeTerms_OPTContext extends ParserRuleContext {
		public FreeTermsContext freeTerms() {
			return getRuleContext(FreeTermsContext.class,0);
		}
		public TerminalNode MT_freeTerms_OPT() { return getToken(CrsxMetaParser.MT_freeTerms_OPT, 0); }
		public TerminalNode ET_freeTerms_OPT() { return getToken(CrsxMetaParser.ET_freeTerms_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public FreeTerms_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freeTerms_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterFreeTerms_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitFreeTerms_OPT(this);
		}
	}

	public final FreeTerms_OPTContext freeTerms_OPT() throws RecognitionException {
		FreeTerms_OPTContext _localctx = new FreeTerms_OPTContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_freeTerms_OPT);
		int _la;
		try {
			setState(1398);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1379);
				_la = _input.LA(1);
				if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (MT_constructor_TOK - 19)) | (1L << (ET_constructor_TOK - 19)) | (1L << (MT_lbrace_TOK - 19)) | (1L << (ET_lbrace_TOK - 19)) | (1L << (MT_colon_TOK - 19)) | (1L << (ET_colon_TOK - 19)) | (1L << (MT_properties_OPT - 19)) | (1L << (ET_properties_OPT - 19)) | (1L << (MT_annotations - 19)) | (1L << (ET_annotations - 19)) | (1L << (MT_annotation_OOM - 19)) | (1L << (ET_annotation_OOM - 19)) | (1L << (MT_annotation - 19)) | (1L << (ET_annotation - 19)) | (1L << (MT_at_TOK - 19)) | (1L << (ET_at_TOK - 19)) | (1L << (MT_freeTerm - 19)) | (1L << (ET_freeTerm - 19)) | (1L << (MT_annotations_OPT - 19)) | (1L << (ET_annotations_OPT - 19)) | (1L << (MT_metavar_TOK - 19)) | (1L << (ET_metavar_TOK - 19)))) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (MT_freeTerms - 93)) | (1L << (ET_freeTerms - 93)) | (1L << (MT_list - 93)) | (1L << (ET_list - 93)) | (1L << (MT_lpar_TOK - 93)) | (1L << (ET_lpar_TOK - 93)) | (1L << (MT_variable - 93)) | (1L << (ET_variable - 93)) | (1L << (MT_linear_OPT - 93)) | (1L << (ET_linear_OPT - 93)) | (1L << (MT_variable_TOK - 93)) | (1L << (ET_variable_TOK - 93)) | (1L << (MT_linear - 93)) | (1L << (ET_linear - 93)) | (1L << (MT_linear_TOK - 93)) | (1L << (ET_linear_TOK - 93)) | (1L << (MT_literal - 93)) | (1L << (ET_literal - 93)) | (1L << (MT_string_TOK - 93)) | (1L << (ET_string_TOK - 93)) | (1L << (MT_number_TOK - 93)) | (1L << (ET_number_TOK - 93)) | (1L << (MT_concrete - 93)) | (1L << (ET_concrete - 93)) | (1L << (MT_category_TOK - 93)) | (1L << (ET_category_TOK - 93)))) != 0) || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (MT_dispatch - 157)) | (1L << (ET_dispatch - 157)) | (1L << (MT_dispatch_TOK - 157)) | (1L << (ET_dispatch_TOK - 157)) | (1L << (MT_properties - 157)) | (1L << (ET_properties - 157)) | (1L << (MT_expression - 157)) | (1L << (ET_expression - 157)))) != 0) || ((((_la - 231)) & ~0x3f) == 0 && ((1L << (_la - 231)) & ((1L << (MT_constructor - 231)) | (1L << (ET_constructor - 231)) | (1L << (MT_qualifier - 231)) | (1L << (ET_qualifier - 231)) | (1L << (MT_reserved - 231)) | (1L << (ET_reserved - 231)) | (1L << (DISPATCH - 231)) | (1L << (COLON - 231)) | (1L << (LPAR - 231)) | (1L << (LBRACE - 231)) | (1L << (LINEAR - 231)) | (1L << (AT - 231)) | (1L << (CATEGORY - 231)) | (1L << (CONSTRUCTOR - 231)) | (1L << (VARIABLE - 231)) | (1L << (METAVAR - 231)) | (1L << (STRING - 231)) | (1L << (NUMBER - 231)))) != 0)) {
					{
					setState(1378);
					freeTerms();
					}
				}

				setState(1389);
				_la = _input.LA(1);
				if (_la==MT_freeTerms_OPT || _la==ET_freeTerms_OPT) {
					{
					_tail();
					setState(1387);
					switch (_input.LA(1)) {
					case MT_freeTerms_OPT:
						{
						_term();
						setState(1383);
						match(MT_freeTerms_OPT);
						}
						break;
					case ET_freeTerms_OPT:
						{
						_embed();
						setState(1385);
						match(ET_freeTerms_OPT);
						setState(1386);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitOPT();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1394);
				match(MT_freeTerms_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1396);
				match(ET_freeTerms_OPT);
				setState(1397);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FreeTerms_OPT_EOFContext extends ParserRuleContext {
		public FreeTerms_OPTContext freeTerms_OPT() {
			return getRuleContext(FreeTerms_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public FreeTerms_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freeTerms_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterFreeTerms_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitFreeTerms_OPT_EOF(this);
		}
	}

	public final FreeTerms_OPT_EOFContext freeTerms_OPT_EOF() throws RecognitionException {
		FreeTerms_OPT_EOFContext _localctx = new FreeTerms_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_freeTerms_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1400);
			freeTerms_OPT();
			setState(1401);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FreeTermsContext extends ParserRuleContext {
		public FreeTermContext freeTerm() {
			return getRuleContext(FreeTermContext.class,0);
		}
		public FreeTerms_S1_ZOMContext freeTerms_S1_ZOM() {
			return getRuleContext(FreeTerms_S1_ZOMContext.class,0);
		}
		public TerminalNode MT_freeTerms() { return getToken(CrsxMetaParser.MT_freeTerms, 0); }
		public TerminalNode ET_freeTerms() { return getToken(CrsxMetaParser.ET_freeTerms, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public FreeTermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freeTerms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterFreeTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitFreeTerms(this);
		}
	}

	public final FreeTermsContext freeTerms() throws RecognitionException {
		FreeTermsContext _localctx = new FreeTermsContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_freeTerms);
		try {
			setState(1413);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_lbrace_TOK:
			case ET_lbrace_TOK:
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
			case MT_at_TOK:
			case ET_at_TOK:
			case MT_freeTerm:
			case ET_freeTerm:
			case MT_annotations_OPT:
			case ET_annotations_OPT:
			case MT_metavar_TOK:
			case ET_metavar_TOK:
			case MT_list:
			case ET_list:
			case MT_lpar_TOK:
			case ET_lpar_TOK:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
			case MT_linear_TOK:
			case ET_linear_TOK:
			case MT_literal:
			case ET_literal:
			case MT_string_TOK:
			case ET_string_TOK:
			case MT_number_TOK:
			case ET_number_TOK:
			case MT_concrete:
			case ET_concrete:
			case MT_category_TOK:
			case ET_category_TOK:
			case MT_dispatch:
			case ET_dispatch:
			case MT_dispatch_TOK:
			case ET_dispatch_TOK:
			case MT_properties:
			case ET_properties:
			case MT_expression:
			case ET_expression:
			case MT_constructor:
			case ET_constructor:
			case MT_qualifier:
			case ET_qualifier:
			case MT_reserved:
			case ET_reserved:
			case DISPATCH:
			case COLON:
			case LPAR:
			case LBRACE:
			case LINEAR:
			case AT:
			case CATEGORY:
			case CONSTRUCTOR:
			case VARIABLE:
			case METAVAR:
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1404);
				freeTerm();
				setState(1405);
				freeTerms_S1_ZOM();
				_exitAlt();
				}
				break;
			case MT_freeTerms:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1409);
				match(MT_freeTerms);
				}
				break;
			case ET_freeTerms:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1411);
				match(ET_freeTerms);
				setState(1412);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FreeTerms_EOFContext extends ParserRuleContext {
		public FreeTermsContext freeTerms() {
			return getRuleContext(FreeTermsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public FreeTerms_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freeTerms_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterFreeTerms_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitFreeTerms_EOF(this);
		}
	}

	public final FreeTerms_EOFContext freeTerms_EOF() throws RecognitionException {
		FreeTerms_EOFContext _localctx = new FreeTerms_EOFContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_freeTerms_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1415);
			freeTerms();
			setState(1416);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FreeTerms_S1_ZOMContext extends ParserRuleContext {
		public List<FreeTerms_S1Context> freeTerms_S1() {
			return getRuleContexts(FreeTerms_S1Context.class);
		}
		public FreeTerms_S1Context freeTerms_S1(int i) {
			return getRuleContext(FreeTerms_S1Context.class,i);
		}
		public TerminalNode MT_freeTerms_S1_ZOM() { return getToken(CrsxMetaParser.MT_freeTerms_S1_ZOM, 0); }
		public TerminalNode ET_freeTerms_S1_ZOM() { return getToken(CrsxMetaParser.ET_freeTerms_S1_ZOM, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public FreeTerms_S1_ZOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freeTerms_S1_ZOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterFreeTerms_S1_ZOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitFreeTerms_S1_ZOM(this);
		}
	}

	public final FreeTerms_S1_ZOMContext freeTerms_S1_ZOM() throws RecognitionException {
		FreeTerms_S1_ZOMContext _localctx = new FreeTerms_S1_ZOMContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_freeTerms_S1_ZOM);
		int _la;
		try {
			setState(1443);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterZOM();
				setState(1423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (MT_comma_TOK - 87)) | (1L << (ET_comma_TOK - 87)) | (1L << (MT_freeTerms_S1 - 87)) | (1L << (ET_freeTerms_S1 - 87)))) != 0) || _la==COMMA) {
					{
					{
					setState(1420);
					freeTerms_S1();
					}
					}
					setState(1425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1434);
				_la = _input.LA(1);
				if (_la==MT_freeTerms_S1_ZOM || _la==ET_freeTerms_S1_ZOM) {
					{
					_tail();
					setState(1432);
					switch (_input.LA(1)) {
					case MT_freeTerms_S1_ZOM:
						{
						_term();
						setState(1428);
						match(MT_freeTerms_S1_ZOM);
						}
						break;
					case ET_freeTerms_S1_ZOM:
						{
						_embed();
						setState(1430);
						match(ET_freeTerms_S1_ZOM);
						setState(1431);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitZOM();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1439);
				match(MT_freeTerms_S1_ZOM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1441);
				match(ET_freeTerms_S1_ZOM);
				setState(1442);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FreeTerms_S1_ZOM_EOFContext extends ParserRuleContext {
		public FreeTerms_S1_ZOMContext freeTerms_S1_ZOM() {
			return getRuleContext(FreeTerms_S1_ZOMContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public FreeTerms_S1_ZOM_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freeTerms_S1_ZOM_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterFreeTerms_S1_ZOM_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitFreeTerms_S1_ZOM_EOF(this);
		}
	}

	public final FreeTerms_S1_ZOM_EOFContext freeTerms_S1_ZOM_EOF() throws RecognitionException {
		FreeTerms_S1_ZOM_EOFContext _localctx = new FreeTerms_S1_ZOM_EOFContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_freeTerms_S1_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			freeTerms_S1_ZOM();
			setState(1446);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FreeTerms_S1Context extends ParserRuleContext {
		public Comma_TOKContext comma_TOK() {
			return getRuleContext(Comma_TOKContext.class,0);
		}
		public FreeTermContext freeTerm() {
			return getRuleContext(FreeTermContext.class,0);
		}
		public TerminalNode MT_freeTerms_S1() { return getToken(CrsxMetaParser.MT_freeTerms_S1, 0); }
		public TerminalNode ET_freeTerms_S1() { return getToken(CrsxMetaParser.ET_freeTerms_S1, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public FreeTerms_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freeTerms_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterFreeTerms_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitFreeTerms_S1(this);
		}
	}

	public final FreeTerms_S1Context freeTerms_S1() throws RecognitionException {
		FreeTerms_S1Context _localctx = new FreeTerms_S1Context(_ctx, getState());
		enterRule(_localctx, 192, RULE_freeTerms_S1);
		try {
			setState(1458);
			switch (_input.LA(1)) {
			case MT_comma_TOK:
			case ET_comma_TOK:
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1449);
				comma_TOK();
				setState(1450);
				freeTerm();
				_exitAlt();
				}
				break;
			case MT_freeTerms_S1:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1454);
				match(MT_freeTerms_S1);
				}
				break;
			case ET_freeTerms_S1:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1456);
				match(ET_freeTerms_S1);
				setState(1457);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FreeTerms_S1_EOFContext extends ParserRuleContext {
		public FreeTerms_S1Context freeTerms_S1() {
			return getRuleContext(FreeTerms_S1Context.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public FreeTerms_S1_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freeTerms_S1_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterFreeTerms_S1_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitFreeTerms_S1_EOF(this);
		}
	}

	public final FreeTerms_S1_EOFContext freeTerms_S1_EOF() throws RecognitionException {
		FreeTerms_S1_EOFContext _localctx = new FreeTerms_S1_EOFContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_freeTerms_S1_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1460);
			freeTerms_S1();
			setState(1461);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public Lpar_TOKContext lpar_TOK() {
			return getRuleContext(Lpar_TOKContext.class,0);
		}
		public TermList_OPTContext termList_OPT() {
			return getRuleContext(TermList_OPTContext.class,0);
		}
		public Rpar_TOKContext rpar_TOK() {
			return getRuleContext(Rpar_TOKContext.class,0);
		}
		public TerminalNode MT_list() { return getToken(CrsxMetaParser.MT_list, 0); }
		public TerminalNode ET_list() { return getToken(CrsxMetaParser.ET_list, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_list);
		try {
			setState(1474);
			switch (_input.LA(1)) {
			case MT_lpar_TOK:
			case ET_lpar_TOK:
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1464);
				lpar_TOK();
				setState(1465);
				termList_OPT();
				setState(1466);
				rpar_TOK();
				_exitAlt();
				}
				break;
			case MT_list:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1470);
				match(MT_list);
				}
				break;
			case ET_list:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1472);
				match(ET_list);
				setState(1473);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_EOFContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public List_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterList_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitList_EOF(this);
		}
	}

	public final List_EOFContext list_EOF() throws RecognitionException {
		List_EOFContext _localctx = new List_EOFContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_list_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			list();
			setState(1477);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lpar_TOKContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(CrsxMetaParser.LPAR, 0); }
		public TerminalNode MT_lpar_TOK() { return getToken(CrsxMetaParser.MT_lpar_TOK, 0); }
		public TerminalNode ET_lpar_TOK() { return getToken(CrsxMetaParser.ET_lpar_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Lpar_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lpar_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterLpar_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitLpar_TOK(this);
		}
	}

	public final Lpar_TOKContext lpar_TOK() throws RecognitionException {
		Lpar_TOKContext _localctx = new Lpar_TOKContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_lpar_TOK);
		try {
			setState(1487);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1480);
				match(LPAR);

				}
				break;
			case MT_lpar_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1483);
				match(MT_lpar_TOK);
				}
				break;
			case ET_lpar_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1485);
				match(ET_lpar_TOK);
				setState(1486);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lpar_TOK_EOFContext extends ParserRuleContext {
		public Lpar_TOKContext lpar_TOK() {
			return getRuleContext(Lpar_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Lpar_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lpar_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterLpar_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitLpar_TOK_EOF(this);
		}
	}

	public final Lpar_TOK_EOFContext lpar_TOK_EOF() throws RecognitionException {
		Lpar_TOK_EOFContext _localctx = new Lpar_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_lpar_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1489);
			lpar_TOK();
			setState(1490);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermList_OPTContext extends ParserRuleContext {
		public TermListContext termList() {
			return getRuleContext(TermListContext.class,0);
		}
		public TerminalNode MT_termList_OPT() { return getToken(CrsxMetaParser.MT_termList_OPT, 0); }
		public TerminalNode ET_termList_OPT() { return getToken(CrsxMetaParser.ET_termList_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public TermList_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termList_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterTermList_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitTermList_OPT(this);
		}
	}

	public final TermList_OPTContext termList_OPT() throws RecognitionException {
		TermList_OPTContext _localctx = new TermList_OPTContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_termList_OPT);
		int _la;
		try {
			setState(1514);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1495);
				_la = _input.LA(1);
				if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (MT_constructor_TOK - 19)) | (1L << (ET_constructor_TOK - 19)) | (1L << (MT_lbrace_TOK - 19)) | (1L << (ET_lbrace_TOK - 19)) | (1L << (MT_colon_TOK - 19)) | (1L << (ET_colon_TOK - 19)) | (1L << (MT_properties_OPT - 19)) | (1L << (ET_properties_OPT - 19)) | (1L << (MT_annotations - 19)) | (1L << (ET_annotations - 19)) | (1L << (MT_annotation_OOM - 19)) | (1L << (ET_annotation_OOM - 19)) | (1L << (MT_annotation - 19)) | (1L << (ET_annotation - 19)) | (1L << (MT_at_TOK - 19)) | (1L << (ET_at_TOK - 19)) | (1L << (MT_term - 19)) | (1L << (ET_term - 19)) | (1L << (MT_freeTerm - 19)) | (1L << (ET_freeTerm - 19)) | (1L << (MT_annotations_OPT - 19)) | (1L << (ET_annotations_OPT - 19)) | (1L << (MT_metavar_TOK - 19)) | (1L << (ET_metavar_TOK - 19)) | (1L << (MT_boundTerm - 19)) | (1L << (ET_boundTerm - 19)))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (MT_list - 99)) | (1L << (ET_list - 99)) | (1L << (MT_lpar_TOK - 99)) | (1L << (ET_lpar_TOK - 99)) | (1L << (MT_termList - 99)) | (1L << (ET_termList - 99)) | (1L << (MT_variable - 99)) | (1L << (ET_variable - 99)) | (1L << (MT_linear_OPT - 99)) | (1L << (ET_linear_OPT - 99)) | (1L << (MT_variable_TOK - 99)) | (1L << (ET_variable_TOK - 99)) | (1L << (MT_linear - 99)) | (1L << (ET_linear - 99)) | (1L << (MT_linear_TOK - 99)) | (1L << (ET_linear_TOK - 99)) | (1L << (MT_literal - 99)) | (1L << (ET_literal - 99)) | (1L << (MT_string_TOK - 99)) | (1L << (ET_string_TOK - 99)) | (1L << (MT_number_TOK - 99)) | (1L << (ET_number_TOK - 99)) | (1L << (MT_binder - 99)) | (1L << (ET_binder - 99)) | (1L << (MT_concrete - 99)) | (1L << (ET_concrete - 99)) | (1L << (MT_category_TOK - 99)) | (1L << (ET_category_TOK - 99)) | (1L << (MT_dispatch - 99)) | (1L << (ET_dispatch - 99)) | (1L << (MT_dispatch_TOK - 99)) | (1L << (ET_dispatch_TOK - 99)))) != 0) || ((((_la - 177)) & ~0x3f) == 0 && ((1L << (_la - 177)) & ((1L << (MT_properties - 177)) | (1L << (ET_properties - 177)) | (1L << (MT_expression - 177)) | (1L << (ET_expression - 177)) | (1L << (MT_constructor - 177)) | (1L << (ET_constructor - 177)) | (1L << (MT_qualifier - 177)) | (1L << (ET_qualifier - 177)) | (1L << (MT_reserved - 177)) | (1L << (ET_reserved - 177)))) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & ((1L << (DISPATCH - 257)) | (1L << (COLON - 257)) | (1L << (LPAR - 257)) | (1L << (LBRACE - 257)) | (1L << (LINEAR - 257)) | (1L << (AT - 257)) | (1L << (CATEGORY - 257)) | (1L << (CONSTRUCTOR - 257)) | (1L << (VARIABLE - 257)) | (1L << (METAVAR - 257)) | (1L << (STRING - 257)) | (1L << (NUMBER - 257)))) != 0)) {
					{
					setState(1494);
					termList();
					}
				}

				setState(1505);
				_la = _input.LA(1);
				if (_la==MT_termList_OPT || _la==ET_termList_OPT) {
					{
					_tail();
					setState(1503);
					switch (_input.LA(1)) {
					case MT_termList_OPT:
						{
						_term();
						setState(1499);
						match(MT_termList_OPT);
						}
						break;
					case ET_termList_OPT:
						{
						_embed();
						setState(1501);
						match(ET_termList_OPT);
						setState(1502);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitOPT();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1510);
				match(MT_termList_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1512);
				match(ET_termList_OPT);
				setState(1513);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermList_OPT_EOFContext extends ParserRuleContext {
		public TermList_OPTContext termList_OPT() {
			return getRuleContext(TermList_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public TermList_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termList_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterTermList_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitTermList_OPT_EOF(this);
		}
	}

	public final TermList_OPT_EOFContext termList_OPT_EOF() throws RecognitionException {
		TermList_OPT_EOFContext _localctx = new TermList_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_termList_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1516);
			termList_OPT();
			setState(1517);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rpar_TOKContext extends ParserRuleContext {
		public TerminalNode RPAR() { return getToken(CrsxMetaParser.RPAR, 0); }
		public TerminalNode MT_rpar_TOK() { return getToken(CrsxMetaParser.MT_rpar_TOK, 0); }
		public TerminalNode ET_rpar_TOK() { return getToken(CrsxMetaParser.ET_rpar_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Rpar_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rpar_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterRpar_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitRpar_TOK(this);
		}
	}

	public final Rpar_TOKContext rpar_TOK() throws RecognitionException {
		Rpar_TOKContext _localctx = new Rpar_TOKContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_rpar_TOK);
		try {
			setState(1527);
			switch (_input.LA(1)) {
			case RPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1520);
				match(RPAR);

				}
				break;
			case MT_rpar_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1523);
				match(MT_rpar_TOK);
				}
				break;
			case ET_rpar_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1525);
				match(ET_rpar_TOK);
				setState(1526);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rpar_TOK_EOFContext extends ParserRuleContext {
		public Rpar_TOKContext rpar_TOK() {
			return getRuleContext(Rpar_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Rpar_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rpar_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterRpar_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitRpar_TOK_EOF(this);
		}
	}

	public final Rpar_TOK_EOFContext rpar_TOK_EOF() throws RecognitionException {
		Rpar_TOK_EOFContext _localctx = new Rpar_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_rpar_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1529);
			rpar_TOK();
			setState(1530);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermListContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermList_S1_ZOMContext termList_S1_ZOM() {
			return getRuleContext(TermList_S1_ZOMContext.class,0);
		}
		public TerminalNode MT_termList() { return getToken(CrsxMetaParser.MT_termList, 0); }
		public TerminalNode ET_termList() { return getToken(CrsxMetaParser.ET_termList, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public TermListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterTermList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitTermList(this);
		}
	}

	public final TermListContext termList() throws RecognitionException {
		TermListContext _localctx = new TermListContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_termList);
		try {
			setState(1542);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_lbrace_TOK:
			case ET_lbrace_TOK:
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
			case MT_at_TOK:
			case ET_at_TOK:
			case MT_term:
			case ET_term:
			case MT_freeTerm:
			case ET_freeTerm:
			case MT_annotations_OPT:
			case ET_annotations_OPT:
			case MT_metavar_TOK:
			case ET_metavar_TOK:
			case MT_boundTerm:
			case ET_boundTerm:
			case MT_list:
			case ET_list:
			case MT_lpar_TOK:
			case ET_lpar_TOK:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
			case MT_linear_TOK:
			case ET_linear_TOK:
			case MT_literal:
			case ET_literal:
			case MT_string_TOK:
			case ET_string_TOK:
			case MT_number_TOK:
			case ET_number_TOK:
			case MT_binder:
			case ET_binder:
			case MT_concrete:
			case ET_concrete:
			case MT_category_TOK:
			case ET_category_TOK:
			case MT_dispatch:
			case ET_dispatch:
			case MT_dispatch_TOK:
			case ET_dispatch_TOK:
			case MT_properties:
			case ET_properties:
			case MT_expression:
			case ET_expression:
			case MT_constructor:
			case ET_constructor:
			case MT_qualifier:
			case ET_qualifier:
			case MT_reserved:
			case ET_reserved:
			case DISPATCH:
			case COLON:
			case LPAR:
			case LBRACE:
			case LINEAR:
			case AT:
			case CATEGORY:
			case CONSTRUCTOR:
			case VARIABLE:
			case METAVAR:
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1533);
				term();
				setState(1534);
				termList_S1_ZOM();
				_exitAlt();
				}
				break;
			case MT_termList:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1538);
				match(MT_termList);
				}
				break;
			case ET_termList:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1540);
				match(ET_termList);
				setState(1541);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermList_EOFContext extends ParserRuleContext {
		public TermListContext termList() {
			return getRuleContext(TermListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public TermList_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termList_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterTermList_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitTermList_EOF(this);
		}
	}

	public final TermList_EOFContext termList_EOF() throws RecognitionException {
		TermList_EOFContext _localctx = new TermList_EOFContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_termList_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1544);
			termList();
			setState(1545);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermList_S1_ZOMContext extends ParserRuleContext {
		public List<TermList_S1Context> termList_S1() {
			return getRuleContexts(TermList_S1Context.class);
		}
		public TermList_S1Context termList_S1(int i) {
			return getRuleContext(TermList_S1Context.class,i);
		}
		public TerminalNode MT_termList_S1_ZOM() { return getToken(CrsxMetaParser.MT_termList_S1_ZOM, 0); }
		public TerminalNode ET_termList_S1_ZOM() { return getToken(CrsxMetaParser.ET_termList_S1_ZOM, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public TermList_S1_ZOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termList_S1_ZOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterTermList_S1_ZOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitTermList_S1_ZOM(this);
		}
	}

	public final TermList_S1_ZOMContext termList_S1_ZOM() throws RecognitionException {
		TermList_S1_ZOMContext _localctx = new TermList_S1_ZOMContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_termList_S1_ZOM);
		int _la;
		try {
			setState(1572);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterZOM();
				setState(1552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MT_semi_TOK || _la==ET_semi_TOK || _la==MT_termList_S1 || _la==ET_termList_S1 || _la==SEMI) {
					{
					{
					setState(1549);
					termList_S1();
					}
					}
					setState(1554);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1563);
				_la = _input.LA(1);
				if (_la==MT_termList_S1_ZOM || _la==ET_termList_S1_ZOM) {
					{
					_tail();
					setState(1561);
					switch (_input.LA(1)) {
					case MT_termList_S1_ZOM:
						{
						_term();
						setState(1557);
						match(MT_termList_S1_ZOM);
						}
						break;
					case ET_termList_S1_ZOM:
						{
						_embed();
						setState(1559);
						match(ET_termList_S1_ZOM);
						setState(1560);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitZOM();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1568);
				match(MT_termList_S1_ZOM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1570);
				match(ET_termList_S1_ZOM);
				setState(1571);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermList_S1_ZOM_EOFContext extends ParserRuleContext {
		public TermList_S1_ZOMContext termList_S1_ZOM() {
			return getRuleContext(TermList_S1_ZOMContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public TermList_S1_ZOM_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termList_S1_ZOM_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterTermList_S1_ZOM_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitTermList_S1_ZOM_EOF(this);
		}
	}

	public final TermList_S1_ZOM_EOFContext termList_S1_ZOM_EOF() throws RecognitionException {
		TermList_S1_ZOM_EOFContext _localctx = new TermList_S1_ZOM_EOFContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_termList_S1_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
			termList_S1_ZOM();
			setState(1575);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermList_S1Context extends ParserRuleContext {
		public Semi_TOKContext semi_TOK() {
			return getRuleContext(Semi_TOKContext.class,0);
		}
		public Term_OPTContext term_OPT() {
			return getRuleContext(Term_OPTContext.class,0);
		}
		public TerminalNode MT_termList_S1() { return getToken(CrsxMetaParser.MT_termList_S1, 0); }
		public TerminalNode ET_termList_S1() { return getToken(CrsxMetaParser.ET_termList_S1, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public TermList_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termList_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterTermList_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitTermList_S1(this);
		}
	}

	public final TermList_S1Context termList_S1() throws RecognitionException {
		TermList_S1Context _localctx = new TermList_S1Context(_ctx, getState());
		enterRule(_localctx, 220, RULE_termList_S1);
		try {
			setState(1587);
			switch (_input.LA(1)) {
			case MT_semi_TOK:
			case ET_semi_TOK:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1578);
				semi_TOK();
				setState(1579);
				term_OPT();
				_exitAlt();
				}
				break;
			case MT_termList_S1:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1583);
				match(MT_termList_S1);
				}
				break;
			case ET_termList_S1:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1585);
				match(ET_termList_S1);
				setState(1586);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermList_S1_EOFContext extends ParserRuleContext {
		public TermList_S1Context termList_S1() {
			return getRuleContext(TermList_S1Context.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public TermList_S1_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termList_S1_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterTermList_S1_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitTermList_S1_EOF(this);
		}
	}

	public final TermList_S1_EOFContext termList_S1_EOF() throws RecognitionException {
		TermList_S1_EOFContext _localctx = new TermList_S1_EOFContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_termList_S1_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1589);
			termList_S1();
			setState(1590);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Term_OPTContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MT_term_OPT() { return getToken(CrsxMetaParser.MT_term_OPT, 0); }
		public TerminalNode ET_term_OPT() { return getToken(CrsxMetaParser.ET_term_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Term_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterTerm_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitTerm_OPT(this);
		}
	}

	public final Term_OPTContext term_OPT() throws RecognitionException {
		Term_OPTContext _localctx = new Term_OPTContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_term_OPT);
		int _la;
		try {
			setState(1614);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1595);
				_la = _input.LA(1);
				if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (MT_constructor_TOK - 19)) | (1L << (ET_constructor_TOK - 19)) | (1L << (MT_lbrace_TOK - 19)) | (1L << (ET_lbrace_TOK - 19)) | (1L << (MT_colon_TOK - 19)) | (1L << (ET_colon_TOK - 19)) | (1L << (MT_properties_OPT - 19)) | (1L << (ET_properties_OPT - 19)) | (1L << (MT_annotations - 19)) | (1L << (ET_annotations - 19)) | (1L << (MT_annotation_OOM - 19)) | (1L << (ET_annotation_OOM - 19)) | (1L << (MT_annotation - 19)) | (1L << (ET_annotation - 19)) | (1L << (MT_at_TOK - 19)) | (1L << (ET_at_TOK - 19)) | (1L << (MT_term - 19)) | (1L << (ET_term - 19)) | (1L << (MT_freeTerm - 19)) | (1L << (ET_freeTerm - 19)) | (1L << (MT_annotations_OPT - 19)) | (1L << (ET_annotations_OPT - 19)) | (1L << (MT_metavar_TOK - 19)) | (1L << (ET_metavar_TOK - 19)) | (1L << (MT_boundTerm - 19)) | (1L << (ET_boundTerm - 19)))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (MT_list - 99)) | (1L << (ET_list - 99)) | (1L << (MT_lpar_TOK - 99)) | (1L << (ET_lpar_TOK - 99)) | (1L << (MT_variable - 99)) | (1L << (ET_variable - 99)) | (1L << (MT_linear_OPT - 99)) | (1L << (ET_linear_OPT - 99)) | (1L << (MT_variable_TOK - 99)) | (1L << (ET_variable_TOK - 99)) | (1L << (MT_linear - 99)) | (1L << (ET_linear - 99)) | (1L << (MT_linear_TOK - 99)) | (1L << (ET_linear_TOK - 99)) | (1L << (MT_literal - 99)) | (1L << (ET_literal - 99)) | (1L << (MT_string_TOK - 99)) | (1L << (ET_string_TOK - 99)) | (1L << (MT_number_TOK - 99)) | (1L << (ET_number_TOK - 99)) | (1L << (MT_binder - 99)) | (1L << (ET_binder - 99)) | (1L << (MT_concrete - 99)) | (1L << (ET_concrete - 99)) | (1L << (MT_category_TOK - 99)) | (1L << (ET_category_TOK - 99)) | (1L << (MT_dispatch - 99)) | (1L << (ET_dispatch - 99)) | (1L << (MT_dispatch_TOK - 99)) | (1L << (ET_dispatch_TOK - 99)))) != 0) || ((((_la - 177)) & ~0x3f) == 0 && ((1L << (_la - 177)) & ((1L << (MT_properties - 177)) | (1L << (ET_properties - 177)) | (1L << (MT_expression - 177)) | (1L << (ET_expression - 177)) | (1L << (MT_constructor - 177)) | (1L << (ET_constructor - 177)) | (1L << (MT_qualifier - 177)) | (1L << (ET_qualifier - 177)) | (1L << (MT_reserved - 177)) | (1L << (ET_reserved - 177)))) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & ((1L << (DISPATCH - 257)) | (1L << (COLON - 257)) | (1L << (LPAR - 257)) | (1L << (LBRACE - 257)) | (1L << (LINEAR - 257)) | (1L << (AT - 257)) | (1L << (CATEGORY - 257)) | (1L << (CONSTRUCTOR - 257)) | (1L << (VARIABLE - 257)) | (1L << (METAVAR - 257)) | (1L << (STRING - 257)) | (1L << (NUMBER - 257)))) != 0)) {
					{
					setState(1594);
					term();
					}
				}

				setState(1605);
				_la = _input.LA(1);
				if (_la==MT_term_OPT || _la==ET_term_OPT) {
					{
					_tail();
					setState(1603);
					switch (_input.LA(1)) {
					case MT_term_OPT:
						{
						_term();
						setState(1599);
						match(MT_term_OPT);
						}
						break;
					case ET_term_OPT:
						{
						_embed();
						setState(1601);
						match(ET_term_OPT);
						setState(1602);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitOPT();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1610);
				match(MT_term_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1612);
				match(ET_term_OPT);
				setState(1613);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Term_OPT_EOFContext extends ParserRuleContext {
		public Term_OPTContext term_OPT() {
			return getRuleContext(Term_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Term_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterTerm_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitTerm_OPT_EOF(this);
		}
	}

	public final Term_OPT_EOFContext term_OPT_EOF() throws RecognitionException {
		Term_OPT_EOFContext _localctx = new Term_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_term_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1616);
			term_OPT();
			setState(1617);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public List<Linear_OPTContext> linear_OPT() {
			return getRuleContexts(Linear_OPTContext.class);
		}
		public Linear_OPTContext linear_OPT(int i) {
			return getRuleContext(Linear_OPTContext.class,i);
		}
		public Variable_TOKContext variable_TOK() {
			return getRuleContext(Variable_TOKContext.class,0);
		}
		public Functional_OPTContext functional_OPT() {
			return getRuleContext(Functional_OPTContext.class,0);
		}
		public Varsort_OPTContext varsort_OPT() {
			return getRuleContext(Varsort_OPTContext.class,0);
		}
		public TerminalNode MT_variable() { return getToken(CrsxMetaParser.MT_variable, 0); }
		public TerminalNode ET_variable() { return getToken(CrsxMetaParser.ET_variable, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_variable);
		try {
			setState(1632);
			switch (_input.LA(1)) {
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
			case MT_linear_TOK:
			case ET_linear_TOK:
			case LINEAR:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1620);
				linear_OPT();
				setState(1621);
				variable_TOK();
				setState(1622);
				linear_OPT();
				setState(1623);
				functional_OPT();
				setState(1624);
				varsort_OPT();
				_exitAlt();
				}
				break;
			case MT_variable:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1628);
				match(MT_variable);
				}
				break;
			case ET_variable:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1630);
				match(ET_variable);
				setState(1631);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_EOFContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Variable_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterVariable_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitVariable_EOF(this);
		}
	}

	public final Variable_EOFContext variable_EOF() throws RecognitionException {
		Variable_EOFContext _localctx = new Variable_EOFContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_variable_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634);
			variable();
			setState(1635);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Linear_OPTContext extends ParserRuleContext {
		public LinearContext linear() {
			return getRuleContext(LinearContext.class,0);
		}
		public TerminalNode MT_linear_OPT() { return getToken(CrsxMetaParser.MT_linear_OPT, 0); }
		public TerminalNode ET_linear_OPT() { return getToken(CrsxMetaParser.ET_linear_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Linear_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linear_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterLinear_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitLinear_OPT(this);
		}
	}

	public final Linear_OPTContext linear_OPT() throws RecognitionException {
		Linear_OPTContext _localctx = new Linear_OPTContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_linear_OPT);
		try {
			setState(1659);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1640);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(1639);
					linear();
					}
					break;
				}
				setState(1650);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					_tail();
					setState(1648);
					switch (_input.LA(1)) {
					case MT_linear_OPT:
						{
						_term();
						setState(1644);
						match(MT_linear_OPT);
						}
						break;
					case ET_linear_OPT:
						{
						_embed();
						setState(1646);
						match(ET_linear_OPT);
						setState(1647);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				_exitOPT();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1655);
				match(MT_linear_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1657);
				match(ET_linear_OPT);
				setState(1658);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Linear_OPT_EOFContext extends ParserRuleContext {
		public Linear_OPTContext linear_OPT() {
			return getRuleContext(Linear_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Linear_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linear_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterLinear_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitLinear_OPT_EOF(this);
		}
	}

	public final Linear_OPT_EOFContext linear_OPT_EOF() throws RecognitionException {
		Linear_OPT_EOFContext _localctx = new Linear_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_linear_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1661);
			linear_OPT();
			setState(1662);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_TOKContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(CrsxMetaParser.VARIABLE, 0); }
		public TerminalNode MT_variable_TOK() { return getToken(CrsxMetaParser.MT_variable_TOK, 0); }
		public TerminalNode ET_variable_TOK() { return getToken(CrsxMetaParser.ET_variable_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Variable_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterVariable_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitVariable_TOK(this);
		}
	}

	public final Variable_TOKContext variable_TOK() throws RecognitionException {
		Variable_TOKContext _localctx = new Variable_TOKContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_variable_TOK);
		try {
			setState(1672);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1665);
				match(VARIABLE);

				}
				break;
			case MT_variable_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1668);
				match(MT_variable_TOK);
				}
				break;
			case ET_variable_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1670);
				match(ET_variable_TOK);
				setState(1671);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_TOK_EOFContext extends ParserRuleContext {
		public Variable_TOKContext variable_TOK() {
			return getRuleContext(Variable_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Variable_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterVariable_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitVariable_TOK_EOF(this);
		}
	}

	public final Variable_TOK_EOFContext variable_TOK_EOF() throws RecognitionException {
		Variable_TOK_EOFContext _localctx = new Variable_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_variable_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1674);
			variable_TOK();
			setState(1675);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Functional_OPTContext extends ParserRuleContext {
		public FunctionalContext functional() {
			return getRuleContext(FunctionalContext.class,0);
		}
		public TerminalNode MT_functional_OPT() { return getToken(CrsxMetaParser.MT_functional_OPT, 0); }
		public TerminalNode ET_functional_OPT() { return getToken(CrsxMetaParser.ET_functional_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Functional_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functional_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterFunctional_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitFunctional_OPT(this);
		}
	}

	public final Functional_OPTContext functional_OPT() throws RecognitionException {
		Functional_OPTContext _localctx = new Functional_OPTContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_functional_OPT);
		int _la;
		try {
			setState(1699);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1680);
				_la = _input.LA(1);
				if (((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (MT_functional - 129)) | (1L << (ET_functional - 129)) | (1L << (MT_functional_TOK - 129)) | (1L << (ET_functional_TOK - 129)))) != 0) || _la==FUNCTIONAL) {
					{
					setState(1679);
					functional();
					}
				}

				setState(1690);
				_la = _input.LA(1);
				if (_la==MT_functional_OPT || _la==ET_functional_OPT) {
					{
					_tail();
					setState(1688);
					switch (_input.LA(1)) {
					case MT_functional_OPT:
						{
						_term();
						setState(1684);
						match(MT_functional_OPT);
						}
						break;
					case ET_functional_OPT:
						{
						_embed();
						setState(1686);
						match(ET_functional_OPT);
						setState(1687);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitOPT();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1695);
				match(MT_functional_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1697);
				match(ET_functional_OPT);
				setState(1698);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Functional_OPT_EOFContext extends ParserRuleContext {
		public Functional_OPTContext functional_OPT() {
			return getRuleContext(Functional_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Functional_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functional_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterFunctional_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitFunctional_OPT_EOF(this);
		}
	}

	public final Functional_OPT_EOFContext functional_OPT_EOF() throws RecognitionException {
		Functional_OPT_EOFContext _localctx = new Functional_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_functional_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
			functional_OPT();
			setState(1702);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Varsort_OPTContext extends ParserRuleContext {
		public VarsortContext varsort() {
			return getRuleContext(VarsortContext.class,0);
		}
		public TerminalNode MT_varsort_OPT() { return getToken(CrsxMetaParser.MT_varsort_OPT, 0); }
		public TerminalNode ET_varsort_OPT() { return getToken(CrsxMetaParser.ET_varsort_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Varsort_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varsort_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterVarsort_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitVarsort_OPT(this);
		}
	}

	public final Varsort_OPTContext varsort_OPT() throws RecognitionException {
		Varsort_OPTContext _localctx = new Varsort_OPTContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_varsort_OPT);
		try {
			setState(1726);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1707);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(1706);
					varsort();
					}
					break;
				}
				setState(1717);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					_tail();
					setState(1715);
					switch (_input.LA(1)) {
					case MT_varsort_OPT:
						{
						_term();
						setState(1711);
						match(MT_varsort_OPT);
						}
						break;
					case ET_varsort_OPT:
						{
						_embed();
						setState(1713);
						match(ET_varsort_OPT);
						setState(1714);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				_exitOPT();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1722);
				match(MT_varsort_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1724);
				match(ET_varsort_OPT);
				setState(1725);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Varsort_OPT_EOFContext extends ParserRuleContext {
		public Varsort_OPTContext varsort_OPT() {
			return getRuleContext(Varsort_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Varsort_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varsort_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterVarsort_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitVarsort_OPT_EOF(this);
		}
	}

	public final Varsort_OPT_EOFContext varsort_OPT_EOF() throws RecognitionException {
		Varsort_OPT_EOFContext _localctx = new Varsort_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_varsort_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1728);
			varsort_OPT();
			setState(1729);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinearContext extends ParserRuleContext {
		public Linear_TOKContext linear_TOK() {
			return getRuleContext(Linear_TOKContext.class,0);
		}
		public TerminalNode MT_linear() { return getToken(CrsxMetaParser.MT_linear, 0); }
		public TerminalNode ET_linear() { return getToken(CrsxMetaParser.ET_linear, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public LinearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linear; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterLinear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitLinear(this);
		}
	}

	public final LinearContext linear() throws RecognitionException {
		LinearContext _localctx = new LinearContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_linear);
		try {
			setState(1740);
			switch (_input.LA(1)) {
			case MT_linear_TOK:
			case ET_linear_TOK:
			case LINEAR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1732);
				linear_TOK();
				_exitAlt();
				}
				break;
			case MT_linear:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1736);
				match(MT_linear);
				}
				break;
			case ET_linear:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1738);
				match(ET_linear);
				setState(1739);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Linear_EOFContext extends ParserRuleContext {
		public LinearContext linear() {
			return getRuleContext(LinearContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Linear_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linear_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterLinear_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitLinear_EOF(this);
		}
	}

	public final Linear_EOFContext linear_EOF() throws RecognitionException {
		Linear_EOFContext _localctx = new Linear_EOFContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_linear_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1742);
			linear();
			setState(1743);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Linear_TOKContext extends ParserRuleContext {
		public TerminalNode LINEAR() { return getToken(CrsxMetaParser.LINEAR, 0); }
		public TerminalNode MT_linear_TOK() { return getToken(CrsxMetaParser.MT_linear_TOK, 0); }
		public TerminalNode ET_linear_TOK() { return getToken(CrsxMetaParser.ET_linear_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Linear_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linear_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterLinear_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitLinear_TOK(this);
		}
	}

	public final Linear_TOKContext linear_TOK() throws RecognitionException {
		Linear_TOKContext _localctx = new Linear_TOKContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_linear_TOK);
		try {
			setState(1753);
			switch (_input.LA(1)) {
			case LINEAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1746);
				match(LINEAR);

				}
				break;
			case MT_linear_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1749);
				match(MT_linear_TOK);
				}
				break;
			case ET_linear_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1751);
				match(ET_linear_TOK);
				setState(1752);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Linear_TOK_EOFContext extends ParserRuleContext {
		public Linear_TOKContext linear_TOK() {
			return getRuleContext(Linear_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Linear_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linear_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterLinear_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitLinear_TOK_EOF(this);
		}
	}

	public final Linear_TOK_EOFContext linear_TOK_EOF() throws RecognitionException {
		Linear_TOK_EOFContext _localctx = new Linear_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_linear_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			linear_TOK();
			setState(1756);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionalContext extends ParserRuleContext {
		public Functional_TOKContext functional_TOK() {
			return getRuleContext(Functional_TOKContext.class,0);
		}
		public TerminalNode MT_functional() { return getToken(CrsxMetaParser.MT_functional, 0); }
		public TerminalNode ET_functional() { return getToken(CrsxMetaParser.ET_functional, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public FunctionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterFunctional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitFunctional(this);
		}
	}

	public final FunctionalContext functional() throws RecognitionException {
		FunctionalContext _localctx = new FunctionalContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_functional);
		try {
			setState(1767);
			switch (_input.LA(1)) {
			case MT_functional_TOK:
			case ET_functional_TOK:
			case FUNCTIONAL:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1759);
				functional_TOK();
				_exitAlt();
				}
				break;
			case MT_functional:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1763);
				match(MT_functional);
				}
				break;
			case ET_functional:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1765);
				match(ET_functional);
				setState(1766);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Functional_EOFContext extends ParserRuleContext {
		public FunctionalContext functional() {
			return getRuleContext(FunctionalContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Functional_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functional_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterFunctional_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitFunctional_EOF(this);
		}
	}

	public final Functional_EOFContext functional_EOF() throws RecognitionException {
		Functional_EOFContext _localctx = new Functional_EOFContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_functional_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1769);
			functional();
			setState(1770);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Functional_TOKContext extends ParserRuleContext {
		public TerminalNode FUNCTIONAL() { return getToken(CrsxMetaParser.FUNCTIONAL, 0); }
		public TerminalNode MT_functional_TOK() { return getToken(CrsxMetaParser.MT_functional_TOK, 0); }
		public TerminalNode ET_functional_TOK() { return getToken(CrsxMetaParser.ET_functional_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Functional_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functional_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterFunctional_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitFunctional_TOK(this);
		}
	}

	public final Functional_TOKContext functional_TOK() throws RecognitionException {
		Functional_TOKContext _localctx = new Functional_TOKContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_functional_TOK);
		try {
			setState(1780);
			switch (_input.LA(1)) {
			case FUNCTIONAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1773);
				match(FUNCTIONAL);

				}
				break;
			case MT_functional_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1776);
				match(MT_functional_TOK);
				}
				break;
			case ET_functional_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1778);
				match(ET_functional_TOK);
				setState(1779);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Functional_TOK_EOFContext extends ParserRuleContext {
		public Functional_TOKContext functional_TOK() {
			return getRuleContext(Functional_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Functional_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functional_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterFunctional_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitFunctional_TOK_EOF(this);
		}
	}

	public final Functional_TOK_EOFContext functional_TOK_EOF() throws RecognitionException {
		Functional_TOK_EOFContext _localctx = new Functional_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_functional_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1782);
			functional_TOK();
			setState(1783);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public String_TOKContext string_TOK() {
			return getRuleContext(String_TOKContext.class,0);
		}
		public Number_TOKContext number_TOK() {
			return getRuleContext(Number_TOKContext.class,0);
		}
		public TerminalNode MT_literal() { return getToken(CrsxMetaParser.MT_literal, 0); }
		public TerminalNode ET_literal() { return getToken(CrsxMetaParser.ET_literal, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_literal);
		try {
			setState(1798);
			switch (_input.LA(1)) {
			case MT_string_TOK:
			case ET_string_TOK:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(1786);
				string_TOK();
				_exitAlt();
				}
				break;
			case MT_number_TOK:
			case ET_number_TOK:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(1790);
				number_TOK();
				_exitAlt();
				}
				break;
			case MT_literal:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(1794);
				match(MT_literal);
				}
				break;
			case ET_literal:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(1796);
				match(ET_literal);
				setState(1797);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_EOFContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Literal_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterLiteral_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitLiteral_EOF(this);
		}
	}

	public final Literal_EOFContext literal_EOF() throws RecognitionException {
		Literal_EOFContext _localctx = new Literal_EOFContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_literal_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1800);
			literal();
			setState(1801);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_TOKContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CrsxMetaParser.STRING, 0); }
		public TerminalNode MT_string_TOK() { return getToken(CrsxMetaParser.MT_string_TOK, 0); }
		public TerminalNode ET_string_TOK() { return getToken(CrsxMetaParser.ET_string_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public String_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterString_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitString_TOK(this);
		}
	}

	public final String_TOKContext string_TOK() throws RecognitionException {
		String_TOKContext _localctx = new String_TOKContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_string_TOK);
		try {
			setState(1811);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1804);
				match(STRING);

				}
				break;
			case MT_string_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1807);
				match(MT_string_TOK);
				}
				break;
			case ET_string_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1809);
				match(ET_string_TOK);
				setState(1810);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_TOK_EOFContext extends ParserRuleContext {
		public String_TOKContext string_TOK() {
			return getRuleContext(String_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public String_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterString_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitString_TOK_EOF(this);
		}
	}

	public final String_TOK_EOFContext string_TOK_EOF() throws RecognitionException {
		String_TOK_EOFContext _localctx = new String_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_string_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1813);
			string_TOK();
			setState(1814);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number_TOKContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(CrsxMetaParser.NUMBER, 0); }
		public TerminalNode MT_number_TOK() { return getToken(CrsxMetaParser.MT_number_TOK, 0); }
		public TerminalNode ET_number_TOK() { return getToken(CrsxMetaParser.ET_number_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Number_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterNumber_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitNumber_TOK(this);
		}
	}

	public final Number_TOKContext number_TOK() throws RecognitionException {
		Number_TOKContext _localctx = new Number_TOKContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_number_TOK);
		try {
			setState(1824);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1817);
				match(NUMBER);

				}
				break;
			case MT_number_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1820);
				match(MT_number_TOK);
				}
				break;
			case ET_number_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1822);
				match(ET_number_TOK);
				setState(1823);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number_TOK_EOFContext extends ParserRuleContext {
		public Number_TOKContext number_TOK() {
			return getRuleContext(Number_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Number_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterNumber_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitNumber_TOK_EOF(this);
		}
	}

	public final Number_TOK_EOFContext number_TOK_EOF() throws RecognitionException {
		Number_TOK_EOFContext _localctx = new Number_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_number_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1826);
			number_TOK();
			setState(1827);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinderContext extends ParserRuleContext {
		public Annotations_OPTContext annotations_OPT() {
			return getRuleContext(Annotations_OPTContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode MT_binder() { return getToken(CrsxMetaParser.MT_binder, 0); }
		public TerminalNode ET_binder() { return getToken(CrsxMetaParser.ET_binder, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public BinderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterBinder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitBinder(this);
		}
	}

	public final BinderContext binder() throws RecognitionException {
		BinderContext _localctx = new BinderContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_binder);
		try {
			setState(1839);
			switch (_input.LA(1)) {
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
			case MT_at_TOK:
			case ET_at_TOK:
			case MT_annotations_OPT:
			case ET_annotations_OPT:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
			case MT_linear_TOK:
			case ET_linear_TOK:
			case LINEAR:
			case AT:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1830);
				annotations_OPT();
				setState(1831);
				variable();
				_exitAlt();
				}
				break;
			case MT_binder:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1835);
				match(MT_binder);
				}
				break;
			case ET_binder:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1837);
				match(ET_binder);
				setState(1838);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binder_EOFContext extends ParserRuleContext {
		public BinderContext binder() {
			return getRuleContext(BinderContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Binder_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binder_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterBinder_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitBinder_EOF(this);
		}
	}

	public final Binder_EOFContext binder_EOF() throws RecognitionException {
		Binder_EOFContext _localctx = new Binder_EOFContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_binder_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1841);
			binder();
			setState(1842);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarsortContext extends ParserRuleContext {
		public Coloncolon_TOKContext coloncolon_TOK() {
			return getRuleContext(Coloncolon_TOKContext.class,0);
		}
		public SortnameContext sortname() {
			return getRuleContext(SortnameContext.class,0);
		}
		public TerminalNode MT_varsort() { return getToken(CrsxMetaParser.MT_varsort, 0); }
		public TerminalNode ET_varsort() { return getToken(CrsxMetaParser.ET_varsort, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public VarsortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varsort; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterVarsort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitVarsort(this);
		}
	}

	public final VarsortContext varsort() throws RecognitionException {
		VarsortContext _localctx = new VarsortContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_varsort);
		try {
			setState(1854);
			switch (_input.LA(1)) {
			case MT_coloncolon_TOK:
			case ET_coloncolon_TOK:
			case COLONCOLON:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1845);
				coloncolon_TOK();
				setState(1846);
				sortname();
				_exitAlt();
				}
				break;
			case MT_varsort:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1850);
				match(MT_varsort);
				}
				break;
			case ET_varsort:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1852);
				match(ET_varsort);
				setState(1853);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Varsort_EOFContext extends ParserRuleContext {
		public VarsortContext varsort() {
			return getRuleContext(VarsortContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Varsort_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varsort_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterVarsort_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitVarsort_EOF(this);
		}
	}

	public final Varsort_EOFContext varsort_EOF() throws RecognitionException {
		Varsort_EOFContext _localctx = new Varsort_EOFContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_varsort_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1856);
			varsort();
			setState(1857);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Coloncolon_TOKContext extends ParserRuleContext {
		public TerminalNode COLONCOLON() { return getToken(CrsxMetaParser.COLONCOLON, 0); }
		public TerminalNode MT_coloncolon_TOK() { return getToken(CrsxMetaParser.MT_coloncolon_TOK, 0); }
		public TerminalNode ET_coloncolon_TOK() { return getToken(CrsxMetaParser.ET_coloncolon_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Coloncolon_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coloncolon_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterColoncolon_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitColoncolon_TOK(this);
		}
	}

	public final Coloncolon_TOKContext coloncolon_TOK() throws RecognitionException {
		Coloncolon_TOKContext _localctx = new Coloncolon_TOKContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_coloncolon_TOK);
		try {
			setState(1867);
			switch (_input.LA(1)) {
			case COLONCOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1860);
				match(COLONCOLON);

				}
				break;
			case MT_coloncolon_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1863);
				match(MT_coloncolon_TOK);
				}
				break;
			case ET_coloncolon_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1865);
				match(ET_coloncolon_TOK);
				setState(1866);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Coloncolon_TOK_EOFContext extends ParserRuleContext {
		public Coloncolon_TOKContext coloncolon_TOK() {
			return getRuleContext(Coloncolon_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Coloncolon_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coloncolon_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterColoncolon_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitColoncolon_TOK_EOF(this);
		}
	}

	public final Coloncolon_TOK_EOFContext coloncolon_TOK_EOF() throws RecognitionException {
		Coloncolon_TOK_EOFContext _localctx = new Coloncolon_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_coloncolon_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1869);
			coloncolon_TOK();
			setState(1870);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConcreteContext extends ParserRuleContext {
		public Category_TOKContext category_TOK() {
			return getRuleContext(Category_TOKContext.class,0);
		}
		public Concrete_TOKContext concrete_TOK() {
			return getRuleContext(Concrete_TOKContext.class,0);
		}
		public Concrete2_TOKContext concrete2_TOK() {
			return getRuleContext(Concrete2_TOKContext.class,0);
		}
		public Concrete3_TOKContext concrete3_TOK() {
			return getRuleContext(Concrete3_TOKContext.class,0);
		}
		public Concrete4_TOKContext concrete4_TOK() {
			return getRuleContext(Concrete4_TOKContext.class,0);
		}
		public TerminalNode MT_concrete() { return getToken(CrsxMetaParser.MT_concrete, 0); }
		public TerminalNode ET_concrete() { return getToken(CrsxMetaParser.ET_concrete, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public ConcreteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concrete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterConcrete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitConcrete(this);
		}
	}

	public final ConcreteContext concrete() throws RecognitionException {
		ConcreteContext _localctx = new ConcreteContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_concrete);
		try {
			setState(1897);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(1873);
				category_TOK();
				setState(1874);
				concrete_TOK();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(1878);
				category_TOK();
				setState(1879);
				concrete2_TOK();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(1883);
				category_TOK();
				setState(1884);
				concrete3_TOK();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(1888);
				category_TOK();
				setState(1889);
				concrete4_TOK();
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_term();
				setState(1893);
				match(MT_concrete);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_embed();
				setState(1895);
				match(ET_concrete);
				setState(1896);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concrete_EOFContext extends ParserRuleContext {
		public ConcreteContext concrete() {
			return getRuleContext(ConcreteContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Concrete_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concrete_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterConcrete_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitConcrete_EOF(this);
		}
	}

	public final Concrete_EOFContext concrete_EOF() throws RecognitionException {
		Concrete_EOFContext _localctx = new Concrete_EOFContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_concrete_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1899);
			concrete();
			setState(1900);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Category_TOKContext extends ParserRuleContext {
		public TerminalNode CATEGORY() { return getToken(CrsxMetaParser.CATEGORY, 0); }
		public TerminalNode MT_category_TOK() { return getToken(CrsxMetaParser.MT_category_TOK, 0); }
		public TerminalNode ET_category_TOK() { return getToken(CrsxMetaParser.ET_category_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Category_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterCategory_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitCategory_TOK(this);
		}
	}

	public final Category_TOKContext category_TOK() throws RecognitionException {
		Category_TOKContext _localctx = new Category_TOKContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_category_TOK);
		try {
			setState(1910);
			switch (_input.LA(1)) {
			case CATEGORY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1903);
				match(CATEGORY);

				}
				break;
			case MT_category_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1906);
				match(MT_category_TOK);
				}
				break;
			case ET_category_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1908);
				match(ET_category_TOK);
				setState(1909);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Category_TOK_EOFContext extends ParserRuleContext {
		public Category_TOKContext category_TOK() {
			return getRuleContext(Category_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Category_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterCategory_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitCategory_TOK_EOF(this);
		}
	}

	public final Category_TOK_EOFContext category_TOK_EOF() throws RecognitionException {
		Category_TOK_EOFContext _localctx = new Category_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_category_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1912);
			category_TOK();
			setState(1913);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concrete_TOKContext extends ParserRuleContext {
		public TerminalNode CONCRETE() { return getToken(CrsxMetaParser.CONCRETE, 0); }
		public TerminalNode MT_concrete_TOK() { return getToken(CrsxMetaParser.MT_concrete_TOK, 0); }
		public TerminalNode ET_concrete_TOK() { return getToken(CrsxMetaParser.ET_concrete_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Concrete_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concrete_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterConcrete_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitConcrete_TOK(this);
		}
	}

	public final Concrete_TOKContext concrete_TOK() throws RecognitionException {
		Concrete_TOKContext _localctx = new Concrete_TOKContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_concrete_TOK);
		try {
			setState(1923);
			switch (_input.LA(1)) {
			case CONCRETE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1916);
				match(CONCRETE);

				}
				break;
			case MT_concrete_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1919);
				match(MT_concrete_TOK);
				}
				break;
			case ET_concrete_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1921);
				match(ET_concrete_TOK);
				setState(1922);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concrete_TOK_EOFContext extends ParserRuleContext {
		public Concrete_TOKContext concrete_TOK() {
			return getRuleContext(Concrete_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Concrete_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concrete_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterConcrete_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitConcrete_TOK_EOF(this);
		}
	}

	public final Concrete_TOK_EOFContext concrete_TOK_EOF() throws RecognitionException {
		Concrete_TOK_EOFContext _localctx = new Concrete_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_concrete_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1925);
			concrete_TOK();
			setState(1926);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concrete2_TOKContext extends ParserRuleContext {
		public TerminalNode CONCRETE2() { return getToken(CrsxMetaParser.CONCRETE2, 0); }
		public TerminalNode MT_concrete2_TOK() { return getToken(CrsxMetaParser.MT_concrete2_TOK, 0); }
		public TerminalNode ET_concrete2_TOK() { return getToken(CrsxMetaParser.ET_concrete2_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Concrete2_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concrete2_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterConcrete2_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitConcrete2_TOK(this);
		}
	}

	public final Concrete2_TOKContext concrete2_TOK() throws RecognitionException {
		Concrete2_TOKContext _localctx = new Concrete2_TOKContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_concrete2_TOK);
		try {
			setState(1936);
			switch (_input.LA(1)) {
			case CONCRETE2:
				enterOuterAlt(_localctx, 1);
				{
				setState(1929);
				match(CONCRETE2);

				}
				break;
			case MT_concrete2_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1932);
				match(MT_concrete2_TOK);
				}
				break;
			case ET_concrete2_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1934);
				match(ET_concrete2_TOK);
				setState(1935);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concrete2_TOK_EOFContext extends ParserRuleContext {
		public Concrete2_TOKContext concrete2_TOK() {
			return getRuleContext(Concrete2_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Concrete2_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concrete2_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterConcrete2_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitConcrete2_TOK_EOF(this);
		}
	}

	public final Concrete2_TOK_EOFContext concrete2_TOK_EOF() throws RecognitionException {
		Concrete2_TOK_EOFContext _localctx = new Concrete2_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_concrete2_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1938);
			concrete2_TOK();
			setState(1939);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concrete3_TOKContext extends ParserRuleContext {
		public TerminalNode CONCRETE3() { return getToken(CrsxMetaParser.CONCRETE3, 0); }
		public TerminalNode MT_concrete3_TOK() { return getToken(CrsxMetaParser.MT_concrete3_TOK, 0); }
		public TerminalNode ET_concrete3_TOK() { return getToken(CrsxMetaParser.ET_concrete3_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Concrete3_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concrete3_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterConcrete3_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitConcrete3_TOK(this);
		}
	}

	public final Concrete3_TOKContext concrete3_TOK() throws RecognitionException {
		Concrete3_TOKContext _localctx = new Concrete3_TOKContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_concrete3_TOK);
		try {
			setState(1949);
			switch (_input.LA(1)) {
			case CONCRETE3:
				enterOuterAlt(_localctx, 1);
				{
				setState(1942);
				match(CONCRETE3);

				}
				break;
			case MT_concrete3_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1945);
				match(MT_concrete3_TOK);
				}
				break;
			case ET_concrete3_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1947);
				match(ET_concrete3_TOK);
				setState(1948);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concrete3_TOK_EOFContext extends ParserRuleContext {
		public Concrete3_TOKContext concrete3_TOK() {
			return getRuleContext(Concrete3_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Concrete3_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concrete3_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterConcrete3_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitConcrete3_TOK_EOF(this);
		}
	}

	public final Concrete3_TOK_EOFContext concrete3_TOK_EOF() throws RecognitionException {
		Concrete3_TOK_EOFContext _localctx = new Concrete3_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_concrete3_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1951);
			concrete3_TOK();
			setState(1952);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concrete4_TOKContext extends ParserRuleContext {
		public TerminalNode CONCRETE4() { return getToken(CrsxMetaParser.CONCRETE4, 0); }
		public TerminalNode MT_concrete4_TOK() { return getToken(CrsxMetaParser.MT_concrete4_TOK, 0); }
		public TerminalNode ET_concrete4_TOK() { return getToken(CrsxMetaParser.ET_concrete4_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Concrete4_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concrete4_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterConcrete4_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitConcrete4_TOK(this);
		}
	}

	public final Concrete4_TOKContext concrete4_TOK() throws RecognitionException {
		Concrete4_TOKContext _localctx = new Concrete4_TOKContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_concrete4_TOK);
		try {
			setState(1962);
			switch (_input.LA(1)) {
			case CONCRETE4:
				enterOuterAlt(_localctx, 1);
				{
				setState(1955);
				match(CONCRETE4);

				}
				break;
			case MT_concrete4_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1958);
				match(MT_concrete4_TOK);
				}
				break;
			case ET_concrete4_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1960);
				match(ET_concrete4_TOK);
				setState(1961);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concrete4_TOK_EOFContext extends ParserRuleContext {
		public Concrete4_TOKContext concrete4_TOK() {
			return getRuleContext(Concrete4_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Concrete4_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concrete4_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterConcrete4_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitConcrete4_TOK_EOF(this);
		}
	}

	public final Concrete4_TOK_EOFContext concrete4_TOK_EOF() throws RecognitionException {
		Concrete4_TOK_EOFContext _localctx = new Concrete4_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_concrete4_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1964);
			concrete4_TOK();
			setState(1965);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DispatchContext extends ParserRuleContext {
		public Dispatch_TOKContext dispatch_TOK() {
			return getRuleContext(Dispatch_TOKContext.class,0);
		}
		public DispatchTermContext dispatchTerm() {
			return getRuleContext(DispatchTermContext.class,0);
		}
		public DispatchCasesContext dispatchCases() {
			return getRuleContext(DispatchCasesContext.class,0);
		}
		public DelayCase_OPTContext delayCase_OPT() {
			return getRuleContext(DelayCase_OPTContext.class,0);
		}
		public TerminalNode MT_dispatch() { return getToken(CrsxMetaParser.MT_dispatch, 0); }
		public TerminalNode ET_dispatch() { return getToken(CrsxMetaParser.ET_dispatch, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public DispatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDispatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDispatch(this);
		}
	}

	public final DispatchContext dispatch() throws RecognitionException {
		DispatchContext _localctx = new DispatchContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_dispatch);
		try {
			setState(1979);
			switch (_input.LA(1)) {
			case MT_dispatch_TOK:
			case ET_dispatch_TOK:
			case DISPATCH:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1968);
				dispatch_TOK();
				setState(1969);
				dispatchTerm();
				setState(1970);
				dispatchCases();
				setState(1971);
				delayCase_OPT();
				_exitAlt();
				}
				break;
			case MT_dispatch:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1975);
				match(MT_dispatch);
				}
				break;
			case ET_dispatch:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1977);
				match(ET_dispatch);
				setState(1978);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dispatch_EOFContext extends ParserRuleContext {
		public DispatchContext dispatch() {
			return getRuleContext(DispatchContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Dispatch_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatch_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDispatch_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDispatch_EOF(this);
		}
	}

	public final Dispatch_EOFContext dispatch_EOF() throws RecognitionException {
		Dispatch_EOFContext _localctx = new Dispatch_EOFContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_dispatch_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1981);
			dispatch();
			setState(1982);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dispatch_TOKContext extends ParserRuleContext {
		public TerminalNode DISPATCH() { return getToken(CrsxMetaParser.DISPATCH, 0); }
		public TerminalNode MT_dispatch_TOK() { return getToken(CrsxMetaParser.MT_dispatch_TOK, 0); }
		public TerminalNode ET_dispatch_TOK() { return getToken(CrsxMetaParser.ET_dispatch_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Dispatch_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatch_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDispatch_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDispatch_TOK(this);
		}
	}

	public final Dispatch_TOKContext dispatch_TOK() throws RecognitionException {
		Dispatch_TOKContext _localctx = new Dispatch_TOKContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_dispatch_TOK);
		try {
			setState(1992);
			switch (_input.LA(1)) {
			case DISPATCH:
				enterOuterAlt(_localctx, 1);
				{
				setState(1985);
				match(DISPATCH);

				}
				break;
			case MT_dispatch_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1988);
				match(MT_dispatch_TOK);
				}
				break;
			case ET_dispatch_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1990);
				match(ET_dispatch_TOK);
				setState(1991);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dispatch_TOK_EOFContext extends ParserRuleContext {
		public Dispatch_TOKContext dispatch_TOK() {
			return getRuleContext(Dispatch_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Dispatch_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatch_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDispatch_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDispatch_TOK_EOF(this);
		}
	}

	public final Dispatch_TOK_EOFContext dispatch_TOK_EOF() throws RecognitionException {
		Dispatch_TOK_EOFContext _localctx = new Dispatch_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_dispatch_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1994);
			dispatch_TOK();
			setState(1995);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelayCase_OPTContext extends ParserRuleContext {
		public DelayCaseContext delayCase() {
			return getRuleContext(DelayCaseContext.class,0);
		}
		public TerminalNode MT_delayCase_OPT() { return getToken(CrsxMetaParser.MT_delayCase_OPT, 0); }
		public TerminalNode ET_delayCase_OPT() { return getToken(CrsxMetaParser.ET_delayCase_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public DelayCase_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delayCase_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDelayCase_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDelayCase_OPT(this);
		}
	}

	public final DelayCase_OPTContext delayCase_OPT() throws RecognitionException {
		DelayCase_OPTContext _localctx = new DelayCase_OPTContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_delayCase_OPT);
		try {
			setState(2019);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(2000);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1999);
					delayCase();
					}
					break;
				}
				setState(2010);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					_tail();
					setState(2008);
					switch (_input.LA(1)) {
					case MT_delayCase_OPT:
						{
						_term();
						setState(2004);
						match(MT_delayCase_OPT);
						}
						break;
					case ET_delayCase_OPT:
						{
						_embed();
						setState(2006);
						match(ET_delayCase_OPT);
						setState(2007);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				_exitOPT();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2015);
				match(MT_delayCase_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2017);
				match(ET_delayCase_OPT);
				setState(2018);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelayCase_OPT_EOFContext extends ParserRuleContext {
		public DelayCase_OPTContext delayCase_OPT() {
			return getRuleContext(DelayCase_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public DelayCase_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delayCase_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDelayCase_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDelayCase_OPT_EOF(this);
		}
	}

	public final DelayCase_OPT_EOFContext delayCase_OPT_EOF() throws RecognitionException {
		DelayCase_OPT_EOFContext _localctx = new DelayCase_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_delayCase_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2021);
			delayCase_OPT();
			setState(2022);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DispatchTermContext extends ParserRuleContext {
		public FreeTermContext freeTerm() {
			return getRuleContext(FreeTermContext.class,0);
		}
		public TerminalNode MT_dispatchTerm() { return getToken(CrsxMetaParser.MT_dispatchTerm, 0); }
		public TerminalNode ET_dispatchTerm() { return getToken(CrsxMetaParser.ET_dispatchTerm, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public DispatchTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatchTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDispatchTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDispatchTerm(this);
		}
	}

	public final DispatchTermContext dispatchTerm() throws RecognitionException {
		DispatchTermContext _localctx = new DispatchTermContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_dispatchTerm);
		try {
			setState(2033);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_lbrace_TOK:
			case ET_lbrace_TOK:
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
			case MT_at_TOK:
			case ET_at_TOK:
			case MT_freeTerm:
			case ET_freeTerm:
			case MT_annotations_OPT:
			case ET_annotations_OPT:
			case MT_metavar_TOK:
			case ET_metavar_TOK:
			case MT_list:
			case ET_list:
			case MT_lpar_TOK:
			case ET_lpar_TOK:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
			case MT_linear_TOK:
			case ET_linear_TOK:
			case MT_literal:
			case ET_literal:
			case MT_string_TOK:
			case ET_string_TOK:
			case MT_number_TOK:
			case ET_number_TOK:
			case MT_concrete:
			case ET_concrete:
			case MT_category_TOK:
			case ET_category_TOK:
			case MT_dispatch:
			case ET_dispatch:
			case MT_dispatch_TOK:
			case ET_dispatch_TOK:
			case MT_properties:
			case ET_properties:
			case MT_expression:
			case ET_expression:
			case MT_constructor:
			case ET_constructor:
			case MT_qualifier:
			case ET_qualifier:
			case MT_reserved:
			case ET_reserved:
			case DISPATCH:
			case COLON:
			case LPAR:
			case LBRACE:
			case LINEAR:
			case AT:
			case CATEGORY:
			case CONSTRUCTOR:
			case VARIABLE:
			case METAVAR:
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2025);
				freeTerm();
				_exitAlt();
				}
				break;
			case MT_dispatchTerm:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2029);
				match(MT_dispatchTerm);
				}
				break;
			case ET_dispatchTerm:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2031);
				match(ET_dispatchTerm);
				setState(2032);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DispatchTerm_EOFContext extends ParserRuleContext {
		public DispatchTermContext dispatchTerm() {
			return getRuleContext(DispatchTermContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public DispatchTerm_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatchTerm_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDispatchTerm_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDispatchTerm_EOF(this);
		}
	}

	public final DispatchTerm_EOFContext dispatchTerm_EOF() throws RecognitionException {
		DispatchTerm_EOFContext _localctx = new DispatchTerm_EOFContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_dispatchTerm_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2035);
			dispatchTerm();
			setState(2036);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DispatchCasesContext extends ParserRuleContext {
		public DispatchCaseContext dispatchCase() {
			return getRuleContext(DispatchCaseContext.class,0);
		}
		public DispatchCases_S1_ZOMContext dispatchCases_S1_ZOM() {
			return getRuleContext(DispatchCases_S1_ZOMContext.class,0);
		}
		public TerminalNode MT_dispatchCases() { return getToken(CrsxMetaParser.MT_dispatchCases, 0); }
		public TerminalNode ET_dispatchCases() { return getToken(CrsxMetaParser.ET_dispatchCases, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public DispatchCasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatchCases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDispatchCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDispatchCases(this);
		}
	}

	public final DispatchCasesContext dispatchCases() throws RecognitionException {
		DispatchCasesContext _localctx = new DispatchCasesContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_dispatchCases);
		try {
			setState(2048);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_lbrace_TOK:
			case ET_lbrace_TOK:
			case MT_ruleDeclaration:
			case ET_ruleDeclaration:
			case MT_option_OPT:
			case ET_option_OPT:
			case MT_option:
			case ET_option:
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_pattern:
			case ET_pattern:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
			case MT_at_TOK:
			case ET_at_TOK:
			case MT_dispatchCase:
			case ET_dispatchCase:
			case MT_properties:
			case ET_properties:
			case MT_constructor:
			case ET_constructor:
			case MT_qualifier:
			case ET_qualifier:
			case MT_reserved:
			case ET_reserved:
			case COLON:
			case LBRACE:
			case AT:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2039);
				dispatchCase();
				setState(2040);
				dispatchCases_S1_ZOM();
				_exitAlt();
				}
				break;
			case MT_dispatchCases:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2044);
				match(MT_dispatchCases);
				}
				break;
			case ET_dispatchCases:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2046);
				match(ET_dispatchCases);
				setState(2047);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DispatchCases_EOFContext extends ParserRuleContext {
		public DispatchCasesContext dispatchCases() {
			return getRuleContext(DispatchCasesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public DispatchCases_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatchCases_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDispatchCases_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDispatchCases_EOF(this);
		}
	}

	public final DispatchCases_EOFContext dispatchCases_EOF() throws RecognitionException {
		DispatchCases_EOFContext _localctx = new DispatchCases_EOFContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_dispatchCases_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2050);
			dispatchCases();
			setState(2051);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DispatchCases_S1_ZOMContext extends ParserRuleContext {
		public List<DispatchCases_S1Context> dispatchCases_S1() {
			return getRuleContexts(DispatchCases_S1Context.class);
		}
		public DispatchCases_S1Context dispatchCases_S1(int i) {
			return getRuleContext(DispatchCases_S1Context.class,i);
		}
		public TerminalNode MT_dispatchCases_S1_ZOM() { return getToken(CrsxMetaParser.MT_dispatchCases_S1_ZOM, 0); }
		public TerminalNode ET_dispatchCases_S1_ZOM() { return getToken(CrsxMetaParser.ET_dispatchCases_S1_ZOM, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public DispatchCases_S1_ZOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatchCases_S1_ZOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDispatchCases_S1_ZOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDispatchCases_S1_ZOM(this);
		}
	}

	public final DispatchCases_S1_ZOMContext dispatchCases_S1_ZOM() throws RecognitionException {
		DispatchCases_S1_ZOMContext _localctx = new DispatchCases_S1_ZOMContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_dispatchCases_S1_ZOM);
		try {
			int _alt;
			setState(2078);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterZOM();
				setState(2058);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2055);
						dispatchCases_S1();
						}
						} 
					}
					setState(2060);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
				}
				setState(2069);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					_tail();
					setState(2067);
					switch (_input.LA(1)) {
					case MT_dispatchCases_S1_ZOM:
						{
						_term();
						setState(2063);
						match(MT_dispatchCases_S1_ZOM);
						}
						break;
					case ET_dispatchCases_S1_ZOM:
						{
						_embed();
						setState(2065);
						match(ET_dispatchCases_S1_ZOM);
						setState(2066);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				_exitZOM();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2074);
				match(MT_dispatchCases_S1_ZOM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2076);
				match(ET_dispatchCases_S1_ZOM);
				setState(2077);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DispatchCases_S1_ZOM_EOFContext extends ParserRuleContext {
		public DispatchCases_S1_ZOMContext dispatchCases_S1_ZOM() {
			return getRuleContext(DispatchCases_S1_ZOMContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public DispatchCases_S1_ZOM_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatchCases_S1_ZOM_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDispatchCases_S1_ZOM_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDispatchCases_S1_ZOM_EOF(this);
		}
	}

	public final DispatchCases_S1_ZOM_EOFContext dispatchCases_S1_ZOM_EOF() throws RecognitionException {
		DispatchCases_S1_ZOM_EOFContext _localctx = new DispatchCases_S1_ZOM_EOFContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_dispatchCases_S1_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2080);
			dispatchCases_S1_ZOM();
			setState(2081);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DispatchCases_S1Context extends ParserRuleContext {
		public Semi_TOKContext semi_TOK() {
			return getRuleContext(Semi_TOKContext.class,0);
		}
		public DispatchCaseContext dispatchCase() {
			return getRuleContext(DispatchCaseContext.class,0);
		}
		public TerminalNode MT_dispatchCases_S1() { return getToken(CrsxMetaParser.MT_dispatchCases_S1, 0); }
		public TerminalNode ET_dispatchCases_S1() { return getToken(CrsxMetaParser.ET_dispatchCases_S1, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public DispatchCases_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatchCases_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDispatchCases_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDispatchCases_S1(this);
		}
	}

	public final DispatchCases_S1Context dispatchCases_S1() throws RecognitionException {
		DispatchCases_S1Context _localctx = new DispatchCases_S1Context(_ctx, getState());
		enterRule(_localctx, 336, RULE_dispatchCases_S1);
		try {
			setState(2093);
			switch (_input.LA(1)) {
			case MT_semi_TOK:
			case ET_semi_TOK:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2084);
				semi_TOK();
				setState(2085);
				dispatchCase();
				_exitAlt();
				}
				break;
			case MT_dispatchCases_S1:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2089);
				match(MT_dispatchCases_S1);
				}
				break;
			case ET_dispatchCases_S1:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2091);
				match(ET_dispatchCases_S1);
				setState(2092);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DispatchCases_S1_EOFContext extends ParserRuleContext {
		public DispatchCases_S1Context dispatchCases_S1() {
			return getRuleContext(DispatchCases_S1Context.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public DispatchCases_S1_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatchCases_S1_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDispatchCases_S1_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDispatchCases_S1_EOF(this);
		}
	}

	public final DispatchCases_S1_EOFContext dispatchCases_S1_EOF() throws RecognitionException {
		DispatchCases_S1_EOFContext _localctx = new DispatchCases_S1_EOFContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_dispatchCases_S1_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2095);
			dispatchCases_S1();
			setState(2096);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DispatchCaseContext extends ParserRuleContext {
		public RuleDeclarationContext ruleDeclaration() {
			return getRuleContext(RuleDeclarationContext.class,0);
		}
		public TerminalNode MT_dispatchCase() { return getToken(CrsxMetaParser.MT_dispatchCase, 0); }
		public TerminalNode ET_dispatchCase() { return getToken(CrsxMetaParser.ET_dispatchCase, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public DispatchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDispatchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDispatchCase(this);
		}
	}

	public final DispatchCaseContext dispatchCase() throws RecognitionException {
		DispatchCaseContext _localctx = new DispatchCaseContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_dispatchCase);
		try {
			setState(2107);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_lbrace_TOK:
			case ET_lbrace_TOK:
			case MT_ruleDeclaration:
			case ET_ruleDeclaration:
			case MT_option_OPT:
			case ET_option_OPT:
			case MT_option:
			case ET_option:
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_pattern:
			case ET_pattern:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
			case MT_at_TOK:
			case ET_at_TOK:
			case MT_properties:
			case ET_properties:
			case MT_constructor:
			case ET_constructor:
			case MT_qualifier:
			case ET_qualifier:
			case MT_reserved:
			case ET_reserved:
			case COLON:
			case LBRACE:
			case AT:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2099);
				ruleDeclaration();
				_exitAlt();
				}
				break;
			case MT_dispatchCase:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2103);
				match(MT_dispatchCase);
				}
				break;
			case ET_dispatchCase:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2105);
				match(ET_dispatchCase);
				setState(2106);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DispatchCase_EOFContext extends ParserRuleContext {
		public DispatchCaseContext dispatchCase() {
			return getRuleContext(DispatchCaseContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public DispatchCase_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatchCase_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDispatchCase_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDispatchCase_EOF(this);
		}
	}

	public final DispatchCase_EOFContext dispatchCase_EOF() throws RecognitionException {
		DispatchCase_EOFContext _localctx = new DispatchCase_EOFContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_dispatchCase_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2109);
			dispatchCase();
			setState(2110);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelayCaseContext extends ParserRuleContext {
		public Delay_TOKContext delay_TOK() {
			return getRuleContext(Delay_TOKContext.class,0);
		}
		public TerminalNode MT_delayCase() { return getToken(CrsxMetaParser.MT_delayCase, 0); }
		public TerminalNode ET_delayCase() { return getToken(CrsxMetaParser.ET_delayCase, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public DelayCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delayCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDelayCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDelayCase(this);
		}
	}

	public final DelayCaseContext delayCase() throws RecognitionException {
		DelayCaseContext _localctx = new DelayCaseContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_delayCase);
		try {
			setState(2121);
			switch (_input.LA(1)) {
			case MT_delay_TOK:
			case ET_delay_TOK:
			case DELAY:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2113);
				delay_TOK();
				_exitAlt();
				}
				break;
			case MT_delayCase:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2117);
				match(MT_delayCase);
				}
				break;
			case ET_delayCase:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2119);
				match(ET_delayCase);
				setState(2120);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelayCase_EOFContext extends ParserRuleContext {
		public DelayCaseContext delayCase() {
			return getRuleContext(DelayCaseContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public DelayCase_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delayCase_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDelayCase_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDelayCase_EOF(this);
		}
	}

	public final DelayCase_EOFContext delayCase_EOF() throws RecognitionException {
		DelayCase_EOFContext _localctx = new DelayCase_EOFContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_delayCase_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2123);
			delayCase();
			setState(2124);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delay_TOKContext extends ParserRuleContext {
		public TerminalNode DELAY() { return getToken(CrsxMetaParser.DELAY, 0); }
		public TerminalNode MT_delay_TOK() { return getToken(CrsxMetaParser.MT_delay_TOK, 0); }
		public TerminalNode ET_delay_TOK() { return getToken(CrsxMetaParser.ET_delay_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Delay_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delay_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDelay_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDelay_TOK(this);
		}
	}

	public final Delay_TOKContext delay_TOK() throws RecognitionException {
		Delay_TOKContext _localctx = new Delay_TOKContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_delay_TOK);
		try {
			setState(2134);
			switch (_input.LA(1)) {
			case DELAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(2127);
				match(DELAY);

				}
				break;
			case MT_delay_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2130);
				match(MT_delay_TOK);
				}
				break;
			case ET_delay_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2132);
				match(ET_delay_TOK);
				setState(2133);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delay_TOK_EOFContext extends ParserRuleContext {
		public Delay_TOKContext delay_TOK() {
			return getRuleContext(Delay_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Delay_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delay_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDelay_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDelay_TOK_EOF(this);
		}
	}

	public final Delay_TOK_EOFContext delay_TOK_EOF() throws RecognitionException {
		Delay_TOK_EOFContext _localctx = new Delay_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_delay_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2136);
			delay_TOK();
			setState(2137);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertiesContext extends ParserRuleContext {
		public Lbrace_TOKContext lbrace_TOK() {
			return getRuleContext(Lbrace_TOKContext.class,0);
		}
		public PropertyList_OPTContext propertyList_OPT() {
			return getRuleContext(PropertyList_OPTContext.class,0);
		}
		public Rbrace_TOKContext rbrace_TOK() {
			return getRuleContext(Rbrace_TOKContext.class,0);
		}
		public TerminalNode MT_properties() { return getToken(CrsxMetaParser.MT_properties, 0); }
		public TerminalNode ET_properties() { return getToken(CrsxMetaParser.ET_properties, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitProperties(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_properties);
		try {
			setState(2150);
			switch (_input.LA(1)) {
			case MT_lbrace_TOK:
			case ET_lbrace_TOK:
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2140);
				lbrace_TOK();
				setState(2141);
				propertyList_OPT();
				setState(2142);
				rbrace_TOK();
				_exitAlt();
				}
				break;
			case MT_properties:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2146);
				match(MT_properties);
				}
				break;
			case ET_properties:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2148);
				match(ET_properties);
				setState(2149);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Properties_EOFContext extends ParserRuleContext {
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Properties_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterProperties_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitProperties_EOF(this);
		}
	}

	public final Properties_EOFContext properties_EOF() throws RecognitionException {
		Properties_EOFContext _localctx = new Properties_EOFContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_properties_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2152);
			properties();
			setState(2153);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyList_OPTContext extends ParserRuleContext {
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public TerminalNode MT_propertyList_OPT() { return getToken(CrsxMetaParser.MT_propertyList_OPT, 0); }
		public TerminalNode ET_propertyList_OPT() { return getToken(CrsxMetaParser.ET_propertyList_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public PropertyList_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterPropertyList_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitPropertyList_OPT(this);
		}
	}

	public final PropertyList_OPTContext propertyList_OPT() throws RecognitionException {
		PropertyList_OPTContext _localctx = new PropertyList_OPTContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_propertyList_OPT);
		int _la;
		try {
			setState(2177);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(2158);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_constructor_TOK) | (1L << ET_constructor_TOK) | (1L << MT_colon_TOK) | (1L << ET_colon_TOK) | (1L << MT_at_TOK) | (1L << ET_at_TOK) | (1L << MT_metavar_TOK))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ET_metavar_TOK - 64)) | (1L << (MT_variable_TOK - 64)) | (1L << (ET_variable_TOK - 64)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (MT_string_TOK - 135)) | (1L << (ET_string_TOK - 135)) | (1L << (MT_propertyList - 135)) | (1L << (ET_propertyList - 135)) | (1L << (MT_property - 135)) | (1L << (ET_property - 135)) | (1L << (MT_not_TOK - 135)) | (1L << (ET_not_TOK - 135)))) != 0) || ((((_la - 231)) & ~0x3f) == 0 && ((1L << (_la - 231)) & ((1L << (MT_constructor - 231)) | (1L << (ET_constructor - 231)) | (1L << (MT_qualifier - 231)) | (1L << (ET_qualifier - 231)) | (1L << (MT_reserved - 231)) | (1L << (ET_reserved - 231)) | (1L << (COLON - 231)) | (1L << (NOT - 231)) | (1L << (AT - 231)) | (1L << (CONSTRUCTOR - 231)) | (1L << (VARIABLE - 231)) | (1L << (METAVAR - 231)) | (1L << (STRING - 231)))) != 0)) {
					{
					setState(2157);
					propertyList();
					}
				}

				setState(2168);
				_la = _input.LA(1);
				if (_la==MT_propertyList_OPT || _la==ET_propertyList_OPT) {
					{
					_tail();
					setState(2166);
					switch (_input.LA(1)) {
					case MT_propertyList_OPT:
						{
						_term();
						setState(2162);
						match(MT_propertyList_OPT);
						}
						break;
					case ET_propertyList_OPT:
						{
						_embed();
						setState(2164);
						match(ET_propertyList_OPT);
						setState(2165);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitOPT();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2173);
				match(MT_propertyList_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2175);
				match(ET_propertyList_OPT);
				setState(2176);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyList_OPT_EOFContext extends ParserRuleContext {
		public PropertyList_OPTContext propertyList_OPT() {
			return getRuleContext(PropertyList_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public PropertyList_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterPropertyList_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitPropertyList_OPT_EOF(this);
		}
	}

	public final PropertyList_OPT_EOFContext propertyList_OPT_EOF() throws RecognitionException {
		PropertyList_OPT_EOFContext _localctx = new PropertyList_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_propertyList_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2179);
			propertyList_OPT();
			setState(2180);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyListContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public PropertyList_S1_ZOMContext propertyList_S1_ZOM() {
			return getRuleContext(PropertyList_S1_ZOMContext.class,0);
		}
		public TerminalNode MT_propertyList() { return getToken(CrsxMetaParser.MT_propertyList, 0); }
		public TerminalNode ET_propertyList() { return getToken(CrsxMetaParser.ET_propertyList, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public PropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitPropertyList(this);
		}
	}

	public final PropertyListContext propertyList() throws RecognitionException {
		PropertyListContext _localctx = new PropertyListContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_propertyList);
		try {
			setState(2192);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_at_TOK:
			case ET_at_TOK:
			case MT_metavar_TOK:
			case ET_metavar_TOK:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_string_TOK:
			case ET_string_TOK:
			case MT_property:
			case ET_property:
			case MT_not_TOK:
			case ET_not_TOK:
			case MT_constructor:
			case ET_constructor:
			case MT_qualifier:
			case ET_qualifier:
			case MT_reserved:
			case ET_reserved:
			case COLON:
			case NOT:
			case AT:
			case CONSTRUCTOR:
			case VARIABLE:
			case METAVAR:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2183);
				property();
				setState(2184);
				propertyList_S1_ZOM();
				_exitAlt();
				}
				break;
			case MT_propertyList:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2188);
				match(MT_propertyList);
				}
				break;
			case ET_propertyList:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2190);
				match(ET_propertyList);
				setState(2191);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyList_EOFContext extends ParserRuleContext {
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public PropertyList_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterPropertyList_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitPropertyList_EOF(this);
		}
	}

	public final PropertyList_EOFContext propertyList_EOF() throws RecognitionException {
		PropertyList_EOFContext _localctx = new PropertyList_EOFContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_propertyList_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2194);
			propertyList();
			setState(2195);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyList_S1_ZOMContext extends ParserRuleContext {
		public List<PropertyList_S1Context> propertyList_S1() {
			return getRuleContexts(PropertyList_S1Context.class);
		}
		public PropertyList_S1Context propertyList_S1(int i) {
			return getRuleContext(PropertyList_S1Context.class,i);
		}
		public TerminalNode MT_propertyList_S1_ZOM() { return getToken(CrsxMetaParser.MT_propertyList_S1_ZOM, 0); }
		public TerminalNode ET_propertyList_S1_ZOM() { return getToken(CrsxMetaParser.ET_propertyList_S1_ZOM, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public PropertyList_S1_ZOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList_S1_ZOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterPropertyList_S1_ZOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitPropertyList_S1_ZOM(this);
		}
	}

	public final PropertyList_S1_ZOMContext propertyList_S1_ZOM() throws RecognitionException {
		PropertyList_S1_ZOMContext _localctx = new PropertyList_S1_ZOMContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_propertyList_S1_ZOM);
		int _la;
		try {
			setState(2222);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterZOM();
				setState(2202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MT_semi_TOK || _la==ET_semi_TOK || _la==MT_propertyList_S1 || _la==ET_propertyList_S1 || _la==SEMI) {
					{
					{
					setState(2199);
					propertyList_S1();
					}
					}
					setState(2204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2213);
				_la = _input.LA(1);
				if (_la==MT_propertyList_S1_ZOM || _la==ET_propertyList_S1_ZOM) {
					{
					_tail();
					setState(2211);
					switch (_input.LA(1)) {
					case MT_propertyList_S1_ZOM:
						{
						_term();
						setState(2207);
						match(MT_propertyList_S1_ZOM);
						}
						break;
					case ET_propertyList_S1_ZOM:
						{
						_embed();
						setState(2209);
						match(ET_propertyList_S1_ZOM);
						setState(2210);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitZOM();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2218);
				match(MT_propertyList_S1_ZOM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2220);
				match(ET_propertyList_S1_ZOM);
				setState(2221);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyList_S1_ZOM_EOFContext extends ParserRuleContext {
		public PropertyList_S1_ZOMContext propertyList_S1_ZOM() {
			return getRuleContext(PropertyList_S1_ZOMContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public PropertyList_S1_ZOM_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList_S1_ZOM_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterPropertyList_S1_ZOM_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitPropertyList_S1_ZOM_EOF(this);
		}
	}

	public final PropertyList_S1_ZOM_EOFContext propertyList_S1_ZOM_EOF() throws RecognitionException {
		PropertyList_S1_ZOM_EOFContext _localctx = new PropertyList_S1_ZOM_EOFContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_propertyList_S1_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2224);
			propertyList_S1_ZOM();
			setState(2225);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyList_S1Context extends ParserRuleContext {
		public Semi_TOKContext semi_TOK() {
			return getRuleContext(Semi_TOKContext.class,0);
		}
		public Property_OPTContext property_OPT() {
			return getRuleContext(Property_OPTContext.class,0);
		}
		public TerminalNode MT_propertyList_S1() { return getToken(CrsxMetaParser.MT_propertyList_S1, 0); }
		public TerminalNode ET_propertyList_S1() { return getToken(CrsxMetaParser.ET_propertyList_S1, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public PropertyList_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterPropertyList_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitPropertyList_S1(this);
		}
	}

	public final PropertyList_S1Context propertyList_S1() throws RecognitionException {
		PropertyList_S1Context _localctx = new PropertyList_S1Context(_ctx, getState());
		enterRule(_localctx, 368, RULE_propertyList_S1);
		try {
			setState(2237);
			switch (_input.LA(1)) {
			case MT_semi_TOK:
			case ET_semi_TOK:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2228);
				semi_TOK();
				setState(2229);
				property_OPT();
				_exitAlt();
				}
				break;
			case MT_propertyList_S1:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2233);
				match(MT_propertyList_S1);
				}
				break;
			case ET_propertyList_S1:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2235);
				match(ET_propertyList_S1);
				setState(2236);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyList_S1_EOFContext extends ParserRuleContext {
		public PropertyList_S1Context propertyList_S1() {
			return getRuleContext(PropertyList_S1Context.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public PropertyList_S1_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList_S1_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterPropertyList_S1_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitPropertyList_S1_EOF(this);
		}
	}

	public final PropertyList_S1_EOFContext propertyList_S1_EOF() throws RecognitionException {
		PropertyList_S1_EOFContext _localctx = new PropertyList_S1_EOFContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_propertyList_S1_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2239);
			propertyList_S1();
			setState(2240);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_OPTContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode MT_property_OPT() { return getToken(CrsxMetaParser.MT_property_OPT, 0); }
		public TerminalNode ET_property_OPT() { return getToken(CrsxMetaParser.ET_property_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Property_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterProperty_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitProperty_OPT(this);
		}
	}

	public final Property_OPTContext property_OPT() throws RecognitionException {
		Property_OPTContext _localctx = new Property_OPTContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_property_OPT);
		int _la;
		try {
			setState(2264);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(2245);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_constructor_TOK) | (1L << ET_constructor_TOK) | (1L << MT_colon_TOK) | (1L << ET_colon_TOK) | (1L << MT_at_TOK) | (1L << ET_at_TOK) | (1L << MT_metavar_TOK))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ET_metavar_TOK - 64)) | (1L << (MT_variable_TOK - 64)) | (1L << (ET_variable_TOK - 64)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (MT_string_TOK - 135)) | (1L << (ET_string_TOK - 135)) | (1L << (MT_property - 135)) | (1L << (ET_property - 135)) | (1L << (MT_not_TOK - 135)) | (1L << (ET_not_TOK - 135)))) != 0) || ((((_la - 231)) & ~0x3f) == 0 && ((1L << (_la - 231)) & ((1L << (MT_constructor - 231)) | (1L << (ET_constructor - 231)) | (1L << (MT_qualifier - 231)) | (1L << (ET_qualifier - 231)) | (1L << (MT_reserved - 231)) | (1L << (ET_reserved - 231)) | (1L << (COLON - 231)) | (1L << (NOT - 231)) | (1L << (AT - 231)) | (1L << (CONSTRUCTOR - 231)) | (1L << (VARIABLE - 231)) | (1L << (METAVAR - 231)) | (1L << (STRING - 231)))) != 0)) {
					{
					setState(2244);
					property();
					}
				}

				setState(2255);
				_la = _input.LA(1);
				if (_la==MT_property_OPT || _la==ET_property_OPT) {
					{
					_tail();
					setState(2253);
					switch (_input.LA(1)) {
					case MT_property_OPT:
						{
						_term();
						setState(2249);
						match(MT_property_OPT);
						}
						break;
					case ET_property_OPT:
						{
						_embed();
						setState(2251);
						match(ET_property_OPT);
						setState(2252);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitOPT();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2260);
				match(MT_property_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2262);
				match(ET_property_OPT);
				setState(2263);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_OPT_EOFContext extends ParserRuleContext {
		public Property_OPTContext property_OPT() {
			return getRuleContext(Property_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Property_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterProperty_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitProperty_OPT_EOF(this);
		}
	}

	public final Property_OPT_EOFContext property_OPT_EOF() throws RecognitionException {
		Property_OPT_EOFContext _localctx = new Property_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_property_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2266);
			property_OPT();
			setState(2267);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public Metavar_TOKContext metavar_TOK() {
			return getRuleContext(Metavar_TOKContext.class,0);
		}
		public Not_TOKContext not_TOK() {
			return getRuleContext(Not_TOKContext.class,0);
		}
		public Colon_TOKContext colon_TOK() {
			return getRuleContext(Colon_TOKContext.class,0);
		}
		public FreeTermContext freeTerm() {
			return getRuleContext(FreeTermContext.class,0);
		}
		public Variable_TOKContext variable_TOK() {
			return getRuleContext(Variable_TOKContext.class,0);
		}
		public String_TOKContext string_TOK() {
			return getRuleContext(String_TOKContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public TerminalNode MT_property() { return getToken(CrsxMetaParser.MT_property, 0); }
		public TerminalNode ET_property() { return getToken(CrsxMetaParser.ET_property, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitProperty(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_property);
		try {
			setState(2325);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(2270);
				metavar_TOK();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(2274);
				not_TOK();
				setState(2275);
				metavar_TOK();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(2279);
				metavar_TOK();
				setState(2280);
				colon_TOK();
				setState(2281);
				freeTerm();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(2285);
				variable_TOK();
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				setState(2289);
				not_TOK();
				setState(2290);
				variable_TOK();
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_enterAlt("6");
				setState(2294);
				variable_TOK();
				setState(2295);
				colon_TOK();
				setState(2296);
				freeTerm();
				_exitAlt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				_enterAlt("7");
				setState(2300);
				string_TOK();
				_exitAlt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				_enterAlt("8");
				setState(2304);
				not_TOK();
				setState(2305);
				string_TOK();
				_exitAlt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				_enterAlt("9");
				setState(2309);
				string_TOK();
				setState(2310);
				colon_TOK();
				setState(2311);
				freeTerm();
				_exitAlt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				_enterAlt("10");
				setState(2315);
				constructor();
				setState(2316);
				colon_TOK();
				setState(2317);
				freeTerm();
				_exitAlt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				_term();
				setState(2321);
				match(MT_property);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				_embed();
				setState(2323);
				match(ET_property);
				setState(2324);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_EOFContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Property_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterProperty_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitProperty_EOF(this);
		}
	}

	public final Property_EOFContext property_EOF() throws RecognitionException {
		Property_EOFContext _localctx = new Property_EOFContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_property_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2327);
			property();
			setState(2328);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Not_TOKContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(CrsxMetaParser.NOT, 0); }
		public TerminalNode MT_not_TOK() { return getToken(CrsxMetaParser.MT_not_TOK, 0); }
		public TerminalNode ET_not_TOK() { return getToken(CrsxMetaParser.ET_not_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Not_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterNot_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitNot_TOK(this);
		}
	}

	public final Not_TOKContext not_TOK() throws RecognitionException {
		Not_TOKContext _localctx = new Not_TOKContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_not_TOK);
		try {
			setState(2338);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2331);
				match(NOT);

				}
				break;
			case MT_not_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2334);
				match(MT_not_TOK);
				}
				break;
			case ET_not_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2336);
				match(ET_not_TOK);
				setState(2337);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Not_TOK_EOFContext extends ParserRuleContext {
		public Not_TOKContext not_TOK() {
			return getRuleContext(Not_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Not_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterNot_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitNot_TOK_EOF(this);
		}
	}

	public final Not_TOK_EOFContext not_TOK_EOF() throws RecognitionException {
		Not_TOK_EOFContext _localctx = new Not_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_not_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2340);
			not_TOK();
			setState(2341);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public DispatchContext dispatch() {
			return getRuleContext(DispatchContext.class,0);
		}
		public TerminalNode MT_expression() { return getToken(CrsxMetaParser.MT_expression, 0); }
		public TerminalNode ET_expression() { return getToken(CrsxMetaParser.ET_expression, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_expression);
		try {
			setState(2352);
			switch (_input.LA(1)) {
			case MT_dispatch:
			case ET_dispatch:
			case MT_dispatch_TOK:
			case ET_dispatch_TOK:
			case DISPATCH:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2344);
				dispatch();
				_exitAlt();
				}
				break;
			case MT_expression:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2348);
				match(MT_expression);
				}
				break;
			case ET_expression:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2350);
				match(ET_expression);
				setState(2351);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_EOFContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Expression_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterExpression_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitExpression_EOF(this);
		}
	}

	public final Expression_EOFContext expression_EOF() throws RecognitionException {
		Expression_EOFContext _localctx = new Expression_EOFContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_expression_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2354);
			expression();
			setState(2355);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortDeclarationContext extends ParserRuleContext {
		public Sortparams_OPTContext sortparams_OPT() {
			return getRuleContext(Sortparams_OPTContext.class,0);
		}
		public SortsetContext sortset() {
			return getRuleContext(SortsetContext.class,0);
		}
		public SortnameContext sortname() {
			return getRuleContext(SortnameContext.class,0);
		}
		public Datasort_TOKContext datasort_TOK() {
			return getRuleContext(Datasort_TOKContext.class,0);
		}
		public Lpar_TOKContext lpar_TOK() {
			return getRuleContext(Lpar_TOKContext.class,0);
		}
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public Rpar_TOKContext rpar_TOK() {
			return getRuleContext(Rpar_TOKContext.class,0);
		}
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public Coloncolon_TOKContext coloncolon_TOK() {
			return getRuleContext(Coloncolon_TOKContext.class,0);
		}
		public TerminalNode MT_sortDeclaration() { return getToken(CrsxMetaParser.MT_sortDeclaration, 0); }
		public TerminalNode ET_sortDeclaration() { return getToken(CrsxMetaParser.ET_sortDeclaration, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public SortDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortDeclaration(this);
		}
	}

	public final SortDeclarationContext sortDeclaration() throws RecognitionException {
		SortDeclarationContext _localctx = new SortDeclarationContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_sortDeclaration);
		try {
			setState(2380);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(2358);
				sortparams_OPT();
				setState(2359);
				sortset();
				setState(2360);
				sortname();
				setState(2361);
				datasort_TOK();
				setState(2362);
				lpar_TOK();
				setState(2363);
				forms();
				setState(2364);
				rpar_TOK();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(2368);
				sortparams_OPT();
				setState(2369);
				sortset();
				setState(2370);
				form();
				setState(2371);
				coloncolon_TOK();
				setState(2372);
				sortname();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(2376);
				match(MT_sortDeclaration);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(2378);
				match(ET_sortDeclaration);
				setState(2379);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortDeclaration_EOFContext extends ParserRuleContext {
		public SortDeclarationContext sortDeclaration() {
			return getRuleContext(SortDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public SortDeclaration_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortDeclaration_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortDeclaration_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortDeclaration_EOF(this);
		}
	}

	public final SortDeclaration_EOFContext sortDeclaration_EOF() throws RecognitionException {
		SortDeclaration_EOFContext _localctx = new SortDeclaration_EOFContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_sortDeclaration_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2382);
			sortDeclaration();
			setState(2383);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sortparams_OPTContext extends ParserRuleContext {
		public SortparamsContext sortparams() {
			return getRuleContext(SortparamsContext.class,0);
		}
		public TerminalNode MT_sortparams_OPT() { return getToken(CrsxMetaParser.MT_sortparams_OPT, 0); }
		public TerminalNode ET_sortparams_OPT() { return getToken(CrsxMetaParser.ET_sortparams_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Sortparams_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortparams_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortparams_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortparams_OPT(this);
		}
	}

	public final Sortparams_OPTContext sortparams_OPT() throws RecognitionException {
		Sortparams_OPTContext _localctx = new Sortparams_OPTContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_sortparams_OPT);
		int _la;
		try {
			setState(2407);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(2388);
				_la = _input.LA(1);
				if (((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (MT_sortparams - 201)) | (1L << (ET_sortparams - 201)) | (1L << (MT_forall_TOK - 201)) | (1L << (ET_forall_TOK - 201)) | (1L << (FORALL - 201)))) != 0)) {
					{
					setState(2387);
					sortparams();
					}
				}

				setState(2398);
				_la = _input.LA(1);
				if (_la==MT_sortparams_OPT || _la==ET_sortparams_OPT) {
					{
					_tail();
					setState(2396);
					switch (_input.LA(1)) {
					case MT_sortparams_OPT:
						{
						_term();
						setState(2392);
						match(MT_sortparams_OPT);
						}
						break;
					case ET_sortparams_OPT:
						{
						_embed();
						setState(2394);
						match(ET_sortparams_OPT);
						setState(2395);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitOPT();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2403);
				match(MT_sortparams_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2405);
				match(ET_sortparams_OPT);
				setState(2406);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sortparams_OPT_EOFContext extends ParserRuleContext {
		public Sortparams_OPTContext sortparams_OPT() {
			return getRuleContext(Sortparams_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Sortparams_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortparams_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortparams_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortparams_OPT_EOF(this);
		}
	}

	public final Sortparams_OPT_EOFContext sortparams_OPT_EOF() throws RecognitionException {
		Sortparams_OPT_EOFContext _localctx = new Sortparams_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_sortparams_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2409);
			sortparams_OPT();
			setState(2410);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Datasort_TOKContext extends ParserRuleContext {
		public TerminalNode DATASORT() { return getToken(CrsxMetaParser.DATASORT, 0); }
		public TerminalNode MT_datasort_TOK() { return getToken(CrsxMetaParser.MT_datasort_TOK, 0); }
		public TerminalNode ET_datasort_TOK() { return getToken(CrsxMetaParser.ET_datasort_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Datasort_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datasort_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDatasort_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDatasort_TOK(this);
		}
	}

	public final Datasort_TOKContext datasort_TOK() throws RecognitionException {
		Datasort_TOKContext _localctx = new Datasort_TOKContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_datasort_TOK);
		try {
			setState(2420);
			switch (_input.LA(1)) {
			case DATASORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2413);
				match(DATASORT);

				}
				break;
			case MT_datasort_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2416);
				match(MT_datasort_TOK);
				}
				break;
			case ET_datasort_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2418);
				match(ET_datasort_TOK);
				setState(2419);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Datasort_TOK_EOFContext extends ParserRuleContext {
		public Datasort_TOKContext datasort_TOK() {
			return getRuleContext(Datasort_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Datasort_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datasort_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDatasort_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDatasort_TOK_EOF(this);
		}
	}

	public final Datasort_TOK_EOFContext datasort_TOK_EOF() throws RecognitionException {
		Datasort_TOK_EOFContext _localctx = new Datasort_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_datasort_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2422);
			datasort_TOK();
			setState(2423);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortparamsContext extends ParserRuleContext {
		public Forall_TOKContext forall_TOK() {
			return getRuleContext(Forall_TOKContext.class,0);
		}
		public Variable_OOMContext variable_OOM() {
			return getRuleContext(Variable_OOMContext.class,0);
		}
		public Dot_TOKContext dot_TOK() {
			return getRuleContext(Dot_TOKContext.class,0);
		}
		public TerminalNode MT_sortparams() { return getToken(CrsxMetaParser.MT_sortparams, 0); }
		public TerminalNode ET_sortparams() { return getToken(CrsxMetaParser.ET_sortparams, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public SortparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortparams(this);
		}
	}

	public final SortparamsContext sortparams() throws RecognitionException {
		SortparamsContext _localctx = new SortparamsContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_sortparams);
		try {
			setState(2436);
			switch (_input.LA(1)) {
			case MT_forall_TOK:
			case ET_forall_TOK:
			case FORALL:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2426);
				forall_TOK();
				setState(2427);
				variable_OOM();
				setState(2428);
				dot_TOK();
				_exitAlt();
				}
				break;
			case MT_sortparams:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2432);
				match(MT_sortparams);
				}
				break;
			case ET_sortparams:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2434);
				match(ET_sortparams);
				setState(2435);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sortparams_EOFContext extends ParserRuleContext {
		public SortparamsContext sortparams() {
			return getRuleContext(SortparamsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Sortparams_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortparams_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortparams_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortparams_EOF(this);
		}
	}

	public final Sortparams_EOFContext sortparams_EOF() throws RecognitionException {
		Sortparams_EOFContext _localctx = new Sortparams_EOFContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_sortparams_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2438);
			sortparams();
			setState(2439);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Forall_TOKContext extends ParserRuleContext {
		public TerminalNode FORALL() { return getToken(CrsxMetaParser.FORALL, 0); }
		public TerminalNode MT_forall_TOK() { return getToken(CrsxMetaParser.MT_forall_TOK, 0); }
		public TerminalNode ET_forall_TOK() { return getToken(CrsxMetaParser.ET_forall_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Forall_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forall_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterForall_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitForall_TOK(this);
		}
	}

	public final Forall_TOKContext forall_TOK() throws RecognitionException {
		Forall_TOKContext _localctx = new Forall_TOKContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_forall_TOK);
		try {
			setState(2449);
			switch (_input.LA(1)) {
			case FORALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2442);
				match(FORALL);

				}
				break;
			case MT_forall_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2445);
				match(MT_forall_TOK);
				}
				break;
			case ET_forall_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2447);
				match(ET_forall_TOK);
				setState(2448);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Forall_TOK_EOFContext extends ParserRuleContext {
		public Forall_TOKContext forall_TOK() {
			return getRuleContext(Forall_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Forall_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forall_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterForall_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitForall_TOK_EOF(this);
		}
	}

	public final Forall_TOK_EOFContext forall_TOK_EOF() throws RecognitionException {
		Forall_TOK_EOFContext _localctx = new Forall_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_forall_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2451);
			forall_TOK();
			setState(2452);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_OOMContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode MT_variable_OOM() { return getToken(CrsxMetaParser.MT_variable_OOM, 0); }
		public TerminalNode ET_variable_OOM() { return getToken(CrsxMetaParser.ET_variable_OOM, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Variable_OOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_OOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterVariable_OOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitVariable_OOM(this);
		}
	}

	public final Variable_OOMContext variable_OOM() throws RecognitionException {
		Variable_OOMContext _localctx = new Variable_OOMContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_variable_OOM);
		int _la;
		try {
			setState(2479);
			switch (_input.LA(1)) {
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
			case MT_linear_TOK:
			case ET_linear_TOK:
			case LINEAR:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterOOM();
				setState(2457); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2456);
					variable();
					}
					}
					setState(2459); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (MT_variable - 115)) | (1L << (ET_variable - 115)) | (1L << (MT_linear_OPT - 115)) | (1L << (ET_linear_OPT - 115)) | (1L << (MT_variable_TOK - 115)) | (1L << (ET_variable_TOK - 115)) | (1L << (MT_linear - 115)) | (1L << (ET_linear - 115)) | (1L << (MT_linear_TOK - 115)) | (1L << (ET_linear_TOK - 115)))) != 0) || _la==LINEAR || _la==VARIABLE );
				setState(2469);
				_la = _input.LA(1);
				if (_la==MT_variable_OOM || _la==ET_variable_OOM) {
					{
					_tail();
					setState(2467);
					switch (_input.LA(1)) {
					case MT_variable_OOM:
						{
						_term();
						setState(2463);
						match(MT_variable_OOM);
						}
						break;
					case ET_variable_OOM:
						{
						_embed();
						setState(2465);
						match(ET_variable_OOM);
						setState(2466);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitOOM();

				}
				break;
			case MT_variable_OOM:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2475);
				match(MT_variable_OOM);
				}
				break;
			case ET_variable_OOM:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2477);
				match(ET_variable_OOM);
				setState(2478);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_OOM_EOFContext extends ParserRuleContext {
		public Variable_OOMContext variable_OOM() {
			return getRuleContext(Variable_OOMContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Variable_OOM_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_OOM_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterVariable_OOM_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitVariable_OOM_EOF(this);
		}
	}

	public final Variable_OOM_EOFContext variable_OOM_EOF() throws RecognitionException {
		Variable_OOM_EOFContext _localctx = new Variable_OOM_EOFContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_variable_OOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2481);
			variable_OOM();
			setState(2482);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortsetContext extends ParserRuleContext {
		public Properties_OPTContext properties_OPT() {
			return getRuleContext(Properties_OPTContext.class,0);
		}
		public TerminalNode MT_sortset() { return getToken(CrsxMetaParser.MT_sortset, 0); }
		public TerminalNode ET_sortset() { return getToken(CrsxMetaParser.ET_sortset, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public SortsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortset(this);
		}
	}

	public final SortsetContext sortset() throws RecognitionException {
		SortsetContext _localctx = new SortsetContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_sortset);
		try {
			setState(2493);
			switch (_input.LA(1)) {
			case EOF:
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_lbrace_TOK:
			case ET_lbrace_TOK:
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_at_TOK:
			case ET_at_TOK:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
			case MT_linear_TOK:
			case ET_linear_TOK:
			case MT_properties:
			case ET_properties:
			case MT_sortname:
			case ET_sortname:
			case MT_form:
			case ET_form:
			case MT_constructor:
			case ET_constructor:
			case MT_qualifier:
			case ET_qualifier:
			case MT_reserved:
			case ET_reserved:
			case COLON:
			case LBRACE:
			case LINEAR:
			case AT:
			case CONSTRUCTOR:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2485);
				properties_OPT();
				_exitAlt();
				}
				break;
			case MT_sortset:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2489);
				match(MT_sortset);
				}
				break;
			case ET_sortset:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2491);
				match(ET_sortset);
				setState(2492);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sortset_EOFContext extends ParserRuleContext {
		public SortsetContext sortset() {
			return getRuleContext(SortsetContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Sortset_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortset_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortset_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortset_EOF(this);
		}
	}

	public final Sortset_EOFContext sortset_EOF() throws RecognitionException {
		Sortset_EOFContext _localctx = new Sortset_EOFContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_sortset_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2495);
			sortset();
			setState(2496);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortnamesContext extends ParserRuleContext {
		public SortnameContext sortname() {
			return getRuleContext(SortnameContext.class,0);
		}
		public Sortnames_S1_ZOMContext sortnames_S1_ZOM() {
			return getRuleContext(Sortnames_S1_ZOMContext.class,0);
		}
		public TerminalNode MT_sortnames() { return getToken(CrsxMetaParser.MT_sortnames, 0); }
		public TerminalNode ET_sortnames() { return getToken(CrsxMetaParser.ET_sortnames, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public SortnamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortnames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortnames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortnames(this);
		}
	}

	public final SortnamesContext sortnames() throws RecognitionException {
		SortnamesContext _localctx = new SortnamesContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_sortnames);
		try {
			setState(2508);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_at_TOK:
			case ET_at_TOK:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
			case MT_linear_TOK:
			case ET_linear_TOK:
			case MT_sortname:
			case ET_sortname:
			case MT_constructor:
			case ET_constructor:
			case MT_qualifier:
			case ET_qualifier:
			case MT_reserved:
			case ET_reserved:
			case COLON:
			case LINEAR:
			case AT:
			case CONSTRUCTOR:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2499);
				sortname();
				setState(2500);
				sortnames_S1_ZOM();
				_exitAlt();
				}
				break;
			case MT_sortnames:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2504);
				match(MT_sortnames);
				}
				break;
			case ET_sortnames:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2506);
				match(ET_sortnames);
				setState(2507);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sortnames_EOFContext extends ParserRuleContext {
		public SortnamesContext sortnames() {
			return getRuleContext(SortnamesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Sortnames_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortnames_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortnames_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortnames_EOF(this);
		}
	}

	public final Sortnames_EOFContext sortnames_EOF() throws RecognitionException {
		Sortnames_EOFContext _localctx = new Sortnames_EOFContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_sortnames_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2510);
			sortnames();
			setState(2511);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sortnames_S1_ZOMContext extends ParserRuleContext {
		public List<Sortnames_S1Context> sortnames_S1() {
			return getRuleContexts(Sortnames_S1Context.class);
		}
		public Sortnames_S1Context sortnames_S1(int i) {
			return getRuleContext(Sortnames_S1Context.class,i);
		}
		public TerminalNode MT_sortnames_S1_ZOM() { return getToken(CrsxMetaParser.MT_sortnames_S1_ZOM, 0); }
		public TerminalNode ET_sortnames_S1_ZOM() { return getToken(CrsxMetaParser.ET_sortnames_S1_ZOM, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Sortnames_S1_ZOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortnames_S1_ZOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortnames_S1_ZOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortnames_S1_ZOM(this);
		}
	}

	public final Sortnames_S1_ZOMContext sortnames_S1_ZOM() throws RecognitionException {
		Sortnames_S1_ZOMContext _localctx = new Sortnames_S1_ZOMContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_sortnames_S1_ZOM);
		int _la;
		try {
			setState(2538);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterZOM();
				setState(2518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MT_comma_TOK || _la==ET_comma_TOK || ((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (MT_sortnames_S1 - 213)) | (1L << (ET_sortnames_S1 - 213)) | (1L << (COMMA - 213)))) != 0)) {
					{
					{
					setState(2515);
					sortnames_S1();
					}
					}
					setState(2520);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2529);
				_la = _input.LA(1);
				if (_la==MT_sortnames_S1_ZOM || _la==ET_sortnames_S1_ZOM) {
					{
					_tail();
					setState(2527);
					switch (_input.LA(1)) {
					case MT_sortnames_S1_ZOM:
						{
						_term();
						setState(2523);
						match(MT_sortnames_S1_ZOM);
						}
						break;
					case ET_sortnames_S1_ZOM:
						{
						_embed();
						setState(2525);
						match(ET_sortnames_S1_ZOM);
						setState(2526);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitZOM();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2534);
				match(MT_sortnames_S1_ZOM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2536);
				match(ET_sortnames_S1_ZOM);
				setState(2537);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sortnames_S1_ZOM_EOFContext extends ParserRuleContext {
		public Sortnames_S1_ZOMContext sortnames_S1_ZOM() {
			return getRuleContext(Sortnames_S1_ZOMContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Sortnames_S1_ZOM_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortnames_S1_ZOM_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortnames_S1_ZOM_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortnames_S1_ZOM_EOF(this);
		}
	}

	public final Sortnames_S1_ZOM_EOFContext sortnames_S1_ZOM_EOF() throws RecognitionException {
		Sortnames_S1_ZOM_EOFContext _localctx = new Sortnames_S1_ZOM_EOFContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_sortnames_S1_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2540);
			sortnames_S1_ZOM();
			setState(2541);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sortnames_S1Context extends ParserRuleContext {
		public Comma_TOKContext comma_TOK() {
			return getRuleContext(Comma_TOKContext.class,0);
		}
		public SortnameContext sortname() {
			return getRuleContext(SortnameContext.class,0);
		}
		public TerminalNode MT_sortnames_S1() { return getToken(CrsxMetaParser.MT_sortnames_S1, 0); }
		public TerminalNode ET_sortnames_S1() { return getToken(CrsxMetaParser.ET_sortnames_S1, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Sortnames_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortnames_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortnames_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortnames_S1(this);
		}
	}

	public final Sortnames_S1Context sortnames_S1() throws RecognitionException {
		Sortnames_S1Context _localctx = new Sortnames_S1Context(_ctx, getState());
		enterRule(_localctx, 424, RULE_sortnames_S1);
		try {
			setState(2553);
			switch (_input.LA(1)) {
			case MT_comma_TOK:
			case ET_comma_TOK:
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2544);
				comma_TOK();
				setState(2545);
				sortname();
				_exitAlt();
				}
				break;
			case MT_sortnames_S1:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2549);
				match(MT_sortnames_S1);
				}
				break;
			case ET_sortnames_S1:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2551);
				match(ET_sortnames_S1);
				setState(2552);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sortnames_S1_EOFContext extends ParserRuleContext {
		public Sortnames_S1Context sortnames_S1() {
			return getRuleContext(Sortnames_S1Context.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Sortnames_S1_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortnames_S1_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortnames_S1_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortnames_S1_EOF(this);
		}
	}

	public final Sortnames_S1_EOFContext sortnames_S1_EOF() throws RecognitionException {
		Sortnames_S1_EOFContext _localctx = new Sortnames_S1_EOFContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_sortnames_S1_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2555);
			sortnames_S1();
			setState(2556);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortnameContext extends ParserRuleContext {
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public Sortarguments_OPTContext sortarguments_OPT() {
			return getRuleContext(Sortarguments_OPTContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode MT_sortname() { return getToken(CrsxMetaParser.MT_sortname, 0); }
		public TerminalNode ET_sortname() { return getToken(CrsxMetaParser.ET_sortname, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public SortnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortname(this);
		}
	}

	public final SortnameContext sortname() throws RecognitionException {
		SortnameContext _localctx = new SortnameContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_sortname);
		try {
			setState(2572);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_at_TOK:
			case ET_at_TOK:
			case MT_constructor:
			case ET_constructor:
			case MT_qualifier:
			case ET_qualifier:
			case MT_reserved:
			case ET_reserved:
			case COLON:
			case AT:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(2559);
				constructor();
				setState(2560);
				sortarguments_OPT();
				_exitAlt();
				}
				break;
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
			case MT_linear_TOK:
			case ET_linear_TOK:
			case LINEAR:
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(2564);
				variable();
				_exitAlt();
				}
				break;
			case MT_sortname:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(2568);
				match(MT_sortname);
				}
				break;
			case ET_sortname:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(2570);
				match(ET_sortname);
				setState(2571);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sortname_EOFContext extends ParserRuleContext {
		public SortnameContext sortname() {
			return getRuleContext(SortnameContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Sortname_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortname_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortname_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortname_EOF(this);
		}
	}

	public final Sortname_EOFContext sortname_EOF() throws RecognitionException {
		Sortname_EOFContext _localctx = new Sortname_EOFContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_sortname_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2574);
			sortname();
			setState(2575);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sortarguments_OPTContext extends ParserRuleContext {
		public SortargumentsContext sortarguments() {
			return getRuleContext(SortargumentsContext.class,0);
		}
		public TerminalNode MT_sortarguments_OPT() { return getToken(CrsxMetaParser.MT_sortarguments_OPT, 0); }
		public TerminalNode ET_sortarguments_OPT() { return getToken(CrsxMetaParser.ET_sortarguments_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Sortarguments_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortarguments_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortarguments_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortarguments_OPT(this);
		}
	}

	public final Sortarguments_OPTContext sortarguments_OPT() throws RecognitionException {
		Sortarguments_OPTContext _localctx = new Sortarguments_OPTContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_sortarguments_OPT);
		int _la;
		try {
			setState(2599);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(2580);
				_la = _input.LA(1);
				if (_la==MT_lsquare_TOK || _la==ET_lsquare_TOK || ((((_la - 219)) & ~0x3f) == 0 && ((1L << (_la - 219)) & ((1L << (MT_sortarguments - 219)) | (1L << (ET_sortarguments - 219)) | (1L << (LSQUARE - 219)))) != 0)) {
					{
					setState(2579);
					sortarguments();
					}
				}

				setState(2590);
				_la = _input.LA(1);
				if (_la==MT_sortarguments_OPT || _la==ET_sortarguments_OPT) {
					{
					_tail();
					setState(2588);
					switch (_input.LA(1)) {
					case MT_sortarguments_OPT:
						{
						_term();
						setState(2584);
						match(MT_sortarguments_OPT);
						}
						break;
					case ET_sortarguments_OPT:
						{
						_embed();
						setState(2586);
						match(ET_sortarguments_OPT);
						setState(2587);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitOPT();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2595);
				match(MT_sortarguments_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2597);
				match(ET_sortarguments_OPT);
				setState(2598);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sortarguments_OPT_EOFContext extends ParserRuleContext {
		public Sortarguments_OPTContext sortarguments_OPT() {
			return getRuleContext(Sortarguments_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Sortarguments_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortarguments_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortarguments_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortarguments_OPT_EOF(this);
		}
	}

	public final Sortarguments_OPT_EOFContext sortarguments_OPT_EOF() throws RecognitionException {
		Sortarguments_OPT_EOFContext _localctx = new Sortarguments_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_sortarguments_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2601);
			sortarguments_OPT();
			setState(2602);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortargumentsContext extends ParserRuleContext {
		public Lsquare_TOKContext lsquare_TOK() {
			return getRuleContext(Lsquare_TOKContext.class,0);
		}
		public Sortnames_OPTContext sortnames_OPT() {
			return getRuleContext(Sortnames_OPTContext.class,0);
		}
		public Rsquare_TOKContext rsquare_TOK() {
			return getRuleContext(Rsquare_TOKContext.class,0);
		}
		public TerminalNode MT_sortarguments() { return getToken(CrsxMetaParser.MT_sortarguments, 0); }
		public TerminalNode ET_sortarguments() { return getToken(CrsxMetaParser.ET_sortarguments, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public SortargumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortarguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortarguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortarguments(this);
		}
	}

	public final SortargumentsContext sortarguments() throws RecognitionException {
		SortargumentsContext _localctx = new SortargumentsContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_sortarguments);
		try {
			setState(2615);
			switch (_input.LA(1)) {
			case MT_lsquare_TOK:
			case ET_lsquare_TOK:
			case LSQUARE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2605);
				lsquare_TOK();
				setState(2606);
				sortnames_OPT();
				setState(2607);
				rsquare_TOK();
				_exitAlt();
				}
				break;
			case MT_sortarguments:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2611);
				match(MT_sortarguments);
				}
				break;
			case ET_sortarguments:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2613);
				match(ET_sortarguments);
				setState(2614);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sortarguments_EOFContext extends ParserRuleContext {
		public SortargumentsContext sortarguments() {
			return getRuleContext(SortargumentsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Sortarguments_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortarguments_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortarguments_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortarguments_EOF(this);
		}
	}

	public final Sortarguments_EOFContext sortarguments_EOF() throws RecognitionException {
		Sortarguments_EOFContext _localctx = new Sortarguments_EOFContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_sortarguments_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2617);
			sortarguments();
			setState(2618);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sortnames_OPTContext extends ParserRuleContext {
		public SortnamesContext sortnames() {
			return getRuleContext(SortnamesContext.class,0);
		}
		public TerminalNode MT_sortnames_OPT() { return getToken(CrsxMetaParser.MT_sortnames_OPT, 0); }
		public TerminalNode ET_sortnames_OPT() { return getToken(CrsxMetaParser.ET_sortnames_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Sortnames_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortnames_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortnames_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortnames_OPT(this);
		}
	}

	public final Sortnames_OPTContext sortnames_OPT() throws RecognitionException {
		Sortnames_OPTContext _localctx = new Sortnames_OPTContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_sortnames_OPT);
		int _la;
		try {
			setState(2642);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(2623);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_constructor_TOK) | (1L << ET_constructor_TOK) | (1L << MT_colon_TOK) | (1L << ET_colon_TOK) | (1L << MT_at_TOK) | (1L << ET_at_TOK))) != 0) || ((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (MT_variable - 115)) | (1L << (ET_variable - 115)) | (1L << (MT_linear_OPT - 115)) | (1L << (ET_linear_OPT - 115)) | (1L << (MT_variable_TOK - 115)) | (1L << (ET_variable_TOK - 115)) | (1L << (MT_linear - 115)) | (1L << (ET_linear - 115)) | (1L << (MT_linear_TOK - 115)) | (1L << (ET_linear_TOK - 115)))) != 0) || ((((_la - 209)) & ~0x3f) == 0 && ((1L << (_la - 209)) & ((1L << (MT_sortnames - 209)) | (1L << (ET_sortnames - 209)) | (1L << (MT_sortname - 209)) | (1L << (ET_sortname - 209)) | (1L << (MT_constructor - 209)) | (1L << (ET_constructor - 209)) | (1L << (MT_qualifier - 209)) | (1L << (ET_qualifier - 209)) | (1L << (MT_reserved - 209)) | (1L << (ET_reserved - 209)) | (1L << (COLON - 209)))) != 0) || ((((_la - 275)) & ~0x3f) == 0 && ((1L << (_la - 275)) & ((1L << (LINEAR - 275)) | (1L << (AT - 275)) | (1L << (CONSTRUCTOR - 275)) | (1L << (VARIABLE - 275)))) != 0)) {
					{
					setState(2622);
					sortnames();
					}
				}

				setState(2633);
				_la = _input.LA(1);
				if (_la==MT_sortnames_OPT || _la==ET_sortnames_OPT) {
					{
					_tail();
					setState(2631);
					switch (_input.LA(1)) {
					case MT_sortnames_OPT:
						{
						_term();
						setState(2627);
						match(MT_sortnames_OPT);
						}
						break;
					case ET_sortnames_OPT:
						{
						_embed();
						setState(2629);
						match(ET_sortnames_OPT);
						setState(2630);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitOPT();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2638);
				match(MT_sortnames_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2640);
				match(ET_sortnames_OPT);
				setState(2641);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sortnames_OPT_EOFContext extends ParserRuleContext {
		public Sortnames_OPTContext sortnames_OPT() {
			return getRuleContext(Sortnames_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Sortnames_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortnames_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortnames_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortnames_OPT_EOF(this);
		}
	}

	public final Sortnames_OPT_EOFContext sortnames_OPT_EOF() throws RecognitionException {
		Sortnames_OPT_EOFContext _localctx = new Sortnames_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_sortnames_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2644);
			sortnames_OPT();
			setState(2645);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormsContext extends ParserRuleContext {
		public Forms_S1_ZOMContext forms_S1_ZOM() {
			return getRuleContext(Forms_S1_ZOMContext.class,0);
		}
		public TerminalNode MT_forms() { return getToken(CrsxMetaParser.MT_forms, 0); }
		public TerminalNode ET_forms() { return getToken(CrsxMetaParser.ET_forms, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public FormsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterForms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitForms(this);
		}
	}

	public final FormsContext forms() throws RecognitionException {
		FormsContext _localctx = new FormsContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_forms);
		try {
			setState(2656);
			switch (_input.LA(1)) {
			case EOF:
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_at_TOK:
			case ET_at_TOK:
			case MT_rpar_TOK:
			case ET_rpar_TOK:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
			case MT_linear_TOK:
			case ET_linear_TOK:
			case MT_forms_S1_ZOM:
			case ET_forms_S1_ZOM:
			case MT_forms_S1:
			case ET_forms_S1:
			case MT_form:
			case ET_form:
			case MT_constructor:
			case ET_constructor:
			case MT_qualifier:
			case ET_qualifier:
			case MT_reserved:
			case ET_reserved:
			case COLON:
			case RPAR:
			case LINEAR:
			case AT:
			case CONSTRUCTOR:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2648);
				forms_S1_ZOM();
				_exitAlt();
				}
				break;
			case MT_forms:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2652);
				match(MT_forms);
				}
				break;
			case ET_forms:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2654);
				match(ET_forms);
				setState(2655);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Forms_EOFContext extends ParserRuleContext {
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Forms_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forms_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterForms_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitForms_EOF(this);
		}
	}

	public final Forms_EOFContext forms_EOF() throws RecognitionException {
		Forms_EOFContext _localctx = new Forms_EOFContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_forms_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2658);
			forms();
			setState(2659);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Forms_S1_ZOMContext extends ParserRuleContext {
		public List<Forms_S1Context> forms_S1() {
			return getRuleContexts(Forms_S1Context.class);
		}
		public Forms_S1Context forms_S1(int i) {
			return getRuleContext(Forms_S1Context.class,i);
		}
		public TerminalNode MT_forms_S1_ZOM() { return getToken(CrsxMetaParser.MT_forms_S1_ZOM, 0); }
		public TerminalNode ET_forms_S1_ZOM() { return getToken(CrsxMetaParser.ET_forms_S1_ZOM, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Forms_S1_ZOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forms_S1_ZOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterForms_S1_ZOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitForms_S1_ZOM(this);
		}
	}

	public final Forms_S1_ZOMContext forms_S1_ZOM() throws RecognitionException {
		Forms_S1_ZOMContext _localctx = new Forms_S1_ZOMContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_forms_S1_ZOM);
		int _la;
		try {
			setState(2686);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterZOM();
				setState(2666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_constructor_TOK) | (1L << ET_constructor_TOK) | (1L << MT_colon_TOK) | (1L << ET_colon_TOK) | (1L << MT_at_TOK) | (1L << ET_at_TOK))) != 0) || ((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (MT_variable - 115)) | (1L << (ET_variable - 115)) | (1L << (MT_linear_OPT - 115)) | (1L << (ET_linear_OPT - 115)) | (1L << (MT_variable_TOK - 115)) | (1L << (ET_variable_TOK - 115)) | (1L << (MT_linear - 115)) | (1L << (ET_linear - 115)) | (1L << (MT_linear_TOK - 115)) | (1L << (ET_linear_TOK - 115)))) != 0) || ((((_la - 227)) & ~0x3f) == 0 && ((1L << (_la - 227)) & ((1L << (MT_forms_S1 - 227)) | (1L << (ET_forms_S1 - 227)) | (1L << (MT_form - 227)) | (1L << (ET_form - 227)) | (1L << (MT_constructor - 227)) | (1L << (ET_constructor - 227)) | (1L << (MT_qualifier - 227)) | (1L << (ET_qualifier - 227)) | (1L << (MT_reserved - 227)) | (1L << (ET_reserved - 227)) | (1L << (COLON - 227)) | (1L << (LINEAR - 227)) | (1L << (AT - 227)) | (1L << (CONSTRUCTOR - 227)) | (1L << (VARIABLE - 227)))) != 0)) {
					{
					{
					setState(2663);
					forms_S1();
					}
					}
					setState(2668);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2677);
				_la = _input.LA(1);
				if (_la==MT_forms_S1_ZOM || _la==ET_forms_S1_ZOM) {
					{
					_tail();
					setState(2675);
					switch (_input.LA(1)) {
					case MT_forms_S1_ZOM:
						{
						_term();
						setState(2671);
						match(MT_forms_S1_ZOM);
						}
						break;
					case ET_forms_S1_ZOM:
						{
						_embed();
						setState(2673);
						match(ET_forms_S1_ZOM);
						setState(2674);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitZOM();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2682);
				match(MT_forms_S1_ZOM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2684);
				match(ET_forms_S1_ZOM);
				setState(2685);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Forms_S1_ZOM_EOFContext extends ParserRuleContext {
		public Forms_S1_ZOMContext forms_S1_ZOM() {
			return getRuleContext(Forms_S1_ZOMContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Forms_S1_ZOM_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forms_S1_ZOM_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterForms_S1_ZOM_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitForms_S1_ZOM_EOF(this);
		}
	}

	public final Forms_S1_ZOM_EOFContext forms_S1_ZOM_EOF() throws RecognitionException {
		Forms_S1_ZOM_EOFContext _localctx = new Forms_S1_ZOM_EOFContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_forms_S1_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2688);
			forms_S1_ZOM();
			setState(2689);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Forms_S1Context extends ParserRuleContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public Semi_TOKContext semi_TOK() {
			return getRuleContext(Semi_TOKContext.class,0);
		}
		public TerminalNode MT_forms_S1() { return getToken(CrsxMetaParser.MT_forms_S1, 0); }
		public TerminalNode ET_forms_S1() { return getToken(CrsxMetaParser.ET_forms_S1, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Forms_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forms_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterForms_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitForms_S1(this);
		}
	}

	public final Forms_S1Context forms_S1() throws RecognitionException {
		Forms_S1Context _localctx = new Forms_S1Context(_ctx, getState());
		enterRule(_localctx, 452, RULE_forms_S1);
		try {
			setState(2701);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_at_TOK:
			case ET_at_TOK:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
			case MT_linear_TOK:
			case ET_linear_TOK:
			case MT_form:
			case ET_form:
			case MT_constructor:
			case ET_constructor:
			case MT_qualifier:
			case ET_qualifier:
			case MT_reserved:
			case ET_reserved:
			case COLON:
			case LINEAR:
			case AT:
			case CONSTRUCTOR:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2692);
				form();
				setState(2693);
				semi_TOK();
				_exitAlt();
				}
				break;
			case MT_forms_S1:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2697);
				match(MT_forms_S1);
				}
				break;
			case ET_forms_S1:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2699);
				match(ET_forms_S1);
				setState(2700);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Forms_S1_EOFContext extends ParserRuleContext {
		public Forms_S1Context forms_S1() {
			return getRuleContext(Forms_S1Context.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Forms_S1_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forms_S1_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterForms_S1_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitForms_S1_EOF(this);
		}
	}

	public final Forms_S1_EOFContext forms_S1_EOF() throws RecognitionException {
		Forms_S1_EOFContext _localctx = new Forms_S1_EOFContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_forms_S1_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2703);
			forms_S1();
			setState(2704);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormContext extends ParserRuleContext {
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public Arguments_OPTContext arguments_OPT() {
			return getRuleContext(Arguments_OPTContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode MT_form() { return getToken(CrsxMetaParser.MT_form, 0); }
		public TerminalNode ET_form() { return getToken(CrsxMetaParser.ET_form, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitForm(this);
		}
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_form);
		try {
			setState(2720);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_at_TOK:
			case ET_at_TOK:
			case MT_constructor:
			case ET_constructor:
			case MT_qualifier:
			case ET_qualifier:
			case MT_reserved:
			case ET_reserved:
			case COLON:
			case AT:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(2707);
				constructor();
				setState(2708);
				arguments_OPT();
				_exitAlt();
				}
				break;
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
			case MT_linear_TOK:
			case ET_linear_TOK:
			case LINEAR:
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(2712);
				variable();
				_exitAlt();
				}
				break;
			case MT_form:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(2716);
				match(MT_form);
				}
				break;
			case ET_form:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(2718);
				match(ET_form);
				setState(2719);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Form_EOFContext extends ParserRuleContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Form_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterForm_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitForm_EOF(this);
		}
	}

	public final Form_EOFContext form_EOF() throws RecognitionException {
		Form_EOFContext _localctx = new Form_EOFContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_form_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2722);
			form();
			setState(2723);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorContext extends ParserRuleContext {
		public QualifierContext qualifier() {
			return getRuleContext(QualifierContext.class,0);
		}
		public Constructor_TOKContext constructor_TOK() {
			return getRuleContext(Constructor_TOKContext.class,0);
		}
		public ReservedContext reserved() {
			return getRuleContext(ReservedContext.class,0);
		}
		public TerminalNode MT_constructor() { return getToken(CrsxMetaParser.MT_constructor, 0); }
		public TerminalNode ET_constructor() { return getToken(CrsxMetaParser.ET_constructor, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitConstructor(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_constructor);
		try {
			setState(2739);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_qualifier:
			case ET_qualifier:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(2726);
				qualifier();
				setState(2727);
				constructor_TOK();
				_exitAlt();
				}
				break;
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_at_TOK:
			case ET_at_TOK:
			case MT_reserved:
			case ET_reserved:
			case COLON:
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(2731);
				reserved();
				_exitAlt();
				}
				break;
			case MT_constructor:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(2735);
				match(MT_constructor);
				}
				break;
			case ET_constructor:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(2737);
				match(ET_constructor);
				setState(2738);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_EOFContext extends ParserRuleContext {
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Constructor_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterConstructor_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitConstructor_EOF(this);
		}
	}

	public final Constructor_EOFContext constructor_EOF() throws RecognitionException {
		Constructor_EOFContext _localctx = new Constructor_EOFContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_constructor_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2741);
			constructor();
			setState(2742);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifierContext extends ParserRuleContext {
		public Constructor_TOKContext constructor_TOK() {
			return getRuleContext(Constructor_TOKContext.class,0);
		}
		public Dot_TOKContext dot_TOK() {
			return getRuleContext(Dot_TOKContext.class,0);
		}
		public QualifierContext qualifier() {
			return getRuleContext(QualifierContext.class,0);
		}
		public TerminalNode MT_qualifier() { return getToken(CrsxMetaParser.MT_qualifier, 0); }
		public TerminalNode ET_qualifier() { return getToken(CrsxMetaParser.ET_qualifier, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public QualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitQualifier(this);
		}
	}

	public final QualifierContext qualifier() throws RecognitionException {
		QualifierContext _localctx = new QualifierContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_qualifier);
		try {
			setState(2757);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(2745);
				constructor_TOK();
				setState(2746);
				dot_TOK();
				setState(2747);
				qualifier();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(2753);
				match(MT_qualifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(2755);
				match(ET_qualifier);
				setState(2756);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualifier_EOFContext extends ParserRuleContext {
		public QualifierContext qualifier() {
			return getRuleContext(QualifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Qualifier_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifier_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterQualifier_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitQualifier_EOF(this);
		}
	}

	public final Qualifier_EOFContext qualifier_EOF() throws RecognitionException {
		Qualifier_EOFContext _localctx = new Qualifier_EOFContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_qualifier_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2759);
			qualifier();
			setState(2760);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReservedContext extends ParserRuleContext {
		public Colon_TOKContext colon_TOK() {
			return getRuleContext(Colon_TOKContext.class,0);
		}
		public At_TOKContext at_TOK() {
			return getRuleContext(At_TOKContext.class,0);
		}
		public TerminalNode MT_reserved() { return getToken(CrsxMetaParser.MT_reserved, 0); }
		public TerminalNode ET_reserved() { return getToken(CrsxMetaParser.ET_reserved, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public ReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitReserved(this);
		}
	}

	public final ReservedContext reserved() throws RecognitionException {
		ReservedContext _localctx = new ReservedContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_reserved);
		try {
			setState(2775);
			switch (_input.LA(1)) {
			case MT_colon_TOK:
			case ET_colon_TOK:
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(2763);
				colon_TOK();
				_exitAlt();
				}
				break;
			case MT_at_TOK:
			case ET_at_TOK:
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(2767);
				at_TOK();
				_exitAlt();
				}
				break;
			case MT_reserved:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(2771);
				match(MT_reserved);
				}
				break;
			case ET_reserved:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(2773);
				match(ET_reserved);
				setState(2774);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reserved_EOFContext extends ParserRuleContext {
		public ReservedContext reserved() {
			return getRuleContext(ReservedContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Reserved_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reserved_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterReserved_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitReserved_EOF(this);
		}
	}

	public final Reserved_EOFContext reserved_EOF() throws RecognitionException {
		Reserved_EOFContext _localctx = new Reserved_EOFContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_reserved_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2777);
			reserved();
			setState(2778);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveContext extends ParserRuleContext {
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public DirectiveArguments_OPTContext directiveArguments_OPT() {
			return getRuleContext(DirectiveArguments_OPTContext.class,0);
		}
		public DirectiveListContext directiveList() {
			return getRuleContext(DirectiveListContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ConcreteContext concrete() {
			return getRuleContext(ConcreteContext.class,0);
		}
		public TerminalNode MT_directive() { return getToken(CrsxMetaParser.MT_directive, 0); }
		public TerminalNode ET_directive() { return getToken(CrsxMetaParser.ET_directive, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDirective(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_directive);
		try {
			setState(2802);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_at_TOK:
			case ET_at_TOK:
			case MT_constructor:
			case ET_constructor:
			case MT_qualifier:
			case ET_qualifier:
			case MT_reserved:
			case ET_reserved:
			case COLON:
			case AT:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(2781);
				constructor();
				setState(2782);
				directiveArguments_OPT();
				_exitAlt();
				}
				break;
			case MT_lpar_TOK:
			case ET_lpar_TOK:
			case MT_directiveList:
			case ET_directiveList:
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(2786);
				directiveList();
				_exitAlt();
				}
				break;
			case MT_literal:
			case ET_literal:
			case MT_string_TOK:
			case ET_string_TOK:
			case MT_number_TOK:
			case ET_number_TOK:
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(2790);
				literal();
				_exitAlt();
				}
				break;
			case MT_concrete:
			case ET_concrete:
			case MT_category_TOK:
			case ET_category_TOK:
			case CATEGORY:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(2794);
				concrete();
				_exitAlt();
				}
				break;
			case MT_directive:
				enterOuterAlt(_localctx, 5);
				{
				_term();
				setState(2798);
				match(MT_directive);
				}
				break;
			case ET_directive:
				enterOuterAlt(_localctx, 6);
				{
				_embed();
				setState(2800);
				match(ET_directive);
				setState(2801);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Directive_EOFContext extends ParserRuleContext {
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Directive_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDirective_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDirective_EOF(this);
		}
	}

	public final Directive_EOFContext directive_EOF() throws RecognitionException {
		Directive_EOFContext _localctx = new Directive_EOFContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_directive_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2804);
			directive();
			setState(2805);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveArguments_OPTContext extends ParserRuleContext {
		public DirectiveArgumentsContext directiveArguments() {
			return getRuleContext(DirectiveArgumentsContext.class,0);
		}
		public TerminalNode MT_directiveArguments_OPT() { return getToken(CrsxMetaParser.MT_directiveArguments_OPT, 0); }
		public TerminalNode ET_directiveArguments_OPT() { return getToken(CrsxMetaParser.ET_directiveArguments_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public DirectiveArguments_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveArguments_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDirectiveArguments_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDirectiveArguments_OPT(this);
		}
	}

	public final DirectiveArguments_OPTContext directiveArguments_OPT() throws RecognitionException {
		DirectiveArguments_OPTContext _localctx = new DirectiveArguments_OPTContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_directiveArguments_OPT);
		int _la;
		try {
			setState(2829);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(2810);
				_la = _input.LA(1);
				if (_la==MT_lsquare_TOK || _la==ET_lsquare_TOK || ((((_la - 241)) & ~0x3f) == 0 && ((1L << (_la - 241)) & ((1L << (MT_directiveArguments - 241)) | (1L << (ET_directiveArguments - 241)) | (1L << (LSQUARE - 241)))) != 0)) {
					{
					setState(2809);
					directiveArguments();
					}
				}

				setState(2820);
				_la = _input.LA(1);
				if (_la==MT_directiveArguments_OPT || _la==ET_directiveArguments_OPT) {
					{
					_tail();
					setState(2818);
					switch (_input.LA(1)) {
					case MT_directiveArguments_OPT:
						{
						_term();
						setState(2814);
						match(MT_directiveArguments_OPT);
						}
						break;
					case ET_directiveArguments_OPT:
						{
						_embed();
						setState(2816);
						match(ET_directiveArguments_OPT);
						setState(2817);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitOPT();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2825);
				match(MT_directiveArguments_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2827);
				match(ET_directiveArguments_OPT);
				setState(2828);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveArguments_OPT_EOFContext extends ParserRuleContext {
		public DirectiveArguments_OPTContext directiveArguments_OPT() {
			return getRuleContext(DirectiveArguments_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public DirectiveArguments_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveArguments_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDirectiveArguments_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDirectiveArguments_OPT_EOF(this);
		}
	}

	public final DirectiveArguments_OPT_EOFContext directiveArguments_OPT_EOF() throws RecognitionException {
		DirectiveArguments_OPT_EOFContext _localctx = new DirectiveArguments_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_directiveArguments_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2831);
			directiveArguments_OPT();
			setState(2832);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveArgumentsContext extends ParserRuleContext {
		public Lsquare_TOKContext lsquare_TOK() {
			return getRuleContext(Lsquare_TOKContext.class,0);
		}
		public Directives_OPTContext directives_OPT() {
			return getRuleContext(Directives_OPTContext.class,0);
		}
		public Rsquare_TOKContext rsquare_TOK() {
			return getRuleContext(Rsquare_TOKContext.class,0);
		}
		public TerminalNode MT_directiveArguments() { return getToken(CrsxMetaParser.MT_directiveArguments, 0); }
		public TerminalNode ET_directiveArguments() { return getToken(CrsxMetaParser.ET_directiveArguments, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public DirectiveArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDirectiveArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDirectiveArguments(this);
		}
	}

	public final DirectiveArgumentsContext directiveArguments() throws RecognitionException {
		DirectiveArgumentsContext _localctx = new DirectiveArgumentsContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_directiveArguments);
		try {
			setState(2845);
			switch (_input.LA(1)) {
			case MT_lsquare_TOK:
			case ET_lsquare_TOK:
			case LSQUARE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2835);
				lsquare_TOK();
				setState(2836);
				directives_OPT();
				setState(2837);
				rsquare_TOK();
				_exitAlt();
				}
				break;
			case MT_directiveArguments:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2841);
				match(MT_directiveArguments);
				}
				break;
			case ET_directiveArguments:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2843);
				match(ET_directiveArguments);
				setState(2844);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveArguments_EOFContext extends ParserRuleContext {
		public DirectiveArgumentsContext directiveArguments() {
			return getRuleContext(DirectiveArgumentsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public DirectiveArguments_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveArguments_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDirectiveArguments_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDirectiveArguments_EOF(this);
		}
	}

	public final DirectiveArguments_EOFContext directiveArguments_EOF() throws RecognitionException {
		DirectiveArguments_EOFContext _localctx = new DirectiveArguments_EOFContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_directiveArguments_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2847);
			directiveArguments();
			setState(2848);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Directives_OPTContext extends ParserRuleContext {
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public TerminalNode MT_directives_OPT() { return getToken(CrsxMetaParser.MT_directives_OPT, 0); }
		public TerminalNode ET_directives_OPT() { return getToken(CrsxMetaParser.ET_directives_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Directives_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directives_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDirectives_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDirectives_OPT(this);
		}
	}

	public final Directives_OPTContext directives_OPT() throws RecognitionException {
		Directives_OPTContext _localctx = new Directives_OPTContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_directives_OPT);
		int _la;
		try {
			setState(2872);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(2853);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_constructor_TOK) | (1L << ET_constructor_TOK) | (1L << MT_colon_TOK) | (1L << ET_colon_TOK) | (1L << MT_at_TOK) | (1L << ET_at_TOK))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (MT_lpar_TOK - 101)) | (1L << (ET_lpar_TOK - 101)) | (1L << (MT_literal - 101)) | (1L << (ET_literal - 101)) | (1L << (MT_string_TOK - 101)) | (1L << (ET_string_TOK - 101)) | (1L << (MT_number_TOK - 101)) | (1L << (ET_number_TOK - 101)) | (1L << (MT_concrete - 101)) | (1L << (ET_concrete - 101)) | (1L << (MT_category_TOK - 101)) | (1L << (ET_category_TOK - 101)))) != 0) || ((((_la - 231)) & ~0x3f) == 0 && ((1L << (_la - 231)) & ((1L << (MT_constructor - 231)) | (1L << (ET_constructor - 231)) | (1L << (MT_qualifier - 231)) | (1L << (ET_qualifier - 231)) | (1L << (MT_reserved - 231)) | (1L << (ET_reserved - 231)) | (1L << (MT_directive - 231)) | (1L << (ET_directive - 231)) | (1L << (MT_directives - 231)) | (1L << (ET_directives - 231)) | (1L << (MT_directiveList - 231)) | (1L << (ET_directiveList - 231)) | (1L << (COLON - 231)) | (1L << (LPAR - 231)) | (1L << (AT - 231)) | (1L << (CATEGORY - 231)) | (1L << (CONSTRUCTOR - 231)) | (1L << (STRING - 231)) | (1L << (NUMBER - 231)))) != 0)) {
					{
					setState(2852);
					directives();
					}
				}

				setState(2863);
				_la = _input.LA(1);
				if (_la==MT_directives_OPT || _la==ET_directives_OPT) {
					{
					_tail();
					setState(2861);
					switch (_input.LA(1)) {
					case MT_directives_OPT:
						{
						_term();
						setState(2857);
						match(MT_directives_OPT);
						}
						break;
					case ET_directives_OPT:
						{
						_embed();
						setState(2859);
						match(ET_directives_OPT);
						setState(2860);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitOPT();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2868);
				match(MT_directives_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2870);
				match(ET_directives_OPT);
				setState(2871);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Directives_OPT_EOFContext extends ParserRuleContext {
		public Directives_OPTContext directives_OPT() {
			return getRuleContext(Directives_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Directives_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directives_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDirectives_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDirectives_OPT_EOF(this);
		}
	}

	public final Directives_OPT_EOFContext directives_OPT_EOF() throws RecognitionException {
		Directives_OPT_EOFContext _localctx = new Directives_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_directives_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2874);
			directives_OPT();
			setState(2875);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectivesContext extends ParserRuleContext {
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public Directives_S1_ZOMContext directives_S1_ZOM() {
			return getRuleContext(Directives_S1_ZOMContext.class,0);
		}
		public TerminalNode MT_directives() { return getToken(CrsxMetaParser.MT_directives, 0); }
		public TerminalNode ET_directives() { return getToken(CrsxMetaParser.ET_directives, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public DirectivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDirectives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDirectives(this);
		}
	}

	public final DirectivesContext directives() throws RecognitionException {
		DirectivesContext _localctx = new DirectivesContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_directives);
		try {
			setState(2887);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_at_TOK:
			case ET_at_TOK:
			case MT_lpar_TOK:
			case ET_lpar_TOK:
			case MT_literal:
			case ET_literal:
			case MT_string_TOK:
			case ET_string_TOK:
			case MT_number_TOK:
			case ET_number_TOK:
			case MT_concrete:
			case ET_concrete:
			case MT_category_TOK:
			case ET_category_TOK:
			case MT_constructor:
			case ET_constructor:
			case MT_qualifier:
			case ET_qualifier:
			case MT_reserved:
			case ET_reserved:
			case MT_directive:
			case ET_directive:
			case MT_directiveList:
			case ET_directiveList:
			case COLON:
			case LPAR:
			case AT:
			case CATEGORY:
			case CONSTRUCTOR:
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2878);
				directive();
				setState(2879);
				directives_S1_ZOM();
				_exitAlt();
				}
				break;
			case MT_directives:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2883);
				match(MT_directives);
				}
				break;
			case ET_directives:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2885);
				match(ET_directives);
				setState(2886);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Directives_EOFContext extends ParserRuleContext {
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Directives_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directives_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDirectives_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDirectives_EOF(this);
		}
	}

	public final Directives_EOFContext directives_EOF() throws RecognitionException {
		Directives_EOFContext _localctx = new Directives_EOFContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_directives_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2889);
			directives();
			setState(2890);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Directives_S1_ZOMContext extends ParserRuleContext {
		public List<Directives_S1Context> directives_S1() {
			return getRuleContexts(Directives_S1Context.class);
		}
		public Directives_S1Context directives_S1(int i) {
			return getRuleContext(Directives_S1Context.class,i);
		}
		public TerminalNode MT_directives_S1_ZOM() { return getToken(CrsxMetaParser.MT_directives_S1_ZOM, 0); }
		public TerminalNode ET_directives_S1_ZOM() { return getToken(CrsxMetaParser.ET_directives_S1_ZOM, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Directives_S1_ZOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directives_S1_ZOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDirectives_S1_ZOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDirectives_S1_ZOM(this);
		}
	}

	public final Directives_S1_ZOMContext directives_S1_ZOM() throws RecognitionException {
		Directives_S1_ZOMContext _localctx = new Directives_S1_ZOMContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_directives_S1_ZOM);
		int _la;
		try {
			setState(2917);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterZOM();
				setState(2897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MT_comma_TOK || _la==ET_comma_TOK || ((((_la - 249)) & ~0x3f) == 0 && ((1L << (_la - 249)) & ((1L << (MT_directives_S1 - 249)) | (1L << (ET_directives_S1 - 249)) | (1L << (COMMA - 249)))) != 0)) {
					{
					{
					setState(2894);
					directives_S1();
					}
					}
					setState(2899);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2908);
				_la = _input.LA(1);
				if (_la==MT_directives_S1_ZOM || _la==ET_directives_S1_ZOM) {
					{
					_tail();
					setState(2906);
					switch (_input.LA(1)) {
					case MT_directives_S1_ZOM:
						{
						_term();
						setState(2902);
						match(MT_directives_S1_ZOM);
						}
						break;
					case ET_directives_S1_ZOM:
						{
						_embed();
						setState(2904);
						match(ET_directives_S1_ZOM);
						setState(2905);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitZOM();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2913);
				match(MT_directives_S1_ZOM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2915);
				match(ET_directives_S1_ZOM);
				setState(2916);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Directives_S1_ZOM_EOFContext extends ParserRuleContext {
		public Directives_S1_ZOMContext directives_S1_ZOM() {
			return getRuleContext(Directives_S1_ZOMContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Directives_S1_ZOM_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directives_S1_ZOM_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDirectives_S1_ZOM_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDirectives_S1_ZOM_EOF(this);
		}
	}

	public final Directives_S1_ZOM_EOFContext directives_S1_ZOM_EOF() throws RecognitionException {
		Directives_S1_ZOM_EOFContext _localctx = new Directives_S1_ZOM_EOFContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_directives_S1_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2919);
			directives_S1_ZOM();
			setState(2920);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Directives_S1Context extends ParserRuleContext {
		public Comma_TOKContext comma_TOK() {
			return getRuleContext(Comma_TOKContext.class,0);
		}
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public TerminalNode MT_directives_S1() { return getToken(CrsxMetaParser.MT_directives_S1, 0); }
		public TerminalNode ET_directives_S1() { return getToken(CrsxMetaParser.ET_directives_S1, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Directives_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directives_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDirectives_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDirectives_S1(this);
		}
	}

	public final Directives_S1Context directives_S1() throws RecognitionException {
		Directives_S1Context _localctx = new Directives_S1Context(_ctx, getState());
		enterRule(_localctx, 496, RULE_directives_S1);
		try {
			setState(2932);
			switch (_input.LA(1)) {
			case MT_comma_TOK:
			case ET_comma_TOK:
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2923);
				comma_TOK();
				setState(2924);
				directive();
				_exitAlt();
				}
				break;
			case MT_directives_S1:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2928);
				match(MT_directives_S1);
				}
				break;
			case ET_directives_S1:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2930);
				match(ET_directives_S1);
				setState(2931);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Directives_S1_EOFContext extends ParserRuleContext {
		public Directives_S1Context directives_S1() {
			return getRuleContext(Directives_S1Context.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Directives_S1_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directives_S1_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDirectives_S1_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDirectives_S1_EOF(this);
		}
	}

	public final Directives_S1_EOFContext directives_S1_EOF() throws RecognitionException {
		Directives_S1_EOFContext _localctx = new Directives_S1_EOFContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_directives_S1_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2934);
			directives_S1();
			setState(2935);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveListContext extends ParserRuleContext {
		public Lpar_TOKContext lpar_TOK() {
			return getRuleContext(Lpar_TOKContext.class,0);
		}
		public Declarations_OPTContext declarations_OPT() {
			return getRuleContext(Declarations_OPTContext.class,0);
		}
		public Rpar_TOKContext rpar_TOK() {
			return getRuleContext(Rpar_TOKContext.class,0);
		}
		public TerminalNode MT_directiveList() { return getToken(CrsxMetaParser.MT_directiveList, 0); }
		public TerminalNode ET_directiveList() { return getToken(CrsxMetaParser.ET_directiveList, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public DirectiveListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDirectiveList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDirectiveList(this);
		}
	}

	public final DirectiveListContext directiveList() throws RecognitionException {
		DirectiveListContext _localctx = new DirectiveListContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_directiveList);
		try {
			setState(2948);
			switch (_input.LA(1)) {
			case MT_lpar_TOK:
			case ET_lpar_TOK:
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2938);
				lpar_TOK();
				setState(2939);
				declarations_OPT();
				setState(2940);
				rpar_TOK();
				_exitAlt();
				}
				break;
			case MT_directiveList:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2944);
				match(MT_directiveList);
				}
				break;
			case ET_directiveList:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2946);
				match(ET_directiveList);
				setState(2947);
				match(CRSX_EMBED_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveList_EOFContext extends ParserRuleContext {
		public DirectiveListContext directiveList() {
			return getRuleContext(DirectiveListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public DirectiveList_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveList_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDirectiveList_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDirectiveList_EOF(this);
		}
	}

	public final DirectiveList_EOFContext directiveList_EOF() throws RecognitionException {
		DirectiveList_EOFContext _localctx = new DirectiveList_EOFContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_directiveList_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2950);
			directiveList();
			setState(2951);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declarations_OPTContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode MT_declarations_OPT() { return getToken(CrsxMetaParser.MT_declarations_OPT, 0); }
		public TerminalNode ET_declarations_OPT() { return getToken(CrsxMetaParser.ET_declarations_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Declarations_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDeclarations_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDeclarations_OPT(this);
		}
	}

	public final Declarations_OPTContext declarations_OPT() throws RecognitionException {
		Declarations_OPTContext _localctx = new Declarations_OPTContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_declarations_OPT);
		int _la;
		try {
			setState(2975);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(2956);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_declarations) | (1L << ET_declarations) | (1L << MT_declaration) | (1L << ET_declaration) | (1L << MT_moduleDeclaration) | (1L << ET_moduleDeclaration) | (1L << MT_module_TOK) | (1L << ET_module_TOK) | (1L << MT_constructor_TOK) | (1L << ET_constructor_TOK) | (1L << MT_lbrace_TOK) | (1L << ET_lbrace_TOK) | (1L << MT_importDeclaration) | (1L << ET_importDeclaration) | (1L << MT_import_TOK) | (1L << ET_import_TOK) | (1L << MT_ruleDeclaration) | (1L << ET_ruleDeclaration) | (1L << MT_option_OPT) | (1L << ET_option_OPT) | (1L << MT_option) | (1L << ET_option) | (1L << MT_colon_TOK) | (1L << ET_colon_TOK) | (1L << MT_pattern) | (1L << ET_pattern) | (1L << MT_properties_OPT) | (1L << ET_properties_OPT) | (1L << MT_annotations) | (1L << ET_annotations) | (1L << MT_annotation_OOM) | (1L << ET_annotation_OOM) | (1L << MT_annotation) | (1L << ET_annotation) | (1L << MT_at_TOK) | (1L << ET_at_TOK))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (MT_lpar_TOK - 101)) | (1L << (ET_lpar_TOK - 101)) | (1L << (MT_variable - 101)) | (1L << (ET_variable - 101)) | (1L << (MT_linear_OPT - 101)) | (1L << (ET_linear_OPT - 101)) | (1L << (MT_variable_TOK - 101)) | (1L << (ET_variable_TOK - 101)) | (1L << (MT_linear - 101)) | (1L << (ET_linear - 101)) | (1L << (MT_linear_TOK - 101)) | (1L << (ET_linear_TOK - 101)) | (1L << (MT_literal - 101)) | (1L << (ET_literal - 101)) | (1L << (MT_string_TOK - 101)) | (1L << (ET_string_TOK - 101)) | (1L << (MT_number_TOK - 101)) | (1L << (ET_number_TOK - 101)) | (1L << (MT_concrete - 101)) | (1L << (ET_concrete - 101)) | (1L << (MT_category_TOK - 101)) | (1L << (ET_category_TOK - 101)))) != 0) || ((((_la - 177)) & ~0x3f) == 0 && ((1L << (_la - 177)) & ((1L << (MT_properties - 177)) | (1L << (ET_properties - 177)) | (1L << (MT_sortDeclaration - 177)) | (1L << (ET_sortDeclaration - 177)) | (1L << (MT_sortparams_OPT - 177)) | (1L << (ET_sortparams_OPT - 177)) | (1L << (MT_sortparams - 177)) | (1L << (ET_sortparams - 177)) | (1L << (MT_forall_TOK - 177)) | (1L << (ET_forall_TOK - 177)) | (1L << (MT_sortset - 177)) | (1L << (ET_sortset - 177)) | (1L << (MT_sortname - 177)) | (1L << (ET_sortname - 177)) | (1L << (MT_form - 177)) | (1L << (ET_form - 177)) | (1L << (MT_constructor - 177)) | (1L << (ET_constructor - 177)) | (1L << (MT_qualifier - 177)) | (1L << (ET_qualifier - 177)) | (1L << (MT_reserved - 177)) | (1L << (ET_reserved - 177)) | (1L << (MT_directive - 177)) | (1L << (ET_directive - 177)))) != 0) || ((((_la - 251)) & ~0x3f) == 0 && ((1L << (_la - 251)) & ((1L << (MT_directiveList - 251)) | (1L << (ET_directiveList - 251)) | (1L << (MODULE - 251)) | (1L << (IMPORT - 251)) | (1L << (COLON - 251)) | (1L << (FORALL - 251)) | (1L << (LPAR - 251)) | (1L << (LBRACE - 251)) | (1L << (LINEAR - 251)) | (1L << (AT - 251)) | (1L << (CATEGORY - 251)) | (1L << (CONSTRUCTOR - 251)) | (1L << (VARIABLE - 251)) | (1L << (STRING - 251)) | (1L << (NUMBER - 251)))) != 0)) {
					{
					setState(2955);
					declarations();
					}
				}

				setState(2966);
				_la = _input.LA(1);
				if (_la==MT_declarations_OPT || _la==ET_declarations_OPT) {
					{
					_tail();
					setState(2964);
					switch (_input.LA(1)) {
					case MT_declarations_OPT:
						{
						_term();
						setState(2960);
						match(MT_declarations_OPT);
						}
						break;
					case ET_declarations_OPT:
						{
						_embed();
						setState(2962);
						match(ET_declarations_OPT);
						setState(2963);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				_exitOPT();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2971);
				match(MT_declarations_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2973);
				match(ET_declarations_OPT);
				setState(2974);
				match(CRSX_EMBED_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declarations_OPT_EOFContext extends ParserRuleContext {
		public Declarations_OPTContext declarations_OPT() {
			return getRuleContext(Declarations_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Declarations_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDeclarations_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDeclarations_OPT_EOF(this);
		}
	}

	public final Declarations_OPT_EOFContext declarations_OPT_EOF() throws RecognitionException {
		Declarations_OPT_EOFContext _localctx = new Declarations_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 506, RULE_declarations_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2977);
			declarations_OPT();
			setState(2978);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0127\u0ba7\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\4\u00fd\t\u00fd\4\u00fe\t\u00fe"+
		"\4\u00ff\t\u00ff\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0208\n\2\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0217\n\4\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\7\6\u021f\n\6\f\6\16\6\u0222\13\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u022a\n\6\5\6\u022c\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0235"+
		"\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0244\n\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0251\n\n\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\5\f\u0259\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0261\n\f\5"+
		"\f\u0263\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u026c\n\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u028a\n\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u029c\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u02a9\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u02b6\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u02c3\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u02d0\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u02eb\n\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u02f8\n\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u0305\n\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \5 \u0316\n \3!\3!\3!\3\"\3\"\3\"\5\"\u031e\n\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\5\"\u0326\n\"\5\"\u0328\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0331"+
		"\n\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\5$\u033e\n$\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0352\n&\3\'\3\'\3\'\3(\3(\3(\5"+
		"(\u035a\n(\3(\3(\3(\3(\3(\3(\5(\u0362\n(\5(\u0364\n(\3(\3(\3(\3(\3(\3"+
		"(\3(\5(\u036d\n(\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\5*\u037a\n*\3+\3+\3"+
		"+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u038a\n,\3-\3-\3-\3.\3.\3.\5.\u0392"+
		"\n.\3.\3.\3.\3.\3.\3.\5.\u039a\n.\5.\u039c\n.\3.\3.\3.\3.\3.\3.\3.\5."+
		"\u03a5\n.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u03b3"+
		"\n\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62"+
		"\u03c1\n\62\3\63\3\63\3\63\3\64\3\64\3\64\6\64\u03c9\n\64\r\64\16\64\u03ca"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u03d3\n\64\5\64\u03d5\n\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u03df\n\64\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u03ef\n\66\3\67"+
		"\3\67\3\67\38\38\38\38\38\38\38\38\58\u03fc\n8\39\39\39\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\5:\u040e\n:\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\5<\u044d\n<\3=\3=\3=\3>\3>\3>\5>\u0455\n>\3>\3>\3>\3>\3"+
		">\3>\5>\u045d\n>\5>\u045f\n>\3>\3>\3>\3>\3>\3>\3>\5>\u0468\n>\3?\3?\3"+
		"?\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0475\n@\3A\3A\3A\3B\3B\3B\5B\u047d\nB\3"+
		"B\3B\3B\3B\3B\3B\5B\u0485\nB\5B\u0487\nB\3B\3B\3B\3B\3B\3B\3B\5B\u0490"+
		"\nB\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u049f\nD\3E\3E\3E\3F\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u04b3\nF\3G\3G\3G\3H\3H\3H"+
		"\3H\3H\3H\3H\3H\5H\u04c0\nH\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J"+
		"\5J\u04d0\nJ\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\5L\u04dd\nL\3M\3M\3M\3N"+
		"\3N\3N\5N\u04e5\nN\3N\3N\3N\3N\3N\3N\5N\u04ed\nN\5N\u04ef\nN\3N\3N\3N"+
		"\3N\3N\3N\3N\5N\u04f8\nN\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\5P\u0505\nP"+
		"\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u0514\nR\3S\3S\3S\3T\3T\3T"+
		"\7T\u051c\nT\fT\16T\u051f\13T\3T\3T\3T\3T\3T\3T\5T\u0527\nT\5T\u0529\n"+
		"T\3T\3T\3T\3T\3T\3T\3T\5T\u0532\nT\3U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3V\3"+
		"V\3V\5V\u0541\nV\3W\3W\3W\3X\3X\3X\3X\3X\3X\3X\3X\5X\u054e\nX\3Y\3Y\3"+
		"Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u055e\nZ\3[\3[\3[\3\\\3\\\3\\\5"+
		"\\\u0566\n\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u056e\n\\\5\\\u0570\n\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\5\\\u0579\n\\\3]\3]\3]\3^\3^\3^\3^\3^\3^\3^\3^"+
		"\3^\3^\5^\u0588\n^\3_\3_\3_\3`\3`\3`\7`\u0590\n`\f`\16`\u0593\13`\3`\3"+
		"`\3`\3`\3`\3`\5`\u059b\n`\5`\u059d\n`\3`\3`\3`\3`\3`\3`\3`\5`\u05a6\n"+
		"`\3a\3a\3a\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u05b5\nb\3c\3c\3c\3d\3d\3"+
		"d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u05c5\nd\3e\3e\3e\3f\3f\3f\3f\3f\3f\3f\3"+
		"f\5f\u05d2\nf\3g\3g\3g\3h\3h\3h\5h\u05da\nh\3h\3h\3h\3h\3h\3h\5h\u05e2"+
		"\nh\5h\u05e4\nh\3h\3h\3h\3h\3h\3h\3h\5h\u05ed\nh\3i\3i\3i\3j\3j\3j\3j"+
		"\3j\3j\3j\3j\5j\u05fa\nj\3k\3k\3k\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\5l\u0609"+
		"\nl\3m\3m\3m\3n\3n\3n\7n\u0611\nn\fn\16n\u0614\13n\3n\3n\3n\3n\3n\3n\5"+
		"n\u061c\nn\5n\u061e\nn\3n\3n\3n\3n\3n\3n\3n\5n\u0627\nn\3o\3o\3o\3p\3"+
		"p\3p\3p\3p\3p\3p\3p\3p\3p\5p\u0636\np\3q\3q\3q\3r\3r\3r\5r\u063e\nr\3"+
		"r\3r\3r\3r\3r\3r\5r\u0646\nr\5r\u0648\nr\3r\3r\3r\3r\3r\3r\3r\5r\u0651"+
		"\nr\3s\3s\3s\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\5t\u0663\nt\3u\3u"+
		"\3u\3v\3v\3v\5v\u066b\nv\3v\3v\3v\3v\3v\3v\5v\u0673\nv\5v\u0675\nv\3v"+
		"\3v\3v\3v\3v\3v\3v\5v\u067e\nv\3w\3w\3w\3x\3x\3x\3x\3x\3x\3x\3x\5x\u068b"+
		"\nx\3y\3y\3y\3z\3z\3z\5z\u0693\nz\3z\3z\3z\3z\3z\3z\5z\u069b\nz\5z\u069d"+
		"\nz\3z\3z\3z\3z\3z\3z\3z\5z\u06a6\nz\3{\3{\3{\3|\3|\3|\5|\u06ae\n|\3|"+
		"\3|\3|\3|\3|\3|\5|\u06b6\n|\5|\u06b8\n|\3|\3|\3|\3|\3|\3|\3|\5|\u06c1"+
		"\n|\3}\3}\3}\3~\3~\3~\3~\3~\3~\3~\3~\3~\5~\u06cf\n~\3\177\3\177\3\177"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080"+
		"\u06dc\n\u0080\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u06ea\n\u0082\3\u0083"+
		"\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\5\u0084\u06f7\n\u0084\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\5\u0086\u0709\n\u0086\3\u0087\3\u0087\3\u0087\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u0716"+
		"\n\u0088\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\5\u008a\u0723\n\u008a\3\u008b\3\u008b\3\u008b"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\5\u008c\u0732\n\u008c\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e"+
		"\u0741\n\u008e\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u074e\n\u0090\3\u0091\3\u0091"+
		"\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092"+
		"\u076c\n\u0092\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u0779\n\u0094\3\u0095\3\u0095"+
		"\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\5\u0096\u0786\n\u0096\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u0793\n\u0098\3\u0099"+
		"\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\5\u009a\u07a0\n\u009a\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u07ad\n\u009c"+
		"\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u07be\n\u009e"+
		"\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\5\u00a0\u07cb\n\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a2"+
		"\3\u00a2\3\u00a2\5\u00a2\u07d3\n\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\5\u00a2\u07db\n\u00a2\5\u00a2\u07dd\n\u00a2\3\u00a2\3"+
		"\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u07e6\n\u00a2\3"+
		"\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u07f4\n\u00a4\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a6\5\u00a6\u0803\n\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8"+
		"\3\u00a8\7\u00a8\u080b\n\u00a8\f\u00a8\16\u00a8\u080e\13\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u0816\n\u00a8\5\u00a8"+
		"\u0818\n\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\5\u00a8\u0821\n\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u0830"+
		"\n\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u083e\n\u00ac\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\5\u00ae\u084c\n\u00ae\3\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0859\n\u00b0"+
		"\3\u00b1\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u0869\n\u00b2\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u0871\n\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u0879\n\u00b4\5\u00b4"+
		"\u087b\n\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\5\u00b4\u0884\n\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u0893"+
		"\n\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b8\7\u00b8\u089b"+
		"\n\u00b8\f\u00b8\16\u00b8\u089e\13\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\5\u00b8\u08a6\n\u00b8\5\u00b8\u08a8\n\u00b8\3\u00b8\3"+
		"\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u08b1\n\u00b8\3"+
		"\u00b9\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u08c0\n\u00ba\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u08c8\n\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u08d0\n\u00bc\5\u00bc\u08d2\n"+
		"\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc"+
		"\u08db\n\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0918"+
		"\n\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u0925\n\u00c0\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\5\u00c2\u0933\n\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\5\u00c4\u094f\n\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c6"+
		"\3\u00c6\3\u00c6\5\u00c6\u0957\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\5\u00c6\u095f\n\u00c6\5\u00c6\u0961\n\u00c6\3\u00c6\3"+
		"\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u096a\n\u00c6\3"+
		"\u00c7\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\5\u00c8\u0977\n\u00c8\3\u00c9\3\u00c9\3\u00c9\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\5\u00ca\u0987\n\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u0994\n\u00cc"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00ce\6\u00ce\u099c\n\u00ce"+
		"\r\u00ce\16\u00ce\u099d\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\5\u00ce\u09a6\n\u00ce\5\u00ce\u09a8\n\u00ce\3\u00ce\3\u00ce\3\u00ce\3"+
		"\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u09b2\n\u00ce\3\u00cf\3"+
		"\u00cf\3\u00cf\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\5\u00d0\u09c0\n\u00d0\3\u00d1\3\u00d1\3\u00d1\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\5\u00d2\u09cf\n\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d4\3\u00d4\3\u00d4"+
		"\7\u00d4\u09d7\n\u00d4\f\u00d4\16\u00d4\u09da\13\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u09e2\n\u00d4\5\u00d4\u09e4\n"+
		"\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4"+
		"\u09ed\n\u00d4\3\u00d5\3\u00d5\3\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\5\u00d6\u09fc\n\u00d6"+
		"\3\u00d7\3\u00d7\3\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\5\u00d8"+
		"\u0a0f\n\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00da\3\u00da\3\u00da\5\u00da"+
		"\u0a17\n\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\5\u00da"+
		"\u0a1f\n\u00da\5\u00da\u0a21\n\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3"+
		"\u00da\3\u00da\3\u00da\5\u00da\u0a2a\n\u00da\3\u00db\3\u00db\3\u00db\3"+
		"\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc"+
		"\3\u00dc\3\u00dc\5\u00dc\u0a3a\n\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00de"+
		"\3\u00de\3\u00de\5\u00de\u0a42\n\u00de\3\u00de\3\u00de\3\u00de\3\u00de"+
		"\3\u00de\3\u00de\5\u00de\u0a4a\n\u00de\5\u00de\u0a4c\n\u00de\3\u00de\3"+
		"\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\5\u00de\u0a55\n\u00de\3"+
		"\u00df\3\u00df\3\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\5\u00e0\u0a63\n\u00e0\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e2\3\u00e2\3\u00e2\7\u00e2\u0a6b\n\u00e2\f\u00e2\16\u00e2\u0a6e"+
		"\13\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\5\u00e2\u0a76"+
		"\n\u00e2\5\u00e2\u0a78\n\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e2\5\u00e2\u0a81\n\u00e2\3\u00e3\3\u00e3\3\u00e3\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\5\u00e4\u0a90\n\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e6\3\u00e6\3\u00e6"+
		"\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6"+
		"\3\u00e6\3\u00e6\5\u00e6\u0aa3\n\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e8"+
		"\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8"+
		"\3\u00e8\3\u00e8\3\u00e8\3\u00e8\5\u00e8\u0ab6\n\u00e8\3\u00e9\3\u00e9"+
		"\3\u00e9\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea"+
		"\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\5\u00ea\u0ac8\n\u00ea\3\u00eb"+
		"\3\u00eb\3\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\5\u00ec\u0ada\n\u00ec"+
		"\3\u00ed\3\u00ed\3\u00ed\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\5\u00ee\u0af5"+
		"\n\u00ee\3\u00ef\3\u00ef\3\u00ef\3\u00f0\3\u00f0\3\u00f0\5\u00f0\u0afd"+
		"\n\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\5\u00f0\u0b05"+
		"\n\u00f0\5\u00f0\u0b07\n\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0"+
		"\3\u00f0\3\u00f0\5\u00f0\u0b10\n\u00f0\3\u00f1\3\u00f1\3\u00f1\3\u00f2"+
		"\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2"+
		"\3\u00f2\5\u00f2\u0b20\n\u00f2\3\u00f3\3\u00f3\3\u00f3\3\u00f4\3\u00f4"+
		"\3\u00f4\5\u00f4\u0b28\n\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f4"+
		"\3\u00f4\5\u00f4\u0b30\n\u00f4\5\u00f4\u0b32\n\u00f4\3\u00f4\3\u00f4\3"+
		"\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f4\5\u00f4\u0b3b\n\u00f4\3\u00f5\3"+
		"\u00f5\3\u00f5\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6"+
		"\3\u00f6\3\u00f6\3\u00f6\5\u00f6\u0b4a\n\u00f6\3\u00f7\3\u00f7\3\u00f7"+
		"\3\u00f8\3\u00f8\3\u00f8\7\u00f8\u0b52\n\u00f8\f\u00f8\16\u00f8\u0b55"+
		"\13\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8\5\u00f8\u0b5d"+
		"\n\u00f8\5\u00f8\u0b5f\n\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8"+
		"\3\u00f8\3\u00f8\5\u00f8\u0b68\n\u00f8\3\u00f9\3\u00f9\3\u00f9\3\u00fa"+
		"\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fa"+
		"\5\u00fa\u0b77\n\u00fa\3\u00fb\3\u00fb\3\u00fb\3\u00fc\3\u00fc\3\u00fc"+
		"\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fc\5\u00fc"+
		"\u0b87\n\u00fc\3\u00fd\3\u00fd\3\u00fd\3\u00fe\3\u00fe\3\u00fe\5\u00fe"+
		"\u0b8f\n\u00fe\3\u00fe\3\u00fe\3\u00fe\3\u00fe\3\u00fe\3\u00fe\5\u00fe"+
		"\u0b97\n\u00fe\5\u00fe\u0b99\n\u00fe\3\u00fe\3\u00fe\3\u00fe\3\u00fe\3"+
		"\u00fe\3\u00fe\3\u00fe\5\u00fe\u0ba2\n\u00fe\3\u00ff\3\u00ff\3\u00ff\3"+
		"\u00ff\2\2\u0100\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100"+
		"\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118"+
		"\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130"+
		"\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148"+
		"\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160"+
		"\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178"+
		"\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190"+
		"\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8"+
		"\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0"+
		"\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8"+
		"\u01da\u01dc\u01de\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0"+
		"\u01f2\u01f4\u01f6\u01f8\u01fa\u01fc\2\2\u0c30\2\u0207\3\2\2\2\4\u0209"+
		"\3\2\2\2\6\u0216\3\2\2\2\b\u0218\3\2\2\2\n\u0234\3\2\2\2\f\u0236\3\2\2"+
		"\2\16\u0243\3\2\2\2\20\u0245\3\2\2\2\22\u0250\3\2\2\2\24\u0252\3\2\2\2"+
		"\26\u026b\3\2\2\2\30\u026d\3\2\2\2\32\u0289\3\2\2\2\34\u028b\3\2\2\2\36"+
		"\u029b\3\2\2\2 \u029d\3\2\2\2\"\u02a8\3\2\2\2$\u02aa\3\2\2\2&\u02b5\3"+
		"\2\2\2(\u02b7\3\2\2\2*\u02c2\3\2\2\2,\u02c4\3\2\2\2.\u02cf\3\2\2\2\60"+
		"\u02d1\3\2\2\2\62\u02ea\3\2\2\2\64\u02ec\3\2\2\2\66\u02f7\3\2\2\28\u02f9"+
		"\3\2\2\2:\u0304\3\2\2\2<\u0306\3\2\2\2>\u0315\3\2\2\2@\u0317\3\2\2\2B"+
		"\u0330\3\2\2\2D\u0332\3\2\2\2F\u033d\3\2\2\2H\u033f\3\2\2\2J\u0351\3\2"+
		"\2\2L\u0353\3\2\2\2N\u036c\3\2\2\2P\u036e\3\2\2\2R\u0379\3\2\2\2T\u037b"+
		"\3\2\2\2V\u0389\3\2\2\2X\u038b\3\2\2\2Z\u03a4\3\2\2\2\\\u03a6\3\2\2\2"+
		"^\u03b2\3\2\2\2`\u03b4\3\2\2\2b\u03c0\3\2\2\2d\u03c2\3\2\2\2f\u03de\3"+
		"\2\2\2h\u03e0\3\2\2\2j\u03ee\3\2\2\2l\u03f0\3\2\2\2n\u03fb\3\2\2\2p\u03fd"+
		"\3\2\2\2r\u040d\3\2\2\2t\u040f\3\2\2\2v\u044c\3\2\2\2x\u044e\3\2\2\2z"+
		"\u0467\3\2\2\2|\u0469\3\2\2\2~\u0474\3\2\2\2\u0080\u0476\3\2\2\2\u0082"+
		"\u048f\3\2\2\2\u0084\u0491\3\2\2\2\u0086\u049e\3\2\2\2\u0088\u04a0\3\2"+
		"\2\2\u008a\u04b2\3\2\2\2\u008c\u04b4\3\2\2\2\u008e\u04bf\3\2\2\2\u0090"+
		"\u04c1\3\2\2\2\u0092\u04cf\3\2\2\2\u0094\u04d1\3\2\2\2\u0096\u04dc\3\2"+
		"\2\2\u0098\u04de\3\2\2\2\u009a\u04f7\3\2\2\2\u009c\u04f9\3\2\2\2\u009e"+
		"\u0504\3\2\2\2\u00a0\u0506\3\2\2\2\u00a2\u0513\3\2\2\2\u00a4\u0515\3\2"+
		"\2\2\u00a6\u0531\3\2\2\2\u00a8\u0533\3\2\2\2\u00aa\u0540\3\2\2\2\u00ac"+
		"\u0542\3\2\2\2\u00ae\u054d\3\2\2\2\u00b0\u054f\3\2\2\2\u00b2\u055d\3\2"+
		"\2\2\u00b4\u055f\3\2\2\2\u00b6\u0578\3\2\2\2\u00b8\u057a\3\2\2\2\u00ba"+
		"\u0587\3\2\2\2\u00bc\u0589\3\2\2\2\u00be\u05a5\3\2\2\2\u00c0\u05a7\3\2"+
		"\2\2\u00c2\u05b4\3\2\2\2\u00c4\u05b6\3\2\2\2\u00c6\u05c4\3\2\2\2\u00c8"+
		"\u05c6\3\2\2\2\u00ca\u05d1\3\2\2\2\u00cc\u05d3\3\2\2\2\u00ce\u05ec\3\2"+
		"\2\2\u00d0\u05ee\3\2\2\2\u00d2\u05f9\3\2\2\2\u00d4\u05fb\3\2\2\2\u00d6"+
		"\u0608\3\2\2\2\u00d8\u060a\3\2\2\2\u00da\u0626\3\2\2\2\u00dc\u0628\3\2"+
		"\2\2\u00de\u0635\3\2\2\2\u00e0\u0637\3\2\2\2\u00e2\u0650\3\2\2\2\u00e4"+
		"\u0652\3\2\2\2\u00e6\u0662\3\2\2\2\u00e8\u0664\3\2\2\2\u00ea\u067d\3\2"+
		"\2\2\u00ec\u067f\3\2\2\2\u00ee\u068a\3\2\2\2\u00f0\u068c\3\2\2\2\u00f2"+
		"\u06a5\3\2\2\2\u00f4\u06a7\3\2\2\2\u00f6\u06c0\3\2\2\2\u00f8\u06c2\3\2"+
		"\2\2\u00fa\u06ce\3\2\2\2\u00fc\u06d0\3\2\2\2\u00fe\u06db\3\2\2\2\u0100"+
		"\u06dd\3\2\2\2\u0102\u06e9\3\2\2\2\u0104\u06eb\3\2\2\2\u0106\u06f6\3\2"+
		"\2\2\u0108\u06f8\3\2\2\2\u010a\u0708\3\2\2\2\u010c\u070a\3\2\2\2\u010e"+
		"\u0715\3\2\2\2\u0110\u0717\3\2\2\2\u0112\u0722\3\2\2\2\u0114\u0724\3\2"+
		"\2\2\u0116\u0731\3\2\2\2\u0118\u0733\3\2\2\2\u011a\u0740\3\2\2\2\u011c"+
		"\u0742\3\2\2\2\u011e\u074d\3\2\2\2\u0120\u074f\3\2\2\2\u0122\u076b\3\2"+
		"\2\2\u0124\u076d\3\2\2\2\u0126\u0778\3\2\2\2\u0128\u077a\3\2\2\2\u012a"+
		"\u0785\3\2\2\2\u012c\u0787\3\2\2\2\u012e\u0792\3\2\2\2\u0130\u0794\3\2"+
		"\2\2\u0132\u079f\3\2\2\2\u0134\u07a1\3\2\2\2\u0136\u07ac\3\2\2\2\u0138"+
		"\u07ae\3\2\2\2\u013a\u07bd\3\2\2\2\u013c\u07bf\3\2\2\2\u013e\u07ca\3\2"+
		"\2\2\u0140\u07cc\3\2\2\2\u0142\u07e5\3\2\2\2\u0144\u07e7\3\2\2\2\u0146"+
		"\u07f3\3\2\2\2\u0148\u07f5\3\2\2\2\u014a\u0802\3\2\2\2\u014c\u0804\3\2"+
		"\2\2\u014e\u0820\3\2\2\2\u0150\u0822\3\2\2\2\u0152\u082f\3\2\2\2\u0154"+
		"\u0831\3\2\2\2\u0156\u083d\3\2\2\2\u0158\u083f\3\2\2\2\u015a\u084b\3\2"+
		"\2\2\u015c\u084d\3\2\2\2\u015e\u0858\3\2\2\2\u0160\u085a\3\2\2\2\u0162"+
		"\u0868\3\2\2\2\u0164\u086a\3\2\2\2\u0166\u0883\3\2\2\2\u0168\u0885\3\2"+
		"\2\2\u016a\u0892\3\2\2\2\u016c\u0894\3\2\2\2\u016e\u08b0\3\2\2\2\u0170"+
		"\u08b2\3\2\2\2\u0172\u08bf\3\2\2\2\u0174\u08c1\3\2\2\2\u0176\u08da\3\2"+
		"\2\2\u0178\u08dc\3\2\2\2\u017a\u0917\3\2\2\2\u017c\u0919\3\2\2\2\u017e"+
		"\u0924\3\2\2\2\u0180\u0926\3\2\2\2\u0182\u0932\3\2\2\2\u0184\u0934\3\2"+
		"\2\2\u0186\u094e\3\2\2\2\u0188\u0950\3\2\2\2\u018a\u0969\3\2\2\2\u018c"+
		"\u096b\3\2\2\2\u018e\u0976\3\2\2\2\u0190\u0978\3\2\2\2\u0192\u0986\3\2"+
		"\2\2\u0194\u0988\3\2\2\2\u0196\u0993\3\2\2\2\u0198\u0995\3\2\2\2\u019a"+
		"\u09b1\3\2\2\2\u019c\u09b3\3\2\2\2\u019e\u09bf\3\2\2\2\u01a0\u09c1\3\2"+
		"\2\2\u01a2\u09ce\3\2\2\2\u01a4\u09d0\3\2\2\2\u01a6\u09ec\3\2\2\2\u01a8"+
		"\u09ee\3\2\2\2\u01aa\u09fb\3\2\2\2\u01ac\u09fd\3\2\2\2\u01ae\u0a0e\3\2"+
		"\2\2\u01b0\u0a10\3\2\2\2\u01b2\u0a29\3\2\2\2\u01b4\u0a2b\3\2\2\2\u01b6"+
		"\u0a39\3\2\2\2\u01b8\u0a3b\3\2\2\2\u01ba\u0a54\3\2\2\2\u01bc\u0a56\3\2"+
		"\2\2\u01be\u0a62\3\2\2\2\u01c0\u0a64\3\2\2\2\u01c2\u0a80\3\2\2\2\u01c4"+
		"\u0a82\3\2\2\2\u01c6\u0a8f\3\2\2\2\u01c8\u0a91\3\2\2\2\u01ca\u0aa2\3\2"+
		"\2\2\u01cc\u0aa4\3\2\2\2\u01ce\u0ab5\3\2\2\2\u01d0\u0ab7\3\2\2\2\u01d2"+
		"\u0ac7\3\2\2\2\u01d4\u0ac9\3\2\2\2\u01d6\u0ad9\3\2\2\2\u01d8\u0adb\3\2"+
		"\2\2\u01da\u0af4\3\2\2\2\u01dc\u0af6\3\2\2\2\u01de\u0b0f\3\2\2\2\u01e0"+
		"\u0b11\3\2\2\2\u01e2\u0b1f\3\2\2\2\u01e4\u0b21\3\2\2\2\u01e6\u0b3a\3\2"+
		"\2\2\u01e8\u0b3c\3\2\2\2\u01ea\u0b49\3\2\2\2\u01ec\u0b4b\3\2\2\2\u01ee"+
		"\u0b67\3\2\2\2\u01f0\u0b69\3\2\2\2\u01f2\u0b76\3\2\2\2\u01f4\u0b78\3\2"+
		"\2\2\u01f6\u0b86\3\2\2\2\u01f8\u0b88\3\2\2\2\u01fa\u0ba1\3\2\2\2\u01fc"+
		"\u0ba3\3\2\2\2\u01fe\u01ff\b\2\1\2\u01ff\u0200\5\6\4\2\u0200\u0201\b\2"+
		"\1\2\u0201\u0208\3\2\2\2\u0202\u0203\b\2\1\2\u0203\u0208\7\3\2\2\u0204"+
		"\u0205\b\2\1\2\u0205\u0206\7\4\2\2\u0206\u0208\7\u0127\2\2\u0207\u01fe"+
		"\3\2\2\2\u0207\u0202\3\2\2\2\u0207\u0204\3\2\2\2\u0208\3\3\2\2\2\u0209"+
		"\u020a\5\2\2\2\u020a\u020b\7\2\2\3\u020b\5\3\2\2\2\u020c\u020d\b\4\1\2"+
		"\u020d\u020e\5\32\16\2\u020e\u020f\5\n\6\2\u020f\u0210\b\4\1\2\u0210\u0217"+
		"\3\2\2\2\u0211\u0212\b\4\1\2\u0212\u0217\7\5\2\2\u0213\u0214\b\4\1\2\u0214"+
		"\u0215\7\6\2\2\u0215\u0217\7\u0127\2\2\u0216\u020c\3\2\2\2\u0216\u0211"+
		"\3\2\2\2\u0216\u0213\3\2\2\2\u0217\7\3\2\2\2\u0218\u0219\5\6\4\2\u0219"+
		"\u021a\7\2\2\3\u021a\t\3\2\2\2\u021b\u021c\b\6\1\2\u021c\u0220\b\6\1\2"+
		"\u021d\u021f\5\16\b\2\u021e\u021d\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e"+
		"\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u022b\3\2\2\2\u0222\u0220\3\2\2\2\u0223"+
		"\u0229\b\6\1\2\u0224\u0225\b\6\1\2\u0225\u022a\7\7\2\2\u0226\u0227\b\6"+
		"\1\2\u0227\u0228\7\b\2\2\u0228\u022a\7\u0127\2\2\u0229\u0224\3\2\2\2\u0229"+
		"\u0226\3\2\2\2\u022a\u022c\3\2\2\2\u022b\u0223\3\2\2\2\u022b\u022c\3\2"+
		"\2\2\u022c\u022d\3\2\2\2\u022d\u022e\b\6\1\2\u022e\u0235\b\6\1\2\u022f"+
		"\u0230\b\6\1\2\u0230\u0235\7\7\2\2\u0231\u0232\b\6\1\2\u0232\u0233\7\b"+
		"\2\2\u0233\u0235\7\u0127\2\2\u0234\u021b\3\2\2\2\u0234\u022f\3\2\2\2\u0234"+
		"\u0231\3\2\2\2\u0235\13\3\2\2\2\u0236\u0237\5\n\6\2\u0237\u0238\7\2\2"+
		"\3\u0238\r\3\2\2\2\u0239\u023a\b\b\1\2\u023a\u023b\5\22\n\2\u023b\u023c"+
		"\5\26\f\2\u023c\u023d\b\b\1\2\u023d\u0244\3\2\2\2\u023e\u023f\b\b\1\2"+
		"\u023f\u0244\7\t\2\2\u0240\u0241\b\b\1\2\u0241\u0242\7\n\2\2\u0242\u0244"+
		"\7\u0127\2\2\u0243\u0239\3\2\2\2\u0243\u023e\3\2\2\2\u0243\u0240\3\2\2"+
		"\2\u0244\17\3\2\2\2\u0245\u0246\5\16\b\2\u0246\u0247\7\2\2\3\u0247\21"+
		"\3\2\2\2\u0248\u0249\b\n\1\2\u0249\u024a\7\u010f\2\2\u024a\u0251\b\n\1"+
		"\2\u024b\u024c\b\n\1\2\u024c\u0251\7\13\2\2\u024d\u024e\b\n\1\2\u024e"+
		"\u024f\7\f\2\2\u024f\u0251\7\u0127\2\2\u0250\u0248\3\2\2\2\u0250\u024b"+
		"\3\2\2\2\u0250\u024d\3\2\2\2\u0251\23\3\2\2\2\u0252\u0253\5\22\n\2\u0253"+
		"\u0254\7\2\2\3\u0254\25\3\2\2\2\u0255\u0256\b\f\1\2\u0256\u0258\b\f\1"+
		"\2\u0257\u0259\5\32\16\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259"+
		"\u0262\3\2\2\2\u025a\u0260\b\f\1\2\u025b\u025c\b\f\1\2\u025c\u0261\7\r"+
		"\2\2\u025d\u025e\b\f\1\2\u025e\u025f\7\16\2\2\u025f\u0261\7\u0127\2\2"+
		"\u0260\u025b\3\2\2\2\u0260\u025d\3\2\2\2\u0261\u0263\3\2\2\2\u0262\u025a"+
		"\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\b\f\1\2\u0265"+
		"\u026c\b\f\1\2\u0266\u0267\b\f\1\2\u0267\u026c\7\r\2\2\u0268\u0269\b\f"+
		"\1\2\u0269\u026a\7\16\2\2\u026a\u026c\7\u0127\2\2\u026b\u0255\3\2\2\2"+
		"\u026b\u0266\3\2\2\2\u026b\u0268\3\2\2\2\u026c\27\3\2\2\2\u026d\u026e"+
		"\5\26\f\2\u026e\u026f\7\2\2\3\u026f\31\3\2\2\2\u0270\u0271\b\16\1\2\u0271"+
		"\u0272\5\36\20\2\u0272\u0273\b\16\1\2\u0273\u028a\3\2\2\2\u0274\u0275"+
		"\b\16\1\2\u0275\u0276\5\62\32\2\u0276\u0277\b\16\1\2\u0277\u028a\3\2\2"+
		"\2\u0278\u0279\b\16\1\2\u0279\u027a\5> \2\u027a\u027b\b\16\1\2\u027b\u028a"+
		"\3\2\2\2\u027c\u027d\b\16\1\2\u027d\u027e\5\u0186\u00c4\2\u027e\u027f"+
		"\b\16\1\2\u027f\u028a\3\2\2\2\u0280\u0281\b\16\1\2\u0281\u0282\5\u01da"+
		"\u00ee\2\u0282\u0283\b\16\1\2\u0283\u028a\3\2\2\2\u0284\u0285\b\16\1\2"+
		"\u0285\u028a\7\17\2\2\u0286\u0287\b\16\1\2\u0287\u0288\7\20\2\2\u0288"+
		"\u028a\7\u0127\2\2\u0289\u0270\3\2\2\2\u0289\u0274\3\2\2\2\u0289\u0278"+
		"\3\2\2\2\u0289\u027c\3\2\2\2\u0289\u0280\3\2\2\2\u0289\u0284\3\2\2\2\u0289"+
		"\u0286\3\2\2\2\u028a\33\3\2\2\2\u028b\u028c\5\32\16\2\u028c\u028d\7\2"+
		"\2\3\u028d\35\3\2\2\2\u028e\u028f\b\20\1\2\u028f\u0290\5\"\22\2\u0290"+
		"\u0291\5&\24\2\u0291\u0292\5*\26\2\u0292\u0293\5\6\4\2\u0293\u0294\5."+
		"\30\2\u0294\u0295\b\20\1\2\u0295\u029c\3\2\2\2\u0296\u0297\b\20\1\2\u0297"+
		"\u029c\7\21\2\2\u0298\u0299\b\20\1\2\u0299\u029a\7\22\2\2\u029a\u029c"+
		"\7\u0127\2\2\u029b\u028e\3\2\2\2\u029b\u0296\3\2\2\2\u029b\u0298\3\2\2"+
		"\2\u029c\37\3\2\2\2\u029d\u029e\5\36\20\2\u029e\u029f\7\2\2\3\u029f!\3"+
		"\2\2\2\u02a0\u02a1\b\22\1\2\u02a1\u02a2\7\u0101\2\2\u02a2\u02a9\b\22\1"+
		"\2\u02a3\u02a4\b\22\1\2\u02a4\u02a9\7\23\2\2\u02a5\u02a6\b\22\1\2\u02a6"+
		"\u02a7\7\24\2\2\u02a7\u02a9\7\u0127\2\2\u02a8\u02a0\3\2\2\2\u02a8\u02a3"+
		"\3\2\2\2\u02a8\u02a5\3\2\2\2\u02a9#\3\2\2\2\u02aa\u02ab\5\"\22\2\u02ab"+
		"\u02ac\7\2\2\3\u02ac%\3\2\2\2\u02ad\u02ae\b\24\1\2\u02ae\u02af\7\u011e"+
		"\2\2\u02af\u02b6\b\24\1\2\u02b0\u02b1\b\24\1\2\u02b1\u02b6\7\25\2\2\u02b2"+
		"\u02b3\b\24\1\2\u02b3\u02b4\7\26\2\2\u02b4\u02b6\7\u0127\2\2\u02b5\u02ad"+
		"\3\2\2\2\u02b5\u02b0\3\2\2\2\u02b5\u02b2\3\2\2\2\u02b6\'\3\2\2\2\u02b7"+
		"\u02b8\5&\24\2\u02b8\u02b9\7\2\2\3\u02b9)\3\2\2\2\u02ba\u02bb\b\26\1\2"+
		"\u02bb\u02bc\7\u010b\2\2\u02bc\u02c3\b\26\1\2\u02bd\u02be\b\26\1\2\u02be"+
		"\u02c3\7\27\2\2\u02bf\u02c0\b\26\1\2\u02c0\u02c1\7\30\2\2\u02c1\u02c3"+
		"\7\u0127\2\2\u02c2\u02ba\3\2\2\2\u02c2\u02bd\3\2\2\2\u02c2\u02bf\3\2\2"+
		"\2\u02c3+\3\2\2\2\u02c4\u02c5\5*\26\2\u02c5\u02c6\7\2\2\3\u02c6-\3\2\2"+
		"\2\u02c7\u02c8\b\30\1\2\u02c8\u02c9\7\u010c\2\2\u02c9\u02d0\b\30\1\2\u02ca"+
		"\u02cb\b\30\1\2\u02cb\u02d0\7\31\2\2\u02cc\u02cd\b\30\1\2\u02cd\u02ce"+
		"\7\32\2\2\u02ce\u02d0\7\u0127\2\2\u02cf\u02c7\3\2\2\2\u02cf\u02ca\3\2"+
		"\2\2\u02cf\u02cc\3\2\2\2\u02d0/\3\2\2\2\u02d1\u02d2\5.\30\2\u02d2\u02d3"+
		"\7\2\2\3\u02d3\61\3\2\2\2\u02d4\u02d5\b\32\1\2\u02d5\u02d6\5\66\34\2\u02d6"+
		"\u02d7\5\u01ce\u00e8\2\u02d7\u02d8\b\32\1\2\u02d8\u02eb\3\2\2\2\u02d9"+
		"\u02da\b\32\1\2\u02da\u02db\5\66\34\2\u02db\u02dc\5\"\22\2\u02dc\u02dd"+
		"\5\u01ce\u00e8\2\u02dd\u02de\b\32\1\2\u02de\u02eb\3\2\2\2\u02df\u02e0"+
		"\b\32\1\2\u02e0\u02e1\5\66\34\2\u02e1\u02e2\5:\36\2\u02e2\u02e3\5\u01ce"+
		"\u00e8\2\u02e3\u02e4\b\32\1\2\u02e4\u02eb\3\2\2\2\u02e5\u02e6\b\32\1\2"+
		"\u02e6\u02eb\7\33\2\2\u02e7\u02e8\b\32\1\2\u02e8\u02e9\7\34\2\2\u02e9"+
		"\u02eb\7\u0127\2\2\u02ea\u02d4\3\2\2\2\u02ea\u02d9\3\2\2\2\u02ea\u02df"+
		"\3\2\2\2\u02ea\u02e5\3\2\2\2\u02ea\u02e7\3\2\2\2\u02eb\63\3\2\2\2\u02ec"+
		"\u02ed\5\62\32\2\u02ed\u02ee\7\2\2\3\u02ee\65\3\2\2\2\u02ef\u02f0\b\34"+
		"\1\2\u02f0\u02f1\7\u0102\2\2\u02f1\u02f8\b\34\1\2\u02f2\u02f3\b\34\1\2"+
		"\u02f3\u02f8\7\35\2\2\u02f4\u02f5\b\34\1\2\u02f5\u02f6\7\36\2\2\u02f6"+
		"\u02f8\7\u0127\2\2\u02f7\u02ef\3\2\2\2\u02f7\u02f2\3\2\2\2\u02f7\u02f4"+
		"\3\2\2\2\u02f8\67\3\2\2\2\u02f9\u02fa\5\66\34\2\u02fa\u02fb\7\2\2\3\u02fb"+
		"9\3\2\2\2\u02fc\u02fd\b\36\1\2\u02fd\u02fe\7\u0105\2\2\u02fe\u0305\b\36"+
		"\1\2\u02ff\u0300\b\36\1\2\u0300\u0305\7\37\2\2\u0301\u0302\b\36\1\2\u0302"+
		"\u0303\7 \2\2\u0303\u0305\7\u0127\2\2\u0304\u02fc\3\2\2\2\u0304\u02ff"+
		"\3\2\2\2\u0304\u0301\3\2\2\2\u0305;\3\2\2\2\u0306\u0307\5:\36\2\u0307"+
		"\u0308\7\2\2\3\u0308=\3\2\2\2\u0309\u030a\b \1\2\u030a\u030b\5B\"\2\u030b"+
		"\u030c\5V,\2\u030c\u030d\5F$\2\u030d\u030e\5^\60\2\u030e\u030f\b \1\2"+
		"\u030f\u0316\3\2\2\2\u0310\u0311\b \1\2\u0311\u0316\7!\2\2\u0312\u0313"+
		"\b \1\2\u0313\u0314\7\"\2\2\u0314\u0316\7\u0127\2\2\u0315\u0309\3\2\2"+
		"\2\u0315\u0310\3\2\2\2\u0315\u0312\3\2\2\2\u0316?\3\2\2\2\u0317\u0318"+
		"\5> \2\u0318\u0319\7\2\2\3\u0319A\3\2\2\2\u031a\u031b\b\"\1\2\u031b\u031d"+
		"\b\"\1\2\u031c\u031e\5J&\2\u031d\u031c\3\2\2\2\u031d\u031e\3\2\2\2\u031e"+
		"\u0327\3\2\2\2\u031f\u0325\b\"\1\2\u0320\u0321\b\"\1\2\u0321\u0326\7#"+
		"\2\2\u0322\u0323\b\"\1\2\u0323\u0324\7$\2\2\u0324\u0326\7\u0127\2\2\u0325"+
		"\u0320\3\2\2\2\u0325\u0322\3\2\2\2\u0326\u0328\3\2\2\2\u0327\u031f\3\2"+
		"\2\2\u0327\u0328\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032a\b\"\1\2\u032a"+
		"\u0331\b\"\1\2\u032b\u032c\b\"\1\2\u032c\u0331\7#\2\2\u032d\u032e\b\""+
		"\1\2\u032e\u032f\7$\2\2\u032f\u0331\7\u0127\2\2\u0330\u031a\3\2\2\2\u0330"+
		"\u032b\3\2\2\2\u0330\u032d\3\2\2\2\u0331C\3\2\2\2\u0332\u0333\5B\"\2\u0333"+
		"\u0334\7\2\2\3\u0334E\3\2\2\2\u0335\u0336\b$\1\2\u0336\u0337\7\u0107\2"+
		"\2\u0337\u033e\b$\1\2\u0338\u0339\b$\1\2\u0339\u033e\7%\2\2\u033a\u033b"+
		"\b$\1\2\u033b\u033c\7&\2\2\u033c\u033e\7\u0127\2\2\u033d\u0335\3\2\2\2"+
		"\u033d\u0338\3\2\2\2\u033d\u033a\3\2\2\2\u033eG\3\2\2\2\u033f\u0340\5"+
		"F$\2\u0340\u0341\7\2\2\3\u0341I\3\2\2\2\u0342\u0343\b&\1\2\u0343\u0344"+
		"\5\u01ce\u00e8\2\u0344\u0345\5N(\2\u0345\u0346\5R*\2\u0346\u0347\b&\1"+
		"\2\u0347\u0352\3\2\2\2\u0348\u0349\b&\1\2\u0349\u034a\5b\62\2\u034a\u034b"+
		"\b&\1\2\u034b\u0352\3\2\2\2\u034c\u034d\b&\1\2\u034d\u0352\7\'\2\2\u034e"+
		"\u034f\b&\1\2\u034f\u0350\7(\2\2\u0350\u0352\7\u0127\2\2\u0351\u0342\3"+
		"\2\2\2\u0351\u0348\3\2\2\2\u0351\u034c\3\2\2\2\u0351\u034e\3\2\2\2\u0352"+
		"K\3\2\2\2\u0353\u0354\5J&\2\u0354\u0355\7\2\2\3\u0355M\3\2\2\2\u0356\u0357"+
		"\b(\1\2\u0357\u0359\b(\1\2\u0358\u035a\5\u0092J\2\u0359\u0358\3\2\2\2"+
		"\u0359\u035a\3\2\2\2\u035a\u0363\3\2\2\2\u035b\u0361\b(\1\2\u035c\u035d"+
		"\b(\1\2\u035d\u0362\7)\2\2\u035e\u035f\b(\1\2\u035f\u0360\7*\2\2\u0360"+
		"\u0362\7\u0127\2\2\u0361\u035c\3\2\2\2\u0361\u035e\3\2\2\2\u0362\u0364"+
		"\3\2\2\2\u0363\u035b\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0365\3\2\2\2\u0365"+
		"\u0366\b(\1\2\u0366\u036d\b(\1\2\u0367\u0368\b(\1\2\u0368\u036d\7)\2\2"+
		"\u0369\u036a\b(\1\2\u036a\u036b\7*\2\2\u036b\u036d\7\u0127\2\2\u036c\u0356"+
		"\3\2\2\2\u036c\u0367\3\2\2\2\u036c\u0369\3\2\2\2\u036dO\3\2\2\2\u036e"+
		"\u036f\5N(\2\u036f\u0370\7\2\2\3\u0370Q\3\2\2\2\u0371\u0372\b*\1\2\u0372"+
		"\u0373\7\u0106\2\2\u0373\u037a\b*\1\2\u0374\u0375\b*\1\2\u0375\u037a\7"+
		"+\2\2\u0376\u0377\b*\1\2\u0377\u0378\7,\2\2\u0378\u037a\7\u0127\2\2\u0379"+
		"\u0371\3\2\2\2\u0379\u0374\3\2\2\2\u0379\u0376\3\2\2\2\u037aS\3\2\2\2"+
		"\u037b\u037c\5R*\2\u037c\u037d\7\2\2\3\u037dU\3\2\2\2\u037e\u037f\b,\1"+
		"\2\u037f\u0380\5Z.\2\u0380\u0381\5\u01ce\u00e8\2\u0381\u0382\5N(\2\u0382"+
		"\u0383\b,\1\2\u0383\u038a\3\2\2\2\u0384\u0385\b,\1\2\u0385\u038a\7-\2"+
		"\2\u0386\u0387\b,\1\2\u0387\u0388\7.\2\2\u0388\u038a\7\u0127\2\2\u0389"+
		"\u037e\3\2\2\2\u0389\u0384\3\2\2\2\u0389\u0386\3\2\2\2\u038aW\3\2\2\2"+
		"\u038b\u038c\5V,\2\u038c\u038d\7\2\2\3\u038dY\3\2\2\2\u038e\u038f\b.\1"+
		"\2\u038f\u0391\b.\1\2\u0390\u0392\5\u0162\u00b2\2\u0391\u0390\3\2\2\2"+
		"\u0391\u0392\3\2\2\2\u0392\u039b\3\2\2\2\u0393\u0399\b.\1\2\u0394\u0395"+
		"\b.\1\2\u0395\u039a\7/\2\2\u0396\u0397\b.\1\2\u0397\u0398\7\60\2\2\u0398"+
		"\u039a\7\u0127\2\2\u0399\u0394\3\2\2\2\u0399\u0396\3\2\2\2\u039a\u039c"+
		"\3\2\2\2\u039b\u0393\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039d\3\2\2\2\u039d"+
		"\u039e\b.\1\2\u039e\u03a5\b.\1\2\u039f\u03a0\b.\1\2\u03a0\u03a5\7/\2\2"+
		"\u03a1\u03a2\b.\1\2\u03a2\u03a3\7\60\2\2\u03a3\u03a5\7\u0127\2\2\u03a4"+
		"\u038e\3\2\2\2\u03a4\u039f\3\2\2\2\u03a4\u03a1\3\2\2\2\u03a5[\3\2\2\2"+
		"\u03a6\u03a7\5Z.\2\u03a7\u03a8\7\2\2\3\u03a8]\3\2\2\2\u03a9\u03aa\b\60"+
		"\1\2\u03aa\u03ab\5v<\2\u03ab\u03ac\b\60\1\2\u03ac\u03b3\3\2\2\2\u03ad"+
		"\u03ae\b\60\1\2\u03ae\u03b3\7\61\2\2\u03af\u03b0\b\60\1\2\u03b0\u03b1"+
		"\7\62\2\2\u03b1\u03b3\7\u0127\2\2\u03b2\u03a9\3\2\2\2\u03b2\u03ad\3\2"+
		"\2\2\u03b2\u03af\3\2\2\2\u03b3_\3\2\2\2\u03b4\u03b5\5^\60\2\u03b5\u03b6"+
		"\7\2\2\3\u03b6a\3\2\2\2\u03b7\u03b8\b\62\1\2\u03b8\u03b9\5f\64\2\u03b9"+
		"\u03ba\b\62\1\2\u03ba\u03c1\3\2\2\2\u03bb\u03bc\b\62\1\2\u03bc\u03c1\7"+
		"\63\2\2\u03bd\u03be\b\62\1\2\u03be\u03bf\7\64\2\2\u03bf\u03c1\7\u0127"+
		"\2\2\u03c0\u03b7\3\2\2\2\u03c0\u03bb\3\2\2\2\u03c0\u03bd\3\2\2\2\u03c1"+
		"c\3\2\2\2\u03c2\u03c3\5b\62\2\u03c3\u03c4\7\2\2\3\u03c4e\3\2\2\2\u03c5"+
		"\u03c6\b\64\1\2\u03c6\u03c8\b\64\1\2\u03c7\u03c9\5j\66\2\u03c8\u03c7\3"+
		"\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03c8\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb"+
		"\u03d4\3\2\2\2\u03cc\u03d2\b\64\1\2\u03cd\u03ce\b\64\1\2\u03ce\u03d3\7"+
		"\65\2\2\u03cf\u03d0\b\64\1\2\u03d0\u03d1\7\66\2\2\u03d1\u03d3\7\u0127"+
		"\2\2\u03d2\u03cd\3\2\2\2\u03d2\u03cf\3\2\2\2\u03d3\u03d5\3\2\2\2\u03d4"+
		"\u03cc\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d7\b\64"+
		"\1\2\u03d7\u03d8\b\64\1\2\u03d8\u03df\3\2\2\2\u03d9\u03da\b\64\1\2\u03da"+
		"\u03df\7\65\2\2\u03db\u03dc\b\64\1\2\u03dc\u03dd\7\66\2\2\u03dd\u03df"+
		"\7\u0127\2\2\u03de\u03c5\3\2\2\2\u03de\u03d9\3\2\2\2\u03de\u03db\3\2\2"+
		"\2\u03dfg\3\2\2\2\u03e0\u03e1\5f\64\2\u03e1\u03e2\7\2\2\3\u03e2i\3\2\2"+
		"\2\u03e3\u03e4\b\66\1\2\u03e4\u03e5\5n8\2\u03e5\u03e6\5\u01ce\u00e8\2"+
		"\u03e6\u03e7\5N(\2\u03e7\u03e8\b\66\1\2\u03e8\u03ef\3\2\2\2\u03e9\u03ea"+
		"\b\66\1\2\u03ea\u03ef\7\67\2\2\u03eb\u03ec\b\66\1\2\u03ec\u03ed\78\2\2"+
		"\u03ed\u03ef\7\u0127\2\2\u03ee\u03e3\3\2\2\2\u03ee\u03e9\3\2\2\2\u03ee"+
		"\u03eb\3\2\2\2\u03efk\3\2\2\2\u03f0\u03f1\5j\66\2\u03f1\u03f2\7\2\2\3"+
		"\u03f2m\3\2\2\2\u03f3\u03f4\b8\1\2\u03f4\u03f5\7\u0118\2\2\u03f5\u03fc"+
		"\b8\1\2\u03f6\u03f7\b8\1\2\u03f7\u03fc\79\2\2\u03f8\u03f9\b8\1\2\u03f9"+
		"\u03fa\7:\2\2\u03fa\u03fc\7\u0127\2\2\u03fb\u03f3\3\2\2\2\u03fb\u03f6"+
		"\3\2\2\2\u03fb\u03f8\3\2\2\2\u03fco\3\2\2\2\u03fd\u03fe\5n8\2\u03fe\u03ff"+
		"\7\2\2\3\u03ffq\3\2\2\2\u0400\u0401\b:\1\2\u0401\u0402\5v<\2\u0402\u0403"+
		"\b:\1\2\u0403\u040e\3\2\2\2\u0404\u0405\b:\1\2\u0405\u0406\5\u0086D\2"+
		"\u0406\u0407\b:\1\2\u0407\u040e\3\2\2\2\u0408\u0409\b:\1\2\u0409\u040e"+
		"\7;\2\2\u040a\u040b\b:\1\2\u040b\u040c\7<\2\2\u040c\u040e\7\u0127\2\2"+
		"\u040d\u0400\3\2\2\2\u040d\u0404\3\2\2\2\u040d\u0408\3\2\2\2\u040d\u040a"+
		"\3\2\2\2\u040es\3\2\2\2\u040f\u0410\5r:\2\u0410\u0411\7\2\2\3\u0411u\3"+
		"\2\2\2\u0412\u0413\b<\1\2\u0413\u0414\5z>\2\u0414\u0415\5Z.\2\u0415\u0416"+
		"\5\u01ce\u00e8\2\u0416\u0417\5N(\2\u0417\u0418\b<\1\2\u0418\u044d\3\2"+
		"\2\2\u0419\u041a\b<\1\2\u041a\u041b\5z>\2\u041b\u041c\5Z.\2\u041c\u041d"+
		"\5\u01ce\u00e8\2\u041d\u041e\5r:\2\u041e\u041f\b<\1\2\u041f\u044d\3\2"+
		"\2\2\u0420\u0421\b<\1\2\u0421\u0422\5z>\2\u0422\u0423\5Z.\2\u0423\u0424"+
		"\5\u010a\u0086\2\u0424\u0425\b<\1\2\u0425\u044d\3\2\2\2\u0426\u0427\b"+
		"<\1\2\u0427\u0428\5z>\2\u0428\u0429\5\u00c6d\2\u0429\u042a\b<\1\2\u042a"+
		"\u044d\3\2\2\2\u042b\u042c\b<\1\2\u042c\u042d\5z>\2\u042d\u042e\5\u00e6"+
		"t\2\u042e\u042f\b<\1\2\u042f\u044d\3\2\2\2\u0430\u0431\b<\1\2\u0431\u0432"+
		"\5z>\2\u0432\u0433\5\u0162\u00b2\2\u0433\u0434\b<\1\2\u0434\u044d\3\2"+
		"\2\2\u0435\u0436\b<\1\2\u0436\u0437\5z>\2\u0437\u0438\5Z.\2\u0438\u0439"+
		"\5~@\2\u0439\u043a\5\u0082B\2\u043a\u043b\b<\1\2\u043b\u044d\3\2\2\2\u043c"+
		"\u043d\b<\1\2\u043d\u043e\5z>\2\u043e\u043f\5\u0122\u0092\2\u043f\u0440"+
		"\b<\1\2\u0440\u044d\3\2\2\2\u0441\u0442\b<\1\2\u0442\u0443\5z>\2\u0443"+
		"\u0444\5Z.\2\u0444\u0445\5\u0182\u00c2\2\u0445\u0446\b<\1\2\u0446\u044d"+
		"\3\2\2\2\u0447\u0448\b<\1\2\u0448\u044d\7=\2\2\u0449\u044a\b<\1\2\u044a"+
		"\u044b\7>\2\2\u044b\u044d\7\u0127\2\2\u044c\u0412\3\2\2\2\u044c\u0419"+
		"\3\2\2\2\u044c\u0420\3\2\2\2\u044c\u0426\3\2\2\2\u044c\u042b\3\2\2\2\u044c"+
		"\u0430\3\2\2\2\u044c\u0435\3\2\2\2\u044c\u043c\3\2\2\2\u044c\u0441\3\2"+
		"\2\2\u044c\u0447\3\2\2\2\u044c\u0449\3\2\2\2\u044dw\3\2\2\2\u044e\u044f"+
		"\5v<\2\u044f\u0450\7\2\2\3\u0450y\3\2\2\2\u0451\u0452\b>\1\2\u0452\u0454"+
		"\b>\1\2\u0453\u0455\5b\62\2\u0454\u0453\3\2\2\2\u0454\u0455\3\2\2\2\u0455"+
		"\u045e\3\2\2\2\u0456\u045c\b>\1\2\u0457\u0458\b>\1\2\u0458\u045d\7?\2"+
		"\2\u0459\u045a\b>\1\2\u045a\u045b\7@\2\2\u045b\u045d\7\u0127\2\2\u045c"+
		"\u0457\3\2\2\2\u045c\u0459\3\2\2\2\u045d\u045f\3\2\2\2\u045e\u0456\3\2"+
		"\2\2\u045e\u045f\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0461\b>\1\2\u0461"+
		"\u0468\b>\1\2\u0462\u0463\b>\1\2\u0463\u0468\7?\2\2\u0464\u0465\b>\1\2"+
		"\u0465\u0466\7@\2\2\u0466\u0468\7\u0127\2\2\u0467\u0451\3\2\2\2\u0467"+
		"\u0462\3\2\2\2\u0467\u0464\3\2\2\2\u0468{\3\2\2\2\u0469\u046a\5z>\2\u046a"+
		"\u046b\7\2\2\3\u046b}\3\2\2\2\u046c\u046d\b@\1\2\u046d\u046e\7\u0120\2"+
		"\2\u046e\u0475\b@\1\2\u046f\u0470\b@\1\2\u0470\u0475\7A\2\2\u0471\u0472"+
		"\b@\1\2\u0472\u0473\7B\2\2\u0473\u0475\7\u0127\2\2\u0474\u046c\3\2\2\2"+
		"\u0474\u046f\3\2\2\2\u0474\u0471\3\2\2\2\u0475\177\3\2\2\2\u0476\u0477"+
		"\5~@\2\u0477\u0478\7\2\2\3\u0478\u0081\3\2\2\2\u0479\u047a\bB\1\2\u047a"+
		"\u047c\bB\1\2\u047b\u047d\5\u00b2Z\2\u047c\u047b\3\2\2\2\u047c\u047d\3"+
		"\2\2\2\u047d\u0486\3\2\2\2\u047e\u0484\bB\1\2\u047f\u0480\bB\1\2\u0480"+
		"\u0485\7C\2\2\u0481\u0482\bB\1\2\u0482\u0483\7D\2\2\u0483\u0485\7\u0127"+
		"\2\2\u0484\u047f\3\2\2\2\u0484\u0481\3\2\2\2\u0485\u0487\3\2\2\2\u0486"+
		"\u047e\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u0489\bB"+
		"\1\2\u0489\u0490\bB\1\2\u048a\u048b\bB\1\2\u048b\u0490\7C\2\2\u048c\u048d"+
		"\bB\1\2\u048d\u048e\7D\2\2\u048e\u0490\7\u0127\2\2\u048f\u0479\3\2\2\2"+
		"\u048f\u048a\3\2\2\2\u048f\u048c\3\2\2\2\u0490\u0083\3\2\2\2\u0491\u0492"+
		"\5\u0082B\2\u0492\u0493\7\2\2\3\u0493\u0085\3\2\2\2\u0494\u0495\bD\1\2"+
		"\u0495\u0496\5\u0116\u008c\2\u0496\u0497\5\u008aF\2\u0497\u0498\bD\1\2"+
		"\u0498\u049f\3\2\2\2\u0499\u049a\bD\1\2\u049a\u049f\7E\2\2\u049b\u049c"+
		"\bD\1\2\u049c\u049d\7F\2\2\u049d\u049f\7\u0127\2\2\u049e\u0494\3\2\2\2"+
		"\u049e\u0499\3\2\2\2\u049e\u049b\3\2\2\2\u049f\u0087\3\2\2\2\u04a0\u04a1"+
		"\5\u0086D\2\u04a1\u04a2\7\2\2\3\u04a2\u0089\3\2\2\2\u04a3\u04a4\bF\1\2"+
		"\u04a4\u04a5\5\u0116\u008c\2\u04a5\u04a6\5\u008aF\2\u04a6\u04a7\bF\1\2"+
		"\u04a7\u04b3\3\2\2\2\u04a8\u04a9\bF\1\2\u04a9\u04aa\5\u008eH\2\u04aa\u04ab"+
		"\5v<\2\u04ab\u04ac\bF\1\2\u04ac\u04b3\3\2\2\2\u04ad\u04ae\bF\1\2\u04ae"+
		"\u04b3\7G\2\2\u04af\u04b0\bF\1\2\u04b0\u04b1\7H\2\2\u04b1\u04b3\7\u0127"+
		"\2\2\u04b2\u04a3\3\2\2\2\u04b2\u04a8\3\2\2\2\u04b2\u04ad\3\2\2\2\u04b2"+
		"\u04af\3\2\2\2\u04b3\u008b\3\2\2\2\u04b4\u04b5\5\u008aF\2\u04b5\u04b6"+
		"\7\2\2\3\u04b6\u008d\3\2\2\2\u04b7\u04b8\bH\1\2\u04b8\u04b9\7\u0113\2"+
		"\2\u04b9\u04c0\bH\1\2\u04ba\u04bb\bH\1\2\u04bb\u04c0\7I\2\2\u04bc\u04bd"+
		"\bH\1\2\u04bd\u04be\7J\2\2\u04be\u04c0\7\u0127\2\2\u04bf\u04b7\3\2\2\2"+
		"\u04bf\u04ba\3\2\2\2\u04bf\u04bc\3\2\2\2\u04c0\u008f\3\2\2\2\u04c1\u04c2"+
		"\5\u008eH\2\u04c2\u04c3\7\2\2\3\u04c3\u0091\3\2\2\2\u04c4\u04c5\bJ\1\2"+
		"\u04c5\u04c6\5\u0096L\2\u04c6\u04c7\5\u009aN\2\u04c7\u04c8\5\u009eP\2"+
		"\u04c8\u04c9\bJ\1\2\u04c9\u04d0\3\2\2\2\u04ca\u04cb\bJ\1\2\u04cb\u04d0"+
		"\7K\2\2\u04cc\u04cd\bJ\1\2\u04cd\u04ce\7L\2\2\u04ce\u04d0\7\u0127\2\2"+
		"\u04cf\u04c4\3\2\2\2\u04cf\u04ca\3\2\2\2\u04cf\u04cc\3\2\2\2\u04d0\u0093"+
		"\3\2\2\2\u04d1\u04d2\5\u0092J\2\u04d2\u04d3\7\2\2\3\u04d3\u0095\3\2\2"+
		"\2\u04d4\u04d5\bL\1\2\u04d5\u04d6\7\u010d\2\2\u04d6\u04dd\bL\1\2\u04d7"+
		"\u04d8\bL\1\2\u04d8\u04dd\7M\2\2\u04d9\u04da\bL\1\2\u04da\u04db\7N\2\2"+
		"\u04db\u04dd\7\u0127\2\2\u04dc\u04d4\3\2\2\2\u04dc\u04d7\3\2\2\2\u04dc"+
		"\u04d9\3\2\2\2\u04dd\u0097\3\2\2\2\u04de\u04df\5\u0096L\2\u04df\u04e0"+
		"\7\2\2\3\u04e0\u0099\3\2\2\2\u04e1\u04e2\bN\1\2\u04e2\u04e4\bN\1\2\u04e3"+
		"\u04e5\5\u00a2R\2\u04e4\u04e3\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04ee"+
		"\3\2\2\2\u04e6\u04ec\bN\1\2\u04e7\u04e8\bN\1\2\u04e8\u04ed\7O\2\2\u04e9"+
		"\u04ea\bN\1\2\u04ea\u04eb\7P\2\2\u04eb\u04ed\7\u0127\2\2\u04ec\u04e7\3"+
		"\2\2\2\u04ec\u04e9\3\2\2\2\u04ed\u04ef\3\2\2\2\u04ee\u04e6\3\2\2\2\u04ee"+
		"\u04ef\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f1\bN\1\2\u04f1\u04f8\bN\1"+
		"\2\u04f2\u04f3\bN\1\2\u04f3\u04f8\7O\2\2\u04f4\u04f5\bN\1\2\u04f5\u04f6"+
		"\7P\2\2\u04f6\u04f8\7\u0127\2\2\u04f7\u04e1\3\2\2\2\u04f7\u04f2\3\2\2"+
		"\2\u04f7\u04f4\3\2\2\2\u04f8\u009b\3\2\2\2\u04f9\u04fa\5\u009aN\2\u04fa"+
		"\u04fb\7\2\2\3\u04fb\u009d\3\2\2\2\u04fc\u04fd\bP\1\2\u04fd\u04fe\7\u010e"+
		"\2\2\u04fe\u0505\bP\1\2\u04ff\u0500\bP\1\2\u0500\u0505\7Q\2\2\u0501\u0502"+
		"\bP\1\2\u0502\u0503\7R\2\2\u0503\u0505\7\u0127\2\2\u0504\u04fc\3\2\2\2"+
		"\u0504\u04ff\3\2\2\2\u0504\u0501\3\2\2\2\u0505\u009f\3\2\2\2\u0506\u0507"+
		"\5\u009eP\2\u0507\u0508\7\2\2\3\u0508\u00a1\3\2\2\2\u0509\u050a\bR\1\2"+
		"\u050a\u050b\5r:\2\u050b\u050c\5\u00a6T\2\u050c\u050d\bR\1\2\u050d\u0514"+
		"\3\2\2\2\u050e\u050f\bR\1\2\u050f\u0514\7S\2\2\u0510\u0511\bR\1\2\u0511"+
		"\u0512\7T\2\2\u0512\u0514\7\u0127\2\2\u0513\u0509\3\2\2\2\u0513\u050e"+
		"\3\2\2\2\u0513\u0510\3\2\2\2\u0514\u00a3\3\2\2\2\u0515\u0516\5\u00a2R"+
		"\2\u0516\u0517\7\2\2\3\u0517\u00a5\3\2\2\2\u0518\u0519\bT\1\2\u0519\u051d"+
		"\bT\1\2\u051a\u051c\5\u00aaV\2\u051b\u051a\3\2\2\2\u051c\u051f\3\2\2\2"+
		"\u051d\u051b\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u0528\3\2\2\2\u051f\u051d"+
		"\3\2\2\2\u0520\u0526\bT\1\2\u0521\u0522\bT\1\2\u0522\u0527\7U\2\2\u0523"+
		"\u0524\bT\1\2\u0524\u0525\7V\2\2\u0525\u0527\7\u0127\2\2\u0526\u0521\3"+
		"\2\2\2\u0526\u0523\3\2\2\2\u0527\u0529\3\2\2\2\u0528\u0520\3\2\2\2\u0528"+
		"\u0529\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u052b\bT\1\2\u052b\u0532\bT\1"+
		"\2\u052c\u052d\bT\1\2\u052d\u0532\7U\2\2\u052e\u052f\bT\1\2\u052f\u0530"+
		"\7V\2\2\u0530\u0532\7\u0127\2\2\u0531\u0518\3\2\2\2\u0531\u052c\3\2\2"+
		"\2\u0531\u052e\3\2\2\2\u0532\u00a7\3\2\2\2\u0533\u0534\5\u00a6T\2\u0534"+
		"\u0535\7\2\2\3\u0535\u00a9\3\2\2\2\u0536\u0537\bV\1\2\u0537\u0538\5\u00ae"+
		"X\2\u0538\u0539\5r:\2\u0539\u053a\bV\1\2\u053a\u0541\3\2\2\2\u053b\u053c"+
		"\bV\1\2\u053c\u0541\7W\2\2\u053d\u053e\bV\1\2\u053e\u053f\7X\2\2\u053f"+
		"\u0541\7\u0127\2\2\u0540\u0536\3\2\2\2\u0540\u053b\3\2\2\2\u0540\u053d"+
		"\3\2\2\2\u0541\u00ab\3\2\2\2\u0542\u0543\5\u00aaV\2\u0543\u0544\7\2\2"+
		"\3\u0544\u00ad\3\2\2\2\u0545\u0546\bX\1\2\u0546\u0547\7\u0110\2\2\u0547"+
		"\u054e\bX\1\2\u0548\u0549\bX\1\2\u0549\u054e\7Y\2\2\u054a\u054b\bX\1\2"+
		"\u054b\u054c\7Z\2\2\u054c\u054e\7\u0127\2\2\u054d\u0545\3\2\2\2\u054d"+
		"\u0548\3\2\2\2\u054d\u054a\3\2\2\2\u054e\u00af\3\2\2\2\u054f\u0550\5\u00ae"+
		"X\2\u0550\u0551\7\2\2\3\u0551\u00b1\3\2\2\2\u0552\u0553\bZ\1\2\u0553\u0554"+
		"\5\u0096L\2\u0554\u0555\5\u00b6\\\2\u0555\u0556\5\u009eP\2\u0556\u0557"+
		"\bZ\1\2\u0557\u055e\3\2\2\2\u0558\u0559\bZ\1\2\u0559\u055e\7[\2\2\u055a"+
		"\u055b\bZ\1\2\u055b\u055c\7\\\2\2\u055c\u055e\7\u0127\2\2\u055d\u0552"+
		"\3\2\2\2\u055d\u0558\3\2\2\2\u055d\u055a\3\2\2\2\u055e\u00b3\3\2\2\2\u055f"+
		"\u0560\5\u00b2Z\2\u0560\u0561\7\2\2\3\u0561\u00b5\3\2\2\2\u0562\u0563"+
		"\b\\\1\2\u0563\u0565\b\\\1\2\u0564\u0566\5\u00ba^\2\u0565\u0564\3\2\2"+
		"\2\u0565\u0566\3\2\2\2\u0566\u056f\3\2\2\2\u0567\u056d\b\\\1\2\u0568\u0569"+
		"\b\\\1\2\u0569\u056e\7]\2\2\u056a\u056b\b\\\1\2\u056b\u056c\7^\2\2\u056c"+
		"\u056e\7\u0127\2\2\u056d\u0568\3\2\2\2\u056d\u056a\3\2\2\2\u056e\u0570"+
		"\3\2\2\2\u056f\u0567\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0571\3\2\2\2\u0571"+
		"\u0572\b\\\1\2\u0572\u0579\b\\\1\2\u0573\u0574\b\\\1\2\u0574\u0579\7]"+
		"\2\2\u0575\u0576\b\\\1\2\u0576\u0577\7^\2\2\u0577\u0579\7\u0127\2\2\u0578"+
		"\u0562\3\2\2\2\u0578\u0573\3\2\2\2\u0578\u0575\3\2\2\2\u0579\u00b7\3\2"+
		"\2\2\u057a\u057b\5\u00b6\\\2\u057b\u057c\7\2\2\3\u057c\u00b9\3\2\2\2\u057d"+
		"\u057e\b^\1\2\u057e\u057f\5v<\2\u057f\u0580\5\u00be`\2\u0580\u0581\b^"+
		"\1\2\u0581\u0588\3\2\2\2\u0582\u0583\b^\1\2\u0583\u0588\7_\2\2\u0584\u0585"+
		"\b^\1\2\u0585\u0586\7`\2\2\u0586\u0588\7\u0127\2\2\u0587\u057d\3\2\2\2"+
		"\u0587\u0582\3\2\2\2\u0587\u0584\3\2\2\2\u0588\u00bb\3\2\2\2\u0589\u058a"+
		"\5\u00ba^\2\u058a\u058b\7\2\2\3\u058b\u00bd\3\2\2\2\u058c\u058d\b`\1\2"+
		"\u058d\u0591\b`\1\2\u058e\u0590\5\u00c2b\2\u058f\u058e\3\2\2\2\u0590\u0593"+
		"\3\2\2\2\u0591\u058f\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u059c\3\2\2\2\u0593"+
		"\u0591\3\2\2\2\u0594\u059a\b`\1\2\u0595\u0596\b`\1\2\u0596\u059b\7a\2"+
		"\2\u0597\u0598\b`\1\2\u0598\u0599\7b\2\2\u0599\u059b\7\u0127\2\2\u059a"+
		"\u0595\3\2\2\2\u059a\u0597\3\2\2\2\u059b\u059d\3\2\2\2\u059c\u0594\3\2"+
		"\2\2\u059c\u059d\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u059f\b`\1\2\u059f"+
		"\u05a6\b`\1\2\u05a0\u05a1\b`\1\2\u05a1\u05a6\7a\2\2\u05a2\u05a3\b`\1\2"+
		"\u05a3\u05a4\7b\2\2\u05a4\u05a6\7\u0127\2\2\u05a5\u058c\3\2\2\2\u05a5"+
		"\u05a0\3\2\2\2\u05a5\u05a2\3\2\2\2\u05a6\u00bf\3\2\2\2\u05a7\u05a8\5\u00be"+
		"`\2\u05a8\u05a9\7\2\2\3\u05a9\u00c1\3\2\2\2\u05aa\u05ab\bb\1\2\u05ab\u05ac"+
		"\5\u00aeX\2\u05ac\u05ad\5v<\2\u05ad\u05ae\bb\1\2\u05ae\u05b5\3\2\2\2\u05af"+
		"\u05b0\bb\1\2\u05b0\u05b5\7c\2\2\u05b1\u05b2\bb\1\2\u05b2\u05b3\7d\2\2"+
		"\u05b3\u05b5\7\u0127\2\2\u05b4\u05aa\3\2\2\2\u05b4\u05af\3\2\2\2\u05b4"+
		"\u05b1\3\2\2\2\u05b5\u00c3\3\2\2\2\u05b6\u05b7\5\u00c2b\2\u05b7\u05b8"+
		"\7\2\2\3\u05b8\u00c5\3\2\2\2\u05b9\u05ba\bd\1\2\u05ba\u05bb\5\u00caf\2"+
		"\u05bb\u05bc\5\u00ceh\2\u05bc\u05bd\5\u00d2j\2\u05bd\u05be\bd\1\2\u05be"+
		"\u05c5\3\2\2\2\u05bf\u05c0\bd\1\2\u05c0\u05c5\7e\2\2\u05c1\u05c2\bd\1"+
		"\2\u05c2\u05c3\7f\2\2\u05c3\u05c5\7\u0127\2\2\u05c4\u05b9\3\2\2\2\u05c4"+
		"\u05bf\3\2\2\2\u05c4\u05c1\3\2\2\2\u05c5\u00c7\3\2\2\2\u05c6\u05c7\5\u00c6"+
		"d\2\u05c7\u05c8\7\2\2\3\u05c8\u00c9\3\2\2\2\u05c9\u05ca\bf\1\2\u05ca\u05cb"+
		"\7\u0109\2\2\u05cb\u05d2\bf\1\2\u05cc\u05cd\bf\1\2\u05cd\u05d2\7g\2\2"+
		"\u05ce\u05cf\bf\1\2\u05cf\u05d0\7h\2\2\u05d0\u05d2\7\u0127\2\2\u05d1\u05c9"+
		"\3\2\2\2\u05d1\u05cc\3\2\2\2\u05d1\u05ce\3\2\2\2\u05d2\u00cb\3\2\2\2\u05d3"+
		"\u05d4\5\u00caf\2\u05d4\u05d5\7\2\2\3\u05d5\u00cd\3\2\2\2\u05d6\u05d7"+
		"\bh\1\2\u05d7\u05d9\bh\1\2\u05d8\u05da\5\u00d6l\2\u05d9\u05d8\3\2\2\2"+
		"\u05d9\u05da\3\2\2\2\u05da\u05e3\3\2\2\2\u05db\u05e1\bh\1\2\u05dc\u05dd"+
		"\bh\1\2\u05dd\u05e2\7i\2\2\u05de\u05df\bh\1\2\u05df\u05e0\7j\2\2\u05e0"+
		"\u05e2\7\u0127\2\2\u05e1\u05dc\3\2\2\2\u05e1\u05de\3\2\2\2\u05e2\u05e4"+
		"\3\2\2\2\u05e3\u05db\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5"+
		"\u05e6\bh\1\2\u05e6\u05ed\bh\1\2\u05e7\u05e8\bh\1\2\u05e8\u05ed\7i\2\2"+
		"\u05e9\u05ea\bh\1\2\u05ea\u05eb\7j\2\2\u05eb\u05ed\7\u0127\2\2\u05ec\u05d6"+
		"\3\2\2\2\u05ec\u05e7\3\2\2\2\u05ec\u05e9\3\2\2\2\u05ed\u00cf\3\2\2\2\u05ee"+
		"\u05ef\5\u00ceh\2\u05ef\u05f0\7\2\2\3\u05f0\u00d1\3\2\2\2\u05f1\u05f2"+
		"\bj\1\2\u05f2\u05f3\7\u010a\2\2\u05f3\u05fa\bj\1\2\u05f4\u05f5\bj\1\2"+
		"\u05f5\u05fa\7k\2\2\u05f6\u05f7\bj\1\2\u05f7\u05f8\7l\2\2\u05f8\u05fa"+
		"\7\u0127\2\2\u05f9\u05f1\3\2\2\2\u05f9\u05f4\3\2\2\2\u05f9\u05f6\3\2\2"+
		"\2\u05fa\u00d3\3\2\2\2\u05fb\u05fc\5\u00d2j\2\u05fc\u05fd\7\2\2\3\u05fd"+
		"\u00d5\3\2\2\2\u05fe\u05ff\bl\1\2\u05ff\u0600\5r:\2\u0600\u0601\5\u00da"+
		"n\2\u0601\u0602\bl\1\2\u0602\u0609\3\2\2\2\u0603\u0604\bl\1\2\u0604\u0609"+
		"\7m\2\2\u0605\u0606\bl\1\2\u0606\u0607\7n\2\2\u0607\u0609\7\u0127\2\2"+
		"\u0608\u05fe\3\2\2\2\u0608\u0603\3\2\2\2\u0608\u0605\3\2\2\2\u0609\u00d7"+
		"\3\2\2\2\u060a\u060b\5\u00d6l\2\u060b\u060c\7\2\2\3\u060c\u00d9\3\2\2"+
		"\2\u060d\u060e\bn\1\2\u060e\u0612\bn\1\2\u060f\u0611\5\u00dep\2\u0610"+
		"\u060f\3\2\2\2\u0611\u0614\3\2\2\2\u0612\u0610\3\2\2\2\u0612\u0613\3\2"+
		"\2\2\u0613\u061d\3\2\2\2\u0614\u0612\3\2\2\2\u0615\u061b\bn\1\2\u0616"+
		"\u0617\bn\1\2\u0617\u061c\7o\2\2\u0618\u0619\bn\1\2\u0619\u061a\7p\2\2"+
		"\u061a\u061c\7\u0127\2\2\u061b\u0616\3\2\2\2\u061b\u0618\3\2\2\2\u061c"+
		"\u061e\3\2\2\2\u061d\u0615\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u061f\3\2"+
		"\2\2\u061f\u0620\bn\1\2\u0620\u0627\bn\1\2\u0621\u0622\bn\1\2\u0622\u0627"+
		"\7o\2\2\u0623\u0624\bn\1\2\u0624\u0625\7p\2\2\u0625\u0627\7\u0127\2\2"+
		"\u0626\u060d\3\2\2\2\u0626\u0621\3\2\2\2\u0626\u0623\3\2\2\2\u0627\u00db"+
		"\3\2\2\2\u0628\u0629\5\u00dan\2\u0629\u062a\7\2\2\3\u062a\u00dd\3\2\2"+
		"\2\u062b\u062c\bp\1\2\u062c\u062d\5\22\n\2\u062d\u062e\5\u00e2r\2\u062e"+
		"\u062f\bp\1\2\u062f\u0636\3\2\2\2\u0630\u0631\bp\1\2\u0631\u0636\7q\2"+
		"\2\u0632\u0633\bp\1\2\u0633\u0634\7r\2\2\u0634\u0636\7\u0127\2\2\u0635"+
		"\u062b\3\2\2\2\u0635\u0630\3\2\2\2\u0635\u0632\3\2\2\2\u0636\u00df\3\2"+
		"\2\2\u0637\u0638\5\u00dep\2\u0638\u0639\7\2\2\3\u0639\u00e1\3\2\2\2\u063a"+
		"\u063b\br\1\2\u063b\u063d\br\1\2\u063c\u063e\5r:\2\u063d\u063c\3\2\2\2"+
		"\u063d\u063e\3\2\2\2\u063e\u0647\3\2\2\2\u063f\u0645\br\1\2\u0640\u0641"+
		"\br\1\2\u0641\u0646\7s\2\2\u0642\u0643\br\1\2\u0643\u0644\7t\2\2\u0644"+
		"\u0646\7\u0127\2\2\u0645\u0640\3\2\2\2\u0645\u0642\3\2\2\2\u0646\u0648"+
		"\3\2\2\2\u0647\u063f\3\2\2\2\u0647\u0648\3\2\2\2\u0648\u0649\3\2\2\2\u0649"+
		"\u064a\br\1\2\u064a\u0651\br\1\2\u064b\u064c\br\1\2\u064c\u0651\7s\2\2"+
		"\u064d\u064e\br\1\2\u064e\u064f\7t\2\2\u064f\u0651\7\u0127\2\2\u0650\u063a"+
		"\3\2\2\2\u0650\u064b\3\2\2\2\u0650\u064d\3\2\2\2\u0651\u00e3\3\2\2\2\u0652"+
		"\u0653\5\u00e2r\2\u0653\u0654\7\2\2\3\u0654\u00e5\3\2\2\2\u0655\u0656"+
		"\bt\1\2\u0656\u0657\5\u00eav\2\u0657\u0658\5\u00eex\2\u0658\u0659\5\u00ea"+
		"v\2\u0659\u065a\5\u00f2z\2\u065a\u065b\5\u00f6|\2\u065b\u065c\bt\1\2\u065c"+
		"\u0663\3\2\2\2\u065d\u065e\bt\1\2\u065e\u0663\7u\2\2\u065f\u0660\bt\1"+
		"\2\u0660\u0661\7v\2\2\u0661\u0663\7\u0127\2\2\u0662\u0655\3\2\2\2\u0662"+
		"\u065d\3\2\2\2\u0662\u065f\3\2\2\2\u0663\u00e7\3\2\2\2\u0664\u0665\5\u00e6"+
		"t\2\u0665\u0666\7\2\2\3\u0666\u00e9\3\2\2\2\u0667\u0668\bv\1\2\u0668\u066a"+
		"\bv\1\2\u0669\u066b\5\u00fa~\2\u066a\u0669\3\2\2\2\u066a\u066b\3\2\2\2"+
		"\u066b\u0674\3\2\2\2\u066c\u0672\bv\1\2\u066d\u066e\bv\1\2\u066e\u0673"+
		"\7w\2\2\u066f\u0670\bv\1\2\u0670\u0671\7x\2\2\u0671\u0673\7\u0127\2\2"+
		"\u0672\u066d\3\2\2\2\u0672\u066f\3\2\2\2\u0673\u0675\3\2\2\2\u0674\u066c"+
		"\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u0677\bv\1\2\u0677"+
		"\u067e\bv\1\2\u0678\u0679\bv\1\2\u0679\u067e\7w\2\2\u067a\u067b\bv\1\2"+
		"\u067b\u067c\7x\2\2\u067c\u067e\7\u0127\2\2\u067d\u0667\3\2\2\2\u067d"+
		"\u0678\3\2\2\2\u067d\u067a\3\2\2\2\u067e\u00eb\3\2\2\2\u067f\u0680\5\u00ea"+
		"v\2\u0680\u0681\7\2\2\3\u0681\u00ed\3\2\2\2\u0682\u0683\bx\1\2\u0683\u0684"+
		"\7\u011f\2\2\u0684\u068b\bx\1\2\u0685\u0686\bx\1\2\u0686\u068b\7y\2\2"+
		"\u0687\u0688\bx\1\2\u0688\u0689\7z\2\2\u0689\u068b\7\u0127\2\2\u068a\u0682"+
		"\3\2\2\2\u068a\u0685\3\2\2\2\u068a\u0687\3\2\2\2\u068b\u00ef\3\2\2\2\u068c"+
		"\u068d\5\u00eex\2\u068d\u068e\7\2\2\3\u068e\u00f1\3\2\2\2\u068f\u0690"+
		"\bz\1\2\u0690\u0692\bz\1\2\u0691\u0693\5\u0102\u0082\2\u0692\u0691\3\2"+
		"\2\2\u0692\u0693\3\2\2\2\u0693\u069c\3\2\2\2\u0694\u069a\bz\1\2\u0695"+
		"\u0696\bz\1\2\u0696\u069b\7{\2\2\u0697\u0698\bz\1\2\u0698\u0699\7|\2\2"+
		"\u0699\u069b\7\u0127\2\2\u069a\u0695\3\2\2\2\u069a\u0697\3\2\2\2\u069b"+
		"\u069d\3\2\2\2\u069c\u0694\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u069e\3\2"+
		"\2\2\u069e\u069f\bz\1\2\u069f\u06a6\bz\1\2\u06a0\u06a1\bz\1\2\u06a1\u06a6"+
		"\7{\2\2\u06a2\u06a3\bz\1\2\u06a3\u06a4\7|\2\2\u06a4\u06a6\7\u0127\2\2"+
		"\u06a5\u068f\3\2\2\2\u06a5\u06a0\3\2\2\2\u06a5\u06a2\3\2\2\2\u06a6\u00f3"+
		"\3\2\2\2\u06a7\u06a8\5\u00f2z\2\u06a8\u06a9\7\2\2\3\u06a9\u00f5\3\2\2"+
		"\2\u06aa\u06ab\b|\1\2\u06ab\u06ad\b|\1\2\u06ac\u06ae\5\u011a\u008e\2\u06ad"+
		"\u06ac\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u06b7\3\2\2\2\u06af\u06b5\b|"+
		"\1\2\u06b0\u06b1\b|\1\2\u06b1\u06b6\7}\2\2\u06b2\u06b3\b|\1\2\u06b3\u06b4"+
		"\7~\2\2\u06b4\u06b6\7\u0127\2\2\u06b5\u06b0\3\2\2\2\u06b5\u06b2\3\2\2"+
		"\2\u06b6\u06b8\3\2\2\2\u06b7\u06af\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06b9"+
		"\3\2\2\2\u06b9\u06ba\b|\1\2\u06ba\u06c1\b|\1\2\u06bb\u06bc\b|\1\2\u06bc"+
		"\u06c1\7}\2\2\u06bd\u06be\b|\1\2\u06be\u06bf\7~\2\2\u06bf\u06c1\7\u0127"+
		"\2\2\u06c0\u06aa\3\2\2\2\u06c0\u06bb\3\2\2\2\u06c0\u06bd\3\2\2\2\u06c1"+
		"\u00f7\3\2\2\2\u06c2\u06c3\5\u00f6|\2\u06c3\u06c4\7\2\2\3\u06c4\u00f9"+
		"\3\2\2\2\u06c5\u06c6\b~\1\2\u06c6\u06c7\5\u00fe\u0080\2\u06c7\u06c8\b"+
		"~\1\2\u06c8\u06cf\3\2\2\2\u06c9\u06ca\b~\1\2\u06ca\u06cf\7\177\2\2\u06cb"+
		"\u06cc\b~\1\2\u06cc\u06cd\7\u0080\2\2\u06cd\u06cf\7\u0127\2\2\u06ce\u06c5"+
		"\3\2\2\2\u06ce\u06c9\3\2\2\2\u06ce\u06cb\3\2\2\2\u06cf\u00fb\3\2\2\2\u06d0"+
		"\u06d1\5\u00fa~\2\u06d1\u06d2\7\2\2\3\u06d2\u00fd\3\2\2\2\u06d3\u06d4"+
		"\b\u0080\1\2\u06d4\u06d5\7\u0115\2\2\u06d5\u06dc\b\u0080\1\2\u06d6\u06d7"+
		"\b\u0080\1\2\u06d7\u06dc\7\u0081\2\2\u06d8\u06d9\b\u0080\1\2\u06d9\u06da"+
		"\7\u0082\2\2\u06da\u06dc\7\u0127\2\2\u06db\u06d3\3\2\2\2\u06db\u06d6\3"+
		"\2\2\2\u06db\u06d8\3\2\2\2\u06dc\u00ff\3\2\2\2\u06dd\u06de\5\u00fe\u0080"+
		"\2\u06de\u06df\7\2\2\3\u06df\u0101\3\2\2\2\u06e0\u06e1\b\u0082\1\2\u06e1"+
		"\u06e2\5\u0106\u0084\2\u06e2\u06e3\b\u0082\1\2\u06e3\u06ea\3\2\2\2\u06e4"+
		"\u06e5\b\u0082\1\2\u06e5\u06ea\7\u0083\2\2\u06e6\u06e7\b\u0082\1\2\u06e7"+
		"\u06e8\7\u0084\2\2\u06e8\u06ea\7\u0127\2\2\u06e9\u06e0\3\2\2\2\u06e9\u06e4"+
		"\3\2\2\2\u06e9\u06e6\3\2\2\2\u06ea\u0103\3\2\2\2\u06eb\u06ec\5\u0102\u0082"+
		"\2\u06ec\u06ed\7\2\2\3\u06ed\u0105\3\2\2\2\u06ee\u06ef\b\u0084\1\2\u06ef"+
		"\u06f0\7\u0116\2\2\u06f0\u06f7\b\u0084\1\2\u06f1\u06f2\b\u0084\1\2\u06f2"+
		"\u06f7\7\u0085\2\2\u06f3\u06f4\b\u0084\1\2\u06f4\u06f5\7\u0086\2\2\u06f5"+
		"\u06f7\7\u0127\2\2\u06f6\u06ee\3\2\2\2\u06f6\u06f1\3\2\2\2\u06f6\u06f3"+
		"\3\2\2\2\u06f7\u0107\3\2\2\2\u06f8\u06f9\5\u0106\u0084\2\u06f9\u06fa\7"+
		"\2\2\3\u06fa\u0109\3\2\2\2\u06fb\u06fc\b\u0086\1\2\u06fc\u06fd\5\u010e"+
		"\u0088\2\u06fd\u06fe\b\u0086\1\2\u06fe\u0709\3\2\2\2\u06ff\u0700\b\u0086"+
		"\1\2\u0700\u0701\5\u0112\u008a\2\u0701\u0702\b\u0086\1\2\u0702\u0709\3"+
		"\2\2\2\u0703\u0704\b\u0086\1\2\u0704\u0709\7\u0087\2\2\u0705\u0706\b\u0086"+
		"\1\2\u0706\u0707\7\u0088\2\2\u0707\u0709\7\u0127\2\2\u0708\u06fb\3\2\2"+
		"\2\u0708\u06ff\3\2\2\2\u0708\u0703\3\2\2\2\u0708\u0705\3\2\2\2\u0709\u010b"+
		"\3\2\2\2\u070a\u070b\5\u010a\u0086\2\u070b\u070c\7\2\2\3\u070c\u010d\3"+
		"\2\2\2\u070d\u070e\b\u0088\1\2\u070e\u070f\7\u0121\2\2\u070f\u0716\b\u0088"+
		"\1\2\u0710\u0711\b\u0088\1\2\u0711\u0716\7\u0089\2\2\u0712\u0713\b\u0088"+
		"\1\2\u0713\u0714\7\u008a\2\2\u0714\u0716\7\u0127\2\2\u0715\u070d\3\2\2"+
		"\2\u0715\u0710\3\2\2\2\u0715\u0712\3\2\2\2\u0716\u010f\3\2\2\2\u0717\u0718"+
		"\5\u010e\u0088\2\u0718\u0719\7\2\2\3\u0719\u0111\3\2\2\2\u071a\u071b\b"+
		"\u008a\1\2\u071b\u071c\7\u0122\2\2\u071c\u0723\b\u008a\1\2\u071d\u071e"+
		"\b\u008a\1\2\u071e\u0723\7\u008b\2\2\u071f\u0720\b\u008a\1\2\u0720\u0721"+
		"\7\u008c\2\2\u0721\u0723\7\u0127\2\2\u0722\u071a\3\2\2\2\u0722\u071d\3"+
		"\2\2\2\u0722\u071f\3\2\2\2\u0723\u0113\3\2\2\2\u0724\u0725\5\u0112\u008a"+
		"\2\u0725\u0726\7\2\2\3\u0726\u0115\3\2\2\2\u0727\u0728\b\u008c\1\2\u0728"+
		"\u0729\5z>\2\u0729\u072a\5\u00e6t\2\u072a\u072b\b\u008c\1\2\u072b\u0732"+
		"\3\2\2\2\u072c\u072d\b\u008c\1\2\u072d\u0732\7\u008d\2\2\u072e\u072f\b"+
		"\u008c\1\2\u072f\u0730\7\u008e\2\2\u0730\u0732\7\u0127\2\2\u0731\u0727"+
		"\3\2\2\2\u0731\u072c\3\2\2\2\u0731\u072e\3\2\2\2\u0732\u0117\3\2\2\2\u0733"+
		"\u0734\5\u0116\u008c\2\u0734\u0735\7\2\2\3\u0735\u0119\3\2\2\2\u0736\u0737"+
		"\b\u008e\1\2\u0737\u0738\5\u011e\u0090\2\u0738\u0739\5\u01ae\u00d8\2\u0739"+
		"\u073a\b\u008e\1\2\u073a\u0741\3\2\2\2\u073b\u073c\b\u008e\1\2\u073c\u0741"+
		"\7\u008f\2\2\u073d\u073e\b\u008e\1\2\u073e\u073f\7\u0090\2\2\u073f\u0741"+
		"\7\u0127\2\2\u0740\u0736\3\2\2\2\u0740\u073b\3\2\2\2\u0740\u073d\3\2\2"+
		"\2\u0741\u011b\3\2\2\2\u0742\u0743\5\u011a\u008e\2\u0743\u0744\7\2\2\3"+
		"\u0744\u011d\3\2\2\2\u0745\u0746\b\u0090\1\2\u0746\u0747\7\u0112\2\2\u0747"+
		"\u074e\b\u0090\1\2\u0748\u0749\b\u0090\1\2\u0749\u074e\7\u0091\2\2\u074a"+
		"\u074b\b\u0090\1\2\u074b\u074c\7\u0092\2\2\u074c\u074e\7\u0127\2\2\u074d"+
		"\u0745\3\2\2\2\u074d\u0748\3\2\2\2\u074d\u074a\3\2\2\2\u074e\u011f\3\2"+
		"\2\2\u074f\u0750\5\u011e\u0090\2\u0750\u0751\7\2\2\3\u0751\u0121\3\2\2"+
		"\2\u0752\u0753\b\u0092\1\2\u0753\u0754\5\u0126\u0094\2\u0754\u0755\5\u012a"+
		"\u0096\2\u0755\u0756\b\u0092\1\2\u0756\u076c\3\2\2\2\u0757\u0758\b\u0092"+
		"\1\2\u0758\u0759\5\u0126\u0094\2\u0759\u075a\5\u012e\u0098\2\u075a\u075b"+
		"\b\u0092\1\2\u075b\u076c\3\2\2\2\u075c\u075d\b\u0092\1\2\u075d\u075e\5"+
		"\u0126\u0094\2\u075e\u075f\5\u0132\u009a\2\u075f\u0760\b\u0092\1\2\u0760"+
		"\u076c\3\2\2\2\u0761\u0762\b\u0092\1\2\u0762\u0763\5\u0126\u0094\2\u0763"+
		"\u0764\5\u0136\u009c\2\u0764\u0765\b\u0092\1\2\u0765\u076c\3\2\2\2\u0766"+
		"\u0767\b\u0092\1\2\u0767\u076c\7\u0093\2\2\u0768\u0769\b\u0092\1\2\u0769"+
		"\u076a\7\u0094\2\2\u076a\u076c\7\u0127\2\2\u076b\u0752\3\2\2\2\u076b\u0757"+
		"\3\2\2\2\u076b\u075c\3\2\2\2\u076b\u0761\3\2\2\2\u076b\u0766\3\2\2\2\u076b"+
		"\u0768\3\2\2\2\u076c\u0123\3\2\2\2\u076d\u076e\5\u0122\u0092\2\u076e\u076f"+
		"\7\2\2\3\u076f\u0125\3\2\2\2\u0770\u0771\b\u0094\1\2\u0771\u0772\7\u0119"+
		"\2\2\u0772\u0779\b\u0094\1\2\u0773\u0774\b\u0094\1\2\u0774\u0779\7\u0095"+
		"\2\2\u0775\u0776\b\u0094\1\2\u0776\u0777\7\u0096\2\2\u0777\u0779\7\u0127"+
		"\2\2\u0778\u0770\3\2\2\2\u0778\u0773\3\2\2\2\u0778\u0775\3\2\2\2\u0779"+
		"\u0127\3\2\2\2\u077a\u077b\5\u0126\u0094\2\u077b\u077c\7\2\2\3\u077c\u0129"+
		"\3\2\2\2\u077d\u077e\b\u0096\1\2\u077e\u077f\7\u011a\2\2\u077f\u0786\b"+
		"\u0096\1\2\u0780\u0781\b\u0096\1\2\u0781\u0786\7\u0097\2\2\u0782\u0783"+
		"\b\u0096\1\2\u0783\u0784\7\u0098\2\2\u0784\u0786\7\u0127\2\2\u0785\u077d"+
		"\3\2\2\2\u0785\u0780\3\2\2\2\u0785\u0782\3\2\2\2\u0786\u012b\3\2\2\2\u0787"+
		"\u0788\5\u012a\u0096\2\u0788\u0789\7\2\2\3\u0789\u012d\3\2\2\2\u078a\u078b"+
		"\b\u0098\1\2\u078b\u078c\7\u011b\2\2\u078c\u0793\b\u0098\1\2\u078d\u078e"+
		"\b\u0098\1\2\u078e\u0793\7\u0099\2\2\u078f\u0790\b\u0098\1\2\u0790\u0791"+
		"\7\u009a\2\2\u0791\u0793\7\u0127\2\2\u0792\u078a\3\2\2\2\u0792\u078d\3"+
		"\2\2\2\u0792\u078f\3\2\2\2\u0793\u012f\3\2\2\2\u0794\u0795\5\u012e\u0098"+
		"\2\u0795\u0796\7\2\2\3\u0796\u0131\3\2\2\2\u0797\u0798\b\u009a\1\2\u0798"+
		"\u0799\7\u011c\2\2\u0799\u07a0\b\u009a\1\2\u079a\u079b\b\u009a\1\2\u079b"+
		"\u07a0\7\u009b\2\2\u079c\u079d\b\u009a\1\2\u079d\u079e\7\u009c\2\2\u079e"+
		"\u07a0\7\u0127\2\2\u079f\u0797\3\2\2\2\u079f\u079a\3\2\2\2\u079f\u079c"+
		"\3\2\2\2\u07a0\u0133\3\2\2\2\u07a1\u07a2\5\u0132\u009a\2\u07a2\u07a3\7"+
		"\2\2\3\u07a3\u0135\3\2\2\2\u07a4\u07a5\b\u009c\1\2\u07a5\u07a6\7\u011d"+
		"\2\2\u07a6\u07ad\b\u009c\1\2\u07a7\u07a8\b\u009c\1\2\u07a8\u07ad\7\u009d"+
		"\2\2\u07a9\u07aa\b\u009c\1\2\u07aa\u07ab\7\u009e\2\2\u07ab\u07ad\7\u0127"+
		"\2\2\u07ac\u07a4\3\2\2\2\u07ac\u07a7\3\2\2\2\u07ac\u07a9\3\2\2\2\u07ad"+
		"\u0137\3\2\2\2\u07ae\u07af\5\u0136\u009c\2\u07af\u07b0\7\2\2\3\u07b0\u0139"+
		"\3\2\2\2\u07b1\u07b2\b\u009e\1\2\u07b2\u07b3\5\u013e\u00a0\2\u07b3\u07b4"+
		"\5\u0146\u00a4\2\u07b4\u07b5\5\u014a\u00a6\2\u07b5\u07b6\5\u0142\u00a2"+
		"\2\u07b6\u07b7\b\u009e\1\2\u07b7\u07be\3\2\2\2\u07b8\u07b9\b\u009e\1\2"+
		"\u07b9\u07be\7\u009f\2\2\u07ba\u07bb\b\u009e\1\2\u07bb\u07bc\7\u00a0\2"+
		"\2\u07bc\u07be\7\u0127\2\2\u07bd\u07b1\3\2\2\2\u07bd\u07b8\3\2\2\2\u07bd"+
		"\u07ba\3\2\2\2\u07be\u013b\3\2\2\2\u07bf\u07c0\5\u013a\u009e\2\u07c0\u07c1"+
		"\7\2\2\3\u07c1\u013d\3\2\2\2\u07c2\u07c3\b\u00a0\1\2\u07c3\u07c4\7\u0103"+
		"\2\2\u07c4\u07cb\b\u00a0\1\2\u07c5\u07c6\b\u00a0\1\2\u07c6\u07cb\7\u00a1"+
		"\2\2\u07c7\u07c8\b\u00a0\1\2\u07c8\u07c9\7\u00a2\2\2\u07c9\u07cb\7\u0127"+
		"\2\2\u07ca\u07c2\3\2\2\2\u07ca\u07c5\3\2\2\2\u07ca\u07c7\3\2\2\2\u07cb"+
		"\u013f\3\2\2\2\u07cc\u07cd\5\u013e\u00a0\2\u07cd\u07ce\7\2\2\3\u07ce\u0141"+
		"\3\2\2\2\u07cf\u07d0\b\u00a2\1\2\u07d0\u07d2\b\u00a2\1\2\u07d1\u07d3\5"+
		"\u015a\u00ae\2\u07d2\u07d1\3\2\2\2\u07d2\u07d3\3\2\2\2\u07d3\u07dc\3\2"+
		"\2\2\u07d4\u07da\b\u00a2\1\2\u07d5\u07d6\b\u00a2\1\2\u07d6\u07db\7\u00a3"+
		"\2\2\u07d7\u07d8\b\u00a2\1\2\u07d8\u07d9\7\u00a4\2\2\u07d9\u07db\7\u0127"+
		"\2\2\u07da\u07d5\3\2\2\2\u07da\u07d7\3\2\2\2\u07db\u07dd\3\2\2\2\u07dc"+
		"\u07d4\3\2\2\2\u07dc\u07dd\3\2\2\2\u07dd\u07de\3\2\2\2\u07de\u07df\b\u00a2"+
		"\1\2\u07df\u07e6\b\u00a2\1\2\u07e0\u07e1\b\u00a2\1\2\u07e1\u07e6\7\u00a3"+
		"\2\2\u07e2\u07e3\b\u00a2\1\2\u07e3\u07e4\7\u00a4\2\2\u07e4\u07e6\7\u0127"+
		"\2\2\u07e5\u07cf\3\2\2\2\u07e5\u07e0\3\2\2\2\u07e5\u07e2\3\2\2\2\u07e6"+
		"\u0143\3\2\2\2\u07e7\u07e8\5\u0142\u00a2\2\u07e8\u07e9\7\2\2\3\u07e9\u0145"+
		"\3\2\2\2\u07ea\u07eb\b\u00a4\1\2\u07eb\u07ec\5v<\2\u07ec\u07ed\b\u00a4"+
		"\1\2\u07ed\u07f4\3\2\2\2\u07ee\u07ef\b\u00a4\1\2\u07ef\u07f4\7\u00a5\2"+
		"\2\u07f0\u07f1\b\u00a4\1\2\u07f1\u07f2\7\u00a6\2\2\u07f2\u07f4\7\u0127"+
		"\2\2\u07f3\u07ea\3\2\2\2\u07f3\u07ee\3\2\2\2\u07f3\u07f0\3\2\2\2\u07f4"+
		"\u0147\3\2\2\2\u07f5\u07f6\5\u0146\u00a4\2\u07f6\u07f7\7\2\2\3\u07f7\u0149"+
		"\3\2\2\2\u07f8\u07f9\b\u00a6\1\2\u07f9\u07fa\5\u0156\u00ac\2\u07fa\u07fb"+
		"\5\u014e\u00a8\2\u07fb\u07fc\b\u00a6\1\2\u07fc\u0803\3\2\2\2\u07fd\u07fe"+
		"\b\u00a6\1\2\u07fe\u0803\7\u00a7\2\2\u07ff\u0800\b\u00a6\1\2\u0800\u0801"+
		"\7\u00a8\2\2\u0801\u0803\7\u0127\2\2\u0802\u07f8\3\2\2\2\u0802\u07fd\3"+
		"\2\2\2\u0802\u07ff\3\2\2\2\u0803\u014b\3\2\2\2\u0804\u0805\5\u014a\u00a6"+
		"\2\u0805\u0806\7\2\2\3\u0806\u014d\3\2\2\2\u0807\u0808\b\u00a8\1\2\u0808"+
		"\u080c\b\u00a8\1\2\u0809\u080b\5\u0152\u00aa\2\u080a\u0809\3\2\2\2\u080b"+
		"\u080e\3\2\2\2\u080c\u080a\3\2\2\2\u080c\u080d\3\2\2\2\u080d\u0817\3\2"+
		"\2\2\u080e\u080c\3\2\2\2\u080f\u0815\b\u00a8\1\2\u0810\u0811\b\u00a8\1"+
		"\2\u0811\u0816\7\u00a9\2\2\u0812\u0813\b\u00a8\1\2\u0813\u0814\7\u00aa"+
		"\2\2\u0814\u0816\7\u0127\2\2\u0815\u0810\3\2\2\2\u0815\u0812\3\2\2\2\u0816"+
		"\u0818\3\2\2\2\u0817\u080f\3\2\2\2\u0817\u0818\3\2\2\2\u0818\u0819\3\2"+
		"\2\2\u0819\u081a\b\u00a8\1\2\u081a\u0821\b\u00a8\1\2\u081b\u081c\b\u00a8"+
		"\1\2\u081c\u0821\7\u00a9\2\2\u081d\u081e\b\u00a8\1\2\u081e\u081f\7\u00aa"+
		"\2\2\u081f\u0821\7\u0127\2\2\u0820\u0807\3\2\2\2\u0820\u081b\3\2\2\2\u0820"+
		"\u081d\3\2\2\2\u0821\u014f\3\2\2\2\u0822\u0823\5\u014e\u00a8\2\u0823\u0824"+
		"\7\2\2\3\u0824\u0151\3\2\2\2\u0825\u0826\b\u00aa\1\2\u0826\u0827\5\22"+
		"\n\2\u0827\u0828\5\u0156\u00ac\2\u0828\u0829\b\u00aa\1\2\u0829\u0830\3"+
		"\2\2\2\u082a\u082b\b\u00aa\1\2\u082b\u0830\7\u00ab\2\2\u082c\u082d\b\u00aa"+
		"\1\2\u082d\u082e\7\u00ac\2\2\u082e\u0830\7\u0127\2\2\u082f\u0825\3\2\2"+
		"\2\u082f\u082a\3\2\2\2\u082f\u082c\3\2\2\2\u0830\u0153\3\2\2\2\u0831\u0832"+
		"\5\u0152\u00aa\2\u0832\u0833\7\2\2\3\u0833\u0155\3\2\2\2\u0834\u0835\b"+
		"\u00ac\1\2\u0835\u0836\5> \2\u0836\u0837\b\u00ac\1\2\u0837\u083e\3\2\2"+
		"\2\u0838\u0839\b\u00ac\1\2\u0839\u083e\7\u00ad\2\2\u083a\u083b\b\u00ac"+
		"\1\2\u083b\u083c\7\u00ae\2\2\u083c\u083e\7\u0127\2\2\u083d\u0834\3\2\2"+
		"\2\u083d\u0838\3\2\2\2\u083d\u083a\3\2\2\2\u083e\u0157\3\2\2\2\u083f\u0840"+
		"\5\u0156\u00ac\2\u0840\u0841\7\2\2\3\u0841\u0159\3\2\2\2\u0842\u0843\b"+
		"\u00ae\1\2\u0843\u0844\5\u015e\u00b0\2\u0844\u0845\b\u00ae\1\2\u0845\u084c"+
		"\3\2\2\2\u0846\u0847\b\u00ae\1\2\u0847\u084c\7\u00af\2\2\u0848\u0849\b"+
		"\u00ae\1\2\u0849\u084a\7\u00b0\2\2\u084a\u084c\7\u0127\2\2\u084b\u0842"+
		"\3\2\2\2\u084b\u0846\3\2\2\2\u084b\u0848\3\2\2\2\u084c\u015b\3\2\2\2\u084d"+
		"\u084e\5\u015a\u00ae\2\u084e\u084f\7\2\2\3\u084f\u015d\3\2\2\2\u0850\u0851"+
		"\b\u00b0\1\2\u0851\u0852\7\u0104\2\2\u0852\u0859\b\u00b0\1\2\u0853\u0854"+
		"\b\u00b0\1\2\u0854\u0859\7\u00b1\2\2\u0855\u0856\b\u00b0\1\2\u0856\u0857"+
		"\7\u00b2\2\2\u0857\u0859\7\u0127\2\2\u0858\u0850\3\2\2\2\u0858\u0853\3"+
		"\2\2\2\u0858\u0855\3\2\2\2\u0859\u015f\3\2\2\2\u085a\u085b\5\u015e\u00b0"+
		"\2\u085b\u085c\7\2\2\3\u085c\u0161\3\2\2\2\u085d\u085e\b\u00b2\1\2\u085e"+
		"\u085f\5*\26\2\u085f\u0860\5\u0166\u00b4\2\u0860\u0861\5.\30\2\u0861\u0862"+
		"\b\u00b2\1\2\u0862\u0869\3\2\2\2\u0863\u0864\b\u00b2\1\2\u0864\u0869\7"+
		"\u00b3\2\2\u0865\u0866\b\u00b2\1\2\u0866\u0867\7\u00b4\2\2\u0867\u0869"+
		"\7\u0127\2\2\u0868\u085d\3\2\2\2\u0868\u0863\3\2\2\2\u0868\u0865\3\2\2"+
		"\2\u0869\u0163\3\2\2\2\u086a\u086b\5\u0162\u00b2\2\u086b\u086c\7\2\2\3"+
		"\u086c\u0165\3\2\2\2\u086d\u086e\b\u00b4\1\2\u086e\u0870\b\u00b4\1\2\u086f"+
		"\u0871\5\u016a\u00b6\2\u0870\u086f\3\2\2\2\u0870\u0871\3\2\2\2\u0871\u087a"+
		"\3\2\2\2\u0872\u0878\b\u00b4\1\2\u0873\u0874\b\u00b4\1\2\u0874\u0879\7"+
		"\u00b5\2\2\u0875\u0876\b\u00b4\1\2\u0876\u0877\7\u00b6\2\2\u0877\u0879"+
		"\7\u0127\2\2\u0878\u0873\3\2\2\2\u0878\u0875\3\2\2\2\u0879\u087b\3\2\2"+
		"\2\u087a\u0872\3\2\2\2\u087a\u087b\3\2\2\2\u087b\u087c\3\2\2\2\u087c\u087d"+
		"\b\u00b4\1\2\u087d\u0884\b\u00b4\1\2\u087e\u087f\b\u00b4\1\2\u087f\u0884"+
		"\7\u00b5\2\2\u0880\u0881\b\u00b4\1\2\u0881\u0882\7\u00b6\2\2\u0882\u0884"+
		"\7\u0127\2\2\u0883\u086d\3\2\2\2\u0883\u087e\3\2\2\2\u0883\u0880\3\2\2"+
		"\2\u0884\u0167\3\2\2\2\u0885\u0886\5\u0166\u00b4\2\u0886\u0887\7\2\2\3"+
		"\u0887\u0169\3\2\2\2\u0888\u0889\b\u00b6\1\2\u0889\u088a\5\u017a\u00be"+
		"\2\u088a\u088b\5\u016e\u00b8\2\u088b\u088c\b\u00b6\1\2\u088c\u0893\3\2"+
		"\2\2\u088d\u088e\b\u00b6\1\2\u088e\u0893\7\u00b7\2\2\u088f\u0890\b\u00b6"+
		"\1\2\u0890\u0891\7\u00b8\2\2\u0891\u0893\7\u0127\2\2\u0892\u0888\3\2\2"+
		"\2\u0892\u088d\3\2\2\2\u0892\u088f\3\2\2\2\u0893\u016b\3\2\2\2\u0894\u0895"+
		"\5\u016a\u00b6\2\u0895\u0896\7\2\2\3\u0896\u016d\3\2\2\2\u0897\u0898\b"+
		"\u00b8\1\2\u0898\u089c\b\u00b8\1\2\u0899\u089b\5\u0172\u00ba\2\u089a\u0899"+
		"\3\2\2\2\u089b\u089e\3\2\2\2\u089c\u089a\3\2\2\2\u089c\u089d\3\2\2\2\u089d"+
		"\u08a7\3\2\2\2\u089e\u089c\3\2\2\2\u089f\u08a5\b\u00b8\1\2\u08a0\u08a1"+
		"\b\u00b8\1\2\u08a1\u08a6\7\u00b9\2\2\u08a2\u08a3\b\u00b8\1\2\u08a3\u08a4"+
		"\7\u00ba\2\2\u08a4\u08a6\7\u0127\2\2\u08a5\u08a0\3\2\2\2\u08a5\u08a2\3"+
		"\2\2\2\u08a6\u08a8\3\2\2\2\u08a7\u089f\3\2\2\2\u08a7\u08a8\3\2\2\2\u08a8"+
		"\u08a9\3\2\2\2\u08a9\u08aa\b\u00b8\1\2\u08aa\u08b1\b\u00b8\1\2\u08ab\u08ac"+
		"\b\u00b8\1\2\u08ac\u08b1\7\u00b9\2\2\u08ad\u08ae\b\u00b8\1\2\u08ae\u08af"+
		"\7\u00ba\2\2\u08af\u08b1\7\u0127\2\2\u08b0\u0897\3\2\2\2\u08b0\u08ab\3"+
		"\2\2\2\u08b0\u08ad\3\2\2\2\u08b1\u016f\3\2\2\2\u08b2\u08b3\5\u016e\u00b8"+
		"\2\u08b3\u08b4\7\2\2\3\u08b4\u0171\3\2\2\2\u08b5\u08b6\b\u00ba\1\2\u08b6"+
		"\u08b7\5\22\n\2\u08b7\u08b8\5\u0176\u00bc\2\u08b8\u08b9\b\u00ba\1\2\u08b9"+
		"\u08c0\3\2\2\2\u08ba\u08bb\b\u00ba\1\2\u08bb\u08c0\7\u00bb\2\2\u08bc\u08bd"+
		"\b\u00ba\1\2\u08bd\u08be\7\u00bc\2\2\u08be\u08c0\7\u0127\2\2\u08bf\u08b5"+
		"\3\2\2\2\u08bf\u08ba\3\2\2\2\u08bf\u08bc\3\2\2\2\u08c0\u0173\3\2\2\2\u08c1"+
		"\u08c2\5\u0172\u00ba\2\u08c2\u08c3\7\2\2\3\u08c3\u0175\3\2\2\2\u08c4\u08c5"+
		"\b\u00bc\1\2\u08c5\u08c7\b\u00bc\1\2\u08c6\u08c8\5\u017a\u00be\2\u08c7"+
		"\u08c6\3\2\2\2\u08c7\u08c8\3\2\2\2\u08c8\u08d1\3\2\2\2\u08c9\u08cf\b\u00bc"+
		"\1\2\u08ca\u08cb\b\u00bc\1\2\u08cb\u08d0\7\u00bd\2\2\u08cc\u08cd\b\u00bc"+
		"\1\2\u08cd\u08ce\7\u00be\2\2\u08ce\u08d0\7\u0127\2\2\u08cf\u08ca\3\2\2"+
		"\2\u08cf\u08cc\3\2\2\2\u08d0\u08d2\3\2\2\2\u08d1\u08c9\3\2\2\2\u08d1\u08d2"+
		"\3\2\2\2\u08d2\u08d3\3\2\2\2\u08d3\u08d4\b\u00bc\1\2\u08d4\u08db\b\u00bc"+
		"\1\2\u08d5\u08d6\b\u00bc\1\2\u08d6\u08db\7\u00bd\2\2\u08d7\u08d8\b\u00bc"+
		"\1\2\u08d8\u08d9\7\u00be\2\2\u08d9\u08db\7\u0127\2\2\u08da\u08c4\3\2\2"+
		"\2\u08da\u08d5\3\2\2\2\u08da\u08d7\3\2\2\2\u08db\u0177\3\2\2\2\u08dc\u08dd"+
		"\5\u0176\u00bc\2\u08dd\u08de\7\2\2\3\u08de\u0179\3\2\2\2\u08df\u08e0\b"+
		"\u00be\1\2\u08e0\u08e1\5~@\2\u08e1\u08e2\b\u00be\1\2\u08e2\u0918\3\2\2"+
		"\2\u08e3\u08e4\b\u00be\1\2\u08e4\u08e5\5\u017e\u00c0\2\u08e5\u08e6\5~"+
		"@\2\u08e6\u08e7\b\u00be\1\2\u08e7\u0918\3\2\2\2\u08e8\u08e9\b\u00be\1"+
		"\2\u08e9\u08ea\5~@\2\u08ea\u08eb\5R*\2\u08eb\u08ec\5v<\2\u08ec\u08ed\b"+
		"\u00be\1\2\u08ed\u0918\3\2\2\2\u08ee\u08ef\b\u00be\1\2\u08ef\u08f0\5\u00ee"+
		"x\2\u08f0\u08f1\b\u00be\1\2\u08f1\u0918\3\2\2\2\u08f2\u08f3\b\u00be\1"+
		"\2\u08f3\u08f4\5\u017e\u00c0\2\u08f4\u08f5\5\u00eex\2\u08f5\u08f6\b\u00be"+
		"\1\2\u08f6\u0918\3\2\2\2\u08f7\u08f8\b\u00be\1\2\u08f8\u08f9\5\u00eex"+
		"\2\u08f9\u08fa\5R*\2\u08fa\u08fb\5v<\2\u08fb\u08fc\b\u00be\1\2\u08fc\u0918"+
		"\3\2\2\2\u08fd\u08fe\b\u00be\1\2\u08fe\u08ff\5\u010e\u0088\2\u08ff\u0900"+
		"\b\u00be\1\2\u0900\u0918\3\2\2\2\u0901\u0902\b\u00be\1\2\u0902\u0903\5"+
		"\u017e\u00c0\2\u0903\u0904\5\u010e\u0088\2\u0904\u0905\b\u00be\1\2\u0905"+
		"\u0918\3\2\2\2\u0906\u0907\b\u00be\1\2\u0907\u0908\5\u010e\u0088\2\u0908"+
		"\u0909\5R*\2\u0909\u090a\5v<\2\u090a\u090b\b\u00be\1\2\u090b\u0918\3\2"+
		"\2\2\u090c\u090d\b\u00be\1\2\u090d\u090e\5\u01ce\u00e8\2\u090e\u090f\5"+
		"R*\2\u090f\u0910\5v<\2\u0910\u0911\b\u00be\1\2\u0911\u0918\3\2\2\2\u0912"+
		"\u0913\b\u00be\1\2\u0913\u0918\7\u00bf\2\2\u0914\u0915\b\u00be\1\2\u0915"+
		"\u0916\7\u00c0\2\2\u0916\u0918\7\u0127\2\2\u0917\u08df\3\2\2\2\u0917\u08e3"+
		"\3\2\2\2\u0917\u08e8\3\2\2\2\u0917\u08ee\3\2\2\2\u0917\u08f2\3\2\2\2\u0917"+
		"\u08f7\3\2\2\2\u0917\u08fd\3\2\2\2\u0917\u0901\3\2\2\2\u0917\u0906\3\2"+
		"\2\2\u0917\u090c\3\2\2\2\u0917\u0912\3\2\2\2\u0917\u0914\3\2\2\2\u0918"+
		"\u017b\3\2\2\2\u0919\u091a\5\u017a\u00be\2\u091a\u091b\7\2\2\3\u091b\u017d"+
		"\3\2\2\2\u091c\u091d\b\u00c0\1\2\u091d\u091e\7\u0114\2\2\u091e\u0925\b"+
		"\u00c0\1\2\u091f\u0920\b\u00c0\1\2\u0920\u0925\7\u00c1\2\2\u0921\u0922"+
		"\b\u00c0\1\2\u0922\u0923\7\u00c2\2\2\u0923\u0925\7\u0127\2\2\u0924\u091c"+
		"\3\2\2\2\u0924\u091f\3\2\2\2\u0924\u0921\3\2\2\2\u0925\u017f\3\2\2\2\u0926"+
		"\u0927\5\u017e\u00c0\2\u0927\u0928\7\2\2\3\u0928\u0181\3\2\2\2\u0929\u092a"+
		"\b\u00c2\1\2\u092a\u092b\5\u013a\u009e\2\u092b\u092c\b\u00c2\1\2\u092c"+
		"\u0933\3\2\2\2\u092d\u092e\b\u00c2\1\2\u092e\u0933\7\u00c3\2\2\u092f\u0930"+
		"\b\u00c2\1\2\u0930\u0931\7\u00c4\2\2\u0931\u0933\7\u0127\2\2\u0932\u0929"+
		"\3\2\2\2\u0932\u092d\3\2\2\2\u0932\u092f\3\2\2\2\u0933\u0183\3\2\2\2\u0934"+
		"\u0935\5\u0182\u00c2\2\u0935\u0936\7\2\2\3\u0936\u0185\3\2\2\2\u0937\u0938"+
		"\b\u00c4\1\2\u0938\u0939\5\u018a\u00c6\2\u0939\u093a\5\u019e\u00d0\2\u093a"+
		"\u093b\5\u01ae\u00d8\2\u093b\u093c\5\u018e\u00c8\2\u093c\u093d\5\u00ca"+
		"f\2\u093d\u093e\5\u01be\u00e0\2\u093e\u093f\5\u00d2j\2\u093f\u0940\b\u00c4"+
		"\1\2\u0940\u094f\3\2\2\2\u0941\u0942\b\u00c4\1\2\u0942\u0943\5\u018a\u00c6"+
		"\2\u0943\u0944\5\u019e\u00d0\2\u0944\u0945\5\u01ca\u00e6\2\u0945\u0946"+
		"\5\u011e\u0090\2\u0946\u0947\5\u01ae\u00d8\2\u0947\u0948\b\u00c4\1\2\u0948"+
		"\u094f\3\2\2\2\u0949\u094a\b\u00c4\1\2\u094a\u094f\7\u00c5\2\2\u094b\u094c"+
		"\b\u00c4\1\2\u094c\u094d\7\u00c6\2\2\u094d\u094f\7\u0127\2\2\u094e\u0937"+
		"\3\2\2\2\u094e\u0941\3\2\2\2\u094e\u0949\3\2\2\2\u094e\u094b\3\2\2\2\u094f"+
		"\u0187\3\2\2\2\u0950\u0951\5\u0186\u00c4\2\u0951\u0952\7\2\2\3\u0952\u0189"+
		"\3\2\2\2\u0953\u0954\b\u00c6\1\2\u0954\u0956\b\u00c6\1\2\u0955\u0957\5"+
		"\u0192\u00ca\2\u0956\u0955\3\2\2\2\u0956\u0957\3\2\2\2\u0957\u0960\3\2"+
		"\2\2\u0958\u095e\b\u00c6\1\2\u0959\u095a\b\u00c6\1\2\u095a\u095f\7\u00c7"+
		"\2\2\u095b\u095c\b\u00c6\1\2\u095c\u095d\7\u00c8\2\2\u095d\u095f\7\u0127"+
		"\2\2\u095e\u0959\3\2\2\2\u095e\u095b\3\2\2\2\u095f\u0961\3\2\2\2\u0960"+
		"\u0958\3\2\2\2\u0960\u0961\3\2\2\2\u0961\u0962\3\2\2\2\u0962\u0963\b\u00c6"+
		"\1\2\u0963\u096a\b\u00c6\1\2\u0964\u0965\b\u00c6\1\2\u0965\u096a\7\u00c7"+
		"\2\2\u0966\u0967\b\u00c6\1\2\u0967\u0968\7\u00c8\2\2\u0968\u096a\7\u0127"+
		"\2\2\u0969\u0953\3\2\2\2\u0969\u0964\3\2\2\2\u0969\u0966\3\2\2\2\u096a"+
		"\u018b\3\2\2\2\u096b\u096c\5\u018a\u00c6\2\u096c\u096d\7\2\2\3\u096d\u018d"+
		"\3\2\2\2\u096e\u096f\b\u00c8\1\2\u096f\u0970\7\u0111\2\2\u0970\u0977\b"+
		"\u00c8\1\2\u0971\u0972\b\u00c8\1\2\u0972\u0977\7\u00c9\2\2\u0973\u0974"+
		"\b\u00c8\1\2\u0974\u0975\7\u00ca\2\2\u0975\u0977\7\u0127\2\2\u0976\u096e"+
		"\3\2\2\2\u0976\u0971\3\2\2\2\u0976\u0973\3\2\2\2\u0977\u018f\3\2\2\2\u0978"+
		"\u0979\5\u018e\u00c8\2\u0979\u097a\7\2\2\3\u097a\u0191\3\2\2\2\u097b\u097c"+
		"\b\u00ca\1\2\u097c\u097d\5\u0196\u00cc\2\u097d\u097e\5\u019a\u00ce\2\u097e"+
		"\u097f\5\u008eH\2\u097f\u0980\b\u00ca\1\2\u0980\u0987\3\2\2\2\u0981\u0982"+
		"\b\u00ca\1\2\u0982\u0987\7\u00cb\2\2\u0983\u0984\b\u00ca\1\2\u0984\u0985"+
		"\7\u00cc\2\2\u0985\u0987\7\u0127\2\2\u0986\u097b\3\2\2\2\u0986\u0981\3"+
		"\2\2\2\u0986\u0983\3\2\2\2\u0987\u0193\3\2\2\2\u0988\u0989\5\u0192\u00ca"+
		"\2\u0989\u098a\7\2\2\3\u098a\u0195\3\2\2\2\u098b\u098c\b\u00cc\1\2\u098c"+
		"\u098d\7\u0108\2\2\u098d\u0994\b\u00cc\1\2\u098e\u098f\b\u00cc\1\2\u098f"+
		"\u0994\7\u00cd\2\2\u0990\u0991\b\u00cc\1\2\u0991\u0992\7\u00ce\2\2\u0992"+
		"\u0994\7\u0127\2\2\u0993\u098b\3\2\2\2\u0993\u098e\3\2\2\2\u0993\u0990"+
		"\3\2\2\2\u0994\u0197\3\2\2\2\u0995\u0996\5\u0196\u00cc\2\u0996\u0997\7"+
		"\2\2\3\u0997\u0199\3\2\2\2\u0998\u0999\b\u00ce\1\2\u0999\u099b\b\u00ce"+
		"\1\2\u099a\u099c\5\u00e6t\2\u099b\u099a\3\2\2\2\u099c\u099d\3\2\2\2\u099d"+
		"\u099b\3\2\2\2\u099d\u099e\3\2\2\2\u099e\u09a7\3\2\2\2\u099f\u09a5\b\u00ce"+
		"\1\2\u09a0\u09a1\b\u00ce\1\2\u09a1\u09a6\7\u00cf\2\2\u09a2\u09a3\b\u00ce"+
		"\1\2\u09a3\u09a4\7\u00d0\2\2\u09a4\u09a6\7\u0127\2\2\u09a5\u09a0\3\2\2"+
		"\2\u09a5\u09a2\3\2\2\2\u09a6\u09a8\3\2\2\2\u09a7\u099f\3\2\2\2\u09a7\u09a8"+
		"\3\2\2\2\u09a8\u09a9\3\2\2\2\u09a9\u09aa\b\u00ce\1\2\u09aa\u09ab\b\u00ce"+
		"\1\2\u09ab\u09b2\3\2\2\2\u09ac\u09ad\b\u00ce\1\2\u09ad\u09b2\7\u00cf\2"+
		"\2\u09ae\u09af\b\u00ce\1\2\u09af\u09b0\7\u00d0\2\2\u09b0\u09b2\7\u0127"+
		"\2\2\u09b1\u0998\3\2\2\2\u09b1\u09ac\3\2\2\2\u09b1\u09ae\3\2\2\2\u09b2"+
		"\u019b\3\2\2\2\u09b3\u09b4\5\u019a\u00ce\2\u09b4\u09b5\7\2\2\3\u09b5\u019d"+
		"\3\2\2\2\u09b6\u09b7\b\u00d0\1\2\u09b7\u09b8\5Z.\2\u09b8\u09b9\b\u00d0"+
		"\1\2\u09b9\u09c0\3\2\2\2\u09ba\u09bb\b\u00d0\1\2\u09bb\u09c0\7\u00d1\2"+
		"\2\u09bc\u09bd\b\u00d0\1\2\u09bd\u09be\7\u00d2\2\2\u09be\u09c0\7\u0127"+
		"\2\2\u09bf\u09b6\3\2\2\2\u09bf\u09ba\3\2\2\2\u09bf\u09bc\3\2\2\2\u09c0"+
		"\u019f\3\2\2\2\u09c1\u09c2\5\u019e\u00d0\2\u09c2\u09c3\7\2\2\3\u09c3\u01a1"+
		"\3\2\2\2\u09c4\u09c5\b\u00d2\1\2\u09c5\u09c6\5\u01ae\u00d8\2\u09c6\u09c7"+
		"\5\u01a6\u00d4\2\u09c7\u09c8\b\u00d2\1\2\u09c8\u09cf";
	private static final String _serializedATNSegment1 =
		"\3\2\2\2\u09c9\u09ca\b\u00d2\1\2\u09ca\u09cf\7\u00d3\2\2\u09cb\u09cc\b"+
		"\u00d2\1\2\u09cc\u09cd\7\u00d4\2\2\u09cd\u09cf\7\u0127\2\2\u09ce\u09c4"+
		"\3\2\2\2\u09ce\u09c9\3\2\2\2\u09ce\u09cb\3\2\2\2\u09cf\u01a3\3\2\2\2\u09d0"+
		"\u09d1\5\u01a2\u00d2\2\u09d1\u09d2\7\2\2\3\u09d2\u01a5\3\2\2\2\u09d3\u09d4"+
		"\b\u00d4\1\2\u09d4\u09d8\b\u00d4\1\2\u09d5\u09d7\5\u01aa\u00d6\2\u09d6"+
		"\u09d5\3\2\2\2\u09d7\u09da\3\2\2\2\u09d8\u09d6\3\2\2\2\u09d8\u09d9\3\2"+
		"\2\2\u09d9\u09e3\3\2\2\2\u09da\u09d8\3\2\2\2\u09db\u09e1\b\u00d4\1\2\u09dc"+
		"\u09dd\b\u00d4\1\2\u09dd\u09e2\7\u00d5\2\2\u09de\u09df\b\u00d4\1\2\u09df"+
		"\u09e0\7\u00d6\2\2\u09e0\u09e2\7\u0127\2\2\u09e1\u09dc\3\2\2\2\u09e1\u09de"+
		"\3\2\2\2\u09e2\u09e4\3\2\2\2\u09e3\u09db\3\2\2\2\u09e3\u09e4\3\2\2\2\u09e4"+
		"\u09e5\3\2\2\2\u09e5\u09e6\b\u00d4\1\2\u09e6\u09ed\b\u00d4\1\2\u09e7\u09e8"+
		"\b\u00d4\1\2\u09e8\u09ed\7\u00d5\2\2\u09e9\u09ea\b\u00d4\1\2\u09ea\u09eb"+
		"\7\u00d6\2\2\u09eb\u09ed\7\u0127\2\2\u09ec\u09d3\3\2\2\2\u09ec\u09e7\3"+
		"\2\2\2\u09ec\u09e9\3\2\2\2\u09ed\u01a7\3\2\2\2\u09ee\u09ef\5\u01a6\u00d4"+
		"\2\u09ef\u09f0\7\2\2\3\u09f0\u01a9\3\2\2\2\u09f1\u09f2\b\u00d6\1\2\u09f2"+
		"\u09f3\5\u00aeX\2\u09f3\u09f4\5\u01ae\u00d8\2\u09f4\u09f5\b\u00d6\1\2"+
		"\u09f5\u09fc\3\2\2\2\u09f6\u09f7\b\u00d6\1\2\u09f7\u09fc\7\u00d7\2\2\u09f8"+
		"\u09f9\b\u00d6\1\2\u09f9\u09fa\7\u00d8\2\2\u09fa\u09fc\7\u0127\2\2\u09fb"+
		"\u09f1\3\2\2\2\u09fb\u09f6\3\2\2\2\u09fb\u09f8\3\2\2\2\u09fc\u01ab\3\2"+
		"\2\2\u09fd\u09fe\5\u01aa\u00d6\2\u09fe\u09ff\7\2\2\3\u09ff\u01ad\3\2\2"+
		"\2\u0a00\u0a01\b\u00d8\1\2\u0a01\u0a02\5\u01ce\u00e8\2\u0a02\u0a03\5\u01b2"+
		"\u00da\2\u0a03\u0a04\b\u00d8\1\2\u0a04\u0a0f\3\2\2\2\u0a05\u0a06\b\u00d8"+
		"\1\2\u0a06\u0a07\5\u00e6t\2\u0a07\u0a08\b\u00d8\1\2\u0a08\u0a0f\3\2\2"+
		"\2\u0a09\u0a0a\b\u00d8\1\2\u0a0a\u0a0f\7\u00d9\2\2\u0a0b\u0a0c\b\u00d8"+
		"\1\2\u0a0c\u0a0d\7\u00da\2\2\u0a0d\u0a0f\7\u0127\2\2\u0a0e\u0a00\3\2\2"+
		"\2\u0a0e\u0a05\3\2\2\2\u0a0e\u0a09\3\2\2\2\u0a0e\u0a0b\3\2\2\2\u0a0f\u01af"+
		"\3\2\2\2\u0a10\u0a11\5\u01ae\u00d8\2\u0a11\u0a12\7\2\2\3\u0a12\u01b1\3"+
		"\2\2\2\u0a13\u0a14\b\u00da\1\2\u0a14\u0a16\b\u00da\1\2\u0a15\u0a17\5\u01b6"+
		"\u00dc\2\u0a16\u0a15\3\2\2\2\u0a16\u0a17\3\2\2\2\u0a17\u0a20\3\2\2\2\u0a18"+
		"\u0a1e\b\u00da\1\2\u0a19\u0a1a\b\u00da\1\2\u0a1a\u0a1f\7\u00db\2\2\u0a1b"+
		"\u0a1c\b\u00da\1\2\u0a1c\u0a1d\7\u00dc\2\2\u0a1d\u0a1f\7\u0127\2\2\u0a1e"+
		"\u0a19\3\2\2\2\u0a1e\u0a1b\3\2\2\2\u0a1f\u0a21\3\2\2\2\u0a20\u0a18\3\2"+
		"\2\2\u0a20\u0a21\3\2\2\2\u0a21\u0a22\3\2\2\2\u0a22\u0a23\b\u00da\1\2\u0a23"+
		"\u0a2a\b\u00da\1\2\u0a24\u0a25\b\u00da\1\2\u0a25\u0a2a\7\u00db\2\2\u0a26"+
		"\u0a27\b\u00da\1\2\u0a27\u0a28\7\u00dc\2\2\u0a28\u0a2a\7\u0127\2\2\u0a29"+
		"\u0a13\3\2\2\2\u0a29\u0a24\3\2\2\2\u0a29\u0a26\3\2\2\2\u0a2a\u01b3\3\2"+
		"\2\2\u0a2b\u0a2c\5\u01b2\u00da\2\u0a2c\u0a2d\7\2\2\3\u0a2d\u01b5\3\2\2"+
		"\2\u0a2e\u0a2f\b\u00dc\1\2\u0a2f\u0a30\5\u0096L\2\u0a30\u0a31\5\u01ba"+
		"\u00de\2\u0a31\u0a32\5\u009eP\2\u0a32\u0a33\b\u00dc\1\2\u0a33\u0a3a\3"+
		"\2\2\2\u0a34\u0a35\b\u00dc\1\2\u0a35\u0a3a\7\u00dd\2\2\u0a36\u0a37\b\u00dc"+
		"\1\2\u0a37\u0a38\7\u00de\2\2\u0a38\u0a3a\7\u0127\2\2\u0a39\u0a2e\3\2\2"+
		"\2\u0a39\u0a34\3\2\2\2\u0a39\u0a36\3\2\2\2\u0a3a\u01b7\3\2\2\2\u0a3b\u0a3c"+
		"\5\u01b6\u00dc\2\u0a3c\u0a3d\7\2\2\3\u0a3d\u01b9\3\2\2\2\u0a3e\u0a3f\b"+
		"\u00de\1\2\u0a3f\u0a41\b\u00de\1\2\u0a40\u0a42\5\u01a2\u00d2\2\u0a41\u0a40"+
		"\3\2\2\2\u0a41\u0a42\3\2\2\2\u0a42\u0a4b\3\2\2\2\u0a43\u0a49\b\u00de\1"+
		"\2\u0a44\u0a45\b\u00de\1\2\u0a45\u0a4a\7\u00df\2\2\u0a46\u0a47\b\u00de"+
		"\1\2\u0a47\u0a48\7\u00e0\2\2\u0a48\u0a4a\7\u0127\2\2\u0a49\u0a44\3\2\2"+
		"\2\u0a49\u0a46\3\2\2\2\u0a4a\u0a4c\3\2\2\2\u0a4b\u0a43\3\2\2\2\u0a4b\u0a4c"+
		"\3\2\2\2\u0a4c\u0a4d\3\2\2\2\u0a4d\u0a4e\b\u00de\1\2\u0a4e\u0a55\b\u00de"+
		"\1\2\u0a4f\u0a50\b\u00de\1\2\u0a50\u0a55\7\u00df\2\2\u0a51\u0a52\b\u00de"+
		"\1\2\u0a52\u0a53\7\u00e0\2\2\u0a53\u0a55\7\u0127\2\2\u0a54\u0a3e\3\2\2"+
		"\2\u0a54\u0a4f\3\2\2\2\u0a54\u0a51\3\2\2\2\u0a55\u01bb\3\2\2\2\u0a56\u0a57"+
		"\5\u01ba\u00de\2\u0a57\u0a58\7\2\2\3\u0a58\u01bd\3\2\2\2\u0a59\u0a5a\b"+
		"\u00e0\1\2\u0a5a\u0a5b\5\u01c2\u00e2\2\u0a5b\u0a5c\b\u00e0\1\2\u0a5c\u0a63"+
		"\3\2\2\2\u0a5d\u0a5e\b\u00e0\1\2\u0a5e\u0a63\7\u00e1\2\2\u0a5f\u0a60\b"+
		"\u00e0\1\2\u0a60\u0a61\7\u00e2\2\2\u0a61\u0a63\7\u0127\2\2\u0a62\u0a59"+
		"\3\2\2\2\u0a62\u0a5d\3\2\2\2\u0a62\u0a5f\3\2\2\2\u0a63\u01bf\3\2\2\2\u0a64"+
		"\u0a65\5\u01be\u00e0\2\u0a65\u0a66\7\2\2\3\u0a66\u01c1\3\2\2\2\u0a67\u0a68"+
		"\b\u00e2\1\2\u0a68\u0a6c\b\u00e2\1\2\u0a69\u0a6b\5\u01c6\u00e4\2\u0a6a"+
		"\u0a69\3\2\2\2\u0a6b\u0a6e\3\2\2\2\u0a6c\u0a6a\3\2\2\2\u0a6c\u0a6d\3\2"+
		"\2\2\u0a6d\u0a77\3\2\2\2\u0a6e\u0a6c\3\2\2\2\u0a6f\u0a75\b\u00e2\1\2\u0a70"+
		"\u0a71\b\u00e2\1\2\u0a71\u0a76\7\u00e3\2\2\u0a72\u0a73\b\u00e2\1\2\u0a73"+
		"\u0a74\7\u00e4\2\2\u0a74\u0a76\7\u0127\2\2\u0a75\u0a70\3\2\2\2\u0a75\u0a72"+
		"\3\2\2\2\u0a76\u0a78\3\2\2\2\u0a77\u0a6f\3\2\2\2\u0a77\u0a78\3\2\2\2\u0a78"+
		"\u0a79\3\2\2\2\u0a79\u0a7a\b\u00e2\1\2\u0a7a\u0a81\b\u00e2\1\2\u0a7b\u0a7c"+
		"\b\u00e2\1\2\u0a7c\u0a81\7\u00e3\2\2\u0a7d\u0a7e\b\u00e2\1\2\u0a7e\u0a7f"+
		"\7\u00e4\2\2\u0a7f\u0a81\7\u0127\2\2\u0a80\u0a67\3\2\2\2\u0a80\u0a7b\3"+
		"\2\2\2\u0a80\u0a7d\3\2\2\2\u0a81\u01c3\3\2\2\2\u0a82\u0a83\5\u01c2\u00e2"+
		"\2\u0a83\u0a84\7\2\2\3\u0a84\u01c5\3\2\2\2\u0a85\u0a86\b\u00e4\1\2\u0a86"+
		"\u0a87\5\u01ca\u00e6\2\u0a87\u0a88\5\22\n\2\u0a88\u0a89\b\u00e4\1\2\u0a89"+
		"\u0a90\3\2\2\2\u0a8a\u0a8b\b\u00e4\1\2\u0a8b\u0a90\7\u00e5\2\2\u0a8c\u0a8d"+
		"\b\u00e4\1\2\u0a8d\u0a8e\7\u00e6\2\2\u0a8e\u0a90\7\u0127\2\2\u0a8f\u0a85"+
		"\3\2\2\2\u0a8f\u0a8a\3\2\2\2\u0a8f\u0a8c\3\2\2\2\u0a90\u01c7\3\2\2\2\u0a91"+
		"\u0a92\5\u01c6\u00e4\2\u0a92\u0a93\7\2\2\3\u0a93\u01c9\3\2\2\2\u0a94\u0a95"+
		"\b\u00e6\1\2\u0a95\u0a96\5\u01ce\u00e8\2\u0a96\u0a97\5N(\2\u0a97\u0a98"+
		"\b\u00e6\1\2\u0a98\u0aa3\3\2\2\2\u0a99\u0a9a\b\u00e6\1\2\u0a9a\u0a9b\5"+
		"\u00e6t\2\u0a9b\u0a9c\b\u00e6\1\2\u0a9c\u0aa3\3\2\2\2\u0a9d\u0a9e\b\u00e6"+
		"\1\2\u0a9e\u0aa3\7\u00e7\2\2\u0a9f\u0aa0\b\u00e6\1\2\u0aa0\u0aa1\7\u00e8"+
		"\2\2\u0aa1\u0aa3\7\u0127\2\2\u0aa2\u0a94\3\2\2\2\u0aa2\u0a99\3\2\2\2\u0aa2"+
		"\u0a9d\3\2\2\2\u0aa2\u0a9f\3\2\2\2\u0aa3\u01cb\3\2\2\2\u0aa4\u0aa5\5\u01ca"+
		"\u00e6\2\u0aa5\u0aa6\7\2\2\3\u0aa6\u01cd\3\2\2\2\u0aa7\u0aa8\b\u00e8\1"+
		"\2\u0aa8\u0aa9\5\u01d2\u00ea\2\u0aa9\u0aaa\5&\24\2\u0aaa\u0aab\b\u00e8"+
		"\1\2\u0aab\u0ab6\3\2\2\2\u0aac\u0aad\b\u00e8\1\2\u0aad\u0aae\5\u01d6\u00ec"+
		"\2\u0aae\u0aaf\b\u00e8\1\2\u0aaf\u0ab6\3\2\2\2\u0ab0\u0ab1\b\u00e8\1\2"+
		"\u0ab1\u0ab6\7\u00e9\2\2\u0ab2\u0ab3\b\u00e8\1\2\u0ab3\u0ab4\7\u00ea\2"+
		"\2\u0ab4\u0ab6\7\u0127\2\2\u0ab5\u0aa7\3\2\2\2\u0ab5\u0aac\3\2\2\2\u0ab5"+
		"\u0ab0\3\2\2\2\u0ab5\u0ab2\3\2\2\2\u0ab6\u01cf\3\2\2\2\u0ab7\u0ab8\5\u01ce"+
		"\u00e8\2\u0ab8\u0ab9\7\2\2\3\u0ab9\u01d1\3\2\2\2\u0aba\u0abb\b\u00ea\1"+
		"\2\u0abb\u0abc\5&\24\2\u0abc\u0abd\5\u008eH\2\u0abd\u0abe\5\u01d2\u00ea"+
		"\2\u0abe\u0abf\b\u00ea\1\2\u0abf\u0ac8\3\2\2\2\u0ac0\u0ac1\b\u00ea\1\2"+
		"\u0ac1\u0ac8\b\u00ea\1\2\u0ac2\u0ac3\b\u00ea\1\2\u0ac3\u0ac8\7\u00eb\2"+
		"\2\u0ac4\u0ac5\b\u00ea\1\2\u0ac5\u0ac6\7\u00ec\2\2\u0ac6\u0ac8\7\u0127"+
		"\2\2\u0ac7\u0aba\3\2\2\2\u0ac7\u0ac0\3\2\2\2\u0ac7\u0ac2\3\2\2\2\u0ac7"+
		"\u0ac4\3\2\2\2\u0ac8\u01d3\3\2\2\2\u0ac9\u0aca\5\u01d2\u00ea\2\u0aca\u0acb"+
		"\7\2\2\3\u0acb\u01d5\3\2\2\2\u0acc\u0acd\b\u00ec\1\2\u0acd\u0ace\5R*\2"+
		"\u0ace\u0acf\b\u00ec\1\2\u0acf\u0ada\3\2\2\2\u0ad0\u0ad1\b\u00ec\1\2\u0ad1"+
		"\u0ad2\5n8\2\u0ad2\u0ad3\b\u00ec\1\2\u0ad3\u0ada\3\2\2\2\u0ad4\u0ad5\b"+
		"\u00ec\1\2\u0ad5\u0ada\7\u00ed\2\2\u0ad6\u0ad7\b\u00ec\1\2\u0ad7\u0ad8"+
		"\7\u00ee\2\2\u0ad8\u0ada\7\u0127\2\2\u0ad9\u0acc\3\2\2\2\u0ad9\u0ad0\3"+
		"\2\2\2\u0ad9\u0ad4\3\2\2\2\u0ad9\u0ad6\3\2\2\2\u0ada\u01d7\3\2\2\2\u0adb"+
		"\u0adc\5\u01d6\u00ec\2\u0adc\u0add\7\2\2\3\u0add\u01d9\3\2\2\2\u0ade\u0adf"+
		"\b\u00ee\1\2\u0adf\u0ae0\5\u01ce\u00e8\2\u0ae0\u0ae1\5\u01de\u00f0\2\u0ae1"+
		"\u0ae2\b\u00ee\1\2\u0ae2\u0af5\3\2\2\2\u0ae3\u0ae4\b\u00ee\1\2\u0ae4\u0ae5"+
		"\5\u01f6\u00fc\2\u0ae5\u0ae6\b\u00ee\1\2\u0ae6\u0af5\3\2\2\2\u0ae7\u0ae8"+
		"\b\u00ee\1\2\u0ae8\u0ae9\5\u010a\u0086\2\u0ae9\u0aea\b\u00ee\1\2\u0aea"+
		"\u0af5\3\2\2\2\u0aeb\u0aec\b\u00ee\1\2\u0aec\u0aed\5\u0122\u0092\2\u0aed"+
		"\u0aee\b\u00ee\1\2\u0aee\u0af5\3\2\2\2\u0aef\u0af0\b\u00ee\1\2\u0af0\u0af5"+
		"\7\u00ef\2\2\u0af1\u0af2\b\u00ee\1\2\u0af2\u0af3\7\u00f0\2\2\u0af3\u0af5"+
		"\7\u0127\2\2\u0af4\u0ade\3\2\2\2\u0af4\u0ae3\3\2\2\2\u0af4\u0ae7\3\2\2"+
		"\2\u0af4\u0aeb\3\2\2\2\u0af4\u0aef\3\2\2\2\u0af4\u0af1\3\2\2\2\u0af5\u01db"+
		"\3\2\2\2\u0af6\u0af7\5\u01da\u00ee\2\u0af7\u0af8\7\2\2\3\u0af8\u01dd\3"+
		"\2\2\2\u0af9\u0afa\b\u00f0\1\2\u0afa\u0afc\b\u00f0\1\2\u0afb\u0afd\5\u01e2"+
		"\u00f2\2\u0afc\u0afb\3\2\2\2\u0afc\u0afd\3\2\2\2\u0afd\u0b06\3\2\2\2\u0afe"+
		"\u0b04\b\u00f0\1\2\u0aff\u0b00\b\u00f0\1\2\u0b00\u0b05\7\u00f1\2\2\u0b01"+
		"\u0b02\b\u00f0\1\2\u0b02\u0b03\7\u00f2\2\2\u0b03\u0b05\7\u0127\2\2\u0b04"+
		"\u0aff\3\2\2\2\u0b04\u0b01\3\2\2\2\u0b05\u0b07\3\2\2\2\u0b06\u0afe\3\2"+
		"\2\2\u0b06\u0b07\3\2\2\2\u0b07\u0b08\3\2\2\2\u0b08\u0b09\b\u00f0\1\2\u0b09"+
		"\u0b10\b\u00f0\1\2\u0b0a\u0b0b\b\u00f0\1\2\u0b0b\u0b10\7\u00f1\2\2\u0b0c"+
		"\u0b0d\b\u00f0\1\2\u0b0d\u0b0e\7\u00f2\2\2\u0b0e\u0b10\7\u0127\2\2\u0b0f"+
		"\u0af9\3\2\2\2\u0b0f\u0b0a\3\2\2\2\u0b0f\u0b0c\3\2\2\2\u0b10\u01df\3\2"+
		"\2\2\u0b11\u0b12\5\u01de\u00f0\2\u0b12\u0b13\7\2\2\3\u0b13\u01e1\3\2\2"+
		"\2\u0b14\u0b15\b\u00f2\1\2\u0b15\u0b16\5\u0096L\2\u0b16\u0b17\5\u01e6"+
		"\u00f4\2\u0b17\u0b18\5\u009eP\2\u0b18\u0b19\b\u00f2\1\2\u0b19\u0b20\3"+
		"\2\2\2\u0b1a\u0b1b\b\u00f2\1\2\u0b1b\u0b20\7\u00f3\2\2\u0b1c\u0b1d\b\u00f2"+
		"\1\2\u0b1d\u0b1e\7\u00f4\2\2\u0b1e\u0b20\7\u0127\2\2\u0b1f\u0b14\3\2\2"+
		"\2\u0b1f\u0b1a\3\2\2\2\u0b1f\u0b1c\3\2\2\2\u0b20\u01e3\3\2\2\2\u0b21\u0b22"+
		"\5\u01e2\u00f2\2\u0b22\u0b23\7\2\2\3\u0b23\u01e5\3\2\2\2\u0b24\u0b25\b"+
		"\u00f4\1\2\u0b25\u0b27\b\u00f4\1\2\u0b26\u0b28\5\u01ea\u00f6\2\u0b27\u0b26"+
		"\3\2\2\2\u0b27\u0b28\3\2\2\2\u0b28\u0b31\3\2\2\2\u0b29\u0b2f\b\u00f4\1"+
		"\2\u0b2a\u0b2b\b\u00f4\1\2\u0b2b\u0b30\7\u00f5\2\2\u0b2c\u0b2d\b\u00f4"+
		"\1\2\u0b2d\u0b2e\7\u00f6\2\2\u0b2e\u0b30\7\u0127\2\2\u0b2f\u0b2a\3\2\2"+
		"\2\u0b2f\u0b2c\3\2\2\2\u0b30\u0b32\3\2\2\2\u0b31\u0b29\3\2\2\2\u0b31\u0b32"+
		"\3\2\2\2\u0b32\u0b33\3\2\2\2\u0b33\u0b34\b\u00f4\1\2\u0b34\u0b3b\b\u00f4"+
		"\1\2\u0b35\u0b36\b\u00f4\1\2\u0b36\u0b3b\7\u00f5\2\2\u0b37\u0b38\b\u00f4"+
		"\1\2\u0b38\u0b39\7\u00f6\2\2\u0b39\u0b3b\7\u0127\2\2\u0b3a\u0b24\3\2\2"+
		"\2\u0b3a\u0b35\3\2\2\2\u0b3a\u0b37\3\2\2\2\u0b3b\u01e7\3\2\2\2\u0b3c\u0b3d"+
		"\5\u01e6\u00f4\2\u0b3d\u0b3e\7\2\2\3\u0b3e\u01e9\3\2\2\2\u0b3f\u0b40\b"+
		"\u00f6\1\2\u0b40\u0b41\5\u01da\u00ee\2\u0b41\u0b42\5\u01ee\u00f8\2\u0b42"+
		"\u0b43\b\u00f6\1\2\u0b43\u0b4a\3\2\2\2\u0b44\u0b45\b\u00f6\1\2\u0b45\u0b4a"+
		"\7\u00f7\2\2\u0b46\u0b47\b\u00f6\1\2\u0b47\u0b48\7\u00f8\2\2\u0b48\u0b4a"+
		"\7\u0127\2\2\u0b49\u0b3f\3\2\2\2\u0b49\u0b44\3\2\2\2\u0b49\u0b46\3\2\2"+
		"\2\u0b4a\u01eb\3\2\2\2\u0b4b\u0b4c\5\u01ea\u00f6\2\u0b4c\u0b4d\7\2\2\3"+
		"\u0b4d\u01ed\3\2\2\2\u0b4e\u0b4f\b\u00f8\1\2\u0b4f\u0b53\b\u00f8\1\2\u0b50"+
		"\u0b52\5\u01f2\u00fa\2\u0b51\u0b50\3\2\2\2\u0b52\u0b55\3\2\2\2\u0b53\u0b51"+
		"\3\2\2\2\u0b53\u0b54\3\2\2\2\u0b54\u0b5e\3\2\2\2\u0b55\u0b53\3\2\2\2\u0b56"+
		"\u0b5c\b\u00f8\1\2\u0b57\u0b58\b\u00f8\1\2\u0b58\u0b5d\7\u00f9\2\2\u0b59"+
		"\u0b5a\b\u00f8\1\2\u0b5a\u0b5b\7\u00fa\2\2\u0b5b\u0b5d\7\u0127\2\2\u0b5c"+
		"\u0b57\3\2\2\2\u0b5c\u0b59\3\2\2\2\u0b5d\u0b5f\3\2\2\2\u0b5e\u0b56\3\2"+
		"\2\2\u0b5e\u0b5f\3\2\2\2\u0b5f\u0b60\3\2\2\2\u0b60\u0b61\b\u00f8\1\2\u0b61"+
		"\u0b68\b\u00f8\1\2\u0b62\u0b63\b\u00f8\1\2\u0b63\u0b68\7\u00f9\2\2\u0b64"+
		"\u0b65\b\u00f8\1\2\u0b65\u0b66\7\u00fa\2\2\u0b66\u0b68\7\u0127\2\2\u0b67"+
		"\u0b4e\3\2\2\2\u0b67\u0b62\3\2\2\2\u0b67\u0b64\3\2\2\2\u0b68\u01ef\3\2"+
		"\2\2\u0b69\u0b6a\5\u01ee\u00f8\2\u0b6a\u0b6b\7\2\2\3\u0b6b\u01f1\3\2\2"+
		"\2\u0b6c\u0b6d\b\u00fa\1\2\u0b6d\u0b6e\5\u00aeX\2\u0b6e\u0b6f\5\u01da"+
		"\u00ee\2\u0b6f\u0b70\b\u00fa\1\2\u0b70\u0b77\3\2\2\2\u0b71\u0b72\b\u00fa"+
		"\1\2\u0b72\u0b77\7\u00fb\2\2\u0b73\u0b74\b\u00fa\1\2\u0b74\u0b75\7\u00fc"+
		"\2\2\u0b75\u0b77\7\u0127\2\2\u0b76\u0b6c\3\2\2\2\u0b76\u0b71\3\2\2\2\u0b76"+
		"\u0b73\3\2\2\2\u0b77\u01f3\3\2\2\2\u0b78\u0b79\5\u01f2\u00fa\2\u0b79\u0b7a"+
		"\7\2\2\3\u0b7a\u01f5\3\2\2\2\u0b7b\u0b7c\b\u00fc\1\2\u0b7c\u0b7d\5\u00ca"+
		"f\2\u0b7d\u0b7e\5\u01fa\u00fe\2\u0b7e\u0b7f\5\u00d2j\2\u0b7f\u0b80\b\u00fc"+
		"\1\2\u0b80\u0b87\3\2\2\2\u0b81\u0b82\b\u00fc\1\2\u0b82\u0b87\7\u00fd\2"+
		"\2\u0b83\u0b84\b\u00fc\1\2\u0b84\u0b85\7\u00fe\2\2\u0b85\u0b87\7\u0127"+
		"\2\2\u0b86\u0b7b\3\2\2\2\u0b86\u0b81\3\2\2\2\u0b86\u0b83\3\2\2\2\u0b87"+
		"\u01f7\3\2\2\2\u0b88\u0b89\5\u01f6\u00fc\2\u0b89\u0b8a\7\2\2\3\u0b8a\u01f9"+
		"\3\2\2\2\u0b8b\u0b8c\b\u00fe\1\2\u0b8c\u0b8e\b\u00fe\1\2\u0b8d\u0b8f\5"+
		"\6\4\2\u0b8e\u0b8d\3\2\2\2\u0b8e\u0b8f\3\2\2\2\u0b8f\u0b98\3\2\2\2\u0b90"+
		"\u0b96\b\u00fe\1\2\u0b91\u0b92\b\u00fe\1\2\u0b92\u0b97\7\u00ff\2\2\u0b93"+
		"\u0b94\b\u00fe\1\2\u0b94\u0b95\7\u0100\2\2\u0b95\u0b97\7\u0127\2\2\u0b96"+
		"\u0b91\3\2\2\2\u0b96\u0b93\3\2\2\2\u0b97\u0b99\3\2\2\2\u0b98\u0b90\3\2"+
		"\2\2\u0b98\u0b99\3\2\2\2\u0b99\u0b9a\3\2\2\2\u0b9a\u0b9b\b\u00fe\1\2\u0b9b"+
		"\u0ba2\b\u00fe\1\2\u0b9c\u0b9d\b\u00fe\1\2\u0b9d\u0ba2\7\u00ff\2\2\u0b9e"+
		"\u0b9f\b\u00fe\1\2\u0b9f\u0ba0\7\u0100\2\2\u0ba0\u0ba2\7\u0127\2\2\u0ba1"+
		"\u0b8b\3\2\2\2\u0ba1\u0b9c\3\2\2\2\u0ba1\u0b9e\3\2\2\2\u0ba2\u01fb\3\2"+
		"\2\2\u0ba3\u0ba4\5\u01fa\u00fe\2\u0ba4\u0ba5\7\2\2\3\u0ba5\u01fd\3\2\2"+
		"\2\u00e4\u0207\u0216\u0220\u0229\u022b\u0234\u0243\u0250\u0258\u0260\u0262"+
		"\u026b\u0289\u029b\u02a8\u02b5\u02c2\u02cf\u02ea\u02f7\u0304\u0315\u031d"+
		"\u0325\u0327\u0330\u033d\u0351\u0359\u0361\u0363\u036c\u0379\u0389\u0391"+
		"\u0399\u039b\u03a4\u03b2\u03c0\u03ca\u03d2\u03d4\u03de\u03ee\u03fb\u040d"+
		"\u044c\u0454\u045c\u045e\u0467\u0474\u047c\u0484\u0486\u048f\u049e\u04b2"+
		"\u04bf\u04cf\u04dc\u04e4\u04ec\u04ee\u04f7\u0504\u0513\u051d\u0526\u0528"+
		"\u0531\u0540\u054d\u055d\u0565\u056d\u056f\u0578\u0587\u0591\u059a\u059c"+
		"\u05a5\u05b4\u05c4\u05d1\u05d9\u05e1\u05e3\u05ec\u05f9\u0608\u0612\u061b"+
		"\u061d\u0626\u0635\u063d\u0645\u0647\u0650\u0662\u066a\u0672\u0674\u067d"+
		"\u068a\u0692\u069a\u069c\u06a5\u06ad\u06b5\u06b7\u06c0\u06ce\u06db\u06e9"+
		"\u06f6\u0708\u0715\u0722\u0731\u0740\u074d\u076b\u0778\u0785\u0792\u079f"+
		"\u07ac\u07bd\u07ca\u07d2\u07da\u07dc\u07e5\u07f3\u0802\u080c\u0815\u0817"+
		"\u0820\u082f\u083d\u084b\u0858\u0868\u0870\u0878\u087a\u0883\u0892\u089c"+
		"\u08a5\u08a7\u08b0\u08bf\u08c7\u08cf\u08d1\u08da\u0917\u0924\u0932\u094e"+
		"\u0956\u095e\u0960\u0969\u0976\u0986\u0993\u099d\u09a5\u09a7\u09b1\u09bf"+
		"\u09ce\u09d8\u09e1\u09e3\u09ec\u09fb\u0a0e\u0a16\u0a1e\u0a20\u0a29\u0a39"+
		"\u0a41\u0a49\u0a4b\u0a54\u0a62\u0a6c\u0a75\u0a77\u0a80\u0a8f\u0aa2\u0ab5"+
		"\u0ac7\u0ad9\u0af4\u0afc\u0b04\u0b06\u0b0f\u0b1f\u0b27\u0b2f\u0b31\u0b3a"+
		"\u0b49\u0b53\u0b5c\u0b5e\u0b67\u0b76\u0b86\u0b8e\u0b96\u0b98\u0ba1";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}