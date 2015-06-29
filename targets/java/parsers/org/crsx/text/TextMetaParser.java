// Generated from /Users/villardl/Projects/crsx/crsx4/src/text/TextMetaParser.g4 by ANTLR 4.5
package org.crsx.text;

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
public class TextMetaParser extends org.crsx.pg.Crsx3Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MT_n=1, ET_n=2, MT_part=3, ET_part=4, MT_chars_TOK=5, ET_chars_TOK=6, 
		MT_break_TOK=7, ET_break_TOK=8, MT_openindent_TOK=9, ET_openindent_TOK=10, 
		MT_closeindent_TOK=11, ET_closeindent_TOK=12, MT_caststring_TOK=13, ET_caststring_TOK=14, 
		OPENINDENT=15, CLOSEINDENT=16, CASTSTRING=17, CHARS=18, BREAK=19, CRSX_EMBED_END=20;
	public static final int
		RULE_n = 0, RULE_n_EOF = 1, RULE_part = 2, RULE_part_EOF = 3, RULE_chars_TOK = 4, 
		RULE_chars_TOK_EOF = 5, RULE_break_TOK = 6, RULE_break_TOK_EOF = 7, RULE_openindent_TOK = 8, 
		RULE_openindent_TOK_EOF = 9, RULE_closeindent_TOK = 10, RULE_closeindent_TOK_EOF = 11, 
		RULE_caststring_TOK = 12, RULE_caststring_TOK_EOF = 13;
	public static final String[] ruleNames = {
		"n", "n_EOF", "part", "part_EOF", "chars_TOK", "chars_TOK_EOF", "break_TOK", 
		"break_TOK_EOF", "openindent_TOK", "openindent_TOK_EOF", "closeindent_TOK", 
		"closeindent_TOK_EOF", "caststring_TOK", "caststring_TOK_EOF"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'\\u27e6'", "'\\u27e7'", "'\\u2020'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MT_n", "ET_n", "MT_part", "ET_part", "MT_chars_TOK", "ET_chars_TOK", 
		"MT_break_TOK", "ET_break_TOK", "MT_openindent_TOK", "ET_openindent_TOK", 
		"MT_closeindent_TOK", "ET_closeindent_TOK", "MT_caststring_TOK", "ET_caststring_TOK", 
		"OPENINDENT", "CLOSEINDENT", "CASTSTRING", "CHARS", "BREAK", "CRSX_EMBED_END"
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
	public String getGrammarFileName() { return "TextMetaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	public TextMetaParser() {}
	protected Lexer newLexer(CharStream stream)
	{

	return new TextMetaLexer(stream);
	}

	protected void initATN()
	{    _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}protected String _prefix() { return "Text_"; }
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
	protected String _metachar() { return "#";}

	public TextMetaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NContext extends ParserRuleContext {
		public PartContext part() {
			return getRuleContext(PartContext.class,0);
		}
		public NContext n() {
			return getRuleContext(NContext.class,0);
		}
		public TerminalNode MT_n() { return getToken(TextMetaParser.MT_n, 0); }
		public TerminalNode ET_n() { return getToken(TextMetaParser.ET_n, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(TextMetaParser.CRSX_EMBED_END, 0); }
		public NContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).enterN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).exitN(this);
		}
	}

	public final NContext n() throws RecognitionException {
		NContext _localctx = new NContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_n);
		try {
			setState(40);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(29);
				part();
				setState(30);
				n();
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
				setState(36);
				match(MT_n);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_embed();
				setState(38);
				match(ET_n);
				setState(39);
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

	public static class N_EOFContext extends ParserRuleContext {
		public NContext n() {
			return getRuleContext(NContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TextMetaParser.EOF, 0); }
		public N_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).enterN_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).exitN_EOF(this);
		}
	}

	public final N_EOFContext n_EOF() throws RecognitionException {
		N_EOFContext _localctx = new N_EOFContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_n_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			n();
			setState(43);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartContext extends ParserRuleContext {
		public Chars_TOKContext chars_TOK() {
			return getRuleContext(Chars_TOKContext.class,0);
		}
		public Break_TOKContext break_TOK() {
			return getRuleContext(Break_TOKContext.class,0);
		}
		public Openindent_TOKContext openindent_TOK() {
			return getRuleContext(Openindent_TOKContext.class,0);
		}
		public NContext n() {
			return getRuleContext(NContext.class,0);
		}
		public Closeindent_TOKContext closeindent_TOK() {
			return getRuleContext(Closeindent_TOKContext.class,0);
		}
		public Caststring_TOKContext caststring_TOK() {
			return getRuleContext(Caststring_TOKContext.class,0);
		}
		public TerminalNode MT_part() { return getToken(TextMetaParser.MT_part, 0); }
		public TerminalNode ET_part() { return getToken(TextMetaParser.ET_part, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(TextMetaParser.CRSX_EMBED_END, 0); }
		public PartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).enterPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).exitPart(this);
		}
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_part);
		try {
			setState(69);
			switch (_input.LA(1)) {
			case MT_chars_TOK:
			case ET_chars_TOK:
			case CHARS:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(46);
				chars_TOK();
				_exitAlt();
				}
				break;
			case MT_break_TOK:
			case ET_break_TOK:
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(50);
				break_TOK();
				_exitAlt();
				}
				break;
			case MT_openindent_TOK:
			case ET_openindent_TOK:
			case OPENINDENT:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(54);
				openindent_TOK();
				setState(55);
				n();
				setState(56);
				closeindent_TOK();
				_exitAlt();
				}
				break;
			case MT_caststring_TOK:
			case ET_caststring_TOK:
			case CASTSTRING:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(60);
				caststring_TOK();
				setState(61);
				n();
				_exitAlt();
				}
				break;
			case MT_part:
				enterOuterAlt(_localctx, 5);
				{
				_term();
				setState(65);
				match(MT_part);
				}
				break;
			case ET_part:
				enterOuterAlt(_localctx, 6);
				{
				_embed();
				setState(67);
				match(ET_part);
				setState(68);
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

	public static class Part_EOFContext extends ParserRuleContext {
		public PartContext part() {
			return getRuleContext(PartContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TextMetaParser.EOF, 0); }
		public Part_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).enterPart_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).exitPart_EOF(this);
		}
	}

	public final Part_EOFContext part_EOF() throws RecognitionException {
		Part_EOFContext _localctx = new Part_EOFContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_part_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			part();
			setState(72);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Chars_TOKContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(TextMetaParser.CHARS, 0); }
		public TerminalNode MT_chars_TOK() { return getToken(TextMetaParser.MT_chars_TOK, 0); }
		public TerminalNode ET_chars_TOK() { return getToken(TextMetaParser.ET_chars_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(TextMetaParser.CRSX_EMBED_END, 0); }
		public Chars_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chars_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).enterChars_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).exitChars_TOK(this);
		}
	}

	public final Chars_TOKContext chars_TOK() throws RecognitionException {
		Chars_TOKContext _localctx = new Chars_TOKContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_chars_TOK);
		try {
			setState(82);
			switch (_input.LA(1)) {
			case CHARS:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(CHARS);

				}
				break;
			case MT_chars_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(78);
				match(MT_chars_TOK);
				}
				break;
			case ET_chars_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(80);
				match(ET_chars_TOK);
				setState(81);
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

	public static class Chars_TOK_EOFContext extends ParserRuleContext {
		public Chars_TOKContext chars_TOK() {
			return getRuleContext(Chars_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TextMetaParser.EOF, 0); }
		public Chars_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chars_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).enterChars_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).exitChars_TOK_EOF(this);
		}
	}

	public final Chars_TOK_EOFContext chars_TOK_EOF() throws RecognitionException {
		Chars_TOK_EOFContext _localctx = new Chars_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_chars_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			chars_TOK();
			setState(85);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Break_TOKContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(TextMetaParser.BREAK, 0); }
		public TerminalNode MT_break_TOK() { return getToken(TextMetaParser.MT_break_TOK, 0); }
		public TerminalNode ET_break_TOK() { return getToken(TextMetaParser.ET_break_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(TextMetaParser.CRSX_EMBED_END, 0); }
		public Break_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).enterBreak_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).exitBreak_TOK(this);
		}
	}

	public final Break_TOKContext break_TOK() throws RecognitionException {
		Break_TOKContext _localctx = new Break_TOKContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_break_TOK);
		try {
			setState(95);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(BREAK);

				}
				break;
			case MT_break_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(91);
				match(MT_break_TOK);
				}
				break;
			case ET_break_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(93);
				match(ET_break_TOK);
				setState(94);
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

	public static class Break_TOK_EOFContext extends ParserRuleContext {
		public Break_TOKContext break_TOK() {
			return getRuleContext(Break_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TextMetaParser.EOF, 0); }
		public Break_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).enterBreak_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).exitBreak_TOK_EOF(this);
		}
	}

	public final Break_TOK_EOFContext break_TOK_EOF() throws RecognitionException {
		Break_TOK_EOFContext _localctx = new Break_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_break_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			break_TOK();
			setState(98);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Openindent_TOKContext extends ParserRuleContext {
		public TerminalNode OPENINDENT() { return getToken(TextMetaParser.OPENINDENT, 0); }
		public TerminalNode MT_openindent_TOK() { return getToken(TextMetaParser.MT_openindent_TOK, 0); }
		public TerminalNode ET_openindent_TOK() { return getToken(TextMetaParser.ET_openindent_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(TextMetaParser.CRSX_EMBED_END, 0); }
		public Openindent_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openindent_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).enterOpenindent_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).exitOpenindent_TOK(this);
		}
	}

	public final Openindent_TOKContext openindent_TOK() throws RecognitionException {
		Openindent_TOKContext _localctx = new Openindent_TOKContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_openindent_TOK);
		try {
			setState(108);
			switch (_input.LA(1)) {
			case OPENINDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(OPENINDENT);

				}
				break;
			case MT_openindent_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(104);
				match(MT_openindent_TOK);
				}
				break;
			case ET_openindent_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(106);
				match(ET_openindent_TOK);
				setState(107);
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

	public static class Openindent_TOK_EOFContext extends ParserRuleContext {
		public Openindent_TOKContext openindent_TOK() {
			return getRuleContext(Openindent_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TextMetaParser.EOF, 0); }
		public Openindent_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openindent_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).enterOpenindent_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).exitOpenindent_TOK_EOF(this);
		}
	}

	public final Openindent_TOK_EOFContext openindent_TOK_EOF() throws RecognitionException {
		Openindent_TOK_EOFContext _localctx = new Openindent_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_openindent_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			openindent_TOK();
			setState(111);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Closeindent_TOKContext extends ParserRuleContext {
		public TerminalNode CLOSEINDENT() { return getToken(TextMetaParser.CLOSEINDENT, 0); }
		public TerminalNode MT_closeindent_TOK() { return getToken(TextMetaParser.MT_closeindent_TOK, 0); }
		public TerminalNode ET_closeindent_TOK() { return getToken(TextMetaParser.ET_closeindent_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(TextMetaParser.CRSX_EMBED_END, 0); }
		public Closeindent_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeindent_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).enterCloseindent_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).exitCloseindent_TOK(this);
		}
	}

	public final Closeindent_TOKContext closeindent_TOK() throws RecognitionException {
		Closeindent_TOKContext _localctx = new Closeindent_TOKContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_closeindent_TOK);
		try {
			setState(121);
			switch (_input.LA(1)) {
			case CLOSEINDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(CLOSEINDENT);

				}
				break;
			case MT_closeindent_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(117);
				match(MT_closeindent_TOK);
				}
				break;
			case ET_closeindent_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(119);
				match(ET_closeindent_TOK);
				setState(120);
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

	public static class Closeindent_TOK_EOFContext extends ParserRuleContext {
		public Closeindent_TOKContext closeindent_TOK() {
			return getRuleContext(Closeindent_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TextMetaParser.EOF, 0); }
		public Closeindent_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeindent_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).enterCloseindent_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).exitCloseindent_TOK_EOF(this);
		}
	}

	public final Closeindent_TOK_EOFContext closeindent_TOK_EOF() throws RecognitionException {
		Closeindent_TOK_EOFContext _localctx = new Closeindent_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_closeindent_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			closeindent_TOK();
			setState(124);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Caststring_TOKContext extends ParserRuleContext {
		public TerminalNode CASTSTRING() { return getToken(TextMetaParser.CASTSTRING, 0); }
		public TerminalNode MT_caststring_TOK() { return getToken(TextMetaParser.MT_caststring_TOK, 0); }
		public TerminalNode ET_caststring_TOK() { return getToken(TextMetaParser.ET_caststring_TOK, 0); }
		public TerminalNode CRSX_EMBED_END() { return getToken(TextMetaParser.CRSX_EMBED_END, 0); }
		public Caststring_TOKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caststring_TOK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).enterCaststring_TOK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).exitCaststring_TOK(this);
		}
	}

	public final Caststring_TOKContext caststring_TOK() throws RecognitionException {
		Caststring_TOKContext _localctx = new Caststring_TOKContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_caststring_TOK);
		try {
			setState(134);
			switch (_input.LA(1)) {
			case CASTSTRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(CASTSTRING);

				}
				break;
			case MT_caststring_TOK:
				enterOuterAlt(_localctx, 2);
				{
				_term();
				setState(130);
				match(MT_caststring_TOK);
				}
				break;
			case ET_caststring_TOK:
				enterOuterAlt(_localctx, 3);
				{
				_embed();
				setState(132);
				match(ET_caststring_TOK);
				setState(133);
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

	public static class Caststring_TOK_EOFContext extends ParserRuleContext {
		public Caststring_TOKContext caststring_TOK() {
			return getRuleContext(Caststring_TOKContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TextMetaParser.EOF, 0); }
		public Caststring_TOK_EOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caststring_TOK_EOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).enterCaststring_TOK_EOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextMetaParserListener ) ((TextMetaParserListener)listener).exitCaststring_TOK_EOF(this);
		}
	}

	public final Caststring_TOK_EOFContext caststring_TOK_EOF() throws RecognitionException {
		Caststring_TOK_EOFContext _localctx = new Caststring_TOK_EOFContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_caststring_TOK_EOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			caststring_TOK();
			setState(137);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26\u008e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\2+\n\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4H\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6U\n\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bb\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\no\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f|\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u0089\n\16\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\2\2\u0091\2*\3\2\2\2\4,\3\2\2\2\6G\3\2\2\2\bI\3\2\2\2\nT\3\2\2\2\f"+
		"V\3\2\2\2\16a\3\2\2\2\20c\3\2\2\2\22n\3\2\2\2\24p\3\2\2\2\26{\3\2\2\2"+
		"\30}\3\2\2\2\32\u0088\3\2\2\2\34\u008a\3\2\2\2\36\37\b\2\1\2\37 \5\6\4"+
		"\2 !\5\2\2\2!\"\b\2\1\2\"+\3\2\2\2#$\b\2\1\2$+\b\2\1\2%&\b\2\1\2&+\7\3"+
		"\2\2\'(\b\2\1\2()\7\4\2\2)+\7\26\2\2*\36\3\2\2\2*#\3\2\2\2*%\3\2\2\2*"+
		"\'\3\2\2\2+\3\3\2\2\2,-\5\2\2\2-.\7\2\2\3.\5\3\2\2\2/\60\b\4\1\2\60\61"+
		"\5\n\6\2\61\62\b\4\1\2\62H\3\2\2\2\63\64\b\4\1\2\64\65\5\16\b\2\65\66"+
		"\b\4\1\2\66H\3\2\2\2\678\b\4\1\289\5\22\n\29:\5\2\2\2:;\5\26\f\2;<\b\4"+
		"\1\2<H\3\2\2\2=>\b\4\1\2>?\5\32\16\2?@\5\2\2\2@A\b\4\1\2AH\3\2\2\2BC\b"+
		"\4\1\2CH\7\5\2\2DE\b\4\1\2EF\7\6\2\2FH\7\26\2\2G/\3\2\2\2G\63\3\2\2\2"+
		"G\67\3\2\2\2G=\3\2\2\2GB\3\2\2\2GD\3\2\2\2H\7\3\2\2\2IJ\5\6\4\2JK\7\2"+
		"\2\3K\t\3\2\2\2LM\b\6\1\2MN\7\24\2\2NU\b\6\1\2OP\b\6\1\2PU\7\7\2\2QR\b"+
		"\6\1\2RS\7\b\2\2SU\7\26\2\2TL\3\2\2\2TO\3\2\2\2TQ\3\2\2\2U\13\3\2\2\2"+
		"VW\5\n\6\2WX\7\2\2\3X\r\3\2\2\2YZ\b\b\1\2Z[\7\25\2\2[b\b\b\1\2\\]\b\b"+
		"\1\2]b\7\t\2\2^_\b\b\1\2_`\7\n\2\2`b\7\26\2\2aY\3\2\2\2a\\\3\2\2\2a^\3"+
		"\2\2\2b\17\3\2\2\2cd\5\16\b\2de\7\2\2\3e\21\3\2\2\2fg\b\n\1\2gh\7\21\2"+
		"\2ho\b\n\1\2ij\b\n\1\2jo\7\13\2\2kl\b\n\1\2lm\7\f\2\2mo\7\26\2\2nf\3\2"+
		"\2\2ni\3\2\2\2nk\3\2\2\2o\23\3\2\2\2pq\5\22\n\2qr\7\2\2\3r\25\3\2\2\2"+
		"st\b\f\1\2tu\7\22\2\2u|\b\f\1\2vw\b\f\1\2w|\7\r\2\2xy\b\f\1\2yz\7\16\2"+
		"\2z|\7\26\2\2{s\3\2\2\2{v\3\2\2\2{x\3\2\2\2|\27\3\2\2\2}~\5\26\f\2~\177"+
		"\7\2\2\3\177\31\3\2\2\2\u0080\u0081\b\16\1\2\u0081\u0082\7\23\2\2\u0082"+
		"\u0089\b\16\1\2\u0083\u0084\b\16\1\2\u0084\u0089\7\17\2\2\u0085\u0086"+
		"\b\16\1\2\u0086\u0087\7\20\2\2\u0087\u0089\7\26\2\2\u0088\u0080\3\2\2"+
		"\2\u0088\u0083\3\2\2\2\u0088\u0085\3\2\2\2\u0089\33\3\2\2\2\u008a\u008b"+
		"\5\32\16\2\u008b\u008c\7\2\2\3\u008c\35\3\2\2\2\t*GTan{\u0088";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}