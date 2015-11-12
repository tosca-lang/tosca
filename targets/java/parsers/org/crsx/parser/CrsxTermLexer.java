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
import java.util.*;
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
		MODULE=1, IMPORT=2, GRAMMAR=3, FN=4, TYPE=5, DISPATCH=6, COMMA=7, LPAR=8, 
		RPAR=9, LCURLY=10, RCURLY=11, LT=12, GT=13, LBRACE=14, RBRACE=15, LINEAR=16, 
		COLON=17, OR=18, AND=19, ARROW=20, VAR=21, LSQUARE=22, RSQUARE=23, FNTYPE=24, 
		RULE=25, NOT=26, FIXITY=27, CONCRETE=28, CONSTRUCTOR=29, VARIABLE=30, 
		METAVAR=31, STRING=32, NUMBER=33, WS=34, BLOCK_COMMENT=35, LINE_COMMENT=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"MODULE", "IMPORT", "GRAMMAR", "FN", "TYPE", "DISPATCH", "COMMA", "LPAR", 
		"RPAR", "LCURLY", "RCURLY", "LT", "GT", "LBRACE", "RBRACE", "LINEAR", 
		"COLON", "OR", "AND", "ARROW", "VAR", "LSQUARE", "RSQUARE", "FNTYPE", 
		"RULE", "NOT", "FIXITY", "CONCRETE", "CONSTRUCTOR", "VARIABLE", "METAVAR", 
		"STRING", "NUMBER", "StartConstructorChar", "ConstructorChar", "Digit", 
		"Upper", "Lower", "Alpha", "Decimal", "Other", "Unicode", "UnicodeS", 
		"Ebnf", "WS", "BLOCK_COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'module'", "'import'", "'grammar'", "'fn'", "'type'", "'dispatch'", 
		"','", "'('", "')'", null, null, "'<'", "'>'", null, null, "'¹'", "':'", 
		"'|'", "'&'", "'→'", "'var'", "'['", "']'", "'->'", "'rule'", "'¬'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MODULE", "IMPORT", "GRAMMAR", "FN", "TYPE", "DISPATCH", "COMMA", 
		"LPAR", "RPAR", "LCURLY", "RCURLY", "LT", "GT", "LBRACE", "RBRACE", "LINEAR", 
		"COLON", "OR", "AND", "ARROW", "VAR", "LSQUARE", "RSQUARE", "FNTYPE", 
		"RULE", "NOT", "FIXITY", "CONCRETE", "CONSTRUCTOR", "VARIABLE", "METAVAR", 
		"STRING", "NUMBER", "WS", "BLOCK_COMMENT", "LINE_COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u0176\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5"+
		"\34\u00d5\n\34\3\35\3\35\3\35\7\35\u00da\n\35\f\35\16\35\u00dd\13\35\3"+
		"\35\3\35\3\36\3\36\7\36\u00e3\n\36\f\36\16\36\u00e6\13\36\3\36\3\36\3"+
		"\36\7\36\u00eb\n\36\f\36\16\36\u00ee\13\36\5\36\u00f0\n\36\3\37\3\37\3"+
		"\37\3\37\7\37\u00f6\n\37\f\37\16\37\u00f9\13\37\3 \3 \3 \3 \3 \7 \u0100"+
		"\n \f \16 \u0103\13 \3 \5 \u0106\n \3 \7 \u0109\n \f \16 \u010c\13 \3"+
		"!\3!\3!\3!\7!\u0112\n!\f!\16!\u0115\13!\3!\3!\3\"\3\"\3#\3#\3#\5#\u011e"+
		"\n#\3$\3$\3$\3$\5$\u0124\n$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\5)\u012f\n)\3"+
		")\6)\u0132\n)\r)\16)\u0133\3)\3)\6)\u0138\n)\r)\16)\u0139\5)\u013c\n)"+
		"\3)\3)\6)\u0140\n)\r)\16)\u0141\5)\u0144\n)\3*\5*\u0147\n*\3+\3+\3+\5"+
		"+\u014c\n+\3,\3,\3,\5,\u0151\n,\3-\3-\3.\6.\u0156\n.\r.\16.\u0157\3.\3"+
		".\3/\3/\3/\3/\7/\u0160\n/\f/\16/\u0163\13/\3/\3/\3/\5/\u0168\n/\3/\3/"+
		"\3\60\3\60\3\60\3\60\7\60\u0170\n\60\f\60\16\60\u0173\13\60\3\60\3\60"+
		"\4\u00db\u0161\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[$]%_&\3"+
		"\2\21\7\2QQggjjttvv\4\2//aa\3\2$$\3\2\62;\3\2C\\\3\2c|\4\2C\\c|\f\2##"+
		"&&((,-/\61<<?B`b~~\u0080\u0080\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01"+
		"\3\2\udc02\ue001\5\2\2\u0101\u27e8\u27eb\ud802\udc01\4\2,-AA\5\2\13\f"+
		"\16\17\"\"\4\2\f\f\17\17\u018f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5h\3\2\2\2\7o\3"+
		"\2\2\2\tw\3\2\2\2\13z\3\2\2\2\r\177\3\2\2\2\17\u0088\3\2\2\2\21\u008a"+
		"\3\2\2\2\23\u008c\3\2\2\2\25\u008e\3\2\2\2\27\u0090\3\2\2\2\31\u0092\3"+
		"\2\2\2\33\u0094\3\2\2\2\35\u0096\3\2\2\2\37\u0098\3\2\2\2!\u009a\3\2\2"+
		"\2#\u009c\3\2\2\2%\u009e\3\2\2\2\'\u00a0\3\2\2\2)\u00a2\3\2\2\2+\u00a4"+
		"\3\2\2\2-\u00a8\3\2\2\2/\u00aa\3\2\2\2\61\u00ac\3\2\2\2\63\u00af\3\2\2"+
		"\2\65\u00b4\3\2\2\2\67\u00d4\3\2\2\29\u00d6\3\2\2\2;\u00ef\3\2\2\2=\u00f1"+
		"\3\2\2\2?\u00fa\3\2\2\2A\u010d\3\2\2\2C\u0118\3\2\2\2E\u011d\3\2\2\2G"+
		"\u0123\3\2\2\2I\u0125\3\2\2\2K\u0127\3\2\2\2M\u0129\3\2\2\2O\u012b\3\2"+
		"\2\2Q\u0143\3\2\2\2S\u0146\3\2\2\2U\u014b\3\2\2\2W\u0150\3\2\2\2Y\u0152"+
		"\3\2\2\2[\u0155\3\2\2\2]\u015b\3\2\2\2_\u016b\3\2\2\2ab\7o\2\2bc\7q\2"+
		"\2cd\7f\2\2de\7w\2\2ef\7n\2\2fg\7g\2\2g\4\3\2\2\2hi\7k\2\2ij\7o\2\2jk"+
		"\7r\2\2kl\7q\2\2lm\7t\2\2mn\7v\2\2n\6\3\2\2\2op\7i\2\2pq\7t\2\2qr\7c\2"+
		"\2rs\7o\2\2st\7o\2\2tu\7c\2\2uv\7t\2\2v\b\3\2\2\2wx\7h\2\2xy\7p\2\2y\n"+
		"\3\2\2\2z{\7v\2\2{|\7{\2\2|}\7r\2\2}~\7g\2\2~\f\3\2\2\2\177\u0080\7f\2"+
		"\2\u0080\u0081\7k\2\2\u0081\u0082\7u\2\2\u0082\u0083\7r\2\2\u0083\u0084"+
		"\7c\2\2\u0084\u0085\7v\2\2\u0085\u0086\7e\2\2\u0086\u0087\7j\2\2\u0087"+
		"\16\3\2\2\2\u0088\u0089\7.\2\2\u0089\20\3\2\2\2\u008a\u008b\7*\2\2\u008b"+
		"\22\3\2\2\2\u008c\u008d\7+\2\2\u008d\24\3\2\2\2\u008e\u008f\7}\2\2\u008f"+
		"\26\3\2\2\2\u0090\u0091\7\177\2\2\u0091\30\3\2\2\2\u0092\u0093\7>\2\2"+
		"\u0093\32\3\2\2\2\u0094\u0095\7@\2\2\u0095\34\3\2\2\2\u0096\u0097\7}\2"+
		"\2\u0097\36\3\2\2\2\u0098\u0099\7\177\2\2\u0099 \3\2\2\2\u009a\u009b\7"+
		"\u00bb\2\2\u009b\"\3\2\2\2\u009c\u009d\7<\2\2\u009d$\3\2\2\2\u009e\u009f"+
		"\7~\2\2\u009f&\3\2\2\2\u00a0\u00a1\7(\2\2\u00a1(\3\2\2\2\u00a2\u00a3\7"+
		"\u2194\2\2\u00a3*\3\2\2\2\u00a4\u00a5\7x\2\2\u00a5\u00a6\7c\2\2\u00a6"+
		"\u00a7\7t\2\2\u00a7,\3\2\2\2\u00a8\u00a9\7]\2\2\u00a9.\3\2\2\2\u00aa\u00ab"+
		"\7_\2\2\u00ab\60\3\2\2\2\u00ac\u00ad\7/\2\2\u00ad\u00ae\7@\2\2\u00ae\62"+
		"\3\2\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\7n\2\2\u00b2"+
		"\u00b3\7g\2\2\u00b3\64\3\2\2\2\u00b4\u00b5\7\u00ae\2\2\u00b5\66\3\2\2"+
		"\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7h\2\2\u00b9\u00ba"+
		"\7k\2\2\u00ba\u00d5\7z\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7p\2\2\u00bd"+
		"\u00be\7h\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7z\2\2\u00c0\u00d5\7t\2\2"+
		"\u00c1\u00c2\7k\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5"+
		"\7k\2\2\u00c5\u00c6\7z\2\2\u00c6\u00d5\7n\2\2\u00c7\u00c8\7r\2\2\u00c8"+
		"\u00c9\7q\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7h\2\2"+
		"\u00cc\u00cd\7k\2\2\u00cd\u00d5\7z\2\2\u00ce\u00cf\7r\2\2\u00cf\u00d0"+
		"\7t\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7k\2\2\u00d3"+
		"\u00d5\7z\2\2\u00d4\u00b6\3\2\2\2\u00d4\u00bb\3\2\2\2\u00d4\u00c1\3\2"+
		"\2\2\u00d4\u00c7\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d58\3\2\2\2\u00d6\u00db"+
		"\7\u27e8\2\2\u00d7\u00da\59\35\2\u00d8\u00da\13\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00dc\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7\u27e9"+
		"\2\2\u00df:\3\2\2\2\u00e0\u00e4\5E#\2\u00e1\u00e3\5G$\2\u00e2\u00e1\3"+
		"\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00f0\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7>\2\2\u00e8\u00ec\t\2"+
		"\2\2\u00e9\u00eb\5G$\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00e0\3\2\2\2\u00ef\u00e7\3\2\2\2\u00f0<\3\2\2\2\u00f1\u00f7\5M\'\2\u00f2"+
		"\u00f6\5M\'\2\u00f3\u00f6\5I%\2\u00f4\u00f6\t\3\2\2\u00f5\u00f2\3\2\2"+
		"\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8>\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u0101\7%\2\2\u00fb\u0100\5O(\2\u00fc\u0100\5I%\2\u00fd\u0100\t\3\2\2"+
		"\u00fe\u0100\5U+\2\u00ff\u00fb\3\2\2\2\u00ff\u00fc\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0106\5Y"+
		"-\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u010a\3\2\2\2\u0107"+
		"\u0109\5I%\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2"+
		"\2\u010a\u010b\3\2\2\2\u010b@\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u0113"+
		"\7$\2\2\u010e\u010f\7^\2\2\u010f\u0112\7$\2\2\u0110\u0112\n\4\2\2\u0111"+
		"\u010e\3\2\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116"+
		"\u0117\7$\2\2\u0117B\3\2\2\2\u0118\u0119\5Q)\2\u0119D\3\2\2\2\u011a\u011e"+
		"\5K&\2\u011b\u011e\5S*\2\u011c\u011e\5W,\2\u011d\u011a\3\2\2\2\u011d\u011b"+
		"\3\2\2\2\u011d\u011c\3\2\2\2\u011eF\3\2\2\2\u011f\u0124\5O(\2\u0120\u0124"+
		"\5I%\2\u0121\u0124\5S*\2\u0122\u0124\5U+\2\u0123\u011f\3\2\2\2\u0123\u0120"+
		"\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124H\3\2\2\2\u0125"+
		"\u0126\t\5\2\2\u0126J\3\2\2\2\u0127\u0128\t\6\2\2\u0128L\3\2\2\2\u0129"+
		"\u012a\t\7\2\2\u012aN\3\2\2\2\u012b\u012c\t\b\2\2\u012cP\3\2\2\2\u012d"+
		"\u012f\7/\2\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2"+
		"\2\2\u0130\u0132\t\5\2\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u013b\3\2\2\2\u0135\u0137\7\60"+
		"\2\2\u0136\u0138\t\5\2\2\u0137\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0135\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\u0144\3\2\2\2\u013d\u013f\7\60\2\2\u013e"+
		"\u0140\t\5\2\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u012e\3\2\2\2\u0143"+
		"\u013d\3\2\2\2\u0144R\3\2\2\2\u0145\u0147\t\t\2\2\u0146\u0145\3\2\2\2"+
		"\u0147T\3\2\2\2\u0148\u014c\n\n\2\2\u0149\u014a\t\13\2\2\u014a\u014c\t"+
		"\f\2\2\u014b\u0148\3\2\2\2\u014b\u0149\3\2\2\2\u014cV\3\2\2\2\u014d\u0151"+
		"\n\r\2\2\u014e\u014f\t\13\2\2\u014f\u0151\t\f\2\2\u0150\u014d\3\2\2\2"+
		"\u0150\u014e\3\2\2\2\u0151X\3\2\2\2\u0152\u0153\t\16\2\2\u0153Z\3\2\2"+
		"\2\u0154\u0156\t\17\2\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\b."+
		"\2\2\u015a\\\3\2\2\2\u015b\u015c\7\61\2\2\u015c\u015d\7,\2\2\u015d\u0161"+
		"\3\2\2\2\u015e\u0160\13\2\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2"+
		"\u0161\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0167\3\2\2\2\u0163\u0161"+
		"\3\2\2\2\u0164\u0165\7,\2\2\u0165\u0168\7\61\2\2\u0166\u0168\7\2\2\3\u0167"+
		"\u0164\3\2\2\2\u0167\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\b/"+
		"\2\2\u016a^\3\2\2\2\u016b\u016c\7\61\2\2\u016c\u016d\7\61\2\2\u016d\u0171"+
		"\3\2\2\2\u016e\u0170\n\20\2\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2\2\2"+
		"\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171"+
		"\3\2\2\2\u0174\u0175\b\60\2\2\u0175`\3\2\2\2 \2\u00d4\u00d9\u00db\u00e4"+
		"\u00ec\u00ef\u00f5\u00f7\u00ff\u0101\u0105\u010a\u0111\u0113\u011d\u0123"+
		"\u012e\u0133\u0139\u013b\u0141\u0143\u0146\u014b\u0150\u0157\u0161\u0167"+
		"\u0171\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}