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

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CrsxTermLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MODULE=1, IMPORT=2, DISPATCH=3, DELAY=4, COLON=5, ARROW=6, FORALL=7, LPAR=8, 
		RPAR=9, LBRACE=10, RBRACE=11, LSQUARE=12, RSQUARE=13, SEMI=14, COMMA=15, 
		DATASORT=16, COLONCOLON=17, DOT=18, NOT=19, LINEAR=20, FUNCTIONAL=21, 
		AND=22, AT=23, CATEGORY=24, CONCRETE=25, CONCRETE2=26, CONCRETE3=27, CONCRETE4=28, 
		CONSTRUCTOR=29, VARIABLE=30, METAVAR=31, STRING=32, NUMBER=33, WS=34, 
		BLOCK_COMMENT=35, LINE_COMMENT=36, XML_COMMENT=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"MODULE", "IMPORT", "DISPATCH", "DELAY", "COLON", "ARROW", "FORALL", "LPAR", 
		"RPAR", "LBRACE", "RBRACE", "LSQUARE", "RSQUARE", "SEMI", "COMMA", "DATASORT", 
		"COLONCOLON", "DOT", "NOT", "LINEAR", "FUNCTIONAL", "AND", "AT", "CATEGORY", 
		"CONCRETE", "CONCRETE2", "CONCRETE3", "CONCRETE4", "CONSTRUCTOR", "VARIABLE", 
		"METAVAR", "STRING", "NUMBER", "StartConstructorChar", "ConstructorChar", 
		"Digit", "Upper", "Lower", "Alpha", "Decimal", "Other", "Unicode", "WS", 
		"BLOCK_COMMENT", "LINE_COMMENT", "XML_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'module'", "'import'", "'dispatch'", "'delay'", "':'", "'→'", "'∀'", 
		"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'::='", "'::'", 
		"'.'", "'¬'", "'¹'", "'ᵇ'", "'&'", "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MODULE", "IMPORT", "DISPATCH", "DELAY", "COLON", "ARROW", "FORALL", 
		"LPAR", "RPAR", "LBRACE", "RBRACE", "LSQUARE", "RSQUARE", "SEMI", "COMMA", 
		"DATASORT", "COLONCOLON", "DOT", "NOT", "LINEAR", "FUNCTIONAL", "AND", 
		"AT", "CATEGORY", "CONCRETE", "CONCRETE2", "CONCRETE3", "CONCRETE4", "CONSTRUCTOR", 
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


	public CrsxTermLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CrsxTerm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u0163\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\6\31\u00aa\n\31\r\31\16\31\u00ab\3\31\5\31\u00af\n\31\3\32\3\32\3\32"+
		"\7\32\u00b4\n\32\f\32\16\32\u00b7\13\32\3\32\3\32\3\33\3\33\3\33\7\33"+
		"\u00be\n\33\f\33\16\33\u00c1\13\33\3\33\3\33\3\34\3\34\3\34\7\34\u00c8"+
		"\n\34\f\34\16\34\u00cb\13\34\3\34\3\34\3\35\3\35\3\35\7\35\u00d2\n\35"+
		"\f\35\16\35\u00d5\13\35\3\35\3\35\3\36\3\36\7\36\u00db\n\36\f\36\16\36"+
		"\u00de\13\36\3\37\3\37\3\37\3\37\7\37\u00e4\n\37\f\37\16\37\u00e7\13\37"+
		"\3 \3 \3 \3 \3 \7 \u00ee\n \f \16 \u00f1\13 \3!\3!\3!\3!\7!\u00f7\n!\f"+
		"!\16!\u00fa\13!\3!\3!\3\"\3\"\3#\3#\3#\5#\u0103\n#\3$\3$\3$\3$\5$\u0109"+
		"\n$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\6)\u0114\n)\r)\16)\u0115\3)\3)\6)\u011a"+
		"\n)\r)\16)\u011b\5)\u011e\n)\3)\3)\6)\u0122\n)\r)\16)\u0123\5)\u0126\n"+
		")\3*\3*\3+\3+\3+\5+\u012d\n+\3,\6,\u0130\n,\r,\16,\u0131\3,\3,\3-\3-\3"+
		"-\3-\7-\u013a\n-\f-\16-\u013d\13-\3-\3-\3-\5-\u0142\n-\3-\3-\3.\3.\3."+
		"\3.\7.\u014a\n.\f.\16.\u014d\13.\3.\3.\3/\3/\3/\3/\3/\3/\7/\u0157\n/\f"+
		"/\16/\u015a\13/\3/\3/\3/\3/\5/\u0160\n/\3/\3/\b\u00b5\u00bf\u00c9\u00d3"+
		"\u013b\u0158\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E\2G\2I\2K\2M\2O\2Q\2S\2U\2W$Y%[&]\'\3\2\20"+
		"\4\2,-AA\4\2//aa\3\2$$\7\2\u00c2\u00e0\u0102\u0102\u0104\u0104\u0106\u0106"+
		"\u0108\u0108\3\2\62;\3\2C\\\3\2c|\4\2C\\c|\7\2&&,-//AAaa\4\2\2\u0101\ud802"+
		"\udc01\3\2\ud802\udc01\3\2\udc02\ue001\5\2\13\f\16\17\"\"\4\2\f\f\17\17"+
		"\u0180\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5f\3\2\2\2\7m\3\2\2\2\tv\3"+
		"\2\2\2\13|\3\2\2\2\r~\3\2\2\2\17\u0080\3\2\2\2\21\u0082\3\2\2\2\23\u0084"+
		"\3\2\2\2\25\u0086\3\2\2\2\27\u0088\3\2\2\2\31\u008a\3\2\2\2\33\u008c\3"+
		"\2\2\2\35\u008e\3\2\2\2\37\u0090\3\2\2\2!\u0092\3\2\2\2#\u0096\3\2\2\2"+
		"%\u0099\3\2\2\2\'\u009b\3\2\2\2)\u009d\3\2\2\2+\u009f\3\2\2\2-\u00a1\3"+
		"\2\2\2/\u00a3\3\2\2\2\61\u00a5\3\2\2\2\63\u00b0\3\2\2\2\65\u00ba\3\2\2"+
		"\2\67\u00c4\3\2\2\29\u00ce\3\2\2\2;\u00d8\3\2\2\2=\u00df\3\2\2\2?\u00e8"+
		"\3\2\2\2A\u00f2\3\2\2\2C\u00fd\3\2\2\2E\u0102\3\2\2\2G\u0108\3\2\2\2I"+
		"\u010a\3\2\2\2K\u010c\3\2\2\2M\u010e\3\2\2\2O\u0110\3\2\2\2Q\u0125\3\2"+
		"\2\2S\u0127\3\2\2\2U\u012c\3\2\2\2W\u012f\3\2\2\2Y\u0135\3\2\2\2[\u0145"+
		"\3\2\2\2]\u0150\3\2\2\2_`\7o\2\2`a\7q\2\2ab\7f\2\2bc\7w\2\2cd\7n\2\2d"+
		"e\7g\2\2e\4\3\2\2\2fg\7k\2\2gh\7o\2\2hi\7r\2\2ij\7q\2\2jk\7t\2\2kl\7v"+
		"\2\2l\6\3\2\2\2mn\7f\2\2no\7k\2\2op\7u\2\2pq\7r\2\2qr\7c\2\2rs\7v\2\2"+
		"st\7e\2\2tu\7j\2\2u\b\3\2\2\2vw\7f\2\2wx\7g\2\2xy\7n\2\2yz\7c\2\2z{\7"+
		"{\2\2{\n\3\2\2\2|}\7<\2\2}\f\3\2\2\2~\177\7\u2194\2\2\177\16\3\2\2\2\u0080"+
		"\u0081\7\u2202\2\2\u0081\20\3\2\2\2\u0082\u0083\7*\2\2\u0083\22\3\2\2"+
		"\2\u0084\u0085\7+\2\2\u0085\24\3\2\2\2\u0086\u0087\7}\2\2\u0087\26\3\2"+
		"\2\2\u0088\u0089\7\177\2\2\u0089\30\3\2\2\2\u008a\u008b\7]\2\2\u008b\32"+
		"\3\2\2\2\u008c\u008d\7_\2\2\u008d\34\3\2\2\2\u008e\u008f\7=\2\2\u008f"+
		"\36\3\2\2\2\u0090\u0091\7.\2\2\u0091 \3\2\2\2\u0092\u0093\7<\2\2\u0093"+
		"\u0094\7<\2\2\u0094\u0095\7?\2\2\u0095\"\3\2\2\2\u0096\u0097\7<\2\2\u0097"+
		"\u0098\7<\2\2\u0098$\3\2\2\2\u0099\u009a\7\60\2\2\u009a&\3\2\2\2\u009b"+
		"\u009c\7\u00ae\2\2\u009c(\3\2\2\2\u009d\u009e\7\u00bb\2\2\u009e*\3\2\2"+
		"\2\u009f\u00a0\7\u1d49\2\2\u00a0,\3\2\2\2\u00a1\u00a2\7(\2\2\u00a2.\3"+
		"\2\2\2\u00a3\u00a4\7B\2\2\u00a4\60\3\2\2\2\u00a5\u00a9\7\'\2\2\u00a6\u00aa"+
		"\5O(\2\u00a7\u00aa\5I%\2\u00a8\u00aa\7a\2\2\u00a9\u00a6\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00af\t\2\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\62\3\2\2\2\u00b0\u00b5\7\u27e8"+
		"\2\2\u00b1\u00b4\5\63\32\2\u00b2\u00b4\13\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7\u27e9\2\2\u00b9"+
		"\64\3\2\2\2\u00ba\u00bf\7\u27ec\2\2\u00bb\u00be\5\65\33\2\u00bc\u00be"+
		"\13\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2"+
		"\u00bf\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c2\u00c3\7\u27ed\2\2\u00c3\66\3\2\2\2\u00c4\u00c9\7\u27ec"+
		"\2\2\u00c5\u00c8\5\67\34\2\u00c6\u00c8\13\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00ca\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\u27ed\2\2\u00cd"+
		"8\3\2\2\2\u00ce\u00d3\7\u2985\2\2\u00cf\u00d2\59\35\2\u00d0\u00d2\13\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d6\u00d7\7\u2986\2\2\u00d7:\3\2\2\2\u00d8\u00dc\5E#\2\u00d9\u00db"+
		"\5G$\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd<\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e5\5M\'\2\u00e0"+
		"\u00e4\5M\'\2\u00e1\u00e4\5I%\2\u00e2\u00e4\t\3\2\2\u00e3\u00e0\3\2\2"+
		"\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6>\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00ef\7%\2\2\u00e9\u00ee\5O(\2\u00ea\u00ee\5I%\2\u00eb\u00ee\5S*\2\u00ec"+
		"\u00ee\5U+\2\u00ed\u00e9\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ed\u00eb\3\2\2"+
		"\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0@\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f8\7$\2\2\u00f3\u00f4"+
		"\7^\2\2\u00f4\u00f7\7$\2\2\u00f5\u00f7\n\4\2\2\u00f6\u00f3\3\2\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7$\2\2\u00fc"+
		"B\3\2\2\2\u00fd\u00fe\5Q)\2\u00feD\3\2\2\2\u00ff\u0103\5K&\2\u0100\u0103"+
		"\5S*\2\u0101\u0103\t\5\2\2\u0102\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0101\3\2\2\2\u0103F\3\2\2\2\u0104\u0109\5O(\2\u0105\u0109\5I%\2\u0106"+
		"\u0109\5S*\2\u0107\u0109\5U+\2\u0108\u0104\3\2\2\2\u0108\u0105\3\2\2\2"+
		"\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109H\3\2\2\2\u010a\u010b\t"+
		"\6\2\2\u010bJ\3\2\2\2\u010c\u010d\t\7\2\2\u010dL\3\2\2\2\u010e\u010f\t"+
		"\b\2\2\u010fN\3\2\2\2\u0110\u0111\t\t\2\2\u0111P\3\2\2\2\u0112\u0114\t"+
		"\6\2\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u011d\3\2\2\2\u0117\u0119\7\60\2\2\u0118\u011a\t"+
		"\6\2\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u0117\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e\u0126\3\2\2\2\u011f\u0121\7\60\2\2\u0120\u0122\t\6\2\2\u0121"+
		"\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0126\3\2\2\2\u0125\u0113\3\2\2\2\u0125\u011f\3\2\2\2\u0126"+
		"R\3\2\2\2\u0127\u0128\t\n\2\2\u0128T\3\2\2\2\u0129\u012d\n\13\2\2\u012a"+
		"\u012b\t\f\2\2\u012b\u012d\t\r\2\2\u012c\u0129\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012dV\3\2\2\2\u012e\u0130\t\16\2\2\u012f\u012e\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\b,\2\2\u0134X\3\2\2\2\u0135\u0136\7\61\2\2\u0136\u0137\7,\2\2\u0137"+
		"\u013b\3\2\2\2\u0138\u013a\13\2\2\2\u0139\u0138\3\2\2\2\u013a\u013d\3"+
		"\2\2\2\u013b\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u0141\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013e\u013f\7,\2\2\u013f\u0142\7\61\2\2\u0140\u0142\7\2"+
		"\2\3\u0141\u013e\3\2\2\2\u0141\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0144\b-\2\2\u0144Z\3\2\2\2\u0145\u0146\7\61\2\2\u0146\u0147\7\61\2\2"+
		"\u0147\u014b\3\2\2\2\u0148\u014a\n\17\2\2\u0149\u0148\3\2\2\2\u014a\u014d"+
		"\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u014f\b.\2\2\u014f\\\3\2\2\2\u0150\u0151\7>\2\2\u0151"+
		"\u0152\7#\2\2\u0152\u0153\7/\2\2\u0153\u0154\7/\2\2\u0154\u0158\3\2\2"+
		"\2\u0155\u0157\13\2\2\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015f\3\2\2\2\u015a\u0158\3\2"+
		"\2\2\u015b\u015c\7/\2\2\u015c\u015d\7/\2\2\u015d\u0160\7@\2\2\u015e\u0160"+
		"\7\2\2\3\u015f\u015b\3\2\2\2\u015f\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0162\b/\2\2\u0162^\3\2\2\2#\2\u00a9\u00ab\u00ae\u00b3\u00b5\u00bd\u00bf"+
		"\u00c7\u00c9\u00d1\u00d3\u00dc\u00e3\u00e5\u00ed\u00ef\u00f6\u00f8\u0102"+
		"\u0108\u0115\u011b\u011d\u0123\u0125\u012c\u0131\u013b\u0141\u014b\u0158"+
		"\u015f\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}