// Generated from /Users/villardl/Projects/crsx/crsx4/samples/miniml/MiniMLMetaLexer.g4 by ANTLR 4.5
package org.transscript.miniml;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniMLMetaLexer extends Lexer {
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
	public static final int CrsxEmbed = 1;
	public static final int CrsxNestedEmbed = 2;
	public static String[] modeNames = {
		"DEFAULT_MODE", "CrsxEmbed", "CrsxNestedEmbed"
	};

	public static final String[] ruleNames = {
		"MT_toplevel", "ET_toplevel", "MT_var_TOK", "ET_var_TOK", "MT_expr", "ET_expr", 
		"MT_timesExpr", "ET_timesExpr", "MT_compExpr", "ET_compExpr", "MT_primaryExpr", 
		"ET_primaryExpr", "MT_int_TOK", "ET_int_TOK", "MT_app_expr", "ET_app_expr", 
		"MT_simple_expr", "ET_simple_expr", "MT_ty", "ET_ty", "MT_tyPrimary", 
		"ET_tyPrimary", "VAR", "INT", "TINT", "TBOOL", "TRUE", "FALSE", "FUN", 
		"IS", "IF", "THEN", "ELSE", "LET", "SEMISEMI", "EQUAL", "LESS", "TARROW", 
		"COLON", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "WS", "CRSX_META_CHAR", 
		"CRSX_START_EMBED_CHAR", "CRSX_END_EMBED_CHAR", "CRSX_EMBED_END", "CRSX_EMBED_NESTED", 
		"CRSX_EMBEDDED", "CRSX_NESTED_EMBED_END", "CRSX_NESTED_EMBED_NESTED", 
		"CRSX_NESTED_EMBEDDED"
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


	public MiniMLMetaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniMLMetaLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\60\u020c\b\1\b\1"+
		"\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4"+
		"\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
		"\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t"+
		"\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t"+
		"\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4"+
		"*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\7\2}\n\2\f\2\16\2\u0080\13\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0095\n\4"+
		"\f\4\16\4\u0098\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\7\6\u00a9\n\6\f\6\16\6\u00ac\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00c3\n"+
		"\b\f\b\16\b\u00c6\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00e1\n\n\f\n"+
		"\16\n\u00e4\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f"+
		"\u0101\n\f\f\f\16\f\u0104\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u011c\n\16"+
		"\f\16\16\16\u011f\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0134\n\20\f\20"+
		"\16\20\u0137\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\7\22\u0154\n\22\f\22\16\22\u0157\13\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\7\24\u016e\n\24\f\24\16\24\u0171\13\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\7\26\u0186\n\26\f\26\16\26\u0189\13\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\6\30\u019a"+
		"\n\30\r\30\16\30\u019b\3\31\6\31\u019f\n\31\r\31\16\31\u01a0\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\6.\u01e6\n.\r.\16.\u01e7"+
		"\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3"+
		"\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3"+
		"\66\3\66\3\67\3\67\3\67\3\67\2\28\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n"+
		"\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61"+
		"\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\2"+
		"a\2c\2e\60g\2i\2k\2m\2o\2\5\2\3\4\6\3\2\62;\7\2))CC\\\\cc||\5\2))\62\62"+
		";;\5\2\13\f\16\17\"\"\u0214\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3"+
		"e\3\2\2\2\3g\3\2\2\2\3i\3\2\2\2\4k\3\2\2\2\4m\3\2\2\2\4o\3\2\2\2\5q\3"+
		"\2\2\2\7\u0081\3\2\2\2\t\u008e\3\2\2\2\13\u0099\3\2\2\2\r\u00a1\3\2\2"+
		"\2\17\u00ad\3\2\2\2\21\u00b6\3\2\2\2\23\u00c7\3\2\2\2\25\u00d5\3\2\2\2"+
		"\27\u00e5\3\2\2\2\31\u00f2\3\2\2\2\33\u0105\3\2\2\2\35\u0115\3\2\2\2\37"+
		"\u0120\3\2\2\2!\u0128\3\2\2\2#\u0138\3\2\2\2%\u0145\3\2\2\2\'\u0158\3"+
		"\2\2\2)\u0168\3\2\2\2+\u0172\3\2\2\2-\u0179\3\2\2\2/\u018a\3\2\2\2\61"+
		"\u0199\3\2\2\2\63\u019e\3\2\2\2\65\u01a2\3\2\2\2\67\u01a6\3\2\2\29\u01ab"+
		"\3\2\2\2;\u01b0\3\2\2\2=\u01b6\3\2\2\2?\u01ba\3\2\2\2A\u01bd\3\2\2\2C"+
		"\u01c0\3\2\2\2E\u01c5\3\2\2\2G\u01ca\3\2\2\2I\u01ce\3\2\2\2K\u01d1\3\2"+
		"\2\2M\u01d3\3\2\2\2O\u01d5\3\2\2\2Q\u01d8\3\2\2\2S\u01da\3\2\2\2U\u01dc"+
		"\3\2\2\2W\u01de\3\2\2\2Y\u01e0\3\2\2\2[\u01e2\3\2\2\2]\u01e5\3\2\2\2_"+
		"\u01eb\3\2\2\2a\u01ed\3\2\2\2c\u01ef\3\2\2\2e\u01f1\3\2\2\2g\u01f5\3\2"+
		"\2\2i\u01fa\3\2\2\2k\u01fe\3\2\2\2m\u0203\3\2\2\2o\u0208\3\2\2\2qr\5_"+
		"/\2rs\7v\2\2st\7q\2\2tu\7r\2\2uv\7n\2\2vw\7g\2\2wx\7x\2\2xy\7g\2\2yz\7"+
		"n\2\2z~\3\2\2\2{}\t\2\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2"+
		"\2\2\177\6\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\5a\60\2\u0082\u0083\7v\2"+
		"\2\u0083\u0084\7q\2\2\u0084\u0085\7r\2\2\u0085\u0086\7n\2\2\u0086\u0087"+
		"\7g\2\2\u0087\u0088\7x\2\2\u0088\u0089\7g\2\2\u0089\u008a\7n\2\2\u008a"+
		"\u008b\7<\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\3\2\2\u008d\b\3\2\2\2"+
		"\u008e\u008f\5_/\2\u008f\u0090\7X\2\2\u0090\u0091\7C\2\2\u0091\u0092\7"+
		"T\2\2\u0092\u0096\3\2\2\2\u0093\u0095\t\2\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\n\3\2\2\2"+
		"\u0098\u0096\3\2\2\2\u0099\u009a\5a\60\2\u009a\u009b\7X\2\2\u009b\u009c"+
		"\7C\2\2\u009c\u009d\7T\2\2\u009d\u009e\7<\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\b\5\2\2\u00a0\f\3\2\2\2\u00a1\u00a2\5_/\2\u00a2\u00a3\7g\2\2\u00a3"+
		"\u00a4\7z\2\2\u00a4\u00a5\7r\2\2\u00a5\u00a6\7t\2\2\u00a6\u00aa\3\2\2"+
		"\2\u00a7\u00a9\t\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\16\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00ae\5a\60\2\u00ae\u00af\7g\2\2\u00af\u00b0\7z\2\2\u00b0\u00b1\7r\2"+
		"\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7<\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5"+
		"\b\7\2\2\u00b5\20\3\2\2\2\u00b6\u00b7\5_/\2\u00b7\u00b8\7v\2\2\u00b8\u00b9"+
		"\7k\2\2\u00b9\u00ba\7o\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7u\2\2\u00bc"+
		"\u00bd\7G\2\2\u00bd\u00be\7z\2\2\u00be\u00bf\7r\2\2\u00bf\u00c0\7t\2\2"+
		"\u00c0\u00c4\3\2\2\2\u00c1\u00c3\t\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6"+
		"\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\22\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00c8\5a\60\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7k\2"+
		"\2\u00ca\u00cb\7o\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce"+
		"\7G\2\2\u00ce\u00cf\7z\2\2\u00cf\u00d0\7r\2\2\u00d0\u00d1\7t\2\2\u00d1"+
		"\u00d2\7<\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\b\t\2\2\u00d4\24\3\2\2\2"+
		"\u00d5\u00d6\5_/\2\u00d6\u00d7\7e\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7"+
		"o\2\2\u00d9\u00da\7r\2\2\u00da\u00db\7G\2\2\u00db\u00dc\7z\2\2\u00dc\u00dd"+
		"\7r\2\2\u00dd\u00de\7t\2\2\u00de\u00e2\3\2\2\2\u00df\u00e1\t\2\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\26\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\5a\60\2\u00e6\u00e7"+
		"\7e\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9\7o\2\2\u00e9\u00ea\7r\2\2\u00ea"+
		"\u00eb\7G\2\2\u00eb\u00ec\7z\2\2\u00ec\u00ed\7r\2\2\u00ed\u00ee\7t\2\2"+
		"\u00ee\u00ef\7<\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\b\13\2\2\u00f1\30"+
		"\3\2\2\2\u00f2\u00f3\5_/\2\u00f3\u00f4\7r\2\2\u00f4\u00f5\7t\2\2\u00f5"+
		"\u00f6\7k\2\2\u00f6\u00f7\7o\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7t\2\2"+
		"\u00f9\u00fa\7{\2\2\u00fa\u00fb\7G\2\2\u00fb\u00fc\7z\2\2\u00fc\u00fd"+
		"\7r\2\2\u00fd\u00fe\7t\2\2\u00fe\u0102\3\2\2\2\u00ff\u0101\t\2\2\2\u0100"+
		"\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103\32\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\5a\60\2\u0106\u0107"+
		"\7r\2\2\u0107\u0108\7t\2\2\u0108\u0109\7k\2\2\u0109\u010a\7o\2\2\u010a"+
		"\u010b\7c\2\2\u010b\u010c\7t\2\2\u010c\u010d\7{\2\2\u010d\u010e\7G\2\2"+
		"\u010e\u010f\7z\2\2\u010f\u0110\7r\2\2\u0110\u0111\7t\2\2\u0111\u0112"+
		"\7<\2\2\u0112\u0113\3\2\2\2\u0113\u0114\b\r\2\2\u0114\34\3\2\2\2\u0115"+
		"\u0116\5_/\2\u0116\u0117\7K\2\2\u0117\u0118\7P\2\2\u0118\u0119\7V\2\2"+
		"\u0119\u011d\3\2\2\2\u011a\u011c\t\2\2\2\u011b\u011a\3\2\2\2\u011c\u011f"+
		"\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\36\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u0120\u0121\5a\60\2\u0121\u0122\7K\2\2\u0122\u0123\7P\2"+
		"\2\u0123\u0124\7V\2\2\u0124\u0125\7<\2\2\u0125\u0126\3\2\2\2\u0126\u0127"+
		"\b\17\2\2\u0127 \3\2\2\2\u0128\u0129\5_/\2\u0129\u012a\7c\2\2\u012a\u012b"+
		"\7r\2\2\u012b\u012c\7r\2\2\u012c\u012d\7a\2\2\u012d\u012e\7g\2\2\u012e"+
		"\u012f\7z\2\2\u012f\u0130\7r\2\2\u0130\u0131\7t\2\2\u0131\u0135\3\2\2"+
		"\2\u0132\u0134\t\2\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136\"\3\2\2\2\u0137\u0135\3\2\2\2\u0138"+
		"\u0139\5a\60\2\u0139\u013a\7c\2\2\u013a\u013b\7r\2\2\u013b\u013c\7r\2"+
		"\2\u013c\u013d\7a\2\2\u013d\u013e\7g\2\2\u013e\u013f\7z\2\2\u013f\u0140"+
		"\7r\2\2\u0140\u0141\7t\2\2\u0141\u0142\7<\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0144\b\21\2\2\u0144$\3\2\2\2\u0145\u0146\5_/\2\u0146\u0147\7u\2\2\u0147"+
		"\u0148\7k\2\2\u0148\u0149\7o\2\2\u0149\u014a\7r\2\2\u014a\u014b\7n\2\2"+
		"\u014b\u014c\7g\2\2\u014c\u014d\7a\2\2\u014d\u014e\7g\2\2\u014e\u014f"+
		"\7z\2\2\u014f\u0150\7r\2\2\u0150\u0151\7t\2\2\u0151\u0155\3\2\2\2\u0152"+
		"\u0154\t\2\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2"+
		"\2\2\u0155\u0156\3\2\2\2\u0156&\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159"+
		"\5a\60\2\u0159\u015a\7u\2\2\u015a\u015b\7k\2\2\u015b\u015c\7o\2\2\u015c"+
		"\u015d\7r\2\2\u015d\u015e\7n\2\2\u015e\u015f\7g\2\2\u015f\u0160\7a\2\2"+
		"\u0160\u0161\7g\2\2\u0161\u0162\7z\2\2\u0162\u0163\7r\2\2\u0163\u0164"+
		"\7t\2\2\u0164\u0165\7<\2\2\u0165\u0166\3\2\2\2\u0166\u0167\b\23\2\2\u0167"+
		"(\3\2\2\2\u0168\u0169\5_/\2\u0169\u016a\7v\2\2\u016a\u016b\7{\2\2\u016b"+
		"\u016f\3\2\2\2\u016c\u016e\t\2\2\2\u016d\u016c\3\2\2\2\u016e\u0171\3\2"+
		"\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170*\3\2\2\2\u0171\u016f"+
		"\3\2\2\2\u0172\u0173\5a\60\2\u0173\u0174\7v\2\2\u0174\u0175\7{\2\2\u0175"+
		"\u0176\7<\2\2\u0176\u0177\3\2\2\2\u0177\u0178\b\25\2\2\u0178,\3\2\2\2"+
		"\u0179\u017a\5_/\2\u017a\u017b\7v\2\2\u017b\u017c\7{\2\2\u017c\u017d\7"+
		"R\2\2\u017d\u017e\7t\2\2\u017e\u017f\7k\2\2\u017f\u0180\7o\2\2\u0180\u0181"+
		"\7c\2\2\u0181\u0182\7t\2\2\u0182\u0183\7{\2\2\u0183\u0187\3\2\2\2\u0184"+
		"\u0186\t\2\2\2\u0185\u0184\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2"+
		"\2\2\u0187\u0188\3\2\2\2\u0188.\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018b"+
		"\5a\60\2\u018b\u018c\7v\2\2\u018c\u018d\7{\2\2\u018d\u018e\7R\2\2\u018e"+
		"\u018f\7t\2\2\u018f\u0190\7k\2\2\u0190\u0191\7o\2\2\u0191\u0192\7c\2\2"+
		"\u0192\u0193\7t\2\2\u0193\u0194\7{\2\2\u0194\u0195\7<\2\2\u0195\u0196"+
		"\3\2\2\2\u0196\u0197\b\27\2\2\u0197\60\3\2\2\2\u0198\u019a\t\3\2\2\u0199"+
		"\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2"+
		"\2\2\u019c\62\3\2\2\2\u019d\u019f\t\4\2\2\u019e\u019d\3\2\2\2\u019f\u01a0"+
		"\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\64\3\2\2\2\u01a2"+
		"\u01a3\7k\2\2\u01a3\u01a4\7p\2\2\u01a4\u01a5\7v\2\2\u01a5\66\3\2\2\2\u01a6"+
		"\u01a7\7d\2\2\u01a7\u01a8\7q\2\2\u01a8\u01a9\7q\2\2\u01a9\u01aa\7n\2\2"+
		"\u01aa8\3\2\2\2\u01ab\u01ac\7v\2\2\u01ac\u01ad\7t\2\2\u01ad\u01ae\7w\2"+
		"\2\u01ae\u01af\7g\2\2\u01af:\3\2\2\2\u01b0\u01b1\7h\2\2\u01b1\u01b2\7"+
		"c\2\2\u01b2\u01b3\7n\2\2\u01b3\u01b4\7u\2\2\u01b4\u01b5\7g\2\2\u01b5<"+
		"\3\2\2\2\u01b6\u01b7\7h\2\2\u01b7\u01b8\7w\2\2\u01b8\u01b9\7p\2\2\u01b9"+
		">\3\2\2\2\u01ba\u01bb\7k\2\2\u01bb\u01bc\7u\2\2\u01bc@\3\2\2\2\u01bd\u01be"+
		"\7k\2\2\u01be\u01bf\7h\2\2\u01bfB\3\2\2\2\u01c0\u01c1\7v\2\2\u01c1\u01c2"+
		"\7j\2\2\u01c2\u01c3\7g\2\2\u01c3\u01c4\7p\2\2\u01c4D\3\2\2\2\u01c5\u01c6"+
		"\7g\2\2\u01c6\u01c7\7n\2\2\u01c7\u01c8\7u\2\2\u01c8\u01c9\7g\2\2\u01c9"+
		"F\3\2\2\2\u01ca\u01cb\7n\2\2\u01cb\u01cc\7g\2\2\u01cc\u01cd\7v\2\2\u01cd"+
		"H\3\2\2\2\u01ce\u01cf\7=\2\2\u01cf\u01d0\7=\2\2\u01d0J\3\2\2\2\u01d1\u01d2"+
		"\7?\2\2\u01d2L\3\2\2\2\u01d3\u01d4\7>\2\2\u01d4N\3\2\2\2\u01d5\u01d6\7"+
		"/\2\2\u01d6\u01d7\7@\2\2\u01d7P\3\2\2\2\u01d8\u01d9\7<\2\2\u01d9R\3\2"+
		"\2\2\u01da\u01db\7*\2\2\u01dbT\3\2\2\2\u01dc\u01dd\7+\2\2\u01ddV\3\2\2"+
		"\2\u01de\u01df\7-\2\2\u01dfX\3\2\2\2\u01e0\u01e1\7/\2\2\u01e1Z\3\2\2\2"+
		"\u01e2\u01e3\7,\2\2\u01e3\\\3\2\2\2\u01e4\u01e6\t\5\2\2\u01e5\u01e4\3"+
		"\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01ea\b.\3\2\u01ea^\3\2\2\2\u01eb\u01ec\7%\2\2\u01ec"+
		"`\3\2\2\2\u01ed\u01ee\7\u27ea\2\2\u01eeb\3\2\2\2\u01ef\u01f0\7\u27eb\2"+
		"\2\u01f0d\3\2\2\2\u01f1\u01f2\5c\61\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4"+
		"\b\62\4\2\u01f4f\3\2\2\2\u01f5\u01f6\5a\60\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u01f8\b\63\5\2\u01f8\u01f9\b\63\6\2\u01f9h\3\2\2\2\u01fa\u01fb\13\2\2"+
		"\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\b\64\6\2\u01fdj\3\2\2\2\u01fe\u01ff"+
		"\5c\61\2\u01ff\u0200\3\2\2\2\u0200\u0201\b\65\4\2\u0201\u0202\b\65\6\2"+
		"\u0202l\3\2\2\2\u0203\u0204\5a\60\2\u0204\u0205\3\2\2\2\u0205\u0206\b"+
		"\66\5\2\u0206\u0207\b\66\6\2\u0207n\3\2\2\2\u0208\u0209\13\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020b\b\67\6\2\u020bp\3\2\2\2\23\2\3\4~\u0096\u00aa"+
		"\u00c4\u00e2\u0102\u011d\u0135\u0155\u016f\u0187\u019b\u01a0\u01e7\7\7"+
		"\3\2\2\3\2\6\2\2\7\4\2\5\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}