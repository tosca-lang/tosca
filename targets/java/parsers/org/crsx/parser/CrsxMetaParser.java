// Generated from CrsxMetaParser.g4 by ANTLR 4.5
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
		MT_crsx=1, ET_crsx=2, MT_declarations=3, ET_declarations=4, MT_declaration_ZOM=5, 
		ET_declaration_ZOM=6, MT_declaration=7, ET_declaration=8, MT_moduleDeclaration=9, 
		ET_moduleDeclaration=10, MT_constructor_TOK=11, ET_constructor_TOK=12, 
		MT_importDeclaration=13, ET_importDeclaration=14, MT_ruleDeclaration=15, 
		ET_ruleDeclaration=16, MT_option_OPT=17, ET_option_OPT=18, MT_option=19, 
		ET_option=20, MT_arguments_OPT=21, ET_arguments_OPT=22, MT_pattern=23, 
		ET_pattern=24, MT_properties_OPT=25, ET_properties_OPT=26, MT_contractum=27, 
		ET_contractum=28, MT_annotations=29, ET_annotations=30, MT_annotation_OOM=31, 
		ET_annotation_OOM=32, MT_annotation=33, ET_annotation=34, MT_term=35, 
		ET_term=36, MT_freeTerm=37, ET_freeTerm=38, MT_annotations_OPT=39, ET_annotations_OPT=40, 
		MT_metavar_TOK=41, ET_metavar_TOK=42, MT_freeArguments_OPT=43, ET_freeArguments_OPT=44, 
		MT_boundTerm=45, ET_boundTerm=46, MT_nextBinder=47, ET_nextBinder=48, 
		MT_arguments=49, ET_arguments=50, MT_terms_OPT=51, ET_terms_OPT=52, MT_terms=53, 
		ET_terms=54, MT_term_ZOM=55, ET_term_ZOM=56, MT_freeArguments=57, ET_freeArguments=58, 
		MT_freeTerms_OPT=59, ET_freeTerms_OPT=60, MT_freeTerms=61, ET_freeTerms=62, 
		MT_freeTerm_ZOM=63, ET_freeTerm_ZOM=64, MT_list=65, ET_list=66, MT_termList_OPT=67, 
		ET_termList_OPT=68, MT_termList=69, ET_termList=70, MT_listItem_ZOM=71, 
		ET_listItem_ZOM=72, MT_semi_TOK_OPT=73, ET_semi_TOK_OPT=74, MT_listItem=75, 
		ET_listItem=76, MT_variable=77, ET_variable=78, MT_linear_OPT=79, ET_linear_OPT=80, 
		MT_variable_TOK=81, ET_variable_TOK=82, MT_functional_OPT=83, ET_functional_OPT=84, 
		MT_varsort_OPT=85, ET_varsort_OPT=86, MT_linear=87, ET_linear=88, MT_functional=89, 
		ET_functional=90, MT_literal=91, ET_literal=92, MT_string_TOK=93, ET_string_TOK=94, 
		MT_number_TOK=95, ET_number_TOK=96, MT_binder=97, ET_binder=98, MT_varsort=99, 
		ET_varsort=100, MT_concrete=101, ET_concrete=102, MT_category_TOK=103, 
		ET_category_TOK=104, MT_concrete_TOK=105, ET_concrete_TOK=106, MT_concrete2_TOK=107, 
		ET_concrete2_TOK=108, MT_concrete3_TOK=109, ET_concrete3_TOK=110, MT_concrete4_TOK=111, 
		ET_concrete4_TOK=112, MT_dispatch=113, ET_dispatch=114, MT_delayCase_OPT=115, 
		ET_delayCase_OPT=116, MT_dispatchTerm=117, ET_dispatchTerm=118, MT_dispatchCases=119, 
		ET_dispatchCases=120, MT_dispatchCase_ZOM=121, ET_dispatchCase_ZOM=122, 
		MT_dispatchCase=123, ET_dispatchCase=124, MT_delayCase=125, ET_delayCase=126, 
		MT_properties=127, ET_properties=128, MT_propertyList_OPT=129, ET_propertyList_OPT=130, 
		MT_propertyList=131, ET_propertyList=132, MT_property_ZOM=133, ET_property_ZOM=134, 
		MT_property=135, ET_property=136, MT_expression=137, ET_expression=138, 
		MT_sortDeclaration=139, ET_sortDeclaration=140, MT_sortparams_OPT=141, 
		ET_sortparams_OPT=142, MT_sortparams=143, ET_sortparams=144, MT_variable_OOM=145, 
		ET_variable_OOM=146, MT_sortset=147, ET_sortset=148, MT_sortnames=149, 
		ET_sortnames=150, MT_sortname_ZOM=151, ET_sortname_ZOM=152, MT_sortname=153, 
		ET_sortname=154, MT_sortarguments_OPT=155, ET_sortarguments_OPT=156, MT_sortarguments=157, 
		ET_sortarguments=158, MT_sortnames_OPT=159, ET_sortnames_OPT=160, MT_forms=161, 
		ET_forms=162, MT_form_ZOM=163, ET_form_ZOM=164, MT_form=165, ET_form=166, 
		MT_constructor=167, ET_constructor=168, MT_qualifier=169, ET_qualifier=170, 
		MT_reserved=171, ET_reserved=172, MT_directive=173, ET_directive=174, 
		MT_directiveArguments_OPT=175, ET_directiveArguments_OPT=176, MT_directiveArguments=177, 
		ET_directiveArguments=178, MT_directives_OPT=179, ET_directives_OPT=180, 
		MT_directives=181, ET_directives=182, MT_directive_ZOM=183, ET_directive_ZOM=184, 
		MT_directiveList=185, ET_directiveList=186, MODULE=187, IMPORT=188, DISPATCH=189, 
		DELAY=190, GRAMMAR=191, COLON=192, ARROW=193, FORALL=194, LPAR=195, RPAR=196, 
		LBRACE=197, RBRACE=198, LSQUARE=199, RSQUARE=200, SEMI=201, COMMA=202, 
		DATASORT=203, COLONCOLON=204, DOT=205, NOT=206, LINEAR=207, FUNCTIONAL=208, 
		AND=209, AT=210, CATEGORY=211, CONCRETE=212, CONCRETE2=213, CONCRETE3=214, 
		CONCRETE4=215, CONSTRUCTOR=216, VARIABLE=217, METAVAR=218, STRING=219, 
		NUMBER=220, WS=221, BLOCK_COMMENT=222, LINE_COMMENT=223, XML_COMMENT=224, 
		CRSX_EMBED_END=225;
	public static final int
		RULE_crsx = 0, RULE_crsx_EOF = 1, RULE_declarations = 2, RULE_declarations_EOF = 3, 
		RULE_declaration_ZOM = 4, RULE_declaration_ZOM_EOF = 5, RULE_declaration = 6, 
		RULE_declaration_EOF = 7, RULE_moduleDeclaration = 8, RULE_moduleDeclaration_EOF = 9, 
		RULE_constructor_TOK = 10, RULE_constructor_TOK_EOF = 11, RULE_importDeclaration = 12, 
		RULE_importDeclaration_EOF = 13, RULE_ruleDeclaration = 14, RULE_ruleDeclaration_EOF = 15, 
		RULE_option_OPT = 16, RULE_option_OPT_EOF = 17, RULE_option = 18, RULE_option_EOF = 19, 
		RULE_arguments_OPT = 20, RULE_arguments_OPT_EOF = 21, RULE_pattern = 22, 
		RULE_pattern_EOF = 23, RULE_properties_OPT = 24, RULE_properties_OPT_EOF = 25, 
		RULE_contractum = 26, RULE_contractum_EOF = 27, RULE_annotations = 28, 
		RULE_annotations_EOF = 29, RULE_annotation_OOM = 30, RULE_annotation_OOM_EOF = 31, 
		RULE_annotation = 32, RULE_annotation_EOF = 33, RULE_term = 34, RULE_term_EOF = 35, 
		RULE_freeTerm = 36, RULE_freeTerm_EOF = 37, RULE_annotations_OPT = 38, 
		RULE_annotations_OPT_EOF = 39, RULE_metavar_TOK = 40, RULE_metavar_TOK_EOF = 41, 
		RULE_freeArguments_OPT = 42, RULE_freeArguments_OPT_EOF = 43, RULE_boundTerm = 44, 
		RULE_boundTerm_EOF = 45, RULE_nextBinder = 46, RULE_nextBinder_EOF = 47, 
		RULE_arguments = 48, RULE_arguments_EOF = 49, RULE_terms_OPT = 50, RULE_terms_OPT_EOF = 51, 
		RULE_terms = 52, RULE_terms_EOF = 53, RULE_term_ZOM = 54, RULE_term_ZOM_EOF = 55, 
		RULE_freeArguments = 56, RULE_freeArguments_EOF = 57, RULE_freeTerms_OPT = 58, 
		RULE_freeTerms_OPT_EOF = 59, RULE_freeTerms = 60, RULE_freeTerms_EOF = 61, 
		RULE_freeTerm_ZOM = 62, RULE_freeTerm_ZOM_EOF = 63, RULE_list = 64, RULE_list_EOF = 65, 
		RULE_termList_OPT = 66, RULE_termList_OPT_EOF = 67, RULE_termList = 68, 
		RULE_termList_EOF = 69, RULE_listItem_ZOM = 70, RULE_listItem_ZOM_EOF = 71, 
		RULE_semi_TOK_OPT = 72, RULE_semi_TOK_OPT_EOF = 73, RULE_listItem = 74, 
		RULE_listItem_EOF = 75, RULE_variable = 76, RULE_variable_EOF = 77, RULE_linear_OPT = 78, 
		RULE_linear_OPT_EOF = 79, RULE_variable_TOK = 80, RULE_variable_TOK_EOF = 81, 
		RULE_functional_OPT = 82, RULE_functional_OPT_EOF = 83, RULE_varsort_OPT = 84, 
		RULE_varsort_OPT_EOF = 85, RULE_linear = 86, RULE_linear_EOF = 87, RULE_functional = 88, 
		RULE_functional_EOF = 89, RULE_literal = 90, RULE_literal_EOF = 91, RULE_string_TOK = 92, 
		RULE_string_TOK_EOF = 93, RULE_number_TOK = 94, RULE_number_TOK_EOF = 95, 
		RULE_binder = 96, RULE_binder_EOF = 97, RULE_varsort = 98, RULE_varsort_EOF = 99, 
		RULE_concrete = 100, RULE_concrete_EOF = 101, RULE_category_TOK = 102, 
		RULE_category_TOK_EOF = 103, RULE_concrete_TOK = 104, RULE_concrete_TOK_EOF = 105, 
		RULE_concrete2_TOK = 106, RULE_concrete2_TOK_EOF = 107, RULE_concrete3_TOK = 108, 
		RULE_concrete3_TOK_EOF = 109, RULE_concrete4_TOK = 110, RULE_concrete4_TOK_EOF = 111, 
		RULE_dispatch = 112, RULE_dispatch_EOF = 113, RULE_delayCase_OPT = 114, 
		RULE_delayCase_OPT_EOF = 115, RULE_dispatchTerm = 116, RULE_dispatchTerm_EOF = 117, 
		RULE_dispatchCases = 118, RULE_dispatchCases_EOF = 119, RULE_dispatchCase_ZOM = 120, 
		RULE_dispatchCase_ZOM_EOF = 121, RULE_dispatchCase = 122, RULE_dispatchCase_EOF = 123, 
		RULE_delayCase = 124, RULE_delayCase_EOF = 125, RULE_properties = 126, 
		RULE_properties_EOF = 127, RULE_propertyList_OPT = 128, RULE_propertyList_OPT_EOF = 129, 
		RULE_propertyList = 130, RULE_propertyList_EOF = 131, RULE_property_ZOM = 132, 
		RULE_property_ZOM_EOF = 133, RULE_property = 134, RULE_property_EOF = 135, 
		RULE_expression = 136, RULE_expression_EOF = 137, RULE_sortDeclaration = 138, 
		RULE_sortDeclaration_EOF = 139, RULE_sortparams_OPT = 140, RULE_sortparams_OPT_EOF = 141, 
		RULE_sortparams = 142, RULE_sortparams_EOF = 143, RULE_variable_OOM = 144, 
		RULE_variable_OOM_EOF = 145, RULE_sortset = 146, RULE_sortset_EOF = 147, 
		RULE_sortnames = 148, RULE_sortnames_EOF = 149, RULE_sortname_ZOM = 150, 
		RULE_sortname_ZOM_EOF = 151, RULE_sortname = 152, RULE_sortname_EOF = 153, 
		RULE_sortarguments_OPT = 154, RULE_sortarguments_OPT_EOF = 155, RULE_sortarguments = 156, 
		RULE_sortarguments_EOF = 157, RULE_sortnames_OPT = 158, RULE_sortnames_OPT_EOF = 159, 
		RULE_forms = 160, RULE_forms_EOF = 161, RULE_form_ZOM = 162, RULE_form_ZOM_EOF = 163, 
		RULE_form = 164, RULE_form_EOF = 165, RULE_constructor = 166, RULE_constructor_EOF = 167, 
		RULE_qualifier = 168, RULE_qualifier_EOF = 169, RULE_reserved = 170, RULE_reserved_EOF = 171, 
		RULE_directive = 172, RULE_directive_EOF = 173, RULE_directiveArguments_OPT = 174, 
		RULE_directiveArguments_OPT_EOF = 175, RULE_directiveArguments = 176, 
		RULE_directiveArguments_EOF = 177, RULE_directives_OPT = 178, RULE_directives_OPT_EOF = 179, 
		RULE_directives = 180, RULE_directives_EOF = 181, RULE_directive_ZOM = 182, 
		RULE_directive_ZOM_EOF = 183, RULE_directiveList = 184, RULE_directiveList_EOF = 185;
	public static final String[] ruleNames = {
		"crsx", "crsx_EOF", "declarations", "declarations_EOF", "declaration_ZOM", 
		"declaration_ZOM_EOF", "declaration", "declaration_EOF", "moduleDeclaration", 
		"moduleDeclaration_EOF", "constructor_TOK", "constructor_TOK_EOF", "importDeclaration", 
		"importDeclaration_EOF", "ruleDeclaration", "ruleDeclaration_EOF", "option_OPT", 
		"option_OPT_EOF", "option", "option_EOF", "arguments_OPT", "arguments_OPT_EOF", 
		"pattern", "pattern_EOF", "properties_OPT", "properties_OPT_EOF", "contractum", 
		"contractum_EOF", "annotations", "annotations_EOF", "annotation_OOM", 
		"annotation_OOM_EOF", "annotation", "annotation_EOF", "term", "term_EOF", 
		"freeTerm", "freeTerm_EOF", "annotations_OPT", "annotations_OPT_EOF", 
		"metavar_TOK", "metavar_TOK_EOF", "freeArguments_OPT", "freeArguments_OPT_EOF", 
		"boundTerm", "boundTerm_EOF", "nextBinder", "nextBinder_EOF", "arguments", 
		"arguments_EOF", "terms_OPT", "terms_OPT_EOF", "terms", "terms_EOF", "term_ZOM", 
		"term_ZOM_EOF", "freeArguments", "freeArguments_EOF", "freeTerms_OPT", 
		"freeTerms_OPT_EOF", "freeTerms", "freeTerms_EOF", "freeTerm_ZOM", "freeTerm_ZOM_EOF", 
		"list", "list_EOF", "termList_OPT", "termList_OPT_EOF", "termList", "termList_EOF", 
		"listItem_ZOM", "listItem_ZOM_EOF", "semi_TOK_OPT", "semi_TOK_OPT_EOF", 
		"listItem", "listItem_EOF", "variable", "variable_EOF", "linear_OPT", 
		"linear_OPT_EOF", "variable_TOK", "variable_TOK_EOF", "functional_OPT", 
		"functional_OPT_EOF", "varsort_OPT", "varsort_OPT_EOF", "linear", "linear_EOF", 
		"functional", "functional_EOF", "literal", "literal_EOF", "string_TOK", 
		"string_TOK_EOF", "number_TOK", "number_TOK_EOF", "binder", "binder_EOF", 
		"varsort", "varsort_EOF", "concrete", "concrete_EOF", "category_TOK", 
		"category_TOK_EOF", "concrete_TOK", "concrete_TOK_EOF", "concrete2_TOK", 
		"concrete2_TOK_EOF", "concrete3_TOK", "concrete3_TOK_EOF", "concrete4_TOK", 
		"concrete4_TOK_EOF", "dispatch", "dispatch_EOF", "delayCase_OPT", "delayCase_OPT_EOF", 
		"dispatchTerm", "dispatchTerm_EOF", "dispatchCases", "dispatchCases_EOF", 
		"dispatchCase_ZOM", "dispatchCase_ZOM_EOF", "dispatchCase", "dispatchCase_EOF", 
		"delayCase", "delayCase_EOF", "properties", "properties_EOF", "propertyList_OPT", 
		"propertyList_OPT_EOF", "propertyList", "propertyList_EOF", "property_ZOM", 
		"property_ZOM_EOF", "property", "property_EOF", "expression", "expression_EOF", 
		"sortDeclaration", "sortDeclaration_EOF", "sortparams_OPT", "sortparams_OPT_EOF", 
		"sortparams", "sortparams_EOF", "variable_OOM", "variable_OOM_EOF", "sortset", 
		"sortset_EOF", "sortnames", "sortnames_EOF", "sortname_ZOM", "sortname_ZOM_EOF", 
		"sortname", "sortname_EOF", "sortarguments_OPT", "sortarguments_OPT_EOF", 
		"sortarguments", "sortarguments_EOF", "sortnames_OPT", "sortnames_OPT_EOF", 
		"forms", "forms_EOF", "form_ZOM", "form_ZOM_EOF", "form", "form_EOF", 
		"constructor", "constructor_EOF", "qualifier", "qualifier_EOF", "reserved", 
		"reserved_EOF", "directive", "directive_EOF", "directiveArguments_OPT", 
		"directiveArguments_OPT_EOF", "directiveArguments", "directiveArguments_EOF", 
		"directives_OPT", "directives_OPT_EOF", "directives", "directives_EOF", 
		"directive_ZOM", "directive_ZOM_EOF", "directiveList", "directiveList_EOF"
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
		null, null, null, null, null, null, null, "'module'", "'import'", "'dispatch'", 
		"'delay'", "'grammar'", "':'", "'→'", "'∀'", "'('", "')'", "'{'", "'}'", 
		"'['", "']'", "';'", "','", "'::='", "'::'", "'.'", "'¬'", "'¹'", "'ᵇ'", 
		"'&'", "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MT_crsx", "ET_crsx", "MT_declarations", "ET_declarations", "MT_declaration_ZOM", 
		"ET_declaration_ZOM", "MT_declaration", "ET_declaration", "MT_moduleDeclaration", 
		"ET_moduleDeclaration", "MT_constructor_TOK", "ET_constructor_TOK", "MT_importDeclaration", 
		"ET_importDeclaration", "MT_ruleDeclaration", "ET_ruleDeclaration", "MT_option_OPT", 
		"ET_option_OPT", "MT_option", "ET_option", "MT_arguments_OPT", "ET_arguments_OPT", 
		"MT_pattern", "ET_pattern", "MT_properties_OPT", "ET_properties_OPT", 
		"MT_contractum", "ET_contractum", "MT_annotations", "ET_annotations", 
		"MT_annotation_OOM", "ET_annotation_OOM", "MT_annotation", "ET_annotation", 
		"MT_term", "ET_term", "MT_freeTerm", "ET_freeTerm", "MT_annotations_OPT", 
		"ET_annotations_OPT", "MT_metavar_TOK", "ET_metavar_TOK", "MT_freeArguments_OPT", 
		"ET_freeArguments_OPT", "MT_boundTerm", "ET_boundTerm", "MT_nextBinder", 
		"ET_nextBinder", "MT_arguments", "ET_arguments", "MT_terms_OPT", "ET_terms_OPT", 
		"MT_terms", "ET_terms", "MT_term_ZOM", "ET_term_ZOM", "MT_freeArguments", 
		"ET_freeArguments", "MT_freeTerms_OPT", "ET_freeTerms_OPT", "MT_freeTerms", 
		"ET_freeTerms", "MT_freeTerm_ZOM", "ET_freeTerm_ZOM", "MT_list", "ET_list", 
		"MT_termList_OPT", "ET_termList_OPT", "MT_termList", "ET_termList", "MT_listItem_ZOM", 
		"ET_listItem_ZOM", "MT_semi_TOK_OPT", "ET_semi_TOK_OPT", "MT_listItem", 
		"ET_listItem", "MT_variable", "ET_variable", "MT_linear_OPT", "ET_linear_OPT", 
		"MT_variable_TOK", "ET_variable_TOK", "MT_functional_OPT", "ET_functional_OPT", 
		"MT_varsort_OPT", "ET_varsort_OPT", "MT_linear", "ET_linear", "MT_functional", 
		"ET_functional", "MT_literal", "ET_literal", "MT_string_TOK", "ET_string_TOK", 
		"MT_number_TOK", "ET_number_TOK", "MT_binder", "ET_binder", "MT_varsort", 
		"ET_varsort", "MT_concrete", "ET_concrete", "MT_category_TOK", "ET_category_TOK", 
		"MT_concrete_TOK", "ET_concrete_TOK", "MT_concrete2_TOK", "ET_concrete2_TOK", 
		"MT_concrete3_TOK", "ET_concrete3_TOK", "MT_concrete4_TOK", "ET_concrete4_TOK", 
		"MT_dispatch", "ET_dispatch", "MT_delayCase_OPT", "ET_delayCase_OPT", 
		"MT_dispatchTerm", "ET_dispatchTerm", "MT_dispatchCases", "ET_dispatchCases", 
		"MT_dispatchCase_ZOM", "ET_dispatchCase_ZOM", "MT_dispatchCase", "ET_dispatchCase", 
		"MT_delayCase", "ET_delayCase", "MT_properties", "ET_properties", "MT_propertyList_OPT", 
		"ET_propertyList_OPT", "MT_propertyList", "ET_propertyList", "MT_property_ZOM", 
		"ET_property_ZOM", "MT_property", "ET_property", "MT_expression", "ET_expression", 
		"MT_sortDeclaration", "ET_sortDeclaration", "MT_sortparams_OPT", "ET_sortparams_OPT", 
		"MT_sortparams", "ET_sortparams", "MT_variable_OOM", "ET_variable_OOM", 
		"MT_sortset", "ET_sortset", "MT_sortnames", "ET_sortnames", "MT_sortname_ZOM", 
		"ET_sortname_ZOM", "MT_sortname", "ET_sortname", "MT_sortarguments_OPT", 
		"ET_sortarguments_OPT", "MT_sortarguments", "ET_sortarguments", "MT_sortnames_OPT", 
		"ET_sortnames_OPT", "MT_forms", "ET_forms", "MT_form_ZOM", "ET_form_ZOM", 
		"MT_form", "ET_form", "MT_constructor", "ET_constructor", "MT_qualifier", 
		"ET_qualifier", "MT_reserved", "ET_reserved", "MT_directive", "ET_directive", 
		"MT_directiveArguments_OPT", "ET_directiveArguments_OPT", "MT_directiveArguments", 
		"ET_directiveArguments", "MT_directives_OPT", "ET_directives_OPT", "MT_directives", 
		"ET_directives", "MT_directive_ZOM", "ET_directive_ZOM", "MT_directiveList", 
		"ET_directiveList", "MODULE", "IMPORT", "DISPATCH", "DELAY", "GRAMMAR", 
		"COLON", "ARROW", "FORALL", "LPAR", "RPAR", "LBRACE", "RBRACE", "LSQUARE", 
		"RSQUARE", "SEMI", "COMMA", "DATASORT", "COLONCOLON", "DOT", "NOT", "LINEAR", 
		"FUNCTIONAL", "AND", "AT", "CATEGORY", "CONCRETE", "CONCRETE2", "CONCRETE3", 
		"CONCRETE4", "CONSTRUCTOR", "VARIABLE", "METAVAR", "STRING", "NUMBER", 
		"WS", "BLOCK_COMMENT", "LINE_COMMENT", "XML_COMMENT", "CRSX_EMBED_END"
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
			setState(381);
			switch (_input.LA(1)) {
			case EOF:
			case MT_declarations:
			case ET_declarations:
			case MT_declaration_ZOM:
			case ET_declaration_ZOM:
			case MT_declaration:
			case ET_declaration:
			case MT_moduleDeclaration:
			case ET_moduleDeclaration:
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_importDeclaration:
			case ET_importDeclaration:
			case MT_ruleDeclaration:
			case ET_ruleDeclaration:
			case MT_option_OPT:
			case ET_option_OPT:
			case MT_option:
			case ET_option:
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
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
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
			case SEMI:
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
				setState(373);
				declarations();
				_exitAlt();
				}
				break;
			case MT_crsx:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(377);
				match(MT_crsx);
				}
				break;
			case ET_crsx:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(379);
				match(ET_crsx);
				setState(380);
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
			setState(383);
			crsx();
			setState(384);
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
		public Declaration_ZOMContext declaration_ZOM() {
			return getRuleContext(Declaration_ZOMContext.class,0);
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
			setState(395);
			switch (_input.LA(1)) {
			case EOF:
			case MT_declaration_ZOM:
			case ET_declaration_ZOM:
			case MT_declaration:
			case ET_declaration:
			case MT_moduleDeclaration:
			case ET_moduleDeclaration:
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_importDeclaration:
			case ET_importDeclaration:
			case MT_ruleDeclaration:
			case ET_ruleDeclaration:
			case MT_option_OPT:
			case ET_option_OPT:
			case MT_option:
			case ET_option:
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
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
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
			case RPAR:
			case LBRACE:
			case RBRACE:
			case SEMI:
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
				setState(387);
				declaration_ZOM();
				_exitAlt();
				}
				break;
			case MT_declarations:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(391);
				match(MT_declarations);
				}
				break;
			case ET_declarations:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(393);
				match(ET_declarations);
				setState(394);
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
			setState(397);
			declarations();
			setState(398);
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

	public static class Declaration_ZOMContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public TerminalNode MT_declaration_ZOM() { return getToken(CrsxMetaParser.MT_declaration_ZOM, 0); }
		public TerminalNode ET_declaration_ZOM() { return getToken(CrsxMetaParser.ET_declaration_ZOM, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Declaration_ZOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_ZOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDeclaration_ZOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDeclaration_ZOM(this);
		}
	}

	public final Declaration_ZOMContext declaration_ZOM() throws RecognitionException {
		Declaration_ZOMContext _localctx = new Declaration_ZOMContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration_ZOM);
		int _la;
		try {
			setState(425);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterZOM();
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_declaration) | (1L << ET_declaration) | (1L << MT_moduleDeclaration) | (1L << ET_moduleDeclaration) | (1L << MT_constructor_TOK) | (1L << ET_constructor_TOK) | (1L << MT_importDeclaration) | (1L << ET_importDeclaration) | (1L << MT_ruleDeclaration) | (1L << ET_ruleDeclaration) | (1L << MT_option_OPT) | (1L << ET_option_OPT) | (1L << MT_option) | (1L << ET_option) | (1L << MT_pattern) | (1L << ET_pattern) | (1L << MT_properties_OPT) | (1L << ET_properties_OPT) | (1L << MT_annotations) | (1L << ET_annotations) | (1L << MT_annotation_OOM) | (1L << ET_annotation_OOM) | (1L << MT_annotation) | (1L << ET_annotation))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (MT_variable - 77)) | (1L << (ET_variable - 77)) | (1L << (MT_linear_OPT - 77)) | (1L << (ET_linear_OPT - 77)) | (1L << (MT_variable_TOK - 77)) | (1L << (ET_variable_TOK - 77)) | (1L << (MT_linear - 77)) | (1L << (ET_linear - 77)) | (1L << (MT_literal - 77)) | (1L << (ET_literal - 77)) | (1L << (MT_string_TOK - 77)) | (1L << (ET_string_TOK - 77)) | (1L << (MT_number_TOK - 77)) | (1L << (ET_number_TOK - 77)) | (1L << (MT_concrete - 77)) | (1L << (ET_concrete - 77)) | (1L << (MT_category_TOK - 77)) | (1L << (ET_category_TOK - 77)) | (1L << (MT_properties - 77)) | (1L << (ET_properties - 77)) | (1L << (MT_sortDeclaration - 77)) | (1L << (ET_sortDeclaration - 77)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (MT_sortparams_OPT - 141)) | (1L << (ET_sortparams_OPT - 141)) | (1L << (MT_sortparams - 141)) | (1L << (ET_sortparams - 141)) | (1L << (MT_sortset - 141)) | (1L << (ET_sortset - 141)) | (1L << (MT_sortname - 141)) | (1L << (ET_sortname - 141)) | (1L << (MT_form - 141)) | (1L << (ET_form - 141)) | (1L << (MT_constructor - 141)) | (1L << (ET_constructor - 141)) | (1L << (MT_qualifier - 141)) | (1L << (ET_qualifier - 141)) | (1L << (MT_reserved - 141)) | (1L << (ET_reserved - 141)) | (1L << (MT_directive - 141)) | (1L << (ET_directive - 141)) | (1L << (MT_directiveList - 141)) | (1L << (ET_directiveList - 141)) | (1L << (MODULE - 141)) | (1L << (IMPORT - 141)) | (1L << (COLON - 141)) | (1L << (FORALL - 141)) | (1L << (LPAR - 141)) | (1L << (LBRACE - 141)) | (1L << (SEMI - 141)))) != 0) || ((((_la - 207)) & ~0x3f) == 0 && ((1L << (_la - 207)) & ((1L << (LINEAR - 207)) | (1L << (AT - 207)) | (1L << (CATEGORY - 207)) | (1L << (CONSTRUCTOR - 207)) | (1L << (VARIABLE - 207)) | (1L << (STRING - 207)) | (1L << (NUMBER - 207)))) != 0)) {
					{
					{
					setState(402);
					declaration();
					}
					}
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(416);
				_la = _input.LA(1);
				if (_la==MT_declaration_ZOM || _la==ET_declaration_ZOM) {
					{
					_tail();
					setState(414);
					switch (_input.LA(1)) {
					case MT_declaration_ZOM:
						{
						_term();
						setState(410);
						match(MT_declaration_ZOM);
						}
						break;
					case ET_declaration_ZOM:
						{
						_embed();
						setState(412);
						match(ET_declaration_ZOM);
						setState(413);
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
				setState(421);
				match(MT_declaration_ZOM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(423);
				match(ET_declaration_ZOM);
				setState(424);
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

	public static class Declaration_ZOM_EOFContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Declaration_ZOMContext declaration_ZOM() {
			return getRuleContext(Declaration_ZOMContext.class,0);
		}
		public Declaration_ZOM_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_ZOM_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDeclaration_ZOM_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDeclaration_ZOM_EOF(this);
		}
	}

	public final Declaration_ZOM_EOFContext declaration_ZOM_EOF() throws RecognitionException {
		Declaration_ZOM_EOFContext _localctx = new Declaration_ZOM_EOFContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(427);
				declaration_ZOM();
				}
				break;
			case 2:
				{
				_enterZOM();
				_exitZOM();
				}
				break;
			}
			setState(432);
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
		public TerminalNode SEMI() { return getToken(CrsxMetaParser.SEMI, 0); }
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
		enterRule(_localctx, 12, RULE_declaration);
		try {
			setState(473);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(435);
				moduleDeclaration();
				_hide();
				setState(437);
				match(SEMI);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(441);
				importDeclaration();
				_hide();
				setState(443);
				match(SEMI);
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(447);
				ruleDeclaration();
				_hide();
				setState(449);
				match(SEMI);
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(453);
				sortDeclaration();
				_hide();
				setState(455);
				match(SEMI);
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				setState(459);
				directive();
				_hide();
				setState(461);
				match(SEMI);
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_enterAlt("6");
				_hide();
				setState(466);
				match(SEMI);
				_exitAlt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				_term();
				setState(469);
				match(MT_declaration);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				_embed();
				setState(471);
				match(ET_declaration);
				setState(472);
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
		enterRule(_localctx, 14, RULE_declaration_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			declaration();
			setState(476);
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
		public TerminalNode MODULE() { return getToken(CrsxMetaParser.MODULE, 0); }
		public Constructor_TOKContext constructor_TOK() {
			return getRuleContext(Constructor_TOKContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CrsxMetaParser.LBRACE, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CrsxMetaParser.RBRACE, 0); }
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
		enterRule(_localctx, 16, RULE_moduleDeclaration);
		try {
			setState(494);
			switch (_input.LA(1)) {
			case MODULE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				_hide();
				setState(480);
				match(MODULE);
				setState(481);
				constructor_TOK();
				_hide();
				setState(483);
				match(LBRACE);
				setState(484);
				declarations();
				_hide();
				setState(486);
				match(RBRACE);
				_exitAlt();
				}
				break;
			case MT_moduleDeclaration:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(490);
				match(MT_moduleDeclaration);
				}
				break;
			case ET_moduleDeclaration:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(492);
				match(ET_moduleDeclaration);
				setState(493);
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
		enterRule(_localctx, 18, RULE_moduleDeclaration_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			moduleDeclaration();
			setState(497);
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
		enterRule(_localctx, 20, RULE_constructor_TOK);
		try {
			setState(507);
			switch (_input.LA(1)) {
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				match(CONSTRUCTOR);

				}
				break;
			case MT_constructor_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(503);
				match(MT_constructor_TOK);
				}
				break;
			case ET_constructor_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(505);
				match(ET_constructor_TOK);
				setState(506);
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
		enterRule(_localctx, 22, RULE_constructor_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			constructor_TOK();
			setState(510);
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
		public TerminalNode IMPORT() { return getToken(CrsxMetaParser.IMPORT, 0); }
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public TerminalNode MODULE() { return getToken(CrsxMetaParser.MODULE, 0); }
		public TerminalNode GRAMMAR() { return getToken(CrsxMetaParser.GRAMMAR, 0); }
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
		enterRule(_localctx, 24, RULE_importDeclaration);
		try {
			setState(539);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_hide();
				setState(514);
				match(IMPORT);
				setState(515);
				constructor();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(520);
				match(IMPORT);
				_hide();
				setState(522);
				match(MODULE);
				setState(523);
				constructor();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				_hide();
				setState(528);
				match(IMPORT);
				_hide();
				setState(530);
				match(GRAMMAR);
				setState(531);
				constructor();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_term();
				setState(535);
				match(MT_importDeclaration);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_embed();
				setState(537);
				match(ET_importDeclaration);
				setState(538);
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
		enterRule(_localctx, 26, RULE_importDeclaration_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			importDeclaration();
			setState(542);
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
		public TerminalNode ARROW() { return getToken(CrsxMetaParser.ARROW, 0); }
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
		enterRule(_localctx, 28, RULE_ruleDeclaration);
		try {
			setState(557);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_option_OPT:
			case ET_option_OPT:
			case MT_option:
			case ET_option:
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
				setState(545);
				option_OPT();
				setState(546);
				pattern();
				_hide();
				setState(548);
				match(ARROW);
				setState(549);
				contractum();
				_exitAlt();
				}
				break;
			case MT_ruleDeclaration:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(553);
				match(MT_ruleDeclaration);
				}
				break;
			case ET_ruleDeclaration:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(555);
				match(ET_ruleDeclaration);
				setState(556);
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
		enterRule(_localctx, 30, RULE_ruleDeclaration_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			ruleDeclaration();
			setState(560);
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
		enterRule(_localctx, 32, RULE_option_OPT);
		int _la;
		try {
			setState(584);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(565);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(564);
					option();
					}
					break;
				}
				setState(575);
				_la = _input.LA(1);
				if (_la==MT_option_OPT || _la==ET_option_OPT) {
					{
					_tail();
					setState(573);
					switch (_input.LA(1)) {
					case MT_option_OPT:
						{
						_term();
						setState(569);
						match(MT_option_OPT);
						}
						break;
					case ET_option_OPT:
						{
						_embed();
						setState(571);
						match(ET_option_OPT);
						setState(572);
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
				setState(580);
				match(MT_option_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(582);
				match(ET_option_OPT);
				setState(583);
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
		enterRule(_localctx, 34, RULE_option_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			option_OPT();
			setState(587);
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
		public TerminalNode COLON() { return getToken(CrsxMetaParser.COLON, 0); }
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
		enterRule(_localctx, 36, RULE_option);
		try {
			setState(605);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(590);
				constructor();
				setState(591);
				arguments_OPT();
				_hide();
				setState(593);
				match(COLON);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(597);
				annotations();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(601);
				match(MT_option);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(603);
				match(ET_option);
				setState(604);
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
		enterRule(_localctx, 38, RULE_option_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			option();
			setState(608);
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
		enterRule(_localctx, 40, RULE_arguments_OPT);
		int _la;
		try {
			setState(632);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(613);
				_la = _input.LA(1);
				if (_la==MT_arguments || _la==ET_arguments || _la==LSQUARE) {
					{
					setState(612);
					arguments();
					}
				}

				setState(623);
				_la = _input.LA(1);
				if (_la==MT_arguments_OPT || _la==ET_arguments_OPT) {
					{
					_tail();
					setState(621);
					switch (_input.LA(1)) {
					case MT_arguments_OPT:
						{
						_term();
						setState(617);
						match(MT_arguments_OPT);
						}
						break;
					case ET_arguments_OPT:
						{
						_embed();
						setState(619);
						match(ET_arguments_OPT);
						setState(620);
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
				setState(628);
				match(MT_arguments_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(630);
				match(ET_arguments_OPT);
				setState(631);
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
		enterRule(_localctx, 42, RULE_arguments_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			arguments_OPT();
			setState(635);
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
		enterRule(_localctx, 44, RULE_pattern);
		try {
			setState(648);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_properties_OPT:
			case ET_properties_OPT:
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
				setState(638);
				properties_OPT();
				setState(639);
				constructor();
				setState(640);
				arguments_OPT();
				_exitAlt();
				}
				break;
			case MT_pattern:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(644);
				match(MT_pattern);
				}
				break;
			case ET_pattern:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(646);
				match(ET_pattern);
				setState(647);
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
		enterRule(_localctx, 46, RULE_pattern_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			pattern();
			setState(651);
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
		enterRule(_localctx, 48, RULE_properties_OPT);
		int _la;
		try {
			setState(675);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(656);
				_la = _input.LA(1);
				if (_la==MT_properties || _la==ET_properties || _la==LBRACE) {
					{
					setState(655);
					properties();
					}
				}

				setState(666);
				_la = _input.LA(1);
				if (_la==MT_properties_OPT || _la==ET_properties_OPT) {
					{
					_tail();
					setState(664);
					switch (_input.LA(1)) {
					case MT_properties_OPT:
						{
						_term();
						setState(660);
						match(MT_properties_OPT);
						}
						break;
					case ET_properties_OPT:
						{
						_embed();
						setState(662);
						match(ET_properties_OPT);
						setState(663);
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
				setState(671);
				match(MT_properties_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(673);
				match(ET_properties_OPT);
				setState(674);
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
		enterRule(_localctx, 50, RULE_properties_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			properties_OPT();
			setState(678);
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
		enterRule(_localctx, 52, RULE_contractum);
		try {
			setState(689);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
			case MT_freeTerm:
			case ET_freeTerm:
			case MT_annotations_OPT:
			case ET_annotations_OPT:
			case MT_metavar_TOK:
			case ET_metavar_TOK:
			case MT_list:
			case ET_list:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
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
				setState(681);
				freeTerm();
				_exitAlt();
				}
				break;
			case MT_contractum:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(685);
				match(MT_contractum);
				}
				break;
			case ET_contractum:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(687);
				match(ET_contractum);
				setState(688);
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
		enterRule(_localctx, 54, RULE_contractum_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			contractum();
			setState(692);
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
		enterRule(_localctx, 56, RULE_annotations);
		try {
			setState(703);
			switch (_input.LA(1)) {
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(695);
				annotation_OOM();
				_exitAlt();
				}
				break;
			case MT_annotations:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(699);
				match(MT_annotations);
				}
				break;
			case ET_annotations:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(701);
				match(ET_annotations);
				setState(702);
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
		enterRule(_localctx, 58, RULE_annotations_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			annotations();
			setState(706);
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
		enterRule(_localctx, 60, RULE_annotation_OOM);
		int _la;
		try {
			int _alt;
			setState(733);
			switch (_input.LA(1)) {
			case MT_annotation:
			case ET_annotation:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				_enterOOM();
				setState(711); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(710);
						annotation();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(713); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(723);
				_la = _input.LA(1);
				if (_la==MT_annotation_OOM || _la==ET_annotation_OOM) {
					{
					_tail();
					setState(721);
					switch (_input.LA(1)) {
					case MT_annotation_OOM:
						{
						_term();
						setState(717);
						match(MT_annotation_OOM);
						}
						break;
					case ET_annotation_OOM:
						{
						_embed();
						setState(719);
						match(ET_annotation_OOM);
						setState(720);
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
				setState(729);
				match(MT_annotation_OOM);
				}
				break;
			case ET_annotation_OOM:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(731);
				match(ET_annotation_OOM);
				setState(732);
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
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Annotation_OOMContext annotation_OOM() {
			return getRuleContext(Annotation_OOMContext.class,0);
		}
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
		enterRule(_localctx, 62, RULE_annotation_OOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			switch (_input.LA(1)) {
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
			case AT:
				{
				setState(735);
				annotation_OOM();
				}
				break;
			case EOF:
				{
				_enterZOM();
				_exitZOM();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(740);
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
		public TerminalNode AT() { return getToken(CrsxMetaParser.AT, 0); }
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
		enterRule(_localctx, 64, RULE_annotation);
		try {
			setState(754);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				_hide();
				setState(744);
				match(AT);
				setState(745);
				constructor();
				setState(746);
				arguments_OPT();
				_exitAlt();
				}
				break;
			case MT_annotation:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(750);
				match(MT_annotation);
				}
				break;
			case ET_annotation:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(752);
				match(ET_annotation);
				setState(753);
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
		enterRule(_localctx, 66, RULE_annotation_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			annotation();
			setState(757);
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
		enterRule(_localctx, 68, RULE_term);
		try {
			setState(772);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(760);
				freeTerm();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(764);
				boundTerm();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(768);
				match(MT_term);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(770);
				match(ET_term);
				setState(771);
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
		enterRule(_localctx, 70, RULE_term_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			term();
			setState(775);
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
		enterRule(_localctx, 72, RULE_freeTerm);
		try {
			setState(835);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(778);
				annotations_OPT();
				setState(779);
				properties_OPT();
				setState(780);
				constructor();
				setState(781);
				arguments_OPT();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(785);
				annotations_OPT();
				setState(786);
				properties_OPT();
				setState(787);
				constructor();
				setState(788);
				term();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(792);
				annotations_OPT();
				setState(793);
				properties_OPT();
				setState(794);
				literal();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(798);
				annotations_OPT();
				setState(799);
				list();
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				setState(803);
				annotations_OPT();
				setState(804);
				variable();
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_enterAlt("6");
				setState(808);
				annotations_OPT();
				setState(809);
				properties();
				_exitAlt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				_enterAlt("7");
				setState(813);
				annotations_OPT();
				setState(814);
				properties_OPT();
				setState(815);
				metavar_TOK();
				setState(816);
				freeArguments_OPT();
				_exitAlt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				_enterAlt("8");
				setState(820);
				annotations_OPT();
				setState(821);
				concrete();
				_exitAlt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				_enterAlt("9");
				setState(825);
				annotations_OPT();
				setState(826);
				properties_OPT();
				setState(827);
				expression();
				_exitAlt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				_term();
				setState(831);
				match(MT_freeTerm);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				_embed();
				setState(833);
				match(ET_freeTerm);
				setState(834);
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
		enterRule(_localctx, 74, RULE_freeTerm_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			freeTerm();
			setState(838);
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
		enterRule(_localctx, 76, RULE_annotations_OPT);
		int _la;
		try {
			setState(862);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(843);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(842);
					annotations();
					}
					break;
				}
				setState(853);
				_la = _input.LA(1);
				if (_la==MT_annotations_OPT || _la==ET_annotations_OPT) {
					{
					_tail();
					setState(851);
					switch (_input.LA(1)) {
					case MT_annotations_OPT:
						{
						_term();
						setState(847);
						match(MT_annotations_OPT);
						}
						break;
					case ET_annotations_OPT:
						{
						_embed();
						setState(849);
						match(ET_annotations_OPT);
						setState(850);
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
				setState(858);
				match(MT_annotations_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(860);
				match(ET_annotations_OPT);
				setState(861);
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
		enterRule(_localctx, 78, RULE_annotations_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			annotations_OPT();
			setState(865);
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
		enterRule(_localctx, 80, RULE_metavar_TOK);
		try {
			setState(875);
			switch (_input.LA(1)) {
			case METAVAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				match(METAVAR);

				}
				break;
			case MT_metavar_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(871);
				match(MT_metavar_TOK);
				}
				break;
			case ET_metavar_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(873);
				match(ET_metavar_TOK);
				setState(874);
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
		enterRule(_localctx, 82, RULE_metavar_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			metavar_TOK();
			setState(878);
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
		enterRule(_localctx, 84, RULE_freeArguments_OPT);
		int _la;
		try {
			setState(902);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(883);
				_la = _input.LA(1);
				if (_la==MT_freeArguments || _la==ET_freeArguments || _la==LSQUARE) {
					{
					setState(882);
					freeArguments();
					}
				}

				setState(893);
				_la = _input.LA(1);
				if (_la==MT_freeArguments_OPT || _la==ET_freeArguments_OPT) {
					{
					_tail();
					setState(891);
					switch (_input.LA(1)) {
					case MT_freeArguments_OPT:
						{
						_term();
						setState(887);
						match(MT_freeArguments_OPT);
						}
						break;
					case ET_freeArguments_OPT:
						{
						_embed();
						setState(889);
						match(ET_freeArguments_OPT);
						setState(890);
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
				setState(898);
				match(MT_freeArguments_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(900);
				match(ET_freeArguments_OPT);
				setState(901);
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
		enterRule(_localctx, 86, RULE_freeArguments_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			freeArguments_OPT();
			setState(905);
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
		enterRule(_localctx, 88, RULE_boundTerm);
		try {
			setState(917);
			switch (_input.LA(1)) {
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
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
			case MT_binder:
			case ET_binder:
			case LINEAR:
			case AT:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(908);
				binder();
				setState(909);
				nextBinder();
				_exitAlt();
				}
				break;
			case MT_boundTerm:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(913);
				match(MT_boundTerm);
				}
				break;
			case ET_boundTerm:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(915);
				match(ET_boundTerm);
				setState(916);
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
		enterRule(_localctx, 90, RULE_boundTerm_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			boundTerm();
			setState(920);
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
		public TerminalNode DOT() { return getToken(CrsxMetaParser.DOT, 0); }
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
		enterRule(_localctx, 92, RULE_nextBinder);
		try {
			setState(938);
			switch (_input.LA(1)) {
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
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
			case MT_binder:
			case ET_binder:
			case LINEAR:
			case AT:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(923);
				binder();
				setState(924);
				nextBinder();
				_exitAlt();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(929);
				match(DOT);
				setState(930);
				freeTerm();
				_exitAlt();
				}
				break;
			case MT_nextBinder:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(934);
				match(MT_nextBinder);
				}
				break;
			case ET_nextBinder:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(936);
				match(ET_nextBinder);
				setState(937);
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
		enterRule(_localctx, 94, RULE_nextBinder_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			nextBinder();
			setState(941);
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
		public TerminalNode LSQUARE() { return getToken(CrsxMetaParser.LSQUARE, 0); }
		public Terms_OPTContext terms_OPT() {
			return getRuleContext(Terms_OPTContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(CrsxMetaParser.RSQUARE, 0); }
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
		enterRule(_localctx, 96, RULE_arguments);
		try {
			setState(956);
			switch (_input.LA(1)) {
			case LSQUARE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				_hide();
				setState(945);
				match(LSQUARE);
				setState(946);
				terms_OPT();
				_hide();
				setState(948);
				match(RSQUARE);
				_exitAlt();
				}
				break;
			case MT_arguments:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(952);
				match(MT_arguments);
				}
				break;
			case ET_arguments:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(954);
				match(ET_arguments);
				setState(955);
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
		enterRule(_localctx, 98, RULE_arguments_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			arguments();
			setState(959);
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
		enterRule(_localctx, 100, RULE_terms_OPT);
		int _la;
		try {
			setState(983);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(964);
				_la = _input.LA(1);
				if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (MT_constructor_TOK - 11)) | (1L << (ET_constructor_TOK - 11)) | (1L << (MT_properties_OPT - 11)) | (1L << (ET_properties_OPT - 11)) | (1L << (MT_annotations - 11)) | (1L << (ET_annotations - 11)) | (1L << (MT_annotation_OOM - 11)) | (1L << (ET_annotation_OOM - 11)) | (1L << (MT_annotation - 11)) | (1L << (ET_annotation - 11)) | (1L << (MT_term - 11)) | (1L << (ET_term - 11)) | (1L << (MT_freeTerm - 11)) | (1L << (ET_freeTerm - 11)) | (1L << (MT_annotations_OPT - 11)) | (1L << (ET_annotations_OPT - 11)) | (1L << (MT_metavar_TOK - 11)) | (1L << (ET_metavar_TOK - 11)) | (1L << (MT_boundTerm - 11)) | (1L << (ET_boundTerm - 11)) | (1L << (MT_terms - 11)) | (1L << (ET_terms - 11)) | (1L << (MT_term_ZOM - 11)) | (1L << (ET_term_ZOM - 11)) | (1L << (MT_list - 11)) | (1L << (ET_list - 11)))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (MT_variable - 77)) | (1L << (ET_variable - 77)) | (1L << (MT_linear_OPT - 77)) | (1L << (ET_linear_OPT - 77)) | (1L << (MT_variable_TOK - 77)) | (1L << (ET_variable_TOK - 77)) | (1L << (MT_linear - 77)) | (1L << (ET_linear - 77)) | (1L << (MT_literal - 77)) | (1L << (ET_literal - 77)) | (1L << (MT_string_TOK - 77)) | (1L << (ET_string_TOK - 77)) | (1L << (MT_number_TOK - 77)) | (1L << (ET_number_TOK - 77)) | (1L << (MT_binder - 77)) | (1L << (ET_binder - 77)) | (1L << (MT_concrete - 77)) | (1L << (ET_concrete - 77)) | (1L << (MT_category_TOK - 77)) | (1L << (ET_category_TOK - 77)) | (1L << (MT_dispatch - 77)) | (1L << (ET_dispatch - 77)) | (1L << (MT_properties - 77)) | (1L << (ET_properties - 77)) | (1L << (MT_expression - 77)) | (1L << (ET_expression - 77)))) != 0) || ((((_la - 167)) & ~0x3f) == 0 && ((1L << (_la - 167)) & ((1L << (MT_constructor - 167)) | (1L << (ET_constructor - 167)) | (1L << (MT_qualifier - 167)) | (1L << (ET_qualifier - 167)) | (1L << (MT_reserved - 167)) | (1L << (ET_reserved - 167)) | (1L << (DISPATCH - 167)) | (1L << (COLON - 167)) | (1L << (LPAR - 167)) | (1L << (LBRACE - 167)) | (1L << (LINEAR - 167)) | (1L << (AT - 167)) | (1L << (CATEGORY - 167)) | (1L << (CONSTRUCTOR - 167)) | (1L << (VARIABLE - 167)) | (1L << (METAVAR - 167)) | (1L << (STRING - 167)) | (1L << (NUMBER - 167)))) != 0)) {
					{
					setState(963);
					terms();
					}
				}

				setState(974);
				_la = _input.LA(1);
				if (_la==MT_terms_OPT || _la==ET_terms_OPT) {
					{
					_tail();
					setState(972);
					switch (_input.LA(1)) {
					case MT_terms_OPT:
						{
						_term();
						setState(968);
						match(MT_terms_OPT);
						}
						break;
					case ET_terms_OPT:
						{
						_embed();
						setState(970);
						match(ET_terms_OPT);
						setState(971);
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
				setState(979);
				match(MT_terms_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(981);
				match(ET_terms_OPT);
				setState(982);
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
		enterRule(_localctx, 102, RULE_terms_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			terms_OPT();
			setState(986);
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
		public Term_ZOMContext term_ZOM() {
			return getRuleContext(Term_ZOMContext.class,0);
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
		enterRule(_localctx, 104, RULE_terms);
		try {
			setState(997);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
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
			case MT_term_ZOM:
			case ET_term_ZOM:
			case MT_list:
			case ET_list:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
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
				setState(989);
				term_ZOM();
				_exitAlt();
				}
				break;
			case MT_terms:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(993);
				match(MT_terms);
				}
				break;
			case ET_terms:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(995);
				match(ET_terms);
				setState(996);
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
		enterRule(_localctx, 106, RULE_terms_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			terms();
			setState(1000);
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

	public static class Term_ZOMContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CrsxMetaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CrsxMetaParser.COMMA, i);
		}
		public TerminalNode MT_term_ZOM() { return getToken(CrsxMetaParser.MT_term_ZOM, 0); }
		public TerminalNode ET_term_ZOM() { return getToken(CrsxMetaParser.ET_term_ZOM, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Term_ZOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_ZOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterTerm_ZOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitTerm_ZOM(this);
		}
	}

	public final Term_ZOMContext term_ZOM() throws RecognitionException {
		Term_ZOMContext _localctx = new Term_ZOMContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_term_ZOM);
		int _la;
		try {
			setState(1031);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
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
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
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
				_enterZOM();
				setState(1004);
				term();
				setState(1010);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					_hide();
					setState(1006);
					match(COMMA);
					setState(1007);
					term();
					}
					}
					setState(1012);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1021);
				_la = _input.LA(1);
				if (_la==MT_term_ZOM || _la==ET_term_ZOM) {
					{
					_tail();
					setState(1019);
					switch (_input.LA(1)) {
					case MT_term_ZOM:
						{
						_term();
						setState(1015);
						match(MT_term_ZOM);
						}
						break;
					case ET_term_ZOM:
						{
						_embed();
						setState(1017);
						match(ET_term_ZOM);
						setState(1018);
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
			case MT_term_ZOM:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1027);
				match(MT_term_ZOM);
				}
				break;
			case ET_term_ZOM:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1029);
				match(ET_term_ZOM);
				setState(1030);
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

	public static class Term_ZOM_EOFContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Term_ZOMContext term_ZOM() {
			return getRuleContext(Term_ZOMContext.class,0);
		}
		public Term_ZOM_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_ZOM_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterTerm_ZOM_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitTerm_ZOM_EOF(this);
		}
	}

	public final Term_ZOM_EOFContext term_ZOM_EOF() throws RecognitionException {
		Term_ZOM_EOFContext _localctx = new Term_ZOM_EOFContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_term_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
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
			case MT_term_ZOM:
			case ET_term_ZOM:
			case MT_list:
			case ET_list:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
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
				{
				setState(1033);
				term_ZOM();
				}
				break;
			case EOF:
				{
				_enterZOM();
				_exitZOM();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class FreeArgumentsContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(CrsxMetaParser.LSQUARE, 0); }
		public FreeTerms_OPTContext freeTerms_OPT() {
			return getRuleContext(FreeTerms_OPTContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(CrsxMetaParser.RSQUARE, 0); }
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
		enterRule(_localctx, 112, RULE_freeArguments);
		try {
			setState(1053);
			switch (_input.LA(1)) {
			case LSQUARE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				_hide();
				setState(1042);
				match(LSQUARE);
				setState(1043);
				freeTerms_OPT();
				_hide();
				setState(1045);
				match(RSQUARE);
				_exitAlt();
				}
				break;
			case MT_freeArguments:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1049);
				match(MT_freeArguments);
				}
				break;
			case ET_freeArguments:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1051);
				match(ET_freeArguments);
				setState(1052);
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
		enterRule(_localctx, 114, RULE_freeArguments_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			freeArguments();
			setState(1056);
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
		enterRule(_localctx, 116, RULE_freeTerms_OPT);
		int _la;
		try {
			setState(1080);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1061);
				_la = _input.LA(1);
				if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (MT_constructor_TOK - 11)) | (1L << (ET_constructor_TOK - 11)) | (1L << (MT_properties_OPT - 11)) | (1L << (ET_properties_OPT - 11)) | (1L << (MT_annotations - 11)) | (1L << (ET_annotations - 11)) | (1L << (MT_annotation_OOM - 11)) | (1L << (ET_annotation_OOM - 11)) | (1L << (MT_annotation - 11)) | (1L << (ET_annotation - 11)) | (1L << (MT_freeTerm - 11)) | (1L << (ET_freeTerm - 11)) | (1L << (MT_annotations_OPT - 11)) | (1L << (ET_annotations_OPT - 11)) | (1L << (MT_metavar_TOK - 11)) | (1L << (ET_metavar_TOK - 11)) | (1L << (MT_freeTerms - 11)) | (1L << (ET_freeTerms - 11)) | (1L << (MT_freeTerm_ZOM - 11)) | (1L << (ET_freeTerm_ZOM - 11)) | (1L << (MT_list - 11)) | (1L << (ET_list - 11)))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (MT_variable - 77)) | (1L << (ET_variable - 77)) | (1L << (MT_linear_OPT - 77)) | (1L << (ET_linear_OPT - 77)) | (1L << (MT_variable_TOK - 77)) | (1L << (ET_variable_TOK - 77)) | (1L << (MT_linear - 77)) | (1L << (ET_linear - 77)) | (1L << (MT_literal - 77)) | (1L << (ET_literal - 77)) | (1L << (MT_string_TOK - 77)) | (1L << (ET_string_TOK - 77)) | (1L << (MT_number_TOK - 77)) | (1L << (ET_number_TOK - 77)) | (1L << (MT_concrete - 77)) | (1L << (ET_concrete - 77)) | (1L << (MT_category_TOK - 77)) | (1L << (ET_category_TOK - 77)) | (1L << (MT_dispatch - 77)) | (1L << (ET_dispatch - 77)) | (1L << (MT_properties - 77)) | (1L << (ET_properties - 77)) | (1L << (MT_expression - 77)) | (1L << (ET_expression - 77)))) != 0) || ((((_la - 167)) & ~0x3f) == 0 && ((1L << (_la - 167)) & ((1L << (MT_constructor - 167)) | (1L << (ET_constructor - 167)) | (1L << (MT_qualifier - 167)) | (1L << (ET_qualifier - 167)) | (1L << (MT_reserved - 167)) | (1L << (ET_reserved - 167)) | (1L << (DISPATCH - 167)) | (1L << (COLON - 167)) | (1L << (LPAR - 167)) | (1L << (LBRACE - 167)) | (1L << (LINEAR - 167)) | (1L << (AT - 167)) | (1L << (CATEGORY - 167)) | (1L << (CONSTRUCTOR - 167)) | (1L << (VARIABLE - 167)) | (1L << (METAVAR - 167)) | (1L << (STRING - 167)) | (1L << (NUMBER - 167)))) != 0)) {
					{
					setState(1060);
					freeTerms();
					}
				}

				setState(1071);
				_la = _input.LA(1);
				if (_la==MT_freeTerms_OPT || _la==ET_freeTerms_OPT) {
					{
					_tail();
					setState(1069);
					switch (_input.LA(1)) {
					case MT_freeTerms_OPT:
						{
						_term();
						setState(1065);
						match(MT_freeTerms_OPT);
						}
						break;
					case ET_freeTerms_OPT:
						{
						_embed();
						setState(1067);
						match(ET_freeTerms_OPT);
						setState(1068);
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
				setState(1076);
				match(MT_freeTerms_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1078);
				match(ET_freeTerms_OPT);
				setState(1079);
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
		enterRule(_localctx, 118, RULE_freeTerms_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			freeTerms_OPT();
			setState(1083);
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
		public FreeTerm_ZOMContext freeTerm_ZOM() {
			return getRuleContext(FreeTerm_ZOMContext.class,0);
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
		enterRule(_localctx, 120, RULE_freeTerms);
		try {
			setState(1094);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
			case MT_freeTerm:
			case ET_freeTerm:
			case MT_annotations_OPT:
			case ET_annotations_OPT:
			case MT_metavar_TOK:
			case ET_metavar_TOK:
			case MT_freeTerm_ZOM:
			case ET_freeTerm_ZOM:
			case MT_list:
			case ET_list:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
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
				setState(1086);
				freeTerm_ZOM();
				_exitAlt();
				}
				break;
			case MT_freeTerms:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1090);
				match(MT_freeTerms);
				}
				break;
			case ET_freeTerms:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1092);
				match(ET_freeTerms);
				setState(1093);
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
		enterRule(_localctx, 122, RULE_freeTerms_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1096);
			freeTerms();
			setState(1097);
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

	public static class FreeTerm_ZOMContext extends ParserRuleContext {
		public List<FreeTermContext> freeTerm() {
			return getRuleContexts(FreeTermContext.class);
		}
		public FreeTermContext freeTerm(int i) {
			return getRuleContext(FreeTermContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CrsxMetaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CrsxMetaParser.COMMA, i);
		}
		public TerminalNode MT_freeTerm_ZOM() { return getToken(CrsxMetaParser.MT_freeTerm_ZOM, 0); }
		public TerminalNode ET_freeTerm_ZOM() { return getToken(CrsxMetaParser.ET_freeTerm_ZOM, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public FreeTerm_ZOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freeTerm_ZOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterFreeTerm_ZOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitFreeTerm_ZOM(this);
		}
	}

	public final FreeTerm_ZOMContext freeTerm_ZOM() throws RecognitionException {
		FreeTerm_ZOMContext _localctx = new FreeTerm_ZOMContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_freeTerm_ZOM);
		int _la;
		try {
			setState(1128);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
			case MT_freeTerm:
			case ET_freeTerm:
			case MT_annotations_OPT:
			case ET_annotations_OPT:
			case MT_metavar_TOK:
			case ET_metavar_TOK:
			case MT_list:
			case ET_list:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
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
				_enterZOM();
				setState(1101);
				freeTerm();
				setState(1107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					_hide();
					setState(1103);
					match(COMMA);
					setState(1104);
					freeTerm();
					}
					}
					setState(1109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1118);
				_la = _input.LA(1);
				if (_la==MT_freeTerm_ZOM || _la==ET_freeTerm_ZOM) {
					{
					_tail();
					setState(1116);
					switch (_input.LA(1)) {
					case MT_freeTerm_ZOM:
						{
						_term();
						setState(1112);
						match(MT_freeTerm_ZOM);
						}
						break;
					case ET_freeTerm_ZOM:
						{
						_embed();
						setState(1114);
						match(ET_freeTerm_ZOM);
						setState(1115);
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
			case MT_freeTerm_ZOM:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1124);
				match(MT_freeTerm_ZOM);
				}
				break;
			case ET_freeTerm_ZOM:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1126);
				match(ET_freeTerm_ZOM);
				setState(1127);
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

	public static class FreeTerm_ZOM_EOFContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public FreeTerm_ZOMContext freeTerm_ZOM() {
			return getRuleContext(FreeTerm_ZOMContext.class,0);
		}
		public FreeTerm_ZOM_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freeTerm_ZOM_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterFreeTerm_ZOM_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitFreeTerm_ZOM_EOF(this);
		}
	}

	public final FreeTerm_ZOM_EOFContext freeTerm_ZOM_EOF() throws RecognitionException {
		FreeTerm_ZOM_EOFContext _localctx = new FreeTerm_ZOM_EOFContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_freeTerm_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
			case MT_freeTerm:
			case ET_freeTerm:
			case MT_annotations_OPT:
			case ET_annotations_OPT:
			case MT_metavar_TOK:
			case ET_metavar_TOK:
			case MT_freeTerm_ZOM:
			case ET_freeTerm_ZOM:
			case MT_list:
			case ET_list:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
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
				{
				setState(1130);
				freeTerm_ZOM();
				}
				break;
			case EOF:
				{
				_enterZOM();
				_exitZOM();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1135);
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
		public TerminalNode LPAR() { return getToken(CrsxMetaParser.LPAR, 0); }
		public TermList_OPTContext termList_OPT() {
			return getRuleContext(TermList_OPTContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CrsxMetaParser.RPAR, 0); }
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
		enterRule(_localctx, 128, RULE_list);
		try {
			setState(1150);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				_hide();
				setState(1139);
				match(LPAR);
				setState(1140);
				termList_OPT();
				_hide();
				setState(1142);
				match(RPAR);
				_exitAlt();
				}
				break;
			case MT_list:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1146);
				match(MT_list);
				}
				break;
			case ET_list:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1148);
				match(ET_list);
				setState(1149);
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
		enterRule(_localctx, 130, RULE_list_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			list();
			setState(1153);
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
		enterRule(_localctx, 132, RULE_termList_OPT);
		int _la;
		try {
			setState(1177);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1158);
				_la = _input.LA(1);
				if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (MT_constructor_TOK - 11)) | (1L << (ET_constructor_TOK - 11)) | (1L << (MT_properties_OPT - 11)) | (1L << (ET_properties_OPT - 11)) | (1L << (MT_annotations - 11)) | (1L << (ET_annotations - 11)) | (1L << (MT_annotation_OOM - 11)) | (1L << (ET_annotation_OOM - 11)) | (1L << (MT_annotation - 11)) | (1L << (ET_annotation - 11)) | (1L << (MT_term - 11)) | (1L << (ET_term - 11)) | (1L << (MT_freeTerm - 11)) | (1L << (ET_freeTerm - 11)) | (1L << (MT_annotations_OPT - 11)) | (1L << (ET_annotations_OPT - 11)) | (1L << (MT_metavar_TOK - 11)) | (1L << (ET_metavar_TOK - 11)) | (1L << (MT_boundTerm - 11)) | (1L << (ET_boundTerm - 11)) | (1L << (MT_list - 11)) | (1L << (ET_list - 11)) | (1L << (MT_termList - 11)) | (1L << (ET_termList - 11)) | (1L << (MT_listItem_ZOM - 11)) | (1L << (ET_listItem_ZOM - 11)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (MT_listItem - 75)) | (1L << (ET_listItem - 75)) | (1L << (MT_variable - 75)) | (1L << (ET_variable - 75)) | (1L << (MT_linear_OPT - 75)) | (1L << (ET_linear_OPT - 75)) | (1L << (MT_variable_TOK - 75)) | (1L << (ET_variable_TOK - 75)) | (1L << (MT_linear - 75)) | (1L << (ET_linear - 75)) | (1L << (MT_literal - 75)) | (1L << (ET_literal - 75)) | (1L << (MT_string_TOK - 75)) | (1L << (ET_string_TOK - 75)) | (1L << (MT_number_TOK - 75)) | (1L << (ET_number_TOK - 75)) | (1L << (MT_binder - 75)) | (1L << (ET_binder - 75)) | (1L << (MT_concrete - 75)) | (1L << (ET_concrete - 75)) | (1L << (MT_category_TOK - 75)) | (1L << (ET_category_TOK - 75)) | (1L << (MT_dispatch - 75)) | (1L << (ET_dispatch - 75)) | (1L << (MT_properties - 75)) | (1L << (ET_properties - 75)) | (1L << (MT_expression - 75)) | (1L << (ET_expression - 75)))) != 0) || ((((_la - 167)) & ~0x3f) == 0 && ((1L << (_la - 167)) & ((1L << (MT_constructor - 167)) | (1L << (ET_constructor - 167)) | (1L << (MT_qualifier - 167)) | (1L << (ET_qualifier - 167)) | (1L << (MT_reserved - 167)) | (1L << (ET_reserved - 167)) | (1L << (DISPATCH - 167)) | (1L << (COLON - 167)) | (1L << (LPAR - 167)) | (1L << (LBRACE - 167)) | (1L << (LINEAR - 167)) | (1L << (AT - 167)) | (1L << (CATEGORY - 167)) | (1L << (CONSTRUCTOR - 167)) | (1L << (VARIABLE - 167)) | (1L << (METAVAR - 167)) | (1L << (STRING - 167)) | (1L << (NUMBER - 167)))) != 0)) {
					{
					setState(1157);
					termList();
					}
				}

				setState(1168);
				_la = _input.LA(1);
				if (_la==MT_termList_OPT || _la==ET_termList_OPT) {
					{
					_tail();
					setState(1166);
					switch (_input.LA(1)) {
					case MT_termList_OPT:
						{
						_term();
						setState(1162);
						match(MT_termList_OPT);
						}
						break;
					case ET_termList_OPT:
						{
						_embed();
						setState(1164);
						match(ET_termList_OPT);
						setState(1165);
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
				setState(1173);
				match(MT_termList_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1175);
				match(ET_termList_OPT);
				setState(1176);
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
		enterRule(_localctx, 134, RULE_termList_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			termList_OPT();
			setState(1180);
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
		public ListItem_ZOMContext listItem_ZOM() {
			return getRuleContext(ListItem_ZOMContext.class,0);
		}
		public Semi_TOK_OPTContext semi_TOK_OPT() {
			return getRuleContext(Semi_TOK_OPTContext.class,0);
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
		enterRule(_localctx, 136, RULE_termList);
		try {
			setState(1192);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
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
			case MT_listItem_ZOM:
			case ET_listItem_ZOM:
			case MT_listItem:
			case ET_listItem:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
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
				setState(1183);
				listItem_ZOM();
				setState(1184);
				semi_TOK_OPT();
				_exitAlt();
				}
				break;
			case MT_termList:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1188);
				match(MT_termList);
				}
				break;
			case ET_termList:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1190);
				match(ET_termList);
				setState(1191);
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
		enterRule(_localctx, 138, RULE_termList_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194);
			termList();
			setState(1195);
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

	public static class ListItem_ZOMContext extends ParserRuleContext {
		public List<ListItemContext> listItem() {
			return getRuleContexts(ListItemContext.class);
		}
		public ListItemContext listItem(int i) {
			return getRuleContext(ListItemContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CrsxMetaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CrsxMetaParser.SEMI, i);
		}
		public TerminalNode MT_listItem_ZOM() { return getToken(CrsxMetaParser.MT_listItem_ZOM, 0); }
		public TerminalNode ET_listItem_ZOM() { return getToken(CrsxMetaParser.ET_listItem_ZOM, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public ListItem_ZOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItem_ZOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterListItem_ZOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitListItem_ZOM(this);
		}
	}

	public final ListItem_ZOMContext listItem_ZOM() throws RecognitionException {
		ListItem_ZOMContext _localctx = new ListItem_ZOMContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_listItem_ZOM);
		int _la;
		try {
			int _alt;
			setState(1226);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
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
			case MT_listItem:
			case ET_listItem:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
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
				_enterZOM();
				setState(1199);
				listItem();
				setState(1205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						_hide();
						setState(1201);
						match(SEMI);
						setState(1202);
						listItem();
						}
						} 
					}
					setState(1207);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				}
				setState(1216);
				_la = _input.LA(1);
				if (_la==MT_listItem_ZOM || _la==ET_listItem_ZOM) {
					{
					_tail();
					setState(1214);
					switch (_input.LA(1)) {
					case MT_listItem_ZOM:
						{
						_term();
						setState(1210);
						match(MT_listItem_ZOM);
						}
						break;
					case ET_listItem_ZOM:
						{
						_embed();
						setState(1212);
						match(ET_listItem_ZOM);
						setState(1213);
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
			case MT_listItem_ZOM:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1222);
				match(MT_listItem_ZOM);
				}
				break;
			case ET_listItem_ZOM:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1224);
				match(ET_listItem_ZOM);
				setState(1225);
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

	public static class ListItem_ZOM_EOFContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public ListItem_ZOMContext listItem_ZOM() {
			return getRuleContext(ListItem_ZOMContext.class,0);
		}
		public ListItem_ZOM_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItem_ZOM_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterListItem_ZOM_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitListItem_ZOM_EOF(this);
		}
	}

	public final ListItem_ZOM_EOFContext listItem_ZOM_EOF() throws RecognitionException {
		ListItem_ZOM_EOFContext _localctx = new ListItem_ZOM_EOFContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_listItem_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
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
			case MT_listItem_ZOM:
			case ET_listItem_ZOM:
			case MT_listItem:
			case ET_listItem:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
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
				{
				setState(1228);
				listItem_ZOM();
				}
				break;
			case EOF:
				{
				_enterZOM();
				_exitZOM();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1233);
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

	public static class Semi_TOK_OPTContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(CrsxMetaParser.SEMI, 0); }
		public TerminalNode MT_semi_TOK_OPT() { return getToken(CrsxMetaParser.MT_semi_TOK_OPT, 0); }
		public TerminalNode ET_semi_TOK_OPT() { return getToken(CrsxMetaParser.ET_semi_TOK_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Semi_TOK_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semi_TOK_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSemi_TOK_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSemi_TOK_OPT(this);
		}
	}

	public final Semi_TOK_OPTContext semi_TOK_OPT() throws RecognitionException {
		Semi_TOK_OPTContext _localctx = new Semi_TOK_OPTContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_semi_TOK_OPT);
		int _la;
		try {
			setState(1257);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1238);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(1237);
					match(SEMI);
					}
				}

				setState(1248);
				_la = _input.LA(1);
				if (_la==MT_semi_TOK_OPT || _la==ET_semi_TOK_OPT) {
					{
					_tail();
					setState(1246);
					switch (_input.LA(1)) {
					case MT_semi_TOK_OPT:
						{
						_term();
						setState(1242);
						match(MT_semi_TOK_OPT);
						}
						break;
					case ET_semi_TOK_OPT:
						{
						_embed();
						setState(1244);
						match(ET_semi_TOK_OPT);
						setState(1245);
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
				setState(1253);
				match(MT_semi_TOK_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1255);
				match(ET_semi_TOK_OPT);
				setState(1256);
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

	public static class Semi_TOK_OPT_EOFContext extends ParserRuleContext {
		public Semi_TOK_OPTContext semi_TOK_OPT() {
			return getRuleContext(Semi_TOK_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Semi_TOK_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semi_TOK_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSemi_TOK_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSemi_TOK_OPT_EOF(this);
		}
	}

	public final Semi_TOK_OPT_EOFContext semi_TOK_OPT_EOF() throws RecognitionException {
		Semi_TOK_OPT_EOFContext _localctx = new Semi_TOK_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_semi_TOK_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			semi_TOK_OPT();
			setState(1260);
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

	public static class ListItemContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MT_listItem() { return getToken(CrsxMetaParser.MT_listItem, 0); }
		public TerminalNode ET_listItem() { return getToken(CrsxMetaParser.ET_listItem, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public ListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitListItem(this);
		}
	}

	public final ListItemContext listItem() throws RecognitionException {
		ListItemContext _localctx = new ListItemContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_listItem);
		try {
			setState(1271);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
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
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
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
				setState(1263);
				term();
				_exitAlt();
				}
				break;
			case MT_listItem:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1267);
				match(MT_listItem);
				}
				break;
			case ET_listItem:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1269);
				match(ET_listItem);
				setState(1270);
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

	public static class ListItem_EOFContext extends ParserRuleContext {
		public ListItemContext listItem() {
			return getRuleContext(ListItemContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public ListItem_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItem_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterListItem_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitListItem_EOF(this);
		}
	}

	public final ListItem_EOFContext listItem_EOF() throws RecognitionException {
		ListItem_EOFContext _localctx = new ListItem_EOFContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_listItem_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			listItem();
			setState(1274);
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
		enterRule(_localctx, 152, RULE_variable);
		try {
			setState(1289);
			switch (_input.LA(1)) {
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
			case LINEAR:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1277);
				linear_OPT();
				setState(1278);
				variable_TOK();
				setState(1279);
				linear_OPT();
				setState(1280);
				functional_OPT();
				setState(1281);
				varsort_OPT();
				_exitAlt();
				}
				break;
			case MT_variable:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1285);
				match(MT_variable);
				}
				break;
			case ET_variable:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1287);
				match(ET_variable);
				setState(1288);
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
		enterRule(_localctx, 154, RULE_variable_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
			variable();
			setState(1292);
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
		enterRule(_localctx, 156, RULE_linear_OPT);
		try {
			setState(1316);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1297);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(1296);
					linear();
					}
					break;
				}
				setState(1307);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					_tail();
					setState(1305);
					switch (_input.LA(1)) {
					case MT_linear_OPT:
						{
						_term();
						setState(1301);
						match(MT_linear_OPT);
						}
						break;
					case ET_linear_OPT:
						{
						_embed();
						setState(1303);
						match(ET_linear_OPT);
						setState(1304);
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
				setState(1312);
				match(MT_linear_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1314);
				match(ET_linear_OPT);
				setState(1315);
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
		enterRule(_localctx, 158, RULE_linear_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
			linear_OPT();
			setState(1319);
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
		enterRule(_localctx, 160, RULE_variable_TOK);
		try {
			setState(1329);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1322);
				match(VARIABLE);

				}
				break;
			case MT_variable_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1325);
				match(MT_variable_TOK);
				}
				break;
			case ET_variable_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1327);
				match(ET_variable_TOK);
				setState(1328);
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
		enterRule(_localctx, 162, RULE_variable_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1331);
			variable_TOK();
			setState(1332);
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
		enterRule(_localctx, 164, RULE_functional_OPT);
		int _la;
		try {
			setState(1356);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1337);
				_la = _input.LA(1);
				if (_la==MT_functional || _la==ET_functional || _la==FUNCTIONAL) {
					{
					setState(1336);
					functional();
					}
				}

				setState(1347);
				_la = _input.LA(1);
				if (_la==MT_functional_OPT || _la==ET_functional_OPT) {
					{
					_tail();
					setState(1345);
					switch (_input.LA(1)) {
					case MT_functional_OPT:
						{
						_term();
						setState(1341);
						match(MT_functional_OPT);
						}
						break;
					case ET_functional_OPT:
						{
						_embed();
						setState(1343);
						match(ET_functional_OPT);
						setState(1344);
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
				setState(1352);
				match(MT_functional_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1354);
				match(ET_functional_OPT);
				setState(1355);
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
		enterRule(_localctx, 166, RULE_functional_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1358);
			functional_OPT();
			setState(1359);
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
		enterRule(_localctx, 168, RULE_varsort_OPT);
		try {
			setState(1383);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1364);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(1363);
					varsort();
					}
					break;
				}
				setState(1374);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					_tail();
					setState(1372);
					switch (_input.LA(1)) {
					case MT_varsort_OPT:
						{
						_term();
						setState(1368);
						match(MT_varsort_OPT);
						}
						break;
					case ET_varsort_OPT:
						{
						_embed();
						setState(1370);
						match(ET_varsort_OPT);
						setState(1371);
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
				setState(1379);
				match(MT_varsort_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1381);
				match(ET_varsort_OPT);
				setState(1382);
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
		enterRule(_localctx, 170, RULE_varsort_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1385);
			varsort_OPT();
			setState(1386);
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
		public TerminalNode LINEAR() { return getToken(CrsxMetaParser.LINEAR, 0); }
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
		enterRule(_localctx, 172, RULE_linear);
		try {
			setState(1397);
			switch (_input.LA(1)) {
			case LINEAR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				_hide();
				setState(1390);
				match(LINEAR);
				_exitAlt();
				}
				break;
			case MT_linear:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1393);
				match(MT_linear);
				}
				break;
			case ET_linear:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1395);
				match(ET_linear);
				setState(1396);
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
		enterRule(_localctx, 174, RULE_linear_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
			linear();
			setState(1400);
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
		public TerminalNode FUNCTIONAL() { return getToken(CrsxMetaParser.FUNCTIONAL, 0); }
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
		enterRule(_localctx, 176, RULE_functional);
		try {
			setState(1411);
			switch (_input.LA(1)) {
			case FUNCTIONAL:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				_hide();
				setState(1404);
				match(FUNCTIONAL);
				_exitAlt();
				}
				break;
			case MT_functional:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1407);
				match(MT_functional);
				}
				break;
			case ET_functional:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1409);
				match(ET_functional);
				setState(1410);
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
		enterRule(_localctx, 178, RULE_functional_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			functional();
			setState(1414);
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
		enterRule(_localctx, 180, RULE_literal);
		try {
			setState(1429);
			switch (_input.LA(1)) {
			case MT_string_TOK:
			case ET_string_TOK:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(1417);
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
				setState(1421);
				number_TOK();
				_exitAlt();
				}
				break;
			case MT_literal:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(1425);
				match(MT_literal);
				}
				break;
			case ET_literal:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(1427);
				match(ET_literal);
				setState(1428);
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
		enterRule(_localctx, 182, RULE_literal_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
			literal();
			setState(1432);
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
		enterRule(_localctx, 184, RULE_string_TOK);
		try {
			setState(1442);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1435);
				match(STRING);

				}
				break;
			case MT_string_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1438);
				match(MT_string_TOK);
				}
				break;
			case ET_string_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1440);
				match(ET_string_TOK);
				setState(1441);
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
		enterRule(_localctx, 186, RULE_string_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
			string_TOK();
			setState(1445);
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
		enterRule(_localctx, 188, RULE_number_TOK);
		try {
			setState(1455);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1448);
				match(NUMBER);

				}
				break;
			case MT_number_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1451);
				match(MT_number_TOK);
				}
				break;
			case ET_number_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1453);
				match(ET_number_TOK);
				setState(1454);
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
		enterRule(_localctx, 190, RULE_number_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1457);
			number_TOK();
			setState(1458);
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
		enterRule(_localctx, 192, RULE_binder);
		try {
			setState(1470);
			switch (_input.LA(1)) {
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
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
			case LINEAR:
			case AT:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1461);
				annotations_OPT();
				setState(1462);
				variable();
				_exitAlt();
				}
				break;
			case MT_binder:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1466);
				match(MT_binder);
				}
				break;
			case ET_binder:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1468);
				match(ET_binder);
				setState(1469);
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
		enterRule(_localctx, 194, RULE_binder_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			binder();
			setState(1473);
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
		public TerminalNode COLONCOLON() { return getToken(CrsxMetaParser.COLONCOLON, 0); }
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
		enterRule(_localctx, 196, RULE_varsort);
		try {
			setState(1486);
			switch (_input.LA(1)) {
			case COLONCOLON:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				_hide();
				setState(1477);
				match(COLONCOLON);
				setState(1478);
				sortname();
				_exitAlt();
				}
				break;
			case MT_varsort:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1482);
				match(MT_varsort);
				}
				break;
			case ET_varsort:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1484);
				match(ET_varsort);
				setState(1485);
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
		enterRule(_localctx, 198, RULE_varsort_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1488);
			varsort();
			setState(1489);
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
		enterRule(_localctx, 200, RULE_concrete);
		try {
			setState(1516);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(1492);
				category_TOK();
				setState(1493);
				concrete_TOK();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(1497);
				category_TOK();
				setState(1498);
				concrete2_TOK();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(1502);
				category_TOK();
				setState(1503);
				concrete3_TOK();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(1507);
				category_TOK();
				setState(1508);
				concrete4_TOK();
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_term();
				setState(1512);
				match(MT_concrete);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_embed();
				setState(1514);
				match(ET_concrete);
				setState(1515);
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
		enterRule(_localctx, 202, RULE_concrete_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1518);
			concrete();
			setState(1519);
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
		enterRule(_localctx, 204, RULE_category_TOK);
		try {
			setState(1529);
			switch (_input.LA(1)) {
			case CATEGORY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1522);
				match(CATEGORY);

				}
				break;
			case MT_category_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1525);
				match(MT_category_TOK);
				}
				break;
			case ET_category_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1527);
				match(ET_category_TOK);
				setState(1528);
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
		enterRule(_localctx, 206, RULE_category_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1531);
			category_TOK();
			setState(1532);
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
		enterRule(_localctx, 208, RULE_concrete_TOK);
		try {
			setState(1542);
			switch (_input.LA(1)) {
			case CONCRETE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1535);
				match(CONCRETE);

				}
				break;
			case MT_concrete_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1538);
				match(MT_concrete_TOK);
				}
				break;
			case ET_concrete_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1540);
				match(ET_concrete_TOK);
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
		enterRule(_localctx, 210, RULE_concrete_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1544);
			concrete_TOK();
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
		enterRule(_localctx, 212, RULE_concrete2_TOK);
		try {
			setState(1555);
			switch (_input.LA(1)) {
			case CONCRETE2:
				enterOuterAlt(_localctx, 1);
				{
				setState(1548);
				match(CONCRETE2);

				}
				break;
			case MT_concrete2_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1551);
				match(MT_concrete2_TOK);
				}
				break;
			case ET_concrete2_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1553);
				match(ET_concrete2_TOK);
				setState(1554);
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
		enterRule(_localctx, 214, RULE_concrete2_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1557);
			concrete2_TOK();
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
		enterRule(_localctx, 216, RULE_concrete3_TOK);
		try {
			setState(1568);
			switch (_input.LA(1)) {
			case CONCRETE3:
				enterOuterAlt(_localctx, 1);
				{
				setState(1561);
				match(CONCRETE3);

				}
				break;
			case MT_concrete3_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1564);
				match(MT_concrete3_TOK);
				}
				break;
			case ET_concrete3_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1566);
				match(ET_concrete3_TOK);
				setState(1567);
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
		enterRule(_localctx, 218, RULE_concrete3_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1570);
			concrete3_TOK();
			setState(1571);
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
		enterRule(_localctx, 220, RULE_concrete4_TOK);
		try {
			setState(1581);
			switch (_input.LA(1)) {
			case CONCRETE4:
				enterOuterAlt(_localctx, 1);
				{
				setState(1574);
				match(CONCRETE4);

				}
				break;
			case MT_concrete4_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1577);
				match(MT_concrete4_TOK);
				}
				break;
			case ET_concrete4_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1579);
				match(ET_concrete4_TOK);
				setState(1580);
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
		enterRule(_localctx, 222, RULE_concrete4_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1583);
			concrete4_TOK();
			setState(1584);
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
		public TerminalNode DISPATCH() { return getToken(CrsxMetaParser.DISPATCH, 0); }
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
		enterRule(_localctx, 224, RULE_dispatch);
		try {
			setState(1599);
			switch (_input.LA(1)) {
			case DISPATCH:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				_hide();
				setState(1588);
				match(DISPATCH);
				setState(1589);
				dispatchTerm();
				setState(1590);
				dispatchCases();
				setState(1591);
				delayCase_OPT();
				_exitAlt();
				}
				break;
			case MT_dispatch:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1595);
				match(MT_dispatch);
				}
				break;
			case ET_dispatch:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1597);
				match(ET_dispatch);
				setState(1598);
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
		enterRule(_localctx, 226, RULE_dispatch_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1601);
			dispatch();
			setState(1602);
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
		enterRule(_localctx, 228, RULE_delayCase_OPT);
		try {
			setState(1626);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1607);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1606);
					delayCase();
					}
					break;
				}
				setState(1617);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					_tail();
					setState(1615);
					switch (_input.LA(1)) {
					case MT_delayCase_OPT:
						{
						_term();
						setState(1611);
						match(MT_delayCase_OPT);
						}
						break;
					case ET_delayCase_OPT:
						{
						_embed();
						setState(1613);
						match(ET_delayCase_OPT);
						setState(1614);
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
				setState(1622);
				match(MT_delayCase_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1624);
				match(ET_delayCase_OPT);
				setState(1625);
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
		enterRule(_localctx, 230, RULE_delayCase_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
			delayCase_OPT();
			setState(1629);
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
		enterRule(_localctx, 232, RULE_dispatchTerm);
		try {
			setState(1640);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_annotations:
			case ET_annotations:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_annotation:
			case ET_annotation:
			case MT_freeTerm:
			case ET_freeTerm:
			case MT_annotations_OPT:
			case ET_annotations_OPT:
			case MT_metavar_TOK:
			case ET_metavar_TOK:
			case MT_list:
			case ET_list:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
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
				setState(1632);
				freeTerm();
				_exitAlt();
				}
				break;
			case MT_dispatchTerm:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1636);
				match(MT_dispatchTerm);
				}
				break;
			case ET_dispatchTerm:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1638);
				match(ET_dispatchTerm);
				setState(1639);
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
		enterRule(_localctx, 234, RULE_dispatchTerm_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1642);
			dispatchTerm();
			setState(1643);
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
		public DispatchCase_ZOMContext dispatchCase_ZOM() {
			return getRuleContext(DispatchCase_ZOMContext.class,0);
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
		enterRule(_localctx, 236, RULE_dispatchCases);
		try {
			setState(1654);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_ruleDeclaration:
			case ET_ruleDeclaration:
			case MT_option_OPT:
			case ET_option_OPT:
			case MT_option:
			case ET_option:
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
			case MT_dispatchCase_ZOM:
			case ET_dispatchCase_ZOM:
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
				setState(1646);
				dispatchCase_ZOM();
				_exitAlt();
				}
				break;
			case MT_dispatchCases:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1650);
				match(MT_dispatchCases);
				}
				break;
			case ET_dispatchCases:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1652);
				match(ET_dispatchCases);
				setState(1653);
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
		enterRule(_localctx, 238, RULE_dispatchCases_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			dispatchCases();
			setState(1657);
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

	public static class DispatchCase_ZOMContext extends ParserRuleContext {
		public List<DispatchCaseContext> dispatchCase() {
			return getRuleContexts(DispatchCaseContext.class);
		}
		public DispatchCaseContext dispatchCase(int i) {
			return getRuleContext(DispatchCaseContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CrsxMetaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CrsxMetaParser.SEMI, i);
		}
		public TerminalNode MT_dispatchCase_ZOM() { return getToken(CrsxMetaParser.MT_dispatchCase_ZOM, 0); }
		public TerminalNode ET_dispatchCase_ZOM() { return getToken(CrsxMetaParser.ET_dispatchCase_ZOM, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public DispatchCase_ZOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatchCase_ZOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDispatchCase_ZOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDispatchCase_ZOM(this);
		}
	}

	public final DispatchCase_ZOMContext dispatchCase_ZOM() throws RecognitionException {
		DispatchCase_ZOMContext _localctx = new DispatchCase_ZOMContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_dispatchCase_ZOM);
		try {
			int _alt;
			setState(1688);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_ruleDeclaration:
			case ET_ruleDeclaration:
			case MT_option_OPT:
			case ET_option_OPT:
			case MT_option:
			case ET_option:
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
				_enterZOM();
				setState(1661);
				dispatchCase();
				setState(1667);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						_hide();
						setState(1663);
						match(SEMI);
						setState(1664);
						dispatchCase();
						}
						} 
					}
					setState(1669);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
				setState(1678);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					_tail();
					setState(1676);
					switch (_input.LA(1)) {
					case MT_dispatchCase_ZOM:
						{
						_term();
						setState(1672);
						match(MT_dispatchCase_ZOM);
						}
						break;
					case ET_dispatchCase_ZOM:
						{
						_embed();
						setState(1674);
						match(ET_dispatchCase_ZOM);
						setState(1675);
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
			case MT_dispatchCase_ZOM:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1684);
				match(MT_dispatchCase_ZOM);
				}
				break;
			case ET_dispatchCase_ZOM:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1686);
				match(ET_dispatchCase_ZOM);
				setState(1687);
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

	public static class DispatchCase_ZOM_EOFContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public DispatchCase_ZOMContext dispatchCase_ZOM() {
			return getRuleContext(DispatchCase_ZOMContext.class,0);
		}
		public DispatchCase_ZOM_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatchCase_ZOM_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDispatchCase_ZOM_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDispatchCase_ZOM_EOF(this);
		}
	}

	public final DispatchCase_ZOM_EOFContext dispatchCase_ZOM_EOF() throws RecognitionException {
		DispatchCase_ZOM_EOFContext _localctx = new DispatchCase_ZOM_EOFContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_dispatchCase_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1693);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_ruleDeclaration:
			case ET_ruleDeclaration:
			case MT_option_OPT:
			case ET_option_OPT:
			case MT_option:
			case ET_option:
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
			case MT_dispatchCase_ZOM:
			case ET_dispatchCase_ZOM:
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
				{
				setState(1690);
				dispatchCase_ZOM();
				}
				break;
			case EOF:
				{
				_enterZOM();
				_exitZOM();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1695);
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
		enterRule(_localctx, 244, RULE_dispatchCase);
		try {
			setState(1706);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_ruleDeclaration:
			case ET_ruleDeclaration:
			case MT_option_OPT:
			case ET_option_OPT:
			case MT_option:
			case ET_option:
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
				setState(1698);
				ruleDeclaration();
				_exitAlt();
				}
				break;
			case MT_dispatchCase:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1702);
				match(MT_dispatchCase);
				}
				break;
			case ET_dispatchCase:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1704);
				match(ET_dispatchCase);
				setState(1705);
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
		enterRule(_localctx, 246, RULE_dispatchCase_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1708);
			dispatchCase();
			setState(1709);
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
		public TerminalNode DELAY() { return getToken(CrsxMetaParser.DELAY, 0); }
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
		enterRule(_localctx, 248, RULE_delayCase);
		try {
			setState(1720);
			switch (_input.LA(1)) {
			case DELAY:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				_hide();
				setState(1713);
				match(DELAY);
				_exitAlt();
				}
				break;
			case MT_delayCase:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1716);
				match(MT_delayCase);
				}
				break;
			case ET_delayCase:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1718);
				match(ET_delayCase);
				setState(1719);
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
		enterRule(_localctx, 250, RULE_delayCase_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
			delayCase();
			setState(1723);
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
		public TerminalNode LBRACE() { return getToken(CrsxMetaParser.LBRACE, 0); }
		public PropertyList_OPTContext propertyList_OPT() {
			return getRuleContext(PropertyList_OPTContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CrsxMetaParser.RBRACE, 0); }
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
		enterRule(_localctx, 252, RULE_properties);
		try {
			setState(1738);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				_hide();
				setState(1727);
				match(LBRACE);
				setState(1728);
				propertyList_OPT();
				_hide();
				setState(1730);
				match(RBRACE);
				_exitAlt();
				}
				break;
			case MT_properties:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1734);
				match(MT_properties);
				}
				break;
			case ET_properties:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1736);
				match(ET_properties);
				setState(1737);
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
		enterRule(_localctx, 254, RULE_properties_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1740);
			properties();
			setState(1741);
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
		enterRule(_localctx, 256, RULE_propertyList_OPT);
		int _la;
		try {
			setState(1765);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1746);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_constructor_TOK) | (1L << ET_constructor_TOK) | (1L << MT_metavar_TOK) | (1L << ET_metavar_TOK))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (MT_variable_TOK - 81)) | (1L << (ET_variable_TOK - 81)) | (1L << (MT_string_TOK - 81)) | (1L << (ET_string_TOK - 81)) | (1L << (MT_propertyList - 81)) | (1L << (ET_propertyList - 81)) | (1L << (MT_property_ZOM - 81)) | (1L << (ET_property_ZOM - 81)) | (1L << (MT_property - 81)) | (1L << (ET_property - 81)))) != 0) || ((((_la - 167)) & ~0x3f) == 0 && ((1L << (_la - 167)) & ((1L << (MT_constructor - 167)) | (1L << (ET_constructor - 167)) | (1L << (MT_qualifier - 167)) | (1L << (ET_qualifier - 167)) | (1L << (MT_reserved - 167)) | (1L << (ET_reserved - 167)) | (1L << (COLON - 167)) | (1L << (NOT - 167)) | (1L << (AT - 167)) | (1L << (CONSTRUCTOR - 167)) | (1L << (VARIABLE - 167)) | (1L << (METAVAR - 167)) | (1L << (STRING - 167)))) != 0)) {
					{
					setState(1745);
					propertyList();
					}
				}

				setState(1756);
				_la = _input.LA(1);
				if (_la==MT_propertyList_OPT || _la==ET_propertyList_OPT) {
					{
					_tail();
					setState(1754);
					switch (_input.LA(1)) {
					case MT_propertyList_OPT:
						{
						_term();
						setState(1750);
						match(MT_propertyList_OPT);
						}
						break;
					case ET_propertyList_OPT:
						{
						_embed();
						setState(1752);
						match(ET_propertyList_OPT);
						setState(1753);
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
				setState(1761);
				match(MT_propertyList_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1763);
				match(ET_propertyList_OPT);
				setState(1764);
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
		enterRule(_localctx, 258, RULE_propertyList_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1767);
			propertyList_OPT();
			setState(1768);
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
		public Property_ZOMContext property_ZOM() {
			return getRuleContext(Property_ZOMContext.class,0);
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
		enterRule(_localctx, 260, RULE_propertyList);
		try {
			setState(1779);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_metavar_TOK:
			case ET_metavar_TOK:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_string_TOK:
			case ET_string_TOK:
			case MT_property_ZOM:
			case ET_property_ZOM:
			case MT_property:
			case ET_property:
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
				setState(1771);
				property_ZOM();
				_exitAlt();
				}
				break;
			case MT_propertyList:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1775);
				match(MT_propertyList);
				}
				break;
			case ET_propertyList:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1777);
				match(ET_propertyList);
				setState(1778);
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
		enterRule(_localctx, 262, RULE_propertyList_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1781);
			propertyList();
			setState(1782);
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

	public static class Property_ZOMContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CrsxMetaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CrsxMetaParser.SEMI, i);
		}
		public TerminalNode MT_property_ZOM() { return getToken(CrsxMetaParser.MT_property_ZOM, 0); }
		public TerminalNode ET_property_ZOM() { return getToken(CrsxMetaParser.ET_property_ZOM, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Property_ZOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_ZOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterProperty_ZOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitProperty_ZOM(this);
		}
	}

	public final Property_ZOMContext property_ZOM() throws RecognitionException {
		Property_ZOMContext _localctx = new Property_ZOMContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_property_ZOM);
		int _la;
		try {
			setState(1815);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_metavar_TOK:
			case ET_metavar_TOK:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_string_TOK:
			case ET_string_TOK:
			case MT_property:
			case ET_property:
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
				_enterZOM();
				setState(1786);
				property();
				setState(1794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					_hide();
					setState(1788);
					match(SEMI);
					setState(1790);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_constructor_TOK) | (1L << ET_constructor_TOK) | (1L << MT_metavar_TOK) | (1L << ET_metavar_TOK))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (MT_variable_TOK - 81)) | (1L << (ET_variable_TOK - 81)) | (1L << (MT_string_TOK - 81)) | (1L << (ET_string_TOK - 81)) | (1L << (MT_property - 81)) | (1L << (ET_property - 81)))) != 0) || ((((_la - 167)) & ~0x3f) == 0 && ((1L << (_la - 167)) & ((1L << (MT_constructor - 167)) | (1L << (ET_constructor - 167)) | (1L << (MT_qualifier - 167)) | (1L << (ET_qualifier - 167)) | (1L << (MT_reserved - 167)) | (1L << (ET_reserved - 167)) | (1L << (COLON - 167)) | (1L << (NOT - 167)) | (1L << (AT - 167)) | (1L << (CONSTRUCTOR - 167)) | (1L << (VARIABLE - 167)) | (1L << (METAVAR - 167)) | (1L << (STRING - 167)))) != 0)) {
						{
						setState(1789);
						property();
						}
					}

					}
					}
					setState(1796);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1805);
				_la = _input.LA(1);
				if (_la==MT_property_ZOM || _la==ET_property_ZOM) {
					{
					_tail();
					setState(1803);
					switch (_input.LA(1)) {
					case MT_property_ZOM:
						{
						_term();
						setState(1799);
						match(MT_property_ZOM);
						}
						break;
					case ET_property_ZOM:
						{
						_embed();
						setState(1801);
						match(ET_property_ZOM);
						setState(1802);
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
			case MT_property_ZOM:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1811);
				match(MT_property_ZOM);
				}
				break;
			case ET_property_ZOM:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1813);
				match(ET_property_ZOM);
				setState(1814);
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

	public static class Property_ZOM_EOFContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Property_ZOMContext property_ZOM() {
			return getRuleContext(Property_ZOMContext.class,0);
		}
		public Property_ZOM_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_ZOM_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterProperty_ZOM_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitProperty_ZOM_EOF(this);
		}
	}

	public final Property_ZOM_EOFContext property_ZOM_EOF() throws RecognitionException {
		Property_ZOM_EOFContext _localctx = new Property_ZOM_EOFContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_property_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_metavar_TOK:
			case ET_metavar_TOK:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_string_TOK:
			case ET_string_TOK:
			case MT_property_ZOM:
			case ET_property_ZOM:
			case MT_property:
			case ET_property:
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
				{
				setState(1817);
				property_ZOM();
				}
				break;
			case EOF:
				{
				_enterZOM();
				_exitZOM();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1822);
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
		public TerminalNode NOT() { return getToken(CrsxMetaParser.NOT, 0); }
		public TerminalNode COLON() { return getToken(CrsxMetaParser.COLON, 0); }
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
		enterRule(_localctx, 268, RULE_property);
		try {
			setState(1887);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(1825);
				metavar_TOK();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(1830);
				match(NOT);
				setState(1831);
				metavar_TOK();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(1835);
				metavar_TOK();
				_hide();
				setState(1837);
				match(COLON);
				setState(1838);
				freeTerm();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(1842);
				variable_TOK();
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				_hide();
				setState(1847);
				match(NOT);
				setState(1848);
				variable_TOK();
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_enterAlt("6");
				setState(1852);
				variable_TOK();
				_hide();
				setState(1854);
				match(COLON);
				setState(1855);
				freeTerm();
				_exitAlt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				_enterAlt("7");
				setState(1859);
				string_TOK();
				_exitAlt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				_enterAlt("8");
				_hide();
				setState(1864);
				match(NOT);
				setState(1865);
				string_TOK();
				_exitAlt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				_enterAlt("9");
				setState(1869);
				string_TOK();
				_hide();
				setState(1871);
				match(COLON);
				setState(1872);
				freeTerm();
				_exitAlt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				_enterAlt("10");
				setState(1876);
				constructor();
				_hide();
				setState(1878);
				match(COLON);
				setState(1879);
				freeTerm();
				_exitAlt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				_term();
				setState(1883);
				match(MT_property);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				_embed();
				setState(1885);
				match(ET_property);
				setState(1886);
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
		enterRule(_localctx, 270, RULE_property_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1889);
			property();
			setState(1890);
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
		enterRule(_localctx, 272, RULE_expression);
		try {
			setState(1901);
			switch (_input.LA(1)) {
			case MT_dispatch:
			case ET_dispatch:
			case DISPATCH:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1893);
				dispatch();
				_exitAlt();
				}
				break;
			case MT_expression:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1897);
				match(MT_expression);
				}
				break;
			case ET_expression:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1899);
				match(ET_expression);
				setState(1900);
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
		enterRule(_localctx, 274, RULE_expression_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1903);
			expression();
			setState(1904);
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
		public TerminalNode DATASORT() { return getToken(CrsxMetaParser.DATASORT, 0); }
		public TerminalNode LPAR() { return getToken(CrsxMetaParser.LPAR, 0); }
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CrsxMetaParser.RPAR, 0); }
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(CrsxMetaParser.COLONCOLON, 0); }
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
		enterRule(_localctx, 276, RULE_sortDeclaration);
		try {
			setState(1933);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(1907);
				sortparams_OPT();
				setState(1908);
				sortset();
				setState(1909);
				sortname();
				_hide();
				setState(1911);
				match(DATASORT);
				_hide();
				setState(1913);
				match(LPAR);
				setState(1914);
				forms();
				_hide();
				setState(1916);
				match(RPAR);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(1920);
				sortparams_OPT();
				setState(1921);
				sortset();
				setState(1922);
				form();
				_hide();
				setState(1924);
				match(COLONCOLON);
				setState(1925);
				sortname();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(1929);
				match(MT_sortDeclaration);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(1931);
				match(ET_sortDeclaration);
				setState(1932);
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
		enterRule(_localctx, 278, RULE_sortDeclaration_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1935);
			sortDeclaration();
			setState(1936);
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
		enterRule(_localctx, 280, RULE_sortparams_OPT);
		int _la;
		try {
			setState(1960);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1941);
				_la = _input.LA(1);
				if (((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (MT_sortparams - 143)) | (1L << (ET_sortparams - 143)) | (1L << (FORALL - 143)))) != 0)) {
					{
					setState(1940);
					sortparams();
					}
				}

				setState(1951);
				_la = _input.LA(1);
				if (_la==MT_sortparams_OPT || _la==ET_sortparams_OPT) {
					{
					_tail();
					setState(1949);
					switch (_input.LA(1)) {
					case MT_sortparams_OPT:
						{
						_term();
						setState(1945);
						match(MT_sortparams_OPT);
						}
						break;
					case ET_sortparams_OPT:
						{
						_embed();
						setState(1947);
						match(ET_sortparams_OPT);
						setState(1948);
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
				setState(1956);
				match(MT_sortparams_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1958);
				match(ET_sortparams_OPT);
				setState(1959);
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
		enterRule(_localctx, 282, RULE_sortparams_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1962);
			sortparams_OPT();
			setState(1963);
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
		public TerminalNode FORALL() { return getToken(CrsxMetaParser.FORALL, 0); }
		public Variable_OOMContext variable_OOM() {
			return getRuleContext(Variable_OOMContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CrsxMetaParser.DOT, 0); }
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
		enterRule(_localctx, 284, RULE_sortparams);
		try {
			setState(1978);
			switch (_input.LA(1)) {
			case FORALL:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				_hide();
				setState(1967);
				match(FORALL);
				setState(1968);
				variable_OOM();
				_hide();
				setState(1970);
				match(DOT);
				_exitAlt();
				}
				break;
			case MT_sortparams:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1974);
				match(MT_sortparams);
				}
				break;
			case ET_sortparams:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1976);
				match(ET_sortparams);
				setState(1977);
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
		enterRule(_localctx, 286, RULE_sortparams_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1980);
			sortparams();
			setState(1981);
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
		enterRule(_localctx, 288, RULE_variable_OOM);
		int _la;
		try {
			setState(2008);
			switch (_input.LA(1)) {
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
			case LINEAR:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterOOM();
				setState(1986); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1985);
					variable();
					}
					}
					setState(1988); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (MT_variable - 77)) | (1L << (ET_variable - 77)) | (1L << (MT_linear_OPT - 77)) | (1L << (ET_linear_OPT - 77)) | (1L << (MT_variable_TOK - 77)) | (1L << (ET_variable_TOK - 77)) | (1L << (MT_linear - 77)) | (1L << (ET_linear - 77)))) != 0) || _la==LINEAR || _la==VARIABLE );
				setState(1998);
				_la = _input.LA(1);
				if (_la==MT_variable_OOM || _la==ET_variable_OOM) {
					{
					_tail();
					setState(1996);
					switch (_input.LA(1)) {
					case MT_variable_OOM:
						{
						_term();
						setState(1992);
						match(MT_variable_OOM);
						}
						break;
					case ET_variable_OOM:
						{
						_embed();
						setState(1994);
						match(ET_variable_OOM);
						setState(1995);
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
				setState(2004);
				match(MT_variable_OOM);
				}
				break;
			case ET_variable_OOM:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2006);
				match(ET_variable_OOM);
				setState(2007);
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
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Variable_OOMContext variable_OOM() {
			return getRuleContext(Variable_OOMContext.class,0);
		}
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
		enterRule(_localctx, 290, RULE_variable_OOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2013);
			switch (_input.LA(1)) {
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
			case MT_variable_OOM:
			case ET_variable_OOM:
			case LINEAR:
			case VARIABLE:
				{
				setState(2010);
				variable_OOM();
				}
				break;
			case EOF:
				{
				_enterZOM();
				_exitZOM();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2015);
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
		enterRule(_localctx, 292, RULE_sortset);
		try {
			setState(2026);
			switch (_input.LA(1)) {
			case EOF:
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_properties_OPT:
			case ET_properties_OPT:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
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
				setState(2018);
				properties_OPT();
				_exitAlt();
				}
				break;
			case MT_sortset:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2022);
				match(MT_sortset);
				}
				break;
			case ET_sortset:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2024);
				match(ET_sortset);
				setState(2025);
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
		enterRule(_localctx, 294, RULE_sortset_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2028);
			sortset();
			setState(2029);
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
		public Sortname_ZOMContext sortname_ZOM() {
			return getRuleContext(Sortname_ZOMContext.class,0);
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
		enterRule(_localctx, 296, RULE_sortnames);
		try {
			setState(2040);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
			case MT_sortname_ZOM:
			case ET_sortname_ZOM:
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
				setState(2032);
				sortname_ZOM();
				_exitAlt();
				}
				break;
			case MT_sortnames:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2036);
				match(MT_sortnames);
				}
				break;
			case ET_sortnames:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2038);
				match(ET_sortnames);
				setState(2039);
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
		enterRule(_localctx, 298, RULE_sortnames_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2042);
			sortnames();
			setState(2043);
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

	public static class Sortname_ZOMContext extends ParserRuleContext {
		public List<SortnameContext> sortname() {
			return getRuleContexts(SortnameContext.class);
		}
		public SortnameContext sortname(int i) {
			return getRuleContext(SortnameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CrsxMetaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CrsxMetaParser.COMMA, i);
		}
		public TerminalNode MT_sortname_ZOM() { return getToken(CrsxMetaParser.MT_sortname_ZOM, 0); }
		public TerminalNode ET_sortname_ZOM() { return getToken(CrsxMetaParser.ET_sortname_ZOM, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Sortname_ZOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortname_ZOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortname_ZOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortname_ZOM(this);
		}
	}

	public final Sortname_ZOMContext sortname_ZOM() throws RecognitionException {
		Sortname_ZOMContext _localctx = new Sortname_ZOMContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_sortname_ZOM);
		int _la;
		try {
			setState(2074);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
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
				_enterZOM();
				setState(2047);
				sortname();
				setState(2053);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					_hide();
					setState(2049);
					match(COMMA);
					setState(2050);
					sortname();
					}
					}
					setState(2055);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2064);
				_la = _input.LA(1);
				if (_la==MT_sortname_ZOM || _la==ET_sortname_ZOM) {
					{
					_tail();
					setState(2062);
					switch (_input.LA(1)) {
					case MT_sortname_ZOM:
						{
						_term();
						setState(2058);
						match(MT_sortname_ZOM);
						}
						break;
					case ET_sortname_ZOM:
						{
						_embed();
						setState(2060);
						match(ET_sortname_ZOM);
						setState(2061);
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
			case MT_sortname_ZOM:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2070);
				match(MT_sortname_ZOM);
				}
				break;
			case ET_sortname_ZOM:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2072);
				match(ET_sortname_ZOM);
				setState(2073);
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

	public static class Sortname_ZOM_EOFContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Sortname_ZOMContext sortname_ZOM() {
			return getRuleContext(Sortname_ZOMContext.class,0);
		}
		public Sortname_ZOM_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortname_ZOM_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortname_ZOM_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortname_ZOM_EOF(this);
		}
	}

	public final Sortname_ZOM_EOFContext sortname_ZOM_EOF() throws RecognitionException {
		Sortname_ZOM_EOFContext _localctx = new Sortname_ZOM_EOFContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_sortname_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2079);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
			case MT_sortname_ZOM:
			case ET_sortname_ZOM:
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
				{
				setState(2076);
				sortname_ZOM();
				}
				break;
			case EOF:
				{
				_enterZOM();
				_exitZOM();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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
		enterRule(_localctx, 304, RULE_sortname);
		try {
			setState(2097);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
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
				setState(2084);
				constructor();
				setState(2085);
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
			case LINEAR:
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(2089);
				variable();
				_exitAlt();
				}
				break;
			case MT_sortname:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(2093);
				match(MT_sortname);
				}
				break;
			case ET_sortname:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(2095);
				match(ET_sortname);
				setState(2096);
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
		enterRule(_localctx, 306, RULE_sortname_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2099);
			sortname();
			setState(2100);
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
		enterRule(_localctx, 308, RULE_sortarguments_OPT);
		int _la;
		try {
			setState(2124);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(2105);
				_la = _input.LA(1);
				if (((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (MT_sortarguments - 157)) | (1L << (ET_sortarguments - 157)) | (1L << (LSQUARE - 157)))) != 0)) {
					{
					setState(2104);
					sortarguments();
					}
				}

				setState(2115);
				_la = _input.LA(1);
				if (_la==MT_sortarguments_OPT || _la==ET_sortarguments_OPT) {
					{
					_tail();
					setState(2113);
					switch (_input.LA(1)) {
					case MT_sortarguments_OPT:
						{
						_term();
						setState(2109);
						match(MT_sortarguments_OPT);
						}
						break;
					case ET_sortarguments_OPT:
						{
						_embed();
						setState(2111);
						match(ET_sortarguments_OPT);
						setState(2112);
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
				setState(2120);
				match(MT_sortarguments_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2122);
				match(ET_sortarguments_OPT);
				setState(2123);
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
		enterRule(_localctx, 310, RULE_sortarguments_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2126);
			sortarguments_OPT();
			setState(2127);
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
		public TerminalNode LSQUARE() { return getToken(CrsxMetaParser.LSQUARE, 0); }
		public Sortnames_OPTContext sortnames_OPT() {
			return getRuleContext(Sortnames_OPTContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(CrsxMetaParser.RSQUARE, 0); }
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
		enterRule(_localctx, 312, RULE_sortarguments);
		try {
			setState(2142);
			switch (_input.LA(1)) {
			case LSQUARE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				_hide();
				setState(2131);
				match(LSQUARE);
				setState(2132);
				sortnames_OPT();
				_hide();
				setState(2134);
				match(RSQUARE);
				_exitAlt();
				}
				break;
			case MT_sortarguments:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2138);
				match(MT_sortarguments);
				}
				break;
			case ET_sortarguments:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2140);
				match(ET_sortarguments);
				setState(2141);
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
		enterRule(_localctx, 314, RULE_sortarguments_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2144);
			sortarguments();
			setState(2145);
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
		enterRule(_localctx, 316, RULE_sortnames_OPT);
		int _la;
		try {
			setState(2169);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(2150);
				_la = _input.LA(1);
				if (_la==MT_constructor_TOK || _la==ET_constructor_TOK || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (MT_variable - 77)) | (1L << (ET_variable - 77)) | (1L << (MT_linear_OPT - 77)) | (1L << (ET_linear_OPT - 77)) | (1L << (MT_variable_TOK - 77)) | (1L << (ET_variable_TOK - 77)) | (1L << (MT_linear - 77)) | (1L << (ET_linear - 77)))) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & ((1L << (MT_sortnames - 149)) | (1L << (ET_sortnames - 149)) | (1L << (MT_sortname_ZOM - 149)) | (1L << (ET_sortname_ZOM - 149)) | (1L << (MT_sortname - 149)) | (1L << (ET_sortname - 149)) | (1L << (MT_constructor - 149)) | (1L << (ET_constructor - 149)) | (1L << (MT_qualifier - 149)) | (1L << (ET_qualifier - 149)) | (1L << (MT_reserved - 149)) | (1L << (ET_reserved - 149)) | (1L << (COLON - 149)) | (1L << (LINEAR - 149)) | (1L << (AT - 149)))) != 0) || _la==CONSTRUCTOR || _la==VARIABLE) {
					{
					setState(2149);
					sortnames();
					}
				}

				setState(2160);
				_la = _input.LA(1);
				if (_la==MT_sortnames_OPT || _la==ET_sortnames_OPT) {
					{
					_tail();
					setState(2158);
					switch (_input.LA(1)) {
					case MT_sortnames_OPT:
						{
						_term();
						setState(2154);
						match(MT_sortnames_OPT);
						}
						break;
					case ET_sortnames_OPT:
						{
						_embed();
						setState(2156);
						match(ET_sortnames_OPT);
						setState(2157);
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
				setState(2165);
				match(MT_sortnames_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2167);
				match(ET_sortnames_OPT);
				setState(2168);
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
		enterRule(_localctx, 318, RULE_sortnames_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2171);
			sortnames_OPT();
			setState(2172);
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
		public Form_ZOMContext form_ZOM() {
			return getRuleContext(Form_ZOMContext.class,0);
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
		enterRule(_localctx, 320, RULE_forms);
		try {
			setState(2183);
			switch (_input.LA(1)) {
			case EOF:
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_variable:
			case ET_variable:
			case MT_linear_OPT:
			case ET_linear_OPT:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_linear:
			case ET_linear:
			case MT_form_ZOM:
			case ET_form_ZOM:
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
				setState(2175);
				form_ZOM();
				_exitAlt();
				}
				break;
			case MT_forms:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2179);
				match(MT_forms);
				}
				break;
			case ET_forms:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2181);
				match(ET_forms);
				setState(2182);
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
		enterRule(_localctx, 322, RULE_forms_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2185);
			forms();
			setState(2186);
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

	public static class Form_ZOMContext extends ParserRuleContext {
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CrsxMetaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CrsxMetaParser.SEMI, i);
		}
		public TerminalNode MT_form_ZOM() { return getToken(CrsxMetaParser.MT_form_ZOM, 0); }
		public TerminalNode ET_form_ZOM() { return getToken(CrsxMetaParser.ET_form_ZOM, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Form_ZOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form_ZOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterForm_ZOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitForm_ZOM(this);
		}
	}

	public final Form_ZOMContext form_ZOM() throws RecognitionException {
		Form_ZOMContext _localctx = new Form_ZOMContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_form_ZOM);
		int _la;
		try {
			setState(2216);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterZOM();
				setState(2196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MT_constructor_TOK || _la==ET_constructor_TOK || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (MT_variable - 77)) | (1L << (ET_variable - 77)) | (1L << (MT_linear_OPT - 77)) | (1L << (ET_linear_OPT - 77)) | (1L << (MT_variable_TOK - 77)) | (1L << (ET_variable_TOK - 77)) | (1L << (MT_linear - 77)) | (1L << (ET_linear - 77)))) != 0) || ((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & ((1L << (MT_form - 165)) | (1L << (ET_form - 165)) | (1L << (MT_constructor - 165)) | (1L << (ET_constructor - 165)) | (1L << (MT_qualifier - 165)) | (1L << (ET_qualifier - 165)) | (1L << (MT_reserved - 165)) | (1L << (ET_reserved - 165)) | (1L << (COLON - 165)) | (1L << (LINEAR - 165)) | (1L << (AT - 165)) | (1L << (CONSTRUCTOR - 165)) | (1L << (VARIABLE - 165)))) != 0)) {
					{
					{
					setState(2190);
					form();
					_hide();
					setState(2192);
					match(SEMI);
					}
					}
					setState(2198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2207);
				_la = _input.LA(1);
				if (_la==MT_form_ZOM || _la==ET_form_ZOM) {
					{
					_tail();
					setState(2205);
					switch (_input.LA(1)) {
					case MT_form_ZOM:
						{
						_term();
						setState(2201);
						match(MT_form_ZOM);
						}
						break;
					case ET_form_ZOM:
						{
						_embed();
						setState(2203);
						match(ET_form_ZOM);
						setState(2204);
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
				setState(2212);
				match(MT_form_ZOM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2214);
				match(ET_form_ZOM);
				setState(2215);
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

	public static class Form_ZOM_EOFContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Form_ZOMContext form_ZOM() {
			return getRuleContext(Form_ZOMContext.class,0);
		}
		public Form_ZOM_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form_ZOM_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterForm_ZOM_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitForm_ZOM_EOF(this);
		}
	}

	public final Form_ZOM_EOFContext form_ZOM_EOF() throws RecognitionException {
		Form_ZOM_EOFContext _localctx = new Form_ZOM_EOFContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_form_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2221);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(2218);
				form_ZOM();
				}
				break;
			case 2:
				{
				_enterZOM();
				_exitZOM();
				}
				break;
			}
			setState(2223);
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
		enterRule(_localctx, 328, RULE_form);
		try {
			setState(2239);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
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
				setState(2226);
				constructor();
				setState(2227);
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
			case LINEAR:
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(2231);
				variable();
				_exitAlt();
				}
				break;
			case MT_form:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(2235);
				match(MT_form);
				}
				break;
			case ET_form:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(2237);
				match(ET_form);
				setState(2238);
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
		enterRule(_localctx, 330, RULE_form_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2241);
			form();
			setState(2242);
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
		enterRule(_localctx, 332, RULE_constructor);
		try {
			setState(2258);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_qualifier:
			case ET_qualifier:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(2245);
				qualifier();
				setState(2246);
				constructor_TOK();
				_exitAlt();
				}
				break;
			case MT_reserved:
			case ET_reserved:
			case COLON:
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(2250);
				reserved();
				_exitAlt();
				}
				break;
			case MT_constructor:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(2254);
				match(MT_constructor);
				}
				break;
			case ET_constructor:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(2256);
				match(ET_constructor);
				setState(2257);
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
		enterRule(_localctx, 334, RULE_constructor_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2260);
			constructor();
			setState(2261);
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
		public TerminalNode DOT() { return getToken(CrsxMetaParser.DOT, 0); }
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
		enterRule(_localctx, 336, RULE_qualifier);
		try {
			setState(2277);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(2264);
				constructor_TOK();
				_hide();
				setState(2266);
				match(DOT);
				setState(2267);
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
				setState(2273);
				match(MT_qualifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(2275);
				match(ET_qualifier);
				setState(2276);
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
		enterRule(_localctx, 338, RULE_qualifier_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2279);
			qualifier();
			setState(2280);
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
		public TerminalNode COLON() { return getToken(CrsxMetaParser.COLON, 0); }
		public TerminalNode AT() { return getToken(CrsxMetaParser.AT, 0); }
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
		enterRule(_localctx, 340, RULE_reserved);
		try {
			setState(2295);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_hide();
				setState(2284);
				match(COLON);
				_exitAlt();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(2288);
				match(AT);
				_exitAlt();
				}
				break;
			case MT_reserved:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(2291);
				match(MT_reserved);
				}
				break;
			case ET_reserved:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(2293);
				match(ET_reserved);
				setState(2294);
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
		enterRule(_localctx, 342, RULE_reserved_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2297);
			reserved();
			setState(2298);
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
		enterRule(_localctx, 344, RULE_directive);
		try {
			setState(2322);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
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
				setState(2301);
				constructor();
				setState(2302);
				directiveArguments_OPT();
				_exitAlt();
				}
				break;
			case MT_directiveList:
			case ET_directiveList:
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(2306);
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
				setState(2310);
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
				setState(2314);
				concrete();
				_exitAlt();
				}
				break;
			case MT_directive:
				enterOuterAlt(_localctx, 5);
				{
				_term();
				setState(2318);
				match(MT_directive);
				}
				break;
			case ET_directive:
				enterOuterAlt(_localctx, 6);
				{
				_embed();
				setState(2320);
				match(ET_directive);
				setState(2321);
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
		enterRule(_localctx, 346, RULE_directive_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2324);
			directive();
			setState(2325);
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
		enterRule(_localctx, 348, RULE_directiveArguments_OPT);
		int _la;
		try {
			setState(2349);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(2330);
				_la = _input.LA(1);
				if (((((_la - 177)) & ~0x3f) == 0 && ((1L << (_la - 177)) & ((1L << (MT_directiveArguments - 177)) | (1L << (ET_directiveArguments - 177)) | (1L << (LSQUARE - 177)))) != 0)) {
					{
					setState(2329);
					directiveArguments();
					}
				}

				setState(2340);
				_la = _input.LA(1);
				if (_la==MT_directiveArguments_OPT || _la==ET_directiveArguments_OPT) {
					{
					_tail();
					setState(2338);
					switch (_input.LA(1)) {
					case MT_directiveArguments_OPT:
						{
						_term();
						setState(2334);
						match(MT_directiveArguments_OPT);
						}
						break;
					case ET_directiveArguments_OPT:
						{
						_embed();
						setState(2336);
						match(ET_directiveArguments_OPT);
						setState(2337);
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
				setState(2345);
				match(MT_directiveArguments_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2347);
				match(ET_directiveArguments_OPT);
				setState(2348);
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
		enterRule(_localctx, 350, RULE_directiveArguments_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2351);
			directiveArguments_OPT();
			setState(2352);
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
		public TerminalNode LSQUARE() { return getToken(CrsxMetaParser.LSQUARE, 0); }
		public Directives_OPTContext directives_OPT() {
			return getRuleContext(Directives_OPTContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(CrsxMetaParser.RSQUARE, 0); }
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
		enterRule(_localctx, 352, RULE_directiveArguments);
		try {
			setState(2367);
			switch (_input.LA(1)) {
			case LSQUARE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				_hide();
				setState(2356);
				match(LSQUARE);
				setState(2357);
				directives_OPT();
				_hide();
				setState(2359);
				match(RSQUARE);
				_exitAlt();
				}
				break;
			case MT_directiveArguments:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2363);
				match(MT_directiveArguments);
				}
				break;
			case ET_directiveArguments:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2365);
				match(ET_directiveArguments);
				setState(2366);
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
		enterRule(_localctx, 354, RULE_directiveArguments_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2369);
			directiveArguments();
			setState(2370);
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
		enterRule(_localctx, 356, RULE_directives_OPT);
		int _la;
		try {
			setState(2394);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(2375);
				_la = _input.LA(1);
				if (_la==MT_constructor_TOK || _la==ET_constructor_TOK || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (MT_literal - 91)) | (1L << (ET_literal - 91)) | (1L << (MT_string_TOK - 91)) | (1L << (ET_string_TOK - 91)) | (1L << (MT_number_TOK - 91)) | (1L << (ET_number_TOK - 91)) | (1L << (MT_concrete - 91)) | (1L << (ET_concrete - 91)) | (1L << (MT_category_TOK - 91)) | (1L << (ET_category_TOK - 91)))) != 0) || ((((_la - 167)) & ~0x3f) == 0 && ((1L << (_la - 167)) & ((1L << (MT_constructor - 167)) | (1L << (ET_constructor - 167)) | (1L << (MT_qualifier - 167)) | (1L << (ET_qualifier - 167)) | (1L << (MT_reserved - 167)) | (1L << (ET_reserved - 167)) | (1L << (MT_directive - 167)) | (1L << (ET_directive - 167)) | (1L << (MT_directives - 167)) | (1L << (ET_directives - 167)) | (1L << (MT_directive_ZOM - 167)) | (1L << (ET_directive_ZOM - 167)) | (1L << (MT_directiveList - 167)) | (1L << (ET_directiveList - 167)) | (1L << (COLON - 167)) | (1L << (LPAR - 167)) | (1L << (AT - 167)) | (1L << (CATEGORY - 167)) | (1L << (CONSTRUCTOR - 167)) | (1L << (STRING - 167)) | (1L << (NUMBER - 167)))) != 0)) {
					{
					setState(2374);
					directives();
					}
				}

				setState(2385);
				_la = _input.LA(1);
				if (_la==MT_directives_OPT || _la==ET_directives_OPT) {
					{
					_tail();
					setState(2383);
					switch (_input.LA(1)) {
					case MT_directives_OPT:
						{
						_term();
						setState(2379);
						match(MT_directives_OPT);
						}
						break;
					case ET_directives_OPT:
						{
						_embed();
						setState(2381);
						match(ET_directives_OPT);
						setState(2382);
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
				setState(2390);
				match(MT_directives_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2392);
				match(ET_directives_OPT);
				setState(2393);
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
		enterRule(_localctx, 358, RULE_directives_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2396);
			directives_OPT();
			setState(2397);
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
		public Directive_ZOMContext directive_ZOM() {
			return getRuleContext(Directive_ZOMContext.class,0);
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
		enterRule(_localctx, 360, RULE_directives);
		try {
			setState(2408);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
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
			case MT_directive_ZOM:
			case ET_directive_ZOM:
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
				setState(2400);
				directive_ZOM();
				_exitAlt();
				}
				break;
			case MT_directives:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2404);
				match(MT_directives);
				}
				break;
			case ET_directives:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2406);
				match(ET_directives);
				setState(2407);
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
		enterRule(_localctx, 362, RULE_directives_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2410);
			directives();
			setState(2411);
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

	public static class Directive_ZOMContext extends ParserRuleContext {
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CrsxMetaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CrsxMetaParser.COMMA, i);
		}
		public TerminalNode MT_directive_ZOM() { return getToken(CrsxMetaParser.MT_directive_ZOM, 0); }
		public TerminalNode ET_directive_ZOM() { return getToken(CrsxMetaParser.ET_directive_ZOM, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Directive_ZOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_ZOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDirective_ZOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDirective_ZOM(this);
		}
	}

	public final Directive_ZOMContext directive_ZOM() throws RecognitionException {
		Directive_ZOMContext _localctx = new Directive_ZOMContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_directive_ZOM);
		int _la;
		try {
			setState(2442);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
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
				_enterZOM();
				setState(2415);
				directive();
				setState(2421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					_hide();
					setState(2417);
					match(COMMA);
					setState(2418);
					directive();
					}
					}
					setState(2423);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2432);
				_la = _input.LA(1);
				if (_la==MT_directive_ZOM || _la==ET_directive_ZOM) {
					{
					_tail();
					setState(2430);
					switch (_input.LA(1)) {
					case MT_directive_ZOM:
						{
						_term();
						setState(2426);
						match(MT_directive_ZOM);
						}
						break;
					case ET_directive_ZOM:
						{
						_embed();
						setState(2428);
						match(ET_directive_ZOM);
						setState(2429);
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
			case MT_directive_ZOM:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2438);
				match(MT_directive_ZOM);
				}
				break;
			case ET_directive_ZOM:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2440);
				match(ET_directive_ZOM);
				setState(2441);
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

	public static class Directive_ZOM_EOFContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Directive_ZOMContext directive_ZOM() {
			return getRuleContext(Directive_ZOMContext.class,0);
		}
		public Directive_ZOM_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_ZOM_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDirective_ZOM_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDirective_ZOM_EOF(this);
		}
	}

	public final Directive_ZOM_EOFContext directive_ZOM_EOF() throws RecognitionException {
		Directive_ZOM_EOFContext _localctx = new Directive_ZOM_EOFContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_directive_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2447);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
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
			case MT_directive_ZOM:
			case ET_directive_ZOM:
			case MT_directiveList:
			case ET_directiveList:
			case COLON:
			case LPAR:
			case AT:
			case CATEGORY:
			case CONSTRUCTOR:
			case STRING:
			case NUMBER:
				{
				setState(2444);
				directive_ZOM();
				}
				break;
			case EOF:
				{
				_enterZOM();
				_exitZOM();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2449);
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
		public TerminalNode LPAR() { return getToken(CrsxMetaParser.LPAR, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CrsxMetaParser.RPAR, 0); }
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
		enterRule(_localctx, 368, RULE_directiveList);
		try {
			setState(2464);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				_hide();
				setState(2453);
				match(LPAR);
				setState(2454);
				declarations();
				_hide();
				setState(2456);
				match(RPAR);
				_exitAlt();
				}
				break;
			case MT_directiveList:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(2460);
				match(MT_directiveList);
				}
				break;
			case ET_directiveList:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(2462);
				match(ET_directiveList);
				setState(2463);
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
		enterRule(_localctx, 370, RULE_directiveList_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2466);
			directiveList();
			setState(2467);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00e3\u09a8\4\2\t"+
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
		"\t\u00bb\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0180\n\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u018e\n\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\7\6\u0196\n\6\f\6\16\6\u0199\13\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01a1"+
		"\n\6\5\6\u01a3\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01ac\n\6\3\7\3\7\3"+
		"\7\5\7\u01b1\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01dc\n\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u01f1"+
		"\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01fe\n\f\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u021e\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0230\n\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\5\22\u0238\n\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0240\n\22\5"+
		"\22\u0242\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u024b\n\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0260\n\24\3\25\3\25\3\25\3\26\3\26\3\26\5\26"+
		"\u0268\n\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0270\n\26\5\26\u0272\n"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u027b\n\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u028b\n\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\5\32\u0293\n\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u029b\n\32\5\32\u029d\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\5\32\u02a6\n\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u02b4\n\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u02c2\n\36\3\37\3\37\3\37\3 \3 \3 \6 \u02ca\n \r"+
		" \16 \u02cb\3 \3 \3 \3 \3 \3 \5 \u02d4\n \5 \u02d6\n \3 \3 \3 \3 \3 \3"+
		" \3 \3 \5 \u02e0\n \3!\3!\3!\5!\u02e5\n!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u02f5\n\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\5$\u0307\n$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\5&\u0346\n&\3\'\3\'\3\'\3(\3(\3(\5(\u034e\n(\3(\3(\3(\3(\3(\3(\5"+
		"(\u0356\n(\5(\u0358\n(\3(\3(\3(\3(\3(\3(\3(\5(\u0361\n(\3)\3)\3)\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\5*\u036e\n*\3+\3+\3+\3,\3,\3,\5,\u0376\n,\3,\3,\3"+
		",\3,\3,\3,\5,\u037e\n,\5,\u0380\n,\3,\3,\3,\3,\3,\3,\3,\5,\u0389\n,\3"+
		"-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0398\n.\3/\3/\3/\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5"+
		"\60\u03ad\n\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\5\62\u03bf\n\62\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\5\64\u03c7\n\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u03cf\n\64\5\64\u03d1"+
		"\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u03da\n\64\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u03e8\n\66\3\67\3\67"+
		"\3\67\38\38\38\38\38\38\78\u03f3\n8\f8\168\u03f6\138\38\38\38\38\38\3"+
		"8\58\u03fe\n8\58\u0400\n8\38\38\38\38\38\38\38\38\58\u040a\n8\39\39\3"+
		"9\59\u040f\n9\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0420\n"+
		":\3;\3;\3;\3<\3<\3<\5<\u0428\n<\3<\3<\3<\3<\3<\3<\5<\u0430\n<\5<\u0432"+
		"\n<\3<\3<\3<\3<\3<\3<\3<\5<\u043b\n<\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>"+
		"\3>\5>\u0449\n>\3?\3?\3?\3@\3@\3@\3@\3@\3@\7@\u0454\n@\f@\16@\u0457\13"+
		"@\3@\3@\3@\3@\3@\3@\5@\u045f\n@\5@\u0461\n@\3@\3@\3@\3@\3@\3@\3@\3@\5"+
		"@\u046b\n@\3A\3A\3A\5A\u0470\nA\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3"+
		"B\3B\3B\5B\u0481\nB\3C\3C\3C\3D\3D\3D\5D\u0489\nD\3D\3D\3D\3D\3D\3D\5"+
		"D\u0491\nD\5D\u0493\nD\3D\3D\3D\3D\3D\3D\3D\5D\u049c\nD\3E\3E\3E\3F\3"+
		"F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u04ab\nF\3G\3G\3G\3H\3H\3H\3H\3H\3H\7H\u04b6"+
		"\nH\fH\16H\u04b9\13H\3H\3H\3H\3H\3H\3H\5H\u04c1\nH\5H\u04c3\nH\3H\3H\3"+
		"H\3H\3H\3H\3H\3H\5H\u04cd\nH\3I\3I\3I\5I\u04d2\nI\3I\3I\3J\3J\3J\5J\u04d9"+
		"\nJ\3J\3J\3J\3J\3J\3J\5J\u04e1\nJ\5J\u04e3\nJ\3J\3J\3J\3J\3J\3J\3J\5J"+
		"\u04ec\nJ\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u04fa\nL\3M\3M\3M\3N"+
		"\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u050c\nN\3O\3O\3O\3P\3P\3P\5P"+
		"\u0514\nP\3P\3P\3P\3P\3P\3P\5P\u051c\nP\5P\u051e\nP\3P\3P\3P\3P\3P\3P"+
		"\3P\5P\u0527\nP\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\5R\u0534\nR\3S\3S\3S"+
		"\3T\3T\3T\5T\u053c\nT\3T\3T\3T\3T\3T\3T\5T\u0544\nT\5T\u0546\nT\3T\3T"+
		"\3T\3T\3T\3T\3T\5T\u054f\nT\3U\3U\3U\3V\3V\3V\5V\u0557\nV\3V\3V\3V\3V"+
		"\3V\3V\5V\u055f\nV\5V\u0561\nV\3V\3V\3V\3V\3V\3V\3V\5V\u056a\nV\3W\3W"+
		"\3W\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u0578\nX\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z"+
		"\3Z\3Z\3Z\5Z\u0586\nZ\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\5\\\u0598\n\\\3]\3]\3]\3^\3^\3^\3^\3^\3^\3^\3^\5^\u05a5\n"+
		"^\3_\3_\3_\3`\3`\3`\3`\3`\3`\3`\3`\5`\u05b2\n`\3a\3a\3a\3b\3b\3b\3b\3"+
		"b\3b\3b\3b\3b\3b\5b\u05c1\nb\3c\3c\3c\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3"+
		"d\5d\u05d1\nd\3e\3e\3e\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3"+
		"f\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u05ef\nf\3g\3g\3g\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\5h\u05fc\nh\3i\3i\3i\3j\3j\3j\3j\3j\3j\3j\3j\5j\u0609\nj\3k\3k\3"+
		"k\3l\3l\3l\3l\3l\3l\3l\3l\5l\u0616\nl\3m\3m\3m\3n\3n\3n\3n\3n\3n\3n\3"+
		"n\5n\u0623\nn\3o\3o\3o\3p\3p\3p\3p\3p\3p\3p\3p\5p\u0630\np\3q\3q\3q\3"+
		"r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\5r\u0642\nr\3s\3s\3s\3t\3t\3t\5"+
		"t\u064a\nt\3t\3t\3t\3t\3t\3t\5t\u0652\nt\5t\u0654\nt\3t\3t\3t\3t\3t\3"+
		"t\3t\5t\u065d\nt\3u\3u\3u\3v\3v\3v\3v\3v\3v\3v\3v\3v\5v\u066b\nv\3w\3"+
		"w\3w\3x\3x\3x\3x\3x\3x\3x\3x\3x\5x\u0679\nx\3y\3y\3y\3z\3z\3z\3z\3z\3"+
		"z\7z\u0684\nz\fz\16z\u0687\13z\3z\3z\3z\3z\3z\3z\5z\u068f\nz\5z\u0691"+
		"\nz\3z\3z\3z\3z\3z\3z\3z\3z\5z\u069b\nz\3{\3{\3{\5{\u06a0\n{\3{\3{\3|"+
		"\3|\3|\3|\3|\3|\3|\3|\3|\5|\u06ad\n|\3}\3}\3}\3~\3~\3~\3~\3~\3~\3~\3~"+
		"\3~\5~\u06bb\n~\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080"+
		"\u06cd\n\u0080\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\5\u0082"+
		"\u06d5\n\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082"+
		"\u06dd\n\u0082\5\u0082\u06df\n\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3"+
		"\u0082\3\u0082\3\u0082\5\u0082\u06e8\n\u0082\3\u0083\3\u0083\3\u0083\3"+
		"\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\5\u0084\u06f6\n\u0084\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\5\u0086\u0701\n\u0086\7\u0086\u0703\n\u0086\f"+
		"\u0086\16\u0086\u0706\13\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\5\u0086\u070e\n\u0086\5\u0086\u0710\n\u0086\3\u0086\3\u0086\3"+
		"\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u071a\n\u0086\3"+
		"\u0087\3\u0087\3\u0087\5\u0087\u071f\n\u0087\3\u0087\3\u0087\3\u0088\3"+
		"\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088"+
		"\u0762\n\u0088\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u0770\n\u008a\3\u008b"+
		"\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\5\u008c\u0790\n\u008c\3\u008d\3\u008d\3\u008d\3\u008e"+
		"\3\u008e\3\u008e\5\u008e\u0798\n\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\5\u008e\u07a0\n\u008e\5\u008e\u07a2\n\u008e\3\u008e\3"+
		"\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u07ab\n\u008e\3"+
		"\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u07bd"+
		"\n\u0090\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\6\u0092\u07c5"+
		"\n\u0092\r\u0092\16\u0092\u07c6\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\5\u0092\u07cf\n\u0092\5\u0092\u07d1\n\u0092\3\u0092\3\u0092\3"+
		"\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u07db\n\u0092\3"+
		"\u0093\3\u0093\3\u0093\5\u0093\u07e0\n\u0093\3\u0093\3\u0093\3\u0094\3"+
		"\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094"+
		"\u07ed\n\u0094\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u07fb\n\u0096\3\u0097"+
		"\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\7\u0098"+
		"\u0806\n\u0098\f\u0098\16\u0098\u0809\13\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\5\u0098\u0811\n\u0098\5\u0098\u0813\n\u0098\3"+
		"\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098"+
		"\u081d\n\u0098\3\u0099\3\u0099\3\u0099\5\u0099\u0822\n\u0099\3\u0099\3"+
		"\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u0834\n\u009a"+
		"\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\5\u009c\u083c\n\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u0844\n\u009c"+
		"\5\u009c\u0846\n\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\5\u009c\u084f\n\u009c\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\5\u009e\u0861\n\u009e\3\u009f\3\u009f\3\u009f\3\u00a0"+
		"\3\u00a0\3\u00a0\5\u00a0\u0869\n\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\5\u00a0\u0871\n\u00a0\5\u00a0\u0873\n\u00a0\3\u00a0\3"+
		"\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u087c\n\u00a0\3"+
		"\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u088a\n\u00a2\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\7\u00a4\u0895\n\u00a4"+
		"\f\u00a4\16\u00a4\u0898\13\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4"+
		"\3\u00a4\5\u00a4\u08a0\n\u00a4\5\u00a4\u08a2\n\u00a4\3\u00a4\3\u00a4\3"+
		"\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u08ab\n\u00a4\3\u00a5\3"+
		"\u00a5\3\u00a5\5\u00a5\u08b0\n\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3"+
		"\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u08c2\n\u00a6\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u08d5\n\u00a8\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u08e8"+
		"\n\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac"+
		"\u08fa\n\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\5\u00ae\u0915\n\u00ae\3\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0"+
		"\5\u00b0\u091d\n\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\5\u00b0\u0925\n\u00b0\5\u00b0\u0927\n\u00b0\3\u00b0\3\u00b0\3\u00b0\3"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0930\n\u00b0\3\u00b1\3\u00b1\3"+
		"\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u0942\n\u00b2\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u094a\n\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u0952\n\u00b4\5\u00b4"+
		"\u0954\n\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\5\u00b4\u095d\n\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u096b\n\u00b6"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\7\u00b8\u0976\n\u00b8\f\u00b8\16\u00b8\u0979\13\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u0981\n\u00b8\5\u00b8\u0983\n"+
		"\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\5\u00b8\u098d\n\u00b8\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u0992\n\u00b9\3"+
		"\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u09a3\n\u00ba"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bb\2\2\u00bc\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de"+
		"\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6"+
		"\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e"+
		"\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126"+
		"\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e"+
		"\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156"+
		"\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e"+
		"\u0170\u0172\u0174\2\2\u0a35\2\u017f\3\2\2\2\4\u0181\3\2\2\2\6\u018d\3"+
		"\2\2\2\b\u018f\3\2\2\2\n\u01ab\3\2\2\2\f\u01b0\3\2\2\2\16\u01db\3\2\2"+
		"\2\20\u01dd\3\2\2\2\22\u01f0\3\2\2\2\24\u01f2\3\2\2\2\26\u01fd\3\2\2\2"+
		"\30\u01ff\3\2\2\2\32\u021d\3\2\2\2\34\u021f\3\2\2\2\36\u022f\3\2\2\2 "+
		"\u0231\3\2\2\2\"\u024a\3\2\2\2$\u024c\3\2\2\2&\u025f\3\2\2\2(\u0261\3"+
		"\2\2\2*\u027a\3\2\2\2,\u027c\3\2\2\2.\u028a\3\2\2\2\60\u028c\3\2\2\2\62"+
		"\u02a5\3\2\2\2\64\u02a7\3\2\2\2\66\u02b3\3\2\2\28\u02b5\3\2\2\2:\u02c1"+
		"\3\2\2\2<\u02c3\3\2\2\2>\u02df\3\2\2\2@\u02e4\3\2\2\2B\u02f4\3\2\2\2D"+
		"\u02f6\3\2\2\2F\u0306\3\2\2\2H\u0308\3\2\2\2J\u0345\3\2\2\2L\u0347\3\2"+
		"\2\2N\u0360\3\2\2\2P\u0362\3\2\2\2R\u036d\3\2\2\2T\u036f\3\2\2\2V\u0388"+
		"\3\2\2\2X\u038a\3\2\2\2Z\u0397\3\2\2\2\\\u0399\3\2\2\2^\u03ac\3\2\2\2"+
		"`\u03ae\3\2\2\2b\u03be\3\2\2\2d\u03c0\3\2\2\2f\u03d9\3\2\2\2h\u03db\3"+
		"\2\2\2j\u03e7\3\2\2\2l\u03e9\3\2\2\2n\u0409\3\2\2\2p\u040e\3\2\2\2r\u041f"+
		"\3\2\2\2t\u0421\3\2\2\2v\u043a\3\2\2\2x\u043c\3\2\2\2z\u0448\3\2\2\2|"+
		"\u044a\3\2\2\2~\u046a\3\2\2\2\u0080\u046f\3\2\2\2\u0082\u0480\3\2\2\2"+
		"\u0084\u0482\3\2\2\2\u0086\u049b\3\2\2\2\u0088\u049d\3\2\2\2\u008a\u04aa"+
		"\3\2\2\2\u008c\u04ac\3\2\2\2\u008e\u04cc\3\2\2\2\u0090\u04d1\3\2\2\2\u0092"+
		"\u04eb\3\2\2\2\u0094\u04ed\3\2\2\2\u0096\u04f9\3\2\2\2\u0098\u04fb\3\2"+
		"\2\2\u009a\u050b\3\2\2\2\u009c\u050d\3\2\2\2\u009e\u0526\3\2\2\2\u00a0"+
		"\u0528\3\2\2\2\u00a2\u0533\3\2\2\2\u00a4\u0535\3\2\2\2\u00a6\u054e\3\2"+
		"\2\2\u00a8\u0550\3\2\2\2\u00aa\u0569\3\2\2\2\u00ac\u056b\3\2\2\2\u00ae"+
		"\u0577\3\2\2\2\u00b0\u0579\3\2\2\2\u00b2\u0585\3\2\2\2\u00b4\u0587\3\2"+
		"\2\2\u00b6\u0597\3\2\2\2\u00b8\u0599\3\2\2\2\u00ba\u05a4\3\2\2\2\u00bc"+
		"\u05a6\3\2\2\2\u00be\u05b1\3\2\2\2\u00c0\u05b3\3\2\2\2\u00c2\u05c0\3\2"+
		"\2\2\u00c4\u05c2\3\2\2\2\u00c6\u05d0\3\2\2\2\u00c8\u05d2\3\2\2\2\u00ca"+
		"\u05ee\3\2\2\2\u00cc\u05f0\3\2\2\2\u00ce\u05fb\3\2\2\2\u00d0\u05fd\3\2"+
		"\2\2\u00d2\u0608\3\2\2\2\u00d4\u060a\3\2\2\2\u00d6\u0615\3\2\2\2\u00d8"+
		"\u0617\3\2\2\2\u00da\u0622\3\2\2\2\u00dc\u0624\3\2\2\2\u00de\u062f\3\2"+
		"\2\2\u00e0\u0631\3\2\2\2\u00e2\u0641\3\2\2\2\u00e4\u0643\3\2\2\2\u00e6"+
		"\u065c\3\2\2\2\u00e8\u065e\3\2\2\2\u00ea\u066a\3\2\2\2\u00ec\u066c\3\2"+
		"\2\2\u00ee\u0678\3\2\2\2\u00f0\u067a\3\2\2\2\u00f2\u069a\3\2\2\2\u00f4"+
		"\u069f\3\2\2\2\u00f6\u06ac\3\2\2\2\u00f8\u06ae\3\2\2\2\u00fa\u06ba\3\2"+
		"\2\2\u00fc\u06bc\3\2\2\2\u00fe\u06cc\3\2\2\2\u0100\u06ce\3\2\2\2\u0102"+
		"\u06e7\3\2\2\2\u0104\u06e9\3\2\2\2\u0106\u06f5\3\2\2\2\u0108\u06f7\3\2"+
		"\2\2\u010a\u0719\3\2\2\2\u010c\u071e\3\2\2\2\u010e\u0761\3\2\2\2\u0110"+
		"\u0763\3\2\2\2\u0112\u076f\3\2\2\2\u0114\u0771\3\2\2\2\u0116\u078f\3\2"+
		"\2\2\u0118\u0791\3\2\2\2\u011a\u07aa\3\2\2\2\u011c\u07ac\3\2\2\2\u011e"+
		"\u07bc\3\2\2\2\u0120\u07be\3\2\2\2\u0122\u07da\3\2\2\2\u0124\u07df\3\2"+
		"\2\2\u0126\u07ec\3\2\2\2\u0128\u07ee\3\2\2\2\u012a\u07fa\3\2\2\2\u012c"+
		"\u07fc\3\2\2\2\u012e\u081c\3\2\2\2\u0130\u0821\3\2\2\2\u0132\u0833\3\2"+
		"\2\2\u0134\u0835\3\2\2\2\u0136\u084e\3\2\2\2\u0138\u0850\3\2\2\2\u013a"+
		"\u0860\3\2\2\2\u013c\u0862\3\2\2\2\u013e\u087b\3\2\2\2\u0140\u087d\3\2"+
		"\2\2\u0142\u0889\3\2\2\2\u0144\u088b\3\2\2\2\u0146\u08aa\3\2\2\2\u0148"+
		"\u08af\3\2\2\2\u014a\u08c1\3\2\2\2\u014c\u08c3\3\2\2\2\u014e\u08d4\3\2"+
		"\2\2\u0150\u08d6\3\2\2\2\u0152\u08e7\3\2\2\2\u0154\u08e9\3\2\2\2\u0156"+
		"\u08f9\3\2\2\2\u0158\u08fb\3\2\2\2\u015a\u0914\3\2\2\2\u015c\u0916\3\2"+
		"\2\2\u015e\u092f\3\2\2\2\u0160\u0931\3\2\2\2\u0162\u0941\3\2\2\2\u0164"+
		"\u0943\3\2\2\2\u0166\u095c\3\2\2\2\u0168\u095e\3\2\2\2\u016a\u096a\3\2"+
		"\2\2\u016c\u096c\3\2\2\2\u016e\u098c\3\2\2\2\u0170\u0991\3\2\2\2\u0172"+
		"\u09a2\3\2\2\2\u0174\u09a4\3\2\2\2\u0176\u0177\b\2\1\2\u0177\u0178\5\6"+
		"\4\2\u0178\u0179\b\2\1\2\u0179\u0180\3\2\2\2\u017a\u017b\b\2\1\2\u017b"+
		"\u0180\7\3\2\2\u017c\u017d\b\2\1\2\u017d\u017e\7\4\2\2\u017e\u0180\7\u00e3"+
		"\2\2\u017f\u0176\3\2\2\2\u017f\u017a\3\2\2\2\u017f\u017c\3\2\2\2\u0180"+
		"\3\3\2\2\2\u0181\u0182\5\2\2\2\u0182\u0183\7\2\2\3\u0183\5\3\2\2\2\u0184"+
		"\u0185\b\4\1\2\u0185\u0186\5\n\6\2\u0186\u0187\b\4\1\2\u0187\u018e\3\2"+
		"\2\2\u0188\u0189\b\4\1\2\u0189\u018e\7\5\2\2\u018a\u018b\b\4\1\2\u018b"+
		"\u018c\7\6\2\2\u018c\u018e\7\u00e3\2\2\u018d\u0184\3\2\2\2\u018d\u0188"+
		"\3\2\2\2\u018d\u018a\3\2\2\2\u018e\7\3\2\2\2\u018f\u0190\5\6\4\2\u0190"+
		"\u0191\7\2\2\3\u0191\t\3\2\2\2\u0192\u0193\b\6\1\2\u0193\u0197\b\6\1\2"+
		"\u0194\u0196\5\16\b\2\u0195\u0194\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195"+
		"\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u01a2\3\2\2\2\u0199\u0197\3\2\2\2\u019a"+
		"\u01a0\b\6\1\2\u019b\u019c\b\6\1\2\u019c\u01a1\7\7\2\2\u019d\u019e\b\6"+
		"\1\2\u019e\u019f\7\b\2\2\u019f\u01a1\7\u00e3\2\2\u01a0\u019b\3\2\2\2\u01a0"+
		"\u019d\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u019a\3\2\2\2\u01a2\u01a3\3\2"+
		"\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\b\6\1\2\u01a5\u01ac\b\6\1\2\u01a6"+
		"\u01a7\b\6\1\2\u01a7\u01ac\7\7\2\2\u01a8\u01a9\b\6\1\2\u01a9\u01aa\7\b"+
		"\2\2\u01aa\u01ac\7\u00e3\2\2\u01ab\u0192\3\2\2\2\u01ab\u01a6\3\2\2\2\u01ab"+
		"\u01a8\3\2\2\2\u01ac\13\3\2\2\2\u01ad\u01b1\5\n\6\2\u01ae\u01af\b\7\1"+
		"\2\u01af\u01b1\b\7\1\2\u01b0\u01ad\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2"+
		"\3\2\2\2\u01b2\u01b3\7\2\2\3\u01b3\r\3\2\2\2\u01b4\u01b5\b\b\1\2\u01b5"+
		"\u01b6\5\22\n\2\u01b6\u01b7\b\b\1\2\u01b7\u01b8\7\u00cb\2\2\u01b8\u01b9"+
		"\b\b\1\2\u01b9\u01dc\3\2\2\2\u01ba\u01bb\b\b\1\2\u01bb\u01bc\5\32\16\2"+
		"\u01bc\u01bd\b\b\1\2\u01bd\u01be\7\u00cb\2\2\u01be\u01bf\b\b\1\2\u01bf"+
		"\u01dc\3\2\2\2\u01c0\u01c1\b\b\1\2\u01c1\u01c2\5\36\20\2\u01c2\u01c3\b"+
		"\b\1\2\u01c3\u01c4\7\u00cb\2\2\u01c4\u01c5\b\b\1\2\u01c5\u01dc\3\2\2\2"+
		"\u01c6\u01c7\b\b\1\2\u01c7\u01c8\5\u0116\u008c\2\u01c8\u01c9\b\b\1\2\u01c9"+
		"\u01ca\7\u00cb\2\2\u01ca\u01cb\b\b\1\2\u01cb\u01dc\3\2\2\2\u01cc\u01cd"+
		"\b\b\1\2\u01cd\u01ce\5\u015a\u00ae\2\u01ce\u01cf\b\b\1\2\u01cf\u01d0\7"+
		"\u00cb\2\2\u01d0\u01d1\b\b\1\2\u01d1\u01dc\3\2\2\2\u01d2\u01d3\b\b\1\2"+
		"\u01d3\u01d4\b\b\1\2\u01d4\u01d5\7\u00cb\2\2\u01d5\u01dc\b\b\1\2\u01d6"+
		"\u01d7\b\b\1\2\u01d7\u01dc\7\t\2\2\u01d8\u01d9\b\b\1\2\u01d9\u01da\7\n"+
		"\2\2\u01da\u01dc\7\u00e3\2\2\u01db\u01b4\3\2\2\2\u01db\u01ba\3\2\2\2\u01db"+
		"\u01c0\3\2\2\2\u01db\u01c6\3\2\2\2\u01db\u01cc\3\2\2\2\u01db\u01d2\3\2"+
		"\2\2\u01db\u01d6\3\2\2\2\u01db\u01d8\3\2\2\2\u01dc\17\3\2\2\2\u01dd\u01de"+
		"\5\16\b\2\u01de\u01df\7\2\2\3\u01df\21\3\2\2\2\u01e0\u01e1\b\n\1\2\u01e1"+
		"\u01e2\b\n\1\2\u01e2\u01e3\7\u00bd\2\2\u01e3\u01e4\5\26\f\2\u01e4\u01e5"+
		"\b\n\1\2\u01e5\u01e6\7\u00c7\2\2\u01e6\u01e7\5\6\4\2\u01e7\u01e8\b\n\1"+
		"\2\u01e8\u01e9\7\u00c8\2\2\u01e9\u01ea\b\n\1\2\u01ea\u01f1\3\2\2\2\u01eb"+
		"\u01ec\b\n\1\2\u01ec\u01f1\7\13\2\2\u01ed\u01ee\b\n\1\2\u01ee\u01ef\7"+
		"\f\2\2\u01ef\u01f1\7\u00e3\2\2\u01f0\u01e0\3\2\2\2\u01f0\u01eb\3\2\2\2"+
		"\u01f0\u01ed\3\2\2\2\u01f1\23\3\2\2\2\u01f2\u01f3\5\22\n\2\u01f3\u01f4"+
		"\7\2\2\3\u01f4\25\3\2\2\2\u01f5\u01f6\b\f\1\2\u01f6\u01f7\7\u00da\2\2"+
		"\u01f7\u01fe\b\f\1\2\u01f8\u01f9\b\f\1\2\u01f9\u01fe\7\r\2\2\u01fa\u01fb"+
		"\b\f\1\2\u01fb\u01fc\7\16\2\2\u01fc\u01fe\7\u00e3\2\2\u01fd\u01f5\3\2"+
		"\2\2\u01fd\u01f8\3\2\2\2\u01fd\u01fa\3\2\2\2\u01fe\27\3\2\2\2\u01ff\u0200"+
		"\5\26\f\2\u0200\u0201\7\2\2\3\u0201\31\3\2\2\2\u0202\u0203\b\16\1\2\u0203"+
		"\u0204\b\16\1\2\u0204\u0205\7\u00be\2\2\u0205\u0206\5\u014e\u00a8\2\u0206"+
		"\u0207\b\16\1\2\u0207\u021e\3\2\2\2\u0208\u0209\b\16\1\2\u0209\u020a\b"+
		"\16\1\2\u020a\u020b\7\u00be\2\2\u020b\u020c\b\16\1\2\u020c\u020d\7\u00bd"+
		"\2\2\u020d\u020e\5\u014e\u00a8\2\u020e\u020f\b\16\1\2\u020f\u021e\3\2"+
		"\2\2\u0210\u0211\b\16\1\2\u0211\u0212\b\16\1\2\u0212\u0213\7\u00be\2\2"+
		"\u0213\u0214\b\16\1\2\u0214\u0215\7\u00c1\2\2\u0215\u0216\5\u014e\u00a8"+
		"\2\u0216\u0217\b\16\1\2\u0217\u021e\3\2\2\2\u0218\u0219\b\16\1\2\u0219"+
		"\u021e\7\17\2\2\u021a\u021b\b\16\1\2\u021b\u021c\7\20\2\2\u021c\u021e"+
		"\7\u00e3\2\2\u021d\u0202\3\2\2\2\u021d\u0208\3\2\2\2\u021d\u0210\3\2\2"+
		"\2\u021d\u0218\3\2\2\2\u021d\u021a\3\2\2\2\u021e\33\3\2\2\2\u021f\u0220"+
		"\5\32\16\2\u0220\u0221\7\2\2\3\u0221\35\3\2\2\2\u0222\u0223\b\20\1\2\u0223"+
		"\u0224\5\"\22\2\u0224\u0225\5.\30\2\u0225\u0226\b\20\1\2\u0226\u0227\7"+
		"\u00c3\2\2\u0227\u0228\5\66\34\2\u0228\u0229\b\20\1\2\u0229\u0230\3\2"+
		"\2\2\u022a\u022b\b\20\1\2\u022b\u0230\7\21\2\2\u022c\u022d\b\20\1\2\u022d"+
		"\u022e\7\22\2\2\u022e\u0230\7\u00e3\2\2\u022f\u0222\3\2\2\2\u022f\u022a"+
		"\3\2\2\2\u022f\u022c\3\2\2\2\u0230\37\3\2\2\2\u0231\u0232\5\36\20\2\u0232"+
		"\u0233\7\2\2\3\u0233!\3\2\2\2\u0234\u0235\b\22\1\2\u0235\u0237\b\22\1"+
		"\2\u0236\u0238\5&\24\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0241"+
		"\3\2\2\2\u0239\u023f\b\22\1\2\u023a\u023b\b\22\1\2\u023b\u0240\7\23\2"+
		"\2\u023c\u023d\b\22\1\2\u023d\u023e\7\24\2\2\u023e\u0240\7\u00e3\2\2\u023f"+
		"\u023a\3\2\2\2\u023f\u023c\3\2\2\2\u0240\u0242\3\2\2\2\u0241\u0239\3\2"+
		"\2\2\u0241\u0242\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\b\22\1\2\u0244"+
		"\u024b\b\22\1\2\u0245\u0246\b\22\1\2\u0246\u024b\7\23\2\2\u0247\u0248"+
		"\b\22\1\2\u0248\u0249\7\24\2\2\u0249\u024b\7\u00e3\2\2\u024a\u0234\3\2"+
		"\2\2\u024a\u0245\3\2\2\2\u024a\u0247\3\2\2\2\u024b#\3\2\2\2\u024c\u024d"+
		"\5\"\22\2\u024d\u024e\7\2\2\3\u024e%\3\2\2\2\u024f\u0250\b\24\1\2\u0250"+
		"\u0251\5\u014e\u00a8\2\u0251\u0252\5*\26\2\u0252\u0253\b\24\1\2\u0253"+
		"\u0254\7\u00c2\2\2\u0254\u0255\b\24\1\2\u0255\u0260\3\2\2\2\u0256\u0257"+
		"\b\24\1\2\u0257\u0258\5:\36\2\u0258\u0259\b\24\1\2\u0259\u0260\3\2\2\2"+
		"\u025a\u025b\b\24\1\2\u025b\u0260\7\25\2\2\u025c\u025d\b\24\1\2\u025d"+
		"\u025e\7\26\2\2\u025e\u0260\7\u00e3\2\2\u025f\u024f\3\2\2\2\u025f\u0256"+
		"\3\2\2\2\u025f\u025a\3\2\2\2\u025f\u025c\3\2\2\2\u0260\'\3\2\2\2\u0261"+
		"\u0262\5&\24\2\u0262\u0263\7\2\2\3\u0263)\3\2\2\2\u0264\u0265\b\26\1\2"+
		"\u0265\u0267\b\26\1\2\u0266\u0268\5b\62\2\u0267\u0266\3\2\2\2\u0267\u0268"+
		"\3\2\2\2\u0268\u0271\3\2\2\2\u0269\u026f\b\26\1\2\u026a\u026b\b\26\1\2"+
		"\u026b\u0270\7\27\2\2\u026c\u026d\b\26\1\2\u026d\u026e\7\30\2\2\u026e"+
		"\u0270\7\u00e3\2\2\u026f\u026a\3\2\2\2\u026f\u026c\3\2\2\2\u0270\u0272"+
		"\3\2\2\2\u0271\u0269\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273"+
		"\u0274\b\26\1\2\u0274\u027b\b\26\1\2\u0275\u0276\b\26\1\2\u0276\u027b"+
		"\7\27\2\2\u0277\u0278\b\26\1\2\u0278\u0279\7\30\2\2\u0279\u027b\7\u00e3"+
		"\2\2\u027a\u0264\3\2\2\2\u027a\u0275\3\2\2\2\u027a\u0277\3\2\2\2\u027b"+
		"+\3\2\2\2\u027c\u027d\5*\26\2\u027d\u027e\7\2\2\3\u027e-\3\2\2\2\u027f"+
		"\u0280\b\30\1\2\u0280\u0281\5\62\32\2\u0281\u0282\5\u014e\u00a8\2\u0282"+
		"\u0283\5*\26\2\u0283\u0284\b\30\1\2\u0284\u028b\3\2\2\2\u0285\u0286\b"+
		"\30\1\2\u0286\u028b\7\31\2\2\u0287\u0288\b\30\1\2\u0288\u0289\7\32\2\2"+
		"\u0289\u028b\7\u00e3\2\2\u028a\u027f\3\2\2\2\u028a\u0285\3\2\2\2\u028a"+
		"\u0287\3\2\2\2\u028b/\3\2\2\2\u028c\u028d\5.\30\2\u028d\u028e\7\2\2\3"+
		"\u028e\61\3\2\2\2\u028f\u0290\b\32\1\2\u0290\u0292\b\32\1\2\u0291\u0293"+
		"\5\u00fe\u0080\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u029c\3"+
		"\2\2\2\u0294\u029a\b\32\1\2\u0295\u0296\b\32\1\2\u0296\u029b\7\33\2\2"+
		"\u0297\u0298\b\32\1\2\u0298\u0299\7\34\2\2\u0299\u029b\7\u00e3\2\2\u029a"+
		"\u0295\3\2\2\2\u029a\u0297\3\2\2\2\u029b\u029d\3\2\2\2\u029c\u0294\3\2"+
		"\2\2\u029c\u029d\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\b\32\1\2\u029f"+
		"\u02a6\b\32\1\2\u02a0\u02a1\b\32\1\2\u02a1\u02a6\7\33\2\2\u02a2\u02a3"+
		"\b\32\1\2\u02a3\u02a4\7\34\2\2\u02a4\u02a6\7\u00e3\2\2\u02a5\u028f\3\2"+
		"\2\2\u02a5\u02a0\3\2\2\2\u02a5\u02a2\3\2\2\2\u02a6\63\3\2\2\2\u02a7\u02a8"+
		"\5\62\32\2\u02a8\u02a9\7\2\2\3\u02a9\65\3\2\2\2\u02aa\u02ab\b\34\1\2\u02ab"+
		"\u02ac\5J&\2\u02ac\u02ad\b\34\1\2\u02ad\u02b4\3\2\2\2\u02ae\u02af\b\34"+
		"\1\2\u02af\u02b4\7\35\2\2\u02b0\u02b1\b\34\1\2\u02b1\u02b2\7\36\2\2\u02b2"+
		"\u02b4\7\u00e3\2\2\u02b3\u02aa\3\2\2\2\u02b3\u02ae\3\2\2\2\u02b3\u02b0"+
		"\3\2\2\2\u02b4\67\3\2\2\2\u02b5\u02b6\5\66\34\2\u02b6\u02b7\7\2\2\3\u02b7"+
		"9\3\2\2\2\u02b8\u02b9\b\36\1\2\u02b9\u02ba\5> \2\u02ba\u02bb\b\36\1\2"+
		"\u02bb\u02c2\3\2\2\2\u02bc\u02bd\b\36\1\2\u02bd\u02c2\7\37\2\2\u02be\u02bf"+
		"\b\36\1\2\u02bf\u02c0\7 \2\2\u02c0\u02c2\7\u00e3\2\2\u02c1\u02b8\3\2\2"+
		"\2\u02c1\u02bc\3\2\2\2\u02c1\u02be\3\2\2\2\u02c2;\3\2\2\2\u02c3\u02c4"+
		"\5:\36\2\u02c4\u02c5\7\2\2\3\u02c5=\3\2\2\2\u02c6\u02c7\b \1\2\u02c7\u02c9"+
		"\b \1\2\u02c8\u02ca\5B\"\2\u02c9\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb"+
		"\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02d5\3\2\2\2\u02cd\u02d3\b "+
		"\1\2\u02ce\u02cf\b \1\2\u02cf\u02d4\7!\2\2\u02d0\u02d1\b \1\2\u02d1\u02d2"+
		"\7\"\2\2\u02d2\u02d4\7\u00e3\2\2\u02d3\u02ce\3\2\2\2\u02d3\u02d0\3\2\2"+
		"\2\u02d4\u02d6\3\2\2\2\u02d5\u02cd\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d7"+
		"\3\2\2\2\u02d7\u02d8\b \1\2\u02d8\u02d9\b \1\2\u02d9\u02e0\3\2\2\2\u02da"+
		"\u02db\b \1\2\u02db\u02e0\7!\2\2\u02dc\u02dd\b \1\2\u02dd\u02de\7\"\2"+
		"\2\u02de\u02e0\7\u00e3\2\2\u02df\u02c6\3\2\2\2\u02df\u02da\3\2\2\2\u02df"+
		"\u02dc\3\2\2\2\u02e0?\3\2\2\2\u02e1\u02e5\5> \2\u02e2\u02e3\b!\1\2\u02e3"+
		"\u02e5\b!\1\2\u02e4\u02e1\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e5\u02e6\3\2"+
		"\2\2\u02e6\u02e7\7\2\2\3\u02e7A\3\2\2\2\u02e8\u02e9\b\"\1\2\u02e9\u02ea"+
		"\b\"\1\2\u02ea\u02eb\7\u00d4\2\2\u02eb\u02ec\5\u014e\u00a8\2\u02ec\u02ed"+
		"\5*\26\2\u02ed\u02ee\b\"\1\2\u02ee\u02f5\3\2\2\2\u02ef\u02f0\b\"\1\2\u02f0"+
		"\u02f5\7#\2\2\u02f1\u02f2\b\"\1\2\u02f2\u02f3\7$\2\2\u02f3\u02f5\7\u00e3"+
		"\2\2\u02f4\u02e8\3\2\2\2\u02f4\u02ef\3\2\2\2\u02f4\u02f1\3\2\2\2\u02f5"+
		"C\3\2\2\2\u02f6\u02f7\5B\"\2\u02f7\u02f8\7\2\2\3\u02f8E\3\2\2\2\u02f9"+
		"\u02fa\b$\1\2\u02fa\u02fb\5J&\2\u02fb\u02fc\b$\1\2\u02fc\u0307\3\2\2\2"+
		"\u02fd\u02fe\b$\1\2\u02fe\u02ff\5Z.\2\u02ff\u0300\b$\1\2\u0300\u0307\3"+
		"\2\2\2\u0301\u0302\b$\1\2\u0302\u0307\7%\2\2\u0303\u0304\b$\1\2\u0304"+
		"\u0305\7&\2\2\u0305\u0307\7\u00e3\2\2\u0306\u02f9\3\2\2\2\u0306\u02fd"+
		"\3\2\2\2\u0306\u0301\3\2\2\2\u0306\u0303\3\2\2\2\u0307G\3\2\2\2\u0308"+
		"\u0309\5F$\2\u0309\u030a\7\2\2\3\u030aI\3\2\2\2\u030b\u030c\b&\1\2\u030c"+
		"\u030d\5N(\2\u030d\u030e\5\62\32\2\u030e\u030f\5\u014e\u00a8\2\u030f\u0310"+
		"\5*\26\2\u0310\u0311\b&\1\2\u0311\u0346\3\2\2\2\u0312\u0313\b&\1\2\u0313"+
		"\u0314\5N(\2\u0314\u0315\5\62\32\2\u0315\u0316\5\u014e\u00a8\2\u0316\u0317"+
		"\5F$\2\u0317\u0318\b&\1\2\u0318\u0346\3\2\2\2\u0319\u031a\b&\1\2\u031a"+
		"\u031b\5N(\2\u031b\u031c\5\62\32\2\u031c\u031d\5\u00b6\\\2\u031d\u031e"+
		"\b&\1\2\u031e\u0346\3\2\2\2\u031f\u0320\b&\1\2\u0320\u0321\5N(\2\u0321"+
		"\u0322\5\u0082B\2\u0322\u0323\b&\1\2\u0323\u0346\3\2\2\2\u0324\u0325\b"+
		"&\1\2\u0325\u0326\5N(\2\u0326\u0327\5\u009aN\2\u0327\u0328\b&\1\2\u0328"+
		"\u0346\3\2\2\2\u0329\u032a\b&\1\2\u032a\u032b\5N(\2\u032b\u032c\5\u00fe"+
		"\u0080\2\u032c\u032d\b&\1\2\u032d\u0346\3\2\2\2\u032e\u032f\b&\1\2\u032f"+
		"\u0330\5N(\2\u0330\u0331\5\62\32\2\u0331\u0332\5R*\2\u0332\u0333\5V,\2"+
		"\u0333\u0334\b&\1\2\u0334\u0346\3\2\2\2\u0335\u0336\b&\1\2\u0336\u0337"+
		"\5N(\2\u0337\u0338\5\u00caf\2\u0338\u0339\b&\1\2\u0339\u0346\3\2\2\2\u033a"+
		"\u033b\b&\1\2\u033b\u033c\5N(\2\u033c\u033d\5\62\32\2\u033d\u033e\5\u0112"+
		"\u008a\2\u033e\u033f\b&\1\2\u033f\u0346\3\2\2\2\u0340\u0341\b&\1\2\u0341"+
		"\u0346\7\'\2\2\u0342\u0343\b&\1\2\u0343\u0344\7(\2\2\u0344\u0346\7\u00e3"+
		"\2\2\u0345\u030b\3\2\2\2\u0345\u0312\3\2\2\2\u0345\u0319\3\2\2\2\u0345"+
		"\u031f\3\2\2\2\u0345\u0324\3\2\2\2\u0345\u0329\3\2\2\2\u0345\u032e\3\2"+
		"\2\2\u0345\u0335\3\2\2\2\u0345\u033a\3\2\2\2\u0345\u0340\3\2\2\2\u0345"+
		"\u0342\3\2\2\2\u0346K\3\2\2\2\u0347\u0348\5J&\2\u0348\u0349\7\2\2\3\u0349"+
		"M\3\2\2\2\u034a\u034b\b(\1\2\u034b\u034d\b(\1\2\u034c\u034e\5:\36\2\u034d"+
		"\u034c\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u0357\3\2\2\2\u034f\u0355\b("+
		"\1\2\u0350\u0351\b(\1\2\u0351\u0356\7)\2\2\u0352\u0353\b(\1\2\u0353\u0354"+
		"\7*\2\2\u0354\u0356\7\u00e3\2\2\u0355\u0350\3\2\2\2\u0355\u0352\3\2\2"+
		"\2\u0356\u0358\3\2\2\2\u0357\u034f\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0359"+
		"\3\2\2\2\u0359\u035a\b(\1\2\u035a\u0361\b(\1\2\u035b\u035c\b(\1\2\u035c"+
		"\u0361\7)\2\2\u035d\u035e\b(\1\2\u035e\u035f\7*\2\2\u035f\u0361\7\u00e3"+
		"\2\2\u0360\u034a\3\2\2\2\u0360\u035b\3\2\2\2\u0360\u035d\3\2\2\2\u0361"+
		"O\3\2\2\2\u0362\u0363\5N(\2\u0363\u0364\7\2\2\3\u0364Q\3\2\2\2\u0365\u0366"+
		"\b*\1\2\u0366\u0367\7\u00dc\2\2\u0367\u036e\b*\1\2\u0368\u0369\b*\1\2"+
		"\u0369\u036e\7+\2\2\u036a\u036b\b*\1\2\u036b\u036c\7,\2\2\u036c\u036e"+
		"\7\u00e3\2\2\u036d\u0365\3\2\2\2\u036d\u0368\3\2\2\2\u036d\u036a\3\2\2"+
		"\2\u036eS\3\2\2\2\u036f\u0370\5R*\2\u0370\u0371\7\2\2\3\u0371U\3\2\2\2"+
		"\u0372\u0373\b,\1\2\u0373\u0375\b,\1\2\u0374\u0376\5r:\2\u0375\u0374\3"+
		"\2\2\2\u0375\u0376\3\2\2\2\u0376\u037f\3\2\2\2\u0377\u037d\b,\1\2\u0378"+
		"\u0379\b,\1\2\u0379\u037e\7-\2\2\u037a\u037b\b,\1\2\u037b\u037c\7.\2\2"+
		"\u037c\u037e\7\u00e3\2\2\u037d\u0378\3\2\2\2\u037d\u037a\3\2\2\2\u037e"+
		"\u0380\3\2\2\2\u037f\u0377\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\3\2"+
		"\2\2\u0381\u0382\b,\1\2\u0382\u0389\b,\1\2\u0383\u0384\b,\1\2\u0384\u0389"+
		"\7-\2\2\u0385\u0386\b,\1\2\u0386\u0387\7.\2\2\u0387\u0389\7\u00e3\2\2"+
		"\u0388\u0372\3\2\2\2\u0388\u0383\3\2\2\2\u0388\u0385\3\2\2\2\u0389W\3"+
		"\2\2\2\u038a\u038b\5V,\2\u038b\u038c\7\2\2\3\u038cY\3\2\2\2\u038d\u038e"+
		"\b.\1\2\u038e\u038f\5\u00c2b\2\u038f\u0390\5^\60\2\u0390\u0391\b.\1\2"+
		"\u0391\u0398\3\2\2\2\u0392\u0393\b.\1\2\u0393\u0398\7/\2\2\u0394\u0395"+
		"\b.\1\2\u0395\u0396\7\60\2\2\u0396\u0398\7\u00e3\2\2\u0397\u038d\3\2\2"+
		"\2\u0397\u0392\3\2\2\2\u0397\u0394\3\2\2\2\u0398[\3\2\2\2\u0399\u039a"+
		"\5Z.\2\u039a\u039b\7\2\2\3\u039b]\3\2\2\2\u039c\u039d\b\60\1\2\u039d\u039e"+
		"\5\u00c2b\2\u039e\u039f\5^\60\2\u039f\u03a0\b\60\1\2\u03a0\u03ad\3\2\2"+
		"\2\u03a1\u03a2\b\60\1\2\u03a2\u03a3\b\60\1\2\u03a3\u03a4\7\u00cf\2\2\u03a4"+
		"\u03a5\5J&\2\u03a5\u03a6\b\60\1\2\u03a6\u03ad\3\2\2\2\u03a7\u03a8\b\60"+
		"\1\2\u03a8\u03ad\7\61\2\2\u03a9\u03aa\b\60\1\2\u03aa\u03ab\7\62\2\2\u03ab"+
		"\u03ad\7\u00e3\2\2\u03ac\u039c\3\2\2\2\u03ac\u03a1\3\2\2\2\u03ac\u03a7"+
		"\3\2\2\2\u03ac\u03a9\3\2\2\2\u03ad_\3\2\2\2\u03ae\u03af\5^\60\2\u03af"+
		"\u03b0\7\2\2\3\u03b0a\3\2\2\2\u03b1\u03b2\b\62\1\2\u03b2\u03b3\b\62\1"+
		"\2\u03b3\u03b4\7\u00c9\2\2\u03b4\u03b5\5f\64\2\u03b5\u03b6\b\62\1\2\u03b6"+
		"\u03b7\7\u00ca\2\2\u03b7\u03b8\b\62\1\2\u03b8\u03bf\3\2\2\2\u03b9\u03ba"+
		"\b\62\1\2\u03ba\u03bf\7\63\2\2\u03bb\u03bc\b\62\1\2\u03bc\u03bd\7\64\2"+
		"\2\u03bd\u03bf\7\u00e3\2\2\u03be\u03b1\3\2\2\2\u03be\u03b9\3\2\2\2\u03be"+
		"\u03bb\3\2\2\2\u03bfc\3\2\2\2\u03c0\u03c1\5b\62\2\u03c1\u03c2\7\2\2\3"+
		"\u03c2e\3\2\2\2\u03c3\u03c4\b\64\1\2\u03c4\u03c6\b\64\1\2\u03c5\u03c7"+
		"\5j\66\2\u03c6\u03c5\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03d0\3\2\2\2\u03c8"+
		"\u03ce\b\64\1\2\u03c9\u03ca\b\64\1\2\u03ca\u03cf\7\65\2\2\u03cb\u03cc"+
		"\b\64\1\2\u03cc\u03cd\7\66\2\2\u03cd\u03cf\7\u00e3\2\2\u03ce\u03c9\3\2"+
		"\2\2\u03ce\u03cb\3\2\2\2\u03cf\u03d1\3\2\2\2\u03d0\u03c8\3\2\2\2\u03d0"+
		"\u03d1\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3\b\64\1\2\u03d3\u03da\b"+
		"\64\1\2\u03d4\u03d5\b\64\1\2\u03d5\u03da\7\65\2\2\u03d6\u03d7\b\64\1\2"+
		"\u03d7\u03d8\7\66\2\2\u03d8\u03da\7\u00e3\2\2\u03d9\u03c3\3\2\2\2\u03d9"+
		"\u03d4\3\2\2\2\u03d9\u03d6\3\2\2\2\u03dag\3\2\2\2\u03db\u03dc\5f\64\2"+
		"\u03dc\u03dd\7\2\2\3\u03ddi\3\2\2\2\u03de\u03df\b\66\1\2\u03df\u03e0\5"+
		"n8\2\u03e0\u03e1\b\66\1\2\u03e1\u03e8\3\2\2\2\u03e2\u03e3\b\66\1\2\u03e3"+
		"\u03e8\7\67\2\2\u03e4\u03e5\b\66\1\2\u03e5\u03e6\78\2\2\u03e6\u03e8\7"+
		"\u00e3\2\2\u03e7\u03de\3\2\2\2\u03e7\u03e2\3\2\2\2\u03e7\u03e4\3\2\2\2"+
		"\u03e8k\3\2\2\2\u03e9\u03ea\5j\66\2\u03ea\u03eb\7\2\2\3\u03ebm\3\2\2\2"+
		"\u03ec\u03ed\b8\1\2\u03ed\u03ee\b8\1\2\u03ee\u03f4\5F$\2\u03ef\u03f0\b"+
		"8\1\2\u03f0\u03f1\7\u00cc\2\2\u03f1\u03f3\5F$\2\u03f2\u03ef\3\2\2\2\u03f3"+
		"\u03f6\3\2\2\2\u03f4\u03f2\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03ff\3\2"+
		"\2\2\u03f6\u03f4\3\2\2\2\u03f7\u03fd\b8\1\2\u03f8\u03f9\b8\1\2\u03f9\u03fe"+
		"\79\2\2\u03fa\u03fb\b8\1\2\u03fb\u03fc\7:\2\2\u03fc\u03fe\7\u00e3\2\2"+
		"\u03fd\u03f8\3\2\2\2\u03fd\u03fa\3\2\2\2\u03fe\u0400\3\2\2\2\u03ff\u03f7"+
		"\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0402\b8\1\2\u0402"+
		"\u0403\b8\1\2\u0403\u040a\3\2\2\2\u0404\u0405\b8\1\2\u0405\u040a\79\2"+
		"\2\u0406\u0407\b8\1\2\u0407\u0408\7:\2\2\u0408\u040a\7\u00e3\2\2\u0409"+
		"\u03ec\3\2\2\2\u0409\u0404\3\2\2\2\u0409\u0406\3\2\2\2\u040ao\3\2\2\2"+
		"\u040b\u040f\5n8\2\u040c\u040d\b9\1\2\u040d\u040f\b9\1\2\u040e\u040b\3"+
		"\2\2\2\u040e\u040c\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0411\7\2\2\3\u0411"+
		"q\3\2\2\2\u0412\u0413\b:\1\2\u0413\u0414\b:\1\2\u0414\u0415\7\u00c9\2"+
		"\2\u0415\u0416\5v<\2\u0416\u0417\b:\1\2\u0417\u0418\7\u00ca\2\2\u0418"+
		"\u0419\b:\1\2\u0419\u0420\3\2\2\2\u041a\u041b\b:\1\2\u041b\u0420\7;\2"+
		"\2\u041c\u041d\b:\1\2\u041d\u041e\7<\2\2\u041e\u0420\7\u00e3\2\2\u041f"+
		"\u0412\3\2\2\2\u041f\u041a\3\2\2\2\u041f\u041c\3\2\2\2\u0420s\3\2\2\2"+
		"\u0421\u0422\5r:\2\u0422\u0423\7\2\2\3\u0423u\3\2\2\2\u0424\u0425\b<\1"+
		"\2\u0425\u0427\b<\1\2\u0426\u0428\5z>\2\u0427\u0426\3\2\2\2\u0427\u0428"+
		"\3\2\2\2\u0428\u0431\3\2\2\2\u0429\u042f\b<\1\2\u042a\u042b\b<\1\2\u042b"+
		"\u0430\7=\2\2\u042c\u042d\b<\1\2\u042d\u042e\7>\2\2\u042e\u0430\7\u00e3"+
		"\2\2\u042f\u042a\3\2\2\2\u042f\u042c\3\2\2\2\u0430\u0432\3\2\2\2\u0431"+
		"\u0429\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u0434\b<"+
		"\1\2\u0434\u043b\b<\1\2\u0435\u0436\b<\1\2\u0436\u043b\7=\2\2\u0437\u0438"+
		"\b<\1\2\u0438\u0439\7>\2\2\u0439\u043b\7\u00e3\2\2\u043a\u0424\3\2\2\2"+
		"\u043a\u0435\3\2\2\2\u043a\u0437\3\2\2\2\u043bw\3\2\2\2\u043c\u043d\5"+
		"v<\2\u043d\u043e\7\2\2\3\u043ey\3\2\2\2\u043f\u0440\b>\1\2\u0440\u0441"+
		"\5~@\2\u0441\u0442\b>\1\2\u0442\u0449\3\2\2\2\u0443\u0444\b>\1\2\u0444"+
		"\u0449\7?\2\2\u0445\u0446\b>\1\2\u0446\u0447\7@\2\2\u0447\u0449\7\u00e3"+
		"\2\2\u0448\u043f\3\2\2\2\u0448\u0443\3\2\2\2\u0448\u0445\3\2\2\2\u0449"+
		"{\3\2\2\2\u044a\u044b\5z>\2\u044b\u044c\7\2\2\3\u044c}\3\2\2\2\u044d\u044e"+
		"\b@\1\2\u044e\u044f\b@\1\2\u044f\u0455\5J&\2\u0450\u0451\b@\1\2\u0451"+
		"\u0452\7\u00cc\2\2\u0452\u0454\5J&\2\u0453\u0450\3\2\2\2\u0454\u0457\3"+
		"\2\2\2\u0455\u0453\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0460\3\2\2\2\u0457"+
		"\u0455\3\2\2\2\u0458\u045e\b@\1\2\u0459\u045a\b@\1\2\u045a\u045f\7A\2"+
		"\2\u045b\u045c\b@\1\2\u045c\u045d\7B\2\2\u045d\u045f\7\u00e3\2\2\u045e"+
		"\u0459\3\2\2\2\u045e\u045b\3\2\2\2\u045f\u0461\3\2\2\2\u0460\u0458\3\2"+
		"\2\2\u0460\u0461\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0463\b@\1\2\u0463"+
		"\u0464\b@\1\2\u0464\u046b\3\2\2\2\u0465\u0466\b@\1\2\u0466\u046b\7A\2"+
		"\2\u0467\u0468\b@\1\2\u0468\u0469\7B\2\2\u0469\u046b\7\u00e3\2\2\u046a"+
		"\u044d\3\2\2\2\u046a\u0465\3\2\2\2\u046a\u0467\3\2\2\2\u046b\177\3\2\2"+
		"\2\u046c\u0470\5~@\2\u046d\u046e\bA\1\2\u046e\u0470\bA\1\2\u046f\u046c"+
		"\3\2\2\2\u046f\u046d\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0472\7\2\2\3\u0472"+
		"\u0081\3\2\2\2\u0473\u0474\bB\1\2\u0474\u0475\bB\1\2\u0475\u0476\7\u00c5"+
		"\2\2\u0476\u0477\5\u0086D\2\u0477\u0478\bB\1\2\u0478\u0479\7\u00c6\2\2"+
		"\u0479\u047a\bB\1\2\u047a\u0481\3\2\2\2\u047b\u047c\bB\1\2\u047c\u0481"+
		"\7C\2\2\u047d\u047e\bB\1\2\u047e\u047f\7D\2\2\u047f\u0481\7\u00e3\2\2"+
		"\u0480\u0473\3\2\2\2\u0480\u047b\3\2\2\2\u0480\u047d\3\2\2\2\u0481\u0083"+
		"\3\2\2\2\u0482\u0483\5\u0082B\2\u0483\u0484\7\2\2\3\u0484\u0085\3\2\2"+
		"\2\u0485\u0486\bD\1\2\u0486\u0488\bD\1\2\u0487\u0489\5\u008aF\2\u0488"+
		"\u0487\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u0492\3\2\2\2\u048a\u0490\bD"+
		"\1\2\u048b\u048c\bD\1\2\u048c\u0491\7E\2\2\u048d\u048e\bD\1\2\u048e\u048f"+
		"\7F\2\2\u048f\u0491\7\u00e3\2\2\u0490\u048b\3\2\2\2\u0490\u048d\3\2\2"+
		"\2\u0491\u0493\3\2\2\2\u0492\u048a\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0494"+
		"\3\2\2\2\u0494\u0495\bD\1\2\u0495\u049c\bD\1\2\u0496\u0497\bD\1\2\u0497"+
		"\u049c\7E\2\2\u0498\u0499\bD\1\2\u0499\u049a\7F\2\2\u049a\u049c\7\u00e3"+
		"\2\2\u049b\u0485\3\2\2\2\u049b\u0496\3\2\2\2\u049b\u0498\3\2\2\2\u049c"+
		"\u0087\3\2\2\2\u049d\u049e\5\u0086D\2\u049e\u049f\7\2\2\3\u049f\u0089"+
		"\3\2\2\2\u04a0\u04a1\bF\1\2\u04a1\u04a2\5\u008eH\2\u04a2\u04a3\5\u0092"+
		"J\2\u04a3\u04a4\bF\1\2\u04a4\u04ab\3\2\2\2\u04a5\u04a6\bF\1\2\u04a6\u04ab"+
		"\7G\2\2\u04a7\u04a8\bF\1\2\u04a8\u04a9\7H\2\2\u04a9\u04ab\7\u00e3\2\2"+
		"\u04aa\u04a0\3\2\2\2\u04aa\u04a5\3\2\2\2\u04aa\u04a7\3\2\2\2\u04ab\u008b"+
		"\3\2\2\2\u04ac\u04ad\5\u008aF\2\u04ad\u04ae\7\2\2\3\u04ae\u008d\3\2\2"+
		"\2\u04af\u04b0\bH\1\2\u04b0\u04b1\bH\1\2\u04b1\u04b7\5\u0096L\2\u04b2"+
		"\u04b3\bH\1\2\u04b3\u04b4\7\u00cb\2\2\u04b4\u04b6\5\u0096L\2\u04b5\u04b2"+
		"\3\2\2\2\u04b6\u04b9\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8"+
		"\u04c2\3\2\2\2\u04b9\u04b7\3\2\2\2\u04ba\u04c0\bH\1\2\u04bb\u04bc\bH\1"+
		"\2\u04bc\u04c1\7I\2\2\u04bd\u04be\bH\1\2\u04be\u04bf\7J\2\2\u04bf\u04c1"+
		"\7\u00e3\2\2\u04c0\u04bb\3\2\2\2\u04c0\u04bd\3\2\2\2\u04c1\u04c3\3\2\2"+
		"\2\u04c2\u04ba\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c5"+
		"\bH\1\2\u04c5\u04c6\bH\1\2\u04c6\u04cd\3\2\2\2\u04c7\u04c8\bH\1\2\u04c8"+
		"\u04cd\7I\2\2\u04c9\u04ca\bH\1\2\u04ca\u04cb\7J\2\2\u04cb\u04cd\7\u00e3"+
		"\2\2\u04cc\u04af\3\2\2\2\u04cc\u04c7\3\2\2\2\u04cc\u04c9\3\2\2\2\u04cd"+
		"\u008f\3\2\2\2\u04ce\u04d2\5\u008eH\2\u04cf\u04d0\bI\1\2\u04d0\u04d2\b"+
		"I\1\2\u04d1\u04ce\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3"+
		"\u04d4\7\2\2\3\u04d4\u0091\3\2\2\2\u04d5\u04d6\bJ\1\2\u04d6\u04d8\bJ\1"+
		"\2\u04d7\u04d9\7\u00cb\2\2\u04d8\u04d7\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9"+
		"\u04e2\3\2\2\2\u04da\u04e0\bJ\1\2\u04db\u04dc\bJ\1\2\u04dc\u04e1\7K\2"+
		"\2\u04dd\u04de\bJ\1\2\u04de\u04df\7L\2\2\u04df\u04e1\7\u00e3\2\2\u04e0"+
		"\u04db\3\2\2\2\u04e0\u04dd\3\2\2\2\u04e1\u04e3\3\2\2\2\u04e2\u04da\3\2"+
		"\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5\bJ\1\2\u04e5"+
		"\u04ec\bJ\1\2\u04e6\u04e7\bJ\1\2\u04e7\u04ec\7K\2\2\u04e8\u04e9\bJ\1\2"+
		"\u04e9\u04ea\7L\2\2\u04ea\u04ec\7\u00e3\2\2\u04eb\u04d5\3\2\2\2\u04eb"+
		"\u04e6\3\2\2\2\u04eb\u04e8\3\2\2\2\u04ec\u0093\3\2\2\2\u04ed\u04ee\5\u0092"+
		"J\2\u04ee\u04ef\7\2\2\3\u04ef\u0095\3\2\2\2\u04f0\u04f1\bL\1\2\u04f1\u04f2"+
		"\5F$\2\u04f2\u04f3\bL\1\2\u04f3\u04fa\3\2\2\2\u04f4\u04f5\bL\1\2\u04f5"+
		"\u04fa\7M\2\2\u04f6\u04f7\bL\1\2\u04f7\u04f8\7N\2\2\u04f8\u04fa\7\u00e3"+
		"\2\2\u04f9\u04f0\3\2\2\2\u04f9\u04f4\3\2\2\2\u04f9\u04f6\3\2\2\2\u04fa"+
		"\u0097\3\2\2\2\u04fb\u04fc\5\u0096L\2\u04fc\u04fd\7\2\2\3\u04fd\u0099"+
		"\3\2\2\2\u04fe\u04ff\bN\1\2\u04ff\u0500\5\u009eP\2\u0500\u0501\5\u00a2"+
		"R\2\u0501\u0502\5\u009eP\2\u0502\u0503\5\u00a6T\2\u0503\u0504\5\u00aa"+
		"V\2\u0504\u0505\bN\1\2\u0505\u050c\3\2\2\2\u0506\u0507\bN\1\2\u0507\u050c"+
		"\7O\2\2\u0508\u0509\bN\1\2\u0509\u050a\7P\2\2\u050a\u050c\7\u00e3\2\2"+
		"\u050b\u04fe\3\2\2\2\u050b\u0506\3\2\2\2\u050b\u0508\3\2\2\2\u050c\u009b"+
		"\3\2\2\2\u050d\u050e\5\u009aN\2\u050e\u050f\7\2\2\3\u050f\u009d\3\2\2"+
		"\2\u0510\u0511\bP\1\2\u0511\u0513\bP\1\2\u0512\u0514\5\u00aeX\2\u0513"+
		"\u0512\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u051d\3\2\2\2\u0515\u051b\bP"+
		"\1\2\u0516\u0517\bP\1\2\u0517\u051c\7Q\2\2\u0518\u0519\bP\1\2\u0519\u051a"+
		"\7R\2\2\u051a\u051c\7\u00e3\2\2\u051b\u0516\3\2\2\2\u051b\u0518\3\2\2"+
		"\2\u051c\u051e\3\2\2\2\u051d\u0515\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u051f"+
		"\3\2\2\2\u051f\u0520\bP\1\2\u0520\u0527\bP\1\2\u0521\u0522\bP\1\2\u0522"+
		"\u0527\7Q\2\2\u0523\u0524\bP\1\2\u0524\u0525\7R\2\2\u0525\u0527\7\u00e3"+
		"\2\2\u0526\u0510\3\2\2\2\u0526\u0521\3\2\2\2\u0526\u0523\3\2\2\2\u0527"+
		"\u009f\3\2\2\2\u0528\u0529\5\u009eP\2\u0529\u052a\7\2\2\3\u052a\u00a1"+
		"\3\2\2\2\u052b\u052c\bR\1\2\u052c\u052d\7\u00db\2\2\u052d\u0534\bR\1\2"+
		"\u052e\u052f\bR\1\2\u052f\u0534\7S\2\2\u0530\u0531\bR\1\2\u0531\u0532"+
		"\7T\2\2\u0532\u0534\7\u00e3\2\2\u0533\u052b\3\2\2\2\u0533\u052e\3\2\2"+
		"\2\u0533\u0530\3\2\2\2\u0534\u00a3\3\2\2\2\u0535\u0536\5\u00a2R\2\u0536"+
		"\u0537\7\2\2\3\u0537\u00a5\3\2\2\2\u0538\u0539\bT\1\2\u0539\u053b\bT\1"+
		"\2\u053a\u053c\5\u00b2Z\2\u053b\u053a\3\2\2\2\u053b\u053c\3\2\2\2\u053c"+
		"\u0545\3\2\2\2\u053d\u0543\bT\1\2\u053e\u053f\bT\1\2\u053f\u0544\7U\2"+
		"\2\u0540\u0541\bT\1\2\u0541\u0542\7V\2\2\u0542\u0544\7\u00e3\2\2\u0543"+
		"\u053e\3\2\2\2\u0543\u0540\3\2\2\2\u0544\u0546\3\2\2\2\u0545\u053d\3\2"+
		"\2\2\u0545\u0546\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u0548\bT\1\2\u0548"+
		"\u054f\bT\1\2\u0549\u054a\bT\1\2\u054a\u054f\7U\2\2\u054b\u054c\bT\1\2"+
		"\u054c\u054d\7V\2\2\u054d\u054f\7\u00e3\2\2\u054e\u0538\3\2\2\2\u054e"+
		"\u0549\3\2\2\2\u054e\u054b\3\2\2\2\u054f\u00a7\3\2\2\2\u0550\u0551\5\u00a6"+
		"T\2\u0551\u0552\7\2\2\3\u0552\u00a9\3\2\2\2\u0553\u0554\bV\1\2\u0554\u0556"+
		"\bV\1\2\u0555\u0557\5\u00c6d\2\u0556\u0555\3\2\2\2\u0556\u0557\3\2\2\2"+
		"\u0557\u0560\3\2\2\2\u0558\u055e\bV\1\2\u0559\u055a\bV\1\2\u055a\u055f"+
		"\7W\2\2\u055b\u055c\bV\1\2\u055c\u055d\7X\2\2\u055d\u055f\7\u00e3\2\2"+
		"\u055e\u0559\3\2\2\2\u055e\u055b\3\2\2\2\u055f\u0561\3\2\2\2\u0560\u0558"+
		"\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0563\bV\1\2\u0563"+
		"\u056a\bV\1\2\u0564\u0565\bV\1\2\u0565\u056a\7W\2\2\u0566\u0567\bV\1\2"+
		"\u0567\u0568\7X\2\2\u0568\u056a\7\u00e3\2\2\u0569\u0553\3\2\2\2\u0569"+
		"\u0564\3\2\2\2\u0569\u0566\3\2\2\2\u056a\u00ab\3\2\2\2\u056b\u056c\5\u00aa"+
		"V\2\u056c\u056d\7\2\2\3\u056d\u00ad\3\2\2\2\u056e\u056f\bX\1\2\u056f\u0570"+
		"\bX\1\2\u0570\u0571\7\u00d1\2\2\u0571\u0578\bX\1\2\u0572\u0573\bX\1\2"+
		"\u0573\u0578\7Y\2\2\u0574\u0575\bX\1\2\u0575\u0576\7Z\2\2\u0576\u0578"+
		"\7\u00e3\2\2\u0577\u056e\3\2\2\2\u0577\u0572\3\2\2\2\u0577\u0574\3\2\2"+
		"\2\u0578\u00af\3\2\2\2\u0579\u057a\5\u00aeX\2\u057a\u057b\7\2\2\3\u057b"+
		"\u00b1\3\2\2\2\u057c\u057d\bZ\1\2\u057d\u057e\bZ\1\2\u057e\u057f\7\u00d2"+
		"\2\2\u057f\u0586\bZ\1\2\u0580\u0581\bZ\1\2\u0581\u0586\7[\2\2\u0582\u0583"+
		"\bZ\1\2\u0583\u0584\7\\\2\2\u0584\u0586\7\u00e3\2\2\u0585\u057c\3\2\2"+
		"\2\u0585\u0580\3\2\2\2\u0585\u0582\3\2\2\2\u0586\u00b3\3\2\2\2\u0587\u0588"+
		"\5\u00b2Z\2\u0588\u0589\7\2\2\3\u0589\u00b5\3\2\2\2\u058a\u058b\b\\\1"+
		"\2\u058b\u058c\5\u00ba^\2\u058c\u058d\b\\\1\2\u058d\u0598\3\2\2\2\u058e"+
		"\u058f\b\\\1\2\u058f\u0590\5\u00be`\2\u0590\u0591\b\\\1\2\u0591\u0598"+
		"\3\2\2\2\u0592\u0593\b\\\1\2\u0593\u0598\7]\2\2\u0594\u0595\b\\\1\2\u0595"+
		"\u0596\7^\2\2\u0596\u0598\7\u00e3\2\2\u0597\u058a\3\2\2\2\u0597\u058e"+
		"\3\2\2\2\u0597\u0592\3\2\2\2\u0597\u0594\3\2\2\2\u0598\u00b7\3\2\2\2\u0599"+
		"\u059a\5\u00b6\\\2\u059a\u059b\7\2\2\3\u059b\u00b9\3\2\2\2\u059c\u059d"+
		"\b^\1\2\u059d\u059e\7\u00dd\2\2\u059e\u05a5\b^\1\2\u059f\u05a0\b^\1\2"+
		"\u05a0\u05a5\7_\2\2\u05a1\u05a2\b^\1\2\u05a2\u05a3\7`\2\2\u05a3\u05a5"+
		"\7\u00e3\2\2\u05a4\u059c\3\2\2\2\u05a4\u059f\3\2\2\2\u05a4\u05a1\3\2\2"+
		"\2\u05a5\u00bb\3\2\2\2\u05a6\u05a7\5\u00ba^\2\u05a7\u05a8\7\2\2\3\u05a8"+
		"\u00bd\3\2\2\2\u05a9\u05aa\b`\1\2\u05aa\u05ab\7\u00de\2\2\u05ab\u05b2"+
		"\b`\1\2\u05ac\u05ad\b`\1\2\u05ad\u05b2\7a\2\2\u05ae\u05af\b`\1\2\u05af"+
		"\u05b0\7b\2\2\u05b0\u05b2\7\u00e3\2\2\u05b1\u05a9\3\2\2\2\u05b1\u05ac"+
		"\3\2\2\2\u05b1\u05ae\3\2\2\2\u05b2\u00bf\3\2\2\2\u05b3\u05b4\5\u00be`"+
		"\2\u05b4\u05b5\7\2\2\3\u05b5\u00c1\3\2\2\2\u05b6\u05b7\bb\1\2\u05b7\u05b8"+
		"\5N(\2\u05b8\u05b9\5\u009aN\2\u05b9\u05ba\bb\1\2\u05ba\u05c1\3\2\2\2\u05bb"+
		"\u05bc\bb\1\2\u05bc\u05c1\7c\2\2\u05bd\u05be\bb\1\2\u05be\u05bf\7d\2\2"+
		"\u05bf\u05c1\7\u00e3\2\2\u05c0\u05b6\3\2\2\2\u05c0\u05bb\3\2\2\2\u05c0"+
		"\u05bd\3\2\2\2\u05c1\u00c3\3\2\2\2\u05c2\u05c3\5\u00c2b\2\u05c3\u05c4"+
		"\7\2\2\3\u05c4\u00c5\3\2\2\2\u05c5\u05c6\bd\1\2\u05c6\u05c7\bd\1\2\u05c7"+
		"\u05c8\7\u00ce\2\2\u05c8\u05c9\5\u0132\u009a\2\u05c9\u05ca\bd\1\2\u05ca"+
		"\u05d1\3\2\2\2\u05cb\u05cc\bd\1\2\u05cc\u05d1\7e\2\2\u05cd\u05ce\bd\1"+
		"\2\u05ce\u05cf\7f\2\2\u05cf\u05d1\7\u00e3\2\2\u05d0\u05c5\3\2\2\2\u05d0"+
		"\u05cb\3\2\2\2\u05d0\u05cd\3\2\2\2\u05d1\u00c7\3\2\2\2\u05d2\u05d3\5\u00c6"+
		"d\2\u05d3\u05d4\7\2\2\3\u05d4\u00c9\3\2\2\2\u05d5\u05d6\bf\1\2\u05d6\u05d7"+
		"\5\u00ceh\2\u05d7\u05d8\5\u00d2j\2\u05d8\u05d9\bf\1\2\u05d9\u05ef\3\2"+
		"\2\2\u05da\u05db\bf\1\2\u05db\u05dc\5\u00ceh\2\u05dc\u05dd\5\u00d6l\2"+
		"\u05dd\u05de\bf\1\2\u05de\u05ef\3\2\2\2\u05df\u05e0\bf\1\2\u05e0\u05e1"+
		"\5\u00ceh\2\u05e1\u05e2\5\u00dan\2\u05e2\u05e3\bf\1\2\u05e3\u05ef\3\2"+
		"\2\2\u05e4\u05e5\bf\1\2\u05e5\u05e6\5\u00ceh\2\u05e6\u05e7\5\u00dep\2"+
		"\u05e7\u05e8\bf\1\2\u05e8\u05ef\3\2\2\2\u05e9\u05ea\bf\1\2\u05ea\u05ef"+
		"\7g\2\2\u05eb\u05ec\bf\1\2\u05ec\u05ed\7h\2\2\u05ed\u05ef\7\u00e3\2\2"+
		"\u05ee\u05d5\3\2\2\2\u05ee\u05da\3\2\2\2\u05ee\u05df\3\2\2\2\u05ee\u05e4"+
		"\3\2\2\2\u05ee\u05e9\3\2\2\2\u05ee\u05eb\3\2\2\2\u05ef\u00cb\3\2\2\2\u05f0"+
		"\u05f1\5\u00caf\2\u05f1\u05f2\7\2\2\3\u05f2\u00cd\3\2\2\2\u05f3\u05f4"+
		"\bh\1\2\u05f4\u05f5\7\u00d5\2\2\u05f5\u05fc\bh\1\2\u05f6\u05f7\bh\1\2"+
		"\u05f7\u05fc\7i\2\2\u05f8\u05f9\bh\1\2\u05f9\u05fa\7j\2\2\u05fa\u05fc"+
		"\7\u00e3\2\2\u05fb\u05f3\3\2\2\2\u05fb\u05f6\3\2\2\2\u05fb\u05f8\3\2\2"+
		"\2\u05fc\u00cf\3\2\2\2\u05fd\u05fe\5\u00ceh\2\u05fe\u05ff\7\2\2\3\u05ff"+
		"\u00d1\3\2\2\2\u0600\u0601\bj\1\2\u0601\u0602\7\u00d6\2\2\u0602\u0609"+
		"\bj\1\2\u0603\u0604\bj\1\2\u0604\u0609\7k\2\2\u0605\u0606\bj\1\2\u0606"+
		"\u0607\7l\2\2\u0607\u0609\7\u00e3\2\2\u0608\u0600\3\2\2\2\u0608\u0603"+
		"\3\2\2\2\u0608\u0605\3\2\2\2\u0609\u00d3\3\2\2\2\u060a\u060b\5\u00d2j"+
		"\2\u060b\u060c\7\2\2\3\u060c\u00d5\3\2\2\2\u060d\u060e\bl\1\2\u060e\u060f"+
		"\7\u00d7\2\2\u060f\u0616\bl\1\2\u0610\u0611\bl\1\2\u0611\u0616\7m\2\2"+
		"\u0612\u0613\bl\1\2\u0613\u0614\7n\2\2\u0614\u0616\7\u00e3\2\2\u0615\u060d"+
		"\3\2\2\2\u0615\u0610\3\2\2\2\u0615\u0612\3\2\2\2\u0616\u00d7\3\2\2\2\u0617"+
		"\u0618\5\u00d6l\2\u0618\u0619\7\2\2\3\u0619\u00d9\3\2\2\2\u061a\u061b"+
		"\bn\1\2\u061b\u061c\7\u00d8\2\2\u061c\u0623\bn\1\2\u061d\u061e\bn\1\2"+
		"\u061e\u0623\7o\2\2\u061f\u0620\bn\1\2\u0620\u0621\7p\2\2\u0621\u0623"+
		"\7\u00e3\2\2\u0622\u061a\3\2\2\2\u0622\u061d\3\2\2\2\u0622\u061f\3\2\2"+
		"\2\u0623\u00db\3\2\2\2\u0624\u0625\5\u00dan\2\u0625\u0626\7\2\2\3\u0626"+
		"\u00dd\3\2\2\2\u0627\u0628\bp\1\2\u0628\u0629\7\u00d9\2\2\u0629\u0630"+
		"\bp\1\2\u062a\u062b\bp\1\2\u062b\u0630\7q\2\2\u062c\u062d\bp\1\2\u062d"+
		"\u062e\7r\2\2\u062e\u0630\7\u00e3\2\2\u062f\u0627\3\2\2\2\u062f\u062a"+
		"\3\2\2\2\u062f\u062c\3\2\2\2\u0630\u00df\3\2\2\2\u0631\u0632\5\u00dep"+
		"\2\u0632\u0633\7\2\2\3\u0633\u00e1\3\2\2\2\u0634\u0635\br\1\2\u0635\u0636"+
		"\br\1\2\u0636\u0637\7\u00bf\2\2\u0637\u0638\5\u00eav\2\u0638\u0639\5\u00ee"+
		"x\2\u0639\u063a\5\u00e6t\2\u063a\u063b\br\1\2\u063b\u0642\3\2\2\2\u063c"+
		"\u063d\br\1\2\u063d\u0642\7s\2\2\u063e\u063f\br\1\2\u063f\u0640\7t\2\2"+
		"\u0640\u0642\7\u00e3\2\2\u0641\u0634\3\2\2\2\u0641\u063c\3\2\2\2\u0641"+
		"\u063e\3\2\2\2\u0642\u00e3\3\2\2\2\u0643\u0644\5\u00e2r\2\u0644\u0645"+
		"\7\2\2\3\u0645\u00e5\3\2\2\2\u0646\u0647\bt\1\2\u0647\u0649\bt\1\2\u0648"+
		"\u064a\5\u00fa~\2\u0649\u0648\3\2\2\2\u0649\u064a\3\2\2\2\u064a\u0653"+
		"\3\2\2\2\u064b\u0651\bt\1\2\u064c\u064d\bt\1\2\u064d\u0652\7u\2\2\u064e"+
		"\u064f\bt\1\2\u064f\u0650\7v\2\2\u0650\u0652\7\u00e3\2\2\u0651\u064c\3"+
		"\2\2\2\u0651\u064e\3\2\2\2\u0652\u0654\3\2\2\2\u0653\u064b\3\2\2\2\u0653"+
		"\u0654\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u0656\bt\1\2\u0656\u065d\bt\1"+
		"\2\u0657\u0658\bt\1\2\u0658\u065d\7u\2\2\u0659\u065a\bt\1\2\u065a\u065b"+
		"\7v\2\2\u065b\u065d\7\u00e3\2\2\u065c\u0646\3\2\2\2\u065c\u0657\3\2\2"+
		"\2\u065c\u0659\3\2\2\2\u065d\u00e7\3\2\2\2\u065e\u065f\5\u00e6t\2\u065f"+
		"\u0660\7\2\2\3\u0660\u00e9\3\2\2\2\u0661\u0662\bv\1\2\u0662\u0663\5J&"+
		"\2\u0663\u0664\bv\1\2\u0664\u066b\3\2\2\2\u0665\u0666\bv\1\2\u0666\u066b"+
		"\7w\2\2\u0667\u0668\bv\1\2\u0668\u0669\7x\2\2\u0669\u066b\7\u00e3\2\2"+
		"\u066a\u0661\3\2\2\2\u066a\u0665\3\2\2\2\u066a\u0667\3\2\2\2\u066b\u00eb"+
		"\3\2\2\2\u066c\u066d\5\u00eav\2\u066d\u066e\7\2\2\3\u066e\u00ed\3\2\2"+
		"\2\u066f\u0670\bx\1\2\u0670\u0671\5\u00f2z\2\u0671\u0672\bx\1\2\u0672"+
		"\u0679\3\2\2\2\u0673\u0674\bx\1\2\u0674\u0679\7y\2\2\u0675\u0676\bx\1"+
		"\2\u0676\u0677\7z\2\2\u0677\u0679\7\u00e3\2\2\u0678\u066f\3\2\2\2\u0678"+
		"\u0673\3\2\2\2\u0678\u0675\3\2\2\2\u0679\u00ef\3\2\2\2\u067a\u067b\5\u00ee"+
		"x\2\u067b\u067c\7\2\2\3\u067c\u00f1\3\2\2\2\u067d\u067e\bz\1\2\u067e\u067f"+
		"\bz\1\2\u067f\u0685\5\u00f6|\2\u0680\u0681\bz\1\2\u0681\u0682\7\u00cb"+
		"\2\2\u0682\u0684\5\u00f6|\2\u0683\u0680\3\2\2\2\u0684\u0687\3\2\2\2\u0685"+
		"\u0683\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u0690\3\2\2\2\u0687\u0685\3\2"+
		"\2\2\u0688\u068e\bz\1\2\u0689\u068a\bz\1\2\u068a\u068f\7{\2\2\u068b\u068c"+
		"\bz\1\2\u068c\u068d\7|\2\2\u068d\u068f\7\u00e3\2\2\u068e\u0689\3\2\2\2"+
		"\u068e\u068b\3\2\2\2\u068f\u0691\3\2\2\2\u0690\u0688\3\2\2\2\u0690\u0691"+
		"\3\2\2\2\u0691\u0692\3\2\2\2\u0692\u0693\bz\1\2\u0693\u0694\bz\1\2\u0694"+
		"\u069b\3\2\2\2\u0695\u0696\bz\1\2\u0696\u069b\7{\2\2\u0697\u0698\bz\1"+
		"\2\u0698\u0699\7|\2\2\u0699\u069b\7\u00e3\2\2\u069a\u067d\3\2\2\2\u069a"+
		"\u0695\3\2\2\2\u069a\u0697\3\2\2\2\u069b\u00f3\3\2\2\2\u069c\u06a0\5\u00f2"+
		"z\2\u069d\u069e\b{\1\2\u069e\u06a0\b{\1\2\u069f\u069c\3\2\2\2\u069f\u069d"+
		"\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1\u06a2\7\2\2\3\u06a2\u00f5\3\2\2\2\u06a3"+
		"\u06a4\b|\1\2\u06a4\u06a5\5\36\20\2\u06a5\u06a6\b|\1\2\u06a6\u06ad\3\2"+
		"\2\2\u06a7\u06a8\b|\1\2\u06a8\u06ad\7}\2\2\u06a9\u06aa\b|\1\2\u06aa\u06ab"+
		"\7~\2\2\u06ab\u06ad\7\u00e3\2\2\u06ac\u06a3\3\2\2\2\u06ac\u06a7\3\2\2"+
		"\2\u06ac\u06a9\3\2\2\2\u06ad\u00f7\3\2\2\2\u06ae\u06af\5\u00f6|\2\u06af"+
		"\u06b0\7\2\2\3\u06b0\u00f9\3\2\2\2\u06b1\u06b2\b~\1\2\u06b2\u06b3\b~\1"+
		"\2\u06b3\u06b4\7\u00c0\2\2\u06b4\u06bb\b~\1\2\u06b5\u06b6\b~\1\2\u06b6"+
		"\u06bb\7\177\2\2\u06b7\u06b8\b~\1\2\u06b8\u06b9\7\u0080\2\2\u06b9\u06bb"+
		"\7\u00e3\2\2\u06ba\u06b1\3\2\2\2\u06ba\u06b5\3\2\2\2\u06ba\u06b7\3\2\2"+
		"\2\u06bb\u00fb\3\2\2\2\u06bc\u06bd\5\u00fa~\2\u06bd\u06be\7\2\2\3\u06be"+
		"\u00fd\3\2\2\2\u06bf\u06c0\b\u0080\1\2\u06c0\u06c1\b\u0080\1\2\u06c1\u06c2"+
		"\7\u00c7\2\2\u06c2\u06c3\5\u0102\u0082\2\u06c3\u06c4\b\u0080\1\2\u06c4"+
		"\u06c5\7\u00c8\2\2\u06c5\u06c6\b\u0080\1\2\u06c6\u06cd\3\2\2\2\u06c7\u06c8"+
		"\b\u0080\1\2\u06c8\u06cd\7\u0081\2\2\u06c9\u06ca\b\u0080\1\2\u06ca\u06cb"+
		"\7\u0082\2\2\u06cb\u06cd\7\u00e3\2\2\u06cc\u06bf\3\2\2\2\u06cc\u06c7\3"+
		"\2\2\2\u06cc\u06c9\3\2\2\2\u06cd\u00ff\3\2\2\2\u06ce\u06cf\5\u00fe\u0080"+
		"\2\u06cf\u06d0\7\2\2\3\u06d0\u0101\3\2\2\2\u06d1\u06d2\b\u0082\1\2\u06d2"+
		"\u06d4\b\u0082\1\2\u06d3\u06d5\5\u0106\u0084\2\u06d4\u06d3\3\2\2\2\u06d4"+
		"\u06d5\3\2\2\2\u06d5\u06de\3\2\2\2\u06d6\u06dc\b\u0082\1\2\u06d7\u06d8"+
		"\b\u0082\1\2\u06d8\u06dd\7\u0083\2\2\u06d9\u06da\b\u0082\1\2\u06da\u06db"+
		"\7\u0084\2\2\u06db\u06dd\7\u00e3\2\2\u06dc\u06d7\3\2\2\2\u06dc\u06d9\3"+
		"\2\2\2\u06dd\u06df\3\2\2\2\u06de\u06d6\3\2\2\2\u06de\u06df\3\2\2\2\u06df"+
		"\u06e0\3\2\2\2\u06e0\u06e1\b\u0082\1\2\u06e1\u06e8\b\u0082\1\2\u06e2\u06e3"+
		"\b\u0082\1\2\u06e3\u06e8\7\u0083\2\2\u06e4\u06e5\b\u0082\1\2\u06e5\u06e6"+
		"\7\u0084\2\2\u06e6\u06e8\7\u00e3\2\2\u06e7\u06d1\3\2\2\2\u06e7\u06e2\3"+
		"\2\2\2\u06e7\u06e4\3\2\2\2\u06e8\u0103\3\2\2\2\u06e9\u06ea\5\u0102\u0082"+
		"\2\u06ea\u06eb\7\2\2\3\u06eb\u0105\3\2\2\2\u06ec\u06ed\b\u0084\1\2\u06ed"+
		"\u06ee\5\u010a\u0086\2\u06ee\u06ef\b\u0084\1\2\u06ef\u06f6\3\2\2\2\u06f0"+
		"\u06f1\b\u0084\1\2\u06f1\u06f6\7\u0085\2\2\u06f2\u06f3\b\u0084\1\2\u06f3"+
		"\u06f4\7\u0086\2\2\u06f4\u06f6\7\u00e3\2\2\u06f5\u06ec\3\2\2\2\u06f5\u06f0"+
		"\3\2\2\2\u06f5\u06f2\3\2\2\2\u06f6\u0107\3\2\2\2\u06f7\u06f8\5\u0106\u0084"+
		"\2\u06f8\u06f9\7\2\2\3\u06f9\u0109\3\2\2\2\u06fa\u06fb\b\u0086\1\2\u06fb"+
		"\u06fc\b\u0086\1\2\u06fc\u0704\5\u010e\u0088\2\u06fd\u06fe\b\u0086\1\2"+
		"\u06fe\u0700\7\u00cb\2\2\u06ff\u0701\5\u010e\u0088\2\u0700\u06ff\3\2\2"+
		"\2\u0700\u0701\3\2\2\2\u0701\u0703\3\2\2\2\u0702\u06fd\3\2\2\2\u0703\u0706"+
		"\3\2\2\2\u0704\u0702\3\2\2\2\u0704\u0705\3\2\2\2\u0705\u070f\3\2\2\2\u0706"+
		"\u0704\3\2\2\2\u0707\u070d\b\u0086\1\2\u0708\u0709\b\u0086\1\2\u0709\u070e"+
		"\7\u0087\2\2\u070a\u070b\b\u0086\1\2\u070b\u070c\7\u0088\2\2\u070c\u070e"+
		"\7\u00e3\2\2\u070d\u0708\3\2\2\2\u070d\u070a\3\2\2\2\u070e\u0710\3\2\2"+
		"\2\u070f\u0707\3\2\2\2\u070f\u0710\3\2\2\2\u0710\u0711\3\2\2\2\u0711\u0712"+
		"\b\u0086\1\2\u0712\u0713\b\u0086\1\2\u0713\u071a\3\2\2\2\u0714\u0715\b"+
		"\u0086\1\2\u0715\u071a\7\u0087\2\2\u0716\u0717\b\u0086\1\2\u0717\u0718"+
		"\7\u0088\2\2\u0718\u071a\7\u00e3\2\2\u0719\u06fa\3\2\2\2\u0719\u0714\3"+
		"\2\2\2\u0719\u0716\3\2\2\2\u071a\u010b\3\2\2\2\u071b\u071f\5\u010a\u0086"+
		"\2\u071c\u071d\b\u0087\1\2\u071d\u071f\b\u0087\1\2\u071e\u071b\3\2\2\2"+
		"\u071e\u071c\3\2\2\2\u071f\u0720\3\2\2\2\u0720\u0721\7\2\2\3\u0721\u010d"+
		"\3\2\2\2\u0722\u0723\b\u0088\1\2\u0723\u0724\5R*\2\u0724\u0725\b\u0088"+
		"\1\2\u0725\u0762\3\2\2\2\u0726\u0727\b\u0088\1\2\u0727\u0728\b\u0088\1"+
		"\2\u0728\u0729\7\u00d0\2\2\u0729\u072a\5R*\2\u072a\u072b\b\u0088\1\2\u072b"+
		"\u0762\3\2\2\2\u072c\u072d\b\u0088\1\2\u072d\u072e\5R*\2\u072e\u072f\b"+
		"\u0088\1\2\u072f\u0730\7\u00c2\2\2\u0730\u0731\5J&\2\u0731\u0732\b\u0088"+
		"\1\2\u0732\u0762\3\2\2\2\u0733\u0734\b\u0088\1\2\u0734\u0735\5\u00a2R"+
		"\2\u0735\u0736\b\u0088\1\2\u0736\u0762\3\2\2\2\u0737\u0738\b\u0088\1\2"+
		"\u0738\u0739\b\u0088\1\2\u0739\u073a\7\u00d0\2\2\u073a\u073b\5\u00a2R"+
		"\2\u073b\u073c\b\u0088\1\2\u073c\u0762\3\2\2\2\u073d\u073e\b\u0088\1\2"+
		"\u073e\u073f\5\u00a2R\2\u073f\u0740\b\u0088\1\2\u0740\u0741\7\u00c2\2"+
		"\2\u0741\u0742\5J&\2\u0742\u0743\b\u0088\1\2\u0743\u0762\3\2\2\2\u0744"+
		"\u0745\b\u0088\1\2\u0745\u0746\5\u00ba^\2\u0746\u0747\b\u0088\1\2\u0747"+
		"\u0762\3\2\2\2\u0748\u0749\b\u0088\1\2\u0749\u074a\b\u0088\1\2\u074a\u074b"+
		"\7\u00d0\2\2\u074b\u074c\5\u00ba^\2\u074c\u074d\b\u0088\1\2\u074d\u0762"+
		"\3\2\2\2\u074e\u074f\b\u0088\1\2\u074f\u0750\5\u00ba^\2\u0750\u0751\b"+
		"\u0088\1\2\u0751\u0752\7\u00c2\2\2\u0752\u0753\5J&\2\u0753\u0754\b\u0088"+
		"\1\2\u0754\u0762\3\2\2\2\u0755\u0756\b\u0088\1\2\u0756\u0757\5\u014e\u00a8"+
		"\2\u0757\u0758\b\u0088\1\2\u0758\u0759\7\u00c2\2\2\u0759\u075a\5J&\2\u075a"+
		"\u075b\b\u0088\1\2\u075b\u0762\3\2\2\2\u075c\u075d\b\u0088\1\2\u075d\u0762"+
		"\7\u0089\2\2\u075e\u075f\b\u0088\1\2\u075f\u0760\7\u008a\2\2\u0760\u0762"+
		"\7\u00e3\2\2\u0761\u0722\3\2\2\2\u0761\u0726\3\2\2\2\u0761\u072c\3\2\2"+
		"\2\u0761\u0733\3\2\2\2\u0761\u0737\3\2\2\2\u0761\u073d\3\2\2\2\u0761\u0744"+
		"\3\2\2\2\u0761\u0748\3\2\2\2\u0761\u074e\3\2\2\2\u0761\u0755\3\2\2\2\u0761"+
		"\u075c\3\2\2\2\u0761\u075e\3\2\2\2\u0762\u010f\3\2\2\2\u0763\u0764\5\u010e"+
		"\u0088\2\u0764\u0765\7\2\2\3\u0765\u0111\3\2\2\2\u0766\u0767\b\u008a\1"+
		"\2\u0767\u0768\5\u00e2r\2\u0768\u0769\b\u008a\1\2\u0769\u0770\3\2\2\2"+
		"\u076a\u076b\b\u008a\1\2\u076b\u0770\7\u008b\2\2\u076c\u076d\b\u008a\1"+
		"\2\u076d\u076e\7\u008c\2\2\u076e\u0770\7\u00e3\2\2\u076f\u0766\3\2\2\2"+
		"\u076f\u076a\3\2\2\2\u076f\u076c\3\2\2\2\u0770\u0113\3\2\2\2\u0771\u0772"+
		"\5\u0112\u008a\2\u0772\u0773\7\2\2\3\u0773\u0115\3\2\2\2\u0774\u0775\b"+
		"\u008c\1\2\u0775\u0776\5\u011a\u008e\2\u0776\u0777\5\u0126\u0094\2\u0777"+
		"\u0778\5\u0132\u009a\2\u0778\u0779\b\u008c\1\2\u0779\u077a\7\u00cd\2\2"+
		"\u077a\u077b\b\u008c\1\2\u077b\u077c\7\u00c5\2\2\u077c\u077d\5\u0142\u00a2"+
		"\2\u077d\u077e\b\u008c\1\2\u077e\u077f\7\u00c6\2\2\u077f\u0780\b\u008c"+
		"\1\2\u0780\u0790\3\2\2\2\u0781\u0782\b\u008c\1\2\u0782\u0783\5\u011a\u008e"+
		"\2\u0783\u0784\5\u0126\u0094\2\u0784\u0785\5\u014a\u00a6\2\u0785\u0786"+
		"\b\u008c\1\2\u0786\u0787\7\u00ce\2\2\u0787\u0788\5\u0132\u009a\2\u0788"+
		"\u0789\b\u008c\1\2\u0789\u0790\3\2\2\2\u078a\u078b\b\u008c\1\2\u078b\u0790"+
		"\7\u008d\2\2\u078c\u078d\b\u008c\1\2\u078d\u078e\7\u008e\2\2\u078e\u0790"+
		"\7\u00e3\2\2\u078f\u0774\3\2\2\2\u078f\u0781\3\2\2\2\u078f\u078a\3\2\2"+
		"\2\u078f\u078c\3\2\2\2\u0790\u0117\3\2\2\2\u0791\u0792\5\u0116\u008c\2"+
		"\u0792\u0793\7\2\2\3\u0793\u0119\3\2\2\2\u0794\u0795\b\u008e\1\2\u0795"+
		"\u0797\b\u008e\1\2\u0796\u0798\5\u011e\u0090\2\u0797\u0796\3\2\2\2\u0797"+
		"\u0798\3\2\2\2\u0798\u07a1\3\2\2\2\u0799\u079f\b\u008e\1\2\u079a\u079b"+
		"\b\u008e\1\2\u079b\u07a0\7\u008f\2\2\u079c\u079d\b\u008e\1\2\u079d\u079e"+
		"\7\u0090\2\2\u079e\u07a0\7\u00e3\2\2\u079f\u079a\3\2\2\2\u079f\u079c\3"+
		"\2\2\2\u07a0\u07a2\3\2\2\2\u07a1\u0799\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2"+
		"\u07a3\3\2\2\2\u07a3\u07a4\b\u008e\1\2\u07a4\u07ab\b\u008e\1\2\u07a5\u07a6"+
		"\b\u008e\1\2\u07a6\u07ab\7\u008f\2\2\u07a7\u07a8\b\u008e\1\2\u07a8\u07a9"+
		"\7\u0090\2\2\u07a9\u07ab\7\u00e3\2\2\u07aa\u0794\3\2\2\2\u07aa\u07a5\3"+
		"\2\2\2\u07aa\u07a7\3\2\2\2\u07ab\u011b\3\2\2\2\u07ac\u07ad\5\u011a\u008e"+
		"\2\u07ad\u07ae\7\2\2\3\u07ae\u011d\3\2\2\2\u07af\u07b0\b\u0090\1\2\u07b0"+
		"\u07b1\b\u0090\1\2\u07b1\u07b2\7\u00c4\2\2\u07b2\u07b3\5\u0122\u0092\2"+
		"\u07b3\u07b4\b\u0090\1\2\u07b4\u07b5\7\u00cf\2\2\u07b5\u07b6\b\u0090\1"+
		"\2\u07b6\u07bd\3\2\2\2\u07b7\u07b8\b\u0090\1\2\u07b8\u07bd\7\u0091\2\2"+
		"\u07b9\u07ba\b\u0090\1\2\u07ba\u07bb\7\u0092\2\2\u07bb\u07bd\7\u00e3\2"+
		"\2\u07bc\u07af\3\2\2\2\u07bc\u07b7\3\2\2\2\u07bc\u07b9\3\2\2\2\u07bd\u011f"+
		"\3\2\2\2\u07be\u07bf\5\u011e\u0090\2\u07bf\u07c0\7\2\2\3\u07c0\u0121\3"+
		"\2\2\2\u07c1\u07c2\b\u0092\1\2\u07c2\u07c4\b\u0092\1\2\u07c3\u07c5\5\u009a"+
		"N\2\u07c4\u07c3\3\2\2\2\u07c5\u07c6\3\2\2\2\u07c6\u07c4\3\2\2\2\u07c6"+
		"\u07c7\3\2\2\2\u07c7\u07d0\3\2\2\2\u07c8\u07ce\b\u0092\1\2\u07c9\u07ca"+
		"\b\u0092\1\2\u07ca\u07cf\7\u0093\2\2\u07cb\u07cc\b\u0092\1\2\u07cc\u07cd"+
		"\7\u0094\2\2\u07cd\u07cf\7\u00e3\2\2\u07ce\u07c9\3\2\2\2\u07ce\u07cb\3"+
		"\2\2\2\u07cf\u07d1\3\2\2\2\u07d0\u07c8\3\2\2\2\u07d0\u07d1\3\2\2\2\u07d1"+
		"\u07d2\3\2\2\2\u07d2\u07d3\b\u0092\1\2\u07d3\u07d4\b\u0092\1\2\u07d4\u07db"+
		"\3\2\2\2\u07d5\u07d6\b\u0092\1\2\u07d6\u07db\7\u0093\2\2\u07d7\u07d8\b"+
		"\u0092\1\2\u07d8\u07d9\7\u0094\2\2\u07d9\u07db\7\u00e3\2\2\u07da\u07c1"+
		"\3\2\2\2\u07da\u07d5\3\2\2\2\u07da\u07d7\3\2\2\2\u07db\u0123\3\2\2\2\u07dc"+
		"\u07e0\5\u0122\u0092\2\u07dd\u07de\b\u0093\1\2\u07de\u07e0\b\u0093\1\2"+
		"\u07df\u07dc\3\2\2\2\u07df\u07dd\3\2\2\2\u07e0\u07e1\3\2\2\2\u07e1\u07e2"+
		"\7\2\2\3\u07e2\u0125\3\2\2\2\u07e3\u07e4\b\u0094\1\2\u07e4\u07e5\5\62"+
		"\32\2\u07e5\u07e6\b\u0094\1\2\u07e6\u07ed\3\2\2\2\u07e7\u07e8\b\u0094"+
		"\1\2\u07e8\u07ed\7\u0095\2\2\u07e9\u07ea\b\u0094\1\2\u07ea\u07eb\7\u0096"+
		"\2\2\u07eb\u07ed\7\u00e3\2\2\u07ec\u07e3\3\2\2\2\u07ec\u07e7\3\2\2\2\u07ec"+
		"\u07e9\3\2\2\2\u07ed\u0127\3\2\2\2\u07ee\u07ef\5\u0126\u0094\2\u07ef\u07f0"+
		"\7\2\2\3\u07f0\u0129\3\2\2\2\u07f1\u07f2\b\u0096\1\2\u07f2\u07f3\5\u012e"+
		"\u0098\2\u07f3\u07f4\b\u0096\1\2\u07f4\u07fb\3\2\2\2\u07f5\u07f6\b\u0096"+
		"\1\2\u07f6\u07fb\7\u0097\2\2\u07f7\u07f8\b\u0096\1\2\u07f8\u07f9\7\u0098"+
		"\2\2\u07f9\u07fb\7\u00e3\2\2\u07fa\u07f1\3\2\2\2\u07fa\u07f5\3\2\2\2\u07fa"+
		"\u07f7\3\2\2\2\u07fb\u012b\3\2\2\2\u07fc\u07fd\5\u012a\u0096\2\u07fd\u07fe"+
		"\7\2\2\3\u07fe\u012d\3\2\2\2\u07ff\u0800\b\u0098\1\2\u0800\u0801\b\u0098"+
		"\1\2\u0801\u0807\5\u0132\u009a\2\u0802\u0803\b\u0098\1\2\u0803\u0804\7"+
		"\u00cc\2\2\u0804\u0806\5\u0132\u009a\2\u0805\u0802\3\2\2\2\u0806\u0809"+
		"\3\2\2\2\u0807\u0805\3\2\2\2\u0807\u0808\3\2\2\2\u0808\u0812\3\2\2\2\u0809"+
		"\u0807\3\2\2\2\u080a\u0810\b\u0098\1\2\u080b\u080c\b\u0098\1\2\u080c\u0811"+
		"\7\u0099\2\2\u080d\u080e\b\u0098\1\2\u080e\u080f\7\u009a\2\2\u080f\u0811"+
		"\7\u00e3\2\2\u0810\u080b\3\2\2\2\u0810\u080d\3\2\2\2\u0811\u0813\3\2\2"+
		"\2\u0812\u080a\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u0814\3\2\2\2\u0814\u0815"+
		"\b\u0098\1\2\u0815\u0816\b\u0098\1\2\u0816\u081d\3\2\2\2\u0817\u0818\b"+
		"\u0098\1\2\u0818\u081d\7\u0099\2\2\u0819\u081a\b\u0098\1\2\u081a\u081b"+
		"\7\u009a\2\2\u081b\u081d\7\u00e3\2\2\u081c\u07ff\3\2\2\2\u081c\u0817\3"+
		"\2\2\2\u081c\u0819\3\2\2\2\u081d\u012f\3\2\2\2\u081e\u0822\5\u012e\u0098"+
		"\2\u081f\u0820\b\u0099\1\2\u0820\u0822\b\u0099\1\2\u0821\u081e\3\2\2\2"+
		"\u0821\u081f\3\2\2\2\u0822\u0823\3\2\2\2\u0823\u0824\7\2\2\3\u0824\u0131"+
		"\3\2\2\2\u0825\u0826\b\u009a\1\2\u0826\u0827\5\u014e\u00a8\2\u0827\u0828"+
		"\5\u0136\u009c\2\u0828\u0829\b\u009a\1\2\u0829\u0834\3\2\2\2\u082a\u082b"+
		"\b\u009a\1\2\u082b\u082c\5\u009aN\2\u082c\u082d\b\u009a\1\2\u082d\u0834"+
		"\3\2\2\2\u082e\u082f\b\u009a\1\2\u082f\u0834\7\u009b\2\2\u0830\u0831\b"+
		"\u009a\1\2\u0831\u0832\7\u009c\2\2\u0832\u0834\7\u00e3\2\2\u0833\u0825"+
		"\3\2\2\2\u0833\u082a\3\2\2\2\u0833\u082e\3\2\2\2\u0833\u0830\3\2\2\2\u0834"+
		"\u0133\3\2\2\2\u0835\u0836\5\u0132\u009a\2\u0836\u0837\7\2\2\3\u0837\u0135"+
		"\3\2\2\2\u0838\u0839\b\u009c\1\2\u0839\u083b\b\u009c\1\2\u083a\u083c\5"+
		"\u013a\u009e\2\u083b\u083a\3\2\2\2\u083b\u083c\3\2\2\2\u083c\u0845\3\2"+
		"\2\2\u083d\u0843\b\u009c\1\2\u083e\u083f\b\u009c\1\2\u083f\u0844\7\u009d"+
		"\2\2\u0840\u0841\b\u009c\1\2\u0841\u0842\7\u009e\2\2\u0842\u0844\7\u00e3"+
		"\2\2\u0843\u083e\3\2\2\2\u0843\u0840\3\2\2\2\u0844\u0846\3\2\2\2\u0845"+
		"\u083d\3\2\2\2\u0845\u0846\3\2\2\2\u0846\u0847\3\2\2\2\u0847\u0848\b\u009c"+
		"\1\2\u0848\u084f\b\u009c\1\2\u0849\u084a\b\u009c\1\2\u084a\u084f\7\u009d"+
		"\2\2\u084b\u084c\b\u009c\1\2\u084c\u084d\7\u009e\2\2\u084d\u084f\7\u00e3"+
		"\2\2\u084e\u0838\3\2\2\2\u084e\u0849\3\2\2\2\u084e\u084b\3\2\2\2\u084f"+
		"\u0137\3\2\2\2\u0850\u0851\5\u0136\u009c\2\u0851\u0852\7\2\2\3\u0852\u0139"+
		"\3\2\2\2\u0853\u0854\b\u009e\1\2\u0854\u0855\b\u009e\1\2\u0855\u0856\7"+
		"\u00c9\2\2\u0856\u0857\5\u013e\u00a0\2\u0857\u0858\b\u009e\1\2\u0858\u0859"+
		"\7\u00ca\2\2\u0859\u085a\b\u009e\1\2\u085a\u0861\3\2\2\2\u085b\u085c\b"+
		"\u009e\1\2\u085c\u0861\7\u009f\2\2\u085d\u085e\b\u009e\1\2\u085e\u085f"+
		"\7\u00a0\2\2\u085f\u0861\7\u00e3\2\2\u0860\u0853\3\2\2\2\u0860\u085b\3"+
		"\2\2\2\u0860\u085d\3\2\2\2\u0861\u013b\3\2\2\2\u0862\u0863\5\u013a\u009e"+
		"\2\u0863\u0864\7\2\2\3\u0864\u013d\3\2\2\2\u0865\u0866\b\u00a0\1\2\u0866"+
		"\u0868\b\u00a0\1\2\u0867\u0869\5\u012a\u0096\2\u0868\u0867\3\2\2\2\u0868"+
		"\u0869\3\2\2\2\u0869\u0872\3\2\2\2\u086a\u0870\b\u00a0\1\2\u086b\u086c"+
		"\b\u00a0\1\2\u086c\u0871\7\u00a1\2\2\u086d\u086e\b\u00a0\1\2\u086e\u086f"+
		"\7\u00a2\2\2\u086f\u0871\7\u00e3\2\2\u0870\u086b\3\2\2\2\u0870\u086d\3"+
		"\2\2\2\u0871\u0873\3\2\2\2\u0872\u086a\3\2\2\2\u0872\u0873\3\2\2\2\u0873"+
		"\u0874\3\2\2\2\u0874\u0875\b\u00a0\1\2\u0875\u087c\b\u00a0\1\2\u0876\u0877"+
		"\b\u00a0\1\2\u0877\u087c\7\u00a1\2\2\u0878\u0879\b\u00a0\1\2\u0879\u087a"+
		"\7\u00a2\2\2\u087a\u087c\7\u00e3\2\2\u087b\u0865\3\2\2\2\u087b\u0876\3"+
		"\2\2\2\u087b\u0878\3\2\2\2\u087c\u013f\3\2\2\2\u087d\u087e\5\u013e\u00a0"+
		"\2\u087e\u087f\7\2\2\3\u087f\u0141\3\2\2\2\u0880\u0881\b\u00a2\1\2\u0881"+
		"\u0882\5\u0146\u00a4\2\u0882\u0883\b\u00a2\1\2\u0883\u088a\3\2\2\2\u0884"+
		"\u0885\b\u00a2\1\2\u0885\u088a\7\u00a3\2\2\u0886\u0887\b\u00a2\1\2\u0887"+
		"\u0888\7\u00a4\2\2\u0888\u088a\7\u00e3\2\2\u0889\u0880\3\2\2\2\u0889\u0884"+
		"\3\2\2\2\u0889\u0886\3\2\2\2\u088a\u0143\3\2\2\2\u088b\u088c\5\u0142\u00a2"+
		"\2\u088c\u088d\7\2\2\3\u088d\u0145\3\2\2\2\u088e\u088f\b\u00a4\1\2\u088f"+
		"\u0896\b\u00a4\1\2\u0890\u0891\5\u014a\u00a6\2\u0891\u0892\b\u00a4\1\2"+
		"\u0892\u0893\7\u00cb\2\2\u0893\u0895\3\2\2\2\u0894\u0890\3\2\2\2\u0895"+
		"\u0898\3\2\2\2\u0896\u0894\3\2\2\2\u0896\u0897\3\2\2\2\u0897\u08a1\3\2"+
		"\2\2\u0898\u0896\3\2\2\2\u0899\u089f\b\u00a4\1\2\u089a\u089b\b\u00a4\1"+
		"\2\u089b\u08a0\7\u00a5\2\2\u089c\u089d\b\u00a4\1\2\u089d\u089e\7\u00a6"+
		"\2\2\u089e\u08a0\7\u00e3\2\2\u089f\u089a\3\2\2\2\u089f\u089c\3\2\2\2\u08a0"+
		"\u08a2\3\2\2\2\u08a1\u0899\3\2\2\2\u08a1\u08a2\3\2\2\2\u08a2\u08a3\3\2"+
		"\2\2\u08a3\u08a4\b\u00a4\1\2\u08a4\u08ab\b\u00a4\1\2\u08a5\u08a6\b\u00a4"+
		"\1\2\u08a6\u08ab\7\u00a5\2\2\u08a7\u08a8\b\u00a4\1\2\u08a8\u08a9\7\u00a6"+
		"\2\2\u08a9\u08ab\7\u00e3\2\2\u08aa\u088e\3\2\2\2\u08aa\u08a5\3\2\2\2\u08aa"+
		"\u08a7\3\2\2\2\u08ab\u0147\3\2\2\2\u08ac\u08b0\5\u0146\u00a4\2\u08ad\u08ae"+
		"\b\u00a5\1\2\u08ae\u08b0\b\u00a5\1\2\u08af\u08ac\3\2\2\2\u08af\u08ad\3"+
		"\2\2\2\u08b0\u08b1\3\2\2\2\u08b1\u08b2\7\2\2\3\u08b2\u0149\3\2\2\2\u08b3"+
		"\u08b4\b\u00a6\1\2\u08b4\u08b5\5\u014e\u00a8\2\u08b5\u08b6\5*\26\2\u08b6"+
		"\u08b7\b\u00a6\1\2\u08b7\u08c2\3\2\2\2\u08b8\u08b9\b\u00a6\1\2\u08b9\u08ba"+
		"\5\u009aN\2\u08ba\u08bb\b\u00a6\1\2\u08bb\u08c2\3\2\2\2\u08bc\u08bd\b"+
		"\u00a6\1\2\u08bd\u08c2\7\u00a7\2\2\u08be\u08bf\b\u00a6\1\2\u08bf\u08c0"+
		"\7\u00a8\2\2\u08c0\u08c2\7\u00e3\2\2\u08c1\u08b3\3\2\2\2\u08c1\u08b8\3"+
		"\2\2\2\u08c1\u08bc\3\2\2\2\u08c1\u08be\3\2\2\2\u08c2\u014b\3\2\2\2\u08c3"+
		"\u08c4\5\u014a\u00a6\2\u08c4\u08c5\7\2\2\3\u08c5\u014d\3\2\2\2\u08c6\u08c7"+
		"\b\u00a8\1\2\u08c7\u08c8\5\u0152\u00aa\2\u08c8\u08c9\5\26\f\2\u08c9\u08ca"+
		"\b\u00a8\1\2\u08ca\u08d5\3\2\2\2\u08cb\u08cc\b\u00a8\1\2\u08cc\u08cd\5"+
		"\u0156\u00ac\2\u08cd\u08ce\b\u00a8\1\2\u08ce\u08d5\3\2\2\2\u08cf\u08d0"+
		"\b\u00a8\1\2\u08d0\u08d5\7\u00a9\2\2\u08d1\u08d2\b\u00a8\1\2\u08d2\u08d3"+
		"\7\u00aa\2\2\u08d3\u08d5\7\u00e3\2\2\u08d4\u08c6\3\2\2\2\u08d4\u08cb\3"+
		"\2\2\2\u08d4\u08cf\3\2\2\2\u08d4\u08d1\3\2\2\2\u08d5\u014f\3\2\2\2\u08d6"+
		"\u08d7\5\u014e\u00a8\2\u08d7\u08d8\7\2\2\3\u08d8\u0151\3\2\2\2\u08d9\u08da"+
		"\b\u00aa\1\2\u08da\u08db\5\26\f\2\u08db\u08dc\b\u00aa\1\2\u08dc\u08dd"+
		"\7\u00cf\2\2\u08dd\u08de\5\u0152\u00aa\2\u08de\u08df\b\u00aa\1\2\u08df"+
		"\u08e8\3\2\2\2\u08e0\u08e1\b\u00aa\1\2\u08e1\u08e8\b\u00aa\1\2\u08e2\u08e3"+
		"\b\u00aa\1\2\u08e3\u08e8\7\u00ab\2\2\u08e4\u08e5\b\u00aa\1\2\u08e5\u08e6"+
		"\7\u00ac\2\2\u08e6\u08e8\7\u00e3\2\2\u08e7\u08d9\3\2\2\2\u08e7\u08e0\3"+
		"\2\2\2\u08e7\u08e2\3\2\2\2\u08e7\u08e4\3\2\2\2\u08e8\u0153\3\2\2\2\u08e9"+
		"\u08ea\5\u0152\u00aa\2\u08ea\u08eb\7\2\2\3\u08eb\u0155\3\2\2\2\u08ec\u08ed"+
		"\b\u00ac\1\2\u08ed\u08ee\b\u00ac\1\2\u08ee\u08ef\7\u00c2\2\2\u08ef\u08fa"+
		"\b\u00ac\1\2\u08f0\u08f1\b\u00ac\1\2\u08f1\u08f2\b\u00ac\1\2\u08f2\u08f3"+
		"\7\u00d4\2\2\u08f3\u08fa\b\u00ac\1\2\u08f4\u08f5\b\u00ac\1\2\u08f5\u08fa"+
		"\7\u00ad\2\2\u08f6\u08f7\b\u00ac\1\2\u08f7\u08f8\7\u00ae\2\2\u08f8\u08fa"+
		"\7\u00e3\2\2\u08f9\u08ec\3\2\2\2\u08f9\u08f0\3\2\2\2\u08f9\u08f4\3\2\2"+
		"\2\u08f9\u08f6\3\2\2\2\u08fa\u0157\3\2\2\2\u08fb\u08fc\5\u0156\u00ac\2"+
		"\u08fc\u08fd\7\2\2\3\u08fd\u0159\3\2\2\2\u08fe\u08ff\b\u00ae\1\2\u08ff"+
		"\u0900\5\u014e\u00a8\2\u0900\u0901\5\u015e\u00b0\2\u0901\u0902\b\u00ae"+
		"\1\2\u0902\u0915\3\2\2\2\u0903\u0904\b\u00ae\1\2\u0904\u0905\5\u0172\u00ba"+
		"\2\u0905\u0906\b\u00ae\1\2\u0906\u0915\3\2\2\2\u0907\u0908\b\u00ae\1\2"+
		"\u0908\u0909\5\u00b6\\\2\u0909\u090a\b\u00ae\1\2\u090a\u0915\3\2\2\2\u090b"+
		"\u090c\b\u00ae\1\2\u090c\u090d\5\u00caf\2\u090d\u090e\b\u00ae\1\2\u090e"+
		"\u0915\3\2\2\2\u090f\u0910\b\u00ae\1\2\u0910\u0915\7\u00af\2\2\u0911\u0912"+
		"\b\u00ae\1\2\u0912\u0913\7\u00b0\2\2\u0913\u0915\7\u00e3\2\2\u0914\u08fe"+
		"\3\2\2\2\u0914\u0903\3\2\2\2\u0914\u0907\3\2\2\2\u0914\u090b\3\2\2\2\u0914"+
		"\u090f\3\2\2\2\u0914\u0911\3\2\2\2\u0915\u015b\3\2\2\2\u0916\u0917\5\u015a"+
		"\u00ae\2\u0917\u0918\7\2\2\3\u0918\u015d\3\2\2\2\u0919\u091a\b\u00b0\1"+
		"\2\u091a\u091c\b\u00b0\1\2\u091b\u091d\5\u0162\u00b2\2\u091c\u091b\3\2"+
		"\2\2\u091c\u091d\3\2\2\2\u091d\u0926\3\2\2\2\u091e\u0924\b\u00b0\1\2\u091f"+
		"\u0920\b\u00b0\1\2\u0920\u0925\7\u00b1\2\2\u0921\u0922\b\u00b0\1\2\u0922"+
		"\u0923\7\u00b2\2\2\u0923\u0925\7\u00e3\2\2\u0924\u091f\3\2\2\2\u0924\u0921"+
		"\3\2\2\2\u0925\u0927\3\2\2\2\u0926\u091e\3\2\2\2\u0926\u0927\3\2\2\2\u0927"+
		"\u0928\3\2\2\2\u0928\u0929\b\u00b0\1\2\u0929\u0930\b\u00b0\1\2\u092a\u092b"+
		"\b\u00b0\1\2\u092b\u0930\7\u00b1\2\2\u092c\u092d\b\u00b0\1\2\u092d\u092e"+
		"\7\u00b2\2\2\u092e\u0930\7\u00e3\2\2\u092f\u0919\3\2\2\2\u092f\u092a\3"+
		"\2\2\2\u092f\u092c\3\2\2\2\u0930\u015f\3\2\2\2\u0931\u0932\5\u015e\u00b0"+
		"\2\u0932\u0933\7\2\2\3\u0933\u0161\3\2\2\2\u0934\u0935\b\u00b2\1\2\u0935"+
		"\u0936\b\u00b2\1\2\u0936\u0937\7\u00c9\2\2\u0937\u0938\5\u0166\u00b4\2"+
		"\u0938\u0939\b\u00b2\1\2\u0939\u093a\7\u00ca\2\2\u093a\u093b\b\u00b2\1"+
		"\2\u093b\u0942\3\2\2\2\u093c\u093d\b\u00b2\1\2\u093d\u0942\7\u00b3\2\2"+
		"\u093e\u093f\b\u00b2\1\2\u093f\u0940\7\u00b4\2\2\u0940\u0942\7\u00e3\2"+
		"\2\u0941\u0934\3\2\2\2\u0941\u093c\3\2\2\2\u0941\u093e\3\2\2\2\u0942\u0163"+
		"\3\2\2\2\u0943\u0944\5\u0162\u00b2\2\u0944\u0945\7\2\2\3\u0945\u0165\3"+
		"\2\2\2\u0946\u0947\b\u00b4\1\2\u0947\u0949\b\u00b4\1\2\u0948\u094a\5\u016a"+
		"\u00b6\2\u0949\u0948\3\2\2\2\u0949\u094a\3\2\2\2\u094a\u0953\3\2\2\2\u094b"+
		"\u0951\b\u00b4\1\2\u094c\u094d\b\u00b4\1\2\u094d\u0952\7\u00b5\2\2\u094e"+
		"\u094f\b\u00b4\1\2\u094f\u0950\7\u00b6\2\2\u0950\u0952\7\u00e3\2\2\u0951"+
		"\u094c\3\2\2\2\u0951\u094e\3\2\2\2\u0952\u0954\3\2\2\2\u0953\u094b\3\2"+
		"\2\2\u0953\u0954\3\2\2\2\u0954\u0955\3\2\2\2\u0955\u0956\b\u00b4\1\2\u0956"+
		"\u095d\b\u00b4\1\2\u0957\u0958\b\u00b4\1\2\u0958\u095d\7\u00b5\2\2\u0959"+
		"\u095a\b\u00b4\1\2\u095a\u095b\7\u00b6\2\2\u095b\u095d\7\u00e3\2\2\u095c"+
		"\u0946\3\2\2\2\u095c\u0957\3\2\2\2\u095c\u0959\3\2\2\2\u095d\u0167\3\2"+
		"\2\2\u095e\u095f\5\u0166\u00b4\2\u095f\u0960\7\2\2\3\u0960\u0169\3\2\2"+
		"\2\u0961\u0962\b\u00b6\1\2\u0962\u0963\5\u016e\u00b8\2\u0963\u0964\b\u00b6"+
		"\1\2\u0964\u096b\3\2\2\2\u0965\u0966\b\u00b6\1\2\u0966\u096b\7\u00b7\2"+
		"\2\u0967\u0968\b\u00b6\1\2\u0968\u0969\7\u00b8\2\2\u0969\u096b\7\u00e3"+
		"\2\2\u096a\u0961\3\2\2\2\u096a\u0965\3\2\2\2\u096a\u0967\3\2\2\2\u096b"+
		"\u016b\3\2\2\2\u096c\u096d\5\u016a\u00b6\2\u096d\u096e\7\2\2\3\u096e\u016d"+
		"\3\2\2\2\u096f\u0970\b\u00b8\1\2\u0970\u0971\b\u00b8\1\2\u0971\u0977\5"+
		"\u015a\u00ae\2\u0972\u0973\b\u00b8\1\2\u0973\u0974\7\u00cc\2\2\u0974\u0976"+
		"\5\u015a\u00ae\2\u0975\u0972\3\2\2\2\u0976\u0979\3\2\2\2\u0977\u0975\3"+
		"\2\2\2\u0977\u0978\3\2\2\2\u0978\u0982\3\2\2\2\u0979\u0977\3\2\2\2\u097a"+
		"\u0980\b\u00b8\1\2\u097b\u097c\b\u00b8\1\2\u097c\u0981\7\u00b9\2\2\u097d"+
		"\u097e\b\u00b8\1\2\u097e\u097f\7\u00ba\2\2\u097f\u0981\7\u00e3\2\2\u0980"+
		"\u097b\3\2\2\2\u0980\u097d\3\2\2\2\u0981\u0983\3\2\2\2\u0982\u097a\3\2"+
		"\2\2\u0982\u0983\3\2\2\2\u0983\u0984\3\2\2\2\u0984\u0985\b\u00b8\1\2\u0985"+
		"\u0986\b\u00b8\1\2\u0986\u098d\3\2\2\2\u0987\u0988\b\u00b8\1\2\u0988\u098d"+
		"\7\u00b9\2\2\u0989\u098a\b\u00b8\1\2\u098a\u098b\7\u00ba\2\2\u098b\u098d"+
		"\7\u00e3\2\2\u098c\u096f\3\2\2\2\u098c\u0987\3\2\2\2\u098c\u0989\3\2\2"+
		"\2\u098d\u016f\3\2\2\2\u098e\u0992\5\u016e\u00b8\2\u098f\u0990\b\u00b9"+
		"\1\2\u0990\u0992\b\u00b9\1\2\u0991\u098e\3\2\2\2\u0991\u098f\3\2\2\2\u0992"+
		"\u0993\3\2\2\2\u0993\u0994\7\2\2\3\u0994\u0171\3\2\2\2\u0995\u0996\b\u00ba"+
		"\1\2\u0996\u0997\b\u00ba\1\2\u0997\u0998\7\u00c5\2\2\u0998\u0999\5\6\4"+
		"\2\u0999\u099a\b\u00ba\1\2\u099a\u099b\7\u00c6\2\2\u099b\u099c\b\u00ba"+
		"\1\2\u099c\u09a3\3\2\2\2\u099d\u099e\b\u00ba\1\2\u099e\u09a3\7\u00bb\2"+
		"\2\u099f\u09a0\b\u00ba\1\2\u09a0\u09a1\7\u00bc\2\2\u09a1\u09a3\7\u00e3"+
		"\2\2\u09a2\u0995\3\2\2\2\u09a2\u099d\3\2\2\2\u09a2\u099f\3\2\2\2\u09a3"+
		"\u0173\3\2\2\2\u09a4\u09a5\5\u0172\u00ba\2\u09a5\u09a6\7\2\2\3\u09a6\u0175"+
		"\3\2\2\2\u00c5\u017f\u018d\u0197\u01a0\u01a2\u01ab\u01b0\u01db\u01f0\u01fd"+
		"\u021d\u022f\u0237\u023f\u0241\u024a\u025f\u0267\u026f\u0271\u027a\u028a"+
		"\u0292\u029a\u029c\u02a5\u02b3\u02c1\u02cb\u02d3\u02d5\u02df\u02e4\u02f4"+
		"\u0306\u0345\u034d\u0355\u0357\u0360\u036d\u0375\u037d\u037f\u0388\u0397"+
		"\u03ac\u03be\u03c6\u03ce\u03d0\u03d9\u03e7\u03f4\u03fd\u03ff\u0409\u040e"+
		"\u041f\u0427\u042f\u0431\u043a\u0448\u0455\u045e\u0460\u046a\u046f\u0480"+
		"\u0488\u0490\u0492\u049b\u04aa\u04b7\u04c0\u04c2\u04cc\u04d1\u04d8\u04e0"+
		"\u04e2\u04eb\u04f9\u050b\u0513\u051b\u051d\u0526\u0533\u053b\u0543\u0545"+
		"\u054e\u0556\u055e\u0560\u0569\u0577\u0585\u0597\u05a4\u05b1\u05c0\u05d0"+
		"\u05ee\u05fb\u0608\u0615\u0622\u062f\u0641\u0649\u0651\u0653\u065c\u066a"+
		"\u0678\u0685\u068e\u0690\u069a\u069f\u06ac\u06ba\u06cc\u06d4\u06dc\u06de"+
		"\u06e7\u06f5\u0700\u0704\u070d\u070f\u0719\u071e\u0761\u076f\u078f\u0797"+
		"\u079f\u07a1\u07aa\u07bc\u07c6\u07ce\u07d0\u07da\u07df\u07ec\u07fa\u0807"+
		"\u0810\u0812\u081c\u0821\u0833\u083b\u0843\u0845\u084e\u0860\u0868\u0870"+
		"\u0872\u087b\u0889\u0896\u089f\u08a1\u08aa\u08af\u08c1\u08d4\u08e7\u08f9"+
		"\u0914\u091c\u0924\u0926\u092f\u0941\u0949\u0951\u0953\u095c\u096a\u0977"+
		"\u0980\u0982\u098c\u0991\u09a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}