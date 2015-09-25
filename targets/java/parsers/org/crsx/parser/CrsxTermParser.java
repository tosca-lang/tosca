// Generated from CrsxTerm.g4 by ANTLR 4.5
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
		RULE_crsx = 0, RULE_declarations = 1, RULE_declaration = 2, RULE_moduleDeclaration = 3, 
		RULE_importDeclaration = 4, RULE_ruleDeclaration = 5, RULE_option = 6, 
		RULE_pattern = 7, RULE_contractum = 8, RULE_annotations = 9, RULE_annotation = 10, 
		RULE_term = 11, RULE_freeTerm = 12, RULE_binders = 13, RULE_arguments = 14, 
		RULE_terms = 15, RULE_freeArguments = 16, RULE_freeTerms = 17, RULE_list = 18, 
		RULE_termList = 19, RULE_listItem = 20, RULE_variable = 21, RULE_linear = 22, 
		RULE_functional = 23, RULE_literal = 24, RULE_varsort = 25, RULE_concrete = 26, 
		RULE_dispatch = 27, RULE_dispatchTerm = 28, RULE_dispatchCases = 29, RULE_dispatchCase = 30, 
		RULE_delayCase = 31, RULE_properties = 32, RULE_propertyList = 33, RULE_property = 34, 
		RULE_expression = 35, RULE_sortDeclaration = 36, RULE_sortparams = 37, 
		RULE_sortset = 38, RULE_sortnames = 39, RULE_sortname = 40, RULE_sortarguments = 41, 
		RULE_forms = 42, RULE_form = 43, RULE_constructor = 44, RULE_qualifier = 45, 
		RULE_reserved = 46, RULE_directive = 47, RULE_directiveArguments = 48, 
		RULE_directives = 49, RULE_directiveList = 50;
	public static final String[] ruleNames = {
		"crsx", "declarations", "declaration", "moduleDeclaration", "importDeclaration", 
		"ruleDeclaration", "option", "pattern", "contractum", "annotations", "annotation", 
		"term", "freeTerm", "binders", "arguments", "terms", "freeArguments", 
		"freeTerms", "list", "termList", "listItem", "variable", "linear", "functional", 
		"literal", "varsort", "concrete", "dispatch", "dispatchTerm", "dispatchCases", 
		"dispatchCase", "delayCase", "properties", "propertyList", "property", 
		"expression", "sortDeclaration", "sortparams", "sortset", "sortnames", 
		"sortname", "sortarguments", "forms", "form", "constructor", "qualifier", 
		"reserved", "directive", "directiveArguments", "directives", "directiveList"
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
	protected void _enterSymbol()  { fireEnterSymbol(_parseListeners, _ctx); }
	protected void _exitSymbol()     { fireExitSymbol(_parseListeners, _ctx); }
	protected void _enterBinder(String name)     { fireEnterBinder(_parseListeners, _ctx, name); }
	protected void _exitBinder()     { fireExitBinder(_parseListeners, _ctx); }
	protected void _enterBinds(String names) { fireEnterBinds(_parseListeners, _ctx, names); }
	protected void _exitBinds()  { fireExitBinds(_parseListeners, _ctx); }

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
			setState(103);
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
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CrsxTermParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CrsxTermParser.SEMI, i);
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
			_enterZOM();
			setState(108);
			declaration();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				_hide();
				setState(110);
				match(SEMI);
				setState(111);
				declaration();
				}
				}
				setState(116);
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
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(142);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(121);
				moduleDeclaration();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(125);
				importDeclaration();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(129);
				ruleDeclaration();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(133);
				sortDeclaration();
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				setState(137);
				directive();
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_enterAlt("6");
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
		enterRule(_localctx, 6, RULE_moduleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(146);
			match(MODULE);
			setState(147);
			match(CONSTRUCTOR);
			_hide();
			setState(149);
			match(LBRACE);
			setState(150);
			declarations();
			_hide();
			setState(152);
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
		enterRule(_localctx, 8, RULE_importDeclaration);
		try {
			setState(177);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_hide();
				setState(157);
				match(IMPORT);
				setState(158);
				constructor();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(163);
				match(IMPORT);
				_hide();
				setState(165);
				match(MODULE);
				setState(166);
				constructor();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				_hide();
				setState(171);
				match(IMPORT);
				_hide();
				setState(173);
				match(GRAMMAR);
				setState(174);
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
		enterRule(_localctx, 10, RULE_ruleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterOPT();
			setState(182);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(181);
				option();
				}
				break;
			}
			_exitOPT();
			setState(185);
			pattern();
			_hide();
			setState(187);
			match(ARROW);
			setState(188);
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
		enterRule(_localctx, 12, RULE_option);
		int _la;
		try {
			setState(206);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(192);
				constructor();
				_enterOPT();
				setState(195);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(194);
					arguments();
					}
				}

				_exitOPT();
				_hide();
				setState(199);
				match(COLON);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(203);
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
		enterRule(_localctx, 14, RULE_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterOPT();
			setState(211);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(210);
				properties();
				}
			}

			_exitOPT();
			setState(214);
			constructor();
			_enterOPT();
			setState(217);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(216);
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
		enterRule(_localctx, 16, RULE_contractum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(223);
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
		enterRule(_localctx, 18, RULE_annotations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterOOM();
			setState(229); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(228);
					annotation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(231); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 20, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(238);
			match(AT);
			setState(239);
			constructor();
			_enterOPT();
			setState(242);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(241);
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
		public BindersContext binders() {
			return getRuleContext(BindersContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
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
		enterRule(_localctx, 22, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterOPT();
			setState(250);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(249);
				binders();
				}
				break;
			}
			_exitOPT();
			_enterOPT();
			setState(255);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(254);
				annotations();
				}
				break;
			}
			_exitOPT();
			_enterOPT();
			setState(260);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(259);
				properties();
				}
				break;
			}
			_exitOPT();
			setState(263);
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

	public static class FreeTermContext extends ParserRuleContext {
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
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
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
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
		enterRule(_localctx, 24, RULE_freeTerm);
		int _la;
		try {
			setState(312);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(267);
				constructor();
				_enterOPT();
				setState(270);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(269);
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
				setState(276);
				constructor();
				setState(277);
				term();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(281);
				literal();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(285);
				list();
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				setState(289);
				variable();
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_enterAlt("6");
				setState(293);
				properties();
				_exitAlt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				_enterAlt("7");
				setState(297);
				match(METAVAR);
				_enterOPT();
				setState(300);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(299);
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
				setState(305);
				concrete();
				_exitAlt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				_enterAlt("9");
				setState(309);
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

	public static class BindersContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(CrsxTermParser.VARIABLE, 0); }
		public BindersContext binders() {
			return getRuleContext(BindersContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public LinearContext linear() {
			return getRuleContext(LinearContext.class,0);
		}
		public FunctionalContext functional() {
			return getRuleContext(FunctionalContext.class,0);
		}
		public VarsortContext varsort() {
			return getRuleContext(VarsortContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CrsxTermParser.DOT, 0); }
		public BindersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binders; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterBinders(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitBinders(this);
		}
	}

	public final BindersContext binders() throws RecognitionException {
		BindersContext _localctx = new BindersContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_binders);
		int _la;
		try {
			setState(347);
			switch (_input.LA(1)) {
			case AT:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_enterOPT();
				setState(317);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(316);
					annotations();
					}
				}

				_exitOPT();
				_enterBinder("x");
				setState(321);
				match(VARIABLE);
				_exitBinder();
				_enterOPT();
				setState(325);
				_la = _input.LA(1);
				if (_la==LINEAR) {
					{
					setState(324);
					linear();
					}
				}

				_exitOPT();
				_enterOPT();
				setState(330);
				_la = _input.LA(1);
				if (_la==FUNCTIONAL) {
					{
					setState(329);
					functional();
					}
				}

				_exitOPT();
				_enterOPT();
				setState(335);
				_la = _input.LA(1);
				if (_la==COLONCOLON) {
					{
					setState(334);
					varsort();
					}
				}

				_exitOPT();
				_enterBinds(" x");
				setState(339);
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
				setState(345);
				match(DOT);
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
		enterRule(_localctx, 28, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(351);
			match(LSQUARE);
			_enterOPT();
			setState(354);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPATCH) | (1L << COLON) | (1L << LPAR) | (1L << LBRACE) | (1L << DOT) | (1L << AT) | (1L << CATEGORY) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(353);
				terms();
				}
			}

			_exitOPT();
			_hide();
			setState(358);
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
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CrsxTermParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CrsxTermParser.COMMA, i);
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
		enterRule(_localctx, 30, RULE_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(363);
			term();
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				_hide();
				setState(365);
				match(COMMA);
				setState(366);
				term();
				}
				}
				setState(371);
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
		enterRule(_localctx, 32, RULE_freeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(377);
			match(LSQUARE);
			_enterOPT();
			setState(380);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPATCH) | (1L << COLON) | (1L << LPAR) | (1L << LBRACE) | (1L << AT) | (1L << CATEGORY) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(379);
				freeTerms();
				}
			}

			_exitOPT();
			_hide();
			setState(384);
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
		public List<FreeTermContext> freeTerm() {
			return getRuleContexts(FreeTermContext.class);
		}
		public FreeTermContext freeTerm(int i) {
			return getRuleContext(FreeTermContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CrsxTermParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CrsxTermParser.COMMA, i);
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
		enterRule(_localctx, 34, RULE_freeTerms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(389);
			freeTerm();
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				_hide();
				setState(391);
				match(COMMA);
				setState(392);
				freeTerm();
				}
				}
				setState(397);
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
		enterRule(_localctx, 36, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(403);
			match(LPAR);
			_enterOPT();
			setState(406);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPATCH) | (1L << COLON) | (1L << LPAR) | (1L << LBRACE) | (1L << DOT) | (1L << AT) | (1L << CATEGORY) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(405);
				termList();
				}
			}

			_exitOPT();
			_hide();
			setState(410);
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
		public List<ListItemContext> listItem() {
			return getRuleContexts(ListItemContext.class);
		}
		public ListItemContext listItem(int i) {
			return getRuleContext(ListItemContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CrsxTermParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CrsxTermParser.SEMI, i);
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
		enterRule(_localctx, 38, RULE_termList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(415);
			listItem();
			setState(421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					_hide();
					setState(417);
					match(SEMI);
					setState(418);
					listItem();
					}
					} 
				}
				setState(423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			_exitZOM();
			_enterOPT();
			setState(427);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(426);
				match(SEMI);
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

	public static class ListItemContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitListItem(this);
		}
	}

	public final ListItemContext listItem() throws RecognitionException {
		ListItemContext _localctx = new ListItemContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_listItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(433);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(CrsxTermParser.VARIABLE, 0); }
		public LinearContext linear() {
			return getRuleContext(LinearContext.class,0);
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
		enterRule(_localctx, 42, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterSymbol();
			setState(438);
			match(VARIABLE);
			_exitSymbol();
			_enterOPT();
			setState(442);
			_la = _input.LA(1);
			if (_la==LINEAR) {
				{
				setState(441);
				linear();
				}
			}

			_exitOPT();
			_enterOPT();
			setState(447);
			_la = _input.LA(1);
			if (_la==FUNCTIONAL) {
				{
				setState(446);
				functional();
				}
			}

			_exitOPT();
			_enterOPT();
			setState(452);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(451);
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
		enterRule(_localctx, 44, RULE_linear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(459);
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
		enterRule(_localctx, 46, RULE_functional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(464);
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
		enterRule(_localctx, 48, RULE_literal);
		try {
			setState(473);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(468);
				match(STRING);
				_exitAlt();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(471);
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
		enterRule(_localctx, 50, RULE_varsort);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(477);
			match(COLONCOLON);
			setState(478);
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
		enterRule(_localctx, 52, RULE_concrete);
		try {
			setState(497);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(482);
				match(CATEGORY);
				setState(483);
				match(CONCRETE);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(486);
				match(CATEGORY);
				setState(487);
				match(CONCRETE2);
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(490);
				match(CATEGORY);
				setState(491);
				match(CONCRETE3);
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(494);
				match(CATEGORY);
				setState(495);
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
		enterRule(_localctx, 54, RULE_dispatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(501);
			match(DISPATCH);
			setState(502);
			dispatchTerm();
			setState(503);
			dispatchCases();
			_enterOPT();
			setState(506);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(505);
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
		enterRule(_localctx, 56, RULE_dispatchTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(512);
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
		public List<DispatchCaseContext> dispatchCase() {
			return getRuleContexts(DispatchCaseContext.class);
		}
		public DispatchCaseContext dispatchCase(int i) {
			return getRuleContext(DispatchCaseContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CrsxTermParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CrsxTermParser.SEMI, i);
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
		enterRule(_localctx, 58, RULE_dispatchCases);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(517);
			dispatchCase();
			setState(523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					_hide();
					setState(519);
					match(SEMI);
					setState(520);
					dispatchCase();
					}
					} 
				}
				setState(525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		enterRule(_localctx, 60, RULE_dispatchCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(530);
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
		enterRule(_localctx, 62, RULE_delayCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(535);
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
		enterRule(_localctx, 64, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(540);
			match(LBRACE);
			_enterOPT();
			setState(543);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << NOT) | (1L << AT) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING))) != 0)) {
				{
				setState(542);
				propertyList();
				}
			}

			_exitOPT();
			_hide();
			setState(547);
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
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CrsxTermParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CrsxTermParser.SEMI, i);
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
		enterRule(_localctx, 66, RULE_propertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(552);
			property();
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				_hide();
				setState(554);
				match(SEMI);
				setState(555);
				property();
				}
				}
				setState(560);
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
		enterRule(_localctx, 68, RULE_property);
		try {
			setState(616);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(565);
				match(METAVAR);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(569);
				match(NOT);
				setState(570);
				match(METAVAR);
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(573);
				match(METAVAR);
				_hide();
				setState(575);
				match(COLON);
				setState(576);
				freeTerm();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(580);
				match(VARIABLE);
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				_hide();
				setState(584);
				match(NOT);
				setState(585);
				match(VARIABLE);
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_enterAlt("6");
				setState(588);
				match(VARIABLE);
				_hide();
				setState(590);
				match(COLON);
				setState(591);
				freeTerm();
				_exitAlt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				_enterAlt("7");
				setState(595);
				match(STRING);
				_exitAlt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				_enterAlt("8");
				_hide();
				setState(599);
				match(NOT);
				setState(600);
				match(STRING);
				_exitAlt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				_enterAlt("9");
				setState(603);
				match(STRING);
				_hide();
				setState(605);
				match(COLON);
				setState(606);
				freeTerm();
				_exitAlt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				_enterAlt("10");
				setState(610);
				constructor();
				_hide();
				setState(612);
				match(COLON);
				setState(613);
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
		enterRule(_localctx, 70, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(619);
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
		enterRule(_localctx, 72, RULE_sortDeclaration);
		int _la;
		try {
			setState(652);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_enterOPT();
				setState(625);
				_la = _input.LA(1);
				if (_la==FORALL) {
					{
					setState(624);
					sortparams();
					}
				}

				_exitOPT();
				setState(628);
				sortset();
				setState(629);
				sortname();
				_hide();
				setState(631);
				match(DATASORT);
				_hide();
				setState(633);
				match(LPAR);
				setState(634);
				forms();
				_hide();
				setState(636);
				match(RPAR);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_enterOPT();
				setState(642);
				_la = _input.LA(1);
				if (_la==FORALL) {
					{
					setState(641);
					sortparams();
					}
				}

				_exitOPT();
				setState(645);
				sortset();
				setState(646);
				form();
				_hide();
				setState(648);
				match(COLONCOLON);
				setState(649);
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
		enterRule(_localctx, 74, RULE_sortparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(656);
			match(FORALL);
			_enterOOM();
			setState(659); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(658);
				variable();
				}
				}
				setState(661); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARIABLE );
			_exitOOM();
			_hide();
			setState(665);
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
		enterRule(_localctx, 76, RULE_sortset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterOPT();
			setState(671);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(670);
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
		public List<SortnameContext> sortname() {
			return getRuleContexts(SortnameContext.class);
		}
		public SortnameContext sortname(int i) {
			return getRuleContext(SortnameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CrsxTermParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CrsxTermParser.COMMA, i);
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
		enterRule(_localctx, 78, RULE_sortnames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(678);
			sortname();
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				_hide();
				setState(680);
				match(COMMA);
				setState(681);
				sortname();
				}
				}
				setState(686);
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
		enterRule(_localctx, 80, RULE_sortname);
		int _la;
		try {
			setState(703);
			switch (_input.LA(1)) {
			case COLON:
			case AT:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(691);
				constructor();
				_enterOPT();
				setState(694);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(693);
					sortarguments();
					}
				}

				_exitOPT();
				_exitAlt();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(700);
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
		enterRule(_localctx, 82, RULE_sortarguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(707);
			match(LSQUARE);
			_enterOPT();
			setState(710);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << AT) | (1L << CONSTRUCTOR) | (1L << VARIABLE))) != 0)) {
				{
				setState(709);
				sortnames();
				}
			}

			_exitOPT();
			_hide();
			setState(714);
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
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CrsxTermParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CrsxTermParser.SEMI, i);
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
		enterRule(_localctx, 84, RULE_forms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << AT) | (1L << CONSTRUCTOR) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(719);
				form();
				_hide();
				setState(721);
				match(SEMI);
				}
				}
				setState(727);
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
		enterRule(_localctx, 86, RULE_form);
		int _la;
		try {
			setState(744);
			switch (_input.LA(1)) {
			case COLON:
			case AT:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(732);
				constructor();
				_enterOPT();
				setState(735);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(734);
					arguments();
					}
				}

				_exitOPT();
				_exitAlt();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(741);
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
		enterRule(_localctx, 88, RULE_constructor);
		try {
			setState(755);
			switch (_input.LA(1)) {
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(747);
				qualifier();
				setState(748);
				match(CONSTRUCTOR);
				_exitAlt();
				}
				break;
			case COLON:
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(752);
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
		enterRule(_localctx, 90, RULE_qualifier);
		try {
			setState(766);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(758);
				match(CONSTRUCTOR);
				_hide();
				setState(760);
				match(DOT);
				setState(761);
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
		enterRule(_localctx, 92, RULE_reserved);
		try {
			setState(776);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_hide();
				setState(770);
				match(COLON);
				_exitAlt();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(774);
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
		enterRule(_localctx, 94, RULE_directive);
		int _la;
		try {
			setState(799);
			switch (_input.LA(1)) {
			case COLON:
			case AT:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(779);
				constructor();
				_enterOPT();
				setState(782);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(781);
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
				setState(788);
				directiveList();
				_exitAlt();
				}
				break;
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(792);
				literal();
				_exitAlt();
				}
				break;
			case CATEGORY:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(796);
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
		enterRule(_localctx, 96, RULE_directiveArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(803);
			match(LSQUARE);
			_enterOPT();
			setState(806);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << LPAR) | (1L << AT) | (1L << CATEGORY) | (1L << CONSTRUCTOR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(805);
				directives();
				}
			}

			_exitOPT();
			_hide();
			setState(810);
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
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CrsxTermParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CrsxTermParser.COMMA, i);
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
		enterRule(_localctx, 98, RULE_directives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(815);
			directive();
			setState(821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				_hide();
				setState(817);
				match(COMMA);
				setState(818);
				directive();
				}
				}
				setState(823);
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

	public static class DirectiveListContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(CrsxTermParser.LPAR, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CrsxTermParser.RPAR, 0); }
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
		enterRule(_localctx, 100, RULE_directiveList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(829);
			match(LPAR);
			setState(830);
			declarations();
			_hide();
			setState(832);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u0346\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3s\n\3\f\3\16\3v\13\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0091\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b4\n\6\3\7\3\7\3\7\5\7\u00b9"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u00c6\n\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00d1\n\b\3\t\3\t\3\t\5\t\u00d6\n\t\3"+
		"\t\3\t\3\t\3\t\5\t\u00dc\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\6\13\u00e8\n\13\r\13\16\13\u00e9\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u00f5\n\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00fd\n\r\3\r\3\r\3\r\5\r"+
		"\u0102\n\r\3\r\3\r\3\r\5\r\u0107\n\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\5\16\u0111\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u012f\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u013b\n\16\3\17\3\17\3\17\5\17\u0140\n\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u0148\n\17\3\17\3\17\3\17\5\17\u014d\n\17"+
		"\3\17\3\17\3\17\5\17\u0152\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u015e\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u0165\n\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0172\n\21"+
		"\f\21\16\21\u0175\13\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u017f"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u018c"+
		"\n\23\f\23\16\23\u018f\13\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5"+
		"\24\u0199\n\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u01a6\n\25\f\25\16\25\u01a9\13\25\3\25\3\25\3\25\5\25\u01ae\n\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u01bd\n\27\3\27\3\27\3\27\5\27\u01c2\n\27\3\27\3\27\3\27\5\27\u01c7\n"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\5\32\u01dc\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u01f4\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u01fd\n\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\7\37\u020c\n\37\f\37\16\37\u020f\13\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\5\"\u0222\n\"\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3#\3#\7#\u022f\n#\f#\16#\u0232\13#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\5$\u026b\n$\3%\3%\3%\3%\3&\3&\3&\5&\u0274\n&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0285\n&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u028f"+
		"\n&\3\'\3\'\3\'\3\'\3\'\6\'\u0296\n\'\r\'\16\'\u0297\3\'\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\5(\u02a2\n(\3(\3(\3(\3)\3)\3)\3)\3)\3)\7)\u02ad\n)\f)\16)"+
		"\u02b0\13)\3)\3)\3)\3*\3*\3*\3*\5*\u02b9\n*\3*\3*\3*\3*\3*\3*\3*\5*\u02c2"+
		"\n*\3+\3+\3+\3+\3+\5+\u02c9\n+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\7,\u02d6"+
		"\n,\f,\16,\u02d9\13,\3,\3,\3,\3-\3-\3-\3-\5-\u02e2\n-\3-\3-\3-\3-\3-\3"+
		"-\3-\5-\u02eb\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u02f6\n.\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\5/\u0301\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60"+
		"\u030b\n\60\3\61\3\61\3\61\3\61\5\61\u0311\n\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0322\n\61"+
		"\3\62\3\62\3\62\3\62\3\62\5\62\u0329\n\62\3\62\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\7\63\u0336\n\63\f\63\16\63\u0339\13\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\2\2\65\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdf\2\2\u0363\2h\3\2\2\2\4l\3\2\2\2\6\u0090\3\2\2\2\b\u0092\3\2\2"+
		"\2\n\u00b3\3\2\2\2\f\u00b5\3\2\2\2\16\u00d0\3\2\2\2\20\u00d2\3\2\2\2\22"+
		"\u00e0\3\2\2\2\24\u00e4\3\2\2\2\26\u00ee\3\2\2\2\30\u00f9\3\2\2\2\32\u013a"+
		"\3\2\2\2\34\u015d\3\2\2\2\36\u015f\3\2\2\2 \u016b\3\2\2\2\"\u0179\3\2"+
		"\2\2$\u0185\3\2\2\2&\u0193\3\2\2\2(\u019f\3\2\2\2*\u01b2\3\2\2\2,\u01b6"+
		"\3\2\2\2.\u01cb\3\2\2\2\60\u01d0\3\2\2\2\62\u01db\3\2\2\2\64\u01dd\3\2"+
		"\2\2\66\u01f3\3\2\2\28\u01f5\3\2\2\2:\u0201\3\2\2\2<\u0205\3\2\2\2>\u0213"+
		"\3\2\2\2@\u0217\3\2\2\2B\u021c\3\2\2\2D\u0228\3\2\2\2F\u026a\3\2\2\2H"+
		"\u026c\3\2\2\2J\u028e\3\2\2\2L\u0290\3\2\2\2N\u029e\3\2\2\2P\u02a6\3\2"+
		"\2\2R\u02c1\3\2\2\2T\u02c3\3\2\2\2V\u02cf\3\2\2\2X\u02ea\3\2\2\2Z\u02f5"+
		"\3\2\2\2\\\u0300\3\2\2\2^\u030a\3\2\2\2`\u0321\3\2\2\2b\u0323\3\2\2\2"+
		"d\u032f\3\2\2\2f\u033d\3\2\2\2hi\b\2\1\2ij\5\4\3\2jk\b\2\1\2k\3\3\2\2"+
		"\2lm\b\3\1\2mn\b\3\1\2nt\5\6\4\2op\b\3\1\2pq\7\21\2\2qs\5\6\4\2ro\3\2"+
		"\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\b\3\1\2xy\b\3"+
		"\1\2y\5\3\2\2\2z{\b\4\1\2{|\5\b\5\2|}\b\4\1\2}\u0091\3\2\2\2~\177\b\4"+
		"\1\2\177\u0080\5\n\6\2\u0080\u0081\b\4\1\2\u0081\u0091\3\2\2\2\u0082\u0083"+
		"\b\4\1\2\u0083\u0084\5\f\7\2\u0084\u0085\b\4\1\2\u0085\u0091\3\2\2\2\u0086"+
		"\u0087\b\4\1\2\u0087\u0088\5J&\2\u0088\u0089\b\4\1\2\u0089\u0091\3\2\2"+
		"\2\u008a\u008b\b\4\1\2\u008b\u008c\5`\61\2\u008c\u008d\b\4\1\2\u008d\u0091"+
		"\3\2\2\2\u008e\u008f\b\4\1\2\u008f\u0091\b\4\1\2\u0090z\3\2\2\2\u0090"+
		"~\3\2\2\2\u0090\u0082\3\2\2\2\u0090\u0086\3\2\2\2\u0090\u008a\3\2\2\2"+
		"\u0090\u008e\3\2\2\2\u0091\7\3\2\2\2\u0092\u0093\b\5\1\2\u0093\u0094\b"+
		"\5\1\2\u0094\u0095\7\3\2\2\u0095\u0096\7 \2\2\u0096\u0097\b\5\1\2\u0097"+
		"\u0098\7\r\2\2\u0098\u0099\5\4\3\2\u0099\u009a\b\5\1\2\u009a\u009b\7\16"+
		"\2\2\u009b\u009c\b\5\1\2\u009c\t\3\2\2\2\u009d\u009e\b\6\1\2\u009e\u009f"+
		"\b\6\1\2\u009f\u00a0\7\4\2\2\u00a0\u00a1\5Z.\2\u00a1\u00a2\b\6\1\2\u00a2"+
		"\u00b4\3\2\2\2\u00a3\u00a4\b\6\1\2\u00a4\u00a5\b\6\1\2\u00a5\u00a6\7\4"+
		"\2\2\u00a6\u00a7\b\6\1\2\u00a7\u00a8\7\3\2\2\u00a8\u00a9\5Z.\2\u00a9\u00aa"+
		"\b\6\1\2\u00aa\u00b4\3\2\2\2\u00ab\u00ac\b\6\1\2\u00ac\u00ad\b\6\1\2\u00ad"+
		"\u00ae\7\4\2\2\u00ae\u00af\b\6\1\2\u00af\u00b0\7\7\2\2\u00b0\u00b1\5Z"+
		".\2\u00b1\u00b2\b\6\1\2\u00b2\u00b4\3\2\2\2\u00b3\u009d\3\2\2\2\u00b3"+
		"\u00a3\3\2\2\2\u00b3\u00ab\3\2\2\2\u00b4\13\3\2\2\2\u00b5\u00b6\b\7\1"+
		"\2\u00b6\u00b8\b\7\1\2\u00b7\u00b9\5\16\b\2\u00b8\u00b7\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\b\7\1\2\u00bb\u00bc\5\20"+
		"\t\2\u00bc\u00bd\b\7\1\2\u00bd\u00be\7\t\2\2\u00be\u00bf\5\22\n\2\u00bf"+
		"\u00c0\b\7\1\2\u00c0\r\3\2\2\2\u00c1\u00c2\b\b\1\2\u00c2\u00c3\5Z.\2\u00c3"+
		"\u00c5\b\b\1\2\u00c4\u00c6\5\36\20\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3"+
		"\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\b\b\1\2\u00c8\u00c9\b\b\1\2\u00c9"+
		"\u00ca\7\b\2\2\u00ca\u00cb\b\b\1\2\u00cb\u00d1\3\2\2\2\u00cc\u00cd\b\b"+
		"\1\2\u00cd\u00ce\5\24\13\2\u00ce\u00cf\b\b\1\2\u00cf\u00d1\3\2\2\2\u00d0"+
		"\u00c1\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d1\17\3\2\2\2\u00d2\u00d3\b\t\1"+
		"\2\u00d3\u00d5\b\t\1\2\u00d4\u00d6\5B\"\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\b\t\1\2\u00d8\u00d9\5Z.\2\u00d9"+
		"\u00db\b\t\1\2\u00da\u00dc\5\36\20\2\u00db\u00da\3\2\2\2\u00db\u00dc\3"+
		"\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\b\t\1\2\u00de\u00df\b\t\1\2\u00df"+
		"\21\3\2\2\2\u00e0\u00e1\b\n\1\2\u00e1\u00e2\5\32\16\2\u00e2\u00e3\b\n"+
		"\1\2\u00e3\23\3\2\2\2\u00e4\u00e5\b\13\1\2\u00e5\u00e7\b\13\1\2\u00e6"+
		"\u00e8\5\26\f\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3"+
		"\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\b\13\1\2\u00ec"+
		"\u00ed\b\13\1\2\u00ed\25\3\2\2\2\u00ee\u00ef\b\f\1\2\u00ef\u00f0\b\f\1"+
		"\2\u00f0\u00f1\7\32\2\2\u00f1\u00f2\5Z.\2\u00f2\u00f4\b\f\1\2\u00f3\u00f5"+
		"\5\36\20\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2"+
		"\u00f6\u00f7\b\f\1\2\u00f7\u00f8\b\f\1\2\u00f8\27\3\2\2\2\u00f9\u00fa"+
		"\b\r\1\2\u00fa\u00fc\b\r\1\2\u00fb\u00fd\5\34\17\2\u00fc\u00fb\3\2\2\2"+
		"\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\b\r\1\2\u00ff\u0101"+
		"\b\r\1\2\u0100\u0102\5\24\13\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2"+
		"\u0102\u0103\3\2\2\2\u0103\u0104\b\r\1\2\u0104\u0106\b\r\1\2\u0105\u0107"+
		"\5B\"\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\b\r\1\2\u0109\u010a\5\32\16\2\u010a\u010b\b\r\1\2\u010b\31\3\2"+
		"\2\2\u010c\u010d\b\16\1\2\u010d\u010e\5Z.\2\u010e\u0110\b\16\1\2\u010f"+
		"\u0111\5\36\20\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3"+
		"\2\2\2\u0112\u0113\b\16\1\2\u0113\u0114\b\16\1\2\u0114\u013b\3\2\2\2\u0115"+
		"\u0116\b\16\1\2\u0116\u0117\5Z.\2\u0117\u0118\5\30\r\2\u0118\u0119\b\16"+
		"\1\2\u0119\u013b\3\2\2\2\u011a\u011b\b\16\1\2\u011b\u011c\5\62\32\2\u011c"+
		"\u011d\b\16\1\2\u011d\u013b\3\2\2\2\u011e\u011f\b\16\1\2\u011f\u0120\5"+
		"&\24\2\u0120\u0121\b\16\1\2\u0121\u013b\3\2\2\2\u0122\u0123\b\16\1\2\u0123"+
		"\u0124\5,\27\2\u0124\u0125\b\16\1\2\u0125\u013b\3\2\2\2\u0126\u0127\b"+
		"\16\1\2\u0127\u0128\5B\"\2\u0128\u0129\b\16\1\2\u0129\u013b\3\2\2\2\u012a"+
		"\u012b\b\16\1\2\u012b\u012c\7\"\2\2\u012c\u012e\b\16\1\2\u012d\u012f\5"+
		"\"\22\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0131\b\16\1\2\u0131\u013b\b\16\1\2\u0132\u0133\b\16\1\2\u0133\u0134"+
		"\5\66\34\2\u0134\u0135\b\16\1\2\u0135\u013b\3\2\2\2\u0136\u0137\b\16\1"+
		"\2\u0137\u0138\5H%\2\u0138\u0139\b\16\1\2\u0139\u013b\3\2\2\2\u013a\u010c"+
		"\3\2\2\2\u013a\u0115\3\2\2\2\u013a\u011a\3\2\2\2\u013a\u011e\3\2\2\2\u013a"+
		"\u0122\3\2\2\2\u013a\u0126\3\2\2\2\u013a\u012a\3\2\2\2\u013a\u0132\3\2"+
		"\2\2\u013a\u0136\3\2\2\2\u013b\33\3\2\2\2\u013c\u013d\b\17\1\2\u013d\u013f"+
		"\b\17\1\2\u013e\u0140\5\24\13\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2"+
		"\2\u0140\u0141\3\2\2\2\u0141\u0142\b\17\1\2\u0142\u0143\b\17\1\2\u0143"+
		"\u0144\7!\2\2\u0144\u0145\b\17\1\2\u0145\u0147\b\17\1\2\u0146\u0148\5"+
		".\30\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014a\b\17\1\2\u014a\u014c\b\17\1\2\u014b\u014d\5\60\31\2\u014c\u014b"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\b\17\1\2"+
		"\u014f\u0151\b\17\1\2\u0150\u0152\5\64\33\2\u0151\u0150\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\b\17\1\2\u0154\u0155\b"+
		"\17\1\2\u0155\u0156\5\34\17\2\u0156\u0157\b\17\1\2\u0157\u0158\b\17\1"+
		"\2\u0158\u015e\3\2\2\2\u0159\u015a\b\17\1\2\u015a\u015b\b\17\1\2\u015b"+
		"\u015c\7\25\2\2\u015c\u015e\b\17\1\2\u015d\u013c\3\2\2\2\u015d\u0159\3"+
		"\2\2\2\u015e\35\3\2\2\2\u015f\u0160\b\20\1\2\u0160\u0161\b\20\1\2\u0161"+
		"\u0162\7\17\2\2\u0162\u0164\b\20\1\2\u0163\u0165\5 \21\2\u0164\u0163\3"+
		"\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\b\20\1\2\u0167"+
		"\u0168\b\20\1\2\u0168\u0169\7\20\2\2\u0169\u016a\b\20\1\2\u016a\37\3\2"+
		"\2\2\u016b\u016c\b\21\1\2\u016c\u016d\b\21\1\2\u016d\u0173\5\30\r\2\u016e"+
		"\u016f\b\21\1\2\u016f\u0170\7\22\2\2\u0170\u0172\5\30\r\2\u0171\u016e"+
		"\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0177\b\21\1\2\u0177\u0178\b"+
		"\21\1\2\u0178!\3\2\2\2\u0179\u017a\b\22\1\2\u017a\u017b\b\22\1\2\u017b"+
		"\u017c\7\17\2\2\u017c\u017e\b\22\1\2\u017d\u017f\5$\23\2\u017e\u017d\3"+
		"\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\b\22\1\2\u0181"+
		"\u0182\b\22\1\2\u0182\u0183\7\20\2\2\u0183\u0184\b\22\1\2\u0184#\3\2\2"+
		"\2\u0185\u0186\b\23\1\2\u0186\u0187\b\23\1\2\u0187\u018d\5\32\16\2\u0188"+
		"\u0189\b\23\1\2\u0189\u018a\7\22\2\2\u018a\u018c\5\32\16\2\u018b\u0188"+
		"\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u0190\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191\b\23\1\2\u0191\u0192\b"+
		"\23\1\2\u0192%\3\2\2\2\u0193\u0194\b\24\1\2\u0194\u0195\b\24\1\2\u0195"+
		"\u0196\7\13\2\2\u0196\u0198\b\24\1\2\u0197\u0199\5(\25\2\u0198\u0197\3"+
		"\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\b\24\1\2\u019b"+
		"\u019c\b\24\1\2\u019c\u019d\7\f\2\2\u019d\u019e\b\24\1\2\u019e\'\3\2\2"+
		"\2\u019f\u01a0\b\25\1\2\u01a0\u01a1\b\25\1\2\u01a1\u01a7\5*\26\2\u01a2"+
		"\u01a3\b\25\1\2\u01a3\u01a4\7\21\2\2\u01a4\u01a6\5*\26\2\u01a5\u01a2\3"+
		"\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01aa\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ab\b\25\1\2\u01ab\u01ad\b"+
		"\25\1\2\u01ac\u01ae\7\21\2\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\u01b0\b\25\1\2\u01b0\u01b1\b\25\1\2\u01b1)\3\2\2"+
		"\2\u01b2\u01b3\b\26\1\2\u01b3\u01b4\5\30\r\2\u01b4\u01b5\b\26\1\2\u01b5"+
		"+\3\2\2\2\u01b6\u01b7\b\27\1\2\u01b7\u01b8\b\27\1\2\u01b8\u01b9\7!\2\2"+
		"\u01b9\u01ba\b\27\1\2\u01ba\u01bc\b\27\1\2\u01bb\u01bd\5.\30\2\u01bc\u01bb"+
		"\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\b\27\1\2"+
		"\u01bf\u01c1\b\27\1\2\u01c0\u01c2\5\60\31\2\u01c1\u01c0\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\b\27\1\2\u01c4\u01c6\b"+
		"\27\1\2\u01c5\u01c7\5\64\33\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2"+
		"\u01c7\u01c8\3\2\2\2\u01c8\u01c9\b\27\1\2\u01c9\u01ca\b\27\1\2\u01ca-"+
		"\3\2\2\2\u01cb\u01cc\b\30\1\2\u01cc\u01cd\b\30\1\2\u01cd\u01ce\7\27\2"+
		"\2\u01ce\u01cf\b\30\1\2\u01cf/\3\2\2\2\u01d0\u01d1\b\31\1\2\u01d1\u01d2"+
		"\b\31\1\2\u01d2\u01d3\7\30\2\2\u01d3\u01d4\b\31\1\2\u01d4\61\3\2\2\2\u01d5"+
		"\u01d6\b\32\1\2\u01d6\u01d7\7#\2\2\u01d7\u01dc\b\32\1\2\u01d8\u01d9\b"+
		"\32\1\2\u01d9\u01da\7$\2\2\u01da\u01dc\b\32\1\2\u01db\u01d5\3\2\2\2\u01db"+
		"\u01d8\3\2\2\2\u01dc\63\3\2\2\2\u01dd\u01de\b\33\1\2\u01de\u01df\b\33"+
		"\1\2\u01df\u01e0\7\24\2\2\u01e0\u01e1\5R*\2\u01e1\u01e2\b\33\1\2\u01e2"+
		"\65\3\2\2\2\u01e3\u01e4\b\34\1\2\u01e4\u01e5\7\33\2\2\u01e5\u01e6\7\34"+
		"\2\2\u01e6\u01f4\b\34\1\2\u01e7\u01e8\b\34\1\2\u01e8\u01e9\7\33\2\2\u01e9"+
		"\u01ea\7\35\2\2\u01ea\u01f4\b\34\1\2\u01eb\u01ec\b\34\1\2\u01ec\u01ed"+
		"\7\33\2\2\u01ed\u01ee\7\36\2\2\u01ee\u01f4\b\34\1\2\u01ef\u01f0\b\34\1"+
		"\2\u01f0\u01f1\7\33\2\2\u01f1\u01f2\7\37\2\2\u01f2\u01f4\b\34\1\2\u01f3"+
		"\u01e3\3\2\2\2\u01f3\u01e7\3\2\2\2\u01f3\u01eb\3\2\2\2\u01f3\u01ef\3\2"+
		"\2\2\u01f4\67\3\2\2\2\u01f5\u01f6\b\35\1\2\u01f6\u01f7\b\35\1\2\u01f7"+
		"\u01f8\7\5\2\2\u01f8\u01f9\5:\36\2\u01f9\u01fa\5<\37\2\u01fa\u01fc\b\35"+
		"\1\2\u01fb\u01fd\5@!\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe"+
		"\3\2\2\2\u01fe\u01ff\b\35\1\2\u01ff\u0200\b\35\1\2\u02009\3\2\2\2\u0201"+
		"\u0202\b\36\1\2\u0202\u0203\5\32\16\2\u0203\u0204\b\36\1\2\u0204;\3\2"+
		"\2\2\u0205\u0206\b\37\1\2\u0206\u0207\b\37\1\2\u0207\u020d\5> \2\u0208"+
		"\u0209\b\37\1\2\u0209\u020a\7\21\2\2\u020a\u020c\5> \2\u020b\u0208\3\2"+
		"\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"\u0210\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211\b\37\1\2\u0211\u0212\b"+
		"\37\1\2\u0212=\3\2\2\2\u0213\u0214\b \1\2\u0214\u0215\5\f\7\2\u0215\u0216"+
		"\b \1\2\u0216?\3\2\2\2\u0217\u0218\b!\1\2\u0218\u0219\b!\1\2\u0219\u021a"+
		"\7\6\2\2\u021a\u021b\b!\1\2\u021bA\3\2\2\2\u021c\u021d\b\"\1\2\u021d\u021e"+
		"\b\"\1\2\u021e\u021f\7\r\2\2\u021f\u0221\b\"\1\2\u0220\u0222\5D#\2\u0221"+
		"\u0220\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\b\""+
		"\1\2\u0224\u0225\b\"\1\2\u0225\u0226\7\16\2\2\u0226\u0227\b\"\1\2\u0227"+
		"C\3\2\2\2\u0228\u0229\b#\1\2\u0229\u022a\b#\1\2\u022a\u0230\5F$\2\u022b"+
		"\u022c\b#\1\2\u022c\u022d\7\21\2\2\u022d\u022f\5F$\2\u022e\u022b\3\2\2"+
		"\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233"+
		"\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0234\b#\1\2\u0234\u0235\b#\1\2\u0235"+
		"E\3\2\2\2\u0236\u0237\b$\1\2\u0237\u0238\7\"\2\2\u0238\u026b\b$\1\2\u0239"+
		"\u023a\b$\1\2\u023a\u023b\b$\1\2\u023b\u023c\7\26\2\2\u023c\u023d\7\""+
		"\2\2\u023d\u026b\b$\1\2\u023e\u023f\b$\1\2\u023f\u0240\7\"\2\2\u0240\u0241"+
		"\b$\1\2\u0241\u0242\7\b\2\2\u0242\u0243\5\32\16\2\u0243\u0244\b$\1\2\u0244"+
		"\u026b\3\2\2\2\u0245\u0246\b$\1\2\u0246\u0247\7!\2\2\u0247\u026b\b$\1"+
		"\2\u0248\u0249\b$\1\2\u0249\u024a\b$\1\2\u024a\u024b\7\26\2\2\u024b\u024c"+
		"\7!\2\2\u024c\u026b\b$\1\2\u024d\u024e\b$\1\2\u024e\u024f\7!\2\2\u024f"+
		"\u0250\b$\1\2\u0250\u0251\7\b\2\2\u0251\u0252\5\32\16\2\u0252\u0253\b"+
		"$\1\2\u0253\u026b\3\2\2\2\u0254\u0255\b$\1\2\u0255\u0256\7#\2\2\u0256"+
		"\u026b\b$\1\2\u0257\u0258\b$\1\2\u0258\u0259\b$\1\2\u0259\u025a\7\26\2"+
		"\2\u025a\u025b\7#\2\2\u025b\u026b\b$\1\2\u025c\u025d\b$\1\2\u025d\u025e"+
		"\7#\2\2\u025e\u025f\b$\1\2\u025f\u0260\7\b\2\2\u0260\u0261\5\32\16\2\u0261"+
		"\u0262\b$\1\2\u0262\u026b\3\2\2\2\u0263\u0264\b$\1\2\u0264\u0265\5Z.\2"+
		"\u0265\u0266\b$\1\2\u0266\u0267\7\b\2\2\u0267\u0268\5\32\16\2\u0268\u0269"+
		"\b$\1\2\u0269\u026b\3\2\2\2\u026a\u0236\3\2\2\2\u026a\u0239\3\2\2\2\u026a"+
		"\u023e\3\2\2\2\u026a\u0245\3\2\2\2\u026a\u0248\3\2\2\2\u026a\u024d\3\2"+
		"\2\2\u026a\u0254\3\2\2\2\u026a\u0257\3\2\2\2\u026a\u025c\3\2\2\2\u026a"+
		"\u0263\3\2\2\2\u026bG\3\2\2\2\u026c\u026d\b%\1\2\u026d\u026e\58\35\2\u026e"+
		"\u026f\b%\1\2\u026fI\3\2\2\2\u0270\u0271\b&\1\2\u0271\u0273\b&\1\2\u0272"+
		"\u0274\5L\'\2\u0273\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\3\2"+
		"\2\2\u0275\u0276\b&\1\2\u0276\u0277\5N(\2\u0277\u0278\5R*\2\u0278\u0279"+
		"\b&\1\2\u0279\u027a\7\23\2\2\u027a\u027b\b&\1\2\u027b\u027c\7\13\2\2\u027c"+
		"\u027d\5V,\2\u027d\u027e\b&\1\2\u027e\u027f\7\f\2\2\u027f\u0280\b&\1\2"+
		"\u0280\u028f\3\2\2\2\u0281\u0282\b&\1\2\u0282\u0284\b&\1\2\u0283\u0285"+
		"\5L\'\2\u0284\u0283\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286"+
		"\u0287\b&\1\2\u0287\u0288\5N(\2\u0288\u0289\5X-\2\u0289\u028a\b&\1\2\u028a"+
		"\u028b\7\24\2\2\u028b\u028c\5R*\2\u028c\u028d\b&\1\2\u028d\u028f\3\2\2"+
		"\2\u028e\u0270\3\2\2\2\u028e\u0281\3\2\2\2\u028fK\3\2\2\2\u0290\u0291"+
		"\b\'\1\2\u0291\u0292\b\'\1\2\u0292\u0293\7\n\2\2\u0293\u0295\b\'\1\2\u0294"+
		"\u0296\5,\27\2\u0295\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0295\3\2"+
		"\2\2\u0297\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a\b\'\1\2\u029a"+
		"\u029b\b\'\1\2\u029b\u029c\7\25\2\2\u029c\u029d\b\'\1\2\u029dM\3\2\2\2"+
		"\u029e\u029f\b(\1\2\u029f\u02a1\b(\1\2\u02a0\u02a2\5B\"\2\u02a1\u02a0"+
		"\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\b(\1\2\u02a4"+
		"\u02a5\b(\1\2\u02a5O\3\2\2\2\u02a6\u02a7\b)\1\2\u02a7\u02a8\b)\1\2\u02a8"+
		"\u02ae\5R*\2\u02a9\u02aa\b)\1\2\u02aa\u02ab\7\22\2\2\u02ab\u02ad\5R*\2"+
		"\u02ac\u02a9\3\2\2\2\u02ad\u02b0\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02af"+
		"\3\2\2\2\u02af\u02b1\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02b2\b)\1\2\u02b2"+
		"\u02b3\b)\1\2\u02b3Q\3\2\2\2\u02b4\u02b5\b*\1\2\u02b5\u02b6\5Z.\2\u02b6"+
		"\u02b8\b*\1\2\u02b7\u02b9\5T+\2\u02b8\u02b7\3\2\2\2\u02b8\u02b9\3\2\2"+
		"\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb\b*\1\2\u02bb\u02bc\b*\1\2\u02bc\u02c2"+
		"\3\2\2\2\u02bd\u02be\b*\1\2\u02be\u02bf\5,\27\2\u02bf\u02c0\b*\1\2\u02c0"+
		"\u02c2\3\2\2\2\u02c1\u02b4\3\2\2\2\u02c1\u02bd\3\2\2\2\u02c2S\3\2\2\2"+
		"\u02c3\u02c4\b+\1\2\u02c4\u02c5\b+\1\2\u02c5\u02c6\7\17\2\2\u02c6\u02c8"+
		"\b+\1\2\u02c7\u02c9\5P)\2\u02c8\u02c7\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9"+
		"\u02ca\3\2\2\2\u02ca\u02cb\b+\1\2\u02cb\u02cc\b+\1\2\u02cc\u02cd\7\20"+
		"\2\2\u02cd\u02ce\b+\1\2\u02ceU\3\2\2\2\u02cf\u02d0\b,\1\2\u02d0\u02d7"+
		"\b,\1\2\u02d1\u02d2\5X-\2\u02d2\u02d3\b,\1\2\u02d3\u02d4\7\21\2\2\u02d4"+
		"\u02d6\3\2\2\2\u02d5\u02d1\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7\u02d5\3\2"+
		"\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02da\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da"+
		"\u02db\b,\1\2\u02db\u02dc\b,\1\2\u02dcW\3\2\2\2\u02dd\u02de\b-\1\2\u02de"+
		"\u02df\5Z.\2\u02df\u02e1\b-\1\2\u02e0\u02e2\5\36\20\2\u02e1\u02e0\3\2"+
		"\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\b-\1\2\u02e4"+
		"\u02e5\b-\1\2\u02e5\u02eb\3\2\2\2\u02e6\u02e7\b-\1\2\u02e7\u02e8\5,\27"+
		"\2\u02e8\u02e9\b-\1\2\u02e9\u02eb\3\2\2\2\u02ea\u02dd\3\2\2\2\u02ea\u02e6"+
		"\3\2\2\2\u02ebY\3\2\2\2\u02ec\u02ed\b.\1\2\u02ed\u02ee\5\\/\2\u02ee\u02ef"+
		"\7 \2\2\u02ef\u02f0\b.\1\2\u02f0\u02f6\3\2\2\2\u02f1\u02f2\b.\1\2\u02f2"+
		"\u02f3\5^\60\2\u02f3\u02f4\b.\1\2\u02f4\u02f6\3\2\2\2\u02f5\u02ec\3\2"+
		"\2\2\u02f5\u02f1\3\2\2\2\u02f6[\3\2\2\2\u02f7\u02f8\b/\1\2\u02f8\u02f9"+
		"\7 \2\2\u02f9\u02fa\b/\1\2\u02fa\u02fb\7\25\2\2\u02fb\u02fc\5\\/\2\u02fc"+
		"\u02fd\b/\1\2\u02fd\u0301\3\2\2\2\u02fe\u02ff\b/\1\2\u02ff\u0301\b/\1"+
		"\2\u0300\u02f7\3\2\2\2\u0300\u02fe\3\2\2\2\u0301]\3\2\2\2\u0302\u0303"+
		"\b\60\1\2\u0303\u0304\b\60\1\2\u0304\u0305\7\b\2\2\u0305\u030b\b\60\1"+
		"\2\u0306\u0307\b\60\1\2\u0307\u0308\b\60\1\2\u0308\u0309\7\32\2\2\u0309"+
		"\u030b\b\60\1\2\u030a\u0302\3\2\2\2\u030a\u0306\3\2\2\2\u030b_\3\2\2\2"+
		"\u030c\u030d\b\61\1\2\u030d\u030e\5Z.\2\u030e\u0310\b\61\1\2\u030f\u0311"+
		"\5b\62\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\3\2\2\2\u0312"+
		"\u0313\b\61\1\2\u0313\u0314\b\61\1\2\u0314\u0322\3\2\2\2\u0315\u0316\b"+
		"\61\1\2\u0316\u0317\5f\64\2\u0317\u0318\b\61\1\2\u0318\u0322\3\2\2\2\u0319"+
		"\u031a\b\61\1\2\u031a\u031b\5\62\32\2\u031b\u031c\b\61\1\2\u031c\u0322"+
		"\3\2\2\2\u031d\u031e\b\61\1\2\u031e\u031f\5\66\34\2\u031f\u0320\b\61\1"+
		"\2\u0320\u0322\3\2\2\2\u0321\u030c\3\2\2\2\u0321\u0315\3\2\2\2\u0321\u0319"+
		"\3\2\2\2\u0321\u031d\3\2\2\2\u0322a\3\2\2\2\u0323\u0324\b\62\1\2\u0324"+
		"\u0325\b\62\1\2\u0325\u0326\7\17\2\2\u0326\u0328\b\62\1\2\u0327\u0329"+
		"\5d\63\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032a\3\2\2\2\u032a"+
		"\u032b\b\62\1\2\u032b\u032c\b\62\1\2\u032c\u032d\7\20\2\2\u032d\u032e"+
		"\b\62\1\2\u032ec\3\2\2\2\u032f\u0330\b\63\1\2\u0330\u0331\b\63\1\2\u0331"+
		"\u0337\5`\61\2\u0332\u0333\b\63\1\2\u0333\u0334\7\22\2\2\u0334\u0336\5"+
		"`\61\2\u0335\u0332\3\2\2\2\u0336\u0339\3\2\2\2\u0337\u0335\3\2\2\2\u0337"+
		"\u0338\3\2\2\2\u0338\u033a\3\2\2\2\u0339\u0337\3\2\2\2\u033a\u033b\b\63"+
		"\1\2\u033b\u033c\b\63\1\2\u033ce\3\2\2\2\u033d\u033e\b\64\1\2\u033e\u033f"+
		"\b\64\1\2\u033f\u0340\7\13\2\2\u0340\u0341\5\4\3\2\u0341\u0342\b\64\1"+
		"\2\u0342\u0343\7\f\2\2\u0343\u0344\b\64\1\2\u0344g\3\2\2\2;t\u0090\u00b3"+
		"\u00b8\u00c5\u00d0\u00d5\u00db\u00e9\u00f4\u00fc\u0101\u0106\u0110\u012e"+
		"\u013a\u013f\u0147\u014c\u0151\u015d\u0164\u0173\u017e\u018d\u0198\u01a7"+
		"\u01ad\u01bc\u01c1\u01c6\u01db\u01f3\u01fc\u020d\u0221\u0230\u026a\u0273"+
		"\u0284\u028e\u0297\u02a1\u02ae\u02b8\u02c1\u02c8\u02d7\u02e1\u02ea\u02f5"+
		"\u0300\u030a\u0310\u0321\u0328\u0337";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}