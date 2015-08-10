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
		RULE_term = 11, RULE_freeTerm = 12, RULE_boundTerm = 13, RULE_nextBinder = 14, 
		RULE_arguments = 15, RULE_terms = 16, RULE_freeArguments = 17, RULE_freeTerms = 18, 
		RULE_list = 19, RULE_termList = 20, RULE_listItem = 21, RULE_variable = 22, 
		RULE_linear = 23, RULE_functional = 24, RULE_literal = 25, RULE_binder = 26, 
		RULE_varsort = 27, RULE_concrete = 28, RULE_dispatch = 29, RULE_dispatchTerm = 30, 
		RULE_dispatchCases = 31, RULE_dispatchCase = 32, RULE_delayCase = 33, 
		RULE_properties = 34, RULE_propertyList = 35, RULE_property = 36, RULE_expression = 37, 
		RULE_sortDeclaration = 38, RULE_sortparams = 39, RULE_sortset = 40, RULE_sortnames = 41, 
		RULE_sortname = 42, RULE_sortarguments = 43, RULE_forms = 44, RULE_form = 45, 
		RULE_constructor = 46, RULE_qualifier = 47, RULE_reserved = 48, RULE_directive = 49, 
		RULE_directiveArguments = 50, RULE_directives = 51, RULE_directiveList = 52;
	public static final String[] ruleNames = {
		"crsx", "declarations", "declaration", "moduleDeclaration", "importDeclaration", 
		"ruleDeclaration", "option", "pattern", "contractum", "annotations", "annotation", 
		"term", "freeTerm", "boundTerm", "nextBinder", "arguments", "terms", "freeArguments", 
		"freeTerms", "list", "termList", "listItem", "variable", "linear", "functional", 
		"literal", "binder", "varsort", "concrete", "dispatch", "dispatchTerm", 
		"dispatchCases", "dispatchCase", "delayCase", "properties", "propertyList", 
		"property", "expression", "sortDeclaration", "sortparams", "sortset", 
		"sortnames", "sortname", "sortarguments", "forms", "form", "constructor", 
		"qualifier", "reserved", "directive", "directiveArguments", "directives", 
		"directiveList"
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
			setState(107);
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
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULE) | (1L << IMPORT) | (1L << COLON) | (1L << FORALL) | (1L << LPAR) | (1L << LBRACE) | (1L << SEMI) | (1L << LINEAR) | (1L << AT) | (1L << CATEGORY) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(112);
				declaration();
				}
				}
				setState(117);
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
		public TerminalNode SEMI() { return getToken(CrsxTermParser.SEMI, 0); }
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
			setState(155);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(122);
				moduleDeclaration();
				_hide();
				setState(124);
				match(SEMI);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(128);
				importDeclaration();
				_hide();
				setState(130);
				match(SEMI);
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(134);
				ruleDeclaration();
				_hide();
				setState(136);
				match(SEMI);
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(140);
				sortDeclaration();
				_hide();
				setState(142);
				match(SEMI);
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				setState(146);
				directive();
				_hide();
				setState(148);
				match(SEMI);
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_enterAlt("6");
				_hide();
				setState(153);
				match(SEMI);
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
			setState(159);
			match(MODULE);
			setState(160);
			match(CONSTRUCTOR);
			_hide();
			setState(162);
			match(LBRACE);
			setState(163);
			declarations();
			_hide();
			setState(165);
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
			setState(190);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_hide();
				setState(170);
				match(IMPORT);
				setState(171);
				constructor();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(176);
				match(IMPORT);
				_hide();
				setState(178);
				match(MODULE);
				setState(179);
				constructor();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				_hide();
				setState(184);
				match(IMPORT);
				_hide();
				setState(186);
				match(GRAMMAR);
				setState(187);
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
			setState(195);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(194);
				option();
				}
				break;
			}
			_exitOPT();
			setState(198);
			pattern();
			_hide();
			setState(200);
			match(ARROW);
			setState(201);
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
			setState(219);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(205);
				constructor();
				_enterOPT();
				setState(208);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(207);
					arguments();
					}
				}

				_exitOPT();
				_hide();
				setState(212);
				match(COLON);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(216);
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
			setState(224);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(223);
				properties();
				}
			}

			_exitOPT();
			setState(227);
			constructor();
			_enterOPT();
			setState(230);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(229);
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
			setState(236);
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
			setState(242); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(241);
					annotation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(244); 
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
			setState(251);
			match(AT);
			setState(252);
			constructor();
			_enterOPT();
			setState(255);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(254);
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
		enterRule(_localctx, 22, RULE_term);
		try {
			setState(268);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(261);
				freeTerm();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(265);
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
		enterRule(_localctx, 24, RULE_freeTerm);
		int _la;
		try {
			setState(386);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_enterOPT();
				setState(273);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(272);
					annotations();
					}
					break;
				}
				_exitOPT();
				_enterOPT();
				setState(278);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(277);
					properties();
					}
				}

				_exitOPT();
				setState(281);
				constructor();
				_enterOPT();
				setState(284);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(283);
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
				setState(292);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(291);
					annotations();
					}
					break;
				}
				_exitOPT();
				_enterOPT();
				setState(297);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(296);
					properties();
					}
				}

				_exitOPT();
				setState(300);
				constructor();
				setState(301);
				term();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				_enterOPT();
				setState(307);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(306);
					annotations();
					}
				}

				_exitOPT();
				_enterOPT();
				setState(312);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(311);
					properties();
					}
				}

				_exitOPT();
				setState(315);
				literal();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				_enterOPT();
				setState(321);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(320);
					annotations();
					}
				}

				_exitOPT();
				setState(324);
				list();
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				_enterOPT();
				setState(330);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(329);
					annotations();
					}
				}

				_exitOPT();
				setState(333);
				variable();
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_enterAlt("6");
				_enterOPT();
				setState(339);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(338);
					annotations();
					}
				}

				_exitOPT();
				setState(342);
				properties();
				_exitAlt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				_enterAlt("7");
				_enterOPT();
				setState(348);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(347);
					annotations();
					}
				}

				_exitOPT();
				_enterOPT();
				setState(353);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(352);
					properties();
					}
				}

				_exitOPT();
				setState(356);
				match(METAVAR);
				_enterOPT();
				setState(359);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(358);
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
				setState(366);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(365);
					annotations();
					}
				}

				_exitOPT();
				setState(369);
				concrete();
				_exitAlt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				_enterAlt("9");
				_enterOPT();
				setState(375);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(374);
					annotations();
					}
				}

				_exitOPT();
				_enterOPT();
				setState(380);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(379);
					properties();
					}
				}

				_exitOPT();
				setState(383);
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
		enterRule(_localctx, 26, RULE_boundTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(389);
			binder();
			setState(390);
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
		enterRule(_localctx, 28, RULE_nextBinder);
		try {
			setState(404);
			switch (_input.LA(1)) {
			case LINEAR:
			case AT:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(394);
				binder();
				setState(395);
				nextBinder();
				_exitAlt();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
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
		enterRule(_localctx, 30, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(408);
			match(LSQUARE);
			_enterOPT();
			setState(411);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPATCH) | (1L << COLON) | (1L << LPAR) | (1L << LBRACE) | (1L << LINEAR) | (1L << AT) | (1L << CATEGORY) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(410);
				terms();
				}
			}

			_exitOPT();
			_hide();
			setState(415);
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
		public TerminalNode COMMA() { return getToken(CrsxTermParser.COMMA, 0); }
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
		enterRule(_localctx, 32, RULE_terms);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(420);
			term();
			{
			_hide();
			setState(422);
			match(COMMA);
			setState(423);
			term();
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
		enterRule(_localctx, 34, RULE_freeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(430);
			match(LSQUARE);
			_enterOPT();
			setState(433);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPATCH) | (1L << COLON) | (1L << LPAR) | (1L << LBRACE) | (1L << LINEAR) | (1L << AT) | (1L << CATEGORY) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(432);
				freeTerms();
				}
			}

			_exitOPT();
			_hide();
			setState(437);
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
		public TerminalNode COMMA() { return getToken(CrsxTermParser.COMMA, 0); }
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
		enterRule(_localctx, 36, RULE_freeTerms);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(442);
			freeTerm();
			{
			_hide();
			setState(444);
			match(COMMA);
			setState(445);
			freeTerm();
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
		enterRule(_localctx, 38, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(452);
			match(LPAR);
			_enterOPT();
			setState(455);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPATCH) | (1L << COLON) | (1L << LPAR) | (1L << LBRACE) | (1L << LINEAR) | (1L << AT) | (1L << CATEGORY) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(454);
				termList();
				}
			}

			_exitOPT();
			_hide();
			setState(459);
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
		enterRule(_localctx, 40, RULE_termList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(464);
			listItem();
			{
			_hide();
			setState(466);
			match(SEMI);
			setState(467);
			listItem();
			}
			_exitZOM();
			_enterOPT();
			setState(472);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(471);
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
		enterRule(_localctx, 42, RULE_listItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(478);
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
		enterRule(_localctx, 44, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterOPT();
			setState(484);
			_la = _input.LA(1);
			if (_la==LINEAR) {
				{
				setState(483);
				linear();
				}
			}

			_exitOPT();
			setState(487);
			match(VARIABLE);
			_enterOPT();
			setState(490);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(489);
				linear();
				}
				break;
			}
			_exitOPT();
			_enterOPT();
			setState(495);
			_la = _input.LA(1);
			if (_la==FUNCTIONAL) {
				{
				setState(494);
				functional();
				}
			}

			_exitOPT();
			_enterOPT();
			setState(500);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(499);
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
		enterRule(_localctx, 46, RULE_linear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(507);
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
		enterRule(_localctx, 48, RULE_functional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(512);
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
		enterRule(_localctx, 50, RULE_literal);
		try {
			setState(521);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(516);
				match(STRING);
				_exitAlt();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(519);
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
		enterRule(_localctx, 52, RULE_binder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterOPT();
			setState(526);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(525);
				annotations();
				}
			}

			_exitOPT();
			setState(529);
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
		enterRule(_localctx, 54, RULE_varsort);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(534);
			match(COLONCOLON);
			setState(535);
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
		enterRule(_localctx, 56, RULE_concrete);
		try {
			setState(554);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(539);
				match(CATEGORY);
				setState(540);
				match(CONCRETE);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(543);
				match(CATEGORY);
				setState(544);
				match(CONCRETE2);
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(547);
				match(CATEGORY);
				setState(548);
				match(CONCRETE3);
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(551);
				match(CATEGORY);
				setState(552);
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
		enterRule(_localctx, 58, RULE_dispatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(558);
			match(DISPATCH);
			setState(559);
			dispatchTerm();
			setState(560);
			dispatchCases();
			_enterOPT();
			setState(563);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(562);
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
		enterRule(_localctx, 60, RULE_dispatchTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(569);
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
		public TerminalNode SEMI() { return getToken(CrsxTermParser.SEMI, 0); }
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
		enterRule(_localctx, 62, RULE_dispatchCases);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(574);
			dispatchCase();
			{
			_hide();
			setState(576);
			match(SEMI);
			setState(577);
			dispatchCase();
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
		enterRule(_localctx, 64, RULE_dispatchCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(583);
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
		enterRule(_localctx, 66, RULE_delayCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(588);
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
		enterRule(_localctx, 68, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(593);
			match(LBRACE);
			_enterOPT();
			setState(596);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << NOT) | (1L << AT) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING))) != 0)) {
				{
				setState(595);
				propertyList();
				}
			}

			_exitOPT();
			_hide();
			setState(600);
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
		public TerminalNode SEMI() { return getToken(CrsxTermParser.SEMI, 0); }
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
		enterRule(_localctx, 70, RULE_propertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(605);
			property();
			{
			_hide();
			setState(607);
			match(SEMI);
			setState(609);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << NOT) | (1L << AT) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING))) != 0)) {
				{
				setState(608);
				property();
				}
			}

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
		enterRule(_localctx, 72, RULE_property);
		try {
			setState(666);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(615);
				match(METAVAR);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(619);
				match(NOT);
				setState(620);
				match(METAVAR);
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(623);
				match(METAVAR);
				_hide();
				setState(625);
				match(COLON);
				setState(626);
				freeTerm();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(630);
				match(VARIABLE);
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				_hide();
				setState(634);
				match(NOT);
				setState(635);
				match(VARIABLE);
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_enterAlt("6");
				setState(638);
				match(VARIABLE);
				_hide();
				setState(640);
				match(COLON);
				setState(641);
				freeTerm();
				_exitAlt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				_enterAlt("7");
				setState(645);
				match(STRING);
				_exitAlt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				_enterAlt("8");
				_hide();
				setState(649);
				match(NOT);
				setState(650);
				match(STRING);
				_exitAlt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				_enterAlt("9");
				setState(653);
				match(STRING);
				_hide();
				setState(655);
				match(COLON);
				setState(656);
				freeTerm();
				_exitAlt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				_enterAlt("10");
				setState(660);
				constructor();
				_hide();
				setState(662);
				match(COLON);
				setState(663);
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
		enterRule(_localctx, 74, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(669);
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
		enterRule(_localctx, 76, RULE_sortDeclaration);
		int _la;
		try {
			setState(702);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_enterOPT();
				setState(675);
				_la = _input.LA(1);
				if (_la==FORALL) {
					{
					setState(674);
					sortparams();
					}
				}

				_exitOPT();
				setState(678);
				sortset();
				setState(679);
				sortname();
				_hide();
				setState(681);
				match(DATASORT);
				_hide();
				setState(683);
				match(LPAR);
				setState(684);
				forms();
				_hide();
				setState(686);
				match(RPAR);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_enterOPT();
				setState(692);
				_la = _input.LA(1);
				if (_la==FORALL) {
					{
					setState(691);
					sortparams();
					}
				}

				_exitOPT();
				setState(695);
				sortset();
				setState(696);
				form();
				_hide();
				setState(698);
				match(COLONCOLON);
				setState(699);
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
		enterRule(_localctx, 78, RULE_sortparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(706);
			match(FORALL);
			_enterOOM();
			setState(709); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(708);
				variable();
				}
				}
				setState(711); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINEAR || _la==VARIABLE );
			_exitOOM();
			_hide();
			setState(715);
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
		enterRule(_localctx, 80, RULE_sortset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterOPT();
			setState(721);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(720);
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
		public TerminalNode COMMA() { return getToken(CrsxTermParser.COMMA, 0); }
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
		enterRule(_localctx, 82, RULE_sortnames);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(728);
			sortname();
			{
			_hide();
			setState(730);
			match(COMMA);
			setState(731);
			sortname();
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
		enterRule(_localctx, 84, RULE_sortname);
		int _la;
		try {
			setState(749);
			switch (_input.LA(1)) {
			case COLON:
			case AT:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(737);
				constructor();
				_enterOPT();
				setState(740);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(739);
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
				setState(746);
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
		enterRule(_localctx, 86, RULE_sortarguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(753);
			match(LSQUARE);
			_enterOPT();
			setState(756);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << LINEAR) | (1L << AT) | (1L << CONSTRUCTOR) | (1L << VARIABLE))) != 0)) {
				{
				setState(755);
				sortnames();
				}
			}

			_exitOPT();
			_hide();
			setState(760);
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
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CrsxTermParser.SEMI, 0); }
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
		enterRule(_localctx, 88, RULE_forms);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			{
			setState(765);
			form();
			_hide();
			setState(767);
			match(SEMI);
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
		enterRule(_localctx, 90, RULE_form);
		int _la;
		try {
			setState(785);
			switch (_input.LA(1)) {
			case COLON:
			case AT:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(773);
				constructor();
				_enterOPT();
				setState(776);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(775);
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
				setState(782);
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
		enterRule(_localctx, 92, RULE_constructor);
		try {
			setState(796);
			switch (_input.LA(1)) {
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(788);
				qualifier();
				setState(789);
				match(CONSTRUCTOR);
				_exitAlt();
				}
				break;
			case COLON:
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(793);
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
		enterRule(_localctx, 94, RULE_qualifier);
		try {
			setState(807);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(799);
				match(CONSTRUCTOR);
				_hide();
				setState(801);
				match(DOT);
				setState(802);
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
		enterRule(_localctx, 96, RULE_reserved);
		try {
			setState(817);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_hide();
				setState(811);
				match(COLON);
				_exitAlt();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(815);
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
		enterRule(_localctx, 98, RULE_directive);
		int _la;
		try {
			setState(840);
			switch (_input.LA(1)) {
			case COLON:
			case AT:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(820);
				constructor();
				_enterOPT();
				setState(823);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(822);
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
				setState(829);
				directiveList();
				_exitAlt();
				}
				break;
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(833);
				literal();
				_exitAlt();
				}
				break;
			case CATEGORY:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(837);
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
		enterRule(_localctx, 100, RULE_directiveArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(844);
			match(LSQUARE);
			_enterOPT();
			setState(847);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << LPAR) | (1L << AT) | (1L << CATEGORY) | (1L << CONSTRUCTOR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(846);
				directives();
				}
			}

			_exitOPT();
			_hide();
			setState(851);
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
		public TerminalNode COMMA() { return getToken(CrsxTermParser.COMMA, 0); }
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
		enterRule(_localctx, 102, RULE_directives);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(856);
			directive();
			{
			_hide();
			setState(858);
			match(COMMA);
			setState(859);
			directive();
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
		enterRule(_localctx, 104, RULE_directiveList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(866);
			match(LPAR);
			setState(867);
			declarations();
			_hide();
			setState(869);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u036b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3t\n\3\f\3\16\3"+
		"w\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4\u009e\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u00c1\n\6\3\7\3\7\3\7\5\7\u00c6\n\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u00d3\n\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u00de\n\b\3\t\3\t\3\t\5\t\u00e3\n\t\3\t\3\t\3\t\3\t"+
		"\5\t\u00e9\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\6\13\u00f5\n"+
		"\13\r\13\16\13\u00f6\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0102"+
		"\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u010f\n\r\3\16\3"+
		"\16\3\16\5\16\u0114\n\16\3\16\3\16\3\16\5\16\u0119\n\16\3\16\3\16\3\16"+
		"\3\16\5\16\u011f\n\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0127\n\16\3"+
		"\16\3\16\3\16\5\16\u012c\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u0136\n\16\3\16\3\16\3\16\5\16\u013b\n\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u0144\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u014d\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0156\n\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u015f\n\16\3\16\3\16\3\16\5\16\u0164"+
		"\n\16\3\16\3\16\3\16\3\16\5\16\u016a\n\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u0171\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u017a\n\16\3\16\3"+
		"\16\3\16\5\16\u017f\n\16\3\16\3\16\3\16\3\16\5\16\u0185\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0197\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u019e\n\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\5\23\u01b4\n\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u01ca\n\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u01db\n\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\5\30\u01e7\n\30\3\30\3\30\3\30\3\30\5\30\u01ed\n\30\3\30\3"+
		"\30\3\30\5\30\u01f2\n\30\3\30\3\30\3\30\5\30\u01f7\n\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u020c\n\33\3\34\3\34\3\34\5\34\u0211\n\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u022d\n\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0236\n\37\3\37\3\37\3\37\3 \3 \3"+
		" \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\5$\u0257\n$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\5%\u0264\n%\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u029d\n&\3\'\3\'\3\'\3\'\3(\3(\3(\5(\u02a6"+
		"\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u02b7\n(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\5(\u02c1\n(\3)\3)\3)\3)\3)\6)\u02c8\n)\r)\16)\u02c9\3"+
		")\3)\3)\3)\3)\3*\3*\3*\5*\u02d4\n*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3,\3,\3,\3,\5,\u02e7\n,\3,\3,\3,\3,\3,\3,\3,\5,\u02f0\n,\3-\3-\3"+
		"-\3-\3-\5-\u02f7\n-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3"+
		"/\3/\5/\u030b\n/\3/\3/\3/\3/\3/\3/\3/\5/\u0314\n/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\5\60\u031f\n\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\5\61\u032a\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\5\62\u0334\n\62\3\63\3\63\3\63\3\63\5\63\u033a\n\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u034b"+
		"\n\63\3\64\3\64\3\64\3\64\3\64\5\64\u0352\n\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\2\2\67\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj\2\2\u0389\2l\3\2\2\2"+
		"\4p\3\2\2\2\6\u009d\3\2\2\2\b\u009f\3\2\2\2\n\u00c0\3\2\2\2\f\u00c2\3"+
		"\2\2\2\16\u00dd\3\2\2\2\20\u00df\3\2\2\2\22\u00ed\3\2\2\2\24\u00f1\3\2"+
		"\2\2\26\u00fb\3\2\2\2\30\u010e\3\2\2\2\32\u0184\3\2\2\2\34\u0186\3\2\2"+
		"\2\36\u0196\3\2\2\2 \u0198\3\2\2\2\"\u01a4\3\2\2\2$\u01ae\3\2\2\2&\u01ba"+
		"\3\2\2\2(\u01c4\3\2\2\2*\u01d0\3\2\2\2,\u01df\3\2\2\2.\u01e3\3\2\2\2\60"+
		"\u01fb\3\2\2\2\62\u0200\3\2\2\2\64\u020b\3\2\2\2\66\u020d\3\2\2\28\u0216"+
		"\3\2\2\2:\u022c\3\2\2\2<\u022e\3\2\2\2>\u023a\3\2\2\2@\u023e\3\2\2\2B"+
		"\u0248\3\2\2\2D\u024c\3\2\2\2F\u0251\3\2\2\2H\u025d\3\2\2\2J\u029c\3\2"+
		"\2\2L\u029e\3\2\2\2N\u02c0\3\2\2\2P\u02c2\3\2\2\2R\u02d0\3\2\2\2T\u02d8"+
		"\3\2\2\2V\u02ef\3\2\2\2X\u02f1\3\2\2\2Z\u02fd\3\2\2\2\\\u0313\3\2\2\2"+
		"^\u031e\3\2\2\2`\u0329\3\2\2\2b\u0333\3\2\2\2d\u034a\3\2\2\2f\u034c\3"+
		"\2\2\2h\u0358\3\2\2\2j\u0362\3\2\2\2lm\b\2\1\2mn\5\4\3\2no\b\2\1\2o\3"+
		"\3\2\2\2pq\b\3\1\2qu\b\3\1\2rt\5\6\4\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2u"+
		"v\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\b\3\1\2yz\b\3\1\2z\5\3\2\2\2{|\b\4\1\2"+
		"|}\5\b\5\2}~\b\4\1\2~\177\7\21\2\2\177\u0080\b\4\1\2\u0080\u009e\3\2\2"+
		"\2\u0081\u0082\b\4\1\2\u0082\u0083\5\n\6\2\u0083\u0084\b\4\1\2\u0084\u0085"+
		"\7\21\2\2\u0085\u0086\b\4\1\2\u0086\u009e\3\2\2\2\u0087\u0088\b\4\1\2"+
		"\u0088\u0089\5\f\7\2\u0089\u008a\b\4\1\2\u008a\u008b\7\21\2\2\u008b\u008c"+
		"\b\4\1\2\u008c\u009e\3\2\2\2\u008d\u008e\b\4\1\2\u008e\u008f\5N(\2\u008f"+
		"\u0090\b\4\1\2\u0090\u0091\7\21\2\2\u0091\u0092\b\4\1\2\u0092\u009e\3"+
		"\2\2\2\u0093\u0094\b\4\1\2\u0094\u0095\5d\63\2\u0095\u0096\b\4\1\2\u0096"+
		"\u0097\7\21\2\2\u0097\u0098\b\4\1\2\u0098\u009e\3\2\2\2\u0099\u009a\b"+
		"\4\1\2\u009a\u009b\b\4\1\2\u009b\u009c\7\21\2\2\u009c\u009e\b\4\1\2\u009d"+
		"{\3\2\2\2\u009d\u0081\3\2\2\2\u009d\u0087\3\2\2\2\u009d\u008d\3\2\2\2"+
		"\u009d\u0093\3\2\2\2\u009d\u0099\3\2\2\2\u009e\7\3\2\2\2\u009f\u00a0\b"+
		"\5\1\2\u00a0\u00a1\b\5\1\2\u00a1\u00a2\7\3\2\2\u00a2\u00a3\7 \2\2\u00a3"+
		"\u00a4\b\5\1\2\u00a4\u00a5\7\r\2\2\u00a5\u00a6\5\4\3\2\u00a6\u00a7\b\5"+
		"\1\2\u00a7\u00a8\7\16\2\2\u00a8\u00a9\b\5\1\2\u00a9\t\3\2\2\2\u00aa\u00ab"+
		"\b\6\1\2\u00ab\u00ac\b\6\1\2\u00ac\u00ad\7\4\2\2\u00ad\u00ae\5^\60\2\u00ae"+
		"\u00af\b\6\1\2\u00af\u00c1\3\2\2\2\u00b0\u00b1\b\6\1\2\u00b1\u00b2\b\6"+
		"\1\2\u00b2\u00b3\7\4\2\2\u00b3\u00b4\b\6\1\2\u00b4\u00b5\7\3\2\2\u00b5"+
		"\u00b6\5^\60\2\u00b6\u00b7\b\6\1\2\u00b7\u00c1\3\2\2\2\u00b8\u00b9\b\6"+
		"\1\2\u00b9\u00ba\b\6\1\2\u00ba\u00bb\7\4\2\2\u00bb\u00bc\b\6\1\2\u00bc"+
		"\u00bd\7\7\2\2\u00bd\u00be\5^\60\2\u00be\u00bf\b\6\1\2\u00bf\u00c1\3\2"+
		"\2\2\u00c0\u00aa\3\2\2\2\u00c0\u00b0\3\2\2\2\u00c0\u00b8\3\2\2\2\u00c1"+
		"\13\3\2\2\2\u00c2\u00c3\b\7\1\2\u00c3\u00c5\b\7\1\2\u00c4\u00c6\5\16\b"+
		"\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8"+
		"\b\7\1\2\u00c8\u00c9\5\20\t\2\u00c9\u00ca\b\7\1\2\u00ca\u00cb\7\t\2\2"+
		"\u00cb\u00cc\5\22\n\2\u00cc\u00cd\b\7\1\2\u00cd\r\3\2\2\2\u00ce\u00cf"+
		"\b\b\1\2\u00cf\u00d0\5^\60\2\u00d0\u00d2\b\b\1\2\u00d1\u00d3\5 \21\2\u00d2"+
		"\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\b\b"+
		"\1\2\u00d5\u00d6\b\b\1\2\u00d6\u00d7\7\b\2\2\u00d7\u00d8\b\b\1\2\u00d8"+
		"\u00de\3\2\2\2\u00d9\u00da\b\b\1\2\u00da\u00db\5\24\13\2\u00db\u00dc\b"+
		"\b\1\2\u00dc\u00de\3\2\2\2\u00dd\u00ce\3\2\2\2\u00dd\u00d9\3\2\2\2\u00de"+
		"\17\3\2\2\2\u00df\u00e0\b\t\1\2\u00e0\u00e2\b\t\1\2\u00e1\u00e3\5F$\2"+
		"\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5"+
		"\b\t\1\2\u00e5\u00e6\5^\60\2\u00e6\u00e8\b\t\1\2\u00e7\u00e9\5 \21\2\u00e8"+
		"\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\b\t"+
		"\1\2\u00eb\u00ec\b\t\1\2\u00ec\21\3\2\2\2\u00ed\u00ee\b\n\1\2\u00ee\u00ef"+
		"\5\32\16\2\u00ef\u00f0\b\n\1\2\u00f0\23\3\2\2\2\u00f1\u00f2\b\13\1\2\u00f2"+
		"\u00f4\b\13\1\2\u00f3\u00f5\5\26\f\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3"+
		"\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00f9\b\13\1\2\u00f9\u00fa\b\13\1\2\u00fa\25\3\2\2\2\u00fb\u00fc\b\f"+
		"\1\2\u00fc\u00fd\b\f\1\2\u00fd\u00fe\7\32\2\2\u00fe\u00ff\5^\60\2\u00ff"+
		"\u0101\b\f\1\2\u0100\u0102\5 \21\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0103\3\2\2\2\u0103\u0104\b\f\1\2\u0104\u0105\b\f\1\2\u0105"+
		"\27\3\2\2\2\u0106\u0107\b\r\1\2\u0107\u0108\5\32\16\2\u0108\u0109\b\r"+
		"\1\2\u0109\u010f\3\2\2\2\u010a\u010b\b\r\1\2\u010b\u010c\5\34\17\2\u010c"+
		"\u010d\b\r\1\2\u010d\u010f\3\2\2\2\u010e\u0106\3\2\2\2\u010e\u010a\3\2"+
		"\2\2\u010f\31\3\2\2\2\u0110\u0111\b\16\1\2\u0111\u0113\b\16\1\2\u0112"+
		"\u0114\5\24\13\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3"+
		"\2\2\2\u0115\u0116\b\16\1\2\u0116\u0118\b\16\1\2\u0117\u0119\5F$\2\u0118"+
		"\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\b\16"+
		"\1\2\u011b\u011c\5^\60\2\u011c\u011e\b\16\1\2\u011d\u011f\5 \21\2\u011e"+
		"\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\b\16"+
		"\1\2\u0121\u0122\b\16\1\2\u0122\u0185\3\2\2\2\u0123\u0124\b\16\1\2\u0124"+
		"\u0126\b\16\1\2\u0125\u0127\5\24\13\2\u0126\u0125\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\b\16\1\2\u0129\u012b\b\16\1\2"+
		"\u012a\u012c\5F$\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u012e\b\16\1\2\u012e\u012f\5^\60\2\u012f\u0130\5\30\r\2"+
		"\u0130\u0131\b\16\1\2\u0131\u0185\3\2\2\2\u0132\u0133\b\16\1\2\u0133\u0135"+
		"\b\16\1\2\u0134\u0136\5\24\13\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2"+
		"\2\u0136\u0137\3\2\2\2\u0137\u0138\b\16\1\2\u0138\u013a\b\16\1\2\u0139"+
		"\u013b\5F$\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2"+
		"\2\u013c\u013d\b\16\1\2\u013d\u013e\5\64\33\2\u013e\u013f\b\16\1\2\u013f"+
		"\u0185\3\2\2\2\u0140\u0141\b\16\1\2\u0141\u0143\b\16\1\2\u0142\u0144\5"+
		"\24\13\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0146\b\16\1\2\u0146\u0147\5(\25\2\u0147\u0148\b\16\1\2\u0148\u0185\3"+
		"\2\2\2\u0149\u014a\b\16\1\2\u014a\u014c\b\16\1\2\u014b\u014d\5\24\13\2"+
		"\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f"+
		"\b\16\1\2\u014f\u0150\5.\30\2\u0150\u0151\b\16\1\2\u0151\u0185\3\2\2\2"+
		"\u0152\u0153\b\16\1\2\u0153\u0155\b\16\1\2\u0154\u0156\5\24\13\2\u0155"+
		"\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\b\16"+
		"\1\2\u0158\u0159\5F$\2\u0159\u015a\b\16\1\2\u015a\u0185\3\2\2\2\u015b"+
		"\u015c\b\16\1\2\u015c\u015e\b\16\1\2\u015d\u015f\5\24\13\2\u015e\u015d"+
		"\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\b\16\1\2"+
		"\u0161\u0163\b\16\1\2\u0162\u0164\5F$\2\u0163\u0162\3\2\2\2\u0163\u0164"+
		"\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\b\16\1\2\u0166\u0167\7\"\2\2"+
		"\u0167\u0169\b\16\1\2\u0168\u016a\5$\23\2\u0169\u0168\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\b\16\1\2\u016c\u0185\b\16\1\2"+
		"\u016d\u016e\b\16\1\2\u016e\u0170\b\16\1\2\u016f\u0171\5\24\13\2\u0170"+
		"\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\b\16"+
		"\1\2\u0173\u0174\5:\36\2\u0174\u0175\b\16\1\2\u0175\u0185\3\2\2\2\u0176"+
		"\u0177\b\16\1\2\u0177\u0179\b\16\1\2\u0178\u017a\5\24\13\2\u0179\u0178"+
		"\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\b\16\1\2"+
		"\u017c\u017e\b\16\1\2\u017d\u017f\5F$\2\u017e\u017d\3\2\2\2\u017e\u017f"+
		"\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\b\16\1\2\u0181\u0182\5L\'\2\u0182"+
		"\u0183\b\16\1\2\u0183\u0185\3\2\2\2\u0184\u0110\3\2\2\2\u0184\u0123\3"+
		"\2\2\2\u0184\u0132\3\2\2\2\u0184\u0140\3\2\2\2\u0184\u0149\3\2\2\2\u0184"+
		"\u0152\3\2\2\2\u0184\u015b\3\2\2\2\u0184\u016d\3\2\2\2\u0184\u0176\3\2"+
		"\2\2\u0185\33\3\2\2\2\u0186\u0187\b\17\1\2\u0187\u0188\5\66\34\2\u0188"+
		"\u0189\5\36\20\2\u0189\u018a\b\17\1\2\u018a\35\3\2\2\2\u018b\u018c\b\20"+
		"\1\2\u018c\u018d\5\66\34\2\u018d\u018e\5\36\20\2\u018e\u018f\b\20\1\2"+
		"\u018f\u0197\3\2\2\2\u0190\u0191\b\20\1\2\u0191\u0192\b\20\1\2\u0192\u0193"+
		"\7\25\2\2\u0193\u0194\5\32\16\2\u0194\u0195\b\20\1\2\u0195\u0197\3\2\2"+
		"\2\u0196\u018b\3\2\2\2\u0196\u0190\3\2\2\2\u0197\37\3\2\2\2\u0198\u0199"+
		"\b\21\1\2\u0199\u019a\b\21\1\2\u019a\u019b\7\17\2\2\u019b\u019d\b\21\1"+
		"\2\u019c\u019e\5\"\22\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u01a0\b\21\1\2\u01a0\u01a1\b\21\1\2\u01a1\u01a2\7"+
		"\20\2\2\u01a2\u01a3\b\21\1\2\u01a3!\3\2\2\2\u01a4\u01a5\b\22\1\2\u01a5"+
		"\u01a6\b\22\1\2\u01a6\u01a7\5\30\r\2\u01a7\u01a8\b\22\1\2\u01a8\u01a9"+
		"\7\22\2\2\u01a9\u01aa\5\30\r\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\b\22\1"+
		"\2\u01ac\u01ad\b\22\1\2\u01ad#\3\2\2\2\u01ae\u01af\b\23\1\2\u01af\u01b0"+
		"\b\23\1\2\u01b0\u01b1\7\17\2\2\u01b1\u01b3\b\23\1\2\u01b2\u01b4\5&\24"+
		"\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6"+
		"\b\23\1\2\u01b6\u01b7\b\23\1\2\u01b7\u01b8\7\20\2\2\u01b8\u01b9\b\23\1"+
		"\2\u01b9%\3\2\2\2\u01ba\u01bb\b\24\1\2\u01bb\u01bc\b\24\1\2\u01bc\u01bd"+
		"\5\32\16\2\u01bd\u01be\b\24\1\2\u01be\u01bf\7\22\2\2\u01bf\u01c0\5\32"+
		"\16\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\b\24\1\2\u01c2\u01c3\b\24\1\2\u01c3"+
		"\'\3\2\2\2\u01c4\u01c5\b\25\1\2\u01c5\u01c6\b\25\1\2\u01c6\u01c7\7\13"+
		"\2\2\u01c7\u01c9\b\25\1\2\u01c8\u01ca\5*\26\2\u01c9\u01c8\3\2\2\2\u01c9"+
		"\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\b\25\1\2\u01cc\u01cd\b"+
		"\25\1\2\u01cd\u01ce\7\f\2\2\u01ce\u01cf\b\25\1\2\u01cf)\3\2\2\2\u01d0"+
		"\u01d1\b\26\1\2\u01d1\u01d2\b\26\1\2\u01d2\u01d3\5,\27\2\u01d3\u01d4\b"+
		"\26\1\2\u01d4\u01d5\7\21\2\2\u01d5\u01d6\5,\27\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d8\b\26\1\2\u01d8\u01da\b\26\1\2\u01d9\u01db\7\21\2\2\u01da\u01d9"+
		"\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\b\26\1\2"+
		"\u01dd\u01de\b\26\1\2\u01de+\3\2\2\2\u01df\u01e0\b\27\1\2\u01e0\u01e1"+
		"\5\30\r\2\u01e1\u01e2\b\27\1\2\u01e2-\3\2\2\2\u01e3\u01e4\b\30\1\2\u01e4"+
		"\u01e6\b\30\1\2\u01e5\u01e7\5\60\31\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7"+
		"\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\b\30\1\2\u01e9\u01ea\7!\2\2\u01ea"+
		"\u01ec\b\30\1\2\u01eb\u01ed\5\60\31\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed"+
		"\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\b\30\1\2\u01ef\u01f1\b\30\1\2"+
		"\u01f0\u01f2\5\62\32\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3"+
		"\3\2\2\2\u01f3\u01f4\b\30\1\2\u01f4\u01f6\b\30\1\2\u01f5\u01f7\58\35\2"+
		"\u01f6\u01f5\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9"+
		"\b\30\1\2\u01f9\u01fa\b\30\1\2\u01fa/\3\2\2\2\u01fb\u01fc\b\31\1\2\u01fc"+
		"\u01fd\b\31\1\2\u01fd\u01fe\7\27\2\2\u01fe\u01ff\b\31\1\2\u01ff\61\3\2"+
		"\2\2\u0200\u0201\b\32\1\2\u0201\u0202\b\32\1\2\u0202\u0203\7\30\2\2\u0203"+
		"\u0204\b\32\1\2\u0204\63\3\2\2\2\u0205\u0206\b\33\1\2\u0206\u0207\7#\2"+
		"\2\u0207\u020c\b\33\1\2\u0208\u0209\b\33\1\2\u0209\u020a\7$\2\2\u020a"+
		"\u020c\b\33\1\2\u020b\u0205\3\2\2\2\u020b\u0208\3\2\2\2\u020c\65\3\2\2"+
		"\2\u020d\u020e\b\34\1\2\u020e\u0210\b\34\1\2\u020f\u0211\5\24\13\2\u0210"+
		"\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\b\34"+
		"\1\2\u0213\u0214\5.\30\2\u0214\u0215\b\34\1\2\u0215\67\3\2\2\2\u0216\u0217"+
		"\b\35\1\2\u0217\u0218\b\35\1\2\u0218\u0219\7\24\2\2\u0219\u021a\5V,\2"+
		"\u021a\u021b\b\35\1\2\u021b9\3\2\2\2\u021c\u021d\b\36\1\2\u021d\u021e"+
		"\7\33\2\2\u021e\u021f\7\34\2\2\u021f\u022d\b\36\1\2\u0220\u0221\b\36\1"+
		"\2\u0221\u0222\7\33\2\2\u0222\u0223\7\35\2\2\u0223\u022d\b\36\1\2\u0224"+
		"\u0225\b\36\1\2\u0225\u0226\7\33\2\2\u0226\u0227\7\36\2\2\u0227\u022d"+
		"\b\36\1\2\u0228\u0229\b\36\1\2\u0229\u022a\7\33\2\2\u022a\u022b\7\37\2"+
		"\2\u022b\u022d\b\36\1\2\u022c\u021c\3\2\2\2\u022c\u0220\3\2\2\2\u022c"+
		"\u0224\3\2\2\2\u022c\u0228\3\2\2\2\u022d;\3\2\2\2\u022e\u022f\b\37\1\2"+
		"\u022f\u0230\b\37\1\2\u0230\u0231\7\5\2\2\u0231\u0232\5> \2\u0232\u0233"+
		"\5@!\2\u0233\u0235\b\37\1\2\u0234\u0236\5D#\2\u0235\u0234\3\2\2\2\u0235"+
		"\u0236\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0238\b\37\1\2\u0238\u0239\b"+
		"\37\1\2\u0239=\3\2\2\2\u023a\u023b\b \1\2\u023b\u023c\5\32\16\2\u023c"+
		"\u023d\b \1\2\u023d?\3\2\2\2\u023e\u023f\b!\1\2\u023f\u0240\b!\1\2\u0240"+
		"\u0241\5B\"\2\u0241\u0242\b!\1\2\u0242\u0243\7\21\2\2\u0243\u0244\5B\""+
		"\2\u0244\u0245\3\2\2\2\u0245\u0246\b!\1\2\u0246\u0247\b!\1\2\u0247A\3"+
		"\2\2\2\u0248\u0249\b\"\1\2\u0249\u024a\5\f\7\2\u024a\u024b\b\"\1\2\u024b"+
		"C\3\2\2\2\u024c\u024d\b#\1\2\u024d\u024e\b#\1\2\u024e\u024f\7\6\2\2\u024f"+
		"\u0250\b#\1\2\u0250E\3\2\2\2\u0251\u0252\b$\1\2\u0252\u0253\b$\1\2\u0253"+
		"\u0254\7\r\2\2\u0254\u0256\b$\1\2\u0255\u0257\5H%\2\u0256\u0255\3\2\2"+
		"\2\u0256\u0257\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\b$\1\2\u0259\u025a"+
		"\b$\1\2\u025a\u025b\7\16\2\2\u025b\u025c\b$\1\2\u025cG\3\2\2\2\u025d\u025e"+
		"\b%\1\2\u025e\u025f\b%\1\2\u025f\u0260\5J&\2\u0260\u0261\b%\1\2\u0261"+
		"\u0263\7\21\2\2\u0262\u0264\5J&\2\u0263\u0262\3\2\2\2\u0263\u0264\3\2"+
		"\2\2\u0264\u0265\3\2\2\2\u0265\u0266\b%\1\2\u0266\u0267\b%\1\2\u0267I"+
		"\3\2\2\2\u0268\u0269\b&\1\2\u0269\u026a\7\"\2\2\u026a\u029d\b&\1\2\u026b"+
		"\u026c\b&\1\2\u026c\u026d\b&\1\2\u026d\u026e\7\26\2\2\u026e\u026f\7\""+
		"\2\2\u026f\u029d\b&\1\2\u0270\u0271\b&\1\2\u0271\u0272\7\"\2\2\u0272\u0273"+
		"\b&\1\2\u0273\u0274\7\b\2\2\u0274\u0275\5\32\16\2\u0275\u0276\b&\1\2\u0276"+
		"\u029d\3\2\2\2\u0277\u0278\b&\1\2\u0278\u0279\7!\2\2\u0279\u029d\b&\1"+
		"\2\u027a\u027b\b&\1\2\u027b\u027c\b&\1\2\u027c\u027d\7\26\2\2\u027d\u027e"+
		"\7!\2\2\u027e\u029d\b&\1\2\u027f\u0280\b&\1\2\u0280\u0281\7!\2\2\u0281"+
		"\u0282\b&\1\2\u0282\u0283\7\b\2\2\u0283\u0284\5\32\16\2\u0284\u0285\b"+
		"&\1\2\u0285\u029d\3\2\2\2\u0286\u0287\b&\1\2\u0287\u0288\7#\2\2\u0288"+
		"\u029d\b&\1\2\u0289\u028a\b&\1\2\u028a\u028b\b&\1\2\u028b\u028c\7\26\2"+
		"\2\u028c\u028d\7#\2\2\u028d\u029d\b&\1\2\u028e\u028f\b&\1\2\u028f\u0290"+
		"\7#\2\2\u0290\u0291\b&\1\2\u0291\u0292\7\b\2\2\u0292\u0293\5\32\16\2\u0293"+
		"\u0294\b&\1\2\u0294\u029d\3\2\2\2\u0295\u0296\b&\1\2\u0296\u0297\5^\60"+
		"\2\u0297\u0298\b&\1\2\u0298\u0299\7\b\2\2\u0299\u029a\5\32\16\2\u029a"+
		"\u029b\b&\1\2\u029b\u029d\3\2\2\2\u029c\u0268\3\2\2\2\u029c\u026b\3\2"+
		"\2\2\u029c\u0270\3\2\2\2\u029c\u0277\3\2\2\2\u029c\u027a\3\2\2\2\u029c"+
		"\u027f\3\2\2\2\u029c\u0286\3\2\2\2\u029c\u0289\3\2\2\2\u029c\u028e\3\2"+
		"\2\2\u029c\u0295\3\2\2\2\u029dK\3\2\2\2\u029e\u029f\b\'\1\2\u029f\u02a0"+
		"\5<\37\2\u02a0\u02a1\b\'\1\2\u02a1M\3\2\2\2\u02a2\u02a3\b(\1\2\u02a3\u02a5"+
		"\b(\1\2\u02a4\u02a6\5P)\2\u02a5\u02a4\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"\u02a7\3\2\2\2\u02a7\u02a8\b(\1\2\u02a8\u02a9\5R*\2\u02a9\u02aa\5V,\2"+
		"\u02aa\u02ab\b(\1\2\u02ab\u02ac\7\23\2\2\u02ac\u02ad\b(\1\2\u02ad\u02ae"+
		"\7\13\2\2\u02ae\u02af\5Z.\2\u02af\u02b0\b(\1\2\u02b0\u02b1\7\f\2\2\u02b1"+
		"\u02b2\b(\1\2\u02b2\u02c1\3\2\2\2\u02b3\u02b4\b(\1\2\u02b4\u02b6\b(\1"+
		"\2\u02b5\u02b7\5P)\2\u02b6\u02b5\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8"+
		"\3\2\2\2\u02b8\u02b9\b(\1\2\u02b9\u02ba\5R*\2\u02ba\u02bb\5\\/\2\u02bb"+
		"\u02bc\b(\1\2\u02bc\u02bd\7\24\2\2\u02bd\u02be\5V,\2\u02be\u02bf\b(\1"+
		"\2\u02bf\u02c1\3\2\2\2\u02c0\u02a2\3\2\2\2\u02c0\u02b3\3\2\2\2\u02c1O"+
		"\3\2\2\2\u02c2\u02c3\b)\1\2\u02c3\u02c4\b)\1\2\u02c4\u02c5\7\n\2\2\u02c5"+
		"\u02c7\b)\1\2\u02c6\u02c8\5.\30\2\u02c7\u02c6\3\2\2\2\u02c8\u02c9\3\2"+
		"\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb"+
		"\u02cc\b)\1\2\u02cc\u02cd\b)\1\2\u02cd\u02ce\7\25\2\2\u02ce\u02cf\b)\1"+
		"\2\u02cfQ\3\2\2\2\u02d0\u02d1\b*\1\2\u02d1\u02d3\b*\1\2\u02d2\u02d4\5"+
		"F$\2\u02d3\u02d2\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5"+
		"\u02d6\b*\1\2\u02d6\u02d7\b*\1\2\u02d7S\3\2\2\2\u02d8\u02d9\b+\1\2\u02d9"+
		"\u02da\b+\1\2\u02da\u02db\5V,\2\u02db\u02dc\b+\1\2\u02dc\u02dd\7\22\2"+
		"\2\u02dd\u02de\5V,\2\u02de\u02df\3\2\2\2\u02df\u02e0\b+\1\2\u02e0\u02e1"+
		"\b+\1\2\u02e1U\3\2\2\2\u02e2\u02e3\b,\1\2\u02e3\u02e4\5^\60\2\u02e4\u02e6"+
		"\b,\1\2\u02e5\u02e7\5X-\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7"+
		"\u02e8\3\2\2\2\u02e8\u02e9\b,\1\2\u02e9\u02ea\b,\1\2\u02ea\u02f0\3\2\2"+
		"\2\u02eb\u02ec\b,\1\2\u02ec\u02ed\5.\30\2\u02ed\u02ee\b,\1\2\u02ee\u02f0"+
		"\3\2\2\2\u02ef\u02e2\3\2\2\2\u02ef\u02eb\3\2\2\2\u02f0W\3\2\2\2\u02f1"+
		"\u02f2\b-\1\2\u02f2\u02f3\b-\1\2\u02f3\u02f4\7\17\2\2\u02f4\u02f6\b-\1"+
		"\2\u02f5\u02f7\5T+\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8"+
		"\3\2\2\2\u02f8\u02f9\b-\1\2\u02f9\u02fa\b-\1\2\u02fa\u02fb\7\20\2\2\u02fb"+
		"\u02fc\b-\1\2\u02fcY\3\2\2\2\u02fd\u02fe\b.\1\2\u02fe\u02ff\b.\1\2\u02ff"+
		"\u0300\5\\/\2\u0300\u0301\b.\1\2\u0301\u0302\7\21\2\2\u0302\u0303\3\2"+
		"\2\2\u0303\u0304\b.\1\2\u0304\u0305\b.\1\2\u0305[\3\2\2\2\u0306\u0307"+
		"\b/\1\2\u0307\u0308\5^\60\2\u0308\u030a\b/\1\2\u0309\u030b\5 \21\2\u030a"+
		"\u0309\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d\b/"+
		"\1\2\u030d\u030e\b/\1\2\u030e\u0314\3\2\2\2\u030f\u0310\b/\1\2\u0310\u0311"+
		"\5.\30\2\u0311\u0312\b/\1\2\u0312\u0314\3\2\2\2\u0313\u0306\3\2\2\2\u0313"+
		"\u030f\3\2\2\2\u0314]\3\2\2\2\u0315\u0316\b\60\1\2\u0316\u0317\5`\61\2"+
		"\u0317\u0318\7 \2\2\u0318\u0319\b\60\1\2\u0319\u031f\3\2\2\2\u031a\u031b"+
		"\b\60\1\2\u031b\u031c\5b\62\2\u031c\u031d\b\60\1\2\u031d\u031f\3\2\2\2"+
		"\u031e\u0315\3\2\2\2\u031e\u031a\3\2\2\2\u031f_\3\2\2\2\u0320\u0321\b"+
		"\61\1\2\u0321\u0322\7 \2\2\u0322\u0323\b\61\1\2\u0323\u0324\7\25\2\2\u0324"+
		"\u0325\5`\61\2\u0325\u0326\b\61\1\2\u0326\u032a\3\2\2\2\u0327\u0328\b"+
		"\61\1\2\u0328\u032a\b\61\1\2\u0329\u0320\3\2\2\2\u0329\u0327\3\2\2\2\u032a"+
		"a\3\2\2\2\u032b\u032c\b\62\1\2\u032c\u032d\b\62\1\2\u032d\u032e\7\b\2"+
		"\2\u032e\u0334\b\62\1\2\u032f\u0330\b\62\1\2\u0330\u0331\b\62\1\2\u0331"+
		"\u0332\7\32\2\2\u0332\u0334\b\62\1\2\u0333\u032b\3\2\2\2\u0333\u032f\3"+
		"\2\2\2\u0334c\3\2\2\2\u0335\u0336\b\63\1\2\u0336\u0337\5^\60\2\u0337\u0339"+
		"\b\63\1\2\u0338\u033a\5f\64\2\u0339\u0338\3\2\2\2\u0339\u033a\3\2\2\2"+
		"\u033a\u033b\3\2\2\2\u033b\u033c\b\63\1\2\u033c\u033d\b\63\1\2\u033d\u034b"+
		"\3\2\2\2\u033e\u033f\b\63\1\2\u033f\u0340\5j\66\2\u0340\u0341\b\63\1\2"+
		"\u0341\u034b\3\2\2\2\u0342\u0343\b\63\1\2\u0343\u0344\5\64\33\2\u0344"+
		"\u0345\b\63\1\2\u0345\u034b\3\2\2\2\u0346\u0347\b\63\1\2\u0347\u0348\5"+
		":\36\2\u0348\u0349\b\63\1\2\u0349\u034b\3\2\2\2\u034a\u0335\3\2\2\2\u034a"+
		"\u033e\3\2\2\2\u034a\u0342\3\2\2\2\u034a\u0346\3\2\2\2\u034be\3\2\2\2"+
		"\u034c\u034d\b\64\1\2\u034d\u034e\b\64\1\2\u034e\u034f\7\17\2\2\u034f"+
		"\u0351\b\64\1\2\u0350\u0352\5h\65\2\u0351\u0350\3\2\2\2\u0351\u0352\3"+
		"\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354\b\64\1\2\u0354\u0355\b\64\1\2\u0355"+
		"\u0356\7\20\2\2\u0356\u0357\b\64\1\2\u0357g\3\2\2\2\u0358\u0359\b\65\1"+
		"\2\u0359\u035a\b\65\1\2\u035a\u035b\5d\63\2\u035b\u035c\b\65\1\2\u035c"+
		"\u035d\7\22\2\2\u035d\u035e\5d\63\2\u035e\u035f\3\2\2\2\u035f\u0360\b"+
		"\65\1\2\u0360\u0361\b\65\1\2\u0361i\3\2\2\2\u0362\u0363\b\66\1\2\u0363"+
		"\u0364\b\66\1\2\u0364\u0365\7\13\2\2\u0365\u0366\5\4\3\2\u0366\u0367\b"+
		"\66\1\2\u0367\u0368\7\f\2\2\u0368\u0369\b\66\1\2\u0369k\3\2\2\2>u\u009d"+
		"\u00c0\u00c5\u00d2\u00dd\u00e2\u00e8\u00f6\u0101\u010e\u0113\u0118\u011e"+
		"\u0126\u012b\u0135\u013a\u0143\u014c\u0155\u015e\u0163\u0169\u0170\u0179"+
		"\u017e\u0184\u0196\u019d\u01b3\u01c9\u01da\u01e6\u01ec\u01f1\u01f6\u020b"+
		"\u0210\u022c\u0235\u0256\u0263\u029c\u02a5\u02b6\u02c0\u02c9\u02d3\u02e6"+
		"\u02ef\u02f6\u030a\u0313\u031e\u0329\u0333\u0339\u034a\u0351";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}