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
		MODULE=1, DISPATCH=2, DELAY=3, COLON=4, ARROW=5, FORALL=6, LPAR=7, RPAR=8, 
		LBRACE=9, RBRACE=10, LSQUARE=11, RSQUARE=12, SEMI=13, COMMA=14, DATASORT=15, 
		COLONCOLON=16, DOT=17, NOT=18, LINEAR=19, FUNCTIONAL=20, AND=21, AT=22, 
		PERCENT=23, CONSTRUCTOR=24, VARIABLE=25, METAVAR=26, STRING=27, NUMBER=28, 
		WS=29, BLOCK_COMMENT=30, LINE_COMMENT=31, XML_COMMENT=32;
	public static final int
		RULE_crsx = 0, RULE_declarations = 1, RULE_declarations_S1 = 2, RULE_declaration = 3, 
		RULE_moduleDeclaration = 4, RULE_ruleDeclaration = 5, RULE_option = 6, 
		RULE_pattern = 7, RULE_contractum = 8, RULE_annotations = 9, RULE_annotation = 10, 
		RULE_term = 11, RULE_freeTerm = 12, RULE_boundTerm = 13, RULE_nextBinder = 14, 
		RULE_arguments = 15, RULE_terms = 16, RULE_terms_S1 = 17, RULE_freeArguments = 18, 
		RULE_freeTerms = 19, RULE_freeTerms_S1 = 20, RULE_list = 21, RULE_termList = 22, 
		RULE_termList_S1 = 23, RULE_variable = 24, RULE_linear = 25, RULE_functional = 26, 
		RULE_literal = 27, RULE_binder = 28, RULE_varsort = 29, RULE_concrete = 30, 
		RULE_dispatch = 31, RULE_dispatchTerm = 32, RULE_dispatchCases = 33, RULE_dispatchCases_S1 = 34, 
		RULE_dispatchCase = 35, RULE_delayCase = 36, RULE_properties = 37, RULE_propertyList = 38, 
		RULE_propertyList_S1 = 39, RULE_property = 40, RULE_expression = 41, RULE_sortDeclaration = 42, 
		RULE_sortparams = 43, RULE_sortset = 44, RULE_sortnames = 45, RULE_sortnames_S1 = 46, 
		RULE_sortname = 47, RULE_sortarguments = 48, RULE_forms = 49, RULE_forms_S1 = 50, 
		RULE_form = 51, RULE_constructor = 52, RULE_qualifier = 53, RULE_reserved = 54, 
		RULE_directive = 55, RULE_directiveArguments = 56, RULE_directives = 57, 
		RULE_directives_S1 = 58, RULE_directiveList = 59;
	public static final String[] ruleNames = {
		"crsx", "declarations", "declarations_S1", "declaration", "moduleDeclaration", 
		"ruleDeclaration", "option", "pattern", "contractum", "annotations", "annotation", 
		"term", "freeTerm", "boundTerm", "nextBinder", "arguments", "terms", "terms_S1", 
		"freeArguments", "freeTerms", "freeTerms_S1", "list", "termList", "termList_S1", 
		"variable", "linear", "functional", "literal", "binder", "varsort", "concrete", 
		"dispatch", "dispatchTerm", "dispatchCases", "dispatchCases_S1", "dispatchCase", 
		"delayCase", "properties", "propertyList", "propertyList_S1", "property", 
		"expression", "sortDeclaration", "sortparams", "sortset", "sortnames", 
		"sortnames_S1", "sortname", "sortarguments", "forms", "forms_S1", "form", 
		"constructor", "qualifier", "reserved", "directive", "directiveArguments", 
		"directives", "directives_S1", "directiveList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'module'", "'dispatch'", "'delay'", "':'", "'→'", "'∀'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'::='", "'::'", "'.'", 
		"'¬'", "'¹'", "'ᵇ'", "'&'", "'@'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MODULE", "DISPATCH", "DELAY", "COLON", "ARROW", "FORALL", "LPAR", 
		"RPAR", "LBRACE", "RBRACE", "LSQUARE", "RSQUARE", "SEMI", "COMMA", "DATASORT", 
		"COLONCOLON", "DOT", "NOT", "LINEAR", "FUNCTIONAL", "AND", "AT", "PERCENT", 
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
			setState(121);
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
			setState(125);
			declaration();
			_enterZOM();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(127);
				declarations_S1();
				}
				}
				setState(132);
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
			setState(137);
			match(SEMI);
			_enterOPT();
			setState(140);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULE) | (1L << COLON) | (1L << FORALL) | (1L << LPAR) | (1L << LBRACE) | (1L << DOT) | (1L << AT) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(139);
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
			setState(161);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(146);
				moduleDeclaration();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(150);
				ruleDeclaration();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(154);
				sortDeclaration();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(158);
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
			setState(164);
			match(MODULE);
			setState(165);
			match(CONSTRUCTOR);
			setState(166);
			match(LBRACE);
			setState(167);
			declarations();
			setState(168);
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
			setState(174);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(173);
				option();
				}
				break;
			}
			_exitOPT();
			setState(177);
			pattern();
			setState(178);
			match(ARROW);
			setState(179);
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
			setState(196);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(183);
				constructor();
				_enterOPT();
				setState(186);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(185);
					arguments();
					}
				}

				_exitOPT();
				setState(189);
				match(COLON);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(193);
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
			setState(201);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(200);
				properties();
				}
			}

			_exitOPT();
			setState(204);
			constructor();
			_enterOPT();
			setState(207);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(206);
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
			setState(213);
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
			setState(219); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(218);
					annotation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(221); 
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
			setState(227);
			match(AT);
			setState(228);
			constructor();
			_enterOPT();
			setState(231);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(230);
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
			setState(244);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(237);
				freeTerm();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(241);
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
			setState(367);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_enterOPT();
				setState(249);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(248);
					annotations();
					}
					break;
				}
				_exitOPT();
				_enterOPT();
				setState(254);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(253);
					properties();
					}
				}

				_exitOPT();
				setState(257);
				constructor();
				_enterOPT();
				setState(260);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(259);
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
				setState(268);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(267);
					annotations();
					}
					break;
				}
				_exitOPT();
				_enterOPT();
				setState(273);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(272);
					properties();
					}
				}

				_exitOPT();
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
				_enterOPT();
				setState(283);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(282);
					annotations();
					}
				}

				_exitOPT();
				_enterOPT();
				setState(288);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(287);
					properties();
					}
				}

				_exitOPT();
				setState(291);
				literal();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				_enterOPT();
				setState(297);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(296);
					annotations();
					}
				}

				_exitOPT();
				setState(300);
				list();
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				_enterOPT();
				setState(306);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(305);
					annotations();
					}
				}

				_exitOPT();
				setState(309);
				variable();
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_enterAlt("6");
				_enterOPT();
				setState(315);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(314);
					annotations();
					}
				}

				_exitOPT();
				setState(318);
				properties();
				_exitAlt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				_enterAlt("7");
				_enterOPT();
				setState(324);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(323);
					annotations();
					}
				}

				_exitOPT();
				_enterOPT();
				setState(329);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(328);
					properties();
					}
				}

				_exitOPT();
				setState(332);
				match(METAVAR);
				_enterOPT();
				setState(335);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(334);
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
				setState(342);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(341);
					annotations();
					}
				}

				_exitOPT();
				_enterOPT();
				setState(347);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(346);
					properties();
					}
				}

				_exitOPT();
				setState(350);
				concrete();
				_exitAlt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				_enterAlt("9");
				_enterOPT();
				setState(356);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(355);
					annotations();
					}
				}

				_exitOPT();
				_enterOPT();
				setState(361);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(360);
					properties();
					}
				}

				_exitOPT();
				setState(364);
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
			setState(370);
			binder();
			setState(371);
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
			setState(384);
			switch (_input.LA(1)) {
			case AT:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(375);
				binder();
				setState(376);
				nextBinder();
				_exitAlt();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(380);
				match(DOT);
				setState(381);
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
			setState(387);
			match(LSQUARE);
			_enterOPT();
			setState(390);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPATCH) | (1L << COLON) | (1L << LPAR) | (1L << LBRACE) | (1L << DOT) | (1L << AT) | (1L << PERCENT) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(389);
				terms();
				}
			}

			_exitOPT();
			setState(393);
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
		enterRule(_localctx, 32, RULE_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(397);
			term();
			_enterZOM();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(399);
				terms_S1();
				}
				}
				setState(404);
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
		enterRule(_localctx, 34, RULE_terms_S1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(409);
			match(COMMA);
			setState(410);
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
		enterRule(_localctx, 36, RULE_freeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(414);
			match(LSQUARE);
			_enterOPT();
			setState(417);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPATCH) | (1L << COLON) | (1L << LPAR) | (1L << LBRACE) | (1L << DOT) | (1L << AT) | (1L << PERCENT) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(416);
				freeTerms();
				}
			}

			_exitOPT();
			setState(420);
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
		enterRule(_localctx, 38, RULE_freeTerms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(424);
			freeTerm();
			_enterZOM();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(426);
				freeTerms_S1();
				}
				}
				setState(431);
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
		enterRule(_localctx, 40, RULE_freeTerms_S1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(436);
			match(COMMA);
			setState(437);
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
		enterRule(_localctx, 42, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(441);
			match(LPAR);
			_enterOPT();
			setState(444);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPATCH) | (1L << COLON) | (1L << LPAR) | (1L << LBRACE) | (1L << DOT) | (1L << AT) | (1L << PERCENT) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(443);
				termList();
				}
			}

			_exitOPT();
			setState(447);
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
		enterRule(_localctx, 44, RULE_termList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(451);
			term();
			_enterZOM();
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(453);
				termList_S1();
				}
				}
				setState(458);
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
		enterRule(_localctx, 46, RULE_termList_S1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(463);
			match(SEMI);
			_enterOPT();
			setState(466);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPATCH) | (1L << COLON) | (1L << LPAR) | (1L << LBRACE) | (1L << DOT) | (1L << AT) | (1L << PERCENT) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(465);
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
		enterRule(_localctx, 48, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(472);
			match(VARIABLE);
			_enterOPT();
			setState(475);
			_la = _input.LA(1);
			if (_la==LINEAR) {
				{
				setState(474);
				linear();
				}
			}

			_exitOPT();
			_enterOPT();
			setState(480);
			_la = _input.LA(1);
			if (_la==FUNCTIONAL) {
				{
				setState(479);
				functional();
				}
			}

			_exitOPT();
			_enterOPT();
			setState(485);
			_la = _input.LA(1);
			if (_la==COLONCOLON) {
				{
				setState(484);
				varsort();
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
		enterRule(_localctx, 50, RULE_linear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(491);
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
		enterRule(_localctx, 52, RULE_functional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(495);
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
		enterRule(_localctx, 54, RULE_literal);
		try {
			setState(504);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(499);
				match(STRING);
				_exitAlt();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(502);
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
		enterRule(_localctx, 56, RULE_binder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterOPT();
			setState(509);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(508);
				annotations();
				}
			}

			_exitOPT();
			setState(512);
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
		enterRule(_localctx, 58, RULE_varsort);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(516);
			match(COLONCOLON);
			setState(517);
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
		public TerminalNode PERCENT() { return getToken(CrsxTermParser.PERCENT, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
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
		enterRule(_localctx, 60, RULE_concrete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(521);
			match(PERCENT);
			setState(522);
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
		enterRule(_localctx, 62, RULE_dispatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(526);
			match(DISPATCH);
			setState(527);
			dispatchTerm();
			setState(528);
			dispatchCases();
			_enterOPT();
			setState(531);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(530);
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
		enterRule(_localctx, 64, RULE_dispatchTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(537);
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
		enterRule(_localctx, 66, RULE_dispatchCases);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(541);
			dispatchCase();
			_enterZOM();
			setState(546);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(543);
					dispatchCases_S1();
					}
					} 
				}
				setState(548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
		enterRule(_localctx, 68, RULE_dispatchCases_S1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(553);
			match(SEMI);
			setState(554);
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
		enterRule(_localctx, 70, RULE_dispatchCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(558);
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
		enterRule(_localctx, 72, RULE_delayCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(562);
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
		enterRule(_localctx, 74, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(566);
			match(LBRACE);
			_enterOPT();
			setState(569);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << DOT) | (1L << NOT) | (1L << AT) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING))) != 0)) {
				{
				setState(568);
				propertyList();
				}
			}

			_exitOPT();
			setState(572);
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
		enterRule(_localctx, 76, RULE_propertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(576);
			property();
			_enterZOM();
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(578);
				propertyList_S1();
				}
				}
				setState(583);
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
		enterRule(_localctx, 78, RULE_propertyList_S1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(588);
			match(SEMI);
			_enterOPT();
			setState(591);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << DOT) | (1L << NOT) | (1L << AT) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING))) != 0)) {
				{
				setState(590);
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
		enterRule(_localctx, 80, RULE_property);
		try {
			setState(641);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(597);
				match(METAVAR);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(600);
				match(NOT);
				setState(601);
				match(METAVAR);
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(604);
				match(METAVAR);
				setState(605);
				match(COLON);
				setState(606);
				freeTerm();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(610);
				match(VARIABLE);
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				setState(613);
				match(NOT);
				setState(614);
				match(VARIABLE);
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_enterAlt("6");
				setState(617);
				match(VARIABLE);
				setState(618);
				match(COLON);
				setState(619);
				freeTerm();
				_exitAlt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				_enterAlt("7");
				setState(623);
				match(STRING);
				_exitAlt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				_enterAlt("8");
				setState(626);
				match(NOT);
				setState(627);
				match(STRING);
				_exitAlt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				_enterAlt("9");
				setState(630);
				match(STRING);
				setState(631);
				match(COLON);
				setState(632);
				freeTerm();
				_exitAlt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				_enterAlt("10");
				setState(636);
				constructor();
				setState(637);
				match(COLON);
				setState(638);
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
		enterRule(_localctx, 82, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(644);
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
		enterRule(_localctx, 84, RULE_sortDeclaration);
		int _la;
		try {
			setState(673);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_enterOPT();
				setState(650);
				_la = _input.LA(1);
				if (_la==FORALL) {
					{
					setState(649);
					sortparams();
					}
				}

				_exitOPT();
				setState(653);
				sortset();
				setState(654);
				sortname();
				setState(655);
				match(DATASORT);
				setState(656);
				match(LPAR);
				setState(657);
				forms();
				setState(658);
				match(RPAR);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_enterOPT();
				setState(664);
				_la = _input.LA(1);
				if (_la==FORALL) {
					{
					setState(663);
					sortparams();
					}
				}

				_exitOPT();
				setState(667);
				sortset();
				setState(668);
				form();
				setState(669);
				match(COLONCOLON);
				setState(670);
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
		enterRule(_localctx, 86, RULE_sortparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(676);
			match(FORALL);
			_enterOOM();
			setState(679); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(678);
				variable();
				}
				}
				setState(681); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARIABLE );
			_exitOOM();
			setState(684);
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
		enterRule(_localctx, 88, RULE_sortset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterOPT();
			setState(690);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(689);
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
		enterRule(_localctx, 90, RULE_sortnames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(696);
			sortname();
			_enterZOM();
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(698);
				sortnames_S1();
				}
				}
				setState(703);
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
		enterRule(_localctx, 92, RULE_sortnames_S1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(708);
			match(COMMA);
			setState(709);
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
		enterRule(_localctx, 94, RULE_sortname);
		int _la;
		try {
			setState(725);
			switch (_input.LA(1)) {
			case COLON:
			case DOT:
			case AT:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(713);
				constructor();
				_enterOPT();
				setState(716);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(715);
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
				setState(722);
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
		enterRule(_localctx, 96, RULE_sortarguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(728);
			match(LSQUARE);
			_enterOPT();
			setState(731);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << DOT) | (1L << AT) | (1L << CONSTRUCTOR) | (1L << VARIABLE))) != 0)) {
				{
				setState(730);
				sortnames();
				}
			}

			_exitOPT();
			setState(734);
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
		enterRule(_localctx, 98, RULE_forms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << DOT) | (1L << AT) | (1L << CONSTRUCTOR))) != 0)) {
				{
				{
				setState(739);
				forms_S1();
				}
				}
				setState(744);
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
		enterRule(_localctx, 100, RULE_forms_S1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(749);
			form();
			setState(750);
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
		enterRule(_localctx, 102, RULE_form);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(754);
			constructor();
			_enterOPT();
			setState(757);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(756);
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
		enterRule(_localctx, 104, RULE_constructor);
		try {
			setState(771);
			switch (_input.LA(1)) {
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(763);
				qualifier();
				setState(764);
				match(CONSTRUCTOR);
				_exitAlt();
				}
				break;
			case COLON:
			case DOT:
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(768);
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
		enterRule(_localctx, 106, RULE_qualifier);
		try {
			setState(781);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(774);
				match(CONSTRUCTOR);
				setState(775);
				match(DOT);
				setState(776);
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
		public TerminalNode DOT() { return getToken(CrsxTermParser.DOT, 0); }
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
		enterRule(_localctx, 108, RULE_reserved);
		try {
			setState(792);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(784);
				match(COLON);
				_exitAlt();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(787);
				match(AT);
				_exitAlt();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(790);
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
		enterRule(_localctx, 110, RULE_directive);
		int _la;
		try {
			setState(811);
			switch (_input.LA(1)) {
			case COLON:
			case DOT:
			case AT:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(795);
				constructor();
				_enterOPT();
				setState(798);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(797);
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
				setState(804);
				directiveList();
				_exitAlt();
				}
				break;
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(808);
				literal();
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
		enterRule(_localctx, 112, RULE_directiveArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(814);
			match(LSQUARE);
			_enterOPT();
			setState(817);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << LPAR) | (1L << DOT) | (1L << AT) | (1L << CONSTRUCTOR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(816);
				directives();
				}
			}

			_exitOPT();
			setState(820);
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
		enterRule(_localctx, 114, RULE_directives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(824);
			directive();
			_enterZOM();
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(826);
				directives_S1();
				}
				}
				setState(831);
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
		enterRule(_localctx, 116, RULE_directives_S1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(836);
			match(COMMA);
			setState(837);
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
		enterRule(_localctx, 118, RULE_directiveList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(841);
			match(LPAR);
			_enterOPT();
			setState(844);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULE) | (1L << COLON) | (1L << FORALL) | (1L << LPAR) | (1L << LBRACE) | (1L << DOT) | (1L << AT) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(843);
				declarations();
				}
			}

			_exitOPT();
			setState(847);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u0355\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u0083\n\3\f\3\16\3\u0086\13\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u008f\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a4\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7\u00b1\n\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\5\b\u00bd\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c7"+
		"\n\b\3\t\3\t\3\t\5\t\u00cc\n\t\3\t\3\t\3\t\3\t\5\t\u00d2\n\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\6\13\u00de\n\13\r\13\16\13\u00df\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u00ea\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u00f7\n\r\3\16\3\16\3\16\5\16\u00fc\n\16\3\16\3"+
		"\16\3\16\5\16\u0101\n\16\3\16\3\16\3\16\3\16\5\16\u0107\n\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u010f\n\16\3\16\3\16\3\16\5\16\u0114\n\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u011e\n\16\3\16\3\16\3\16"+
		"\5\16\u0123\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u012c\n\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0135\n\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u013e\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u0147\n\16\3\16\3\16\3\16\5\16\u014c\n\16\3\16\3\16\3\16\3\16\5\16\u0152"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u0159\n\16\3\16\3\16\3\16\5\16\u015e"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0167\n\16\3\16\3\16\3\16"+
		"\5\16\u016c\n\16\3\16\3\16\3\16\3\16\5\16\u0172\n\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0183"+
		"\n\20\3\21\3\21\3\21\3\21\5\21\u0189\n\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\7\22\u0193\n\22\f\22\16\22\u0196\13\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u01a4\n\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\7\25\u01ae\n\25\f\25\16\25\u01b1\13\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u01bf\n\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u01c9\n\30\f\30\16\30\u01cc"+
		"\13\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u01d5\n\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\5\32\u01de\n\32\3\32\3\32\3\32\5\32\u01e3\n\32"+
		"\3\32\3\32\3\32\5\32\u01e8\n\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01fb\n\35\3\36\3\36"+
		"\3\36\5\36\u0200\n\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 "+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\5!\u0216\n!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\7#\u0223\n#\f#\16#\u0226\13#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\5\'\u023c\n\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\7(\u0246\n(\f(\16(\u0249\13(\3(\3(\3(\3)\3)\3)\3)\5)\u0252\n)"+
		"\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\5*\u0284\n*\3+\3+\3+\3+\3,\3,\3,\5,\u028d\n,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\5,\u029b\n,\3,\3,\3,\3,\3,\3,\3,\5,\u02a4\n,\3-\3-"+
		"\3-\3-\6-\u02aa\n-\r-\16-\u02ab\3-\3-\3-\3-\3.\3.\3.\5.\u02b5\n.\3.\3"+
		".\3.\3/\3/\3/\3/\7/\u02be\n/\f/\16/\u02c1\13/\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\5\61\u02cf\n\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\5\61\u02d8\n\61\3\62\3\62\3\62\3\62\5\62\u02de\n\62\3\62\3"+
		"\62\3\62\3\62\3\63\3\63\3\63\7\63\u02e7\n\63\f\63\16\63\u02ea\13\63\3"+
		"\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\5\65\u02f8"+
		"\n\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66"+
		"\u0306\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0310\n\67\3"+
		"8\38\38\38\38\38\38\38\38\58\u031b\n8\39\39\39\39\59\u0321\n9\39\39\3"+
		"9\39\39\39\39\39\39\39\39\59\u032e\n9\3:\3:\3:\3:\5:\u0334\n:\3:\3:\3"+
		":\3:\3;\3;\3;\3;\7;\u033e\n;\f;\16;\u0341\13;\3;\3;\3;\3<\3<\3<\3<\3<"+
		"\3=\3=\3=\3=\5=\u034f\n=\3=\3=\3=\3=\3=\2\2>\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\2"+
		"\2\u036e\2z\3\2\2\2\4~\3\2\2\2\6\u008a\3\2\2\2\b\u00a3\3\2\2\2\n\u00a5"+
		"\3\2\2\2\f\u00ad\3\2\2\2\16\u00c6\3\2\2\2\20\u00c8\3\2\2\2\22\u00d6\3"+
		"\2\2\2\24\u00da\3\2\2\2\26\u00e4\3\2\2\2\30\u00f6\3\2\2\2\32\u0171\3\2"+
		"\2\2\34\u0173\3\2\2\2\36\u0182\3\2\2\2 \u0184\3\2\2\2\"\u018e\3\2\2\2"+
		"$\u019a\3\2\2\2&\u019f\3\2\2\2(\u01a9\3\2\2\2*\u01b5\3\2\2\2,\u01ba\3"+
		"\2\2\2.\u01c4\3\2\2\2\60\u01d0\3\2\2\2\62\u01d9\3\2\2\2\64\u01ec\3\2\2"+
		"\2\66\u01f0\3\2\2\28\u01fa\3\2\2\2:\u01fc\3\2\2\2<\u0205\3\2\2\2>\u020a"+
		"\3\2\2\2@\u020f\3\2\2\2B\u021a\3\2\2\2D\u021e\3\2\2\2F\u022a\3\2\2\2H"+
		"\u022f\3\2\2\2J\u0233\3\2\2\2L\u0237\3\2\2\2N\u0241\3\2\2\2P\u024d\3\2"+
		"\2\2R\u0283\3\2\2\2T\u0285\3\2\2\2V\u02a3\3\2\2\2X\u02a5\3\2\2\2Z\u02b1"+
		"\3\2\2\2\\\u02b9\3\2\2\2^\u02c5\3\2\2\2`\u02d7\3\2\2\2b\u02d9\3\2\2\2"+
		"d\u02e3\3\2\2\2f\u02ee\3\2\2\2h\u02f3\3\2\2\2j\u0305\3\2\2\2l\u030f\3"+
		"\2\2\2n\u031a\3\2\2\2p\u032d\3\2\2\2r\u032f\3\2\2\2t\u0339\3\2\2\2v\u0345"+
		"\3\2\2\2x\u034a\3\2\2\2z{\b\2\1\2{|\5\4\3\2|}\b\2\1\2}\3\3\2\2\2~\177"+
		"\b\3\1\2\177\u0080\5\b\5\2\u0080\u0084\b\3\1\2\u0081\u0083\5\6\4\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\b\3\1\2\u0088"+
		"\u0089\b\3\1\2\u0089\5\3\2\2\2\u008a\u008b\b\4\1\2\u008b\u008c\7\17\2"+
		"\2\u008c\u008e\b\4\1\2\u008d\u008f\5\b\5\2\u008e\u008d\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\b\4\1\2\u0091\u0092\b\4\1\2\u0092"+
		"\7\3\2\2\2\u0093\u0094\b\5\1\2\u0094\u0095\5\n\6\2\u0095\u0096\b\5\1\2"+
		"\u0096\u00a4\3\2\2\2\u0097\u0098\b\5\1\2\u0098\u0099\5\f\7\2\u0099\u009a"+
		"\b\5\1\2\u009a\u00a4\3\2\2\2\u009b\u009c\b\5\1\2\u009c\u009d\5V,\2\u009d"+
		"\u009e\b\5\1\2\u009e\u00a4\3\2\2\2\u009f\u00a0\b\5\1\2\u00a0\u00a1\5p"+
		"9\2\u00a1\u00a2\b\5\1\2\u00a2\u00a4\3\2\2\2\u00a3\u0093\3\2\2\2\u00a3"+
		"\u0097\3\2\2\2\u00a3\u009b\3\2\2\2\u00a3\u009f\3\2\2\2\u00a4\t\3\2\2\2"+
		"\u00a5\u00a6\b\6\1\2\u00a6\u00a7\7\3\2\2\u00a7\u00a8\7\32\2\2\u00a8\u00a9"+
		"\7\13\2\2\u00a9\u00aa\5\4\3\2\u00aa\u00ab\7\f\2\2\u00ab\u00ac\b\6\1\2"+
		"\u00ac\13\3\2\2\2\u00ad\u00ae\b\7\1\2\u00ae\u00b0\b\7\1\2\u00af\u00b1"+
		"\5\16\b\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2"+
		"\u00b2\u00b3\b\7\1\2\u00b3\u00b4\5\20\t\2\u00b4\u00b5\7\7\2\2\u00b5\u00b6"+
		"\5\22\n\2\u00b6\u00b7\b\7\1\2\u00b7\r\3\2\2\2\u00b8\u00b9\b\b\1\2\u00b9"+
		"\u00ba\5j\66\2\u00ba\u00bc\b\b\1\2\u00bb\u00bd\5 \21\2\u00bc\u00bb\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\b\b\1\2\u00bf"+
		"\u00c0\7\6\2\2\u00c0\u00c1\b\b\1\2\u00c1\u00c7\3\2\2\2\u00c2\u00c3\b\b"+
		"\1\2\u00c3\u00c4\5\24\13\2\u00c4\u00c5\b\b\1\2\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u00b8\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c7\17\3\2\2\2\u00c8\u00c9\b\t\1"+
		"\2\u00c9\u00cb\b\t\1\2\u00ca\u00cc\5L\'\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\b\t\1\2\u00ce\u00cf\5j\66\2\u00cf"+
		"\u00d1\b\t\1\2\u00d0\u00d2\5 \21\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\b\t\1\2\u00d4\u00d5\b\t\1\2\u00d5"+
		"\21\3\2\2\2\u00d6\u00d7\b\n\1\2\u00d7\u00d8\5\32\16\2\u00d8\u00d9\b\n"+
		"\1\2\u00d9\23\3\2\2\2\u00da\u00db\b\13\1\2\u00db\u00dd\b\13\1\2\u00dc"+
		"\u00de\5\26\f\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3"+
		"\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\b\13\1\2\u00e2"+
		"\u00e3\b\13\1\2\u00e3\25\3\2\2\2\u00e4\u00e5\b\f\1\2\u00e5\u00e6\7\30"+
		"\2\2\u00e6\u00e7\5j\66\2\u00e7\u00e9\b\f\1\2\u00e8\u00ea\5 \21\2\u00e9"+
		"\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\b\f"+
		"\1\2\u00ec\u00ed\b\f\1\2\u00ed\27\3\2\2\2\u00ee\u00ef\b\r\1\2\u00ef\u00f0"+
		"\5\32\16\2\u00f0\u00f1\b\r\1\2\u00f1\u00f7\3\2\2\2\u00f2\u00f3\b\r\1\2"+
		"\u00f3\u00f4\5\34\17\2\u00f4\u00f5\b\r\1\2\u00f5\u00f7\3\2\2\2\u00f6\u00ee"+
		"\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f7\31\3\2\2\2\u00f8\u00f9\b\16\1\2\u00f9"+
		"\u00fb\b\16\1\2\u00fa\u00fc\5\24\13\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\b\16\1\2\u00fe\u0100\b\16\1\2"+
		"\u00ff\u0101\5L\'\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0103\b\16\1\2\u0103\u0104\5j\66\2\u0104\u0106\b\16\1\2"+
		"\u0105\u0107\5 \21\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108"+
		"\3\2\2\2\u0108\u0109\b\16\1\2\u0109\u010a\b\16\1\2\u010a\u0172\3\2\2\2"+
		"\u010b\u010c\b\16\1\2\u010c\u010e\b\16\1\2\u010d\u010f\5\24\13\2\u010e"+
		"\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\b\16"+
		"\1\2\u0111\u0113\b\16\1\2\u0112\u0114\5L\'\2\u0113\u0112\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\b\16\1\2\u0116\u0117\5"+
		"j\66\2\u0117\u0118\5\30\r\2\u0118\u0119\b\16\1\2\u0119\u0172\3\2\2\2\u011a"+
		"\u011b\b\16\1\2\u011b\u011d\b\16\1\2\u011c\u011e\5\24\13\2\u011d\u011c"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\b\16\1\2"+
		"\u0120\u0122\b\16\1\2\u0121\u0123\5L\'\2\u0122\u0121\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\b\16\1\2\u0125\u0126\58\35\2"+
		"\u0126\u0127\b\16\1\2\u0127\u0172\3\2\2\2\u0128\u0129\b\16\1\2\u0129\u012b"+
		"\b\16\1\2\u012a\u012c\5\24\13\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2"+
		"\2\u012c\u012d\3\2\2\2\u012d\u012e\b\16\1\2\u012e\u012f\5,\27\2\u012f"+
		"\u0130\b\16\1\2\u0130\u0172\3\2\2\2\u0131\u0132\b\16\1\2\u0132\u0134\b"+
		"\16\1\2\u0133\u0135\5\24\13\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2"+
		"\u0135\u0136\3\2\2\2\u0136\u0137\b\16\1\2\u0137\u0138\5\62\32\2\u0138"+
		"\u0139\b\16\1\2\u0139\u0172\3\2\2\2\u013a\u013b\b\16\1\2\u013b\u013d\b"+
		"\16\1\2\u013c\u013e\5\24\13\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2"+
		"\u013e\u013f\3\2\2\2\u013f\u0140\b\16\1\2\u0140\u0141\5L\'\2\u0141\u0142"+
		"\b\16\1\2\u0142\u0172\3\2\2\2\u0143\u0144\b\16\1\2\u0144\u0146\b\16\1"+
		"\2\u0145\u0147\5\24\13\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u0149\b\16\1\2\u0149\u014b\b\16\1\2\u014a\u014c\5"+
		"L\'\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014e\b\16\1\2\u014e\u014f\7\34\2\2\u014f\u0151\b\16\1\2\u0150\u0152"+
		"\5&\24\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0154\b\16\1\2\u0154\u0172\b\16\1\2\u0155\u0156\b\16\1\2\u0156\u0158"+
		"\b\16\1\2\u0157\u0159\5\24\13\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2"+
		"\2\u0159\u015a\3\2\2\2\u015a\u015b\b\16\1\2\u015b\u015d\b\16\1\2\u015c"+
		"\u015e\5L\'\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015f\u0160\b\16\1\2\u0160\u0161\5> \2\u0161\u0162\b\16\1\2\u0162"+
		"\u0172\3\2\2\2\u0163\u0164\b\16\1\2\u0164\u0166\b\16\1\2\u0165\u0167\5"+
		"\24\13\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u0169\b\16\1\2\u0169\u016b\b\16\1\2\u016a\u016c\5L\'\2\u016b\u016a\3"+
		"\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\b\16\1\2\u016e"+
		"\u016f\5T+\2\u016f\u0170\b\16\1\2\u0170\u0172\3\2\2\2\u0171\u00f8\3\2"+
		"\2\2\u0171\u010b\3\2\2\2\u0171\u011a\3\2\2\2\u0171\u0128\3\2\2\2\u0171"+
		"\u0131\3\2\2\2\u0171\u013a\3\2\2\2\u0171\u0143\3\2\2\2\u0171\u0155\3\2"+
		"\2\2\u0171\u0163\3\2\2\2\u0172\33\3\2\2\2\u0173\u0174\b\17\1\2\u0174\u0175"+
		"\5:\36\2\u0175\u0176\5\36\20\2\u0176\u0177\b\17\1\2\u0177\35\3\2\2\2\u0178"+
		"\u0179\b\20\1\2\u0179\u017a\5:\36\2\u017a\u017b\5\36\20\2\u017b\u017c"+
		"\b\20\1\2\u017c\u0183\3\2\2\2\u017d\u017e\b\20\1\2\u017e\u017f\7\23\2"+
		"\2\u017f\u0180\5\32\16\2\u0180\u0181\b\20\1\2\u0181\u0183\3\2\2\2\u0182"+
		"\u0178\3\2\2\2\u0182\u017d\3\2\2\2\u0183\37\3\2\2\2\u0184\u0185\b\21\1"+
		"\2\u0185\u0186\7\r\2\2\u0186\u0188\b\21\1\2\u0187\u0189\5\"\22\2\u0188"+
		"\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\b\21"+
		"\1\2\u018b\u018c\7\16\2\2\u018c\u018d\b\21\1\2\u018d!\3\2\2\2\u018e\u018f"+
		"\b\22\1\2\u018f\u0190\5\30\r\2\u0190\u0194\b\22\1\2\u0191\u0193\5$\23"+
		"\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195"+
		"\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0198\b\22\1\2"+
		"\u0198\u0199\b\22\1\2\u0199#\3\2\2\2\u019a\u019b\b\23\1\2\u019b\u019c"+
		"\7\20\2\2\u019c\u019d\5\30\r\2\u019d\u019e\b\23\1\2\u019e%\3\2\2\2\u019f"+
		"\u01a0\b\24\1\2\u01a0\u01a1\7\r\2\2\u01a1\u01a3\b\24\1\2\u01a2\u01a4\5"+
		"(\25\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"\u01a6\b\24\1\2\u01a6\u01a7\7\16\2\2\u01a7\u01a8\b\24\1\2\u01a8\'\3\2"+
		"\2\2\u01a9\u01aa\b\25\1\2\u01aa\u01ab\5\32\16\2\u01ab\u01af\b\25\1\2\u01ac"+
		"\u01ae\5*\26\2\u01ad\u01ac\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2"+
		"\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2"+
		"\u01b3\b\25\1\2\u01b3\u01b4\b\25\1\2\u01b4)\3\2\2\2\u01b5\u01b6\b\26\1"+
		"\2\u01b6\u01b7\7\20\2\2\u01b7\u01b8\5\32\16\2\u01b8\u01b9\b\26\1\2\u01b9"+
		"+\3\2\2\2\u01ba\u01bb\b\27\1\2\u01bb\u01bc\7\t\2\2\u01bc\u01be\b\27\1"+
		"\2\u01bd\u01bf\5.\30\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0"+
		"\3\2\2\2\u01c0\u01c1\b\27\1\2\u01c1\u01c2\7\n\2\2\u01c2\u01c3\b\27\1\2"+
		"\u01c3-\3\2\2\2\u01c4\u01c5\b\30\1\2\u01c5\u01c6\5\30\r\2\u01c6\u01ca"+
		"\b\30\1\2\u01c7\u01c9\5\60\31\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc\3\2\2"+
		"\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ca"+
		"\3\2\2\2\u01cd\u01ce\b\30\1\2\u01ce\u01cf\b\30\1\2\u01cf/\3\2\2\2\u01d0"+
		"\u01d1\b\31\1\2\u01d1\u01d2\7\17\2\2\u01d2\u01d4\b\31\1\2\u01d3\u01d5"+
		"\5\30\r\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2"+
		"\u01d6\u01d7\b\31\1\2\u01d7\u01d8\b\31\1\2\u01d8\61\3\2\2\2\u01d9\u01da"+
		"\b\32\1\2\u01da\u01db\7\33\2\2\u01db\u01dd\b\32\1\2\u01dc\u01de\5\64\33"+
		"\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0"+
		"\b\32\1\2\u01e0\u01e2\b\32\1\2\u01e1\u01e3\5\66\34\2\u01e2\u01e1\3\2\2"+
		"\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\b\32\1\2\u01e5"+
		"\u01e7\b\32\1\2\u01e6\u01e8\5<\37\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3"+
		"\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\b\32\1\2\u01ea\u01eb\b\32\1\2\u01eb"+
		"\63\3\2\2\2\u01ec\u01ed\b\33\1\2\u01ed\u01ee\7\25\2\2\u01ee\u01ef\b\33"+
		"\1\2\u01ef\65\3\2\2\2\u01f0\u01f1\b\34\1\2\u01f1\u01f2\7\26\2\2\u01f2"+
		"\u01f3\b\34\1\2\u01f3\67\3\2\2\2\u01f4\u01f5\b\35\1\2\u01f5\u01f6\7\35"+
		"\2\2\u01f6\u01fb\b\35\1\2\u01f7\u01f8\b\35\1\2\u01f8\u01f9\7\36\2\2\u01f9"+
		"\u01fb\b\35\1\2\u01fa\u01f4\3\2\2\2\u01fa\u01f7\3\2\2\2\u01fb9\3\2\2\2"+
		"\u01fc\u01fd\b\36\1\2\u01fd\u01ff\b\36\1\2\u01fe\u0200\5\24\13\2\u01ff"+
		"\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\b\36"+
		"\1\2\u0202\u0203\5\62\32\2\u0203\u0204\b\36\1\2\u0204;\3\2\2\2\u0205\u0206"+
		"\b\37\1\2\u0206\u0207\7\22\2\2\u0207\u0208\5`\61\2\u0208\u0209\b\37\1"+
		"\2\u0209=\3\2\2\2\u020a\u020b\b \1\2\u020b\u020c\7\31\2\2\u020c\u020d"+
		"\5\62\32\2\u020d\u020e\b \1\2\u020e?\3\2\2\2\u020f\u0210\b!\1\2\u0210"+
		"\u0211\7\4\2\2\u0211\u0212\5B\"\2\u0212\u0213\5D#\2\u0213\u0215\b!\1\2"+
		"\u0214\u0216\5J&\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217"+
		"\3\2\2\2\u0217\u0218\b!\1\2\u0218\u0219\b!\1\2\u0219A\3\2\2\2\u021a\u021b"+
		"\b\"\1\2\u021b\u021c\5\32\16\2\u021c\u021d\b\"\1\2\u021dC\3\2\2\2\u021e"+
		"\u021f\b#\1\2\u021f\u0220\5H%\2\u0220\u0224\b#\1\2\u0221\u0223\5F$\2\u0222"+
		"\u0221\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2"+
		"\2\2\u0225\u0227\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0228\b#\1\2\u0228"+
		"\u0229\b#\1\2\u0229E\3\2\2\2\u022a\u022b\b$\1\2\u022b\u022c\7\17\2\2\u022c"+
		"\u022d\5H%\2\u022d\u022e\b$\1\2\u022eG\3\2\2\2\u022f\u0230\b%\1\2\u0230"+
		"\u0231\5\f\7\2\u0231\u0232\b%\1\2\u0232I\3\2\2\2\u0233\u0234\b&\1\2\u0234"+
		"\u0235\7\5\2\2\u0235\u0236\b&\1\2\u0236K\3\2\2\2\u0237\u0238\b\'\1\2\u0238"+
		"\u0239\7\13\2\2\u0239\u023b\b\'\1\2\u023a\u023c\5N(\2\u023b\u023a\3\2"+
		"\2\2\u023b\u023c\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\b\'\1\2\u023e"+
		"\u023f\7\f\2\2\u023f\u0240\b\'\1\2\u0240M\3\2\2\2\u0241\u0242\b(\1\2\u0242"+
		"\u0243\5R*\2\u0243\u0247\b(\1\2\u0244\u0246\5P)\2\u0245\u0244\3\2\2\2"+
		"\u0246\u0249\3\2\2\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024a"+
		"\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u024b\b(\1\2\u024b\u024c\b(\1\2\u024c"+
		"O\3\2\2\2\u024d\u024e\b)\1\2\u024e\u024f\7\17\2\2\u024f\u0251\b)\1\2\u0250"+
		"\u0252\5R*\2\u0251\u0250\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\3\2\2"+
		"\2\u0253\u0254\b)\1\2\u0254\u0255\b)\1\2\u0255Q\3\2\2\2\u0256\u0257\b"+
		"*\1\2\u0257\u0258\7\34\2\2\u0258\u0284\b*\1\2\u0259\u025a\b*\1\2\u025a"+
		"\u025b\7\24\2\2\u025b\u025c\7\34\2\2\u025c\u0284\b*\1\2\u025d\u025e\b"+
		"*\1\2\u025e\u025f\7\34\2\2\u025f\u0260\7\6\2\2\u0260\u0261\5\32\16\2\u0261"+
		"\u0262\b*\1\2\u0262\u0284\3\2\2\2\u0263\u0264\b*\1\2\u0264\u0265\7\33"+
		"\2\2\u0265\u0284\b*\1\2\u0266\u0267\b*\1\2\u0267\u0268\7\24\2\2\u0268"+
		"\u0269\7\33\2\2\u0269\u0284\b*\1\2\u026a\u026b\b*\1\2\u026b\u026c\7\33"+
		"\2\2\u026c\u026d\7\6\2\2\u026d\u026e\5\32\16\2\u026e\u026f\b*\1\2\u026f"+
		"\u0284\3\2\2\2\u0270\u0271\b*\1\2\u0271\u0272\7\35\2\2\u0272\u0284\b*"+
		"\1\2\u0273\u0274\b*\1\2\u0274\u0275\7\24\2\2\u0275\u0276\7\35\2\2\u0276"+
		"\u0284\b*\1\2\u0277\u0278\b*\1\2\u0278\u0279\7\35\2\2\u0279\u027a\7\6"+
		"\2\2\u027a\u027b\5\32\16\2\u027b\u027c\b*\1\2\u027c\u0284\3\2\2\2\u027d"+
		"\u027e\b*\1\2\u027e\u027f\5j\66\2\u027f\u0280\7\6\2\2\u0280\u0281\5\32"+
		"\16\2\u0281\u0282\b*\1\2\u0282\u0284\3\2\2\2\u0283\u0256\3\2\2\2\u0283"+
		"\u0259\3\2\2\2\u0283\u025d\3\2\2\2\u0283\u0263\3\2\2\2\u0283\u0266\3\2"+
		"\2\2\u0283\u026a\3\2\2\2\u0283\u0270\3\2\2\2\u0283\u0273\3\2\2\2\u0283"+
		"\u0277\3\2\2\2\u0283\u027d\3\2\2\2\u0284S\3\2\2\2\u0285\u0286\b+\1\2\u0286"+
		"\u0287\5@!\2\u0287\u0288\b+\1\2\u0288U\3\2\2\2\u0289\u028a\b,\1\2\u028a"+
		"\u028c\b,\1\2\u028b\u028d\5X-\2\u028c\u028b\3\2\2\2\u028c\u028d\3\2\2"+
		"\2\u028d\u028e\3\2\2\2\u028e\u028f\b,\1\2\u028f\u0290\5Z.\2\u0290\u0291"+
		"\5`\61\2\u0291\u0292\7\21\2\2\u0292\u0293\7\t\2\2\u0293\u0294\5d\63\2"+
		"\u0294\u0295\7\n\2\2\u0295\u0296\b,\1\2\u0296\u02a4\3\2\2\2\u0297\u0298"+
		"\b,\1\2\u0298\u029a\b,\1\2\u0299\u029b\5X-\2\u029a\u0299\3\2\2\2\u029a"+
		"\u029b\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\b,\1\2\u029d\u029e\5Z."+
		"\2\u029e\u029f\5h\65\2\u029f\u02a0\7\22\2\2\u02a0\u02a1\5`\61\2\u02a1"+
		"\u02a2\b,\1\2\u02a2\u02a4\3\2\2\2\u02a3\u0289\3\2\2\2\u02a3\u0297\3\2"+
		"\2\2\u02a4W\3\2\2\2\u02a5\u02a6\b-\1\2\u02a6\u02a7\7\b\2\2\u02a7\u02a9"+
		"\b-\1\2\u02a8\u02aa\5\62\32\2\u02a9\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2"+
		"\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae"+
		"\b-\1\2\u02ae\u02af\7\23\2\2\u02af\u02b0\b-\1\2\u02b0Y\3\2\2\2\u02b1\u02b2"+
		"\b.\1\2\u02b2\u02b4\b.\1\2\u02b3\u02b5\5L\'\2\u02b4\u02b3\3\2\2\2\u02b4"+
		"\u02b5\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b7\b.\1\2\u02b7\u02b8\b.\1"+
		"\2\u02b8[\3\2\2\2\u02b9\u02ba\b/\1\2\u02ba\u02bb\5`\61\2\u02bb\u02bf\b"+
		"/\1\2\u02bc\u02be\5^\60\2\u02bd\u02bc\3\2\2\2\u02be\u02c1\3\2\2\2\u02bf"+
		"\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02bf\3\2"+
		"\2\2\u02c2\u02c3\b/\1\2\u02c3\u02c4\b/\1\2\u02c4]\3\2\2\2\u02c5\u02c6"+
		"\b\60\1\2\u02c6\u02c7\7\20\2\2\u02c7\u02c8\5`\61\2\u02c8\u02c9\b\60\1"+
		"\2\u02c9_\3\2\2\2\u02ca\u02cb\b\61\1\2\u02cb\u02cc\5j\66\2\u02cc\u02ce"+
		"\b\61\1\2\u02cd\u02cf\5b\62\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2"+
		"\u02cf\u02d0\3\2\2\2\u02d0\u02d1\b\61\1\2\u02d1\u02d2\b\61\1\2\u02d2\u02d8"+
		"\3\2\2\2\u02d3\u02d4\b\61\1\2\u02d4\u02d5\5\62\32\2\u02d5\u02d6\b\61\1"+
		"\2\u02d6\u02d8\3\2\2\2\u02d7\u02ca\3\2\2\2\u02d7\u02d3\3\2\2\2\u02d8a"+
		"\3\2\2\2\u02d9\u02da\b\62\1\2\u02da\u02db\7\r\2\2\u02db\u02dd\b\62\1\2"+
		"\u02dc\u02de\5\\/\2\u02dd\u02dc\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02df"+
		"\3\2\2\2\u02df\u02e0\b\62\1\2\u02e0\u02e1\7\16\2\2\u02e1\u02e2\b\62\1"+
		"\2\u02e2c\3\2\2\2\u02e3\u02e4\b\63\1\2\u02e4\u02e8\b\63\1\2\u02e5\u02e7"+
		"\5f\64\2\u02e6\u02e5\3\2\2\2\u02e7\u02ea\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e8"+
		"\u02e9\3\2\2\2\u02e9\u02eb\3\2\2\2\u02ea\u02e8\3\2\2\2\u02eb\u02ec\b\63"+
		"\1\2\u02ec\u02ed\b\63\1\2\u02ede\3\2\2\2\u02ee\u02ef\b\64\1\2\u02ef\u02f0"+
		"\5h\65\2\u02f0\u02f1\7\17\2\2\u02f1\u02f2\b\64\1\2\u02f2g\3\2\2\2\u02f3"+
		"\u02f4\b\65\1\2\u02f4\u02f5\5j\66\2\u02f5\u02f7\b\65\1\2\u02f6\u02f8\5"+
		" \21\2\u02f7\u02f6\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9"+
		"\u02fa\b\65\1\2\u02fa\u02fb\b\65\1\2\u02fbi\3\2\2\2\u02fc\u02fd\b\66\1"+
		"\2\u02fd\u02fe\5l\67\2\u02fe\u02ff\7\32\2\2\u02ff\u0300\b\66\1\2\u0300"+
		"\u0306\3\2\2\2\u0301\u0302\b\66\1\2\u0302\u0303\5n8\2\u0303\u0304\b\66"+
		"\1\2\u0304\u0306\3\2\2\2\u0305\u02fc\3\2\2\2\u0305\u0301\3\2\2\2\u0306"+
		"k\3\2\2\2\u0307\u0308\b\67\1\2\u0308\u0309\7\32\2\2\u0309\u030a\7\23\2"+
		"\2\u030a\u030b\5l\67\2\u030b\u030c\b\67\1\2\u030c\u0310\3\2\2\2\u030d"+
		"\u030e\b\67\1\2\u030e\u0310\b\67\1\2\u030f\u0307\3\2\2\2\u030f\u030d\3"+
		"\2\2\2\u0310m\3\2\2\2\u0311\u0312\b8\1\2\u0312\u0313\7\6\2\2\u0313\u031b"+
		"\b8\1\2\u0314\u0315\b8\1\2\u0315\u0316\7\30\2\2\u0316\u031b\b8\1\2\u0317"+
		"\u0318\b8\1\2\u0318\u0319\7\23\2\2\u0319\u031b\b8\1\2\u031a\u0311\3\2"+
		"\2\2\u031a\u0314\3\2\2\2\u031a\u0317\3\2\2\2\u031bo\3\2\2\2\u031c\u031d"+
		"\b9\1\2\u031d\u031e\5j\66\2\u031e\u0320\b9\1\2\u031f\u0321\5r:\2\u0320"+
		"\u031f\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0323\b9"+
		"\1\2\u0323\u0324\b9\1\2\u0324\u032e\3\2\2\2\u0325\u0326\b9\1\2\u0326\u0327"+
		"\5x=\2\u0327\u0328\b9\1\2\u0328\u032e\3\2\2\2\u0329\u032a\b9\1\2\u032a"+
		"\u032b\58\35\2\u032b\u032c\b9\1\2\u032c\u032e\3\2\2\2\u032d\u031c\3\2"+
		"\2\2\u032d\u0325\3\2\2\2\u032d\u0329\3\2\2\2\u032eq\3\2\2\2\u032f\u0330"+
		"\b:\1\2\u0330\u0331\7\r\2\2\u0331\u0333\b:\1\2\u0332\u0334\5t;\2\u0333"+
		"\u0332\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\b:"+
		"\1\2\u0336\u0337\7\16\2\2\u0337\u0338\b:\1\2\u0338s\3\2\2\2\u0339\u033a"+
		"\b;\1\2\u033a\u033b\5p9\2\u033b\u033f\b;\1\2\u033c\u033e\5v<\2\u033d\u033c"+
		"\3\2\2\2\u033e\u0341\3\2\2\2\u033f\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340"+
		"\u0342\3\2\2\2\u0341\u033f\3\2\2\2\u0342\u0343\b;\1\2\u0343\u0344\b;\1"+
		"\2\u0344u\3\2\2\2\u0345\u0346\b<\1\2\u0346\u0347\7\20\2\2\u0347\u0348"+
		"\5p9\2\u0348\u0349\b<\1\2\u0349w\3\2\2\2\u034a\u034b\b=\1\2\u034b\u034c"+
		"\7\t\2\2\u034c\u034e\b=\1\2\u034d\u034f\5\4\3\2\u034e\u034d\3\2\2\2\u034e"+
		"\u034f\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0351\b=\1\2\u0351\u0352\7\n"+
		"\2\2\u0352\u0353\b=\1\2\u0353y\3\2\2\2E\u0084\u008e\u00a3\u00b0\u00bc"+
		"\u00c6\u00cb\u00d1\u00df\u00e9\u00f6\u00fb\u0100\u0106\u010e\u0113\u011d"+
		"\u0122\u012b\u0134\u013d\u0146\u014b\u0151\u0158\u015d\u0166\u016b\u0171"+
		"\u0182\u0188\u0194\u01a3\u01af\u01be\u01ca\u01d4\u01dd\u01e2\u01e7\u01fa"+
		"\u01ff\u0215\u0224\u023b\u0247\u0251\u0283\u028c\u029a\u02a3\u02ab\u02b4"+
		"\u02bf\u02ce\u02d7\u02dd\u02e8\u02f7\u0305\u030f\u031a\u0320\u032d\u0333"+
		"\u033f\u034e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}