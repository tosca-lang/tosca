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
		MODULE=1, DISPATCH=2, DELAY=3, COLON=4, ARROW=5, FORALL=6, LPAR=7, RPAR=8, 
		LBRACE=9, RBRACE=10, LSQUARE=11, RSQUARE=12, SEMI=13, COMMA=14, DATASORT=15, 
		COLONCOLON=16, DOT=17, NOT=18, LINEAR=19, FUNCTIONAL=20, AND=21, AT=22, 
		CONSTRUCTOR=23, VARIABLE=24, METAVAR=25, STRING=26, NUMBER=27, WS=28, 
		BLOCK_COMMENT=29, LINE_COMMENT=30, XML_COMMENT=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"MODULE", "DISPATCH", "DELAY", "COLON", "ARROW", "FORALL", "LPAR", "RPAR", 
		"LBRACE", "RBRACE", "LSQUARE", "RSQUARE", "SEMI", "COMMA", "DATASORT", 
		"COLONCOLON", "DOT", "NOT", "LINEAR", "FUNCTIONAL", "AND", "AT", "CONSTRUCTOR", 
		"VARIABLE", "METAVAR", "STRING", "NUMBER", "StartConstructorChar", "ConstructorChar", 
		"Digit", "Upper", "Lower", "Alpha", "Decimal", "Infix", "Unicode", "WS", 
		"BLOCK_COMMENT", "LINE_COMMENT", "XML_COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u011d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\7\30\u0095"+
		"\n\30\f\30\16\30\u0098\13\30\3\31\3\31\3\31\3\31\7\31\u009e\n\31\f\31"+
		"\16\31\u00a1\13\31\3\32\3\32\3\32\3\32\3\32\7\32\u00a8\n\32\f\32\16\32"+
		"\u00ab\13\32\3\33\3\33\3\33\3\33\7\33\u00b1\n\33\f\33\16\33\u00b4\13\33"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u00be\n\35\3\36\3\36\3\36"+
		"\5\36\u00c3\n\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\6#\u00ce\n#\r#\16#\u00cf"+
		"\3#\3#\6#\u00d4\n#\r#\16#\u00d5\5#\u00d8\n#\3#\3#\6#\u00dc\n#\r#\16#\u00dd"+
		"\5#\u00e0\n#\3$\3$\3%\3%\3%\5%\u00e7\n%\3&\6&\u00ea\n&\r&\16&\u00eb\3"+
		"&\3&\3\'\3\'\3\'\3\'\7\'\u00f4\n\'\f\'\16\'\u00f7\13\'\3\'\3\'\3\'\5\'"+
		"\u00fc\n\'\3\'\3\'\3(\3(\3(\3(\7(\u0104\n(\f(\16(\u0107\13(\3(\3(\3)\3"+
		")\3)\3)\3)\3)\7)\u0111\n)\f)\16)\u0114\13)\3)\3)\3)\3)\5)\u011a\n)\3)"+
		"\3)\4\u00f5\u0112\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\2;\2=\2?\2A\2C\2E\2G\2I\2K\36M\37O Q!\3\2\16\4\2&&aa\3\2"+
		"$$\3\2\62;\3\2C\\\3\2c|\7\2&&\62;C\\aac|\f\2##\'\',-//AA^^``bb~~\u0080"+
		"\u0080\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\5\2\13"+
		"\f\16\17\"\"\4\2\f\f\17\17\u012e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2"+
		"\5Z\3\2\2\2\7c\3\2\2\2\ti\3\2\2\2\13k\3\2\2\2\rm\3\2\2\2\17o\3\2\2\2\21"+
		"q\3\2\2\2\23s\3\2\2\2\25u\3\2\2\2\27w\3\2\2\2\31y\3\2\2\2\33{\3\2\2\2"+
		"\35}\3\2\2\2\37\177\3\2\2\2!\u0083\3\2\2\2#\u0086\3\2\2\2%\u0088\3\2\2"+
		"\2\'\u008a\3\2\2\2)\u008c\3\2\2\2+\u008e\3\2\2\2-\u0090\3\2\2\2/\u0092"+
		"\3\2\2\2\61\u0099\3\2\2\2\63\u00a2\3\2\2\2\65\u00ac\3\2\2\2\67\u00b7\3"+
		"\2\2\29\u00bd\3\2\2\2;\u00c2\3\2\2\2=\u00c4\3\2\2\2?\u00c6\3\2\2\2A\u00c8"+
		"\3\2\2\2C\u00ca\3\2\2\2E\u00df\3\2\2\2G\u00e1\3\2\2\2I\u00e6\3\2\2\2K"+
		"\u00e9\3\2\2\2M\u00ef\3\2\2\2O\u00ff\3\2\2\2Q\u010a\3\2\2\2ST\7o\2\2T"+
		"U\7q\2\2UV\7f\2\2VW\7w\2\2WX\7n\2\2XY\7g\2\2Y\4\3\2\2\2Z[\7f\2\2[\\\7"+
		"k\2\2\\]\7u\2\2]^\7r\2\2^_\7c\2\2_`\7v\2\2`a\7e\2\2ab\7j\2\2b\6\3\2\2"+
		"\2cd\7f\2\2de\7g\2\2ef\7n\2\2fg\7c\2\2gh\7{\2\2h\b\3\2\2\2ij\7<\2\2j\n"+
		"\3\2\2\2kl\7\u2194\2\2l\f\3\2\2\2mn\7\u2202\2\2n\16\3\2\2\2op\7*\2\2p"+
		"\20\3\2\2\2qr\7+\2\2r\22\3\2\2\2st\7}\2\2t\24\3\2\2\2uv\7\177\2\2v\26"+
		"\3\2\2\2wx\7]\2\2x\30\3\2\2\2yz\7_\2\2z\32\3\2\2\2{|\7=\2\2|\34\3\2\2"+
		"\2}~\7.\2\2~\36\3\2\2\2\177\u0080\7<\2\2\u0080\u0081\7<\2\2\u0081\u0082"+
		"\7?\2\2\u0082 \3\2\2\2\u0083\u0084\7<\2\2\u0084\u0085\7<\2\2\u0085\"\3"+
		"\2\2\2\u0086\u0087\7\60\2\2\u0087$\3\2\2\2\u0088\u0089\7\u00ae\2\2\u0089"+
		"&\3\2\2\2\u008a\u008b\7\u00bb\2\2\u008b(\3\2\2\2\u008c\u008d\7\u1d49\2"+
		"\2\u008d*\3\2\2\2\u008e\u008f\7(\2\2\u008f,\3\2\2\2\u0090\u0091\7B\2\2"+
		"\u0091.\3\2\2\2\u0092\u0096\59\35\2\u0093\u0095\5;\36\2\u0094\u0093\3"+
		"\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\60\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009f\5A!\2\u009a\u009e\5A!\2\u009b"+
		"\u009e\5=\37\2\u009c\u009e\7/\2\2\u009d\u009a\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\62\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a9\7%\2\2"+
		"\u00a3\u00a8\5C\"\2\u00a4\u00a8\t\2\2\2\u00a5\u00a8\5G$\2\u00a6\u00a8"+
		"\5I%\2\u00a7\u00a3\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\64\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00b2\7$\2\2\u00ad\u00ae"+
		"\7$\2\2\u00ae\u00b1\7$\2\2\u00af\u00b1\n\3\2\2\u00b0\u00ad\3\2\2\2\u00b0"+
		"\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7$\2\2\u00b6"+
		"\66\3\2\2\2\u00b7\u00b8\5E#\2\u00b88\3\2\2\2\u00b9\u00be\5? \2\u00ba\u00be"+
		"\t\2\2\2\u00bb\u00be\5G$\2\u00bc\u00be\5I%\2\u00bd\u00b9\3\2\2\2\u00bd"+
		"\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be:\3\2\2\2"+
		"\u00bf\u00c3\5C\"\2\u00c0\u00c3\5G$\2\u00c1\u00c3\5I%\2\u00c2\u00bf\3"+
		"\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3<\3\2\2\2\u00c4\u00c5"+
		"\t\4\2\2\u00c5>\3\2\2\2\u00c6\u00c7\t\5\2\2\u00c7@\3\2\2\2\u00c8\u00c9"+
		"\t\6\2\2\u00c9B\3\2\2\2\u00ca\u00cb\t\7\2\2\u00cbD\3\2\2\2\u00cc\u00ce"+
		"\t\4\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d7\3\2\2\2\u00d1\u00d3\7\60\2\2\u00d2\u00d4\t"+
		"\4\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\u00e0\3\2\2\2\u00d9\u00db\7\60\2\2\u00da\u00dc\t\4\2\2\u00db"+
		"\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00e0\3\2\2\2\u00df\u00cd\3\2\2\2\u00df\u00d9\3\2\2\2\u00e0"+
		"F\3\2\2\2\u00e1\u00e2\t\b\2\2\u00e2H\3\2\2\2\u00e3\u00e7\n\t\2\2\u00e4"+
		"\u00e5\t\n\2\2\u00e5\u00e7\t\13\2\2\u00e6\u00e3\3\2\2\2\u00e6\u00e4\3"+
		"\2\2\2\u00e7J\3\2\2\2\u00e8\u00ea\t\f\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ee\b&\2\2\u00eeL\3\2\2\2\u00ef\u00f0\7\61\2\2\u00f0\u00f1\7,\2\2\u00f1"+
		"\u00f5\3\2\2\2\u00f2\u00f4\13\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3"+
		"\2\2\2\u00f5\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00fb\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00f9\7,\2\2\u00f9\u00fc\7\61\2\2\u00fa\u00fc\7\2"+
		"\2\3\u00fb\u00f8\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fe\b\'\2\2\u00feN\3\2\2\2\u00ff\u0100\7\61\2\2\u0100\u0101\7\61\2"+
		"\2\u0101\u0105\3\2\2\2\u0102\u0104\n\r\2\2\u0103\u0102\3\2\2\2\u0104\u0107"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u0109\b(\2\2\u0109P\3\2\2\2\u010a\u010b\7>\2\2\u010b"+
		"\u010c\7#\2\2\u010c\u010d\7/\2\2\u010d\u010e\7/\2\2\u010e\u0112\3\2\2"+
		"\2\u010f\u0111\13\2\2\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0119\3\2\2\2\u0114\u0112\3\2"+
		"\2\2\u0115\u0116\7/\2\2\u0116\u0117\7/\2\2\u0117\u011a\7@\2\2\u0118\u011a"+
		"\7\2\2\3\u0119\u0115\3\2\2\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011c\b)\2\2\u011cR\3\2\2\2\30\2\u0096\u009d\u009f\u00a7\u00a9\u00b0"+
		"\u00b2\u00bd\u00c2\u00cf\u00d5\u00d7\u00dd\u00df\u00e6\u00eb\u00f5\u00fb"+
		"\u0105\u0112\u0119\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}