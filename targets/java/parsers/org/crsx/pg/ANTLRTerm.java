// Generated from /Users/villardl/Projects/crsx/crsx4/src/pg/ANTLRTerm.g4 by ANTLR 4.5
package org.crsx.pg;

    import org.crsx.pg.SinkAntlrListener;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ANTLRTerm extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TOKEN_REF=1, RULE_REF=2, LEXER_CHAR_SET=3, DOC_COMMENT=4, BLOCK_COMMENT=5, 
		LINE_COMMENT=6, BEGIN_ARG_ACTION=7, OPTIONS=8, TOKENS=9, IMPORT=10, FRAGMENT=11, 
		LEXER=12, PARSER=13, GRAMMAR=14, PROTECTED=15, PUBLIC=16, PRIVATE=17, 
		RETURNS=18, LOCALS=19, THROWS=20, CATCH=21, FINALLY=22, MODE=23, COLON=24, 
		COLONCOLON=25, COMMA=26, SEMI=27, LPAREN=28, RPAREN=29, RARROW=30, LT=31, 
		GT=32, ASSIGN=33, QUESTION=34, STAR=35, PLUS=36, PLUS_ASSIGN=37, OR=38, 
		DOLLAR=39, DOT=40, RANGE=41, AT=42, POUND=43, NOT=44, RBRACE=45, ID=46, 
		INT=47, STRING_LITERAL=48, UNTERMINATED_STRING_LITERAL=49, WS=50, ACTION=51, 
		ERRCHAR=52, ARG_ACTION=53, UNTERMINATED_ARG_ACTION=54, UNTERMINATED_CHAR_SET=55;
	public static final int
		RULE_grammarSpec = 0, RULE_grammarType = 1, RULE_grammarType_S1 = 2, RULE_prequelConstruct = 3, 
		RULE_optionsSpec = 4, RULE_optionsSpec_S1 = 5, RULE_option = 6, RULE_optionValue = 7, 
		RULE_optionValue1Sub1 = 8, RULE_delegateGrammars = 9, RULE_delegateGrammarsSub1 = 10, 
		RULE_delegateGrammar = 11, RULE_tokensSpec = 12, RULE_action = 13, RULE_action_S1 = 14, 
		RULE_actionScopeName = 15, RULE_modeSpec = 16, RULE_rules = 17, RULE_ruleSpec = 18, 
		RULE_parserRuleSpec = 19, RULE_exceptionGroup = 20, RULE_exceptionHandler = 21, 
		RULE_finallyClause = 22, RULE_rulePrequel = 23, RULE_ruleReturns = 24, 
		RULE_throwsSpec = 25, RULE_localsSpec = 26, RULE_ruleAction = 27, RULE_ruleModifiers = 28, 
		RULE_ruleModifier = 29, RULE_ruleBlock = 30, RULE_ruleAltList = 31, RULE_ruleAltList_S1 = 32, 
		RULE_labeledAlt = 33, RULE_labeledAlt_S1 = 34, RULE_lexerRule = 35, RULE_lexerRuleBlock = 36, 
		RULE_lexerAltList = 37, RULE_lexerAltList_S1 = 38, RULE_lexerAlt = 39, 
		RULE_lexerElements = 40, RULE_lexerElement = 41, RULE_labeledLexerElement = 42, 
		RULE_labeledLexerElement_S1 = 43, RULE_labeledLexerElement_S2 = 44, RULE_lexerBlock = 45, 
		RULE_lexerCommands = 46, RULE_lexerCommands_S1 = 47, RULE_lexerCommand = 48, 
		RULE_lexerCommandName = 49, RULE_lexerCommandExpr = 50, RULE_altList = 51, 
		RULE_altList_S1 = 52, RULE_alternative = 53, RULE_element = 54, RULE_element_A1_S1 = 55, 
		RULE_element_A2_S1 = 56, RULE_labeledElement = 57, RULE_labeledElement_S1 = 58, 
		RULE_labeledElement_S2 = 59, RULE_ebnf = 60, RULE_blockSuffix = 61, RULE_ebnfSuffix = 62, 
		RULE_lexerAtom = 63, RULE_atom = 64, RULE_notSet = 65, RULE_blockSet = 66, 
		RULE_blockSet_S1 = 67, RULE_setElement = 68, RULE_block = 69, RULE_block_S1 = 70, 
		RULE_ruleref = 71, RULE_range = 72, RULE_terminal = 73, RULE_elementOptions = 74, 
		RULE_elementOptions_S1 = 75, RULE_elementOption = 76, RULE_elementOption_S1 = 77, 
		RULE_id = 78;
	public static final String[] ruleNames = {
		"grammarSpec", "grammarType", "grammarType_S1", "prequelConstruct", "optionsSpec", 
		"optionsSpec_S1", "option", "optionValue", "optionValue1Sub1", "delegateGrammars", 
		"delegateGrammarsSub1", "delegateGrammar", "tokensSpec", "action", "action_S1", 
		"actionScopeName", "modeSpec", "rules", "ruleSpec", "parserRuleSpec", 
		"exceptionGroup", "exceptionHandler", "finallyClause", "rulePrequel", 
		"ruleReturns", "throwsSpec", "localsSpec", "ruleAction", "ruleModifiers", 
		"ruleModifier", "ruleBlock", "ruleAltList", "ruleAltList_S1", "labeledAlt", 
		"labeledAlt_S1", "lexerRule", "lexerRuleBlock", "lexerAltList", "lexerAltList_S1", 
		"lexerAlt", "lexerElements", "lexerElement", "labeledLexerElement", "labeledLexerElement_S1", 
		"labeledLexerElement_S2", "lexerBlock", "lexerCommands", "lexerCommands_S1", 
		"lexerCommand", "lexerCommandName", "lexerCommandExpr", "altList", "altList_S1", 
		"alternative", "element", "element_A1_S1", "element_A2_S1", "labeledElement", 
		"labeledElement_S1", "labeledElement_S2", "ebnf", "blockSuffix", "ebnfSuffix", 
		"lexerAtom", "atom", "notSet", "blockSet", "blockSet_S1", "setElement", 
		"block", "block_S1", "ruleref", "range", "terminal", "elementOptions", 
		"elementOptions_S1", "elementOption", "elementOption_S1", "id"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "'import'", 
		"'fragment'", "'lexer'", "'parser'", "'grammar'", "'protected'", "'public'", 
		"'private'", "'returns'", "'locals'", "'throws'", "'catch'", "'finally'", 
		"'mode'", "':'", "'::'", "','", "';'", "'('", "')'", "'->'", "'<'", "'>'", 
		"'='", "'?'", "'*'", "'+'", "'+='", "'|'", "'$'", "'.'", "'..'", "'@'", 
		"'#'", "'~'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TOKEN_REF", "RULE_REF", "LEXER_CHAR_SET", "DOC_COMMENT", "BLOCK_COMMENT", 
		"LINE_COMMENT", "BEGIN_ARG_ACTION", "OPTIONS", "TOKENS", "IMPORT", "FRAGMENT", 
		"LEXER", "PARSER", "GRAMMAR", "PROTECTED", "PUBLIC", "PRIVATE", "RETURNS", 
		"LOCALS", "THROWS", "CATCH", "FINALLY", "MODE", "COLON", "COLONCOLON", 
		"COMMA", "SEMI", "LPAREN", "RPAREN", "RARROW", "LT", "GT", "ASSIGN", "QUESTION", 
		"STAR", "PLUS", "PLUS_ASSIGN", "OR", "DOLLAR", "DOT", "RANGE", "AT", "POUND", 
		"NOT", "RBRACE", "ID", "INT", "STRING_LITERAL", "UNTERMINATED_STRING_LITERAL", 
		"WS", "ACTION", "ERRCHAR", "ARG_ACTION", "UNTERMINATED_ARG_ACTION", "UNTERMINATED_CHAR_SET"
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
	public String getGrammarFileName() { return "ANTLRTerm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    protected void enterZOM()
	    {
	        if ( _parseListeners != null)
	            for (ParseTreeListener listener : _parseListeners)
	               if (listener instanceof SinkAntlrListener) 
	                   ((SinkAntlrListener) listener).enterZOM(_ctx);
	    }
	    
	    protected void exitZOM()
	    {
	        if ( _parseListeners != null)
	            for (ParseTreeListener listener : _parseListeners) 
	                if (listener instanceof SinkAntlrListener) 
	                    ((SinkAntlrListener) listener).exitZOM(_ctx);
	    }
	    
	    protected void enterOOM()
	    {
	        enterZOM();
	    }
	    
	    protected void exitOOM()
	    {
	        exitZOM();
	    }
	    
	    protected void enterOPT()
	    {
	        if ( _parseListeners != null)
	            for (ParseTreeListener listener : _parseListeners)
	                if (listener instanceof SinkAntlrListener) 
	                    ((SinkAntlrListener) listener).enterOPT(_ctx);
	    }
	    
	    protected void exitOPT()
	    {
	        if ( _parseListeners != null)
	            for (ParseTreeListener listener : _parseListeners)
	                if (listener instanceof SinkAntlrListener) 
	                    ((SinkAntlrListener) listener).exitOPT(_ctx);
	    }
	    
	    protected void enterAlt(String name)
	    {
	        if ( _parseListeners != null)
	            for (ParseTreeListener listener : _parseListeners)
	                if (listener instanceof SinkAntlrListener) 
	                    ((SinkAntlrListener) listener).enterAlt(_ctx, name);
	    }
	    
	    protected void enterAlt()
	    {
	        if ( _parseListeners != null)
	            for (ParseTreeListener listener : _parseListeners)
	                if (listener instanceof SinkAntlrListener) 
	                    ((SinkAntlrListener) listener).enterAlt(_ctx);
	    }
	    
	    protected void exitAlt()
	    {
	        if ( _parseListeners != null)
	            for (ParseTreeListener listener : _parseListeners)
	                if (listener instanceof SinkAntlrListener) 
	                    ((SinkAntlrListener) listener).exitAlt(_ctx);
	    }
	    
	    
	    protected void hide()
	    {
	        if ( _parseListeners != null)
	            for (ParseTreeListener listener : _parseListeners)
	                if (listener instanceof SinkAntlrListener) 
	                    ((SinkAntlrListener) listener).hide(_ctx);
	    }

	public ANTLRTerm(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GrammarSpecContext extends ParserRuleContext {
		public GrammarTypeContext grammarType() {
			return getRuleContext(GrammarTypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ANTLRTerm.SEMI, 0); }
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ANTLRTerm.EOF, 0); }
		public TerminalNode DOC_COMMENT() { return getToken(ANTLRTerm.DOC_COMMENT, 0); }
		public List<PrequelConstructContext> prequelConstruct() {
			return getRuleContexts(PrequelConstructContext.class);
		}
		public PrequelConstructContext prequelConstruct(int i) {
			return getRuleContext(PrequelConstructContext.class,i);
		}
		public List<ModeSpecContext> modeSpec() {
			return getRuleContexts(ModeSpecContext.class);
		}
		public ModeSpecContext modeSpec(int i) {
			return getRuleContext(ModeSpecContext.class,i);
		}
		public GrammarSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterGrammarSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitGrammarSpec(this);
		}
	}

	public final GrammarSpecContext grammarSpec() throws RecognitionException {
		GrammarSpecContext _localctx = new GrammarSpecContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_grammarSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			enterOPT();
			setState(161);
			_la = _input.LA(1);
			if (_la==DOC_COMMENT) {
				{
				setState(160);
				match(DOC_COMMENT);
				}
			}

			exitOPT();
			setState(164);
			grammarType();
			setState(165);
			id();
			setState(166);
			match(SEMI);
			enterZOM();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPTIONS) | (1L << TOKENS) | (1L << IMPORT) | (1L << AT))) != 0)) {
				{
				{
				setState(168);
				prequelConstruct();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			exitZOM();
			setState(175);
			rules();
			enterZOM();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODE) {
				{
				{
				setState(177);
				modeSpec();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			exitZOM();
			hide();
			setState(185);
			match(EOF);
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarTypeContext extends ParserRuleContext {
		public GrammarType_S1Context grammarType_S1() {
			return getRuleContext(GrammarType_S1Context.class,0);
		}
		public GrammarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterGrammarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitGrammarType(this);
		}
	}

	public final GrammarTypeContext grammarType() throws RecognitionException {
		GrammarTypeContext _localctx = new GrammarTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_grammarType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(189);
			grammarType_S1();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarType_S1Context extends ParserRuleContext {
		public TerminalNode LEXER() { return getToken(ANTLRTerm.LEXER, 0); }
		public TerminalNode GRAMMAR() { return getToken(ANTLRTerm.GRAMMAR, 0); }
		public TerminalNode PARSER() { return getToken(ANTLRTerm.PARSER, 0); }
		public GrammarType_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarType_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterGrammarType_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitGrammarType_S1(this);
		}
	}

	public final GrammarType_S1Context grammarType_S1() throws RecognitionException {
		GrammarType_S1Context _localctx = new GrammarType_S1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_grammarType_S1);
		try {
			setState(203);
			switch (_input.LA(1)) {
			case LEXER:
				enterOuterAlt(_localctx, 1);
				{
				enterAlt("1");
				setState(193);
				match(LEXER);
				setState(194);
				match(GRAMMAR);
				exitAlt();
				}
				break;
			case PARSER:
				enterOuterAlt(_localctx, 2);
				{
				enterAlt("2");
				setState(197);
				match(PARSER);
				setState(198);
				match(GRAMMAR);
				exitAlt();
				}
				break;
			case GRAMMAR:
				enterOuterAlt(_localctx, 3);
				{
				enterAlt("3");
				setState(201);
				match(GRAMMAR);
				exitAlt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrequelConstructContext extends ParserRuleContext {
		public OptionsSpecContext optionsSpec() {
			return getRuleContext(OptionsSpecContext.class,0);
		}
		public DelegateGrammarsContext delegateGrammars() {
			return getRuleContext(DelegateGrammarsContext.class,0);
		}
		public TokensSpecContext tokensSpec() {
			return getRuleContext(TokensSpecContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public PrequelConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prequelConstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterPrequelConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitPrequelConstruct(this);
		}
	}

	public final PrequelConstructContext prequelConstruct() throws RecognitionException {
		PrequelConstructContext _localctx = new PrequelConstructContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prequelConstruct);
		try {
			setState(221);
			switch (_input.LA(1)) {
			case OPTIONS:
				enterOuterAlt(_localctx, 1);
				{
				enterAlt("1");
				setState(206);
				optionsSpec();
				exitAlt();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				enterAlt("2");
				setState(210);
				delegateGrammars();
				exitAlt();
				}
				break;
			case TOKENS:
				enterOuterAlt(_localctx, 3);
				{
				enterAlt("3");
				setState(214);
				tokensSpec();
				exitAlt();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 4);
				{
				enterAlt("4");
				setState(218);
				action();
				exitAlt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionsSpecContext extends ParserRuleContext {
		public TerminalNode OPTIONS() { return getToken(ANTLRTerm.OPTIONS, 0); }
		public TerminalNode RBRACE() { return getToken(ANTLRTerm.RBRACE, 0); }
		public List<OptionsSpec_S1Context> optionsSpec_S1() {
			return getRuleContexts(OptionsSpec_S1Context.class);
		}
		public OptionsSpec_S1Context optionsSpec_S1(int i) {
			return getRuleContext(OptionsSpec_S1Context.class,i);
		}
		public OptionsSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionsSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterOptionsSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitOptionsSpec(this);
		}
	}

	public final OptionsSpecContext optionsSpec() throws RecognitionException {
		OptionsSpecContext _localctx = new OptionsSpecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_optionsSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(224);
			match(OPTIONS);
			enterZOM();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_REF || _la==RULE_REF) {
				{
				{
				setState(226);
				optionsSpec_S1();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			exitZOM();
			setState(233);
			match(RBRACE);
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionsSpec_S1Context extends ParserRuleContext {
		public OptionContext option() {
			return getRuleContext(OptionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ANTLRTerm.SEMI, 0); }
		public OptionsSpec_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionsSpec_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterOptionsSpec_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitOptionsSpec_S1(this);
		}
	}

	public final OptionsSpec_S1Context optionsSpec_S1() throws RecognitionException {
		OptionsSpec_S1Context _localctx = new OptionsSpec_S1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_optionsSpec_S1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(237);
			option();
			setState(238);
			match(SEMI);
			exitAlt();
			}
		}
		catch (RecognitionException re) {
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ANTLRTerm.ASSIGN, 0); }
		public OptionValueContext optionValue() {
			return getRuleContext(OptionValueContext.class,0);
		}
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitOption(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(242);
			id();
			setState(243);
			match(ASSIGN);
			setState(244);
			optionValue();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionValueContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<OptionValue1Sub1Context> optionValue1Sub1() {
			return getRuleContexts(OptionValue1Sub1Context.class);
		}
		public OptionValue1Sub1Context optionValue1Sub1(int i) {
			return getRuleContext(OptionValue1Sub1Context.class,i);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ANTLRTerm.STRING_LITERAL, 0); }
		public TerminalNode ACTION() { return getToken(ANTLRTerm.ACTION, 0); }
		public TerminalNode INT() { return getToken(ANTLRTerm.INT, 0); }
		public OptionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterOptionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitOptionValue(this);
		}
	}

	public final OptionValueContext optionValue() throws RecognitionException {
		OptionValueContext _localctx = new OptionValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_optionValue);
		int _la;
		try {
			setState(266);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
				enterOuterAlt(_localctx, 1);
				{
				enterAlt("1");
				setState(248);
				id();
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(249);
					optionValue1Sub1();
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				exitAlt();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				enterAlt("2");
				setState(258);
				match(STRING_LITERAL);
				exitAlt();
				}
				break;
			case ACTION:
				enterOuterAlt(_localctx, 3);
				{
				enterAlt("3");
				setState(261);
				match(ACTION);
				exitAlt();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				enterAlt("4");
				setState(264);
				match(INT);
				exitAlt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionValue1Sub1Context extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(ANTLRTerm.DOT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public OptionValue1Sub1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionValue1Sub1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterOptionValue1Sub1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitOptionValue1Sub1(this);
		}
	}

	public final OptionValue1Sub1Context optionValue1Sub1() throws RecognitionException {
		OptionValue1Sub1Context _localctx = new OptionValue1Sub1Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_optionValue1Sub1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(269);
			match(DOT);
			setState(270);
			id();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelegateGrammarsContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ANTLRTerm.IMPORT, 0); }
		public DelegateGrammarContext delegateGrammar() {
			return getRuleContext(DelegateGrammarContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ANTLRTerm.SEMI, 0); }
		public List<DelegateGrammarsSub1Context> delegateGrammarsSub1() {
			return getRuleContexts(DelegateGrammarsSub1Context.class);
		}
		public DelegateGrammarsSub1Context delegateGrammarsSub1(int i) {
			return getRuleContext(DelegateGrammarsSub1Context.class,i);
		}
		public DelegateGrammarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegateGrammars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterDelegateGrammars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitDelegateGrammars(this);
		}
	}

	public final DelegateGrammarsContext delegateGrammars() throws RecognitionException {
		DelegateGrammarsContext _localctx = new DelegateGrammarsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_delegateGrammars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(274);
			match(IMPORT);
			setState(275);
			delegateGrammar();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(276);
				delegateGrammarsSub1();
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
			match(SEMI);
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelegateGrammarsSub1Context extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(ANTLRTerm.COMMA, 0); }
		public DelegateGrammarContext delegateGrammar() {
			return getRuleContext(DelegateGrammarContext.class,0);
		}
		public DelegateGrammarsSub1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegateGrammarsSub1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterDelegateGrammarsSub1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitDelegateGrammarsSub1(this);
		}
	}

	public final DelegateGrammarsSub1Context delegateGrammarsSub1() throws RecognitionException {
		DelegateGrammarsSub1Context _localctx = new DelegateGrammarsSub1Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_delegateGrammarsSub1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(286);
			match(COMMA);
			setState(287);
			delegateGrammar();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelegateGrammarContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(ANTLRTerm.ASSIGN, 0); }
		public DelegateGrammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegateGrammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterDelegateGrammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitDelegateGrammar(this);
		}
	}

	public final DelegateGrammarContext delegateGrammar() throws RecognitionException {
		DelegateGrammarContext _localctx = new DelegateGrammarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_delegateGrammar);
		try {
			setState(295);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				id();
				setState(291);
				match(ASSIGN);
				setState(292);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				id();
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

	public static class TokensSpecContext extends ParserRuleContext {
		public TerminalNode TOKENS() { return getToken(ANTLRTerm.TOKENS, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(ANTLRTerm.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ANTLRTerm.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ANTLRTerm.COMMA, i);
		}
		public TokensSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokensSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterTokensSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitTokensSpec(this);
		}
	}

	public final TokensSpecContext tokensSpec() throws RecognitionException {
		TokensSpecContext _localctx = new TokensSpecContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tokensSpec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(TOKENS);
			setState(298);
			id();
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(299);
					match(COMMA);
					setState(300);
					id();
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(307);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(306);
				match(COMMA);
				}
			}

			setState(309);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ANTLRTerm.AT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(ANTLRTerm.ACTION, 0); }
		public Action_S1Context action_S1() {
			return getRuleContext(Action_S1Context.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(312);
			match(AT);
			enterOPT();
			setState(315);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(314);
				action_S1();
				}
				break;
			}
			exitOPT();
			setState(318);
			id();
			setState(319);
			match(ACTION);
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Action_S1Context extends ParserRuleContext {
		public ActionScopeNameContext actionScopeName() {
			return getRuleContext(ActionScopeNameContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(ANTLRTerm.COLONCOLON, 0); }
		public Action_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterAction_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitAction_S1(this);
		}
	}

	public final Action_S1Context action_S1() throws RecognitionException {
		Action_S1Context _localctx = new Action_S1Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_action_S1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(323);
			actionScopeName();
			setState(324);
			match(COLONCOLON);
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionScopeNameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LEXER() { return getToken(ANTLRTerm.LEXER, 0); }
		public TerminalNode PARSER() { return getToken(ANTLRTerm.PARSER, 0); }
		public ActionScopeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionScopeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterActionScopeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitActionScopeName(this);
		}
	}

	public final ActionScopeNameContext actionScopeName() throws RecognitionException {
		ActionScopeNameContext _localctx = new ActionScopeNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_actionScopeName);
		try {
			setState(337);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
				enterOuterAlt(_localctx, 1);
				{
				enterAlt("1");
				setState(328);
				id();
				exitAlt();
				}
				break;
			case LEXER:
				enterOuterAlt(_localctx, 2);
				{
				enterAlt("2");
				setState(332);
				match(LEXER);
				exitAlt();
				}
				break;
			case PARSER:
				enterOuterAlt(_localctx, 3);
				{
				enterAlt("3");
				setState(335);
				match(PARSER);
				exitAlt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModeSpecContext extends ParserRuleContext {
		public TerminalNode MODE() { return getToken(ANTLRTerm.MODE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ANTLRTerm.SEMI, 0); }
		public List<LexerRuleContext> lexerRule() {
			return getRuleContexts(LexerRuleContext.class);
		}
		public LexerRuleContext lexerRule(int i) {
			return getRuleContext(LexerRuleContext.class,i);
		}
		public ModeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterModeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitModeSpec(this);
		}
	}

	public final ModeSpecContext modeSpec() throws RecognitionException {
		ModeSpecContext _localctx = new ModeSpecContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_modeSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(MODE);
			setState(340);
			id();
			setState(341);
			match(SEMI);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_REF) | (1L << DOC_COMMENT) | (1L << FRAGMENT))) != 0)) {
				{
				{
				setState(342);
				lexerRule();
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulesContext extends ParserRuleContext {
		public List<RuleSpecContext> ruleSpec() {
			return getRuleContexts(RuleSpecContext.class);
		}
		public RuleSpecContext ruleSpec(int i) {
			return getRuleContext(RuleSpecContext.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitRules(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			enterZOM();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_REF) | (1L << RULE_REF) | (1L << DOC_COMMENT) | (1L << FRAGMENT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0)) {
				{
				{
				setState(350);
				ruleSpec();
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			exitZOM();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleSpecContext extends ParserRuleContext {
		public ParserRuleSpecContext parserRuleSpec() {
			return getRuleContext(ParserRuleSpecContext.class,0);
		}
		public LexerRuleContext lexerRule() {
			return getRuleContext(LexerRuleContext.class,0);
		}
		public RuleSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterRuleSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitRuleSpec(this);
		}
	}

	public final RuleSpecContext ruleSpec() throws RecognitionException {
		RuleSpecContext _localctx = new RuleSpecContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ruleSpec);
		try {
			setState(367);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				enterAlt("1");
				setState(360);
				parserRuleSpec();
				exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				enterAlt("2");
				setState(364);
				lexerRule();
				exitAlt();
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

	public static class ParserRuleSpecContext extends ParserRuleContext {
		public TerminalNode RULE_REF() { return getToken(ANTLRTerm.RULE_REF, 0); }
		public TerminalNode COLON() { return getToken(ANTLRTerm.COLON, 0); }
		public RuleBlockContext ruleBlock() {
			return getRuleContext(RuleBlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ANTLRTerm.SEMI, 0); }
		public ExceptionGroupContext exceptionGroup() {
			return getRuleContext(ExceptionGroupContext.class,0);
		}
		public TerminalNode DOC_COMMENT() { return getToken(ANTLRTerm.DOC_COMMENT, 0); }
		public RuleModifiersContext ruleModifiers() {
			return getRuleContext(RuleModifiersContext.class,0);
		}
		public TerminalNode ARG_ACTION() { return getToken(ANTLRTerm.ARG_ACTION, 0); }
		public RuleReturnsContext ruleReturns() {
			return getRuleContext(RuleReturnsContext.class,0);
		}
		public ThrowsSpecContext throwsSpec() {
			return getRuleContext(ThrowsSpecContext.class,0);
		}
		public LocalsSpecContext localsSpec() {
			return getRuleContext(LocalsSpecContext.class,0);
		}
		public List<RulePrequelContext> rulePrequel() {
			return getRuleContexts(RulePrequelContext.class);
		}
		public RulePrequelContext rulePrequel(int i) {
			return getRuleContext(RulePrequelContext.class,i);
		}
		public ParserRuleSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserRuleSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterParserRuleSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitParserRuleSpec(this);
		}
	}

	public final ParserRuleSpecContext parserRuleSpec() throws RecognitionException {
		ParserRuleSpecContext _localctx = new ParserRuleSpecContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parserRuleSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			enterOPT();
			setState(372);
			_la = _input.LA(1);
			if (_la==DOC_COMMENT) {
				{
				setState(371);
				match(DOC_COMMENT);
				}
			}

			exitOPT();
			enterOPT();
			setState(377);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0)) {
				{
				setState(376);
				ruleModifiers();
				}
			}

			exitOPT();
			setState(380);
			match(RULE_REF);
			enterOPT();
			setState(383);
			_la = _input.LA(1);
			if (_la==ARG_ACTION) {
				{
				setState(382);
				match(ARG_ACTION);
				}
			}

			exitOPT();
			enterOPT();
			setState(388);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(387);
				ruleReturns();
				}
			}

			 exitOPT(); 
			 enterOPT(); 
			setState(393);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(392);
				throwsSpec();
				}
			}

			 exitOPT(); 
			enterOPT();
			setState(398);
			_la = _input.LA(1);
			if (_la==LOCALS) {
				{
				setState(397);
				localsSpec();
				}
			}

			 exitOPT(); 
			enterZOM();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPTIONS || _la==AT) {
				{
				{
				setState(402);
				rulePrequel();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 exitZOM(); 
			setState(409);
			match(COLON);
			setState(410);
			ruleBlock();
			setState(411);
			match(SEMI);
			setState(412);
			exceptionGroup();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionGroupContext extends ParserRuleContext {
		public List<ExceptionHandlerContext> exceptionHandler() {
			return getRuleContexts(ExceptionHandlerContext.class);
		}
		public ExceptionHandlerContext exceptionHandler(int i) {
			return getRuleContext(ExceptionHandlerContext.class,i);
		}
		public FinallyClauseContext finallyClause() {
			return getRuleContext(FinallyClauseContext.class,0);
		}
		public ExceptionGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterExceptionGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitExceptionGroup(this);
		}
	}

	public final ExceptionGroupContext exceptionGroup() throws RecognitionException {
		ExceptionGroupContext _localctx = new ExceptionGroupContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exceptionGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			enterZOM();
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(417);
				exceptionHandler();
				}
				}
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			exitZOM();
			enterOPT();
			setState(426);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(425);
				finallyClause();
				}
			}

			exitOPT();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionHandlerContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(ANTLRTerm.CATCH, 0); }
		public TerminalNode ARG_ACTION() { return getToken(ANTLRTerm.ARG_ACTION, 0); }
		public TerminalNode ACTION() { return getToken(ANTLRTerm.ACTION, 0); }
		public ExceptionHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterExceptionHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitExceptionHandler(this);
		}
	}

	public final ExceptionHandlerContext exceptionHandler() throws RecognitionException {
		ExceptionHandlerContext _localctx = new ExceptionHandlerContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exceptionHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(CATCH);
			setState(432);
			match(ARG_ACTION);
			setState(433);
			match(ACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyClauseContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(ANTLRTerm.FINALLY, 0); }
		public TerminalNode ACTION() { return getToken(ANTLRTerm.ACTION, 0); }
		public FinallyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterFinallyClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitFinallyClause(this);
		}
	}

	public final FinallyClauseContext finallyClause() throws RecognitionException {
		FinallyClauseContext _localctx = new FinallyClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_finallyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(FINALLY);
			setState(436);
			match(ACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulePrequelContext extends ParserRuleContext {
		public OptionsSpecContext optionsSpec() {
			return getRuleContext(OptionsSpecContext.class,0);
		}
		public RuleActionContext ruleAction() {
			return getRuleContext(RuleActionContext.class,0);
		}
		public RulePrequelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulePrequel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterRulePrequel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitRulePrequel(this);
		}
	}

	public final RulePrequelContext rulePrequel() throws RecognitionException {
		RulePrequelContext _localctx = new RulePrequelContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_rulePrequel);
		try {
			setState(440);
			switch (_input.LA(1)) {
			case OPTIONS:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				optionsSpec();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				ruleAction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleReturnsContext extends ParserRuleContext {
		public TerminalNode RETURNS() { return getToken(ANTLRTerm.RETURNS, 0); }
		public TerminalNode ARG_ACTION() { return getToken(ANTLRTerm.ARG_ACTION, 0); }
		public RuleReturnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleReturns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterRuleReturns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitRuleReturns(this);
		}
	}

	public final RuleReturnsContext ruleReturns() throws RecognitionException {
		RuleReturnsContext _localctx = new RuleReturnsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ruleReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(RETURNS);
			setState(443);
			match(ARG_ACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowsSpecContext extends ParserRuleContext {
		public TerminalNode THROWS() { return getToken(ANTLRTerm.THROWS, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ANTLRTerm.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ANTLRTerm.COMMA, i);
		}
		public ThrowsSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwsSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterThrowsSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitThrowsSpec(this);
		}
	}

	public final ThrowsSpecContext throwsSpec() throws RecognitionException {
		ThrowsSpecContext _localctx = new ThrowsSpecContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_throwsSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(THROWS);
			setState(446);
			id();
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(447);
				match(COMMA);
				setState(448);
				id();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalsSpecContext extends ParserRuleContext {
		public TerminalNode LOCALS() { return getToken(ANTLRTerm.LOCALS, 0); }
		public TerminalNode ARG_ACTION() { return getToken(ANTLRTerm.ARG_ACTION, 0); }
		public LocalsSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localsSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterLocalsSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitLocalsSpec(this);
		}
	}

	public final LocalsSpecContext localsSpec() throws RecognitionException {
		LocalsSpecContext _localctx = new LocalsSpecContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_localsSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(LOCALS);
			setState(455);
			match(ARG_ACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleActionContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ANTLRTerm.AT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(ANTLRTerm.ACTION, 0); }
		public RuleActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterRuleAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitRuleAction(this);
		}
	}

	public final RuleActionContext ruleAction() throws RecognitionException {
		RuleActionContext _localctx = new RuleActionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ruleAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(AT);
			setState(458);
			id();
			setState(459);
			match(ACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleModifiersContext extends ParserRuleContext {
		public List<RuleModifierContext> ruleModifier() {
			return getRuleContexts(RuleModifierContext.class);
		}
		public RuleModifierContext ruleModifier(int i) {
			return getRuleContext(RuleModifierContext.class,i);
		}
		public RuleModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterRuleModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitRuleModifiers(this);
		}
	}

	public final RuleModifiersContext ruleModifiers() throws RecognitionException {
		RuleModifiersContext _localctx = new RuleModifiersContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ruleModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(461);
				ruleModifier();
				}
				}
				setState(464); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(ANTLRTerm.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(ANTLRTerm.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(ANTLRTerm.PROTECTED, 0); }
		public TerminalNode FRAGMENT() { return getToken(ANTLRTerm.FRAGMENT, 0); }
		public RuleModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterRuleModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitRuleModifier(this);
		}
	}

	public final RuleModifierContext ruleModifier() throws RecognitionException {
		RuleModifierContext _localctx = new RuleModifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ruleModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleBlockContext extends ParserRuleContext {
		public RuleAltListContext ruleAltList() {
			return getRuleContext(RuleAltListContext.class,0);
		}
		public RuleBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterRuleBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitRuleBlock(this);
		}
	}

	public final RuleBlockContext ruleBlock() throws RecognitionException {
		RuleBlockContext _localctx = new RuleBlockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ruleBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(469);
			ruleAltList();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleAltListContext extends ParserRuleContext {
		public LabeledAltContext labeledAlt() {
			return getRuleContext(LabeledAltContext.class,0);
		}
		public List<RuleAltList_S1Context> ruleAltList_S1() {
			return getRuleContexts(RuleAltList_S1Context.class);
		}
		public RuleAltList_S1Context ruleAltList_S1(int i) {
			return getRuleContext(RuleAltList_S1Context.class,i);
		}
		public RuleAltListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleAltList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterRuleAltList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitRuleAltList(this);
		}
	}

	public final RuleAltListContext ruleAltList() throws RecognitionException {
		RuleAltListContext _localctx = new RuleAltListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ruleAltList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(473);
			labeledAlt();
			enterZOM();
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(475);
				ruleAltList_S1();
				}
				}
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			exitZOM();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleAltList_S1Context extends ParserRuleContext {
		public TerminalNode OR() { return getToken(ANTLRTerm.OR, 0); }
		public LabeledAltContext labeledAlt() {
			return getRuleContext(LabeledAltContext.class,0);
		}
		public RuleAltList_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleAltList_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterRuleAltList_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitRuleAltList_S1(this);
		}
	}

	public final RuleAltList_S1Context ruleAltList_S1() throws RecognitionException {
		RuleAltList_S1Context _localctx = new RuleAltList_S1Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_ruleAltList_S1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(485);
			match(OR);
			setState(486);
			labeledAlt();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledAltContext extends ParserRuleContext {
		public AlternativeContext alternative() {
			return getRuleContext(AlternativeContext.class,0);
		}
		public LabeledAlt_S1Context labeledAlt_S1() {
			return getRuleContext(LabeledAlt_S1Context.class,0);
		}
		public LabeledAltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledAlt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterLabeledAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitLabeledAlt(this);
		}
	}

	public final LabeledAltContext labeledAlt() throws RecognitionException {
		LabeledAltContext _localctx = new LabeledAltContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_labeledAlt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(490);
			alternative();
			enterOPT();
			setState(493);
			_la = _input.LA(1);
			if (_la==POUND) {
				{
				setState(492);
				labeledAlt_S1();
				}
			}

			exitOPT();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledAlt_S1Context extends ParserRuleContext {
		public TerminalNode POUND() { return getToken(ANTLRTerm.POUND, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public LabeledAlt_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledAlt_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterLabeledAlt_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitLabeledAlt_S1(this);
		}
	}

	public final LabeledAlt_S1Context labeledAlt_S1() throws RecognitionException {
		LabeledAlt_S1Context _localctx = new LabeledAlt_S1Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_labeledAlt_S1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(499);
			match(POUND);
			setState(500);
			id();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerRuleContext extends ParserRuleContext {
		public TerminalNode TOKEN_REF() { return getToken(ANTLRTerm.TOKEN_REF, 0); }
		public TerminalNode COLON() { return getToken(ANTLRTerm.COLON, 0); }
		public LexerRuleBlockContext lexerRuleBlock() {
			return getRuleContext(LexerRuleBlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ANTLRTerm.SEMI, 0); }
		public TerminalNode DOC_COMMENT() { return getToken(ANTLRTerm.DOC_COMMENT, 0); }
		public TerminalNode FRAGMENT() { return getToken(ANTLRTerm.FRAGMENT, 0); }
		public LexerRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterLexerRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitLexerRule(this);
		}
	}

	public final LexerRuleContext lexerRule() throws RecognitionException {
		LexerRuleContext _localctx = new LexerRuleContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_lexerRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			enterOPT();
			setState(506);
			_la = _input.LA(1);
			if (_la==DOC_COMMENT) {
				{
				setState(505);
				match(DOC_COMMENT);
				}
			}

			exitOPT();
			enterOPT();
			setState(511);
			_la = _input.LA(1);
			if (_la==FRAGMENT) {
				{
				setState(510);
				match(FRAGMENT);
				}
			}

			exitOPT();
			setState(514);
			match(TOKEN_REF);
			setState(515);
			match(COLON);
			setState(516);
			lexerRuleBlock();
			setState(517);
			match(SEMI);
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerRuleBlockContext extends ParserRuleContext {
		public LexerAltListContext lexerAltList() {
			return getRuleContext(LexerAltListContext.class,0);
		}
		public LexerRuleBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRuleBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterLexerRuleBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitLexerRuleBlock(this);
		}
	}

	public final LexerRuleBlockContext lexerRuleBlock() throws RecognitionException {
		LexerRuleBlockContext _localctx = new LexerRuleBlockContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_lexerRuleBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(521);
			lexerAltList();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerAltListContext extends ParserRuleContext {
		public LexerAltContext lexerAlt() {
			return getRuleContext(LexerAltContext.class,0);
		}
		public List<LexerAltList_S1Context> lexerAltList_S1() {
			return getRuleContexts(LexerAltList_S1Context.class);
		}
		public LexerAltList_S1Context lexerAltList_S1(int i) {
			return getRuleContext(LexerAltList_S1Context.class,i);
		}
		public LexerAltListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerAltList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterLexerAltList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitLexerAltList(this);
		}
	}

	public final LexerAltListContext lexerAltList() throws RecognitionException {
		LexerAltListContext _localctx = new LexerAltListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_lexerAltList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(525);
			lexerAlt();
			enterZOM();
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(527);
				lexerAltList_S1();
				}
				}
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			exitZOM();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerAltList_S1Context extends ParserRuleContext {
		public TerminalNode OR() { return getToken(ANTLRTerm.OR, 0); }
		public LexerAltContext lexerAlt() {
			return getRuleContext(LexerAltContext.class,0);
		}
		public LexerAltList_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerAltList_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterLexerAltList_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitLexerAltList_S1(this);
		}
	}

	public final LexerAltList_S1Context lexerAltList_S1() throws RecognitionException {
		LexerAltList_S1Context _localctx = new LexerAltList_S1Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_lexerAltList_S1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(537);
			match(OR);
			setState(538);
			lexerAlt();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerAltContext extends ParserRuleContext {
		public LexerElementsContext lexerElements() {
			return getRuleContext(LexerElementsContext.class,0);
		}
		public LexerCommandsContext lexerCommands() {
			return getRuleContext(LexerCommandsContext.class,0);
		}
		public LexerAltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerAlt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterLexerAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitLexerAlt(this);
		}
	}

	public final LexerAltContext lexerAlt() throws RecognitionException {
		LexerAltContext _localctx = new LexerAltContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_lexerAlt);
		int _la;
		try {
			setState(552);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
			case LEXER_CHAR_SET:
			case LPAREN:
			case DOT:
			case NOT:
			case STRING_LITERAL:
			case ACTION:
				enterOuterAlt(_localctx, 1);
				{
				enterAlt("1");
				setState(542);
				lexerElements();
				enterOPT();
				setState(545);
				_la = _input.LA(1);
				if (_la==RARROW) {
					{
					setState(544);
					lexerCommands();
					}
				}

				exitOPT();
				exitAlt();
				}
				break;
			case SEMI:
			case RPAREN:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				enterAlt("2");
				exitAlt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerElementsContext extends ParserRuleContext {
		public List<LexerElementContext> lexerElement() {
			return getRuleContexts(LexerElementContext.class);
		}
		public LexerElementContext lexerElement(int i) {
			return getRuleContext(LexerElementContext.class,i);
		}
		public LexerElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterLexerElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitLexerElements(this);
		}
	}

	public final LexerElementsContext lexerElements() throws RecognitionException {
		LexerElementsContext _localctx = new LexerElementsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_lexerElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			enterOOM();
			setState(557); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(556);
				lexerElement();
				}
				}
				setState(559); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_REF) | (1L << RULE_REF) | (1L << LEXER_CHAR_SET) | (1L << LPAREN) | (1L << DOT) | (1L << NOT) | (1L << STRING_LITERAL) | (1L << ACTION))) != 0) );
			exitOOM();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerElementContext extends ParserRuleContext {
		public LabeledLexerElementContext labeledLexerElement() {
			return getRuleContext(LabeledLexerElementContext.class,0);
		}
		public EbnfSuffixContext ebnfSuffix() {
			return getRuleContext(EbnfSuffixContext.class,0);
		}
		public LexerAtomContext lexerAtom() {
			return getRuleContext(LexerAtomContext.class,0);
		}
		public LexerBlockContext lexerBlock() {
			return getRuleContext(LexerBlockContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(ANTLRTerm.ACTION, 0); }
		public TerminalNode QUESTION() { return getToken(ANTLRTerm.QUESTION, 0); }
		public LexerElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterLexerElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitLexerElement(this);
		}
	}

	public final LexerElementContext lexerElement() throws RecognitionException {
		LexerElementContext _localctx = new LexerElementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_lexerElement);
		int _la;
		try {
			setState(599);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				enterAlt("1");
				setState(565);
				labeledLexerElement();
				enterOPT();
				setState(568);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
					{
					setState(567);
					ebnfSuffix();
					}
				}

				exitOPT();
				exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				enterAlt("2");
				setState(574);
				lexerAtom();
				enterOPT();
				setState(577);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
					{
					setState(576);
					ebnfSuffix();
					}
				}

				exitOPT();
				exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				enterAlt("3");
				setState(583);
				lexerBlock();
				enterOPT();
				setState(586);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
					{
					setState(585);
					ebnfSuffix();
					}
				}

				exitOPT();
				exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				enterAlt("4");
				setState(592);
				match(ACTION);
				enterOPT();
				setState(595);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(594);
					match(QUESTION);
					}
				}

				exitOPT();
				exitAlt();
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

	public static class LabeledLexerElementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public LabeledLexerElement_S1Context labeledLexerElement_S1() {
			return getRuleContext(LabeledLexerElement_S1Context.class,0);
		}
		public LabeledLexerElement_S2Context labeledLexerElement_S2() {
			return getRuleContext(LabeledLexerElement_S2Context.class,0);
		}
		public LabeledLexerElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledLexerElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterLabeledLexerElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitLabeledLexerElement(this);
		}
	}

	public final LabeledLexerElementContext labeledLexerElement() throws RecognitionException {
		LabeledLexerElementContext _localctx = new LabeledLexerElementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_labeledLexerElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(602);
			id();
			setState(603);
			labeledLexerElement_S1();
			setState(604);
			labeledLexerElement_S2();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledLexerElement_S1Context extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(ANTLRTerm.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(ANTLRTerm.PLUS_ASSIGN, 0); }
		public LabeledLexerElement_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledLexerElement_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterLabeledLexerElement_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitLabeledLexerElement_S1(this);
		}
	}

	public final LabeledLexerElement_S1Context labeledLexerElement_S1() throws RecognitionException {
		LabeledLexerElement_S1Context _localctx = new LabeledLexerElement_S1Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_labeledLexerElement_S1);
		try {
			setState(613);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				enterAlt("1");
				setState(608);
				match(ASSIGN);
				exitAlt();
				}
				break;
			case PLUS_ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				enterAlt("2");
				setState(611);
				match(PLUS_ASSIGN);
				exitAlt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledLexerElement_S2Context extends ParserRuleContext {
		public LexerAtomContext lexerAtom() {
			return getRuleContext(LexerAtomContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LabeledLexerElement_S2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledLexerElement_S2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterLabeledLexerElement_S2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitLabeledLexerElement_S2(this);
		}
	}

	public final LabeledLexerElement_S2Context labeledLexerElement_S2() throws RecognitionException {
		LabeledLexerElement_S2Context _localctx = new LabeledLexerElement_S2Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_labeledLexerElement_S2);
		try {
			setState(623);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
			case LEXER_CHAR_SET:
			case DOT:
			case NOT:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				enterAlt("1");
				setState(616);
				lexerAtom();
				exitAlt();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				enterAlt("2");
				setState(620);
				block();
				exitAlt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerBlockContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ANTLRTerm.LPAREN, 0); }
		public LexerAltListContext lexerAltList() {
			return getRuleContext(LexerAltListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ANTLRTerm.RPAREN, 0); }
		public LexerBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterLexerBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitLexerBlock(this);
		}
	}

	public final LexerBlockContext lexerBlock() throws RecognitionException {
		LexerBlockContext _localctx = new LexerBlockContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_lexerBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(626);
			match(LPAREN);
			setState(627);
			lexerAltList();
			setState(628);
			match(RPAREN);
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerCommandsContext extends ParserRuleContext {
		public TerminalNode RARROW() { return getToken(ANTLRTerm.RARROW, 0); }
		public LexerCommandContext lexerCommand() {
			return getRuleContext(LexerCommandContext.class,0);
		}
		public List<LexerCommands_S1Context> lexerCommands_S1() {
			return getRuleContexts(LexerCommands_S1Context.class);
		}
		public LexerCommands_S1Context lexerCommands_S1(int i) {
			return getRuleContext(LexerCommands_S1Context.class,i);
		}
		public LexerCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterLexerCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitLexerCommands(this);
		}
	}

	public final LexerCommandsContext lexerCommands() throws RecognitionException {
		LexerCommandsContext _localctx = new LexerCommandsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_lexerCommands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(632);
			match(RARROW);
			setState(633);
			lexerCommand();
			enterZOM();
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(635);
				lexerCommands_S1();
				}
				}
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			exitZOM();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerCommands_S1Context extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(ANTLRTerm.COMMA, 0); }
		public LexerCommandContext lexerCommand() {
			return getRuleContext(LexerCommandContext.class,0);
		}
		public LexerCommands_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerCommands_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterLexerCommands_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitLexerCommands_S1(this);
		}
	}

	public final LexerCommands_S1Context lexerCommands_S1() throws RecognitionException {
		LexerCommands_S1Context _localctx = new LexerCommands_S1Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_lexerCommands_S1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(645);
			match(COMMA);
			setState(646);
			lexerCommand();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerCommandContext extends ParserRuleContext {
		public LexerCommandNameContext lexerCommandName() {
			return getRuleContext(LexerCommandNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ANTLRTerm.LPAREN, 0); }
		public LexerCommandExprContext lexerCommandExpr() {
			return getRuleContext(LexerCommandExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ANTLRTerm.RPAREN, 0); }
		public LexerCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterLexerCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitLexerCommand(this);
		}
	}

	public final LexerCommandContext lexerCommand() throws RecognitionException {
		LexerCommandContext _localctx = new LexerCommandContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_lexerCommand);
		try {
			setState(660);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				enterAlt("1");
				setState(650);
				lexerCommandName();
				setState(651);
				match(LPAREN);
				setState(652);
				lexerCommandExpr();
				setState(653);
				match(RPAREN);
				exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				enterAlt("2");
				setState(657);
				lexerCommandName();
				exitAlt();
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

	public static class LexerCommandNameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode MODE() { return getToken(ANTLRTerm.MODE, 0); }
		public LexerCommandNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerCommandName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterLexerCommandName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitLexerCommandName(this);
		}
	}

	public final LexerCommandNameContext lexerCommandName() throws RecognitionException {
		LexerCommandNameContext _localctx = new LexerCommandNameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_lexerCommandName);
		try {
			setState(669);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
				enterOuterAlt(_localctx, 1);
				{
				enterAlt("1");
				setState(663);
				id();
				exitAlt();
				}
				break;
			case MODE:
				enterOuterAlt(_localctx, 2);
				{
				enterAlt("2");
				setState(667);
				match(MODE);
				exitAlt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerCommandExprContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode INT() { return getToken(ANTLRTerm.INT, 0); }
		public LexerCommandExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerCommandExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterLexerCommandExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitLexerCommandExpr(this);
		}
	}

	public final LexerCommandExprContext lexerCommandExpr() throws RecognitionException {
		LexerCommandExprContext _localctx = new LexerCommandExprContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_lexerCommandExpr);
		try {
			setState(678);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
				enterOuterAlt(_localctx, 1);
				{
				enterAlt("1");
				setState(672);
				id();
				exitAlt();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				enterAlt("2");
				setState(676);
				match(INT);
				exitAlt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AltListContext extends ParserRuleContext {
		public AlternativeContext alternative() {
			return getRuleContext(AlternativeContext.class,0);
		}
		public List<AltList_S1Context> altList_S1() {
			return getRuleContexts(AltList_S1Context.class);
		}
		public AltList_S1Context altList_S1(int i) {
			return getRuleContext(AltList_S1Context.class,i);
		}
		public AltListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterAltList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitAltList(this);
		}
	}

	public final AltListContext altList() throws RecognitionException {
		AltListContext _localctx = new AltListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_altList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(681);
			alternative();
			enterZOM();
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(683);
				altList_S1();
				}
				}
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			exitZOM();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AltList_S1Context extends ParserRuleContext {
		public TerminalNode OR() { return getToken(ANTLRTerm.OR, 0); }
		public AlternativeContext alternative() {
			return getRuleContext(AlternativeContext.class,0);
		}
		public AltList_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altList_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterAltList_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitAltList_S1(this);
		}
	}

	public final AltList_S1Context altList_S1() throws RecognitionException {
		AltList_S1Context _localctx = new AltList_S1Context(_ctx, getState());
		enterRule(_localctx, 104, RULE_altList_S1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(693);
			match(OR);
			setState(694);
			alternative();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlternativeContext extends ParserRuleContext {
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public AlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitAlternative(this);
		}
	}

	public final AlternativeContext alternative() throws RecognitionException {
		AlternativeContext _localctx = new AlternativeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_alternative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			enterOPT();
			setState(700);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(699);
				elementOptions();
				}
			}

			exitOPT();
			enterZOM();
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_REF) | (1L << RULE_REF) | (1L << LPAREN) | (1L << DOT) | (1L << NOT) | (1L << STRING_LITERAL) | (1L << ACTION))) != 0)) {
				{
				{
				setState(704);
				element();
				}
				}
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			exitZOM();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public LabeledElementContext labeledElement() {
			return getRuleContext(LabeledElementContext.class,0);
		}
		public Element_A1_S1Context element_A1_S1() {
			return getRuleContext(Element_A1_S1Context.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public Element_A2_S1Context element_A2_S1() {
			return getRuleContext(Element_A2_S1Context.class,0);
		}
		public EbnfContext ebnf() {
			return getRuleContext(EbnfContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(ANTLRTerm.ACTION, 0); }
		public TerminalNode QUESTION() { return getToken(ANTLRTerm.QUESTION, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_element);
		int _la;
		try {
			setState(735);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				enterAlt("1");
				setState(714);
				labeledElement();
				setState(715);
				element_A1_S1();
				exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				enterAlt("2");
				setState(719);
				atom();
				setState(720);
				element_A2_S1();
				exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				enterAlt("3");
				setState(724);
				ebnf();
				exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				enterAlt("4");
				setState(728);
				match(ACTION);
				enterOPT();
				setState(731);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(730);
					match(QUESTION);
					}
				}

				exitOPT();
				exitAlt();
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

	public static class Element_A1_S1Context extends ParserRuleContext {
		public EbnfSuffixContext ebnfSuffix() {
			return getRuleContext(EbnfSuffixContext.class,0);
		}
		public Element_A1_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_A1_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterElement_A1_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitElement_A1_S1(this);
		}
	}

	public final Element_A1_S1Context element_A1_S1() throws RecognitionException {
		Element_A1_S1Context _localctx = new Element_A1_S1Context(_ctx, getState());
		enterRule(_localctx, 110, RULE_element_A1_S1);
		try {
			setState(743);
			switch (_input.LA(1)) {
			case QUESTION:
			case STAR:
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				enterAlt("1");
				setState(738);
				ebnfSuffix();
				exitAlt();
				}
				break;
			case TOKEN_REF:
			case RULE_REF:
			case SEMI:
			case LPAREN:
			case RPAREN:
			case OR:
			case DOT:
			case POUND:
			case NOT:
			case STRING_LITERAL:
			case ACTION:
				enterOuterAlt(_localctx, 2);
				{
				enterAlt("2");
				exitAlt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_A2_S1Context extends ParserRuleContext {
		public EbnfSuffixContext ebnfSuffix() {
			return getRuleContext(EbnfSuffixContext.class,0);
		}
		public Element_A2_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_A2_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterElement_A2_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitElement_A2_S1(this);
		}
	}

	public final Element_A2_S1Context element_A2_S1() throws RecognitionException {
		Element_A2_S1Context _localctx = new Element_A2_S1Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_element_A2_S1);
		try {
			setState(751);
			switch (_input.LA(1)) {
			case QUESTION:
			case STAR:
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				enterAlt("1");
				setState(746);
				ebnfSuffix();
				exitAlt();
				}
				break;
			case TOKEN_REF:
			case RULE_REF:
			case SEMI:
			case LPAREN:
			case RPAREN:
			case OR:
			case DOT:
			case POUND:
			case NOT:
			case STRING_LITERAL:
			case ACTION:
				enterOuterAlt(_localctx, 2);
				{
				enterAlt("2");
				exitAlt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledElementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public LabeledElement_S1Context labeledElement_S1() {
			return getRuleContext(LabeledElement_S1Context.class,0);
		}
		public LabeledElement_S2Context labeledElement_S2() {
			return getRuleContext(LabeledElement_S2Context.class,0);
		}
		public LabeledElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterLabeledElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitLabeledElement(this);
		}
	}

	public final LabeledElementContext labeledElement() throws RecognitionException {
		LabeledElementContext _localctx = new LabeledElementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_labeledElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(754);
			id();
			setState(755);
			labeledElement_S1();
			setState(756);
			labeledElement_S2();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledElement_S1Context extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(ANTLRTerm.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(ANTLRTerm.PLUS_ASSIGN, 0); }
		public LabeledElement_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledElement_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterLabeledElement_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitLabeledElement_S1(this);
		}
	}

	public final LabeledElement_S1Context labeledElement_S1() throws RecognitionException {
		LabeledElement_S1Context _localctx = new LabeledElement_S1Context(_ctx, getState());
		enterRule(_localctx, 116, RULE_labeledElement_S1);
		try {
			setState(765);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				enterAlt("1");
				setState(760);
				match(ASSIGN);
				exitAlt();
				}
				break;
			case PLUS_ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				enterAlt("2");
				setState(763);
				match(PLUS_ASSIGN);
				exitAlt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledElement_S2Context extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LabeledElement_S2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledElement_S2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterLabeledElement_S2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitLabeledElement_S2(this);
		}
	}

	public final LabeledElement_S2Context labeledElement_S2() throws RecognitionException {
		LabeledElement_S2Context _localctx = new LabeledElement_S2Context(_ctx, getState());
		enterRule(_localctx, 118, RULE_labeledElement_S2);
		try {
			setState(775);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
			case DOT:
			case NOT:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				enterAlt("1");
				setState(768);
				atom();
				exitAlt();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				enterAlt("2");
				setState(772);
				block();
				exitAlt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EbnfContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockSuffixContext blockSuffix() {
			return getRuleContext(BlockSuffixContext.class,0);
		}
		public EbnfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ebnf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterEbnf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitEbnf(this);
		}
	}

	public final EbnfContext ebnf() throws RecognitionException {
		EbnfContext _localctx = new EbnfContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_ebnf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(778);
			block();
			enterOPT();
			setState(781);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
				{
				setState(780);
				blockSuffix();
				}
			}

			exitOPT();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockSuffixContext extends ParserRuleContext {
		public EbnfSuffixContext ebnfSuffix() {
			return getRuleContext(EbnfSuffixContext.class,0);
		}
		public BlockSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterBlockSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitBlockSuffix(this);
		}
	}

	public final BlockSuffixContext blockSuffix() throws RecognitionException {
		BlockSuffixContext _localctx = new BlockSuffixContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_blockSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(787);
			ebnfSuffix();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EbnfSuffixContext extends ParserRuleContext {
		public List<TerminalNode> QUESTION() { return getTokens(ANTLRTerm.QUESTION); }
		public TerminalNode QUESTION(int i) {
			return getToken(ANTLRTerm.QUESTION, i);
		}
		public TerminalNode STAR() { return getToken(ANTLRTerm.STAR, 0); }
		public TerminalNode PLUS() { return getToken(ANTLRTerm.PLUS, 0); }
		public EbnfSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ebnfSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterEbnfSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitEbnfSuffix(this);
		}
	}

	public final EbnfSuffixContext ebnfSuffix() throws RecognitionException {
		EbnfSuffixContext _localctx = new EbnfSuffixContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_ebnfSuffix);
		int _la;
		try {
			setState(814);
			switch (_input.LA(1)) {
			case QUESTION:
				enterOuterAlt(_localctx, 1);
				{
				 enterAlt("1"); 
				setState(791);
				match(QUESTION);
				enterOPT();
				setState(794);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(793);
					match(QUESTION);
					}
				}

				 exitOPT(); 
				exitAlt();
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				 enterAlt("2"); 
				setState(799);
				match(STAR);
				 enterOPT(); 
				setState(802);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(801);
					match(QUESTION);
					}
				}

				 exitOPT(); 
				exitAlt();
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 3);
				{
				 enterAlt("3"); 
				setState(807);
				match(PLUS);
				 enterOPT(); 
				setState(810);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(809);
					match(QUESTION);
					}
				}

				 exitOPT(); 
				exitAlt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerAtomContext extends ParserRuleContext {
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public TerminalNode RULE_REF() { return getToken(ANTLRTerm.RULE_REF, 0); }
		public NotSetContext notSet() {
			return getRuleContext(NotSetContext.class,0);
		}
		public TerminalNode LEXER_CHAR_SET() { return getToken(ANTLRTerm.LEXER_CHAR_SET, 0); }
		public TerminalNode DOT() { return getToken(ANTLRTerm.DOT, 0); }
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public LexerAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterLexerAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitLexerAtom(this);
		}
	}

	public final LexerAtomContext lexerAtom() throws RecognitionException {
		LexerAtomContext _localctx = new LexerAtomContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_lexerAtom);
		int _la;
		try {
			setState(842);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 enterAlt("1"); 
				setState(817);
				range();
				exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 enterAlt("2"); 
				setState(821);
				terminal();
				exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				 enterAlt("3"); 
				setState(825);
				match(RULE_REF);
				exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				 enterAlt("4"); 
				setState(828);
				notSet();
				exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				 enterAlt("5"); 
				setState(832);
				match(LEXER_CHAR_SET);
				exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				 enterAlt("6"); 
				setState(835);
				match(DOT);
				enterOPT();
				setState(838);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(837);
					elementOptions();
					}
				}

				 exitOPT(); 
				exitAlt();
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

	public static class AtomContext extends ParserRuleContext {
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public RulerefContext ruleref() {
			return getRuleContext(RulerefContext.class,0);
		}
		public NotSetContext notSet() {
			return getRuleContext(NotSetContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ANTLRTerm.DOT, 0); }
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_atom);
		int _la;
		try {
			setState(868);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				enterAlt("1");
				setState(845);
				range();
				exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				enterAlt("2");
				setState(849);
				terminal();
				exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				enterAlt("3");
				setState(853);
				ruleref();
				exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				enterAlt("4");
				setState(857);
				notSet();
				exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				enterAlt("5");
				setState(861);
				match(DOT);
				enterOPT();
				setState(864);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(863);
					elementOptions();
					}
				}

				exitOPT();
				exitAlt();
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

	public static class NotSetContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(ANTLRTerm.NOT, 0); }
		public SetElementContext setElement() {
			return getRuleContext(SetElementContext.class,0);
		}
		public BlockSetContext blockSet() {
			return getRuleContext(BlockSetContext.class,0);
		}
		public NotSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterNotSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitNotSet(this);
		}
	}

	public final NotSetContext notSet() throws RecognitionException {
		NotSetContext _localctx = new NotSetContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_notSet);
		try {
			setState(880);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				enterAlt("1");
				setState(871);
				match(NOT);
				setState(872);
				setElement();
				exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				enterAlt("2");
				setState(876);
				match(NOT);
				setState(877);
				blockSet();
				exitAlt();
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

	public static class BlockSetContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ANTLRTerm.LPAREN, 0); }
		public SetElementContext setElement() {
			return getRuleContext(SetElementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ANTLRTerm.RPAREN, 0); }
		public List<BlockSet_S1Context> blockSet_S1() {
			return getRuleContexts(BlockSet_S1Context.class);
		}
		public BlockSet_S1Context blockSet_S1(int i) {
			return getRuleContext(BlockSet_S1Context.class,i);
		}
		public BlockSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterBlockSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitBlockSet(this);
		}
	}

	public final BlockSetContext blockSet() throws RecognitionException {
		BlockSetContext _localctx = new BlockSetContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_blockSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt("1");
			setState(883);
			match(LPAREN);
			setState(884);
			setElement();
			enterZOM();
			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(886);
				blockSet_S1();
				}
				}
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			enterZOM();
			setState(893);
			match(RPAREN);
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockSet_S1Context extends ParserRuleContext {
		public TerminalNode OR() { return getToken(ANTLRTerm.OR, 0); }
		public SetElementContext setElement() {
			return getRuleContext(SetElementContext.class,0);
		}
		public BlockSet_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockSet_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterBlockSet_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitBlockSet_S1(this);
		}
	}

	public final BlockSet_S1Context blockSet_S1() throws RecognitionException {
		BlockSet_S1Context _localctx = new BlockSet_S1Context(_ctx, getState());
		enterRule(_localctx, 134, RULE_blockSet_S1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(897);
			match(OR);
			setState(898);
			setElement();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetElementContext extends ParserRuleContext {
		public TerminalNode TOKEN_REF() { return getToken(ANTLRTerm.TOKEN_REF, 0); }
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ANTLRTerm.STRING_LITERAL, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TerminalNode LEXER_CHAR_SET() { return getToken(ANTLRTerm.LEXER_CHAR_SET, 0); }
		public SetElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterSetElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitSetElement(this);
		}
	}

	public final SetElementContext setElement() throws RecognitionException {
		SetElementContext _localctx = new SetElementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_setElement);
		int _la;
		try {
			setState(924);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				enterAlt("1");
				setState(902);
				match(TOKEN_REF);
				enterOPT();
				setState(905);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(904);
					elementOptions();
					}
				}

				exitOPT();
				exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				enterAlt("2");
				setState(910);
				match(STRING_LITERAL);
				enterOPT();
				setState(913);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(912);
					elementOptions();
					}
				}

				exitOPT();
				exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				enterAlt("3");
				setState(918);
				range();
				exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				enterAlt("4");
				setState(922);
				match(LEXER_CHAR_SET);
				exitAlt();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ANTLRTerm.LPAREN, 0); }
		public AltListContext altList() {
			return getRuleContext(AltListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ANTLRTerm.RPAREN, 0); }
		public Block_S1Context block_S1() {
			return getRuleContext(Block_S1Context.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(927);
			match(LPAREN);
			enterOPT();
			setState(930);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPTIONS) | (1L << COLON) | (1L << AT))) != 0)) {
				{
				setState(929);
				block_S1();
				}
			}

			exitOPT();
			setState(933);
			altList();
			setState(934);
			match(RPAREN);
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_S1Context extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ANTLRTerm.COLON, 0); }
		public OptionsSpecContext optionsSpec() {
			return getRuleContext(OptionsSpecContext.class,0);
		}
		public List<RuleActionContext> ruleAction() {
			return getRuleContexts(RuleActionContext.class);
		}
		public RuleActionContext ruleAction(int i) {
			return getRuleContext(RuleActionContext.class,i);
		}
		public Block_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterBlock_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitBlock_S1(this);
		}
	}

	public final Block_S1Context block_S1() throws RecognitionException {
		Block_S1Context _localctx = new Block_S1Context(_ctx, getState());
		enterRule(_localctx, 140, RULE_block_S1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			enterOPT();
			setState(940);
			_la = _input.LA(1);
			if (_la==OPTIONS) {
				{
				setState(939);
				optionsSpec();
				}
			}

			exitOPT();
			enterZOM();
			setState(947);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(944);
				ruleAction();
				}
				}
				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			exitZOM();
			setState(951);
			match(COLON);
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulerefContext extends ParserRuleContext {
		public TerminalNode RULE_REF() { return getToken(ANTLRTerm.RULE_REF, 0); }
		public TerminalNode ARG_ACTION() { return getToken(ANTLRTerm.ARG_ACTION, 0); }
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public RulerefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterRuleref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitRuleref(this);
		}
	}

	public final RulerefContext ruleref() throws RecognitionException {
		RulerefContext _localctx = new RulerefContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_ruleref);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(955);
			match(RULE_REF);
			enterOPT();
			setState(958);
			_la = _input.LA(1);
			if (_la==ARG_ACTION) {
				{
				setState(957);
				match(ARG_ACTION);
				}
			}

			exitOPT();
			enterOPT();
			setState(963);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(962);
				elementOptions();
				}
			}

			exitOPT();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeContext extends ParserRuleContext {
		public List<TerminalNode> STRING_LITERAL() { return getTokens(ANTLRTerm.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(ANTLRTerm.STRING_LITERAL, i);
		}
		public TerminalNode RANGE() { return getToken(ANTLRTerm.RANGE, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitRange(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(969);
			match(STRING_LITERAL);
			setState(970);
			match(RANGE);
			setState(971);
			match(STRING_LITERAL);
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminalContext extends ParserRuleContext {
		public TerminalNode TOKEN_REF() { return getToken(ANTLRTerm.TOKEN_REF, 0); }
		public ElementOptionsContext elementOptions() {
			return getRuleContext(ElementOptionsContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ANTLRTerm.STRING_LITERAL, 0); }
		public TerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitTerminal(this);
		}
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_terminal);
		int _la;
		try {
			setState(990);
			switch (_input.LA(1)) {
			case TOKEN_REF:
				enterOuterAlt(_localctx, 1);
				{
				enterAlt("1");
				setState(975);
				match(TOKEN_REF);
				enterOPT();
				setState(978);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(977);
					elementOptions();
					}
				}

				exitOPT();
				exitAlt();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				enterAlt("2");
				setState(983);
				match(STRING_LITERAL);
				enterOPT();
				setState(986);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(985);
					elementOptions();
					}
				}

				exitOPT();
				exitAlt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementOptionsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ANTLRTerm.LT, 0); }
		public ElementOptionContext elementOption() {
			return getRuleContext(ElementOptionContext.class,0);
		}
		public TerminalNode GT() { return getToken(ANTLRTerm.GT, 0); }
		public List<ElementOptions_S1Context> elementOptions_S1() {
			return getRuleContexts(ElementOptions_S1Context.class);
		}
		public ElementOptions_S1Context elementOptions_S1(int i) {
			return getRuleContext(ElementOptions_S1Context.class,i);
		}
		public ElementOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterElementOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitElementOptions(this);
		}
	}

	public final ElementOptionsContext elementOptions() throws RecognitionException {
		ElementOptionsContext _localctx = new ElementOptionsContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_elementOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(993);
			match(LT);
			setState(994);
			elementOption();
			enterZOM();
			setState(999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(996);
				elementOptions_S1();
				}
				}
				setState(1001);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			exitZOM();
			setState(1003);
			match(GT);
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementOptions_S1Context extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(ANTLRTerm.COMMA, 0); }
		public ElementOptionContext elementOption() {
			return getRuleContext(ElementOptionContext.class,0);
		}
		public ElementOptions_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementOptions_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterElementOptions_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitElementOptions_S1(this);
		}
	}

	public final ElementOptions_S1Context elementOptions_S1() throws RecognitionException {
		ElementOptions_S1Context _localctx = new ElementOptions_S1Context(_ctx, getState());
		enterRule(_localctx, 150, RULE_elementOptions_S1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			enterAlt();
			setState(1007);
			match(COMMA);
			setState(1008);
			elementOption();
			exitAlt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementOptionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ANTLRTerm.ASSIGN, 0); }
		public ElementOption_S1Context elementOption_S1() {
			return getRuleContext(ElementOption_S1Context.class,0);
		}
		public ElementOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterElementOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitElementOption(this);
		}
	}

	public final ElementOptionContext elementOption() throws RecognitionException {
		ElementOptionContext _localctx = new ElementOptionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_elementOption);
		try {
			setState(1021);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				enterAlt("1");
				setState(1012);
				id();
				exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				enterAlt("2");
				setState(1016);
				id();
				setState(1017);
				match(ASSIGN);
				setState(1018);
				elementOption_S1();
				exitAlt();
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

	public static class ElementOption_S1Context extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ANTLRTerm.STRING_LITERAL, 0); }
		public ElementOption_S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementOption_S1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterElementOption_S1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitElementOption_S1(this);
		}
	}

	public final ElementOption_S1Context elementOption_S1() throws RecognitionException {
		ElementOption_S1Context _localctx = new ElementOption_S1Context(_ctx, getState());
		enterRule(_localctx, 154, RULE_elementOption_S1);
		try {
			setState(1030);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
				enterOuterAlt(_localctx, 1);
				{
				enterAlt("1");
				setState(1024);
				id();
				exitAlt();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				enterAlt("2");
				setState(1028);
				match(STRING_LITERAL);
				exitAlt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode RULE_REF() { return getToken(ANTLRTerm.RULE_REF, 0); }
		public TerminalNode TOKEN_REF() { return getToken(ANTLRTerm.TOKEN_REF, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRTermListener ) ((ANTLRTermListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_id);
		try {
			setState(1038);
			switch (_input.LA(1)) {
			case RULE_REF:
				enterOuterAlt(_localctx, 1);
				{
				enterAlt("1");
				setState(1033);
				match(RULE_REF);
				exitAlt();
				}
				break;
			case TOKEN_REF:
				enterOuterAlt(_localctx, 2);
				{
				enterAlt("2");
				setState(1036);
				match(TOKEN_REF);
				exitAlt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\39\u0413\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\2\5\2\u00a4\n"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u00ac\n\2\f\2\16\2\u00af\13\2\3\2\3\2\3"+
		"\2\3\2\7\2\u00b5\n\2\f\2\16\2\u00b8\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00ce\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00e0\n"+
		"\5\3\6\3\6\3\6\3\6\7\6\u00e6\n\6\f\6\16\6\u00e9\13\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u00fd\n\t\f"+
		"\t\16\t\u0100\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u010d"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u0118\n\13\f\13\16\13"+
		"\u011b\13\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u012a\n\r\3\16\3\16\3\16\3\16\7\16\u0130\n\16\f\16\16\16\u0133\13\16"+
		"\3\16\5\16\u0136\n\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u013e\n\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u0154\n\21\3\22\3\22\3\22\3\22\7\22"+
		"\u015a\n\22\f\22\16\22\u015d\13\22\3\23\3\23\3\23\7\23\u0162\n\23\f\23"+
		"\16\23\u0165\13\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u0172\n\24\3\25\3\25\3\25\5\25\u0177\n\25\3\25\3\25\3\25\5\25"+
		"\u017c\n\25\3\25\3\25\3\25\3\25\5\25\u0182\n\25\3\25\3\25\3\25\5\25\u0187"+
		"\n\25\3\25\3\25\3\25\5\25\u018c\n\25\3\25\3\25\3\25\5\25\u0191\n\25\3"+
		"\25\3\25\3\25\7\25\u0196\n\25\f\25\16\25\u0199\13\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\7\26\u01a5\n\26\f\26\16\26\u01a8\13"+
		"\26\3\26\3\26\3\26\5\26\u01ad\n\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\5\31\u01bb\n\31\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\7\33\u01c4\n\33\f\33\16\33\u01c7\13\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\36\6\36\u01d1\n\36\r\36\16\36\u01d2\3\37\3\37\3 \3 \3 \3"+
		" \3!\3!\3!\3!\7!\u01df\n!\f!\16!\u01e2\13!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\5#\u01f0\n#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\5%\u01fd\n"+
		"%\3%\3%\3%\5%\u0202\n%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\7\'\u0213\n\'\f\'\16\'\u0216\13\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)"+
		"\3)\3)\5)\u0224\n)\3)\3)\3)\3)\3)\5)\u022b\n)\3*\3*\3*\6*\u0230\n*\r*"+
		"\16*\u0231\3*\3*\3*\3+\3+\3+\3+\5+\u023b\n+\3+\3+\3+\3+\3+\3+\3+\5+\u0244"+
		"\n+\3+\3+\3+\3+\3+\3+\3+\5+\u024d\n+\3+\3+\3+\3+\3+\3+\3+\5+\u0256\n+"+
		"\3+\3+\5+\u025a\n+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\5-\u0268\n-\3."+
		"\3.\3.\3.\3.\3.\3.\3.\5.\u0272\n.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\60\7\60\u027f\n\60\f\60\16\60\u0282\13\60\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\5\62\u0297\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u02a0\n\63\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u02a9\n\64\3\65\3\65\3\65\3\65"+
		"\7\65\u02af\n\65\f\65\16\65\u02b2\13\65\3\65\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\5\67\u02bf\n\67\3\67\3\67\3\67\7\67\u02c4\n"+
		"\67\f\67\16\67\u02c7\13\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\38\38\58\u02de\n8\38\38\58\u02e2\n8\39\39\39\39\3"+
		"9\39\59\u02ea\n9\3:\3:\3:\3:\3:\3:\5:\u02f2\n:\3;\3;\3;\3;\3;\3;\3<\3"+
		"<\3<\3<\3<\3<\5<\u0300\n<\3=\3=\3=\3=\3=\3=\3=\3=\5=\u030a\n=\3>\3>\3"+
		">\3>\5>\u0310\n>\3>\3>\3>\3?\3?\3?\3?\3@\3@\3@\3@\5@\u031d\n@\3@\3@\3"+
		"@\3@\3@\3@\5@\u0325\n@\3@\3@\3@\3@\3@\3@\5@\u032d\n@\3@\3@\5@\u0331\n"+
		"@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5"+
		"A\u0349\nA\3A\3A\5A\u034d\nA\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3"+
		"B\3B\3B\3B\3B\3B\3B\5B\u0363\nB\3B\3B\5B\u0367\nB\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\5C\u0373\nC\3D\3D\3D\3D\3D\7D\u037a\nD\fD\16D\u037d\13D\3D"+
		"\3D\3D\3D\3E\3E\3E\3E\3E\3F\3F\3F\3F\5F\u038c\nF\3F\3F\3F\3F\3F\3F\5F"+
		"\u0394\nF\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u039f\nF\3G\3G\3G\3G\5G\u03a5"+
		"\nG\3G\3G\3G\3G\3G\3H\3H\3H\5H\u03af\nH\3H\3H\3H\7H\u03b4\nH\fH\16H\u03b7"+
		"\13H\3H\3H\3H\3H\3I\3I\3I\3I\5I\u03c1\nI\3I\3I\3I\5I\u03c6\nI\3I\3I\3"+
		"I\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\5K\u03d5\nK\3K\3K\3K\3K\3K\3K\5K\u03dd"+
		"\nK\3K\3K\5K\u03e1\nK\3L\3L\3L\3L\3L\7L\u03e8\nL\fL\16L\u03eb\13L\3L\3"+
		"L\3L\3L\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u0400\nN\3O\3"+
		"O\3O\3O\3O\3O\3O\5O\u0409\nO\3P\3P\3P\3P\3P\3P\5P\u0411\nP\3P\2\2Q\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\2\3\4\2\r\r\21\23\u042a"+
		"\2\u00a0\3\2\2\2\4\u00be\3\2\2\2\6\u00cd\3\2\2\2\b\u00df\3\2\2\2\n\u00e1"+
		"\3\2\2\2\f\u00ee\3\2\2\2\16\u00f3\3\2\2\2\20\u010c\3\2\2\2\22\u010e\3"+
		"\2\2\2\24\u0113\3\2\2\2\26\u011f\3\2\2\2\30\u0129\3\2\2\2\32\u012b\3\2"+
		"\2\2\34\u0139\3\2\2\2\36\u0144\3\2\2\2 \u0153\3\2\2\2\"\u0155\3\2\2\2"+
		"$\u015e\3\2\2\2&\u0171\3\2\2\2(\u0173\3\2\2\2*\u01a1\3\2\2\2,\u01b1\3"+
		"\2\2\2.\u01b5\3\2\2\2\60\u01ba\3\2\2\2\62\u01bc\3\2\2\2\64\u01bf\3\2\2"+
		"\2\66\u01c8\3\2\2\28\u01cb\3\2\2\2:\u01d0\3\2\2\2<\u01d4\3\2\2\2>\u01d6"+
		"\3\2\2\2@\u01da\3\2\2\2B\u01e6\3\2\2\2D\u01eb\3\2\2\2F\u01f4\3\2\2\2H"+
		"\u01f9\3\2\2\2J\u020a\3\2\2\2L\u020e\3\2\2\2N\u021a\3\2\2\2P\u022a\3\2"+
		"\2\2R\u022c\3\2\2\2T\u0259\3\2\2\2V\u025b\3\2\2\2X\u0267\3\2\2\2Z\u0271"+
		"\3\2\2\2\\\u0273\3\2\2\2^\u0279\3\2\2\2`\u0286\3\2\2\2b\u0296\3\2\2\2"+
		"d\u029f\3\2\2\2f\u02a8\3\2\2\2h\u02aa\3\2\2\2j\u02b6\3\2\2\2l\u02bb\3"+
		"\2\2\2n\u02e1\3\2\2\2p\u02e9\3\2\2\2r\u02f1\3\2\2\2t\u02f3\3\2\2\2v\u02ff"+
		"\3\2\2\2x\u0309\3\2\2\2z\u030b\3\2\2\2|\u0314\3\2\2\2~\u0330\3\2\2\2\u0080"+
		"\u034c\3\2\2\2\u0082\u0366\3\2\2\2\u0084\u0372\3\2\2\2\u0086\u0374\3\2"+
		"\2\2\u0088\u0382\3\2\2\2\u008a\u039e\3\2\2\2\u008c\u03a0\3\2\2\2\u008e"+
		"\u03ab\3\2\2\2\u0090\u03bc\3\2\2\2\u0092\u03ca\3\2\2\2\u0094\u03e0\3\2"+
		"\2\2\u0096\u03e2\3\2\2\2\u0098\u03f0\3\2\2\2\u009a\u03ff\3\2\2\2\u009c"+
		"\u0408\3\2\2\2\u009e\u0410\3\2\2\2\u00a0\u00a1\b\2\1\2\u00a1\u00a3\b\2"+
		"\1\2\u00a2\u00a4\7\6\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a6\b\2\1\2\u00a6\u00a7\5\4\3\2\u00a7\u00a8\5\u009e"+
		"P\2\u00a8\u00a9\7\35\2\2\u00a9\u00ad\b\2\1\2\u00aa\u00ac\5\b\5\2\u00ab"+
		"\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\b\2\1\2\u00b1"+
		"\u00b2\5$\23\2\u00b2\u00b6\b\2\1\2\u00b3\u00b5\5\"\22\2\u00b4\u00b3\3"+
		"\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\b\2\1\2\u00ba\u00bb\b\2"+
		"\1\2\u00bb\u00bc\7\2\2\3\u00bc\u00bd\b\2\1\2\u00bd\3\3\2\2\2\u00be\u00bf"+
		"\b\3\1\2\u00bf\u00c0\5\6\4\2\u00c0\u00c1\b\3\1\2\u00c1\5\3\2\2\2\u00c2"+
		"\u00c3\b\4\1\2\u00c3\u00c4\7\16\2\2\u00c4\u00c5\7\20\2\2\u00c5\u00ce\b"+
		"\4\1\2\u00c6\u00c7\b\4\1\2\u00c7\u00c8\7\17\2\2\u00c8\u00c9\7\20\2\2\u00c9"+
		"\u00ce\b\4\1\2\u00ca\u00cb\b\4\1\2\u00cb\u00cc\7\20\2\2\u00cc\u00ce\b"+
		"\4\1\2\u00cd\u00c2\3\2\2\2\u00cd\u00c6\3\2\2\2\u00cd\u00ca\3\2\2\2\u00ce"+
		"\7\3\2\2\2\u00cf\u00d0\b\5\1\2\u00d0\u00d1\5\n\6\2\u00d1\u00d2\b\5\1\2"+
		"\u00d2\u00e0\3\2\2\2\u00d3\u00d4\b\5\1\2\u00d4\u00d5\5\24\13\2\u00d5\u00d6"+
		"\b\5\1\2\u00d6\u00e0\3\2\2\2\u00d7\u00d8\b\5\1\2\u00d8\u00d9\5\32\16\2"+
		"\u00d9\u00da\b\5\1\2\u00da\u00e0\3\2\2\2\u00db\u00dc\b\5\1\2\u00dc\u00dd"+
		"\5\34\17\2\u00dd\u00de\b\5\1\2\u00de\u00e0\3\2\2\2\u00df\u00cf\3\2\2\2"+
		"\u00df\u00d3\3\2\2\2\u00df\u00d7\3\2\2\2\u00df\u00db\3\2\2\2\u00e0\t\3"+
		"\2\2\2\u00e1\u00e2\b\6\1\2\u00e2\u00e3\7\n\2\2\u00e3\u00e7\b\6\1\2\u00e4"+
		"\u00e6\5\f\7\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea"+
		"\u00eb\b\6\1\2\u00eb\u00ec\7/\2\2\u00ec\u00ed\b\6\1\2\u00ed\13\3\2\2\2"+
		"\u00ee\u00ef\b\7\1\2\u00ef\u00f0\5\16\b\2\u00f0\u00f1\7\35\2\2\u00f1\u00f2"+
		"\b\7\1\2\u00f2\r\3\2\2\2\u00f3\u00f4\b\b\1\2\u00f4\u00f5\5\u009eP\2\u00f5"+
		"\u00f6\7#\2\2\u00f6\u00f7\5\20\t\2\u00f7\u00f8\b\b\1\2\u00f8\17\3\2\2"+
		"\2\u00f9\u00fa\b\t\1\2\u00fa\u00fe\5\u009eP\2\u00fb\u00fd\5\22\n\2\u00fc"+
		"\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\b\t\1\2\u0102"+
		"\u010d\3\2\2\2\u0103\u0104\b\t\1\2\u0104\u0105\7\62\2\2\u0105\u010d\b"+
		"\t\1\2\u0106\u0107\b\t\1\2\u0107\u0108\7\65\2\2\u0108\u010d\b\t\1\2\u0109"+
		"\u010a\b\t\1\2\u010a\u010b\7\61\2\2\u010b\u010d\b\t\1\2\u010c\u00f9\3"+
		"\2\2\2\u010c\u0103\3\2\2\2\u010c\u0106\3\2\2\2\u010c\u0109\3\2\2\2\u010d"+
		"\21\3\2\2\2\u010e\u010f\b\n\1\2\u010f\u0110\7*\2\2\u0110\u0111\5\u009e"+
		"P\2\u0111\u0112\b\n\1\2\u0112\23\3\2\2\2\u0113\u0114\b\13\1\2\u0114\u0115"+
		"\7\f\2\2\u0115\u0119\5\30\r\2\u0116\u0118\5\26\f\2\u0117\u0116\3\2\2\2"+
		"\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c"+
		"\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7\35\2\2\u011d\u011e\b\13\1\2"+
		"\u011e\25\3\2\2\2\u011f\u0120\b\f\1\2\u0120\u0121\7\34\2\2\u0121\u0122"+
		"\5\30\r\2\u0122\u0123\b\f\1\2\u0123\27\3\2\2\2\u0124\u0125\5\u009eP\2"+
		"\u0125\u0126\7#\2\2\u0126\u0127\5\u009eP\2\u0127\u012a\3\2\2\2\u0128\u012a"+
		"\5\u009eP\2\u0129\u0124\3\2\2\2\u0129\u0128\3\2\2\2\u012a\31\3\2\2\2\u012b"+
		"\u012c\7\13\2\2\u012c\u0131\5\u009eP\2\u012d\u012e\7\34\2\2\u012e\u0130"+
		"\5\u009eP\2\u012f\u012d\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2"+
		"\2\u0131\u0132\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0136"+
		"\7\34\2\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2"+
		"\u0137\u0138\7/\2\2\u0138\33\3\2\2\2\u0139\u013a\b\17\1\2\u013a\u013b"+
		"\7,\2\2\u013b\u013d\b\17\1\2\u013c\u013e\5\36\20\2\u013d\u013c\3\2\2\2"+
		"\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\b\17\1\2\u0140\u0141"+
		"\5\u009eP\2\u0141\u0142\7\65\2\2\u0142\u0143\b\17\1\2\u0143\35\3\2\2\2"+
		"\u0144\u0145\b\20\1\2\u0145\u0146\5 \21\2\u0146\u0147\7\33\2\2\u0147\u0148"+
		"\b\20\1\2\u0148\37\3\2\2\2\u0149\u014a\b\21\1\2\u014a\u014b\5\u009eP\2"+
		"\u014b\u014c\b\21\1\2\u014c\u0154\3\2\2\2\u014d\u014e\b\21\1\2\u014e\u014f"+
		"\7\16\2\2\u014f\u0154\b\21\1\2\u0150\u0151\b\21\1\2\u0151\u0152\7\17\2"+
		"\2\u0152\u0154\b\21\1\2\u0153\u0149\3\2\2\2\u0153\u014d\3\2\2\2\u0153"+
		"\u0150\3\2\2\2\u0154!\3\2\2\2\u0155\u0156\7\31\2\2\u0156\u0157\5\u009e"+
		"P\2\u0157\u015b\7\35\2\2\u0158\u015a\5H%\2\u0159\u0158\3\2\2\2\u015a\u015d"+
		"\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c#\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015e\u015f\b\23\1\2\u015f\u0163\b\23\1\2\u0160\u0162\5"+
		"&\24\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0167\b\23"+
		"\1\2\u0167\u0168\b\23\1\2\u0168%\3\2\2\2\u0169\u016a\b\24\1\2\u016a\u016b"+
		"\5(\25\2\u016b\u016c\b\24\1\2\u016c\u0172\3\2\2\2\u016d\u016e\b\24\1\2"+
		"\u016e\u016f\5H%\2\u016f\u0170\b\24\1\2\u0170\u0172\3\2\2\2\u0171\u0169"+
		"\3\2\2\2\u0171\u016d\3\2\2\2\u0172\'\3\2\2\2\u0173\u0174\b\25\1\2\u0174"+
		"\u0176\b\25\1\2\u0175\u0177\7\6\2\2\u0176\u0175\3\2\2\2\u0176\u0177\3"+
		"\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\b\25\1\2\u0179\u017b\b\25\1\2\u017a"+
		"\u017c\5:\36\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017d\u017e\b\25\1\2\u017e\u017f\7\4\2\2\u017f\u0181\b\25\1\2\u0180"+
		"\u0182\7\67\2\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3"+
		"\2\2\2\u0183\u0184\b\25\1\2\u0184\u0186\b\25\1\2\u0185\u0187\5\62\32\2"+
		"\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189"+
		"\b\25\1\2\u0189\u018b\b\25\1\2\u018a\u018c\5\64\33\2\u018b\u018a\3\2\2"+
		"\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\b\25\1\2\u018e"+
		"\u0190\b\25\1\2\u018f\u0191\5\66\34\2\u0190\u018f\3\2\2\2\u0190\u0191"+
		"\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\b\25\1\2\u0193\u0197\b\25\1\2"+
		"\u0194\u0196\5\60\31\2\u0195\u0194\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195"+
		"\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a"+
		"\u019b\b\25\1\2\u019b\u019c\7\32\2\2\u019c\u019d\5> \2\u019d\u019e\7\35"+
		"\2\2\u019e\u019f\5*\26\2\u019f\u01a0\b\25\1\2\u01a0)\3\2\2\2\u01a1\u01a2"+
		"\b\26\1\2\u01a2\u01a6\b\26\1\2\u01a3\u01a5\5,\27\2\u01a4\u01a3\3\2\2\2"+
		"\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9"+
		"\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\b\26\1\2\u01aa\u01ac\b\26\1\2"+
		"\u01ab\u01ad\5.\30\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae"+
		"\3\2\2\2\u01ae\u01af\b\26\1\2\u01af\u01b0\b\26\1\2\u01b0+\3\2\2\2\u01b1"+
		"\u01b2\7\27\2\2\u01b2\u01b3\7\67\2\2\u01b3\u01b4\7\65\2\2\u01b4-\3\2\2"+
		"\2\u01b5\u01b6\7\30\2\2\u01b6\u01b7\7\65\2\2\u01b7/\3\2\2\2\u01b8\u01bb"+
		"\5\n\6\2\u01b9\u01bb\58\35\2\u01ba\u01b8\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bb"+
		"\61\3\2\2\2\u01bc\u01bd\7\24\2\2\u01bd\u01be\7\67\2\2\u01be\63\3\2\2\2"+
		"\u01bf\u01c0\7\26\2\2\u01c0\u01c5\5\u009eP\2\u01c1\u01c2\7\34\2\2\u01c2"+
		"\u01c4\5\u009eP\2\u01c3\u01c1\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3"+
		"\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\65\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8"+
		"\u01c9\7\25\2\2\u01c9\u01ca\7\67\2\2\u01ca\67\3\2\2\2\u01cb\u01cc\7,\2"+
		"\2\u01cc\u01cd\5\u009eP\2\u01cd\u01ce\7\65\2\2\u01ce9\3\2\2\2\u01cf\u01d1"+
		"\5<\37\2\u01d0\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3;\3\2\2\2\u01d4\u01d5\t\2\2\2\u01d5=\3\2\2\2\u01d6"+
		"\u01d7\b \1\2\u01d7\u01d8\5@!\2\u01d8\u01d9\b \1\2\u01d9?\3\2\2\2\u01da"+
		"\u01db\b!\1\2\u01db\u01dc\5D#\2\u01dc\u01e0\b!\1\2\u01dd\u01df\5B\"\2"+
		"\u01de\u01dd\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1"+
		"\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e4\b!\1\2\u01e4"+
		"\u01e5\b!\1\2\u01e5A\3\2\2\2\u01e6\u01e7\b\"\1\2\u01e7\u01e8\7(\2\2\u01e8"+
		"\u01e9\5D#\2\u01e9\u01ea\b\"\1\2\u01eaC\3\2\2\2\u01eb\u01ec\b#\1\2\u01ec"+
		"\u01ed\5l\67\2\u01ed\u01ef\b#\1\2\u01ee\u01f0\5F$\2\u01ef\u01ee\3\2\2"+
		"\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\b#\1\2\u01f2\u01f3"+
		"\b#\1\2\u01f3E\3\2\2\2\u01f4\u01f5\b$\1\2\u01f5\u01f6\7-\2\2\u01f6\u01f7"+
		"\5\u009eP\2\u01f7\u01f8\b$\1\2\u01f8G\3\2\2\2\u01f9\u01fa\b%\1\2\u01fa"+
		"\u01fc\b%\1\2\u01fb\u01fd\7\6\2\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2"+
		"\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\b%\1\2\u01ff\u0201\b%\1\2\u0200\u0202"+
		"\7\r\2\2\u0201\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203"+
		"\u0204\b%\1\2\u0204\u0205\7\3\2\2\u0205\u0206\7\32\2\2\u0206\u0207\5J"+
		"&\2\u0207\u0208\7\35\2\2\u0208\u0209\b%\1\2\u0209I\3\2\2\2\u020a\u020b"+
		"\b&\1\2\u020b\u020c\5L\'\2\u020c\u020d\b&\1\2\u020dK\3\2\2\2\u020e\u020f"+
		"\b\'\1\2\u020f\u0210\5P)\2\u0210\u0214\b\'\1\2\u0211\u0213\5N(\2\u0212"+
		"\u0211\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2"+
		"\2\2\u0215\u0217\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u0218\b\'\1\2\u0218"+
		"\u0219\b\'\1\2\u0219M\3\2\2\2\u021a\u021b\b(\1\2\u021b\u021c\7(\2\2\u021c"+
		"\u021d\5P)\2\u021d\u021e\b(\1\2\u021eO\3\2\2\2\u021f\u0220\b)\1\2\u0220"+
		"\u0221\5R*\2\u0221\u0223\b)\1\2\u0222\u0224\5^\60\2\u0223\u0222\3\2\2"+
		"\2\u0223\u0224\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\b)\1\2\u0226\u0227"+
		"\b)\1\2\u0227\u022b\3\2\2\2\u0228\u0229\b)\1\2\u0229\u022b\b)\1\2\u022a"+
		"\u021f\3\2\2\2\u022a\u0228\3\2\2\2\u022bQ\3\2\2\2\u022c\u022d\b*\1\2\u022d"+
		"\u022f\b*\1\2\u022e\u0230\5T+\2\u022f\u022e\3\2\2\2\u0230\u0231\3\2\2"+
		"\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234"+
		"\b*\1\2\u0234\u0235\b*\1\2\u0235S\3\2\2\2\u0236\u0237\b+\1\2\u0237\u0238"+
		"\5V,\2\u0238\u023a\b+\1\2\u0239\u023b\5~@\2\u023a\u0239\3\2\2\2\u023a"+
		"\u023b\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023d\b+\1\2\u023d\u023e\b+\1"+
		"\2\u023e\u025a\3\2\2\2\u023f\u0240\b+\1\2\u0240\u0241\5\u0080A\2\u0241"+
		"\u0243\b+\1\2\u0242\u0244\5~@\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2"+
		"\2\u0244\u0245\3\2\2\2\u0245\u0246\b+\1\2\u0246\u0247\b+\1\2\u0247\u025a"+
		"\3\2\2\2\u0248\u0249\b+\1\2\u0249\u024a\5\\/\2\u024a\u024c\b+\1\2\u024b"+
		"\u024d\5~@\2\u024c\u024b\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\3\2\2"+
		"\2\u024e\u024f\b+\1\2\u024f\u0250\b+\1\2\u0250\u025a\3\2\2\2\u0251\u0252"+
		"\b+\1\2\u0252\u0253\7\65\2\2\u0253\u0255\b+\1\2\u0254\u0256\7$\2\2\u0255"+
		"\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\b+"+
		"\1\2\u0258\u025a\b+\1\2\u0259\u0236\3\2\2\2\u0259\u023f\3\2\2\2\u0259"+
		"\u0248\3\2\2\2\u0259\u0251\3\2\2\2\u025aU\3\2\2\2\u025b\u025c\b,\1\2\u025c"+
		"\u025d\5\u009eP\2\u025d\u025e\5X-\2\u025e\u025f\5Z.\2\u025f\u0260\b,\1"+
		"\2\u0260W\3\2\2\2\u0261\u0262\b-\1\2\u0262\u0263\7#\2\2\u0263\u0268\b"+
		"-\1\2\u0264\u0265\b-\1\2\u0265\u0266\7\'\2\2\u0266\u0268\b-\1\2\u0267"+
		"\u0261\3\2\2\2\u0267\u0264\3\2\2\2\u0268Y\3\2\2\2\u0269\u026a\b.\1\2\u026a"+
		"\u026b\5\u0080A\2\u026b\u026c\b.\1\2\u026c\u0272\3\2\2\2\u026d\u026e\b"+
		".\1\2\u026e\u026f\5\u008cG\2\u026f\u0270\b.\1\2\u0270\u0272\3\2\2\2\u0271"+
		"\u0269\3\2\2\2\u0271\u026d\3\2\2\2\u0272[\3\2\2\2\u0273\u0274\b/\1\2\u0274"+
		"\u0275\7\36\2\2\u0275\u0276\5L\'\2\u0276\u0277\7\37\2\2\u0277\u0278\b"+
		"/\1\2\u0278]\3\2\2\2\u0279\u027a\b\60\1\2\u027a\u027b\7 \2\2\u027b\u027c"+
		"\5b\62\2\u027c\u0280\b\60\1\2\u027d\u027f\5`\61\2\u027e\u027d\3\2\2\2"+
		"\u027f\u0282\3\2\2\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0283"+
		"\3\2\2\2\u0282\u0280\3\2\2\2\u0283\u0284\b\60\1\2\u0284\u0285\b\60\1\2"+
		"\u0285_\3\2\2\2\u0286\u0287\b\61\1\2\u0287\u0288\7\34\2\2\u0288\u0289"+
		"\5b\62\2\u0289\u028a\b\61\1\2\u028aa\3\2\2\2\u028b\u028c\b\62\1\2\u028c"+
		"\u028d\5d\63\2\u028d\u028e\7\36\2\2\u028e\u028f\5f\64\2\u028f\u0290\7"+
		"\37\2\2\u0290\u0291\b\62\1\2\u0291\u0297\3\2\2\2\u0292\u0293\b\62\1\2"+
		"\u0293\u0294\5d\63\2\u0294\u0295\b\62\1\2\u0295\u0297\3\2\2\2\u0296\u028b"+
		"\3\2\2\2\u0296\u0292\3\2\2\2\u0297c\3\2\2\2\u0298\u0299\b\63\1\2\u0299"+
		"\u029a\5\u009eP\2\u029a\u029b\b\63\1\2\u029b\u02a0\3\2\2\2\u029c\u029d"+
		"\b\63\1\2\u029d\u029e\7\31\2\2\u029e\u02a0\b\63\1\2\u029f\u0298\3\2\2"+
		"\2\u029f\u029c\3\2\2\2\u02a0e\3\2\2\2\u02a1\u02a2\b\64\1\2\u02a2\u02a3"+
		"\5\u009eP\2\u02a3\u02a4\b\64\1\2\u02a4\u02a9\3\2\2\2\u02a5\u02a6\b\64"+
		"\1\2\u02a6\u02a7\7\61\2\2\u02a7\u02a9\b\64\1\2\u02a8\u02a1\3\2\2\2\u02a8"+
		"\u02a5\3\2\2\2\u02a9g\3\2\2\2\u02aa\u02ab\b\65\1\2\u02ab\u02ac\5l\67\2"+
		"\u02ac\u02b0\b\65\1\2\u02ad\u02af\5j\66\2\u02ae\u02ad\3\2\2\2\u02af\u02b2"+
		"\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b3\3\2\2\2\u02b2"+
		"\u02b0\3\2\2\2\u02b3\u02b4\b\65\1\2\u02b4\u02b5\b\65\1\2\u02b5i\3\2\2"+
		"\2\u02b6\u02b7\b\66\1\2\u02b7\u02b8\7(\2\2\u02b8\u02b9\5l\67\2\u02b9\u02ba"+
		"\b\66\1\2\u02bak\3\2\2\2\u02bb\u02bc\b\67\1\2\u02bc\u02be\b\67\1\2\u02bd"+
		"\u02bf\5\u0096L\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0"+
		"\3\2\2\2\u02c0\u02c1\b\67\1\2\u02c1\u02c5\b\67\1\2\u02c2\u02c4\5n8\2\u02c3"+
		"\u02c2\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2"+
		"\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02c9\b\67\1\2\u02c9"+
		"\u02ca\b\67\1\2\u02cam\3\2\2\2\u02cb\u02cc\b8\1\2\u02cc\u02cd\5t;\2\u02cd"+
		"\u02ce\5p9\2\u02ce\u02cf\b8\1\2\u02cf\u02e2\3\2\2\2\u02d0\u02d1\b8\1\2"+
		"\u02d1\u02d2\5\u0082B\2\u02d2\u02d3\5r:\2\u02d3\u02d4\b8\1\2\u02d4\u02e2"+
		"\3\2\2\2\u02d5\u02d6\b8\1\2\u02d6\u02d7\5z>\2\u02d7\u02d8\b8\1\2\u02d8"+
		"\u02e2\3\2\2\2\u02d9\u02da\b8\1\2\u02da\u02db\7\65\2\2\u02db\u02dd\b8"+
		"\1\2\u02dc\u02de\7$\2\2\u02dd\u02dc\3\2\2\2\u02dd\u02de\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02df\u02e0\b8\1\2\u02e0\u02e2\b8\1\2\u02e1\u02cb\3\2\2"+
		"\2\u02e1\u02d0\3\2\2\2\u02e1\u02d5\3\2\2\2\u02e1\u02d9\3\2\2\2\u02e2o"+
		"\3\2\2\2\u02e3\u02e4\b9\1\2\u02e4\u02e5\5~@\2\u02e5\u02e6\b9\1\2\u02e6"+
		"\u02ea\3\2\2\2\u02e7\u02e8\b9\1\2\u02e8\u02ea\b9\1\2\u02e9\u02e3\3\2\2"+
		"\2\u02e9\u02e7\3\2\2\2\u02eaq\3\2\2\2\u02eb\u02ec\b:\1\2\u02ec\u02ed\5"+
		"~@\2\u02ed\u02ee\b:\1\2\u02ee\u02f2\3\2\2\2\u02ef\u02f0\b:\1\2\u02f0\u02f2"+
		"\b:\1\2\u02f1\u02eb\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2s\3\2\2\2\u02f3\u02f4"+
		"\b;\1\2\u02f4\u02f5\5\u009eP\2\u02f5\u02f6\5v<\2\u02f6\u02f7\5x=\2\u02f7"+
		"\u02f8\b;\1\2\u02f8u\3\2\2\2\u02f9\u02fa\b<\1\2\u02fa\u02fb\7#\2\2\u02fb"+
		"\u0300\b<\1\2\u02fc\u02fd\b<\1\2\u02fd\u02fe\7\'\2\2\u02fe\u0300\b<\1"+
		"\2\u02ff\u02f9\3\2\2\2\u02ff\u02fc\3\2\2\2\u0300w\3\2\2\2\u0301\u0302"+
		"\b=\1\2\u0302\u0303\5\u0082B\2\u0303\u0304\b=\1\2\u0304\u030a\3\2\2\2"+
		"\u0305\u0306\b=\1\2\u0306\u0307\5\u008cG\2\u0307\u0308\b=\1\2\u0308\u030a"+
		"\3\2\2\2\u0309\u0301\3\2\2\2\u0309\u0305\3\2\2\2\u030ay\3\2\2\2\u030b"+
		"\u030c\b>\1\2\u030c\u030d\5\u008cG\2\u030d\u030f\b>\1\2\u030e\u0310\5"+
		"|?\2\u030f\u030e\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0311\3\2\2\2\u0311"+
		"\u0312\b>\1\2\u0312\u0313\b>\1\2\u0313{\3\2\2\2\u0314\u0315\b?\1\2\u0315"+
		"\u0316\5~@\2\u0316\u0317\b?\1\2\u0317}\3\2\2\2\u0318\u0319\b@\1\2\u0319"+
		"\u031a\7$\2\2\u031a\u031c\b@\1\2\u031b\u031d\7$\2\2\u031c\u031b\3\2\2"+
		"\2\u031c\u031d\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031f\b@\1\2\u031f\u0331"+
		"\b@\1\2\u0320\u0321\b@\1\2\u0321\u0322\7%\2\2\u0322\u0324\b@\1\2\u0323"+
		"\u0325\7$\2\2\u0324\u0323\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326\3\2"+
		"\2\2\u0326\u0327\b@\1\2\u0327\u0331\b@\1\2\u0328\u0329\b@\1\2\u0329\u032a"+
		"\7&\2\2\u032a\u032c\b@\1\2\u032b\u032d\7$\2\2\u032c\u032b\3\2\2\2\u032c"+
		"\u032d\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f\b@\1\2\u032f\u0331\b@\1"+
		"\2\u0330\u0318\3\2\2\2\u0330\u0320\3\2\2\2\u0330\u0328\3\2\2\2\u0331\177"+
		"\3\2\2\2\u0332\u0333\bA\1\2\u0333\u0334\5\u0092J\2\u0334\u0335\bA\1\2"+
		"\u0335\u034d\3\2\2\2\u0336\u0337\bA\1\2\u0337\u0338\5\u0094K\2\u0338\u0339"+
		"\bA\1\2\u0339\u034d\3\2\2\2\u033a\u033b\bA\1\2\u033b\u033c\7\4\2\2\u033c"+
		"\u034d\bA\1\2\u033d\u033e\bA\1\2\u033e\u033f\5\u0084C\2\u033f\u0340\b"+
		"A\1\2\u0340\u034d\3\2\2\2\u0341\u0342\bA\1\2\u0342\u0343\7\5\2\2\u0343"+
		"\u034d\bA\1\2\u0344\u0345\bA\1\2\u0345\u0346\7*\2\2\u0346\u0348\bA\1\2"+
		"\u0347\u0349\5\u0096L\2\u0348\u0347\3\2\2\2\u0348\u0349\3\2\2\2\u0349"+
		"\u034a\3\2\2\2\u034a\u034b\bA\1\2\u034b\u034d\bA\1\2\u034c\u0332\3\2\2"+
		"\2\u034c\u0336\3\2\2\2\u034c\u033a\3\2\2\2\u034c\u033d\3\2\2\2\u034c\u0341"+
		"\3\2\2\2\u034c\u0344\3\2\2\2\u034d\u0081\3\2\2\2\u034e\u034f\bB\1\2\u034f"+
		"\u0350\5\u0092J\2\u0350\u0351\bB\1\2\u0351\u0367\3\2\2\2\u0352\u0353\b"+
		"B\1\2\u0353\u0354\5\u0094K\2\u0354\u0355\bB\1\2\u0355\u0367\3\2\2\2\u0356"+
		"\u0357\bB\1\2\u0357\u0358\5\u0090I\2\u0358\u0359\bB\1\2\u0359\u0367\3"+
		"\2\2\2\u035a\u035b\bB\1\2\u035b\u035c\5\u0084C\2\u035c\u035d\bB\1\2\u035d"+
		"\u0367\3\2\2\2\u035e\u035f\bB\1\2\u035f\u0360\7*\2\2\u0360\u0362\bB\1"+
		"\2\u0361\u0363\5\u0096L\2\u0362\u0361\3\2\2\2\u0362\u0363\3\2\2\2\u0363"+
		"\u0364\3\2\2\2\u0364\u0365\bB\1\2\u0365\u0367\bB\1\2\u0366\u034e\3\2\2"+
		"\2\u0366\u0352\3\2\2\2\u0366\u0356\3\2\2\2\u0366\u035a\3\2\2\2\u0366\u035e"+
		"\3\2\2\2\u0367\u0083\3\2\2\2\u0368\u0369\bC\1\2\u0369\u036a\7.\2\2\u036a"+
		"\u036b\5\u008aF\2\u036b\u036c\bC\1\2\u036c\u0373\3\2\2\2\u036d\u036e\b"+
		"C\1\2\u036e\u036f\7.\2\2\u036f\u0370\5\u0086D\2\u0370\u0371\bC\1\2\u0371"+
		"\u0373\3\2\2\2\u0372\u0368\3\2\2\2\u0372\u036d\3\2\2\2\u0373\u0085\3\2"+
		"\2\2\u0374\u0375\bD\1\2\u0375\u0376\7\36\2\2\u0376\u0377\5\u008aF\2\u0377"+
		"\u037b\bD\1\2\u0378\u037a\5\u0088E\2\u0379\u0378\3\2\2\2\u037a\u037d\3"+
		"\2\2\2\u037b\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037e\3\2\2\2\u037d"+
		"\u037b\3\2\2\2\u037e\u037f\bD\1\2\u037f\u0380\7\37\2\2\u0380\u0381\bD"+
		"\1\2\u0381\u0087\3\2\2\2\u0382\u0383\bE\1\2\u0383\u0384\7(\2\2\u0384\u0385"+
		"\5\u008aF\2\u0385\u0386\bE\1\2\u0386\u0089\3\2\2\2\u0387\u0388\bF\1\2"+
		"\u0388\u0389\7\3\2\2\u0389\u038b\bF\1\2\u038a\u038c\5\u0096L\2\u038b\u038a"+
		"\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038e\bF\1\2\u038e"+
		"\u039f\bF\1\2\u038f\u0390\bF\1\2\u0390\u0391\7\62\2\2\u0391\u0393\bF\1"+
		"\2\u0392\u0394\5\u0096L\2\u0393\u0392\3\2\2\2\u0393\u0394\3\2\2\2\u0394"+
		"\u0395\3\2\2\2\u0395\u0396\bF\1\2\u0396\u039f\bF\1\2\u0397\u0398\bF\1"+
		"\2\u0398\u0399\5\u0092J\2\u0399\u039a\bF\1\2\u039a\u039f\3\2\2\2\u039b"+
		"\u039c\bF\1\2\u039c\u039d\7\5\2\2\u039d\u039f\bF\1\2\u039e\u0387\3\2\2"+
		"\2\u039e\u038f\3\2\2\2\u039e\u0397\3\2\2\2\u039e\u039b\3\2\2\2\u039f\u008b"+
		"\3\2\2\2\u03a0\u03a1\bG\1\2\u03a1\u03a2\7\36\2\2\u03a2\u03a4\bG\1\2\u03a3"+
		"\u03a5\5\u008eH\2\u03a4\u03a3\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a6"+
		"\3\2\2\2\u03a6\u03a7\bG\1\2\u03a7\u03a8\5h\65\2\u03a8\u03a9\7\37\2\2\u03a9"+
		"\u03aa\bG\1\2\u03aa\u008d\3\2\2\2\u03ab\u03ac\bH\1\2\u03ac\u03ae\bH\1"+
		"\2\u03ad\u03af\5\n\6\2\u03ae\u03ad\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0"+
		"\3\2\2\2\u03b0\u03b1\bH\1\2\u03b1\u03b5\bH\1\2\u03b2\u03b4\58\35\2\u03b3"+
		"\u03b2\3\2\2\2\u03b4\u03b7\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b5\u03b6\3\2"+
		"\2\2\u03b6\u03b8\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b8\u03b9\bH\1\2\u03b9"+
		"\u03ba\7\32\2\2\u03ba\u03bb\bH\1\2\u03bb\u008f\3\2\2\2\u03bc\u03bd\bI"+
		"\1\2\u03bd\u03be\7\4\2\2\u03be\u03c0\bI\1\2\u03bf\u03c1\7\67\2\2\u03c0"+
		"\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c3\bI"+
		"\1\2\u03c3\u03c5\bI\1\2\u03c4\u03c6\5\u0096L\2\u03c5\u03c4\3\2\2\2\u03c5"+
		"\u03c6\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c8\bI\1\2\u03c8\u03c9\bI\1"+
		"\2\u03c9\u0091\3\2\2\2\u03ca\u03cb\bJ\1\2\u03cb\u03cc\7\62\2\2\u03cc\u03cd"+
		"\7+\2\2\u03cd\u03ce\7\62\2\2\u03ce\u03cf\bJ\1\2\u03cf\u0093\3\2\2\2\u03d0"+
		"\u03d1\bK\1\2\u03d1\u03d2\7\3\2\2\u03d2\u03d4\bK\1\2\u03d3\u03d5\5\u0096"+
		"L\2\u03d4\u03d3\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6"+
		"\u03d7\bK\1\2\u03d7\u03e1\bK\1\2\u03d8\u03d9\bK\1\2\u03d9\u03da\7\62\2"+
		"\2\u03da\u03dc\bK\1\2\u03db\u03dd\5\u0096L\2\u03dc\u03db\3\2\2\2\u03dc"+
		"\u03dd\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df\bK\1\2\u03df\u03e1\bK\1"+
		"\2\u03e0\u03d0\3\2\2\2\u03e0\u03d8\3\2\2\2\u03e1\u0095\3\2\2\2\u03e2\u03e3"+
		"\bL\1\2\u03e3\u03e4\7!\2\2\u03e4\u03e5\5\u009aN\2\u03e5\u03e9\bL\1\2\u03e6"+
		"\u03e8\5\u0098M\2\u03e7\u03e6\3\2\2\2\u03e8\u03eb\3\2\2\2\u03e9\u03e7"+
		"\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03ec\3\2\2\2\u03eb\u03e9\3\2\2\2\u03ec"+
		"\u03ed\bL\1\2\u03ed\u03ee\7\"\2\2\u03ee\u03ef\bL\1\2\u03ef\u0097\3\2\2"+
		"\2\u03f0\u03f1\bM\1\2\u03f1\u03f2\7\34\2\2\u03f2\u03f3\5\u009aN\2\u03f3"+
		"\u03f4\bM\1\2\u03f4\u0099\3\2\2\2\u03f5\u03f6\bN\1\2\u03f6\u03f7\5\u009e"+
		"P\2\u03f7\u03f8\bN\1\2\u03f8\u0400\3\2\2\2\u03f9\u03fa\bN\1\2\u03fa\u03fb"+
		"\5\u009eP\2\u03fb\u03fc\7#\2\2\u03fc\u03fd\5\u009cO\2\u03fd\u03fe\bN\1"+
		"\2\u03fe\u0400\3\2\2\2\u03ff\u03f5\3\2\2\2\u03ff\u03f9\3\2\2\2\u0400\u009b"+
		"\3\2\2\2\u0401\u0402\bO\1\2\u0402\u0403\5\u009eP\2\u0403\u0404\bO\1\2"+
		"\u0404\u0409\3\2\2\2\u0405\u0406\bO\1\2\u0406\u0407\7\62\2\2\u0407\u0409"+
		"\bO\1\2\u0408\u0401\3\2\2\2\u0408\u0405\3\2\2\2\u0409\u009d\3\2\2\2\u040a"+
		"\u040b\bP\1\2\u040b\u040c\7\4\2\2\u040c\u0411\bP\1\2\u040d\u040e\bP\1"+
		"\2\u040e\u040f\7\3\2\2\u040f\u0411\bP\1\2\u0410\u040a\3\2\2\2\u0410\u040d"+
		"\3\2\2\2\u0411\u009f\3\2\2\2U\u00a3\u00ad\u00b6\u00cd\u00df\u00e7\u00fe"+
		"\u010c\u0119\u0129\u0131\u0135\u013d\u0153\u015b\u0163\u0171\u0176\u017b"+
		"\u0181\u0186\u018b\u0190\u0197\u01a6\u01ac\u01ba\u01c5\u01d2\u01e0\u01ef"+
		"\u01fc\u0201\u0214\u0223\u022a\u0231\u023a\u0243\u024c\u0255\u0259\u0267"+
		"\u0271\u0280\u0296\u029f\u02a8\u02b0\u02be\u02c5\u02dd\u02e1\u02e9\u02f1"+
		"\u02ff\u0309\u030f\u031c\u0324\u032c\u0330\u0348\u034c\u0362\u0366\u0372"+
		"\u037b\u038b\u0393\u039e\u03a4\u03ae\u03b5\u03c0\u03c5\u03d4\u03dc\u03e0"+
		"\u03e9\u03ff\u0408\u0410";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}