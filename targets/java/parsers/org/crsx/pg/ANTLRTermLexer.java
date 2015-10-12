// Generated from /Users/villardl/Projects/crsx/crsx4_2/src/pg/ANTLRTermLexer.g4 by ANTLR 4.5
package org.crsx.pg;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ANTLRTermLexer extends Lexer {
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
	public static final int ArgAction = 1;
	public static final int LexerCharSet = 2;
	public static String[] modeNames = {
		"DEFAULT_MODE", "ArgAction", "LexerCharSet"
	};

	public static final String[] ruleNames = {
		"DOC_COMMENT", "BLOCK_COMMENT", "LINE_COMMENT", "BEGIN_ARG_ACTION", "OPTIONS", 
		"TOKENS", "IMPORT", "FRAGMENT", "LEXER", "PARSER", "GRAMMAR", "PROTECTED", 
		"PUBLIC", "PRIVATE", "RETURNS", "LOCALS", "THROWS", "CATCH", "FINALLY", 
		"MODE", "COLON", "COLONCOLON", "COMMA", "SEMI", "LPAREN", "RPAREN", "RARROW", 
		"LT", "GT", "ASSIGN", "QUESTION", "STAR", "PLUS", "PLUS_ASSIGN", "OR", 
		"DOLLAR", "DOT", "RANGE", "AT", "POUND", "NOT", "RBRACE", "ID", "NameChar", 
		"NameStartChar", "INT", "STRING_LITERAL", "UNTERMINATED_STRING_LITERAL", 
		"ESC_SEQ", "UNICODE_ESC", "HEX_DIGIT", "WS", "ACTION", "ACTION_ESCAPE", 
		"ACTION_STRING_LITERAL", "ACTION_CHAR_LITERAL", "ERRCHAR", "NESTED_ARG_ACTION", 
		"ARG_ACTION_ESCAPE", "ARG_ACTION_STRING_LITERAL", "ARG_ACTION_CHAR_LITERAL", 
		"ARG_ACTION", "UNTERMINATED_ARG_ACTION", "ARG_ACTION_CHAR", "LEXER_CHAR_SET_BODY", 
		"LEXER_CHAR_SET", "UNTERMINATED_CHAR_SET"
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


		/** Track whether we are inside of a rule and whether it is lexical parser.
		 *  _currentRuleType==Token.INVALID_TYPE means that we are outside of a rule.
		 *  At the first sign of a rule name reference and _currentRuleType==invalid,
		 *  we can assume that we are starting a parser rule. Similarly, seeing
		 *  a token reference when not already in rule means starting a token
		 *  rule. The terminating ';' of a rule, flips this back to invalid type.
		 *
		 *  This is not perfect logic but works. For example, "grammar T;" means
		 *  that we start and stop a lexical rule for the "T;". Dangerous but works.
		 *
		 *  The whole point of this state information is to distinguish
		 *  between [..arg actions..] and [charsets]. Char sets can only occur in
		 *  lexical rules and arg actions cannot occur.
		 */
		private int _currentRuleType = Token.INVALID_TYPE;

		public int getCurrentRuleType() {
			return _currentRuleType;
		}

		public void setCurrentRuleType(int ruleType) {
			this._currentRuleType = ruleType;
		}

		protected void handleBeginArgAction() {
			if (inLexerRule()) {
				pushMode(LexerCharSet);
				more();
			}
			else {
				pushMode(ArgAction);
				more();
			}
		}

		@Override
		public Token emit() {
			if (_type == ID) {
				String firstChar = _input.getText(Interval.of(_tokenStartCharIndex, _tokenStartCharIndex));
				if (Character.isUpperCase(firstChar.charAt(0))) {
					_type = TOKEN_REF;
				} else {
					_type = RULE_REF;
				}

				if (_currentRuleType == Token.INVALID_TYPE) { // if outside of rule def
					_currentRuleType = _type;                 // set to inside lexer or parser rule
				}
			}
			else if (_type == SEMI) {                  // exit rule def
				_currentRuleType = Token.INVALID_TYPE;
			}

			return super.emit();
		}

		private boolean inLexerRule() {
			return _currentRuleType == TOKEN_REF;
		}
		private boolean inParserRule() { // not used, but added for clarity
			return _currentRuleType == RULE_REF;
		}


	public ANTLRTermLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ANTLRTermLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 3:
			BEGIN_ARG_ACTION_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void BEGIN_ARG_ACTION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			handleBeginArgAction();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\29\u0229\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t"+
		"<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\3\2\3\2"+
		"\7\2\u0091\n\2\f\2\16\2\u0094\13\2\3\2\3\2\3\2\5\2\u0099\n\2\3\3\3\3\3"+
		"\3\3\3\7\3\u009f\n\3\f\3\16\3\u00a2\13\3\3\3\3\3\3\3\5\3\u00a7\n\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\7\4\u00af\n\4\f\4\16\4\u00b2\13\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00c2\n\6\f\6\16\6\u00c5"+
		"\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00d1\n\7\f\7\16\7\u00d4"+
		"\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#"+
		"\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\7,\u0171"+
		"\n,\f,\16,\u0174\13,\3-\3-\5-\u0178\n-\3.\3.\3/\6/\u017d\n/\r/\16/\u017e"+
		"\3\60\3\60\3\60\7\60\u0184\n\60\f\60\16\60\u0187\13\60\3\60\3\60\3\61"+
		"\3\61\3\61\7\61\u018e\n\61\f\61\16\61\u0191\13\61\3\62\3\62\3\62\3\62"+
		"\3\62\5\62\u0198\n\62\3\63\3\63\3\63\3\63\3\63\5\63\u019f\n\63\5\63\u01a1"+
		"\n\63\5\63\u01a3\n\63\5\63\u01a5\n\63\3\64\3\64\3\65\6\65\u01aa\n\65\r"+
		"\65\16\65\u01ab\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\7\66\u01b9\n\66\f\66\16\66\u01bc\13\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\7\66\u01c4\n\66\f\66\16\66\u01c7\13\66\3\66\7\66\u01ca\n\66\f\66\16\66"+
		"\u01cd\13\66\3\66\5\66\u01d0\n\66\3\67\3\67\3\67\38\38\38\78\u01d8\n8"+
		"\f8\168\u01db\138\38\38\39\39\39\79\u01e2\n9\f9\169\u01e5\139\39\39\3"+
		":\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\7=\u01fb\n=\f=\16"+
		"=\u01fe\13=\3=\3=\3=\3=\3>\3>\3>\3>\3>\5>\u0209\n>\3>\3>\3?\3?\3?\3?\3"+
		"@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\6B\u021c\nB\rB\16B\u021d\3B\3B\3C\3C\3"+
		"C\3C\3D\3D\3D\3D\6\u0092\u00a0\u01ba\u01cb\2E\5\6\7\7\t\b\13\t\r\n\17"+
		"\13\21\f\23\r\25\16\27\17\31\20\33\21\35\22\37\23!\24#\25%\26\'\27)\30"+
		"+\31-\32/\33\61\34\63\35\65\36\67\379 ;!=\"?#A$C%E&G\'I(K)M*O+Q,S-U.W"+
		"/Y\60[\2]\2_\61a\62c\63e\2g\2i\2k\64m\65o\2q\2s\2u\66w\2y\2{\2}\2\177"+
		"\67\u00818\u0083\2\u0085\2\u0087\5\u00899\5\2\3\4\16\4\2\f\f\17\17\5\2"+
		"\13\f\16\17\"\"\7\2\62;aa\u00b9\u00b9\u0302\u0371\u2041\u2042\17\2C\\"+
		"c|\u00c2\u00d8\u00da\u00f8\u00fa\u0301\u0372\u037f\u0381\u2001\u200e\u200f"+
		"\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\3\2\62;\6"+
		"\2\f\f\17\17))^^\n\2$$))^^ddhhppttvv\5\2\62;CHch\3\3\177\177\4\2$$^^\4"+
		"\2))^^\3\2^_\u0246\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2u\3\2\2\2\3w\3\2\2\2\3y\3\2\2\2\3{\3\2\2\2\3"+
		"}\3\2\2\2\3\177\3\2\2\2\3\u0081\3\2\2\2\3\u0083\3\2\2\2\4\u0085\3\2\2"+
		"\2\4\u0087\3\2\2\2\4\u0089\3\2\2\2\5\u008b\3\2\2\2\7\u009a\3\2\2\2\t\u00aa"+
		"\3\2\2\2\13\u00b5\3\2\2\2\r\u00b8\3\2\2\2\17\u00c8\3\2\2\2\21\u00d7\3"+
		"\2\2\2\23\u00de\3\2\2\2\25\u00e7\3\2\2\2\27\u00ed\3\2\2\2\31\u00f4\3\2"+
		"\2\2\33\u00fc\3\2\2\2\35\u0106\3\2\2\2\37\u010d\3\2\2\2!\u0115\3\2\2\2"+
		"#\u011d\3\2\2\2%\u0124\3\2\2\2\'\u012b\3\2\2\2)\u0131\3\2\2\2+\u0139\3"+
		"\2\2\2-\u013e\3\2\2\2/\u0140\3\2\2\2\61\u0143\3\2\2\2\63\u0145\3\2\2\2"+
		"\65\u0147\3\2\2\2\67\u0149\3\2\2\29\u014b\3\2\2\2;\u014e\3\2\2\2=\u0150"+
		"\3\2\2\2?\u0152\3\2\2\2A\u0154\3\2\2\2C\u0156\3\2\2\2E\u0158\3\2\2\2G"+
		"\u015a\3\2\2\2I\u015d\3\2\2\2K\u015f\3\2\2\2M\u0161\3\2\2\2O\u0163\3\2"+
		"\2\2Q\u0166\3\2\2\2S\u0168\3\2\2\2U\u016a\3\2\2\2W\u016c\3\2\2\2Y\u016e"+
		"\3\2\2\2[\u0177\3\2\2\2]\u0179\3\2\2\2_\u017c\3\2\2\2a\u0180\3\2\2\2c"+
		"\u018a\3\2\2\2e\u0192\3\2\2\2g\u0199\3\2\2\2i\u01a6\3\2\2\2k\u01a9\3\2"+
		"\2\2m\u01af\3\2\2\2o\u01d1\3\2\2\2q\u01d4\3\2\2\2s\u01de\3\2\2\2u\u01e8"+
		"\3\2\2\2w\u01ec\3\2\2\2y\u01f1\3\2\2\2{\u01f6\3\2\2\2}\u0208\3\2\2\2\177"+
		"\u020c\3\2\2\2\u0081\u0210\3\2\2\2\u0083\u0214\3\2\2\2\u0085\u021b\3\2"+
		"\2\2\u0087\u0221\3\2\2\2\u0089\u0225\3\2\2\2\u008b\u008c\7\61\2\2\u008c"+
		"\u008d\7,\2\2\u008d\u008e\7,\2\2\u008e\u0092\3\2\2\2\u008f\u0091\13\2"+
		"\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0093\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0093\u0098\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7,"+
		"\2\2\u0096\u0099\7\61\2\2\u0097\u0099\7\2\2\3\u0098\u0095\3\2\2\2\u0098"+
		"\u0097\3\2\2\2\u0099\6\3\2\2\2\u009a\u009b\7\61\2\2\u009b\u009c\7,\2\2"+
		"\u009c\u00a0\3\2\2\2\u009d\u009f\13\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a2"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a6\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\u00a4\7,\2\2\u00a4\u00a7\7\61\2\2\u00a5\u00a7\7\2"+
		"\2\3\u00a6\u00a3\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\b\3\2\2\u00a9\b\3\2\2\2\u00aa\u00ab\7\61\2\2\u00ab\u00ac\7\61\2"+
		"\2\u00ac\u00b0\3\2\2\2\u00ad\u00af\n\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00b4\b\4\2\2\u00b4\n\3\2\2\2\u00b5\u00b6\7]\2\2"+
		"\u00b6\u00b7\b\5\3\2\u00b7\f\3\2\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7"+
		"r\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be"+
		"\7p\2\2\u00be\u00bf\7u\2\2\u00bf\u00c3\3\2\2\2\u00c0\u00c2\t\3\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7}\2\2\u00c7"+
		"\16\3\2\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7m\2\2\u00cb"+
		"\u00cc\7g\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7u\2\2\u00ce\u00d2\3\2\2"+
		"\2\u00cf\u00d1\t\3\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d6\7}\2\2\u00d6\20\3\2\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7o\2\2\u00d9"+
		"\u00da\7r\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7v\2\2"+
		"\u00dd\22\3\2\2\2\u00de\u00df\7h\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7"+
		"c\2\2\u00e1\u00e2\7i\2\2\u00e2\u00e3\7o\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5"+
		"\7p\2\2\u00e5\u00e6\7v\2\2\u00e6\24\3\2\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9"+
		"\7g\2\2\u00e9\u00ea\7z\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7t\2\2\u00ec"+
		"\26\3\2\2\2\u00ed\u00ee\7r\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7t\2\2\u00f0"+
		"\u00f1\7u\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7t\2\2\u00f3\30\3\2\2\2\u00f4"+
		"\u00f5\7i\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7o\2\2"+
		"\u00f8\u00f9\7o\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7t\2\2\u00fb\32\3\2"+
		"\2\2\u00fc\u00fd\7r\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100"+
		"\7v\2\2\u0100\u0101\7g\2\2\u0101\u0102\7e\2\2\u0102\u0103\7v\2\2\u0103"+
		"\u0104\7g\2\2\u0104\u0105\7f\2\2\u0105\34\3\2\2\2\u0106\u0107\7r\2\2\u0107"+
		"\u0108\7w\2\2\u0108\u0109\7d\2\2\u0109\u010a\7n\2\2\u010a\u010b\7k\2\2"+
		"\u010b\u010c\7e\2\2\u010c\36\3\2\2\2\u010d\u010e\7r\2\2\u010e\u010f\7"+
		"t\2\2\u010f\u0110\7k\2\2\u0110\u0111\7x\2\2\u0111\u0112\7c\2\2\u0112\u0113"+
		"\7v\2\2\u0113\u0114\7g\2\2\u0114 \3\2\2\2\u0115\u0116\7t\2\2\u0116\u0117"+
		"\7g\2\2\u0117\u0118\7v\2\2\u0118\u0119\7w\2\2\u0119\u011a\7t\2\2\u011a"+
		"\u011b\7p\2\2\u011b\u011c\7u\2\2\u011c\"\3\2\2\2\u011d\u011e\7n\2\2\u011e"+
		"\u011f\7q\2\2\u011f\u0120\7e\2\2\u0120\u0121\7c\2\2\u0121\u0122\7n\2\2"+
		"\u0122\u0123\7u\2\2\u0123$\3\2\2\2\u0124\u0125\7v\2\2\u0125\u0126\7j\2"+
		"\2\u0126\u0127\7t\2\2\u0127\u0128\7q\2\2\u0128\u0129\7y\2\2\u0129\u012a"+
		"\7u\2\2\u012a&\3\2\2\2\u012b\u012c\7e\2\2\u012c\u012d\7c\2\2\u012d\u012e"+
		"\7v\2\2\u012e\u012f\7e\2\2\u012f\u0130\7j\2\2\u0130(\3\2\2\2\u0131\u0132"+
		"\7h\2\2\u0132\u0133\7k\2\2\u0133\u0134\7p\2\2\u0134\u0135\7c\2\2\u0135"+
		"\u0136\7n\2\2\u0136\u0137\7n\2\2\u0137\u0138\7{\2\2\u0138*\3\2\2\2\u0139"+
		"\u013a\7o\2\2\u013a\u013b\7q\2\2\u013b\u013c\7f\2\2\u013c\u013d\7g\2\2"+
		"\u013d,\3\2\2\2\u013e\u013f\7<\2\2\u013f.\3\2\2\2\u0140\u0141\7<\2\2\u0141"+
		"\u0142\7<\2\2\u0142\60\3\2\2\2\u0143\u0144\7.\2\2\u0144\62\3\2\2\2\u0145"+
		"\u0146\7=\2\2\u0146\64\3\2\2\2\u0147\u0148\7*\2\2\u0148\66\3\2\2\2\u0149"+
		"\u014a\7+\2\2\u014a8\3\2\2\2\u014b\u014c\7/\2\2\u014c\u014d\7@\2\2\u014d"+
		":\3\2\2\2\u014e\u014f\7>\2\2\u014f<\3\2\2\2\u0150\u0151\7@\2\2\u0151>"+
		"\3\2\2\2\u0152\u0153\7?\2\2\u0153@\3\2\2\2\u0154\u0155\7A\2\2\u0155B\3"+
		"\2\2\2\u0156\u0157\7,\2\2\u0157D\3\2\2\2\u0158\u0159\7-\2\2\u0159F\3\2"+
		"\2\2\u015a\u015b\7-\2\2\u015b\u015c\7?\2\2\u015cH\3\2\2\2\u015d\u015e"+
		"\7~\2\2\u015eJ\3\2\2\2\u015f\u0160\7&\2\2\u0160L\3\2\2\2\u0161\u0162\7"+
		"\60\2\2\u0162N\3\2\2\2\u0163\u0164\7\60\2\2\u0164\u0165\7\60\2\2\u0165"+
		"P\3\2\2\2\u0166\u0167\7B\2\2\u0167R\3\2\2\2\u0168\u0169\7%\2\2\u0169T"+
		"\3\2\2\2\u016a\u016b\7\u0080\2\2\u016bV\3\2\2\2\u016c\u016d\7\177\2\2"+
		"\u016dX\3\2\2\2\u016e\u0172\5].\2\u016f\u0171\5[-\2\u0170\u016f\3\2\2"+
		"\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173Z"+
		"\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0178\5].\2\u0176\u0178\t\4\2\2\u0177"+
		"\u0175\3\2\2\2\u0177\u0176\3\2\2\2\u0178\\\3\2\2\2\u0179\u017a\t\5\2\2"+
		"\u017a^\3\2\2\2\u017b\u017d\t\6\2\2\u017c\u017b\3\2\2\2\u017d\u017e\3"+
		"\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f`\3\2\2\2\u0180\u0185"+
		"\7)\2\2\u0181\u0184\5e\62\2\u0182\u0184\n\7\2\2\u0183\u0181\3\2\2\2\u0183"+
		"\u0182\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186\u0188\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u0189\7)\2\2\u0189"+
		"b\3\2\2\2\u018a\u018f\7)\2\2\u018b\u018e\5e\62\2\u018c\u018e\n\7\2\2\u018d"+
		"\u018b\3\2\2\2\u018d\u018c\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2"+
		"\2\2\u018f\u0190\3\2\2\2\u0190d\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0197"+
		"\7^\2\2\u0193\u0198\t\b\2\2\u0194\u0198\5g\63\2\u0195\u0198\13\2\2\2\u0196"+
		"\u0198\7\2\2\3\u0197\u0193\3\2\2\2\u0197\u0194\3\2\2\2\u0197\u0195\3\2"+
		"\2\2\u0197\u0196\3\2\2\2\u0198f\3\2\2\2\u0199\u01a4\7w\2\2\u019a\u01a2"+
		"\5i\64\2\u019b\u01a0\5i\64\2\u019c\u019e\5i\64\2\u019d\u019f\5i\64\2\u019e"+
		"\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u019c\3\2"+
		"\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u019b\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u019a\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5h\3\2\2\2\u01a6\u01a7\t\t\2\2\u01a7j\3\2\2\2\u01a8\u01aa\t\3"+
		"\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\b\65\2\2\u01ael\3\2\2\2"+
		"\u01af\u01cb\7}\2\2\u01b0\u01ca\5m\66\2\u01b1\u01ca\5o\67\2\u01b2\u01ca"+
		"\5q8\2\u01b3\u01ca\5s9\2\u01b4\u01b5\7\61\2\2\u01b5\u01b6\7,\2\2\u01b6"+
		"\u01ba\3\2\2\2\u01b7\u01b9\13\2\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc\3"+
		"\2\2\2\u01ba\u01bb\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc"+
		"\u01ba\3\2\2\2\u01bd\u01be\7,\2\2\u01be\u01ca\7\61\2\2\u01bf\u01c0\7\61"+
		"\2\2\u01c0\u01c1\7\61\2\2\u01c1\u01c5\3\2\2\2\u01c2\u01c4\n\2\2\2\u01c3"+
		"\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2"+
		"\2\2\u01c6\u01ca\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01ca\13\2\2\2\u01c9"+
		"\u01b0\3\2\2\2\u01c9\u01b1\3\2\2\2\u01c9\u01b2\3\2\2\2\u01c9\u01b3\3\2"+
		"\2\2\u01c9\u01b4\3\2\2\2\u01c9\u01bf\3\2\2\2\u01c9\u01c8\3\2\2\2\u01ca"+
		"\u01cd\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01cf\3\2"+
		"\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01d0\t\n\2\2\u01cf\u01ce\3\2\2\2\u01d0"+
		"n\3\2\2\2\u01d1\u01d2\7^\2\2\u01d2\u01d3\13\2\2\2\u01d3p\3\2\2\2\u01d4"+
		"\u01d9\7$\2\2\u01d5\u01d8\5o\67\2\u01d6\u01d8\n\13\2\2\u01d7\u01d5\3\2"+
		"\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01dd\7$"+
		"\2\2\u01ddr\3\2\2\2\u01de\u01e3\7)\2\2\u01df\u01e2\5o\67\2\u01e0\u01e2"+
		"\n\f\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e0\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3"+
		"\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e3\3\2"+
		"\2\2\u01e6\u01e7\7)\2\2\u01e7t\3\2\2\2\u01e8\u01e9\13\2\2\2\u01e9\u01ea"+
		"\3\2\2\2\u01ea\u01eb\b:\2\2\u01ebv\3\2\2\2\u01ec\u01ed\7]\2\2\u01ed\u01ee"+
		"\3\2\2\2\u01ee\u01ef\b;\4\2\u01ef\u01f0\b;\5\2\u01f0x\3\2\2\2\u01f1\u01f2"+
		"\7^\2\2\u01f2\u01f3\13\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\b<\4\2\u01f5"+
		"z\3\2\2\2\u01f6\u01fc\7$\2\2\u01f7\u01f8\7^\2\2\u01f8\u01fb\13\2\2\2\u01f9"+
		"\u01fb\n\13\2\2\u01fa\u01f7\3\2\2\2\u01fa\u01f9\3\2\2\2\u01fb\u01fe\3"+
		"\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\3\2\2\2\u01fe"+
		"\u01fc\3\2\2\2\u01ff\u0200\7$\2\2\u0200\u0201\3\2\2\2\u0201\u0202\b=\4"+
		"\2\u0202|\3\2\2\2\u0203\u0204\7$\2\2\u0204\u0205\7^\2\2\u0205\u0209\13"+
		"\2\2\2\u0206\u0207\n\13\2\2\u0207\u0209\7$\2\2\u0208\u0203\3\2\2\2\u0208"+
		"\u0206\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\b>\4\2\u020b~\3\2\2\2\u020c"+
		"\u020d\7_\2\2\u020d\u020e\3\2\2\2\u020e\u020f\b?\6\2\u020f\u0080\3\2\2"+
		"\2\u0210\u0211\7\2\2\3\u0211\u0212\3\2\2\2\u0212\u0213\b@\6\2\u0213\u0082"+
		"\3\2\2\2\u0214\u0215\13\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\bA\4\2\u0217"+
		"\u0084\3\2\2\2\u0218\u021c\n\r\2\2\u0219\u021a\7^\2\2\u021a\u021c\13\2"+
		"\2\2\u021b\u0218\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\bB"+
		"\4\2\u0220\u0086\3\2\2\2\u0221\u0222\7_\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0224\bC\6\2\u0224\u0088\3\2\2\2\u0225\u0226\7\2\2\3\u0226\u0227\3\2"+
		"\2\2\u0227\u0228\bD\6\2\u0228\u008a\3\2\2\2\'\2\3\4\u0092\u0098\u00a0"+
		"\u00a6\u00b0\u00c3\u00d2\u0172\u0177\u017e\u0183\u0185\u018d\u018f\u0197"+
		"\u019e\u01a0\u01a2\u01a4\u01ab\u01ba\u01c5\u01c9\u01cb\u01cf\u01d7\u01d9"+
		"\u01e1\u01e3\u01fa\u01fc\u0208\u021b\u021d\7\2\3\2\3\5\2\5\2\2\7\3\2\6"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}