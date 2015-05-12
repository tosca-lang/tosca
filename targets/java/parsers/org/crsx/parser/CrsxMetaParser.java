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
		MT_module_TOK=17, ET_module_TOK=18, MT_string_TOK=19, ET_string_TOK=20, 
		MT_lbrace_TOK=21, ET_lbrace_TOK=22, MT_rbrace_TOK=23, ET_rbrace_TOK=24, 
		MT_ruleDeclaration=25, ET_ruleDeclaration=26, MT_option_OPT=27, ET_option_OPT=28, 
		MT_arrow_TOK=29, ET_arrow_TOK=30, MT_option=31, ET_option=32, MT_arguments_OPT=33, 
		ET_arguments_OPT=34, MT_colon_TOK=35, ET_colon_TOK=36, MT_pattern=37, 
		ET_pattern=38, MT_properties_OPT=39, ET_properties_OPT=40, MT_contractum=41, 
		ET_contractum=42, MT_annotations=43, ET_annotations=44, MT_annotation_OOM=45, 
		ET_annotation_OOM=46, MT_annotation=47, ET_annotation=48, MT_at_TOK=49, 
		ET_at_TOK=50, MT_term=51, ET_term=52, MT_freeTerm=53, ET_freeTerm=54, 
		MT_annotations_OPT=55, ET_annotations_OPT=56, MT_metavar_TOK=57, ET_metavar_TOK=58, 
		MT_freeArguments_OPT=59, ET_freeArguments_OPT=60, MT_boundTerm=61, ET_boundTerm=62, 
		MT_nextBinder=63, ET_nextBinder=64, MT_dot_TOK=65, ET_dot_TOK=66, MT_arguments=67, 
		ET_arguments=68, MT_lsquare_TOK=69, ET_lsquare_TOK=70, MT_terms_OPT=71, 
		ET_terms_OPT=72, MT_rsquare_TOK=73, ET_rsquare_TOK=74, MT_terms=75, ET_terms=76, 
		MT_terms_S1_ZOM=77, ET_terms_S1_ZOM=78, MT_terms_S1=79, ET_terms_S1=80, 
		MT_comma_TOK=81, ET_comma_TOK=82, MT_freeArguments=83, ET_freeArguments=84, 
		MT_freeTerms_OPT=85, ET_freeTerms_OPT=86, MT_freeTerms=87, ET_freeTerms=88, 
		MT_freeTerms_S1_ZOM=89, ET_freeTerms_S1_ZOM=90, MT_freeTerms_S1=91, ET_freeTerms_S1=92, 
		MT_list=93, ET_list=94, MT_lpar_TOK=95, ET_lpar_TOK=96, MT_termList_OPT=97, 
		ET_termList_OPT=98, MT_rpar_TOK=99, ET_rpar_TOK=100, MT_termList=101, 
		ET_termList=102, MT_termList_S1_ZOM=103, ET_termList_S1_ZOM=104, MT_termList_S1=105, 
		ET_termList_S1=106, MT_term_OPT=107, ET_term_OPT=108, MT_variable=109, 
		ET_variable=110, MT_variable_TOK=111, ET_variable_TOK=112, MT_linear_OPT=113, 
		ET_linear_OPT=114, MT_functional_OPT=115, ET_functional_OPT=116, MT_varsort_OPT=117, 
		ET_varsort_OPT=118, MT_linear=119, ET_linear=120, MT_linear_TOK=121, ET_linear_TOK=122, 
		MT_functional=123, ET_functional=124, MT_functional_TOK=125, ET_functional_TOK=126, 
		MT_literal=127, ET_literal=128, MT_number_TOK=129, ET_number_TOK=130, 
		MT_binder=131, ET_binder=132, MT_varsort=133, ET_varsort=134, MT_coloncolon_TOK=135, 
		ET_coloncolon_TOK=136, MT_dispatch=137, ET_dispatch=138, MT_dispatch_TOK=139, 
		ET_dispatch_TOK=140, MT_delayCase_OPT=141, ET_delayCase_OPT=142, MT_dispatchTerm=143, 
		ET_dispatchTerm=144, MT_dispatchTerm_S1_ZOM=145, ET_dispatchTerm_S1_ZOM=146, 
		MT_dispatchTerm_S1=147, ET_dispatchTerm_S1=148, MT_and_TOK=149, ET_and_TOK=150, 
		MT_dispatchCases=151, ET_dispatchCases=152, MT_dispatchCases_S1_ZOM=153, 
		ET_dispatchCases_S1_ZOM=154, MT_dispatchCases_S1=155, ET_dispatchCases_S1=156, 
		MT_dispatchCase=157, ET_dispatchCase=158, MT_delayCase=159, ET_delayCase=160, 
		MT_delay_TOK=161, ET_delay_TOK=162, MT_properties=163, ET_properties=164, 
		MT_propertylist_OPT=165, ET_propertylist_OPT=166, MT_propertylist=167, 
		ET_propertylist=168, MT_propertylist_S1_ZOM=169, ET_propertylist_S1_ZOM=170, 
		MT_propertylist_S1=171, ET_propertylist_S1=172, MT_property_OPT=173, ET_property_OPT=174, 
		MT_property=175, ET_property=176, MT_not_TOK=177, ET_not_TOK=178, MT_expression=179, 
		ET_expression=180, MT_sortDeclaration=181, ET_sortDeclaration=182, MT_sortparams_OPT=183, 
		ET_sortparams_OPT=184, MT_datasort_TOK=185, ET_datasort_TOK=186, MT_sortparams=187, 
		ET_sortparams=188, MT_forall_TOK=189, ET_forall_TOK=190, MT_variable_OOM=191, 
		ET_variable_OOM=192, MT_sortset=193, ET_sortset=194, MT_sortnames=195, 
		ET_sortnames=196, MT_sortnames_S1_ZOM=197, ET_sortnames_S1_ZOM=198, MT_sortnames_S1=199, 
		ET_sortnames_S1=200, MT_sortname=201, ET_sortname=202, MT_sortarguments_OPT=203, 
		ET_sortarguments_OPT=204, MT_sortarguments=205, ET_sortarguments=206, 
		MT_sortnames_OPT=207, ET_sortnames_OPT=208, MT_forms=209, ET_forms=210, 
		MT_forms_S1_ZOM=211, ET_forms_S1_ZOM=212, MT_forms_S1=213, ET_forms_S1=214, 
		MT_form=215, ET_form=216, MT_constructor=217, ET_constructor=218, MT_constructor_TOK=219, 
		ET_constructor_TOK=220, MT_qualifier=221, ET_qualifier=222, MT_directive=223, 
		ET_directive=224, MT_directiveArguments_OPT=225, ET_directiveArguments_OPT=226, 
		MT_directiveArguments=227, ET_directiveArguments=228, MT_directives_OPT=229, 
		ET_directives_OPT=230, MT_directives=231, ET_directives=232, MT_directives_S1_ZOM=233, 
		ET_directives_S1_ZOM=234, MT_directives_S1=235, ET_directives_S1=236, 
		MT_directiveList=237, ET_directiveList=238, MT_declarations_OPT=239, ET_declarations_OPT=240, 
		MODULE=241, DISPATCH=242, DELAY=243, COLON=244, ARROW=245, FORALL=246, 
		LPAR=247, RPAR=248, LBRACE=249, RBRACE=250, LSQUARE=251, RSQUARE=252, 
		SEMI=253, COMMA=254, DATASORT=255, COLONCOLON=256, DOT=257, NOT=258, LINEAR=259, 
		FUNCTIONAL=260, AND=261, AT=262, CONSTRUCTOR=263, VARIABLE=264, METAVAR=265, 
		STRING=266, NUMBER=267, WS=268, BLOCK_COMMENT=269, LINE_COMMENT=270, XML_COMMENT=271, 
		EMBED_END=272;
	public static final int
		RULE_crsx = 0, RULE_crsx_EOF = 1, RULE_declarations = 2, RULE_declarations_EOF = 3, 
		RULE_declarations_S1_ZOM = 4, RULE_declarations_S1_ZOM_EOF = 5, RULE_declarations_S1 = 6, 
		RULE_declarations_S1_EOF = 7, RULE_semi_TOK = 8, RULE_semi_TOK_EOF = 9, 
		RULE_declaration_OPT = 10, RULE_declaration_OPT_EOF = 11, RULE_declaration = 12, 
		RULE_declaration_EOF = 13, RULE_moduleDeclaration = 14, RULE_moduleDeclaration_EOF = 15, 
		RULE_module_TOK = 16, RULE_module_TOK_EOF = 17, RULE_string_TOK = 18, 
		RULE_string_TOK_EOF = 19, RULE_lbrace_TOK = 20, RULE_lbrace_TOK_EOF = 21, 
		RULE_rbrace_TOK = 22, RULE_rbrace_TOK_EOF = 23, RULE_ruleDeclaration = 24, 
		RULE_ruleDeclaration_EOF = 25, RULE_option_OPT = 26, RULE_option_OPT_EOF = 27, 
		RULE_arrow_TOK = 28, RULE_arrow_TOK_EOF = 29, RULE_option = 30, RULE_option_EOF = 31, 
		RULE_arguments_OPT = 32, RULE_arguments_OPT_EOF = 33, RULE_colon_TOK = 34, 
		RULE_colon_TOK_EOF = 35, RULE_pattern = 36, RULE_pattern_EOF = 37, RULE_properties_OPT = 38, 
		RULE_properties_OPT_EOF = 39, RULE_contractum = 40, RULE_contractum_EOF = 41, 
		RULE_annotations = 42, RULE_annotations_EOF = 43, RULE_annotation_OOM = 44, 
		RULE_annotation_OOM_EOF = 45, RULE_annotation = 46, RULE_annotation_EOF = 47, 
		RULE_at_TOK = 48, RULE_at_TOK_EOF = 49, RULE_term = 50, RULE_term_EOF = 51, 
		RULE_freeTerm = 52, RULE_freeTerm_EOF = 53, RULE_annotations_OPT = 54, 
		RULE_annotations_OPT_EOF = 55, RULE_metavar_TOK = 56, RULE_metavar_TOK_EOF = 57, 
		RULE_freeArguments_OPT = 58, RULE_freeArguments_OPT_EOF = 59, RULE_boundTerm = 60, 
		RULE_boundTerm_EOF = 61, RULE_nextBinder = 62, RULE_nextBinder_EOF = 63, 
		RULE_dot_TOK = 64, RULE_dot_TOK_EOF = 65, RULE_arguments = 66, RULE_arguments_EOF = 67, 
		RULE_lsquare_TOK = 68, RULE_lsquare_TOK_EOF = 69, RULE_terms_OPT = 70, 
		RULE_terms_OPT_EOF = 71, RULE_rsquare_TOK = 72, RULE_rsquare_TOK_EOF = 73, 
		RULE_terms = 74, RULE_terms_EOF = 75, RULE_terms_S1_ZOM = 76, RULE_terms_S1_ZOM_EOF = 77, 
		RULE_terms_S1 = 78, RULE_terms_S1_EOF = 79, RULE_comma_TOK = 80, RULE_comma_TOK_EOF = 81, 
		RULE_freeArguments = 82, RULE_freeArguments_EOF = 83, RULE_freeTerms_OPT = 84, 
		RULE_freeTerms_OPT_EOF = 85, RULE_freeTerms = 86, RULE_freeTerms_EOF = 87, 
		RULE_freeTerms_S1_ZOM = 88, RULE_freeTerms_S1_ZOM_EOF = 89, RULE_freeTerms_S1 = 90, 
		RULE_freeTerms_S1_EOF = 91, RULE_list = 92, RULE_list_EOF = 93, RULE_lpar_TOK = 94, 
		RULE_lpar_TOK_EOF = 95, RULE_termList_OPT = 96, RULE_termList_OPT_EOF = 97, 
		RULE_rpar_TOK = 98, RULE_rpar_TOK_EOF = 99, RULE_termList = 100, RULE_termList_EOF = 101, 
		RULE_termList_S1_ZOM = 102, RULE_termList_S1_ZOM_EOF = 103, RULE_termList_S1 = 104, 
		RULE_termList_S1_EOF = 105, RULE_term_OPT = 106, RULE_term_OPT_EOF = 107, 
		RULE_variable = 108, RULE_variable_EOF = 109, RULE_variable_TOK = 110, 
		RULE_variable_TOK_EOF = 111, RULE_linear_OPT = 112, RULE_linear_OPT_EOF = 113, 
		RULE_functional_OPT = 114, RULE_functional_OPT_EOF = 115, RULE_varsort_OPT = 116, 
		RULE_varsort_OPT_EOF = 117, RULE_linear = 118, RULE_linear_EOF = 119, 
		RULE_linear_TOK = 120, RULE_linear_TOK_EOF = 121, RULE_functional = 122, 
		RULE_functional_EOF = 123, RULE_functional_TOK = 124, RULE_functional_TOK_EOF = 125, 
		RULE_literal = 126, RULE_literal_EOF = 127, RULE_number_TOK = 128, RULE_number_TOK_EOF = 129, 
		RULE_binder = 130, RULE_binder_EOF = 131, RULE_varsort = 132, RULE_varsort_EOF = 133, 
		RULE_coloncolon_TOK = 134, RULE_coloncolon_TOK_EOF = 135, RULE_dispatch = 136, 
		RULE_dispatch_EOF = 137, RULE_dispatch_TOK = 138, RULE_dispatch_TOK_EOF = 139, 
		RULE_delayCase_OPT = 140, RULE_delayCase_OPT_EOF = 141, RULE_dispatchTerm = 142, 
		RULE_dispatchTerm_EOF = 143, RULE_dispatchTerm_S1_ZOM = 144, RULE_dispatchTerm_S1_ZOM_EOF = 145, 
		RULE_dispatchTerm_S1 = 146, RULE_dispatchTerm_S1_EOF = 147, RULE_and_TOK = 148, 
		RULE_and_TOK_EOF = 149, RULE_dispatchCases = 150, RULE_dispatchCases_EOF = 151, 
		RULE_dispatchCases_S1_ZOM = 152, RULE_dispatchCases_S1_ZOM_EOF = 153, 
		RULE_dispatchCases_S1 = 154, RULE_dispatchCases_S1_EOF = 155, RULE_dispatchCase = 156, 
		RULE_dispatchCase_EOF = 157, RULE_delayCase = 158, RULE_delayCase_EOF = 159, 
		RULE_delay_TOK = 160, RULE_delay_TOK_EOF = 161, RULE_properties = 162, 
		RULE_properties_EOF = 163, RULE_propertylist_OPT = 164, RULE_propertylist_OPT_EOF = 165, 
		RULE_propertylist = 166, RULE_propertylist_EOF = 167, RULE_propertylist_S1_ZOM = 168, 
		RULE_propertylist_S1_ZOM_EOF = 169, RULE_propertylist_S1 = 170, RULE_propertylist_S1_EOF = 171, 
		RULE_property_OPT = 172, RULE_property_OPT_EOF = 173, RULE_property = 174, 
		RULE_property_EOF = 175, RULE_not_TOK = 176, RULE_not_TOK_EOF = 177, RULE_expression = 178, 
		RULE_expression_EOF = 179, RULE_sortDeclaration = 180, RULE_sortDeclaration_EOF = 181, 
		RULE_sortparams_OPT = 182, RULE_sortparams_OPT_EOF = 183, RULE_datasort_TOK = 184, 
		RULE_datasort_TOK_EOF = 185, RULE_sortparams = 186, RULE_sortparams_EOF = 187, 
		RULE_forall_TOK = 188, RULE_forall_TOK_EOF = 189, RULE_variable_OOM = 190, 
		RULE_variable_OOM_EOF = 191, RULE_sortset = 192, RULE_sortset_EOF = 193, 
		RULE_sortnames = 194, RULE_sortnames_EOF = 195, RULE_sortnames_S1_ZOM = 196, 
		RULE_sortnames_S1_ZOM_EOF = 197, RULE_sortnames_S1 = 198, RULE_sortnames_S1_EOF = 199, 
		RULE_sortname = 200, RULE_sortname_EOF = 201, RULE_sortarguments_OPT = 202, 
		RULE_sortarguments_OPT_EOF = 203, RULE_sortarguments = 204, RULE_sortarguments_EOF = 205, 
		RULE_sortnames_OPT = 206, RULE_sortnames_OPT_EOF = 207, RULE_forms = 208, 
		RULE_forms_EOF = 209, RULE_forms_S1_ZOM = 210, RULE_forms_S1_ZOM_EOF = 211, 
		RULE_forms_S1 = 212, RULE_forms_S1_EOF = 213, RULE_form = 214, RULE_form_EOF = 215, 
		RULE_constructor = 216, RULE_constructor_EOF = 217, RULE_constructor_TOK = 218, 
		RULE_constructor_TOK_EOF = 219, RULE_qualifier = 220, RULE_qualifier_EOF = 221, 
		RULE_directive = 222, RULE_directive_EOF = 223, RULE_directiveArguments_OPT = 224, 
		RULE_directiveArguments_OPT_EOF = 225, RULE_directiveArguments = 226, 
		RULE_directiveArguments_EOF = 227, RULE_directives_OPT = 228, RULE_directives_OPT_EOF = 229, 
		RULE_directives = 230, RULE_directives_EOF = 231, RULE_directives_S1_ZOM = 232, 
		RULE_directives_S1_ZOM_EOF = 233, RULE_directives_S1 = 234, RULE_directives_S1_EOF = 235, 
		RULE_directiveList = 236, RULE_directiveList_EOF = 237, RULE_declarations_OPT = 238, 
		RULE_declarations_OPT_EOF = 239;
	public static final String[] ruleNames = {
		"crsx", "crsx_EOF", "declarations", "declarations_EOF", "declarations_S1_ZOM", 
		"declarations_S1_ZOM_EOF", "declarations_S1", "declarations_S1_EOF", "semi_TOK", 
		"semi_TOK_EOF", "declaration_OPT", "declaration_OPT_EOF", "declaration", 
		"declaration_EOF", "moduleDeclaration", "moduleDeclaration_EOF", "module_TOK", 
		"module_TOK_EOF", "string_TOK", "string_TOK_EOF", "lbrace_TOK", "lbrace_TOK_EOF", 
		"rbrace_TOK", "rbrace_TOK_EOF", "ruleDeclaration", "ruleDeclaration_EOF", 
		"option_OPT", "option_OPT_EOF", "arrow_TOK", "arrow_TOK_EOF", "option", 
		"option_EOF", "arguments_OPT", "arguments_OPT_EOF", "colon_TOK", "colon_TOK_EOF", 
		"pattern", "pattern_EOF", "properties_OPT", "properties_OPT_EOF", "contractum", 
		"contractum_EOF", "annotations", "annotations_EOF", "annotation_OOM", 
		"annotation_OOM_EOF", "annotation", "annotation_EOF", "at_TOK", "at_TOK_EOF", 
		"term", "term_EOF", "freeTerm", "freeTerm_EOF", "annotations_OPT", "annotations_OPT_EOF", 
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
		"variable_EOF", "variable_TOK", "variable_TOK_EOF", "linear_OPT", "linear_OPT_EOF", 
		"functional_OPT", "functional_OPT_EOF", "varsort_OPT", "varsort_OPT_EOF", 
		"linear", "linear_EOF", "linear_TOK", "linear_TOK_EOF", "functional", 
		"functional_EOF", "functional_TOK", "functional_TOK_EOF", "literal", "literal_EOF", 
		"number_TOK", "number_TOK_EOF", "binder", "binder_EOF", "varsort", "varsort_EOF", 
		"coloncolon_TOK", "coloncolon_TOK_EOF", "dispatch", "dispatch_EOF", "dispatch_TOK", 
		"dispatch_TOK_EOF", "delayCase_OPT", "delayCase_OPT_EOF", "dispatchTerm", 
		"dispatchTerm_EOF", "dispatchTerm_S1_ZOM", "dispatchTerm_S1_ZOM_EOF", 
		"dispatchTerm_S1", "dispatchTerm_S1_EOF", "and_TOK", "and_TOK_EOF", "dispatchCases", 
		"dispatchCases_EOF", "dispatchCases_S1_ZOM", "dispatchCases_S1_ZOM_EOF", 
		"dispatchCases_S1", "dispatchCases_S1_EOF", "dispatchCase", "dispatchCase_EOF", 
		"delayCase", "delayCase_EOF", "delay_TOK", "delay_TOK_EOF", "properties", 
		"properties_EOF", "propertylist_OPT", "propertylist_OPT_EOF", "propertylist", 
		"propertylist_EOF", "propertylist_S1_ZOM", "propertylist_S1_ZOM_EOF", 
		"propertylist_S1", "propertylist_S1_EOF", "property_OPT", "property_OPT_EOF", 
		"property", "property_EOF", "not_TOK", "not_TOK_EOF", "expression", "expression_EOF", 
		"sortDeclaration", "sortDeclaration_EOF", "sortparams_OPT", "sortparams_OPT_EOF", 
		"datasort_TOK", "datasort_TOK_EOF", "sortparams", "sortparams_EOF", "forall_TOK", 
		"forall_TOK_EOF", "variable_OOM", "variable_OOM_EOF", "sortset", "sortset_EOF", 
		"sortnames", "sortnames_EOF", "sortnames_S1_ZOM", "sortnames_S1_ZOM_EOF", 
		"sortnames_S1", "sortnames_S1_EOF", "sortname", "sortname_EOF", "sortarguments_OPT", 
		"sortarguments_OPT_EOF", "sortarguments", "sortarguments_EOF", "sortnames_OPT", 
		"sortnames_OPT_EOF", "forms", "forms_EOF", "forms_S1_ZOM", "forms_S1_ZOM_EOF", 
		"forms_S1", "forms_S1_EOF", "form", "form_EOF", "constructor", "constructor_EOF", 
		"constructor_TOK", "constructor_TOK_EOF", "qualifier", "qualifier_EOF", 
		"directive", "directive_EOF", "directiveArguments_OPT", "directiveArguments_OPT_EOF", 
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
		null, "'module'", "'dispatch'", "'delay'", "':'", "'→'", "'∀'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'::='", "'::'", "'.'", 
		"'¬'", "'¹'", "'ᵇ'", "'&'", "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MT_crsx", "ET_crsx", "MT_declarations", "ET_declarations", "MT_declarations_S1_ZOM", 
		"ET_declarations_S1_ZOM", "MT_declarations_S1", "ET_declarations_S1", 
		"MT_semi_TOK", "ET_semi_TOK", "MT_declaration_OPT", "ET_declaration_OPT", 
		"MT_declaration", "ET_declaration", "MT_moduleDeclaration", "ET_moduleDeclaration", 
		"MT_module_TOK", "ET_module_TOK", "MT_string_TOK", "ET_string_TOK", "MT_lbrace_TOK", 
		"ET_lbrace_TOK", "MT_rbrace_TOK", "ET_rbrace_TOK", "MT_ruleDeclaration", 
		"ET_ruleDeclaration", "MT_option_OPT", "ET_option_OPT", "MT_arrow_TOK", 
		"ET_arrow_TOK", "MT_option", "ET_option", "MT_arguments_OPT", "ET_arguments_OPT", 
		"MT_colon_TOK", "ET_colon_TOK", "MT_pattern", "ET_pattern", "MT_properties_OPT", 
		"ET_properties_OPT", "MT_contractum", "ET_contractum", "MT_annotations", 
		"ET_annotations", "MT_annotation_OOM", "ET_annotation_OOM", "MT_annotation", 
		"ET_annotation", "MT_at_TOK", "ET_at_TOK", "MT_term", "ET_term", "MT_freeTerm", 
		"ET_freeTerm", "MT_annotations_OPT", "ET_annotations_OPT", "MT_metavar_TOK", 
		"ET_metavar_TOK", "MT_freeArguments_OPT", "ET_freeArguments_OPT", "MT_boundTerm", 
		"ET_boundTerm", "MT_nextBinder", "ET_nextBinder", "MT_dot_TOK", "ET_dot_TOK", 
		"MT_arguments", "ET_arguments", "MT_lsquare_TOK", "ET_lsquare_TOK", "MT_terms_OPT", 
		"ET_terms_OPT", "MT_rsquare_TOK", "ET_rsquare_TOK", "MT_terms", "ET_terms", 
		"MT_terms_S1_ZOM", "ET_terms_S1_ZOM", "MT_terms_S1", "ET_terms_S1", "MT_comma_TOK", 
		"ET_comma_TOK", "MT_freeArguments", "ET_freeArguments", "MT_freeTerms_OPT", 
		"ET_freeTerms_OPT", "MT_freeTerms", "ET_freeTerms", "MT_freeTerms_S1_ZOM", 
		"ET_freeTerms_S1_ZOM", "MT_freeTerms_S1", "ET_freeTerms_S1", "MT_list", 
		"ET_list", "MT_lpar_TOK", "ET_lpar_TOK", "MT_termList_OPT", "ET_termList_OPT", 
		"MT_rpar_TOK", "ET_rpar_TOK", "MT_termList", "ET_termList", "MT_termList_S1_ZOM", 
		"ET_termList_S1_ZOM", "MT_termList_S1", "ET_termList_S1", "MT_term_OPT", 
		"ET_term_OPT", "MT_variable", "ET_variable", "MT_variable_TOK", "ET_variable_TOK", 
		"MT_linear_OPT", "ET_linear_OPT", "MT_functional_OPT", "ET_functional_OPT", 
		"MT_varsort_OPT", "ET_varsort_OPT", "MT_linear", "ET_linear", "MT_linear_TOK", 
		"ET_linear_TOK", "MT_functional", "ET_functional", "MT_functional_TOK", 
		"ET_functional_TOK", "MT_literal", "ET_literal", "MT_number_TOK", "ET_number_TOK", 
		"MT_binder", "ET_binder", "MT_varsort", "ET_varsort", "MT_coloncolon_TOK", 
		"ET_coloncolon_TOK", "MT_dispatch", "ET_dispatch", "MT_dispatch_TOK", 
		"ET_dispatch_TOK", "MT_delayCase_OPT", "ET_delayCase_OPT", "MT_dispatchTerm", 
		"ET_dispatchTerm", "MT_dispatchTerm_S1_ZOM", "ET_dispatchTerm_S1_ZOM", 
		"MT_dispatchTerm_S1", "ET_dispatchTerm_S1", "MT_and_TOK", "ET_and_TOK", 
		"MT_dispatchCases", "ET_dispatchCases", "MT_dispatchCases_S1_ZOM", "ET_dispatchCases_S1_ZOM", 
		"MT_dispatchCases_S1", "ET_dispatchCases_S1", "MT_dispatchCase", "ET_dispatchCase", 
		"MT_delayCase", "ET_delayCase", "MT_delay_TOK", "ET_delay_TOK", "MT_properties", 
		"ET_properties", "MT_propertylist_OPT", "ET_propertylist_OPT", "MT_propertylist", 
		"ET_propertylist", "MT_propertylist_S1_ZOM", "ET_propertylist_S1_ZOM", 
		"MT_propertylist_S1", "ET_propertylist_S1", "MT_property_OPT", "ET_property_OPT", 
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
		"MT_constructor_TOK", "ET_constructor_TOK", "MT_qualifier", "ET_qualifier", 
		"MT_directive", "ET_directive", "MT_directiveArguments_OPT", "ET_directiveArguments_OPT", 
		"MT_directiveArguments", "ET_directiveArguments", "MT_directives_OPT", 
		"ET_directives_OPT", "MT_directives", "ET_directives", "MT_directives_S1_ZOM", 
		"ET_directives_S1_ZOM", "MT_directives_S1", "ET_directives_S1", "MT_directiveList", 
		"ET_directiveList", "MT_declarations_OPT", "ET_declarations_OPT", "MODULE", 
		"DISPATCH", "DELAY", "COLON", "ARROW", "FORALL", "LPAR", "RPAR", "LBRACE", 
		"RBRACE", "LSQUARE", "RSQUARE", "SEMI", "COMMA", "DATASORT", "COLONCOLON", 
		"DOT", "NOT", "LINEAR", "FUNCTIONAL", "AND", "AT", "CONSTRUCTOR", "VARIABLE", 
		"METAVAR", "STRING", "NUMBER", "WS", "BLOCK_COMMENT", "LINE_COMMENT", 
		"XML_COMMENT", "EMBED_END"
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
			setState(489);
			switch (_input.LA(1)) {
			case MT_declarations:
			case ET_declarations:
			case MT_declaration:
			case ET_declaration:
			case MT_moduleDeclaration:
			case ET_moduleDeclaration:
			case MT_module_TOK:
			case ET_module_TOK:
			case MT_string_TOK:
			case ET_string_TOK:
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
			case MT_lpar_TOK:
			case ET_lpar_TOK:
			case MT_variable:
			case ET_variable:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_literal:
			case ET_literal:
			case MT_number_TOK:
			case ET_number_TOK:
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
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_qualifier:
			case ET_qualifier:
			case MT_directive:
			case ET_directive:
			case MT_directiveList:
			case ET_directiveList:
			case MODULE:
			case COLON:
			case FORALL:
			case LPAR:
			case LBRACE:
			case AT:
			case CONSTRUCTOR:
			case VARIABLE:
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(481);
				declarations();
				_exitAlt();
				}
				break;
			case MT_crsx:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(485);
				match(MT_crsx);
				}
				break;
			case ET_crsx:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(487);
				match(ET_crsx);
				setState(488);
				match(EMBED_END);
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
			setState(491);
			crsx();
			setState(492);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
			setState(504);
			switch (_input.LA(1)) {
			case MT_declaration:
			case ET_declaration:
			case MT_moduleDeclaration:
			case ET_moduleDeclaration:
			case MT_module_TOK:
			case ET_module_TOK:
			case MT_string_TOK:
			case ET_string_TOK:
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
			case MT_lpar_TOK:
			case ET_lpar_TOK:
			case MT_variable:
			case ET_variable:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_literal:
			case ET_literal:
			case MT_number_TOK:
			case ET_number_TOK:
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
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_qualifier:
			case ET_qualifier:
			case MT_directive:
			case ET_directive:
			case MT_directiveList:
			case ET_directiveList:
			case MODULE:
			case COLON:
			case FORALL:
			case LPAR:
			case LBRACE:
			case AT:
			case CONSTRUCTOR:
			case VARIABLE:
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(495);
				declaration();
				setState(496);
				declarations_S1_ZOM();
				_exitAlt();
				}
				break;
			case MT_declarations:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(500);
				match(MT_declarations);
				}
				break;
			case ET_declarations:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(502);
				match(ET_declarations);
				setState(503);
				match(EMBED_END);
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
			setState(506);
			declarations();
			setState(507);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
			setState(534);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterZOM();
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_declarations_S1) | (1L << ET_declarations_S1) | (1L << MT_semi_TOK) | (1L << ET_semi_TOK))) != 0) || _la==SEMI) {
					{
					{
					setState(511);
					declarations_S1();
					}
					}
					setState(516);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(525);
				_la = _input.LA(1);
				if (_la==MT_declarations_S1_ZOM || _la==ET_declarations_S1_ZOM) {
					{
					_tail();
					setState(523);
					switch (_input.LA(1)) {
					case MT_declarations_S1_ZOM:
						{
						_term();
						setState(519);
						match(MT_declarations_S1_ZOM);
						}
						break;
					case ET_declarations_S1_ZOM:
						{
						_embed();
						setState(521);
						match(ET_declarations_S1_ZOM);
						setState(522);
						match(EMBED_END);
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
				setState(530);
				match(MT_declarations_S1_ZOM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(532);
				match(ET_declarations_S1_ZOM);
				setState(533);
				match(EMBED_END);
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
			setState(536);
			declarations_S1_ZOM();
			setState(537);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
			setState(549);
			switch (_input.LA(1)) {
			case MT_semi_TOK:
			case ET_semi_TOK:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(540);
				semi_TOK();
				setState(541);
				declaration_OPT();
				_exitAlt();
				}
				break;
			case MT_declarations_S1:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(545);
				match(MT_declarations_S1);
				}
				break;
			case ET_declarations_S1:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(547);
				match(ET_declarations_S1);
				setState(548);
				match(EMBED_END);
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
			setState(551);
			declarations_S1();
			setState(552);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
			setState(562);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(555);
				match(SEMI);

				}
				break;
			case MT_semi_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(558);
				match(MT_semi_TOK);
				}
				break;
			case ET_semi_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(560);
				match(ET_semi_TOK);
				setState(561);
				match(EMBED_END);
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
			setState(564);
			semi_TOK();
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

	public static class Declaration_OPTContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode MT_declaration_OPT() { return getToken(CrsxMetaParser.MT_declaration_OPT, 0); }
		public TerminalNode ET_declaration_OPT() { return getToken(CrsxMetaParser.ET_declaration_OPT, 0); }
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
			setState(589);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(570);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_declaration) | (1L << ET_declaration) | (1L << MT_moduleDeclaration) | (1L << ET_moduleDeclaration) | (1L << MT_module_TOK) | (1L << ET_module_TOK) | (1L << MT_string_TOK) | (1L << ET_string_TOK) | (1L << MT_lbrace_TOK) | (1L << ET_lbrace_TOK) | (1L << MT_ruleDeclaration) | (1L << ET_ruleDeclaration) | (1L << MT_option_OPT) | (1L << ET_option_OPT) | (1L << MT_option) | (1L << ET_option) | (1L << MT_colon_TOK) | (1L << ET_colon_TOK) | (1L << MT_pattern) | (1L << ET_pattern) | (1L << MT_properties_OPT) | (1L << ET_properties_OPT) | (1L << MT_annotations) | (1L << ET_annotations) | (1L << MT_annotation_OOM) | (1L << ET_annotation_OOM) | (1L << MT_annotation) | (1L << ET_annotation) | (1L << MT_at_TOK) | (1L << ET_at_TOK))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (MT_lpar_TOK - 95)) | (1L << (ET_lpar_TOK - 95)) | (1L << (MT_variable - 95)) | (1L << (ET_variable - 95)) | (1L << (MT_variable_TOK - 95)) | (1L << (ET_variable_TOK - 95)) | (1L << (MT_literal - 95)) | (1L << (ET_literal - 95)) | (1L << (MT_number_TOK - 95)) | (1L << (ET_number_TOK - 95)))) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (MT_properties - 163)) | (1L << (ET_properties - 163)) | (1L << (MT_sortDeclaration - 163)) | (1L << (ET_sortDeclaration - 163)) | (1L << (MT_sortparams_OPT - 163)) | (1L << (ET_sortparams_OPT - 163)) | (1L << (MT_sortparams - 163)) | (1L << (ET_sortparams - 163)) | (1L << (MT_forall_TOK - 163)) | (1L << (ET_forall_TOK - 163)) | (1L << (MT_sortset - 163)) | (1L << (ET_sortset - 163)) | (1L << (MT_sortname - 163)) | (1L << (ET_sortname - 163)) | (1L << (MT_form - 163)) | (1L << (ET_form - 163)) | (1L << (MT_constructor - 163)) | (1L << (ET_constructor - 163)) | (1L << (MT_constructor_TOK - 163)) | (1L << (ET_constructor_TOK - 163)) | (1L << (MT_qualifier - 163)) | (1L << (ET_qualifier - 163)) | (1L << (MT_directive - 163)) | (1L << (ET_directive - 163)))) != 0) || ((((_la - 237)) & ~0x3f) == 0 && ((1L << (_la - 237)) & ((1L << (MT_directiveList - 237)) | (1L << (ET_directiveList - 237)) | (1L << (MODULE - 237)) | (1L << (COLON - 237)) | (1L << (FORALL - 237)) | (1L << (LPAR - 237)) | (1L << (LBRACE - 237)) | (1L << (AT - 237)) | (1L << (CONSTRUCTOR - 237)) | (1L << (VARIABLE - 237)) | (1L << (STRING - 237)) | (1L << (NUMBER - 237)))) != 0)) {
					{
					setState(569);
					declaration();
					}
				}

				setState(580);
				_la = _input.LA(1);
				if (_la==MT_declaration_OPT || _la==ET_declaration_OPT) {
					{
					_tail();
					setState(578);
					switch (_input.LA(1)) {
					case MT_declaration_OPT:
						{
						_term();
						setState(574);
						match(MT_declaration_OPT);
						}
						break;
					case ET_declaration_OPT:
						{
						_embed();
						setState(576);
						match(ET_declaration_OPT);
						setState(577);
						match(EMBED_END);
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
				setState(585);
				match(MT_declaration_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(587);
				match(ET_declaration_OPT);
				setState(588);
				match(EMBED_END);
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
			setState(591);
			declaration_OPT();
			setState(592);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
			setState(615);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(595);
				moduleDeclaration();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(599);
				ruleDeclaration();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(603);
				sortDeclaration();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(607);
				directive();
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_term();
				setState(611);
				match(MT_declaration);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_embed();
				setState(613);
				match(ET_declaration);
				setState(614);
				match(EMBED_END);
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
			setState(617);
			declaration();
			setState(618);
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
		public String_TOKContext string_TOK() {
			return getRuleContext(String_TOKContext.class,0);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
			setState(633);
			switch (_input.LA(1)) {
			case MT_module_TOK:
			case ET_module_TOK:
			case MODULE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(621);
				module_TOK();
				setState(622);
				string_TOK();
				setState(623);
				lbrace_TOK();
				setState(624);
				declarations();
				setState(625);
				rbrace_TOK();
				_exitAlt();
				}
				break;
			case MT_moduleDeclaration:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(629);
				match(MT_moduleDeclaration);
				}
				break;
			case ET_moduleDeclaration:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(631);
				match(ET_moduleDeclaration);
				setState(632);
				match(EMBED_END);
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
			setState(635);
			moduleDeclaration();
			setState(636);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
			setState(646);
			switch (_input.LA(1)) {
			case MODULE:
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				match(MODULE);

				}
				break;
			case MT_module_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(642);
				match(MT_module_TOK);
				}
				break;
			case ET_module_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(644);
				match(ET_module_TOK);
				setState(645);
				match(EMBED_END);
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
			setState(648);
			module_TOK();
			setState(649);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 36, RULE_string_TOK);
		try {
			setState(659);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				match(STRING);

				}
				break;
			case MT_string_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(655);
				match(MT_string_TOK);
				}
				break;
			case ET_string_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(657);
				match(ET_string_TOK);
				setState(658);
				match(EMBED_END);
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
		enterRule(_localctx, 38, RULE_string_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			string_TOK();
			setState(662);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
			setState(672);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(665);
				match(LBRACE);

				}
				break;
			case MT_lbrace_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(668);
				match(MT_lbrace_TOK);
				}
				break;
			case ET_lbrace_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(670);
				match(ET_lbrace_TOK);
				setState(671);
				match(EMBED_END);
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
			setState(674);
			lbrace_TOK();
			setState(675);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
			setState(685);
			switch (_input.LA(1)) {
			case RBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(678);
				match(RBRACE);

				}
				break;
			case MT_rbrace_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(681);
				match(MT_rbrace_TOK);
				}
				break;
			case ET_rbrace_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(683);
				match(ET_rbrace_TOK);
				setState(684);
				match(EMBED_END);
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
			setState(687);
			rbrace_TOK();
			setState(688);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 48, RULE_ruleDeclaration);
		try {
			setState(702);
			switch (_input.LA(1)) {
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
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_qualifier:
			case ET_qualifier:
			case COLON:
			case LBRACE:
			case AT:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(691);
				option_OPT();
				setState(692);
				pattern();
				setState(693);
				arrow_TOK();
				setState(694);
				contractum();
				_exitAlt();
				}
				break;
			case MT_ruleDeclaration:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(698);
				match(MT_ruleDeclaration);
				}
				break;
			case ET_ruleDeclaration:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(700);
				match(ET_ruleDeclaration);
				setState(701);
				match(EMBED_END);
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
		enterRule(_localctx, 50, RULE_ruleDeclaration_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			ruleDeclaration();
			setState(705);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 52, RULE_option_OPT);
		int _la;
		try {
			setState(729);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(710);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(709);
					option();
					}
					break;
				}
				setState(720);
				_la = _input.LA(1);
				if (_la==MT_option_OPT || _la==ET_option_OPT) {
					{
					_tail();
					setState(718);
					switch (_input.LA(1)) {
					case MT_option_OPT:
						{
						_term();
						setState(714);
						match(MT_option_OPT);
						}
						break;
					case ET_option_OPT:
						{
						_embed();
						setState(716);
						match(ET_option_OPT);
						setState(717);
						match(EMBED_END);
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
				setState(725);
				match(MT_option_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(727);
				match(ET_option_OPT);
				setState(728);
				match(EMBED_END);
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
		enterRule(_localctx, 54, RULE_option_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			option_OPT();
			setState(732);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 56, RULE_arrow_TOK);
		try {
			setState(742);
			switch (_input.LA(1)) {
			case ARROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				match(ARROW);

				}
				break;
			case MT_arrow_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(738);
				match(MT_arrow_TOK);
				}
				break;
			case ET_arrow_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(740);
				match(ET_arrow_TOK);
				setState(741);
				match(EMBED_END);
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
		enterRule(_localctx, 58, RULE_arrow_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			arrow_TOK();
			setState(745);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 60, RULE_option);
		try {
			setState(762);
			switch (_input.LA(1)) {
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_constructor:
			case ET_constructor:
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_qualifier:
			case ET_qualifier:
			case COLON:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(748);
				constructor();
				setState(749);
				arguments_OPT();
				setState(750);
				colon_TOK();
				_exitAlt();
				}
				break;
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
			case MT_at_TOK:
			case ET_at_TOK:
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(754);
				annotations();
				_exitAlt();
				}
				break;
			case MT_option:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(758);
				match(MT_option);
				}
				break;
			case ET_option:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(760);
				match(ET_option);
				setState(761);
				match(EMBED_END);
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
		enterRule(_localctx, 62, RULE_option_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			option();
			setState(765);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 64, RULE_arguments_OPT);
		int _la;
		try {
			setState(789);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(770);
				_la = _input.LA(1);
				if (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (MT_arguments - 67)) | (1L << (ET_arguments - 67)) | (1L << (MT_lsquare_TOK - 67)) | (1L << (ET_lsquare_TOK - 67)))) != 0) || _la==LSQUARE) {
					{
					setState(769);
					arguments();
					}
				}

				setState(780);
				_la = _input.LA(1);
				if (_la==MT_arguments_OPT || _la==ET_arguments_OPT) {
					{
					_tail();
					setState(778);
					switch (_input.LA(1)) {
					case MT_arguments_OPT:
						{
						_term();
						setState(774);
						match(MT_arguments_OPT);
						}
						break;
					case ET_arguments_OPT:
						{
						_embed();
						setState(776);
						match(ET_arguments_OPT);
						setState(777);
						match(EMBED_END);
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
				setState(785);
				match(MT_arguments_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(787);
				match(ET_arguments_OPT);
				setState(788);
				match(EMBED_END);
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
		enterRule(_localctx, 66, RULE_arguments_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			arguments_OPT();
			setState(792);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 68, RULE_colon_TOK);
		try {
			setState(802);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(795);
				match(COLON);

				}
				break;
			case MT_colon_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(798);
				match(MT_colon_TOK);
				}
				break;
			case ET_colon_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(800);
				match(ET_colon_TOK);
				setState(801);
				match(EMBED_END);
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
		enterRule(_localctx, 70, RULE_colon_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			colon_TOK();
			setState(805);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 72, RULE_pattern);
		try {
			setState(818);
			switch (_input.LA(1)) {
			case MT_lbrace_TOK:
			case ET_lbrace_TOK:
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_properties:
			case ET_properties:
			case MT_constructor:
			case ET_constructor:
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_qualifier:
			case ET_qualifier:
			case COLON:
			case LBRACE:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(808);
				properties_OPT();
				setState(809);
				constructor();
				setState(810);
				arguments_OPT();
				_exitAlt();
				}
				break;
			case MT_pattern:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(814);
				match(MT_pattern);
				}
				break;
			case ET_pattern:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(816);
				match(ET_pattern);
				setState(817);
				match(EMBED_END);
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
		enterRule(_localctx, 74, RULE_pattern_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			pattern();
			setState(821);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 76, RULE_properties_OPT);
		int _la;
		try {
			setState(845);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(826);
				_la = _input.LA(1);
				if (_la==MT_lbrace_TOK || _la==ET_lbrace_TOK || _la==MT_properties || _la==ET_properties || _la==LBRACE) {
					{
					setState(825);
					properties();
					}
				}

				setState(836);
				_la = _input.LA(1);
				if (_la==MT_properties_OPT || _la==ET_properties_OPT) {
					{
					_tail();
					setState(834);
					switch (_input.LA(1)) {
					case MT_properties_OPT:
						{
						_term();
						setState(830);
						match(MT_properties_OPT);
						}
						break;
					case ET_properties_OPT:
						{
						_embed();
						setState(832);
						match(ET_properties_OPT);
						setState(833);
						match(EMBED_END);
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
				setState(841);
				match(MT_properties_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(843);
				match(ET_properties_OPT);
				setState(844);
				match(EMBED_END);
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
		enterRule(_localctx, 78, RULE_properties_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			properties_OPT();
			setState(848);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 80, RULE_contractum);
		try {
			setState(859);
			switch (_input.LA(1)) {
			case MT_string_TOK:
			case ET_string_TOK:
			case MT_lbrace_TOK:
			case ET_lbrace_TOK:
			case MT_colon_TOK:
			case ET_colon_TOK:
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
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_literal:
			case ET_literal:
			case MT_number_TOK:
			case ET_number_TOK:
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
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_qualifier:
			case ET_qualifier:
			case DISPATCH:
			case COLON:
			case LPAR:
			case LBRACE:
			case AT:
			case CONSTRUCTOR:
			case VARIABLE:
			case METAVAR:
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(851);
				freeTerm();
				_exitAlt();
				}
				break;
			case MT_contractum:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(855);
				match(MT_contractum);
				}
				break;
			case ET_contractum:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(857);
				match(ET_contractum);
				setState(858);
				match(EMBED_END);
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
		enterRule(_localctx, 82, RULE_contractum_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			contractum();
			setState(862);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 84, RULE_annotations);
		try {
			setState(873);
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
				setState(865);
				annotation_OOM();
				_exitAlt();
				}
				break;
			case MT_annotations:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(869);
				match(MT_annotations);
				}
				break;
			case ET_annotations:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(871);
				match(ET_annotations);
				setState(872);
				match(EMBED_END);
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
		enterRule(_localctx, 86, RULE_annotations_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			annotations();
			setState(876);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 88, RULE_annotation_OOM);
		int _la;
		try {
			setState(903);
			switch (_input.LA(1)) {
			case MT_annotation:
			case ET_annotation:
			case MT_at_TOK:
			case ET_at_TOK:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				_enterOOM();
				setState(881); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(880);
					annotation();
					}
					}
					setState(883); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_annotation) | (1L << ET_annotation) | (1L << MT_at_TOK) | (1L << ET_at_TOK))) != 0) || _la==AT );
				setState(893);
				_la = _input.LA(1);
				if (_la==MT_annotation_OOM || _la==ET_annotation_OOM) {
					{
					_tail();
					setState(891);
					switch (_input.LA(1)) {
					case MT_annotation_OOM:
						{
						_term();
						setState(887);
						match(MT_annotation_OOM);
						}
						break;
					case ET_annotation_OOM:
						{
						_embed();
						setState(889);
						match(ET_annotation_OOM);
						setState(890);
						match(EMBED_END);
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
				setState(899);
				match(MT_annotation_OOM);
				}
				break;
			case ET_annotation_OOM:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(901);
				match(ET_annotation_OOM);
				setState(902);
				match(EMBED_END);
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
		enterRule(_localctx, 90, RULE_annotation_OOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			annotation_OOM();
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 92, RULE_annotation);
		try {
			setState(919);
			switch (_input.LA(1)) {
			case MT_at_TOK:
			case ET_at_TOK:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(909);
				at_TOK();
				setState(910);
				constructor();
				setState(911);
				arguments_OPT();
				_exitAlt();
				}
				break;
			case MT_annotation:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(915);
				match(MT_annotation);
				}
				break;
			case ET_annotation:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(917);
				match(ET_annotation);
				setState(918);
				match(EMBED_END);
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
		enterRule(_localctx, 94, RULE_annotation_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			annotation();
			setState(922);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 96, RULE_at_TOK);
		try {
			setState(932);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(925);
				match(AT);

				}
				break;
			case MT_at_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(928);
				match(MT_at_TOK);
				}
				break;
			case ET_at_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(930);
				match(ET_at_TOK);
				setState(931);
				match(EMBED_END);
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
		enterRule(_localctx, 98, RULE_at_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			at_TOK();
			setState(935);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 100, RULE_term);
		try {
			setState(950);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(938);
				freeTerm();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(942);
				boundTerm();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(946);
				match(MT_term);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(948);
				match(ET_term);
				setState(949);
				match(EMBED_END);
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
		enterRule(_localctx, 102, RULE_term_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			term();
			setState(953);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MT_freeTerm() { return getToken(CrsxMetaParser.MT_freeTerm, 0); }
		public TerminalNode ET_freeTerm() { return getToken(CrsxMetaParser.ET_freeTerm, 0); }
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 104, RULE_freeTerm);
		try {
			setState(1009);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(956);
				annotations_OPT();
				setState(957);
				constructor();
				setState(958);
				arguments_OPT();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(962);
				annotations_OPT();
				setState(963);
				constructor();
				setState(964);
				term();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(968);
				annotations_OPT();
				setState(969);
				literal();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(973);
				annotations_OPT();
				setState(974);
				list();
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				setState(978);
				annotations_OPT();
				setState(979);
				variable();
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_enterAlt("6");
				setState(983);
				annotations_OPT();
				setState(984);
				properties();
				setState(985);
				term();
				_exitAlt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				_enterAlt("7");
				setState(989);
				annotations_OPT();
				setState(990);
				properties();
				_exitAlt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				_enterAlt("8");
				setState(994);
				annotations_OPT();
				setState(995);
				metavar_TOK();
				setState(996);
				freeArguments_OPT();
				_exitAlt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				_enterAlt("9");
				setState(1000);
				annotations_OPT();
				setState(1001);
				expression();
				_exitAlt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				_term();
				setState(1005);
				match(MT_freeTerm);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				_embed();
				setState(1007);
				match(ET_freeTerm);
				setState(1008);
				match(EMBED_END);
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
		enterRule(_localctx, 106, RULE_freeTerm_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			freeTerm();
			setState(1012);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 108, RULE_annotations_OPT);
		int _la;
		try {
			setState(1036);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1017);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_annotations) | (1L << ET_annotations) | (1L << MT_annotation_OOM) | (1L << ET_annotation_OOM) | (1L << MT_annotation) | (1L << ET_annotation) | (1L << MT_at_TOK) | (1L << ET_at_TOK))) != 0) || _la==AT) {
					{
					setState(1016);
					annotations();
					}
				}

				setState(1027);
				_la = _input.LA(1);
				if (_la==MT_annotations_OPT || _la==ET_annotations_OPT) {
					{
					_tail();
					setState(1025);
					switch (_input.LA(1)) {
					case MT_annotations_OPT:
						{
						_term();
						setState(1021);
						match(MT_annotations_OPT);
						}
						break;
					case ET_annotations_OPT:
						{
						_embed();
						setState(1023);
						match(ET_annotations_OPT);
						setState(1024);
						match(EMBED_END);
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
				setState(1032);
				match(MT_annotations_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1034);
				match(ET_annotations_OPT);
				setState(1035);
				match(EMBED_END);
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
		enterRule(_localctx, 110, RULE_annotations_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			annotations_OPT();
			setState(1039);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 112, RULE_metavar_TOK);
		try {
			setState(1049);
			switch (_input.LA(1)) {
			case METAVAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1042);
				match(METAVAR);

				}
				break;
			case MT_metavar_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1045);
				match(MT_metavar_TOK);
				}
				break;
			case ET_metavar_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1047);
				match(ET_metavar_TOK);
				setState(1048);
				match(EMBED_END);
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
		enterRule(_localctx, 114, RULE_metavar_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			metavar_TOK();
			setState(1052);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 116, RULE_freeArguments_OPT);
		int _la;
		try {
			setState(1076);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1057);
				_la = _input.LA(1);
				if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (MT_lsquare_TOK - 69)) | (1L << (ET_lsquare_TOK - 69)) | (1L << (MT_freeArguments - 69)) | (1L << (ET_freeArguments - 69)))) != 0) || _la==LSQUARE) {
					{
					setState(1056);
					freeArguments();
					}
				}

				setState(1067);
				_la = _input.LA(1);
				if (_la==MT_freeArguments_OPT || _la==ET_freeArguments_OPT) {
					{
					_tail();
					setState(1065);
					switch (_input.LA(1)) {
					case MT_freeArguments_OPT:
						{
						_term();
						setState(1061);
						match(MT_freeArguments_OPT);
						}
						break;
					case ET_freeArguments_OPT:
						{
						_embed();
						setState(1063);
						match(ET_freeArguments_OPT);
						setState(1064);
						match(EMBED_END);
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
				setState(1072);
				match(MT_freeArguments_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1074);
				match(ET_freeArguments_OPT);
				setState(1075);
				match(EMBED_END);
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
		enterRule(_localctx, 118, RULE_freeArguments_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			freeArguments_OPT();
			setState(1079);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 120, RULE_boundTerm);
		try {
			setState(1091);
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
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_binder:
			case ET_binder:
			case AT:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1082);
				binder();
				setState(1083);
				nextBinder();
				_exitAlt();
				}
				break;
			case MT_boundTerm:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1087);
				match(MT_boundTerm);
				}
				break;
			case ET_boundTerm:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1089);
				match(ET_boundTerm);
				setState(1090);
				match(EMBED_END);
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
		enterRule(_localctx, 122, RULE_boundTerm_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			boundTerm();
			setState(1094);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 124, RULE_nextBinder);
		try {
			setState(1111);
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
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_binder:
			case ET_binder:
			case AT:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(1097);
				binder();
				setState(1098);
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
				setState(1102);
				dot_TOK();
				setState(1103);
				freeTerm();
				_exitAlt();
				}
				break;
			case MT_nextBinder:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(1107);
				match(MT_nextBinder);
				}
				break;
			case ET_nextBinder:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(1109);
				match(ET_nextBinder);
				setState(1110);
				match(EMBED_END);
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
		enterRule(_localctx, 126, RULE_nextBinder_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1113);
			nextBinder();
			setState(1114);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 128, RULE_dot_TOK);
		try {
			setState(1124);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1117);
				match(DOT);

				}
				break;
			case MT_dot_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1120);
				match(MT_dot_TOK);
				}
				break;
			case ET_dot_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1122);
				match(ET_dot_TOK);
				setState(1123);
				match(EMBED_END);
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
		enterRule(_localctx, 130, RULE_dot_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1126);
			dot_TOK();
			setState(1127);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 132, RULE_arguments);
		try {
			setState(1140);
			switch (_input.LA(1)) {
			case MT_lsquare_TOK:
			case ET_lsquare_TOK:
			case LSQUARE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1130);
				lsquare_TOK();
				setState(1131);
				terms_OPT();
				setState(1132);
				rsquare_TOK();
				_exitAlt();
				}
				break;
			case MT_arguments:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1136);
				match(MT_arguments);
				}
				break;
			case ET_arguments:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1138);
				match(ET_arguments);
				setState(1139);
				match(EMBED_END);
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
		enterRule(_localctx, 134, RULE_arguments_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
			arguments();
			setState(1143);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 136, RULE_lsquare_TOK);
		try {
			setState(1153);
			switch (_input.LA(1)) {
			case LSQUARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1146);
				match(LSQUARE);

				}
				break;
			case MT_lsquare_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1149);
				match(MT_lsquare_TOK);
				}
				break;
			case ET_lsquare_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1151);
				match(ET_lsquare_TOK);
				setState(1152);
				match(EMBED_END);
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
		enterRule(_localctx, 138, RULE_lsquare_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			lsquare_TOK();
			setState(1156);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 140, RULE_terms_OPT);
		int _la;
		try {
			setState(1180);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1161);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_string_TOK) | (1L << ET_string_TOK) | (1L << MT_lbrace_TOK) | (1L << ET_lbrace_TOK) | (1L << MT_colon_TOK) | (1L << ET_colon_TOK) | (1L << MT_annotations) | (1L << ET_annotations) | (1L << MT_annotation_OOM) | (1L << ET_annotation_OOM) | (1L << MT_annotation) | (1L << ET_annotation) | (1L << MT_at_TOK) | (1L << ET_at_TOK) | (1L << MT_term) | (1L << ET_term) | (1L << MT_freeTerm) | (1L << ET_freeTerm) | (1L << MT_annotations_OPT) | (1L << ET_annotations_OPT) | (1L << MT_metavar_TOK) | (1L << ET_metavar_TOK) | (1L << MT_boundTerm) | (1L << ET_boundTerm))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (MT_terms - 75)) | (1L << (ET_terms - 75)) | (1L << (MT_list - 75)) | (1L << (ET_list - 75)) | (1L << (MT_lpar_TOK - 75)) | (1L << (ET_lpar_TOK - 75)) | (1L << (MT_variable - 75)) | (1L << (ET_variable - 75)) | (1L << (MT_variable_TOK - 75)) | (1L << (ET_variable_TOK - 75)) | (1L << (MT_literal - 75)) | (1L << (ET_literal - 75)) | (1L << (MT_number_TOK - 75)) | (1L << (ET_number_TOK - 75)) | (1L << (MT_binder - 75)) | (1L << (ET_binder - 75)) | (1L << (MT_dispatch - 75)) | (1L << (ET_dispatch - 75)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (MT_dispatch_TOK - 139)) | (1L << (ET_dispatch_TOK - 139)) | (1L << (MT_properties - 139)) | (1L << (ET_properties - 139)) | (1L << (MT_expression - 139)) | (1L << (ET_expression - 139)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (MT_constructor - 217)) | (1L << (ET_constructor - 217)) | (1L << (MT_constructor_TOK - 217)) | (1L << (ET_constructor_TOK - 217)) | (1L << (MT_qualifier - 217)) | (1L << (ET_qualifier - 217)) | (1L << (DISPATCH - 217)) | (1L << (COLON - 217)) | (1L << (LPAR - 217)) | (1L << (LBRACE - 217)) | (1L << (AT - 217)) | (1L << (CONSTRUCTOR - 217)) | (1L << (VARIABLE - 217)) | (1L << (METAVAR - 217)) | (1L << (STRING - 217)) | (1L << (NUMBER - 217)))) != 0)) {
					{
					setState(1160);
					terms();
					}
				}

				setState(1171);
				_la = _input.LA(1);
				if (_la==MT_terms_OPT || _la==ET_terms_OPT) {
					{
					_tail();
					setState(1169);
					switch (_input.LA(1)) {
					case MT_terms_OPT:
						{
						_term();
						setState(1165);
						match(MT_terms_OPT);
						}
						break;
					case ET_terms_OPT:
						{
						_embed();
						setState(1167);
						match(ET_terms_OPT);
						setState(1168);
						match(EMBED_END);
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
				setState(1176);
				match(MT_terms_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1178);
				match(ET_terms_OPT);
				setState(1179);
				match(EMBED_END);
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
		enterRule(_localctx, 142, RULE_terms_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			terms_OPT();
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

	public static class Rsquare_TOKContext extends ParserRuleContext {
		public TerminalNode RSQUARE() { return getToken(CrsxMetaParser.RSQUARE, 0); }
		public TerminalNode MT_rsquare_TOK() { return getToken(CrsxMetaParser.MT_rsquare_TOK, 0); }
		public TerminalNode ET_rsquare_TOK() { return getToken(CrsxMetaParser.ET_rsquare_TOK, 0); }
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 144, RULE_rsquare_TOK);
		try {
			setState(1193);
			switch (_input.LA(1)) {
			case RSQUARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1186);
				match(RSQUARE);

				}
				break;
			case MT_rsquare_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1189);
				match(MT_rsquare_TOK);
				}
				break;
			case ET_rsquare_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1191);
				match(ET_rsquare_TOK);
				setState(1192);
				match(EMBED_END);
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
		enterRule(_localctx, 146, RULE_rsquare_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			rsquare_TOK();
			setState(1196);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 148, RULE_terms);
		try {
			setState(1208);
			switch (_input.LA(1)) {
			case MT_string_TOK:
			case ET_string_TOK:
			case MT_lbrace_TOK:
			case ET_lbrace_TOK:
			case MT_colon_TOK:
			case ET_colon_TOK:
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
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_literal:
			case ET_literal:
			case MT_number_TOK:
			case ET_number_TOK:
			case MT_binder:
			case ET_binder:
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
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_qualifier:
			case ET_qualifier:
			case DISPATCH:
			case COLON:
			case LPAR:
			case LBRACE:
			case AT:
			case CONSTRUCTOR:
			case VARIABLE:
			case METAVAR:
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1199);
				term();
				setState(1200);
				terms_S1_ZOM();
				_exitAlt();
				}
				break;
			case MT_terms:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1204);
				match(MT_terms);
				}
				break;
			case ET_terms:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1206);
				match(ET_terms);
				setState(1207);
				match(EMBED_END);
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
		enterRule(_localctx, 150, RULE_terms_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			terms();
			setState(1211);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 152, RULE_terms_S1_ZOM);
		int _la;
		try {
			setState(1238);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterZOM();
				setState(1218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (MT_terms_S1 - 79)) | (1L << (ET_terms_S1 - 79)) | (1L << (MT_comma_TOK - 79)) | (1L << (ET_comma_TOK - 79)))) != 0) || _la==COMMA) {
					{
					{
					setState(1215);
					terms_S1();
					}
					}
					setState(1220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1229);
				_la = _input.LA(1);
				if (_la==MT_terms_S1_ZOM || _la==ET_terms_S1_ZOM) {
					{
					_tail();
					setState(1227);
					switch (_input.LA(1)) {
					case MT_terms_S1_ZOM:
						{
						_term();
						setState(1223);
						match(MT_terms_S1_ZOM);
						}
						break;
					case ET_terms_S1_ZOM:
						{
						_embed();
						setState(1225);
						match(ET_terms_S1_ZOM);
						setState(1226);
						match(EMBED_END);
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
				setState(1234);
				match(MT_terms_S1_ZOM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1236);
				match(ET_terms_S1_ZOM);
				setState(1237);
				match(EMBED_END);
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
		enterRule(_localctx, 154, RULE_terms_S1_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			terms_S1_ZOM();
			setState(1241);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 156, RULE_terms_S1);
		try {
			setState(1253);
			switch (_input.LA(1)) {
			case MT_comma_TOK:
			case ET_comma_TOK:
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1244);
				comma_TOK();
				setState(1245);
				term();
				_exitAlt();
				}
				break;
			case MT_terms_S1:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1249);
				match(MT_terms_S1);
				}
				break;
			case ET_terms_S1:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1251);
				match(ET_terms_S1);
				setState(1252);
				match(EMBED_END);
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
		enterRule(_localctx, 158, RULE_terms_S1_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			terms_S1();
			setState(1256);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 160, RULE_comma_TOK);
		try {
			setState(1266);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1259);
				match(COMMA);

				}
				break;
			case MT_comma_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1262);
				match(MT_comma_TOK);
				}
				break;
			case ET_comma_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1264);
				match(ET_comma_TOK);
				setState(1265);
				match(EMBED_END);
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
		enterRule(_localctx, 162, RULE_comma_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			comma_TOK();
			setState(1269);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 164, RULE_freeArguments);
		try {
			setState(1282);
			switch (_input.LA(1)) {
			case MT_lsquare_TOK:
			case ET_lsquare_TOK:
			case LSQUARE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1272);
				lsquare_TOK();
				setState(1273);
				freeTerms_OPT();
				setState(1274);
				rsquare_TOK();
				_exitAlt();
				}
				break;
			case MT_freeArguments:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1278);
				match(MT_freeArguments);
				}
				break;
			case ET_freeArguments:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1280);
				match(ET_freeArguments);
				setState(1281);
				match(EMBED_END);
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
		enterRule(_localctx, 166, RULE_freeArguments_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284);
			freeArguments();
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

	public static class FreeTerms_OPTContext extends ParserRuleContext {
		public FreeTermsContext freeTerms() {
			return getRuleContext(FreeTermsContext.class,0);
		}
		public TerminalNode MT_freeTerms_OPT() { return getToken(CrsxMetaParser.MT_freeTerms_OPT, 0); }
		public TerminalNode ET_freeTerms_OPT() { return getToken(CrsxMetaParser.ET_freeTerms_OPT, 0); }
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 168, RULE_freeTerms_OPT);
		int _la;
		try {
			setState(1309);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1290);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_string_TOK) | (1L << ET_string_TOK) | (1L << MT_lbrace_TOK) | (1L << ET_lbrace_TOK) | (1L << MT_colon_TOK) | (1L << ET_colon_TOK) | (1L << MT_annotations) | (1L << ET_annotations) | (1L << MT_annotation_OOM) | (1L << ET_annotation_OOM) | (1L << MT_annotation) | (1L << ET_annotation) | (1L << MT_at_TOK) | (1L << ET_at_TOK) | (1L << MT_freeTerm) | (1L << ET_freeTerm) | (1L << MT_annotations_OPT) | (1L << ET_annotations_OPT) | (1L << MT_metavar_TOK) | (1L << ET_metavar_TOK))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (MT_freeTerms - 87)) | (1L << (ET_freeTerms - 87)) | (1L << (MT_list - 87)) | (1L << (ET_list - 87)) | (1L << (MT_lpar_TOK - 87)) | (1L << (ET_lpar_TOK - 87)) | (1L << (MT_variable - 87)) | (1L << (ET_variable - 87)) | (1L << (MT_variable_TOK - 87)) | (1L << (ET_variable_TOK - 87)) | (1L << (MT_literal - 87)) | (1L << (ET_literal - 87)) | (1L << (MT_number_TOK - 87)) | (1L << (ET_number_TOK - 87)) | (1L << (MT_dispatch - 87)) | (1L << (ET_dispatch - 87)) | (1L << (MT_dispatch_TOK - 87)) | (1L << (ET_dispatch_TOK - 87)))) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (MT_properties - 163)) | (1L << (ET_properties - 163)) | (1L << (MT_expression - 163)) | (1L << (ET_expression - 163)) | (1L << (MT_constructor - 163)) | (1L << (ET_constructor - 163)) | (1L << (MT_constructor_TOK - 163)) | (1L << (ET_constructor_TOK - 163)) | (1L << (MT_qualifier - 163)) | (1L << (ET_qualifier - 163)))) != 0) || ((((_la - 242)) & ~0x3f) == 0 && ((1L << (_la - 242)) & ((1L << (DISPATCH - 242)) | (1L << (COLON - 242)) | (1L << (LPAR - 242)) | (1L << (LBRACE - 242)) | (1L << (AT - 242)) | (1L << (CONSTRUCTOR - 242)) | (1L << (VARIABLE - 242)) | (1L << (METAVAR - 242)) | (1L << (STRING - 242)) | (1L << (NUMBER - 242)))) != 0)) {
					{
					setState(1289);
					freeTerms();
					}
				}

				setState(1300);
				_la = _input.LA(1);
				if (_la==MT_freeTerms_OPT || _la==ET_freeTerms_OPT) {
					{
					_tail();
					setState(1298);
					switch (_input.LA(1)) {
					case MT_freeTerms_OPT:
						{
						_term();
						setState(1294);
						match(MT_freeTerms_OPT);
						}
						break;
					case ET_freeTerms_OPT:
						{
						_embed();
						setState(1296);
						match(ET_freeTerms_OPT);
						setState(1297);
						match(EMBED_END);
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
				setState(1305);
				match(MT_freeTerms_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1307);
				match(ET_freeTerms_OPT);
				setState(1308);
				match(EMBED_END);
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
		enterRule(_localctx, 170, RULE_freeTerms_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
			freeTerms_OPT();
			setState(1312);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 172, RULE_freeTerms);
		try {
			setState(1324);
			switch (_input.LA(1)) {
			case MT_string_TOK:
			case ET_string_TOK:
			case MT_lbrace_TOK:
			case ET_lbrace_TOK:
			case MT_colon_TOK:
			case ET_colon_TOK:
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
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_literal:
			case ET_literal:
			case MT_number_TOK:
			case ET_number_TOK:
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
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_qualifier:
			case ET_qualifier:
			case DISPATCH:
			case COLON:
			case LPAR:
			case LBRACE:
			case AT:
			case CONSTRUCTOR:
			case VARIABLE:
			case METAVAR:
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1315);
				freeTerm();
				setState(1316);
				freeTerms_S1_ZOM();
				_exitAlt();
				}
				break;
			case MT_freeTerms:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1320);
				match(MT_freeTerms);
				}
				break;
			case ET_freeTerms:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1322);
				match(ET_freeTerms);
				setState(1323);
				match(EMBED_END);
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
		enterRule(_localctx, 174, RULE_freeTerms_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			freeTerms();
			setState(1327);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 176, RULE_freeTerms_S1_ZOM);
		int _la;
		try {
			setState(1354);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterZOM();
				setState(1334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (MT_comma_TOK - 81)) | (1L << (ET_comma_TOK - 81)) | (1L << (MT_freeTerms_S1 - 81)) | (1L << (ET_freeTerms_S1 - 81)))) != 0) || _la==COMMA) {
					{
					{
					setState(1331);
					freeTerms_S1();
					}
					}
					setState(1336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1345);
				_la = _input.LA(1);
				if (_la==MT_freeTerms_S1_ZOM || _la==ET_freeTerms_S1_ZOM) {
					{
					_tail();
					setState(1343);
					switch (_input.LA(1)) {
					case MT_freeTerms_S1_ZOM:
						{
						_term();
						setState(1339);
						match(MT_freeTerms_S1_ZOM);
						}
						break;
					case ET_freeTerms_S1_ZOM:
						{
						_embed();
						setState(1341);
						match(ET_freeTerms_S1_ZOM);
						setState(1342);
						match(EMBED_END);
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
				setState(1350);
				match(MT_freeTerms_S1_ZOM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1352);
				match(ET_freeTerms_S1_ZOM);
				setState(1353);
				match(EMBED_END);
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
		enterRule(_localctx, 178, RULE_freeTerms_S1_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1356);
			freeTerms_S1_ZOM();
			setState(1357);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 180, RULE_freeTerms_S1);
		try {
			setState(1369);
			switch (_input.LA(1)) {
			case MT_comma_TOK:
			case ET_comma_TOK:
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1360);
				comma_TOK();
				setState(1361);
				freeTerm();
				_exitAlt();
				}
				break;
			case MT_freeTerms_S1:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1365);
				match(MT_freeTerms_S1);
				}
				break;
			case ET_freeTerms_S1:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1367);
				match(ET_freeTerms_S1);
				setState(1368);
				match(EMBED_END);
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
		enterRule(_localctx, 182, RULE_freeTerms_S1_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			freeTerms_S1();
			setState(1372);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 184, RULE_list);
		try {
			setState(1385);
			switch (_input.LA(1)) {
			case MT_lpar_TOK:
			case ET_lpar_TOK:
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1375);
				lpar_TOK();
				setState(1376);
				termList_OPT();
				setState(1377);
				rpar_TOK();
				_exitAlt();
				}
				break;
			case MT_list:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1381);
				match(MT_list);
				}
				break;
			case ET_list:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1383);
				match(ET_list);
				setState(1384);
				match(EMBED_END);
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
		enterRule(_localctx, 186, RULE_list_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1387);
			list();
			setState(1388);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 188, RULE_lpar_TOK);
		try {
			setState(1398);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1391);
				match(LPAR);

				}
				break;
			case MT_lpar_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1394);
				match(MT_lpar_TOK);
				}
				break;
			case ET_lpar_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1396);
				match(ET_lpar_TOK);
				setState(1397);
				match(EMBED_END);
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
		enterRule(_localctx, 190, RULE_lpar_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1400);
			lpar_TOK();
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

	public static class TermList_OPTContext extends ParserRuleContext {
		public TermListContext termList() {
			return getRuleContext(TermListContext.class,0);
		}
		public TerminalNode MT_termList_OPT() { return getToken(CrsxMetaParser.MT_termList_OPT, 0); }
		public TerminalNode ET_termList_OPT() { return getToken(CrsxMetaParser.ET_termList_OPT, 0); }
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 192, RULE_termList_OPT);
		int _la;
		try {
			setState(1425);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1406);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_string_TOK) | (1L << ET_string_TOK) | (1L << MT_lbrace_TOK) | (1L << ET_lbrace_TOK) | (1L << MT_colon_TOK) | (1L << ET_colon_TOK) | (1L << MT_annotations) | (1L << ET_annotations) | (1L << MT_annotation_OOM) | (1L << ET_annotation_OOM) | (1L << MT_annotation) | (1L << ET_annotation) | (1L << MT_at_TOK) | (1L << ET_at_TOK) | (1L << MT_term) | (1L << ET_term) | (1L << MT_freeTerm) | (1L << ET_freeTerm) | (1L << MT_annotations_OPT) | (1L << ET_annotations_OPT) | (1L << MT_metavar_TOK) | (1L << ET_metavar_TOK) | (1L << MT_boundTerm) | (1L << ET_boundTerm))) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (MT_list - 93)) | (1L << (ET_list - 93)) | (1L << (MT_lpar_TOK - 93)) | (1L << (ET_lpar_TOK - 93)) | (1L << (MT_termList - 93)) | (1L << (ET_termList - 93)) | (1L << (MT_variable - 93)) | (1L << (ET_variable - 93)) | (1L << (MT_variable_TOK - 93)) | (1L << (ET_variable_TOK - 93)) | (1L << (MT_literal - 93)) | (1L << (ET_literal - 93)) | (1L << (MT_number_TOK - 93)) | (1L << (ET_number_TOK - 93)) | (1L << (MT_binder - 93)) | (1L << (ET_binder - 93)) | (1L << (MT_dispatch - 93)) | (1L << (ET_dispatch - 93)) | (1L << (MT_dispatch_TOK - 93)) | (1L << (ET_dispatch_TOK - 93)))) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (MT_properties - 163)) | (1L << (ET_properties - 163)) | (1L << (MT_expression - 163)) | (1L << (ET_expression - 163)) | (1L << (MT_constructor - 163)) | (1L << (ET_constructor - 163)) | (1L << (MT_constructor_TOK - 163)) | (1L << (ET_constructor_TOK - 163)) | (1L << (MT_qualifier - 163)) | (1L << (ET_qualifier - 163)))) != 0) || ((((_la - 242)) & ~0x3f) == 0 && ((1L << (_la - 242)) & ((1L << (DISPATCH - 242)) | (1L << (COLON - 242)) | (1L << (LPAR - 242)) | (1L << (LBRACE - 242)) | (1L << (AT - 242)) | (1L << (CONSTRUCTOR - 242)) | (1L << (VARIABLE - 242)) | (1L << (METAVAR - 242)) | (1L << (STRING - 242)) | (1L << (NUMBER - 242)))) != 0)) {
					{
					setState(1405);
					termList();
					}
				}

				setState(1416);
				_la = _input.LA(1);
				if (_la==MT_termList_OPT || _la==ET_termList_OPT) {
					{
					_tail();
					setState(1414);
					switch (_input.LA(1)) {
					case MT_termList_OPT:
						{
						_term();
						setState(1410);
						match(MT_termList_OPT);
						}
						break;
					case ET_termList_OPT:
						{
						_embed();
						setState(1412);
						match(ET_termList_OPT);
						setState(1413);
						match(EMBED_END);
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
				setState(1421);
				match(MT_termList_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1423);
				match(ET_termList_OPT);
				setState(1424);
				match(EMBED_END);
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
		enterRule(_localctx, 194, RULE_termList_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
			termList_OPT();
			setState(1428);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 196, RULE_rpar_TOK);
		try {
			setState(1438);
			switch (_input.LA(1)) {
			case RPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1431);
				match(RPAR);

				}
				break;
			case MT_rpar_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1434);
				match(MT_rpar_TOK);
				}
				break;
			case ET_rpar_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1436);
				match(ET_rpar_TOK);
				setState(1437);
				match(EMBED_END);
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
		enterRule(_localctx, 198, RULE_rpar_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1440);
			rpar_TOK();
			setState(1441);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 200, RULE_termList);
		try {
			setState(1453);
			switch (_input.LA(1)) {
			case MT_string_TOK:
			case ET_string_TOK:
			case MT_lbrace_TOK:
			case ET_lbrace_TOK:
			case MT_colon_TOK:
			case ET_colon_TOK:
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
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_literal:
			case ET_literal:
			case MT_number_TOK:
			case ET_number_TOK:
			case MT_binder:
			case ET_binder:
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
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_qualifier:
			case ET_qualifier:
			case DISPATCH:
			case COLON:
			case LPAR:
			case LBRACE:
			case AT:
			case CONSTRUCTOR:
			case VARIABLE:
			case METAVAR:
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1444);
				term();
				setState(1445);
				termList_S1_ZOM();
				_exitAlt();
				}
				break;
			case MT_termList:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1449);
				match(MT_termList);
				}
				break;
			case ET_termList:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1451);
				match(ET_termList);
				setState(1452);
				match(EMBED_END);
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
		enterRule(_localctx, 202, RULE_termList_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1455);
			termList();
			setState(1456);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 204, RULE_termList_S1_ZOM);
		int _la;
		try {
			setState(1483);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterZOM();
				setState(1463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MT_semi_TOK || _la==ET_semi_TOK || _la==MT_termList_S1 || _la==ET_termList_S1 || _la==SEMI) {
					{
					{
					setState(1460);
					termList_S1();
					}
					}
					setState(1465);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1474);
				_la = _input.LA(1);
				if (_la==MT_termList_S1_ZOM || _la==ET_termList_S1_ZOM) {
					{
					_tail();
					setState(1472);
					switch (_input.LA(1)) {
					case MT_termList_S1_ZOM:
						{
						_term();
						setState(1468);
						match(MT_termList_S1_ZOM);
						}
						break;
					case ET_termList_S1_ZOM:
						{
						_embed();
						setState(1470);
						match(ET_termList_S1_ZOM);
						setState(1471);
						match(EMBED_END);
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
				setState(1479);
				match(MT_termList_S1_ZOM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1481);
				match(ET_termList_S1_ZOM);
				setState(1482);
				match(EMBED_END);
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
		enterRule(_localctx, 206, RULE_termList_S1_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1485);
			termList_S1_ZOM();
			setState(1486);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 208, RULE_termList_S1);
		try {
			setState(1498);
			switch (_input.LA(1)) {
			case MT_semi_TOK:
			case ET_semi_TOK:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1489);
				semi_TOK();
				setState(1490);
				term_OPT();
				_exitAlt();
				}
				break;
			case MT_termList_S1:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1494);
				match(MT_termList_S1);
				}
				break;
			case ET_termList_S1:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1496);
				match(ET_termList_S1);
				setState(1497);
				match(EMBED_END);
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
		enterRule(_localctx, 210, RULE_termList_S1_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			termList_S1();
			setState(1501);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 212, RULE_term_OPT);
		int _la;
		try {
			setState(1525);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1506);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_string_TOK) | (1L << ET_string_TOK) | (1L << MT_lbrace_TOK) | (1L << ET_lbrace_TOK) | (1L << MT_colon_TOK) | (1L << ET_colon_TOK) | (1L << MT_annotations) | (1L << ET_annotations) | (1L << MT_annotation_OOM) | (1L << ET_annotation_OOM) | (1L << MT_annotation) | (1L << ET_annotation) | (1L << MT_at_TOK) | (1L << ET_at_TOK) | (1L << MT_term) | (1L << ET_term) | (1L << MT_freeTerm) | (1L << ET_freeTerm) | (1L << MT_annotations_OPT) | (1L << ET_annotations_OPT) | (1L << MT_metavar_TOK) | (1L << ET_metavar_TOK) | (1L << MT_boundTerm) | (1L << ET_boundTerm))) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (MT_list - 93)) | (1L << (ET_list - 93)) | (1L << (MT_lpar_TOK - 93)) | (1L << (ET_lpar_TOK - 93)) | (1L << (MT_variable - 93)) | (1L << (ET_variable - 93)) | (1L << (MT_variable_TOK - 93)) | (1L << (ET_variable_TOK - 93)) | (1L << (MT_literal - 93)) | (1L << (ET_literal - 93)) | (1L << (MT_number_TOK - 93)) | (1L << (ET_number_TOK - 93)) | (1L << (MT_binder - 93)) | (1L << (ET_binder - 93)) | (1L << (MT_dispatch - 93)) | (1L << (ET_dispatch - 93)) | (1L << (MT_dispatch_TOK - 93)) | (1L << (ET_dispatch_TOK - 93)))) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (MT_properties - 163)) | (1L << (ET_properties - 163)) | (1L << (MT_expression - 163)) | (1L << (ET_expression - 163)) | (1L << (MT_constructor - 163)) | (1L << (ET_constructor - 163)) | (1L << (MT_constructor_TOK - 163)) | (1L << (ET_constructor_TOK - 163)) | (1L << (MT_qualifier - 163)) | (1L << (ET_qualifier - 163)))) != 0) || ((((_la - 242)) & ~0x3f) == 0 && ((1L << (_la - 242)) & ((1L << (DISPATCH - 242)) | (1L << (COLON - 242)) | (1L << (LPAR - 242)) | (1L << (LBRACE - 242)) | (1L << (AT - 242)) | (1L << (CONSTRUCTOR - 242)) | (1L << (VARIABLE - 242)) | (1L << (METAVAR - 242)) | (1L << (STRING - 242)) | (1L << (NUMBER - 242)))) != 0)) {
					{
					setState(1505);
					term();
					}
				}

				setState(1516);
				_la = _input.LA(1);
				if (_la==MT_term_OPT || _la==ET_term_OPT) {
					{
					_tail();
					setState(1514);
					switch (_input.LA(1)) {
					case MT_term_OPT:
						{
						_term();
						setState(1510);
						match(MT_term_OPT);
						}
						break;
					case ET_term_OPT:
						{
						_embed();
						setState(1512);
						match(ET_term_OPT);
						setState(1513);
						match(EMBED_END);
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
				setState(1521);
				match(MT_term_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1523);
				match(ET_term_OPT);
				setState(1524);
				match(EMBED_END);
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
		enterRule(_localctx, 214, RULE_term_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1527);
			term_OPT();
			setState(1528);
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
		public Variable_TOKContext variable_TOK() {
			return getRuleContext(Variable_TOKContext.class,0);
		}
		public Linear_OPTContext linear_OPT() {
			return getRuleContext(Linear_OPTContext.class,0);
		}
		public Functional_OPTContext functional_OPT() {
			return getRuleContext(Functional_OPTContext.class,0);
		}
		public Varsort_OPTContext varsort_OPT() {
			return getRuleContext(Varsort_OPTContext.class,0);
		}
		public TerminalNode MT_variable() { return getToken(CrsxMetaParser.MT_variable, 0); }
		public TerminalNode ET_variable() { return getToken(CrsxMetaParser.ET_variable, 0); }
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 216, RULE_variable);
		try {
			setState(1542);
			switch (_input.LA(1)) {
			case MT_variable_TOK:
			case ET_variable_TOK:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1531);
				variable_TOK();
				setState(1532);
				linear_OPT();
				setState(1533);
				functional_OPT();
				setState(1534);
				varsort_OPT();
				_exitAlt();
				}
				break;
			case MT_variable:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1538);
				match(MT_variable);
				}
				break;
			case ET_variable:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1540);
				match(ET_variable);
				setState(1541);
				match(EMBED_END);
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
		enterRule(_localctx, 218, RULE_variable_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1544);
			variable();
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

	public static class Variable_TOKContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(CrsxMetaParser.VARIABLE, 0); }
		public TerminalNode MT_variable_TOK() { return getToken(CrsxMetaParser.MT_variable_TOK, 0); }
		public TerminalNode ET_variable_TOK() { return getToken(CrsxMetaParser.ET_variable_TOK, 0); }
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 220, RULE_variable_TOK);
		try {
			setState(1555);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1548);
				match(VARIABLE);

				}
				break;
			case MT_variable_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1551);
				match(MT_variable_TOK);
				}
				break;
			case ET_variable_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1553);
				match(ET_variable_TOK);
				setState(1554);
				match(EMBED_END);
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
		enterRule(_localctx, 222, RULE_variable_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1557);
			variable_TOK();
			setState(1558);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 224, RULE_linear_OPT);
		int _la;
		try {
			setState(1582);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1563);
				_la = _input.LA(1);
				if (((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (MT_linear - 119)) | (1L << (ET_linear - 119)) | (1L << (MT_linear_TOK - 119)) | (1L << (ET_linear_TOK - 119)))) != 0) || _la==LINEAR) {
					{
					setState(1562);
					linear();
					}
				}

				setState(1573);
				_la = _input.LA(1);
				if (_la==MT_linear_OPT || _la==ET_linear_OPT) {
					{
					_tail();
					setState(1571);
					switch (_input.LA(1)) {
					case MT_linear_OPT:
						{
						_term();
						setState(1567);
						match(MT_linear_OPT);
						}
						break;
					case ET_linear_OPT:
						{
						_embed();
						setState(1569);
						match(ET_linear_OPT);
						setState(1570);
						match(EMBED_END);
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
				setState(1578);
				match(MT_linear_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1580);
				match(ET_linear_OPT);
				setState(1581);
				match(EMBED_END);
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
		enterRule(_localctx, 226, RULE_linear_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			linear_OPT();
			setState(1585);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 228, RULE_functional_OPT);
		int _la;
		try {
			setState(1609);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1590);
				_la = _input.LA(1);
				if (((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (MT_functional - 123)) | (1L << (ET_functional - 123)) | (1L << (MT_functional_TOK - 123)) | (1L << (ET_functional_TOK - 123)))) != 0) || _la==FUNCTIONAL) {
					{
					setState(1589);
					functional();
					}
				}

				setState(1600);
				_la = _input.LA(1);
				if (_la==MT_functional_OPT || _la==ET_functional_OPT) {
					{
					_tail();
					setState(1598);
					switch (_input.LA(1)) {
					case MT_functional_OPT:
						{
						_term();
						setState(1594);
						match(MT_functional_OPT);
						}
						break;
					case ET_functional_OPT:
						{
						_embed();
						setState(1596);
						match(ET_functional_OPT);
						setState(1597);
						match(EMBED_END);
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
				setState(1605);
				match(MT_functional_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1607);
				match(ET_functional_OPT);
				setState(1608);
				match(EMBED_END);
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
		enterRule(_localctx, 230, RULE_functional_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1611);
			functional_OPT();
			setState(1612);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 232, RULE_varsort_OPT);
		int _la;
		try {
			setState(1636);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1617);
				_la = _input.LA(1);
				if (((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (MT_varsort - 133)) | (1L << (ET_varsort - 133)) | (1L << (MT_coloncolon_TOK - 133)) | (1L << (ET_coloncolon_TOK - 133)))) != 0) || _la==COLONCOLON) {
					{
					setState(1616);
					varsort();
					}
				}

				setState(1627);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					_tail();
					setState(1625);
					switch (_input.LA(1)) {
					case MT_varsort_OPT:
						{
						_term();
						setState(1621);
						match(MT_varsort_OPT);
						}
						break;
					case ET_varsort_OPT:
						{
						_embed();
						setState(1623);
						match(ET_varsort_OPT);
						setState(1624);
						match(EMBED_END);
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
				setState(1632);
				match(MT_varsort_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1634);
				match(ET_varsort_OPT);
				setState(1635);
				match(EMBED_END);
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
		enterRule(_localctx, 234, RULE_varsort_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1638);
			varsort_OPT();
			setState(1639);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 236, RULE_linear);
		try {
			setState(1650);
			switch (_input.LA(1)) {
			case MT_linear_TOK:
			case ET_linear_TOK:
			case LINEAR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1642);
				linear_TOK();
				_exitAlt();
				}
				break;
			case MT_linear:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1646);
				match(MT_linear);
				}
				break;
			case ET_linear:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1648);
				match(ET_linear);
				setState(1649);
				match(EMBED_END);
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
		enterRule(_localctx, 238, RULE_linear_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1652);
			linear();
			setState(1653);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 240, RULE_linear_TOK);
		try {
			setState(1663);
			switch (_input.LA(1)) {
			case LINEAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1656);
				match(LINEAR);

				}
				break;
			case MT_linear_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1659);
				match(MT_linear_TOK);
				}
				break;
			case ET_linear_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1661);
				match(ET_linear_TOK);
				setState(1662);
				match(EMBED_END);
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
		enterRule(_localctx, 242, RULE_linear_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1665);
			linear_TOK();
			setState(1666);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 244, RULE_functional);
		try {
			setState(1677);
			switch (_input.LA(1)) {
			case MT_functional_TOK:
			case ET_functional_TOK:
			case FUNCTIONAL:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1669);
				functional_TOK();
				_exitAlt();
				}
				break;
			case MT_functional:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1673);
				match(MT_functional);
				}
				break;
			case ET_functional:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1675);
				match(ET_functional);
				setState(1676);
				match(EMBED_END);
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
		enterRule(_localctx, 246, RULE_functional_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1679);
			functional();
			setState(1680);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 248, RULE_functional_TOK);
		try {
			setState(1690);
			switch (_input.LA(1)) {
			case FUNCTIONAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1683);
				match(FUNCTIONAL);

				}
				break;
			case MT_functional_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1686);
				match(MT_functional_TOK);
				}
				break;
			case ET_functional_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1688);
				match(ET_functional_TOK);
				setState(1689);
				match(EMBED_END);
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
		enterRule(_localctx, 250, RULE_functional_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1692);
			functional_TOK();
			setState(1693);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 252, RULE_literal);
		try {
			setState(1708);
			switch (_input.LA(1)) {
			case MT_string_TOK:
			case ET_string_TOK:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(1696);
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
				setState(1700);
				number_TOK();
				_exitAlt();
				}
				break;
			case MT_literal:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(1704);
				match(MT_literal);
				}
				break;
			case ET_literal:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(1706);
				match(ET_literal);
				setState(1707);
				match(EMBED_END);
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
		enterRule(_localctx, 254, RULE_literal_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1710);
			literal();
			setState(1711);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 256, RULE_number_TOK);
		try {
			setState(1721);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1714);
				match(NUMBER);

				}
				break;
			case MT_number_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1717);
				match(MT_number_TOK);
				}
				break;
			case ET_number_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1719);
				match(ET_number_TOK);
				setState(1720);
				match(EMBED_END);
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
		enterRule(_localctx, 258, RULE_number_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1723);
			number_TOK();
			setState(1724);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 260, RULE_binder);
		try {
			setState(1736);
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
			case MT_variable_TOK:
			case ET_variable_TOK:
			case AT:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1727);
				annotations_OPT();
				setState(1728);
				variable();
				_exitAlt();
				}
				break;
			case MT_binder:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1732);
				match(MT_binder);
				}
				break;
			case ET_binder:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1734);
				match(ET_binder);
				setState(1735);
				match(EMBED_END);
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
		enterRule(_localctx, 262, RULE_binder_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1738);
			binder();
			setState(1739);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 264, RULE_varsort);
		try {
			setState(1751);
			switch (_input.LA(1)) {
			case MT_coloncolon_TOK:
			case ET_coloncolon_TOK:
			case COLONCOLON:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1742);
				coloncolon_TOK();
				setState(1743);
				sortname();
				_exitAlt();
				}
				break;
			case MT_varsort:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1747);
				match(MT_varsort);
				}
				break;
			case ET_varsort:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1749);
				match(ET_varsort);
				setState(1750);
				match(EMBED_END);
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
		enterRule(_localctx, 266, RULE_varsort_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1753);
			varsort();
			setState(1754);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 268, RULE_coloncolon_TOK);
		try {
			setState(1764);
			switch (_input.LA(1)) {
			case COLONCOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1757);
				match(COLONCOLON);

				}
				break;
			case MT_coloncolon_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1760);
				match(MT_coloncolon_TOK);
				}
				break;
			case ET_coloncolon_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1762);
				match(ET_coloncolon_TOK);
				setState(1763);
				match(EMBED_END);
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
		enterRule(_localctx, 270, RULE_coloncolon_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766);
			coloncolon_TOK();
			setState(1767);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 272, RULE_dispatch);
		try {
			setState(1781);
			switch (_input.LA(1)) {
			case MT_dispatch_TOK:
			case ET_dispatch_TOK:
			case DISPATCH:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1770);
				dispatch_TOK();
				setState(1771);
				dispatchTerm();
				setState(1772);
				dispatchCases();
				setState(1773);
				delayCase_OPT();
				_exitAlt();
				}
				break;
			case MT_dispatch:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1777);
				match(MT_dispatch);
				}
				break;
			case ET_dispatch:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1779);
				match(ET_dispatch);
				setState(1780);
				match(EMBED_END);
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
		enterRule(_localctx, 274, RULE_dispatch_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1783);
			dispatch();
			setState(1784);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 276, RULE_dispatch_TOK);
		try {
			setState(1794);
			switch (_input.LA(1)) {
			case DISPATCH:
				enterOuterAlt(_localctx, 1);
				{
				setState(1787);
				match(DISPATCH);

				}
				break;
			case MT_dispatch_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1790);
				match(MT_dispatch_TOK);
				}
				break;
			case ET_dispatch_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1792);
				match(ET_dispatch_TOK);
				setState(1793);
				match(EMBED_END);
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
		enterRule(_localctx, 278, RULE_dispatch_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1796);
			dispatch_TOK();
			setState(1797);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 280, RULE_delayCase_OPT);
		try {
			setState(1821);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1802);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1801);
					delayCase();
					}
					break;
				}
				setState(1812);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					_tail();
					setState(1810);
					switch (_input.LA(1)) {
					case MT_delayCase_OPT:
						{
						_term();
						setState(1806);
						match(MT_delayCase_OPT);
						}
						break;
					case ET_delayCase_OPT:
						{
						_embed();
						setState(1808);
						match(ET_delayCase_OPT);
						setState(1809);
						match(EMBED_END);
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
				setState(1817);
				match(MT_delayCase_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1819);
				match(ET_delayCase_OPT);
				setState(1820);
				match(EMBED_END);
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
		enterRule(_localctx, 282, RULE_delayCase_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1823);
			delayCase_OPT();
			setState(1824);
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public DispatchTerm_S1_ZOMContext dispatchTerm_S1_ZOM() {
			return getRuleContext(DispatchTerm_S1_ZOMContext.class,0);
		}
		public TerminalNode MT_dispatchTerm() { return getToken(CrsxMetaParser.MT_dispatchTerm, 0); }
		public TerminalNode ET_dispatchTerm() { return getToken(CrsxMetaParser.ET_dispatchTerm, 0); }
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 284, RULE_dispatchTerm);
		try {
			setState(1836);
			switch (_input.LA(1)) {
			case MT_string_TOK:
			case ET_string_TOK:
			case MT_lbrace_TOK:
			case ET_lbrace_TOK:
			case MT_colon_TOK:
			case ET_colon_TOK:
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
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_literal:
			case ET_literal:
			case MT_number_TOK:
			case ET_number_TOK:
			case MT_binder:
			case ET_binder:
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
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_qualifier:
			case ET_qualifier:
			case DISPATCH:
			case COLON:
			case LPAR:
			case LBRACE:
			case AT:
			case CONSTRUCTOR:
			case VARIABLE:
			case METAVAR:
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1827);
				term();
				setState(1828);
				dispatchTerm_S1_ZOM();
				_exitAlt();
				}
				break;
			case MT_dispatchTerm:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1832);
				match(MT_dispatchTerm);
				}
				break;
			case ET_dispatchTerm:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1834);
				match(ET_dispatchTerm);
				setState(1835);
				match(EMBED_END);
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
		enterRule(_localctx, 286, RULE_dispatchTerm_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1838);
			dispatchTerm();
			setState(1839);
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

	public static class DispatchTerm_S1_ZOMContext extends ParserRuleContext {
		public List<DispatchTerm_S1Context> dispatchTerm_S1() {
			return getRuleContexts(DispatchTerm_S1Context.class);
		}
		public DispatchTerm_S1Context dispatchTerm_S1(int i) {
			return getRuleContext(DispatchTerm_S1Context.class,i);
		}
		public TerminalNode MT_dispatchTerm_S1_ZOM() { return getToken(CrsxMetaParser.MT_dispatchTerm_S1_ZOM, 0); }
		public TerminalNode ET_dispatchTerm_S1_ZOM() { return getToken(CrsxMetaParser.ET_dispatchTerm_S1_ZOM, 0); }
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
		public DispatchTerm_S1_ZOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatchTerm_S1_ZOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDispatchTerm_S1_ZOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDispatchTerm_S1_ZOM(this);
		}
	}

	public final DispatchTerm_S1_ZOMContext dispatchTerm_S1_ZOM() throws RecognitionException {
		DispatchTerm_S1_ZOMContext _localctx = new DispatchTerm_S1_ZOMContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_dispatchTerm_S1_ZOM);
		int _la;
		try {
			setState(1866);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterZOM();
				setState(1846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & ((1L << (MT_dispatchTerm_S1 - 147)) | (1L << (ET_dispatchTerm_S1 - 147)) | (1L << (MT_and_TOK - 147)) | (1L << (ET_and_TOK - 147)))) != 0) || _la==AND) {
					{
					{
					setState(1843);
					dispatchTerm_S1();
					}
					}
					setState(1848);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1857);
				_la = _input.LA(1);
				if (_la==MT_dispatchTerm_S1_ZOM || _la==ET_dispatchTerm_S1_ZOM) {
					{
					_tail();
					setState(1855);
					switch (_input.LA(1)) {
					case MT_dispatchTerm_S1_ZOM:
						{
						_term();
						setState(1851);
						match(MT_dispatchTerm_S1_ZOM);
						}
						break;
					case ET_dispatchTerm_S1_ZOM:
						{
						_embed();
						setState(1853);
						match(ET_dispatchTerm_S1_ZOM);
						setState(1854);
						match(EMBED_END);
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
				setState(1862);
				match(MT_dispatchTerm_S1_ZOM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1864);
				match(ET_dispatchTerm_S1_ZOM);
				setState(1865);
				match(EMBED_END);
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

	public static class DispatchTerm_S1_ZOM_EOFContext extends ParserRuleContext {
		public DispatchTerm_S1_ZOMContext dispatchTerm_S1_ZOM() {
			return getRuleContext(DispatchTerm_S1_ZOMContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public DispatchTerm_S1_ZOM_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatchTerm_S1_ZOM_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDispatchTerm_S1_ZOM_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDispatchTerm_S1_ZOM_EOF(this);
		}
	}

	public final DispatchTerm_S1_ZOM_EOFContext dispatchTerm_S1_ZOM_EOF() throws RecognitionException {
		DispatchTerm_S1_ZOM_EOFContext _localctx = new DispatchTerm_S1_ZOM_EOFContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_dispatchTerm_S1_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1868);
			dispatchTerm_S1_ZOM();
			setState(1869);
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

	public static class DispatchTerm_S1Context extends ParserRuleContext {
		public And_TOKContext and_TOK() {
			return getRuleContext(And_TOKContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MT_dispatchTerm_S1() { return getToken(CrsxMetaParser.MT_dispatchTerm_S1, 0); }
		public TerminalNode ET_dispatchTerm_S1() { return getToken(CrsxMetaParser.ET_dispatchTerm_S1, 0); }
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
		public DispatchTerm_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatchTerm_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDispatchTerm_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDispatchTerm_S1(this);
		}
	}

	public final DispatchTerm_S1Context dispatchTerm_S1() throws RecognitionException {
		DispatchTerm_S1Context _localctx = new DispatchTerm_S1Context(_ctx, getState());
		enterRule(_localctx, 292, RULE_dispatchTerm_S1);
		try {
			setState(1881);
			switch (_input.LA(1)) {
			case MT_and_TOK:
			case ET_and_TOK:
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1872);
				and_TOK();
				setState(1873);
				term();
				_exitAlt();
				}
				break;
			case MT_dispatchTerm_S1:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1877);
				match(MT_dispatchTerm_S1);
				}
				break;
			case ET_dispatchTerm_S1:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1879);
				match(ET_dispatchTerm_S1);
				setState(1880);
				match(EMBED_END);
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

	public static class DispatchTerm_S1_EOFContext extends ParserRuleContext {
		public DispatchTerm_S1Context dispatchTerm_S1() {
			return getRuleContext(DispatchTerm_S1Context.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public DispatchTerm_S1_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatchTerm_S1_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDispatchTerm_S1_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDispatchTerm_S1_EOF(this);
		}
	}

	public final DispatchTerm_S1_EOFContext dispatchTerm_S1_EOF() throws RecognitionException {
		DispatchTerm_S1_EOFContext _localctx = new DispatchTerm_S1_EOFContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_dispatchTerm_S1_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1883);
			dispatchTerm_S1();
			setState(1884);
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

	public static class And_TOKContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(CrsxMetaParser.AND, 0); }
		public TerminalNode MT_and_TOK() { return getToken(CrsxMetaParser.MT_and_TOK, 0); }
		public TerminalNode ET_and_TOK() { return getToken(CrsxMetaParser.ET_and_TOK, 0); }
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
		public And_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterAnd_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitAnd_TOK(this);
		}
	}

	public final And_TOKContext and_TOK() throws RecognitionException {
		And_TOKContext _localctx = new And_TOKContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_and_TOK);
		try {
			setState(1894);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(1887);
				match(AND);

				}
				break;
			case MT_and_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1890);
				match(MT_and_TOK);
				}
				break;
			case ET_and_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1892);
				match(ET_and_TOK);
				setState(1893);
				match(EMBED_END);
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

	public static class And_TOK_EOFContext extends ParserRuleContext {
		public And_TOKContext and_TOK() {
			return getRuleContext(And_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public And_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterAnd_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitAnd_TOK_EOF(this);
		}
	}

	public final And_TOK_EOFContext and_TOK_EOF() throws RecognitionException {
		And_TOK_EOFContext _localctx = new And_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_and_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1896);
			and_TOK();
			setState(1897);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 300, RULE_dispatchCases);
		try {
			setState(1909);
			switch (_input.LA(1)) {
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
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_qualifier:
			case ET_qualifier:
			case COLON:
			case LBRACE:
			case AT:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1900);
				dispatchCase();
				setState(1901);
				dispatchCases_S1_ZOM();
				_exitAlt();
				}
				break;
			case MT_dispatchCases:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1905);
				match(MT_dispatchCases);
				}
				break;
			case ET_dispatchCases:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1907);
				match(ET_dispatchCases);
				setState(1908);
				match(EMBED_END);
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
		enterRule(_localctx, 302, RULE_dispatchCases_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1911);
			dispatchCases();
			setState(1912);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 304, RULE_dispatchCases_S1_ZOM);
		try {
			int _alt;
			setState(1939);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterZOM();
				setState(1919);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1916);
						dispatchCases_S1();
						}
						} 
					}
					setState(1921);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				}
				setState(1930);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					_tail();
					setState(1928);
					switch (_input.LA(1)) {
					case MT_dispatchCases_S1_ZOM:
						{
						_term();
						setState(1924);
						match(MT_dispatchCases_S1_ZOM);
						}
						break;
					case ET_dispatchCases_S1_ZOM:
						{
						_embed();
						setState(1926);
						match(ET_dispatchCases_S1_ZOM);
						setState(1927);
						match(EMBED_END);
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
				setState(1935);
				match(MT_dispatchCases_S1_ZOM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1937);
				match(ET_dispatchCases_S1_ZOM);
				setState(1938);
				match(EMBED_END);
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
		enterRule(_localctx, 306, RULE_dispatchCases_S1_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1941);
			dispatchCases_S1_ZOM();
			setState(1942);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 308, RULE_dispatchCases_S1);
		try {
			setState(1954);
			switch (_input.LA(1)) {
			case MT_semi_TOK:
			case ET_semi_TOK:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1945);
				semi_TOK();
				setState(1946);
				dispatchCase();
				_exitAlt();
				}
				break;
			case MT_dispatchCases_S1:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1950);
				match(MT_dispatchCases_S1);
				}
				break;
			case ET_dispatchCases_S1:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1952);
				match(ET_dispatchCases_S1);
				setState(1953);
				match(EMBED_END);
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
		enterRule(_localctx, 310, RULE_dispatchCases_S1_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1956);
			dispatchCases_S1();
			setState(1957);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 312, RULE_dispatchCase);
		try {
			setState(1968);
			switch (_input.LA(1)) {
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
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_qualifier:
			case ET_qualifier:
			case COLON:
			case LBRACE:
			case AT:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1960);
				ruleDeclaration();
				_exitAlt();
				}
				break;
			case MT_dispatchCase:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1964);
				match(MT_dispatchCase);
				}
				break;
			case ET_dispatchCase:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1966);
				match(ET_dispatchCase);
				setState(1967);
				match(EMBED_END);
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
		enterRule(_localctx, 314, RULE_dispatchCase_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1970);
			dispatchCase();
			setState(1971);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 316, RULE_delayCase);
		try {
			setState(1982);
			switch (_input.LA(1)) {
			case MT_delay_TOK:
			case ET_delay_TOK:
			case DELAY:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1974);
				delay_TOK();
				_exitAlt();
				}
				break;
			case MT_delayCase:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1978);
				match(MT_delayCase);
				}
				break;
			case ET_delayCase:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1980);
				match(ET_delayCase);
				setState(1981);
				match(EMBED_END);
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
		enterRule(_localctx, 318, RULE_delayCase_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1984);
			delayCase();
			setState(1985);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 320, RULE_delay_TOK);
		try {
			setState(1995);
			switch (_input.LA(1)) {
			case DELAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1988);
				match(DELAY);

				}
				break;
			case MT_delay_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1991);
				match(MT_delay_TOK);
				}
				break;
			case ET_delay_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1993);
				match(ET_delay_TOK);
				setState(1994);
				match(EMBED_END);
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
		enterRule(_localctx, 322, RULE_delay_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1997);
			delay_TOK();
			setState(1998);
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
		public Propertylist_OPTContext propertylist_OPT() {
			return getRuleContext(Propertylist_OPTContext.class,0);
		}
		public Rbrace_TOKContext rbrace_TOK() {
			return getRuleContext(Rbrace_TOKContext.class,0);
		}
		public TerminalNode MT_properties() { return getToken(CrsxMetaParser.MT_properties, 0); }
		public TerminalNode ET_properties() { return getToken(CrsxMetaParser.ET_properties, 0); }
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 324, RULE_properties);
		try {
			setState(2011);
			switch (_input.LA(1)) {
			case MT_lbrace_TOK:
			case ET_lbrace_TOK:
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2001);
				lbrace_TOK();
				setState(2002);
				propertylist_OPT();
				setState(2003);
				rbrace_TOK();
				_exitAlt();
				}
				break;
			case MT_properties:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2007);
				match(MT_properties);
				}
				break;
			case ET_properties:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2009);
				match(ET_properties);
				setState(2010);
				match(EMBED_END);
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
		enterRule(_localctx, 326, RULE_properties_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2013);
			properties();
			setState(2014);
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

	public static class Propertylist_OPTContext extends ParserRuleContext {
		public PropertylistContext propertylist() {
			return getRuleContext(PropertylistContext.class,0);
		}
		public TerminalNode MT_propertylist_OPT() { return getToken(CrsxMetaParser.MT_propertylist_OPT, 0); }
		public TerminalNode ET_propertylist_OPT() { return getToken(CrsxMetaParser.ET_propertylist_OPT, 0); }
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
		public Propertylist_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertylist_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterPropertylist_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitPropertylist_OPT(this);
		}
	}

	public final Propertylist_OPTContext propertylist_OPT() throws RecognitionException {
		Propertylist_OPTContext _localctx = new Propertylist_OPTContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_propertylist_OPT);
		int _la;
		try {
			setState(2038);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(2019);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_string_TOK) | (1L << ET_string_TOK) | (1L << MT_colon_TOK) | (1L << ET_colon_TOK) | (1L << MT_metavar_TOK) | (1L << ET_metavar_TOK))) != 0) || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (MT_variable_TOK - 111)) | (1L << (ET_variable_TOK - 111)) | (1L << (MT_propertylist - 111)) | (1L << (ET_propertylist - 111)))) != 0) || ((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (MT_property - 175)) | (1L << (ET_property - 175)) | (1L << (MT_not_TOK - 175)) | (1L << (ET_not_TOK - 175)) | (1L << (MT_constructor - 175)) | (1L << (ET_constructor - 175)) | (1L << (MT_constructor_TOK - 175)) | (1L << (ET_constructor_TOK - 175)) | (1L << (MT_qualifier - 175)) | (1L << (ET_qualifier - 175)))) != 0) || ((((_la - 244)) & ~0x3f) == 0 && ((1L << (_la - 244)) & ((1L << (COLON - 244)) | (1L << (NOT - 244)) | (1L << (CONSTRUCTOR - 244)) | (1L << (VARIABLE - 244)) | (1L << (METAVAR - 244)) | (1L << (STRING - 244)))) != 0)) {
					{
					setState(2018);
					propertylist();
					}
				}

				setState(2029);
				_la = _input.LA(1);
				if (_la==MT_propertylist_OPT || _la==ET_propertylist_OPT) {
					{
					_tail();
					setState(2027);
					switch (_input.LA(1)) {
					case MT_propertylist_OPT:
						{
						_term();
						setState(2023);
						match(MT_propertylist_OPT);
						}
						break;
					case ET_propertylist_OPT:
						{
						_embed();
						setState(2025);
						match(ET_propertylist_OPT);
						setState(2026);
						match(EMBED_END);
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
				setState(2034);
				match(MT_propertylist_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2036);
				match(ET_propertylist_OPT);
				setState(2037);
				match(EMBED_END);
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

	public static class Propertylist_OPT_EOFContext extends ParserRuleContext {
		public Propertylist_OPTContext propertylist_OPT() {
			return getRuleContext(Propertylist_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Propertylist_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertylist_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterPropertylist_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitPropertylist_OPT_EOF(this);
		}
	}

	public final Propertylist_OPT_EOFContext propertylist_OPT_EOF() throws RecognitionException {
		Propertylist_OPT_EOFContext _localctx = new Propertylist_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_propertylist_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2040);
			propertylist_OPT();
			setState(2041);
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

	public static class PropertylistContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public Propertylist_S1_ZOMContext propertylist_S1_ZOM() {
			return getRuleContext(Propertylist_S1_ZOMContext.class,0);
		}
		public TerminalNode MT_propertylist() { return getToken(CrsxMetaParser.MT_propertylist, 0); }
		public TerminalNode ET_propertylist() { return getToken(CrsxMetaParser.ET_propertylist, 0); }
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
		public PropertylistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertylist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterPropertylist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitPropertylist(this);
		}
	}

	public final PropertylistContext propertylist() throws RecognitionException {
		PropertylistContext _localctx = new PropertylistContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_propertylist);
		try {
			setState(2053);
			switch (_input.LA(1)) {
			case MT_string_TOK:
			case ET_string_TOK:
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_metavar_TOK:
			case ET_metavar_TOK:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_property:
			case ET_property:
			case MT_not_TOK:
			case ET_not_TOK:
			case MT_constructor:
			case ET_constructor:
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_qualifier:
			case ET_qualifier:
			case COLON:
			case NOT:
			case CONSTRUCTOR:
			case VARIABLE:
			case METAVAR:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2044);
				property();
				setState(2045);
				propertylist_S1_ZOM();
				_exitAlt();
				}
				break;
			case MT_propertylist:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2049);
				match(MT_propertylist);
				}
				break;
			case ET_propertylist:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2051);
				match(ET_propertylist);
				setState(2052);
				match(EMBED_END);
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

	public static class Propertylist_EOFContext extends ParserRuleContext {
		public PropertylistContext propertylist() {
			return getRuleContext(PropertylistContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Propertylist_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertylist_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterPropertylist_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitPropertylist_EOF(this);
		}
	}

	public final Propertylist_EOFContext propertylist_EOF() throws RecognitionException {
		Propertylist_EOFContext _localctx = new Propertylist_EOFContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_propertylist_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2055);
			propertylist();
			setState(2056);
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

	public static class Propertylist_S1_ZOMContext extends ParserRuleContext {
		public List<Propertylist_S1Context> propertylist_S1() {
			return getRuleContexts(Propertylist_S1Context.class);
		}
		public Propertylist_S1Context propertylist_S1(int i) {
			return getRuleContext(Propertylist_S1Context.class,i);
		}
		public TerminalNode MT_propertylist_S1_ZOM() { return getToken(CrsxMetaParser.MT_propertylist_S1_ZOM, 0); }
		public TerminalNode ET_propertylist_S1_ZOM() { return getToken(CrsxMetaParser.ET_propertylist_S1_ZOM, 0); }
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
		public Propertylist_S1_ZOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertylist_S1_ZOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterPropertylist_S1_ZOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitPropertylist_S1_ZOM(this);
		}
	}

	public final Propertylist_S1_ZOMContext propertylist_S1_ZOM() throws RecognitionException {
		Propertylist_S1_ZOMContext _localctx = new Propertylist_S1_ZOMContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_propertylist_S1_ZOM);
		int _la;
		try {
			setState(2083);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterZOM();
				setState(2063);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MT_semi_TOK || _la==ET_semi_TOK || _la==MT_propertylist_S1 || _la==ET_propertylist_S1 || _la==SEMI) {
					{
					{
					setState(2060);
					propertylist_S1();
					}
					}
					setState(2065);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2074);
				_la = _input.LA(1);
				if (_la==MT_propertylist_S1_ZOM || _la==ET_propertylist_S1_ZOM) {
					{
					_tail();
					setState(2072);
					switch (_input.LA(1)) {
					case MT_propertylist_S1_ZOM:
						{
						_term();
						setState(2068);
						match(MT_propertylist_S1_ZOM);
						}
						break;
					case ET_propertylist_S1_ZOM:
						{
						_embed();
						setState(2070);
						match(ET_propertylist_S1_ZOM);
						setState(2071);
						match(EMBED_END);
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
				setState(2079);
				match(MT_propertylist_S1_ZOM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2081);
				match(ET_propertylist_S1_ZOM);
				setState(2082);
				match(EMBED_END);
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

	public static class Propertylist_S1_ZOM_EOFContext extends ParserRuleContext {
		public Propertylist_S1_ZOMContext propertylist_S1_ZOM() {
			return getRuleContext(Propertylist_S1_ZOMContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Propertylist_S1_ZOM_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertylist_S1_ZOM_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterPropertylist_S1_ZOM_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitPropertylist_S1_ZOM_EOF(this);
		}
	}

	public final Propertylist_S1_ZOM_EOFContext propertylist_S1_ZOM_EOF() throws RecognitionException {
		Propertylist_S1_ZOM_EOFContext _localctx = new Propertylist_S1_ZOM_EOFContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_propertylist_S1_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2085);
			propertylist_S1_ZOM();
			setState(2086);
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

	public static class Propertylist_S1Context extends ParserRuleContext {
		public Semi_TOKContext semi_TOK() {
			return getRuleContext(Semi_TOKContext.class,0);
		}
		public Property_OPTContext property_OPT() {
			return getRuleContext(Property_OPTContext.class,0);
		}
		public TerminalNode MT_propertylist_S1() { return getToken(CrsxMetaParser.MT_propertylist_S1, 0); }
		public TerminalNode ET_propertylist_S1() { return getToken(CrsxMetaParser.ET_propertylist_S1, 0); }
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
		public Propertylist_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertylist_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterPropertylist_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitPropertylist_S1(this);
		}
	}

	public final Propertylist_S1Context propertylist_S1() throws RecognitionException {
		Propertylist_S1Context _localctx = new Propertylist_S1Context(_ctx, getState());
		enterRule(_localctx, 340, RULE_propertylist_S1);
		try {
			setState(2098);
			switch (_input.LA(1)) {
			case MT_semi_TOK:
			case ET_semi_TOK:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2089);
				semi_TOK();
				setState(2090);
				property_OPT();
				_exitAlt();
				}
				break;
			case MT_propertylist_S1:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2094);
				match(MT_propertylist_S1);
				}
				break;
			case ET_propertylist_S1:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2096);
				match(ET_propertylist_S1);
				setState(2097);
				match(EMBED_END);
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

	public static class Propertylist_S1_EOFContext extends ParserRuleContext {
		public Propertylist_S1Context propertylist_S1() {
			return getRuleContext(Propertylist_S1Context.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Propertylist_S1_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertylist_S1_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterPropertylist_S1_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitPropertylist_S1_EOF(this);
		}
	}

	public final Propertylist_S1_EOFContext propertylist_S1_EOF() throws RecognitionException {
		Propertylist_S1_EOFContext _localctx = new Propertylist_S1_EOFContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_propertylist_S1_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2100);
			propertylist_S1();
			setState(2101);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 344, RULE_property_OPT);
		int _la;
		try {
			setState(2125);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(2106);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_string_TOK) | (1L << ET_string_TOK) | (1L << MT_colon_TOK) | (1L << ET_colon_TOK) | (1L << MT_metavar_TOK) | (1L << ET_metavar_TOK))) != 0) || _la==MT_variable_TOK || _la==ET_variable_TOK || ((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (MT_property - 175)) | (1L << (ET_property - 175)) | (1L << (MT_not_TOK - 175)) | (1L << (ET_not_TOK - 175)) | (1L << (MT_constructor - 175)) | (1L << (ET_constructor - 175)) | (1L << (MT_constructor_TOK - 175)) | (1L << (ET_constructor_TOK - 175)) | (1L << (MT_qualifier - 175)) | (1L << (ET_qualifier - 175)))) != 0) || ((((_la - 244)) & ~0x3f) == 0 && ((1L << (_la - 244)) & ((1L << (COLON - 244)) | (1L << (NOT - 244)) | (1L << (CONSTRUCTOR - 244)) | (1L << (VARIABLE - 244)) | (1L << (METAVAR - 244)) | (1L << (STRING - 244)))) != 0)) {
					{
					setState(2105);
					property();
					}
				}

				setState(2116);
				_la = _input.LA(1);
				if (_la==MT_property_OPT || _la==ET_property_OPT) {
					{
					_tail();
					setState(2114);
					switch (_input.LA(1)) {
					case MT_property_OPT:
						{
						_term();
						setState(2110);
						match(MT_property_OPT);
						}
						break;
					case ET_property_OPT:
						{
						_embed();
						setState(2112);
						match(ET_property_OPT);
						setState(2113);
						match(EMBED_END);
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
				setState(2121);
				match(MT_property_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2123);
				match(ET_property_OPT);
				setState(2124);
				match(EMBED_END);
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
		enterRule(_localctx, 346, RULE_property_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2127);
			property_OPT();
			setState(2128);
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 348, RULE_property);
		try {
			setState(2186);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(2131);
				metavar_TOK();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(2135);
				not_TOK();
				setState(2136);
				metavar_TOK();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(2140);
				metavar_TOK();
				setState(2141);
				colon_TOK();
				setState(2142);
				term();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(2146);
				variable_TOK();
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				setState(2150);
				not_TOK();
				setState(2151);
				variable_TOK();
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_enterAlt("6");
				setState(2155);
				variable_TOK();
				setState(2156);
				colon_TOK();
				setState(2157);
				term();
				_exitAlt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				_enterAlt("7");
				setState(2161);
				string_TOK();
				_exitAlt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				_enterAlt("8");
				setState(2165);
				not_TOK();
				setState(2166);
				string_TOK();
				_exitAlt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				_enterAlt("9");
				setState(2170);
				string_TOK();
				setState(2171);
				colon_TOK();
				setState(2172);
				term();
				_exitAlt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				_enterAlt("10");
				setState(2176);
				constructor();
				setState(2177);
				colon_TOK();
				setState(2178);
				term();
				_exitAlt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				_term();
				setState(2182);
				match(MT_property);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				_embed();
				setState(2184);
				match(ET_property);
				setState(2185);
				match(EMBED_END);
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
		enterRule(_localctx, 350, RULE_property_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2188);
			property();
			setState(2189);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 352, RULE_not_TOK);
		try {
			setState(2199);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2192);
				match(NOT);

				}
				break;
			case MT_not_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2195);
				match(MT_not_TOK);
				}
				break;
			case ET_not_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2197);
				match(ET_not_TOK);
				setState(2198);
				match(EMBED_END);
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
		enterRule(_localctx, 354, RULE_not_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2201);
			not_TOK();
			setState(2202);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 356, RULE_expression);
		try {
			setState(2213);
			switch (_input.LA(1)) {
			case MT_dispatch:
			case ET_dispatch:
			case MT_dispatch_TOK:
			case ET_dispatch_TOK:
			case DISPATCH:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2205);
				dispatch();
				_exitAlt();
				}
				break;
			case MT_expression:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2209);
				match(MT_expression);
				}
				break;
			case ET_expression:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2211);
				match(ET_expression);
				setState(2212);
				match(EMBED_END);
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
		enterRule(_localctx, 358, RULE_expression_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2215);
			expression();
			setState(2216);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 360, RULE_sortDeclaration);
		try {
			setState(2241);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(2219);
				sortparams_OPT();
				setState(2220);
				sortset();
				setState(2221);
				sortname();
				setState(2222);
				datasort_TOK();
				setState(2223);
				lpar_TOK();
				setState(2224);
				forms();
				setState(2225);
				rpar_TOK();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(2229);
				sortparams_OPT();
				setState(2230);
				sortset();
				setState(2231);
				form();
				setState(2232);
				coloncolon_TOK();
				setState(2233);
				sortname();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(2237);
				match(MT_sortDeclaration);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(2239);
				match(ET_sortDeclaration);
				setState(2240);
				match(EMBED_END);
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
		enterRule(_localctx, 362, RULE_sortDeclaration_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2243);
			sortDeclaration();
			setState(2244);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 364, RULE_sortparams_OPT);
		int _la;
		try {
			setState(2268);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(2249);
				_la = _input.LA(1);
				if (((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (MT_sortparams - 187)) | (1L << (ET_sortparams - 187)) | (1L << (MT_forall_TOK - 187)) | (1L << (ET_forall_TOK - 187)) | (1L << (FORALL - 187)))) != 0)) {
					{
					setState(2248);
					sortparams();
					}
				}

				setState(2259);
				_la = _input.LA(1);
				if (_la==MT_sortparams_OPT || _la==ET_sortparams_OPT) {
					{
					_tail();
					setState(2257);
					switch (_input.LA(1)) {
					case MT_sortparams_OPT:
						{
						_term();
						setState(2253);
						match(MT_sortparams_OPT);
						}
						break;
					case ET_sortparams_OPT:
						{
						_embed();
						setState(2255);
						match(ET_sortparams_OPT);
						setState(2256);
						match(EMBED_END);
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
				setState(2264);
				match(MT_sortparams_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2266);
				match(ET_sortparams_OPT);
				setState(2267);
				match(EMBED_END);
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
		enterRule(_localctx, 366, RULE_sortparams_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2270);
			sortparams_OPT();
			setState(2271);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 368, RULE_datasort_TOK);
		try {
			setState(2281);
			switch (_input.LA(1)) {
			case DATASORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2274);
				match(DATASORT);

				}
				break;
			case MT_datasort_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2277);
				match(MT_datasort_TOK);
				}
				break;
			case ET_datasort_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2279);
				match(ET_datasort_TOK);
				setState(2280);
				match(EMBED_END);
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
		enterRule(_localctx, 370, RULE_datasort_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2283);
			datasort_TOK();
			setState(2284);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 372, RULE_sortparams);
		try {
			setState(2297);
			switch (_input.LA(1)) {
			case MT_forall_TOK:
			case ET_forall_TOK:
			case FORALL:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2287);
				forall_TOK();
				setState(2288);
				variable_OOM();
				setState(2289);
				dot_TOK();
				_exitAlt();
				}
				break;
			case MT_sortparams:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2293);
				match(MT_sortparams);
				}
				break;
			case ET_sortparams:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2295);
				match(ET_sortparams);
				setState(2296);
				match(EMBED_END);
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
		enterRule(_localctx, 374, RULE_sortparams_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2299);
			sortparams();
			setState(2300);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 376, RULE_forall_TOK);
		try {
			setState(2310);
			switch (_input.LA(1)) {
			case FORALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2303);
				match(FORALL);

				}
				break;
			case MT_forall_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2306);
				match(MT_forall_TOK);
				}
				break;
			case ET_forall_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2308);
				match(ET_forall_TOK);
				setState(2309);
				match(EMBED_END);
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
		enterRule(_localctx, 378, RULE_forall_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2312);
			forall_TOK();
			setState(2313);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 380, RULE_variable_OOM);
		int _la;
		try {
			setState(2340);
			switch (_input.LA(1)) {
			case MT_variable:
			case ET_variable:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterOOM();
				setState(2318); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2317);
					variable();
					}
					}
					setState(2320); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (MT_variable - 109)) | (1L << (ET_variable - 109)) | (1L << (MT_variable_TOK - 109)) | (1L << (ET_variable_TOK - 109)))) != 0) || _la==VARIABLE );
				setState(2330);
				_la = _input.LA(1);
				if (_la==MT_variable_OOM || _la==ET_variable_OOM) {
					{
					_tail();
					setState(2328);
					switch (_input.LA(1)) {
					case MT_variable_OOM:
						{
						_term();
						setState(2324);
						match(MT_variable_OOM);
						}
						break;
					case ET_variable_OOM:
						{
						_embed();
						setState(2326);
						match(ET_variable_OOM);
						setState(2327);
						match(EMBED_END);
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
				setState(2336);
				match(MT_variable_OOM);
				}
				break;
			case ET_variable_OOM:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2338);
				match(ET_variable_OOM);
				setState(2339);
				match(EMBED_END);
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
		enterRule(_localctx, 382, RULE_variable_OOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2342);
			variable_OOM();
			setState(2343);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 384, RULE_sortset);
		try {
			setState(2354);
			switch (_input.LA(1)) {
			case EOF:
			case MT_lbrace_TOK:
			case ET_lbrace_TOK:
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_variable:
			case ET_variable:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_properties:
			case ET_properties:
			case MT_sortname:
			case ET_sortname:
			case MT_form:
			case ET_form:
			case MT_constructor:
			case ET_constructor:
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_qualifier:
			case ET_qualifier:
			case COLON:
			case LBRACE:
			case CONSTRUCTOR:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2346);
				properties_OPT();
				_exitAlt();
				}
				break;
			case MT_sortset:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2350);
				match(MT_sortset);
				}
				break;
			case ET_sortset:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2352);
				match(ET_sortset);
				setState(2353);
				match(EMBED_END);
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
		enterRule(_localctx, 386, RULE_sortset_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2356);
			sortset();
			setState(2357);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 388, RULE_sortnames);
		try {
			setState(2369);
			switch (_input.LA(1)) {
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_variable:
			case ET_variable:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_sortname:
			case ET_sortname:
			case MT_constructor:
			case ET_constructor:
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_qualifier:
			case ET_qualifier:
			case COLON:
			case CONSTRUCTOR:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2360);
				sortname();
				setState(2361);
				sortnames_S1_ZOM();
				_exitAlt();
				}
				break;
			case MT_sortnames:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2365);
				match(MT_sortnames);
				}
				break;
			case ET_sortnames:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2367);
				match(ET_sortnames);
				setState(2368);
				match(EMBED_END);
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
		enterRule(_localctx, 390, RULE_sortnames_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2371);
			sortnames();
			setState(2372);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 392, RULE_sortnames_S1_ZOM);
		int _la;
		try {
			setState(2399);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterZOM();
				setState(2379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MT_comma_TOK || _la==ET_comma_TOK || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (MT_sortnames_S1 - 199)) | (1L << (ET_sortnames_S1 - 199)) | (1L << (COMMA - 199)))) != 0)) {
					{
					{
					setState(2376);
					sortnames_S1();
					}
					}
					setState(2381);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2390);
				_la = _input.LA(1);
				if (_la==MT_sortnames_S1_ZOM || _la==ET_sortnames_S1_ZOM) {
					{
					_tail();
					setState(2388);
					switch (_input.LA(1)) {
					case MT_sortnames_S1_ZOM:
						{
						_term();
						setState(2384);
						match(MT_sortnames_S1_ZOM);
						}
						break;
					case ET_sortnames_S1_ZOM:
						{
						_embed();
						setState(2386);
						match(ET_sortnames_S1_ZOM);
						setState(2387);
						match(EMBED_END);
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
				setState(2395);
				match(MT_sortnames_S1_ZOM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2397);
				match(ET_sortnames_S1_ZOM);
				setState(2398);
				match(EMBED_END);
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
		enterRule(_localctx, 394, RULE_sortnames_S1_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2401);
			sortnames_S1_ZOM();
			setState(2402);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 396, RULE_sortnames_S1);
		try {
			setState(2414);
			switch (_input.LA(1)) {
			case MT_comma_TOK:
			case ET_comma_TOK:
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2405);
				comma_TOK();
				setState(2406);
				sortname();
				_exitAlt();
				}
				break;
			case MT_sortnames_S1:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2410);
				match(MT_sortnames_S1);
				}
				break;
			case ET_sortnames_S1:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2412);
				match(ET_sortnames_S1);
				setState(2413);
				match(EMBED_END);
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
		enterRule(_localctx, 398, RULE_sortnames_S1_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2416);
			sortnames_S1();
			setState(2417);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 400, RULE_sortname);
		try {
			setState(2433);
			switch (_input.LA(1)) {
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_constructor:
			case ET_constructor:
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_qualifier:
			case ET_qualifier:
			case COLON:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(2420);
				constructor();
				setState(2421);
				sortarguments_OPT();
				_exitAlt();
				}
				break;
			case MT_variable:
			case ET_variable:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(2425);
				variable();
				_exitAlt();
				}
				break;
			case MT_sortname:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(2429);
				match(MT_sortname);
				}
				break;
			case ET_sortname:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(2431);
				match(ET_sortname);
				setState(2432);
				match(EMBED_END);
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
		enterRule(_localctx, 402, RULE_sortname_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2435);
			sortname();
			setState(2436);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 404, RULE_sortarguments_OPT);
		int _la;
		try {
			setState(2460);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(2441);
				_la = _input.LA(1);
				if (_la==MT_lsquare_TOK || _la==ET_lsquare_TOK || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (MT_sortarguments - 205)) | (1L << (ET_sortarguments - 205)) | (1L << (LSQUARE - 205)))) != 0)) {
					{
					setState(2440);
					sortarguments();
					}
				}

				setState(2451);
				_la = _input.LA(1);
				if (_la==MT_sortarguments_OPT || _la==ET_sortarguments_OPT) {
					{
					_tail();
					setState(2449);
					switch (_input.LA(1)) {
					case MT_sortarguments_OPT:
						{
						_term();
						setState(2445);
						match(MT_sortarguments_OPT);
						}
						break;
					case ET_sortarguments_OPT:
						{
						_embed();
						setState(2447);
						match(ET_sortarguments_OPT);
						setState(2448);
						match(EMBED_END);
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
				setState(2456);
				match(MT_sortarguments_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2458);
				match(ET_sortarguments_OPT);
				setState(2459);
				match(EMBED_END);
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
		enterRule(_localctx, 406, RULE_sortarguments_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2462);
			sortarguments_OPT();
			setState(2463);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 408, RULE_sortarguments);
		try {
			setState(2476);
			switch (_input.LA(1)) {
			case MT_lsquare_TOK:
			case ET_lsquare_TOK:
			case LSQUARE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2466);
				lsquare_TOK();
				setState(2467);
				sortnames_OPT();
				setState(2468);
				rsquare_TOK();
				_exitAlt();
				}
				break;
			case MT_sortarguments:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2472);
				match(MT_sortarguments);
				}
				break;
			case ET_sortarguments:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2474);
				match(ET_sortarguments);
				setState(2475);
				match(EMBED_END);
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
		enterRule(_localctx, 410, RULE_sortarguments_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2478);
			sortarguments();
			setState(2479);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 412, RULE_sortnames_OPT);
		int _la;
		try {
			setState(2503);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(2484);
				_la = _input.LA(1);
				if (_la==MT_colon_TOK || _la==ET_colon_TOK || ((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (MT_variable - 109)) | (1L << (ET_variable - 109)) | (1L << (MT_variable_TOK - 109)) | (1L << (ET_variable_TOK - 109)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (MT_sortnames - 195)) | (1L << (ET_sortnames - 195)) | (1L << (MT_sortname - 195)) | (1L << (ET_sortname - 195)) | (1L << (MT_constructor - 195)) | (1L << (ET_constructor - 195)) | (1L << (MT_constructor_TOK - 195)) | (1L << (ET_constructor_TOK - 195)) | (1L << (MT_qualifier - 195)) | (1L << (ET_qualifier - 195)) | (1L << (COLON - 195)))) != 0) || _la==CONSTRUCTOR || _la==VARIABLE) {
					{
					setState(2483);
					sortnames();
					}
				}

				setState(2494);
				_la = _input.LA(1);
				if (_la==MT_sortnames_OPT || _la==ET_sortnames_OPT) {
					{
					_tail();
					setState(2492);
					switch (_input.LA(1)) {
					case MT_sortnames_OPT:
						{
						_term();
						setState(2488);
						match(MT_sortnames_OPT);
						}
						break;
					case ET_sortnames_OPT:
						{
						_embed();
						setState(2490);
						match(ET_sortnames_OPT);
						setState(2491);
						match(EMBED_END);
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
				setState(2499);
				match(MT_sortnames_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2501);
				match(ET_sortnames_OPT);
				setState(2502);
				match(EMBED_END);
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
		enterRule(_localctx, 414, RULE_sortnames_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2505);
			sortnames_OPT();
			setState(2506);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 416, RULE_forms);
		try {
			setState(2517);
			switch (_input.LA(1)) {
			case EOF:
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_rpar_TOK:
			case ET_rpar_TOK:
			case MT_forms_S1_ZOM:
			case ET_forms_S1_ZOM:
			case MT_forms_S1:
			case ET_forms_S1:
			case MT_form:
			case ET_form:
			case MT_constructor:
			case ET_constructor:
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_qualifier:
			case ET_qualifier:
			case COLON:
			case RPAR:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2509);
				forms_S1_ZOM();
				_exitAlt();
				}
				break;
			case MT_forms:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2513);
				match(MT_forms);
				}
				break;
			case ET_forms:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2515);
				match(ET_forms);
				setState(2516);
				match(EMBED_END);
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
		enterRule(_localctx, 418, RULE_forms_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2519);
			forms();
			setState(2520);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 420, RULE_forms_S1_ZOM);
		int _la;
		try {
			setState(2547);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterZOM();
				setState(2527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MT_colon_TOK || _la==ET_colon_TOK || ((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (MT_forms_S1 - 213)) | (1L << (ET_forms_S1 - 213)) | (1L << (MT_form - 213)) | (1L << (ET_form - 213)) | (1L << (MT_constructor - 213)) | (1L << (ET_constructor - 213)) | (1L << (MT_constructor_TOK - 213)) | (1L << (ET_constructor_TOK - 213)) | (1L << (MT_qualifier - 213)) | (1L << (ET_qualifier - 213)) | (1L << (COLON - 213)) | (1L << (CONSTRUCTOR - 213)))) != 0)) {
					{
					{
					setState(2524);
					forms_S1();
					}
					}
					setState(2529);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2538);
				_la = _input.LA(1);
				if (_la==MT_forms_S1_ZOM || _la==ET_forms_S1_ZOM) {
					{
					_tail();
					setState(2536);
					switch (_input.LA(1)) {
					case MT_forms_S1_ZOM:
						{
						_term();
						setState(2532);
						match(MT_forms_S1_ZOM);
						}
						break;
					case ET_forms_S1_ZOM:
						{
						_embed();
						setState(2534);
						match(ET_forms_S1_ZOM);
						setState(2535);
						match(EMBED_END);
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
				setState(2543);
				match(MT_forms_S1_ZOM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2545);
				match(ET_forms_S1_ZOM);
				setState(2546);
				match(EMBED_END);
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
		enterRule(_localctx, 422, RULE_forms_S1_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2549);
			forms_S1_ZOM();
			setState(2550);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 424, RULE_forms_S1);
		try {
			setState(2562);
			switch (_input.LA(1)) {
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_form:
			case ET_form:
			case MT_constructor:
			case ET_constructor:
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_qualifier:
			case ET_qualifier:
			case COLON:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2553);
				form();
				setState(2554);
				semi_TOK();
				_exitAlt();
				}
				break;
			case MT_forms_S1:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2558);
				match(MT_forms_S1);
				}
				break;
			case ET_forms_S1:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2560);
				match(ET_forms_S1);
				setState(2561);
				match(EMBED_END);
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
		enterRule(_localctx, 426, RULE_forms_S1_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2564);
			forms_S1();
			setState(2565);
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
		public TerminalNode MT_form() { return getToken(CrsxMetaParser.MT_form, 0); }
		public TerminalNode ET_form() { return getToken(CrsxMetaParser.ET_form, 0); }
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 428, RULE_form);
		try {
			setState(2577);
			switch (_input.LA(1)) {
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_constructor:
			case ET_constructor:
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_qualifier:
			case ET_qualifier:
			case COLON:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2568);
				constructor();
				setState(2569);
				arguments_OPT();
				_exitAlt();
				}
				break;
			case MT_form:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2573);
				match(MT_form);
				}
				break;
			case ET_form:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2575);
				match(ET_form);
				setState(2576);
				match(EMBED_END);
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
		enterRule(_localctx, 430, RULE_form_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2579);
			form();
			setState(2580);
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
		public Colon_TOKContext colon_TOK() {
			return getRuleContext(Colon_TOKContext.class,0);
		}
		public TerminalNode MT_constructor() { return getToken(CrsxMetaParser.MT_constructor, 0); }
		public TerminalNode ET_constructor() { return getToken(CrsxMetaParser.ET_constructor, 0); }
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 432, RULE_constructor);
		try {
			setState(2596);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_qualifier:
			case ET_qualifier:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(2583);
				qualifier();
				setState(2584);
				constructor_TOK();
				_exitAlt();
				}
				break;
			case MT_colon_TOK:
			case ET_colon_TOK:
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(2588);
				colon_TOK();
				_exitAlt();
				}
				break;
			case MT_constructor:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(2592);
				match(MT_constructor);
				}
				break;
			case ET_constructor:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(2594);
				match(ET_constructor);
				setState(2595);
				match(EMBED_END);
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
		enterRule(_localctx, 434, RULE_constructor_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2598);
			constructor();
			setState(2599);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 436, RULE_constructor_TOK);
		try {
			setState(2609);
			switch (_input.LA(1)) {
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(2602);
				match(CONSTRUCTOR);

				}
				break;
			case MT_constructor_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2605);
				match(MT_constructor_TOK);
				}
				break;
			case ET_constructor_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2607);
				match(ET_constructor_TOK);
				setState(2608);
				match(EMBED_END);
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
		enterRule(_localctx, 438, RULE_constructor_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2611);
			constructor_TOK();
			setState(2612);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 440, RULE_qualifier);
		try {
			setState(2627);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(2615);
				constructor_TOK();
				setState(2616);
				dot_TOK();
				setState(2617);
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
				setState(2623);
				match(MT_qualifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(2625);
				match(ET_qualifier);
				setState(2626);
				match(EMBED_END);
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
		enterRule(_localctx, 442, RULE_qualifier_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2629);
			qualifier();
			setState(2630);
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
		public TerminalNode MT_directive() { return getToken(CrsxMetaParser.MT_directive, 0); }
		public TerminalNode ET_directive() { return getToken(CrsxMetaParser.ET_directive, 0); }
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 444, RULE_directive);
		try {
			setState(2650);
			switch (_input.LA(1)) {
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_constructor:
			case ET_constructor:
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_qualifier:
			case ET_qualifier:
			case COLON:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(2633);
				constructor();
				setState(2634);
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
				setState(2638);
				directiveList();
				_exitAlt();
				}
				break;
			case MT_string_TOK:
			case ET_string_TOK:
			case MT_literal:
			case ET_literal:
			case MT_number_TOK:
			case ET_number_TOK:
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(2642);
				literal();
				_exitAlt();
				}
				break;
			case MT_directive:
				enterOuterAlt(_localctx, 4);
				{
				_term();
				setState(2646);
				match(MT_directive);
				}
				break;
			case ET_directive:
				enterOuterAlt(_localctx, 5);
				{
				_embed();
				setState(2648);
				match(ET_directive);
				setState(2649);
				match(EMBED_END);
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
		enterRule(_localctx, 446, RULE_directive_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2652);
			directive();
			setState(2653);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 448, RULE_directiveArguments_OPT);
		int _la;
		try {
			setState(2677);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(2658);
				_la = _input.LA(1);
				if (_la==MT_lsquare_TOK || _la==ET_lsquare_TOK || ((((_la - 227)) & ~0x3f) == 0 && ((1L << (_la - 227)) & ((1L << (MT_directiveArguments - 227)) | (1L << (ET_directiveArguments - 227)) | (1L << (LSQUARE - 227)))) != 0)) {
					{
					setState(2657);
					directiveArguments();
					}
				}

				setState(2668);
				_la = _input.LA(1);
				if (_la==MT_directiveArguments_OPT || _la==ET_directiveArguments_OPT) {
					{
					_tail();
					setState(2666);
					switch (_input.LA(1)) {
					case MT_directiveArguments_OPT:
						{
						_term();
						setState(2662);
						match(MT_directiveArguments_OPT);
						}
						break;
					case ET_directiveArguments_OPT:
						{
						_embed();
						setState(2664);
						match(ET_directiveArguments_OPT);
						setState(2665);
						match(EMBED_END);
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
				setState(2673);
				match(MT_directiveArguments_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2675);
				match(ET_directiveArguments_OPT);
				setState(2676);
				match(EMBED_END);
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
		enterRule(_localctx, 450, RULE_directiveArguments_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2679);
			directiveArguments_OPT();
			setState(2680);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 452, RULE_directiveArguments);
		try {
			setState(2693);
			switch (_input.LA(1)) {
			case MT_lsquare_TOK:
			case ET_lsquare_TOK:
			case LSQUARE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2683);
				lsquare_TOK();
				setState(2684);
				directives_OPT();
				setState(2685);
				rsquare_TOK();
				_exitAlt();
				}
				break;
			case MT_directiveArguments:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2689);
				match(MT_directiveArguments);
				}
				break;
			case ET_directiveArguments:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2691);
				match(ET_directiveArguments);
				setState(2692);
				match(EMBED_END);
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
		enterRule(_localctx, 454, RULE_directiveArguments_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2695);
			directiveArguments();
			setState(2696);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 456, RULE_directives_OPT);
		int _la;
		try {
			setState(2720);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(2701);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_string_TOK) | (1L << ET_string_TOK) | (1L << MT_colon_TOK) | (1L << ET_colon_TOK))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (MT_lpar_TOK - 95)) | (1L << (ET_lpar_TOK - 95)) | (1L << (MT_literal - 95)) | (1L << (ET_literal - 95)) | (1L << (MT_number_TOK - 95)) | (1L << (ET_number_TOK - 95)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (MT_constructor - 217)) | (1L << (ET_constructor - 217)) | (1L << (MT_constructor_TOK - 217)) | (1L << (ET_constructor_TOK - 217)) | (1L << (MT_qualifier - 217)) | (1L << (ET_qualifier - 217)) | (1L << (MT_directive - 217)) | (1L << (ET_directive - 217)) | (1L << (MT_directives - 217)) | (1L << (ET_directives - 217)) | (1L << (MT_directiveList - 217)) | (1L << (ET_directiveList - 217)) | (1L << (COLON - 217)) | (1L << (LPAR - 217)) | (1L << (CONSTRUCTOR - 217)) | (1L << (STRING - 217)) | (1L << (NUMBER - 217)))) != 0)) {
					{
					setState(2700);
					directives();
					}
				}

				setState(2711);
				_la = _input.LA(1);
				if (_la==MT_directives_OPT || _la==ET_directives_OPT) {
					{
					_tail();
					setState(2709);
					switch (_input.LA(1)) {
					case MT_directives_OPT:
						{
						_term();
						setState(2705);
						match(MT_directives_OPT);
						}
						break;
					case ET_directives_OPT:
						{
						_embed();
						setState(2707);
						match(ET_directives_OPT);
						setState(2708);
						match(EMBED_END);
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
				setState(2716);
				match(MT_directives_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2718);
				match(ET_directives_OPT);
				setState(2719);
				match(EMBED_END);
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
		enterRule(_localctx, 458, RULE_directives_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2722);
			directives_OPT();
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

	public static class DirectivesContext extends ParserRuleContext {
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public Directives_S1_ZOMContext directives_S1_ZOM() {
			return getRuleContext(Directives_S1_ZOMContext.class,0);
		}
		public TerminalNode MT_directives() { return getToken(CrsxMetaParser.MT_directives, 0); }
		public TerminalNode ET_directives() { return getToken(CrsxMetaParser.ET_directives, 0); }
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 460, RULE_directives);
		try {
			setState(2735);
			switch (_input.LA(1)) {
			case MT_string_TOK:
			case ET_string_TOK:
			case MT_colon_TOK:
			case ET_colon_TOK:
			case MT_lpar_TOK:
			case ET_lpar_TOK:
			case MT_literal:
			case ET_literal:
			case MT_number_TOK:
			case ET_number_TOK:
			case MT_constructor:
			case ET_constructor:
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_qualifier:
			case ET_qualifier:
			case MT_directive:
			case ET_directive:
			case MT_directiveList:
			case ET_directiveList:
			case COLON:
			case LPAR:
			case CONSTRUCTOR:
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2726);
				directive();
				setState(2727);
				directives_S1_ZOM();
				_exitAlt();
				}
				break;
			case MT_directives:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2731);
				match(MT_directives);
				}
				break;
			case ET_directives:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2733);
				match(ET_directives);
				setState(2734);
				match(EMBED_END);
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
		enterRule(_localctx, 462, RULE_directives_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2737);
			directives();
			setState(2738);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 464, RULE_directives_S1_ZOM);
		int _la;
		try {
			setState(2765);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterZOM();
				setState(2745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MT_comma_TOK || _la==ET_comma_TOK || ((((_la - 235)) & ~0x3f) == 0 && ((1L << (_la - 235)) & ((1L << (MT_directives_S1 - 235)) | (1L << (ET_directives_S1 - 235)) | (1L << (COMMA - 235)))) != 0)) {
					{
					{
					setState(2742);
					directives_S1();
					}
					}
					setState(2747);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2756);
				_la = _input.LA(1);
				if (_la==MT_directives_S1_ZOM || _la==ET_directives_S1_ZOM) {
					{
					_tail();
					setState(2754);
					switch (_input.LA(1)) {
					case MT_directives_S1_ZOM:
						{
						_term();
						setState(2750);
						match(MT_directives_S1_ZOM);
						}
						break;
					case ET_directives_S1_ZOM:
						{
						_embed();
						setState(2752);
						match(ET_directives_S1_ZOM);
						setState(2753);
						match(EMBED_END);
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
				setState(2761);
				match(MT_directives_S1_ZOM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2763);
				match(ET_directives_S1_ZOM);
				setState(2764);
				match(EMBED_END);
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
		enterRule(_localctx, 466, RULE_directives_S1_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2767);
			directives_S1_ZOM();
			setState(2768);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 468, RULE_directives_S1);
		try {
			setState(2780);
			switch (_input.LA(1)) {
			case MT_comma_TOK:
			case ET_comma_TOK:
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2771);
				comma_TOK();
				setState(2772);
				directive();
				_exitAlt();
				}
				break;
			case MT_directives_S1:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2776);
				match(MT_directives_S1);
				}
				break;
			case ET_directives_S1:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2778);
				match(ET_directives_S1);
				setState(2779);
				match(EMBED_END);
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
		enterRule(_localctx, 470, RULE_directives_S1_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2782);
			directives_S1();
			setState(2783);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 472, RULE_directiveList);
		try {
			setState(2796);
			switch (_input.LA(1)) {
			case MT_lpar_TOK:
			case ET_lpar_TOK:
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(2786);
				lpar_TOK();
				setState(2787);
				declarations_OPT();
				setState(2788);
				rpar_TOK();
				_exitAlt();
				}
				break;
			case MT_directiveList:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2792);
				match(MT_directiveList);
				}
				break;
			case ET_directiveList:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2794);
				match(ET_directiveList);
				setState(2795);
				match(EMBED_END);
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
		enterRule(_localctx, 474, RULE_directiveList_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2798);
			directiveList();
			setState(2799);
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
		public TerminalNode EMBED_END() { return getToken(CrsxMetaParser.EMBED_END, 0); }
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
		enterRule(_localctx, 476, RULE_declarations_OPT);
		int _la;
		try {
			setState(2823);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(2804);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_declarations) | (1L << ET_declarations) | (1L << MT_declaration) | (1L << ET_declaration) | (1L << MT_moduleDeclaration) | (1L << ET_moduleDeclaration) | (1L << MT_module_TOK) | (1L << ET_module_TOK) | (1L << MT_string_TOK) | (1L << ET_string_TOK) | (1L << MT_lbrace_TOK) | (1L << ET_lbrace_TOK) | (1L << MT_ruleDeclaration) | (1L << ET_ruleDeclaration) | (1L << MT_option_OPT) | (1L << ET_option_OPT) | (1L << MT_option) | (1L << ET_option) | (1L << MT_colon_TOK) | (1L << ET_colon_TOK) | (1L << MT_pattern) | (1L << ET_pattern) | (1L << MT_properties_OPT) | (1L << ET_properties_OPT) | (1L << MT_annotations) | (1L << ET_annotations) | (1L << MT_annotation_OOM) | (1L << ET_annotation_OOM) | (1L << MT_annotation) | (1L << ET_annotation) | (1L << MT_at_TOK) | (1L << ET_at_TOK))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (MT_lpar_TOK - 95)) | (1L << (ET_lpar_TOK - 95)) | (1L << (MT_variable - 95)) | (1L << (ET_variable - 95)) | (1L << (MT_variable_TOK - 95)) | (1L << (ET_variable_TOK - 95)) | (1L << (MT_literal - 95)) | (1L << (ET_literal - 95)) | (1L << (MT_number_TOK - 95)) | (1L << (ET_number_TOK - 95)))) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (MT_properties - 163)) | (1L << (ET_properties - 163)) | (1L << (MT_sortDeclaration - 163)) | (1L << (ET_sortDeclaration - 163)) | (1L << (MT_sortparams_OPT - 163)) | (1L << (ET_sortparams_OPT - 163)) | (1L << (MT_sortparams - 163)) | (1L << (ET_sortparams - 163)) | (1L << (MT_forall_TOK - 163)) | (1L << (ET_forall_TOK - 163)) | (1L << (MT_sortset - 163)) | (1L << (ET_sortset - 163)) | (1L << (MT_sortname - 163)) | (1L << (ET_sortname - 163)) | (1L << (MT_form - 163)) | (1L << (ET_form - 163)) | (1L << (MT_constructor - 163)) | (1L << (ET_constructor - 163)) | (1L << (MT_constructor_TOK - 163)) | (1L << (ET_constructor_TOK - 163)) | (1L << (MT_qualifier - 163)) | (1L << (ET_qualifier - 163)) | (1L << (MT_directive - 163)) | (1L << (ET_directive - 163)))) != 0) || ((((_la - 237)) & ~0x3f) == 0 && ((1L << (_la - 237)) & ((1L << (MT_directiveList - 237)) | (1L << (ET_directiveList - 237)) | (1L << (MODULE - 237)) | (1L << (COLON - 237)) | (1L << (FORALL - 237)) | (1L << (LPAR - 237)) | (1L << (LBRACE - 237)) | (1L << (AT - 237)) | (1L << (CONSTRUCTOR - 237)) | (1L << (VARIABLE - 237)) | (1L << (STRING - 237)) | (1L << (NUMBER - 237)))) != 0)) {
					{
					setState(2803);
					declarations();
					}
				}

				setState(2814);
				_la = _input.LA(1);
				if (_la==MT_declarations_OPT || _la==ET_declarations_OPT) {
					{
					_tail();
					setState(2812);
					switch (_input.LA(1)) {
					case MT_declarations_OPT:
						{
						_term();
						setState(2808);
						match(MT_declarations_OPT);
						}
						break;
					case ET_declarations_OPT:
						{
						_embed();
						setState(2810);
						match(ET_declarations_OPT);
						setState(2811);
						match(EMBED_END);
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
				setState(2819);
				match(MT_declarations_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2821);
				match(ET_declarations_OPT);
				setState(2822);
				match(EMBED_END);
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
		enterRule(_localctx, 478, RULE_declarations_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2825);
			declarations_OPT();
			setState(2826);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0112\u0b0f\4\2\t"+
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
		"\t\u00f1\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u01ec\n\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u01fb\n\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\7\6\u0203\n\6\f\6\16\6\u0206\13\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u020e\n\6\5\6\u0210\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0219\n\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0228\n\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0235\n\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\5\f\u023d\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0245\n\f\5\f\u0247"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0250\n\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u026a\n\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u027c\n\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0289\n\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0296\n\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u02a3\n\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u02b0\n\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u02c1\n\32\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u02c9\n\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\5\34\u02d1\n\34\5\34\u02d3\n\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u02dc\n\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u02e9\n\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u02fd\n \3!\3!\3!\3\"\3\"\3\"\5\"\u0305"+
		"\n\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u030d\n\"\5\"\u030f\n\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\5\"\u0318\n\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0325"+
		"\n$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0335\n&\3\'\3\'\3\'"+
		"\3(\3(\3(\5(\u033d\n(\3(\3(\3(\3(\3(\3(\5(\u0345\n(\5(\u0347\n(\3(\3("+
		"\3(\3(\3(\3(\3(\5(\u0350\n(\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u035e"+
		"\n*\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u036c\n,\3-\3-\3-\3.\3.\3."+
		"\6.\u0374\n.\r.\16.\u0375\3.\3.\3.\3.\3.\3.\5.\u037e\n.\5.\u0380\n.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\5.\u038a\n.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\5\60\u039a\n\60\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u03a7\n\62\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u03b9\n\64"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\5\66\u03f4\n\66\3\67\3\67\3\67\38\38\38\58\u03fc\n8\38\38\38\38"+
		"\38\38\58\u0404\n8\58\u0406\n8\38\38\38\38\38\38\38\58\u040f\n8\39\39"+
		"\39\3:\3:\3:\3:\3:\3:\3:\3:\5:\u041c\n:\3;\3;\3;\3<\3<\3<\5<\u0424\n<"+
		"\3<\3<\3<\3<\3<\3<\5<\u042c\n<\5<\u042e\n<\3<\3<\3<\3<\3<\3<\3<\5<\u0437"+
		"\n<\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u0446\n>\3?\3?\3?\3@\3@"+
		"\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u045a\n@\3A\3A\3A\3B\3B\3B"+
		"\3B\3B\3B\3B\3B\5B\u0467\nB\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\5D\u0477\nD\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0484\nF\3G\3G\3G\3H"+
		"\3H\3H\5H\u048c\nH\3H\3H\3H\3H\3H\3H\5H\u0494\nH\5H\u0496\nH\3H\3H\3H"+
		"\3H\3H\3H\3H\5H\u049f\nH\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\5J\u04ac\nJ"+
		"\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u04bb\nL\3M\3M\3M\3N\3N\3N"+
		"\7N\u04c3\nN\fN\16N\u04c6\13N\3N\3N\3N\3N\3N\3N\5N\u04ce\nN\5N\u04d0\n"+
		"N\3N\3N\3N\3N\3N\3N\3N\5N\u04d9\nN\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3"+
		"P\3P\5P\u04e8\nP\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\5R\u04f5\nR\3S\3S\3"+
		"S\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u0505\nT\3U\3U\3U\3V\3V\3V\5V\u050d"+
		"\nV\3V\3V\3V\3V\3V\3V\5V\u0515\nV\5V\u0517\nV\3V\3V\3V\3V\3V\3V\3V\5V"+
		"\u0520\nV\3W\3W\3W\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u052f\nX\3Y\3Y\3Y"+
		"\3Z\3Z\3Z\7Z\u0537\nZ\fZ\16Z\u053a\13Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0542\nZ\5"+
		"Z\u0544\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u054d\nZ\3[\3[\3[\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\5\\\u055c\n\\\3]\3]\3]\3^\3^\3^\3^\3^\3^\3^\3^"+
		"\3^\3^\3^\5^\u056c\n^\3_\3_\3_\3`\3`\3`\3`\3`\3`\3`\3`\5`\u0579\n`\3a"+
		"\3a\3a\3b\3b\3b\5b\u0581\nb\3b\3b\3b\3b\3b\3b\5b\u0589\nb\5b\u058b\nb"+
		"\3b\3b\3b\3b\3b\3b\3b\5b\u0594\nb\3c\3c\3c\3d\3d\3d\3d\3d\3d\3d\3d\5d"+
		"\u05a1\nd\3e\3e\3e\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u05b0\nf\3g\3g\3g"+
		"\3h\3h\3h\7h\u05b8\nh\fh\16h\u05bb\13h\3h\3h\3h\3h\3h\3h\5h\u05c3\nh\5"+
		"h\u05c5\nh\3h\3h\3h\3h\3h\3h\3h\5h\u05ce\nh\3i\3i\3i\3j\3j\3j\3j\3j\3"+
		"j\3j\3j\3j\3j\5j\u05dd\nj\3k\3k\3k\3l\3l\3l\5l\u05e5\nl\3l\3l\3l\3l\3"+
		"l\3l\5l\u05ed\nl\5l\u05ef\nl\3l\3l\3l\3l\3l\3l\3l\5l\u05f8\nl\3m\3m\3"+
		"m\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\5n\u0609\nn\3o\3o\3o\3p\3p\3p\3"+
		"p\3p\3p\3p\3p\5p\u0616\np\3q\3q\3q\3r\3r\3r\5r\u061e\nr\3r\3r\3r\3r\3"+
		"r\3r\5r\u0626\nr\5r\u0628\nr\3r\3r\3r\3r\3r\3r\3r\5r\u0631\nr\3s\3s\3"+
		"s\3t\3t\3t\5t\u0639\nt\3t\3t\3t\3t\3t\3t\5t\u0641\nt\5t\u0643\nt\3t\3"+
		"t\3t\3t\3t\3t\3t\5t\u064c\nt\3u\3u\3u\3v\3v\3v\5v\u0654\nv\3v\3v\3v\3"+
		"v\3v\3v\5v\u065c\nv\5v\u065e\nv\3v\3v\3v\3v\3v\3v\3v\5v\u0667\nv\3w\3"+
		"w\3w\3x\3x\3x\3x\3x\3x\3x\3x\3x\5x\u0675\nx\3y\3y\3y\3z\3z\3z\3z\3z\3"+
		"z\3z\3z\5z\u0682\nz\3{\3{\3{\3|\3|\3|\3|\3|\3|\3|\3|\3|\5|\u0690\n|\3"+
		"}\3}\3}\3~\3~\3~\3~\3~\3~\3~\3~\5~\u069d\n~\3\177\3\177\3\177\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\5\u0080\u06af\n\u0080\3\u0081\3\u0081\3\u0081"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082"+
		"\u06bc\n\u0082\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u06cb\n\u0084"+
		"\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u06da\n\u0086\3\u0087\3\u0087"+
		"\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\5\u0088\u06e7\n\u0088\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\5\u008a\u06f8\n\u008a\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u0705\n\u008c\3\u008d"+
		"\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\5\u008e\u070d\n\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u0715\n\u008e\5\u008e"+
		"\u0717\n\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\5\u008e\u0720\n\u008e\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u072f"+
		"\n\u0090\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\7\u0092\u0737"+
		"\n\u0092\f\u0092\16\u0092\u073a\13\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\5\u0092\u0742\n\u0092\5\u0092\u0744\n\u0092\3\u0092\3"+
		"\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u074d\n\u0092\3"+
		"\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u075c\n\u0094\3\u0095\3\u0095"+
		"\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\5\u0096\u0769\n\u0096\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u0778"+
		"\n\u0098\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\7\u009a\u0780"+
		"\n\u009a\f\u009a\16\u009a\u0783\13\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\5\u009a\u078b\n\u009a\5\u009a\u078d\n\u009a\3\u009a\3"+
		"\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u0796\n\u009a\3"+
		"\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u07a5\n\u009c\3\u009d\3\u009d"+
		"\3\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\3\u009e\5\u009e\u07b3\n\u009e\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u07c1"+
		"\n\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u07ce\n\u00a2\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\5\u00a4\u07de\n\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a6"+
		"\3\u00a6\3\u00a6\5\u00a6\u07e6\n\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\5\u00a6\u07ee\n\u00a6\5\u00a6\u07f0\n\u00a6\3\u00a6\3"+
		"\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u07f9\n\u00a6\3"+
		"\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u0808\n\u00a8\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00aa\3\u00aa\3\u00aa\7\u00aa\u0810\n\u00aa\f\u00aa\16\u00aa"+
		"\u0813\13\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\5\u00aa"+
		"\u081b\n\u00aa\5\u00aa\u081d\n\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3"+
		"\u00aa\3\u00aa\3\u00aa\5\u00aa\u0826\n\u00aa\3\u00ab\3\u00ab\3\u00ab\3"+
		"\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\5\u00ac\u0835\n\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae"+
		"\3\u00ae\5\u00ae\u083d\n\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\5\u00ae\u0845\n\u00ae\5\u00ae\u0847\n\u00ae\3\u00ae\3\u00ae\3"+
		"\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u0850\n\u00ae\3\u00af\3"+
		"\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u088d\n\u00b0\3\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\5\u00b2\u089a\n\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u08a8\n\u00b4"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6"+
		"\u08c4\n\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b8\5\u00b8"+
		"\u08cc\n\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8"+
		"\u08d4\n\u00b8\5\u00b8\u08d6\n\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3"+
		"\u00b8\3\u00b8\3\u00b8\5\u00b8\u08df\n\u00b8\3\u00b9\3\u00b9\3\u00b9\3"+
		"\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba"+
		"\u08ec\n\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u08fc"+
		"\n\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\5\u00be\u0909\n\u00be\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00c0\3\u00c0\3\u00c0\6\u00c0\u0911\n\u00c0\r\u00c0\16\u00c0\u0912"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u091b\n\u00c0"+
		"\5\u00c0\u091d\n\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\5\u00c0\u0927\n\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2"+
		"\u0935\n\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u0944\n\u00c4"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c6\3\u00c6\3\u00c6\7\u00c6\u094c\n\u00c6"+
		"\f\u00c6\16\u00c6\u094f\13\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\5\u00c6\u0957\n\u00c6\5\u00c6\u0959\n\u00c6\3\u00c6\3\u00c6\3"+
		"\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0962\n\u00c6\3\u00c7\3"+
		"\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0971\n\u00c8\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0984\n\u00ca\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u098c\n\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u0994\n\u00cc\5\u00cc"+
		"\u0996\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\5\u00cc\u099f\n\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce"+
		"\u09af\n\u00ce\3\u00cf\3\u00cf\3\u00cf\3\u00d0\3\u00d0\3\u00d0\5\u00d0"+
		"\u09b7\n\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0"+
		"\u09bf\n\u00d0\5\u00d0\u09c1\n\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3"+
		"\u00d0\3\u00d0\3\u00d0\5\u00d0\u09ca\n\u00d0\3\u00d1\3\u00d1\3\u00d1\3"+
		"\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\5\u00d2\u09d8\n\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d4\3\u00d4\3\u00d4"+
		"\7\u00d4\u09e0\n\u00d4\f\u00d4\16\u00d4\u09e3\13\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u09eb\n\u00d4\5\u00d4\u09ed\n"+
		"\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4"+
		"\u09f6\n\u00d4\3\u00d5\3\u00d5\3\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\5\u00d6\u0a05\n\u00d6"+
		"\3\u00d7\3\u00d7\3\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u0a14\n\u00d8\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\5\u00da\u0a27\n\u00da"+
		"\3\u00db\3\u00db\3\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc"+
		"\3\u00dc\3\u00dc\5\u00dc\u0a34\n\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00de"+
		"\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de"+
		"\3\u00de\3\u00de\3\u00de\5\u00de\u0a46\n\u00de\3\u00df\3\u00df\3\u00df"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0"+
		"\5\u00e0\u0a5d\n\u00e0\3\u00e1\3\u00e1\3\u00e1\3\u00e2\3\u00e2\3\u00e2"+
		"\5\u00e2\u0a65\n\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\5\u00e2\u0a6d\n\u00e2\5\u00e2\u0a6f\n\u00e2\3\u00e2\3\u00e2\3\u00e2\3"+
		"\u00e2\3\u00e2\3\u00e2\3\u00e2\5\u00e2\u0a78\n\u00e2\3\u00e3\3\u00e3\3"+
		"\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\5\u00e4\u0a88\n\u00e4\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e6\3\u00e6\3\u00e6\5\u00e6\u0a90\n\u00e6\3\u00e6\3\u00e6\3\u00e6"+
		"\3\u00e6\3\u00e6\3\u00e6\5\u00e6\u0a98\n\u00e6\5\u00e6\u0a9a\n\u00e6\3"+
		"\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\5\u00e6\u0aa3\n"+
		"\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8"+
		"\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\5\u00e8\u0ab2\n\u00e8\3\u00e9"+
		"\3\u00e9\3\u00e9\3\u00ea\3\u00ea\3\u00ea\7\u00ea\u0aba\n\u00ea\f\u00ea"+
		"\16\u00ea\u0abd\13\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea"+
		"\5\u00ea\u0ac5\n\u00ea\5\u00ea\u0ac7\n\u00ea\3\u00ea\3\u00ea\3\u00ea\3"+
		"\u00ea\3\u00ea\3\u00ea\3\u00ea\5\u00ea\u0ad0\n\u00ea\3\u00eb\3\u00eb\3"+
		"\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\5\u00ec\u0adf\n\u00ec\3\u00ed\3\u00ed\3\u00ed\3\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ee\5\u00ee\u0aef\n\u00ee\3\u00ef\3\u00ef\3\u00ef\3\u00f0\3\u00f0"+
		"\3\u00f0\5\u00f0\u0af7\n\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0"+
		"\3\u00f0\5\u00f0\u0aff\n\u00f0\5\u00f0\u0b01\n\u00f0\3\u00f0\3\u00f0\3"+
		"\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\5\u00f0\u0b0a\n\u00f0\3\u00f1\3"+
		"\u00f1\3\u00f1\3\u00f1\2\2\u00f2\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a"+
		"\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142"+
		"\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a"+
		"\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172"+
		"\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a"+
		"\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2"+
		"\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba"+
		"\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2"+
		"\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0\2\2\u0b92\2\u01eb\3\2\2\2\4"+
		"\u01ed\3\2\2\2\6\u01fa\3\2\2\2\b\u01fc\3\2\2\2\n\u0218\3\2\2\2\f\u021a"+
		"\3\2\2\2\16\u0227\3\2\2\2\20\u0229\3\2\2\2\22\u0234\3\2\2\2\24\u0236\3"+
		"\2\2\2\26\u024f\3\2\2\2\30\u0251\3\2\2\2\32\u0269\3\2\2\2\34\u026b\3\2"+
		"\2\2\36\u027b\3\2\2\2 \u027d\3\2\2\2\"\u0288\3\2\2\2$\u028a\3\2\2\2&\u0295"+
		"\3\2\2\2(\u0297\3\2\2\2*\u02a2\3\2\2\2,\u02a4\3\2\2\2.\u02af\3\2\2\2\60"+
		"\u02b1\3\2\2\2\62\u02c0\3\2\2\2\64\u02c2\3\2\2\2\66\u02db\3\2\2\28\u02dd"+
		"\3\2\2\2:\u02e8\3\2\2\2<\u02ea\3\2\2\2>\u02fc\3\2\2\2@\u02fe\3\2\2\2B"+
		"\u0317\3\2\2\2D\u0319\3\2\2\2F\u0324\3\2\2\2H\u0326\3\2\2\2J\u0334\3\2"+
		"\2\2L\u0336\3\2\2\2N\u034f\3\2\2\2P\u0351\3\2\2\2R\u035d\3\2\2\2T\u035f"+
		"\3\2\2\2V\u036b\3\2\2\2X\u036d\3\2\2\2Z\u0389\3\2\2\2\\\u038b\3\2\2\2"+
		"^\u0399\3\2\2\2`\u039b\3\2\2\2b\u03a6\3\2\2\2d\u03a8\3\2\2\2f\u03b8\3"+
		"\2\2\2h\u03ba\3\2\2\2j\u03f3\3\2\2\2l\u03f5\3\2\2\2n\u040e\3\2\2\2p\u0410"+
		"\3\2\2\2r\u041b\3\2\2\2t\u041d\3\2\2\2v\u0436\3\2\2\2x\u0438\3\2\2\2z"+
		"\u0445\3\2\2\2|\u0447\3\2\2\2~\u0459\3\2\2\2\u0080\u045b\3\2\2\2\u0082"+
		"\u0466\3\2\2\2\u0084\u0468\3\2\2\2\u0086\u0476\3\2\2\2\u0088\u0478\3\2"+
		"\2\2\u008a\u0483\3\2\2\2\u008c\u0485\3\2\2\2\u008e\u049e\3\2\2\2\u0090"+
		"\u04a0\3\2\2\2\u0092\u04ab\3\2\2\2\u0094\u04ad\3\2\2\2\u0096\u04ba\3\2"+
		"\2\2\u0098\u04bc\3\2\2\2\u009a\u04d8\3\2\2\2\u009c\u04da\3\2\2\2\u009e"+
		"\u04e7\3\2\2\2\u00a0\u04e9\3\2\2\2\u00a2\u04f4\3\2\2\2\u00a4\u04f6\3\2"+
		"\2\2\u00a6\u0504\3\2\2\2\u00a8\u0506\3\2\2\2\u00aa\u051f\3\2\2\2\u00ac"+
		"\u0521\3\2\2\2\u00ae\u052e\3\2\2\2\u00b0\u0530\3\2\2\2\u00b2\u054c\3\2"+
		"\2\2\u00b4\u054e\3\2\2\2\u00b6\u055b\3\2\2\2\u00b8\u055d\3\2\2\2\u00ba"+
		"\u056b\3\2\2\2\u00bc\u056d\3\2\2\2\u00be\u0578\3\2\2\2\u00c0\u057a\3\2"+
		"\2\2\u00c2\u0593\3\2\2\2\u00c4\u0595\3\2\2\2\u00c6\u05a0\3\2\2\2\u00c8"+
		"\u05a2\3\2\2\2\u00ca\u05af\3\2\2\2\u00cc\u05b1\3\2\2\2\u00ce\u05cd\3\2"+
		"\2\2\u00d0\u05cf\3\2\2\2\u00d2\u05dc\3\2\2\2\u00d4\u05de\3\2\2\2\u00d6"+
		"\u05f7\3\2\2\2\u00d8\u05f9\3\2\2\2\u00da\u0608\3\2\2\2\u00dc\u060a\3\2"+
		"\2\2\u00de\u0615\3\2\2\2\u00e0\u0617\3\2\2\2\u00e2\u0630\3\2\2\2\u00e4"+
		"\u0632\3\2\2\2\u00e6\u064b\3\2\2\2\u00e8\u064d\3\2\2\2\u00ea\u0666\3\2"+
		"\2\2\u00ec\u0668\3\2\2\2\u00ee\u0674\3\2\2\2\u00f0\u0676\3\2\2\2\u00f2"+
		"\u0681\3\2\2\2\u00f4\u0683\3\2\2\2\u00f6\u068f\3\2\2\2\u00f8\u0691\3\2"+
		"\2\2\u00fa\u069c\3\2\2\2\u00fc\u069e\3\2\2\2\u00fe\u06ae\3\2\2\2\u0100"+
		"\u06b0\3\2\2\2\u0102\u06bb\3\2\2\2\u0104\u06bd\3\2\2\2\u0106\u06ca\3\2"+
		"\2\2\u0108\u06cc\3\2\2\2\u010a\u06d9\3\2\2\2\u010c\u06db\3\2\2\2\u010e"+
		"\u06e6\3\2\2\2\u0110\u06e8\3\2\2\2\u0112\u06f7\3\2\2\2\u0114\u06f9\3\2"+
		"\2\2\u0116\u0704\3\2\2\2\u0118\u0706\3\2\2\2\u011a\u071f\3\2\2\2\u011c"+
		"\u0721\3\2\2\2\u011e\u072e\3\2\2\2\u0120\u0730\3\2\2\2\u0122\u074c\3\2"+
		"\2\2\u0124\u074e\3\2\2\2\u0126\u075b\3\2\2\2\u0128\u075d\3\2\2\2\u012a"+
		"\u0768\3\2\2\2\u012c\u076a\3\2\2\2\u012e\u0777\3\2\2\2\u0130\u0779\3\2"+
		"\2\2\u0132\u0795\3\2\2\2\u0134\u0797\3\2\2\2\u0136\u07a4\3\2\2\2\u0138"+
		"\u07a6\3\2\2\2\u013a\u07b2\3\2\2\2\u013c\u07b4\3\2\2\2\u013e\u07c0\3\2"+
		"\2\2\u0140\u07c2\3\2\2\2\u0142\u07cd\3\2\2\2\u0144\u07cf\3\2\2\2\u0146"+
		"\u07dd\3\2\2\2\u0148\u07df\3\2\2\2\u014a\u07f8\3\2\2\2\u014c\u07fa\3\2"+
		"\2\2\u014e\u0807\3\2\2\2\u0150\u0809\3\2\2\2\u0152\u0825\3\2\2\2\u0154"+
		"\u0827\3\2\2\2\u0156\u0834\3\2\2\2\u0158\u0836\3\2\2\2\u015a\u084f\3\2"+
		"\2\2\u015c\u0851\3\2\2\2\u015e\u088c\3\2\2\2\u0160\u088e\3\2\2\2\u0162"+
		"\u0899\3\2\2\2\u0164\u089b\3\2\2\2\u0166\u08a7\3\2\2\2\u0168\u08a9\3\2"+
		"\2\2\u016a\u08c3\3\2\2\2\u016c\u08c5\3\2\2\2\u016e\u08de\3\2\2\2\u0170"+
		"\u08e0\3\2\2\2\u0172\u08eb\3\2\2\2\u0174\u08ed\3\2\2\2\u0176\u08fb\3\2"+
		"\2\2\u0178\u08fd\3\2\2\2\u017a\u0908\3\2\2\2\u017c\u090a\3\2\2\2\u017e"+
		"\u0926\3\2\2\2\u0180\u0928\3\2\2\2\u0182\u0934\3\2\2\2\u0184\u0936\3\2"+
		"\2\2\u0186\u0943\3\2\2\2\u0188\u0945\3\2\2\2\u018a\u0961\3\2\2\2\u018c"+
		"\u0963\3\2\2\2\u018e\u0970\3\2\2\2\u0190\u0972\3\2\2\2\u0192\u0983\3\2"+
		"\2\2\u0194\u0985\3\2\2\2\u0196\u099e\3\2\2\2\u0198\u09a0\3\2\2\2\u019a"+
		"\u09ae\3\2\2\2\u019c\u09b0\3\2\2\2\u019e\u09c9\3\2\2\2\u01a0\u09cb\3\2"+
		"\2\2\u01a2\u09d7\3\2\2\2\u01a4\u09d9\3\2\2\2\u01a6\u09f5\3\2\2\2\u01a8"+
		"\u09f7\3\2\2\2\u01aa\u0a04\3\2\2\2\u01ac\u0a06\3\2\2\2\u01ae\u0a13\3\2"+
		"\2\2\u01b0\u0a15\3\2\2\2\u01b2\u0a26\3\2\2\2\u01b4\u0a28\3\2\2\2\u01b6"+
		"\u0a33\3\2\2\2\u01b8\u0a35\3\2\2\2\u01ba\u0a45\3\2\2\2\u01bc\u0a47\3\2"+
		"\2\2\u01be\u0a5c\3\2\2\2\u01c0\u0a5e\3\2\2\2\u01c2\u0a77\3\2\2\2\u01c4"+
		"\u0a79\3\2\2\2\u01c6\u0a87\3\2\2\2\u01c8\u0a89\3\2\2\2\u01ca\u0aa2\3\2"+
		"\2\2\u01cc\u0aa4\3\2\2\2\u01ce\u0ab1\3\2\2\2\u01d0\u0ab3\3\2\2\2\u01d2"+
		"\u0acf\3\2\2\2\u01d4\u0ad1\3\2\2\2\u01d6\u0ade\3\2\2\2\u01d8\u0ae0\3\2"+
		"\2\2\u01da\u0aee\3\2\2\2\u01dc\u0af0\3\2\2\2\u01de\u0b09\3\2\2\2\u01e0"+
		"\u0b0b\3\2\2\2\u01e2\u01e3\b\2\1\2\u01e3\u01e4\5\6\4\2\u01e4\u01e5\b\2"+
		"\1\2\u01e5\u01ec\3\2\2\2\u01e6\u01e7\b\2\1\2\u01e7\u01ec\7\3\2\2\u01e8"+
		"\u01e9\b\2\1\2\u01e9\u01ea\7\4\2\2\u01ea\u01ec\7\u0112\2\2\u01eb\u01e2"+
		"\3\2\2\2\u01eb\u01e6\3\2\2\2\u01eb\u01e8\3\2\2\2\u01ec\3\3\2\2\2\u01ed"+
		"\u01ee\5\2\2\2\u01ee\u01ef\7\2\2\3\u01ef\5\3\2\2\2\u01f0\u01f1\b\4\1\2"+
		"\u01f1\u01f2\5\32\16\2\u01f2\u01f3\5\n\6\2\u01f3\u01f4\b\4\1\2\u01f4\u01fb"+
		"\3\2\2\2\u01f5\u01f6\b\4\1\2\u01f6\u01fb\7\5\2\2\u01f7\u01f8\b\4\1\2\u01f8"+
		"\u01f9\7\6\2\2\u01f9\u01fb\7\u0112\2\2\u01fa\u01f0\3\2\2\2\u01fa\u01f5"+
		"\3\2\2\2\u01fa\u01f7\3\2\2\2\u01fb\7\3\2\2\2\u01fc\u01fd\5\6\4\2\u01fd"+
		"\u01fe\7\2\2\3\u01fe\t\3\2\2\2\u01ff\u0200\b\6\1\2\u0200\u0204\b\6\1\2"+
		"\u0201\u0203\5\16\b\2\u0202\u0201\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202"+
		"\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u020f\3\2\2\2\u0206\u0204\3\2\2\2\u0207"+
		"\u020d\b\6\1\2\u0208\u0209\b\6\1\2\u0209\u020e\7\7\2\2\u020a\u020b\b\6"+
		"\1\2\u020b\u020c\7\b\2\2\u020c\u020e\7\u0112\2\2\u020d\u0208\3\2\2\2\u020d"+
		"\u020a\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u0207\3\2\2\2\u020f\u0210\3\2"+
		"\2\2\u0210\u0211\3\2\2\2\u0211\u0212\b\6\1\2\u0212\u0219\b\6\1\2\u0213"+
		"\u0214\b\6\1\2\u0214\u0219\7\7\2\2\u0215\u0216\b\6\1\2\u0216\u0217\7\b"+
		"\2\2\u0217\u0219\7\u0112\2\2\u0218\u01ff\3\2\2\2\u0218\u0213\3\2\2\2\u0218"+
		"\u0215\3\2\2\2\u0219\13\3\2\2\2\u021a\u021b\5\n\6\2\u021b\u021c\7\2\2"+
		"\3\u021c\r\3\2\2\2\u021d\u021e\b\b\1\2\u021e\u021f\5\22\n\2\u021f\u0220"+
		"\5\26\f\2\u0220\u0221\b\b\1\2\u0221\u0228\3\2\2\2\u0222\u0223\b\b\1\2"+
		"\u0223\u0228\7\t\2\2\u0224\u0225\b\b\1\2\u0225\u0226\7\n\2\2\u0226\u0228"+
		"\7\u0112\2\2\u0227\u021d\3\2\2\2\u0227\u0222\3\2\2\2\u0227\u0224\3\2\2"+
		"\2\u0228\17\3\2\2\2\u0229\u022a\5\16\b\2\u022a\u022b\7\2\2\3\u022b\21"+
		"\3\2\2\2\u022c\u022d\b\n\1\2\u022d\u022e\7\u00ff\2\2\u022e\u0235\b\n\1"+
		"\2\u022f\u0230\b\n\1\2\u0230\u0235\7\13\2\2\u0231\u0232\b\n\1\2\u0232"+
		"\u0233\7\f\2\2\u0233\u0235\7\u0112\2\2\u0234\u022c\3\2\2\2\u0234\u022f"+
		"\3\2\2\2\u0234\u0231\3\2\2\2\u0235\23\3\2\2\2\u0236\u0237\5\22\n\2\u0237"+
		"\u0238\7\2\2\3\u0238\25\3\2\2\2\u0239\u023a\b\f\1\2\u023a\u023c\b\f\1"+
		"\2\u023b\u023d\5\32\16\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d"+
		"\u0246\3\2\2\2\u023e\u0244\b\f\1\2\u023f\u0240\b\f\1\2\u0240\u0245\7\r"+
		"\2\2\u0241\u0242\b\f\1\2\u0242\u0243\7\16\2\2\u0243\u0245\7\u0112\2\2"+
		"\u0244\u023f\3\2\2\2\u0244\u0241\3\2\2\2\u0245\u0247\3\2\2\2\u0246\u023e"+
		"\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\b\f\1\2\u0249"+
		"\u0250\b\f\1\2\u024a\u024b\b\f\1\2\u024b\u0250\7\r\2\2\u024c\u024d\b\f"+
		"\1\2\u024d\u024e\7\16\2\2\u024e\u0250\7\u0112\2\2\u024f\u0239\3\2\2\2"+
		"\u024f\u024a\3\2\2\2\u024f\u024c\3\2\2\2\u0250\27\3\2\2\2\u0251\u0252"+
		"\5\26\f\2\u0252\u0253\7\2\2\3\u0253\31\3\2\2\2\u0254\u0255\b\16\1\2\u0255"+
		"\u0256\5\36\20\2\u0256\u0257\b\16\1\2\u0257\u026a\3\2\2\2\u0258\u0259"+
		"\b\16\1\2\u0259\u025a\5\62\32\2\u025a\u025b\b\16\1\2\u025b\u026a\3\2\2"+
		"\2\u025c\u025d\b\16\1\2\u025d\u025e\5\u016a\u00b6\2\u025e\u025f\b\16\1"+
		"\2\u025f\u026a\3\2\2\2\u0260\u0261\b\16\1\2\u0261\u0262\5\u01be\u00e0"+
		"\2\u0262\u0263\b\16\1\2\u0263\u026a\3\2\2\2\u0264\u0265\b\16\1\2\u0265"+
		"\u026a\7\17\2\2\u0266\u0267\b\16\1\2\u0267\u0268\7\20\2\2\u0268\u026a"+
		"\7\u0112\2\2\u0269\u0254\3\2\2\2\u0269\u0258\3\2\2\2\u0269\u025c\3\2\2"+
		"\2\u0269\u0260\3\2\2\2\u0269\u0264\3\2\2\2\u0269\u0266\3\2\2\2\u026a\33"+
		"\3\2\2\2\u026b\u026c\5\32\16\2\u026c\u026d\7\2\2\3\u026d\35\3\2\2\2\u026e"+
		"\u026f\b\20\1\2\u026f\u0270\5\"\22\2\u0270\u0271\5&\24\2\u0271\u0272\5"+
		"*\26\2\u0272\u0273\5\6\4\2\u0273\u0274\5.\30\2\u0274\u0275\b\20\1\2\u0275"+
		"\u027c\3\2\2\2\u0276\u0277\b\20\1\2\u0277\u027c\7\21\2\2\u0278\u0279\b"+
		"\20\1\2\u0279\u027a\7\22\2\2\u027a\u027c\7\u0112\2\2\u027b\u026e\3\2\2"+
		"\2\u027b\u0276\3\2\2\2\u027b\u0278\3\2\2\2\u027c\37\3\2\2\2\u027d\u027e"+
		"\5\36\20\2\u027e\u027f\7\2\2\3\u027f!\3\2\2\2\u0280\u0281\b\22\1\2\u0281"+
		"\u0282\7\u00f3\2\2\u0282\u0289\b\22\1\2\u0283\u0284\b\22\1\2\u0284\u0289"+
		"\7\23\2\2\u0285\u0286\b\22\1\2\u0286\u0287\7\24\2\2\u0287\u0289\7\u0112"+
		"\2\2\u0288\u0280\3\2\2\2\u0288\u0283\3\2\2\2\u0288\u0285\3\2\2\2\u0289"+
		"#\3\2\2\2\u028a\u028b\5\"\22\2\u028b\u028c\7\2\2\3\u028c%\3\2\2\2\u028d"+
		"\u028e\b\24\1\2\u028e\u028f\7\u010c\2\2\u028f\u0296\b\24\1\2\u0290\u0291"+
		"\b\24\1\2\u0291\u0296\7\25\2\2\u0292\u0293\b\24\1\2\u0293\u0294\7\26\2"+
		"\2\u0294\u0296\7\u0112\2\2\u0295\u028d\3\2\2\2\u0295\u0290\3\2\2\2\u0295"+
		"\u0292\3\2\2\2\u0296\'\3\2\2\2\u0297\u0298\5&\24\2\u0298\u0299\7\2\2\3"+
		"\u0299)\3\2\2\2\u029a\u029b\b\26\1\2\u029b\u029c\7\u00fb\2\2\u029c\u02a3"+
		"\b\26\1\2\u029d\u029e\b\26\1\2\u029e\u02a3\7\27\2\2\u029f\u02a0\b\26\1"+
		"\2\u02a0\u02a1\7\30\2\2\u02a1\u02a3\7\u0112\2\2\u02a2\u029a\3\2\2\2\u02a2"+
		"\u029d\3\2\2\2\u02a2\u029f\3\2\2\2\u02a3+\3\2\2\2\u02a4\u02a5\5*\26\2"+
		"\u02a5\u02a6\7\2\2\3\u02a6-\3\2\2\2\u02a7\u02a8\b\30\1\2\u02a8\u02a9\7"+
		"\u00fc\2\2\u02a9\u02b0\b\30\1\2\u02aa\u02ab\b\30\1\2\u02ab\u02b0\7\31"+
		"\2\2\u02ac\u02ad\b\30\1\2\u02ad\u02ae\7\32\2\2\u02ae\u02b0\7\u0112\2\2"+
		"\u02af\u02a7\3\2\2\2\u02af\u02aa\3\2\2\2\u02af\u02ac\3\2\2\2\u02b0/\3"+
		"\2\2\2\u02b1\u02b2\5.\30\2\u02b2\u02b3\7\2\2\3\u02b3\61\3\2\2\2\u02b4"+
		"\u02b5\b\32\1\2\u02b5\u02b6\5\66\34\2\u02b6\u02b7\5J&\2\u02b7\u02b8\5"+
		":\36\2\u02b8\u02b9\5R*\2\u02b9\u02ba\b\32\1\2\u02ba\u02c1\3\2\2\2\u02bb"+
		"\u02bc\b\32\1\2\u02bc\u02c1\7\33\2\2\u02bd\u02be\b\32\1\2\u02be\u02bf"+
		"\7\34\2\2\u02bf\u02c1\7\u0112\2\2\u02c0\u02b4\3\2\2\2\u02c0\u02bb\3\2"+
		"\2\2\u02c0\u02bd\3\2\2\2\u02c1\63\3\2\2\2\u02c2\u02c3\5\62\32\2\u02c3"+
		"\u02c4\7\2\2\3\u02c4\65\3\2\2\2\u02c5\u02c6\b\34\1\2\u02c6\u02c8\b\34"+
		"\1\2\u02c7\u02c9\5> \2\u02c8\u02c7\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02d2"+
		"\3\2\2\2\u02ca\u02d0\b\34\1\2\u02cb\u02cc\b\34\1\2\u02cc\u02d1\7\35\2"+
		"\2\u02cd\u02ce\b\34\1\2\u02ce\u02cf\7\36\2\2\u02cf\u02d1\7\u0112\2\2\u02d0"+
		"\u02cb\3\2\2\2\u02d0\u02cd\3\2\2\2\u02d1\u02d3\3\2\2\2\u02d2\u02ca\3\2"+
		"\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d5\b\34\1\2\u02d5"+
		"\u02dc\b\34\1\2\u02d6\u02d7\b\34\1\2\u02d7\u02dc\7\35\2\2\u02d8\u02d9"+
		"\b\34\1\2\u02d9\u02da\7\36\2\2\u02da\u02dc\7\u0112\2\2\u02db\u02c5\3\2"+
		"\2\2\u02db\u02d6\3\2\2\2\u02db\u02d8\3\2\2\2\u02dc\67\3\2\2\2\u02dd\u02de"+
		"\5\66\34\2\u02de\u02df\7\2\2\3\u02df9\3\2\2\2\u02e0\u02e1\b\36\1\2\u02e1"+
		"\u02e2\7\u00f7\2\2\u02e2\u02e9\b\36\1\2\u02e3\u02e4\b\36\1\2\u02e4\u02e9"+
		"\7\37\2\2\u02e5\u02e6\b\36\1\2\u02e6\u02e7\7 \2\2\u02e7\u02e9\7\u0112"+
		"\2\2\u02e8\u02e0\3\2\2\2\u02e8\u02e3\3\2\2\2\u02e8\u02e5\3\2\2\2\u02e9"+
		";\3\2\2\2\u02ea\u02eb\5:\36\2\u02eb\u02ec\7\2\2\3\u02ec=\3\2\2\2\u02ed"+
		"\u02ee\b \1\2\u02ee\u02ef\5\u01b2\u00da\2\u02ef\u02f0\5B\"\2\u02f0\u02f1"+
		"\5F$\2\u02f1\u02f2\b \1\2\u02f2\u02fd\3\2\2\2\u02f3\u02f4\b \1\2\u02f4"+
		"\u02f5\5V,\2\u02f5\u02f6\b \1\2\u02f6\u02fd\3\2\2\2\u02f7\u02f8\b \1\2"+
		"\u02f8\u02fd\7!\2\2\u02f9\u02fa\b \1\2\u02fa\u02fb\7\"\2\2\u02fb\u02fd"+
		"\7\u0112\2\2\u02fc\u02ed\3\2\2\2\u02fc\u02f3\3\2\2\2\u02fc\u02f7\3\2\2"+
		"\2\u02fc\u02f9\3\2\2\2\u02fd?\3\2\2\2\u02fe\u02ff\5> \2\u02ff\u0300\7"+
		"\2\2\3\u0300A\3\2\2\2\u0301\u0302\b\"\1\2\u0302\u0304\b\"\1\2\u0303\u0305"+
		"\5\u0086D\2\u0304\u0303\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u030e\3\2\2"+
		"\2\u0306\u030c\b\"\1\2\u0307\u0308\b\"\1\2\u0308\u030d\7#\2\2\u0309\u030a"+
		"\b\"\1\2\u030a\u030b\7$\2\2\u030b\u030d\7\u0112\2\2\u030c\u0307\3\2\2"+
		"\2\u030c\u0309\3\2\2\2\u030d\u030f\3\2\2\2\u030e\u0306\3\2\2\2\u030e\u030f"+
		"\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0311\b\"\1\2\u0311\u0318\b\"\1\2\u0312"+
		"\u0313\b\"\1\2\u0313\u0318\7#\2\2\u0314\u0315\b\"\1\2\u0315\u0316\7$\2"+
		"\2\u0316\u0318\7\u0112\2\2\u0317\u0301\3\2\2\2\u0317\u0312\3\2\2\2\u0317"+
		"\u0314\3\2\2\2\u0318C\3\2\2\2\u0319\u031a\5B\"\2\u031a\u031b\7\2\2\3\u031b"+
		"E\3\2\2\2\u031c\u031d\b$\1\2\u031d\u031e\7\u00f6\2\2\u031e\u0325\b$\1"+
		"\2\u031f\u0320\b$\1\2\u0320\u0325\7%\2\2\u0321\u0322\b$\1\2\u0322\u0323"+
		"\7&\2\2\u0323\u0325\7\u0112\2\2\u0324\u031c\3\2\2\2\u0324\u031f\3\2\2"+
		"\2\u0324\u0321\3\2\2\2\u0325G\3\2\2\2\u0326\u0327\5F$\2\u0327\u0328\7"+
		"\2\2\3\u0328I\3\2\2\2\u0329\u032a\b&\1\2\u032a\u032b\5N(\2\u032b\u032c"+
		"\5\u01b2\u00da\2\u032c\u032d\5B\"\2\u032d\u032e\b&\1\2\u032e\u0335\3\2"+
		"\2\2\u032f\u0330\b&\1\2\u0330\u0335\7\'\2\2\u0331\u0332\b&\1\2\u0332\u0333"+
		"\7(\2\2\u0333\u0335\7\u0112\2\2\u0334\u0329\3\2\2\2\u0334\u032f\3\2\2"+
		"\2\u0334\u0331\3\2\2\2\u0335K\3\2\2\2\u0336\u0337\5J&\2\u0337\u0338\7"+
		"\2\2\3\u0338M\3\2\2\2\u0339\u033a\b(\1\2\u033a\u033c\b(\1\2\u033b\u033d"+
		"\5\u0146\u00a4\2\u033c\u033b\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u0346\3"+
		"\2\2\2\u033e\u0344\b(\1\2\u033f\u0340\b(\1\2\u0340\u0345\7)\2\2\u0341"+
		"\u0342\b(\1\2\u0342\u0343\7*\2\2\u0343\u0345\7\u0112\2\2\u0344\u033f\3"+
		"\2\2\2\u0344\u0341\3\2\2\2\u0345\u0347\3\2\2\2\u0346\u033e\3\2\2\2\u0346"+
		"\u0347\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349\b(\1\2\u0349\u0350\b(\1"+
		"\2\u034a\u034b\b(\1\2\u034b\u0350\7)\2\2\u034c\u034d\b(\1\2\u034d\u034e"+
		"\7*\2\2\u034e\u0350\7\u0112\2\2\u034f\u0339\3\2\2\2\u034f\u034a\3\2\2"+
		"\2\u034f\u034c\3\2\2\2\u0350O\3\2\2\2\u0351\u0352\5N(\2\u0352\u0353\7"+
		"\2\2\3\u0353Q\3\2\2\2\u0354\u0355\b*\1\2\u0355\u0356\5j\66\2\u0356\u0357"+
		"\b*\1\2\u0357\u035e\3\2\2\2\u0358\u0359\b*\1\2\u0359\u035e\7+\2\2\u035a"+
		"\u035b\b*\1\2\u035b\u035c\7,\2\2\u035c\u035e\7\u0112\2\2\u035d\u0354\3"+
		"\2\2\2\u035d\u0358\3\2\2\2\u035d\u035a\3\2\2\2\u035eS\3\2\2\2\u035f\u0360"+
		"\5R*\2\u0360\u0361\7\2\2\3\u0361U\3\2\2\2\u0362\u0363\b,\1\2\u0363\u0364"+
		"\5Z.\2\u0364\u0365\b,\1\2\u0365\u036c\3\2\2\2\u0366\u0367\b,\1\2\u0367"+
		"\u036c\7-\2\2\u0368\u0369\b,\1\2\u0369\u036a\7.\2\2\u036a\u036c\7\u0112"+
		"\2\2\u036b\u0362\3\2\2\2\u036b\u0366\3\2\2\2\u036b\u0368\3\2\2\2\u036c"+
		"W\3\2\2\2\u036d\u036e\5V,\2\u036e\u036f\7\2\2\3\u036fY\3\2\2\2\u0370\u0371"+
		"\b.\1\2\u0371\u0373\b.\1\2\u0372\u0374\5^\60\2\u0373\u0372\3\2\2\2\u0374"+
		"\u0375\3\2\2\2\u0375\u0373\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u037f\3\2"+
		"\2\2\u0377\u037d\b.\1\2\u0378\u0379\b.\1\2\u0379\u037e\7/\2\2\u037a\u037b"+
		"\b.\1\2\u037b\u037c\7\60\2\2\u037c\u037e\7\u0112\2\2\u037d\u0378\3\2\2"+
		"\2\u037d\u037a\3\2\2\2\u037e\u0380\3\2\2\2\u037f\u0377\3\2\2\2\u037f\u0380"+
		"\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0382\b.\1\2\u0382\u0383\b.\1\2\u0383"+
		"\u038a\3\2\2\2\u0384\u0385\b.\1\2\u0385\u038a\7/\2\2\u0386\u0387\b.\1"+
		"\2\u0387\u0388\7\60\2\2\u0388\u038a\7\u0112\2\2\u0389\u0370\3\2\2\2\u0389"+
		"\u0384\3\2\2\2\u0389\u0386\3\2\2\2\u038a[\3\2\2\2\u038b\u038c\5Z.\2\u038c"+
		"\u038d\7\2\2\3\u038d]\3\2\2\2\u038e\u038f\b\60\1\2\u038f\u0390\5b\62\2"+
		"\u0390\u0391\5\u01b2\u00da\2\u0391\u0392\5B\"\2\u0392\u0393\b\60\1\2\u0393"+
		"\u039a\3\2\2\2\u0394\u0395\b\60\1\2\u0395\u039a\7\61\2\2\u0396\u0397\b"+
		"\60\1\2\u0397\u0398\7\62\2\2\u0398\u039a\7\u0112\2\2\u0399\u038e\3\2\2"+
		"\2\u0399\u0394\3\2\2\2\u0399\u0396\3\2\2\2\u039a_\3\2\2\2\u039b\u039c"+
		"\5^\60\2\u039c\u039d\7\2\2\3\u039da\3\2\2\2\u039e\u039f\b\62\1\2\u039f"+
		"\u03a0\7\u0108\2\2\u03a0\u03a7\b\62\1\2\u03a1\u03a2\b\62\1\2\u03a2\u03a7"+
		"\7\63\2\2\u03a3\u03a4\b\62\1\2\u03a4\u03a5\7\64\2\2\u03a5\u03a7\7\u0112"+
		"\2\2\u03a6\u039e\3\2\2\2\u03a6\u03a1\3\2\2\2\u03a6\u03a3\3\2\2\2\u03a7"+
		"c\3\2\2\2\u03a8\u03a9\5b\62\2\u03a9\u03aa\7\2\2\3\u03aae\3\2\2\2\u03ab"+
		"\u03ac\b\64\1\2\u03ac\u03ad\5j\66\2\u03ad\u03ae\b\64\1\2\u03ae\u03b9\3"+
		"\2\2\2\u03af\u03b0\b\64\1\2\u03b0\u03b1\5z>\2\u03b1\u03b2\b\64\1\2\u03b2"+
		"\u03b9\3\2\2\2\u03b3\u03b4\b\64\1\2\u03b4\u03b9\7\65\2\2\u03b5\u03b6\b"+
		"\64\1\2\u03b6\u03b7\7\66\2\2\u03b7\u03b9\7\u0112\2\2\u03b8\u03ab\3\2\2"+
		"\2\u03b8\u03af\3\2\2\2\u03b8\u03b3\3\2\2\2\u03b8\u03b5\3\2\2\2\u03b9g"+
		"\3\2\2\2\u03ba\u03bb\5f\64\2\u03bb\u03bc\7\2\2\3\u03bci\3\2\2\2\u03bd"+
		"\u03be\b\66\1\2\u03be\u03bf\5n8\2\u03bf\u03c0\5\u01b2\u00da\2\u03c0\u03c1"+
		"\5B\"\2\u03c1\u03c2\b\66\1\2\u03c2\u03f4\3\2\2\2\u03c3\u03c4\b\66\1\2"+
		"\u03c4\u03c5\5n8\2\u03c5\u03c6\5\u01b2\u00da\2\u03c6\u03c7\5f\64\2\u03c7"+
		"\u03c8\b\66\1\2\u03c8\u03f4\3\2\2\2\u03c9\u03ca\b\66\1\2\u03ca\u03cb\5"+
		"n8\2\u03cb\u03cc\5\u00fe\u0080\2\u03cc\u03cd\b\66\1\2\u03cd\u03f4\3\2"+
		"\2\2\u03ce\u03cf\b\66\1\2\u03cf\u03d0\5n8\2\u03d0\u03d1\5\u00ba^\2\u03d1"+
		"\u03d2\b\66\1\2\u03d2\u03f4\3\2\2\2\u03d3\u03d4\b\66\1\2\u03d4\u03d5\5"+
		"n8\2\u03d5\u03d6\5\u00dan\2\u03d6\u03d7\b\66\1\2\u03d7\u03f4\3\2\2\2\u03d8"+
		"\u03d9\b\66\1\2\u03d9\u03da\5n8\2\u03da\u03db\5\u0146\u00a4\2\u03db\u03dc"+
		"\5f\64\2\u03dc\u03dd\b\66\1\2\u03dd\u03f4\3\2\2\2\u03de\u03df\b\66\1\2"+
		"\u03df\u03e0\5n8\2\u03e0\u03e1\5\u0146\u00a4\2\u03e1\u03e2\b\66\1\2\u03e2"+
		"\u03f4\3\2\2\2\u03e3\u03e4\b\66\1\2\u03e4\u03e5\5n8\2\u03e5\u03e6\5r:"+
		"\2\u03e6\u03e7\5v<\2\u03e7\u03e8\b\66\1\2\u03e8\u03f4\3\2\2\2\u03e9\u03ea"+
		"\b\66\1\2\u03ea\u03eb\5n8\2\u03eb\u03ec\5\u0166\u00b4\2\u03ec\u03ed\b"+
		"\66\1\2\u03ed\u03f4\3\2\2\2\u03ee\u03ef\b\66\1\2\u03ef\u03f4\7\67\2\2"+
		"\u03f0\u03f1\b\66\1\2\u03f1\u03f2\78\2\2\u03f2\u03f4\7\u0112\2\2\u03f3"+
		"\u03bd\3\2\2\2\u03f3\u03c3\3\2\2\2\u03f3\u03c9\3\2\2\2\u03f3\u03ce\3\2"+
		"\2\2\u03f3\u03d3\3\2\2\2\u03f3\u03d8\3\2\2\2\u03f3\u03de\3\2\2\2\u03f3"+
		"\u03e3\3\2\2\2\u03f3\u03e9\3\2\2\2\u03f3\u03ee\3\2\2\2\u03f3\u03f0\3\2"+
		"\2\2\u03f4k\3\2\2\2\u03f5\u03f6\5j\66\2\u03f6\u03f7\7\2\2\3\u03f7m\3\2"+
		"\2\2\u03f8\u03f9\b8\1\2\u03f9\u03fb\b8\1\2\u03fa\u03fc\5V,\2\u03fb\u03fa"+
		"\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u0405\3\2\2\2\u03fd\u0403\b8\1\2\u03fe"+
		"\u03ff\b8\1\2\u03ff\u0404\79\2\2\u0400\u0401\b8\1\2\u0401\u0402\7:\2\2"+
		"\u0402\u0404\7\u0112\2\2\u0403\u03fe\3\2\2\2\u0403\u0400\3\2\2\2\u0404"+
		"\u0406\3\2\2\2\u0405\u03fd\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0407\3\2"+
		"\2\2\u0407\u0408\b8\1\2\u0408\u040f\b8\1\2\u0409\u040a\b8\1\2\u040a\u040f"+
		"\79\2\2\u040b\u040c\b8\1\2\u040c\u040d\7:\2\2\u040d\u040f\7\u0112\2\2"+
		"\u040e\u03f8\3\2\2\2\u040e\u0409\3\2\2\2\u040e\u040b\3\2\2\2\u040fo\3"+
		"\2\2\2\u0410\u0411\5n8\2\u0411\u0412\7\2\2\3\u0412q\3\2\2\2\u0413\u0414"+
		"\b:\1\2\u0414\u0415\7\u010b\2\2\u0415\u041c\b:\1\2\u0416\u0417\b:\1\2"+
		"\u0417\u041c\7;\2\2\u0418\u0419\b:\1\2\u0419\u041a\7<\2\2\u041a\u041c"+
		"\7\u0112\2\2\u041b\u0413\3\2\2\2\u041b\u0416\3\2\2\2\u041b\u0418\3\2\2"+
		"\2\u041cs\3\2\2\2\u041d\u041e\5r:\2\u041e\u041f\7\2\2\3\u041fu\3\2\2\2"+
		"\u0420\u0421\b<\1\2\u0421\u0423\b<\1\2\u0422\u0424\5\u00a6T\2\u0423\u0422"+
		"\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u042d\3\2\2\2\u0425\u042b\b<\1\2\u0426"+
		"\u0427\b<\1\2\u0427\u042c\7=\2\2\u0428\u0429\b<\1\2\u0429\u042a\7>\2\2"+
		"\u042a\u042c\7\u0112\2\2\u042b\u0426\3\2\2\2\u042b\u0428\3\2\2\2\u042c"+
		"\u042e\3\2\2\2\u042d\u0425\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u042f\3\2"+
		"\2\2\u042f\u0430\b<\1\2\u0430\u0437\b<\1\2\u0431\u0432\b<\1\2\u0432\u0437"+
		"\7=\2\2\u0433\u0434\b<\1\2\u0434\u0435\7>\2\2\u0435\u0437\7\u0112\2\2"+
		"\u0436\u0420\3\2\2\2\u0436\u0431\3\2\2\2\u0436\u0433\3\2\2\2\u0437w\3"+
		"\2\2\2\u0438\u0439\5v<\2\u0439\u043a\7\2\2\3\u043ay\3\2\2\2\u043b\u043c"+
		"\b>\1\2\u043c\u043d\5\u0106\u0084\2\u043d\u043e\5~@\2\u043e\u043f\b>\1"+
		"\2\u043f\u0446\3\2\2\2\u0440\u0441\b>\1\2\u0441\u0446\7?\2\2\u0442\u0443"+
		"\b>\1\2\u0443\u0444\7@\2\2\u0444\u0446\7\u0112\2\2\u0445\u043b\3\2\2\2"+
		"\u0445\u0440\3\2\2\2\u0445\u0442\3\2\2\2\u0446{\3\2\2\2\u0447\u0448\5"+
		"z>\2\u0448\u0449\7\2\2\3\u0449}\3\2\2\2\u044a\u044b\b@\1\2\u044b\u044c"+
		"\5\u0106\u0084\2\u044c\u044d\5~@\2\u044d\u044e\b@\1\2\u044e\u045a\3\2"+
		"\2\2\u044f\u0450\b@\1\2\u0450\u0451\5\u0082B\2\u0451\u0452\5j\66\2\u0452"+
		"\u0453\b@\1\2\u0453\u045a\3\2\2\2\u0454\u0455\b@\1\2\u0455\u045a\7A\2"+
		"\2\u0456\u0457\b@\1\2\u0457\u0458\7B\2\2\u0458\u045a\7\u0112\2\2\u0459"+
		"\u044a\3\2\2\2\u0459\u044f\3\2\2\2\u0459\u0454\3\2\2\2\u0459\u0456\3\2"+
		"\2\2\u045a\177\3\2\2\2\u045b\u045c\5~@\2\u045c\u045d\7\2\2\3\u045d\u0081"+
		"\3\2\2\2\u045e\u045f\bB\1\2\u045f\u0460\7\u0103\2\2\u0460\u0467\bB\1\2"+
		"\u0461\u0462\bB\1\2\u0462\u0467\7C\2\2\u0463\u0464\bB\1\2\u0464\u0465"+
		"\7D\2\2\u0465\u0467\7\u0112\2\2\u0466\u045e\3\2\2\2\u0466\u0461\3\2\2"+
		"\2\u0466\u0463\3\2\2\2\u0467\u0083\3\2\2\2\u0468\u0469\5\u0082B\2\u0469"+
		"\u046a\7\2\2\3\u046a\u0085\3\2\2\2\u046b\u046c\bD\1\2\u046c\u046d\5\u008a"+
		"F\2\u046d\u046e\5\u008eH\2\u046e\u046f\5\u0092J\2\u046f\u0470\bD\1\2\u0470"+
		"\u0477\3\2\2\2\u0471\u0472\bD\1\2\u0472\u0477\7E\2\2\u0473\u0474\bD\1"+
		"\2\u0474\u0475\7F\2\2\u0475\u0477\7\u0112\2\2\u0476\u046b\3\2\2\2\u0476"+
		"\u0471\3\2\2\2\u0476\u0473\3\2\2\2\u0477\u0087\3\2\2\2\u0478\u0479\5\u0086"+
		"D\2\u0479\u047a\7\2\2\3\u047a\u0089\3\2\2\2\u047b\u047c\bF\1\2\u047c\u047d"+
		"\7\u00fd\2\2\u047d\u0484\bF\1\2\u047e\u047f\bF\1\2\u047f\u0484\7G\2\2"+
		"\u0480\u0481\bF\1\2\u0481\u0482\7H\2\2\u0482\u0484\7\u0112\2\2\u0483\u047b"+
		"\3\2\2\2\u0483\u047e\3\2\2\2\u0483\u0480\3\2\2\2\u0484\u008b\3\2\2\2\u0485"+
		"\u0486\5\u008aF\2\u0486\u0487\7\2\2\3\u0487\u008d\3\2\2\2\u0488\u0489"+
		"\bH\1\2\u0489\u048b\bH\1\2\u048a\u048c\5\u0096L\2\u048b\u048a\3\2\2\2"+
		"\u048b\u048c\3\2\2\2\u048c\u0495\3\2\2\2\u048d\u0493\bH\1\2\u048e\u048f"+
		"\bH\1\2\u048f\u0494\7I\2\2\u0490\u0491\bH\1\2\u0491\u0492\7J\2\2\u0492"+
		"\u0494\7\u0112\2\2\u0493\u048e\3\2\2\2\u0493\u0490\3\2\2\2\u0494\u0496"+
		"\3\2\2\2\u0495\u048d\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0497\3\2\2\2\u0497"+
		"\u0498\bH\1\2\u0498\u049f\bH\1\2\u0499\u049a\bH\1\2\u049a\u049f\7I\2\2"+
		"\u049b\u049c\bH\1\2\u049c\u049d\7J\2\2\u049d\u049f\7\u0112\2\2\u049e\u0488"+
		"\3\2\2\2\u049e\u0499\3\2\2\2\u049e\u049b\3\2\2\2\u049f\u008f\3\2\2\2\u04a0"+
		"\u04a1\5\u008eH\2\u04a1\u04a2\7\2\2\3\u04a2\u0091\3\2\2\2\u04a3\u04a4"+
		"\bJ\1\2\u04a4\u04a5\7\u00fe\2\2\u04a5\u04ac\bJ\1\2\u04a6\u04a7\bJ\1\2"+
		"\u04a7\u04ac\7K\2\2\u04a8\u04a9\bJ\1\2\u04a9\u04aa\7L\2\2\u04aa\u04ac"+
		"\7\u0112\2\2\u04ab\u04a3\3\2\2\2\u04ab\u04a6\3\2\2\2\u04ab\u04a8\3\2\2"+
		"\2\u04ac\u0093\3\2\2\2\u04ad\u04ae\5\u0092J\2\u04ae\u04af\7\2\2\3\u04af"+
		"\u0095\3\2\2\2\u04b0\u04b1\bL\1\2\u04b1\u04b2\5f\64\2\u04b2\u04b3\5\u009a"+
		"N\2\u04b3\u04b4\bL\1\2\u04b4\u04bb\3\2\2\2\u04b5\u04b6\bL\1\2\u04b6\u04bb"+
		"\7M\2\2\u04b7\u04b8\bL\1\2\u04b8\u04b9\7N\2\2\u04b9\u04bb\7\u0112\2\2"+
		"\u04ba\u04b0\3\2\2\2\u04ba\u04b5\3\2\2\2\u04ba\u04b7\3\2\2\2\u04bb\u0097"+
		"\3\2\2\2\u04bc\u04bd\5\u0096L\2\u04bd\u04be\7\2\2\3\u04be\u0099\3\2\2"+
		"\2\u04bf\u04c0\bN\1\2\u04c0\u04c4\bN\1\2\u04c1\u04c3\5\u009eP\2\u04c2"+
		"\u04c1\3\2\2\2\u04c3\u04c6\3\2\2\2\u04c4\u04c2\3\2\2\2\u04c4\u04c5\3\2"+
		"\2\2\u04c5\u04cf\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c7\u04cd\bN\1\2\u04c8"+
		"\u04c9\bN\1\2\u04c9\u04ce\7O\2\2\u04ca\u04cb\bN\1\2\u04cb\u04cc\7P\2\2"+
		"\u04cc\u04ce\7\u0112\2\2\u04cd\u04c8\3\2\2\2\u04cd\u04ca\3\2\2\2\u04ce"+
		"\u04d0\3\2\2\2\u04cf\u04c7\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d1\3\2"+
		"\2\2\u04d1\u04d2\bN\1\2\u04d2\u04d9\bN\1\2\u04d3\u04d4\bN\1\2\u04d4\u04d9"+
		"\7O\2\2\u04d5\u04d6\bN\1\2\u04d6\u04d7\7P\2\2\u04d7\u04d9\7\u0112\2\2"+
		"\u04d8\u04bf\3\2\2\2\u04d8\u04d3\3\2\2\2\u04d8\u04d5\3\2\2\2\u04d9\u009b"+
		"\3\2\2\2\u04da\u04db\5\u009aN\2\u04db\u04dc\7\2\2\3\u04dc\u009d\3\2\2"+
		"\2\u04dd\u04de\bP\1\2\u04de\u04df\5\u00a2R\2\u04df\u04e0\5f\64\2\u04e0"+
		"\u04e1\bP\1\2\u04e1\u04e8\3\2\2\2\u04e2\u04e3\bP\1\2\u04e3\u04e8\7Q\2"+
		"\2\u04e4\u04e5\bP\1\2\u04e5\u04e6\7R\2\2\u04e6\u04e8\7\u0112\2\2\u04e7"+
		"\u04dd\3\2\2\2\u04e7\u04e2\3\2\2\2\u04e7\u04e4\3\2\2\2\u04e8\u009f\3\2"+
		"\2\2\u04e9\u04ea\5\u009eP\2\u04ea\u04eb\7\2\2\3\u04eb\u00a1\3\2\2\2\u04ec"+
		"\u04ed\bR\1\2\u04ed\u04ee\7\u0100\2\2\u04ee\u04f5\bR\1\2\u04ef\u04f0\b"+
		"R\1\2\u04f0\u04f5\7S\2\2\u04f1\u04f2\bR\1\2\u04f2\u04f3\7T\2\2\u04f3\u04f5"+
		"\7\u0112\2\2\u04f4\u04ec\3\2\2\2\u04f4\u04ef\3\2\2\2\u04f4\u04f1\3\2\2"+
		"\2\u04f5\u00a3\3\2\2\2\u04f6\u04f7\5\u00a2R\2\u04f7\u04f8\7\2\2\3\u04f8"+
		"\u00a5\3\2\2\2\u04f9\u04fa\bT\1\2\u04fa\u04fb\5\u008aF\2\u04fb\u04fc\5"+
		"\u00aaV\2\u04fc\u04fd\5\u0092J\2\u04fd\u04fe\bT\1\2\u04fe\u0505\3\2\2"+
		"\2\u04ff\u0500\bT\1\2\u0500\u0505\7U\2\2\u0501\u0502\bT\1\2\u0502\u0503"+
		"\7V\2\2\u0503\u0505\7\u0112\2\2\u0504\u04f9\3\2\2\2\u0504\u04ff\3\2\2"+
		"\2\u0504\u0501\3\2\2\2\u0505\u00a7\3\2\2\2\u0506\u0507\5\u00a6T\2\u0507"+
		"\u0508\7\2\2\3\u0508\u00a9\3\2\2\2\u0509\u050a\bV\1\2\u050a\u050c\bV\1"+
		"\2\u050b\u050d\5\u00aeX\2\u050c\u050b\3\2\2\2\u050c\u050d\3\2\2\2\u050d"+
		"\u0516\3\2\2\2\u050e\u0514\bV\1\2\u050f\u0510\bV\1\2\u0510\u0515\7W\2"+
		"\2\u0511\u0512\bV\1\2\u0512\u0513\7X\2\2\u0513\u0515\7\u0112\2\2\u0514"+
		"\u050f\3\2\2\2\u0514\u0511\3\2\2\2\u0515\u0517\3\2\2\2\u0516\u050e\3\2"+
		"\2\2\u0516\u0517\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u0519\bV\1\2\u0519"+
		"\u0520\bV\1\2\u051a\u051b\bV\1\2\u051b\u0520\7W\2\2\u051c\u051d\bV\1\2"+
		"\u051d\u051e\7X\2\2\u051e\u0520\7\u0112\2\2\u051f\u0509\3\2\2\2\u051f"+
		"\u051a\3\2\2\2\u051f\u051c\3\2\2\2\u0520\u00ab\3\2\2\2\u0521\u0522\5\u00aa"+
		"V\2\u0522\u0523\7\2\2\3\u0523\u00ad\3\2\2\2\u0524\u0525\bX\1\2\u0525\u0526"+
		"\5j\66\2\u0526\u0527\5\u00b2Z\2\u0527\u0528\bX\1\2\u0528\u052f\3\2\2\2"+
		"\u0529\u052a\bX\1\2\u052a\u052f\7Y\2\2\u052b\u052c\bX\1\2\u052c\u052d"+
		"\7Z\2\2\u052d\u052f\7\u0112\2\2\u052e\u0524\3\2\2\2\u052e\u0529\3\2\2"+
		"\2\u052e\u052b\3\2\2\2\u052f\u00af\3\2\2\2\u0530\u0531\5\u00aeX\2\u0531"+
		"\u0532\7\2\2\3\u0532\u00b1\3\2\2\2\u0533\u0534\bZ\1\2\u0534\u0538\bZ\1"+
		"\2\u0535\u0537\5\u00b6\\\2\u0536\u0535\3\2\2\2\u0537\u053a\3\2\2\2\u0538"+
		"\u0536\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u0543\3\2\2\2\u053a\u0538\3\2"+
		"\2\2\u053b\u0541\bZ\1\2\u053c\u053d\bZ\1\2\u053d\u0542\7[\2\2\u053e\u053f"+
		"\bZ\1\2\u053f\u0540\7\\\2\2\u0540\u0542\7\u0112\2\2\u0541\u053c\3\2\2"+
		"\2\u0541\u053e\3\2\2\2\u0542\u0544\3\2\2\2\u0543\u053b\3\2\2\2\u0543\u0544"+
		"\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0546\bZ\1\2\u0546\u054d\bZ\1\2\u0547"+
		"\u0548\bZ\1\2\u0548\u054d\7[\2\2\u0549\u054a\bZ\1\2\u054a\u054b\7\\\2"+
		"\2\u054b\u054d\7\u0112\2\2\u054c\u0533\3\2\2\2\u054c\u0547\3\2\2\2\u054c"+
		"\u0549\3\2\2\2\u054d\u00b3\3\2\2\2\u054e\u054f\5\u00b2Z\2\u054f\u0550"+
		"\7\2\2\3\u0550\u00b5\3\2\2\2\u0551\u0552\b\\\1\2\u0552\u0553\5\u00a2R"+
		"\2\u0553\u0554\5j\66\2\u0554\u0555\b\\\1\2\u0555\u055c\3\2\2\2\u0556\u0557"+
		"\b\\\1\2\u0557\u055c\7]\2\2\u0558\u0559\b\\\1\2\u0559\u055a\7^\2\2\u055a"+
		"\u055c\7\u0112\2\2\u055b\u0551\3\2\2\2\u055b\u0556\3\2\2\2\u055b\u0558"+
		"\3\2\2\2\u055c\u00b7\3\2\2\2\u055d\u055e\5\u00b6\\\2\u055e\u055f\7\2\2"+
		"\3\u055f\u00b9\3\2\2\2\u0560\u0561\b^\1\2\u0561\u0562\5\u00be`\2\u0562"+
		"\u0563\5\u00c2b\2\u0563\u0564\5\u00c6d\2\u0564\u0565\b^\1\2\u0565\u056c"+
		"\3\2\2\2\u0566\u0567\b^\1\2\u0567\u056c\7_\2\2\u0568\u0569\b^\1\2\u0569"+
		"\u056a\7`\2\2\u056a\u056c\7\u0112\2\2\u056b\u0560\3\2\2\2\u056b\u0566"+
		"\3\2\2\2\u056b\u0568\3\2\2\2\u056c\u00bb\3\2\2\2\u056d\u056e\5\u00ba^"+
		"\2\u056e\u056f\7\2\2\3\u056f\u00bd\3\2\2\2\u0570\u0571\b`\1\2\u0571\u0572"+
		"\7\u00f9\2\2\u0572\u0579\b`\1\2\u0573\u0574\b`\1\2\u0574\u0579\7a\2\2"+
		"\u0575\u0576\b`\1\2\u0576\u0577\7b\2\2\u0577\u0579\7\u0112\2\2\u0578\u0570"+
		"\3\2\2\2\u0578\u0573\3\2\2\2\u0578\u0575\3\2\2\2\u0579\u00bf\3\2\2\2\u057a"+
		"\u057b\5\u00be`\2\u057b\u057c\7\2\2\3\u057c\u00c1\3\2\2\2\u057d\u057e"+
		"\bb\1\2\u057e\u0580\bb\1\2\u057f\u0581\5\u00caf\2\u0580\u057f\3\2\2\2"+
		"\u0580\u0581\3\2\2\2\u0581\u058a\3\2\2\2\u0582\u0588\bb\1\2\u0583\u0584"+
		"\bb\1\2\u0584\u0589\7c\2\2\u0585\u0586\bb\1\2\u0586\u0587\7d\2\2\u0587"+
		"\u0589\7\u0112\2\2\u0588\u0583\3\2\2\2\u0588\u0585\3\2\2\2\u0589\u058b"+
		"\3\2\2\2\u058a\u0582\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058c\3\2\2\2\u058c"+
		"\u058d\bb\1\2\u058d\u0594\bb\1\2\u058e\u058f\bb\1\2\u058f\u0594\7c\2\2"+
		"\u0590\u0591\bb\1\2\u0591\u0592\7d\2\2\u0592\u0594\7\u0112\2\2\u0593\u057d"+
		"\3\2\2\2\u0593\u058e\3\2\2\2\u0593\u0590\3\2\2\2\u0594\u00c3\3\2\2\2\u0595"+
		"\u0596\5\u00c2b\2\u0596\u0597\7\2\2\3\u0597\u00c5\3\2\2\2\u0598\u0599"+
		"\bd\1\2\u0599\u059a\7\u00fa\2\2\u059a\u05a1\bd\1\2\u059b\u059c\bd\1\2"+
		"\u059c\u05a1\7e\2\2\u059d\u059e\bd\1\2\u059e\u059f\7f\2\2\u059f\u05a1"+
		"\7\u0112\2\2\u05a0\u0598\3\2\2\2\u05a0\u059b\3\2\2\2\u05a0\u059d\3\2\2"+
		"\2\u05a1\u00c7\3\2\2\2\u05a2\u05a3\5\u00c6d\2\u05a3\u05a4\7\2\2\3\u05a4"+
		"\u00c9\3\2\2\2\u05a5\u05a6\bf\1\2\u05a6\u05a7\5f\64\2\u05a7\u05a8\5\u00ce"+
		"h\2\u05a8\u05a9\bf\1\2\u05a9\u05b0\3\2\2\2\u05aa\u05ab\bf\1\2\u05ab\u05b0"+
		"\7g\2\2\u05ac\u05ad\bf\1\2\u05ad\u05ae\7h\2\2\u05ae\u05b0\7\u0112\2\2"+
		"\u05af\u05a5\3\2\2\2\u05af\u05aa\3\2\2\2\u05af\u05ac\3\2\2\2\u05b0\u00cb"+
		"\3\2\2\2\u05b1\u05b2\5\u00caf\2\u05b2\u05b3\7\2\2\3\u05b3\u00cd\3\2\2"+
		"\2\u05b4\u05b5\bh\1\2\u05b5\u05b9\bh\1\2\u05b6\u05b8\5\u00d2j\2\u05b7"+
		"\u05b6\3\2\2\2\u05b8\u05bb\3\2\2\2\u05b9\u05b7\3\2\2\2\u05b9\u05ba\3\2"+
		"\2\2\u05ba\u05c4\3\2\2\2\u05bb\u05b9\3\2\2\2\u05bc\u05c2\bh\1\2\u05bd"+
		"\u05be\bh\1\2\u05be\u05c3\7i\2\2\u05bf\u05c0\bh\1\2\u05c0\u05c1\7j\2\2"+
		"\u05c1\u05c3\7\u0112\2\2\u05c2\u05bd\3\2\2\2\u05c2\u05bf\3\2\2\2\u05c3"+
		"\u05c5\3\2\2\2\u05c4\u05bc\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c6\3\2"+
		"\2\2\u05c6\u05c7\bh\1\2\u05c7\u05ce\bh\1\2\u05c8\u05c9\bh\1\2\u05c9\u05ce"+
		"\7i\2\2\u05ca\u05cb\bh\1\2\u05cb\u05cc\7j\2\2\u05cc\u05ce\7\u0112\2\2"+
		"\u05cd\u05b4\3\2\2\2\u05cd\u05c8\3\2\2\2\u05cd\u05ca\3\2\2\2\u05ce\u00cf"+
		"\3\2\2\2\u05cf\u05d0\5\u00ceh\2\u05d0\u05d1\7\2\2\3\u05d1\u00d1\3\2\2"+
		"\2\u05d2\u05d3\bj\1\2\u05d3\u05d4\5\22\n\2\u05d4\u05d5\5\u00d6l\2\u05d5"+
		"\u05d6\bj\1\2\u05d6\u05dd\3\2\2\2\u05d7\u05d8\bj\1\2\u05d8\u05dd\7k\2"+
		"\2\u05d9\u05da\bj\1\2\u05da\u05db\7l\2\2\u05db\u05dd\7\u0112\2\2\u05dc"+
		"\u05d2\3\2\2\2\u05dc\u05d7\3\2\2\2\u05dc\u05d9\3\2\2\2\u05dd\u00d3\3\2"+
		"\2\2\u05de\u05df\5\u00d2j\2\u05df\u05e0\7\2\2\3\u05e0\u00d5\3\2\2\2\u05e1"+
		"\u05e2\bl\1\2\u05e2\u05e4\bl\1\2\u05e3\u05e5\5f\64\2\u05e4\u05e3\3\2\2"+
		"\2\u05e4\u05e5\3\2\2\2\u05e5\u05ee\3\2\2\2\u05e6\u05ec\bl\1\2\u05e7\u05e8"+
		"\bl\1\2\u05e8\u05ed\7m\2\2\u05e9\u05ea\bl\1\2\u05ea\u05eb\7n\2\2\u05eb"+
		"\u05ed\7\u0112\2\2\u05ec\u05e7\3\2\2\2\u05ec\u05e9\3\2\2\2\u05ed\u05ef"+
		"\3\2\2\2\u05ee\u05e6\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0"+
		"\u05f1\bl\1\2\u05f1\u05f8\bl\1\2\u05f2\u05f3\bl\1\2\u05f3\u05f8\7m\2\2"+
		"\u05f4\u05f5\bl\1\2\u05f5\u05f6\7n\2\2\u05f6\u05f8\7\u0112\2\2\u05f7\u05e1"+
		"\3\2\2\2\u05f7\u05f2\3\2\2\2\u05f7\u05f4\3\2\2\2\u05f8\u00d7\3\2\2\2\u05f9"+
		"\u05fa\5\u00d6l\2\u05fa\u05fb\7\2\2\3\u05fb\u00d9\3\2\2\2\u05fc\u05fd"+
		"\bn\1\2\u05fd\u05fe\5\u00dep\2\u05fe\u05ff\5\u00e2r\2\u05ff\u0600\5\u00e6"+
		"t\2\u0600\u0601\5\u00eav\2\u0601\u0602\bn\1\2\u0602\u0609\3\2\2\2\u0603"+
		"\u0604\bn\1\2\u0604\u0609\7o\2\2\u0605\u0606\bn\1\2\u0606\u0607\7p\2\2"+
		"\u0607\u0609\7\u0112\2\2\u0608\u05fc\3\2\2\2\u0608\u0603\3\2\2\2\u0608"+
		"\u0605\3\2\2\2\u0609\u00db\3\2\2\2\u060a\u060b\5\u00dan\2\u060b\u060c"+
		"\7\2\2\3\u060c\u00dd\3\2\2\2\u060d\u060e\bp\1\2\u060e\u060f\7\u010a\2"+
		"\2\u060f\u0616\bp\1\2\u0610\u0611\bp\1\2\u0611\u0616\7q\2\2\u0612\u0613"+
		"\bp\1\2\u0613\u0614\7r\2\2\u0614\u0616\7\u0112\2\2\u0615\u060d\3\2\2\2"+
		"\u0615\u0610\3\2\2\2\u0615\u0612\3\2\2\2\u0616\u00df\3\2\2\2\u0617\u0618"+
		"\5\u00dep\2\u0618\u0619\7\2\2\3\u0619\u00e1\3\2\2\2\u061a\u061b\br\1\2"+
		"\u061b\u061d\br\1\2\u061c\u061e\5\u00eex\2\u061d\u061c\3\2\2\2\u061d\u061e"+
		"\3\2\2\2\u061e\u0627\3\2\2\2\u061f\u0625\br\1\2\u0620\u0621\br\1\2\u0621"+
		"\u0626\7s\2\2\u0622\u0623\br\1\2\u0623\u0624\7t\2\2\u0624\u0626\7\u0112"+
		"\2\2\u0625\u0620\3\2\2\2\u0625\u0622\3\2\2\2\u0626\u0628\3\2\2\2\u0627"+
		"\u061f\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u062a\br"+
		"\1\2\u062a\u0631\br\1\2\u062b\u062c\br\1\2\u062c\u0631\7s\2\2\u062d\u062e"+
		"\br\1\2\u062e\u062f\7t\2\2\u062f\u0631\7\u0112\2\2\u0630\u061a\3\2\2\2"+
		"\u0630\u062b\3\2\2\2\u0630\u062d\3\2\2\2\u0631\u00e3\3\2\2\2\u0632\u0633"+
		"\5\u00e2r\2\u0633\u0634\7\2\2\3\u0634\u00e5\3\2\2\2\u0635\u0636\bt\1\2"+
		"\u0636\u0638\bt\1\2\u0637\u0639\5\u00f6|\2\u0638\u0637\3\2\2\2\u0638\u0639"+
		"\3\2\2\2\u0639\u0642\3\2\2\2\u063a\u0640\bt\1\2\u063b\u063c\bt\1\2\u063c"+
		"\u0641\7u\2\2\u063d\u063e\bt\1\2\u063e\u063f\7v\2\2\u063f\u0641\7\u0112"+
		"\2\2\u0640\u063b\3\2\2\2\u0640\u063d\3\2\2\2\u0641\u0643\3\2\2\2\u0642"+
		"\u063a\3\2\2\2\u0642\u0643\3\2\2\2\u0643\u0644\3\2\2\2\u0644\u0645\bt"+
		"\1\2\u0645\u064c\bt\1\2\u0646\u0647\bt\1\2\u0647\u064c\7u\2\2\u0648\u0649"+
		"\bt\1\2\u0649\u064a\7v\2\2\u064a\u064c\7\u0112\2\2\u064b\u0635\3\2\2\2"+
		"\u064b\u0646\3\2\2\2\u064b\u0648\3\2\2\2\u064c\u00e7\3\2\2\2\u064d\u064e"+
		"\5\u00e6t\2\u064e\u064f\7\2\2\3\u064f\u00e9\3\2\2\2\u0650\u0651\bv\1\2"+
		"\u0651\u0653\bv\1\2\u0652\u0654\5\u010a\u0086\2\u0653\u0652\3\2\2\2\u0653"+
		"\u0654\3\2\2\2\u0654\u065d\3\2\2\2\u0655\u065b\bv\1\2\u0656\u0657\bv\1"+
		"\2\u0657\u065c\7w\2\2\u0658\u0659\bv\1\2\u0659\u065a\7x\2\2\u065a\u065c"+
		"\7\u0112\2\2\u065b\u0656\3\2\2\2\u065b\u0658\3\2\2\2\u065c\u065e\3\2\2"+
		"\2\u065d\u0655\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u065f\3\2\2\2\u065f\u0660"+
		"\bv\1\2\u0660\u0667\bv\1\2\u0661\u0662\bv\1\2\u0662\u0667\7w\2\2\u0663"+
		"\u0664\bv\1\2\u0664\u0665\7x\2\2\u0665\u0667\7\u0112\2\2\u0666\u0650\3"+
		"\2\2\2\u0666\u0661\3\2\2\2\u0666\u0663\3\2\2\2\u0667\u00eb\3\2\2\2\u0668"+
		"\u0669\5\u00eav\2\u0669\u066a\7\2\2\3\u066a\u00ed\3\2\2\2\u066b\u066c"+
		"\bx\1\2\u066c\u066d\5\u00f2z\2\u066d\u066e\bx\1\2\u066e\u0675\3\2\2\2"+
		"\u066f\u0670\bx\1\2\u0670\u0675\7y\2\2\u0671\u0672\bx\1\2\u0672\u0673"+
		"\7z\2\2\u0673\u0675\7\u0112\2\2\u0674\u066b\3\2\2\2\u0674\u066f\3\2\2"+
		"\2\u0674\u0671\3\2\2\2\u0675\u00ef\3\2\2\2\u0676\u0677\5\u00eex\2\u0677"+
		"\u0678\7\2\2\3\u0678\u00f1\3\2\2\2\u0679\u067a\bz\1\2\u067a\u067b\7\u0105"+
		"\2\2\u067b\u0682\bz\1\2\u067c\u067d\bz\1\2\u067d\u0682\7{\2\2\u067e\u067f"+
		"\bz\1\2\u067f\u0680\7|\2\2\u0680\u0682\7\u0112\2\2\u0681\u0679\3\2\2\2"+
		"\u0681\u067c\3\2\2\2\u0681\u067e\3\2\2\2\u0682\u00f3\3\2\2\2\u0683\u0684"+
		"\5\u00f2z\2\u0684\u0685\7\2\2\3\u0685\u00f5\3\2\2\2\u0686\u0687\b|\1\2"+
		"\u0687\u0688\5\u00fa~\2\u0688\u0689\b|\1\2\u0689\u0690\3\2\2\2\u068a\u068b"+
		"\b|\1\2\u068b\u0690\7}\2\2\u068c\u068d\b|\1\2\u068d\u068e\7~\2\2\u068e"+
		"\u0690\7\u0112\2\2\u068f\u0686\3\2\2\2\u068f\u068a\3\2\2\2\u068f\u068c"+
		"\3\2\2\2\u0690\u00f7\3\2\2\2\u0691\u0692\5\u00f6|\2\u0692\u0693\7\2\2"+
		"\3\u0693\u00f9\3\2\2\2\u0694\u0695\b~\1\2\u0695\u0696\7\u0106\2\2\u0696"+
		"\u069d\b~\1\2\u0697\u0698\b~\1\2\u0698\u069d\7\177\2\2\u0699\u069a\b~"+
		"\1\2\u069a\u069b\7\u0080\2\2\u069b\u069d\7\u0112\2\2\u069c\u0694\3\2\2"+
		"\2\u069c\u0697\3\2\2\2\u069c\u0699\3\2\2\2\u069d\u00fb\3\2\2\2\u069e\u069f"+
		"\5\u00fa~\2\u069f\u06a0\7\2\2\3\u06a0\u00fd\3\2\2\2\u06a1\u06a2\b\u0080"+
		"\1\2\u06a2\u06a3\5&\24\2\u06a3\u06a4\b\u0080\1\2\u06a4\u06af\3\2\2\2\u06a5"+
		"\u06a6\b\u0080\1\2\u06a6\u06a7\5\u0102\u0082\2\u06a7\u06a8\b\u0080\1\2"+
		"\u06a8\u06af\3\2\2\2\u06a9\u06aa\b\u0080\1\2\u06aa\u06af\7\u0081\2\2\u06ab"+
		"\u06ac\b\u0080\1\2\u06ac\u06ad\7\u0082\2\2\u06ad\u06af\7\u0112\2\2\u06ae"+
		"\u06a1\3\2\2\2\u06ae\u06a5\3\2\2\2\u06ae\u06a9\3\2\2\2\u06ae\u06ab\3\2"+
		"\2\2\u06af\u00ff\3\2\2\2\u06b0\u06b1\5\u00fe\u0080\2\u06b1\u06b2\7\2\2"+
		"\3\u06b2\u0101\3\2\2\2\u06b3\u06b4\b\u0082\1\2\u06b4\u06b5\7\u010d\2\2"+
		"\u06b5\u06bc\b\u0082\1\2\u06b6\u06b7\b\u0082\1\2\u06b7\u06bc\7\u0083\2"+
		"\2\u06b8\u06b9\b\u0082\1\2\u06b9\u06ba\7\u0084\2\2\u06ba\u06bc\7\u0112"+
		"\2\2\u06bb\u06b3\3\2\2\2\u06bb\u06b6\3\2\2\2\u06bb\u06b8\3\2\2\2\u06bc"+
		"\u0103\3\2\2\2\u06bd\u06be\5\u0102\u0082\2\u06be\u06bf\7\2\2\3\u06bf\u0105"+
		"\3\2\2\2\u06c0\u06c1\b\u0084\1\2\u06c1\u06c2\5n8\2\u06c2\u06c3\5\u00da"+
		"n\2\u06c3\u06c4\b\u0084\1\2\u06c4\u06cb\3\2\2\2\u06c5\u06c6\b\u0084\1"+
		"\2\u06c6\u06cb\7\u0085\2\2\u06c7\u06c8\b\u0084\1\2\u06c8\u06c9\7\u0086"+
		"\2\2\u06c9\u06cb\7\u0112\2\2\u06ca\u06c0\3\2\2\2\u06ca\u06c5\3\2\2\2\u06ca"+
		"\u06c7\3\2\2\2\u06cb\u0107\3\2\2\2\u06cc\u06cd\5\u0106\u0084\2\u06cd\u06ce"+
		"\7\2\2\3\u06ce\u0109\3\2\2\2\u06cf\u06d0\b\u0086\1\2\u06d0\u06d1\5\u010e"+
		"\u0088\2\u06d1\u06d2\5\u0192\u00ca\2\u06d2\u06d3\b\u0086\1\2\u06d3\u06da"+
		"\3\2\2\2\u06d4\u06d5\b\u0086\1\2\u06d5\u06da\7\u0087\2\2\u06d6\u06d7\b"+
		"\u0086\1\2\u06d7\u06d8\7\u0088\2\2\u06d8\u06da\7\u0112\2\2\u06d9\u06cf"+
		"\3\2\2\2\u06d9\u06d4\3\2\2\2\u06d9\u06d6\3\2\2\2\u06da\u010b\3\2\2\2\u06db"+
		"\u06dc\5\u010a\u0086\2\u06dc\u06dd\7\2\2\3\u06dd\u010d\3\2\2\2\u06de\u06df"+
		"\b\u0088\1\2\u06df\u06e0\7\u0102\2\2\u06e0\u06e7\b\u0088\1\2\u06e1\u06e2"+
		"\b\u0088\1\2\u06e2\u06e7\7\u0089\2\2\u06e3\u06e4\b\u0088\1\2\u06e4\u06e5"+
		"\7\u008a\2\2\u06e5\u06e7\7\u0112\2\2\u06e6\u06de\3\2\2\2\u06e6\u06e1\3"+
		"\2\2\2\u06e6\u06e3\3\2\2\2\u06e7\u010f\3\2\2\2\u06e8\u06e9\5\u010e\u0088"+
		"\2\u06e9\u06ea\7\2\2\3\u06ea\u0111\3\2\2\2\u06eb\u06ec\b\u008a\1\2\u06ec"+
		"\u06ed\5\u0116\u008c\2\u06ed\u06ee\5\u011e\u0090\2\u06ee\u06ef\5\u012e"+
		"\u0098\2\u06ef\u06f0\5\u011a\u008e\2\u06f0\u06f1\b\u008a\1\2\u06f1\u06f8"+
		"\3\2\2\2\u06f2\u06f3\b\u008a\1\2\u06f3\u06f8\7\u008b\2\2\u06f4\u06f5\b"+
		"\u008a\1\2\u06f5\u06f6\7\u008c\2\2\u06f6\u06f8\7\u0112\2\2\u06f7\u06eb"+
		"\3\2\2\2\u06f7\u06f2\3\2\2\2\u06f7\u06f4\3\2\2\2\u06f8\u0113\3\2\2\2\u06f9"+
		"\u06fa\5\u0112\u008a\2\u06fa\u06fb\7\2\2\3\u06fb\u0115\3\2\2\2\u06fc\u06fd"+
		"\b\u008c\1\2\u06fd\u06fe\7\u00f4\2\2\u06fe\u0705\b\u008c\1\2\u06ff\u0700"+
		"\b\u008c\1\2\u0700\u0705\7\u008d\2\2\u0701\u0702\b\u008c\1\2\u0702\u0703"+
		"\7\u008e\2\2\u0703\u0705\7\u0112\2\2\u0704\u06fc\3\2\2\2\u0704\u06ff\3"+
		"\2\2\2\u0704\u0701\3\2\2\2\u0705\u0117\3\2\2\2\u0706\u0707\5\u0116\u008c"+
		"\2\u0707\u0708\7\2\2\3\u0708\u0119\3\2\2\2\u0709\u070a\b\u008e\1\2\u070a"+
		"\u070c\b\u008e\1\2\u070b\u070d\5\u013e\u00a0\2\u070c\u070b\3\2\2\2\u070c"+
		"\u070d\3\2\2\2\u070d\u0716\3\2\2\2\u070e\u0714\b\u008e\1\2\u070f\u0710"+
		"\b\u008e\1\2\u0710\u0715\7\u008f\2\2\u0711\u0712\b\u008e\1\2\u0712\u0713"+
		"\7\u0090\2\2\u0713\u0715\7\u0112\2\2\u0714\u070f\3\2\2\2\u0714\u0711\3"+
		"\2\2\2\u0715\u0717\3\2\2\2\u0716\u070e\3\2\2\2\u0716\u0717\3\2\2\2\u0717"+
		"\u0718\3\2\2\2\u0718\u0719\b\u008e\1\2\u0719\u0720\b\u008e\1\2\u071a\u071b"+
		"\b\u008e\1\2\u071b\u0720\7\u008f\2\2\u071c\u071d\b\u008e\1\2\u071d\u071e"+
		"\7\u0090\2\2\u071e\u0720\7\u0112\2\2\u071f\u0709\3\2\2\2\u071f\u071a\3"+
		"\2\2\2\u071f\u071c\3\2\2\2\u0720\u011b\3\2\2\2\u0721\u0722\5\u011a\u008e"+
		"\2\u0722\u0723\7\2\2\3\u0723\u011d\3\2\2\2\u0724\u0725\b\u0090\1\2\u0725"+
		"\u0726\5f\64\2\u0726\u0727\5\u0122\u0092\2\u0727\u0728\b\u0090\1\2\u0728"+
		"\u072f\3\2\2\2\u0729\u072a\b\u0090\1\2\u072a\u072f\7\u0091\2\2\u072b\u072c"+
		"\b\u0090\1\2\u072c\u072d\7\u0092\2\2\u072d\u072f\7\u0112\2\2\u072e\u0724"+
		"\3\2\2\2\u072e\u0729\3\2\2\2\u072e\u072b\3\2\2\2\u072f\u011f\3\2\2\2\u0730"+
		"\u0731\5\u011e\u0090\2\u0731\u0732\7\2\2\3\u0732\u0121\3\2\2\2\u0733\u0734"+
		"\b\u0092\1\2\u0734\u0738\b\u0092\1\2\u0735\u0737\5\u0126\u0094\2\u0736"+
		"\u0735\3\2\2\2\u0737\u073a\3\2\2\2\u0738\u0736\3\2\2\2\u0738\u0739\3\2"+
		"\2\2\u0739\u0743\3\2\2\2\u073a\u0738\3\2\2\2\u073b\u0741\b\u0092\1\2\u073c"+
		"\u073d\b\u0092\1\2\u073d\u0742\7\u0093\2\2\u073e\u073f\b\u0092\1\2\u073f"+
		"\u0740\7\u0094\2\2\u0740\u0742\7\u0112\2\2\u0741\u073c\3\2\2\2\u0741\u073e"+
		"\3\2\2\2\u0742\u0744\3\2\2\2\u0743\u073b\3\2\2\2\u0743\u0744\3\2\2\2\u0744"+
		"\u0745\3\2\2\2\u0745\u0746\b\u0092\1\2\u0746\u074d\b\u0092\1\2\u0747\u0748"+
		"\b\u0092\1\2\u0748\u074d\7\u0093\2\2\u0749\u074a\b\u0092\1\2\u074a\u074b"+
		"\7\u0094\2\2\u074b\u074d\7\u0112\2\2\u074c\u0733\3\2\2\2\u074c\u0747\3"+
		"\2\2\2\u074c\u0749\3\2\2\2\u074d\u0123\3\2\2\2\u074e\u074f\5\u0122\u0092"+
		"\2\u074f\u0750\7\2\2\3\u0750\u0125\3\2\2\2\u0751\u0752\b\u0094\1\2\u0752"+
		"\u0753\5\u012a\u0096\2\u0753\u0754\5f\64\2\u0754\u0755\b\u0094\1\2\u0755"+
		"\u075c\3\2\2\2\u0756\u0757\b\u0094\1\2\u0757\u075c\7\u0095\2\2\u0758\u0759"+
		"\b\u0094\1\2\u0759\u075a\7\u0096\2\2\u075a\u075c\7\u0112\2\2\u075b\u0751"+
		"\3\2\2\2\u075b\u0756\3\2\2\2\u075b\u0758\3\2\2\2\u075c\u0127\3\2\2\2\u075d"+
		"\u075e\5\u0126\u0094\2\u075e\u075f\7\2\2\3\u075f\u0129\3\2\2\2\u0760\u0761"+
		"\b\u0096\1\2\u0761\u0762\7\u0107\2\2\u0762\u0769\b\u0096\1\2\u0763\u0764"+
		"\b\u0096\1\2\u0764\u0769\7\u0097\2\2\u0765\u0766\b\u0096\1\2\u0766\u0767"+
		"\7\u0098\2\2\u0767\u0769\7\u0112\2\2\u0768\u0760\3\2\2\2\u0768\u0763\3"+
		"\2\2\2\u0768\u0765\3\2\2\2\u0769\u012b\3\2\2\2\u076a\u076b\5\u012a\u0096"+
		"\2\u076b\u076c\7\2\2\3\u076c\u012d\3\2\2\2\u076d\u076e\b\u0098\1\2\u076e"+
		"\u076f\5\u013a\u009e\2\u076f\u0770\5\u0132\u009a\2\u0770\u0771\b\u0098"+
		"\1\2\u0771\u0778\3\2\2\2\u0772\u0773\b\u0098\1\2\u0773\u0778\7\u0099\2"+
		"\2\u0774\u0775\b\u0098\1\2\u0775\u0776\7\u009a\2\2\u0776\u0778\7\u0112"+
		"\2\2\u0777\u076d\3\2\2\2\u0777\u0772\3\2\2\2\u0777\u0774\3\2\2\2\u0778"+
		"\u012f\3\2\2\2\u0779\u077a\5\u012e\u0098\2\u077a\u077b\7\2\2\3\u077b\u0131"+
		"\3\2\2\2\u077c\u077d\b\u009a\1\2\u077d\u0781\b\u009a\1\2\u077e\u0780\5"+
		"\u0136\u009c\2\u077f\u077e\3\2\2\2\u0780\u0783\3\2\2\2\u0781\u077f\3\2"+
		"\2\2\u0781\u0782\3\2\2\2\u0782\u078c\3\2\2\2\u0783\u0781\3\2\2\2\u0784"+
		"\u078a\b\u009a\1\2\u0785\u0786\b\u009a\1\2\u0786\u078b\7\u009b\2\2\u0787"+
		"\u0788\b\u009a\1\2\u0788\u0789\7\u009c\2\2\u0789\u078b\7\u0112\2\2\u078a"+
		"\u0785\3\2\2\2\u078a\u0787\3\2\2\2\u078b\u078d\3\2\2\2\u078c\u0784\3\2"+
		"\2\2\u078c\u078d\3\2\2\2\u078d\u078e\3\2\2\2\u078e\u078f\b\u009a\1\2\u078f"+
		"\u0796\b\u009a\1\2\u0790\u0791\b\u009a\1\2\u0791\u0796\7\u009b\2\2\u0792"+
		"\u0793\b\u009a\1\2\u0793\u0794\7\u009c\2\2\u0794\u0796\7\u0112\2\2\u0795"+
		"\u077c\3\2\2\2\u0795\u0790\3\2\2\2\u0795\u0792\3\2\2\2\u0796\u0133\3\2"+
		"\2\2\u0797\u0798\5\u0132\u009a\2\u0798\u0799\7\2\2\3\u0799\u0135\3\2\2"+
		"\2\u079a\u079b\b\u009c\1\2\u079b\u079c\5\22\n\2\u079c\u079d\5\u013a\u009e"+
		"\2\u079d\u079e\b\u009c\1\2\u079e\u07a5\3\2\2\2\u079f\u07a0\b\u009c\1\2"+
		"\u07a0\u07a5\7\u009d\2\2\u07a1\u07a2\b\u009c\1\2\u07a2\u07a3\7\u009e\2"+
		"\2\u07a3\u07a5\7\u0112\2\2\u07a4\u079a\3\2\2\2\u07a4\u079f\3\2\2\2\u07a4"+
		"\u07a1\3\2\2\2\u07a5\u0137\3\2\2\2\u07a6\u07a7\5\u0136\u009c\2\u07a7\u07a8"+
		"\7\2\2\3\u07a8\u0139\3\2\2\2\u07a9\u07aa\b\u009e\1\2\u07aa\u07ab\5\62"+
		"\32\2\u07ab\u07ac\b\u009e\1\2\u07ac\u07b3\3\2\2\2\u07ad\u07ae\b\u009e"+
		"\1\2\u07ae\u07b3\7\u009f\2\2\u07af\u07b0\b\u009e\1\2\u07b0\u07b1\7\u00a0"+
		"\2\2\u07b1\u07b3\7\u0112\2\2\u07b2\u07a9\3\2\2\2\u07b2\u07ad\3\2\2\2\u07b2"+
		"\u07af\3\2\2\2\u07b3\u013b\3\2\2\2\u07b4\u07b5\5\u013a\u009e\2\u07b5\u07b6"+
		"\7\2\2\3\u07b6\u013d\3\2\2\2\u07b7\u07b8\b\u00a0\1\2\u07b8\u07b9\5\u0142"+
		"\u00a2\2\u07b9\u07ba\b\u00a0\1\2\u07ba\u07c1\3\2\2\2\u07bb\u07bc\b\u00a0"+
		"\1\2\u07bc\u07c1\7\u00a1\2\2\u07bd\u07be\b\u00a0\1\2\u07be\u07bf\7\u00a2"+
		"\2\2\u07bf\u07c1\7\u0112\2\2\u07c0\u07b7\3\2\2\2\u07c0\u07bb\3\2\2\2\u07c0"+
		"\u07bd\3\2\2\2\u07c1\u013f\3\2\2\2\u07c2\u07c3\5\u013e\u00a0\2\u07c3\u07c4"+
		"\7\2\2\3\u07c4\u0141\3\2\2\2\u07c5\u07c6\b\u00a2\1\2\u07c6\u07c7\7\u00f5"+
		"\2\2\u07c7\u07ce\b\u00a2\1\2\u07c8\u07c9\b\u00a2\1\2\u07c9\u07ce\7\u00a3"+
		"\2\2\u07ca\u07cb\b\u00a2\1\2\u07cb\u07cc\7\u00a4\2\2\u07cc\u07ce\7\u0112"+
		"\2\2\u07cd\u07c5\3\2\2\2\u07cd\u07c8\3\2\2\2\u07cd\u07ca\3\2\2\2\u07ce"+
		"\u0143\3\2\2\2\u07cf\u07d0\5\u0142\u00a2\2\u07d0\u07d1\7\2\2\3\u07d1\u0145"+
		"\3\2\2\2\u07d2\u07d3\b\u00a4\1\2\u07d3\u07d4\5*\26\2\u07d4\u07d5\5\u014a"+
		"\u00a6\2\u07d5\u07d6\5.\30\2\u07d6\u07d7\b\u00a4\1\2\u07d7\u07de\3\2\2"+
		"\2\u07d8\u07d9\b\u00a4\1\2\u07d9\u07de\7\u00a5\2\2\u07da\u07db\b\u00a4"+
		"\1\2\u07db\u07dc\7\u00a6\2\2\u07dc\u07de\7\u0112\2\2\u07dd\u07d2\3\2\2"+
		"\2\u07dd\u07d8\3\2\2\2\u07dd\u07da\3\2\2\2\u07de\u0147\3\2\2\2\u07df\u07e0"+
		"\5\u0146\u00a4\2\u07e0\u07e1\7\2\2\3\u07e1\u0149\3\2\2\2\u07e2\u07e3\b"+
		"\u00a6\1\2\u07e3\u07e5\b\u00a6\1\2\u07e4\u07e6\5\u014e\u00a8\2\u07e5\u07e4"+
		"\3\2\2\2\u07e5\u07e6\3\2\2\2\u07e6\u07ef\3\2\2\2\u07e7\u07ed\b\u00a6\1"+
		"\2\u07e8\u07e9\b\u00a6\1\2\u07e9\u07ee\7\u00a7\2\2\u07ea\u07eb\b\u00a6"+
		"\1\2\u07eb\u07ec\7\u00a8\2\2\u07ec\u07ee\7\u0112\2\2\u07ed\u07e8\3\2\2"+
		"\2\u07ed\u07ea\3\2\2\2\u07ee\u07f0\3\2\2\2\u07ef\u07e7\3\2\2\2\u07ef\u07f0"+
		"\3\2\2\2\u07f0\u07f1\3\2\2\2\u07f1\u07f2\b\u00a6\1\2\u07f2\u07f9\b\u00a6"+
		"\1\2\u07f3\u07f4\b\u00a6\1\2\u07f4\u07f9\7\u00a7\2\2\u07f5\u07f6\b\u00a6"+
		"\1\2\u07f6\u07f7\7\u00a8\2\2\u07f7\u07f9\7\u0112\2\2\u07f8\u07e2\3\2\2"+
		"\2\u07f8\u07f3\3\2\2\2\u07f8\u07f5\3\2\2\2\u07f9\u014b\3\2\2\2\u07fa\u07fb"+
		"\5\u014a\u00a6\2\u07fb\u07fc\7\2\2\3\u07fc\u014d\3\2\2\2\u07fd\u07fe\b"+
		"\u00a8\1\2\u07fe\u07ff\5\u015e\u00b0\2\u07ff\u0800\5\u0152\u00aa\2\u0800"+
		"\u0801\b\u00a8\1\2\u0801\u0808\3\2\2\2\u0802\u0803\b\u00a8\1\2\u0803\u0808"+
		"\7\u00a9\2\2\u0804\u0805\b\u00a8\1\2\u0805\u0806\7\u00aa\2\2\u0806\u0808"+
		"\7\u0112\2\2\u0807\u07fd\3\2\2\2\u0807\u0802\3\2\2\2\u0807\u0804\3\2\2"+
		"\2\u0808\u014f\3\2\2\2\u0809\u080a\5\u014e\u00a8\2\u080a\u080b\7\2\2\3"+
		"\u080b\u0151\3\2\2\2\u080c\u080d\b\u00aa\1\2\u080d\u0811\b\u00aa\1\2\u080e"+
		"\u0810\5\u0156\u00ac\2\u080f\u080e\3\2\2\2\u0810\u0813\3\2\2\2\u0811\u080f"+
		"\3\2\2\2\u0811\u0812\3\2\2\2\u0812\u081c\3\2\2\2\u0813\u0811\3\2\2\2\u0814"+
		"\u081a\b\u00aa\1\2\u0815\u0816\b\u00aa\1\2\u0816\u081b\7\u00ab\2\2\u0817"+
		"\u0818\b\u00aa\1\2\u0818\u0819\7\u00ac\2\2\u0819\u081b\7\u0112\2\2\u081a"+
		"\u0815\3\2\2\2\u081a\u0817\3\2\2\2\u081b\u081d\3\2\2\2\u081c\u0814\3\2"+
		"\2\2\u081c\u081d\3\2\2\2\u081d\u081e\3\2\2\2\u081e\u081f\b\u00aa\1\2\u081f"+
		"\u0826\b\u00aa\1\2\u0820\u0821\b\u00aa\1\2\u0821\u0826\7\u00ab\2\2\u0822"+
		"\u0823\b\u00aa\1\2\u0823\u0824\7\u00ac\2\2\u0824\u0826\7\u0112\2\2\u0825"+
		"\u080c\3\2\2\2\u0825\u0820\3\2\2\2\u0825\u0822\3\2\2\2\u0826\u0153\3\2"+
		"\2\2\u0827\u0828\5\u0152\u00aa\2\u0828\u0829\7\2\2\3\u0829\u0155\3\2\2"+
		"\2\u082a\u082b\b\u00ac\1\2\u082b\u082c\5\22\n\2\u082c\u082d\5\u015a\u00ae"+
		"\2\u082d\u082e\b\u00ac\1\2\u082e\u0835\3\2\2\2\u082f\u0830\b\u00ac\1\2"+
		"\u0830\u0835\7\u00ad\2\2\u0831\u0832\b\u00ac\1\2\u0832\u0833\7\u00ae\2"+
		"\2\u0833\u0835\7\u0112\2\2\u0834\u082a\3\2\2\2\u0834\u082f\3\2\2\2\u0834"+
		"\u0831\3\2\2\2\u0835\u0157\3\2\2\2\u0836\u0837\5\u0156\u00ac\2\u0837\u0838"+
		"\7\2\2\3\u0838\u0159\3\2\2\2\u0839\u083a\b\u00ae\1\2\u083a\u083c\b\u00ae"+
		"\1\2\u083b\u083d\5\u015e\u00b0\2\u083c\u083b\3\2\2\2\u083c\u083d\3\2\2"+
		"\2\u083d\u0846\3\2\2\2\u083e\u0844\b\u00ae\1\2\u083f\u0840\b\u00ae\1\2"+
		"\u0840\u0845\7\u00af\2\2\u0841\u0842\b\u00ae\1\2\u0842\u0843\7\u00b0\2"+
		"\2\u0843\u0845\7\u0112\2\2\u0844\u083f\3\2\2\2\u0844\u0841\3\2\2\2\u0845"+
		"\u0847\3\2\2\2\u0846\u083e\3\2\2\2\u0846\u0847\3\2\2\2\u0847\u0848\3\2"+
		"\2\2\u0848\u0849\b\u00ae\1\2\u0849\u0850\b\u00ae\1\2\u084a\u084b\b\u00ae"+
		"\1\2\u084b\u0850\7\u00af\2\2\u084c\u084d\b\u00ae\1\2\u084d\u084e\7\u00b0"+
		"\2\2\u084e\u0850\7\u0112\2\2\u084f\u0839\3\2\2\2\u084f\u084a\3\2\2\2\u084f"+
		"\u084c\3\2\2\2\u0850\u015b\3\2\2\2\u0851\u0852\5\u015a\u00ae\2\u0852\u0853"+
		"\7\2\2\3\u0853\u015d\3\2\2\2\u0854\u0855\b\u00b0\1\2\u0855\u0856\5r:\2"+
		"\u0856\u0857\b\u00b0\1\2\u0857\u088d\3\2\2\2\u0858\u0859\b\u00b0\1\2\u0859"+
		"\u085a\5\u0162\u00b2\2\u085a\u085b\5r:\2\u085b\u085c\b\u00b0\1\2\u085c"+
		"\u088d\3\2\2\2\u085d\u085e\b\u00b0\1\2\u085e\u085f\5r:\2\u085f\u0860\5"+
		"F$\2\u0860\u0861\5f\64\2\u0861\u0862\b\u00b0\1\2\u0862\u088d\3\2\2\2\u0863"+
		"\u0864\b\u00b0\1\2\u0864\u0865\5\u00dep\2\u0865\u0866\b\u00b0\1\2\u0866"+
		"\u088d\3\2\2\2\u0867\u0868\b\u00b0\1\2\u0868\u0869\5\u0162\u00b2\2\u0869"+
		"\u086a\5\u00dep\2\u086a\u086b\b\u00b0\1\2\u086b\u088d\3\2\2\2\u086c\u086d"+
		"\b\u00b0\1\2\u086d\u086e\5\u00dep\2\u086e\u086f\5F$\2\u086f\u0870\5f\64"+
		"\2\u0870\u0871\b\u00b0\1\2\u0871\u088d\3\2\2\2\u0872\u0873\b\u00b0\1\2"+
		"\u0873\u0874\5&\24\2\u0874\u0875\b\u00b0\1\2\u0875\u088d\3\2\2\2\u0876"+
		"\u0877\b\u00b0\1\2\u0877\u0878\5\u0162\u00b2\2\u0878\u0879\5&\24\2\u0879"+
		"\u087a\b\u00b0\1\2\u087a\u088d\3\2\2\2\u087b\u087c\b\u00b0\1\2\u087c\u087d"+
		"\5&\24\2\u087d\u087e\5F$\2\u087e\u087f\5f\64\2\u087f\u0880\b\u00b0\1\2"+
		"\u0880\u088d\3\2\2\2\u0881\u0882\b\u00b0\1\2\u0882\u0883\5\u01b2\u00da"+
		"\2\u0883\u0884\5F$\2\u0884\u0885\5f\64\2\u0885\u0886\b\u00b0\1\2\u0886"+
		"\u088d\3\2\2\2\u0887\u0888\b\u00b0\1\2\u0888\u088d\7\u00b1\2\2\u0889\u088a"+
		"\b\u00b0\1\2\u088a\u088b\7\u00b2\2\2\u088b\u088d\7\u0112\2\2\u088c\u0854"+
		"\3\2\2\2\u088c\u0858\3\2\2\2\u088c\u085d\3\2\2\2\u088c\u0863\3\2\2\2\u088c"+
		"\u0867\3\2\2\2\u088c\u086c\3\2\2\2\u088c\u0872\3\2\2\2\u088c\u0876\3\2"+
		"\2\2\u088c\u087b\3\2\2\2\u088c\u0881\3\2\2\2\u088c\u0887\3\2\2\2\u088c"+
		"\u0889\3\2\2\2\u088d\u015f\3\2\2\2\u088e\u088f\5\u015e\u00b0\2\u088f\u0890"+
		"\7\2\2\3\u0890\u0161\3\2\2\2\u0891\u0892\b\u00b2\1\2\u0892\u0893\7\u0104"+
		"\2\2\u0893\u089a\b\u00b2\1\2\u0894\u0895\b\u00b2\1\2\u0895\u089a\7\u00b3"+
		"\2\2\u0896\u0897\b\u00b2\1\2\u0897\u0898\7\u00b4\2\2\u0898\u089a\7\u0112"+
		"\2\2\u0899\u0891\3\2\2\2\u0899\u0894\3\2\2\2\u0899\u0896\3\2\2\2\u089a"+
		"\u0163\3\2\2\2\u089b\u089c\5\u0162\u00b2\2\u089c\u089d\7\2\2\3\u089d\u0165"+
		"\3\2\2\2\u089e\u089f\b\u00b4\1\2\u089f\u08a0\5\u0112\u008a\2\u08a0\u08a1"+
		"\b\u00b4\1\2\u08a1\u08a8\3\2\2\2\u08a2\u08a3\b\u00b4\1\2\u08a3\u08a8\7"+
		"\u00b5\2\2\u08a4\u08a5\b\u00b4\1\2\u08a5\u08a6\7\u00b6\2\2\u08a6\u08a8"+
		"\7\u0112\2\2\u08a7\u089e\3\2\2\2\u08a7\u08a2\3\2\2\2\u08a7\u08a4\3\2\2"+
		"\2\u08a8\u0167\3\2\2\2\u08a9\u08aa\5\u0166\u00b4\2\u08aa\u08ab\7\2\2\3"+
		"\u08ab\u0169\3\2\2\2\u08ac\u08ad\b\u00b6\1\2\u08ad\u08ae\5\u016e\u00b8"+
		"\2\u08ae\u08af\5\u0182\u00c2\2\u08af\u08b0\5\u0192\u00ca\2\u08b0\u08b1"+
		"\5\u0172\u00ba\2\u08b1\u08b2\5\u00be`\2\u08b2\u08b3\5\u01a2\u00d2\2\u08b3"+
		"\u08b4\5\u00c6d\2\u08b4\u08b5\b\u00b6\1\2\u08b5\u08c4\3\2\2\2\u08b6\u08b7"+
		"\b\u00b6\1\2\u08b7\u08b8\5\u016e\u00b8\2\u08b8\u08b9\5\u0182\u00c2\2\u08b9"+
		"\u08ba\5\u01ae\u00d8\2\u08ba\u08bb\5\u010e\u0088\2\u08bb\u08bc\5\u0192"+
		"\u00ca\2\u08bc\u08bd\b\u00b6\1\2\u08bd\u08c4\3\2\2\2\u08be\u08bf\b\u00b6"+
		"\1\2\u08bf\u08c4\7\u00b7\2\2\u08c0\u08c1\b\u00b6\1\2\u08c1\u08c2\7\u00b8"+
		"\2\2\u08c2\u08c4\7\u0112\2\2\u08c3\u08ac\3\2\2\2\u08c3\u08b6\3\2\2\2\u08c3"+
		"\u08be\3\2\2\2\u08c3\u08c0\3\2\2\2\u08c4\u016b\3\2\2\2\u08c5\u08c6\5\u016a"+
		"\u00b6\2\u08c6\u08c7\7\2\2\3\u08c7\u016d\3\2\2\2\u08c8\u08c9\b\u00b8\1"+
		"\2\u08c9\u08cb\b\u00b8\1\2\u08ca\u08cc\5\u0176\u00bc\2\u08cb\u08ca\3\2"+
		"\2\2\u08cb\u08cc\3\2\2\2\u08cc\u08d5\3\2\2\2\u08cd\u08d3\b\u00b8\1\2\u08ce"+
		"\u08cf\b\u00b8\1\2\u08cf\u08d4\7\u00b9\2\2\u08d0\u08d1\b\u00b8\1\2\u08d1"+
		"\u08d2\7\u00ba\2\2\u08d2\u08d4\7\u0112\2\2\u08d3\u08ce\3\2\2\2\u08d3\u08d0"+
		"\3\2\2\2\u08d4\u08d6\3\2\2\2\u08d5\u08cd\3\2\2\2\u08d5\u08d6\3\2\2\2\u08d6"+
		"\u08d7\3\2\2\2\u08d7\u08d8\b\u00b8\1\2\u08d8\u08df\b\u00b8\1\2\u08d9\u08da"+
		"\b\u00b8\1\2\u08da\u08df\7\u00b9\2\2\u08db\u08dc\b\u00b8\1\2\u08dc\u08dd"+
		"\7\u00ba\2\2\u08dd\u08df\7\u0112\2\2\u08de\u08c8\3\2\2\2\u08de\u08d9\3"+
		"\2\2\2\u08de\u08db\3\2\2\2\u08df\u016f\3\2\2\2\u08e0\u08e1\5\u016e\u00b8"+
		"\2\u08e1\u08e2\7\2\2\3\u08e2\u0171\3\2\2\2\u08e3\u08e4\b\u00ba\1\2\u08e4"+
		"\u08e5\7\u0101\2\2\u08e5\u08ec\b\u00ba\1\2\u08e6\u08e7\b\u00ba\1\2\u08e7"+
		"\u08ec\7\u00bb\2\2\u08e8\u08e9\b\u00ba\1\2\u08e9\u08ea\7\u00bc\2\2\u08ea"+
		"\u08ec\7\u0112\2\2\u08eb\u08e3\3\2\2\2\u08eb\u08e6\3\2\2\2\u08eb\u08e8"+
		"\3\2\2\2\u08ec\u0173\3\2\2\2\u08ed\u08ee\5\u0172\u00ba\2\u08ee\u08ef\7"+
		"\2\2\3\u08ef\u0175\3\2\2\2\u08f0\u08f1\b\u00bc\1\2\u08f1\u08f2\5\u017a"+
		"\u00be\2\u08f2\u08f3\5\u017e\u00c0\2\u08f3\u08f4\5\u0082B\2\u08f4\u08f5"+
		"\b\u00bc\1\2\u08f5\u08fc\3\2\2\2\u08f6\u08f7\b\u00bc\1\2\u08f7\u08fc\7"+
		"\u00bd\2\2\u08f8\u08f9\b\u00bc\1\2\u08f9\u08fa\7\u00be\2\2\u08fa\u08fc"+
		"\7\u0112\2\2\u08fb\u08f0\3\2\2\2\u08fb\u08f6\3\2\2\2\u08fb\u08f8\3\2\2"+
		"\2\u08fc\u0177\3\2\2\2\u08fd\u08fe\5\u0176\u00bc\2\u08fe\u08ff\7\2\2\3"+
		"\u08ff\u0179\3\2\2\2\u0900\u0901\b\u00be\1\2\u0901\u0902\7\u00f8\2\2\u0902"+
		"\u0909\b\u00be\1\2\u0903\u0904\b\u00be\1\2\u0904\u0909\7\u00bf\2\2\u0905"+
		"\u0906\b\u00be\1\2\u0906\u0907\7\u00c0\2\2\u0907\u0909\7\u0112\2\2\u0908"+
		"\u0900\3\2\2\2\u0908\u0903\3\2\2\2\u0908\u0905\3\2\2\2\u0909\u017b\3\2"+
		"\2\2\u090a\u090b\5\u017a\u00be\2\u090b\u090c\7\2\2\3\u090c\u017d\3\2\2"+
		"\2\u090d\u090e\b\u00c0\1\2\u090e\u0910\b\u00c0\1\2\u090f\u0911\5\u00da"+
		"n\2\u0910\u090f\3\2\2\2\u0911\u0912\3\2\2\2\u0912\u0910\3\2\2\2\u0912"+
		"\u0913\3\2\2\2\u0913\u091c\3\2\2\2\u0914\u091a\b\u00c0\1\2\u0915\u0916"+
		"\b\u00c0\1\2\u0916\u091b\7\u00c1\2\2\u0917\u0918\b\u00c0\1\2\u0918\u0919"+
		"\7\u00c2\2\2\u0919\u091b\7\u0112\2\2\u091a\u0915\3\2\2\2\u091a\u0917\3"+
		"\2\2\2\u091b\u091d\3\2\2\2\u091c\u0914\3\2\2\2\u091c\u091d\3\2\2\2\u091d"+
		"\u091e\3\2\2\2\u091e\u091f\b\u00c0\1\2\u091f\u0920\b\u00c0\1\2\u0920\u0927"+
		"\3\2\2\2\u0921\u0922\b\u00c0\1\2\u0922\u0927\7\u00c1\2\2\u0923\u0924\b"+
		"\u00c0\1\2\u0924\u0925\7\u00c2\2\2\u0925\u0927\7\u0112\2\2\u0926\u090d"+
		"\3\2\2\2\u0926\u0921\3\2\2\2\u0926\u0923\3\2\2\2\u0927\u017f\3\2\2\2\u0928"+
		"\u0929\5\u017e\u00c0\2\u0929\u092a\7\2\2\3\u092a\u0181\3\2\2\2\u092b\u092c"+
		"\b\u00c2\1\2\u092c\u092d\5N(\2\u092d\u092e\b\u00c2\1\2\u092e\u0935\3\2"+
		"\2\2\u092f\u0930\b\u00c2\1\2\u0930\u0935\7\u00c3\2\2\u0931\u0932\b\u00c2"+
		"\1\2\u0932\u0933\7\u00c4\2\2\u0933\u0935\7\u0112\2\2\u0934\u092b\3\2\2"+
		"\2\u0934\u092f\3\2\2\2\u0934\u0931\3\2\2\2\u0935\u0183\3\2\2\2\u0936\u0937"+
		"\5\u0182\u00c2\2\u0937\u0938\7\2\2\3\u0938\u0185\3\2\2\2\u0939\u093a\b"+
		"\u00c4\1\2\u093a\u093b\5\u0192\u00ca\2\u093b\u093c\5\u018a\u00c6\2\u093c"+
		"\u093d\b\u00c4\1\2\u093d\u0944\3\2\2\2\u093e\u093f\b\u00c4\1\2\u093f\u0944"+
		"\7\u00c5\2\2\u0940\u0941\b\u00c4\1\2\u0941\u0942\7\u00c6\2\2\u0942\u0944"+
		"\7\u0112\2\2\u0943\u0939\3\2\2\2\u0943\u093e\3\2\2\2\u0943\u0940\3\2\2"+
		"\2\u0944\u0187\3\2\2\2\u0945\u0946\5\u0186\u00c4\2\u0946\u0947\7\2\2\3"+
		"\u0947\u0189\3\2\2\2\u0948\u0949\b\u00c6\1\2\u0949\u094d\b\u00c6\1\2\u094a"+
		"\u094c\5\u018e\u00c8\2\u094b\u094a\3\2\2\2\u094c\u094f\3\2\2\2\u094d\u094b"+
		"\3\2\2\2\u094d\u094e\3\2\2\2\u094e\u0958\3\2\2\2\u094f\u094d\3\2\2\2\u0950"+
		"\u0956\b\u00c6\1\2\u0951\u0952\b\u00c6\1\2\u0952\u0957\7\u00c7\2\2\u0953"+
		"\u0954\b\u00c6\1\2\u0954\u0955\7\u00c8\2\2\u0955\u0957\7\u0112\2\2\u0956"+
		"\u0951\3\2\2\2\u0956\u0953\3\2\2\2\u0957\u0959\3\2\2\2\u0958\u0950\3\2"+
		"\2\2\u0958\u0959\3\2\2\2\u0959\u095a\3\2\2\2\u095a\u095b\b\u00c6\1\2\u095b"+
		"\u0962\b\u00c6\1\2\u095c\u095d\b\u00c6\1\2\u095d\u0962\7\u00c7\2\2\u095e"+
		"\u095f\b\u00c6\1\2\u095f\u0960\7\u00c8\2\2\u0960\u0962\7\u0112\2\2\u0961"+
		"\u0948\3\2\2\2\u0961\u095c\3\2\2\2\u0961\u095e\3\2\2\2\u0962\u018b\3\2"+
		"\2\2\u0963\u0964\5\u018a\u00c6\2\u0964\u0965\7\2\2\3\u0965\u018d\3\2\2"+
		"\2\u0966\u0967\b\u00c8\1\2\u0967\u0968\5\u00a2R\2\u0968\u0969\5\u0192"+
		"\u00ca\2\u0969\u096a\b\u00c8\1\2\u096a\u0971\3\2\2\2\u096b\u096c\b\u00c8"+
		"\1\2\u096c\u0971\7\u00c9\2\2\u096d\u096e\b\u00c8\1\2\u096e\u096f\7\u00ca"+
		"\2\2\u096f\u0971\7\u0112\2\2\u0970\u0966\3\2\2\2\u0970\u096b\3\2\2\2\u0970"+
		"\u096d\3\2\2\2\u0971\u018f\3\2\2\2\u0972\u0973\5\u018e\u00c8\2\u0973\u0974"+
		"\7\2\2\3\u0974\u0191\3\2\2\2\u0975\u0976\b\u00ca\1\2\u0976\u0977\5\u01b2"+
		"\u00da\2\u0977\u0978\5\u0196\u00cc\2\u0978\u0979\b\u00ca\1\2\u0979\u0984"+
		"\3\2\2\2\u097a\u097b\b\u00ca\1\2\u097b\u097c\5\u00dan\2\u097c\u097d\b"+
		"\u00ca\1\2\u097d\u0984\3\2\2\2\u097e\u097f\b\u00ca\1\2\u097f\u0984\7\u00cb"+
		"\2\2\u0980\u0981\b\u00ca\1\2\u0981\u0982\7\u00cc\2\2\u0982\u0984\7\u0112"+
		"\2\2\u0983\u0975\3\2\2\2\u0983\u097a\3\2\2\2\u0983\u097e\3\2\2\2\u0983"+
		"\u0980\3\2\2\2\u0984\u0193\3\2\2\2\u0985\u0986\5\u0192\u00ca\2\u0986\u0987"+
		"\7\2\2\3\u0987\u0195\3\2\2\2\u0988\u0989\b\u00cc\1\2\u0989\u098b\b\u00cc"+
		"\1\2\u098a\u098c\5\u019a\u00ce\2\u098b\u098a\3\2\2\2\u098b\u098c\3\2\2"+
		"\2\u098c\u0995\3\2\2\2\u098d\u0993\b\u00cc\1\2\u098e\u098f\b\u00cc\1\2"+
		"\u098f\u0994\7\u00cd\2\2\u0990\u0991\b\u00cc\1\2\u0991\u0992\7\u00ce\2"+
		"\2\u0992\u0994\7\u0112\2\2\u0993\u098e\3\2\2\2\u0993\u0990\3\2\2\2\u0994"+
		"\u0996\3\2\2\2\u0995\u098d\3\2\2\2\u0995\u0996\3\2\2\2\u0996\u0997\3\2"+
		"\2\2\u0997\u0998\b\u00cc\1\2\u0998\u099f\b\u00cc\1\2\u0999\u099a\b\u00cc"+
		"\1\2\u099a\u099f\7\u00cd\2\2\u099b\u099c\b\u00cc\1\2\u099c\u099d\7\u00ce"+
		"\2\2\u099d\u099f\7\u0112\2\2\u099e\u0988\3\2\2\2\u099e\u0999\3\2\2\2\u099e"+
		"\u099b\3\2\2\2\u099f\u0197\3\2\2\2\u09a0\u09a1\5\u0196\u00cc\2\u09a1\u09a2"+
		"\7\2\2\3\u09a2\u0199\3\2\2\2\u09a3\u09a4\b\u00ce\1\2\u09a4\u09a5\5\u008a"+
		"F\2\u09a5\u09a6\5\u019e\u00d0\2\u09a6\u09a7\5\u0092J\2\u09a7\u09a8\b\u00ce"+
		"\1\2\u09a8\u09af\3\2\2\2\u09a9\u09aa\b\u00ce\1\2\u09aa\u09af\7\u00cf\2"+
		"\2\u09ab\u09ac\b\u00ce\1\2\u09ac\u09ad\7\u00d0\2\2\u09ad\u09af\7\u0112"+
		"\2\2\u09ae\u09a3\3\2\2\2\u09ae\u09a9\3\2\2\2\u09ae\u09ab\3\2\2\2\u09af"+
		"\u019b\3\2\2\2\u09b0\u09b1\5\u019a\u00ce\2\u09b1\u09b2\7\2\2\3\u09b2\u019d"+
		"\3\2\2\2\u09b3\u09b4\b\u00d0\1\2\u09b4\u09b6\b\u00d0\1\2\u09b5\u09b7\5"+
		"\u0186\u00c4\2\u09b6\u09b5\3\2\2\2\u09b6\u09b7\3\2\2\2\u09b7\u09c0\3\2"+
		"\2\2\u09b8\u09be\b\u00d0\1\2\u09b9\u09ba\b\u00d0\1\2\u09ba\u09bf\7\u00d1"+
		"\2\2\u09bb\u09bc\b\u00d0\1\2\u09bc\u09bd\7\u00d2\2\2\u09bd\u09bf\7\u0112"+
		"\2\2\u09be\u09b9\3\2\2\2\u09be\u09bb\3\2\2\2\u09bf\u09c1\3\2\2\2\u09c0"+
		"\u09b8\3\2\2\2\u09c0\u09c1\3\2\2\2\u09c1\u09c2\3\2\2\2\u09c2\u09c3\b\u00d0"+
		"\1\2\u09c3\u09ca\b\u00d0\1\2\u09c4\u09c5\b\u00d0\1\2\u09c5\u09ca\7\u00d1"+
		"\2\2\u09c6\u09c7\b\u00d0\1\2\u09c7\u09c8\7\u00d2\2\2\u09c8\u09ca\7\u0112"+
		"\2\2\u09c9\u09b3\3\2\2\2\u09c9\u09c4\3\2\2\2\u09c9\u09c6\3\2\2\2\u09ca"+
		"\u019f\3\2\2\2\u09cb\u09cc\5\u019e\u00d0\2\u09cc\u09cd\7\2\2\3\u09cd\u01a1"+
		"\3\2\2\2\u09ce\u09cf\b\u00d2\1\2\u09cf\u09d0\5\u01a6\u00d4\2\u09d0\u09d1"+
		"\b\u00d2\1\2\u09d1\u09d8\3\2\2\2\u09d2\u09d3\b\u00d2\1\2\u09d3\u09d8\7"+
		"\u00d3\2\2\u09d4\u09d5\b\u00d2\1\2\u09d5\u09d6\7\u00d4\2\2\u09d6\u09d8"+
		"\7\u0112\2\2\u09d7\u09ce\3\2\2\2\u09d7\u09d2\3\2\2\2\u09d7\u09d4\3\2\2"+
		"\2\u09d8\u01a3\3\2\2\2\u09d9\u09da\5\u01a2\u00d2\2\u09da\u09db\7\2\2\3"+
		"\u09db\u01a5\3\2\2\2\u09dc\u09dd\b\u00d4\1\2\u09dd\u09e1\b\u00d4\1\2\u09de"+
		"\u09e0\5\u01aa\u00d6\2\u09df\u09de\3\2\2\2\u09e0\u09e3\3\2\2\2\u09e1\u09df"+
		"\3\2\2\2\u09e1\u09e2\3\2\2\2\u09e2\u09ec\3\2\2\2\u09e3\u09e1\3\2\2\2\u09e4"+
		"\u09ea\b\u00d4\1\2\u09e5\u09e6\b\u00d4\1";
	private static final String _serializedATNSegment1 =
		"\2\u09e6\u09eb\7\u00d5\2\2\u09e7\u09e8\b\u00d4\1\2\u09e8\u09e9\7\u00d6"+
		"\2\2\u09e9\u09eb\7\u0112\2\2\u09ea\u09e5\3\2\2\2\u09ea\u09e7\3\2\2\2\u09eb"+
		"\u09ed\3\2\2\2\u09ec\u09e4\3\2\2\2\u09ec\u09ed\3\2\2\2\u09ed\u09ee\3\2"+
		"\2\2\u09ee\u09ef\b\u00d4\1\2\u09ef\u09f6\b\u00d4\1\2\u09f0\u09f1\b\u00d4"+
		"\1\2\u09f1\u09f6\7\u00d5\2\2\u09f2\u09f3\b\u00d4\1\2\u09f3\u09f4\7\u00d6"+
		"\2\2\u09f4\u09f6\7\u0112\2\2\u09f5\u09dc\3\2\2\2\u09f5\u09f0\3\2\2\2\u09f5"+
		"\u09f2\3\2\2\2\u09f6\u01a7\3\2\2\2\u09f7\u09f8\5\u01a6\u00d4\2\u09f8\u09f9"+
		"\7\2\2\3\u09f9\u01a9\3\2\2\2\u09fa\u09fb\b\u00d6\1\2\u09fb\u09fc\5\u01ae"+
		"\u00d8\2\u09fc\u09fd\5\22\n\2\u09fd\u09fe\b\u00d6\1\2\u09fe\u0a05\3\2"+
		"\2\2\u09ff\u0a00\b\u00d6\1\2\u0a00\u0a05\7\u00d7\2\2\u0a01\u0a02\b\u00d6"+
		"\1\2\u0a02\u0a03\7\u00d8\2\2\u0a03\u0a05\7\u0112\2\2\u0a04\u09fa\3\2\2"+
		"\2\u0a04\u09ff\3\2\2\2\u0a04\u0a01\3\2\2\2\u0a05\u01ab\3\2\2\2\u0a06\u0a07"+
		"\5\u01aa\u00d6\2\u0a07\u0a08\7\2\2\3\u0a08\u01ad\3\2\2\2\u0a09\u0a0a\b"+
		"\u00d8\1\2\u0a0a\u0a0b\5\u01b2\u00da\2\u0a0b\u0a0c\5B\"\2\u0a0c\u0a0d"+
		"\b\u00d8\1\2\u0a0d\u0a14\3\2\2\2\u0a0e\u0a0f\b\u00d8\1\2\u0a0f\u0a14\7"+
		"\u00d9\2\2\u0a10\u0a11\b\u00d8\1\2\u0a11\u0a12\7\u00da\2\2\u0a12\u0a14"+
		"\7\u0112\2\2\u0a13\u0a09\3\2\2\2\u0a13\u0a0e\3\2\2\2\u0a13\u0a10\3\2\2"+
		"\2\u0a14\u01af\3\2\2\2\u0a15\u0a16\5\u01ae\u00d8\2\u0a16\u0a17\7\2\2\3"+
		"\u0a17\u01b1\3\2\2\2\u0a18\u0a19\b\u00da\1\2\u0a19\u0a1a\5\u01ba\u00de"+
		"\2\u0a1a\u0a1b\5\u01b6\u00dc\2\u0a1b\u0a1c\b\u00da\1\2\u0a1c\u0a27\3\2"+
		"\2\2\u0a1d\u0a1e\b\u00da\1\2\u0a1e\u0a1f\5F$\2\u0a1f\u0a20\b\u00da\1\2"+
		"\u0a20\u0a27\3\2\2\2\u0a21\u0a22\b\u00da\1\2\u0a22\u0a27\7\u00db\2\2\u0a23"+
		"\u0a24\b\u00da\1\2\u0a24\u0a25\7\u00dc\2\2\u0a25\u0a27\7\u0112\2\2\u0a26"+
		"\u0a18\3\2\2\2\u0a26\u0a1d\3\2\2\2\u0a26\u0a21\3\2\2\2\u0a26\u0a23\3\2"+
		"\2\2\u0a27\u01b3\3\2\2\2\u0a28\u0a29\5\u01b2\u00da\2\u0a29\u0a2a\7\2\2"+
		"\3\u0a2a\u01b5\3\2\2\2\u0a2b\u0a2c\b\u00dc\1\2\u0a2c\u0a2d\7\u0109\2\2"+
		"\u0a2d\u0a34\b\u00dc\1\2\u0a2e\u0a2f\b\u00dc\1\2\u0a2f\u0a34\7\u00dd\2"+
		"\2\u0a30\u0a31\b\u00dc\1\2\u0a31\u0a32\7\u00de\2\2\u0a32\u0a34\7\u0112"+
		"\2\2\u0a33\u0a2b\3\2\2\2\u0a33\u0a2e\3\2\2\2\u0a33\u0a30\3\2\2\2\u0a34"+
		"\u01b7\3\2\2\2\u0a35\u0a36\5\u01b6\u00dc\2\u0a36\u0a37\7\2\2\3\u0a37\u01b9"+
		"\3\2\2\2\u0a38\u0a39\b\u00de\1\2\u0a39\u0a3a\5\u01b6\u00dc\2\u0a3a\u0a3b"+
		"\5\u0082B\2\u0a3b\u0a3c\5\u01ba\u00de\2\u0a3c\u0a3d\b\u00de\1\2\u0a3d"+
		"\u0a46\3\2\2\2\u0a3e\u0a3f\b\u00de\1\2\u0a3f\u0a46\b\u00de\1\2\u0a40\u0a41"+
		"\b\u00de\1\2\u0a41\u0a46\7\u00df\2\2\u0a42\u0a43\b\u00de\1\2\u0a43\u0a44"+
		"\7\u00e0\2\2\u0a44\u0a46\7\u0112\2\2\u0a45\u0a38\3\2\2\2\u0a45\u0a3e\3"+
		"\2\2\2\u0a45\u0a40\3\2\2\2\u0a45\u0a42\3\2\2\2\u0a46\u01bb\3\2\2\2\u0a47"+
		"\u0a48\5\u01ba\u00de\2\u0a48\u0a49\7\2\2\3\u0a49\u01bd\3\2\2\2\u0a4a\u0a4b"+
		"\b\u00e0\1\2\u0a4b\u0a4c\5\u01b2\u00da\2\u0a4c\u0a4d\5\u01c2\u00e2\2\u0a4d"+
		"\u0a4e\b\u00e0\1\2\u0a4e\u0a5d\3\2\2\2\u0a4f\u0a50\b\u00e0\1\2\u0a50\u0a51"+
		"\5\u01da\u00ee\2\u0a51\u0a52\b\u00e0\1\2\u0a52\u0a5d\3\2\2\2\u0a53\u0a54"+
		"\b\u00e0\1\2\u0a54\u0a55\5\u00fe\u0080\2\u0a55\u0a56\b\u00e0\1\2\u0a56"+
		"\u0a5d\3\2\2\2\u0a57\u0a58\b\u00e0\1\2\u0a58\u0a5d\7\u00e1\2\2\u0a59\u0a5a"+
		"\b\u00e0\1\2\u0a5a\u0a5b\7\u00e2\2\2\u0a5b\u0a5d\7\u0112\2\2\u0a5c\u0a4a"+
		"\3\2\2\2\u0a5c\u0a4f\3\2\2\2\u0a5c\u0a53\3\2\2\2\u0a5c\u0a57\3\2\2\2\u0a5c"+
		"\u0a59\3\2\2\2\u0a5d\u01bf\3\2\2\2\u0a5e\u0a5f\5\u01be\u00e0\2\u0a5f\u0a60"+
		"\7\2\2\3\u0a60\u01c1\3\2\2\2\u0a61\u0a62\b\u00e2\1\2\u0a62\u0a64\b\u00e2"+
		"\1\2\u0a63\u0a65\5\u01c6\u00e4\2\u0a64\u0a63\3\2\2\2\u0a64\u0a65\3\2\2"+
		"\2\u0a65\u0a6e\3\2\2\2\u0a66\u0a6c\b\u00e2\1\2\u0a67\u0a68\b\u00e2\1\2"+
		"\u0a68\u0a6d\7\u00e3\2\2\u0a69\u0a6a\b\u00e2\1\2\u0a6a\u0a6b\7\u00e4\2"+
		"\2\u0a6b\u0a6d\7\u0112\2\2\u0a6c\u0a67\3\2\2\2\u0a6c\u0a69\3\2\2\2\u0a6d"+
		"\u0a6f\3\2\2\2\u0a6e\u0a66\3\2\2\2\u0a6e\u0a6f\3\2\2\2\u0a6f\u0a70\3\2"+
		"\2\2\u0a70\u0a71\b\u00e2\1\2\u0a71\u0a78\b\u00e2\1\2\u0a72\u0a73\b\u00e2"+
		"\1\2\u0a73\u0a78\7\u00e3\2\2\u0a74\u0a75\b\u00e2\1\2\u0a75\u0a76\7\u00e4"+
		"\2\2\u0a76\u0a78\7\u0112\2\2\u0a77\u0a61\3\2\2\2\u0a77\u0a72\3\2\2\2\u0a77"+
		"\u0a74\3\2\2\2\u0a78\u01c3\3\2\2\2\u0a79\u0a7a\5\u01c2\u00e2\2\u0a7a\u0a7b"+
		"\7\2\2\3\u0a7b\u01c5\3\2\2\2\u0a7c\u0a7d\b\u00e4\1\2\u0a7d\u0a7e\5\u008a"+
		"F\2\u0a7e\u0a7f\5\u01ca\u00e6\2\u0a7f\u0a80\5\u0092J\2\u0a80\u0a81\b\u00e4"+
		"\1\2\u0a81\u0a88\3\2\2\2\u0a82\u0a83\b\u00e4\1\2\u0a83\u0a88\7\u00e5\2"+
		"\2\u0a84\u0a85\b\u00e4\1\2\u0a85\u0a86\7\u00e6\2\2\u0a86\u0a88\7\u0112"+
		"\2\2\u0a87\u0a7c\3\2\2\2\u0a87\u0a82\3\2\2\2\u0a87\u0a84\3\2\2\2\u0a88"+
		"\u01c7\3\2\2\2\u0a89\u0a8a\5\u01c6\u00e4\2\u0a8a\u0a8b\7\2\2\3\u0a8b\u01c9"+
		"\3\2\2\2\u0a8c\u0a8d\b\u00e6\1\2\u0a8d\u0a8f\b\u00e6\1\2\u0a8e\u0a90\5"+
		"\u01ce\u00e8\2\u0a8f\u0a8e\3\2\2\2\u0a8f\u0a90\3\2\2\2\u0a90\u0a99\3\2"+
		"\2\2\u0a91\u0a97\b\u00e6\1\2\u0a92\u0a93\b\u00e6\1\2\u0a93\u0a98\7\u00e7"+
		"\2\2\u0a94\u0a95\b\u00e6\1\2\u0a95\u0a96\7\u00e8\2\2\u0a96\u0a98\7\u0112"+
		"\2\2\u0a97\u0a92\3\2\2\2\u0a97\u0a94\3\2\2\2\u0a98\u0a9a\3\2\2\2\u0a99"+
		"\u0a91\3\2\2\2\u0a99\u0a9a\3\2\2\2\u0a9a\u0a9b\3\2\2\2\u0a9b\u0a9c\b\u00e6"+
		"\1\2\u0a9c\u0aa3\b\u00e6\1\2\u0a9d\u0a9e\b\u00e6\1\2\u0a9e\u0aa3\7\u00e7"+
		"\2\2\u0a9f\u0aa0\b\u00e6\1\2\u0aa0\u0aa1\7\u00e8\2\2\u0aa1\u0aa3\7\u0112"+
		"\2\2\u0aa2\u0a8c\3\2\2\2\u0aa2\u0a9d\3\2\2\2\u0aa2\u0a9f\3\2\2\2\u0aa3"+
		"\u01cb\3\2\2\2\u0aa4\u0aa5\5\u01ca\u00e6\2\u0aa5\u0aa6\7\2\2\3\u0aa6\u01cd"+
		"\3\2\2\2\u0aa7\u0aa8\b\u00e8\1\2\u0aa8\u0aa9\5\u01be\u00e0\2\u0aa9\u0aaa"+
		"\5\u01d2\u00ea\2\u0aaa\u0aab\b\u00e8\1\2\u0aab\u0ab2\3\2\2\2\u0aac\u0aad"+
		"\b\u00e8\1\2\u0aad\u0ab2\7\u00e9\2\2\u0aae\u0aaf\b\u00e8\1\2\u0aaf\u0ab0"+
		"\7\u00ea\2\2\u0ab0\u0ab2\7\u0112\2\2\u0ab1\u0aa7\3\2\2\2\u0ab1\u0aac\3"+
		"\2\2\2\u0ab1\u0aae\3\2\2\2\u0ab2\u01cf\3\2\2\2\u0ab3\u0ab4\5\u01ce\u00e8"+
		"\2\u0ab4\u0ab5\7\2\2\3\u0ab5\u01d1\3\2\2\2\u0ab6\u0ab7\b\u00ea\1\2\u0ab7"+
		"\u0abb\b\u00ea\1\2\u0ab8\u0aba\5\u01d6\u00ec\2\u0ab9\u0ab8\3\2\2\2\u0aba"+
		"\u0abd\3\2\2\2\u0abb\u0ab9\3\2\2\2\u0abb\u0abc\3\2\2\2\u0abc\u0ac6\3\2"+
		"\2\2\u0abd\u0abb\3\2\2\2\u0abe\u0ac4\b\u00ea\1\2\u0abf\u0ac0\b\u00ea\1"+
		"\2\u0ac0\u0ac5\7\u00eb\2\2\u0ac1\u0ac2\b\u00ea\1\2\u0ac2\u0ac3\7\u00ec"+
		"\2\2\u0ac3\u0ac5\7\u0112\2\2\u0ac4\u0abf\3\2\2\2\u0ac4\u0ac1\3\2\2\2\u0ac5"+
		"\u0ac7\3\2\2\2\u0ac6\u0abe\3\2\2\2\u0ac6\u0ac7\3\2\2\2\u0ac7\u0ac8\3\2"+
		"\2\2\u0ac8\u0ac9\b\u00ea\1\2\u0ac9\u0ad0\b\u00ea\1\2\u0aca\u0acb\b\u00ea"+
		"\1\2\u0acb\u0ad0\7\u00eb\2\2\u0acc\u0acd\b\u00ea\1\2\u0acd\u0ace\7\u00ec"+
		"\2\2\u0ace\u0ad0\7\u0112\2\2\u0acf\u0ab6\3\2\2\2\u0acf\u0aca\3\2\2\2\u0acf"+
		"\u0acc\3\2\2\2\u0ad0\u01d3\3\2\2\2\u0ad1\u0ad2\5\u01d2\u00ea\2\u0ad2\u0ad3"+
		"\7\2\2\3\u0ad3\u01d5\3\2\2\2\u0ad4\u0ad5\b\u00ec\1\2\u0ad5\u0ad6\5\u00a2"+
		"R\2\u0ad6\u0ad7\5\u01be\u00e0\2\u0ad7\u0ad8\b\u00ec\1\2\u0ad8\u0adf\3"+
		"\2\2\2\u0ad9\u0ada\b\u00ec\1\2\u0ada\u0adf\7\u00ed\2\2\u0adb\u0adc\b\u00ec"+
		"\1\2\u0adc\u0add\7\u00ee\2\2\u0add\u0adf\7\u0112\2\2\u0ade\u0ad4\3\2\2"+
		"\2\u0ade\u0ad9\3\2\2\2\u0ade\u0adb\3\2\2\2\u0adf\u01d7\3\2\2\2\u0ae0\u0ae1"+
		"\5\u01d6\u00ec\2\u0ae1\u0ae2\7\2\2\3\u0ae2\u01d9\3\2\2\2\u0ae3\u0ae4\b"+
		"\u00ee\1\2\u0ae4\u0ae5\5\u00be`\2\u0ae5\u0ae6\5\u01de\u00f0\2\u0ae6\u0ae7"+
		"\5\u00c6d\2\u0ae7\u0ae8\b\u00ee\1\2\u0ae8\u0aef\3\2\2\2\u0ae9\u0aea\b"+
		"\u00ee\1\2\u0aea\u0aef\7\u00ef\2\2\u0aeb\u0aec\b\u00ee\1\2\u0aec\u0aed"+
		"\7\u00f0\2\2\u0aed\u0aef\7\u0112\2\2\u0aee\u0ae3\3\2\2\2\u0aee\u0ae9\3"+
		"\2\2\2\u0aee\u0aeb\3\2\2\2\u0aef\u01db\3\2\2\2\u0af0\u0af1\5\u01da\u00ee"+
		"\2\u0af1\u0af2\7\2\2\3\u0af2\u01dd\3\2\2\2\u0af3\u0af4\b\u00f0\1\2\u0af4"+
		"\u0af6\b\u00f0\1\2\u0af5\u0af7\5\6\4\2\u0af6\u0af5\3\2\2\2\u0af6\u0af7"+
		"\3\2\2\2\u0af7\u0b00\3\2\2\2\u0af8\u0afe\b\u00f0\1\2\u0af9\u0afa\b\u00f0"+
		"\1\2\u0afa\u0aff\7\u00f1\2\2\u0afb\u0afc\b\u00f0\1\2\u0afc\u0afd\7\u00f2"+
		"\2\2\u0afd\u0aff\7\u0112\2\2\u0afe\u0af9\3\2\2\2\u0afe\u0afb\3\2\2\2\u0aff"+
		"\u0b01\3\2\2\2\u0b00\u0af8\3\2\2\2\u0b00\u0b01\3\2\2\2\u0b01\u0b02\3\2"+
		"\2\2\u0b02\u0b03\b\u00f0\1\2\u0b03\u0b0a\b\u00f0\1\2\u0b04\u0b05\b\u00f0"+
		"\1\2\u0b05\u0b0a\7\u00f1\2\2\u0b06\u0b07\b\u00f0\1\2\u0b07\u0b08\7\u00f2"+
		"\2\2\u0b08\u0b0a\7\u0112\2\2\u0b09\u0af3\3\2\2\2\u0b09\u0b04\3\2\2\2\u0b09"+
		"\u0b06\3\2\2\2\u0b0a\u01df\3\2\2\2\u0b0b\u0b0c\5\u01de\u00f0\2\u0b0c\u0b0d"+
		"\7\2\2\3\u0b0d\u01e1\3\2\2\2\u00e0\u01eb\u01fa\u0204\u020d\u020f\u0218"+
		"\u0227\u0234\u023c\u0244\u0246\u024f\u0269\u027b\u0288\u0295\u02a2\u02af"+
		"\u02c0\u02c8\u02d0\u02d2\u02db\u02e8\u02fc\u0304\u030c\u030e\u0317\u0324"+
		"\u0334\u033c\u0344\u0346\u034f\u035d\u036b\u0375\u037d\u037f\u0389\u0399"+
		"\u03a6\u03b8\u03f3\u03fb\u0403\u0405\u040e\u041b\u0423\u042b\u042d\u0436"+
		"\u0445\u0459\u0466\u0476\u0483\u048b\u0493\u0495\u049e\u04ab\u04ba\u04c4"+
		"\u04cd\u04cf\u04d8\u04e7\u04f4\u0504\u050c\u0514\u0516\u051f\u052e\u0538"+
		"\u0541\u0543\u054c\u055b\u056b\u0578\u0580\u0588\u058a\u0593\u05a0\u05af"+
		"\u05b9\u05c2\u05c4\u05cd\u05dc\u05e4\u05ec\u05ee\u05f7\u0608\u0615\u061d"+
		"\u0625\u0627\u0630\u0638\u0640\u0642\u064b\u0653\u065b\u065d\u0666\u0674"+
		"\u0681\u068f\u069c\u06ae\u06bb\u06ca\u06d9\u06e6\u06f7\u0704\u070c\u0714"+
		"\u0716\u071f\u072e\u0738\u0741\u0743\u074c\u075b\u0768\u0777\u0781\u078a"+
		"\u078c\u0795\u07a4\u07b2\u07c0\u07cd\u07dd\u07e5\u07ed\u07ef\u07f8\u0807"+
		"\u0811\u081a\u081c\u0825\u0834\u083c\u0844\u0846\u084f\u088c\u0899\u08a7"+
		"\u08c3\u08cb\u08d3\u08d5\u08de\u08eb\u08fb\u0908\u0912\u091a\u091c\u0926"+
		"\u0934\u0943\u094d\u0956\u0958\u0961\u0970\u0983\u098b\u0993\u0995\u099e"+
		"\u09ae\u09b6\u09be\u09c0\u09c9\u09d7\u09e1\u09ea\u09ec\u09f5\u0a04\u0a13"+
		"\u0a26\u0a33\u0a45\u0a5c\u0a64\u0a6c\u0a6e\u0a77\u0a87\u0a8f\u0a97\u0a99"+
		"\u0aa2\u0ab1\u0abb\u0ac4\u0ac6\u0acf\u0ade\u0aee\u0af6\u0afe\u0b00\u0b09";
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