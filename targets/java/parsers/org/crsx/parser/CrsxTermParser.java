// Generated from /Users/villardl/Projects/crsx/crsx4/src/parser/CrsxTerm.g4 by ANTLR 4.5
package org.crsx.parser;

import org.crsx.pg.SinkAntlrListener;
import static org.crsx.pg.SinkAntlrListener.fireEnterZOM;
import static org.crsx.pg.SinkAntlrListener.fireExitZOM;
import static org.crsx.pg.SinkAntlrListener.fireEnterOPT;
import static org.crsx.pg.SinkAntlrListener.fireExitOPT;
import static org.crsx.pg.SinkAntlrListener.fireEnterAlt;
import static org.crsx.pg.SinkAntlrListener.fireExitAlt;
import static org.crsx.pg.SinkAntlrListener.fireHide;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CrsxTermParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MODULE=1, IMPORT=2, DISPATCH=3, DELAY=4, GRAMMAR=5, COLON=6, ARROW=7, 
		FORALL=8, LPAR=9, RPAR=10, LBRACE=11, RBRACE=12, LSQUARE=13, RSQUARE=14, 
		SEMI=15, COMMA=16, DATASORT=17, COLONCOLON=18, DOT=19, NOT=20, LINEAR=21, 
		FUNCTIONAL=22, AND=23, AT=24, CATEGORY=25, CONCRETE=26, CONCRETE2=27, 
		CONCRETE3=28, CONCRETE4=29, CONSTRUCTOR=30, VARIABLE=31, METAVAR=32, STRING=33, 
		NUMBER=34, WS=35, BLOCK_COMMENT=36, LINE_COMMENT=37, XML_COMMENT=38;
	public static final int
		RULE_crsx = 0, RULE_declarations = 1, RULE_declarations_S1 = 2, RULE_declaration = 3, 
		RULE_moduleDeclaration = 4, RULE_importDeclaration = 5, RULE_ruleDeclaration = 6, 
		RULE_option = 7, RULE_pattern = 8, RULE_contractum = 9, RULE_annotations = 10, 
		RULE_annotation = 11, RULE_term = 12, RULE_freeTerm = 13, RULE_boundTerm = 14, 
		RULE_nextBinder = 15, RULE_arguments = 16, RULE_terms = 17, RULE_terms_S1 = 18, 
		RULE_freeArguments = 19, RULE_freeTerms = 20, RULE_freeTerms_S1 = 21, 
		RULE_list = 22, RULE_termList = 23, RULE_termList_S1 = 24, RULE_variable = 25, 
		RULE_linear = 26, RULE_functional = 27, RULE_literal = 28, RULE_binder = 29, 
		RULE_varsort = 30, RULE_concrete = 31, RULE_dispatch = 32, RULE_dispatchTerm = 33, 
		RULE_dispatchCases = 34, RULE_dispatchCases_S1 = 35, RULE_dispatchCase = 36, 
		RULE_delayCase = 37, RULE_properties = 38, RULE_propertyList = 39, RULE_propertyList_S1 = 40, 
		RULE_property = 41, RULE_expression = 42, RULE_sortDeclaration = 43, RULE_sortparams = 44, 
		RULE_sortset = 45, RULE_sortnames = 46, RULE_sortnames_S1 = 47, RULE_sortname = 48, 
		RULE_sortarguments = 49, RULE_forms = 50, RULE_forms_S1 = 51, RULE_form = 52, 
		RULE_constructor = 53, RULE_qualifier = 54, RULE_reserved = 55, RULE_directive = 56, 
		RULE_directiveArguments = 57, RULE_directives = 58, RULE_directives_S1 = 59, 
		RULE_directiveList = 60;
	public static final String[] ruleNames = {
		"crsx", "declarations", "declarations_S1", "declaration", "moduleDeclaration", 
		"importDeclaration", "ruleDeclaration", "option", "pattern", "contractum", 
		"annotations", "annotation", "term", "freeTerm", "boundTerm", "nextBinder", 
		"arguments", "terms", "terms_S1", "freeArguments", "freeTerms", "freeTerms_S1", 
		"list", "termList", "termList_S1", "variable", "linear", "functional", 
		"literal", "binder", "varsort", "concrete", "dispatch", "dispatchTerm", 
		"dispatchCases", "dispatchCases_S1", "dispatchCase", "delayCase", "properties", 
		"propertyList", "propertyList_S1", "property", "expression", "sortDeclaration", 
		"sortparams", "sortset", "sortnames", "sortnames_S1", "sortname", "sortarguments", 
		"forms", "forms_S1", "form", "constructor", "qualifier", "reserved", "directive", 
		"directiveArguments", "directives", "directives_S1", "directiveList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'module'", "'import'", "'dispatch'", "'delay'", "'grammar'", "':'", 
		"'→'", "'∀'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", 
		"'::='", "'::'", "'.'", "'¬'", "'¹'", "'ᵇ'", "'&'", "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MODULE", "IMPORT", "DISPATCH", "DELAY", "GRAMMAR", "COLON", "ARROW", 
		"FORALL", "LPAR", "RPAR", "LBRACE", "RBRACE", "LSQUARE", "RSQUARE", "SEMI", 
		"COMMA", "DATASORT", "COLONCOLON", "DOT", "NOT", "LINEAR", "FUNCTIONAL", 
		"AND", "AT", "CATEGORY", "CONCRETE", "CONCRETE2", "CONCRETE3", "CONCRETE4", 
		"CONSTRUCTOR", "VARIABLE", "METAVAR", "STRING", "NUMBER", "WS", "BLOCK_COMMENT", 
		"LINE_COMMENT", "XML_COMMENT"
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
	public String getGrammarFileName() { return "CrsxTerm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	protected String _prefix() { return "Crsx_"; }
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

	public CrsxTermParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CrsxContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public CrsxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crsx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterCrsx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitCrsx(this);
		}
	}

	public final CrsxContext crsx() throws RecognitionException {
		CrsxContext _localctx = new CrsxContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_crsx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(123);
			declarations();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public List<Declarations_S1Context> declarations_S1() {
			return getRuleContexts(Declarations_S1Context.class);
		}
		public Declarations_S1Context declarations_S1(int i) {
			return getRuleContext(Declarations_S1Context.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(127);
			declaration();
			_enterZOM();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(129);
				declarations_S1();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			_exitZOM();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode SEMI() { return getToken(CrsxTermParser.SEMI, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Declarations_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterDeclarations_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitDeclarations_S1(this);
		}
	}

	public final Declarations_S1Context declarations_S1() throws RecognitionException {
		Declarations_S1Context _localctx = new Declarations_S1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarations_S1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(139);
			match(SEMI);
			_enterOPT();
			setState(142);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULE) | (1L << IMPORT) | (1L << COLON) | (1L << FORALL) | (1L << LPAR) | (1L << LBRACE) | (1L << LINEAR) | (1L << AT) | (1L << CATEGORY) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(141);
				declaration();
				}
			}

			_exitOPT();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			setState(167);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(148);
				moduleDeclaration();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(152);
				importDeclaration();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(156);
				ruleDeclaration();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(160);
				sortDeclaration();
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				setState(164);
				directive();
				_exitAlt();
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

	public static class ModuleDeclarationContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(CrsxTermParser.MODULE, 0); }
		public TerminalNode CONSTRUCTOR() { return getToken(CrsxTermParser.CONSTRUCTOR, 0); }
		public TerminalNode LBRACE() { return getToken(CrsxTermParser.LBRACE, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CrsxTermParser.RBRACE, 0); }
		public ModuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterModuleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitModuleDeclaration(this);
		}
	}

	public final ModuleDeclarationContext moduleDeclaration() throws RecognitionException {
		ModuleDeclarationContext _localctx = new ModuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_moduleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(170);
			match(MODULE);
			setState(171);
			match(CONSTRUCTOR);
			setState(172);
			match(LBRACE);
			setState(173);
			declarations();
			setState(174);
			match(RBRACE);
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode IMPORT() { return getToken(CrsxTermParser.IMPORT, 0); }
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public TerminalNode MODULE() { return getToken(CrsxTermParser.MODULE, 0); }
		public TerminalNode GRAMMAR() { return getToken(CrsxTermParser.GRAMMAR, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importDeclaration);
		try {
			setState(194);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(178);
				match(IMPORT);
				setState(179);
				constructor();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(183);
				match(IMPORT);
				setState(184);
				match(MODULE);
				setState(185);
				constructor();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(189);
				match(IMPORT);
				setState(190);
				match(GRAMMAR);
				setState(191);
				constructor();
				_exitAlt();
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

	public static class RuleDeclarationContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(CrsxTermParser.ARROW, 0); }
		public ContractumContext contractum() {
			return getRuleContext(ContractumContext.class,0);
		}
		public OptionContext option() {
			return getRuleContext(OptionContext.class,0);
		}
		public RuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterRuleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitRuleDeclaration(this);
		}
	}

	public final RuleDeclarationContext ruleDeclaration() throws RecognitionException {
		RuleDeclarationContext _localctx = new RuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ruleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterOPT();
			setState(199);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(198);
				option();
				}
				break;
			}
			_exitOPT();
			setState(202);
			pattern();
			setState(203);
			match(ARROW);
			setState(204);
			contractum();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COLON() { return getToken(CrsxTermParser.COLON, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitOption(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_option);
		int _la;
		try {
			setState(221);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(208);
				constructor();
				_enterOPT();
				setState(211);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(210);
					arguments();
					}
				}

				_exitOPT();
				setState(214);
				match(COLON);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(218);
				annotations();
				_exitAlt();
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

	public static class PatternContext extends ParserRuleContext {
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitPattern(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterOPT();
			setState(226);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(225);
				properties();
				}
			}

			_exitOPT();
			setState(229);
			constructor();
			_enterOPT();
			setState(232);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(231);
				arguments();
				}
			}

			_exitOPT();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public ContractumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterContractum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitContractum(this);
		}
	}

	public final ContractumContext contractum() throws RecognitionException {
		ContractumContext _localctx = new ContractumContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_contractum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(238);
			freeTerm();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitAnnotations(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_annotations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterOOM();
			setState(244); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(243);
					annotation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(246); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			_exitOOM();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode AT() { return getToken(CrsxTermParser.AT, 0); }
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(252);
			match(AT);
			setState(253);
			constructor();
			_enterOPT();
			setState(256);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(255);
				arguments();
				}
			}

			_exitOPT();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_term);
		try {
			setState(269);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(262);
				freeTerm();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(266);
				boundTerm();
				_exitAlt();
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

	public static class FreeTermContext extends ParserRuleContext {
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
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
		public TerminalNode METAVAR() { return getToken(CrsxTermParser.METAVAR, 0); }
		public FreeArgumentsContext freeArguments() {
			return getRuleContext(FreeArgumentsContext.class,0);
		}
		public ConcreteContext concrete() {
			return getRuleContext(ConcreteContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FreeTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freeTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterFreeTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitFreeTerm(this);
		}
	}

	public final FreeTermContext freeTerm() throws RecognitionException {
		FreeTermContext _localctx = new FreeTermContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_freeTerm);
		int _la;
		try {
			setState(387);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_enterOPT();
				setState(274);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(273);
					annotations();
					}
					break;
				}
				_exitOPT();
				_enterOPT();
				setState(279);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(278);
					properties();
					}
				}

				_exitOPT();
				setState(282);
				constructor();
				_enterOPT();
				setState(285);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(284);
					arguments();
					}
				}

				_exitOPT();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_enterOPT();
				setState(293);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(292);
					annotations();
					}
					break;
				}
				_exitOPT();
				_enterOPT();
				setState(298);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(297);
					properties();
					}
				}

				_exitOPT();
				setState(301);
				constructor();
				setState(302);
				term();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				_enterOPT();
				setState(308);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(307);
					annotations();
					}
				}

				_exitOPT();
				_enterOPT();
				setState(313);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(312);
					properties();
					}
				}

				_exitOPT();
				setState(316);
				literal();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				_enterOPT();
				setState(322);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(321);
					annotations();
					}
				}

				_exitOPT();
				setState(325);
				list();
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				_enterOPT();
				setState(331);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(330);
					annotations();
					}
				}

				_exitOPT();
				setState(334);
				variable();
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_enterAlt("6");
				_enterOPT();
				setState(340);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(339);
					annotations();
					}
				}

				_exitOPT();
				setState(343);
				properties();
				_exitAlt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				_enterAlt("7");
				_enterOPT();
				setState(349);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(348);
					annotations();
					}
				}

				_exitOPT();
				_enterOPT();
				setState(354);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(353);
					properties();
					}
				}

				_exitOPT();
				setState(357);
				match(METAVAR);
				_enterOPT();
				setState(360);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(359);
					freeArguments();
					}
				}

				_exitOPT();
				_exitAlt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				_enterAlt("8");
				_enterOPT();
				setState(367);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(366);
					annotations();
					}
				}

				_exitOPT();
				setState(370);
				concrete();
				_exitAlt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				_enterAlt("9");
				_enterOPT();
				setState(376);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(375);
					annotations();
					}
				}

				_exitOPT();
				_enterOPT();
				setState(381);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(380);
					properties();
					}
				}

				_exitOPT();
				setState(384);
				expression();
				_exitAlt();
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

	public static class BoundTermContext extends ParserRuleContext {
		public BinderContext binder() {
			return getRuleContext(BinderContext.class,0);
		}
		public NextBinderContext nextBinder() {
			return getRuleContext(NextBinderContext.class,0);
		}
		public BoundTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterBoundTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitBoundTerm(this);
		}
	}

	public final BoundTermContext boundTerm() throws RecognitionException {
		BoundTermContext _localctx = new BoundTermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_boundTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(390);
			binder();
			setState(391);
			nextBinder();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode DOT() { return getToken(CrsxTermParser.DOT, 0); }
		public FreeTermContext freeTerm() {
			return getRuleContext(FreeTermContext.class,0);
		}
		public NextBinderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextBinder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterNextBinder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitNextBinder(this);
		}
	}

	public final NextBinderContext nextBinder() throws RecognitionException {
		NextBinderContext _localctx = new NextBinderContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nextBinder);
		try {
			setState(404);
			switch (_input.LA(1)) {
			case LINEAR:
			case AT:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(395);
				binder();
				setState(396);
				nextBinder();
				_exitAlt();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(400);
				match(DOT);
				setState(401);
				freeTerm();
				_exitAlt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LSQUARE() { return getToken(CrsxTermParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(CrsxTermParser.RSQUARE, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(407);
			match(LSQUARE);
			_enterOPT();
			setState(410);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPATCH) | (1L << COLON) | (1L << LPAR) | (1L << LBRACE) | (1L << LINEAR) | (1L << AT) | (1L << CATEGORY) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(409);
				terms();
				}
			}

			_exitOPT();
			setState(413);
			match(RSQUARE);
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public List<Terms_S1Context> terms_S1() {
			return getRuleContexts(Terms_S1Context.class);
		}
		public Terms_S1Context terms_S1(int i) {
			return getRuleContext(Terms_S1Context.class,i);
		}
		public TermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitTerms(this);
		}
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(417);
			term();
			_enterZOM();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(419);
				terms_S1();
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			_exitZOM();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COMMA() { return getToken(CrsxTermParser.COMMA, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Terms_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterTerms_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitTerms_S1(this);
		}
	}

	public final Terms_S1Context terms_S1() throws RecognitionException {
		Terms_S1Context _localctx = new Terms_S1Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_terms_S1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(429);
			match(COMMA);
			setState(430);
			term();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LSQUARE() { return getToken(CrsxTermParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(CrsxTermParser.RSQUARE, 0); }
		public FreeTermsContext freeTerms() {
			return getRuleContext(FreeTermsContext.class,0);
		}
		public FreeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterFreeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitFreeArguments(this);
		}
	}

	public final FreeArgumentsContext freeArguments() throws RecognitionException {
		FreeArgumentsContext _localctx = new FreeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_freeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(434);
			match(LSQUARE);
			_enterOPT();
			setState(437);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPATCH) | (1L << COLON) | (1L << LPAR) | (1L << LBRACE) | (1L << LINEAR) | (1L << AT) | (1L << CATEGORY) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(436);
				freeTerms();
				}
			}

			_exitOPT();
			setState(440);
			match(RSQUARE);
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public List<FreeTerms_S1Context> freeTerms_S1() {
			return getRuleContexts(FreeTerms_S1Context.class);
		}
		public FreeTerms_S1Context freeTerms_S1(int i) {
			return getRuleContext(FreeTerms_S1Context.class,i);
		}
		public FreeTermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freeTerms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterFreeTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitFreeTerms(this);
		}
	}

	public final FreeTermsContext freeTerms() throws RecognitionException {
		FreeTermsContext _localctx = new FreeTermsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_freeTerms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(444);
			freeTerm();
			_enterZOM();
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(446);
				freeTerms_S1();
				}
				}
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			_exitZOM();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COMMA() { return getToken(CrsxTermParser.COMMA, 0); }
		public FreeTermContext freeTerm() {
			return getRuleContext(FreeTermContext.class,0);
		}
		public FreeTerms_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freeTerms_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterFreeTerms_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitFreeTerms_S1(this);
		}
	}

	public final FreeTerms_S1Context freeTerms_S1() throws RecognitionException {
		FreeTerms_S1Context _localctx = new FreeTerms_S1Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_freeTerms_S1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(456);
			match(COMMA);
			setState(457);
			freeTerm();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LPAR() { return getToken(CrsxTermParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CrsxTermParser.RPAR, 0); }
		public TermListContext termList() {
			return getRuleContext(TermListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(461);
			match(LPAR);
			_enterOPT();
			setState(464);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPATCH) | (1L << COLON) | (1L << LPAR) | (1L << LBRACE) | (1L << LINEAR) | (1L << AT) | (1L << CATEGORY) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(463);
				termList();
				}
			}

			_exitOPT();
			setState(467);
			match(RPAR);
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public List<TermList_S1Context> termList_S1() {
			return getRuleContexts(TermList_S1Context.class);
		}
		public TermList_S1Context termList_S1(int i) {
			return getRuleContext(TermList_S1Context.class,i);
		}
		public TermListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterTermList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitTermList(this);
		}
	}

	public final TermListContext termList() throws RecognitionException {
		TermListContext _localctx = new TermListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_termList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(471);
			term();
			_enterZOM();
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(473);
				termList_S1();
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			_exitZOM();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode SEMI() { return getToken(CrsxTermParser.SEMI, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermList_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termList_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterTermList_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitTermList_S1(this);
		}
	}

	public final TermList_S1Context termList_S1() throws RecognitionException {
		TermList_S1Context _localctx = new TermList_S1Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_termList_S1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(483);
			match(SEMI);
			_enterOPT();
			setState(486);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPATCH) | (1L << COLON) | (1L << LPAR) | (1L << LBRACE) | (1L << LINEAR) | (1L << AT) | (1L << CATEGORY) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(485);
				term();
				}
			}

			_exitOPT();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode VARIABLE() { return getToken(CrsxTermParser.VARIABLE, 0); }
		public List<LinearContext> linear() {
			return getRuleContexts(LinearContext.class);
		}
		public LinearContext linear(int i) {
			return getRuleContext(LinearContext.class,i);
		}
		public FunctionalContext functional() {
			return getRuleContext(FunctionalContext.class,0);
		}
		public VarsortContext varsort() {
			return getRuleContext(VarsortContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterOPT();
			setState(494);
			_la = _input.LA(1);
			if (_la==LINEAR) {
				{
				setState(493);
				linear();
				}
			}

			_exitOPT();
			setState(497);
			match(VARIABLE);
			_enterOPT();
			setState(500);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(499);
				linear();
				}
				break;
			}
			_exitOPT();
			_enterOPT();
			setState(505);
			_la = _input.LA(1);
			if (_la==FUNCTIONAL) {
				{
				setState(504);
				functional();
				}
			}

			_exitOPT();
			_enterOPT();
			setState(510);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(509);
				varsort();
				}
				break;
			}
			_exitOPT();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LINEAR() { return getToken(CrsxTermParser.LINEAR, 0); }
		public LinearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linear; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterLinear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitLinear(this);
		}
	}

	public final LinearContext linear() throws RecognitionException {
		LinearContext _localctx = new LinearContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_linear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(516);
			match(LINEAR);
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode FUNCTIONAL() { return getToken(CrsxTermParser.FUNCTIONAL, 0); }
		public FunctionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterFunctional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitFunctional(this);
		}
	}

	public final FunctionalContext functional() throws RecognitionException {
		FunctionalContext _localctx = new FunctionalContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(520);
			match(FUNCTIONAL);
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode STRING() { return getToken(CrsxTermParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(CrsxTermParser.NUMBER, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_literal);
		try {
			setState(529);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(524);
				match(STRING);
				_exitAlt();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(527);
				match(NUMBER);
				_exitAlt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public BinderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterBinder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitBinder(this);
		}
	}

	public final BinderContext binder() throws RecognitionException {
		BinderContext _localctx = new BinderContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_binder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterOPT();
			setState(534);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(533);
				annotations();
				}
			}

			_exitOPT();
			setState(537);
			variable();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COLONCOLON() { return getToken(CrsxTermParser.COLONCOLON, 0); }
		public SortnameContext sortname() {
			return getRuleContext(SortnameContext.class,0);
		}
		public VarsortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varsort; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterVarsort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitVarsort(this);
		}
	}

	public final VarsortContext varsort() throws RecognitionException {
		VarsortContext _localctx = new VarsortContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_varsort);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(541);
			match(COLONCOLON);
			setState(542);
			sortname();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode CATEGORY() { return getToken(CrsxTermParser.CATEGORY, 0); }
		public TerminalNode CONCRETE() { return getToken(CrsxTermParser.CONCRETE, 0); }
		public TerminalNode CONCRETE2() { return getToken(CrsxTermParser.CONCRETE2, 0); }
		public TerminalNode CONCRETE3() { return getToken(CrsxTermParser.CONCRETE3, 0); }
		public TerminalNode CONCRETE4() { return getToken(CrsxTermParser.CONCRETE4, 0); }
		public ConcreteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concrete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterConcrete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitConcrete(this);
		}
	}

	public final ConcreteContext concrete() throws RecognitionException {
		ConcreteContext _localctx = new ConcreteContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_concrete);
		try {
			setState(561);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(546);
				match(CATEGORY);
				setState(547);
				match(CONCRETE);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(550);
				match(CATEGORY);
				setState(551);
				match(CONCRETE2);
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(554);
				match(CATEGORY);
				setState(555);
				match(CONCRETE3);
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(558);
				match(CATEGORY);
				setState(559);
				match(CONCRETE4);
				_exitAlt();
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

	public static class DispatchContext extends ParserRuleContext {
		public TerminalNode DISPATCH() { return getToken(CrsxTermParser.DISPATCH, 0); }
		public DispatchTermContext dispatchTerm() {
			return getRuleContext(DispatchTermContext.class,0);
		}
		public DispatchCasesContext dispatchCases() {
			return getRuleContext(DispatchCasesContext.class,0);
		}
		public DelayCaseContext delayCase() {
			return getRuleContext(DelayCaseContext.class,0);
		}
		public DispatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterDispatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitDispatch(this);
		}
	}

	public final DispatchContext dispatch() throws RecognitionException {
		DispatchContext _localctx = new DispatchContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_dispatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(564);
			match(DISPATCH);
			setState(565);
			dispatchTerm();
			setState(566);
			dispatchCases();
			_enterOPT();
			setState(569);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(568);
				delayCase();
				}
				break;
			}
			_exitOPT();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public DispatchTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatchTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterDispatchTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitDispatchTerm(this);
		}
	}

	public final DispatchTermContext dispatchTerm() throws RecognitionException {
		DispatchTermContext _localctx = new DispatchTermContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_dispatchTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(575);
			freeTerm();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public List<DispatchCases_S1Context> dispatchCases_S1() {
			return getRuleContexts(DispatchCases_S1Context.class);
		}
		public DispatchCases_S1Context dispatchCases_S1(int i) {
			return getRuleContext(DispatchCases_S1Context.class,i);
		}
		public DispatchCasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatchCases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterDispatchCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitDispatchCases(this);
		}
	}

	public final DispatchCasesContext dispatchCases() throws RecognitionException {
		DispatchCasesContext _localctx = new DispatchCasesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_dispatchCases);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(579);
			dispatchCase();
			_enterZOM();
			setState(584);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(581);
					dispatchCases_S1();
					}
					} 
				}
				setState(586);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			_exitZOM();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode SEMI() { return getToken(CrsxTermParser.SEMI, 0); }
		public DispatchCaseContext dispatchCase() {
			return getRuleContext(DispatchCaseContext.class,0);
		}
		public DispatchCases_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatchCases_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterDispatchCases_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitDispatchCases_S1(this);
		}
	}

	public final DispatchCases_S1Context dispatchCases_S1() throws RecognitionException {
		DispatchCases_S1Context _localctx = new DispatchCases_S1Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_dispatchCases_S1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(591);
			match(SEMI);
			setState(592);
			dispatchCase();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public DispatchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterDispatchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitDispatchCase(this);
		}
	}

	public final DispatchCaseContext dispatchCase() throws RecognitionException {
		DispatchCaseContext _localctx = new DispatchCaseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_dispatchCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(596);
			ruleDeclaration();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode DELAY() { return getToken(CrsxTermParser.DELAY, 0); }
		public DelayCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delayCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterDelayCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitDelayCase(this);
		}
	}

	public final DelayCaseContext delayCase() throws RecognitionException {
		DelayCaseContext _localctx = new DelayCaseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_delayCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(600);
			match(DELAY);
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LBRACE() { return getToken(CrsxTermParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CrsxTermParser.RBRACE, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitProperties(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(604);
			match(LBRACE);
			_enterOPT();
			setState(607);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << NOT) | (1L << AT) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING))) != 0)) {
				{
				setState(606);
				propertyList();
				}
			}

			_exitOPT();
			setState(610);
			match(RBRACE);
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public List<PropertyList_S1Context> propertyList_S1() {
			return getRuleContexts(PropertyList_S1Context.class);
		}
		public PropertyList_S1Context propertyList_S1(int i) {
			return getRuleContext(PropertyList_S1Context.class,i);
		}
		public PropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitPropertyList(this);
		}
	}

	public final PropertyListContext propertyList() throws RecognitionException {
		PropertyListContext _localctx = new PropertyListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_propertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(614);
			property();
			_enterZOM();
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(616);
				propertyList_S1();
				}
				}
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			_exitZOM();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode SEMI() { return getToken(CrsxTermParser.SEMI, 0); }
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public PropertyList_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterPropertyList_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitPropertyList_S1(this);
		}
	}

	public final PropertyList_S1Context propertyList_S1() throws RecognitionException {
		PropertyList_S1Context _localctx = new PropertyList_S1Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_propertyList_S1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(626);
			match(SEMI);
			_enterOPT();
			setState(629);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << NOT) | (1L << AT) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING))) != 0)) {
				{
				setState(628);
				property();
				}
			}

			_exitOPT();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode METAVAR() { return getToken(CrsxTermParser.METAVAR, 0); }
		public TerminalNode NOT() { return getToken(CrsxTermParser.NOT, 0); }
		public TerminalNode COLON() { return getToken(CrsxTermParser.COLON, 0); }
		public FreeTermContext freeTerm() {
			return getRuleContext(FreeTermContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(CrsxTermParser.VARIABLE, 0); }
		public TerminalNode STRING() { return getToken(CrsxTermParser.STRING, 0); }
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitProperty(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_property);
		try {
			setState(679);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(635);
				match(METAVAR);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(638);
				match(NOT);
				setState(639);
				match(METAVAR);
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(642);
				match(METAVAR);
				setState(643);
				match(COLON);
				setState(644);
				freeTerm();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(648);
				match(VARIABLE);
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				setState(651);
				match(NOT);
				setState(652);
				match(VARIABLE);
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_enterAlt("6");
				setState(655);
				match(VARIABLE);
				setState(656);
				match(COLON);
				setState(657);
				freeTerm();
				_exitAlt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				_enterAlt("7");
				setState(661);
				match(STRING);
				_exitAlt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				_enterAlt("8");
				setState(664);
				match(NOT);
				setState(665);
				match(STRING);
				_exitAlt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				_enterAlt("9");
				setState(668);
				match(STRING);
				setState(669);
				match(COLON);
				setState(670);
				freeTerm();
				_exitAlt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				_enterAlt("10");
				setState(674);
				constructor();
				setState(675);
				match(COLON);
				setState(676);
				freeTerm();
				_exitAlt();
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

	public static class ExpressionContext extends ParserRuleContext {
		public DispatchContext dispatch() {
			return getRuleContext(DispatchContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(682);
			dispatch();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public SortsetContext sortset() {
			return getRuleContext(SortsetContext.class,0);
		}
		public SortnameContext sortname() {
			return getRuleContext(SortnameContext.class,0);
		}
		public TerminalNode DATASORT() { return getToken(CrsxTermParser.DATASORT, 0); }
		public TerminalNode LPAR() { return getToken(CrsxTermParser.LPAR, 0); }
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CrsxTermParser.RPAR, 0); }
		public SortparamsContext sortparams() {
			return getRuleContext(SortparamsContext.class,0);
		}
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(CrsxTermParser.COLONCOLON, 0); }
		public SortDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterSortDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitSortDeclaration(this);
		}
	}

	public final SortDeclarationContext sortDeclaration() throws RecognitionException {
		SortDeclarationContext _localctx = new SortDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_sortDeclaration);
		int _la;
		try {
			setState(711);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_enterOPT();
				setState(688);
				_la = _input.LA(1);
				if (_la==FORALL) {
					{
					setState(687);
					sortparams();
					}
				}

				_exitOPT();
				setState(691);
				sortset();
				setState(692);
				sortname();
				setState(693);
				match(DATASORT);
				setState(694);
				match(LPAR);
				setState(695);
				forms();
				setState(696);
				match(RPAR);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_enterOPT();
				setState(702);
				_la = _input.LA(1);
				if (_la==FORALL) {
					{
					setState(701);
					sortparams();
					}
				}

				_exitOPT();
				setState(705);
				sortset();
				setState(706);
				form();
				setState(707);
				match(COLONCOLON);
				setState(708);
				sortname();
				_exitAlt();
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

	public static class SortparamsContext extends ParserRuleContext {
		public TerminalNode FORALL() { return getToken(CrsxTermParser.FORALL, 0); }
		public TerminalNode DOT() { return getToken(CrsxTermParser.DOT, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public SortparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterSortparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitSortparams(this);
		}
	}

	public final SortparamsContext sortparams() throws RecognitionException {
		SortparamsContext _localctx = new SortparamsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_sortparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(714);
			match(FORALL);
			_enterOOM();
			setState(717); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(716);
				variable();
				}
				}
				setState(719); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINEAR || _la==VARIABLE );
			_exitOOM();
			setState(722);
			match(DOT);
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public SortsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterSortset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitSortset(this);
		}
	}

	public final SortsetContext sortset() throws RecognitionException {
		SortsetContext _localctx = new SortsetContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_sortset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterOPT();
			setState(728);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(727);
				properties();
				}
			}

			_exitOPT();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public List<Sortnames_S1Context> sortnames_S1() {
			return getRuleContexts(Sortnames_S1Context.class);
		}
		public Sortnames_S1Context sortnames_S1(int i) {
			return getRuleContext(Sortnames_S1Context.class,i);
		}
		public SortnamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortnames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterSortnames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitSortnames(this);
		}
	}

	public final SortnamesContext sortnames() throws RecognitionException {
		SortnamesContext _localctx = new SortnamesContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_sortnames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(734);
			sortname();
			_enterZOM();
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(736);
				sortnames_S1();
				}
				}
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			_exitZOM();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COMMA() { return getToken(CrsxTermParser.COMMA, 0); }
		public SortnameContext sortname() {
			return getRuleContext(SortnameContext.class,0);
		}
		public Sortnames_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortnames_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterSortnames_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitSortnames_S1(this);
		}
	}

	public final Sortnames_S1Context sortnames_S1() throws RecognitionException {
		Sortnames_S1Context _localctx = new Sortnames_S1Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_sortnames_S1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(746);
			match(COMMA);
			setState(747);
			sortname();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public SortargumentsContext sortarguments() {
			return getRuleContext(SortargumentsContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public SortnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterSortname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitSortname(this);
		}
	}

	public final SortnameContext sortname() throws RecognitionException {
		SortnameContext _localctx = new SortnameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_sortname);
		int _la;
		try {
			setState(763);
			switch (_input.LA(1)) {
			case COLON:
			case AT:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(751);
				constructor();
				_enterOPT();
				setState(754);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(753);
					sortarguments();
					}
				}

				_exitOPT();
				_exitAlt();
				}
				break;
			case LINEAR:
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(760);
				variable();
				_exitAlt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LSQUARE() { return getToken(CrsxTermParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(CrsxTermParser.RSQUARE, 0); }
		public SortnamesContext sortnames() {
			return getRuleContext(SortnamesContext.class,0);
		}
		public SortargumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortarguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterSortarguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitSortarguments(this);
		}
	}

	public final SortargumentsContext sortarguments() throws RecognitionException {
		SortargumentsContext _localctx = new SortargumentsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_sortarguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(766);
			match(LSQUARE);
			_enterOPT();
			setState(769);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << LINEAR) | (1L << AT) | (1L << CONSTRUCTOR) | (1L << VARIABLE))) != 0)) {
				{
				setState(768);
				sortnames();
				}
			}

			_exitOPT();
			setState(772);
			match(RSQUARE);
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public List<Forms_S1Context> forms_S1() {
			return getRuleContexts(Forms_S1Context.class);
		}
		public Forms_S1Context forms_S1(int i) {
			return getRuleContext(Forms_S1Context.class,i);
		}
		public FormsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterForms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitForms(this);
		}
	}

	public final FormsContext forms() throws RecognitionException {
		FormsContext _localctx = new FormsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_forms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << LINEAR) | (1L << AT) | (1L << CONSTRUCTOR) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(777);
				forms_S1();
				}
				}
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			_exitZOM();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode SEMI() { return getToken(CrsxTermParser.SEMI, 0); }
		public Forms_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forms_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterForms_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitForms_S1(this);
		}
	}

	public final Forms_S1Context forms_S1() throws RecognitionException {
		Forms_S1Context _localctx = new Forms_S1Context(_ctx, getState());
		enterRule(_localctx, 102, RULE_forms_S1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(787);
			form();
			setState(788);
			match(SEMI);
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitForm(this);
		}
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_form);
		int _la;
		try {
			setState(804);
			switch (_input.LA(1)) {
			case COLON:
			case AT:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(792);
				constructor();
				_enterOPT();
				setState(795);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(794);
					arguments();
					}
				}

				_exitOPT();
				_exitAlt();
				}
				break;
			case LINEAR:
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(801);
				variable();
				_exitAlt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode CONSTRUCTOR() { return getToken(CrsxTermParser.CONSTRUCTOR, 0); }
		public ReservedContext reserved() {
			return getRuleContext(ReservedContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitConstructor(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_constructor);
		try {
			setState(815);
			switch (_input.LA(1)) {
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(807);
				qualifier();
				setState(808);
				match(CONSTRUCTOR);
				_exitAlt();
				}
				break;
			case COLON:
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(812);
				reserved();
				_exitAlt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode CONSTRUCTOR() { return getToken(CrsxTermParser.CONSTRUCTOR, 0); }
		public TerminalNode DOT() { return getToken(CrsxTermParser.DOT, 0); }
		public QualifierContext qualifier() {
			return getRuleContext(QualifierContext.class,0);
		}
		public QualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitQualifier(this);
		}
	}

	public final QualifierContext qualifier() throws RecognitionException {
		QualifierContext _localctx = new QualifierContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_qualifier);
		try {
			setState(825);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(818);
				match(CONSTRUCTOR);
				setState(819);
				match(DOT);
				setState(820);
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
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COLON() { return getToken(CrsxTermParser.COLON, 0); }
		public TerminalNode AT() { return getToken(CrsxTermParser.AT, 0); }
		public ReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitReserved(this);
		}
	}

	public final ReservedContext reserved() throws RecognitionException {
		ReservedContext _localctx = new ReservedContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_reserved);
		try {
			setState(833);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(828);
				match(COLON);
				_exitAlt();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(831);
				match(AT);
				_exitAlt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
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
		public DirectiveArgumentsContext directiveArguments() {
			return getRuleContext(DirectiveArgumentsContext.class,0);
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
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitDirective(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_directive);
		int _la;
		try {
			setState(856);
			switch (_input.LA(1)) {
			case COLON:
			case AT:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(836);
				constructor();
				_enterOPT();
				setState(839);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(838);
					directiveArguments();
					}
				}

				_exitOPT();
				_exitAlt();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(845);
				directiveList();
				_exitAlt();
				}
				break;
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(849);
				literal();
				_exitAlt();
				}
				break;
			case CATEGORY:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(853);
				concrete();
				_exitAlt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LSQUARE() { return getToken(CrsxTermParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(CrsxTermParser.RSQUARE, 0); }
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public DirectiveArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterDirectiveArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitDirectiveArguments(this);
		}
	}

	public final DirectiveArgumentsContext directiveArguments() throws RecognitionException {
		DirectiveArgumentsContext _localctx = new DirectiveArgumentsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_directiveArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(859);
			match(LSQUARE);
			_enterOPT();
			setState(862);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << LPAR) | (1L << AT) | (1L << CATEGORY) | (1L << CONSTRUCTOR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(861);
				directives();
				}
			}

			_exitOPT();
			setState(865);
			match(RSQUARE);
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public List<Directives_S1Context> directives_S1() {
			return getRuleContexts(Directives_S1Context.class);
		}
		public Directives_S1Context directives_S1(int i) {
			return getRuleContext(Directives_S1Context.class,i);
		}
		public DirectivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterDirectives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitDirectives(this);
		}
	}

	public final DirectivesContext directives() throws RecognitionException {
		DirectivesContext _localctx = new DirectivesContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_directives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(869);
			directive();
			_enterZOM();
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(871);
				directives_S1();
				}
				}
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			_exitZOM();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COMMA() { return getToken(CrsxTermParser.COMMA, 0); }
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public Directives_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directives_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterDirectives_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitDirectives_S1(this);
		}
	}

	public final Directives_S1Context directives_S1() throws RecognitionException {
		Directives_S1Context _localctx = new Directives_S1Context(_ctx, getState());
		enterRule(_localctx, 118, RULE_directives_S1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(881);
			match(COMMA);
			setState(882);
			directive();
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LPAR() { return getToken(CrsxTermParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CrsxTermParser.RPAR, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DirectiveListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterDirectiveList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitDirectiveList(this);
		}
	}

	public final DirectiveListContext directiveList() throws RecognitionException {
		DirectiveListContext _localctx = new DirectiveListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_directiveList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(886);
			match(LPAR);
			_enterOPT();
			setState(889);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULE) | (1L << IMPORT) | (1L << COLON) | (1L << FORALL) | (1L << LPAR) | (1L << LBRACE) | (1L << LINEAR) | (1L << AT) | (1L << CATEGORY) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(888);
				declarations();
				}
			}

			_exitOPT();
			setState(892);
			match(RPAR);
			_exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u0382\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u0085\n\3\f\3\16\3\u0088\13"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u0091\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\u00aa\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c5\n\7\3\b\3\b\3\b\5\b"+
		"\u00ca\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u00d6\n\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e0\n\t\3\n\3\n\3\n\5\n\u00e5\n\n\3\n"+
		"\3\n\3\n\3\n\5\n\u00eb\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\6\f\u00f7\n\f\r\f\16\f\u00f8\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u0103"+
		"\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0110\n"+
		"\16\3\17\3\17\3\17\5\17\u0115\n\17\3\17\3\17\3\17\5\17\u011a\n\17\3\17"+
		"\3\17\3\17\3\17\5\17\u0120\n\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0128"+
		"\n\17\3\17\3\17\3\17\5\17\u012d\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u0137\n\17\3\17\3\17\3\17\5\17\u013c\n\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u0145\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u014e\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0157\n\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0160\n\17\3\17\3\17\3\17\5\17"+
		"\u0165\n\17\3\17\3\17\3\17\3\17\5\17\u016b\n\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u0172\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u017b\n\17"+
		"\3\17\3\17\3\17\5\17\u0180\n\17\3\17\3\17\3\17\3\17\5\17\u0186\n\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u0197\n\21\3\22\3\22\3\22\3\22\5\22\u019d\n\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\7\23\u01a7\n\23\f\23\16\23\u01aa\13\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u01b8\n\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u01c2\n\26\f\26\16\26\u01c5"+
		"\13\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30"+
		"\u01d3\n\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u01dd\n\31\f"+
		"\31\16\31\u01e0\13\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u01e9\n"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\5\33\u01f1\n\33\3\33\3\33\3\33\3\33"+
		"\5\33\u01f7\n\33\3\33\3\33\3\33\5\33\u01fc\n\33\3\33\3\33\3\33\5\33\u0201"+
		"\n\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u0214\n\36\3\37\3\37\3\37\5\37\u0219\n\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\5!\u0234\n!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u023c\n\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\7$\u0249\n$\f$\16$\u024c\13$\3$\3$\3$\3%"+
		"\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\5(\u0262\n(\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\7)\u026c\n)\f)\16)\u026f\13)\3)\3)\3)\3*\3*\3*\3*"+
		"\5*\u0278\n*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\5+\u02aa\n+\3,\3,\3,\3,\3-\3-\3-\5-\u02b3\n-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u02c1\n-\3-\3-\3-\3-\3-\3-\3-\5-\u02ca"+
		"\n-\3.\3.\3.\3.\6.\u02d0\n.\r.\16.\u02d1\3.\3.\3.\3.\3/\3/\3/\5/\u02db"+
		"\n/\3/\3/\3/\3\60\3\60\3\60\3\60\7\60\u02e4\n\60\f\60\16\60\u02e7\13\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\5\62\u02f5"+
		"\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u02fe\n\62\3\63\3\63\3\63"+
		"\3\63\5\63\u0304\n\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\7\64\u030d\n"+
		"\64\f\64\16\64\u0310\13\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\5\66\u031e\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66"+
		"\u0327\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0332\n"+
		"\67\38\38\38\38\38\38\38\38\58\u033c\n8\39\39\39\39\39\39\59\u0344\n9"+
		"\3:\3:\3:\3:\5:\u034a\n:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\5:\u035b\n:\3;\3;\3;\3;\5;\u0361\n;\3;\3;\3;\3;\3<\3<\3<\3<\7<\u036b"+
		"\n<\f<\16<\u036e\13<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\5>\u037c\n>\3"+
		">\3>\3>\3>\3>\2\2?\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz\2\2\u03a1\2|\3\2\2\2\4\u0080"+
		"\3\2\2\2\6\u008c\3\2\2\2\b\u00a9\3\2\2\2\n\u00ab\3\2\2\2\f\u00c4\3\2\2"+
		"\2\16\u00c6\3\2\2\2\20\u00df\3\2\2\2\22\u00e1\3\2\2\2\24\u00ef\3\2\2\2"+
		"\26\u00f3\3\2\2\2\30\u00fd\3\2\2\2\32\u010f\3\2\2\2\34\u0185\3\2\2\2\36"+
		"\u0187\3\2\2\2 \u0196\3\2\2\2\"\u0198\3\2\2\2$\u01a2\3\2\2\2&\u01ae\3"+
		"\2\2\2(\u01b3\3\2\2\2*\u01bd\3\2\2\2,\u01c9\3\2\2\2.\u01ce\3\2\2\2\60"+
		"\u01d8\3\2\2\2\62\u01e4\3\2\2\2\64\u01ed\3\2\2\2\66\u0205\3\2\2\28\u0209"+
		"\3\2\2\2:\u0213\3\2\2\2<\u0215\3\2\2\2>\u021e\3\2\2\2@\u0233\3\2\2\2B"+
		"\u0235\3\2\2\2D\u0240\3\2\2\2F\u0244\3\2\2\2H\u0250\3\2\2\2J\u0255\3\2"+
		"\2\2L\u0259\3\2\2\2N\u025d\3\2\2\2P\u0267\3\2\2\2R\u0273\3\2\2\2T\u02a9"+
		"\3\2\2\2V\u02ab\3\2\2\2X\u02c9\3\2\2\2Z\u02cb\3\2\2\2\\\u02d7\3\2\2\2"+
		"^\u02df\3\2\2\2`\u02eb\3\2\2\2b\u02fd\3\2\2\2d\u02ff\3\2\2\2f\u0309\3"+
		"\2\2\2h\u0314\3\2\2\2j\u0326\3\2\2\2l\u0331\3\2\2\2n\u033b\3\2\2\2p\u0343"+
		"\3\2\2\2r\u035a\3\2\2\2t\u035c\3\2\2\2v\u0366\3\2\2\2x\u0372\3\2\2\2z"+
		"\u0377\3\2\2\2|}\b\2\1\2}~\5\4\3\2~\177\b\2\1\2\177\3\3\2\2\2\u0080\u0081"+
		"\b\3\1\2\u0081\u0082\5\b\5\2\u0082\u0086\b\3\1\2\u0083\u0085\5\6\4\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\b\3\1\2\u008a"+
		"\u008b\b\3\1\2\u008b\5\3\2\2\2\u008c\u008d\b\4\1\2\u008d\u008e\7\21\2"+
		"\2\u008e\u0090\b\4\1\2\u008f\u0091\5\b\5\2\u0090\u008f\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b\4\1\2\u0093\u0094\b\4\1\2\u0094"+
		"\7\3\2\2\2\u0095\u0096\b\5\1\2\u0096\u0097\5\n\6\2\u0097\u0098\b\5\1\2"+
		"\u0098\u00aa\3\2\2\2\u0099\u009a\b\5\1\2\u009a\u009b\5\f\7\2\u009b\u009c"+
		"\b\5\1\2\u009c\u00aa\3\2\2\2\u009d\u009e\b\5\1\2\u009e\u009f\5\16\b\2"+
		"\u009f\u00a0\b\5\1\2\u00a0\u00aa\3\2\2\2\u00a1\u00a2\b\5\1\2\u00a2\u00a3"+
		"\5X-\2\u00a3\u00a4\b\5\1\2\u00a4\u00aa\3\2\2\2\u00a5\u00a6\b\5\1\2\u00a6"+
		"\u00a7\5r:\2\u00a7\u00a8\b\5\1\2\u00a8\u00aa\3\2\2\2\u00a9\u0095\3\2\2"+
		"\2\u00a9\u0099\3\2\2\2\u00a9\u009d\3\2\2\2\u00a9\u00a1\3\2\2\2\u00a9\u00a5"+
		"\3\2\2\2\u00aa\t\3\2\2\2\u00ab\u00ac\b\6\1\2\u00ac\u00ad\7\3\2\2\u00ad"+
		"\u00ae\7 \2\2\u00ae\u00af\7\r\2\2\u00af\u00b0\5\4\3\2\u00b0\u00b1\7\16"+
		"\2\2\u00b1\u00b2\b\6\1\2\u00b2\13\3\2\2\2\u00b3\u00b4\b\7\1\2\u00b4\u00b5"+
		"\7\4\2\2\u00b5\u00b6\5l\67\2\u00b6\u00b7\b\7\1\2\u00b7\u00c5\3\2\2\2\u00b8"+
		"\u00b9\b\7\1\2\u00b9\u00ba\7\4\2\2\u00ba\u00bb\7\3\2\2\u00bb\u00bc\5l"+
		"\67\2\u00bc\u00bd\b\7\1\2\u00bd\u00c5\3\2\2\2\u00be\u00bf\b\7\1\2\u00bf"+
		"\u00c0\7\4\2\2\u00c0\u00c1\7\7\2\2\u00c1\u00c2\5l\67\2\u00c2\u00c3\b\7"+
		"\1\2\u00c3\u00c5\3\2\2\2\u00c4\u00b3\3\2\2\2\u00c4\u00b8\3\2\2\2\u00c4"+
		"\u00be\3\2\2\2\u00c5\r\3\2\2\2\u00c6\u00c7\b\b\1\2\u00c7\u00c9\b\b\1\2"+
		"\u00c8\u00ca\5\20\t\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00cc\b\b\1\2\u00cc\u00cd\5\22\n\2\u00cd\u00ce\7\t\2\2"+
		"\u00ce\u00cf\5\24\13\2\u00cf\u00d0\b\b\1\2\u00d0\17\3\2\2\2\u00d1\u00d2"+
		"\b\t\1\2\u00d2\u00d3\5l\67\2\u00d3\u00d5\b\t\1\2\u00d4\u00d6\5\"\22\2"+
		"\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8"+
		"\b\t\1\2\u00d8\u00d9\7\b\2\2\u00d9\u00da\b\t\1\2\u00da\u00e0\3\2\2\2\u00db"+
		"\u00dc\b\t\1\2\u00dc\u00dd\5\26\f\2\u00dd\u00de\b\t\1\2\u00de\u00e0\3"+
		"\2\2\2\u00df\u00d1\3\2\2\2\u00df\u00db\3\2\2\2\u00e0\21\3\2\2\2\u00e1"+
		"\u00e2\b\n\1\2\u00e2\u00e4\b\n\1\2\u00e3\u00e5\5N(\2\u00e4\u00e3\3\2\2"+
		"\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\b\n\1\2\u00e7\u00e8"+
		"\5l\67\2\u00e8\u00ea\b\n\1\2\u00e9\u00eb\5\"\22\2\u00ea\u00e9\3\2\2\2"+
		"\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\b\n\1\2\u00ed\u00ee"+
		"\b\n\1\2\u00ee\23\3\2\2\2\u00ef\u00f0\b\13\1\2\u00f0\u00f1\5\34\17\2\u00f1"+
		"\u00f2\b\13\1\2\u00f2\25\3\2\2\2\u00f3\u00f4\b\f\1\2\u00f4\u00f6\b\f\1"+
		"\2\u00f5\u00f7\5\30\r\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\b\f"+
		"\1\2\u00fb\u00fc\b\f\1\2\u00fc\27\3\2\2\2\u00fd\u00fe\b\r\1\2\u00fe\u00ff"+
		"\7\32\2\2\u00ff\u0100\5l\67\2\u0100\u0102\b\r\1\2\u0101\u0103\5\"\22\2"+
		"\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105"+
		"\b\r\1\2\u0105\u0106\b\r\1\2\u0106\31\3\2\2\2\u0107\u0108\b\16\1\2\u0108"+
		"\u0109\5\34\17\2\u0109\u010a\b\16\1\2\u010a\u0110\3\2\2\2\u010b\u010c"+
		"\b\16\1\2\u010c\u010d\5\36\20\2\u010d\u010e\b\16\1\2\u010e\u0110\3\2\2"+
		"\2\u010f\u0107\3\2\2\2\u010f\u010b\3\2\2\2\u0110\33\3\2\2\2\u0111\u0112"+
		"\b\17\1\2\u0112\u0114\b\17\1\2\u0113\u0115\5\26\f\2\u0114\u0113\3\2\2"+
		"\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\b\17\1\2\u0117"+
		"\u0119\b\17\1\2\u0118\u011a\5N(\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b\u011c\b\17\1\2\u011c\u011d\5l\67\2\u011d"+
		"\u011f\b\17\1\2\u011e\u0120\5\"\22\2\u011f\u011e\3\2\2\2\u011f\u0120\3"+
		"\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\b\17\1\2\u0122\u0123\b\17\1\2\u0123"+
		"\u0186\3\2\2\2\u0124\u0125\b\17\1\2\u0125\u0127\b\17\1\2\u0126\u0128\5"+
		"\26\f\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012a\b\17\1\2\u012a\u012c\b\17\1\2\u012b\u012d\5N(\2\u012c\u012b\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\b\17\1\2\u012f"+
		"\u0130\5l\67\2\u0130\u0131\5\32\16\2\u0131\u0132\b\17\1\2\u0132\u0186"+
		"\3\2\2\2\u0133\u0134\b\17\1\2\u0134\u0136\b\17\1\2\u0135\u0137\5\26\f"+
		"\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139"+
		"\b\17\1\2\u0139\u013b\b\17\1\2\u013a\u013c\5N(\2\u013b\u013a\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\b\17\1\2\u013e\u013f\5"+
		":\36\2\u013f\u0140\b\17\1\2\u0140\u0186\3\2\2\2\u0141\u0142\b\17\1\2\u0142"+
		"\u0144\b\17\1\2\u0143\u0145\5\26\f\2\u0144\u0143\3\2\2\2\u0144\u0145\3"+
		"\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\b\17\1\2\u0147\u0148\5.\30\2\u0148"+
		"\u0149\b\17\1\2\u0149\u0186\3\2\2\2\u014a\u014b\b\17\1\2\u014b\u014d\b"+
		"\17\1\2\u014c\u014e\5\26\f\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0150\b\17\1\2\u0150\u0151\5\64\33\2\u0151\u0152"+
		"\b\17\1\2\u0152\u0186\3\2\2\2\u0153\u0154\b\17\1\2\u0154\u0156\b\17\1"+
		"\2\u0155\u0157\5\26\f\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u0159\b\17\1\2\u0159\u015a\5N(\2\u015a\u015b\b\17"+
		"\1\2\u015b\u0186\3\2\2\2\u015c\u015d\b\17\1\2\u015d\u015f\b\17\1\2\u015e"+
		"\u0160\5\26\f\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3"+
		"\2\2\2\u0161\u0162\b\17\1\2\u0162\u0164\b\17\1\2\u0163\u0165\5N(\2\u0164"+
		"\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\b\17"+
		"\1\2\u0167\u0168\7\"\2\2\u0168\u016a\b\17\1\2\u0169\u016b\5(\25\2\u016a"+
		"\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\b\17"+
		"\1\2\u016d\u0186\b\17\1\2\u016e\u016f\b\17\1\2\u016f\u0171\b\17\1\2\u0170"+
		"\u0172\5\26\f\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3"+
		"\2\2\2\u0173\u0174\b\17\1\2\u0174\u0175\5@!\2\u0175\u0176\b\17\1\2\u0176"+
		"\u0186\3\2\2\2\u0177\u0178\b\17\1\2\u0178\u017a\b\17\1\2\u0179\u017b\5"+
		"\26\f\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u017d\b\17\1\2\u017d\u017f\b\17\1\2\u017e\u0180\5N(\2\u017f\u017e\3\2"+
		"\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\b\17\1\2\u0182"+
		"\u0183\5V,\2\u0183\u0184\b\17\1\2\u0184\u0186\3\2\2\2\u0185\u0111\3\2"+
		"\2\2\u0185\u0124\3\2\2\2\u0185\u0133\3\2\2\2\u0185\u0141\3\2\2\2\u0185"+
		"\u014a\3\2\2\2\u0185\u0153\3\2\2\2\u0185\u015c\3\2\2\2\u0185\u016e\3\2"+
		"\2\2\u0185\u0177\3\2\2\2\u0186\35\3\2\2\2\u0187\u0188\b\20\1\2\u0188\u0189"+
		"\5<\37\2\u0189\u018a\5 \21\2\u018a\u018b\b\20\1\2\u018b\37\3\2\2\2\u018c"+
		"\u018d\b\21\1\2\u018d\u018e\5<\37\2\u018e\u018f\5 \21\2\u018f\u0190\b"+
		"\21\1\2\u0190\u0197\3\2\2\2\u0191\u0192\b\21\1\2\u0192\u0193\7\25\2\2"+
		"\u0193\u0194\5\34\17\2\u0194\u0195\b\21\1\2\u0195\u0197\3\2\2\2\u0196"+
		"\u018c\3\2\2\2\u0196\u0191\3\2\2\2\u0197!\3\2\2\2\u0198\u0199\b\22\1\2"+
		"\u0199\u019a\7\17\2\2\u019a\u019c\b\22\1\2\u019b\u019d\5$\23\2\u019c\u019b"+
		"\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\b\22\1\2"+
		"\u019f\u01a0\7\20\2\2\u01a0\u01a1\b\22\1\2\u01a1#\3\2\2\2\u01a2\u01a3"+
		"\b\23\1\2\u01a3\u01a4\5\32\16\2\u01a4\u01a8\b\23\1\2\u01a5\u01a7\5&\24"+
		"\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9"+
		"\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac\b\23\1\2"+
		"\u01ac\u01ad\b\23\1\2\u01ad%\3\2\2\2\u01ae\u01af\b\24\1\2\u01af\u01b0"+
		"\7\22\2\2\u01b0\u01b1\5\32\16\2\u01b1\u01b2\b\24\1\2\u01b2\'\3\2\2\2\u01b3"+
		"\u01b4\b\25\1\2\u01b4\u01b5\7\17\2\2\u01b5\u01b7\b\25\1\2\u01b6\u01b8"+
		"\5*\26\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01ba\b\25\1\2\u01ba\u01bb\7\20\2\2\u01bb\u01bc\b\25\1\2\u01bc)\3\2\2"+
		"\2\u01bd\u01be\b\26\1\2\u01be\u01bf\5\34\17\2\u01bf\u01c3\b\26\1\2\u01c0"+
		"\u01c2\5,\27\2\u01c1\u01c0\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2"+
		"\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6"+
		"\u01c7\b\26\1\2\u01c7\u01c8\b\26\1\2\u01c8+\3\2\2\2\u01c9\u01ca\b\27\1"+
		"\2\u01ca\u01cb\7\22\2\2\u01cb\u01cc\5\34\17\2\u01cc\u01cd\b\27\1\2\u01cd"+
		"-\3\2\2\2\u01ce\u01cf\b\30\1\2\u01cf\u01d0\7\13\2\2\u01d0\u01d2\b\30\1"+
		"\2\u01d1\u01d3\5\60\31\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4\u01d5\b\30\1\2\u01d5\u01d6\7\f\2\2\u01d6\u01d7\b"+
		"\30\1\2\u01d7/\3\2\2\2\u01d8\u01d9\b\31\1\2\u01d9\u01da\5\32\16\2\u01da"+
		"\u01de\b\31\1\2\u01db\u01dd\5\62\32\2\u01dc\u01db\3\2\2\2\u01dd\u01e0"+
		"\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0"+
		"\u01de\3\2\2\2\u01e1\u01e2\b\31\1\2\u01e2\u01e3\b\31\1\2\u01e3\61\3\2"+
		"\2\2\u01e4\u01e5\b\32\1\2\u01e5\u01e6\7\21\2\2\u01e6\u01e8\b\32\1\2\u01e7"+
		"\u01e9\5\32\16\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3"+
		"\2\2\2\u01ea\u01eb\b\32\1\2\u01eb\u01ec\b\32\1\2\u01ec\63\3\2\2\2\u01ed"+
		"\u01ee\b\33\1\2\u01ee\u01f0\b\33\1\2\u01ef\u01f1\5\66\34\2\u01f0\u01ef"+
		"\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\b\33\1\2"+
		"\u01f3\u01f4\7!\2\2\u01f4\u01f6\b\33\1\2\u01f5\u01f7\5\66\34\2\u01f6\u01f5"+
		"\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\b\33\1\2"+
		"\u01f9\u01fb\b\33\1\2\u01fa\u01fc\58\35\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc"+
		"\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\b\33\1\2\u01fe\u0200\b\33\1\2"+
		"\u01ff\u0201\5> \2\u0200\u01ff\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202"+
		"\3\2\2\2\u0202\u0203\b\33\1\2\u0203\u0204\b\33\1\2\u0204\65\3\2\2\2\u0205"+
		"\u0206\b\34\1\2\u0206\u0207\7\27\2\2\u0207\u0208\b\34\1\2\u0208\67\3\2"+
		"\2\2\u0209\u020a\b\35\1\2\u020a\u020b\7\30\2\2\u020b\u020c\b\35\1\2\u020c"+
		"9\3\2\2\2\u020d\u020e\b\36\1\2\u020e\u020f\7#\2\2\u020f\u0214\b\36\1\2"+
		"\u0210\u0211\b\36\1\2\u0211\u0212\7$\2\2\u0212\u0214\b\36\1\2\u0213\u020d"+
		"\3\2\2\2\u0213\u0210\3\2\2\2\u0214;\3\2\2\2\u0215\u0216\b\37\1\2\u0216"+
		"\u0218\b\37\1\2\u0217\u0219\5\26\f\2\u0218\u0217\3\2\2\2\u0218\u0219\3"+
		"\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\b\37\1\2\u021b\u021c\5\64\33\2"+
		"\u021c\u021d\b\37\1\2\u021d=\3\2\2\2\u021e\u021f\b \1\2\u021f\u0220\7"+
		"\24\2\2\u0220\u0221\5b\62\2\u0221\u0222\b \1\2\u0222?\3\2\2\2\u0223\u0224"+
		"\b!\1\2\u0224\u0225\7\33\2\2\u0225\u0226\7\34\2\2\u0226\u0234\b!\1\2\u0227"+
		"\u0228\b!\1\2\u0228\u0229\7\33\2\2\u0229\u022a\7\35\2\2\u022a\u0234\b"+
		"!\1\2\u022b\u022c\b!\1\2\u022c\u022d\7\33\2\2\u022d\u022e\7\36\2\2\u022e"+
		"\u0234\b!\1\2\u022f\u0230\b!\1\2\u0230\u0231\7\33\2\2\u0231\u0232\7\37"+
		"\2\2\u0232\u0234\b!\1\2\u0233\u0223\3\2\2\2\u0233\u0227\3\2\2\2\u0233"+
		"\u022b\3\2\2\2\u0233\u022f\3\2\2\2\u0234A\3\2\2\2\u0235\u0236\b\"\1\2"+
		"\u0236\u0237\7\5\2\2\u0237\u0238\5D#\2\u0238\u0239\5F$\2\u0239\u023b\b"+
		"\"\1\2\u023a\u023c\5L\'\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c"+
		"\u023d\3\2\2\2\u023d\u023e\b\"\1\2\u023e\u023f\b\"\1\2\u023fC\3\2\2\2"+
		"\u0240\u0241\b#\1\2\u0241\u0242\5\34\17\2\u0242\u0243\b#\1\2\u0243E\3"+
		"\2\2\2\u0244\u0245\b$\1\2\u0245\u0246\5J&\2\u0246\u024a\b$\1\2\u0247\u0249"+
		"\5H%\2\u0248\u0247\3\2\2\2\u0249\u024c\3\2\2\2\u024a\u0248\3\2\2\2\u024a"+
		"\u024b\3\2\2\2\u024b\u024d\3\2\2\2\u024c\u024a\3\2\2\2\u024d\u024e\b$"+
		"\1\2\u024e\u024f\b$\1\2\u024fG\3\2\2\2\u0250\u0251\b%\1\2\u0251\u0252"+
		"\7\21\2\2\u0252\u0253\5J&\2\u0253\u0254\b%\1\2\u0254I\3\2\2\2\u0255\u0256"+
		"\b&\1\2\u0256\u0257\5\16\b\2\u0257\u0258\b&\1\2\u0258K\3\2\2\2\u0259\u025a"+
		"\b\'\1\2\u025a\u025b\7\6\2\2\u025b\u025c\b\'\1\2\u025cM\3\2\2\2\u025d"+
		"\u025e\b(\1\2\u025e\u025f\7\r\2\2\u025f\u0261\b(\1\2\u0260\u0262\5P)\2"+
		"\u0261\u0260\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0264"+
		"\b(\1\2\u0264\u0265\7\16\2\2\u0265\u0266\b(\1\2\u0266O\3\2\2\2\u0267\u0268"+
		"\b)\1\2\u0268\u0269\5T+\2\u0269\u026d\b)\1\2\u026a\u026c\5R*\2\u026b\u026a"+
		"\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e"+
		"\u0270\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0271\b)\1\2\u0271\u0272\b)\1"+
		"\2\u0272Q\3\2\2\2\u0273\u0274\b*\1\2\u0274\u0275\7\21\2\2\u0275\u0277"+
		"\b*\1\2\u0276\u0278\5T+\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278"+
		"\u0279\3\2\2\2\u0279\u027a\b*\1\2\u027a\u027b\b*\1\2\u027bS\3\2\2\2\u027c"+
		"\u027d\b+\1\2\u027d\u027e\7\"\2\2\u027e\u02aa\b+\1\2\u027f\u0280\b+\1"+
		"\2\u0280\u0281\7\26\2\2\u0281\u0282\7\"\2\2\u0282\u02aa\b+\1\2\u0283\u0284"+
		"\b+\1\2\u0284\u0285\7\"\2\2\u0285\u0286\7\b\2\2\u0286\u0287\5\34\17\2"+
		"\u0287\u0288\b+\1\2\u0288\u02aa\3\2\2\2\u0289\u028a\b+\1\2\u028a\u028b"+
		"\7!\2\2\u028b\u02aa\b+\1\2\u028c\u028d\b+\1\2\u028d\u028e\7\26\2\2\u028e"+
		"\u028f\7!\2\2\u028f\u02aa\b+\1\2\u0290\u0291\b+\1\2\u0291\u0292\7!\2\2"+
		"\u0292\u0293\7\b\2\2\u0293\u0294\5\34\17\2\u0294\u0295\b+\1\2\u0295\u02aa"+
		"\3\2\2\2\u0296\u0297\b+\1\2\u0297\u0298\7#\2\2\u0298\u02aa\b+\1\2\u0299"+
		"\u029a\b+\1\2\u029a\u029b\7\26\2\2\u029b\u029c\7#\2\2\u029c\u02aa\b+\1"+
		"\2\u029d\u029e\b+\1\2\u029e\u029f\7#\2\2\u029f\u02a0\7\b\2\2\u02a0\u02a1"+
		"\5\34\17\2\u02a1\u02a2\b+\1\2\u02a2\u02aa\3\2\2\2\u02a3\u02a4\b+\1\2\u02a4"+
		"\u02a5\5l\67\2\u02a5\u02a6\7\b\2\2\u02a6\u02a7\5\34\17\2\u02a7\u02a8\b"+
		"+\1\2\u02a8\u02aa\3\2\2\2\u02a9\u027c\3\2\2\2\u02a9\u027f\3\2\2\2\u02a9"+
		"\u0283\3\2\2\2\u02a9\u0289\3\2\2\2\u02a9\u028c\3\2\2\2\u02a9\u0290\3\2"+
		"\2\2\u02a9\u0296\3\2\2\2\u02a9\u0299\3\2\2\2\u02a9\u029d\3\2\2\2\u02a9"+
		"\u02a3\3\2\2\2\u02aaU\3\2\2\2\u02ab\u02ac\b,\1\2\u02ac\u02ad\5B\"\2\u02ad"+
		"\u02ae\b,\1\2\u02aeW\3\2\2\2\u02af\u02b0\b-\1\2\u02b0\u02b2\b-\1\2\u02b1"+
		"\u02b3\5Z.\2\u02b2\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\3\2\2"+
		"\2\u02b4\u02b5\b-\1\2\u02b5\u02b6\5\\/\2\u02b6\u02b7\5b\62\2\u02b7\u02b8"+
		"\7\23\2\2\u02b8\u02b9\7\13\2\2\u02b9\u02ba\5f\64\2\u02ba\u02bb\7\f\2\2"+
		"\u02bb\u02bc\b-\1\2\u02bc\u02ca\3\2\2\2\u02bd\u02be\b-\1\2\u02be\u02c0"+
		"\b-\1\2\u02bf\u02c1\5Z.\2\u02c0\u02bf\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2\u02c3\b-\1\2\u02c3\u02c4\5\\/\2\u02c4\u02c5\5j\66"+
		"\2\u02c5\u02c6\7\24\2\2\u02c6\u02c7\5b\62\2\u02c7\u02c8\b-\1\2\u02c8\u02ca"+
		"\3\2\2\2\u02c9\u02af\3\2\2\2\u02c9\u02bd\3\2\2\2\u02caY\3\2\2\2\u02cb"+
		"\u02cc\b.\1\2\u02cc\u02cd\7\n\2\2\u02cd\u02cf\b.\1\2\u02ce\u02d0\5\64"+
		"\33\2\u02cf\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1"+
		"\u02d2\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\b.\1\2\u02d4\u02d5\7\25"+
		"\2\2\u02d5\u02d6\b.\1\2\u02d6[\3\2\2\2\u02d7\u02d8\b/\1\2\u02d8\u02da"+
		"\b/\1\2\u02d9\u02db\5N(\2\u02da\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db"+
		"\u02dc\3\2\2\2\u02dc\u02dd\b/\1\2\u02dd\u02de\b/\1\2\u02de]\3\2\2\2\u02df"+
		"\u02e0\b\60\1\2\u02e0\u02e1\5b\62\2\u02e1\u02e5\b\60\1\2\u02e2\u02e4\5"+
		"`\61\2\u02e3\u02e2\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e5"+
		"\u02e6\3\2\2\2\u02e6\u02e8\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8\u02e9\b\60"+
		"\1\2\u02e9\u02ea\b\60\1\2\u02ea_\3\2\2\2\u02eb\u02ec\b\61\1\2\u02ec\u02ed"+
		"\7\22\2\2\u02ed\u02ee\5b\62\2\u02ee\u02ef\b\61\1\2\u02efa\3\2\2\2\u02f0"+
		"\u02f1\b\62\1\2\u02f1\u02f2\5l\67\2\u02f2\u02f4\b\62\1\2\u02f3\u02f5\5"+
		"d\63\2\u02f4\u02f3\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6"+
		"\u02f7\b\62\1\2\u02f7\u02f8\b\62\1\2\u02f8\u02fe\3\2\2\2\u02f9\u02fa\b"+
		"\62\1\2\u02fa\u02fb\5\64\33\2\u02fb\u02fc\b\62\1\2\u02fc\u02fe\3\2\2\2"+
		"\u02fd\u02f0\3\2\2\2\u02fd\u02f9\3\2\2\2\u02fec\3\2\2\2\u02ff\u0300\b"+
		"\63\1\2\u0300\u0301\7\17\2\2\u0301\u0303\b\63\1\2\u0302\u0304\5^\60\2"+
		"\u0303\u0302\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0306"+
		"\b\63\1\2\u0306\u0307\7\20\2\2\u0307\u0308\b\63\1\2\u0308e\3\2\2\2\u0309"+
		"\u030a\b\64\1\2\u030a\u030e\b\64\1\2\u030b\u030d\5h\65\2\u030c\u030b\3"+
		"\2\2\2\u030d\u0310\3\2\2\2\u030e\u030c\3\2\2\2\u030e\u030f\3\2\2\2\u030f"+
		"\u0311\3\2\2\2\u0310\u030e\3\2\2\2\u0311\u0312\b\64\1\2\u0312\u0313\b"+
		"\64\1\2\u0313g\3\2\2\2\u0314\u0315\b\65\1\2\u0315\u0316\5j\66\2\u0316"+
		"\u0317\7\21\2\2\u0317\u0318\b\65\1\2\u0318i\3\2\2\2\u0319\u031a\b\66\1"+
		"\2\u031a\u031b\5l\67\2\u031b\u031d\b\66\1\2\u031c\u031e\5\"\22\2\u031d"+
		"\u031c\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\b\66"+
		"\1\2\u0320\u0321\b\66\1\2\u0321\u0327\3\2\2\2\u0322\u0323\b\66\1\2\u0323"+
		"\u0324\5\64\33\2\u0324\u0325\b\66\1\2\u0325\u0327\3\2\2\2\u0326\u0319"+
		"\3\2\2\2\u0326\u0322\3\2\2\2\u0327k\3\2\2\2\u0328\u0329\b\67\1\2\u0329"+
		"\u032a\5n8\2\u032a\u032b\7 \2\2\u032b\u032c\b\67\1\2\u032c\u0332\3\2\2"+
		"\2\u032d\u032e\b\67\1\2\u032e\u032f\5p9\2\u032f\u0330\b\67\1\2\u0330\u0332"+
		"\3\2\2\2\u0331\u0328\3\2\2\2\u0331\u032d\3\2\2\2\u0332m\3\2\2\2\u0333"+
		"\u0334\b8\1\2\u0334\u0335\7 \2\2\u0335\u0336\7\25\2\2\u0336\u0337\5n8"+
		"\2\u0337\u0338\b8\1\2\u0338\u033c\3\2\2\2\u0339\u033a\b8\1\2\u033a\u033c"+
		"\b8\1\2\u033b\u0333\3\2\2\2\u033b\u0339\3\2\2\2\u033co\3\2\2\2\u033d\u033e"+
		"\b9\1\2\u033e\u033f\7\b\2\2\u033f\u0344\b9\1\2\u0340\u0341\b9\1\2\u0341"+
		"\u0342\7\32\2\2\u0342\u0344\b9\1\2\u0343\u033d\3\2\2\2\u0343\u0340\3\2"+
		"\2\2\u0344q\3\2\2\2\u0345\u0346\b:\1\2\u0346\u0347\5l\67\2\u0347\u0349"+
		"\b:\1\2\u0348\u034a\5t;\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2\u034a"+
		"\u034b\3\2\2\2\u034b\u034c\b:\1\2\u034c\u034d\b:\1\2\u034d\u035b\3\2\2"+
		"\2\u034e\u034f\b:\1\2\u034f\u0350\5z>\2\u0350\u0351\b:\1\2\u0351\u035b"+
		"\3\2\2\2\u0352\u0353\b:\1\2\u0353\u0354\5:\36\2\u0354\u0355\b:\1\2\u0355"+
		"\u035b\3\2\2\2\u0356\u0357\b:\1\2\u0357\u0358\5@!\2\u0358\u0359\b:\1\2"+
		"\u0359\u035b\3\2\2\2\u035a\u0345\3\2\2\2\u035a\u034e\3\2\2\2\u035a\u0352"+
		"\3\2\2\2\u035a\u0356\3\2\2\2\u035bs\3\2\2\2\u035c\u035d\b;\1\2\u035d\u035e"+
		"\7\17\2\2\u035e\u0360\b;\1\2\u035f\u0361\5v<\2\u0360\u035f\3\2\2\2\u0360"+
		"\u0361\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0363\b;\1\2\u0363\u0364\7\20"+
		"\2\2\u0364\u0365\b;\1\2\u0365u\3\2\2\2\u0366\u0367\b<\1\2\u0367\u0368"+
		"\5r:\2\u0368\u036c\b<\1\2\u0369\u036b\5x=\2\u036a\u0369\3\2\2\2\u036b"+
		"\u036e\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036f\3\2"+
		"\2\2\u036e\u036c\3\2\2\2\u036f\u0370\b<\1\2\u0370\u0371\b<\1\2\u0371w"+
		"\3\2\2\2\u0372\u0373\b=\1\2\u0373\u0374\7\22\2\2\u0374\u0375\5r:\2\u0375"+
		"\u0376\b=\1\2\u0376y\3\2\2\2\u0377\u0378\b>\1\2\u0378\u0379\7\13\2\2\u0379"+
		"\u037b\b>\1\2\u037a\u037c\5\4\3\2\u037b\u037a\3\2\2\2\u037b\u037c\3\2"+
		"\2\2\u037c\u037d\3\2\2\2\u037d\u037e\b>\1\2\u037e\u037f\7\f\2\2\u037f"+
		"\u0380\b>\1\2\u0380{\3\2\2\2H\u0086\u0090\u00a9\u00c4\u00c9\u00d5\u00df"+
		"\u00e4\u00ea\u00f8\u0102\u010f\u0114\u0119\u011f\u0127\u012c\u0136\u013b"+
		"\u0144\u014d\u0156\u015f\u0164\u016a\u0171\u017a\u017f\u0185\u0196\u019c"+
		"\u01a8\u01b7\u01c3\u01d2\u01de\u01e8\u01f0\u01f6\u01fb\u0200\u0213\u0218"+
		"\u0233\u023b\u024a\u0261\u026d\u0277\u02a9\u02b2\u02c0\u02c9\u02d1\u02da"+
		"\u02e5\u02f4\u02fd\u0303\u030e\u031d\u0326\u0331\u033b\u0343\u0349\u035a"+
		"\u0360\u036c\u037b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}