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
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CrsxTermParser extends Parser {
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
	public static final int
		RULE_crsx = 0, RULE_decls = 1, RULE_decl = 2, RULE_moduleDecl = 3, RULE_importDecl = 4, 
		RULE_sortDecl = 5, RULE_sortVars = 6, RULE_sortDef = 7, RULE_fixity = 8, 
		RULE_variant = 9, RULE_variantArgs = 10, RULE_sortMap = 11, RULE_fnSortParams = 12, 
		RULE_sort = 13, RULE_sortScope = 14, RULE_paramSort = 15, RULE_sortParams = 16, 
		RULE_sorts = 17, RULE_ruleDecl = 18, RULE_fnDecl = 19, RULE_fnFixity = 20, 
		RULE_fnParamsDecl = 21, RULE_fnParams = 22, RULE_fnParam = 23, RULE_fnParamSort = 24, 
		RULE_terms = 25, RULE_term = 26, RULE_nterm = 27, RULE_aterm = 28, RULE_args = 29, 
		RULE_scopes = 30, RULE_scope = 31, RULE_binders = 32, RULE_apply = 33, 
		RULE_groupOrList = 34, RULE_variable = 35, RULE_literal = 36, RULE_concrete = 37, 
		RULE_dispatch = 38, RULE_dispatchCases = 39, RULE_map = 40, RULE_kvs = 41, 
		RULE_kv = 42, RULE_constructor = 43, RULE_symbols = 44;
	public static final String[] ruleNames = {
		"crsx", "decls", "decl", "moduleDecl", "importDecl", "sortDecl", "sortVars", 
		"sortDef", "fixity", "variant", "variantArgs", "sortMap", "fnSortParams", 
		"sort", "sortScope", "paramSort", "sortParams", "sorts", "ruleDecl", "fnDecl", 
		"fnFixity", "fnParamsDecl", "fnParams", "fnParam", "fnParamSort", "terms", 
		"term", "nterm", "aterm", "args", "scopes", "scope", "binders", "apply", 
		"groupOrList", "variable", "literal", "concrete", "dispatch", "dispatchCases", 
		"map", "kvs", "kv", "constructor", "symbols"
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

	@Override
	public String getGrammarFileName() { return "CrsxTerm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	protected String _prefix() { return "Crsx_"; }
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
	
	/** Fixity for each operator operator */
	Map<String, String> fixities = new HashMap<>();

	/** Precedence for each operator operator */
	Map<String, Integer> precedences = new HashMap<>();

	/** Get the next precedence for the give operator */
	public int nextp (String op) {
	String fixity = fixities.get(op);
	int p = precedences.get(op);

	if (fixity.equals("infixr"))  return p;
	if (fixity.equals("infixl"))  return p+1;
	if (fixity.equals("prefix"))  return p;
	if (fixity.equals("postfix")) return p+1;
	if (fixity.equals("infix"))   return p+1;
	return 0;
	}

	/** Add new symbol with given fixity and precedence */
	private void addOp(String op, String fixity, Integer precedence) {
			if (fixity != null)	{
				fixities.put(op,  fixity);
				precedences.put(op, precedence);
			}
	}

	private boolean isPrefix(String op) {
	return "prefix".equals(fixities.get(op));
	}

	private boolean isAnyInfix(String op, int currentp) {
	String fixity = fixities.get(op);
	return fixity != null && fixity.startsWith("infix") && precedences.get(op) >= currentp;
	}

	private boolean isPostfix(String op, int currentp) {
	return "postfix".equals(fixities.get(op)) && precedences.get(op) >= currentp;
	}

	{
	fixities.put("...", "postfix");
	precedences.put("...", 2);
	}

	public CrsxTermParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CrsxContext extends ParserRuleContext {
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CrsxTermParser.EOF, 0); }
		public CrsxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crsx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterCrsx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitCrsx(this);
		}
	}

	public final CrsxContext crsx() throws RecognitionException {
		CrsxContext _localctx = new CrsxContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_crsx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(91);
			decls();
			setState(92);
			match(EOF);
			_exitAlt();
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

	public static class DeclsContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitDecls(this);
		}
	}

	public final DeclsContext decls() throws RecognitionException {
		DeclsContext _localctx = new DeclsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULE) | (1L << IMPORT) | (1L << FN) | (1L << TYPE) | (1L << RULE))) != 0)) {
				{
				{
				setState(97);
				decl();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			_exitZOM();
			_exitAlt();
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

	public static class DeclContext extends ParserRuleContext {
		public ModuleDeclContext moduleDecl() {
			return getRuleContext(ModuleDeclContext.class,0);
		}
		public ImportDeclContext importDecl() {
			return getRuleContext(ImportDeclContext.class,0);
		}
		public SortDeclContext sortDecl() {
			return getRuleContext(SortDeclContext.class,0);
		}
		public RuleDeclContext ruleDecl() {
			return getRuleContext(RuleDeclContext.class,0);
		}
		public FnDeclContext fnDecl() {
			return getRuleContext(FnDeclContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(126);
			switch (_input.LA(1)) {
			case MODULE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(107);
				moduleDecl();
				_exitAlt();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(111);
				importDecl();
				_exitAlt();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(115);
				sortDecl();
				_exitAlt();
				}
				break;
			case RULE:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(119);
				ruleDecl();
				_exitAlt();
				}
				break;
			case FN:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				setState(123);
				fnDecl();
				_exitAlt();
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

	public static class ModuleDeclContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(CrsxTermParser.MODULE, 0); }
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public ModuleDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterModuleDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitModuleDecl(this);
		}
	}

	public final ModuleDeclContext moduleDecl() throws RecognitionException {
		ModuleDeclContext _localctx = new ModuleDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_moduleDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(130);
			match(MODULE);
			setState(131);
			constructor();
			_exitAlt();
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

	public static class ImportDeclContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(CrsxTermParser.IMPORT, 0); }
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public TerminalNode MODULE() { return getToken(CrsxTermParser.MODULE, 0); }
		public TerminalNode GRAMMAR() { return getToken(CrsxTermParser.GRAMMAR, 0); }
		public ImportDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterImportDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitImportDecl(this);
		}
	}

	public final ImportDeclContext importDecl() throws RecognitionException {
		ImportDeclContext _localctx = new ImportDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importDecl);
		try {
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_hide();
				setState(136);
				match(IMPORT);
				setState(137);
				constructor();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(142);
				match(IMPORT);
				_hide();
				setState(144);
				match(MODULE);
				setState(145);
				constructor();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				_hide();
				setState(150);
				match(IMPORT);
				_hide();
				setState(152);
				match(GRAMMAR);
				setState(153);
				constructor();
				_exitAlt();
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

	public static class SortDeclContext extends ParserRuleContext {
		public ConstructorContext c;
		public TerminalNode TYPE() { return getToken(CrsxTermParser.TYPE, 0); }
		public SortDefContext sortDef() {
			return getRuleContext(SortDefContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public SortVarsContext sortVars() {
			return getRuleContext(SortVarsContext.class,0);
		}
		public SortDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterSortDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitSortDecl(this);
		}
	}

	public final SortDeclContext sortDecl() throws RecognitionException {
		SortDeclContext _localctx = new SortDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sortDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(160);
			match(TYPE);
			setState(161);
			((SortDeclContext)_localctx).c = constructor();
			_enterOPT();
			setState(164);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(163);
				sortVars();
				}
			}

			_exitOPT();
			setState(167);
			sortDef((((SortDeclContext)_localctx).c!=null?_input.getText(((SortDeclContext)_localctx).c.start,((SortDeclContext)_localctx).c.stop):null));
			_exitAlt();
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

	public static class SortVarsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CrsxTermParser.LT, 0); }
		public TerminalNode GT() { return getToken(CrsxTermParser.GT, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public SortVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterSortVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitSortVars(this);
		}
	}

	public final SortVarsContext sortVars() throws RecognitionException {
		SortVarsContext _localctx = new SortVarsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sortVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(172);
			match(LT);
			_enterOOM();
			setState(175); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(174);
				variable();
				}
				}
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARIABLE );
			_exitOOM();
			_hide();
			setState(181);
			match(GT);
			_exitAlt();
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

	public static class SortDefContext extends ParserRuleContext {
		public String c;
		public List<TerminalNode> OR() { return getTokens(CrsxTermParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CrsxTermParser.OR, i);
		}
		public List<VariantContext> variant() {
			return getRuleContexts(VariantContext.class);
		}
		public VariantContext variant(int i) {
			return getRuleContext(VariantContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(CrsxTermParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CrsxTermParser.AND, i);
		}
		public List<SortMapContext> sortMap() {
			return getRuleContexts(SortMapContext.class);
		}
		public SortMapContext sortMap(int i) {
			return getRuleContext(SortMapContext.class,i);
		}
		public TerminalNode FN() { return getToken(CrsxTermParser.FN, 0); }
		public TerminalNode LPAR() { return getToken(CrsxTermParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CrsxTermParser.RPAR, 0); }
		public TerminalNode ARROW() { return getToken(CrsxTermParser.ARROW, 0); }
		public ParamSortContext paramSort() {
			return getRuleContext(ParamSortContext.class,0);
		}
		public FixityContext fixity() {
			return getRuleContext(FixityContext.class,0);
		}
		public FnSortParamsContext fnSortParams() {
			return getRuleContext(FnSortParamsContext.class,0);
		}
		public SortDefContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SortDefContext(ParserRuleContext parent, int invokingState, String c) {
			super(parent, invokingState);
			this.c = c;
		}
		@Override public int getRuleIndex() { return RULE_sortDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterSortDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitSortDef(this);
		}
	}

	public final SortDefContext sortDef(String c) throws RecognitionException {
		SortDefContext _localctx = new SortDefContext(_ctx, getState(), c);
		enterRule(_localctx, 14, RULE_sortDef);
		int _la;
		try {
			setState(230);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_enterOOM();
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					_hide();
					setState(187);
					match(OR);
					setState(188);
					variant();
					}
					}
					setState(191); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OR );
				_exitOOM();
				_exitAlt();
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_enterOOM();
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					_hide();
					setState(199);
					match(AND);
					setState(200);
					sortMap();
					}
					}
					setState(203); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==AND );
				_exitOOM();
				_exitAlt();
				}
				break;
			case FN:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				_hide();
				setState(210);
				match(FN);
				_enterOPT();
				setState(213);
				_la = _input.LA(1);
				if (_la==FIXITY) {
					{
					setState(212);
					fixity(c);
					}
				}

				_exitOPT();
				_hide();
				setState(217);
				match(LPAR);
				_enterOPT();
				setState(220);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << COLON) | (1L << OR) | (1L << AND) | (1L << LSQUARE) | (1L << CONSTRUCTOR) | (1L << VARIABLE))) != 0)) {
					{
					setState(219);
					fnSortParams();
					}
				}

				_exitOPT();
				_hide();
				setState(224);
				match(RPAR);
				_hide();
				setState(226);
				match(ARROW);
				setState(227);
				paramSort();
				_exitAlt();
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

	public static class FixityContext extends ParserRuleContext {
		public String c;
		public Token f;
		public Token p;
		public TerminalNode FIXITY() { return getToken(CrsxTermParser.FIXITY, 0); }
		public TerminalNode NUMBER() { return getToken(CrsxTermParser.NUMBER, 0); }
		public FixityContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FixityContext(ParserRuleContext parent, int invokingState, String c) {
			super(parent, invokingState);
			this.c = c;
		}
		@Override public int getRuleIndex() { return RULE_fixity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterFixity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitFixity(this);
		}
	}

	public final FixityContext fixity(String c) throws RecognitionException {
		FixityContext _localctx = new FixityContext(_ctx, getState(), c);
		enterRule(_localctx, 16, RULE_fixity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(233);
			((FixityContext)_localctx).f = match(FIXITY);
			setState(234);
			((FixityContext)_localctx).p = match(NUMBER);
			 addOp(_localctx.c, (((FixityContext)_localctx).f!=null?((FixityContext)_localctx).f.getText():null), (((FixityContext)_localctx).p!=null?Integer.valueOf(((FixityContext)_localctx).p.getText()):0)); 
			_exitAlt();
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

	public static class VariantContext extends ParserRuleContext {
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public VariantArgsContext variantArgs() {
			return getRuleContext(VariantArgsContext.class,0);
		}
		public TerminalNode VAR() { return getToken(CrsxTermParser.VAR, 0); }
		public VariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterVariant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitVariant(this);
		}
	}

	public final VariantContext variant() throws RecognitionException {
		VariantContext _localctx = new VariantContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variant);
		int _la;
		try {
			setState(251);
			switch (_input.LA(1)) {
			case LT:
			case GT:
			case COLON:
			case OR:
			case AND:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(239);
				constructor();
				_enterOPT();
				setState(242);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(241);
					variantArgs();
					}
				}

				_exitOPT();
				_exitAlt();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(249);
				match(VAR);
				_exitAlt();
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

	public static class VariantArgsContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(CrsxTermParser.LPAR, 0); }
		public SortsContext sorts() {
			return getRuleContext(SortsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CrsxTermParser.RPAR, 0); }
		public VariantArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variantArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterVariantArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitVariantArgs(this);
		}
	}

	public final VariantArgsContext variantArgs() throws RecognitionException {
		VariantArgsContext _localctx = new VariantArgsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variantArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(255);
			match(LPAR);
			setState(256);
			sorts();
			_hide();
			setState(258);
			match(RPAR);
			_exitAlt();
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

	public static class SortMapContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CrsxTermParser.STRING, 0); }
		public TerminalNode COLON() { return getToken(CrsxTermParser.COLON, 0); }
		public List<SortContext> sort() {
			return getRuleContexts(SortContext.class);
		}
		public SortContext sort(int i) {
			return getRuleContext(SortContext.class,i);
		}
		public SortMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortMap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterSortMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitSortMap(this);
		}
	}

	public final SortMapContext sortMap() throws RecognitionException {
		SortMapContext _localctx = new SortMapContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sortMap);
		try {
			setState(275);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(262);
				match(STRING);
				_hide();
				setState(264);
				match(COLON);
				setState(265);
				sort();
				_exitAlt();
				}
				break;
			case LT:
			case GT:
			case COLON:
			case OR:
			case AND:
			case LSQUARE:
			case CONSTRUCTOR:
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(269);
				sort();
				_hide();
				setState(271);
				match(COLON);
				setState(272);
				sort();
				_exitAlt();
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

	public static class FnSortParamsContext extends ParserRuleContext {
		public List<SortContext> sort() {
			return getRuleContexts(SortContext.class);
		}
		public SortContext sort(int i) {
			return getRuleContext(SortContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CrsxTermParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CrsxTermParser.COMMA, i);
		}
		public FnSortParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnSortParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterFnSortParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitFnSortParams(this);
		}
	}

	public final FnSortParamsContext fnSortParams() throws RecognitionException {
		FnSortParamsContext _localctx = new FnSortParamsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fnSortParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(279);
			sort();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				_hide();
				setState(281);
				match(COMMA);
				setState(282);
				sort();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			_exitZOM();
			_exitAlt();
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

	public static class SortContext extends ParserRuleContext {
		public ParamSortContext paramSort() {
			return getRuleContext(ParamSortContext.class,0);
		}
		public SortScopeContext sortScope() {
			return getRuleContext(SortScopeContext.class,0);
		}
		public SortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitSort(this);
		}
	}

	public final SortContext sort() throws RecognitionException {
		SortContext _localctx = new SortContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sort);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterOPT();
			setState(294);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(293);
				sortScope();
				}
			}

			_exitOPT();
			setState(297);
			paramSort();
			_exitAlt();
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

	public static class SortScopeContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(CrsxTermParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(CrsxTermParser.RSQUARE, 0); }
		public TerminalNode FNTYPE() { return getToken(CrsxTermParser.FNTYPE, 0); }
		public List<SortContext> sort() {
			return getRuleContexts(SortContext.class);
		}
		public SortContext sort(int i) {
			return getRuleContext(SortContext.class,i);
		}
		public SortScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterSortScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitSortScope(this);
		}
	}

	public final SortScopeContext sortScope() throws RecognitionException {
		SortScopeContext _localctx = new SortScopeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sortScope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(302);
			match(LSQUARE);
			_enterOOM();
			setState(305); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(304);
				sort();
				}
				}
				setState(307); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << COLON) | (1L << OR) | (1L << AND) | (1L << LSQUARE) | (1L << CONSTRUCTOR) | (1L << VARIABLE))) != 0) );
			_exitOOM();
			_hide();
			setState(311);
			match(RSQUARE);
			_hide();
			setState(313);
			match(FNTYPE);
			_exitAlt();
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

	public static class ParamSortContext extends ParserRuleContext {
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public SortParamsContext sortParams() {
			return getRuleContext(SortParamsContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ParamSortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramSort; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterParamSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitParamSort(this);
		}
	}

	public final ParamSortContext paramSort() throws RecognitionException {
		ParamSortContext _localctx = new ParamSortContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_paramSort);
		try {
			setState(329);
			switch (_input.LA(1)) {
			case LT:
			case GT:
			case COLON:
			case OR:
			case AND:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(317);
				constructor();
				_enterOPT();
				setState(320);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(319);
					sortParams();
					}
					break;
				}
				_exitOPT();
				_exitAlt();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(326);
				variable();
				_exitAlt();
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

	public static class SortParamsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CrsxTermParser.LT, 0); }
		public TerminalNode GT() { return getToken(CrsxTermParser.GT, 0); }
		public List<ParamSortContext> paramSort() {
			return getRuleContexts(ParamSortContext.class);
		}
		public ParamSortContext paramSort(int i) {
			return getRuleContext(ParamSortContext.class,i);
		}
		public SortParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterSortParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitSortParams(this);
		}
	}

	public final SortParamsContext sortParams() throws RecognitionException {
		SortParamsContext _localctx = new SortParamsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sortParams);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(333);
			match(LT);
			_enterOOM();
			setState(336); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(335);
					paramSort();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(338); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			_exitOOM();
			_hide();
			setState(342);
			match(GT);
			_exitAlt();
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

	public static class SortsContext extends ParserRuleContext {
		public SortContext sort() {
			return getRuleContext(SortContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(CrsxTermParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CrsxTermParser.COMMA, i);
		}
		public List<SortsContext> sorts() {
			return getRuleContexts(SortsContext.class);
		}
		public SortsContext sorts(int i) {
			return getRuleContext(SortsContext.class,i);
		}
		public SortsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sorts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterSorts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitSorts(this);
		}
	}

	public final SortsContext sorts() throws RecognitionException {
		SortsContext _localctx = new SortsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sorts);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(346);
			sort();
			_enterZOM();
			setState(353);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					_hide();
					setState(349);
					match(COMMA);
					setState(350);
					sorts();
					}
					} 
				}
				setState(355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			_exitZOM();
			_exitAlt();
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

	public static class RuleDeclContext extends ParserRuleContext {
		public TerminalNode RULE() { return getToken(CrsxTermParser.RULE, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(CrsxTermParser.ARROW, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public RuleDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterRuleDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitRuleDecl(this);
		}
	}

	public final RuleDeclContext ruleDecl() throws RecognitionException {
		RuleDeclContext _localctx = new RuleDeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ruleDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(361);
			match(RULE);
			setState(362);
			term(0);
			_hide();
			setState(364);
			match(ARROW);
			setState(365);
			terms();
			_exitAlt();
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

	public static class FnDeclContext extends ParserRuleContext {
		public TerminalNode FN() { return getToken(CrsxTermParser.FN, 0); }
		public FnFixityContext fnFixity() {
			return getRuleContext(FnFixityContext.class,0);
		}
		public TerminalNode FNTYPE() { return getToken(CrsxTermParser.FNTYPE, 0); }
		public SortContext sort() {
			return getRuleContext(SortContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(CrsxTermParser.ARROW, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public SortParamsContext sortParams() {
			return getRuleContext(SortParamsContext.class,0);
		}
		public FnParamsDeclContext fnParamsDecl() {
			return getRuleContext(FnParamsDeclContext.class,0);
		}
		public FnDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterFnDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitFnDecl(this);
		}
	}

	public final FnDeclContext fnDecl() throws RecognitionException {
		FnDeclContext _localctx = new FnDeclContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fnDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(370);
			match(FN);
			setState(371);
			fnFixity();
			_enterOPT();
			setState(374);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(373);
				sortParams();
				}
			}

			_exitOPT();
			_enterOPT();
			setState(379);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(378);
				fnParamsDecl();
				}
			}

			_exitOPT();
			_hide();
			setState(383);
			match(FNTYPE);
			setState(384);
			sort();
			_hide();
			setState(386);
			match(ARROW);
			setState(387);
			terms();
			_exitAlt();
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

	public static class FnFixityContext extends ParserRuleContext {
		public Token f;
		public Token p;
		public ConstructorContext c;
		public TerminalNode FIXITY() { return getToken(CrsxTermParser.FIXITY, 0); }
		public TerminalNode NUMBER() { return getToken(CrsxTermParser.NUMBER, 0); }
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public FnFixityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnFixity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterFnFixity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitFnFixity(this);
		}
	}

	public final FnFixityContext fnFixity() throws RecognitionException {
		FnFixityContext _localctx = new FnFixityContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fnFixity);
		try {
			setState(401);
			switch (_input.LA(1)) {
			case FIXITY:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(391);
				((FnFixityContext)_localctx).f = match(FIXITY);
				setState(392);
				((FnFixityContext)_localctx).p = match(NUMBER);
				setState(393);
				((FnFixityContext)_localctx).c = constructor();
				 addOp((((FnFixityContext)_localctx).c!=null?_input.getText(((FnFixityContext)_localctx).c.start,((FnFixityContext)_localctx).c.stop):null), (((FnFixityContext)_localctx).f!=null?((FnFixityContext)_localctx).f.getText():null), (((FnFixityContext)_localctx).p!=null?Integer.valueOf(((FnFixityContext)_localctx).p.getText()):0)); 
				_exitAlt();
				}
				break;
			case LT:
			case GT:
			case COLON:
			case OR:
			case AND:
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(398);
				((FnFixityContext)_localctx).c = constructor();
				_exitAlt();
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

	public static class FnParamsDeclContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(CrsxTermParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CrsxTermParser.RPAR, 0); }
		public FnParamsContext fnParams() {
			return getRuleContext(FnParamsContext.class,0);
		}
		public FnParamsDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnParamsDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterFnParamsDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitFnParamsDecl(this);
		}
	}

	public final FnParamsDeclContext fnParamsDecl() throws RecognitionException {
		FnParamsDeclContext _localctx = new FnParamsDeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fnParamsDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(405);
			match(LPAR);
			_enterOPT();
			setState(408);
			_la = _input.LA(1);
			if (_la==METAVAR) {
				{
				setState(407);
				fnParams();
				}
			}

			_exitOPT();
			_hide();
			setState(412);
			match(RPAR);
			_exitAlt();
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

	public static class FnParamsContext extends ParserRuleContext {
		public List<FnParamContext> fnParam() {
			return getRuleContexts(FnParamContext.class);
		}
		public FnParamContext fnParam(int i) {
			return getRuleContext(FnParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CrsxTermParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CrsxTermParser.COMMA, i);
		}
		public FnParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterFnParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitFnParams(this);
		}
	}

	public final FnParamsContext fnParams() throws RecognitionException {
		FnParamsContext _localctx = new FnParamsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fnParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(417);
			fnParam();
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				_hide();
				setState(419);
				match(COMMA);
				setState(420);
				fnParam();
				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			_exitZOM();
			_exitAlt();
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

	public static class FnParamContext extends ParserRuleContext {
		public TerminalNode METAVAR() { return getToken(CrsxTermParser.METAVAR, 0); }
		public FnParamSortContext fnParamSort() {
			return getRuleContext(FnParamSortContext.class,0);
		}
		public FnParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterFnParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitFnParam(this);
		}
	}

	public final FnParamContext fnParam() throws RecognitionException {
		FnParamContext _localctx = new FnParamContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fnParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(430);
			match(METAVAR);
			_enterOPT();
			setState(433);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(432);
				fnParamSort();
				}
			}

			_exitOPT();
			_exitAlt();
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

	public static class FnParamSortContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(CrsxTermParser.COLON, 0); }
		public SortContext sort() {
			return getRuleContext(SortContext.class,0);
		}
		public FnParamSortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnParamSort; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterFnParamSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitFnParamSort(this);
		}
	}

	public final FnParamSortContext fnParamSort() throws RecognitionException {
		FnParamSortContext _localctx = new FnParamSortContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fnParamSort);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(440);
			match(COLON);
			setState(441);
			sort();
			_exitAlt();
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

	public static class TermsContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CrsxTermParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CrsxTermParser.COMMA, i);
		}
		public TermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitTerms(this);
		}
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(446);
			term(0);
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				_hide();
				setState(448);
				match(COMMA);
				setState(449);
				term(0);
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			_exitZOM();
			_exitAlt();
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

	public static class TermContext extends ParserRuleContext {
		public int p;
		public AtermContext aterm() {
			return getRuleContext(AtermContext.class,0);
		}
		public List<NtermContext> nterm() {
			return getRuleContexts(NtermContext.class);
		}
		public NtermContext nterm(int i) {
			return getRuleContext(NtermContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TermContext(ParserRuleContext parent, int invokingState, int p) {
			super(parent, invokingState);
			this.p = p;
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitTerm(this);
		}
	}

	public final TermContext term(int p) throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState(), p);
		enterRule(_localctx, 52, RULE_term);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(459);
			aterm();
			_enterZOM();
			setState(464);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(461);
					nterm(p);
					}
					} 
				}
				setState(466);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			_exitZOM();
			_exitAlt();
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

	public static class NtermContext extends ParserRuleContext {
		public int p;
		public ConstructorContext op;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public NtermContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NtermContext(ParserRuleContext parent, int invokingState, int p) {
			super(parent, invokingState);
			this.p = p;
		}
		@Override public int getRuleIndex() { return RULE_nterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterNterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitNterm(this);
		}
	}

	public final NtermContext nterm(int p) throws RecognitionException {
		NtermContext _localctx = new NtermContext(_ctx, getState(), p);
		enterRule(_localctx, 54, RULE_nterm);
		try {
			setState(482);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(471);
				if (!(isAnyInfix(_input.LT(1).getText(), _localctx.p))) throw new FailedPredicateException(this, "isAnyInfix(_input.LT(1).getText(), $p)");
				setState(472);
				((NtermContext)_localctx).op = constructor();
				setState(473);
				term(nextp((((NtermContext)_localctx).op!=null?_input.getText(((NtermContext)_localctx).op.start,((NtermContext)_localctx).op.stop):null)));
				setState(474);
				if (!(!"infix".equals(fixities.get((((NtermContext)_localctx).op!=null?_input.getText(((NtermContext)_localctx).op.start,((NtermContext)_localctx).op.stop):null))))) throw new FailedPredicateException(this, "!\"infix\".equals(fixities.get($op.text))");
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(478);
				if (!(isPostfix(_input.LT(1).getText(), _localctx.p))) throw new FailedPredicateException(this, "isPostfix(_input.LT(1).getText(), $p)");
				setState(479);
				constructor();
				_exitAlt();
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

	public static class AtermContext extends ParserRuleContext {
		public ConstructorContext op;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public GroupOrListContext groupOrList() {
			return getRuleContext(GroupOrListContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public TerminalNode METAVAR() { return getToken(CrsxTermParser.METAVAR, 0); }
		public ApplyContext apply() {
			return getRuleContext(ApplyContext.class,0);
		}
		public DispatchContext dispatch() {
			return getRuleContext(DispatchContext.class,0);
		}
		public ConcreteContext concrete() {
			return getRuleContext(ConcreteContext.class,0);
		}
		public AtermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterAterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitAterm(this);
		}
	}

	public final AtermContext aterm() throws RecognitionException {
		AtermContext _localctx = new AtermContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_aterm);
		try {
			setState(532);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(485);
				if (!(isPrefix(_input.LT(1).getText()))) throw new FailedPredicateException(this, "isPrefix(_input.LT(1).getText())");
				setState(486);
				((AtermContext)_localctx).op = constructor();
				setState(487);
				term(nextp((((AtermContext)_localctx).op!=null?_input.getText(((AtermContext)_localctx).op.start,((AtermContext)_localctx).op.stop):null)));
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(491);
				if (!(!isPrefix(_input.LT(1).getText()))) throw new FailedPredicateException(this, "!isPrefix(_input.LT(1).getText())");
				setState(492);
				constructor();
				_enterOPT();
				setState(495);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(494);
					args();
					}
					break;
				}
				_exitOPT();
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(501);
				literal();
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(505);
				groupOrList();
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				setState(509);
				variable();
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_enterAlt("6");
				setState(513);
				map();
				_exitAlt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				_enterAlt("7");
				setState(517);
				match(METAVAR);
				_enterOPT();
				setState(520);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(519);
					apply();
					}
					break;
				}
				_exitOPT();
				_exitAlt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				_enterAlt("8");
				setState(525);
				dispatch();
				_exitAlt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				_enterAlt("9");
				setState(529);
				concrete();
				_exitAlt();
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

	public static class ArgsContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(CrsxTermParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CrsxTermParser.RPAR, 0); }
		public ScopesContext scopes() {
			return getRuleContext(ScopesContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(536);
			match(LPAR);
			_enterOPT();
			setState(539);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(538);
				scopes();
				}
				break;
			}
			_exitOPT();
			_hide();
			setState(543);
			match(RPAR);
			_exitAlt();
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

	public static class ScopesContext extends ParserRuleContext {
		public List<ScopeContext> scope() {
			return getRuleContexts(ScopeContext.class);
		}
		public ScopeContext scope(int i) {
			return getRuleContext(ScopeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CrsxTermParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CrsxTermParser.COMMA, i);
		}
		public ScopesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterScopes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitScopes(this);
		}
	}

	public final ScopesContext scopes() throws RecognitionException {
		ScopesContext _localctx = new ScopesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_scopes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(548);
			scope();
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				_hide();
				setState(550);
				match(COMMA);
				setState(551);
				scope();
				}
				}
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			_exitZOM();
			_exitAlt();
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

	public static class ScopeContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(CrsxTermParser.LSQUARE, 0); }
		public BindersContext binders() {
			return getRuleContext(BindersContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitScope(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_scope);
		try {
			setState(570);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_hide();
				setState(562);
				match(LSQUARE);
				setState(563);
				binders();
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(567);
				term(0);
				_exitAlt();
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

	public static class BindersContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(CrsxTermParser.VARIABLE, 0); }
		public BindersContext binders() {
			return getRuleContext(BindersContext.class,0);
		}
		public TerminalNode LINEAR() { return getToken(CrsxTermParser.LINEAR, 0); }
		public TerminalNode RSQUARE() { return getToken(CrsxTermParser.RSQUARE, 0); }
		public TerminalNode FNTYPE() { return getToken(CrsxTermParser.FNTYPE, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public BindersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binders; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterBinders(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitBinders(this);
		}
	}

	public final BindersContext binders() throws RecognitionException {
		BindersContext _localctx = new BindersContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_binders);
		int _la;
		try {
			setState(594);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_enterBinder("x");
				setState(574);
				match(VARIABLE);
				_exitBinder();
				_enterOPT();
				setState(578);
				_la = _input.LA(1);
				if (_la==LINEAR) {
					{
					setState(577);
					match(LINEAR);
					}
				}

				_exitOPT();
				_enterBinds(" x");
				setState(582);
				binders();
				_exitBinds();
				_exitAlt();
				}
				break;
			case RSQUARE:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(588);
				match(RSQUARE);
				_hide();
				setState(590);
				match(FNTYPE);
				setState(591);
				term(0);
				_exitAlt();
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

	public static class ApplyContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(CrsxTermParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CrsxTermParser.RPAR, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public ApplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apply; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterApply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitApply(this);
		}
	}

	public final ApplyContext apply() throws RecognitionException {
		ApplyContext _localctx = new ApplyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_apply);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(598);
			match(LPAR);
			_enterOPT();
			setState(601);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(600);
				terms();
				}
				break;
			}
			_exitOPT();
			_hide();
			setState(605);
			match(RPAR);
			_exitAlt();
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

	public static class GroupOrListContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(CrsxTermParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CrsxTermParser.RPAR, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CrsxTermParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CrsxTermParser.COMMA, i);
		}
		public GroupOrListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupOrList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterGroupOrList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitGroupOrList(this);
		}
	}

	public final GroupOrListContext groupOrList() throws RecognitionException {
		GroupOrListContext _localctx = new GroupOrListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_groupOrList);
		int _la;
		try {
			setState(649);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_hide();
				setState(610);
				match(LPAR);
				_hide();
				setState(612);
				match(RPAR);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(616);
				match(LPAR);
				setState(617);
				term(0);
				_hide();
				setState(619);
				match(RPAR);
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				_hide();
				setState(624);
				match(LPAR);
				setState(625);
				term(0);
				_hide();
				setState(627);
				match(COMMA);
				_hide();
				setState(629);
				match(RPAR);
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				_hide();
				setState(634);
				match(LPAR);
				_enterOOM();
				setState(636);
				term(0);
				setState(640); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					_hide();
					setState(638);
					match(COMMA);
					setState(639);
					term(0);
					}
					}
					setState(642); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				_exitOOM();
				_hide();
				setState(646);
				match(RPAR);
				_exitAlt();
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(CrsxTermParser.VARIABLE, 0); }
		public TerminalNode LINEAR() { return getToken(CrsxTermParser.LINEAR, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterSymbol();
			setState(653);
			match(VARIABLE);
			_exitSymbol();
			_enterOPT();
			setState(657);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(656);
				match(LINEAR);
				}
				break;
			}
			_exitOPT();
			_exitAlt();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CrsxTermParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(CrsxTermParser.NUMBER, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_literal);
		try {
			setState(668);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(663);
				match(STRING);
				_exitAlt();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(666);
				match(NUMBER);
				_exitAlt();
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

	public static class ConcreteContext extends ParserRuleContext {
		public TerminalNode CONCRETE() { return getToken(CrsxTermParser.CONCRETE, 0); }
		public ConcreteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concrete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterConcrete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitConcrete(this);
		}
	}

	public final ConcreteContext concrete() throws RecognitionException {
		ConcreteContext _localctx = new ConcreteContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_concrete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			setState(671);
			match(CONCRETE);
			_exitAlt();
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

	public static class DispatchContext extends ParserRuleContext {
		public TerminalNode DISPATCH() { return getToken(CrsxTermParser.DISPATCH, 0); }
		public TerminalNode LPAR() { return getToken(CrsxTermParser.LPAR, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CrsxTermParser.RPAR, 0); }
		public DispatchCasesContext dispatchCases() {
			return getRuleContext(DispatchCasesContext.class,0);
		}
		public DispatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterDispatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitDispatch(this);
		}
	}

	public final DispatchContext dispatch() throws RecognitionException {
		DispatchContext _localctx = new DispatchContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_dispatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(676);
			match(DISPATCH);
			_hide();
			setState(678);
			match(LPAR);
			setState(679);
			terms();
			_hide();
			setState(681);
			match(RPAR);
			setState(682);
			dispatchCases();
			_exitAlt();
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

	public static class DispatchCasesContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(CrsxTermParser.OR, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(CrsxTermParser.ARROW, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CrsxTermParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CrsxTermParser.COMMA, i);
		}
		public List<DispatchCasesContext> dispatchCases() {
			return getRuleContexts(DispatchCasesContext.class);
		}
		public DispatchCasesContext dispatchCases(int i) {
			return getRuleContext(DispatchCasesContext.class,i);
		}
		public DispatchCasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatchCases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterDispatchCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitDispatchCases(this);
		}
	}

	public final DispatchCasesContext dispatchCases() throws RecognitionException {
		DispatchCasesContext _localctx = new DispatchCasesContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dispatchCases);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(687);
			match(OR);
			setState(688);
			term(0);
			_hide();
			setState(690);
			match(ARROW);
			setState(691);
			term(0);
			_enterZOM();
			setState(698);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					_hide();
					setState(694);
					match(COMMA);
					setState(695);
					dispatchCases();
					}
					} 
				}
				setState(700);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			_exitZOM();
			_exitAlt();
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

	public static class MapContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(CrsxTermParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(CrsxTermParser.RCURLY, 0); }
		public KvsContext kvs() {
			return getRuleContext(KvsContext.class,0);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitMap(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_hide();
			setState(706);
			match(LCURLY);
			_enterOPT();
			setState(709);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << VARIABLE) | (1L << METAVAR) | (1L << STRING))) != 0)) {
				{
				setState(708);
				kvs();
				}
			}

			_exitOPT();
			_hide();
			setState(713);
			match(RCURLY);
			_exitAlt();
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

	public static class KvsContext extends ParserRuleContext {
		public List<KvContext> kv() {
			return getRuleContexts(KvContext.class);
		}
		public KvContext kv(int i) {
			return getRuleContext(KvContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CrsxTermParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CrsxTermParser.COMMA, i);
		}
		public KvsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kvs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterKvs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitKvs(this);
		}
	}

	public final KvsContext kvs() throws RecognitionException {
		KvsContext _localctx = new KvsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_kvs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_enterAlt();
			_enterZOM();
			setState(718);
			kv();
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				_hide();
				setState(720);
				match(COMMA);
				setState(721);
				kv();
				}
				}
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			_exitZOM();
			_exitAlt();
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

	public static class KvContext extends ParserRuleContext {
		public TerminalNode METAVAR() { return getToken(CrsxTermParser.METAVAR, 0); }
		public TerminalNode NOT() { return getToken(CrsxTermParser.NOT, 0); }
		public TerminalNode COLON() { return getToken(CrsxTermParser.COLON, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(CrsxTermParser.VARIABLE, 0); }
		public TerminalNode STRING() { return getToken(CrsxTermParser.STRING, 0); }
		public KvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterKv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitKv(this);
		}
	}

	public final KvContext kv() throws RecognitionException {
		KvContext _localctx = new KvContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_kv);
		try {
			setState(775);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(731);
				match(METAVAR);
				_exitAlt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(735);
				match(NOT);
				setState(736);
				match(METAVAR);
				_exitAlt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				setState(739);
				match(METAVAR);
				_hide();
				setState(741);
				match(COLON);
				setState(742);
				term(0);
				_exitAlt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				setState(746);
				match(VARIABLE);
				_exitAlt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				_hide();
				setState(750);
				match(NOT);
				setState(751);
				match(VARIABLE);
				_exitAlt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				_enterAlt("6");
				setState(754);
				match(VARIABLE);
				_hide();
				setState(756);
				match(COLON);
				setState(757);
				term(0);
				_exitAlt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				_enterAlt("7");
				setState(761);
				match(STRING);
				_exitAlt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				_enterAlt("8");
				_hide();
				setState(765);
				match(NOT);
				setState(766);
				match(STRING);
				_exitAlt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				_enterAlt("9");
				setState(769);
				match(STRING);
				_hide();
				setState(771);
				match(COLON);
				setState(772);
				term(0);
				_exitAlt();
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

	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(CrsxTermParser.CONSTRUCTOR, 0); }
		public SymbolsContext symbols() {
			return getRuleContext(SymbolsContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitConstructor(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_constructor);
		try {
			setState(784);
			switch (_input.LA(1)) {
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				setState(778);
				match(CONSTRUCTOR);
				_exitAlt();
				}
				break;
			case LT:
			case GT:
			case COLON:
			case OR:
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				setState(781);
				symbols();
				_exitAlt();
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

	public static class SymbolsContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(CrsxTermParser.COLON, 0); }
		public TerminalNode LT() { return getToken(CrsxTermParser.LT, 0); }
		public TerminalNode GT() { return getToken(CrsxTermParser.GT, 0); }
		public TerminalNode OR() { return getToken(CrsxTermParser.OR, 0); }
		public TerminalNode AND() { return getToken(CrsxTermParser.AND, 0); }
		public SymbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).enterSymbols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CrsxTermListener ) ((CrsxTermListener)listener).exitSymbols(this);
		}
	}

	public final SymbolsContext symbols() throws RecognitionException {
		SymbolsContext _localctx = new SymbolsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_symbols);
		try {
			setState(806);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				_enterAlt("1");
				_hide();
				setState(788);
				match(COLON);
				_exitAlt();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				_enterAlt("2");
				_hide();
				setState(792);
				match(LT);
				_exitAlt();
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 3);
				{
				_enterAlt("3");
				_hide();
				setState(796);
				match(GT);
				_exitAlt();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 4);
				{
				_enterAlt("4");
				_hide();
				setState(800);
				match(OR);
				_exitAlt();
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 5);
				{
				_enterAlt("5");
				_hide();
				setState(804);
				match(AND);
				_exitAlt();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 27:
			return nterm_sempred((NtermContext)_localctx, predIndex);
		case 28:
			return aterm_sempred((AtermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean nterm_sempred(NtermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return isAnyInfix(_input.LT(1).getText(), _localctx.p);
		case 1:
			return !"infix".equals(fixities.get((((NtermContext)_localctx).op!=null?_input.getText(((NtermContext)_localctx).op.start,((NtermContext)_localctx).op.stop):null)));
		case 2:
			return isPostfix(_input.LT(1).getText(), _localctx.p);
		}
		return true;
	}
	private boolean aterm_sempred(AtermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return isPrefix(_input.LT(1).getText());
		case 4:
			return !isPrefix(_input.LT(1).getText());
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u032b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3e\n\3\f\3\16\3h\13"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0081\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u009f\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a7\n\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\6\b\u00b2\n\b\r\b\16\b\u00b3\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\6\t\u00c0\n\t\r\t\16\t\u00c1\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\6\t\u00cc\n\t\r\t\16\t\u00cd\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00d8\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u00df\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e9\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\5\13\u00f5\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00fe"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0116\n\r\3\16\3\16\3\16\3\16\3\16\3\16\7"+
		"\16\u011e\n\16\f\16\16\16\u0121\13\16\3\16\3\16\3\16\3\17\3\17\3\17\5"+
		"\17\u0129\n\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\6\20\u0134"+
		"\n\20\r\20\16\20\u0135\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\5\21\u0143\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u014c"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\6\22\u0153\n\22\r\22\16\22\u0154\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0162\n\23\f\23"+
		"\16\23\u0165\13\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0179\n\25\3\25\3\25\3\25"+
		"\5\25\u017e\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0194\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u019b\n\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\7\30\u01a8\n\30\f\30\16\30\u01ab\13\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\5\31\u01b4\n\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u01c5\n\33\f\33\16\33\u01c8"+
		"\13\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u01d1\n\34\f\34\16\34\u01d4"+
		"\13\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u01e5\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u01f2\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u020b\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u0217\n\36\3\37\3\37\3\37\3\37\3\37\5\37\u021e\n\37\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \7 \u022b\n \f \16 \u022e\13 \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u023d\n!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0245"+
		"\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0255"+
		"\n\"\3#\3#\3#\3#\3#\5#\u025c\n#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\6$\u0283\n$\r$\16$\u0284\3$\3$\3$\3$\3$\5$\u028c\n$\3%\3%\3%\3%\3"+
		"%\3%\5%\u0294\n%\3%\3%\3%\3&\3&\3&\3&\3&\3&\5&\u029f\n&\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\7"+
		")\u02bb\n)\f)\16)\u02be\13)\3)\3)\3)\3*\3*\3*\3*\3*\5*\u02c8\n*\3*\3*"+
		"\3*\3*\3*\3+\3+\3+\3+\3+\3+\7+\u02d5\n+\f+\16+\u02d8\13+\3+\3+\3+\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u030a"+
		"\n,\3-\3-\3-\3-\3-\3-\3-\5-\u0313\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0329\n.\3.\2\2/\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\2\2\u0345\2\\\3"+
		"\2\2\2\4a\3\2\2\2\6\u0080\3\2\2\2\b\u0082\3\2\2\2\n\u009e\3\2\2\2\f\u00a0"+
		"\3\2\2\2\16\u00ac\3\2\2\2\20\u00e8\3\2\2\2\22\u00ea\3\2\2\2\24\u00fd\3"+
		"\2\2\2\26\u00ff\3\2\2\2\30\u0115\3\2\2\2\32\u0117\3\2\2\2\34\u0125\3\2"+
		"\2\2\36\u012e\3\2\2\2 \u014b\3\2\2\2\"\u014d\3\2\2\2$\u015b\3\2\2\2&\u0169"+
		"\3\2\2\2(\u0172\3\2\2\2*\u0193\3\2\2\2,\u0195\3\2\2\2.\u01a1\3\2\2\2\60"+
		"\u01af\3\2\2\2\62\u01b8\3\2\2\2\64\u01be\3\2\2\2\66\u01cc\3\2\2\28\u01e4"+
		"\3\2\2\2:\u0216\3\2\2\2<\u0218\3\2\2\2>\u0224\3\2\2\2@\u023c\3\2\2\2B"+
		"\u0254\3\2\2\2D\u0256\3\2\2\2F\u028b\3\2\2\2H\u028d\3\2\2\2J\u029e\3\2"+
		"\2\2L\u02a0\3\2\2\2N\u02a4\3\2\2\2P\u02af\3\2\2\2R\u02c2\3\2\2\2T\u02ce"+
		"\3\2\2\2V\u0309\3\2\2\2X\u0312\3\2\2\2Z\u0328\3\2\2\2\\]\b\2\1\2]^\5\4"+
		"\3\2^_\7\2\2\3_`\b\2\1\2`\3\3\2\2\2ab\b\3\1\2bf\b\3\1\2ce\5\6\4\2dc\3"+
		"\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\b\3\1\2jk\b"+
		"\3\1\2k\5\3\2\2\2lm\b\4\1\2mn\5\b\5\2no\b\4\1\2o\u0081\3\2\2\2pq\b\4\1"+
		"\2qr\5\n\6\2rs\b\4\1\2s\u0081\3\2\2\2tu\b\4\1\2uv\5\f\7\2vw\b\4\1\2w\u0081"+
		"\3\2\2\2xy\b\4\1\2yz\5&\24\2z{\b\4\1\2{\u0081\3\2\2\2|}\b\4\1\2}~\5(\25"+
		"\2~\177\b\4\1\2\177\u0081\3\2\2\2\u0080l\3\2\2\2\u0080p\3\2\2\2\u0080"+
		"t\3\2\2\2\u0080x\3\2\2\2\u0080|\3\2\2\2\u0081\7\3\2\2\2\u0082\u0083\b"+
		"\5\1\2\u0083\u0084\b\5\1\2\u0084\u0085\7\3\2\2\u0085\u0086\5X-\2\u0086"+
		"\u0087\b\5\1\2\u0087\t\3\2\2\2\u0088\u0089\b\6\1\2\u0089\u008a\b\6\1\2"+
		"\u008a\u008b\7\4\2\2\u008b\u008c\5X-\2\u008c\u008d\b\6\1\2\u008d\u009f"+
		"\3\2\2\2\u008e\u008f\b\6\1\2\u008f\u0090\b\6\1\2\u0090\u0091\7\4\2\2\u0091"+
		"\u0092\b\6\1\2\u0092\u0093\7\3\2\2\u0093\u0094\5X-\2\u0094\u0095\b\6\1"+
		"\2\u0095\u009f\3\2\2\2\u0096\u0097\b\6\1\2\u0097\u0098\b\6\1\2\u0098\u0099"+
		"\7\4\2\2\u0099\u009a\b\6\1\2\u009a\u009b\7\5\2\2\u009b\u009c\5X-\2\u009c"+
		"\u009d\b\6\1\2\u009d\u009f\3\2\2\2\u009e\u0088\3\2\2\2\u009e\u008e\3\2"+
		"\2\2\u009e\u0096\3\2\2\2\u009f\13\3\2\2\2\u00a0\u00a1\b\7\1\2\u00a1\u00a2"+
		"\b\7\1\2\u00a2\u00a3\7\7\2\2\u00a3\u00a4\5X-\2\u00a4\u00a6\b\7\1\2\u00a5"+
		"\u00a7\5\16\b\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3"+
		"\2\2\2\u00a8\u00a9\b\7\1\2\u00a9\u00aa\5\20\t\2\u00aa\u00ab\b\7\1\2\u00ab"+
		"\r\3\2\2\2\u00ac\u00ad\b\b\1\2\u00ad\u00ae\b\b\1\2\u00ae\u00af\7\16\2"+
		"\2\u00af\u00b1\b\b\1\2\u00b0\u00b2\5H%\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b6\b\b\1\2\u00b6\u00b7\b\b\1\2\u00b7\u00b8\7\17\2\2\u00b8\u00b9\b"+
		"\b\1\2\u00b9\17\3\2\2\2\u00ba\u00bb\b\t\1\2\u00bb\u00bf\b\t\1\2\u00bc"+
		"\u00bd\b\t\1\2\u00bd\u00be\7\24\2\2\u00be\u00c0\5\24\13\2\u00bf\u00bc"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\b\t\1\2\u00c4\u00c5\b\t\1\2\u00c5\u00e9\3\2"+
		"\2\2\u00c6\u00c7\b\t\1\2\u00c7\u00cb\b\t\1\2\u00c8\u00c9\b\t\1\2\u00c9"+
		"\u00ca\7\25\2\2\u00ca\u00cc\5\30\r\2\u00cb\u00c8\3\2\2\2\u00cc\u00cd\3"+
		"\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d0\b\t\1\2\u00d0\u00d1\b\t\1\2\u00d1\u00e9\3\2\2\2\u00d2\u00d3\b\t"+
		"\1\2\u00d3\u00d4\b\t\1\2\u00d4\u00d5\7\6\2\2\u00d5\u00d7\b\t\1\2\u00d6"+
		"\u00d8\5\22\n\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3"+
		"\2\2\2\u00d9\u00da\b\t\1\2\u00da\u00db\b\t\1\2\u00db\u00dc\7\n\2\2\u00dc"+
		"\u00de\b\t\1\2\u00dd\u00df\5\32\16\2\u00de\u00dd\3\2\2\2\u00de\u00df\3"+
		"\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\b\t\1\2\u00e1\u00e2\b\t\1\2\u00e2"+
		"\u00e3\7\13\2\2\u00e3\u00e4\b\t\1\2\u00e4\u00e5\7\26\2\2\u00e5\u00e6\5"+
		" \21\2\u00e6\u00e7\b\t\1\2\u00e7\u00e9\3\2\2\2\u00e8\u00ba\3\2\2\2\u00e8"+
		"\u00c6\3\2\2\2\u00e8\u00d2\3\2\2\2\u00e9\21\3\2\2\2\u00ea\u00eb\b\n\1"+
		"\2\u00eb\u00ec\7\35\2\2\u00ec\u00ed\7#\2\2\u00ed\u00ee\b\n\1\2\u00ee\u00ef"+
		"\b\n\1\2\u00ef\23\3\2\2\2\u00f0\u00f1\b\13\1\2\u00f1\u00f2\5X-\2\u00f2"+
		"\u00f4\b\13\1\2\u00f3\u00f5\5\26\f\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3"+
		"\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\b\13\1\2\u00f7\u00f8\b\13\1\2\u00f8"+
		"\u00fe\3\2\2\2\u00f9\u00fa\b\13\1\2\u00fa\u00fb\b\13\1\2\u00fb\u00fc\7"+
		"\27\2\2\u00fc\u00fe\b\13\1\2\u00fd\u00f0\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fe"+
		"\25\3\2\2\2\u00ff\u0100\b\f\1\2\u0100\u0101\b\f\1\2\u0101\u0102\7\n\2"+
		"\2\u0102\u0103\5$\23\2\u0103\u0104\b\f\1\2\u0104\u0105\7\13\2\2\u0105"+
		"\u0106\b\f\1\2\u0106\27\3\2\2\2\u0107\u0108\b\r\1\2\u0108\u0109\7\"\2"+
		"\2\u0109\u010a\b\r\1\2\u010a\u010b\7\23\2\2\u010b\u010c\5\34\17\2\u010c"+
		"\u010d\b\r\1\2\u010d\u0116\3\2\2\2\u010e\u010f\b\r\1\2\u010f\u0110\5\34"+
		"\17\2\u0110\u0111\b\r\1\2\u0111\u0112\7\23\2\2\u0112\u0113\5\34\17\2\u0113"+
		"\u0114\b\r\1\2\u0114\u0116\3\2\2\2\u0115\u0107\3\2\2\2\u0115\u010e\3\2"+
		"\2\2\u0116\31\3\2\2\2\u0117\u0118\b\16\1\2\u0118\u0119\b\16\1\2\u0119"+
		"\u011f\5\34\17\2\u011a\u011b\b\16\1\2\u011b\u011c\7\t\2\2\u011c\u011e"+
		"\5\34\17\2\u011d\u011a\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2"+
		"\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123"+
		"\b\16\1\2\u0123\u0124\b\16\1\2\u0124\33\3\2\2\2\u0125\u0126\b\17\1\2\u0126"+
		"\u0128\b\17\1\2\u0127\u0129\5\36\20\2\u0128\u0127\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\b\17\1\2\u012b\u012c\5 \21\2"+
		"\u012c\u012d\b\17\1\2\u012d\35\3\2\2\2\u012e\u012f\b\20\1\2\u012f\u0130"+
		"\b\20\1\2\u0130\u0131\7\30\2\2\u0131\u0133\b\20\1\2\u0132\u0134\5\34\17"+
		"\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\b\20\1\2\u0138\u0139\b\20\1\2"+
		"\u0139\u013a\7\31\2\2\u013a\u013b\b\20\1\2\u013b\u013c\7\32\2\2\u013c"+
		"\u013d\b\20\1\2\u013d\37\3\2\2\2\u013e\u013f\b\21\1\2\u013f\u0140\5X-"+
		"\2\u0140\u0142\b\21\1\2\u0141\u0143\5\"\22\2\u0142\u0141\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\b\21\1\2\u0145\u0146\b"+
		"\21\1\2\u0146\u014c\3\2\2\2\u0147\u0148\b\21\1\2\u0148\u0149\5H%\2\u0149"+
		"\u014a\b\21\1\2\u014a\u014c\3\2\2\2\u014b\u013e\3\2\2\2\u014b\u0147\3"+
		"\2\2\2\u014c!\3\2\2\2\u014d\u014e\b\22\1\2\u014e\u014f\b\22\1\2\u014f"+
		"\u0150\7\16\2\2\u0150\u0152\b\22\1\2\u0151\u0153\5 \21\2\u0152\u0151\3"+
		"\2\2\2\u0153\u0154\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0157\b\22\1\2\u0157\u0158\b\22\1\2\u0158\u0159\7"+
		"\17\2\2\u0159\u015a\b\22\1\2\u015a#\3\2\2\2\u015b\u015c\b\23\1\2\u015c"+
		"\u015d\5\34\17\2\u015d\u0163\b\23\1\2\u015e\u015f\b\23\1\2\u015f\u0160"+
		"\7\t\2\2\u0160\u0162\5$\23\2\u0161\u015e\3\2\2\2\u0162\u0165\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2"+
		"\2\2\u0166\u0167\b\23\1\2\u0167\u0168\b\23\1\2\u0168%\3\2\2\2\u0169\u016a"+
		"\b\24\1\2\u016a\u016b\b\24\1\2\u016b\u016c\7\33\2\2\u016c\u016d\5\66\34"+
		"\2\u016d\u016e\b\24\1\2\u016e\u016f\7\26\2\2\u016f\u0170\5\64\33\2\u0170"+
		"\u0171\b\24\1\2\u0171\'\3\2\2\2\u0172\u0173\b\25\1\2\u0173\u0174\b\25"+
		"\1\2\u0174\u0175\7\6\2\2\u0175\u0176\5*\26\2\u0176\u0178\b\25\1\2\u0177"+
		"\u0179\5\"\22\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\3"+
		"\2\2\2\u017a\u017b\b\25\1\2\u017b\u017d\b\25\1\2\u017c\u017e\5,\27\2\u017d"+
		"\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\b\25"+
		"\1\2\u0180\u0181\b\25\1\2\u0181\u0182\7\32\2\2\u0182\u0183\5\34\17\2\u0183"+
		"\u0184\b\25\1\2\u0184\u0185\7\26\2\2\u0185\u0186\5\64\33\2\u0186\u0187"+
		"\b\25\1\2\u0187)\3\2\2\2\u0188\u0189\b\26\1\2\u0189\u018a\7\35\2\2\u018a"+
		"\u018b\7#\2\2\u018b\u018c\5X-\2\u018c\u018d\b\26\1\2\u018d\u018e\b\26"+
		"\1\2\u018e\u0194\3\2\2\2\u018f\u0190\b\26\1\2\u0190\u0191\5X-\2\u0191"+
		"\u0192\b\26\1\2\u0192\u0194\3\2\2\2\u0193\u0188\3\2\2\2\u0193\u018f\3"+
		"\2\2\2\u0194+\3\2\2\2\u0195\u0196\b\27\1\2\u0196\u0197\b\27\1\2\u0197"+
		"\u0198\7\n\2\2\u0198\u019a\b\27\1\2\u0199\u019b\5.\30\2\u019a\u0199\3"+
		"\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\b\27\1\2\u019d"+
		"\u019e\b\27\1\2\u019e\u019f\7\13\2\2\u019f\u01a0\b\27\1\2\u01a0-\3\2\2"+
		"\2\u01a1\u01a2\b\30\1\2\u01a2\u01a3\b\30\1\2\u01a3\u01a9\5\60\31\2\u01a4"+
		"\u01a5\b\30\1\2\u01a5\u01a6\7\t\2\2\u01a6\u01a8\5\60\31\2\u01a7\u01a4"+
		"\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\b\30\1\2\u01ad\u01ae\b"+
		"\30\1\2\u01ae/\3\2\2\2\u01af\u01b0\b\31\1\2\u01b0\u01b1\7!\2\2\u01b1\u01b3"+
		"\b\31\1\2\u01b2\u01b4\5\62\32\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2\2"+
		"\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\b\31\1\2\u01b6\u01b7\b\31\1\2\u01b7"+
		"\61\3\2\2\2\u01b8\u01b9\b\32\1\2\u01b9\u01ba\b\32\1\2\u01ba\u01bb\7\23"+
		"\2\2\u01bb\u01bc\5\34\17\2\u01bc\u01bd\b\32\1\2\u01bd\63\3\2\2\2\u01be"+
		"\u01bf\b\33\1\2\u01bf\u01c0\b\33\1\2\u01c0\u01c6\5\66\34\2\u01c1\u01c2"+
		"\b\33\1\2\u01c2\u01c3\7\t\2\2\u01c3\u01c5\5\66\34\2\u01c4\u01c1\3\2\2"+
		"\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9"+
		"\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\b\33\1\2\u01ca\u01cb\b\33\1\2"+
		"\u01cb\65\3\2\2\2\u01cc\u01cd\b\34\1\2\u01cd\u01ce\5:\36\2\u01ce\u01d2"+
		"\b\34\1\2\u01cf\u01d1\58\35\2\u01d0\u01cf\3\2\2\2\u01d1\u01d4\3\2\2\2"+
		"\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01d2"+
		"\3\2\2\2\u01d5\u01d6\b\34\1\2\u01d6\u01d7\b\34\1\2\u01d7\67\3\2\2\2\u01d8"+
		"\u01d9\b\35\1\2\u01d9\u01da\6\35\2\3\u01da\u01db\5X-\2\u01db\u01dc\5\66"+
		"\34\2\u01dc\u01dd\6\35\3\3\u01dd\u01de\b\35\1\2\u01de\u01e5\3\2\2\2\u01df"+
		"\u01e0\b\35\1\2\u01e0\u01e1\6\35\4\3\u01e1\u01e2\5X-\2\u01e2\u01e3\b\35"+
		"\1\2\u01e3\u01e5\3\2\2\2\u01e4\u01d8\3\2\2\2\u01e4\u01df\3\2\2\2\u01e5"+
		"9\3\2\2\2\u01e6\u01e7\b\36\1\2\u01e7\u01e8\6\36\5\2\u01e8\u01e9\5X-\2"+
		"\u01e9\u01ea\5\66\34\2\u01ea\u01eb\b\36\1\2\u01eb\u0217\3\2\2\2\u01ec"+
		"\u01ed\b\36\1\2\u01ed\u01ee\6\36\6\2\u01ee\u01ef\5X-\2\u01ef\u01f1\b\36"+
		"\1\2\u01f0\u01f2\5<\37\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"\u01f3\3\2\2\2\u01f3\u01f4\b\36\1\2\u01f4\u01f5\b\36\1\2\u01f5\u0217\3"+
		"\2\2\2\u01f6\u01f7\b\36\1\2\u01f7\u01f8\5J&\2\u01f8\u01f9\b\36\1\2\u01f9"+
		"\u0217\3\2\2\2\u01fa\u01fb\b\36\1\2\u01fb\u01fc\5F$\2\u01fc\u01fd\b\36"+
		"\1\2\u01fd\u0217\3\2\2\2\u01fe\u01ff\b\36\1\2\u01ff\u0200\5H%\2\u0200"+
		"\u0201\b\36\1\2\u0201\u0217\3\2\2\2\u0202\u0203\b\36\1\2\u0203\u0204\5"+
		"R*\2\u0204\u0205\b\36\1\2\u0205\u0217\3\2\2\2\u0206\u0207\b\36\1\2\u0207"+
		"\u0208\7!\2\2\u0208\u020a\b\36\1\2\u0209\u020b\5D#\2\u020a\u0209\3\2\2"+
		"\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\b\36\1\2\u020d"+
		"\u0217\b\36\1\2\u020e\u020f\b\36\1\2\u020f\u0210\5N(\2\u0210\u0211\b\36"+
		"\1\2\u0211\u0217\3\2\2\2\u0212\u0213\b\36\1\2\u0213\u0214\5L\'\2\u0214"+
		"\u0215\b\36\1\2\u0215\u0217\3\2\2\2\u0216\u01e6\3\2\2\2\u0216\u01ec\3"+
		"\2\2\2\u0216\u01f6\3\2\2\2\u0216\u01fa\3\2\2\2\u0216\u01fe\3\2\2\2\u0216"+
		"\u0202\3\2\2\2\u0216\u0206\3\2\2\2\u0216\u020e\3\2\2\2\u0216\u0212\3\2"+
		"\2\2\u0217;\3\2\2\2\u0218\u0219\b\37\1\2\u0219\u021a\b\37\1\2\u021a\u021b"+
		"\7\n\2\2\u021b\u021d\b\37\1\2\u021c\u021e\5> \2\u021d\u021c\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\b\37\1\2\u0220\u0221\b"+
		"\37\1\2\u0221\u0222\7\13\2\2\u0222\u0223\b\37\1\2\u0223=\3\2\2\2\u0224"+
		"\u0225\b \1\2\u0225\u0226\b \1\2\u0226\u022c\5@!\2\u0227\u0228\b \1\2"+
		"\u0228\u0229\7\t\2\2\u0229\u022b\5@!\2\u022a\u0227\3\2\2\2\u022b\u022e"+
		"\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022f\3\2\2\2\u022e"+
		"\u022c\3\2\2\2\u022f\u0230\b \1\2\u0230\u0231\b \1\2\u0231?\3\2\2\2\u0232"+
		"\u0233\b!\1\2\u0233\u0234\b!\1\2\u0234\u0235\7\30\2\2\u0235\u0236\5B\""+
		"\2\u0236\u0237\b!\1\2\u0237\u023d\3\2\2\2\u0238\u0239\b!\1\2\u0239\u023a"+
		"\5\66\34\2\u023a\u023b\b!\1\2\u023b\u023d\3\2\2\2\u023c\u0232\3\2\2\2"+
		"\u023c\u0238\3\2\2\2\u023dA\3\2\2\2\u023e\u023f\b\"\1\2\u023f\u0240\b"+
		"\"\1\2\u0240\u0241\7 \2\2\u0241\u0242\b\"\1\2\u0242\u0244\b\"\1\2\u0243"+
		"\u0245\7\22\2\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\3"+
		"\2\2\2\u0246\u0247\b\"\1\2\u0247\u0248\b\"\1\2\u0248\u0249\5B\"\2\u0249"+
		"\u024a\b\"\1\2\u024a\u024b\b\"\1\2\u024b\u0255\3\2\2\2\u024c\u024d\b\""+
		"\1\2\u024d\u024e\b\"\1\2\u024e\u024f\7\31\2\2\u024f\u0250\b\"\1\2\u0250"+
		"\u0251\7\32\2\2\u0251\u0252\5\66\34\2\u0252\u0253\b\"\1\2\u0253\u0255"+
		"\3\2\2\2\u0254\u023e\3\2\2\2\u0254\u024c\3\2\2\2\u0255C\3\2\2\2\u0256"+
		"\u0257\b#\1\2\u0257\u0258\b#\1\2\u0258\u0259\7\n\2\2\u0259\u025b\b#\1"+
		"\2\u025a\u025c\5\64\33\2\u025b\u025a\3\2\2\2\u025b\u025c\3\2\2\2\u025c"+
		"\u025d\3\2\2\2\u025d\u025e\b#\1\2\u025e\u025f\b#\1\2\u025f\u0260\7\13"+
		"\2\2\u0260\u0261\b#\1\2\u0261E\3\2\2\2\u0262\u0263\b$\1\2\u0263\u0264"+
		"\b$\1\2\u0264\u0265\7\n\2\2\u0265\u0266\b$\1\2\u0266\u0267\7\13\2\2\u0267"+
		"\u028c\b$\1\2\u0268\u0269\b$\1\2\u0269\u026a\b$\1\2\u026a\u026b\7\n\2"+
		"\2\u026b\u026c\5\66\34\2\u026c\u026d\b$\1\2\u026d\u026e\7\13\2\2\u026e"+
		"\u026f\b$\1\2\u026f\u028c\3\2\2\2\u0270\u0271\b$\1\2\u0271\u0272\b$\1"+
		"\2\u0272\u0273\7\n\2\2\u0273\u0274\5\66\34\2\u0274\u0275\b$\1\2\u0275"+
		"\u0276\7\t\2\2\u0276\u0277\b$\1\2\u0277\u0278\7\13\2\2\u0278\u0279\b$"+
		"\1\2\u0279\u028c\3\2\2\2\u027a\u027b\b$\1\2\u027b\u027c\b$\1\2\u027c\u027d"+
		"\7\n\2\2\u027d\u027e\b$\1\2\u027e\u0282\5\66\34\2\u027f\u0280\b$\1\2\u0280"+
		"\u0281\7\t\2\2\u0281\u0283\5\66\34\2\u0282\u027f\3\2\2\2\u0283\u0284\3"+
		"\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286"+
		"\u0287\b$\1\2\u0287\u0288\b$\1\2\u0288\u0289\7\13\2\2\u0289\u028a\b$\1"+
		"\2\u028a\u028c\3\2\2\2\u028b\u0262\3\2\2\2\u028b\u0268\3\2\2\2\u028b\u0270"+
		"\3\2\2\2\u028b\u027a\3\2\2\2\u028cG\3\2\2\2\u028d\u028e\b%\1\2\u028e\u028f"+
		"\b%\1\2\u028f\u0290\7 \2\2\u0290\u0291\b%\1\2\u0291\u0293\b%\1\2\u0292"+
		"\u0294\7\22\2\2\u0293\u0292\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295\3"+
		"\2\2\2\u0295\u0296\b%\1\2\u0296\u0297\b%\1\2\u0297I\3\2\2\2\u0298\u0299"+
		"\b&\1\2\u0299\u029a\7\"\2\2\u029a\u029f\b&\1\2\u029b\u029c\b&\1\2\u029c"+
		"\u029d\7#\2\2\u029d\u029f\b&\1\2\u029e\u0298\3\2\2\2\u029e\u029b\3\2\2"+
		"\2\u029fK\3\2\2\2\u02a0\u02a1\b\'\1\2\u02a1\u02a2\7\36\2\2\u02a2\u02a3"+
		"\b\'\1\2\u02a3M\3\2\2\2\u02a4\u02a5\b(\1\2\u02a5\u02a6\b(\1\2\u02a6\u02a7"+
		"\7\b\2\2\u02a7\u02a8\b(\1\2\u02a8\u02a9\7\n\2\2\u02a9\u02aa\5\64\33\2"+
		"\u02aa\u02ab\b(\1\2\u02ab\u02ac\7\13\2\2\u02ac\u02ad\5P)\2\u02ad\u02ae"+
		"\b(\1\2\u02aeO\3\2\2\2\u02af\u02b0\b)\1\2\u02b0\u02b1\b)\1\2\u02b1\u02b2"+
		"\7\24\2\2\u02b2\u02b3\5\66\34\2\u02b3\u02b4\b)\1\2\u02b4\u02b5\7\26\2"+
		"\2\u02b5\u02b6\5\66\34\2\u02b6\u02bc\b)\1\2\u02b7\u02b8\b)\1\2\u02b8\u02b9"+
		"\7\t\2\2\u02b9\u02bb\5P)\2\u02ba\u02b7\3\2\2\2\u02bb\u02be\3\2\2\2\u02bc"+
		"\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02bf\3\2\2\2\u02be\u02bc\3\2"+
		"\2\2\u02bf\u02c0\b)\1\2\u02c0\u02c1\b)\1\2\u02c1Q\3\2\2\2\u02c2\u02c3"+
		"\b*\1\2\u02c3\u02c4\b*\1\2\u02c4\u02c5\7\f\2\2\u02c5\u02c7\b*\1\2\u02c6"+
		"\u02c8\5T+\2\u02c7\u02c6\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\3\2\2"+
		"\2\u02c9\u02ca\b*\1\2\u02ca\u02cb\b*\1\2\u02cb\u02cc\7\r\2\2\u02cc\u02cd"+
		"\b*\1\2\u02cdS\3\2\2\2\u02ce\u02cf\b+\1\2\u02cf\u02d0\b+\1\2\u02d0\u02d6"+
		"\5V,\2\u02d1\u02d2\b+\1\2\u02d2\u02d3\7\t\2\2\u02d3\u02d5\5V,\2\u02d4"+
		"\u02d1\3\2\2\2\u02d5\u02d8\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d7\3\2"+
		"\2\2\u02d7\u02d9\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d9\u02da\b+\1\2\u02da"+
		"\u02db\b+\1\2\u02dbU\3\2\2\2\u02dc\u02dd\b,\1\2\u02dd\u02de\7!\2\2\u02de"+
		"\u030a\b,\1\2\u02df\u02e0\b,\1\2\u02e0\u02e1\b,\1\2\u02e1\u02e2\7\34\2"+
		"\2\u02e2\u02e3\7!\2\2\u02e3\u030a\b,\1\2\u02e4\u02e5\b,\1\2\u02e5\u02e6"+
		"\7!\2\2\u02e6\u02e7\b,\1\2\u02e7\u02e8\7\23\2\2\u02e8\u02e9\5\66\34\2"+
		"\u02e9\u02ea\b,\1\2\u02ea\u030a\3\2\2\2\u02eb\u02ec\b,\1\2\u02ec\u02ed"+
		"\7 \2\2\u02ed\u030a\b,\1\2\u02ee\u02ef\b,\1\2\u02ef\u02f0\b,\1\2\u02f0"+
		"\u02f1\7\34\2\2\u02f1\u02f2\7 \2\2\u02f2\u030a\b,\1\2\u02f3\u02f4\b,\1"+
		"\2\u02f4\u02f5\7 \2\2\u02f5\u02f6\b,\1\2\u02f6\u02f7\7\23\2\2\u02f7\u02f8"+
		"\5\66\34\2\u02f8\u02f9\b,\1\2\u02f9\u030a\3\2\2\2\u02fa\u02fb\b,\1\2\u02fb"+
		"\u02fc\7\"\2\2\u02fc\u030a\b,\1\2\u02fd\u02fe\b,\1\2\u02fe\u02ff\b,\1"+
		"\2\u02ff\u0300\7\34\2\2\u0300\u0301\7\"\2\2\u0301\u030a\b,\1\2\u0302\u0303"+
		"\b,\1\2\u0303\u0304\7\"\2\2\u0304\u0305\b,\1\2\u0305\u0306\7\23\2\2\u0306"+
		"\u0307\5\66\34\2\u0307\u0308\b,\1\2\u0308\u030a\3\2\2\2\u0309\u02dc\3"+
		"\2\2\2\u0309\u02df\3\2\2\2\u0309\u02e4\3\2\2\2\u0309\u02eb\3\2\2\2\u0309"+
		"\u02ee\3\2\2\2\u0309\u02f3\3\2\2\2\u0309\u02fa\3\2\2\2\u0309\u02fd\3\2"+
		"\2\2\u0309\u0302\3\2\2\2\u030aW\3\2\2\2\u030b\u030c\b-\1\2\u030c\u030d"+
		"\7\37\2\2\u030d\u0313\b-\1\2\u030e\u030f\b-\1\2\u030f\u0310\5Z.\2\u0310"+
		"\u0311\b-\1\2\u0311\u0313\3\2\2\2\u0312\u030b\3\2\2\2\u0312\u030e\3\2"+
		"\2\2\u0313Y\3\2\2\2\u0314\u0315\b.\1\2\u0315\u0316\b.\1\2\u0316\u0317"+
		"\7\23\2\2\u0317\u0329\b.\1\2\u0318\u0319\b.\1\2\u0319\u031a\b.\1\2\u031a"+
		"\u031b\7\16\2\2\u031b\u0329\b.\1\2\u031c\u031d\b.\1\2\u031d\u031e\b.\1"+
		"\2\u031e\u031f\7\17\2\2\u031f\u0329\b.\1\2\u0320\u0321\b.\1\2\u0321\u0322"+
		"\b.\1\2\u0322\u0323\7\24\2\2\u0323\u0329\b.\1\2\u0324\u0325\b.\1\2\u0325"+
		"\u0326\b.\1\2\u0326\u0327\7\25\2\2\u0327\u0329\b.\1\2\u0328\u0314\3\2"+
		"\2\2\u0328\u0318\3\2\2\2\u0328\u031c\3\2\2\2\u0328\u0320\3\2\2\2\u0328"+
		"\u0324\3\2\2\2\u0329[\3\2\2\2\62f\u0080\u009e\u00a6\u00b3\u00c1\u00cd"+
		"\u00d7\u00de\u00e8\u00f4\u00fd\u0115\u011f\u0128\u0135\u0142\u014b\u0154"+
		"\u0163\u0178\u017d\u0193\u019a\u01a9\u01b3\u01c6\u01d2\u01e4\u01f1\u020a"+
		"\u0216\u021d\u022c\u023c\u0244\u0254\u025b\u0284\u028b\u0293\u029e\u02bc"+
		"\u02c7\u02d6\u0309\u0312\u0328";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}