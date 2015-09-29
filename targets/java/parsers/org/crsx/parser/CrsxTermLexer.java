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
		SEMI=15, COMMA=16, DATASORT=17, COLONCOLON=18, DOT=19, DOTDOT=20, NOT=21, 
		LINEAR=22, FUNCTIONAL=23, AND=24, AT=25, CATEGORY=26, CONCRETE=27, CONCRETE2=28, 
		CONCRETE3=29, CONCRETE4=30, CONSTRUCTOR=31, VARIABLE=32, METAVAR=33, STRING=34, 
		NUMBER=35, WS=36, BLOCK_COMMENT=37, LINE_COMMENT=38, XML_COMMENT=39;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"MODULE", "IMPORT", "DISPATCH", "DELAY", "GRAMMAR", "COLON", "ARROW", 
		"FORALL", "LPAR", "RPAR", "LBRACE", "RBRACE", "LSQUARE", "RSQUARE", "SEMI", 
		"COMMA", "DATASORT", "COLONCOLON", "DOT", "DOTDOT", "NOT", "LINEAR", "FUNCTIONAL", 
		"AND", "AT", "CATEGORY", "CONCRETE", "CONCRETE2", "CONCRETE3", "CONCRETE4", 
		"CONSTRUCTOR", "VARIABLE", "METAVAR", "STRING", "NUMBER", "StartConstructorChar", 
		"ConstructorChar", "Digit", "Upper", "Lower", "Alpha", "Decimal", "Other", 
		"Unicode", "Ebnf", "WS", "BLOCK_COMMENT", "LINE_COMMENT", "XML_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'module'", "'import'", "'dispatch'", "'delay'", "'grammar'", "':'", 
		"'→'", "'∀'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", 
		"'::='", "'::'", "'.'", "'..'", "'¬'", "'¹'", "'ᵇ'", "'&'", "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MODULE", "IMPORT", "DISPATCH", "DELAY", "GRAMMAR", "COLON", "ARROW", 
		"FORALL", "LPAR", "RPAR", "LBRACE", "RBRACE", "LSQUARE", "RSQUARE", "SEMI", 
		"COMMA", "DATASORT", "COLONCOLON", "DOT", "DOTDOT", "NOT", "LINEAR", "FUNCTIONAL", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2)\u0185\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\6\33\u00bb\n\33\r\33\16\33\u00bc\3\33\5\33\u00c0\n\33\3\34\3"+
		"\34\3\34\7\34\u00c5\n\34\f\34\16\34\u00c8\13\34\3\34\3\34\3\35\3\35\3"+
		"\35\7\35\u00cf\n\35\f\35\16\35\u00d2\13\35\3\35\3\35\3\36\3\36\3\36\7"+
		"\36\u00d9\n\36\f\36\16\36\u00dc\13\36\3\36\3\36\3\37\3\37\3\37\7\37\u00e3"+
		"\n\37\f\37\16\37\u00e6\13\37\3\37\3\37\3 \3 \7 \u00ec\n \f \16 \u00ef"+
		"\13 \3 \5 \u00f2\n \3!\3!\3!\3!\7!\u00f8\n!\f!\16!\u00fb\13!\3\"\3\"\3"+
		"\"\3\"\3\"\7\"\u0102\n\"\f\"\16\"\u0105\13\"\3\"\5\"\u0108\n\"\3\"\7\""+
		"\u010b\n\"\f\"\16\"\u010e\13\"\3#\3#\3#\3#\7#\u0114\n#\f#\16#\u0117\13"+
		"#\3#\3#\3$\3$\3%\3%\3%\5%\u0120\n%\3&\3&\3&\3&\5&\u0126\n&\3\'\3\'\3("+
		"\3(\3)\3)\3*\3*\3+\5+\u0131\n+\3+\6+\u0134\n+\r+\16+\u0135\3+\3+\6+\u013a"+
		"\n+\r+\16+\u013b\5+\u013e\n+\3+\3+\6+\u0142\n+\r+\16+\u0143\5+\u0146\n"+
		"+\3,\3,\3-\3-\3-\5-\u014d\n-\3.\3.\3/\6/\u0152\n/\r/\16/\u0153\3/\3/\3"+
		"\60\3\60\3\60\3\60\7\60\u015c\n\60\f\60\16\60\u015f\13\60\3\60\3\60\3"+
		"\60\5\60\u0164\n\60\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u016c\n\61\f\61"+
		"\16\61\u016f\13\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0179"+
		"\n\62\f\62\16\62\u017c\13\62\3\62\3\62\3\62\3\62\5\62\u0182\n\62\3\62"+
		"\3\62\b\u00c6\u00d0\u00da\u00e4\u015d\u017a\2\63\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I\2K\2M\2"+
		"O\2Q\2S\2U\2W\2Y\2[\2]&_\'a(c)\3\2\20\4\2//aa\3\2$$\7\2\u00c2\u00e0\u0102"+
		"\u0102\u0104\u0104\u0106\u0106\u0108\u0108\3\2\62;\3\2C\\\3\2c|\4\2C\\"+
		"c|\5\2&&//aa\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\4"+
		"\2,-AA\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u01a5\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2"+
		"\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5l\3\2\2\2\7s\3\2\2\2\t|\3\2\2\2\13"+
		"\u0082\3\2\2\2\r\u008a\3\2\2\2\17\u008c\3\2\2\2\21\u008e\3\2\2\2\23\u0090"+
		"\3\2\2\2\25\u0092\3\2\2\2\27\u0094\3\2\2\2\31\u0096\3\2\2\2\33\u0098\3"+
		"\2\2\2\35\u009a\3\2\2\2\37\u009c\3\2\2\2!\u009e\3\2\2\2#\u00a0\3\2\2\2"+
		"%\u00a4\3\2\2\2\'\u00a7\3\2\2\2)\u00a9\3\2\2\2+\u00ac\3\2\2\2-\u00ae\3"+
		"\2\2\2/\u00b0\3\2\2\2\61\u00b2\3\2\2\2\63\u00b4\3\2\2\2\65\u00b6\3\2\2"+
		"\2\67\u00c1\3\2\2\29\u00cb\3\2\2\2;\u00d5\3\2\2\2=\u00df\3\2\2\2?\u00e9"+
		"\3\2\2\2A\u00f3\3\2\2\2C\u00fc\3\2\2\2E\u010f\3\2\2\2G\u011a\3\2\2\2I"+
		"\u011f\3\2\2\2K\u0125\3\2\2\2M\u0127\3\2\2\2O\u0129\3\2\2\2Q\u012b\3\2"+
		"\2\2S\u012d\3\2\2\2U\u0145\3\2\2\2W\u0147\3\2\2\2Y\u014c\3\2\2\2[\u014e"+
		"\3\2\2\2]\u0151\3\2\2\2_\u0157\3\2\2\2a\u0167\3\2\2\2c\u0172\3\2\2\2e"+
		"f\7o\2\2fg\7q\2\2gh\7f\2\2hi\7w\2\2ij\7n\2\2jk\7g\2\2k\4\3\2\2\2lm\7k"+
		"\2\2mn\7o\2\2no\7r\2\2op\7q\2\2pq\7t\2\2qr\7v\2\2r\6\3\2\2\2st\7f\2\2"+
		"tu\7k\2\2uv\7u\2\2vw\7r\2\2wx\7c\2\2xy\7v\2\2yz\7e\2\2z{\7j\2\2{\b\3\2"+
		"\2\2|}\7f\2\2}~\7g\2\2~\177\7n\2\2\177\u0080\7c\2\2\u0080\u0081\7{\2\2"+
		"\u0081\n\3\2\2\2\u0082\u0083\7i\2\2\u0083\u0084\7t\2\2\u0084\u0085\7c"+
		"\2\2\u0085\u0086\7o\2\2\u0086\u0087\7o\2\2\u0087\u0088\7c\2\2\u0088\u0089"+
		"\7t\2\2\u0089\f\3\2\2\2\u008a\u008b\7<\2\2\u008b\16\3\2\2\2\u008c\u008d"+
		"\7\u2194\2\2\u008d\20\3\2\2\2\u008e\u008f\7\u2202\2\2\u008f\22\3\2\2\2"+
		"\u0090\u0091\7*\2\2\u0091\24\3\2\2\2\u0092\u0093\7+\2\2\u0093\26\3\2\2"+
		"\2\u0094\u0095\7}\2\2\u0095\30\3\2\2\2\u0096\u0097\7\177\2\2\u0097\32"+
		"\3\2\2\2\u0098\u0099\7]\2\2\u0099\34\3\2\2\2\u009a\u009b\7_\2\2\u009b"+
		"\36\3\2\2\2\u009c\u009d\7=\2\2\u009d \3\2\2\2\u009e\u009f\7.\2\2\u009f"+
		"\"\3\2\2\2\u00a0\u00a1\7<\2\2\u00a1\u00a2\7<\2\2\u00a2\u00a3\7?\2\2\u00a3"+
		"$\3\2\2\2\u00a4\u00a5\7<\2\2\u00a5\u00a6\7<\2\2\u00a6&\3\2\2\2\u00a7\u00a8"+
		"\7\60\2\2\u00a8(\3\2\2\2\u00a9\u00aa\7\60\2\2\u00aa\u00ab\7\60\2\2\u00ab"+
		"*\3\2\2\2\u00ac\u00ad\7\u00ae\2\2\u00ad,\3\2\2\2\u00ae\u00af\7\u00bb\2"+
		"\2\u00af.\3\2\2\2\u00b0\u00b1\7\u1d49\2\2\u00b1\60\3\2\2\2\u00b2\u00b3"+
		"\7(\2\2\u00b3\62\3\2\2\2\u00b4\u00b5\7B\2\2\u00b5\64\3\2\2\2\u00b6\u00ba"+
		"\7\'\2\2\u00b7\u00bb\5S*\2\u00b8\u00bb\5M\'\2\u00b9\u00bb\7a\2\2\u00ba"+
		"\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be"+
		"\u00c0\5[.\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\66\3\2\2\2"+
		"\u00c1\u00c6\7\u27e8\2\2\u00c2\u00c5\5\67\34\2\u00c3\u00c5\13\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00ca\7\u27e9\2\2\u00ca8\3\2\2\2\u00cb\u00d0\7\u27ea\2\2\u00cc\u00cf"+
		"\59\35\2\u00cd\u00cf\13\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2"+
		"\u00cf\u00d2\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d3"+
		"\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7\u27eb\2\2\u00d4:\3\2\2\2\u00d5"+
		"\u00da\7\u27ec\2\2\u00d6\u00d9\5;\36\2\u00d7\u00d9\13\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00db\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7\u27ed"+
		"\2\2\u00de<\3\2\2\2\u00df\u00e4\7\u2985\2\2\u00e0\u00e3\5=\37\2\u00e1"+
		"\u00e3\13\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3"+
		"\2\2\2\u00e4\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00e8\7\u2986\2\2\u00e8>\3\2\2\2\u00e9\u00ed\5I%"+
		"\2\u00ea\u00ec\5K&\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00f2\5[.\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2@\3\2\2\2\u00f3"+
		"\u00f9\5Q)\2\u00f4\u00f8\5Q)\2\u00f5\u00f8\5M\'\2\u00f6\u00f8\t\2\2\2"+
		"\u00f7\u00f4\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00faB\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fc\u0103\7%\2\2\u00fd\u0102\5S*\2\u00fe\u0102\5M\'\2"+
		"\u00ff\u0102\5W,\2\u0100\u0102\5Y-\2\u0101\u00fd\3\2\2\2\u0101\u00fe\3"+
		"\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0106\u0108\5[.\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010c"+
		"\3\2\2\2\u0109\u010b\5M\'\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010dD\3\2\2\2\u010e\u010c\3\2\2\2"+
		"\u010f\u0115\7$\2\2\u0110\u0111\7^\2\2\u0111\u0114\7$\2\2\u0112\u0114"+
		"\n\3\2\2\u0113\u0110\3\2\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0118\u0119\7$\2\2\u0119F\3\2\2\2\u011a\u011b\5U+\2\u011bH\3\2\2"+
		"\2\u011c\u0120\5O(\2\u011d\u0120\5W,\2\u011e\u0120\t\4\2\2\u011f\u011c"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120J\3\2\2\2\u0121"+
		"\u0126\5S*\2\u0122\u0126\5M\'\2\u0123\u0126\5W,\2\u0124\u0126\5Y-\2\u0125"+
		"\u0121\3\2\2\2\u0125\u0122\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2"+
		"\2\2\u0126L\3\2\2\2\u0127\u0128\t\5\2\2\u0128N\3\2\2\2\u0129\u012a\t\6"+
		"\2\2\u012aP\3\2\2\2\u012b\u012c\t\7\2\2\u012cR\3\2\2\2\u012d\u012e\t\b"+
		"\2\2\u012eT\3\2\2\2\u012f\u0131\7/\2\2\u0130\u012f\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0134\t\5\2\2\u0133\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u013d\3\2"+
		"\2\2\u0137\u0139\7\60\2\2\u0138\u013a\t\5\2\2\u0139\u0138\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2"+
		"\2\2\u013d\u0137\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0146\3\2\2\2\u013f"+
		"\u0141\7\60\2\2\u0140\u0142\t\5\2\2\u0141\u0140\3\2\2\2\u0142\u0143\3"+
		"\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145"+
		"\u0130\3\2\2\2\u0145\u013f\3\2\2\2\u0146V\3\2\2\2\u0147\u0148\t\t\2\2"+
		"\u0148X\3\2\2\2\u0149\u014d\n\n\2\2\u014a\u014b\t\13\2\2\u014b\u014d\t"+
		"\f\2\2\u014c\u0149\3\2\2\2\u014c\u014a\3\2\2\2\u014dZ\3\2\2\2\u014e\u014f"+
		"\t\r\2\2\u014f\\\3\2\2\2\u0150\u0152\t\16\2\2\u0151\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\u0156\b/\2\2\u0156^\3\2\2\2\u0157\u0158\7\61\2\2\u0158\u0159"+
		"\7,\2\2\u0159\u015d\3\2\2\2\u015a\u015c\13\2\2\2\u015b\u015a\3\2\2\2\u015c"+
		"\u015f\3\2\2\2\u015d\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u0163\3\2"+
		"\2\2\u015f\u015d\3\2\2\2\u0160\u0161\7,\2\2\u0161\u0164\7\61\2\2\u0162"+
		"\u0164\7\2\2\3\u0163\u0160\3\2\2\2\u0163\u0162\3\2\2\2\u0164\u0165\3\2"+
		"\2\2\u0165\u0166\b\60\2\2\u0166`\3\2\2\2\u0167\u0168\7\61\2\2\u0168\u0169"+
		"\7\61\2\2\u0169\u016d\3\2\2\2\u016a\u016c\n\17\2\2\u016b\u016a\3\2\2\2"+
		"\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170"+
		"\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\b\61\2\2\u0171b\3\2\2\2\u0172"+
		"\u0173\7>\2\2\u0173\u0174\7#\2\2\u0174\u0175\7/\2\2\u0175\u0176\7/\2\2"+
		"\u0176\u017a\3\2\2\2\u0177\u0179\13\2\2\2\u0178\u0177\3\2\2\2\u0179\u017c"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u0181\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017d\u017e\7/\2\2\u017e\u017f\7/\2\2\u017f\u0182\7@\2"+
		"\2\u0180\u0182\7\2\2\3\u0181\u017d\3\2\2\2\u0181\u0180\3\2\2\2\u0182\u0183"+
		"\3\2\2\2\u0183\u0184\b\62\2\2\u0184d\3\2\2\2\'\2\u00ba\u00bc\u00bf\u00c4"+
		"\u00c6\u00ce\u00d0\u00d8\u00da\u00e2\u00e4\u00ed\u00f1\u00f7\u00f9\u0101"+
		"\u0103\u0107\u010c\u0113\u0115\u011f\u0125\u0130\u0135\u013b\u013d\u0143"+
		"\u0145\u014c\u0153\u015d\u0163\u016d\u017a\u0181\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}