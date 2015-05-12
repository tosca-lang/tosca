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
		CONSTRUCTOR=23, VARIABLE=24, METAVAR=25, STRING=26, NUMBER=27, WS=28, 
		BLOCK_COMMENT=29, LINE_COMMENT=30, XML_COMMENT=31;
	public static final int
		RULE_crsx = 0, RULE_declarations = 1, RULE_declarations_S1 = 2, RULE_declaration = 3, 
		RULE_moduleDeclaration = 4, RULE_ruleDeclaration = 5, RULE_option = 6, 
		RULE_pattern = 7, RULE_contractum = 8, RULE_annotations = 9, RULE_annotation = 10, 
		RULE_term = 11, RULE_freeTerm = 12, RULE_boundTerm = 13, RULE_nextBinder = 14, 
		RULE_arguments = 15, RULE_terms = 16, RULE_terms_S1 = 17, RULE_freeArguments = 18, 
		RULE_freeTerms = 19, RULE_freeTerms_S1 = 20, RULE_list = 21, RULE_termList = 22, 
		RULE_termList_S1 = 23, RULE_variable = 24, RULE_linear = 25, RULE_functional = 26, 
		RULE_literal = 27, RULE_binder = 28, RULE_varsort = 29, RULE_dispatch = 30, 
		RULE_dispatchTerm = 31, RULE_dispatchTerm_S1 = 32, RULE_dispatchCases = 33, 
		RULE_dispatchCases_S1 = 34, RULE_dispatchCase = 35, RULE_delayCase = 36, 
		RULE_properties = 37, RULE_propertylist = 38, RULE_propertylist_S1 = 39, 
		RULE_property = 40, RULE_expression = 41, RULE_sortDeclaration = 42, RULE_sortparams = 43, 
		RULE_sortset = 44, RULE_sortnames = 45, RULE_sortnames_S1 = 46, RULE_sortname = 47, 
		RULE_sortarguments = 48, RULE_forms = 49, RULE_forms_S1 = 50, RULE_form = 51, 
		RULE_constructor = 52, RULE_qualifier = 53, RULE_directive = 54, RULE_directiveArguments = 55, 
		RULE_directives = 56, RULE_directives_S1 = 57, RULE_directiveList = 58;
	public static final String[] ruleNames = {
		"crsx", "declarations", "declarations_S1", "declaration", "moduleDeclaration", 
		"ruleDeclaration", "option", "pattern", "contractum", "annotations", "annotation", 
		"term", "freeTerm", "boundTerm", "nextBinder", "arguments", "terms", "terms_S1", 
		"freeArguments", "freeTerms", "freeTerms_S1", "list", "termList", "termList_S1", 
		"variable", "linear", "functional", "literal", "binder", "varsort", "dispatch", 
		"dispatchTerm", "dispatchTerm_S1", "dispatchCases", "dispatchCases_S1", 
		"dispatchCase", "delayCase", "properties", "propertylist", "propertylist_S1", 
		"property", "expression", "sortDeclaration", "sortparams", "sortset", 
		"sortnames", "sortnames_S1", "sortname", "sortarguments", "forms", "forms_S1", 
		"form", "constructor", "qualifier", "directive", "directiveArguments", 
		"directives", "directives_S1", "directiveList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'module'", "'dispatch'", "'delay'", "':'", "'→'", "'∀'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'::='", "'::'", "'.'", 
		"'¬'", "'¹'", "'ᵇ'", "'&'", "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MODULE", "DISPATCH", "DELAY", "COLON", "ARROW", "FORALL", "LPAR", 
		"RPAR", "LBRACE", "RBRACE", "LSQUARE", "RSQUARE", "SEMI", "COMMA", "DATASORT", 
		"COLONCOLON", "DOT", "NOT", "LINEAR", "FUNCTIONAL", "AND", "AT", "CONSTRUCTOR", 
		"VARIABLE", "METAVAR", "STRING", "NUMBER", "WS", "BLOCK_COMMENT", "LINE_COMMENT", 
		"XML_COMMENT"
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
			setState(119);
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
			setState(123);
			declaration();
			_enterZOM();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(125);
				declarations_S1();
				}
				}
				setState(130);
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
			setState(135);
			match(SEMI);
			_enterOPT();
			setState(138);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULE) | (1L << COLON) | (1L << FORALL) | (1L << LPAR) | (1L << LBRACE) | (1L << AT) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(137);
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
			setState(159);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(144);
				moduleDeclaration();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(148);
				ruleDeclaration();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(152);
				sortDeclaration();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(156);
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
		public TerminalNode STRING() { return getToken(CrsxTermParser.STRING, 0); }
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
			setState(162);
			match(MODULE);
			setState(163);
			match(STRING);
			setState(164);
			match(LBRACE);
			setState(165);
			declarations();
			setState(166);
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
			setState(172);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(171);
				option();
				}
				break;
			}
			_exitOPT();
			setState(175);
			pattern();
			setState(176);
			match(ARROW);
			setState(177);
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
			setState(194);
			switch (_input.LA(1)) {
			case COLON:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(181);
				constructor();
				_enterOPT();
				setState(184);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(183);
					arguments();
					}
				}

				_exitOPT();
				setState(187);
				match(COLON);
				_exitAlt();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(191);
				annotations();
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
			setState(199);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(198);
				properties();
				}
			}

			_exitOPT();
			setState(202);
			constructor();
			_enterOPT();
			setState(205);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(204);
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
			setState(211);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterOOM();
			setState(217); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(216);
				annotation();
				}
				}
				setState(219); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AT );
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
			setState(225);
			match(AT);
			setState(226);
			constructor();
			_enterOPT();
			setState(229);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(228);
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
			setState(242);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(235);
				freeTerm();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(239);
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
			setState(336);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_enterOPT();
				setState(247);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(246);
					annotations();
					}
				}

				_exitOPT();
				setState(250);
				constructor();
				_enterOPT();
				setState(253);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(252);
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
				setState(261);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(260);
					annotations();
					}
				}

				_exitOPT();
				setState(264);
				constructor();
				setState(265);
				term();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				_enterOPT();
				setState(271);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(270);
					annotations();
					}
				}

				_exitOPT();
				setState(274);
				literal();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				_enterOPT();
				setState(280);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(279);
					annotations();
					}
				}

				_exitOPT();
				setState(283);
				list();
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				_enterOPT();
				setState(289);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(288);
					annotations();
					}
				}

				_exitOPT();
				setState(292);
				variable();
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_enterAlt("6");
				_enterOPT();
				setState(298);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(297);
					annotations();
					}
				}

				_exitOPT();
				setState(301);
				properties();
				setState(302);
				term();
				_exitAlt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				_enterAlt("7");
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
				setState(311);
				properties();
				_exitAlt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				_enterAlt("8");
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
				setState(320);
				match(METAVAR);
				_enterOPT();
				setState(323);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(322);
					freeArguments();
					}
				}

				_exitOPT();
				_exitAlt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				_enterAlt("9");
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
			setState(339);
			binder();
			setState(340);
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
			setState(353);
			switch (_input.LA(1)) {
			case AT:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(344);
				binder();
				setState(345);
				nextBinder();
				_exitAlt();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(349);
				match(DOT);
				setState(350);
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
			setState(356);
			match(LSQUARE);
			_enterOPT();
			setState(359);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPATCH) | (1L << COLON) | (1L << LPAR) | (1L << LBRACE) | (1L << AT) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(358);
				terms();
				}
			}

			_exitOPT();
			setState(362);
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
			setState(366);
			term();
			_enterZOM();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(368);
				terms_S1();
				}
				}
				setState(373);
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
			setState(378);
			match(COMMA);
			setState(379);
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
			setState(383);
			match(LSQUARE);
			_enterOPT();
			setState(386);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPATCH) | (1L << COLON) | (1L << LPAR) | (1L << LBRACE) | (1L << AT) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(385);
				freeTerms();
				}
			}

			_exitOPT();
			setState(389);
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
			setState(393);
			freeTerm();
			_enterZOM();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(395);
				freeTerms_S1();
				}
				}
				setState(400);
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
			setState(405);
			match(COMMA);
			setState(406);
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
			setState(410);
			match(LPAR);
			_enterOPT();
			setState(413);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPATCH) | (1L << COLON) | (1L << LPAR) | (1L << LBRACE) | (1L << AT) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(412);
				termList();
				}
			}

			_exitOPT();
			setState(416);
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
			setState(420);
			term();
			_enterZOM();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(422);
				termList_S1();
				}
				}
				setState(427);
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
			setState(432);
			match(SEMI);
			_enterOPT();
			setState(435);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPATCH) | (1L << COLON) | (1L << LPAR) | (1L << LBRACE) | (1L << AT) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(434);
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
			setState(441);
			match(VARIABLE);
			_enterOPT();
			setState(444);
			_la = _input.LA(1);
			if (_la==LINEAR) {
				{
				setState(443);
				linear();
				}
			}

			_exitOPT();
			_enterOPT();
			setState(449);
			_la = _input.LA(1);
			if (_la==FUNCTIONAL) {
				{
				setState(448);
				functional();
				}
			}

			_exitOPT();
			_enterOPT();
			setState(454);
			_la = _input.LA(1);
			if (_la==COLONCOLON) {
				{
				setState(453);
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
			setState(460);
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
		enterRule(_localctx, 54, RULE_literal);
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
			setState(478);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(477);
				annotations();
				}
			}

			_exitOPT();
			setState(481);
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
			setState(485);
			match(COLONCOLON);
			setState(486);
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
		enterRule(_localctx, 60, RULE_dispatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(490);
			match(DISPATCH);
			setState(491);
			dispatchTerm();
			setState(492);
			dispatchCases();
			_enterOPT();
			setState(495);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(494);
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<DispatchTerm_S1Context> dispatchTerm_S1() {
			return getRuleContexts(DispatchTerm_S1Context.class);
		}
		public DispatchTerm_S1Context dispatchTerm_S1(int i) {
			return getRuleContext(DispatchTerm_S1Context.class,i);
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
		enterRule(_localctx, 62, RULE_dispatchTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(501);
			term();
			_enterZOM();
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(503);
				dispatchTerm_S1();
				}
				}
				setState(508);
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

	public static class DispatchTerm_S1Context extends ParserRuleContext {
		public TerminalNode AND() { return getToken(CrsxTermParser.AND, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public DispatchTerm_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatchTerm_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterDispatchTerm_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitDispatchTerm_S1(this);
		}
	}

	public final DispatchTerm_S1Context dispatchTerm_S1() throws RecognitionException {
		DispatchTerm_S1Context _localctx = new DispatchTerm_S1Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_dispatchTerm_S1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(513);
			match(AND);
			setState(514);
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
			setState(518);
			dispatchCase();
			_enterZOM();
			setState(523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(520);
					dispatchCases_S1();
					}
					} 
				}
				setState(525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
			setState(530);
			match(SEMI);
			setState(531);
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
			setState(535);
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
			setState(539);
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
		public PropertylistContext propertylist() {
			return getRuleContext(PropertylistContext.class,0);
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
			setState(543);
			match(LBRACE);
			_enterOPT();
			setState(546);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << NOT) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING))) != 0)) {
				{
				setState(545);
				propertylist();
				}
			}

			_exitOPT();
			setState(549);
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

	public static class PropertylistContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public List<Propertylist_S1Context> propertylist_S1() {
			return getRuleContexts(Propertylist_S1Context.class);
		}
		public Propertylist_S1Context propertylist_S1(int i) {
			return getRuleContext(Propertylist_S1Context.class,i);
		}
		public PropertylistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertylist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterPropertylist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitPropertylist(this);
		}
	}

	public final PropertylistContext propertylist() throws RecognitionException {
		PropertylistContext _localctx = new PropertylistContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_propertylist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(553);
			property();
			_enterZOM();
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(555);
				propertylist_S1();
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

	public static class Propertylist_S1Context extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(CrsxTermParser.SEMI, 0); }
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public Propertylist_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertylist_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterPropertylist_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitPropertylist_S1(this);
		}
	}

	public final Propertylist_S1Context propertylist_S1() throws RecognitionException {
		Propertylist_S1Context _localctx = new Propertylist_S1Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_propertylist_S1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(565);
			match(SEMI);
			_enterOPT();
			setState(568);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << NOT) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING))) != 0)) {
				{
				setState(567);
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
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
			setState(618);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(574);
				match(METAVAR);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(577);
				match(NOT);
				setState(578);
				match(METAVAR);
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(581);
				match(METAVAR);
				setState(582);
				match(COLON);
				setState(583);
				term();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(587);
				match(VARIABLE);
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				setState(590);
				match(NOT);
				setState(591);
				match(VARIABLE);
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_enterAlt("6");
				setState(594);
				match(VARIABLE);
				setState(595);
				match(COLON);
				setState(596);
				term();
				_exitAlt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				_enterAlt("7");
				setState(600);
				match(STRING);
				_exitAlt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				_enterAlt("8");
				setState(603);
				match(NOT);
				setState(604);
				match(STRING);
				_exitAlt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				_enterAlt("9");
				setState(607);
				match(STRING);
				setState(608);
				match(COLON);
				setState(609);
				term();
				_exitAlt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				_enterAlt("10");
				setState(613);
				constructor();
				setState(614);
				match(COLON);
				setState(615);
				term();
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
			setState(621);
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
			setState(650);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_enterOPT();
				setState(627);
				_la = _input.LA(1);
				if (_la==FORALL) {
					{
					setState(626);
					sortparams();
					}
				}

				_exitOPT();
				setState(630);
				sortset();
				setState(631);
				sortname();
				setState(632);
				match(DATASORT);
				setState(633);
				match(LPAR);
				setState(634);
				forms();
				setState(635);
				match(RPAR);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_enterOPT();
				setState(641);
				_la = _input.LA(1);
				if (_la==FORALL) {
					{
					setState(640);
					sortparams();
					}
				}

				_exitOPT();
				setState(644);
				sortset();
				setState(645);
				form();
				setState(646);
				match(COLONCOLON);
				setState(647);
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
			setState(653);
			match(FORALL);
			_enterOOM();
			setState(656); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(655);
				variable();
				}
				}
				setState(658); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARIABLE );
			_exitOOM();
			setState(661);
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
			setState(667);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(666);
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
			setState(673);
			sortname();
			_enterZOM();
			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(675);
				sortnames_S1();
				}
				}
				setState(680);
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
			setState(685);
			match(COMMA);
			setState(686);
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
			setState(702);
			switch (_input.LA(1)) {
			case COLON:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(690);
				constructor();
				_enterOPT();
				setState(693);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(692);
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
				setState(699);
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
			setState(705);
			match(LSQUARE);
			_enterOPT();
			setState(708);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << CONSTRUCTOR) | (1L << VARIABLE))) != 0)) {
				{
				setState(707);
				sortnames();
				}
			}

			_exitOPT();
			setState(711);
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
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON || _la==CONSTRUCTOR) {
				{
				{
				setState(716);
				forms_S1();
				}
				}
				setState(721);
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
			setState(726);
			form();
			setState(727);
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
			setState(731);
			constructor();
			_enterOPT();
			setState(734);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(733);
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
		public TerminalNode COLON() { return getToken(CrsxTermParser.COLON, 0); }
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
			setState(747);
			switch (_input.LA(1)) {
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(740);
				qualifier();
				setState(741);
				match(CONSTRUCTOR);
				_exitAlt();
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(745);
				match(COLON);
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
			setState(757);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(750);
				match(CONSTRUCTOR);
				setState(751);
				match(DOT);
				setState(752);
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
		enterRule(_localctx, 108, RULE_directive);
		int _la;
		try {
			setState(776);
			switch (_input.LA(1)) {
			case COLON:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(760);
				constructor();
				_enterOPT();
				setState(763);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(762);
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
				setState(769);
				directiveList();
				_exitAlt();
				}
				break;
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(773);
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
		enterRule(_localctx, 110, RULE_directiveArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(779);
			match(LSQUARE);
			_enterOPT();
			setState(782);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << LPAR) | (1L << CONSTRUCTOR) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(781);
				directives();
				}
			}

			_exitOPT();
			setState(785);
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
		enterRule(_localctx, 112, RULE_directives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(789);
			directive();
			_enterZOM();
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(791);
				directives_S1();
				}
				}
				setState(796);
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
		enterRule(_localctx, 114, RULE_directives_S1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(801);
			match(COMMA);
			setState(802);
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
		enterRule(_localctx, 116, RULE_directiveList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(806);
			match(LPAR);
			_enterOPT();
			setState(809);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULE) | (1L << COLON) | (1L << FORALL) | (1L << LPAR) | (1L << LBRACE) | (1L << AT) | (1L << CONSTRUCTOR) | (1L << VARIABLE) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(808);
				declarations();
				}
			}

			_exitOPT();
			setState(812);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u0332\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u0081\n\3\f\3\16\3\u0084\13\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\5\4\u008d\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a2\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7\u00af\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\5\b\u00bb\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c5\n\b"+
		"\3\t\3\t\3\t\5\t\u00ca\n\t\3\t\3\t\3\t\3\t\5\t\u00d0\n\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\6\13\u00dc\n\13\r\13\16\13\u00dd\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u00e8\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u00f5\n\r\3\16\3\16\3\16\5\16\u00fa\n\16\3\16\3\16"+
		"\3\16\3\16\5\16\u0100\n\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0108\n"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0112\n\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u011b\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0124\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u012d\n"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0137\n\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u0140\n\16\3\16\3\16\3\16\3\16\5\16\u0146"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u014d\n\16\3\16\3\16\3\16\3\16\5\16"+
		"\u0153\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0164\n\20\3\21\3\21\3\21\3\21\5\21\u016a\n\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u0174\n\22\f\22\16\22\u0177"+
		"\13\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24"+
		"\u0185\n\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u018f\n\25\f"+
		"\25\16\25\u0192\13\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\5\27\u01a0\n\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30"+
		"\u01aa\n\30\f\30\16\30\u01ad\13\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\5\31\u01b6\n\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u01bf\n\32\3"+
		"\32\3\32\3\32\5\32\u01c4\n\32\3\32\3\32\3\32\5\32\u01c9\n\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u01dc\n\35\3\36\3\36\3\36\5\36\u01e1\n\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \5 \u01f2\n \3 \3 \3 \3"+
		"!\3!\3!\3!\7!\u01fb\n!\f!\16!\u01fe\13!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\7#\u020c\n#\f#\16#\u020f\13#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\5\'\u0225\n\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\7(\u022f\n(\f(\16(\u0232\13(\3(\3(\3(\3)\3)\3)\3)\5)\u023b\n)"+
		"\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\5*\u026d\n*\3+\3+\3+\3+\3,\3,\3,\5,\u0276\n,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\5,\u0284\n,\3,\3,\3,\3,\3,\3,\3,\5,\u028d\n,\3-\3-"+
		"\3-\3-\6-\u0293\n-\r-\16-\u0294\3-\3-\3-\3-\3.\3.\3.\5.\u029e\n.\3.\3"+
		".\3.\3/\3/\3/\3/\7/\u02a7\n/\f/\16/\u02aa\13/\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\5\61\u02b8\n\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\5\61\u02c1\n\61\3\62\3\62\3\62\3\62\5\62\u02c7\n\62\3\62\3"+
		"\62\3\62\3\62\3\63\3\63\3\63\7\63\u02d0\n\63\f\63\16\63\u02d3\13\63\3"+
		"\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\5\65\u02e1"+
		"\n\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u02ee"+
		"\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u02f8\n\67\38\38\3"+
		"8\38\58\u02fe\n8\38\38\38\38\38\38\38\38\38\38\38\58\u030b\n8\39\39\3"+
		"9\39\59\u0311\n9\39\39\39\39\3:\3:\3:\3:\7:\u031b\n:\f:\16:\u031e\13:"+
		"\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\5<\u032c\n<\3<\3<\3<\3<\3<\2\2=\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjlnprtv\2\2\u0345\2x\3\2\2\2\4|\3\2\2\2\6\u0088\3\2\2\2"+
		"\b\u00a1\3\2\2\2\n\u00a3\3\2\2\2\f\u00ab\3\2\2\2\16\u00c4\3\2\2\2\20\u00c6"+
		"\3\2\2\2\22\u00d4\3\2\2\2\24\u00d8\3\2\2\2\26\u00e2\3\2\2\2\30\u00f4\3"+
		"\2\2\2\32\u0152\3\2\2\2\34\u0154\3\2\2\2\36\u0163\3\2\2\2 \u0165\3\2\2"+
		"\2\"\u016f\3\2\2\2$\u017b\3\2\2\2&\u0180\3\2\2\2(\u018a\3\2\2\2*\u0196"+
		"\3\2\2\2,\u019b\3\2\2\2.\u01a5\3\2\2\2\60\u01b1\3\2\2\2\62\u01ba\3\2\2"+
		"\2\64\u01cd\3\2\2\2\66\u01d1\3\2\2\28\u01db\3\2\2\2:\u01dd\3\2\2\2<\u01e6"+
		"\3\2\2\2>\u01eb\3\2\2\2@\u01f6\3\2\2\2B\u0202\3\2\2\2D\u0207\3\2\2\2F"+
		"\u0213\3\2\2\2H\u0218\3\2\2\2J\u021c\3\2\2\2L\u0220\3\2\2\2N\u022a\3\2"+
		"\2\2P\u0236\3\2\2\2R\u026c\3\2\2\2T\u026e\3\2\2\2V\u028c\3\2\2\2X\u028e"+
		"\3\2\2\2Z\u029a\3\2\2\2\\\u02a2\3\2\2\2^\u02ae\3\2\2\2`\u02c0\3\2\2\2"+
		"b\u02c2\3\2\2\2d\u02cc\3\2\2\2f\u02d7\3\2\2\2h\u02dc\3\2\2\2j\u02ed\3"+
		"\2\2\2l\u02f7\3\2\2\2n\u030a\3\2\2\2p\u030c\3\2\2\2r\u0316\3\2\2\2t\u0322"+
		"\3\2\2\2v\u0327\3\2\2\2xy\b\2\1\2yz\5\4\3\2z{\b\2\1\2{\3\3\2\2\2|}\b\3"+
		"\1\2}~\5\b\5\2~\u0082\b\3\1\2\177\u0081\5\6\4\2\u0080\177\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0085\u0086\b\3\1\2\u0086\u0087\b\3\1\2\u0087"+
		"\5\3\2\2\2\u0088\u0089\b\4\1\2\u0089\u008a\7\17\2\2\u008a\u008c\b\4\1"+
		"\2\u008b\u008d\5\b\5\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u008f\b\4\1\2\u008f\u0090\b\4\1\2\u0090\7\3\2\2\2\u0091"+
		"\u0092\b\5\1\2\u0092\u0093\5\n\6\2\u0093\u0094\b\5\1\2\u0094\u00a2\3\2"+
		"\2\2\u0095\u0096\b\5\1\2\u0096\u0097\5\f\7\2\u0097\u0098\b\5\1\2\u0098"+
		"\u00a2\3\2\2\2\u0099\u009a\b\5\1\2\u009a\u009b\5V,\2\u009b\u009c\b\5\1"+
		"\2\u009c\u00a2\3\2\2\2\u009d\u009e\b\5\1\2\u009e\u009f\5n8\2\u009f\u00a0"+
		"\b\5\1\2\u00a0\u00a2\3\2\2\2\u00a1\u0091\3\2\2\2\u00a1\u0095\3\2\2\2\u00a1"+
		"\u0099\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2\t\3\2\2\2\u00a3\u00a4\b\6\1\2"+
		"\u00a4\u00a5\7\3\2\2\u00a5\u00a6\7\34\2\2\u00a6\u00a7\7\13\2\2\u00a7\u00a8"+
		"\5\4\3\2\u00a8\u00a9\7\f\2\2\u00a9\u00aa\b\6\1\2\u00aa\13\3\2\2\2\u00ab"+
		"\u00ac\b\7\1\2\u00ac\u00ae\b\7\1\2\u00ad\u00af\5\16\b\2\u00ae\u00ad\3"+
		"\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\b\7\1\2\u00b1"+
		"\u00b2\5\20\t\2\u00b2\u00b3\7\7\2\2\u00b3\u00b4\5\22\n\2\u00b4\u00b5\b"+
		"\7\1\2\u00b5\r\3\2\2\2\u00b6\u00b7\b\b\1\2\u00b7\u00b8\5j\66\2\u00b8\u00ba"+
		"\b\b\1\2\u00b9\u00bb\5 \21\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bd\b\b\1\2\u00bd\u00be\7\6\2\2\u00be\u00bf\b\b"+
		"\1\2\u00bf\u00c5\3\2\2\2\u00c0\u00c1\b\b\1\2\u00c1\u00c2\5\24\13\2\u00c2"+
		"\u00c3\b\b\1\2\u00c3\u00c5\3\2\2\2\u00c4\u00b6\3\2\2\2\u00c4\u00c0\3\2"+
		"\2\2\u00c5\17\3\2\2\2\u00c6\u00c7\b\t\1\2\u00c7\u00c9\b\t\1\2\u00c8\u00ca"+
		"\5L\'\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\b\t\1\2\u00cc\u00cd\5j\66\2\u00cd\u00cf\b\t\1\2\u00ce\u00d0\5 "+
		"\21\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d2\b\t\1\2\u00d2\u00d3\b\t\1\2\u00d3\21\3\2\2\2\u00d4\u00d5\b\n\1"+
		"\2\u00d5\u00d6\5\32\16\2\u00d6\u00d7\b\n\1\2\u00d7\23\3\2\2\2\u00d8\u00d9"+
		"\b\13\1\2\u00d9\u00db\b\13\1\2\u00da\u00dc\5\26\f\2\u00db\u00da\3\2\2"+
		"\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df"+
		"\3\2\2\2\u00df\u00e0\b\13\1\2\u00e0\u00e1\b\13\1\2\u00e1\25\3\2\2\2\u00e2"+
		"\u00e3\b\f\1\2\u00e3\u00e4\7\30\2\2\u00e4\u00e5\5j\66\2\u00e5\u00e7\b"+
		"\f\1\2\u00e6\u00e8\5 \21\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00ea\b\f\1\2\u00ea\u00eb\b\f\1\2\u00eb\27\3\2\2"+
		"\2\u00ec\u00ed\b\r\1\2\u00ed\u00ee\5\32\16\2\u00ee\u00ef\b\r\1\2\u00ef"+
		"\u00f5\3\2\2\2\u00f0\u00f1\b\r\1\2\u00f1\u00f2\5\34\17\2\u00f2\u00f3\b"+
		"\r\1\2\u00f3\u00f5\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f5"+
		"\31\3\2\2\2\u00f6\u00f7\b\16\1\2\u00f7\u00f9\b\16\1\2\u00f8\u00fa\5\24"+
		"\13\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fc\b\16\1\2\u00fc\u00fd\5j\66\2\u00fd\u00ff\b\16\1\2\u00fe\u0100\5"+
		" \21\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0102\b\16\1\2\u0102\u0103\b\16\1\2\u0103\u0153\3\2\2\2\u0104\u0105\b"+
		"\16\1\2\u0105\u0107\b\16\1\2\u0106\u0108\5\24\13\2\u0107\u0106\3\2\2\2"+
		"\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\b\16\1\2\u010a\u010b"+
		"\5j\66\2\u010b\u010c\5\30\r\2\u010c\u010d\b\16\1\2\u010d\u0153\3\2\2\2"+
		"\u010e\u010f\b\16\1\2\u010f\u0111\b\16\1\2\u0110\u0112\5\24\13\2\u0111"+
		"\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\b\16"+
		"\1\2\u0114\u0115\58\35\2\u0115\u0116\b\16\1\2\u0116\u0153\3\2\2\2\u0117"+
		"\u0118\b\16\1\2\u0118\u011a\b\16\1\2\u0119\u011b\5\24\13\2\u011a\u0119"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\b\16\1\2"+
		"\u011d\u011e\5,\27\2\u011e\u011f\b\16\1\2\u011f\u0153\3\2\2\2\u0120\u0121"+
		"\b\16\1\2\u0121\u0123\b\16\1\2\u0122\u0124\5\24\13\2\u0123\u0122\3\2\2"+
		"\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\b\16\1\2\u0126"+
		"\u0127\5\62\32\2\u0127\u0128\b\16\1\2\u0128\u0153\3\2\2\2\u0129\u012a"+
		"\b\16\1\2\u012a\u012c\b\16\1\2\u012b\u012d\5\24\13\2\u012c\u012b\3\2\2"+
		"\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\b\16\1\2\u012f"+
		"\u0130\5L\'\2\u0130\u0131\5\30\r\2\u0131\u0132\b\16\1\2\u0132\u0153\3"+
		"\2\2\2\u0133\u0134\b\16\1\2\u0134\u0136\b\16\1\2\u0135\u0137\5\24\13\2"+
		"\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139"+
		"\b\16\1\2\u0139\u013a\5L\'\2\u013a\u013b\b\16\1\2\u013b\u0153\3\2\2\2"+
		"\u013c\u013d\b\16\1\2\u013d\u013f\b\16\1\2\u013e\u0140\5\24\13\2\u013f"+
		"\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\b\16"+
		"\1\2\u0142\u0143\7\33\2\2\u0143\u0145\b\16\1\2\u0144\u0146\5&\24\2\u0145"+
		"\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\b\16"+
		"\1\2\u0148\u0153\b\16\1\2\u0149\u014a\b\16\1\2\u014a\u014c\b\16\1\2\u014b"+
		"\u014d\5\24\13\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3"+
		"\2\2\2\u014e\u014f\b\16\1\2\u014f\u0150\5T+\2\u0150\u0151\b\16\1\2\u0151"+
		"\u0153\3\2\2\2\u0152\u00f6\3\2\2\2\u0152\u0104\3\2\2\2\u0152\u010e\3\2"+
		"\2\2\u0152\u0117\3\2\2\2\u0152\u0120\3\2\2\2\u0152\u0129\3\2\2\2\u0152"+
		"\u0133\3\2\2\2\u0152\u013c\3\2\2\2\u0152\u0149\3\2\2\2\u0153\33\3\2\2"+
		"\2\u0154\u0155\b\17\1\2\u0155\u0156\5:\36\2\u0156\u0157\5\36\20\2\u0157"+
		"\u0158\b\17\1\2\u0158\35\3\2\2\2\u0159\u015a\b\20\1\2\u015a\u015b\5:\36"+
		"\2\u015b\u015c\5\36\20\2\u015c\u015d\b\20\1\2\u015d\u0164\3\2\2\2\u015e"+
		"\u015f\b\20\1\2\u015f\u0160\7\23\2\2\u0160\u0161\5\32\16\2\u0161\u0162"+
		"\b\20\1\2\u0162\u0164\3\2\2\2\u0163\u0159\3\2\2\2\u0163\u015e\3\2\2\2"+
		"\u0164\37\3\2\2\2\u0165\u0166\b\21\1\2\u0166\u0167\7\r\2\2\u0167\u0169"+
		"\b\21\1\2\u0168\u016a\5\"\22\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2"+
		"\u016a\u016b\3\2\2\2\u016b\u016c\b\21\1\2\u016c\u016d\7\16\2\2\u016d\u016e"+
		"\b\21\1\2\u016e!\3\2\2\2\u016f\u0170\b\22\1\2\u0170\u0171\5\30\r\2\u0171"+
		"\u0175\b\22\1\2\u0172\u0174\5$\23\2\u0173\u0172\3\2\2\2\u0174\u0177\3"+
		"\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177"+
		"\u0175\3\2\2\2\u0178\u0179\b\22\1\2\u0179\u017a\b\22\1\2\u017a#\3\2\2"+
		"\2\u017b\u017c\b\23\1\2\u017c\u017d\7\20\2\2\u017d\u017e\5\30\r\2\u017e"+
		"\u017f\b\23\1\2\u017f%\3\2\2\2\u0180\u0181\b\24\1\2\u0181\u0182\7\r\2"+
		"\2\u0182\u0184\b\24\1\2\u0183\u0185\5(\25\2\u0184\u0183\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\b\24\1\2\u0187\u0188\7"+
		"\16\2\2\u0188\u0189\b\24\1\2\u0189\'\3\2\2\2\u018a\u018b\b\25\1\2\u018b"+
		"\u018c\5\32\16\2\u018c\u0190\b\25\1\2\u018d\u018f\5*\26\2\u018e\u018d"+
		"\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0194\b\25\1\2\u0194\u0195\b"+
		"\25\1\2\u0195)\3\2\2\2\u0196\u0197\b\26\1\2\u0197\u0198\7\20\2\2\u0198"+
		"\u0199\5\32\16\2\u0199\u019a\b\26\1\2\u019a+\3\2\2\2\u019b\u019c\b\27"+
		"\1\2\u019c\u019d\7\t\2\2\u019d\u019f\b\27\1\2\u019e\u01a0\5.\30\2\u019f"+
		"\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\b\27"+
		"\1\2\u01a2\u01a3\7\n\2\2\u01a3\u01a4\b\27\1\2\u01a4-\3\2\2\2\u01a5\u01a6"+
		"\b\30\1\2\u01a6\u01a7\5\30\r\2\u01a7\u01ab\b\30\1\2\u01a8\u01aa\5\60\31"+
		"\2\u01a9\u01a8\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac"+
		"\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\b\30\1\2"+
		"\u01af\u01b0\b\30\1\2\u01b0/\3\2\2\2\u01b1\u01b2\b\31\1\2\u01b2\u01b3"+
		"\7\17\2\2\u01b3\u01b5\b\31\1\2\u01b4\u01b6\5\30\r\2\u01b5\u01b4\3\2\2"+
		"\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\b\31\1\2\u01b8"+
		"\u01b9\b\31\1\2\u01b9\61\3\2\2\2\u01ba\u01bb\b\32\1\2\u01bb\u01bc\7\32"+
		"\2\2\u01bc\u01be\b\32\1\2\u01bd\u01bf\5\64\33\2\u01be\u01bd\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\b\32\1\2\u01c1\u01c3\b"+
		"\32\1\2\u01c2\u01c4\5\66\34\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2"+
		"\u01c4\u01c5\3\2\2\2\u01c5\u01c6\b\32\1\2\u01c6\u01c8\b\32\1\2\u01c7\u01c9"+
		"\5<\37\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca"+
		"\u01cb\b\32\1\2\u01cb\u01cc\b\32\1\2\u01cc\63\3\2\2\2\u01cd\u01ce\b\33"+
		"\1\2\u01ce\u01cf\7\25\2\2\u01cf\u01d0\b\33\1\2\u01d0\65\3\2\2\2\u01d1"+
		"\u01d2\b\34\1\2\u01d2\u01d3\7\26\2\2\u01d3\u01d4\b\34\1\2\u01d4\67\3\2"+
		"\2\2\u01d5\u01d6\b\35\1\2\u01d6\u01d7\7\34\2\2\u01d7\u01dc\b\35\1\2\u01d8"+
		"\u01d9\b\35\1\2\u01d9\u01da\7\35\2\2\u01da\u01dc\b\35\1\2\u01db\u01d5"+
		"\3\2\2\2\u01db\u01d8\3\2\2\2\u01dc9\3\2\2\2\u01dd\u01de\b\36\1\2\u01de"+
		"\u01e0\b\36\1\2\u01df\u01e1\5\24\13\2\u01e0\u01df\3\2\2\2\u01e0\u01e1"+
		"\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\b\36\1\2\u01e3\u01e4\5\62\32"+
		"\2\u01e4\u01e5\b\36\1\2\u01e5;\3\2\2\2\u01e6\u01e7\b\37\1\2\u01e7\u01e8"+
		"\7\22\2\2\u01e8\u01e9\5`\61\2\u01e9\u01ea\b\37\1\2\u01ea=\3\2\2\2\u01eb"+
		"\u01ec\b \1\2\u01ec\u01ed\7\4\2\2\u01ed\u01ee\5@!\2\u01ee\u01ef\5D#\2"+
		"\u01ef\u01f1\b \1\2\u01f0\u01f2\5J&\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2"+
		"\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\b \1\2\u01f4\u01f5\b \1\2\u01f5"+
		"?\3\2\2\2\u01f6\u01f7\b!\1\2\u01f7\u01f8\5\30\r\2\u01f8\u01fc\b!\1\2\u01f9"+
		"\u01fb\5B\"\2\u01fa\u01f9\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2"+
		"\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff"+
		"\u0200\b!\1\2\u0200\u0201\b!\1\2\u0201A\3\2\2\2\u0202\u0203\b\"\1\2\u0203"+
		"\u0204\7\27\2\2\u0204\u0205\5\30\r\2\u0205\u0206\b\"\1\2\u0206C\3\2\2"+
		"\2\u0207\u0208\b#\1\2\u0208\u0209\5H%\2\u0209\u020d\b#\1\2\u020a\u020c"+
		"\5F$\2\u020b\u020a\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d"+
		"\u020e\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211\b#"+
		"\1\2\u0211\u0212\b#\1\2\u0212E\3\2\2\2\u0213\u0214\b$\1\2\u0214\u0215"+
		"\7\17\2\2\u0215\u0216\5H%\2\u0216\u0217\b$\1\2\u0217G\3\2\2\2\u0218\u0219"+
		"\b%\1\2\u0219\u021a\5\f\7\2\u021a\u021b\b%\1\2\u021bI\3\2\2\2\u021c\u021d"+
		"\b&\1\2\u021d\u021e\7\5\2\2\u021e\u021f\b&\1\2\u021fK\3\2\2\2\u0220\u0221"+
		"\b\'\1\2\u0221\u0222\7\13\2\2\u0222\u0224\b\'\1\2\u0223\u0225\5N(\2\u0224"+
		"\u0223\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\b\'"+
		"\1\2\u0227\u0228\7\f\2\2\u0228\u0229\b\'\1\2\u0229M\3\2\2\2\u022a\u022b"+
		"\b(\1\2\u022b\u022c\5R*\2\u022c\u0230\b(\1\2\u022d\u022f\5P)\2\u022e\u022d"+
		"\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231"+
		"\u0233\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0234\b(\1\2\u0234\u0235\b(\1"+
		"\2\u0235O\3\2\2\2\u0236\u0237\b)\1\2\u0237\u0238\7\17\2\2\u0238\u023a"+
		"\b)\1\2\u0239\u023b\5R*\2\u023a\u0239\3\2\2\2\u023a\u023b\3\2\2\2\u023b"+
		"\u023c\3\2\2\2\u023c\u023d\b)\1\2\u023d\u023e\b)\1\2\u023eQ\3\2\2\2\u023f"+
		"\u0240\b*\1\2\u0240\u0241\7\33\2\2\u0241\u026d\b*\1\2\u0242\u0243\b*\1"+
		"\2\u0243\u0244\7\24\2\2\u0244\u0245\7\33\2\2\u0245\u026d\b*\1\2\u0246"+
		"\u0247\b*\1\2\u0247\u0248\7\33\2\2\u0248\u0249\7\6\2\2\u0249\u024a\5\30"+
		"\r\2\u024a\u024b\b*\1\2\u024b\u026d\3\2\2\2\u024c\u024d\b*\1\2\u024d\u024e"+
		"\7\32\2\2\u024e\u026d\b*\1\2\u024f\u0250\b*\1\2\u0250\u0251\7\24\2\2\u0251"+
		"\u0252\7\32\2\2\u0252\u026d\b*\1\2\u0253\u0254\b*\1\2\u0254\u0255\7\32"+
		"\2\2\u0255\u0256\7\6\2\2\u0256\u0257\5\30\r\2\u0257\u0258\b*\1\2\u0258"+
		"\u026d\3\2\2\2\u0259\u025a\b*\1\2\u025a\u025b\7\34\2\2\u025b\u026d\b*"+
		"\1\2\u025c\u025d\b*\1\2\u025d\u025e\7\24\2\2\u025e\u025f\7\34\2\2\u025f"+
		"\u026d\b*\1\2\u0260\u0261\b*\1\2\u0261\u0262\7\34\2\2\u0262\u0263\7\6"+
		"\2\2\u0263\u0264\5\30\r\2\u0264\u0265\b*\1\2\u0265\u026d\3\2\2\2\u0266"+
		"\u0267\b*\1\2\u0267\u0268\5j\66\2\u0268\u0269\7\6\2\2\u0269\u026a\5\30"+
		"\r\2\u026a\u026b\b*\1\2\u026b\u026d\3\2\2\2\u026c\u023f\3\2\2\2\u026c"+
		"\u0242\3\2\2\2\u026c\u0246\3\2\2\2\u026c\u024c\3\2\2\2\u026c\u024f\3\2"+
		"\2\2\u026c\u0253\3\2\2\2\u026c\u0259\3\2\2\2\u026c\u025c\3\2\2\2\u026c"+
		"\u0260\3\2\2\2\u026c\u0266\3\2\2\2\u026dS\3\2\2\2\u026e\u026f\b+\1\2\u026f"+
		"\u0270\5> \2\u0270\u0271\b+\1\2\u0271U\3\2\2\2\u0272\u0273\b,\1\2\u0273"+
		"\u0275\b,\1\2\u0274\u0276\5X-\2\u0275\u0274\3\2\2\2\u0275\u0276\3\2\2"+
		"\2\u0276\u0277\3\2\2\2\u0277\u0278\b,\1\2\u0278\u0279\5Z.\2\u0279\u027a"+
		"\5`\61\2\u027a\u027b\7\21\2\2\u027b\u027c\7\t\2\2\u027c\u027d\5d\63\2"+
		"\u027d\u027e\7\n\2\2\u027e\u027f\b,\1\2\u027f\u028d\3\2\2\2\u0280\u0281"+
		"\b,\1\2\u0281\u0283\b,\1\2\u0282\u0284\5X-\2\u0283\u0282\3\2\2\2\u0283"+
		"\u0284\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\b,\1\2\u0286\u0287\5Z."+
		"\2\u0287\u0288\5h\65\2\u0288\u0289\7\22\2\2\u0289\u028a\5`\61\2\u028a"+
		"\u028b\b,\1\2\u028b\u028d\3\2\2\2\u028c\u0272\3\2\2\2\u028c\u0280\3\2"+
		"\2\2\u028dW\3\2\2\2\u028e\u028f\b-\1\2\u028f\u0290\7\b\2\2\u0290\u0292"+
		"\b-\1\2\u0291\u0293\5\62\32\2\u0292\u0291\3\2\2\2\u0293\u0294\3\2\2\2"+
		"\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297"+
		"\b-\1\2\u0297\u0298\7\23\2\2\u0298\u0299\b-\1\2\u0299Y\3\2\2\2\u029a\u029b"+
		"\b.\1\2\u029b\u029d\b.\1\2\u029c\u029e\5L\'\2\u029d\u029c\3\2\2\2\u029d"+
		"\u029e\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\b.\1\2\u02a0\u02a1\b.\1"+
		"\2\u02a1[\3\2\2\2\u02a2\u02a3\b/\1\2\u02a3\u02a4\5`\61\2\u02a4\u02a8\b"+
		"/\1\2\u02a5\u02a7\5^\60\2\u02a6\u02a5\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8"+
		"\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ab\3\2\2\2\u02aa\u02a8\3\2"+
		"\2\2\u02ab\u02ac\b/\1\2\u02ac\u02ad\b/\1\2\u02ad]\3\2\2\2\u02ae\u02af"+
		"\b\60\1\2\u02af\u02b0\7\20\2\2\u02b0\u02b1\5`\61\2\u02b1\u02b2\b\60\1"+
		"\2\u02b2_\3\2\2\2\u02b3\u02b4\b\61\1\2\u02b4\u02b5\5j\66\2\u02b5\u02b7"+
		"\b\61\1\2\u02b6\u02b8\5b\62\2\u02b7\u02b6\3\2\2\2\u02b7\u02b8\3\2\2\2"+
		"\u02b8\u02b9\3\2\2\2\u02b9\u02ba\b\61\1\2\u02ba\u02bb\b\61\1\2\u02bb\u02c1"+
		"\3\2\2\2\u02bc\u02bd\b\61\1\2\u02bd\u02be\5\62\32\2\u02be\u02bf\b\61\1"+
		"\2\u02bf\u02c1\3\2\2\2\u02c0\u02b3\3\2\2\2\u02c0\u02bc\3\2\2\2\u02c1a"+
		"\3\2\2\2\u02c2\u02c3\b\62\1\2\u02c3\u02c4\7\r\2\2\u02c4\u02c6\b\62\1\2"+
		"\u02c5\u02c7\5\\/\2\u02c6\u02c5\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8"+
		"\3\2\2\2\u02c8\u02c9\b\62\1\2\u02c9\u02ca\7\16\2\2\u02ca\u02cb\b\62\1"+
		"\2\u02cbc\3\2\2\2\u02cc\u02cd\b\63\1\2\u02cd\u02d1\b\63\1\2\u02ce\u02d0"+
		"\5f\64\2\u02cf\u02ce\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1"+
		"\u02d2\3\2\2\2\u02d2\u02d4\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d4\u02d5\b\63"+
		"\1\2\u02d5\u02d6\b\63\1\2\u02d6e\3\2\2\2\u02d7\u02d8\b\64\1\2\u02d8\u02d9"+
		"\5h\65\2\u02d9\u02da\7\17\2\2\u02da\u02db\b\64\1\2\u02dbg\3\2\2\2\u02dc"+
		"\u02dd\b\65\1\2\u02dd\u02de\5j\66\2\u02de\u02e0\b\65\1\2\u02df\u02e1\5"+
		" \21\2\u02e0\u02df\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2"+
		"\u02e3\b\65\1\2\u02e3\u02e4\b\65\1\2\u02e4i\3\2\2\2\u02e5\u02e6\b\66\1"+
		"\2\u02e6\u02e7\5l\67\2\u02e7\u02e8\7\31\2\2\u02e8\u02e9\b\66\1\2\u02e9"+
		"\u02ee\3\2\2\2\u02ea\u02eb\b\66\1\2\u02eb\u02ec\7\6\2\2\u02ec\u02ee\b"+
		"\66\1\2\u02ed\u02e5\3\2\2\2\u02ed\u02ea\3\2\2\2\u02eek\3\2\2\2\u02ef\u02f0"+
		"\b\67\1\2\u02f0\u02f1\7\31\2\2\u02f1\u02f2\7\23\2\2\u02f2\u02f3\5l\67"+
		"\2\u02f3\u02f4\b\67\1\2\u02f4\u02f8\3\2\2\2\u02f5\u02f6\b\67\1\2\u02f6"+
		"\u02f8\b\67\1\2\u02f7\u02ef\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8m\3\2\2\2"+
		"\u02f9\u02fa\b8\1\2\u02fa\u02fb\5j\66\2\u02fb\u02fd\b8\1\2\u02fc\u02fe"+
		"\5p9\2\u02fd\u02fc\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff"+
		"\u0300\b8\1\2\u0300\u0301\b8\1\2\u0301\u030b\3\2\2\2\u0302\u0303\b8\1"+
		"\2\u0303\u0304\5v<\2\u0304\u0305\b8\1\2\u0305\u030b\3\2\2\2\u0306\u0307"+
		"\b8\1\2\u0307\u0308\58\35\2\u0308\u0309\b8\1\2\u0309\u030b\3\2\2\2\u030a"+
		"\u02f9\3\2\2\2\u030a\u0302\3\2\2\2\u030a\u0306\3\2\2\2\u030bo\3\2\2\2"+
		"\u030c\u030d\b9\1\2\u030d\u030e\7\r\2\2\u030e\u0310\b9\1\2\u030f\u0311"+
		"\5r:\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\3\2\2\2\u0312"+
		"\u0313\b9\1\2\u0313\u0314\7\16\2\2\u0314\u0315\b9\1\2\u0315q\3\2\2\2\u0316"+
		"\u0317\b:\1\2\u0317\u0318\5n8\2\u0318\u031c\b:\1\2\u0319\u031b\5t;\2\u031a"+
		"\u0319\3\2\2\2\u031b\u031e\3\2\2\2\u031c\u031a\3\2\2\2\u031c\u031d\3\2"+
		"\2\2\u031d\u031f\3\2\2\2\u031e\u031c\3\2\2\2\u031f\u0320\b:\1\2\u0320"+
		"\u0321\b:\1\2\u0321s\3\2\2\2\u0322\u0323\b;\1\2\u0323\u0324\7\20\2\2\u0324"+
		"\u0325\5n8\2\u0325\u0326\b;\1\2\u0326u\3\2\2\2\u0327\u0328\b<\1\2\u0328"+
		"\u0329\7\t\2\2\u0329\u032b\b<\1\2\u032a\u032c\5\4\3\2\u032b\u032a\3\2"+
		"\2\2\u032b\u032c\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032e\b<\1\2\u032e"+
		"\u032f\7\n\2\2\u032f\u0330\b<\1\2\u0330w\3\2\2\2?\u0082\u008c\u00a1\u00ae"+
		"\u00ba\u00c4\u00c9\u00cf\u00dd\u00e7\u00f4\u00f9\u00ff\u0107\u0111\u011a"+
		"\u0123\u012c\u0136\u013f\u0145\u014c\u0152\u0163\u0169\u0175\u0184\u0190"+
		"\u019f\u01ab\u01b5\u01be\u01c3\u01c8\u01db\u01e0\u01f1\u01fc\u020d\u0224"+
		"\u0230\u023a\u026c\u0275\u0283\u028c\u0294\u029d\u02a8\u02b7\u02c0\u02c6"+
		"\u02d1\u02e0\u02ed\u02f7\u02fd\u030a\u0310\u031c\u032b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}