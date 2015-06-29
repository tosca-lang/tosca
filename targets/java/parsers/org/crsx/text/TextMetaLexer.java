// Generated from /Users/villardl/Projects/crsx/crsx4/src/text/TextMetaLexer.g4 by ANTLR 4.5
package org.crsx.text;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TextMetaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MT_n=1, ET_n=2, MT_part=3, ET_part=4, MT_chars_TOK=5, ET_chars_TOK=6, 
		MT_break_TOK=7, ET_break_TOK=8, MT_openindent_TOK=9, ET_openindent_TOK=10, 
		MT_closeindent_TOK=11, ET_closeindent_TOK=12, MT_caststring_TOK=13, ET_caststring_TOK=14, 
		OPENINDENT=15, CLOSEINDENT=16, CASTSTRING=17, CHARS=18, BREAK=19, CRSX_EMBED_END=20;
	public static final int CrsxEmbed = 1;
	public static final int CrsxNestedEmbed = 2;
	public static String[] modeNames = {
		"DEFAULT_MODE", "CrsxEmbed", "CrsxNestedEmbed"
	};

	public static final String[] ruleNames = {
		"MT_n", "ET_n", "MT_part", "ET_part", "MT_chars_TOK", "ET_chars_TOK", 
		"MT_break_TOK", "ET_break_TOK", "MT_openindent_TOK", "ET_openindent_TOK", 
		"MT_closeindent_TOK", "ET_closeindent_TOK", "MT_caststring_TOK", "ET_caststring_TOK", 
		"OPENINDENT", "CLOSEINDENT", "CASTSTRING", "CHARS", "BREAK", "CRSX_META_CHAR", 
		"CRSX_START_EMBED_CHAR", "CRSX_END_EMBED_CHAR", "CRSX_EMBED_END", "CRSX_EMBED_NESTED", 
		"CRSX_EMBEDDED", "CRSX_NESTED_EMBED_END", "CRSX_NESTED_EMBED_NESTED", 
		"CRSX_NESTED_EMBEDDED"
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


	public TextMetaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TextMetaLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u0125\b\1\b\1"+
		"\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4"+
		"\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
		"\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t"+
		"\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\7\2"+
		"A\n\2\f\2\16\2D\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\4S\n\4\f\4\16\4V\13\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5^\n\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6j\n\6\f\6\16\6m\13\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0081\n\b"+
		"\f\b\16\b\u0084\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u009d\n\n\f\n\16\n\u00a0"+
		"\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f"+
		"\u00bf\n\f\f\f\16\f\u00c2\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u00e1\n\16\f\16\16\16\u00e4\13\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\6\23\u00fc\n\23\r\23\16\23\u00fd\3\24\6"+
		"\24\u0101\n\24\r\24\16\24\u0102\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\2\2\36\5\3\7\4"+
		"\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22"+
		"%\23\'\24)\25+\2-\2/\2\61\26\63\2\65\2\67\29\2;\2\5\2\3\4\5\3\2\62;\t"+
		"\2\f\f\16\17\u00ad\u00ad\u00b8\u00b8\u00bd\u00bd\u2022\u2022\u27e8\u27e9"+
		"\5\2\f\f\16\17\u00b8\u00b8\u0129\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3\61\3\2\2"+
		"\2\3\63\3\2\2\2\3\65\3\2\2\2\4\67\3\2\2\2\49\3\2\2\2\4;\3\2\2\2\5=\3\2"+
		"\2\2\7E\3\2\2\2\tK\3\2\2\2\13W\3\2\2\2\ra\3\2\2\2\17n\3\2\2\2\21x\3\2"+
		"\2\2\23\u0085\3\2\2\2\25\u008f\3\2\2\2\27\u00a1\3\2\2\2\31\u00b0\3\2\2"+
		"\2\33\u00c3\3\2\2\2\35\u00d3\3\2\2\2\37\u00e5\3\2\2\2!\u00f4\3\2\2\2#"+
		"\u00f6\3\2\2\2%\u00f8\3\2\2\2\'\u00fb\3\2\2\2)\u0100\3\2\2\2+\u0104\3"+
		"\2\2\2-\u0106\3\2\2\2/\u0108\3\2\2\2\61\u010a\3\2\2\2\63\u010e\3\2\2\2"+
		"\65\u0113\3\2\2\2\67\u0117\3\2\2\29\u011c\3\2\2\2;\u0121\3\2\2\2=>\5+"+
		"\25\2>B\7p\2\2?A\t\2\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\6\3"+
		"\2\2\2DB\3\2\2\2EF\5-\26\2FG\7p\2\2GH\7<\2\2HI\3\2\2\2IJ\b\3\2\2J\b\3"+
		"\2\2\2KL\5+\25\2LM\7r\2\2MN\7c\2\2NO\7t\2\2OP\7v\2\2PT\3\2\2\2QS\t\2\2"+
		"\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\n\3\2\2\2VT\3\2\2\2W]\5-\26"+
		"\2XY\7r\2\2YZ\7c\2\2Z[\7t\2\2[\\\7v\2\2\\^\7<\2\2]X\3\2\2\2]^\3\2\2\2"+
		"^_\3\2\2\2_`\b\5\2\2`\f\3\2\2\2ab\5+\25\2bc\7E\2\2cd\7J\2\2de\7C\2\2e"+
		"f\7T\2\2fg\7U\2\2gk\3\2\2\2hj\t\2\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl"+
		"\3\2\2\2l\16\3\2\2\2mk\3\2\2\2no\5-\26\2op\7E\2\2pq\7J\2\2qr\7C\2\2rs"+
		"\7T\2\2st\7U\2\2tu\7<\2\2uv\3\2\2\2vw\b\7\2\2w\20\3\2\2\2xy\5+\25\2yz"+
		"\7D\2\2z{\7T\2\2{|\7G\2\2|}\7C\2\2}~\7M\2\2~\u0082\3\2\2\2\177\u0081\t"+
		"\2\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\22\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\5-\26"+
		"\2\u0086\u0087\7D\2\2\u0087\u0088\7T\2\2\u0088\u0089\7G\2\2\u0089\u008a"+
		"\7C\2\2\u008a\u008b\7M\2\2\u008b\u008c\7<\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\b\t\2\2\u008e\24\3\2\2\2\u008f\u0090\5+\25\2\u0090\u0091\7Q\2\2"+
		"\u0091\u0092\7R\2\2\u0092\u0093\7G\2\2\u0093\u0094\7P\2\2\u0094\u0095"+
		"\7K\2\2\u0095\u0096\7P\2\2\u0096\u0097\7F\2\2\u0097\u0098\7G\2\2\u0098"+
		"\u0099\7P\2\2\u0099\u009a\7V\2\2\u009a\u009e\3\2\2\2\u009b\u009d\t\2\2"+
		"\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\26\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\5-\26\2\u00a2"+
		"\u00a3\7Q\2\2\u00a3\u00a4\7R\2\2\u00a4\u00a5\7G\2\2\u00a5\u00a6\7P\2\2"+
		"\u00a6\u00a7\7K\2\2\u00a7\u00a8\7P\2\2\u00a8\u00a9\7F\2\2\u00a9\u00aa"+
		"\7G\2\2\u00aa\u00ab\7P\2\2\u00ab\u00ac\7V\2\2\u00ac\u00ad\7<\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00af\b\13\2\2\u00af\30\3\2\2\2\u00b0\u00b1\5+\25"+
		"\2\u00b1\u00b2\7E\2\2\u00b2\u00b3\7N\2\2\u00b3\u00b4\7Q\2\2\u00b4\u00b5"+
		"\7U\2\2\u00b5\u00b6\7G\2\2\u00b6\u00b7\7K\2\2\u00b7\u00b8\7P\2\2\u00b8"+
		"\u00b9\7F\2\2\u00b9\u00ba\7G\2\2\u00ba\u00bb\7P\2\2\u00bb\u00bc\7V\2\2"+
		"\u00bc\u00c0\3\2\2\2\u00bd\u00bf\t\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\32\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c4\5-\26\2\u00c4\u00c5\7E\2\2\u00c5\u00c6\7N\2"+
		"\2\u00c6\u00c7\7Q\2\2\u00c7\u00c8\7U\2\2\u00c8\u00c9\7G\2\2\u00c9\u00ca"+
		"\7K\2\2\u00ca\u00cb\7P\2\2\u00cb\u00cc\7F\2\2\u00cc\u00cd\7G\2\2\u00cd"+
		"\u00ce\7P\2\2\u00ce\u00cf\7V\2\2\u00cf\u00d0\7<\2\2\u00d0\u00d1\3\2\2"+
		"\2\u00d1\u00d2\b\r\2\2\u00d2\34\3\2\2\2\u00d3\u00d4\5+\25\2\u00d4\u00d5"+
		"\7E\2\2\u00d5\u00d6\7C\2\2\u00d6\u00d7\7U\2\2\u00d7\u00d8\7V\2\2\u00d8"+
		"\u00d9\7U\2\2\u00d9\u00da\7V\2\2\u00da\u00db\7T\2\2\u00db\u00dc\7K\2\2"+
		"\u00dc\u00dd\7P\2\2\u00dd\u00de\7I\2\2\u00de\u00e2\3\2\2\2\u00df\u00e1"+
		"\t\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\36\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\5-\26"+
		"\2\u00e6\u00e7\7E\2\2\u00e7\u00e8\7C\2\2\u00e8\u00e9\7U\2\2\u00e9\u00ea"+
		"\7V\2\2\u00ea\u00eb\7U\2\2\u00eb\u00ec\7V\2\2\u00ec\u00ed\7T\2\2\u00ed"+
		"\u00ee\7K\2\2\u00ee\u00ef\7P\2\2\u00ef\u00f0\7I\2\2\u00f0\u00f1\7<\2\2"+
		"\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b\17\2\2\u00f3 \3\2\2\2\u00f4\u00f5\7"+
		"\u27e8\2\2\u00f5\"\3\2\2\2\u00f6\u00f7\7\u27e9\2\2\u00f7$\3\2\2\2\u00f8"+
		"\u00f9\7\u2022\2\2\u00f9&\3\2\2\2\u00fa\u00fc\n\3\2\2\u00fb\u00fa\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"(\3\2\2\2\u00ff\u0101\t\4\2\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2"+
		"\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103*\3\2\2\2\u0104\u0105\7"+
		"%\2\2\u0105,\3\2\2\2\u0106\u0107\7\u00ad\2\2\u0107.\3\2\2\2\u0108\u0109"+
		"\7\u00bd\2\2\u0109\60\3\2\2\2\u010a\u010b\5/\27\2\u010b\u010c\3\2\2\2"+
		"\u010c\u010d\b\30\3\2\u010d\62\3\2\2\2\u010e\u010f\5-\26\2\u010f\u0110"+
		"\3\2\2\2\u0110\u0111\b\31\4\2\u0111\u0112\b\31\5\2\u0112\64\3\2\2\2\u0113"+
		"\u0114\13\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\b\32\5\2\u0116\66\3\2"+
		"\2\2\u0117\u0118\5/\27\2\u0118\u0119\3\2\2\2\u0119\u011a\b\33\3\2\u011a"+
		"\u011b\b\33\5\2\u011b8\3\2\2\2\u011c\u011d\5-\26\2\u011d\u011e\3\2\2\2"+
		"\u011e\u011f\b\34\4\2\u011f\u0120\b\34\5\2\u0120:\3\2\2\2\u0121\u0122"+
		"\13\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\b\35\5\2\u0124<\3\2\2\2\17\2"+
		"\3\4BT]k\u0082\u009e\u00c0\u00e2\u00fd\u0102\6\7\3\2\6\2\2\7\4\2\5\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}