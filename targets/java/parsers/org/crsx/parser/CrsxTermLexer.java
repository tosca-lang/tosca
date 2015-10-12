// Generated from /Users/villardl/Projects/crsx/crsx4_2/targets/java/build/pg4/CrsxTerm.g4 by ANTLR 4.5
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
		MODULE=1, IMPORT=2, DISPATCH=3, DELAY=4, GRAMMAR=5, COLON=6, ARROW=7, 
		FORALL=8, LPAR=9, RPAR=10, LBRACE=11, RBRACE=12, LSQUARE=13, RSQUARE=14, 
		SEMI=15, COMMA=16, DATASORT=17, COLONCOLON=18, DOT=19, NOT=20, LINEAR=21, 
		FUNCTIONAL=22, AND=23, AT=24, CATEGORY=25, CONCRETE=26, CONCRETE2=27, 
		CONCRETE3=28, CONCRETE4=29, CONSTRUCTOR=30, VARIABLE=31, METAVAR=32, STRING=33, 
		NUMBER=34, WS=35, BLOCK_COMMENT=36, LINE_COMMENT=37, XML_COMMENT=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"MODULE", "IMPORT", "DISPATCH", "DELAY", "GRAMMAR", "COLON", "ARROW", 
		"FORALL", "LPAR", "RPAR", "LBRACE", "RBRACE", "LSQUARE", "RSQUARE", "SEMI", 
		"COMMA", "DATASORT", "COLONCOLON", "DOT", "NOT", "LINEAR", "FUNCTIONAL", 
		"AND", "AT", "CATEGORY", "CONCRETE", "CONCRETE2", "CONCRETE3", "CONCRETE4", 
		"CONSTRUCTOR", "VARIABLE", "METAVAR", "STRING", "NUMBER", "StartConstructorChar", 
		"ConstructorChar", "Digit", "Upper", "Lower", "Alpha", "Decimal", "Other", 
		"Unicode", "WS", "BLOCK_COMMENT", "LINE_COMMENT", "XML_COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u016d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\6\32\u00b4\n\32\r\32\16\32"+
		"\u00b5\3\32\5\32\u00b9\n\32\3\33\3\33\3\33\7\33\u00be\n\33\f\33\16\33"+
		"\u00c1\13\33\3\33\3\33\3\34\3\34\3\34\7\34\u00c8\n\34\f\34\16\34\u00cb"+
		"\13\34\3\34\3\34\3\35\3\35\3\35\7\35\u00d2\n\35\f\35\16\35\u00d5\13\35"+
		"\3\35\3\35\3\36\3\36\3\36\7\36\u00dc\n\36\f\36\16\36\u00df\13\36\3\36"+
		"\3\36\3\37\3\37\7\37\u00e5\n\37\f\37\16\37\u00e8\13\37\3 \3 \3 \3 \7 "+
		"\u00ee\n \f \16 \u00f1\13 \3!\3!\3!\3!\3!\7!\u00f8\n!\f!\16!\u00fb\13"+
		"!\3\"\3\"\3\"\3\"\7\"\u0101\n\"\f\"\16\"\u0104\13\"\3\"\3\"\3#\3#\3$\3"+
		"$\3$\5$\u010d\n$\3%\3%\3%\3%\5%\u0113\n%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*"+
		"\6*\u011e\n*\r*\16*\u011f\3*\3*\6*\u0124\n*\r*\16*\u0125\5*\u0128\n*\3"+
		"*\3*\6*\u012c\n*\r*\16*\u012d\5*\u0130\n*\3+\3+\3,\3,\3,\5,\u0137\n,\3"+
		"-\6-\u013a\n-\r-\16-\u013b\3-\3-\3.\3.\3.\3.\7.\u0144\n.\f.\16.\u0147"+
		"\13.\3.\3.\3.\5.\u014c\n.\3.\3.\3/\3/\3/\3/\7/\u0154\n/\f/\16/\u0157\13"+
		"/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u0161\n\60\f\60\16\60\u0164"+
		"\13\60\3\60\3\60\3\60\3\60\5\60\u016a\n\60\3\60\3\60\b\u00bf\u00c9\u00d3"+
		"\u00dd\u0145\u0162\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y%[&]\'_"+
		"(\3\2\20\4\2,-AA\4\2//aa\3\2$$\7\2\u00c2\u00e0\u0102\u0102\u0104\u0104"+
		"\u0106\u0106\u0108\u0108\3\2\62;\3\2C\\\3\2c|\4\2C\\c|\7\2&&,-//AAaa\4"+
		"\2\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\5\2\13\f\16\17"+
		"\"\"\4\2\f\f\17\17\u018a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5"+
		"h\3\2\2\2\7o\3\2\2\2\tx\3\2\2\2\13~\3\2\2\2\r\u0086\3\2\2\2\17\u0088\3"+
		"\2\2\2\21\u008a\3\2\2\2\23\u008c\3\2\2\2\25\u008e\3\2\2\2\27\u0090\3\2"+
		"\2\2\31\u0092\3\2\2\2\33\u0094\3\2\2\2\35\u0096\3\2\2\2\37\u0098\3\2\2"+
		"\2!\u009a\3\2\2\2#\u009c\3\2\2\2%\u00a0\3\2\2\2\'\u00a3\3\2\2\2)\u00a5"+
		"\3\2\2\2+\u00a7\3\2\2\2-\u00a9\3\2\2\2/\u00ab\3\2\2\2\61\u00ad\3\2\2\2"+
		"\63\u00af\3\2\2\2\65\u00ba\3\2\2\2\67\u00c4\3\2\2\29\u00ce\3\2\2\2;\u00d8"+
		"\3\2\2\2=\u00e2\3\2\2\2?\u00e9\3\2\2\2A\u00f2\3\2\2\2C\u00fc\3\2\2\2E"+
		"\u0107\3\2\2\2G\u010c\3\2\2\2I\u0112\3\2\2\2K\u0114\3\2\2\2M\u0116\3\2"+
		"\2\2O\u0118\3\2\2\2Q\u011a\3\2\2\2S\u012f\3\2\2\2U\u0131\3\2\2\2W\u0136"+
		"\3\2\2\2Y\u0139\3\2\2\2[\u013f\3\2\2\2]\u014f\3\2\2\2_\u015a\3\2\2\2a"+
		"b\7o\2\2bc\7q\2\2cd\7f\2\2de\7w\2\2ef\7n\2\2fg\7g\2\2g\4\3\2\2\2hi\7k"+
		"\2\2ij\7o\2\2jk\7r\2\2kl\7q\2\2lm\7t\2\2mn\7v\2\2n\6\3\2\2\2op\7f\2\2"+
		"pq\7k\2\2qr\7u\2\2rs\7r\2\2st\7c\2\2tu\7v\2\2uv\7e\2\2vw\7j\2\2w\b\3\2"+
		"\2\2xy\7f\2\2yz\7g\2\2z{\7n\2\2{|\7c\2\2|}\7{\2\2}\n\3\2\2\2~\177\7i\2"+
		"\2\177\u0080\7t\2\2\u0080\u0081\7c\2\2\u0081\u0082\7o\2\2\u0082\u0083"+
		"\7o\2\2\u0083\u0084\7c\2\2\u0084\u0085\7t\2\2\u0085\f\3\2\2\2\u0086\u0087"+
		"\7<\2\2\u0087\16\3\2\2\2\u0088\u0089\7\u2194\2\2\u0089\20\3\2\2\2\u008a"+
		"\u008b\7\u2202\2\2\u008b\22\3\2\2\2\u008c\u008d\7*\2\2\u008d\24\3\2\2"+
		"\2\u008e\u008f\7+\2\2\u008f\26\3\2\2\2\u0090\u0091\7}\2\2\u0091\30\3\2"+
		"\2\2\u0092\u0093\7\177\2\2\u0093\32\3\2\2\2\u0094\u0095\7]\2\2\u0095\34"+
		"\3\2\2\2\u0096\u0097\7_\2\2\u0097\36\3\2\2\2\u0098\u0099\7=\2\2\u0099"+
		" \3\2\2\2\u009a\u009b\7.\2\2\u009b\"\3\2\2\2\u009c\u009d\7<\2\2\u009d"+
		"\u009e\7<\2\2\u009e\u009f\7?\2\2\u009f$\3\2\2\2\u00a0\u00a1\7<\2\2\u00a1"+
		"\u00a2\7<\2\2\u00a2&\3\2\2\2\u00a3\u00a4\7\60\2\2\u00a4(\3\2\2\2\u00a5"+
		"\u00a6\7\u00ae\2\2\u00a6*\3\2\2\2\u00a7\u00a8\7\u00bb\2\2\u00a8,\3\2\2"+
		"\2\u00a9\u00aa\7\u1d49\2\2\u00aa.\3\2\2\2\u00ab\u00ac\7(\2\2\u00ac\60"+
		"\3\2\2\2\u00ad\u00ae\7B\2\2\u00ae\62\3\2\2\2\u00af\u00b3\7\'\2\2\u00b0"+
		"\u00b4\5Q)\2\u00b1\u00b4\5K&\2\u00b2\u00b4\7a\2\2\u00b3\u00b0\3\2\2\2"+
		"\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b9\t\2\2\2\u00b8"+
		"\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\64\3\2\2\2\u00ba\u00bf\7\u27e8"+
		"\2\2\u00bb\u00be\5\65\33\2\u00bc\u00be\13\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00c0\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\u27e9\2\2\u00c3"+
		"\66\3\2\2\2\u00c4\u00c9\7\u27ec\2\2\u00c5\u00c8\5\67\34\2\u00c6\u00c8"+
		"\13\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2"+
		"\u00c9\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cc\u00cd\7\u27ed\2\2\u00cd8\3\2\2\2\u00ce\u00d3\7\u27ec\2"+
		"\2\u00cf\u00d2\59\35\2\u00d0\u00d2\13\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7\u27ed\2\2\u00d7"+
		":\3\2\2\2\u00d8\u00dd\7\u2985\2\2\u00d9\u00dc\5;\36\2\u00da\u00dc\13\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2"+
		"\2\2\u00e0\u00e1\7\u2986\2\2\u00e1<\3\2\2\2\u00e2\u00e6\5G$\2\u00e3\u00e5"+
		"\5I%\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7>\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ef\5O(\2\u00ea"+
		"\u00ee\5O(\2\u00eb\u00ee\5K&\2\u00ec\u00ee\t\3\2\2\u00ed\u00ea\3\2\2\2"+
		"\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0@\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f9\7%\2\2\u00f3\u00f8\5Q)\2\u00f4\u00f8\5K&\2\u00f5\u00f8\5U+\2\u00f6"+
		"\u00f8\5W,\2\u00f7\u00f3\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5\3\2\2"+
		"\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00faB\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u0102\7$\2\2\u00fd\u00fe"+
		"\7^\2\2\u00fe\u0101\7$\2\2\u00ff\u0101\n\4\2\2\u0100\u00fd\3\2\2\2\u0100"+
		"\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\7$\2\2\u0106"+
		"D\3\2\2\2\u0107\u0108\5S*\2\u0108F\3\2\2\2\u0109\u010d\5M\'\2\u010a\u010d"+
		"\5U+\2\u010b\u010d\t\5\2\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010b\3\2\2\2\u010dH\3\2\2\2\u010e\u0113\5Q)\2\u010f\u0113\5K&\2\u0110"+
		"\u0113\5U+\2\u0111\u0113\5W,\2\u0112\u010e\3\2\2\2\u0112\u010f\3\2\2\2"+
		"\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113J\3\2\2\2\u0114\u0115\t"+
		"\6\2\2\u0115L\3\2\2\2\u0116\u0117\t\7\2\2\u0117N\3\2\2\2\u0118\u0119\t"+
		"\b\2\2\u0119P\3\2\2\2\u011a\u011b\t\t\2\2\u011bR\3\2\2\2\u011c\u011e\t"+
		"\6\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0127\3\2\2\2\u0121\u0123\7\60\2\2\u0122\u0124\t"+
		"\6\2\2\u0123\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0121\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\u0130\3\2\2\2\u0129\u012b\7\60\2\2\u012a\u012c\t\6\2\2\u012b"+
		"\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u0130\3\2\2\2\u012f\u011d\3\2\2\2\u012f\u0129\3\2\2\2\u0130"+
		"T\3\2\2\2\u0131\u0132\t\n\2\2\u0132V\3\2\2\2\u0133\u0137\n\13\2\2\u0134"+
		"\u0135\t\f\2\2\u0135\u0137\t\r\2\2\u0136\u0133\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0137X\3\2\2\2\u0138\u013a\t\16\2\2\u0139\u0138\3\2\2\2\u013a\u013b"+
		"\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013e\b-\2\2\u013eZ\3\2\2\2\u013f\u0140\7\61\2\2\u0140\u0141\7,\2\2\u0141"+
		"\u0145\3\2\2\2\u0142\u0144\13\2\2\2\u0143\u0142\3\2\2\2\u0144\u0147\3"+
		"\2\2\2\u0145\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u014b\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0148\u0149\7,\2\2\u0149\u014c\7\61\2\2\u014a\u014c\7\2"+
		"\2\3\u014b\u0148\3\2\2\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014e\b.\2\2\u014e\\\3\2\2\2\u014f\u0150\7\61\2\2\u0150\u0151\7\61\2"+
		"\2\u0151\u0155\3\2\2\2\u0152\u0154\n\17\2\2\u0153\u0152\3\2\2\2\u0154"+
		"\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2"+
		"\2\2\u0157\u0155\3\2\2\2\u0158\u0159\b/\2\2\u0159^\3\2\2\2\u015a\u015b"+
		"\7>\2\2\u015b\u015c\7#\2\2\u015c\u015d\7/\2\2\u015d\u015e\7/\2\2\u015e"+
		"\u0162\3\2\2\2\u015f\u0161\13\2\2\2\u0160\u015f\3\2\2\2\u0161\u0164\3"+
		"\2\2\2\u0162\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0169\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0165\u0166\7/\2\2\u0166\u0167\7/\2\2\u0167\u016a\7@\2"+
		"\2\u0168\u016a\7\2\2\3\u0169\u0165\3\2\2\2\u0169\u0168\3\2\2\2\u016a\u016b"+
		"\3\2\2\2\u016b\u016c\b\60\2\2\u016c`\3\2\2\2#\2\u00b3\u00b5\u00b8\u00bd"+
		"\u00bf\u00c7\u00c9\u00d1\u00d3\u00db\u00dd\u00e6\u00ed\u00ef\u00f7\u00f9"+
		"\u0100\u0102\u010c\u0112\u011f\u0125\u0127\u012d\u012f\u0136\u013b\u0145"+
		"\u014b\u0155\u0162\u0169\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}