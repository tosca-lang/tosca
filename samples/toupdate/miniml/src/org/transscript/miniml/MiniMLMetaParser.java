// Generated from /Users/villardl/Projects/crsx/crsx4/samples/miniml/MiniMLMetaParser.g4 by ANTLR 4.5
package org.transscript.miniml;

import org.transscript.antlr.SinkAntlrListener;
import static org.transscript.antlr.SinkAntlrListener.fireEnterZOM;
import static org.transscript.antlr.SinkAntlrListener.fireExitZOM;
import static org.transscript.antlr.SinkAntlrListener.fireEnterOPT;
import static org.transscript.antlr.SinkAntlrListener.fireExitOPT;
import static org.transscript.antlr.SinkAntlrListener.fireEnterAlt;
import static org.transscript.antlr.SinkAntlrListener.fireExitAlt;
import static org.transscript.antlr.SinkAntlrListener.fireHide;
import static org.transscript.antlr.SinkAntlrListener.fireEnterSymbol;
import static org.transscript.antlr.SinkAntlrListener.fireExitSymbol;
import static org.transscript.antlr.SinkAntlrListener.fireEnterBinder;
import static org.transscript.antlr.SinkAntlrListener.fireExitBinder;
import static org.transscript.antlr.SinkAntlrListener.fireEnterBinds;
import static org.transscript.antlr.SinkAntlrListener.fireExitBinds;
import static org.transscript.antlr.SinkAntlrListener.fireTail;
import static org.transscript.antlr.SinkAntlrListener.fireTerm;
import static org.transscript.antlr.SinkAntlrListener.fireEmbed;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniMLMetaParser extends org.transscript.antlr.Crsx3Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MT_toplevel=1, ET_toplevel=2, MT_var_TOK=3, ET_var_TOK=4, MT_expr=5, ET_expr=6, 
		MT_timesExpr=7, ET_timesExpr=8, MT_compExpr=9, ET_compExpr=10, MT_primaryExpr=11, 
		ET_primaryExpr=12, MT_int_TOK=13, ET_int_TOK=14, MT_app_expr=15, ET_app_expr=16, 
		MT_simple_expr=17, ET_simple_expr=18, MT_ty=19, ET_ty=20, MT_tyPrimary=21, 
		ET_tyPrimary=22, VAR=23, INT=24, TINT=25, TBOOL=26, TRUE=27, FALSE=28, 
		FUN=29, IS=30, IF=31, THEN=32, ELSE=33, LET=34, SEMISEMI=35, EQUAL=36, 
		LESS=37, TARROW=38, COLON=39, LPAREN=40, RPAREN=41, PLUS=42, MINUS=43, 
		TIMES=44, WS=45, CRSX_EMBED_END=46;
	public static final int
		RULE_toplevel = 0, RULE_toplevel_EOF = 1, RULE_var_TOK = 2, RULE_var_TOK_EOF = 3, 
		RULE_expr = 4, RULE_expr_EOF = 5, RULE_timesExpr = 6, RULE_timesExpr_EOF = 7, 
		RULE_compExpr = 8, RULE_compExpr_EOF = 9, RULE_primaryExpr = 10, RULE_primaryExpr_EOF = 11, 
		RULE_int_TOK = 12, RULE_int_TOK_EOF = 13, RULE_app_expr = 14, RULE_app_expr_EOF = 15, 
		RULE_simple_expr = 16, RULE_simple_expr_EOF = 17, RULE_ty = 18, RULE_ty_EOF = 19, 
		RULE_tyPrimary = 20, RULE_tyPrimary_EOF = 21;
	public static final String[] ruleNames = {
		"toplevel", "toplevel_EOF", "var_TOK", "var_TOK_EOF", "expr", "expr_EOF", 
		"timesExpr", "timesExpr_EOF", "compExpr", "compExpr_EOF", "primaryExpr", 
		"primaryExpr_EOF", "int_TOK", "int_TOK_EOF", "app_expr", "app_expr_EOF", 
		"simple_expr", "simple_expr_EOF", "ty", "ty_EOF", "tyPrimary", "tyPrimary_EOF"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'int'", "'bool'", "'true'", "'false'", "'fun'", "'is'", "'if'", 
		"'then'", "'else'", "'let'", "';;'", "'='", "'<'", "'->'", "':'", "'('", 
		"')'", "'+'", "'-'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MT_toplevel", "ET_toplevel", "MT_var_TOK", "ET_var_TOK", "MT_expr", 
		"ET_expr", "MT_timesExpr", "ET_timesExpr", "MT_compExpr", "ET_compExpr", 
		"MT_primaryExpr", "ET_primaryExpr", "MT_int_TOK", "ET_int_TOK", "MT_app_expr", 
		"ET_app_expr", "MT_simple_expr", "ET_simple_expr", "MT_ty", "ET_ty", "MT_tyPrimary", 
		"ET_tyPrimary", "VAR", "INT", "TINT", "TBOOL", "TRUE", "FALSE", "FUN", 
		"IS", "IF", "THEN", "ELSE", "LET", "SEMISEMI", "EQUAL", "LESS", "TARROW", 
		"COLON", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "WS", "CRSX_EMBED_END"
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
	public String getGrammarFileName() { return "MiniMLMetaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	public MiniMLMetaParser() {}
	protected Lexer newLexer(CharStream stream)
	{

	return new MiniMLMetaLexer(stream);
	}

	protected void initATN()
	{    _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}protected String _prefix() { return "MiniML_"; }
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
	protected String _metachar() { return "#";}

	public MiniMLMetaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ToplevelContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(MiniMLMetaParser.LET, 0); }
		public Var_TOKContext var_TOK() {
			return getRuleContext(Var_TOKContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MiniMLMetaParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SEMISEMI() { return getTokens(MiniMLMetaParser.SEMISEMI); }
		public TerminalNode SEMISEMI(int i) {
			return getToken(MiniMLMetaParser.SEMISEMI, i);
		}
		public ToplevelContext toplevel() {
			return getRuleContext(ToplevelContext.class,0);
		}
		public TerminalNode MT_toplevel() { return getToken(MiniMLMetaParser.MT_toplevel, 0); }
		public TerminalNode ET_toplevel() { return getToken(MiniMLMetaParser.ET_toplevel, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(MiniMLMetaParser.CRSX_EMBED_END, 0); }
		public ToplevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toplevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).enterToplevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).exitToplevel(this);
		}
	}

	public final ToplevelContext toplevel() throws RecognitionException {
		ToplevelContext _localctx = new ToplevelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_toplevel);
		try {
			setState(73);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_hide();
				setState(46);
				match(LET);
				_enterBinder("x");
				setState(48);
				var_TOK();
				_exitBinder();
				_hide();
				setState(51);
				match(EQUAL);
				setState(52);
				expr();
				_hide();
				setState(54);
				match(SEMISEMI);
				_enterBinds(" x");
				setState(56);
				toplevel();
				_exitBinds();
				_hide();
				setState(59);
				match(SEMISEMI);
				_exitAlt();
				}
				break;
			case MT_var_TOK:
			case ET_var_TOK:
			case MT_expr:
			case ET_expr:
			case MT_timesExpr:
			case ET_timesExpr:
			case MT_compExpr:
			case ET_compExpr:
			case MT_primaryExpr:
			case ET_primaryExpr:
			case MT_int_TOK:
			case ET_int_TOK:
			case MT_app_expr:
			case ET_app_expr:
			case MT_simple_expr:
			case ET_simple_expr:
			case VAR:
			case INT:
			case TRUE:
			case FALSE:
			case FUN:
			case IF:
			case LPAREN:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(63);
				expr();
				_hide();
				setState(65);
				match(SEMISEMI);
				_exitAlt();
				}
				break;
			case MT_toplevel:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(69);
				match(MT_toplevel);
				}
				break;
			case ET_toplevel:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(71);
				match(ET_toplevel);
				setState(72);
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

	public static class Toplevel_EOFContext extends ParserRuleContext {
		public ToplevelContext toplevel() {
			return getRuleContext(ToplevelContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniMLMetaParser.EOF, 0); }
		public Toplevel_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toplevel_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).enterToplevel_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).exitToplevel_EOF(this);
		}
	}

	public final Toplevel_EOFContext toplevel_EOF() throws RecognitionException {
		Toplevel_EOFContext _localctx = new Toplevel_EOFContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_toplevel_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			toplevel();
			setState(76);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_TOKContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MiniMLMetaParser.VAR, 0); }
		public TerminalNode MT_var_TOK() { return getToken(MiniMLMetaParser.MT_var_TOK, 0); }
		public TerminalNode ET_var_TOK() { return getToken(MiniMLMetaParser.ET_var_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(MiniMLMetaParser.CRSX_EMBED_END, 0); }
		public Var_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).enterVar_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).exitVar_TOK(this);
		}
	}

	public final Var_TOKContext var_TOK() throws RecognitionException {
		Var_TOKContext _localctx = new Var_TOKContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_TOK);
		try {
			setState(88);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				_enterBinder("x");
				setState(80);
				match(VAR);
				_exitBinder();

				}
				break;
			case MT_var_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(84);
				match(MT_var_TOK);
				}
				break;
			case ET_var_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(86);
				match(ET_var_TOK);
				setState(87);
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

	public static class Var_TOK_EOFContext extends ParserRuleContext {
		public Var_TOKContext var_TOK() {
			return getRuleContext(Var_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniMLMetaParser.EOF, 0); }
		public Var_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).enterVar_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).exitVar_TOK_EOF(this);
		}
	}

	public final Var_TOK_EOFContext var_TOK_EOF() throws RecognitionException {
		Var_TOK_EOFContext _localctx = new Var_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			var_TOK();
			setState(91);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TimesExprContext timesExpr() {
			return getRuleContext(TimesExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(MiniMLMetaParser.PLUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(MiniMLMetaParser.MINUS, 0); }
		public TerminalNode MT_expr() { return getToken(MiniMLMetaParser.MT_expr, 0); }
		public TerminalNode ET_expr() { return getToken(MiniMLMetaParser.ET_expr, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(MiniMLMetaParser.CRSX_EMBED_END, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		try {
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(94);
				timesExpr();
				_hide();
				setState(96);
				match(PLUS);
				setState(97);
				expr();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(101);
				timesExpr();
				_hide();
				setState(103);
				match(MINUS);
				setState(104);
				expr();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(108);
				timesExpr();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_term();
				setState(112);
				match(MT_expr);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_embed();
				setState(114);
				match(ET_expr);
				setState(115);
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

	public static class Expr_EOFContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniMLMetaParser.EOF, 0); }
		public Expr_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).enterExpr_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).exitExpr_EOF(this);
		}
	}

	public final Expr_EOFContext expr_EOF() throws RecognitionException {
		Expr_EOFContext _localctx = new Expr_EOFContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			expr();
			setState(119);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimesExprContext extends ParserRuleContext {
		public CompExprContext compExpr() {
			return getRuleContext(CompExprContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(MiniMLMetaParser.TIMES, 0); }
		public TimesExprContext timesExpr() {
			return getRuleContext(TimesExprContext.class,0);
		}
		public TerminalNode MT_timesExpr() { return getToken(MiniMLMetaParser.MT_timesExpr, 0); }
		public TerminalNode ET_timesExpr() { return getToken(MiniMLMetaParser.ET_timesExpr, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(MiniMLMetaParser.CRSX_EMBED_END, 0); }
		public TimesExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timesExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).enterTimesExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).exitTimesExpr(this);
		}
	}

	public final TimesExprContext timesExpr() throws RecognitionException {
		TimesExprContext _localctx = new TimesExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_timesExpr);
		try {
			setState(137);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(122);
				compExpr();
				_hide();
				setState(124);
				match(TIMES);
				setState(125);
				timesExpr();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(129);
				compExpr();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(133);
				match(MT_timesExpr);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(135);
				match(ET_timesExpr);
				setState(136);
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

	public static class TimesExpr_EOFContext extends ParserRuleContext {
		public TimesExprContext timesExpr() {
			return getRuleContext(TimesExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniMLMetaParser.EOF, 0); }
		public TimesExpr_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timesExpr_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).enterTimesExpr_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).exitTimesExpr_EOF(this);
		}
	}

	public final TimesExpr_EOFContext timesExpr_EOF() throws RecognitionException {
		TimesExpr_EOFContext _localctx = new TimesExpr_EOFContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_timesExpr_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			timesExpr();
			setState(140);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompExprContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode LESS() { return getToken(MiniMLMetaParser.LESS, 0); }
		public CompExprContext compExpr() {
			return getRuleContext(CompExprContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MiniMLMetaParser.EQUAL, 0); }
		public TerminalNode MT_compExpr() { return getToken(MiniMLMetaParser.MT_compExpr, 0); }
		public TerminalNode ET_compExpr() { return getToken(MiniMLMetaParser.ET_compExpr, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(MiniMLMetaParser.CRSX_EMBED_END, 0); }
		public CompExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).exitCompExpr(this);
		}
	}

	public final CompExprContext compExpr() throws RecognitionException {
		CompExprContext _localctx = new CompExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_compExpr);
		try {
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(143);
				primaryExpr();
				_hide();
				setState(145);
				match(LESS);
				setState(146);
				compExpr();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(150);
				primaryExpr();
				_hide();
				setState(152);
				match(EQUAL);
				setState(153);
				compExpr();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(157);
				primaryExpr();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_term();
				setState(161);
				match(MT_compExpr);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_embed();
				setState(163);
				match(ET_compExpr);
				setState(164);
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

	public static class CompExpr_EOFContext extends ParserRuleContext {
		public CompExprContext compExpr() {
			return getRuleContext(CompExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniMLMetaParser.EOF, 0); }
		public CompExpr_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compExpr_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).enterCompExpr_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).exitCompExpr_EOF(this);
		}
	}

	public final CompExpr_EOFContext compExpr_EOF() throws RecognitionException {
		CompExpr_EOFContext _localctx = new CompExpr_EOFContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_compExpr_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			compExpr();
			setState(168);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExprContext extends ParserRuleContext {
		public App_exprContext app_expr() {
			return getRuleContext(App_exprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(MiniMLMetaParser.MINUS, 0); }
		public Int_TOKContext int_TOK() {
			return getRuleContext(Int_TOKContext.class,0);
		}
		public TerminalNode IF() { return getToken(MiniMLMetaParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(MiniMLMetaParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(MiniMLMetaParser.ELSE, 0); }
		public TerminalNode FUN() { return getToken(MiniMLMetaParser.FUN, 0); }
		public List<Var_TOKContext> var_TOK() {
			return getRuleContexts(Var_TOKContext.class);
		}
		public Var_TOKContext var_TOK(int i) {
			return getRuleContext(Var_TOKContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(MiniMLMetaParser.LPAREN, 0); }
		public List<TerminalNode> COLON() { return getTokens(MiniMLMetaParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MiniMLMetaParser.COLON, i);
		}
		public List<TyContext> ty() {
			return getRuleContexts(TyContext.class);
		}
		public TyContext ty(int i) {
			return getRuleContext(TyContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MiniMLMetaParser.RPAREN, 0); }
		public TerminalNode IS() { return getToken(MiniMLMetaParser.IS, 0); }
		public TerminalNode MT_primaryExpr() { return getToken(MiniMLMetaParser.MT_primaryExpr, 0); }
		public TerminalNode ET_primaryExpr() { return getToken(MiniMLMetaParser.ET_primaryExpr, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(MiniMLMetaParser.CRSX_EMBED_END, 0); }
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).exitPrimaryExpr(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_primaryExpr);
		try {
			setState(221);
			switch (_input.LA(1)) {
			case MT_var_TOK:
			case ET_var_TOK:
			case MT_int_TOK:
			case ET_int_TOK:
			case MT_app_expr:
			case ET_app_expr:
			case MT_simple_expr:
			case ET_simple_expr:
			case VAR:
			case INT:
			case TRUE:
			case FALSE:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(171);
				app_expr();
				_exitAlt();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(176);
				match(MINUS);
				setState(177);
				int_TOK();
				_exitAlt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				_hide();
				setState(182);
				match(IF);
				setState(183);
				expr();
				_hide();
				setState(185);
				match(THEN);
				setState(186);
				expr();
				_hide();
				setState(188);
				match(ELSE);
				setState(189);
				expr();
				_exitAlt();
				}
				break;
			case FUN:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				_hide();
				setState(194);
				match(FUN);
				setState(195);
				var_TOK();
				_hide();
				setState(197);
				match(LPAREN);
				_enterBinder("x");
				setState(199);
				var_TOK();
				_exitBinder();
				_hide();
				setState(202);
				match(COLON);
				setState(203);
				ty();
				_hide();
				setState(205);
				match(RPAREN);
				_hide();
				setState(207);
				match(COLON);
				setState(208);
				ty();
				_hide();
				setState(210);
				match(IS);
				_enterBinds(" x");
				setState(212);
				expr();
				_exitBinds();
				_exitAlt();
				}
				break;
			case MT_primaryExpr:
				enterOuterAlt(_localctx, 5);
				{
				_term();
				setState(217);
				match(MT_primaryExpr);
				}
				break;
			case ET_primaryExpr:
				enterOuterAlt(_localctx, 6);
				{
				_embed();
				setState(219);
				match(ET_primaryExpr);
				setState(220);
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

	public static class PrimaryExpr_EOFContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniMLMetaParser.EOF, 0); }
		public PrimaryExpr_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).enterPrimaryExpr_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).exitPrimaryExpr_EOF(this);
		}
	}

	public final PrimaryExpr_EOFContext primaryExpr_EOF() throws RecognitionException {
		PrimaryExpr_EOFContext _localctx = new PrimaryExpr_EOFContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_primaryExpr_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			primaryExpr();
			setState(224);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_TOKContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MiniMLMetaParser.INT, 0); }
		public TerminalNode MT_int_TOK() { return getToken(MiniMLMetaParser.MT_int_TOK, 0); }
		public TerminalNode ET_int_TOK() { return getToken(MiniMLMetaParser.ET_int_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(MiniMLMetaParser.CRSX_EMBED_END, 0); }
		public Int_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).enterInt_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).exitInt_TOK(this);
		}
	}

	public final Int_TOKContext int_TOK() throws RecognitionException {
		Int_TOKContext _localctx = new Int_TOKContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_int_TOK);
		try {
			setState(234);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(INT);

				}
				break;
			case MT_int_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(230);
				match(MT_int_TOK);
				}
				break;
			case ET_int_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(232);
				match(ET_int_TOK);
				setState(233);
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

	public static class Int_TOK_EOFContext extends ParserRuleContext {
		public Int_TOKContext int_TOK() {
			return getRuleContext(Int_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniMLMetaParser.EOF, 0); }
		public Int_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).enterInt_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).exitInt_TOK_EOF(this);
		}
	}

	public final Int_TOK_EOFContext int_TOK_EOF() throws RecognitionException {
		Int_TOK_EOFContext _localctx = new Int_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_int_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			int_TOK();
			setState(237);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class App_exprContext extends ParserRuleContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public App_exprContext app_expr() {
			return getRuleContext(App_exprContext.class,0);
		}
		public TerminalNode MT_app_expr() { return getToken(MiniMLMetaParser.MT_app_expr, 0); }
		public TerminalNode ET_app_expr() { return getToken(MiniMLMetaParser.ET_app_expr, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(MiniMLMetaParser.CRSX_EMBED_END, 0); }
		public App_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_app_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).enterApp_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).exitApp_expr(this);
		}
	}

	public final App_exprContext app_expr() throws RecognitionException {
		App_exprContext _localctx = new App_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_app_expr);
		try {
			setState(253);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(240);
				simple_expr();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(244);
				simple_expr();
				setState(245);
				app_expr();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(249);
				match(MT_app_expr);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(251);
				match(ET_app_expr);
				setState(252);
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

	public static class App_expr_EOFContext extends ParserRuleContext {
		public App_exprContext app_expr() {
			return getRuleContext(App_exprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniMLMetaParser.EOF, 0); }
		public App_expr_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_app_expr_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).enterApp_expr_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).exitApp_expr_EOF(this);
		}
	}

	public final App_expr_EOFContext app_expr_EOF() throws RecognitionException {
		App_expr_EOFContext _localctx = new App_expr_EOFContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_app_expr_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			app_expr();
			setState(256);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_exprContext extends ParserRuleContext {
		public Var_TOKContext var_TOK() {
			return getRuleContext(Var_TOKContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(MiniMLMetaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MiniMLMetaParser.FALSE, 0); }
		public Int_TOKContext int_TOK() {
			return getRuleContext(Int_TOKContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MiniMLMetaParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniMLMetaParser.RPAREN, 0); }
		public TerminalNode MT_simple_expr() { return getToken(MiniMLMetaParser.MT_simple_expr, 0); }
		public TerminalNode ET_simple_expr() { return getToken(MiniMLMetaParser.ET_simple_expr, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(MiniMLMetaParser.CRSX_EMBED_END, 0); }
		public Simple_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).enterSimple_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).exitSimple_expr(this);
		}
	}

	public final Simple_exprContext simple_expr() throws RecognitionException {
		Simple_exprContext _localctx = new Simple_exprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simple_expr);
		try {
			setState(287);
			switch (_input.LA(1)) {
			case MT_var_TOK:
			case ET_var_TOK:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(259);
				var_TOK();
				_exitAlt();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(264);
				match(TRUE);
				_exitAlt();
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				_hide();
				setState(268);
				match(FALSE);
				_exitAlt();
				}
				break;
			case MT_int_TOK:
			case ET_int_TOK:
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(271);
				int_TOK();
				_exitAlt();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				_hide();
				setState(276);
				match(LPAREN);
				setState(277);
				expr();
				_hide();
				setState(279);
				match(RPAREN);
				_exitAlt();
				}
				break;
			case MT_simple_expr:
				enterOuterAlt(_localctx, 6);
				{
				_term();
				setState(283);
				match(MT_simple_expr);
				}
				break;
			case ET_simple_expr:
				enterOuterAlt(_localctx, 7);
				{
				_embed();
				setState(285);
				match(ET_simple_expr);
				setState(286);
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

	public static class Simple_expr_EOFContext extends ParserRuleContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniMLMetaParser.EOF, 0); }
		public Simple_expr_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expr_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).enterSimple_expr_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).exitSimple_expr_EOF(this);
		}
	}

	public final Simple_expr_EOFContext simple_expr_EOF() throws RecognitionException {
		Simple_expr_EOFContext _localctx = new Simple_expr_EOFContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_simple_expr_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			simple_expr();
			setState(290);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TyContext extends ParserRuleContext {
		public TyPrimaryContext tyPrimary() {
			return getRuleContext(TyPrimaryContext.class,0);
		}
		public TerminalNode TARROW() { return getToken(MiniMLMetaParser.TARROW, 0); }
		public TyContext ty() {
			return getRuleContext(TyContext.class,0);
		}
		public TerminalNode MT_ty() { return getToken(MiniMLMetaParser.MT_ty, 0); }
		public TerminalNode ET_ty() { return getToken(MiniMLMetaParser.ET_ty, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(MiniMLMetaParser.CRSX_EMBED_END, 0); }
		public TyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).enterTy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).exitTy(this);
		}
	}

	public final TyContext ty() throws RecognitionException {
		TyContext _localctx = new TyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ty);
		try {
			setState(308);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(293);
				tyPrimary();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(297);
				tyPrimary();
				_hide();
				setState(299);
				match(TARROW);
				setState(300);
				ty();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_term();
				setState(304);
				match(MT_ty);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(306);
				match(ET_ty);
				setState(307);
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

	public static class Ty_EOFContext extends ParserRuleContext {
		public TyContext ty() {
			return getRuleContext(TyContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniMLMetaParser.EOF, 0); }
		public Ty_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ty_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).enterTy_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).exitTy_EOF(this);
		}
	}

	public final Ty_EOFContext ty_EOF() throws RecognitionException {
		Ty_EOFContext _localctx = new Ty_EOFContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ty_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			ty();
			setState(311);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TyPrimaryContext extends ParserRuleContext {
		public TerminalNode TBOOL() { return getToken(MiniMLMetaParser.TBOOL, 0); }
		public TerminalNode TINT() { return getToken(MiniMLMetaParser.TINT, 0); }
		public TerminalNode LPAREN() { return getToken(MiniMLMetaParser.LPAREN, 0); }
		public TyContext ty() {
			return getRuleContext(TyContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniMLMetaParser.RPAREN, 0); }
		public TerminalNode MT_tyPrimary() { return getToken(MiniMLMetaParser.MT_tyPrimary, 0); }
		public TerminalNode ET_tyPrimary() { return getToken(MiniMLMetaParser.ET_tyPrimary, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(MiniMLMetaParser.CRSX_EMBED_END, 0); }
		public TyPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tyPrimary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).enterTyPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).exitTyPrimary(this);
		}
	}

	public final TyPrimaryContext tyPrimary() throws RecognitionException {
		TyPrimaryContext _localctx = new TyPrimaryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tyPrimary);
		try {
			setState(334);
			switch (_input.LA(1)) {
			case TBOOL:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_hide();
				setState(315);
				match(TBOOL);
				_exitAlt();
				}
				break;
			case TINT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(319);
				match(TINT);
				_exitAlt();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				_hide();
				setState(323);
				match(LPAREN);
				setState(324);
				ty();
				_hide();
				setState(326);
				match(RPAREN);
				_exitAlt();
				}
				break;
			case MT_tyPrimary:
				enterOuterAlt(_localctx, 4);
				{
				_term();
				setState(330);
				match(MT_tyPrimary);
				}
				break;
			case ET_tyPrimary:
				enterOuterAlt(_localctx, 5);
				{
				_embed();
				setState(332);
				match(ET_tyPrimary);
				setState(333);
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

	public static class TyPrimary_EOFContext extends ParserRuleContext {
		public TyPrimaryContext tyPrimary() {
			return getRuleContext(TyPrimaryContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniMLMetaParser.EOF, 0); }
		public TyPrimary_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tyPrimary_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).enterTyPrimary_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniMLMetaParserListener ) ((MiniMLMetaParserListener)listener).exitTyPrimary_EOF(this);
		}
	}

	public final TyPrimary_EOFContext tyPrimary_EOF() throws RecognitionException {
		TyPrimary_EOFContext _localctx = new TyPrimary_EOFContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tyPrimary_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			tyPrimary();
			setState(337);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u0156\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2L\n\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4[\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6w\n"+
		"\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u008c\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a8\n\n"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u00e0\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00ed\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0100\n\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0122\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0137\n\24\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0151\n\26\3\27\3\27\3\27\3\27"+
		"\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\2\u0166\2K\3"+
		"\2\2\2\4M\3\2\2\2\6Z\3\2\2\2\b\\\3\2\2\2\nv\3\2\2\2\fx\3\2\2\2\16\u008b"+
		"\3\2\2\2\20\u008d\3\2\2\2\22\u00a7\3\2\2\2\24\u00a9\3\2\2\2\26\u00df\3"+
		"\2\2\2\30\u00e1\3\2\2\2\32\u00ec\3\2\2\2\34\u00ee\3\2\2\2\36\u00ff\3\2"+
		"\2\2 \u0101\3\2\2\2\"\u0121\3\2\2\2$\u0123\3\2\2\2&\u0136\3\2\2\2(\u0138"+
		"\3\2\2\2*\u0150\3\2\2\2,\u0152\3\2\2\2./\b\2\1\2/\60\b\2\1\2\60\61\7$"+
		"\2\2\61\62\b\2\1\2\62\63\5\6\4\2\63\64\b\2\1\2\64\65\b\2\1\2\65\66\7&"+
		"\2\2\66\67\5\n\6\2\678\b\2\1\289\7%\2\29:\b\2\1\2:;\5\2\2\2;<\b\2\1\2"+
		"<=\b\2\1\2=>\7%\2\2>?\b\2\1\2?L\3\2\2\2@A\b\2\1\2AB\5\n\6\2BC\b\2\1\2"+
		"CD\7%\2\2DE\b\2\1\2EL\3\2\2\2FG\b\2\1\2GL\7\3\2\2HI\b\2\1\2IJ\7\4\2\2"+
		"JL\7\60\2\2K.\3\2\2\2K@\3\2\2\2KF\3\2\2\2KH\3\2\2\2L\3\3\2\2\2MN\5\2\2"+
		"\2NO\7\2\2\3O\5\3\2\2\2PQ\b\4\1\2QR\b\4\1\2RS\7\31\2\2ST\b\4\1\2T[\b\4"+
		"\1\2UV\b\4\1\2V[\7\5\2\2WX\b\4\1\2XY\7\6\2\2Y[\7\60\2\2ZP\3\2\2\2ZU\3"+
		"\2\2\2ZW\3\2\2\2[\7\3\2\2\2\\]\5\6\4\2]^\7\2\2\3^\t\3\2\2\2_`\b\6\1\2"+
		"`a\5\16\b\2ab\b\6\1\2bc\7,\2\2cd\5\n\6\2de\b\6\1\2ew\3\2\2\2fg\b\6\1\2"+
		"gh\5\16\b\2hi\b\6\1\2ij\7-\2\2jk\5\n\6\2kl\b\6\1\2lw\3\2\2\2mn\b\6\1\2"+
		"no\5\16\b\2op\b\6\1\2pw\3\2\2\2qr\b\6\1\2rw\7\7\2\2st\b\6\1\2tu\7\b\2"+
		"\2uw\7\60\2\2v_\3\2\2\2vf\3\2\2\2vm\3\2\2\2vq\3\2\2\2vs\3\2\2\2w\13\3"+
		"\2\2\2xy\5\n\6\2yz\7\2\2\3z\r\3\2\2\2{|\b\b\1\2|}\5\22\n\2}~\b\b\1\2~"+
		"\177\7.\2\2\177\u0080\5\16\b\2\u0080\u0081\b\b\1\2\u0081\u008c\3\2\2\2"+
		"\u0082\u0083\b\b\1\2\u0083\u0084\5\22\n\2\u0084\u0085\b\b\1\2\u0085\u008c"+
		"\3\2\2\2\u0086\u0087\b\b\1\2\u0087\u008c\7\t\2\2\u0088\u0089\b\b\1\2\u0089"+
		"\u008a\7\n\2\2\u008a\u008c\7\60\2\2\u008b{\3\2\2\2\u008b\u0082\3\2\2\2"+
		"\u008b\u0086\3\2\2\2\u008b\u0088\3\2\2\2\u008c\17\3\2\2\2\u008d\u008e"+
		"\5\16\b\2\u008e\u008f\7\2\2\3\u008f\21\3\2\2\2\u0090\u0091\b\n\1\2\u0091"+
		"\u0092\5\26\f\2\u0092\u0093\b\n\1\2\u0093\u0094\7\'\2\2\u0094\u0095\5"+
		"\22\n\2\u0095\u0096\b\n\1\2\u0096\u00a8\3\2\2\2\u0097\u0098\b\n\1\2\u0098"+
		"\u0099\5\26\f\2\u0099\u009a\b\n\1\2\u009a\u009b\7&\2\2\u009b\u009c\5\22"+
		"\n\2\u009c\u009d\b\n\1\2\u009d\u00a8\3\2\2\2\u009e\u009f\b\n\1\2\u009f"+
		"\u00a0\5\26\f\2\u00a0\u00a1\b\n\1\2\u00a1\u00a8\3\2\2\2\u00a2\u00a3\b"+
		"\n\1\2\u00a3\u00a8\7\13\2\2\u00a4\u00a5\b\n\1\2\u00a5\u00a6\7\f\2\2\u00a6"+
		"\u00a8\7\60\2\2\u00a7\u0090\3\2\2\2\u00a7\u0097\3\2\2\2\u00a7\u009e\3"+
		"\2\2\2\u00a7\u00a2\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a8\23\3\2\2\2\u00a9"+
		"\u00aa\5\22\n\2\u00aa\u00ab\7\2\2\3\u00ab\25\3\2\2\2\u00ac\u00ad\b\f\1"+
		"\2\u00ad\u00ae\5\36\20\2\u00ae\u00af\b\f\1\2\u00af\u00e0\3\2\2\2\u00b0"+
		"\u00b1\b\f\1\2\u00b1\u00b2\b\f\1\2\u00b2\u00b3\7-\2\2\u00b3\u00b4\5\32"+
		"\16\2\u00b4\u00b5\b\f\1\2\u00b5\u00e0\3\2\2\2\u00b6\u00b7\b\f\1\2\u00b7"+
		"\u00b8\b\f\1\2\u00b8\u00b9\7!\2\2\u00b9\u00ba\5\n\6\2\u00ba\u00bb\b\f"+
		"\1\2\u00bb\u00bc\7\"\2\2\u00bc\u00bd\5\n\6\2\u00bd\u00be\b\f\1\2\u00be"+
		"\u00bf\7#\2\2\u00bf\u00c0\5\n\6\2\u00c0\u00c1\b\f\1\2\u00c1\u00e0\3\2"+
		"\2\2\u00c2\u00c3\b\f\1\2\u00c3\u00c4\b\f\1\2\u00c4\u00c5\7\37\2\2\u00c5"+
		"\u00c6\5\6\4\2\u00c6\u00c7\b\f\1\2\u00c7\u00c8\7*\2\2\u00c8\u00c9\b\f"+
		"\1\2\u00c9\u00ca\5\6\4\2\u00ca\u00cb\b\f\1\2\u00cb\u00cc\b\f\1\2\u00cc"+
		"\u00cd\7)\2\2\u00cd\u00ce\5&\24\2\u00ce\u00cf\b\f\1\2\u00cf\u00d0\7+\2"+
		"\2\u00d0\u00d1\b\f\1\2\u00d1\u00d2\7)\2\2\u00d2\u00d3\5&\24\2\u00d3\u00d4"+
		"\b\f\1\2\u00d4\u00d5\7 \2\2\u00d5\u00d6\b\f\1\2\u00d6\u00d7\5\n\6\2\u00d7"+
		"\u00d8\b\f\1\2\u00d8\u00d9\b\f\1\2\u00d9\u00e0\3\2\2\2\u00da\u00db\b\f"+
		"\1\2\u00db\u00e0\7\r\2\2\u00dc\u00dd\b\f\1\2\u00dd\u00de\7\16\2\2\u00de"+
		"\u00e0\7\60\2\2\u00df\u00ac\3\2\2\2\u00df\u00b0\3\2\2\2\u00df\u00b6\3"+
		"\2\2\2\u00df\u00c2\3\2\2\2\u00df\u00da\3\2\2\2\u00df\u00dc\3\2\2\2\u00e0"+
		"\27\3\2\2\2\u00e1\u00e2\5\26\f\2\u00e2\u00e3\7\2\2\3\u00e3\31\3\2\2\2"+
		"\u00e4\u00e5\b\16\1\2\u00e5\u00e6\7\32\2\2\u00e6\u00ed\b\16\1\2\u00e7"+
		"\u00e8\b\16\1\2\u00e8\u00ed\7\17\2\2\u00e9\u00ea\b\16\1\2\u00ea\u00eb"+
		"\7\20\2\2\u00eb\u00ed\7\60\2\2\u00ec\u00e4\3\2\2\2\u00ec\u00e7\3\2\2\2"+
		"\u00ec\u00e9\3\2\2\2\u00ed\33\3\2\2\2\u00ee\u00ef\5\32\16\2\u00ef\u00f0"+
		"\7\2\2\3\u00f0\35\3\2\2\2\u00f1\u00f2\b\20\1\2\u00f2\u00f3\5\"\22\2\u00f3"+
		"\u00f4\b\20\1\2\u00f4\u0100\3\2\2\2\u00f5\u00f6\b\20\1\2\u00f6\u00f7\5"+
		"\"\22\2\u00f7\u00f8\5\36\20\2\u00f8\u00f9\b\20\1\2\u00f9\u0100\3\2\2\2"+
		"\u00fa\u00fb\b\20\1\2\u00fb\u0100\7\21\2\2\u00fc\u00fd\b\20\1\2\u00fd"+
		"\u00fe\7\22\2\2\u00fe\u0100\7\60\2\2\u00ff\u00f1\3\2\2\2\u00ff\u00f5\3"+
		"\2\2\2\u00ff\u00fa\3\2\2\2\u00ff\u00fc\3\2\2\2\u0100\37\3\2\2\2\u0101"+
		"\u0102\5\36\20\2\u0102\u0103\7\2\2\3\u0103!\3\2\2\2\u0104\u0105\b\22\1"+
		"\2\u0105\u0106\5\6\4\2\u0106\u0107\b\22\1\2\u0107\u0122\3\2\2\2\u0108"+
		"\u0109\b\22\1\2\u0109\u010a\b\22\1\2\u010a\u010b\7\35\2\2\u010b\u0122"+
		"\b\22\1\2\u010c\u010d\b\22\1\2\u010d\u010e\b\22\1\2\u010e\u010f\7\36\2"+
		"\2\u010f\u0122\b\22\1\2\u0110\u0111\b\22\1\2\u0111\u0112\5\32\16\2\u0112"+
		"\u0113\b\22\1\2\u0113\u0122\3\2\2\2\u0114\u0115\b\22\1\2\u0115\u0116\b"+
		"\22\1\2\u0116\u0117\7*\2\2\u0117\u0118\5\n\6\2\u0118\u0119\b\22\1\2\u0119"+
		"\u011a\7+\2\2\u011a\u011b\b\22\1\2\u011b\u0122\3\2\2\2\u011c\u011d\b\22"+
		"\1\2\u011d\u0122\7\23\2\2\u011e\u011f\b\22\1\2\u011f\u0120\7\24\2\2\u0120"+
		"\u0122\7\60\2\2\u0121\u0104\3\2\2\2\u0121\u0108\3\2\2\2\u0121\u010c\3"+
		"\2\2\2\u0121\u0110\3\2\2\2\u0121\u0114\3\2\2\2\u0121\u011c\3\2\2\2\u0121"+
		"\u011e\3\2\2\2\u0122#\3\2\2\2\u0123\u0124\5\"\22\2\u0124\u0125\7\2\2\3"+
		"\u0125%\3\2\2\2\u0126\u0127\b\24\1\2\u0127\u0128\5*\26\2\u0128\u0129\b"+
		"\24\1\2\u0129\u0137\3\2\2\2\u012a\u012b\b\24\1\2\u012b\u012c\5*\26\2\u012c"+
		"\u012d\b\24\1\2\u012d\u012e\7(\2\2\u012e\u012f\5&\24\2\u012f\u0130\b\24"+
		"\1\2\u0130\u0137\3\2\2\2\u0131\u0132\b\24\1\2\u0132\u0137\7\25\2\2\u0133"+
		"\u0134\b\24\1\2\u0134\u0135\7\26\2\2\u0135\u0137\7\60\2\2\u0136\u0126"+
		"\3\2\2\2\u0136\u012a\3\2\2\2\u0136\u0131\3\2\2\2\u0136\u0133\3\2\2\2\u0137"+
		"\'\3\2\2\2\u0138\u0139\5&\24\2\u0139\u013a\7\2\2\3\u013a)\3\2\2\2\u013b"+
		"\u013c\b\26\1\2\u013c\u013d\b\26\1\2\u013d\u013e\7\34\2\2\u013e\u0151"+
		"\b\26\1\2\u013f\u0140\b\26\1\2\u0140\u0141\b\26\1\2\u0141\u0142\7\33\2"+
		"\2\u0142\u0151\b\26\1\2\u0143\u0144\b\26\1\2\u0144\u0145\b\26\1\2\u0145"+
		"\u0146\7*\2\2\u0146\u0147\5&\24\2\u0147\u0148\b\26\1\2\u0148\u0149\7+"+
		"\2\2\u0149\u014a\b\26\1\2\u014a\u0151\3\2\2\2\u014b\u014c\b\26\1\2\u014c"+
		"\u0151\7\27\2\2\u014d\u014e\b\26\1\2\u014e\u014f\7\30\2\2\u014f\u0151"+
		"\7\60\2\2\u0150\u013b\3\2\2\2\u0150\u013f\3\2\2\2\u0150\u0143\3\2\2\2"+
		"\u0150\u014b\3\2\2\2\u0150\u014d\3\2\2\2\u0151+\3\2\2\2\u0152\u0153\5"+
		"*\26\2\u0153\u0154\7\2\2\3\u0154-\3\2\2\2\rKZv\u008b\u00a7\u00df\u00ec"+
		"\u00ff\u0121\u0136\u0150";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}