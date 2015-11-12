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
import static org.crsx.pg.SinkAntlrListener.fireEnterSymbol;
import static org.crsx.pg.SinkAntlrListener.fireExitSymbol;
import static org.crsx.pg.SinkAntlrListener.fireEnterBinder;
import static org.crsx.pg.SinkAntlrListener.fireExitBinder;
import static org.crsx.pg.SinkAntlrListener.fireEnterBinds;
import static org.crsx.pg.SinkAntlrListener.fireExitBinds;
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
		MT_crsx=1, ET_crsx=2, MT_decls=3, ET_decls=4, MT_decl_ZOM=5, ET_decl_ZOM=6, 
		MT_decl=7, ET_decl=8, MT_moduleDecl=9, ET_moduleDecl=10, MT_constructor_TOK=11, 
		ET_constructor_TOK=12, MT_importDecl=13, ET_importDecl=14, MT_sortDecl=15, 
		ET_sortDecl=16, MT_sortparams_OPT=17, ET_sortparams_OPT=18, MT_termDecl=19, 
		ET_termDecl=20, MT_option_OPT=21, ET_option_OPT=22, MT_contractum_OPT=23, 
		ET_contractum_OPT=24, MT_option=25, ET_option=26, MT_args_OPT=27, ET_args_OPT=28, 
		MT_annotation=29, ET_annotation=30, MT_contractum=31, ET_contractum=32, 
		MT_term=33, ET_term=34, MT_sargs_OPT=35, ET_sargs_OPT=36, MT_annotation_OOM=37, 
		ET_annotation_OOM=38, MT_metavar_TOK=39, ET_metavar_TOK=40, MT_scope=41, 
		ET_scope=42, MT_binders=43, ET_binders=44, MT_annotation_ZOM=45, ET_annotation_ZOM=46, 
		MT_variable_TOK=47, ET_variable_TOK=48, MT_linear_TOK_OPT=49, ET_linear_TOK_OPT=50, 
		MT_functional_TOK_OPT=51, ET_functional_TOK_OPT=52, MT_varsort_OPT=53, 
		ET_varsort_OPT=54, MT_args=55, ET_args=56, MT_terms_OPT=57, ET_terms_OPT=58, 
		MT_terms=59, ET_terms=60, MT_term_ZOM=61, ET_term_ZOM=62, MT_sargs=63, 
		ET_sargs=64, MT_scopes_OPT=65, ET_scopes_OPT=66, MT_scopes=67, ET_scopes=68, 
		MT_scope_ZOM=69, ET_scope_ZOM=70, MT_list=71, ET_list=72, MT_variable=73, 
		ET_variable=74, MT_literal=75, ET_literal=76, MT_string_TOK=77, ET_string_TOK=78, 
		MT_number_TOK=79, ET_number_TOK=80, MT_varsort=81, ET_varsort=82, MT_concrete=83, 
		ET_concrete=84, MT_category_TOK=85, ET_category_TOK=86, MT_concrete_TOK=87, 
		ET_concrete_TOK=88, MT_concrete3_TOK=89, ET_concrete3_TOK=90, MT_concrete4_TOK=91, 
		ET_concrete4_TOK=92, MT_dispatch=93, ET_dispatch=94, MT_delay_TOK_OPT=95, 
		ET_delay_TOK_OPT=96, MT_dispatchCases=97, ET_dispatchCases=98, MT_properties=99, 
		ET_properties=100, MT_propertyList_OPT=101, ET_propertyList_OPT=102, MT_propertyList=103, 
		ET_propertyList=104, MT_property_ZOM=105, ET_property_ZOM=106, MT_property=107, 
		ET_property=108, MT_sortparams=109, ET_sortparams=110, MT_variable_OOM=111, 
		ET_variable_OOM=112, MT_sortset=113, ET_sortset=114, MT_properties_OPT=115, 
		ET_properties_OPT=116, MT_sortnames=117, ET_sortnames=118, MT_sortname_ZOM=119, 
		ET_sortname_ZOM=120, MT_sortname=121, ET_sortname=122, MT_sortargs_OPT=123, 
		ET_sortargs_OPT=124, MT_sortargs=125, ET_sortargs=126, MT_sortnames_OPT=127, 
		ET_sortnames_OPT=128, MT_forms=129, ET_forms=130, MT_form_ZOM=131, ET_form_ZOM=132, 
		MT_form=133, ET_form=134, MT_constructor=135, ET_constructor=136, MT_qualifier=137, 
		ET_qualifier=138, MT_reserved=139, ET_reserved=140, MODULE=141, IMPORT=142, 
		DISPATCH=143, DELAY=144, GRAMMAR=145, COLON=146, ARROW=147, FORALL=148, 
		LPAR=149, RPAR=150, LBRACE=151, RBRACE=152, LSQUARE=153, RSQUARE=154, 
		SEMI=155, COMMA=156, DATASORT=157, COLONCOLON=158, DOT=159, DOTDOT=160, 
		NOT=161, LINEAR=162, FUNCTIONAL=163, AND=164, AT=165, CATEGORY=166, CONCRETE=167, 
		CONCRETE3=168, CONCRETE4=169, CONSTRUCTOR=170, VARIABLE=171, METAVAR=172, 
		STRING=173, NUMBER=174, WS=175, BLOCK_COMMENT=176, LINE_COMMENT=177, XML_COMMENT=178, 
		CRSX_EMBED_END=179;
	public static final int
		RULE_crsx = 0, RULE_crsx_EOF = 1, RULE_decls = 2, RULE_decls_EOF = 3, 
		RULE_decl_ZOM = 4, RULE_decl_ZOM_EOF = 5, RULE_decl = 6, RULE_decl_EOF = 7, 
		RULE_moduleDecl = 8, RULE_moduleDecl_EOF = 9, RULE_constructor_TOK = 10, 
		RULE_constructor_TOK_EOF = 11, RULE_importDecl = 12, RULE_importDecl_EOF = 13, 
		RULE_sortDecl = 14, RULE_sortDecl_EOF = 15, RULE_sortparams_OPT = 16, 
		RULE_sortparams_OPT_EOF = 17, RULE_termDecl = 18, RULE_termDecl_EOF = 19, 
		RULE_option_OPT = 20, RULE_option_OPT_EOF = 21, RULE_contractum_OPT = 22, 
		RULE_contractum_OPT_EOF = 23, RULE_option = 24, RULE_option_EOF = 25, 
		RULE_args_OPT = 26, RULE_args_OPT_EOF = 27, RULE_annotation = 28, RULE_annotation_EOF = 29, 
		RULE_contractum = 30, RULE_contractum_EOF = 31, RULE_term = 32, RULE_term_EOF = 33, 
		RULE_sargs_OPT = 34, RULE_sargs_OPT_EOF = 35, RULE_annotation_OOM = 36, 
		RULE_annotation_OOM_EOF = 37, RULE_metavar_TOK = 38, RULE_metavar_TOK_EOF = 39, 
		RULE_scope = 40, RULE_scope_EOF = 41, RULE_binders = 42, RULE_binders_EOF = 43, 
		RULE_annotation_ZOM = 44, RULE_annotation_ZOM_EOF = 45, RULE_variable_TOK = 46, 
		RULE_variable_TOK_EOF = 47, RULE_linear_TOK_OPT = 48, RULE_linear_TOK_OPT_EOF = 49, 
		RULE_functional_TOK_OPT = 50, RULE_functional_TOK_OPT_EOF = 51, RULE_varsort_OPT = 52, 
		RULE_varsort_OPT_EOF = 53, RULE_args = 54, RULE_args_EOF = 55, RULE_terms_OPT = 56, 
		RULE_terms_OPT_EOF = 57, RULE_terms = 58, RULE_terms_EOF = 59, RULE_term_ZOM = 60, 
		RULE_term_ZOM_EOF = 61, RULE_sargs = 62, RULE_sargs_EOF = 63, RULE_scopes_OPT = 64, 
		RULE_scopes_OPT_EOF = 65, RULE_scopes = 66, RULE_scopes_EOF = 67, RULE_scope_ZOM = 68, 
		RULE_scope_ZOM_EOF = 69, RULE_list = 70, RULE_list_EOF = 71, RULE_variable = 72, 
		RULE_variable_EOF = 73, RULE_literal = 74, RULE_literal_EOF = 75, RULE_string_TOK = 76, 
		RULE_string_TOK_EOF = 77, RULE_number_TOK = 78, RULE_number_TOK_EOF = 79, 
		RULE_varsort = 80, RULE_varsort_EOF = 81, RULE_concrete = 82, RULE_concrete_EOF = 83, 
		RULE_category_TOK = 84, RULE_category_TOK_EOF = 85, RULE_concrete_TOK = 86, 
		RULE_concrete_TOK_EOF = 87, RULE_concrete3_TOK = 88, RULE_concrete3_TOK_EOF = 89, 
		RULE_concrete4_TOK = 90, RULE_concrete4_TOK_EOF = 91, RULE_dispatch = 92, 
		RULE_dispatch_EOF = 93, RULE_delay_TOK_OPT = 94, RULE_delay_TOK_OPT_EOF = 95, 
		RULE_dispatchCases = 96, RULE_dispatchCases_EOF = 97, RULE_properties = 98, 
		RULE_properties_EOF = 99, RULE_propertyList_OPT = 100, RULE_propertyList_OPT_EOF = 101, 
		RULE_propertyList = 102, RULE_propertyList_EOF = 103, RULE_property_ZOM = 104, 
		RULE_property_ZOM_EOF = 105, RULE_property = 106, RULE_property_EOF = 107, 
		RULE_sortparams = 108, RULE_sortparams_EOF = 109, RULE_variable_OOM = 110, 
		RULE_variable_OOM_EOF = 111, RULE_sortset = 112, RULE_sortset_EOF = 113, 
		RULE_properties_OPT = 114, RULE_properties_OPT_EOF = 115, RULE_sortnames = 116, 
		RULE_sortnames_EOF = 117, RULE_sortname_ZOM = 118, RULE_sortname_ZOM_EOF = 119, 
		RULE_sortname = 120, RULE_sortname_EOF = 121, RULE_sortargs_OPT = 122, 
		RULE_sortargs_OPT_EOF = 123, RULE_sortargs = 124, RULE_sortargs_EOF = 125, 
		RULE_sortnames_OPT = 126, RULE_sortnames_OPT_EOF = 127, RULE_forms = 128, 
		RULE_forms_EOF = 129, RULE_form_ZOM = 130, RULE_form_ZOM_EOF = 131, RULE_form = 132, 
		RULE_form_EOF = 133, RULE_constructor = 134, RULE_constructor_EOF = 135, 
		RULE_qualifier = 136, RULE_qualifier_EOF = 137, RULE_reserved = 138, RULE_reserved_EOF = 139;
	public static final String[] ruleNames = {
		"crsx", "crsx_EOF", "decls", "decls_EOF", "decl_ZOM", "decl_ZOM_EOF", 
		"decl", "decl_EOF", "moduleDecl", "moduleDecl_EOF", "constructor_TOK", 
		"constructor_TOK_EOF", "importDecl", "importDecl_EOF", "sortDecl", "sortDecl_EOF", 
		"sortparams_OPT", "sortparams_OPT_EOF", "termDecl", "termDecl_EOF", "option_OPT", 
		"option_OPT_EOF", "contractum_OPT", "contractum_OPT_EOF", "option", "option_EOF", 
		"args_OPT", "args_OPT_EOF", "annotation", "annotation_EOF", "contractum", 
		"contractum_EOF", "term", "term_EOF", "sargs_OPT", "sargs_OPT_EOF", "annotation_OOM", 
		"annotation_OOM_EOF", "metavar_TOK", "metavar_TOK_EOF", "scope", "scope_EOF", 
		"binders", "binders_EOF", "annotation_ZOM", "annotation_ZOM_EOF", "variable_TOK", 
		"variable_TOK_EOF", "linear_TOK_OPT", "linear_TOK_OPT_EOF", "functional_TOK_OPT", 
		"functional_TOK_OPT_EOF", "varsort_OPT", "varsort_OPT_EOF", "args", "args_EOF", 
		"terms_OPT", "terms_OPT_EOF", "terms", "terms_EOF", "term_ZOM", "term_ZOM_EOF", 
		"sargs", "sargs_EOF", "scopes_OPT", "scopes_OPT_EOF", "scopes", "scopes_EOF", 
		"scope_ZOM", "scope_ZOM_EOF", "list", "list_EOF", "variable", "variable_EOF", 
		"literal", "literal_EOF", "string_TOK", "string_TOK_EOF", "number_TOK", 
		"number_TOK_EOF", "varsort", "varsort_EOF", "concrete", "concrete_EOF", 
		"category_TOK", "category_TOK_EOF", "concrete_TOK", "concrete_TOK_EOF", 
		"concrete3_TOK", "concrete3_TOK_EOF", "concrete4_TOK", "concrete4_TOK_EOF", 
		"dispatch", "dispatch_EOF", "delay_TOK_OPT", "delay_TOK_OPT_EOF", "dispatchCases", 
		"dispatchCases_EOF", "properties", "properties_EOF", "propertyList_OPT", 
		"propertyList_OPT_EOF", "propertyList", "propertyList_EOF", "property_ZOM", 
		"property_ZOM_EOF", "property", "property_EOF", "sortparams", "sortparams_EOF", 
		"variable_OOM", "variable_OOM_EOF", "sortset", "sortset_EOF", "properties_OPT", 
		"properties_OPT_EOF", "sortnames", "sortnames_EOF", "sortname_ZOM", "sortname_ZOM_EOF", 
		"sortname", "sortname_EOF", "sortargs_OPT", "sortargs_OPT_EOF", "sortargs", 
		"sortargs_EOF", "sortnames_OPT", "sortnames_OPT_EOF", "forms", "forms_EOF", 
		"form_ZOM", "form_ZOM_EOF", "form", "form_EOF", "constructor", "constructor_EOF", 
		"qualifier", "qualifier_EOF", "reserved", "reserved_EOF"
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
		null, null, null, null, null, null, null, null, null, "'module'", "'import'", 
		"'dispatch'", "'delay'", "'grammar'", "':'", "'→'", "'∀'", "'('", "')'", 
		"'{'", "'}'", "'['", "']'", "';'", "','", "'::='", "'::'", "'.'", "'..'", 
		"'¬'", "'¹'", "'ᵇ'", "'&'", "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MT_crsx", "ET_crsx", "MT_decls", "ET_decls", "MT_decl_ZOM", "ET_decl_ZOM", 
		"MT_decl", "ET_decl", "MT_moduleDecl", "ET_moduleDecl", "MT_constructor_TOK", 
		"ET_constructor_TOK", "MT_importDecl", "ET_importDecl", "MT_sortDecl", 
		"ET_sortDecl", "MT_sortparams_OPT", "ET_sortparams_OPT", "MT_termDecl", 
		"ET_termDecl", "MT_option_OPT", "ET_option_OPT", "MT_contractum_OPT", 
		"ET_contractum_OPT", "MT_option", "ET_option", "MT_args_OPT", "ET_args_OPT", 
		"MT_annotation", "ET_annotation", "MT_contractum", "ET_contractum", "MT_term", 
		"ET_term", "MT_sargs_OPT", "ET_sargs_OPT", "MT_annotation_OOM", "ET_annotation_OOM", 
		"MT_metavar_TOK", "ET_metavar_TOK", "MT_scope", "ET_scope", "MT_binders", 
		"ET_binders", "MT_annotation_ZOM", "ET_annotation_ZOM", "MT_variable_TOK", 
		"ET_variable_TOK", "MT_linear_TOK_OPT", "ET_linear_TOK_OPT", "MT_functional_TOK_OPT", 
		"ET_functional_TOK_OPT", "MT_varsort_OPT", "ET_varsort_OPT", "MT_args", 
		"ET_args", "MT_terms_OPT", "ET_terms_OPT", "MT_terms", "ET_terms", "MT_term_ZOM", 
		"ET_term_ZOM", "MT_sargs", "ET_sargs", "MT_scopes_OPT", "ET_scopes_OPT", 
		"MT_scopes", "ET_scopes", "MT_scope_ZOM", "ET_scope_ZOM", "MT_list", "ET_list", 
		"MT_variable", "ET_variable", "MT_literal", "ET_literal", "MT_string_TOK", 
		"ET_string_TOK", "MT_number_TOK", "ET_number_TOK", "MT_varsort", "ET_varsort", 
		"MT_concrete", "ET_concrete", "MT_category_TOK", "ET_category_TOK", "MT_concrete_TOK", 
		"ET_concrete_TOK", "MT_concrete3_TOK", "ET_concrete3_TOK", "MT_concrete4_TOK", 
		"ET_concrete4_TOK", "MT_dispatch", "ET_dispatch", "MT_delay_TOK_OPT", 
		"ET_delay_TOK_OPT", "MT_dispatchCases", "ET_dispatchCases", "MT_properties", 
		"ET_properties", "MT_propertyList_OPT", "ET_propertyList_OPT", "MT_propertyList", 
		"ET_propertyList", "MT_property_ZOM", "ET_property_ZOM", "MT_property", 
		"ET_property", "MT_sortparams", "ET_sortparams", "MT_variable_OOM", "ET_variable_OOM", 
		"MT_sortset", "ET_sortset", "MT_properties_OPT", "ET_properties_OPT", 
		"MT_sortnames", "ET_sortnames", "MT_sortname_ZOM", "ET_sortname_ZOM", 
		"MT_sortname", "ET_sortname", "MT_sortargs_OPT", "ET_sortargs_OPT", "MT_sortargs", 
		"ET_sortargs", "MT_sortnames_OPT", "ET_sortnames_OPT", "MT_forms", "ET_forms", 
		"MT_form_ZOM", "ET_form_ZOM", "MT_form", "ET_form", "MT_constructor", 
		"ET_constructor", "MT_qualifier", "ET_qualifier", "MT_reserved", "ET_reserved", 
		"MODULE", "IMPORT", "DISPATCH", "DELAY", "GRAMMAR", "COLON", "ARROW", 
		"FORALL", "LPAR", "RPAR", "LBRACE", "RBRACE", "LSQUARE", "RSQUARE", "SEMI", 
		"COMMA", "DATASORT", "COLONCOLON", "DOT", "DOTDOT", "NOT", "LINEAR", "FUNCTIONAL", 
		"AND", "AT", "CATEGORY", "CONCRETE", "CONCRETE3", "CONCRETE4", "CONSTRUCTOR", 
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
	protected void _enterSymbol()  { fireEnterSymbol(_parseListeners, _ctx); }
	protected void _exitSymbol()     { fireExitSymbol(_parseListeners, _ctx); }
	protected void _enterBinder(String name)     { fireEnterBinder(_parseListeners, _ctx, name); }
	protected void _exitBinder()     { fireExitBinder(_parseListeners, _ctx); }
	protected void _enterBinds(String names) { fireEnterBinds(_parseListeners, _ctx, names); }
	protected void _exitBinds()  { fireExitBinds(_parseListeners, _ctx); }
	protected void _embed()    { fireEmbed(_parseListeners, _ctx); }
	protected void _tail()     { fireTail(_parseListeners, _ctx); }
	protected void _term()     { fireTerm(_parseListeners, _ctx); }
	protected String _metachar() { return "##";}

	public CrsxMetaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CrsxContext extends ParserRuleContext {
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
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
			setState(289);
			switch (_input.LA(1)) {
			case EOF:
			case MT_decls:
			case ET_decls:
			case MT_decl_ZOM:
			case ET_decl_ZOM:
			case MT_decl:
			case ET_decl:
			case MT_moduleDecl:
			case ET_moduleDecl:
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_importDecl:
			case ET_importDecl:
			case MT_sortDecl:
			case ET_sortDecl:
			case MT_sortparams_OPT:
			case ET_sortparams_OPT:
			case MT_termDecl:
			case ET_termDecl:
			case MT_option_OPT:
			case ET_option_OPT:
			case MT_option:
			case ET_option:
			case MT_annotation:
			case ET_annotation:
			case MT_term:
			case ET_term:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_metavar_TOK:
			case ET_metavar_TOK:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_list:
			case ET_list:
			case MT_variable:
			case ET_variable:
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
			case MT_sortparams:
			case ET_sortparams:
			case MT_sortset:
			case ET_sortset:
			case MT_properties_OPT:
			case ET_properties_OPT:
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
			case MODULE:
			case IMPORT:
			case DISPATCH:
			case COLON:
			case FORALL:
			case LPAR:
			case LBRACE:
			case SEMI:
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
				setState(281);
				decls();
				_exitAlt();
				}
				break;
			case MT_crsx:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(285);
				match(MT_crsx);
				}
				break;
			case ET_crsx:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(287);
				match(ET_crsx);
				setState(288);
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
			setState(291);
			crsx();
			setState(292);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclsContext extends ParserRuleContext {
		public Decl_ZOMContext decl_ZOM() {
			return getRuleContext(Decl_ZOMContext.class,0);
		}
		public TerminalNode MT_decls() { return getToken(CrsxMetaParser.MT_decls, 0); }
		public TerminalNode ET_decls() { return getToken(CrsxMetaParser.ET_decls, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDecls(this);
		}
	}

	public final DeclsContext decls() throws RecognitionException {
		DeclsContext _localctx = new DeclsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decls);
		try {
			setState(303);
			switch (_input.LA(1)) {
			case EOF:
			case MT_decl_ZOM:
			case ET_decl_ZOM:
			case MT_decl:
			case ET_decl:
			case MT_moduleDecl:
			case ET_moduleDecl:
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_importDecl:
			case ET_importDecl:
			case MT_sortDecl:
			case ET_sortDecl:
			case MT_sortparams_OPT:
			case ET_sortparams_OPT:
			case MT_termDecl:
			case ET_termDecl:
			case MT_option_OPT:
			case ET_option_OPT:
			case MT_option:
			case ET_option:
			case MT_annotation:
			case ET_annotation:
			case MT_term:
			case ET_term:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_metavar_TOK:
			case ET_metavar_TOK:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_list:
			case ET_list:
			case MT_variable:
			case ET_variable:
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
			case MT_sortparams:
			case ET_sortparams:
			case MT_sortset:
			case ET_sortset:
			case MT_properties_OPT:
			case ET_properties_OPT:
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
			case MODULE:
			case IMPORT:
			case DISPATCH:
			case COLON:
			case FORALL:
			case LPAR:
			case RPAR:
			case LBRACE:
			case RBRACE:
			case SEMI:
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
				setState(295);
				decl_ZOM();
				_exitAlt();
				}
				break;
			case MT_decls:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(299);
				match(MT_decls);
				}
				break;
			case ET_decls:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(301);
				match(ET_decls);
				setState(302);
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

	public static class Decls_EOFContext extends ParserRuleContext {
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Decls_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDecls_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDecls_EOF(this);
		}
	}

	public final Decls_EOFContext decls_EOF() throws RecognitionException {
		Decls_EOFContext _localctx = new Decls_EOFContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decls_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			decls();
			setState(306);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_ZOMContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CrsxMetaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CrsxMetaParser.SEMI, i);
		}
		public TerminalNode MT_decl_ZOM() { return getToken(CrsxMetaParser.MT_decl_ZOM, 0); }
		public TerminalNode ET_decl_ZOM() { return getToken(CrsxMetaParser.ET_decl_ZOM, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Decl_ZOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_ZOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDecl_ZOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDecl_ZOM(this);
		}
	}

	public final Decl_ZOMContext decl_ZOM() throws RecognitionException {
		Decl_ZOMContext _localctx = new Decl_ZOMContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decl_ZOM);
		int _la;
		try {
			setState(337);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterZOM();
				setState(310);
				decl();
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					_hide();
					setState(312);
					match(SEMI);
					setState(313);
					decl();
					}
					}
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(327);
				_la = _input.LA(1);
				if (_la==MT_decl_ZOM || _la==ET_decl_ZOM) {
					{
					_tail();
					setState(325);
					switch (_input.LA(1)) {
					case MT_decl_ZOM:
						{
						_term();
						setState(321);
						match(MT_decl_ZOM);
						}
						break;
					case ET_decl_ZOM:
						{
						_embed();
						setState(323);
						match(ET_decl_ZOM);
						setState(324);
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
				setState(333);
				match(MT_decl_ZOM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(335);
				match(ET_decl_ZOM);
				setState(336);
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

	public static class Decl_ZOM_EOFContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Decl_ZOMContext decl_ZOM() {
			return getRuleContext(Decl_ZOMContext.class,0);
		}
		public Decl_ZOM_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_ZOM_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDecl_ZOM_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDecl_ZOM_EOF(this);
		}
	}

	public final Decl_ZOM_EOFContext decl_ZOM_EOF() throws RecognitionException {
		Decl_ZOM_EOFContext _localctx = new Decl_ZOM_EOFContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decl_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(339);
				decl_ZOM();
				}
				break;
			case 2:
				{
				_enterZOM();
				_exitZOM();
				}
				break;
			}
			setState(344);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public ModuleDeclContext moduleDecl() {
			return getRuleContext(ModuleDeclContext.class,0);
		}
		public ImportDeclContext importDecl() {
			return getRuleContext(ImportDeclContext.class,0);
		}
		public SortDeclContext sortDecl() {
			return getRuleContext(SortDeclContext.class,0);
		}
		public TermDeclContext termDecl() {
			return getRuleContext(TermDeclContext.class,0);
		}
		public TerminalNode MT_decl() { return getToken(CrsxMetaParser.MT_decl, 0); }
		public TerminalNode ET_decl() { return getToken(CrsxMetaParser.ET_decl, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decl);
		try {
			setState(369);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(347);
				moduleDecl();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(351);
				importDecl();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(355);
				sortDecl();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(359);
				termDecl();
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_term();
				setState(365);
				match(MT_decl);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				_embed();
				setState(367);
				match(ET_decl);
				setState(368);
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

	public static class Decl_EOFContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Decl_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDecl_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDecl_EOF(this);
		}
	}

	public final Decl_EOFContext decl_EOF() throws RecognitionException {
		Decl_EOFContext _localctx = new Decl_EOFContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decl_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			decl();
			setState(372);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleDeclContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(CrsxMetaParser.MODULE, 0); }
		public Constructor_TOKContext constructor_TOK() {
			return getRuleContext(Constructor_TOKContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CrsxMetaParser.LBRACE, 0); }
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CrsxMetaParser.RBRACE, 0); }
		public TerminalNode MT_moduleDecl() { return getToken(CrsxMetaParser.MT_moduleDecl, 0); }
		public TerminalNode ET_moduleDecl() { return getToken(CrsxMetaParser.ET_moduleDecl, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public ModuleDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterModuleDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitModuleDecl(this);
		}
	}

	public final ModuleDeclContext moduleDecl() throws RecognitionException {
		ModuleDeclContext _localctx = new ModuleDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_moduleDecl);
		try {
			setState(390);
			switch (_input.LA(1)) {
			case MODULE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				_hide();
				setState(376);
				match(MODULE);
				setState(377);
				constructor_TOK();
				_hide();
				setState(379);
				match(LBRACE);
				setState(380);
				decls();
				_hide();
				setState(382);
				match(RBRACE);
				_exitAlt();
				}
				break;
			case MT_moduleDecl:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(386);
				match(MT_moduleDecl);
				}
				break;
			case ET_moduleDecl:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(388);
				match(ET_moduleDecl);
				setState(389);
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

	public static class ModuleDecl_EOFContext extends ParserRuleContext {
		public ModuleDeclContext moduleDecl() {
			return getRuleContext(ModuleDeclContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public ModuleDecl_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDecl_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterModuleDecl_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitModuleDecl_EOF(this);
		}
	}

	public final ModuleDecl_EOFContext moduleDecl_EOF() throws RecognitionException {
		ModuleDecl_EOFContext _localctx = new ModuleDecl_EOFContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_moduleDecl_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			moduleDecl();
			setState(393);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
			setState(403);
			switch (_input.LA(1)) {
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				match(CONSTRUCTOR);

				}
				break;
			case MT_constructor_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(399);
				match(MT_constructor_TOK);
				}
				break;
			case ET_constructor_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(401);
				match(ET_constructor_TOK);
				setState(402);
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
			setState(405);
			constructor_TOK();
			setState(406);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(CrsxMetaParser.IMPORT, 0); }
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public TerminalNode MODULE() { return getToken(CrsxMetaParser.MODULE, 0); }
		public TerminalNode GRAMMAR() { return getToken(CrsxMetaParser.GRAMMAR, 0); }
		public TerminalNode MT_importDecl() { return getToken(CrsxMetaParser.MT_importDecl, 0); }
		public TerminalNode ET_importDecl() { return getToken(CrsxMetaParser.ET_importDecl, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public ImportDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterImportDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitImportDecl(this);
		}
	}

	public final ImportDeclContext importDecl() throws RecognitionException {
		ImportDeclContext _localctx = new ImportDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_importDecl);
		try {
			setState(435);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_hide();
				setState(410);
				match(IMPORT);
				setState(411);
				constructor();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(416);
				match(IMPORT);
				_hide();
				setState(418);
				match(MODULE);
				setState(419);
				constructor();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				_hide();
				setState(424);
				match(IMPORT);
				_hide();
				setState(426);
				match(GRAMMAR);
				setState(427);
				constructor();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_term();
				setState(431);
				match(MT_importDecl);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_embed();
				setState(433);
				match(ET_importDecl);
				setState(434);
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

	public static class ImportDecl_EOFContext extends ParserRuleContext {
		public ImportDeclContext importDecl() {
			return getRuleContext(ImportDeclContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public ImportDecl_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDecl_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterImportDecl_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitImportDecl_EOF(this);
		}
	}

	public final ImportDecl_EOFContext importDecl_EOF() throws RecognitionException {
		ImportDecl_EOFContext _localctx = new ImportDecl_EOFContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_importDecl_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			importDecl();
			setState(438);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortDeclContext extends ParserRuleContext {
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
		public TerminalNode MT_sortDecl() { return getToken(CrsxMetaParser.MT_sortDecl, 0); }
		public TerminalNode ET_sortDecl() { return getToken(CrsxMetaParser.ET_sortDecl, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public SortDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortDecl(this);
		}
	}

	public final SortDeclContext sortDecl() throws RecognitionException {
		SortDeclContext _localctx = new SortDeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sortDecl);
		try {
			setState(467);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(441);
				sortparams_OPT();
				setState(442);
				sortset();
				setState(443);
				sortname();
				_hide();
				setState(445);
				match(DATASORT);
				_hide();
				setState(447);
				match(LPAR);
				setState(448);
				forms();
				_hide();
				setState(450);
				match(RPAR);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(454);
				sortparams_OPT();
				setState(455);
				sortset();
				setState(456);
				form();
				_hide();
				setState(458);
				match(COLONCOLON);
				setState(459);
				sortname();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(463);
				match(MT_sortDecl);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(465);
				match(ET_sortDecl);
				setState(466);
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

	public static class SortDecl_EOFContext extends ParserRuleContext {
		public SortDeclContext sortDecl() {
			return getRuleContext(SortDeclContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public SortDecl_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortDecl_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortDecl_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortDecl_EOF(this);
		}
	}

	public final SortDecl_EOFContext sortDecl_EOF() throws RecognitionException {
		SortDecl_EOFContext _localctx = new SortDecl_EOFContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sortDecl_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			sortDecl();
			setState(470);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 32, RULE_sortparams_OPT);
		int _la;
		try {
			setState(494);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(475);
				_la = _input.LA(1);
				if (((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (MT_sortparams - 109)) | (1L << (ET_sortparams - 109)) | (1L << (FORALL - 109)))) != 0)) {
					{
					setState(474);
					sortparams();
					}
				}

				setState(485);
				_la = _input.LA(1);
				if (_la==MT_sortparams_OPT || _la==ET_sortparams_OPT) {
					{
					_tail();
					setState(483);
					switch (_input.LA(1)) {
					case MT_sortparams_OPT:
						{
						_term();
						setState(479);
						match(MT_sortparams_OPT);
						}
						break;
					case ET_sortparams_OPT:
						{
						_embed();
						setState(481);
						match(ET_sortparams_OPT);
						setState(482);
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
				setState(490);
				match(MT_sortparams_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(492);
				match(ET_sortparams_OPT);
				setState(493);
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
		enterRule(_localctx, 34, RULE_sortparams_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			sortparams_OPT();
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

	public static class TermDeclContext extends ParserRuleContext {
		public Option_OPTContext option_OPT() {
			return getRuleContext(Option_OPTContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Contractum_OPTContext contractum_OPT() {
			return getRuleContext(Contractum_OPTContext.class,0);
		}
		public TerminalNode MT_termDecl() { return getToken(CrsxMetaParser.MT_termDecl, 0); }
		public TerminalNode ET_termDecl() { return getToken(CrsxMetaParser.ET_termDecl, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public TermDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterTermDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitTermDecl(this);
		}
	}

	public final TermDeclContext termDecl() throws RecognitionException {
		TermDeclContext _localctx = new TermDeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_termDecl);
		try {
			setState(510);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_option_OPT:
			case ET_option_OPT:
			case MT_option:
			case ET_option:
			case MT_annotation:
			case ET_annotation:
			case MT_term:
			case ET_term:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_metavar_TOK:
			case ET_metavar_TOK:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_list:
			case ET_list:
			case MT_variable:
			case ET_variable:
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
				setState(500);
				option_OPT();
				setState(501);
				term();
				setState(502);
				contractum_OPT();
				_exitAlt();
				}
				break;
			case MT_termDecl:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(506);
				match(MT_termDecl);
				}
				break;
			case ET_termDecl:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(508);
				match(ET_termDecl);
				setState(509);
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

	public static class TermDecl_EOFContext extends ParserRuleContext {
		public TermDeclContext termDecl() {
			return getRuleContext(TermDeclContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public TermDecl_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termDecl_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterTermDecl_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitTermDecl_EOF(this);
		}
	}

	public final TermDecl_EOFContext termDecl_EOF() throws RecognitionException {
		TermDecl_EOFContext _localctx = new TermDecl_EOFContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_termDecl_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			termDecl();
			setState(513);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 40, RULE_option_OPT);
		int _la;
		try {
			setState(537);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(518);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(517);
					option();
					}
					break;
				}
				setState(528);
				_la = _input.LA(1);
				if (_la==MT_option_OPT || _la==ET_option_OPT) {
					{
					_tail();
					setState(526);
					switch (_input.LA(1)) {
					case MT_option_OPT:
						{
						_term();
						setState(522);
						match(MT_option_OPT);
						}
						break;
					case ET_option_OPT:
						{
						_embed();
						setState(524);
						match(ET_option_OPT);
						setState(525);
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
				setState(533);
				match(MT_option_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(535);
				match(ET_option_OPT);
				setState(536);
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
		enterRule(_localctx, 42, RULE_option_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			option_OPT();
			setState(540);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Contractum_OPTContext extends ParserRuleContext {
		public ContractumContext contractum() {
			return getRuleContext(ContractumContext.class,0);
		}
		public TerminalNode MT_contractum_OPT() { return getToken(CrsxMetaParser.MT_contractum_OPT, 0); }
		public TerminalNode ET_contractum_OPT() { return getToken(CrsxMetaParser.ET_contractum_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Contractum_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractum_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterContractum_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitContractum_OPT(this);
		}
	}

	public final Contractum_OPTContext contractum_OPT() throws RecognitionException {
		Contractum_OPTContext _localctx = new Contractum_OPTContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_contractum_OPT);
		int _la;
		try {
			setState(564);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(545);
				_la = _input.LA(1);
				if (_la==MT_contractum || _la==ET_contractum || _la==ARROW) {
					{
					setState(544);
					contractum();
					}
				}

				setState(555);
				_la = _input.LA(1);
				if (_la==MT_contractum_OPT || _la==ET_contractum_OPT) {
					{
					_tail();
					setState(553);
					switch (_input.LA(1)) {
					case MT_contractum_OPT:
						{
						_term();
						setState(549);
						match(MT_contractum_OPT);
						}
						break;
					case ET_contractum_OPT:
						{
						_embed();
						setState(551);
						match(ET_contractum_OPT);
						setState(552);
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
				setState(560);
				match(MT_contractum_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(562);
				match(ET_contractum_OPT);
				setState(563);
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

	public static class Contractum_OPT_EOFContext extends ParserRuleContext {
		public Contractum_OPTContext contractum_OPT() {
			return getRuleContext(Contractum_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Contractum_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractum_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterContractum_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitContractum_OPT_EOF(this);
		}
	}

	public final Contractum_OPT_EOFContext contractum_OPT_EOF() throws RecognitionException {
		Contractum_OPT_EOFContext _localctx = new Contractum_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_contractum_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			contractum_OPT();
			setState(567);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		public Args_OPTContext args_OPT() {
			return getRuleContext(Args_OPTContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CrsxMetaParser.COLON, 0); }
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
		enterRule(_localctx, 48, RULE_option);
		try {
			setState(581);
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
				_enterAlt();
				setState(570);
				constructor();
				setState(571);
				args_OPT();
				_hide();
				setState(573);
				match(COLON);
				_exitAlt();
				}
				break;
			case MT_option:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(577);
				match(MT_option);
				}
				break;
			case ET_option:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(579);
				match(ET_option);
				setState(580);
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
		enterRule(_localctx, 50, RULE_option_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			option();
			setState(584);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Args_OPTContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode MT_args_OPT() { return getToken(CrsxMetaParser.MT_args_OPT, 0); }
		public TerminalNode ET_args_OPT() { return getToken(CrsxMetaParser.ET_args_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Args_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterArgs_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitArgs_OPT(this);
		}
	}

	public final Args_OPTContext args_OPT() throws RecognitionException {
		Args_OPTContext _localctx = new Args_OPTContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_args_OPT);
		int _la;
		try {
			setState(608);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(589);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(588);
					args();
					}
					break;
				}
				setState(599);
				_la = _input.LA(1);
				if (_la==MT_args_OPT || _la==ET_args_OPT) {
					{
					_tail();
					setState(597);
					switch (_input.LA(1)) {
					case MT_args_OPT:
						{
						_term();
						setState(593);
						match(MT_args_OPT);
						}
						break;
					case ET_args_OPT:
						{
						_embed();
						setState(595);
						match(ET_args_OPT);
						setState(596);
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
				setState(604);
				match(MT_args_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(606);
				match(ET_args_OPT);
				setState(607);
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

	public static class Args_OPT_EOFContext extends ParserRuleContext {
		public Args_OPTContext args_OPT() {
			return getRuleContext(Args_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Args_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterArgs_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitArgs_OPT_EOF(this);
		}
	}

	public final Args_OPT_EOFContext args_OPT_EOF() throws RecognitionException {
		Args_OPT_EOFContext _localctx = new Args_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_args_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			args_OPT();
			setState(611);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		public Args_OPTContext args_OPT() {
			return getRuleContext(Args_OPTContext.class,0);
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
		enterRule(_localctx, 56, RULE_annotation);
		try {
			setState(625);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				_hide();
				setState(615);
				match(AT);
				setState(616);
				constructor();
				setState(617);
				args_OPT();
				_exitAlt();
				}
				break;
			case MT_annotation:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(621);
				match(MT_annotation);
				}
				break;
			case ET_annotation:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(623);
				match(ET_annotation);
				setState(624);
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
		enterRule(_localctx, 58, RULE_annotation_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			annotation();
			setState(628);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ARROW() { return getToken(CrsxMetaParser.ARROW, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
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
		enterRule(_localctx, 60, RULE_contractum);
		try {
			setState(641);
			switch (_input.LA(1)) {
			case ARROW:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				_hide();
				setState(632);
				match(ARROW);
				setState(633);
				term();
				_exitAlt();
				}
				break;
			case MT_contractum:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(637);
				match(MT_contractum);
				}
				break;
			case ET_contractum:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(639);
				match(ET_contractum);
				setState(640);
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
		enterRule(_localctx, 62, RULE_contractum_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			contractum();
			setState(644);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public Sargs_OPTContext sargs_OPT() {
			return getRuleContext(Sargs_OPTContext.class,0);
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ConcreteContext concrete() {
			return getRuleContext(ConcreteContext.class,0);
		}
		public Annotation_OOMContext annotation_OOM() {
			return getRuleContext(Annotation_OOMContext.class,0);
		}
		public Metavar_TOKContext metavar_TOK() {
			return getRuleContext(Metavar_TOKContext.class,0);
		}
		public Args_OPTContext args_OPT() {
			return getRuleContext(Args_OPTContext.class,0);
		}
		public DispatchContext dispatch() {
			return getRuleContext(DispatchContext.class,0);
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
		enterRule(_localctx, 64, RULE_term);
		try {
			setState(691);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(647);
				constructor();
				setState(648);
				sargs_OPT();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(652);
				literal();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(656);
				list();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(660);
				variable();
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				setState(664);
				properties();
				setState(665);
				term();
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_enterAlt("6");
				setState(669);
				concrete();
				_exitAlt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				_enterAlt("7");
				setState(673);
				annotation_OOM();
				setState(674);
				term();
				_exitAlt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				_enterAlt("8");
				setState(678);
				metavar_TOK();
				setState(679);
				args_OPT();
				_exitAlt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				_enterAlt("9");
				setState(683);
				dispatch();
				_exitAlt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				_term();
				setState(687);
				match(MT_term);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				_embed();
				setState(689);
				match(ET_term);
				setState(690);
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
		enterRule(_localctx, 66, RULE_term_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			term();
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

	public static class Sargs_OPTContext extends ParserRuleContext {
		public SargsContext sargs() {
			return getRuleContext(SargsContext.class,0);
		}
		public TerminalNode MT_sargs_OPT() { return getToken(CrsxMetaParser.MT_sargs_OPT, 0); }
		public TerminalNode ET_sargs_OPT() { return getToken(CrsxMetaParser.ET_sargs_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Sargs_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sargs_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSargs_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSargs_OPT(this);
		}
	}

	public final Sargs_OPTContext sargs_OPT() throws RecognitionException {
		Sargs_OPTContext _localctx = new Sargs_OPTContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_sargs_OPT);
		int _la;
		try {
			setState(718);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(699);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(698);
					sargs();
					}
					break;
				}
				setState(709);
				_la = _input.LA(1);
				if (_la==MT_sargs_OPT || _la==ET_sargs_OPT) {
					{
					_tail();
					setState(707);
					switch (_input.LA(1)) {
					case MT_sargs_OPT:
						{
						_term();
						setState(703);
						match(MT_sargs_OPT);
						}
						break;
					case ET_sargs_OPT:
						{
						_embed();
						setState(705);
						match(ET_sargs_OPT);
						setState(706);
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
				setState(714);
				match(MT_sargs_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(716);
				match(ET_sargs_OPT);
				setState(717);
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

	public static class Sargs_OPT_EOFContext extends ParserRuleContext {
		public Sargs_OPTContext sargs_OPT() {
			return getRuleContext(Sargs_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Sargs_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sargs_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSargs_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSargs_OPT_EOF(this);
		}
	}

	public final Sargs_OPT_EOFContext sargs_OPT_EOF() throws RecognitionException {
		Sargs_OPT_EOFContext _localctx = new Sargs_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_sargs_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			sargs_OPT();
			setState(721);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 72, RULE_annotation_OOM);
		try {
			int _alt;
			setState(748);
			switch (_input.LA(1)) {
			case MT_annotation:
			case ET_annotation:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				_enterOOM();
				setState(726); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(725);
						annotation();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(728); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(738);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					_tail();
					setState(736);
					switch (_input.LA(1)) {
					case MT_annotation_OOM:
						{
						_term();
						setState(732);
						match(MT_annotation_OOM);
						}
						break;
					case ET_annotation_OOM:
						{
						_embed();
						setState(734);
						match(ET_annotation_OOM);
						setState(735);
						match(CRSX_EMBED_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				_exitOOM();

				}
				break;
			case MT_annotation_OOM:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(744);
				match(MT_annotation_OOM);
				}
				break;
			case ET_annotation_OOM:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(746);
				match(ET_annotation_OOM);
				setState(747);
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
		enterRule(_localctx, 74, RULE_annotation_OOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			switch (_input.LA(1)) {
			case MT_annotation:
			case ET_annotation:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case AT:
				{
				setState(750);
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
			setState(755);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 76, RULE_metavar_TOK);
		try {
			setState(765);
			switch (_input.LA(1)) {
			case METAVAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				match(METAVAR);

				}
				break;
			case MT_metavar_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(761);
				match(MT_metavar_TOK);
				}
				break;
			case ET_metavar_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(763);
				match(ET_metavar_TOK);
				setState(764);
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
		enterRule(_localctx, 78, RULE_metavar_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			metavar_TOK();
			setState(768);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScopeContext extends ParserRuleContext {
		public BindersContext binders() {
			return getRuleContext(BindersContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MT_scope() { return getToken(CrsxMetaParser.MT_scope, 0); }
		public TerminalNode ET_scope() { return getToken(CrsxMetaParser.ET_scope, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitScope(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_scope);
		try {
			setState(783);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(771);
				binders();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(775);
				term();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(779);
				match(MT_scope);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(781);
				match(ET_scope);
				setState(782);
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

	public static class Scope_EOFContext extends ParserRuleContext {
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Scope_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterScope_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitScope_EOF(this);
		}
	}

	public final Scope_EOFContext scope_EOF() throws RecognitionException {
		Scope_EOFContext _localctx = new Scope_EOFContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_scope_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			scope();
			setState(786);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindersContext extends ParserRuleContext {
		public Annotation_ZOMContext annotation_ZOM() {
			return getRuleContext(Annotation_ZOMContext.class,0);
		}
		public Variable_TOKContext variable_TOK() {
			return getRuleContext(Variable_TOKContext.class,0);
		}
		public Linear_TOK_OPTContext linear_TOK_OPT() {
			return getRuleContext(Linear_TOK_OPTContext.class,0);
		}
		public Functional_TOK_OPTContext functional_TOK_OPT() {
			return getRuleContext(Functional_TOK_OPTContext.class,0);
		}
		public Varsort_OPTContext varsort_OPT() {
			return getRuleContext(Varsort_OPTContext.class,0);
		}
		public BindersContext binders() {
			return getRuleContext(BindersContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CrsxMetaParser.DOT, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MT_binders() { return getToken(CrsxMetaParser.MT_binders, 0); }
		public TerminalNode ET_binders() { return getToken(CrsxMetaParser.ET_binders, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public BindersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binders; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterBinders(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitBinders(this);
		}
	}

	public final BindersContext binders() throws RecognitionException {
		BindersContext _localctx = new BindersContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_binders);
		try {
			setState(812);
			switch (_input.LA(1)) {
			case MT_annotation:
			case ET_annotation:
			case MT_annotation_ZOM:
			case ET_annotation_ZOM:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case AT:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(789);
				annotation_ZOM();
				_enterBinder("x");
				setState(791);
				variable_TOK();
				_exitBinder();
				setState(793);
				linear_TOK_OPT();
				setState(794);
				functional_TOK_OPT();
				setState(795);
				varsort_OPT();
				_enterBinds(" x");
				setState(797);
				binders();
				_exitBinds();
				_exitAlt();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(803);
				match(DOT);
				setState(804);
				term();
				_exitAlt();
				}
				break;
			case MT_binders:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(808);
				match(MT_binders);
				}
				break;
			case ET_binders:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(810);
				match(ET_binders);
				setState(811);
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

	public static class Binders_EOFContext extends ParserRuleContext {
		public BindersContext binders() {
			return getRuleContext(BindersContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Binders_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binders_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterBinders_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitBinders_EOF(this);
		}
	}

	public final Binders_EOFContext binders_EOF() throws RecognitionException {
		Binders_EOFContext _localctx = new Binders_EOFContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_binders_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			binders();
			setState(815);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_ZOMContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode MT_annotation_ZOM() { return getToken(CrsxMetaParser.MT_annotation_ZOM, 0); }
		public TerminalNode ET_annotation_ZOM() { return getToken(CrsxMetaParser.ET_annotation_ZOM, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Annotation_ZOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_ZOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterAnnotation_ZOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitAnnotation_ZOM(this);
		}
	}

	public final Annotation_ZOMContext annotation_ZOM() throws RecognitionException {
		Annotation_ZOMContext _localctx = new Annotation_ZOMContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_annotation_ZOM);
		int _la;
		try {
			setState(842);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterZOM();
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MT_annotation || _la==ET_annotation || _la==AT) {
					{
					{
					setState(819);
					annotation();
					}
					}
					setState(824);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(833);
				_la = _input.LA(1);
				if (_la==MT_annotation_ZOM || _la==ET_annotation_ZOM) {
					{
					_tail();
					setState(831);
					switch (_input.LA(1)) {
					case MT_annotation_ZOM:
						{
						_term();
						setState(827);
						match(MT_annotation_ZOM);
						}
						break;
					case ET_annotation_ZOM:
						{
						_embed();
						setState(829);
						match(ET_annotation_ZOM);
						setState(830);
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
				setState(838);
				match(MT_annotation_ZOM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(840);
				match(ET_annotation_ZOM);
				setState(841);
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

	public static class Annotation_ZOM_EOFContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Annotation_ZOMContext annotation_ZOM() {
			return getRuleContext(Annotation_ZOMContext.class,0);
		}
		public Annotation_ZOM_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_ZOM_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterAnnotation_ZOM_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitAnnotation_ZOM_EOF(this);
		}
	}

	public final Annotation_ZOM_EOFContext annotation_ZOM_EOF() throws RecognitionException {
		Annotation_ZOM_EOFContext _localctx = new Annotation_ZOM_EOFContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_annotation_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(844);
				annotation_ZOM();
				}
				break;
			case 2:
				{
				_enterZOM();
				_exitZOM();
				}
				break;
			}
			setState(849);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 92, RULE_variable_TOK);
		try {
			setState(861);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterBinder("x");
				setState(853);
				match(VARIABLE);
				_exitBinder();

				}
				break;
			case MT_variable_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(857);
				match(MT_variable_TOK);
				}
				break;
			case ET_variable_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(859);
				match(ET_variable_TOK);
				setState(860);
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
		enterRule(_localctx, 94, RULE_variable_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			variable_TOK();
			setState(864);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Linear_TOK_OPTContext extends ParserRuleContext {
		public TerminalNode LINEAR() { return getToken(CrsxMetaParser.LINEAR, 0); }
		public TerminalNode MT_linear_TOK_OPT() { return getToken(CrsxMetaParser.MT_linear_TOK_OPT, 0); }
		public TerminalNode ET_linear_TOK_OPT() { return getToken(CrsxMetaParser.ET_linear_TOK_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Linear_TOK_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linear_TOK_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterLinear_TOK_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitLinear_TOK_OPT(this);
		}
	}

	public final Linear_TOK_OPTContext linear_TOK_OPT() throws RecognitionException {
		Linear_TOK_OPTContext _localctx = new Linear_TOK_OPTContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_linear_TOK_OPT);
		int _la;
		try {
			setState(888);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(869);
				_la = _input.LA(1);
				if (_la==LINEAR) {
					{
					setState(868);
					match(LINEAR);
					}
				}

				setState(879);
				_la = _input.LA(1);
				if (_la==MT_linear_TOK_OPT || _la==ET_linear_TOK_OPT) {
					{
					_tail();
					setState(877);
					switch (_input.LA(1)) {
					case MT_linear_TOK_OPT:
						{
						_term();
						setState(873);
						match(MT_linear_TOK_OPT);
						}
						break;
					case ET_linear_TOK_OPT:
						{
						_embed();
						setState(875);
						match(ET_linear_TOK_OPT);
						setState(876);
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
				setState(884);
				match(MT_linear_TOK_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(886);
				match(ET_linear_TOK_OPT);
				setState(887);
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

	public static class Linear_TOK_OPT_EOFContext extends ParserRuleContext {
		public Linear_TOK_OPTContext linear_TOK_OPT() {
			return getRuleContext(Linear_TOK_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Linear_TOK_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linear_TOK_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterLinear_TOK_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitLinear_TOK_OPT_EOF(this);
		}
	}

	public final Linear_TOK_OPT_EOFContext linear_TOK_OPT_EOF() throws RecognitionException {
		Linear_TOK_OPT_EOFContext _localctx = new Linear_TOK_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_linear_TOK_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			linear_TOK_OPT();
			setState(891);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Functional_TOK_OPTContext extends ParserRuleContext {
		public TerminalNode FUNCTIONAL() { return getToken(CrsxMetaParser.FUNCTIONAL, 0); }
		public TerminalNode MT_functional_TOK_OPT() { return getToken(CrsxMetaParser.MT_functional_TOK_OPT, 0); }
		public TerminalNode ET_functional_TOK_OPT() { return getToken(CrsxMetaParser.ET_functional_TOK_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Functional_TOK_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functional_TOK_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterFunctional_TOK_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitFunctional_TOK_OPT(this);
		}
	}

	public final Functional_TOK_OPTContext functional_TOK_OPT() throws RecognitionException {
		Functional_TOK_OPTContext _localctx = new Functional_TOK_OPTContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_functional_TOK_OPT);
		int _la;
		try {
			setState(915);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(896);
				_la = _input.LA(1);
				if (_la==FUNCTIONAL) {
					{
					setState(895);
					match(FUNCTIONAL);
					}
				}

				setState(906);
				_la = _input.LA(1);
				if (_la==MT_functional_TOK_OPT || _la==ET_functional_TOK_OPT) {
					{
					_tail();
					setState(904);
					switch (_input.LA(1)) {
					case MT_functional_TOK_OPT:
						{
						_term();
						setState(900);
						match(MT_functional_TOK_OPT);
						}
						break;
					case ET_functional_TOK_OPT:
						{
						_embed();
						setState(902);
						match(ET_functional_TOK_OPT);
						setState(903);
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
				setState(911);
				match(MT_functional_TOK_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(913);
				match(ET_functional_TOK_OPT);
				setState(914);
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

	public static class Functional_TOK_OPT_EOFContext extends ParserRuleContext {
		public Functional_TOK_OPTContext functional_TOK_OPT() {
			return getRuleContext(Functional_TOK_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Functional_TOK_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functional_TOK_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterFunctional_TOK_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitFunctional_TOK_OPT_EOF(this);
		}
	}

	public final Functional_TOK_OPT_EOFContext functional_TOK_OPT_EOF() throws RecognitionException {
		Functional_TOK_OPT_EOFContext _localctx = new Functional_TOK_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_functional_TOK_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			functional_TOK_OPT();
			setState(918);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 104, RULE_varsort_OPT);
		try {
			setState(942);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(923);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(922);
					varsort();
					}
					break;
				}
				setState(933);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					_tail();
					setState(931);
					switch (_input.LA(1)) {
					case MT_varsort_OPT:
						{
						_term();
						setState(927);
						match(MT_varsort_OPT);
						}
						break;
					case ET_varsort_OPT:
						{
						_embed();
						setState(929);
						match(ET_varsort_OPT);
						setState(930);
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
				setState(938);
				match(MT_varsort_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(940);
				match(ET_varsort_OPT);
				setState(941);
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
		enterRule(_localctx, 106, RULE_varsort_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			varsort_OPT();
			setState(945);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(CrsxMetaParser.LSQUARE, 0); }
		public Terms_OPTContext terms_OPT() {
			return getRuleContext(Terms_OPTContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(CrsxMetaParser.RSQUARE, 0); }
		public TerminalNode LPAR() { return getToken(CrsxMetaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CrsxMetaParser.RPAR, 0); }
		public TerminalNode MT_args() { return getToken(CrsxMetaParser.MT_args, 0); }
		public TerminalNode ET_args() { return getToken(CrsxMetaParser.ET_args, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_args);
		try {
			setState(968);
			switch (_input.LA(1)) {
			case LSQUARE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_hide();
				setState(949);
				match(LSQUARE);
				setState(950);
				terms_OPT();
				_hide();
				setState(952);
				match(RSQUARE);
				_exitAlt();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(957);
				match(LPAR);
				setState(958);
				terms_OPT();
				_hide();
				setState(960);
				match(RPAR);
				_exitAlt();
				}
				break;
			case MT_args:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(964);
				match(MT_args);
				}
				break;
			case ET_args:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(966);
				match(ET_args);
				setState(967);
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

	public static class Args_EOFContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Args_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterArgs_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitArgs_EOF(this);
		}
	}

	public final Args_EOFContext args_EOF() throws RecognitionException {
		Args_EOFContext _localctx = new Args_EOFContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_args_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			args();
			setState(971);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 112, RULE_terms_OPT);
		int _la;
		try {
			setState(995);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(976);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_constructor_TOK) | (1L << ET_constructor_TOK) | (1L << MT_annotation) | (1L << ET_annotation) | (1L << MT_term) | (1L << ET_term) | (1L << MT_annotation_OOM) | (1L << ET_annotation_OOM) | (1L << MT_metavar_TOK) | (1L << ET_metavar_TOK) | (1L << MT_variable_TOK) | (1L << ET_variable_TOK) | (1L << MT_terms) | (1L << ET_terms) | (1L << MT_term_ZOM) | (1L << ET_term_ZOM))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (MT_list - 71)) | (1L << (ET_list - 71)) | (1L << (MT_variable - 71)) | (1L << (ET_variable - 71)) | (1L << (MT_literal - 71)) | (1L << (ET_literal - 71)) | (1L << (MT_string_TOK - 71)) | (1L << (ET_string_TOK - 71)) | (1L << (MT_number_TOK - 71)) | (1L << (ET_number_TOK - 71)) | (1L << (MT_concrete - 71)) | (1L << (ET_concrete - 71)) | (1L << (MT_category_TOK - 71)) | (1L << (ET_category_TOK - 71)) | (1L << (MT_dispatch - 71)) | (1L << (ET_dispatch - 71)) | (1L << (MT_properties - 71)) | (1L << (ET_properties - 71)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (MT_constructor - 135)) | (1L << (ET_constructor - 135)) | (1L << (MT_qualifier - 135)) | (1L << (ET_qualifier - 135)) | (1L << (MT_reserved - 135)) | (1L << (ET_reserved - 135)) | (1L << (DISPATCH - 135)) | (1L << (COLON - 135)) | (1L << (LPAR - 135)) | (1L << (LBRACE - 135)) | (1L << (AT - 135)) | (1L << (CATEGORY - 135)) | (1L << (CONSTRUCTOR - 135)) | (1L << (VARIABLE - 135)) | (1L << (METAVAR - 135)) | (1L << (STRING - 135)) | (1L << (NUMBER - 135)))) != 0)) {
					{
					setState(975);
					terms();
					}
				}

				setState(986);
				_la = _input.LA(1);
				if (_la==MT_terms_OPT || _la==ET_terms_OPT) {
					{
					_tail();
					setState(984);
					switch (_input.LA(1)) {
					case MT_terms_OPT:
						{
						_term();
						setState(980);
						match(MT_terms_OPT);
						}
						break;
					case ET_terms_OPT:
						{
						_embed();
						setState(982);
						match(ET_terms_OPT);
						setState(983);
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
				setState(991);
				match(MT_terms_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(993);
				match(ET_terms_OPT);
				setState(994);
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
		enterRule(_localctx, 114, RULE_terms_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			terms_OPT();
			setState(998);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 116, RULE_terms);
		try {
			setState(1009);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_annotation:
			case ET_annotation:
			case MT_term:
			case ET_term:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_metavar_TOK:
			case ET_metavar_TOK:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_term_ZOM:
			case ET_term_ZOM:
			case MT_list:
			case ET_list:
			case MT_variable:
			case ET_variable:
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
				setState(1001);
				term_ZOM();
				_exitAlt();
				}
				break;
			case MT_terms:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1005);
				match(MT_terms);
				}
				break;
			case ET_terms:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1007);
				match(ET_terms);
				setState(1008);
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
		enterRule(_localctx, 118, RULE_terms_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			terms();
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
		enterRule(_localctx, 120, RULE_term_ZOM);
		try {
			int _alt;
			setState(1043);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_annotation:
			case ET_annotation:
			case MT_term:
			case ET_term:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_metavar_TOK:
			case ET_metavar_TOK:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_list:
			case ET_list:
			case MT_variable:
			case ET_variable:
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
				setState(1016);
				term();
				setState(1022);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						_hide();
						setState(1018);
						match(COMMA);
						setState(1019);
						term();
						}
						} 
					}
					setState(1024);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				setState(1033);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					_tail();
					setState(1031);
					switch (_input.LA(1)) {
					case MT_term_ZOM:
						{
						_term();
						setState(1027);
						match(MT_term_ZOM);
						}
						break;
					case ET_term_ZOM:
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
					break;
				}
				_exitZOM();

				}
				break;
			case MT_term_ZOM:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1039);
				match(MT_term_ZOM);
				}
				break;
			case ET_term_ZOM:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1041);
				match(ET_term_ZOM);
				setState(1042);
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
		enterRule(_localctx, 122, RULE_term_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_annotation:
			case ET_annotation:
			case MT_term:
			case ET_term:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_metavar_TOK:
			case ET_metavar_TOK:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_term_ZOM:
			case ET_term_ZOM:
			case MT_list:
			case ET_list:
			case MT_variable:
			case ET_variable:
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
			case AT:
			case CATEGORY:
			case CONSTRUCTOR:
			case VARIABLE:
			case METAVAR:
			case STRING:
			case NUMBER:
				{
				setState(1045);
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
			setState(1050);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SargsContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(CrsxMetaParser.LSQUARE, 0); }
		public Scopes_OPTContext scopes_OPT() {
			return getRuleContext(Scopes_OPTContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(CrsxMetaParser.RSQUARE, 0); }
		public TerminalNode LPAR() { return getToken(CrsxMetaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CrsxMetaParser.RPAR, 0); }
		public TerminalNode MT_sargs() { return getToken(CrsxMetaParser.MT_sargs, 0); }
		public TerminalNode ET_sargs() { return getToken(CrsxMetaParser.ET_sargs, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public SargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sargs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSargs(this);
		}
	}

	public final SargsContext sargs() throws RecognitionException {
		SargsContext _localctx = new SargsContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_sargs);
		try {
			setState(1073);
			switch (_input.LA(1)) {
			case LSQUARE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_hide();
				setState(1054);
				match(LSQUARE);
				setState(1055);
				scopes_OPT();
				_hide();
				setState(1057);
				match(RSQUARE);
				_exitAlt();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(1062);
				match(LPAR);
				setState(1063);
				scopes_OPT();
				_hide();
				setState(1065);
				match(RPAR);
				_exitAlt();
				}
				break;
			case MT_sargs:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(1069);
				match(MT_sargs);
				}
				break;
			case ET_sargs:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(1071);
				match(ET_sargs);
				setState(1072);
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

	public static class Sargs_EOFContext extends ParserRuleContext {
		public SargsContext sargs() {
			return getRuleContext(SargsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Sargs_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sargs_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSargs_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSargs_EOF(this);
		}
	}

	public final Sargs_EOFContext sargs_EOF() throws RecognitionException {
		Sargs_EOFContext _localctx = new Sargs_EOFContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_sargs_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			sargs();
			setState(1076);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scopes_OPTContext extends ParserRuleContext {
		public ScopesContext scopes() {
			return getRuleContext(ScopesContext.class,0);
		}
		public TerminalNode MT_scopes_OPT() { return getToken(CrsxMetaParser.MT_scopes_OPT, 0); }
		public TerminalNode ET_scopes_OPT() { return getToken(CrsxMetaParser.ET_scopes_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Scopes_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopes_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterScopes_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitScopes_OPT(this);
		}
	}

	public final Scopes_OPTContext scopes_OPT() throws RecognitionException {
		Scopes_OPTContext _localctx = new Scopes_OPTContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_scopes_OPT);
		int _la;
		try {
			setState(1100);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1081);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_constructor_TOK) | (1L << ET_constructor_TOK) | (1L << MT_annotation) | (1L << ET_annotation) | (1L << MT_term) | (1L << ET_term) | (1L << MT_annotation_OOM) | (1L << ET_annotation_OOM) | (1L << MT_metavar_TOK) | (1L << ET_metavar_TOK) | (1L << MT_scope) | (1L << ET_scope) | (1L << MT_binders) | (1L << ET_binders) | (1L << MT_annotation_ZOM) | (1L << ET_annotation_ZOM) | (1L << MT_variable_TOK) | (1L << ET_variable_TOK))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (MT_scopes - 67)) | (1L << (ET_scopes - 67)) | (1L << (MT_scope_ZOM - 67)) | (1L << (ET_scope_ZOM - 67)) | (1L << (MT_list - 67)) | (1L << (ET_list - 67)) | (1L << (MT_variable - 67)) | (1L << (ET_variable - 67)) | (1L << (MT_literal - 67)) | (1L << (ET_literal - 67)) | (1L << (MT_string_TOK - 67)) | (1L << (ET_string_TOK - 67)) | (1L << (MT_number_TOK - 67)) | (1L << (ET_number_TOK - 67)) | (1L << (MT_concrete - 67)) | (1L << (ET_concrete - 67)) | (1L << (MT_category_TOK - 67)) | (1L << (ET_category_TOK - 67)) | (1L << (MT_dispatch - 67)) | (1L << (ET_dispatch - 67)) | (1L << (MT_properties - 67)) | (1L << (ET_properties - 67)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (MT_constructor - 135)) | (1L << (ET_constructor - 135)) | (1L << (MT_qualifier - 135)) | (1L << (ET_qualifier - 135)) | (1L << (MT_reserved - 135)) | (1L << (ET_reserved - 135)) | (1L << (DISPATCH - 135)) | (1L << (COLON - 135)) | (1L << (LPAR - 135)) | (1L << (LBRACE - 135)) | (1L << (DOT - 135)) | (1L << (AT - 135)) | (1L << (CATEGORY - 135)) | (1L << (CONSTRUCTOR - 135)) | (1L << (VARIABLE - 135)) | (1L << (METAVAR - 135)) | (1L << (STRING - 135)) | (1L << (NUMBER - 135)))) != 0)) {
					{
					setState(1080);
					scopes();
					}
				}

				setState(1091);
				_la = _input.LA(1);
				if (_la==MT_scopes_OPT || _la==ET_scopes_OPT) {
					{
					_tail();
					setState(1089);
					switch (_input.LA(1)) {
					case MT_scopes_OPT:
						{
						_term();
						setState(1085);
						match(MT_scopes_OPT);
						}
						break;
					case ET_scopes_OPT:
						{
						_embed();
						setState(1087);
						match(ET_scopes_OPT);
						setState(1088);
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
				setState(1096);
				match(MT_scopes_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1098);
				match(ET_scopes_OPT);
				setState(1099);
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

	public static class Scopes_OPT_EOFContext extends ParserRuleContext {
		public Scopes_OPTContext scopes_OPT() {
			return getRuleContext(Scopes_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Scopes_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopes_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterScopes_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitScopes_OPT_EOF(this);
		}
	}

	public final Scopes_OPT_EOFContext scopes_OPT_EOF() throws RecognitionException {
		Scopes_OPT_EOFContext _localctx = new Scopes_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_scopes_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1102);
			scopes_OPT();
			setState(1103);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScopesContext extends ParserRuleContext {
		public Scope_ZOMContext scope_ZOM() {
			return getRuleContext(Scope_ZOMContext.class,0);
		}
		public TerminalNode MT_scopes() { return getToken(CrsxMetaParser.MT_scopes, 0); }
		public TerminalNode ET_scopes() { return getToken(CrsxMetaParser.ET_scopes, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public ScopesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterScopes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitScopes(this);
		}
	}

	public final ScopesContext scopes() throws RecognitionException {
		ScopesContext _localctx = new ScopesContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_scopes);
		try {
			setState(1114);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_annotation:
			case ET_annotation:
			case MT_term:
			case ET_term:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_metavar_TOK:
			case ET_metavar_TOK:
			case MT_scope:
			case ET_scope:
			case MT_binders:
			case ET_binders:
			case MT_annotation_ZOM:
			case ET_annotation_ZOM:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_scope_ZOM:
			case ET_scope_ZOM:
			case MT_list:
			case ET_list:
			case MT_variable:
			case ET_variable:
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
			case DOT:
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
				setState(1106);
				scope_ZOM();
				_exitAlt();
				}
				break;
			case MT_scopes:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1110);
				match(MT_scopes);
				}
				break;
			case ET_scopes:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1112);
				match(ET_scopes);
				setState(1113);
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

	public static class Scopes_EOFContext extends ParserRuleContext {
		public ScopesContext scopes() {
			return getRuleContext(ScopesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Scopes_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopes_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterScopes_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitScopes_EOF(this);
		}
	}

	public final Scopes_EOFContext scopes_EOF() throws RecognitionException {
		Scopes_EOFContext _localctx = new Scopes_EOFContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_scopes_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			scopes();
			setState(1117);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scope_ZOMContext extends ParserRuleContext {
		public List<ScopeContext> scope() {
			return getRuleContexts(ScopeContext.class);
		}
		public ScopeContext scope(int i) {
			return getRuleContext(ScopeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CrsxMetaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CrsxMetaParser.COMMA, i);
		}
		public TerminalNode MT_scope_ZOM() { return getToken(CrsxMetaParser.MT_scope_ZOM, 0); }
		public TerminalNode ET_scope_ZOM() { return getToken(CrsxMetaParser.ET_scope_ZOM, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Scope_ZOMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope_ZOM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterScope_ZOM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitScope_ZOM(this);
		}
	}

	public final Scope_ZOMContext scope_ZOM() throws RecognitionException {
		Scope_ZOMContext _localctx = new Scope_ZOMContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_scope_ZOM);
		int _la;
		try {
			setState(1148);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_annotation:
			case ET_annotation:
			case MT_term:
			case ET_term:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_metavar_TOK:
			case ET_metavar_TOK:
			case MT_scope:
			case ET_scope:
			case MT_binders:
			case ET_binders:
			case MT_annotation_ZOM:
			case ET_annotation_ZOM:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_list:
			case ET_list:
			case MT_variable:
			case ET_variable:
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
			case DOT:
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
				setState(1121);
				scope();
				setState(1127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					_hide();
					setState(1123);
					match(COMMA);
					setState(1124);
					scope();
					}
					}
					setState(1129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1138);
				_la = _input.LA(1);
				if (_la==MT_scope_ZOM || _la==ET_scope_ZOM) {
					{
					_tail();
					setState(1136);
					switch (_input.LA(1)) {
					case MT_scope_ZOM:
						{
						_term();
						setState(1132);
						match(MT_scope_ZOM);
						}
						break;
					case ET_scope_ZOM:
						{
						_embed();
						setState(1134);
						match(ET_scope_ZOM);
						setState(1135);
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
			case MT_scope_ZOM:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1144);
				match(MT_scope_ZOM);
				}
				break;
			case ET_scope_ZOM:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1146);
				match(ET_scope_ZOM);
				setState(1147);
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

	public static class Scope_ZOM_EOFContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Scope_ZOMContext scope_ZOM() {
			return getRuleContext(Scope_ZOMContext.class,0);
		}
		public Scope_ZOM_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope_ZOM_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterScope_ZOM_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitScope_ZOM_EOF(this);
		}
	}

	public final Scope_ZOM_EOFContext scope_ZOM_EOF() throws RecognitionException {
		Scope_ZOM_EOFContext _localctx = new Scope_ZOM_EOFContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_scope_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_annotation:
			case ET_annotation:
			case MT_term:
			case ET_term:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_metavar_TOK:
			case ET_metavar_TOK:
			case MT_scope:
			case ET_scope:
			case MT_binders:
			case ET_binders:
			case MT_annotation_ZOM:
			case ET_annotation_ZOM:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_scope_ZOM:
			case ET_scope_ZOM:
			case MT_list:
			case ET_list:
			case MT_variable:
			case ET_variable:
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
			case DOT:
			case AT:
			case CATEGORY:
			case CONSTRUCTOR:
			case VARIABLE:
			case METAVAR:
			case STRING:
			case NUMBER:
				{
				setState(1150);
				scope_ZOM();
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
			setState(1155);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
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
		enterRule(_localctx, 140, RULE_list);
		try {
			setState(1170);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				_hide();
				setState(1159);
				match(LPAR);
				setState(1160);
				decls();
				_hide();
				setState(1162);
				match(RPAR);
				_exitAlt();
				}
				break;
			case MT_list:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1166);
				match(MT_list);
				}
				break;
			case ET_list:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1168);
				match(ET_list);
				setState(1169);
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
		enterRule(_localctx, 142, RULE_list_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			list();
			setState(1173);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		public Linear_TOK_OPTContext linear_TOK_OPT() {
			return getRuleContext(Linear_TOK_OPTContext.class,0);
		}
		public Functional_TOK_OPTContext functional_TOK_OPT() {
			return getRuleContext(Functional_TOK_OPTContext.class,0);
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
		enterRule(_localctx, 144, RULE_variable);
		try {
			setState(1189);
			switch (_input.LA(1)) {
			case MT_variable_TOK:
			case ET_variable_TOK:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				_enterSymbol();
				setState(1177);
				variable_TOK();
				_exitSymbol();
				setState(1179);
				linear_TOK_OPT();
				setState(1180);
				functional_TOK_OPT();
				setState(1181);
				varsort_OPT();
				_exitAlt();
				}
				break;
			case MT_variable:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1185);
				match(MT_variable);
				}
				break;
			case ET_variable:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1187);
				match(ET_variable);
				setState(1188);
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
		enterRule(_localctx, 146, RULE_variable_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
			variable();
			setState(1192);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 148, RULE_literal);
		try {
			setState(1207);
			switch (_input.LA(1)) {
			case MT_string_TOK:
			case ET_string_TOK:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(1195);
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
				setState(1199);
				number_TOK();
				_exitAlt();
				}
				break;
			case MT_literal:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(1203);
				match(MT_literal);
				}
				break;
			case ET_literal:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(1205);
				match(ET_literal);
				setState(1206);
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
		enterRule(_localctx, 150, RULE_literal_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1209);
			literal();
			setState(1210);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 152, RULE_string_TOK);
		try {
			setState(1220);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1213);
				match(STRING);

				}
				break;
			case MT_string_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1216);
				match(MT_string_TOK);
				}
				break;
			case ET_string_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1218);
				match(ET_string_TOK);
				setState(1219);
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
		enterRule(_localctx, 154, RULE_string_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			string_TOK();
			setState(1223);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 156, RULE_number_TOK);
		try {
			setState(1233);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1226);
				match(NUMBER);

				}
				break;
			case MT_number_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1229);
				match(MT_number_TOK);
				}
				break;
			case ET_number_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1231);
				match(ET_number_TOK);
				setState(1232);
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
		enterRule(_localctx, 158, RULE_number_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			number_TOK();
			setState(1236);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 160, RULE_varsort);
		try {
			setState(1249);
			switch (_input.LA(1)) {
			case COLONCOLON:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				_hide();
				setState(1240);
				match(COLONCOLON);
				setState(1241);
				sortname();
				_exitAlt();
				}
				break;
			case MT_varsort:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1245);
				match(MT_varsort);
				}
				break;
			case ET_varsort:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1247);
				match(ET_varsort);
				setState(1248);
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
		enterRule(_localctx, 162, RULE_varsort_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			varsort();
			setState(1252);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 164, RULE_concrete);
		try {
			setState(1274);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(1255);
				category_TOK();
				setState(1256);
				concrete_TOK();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(1260);
				category_TOK();
				setState(1261);
				concrete3_TOK();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(1265);
				category_TOK();
				setState(1266);
				concrete4_TOK();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_term();
				setState(1270);
				match(MT_concrete);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_embed();
				setState(1272);
				match(ET_concrete);
				setState(1273);
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
		enterRule(_localctx, 166, RULE_concrete_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			concrete();
			setState(1277);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 168, RULE_category_TOK);
		try {
			setState(1287);
			switch (_input.LA(1)) {
			case CATEGORY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1280);
				match(CATEGORY);

				}
				break;
			case MT_category_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1283);
				match(MT_category_TOK);
				}
				break;
			case ET_category_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1285);
				match(ET_category_TOK);
				setState(1286);
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
		enterRule(_localctx, 170, RULE_category_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			category_TOK();
			setState(1290);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 172, RULE_concrete_TOK);
		try {
			setState(1300);
			switch (_input.LA(1)) {
			case CONCRETE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1293);
				match(CONCRETE);

				}
				break;
			case MT_concrete_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1296);
				match(MT_concrete_TOK);
				}
				break;
			case ET_concrete_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1298);
				match(ET_concrete_TOK);
				setState(1299);
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
		enterRule(_localctx, 174, RULE_concrete_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			concrete_TOK();
			setState(1303);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 176, RULE_concrete3_TOK);
		try {
			setState(1313);
			switch (_input.LA(1)) {
			case CONCRETE3:
				enterOuterAlt(_localctx, 1);
				{
				setState(1306);
				match(CONCRETE3);

				}
				break;
			case MT_concrete3_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1309);
				match(MT_concrete3_TOK);
				}
				break;
			case ET_concrete3_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1311);
				match(ET_concrete3_TOK);
				setState(1312);
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
		enterRule(_localctx, 178, RULE_concrete3_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1315);
			concrete3_TOK();
			setState(1316);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 180, RULE_concrete4_TOK);
		try {
			setState(1326);
			switch (_input.LA(1)) {
			case CONCRETE4:
				enterOuterAlt(_localctx, 1);
				{
				setState(1319);
				match(CONCRETE4);

				}
				break;
			case MT_concrete4_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1322);
				match(MT_concrete4_TOK);
				}
				break;
			case ET_concrete4_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1324);
				match(ET_concrete4_TOK);
				setState(1325);
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
		enterRule(_localctx, 182, RULE_concrete4_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1328);
			concrete4_TOK();
			setState(1329);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public DispatchCasesContext dispatchCases() {
			return getRuleContext(DispatchCasesContext.class,0);
		}
		public Delay_TOK_OPTContext delay_TOK_OPT() {
			return getRuleContext(Delay_TOK_OPTContext.class,0);
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
		enterRule(_localctx, 184, RULE_dispatch);
		try {
			setState(1344);
			switch (_input.LA(1)) {
			case DISPATCH:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				_hide();
				setState(1333);
				match(DISPATCH);
				setState(1334);
				term();
				setState(1335);
				dispatchCases();
				setState(1336);
				delay_TOK_OPT();
				_exitAlt();
				}
				break;
			case MT_dispatch:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1340);
				match(MT_dispatch);
				}
				break;
			case ET_dispatch:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1342);
				match(ET_dispatch);
				setState(1343);
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
		enterRule(_localctx, 186, RULE_dispatch_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			dispatch();
			setState(1347);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delay_TOK_OPTContext extends ParserRuleContext {
		public TerminalNode DELAY() { return getToken(CrsxMetaParser.DELAY, 0); }
		public TerminalNode MT_delay_TOK_OPT() { return getToken(CrsxMetaParser.MT_delay_TOK_OPT, 0); }
		public TerminalNode ET_delay_TOK_OPT() { return getToken(CrsxMetaParser.ET_delay_TOK_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Delay_TOK_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delay_TOK_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDelay_TOK_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDelay_TOK_OPT(this);
		}
	}

	public final Delay_TOK_OPTContext delay_TOK_OPT() throws RecognitionException {
		Delay_TOK_OPTContext _localctx = new Delay_TOK_OPTContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_delay_TOK_OPT);
		try {
			setState(1371);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1352);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(1351);
					match(DELAY);
					}
					break;
				}
				setState(1362);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					_tail();
					setState(1360);
					switch (_input.LA(1)) {
					case MT_delay_TOK_OPT:
						{
						_term();
						setState(1356);
						match(MT_delay_TOK_OPT);
						}
						break;
					case ET_delay_TOK_OPT:
						{
						_embed();
						setState(1358);
						match(ET_delay_TOK_OPT);
						setState(1359);
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
				setState(1367);
				match(MT_delay_TOK_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1369);
				match(ET_delay_TOK_OPT);
				setState(1370);
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

	public static class Delay_TOK_OPT_EOFContext extends ParserRuleContext {
		public Delay_TOK_OPTContext delay_TOK_OPT() {
			return getRuleContext(Delay_TOK_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Delay_TOK_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delay_TOK_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterDelay_TOK_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitDelay_TOK_OPT_EOF(this);
		}
	}

	public final Delay_TOK_OPT_EOFContext delay_TOK_OPT_EOF() throws RecognitionException {
		Delay_TOK_OPT_EOFContext _localctx = new Delay_TOK_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_delay_TOK_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
			delay_TOK_OPT();
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

	public static class DispatchCasesContext extends ParserRuleContext {
		public Term_ZOMContext term_ZOM() {
			return getRuleContext(Term_ZOMContext.class,0);
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
		enterRule(_localctx, 192, RULE_dispatchCases);
		try {
			setState(1385);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_annotation:
			case ET_annotation:
			case MT_term:
			case ET_term:
			case MT_annotation_OOM:
			case ET_annotation_OOM:
			case MT_metavar_TOK:
			case ET_metavar_TOK:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_term_ZOM:
			case ET_term_ZOM:
			case MT_list:
			case ET_list:
			case MT_variable:
			case ET_variable:
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
				setState(1377);
				term_ZOM();
				_exitAlt();
				}
				break;
			case MT_dispatchCases:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1381);
				match(MT_dispatchCases);
				}
				break;
			case ET_dispatchCases:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1383);
				match(ET_dispatchCases);
				setState(1384);
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
		enterRule(_localctx, 194, RULE_dispatchCases_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1387);
			dispatchCases();
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
		enterRule(_localctx, 196, RULE_properties);
		try {
			setState(1403);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				_hide();
				setState(1392);
				match(LBRACE);
				setState(1393);
				propertyList_OPT();
				_hide();
				setState(1395);
				match(RBRACE);
				_exitAlt();
				}
				break;
			case MT_properties:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1399);
				match(MT_properties);
				}
				break;
			case ET_properties:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1401);
				match(ET_properties);
				setState(1402);
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
		enterRule(_localctx, 198, RULE_properties_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
			properties();
			setState(1406);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 200, RULE_propertyList_OPT);
		int _la;
		try {
			setState(1430);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1411);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_constructor_TOK) | (1L << ET_constructor_TOK) | (1L << MT_metavar_TOK) | (1L << ET_metavar_TOK) | (1L << MT_variable_TOK) | (1L << ET_variable_TOK))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (MT_string_TOK - 77)) | (1L << (ET_string_TOK - 77)) | (1L << (MT_propertyList - 77)) | (1L << (ET_propertyList - 77)) | (1L << (MT_property_ZOM - 77)) | (1L << (ET_property_ZOM - 77)) | (1L << (MT_property - 77)) | (1L << (ET_property - 77)) | (1L << (MT_constructor - 77)) | (1L << (ET_constructor - 77)) | (1L << (MT_qualifier - 77)) | (1L << (ET_qualifier - 77)) | (1L << (MT_reserved - 77)) | (1L << (ET_reserved - 77)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (COLON - 146)) | (1L << (NOT - 146)) | (1L << (AT - 146)) | (1L << (CONSTRUCTOR - 146)) | (1L << (VARIABLE - 146)) | (1L << (METAVAR - 146)) | (1L << (STRING - 146)))) != 0)) {
					{
					setState(1410);
					propertyList();
					}
				}

				setState(1421);
				_la = _input.LA(1);
				if (_la==MT_propertyList_OPT || _la==ET_propertyList_OPT) {
					{
					_tail();
					setState(1419);
					switch (_input.LA(1)) {
					case MT_propertyList_OPT:
						{
						_term();
						setState(1415);
						match(MT_propertyList_OPT);
						}
						break;
					case ET_propertyList_OPT:
						{
						_embed();
						setState(1417);
						match(ET_propertyList_OPT);
						setState(1418);
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
				setState(1426);
				match(MT_propertyList_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1428);
				match(ET_propertyList_OPT);
				setState(1429);
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
		enterRule(_localctx, 202, RULE_propertyList_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1432);
			propertyList_OPT();
			setState(1433);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 204, RULE_propertyList);
		try {
			setState(1444);
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
				setState(1436);
				property_ZOM();
				_exitAlt();
				}
				break;
			case MT_propertyList:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1440);
				match(MT_propertyList);
				}
				break;
			case ET_propertyList:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1442);
				match(ET_propertyList);
				setState(1443);
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
		enterRule(_localctx, 206, RULE_propertyList_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1446);
			propertyList();
			setState(1447);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 208, RULE_property_ZOM);
		int _la;
		try {
			setState(1480);
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
				setState(1451);
				property();
				setState(1459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					_hide();
					setState(1453);
					match(SEMI);
					setState(1455);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MT_constructor_TOK) | (1L << ET_constructor_TOK) | (1L << MT_metavar_TOK) | (1L << ET_metavar_TOK) | (1L << MT_variable_TOK) | (1L << ET_variable_TOK))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (MT_string_TOK - 77)) | (1L << (ET_string_TOK - 77)) | (1L << (MT_property - 77)) | (1L << (ET_property - 77)) | (1L << (MT_constructor - 77)) | (1L << (ET_constructor - 77)) | (1L << (MT_qualifier - 77)) | (1L << (ET_qualifier - 77)) | (1L << (MT_reserved - 77)) | (1L << (ET_reserved - 77)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (COLON - 146)) | (1L << (NOT - 146)) | (1L << (AT - 146)) | (1L << (CONSTRUCTOR - 146)) | (1L << (VARIABLE - 146)) | (1L << (METAVAR - 146)) | (1L << (STRING - 146)))) != 0)) {
						{
						setState(1454);
						property();
						}
					}

					}
					}
					setState(1461);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1470);
				_la = _input.LA(1);
				if (_la==MT_property_ZOM || _la==ET_property_ZOM) {
					{
					_tail();
					setState(1468);
					switch (_input.LA(1)) {
					case MT_property_ZOM:
						{
						_term();
						setState(1464);
						match(MT_property_ZOM);
						}
						break;
					case ET_property_ZOM:
						{
						_embed();
						setState(1466);
						match(ET_property_ZOM);
						setState(1467);
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
				setState(1476);
				match(MT_property_ZOM);
				}
				break;
			case ET_property_ZOM:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1478);
				match(ET_property_ZOM);
				setState(1479);
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
		enterRule(_localctx, 210, RULE_property_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1485);
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
				setState(1482);
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
			setState(1487);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 212, RULE_property);
		try {
			setState(1552);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(1490);
				metavar_TOK();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(1495);
				match(NOT);
				setState(1496);
				metavar_TOK();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(1500);
				metavar_TOK();
				_hide();
				setState(1502);
				match(COLON);
				setState(1503);
				term();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(1507);
				variable_TOK();
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				_hide();
				setState(1512);
				match(NOT);
				setState(1513);
				variable_TOK();
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_enterAlt("6");
				setState(1517);
				variable_TOK();
				_hide();
				setState(1519);
				match(COLON);
				setState(1520);
				term();
				_exitAlt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				_enterAlt("7");
				setState(1524);
				string_TOK();
				_exitAlt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				_enterAlt("8");
				_hide();
				setState(1529);
				match(NOT);
				setState(1530);
				string_TOK();
				_exitAlt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				_enterAlt("9");
				setState(1534);
				string_TOK();
				_hide();
				setState(1536);
				match(COLON);
				setState(1537);
				term();
				_exitAlt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				_enterAlt("10");
				setState(1541);
				constructor();
				_hide();
				setState(1543);
				match(COLON);
				setState(1544);
				term();
				_exitAlt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				_term();
				setState(1548);
				match(MT_property);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				_embed();
				setState(1550);
				match(ET_property);
				setState(1551);
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
		enterRule(_localctx, 214, RULE_property_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1554);
			property();
			setState(1555);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 216, RULE_sortparams);
		try {
			setState(1570);
			switch (_input.LA(1)) {
			case FORALL:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				_hide();
				setState(1559);
				match(FORALL);
				setState(1560);
				variable_OOM();
				_hide();
				setState(1562);
				match(DOT);
				_exitAlt();
				}
				break;
			case MT_sortparams:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1566);
				match(MT_sortparams);
				}
				break;
			case ET_sortparams:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1568);
				match(ET_sortparams);
				setState(1569);
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
		enterRule(_localctx, 218, RULE_sortparams_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1572);
			sortparams();
			setState(1573);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 220, RULE_variable_OOM);
		int _la;
		try {
			setState(1600);
			switch (_input.LA(1)) {
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_variable:
			case ET_variable:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterOOM();
				setState(1578); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1577);
					variable();
					}
					}
					setState(1580); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (MT_variable_TOK - 47)) | (1L << (ET_variable_TOK - 47)) | (1L << (MT_variable - 47)) | (1L << (ET_variable - 47)))) != 0) || _la==VARIABLE );
				setState(1590);
				_la = _input.LA(1);
				if (_la==MT_variable_OOM || _la==ET_variable_OOM) {
					{
					_tail();
					setState(1588);
					switch (_input.LA(1)) {
					case MT_variable_OOM:
						{
						_term();
						setState(1584);
						match(MT_variable_OOM);
						}
						break;
					case ET_variable_OOM:
						{
						_embed();
						setState(1586);
						match(ET_variable_OOM);
						setState(1587);
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
				setState(1596);
				match(MT_variable_OOM);
				}
				break;
			case ET_variable_OOM:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1598);
				match(ET_variable_OOM);
				setState(1599);
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
		enterRule(_localctx, 222, RULE_variable_OOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1605);
			switch (_input.LA(1)) {
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_variable:
			case ET_variable:
			case MT_variable_OOM:
			case ET_variable_OOM:
			case VARIABLE:
				{
				setState(1602);
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
			setState(1607);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 224, RULE_sortset);
		try {
			setState(1618);
			switch (_input.LA(1)) {
			case EOF:
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_variable:
			case ET_variable:
			case MT_properties:
			case ET_properties:
			case MT_properties_OPT:
			case ET_properties_OPT:
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
			case AT:
			case CONSTRUCTOR:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1610);
				properties_OPT();
				_exitAlt();
				}
				break;
			case MT_sortset:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1614);
				match(MT_sortset);
				}
				break;
			case ET_sortset:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1616);
				match(ET_sortset);
				setState(1617);
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
		enterRule(_localctx, 226, RULE_sortset_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1620);
			sortset();
			setState(1621);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 228, RULE_properties_OPT);
		int _la;
		try {
			setState(1645);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1626);
				_la = _input.LA(1);
				if (((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (MT_properties - 99)) | (1L << (ET_properties - 99)) | (1L << (LBRACE - 99)))) != 0)) {
					{
					setState(1625);
					properties();
					}
				}

				setState(1636);
				_la = _input.LA(1);
				if (_la==MT_properties_OPT || _la==ET_properties_OPT) {
					{
					_tail();
					setState(1634);
					switch (_input.LA(1)) {
					case MT_properties_OPT:
						{
						_term();
						setState(1630);
						match(MT_properties_OPT);
						}
						break;
					case ET_properties_OPT:
						{
						_embed();
						setState(1632);
						match(ET_properties_OPT);
						setState(1633);
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
				setState(1641);
				match(MT_properties_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1643);
				match(ET_properties_OPT);
				setState(1644);
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
		enterRule(_localctx, 230, RULE_properties_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1647);
			properties_OPT();
			setState(1648);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 232, RULE_sortnames);
		try {
			setState(1659);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_variable:
			case ET_variable:
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
			case AT:
			case CONSTRUCTOR:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1651);
				sortname_ZOM();
				_exitAlt();
				}
				break;
			case MT_sortnames:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1655);
				match(MT_sortnames);
				}
				break;
			case ET_sortnames:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1657);
				match(ET_sortnames);
				setState(1658);
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
		enterRule(_localctx, 234, RULE_sortnames_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1661);
			sortnames();
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
		enterRule(_localctx, 236, RULE_sortname_ZOM);
		int _la;
		try {
			setState(1693);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_variable:
			case ET_variable:
			case MT_sortname:
			case ET_sortname:
			case MT_constructor:
			case ET_constructor:
			case MT_qualifier:
			case ET_qualifier:
			case MT_reserved:
			case ET_reserved:
			case COLON:
			case AT:
			case CONSTRUCTOR:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterZOM();
				setState(1666);
				sortname();
				setState(1672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					_hide();
					setState(1668);
					match(COMMA);
					setState(1669);
					sortname();
					}
					}
					setState(1674);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1683);
				_la = _input.LA(1);
				if (_la==MT_sortname_ZOM || _la==ET_sortname_ZOM) {
					{
					_tail();
					setState(1681);
					switch (_input.LA(1)) {
					case MT_sortname_ZOM:
						{
						_term();
						setState(1677);
						match(MT_sortname_ZOM);
						}
						break;
					case ET_sortname_ZOM:
						{
						_embed();
						setState(1679);
						match(ET_sortname_ZOM);
						setState(1680);
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
				setState(1689);
				match(MT_sortname_ZOM);
				}
				break;
			case ET_sortname_ZOM:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1691);
				match(ET_sortname_ZOM);
				setState(1692);
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
		enterRule(_localctx, 238, RULE_sortname_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_variable:
			case ET_variable:
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
			case AT:
			case CONSTRUCTOR:
			case VARIABLE:
				{
				setState(1695);
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
			setState(1700);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		public Sortargs_OPTContext sortargs_OPT() {
			return getRuleContext(Sortargs_OPTContext.class,0);
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
		enterRule(_localctx, 240, RULE_sortname);
		try {
			setState(1716);
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
				setState(1703);
				constructor();
				setState(1704);
				sortargs_OPT();
				_exitAlt();
				}
				break;
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_variable:
			case ET_variable:
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(1708);
				variable();
				_exitAlt();
				}
				break;
			case MT_sortname:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(1712);
				match(MT_sortname);
				}
				break;
			case ET_sortname:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(1714);
				match(ET_sortname);
				setState(1715);
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
		enterRule(_localctx, 242, RULE_sortname_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1718);
			sortname();
			setState(1719);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sortargs_OPTContext extends ParserRuleContext {
		public SortargsContext sortargs() {
			return getRuleContext(SortargsContext.class,0);
		}
		public TerminalNode MT_sortargs_OPT() { return getToken(CrsxMetaParser.MT_sortargs_OPT, 0); }
		public TerminalNode ET_sortargs_OPT() { return getToken(CrsxMetaParser.ET_sortargs_OPT, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public Sortargs_OPTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortargs_OPT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortargs_OPT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortargs_OPT(this);
		}
	}

	public final Sortargs_OPTContext sortargs_OPT() throws RecognitionException {
		Sortargs_OPTContext _localctx = new Sortargs_OPTContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_sortargs_OPT);
		int _la;
		try {
			setState(1743);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1724);
				_la = _input.LA(1);
				if (((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (MT_sortargs - 125)) | (1L << (ET_sortargs - 125)) | (1L << (LSQUARE - 125)))) != 0)) {
					{
					setState(1723);
					sortargs();
					}
				}

				setState(1734);
				_la = _input.LA(1);
				if (_la==MT_sortargs_OPT || _la==ET_sortargs_OPT) {
					{
					_tail();
					setState(1732);
					switch (_input.LA(1)) {
					case MT_sortargs_OPT:
						{
						_term();
						setState(1728);
						match(MT_sortargs_OPT);
						}
						break;
					case ET_sortargs_OPT:
						{
						_embed();
						setState(1730);
						match(ET_sortargs_OPT);
						setState(1731);
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
				setState(1739);
				match(MT_sortargs_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1741);
				match(ET_sortargs_OPT);
				setState(1742);
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

	public static class Sortargs_OPT_EOFContext extends ParserRuleContext {
		public Sortargs_OPTContext sortargs_OPT() {
			return getRuleContext(Sortargs_OPTContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Sortargs_OPT_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortargs_OPT_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortargs_OPT_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortargs_OPT_EOF(this);
		}
	}

	public final Sortargs_OPT_EOFContext sortargs_OPT_EOF() throws RecognitionException {
		Sortargs_OPT_EOFContext _localctx = new Sortargs_OPT_EOFContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_sortargs_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1745);
			sortargs_OPT();
			setState(1746);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortargsContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(CrsxMetaParser.LSQUARE, 0); }
		public Sortnames_OPTContext sortnames_OPT() {
			return getRuleContext(Sortnames_OPTContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(CrsxMetaParser.RSQUARE, 0); }
		public TerminalNode MT_sortargs() { return getToken(CrsxMetaParser.MT_sortargs, 0); }
		public TerminalNode ET_sortargs() { return getToken(CrsxMetaParser.ET_sortargs, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(CrsxMetaParser.CRSX_EMBED_END, 0); }
		public SortargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortargs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortargs(this);
		}
	}

	public final SortargsContext sortargs() throws RecognitionException {
		SortargsContext _localctx = new SortargsContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_sortargs);
		try {
			setState(1761);
			switch (_input.LA(1)) {
			case LSQUARE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				_hide();
				setState(1750);
				match(LSQUARE);
				setState(1751);
				sortnames_OPT();
				_hide();
				setState(1753);
				match(RSQUARE);
				_exitAlt();
				}
				break;
			case MT_sortargs:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1757);
				match(MT_sortargs);
				}
				break;
			case ET_sortargs:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1759);
				match(ET_sortargs);
				setState(1760);
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

	public static class Sortargs_EOFContext extends ParserRuleContext {
		public SortargsContext sortargs() {
			return getRuleContext(SortargsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxMetaParser.EOF, 0); }
		public Sortargs_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortargs_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).enterSortargs_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxMetaParserListener ) ((CrsxMetaParserListener)listener).exitSortargs_EOF(this);
		}
	}

	public final Sortargs_EOFContext sortargs_EOF() throws RecognitionException {
		Sortargs_EOFContext _localctx = new Sortargs_EOFContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_sortargs_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763);
			sortargs();
			setState(1764);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 252, RULE_sortnames_OPT);
		int _la;
		try {
			setState(1788);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterOPT();
				setState(1769);
				_la = _input.LA(1);
				if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (MT_constructor_TOK - 11)) | (1L << (ET_constructor_TOK - 11)) | (1L << (MT_variable_TOK - 11)) | (1L << (ET_variable_TOK - 11)) | (1L << (MT_variable - 11)) | (1L << (ET_variable - 11)))) != 0) || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (MT_sortnames - 117)) | (1L << (ET_sortnames - 117)) | (1L << (MT_sortname_ZOM - 117)) | (1L << (ET_sortname_ZOM - 117)) | (1L << (MT_sortname - 117)) | (1L << (ET_sortname - 117)) | (1L << (MT_constructor - 117)) | (1L << (ET_constructor - 117)) | (1L << (MT_qualifier - 117)) | (1L << (ET_qualifier - 117)) | (1L << (MT_reserved - 117)) | (1L << (ET_reserved - 117)) | (1L << (COLON - 117)) | (1L << (AT - 117)) | (1L << (CONSTRUCTOR - 117)) | (1L << (VARIABLE - 117)))) != 0)) {
					{
					setState(1768);
					sortnames();
					}
				}

				setState(1779);
				_la = _input.LA(1);
				if (_la==MT_sortnames_OPT || _la==ET_sortnames_OPT) {
					{
					_tail();
					setState(1777);
					switch (_input.LA(1)) {
					case MT_sortnames_OPT:
						{
						_term();
						setState(1773);
						match(MT_sortnames_OPT);
						}
						break;
					case ET_sortnames_OPT:
						{
						_embed();
						setState(1775);
						match(ET_sortnames_OPT);
						setState(1776);
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
				setState(1784);
				match(MT_sortnames_OPT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1786);
				match(ET_sortnames_OPT);
				setState(1787);
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
		enterRule(_localctx, 254, RULE_sortnames_OPT_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1790);
			sortnames_OPT();
			setState(1791);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 256, RULE_forms);
		try {
			setState(1802);
			switch (_input.LA(1)) {
			case EOF:
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_variable:
			case ET_variable:
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
			case AT:
			case CONSTRUCTOR:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt();
				setState(1794);
				form_ZOM();
				_exitAlt();
				}
				break;
			case MT_forms:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(1798);
				match(MT_forms);
				}
				break;
			case ET_forms:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1800);
				match(ET_forms);
				setState(1801);
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
		enterRule(_localctx, 258, RULE_forms_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1804);
			forms();
			setState(1805);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 260, RULE_form_ZOM);
		int _la;
		try {
			setState(1835);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterZOM();
				setState(1815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (MT_constructor_TOK - 11)) | (1L << (ET_constructor_TOK - 11)) | (1L << (MT_variable_TOK - 11)) | (1L << (ET_variable_TOK - 11)) | (1L << (MT_variable - 11)) | (1L << (ET_variable - 11)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (MT_form - 133)) | (1L << (ET_form - 133)) | (1L << (MT_constructor - 133)) | (1L << (ET_constructor - 133)) | (1L << (MT_qualifier - 133)) | (1L << (ET_qualifier - 133)) | (1L << (MT_reserved - 133)) | (1L << (ET_reserved - 133)) | (1L << (COLON - 133)) | (1L << (AT - 133)) | (1L << (CONSTRUCTOR - 133)) | (1L << (VARIABLE - 133)))) != 0)) {
					{
					{
					setState(1809);
					form();
					_hide();
					setState(1811);
					match(SEMI);
					}
					}
					setState(1817);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1826);
				_la = _input.LA(1);
				if (_la==MT_form_ZOM || _la==ET_form_ZOM) {
					{
					_tail();
					setState(1824);
					switch (_input.LA(1)) {
					case MT_form_ZOM:
						{
						_term();
						setState(1820);
						match(MT_form_ZOM);
						}
						break;
					case ET_form_ZOM:
						{
						_embed();
						setState(1822);
						match(ET_form_ZOM);
						setState(1823);
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
				setState(1831);
				match(MT_form_ZOM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(1833);
				match(ET_form_ZOM);
				setState(1834);
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
		enterRule(_localctx, 262, RULE_form_ZOM_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1840);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1837);
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

	public static class FormContext extends ParserRuleContext {
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public Sargs_OPTContext sargs_OPT() {
			return getRuleContext(Sargs_OPTContext.class,0);
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
		enterRule(_localctx, 264, RULE_form);
		try {
			setState(1858);
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
				setState(1845);
				constructor();
				setState(1846);
				sargs_OPT();
				_exitAlt();
				}
				break;
			case MT_variable_TOK:
			case ET_variable_TOK:
			case MT_variable:
			case ET_variable:
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(1850);
				variable();
				_exitAlt();
				}
				break;
			case MT_form:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(1854);
				match(MT_form);
				}
				break;
			case ET_form:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(1856);
				match(ET_form);
				setState(1857);
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
		enterRule(_localctx, 266, RULE_form_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1860);
			form();
			setState(1861);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 268, RULE_constructor);
		try {
			setState(1877);
			switch (_input.LA(1)) {
			case MT_constructor_TOK:
			case ET_constructor_TOK:
			case MT_qualifier:
			case ET_qualifier:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(1864);
				qualifier();
				setState(1865);
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
				setState(1869);
				reserved();
				_exitAlt();
				}
				break;
			case MT_constructor:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(1873);
				match(MT_constructor);
				}
				break;
			case ET_constructor:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(1875);
				match(ET_constructor);
				setState(1876);
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
		enterRule(_localctx, 270, RULE_constructor_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1879);
			constructor();
			setState(1880);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode DOTDOT() { return getToken(CrsxMetaParser.DOTDOT, 0); }
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
		enterRule(_localctx, 272, RULE_qualifier);
		try {
			setState(1896);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(1883);
				constructor_TOK();
				_hide();
				setState(1885);
				match(DOTDOT);
				setState(1886);
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
				setState(1892);
				match(MT_qualifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(1894);
				match(ET_qualifier);
				setState(1895);
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
		enterRule(_localctx, 274, RULE_qualifier_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1898);
			qualifier();
			setState(1899);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 276, RULE_reserved);
		try {
			setState(1914);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_hide();
				setState(1903);
				match(COLON);
				_exitAlt();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(1907);
				match(AT);
				_exitAlt();
				}
				break;
			case MT_reserved:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(1910);
				match(MT_reserved);
				}
				break;
			case ET_reserved:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(1912);
				match(ET_reserved);
				setState(1913);
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
		enterRule(_localctx, 278, RULE_reserved_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1916);
			reserved();
			setState(1917);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00b5\u0782\4\2\t"+
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
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0124\n\2\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4\u0132\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\7\6\u013d\n\6\f\6\16\6\u0140\13\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0148"+
		"\n\6\5\6\u014a\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0154\n\6\3\7\3"+
		"\7\3\7\5\7\u0159\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0174\n\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u0189\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0196"+
		"\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u01b6\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01d6\n\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\5\22\u01de\n\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01e6\n"+
		"\22\5\22\u01e8\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01f1\n\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u0201\n\24\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u0209\n\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\5\26\u0211\n\26\5\26\u0213\n\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u021c\n\26\3\27\3\27\3\27\3\30\3\30\3\30\5\30"+
		"\u0224\n\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u022c\n\30\5\30\u022e\n"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0237\n\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0248"+
		"\n\32\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u0250\n\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u0258\n\34\5\34\u025a\n\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\5\34\u0263\n\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0274\n\36\3\37\3\37\3\37\3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0284\n \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\5\"\u02b6\n\"\3#\3#\3#\3$\3$\3$\5$\u02be\n$\3$\3$\3$"+
		"\3$\3$\3$\5$\u02c6\n$\5$\u02c8\n$\3$\3$\3$\3$\3$\3$\3$\5$\u02d1\n$\3%"+
		"\3%\3%\3&\3&\3&\6&\u02d9\n&\r&\16&\u02da\3&\3&\3&\3&\3&\3&\5&\u02e3\n"+
		"&\5&\u02e5\n&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u02ef\n&\3\'\3\'\3\'\5\'\u02f4"+
		"\n\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0300\n(\3)\3)\3)\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0312\n*\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u032f\n,\3-\3-"+
		"\3-\3.\3.\3.\7.\u0337\n.\f.\16.\u033a\13.\3.\3.\3.\3.\3.\3.\5.\u0342\n"+
		".\5.\u0344\n.\3.\3.\3.\3.\3.\3.\3.\5.\u034d\n.\3/\3/\3/\5/\u0352\n/\3"+
		"/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0360\n\60"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\5\62\u0368\n\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\5\62\u0370\n\62\5\62\u0372\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\5\62\u037b\n\62\3\63\3\63\3\63\3\64\3\64\3\64\5\64\u0383\n\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\5\64\u038b\n\64\5\64\u038d\n\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\5\64\u0396\n\64\3\65\3\65\3\65\3\66\3\66\3\66"+
		"\5\66\u039e\n\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u03a6\n\66\5\66\u03a8"+
		"\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u03b1\n\66\3\67\3\67\3\67"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u03cb"+
		"\n8\39\39\39\3:\3:\3:\5:\u03d3\n:\3:\3:\3:\3:\3:\3:\5:\u03db\n:\5:\u03dd"+
		"\n:\3:\3:\3:\3:\3:\3:\3:\5:\u03e6\n:\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\5<\u03f4\n<\3=\3=\3=\3>\3>\3>\3>\3>\3>\7>\u03ff\n>\f>\16>\u0402\13"+
		">\3>\3>\3>\3>\3>\3>\5>\u040a\n>\5>\u040c\n>\3>\3>\3>\3>\3>\3>\3>\3>\5"+
		">\u0416\n>\3?\3?\3?\5?\u041b\n?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0434\n@\3A\3A\3A\3B\3B\3B\5B\u043c"+
		"\nB\3B\3B\3B\3B\3B\3B\5B\u0444\nB\5B\u0446\nB\3B\3B\3B\3B\3B\3B\3B\5B"+
		"\u044f\nB\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u045d\nD\3E\3E\3E\3F"+
		"\3F\3F\3F\3F\3F\7F\u0468\nF\fF\16F\u046b\13F\3F\3F\3F\3F\3F\3F\5F\u0473"+
		"\nF\5F\u0475\nF\3F\3F\3F\3F\3F\3F\3F\3F\5F\u047f\nF\3G\3G\3G\5G\u0484"+
		"\nG\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u0495\nH\3I\3I\3I"+
		"\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\5J\u04a8\nJ\3K\3K\3K\3L\3L"+
		"\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u04ba\nL\3M\3M\3M\3N\3N\3N\3N\3N"+
		"\3N\3N\3N\5N\u04c7\nN\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\5P\u04d4\nP\3Q"+
		"\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u04e4\nR\3S\3S\3S\3T\3T\3T"+
		"\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u04fd\nT\3U\3U"+
		"\3U\3V\3V\3V\3V\3V\3V\3V\3V\5V\u050a\nV\3W\3W\3W\3X\3X\3X\3X\3X\3X\3X"+
		"\3X\5X\u0517\nX\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0524\nZ\3[\3[\3["+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u0531\n\\\3]\3]\3]\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u0543\n^\3_\3_\3_\3`\3`\3`\5`\u054b\n`\3"+
		"`\3`\3`\3`\3`\3`\5`\u0553\n`\5`\u0555\n`\3`\3`\3`\3`\3`\3`\3`\5`\u055e"+
		"\n`\3a\3a\3a\3b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u056c\nb\3c\3c\3c\3d\3d\3d"+
		"\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u057e\nd\3e\3e\3e\3f\3f\3f\5f\u0586"+
		"\nf\3f\3f\3f\3f\3f\3f\5f\u058e\nf\5f\u0590\nf\3f\3f\3f\3f\3f\3f\3f\5f"+
		"\u0599\nf\3g\3g\3g\3h\3h\3h\3h\3h\3h\3h\3h\3h\5h\u05a7\nh\3i\3i\3i\3j"+
		"\3j\3j\3j\3j\3j\5j\u05b2\nj\7j\u05b4\nj\fj\16j\u05b7\13j\3j\3j\3j\3j\3"+
		"j\3j\5j\u05bf\nj\5j\u05c1\nj\3j\3j\3j\3j\3j\3j\3j\3j\5j\u05cb\nj\3k\3"+
		"k\3k\5k\u05d0\nk\3k\3k\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3"+
		"l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3"+
		"l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3"+
		"l\3l\5l\u0613\nl\3m\3m\3m\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\5n\u0625"+
		"\nn\3o\3o\3o\3p\3p\3p\6p\u062d\np\rp\16p\u062e\3p\3p\3p\3p\3p\3p\5p\u0637"+
		"\np\5p\u0639\np\3p\3p\3p\3p\3p\3p\3p\3p\5p\u0643\np\3q\3q\3q\5q\u0648"+
		"\nq\3q\3q\3r\3r\3r\3r\3r\3r\3r\3r\3r\5r\u0655\nr\3s\3s\3s\3t\3t\3t\5t"+
		"\u065d\nt\3t\3t\3t\3t\3t\3t\5t\u0665\nt\5t\u0667\nt\3t\3t\3t\3t\3t\3t"+
		"\3t\5t\u0670\nt\3u\3u\3u\3v\3v\3v\3v\3v\3v\3v\3v\3v\5v\u067e\nv\3w\3w"+
		"\3w\3x\3x\3x\3x\3x\3x\7x\u0689\nx\fx\16x\u068c\13x\3x\3x\3x\3x\3x\3x\5"+
		"x\u0694\nx\5x\u0696\nx\3x\3x\3x\3x\3x\3x\3x\3x\5x\u06a0\nx\3y\3y\3y\5"+
		"y\u06a5\ny\3y\3y\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\5z\u06b7\n"+
		"z\3{\3{\3{\3|\3|\3|\5|\u06bf\n|\3|\3|\3|\3|\3|\3|\5|\u06c7\n|\5|\u06c9"+
		"\n|\3|\3|\3|\3|\3|\3|\3|\5|\u06d2\n|\3}\3}\3}\3~\3~\3~\3~\3~\3~\3~\3~"+
		"\3~\3~\3~\3~\3~\5~\u06e4\n~\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080"+
		"\5\u0080\u06ec\n\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\5\u0080\u06f4\n\u0080\5\u0080\u06f6\n\u0080\3\u0080\3\u0080\3\u0080\3"+
		"\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u06ff\n\u0080\3\u0081\3\u0081\3"+
		"\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\5\u0082\u070d\n\u0082\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\7\u0084\u0718\n\u0084\f\u0084\16\u0084"+
		"\u071b\13\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084"+
		"\u0723\n\u0084\5\u0084\u0725\n\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3"+
		"\u0084\3\u0084\3\u0084\5\u0084\u072e\n\u0084\3\u0085\3\u0085\3\u0085\5"+
		"\u0085\u0733\n\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3"+
		"\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\5\u0086\u0745\n\u0086\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\5\u0088\u0758\n\u0088\3\u0089\3\u0089\3\u0089"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u076b\n\u008a\3\u008b"+
		"\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u077d\n\u008c"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\2\2\u008e\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de"+
		"\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6"+
		"\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e"+
		"\u0110\u0112\u0114\u0116\u0118\2\2\u07f7\2\u0123\3\2\2\2\4\u0125\3\2\2"+
		"\2\6\u0131\3\2\2\2\b\u0133\3\2\2\2\n\u0153\3\2\2\2\f\u0158\3\2\2\2\16"+
		"\u0173\3\2\2\2\20\u0175\3\2\2\2\22\u0188\3\2\2\2\24\u018a\3\2\2\2\26\u0195"+
		"\3\2\2\2\30\u0197\3\2\2\2\32\u01b5\3\2\2\2\34\u01b7\3\2\2\2\36\u01d5\3"+
		"\2\2\2 \u01d7\3\2\2\2\"\u01f0\3\2\2\2$\u01f2\3\2\2\2&\u0200\3\2\2\2(\u0202"+
		"\3\2\2\2*\u021b\3\2\2\2,\u021d\3\2\2\2.\u0236\3\2\2\2\60\u0238\3\2\2\2"+
		"\62\u0247\3\2\2\2\64\u0249\3\2\2\2\66\u0262\3\2\2\28\u0264\3\2\2\2:\u0273"+
		"\3\2\2\2<\u0275\3\2\2\2>\u0283\3\2\2\2@\u0285\3\2\2\2B\u02b5\3\2\2\2D"+
		"\u02b7\3\2\2\2F\u02d0\3\2\2\2H\u02d2\3\2\2\2J\u02ee\3\2\2\2L\u02f3\3\2"+
		"\2\2N\u02ff\3\2\2\2P\u0301\3\2\2\2R\u0311\3\2\2\2T\u0313\3\2\2\2V\u032e"+
		"\3\2\2\2X\u0330\3\2\2\2Z\u034c\3\2\2\2\\\u0351\3\2\2\2^\u035f\3\2\2\2"+
		"`\u0361\3\2\2\2b\u037a\3\2\2\2d\u037c\3\2\2\2f\u0395\3\2\2\2h\u0397\3"+
		"\2\2\2j\u03b0\3\2\2\2l\u03b2\3\2\2\2n\u03ca\3\2\2\2p\u03cc\3\2\2\2r\u03e5"+
		"\3\2\2\2t\u03e7\3\2\2\2v\u03f3\3\2\2\2x\u03f5\3\2\2\2z\u0415\3\2\2\2|"+
		"\u041a\3\2\2\2~\u0433\3\2\2\2\u0080\u0435\3\2\2\2\u0082\u044e\3\2\2\2"+
		"\u0084\u0450\3\2\2\2\u0086\u045c\3\2\2\2\u0088\u045e\3\2\2\2\u008a\u047e"+
		"\3\2\2\2\u008c\u0483\3\2\2\2\u008e\u0494\3\2\2\2\u0090\u0496\3\2\2\2\u0092"+
		"\u04a7\3\2\2\2\u0094\u04a9\3\2\2\2\u0096\u04b9\3\2\2\2\u0098\u04bb\3\2"+
		"\2\2\u009a\u04c6\3\2\2\2\u009c\u04c8\3\2\2\2\u009e\u04d3\3\2\2\2\u00a0"+
		"\u04d5\3\2\2\2\u00a2\u04e3\3\2\2\2\u00a4\u04e5\3\2\2\2\u00a6\u04fc\3\2"+
		"\2\2\u00a8\u04fe\3\2\2\2\u00aa\u0509\3\2\2\2\u00ac\u050b\3\2\2\2\u00ae"+
		"\u0516\3\2\2\2\u00b0\u0518\3\2\2\2\u00b2\u0523\3\2\2\2\u00b4\u0525\3\2"+
		"\2\2\u00b6\u0530\3\2\2\2\u00b8\u0532\3\2\2\2\u00ba\u0542\3\2\2\2\u00bc"+
		"\u0544\3\2\2\2\u00be\u055d\3\2\2\2\u00c0\u055f\3\2\2\2\u00c2\u056b\3\2"+
		"\2\2\u00c4\u056d\3\2\2\2\u00c6\u057d\3\2\2\2\u00c8\u057f\3\2\2\2\u00ca"+
		"\u0598\3\2\2\2\u00cc\u059a\3\2\2\2\u00ce\u05a6\3\2\2\2\u00d0\u05a8\3\2"+
		"\2\2\u00d2\u05ca\3\2\2\2\u00d4\u05cf\3\2\2\2\u00d6\u0612\3\2\2\2\u00d8"+
		"\u0614\3\2\2\2\u00da\u0624\3\2\2\2\u00dc\u0626\3\2\2\2\u00de\u0642\3\2"+
		"\2\2\u00e0\u0647\3\2\2\2\u00e2\u0654\3\2\2\2\u00e4\u0656\3\2\2\2\u00e6"+
		"\u066f\3\2\2\2\u00e8\u0671\3\2\2\2\u00ea\u067d\3\2\2\2\u00ec\u067f\3\2"+
		"\2\2\u00ee\u069f\3\2\2\2\u00f0\u06a4\3\2\2\2\u00f2\u06b6\3\2\2\2\u00f4"+
		"\u06b8\3\2\2\2\u00f6\u06d1\3\2\2\2\u00f8\u06d3\3\2\2\2\u00fa\u06e3\3\2"+
		"\2\2\u00fc\u06e5\3\2\2\2\u00fe\u06fe\3\2\2\2\u0100\u0700\3\2\2\2\u0102"+
		"\u070c\3\2\2\2\u0104\u070e\3\2\2\2\u0106\u072d\3\2\2\2\u0108\u0732\3\2"+
		"\2\2\u010a\u0744\3\2\2\2\u010c\u0746\3\2\2\2\u010e\u0757\3\2\2\2\u0110"+
		"\u0759\3\2\2\2\u0112\u076a\3\2\2\2\u0114\u076c\3\2\2\2\u0116\u077c\3\2"+
		"\2\2\u0118\u077e\3\2\2\2\u011a\u011b\b\2\1\2\u011b\u011c\5\6\4\2\u011c"+
		"\u011d\b\2\1\2\u011d\u0124\3\2\2\2\u011e\u011f\b\2\1\2\u011f\u0124\7\3"+
		"\2\2\u0120\u0121\b\2\1\2\u0121\u0122\7\4\2\2\u0122\u0124\7\u00b5\2\2\u0123"+
		"\u011a\3\2\2\2\u0123\u011e\3\2\2\2\u0123\u0120\3\2\2\2\u0124\3\3\2\2\2"+
		"\u0125\u0126\5\2\2\2\u0126\u0127\7\2\2\3\u0127\5\3\2\2\2\u0128\u0129\b"+
		"\4\1\2\u0129\u012a\5\n\6\2\u012a\u012b\b\4\1\2\u012b\u0132\3\2\2\2\u012c"+
		"\u012d\b\4\1\2\u012d\u0132\7\5\2\2\u012e\u012f\b\4\1\2\u012f\u0130\7\6"+
		"\2\2\u0130\u0132\7\u00b5\2\2\u0131\u0128\3\2\2\2\u0131\u012c\3\2\2\2\u0131"+
		"\u012e\3\2\2\2\u0132\7\3\2\2\2\u0133\u0134\5\6\4\2\u0134\u0135\7\2\2\3"+
		"\u0135\t\3\2\2\2\u0136\u0137\b\6\1\2\u0137\u0138\b\6\1\2\u0138\u013e\5"+
		"\16\b\2\u0139\u013a\b\6\1\2\u013a\u013b\7\u009d\2\2\u013b\u013d\5\16\b"+
		"\2\u013c\u0139\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f"+
		"\3\2\2\2\u013f\u0149\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0147\b\6\1\2\u0142"+
		"\u0143\b\6\1\2\u0143\u0148\7\7\2\2\u0144\u0145\b\6\1\2\u0145\u0146\7\b"+
		"\2\2\u0146\u0148\7\u00b5\2\2\u0147\u0142\3\2\2\2\u0147\u0144\3\2\2\2\u0148"+
		"\u014a\3\2\2\2\u0149\u0141\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u014c\b\6\1\2\u014c\u014d\b\6\1\2\u014d\u0154\3\2\2\2\u014e"+
		"\u014f\b\6\1\2\u014f\u0154\7\7\2\2\u0150\u0151\b\6\1\2\u0151\u0152\7\b"+
		"\2\2\u0152\u0154\7\u00b5\2\2\u0153\u0136\3\2\2\2\u0153\u014e\3\2\2\2\u0153"+
		"\u0150\3\2\2\2\u0154\13\3\2\2\2\u0155\u0159\5\n\6\2\u0156\u0157\b\7\1"+
		"\2\u0157\u0159\b\7\1\2\u0158\u0155\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015a\u015b\7\2\2\3\u015b\r\3\2\2\2\u015c\u015d\b\b\1\2\u015d"+
		"\u015e\5\22\n\2\u015e\u015f\b\b\1\2\u015f\u0174\3\2\2\2\u0160\u0161\b"+
		"\b\1\2\u0161\u0162\5\32\16\2\u0162\u0163\b\b\1\2\u0163\u0174\3\2\2\2\u0164"+
		"\u0165\b\b\1\2\u0165\u0166\5\36\20\2\u0166\u0167\b\b\1\2\u0167\u0174\3"+
		"\2\2\2\u0168\u0169\b\b\1\2\u0169\u016a\5&\24\2\u016a\u016b\b\b\1\2\u016b"+
		"\u0174\3\2\2\2\u016c\u016d\b\b\1\2\u016d\u0174\b\b\1\2\u016e\u016f\b\b"+
		"\1\2\u016f\u0174\7\t\2\2\u0170\u0171\b\b\1\2\u0171\u0172\7\n\2\2\u0172"+
		"\u0174\7\u00b5\2\2\u0173\u015c\3\2\2\2\u0173\u0160\3\2\2\2\u0173\u0164"+
		"\3\2\2\2\u0173\u0168\3\2\2\2\u0173\u016c\3\2\2\2\u0173\u016e\3\2\2\2\u0173"+
		"\u0170\3\2\2\2\u0174\17\3\2\2\2\u0175\u0176\5\16\b\2\u0176\u0177\7\2\2"+
		"\3\u0177\21\3\2\2\2\u0178\u0179\b\n\1\2\u0179\u017a\b\n\1\2\u017a\u017b"+
		"\7\u008f\2\2\u017b\u017c\5\26\f\2\u017c\u017d\b\n\1\2\u017d\u017e\7\u0099"+
		"\2\2\u017e\u017f\5\6\4\2\u017f\u0180\b\n\1\2\u0180\u0181\7\u009a\2\2\u0181"+
		"\u0182\b\n\1\2\u0182\u0189\3\2\2\2\u0183\u0184\b\n\1\2\u0184\u0189\7\13"+
		"\2\2\u0185\u0186\b\n\1\2\u0186\u0187\7\f\2\2\u0187\u0189\7\u00b5\2\2\u0188"+
		"\u0178\3\2\2\2\u0188\u0183\3\2\2\2\u0188\u0185\3\2\2\2\u0189\23\3\2\2"+
		"\2\u018a\u018b\5\22\n\2\u018b\u018c\7\2\2\3\u018c\25\3\2\2\2\u018d\u018e"+
		"\b\f\1\2\u018e\u018f\7\u00ac\2\2\u018f\u0196\b\f\1\2\u0190\u0191\b\f\1"+
		"\2\u0191\u0196\7\r\2\2\u0192\u0193\b\f\1\2\u0193\u0194\7\16\2\2\u0194"+
		"\u0196\7\u00b5\2\2\u0195\u018d\3\2\2\2\u0195\u0190\3\2\2\2\u0195\u0192"+
		"\3\2\2\2\u0196\27\3\2\2\2\u0197\u0198\5\26\f\2\u0198\u0199\7\2\2\3\u0199"+
		"\31\3\2\2\2\u019a\u019b\b\16\1\2\u019b\u019c\b\16\1\2\u019c\u019d\7\u0090"+
		"\2\2\u019d\u019e\5\u010e\u0088\2\u019e\u019f\b\16\1\2\u019f\u01b6\3\2"+
		"\2\2\u01a0\u01a1\b\16\1\2\u01a1\u01a2\b\16\1\2\u01a2\u01a3\7\u0090\2\2"+
		"\u01a3\u01a4\b\16\1\2\u01a4\u01a5\7\u008f\2\2\u01a5\u01a6\5\u010e\u0088"+
		"\2\u01a6\u01a7\b\16\1\2\u01a7\u01b6\3\2\2\2\u01a8\u01a9\b\16\1\2\u01a9"+
		"\u01aa\b\16\1\2\u01aa\u01ab\7\u0090\2\2\u01ab\u01ac\b\16\1\2\u01ac\u01ad"+
		"\7\u0093\2\2\u01ad\u01ae\5\u010e\u0088\2\u01ae\u01af\b\16\1\2\u01af\u01b6"+
		"\3\2\2\2\u01b0\u01b1\b\16\1\2\u01b1\u01b6\7\17\2\2\u01b2\u01b3\b\16\1"+
		"\2\u01b3\u01b4\7\20\2\2\u01b4\u01b6\7\u00b5\2\2\u01b5\u019a\3\2\2\2\u01b5"+
		"\u01a0\3\2\2\2\u01b5\u01a8\3\2\2\2\u01b5\u01b0\3\2\2\2\u01b5\u01b2\3\2"+
		"\2\2\u01b6\33\3\2\2\2\u01b7\u01b8\5\32\16\2\u01b8\u01b9\7\2\2\3\u01b9"+
		"\35\3\2\2\2\u01ba\u01bb\b\20\1\2\u01bb\u01bc\5\"\22\2\u01bc\u01bd\5\u00e2"+
		"r\2\u01bd\u01be\5\u00f2z\2\u01be\u01bf\b\20\1\2\u01bf\u01c0\7\u009f\2"+
		"\2\u01c0\u01c1\b\20\1\2\u01c1\u01c2\7\u0097\2\2\u01c2\u01c3\5\u0102\u0082"+
		"\2\u01c3\u01c4\b\20\1\2\u01c4\u01c5\7\u0098\2\2\u01c5\u01c6\b\20\1\2\u01c6"+
		"\u01d6\3\2\2\2\u01c7\u01c8\b\20\1\2\u01c8\u01c9\5\"\22\2\u01c9\u01ca\5"+
		"\u00e2r\2\u01ca\u01cb\5\u010a\u0086\2\u01cb\u01cc\b\20\1\2\u01cc\u01cd"+
		"\7\u00a0\2\2\u01cd\u01ce\5\u00f2z\2\u01ce\u01cf\b\20\1\2\u01cf\u01d6\3"+
		"\2\2\2\u01d0\u01d1\b\20\1\2\u01d1\u01d6\7\21\2\2\u01d2\u01d3\b\20\1\2"+
		"\u01d3\u01d4\7\22\2\2\u01d4\u01d6\7\u00b5\2\2\u01d5\u01ba\3\2\2\2\u01d5"+
		"\u01c7\3\2\2\2\u01d5\u01d0\3\2\2\2\u01d5\u01d2\3\2\2\2\u01d6\37\3\2\2"+
		"\2\u01d7\u01d8\5\36\20\2\u01d8\u01d9\7\2\2\3\u01d9!\3\2\2\2\u01da\u01db"+
		"\b\22\1\2\u01db\u01dd\b\22\1\2\u01dc\u01de\5\u00dan\2\u01dd\u01dc\3\2"+
		"\2\2\u01dd\u01de\3\2\2\2\u01de\u01e7\3\2\2\2\u01df\u01e5\b\22\1\2\u01e0"+
		"\u01e1\b\22\1\2\u01e1\u01e6\7\23\2\2\u01e2\u01e3\b\22\1\2\u01e3\u01e4"+
		"\7\24\2\2\u01e4\u01e6\7\u00b5\2\2\u01e5\u01e0\3\2\2\2\u01e5\u01e2\3\2"+
		"\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01df\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01ea\b\22\1\2\u01ea\u01f1\b\22\1\2\u01eb\u01ec\b"+
		"\22\1\2\u01ec\u01f1\7\23\2\2\u01ed\u01ee\b\22\1\2\u01ee\u01ef\7\24\2\2"+
		"\u01ef\u01f1\7\u00b5\2\2\u01f0\u01da\3\2\2\2\u01f0\u01eb\3\2\2\2\u01f0"+
		"\u01ed\3\2\2\2\u01f1#\3\2\2\2\u01f2\u01f3\5\"\22\2\u01f3\u01f4\7\2\2\3"+
		"\u01f4%\3\2\2\2\u01f5\u01f6\b\24\1\2\u01f6\u01f7\5*\26\2\u01f7\u01f8\5"+
		"B\"\2\u01f8\u01f9\5.\30\2\u01f9\u01fa\b\24\1\2\u01fa\u0201\3\2\2\2\u01fb"+
		"\u01fc\b\24\1\2\u01fc\u0201\7\25\2\2\u01fd\u01fe\b\24\1\2\u01fe\u01ff"+
		"\7\26\2\2\u01ff\u0201\7\u00b5\2\2\u0200\u01f5\3\2\2\2\u0200\u01fb\3\2"+
		"\2\2\u0200\u01fd\3\2\2\2\u0201\'\3\2\2\2\u0202\u0203\5&\24\2\u0203\u0204"+
		"\7\2\2\3\u0204)\3\2\2\2\u0205\u0206\b\26\1\2\u0206\u0208\b\26\1\2\u0207"+
		"\u0209\5\62\32\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u0212\3"+
		"\2\2\2\u020a\u0210\b\26\1\2\u020b\u020c\b\26\1\2\u020c\u0211\7\27\2\2"+
		"\u020d\u020e\b\26\1\2\u020e\u020f\7\30\2\2\u020f\u0211\7\u00b5\2\2\u0210"+
		"\u020b\3\2\2\2\u0210\u020d\3\2\2\2\u0211\u0213\3\2\2\2\u0212\u020a\3\2"+
		"\2\2\u0212\u0213\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\b\26\1\2\u0215"+
		"\u021c\b\26\1\2\u0216\u0217\b\26\1\2\u0217\u021c\7\27\2\2\u0218\u0219"+
		"\b\26\1\2\u0219\u021a\7\30\2\2\u021a\u021c\7\u00b5\2\2\u021b\u0205\3\2"+
		"\2\2\u021b\u0216\3\2\2\2\u021b\u0218\3\2\2\2\u021c+\3\2\2\2\u021d\u021e"+
		"\5*\26\2\u021e\u021f\7\2\2\3\u021f-\3\2\2\2\u0220\u0221\b\30\1\2\u0221"+
		"\u0223\b\30\1\2\u0222\u0224\5> \2\u0223\u0222\3\2\2\2\u0223\u0224\3\2"+
		"\2\2\u0224\u022d\3\2\2\2\u0225\u022b\b\30\1\2\u0226\u0227\b\30\1\2\u0227"+
		"\u022c\7\31\2\2\u0228\u0229\b\30\1\2\u0229\u022a\7\32\2\2\u022a\u022c"+
		"\7\u00b5\2\2\u022b\u0226\3\2\2\2\u022b\u0228\3\2\2\2\u022c\u022e\3\2\2"+
		"\2\u022d\u0225\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230"+
		"\b\30\1\2\u0230\u0237\b\30\1\2\u0231\u0232\b\30\1\2\u0232\u0237\7\31\2"+
		"\2\u0233\u0234\b\30\1\2\u0234\u0235\7\32\2\2\u0235\u0237\7\u00b5\2\2\u0236"+
		"\u0220\3\2\2\2\u0236\u0231\3\2\2\2\u0236\u0233\3\2\2\2\u0237/\3\2\2\2"+
		"\u0238\u0239\5.\30\2\u0239\u023a\7\2\2\3\u023a\61\3\2\2\2\u023b\u023c"+
		"\b\32\1\2\u023c\u023d\5\u010e\u0088\2\u023d\u023e\5\66\34\2\u023e\u023f"+
		"\b\32\1\2\u023f\u0240\7\u0094\2\2\u0240\u0241\b\32\1\2\u0241\u0248\3\2"+
		"\2\2\u0242\u0243\b\32\1\2\u0243\u0248\7\33\2\2\u0244\u0245\b\32\1\2\u0245"+
		"\u0246\7\34\2\2\u0246\u0248\7\u00b5\2\2\u0247\u023b\3\2\2\2\u0247\u0242"+
		"\3\2\2\2\u0247\u0244\3\2\2\2\u0248\63\3\2\2\2\u0249\u024a\5\62\32\2\u024a"+
		"\u024b\7\2\2\3\u024b\65\3\2\2\2\u024c\u024d\b\34\1\2\u024d\u024f\b\34"+
		"\1\2\u024e\u0250\5n8\2\u024f\u024e\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0259"+
		"\3\2\2\2\u0251\u0257\b\34\1\2\u0252\u0253\b\34\1\2\u0253\u0258\7\35\2"+
		"\2\u0254\u0255\b\34\1\2\u0255\u0256\7\36\2\2\u0256\u0258\7\u00b5\2\2\u0257"+
		"\u0252\3\2\2\2\u0257\u0254\3\2\2\2\u0258\u025a\3\2\2\2\u0259\u0251\3\2"+
		"\2\2\u0259\u025a\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\b\34\1\2\u025c"+
		"\u0263\b\34\1\2\u025d\u025e\b\34\1\2\u025e\u0263\7\35\2\2\u025f\u0260"+
		"\b\34\1\2\u0260\u0261\7\36\2\2\u0261\u0263\7\u00b5\2\2\u0262\u024c\3\2"+
		"\2\2\u0262\u025d\3\2\2\2\u0262\u025f\3\2\2\2\u0263\67\3\2\2\2\u0264\u0265"+
		"\5\66\34\2\u0265\u0266\7\2\2\3\u02669\3\2\2\2\u0267\u0268\b\36\1\2\u0268"+
		"\u0269\b\36\1\2\u0269\u026a\7\u00a7\2\2\u026a\u026b\5\u010e\u0088\2\u026b"+
		"\u026c\5\66\34\2\u026c\u026d\b\36\1\2\u026d\u0274\3\2\2\2\u026e\u026f"+
		"\b\36\1\2\u026f\u0274\7\37\2\2\u0270\u0271\b\36\1\2\u0271\u0272\7 \2\2"+
		"\u0272\u0274\7\u00b5\2\2\u0273\u0267\3\2\2\2\u0273\u026e\3\2\2\2\u0273"+
		"\u0270\3\2\2\2\u0274;\3\2\2\2\u0275\u0276\5:\36\2\u0276\u0277\7\2\2\3"+
		"\u0277=\3\2\2\2\u0278\u0279\b \1\2\u0279\u027a\b \1\2\u027a\u027b\7\u0095"+
		"\2\2\u027b\u027c\5B\"\2\u027c\u027d\b \1\2\u027d\u0284\3\2\2\2\u027e\u027f"+
		"\b \1\2\u027f\u0284\7!\2\2\u0280\u0281\b \1\2\u0281\u0282\7\"\2\2\u0282"+
		"\u0284\7\u00b5\2\2\u0283\u0278\3\2\2\2\u0283\u027e\3\2\2\2\u0283\u0280"+
		"\3\2\2\2\u0284?\3\2\2\2\u0285\u0286\5> \2\u0286\u0287\7\2\2\3\u0287A\3"+
		"\2\2\2\u0288\u0289\b\"\1\2\u0289\u028a\5\u010e\u0088\2\u028a\u028b\5F"+
		"$\2\u028b\u028c\b\"\1\2\u028c\u02b6\3\2\2\2\u028d\u028e\b\"\1\2\u028e"+
		"\u028f\5\u0096L\2\u028f\u0290\b\"\1\2\u0290\u02b6\3\2\2\2\u0291\u0292"+
		"\b\"\1\2\u0292\u0293\5\u008eH\2\u0293\u0294\b\"\1\2\u0294\u02b6\3\2\2"+
		"\2\u0295\u0296\b\"\1\2\u0296\u0297\5\u0092J\2\u0297\u0298\b\"\1\2\u0298"+
		"\u02b6\3\2\2\2\u0299\u029a\b\"\1\2\u029a\u029b\5\u00c6d\2\u029b\u029c"+
		"\5B\"\2\u029c\u029d\b\"\1\2\u029d\u02b6\3\2\2\2\u029e\u029f\b\"\1\2\u029f"+
		"\u02a0\5\u00a6T\2\u02a0\u02a1\b\"\1\2\u02a1\u02b6\3\2\2\2\u02a2\u02a3"+
		"\b\"\1\2\u02a3\u02a4\5J&\2\u02a4\u02a5\5B\"\2\u02a5\u02a6\b\"\1\2\u02a6"+
		"\u02b6\3\2\2\2\u02a7\u02a8\b\"\1\2\u02a8\u02a9\5N(\2\u02a9\u02aa\5\66"+
		"\34\2\u02aa\u02ab\b\"\1\2\u02ab\u02b6\3\2\2\2\u02ac\u02ad\b\"\1\2\u02ad"+
		"\u02ae\5\u00ba^\2\u02ae\u02af\b\"\1\2\u02af\u02b6\3\2\2\2\u02b0\u02b1"+
		"\b\"\1\2\u02b1\u02b6\7#\2\2\u02b2\u02b3\b\"\1\2\u02b3\u02b4\7$\2\2\u02b4"+
		"\u02b6\7\u00b5\2\2\u02b5\u0288\3\2\2\2\u02b5\u028d\3\2\2\2\u02b5\u0291"+
		"\3\2\2\2\u02b5\u0295\3\2\2\2\u02b5\u0299\3\2\2\2\u02b5\u029e\3\2\2\2\u02b5"+
		"\u02a2\3\2\2\2\u02b5\u02a7\3\2\2\2\u02b5\u02ac\3\2\2\2\u02b5\u02b0\3\2"+
		"\2\2\u02b5\u02b2\3\2\2\2\u02b6C\3\2\2\2\u02b7\u02b8\5B\"\2\u02b8\u02b9"+
		"\7\2\2\3\u02b9E\3\2\2\2\u02ba\u02bb\b$\1\2\u02bb\u02bd\b$\1\2\u02bc\u02be"+
		"\5~@\2\u02bd\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02c7\3\2\2\2\u02bf"+
		"\u02c5\b$\1\2\u02c0\u02c1\b$\1\2\u02c1\u02c6\7%\2\2\u02c2\u02c3\b$\1\2"+
		"\u02c3\u02c4\7&\2\2\u02c4\u02c6\7\u00b5\2\2\u02c5\u02c0\3\2\2\2\u02c5"+
		"\u02c2\3\2\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02bf\3\2\2\2\u02c7\u02c8\3\2"+
		"\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\b$\1\2\u02ca\u02d1\b$\1\2\u02cb\u02cc"+
		"\b$\1\2\u02cc\u02d1\7%\2\2\u02cd\u02ce\b$\1\2\u02ce\u02cf\7&\2\2\u02cf"+
		"\u02d1\7\u00b5\2\2\u02d0\u02ba\3\2\2\2\u02d0\u02cb\3\2\2\2\u02d0\u02cd"+
		"\3\2\2\2\u02d1G\3\2\2\2\u02d2\u02d3\5F$\2\u02d3\u02d4\7\2\2\3\u02d4I\3"+
		"\2\2\2\u02d5\u02d6\b&\1\2\u02d6\u02d8\b&\1\2\u02d7\u02d9\5:\36\2\u02d8"+
		"\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2"+
		"\2\2\u02db\u02e4\3\2\2\2\u02dc\u02e2\b&\1\2\u02dd\u02de\b&\1\2\u02de\u02e3"+
		"\7\'\2\2\u02df\u02e0\b&\1\2\u02e0\u02e1\7(\2\2\u02e1\u02e3\7\u00b5\2\2"+
		"\u02e2\u02dd\3\2\2\2\u02e2\u02df\3\2\2\2\u02e3\u02e5\3\2\2\2\u02e4\u02dc"+
		"\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\b&\1\2\u02e7"+
		"\u02e8\b&\1\2\u02e8\u02ef\3\2\2\2\u02e9\u02ea\b&\1\2\u02ea\u02ef\7\'\2"+
		"\2\u02eb\u02ec\b&\1\2\u02ec\u02ed\7(\2\2\u02ed\u02ef\7\u00b5\2\2\u02ee"+
		"\u02d5\3\2\2\2\u02ee\u02e9\3\2\2\2\u02ee\u02eb\3\2\2\2\u02efK\3\2\2\2"+
		"\u02f0\u02f4\5J&\2\u02f1\u02f2\b\'\1\2\u02f2\u02f4\b\'\1\2\u02f3\u02f0"+
		"\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\7\2\2\3\u02f6"+
		"M\3\2\2\2\u02f7\u02f8\b(\1\2\u02f8\u02f9\7\u00ae\2\2\u02f9\u0300\b(\1"+
		"\2\u02fa\u02fb\b(\1\2\u02fb\u0300\7)\2\2\u02fc\u02fd\b(\1\2\u02fd\u02fe"+
		"\7*\2\2\u02fe\u0300\7\u00b5\2\2\u02ff\u02f7\3\2\2\2\u02ff\u02fa\3\2\2"+
		"\2\u02ff\u02fc\3\2\2\2\u0300O\3\2\2\2\u0301\u0302\5N(\2\u0302\u0303\7"+
		"\2\2\3\u0303Q\3\2\2\2\u0304\u0305\b*\1\2\u0305\u0306\5V,\2\u0306\u0307"+
		"\b*\1\2\u0307\u0312\3\2\2\2\u0308\u0309\b*\1\2\u0309\u030a\5B\"\2\u030a"+
		"\u030b\b*\1\2\u030b\u0312\3\2\2\2\u030c\u030d\b*\1\2\u030d\u0312\7+\2"+
		"\2\u030e\u030f\b*\1\2\u030f\u0310\7,\2\2\u0310\u0312\7\u00b5\2\2\u0311"+
		"\u0304\3\2\2\2\u0311\u0308\3\2\2\2\u0311\u030c\3\2\2\2\u0311\u030e\3\2"+
		"\2\2\u0312S\3\2\2\2\u0313\u0314\5R*\2\u0314\u0315\7\2\2\3\u0315U\3\2\2"+
		"\2\u0316\u0317\b,\1\2\u0317\u0318\5Z.\2\u0318\u0319\b,\1\2\u0319\u031a"+
		"\5^\60\2\u031a\u031b\b,\1\2\u031b\u031c\5b\62\2\u031c\u031d\5f\64\2\u031d"+
		"\u031e\5j\66\2\u031e\u031f\b,\1\2\u031f\u0320\5V,\2\u0320\u0321\b,\1\2"+
		"\u0321\u0322\b,\1\2\u0322\u032f\3\2\2\2\u0323\u0324\b,\1\2\u0324\u0325"+
		"\b,\1\2\u0325\u0326\7\u00a1\2\2\u0326\u0327\5B\"\2\u0327\u0328\b,\1\2"+
		"\u0328\u032f\3\2\2\2\u0329\u032a\b,\1\2\u032a\u032f\7-\2\2\u032b\u032c"+
		"\b,\1\2\u032c\u032d\7.\2\2\u032d\u032f\7\u00b5\2\2\u032e\u0316\3\2\2\2"+
		"\u032e\u0323\3\2\2\2\u032e\u0329\3\2\2\2\u032e\u032b\3\2\2\2\u032fW\3"+
		"\2\2\2\u0330\u0331\5V,\2\u0331\u0332\7\2\2\3\u0332Y\3\2\2\2\u0333\u0334"+
		"\b.\1\2\u0334\u0338\b.\1\2\u0335\u0337\5:\36\2\u0336\u0335\3\2\2\2\u0337"+
		"\u033a\3\2\2\2\u0338\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u0343\3\2"+
		"\2\2\u033a\u0338\3\2\2\2\u033b\u0341\b.\1\2\u033c\u033d\b.\1\2\u033d\u0342"+
		"\7/\2\2\u033e\u033f\b.\1\2\u033f\u0340\7\60\2\2\u0340\u0342\7\u00b5\2"+
		"\2\u0341\u033c\3\2\2\2\u0341\u033e\3\2\2\2\u0342\u0344\3\2\2\2\u0343\u033b"+
		"\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346\b.\1\2\u0346"+
		"\u034d\b.\1\2\u0347\u0348\b.\1\2\u0348\u034d\7/\2\2\u0349\u034a\b.\1\2"+
		"\u034a\u034b\7\60\2\2\u034b\u034d\7\u00b5\2\2\u034c\u0333\3\2\2\2\u034c"+
		"\u0347\3\2\2\2\u034c\u0349\3\2\2\2\u034d[\3\2\2\2\u034e\u0352\5Z.\2\u034f"+
		"\u0350\b/\1\2\u0350\u0352\b/\1\2\u0351\u034e\3\2\2\2\u0351\u034f\3\2\2"+
		"\2\u0352\u0353\3\2\2\2\u0353\u0354\7\2\2\3\u0354]\3\2\2\2\u0355\u0356"+
		"\b\60\1\2\u0356\u0357\b\60\1\2\u0357\u0358\7\u00ad\2\2\u0358\u0359\b\60"+
		"\1\2\u0359\u0360\b\60\1\2\u035a\u035b\b\60\1\2\u035b\u0360\7\61\2\2\u035c"+
		"\u035d\b\60\1\2\u035d\u035e\7\62\2\2\u035e\u0360\7\u00b5\2\2\u035f\u0355"+
		"\3\2\2\2\u035f\u035a\3\2\2\2\u035f\u035c\3\2\2\2\u0360_\3\2\2\2\u0361"+
		"\u0362\5^\60\2\u0362\u0363\7\2\2\3\u0363a\3\2\2\2\u0364\u0365\b\62\1\2"+
		"\u0365\u0367\b\62\1\2\u0366\u0368\7\u00a4\2\2\u0367\u0366\3\2\2\2\u0367"+
		"\u0368\3\2\2\2\u0368\u0371\3\2\2\2\u0369\u036f\b\62\1\2\u036a\u036b\b"+
		"\62\1\2\u036b\u0370\7\63\2\2\u036c\u036d\b\62\1\2\u036d\u036e\7\64\2\2"+
		"\u036e\u0370\7\u00b5\2\2\u036f\u036a\3\2\2\2\u036f\u036c\3\2\2\2\u0370"+
		"\u0372\3\2\2\2\u0371\u0369\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0373\3\2"+
		"\2\2\u0373\u0374\b\62\1\2\u0374\u037b\b\62\1\2\u0375\u0376\b\62\1\2\u0376"+
		"\u037b\7\63\2\2\u0377\u0378\b\62\1\2\u0378\u0379\7\64\2\2\u0379\u037b"+
		"\7\u00b5\2\2\u037a\u0364\3\2\2\2\u037a\u0375\3\2\2\2\u037a\u0377\3\2\2"+
		"\2\u037bc\3\2\2\2\u037c\u037d\5b\62\2\u037d\u037e\7\2\2\3\u037ee\3\2\2"+
		"\2\u037f\u0380\b\64\1\2\u0380\u0382\b\64\1\2\u0381\u0383\7\u00a5\2\2\u0382"+
		"\u0381\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u038c\3\2\2\2\u0384\u038a\b\64"+
		"\1\2\u0385\u0386\b\64\1\2\u0386\u038b\7\65\2\2\u0387\u0388\b\64\1\2\u0388"+
		"\u0389\7\66\2\2\u0389\u038b\7\u00b5\2\2\u038a\u0385\3\2\2\2\u038a\u0387"+
		"\3\2\2\2\u038b\u038d\3\2\2\2\u038c\u0384\3\2\2\2\u038c\u038d\3\2\2\2\u038d"+
		"\u038e\3\2\2\2\u038e\u038f\b\64\1\2\u038f\u0396\b\64\1\2\u0390\u0391\b"+
		"\64\1\2\u0391\u0396\7\65\2\2\u0392\u0393\b\64\1\2\u0393\u0394\7\66\2\2"+
		"\u0394\u0396\7\u00b5\2\2\u0395\u037f\3\2\2\2\u0395\u0390\3\2\2\2\u0395"+
		"\u0392\3\2\2\2\u0396g\3\2\2\2\u0397\u0398\5f\64\2\u0398\u0399\7\2\2\3"+
		"\u0399i\3\2\2\2\u039a\u039b\b\66\1\2\u039b\u039d\b\66\1\2\u039c\u039e"+
		"\5\u00a2R\2\u039d\u039c\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03a7\3\2\2"+
		"\2\u039f\u03a5\b\66\1\2\u03a0\u03a1\b\66\1\2\u03a1\u03a6\7\67\2\2\u03a2"+
		"\u03a3\b\66\1\2\u03a3\u03a4\78\2\2\u03a4\u03a6\7\u00b5\2\2\u03a5\u03a0"+
		"\3\2\2\2\u03a5\u03a2\3\2\2\2\u03a6\u03a8\3\2\2\2\u03a7\u039f\3\2\2\2\u03a7"+
		"\u03a8\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03aa\b\66\1\2\u03aa\u03b1\b"+
		"\66\1\2\u03ab\u03ac\b\66\1\2\u03ac\u03b1\7\67\2\2\u03ad\u03ae\b\66\1\2"+
		"\u03ae\u03af\78\2\2\u03af\u03b1\7\u00b5\2\2\u03b0\u039a\3\2\2\2\u03b0"+
		"\u03ab\3\2\2\2\u03b0\u03ad\3\2\2\2\u03b1k\3\2\2\2\u03b2\u03b3\5j\66\2"+
		"\u03b3\u03b4\7\2\2\3\u03b4m\3\2\2\2\u03b5\u03b6\b8\1\2\u03b6\u03b7\b8"+
		"\1\2\u03b7\u03b8\7\u009b\2\2\u03b8\u03b9\5r:\2\u03b9\u03ba\b8\1\2\u03ba"+
		"\u03bb\7\u009c\2\2\u03bb\u03bc\b8\1\2\u03bc\u03cb\3\2\2\2\u03bd\u03be"+
		"\b8\1\2\u03be\u03bf\b8\1\2\u03bf\u03c0\7\u0097\2\2\u03c0\u03c1\5r:\2\u03c1"+
		"\u03c2\b8\1\2\u03c2\u03c3\7\u0098\2\2\u03c3\u03c4\b8\1\2\u03c4\u03cb\3"+
		"\2\2\2\u03c5\u03c6\b8\1\2\u03c6\u03cb\79\2\2\u03c7\u03c8\b8\1\2\u03c8"+
		"\u03c9\7:\2\2\u03c9\u03cb\7\u00b5\2\2\u03ca\u03b5\3\2\2\2\u03ca\u03bd"+
		"\3\2\2\2\u03ca\u03c5\3\2\2\2\u03ca\u03c7\3\2\2\2\u03cbo\3\2\2\2\u03cc"+
		"\u03cd\5n8\2\u03cd\u03ce\7\2\2\3\u03ceq\3\2\2\2\u03cf\u03d0\b:\1\2\u03d0"+
		"\u03d2\b:\1\2\u03d1\u03d3\5v<\2\u03d2\u03d1\3\2\2\2\u03d2\u03d3\3\2\2"+
		"\2\u03d3\u03dc\3\2\2\2\u03d4\u03da\b:\1\2\u03d5\u03d6\b:\1\2\u03d6\u03db"+
		"\7;\2\2\u03d7\u03d8\b:\1\2\u03d8\u03d9\7<\2\2\u03d9\u03db\7\u00b5\2\2"+
		"\u03da\u03d5\3\2\2\2\u03da\u03d7\3\2\2\2\u03db\u03dd\3\2\2\2\u03dc\u03d4"+
		"\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df\b:\1\2\u03df"+
		"\u03e6\b:\1\2\u03e0\u03e1\b:\1\2\u03e1\u03e6\7;\2\2\u03e2\u03e3\b:\1\2"+
		"\u03e3\u03e4\7<\2\2\u03e4\u03e6\7\u00b5\2\2\u03e5\u03cf\3\2\2\2\u03e5"+
		"\u03e0\3\2\2\2\u03e5\u03e2\3\2\2\2\u03e6s\3\2\2\2\u03e7\u03e8\5r:\2\u03e8"+
		"\u03e9\7\2\2\3\u03e9u\3\2\2\2\u03ea\u03eb\b<\1\2\u03eb\u03ec\5z>\2\u03ec"+
		"\u03ed\b<\1\2\u03ed\u03f4\3\2\2\2\u03ee\u03ef\b<\1\2\u03ef\u03f4\7=\2"+
		"\2\u03f0\u03f1\b<\1\2\u03f1\u03f2\7>\2\2\u03f2\u03f4\7\u00b5\2\2\u03f3"+
		"\u03ea\3\2\2\2\u03f3\u03ee\3\2\2\2\u03f3\u03f0\3\2\2\2\u03f4w\3\2\2\2"+
		"\u03f5\u03f6\5v<\2\u03f6\u03f7\7\2\2\3\u03f7y\3\2\2\2\u03f8\u03f9\b>\1"+
		"\2\u03f9\u03fa\b>\1\2\u03fa\u0400\5B\"\2\u03fb\u03fc\b>\1\2\u03fc\u03fd"+
		"\7\u009e\2\2\u03fd\u03ff\5B\"\2\u03fe\u03fb\3\2\2\2\u03ff\u0402\3\2\2"+
		"\2\u0400\u03fe\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u040b\3\2\2\2\u0402\u0400"+
		"\3\2\2\2\u0403\u0409\b>\1\2\u0404\u0405\b>\1\2\u0405\u040a\7?\2\2\u0406"+
		"\u0407\b>\1\2\u0407\u0408\7@\2\2\u0408\u040a\7\u00b5\2\2\u0409\u0404\3"+
		"\2\2\2\u0409\u0406\3\2\2\2\u040a\u040c\3\2\2\2\u040b\u0403\3\2\2\2\u040b"+
		"\u040c\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040e\b>\1\2\u040e\u040f\b>\1"+
		"\2\u040f\u0416\3\2\2\2\u0410\u0411\b>\1\2\u0411\u0416\7?\2\2\u0412\u0413"+
		"\b>\1\2\u0413\u0414\7@\2\2\u0414\u0416\7\u00b5\2\2\u0415\u03f8\3\2\2\2"+
		"\u0415\u0410\3\2\2\2\u0415\u0412\3\2\2\2\u0416{\3\2\2\2\u0417\u041b\5"+
		"z>\2\u0418\u0419\b?\1\2\u0419\u041b\b?\1\2\u041a\u0417\3\2\2\2\u041a\u0418"+
		"\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u041d\7\2\2\3\u041d}\3\2\2\2\u041e"+
		"\u041f\b@\1\2\u041f\u0420\b@\1\2\u0420\u0421\7\u009b\2\2\u0421\u0422\5"+
		"\u0082B\2\u0422\u0423\b@\1\2\u0423\u0424\7\u009c\2\2\u0424\u0425\b@\1"+
		"\2\u0425\u0434\3\2\2\2\u0426\u0427\b@\1\2\u0427\u0428\b@\1\2\u0428\u0429"+
		"\7\u0097\2\2\u0429\u042a\5\u0082B\2\u042a\u042b\b@\1\2\u042b\u042c\7\u0098"+
		"\2\2\u042c\u042d\b@\1\2\u042d\u0434\3\2\2\2\u042e\u042f\b@\1\2\u042f\u0434"+
		"\7A\2\2\u0430\u0431\b@\1\2\u0431\u0432\7B\2\2\u0432\u0434\7\u00b5\2\2"+
		"\u0433\u041e\3\2\2\2\u0433\u0426\3\2\2\2\u0433\u042e\3\2\2\2\u0433\u0430"+
		"\3\2\2\2\u0434\177\3\2\2\2\u0435\u0436\5~@\2\u0436\u0437\7\2\2\3\u0437"+
		"\u0081\3\2\2\2\u0438\u0439\bB\1\2\u0439\u043b\bB\1\2\u043a\u043c\5\u0086"+
		"D\2\u043b\u043a\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u0445\3\2\2\2\u043d"+
		"\u0443\bB\1\2\u043e\u043f\bB\1\2\u043f\u0444\7C\2\2\u0440\u0441\bB\1\2"+
		"\u0441\u0442\7D\2\2\u0442\u0444\7\u00b5\2\2\u0443\u043e\3\2\2\2\u0443"+
		"\u0440\3\2\2\2\u0444\u0446\3\2\2\2\u0445\u043d\3\2\2\2\u0445\u0446\3\2"+
		"\2\2\u0446\u0447\3\2\2\2\u0447\u0448\bB\1\2\u0448\u044f\bB\1\2\u0449\u044a"+
		"\bB\1\2\u044a\u044f\7C\2\2\u044b\u044c\bB\1\2\u044c\u044d\7D\2\2\u044d"+
		"\u044f\7\u00b5\2\2\u044e\u0438\3\2\2\2\u044e\u0449\3\2\2\2\u044e\u044b"+
		"\3\2\2\2\u044f\u0083\3\2\2\2\u0450\u0451\5\u0082B\2\u0451\u0452\7\2\2"+
		"\3\u0452\u0085\3\2\2\2\u0453\u0454\bD\1\2\u0454\u0455\5\u008aF\2\u0455"+
		"\u0456\bD\1\2\u0456\u045d\3\2\2\2\u0457\u0458\bD\1\2\u0458\u045d\7E\2"+
		"\2\u0459\u045a\bD\1\2\u045a\u045b\7F\2\2\u045b\u045d\7\u00b5\2\2\u045c"+
		"\u0453\3\2\2\2\u045c\u0457\3\2\2\2\u045c\u0459\3\2\2\2\u045d\u0087\3\2"+
		"\2\2\u045e\u045f\5\u0086D\2\u045f\u0460\7\2\2\3\u0460\u0089\3\2\2\2\u0461"+
		"\u0462\bF\1\2\u0462\u0463\bF\1\2\u0463\u0469\5R*\2\u0464\u0465\bF\1\2"+
		"\u0465\u0466\7\u009e\2\2\u0466\u0468\5R*\2\u0467\u0464\3\2\2\2\u0468\u046b"+
		"\3\2\2\2\u0469\u0467\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u0474\3\2\2\2\u046b"+
		"\u0469\3\2\2\2\u046c\u0472\bF\1\2\u046d\u046e\bF\1\2\u046e\u0473\7G\2"+
		"\2\u046f\u0470\bF\1\2\u0470\u0471\7H\2\2\u0471\u0473\7\u00b5\2\2\u0472"+
		"\u046d\3\2\2\2\u0472\u046f\3\2\2\2\u0473\u0475\3\2\2\2\u0474\u046c\3\2"+
		"\2\2\u0474\u0475\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0477\bF\1\2\u0477"+
		"\u0478\bF\1\2\u0478\u047f\3\2\2\2\u0479\u047a\bF\1\2\u047a\u047f\7G\2"+
		"\2\u047b\u047c\bF\1\2\u047c\u047d\7H\2\2\u047d\u047f\7\u00b5\2\2\u047e"+
		"\u0461\3\2\2\2\u047e\u0479\3\2\2\2\u047e\u047b\3\2\2\2\u047f\u008b\3\2"+
		"\2\2\u0480\u0484\5\u008aF\2\u0481\u0482\bG\1\2\u0482\u0484\bG\1\2\u0483"+
		"\u0480\3\2\2\2\u0483\u0481\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0486\7\2"+
		"\2\3\u0486\u008d\3\2\2\2\u0487\u0488\bH\1\2\u0488\u0489\bH\1\2\u0489\u048a"+
		"\7\u0097\2\2\u048a\u048b\5\6\4\2\u048b\u048c\bH\1\2\u048c\u048d\7\u0098"+
		"\2\2\u048d\u048e\bH\1\2\u048e\u0495\3\2\2\2\u048f\u0490\bH\1\2\u0490\u0495"+
		"\7I\2\2\u0491\u0492\bH\1\2\u0492\u0493\7J\2\2\u0493\u0495\7\u00b5\2\2"+
		"\u0494\u0487\3\2\2\2\u0494\u048f\3\2\2\2\u0494\u0491\3\2\2\2\u0495\u008f"+
		"\3\2\2\2\u0496\u0497\5\u008eH\2\u0497\u0498\7\2\2\3\u0498\u0091\3\2\2"+
		"\2\u0499\u049a\bJ\1\2\u049a\u049b\bJ\1\2\u049b\u049c\5^\60\2\u049c\u049d"+
		"\bJ\1\2\u049d\u049e\5b\62\2\u049e\u049f\5f\64\2\u049f\u04a0\5j\66\2\u04a0"+
		"\u04a1\bJ\1\2\u04a1\u04a8\3\2\2\2\u04a2\u04a3\bJ\1\2\u04a3\u04a8\7K\2"+
		"\2\u04a4\u04a5\bJ\1\2\u04a5\u04a6\7L\2\2\u04a6\u04a8\7\u00b5\2\2\u04a7"+
		"\u0499\3\2\2\2\u04a7\u04a2\3\2\2\2\u04a7\u04a4\3\2\2\2\u04a8\u0093\3\2"+
		"\2\2\u04a9\u04aa\5\u0092J\2\u04aa\u04ab\7\2\2\3\u04ab\u0095\3\2\2\2\u04ac"+
		"\u04ad\bL\1\2\u04ad\u04ae\5\u009aN\2\u04ae\u04af\bL\1\2\u04af\u04ba\3"+
		"\2\2\2\u04b0\u04b1\bL\1\2\u04b1\u04b2\5\u009eP\2\u04b2\u04b3\bL\1\2\u04b3"+
		"\u04ba\3\2\2\2\u04b4\u04b5\bL\1\2\u04b5\u04ba\7M\2\2\u04b6\u04b7\bL\1"+
		"\2\u04b7\u04b8\7N\2\2\u04b8\u04ba\7\u00b5\2\2\u04b9\u04ac\3\2\2\2\u04b9"+
		"\u04b0\3\2\2\2\u04b9\u04b4\3\2\2\2\u04b9\u04b6\3\2\2\2\u04ba\u0097\3\2"+
		"\2\2\u04bb\u04bc\5\u0096L\2\u04bc\u04bd\7\2\2\3\u04bd\u0099\3\2\2\2\u04be"+
		"\u04bf\bN\1\2\u04bf\u04c0\7\u00af\2\2\u04c0\u04c7\bN\1\2\u04c1\u04c2\b"+
		"N\1\2\u04c2\u04c7\7O\2\2\u04c3\u04c4\bN\1\2\u04c4\u04c5\7P\2\2\u04c5\u04c7"+
		"\7\u00b5\2\2\u04c6\u04be\3\2\2\2\u04c6\u04c1\3\2\2\2\u04c6\u04c3\3\2\2"+
		"\2\u04c7\u009b\3\2\2\2\u04c8\u04c9\5\u009aN\2\u04c9\u04ca\7\2\2\3\u04ca"+
		"\u009d\3\2\2\2\u04cb\u04cc\bP\1\2\u04cc\u04cd\7\u00b0\2\2\u04cd\u04d4"+
		"\bP\1\2\u04ce\u04cf\bP\1\2\u04cf\u04d4\7Q\2\2\u04d0\u04d1\bP\1\2\u04d1"+
		"\u04d2\7R\2\2\u04d2\u04d4\7\u00b5\2\2\u04d3\u04cb\3\2\2\2\u04d3\u04ce"+
		"\3\2\2\2\u04d3\u04d0\3\2\2\2\u04d4\u009f\3\2\2\2\u04d5\u04d6\5\u009eP"+
		"\2\u04d6\u04d7\7\2\2\3\u04d7\u00a1\3\2\2\2\u04d8\u04d9\bR\1\2\u04d9\u04da"+
		"\bR\1\2\u04da\u04db\7\u00a0\2\2\u04db\u04dc\5\u00f2z\2\u04dc\u04dd\bR"+
		"\1\2\u04dd\u04e4\3\2\2\2\u04de\u04df\bR\1\2\u04df\u04e4\7S\2\2\u04e0\u04e1"+
		"\bR\1\2\u04e1\u04e2\7T\2\2\u04e2\u04e4\7\u00b5\2\2\u04e3\u04d8\3\2\2\2"+
		"\u04e3\u04de\3\2\2\2\u04e3\u04e0\3\2\2\2\u04e4\u00a3\3\2\2\2\u04e5\u04e6"+
		"\5\u00a2R\2\u04e6\u04e7\7\2\2\3\u04e7\u00a5\3\2\2\2\u04e8\u04e9\bT\1\2"+
		"\u04e9\u04ea\5\u00aaV\2\u04ea\u04eb\5\u00aeX\2\u04eb\u04ec\bT\1\2\u04ec"+
		"\u04fd\3\2\2\2\u04ed\u04ee\bT\1\2\u04ee\u04ef\5\u00aaV\2\u04ef\u04f0\5"+
		"\u00b2Z\2\u04f0\u04f1\bT\1\2\u04f1\u04fd\3\2\2\2\u04f2\u04f3\bT\1\2\u04f3"+
		"\u04f4\5\u00aaV\2\u04f4\u04f5\5\u00b6\\\2\u04f5\u04f6\bT\1\2\u04f6\u04fd"+
		"\3\2\2\2\u04f7\u04f8\bT\1\2\u04f8\u04fd\7U\2\2\u04f9\u04fa\bT\1\2\u04fa"+
		"\u04fb\7V\2\2\u04fb\u04fd\7\u00b5\2\2\u04fc\u04e8\3\2\2\2\u04fc\u04ed"+
		"\3\2\2\2\u04fc\u04f2\3\2\2\2\u04fc\u04f7\3\2\2\2\u04fc\u04f9\3\2\2\2\u04fd"+
		"\u00a7\3\2\2\2\u04fe\u04ff\5\u00a6T\2\u04ff\u0500\7\2\2\3\u0500\u00a9"+
		"\3\2\2\2\u0501\u0502\bV\1\2\u0502\u0503\7\u00a8\2\2\u0503\u050a\bV\1\2"+
		"\u0504\u0505\bV\1\2\u0505\u050a\7W\2\2\u0506\u0507\bV\1\2\u0507\u0508"+
		"\7X\2\2\u0508\u050a\7\u00b5\2\2\u0509\u0501\3\2\2\2\u0509\u0504\3\2\2"+
		"\2\u0509\u0506\3\2\2\2\u050a\u00ab\3\2\2\2\u050b\u050c\5\u00aaV\2\u050c"+
		"\u050d\7\2\2\3\u050d\u00ad\3\2\2\2\u050e\u050f\bX\1\2\u050f\u0510\7\u00a9"+
		"\2\2\u0510\u0517\bX\1\2\u0511\u0512\bX\1\2\u0512\u0517\7Y\2\2\u0513\u0514"+
		"\bX\1\2\u0514\u0515\7Z\2\2\u0515\u0517\7\u00b5\2\2\u0516\u050e\3\2\2\2"+
		"\u0516\u0511\3\2\2\2\u0516\u0513\3\2\2\2\u0517\u00af\3\2\2\2\u0518\u0519"+
		"\5\u00aeX\2\u0519\u051a\7\2\2\3\u051a\u00b1\3\2\2\2\u051b\u051c\bZ\1\2"+
		"\u051c\u051d\7\u00aa\2\2\u051d\u0524\bZ\1\2\u051e\u051f\bZ\1\2\u051f\u0524"+
		"\7[\2\2\u0520\u0521\bZ\1\2\u0521\u0522\7\\\2\2\u0522\u0524\7\u00b5\2\2"+
		"\u0523\u051b\3\2\2\2\u0523\u051e\3\2\2\2\u0523\u0520\3\2\2\2\u0524\u00b3"+
		"\3\2\2\2\u0525\u0526\5\u00b2Z\2\u0526\u0527\7\2\2\3\u0527\u00b5\3\2\2"+
		"\2\u0528\u0529\b\\\1\2\u0529\u052a\7\u00ab\2\2\u052a\u0531\b\\\1\2\u052b"+
		"\u052c\b\\\1\2\u052c\u0531\7]\2\2\u052d\u052e\b\\\1\2\u052e\u052f\7^\2"+
		"\2\u052f\u0531\7\u00b5\2\2\u0530\u0528\3\2\2\2\u0530\u052b\3\2\2\2\u0530"+
		"\u052d\3\2\2\2\u0531\u00b7\3\2\2\2\u0532\u0533\5\u00b6\\\2\u0533\u0534"+
		"\7\2\2\3\u0534\u00b9\3\2\2\2\u0535\u0536\b^\1\2\u0536\u0537\b^\1\2\u0537"+
		"\u0538\7\u0091\2\2\u0538\u0539\5B\"\2\u0539\u053a\5\u00c2b\2\u053a\u053b"+
		"\5\u00be`\2\u053b\u053c\b^\1\2\u053c\u0543\3\2\2\2\u053d\u053e\b^\1\2"+
		"\u053e\u0543\7_\2\2\u053f\u0540\b^\1\2\u0540\u0541\7`\2\2\u0541\u0543"+
		"\7\u00b5\2\2\u0542\u0535\3\2\2\2\u0542\u053d\3\2\2\2\u0542\u053f\3\2\2"+
		"\2\u0543\u00bb\3\2\2\2\u0544\u0545\5\u00ba^\2\u0545\u0546\7\2\2\3\u0546"+
		"\u00bd\3\2\2\2\u0547\u0548\b`\1\2\u0548\u054a\b`\1\2\u0549\u054b\7\u0092"+
		"\2\2\u054a\u0549\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u0554\3\2\2\2\u054c"+
		"\u0552\b`\1\2\u054d\u054e\b`\1\2\u054e\u0553\7a\2\2\u054f\u0550\b`\1\2"+
		"\u0550\u0551\7b\2\2\u0551\u0553\7\u00b5\2\2\u0552\u054d\3\2\2\2\u0552"+
		"\u054f\3\2\2\2\u0553\u0555\3\2\2\2\u0554\u054c\3\2\2\2\u0554\u0555\3\2"+
		"\2\2\u0555\u0556\3\2\2\2\u0556\u0557\b`\1\2\u0557\u055e\b`\1\2\u0558\u0559"+
		"\b`\1\2\u0559\u055e\7a\2\2\u055a\u055b\b`\1\2\u055b\u055c\7b\2\2\u055c"+
		"\u055e\7\u00b5\2\2\u055d\u0547\3\2\2\2\u055d\u0558\3\2\2\2\u055d\u055a"+
		"\3\2\2\2\u055e\u00bf\3\2\2\2\u055f\u0560\5\u00be`\2\u0560\u0561\7\2\2"+
		"\3\u0561\u00c1\3\2\2\2\u0562\u0563\bb\1\2\u0563\u0564\5z>\2\u0564\u0565"+
		"\bb\1\2\u0565\u056c\3\2\2\2\u0566\u0567\bb\1\2\u0567\u056c\7c\2\2\u0568"+
		"\u0569\bb\1\2\u0569\u056a\7d\2\2\u056a\u056c\7\u00b5\2\2\u056b\u0562\3"+
		"\2\2\2\u056b\u0566\3\2\2\2\u056b\u0568\3\2\2\2\u056c\u00c3\3\2\2\2\u056d"+
		"\u056e\5\u00c2b\2\u056e\u056f\7\2\2\3\u056f\u00c5\3\2\2\2\u0570\u0571"+
		"\bd\1\2\u0571\u0572\bd\1\2\u0572\u0573\7\u0099\2\2\u0573\u0574\5\u00ca"+
		"f\2\u0574\u0575\bd\1\2\u0575\u0576\7\u009a\2\2\u0576\u0577\bd\1\2\u0577"+
		"\u057e\3\2\2\2\u0578\u0579\bd\1\2\u0579\u057e\7e\2\2\u057a\u057b\bd\1"+
		"\2\u057b\u057c\7f\2\2\u057c\u057e\7\u00b5\2\2\u057d\u0570\3\2\2\2\u057d"+
		"\u0578\3\2\2\2\u057d\u057a\3\2\2\2\u057e\u00c7\3\2\2\2\u057f\u0580\5\u00c6"+
		"d\2\u0580\u0581\7\2\2\3\u0581\u00c9\3\2\2\2\u0582\u0583\bf\1\2\u0583\u0585"+
		"\bf\1\2\u0584\u0586\5\u00ceh\2\u0585\u0584\3\2\2\2\u0585\u0586\3\2\2\2"+
		"\u0586\u058f\3\2\2\2\u0587\u058d\bf\1\2\u0588\u0589\bf\1\2\u0589\u058e"+
		"\7g\2\2\u058a\u058b\bf\1\2\u058b\u058c\7h\2\2\u058c\u058e\7\u00b5\2\2"+
		"\u058d\u0588\3\2\2\2\u058d\u058a\3\2\2\2\u058e\u0590\3\2\2\2\u058f\u0587"+
		"\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u0591\3\2\2\2\u0591\u0592\bf\1\2\u0592"+
		"\u0599\bf\1\2\u0593\u0594\bf\1\2\u0594\u0599\7g\2\2\u0595\u0596\bf\1\2"+
		"\u0596\u0597\7h\2\2\u0597\u0599\7\u00b5\2\2\u0598\u0582\3\2\2\2\u0598"+
		"\u0593\3\2\2\2\u0598\u0595\3\2\2\2\u0599\u00cb\3\2\2\2\u059a\u059b\5\u00ca"+
		"f\2\u059b\u059c\7\2\2\3\u059c\u00cd\3\2\2\2\u059d\u059e\bh\1\2\u059e\u059f"+
		"\5\u00d2j\2\u059f\u05a0\bh\1\2\u05a0\u05a7\3\2\2\2\u05a1\u05a2\bh\1\2"+
		"\u05a2\u05a7\7i\2\2\u05a3\u05a4\bh\1\2\u05a4\u05a5\7j\2\2\u05a5\u05a7"+
		"\7\u00b5\2\2\u05a6\u059d\3\2\2\2\u05a6\u05a1\3\2\2\2\u05a6\u05a3\3\2\2"+
		"\2\u05a7\u00cf\3\2\2\2\u05a8\u05a9\5\u00ceh\2\u05a9\u05aa\7\2\2\3\u05aa"+
		"\u00d1\3\2\2\2\u05ab\u05ac\bj\1\2\u05ac\u05ad\bj\1\2\u05ad\u05b5\5\u00d6"+
		"l\2\u05ae\u05af\bj\1\2\u05af\u05b1\7\u009d\2\2\u05b0\u05b2\5\u00d6l\2"+
		"\u05b1\u05b0\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b4\3\2\2\2\u05b3\u05ae"+
		"\3\2\2\2\u05b4\u05b7\3\2\2\2\u05b5\u05b3\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6"+
		"\u05c0\3\2\2\2\u05b7\u05b5\3\2\2\2\u05b8\u05be\bj\1\2\u05b9\u05ba\bj\1"+
		"\2\u05ba\u05bf\7k\2\2\u05bb\u05bc\bj\1\2\u05bc\u05bd\7l\2\2\u05bd\u05bf"+
		"\7\u00b5\2\2\u05be\u05b9\3\2\2\2\u05be\u05bb\3\2\2\2\u05bf\u05c1\3\2\2"+
		"\2\u05c0\u05b8\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c3"+
		"\bj\1\2\u05c3\u05c4\bj\1\2\u05c4\u05cb\3\2\2\2\u05c5\u05c6\bj\1\2\u05c6"+
		"\u05cb\7k\2\2\u05c7\u05c8\bj\1\2\u05c8\u05c9\7l\2\2\u05c9\u05cb\7\u00b5"+
		"\2\2\u05ca\u05ab\3\2\2\2\u05ca\u05c5\3\2\2\2\u05ca\u05c7\3\2\2\2\u05cb"+
		"\u00d3\3\2\2\2\u05cc\u05d0\5\u00d2j\2\u05cd\u05ce\bk\1\2\u05ce\u05d0\b"+
		"k\1\2\u05cf\u05cc\3\2\2\2\u05cf\u05cd\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1"+
		"\u05d2\7\2\2\3\u05d2\u00d5\3\2\2\2\u05d3\u05d4\bl\1\2\u05d4\u05d5\5N("+
		"\2\u05d5\u05d6\bl\1\2\u05d6\u0613\3\2\2\2\u05d7\u05d8\bl\1\2\u05d8\u05d9"+
		"\bl\1\2\u05d9\u05da\7\u00a3\2\2\u05da\u05db\5N(\2\u05db\u05dc\bl\1\2\u05dc"+
		"\u0613\3\2\2\2\u05dd\u05de\bl\1\2\u05de\u05df\5N(\2\u05df\u05e0\bl\1\2"+
		"\u05e0\u05e1\7\u0094\2\2\u05e1\u05e2\5B\"\2\u05e2\u05e3\bl\1\2\u05e3\u0613"+
		"\3\2\2\2\u05e4\u05e5\bl\1\2\u05e5\u05e6\5^\60\2\u05e6\u05e7\bl\1\2\u05e7"+
		"\u0613\3\2\2\2\u05e8\u05e9\bl\1\2\u05e9\u05ea\bl\1\2\u05ea\u05eb\7\u00a3"+
		"\2\2\u05eb\u05ec\5^\60\2\u05ec\u05ed\bl\1\2\u05ed\u0613\3\2\2\2\u05ee"+
		"\u05ef\bl\1\2\u05ef\u05f0\5^\60\2\u05f0\u05f1\bl\1\2\u05f1\u05f2\7\u0094"+
		"\2\2\u05f2\u05f3\5B\"\2\u05f3\u05f4\bl\1\2\u05f4\u0613\3\2\2\2\u05f5\u05f6"+
		"\bl\1\2\u05f6\u05f7\5\u009aN\2\u05f7\u05f8\bl\1\2\u05f8\u0613\3\2\2\2"+
		"\u05f9\u05fa\bl\1\2\u05fa\u05fb\bl\1\2\u05fb\u05fc\7\u00a3\2\2\u05fc\u05fd"+
		"\5\u009aN\2\u05fd\u05fe\bl\1\2\u05fe\u0613\3\2\2\2\u05ff\u0600\bl\1\2"+
		"\u0600\u0601\5\u009aN\2\u0601\u0602\bl\1\2\u0602\u0603\7\u0094\2\2\u0603"+
		"\u0604\5B\"\2\u0604\u0605\bl\1\2\u0605\u0613\3\2\2\2\u0606\u0607\bl\1"+
		"\2\u0607\u0608\5\u010e\u0088\2\u0608\u0609\bl\1\2\u0609\u060a\7\u0094"+
		"\2\2\u060a\u060b\5B\"\2\u060b\u060c\bl\1\2\u060c\u0613\3\2\2\2\u060d\u060e"+
		"\bl\1\2\u060e\u0613\7m\2\2\u060f\u0610\bl\1\2\u0610\u0611\7n\2\2\u0611"+
		"\u0613\7\u00b5\2\2\u0612\u05d3\3\2\2\2\u0612\u05d7\3\2\2\2\u0612\u05dd"+
		"\3\2\2\2\u0612\u05e4\3\2\2\2\u0612\u05e8\3\2\2\2\u0612\u05ee\3\2\2\2\u0612"+
		"\u05f5\3\2\2\2\u0612\u05f9\3\2\2\2\u0612\u05ff\3\2\2\2\u0612\u0606\3\2"+
		"\2\2\u0612\u060d\3\2\2\2\u0612\u060f\3\2\2\2\u0613\u00d7\3\2\2\2\u0614"+
		"\u0615\5\u00d6l\2\u0615\u0616\7\2\2\3\u0616\u00d9\3\2\2\2\u0617\u0618"+
		"\bn\1\2\u0618\u0619\bn\1\2\u0619\u061a\7\u0096\2\2\u061a\u061b\5\u00de"+
		"p\2\u061b\u061c\bn\1\2\u061c\u061d\7\u00a1\2\2\u061d\u061e\bn\1\2\u061e"+
		"\u0625\3\2\2\2\u061f\u0620\bn\1\2\u0620\u0625\7o\2\2\u0621\u0622\bn\1"+
		"\2\u0622\u0623\7p\2\2\u0623\u0625\7\u00b5\2\2\u0624\u0617\3\2\2\2\u0624"+
		"\u061f\3\2\2\2\u0624\u0621\3\2\2\2\u0625\u00db\3\2\2\2\u0626\u0627\5\u00da"+
		"n\2\u0627\u0628\7\2\2\3\u0628\u00dd\3\2\2\2\u0629\u062a\bp\1\2\u062a\u062c"+
		"\bp\1\2\u062b\u062d\5\u0092J\2\u062c\u062b\3\2\2\2\u062d\u062e\3\2\2\2"+
		"\u062e\u062c\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u0638\3\2\2\2\u0630\u0636"+
		"\bp\1\2\u0631\u0632\bp\1\2\u0632\u0637\7q\2\2\u0633\u0634\bp\1\2\u0634"+
		"\u0635\7r\2\2\u0635\u0637\7\u00b5\2\2\u0636\u0631\3\2\2\2\u0636\u0633"+
		"\3\2\2\2\u0637\u0639\3\2\2\2\u0638\u0630\3\2\2\2\u0638\u0639\3\2\2\2\u0639"+
		"\u063a\3\2\2\2\u063a\u063b\bp\1\2\u063b\u063c\bp\1\2\u063c\u0643\3\2\2"+
		"\2\u063d\u063e\bp\1\2\u063e\u0643\7q\2\2\u063f\u0640\bp\1\2\u0640\u0641"+
		"\7r\2\2\u0641\u0643\7\u00b5\2\2\u0642\u0629\3\2\2\2\u0642\u063d\3\2\2"+
		"\2\u0642\u063f\3\2\2\2\u0643\u00df\3\2\2\2\u0644\u0648\5\u00dep\2\u0645"+
		"\u0646\bq\1\2\u0646\u0648\bq\1\2\u0647\u0644\3\2\2\2\u0647\u0645\3\2\2"+
		"\2\u0648\u0649\3\2\2\2\u0649\u064a\7\2\2\3\u064a\u00e1\3\2\2\2\u064b\u064c"+
		"\br\1\2\u064c\u064d\5\u00e6t\2\u064d\u064e\br\1\2\u064e\u0655\3\2\2\2"+
		"\u064f\u0650\br\1\2\u0650\u0655\7s\2\2\u0651\u0652\br\1\2\u0652\u0653"+
		"\7t\2\2\u0653\u0655\7\u00b5\2\2\u0654\u064b\3\2\2\2\u0654\u064f\3\2\2"+
		"\2\u0654\u0651\3\2\2\2\u0655\u00e3\3\2\2\2\u0656\u0657\5\u00e2r\2\u0657"+
		"\u0658\7\2\2\3\u0658\u00e5\3\2\2\2\u0659\u065a\bt\1\2\u065a\u065c\bt\1"+
		"\2\u065b\u065d\5\u00c6d\2\u065c\u065b\3\2\2\2\u065c\u065d\3\2\2\2\u065d"+
		"\u0666\3\2\2\2\u065e\u0664\bt\1\2\u065f\u0660\bt\1\2\u0660\u0665\7u\2"+
		"\2\u0661\u0662\bt\1\2\u0662\u0663\7v\2\2\u0663\u0665\7\u00b5\2\2\u0664"+
		"\u065f\3\2\2\2\u0664\u0661\3\2\2\2\u0665\u0667\3\2\2\2\u0666\u065e\3\2"+
		"\2\2\u0666\u0667\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u0669\bt\1\2\u0669"+
		"\u0670\bt\1\2\u066a\u066b\bt\1\2\u066b\u0670\7u\2\2\u066c\u066d\bt\1\2"+
		"\u066d\u066e\7v\2\2\u066e\u0670\7\u00b5\2\2\u066f\u0659\3\2\2\2\u066f"+
		"\u066a\3\2\2\2\u066f\u066c\3\2\2\2\u0670\u00e7\3\2\2\2\u0671\u0672\5\u00e6"+
		"t\2\u0672\u0673\7\2\2\3\u0673\u00e9\3\2\2\2\u0674\u0675\bv\1\2\u0675\u0676"+
		"\5\u00eex\2\u0676\u0677\bv\1\2\u0677\u067e\3\2\2\2\u0678\u0679\bv\1\2"+
		"\u0679\u067e\7w\2\2\u067a\u067b\bv\1\2\u067b\u067c\7x\2\2\u067c\u067e"+
		"\7\u00b5\2\2\u067d\u0674\3\2\2\2\u067d\u0678\3\2\2\2\u067d\u067a\3\2\2"+
		"\2\u067e\u00eb\3\2\2\2\u067f\u0680\5\u00eav\2\u0680\u0681\7\2\2\3\u0681"+
		"\u00ed\3\2\2\2\u0682\u0683\bx\1\2\u0683\u0684\bx\1\2\u0684\u068a\5\u00f2"+
		"z\2\u0685\u0686\bx\1\2\u0686\u0687\7\u009e\2\2\u0687\u0689\5\u00f2z\2"+
		"\u0688\u0685\3\2\2\2\u0689\u068c\3\2\2\2\u068a\u0688\3\2\2\2\u068a\u068b"+
		"\3\2\2\2\u068b\u0695\3\2\2\2\u068c\u068a\3\2\2\2\u068d\u0693\bx\1\2\u068e"+
		"\u068f\bx\1\2\u068f\u0694\7y\2\2\u0690\u0691\bx\1\2\u0691\u0692\7z\2\2"+
		"\u0692\u0694\7\u00b5\2\2\u0693\u068e\3\2\2\2\u0693\u0690\3\2\2\2\u0694"+
		"\u0696\3\2\2\2\u0695\u068d\3\2\2\2\u0695\u0696\3\2\2\2\u0696\u0697\3\2"+
		"\2\2\u0697\u0698\bx\1\2\u0698\u0699\bx\1\2\u0699\u06a0\3\2\2\2\u069a\u069b"+
		"\bx\1\2\u069b\u06a0\7y\2\2\u069c\u069d\bx\1\2\u069d\u069e\7z\2\2\u069e"+
		"\u06a0\7\u00b5\2\2\u069f\u0682\3\2\2\2\u069f\u069a\3\2\2\2\u069f\u069c"+
		"\3\2\2\2\u06a0\u00ef\3\2\2\2\u06a1\u06a5\5\u00eex\2\u06a2\u06a3\by\1\2"+
		"\u06a3\u06a5\by\1\2\u06a4\u06a1\3\2\2\2\u06a4\u06a2\3\2\2\2\u06a5\u06a6"+
		"\3\2\2\2\u06a6\u06a7\7\2\2\3\u06a7\u00f1\3\2\2\2\u06a8\u06a9\bz\1\2\u06a9"+
		"\u06aa\5\u010e\u0088\2\u06aa\u06ab\5\u00f6|\2\u06ab\u06ac\bz\1\2\u06ac"+
		"\u06b7\3\2\2\2\u06ad\u06ae\bz\1\2\u06ae\u06af\5\u0092J\2\u06af\u06b0\b"+
		"z\1\2\u06b0\u06b7\3\2\2\2\u06b1\u06b2\bz\1\2\u06b2\u06b7\7{\2\2\u06b3"+
		"\u06b4\bz\1\2\u06b4\u06b5\7|\2\2\u06b5\u06b7\7\u00b5\2\2\u06b6\u06a8\3"+
		"\2\2\2\u06b6\u06ad\3\2\2\2\u06b6\u06b1\3\2\2\2\u06b6\u06b3\3\2\2\2\u06b7"+
		"\u00f3\3\2\2\2\u06b8\u06b9\5\u00f2z\2\u06b9\u06ba\7\2\2\3\u06ba\u00f5"+
		"\3\2\2\2\u06bb\u06bc\b|\1\2\u06bc\u06be\b|\1\2\u06bd\u06bf\5\u00fa~\2"+
		"\u06be\u06bd\3\2\2\2\u06be\u06bf\3\2\2\2\u06bf\u06c8\3\2\2\2\u06c0\u06c6"+
		"\b|\1\2\u06c1\u06c2\b|\1\2\u06c2\u06c7\7}\2\2\u06c3\u06c4\b|\1\2\u06c4"+
		"\u06c5\7~\2\2\u06c5\u06c7\7\u00b5\2\2\u06c6\u06c1\3\2\2\2\u06c6\u06c3"+
		"\3\2\2\2\u06c7\u06c9\3\2\2\2\u06c8\u06c0\3\2\2\2\u06c8\u06c9\3\2\2\2\u06c9"+
		"\u06ca\3\2\2\2\u06ca\u06cb\b|\1\2\u06cb\u06d2\b|\1\2\u06cc\u06cd\b|\1"+
		"\2\u06cd\u06d2\7}\2\2\u06ce\u06cf\b|\1\2\u06cf\u06d0\7~\2\2\u06d0\u06d2"+
		"\7\u00b5\2\2\u06d1\u06bb\3\2\2\2\u06d1\u06cc\3\2\2\2\u06d1\u06ce\3\2\2"+
		"\2\u06d2\u00f7\3\2\2\2\u06d3\u06d4\5\u00f6|\2\u06d4\u06d5\7\2\2\3\u06d5"+
		"\u00f9\3\2\2\2\u06d6\u06d7\b~\1\2\u06d7\u06d8\b~\1\2\u06d8\u06d9\7\u009b"+
		"\2\2\u06d9\u06da\5\u00fe\u0080\2\u06da\u06db\b~\1\2\u06db\u06dc\7\u009c"+
		"\2\2\u06dc\u06dd\b~\1\2\u06dd\u06e4\3\2\2\2\u06de\u06df\b~\1\2\u06df\u06e4"+
		"\7\177\2\2\u06e0\u06e1\b~\1\2\u06e1\u06e2\7\u0080\2\2\u06e2\u06e4\7\u00b5"+
		"\2\2\u06e3\u06d6\3\2\2\2\u06e3\u06de\3\2\2\2\u06e3\u06e0\3\2\2\2\u06e4"+
		"\u00fb\3\2\2\2\u06e5\u06e6\5\u00fa~\2\u06e6\u06e7\7\2\2\3\u06e7\u00fd"+
		"\3\2\2\2\u06e8\u06e9\b\u0080\1\2\u06e9\u06eb\b\u0080\1\2\u06ea\u06ec\5"+
		"\u00eav\2\u06eb\u06ea\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec\u06f5\3\2\2\2"+
		"\u06ed\u06f3\b\u0080\1\2\u06ee\u06ef\b\u0080\1\2\u06ef\u06f4\7\u0081\2"+
		"\2\u06f0\u06f1\b\u0080\1\2\u06f1\u06f2\7\u0082\2\2\u06f2\u06f4\7\u00b5"+
		"\2\2\u06f3\u06ee\3\2\2\2\u06f3\u06f0\3\2\2\2\u06f4\u06f6\3\2\2\2\u06f5"+
		"\u06ed\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7\u06f8\b\u0080"+
		"\1\2\u06f8\u06ff\b\u0080\1\2\u06f9\u06fa\b\u0080\1\2\u06fa\u06ff\7\u0081"+
		"\2\2\u06fb\u06fc\b\u0080\1\2\u06fc\u06fd\7\u0082\2\2\u06fd\u06ff\7\u00b5"+
		"\2\2\u06fe\u06e8\3\2\2\2\u06fe\u06f9\3\2\2\2\u06fe\u06fb\3\2\2\2\u06ff"+
		"\u00ff\3\2\2\2\u0700\u0701\5\u00fe\u0080\2\u0701\u0702\7\2\2\3\u0702\u0101"+
		"\3\2\2\2\u0703\u0704\b\u0082\1\2\u0704\u0705\5\u0106\u0084\2\u0705\u0706"+
		"\b\u0082\1\2\u0706\u070d\3\2\2\2\u0707\u0708\b\u0082\1\2\u0708\u070d\7"+
		"\u0083\2\2\u0709\u070a\b\u0082\1\2\u070a\u070b\7\u0084\2\2\u070b\u070d"+
		"\7\u00b5\2\2\u070c\u0703\3\2\2\2\u070c\u0707\3\2\2\2\u070c\u0709\3\2\2"+
		"\2\u070d\u0103\3\2\2\2\u070e\u070f\5\u0102\u0082\2\u070f\u0710\7\2\2\3"+
		"\u0710\u0105\3\2\2\2\u0711\u0712\b\u0084\1\2\u0712\u0719\b\u0084\1\2\u0713"+
		"\u0714\5\u010a\u0086\2\u0714\u0715\b\u0084\1\2\u0715\u0716\7\u009d\2\2"+
		"\u0716\u0718\3\2\2\2\u0717\u0713\3\2\2\2\u0718\u071b\3\2\2\2\u0719\u0717"+
		"\3\2\2\2\u0719\u071a\3\2\2\2\u071a\u0724\3\2\2\2\u071b\u0719\3\2\2\2\u071c"+
		"\u0722\b\u0084\1\2\u071d\u071e\b\u0084\1\2\u071e\u0723\7\u0085\2\2\u071f"+
		"\u0720\b\u0084\1\2\u0720\u0721\7\u0086\2\2\u0721\u0723\7\u00b5\2\2\u0722"+
		"\u071d\3\2\2\2\u0722\u071f\3\2\2\2\u0723\u0725\3\2\2\2\u0724\u071c\3\2"+
		"\2\2\u0724\u0725\3\2\2\2\u0725\u0726\3\2\2\2\u0726\u0727\b\u0084\1\2\u0727"+
		"\u072e\b\u0084\1\2\u0728\u0729\b\u0084\1\2\u0729\u072e\7\u0085\2\2\u072a"+
		"\u072b\b\u0084\1\2\u072b\u072c\7\u0086\2\2\u072c\u072e\7\u00b5\2\2\u072d"+
		"\u0711\3\2\2\2\u072d\u0728\3\2\2\2\u072d\u072a\3\2\2\2\u072e\u0107\3\2"+
		"\2\2\u072f\u0733\5\u0106\u0084\2\u0730\u0731\b\u0085\1\2\u0731\u0733\b"+
		"\u0085\1\2\u0732\u072f\3\2\2\2\u0732\u0730\3\2\2\2\u0733\u0734\3\2\2\2"+
		"\u0734\u0735\7\2\2\3\u0735\u0109\3\2\2\2\u0736\u0737\b\u0086\1\2\u0737"+
		"\u0738\5\u010e\u0088\2\u0738\u0739\5F$\2\u0739\u073a\b\u0086\1\2\u073a"+
		"\u0745\3\2\2\2\u073b\u073c\b\u0086\1\2\u073c\u073d\5\u0092J\2\u073d\u073e"+
		"\b\u0086\1\2\u073e\u0745\3\2\2\2\u073f\u0740\b\u0086\1\2\u0740\u0745\7"+
		"\u0087\2\2\u0741\u0742\b\u0086\1\2\u0742\u0743\7\u0088\2\2\u0743\u0745"+
		"\7\u00b5\2\2\u0744\u0736\3\2\2\2\u0744\u073b\3\2\2\2\u0744\u073f\3\2\2"+
		"\2\u0744\u0741\3\2\2\2\u0745\u010b\3\2\2\2\u0746\u0747\5\u010a\u0086\2"+
		"\u0747\u0748\7\2\2\3\u0748\u010d\3\2\2\2\u0749\u074a\b\u0088\1\2\u074a"+
		"\u074b\5\u0112\u008a\2\u074b\u074c\5\26\f\2\u074c\u074d\b\u0088\1\2\u074d"+
		"\u0758\3\2\2\2\u074e\u074f\b\u0088\1\2\u074f\u0750\5\u0116\u008c\2\u0750"+
		"\u0751\b\u0088\1\2\u0751\u0758\3\2\2\2\u0752\u0753\b\u0088\1\2\u0753\u0758"+
		"\7\u0089\2\2\u0754\u0755\b\u0088\1\2\u0755\u0756\7\u008a\2\2\u0756\u0758"+
		"\7\u00b5\2\2\u0757\u0749\3\2\2\2\u0757\u074e\3\2\2\2\u0757\u0752\3\2\2"+
		"\2\u0757\u0754\3\2\2\2\u0758\u010f\3\2\2\2\u0759\u075a\5\u010e\u0088\2"+
		"\u075a\u075b\7\2\2\3\u075b\u0111\3\2\2\2\u075c\u075d\b\u008a\1\2\u075d"+
		"\u075e\5\26\f\2\u075e\u075f\b\u008a\1\2\u075f\u0760\7\u00a2\2\2\u0760"+
		"\u0761\5\u0112\u008a\2\u0761\u0762\b\u008a\1\2\u0762\u076b\3\2\2\2\u0763"+
		"\u0764\b\u008a\1\2\u0764\u076b\b\u008a\1\2\u0765\u0766\b\u008a\1\2\u0766"+
		"\u076b\7\u008b\2\2\u0767\u0768\b\u008a\1\2\u0768\u0769\7\u008c\2\2\u0769"+
		"\u076b\7\u00b5\2\2\u076a\u075c\3\2\2\2\u076a\u0763\3\2\2\2\u076a\u0765"+
		"\3\2\2\2\u076a\u0767\3\2\2\2\u076b\u0113\3\2\2\2\u076c\u076d\5\u0112\u008a"+
		"\2\u076d\u076e\7\2\2\3\u076e\u0115\3\2\2\2\u076f\u0770\b\u008c\1\2\u0770"+
		"\u0771\b\u008c\1\2\u0771\u0772\7\u0094\2\2\u0772\u077d\b\u008c\1\2\u0773"+
		"\u0774\b\u008c\1\2\u0774\u0775\b\u008c\1\2\u0775\u0776\7\u00a7\2\2\u0776"+
		"\u077d\b\u008c\1\2\u0777\u0778\b\u008c\1\2\u0778\u077d\7\u008d\2\2\u0779"+
		"\u077a\b\u008c\1\2\u077a\u077b\7\u008e\2\2\u077b\u077d\7\u00b5\2\2\u077c"+
		"\u076f\3\2\2\2\u077c\u0773\3\2\2\2\u077c\u0777\3\2\2\2\u077c\u0779\3\2"+
		"\2\2\u077d\u0117\3\2\2\2\u077e\u077f\5\u0116\u008c\2\u077f\u0780\7\2\2"+
		"\3\u0780\u0119\3\2\2\2\u009a\u0123\u0131\u013e\u0147\u0149\u0153\u0158"+
		"\u0173\u0188\u0195\u01b5\u01d5\u01dd\u01e5\u01e7\u01f0\u0200\u0208\u0210"+
		"\u0212\u021b\u0223\u022b\u022d\u0236\u0247\u024f\u0257\u0259\u0262\u0273"+
		"\u0283\u02b5\u02bd\u02c5\u02c7\u02d0\u02da\u02e2\u02e4\u02ee\u02f3\u02ff"+
		"\u0311\u032e\u0338\u0341\u0343\u034c\u0351\u035f\u0367\u036f\u0371\u037a"+
		"\u0382\u038a\u038c\u0395\u039d\u03a5\u03a7\u03b0\u03ca\u03d2\u03da\u03dc"+
		"\u03e5\u03f3\u0400\u0409\u040b\u0415\u041a\u0433\u043b\u0443\u0445\u044e"+
		"\u045c\u0469\u0472\u0474\u047e\u0483\u0494\u04a7\u04b9\u04c6\u04d3\u04e3"+
		"\u04fc\u0509\u0516\u0523\u0530\u0542\u054a\u0552\u0554\u055d\u056b\u057d"+
		"\u0585\u058d\u058f\u0598\u05a6\u05b1\u05b5\u05be\u05c0\u05ca\u05cf\u0612"+
		"\u0624\u062e\u0636\u0638\u0642\u0647\u0654\u065c\u0664\u0666\u066f\u067d"+
		"\u068a\u0693\u0695\u069f\u06a4\u06b6\u06be\u06c6\u06c8\u06d1\u06e3\u06eb"+
		"\u06f3\u06f5\u06fe\u070c\u0719\u0722\u0724\u072d\u0732\u0744\u0757\u076a"+
		"\u077c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}